package Y;

import Ud.AbstractC2273n;
import i0.C4961E;
import i0.C4963G;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b2 {
    public static final C4961E a() {
        return new C4961E();
    }

    public static final C4961E b(Object... objArr) {
        C4961E c4961e = new C4961E();
        c4961e.addAll(AbstractC2273n.V0(objArr));
        return c4961e;
    }

    public static final C4963G c() {
        return new C4963G();
    }

    public static final C0 d(Object obj, T1 t12) {
        return c2.a(obj, t12);
    }

    public static /* synthetic */ C0 e(Object obj, T1 t12, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            t12 = U1.q();
        }
        return U1.h(obj, t12);
    }

    public static final h2 f(Object obj, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1058319986, i10, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:335)");
        }
        Object objD = interfaceC2425m.D();
        if (objD == InterfaceC2425m.f22370a.a()) {
            objD = e(obj, null, 2, null);
            interfaceC2425m.u(objD);
        }
        C0 c02 = (C0) objD;
        c02.setValue(obj);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return c02;
    }
}
