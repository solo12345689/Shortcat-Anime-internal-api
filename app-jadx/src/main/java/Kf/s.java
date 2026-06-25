package Kf;

import Jf.InterfaceC1743f;
import ie.InterfaceC5096o;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.V;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class s {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC5096o f11130a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class a extends AbstractC5502p implements InterfaceC5096o {

        /* JADX INFO: renamed from: a */
        public static final a f11131a = new a();

        a() {
            super(3, InterfaceC1743f.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // ie.InterfaceC5096o
        /* JADX INFO: renamed from: j */
        public final Object invoke(InterfaceC1743f interfaceC1743f, Object obj, Zd.e eVar) {
            return interfaceC1743f.emit(obj, eVar);
        }
    }

    static {
        a aVar = a.f11131a;
        AbstractC5504s.f(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f11130a = (InterfaceC5096o) V.e(aVar, 3);
    }
}
