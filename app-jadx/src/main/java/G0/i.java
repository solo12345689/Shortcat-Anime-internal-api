package g0;

import Y.AbstractC2454w;
import Y.C2406f1;
import Y.InterfaceC2400d1;
import Y.InterfaceC2425m;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a */
    private static final Object f47190a = new Object();

    public static final int a(int i10, int i11) {
        return i10 << (((i11 % 10) * 3) + 1);
    }

    public static final InterfaceC4820b b(int i10, boolean z10, Object obj) {
        return new h(i10, z10, obj);
    }

    public static final int c(int i10) {
        return a(2, i10);
    }

    public static final InterfaceC4820b d(int i10, boolean z10, Object obj, InterfaceC2425m interfaceC2425m, int i11) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1573003438, i11, -1, "androidx.compose.runtime.internal.rememberComposableLambda (ComposableLambda.kt:1371)");
        }
        Object objD = interfaceC2425m.D();
        if (objD == InterfaceC2425m.f22370a.a()) {
            objD = new h(i10, z10, obj);
            interfaceC2425m.u(objD);
        }
        h hVar = (h) objD;
        hVar.z(obj);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return hVar;
    }

    public static final boolean e(InterfaceC2400d1 interfaceC2400d1, InterfaceC2400d1 interfaceC2400d12) {
        if (interfaceC2400d1 == null) {
            return true;
        }
        if (!(interfaceC2400d1 instanceof C2406f1) || !(interfaceC2400d12 instanceof C2406f1)) {
            return false;
        }
        C2406f1 c2406f1 = (C2406f1) interfaceC2400d1;
        return !c2406f1.u() || AbstractC5504s.c(interfaceC2400d1, interfaceC2400d12) || AbstractC5504s.c(c2406f1.h(), ((C2406f1) interfaceC2400d12).h());
    }

    public static final int f(int i10) {
        return a(1, i10);
    }
}
