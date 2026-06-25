package Jf;

import ae.AbstractC2605b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Jf.h */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
abstract /* synthetic */ class AbstractC1745h {

    /* JADX INFO: renamed from: Jf.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC1742e {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f9578a;

        public a(Object obj) {
            this.f9578a = obj;
        }

        @Override // Jf.InterfaceC1742e
        public Object collect(InterfaceC1743f interfaceC1743f, Zd.e eVar) {
            Object objEmit = interfaceC1743f.emit(this.f9578a, eVar);
            return objEmit == AbstractC2605b.f() ? objEmit : Td.L.f17438a;
        }
    }

    public static final InterfaceC1742e a(Function2 function2) {
        return new C1739b(function2, null, 0, null, 14, null);
    }

    public static final InterfaceC1742e b(Function2 function2) {
        return new x(function2);
    }

    public static final InterfaceC1742e c(Object obj) {
        return new a(obj);
    }
}
