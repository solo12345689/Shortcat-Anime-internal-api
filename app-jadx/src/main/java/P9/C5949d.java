package p9;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* JADX INFO: renamed from: p9.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C5949d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f55833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f55834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TimeInterpolator f55835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f55836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f55837e;

    public C5949d(long j10, long j11) {
        this.f55835c = null;
        this.f55836d = 0;
        this.f55837e = 1;
        this.f55833a = j10;
        this.f55834b = j11;
    }

    static C5949d a(ValueAnimator valueAnimator) {
        C5949d c5949d = new C5949d(valueAnimator.getStartDelay(), valueAnimator.getDuration(), valueAnimator.getInterpolator());
        c5949d.f55836d = valueAnimator.getRepeatCount();
        c5949d.f55837e = valueAnimator.getRepeatMode();
        return c5949d;
    }

    public long b() {
        return this.f55833a;
    }

    public long c() {
        return this.f55834b;
    }

    public TimeInterpolator d() {
        TimeInterpolator timeInterpolator = this.f55835c;
        return timeInterpolator != null ? timeInterpolator : AbstractC5946a.f55827b;
    }

    public int e() {
        return this.f55836d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5949d)) {
            return false;
        }
        C5949d c5949d = (C5949d) obj;
        if (b() == c5949d.b() && c() == c5949d.c() && e() == c5949d.e() && f() == c5949d.f()) {
            return d().getClass().equals(c5949d.d().getClass());
        }
        return false;
    }

    public int f() {
        return this.f55837e;
    }

    public int hashCode() {
        return (((((((((int) (b() ^ (b() >>> 32))) * 31) + ((int) (c() ^ (c() >>> 32)))) * 31) + d().getClass().hashCode()) * 31) + e()) * 31) + f();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + b() + " duration: " + c() + " interpolator: " + d().getClass() + " repeatCount: " + e() + " repeatMode: " + f() + "}\n";
    }

    public C5949d(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f55836d = 0;
        this.f55837e = 1;
        this.f55833a = j10;
        this.f55834b = j11;
        this.f55835c = timeInterpolator;
    }
}
