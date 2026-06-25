package z;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import i1.EnumC5027t;
import v.AbstractC6778A;
import w.InterfaceC6921z;
import x.AbstractC7004b;
import x.InterfaceC6999T;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a */
    public static final w f65432a = new w();

    private w() {
    }

    public final n a(InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1107739818, i10, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:570)");
        }
        InterfaceC6921z interfaceC6921zB = AbstractC6778A.b(interfaceC2425m, 0);
        boolean zU = interfaceC2425m.U(interfaceC6921zB);
        Object objD = interfaceC2425m.D();
        if (zU || objD == InterfaceC2425m.f22370a.a()) {
            objD = new C7266h(interfaceC6921zB, null, 2, null);
            interfaceC2425m.u(objD);
        }
        C7266h c7266h = (C7266h) objD;
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return c7266h;
    }

    public final InterfaceC6999T b(InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1809802212, i10, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:583)");
        }
        InterfaceC6999T interfaceC6999TA = AbstractC7004b.a(interfaceC2425m, 0);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return interfaceC6999TA;
    }

    public final boolean c(EnumC5027t enumC5027t, q qVar, boolean z10) {
        return (enumC5027t != EnumC5027t.f48574b || qVar == q.Vertical) ? !z10 : z10;
    }
}
