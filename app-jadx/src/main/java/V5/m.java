package V5;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class m extends Drawable implements i, C {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private D f19867C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f19868a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    float[] f19878k;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    RectF f19883p;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    Matrix f19889v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    Matrix f19890w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f19869b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f19870c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected float f19871d = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final Path f19872e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f19873f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f19874g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final Path f19875h = new Path();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float[] f19876i = new float[8];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final float[] f19877j = new float[8];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final RectF f19879l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final RectF f19880m = new RectF();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final RectF f19881n = new RectF();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final RectF f19882o = new RectF();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final Matrix f19884q = new Matrix();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final Matrix f19885r = new Matrix();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final Matrix f19886s = new Matrix();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final Matrix f19887t = new Matrix();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final Matrix f19888u = new Matrix();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final Matrix f19891x = new Matrix();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f19892y = 0.0f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f19893z = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f19865A = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f19866B = true;

    m(Drawable drawable) {
        this.f19868a = drawable;
    }

    private static Matrix a(Matrix matrix) {
        if (matrix == null) {
            return null;
        }
        return new Matrix(matrix);
    }

    private static boolean d(Matrix matrix, Matrix matrix2) {
        if (matrix == null && matrix2 == null) {
            return true;
        }
        if (matrix == null || matrix2 == null) {
            return false;
        }
        return matrix.equals(matrix2);
    }

    public boolean b() {
        return this.f19865A;
    }

    @Override // V5.i
    public void c(int i10, float f10) {
        if (this.f19874g == i10 && this.f19871d == f10) {
            return;
        }
        this.f19874g = i10;
        this.f19871d = f10;
        this.f19866B = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f19868a.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (L6.b.d()) {
            L6.b.a("RoundedDrawable#draw");
        }
        this.f19868a.draw(canvas);
        if (L6.b.d()) {
            L6.b.b();
        }
    }

    @Override // V5.i
    public void e(boolean z10) {
        this.f19869b = z10;
        this.f19866B = true;
        invalidateSelf();
    }

    boolean f() {
        return this.f19869b || this.f19870c || this.f19871d > 0.0f;
    }

    protected void g() {
        float[] fArr;
        if (this.f19866B) {
            this.f19875h.reset();
            RectF rectF = this.f19879l;
            float f10 = this.f19871d;
            rectF.inset(f10 / 2.0f, f10 / 2.0f);
            if (this.f19869b) {
                this.f19875h.addCircle(this.f19879l.centerX(), this.f19879l.centerY(), Math.min(this.f19879l.width(), this.f19879l.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i10 = 0;
                while (true) {
                    fArr = this.f19877j;
                    if (i10 >= fArr.length) {
                        break;
                    }
                    fArr[i10] = (this.f19876i[i10] + this.f19892y) - (this.f19871d / 2.0f);
                    i10++;
                }
                this.f19875h.addRoundRect(this.f19879l, fArr, Path.Direction.CW);
            }
            RectF rectF2 = this.f19879l;
            float f11 = this.f19871d;
            rectF2.inset((-f11) / 2.0f, (-f11) / 2.0f);
            this.f19872e.reset();
            float f12 = this.f19892y + (this.f19893z ? this.f19871d : 0.0f);
            this.f19879l.inset(f12, f12);
            if (this.f19869b) {
                this.f19872e.addCircle(this.f19879l.centerX(), this.f19879l.centerY(), Math.min(this.f19879l.width(), this.f19879l.height()) / 2.0f, Path.Direction.CW);
            } else if (this.f19893z) {
                if (this.f19878k == null) {
                    this.f19878k = new float[8];
                }
                for (int i11 = 0; i11 < this.f19877j.length; i11++) {
                    this.f19878k[i11] = this.f19876i[i11] - this.f19871d;
                }
                this.f19872e.addRoundRect(this.f19879l, this.f19878k, Path.Direction.CW);
            } else {
                this.f19872e.addRoundRect(this.f19879l, this.f19876i, Path.Direction.CW);
            }
            float f13 = -f12;
            this.f19879l.inset(f13, f13);
            this.f19872e.setFillType(Path.FillType.WINDING);
            this.f19866B = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f19868a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f19868a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f19868a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f19868a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f19868a.getOpacity();
    }

    protected void h() {
        Matrix matrix;
        Matrix matrix2;
        D d10 = this.f19867C;
        if (d10 != null) {
            d10.f(this.f19886s);
            this.f19867C.q(this.f19879l);
        } else {
            this.f19886s.reset();
            this.f19879l.set(getBounds());
        }
        this.f19881n.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        this.f19882o.set(this.f19868a.getBounds());
        Matrix matrix3 = this.f19884q;
        RectF rectF = this.f19881n;
        RectF rectF2 = this.f19882o;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix3.setRectToRect(rectF, rectF2, scaleToFit);
        if (this.f19893z) {
            RectF rectF3 = this.f19883p;
            if (rectF3 == null) {
                this.f19883p = new RectF(this.f19879l);
            } else {
                rectF3.set(this.f19879l);
            }
            RectF rectF4 = this.f19883p;
            float f10 = this.f19871d;
            rectF4.inset(f10, f10);
            if (this.f19889v == null) {
                this.f19889v = new Matrix();
            }
            this.f19889v.setRectToRect(this.f19879l, this.f19883p, scaleToFit);
        } else {
            Matrix matrix4 = this.f19889v;
            if (matrix4 != null) {
                matrix4.reset();
            }
        }
        if (!this.f19886s.equals(this.f19887t) || !this.f19884q.equals(this.f19885r) || ((matrix2 = this.f19889v) != null && !d(matrix2, this.f19890w))) {
            this.f19873f = true;
            this.f19886s.invert(this.f19888u);
            this.f19891x.set(this.f19886s);
            if (this.f19893z && (matrix = this.f19889v) != null) {
                this.f19891x.postConcat(matrix);
            }
            this.f19891x.preConcat(this.f19884q);
            this.f19887t.set(this.f19886s);
            this.f19885r.set(this.f19884q);
            if (this.f19893z) {
                Matrix matrix5 = this.f19890w;
                if (matrix5 == null) {
                    this.f19890w = a(this.f19889v);
                } else {
                    matrix5.set(this.f19889v);
                }
            } else {
                Matrix matrix6 = this.f19890w;
                if (matrix6 != null) {
                    matrix6.reset();
                }
            }
        }
        if (this.f19879l.equals(this.f19880m)) {
            return;
        }
        this.f19866B = true;
        this.f19880m.set(this.f19879l);
    }

    @Override // V5.i
    public void j(float f10) {
        if (this.f19892y != f10) {
            this.f19892y = f10;
            this.f19866B = true;
            invalidateSelf();
        }
    }

    @Override // V5.i
    public void k(float f10) {
        y5.k.i(f10 >= 0.0f);
        Arrays.fill(this.f19876i, f10);
        this.f19870c = f10 != 0.0f;
        this.f19866B = true;
        invalidateSelf();
    }

    @Override // V5.C
    public void l(D d10) {
        this.f19867C = d10;
    }

    @Override // V5.i
    public void o(boolean z10) {
        if (this.f19865A != z10) {
            this.f19865A = z10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f19868a.setBounds(rect);
    }

    @Override // V5.i
    public void p(boolean z10) {
        if (this.f19893z != z10) {
            this.f19893z = z10;
            this.f19866B = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f19868a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i10, PorterDuff.Mode mode) {
        this.f19868a.setColorFilter(i10, mode);
    }

    @Override // V5.i
    public void t(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f19876i, 0.0f);
            this.f19870c = false;
        } else {
            y5.k.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f19876i, 0, 8);
            this.f19870c = false;
            for (int i10 = 0; i10 < 8; i10++) {
                this.f19870c |= fArr[i10] > 0.0f;
            }
        }
        this.f19866B = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f19868a.setColorFilter(colorFilter);
    }

    public void m(boolean z10) {
    }
}
