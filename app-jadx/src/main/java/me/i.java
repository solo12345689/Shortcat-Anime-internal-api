package Me;

import Td.z;
import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.List;
import jf.InterfaceC5387k;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.A0;
import qf.AbstractC6183d0;
import qf.B0;
import qf.D0;
import qf.E0;
import qf.F;
import qf.I0;
import qf.L;
import qf.N0;
import qf.S;
import qf.V;
import qf.W;
import qf.r0;
import qf.v0;
import rf.AbstractC6317g;
import sf.l;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.m0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class i extends E0 {

    /* JADX INFO: renamed from: e */
    public static final a f12424e = new a(null);

    /* JADX INFO: renamed from: f */
    private static final Me.a f12425f;

    /* JADX INFO: renamed from: g */
    private static final Me.a f12426g;

    /* JADX INFO: renamed from: c */
    private final g f12427c;

    /* JADX INFO: renamed from: d */
    private final A0 f12428d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        I0 i02 = I0.f57982b;
        f12425f = b.b(i02, false, true, null, 5, null).l(c.f12406c);
        f12426g = b.b(i02, false, true, null, 5, null).l(c.f12405b);
    }

    public i(A0 a02) {
        g gVar = new g();
        this.f12427c = gVar;
        this.f12428d = a02 == null ? new A0(gVar, null, 2, null) : a02;
    }

    private final Pair j(AbstractC6183d0 abstractC6183d0, InterfaceC7227e interfaceC7227e, Me.a aVar) {
        if (abstractC6183d0.N0().getParameters().isEmpty()) {
            return z.a(abstractC6183d0, Boolean.FALSE);
        }
        if (ve.i.d0(abstractC6183d0)) {
            B0 b02 = (B0) abstractC6183d0.L0().get(0);
            N0 n0B = b02.b();
            S type = b02.getType();
            AbstractC5504s.g(type, "getType(...)");
            return z.a(V.k(abstractC6183d0.M0(), abstractC6183d0.N0(), AbstractC2279u.e(new D0(n0B, l(type, aVar))), abstractC6183d0.O0(), null, 16, null), Boolean.FALSE);
        }
        if (W.a(abstractC6183d0)) {
            return z.a(l.d(sf.k.f59669X, abstractC6183d0.N0().toString()), Boolean.FALSE);
        }
        InterfaceC5387k interfaceC5387kL = interfaceC7227e.L(this);
        AbstractC5504s.g(interfaceC5387kL, "getMemberScope(...)");
        r0 r0VarM0 = abstractC6183d0.M0();
        v0 v0VarL = interfaceC7227e.l();
        AbstractC5504s.g(v0VarL, "getTypeConstructor(...)");
        List<m0> parameters = interfaceC7227e.l().getParameters();
        AbstractC5504s.g(parameters, "getParameters(...)");
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(parameters, 10));
        for (m0 m0Var : parameters) {
            g gVar = this.f12427c;
            AbstractC5504s.e(m0Var);
            arrayList.add(F.b(gVar, m0Var, aVar, this.f12428d, null, 8, null));
        }
        return z.a(V.n(r0VarM0, v0VarL, arrayList, abstractC6183d0.O0(), interfaceC5387kL, new h(interfaceC7227e, this, abstractC6183d0, aVar)), Boolean.TRUE);
    }

    public static final AbstractC6183d0 k(InterfaceC7227e interfaceC7227e, i iVar, AbstractC6183d0 abstractC6183d0, Me.a aVar, AbstractC6317g kotlinTypeRefiner) {
        InterfaceC7227e interfaceC7227eB;
        AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        Xe.b bVarN = ff.e.n(interfaceC7227e);
        if (bVarN == null || (interfaceC7227eB = kotlinTypeRefiner.b(bVarN)) == null || AbstractC5504s.c(interfaceC7227eB, interfaceC7227e)) {
            return null;
        }
        return (AbstractC6183d0) iVar.j(abstractC6183d0, interfaceC7227eB, aVar).c();
    }

    private final S l(S s10, Me.a aVar) {
        InterfaceC7230h interfaceC7230hP = s10.N0().p();
        if (interfaceC7230hP instanceof m0) {
            return l(this.f12428d.e((m0) interfaceC7230hP, aVar.j(true)), aVar);
        }
        if (!(interfaceC7230hP instanceof InterfaceC7227e)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + interfaceC7230hP).toString());
        }
        InterfaceC7230h interfaceC7230hP2 = L.d(s10).N0().p();
        if (interfaceC7230hP2 instanceof InterfaceC7227e) {
            Pair pairJ = j(L.c(s10), (InterfaceC7227e) interfaceC7230hP, f12425f);
            AbstractC6183d0 abstractC6183d0 = (AbstractC6183d0) pairJ.getFirst();
            boolean zBooleanValue = ((Boolean) pairJ.getSecond()).booleanValue();
            Pair pairJ2 = j(L.d(s10), (InterfaceC7227e) interfaceC7230hP2, f12426g);
            AbstractC6183d0 abstractC6183d02 = (AbstractC6183d0) pairJ2.getFirst();
            return (zBooleanValue || ((Boolean) pairJ2.getSecond()).booleanValue()) ? new k(abstractC6183d0, abstractC6183d02) : V.e(abstractC6183d0, abstractC6183d02);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + interfaceC7230hP2 + "\" while for lower it's \"" + interfaceC7230hP + '\"').toString());
    }

    static /* synthetic */ S m(i iVar, S s10, Me.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = new Me.a(I0.f57982b, null, false, false, null, null, 62, null);
        }
        return iVar.l(s10, aVar);
    }

    @Override // qf.E0
    public boolean f() {
        return false;
    }

    @Override // qf.E0
    /* JADX INFO: renamed from: n */
    public D0 e(S key) {
        AbstractC5504s.h(key, "key");
        return new D0(m(this, key, null, 2, null));
    }

    public /* synthetic */ i(A0 a02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : a02);
    }
}
