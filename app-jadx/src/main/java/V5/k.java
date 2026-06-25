package V5;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class k extends Drawable implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    float[] f19831c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f19829a = new float[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final float[] f19830b = new float[8];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Paint f19832d = new Paint(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19833e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f19834f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f19835g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f19836h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f19837i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f19838j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Path f19839k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final Path f19840l = new Path();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f19841m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RectF f19842n = new RectF();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f19843o = 255;

    public k(int i10) {
        d(i10);
    }

    public static k a(ColorDrawable colorDrawable) {
        return new k(colorDrawable.getColor());
    }

    private void f() {
        float[] fArr;
        float[] fArr2;
        this.f19839k.reset();
        this.f19840l.reset();
        this.f19842n.set(getBounds());
        RectF rectF = this.f19842n;
        float f10 = this.f19834f;
        rectF.inset(f10 / 2.0f, f10 / 2.0f);
        int i10 = 0;
        if (this.f19833e) {
            this.f19840l.addCircle(this.f19842n.centerX(), this.f19842n.centerY(), Math.min(this.f19842n.width(), this.f19842n.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i11 = 0;
            while (true) {
                fArr = this.f19830b;
                if (i11 >= fArr.length) {
                    break;
                }
                fArr[i11] = (this.f19829a[i11] + this.f19835g) - (this.f19834f / 2.0f);
                i11++;
            }
            this.f19840l.addRoundRect(this.f19842n, fArr, Path.Direction.CW);
        }
        RectF rectF2 = this.f19842n;
        float f11 = this.f19834f;
        rectF2.inset((-f11) / 2.0f, (-f11) / 2.0f);
        float f12 = this.f19835g + (this.f19837i ? this.f19834f : 0.0f);
        this.f19842n.inset(f12, f12);
        if (this.f19833e) {
            this.f19839k.addCircle(this.f19842n.centerX(), this.f19842n.centerY(), Math.min(this.f19842n.width(), this.f19842n.height()) / 2.0f, Path.Direction.CW);
        } else if (this.f19837i) {
            if (this.f19831c == null) {
                this.f19831c = new float[8];
            }
            while (true) {
                fArr2 = this.f19831c;
                if (i10 >= fArr2.length) {
                    break;
                }
                fArr2[i10] = this.f19829a[i10] - this.f19834f;
                i10++;
            }
            this.f19839k.addRoundRect(this.f19842n, fArr2, Path.Direction.CW);
        } else {
            this.f19839k.addRoundRect(this.f19842n, this.f19829a, Path.Direction.CW);
        }
        float f13 = -f12;
        this.f19842n.inset(f13, f13);
    }

    public boolean b() {
        return this.f19838j;
    }

    @Override // V5.i
    public void c(int i10, float f10) {
        if (this.f19836h != i10) {
            this.f19836h = i10;
            invalidateSelf();
        }
        if (this.f19834f != f10) {
            this.f19834f = f10;
            f();
            invalidateSelf();
        }
    }

    public void d(int i10) {
        if (this.f19841m != i10) {
            this.f19841m = i10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f19832d.setColor(C2314e.c(this.f19841m, this.f19843o));
        this.f19832d.setStyle(Paint.Style.FILL);
        this.f19832d.setFilterBitmap(b());
        canvas.drawPath(this.f19839k, this.f19832d);
        if (this.f19834f != 0.0f) {
            this.f19832d.setColor(C2314e.c(this.f19836h, this.f19843o));
            this.f19832d.setStyle(Paint.Style.STROKE);
            this.f19832d.setStrokeWidth(this.f19834f);
            canvas.drawPath(this.f19840l, this.f19832d);
        }
    }

    @Override // V5.i
    public void e(boolean z10) {
        this.f19833e = z10;
        f();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f19843o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return C2314e.b(C2314e.c(this.f19841m, this.f19843o));
    }

    @Override // V5.i
    public void j(float f10) {
        if (this.f19835g != f10) {
            this.f19835g = f10;
            f();
            invalidateSelf();
        }
    }

    @Override // V5.i
    public void k(float f10) {
        y5.k.c(f10 >= 0.0f, "radius should be non negative");
        Arrays.fill(this.f19829a, f10);
        f();
        invalidateSelf();
    }

    @Override // V5.i
    public void o(boolean z10) {
        if (this.f19838j != z10) {
            this.f19838j = z10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        f();
    }

    @Override // V5.i
    public void p(boolean z10) {
        if (this.f19837i != z10) {
            this.f19837i = z10;
            f();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 != this.f19843o) {
            this.f19843o = i10;
            invalidateSelf();
        }
    }

    @Override // V5.i
    public void t(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f19829a, 0.0f);
        } else {
            y5.k.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f19829a, 0, 8);
        }
        f();
        invalidateSelf();
    }

    @Override // V5.i
    public void m(boolean z10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
