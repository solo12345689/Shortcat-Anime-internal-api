package V5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class l extends g implements i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    b f19844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RectF f19845f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RectF f19846g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Matrix f19847h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float[] f19848i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final float[] f19849j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Paint f19850k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f19851l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f19852m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f19853n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f19854o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f19855p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f19856q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f19857r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Path f19858s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Path f19859t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final RectF f19860u;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19861a;

        static {
            int[] iArr = new int[b.values().length];
            f19861a = iArr;
            try {
                iArr[b.CLIPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19861a[b.OVERLAY_COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum b {
        OVERLAY_COLOR,
        CLIPPING
    }

    public l(Drawable drawable) {
        super((Drawable) y5.k.g(drawable));
        this.f19844e = b.OVERLAY_COLOR;
        this.f19845f = new RectF();
        this.f19848i = new float[8];
        this.f19849j = new float[8];
        this.f19850k = new Paint(1);
        this.f19851l = false;
        this.f19852m = 0.0f;
        this.f19853n = 0;
        this.f19854o = 0;
        this.f19855p = 0.0f;
        this.f19856q = false;
        this.f19857r = false;
        this.f19858s = new Path();
        this.f19859t = new Path();
        this.f19860u = new RectF();
    }

    private void z() {
        float[] fArr;
        this.f19858s.reset();
        this.f19859t.reset();
        this.f19860u.set(getBounds());
        RectF rectF = this.f19860u;
        float f10 = this.f19855p;
        rectF.inset(f10, f10);
        if (this.f19844e == b.OVERLAY_COLOR) {
            this.f19858s.addRect(this.f19860u, Path.Direction.CW);
        }
        if (this.f19851l) {
            this.f19858s.addCircle(this.f19860u.centerX(), this.f19860u.centerY(), Math.min(this.f19860u.width(), this.f19860u.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.f19858s.addRoundRect(this.f19860u, this.f19848i, Path.Direction.CW);
        }
        RectF rectF2 = this.f19860u;
        float f11 = this.f19855p;
        rectF2.inset(-f11, -f11);
        RectF rectF3 = this.f19860u;
        float f12 = this.f19852m;
        rectF3.inset(f12 / 2.0f, f12 / 2.0f);
        if (this.f19851l) {
            this.f19859t.addCircle(this.f19860u.centerX(), this.f19860u.centerY(), Math.min(this.f19860u.width(), this.f19860u.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i10 = 0;
            while (true) {
                fArr = this.f19849j;
                if (i10 >= fArr.length) {
                    break;
                }
                fArr[i10] = (this.f19848i[i10] + this.f19855p) - (this.f19852m / 2.0f);
                i10++;
            }
            this.f19859t.addRoundRect(this.f19860u, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.f19860u;
        float f13 = this.f19852m;
        rectF4.inset((-f13) / 2.0f, (-f13) / 2.0f);
    }

    @Override // V5.i
    public void c(int i10, float f10) {
        this.f19853n = i10;
        this.f19852m = f10;
        z();
        invalidateSelf();
    }

    @Override // V5.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f19845f.set(getBounds());
        int i10 = a.f19861a[this.f19844e.ordinal()];
        if (i10 == 1) {
            int iSave = canvas.save();
            canvas.clipPath(this.f19858s);
            super.draw(canvas);
            canvas.restoreToCount(iSave);
        } else if (i10 == 2) {
            if (this.f19856q) {
                RectF rectF = this.f19846g;
                if (rectF == null) {
                    this.f19846g = new RectF(this.f19845f);
                    this.f19847h = new Matrix();
                } else {
                    rectF.set(this.f19845f);
                }
                RectF rectF2 = this.f19846g;
                float f10 = this.f19852m;
                rectF2.inset(f10, f10);
                Matrix matrix = this.f19847h;
                if (matrix != null) {
                    matrix.setRectToRect(this.f19845f, this.f19846g, Matrix.ScaleToFit.FILL);
                }
                int iSave2 = canvas.save();
                canvas.clipRect(this.f19845f);
                canvas.concat(this.f19847h);
                super.draw(canvas);
                canvas.restoreToCount(iSave2);
            } else {
                super.draw(canvas);
            }
            this.f19850k.setStyle(Paint.Style.FILL);
            this.f19850k.setColor(this.f19854o);
            this.f19850k.setStrokeWidth(0.0f);
            this.f19850k.setFilterBitmap(x());
            this.f19858s.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f19858s, this.f19850k);
            if (this.f19851l) {
                float fWidth = ((this.f19845f.width() - this.f19845f.height()) + this.f19852m) / 2.0f;
                float fHeight = ((this.f19845f.height() - this.f19845f.width()) + this.f19852m) / 2.0f;
                if (fWidth > 0.0f) {
                    RectF rectF3 = this.f19845f;
                    float f11 = rectF3.left;
                    canvas.drawRect(f11, rectF3.top, f11 + fWidth, rectF3.bottom, this.f19850k);
                    RectF rectF4 = this.f19845f;
                    float f12 = rectF4.right;
                    canvas.drawRect(f12 - fWidth, rectF4.top, f12, rectF4.bottom, this.f19850k);
                }
                if (fHeight > 0.0f) {
                    RectF rectF5 = this.f19845f;
                    float f13 = rectF5.left;
                    float f14 = rectF5.top;
                    canvas.drawRect(f13, f14, rectF5.right, f14 + fHeight, this.f19850k);
                    RectF rectF6 = this.f19845f;
                    float f15 = rectF6.left;
                    float f16 = rectF6.bottom;
                    canvas.drawRect(f15, f16 - fHeight, rectF6.right, f16, this.f19850k);
                }
            }
        }
        if (this.f19853n != 0) {
            this.f19850k.setStyle(Paint.Style.STROKE);
            this.f19850k.setColor(this.f19853n);
            this.f19850k.setStrokeWidth(this.f19852m);
            this.f19858s.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f19859t, this.f19850k);
        }
    }

    @Override // V5.i
    public void e(boolean z10) {
        this.f19851l = z10;
        z();
        invalidateSelf();
    }

    @Override // V5.i
    public void j(float f10) {
        this.f19855p = f10;
        z();
        invalidateSelf();
    }

    @Override // V5.i
    public void k(float f10) {
        Arrays.fill(this.f19848i, f10);
        z();
        invalidateSelf();
    }

    @Override // V5.i
    public void o(boolean z10) {
        if (this.f19857r != z10) {
            this.f19857r = z10;
            invalidateSelf();
        }
    }

    @Override // V5.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        z();
    }

    @Override // V5.i
    public void p(boolean z10) {
        this.f19856q = z10;
        z();
        invalidateSelf();
    }

    @Override // V5.i
    public void t(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f19848i, 0.0f);
        } else {
            y5.k.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f19848i, 0, 8);
        }
        z();
        invalidateSelf();
    }

    public boolean x() {
        return this.f19857r;
    }

    public void y(int i10) {
        this.f19854o = i10;
        invalidateSelf();
    }

    @Override // V5.i
    public void m(boolean z10) {
    }
}
