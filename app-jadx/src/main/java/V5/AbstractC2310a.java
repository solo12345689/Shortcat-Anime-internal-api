package V5;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: V5.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2310a extends Drawable implements Drawable.Callback, D, C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private D f19776a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Drawable[] f19778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC2312c[] f19779d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2313d f19777b = new C2313d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f19780e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19781f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f19782g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f19783h = false;

    /* JADX INFO: renamed from: V5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0341a implements InterfaceC2312c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f19784a;

        C0341a(int i10) {
            this.f19784a = i10;
        }

        @Override // V5.InterfaceC2312c
        public Drawable b() {
            return AbstractC2310a.this.b(this.f19784a);
        }

        @Override // V5.InterfaceC2312c
        public Drawable i(Drawable drawable) {
            return AbstractC2310a.this.e(this.f19784a, drawable);
        }
    }

    public AbstractC2310a(Drawable[] drawableArr) {
        int i10 = 0;
        y5.k.g(drawableArr);
        this.f19778c = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.f19778c;
            if (i10 >= drawableArr2.length) {
                this.f19779d = new InterfaceC2312c[drawableArr2.length];
                return;
            } else {
                C2314e.d(drawableArr2[i10], this, this);
                i10++;
            }
        }
    }

    private InterfaceC2312c a(int i10) {
        return new C0341a(i10);
    }

    public Drawable b(int i10) {
        y5.k.b(Boolean.valueOf(i10 >= 0));
        y5.k.b(Boolean.valueOf(i10 < this.f19778c.length));
        return this.f19778c[i10];
    }

    public InterfaceC2312c c(int i10) {
        y5.k.b(Boolean.valueOf(i10 >= 0));
        y5.k.b(Boolean.valueOf(i10 < this.f19779d.length));
        InterfaceC2312c[] interfaceC2312cArr = this.f19779d;
        if (interfaceC2312cArr[i10] == null) {
            interfaceC2312cArr[i10] = a(i10);
        }
        return this.f19779d[i10];
    }

    public int d() {
        return this.f19778c.length;
    }

    public Drawable e(int i10, Drawable drawable) {
        y5.k.b(Boolean.valueOf(i10 >= 0));
        y5.k.b(Boolean.valueOf(i10 < this.f19778c.length));
        Drawable drawable2 = this.f19778c[i10];
        if (drawable != drawable2) {
            if (drawable != null && this.f19783h) {
                drawable.mutate();
            }
            C2314e.d(this.f19778c[i10], null, null);
            C2314e.d(drawable, null, null);
            C2314e.e(drawable, this.f19777b);
            C2314e.a(drawable, this);
            C2314e.d(drawable, this, this);
            this.f19782g = false;
            this.f19778c[i10] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // V5.D
    public void f(Matrix matrix) {
        D d10 = this.f19776a;
        if (d10 != null) {
            d10.f(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i10 = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.f19778c;
            if (i10 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicHeight());
            }
            i10++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i10 = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.f19778c;
            if (i10 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicWidth());
            }
            i10++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f19778c.length == 0) {
            return -2;
        }
        int i10 = 1;
        int iResolveOpacity = -1;
        while (true) {
            Drawable[] drawableArr = this.f19778c;
            if (i10 >= drawableArr.length) {
                return iResolveOpacity;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                iResolveOpacity = Drawable.resolveOpacity(iResolveOpacity, drawable.getOpacity());
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int i10 = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.f19780e;
        while (true) {
            Drawable[] drawableArr = this.f19778c;
            if (i10 >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!this.f19782g) {
            this.f19781f = false;
            int i10 = 0;
            while (true) {
                Drawable[] drawableArr = this.f19778c;
                boolean z10 = true;
                if (i10 >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i10];
                boolean z11 = this.f19781f;
                if (drawable == null || !drawable.isStateful()) {
                    z10 = false;
                }
                this.f19781f = z11 | z10;
                i10++;
            }
            this.f19782g = true;
        }
        return this.f19781f;
    }

    @Override // V5.C
    public void l(D d10) {
        this.f19776a = d10;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f19778c;
            if (i10 >= drawableArr.length) {
                this.f19783h = true;
                return this;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.mutate();
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f19778c;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setBounds(rect);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            Drawable[] drawableArr = this.f19778c;
            if (i11 >= drawableArr.length) {
                return z10;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null && drawable.setLevel(i10)) {
                z10 = true;
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            Drawable[] drawableArr = this.f19778c;
            if (i10 >= drawableArr.length) {
                return z10;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null && drawable.setState(iArr)) {
                z10 = true;
            }
            i10++;
        }
    }

    @Override // V5.D
    public void q(RectF rectF) {
        D d10 = this.f19776a;
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
    public void setColorFilter(ColorFilter colorFilter) {
        this.f19777b.c(colorFilter);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f19778c;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f19777b.d(z10);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f19778c;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setDither(z10);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f19777b.e(z10);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f19778c;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setFilterBitmap(z10);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f19778c;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setHotspot(f10, f11);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f19778c;
            if (i10 >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setVisible(z10, z11);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
