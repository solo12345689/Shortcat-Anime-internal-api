package E7;

import H7.j;
import H7.p;
import H7.q;
import Ud.AbstractC2279u;
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
import java.util.ArrayList;
import ke.AbstractC5466a;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f5761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f5762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f5763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f5764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private H7.h f5765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private j f5766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Paint f5767i;

    public f(Context context, int i10, float f10, float f11, float f12, float f13, H7.h hVar, j jVar) {
        AbstractC5504s.h(context, "context");
        this.f5759a = context;
        this.f5760b = i10;
        this.f5761c = f10;
        this.f5762d = f11;
        this.f5763e = f12;
        this.f5764f = f13;
        this.f5765g = hVar;
        this.f5766h = jVar;
        Paint paint = new Paint();
        paint.setColor(i10);
        float fX = C3294j.f37696a.x(f12 * 0.5f);
        if (fX > 0.0f) {
            paint.setMaskFilter(new BlurMaskFilter(fX, BlurMaskFilter.Blur.NORMAL));
        }
        this.f5767i = paint;
    }

    private final RectF a() {
        RectF rectFA;
        H7.h hVar = this.f5765g;
        if (hVar == null || (rectFA = hVar.a(getLayoutDirection(), this.f5759a)) == null) {
            return null;
        }
        B b10 = B.f37368a;
        return new RectF(b10.b(rectFA.left), b10.b(rectFA.top), b10.b(rectFA.right), b10.b(rectFA.bottom));
    }

    private final p b() {
        p pVarC;
        j jVar = this.f5766h;
        if (jVar != null) {
            int layoutDirection = getLayoutDirection();
            Context context = this.f5759a;
            B b10 = B.f37368a;
            pVarC = jVar.c(layoutDirection, context, b10.e(getBounds().width()), b10.e(getBounds().height()));
        } else {
            pVarC = null;
        }
        if (pVarC == null || !pVarC.e()) {
            return null;
        }
        B b11 = B.f37368a;
        return new p(new q(b11.b(pVarC.c().a()), b11.b(pVarC.c().b())), new q(b11.b(pVarC.d().a()), b11.b(pVarC.d().b())), new q(b11.b(pVarC.a().a()), b11.b(pVarC.a().b())), new q(b11.b(pVarC.b().a()), b11.b(pVarC.b().b())));
    }

    private final float c(float f10, Float f11) {
        return AbstractC5874j.d(f10 - (f11 != null ? f11.floatValue() : 0.0f), 0.0f);
    }

    public final void d(H7.h hVar) {
        this.f5765g = hVar;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Canvas canvas2;
        AbstractC5504s.h(canvas, "canvas");
        p pVarB = b();
        RectF rectFA = a();
        RectF rectF = new RectF(getBounds().left + (rectFA != null ? rectFA.left : 0.0f), getBounds().top + (rectFA != null ? rectFA.top : 0.0f), getBounds().right - (rectFA != null ? rectFA.right : 0.0f), getBounds().bottom - (rectFA != null ? rectFA.bottom : 0.0f));
        float[] fArr = pVarB != null ? new float[]{c(pVarB.c().a(), rectFA != null ? Float.valueOf(rectFA.left) : null), c(pVarB.c().b(), rectFA != null ? Float.valueOf(rectFA.top) : null), c(pVarB.d().a(), rectFA != null ? Float.valueOf(rectFA.right) : null), c(pVarB.d().b(), rectFA != null ? Float.valueOf(rectFA.top) : null), c(pVarB.b().a(), rectFA != null ? Float.valueOf(rectFA.right) : null), c(pVarB.b().b(), rectFA != null ? Float.valueOf(rectFA.bottom) : null), c(pVarB.a().a(), rectFA != null ? Float.valueOf(rectFA.left) : null), c(pVarB.a().b(), rectFA != null ? Float.valueOf(rectFA.bottom) : null)} : null;
        B b10 = B.f37368a;
        float fB = b10.b(this.f5761c);
        float fB2 = b10.b(this.f5762d);
        float fB3 = b10.b(this.f5764f);
        RectF rectF2 = new RectF(rectF);
        if (2 * fB3 > rectF.width()) {
            rectF2.setEmpty();
        } else {
            rectF2.inset(fB3, fB3);
        }
        rectF2.offset(fB, fB2);
        float fX = C3294j.f37696a.x(this.f5763e);
        RectF rectF3 = new RectF(rectF2);
        rectF3.set(rectF);
        float f10 = -fX;
        rectF3.inset(f10, f10);
        rectF3.union(new RectF(rectF2));
        int iSave = canvas.save();
        if (fArr != null) {
            Path path = new Path();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.clipPath(path);
            ArrayList arrayList = new ArrayList(fArr.length);
            for (float f11 : fArr) {
                arrayList.add(Float.valueOf(d.a(f11, -fB3)));
            }
            canvas2 = canvas;
            canvas2.drawDoubleRoundRect(rectF3, g.f5768a, rectF2, AbstractC2279u.Y0(arrayList), this.f5767i);
        } else {
            canvas2 = canvas;
            canvas2.clipRect(rectF);
            canvas2.drawDoubleRoundRect(rectF3, g.f5768a, rectF2, g.f5768a, this.f5767i);
        }
        canvas2.restoreToCount(iSave);
    }

    public final void e(j jVar) {
        this.f5766h = jVar;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int alpha = this.f5767i.getAlpha();
        if (alpha == 255) {
            return -1;
        }
        return (1 > alpha || alpha >= 255) ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f5767i.setAlpha(AbstractC5466a.d((i10 / 255.0f) * (Color.alpha(this.f5760b) / 255.0f) * 255.0f));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5767i.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
