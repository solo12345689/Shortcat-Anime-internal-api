package T1;

import Td.L;
import ae.AbstractC2605b;
import ie.InterfaceC5096o;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f16786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f16787b;

        a(Zd.e eVar) {
            super(3, eVar);
        }

        public final Object a(y yVar, boolean z10, Zd.e eVar) {
            a aVar = new a(eVar);
            aVar.f16787b = yVar;
            return aVar.invokeSuspend(L.f17438a);
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((y) obj, ((Boolean) obj2).booleanValue(), (Zd.e) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f16786a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
                return obj;
            }
            Td.v.b(obj);
            y yVar = (y) this.f16787b;
            this.f16786a = 1;
            Object objE = yVar.e(this);
            return objE == objF ? objF : objE;
        }
    }

    public static final Object a(F f10, Zd.e eVar) {
        return f10.a(new a(null), eVar);
    }
}
