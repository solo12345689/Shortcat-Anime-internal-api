package Kf;

import Gf.I;
import Jf.InterfaceC1742e;
import Jf.InterfaceC1743f;
import Td.L;
import Zd.f;
import ae.AbstractC2605b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class g extends e {

    /* JADX INFO: renamed from: d */
    protected final InterfaceC1742e f11094d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f11095a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f11096b;

        a(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            a aVar = g.this.new a(eVar);
            aVar.f11096b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC1743f interfaceC1743f, Zd.e eVar) {
            return ((a) create(interfaceC1743f, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f11095a;
            if (i10 == 0) {
                Td.v.b(obj);
                InterfaceC1743f interfaceC1743f = (InterfaceC1743f) this.f11096b;
                g gVar = g.this;
                this.f11095a = 1;
                if (gVar.q(interfaceC1743f, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            return L.f17438a;
        }
    }

    public g(InterfaceC1742e interfaceC1742e, Zd.i iVar, int i10, If.a aVar) {
        super(iVar, i10, aVar);
        this.f11094d = interfaceC1742e;
    }

    static /* synthetic */ Object n(g gVar, InterfaceC1743f interfaceC1743f, Zd.e eVar) {
        if (gVar.f11085b == -3) {
            Zd.i context = eVar.getContext();
            Zd.i iVarK = I.k(context, gVar.f11084a);
            if (AbstractC5504s.c(iVarK, context)) {
                Object objQ = gVar.q(interfaceC1743f, eVar);
                return objQ == AbstractC2605b.f() ? objQ : L.f17438a;
            }
            f.b bVar = Zd.f.f23273S;
            if (AbstractC5504s.c(iVarK.l(bVar), context.l(bVar))) {
                Object objP = gVar.p(interfaceC1743f, iVarK, eVar);
                return objP == AbstractC2605b.f() ? objP : L.f17438a;
            }
        }
        Object objCollect = super.collect(interfaceC1743f, eVar);
        return objCollect == AbstractC2605b.f() ? objCollect : L.f17438a;
    }

    static /* synthetic */ Object o(g gVar, If.u uVar, Zd.e eVar) {
        Object objQ = gVar.q(new v(uVar), eVar);
        return objQ == AbstractC2605b.f() ? objQ : L.f17438a;
    }

    private final Object p(InterfaceC1743f interfaceC1743f, Zd.i iVar, Zd.e eVar) {
        return f.c(iVar, f.d(interfaceC1743f, eVar.getContext()), null, new a(null), eVar, 4, null);
    }

    @Override // Kf.e, Jf.InterfaceC1742e
    public Object collect(InterfaceC1743f interfaceC1743f, Zd.e eVar) {
        return n(this, interfaceC1743f, eVar);
    }

    @Override // Kf.e
    protected Object g(If.u uVar, Zd.e eVar) {
        return o(this, uVar, eVar);
    }

    protected abstract Object q(InterfaceC1743f interfaceC1743f, Zd.e eVar);

    @Override // Kf.e
    public String toString() {
        return this.f11094d + " -> " + super.toString();
    }
}
