package o5;

import android.os.SystemClock;

/* JADX INFO: renamed from: o5.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5830g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f54539a = 1.0d / Math.pow(10.0d, 6.0d);

    public static double a(long j10) {
        return (b() - j10) * f54539a;
    }

    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
