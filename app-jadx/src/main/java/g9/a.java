package G9;

import A1.AbstractC1002a;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f7424i = new int[3];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float[] f7425j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f7426k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f7427l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f7428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f7429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f7430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f7433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Path f7434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f7435h;

    public a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i10, float f10, float f11) {
        float f12;
        boolean z10 = f11 < 0.0f;
        Path path = this.f7434g;
        if (z10) {
            int[] iArr = f7426k;
            iArr[0] = 0;
            iArr[1] = this.f7433f;
            iArr[2] = this.f7432e;
            iArr[3] = this.f7431d;
            f12 = f10;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            f12 = f10;
            path.arcTo(rectF, f12, f11);
            path.close();
            float f13 = -i10;
            rectF.inset(f13, f13);
            int[] iArr2 = f7426k;
            iArr2[0] = 0;
            iArr2[1] = this.f7431d;
            iArr2[2] = this.f7432e;
            iArr2[3] = this.f7433f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f14 = 1.0f - (i10 / fWidth);
        float[] fArr = f7427l;
        fArr[1] = f14;
        fArr[2] = ((1.0f - f14) / 2.0f) + f14;
        this.f7429b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f7426k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f7435h);
        }
        canvas.drawArc(rectF, f12, f11, true, this.f7429b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = f7424i;
        iArr[0] = this.f7433f;
        iArr[1] = this.f7432e;
        iArr[2] = this.f7431d;
        Paint paint = this.f7430c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f7425j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f7430c);
        canvas.restore();
    }

    public Paint c() {
        return this.f7428a;
    }

    public void d(int i10) {
        this.f7431d = AbstractC1002a.k(i10, 68);
        this.f7432e = AbstractC1002a.k(i10, 20);
        this.f7433f = AbstractC1002a.k(i10, 0);
        this.f7428a.setColor(this.f7431d);
    }

    public a(int i10) {
        this.f7434g = new Path();
        Paint paint = new Paint();
        this.f7435h = paint;
        this.f7428a = new Paint();
        d(i10);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f7429b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f7430c = new Paint(paint2);
    }
}
