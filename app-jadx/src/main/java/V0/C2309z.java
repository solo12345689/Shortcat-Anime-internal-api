package V0;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;

/* JADX INFO: renamed from: V0.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2309z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2309z f19693a = new C2309z();

    private C2309z() {
    }

    public final void a(Canvas canvas) {
        canvas.disableZ();
    }

    public final void b(Canvas canvas, int i10, BlendMode blendMode) {
        canvas.drawColor(i10, blendMode);
    }

    public final void c(Canvas canvas, long j10) {
        canvas.drawColor(j10);
    }

    public final void d(Canvas canvas, long j10, BlendMode blendMode) {
        canvas.drawColor(j10, blendMode);
    }

    public final void e(Canvas canvas, RectF rectF, float f10, float f11, RectF rectF2, float f12, float f13, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f10, f11, rectF2, f12, f13, paint);
    }

    public final void f(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public final void g(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public final void h(Canvas canvas, MeasuredText measuredText, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        canvas.drawTextRun(measuredText, i10, i11, i12, i13, f10, f11, z10, paint);
    }

    public final void i(Canvas canvas) {
        canvas.enableZ();
    }
}
