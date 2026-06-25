package com.facebook.react.uimanager;

import H7.l;
import Ud.AbstractC2279u;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: renamed from: com.facebook.react.uimanager.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3281a {

    /* JADX INFO: renamed from: a */
    public static final C3281a f37550a = new C3281a();

    private C3281a() {
    }

    public static final void A(View view, H7.u uVar) {
        AbstractC5504s.h(view, "view");
        if (C7.a.c(view) != 2) {
            return;
        }
        E7.h hVarG = f37550a.g(view);
        if (uVar != null) {
            hVarG.h(uVar);
        }
    }

    public static final void B(View view, float f10) {
        AbstractC5504s.h(view, "view");
        if (C7.a.c(view) != 2) {
            return;
        }
        f37550a.g(view).i(B.f37368a.b(f10));
    }

    public static final void a(View view, Canvas canvas) {
        RectF rectFA;
        float fB;
        float fB2;
        float fB3;
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(canvas, "canvas");
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        C3281a c3281a = f37550a;
        E7.e eVarJ = c3281a.j(view);
        if (eVarJ == null) {
            canvas.clipRect(rect);
            return;
        }
        RectF rectF = new RectF();
        H7.h hVarD = eVarJ.d();
        if (hVarD != null) {
            int layoutDirection = eVarJ.getLayoutDirection();
            Context context = view.getContext();
            AbstractC5504s.g(context, "getContext(...)");
            rectFA = hVarD.a(layoutDirection, context);
        } else {
            rectFA = null;
        }
        float f10 = eVarJ.getBounds().left;
        float fB4 = 0.0f;
        if (rectFA != null) {
            fB = B.f37368a.b(rectFA.left);
        } else {
            fB = 0.0f;
        }
        rectF.left = f10 + fB;
        float f11 = eVarJ.getBounds().top;
        if (rectFA != null) {
            fB2 = B.f37368a.b(rectFA.top);
        } else {
            fB2 = 0.0f;
        }
        rectF.top = f11 + fB2;
        float f12 = eVarJ.getBounds().right;
        if (rectFA != null) {
            fB3 = B.f37368a.b(rectFA.right);
        } else {
            fB3 = 0.0f;
        }
        rectF.right = f12 - fB3;
        float f13 = eVarJ.getBounds().bottom;
        if (rectFA != null) {
            fB4 = B.f37368a.b(rectFA.bottom);
        }
        rectF.bottom = f13 - fB4;
        H7.j jVarE = eVarJ.e();
        if (jVarE == null || !jVarE.b()) {
            rectF.offset(rect.left, rect.top);
            canvas.clipRect(rectF);
        } else {
            Path pathB = c3281a.b(view, eVarJ, rectF, rectFA);
            pathB.offset(rect.left, rect.top);
            canvas.clipPath(pathB);
        }
    }

    private final Path b(View view, E7.e eVar, RectF rectF, RectF rectF2) {
        H7.p pVarC;
        H7.q qVarA;
        H7.q qVarA2;
        H7.q qVarB;
        H7.q qVarB2;
        H7.q qVarD;
        H7.q qVarD2;
        H7.q qVarC;
        H7.q qVarC2;
        H7.j jVarE = eVar.e();
        if (jVarE != null) {
            int layoutDirection = eVar.getLayoutDirection();
            Context context = view.getContext();
            AbstractC5504s.g(context, "getContext(...)");
            pVarC = jVarE.c(layoutDirection, context, B.g(eVar.getBounds().width()), B.g(eVar.getBounds().height()));
        } else {
            pVarC = null;
        }
        Path path = new Path();
        path.addRoundRect(rectF, new float[]{k((pVarC == null || (qVarC2 = pVarC.c()) == null) ? null : Float.valueOf(B.f37368a.b(qVarC2.a())), rectF2 != null ? Float.valueOf(B.f37368a.b(rectF2.left)) : null), k((pVarC == null || (qVarC = pVarC.c()) == null) ? null : Float.valueOf(B.f37368a.b(qVarC.b())), rectF2 != null ? Float.valueOf(B.f37368a.b(rectF2.top)) : null), k((pVarC == null || (qVarD2 = pVarC.d()) == null) ? null : Float.valueOf(B.f37368a.b(qVarD2.a())), rectF2 != null ? Float.valueOf(B.f37368a.b(rectF2.right)) : null), k((pVarC == null || (qVarD = pVarC.d()) == null) ? null : Float.valueOf(B.f37368a.b(qVarD.b())), rectF2 != null ? Float.valueOf(B.f37368a.b(rectF2.top)) : null), k((pVarC == null || (qVarB2 = pVarC.b()) == null) ? null : Float.valueOf(B.f37368a.b(qVarB2.a())), rectF2 != null ? Float.valueOf(B.f37368a.b(rectF2.right)) : null), k((pVarC == null || (qVarB = pVarC.b()) == null) ? null : Float.valueOf(B.f37368a.b(qVarB.b())), rectF2 != null ? Float.valueOf(B.f37368a.b(rectF2.bottom)) : null), k((pVarC == null || (qVarA2 = pVarC.a()) == null) ? null : Float.valueOf(B.f37368a.b(qVarA2.a())), rectF2 != null ? Float.valueOf(B.f37368a.b(rectF2.left)) : null), k((pVarC == null || (qVarA = pVarC.a()) == null) ? null : Float.valueOf(B.f37368a.b(qVarA.b())), rectF2 != null ? Float.valueOf(B.f37368a.b(rectF2.bottom)) : null)}, Path.Direction.CW);
        return path;
    }

    private final E7.a c(View view) {
        E7.e eVarF = f(view);
        E7.a aVarA = eVarF.a();
        if (aVarA != null) {
            return aVarA;
        }
        Context context = view.getContext();
        AbstractC5504s.g(context, "getContext(...)");
        E7.a aVar = new E7.a(context, eVarF.e(), eVarF.d());
        view.setBackground(eVarF.l(aVar));
        return aVar;
    }

    private final E7.b d(View view) {
        E7.e eVarF = f(view);
        E7.b bVarB = eVarF.b();
        if (bVarB != null) {
            return bVarB;
        }
        Context context = view.getContext();
        AbstractC5504s.g(context, "getContext(...)");
        E7.b bVar = new E7.b(context, eVarF.e(), eVarF.d());
        view.setBackground(eVarF.m(bVar));
        return bVar;
    }

    private final E7.c e(View view) {
        E7.e eVarF = f(view);
        E7.c cVarC = eVarF.c();
        if (cVarC != null) {
            return cVarC;
        }
        Context context = view.getContext();
        AbstractC5504s.g(context, "getContext(...)");
        H7.j jVarE = eVarF.e();
        E7.c cVar = new E7.c(context, new Z(0.0f), jVarE, eVarF.d(), H7.k.f8073b);
        view.setBackground(eVarF.n(cVar));
        return cVar;
    }

    private final E7.e f(View view) {
        if (view.getBackground() instanceof E7.e) {
            Drawable background = view.getBackground();
            AbstractC5504s.f(background, "null cannot be cast to non-null type com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable");
            return (E7.e) background;
        }
        Context context = view.getContext();
        AbstractC5504s.g(context, "getContext(...)");
        E7.e eVar = new E7.e(context, view.getBackground(), null, null, null, null, null, null, null, null, null, 2044, null);
        view.setBackground(eVar);
        return eVar;
    }

    private final E7.h g(View view) {
        E7.e eVarF = f(view);
        E7.h hVarI = eVarF.i();
        if (hVarI != null) {
            return hVarI;
        }
        H7.j jVarE = eVarF.e();
        Context context = view.getContext();
        AbstractC5504s.g(context, "getContext(...)");
        E7.h hVar = new E7.h(context, jVarE, -16777216, 0.0f, H7.u.f8130b, 0.0f);
        view.setBackground(eVarF.p(hVar));
        return hVar;
    }

    private final E7.a h(View view) {
        E7.e eVarJ = j(view);
        if (eVarJ != null) {
            return eVarJ.a();
        }
        return null;
    }

    public static final Integer i(View view) {
        AbstractC5504s.h(view, "view");
        E7.a aVarH = f37550a.h(view);
        if (aVarH != null) {
            return Integer.valueOf(aVarH.b());
        }
        return null;
    }

    private final E7.e j(View view) {
        Drawable background = view.getBackground();
        if (background instanceof E7.e) {
            return (E7.e) background;
        }
        return null;
    }

    private final float k(Float f10, Float f11) {
        return AbstractC5874j.d((f10 != null ? f10.floatValue() : 0.0f) - (f11 != null ? f11.floatValue() : 0.0f), 0.0f);
    }

    public static final void l(View view) {
        AbstractC5504s.h(view, "view");
        if (view.getBackground() instanceof E7.e) {
            Drawable background = view.getBackground();
            AbstractC5504s.f(background, "null cannot be cast to non-null type com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable");
            view.setBackground(((E7.e) background).g());
        }
    }

    public static final void m(View view, Integer num) {
        AbstractC5504s.h(view, "view");
        if ((num == null || num.intValue() == 0) && !(view.getBackground() instanceof E7.e)) {
            return;
        }
        f37550a.c(view).c(num != null ? num.intValue() : 0);
    }

    public static final void n(View view, List list) {
        AbstractC5504s.h(view, "view");
        f37550a.d(view).f(list);
    }

    public static final void o(View view, List list) {
        AbstractC5504s.h(view, "view");
        f37550a.d(view).g(list);
    }

    public static final void p(View view, List list) {
        AbstractC5504s.h(view, "view");
        f37550a.d(view).h(list);
    }

    public static final void q(View view, List list) {
        AbstractC5504s.h(view, "view");
        f37550a.d(view).i(list);
    }

    public static final void r(View view, H7.t edge, Integer num) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(edge, "edge");
        f37550a.e(view).o(edge, num);
    }

    public static final void s(View view, H7.i corner, C3303t c3303t) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(corner, "corner");
        C3281a c3281a = f37550a;
        E7.e eVarF = c3281a.f(view);
        H7.j jVarE = eVarF.e();
        if (jVarE == null) {
            jVarE = new H7.j(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }
        eVarF.k(jVarE);
        H7.j jVarE2 = eVarF.e();
        if (jVarE2 != null) {
            jVarE2.d(corner, c3303t);
        }
        if (view instanceof ImageView) {
            c3281a.c(view);
        }
        E7.a aVarA = eVarF.a();
        if (aVarA != null) {
            aVarA.e(eVarF.e());
        }
        E7.b bVarB = eVarF.b();
        if (bVarB != null) {
            bVarB.k(eVarF.e());
        }
        E7.c cVarC = eVarF.c();
        if (cVarC != null) {
            cVarC.q(eVarF.e());
        }
        E7.a aVarA2 = eVarF.a();
        if (aVarA2 != null) {
            aVarA2.invalidateSelf();
        }
        E7.b bVarB2 = eVarF.b();
        if (bVarB2 != null) {
            bVarB2.invalidateSelf();
        }
        E7.c cVarC2 = eVarF.c();
        if (cVarC2 != null) {
            cVarC2.invalidateSelf();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            List listH = eVarF.h();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listH) {
                if (obj instanceof E7.i) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((E7.i) it.next()).c(eVarF.e());
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            List listF = eVarF.f();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listF) {
                if (obj2 instanceof E7.f) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((E7.f) it2.next()).e(eVarF.e());
            }
        }
        E7.h hVarI = eVarF.i();
        if (hVarI != null) {
            hVarI.e(eVarF.e());
        }
        eVarF.invalidateSelf();
    }

    public static final void t(View view, H7.k kVar) {
        AbstractC5504s.h(view, "view");
        f37550a.e(view).r(kVar);
    }

    public static final void u(View view, H7.t edge, Float f10) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(edge, "edge");
        C3281a c3281a = f37550a;
        E7.e eVarF = c3281a.f(view);
        H7.h hVarD = eVarF.d();
        if (hVarD == null) {
            hVarD = new H7.h();
        }
        eVarF.j(hVarD);
        H7.h hVarD2 = eVarF.d();
        if (hVarD2 != null) {
            hVarD2.b(edge, f10);
        }
        c3281a.e(view).s(edge.c(), f10 != null ? B.f37368a.b(f10.floatValue()) : Float.NaN);
        E7.a aVarA = eVarF.a();
        if (aVarA != null) {
            aVarA.d(eVarF.d());
        }
        E7.b bVarB = eVarF.b();
        if (bVarB != null) {
            bVarB.j(eVarF.d());
        }
        E7.c cVarC = eVarF.c();
        if (cVarC != null) {
            cVarC.p(eVarF.d());
        }
        E7.a aVarA2 = eVarF.a();
        if (aVarA2 != null) {
            aVarA2.invalidateSelf();
        }
        E7.b bVarB2 = eVarF.b();
        if (bVarB2 != null) {
            bVarB2.invalidateSelf();
        }
        E7.c cVarC2 = eVarF.c();
        if (cVarC2 != null) {
            cVarC2.invalidateSelf();
        }
        H7.h hVarD3 = eVarF.d();
        if (hVarD3 == null) {
            hVarD3 = new H7.h();
        }
        eVarF.j(hVarD3);
        H7.h hVarD4 = eVarF.d();
        if (hVarD4 != null) {
            hVarD4.b(edge, f10);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            List listF = eVarF.f();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listF) {
                if (obj instanceof E7.f) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((E7.f) it.next()).d(eVarF.d());
            }
        }
    }

    public static final void v(View view, ReadableArray readableArray) {
        AbstractC5504s.h(view, "view");
        if (readableArray == null) {
            w(view, AbstractC2279u.m());
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = readableArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            l.a aVar = H7.l.f8078g;
            ReadableMap map = readableArray.getMap(i10);
            Context context = view.getContext();
            AbstractC5504s.g(context, "getContext(...)");
            H7.l lVarA = aVar.a(map, context);
            if (lVarA == null) {
                throw new IllegalStateException("Required value was null.");
            }
            arrayList.add(lVarA);
        }
        w(view, arrayList);
    }

    public static final void w(View view, List shadows) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(shadows, "shadows");
        if (C7.a.c(view) != 2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        E7.e eVarF = f37550a.f(view);
        H7.h hVarD = eVarF.d();
        H7.j jVarE = eVarF.e();
        Iterator it = shadows.iterator();
        while (it.hasNext()) {
            H7.l lVar = (H7.l) it.next();
            float fD = lVar.d();
            float fE = lVar.e();
            Integer numB = lVar.b();
            int iIntValue = numB != null ? numB.intValue() : -16777216;
            Float fA = lVar.a();
            float fFloatValue = fA != null ? fA.floatValue() : 0.0f;
            Float f10 = lVar.f();
            float fFloatValue2 = f10 != null ? f10.floatValue() : 0.0f;
            Boolean boolC = lVar.c();
            boolean zBooleanValue = boolC != null ? boolC.booleanValue() : false;
            if (zBooleanValue && Build.VERSION.SDK_INT >= 29) {
                Context context = view.getContext();
                AbstractC5504s.g(context, "getContext(...)");
                arrayList.add(new E7.f(context, iIntValue, fD, fE, fFloatValue, fFloatValue2, hVarD, jVarE));
            } else if (!zBooleanValue && Build.VERSION.SDK_INT >= 28) {
                Context context2 = view.getContext();
                AbstractC5504s.g(context2, "getContext(...)");
                arrayList2.add(new E7.i(context2, iIntValue, fD, fE, fFloatValue, fFloatValue2, jVarE));
            }
        }
        view.setBackground(f37550a.f(view).q(arrayList2, arrayList));
    }

    public static final void x(View view, Drawable drawable) {
        AbstractC5504s.h(view, "view");
        f37550a.f(view).o(drawable);
    }

    public static final void y(View view, Integer num) {
        AbstractC5504s.h(view, "view");
        if (C7.a.c(view) != 2) {
            return;
        }
        E7.h hVarG = f37550a.g(view);
        if (num != null) {
            hVarG.f(num.intValue());
        }
    }

    public static final void z(View view, float f10) {
        AbstractC5504s.h(view, "view");
        if (C7.a.c(view) != 2) {
            return;
        }
        f37550a.g(view).g(B.f37368a.b(f10));
    }
}
