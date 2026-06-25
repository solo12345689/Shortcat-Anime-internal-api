package Y;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Y.v0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2452v0 {
    public static final InterfaceC2446t0 a(Zd.i iVar) {
        InterfaceC2446t0 interfaceC2446t0 = (InterfaceC2446t0) iVar.l(InterfaceC2446t0.f22548R);
        if (interfaceC2446t0 != null) {
            return interfaceC2446t0;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final Object b(Function1 function1, Zd.e eVar) {
        return a(eVar.getContext()).A1(new C2449u0(function1), eVar);
    }

    public static final Object c(Function1 function1, Zd.e eVar) {
        return a(eVar.getContext()).A1(function1, eVar);
    }
}
