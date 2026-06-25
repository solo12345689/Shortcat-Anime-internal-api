package T;

import B.o;
import Gf.O;
import Jf.InterfaceC1742e;
import Jf.InterfaceC1743f;
import Td.L;
import Td.v;
import Y.AbstractC2393b0;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import Y.U1;
import Y.h2;
import ae.AbstractC2605b;
import i1.C5015h;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.C6385r0;
import x.InterfaceC6987G;
import x.InterfaceC6988H;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements InterfaceC6987G {

    /* JADX INFO: renamed from: a */
    private final boolean f16680a;

    /* JADX INFO: renamed from: b */
    private final float f16681b;

    /* JADX INFO: renamed from: c */
    private final h2 f16682c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f16683a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Object f16684b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ B.k f16685c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ androidx.compose.material.ripple.d f16686d;

        /* JADX INFO: renamed from: T.c$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0285a implements InterfaceC1743f {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ androidx.compose.material.ripple.d f16687a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ O f16688b;

            C0285a(androidx.compose.material.ripple.d dVar, O o10) {
                this.f16687a = dVar;
                this.f16688b = o10;
            }

            @Override // Jf.InterfaceC1743f
            /* JADX INFO: renamed from: a */
            public final Object emit(B.j jVar, Zd.e eVar) {
                if (jVar instanceof o.b) {
                    this.f16687a.b((o.b) jVar, this.f16688b);
                } else if (jVar instanceof o.c) {
                    this.f16687a.g(((o.c) jVar).a());
                } else if (jVar instanceof o.a) {
                    this.f16687a.g(((o.a) jVar).a());
                } else {
                    this.f16687a.h(jVar, this.f16688b);
                }
                return L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(B.k kVar, androidx.compose.material.ripple.d dVar, Zd.e eVar) {
            super(2, eVar);
            this.f16685c = kVar;
            this.f16686d = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            a aVar = new a(this.f16685c, this.f16686d, eVar);
            aVar.f16684b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f16683a;
            if (i10 == 0) {
                v.b(obj);
                O o10 = (O) this.f16684b;
                InterfaceC1742e interfaceC1742eB = this.f16685c.b();
                C0285a c0285a = new C0285a(this.f16686d, o10);
                this.f16683a = 1;
                if (interfaceC1742eB.collect(c0285a, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return L.f17438a;
        }
    }

    public /* synthetic */ c(boolean z10, float f10, h2 h2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, f10, h2Var);
    }

    @Override // x.InterfaceC6987G
    public final InterfaceC6988H b(B.k kVar, InterfaceC2425m interfaceC2425m, int i10) {
        long jB;
        interfaceC2425m.V(988743187);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(988743187, i10, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:196)");
        }
        m mVar = (m) interfaceC2425m.n(n.d());
        if (((C6385r0) this.f16682c.getValue()).A() != C6385r0.f58985b.j()) {
            interfaceC2425m.V(-303571590);
            interfaceC2425m.O();
            jB = ((C6385r0) this.f16682c.getValue()).A();
        } else {
            interfaceC2425m.V(-303521246);
            jB = mVar.b(interfaceC2425m, 0);
            interfaceC2425m.O();
        }
        h2 h2VarO = U1.o(C6385r0.m(jB), interfaceC2425m, 0);
        h2 h2VarO2 = U1.o(mVar.a(interfaceC2425m, 0), interfaceC2425m, 0);
        int i11 = i10 & 14;
        androidx.compose.material.ripple.d dVarC = c(kVar, this.f16680a, this.f16681b, h2VarO, h2VarO2, interfaceC2425m, i11 | ((i10 << 12) & 458752));
        boolean zF = interfaceC2425m.F(dVarC) | (((i11 ^ 6) > 4 && interfaceC2425m.U(kVar)) || (i10 & 6) == 4);
        Object objD = interfaceC2425m.D();
        if (zF || objD == InterfaceC2425m.f22370a.a()) {
            objD = new a(kVar, dVarC, null);
            interfaceC2425m.u(objD);
        }
        AbstractC2393b0.d(dVarC, kVar, (Function2) objD, interfaceC2425m, (i10 << 3) & 112);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return dVarC;
    }

    public abstract androidx.compose.material.ripple.d c(B.k kVar, boolean z10, float f10, h2 h2Var, h2 h2Var2, InterfaceC2425m interfaceC2425m, int i10);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f16680a == cVar.f16680a && C5015h.q(this.f16681b, cVar.f16681b) && AbstractC5504s.c(this.f16682c, cVar.f16682c);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f16680a) * 31) + C5015h.r(this.f16681b)) * 31) + this.f16682c.hashCode();
    }

    private c(boolean z10, float f10, h2 h2Var) {
        this.f16680a = z10;
        this.f16681b = f10;
        this.f16682c = h2Var;
    }
}
