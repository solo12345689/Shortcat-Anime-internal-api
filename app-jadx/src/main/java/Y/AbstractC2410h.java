package Y;

/* JADX INFO: renamed from: Y.h */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2410h {
    public static final int a(InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(524444915, i10, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:241)");
        }
        int iQ = interfaceC2425m.Q();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return iQ;
    }

    public static final long b(InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-168259424, i10, -1, "androidx.compose.runtime.<get-currentCompositeKeyHashCode> (Composables.kt:257)");
        }
        long jO = interfaceC2425m.o();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return jO;
    }

    public static final InterfaceC2400d1 c(InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(394957799, i10, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:205)");
        }
        InterfaceC2400d1 interfaceC2400d1A = interfaceC2425m.A();
        if (interfaceC2400d1A == null) {
            throw new IllegalStateException("no recompose scope found");
        }
        interfaceC2425m.v(interfaceC2400d1A);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return interfaceC2400d1A;
    }

    public static final void d() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final AbstractC2460y e(InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1165786124, i10, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:505)");
        }
        AbstractC2460y abstractC2460yR = interfaceC2425m.R();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return abstractC2460yR;
    }
}
