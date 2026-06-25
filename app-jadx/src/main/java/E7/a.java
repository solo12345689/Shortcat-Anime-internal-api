package E7;

import H7.j;
import H7.p;
import H7.q;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.B;
import ke.AbstractC5466a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f5697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private H7.h f5698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f5699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RectF f5700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p f5701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f5702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f5703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private RectF f5704i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Path f5705j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Paint f5706k;

    public a(Context context, j jVar, H7.h hVar) {
        AbstractC5504s.h(context, "context");
        this.f5696a = context;
        this.f5697b = jVar;
        this.f5698c = hVar;
        this.f5699d = 0.8f;
        this.f5702g = true;
        this.f5704i = new RectF();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.f5703h);
        this.f5706k = paint;
    }

    private final RectF a() {
        H7.h hVar = this.f5698c;
        RectF rectFA = hVar != null ? hVar.a(getLayoutDirection(), this.f5696a) : null;
        return new RectF(rectFA != null ? B.f37368a.b(rectFA.left) : 0.0f, rectFA != null ? B.f37368a.b(rectFA.top) : 0.0f, rectFA != null ? B.f37368a.b(rectFA.right) : 0.0f, rectFA != null ? B.f37368a.b(rectFA.bottom) : 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void f() {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E7.a.f():void");
    }

    public final int b() {
        return this.f5703h;
    }

    public final void c(int i10) {
        if (this.f5703h != i10) {
            this.f5703h = i10;
            this.f5706k.setColor(i10);
            invalidateSelf();
        }
    }

    public final void d(H7.h hVar) {
        this.f5698c = hVar;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        j jVar;
        q qVarC;
        q qVarC2;
        AbstractC5504s.h(canvas, "canvas");
        f();
        canvas.save();
        if (this.f5706k.getAlpha() != 0) {
            p pVar = this.f5701f;
            if (pVar == null || !pVar.f() || (jVar = this.f5697b) == null || !jVar.b()) {
                j jVar2 = this.f5697b;
                if (jVar2 == null || !jVar2.b()) {
                    canvas.drawRect(this.f5704i, this.f5706k);
                } else {
                    Path path = this.f5705j;
                    if (path == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    canvas.drawPath(path, this.f5706k);
                }
            } else {
                RectF rectF = this.f5704i;
                p pVar2 = this.f5701f;
                float fB = 0.0f;
                float fB2 = (pVar2 == null || (qVarC2 = pVar2.c()) == null) ? 0.0f : B.f37368a.b(qVarC2.a());
                p pVar3 = this.f5701f;
                if (pVar3 != null && (qVarC = pVar3.c()) != null) {
                    fB = B.f37368a.b(qVarC.b());
                }
                canvas.drawRoundRect(rectF, fB2, fB, this.f5706k);
            }
        }
        canvas.restore();
    }

    public final void e(j jVar) {
        this.f5697b = jVar;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int alpha = this.f5706k.getAlpha();
        if (alpha == 255) {
            return -1;
        }
        return (1 > alpha || alpha >= 255) ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f5702g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        AbstractC5504s.h(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.f5702g = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f5706k.setAlpha(AbstractC5466a.d((i10 / 255.0f) * (Color.alpha(this.f5703h) / 255.0f) * 255.0f));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
