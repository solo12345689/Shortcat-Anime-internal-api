package U0;

import U0.E;
import Ud.AbstractC2279u;
import g1.C4826f;
import g1.u;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class H0 {

    /* JADX INFO: renamed from: a */
    private static final h0.v f18729a = h0.y.e(new Function2() { // from class: U0.B0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return H0.i((h0.z) obj, (E) obj2);
        }
    }, new Function1() { // from class: U0.C0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return H0.j(obj);
        }
    });

    /* JADX INFO: renamed from: b */
    private static final h0.v f18730b = h0.y.e(new Function2() { // from class: U0.D0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return H0.g((h0.z) obj, (C4826f) obj2);
        }
    }, new Function1() { // from class: U0.E0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return H0.h(obj);
        }
    });

    /* JADX INFO: renamed from: c */
    private static final h0.v f18731c = h0.y.e(new Function2() { // from class: U0.F0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return H0.k((h0.z) obj, (g1.u) obj2);
        }
    }, new Function1() { // from class: U0.G0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return H0.l(obj);
        }
    });

    public static final Object g(h0.z zVar, C4826f c4826f) {
        return Integer.valueOf(c4826f.l());
    }

    public static final C4826f h(Object obj) {
        AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.Int");
        return C4826f.c(C4826f.d(((Integer) obj).intValue()));
    }

    public static final Object i(h0.z zVar, E e10) {
        return AbstractC2279u.g(A0.Z0(Boolean.valueOf(e10.c())), A0.Z0(C2205i.d(e10.b())));
    }

    public static final E j(Object obj) {
        AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Boolean bool = obj2 != null ? (Boolean) obj2 : null;
        AbstractC5504s.e(bool);
        boolean zBooleanValue = bool.booleanValue();
        Object obj3 = list.get(1);
        C2205i c2205i = obj3 != null ? (C2205i) obj3 : null;
        AbstractC5504s.e(c2205i);
        return new E(c2205i.j(), zBooleanValue, null);
    }

    public static final Object k(h0.z zVar, g1.u uVar) {
        return AbstractC2279u.g(A0.Z0(u.b.d(uVar.b())), A0.Z0(Boolean.valueOf(uVar.c())));
    }

    public static final g1.u l(Object obj) {
        AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        u.b bVar = obj2 != null ? (u.b) obj2 : null;
        AbstractC5504s.e(bVar);
        int iJ = bVar.j();
        Object obj3 = list.get(1);
        Boolean bool = obj3 != null ? (Boolean) obj3 : null;
        AbstractC5504s.e(bool);
        return new g1.u(iJ, bool.booleanValue(), null);
    }

    public static final h0.v m(E.a aVar) {
        return f18729a;
    }

    public static final h0.v n(C4826f.a aVar) {
        return f18730b;
    }

    public static final h0.v o(u.a aVar) {
        return f18731c;
    }
}
