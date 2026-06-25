package E7;

import H7.e;
import H7.j;
import H7.p;
import H7.q;
import Td.z;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.B;
import com.facebook.react.uimanager.C3295k;
import com.facebook.react.uimanager.C3303t;
import com.facebook.react.uimanager.EnumC3304u;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f5708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private H7.h f5709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Path f5711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RectF f5712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RectF f5713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f5714h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f5715i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List f5716j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f5717k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Paint f5718l;

    public b(Context context, j jVar, H7.h hVar) {
        AbstractC5504s.h(context, "context");
        this.f5707a = context;
        this.f5708b = jVar;
        this.f5709c = hVar;
        this.f5710d = true;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.f5718l = paint;
    }

    private final Pair a(float f10, float f11, float f12, float f13, H7.e eVar, H7.c cVar) {
        if (eVar instanceof e.b) {
            e.b bVar = (e.b) eVar;
            C3303t c3303tA = bVar.a().a();
            C3303t c3303tB = bVar.a().b();
            if (c3303tA != null && c3303tB != null) {
                f12 = e(c3303tA, f10);
                f13 = e(c3303tB, f11);
            }
        }
        H7.d dVarA = cVar != null ? cVar.a() : null;
        H7.d dVar = H7.d.f8031c;
        if (dVarA == dVar && f12 > 0.0f && !C3295k.a(f10 % f12, 0.0f)) {
            float fRint = (float) Math.rint(f10 / f12);
            if (fRint > 0.0f) {
                f12 = f10 / fRint;
            }
        }
        if ((cVar != null ? cVar.b() : null) == dVar && f13 > 0.0f && !C3295k.a(f11 % f13, 0.0f)) {
            float fRint2 = (float) Math.rint(f11 / f13);
            if (fRint2 > 0.0f) {
                f13 = f11 / fRint2;
            }
        }
        return z.a(Float.valueOf(f12), Float.valueOf(f13));
    }

    private final Pair b(float f10, float f11, H7.b bVar) {
        float fE;
        float fE2 = 0.0f;
        Float fValueOf = Float.valueOf(0.0f);
        RectF rectF = this.f5712f;
        if (rectF == null) {
            return z.a(fValueOf, fValueOf);
        }
        float fWidth = rectF.width() - f10;
        float fHeight = rectF.height() - f11;
        if ((bVar != null ? bVar.b() : null) != null) {
            fE = e(bVar.b(), fWidth);
        } else {
            fE = (bVar != null ? bVar.c() : null) != null ? fWidth - e(bVar.c(), fWidth) : 0.0f;
        }
        float f12 = fE + rectF.left;
        if ((bVar != null ? bVar.d() : null) != null) {
            fE2 = e(bVar.d(), fHeight);
        } else {
            if ((bVar != null ? bVar.a() : null) != null) {
                fE2 = fHeight - e(bVar.a(), fHeight);
            }
        }
        return z.a(Float.valueOf(f12), Float.valueOf(fE2 + rectF.top));
    }

    private final RectF c() {
        H7.h hVar = this.f5709c;
        RectF rectFA = hVar != null ? hVar.a(getLayoutDirection(), this.f5707a) : null;
        return new RectF(rectFA != null ? B.f37368a.b(rectFA.left) : 0.0f, rectFA != null ? B.f37368a.b(rectFA.top) : 0.0f, rectFA != null ? B.f37368a.b(rectFA.right) : 0.0f, rectFA != null ? B.f37368a.b(rectFA.bottom) : 0.0f);
    }

    private final boolean d(RectF rectF, RectF rectF2) {
        return C3295k.a(rectF.width(), 0.0f) || rectF.width() < 0.0f || C3295k.a(rectF.height(), 0.0f) || rectF.height() < 0.0f || C3295k.a(rectF2.width(), 0.0f) || rectF2.width() < 0.0f || C3295k.a(rectF2.height(), 0.0f) || rectF2.height() < 0.0f;
    }

    private final float e(C3303t c3303t, float f10) {
        return c3303t.a() == EnumC3304u.f37833b ? c3303t.b(f10) : B.f37368a.b(c3303t.b(f10));
    }

    private final void l() {
        p pVarC;
        q qVarA;
        q qVarA2;
        q qVarB;
        q qVarB2;
        q qVarD;
        q qVarD2;
        q qVarC;
        q qVarC2;
        if (this.f5710d) {
            this.f5710d = false;
            RectF rectFC = c();
            this.f5712f = new RectF(getBounds().left + rectFC.left, getBounds().top + rectFC.top, getBounds().right - rectFC.right, getBounds().bottom - rectFC.bottom);
            this.f5713g = new RectF(getBounds());
            j jVar = this.f5708b;
            if (jVar != null) {
                int layoutDirection = getLayoutDirection();
                Context context = this.f5707a;
                B b10 = B.f37368a;
                pVarC = jVar.c(layoutDirection, context, b10.f(getBounds().width()), b10.f(getBounds().height()));
            } else {
                pVarC = null;
            }
            j jVar2 = this.f5708b;
            if (jVar2 == null || !jVar2.b()) {
                RectF rectF = this.f5713g;
                if (rectF == null) {
                    return;
                }
                Path path = new Path();
                this.f5711e = path;
                path.addRect(rectF, Path.Direction.CW);
                return;
            }
            RectF rectF2 = this.f5713g;
            if (rectF2 == null) {
                return;
            }
            Path path2 = new Path();
            this.f5711e = path2;
            float fB = 0.0f;
            float fB2 = (pVarC == null || (qVarC2 = pVarC.c()) == null) ? 0.0f : B.f37368a.b(qVarC2.a());
            float fB3 = (pVarC == null || (qVarC = pVarC.c()) == null) ? 0.0f : B.f37368a.b(qVarC.b());
            float fB4 = (pVarC == null || (qVarD2 = pVarC.d()) == null) ? 0.0f : B.f37368a.b(qVarD2.a());
            float fB5 = (pVarC == null || (qVarD = pVarC.d()) == null) ? 0.0f : B.f37368a.b(qVarD.b());
            float fB6 = (pVarC == null || (qVarB2 = pVarC.b()) == null) ? 0.0f : B.f37368a.b(qVarB2.a());
            float fB7 = (pVarC == null || (qVarB = pVarC.b()) == null) ? 0.0f : B.f37368a.b(qVarB.b());
            float fB8 = (pVarC == null || (qVarA2 = pVarC.a()) == null) ? 0.0f : B.f37368a.b(qVarA2.a());
            if (pVarC != null && (qVarA = pVarC.a()) != null) {
                fB = B.f37368a.b(qVarA.b());
            }
            path2.addRoundRect(rectF2, new float[]{fB2, fB3, fB4, fB5, fB6, fB7, fB8, fB}, Path.Direction.CW);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0232  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r24) {
        /*
            Method dump skipped, instruction units count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E7.b.draw(android.graphics.Canvas):void");
    }

    public final void f(List list) {
        if (AbstractC5504s.c(this.f5714h, list)) {
            return;
        }
        this.f5714h = list;
        invalidateSelf();
    }

    public final void g(List list) {
        if (AbstractC5504s.c(this.f5716j, list)) {
            return;
        }
        this.f5716j = list;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int alpha = this.f5718l.getAlpha();
        if (alpha == 255) {
            return -1;
        }
        return (1 > alpha || alpha >= 255) ? -2 : -3;
    }

    public final void h(List list) {
        if (AbstractC5504s.c(this.f5717k, list)) {
            return;
        }
        this.f5717k = list;
        invalidateSelf();
    }

    public final void i(List list) {
        if (AbstractC5504s.c(this.f5715i, list)) {
            return;
        }
        this.f5715i = list;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f5710d = true;
        super.invalidateSelf();
    }

    public final void j(H7.h hVar) {
        this.f5709c = hVar;
    }

    public final void k(j jVar) {
        this.f5708b = jVar;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        AbstractC5504s.h(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.f5710d = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f5718l.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
