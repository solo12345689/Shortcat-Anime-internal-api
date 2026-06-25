package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F f40134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f40135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f40136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f40137d;

    C(F f10) {
        A.c(f10, "ticker");
        this.f40134a = f10;
    }

    public static C b(F f10) {
        C c10 = new C(f10);
        c10.e();
        return c10;
    }

    public static C c(F f10) {
        return new C(f10);
    }

    private final long h() {
        return this.f40135b ? (this.f40134a.a() - this.f40137d) + this.f40136c : this.f40136c;
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(h(), TimeUnit.NANOSECONDS);
    }

    public final C d() {
        this.f40136c = 0L;
        this.f40135b = false;
        return this;
    }

    public final C e() {
        A.e(!this.f40135b, "This stopwatch is already running.");
        this.f40135b = true;
        this.f40137d = this.f40134a.a();
        return this;
    }

    public final C f() {
        long jA = this.f40134a.a();
        A.e(this.f40135b, "This stopwatch is already stopped.");
        this.f40135b = false;
        this.f40136c += jA - this.f40137d;
        return this;
    }

    public final boolean g() {
        return this.f40135b;
    }

    public final String toString() {
        String str;
        long jH = h();
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(jH, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(jH, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(jH, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(jH, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(jH, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(jH, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jH / timeUnit2.convert(1L, timeUnit)));
        switch (B.f40132a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return str2 + " " + str;
    }
}
