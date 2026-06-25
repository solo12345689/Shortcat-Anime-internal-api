package E7;

import H7.j;
import H7.p;
import H7.q;
import H7.u;
import Td.r;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.B;
import ke.AbstractC5466a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f5770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f5771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f5772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private u f5773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f5774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f5775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f5776h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p f5777i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private RectF f5778j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Path f5779k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5780a;

        static {
            int[] iArr = new int[u.values().length];
            try {
                iArr[u.f8130b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.f8131c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u.f8132d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5780a = iArr;
        }
    }

    public h(Context context, j jVar, int i10, float f10, u outlineStyle, float f11) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(outlineStyle, "outlineStyle");
        this.f5769a = context;
        this.f5770b = jVar;
        this.f5771c = 0.8f;
        this.f5772d = f10;
        this.f5773e = outlineStyle;
        this.f5774f = i10;
        this.f5775g = f11;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(i10);
        paint.setStrokeWidth(f11);
        paint.setPathEffect(d(outlineStyle, f11));
        this.f5776h = paint;
        this.f5778j = new RectF();
        this.f5779k = new Path();
    }

    private final float a(float f10, float f11, float f12) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        return f10 + (f11 * 0.5f) + f12;
    }

    private final void b(Canvas canvas) {
        this.f5779k.addRect(this.f5778j, Path.Direction.CW);
        canvas.drawPath(this.f5779k, this.f5776h);
    }

    private final void c(Canvas canvas) {
        q qVar;
        q qVar2;
        q qVar3;
        q qVar4;
        q qVarB;
        q qVarA;
        q qVarD;
        q qVarC;
        p pVar = this.f5777i;
        if (pVar == null || (qVarC = pVar.c()) == null || (qVar = qVarC.c()) == null) {
            qVar = new q(0.0f, 0.0f);
        }
        p pVar2 = this.f5777i;
        if (pVar2 == null || (qVarD = pVar2.d()) == null || (qVar2 = qVarD.c()) == null) {
            qVar2 = new q(0.0f, 0.0f);
        }
        p pVar3 = this.f5777i;
        if (pVar3 == null || (qVarA = pVar3.a()) == null || (qVar3 = qVarA.c()) == null) {
            qVar3 = new q(0.0f, 0.0f);
        }
        p pVar4 = this.f5777i;
        if (pVar4 == null || (qVarB = pVar4.b()) == null || (qVar4 = qVarB.c()) == null) {
            qVar4 = new q(0.0f, 0.0f);
        }
        this.f5779k.addRoundRect(this.f5778j, new float[]{a(qVar.a(), this.f5775g, this.f5772d), a(qVar.b(), this.f5775g, this.f5772d), a(qVar2.a(), this.f5775g, this.f5772d), a(qVar2.b(), this.f5775g, this.f5772d), a(qVar4.a(), this.f5775g, this.f5772d), a(qVar4.b(), this.f5775g, this.f5772d), a(qVar3.a(), this.f5775g, this.f5772d), a(qVar3.b(), this.f5775g, this.f5772d)}, Path.Direction.CW);
        canvas.drawPath(this.f5779k, this.f5776h);
    }

    private final PathEffect d(u uVar, float f10) {
        int i10 = a.f5780a[uVar.ordinal()];
        if (i10 == 1) {
            return null;
        }
        if (i10 == 2) {
            float f11 = f10 * 3;
            return new DashPathEffect(new float[]{f11, f11, f11, f11}, 0.0f);
        }
        if (i10 == 3) {
            return new DashPathEffect(new float[]{f10, f10, f10, f10}, 0.0f);
        }
        throw new r();
    }

    private final void j() {
        this.f5778j.set(getBounds());
        RectF rectF = this.f5778j;
        float f10 = rectF.top;
        float f11 = this.f5775g;
        float f12 = this.f5772d;
        float f13 = this.f5771c;
        rectF.top = f10 - (((f11 * 0.5f) + f12) - f13);
        rectF.bottom += ((f11 * 0.5f) + f12) - f13;
        rectF.left -= ((f11 * 0.5f) + f12) - f13;
        rectF.right += ((f11 * 0.5f) + f12) - f13;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        p pVarC;
        AbstractC5504s.h(canvas, "canvas");
        if (this.f5775g == 0.0f) {
            return;
        }
        this.f5779k.reset();
        j jVar = this.f5770b;
        if (jVar != null) {
            int layoutDirection = getLayoutDirection();
            Context context = this.f5769a;
            B b10 = B.f37368a;
            pVarC = jVar.c(layoutDirection, context, b10.f(getBounds().width()), b10.f(getBounds().height()));
        } else {
            pVarC = null;
        }
        this.f5777i = pVarC;
        j();
        p pVar = this.f5777i;
        if (pVar == null || pVar == null || !pVar.e()) {
            b(canvas);
        } else {
            c(canvas);
        }
    }

    public final void e(j jVar) {
        this.f5770b = jVar;
    }

    public final void f(int i10) {
        if (i10 != this.f5774f) {
            this.f5774f = i10;
            this.f5776h.setColor(i10);
            invalidateSelf();
        }
    }

    public final void g(float f10) {
        if (f10 == this.f5772d) {
            return;
        }
        this.f5772d = f10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int alpha = this.f5776h.getAlpha();
        if (alpha == 255) {
            return -1;
        }
        return (1 > alpha || alpha >= 255) ? -2 : -3;
    }

    public final void h(u value) {
        AbstractC5504s.h(value, "value");
        if (value != this.f5773e) {
            this.f5773e = value;
            this.f5776h.setPathEffect(d(value, this.f5775g));
            invalidateSelf();
        }
    }

    public final void i(float f10) {
        if (f10 == this.f5775g) {
            return;
        }
        this.f5775g = f10;
        this.f5776h.setStrokeWidth(f10);
        this.f5776h.setPathEffect(d(this.f5773e, f10));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f5776h.setAlpha(AbstractC5466a.d((i10 / 255.0f) * (Color.alpha(this.f5774f) / 255.0f) * 255.0f));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5776h.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
