package androidx.swiperefreshlayout.widget;

import K1.f;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import h2.C4897b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b extends Drawable implements Animatable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Interpolator f32230g = new LinearInterpolator();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Interpolator f32231h = new C4897b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f32232i = {-16777216};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f32233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f32234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Resources f32235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Animator f32236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f32237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f32238f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f32239a;

        a(c cVar) {
            this.f32239a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.n(fFloatValue, this.f32239a);
            b.this.b(fFloatValue, this.f32239a, false);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final RectF f32243a = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Paint f32244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Paint f32245c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Paint f32246d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f32247e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f32248f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f32249g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float f32250h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int[] f32251i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f32252j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f32253k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f32254l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f32255m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f32256n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Path f32257o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f32258p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        float f32259q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f32260r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f32261s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f32262t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f32263u;

        c() {
            Paint paint = new Paint();
            this.f32244b = paint;
            Paint paint2 = new Paint();
            this.f32245c = paint2;
            Paint paint3 = new Paint();
            this.f32246d = paint3;
            this.f32247e = 0.0f;
            this.f32248f = 0.0f;
            this.f32249g = 0.0f;
            this.f32250h = 5.0f;
            this.f32258p = 1.0f;
            this.f32262t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        void A() {
            this.f32253k = this.f32247e;
            this.f32254l = this.f32248f;
            this.f32255m = this.f32249g;
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f32243a;
            float f10 = this.f32259q;
            float fMin = (this.f32250h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f32260r * this.f32258p) / 2.0f, this.f32250h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f11 = this.f32247e;
            float f12 = this.f32249g;
            float f13 = (f11 + f12) * 360.0f;
            float f14 = ((this.f32248f + f12) * 360.0f) - f13;
            this.f32244b.setColor(this.f32263u);
            this.f32244b.setAlpha(this.f32262t);
            float f15 = this.f32250h / 2.0f;
            rectF.inset(f15, f15);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f32246d);
            float f16 = -f15;
            rectF.inset(f16, f16);
            canvas.drawArc(rectF, f13, f14, false, this.f32244b);
            b(canvas, f13, f14, rectF);
        }

        void b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f32256n) {
                Path path = this.f32257o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f32257o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f12 = (this.f32260r * this.f32258p) / 2.0f;
                this.f32257o.moveTo(0.0f, 0.0f);
                this.f32257o.lineTo(this.f32260r * this.f32258p, 0.0f);
                Path path3 = this.f32257o;
                float f13 = this.f32260r;
                float f14 = this.f32258p;
                path3.lineTo((f13 * f14) / 2.0f, this.f32261s * f14);
                this.f32257o.offset((fMin + rectF.centerX()) - f12, rectF.centerY() + (this.f32250h / 2.0f));
                this.f32257o.close();
                this.f32245c.setColor(this.f32263u);
                this.f32245c.setAlpha(this.f32262t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f32257o, this.f32245c);
                canvas.restore();
            }
        }

        int c() {
            return this.f32262t;
        }

        float d() {
            return this.f32248f;
        }

        int e() {
            return this.f32251i[f()];
        }

        int f() {
            return (this.f32252j + 1) % this.f32251i.length;
        }

        float g() {
            return this.f32247e;
        }

        int h() {
            return this.f32251i[this.f32252j];
        }

        float i() {
            return this.f32254l;
        }

        float j() {
            return this.f32255m;
        }

        float k() {
            return this.f32253k;
        }

        void l() {
            t(f());
        }

        void m() {
            this.f32253k = 0.0f;
            this.f32254l = 0.0f;
            this.f32255m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        void n(int i10) {
            this.f32262t = i10;
        }

        void o(float f10, float f11) {
            this.f32260r = (int) f10;
            this.f32261s = (int) f11;
        }

        void p(float f10) {
            if (f10 != this.f32258p) {
                this.f32258p = f10;
            }
        }

        void q(float f10) {
            this.f32259q = f10;
        }

        void r(int i10) {
            this.f32263u = i10;
        }

        void s(ColorFilter colorFilter) {
            this.f32244b.setColorFilter(colorFilter);
        }

        void t(int i10) {
            this.f32252j = i10;
            this.f32263u = this.f32251i[i10];
        }

        void u(int[] iArr) {
            this.f32251i = iArr;
            t(0);
        }

        void v(float f10) {
            this.f32248f = f10;
        }

        void w(float f10) {
            this.f32249g = f10;
        }

        void x(boolean z10) {
            if (this.f32256n != z10) {
                this.f32256n = z10;
            }
        }

        void y(float f10) {
            this.f32247e = f10;
        }

        void z(float f10) {
            this.f32250h = f10;
            this.f32244b.setStrokeWidth(f10);
        }
    }

    public b(Context context) {
        this.f32235c = ((Context) f.g(context)).getResources();
        c cVar = new c();
        this.f32233a = cVar;
        cVar.u(f32232i);
        k(2.5f);
        m();
    }

    private void a(float f10, c cVar) {
        n(f10, cVar);
        float fFloor = (float) (Math.floor(cVar.j() / 0.8f) + 1.0d);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f10));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((fFloor - cVar.j()) * f10));
    }

    private int c(float f10, int i10, int i11) {
        return ((((i10 >> 24) & 255) + ((int) ((((i11 >> 24) & 255) - r0) * f10))) << 24) | ((((i10 >> 16) & 255) + ((int) ((((i11 >> 16) & 255) - r1) * f10))) << 16) | ((((i10 >> 8) & 255) + ((int) ((((i11 >> 8) & 255) - r2) * f10))) << 8) | ((i10 & 255) + ((int) (f10 * ((i11 & 255) - r8))));
    }

    private void h(float f10) {
        this.f32234b = f10;
    }

    private void i(float f10, float f11, float f12, float f13) {
        c cVar = this.f32233a;
        float f14 = this.f32235c.getDisplayMetrics().density;
        cVar.z(f11 * f14);
        cVar.q(f10 * f14);
        cVar.t(0);
        cVar.o(f12 * f14, f13 * f14);
    }

    private void m() {
        c cVar = this.f32233a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(cVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f32230g);
        valueAnimatorOfFloat.addListener(new C0536b(cVar));
        this.f32236d = valueAnimatorOfFloat;
    }

    void b(float f10, c cVar, boolean z10) {
        float interpolation;
        float interpolation2;
        if (this.f32238f) {
            a(f10, cVar);
            return;
        }
        if (f10 != 1.0f || z10) {
            float fJ = cVar.j();
            if (f10 < 0.5f) {
                interpolation = cVar.k();
                interpolation2 = (f32231h.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fK = cVar.k() + 0.79f;
                interpolation = fK - (((1.0f - f32231h.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fK;
            }
            float f11 = fJ + (0.20999998f * f10);
            float f12 = (f10 + this.f32237e) * 216.0f;
            cVar.y(interpolation);
            cVar.v(interpolation2);
            cVar.w(f11);
            h(f12);
        }
    }

    public void d(boolean z10) {
        this.f32233a.x(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f32234b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f32233a.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f10) {
        this.f32233a.p(f10);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f32233a.u(iArr);
        this.f32233a.t(0);
        invalidateSelf();
    }

    public void g(float f10) {
        this.f32233a.w(f10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f32233a.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f32236d.isRunning();
    }

    public void j(float f10, float f11) {
        this.f32233a.y(f10);
        this.f32233a.v(f11);
        invalidateSelf();
    }

    public void k(float f10) {
        this.f32233a.z(f10);
        invalidateSelf();
    }

    public void l(int i10) {
        if (i10 == 0) {
            i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    void n(float f10, c cVar) {
        if (f10 > 0.75f) {
            cVar.r(c((f10 - 0.75f) / 0.25f, cVar.h(), cVar.e()));
        } else {
            cVar.r(cVar.h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f32233a.n(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f32233a.s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f32236d.cancel();
        this.f32233a.A();
        if (this.f32233a.d() != this.f32233a.g()) {
            this.f32238f = true;
            this.f32236d.setDuration(666L);
            this.f32236d.start();
        } else {
            this.f32233a.t(0);
            this.f32233a.m();
            this.f32236d.setDuration(1332L);
            this.f32236d.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f32236d.cancel();
        h(0.0f);
        this.f32233a.x(false);
        this.f32233a.t(0);
        this.f32233a.m();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0536b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f32241a;

        C0536b(c cVar) {
            this.f32241a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            b.this.b(1.0f, this.f32241a, true);
            this.f32241a.A();
            this.f32241a.l();
            b bVar = b.this;
            if (!bVar.f32238f) {
                bVar.f32237e += 1.0f;
                return;
            }
            bVar.f32238f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f32241a.x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f32237e = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }
}
