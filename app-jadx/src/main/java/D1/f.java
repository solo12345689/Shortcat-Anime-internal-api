package d1;

import U0.C2205i;
import U0.E;
import U0.G;
import U0.InterfaceC2236y;
import U0.Y0;
import Y0.AbstractC2485u;
import g1.C4832l;
import i1.InterfaceC5011d;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final InterfaceC2236y a(String str, Y0 y02, List list, List list2, InterfaceC5011d interfaceC5011d, AbstractC2485u.b bVar) {
        return new e(str, y02, list, list2, bVar, interfaceC5011d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(Y0 y02) {
        E eA;
        G gY = y02.y();
        return !(((gY == null || (eA = gY.a()) == null) ? null : C2205i.d(eA.b())) == null ? false : C2205i.g(r1.j(), C2205i.f18836b.c()));
    }

    public static final int d(int i10, c1.e eVar) {
        Locale localeB;
        C4832l.a aVar = C4832l.f47292b;
        if (C4832l.j(i10, aVar.b())) {
            return 2;
        }
        if (C4832l.j(i10, aVar.c())) {
            return 3;
        }
        if (C4832l.j(i10, aVar.d())) {
            return 0;
        }
        if (C4832l.j(i10, aVar.e())) {
            return 1;
        }
        if (!C4832l.j(i10, aVar.a()) && !C4832l.j(i10, aVar.f())) {
            throw new IllegalStateException("Invalid TextDirection.");
        }
        if (eVar == null || (localeB = eVar.e(0).b()) == null) {
            localeB = Locale.getDefault();
        }
        int iA = J1.p.a(localeB);
        return (iA == 0 || iA != 1) ? 2 : 3;
    }
}
