package W5;

import V5.InterfaceC2312c;
import V5.g;
import V5.i;
import V5.j;
import V5.k;
import V5.l;
import V5.n;
import V5.o;
import V5.q;
import W5.d;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Drawable f20776a = new ColorDrawable(0);

    private static Drawable a(Drawable drawable, d dVar, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            j jVar = new j(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint(), dVar.i());
            b(jVar, dVar);
            return jVar;
        }
        if (drawable instanceof NinePatchDrawable) {
            n nVar = new n((NinePatchDrawable) drawable);
            b(nVar, dVar);
            return nVar;
        }
        if (!(drawable instanceof ColorDrawable)) {
            AbstractC7283a.K("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
        k kVarA = k.a((ColorDrawable) drawable);
        b(kVarA, dVar);
        return kVarA;
    }

    static void b(i iVar, d dVar) {
        iVar.e(dVar.j());
        iVar.t(dVar.d());
        iVar.c(dVar.b(), dVar.c());
        iVar.j(dVar.g());
        iVar.p(dVar.l());
        iVar.o(dVar.h());
        iVar.m(dVar.i());
    }

    static InterfaceC2312c c(InterfaceC2312c interfaceC2312c) {
        while (true) {
            Object objB = interfaceC2312c.b();
            if (objB == interfaceC2312c || !(objB instanceof InterfaceC2312c)) {
                break;
            }
            interfaceC2312c = (InterfaceC2312c) objB;
        }
        return interfaceC2312c;
    }

    static Drawable d(Drawable drawable, d dVar, Resources resources) {
        try {
            if (L6.b.d()) {
                L6.b.a("WrappingUtils#maybeApplyLeafRounding");
            }
            if (drawable != null && dVar != null && dVar.k() == d.a.BITMAP_ONLY) {
                if (drawable instanceof g) {
                    InterfaceC2312c interfaceC2312cC = c((g) drawable);
                    interfaceC2312cC.i(a(interfaceC2312cC.i(f20776a), dVar, resources));
                    return drawable;
                }
                Drawable drawableA = a(drawable, dVar, resources);
                if (L6.b.d()) {
                    L6.b.b();
                }
                return drawableA;
            }
            if (L6.b.d()) {
                L6.b.b();
            }
            return drawable;
        } finally {
            if (L6.b.d()) {
                L6.b.b();
            }
        }
    }

    static Drawable e(Drawable drawable, d dVar) {
        try {
            if (L6.b.d()) {
                L6.b.a("WrappingUtils#maybeWrapWithRoundedOverlayColor");
            }
            if (drawable != null && dVar != null && dVar.k() == d.a.OVERLAY_COLOR) {
                l lVar = new l(drawable);
                b(lVar, dVar);
                lVar.y(dVar.f());
                return lVar;
            }
            if (L6.b.d()) {
                L6.b.b();
            }
            return drawable;
        } finally {
            if (L6.b.d()) {
                L6.b.b();
            }
        }
    }

    static Drawable f(Drawable drawable, q qVar) {
        return g(drawable, qVar, null);
    }

    static Drawable g(Drawable drawable, q qVar, PointF pointF) {
        if (L6.b.d()) {
            L6.b.a("WrappingUtils#maybeWrapWithScaleType");
        }
        if (drawable == null || qVar == null) {
            if (L6.b.d()) {
                L6.b.b();
            }
            return drawable;
        }
        o oVar = new o(drawable, qVar);
        if (pointF != null) {
            oVar.B(pointF);
        }
        if (L6.b.d()) {
            L6.b.b();
        }
        return oVar;
    }

    static void h(i iVar) {
        iVar.e(false);
        iVar.k(0.0f);
        iVar.c(0, 0.0f);
        iVar.j(0.0f);
        iVar.p(false);
        iVar.o(false);
        iVar.m(j.i());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void i(InterfaceC2312c interfaceC2312c, d dVar, Resources resources) {
        InterfaceC2312c interfaceC2312cC = c(interfaceC2312c);
        Drawable drawableB = interfaceC2312cC.b();
        if (dVar == null || dVar.k() != d.a.BITMAP_ONLY) {
            if (drawableB instanceof i) {
                h((i) drawableB);
            }
        } else if (drawableB instanceof i) {
            b((i) drawableB, dVar);
        } else if (drawableB != 0) {
            interfaceC2312cC.i(f20776a);
            interfaceC2312cC.i(a(drawableB, dVar, resources));
        }
    }

    static void j(InterfaceC2312c interfaceC2312c, d dVar) {
        Drawable drawableB = interfaceC2312c.b();
        if (dVar == null || dVar.k() != d.a.OVERLAY_COLOR) {
            if (drawableB instanceof l) {
                Drawable drawable = f20776a;
                interfaceC2312c.i(((l) drawableB).v(drawable));
                drawable.setCallback(null);
                return;
            }
            return;
        }
        if (!(drawableB instanceof l)) {
            interfaceC2312c.i(e(interfaceC2312c.i(f20776a), dVar));
            return;
        }
        l lVar = (l) drawableB;
        b(lVar, dVar);
        lVar.y(dVar.f());
    }

    static o k(InterfaceC2312c interfaceC2312c, q qVar) {
        Drawable drawableF = f(interfaceC2312c.i(f20776a), qVar);
        interfaceC2312c.i(drawableF);
        y5.k.h(drawableF, "Parent has no child drawable!");
        return (o) drawableF;
    }
}
