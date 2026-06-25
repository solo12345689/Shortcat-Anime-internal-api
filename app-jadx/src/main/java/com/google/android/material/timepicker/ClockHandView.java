package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.material.internal.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o9.AbstractC5838a;
import o9.AbstractC5840c;
import o9.AbstractC5847j;
import o9.AbstractC5848k;
import p9.AbstractC5946a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f43076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeInterpolator f43077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ValueAnimator f43078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f43079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f43080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f43081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f43082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f43083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f43084i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f43085j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f43086k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float f43087l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Paint f43088m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RectF f43089n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f43090o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f43091p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f43092q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private double f43093r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f43094s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f43095t;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void a(float f10, boolean z10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5838a.f54638h0);
    }

    public static /* synthetic */ void a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.getClass();
        clockHandView.p(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void c(float f10, float f11) {
        this.f43095t = B9.a.b((float) (getWidth() / 2), (float) (getHeight() / 2), f10, f11) > ((float) h(2)) + p.c(getContext(), 12) ? 1 : 2;
    }

    private void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f10 = width;
        float fH = h(this.f43095t);
        float fCos = (((float) Math.cos(this.f43093r)) * fH) + f10;
        float f11 = height;
        float fSin = (fH * ((float) Math.sin(this.f43093r))) + f11;
        this.f43088m.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f43086k, this.f43088m);
        double dSin = Math.sin(this.f43093r);
        double dCos = Math.cos(this.f43093r);
        this.f43088m.setStrokeWidth(this.f43090o);
        canvas.drawLine(f10, f11, width + ((int) (dCos * d)), height + ((int) (d * dSin)), this.f43088m);
        canvas.drawCircle(f10, f11, this.f43087l, this.f43088m);
    }

    private int f(float f10, float f11) {
        int degrees = (int) Math.toDegrees(Math.atan2(f11 - (getHeight() / 2), f10 - (getWidth() / 2)));
        int i10 = degrees + 90;
        return i10 < 0 ? degrees + 450 : i10;
    }

    private int h(int i10) {
        return i10 == 2 ? Math.round(this.f43094s * 0.66f) : this.f43094s;
    }

    private Pair j(float f10) {
        float fG = g();
        if (Math.abs(fG - f10) > 180.0f) {
            if (fG > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (fG < 180.0f && f10 > 180.0f) {
                fG += 360.0f;
            }
        }
        return new Pair(Float.valueOf(fG), Float.valueOf(f10));
    }

    private boolean k(float f10, float f11, boolean z10, boolean z11, boolean z12) {
        float f12 = f(f10, f11);
        boolean z13 = false;
        boolean z14 = g() != f12;
        if (z11 && z14) {
            return true;
        }
        if (!z14 && !z10) {
            return false;
        }
        if (z12 && this.f43079d) {
            z13 = true;
        }
        o(f12, z13);
        return true;
    }

    private void l() {
        this.f43078c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ClockHandView.a(this.f43107a, valueAnimator);
            }
        });
        this.f43078c.addListener(new a());
    }

    private void p(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f43091p = f11;
        this.f43093r = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fH = h(this.f43095t);
        float fCos = width + (((float) Math.cos(this.f43093r)) * fH);
        float fSin = height + (fH * ((float) Math.sin(this.f43093r)));
        RectF rectF = this.f43089n;
        int i10 = this.f43086k;
        rectF.set(fCos - i10, fSin - i10, fCos + i10, fSin + i10);
        Iterator it = this.f43085j.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(f11, z10);
        }
        invalidate();
    }

    public void b(b bVar) {
        this.f43085j.add(bVar);
    }

    public RectF e() {
        return this.f43089n;
    }

    public float g() {
        return this.f43091p;
    }

    public int i() {
        return this.f43086k;
    }

    public void m(int i10) {
        this.f43094s = i10;
        invalidate();
    }

    public void n(float f10) {
        o(f10, false);
    }

    public void o(float f10, boolean z10) {
        this.f43078c.cancel();
        if (!z10) {
            p(f10, false);
            return;
        }
        Pair pairJ = j(f10);
        this.f43078c.setFloatValues(((Float) pairJ.first).floatValue(), ((Float) pairJ.second).floatValue());
        this.f43078c.setDuration(this.f43076a);
        this.f43078c.setInterpolator(this.f43077b);
        this.f43078c.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f43078c.isRunning()) {
            return;
        }
        n(g());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f43080e = x10;
            this.f43081f = y10;
            this.f43082g = true;
            this.f43092q = false;
            z10 = true;
            z11 = false;
            z12 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i10 = (int) (x10 - this.f43080e);
            int i11 = (int) (y10 - this.f43081f);
            this.f43082g = (i10 * i10) + (i11 * i11) > this.f43083h;
            z11 = this.f43092q;
            boolean z13 = actionMasked == 1;
            if (this.f43084i) {
                c(x10, y10);
            }
            z12 = z13;
            z10 = false;
        } else {
            z11 = false;
            z10 = false;
            z12 = false;
        }
        this.f43092q |= k(x10, y10, z11, z10, z12);
        return true;
    }

    void q(boolean z10) {
        if (this.f43084i && !z10) {
            this.f43095t = 1;
        }
        this.f43084i = z10;
        invalidate();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f43078c = new ValueAnimator();
        this.f43085j = new ArrayList();
        Paint paint = new Paint();
        this.f43088m = paint;
        this.f43089n = new RectF();
        this.f43095t = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5848k.f55258s1, i10, AbstractC5847j.f54870B);
        this.f43076a = C9.d.f(context, AbstractC5838a.f54648m0, 200);
        this.f43077b = C9.d.g(context, AbstractC5838a.f54662t0, AbstractC5946a.f55827b);
        this.f43094s = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC5848k.f55274u1, 0);
        this.f43086k = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC5848k.f55282v1, 0);
        this.f43090o = getResources().getDimensionPixelSize(AbstractC5840c.f54687G);
        this.f43087l = r7.getDimensionPixelSize(AbstractC5840c.f54685E);
        int color = typedArrayObtainStyledAttributes.getColor(AbstractC5848k.f55266t1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        n(0.0f);
        this.f43083h = ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        l();
    }
}
