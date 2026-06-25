package Y;

import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class H {
    public static final void c(final C2397c1 c2397c1, final Function2 function2, InterfaceC2425m interfaceC2425m, final int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-149765515);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-149765515, i10, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:387)");
        }
        interfaceC2425mG.P(c2397c1);
        function2.invoke(interfaceC2425mG, Integer.valueOf((i10 >> 3) & 14));
        interfaceC2425mG.w();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new Function2() { // from class: Y.F
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return H.f(c2397c1, function2, i10, (InterfaceC2425m) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void d(final C2397c1[] c2397c1Arr, final Function2 function2, InterfaceC2425m interfaceC2425m, final int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(415205898);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(415205898, i10, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:367)");
        }
        interfaceC2425mG.L(c2397c1Arr);
        function2.invoke(interfaceC2425mG, Integer.valueOf((i10 >> 3) & 14));
        interfaceC2425mG.M();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new Function2() { // from class: Y.G
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return H.e(c2397c1Arr, function2, i10, (InterfaceC2425m) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Td.L e(C2397c1[] c2397c1Arr, Function2 function2, int i10, InterfaceC2425m interfaceC2425m, int i11) {
        d(c2397c1Arr, function2, interfaceC2425m, AbstractC2409g1.a(i10 | 1));
        return Td.L.f17438a;
    }

    public static final Td.L f(C2397c1 c2397c1, Function2 function2, int i10, InterfaceC2425m interfaceC2425m, int i11) {
        c(c2397c1, function2, interfaceC2425m, AbstractC2409g1.a(i10 | 1));
        return Td.L.f17438a;
    }

    public static final AbstractC2394b1 g(T1 t12, InterfaceC5082a interfaceC5082a) {
        return new Z(t12, interfaceC5082a);
    }

    public static /* synthetic */ AbstractC2394b1 h(T1 t12, InterfaceC5082a interfaceC5082a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            t12 = U1.q();
        }
        return g(t12, interfaceC5082a);
    }

    public static final AbstractC2394b1 i(Function1 function1) {
        return new O(function1);
    }

    public static final AbstractC2394b1 j(InterfaceC5082a interfaceC5082a) {
        return new i2(interfaceC5082a);
    }
}
