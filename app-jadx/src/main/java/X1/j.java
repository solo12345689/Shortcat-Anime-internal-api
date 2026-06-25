package X1;

import T1.InterfaceC2145i;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f21622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2 f21623c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function2 function2, Zd.e eVar) {
            super(2, eVar);
            this.f21623c = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, Zd.e eVar) {
            return ((a) create(fVar, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            a aVar = new a(this.f21623c, eVar);
            aVar.f21622b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f21621a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c cVar = (c) this.f21622b;
                v.b(obj);
                return cVar;
            }
            v.b(obj);
            c cVarC = ((f) this.f21622b).c();
            Function2 function2 = this.f21623c;
            this.f21622b = cVarC;
            this.f21621a = 1;
            return function2.invoke(cVarC, this) == objF ? objF : cVarC;
        }
    }

    public static final Object a(InterfaceC2145i interfaceC2145i, Function2 function2, Zd.e eVar) {
        return interfaceC2145i.a(new a(function2, null), eVar);
    }
}
