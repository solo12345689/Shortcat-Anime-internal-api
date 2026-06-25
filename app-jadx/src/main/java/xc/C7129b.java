package xc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: renamed from: xc.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class C7129b extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f64331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Path f64332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RectF f64333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float[] f64334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f64335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f64336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f64337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int[] f64338h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float[] f64339i;

    public C7129b(Context context) {
        super(context);
        this.f64331a = new Paint(5);
        this.f64335e = new float[]{0.5f, 0.0f};
        this.f64336f = new float[]{0.5f, 1.0f};
        this.f64338h = new int[]{0, 0};
        this.f64339i = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    private void a() {
        int[] iArr = this.f64337g;
        if (iArr != null) {
            float[] fArr = this.f64334d;
            if (fArr == null || iArr.length == fArr.length) {
                float[] fArr2 = this.f64335e;
                float f10 = fArr2[0];
                int[] iArr2 = this.f64338h;
                int i10 = iArr2[0];
                float f11 = fArr2[1];
                int i11 = iArr2[1];
                float[] fArr3 = this.f64336f;
                this.f64331a.setShader(new LinearGradient(f10 * i10, f11 * i11, i10 * fArr3[0], fArr3[1] * i11, this.f64337g, this.f64334d, Shader.TileMode.CLAMP));
                invalidate();
            }
        }
    }

    private float d(float f10) {
        return TypedValue.applyDimension(1, f10, getContext().getResources().getDisplayMetrics());
    }

    private void e() {
        if (this.f64332b == null) {
            this.f64332b = new Path();
            this.f64333c = new RectF();
        }
        this.f64332b.reset();
        RectF rectF = this.f64333c;
        int[] iArr = this.f64338h;
        rectF.set(0.0f, 0.0f, iArr[0], iArr[1]);
        this.f64332b.addRoundRect(this.f64333c, this.f64339i, Path.Direction.CW);
    }

    public void b(float f10, float f11) {
        this.f64336f = new float[]{f10, f11};
        a();
    }

    public void c(float f10, float f11) {
        this.f64335e = new float[]{f10, f11};
        a();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.f64332b;
        if (path == null) {
            canvas.drawPaint(this.f64331a);
        } else {
            canvas.drawPath(path, this.f64331a);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        this.f64338h = new int[]{i10, i11};
        e();
        a();
    }

    public void setBorderRadii(float[] fArr) {
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr[i10] = d(fArr[i10]);
        }
        this.f64339i = fArr;
        e();
        a();
    }

    public void setColors(int[] iArr) {
        this.f64337g = iArr;
        a();
    }

    public void setDither(boolean z10) {
        this.f64331a.setDither(z10);
        a();
    }

    public void setLocations(float[] fArr) {
        this.f64334d = fArr;
        a();
    }
}
