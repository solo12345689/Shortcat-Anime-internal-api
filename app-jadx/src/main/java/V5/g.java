package V5;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class g extends Drawable implements Drawable.Callback, D, C, InterfaceC2312c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Matrix f19813d = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f19814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2313d f19815b = new C2313d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected D f19816c;

    public g(Drawable drawable) {
        this.f19814a = drawable;
        C2314e.d(drawable, this, this);
    }

    @Override // V5.InterfaceC2312c
    public Drawable b() {
        return getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f19814a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // V5.D
    public void f(Matrix matrix) {
        u(matrix);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f19814a;
        return drawable == null ? super.getConstantState() : drawable.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f19814a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f19814a;
        return drawable == null ? super.getIntrinsicHeight() : drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f19814a;
        return drawable == null ? super.getIntrinsicWidth() : drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f19814a;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f19814a;
        return drawable == null ? super.getPadding(rect) : drawable.getPadding(rect);
    }

    @Override // V5.InterfaceC2312c
    public Drawable i(Drawable drawable) {
        return v(drawable);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f19814a;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    @Override // V5.C
    public void l(D d10) {
        this.f19816c = d10;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f19814a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f19814a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f19814a;
        return drawable == null ? super.onLevelChange(i10) : drawable.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f19814a;
        return drawable == null ? super.onStateChange(iArr) : drawable.setState(iArr);
    }

    @Override // V5.D
    public void q(RectF rectF) {
        D d10 = this.f19816c;
        if (d10 != null) {
            d10.q(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f19815b.b(i10);
        Drawable drawable = this.f19814a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f19815b.c(colorFilter);
        Drawable drawable = this.f19814a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f19815b.d(z10);
        Drawable drawable = this.f19814a;
        if (drawable != null) {
            drawable.setDither(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f19815b.e(z10);
        Drawable drawable = this.f19814a;
        if (drawable != null) {
            drawable.setFilterBitmap(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f19814a;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f19814a;
        return drawable == null ? visible : drawable.setVisible(z10, z11);
    }

    protected void u(Matrix matrix) {
        D d10 = this.f19816c;
        if (d10 != null) {
            d10.f(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public Drawable v(Drawable drawable) {
        Drawable drawableW = w(drawable);
        invalidateSelf();
        return drawableW;
    }

    protected Drawable w(Drawable drawable) {
        Drawable drawable2 = this.f19814a;
        C2314e.d(drawable2, null, null);
        C2314e.d(drawable, null, null);
        C2314e.e(drawable, this.f19815b);
        C2314e.a(drawable, this);
        C2314e.d(drawable, this, this);
        this.f19814a = drawable;
        return drawable2;
    }
}
