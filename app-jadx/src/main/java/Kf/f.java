package Kf;

import Jf.InterfaceC1743f;
import Lf.L;
import ae.AbstractC2605b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.V;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class f {
    public static final Object b(Zd.i iVar, Object obj, Object obj2, Function2 function2, Zd.e eVar) {
        Object objI = L.i(iVar, obj2);
        try {
            w wVar = new w(eVar, iVar);
            Object objE = !(function2 instanceof kotlin.coroutines.jvm.internal.a) ? AbstractC2605b.e(function2, obj, wVar) : ((Function2) V.e(function2, 2)).invoke(obj, wVar);
            L.f(iVar, objI);
            if (objE == AbstractC2605b.f()) {
                kotlin.coroutines.jvm.internal.h.c(eVar);
            }
            return objE;
        } catch (Throwable th2) {
            L.f(iVar, objI);
            throw th2;
        }
    }

    public static /* synthetic */ Object c(Zd.i iVar, Object obj, Object obj2, Function2 function2, Zd.e eVar, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = L.g(iVar);
        }
        return b(iVar, obj, obj2, function2, eVar);
    }

    public static final InterfaceC1743f d(InterfaceC1743f interfaceC1743f, Zd.i iVar) {
        return ((interfaceC1743f instanceof v) || (interfaceC1743f instanceof o)) ? interfaceC1743f : new y(interfaceC1743f, iVar);
    }
}
