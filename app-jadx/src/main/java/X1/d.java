package X1;

import Jf.InterfaceC1742e;
import T1.InterfaceC2145i;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC2145i {

    /* JADX INFO: renamed from: a */
    private final InterfaceC2145i f21612a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f21613a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f21614b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Function2 f21615c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function2 function2, Zd.e eVar) {
            super(2, eVar);
            this.f21615c = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a */
        public final Object invoke(f fVar, Zd.e eVar) {
            return ((a) create(fVar, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            a aVar = new a(this.f21615c, eVar);
            aVar.f21614b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f21613a;
            if (i10 == 0) {
                v.b(obj);
                f fVar = (f) this.f21614b;
                Function2 function2 = this.f21615c;
                this.f21613a = 1;
                obj = function2.invoke(fVar, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            f fVar2 = (f) obj;
            AbstractC5504s.f(fVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((c) fVar2).f();
            return fVar2;
        }
    }

    public d(InterfaceC2145i delegate) {
        AbstractC5504s.h(delegate, "delegate");
        this.f21612a = delegate;
    }

    @Override // T1.InterfaceC2145i
    public Object a(Function2 function2, Zd.e eVar) {
        return this.f21612a.a(new a(function2, null), eVar);
    }

    @Override // T1.InterfaceC2145i
    public InterfaceC1742e e() {
        return this.f21612a.e();
    }
}
