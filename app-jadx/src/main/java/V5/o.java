package V5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private q f19894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f19895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PointF f19896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f19898i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Matrix f19899j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Matrix f19900k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Drawable drawable, q scaleType) {
        super(drawable);
        AbstractC5504s.h(scaleType, "scaleType");
        this.f19900k = new Matrix();
        this.f19894e = scaleType;
    }

    private final void y() {
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        if (this.f19897h == current.getIntrinsicWidth() && this.f19898i == current.getIntrinsicHeight()) {
            return;
        }
        x();
    }

    public final q A() {
        return this.f19894e;
    }

    public final void B(PointF pointF) {
        if (y5.i.a(this.f19896g, pointF)) {
            return;
        }
        if (pointF == null) {
            this.f19896g = null;
        } else {
            if (this.f19896g == null) {
                this.f19896g = new PointF();
            }
            PointF pointF2 = this.f19896g;
            AbstractC5504s.e(pointF2);
            pointF2.set(pointF);
        }
        x();
        invalidateSelf();
    }

    public final void C(q scaleType) {
        AbstractC5504s.h(scaleType, "scaleType");
        if (y5.i.a(this.f19894e, scaleType)) {
            return;
        }
        this.f19894e = scaleType;
        this.f19895f = null;
        x();
        invalidateSelf();
    }

    @Override // V5.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        AbstractC5504s.h(canvas, "canvas");
        y();
        if (this.f19899j == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.f19899j);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // V5.g, V5.D
    public void f(Matrix transform) {
        AbstractC5504s.h(transform, "transform");
        u(transform);
        y();
        Matrix matrix = this.f19899j;
        if (matrix != null) {
            transform.preConcat(matrix);
        }
    }

    @Override // V5.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        AbstractC5504s.h(bounds, "bounds");
        x();
    }

    @Override // V5.g
    public Drawable v(Drawable drawable) {
        Drawable drawableV = super.v(drawable);
        x();
        return drawableV;
    }

    public final void x() {
        float f10;
        Drawable current = getCurrent();
        if (current == null) {
            this.f19898i = 0;
            this.f19897h = 0;
            this.f19899j = null;
            return;
        }
        Rect bounds = getBounds();
        AbstractC5504s.g(bounds, "getBounds(...)");
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f19897h = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f19898i = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f19899j = null;
            return;
        }
        if (intrinsicWidth == iWidth && intrinsicHeight == iHeight) {
            current.setBounds(bounds);
            this.f19899j = null;
            return;
        }
        if (this.f19894e == q.f19901a) {
            current.setBounds(bounds);
            this.f19899j = null;
            return;
        }
        current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        this.f19900k.reset();
        q qVar = this.f19894e;
        Matrix matrix = this.f19900k;
        PointF pointF = this.f19896g;
        float f11 = 0.5f;
        if (pointF != null) {
            AbstractC5504s.e(pointF);
            f10 = pointF.x;
        } else {
            f10 = 0.5f;
        }
        PointF pointF2 = this.f19896g;
        if (pointF2 != null) {
            AbstractC5504s.e(pointF2);
            f11 = pointF2.y;
        }
        qVar.a(matrix, bounds, intrinsicWidth, intrinsicHeight, f10, f11);
        this.f19899j = this.f19900k;
    }

    public final PointF z() {
        return this.f19896g;
    }
}
