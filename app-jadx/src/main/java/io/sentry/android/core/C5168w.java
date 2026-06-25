package io.sentry.android.core;

import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.C5248p1;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.util.AbstractC5296i;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: io.sentry.android.core.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5168w implements io.sentry.W {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ILogger f50053h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f50046a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f50047b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f50048c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f50049d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f50050e = 1000000000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f50051f = 1.0E9d / 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final File f50052g = new File("/proc/self/stat");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f50054i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Pattern f50055j = Pattern.compile("[\n\t\r ]");

    public C5168w(ILogger iLogger) {
        this.f50053h = (ILogger) io.sentry.util.w.c(iLogger, "Logger is required.");
    }

    private long e() {
        String strC;
        try {
            strC = AbstractC5296i.c(this.f50052g);
        } catch (IOException e10) {
            this.f50054i = false;
            this.f50053h.b(EnumC5215i3.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e10);
            strC = null;
        }
        if (strC != null) {
            String[] strArrSplit = this.f50055j.split(strC.trim());
            try {
                long j10 = Long.parseLong(strArrSplit[13]);
                long j11 = Long.parseLong(strArrSplit[14]);
                return (long) ((j10 + j11 + Long.parseLong(strArrSplit[15]) + Long.parseLong(strArrSplit[16])) * this.f50051f);
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e11) {
                this.f50053h.b(EnumC5215i3.ERROR, "Error parsing /proc/self/stat file.", e11);
            }
        }
        return 0L;
    }

    @Override // io.sentry.W
    public void c() {
        this.f50054i = true;
        this.f50048c = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.f50049d = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.f50051f = 1.0E9d / this.f50048c;
        this.f50047b = e();
    }

    @Override // io.sentry.W
    public void d(C5248p1 c5248p1) {
        if (this.f50054i) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j10 = jElapsedRealtimeNanos - this.f50046a;
            this.f50046a = jElapsedRealtimeNanos;
            long jE = e();
            long j11 = jE - this.f50047b;
            this.f50047b = jE;
            c5248p1.e(Double.valueOf(((j11 / j10) / this.f50049d) * 100.0d));
        }
    }
}
