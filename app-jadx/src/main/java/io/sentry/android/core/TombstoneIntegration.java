package io.sentry.android.core;

import android.app.ApplicationExitInfo;
import android.content.Context;
import io.sentry.AbstractC5226l;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5114a0;
import io.sentry.InterfaceC5187d0;
import io.sentry.InterfaceC5247p0;
import io.sentry.V2;
import io.sentry.android.core.RunnableC5129f0;
import java.io.Closeable;
import java.io.InputStream;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class TombstoneIntegration implements InterfaceC5247p0, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f49630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.transport.o f49631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SentryAndroidOptions f49632c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b implements RunnableC5129f0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SentryAndroidOptions f49635a;

        public b(SentryAndroidOptions sentryAndroidOptions) {
            this.f49635a = sentryAndroidOptions;
        }

        @Override // io.sentry.android.core.RunnableC5129f0.a
        public Long a() {
            return io.sentry.android.core.cache.f.a0(this.f49635a);
        }

        @Override // io.sentry.android.core.RunnableC5129f0.a
        public String b() {
            return "Tombstone";
        }

        @Override // io.sentry.android.core.RunnableC5129f0.a
        public boolean c() {
            return this.f49635a.isReportHistoricalTombstones();
        }

        @Override // io.sentry.android.core.RunnableC5129f0.a
        public RunnableC5129f0.b d(ApplicationExitInfo applicationExitInfo, boolean z10) {
            try {
                InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                if (traceInputStream == null) {
                    this.f49635a.getLogger().c(EnumC5215i3.WARNING, "No tombstone InputStream available for ApplicationExitInfo from %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())));
                    return null;
                }
                io.sentry.android.core.internal.tombstone.a aVar = new io.sentry.android.core.internal.tombstone.a(traceInputStream);
                try {
                    V2 v2L = aVar.l();
                    aVar.close();
                    long timestamp = applicationExitInfo.getTimestamp();
                    v2L.G0(AbstractC5226l.e(timestamp));
                    a aVar2 = new a(this.f49635a.getFlushTimeoutMillis(), this.f49635a.getLogger(), timestamp, z10);
                    return new RunnableC5129f0.b(v2L, io.sentry.util.l.c(aVar2), aVar2);
                } finally {
                }
            } catch (Throwable th2) {
                this.f49635a.getLogger().c(EnumC5215i3.WARNING, "Failed to parse tombstone from %s: %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())), th2.getMessage());
                return null;
            }
        }

        @Override // io.sentry.android.core.RunnableC5129f0.a
        public int e() {
            return 5;
        }
    }

    public TombstoneIntegration(Context context) {
        this(context, io.sentry.transport.m.a());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f49632c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(EnumC5215i3.DEBUG, "TombstoneIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC5247p0
    public void g(InterfaceC5114a0 interfaceC5114a0, C5322z3 c5322z3) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.w.c(c5322z3 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c5322z3 : null, "SentryAndroidOptions is required");
        this.f49632c = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().c(EnumC5215i3.DEBUG, "TombstoneIntegration enabled: %s", Boolean.valueOf(this.f49632c.isTombstoneEnabled()));
        if (this.f49632c.isTombstoneEnabled()) {
            if (this.f49632c.getCacheDirPath() == null) {
                this.f49632c.getLogger().c(EnumC5215i3.INFO, "Cache dir is not set, unable to process Tombstones", new Object[0]);
                return;
            }
            try {
                InterfaceC5187d0 executorService = c5322z3.getExecutorService();
                Context context = this.f49630a;
                SentryAndroidOptions sentryAndroidOptions2 = this.f49632c;
                executorService.submit(new RunnableC5129f0(context, interfaceC5114a0, sentryAndroidOptions2, this.f49631b, new b(sentryAndroidOptions2)));
            } catch (Throwable th2) {
                c5322z3.getLogger().b(EnumC5215i3.DEBUG, "Failed to start tombstone processor.", th2);
            }
            c5322z3.getLogger().c(EnumC5215i3.DEBUG, "TombstoneIntegration installed.", new Object[0]);
            io.sentry.util.n.a("Tombstone");
        }
    }

    TombstoneIntegration(Context context, io.sentry.transport.o oVar) {
        this.f49630a = AbstractC5156p0.g(context);
        this.f49631b = oVar;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends io.sentry.hints.d implements io.sentry.hints.c, io.sentry.hints.j {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f49633d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f49634e;

        public a(long j10, ILogger iLogger, long j11, boolean z10) {
            super(j10, iLogger);
            this.f49633d = j11;
            this.f49634e = z10;
        }

        @Override // io.sentry.hints.j
        public Long a() {
            return Long.valueOf(this.f49633d);
        }

        @Override // io.sentry.hints.c
        public boolean b() {
            return this.f49634e;
        }

        @Override // io.sentry.hints.f
        public boolean c(io.sentry.protocol.x xVar) {
            return true;
        }

        @Override // io.sentry.hints.f
        public void d(io.sentry.protocol.x xVar) {
        }
    }
}
