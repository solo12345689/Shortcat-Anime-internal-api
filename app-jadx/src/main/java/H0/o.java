package h0;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import ie.InterfaceC5082a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static final g b(InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(15454635, i10, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:57)");
        }
        interfaceC2425m.V(1967008021);
        Object[] objArr = new Object[0];
        v vVarA = m.f47565e.a();
        Object objD = interfaceC2425m.D();
        if (objD == InterfaceC2425m.f22370a.a()) {
            objD = new InterfaceC5082a() { // from class: h0.n
                @Override // ie.InterfaceC5082a
                public final Object invoke() {
                    return o.c();
                }
            };
            interfaceC2425m.u(objD);
        }
        m mVar = (m) d.d(objArr, vVarA, (InterfaceC5082a) objD, interfaceC2425m, 384);
        mVar.s((p) interfaceC2425m.n(s.g()));
        interfaceC2425m.O();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m c() {
        return new m(null, 1, null);
    }
}
