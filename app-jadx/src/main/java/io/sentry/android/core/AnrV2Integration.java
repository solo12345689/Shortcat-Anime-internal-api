package io.sentry.android.core;

import android.app.ApplicationExitInfo;
import android.content.Context;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import io.sentry.AbstractC5226l;
import io.sentry.C5176b;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5114a0;
import io.sentry.InterfaceC5187d0;
import io.sentry.InterfaceC5247p0;
import io.sentry.V2;
import io.sentry.android.core.RunnableC5129f0;
import io.sentry.protocol.C5254d;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class AnrV2Integration implements InterfaceC5247p0, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f49451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.transport.o f49452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SentryAndroidOptions f49453c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements RunnableC5129f0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SentryAndroidOptions f49457a;

        b(SentryAndroidOptions sentryAndroidOptions) {
            this.f49457a = sentryAndroidOptions;
        }

        private byte[] f(InputStream inputStream) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
                while (true) {
                    int i10 = inputStream.read(bArr, 0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
                    if (i10 == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                }
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        private c g(ApplicationExitInfo applicationExitInfo, boolean z10) {
            try {
                InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                try {
                    if (traceInputStream == null) {
                        c cVar = new c(c.a.NO_DUMP);
                        if (traceInputStream == null) {
                            return cVar;
                        }
                        traceInputStream.close();
                        return cVar;
                    }
                    byte[] bArrF = f(traceInputStream);
                    traceInputStream.close();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArrF)));
                        try {
                            io.sentry.android.core.internal.threaddump.b bVarC = io.sentry.android.core.internal.threaddump.b.c(bufferedReader);
                            io.sentry.android.core.internal.threaddump.c cVar2 = new io.sentry.android.core.internal.threaddump.c(this.f49457a, z10);
                            cVar2.h(bVarC);
                            List listE = cVar2.e();
                            List listB = cVar2.b();
                            if (listE.isEmpty()) {
                                c cVar3 = new c(c.a.NO_DUMP);
                                bufferedReader.close();
                                return cVar3;
                            }
                            c cVar4 = new c(c.a.DUMP, bArrF, listE, listB);
                            bufferedReader.close();
                            return cVar4;
                        } finally {
                        }
                    } catch (Throwable th2) {
                        this.f49457a.getLogger().b(EnumC5215i3.WARNING, "Failed to parse ANR thread dump", th2);
                        return new c(c.a.ERROR, bArrF);
                    }
                } finally {
                }
            } catch (Throwable th3) {
                this.f49457a.getLogger().b(EnumC5215i3.WARNING, "Failed to read ANR thread dump", th3);
                return new c(c.a.NO_DUMP);
            }
        }

        @Override // io.sentry.android.core.RunnableC5129f0.a
        public Long a() {
            return io.sentry.android.core.cache.f.X(this.f49457a);
        }

        @Override // io.sentry.android.core.RunnableC5129f0.a
        public String b() {
            return "ANR";
        }

        @Override // io.sentry.android.core.RunnableC5129f0.a
        public boolean c() {
            return this.f49457a.isReportHistoricalAnrs();
        }

        @Override // io.sentry.android.core.RunnableC5129f0.a
        public RunnableC5129f0.b d(ApplicationExitInfo applicationExitInfo, boolean z10) {
            byte[] bArr;
            long timestamp = applicationExitInfo.getTimestamp();
            boolean z11 = applicationExitInfo.getImportance() != 100;
            c cVarG = g(applicationExitInfo, z11);
            if (cVarG.f49458a == c.a.NO_DUMP) {
                this.f49457a.getLogger().c(EnumC5215i3.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
                return null;
            }
            a aVar = new a(this.f49457a.getFlushTimeoutMillis(), this.f49457a.getLogger(), timestamp, z10, z11);
            io.sentry.H hC = io.sentry.util.l.c(aVar);
            V2 v22 = new V2();
            c.a aVar2 = cVarG.f49458a;
            if (aVar2 == c.a.ERROR) {
                io.sentry.protocol.m mVar = new io.sentry.protocol.m();
                mVar.f("Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.");
                v22.D0(mVar);
            } else if (aVar2 == c.a.DUMP) {
                v22.F0(cVarG.f49460c);
                if (cVarG.f49461d != null) {
                    C5254d c5254d = new C5254d();
                    c5254d.e(cVarG.f49461d);
                    v22.T(c5254d);
                }
            }
            v22.C0(EnumC5215i3.FATAL);
            v22.G0(AbstractC5226l.e(timestamp));
            if (this.f49457a.isAttachAnrThreadDump() && (bArr = cVarG.f49459b) != null) {
                hC.n(C5176b.b(bArr));
            }
            return new RunnableC5129f0.b(v22, hC, aVar);
        }

        @Override // io.sentry.android.core.RunnableC5129f0.a
        public int e() {
            return 6;
        }
    }

    public AnrV2Integration(Context context) {
        this(context, io.sentry.transport.m.a());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f49453c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(EnumC5215i3.DEBUG, "AnrV2Integration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC5247p0
    public void g(InterfaceC5114a0 interfaceC5114a0, C5322z3 c5322z3) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.w.c(c5322z3 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c5322z3 : null, "SentryAndroidOptions is required");
        this.f49453c = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().c(EnumC5215i3.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(this.f49453c.isAnrEnabled()));
        if (this.f49453c.getCacheDirPath() == null) {
            this.f49453c.getLogger().c(EnumC5215i3.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
            return;
        }
        if (this.f49453c.isAnrEnabled()) {
            try {
                InterfaceC5187d0 executorService = c5322z3.getExecutorService();
                Context context = this.f49451a;
                SentryAndroidOptions sentryAndroidOptions2 = this.f49453c;
                executorService.submit(new RunnableC5129f0(context, interfaceC5114a0, sentryAndroidOptions2, this.f49452b, new b(sentryAndroidOptions2)));
            } catch (Throwable th2) {
                c5322z3.getLogger().b(EnumC5215i3.DEBUG, "Failed to start ANR processor.", th2);
            }
            c5322z3.getLogger().c(EnumC5215i3.DEBUG, "AnrV2Integration installed.", new Object[0]);
            io.sentry.util.n.a("AnrV2");
        }
    }

    AnrV2Integration(Context context, io.sentry.transport.o oVar) {
        this.f49451a = AbstractC5156p0.g(context);
        this.f49452b = oVar;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a f49458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final byte[] f49459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final List f49460c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final List f49461d;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        enum a {
            DUMP,
            NO_DUMP,
            ERROR
        }

        c(a aVar) {
            this.f49458a = aVar;
            this.f49459b = null;
            this.f49460c = null;
            this.f49461d = null;
        }

        c(a aVar, byte[] bArr) {
            this.f49458a = aVar;
            this.f49459b = bArr;
            this.f49460c = null;
            this.f49461d = null;
        }

        c(a aVar, byte[] bArr, List list, List list2) {
            this.f49458a = aVar;
            this.f49459b = bArr;
            this.f49460c = list;
            this.f49461d = list2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends io.sentry.hints.d implements io.sentry.hints.c, io.sentry.hints.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f49454d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f49455e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f49456f;

        public a(long j10, ILogger iLogger, long j11, boolean z10, boolean z11) {
            super(j10, iLogger);
            this.f49454d = j11;
            this.f49455e = z10;
            this.f49456f = z11;
        }

        @Override // io.sentry.hints.a
        public Long a() {
            return Long.valueOf(this.f49454d);
        }

        @Override // io.sentry.hints.c
        public boolean b() {
            return this.f49455e;
        }

        @Override // io.sentry.hints.f
        public boolean c(io.sentry.protocol.x xVar) {
            return true;
        }

        @Override // io.sentry.hints.a
        public boolean f() {
            return false;
        }

        @Override // io.sentry.hints.a
        public String h() {
            return this.f49456f ? "anr_background" : "anr_foreground";
        }

        @Override // io.sentry.hints.f
        public void d(io.sentry.protocol.x xVar) {
        }
    }
}
