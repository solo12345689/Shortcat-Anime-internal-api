package E7;

import H7.j;
import H7.p;
import H7.q;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.B;
import com.facebook.react.uimanager.C3294j;
import ke.AbstractC5466a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f5783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f5784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f5785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f5786f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j f5787g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f5788h;

    public i(Context context, int i10, float f10, float f11, float f12, float f13, j jVar) {
        AbstractC5504s.h(context, "context");
        this.f5781a = context;
        this.f5782b = i10;
        this.f5783c = f10;
        this.f5784d = f11;
        this.f5785e = f12;
        this.f5786f = f13;
        this.f5787g = jVar;
        Paint paint = new Paint();
        paint.setColor(i10);
        float fX = C3294j.f37696a.x(f12 * 0.5f);
        if (fX > 0.0f) {
            paint.setMaskFilter(new BlurMaskFilter(fX, BlurMaskFilter.Blur.NORMAL));
        }
        this.f5788h = paint;
    }

    private final void a(Canvas canvas, RectF rectF) {
        canvas.clipOutRect(getBounds());
        canvas.drawRect(rectF, this.f5788h);
    }

    private final void b(Canvas canvas, RectF rectF, float f10, p pVar) {
        RectF rectF2 = new RectF(getBounds());
        rectF2.inset(0.4f, 0.4f);
        Path path = new Path();
        float[] fArr = {pVar.c().a(), pVar.c().b(), pVar.d().a(), pVar.d().b(), pVar.b().a(), pVar.b().b(), pVar.a().a(), pVar.a().b()};
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF2, fArr, direction);
        canvas.clipOutPath(path);
        Path path2 = new Path();
        path2.addRoundRect(rectF, new float[]{d.a(pVar.c().a(), f10), d.a(pVar.c().b(), f10), d.a(pVar.d().a(), f10), d.a(pVar.d().b(), f10), d.a(pVar.b().a(), f10), d.a(pVar.b().b(), f10), d.a(pVar.a().a(), f10), d.a(pVar.a().b(), f10)}, direction);
        canvas.drawPath(path2, this.f5788h);
    }

    public final void c(j jVar) {
        this.f5787g = jVar;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        p pVarC;
        AbstractC5504s.h(canvas, "canvas");
        B b10 = B.f37368a;
        float fE = b10.e(getBounds().width());
        float fE2 = b10.e(getBounds().height());
        j jVar = this.f5787g;
        p pVar = (jVar == null || (pVarC = jVar.c(getLayoutDirection(), this.f5781a, fE, fE2)) == null) ? null : new p(new q(b10.b(pVarC.c().a()), b10.b(pVarC.c().b())), new q(b10.b(pVarC.d().a()), b10.b(pVarC.d().b())), new q(b10.b(pVarC.a().a()), b10.b(pVarC.a().b())), new q(b10.b(pVarC.b().a()), b10.b(pVarC.b().b())));
        float fB = b10.b(this.f5786f);
        RectF rectF = new RectF(getBounds());
        float f10 = -fB;
        rectF.inset(f10, f10);
        rectF.offset(b10.b(this.f5783c), b10.b(this.f5784d));
        int iSave = canvas.save();
        if (pVar == null || !pVar.e()) {
            a(canvas, rectF);
        } else {
            b(canvas, rectF, fB, pVar);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int alpha = this.f5788h.getAlpha();
        if (alpha == 255) {
            return -1;
        }
        return (1 > alpha || alpha >= 255) ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f5788h.setAlpha(AbstractC5466a.d((i10 / 255.0f) * (Color.alpha(this.f5782b) / 255.0f) * 255.0f));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5788h.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
