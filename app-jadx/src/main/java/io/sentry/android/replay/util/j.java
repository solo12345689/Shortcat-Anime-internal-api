package io.sentry.android.replay.util;

import I0.AbstractC1691q;
import I0.F;
import I0.InterfaceC1690p;
import K0.J;
import android.graphics.Rect;
import i1.C5025r;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import r0.AbstractC6225g;
import r0.C6224f;
import r0.C6226h;
import s0.C6385r0;
import s0.InterfaceC6389t0;
import w0.AbstractC6923b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j {
    public static final Rect a(InterfaceC1690p interfaceC1690p, InterfaceC1690p interfaceC1690p2) {
        AbstractC5504s.h(interfaceC1690p, "<this>");
        if (interfaceC1690p2 == null) {
            interfaceC1690p2 = AbstractC1691q.d(interfaceC1690p);
        }
        float fG = C5025r.g(interfaceC1690p2.a());
        float f10 = C5025r.f(interfaceC1690p2.a());
        C6226h c6226hV = InterfaceC1690p.V(interfaceC1690p2, interfaceC1690p, false, 2, null);
        float fI = c6226hV.i();
        if (fI < 0.0f) {
            fI = 0.0f;
        }
        if (fI > fG) {
            fI = fG;
        }
        float fL = c6226hV.l();
        if (fL < 0.0f) {
            fL = 0.0f;
        }
        if (fL > f10) {
            fL = f10;
        }
        float fJ = c6226hV.j();
        if (fJ < 0.0f) {
            fJ = 0.0f;
        }
        if (fJ <= fG) {
            fG = fJ;
        }
        float fE = c6226hV.e();
        float f11 = fE >= 0.0f ? fE : 0.0f;
        if (f11 <= f10) {
            f10 = f11;
        }
        if (fI == fG || fL == f10) {
            return new Rect();
        }
        long jC0 = interfaceC1690p2.c0(AbstractC6225g.a(fI, fL));
        long jC02 = interfaceC1690p2.c0(AbstractC6225g.a(fG, fL));
        long jC03 = interfaceC1690p2.c0(AbstractC6225g.a(fG, f10));
        long jC04 = interfaceC1690p2.c0(AbstractC6225g.a(fI, f10));
        float fM = C6224f.m(jC0);
        float fM2 = C6224f.m(jC02);
        float fM3 = C6224f.m(jC04);
        float fM4 = C6224f.m(jC03);
        float fMin = Math.min(fM, Math.min(fM2, Math.min(fM3, fM4)));
        float fMax = Math.max(fM, Math.max(fM2, Math.max(fM3, fM4)));
        float fN = C6224f.n(jC0);
        float fN2 = C6224f.n(jC02);
        float fN3 = C6224f.n(jC04);
        float fN4 = C6224f.n(jC03);
        return new Rect((int) fMin, (int) Math.min(fN, Math.min(fN2, Math.min(fN3, fN4))), (int) fMax, (int) Math.max(fN, Math.max(fN2, Math.max(fN3, fN4))));
    }

    public static final AbstractC6923b b(J j10) {
        AbstractC5504s.h(j10, "<this>");
        List listR0 = j10.r0();
        int size = listR0.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.ui.e eVarA = ((F) listR0.get(i10)).a();
            String name = eVarA.getClass().getName();
            AbstractC5504s.g(name, "getName(...)");
            if (Df.r.W(name, "Painter", false, 2, null)) {
                try {
                    Field declaredField = eVarA.getClass().getDeclaredField("painter");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(eVarA);
                    if (obj instanceof AbstractC6923b) {
                        return (AbstractC6923b) obj;
                    }
                } catch (Throwable unused) {
                }
                return null;
            }
        }
        return null;
    }

    public static final p c(J j10) {
        InterfaceC6389t0 interfaceC6389t0;
        AbstractC5504s.h(j10, "<this>");
        List listR0 = j10.r0();
        int size = listR0.size();
        C6385r0 c6385r0M = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.ui.e eVarA = ((F) listR0.get(i10)).a();
            String name = eVarA.getClass().getName();
            AbstractC5504s.e(name);
            if (Df.r.W(name, "Text", false, 2, null)) {
                try {
                    Field declaredField = eVarA.getClass().getDeclaredField("color");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(eVarA);
                    interfaceC6389t0 = obj instanceof InterfaceC6389t0 ? (InterfaceC6389t0) obj : null;
                } catch (Throwable unused) {
                }
                c6385r0M = interfaceC6389t0 != null ? C6385r0.m(interfaceC6389t0.a()) : null;
            } else if (Df.r.W(name, "Fill", false, 2, null)) {
                z10 = true;
            }
        }
        return new p(c6385r0M, z10, null);
    }

    public static final boolean d(AbstractC6923b abstractC6923b) {
        AbstractC5504s.h(abstractC6923b, "<this>");
        String name = abstractC6923b.getClass().getName();
        AbstractC5504s.e(name);
        return (Df.r.W(name, "Vector", false, 2, null) || Df.r.W(name, "Color", false, 2, null) || Df.r.W(name, "Brush", false, 2, null)) ? false : true;
    }
}
