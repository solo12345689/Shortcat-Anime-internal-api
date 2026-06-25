package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.AbstractC2747a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f29166r = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final View f29169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f29170d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f29173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f29174h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f29178l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f29179m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f29180n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f29181o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f29182p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f29183q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C0500a f29167a = new C0500a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Interpolator f29168b = new AccelerateInterpolator();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f29171e = {0.0f, 0.0f};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f29172f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float[] f29175i = {0.0f, 0.0f};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float[] f29176j = {0.0f, 0.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float[] f29177k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class C0500a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f29184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f29185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f29186c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f29187d;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f29193j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f29194k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f29188e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f29192i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f29189f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f29190g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f29191h = 0;

        C0500a() {
        }

        private float e(long j10) {
            if (j10 < this.f29188e) {
                return 0.0f;
            }
            long j11 = this.f29192i;
            if (j11 < 0 || j10 < j11) {
                return a.e((j10 - r0) / this.f29184a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f29193j;
            return (1.0f - f10) + (f10 * a.e((j10 - j11) / this.f29194k, 0.0f, 1.0f));
        }

        private float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        public void a() {
            if (this.f29189f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j10 = jCurrentAnimationTimeMillis - this.f29189f;
            this.f29189f = jCurrentAnimationTimeMillis;
            float f10 = j10 * fG;
            this.f29190g = (int) (this.f29186c * f10);
            this.f29191h = (int) (f10 * this.f29187d);
        }

        public int b() {
            return this.f29190g;
        }

        public int c() {
            return this.f29191h;
        }

        public int d() {
            float f10 = this.f29186c;
            return (int) (f10 / Math.abs(f10));
        }

        public int f() {
            float f10 = this.f29187d;
            return (int) (f10 / Math.abs(f10));
        }

        public boolean h() {
            return this.f29192i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f29192i + ((long) this.f29194k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f29194k = a.f((int) (jCurrentAnimationTimeMillis - this.f29188e), 0, this.f29185b);
            this.f29193j = e(jCurrentAnimationTimeMillis);
            this.f29192i = jCurrentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f29185b = i10;
        }

        public void k(int i10) {
            this.f29184a = i10;
        }

        public void l(float f10, float f11) {
            this.f29186c = f10;
            this.f29187d = f11;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f29188e = jCurrentAnimationTimeMillis;
            this.f29192i = -1L;
            this.f29189f = jCurrentAnimationTimeMillis;
            this.f29193j = 0.5f;
            this.f29190g = 0;
            this.f29191h = 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f29181o) {
                if (aVar.f29179m) {
                    aVar.f29179m = false;
                    aVar.f29167a.m();
                }
                C0500a c0500a = a.this.f29167a;
                if (c0500a.h() || !a.this.u()) {
                    a.this.f29181o = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f29180n) {
                    aVar2.f29180n = false;
                    aVar2.c();
                }
                c0500a.a();
                a.this.j(c0500a.b(), c0500a.c());
                AbstractC2747a0.c0(a.this.f29169c, this);
            }
        }
    }

    public a(View view) {
        this.f29169c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f29166r);
        r(500);
        q(500);
    }

    private float d(int i10, float f10, float f11, float f12) {
        float fH = h(this.f29171e[i10], f11, this.f29172f[i10], f10);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f29175i[i10];
        float f14 = this.f29176j[i10];
        float f15 = this.f29177k[i10];
        float f16 = f13 * f12;
        return fH > 0.0f ? e(fH * f16, f14, f15) : -e((-fH) * f16, f14, f15);
    }

    static float e(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    static int f(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    private float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f29173g;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f29181o && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    private float h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float fE = e(f10 * f11, 0.0f, f12);
        float fG = g(f11 - f13, fE) - g(f13, fE);
        if (fG < 0.0f) {
            interpolation = -this.f29168b.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f29168b.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f29179m) {
            this.f29181o = false;
        } else {
            this.f29167a.i();
        }
    }

    private void v() {
        int i10;
        if (this.f29170d == null) {
            this.f29170d = new b();
        }
        this.f29181o = true;
        this.f29179m = true;
        if (this.f29178l || (i10 = this.f29174h) <= 0) {
            this.f29170d.run();
        } else {
            AbstractC2747a0.d0(this.f29169c, this.f29170d, i10);
        }
        this.f29178l = true;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f29169c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public abstract void j(int i10, int i11);

    public a k(int i10) {
        this.f29174h = i10;
        return this;
    }

    public a l(int i10) {
        this.f29173g = i10;
        return this;
    }

    public a m(boolean z10) {
        if (this.f29182p && !z10) {
            i();
        }
        this.f29182p = z10;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.f29172f;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.f29177k;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f29182p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.i()
            goto L58
        L1a:
            r5.f29180n = r2
            r5.f29178l = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f29169c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f29169c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f29167a
            r7.l(r0, r6)
            boolean r6 = r5.f29181o
            if (r6 != 0) goto L58
            boolean r6 = r5.u()
            if (r6 == 0) goto L58
            r5.v()
        L58:
            boolean r6 = r5.f29183q
            if (r6 == 0) goto L61
            boolean r6 = r5.f29181o
            if (r6 == 0) goto L61
            return r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f10, float f11) {
        float[] fArr = this.f29176j;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f29167a.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f29167a.k(i10);
        return this;
    }

    public a s(float f10, float f11) {
        float[] fArr = this.f29171e;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.f29175i;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    boolean u() {
        C0500a c0500a = this.f29167a;
        int iF = c0500a.f();
        int iD = c0500a.d();
        if (iF == 0 || !b(iF)) {
            return iD != 0 && a(iD);
        }
        return true;
    }
}
