package se;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.AbstractC5504s;
import se.K0;
import te.i;
import ye.InterfaceC7235m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class P0 {
    /* JADX WARN: Removed duplicated region for block: B:107:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final te.h b(se.K0.a r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: se.P0.b(se.K0$a, boolean):te.h");
    }

    private static final te.i c(K0.a aVar, boolean z10, Field field) {
        return (g(aVar.j().b0()) || !Modifier.isStatic(field.getModifiers())) ? z10 ? aVar.Z() ? new i.f.a(field, f(aVar)) : new i.f.c(field) : aVar.Z() ? new i.g.a(field, e(aVar), f(aVar)) : new i.g.c(field, e(aVar)) : d(aVar) ? z10 ? aVar.Z() ? new i.f.b(field) : new i.f.d(field) : aVar.Z() ? new i.g.b(field, e(aVar)) : new i.g.d(field, e(aVar)) : z10 ? new i.f.e(field) : new i.g.e(field, e(aVar));
    }

    private static final boolean d(K0.a aVar) {
        return aVar.j().b0().getAnnotations().k0(j1.j());
    }

    private static final boolean e(K0.a aVar) {
        return !qf.J0.l(aVar.j().b0().getType());
    }

    public static final Object f(K0.a aVar) {
        AbstractC5504s.h(aVar, "<this>");
        return aVar.j().g0();
    }

    private static final boolean g(ye.Z z10) {
        InterfaceC7235m interfaceC7235mB = z10.b();
        AbstractC5504s.g(interfaceC7235mB, "getContainingDeclaration(...)");
        if (!bf.i.x(interfaceC7235mB)) {
            return false;
        }
        InterfaceC7235m interfaceC7235mB2 = interfaceC7235mB.b();
        if (bf.i.C(interfaceC7235mB2) || bf.i.t(interfaceC7235mB2)) {
            return (z10 instanceof of.N) && We.h.f(((of.N) z10).h0());
        }
        return true;
    }
}
