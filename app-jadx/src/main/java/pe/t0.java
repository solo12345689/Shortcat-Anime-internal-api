package Pe;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;
import qf.H0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class t0 {
    public static final C2023h a(C2023h c2023h, Collection superQualifiers, boolean z10, boolean z11, boolean z12) {
        EnumC2026k enumC2026kE;
        AbstractC5504s.h(c2023h, "<this>");
        AbstractC5504s.h(superQualifiers, "superQualifiers");
        Collection collection = superQualifiers;
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            EnumC2026k enumC2026kB = b((C2023h) it.next());
            if (enumC2026kB != null) {
                arrayList.add(enumC2026kB);
            }
        }
        EnumC2026k enumC2026kE2 = e(AbstractC2279u.f1(arrayList), b(c2023h), z10);
        if (enumC2026kE2 == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                EnumC2026k enumC2026kF = ((C2023h) it2.next()).f();
                if (enumC2026kF != null) {
                    arrayList2.add(enumC2026kF);
                }
            }
            enumC2026kE = e(AbstractC2279u.f1(arrayList2), c2023h.f(), z10);
        } else {
            enumC2026kE = enumC2026kE2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = collection.iterator();
        while (it3.hasNext()) {
            EnumC2024i enumC2024iE = ((C2023h) it3.next()).e();
            if (enumC2024iE != null) {
                arrayList3.add(enumC2024iE);
            }
        }
        EnumC2024i enumC2024i = (EnumC2024i) f(AbstractC2279u.f1(arrayList3), EnumC2024i.f13892b, EnumC2024i.f13891a, c2023h.e(), z10);
        if (enumC2026kE == null || z12 || (z11 && enumC2026kE == EnumC2026k.f13899b)) {
            enumC2026kE = null;
        }
        boolean z13 = false;
        boolean z14 = enumC2026kE != null && enumC2026kE2 == null;
        if (enumC2026kE == EnumC2026k.f13900c) {
            if (d(c2023h, z14)) {
                z13 = true;
                break;
            }
            if (!collection.isEmpty()) {
                Iterator it4 = collection.iterator();
                while (it4.hasNext()) {
                    if (d((C2023h) it4.next(), z14)) {
                        z13 = true;
                        break;
                    }
                }
            }
        }
        return new C2023h(enumC2026kE, enumC2024i, z13, z14);
    }

    private static final EnumC2026k b(C2023h c2023h) {
        if (c2023h.g()) {
            return null;
        }
        return c2023h.f();
    }

    public static final boolean c(H0 h02, uf.i type) {
        AbstractC5504s.h(h02, "<this>");
        AbstractC5504s.h(type, "type");
        Xe.c ENHANCED_NULLABILITY_ANNOTATION = He.I.f8465v;
        AbstractC5504s.g(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return h02.c0(type, ENHANCED_NULLABILITY_ANNOTATION);
    }

    private static final boolean d(C2023h c2023h, boolean z10) {
        return c2023h.g() == z10 && c2023h.d();
    }

    private static final EnumC2026k e(Set set, EnumC2026k enumC2026k, boolean z10) {
        EnumC2026k enumC2026k2 = EnumC2026k.f13898a;
        return enumC2026k == enumC2026k2 ? enumC2026k2 : (EnumC2026k) f(set, EnumC2026k.f13900c, EnumC2026k.f13899b, enumC2026k, z10);
    }

    private static final Object f(Set set, Object obj, Object obj2, Object obj3, boolean z10) {
        Set setF1;
        if (!z10) {
            if (obj3 != null && (setF1 = AbstractC2279u.f1(Ud.a0.m(set, obj3))) != null) {
                set = setF1;
            }
            return AbstractC2279u.N0(set);
        }
        Object obj4 = set.contains(obj) ? obj : set.contains(obj2) ? obj2 : null;
        if (AbstractC5504s.c(obj4, obj) && AbstractC5504s.c(obj3, obj2)) {
            return null;
        }
        return obj3 == null ? obj4 : obj3;
    }
}
