package V5;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class j extends m {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static boolean f19822X = false;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final Paint f19823D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final Paint f19824E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final Bitmap f19825F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private WeakReference f19826G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f19827H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private RectF f19828I;

    public j(Resources resources, Bitmap bitmap, Paint paint, boolean z10) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.f19823D = paint2;
        Paint paint3 = new Paint(1);
        this.f19824E = paint3;
        this.f19828I = null;
        this.f19825F = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
        this.f19827H = z10;
    }

    public static boolean i() {
        return f19822X;
    }

    private void n() {
        Shader shader;
        WeakReference weakReference = this.f19826G;
        if (weakReference == null || weakReference.get() != this.f19825F) {
            this.f19826G = new WeakReference(this.f19825F);
            if (this.f19825F != null) {
                Paint paint = this.f19823D;
                Bitmap bitmap = this.f19825F;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                this.f19873f = true;
            }
        }
        if (this.f19873f && (shader = this.f19823D.getShader()) != null) {
            shader.setLocalMatrix(this.f19891x);
            this.f19873f = false;
        }
        this.f19823D.setFilterBitmap(b());
    }

    @Override // V5.m, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (L6.b.d()) {
            L6.b.a("RoundedBitmapDrawable#draw");
        }
        if (!f()) {
            super.draw(canvas);
            if (L6.b.d()) {
                L6.b.b();
                return;
            }
            return;
        }
        h();
        g();
        n();
        int iSave = canvas.save();
        canvas.concat(this.f19888u);
        if (this.f19827H || this.f19828I == null) {
            canvas.drawPath(this.f19872e, this.f19823D);
        } else {
            int iSave2 = canvas.save();
            canvas.clipRect(this.f19828I);
            canvas.drawPath(this.f19872e, this.f19823D);
            canvas.restoreToCount(iSave2);
        }
        float f10 = this.f19871d;
        if (f10 > 0.0f) {
            this.f19824E.setStrokeWidth(f10);
            this.f19824E.setColor(C2314e.c(this.f19874g, this.f19823D.getAlpha()));
            canvas.drawPath(this.f19875h, this.f19824E);
        }
        canvas.restoreToCount(iSave);
        if (L6.b.d()) {
            L6.b.b();
        }
    }

    @Override // V5.m
    boolean f() {
        return super.f() && this.f19825F != null;
    }

    @Override // V5.m
    protected void h() {
        super.h();
        if (this.f19827H) {
            return;
        }
        if (this.f19828I == null) {
            this.f19828I = new RectF();
        }
        this.f19891x.mapRect(this.f19828I, this.f19881n);
    }

    @Override // V5.m, V5.i
    public void m(boolean z10) {
        this.f19827H = z10;
    }

    @Override // V5.m, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        super.setAlpha(i10);
        if (i10 != this.f19823D.getAlpha()) {
            this.f19823D.setAlpha(i10);
            super.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // V5.m, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f19823D.setColorFilter(colorFilter);
    }
}
