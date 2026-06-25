package sf;

import Be.C1114i;
import Be.C1116k;
import Ud.AbstractC2279u;
import Ud.a0;
import java.util.List;
import jf.InterfaceC5387k;
import kotlin.jvm.internal.AbstractC5504s;
import pf.C6041f;
import qf.E0;
import qf.G0;
import rf.AbstractC6317g;
import ye.AbstractC7241t;
import ye.E;
import ye.EnumC7228f;
import ye.H;
import ye.InterfaceC7227e;
import ye.h0;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: sf.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6529a extends C1116k {
    /* JADX WARN: Illegal instructions before constructor call */
    public C6529a(Xe.f name) {
        AbstractC5504s.h(name, "name");
        l lVar = l.f59724a;
        H hI = lVar.i();
        E e10 = E.f65062d;
        EnumC7228f enumC7228f = EnumC7228f.f65097b;
        List listM = AbstractC2279u.m();
        h0 h0Var = h0.f65112a;
        super(hI, name, e10, enumC7228f, listM, h0Var, false, C6041f.f56045e);
        C1114i c1114iN1 = C1114i.n1(this, InterfaceC7374h.f66223k0.b(), true, h0Var);
        c1114iN1.q1(AbstractC2279u.m(), AbstractC7241t.f65123d);
        AbstractC5504s.g(c1114iN1, "apply(...)");
        InterfaceC5387k interfaceC5387kB = l.b(h.f59622j, c1114iN1.getName().toString(), "");
        k kVar = k.f59663R0;
        c1114iN1.g1(new i(lVar.e(kVar, new String[0]), interfaceC5387kB, kVar, null, false, new String[0], 24, null));
        K0(interfaceC5387kB, a0.c(c1114iN1), c1114iN1);
    }

    @Override // Be.AbstractC1106a, ye.j0
    /* JADX INFO: renamed from: H0 */
    public InterfaceC7227e c(G0 substitutor) {
        AbstractC5504s.h(substitutor, "substitutor");
        return this;
    }

    @Override // Be.AbstractC1106a, Be.z
    public InterfaceC5387k T(E0 typeSubstitution, AbstractC6317g kotlinTypeRefiner) {
        AbstractC5504s.h(typeSubstitution, "typeSubstitution");
        AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return l.b(h.f59622j, getName().toString(), typeSubstitution.toString());
    }

    @Override // Be.C1116k
    public String toString() {
        String strB = getName().b();
        AbstractC5504s.g(strB, "asString(...)");
        return strB;
    }
}
