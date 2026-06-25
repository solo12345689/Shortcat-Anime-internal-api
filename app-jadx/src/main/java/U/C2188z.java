package U;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import s0.C6385r0;

/* JADX INFO: renamed from: U.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2188z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2188z f18682a = new C2188z();

    private C2188z() {
    }

    public final C2187y a(C2175l c2175l, long j10) {
        C2187y c2187yE = c2175l.e();
        if (c2187yE != null) {
            return c2187yE;
        }
        C6385r0.a aVar = C6385r0.f58985b;
        C2187y c2187y = new C2187y(aVar.i(), j10, aVar.i(), C6385r0.q(j10, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        c2175l.U(c2187y);
        return c2187y;
    }

    public final C2187y b(InterfaceC2425m interfaceC2425m, int i10) {
        interfaceC2425m.V(-1519621781);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1519621781, i10, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:592)");
        }
        long jA = ((C6385r0) interfaceC2425m.n(AbstractC2181s.a())).A();
        C2187y c2187yA = a(D.f17597a.a(interfaceC2425m, 6), jA);
        if (C6385r0.s(c2187yA.e(), jA)) {
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            interfaceC2425m.O();
            return c2187yA;
        }
        C2187y c2187yD = C2187y.d(c2187yA, 0L, jA, 0L, C6385r0.q(jA, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 5, null);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return c2187yD;
    }
}
