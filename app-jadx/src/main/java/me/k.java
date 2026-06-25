package Me;

import Df.r;
import Ud.AbstractC2279u;
import af.n;
import af.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf.InterfaceC5387k;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import qf.A0;
import qf.AbstractC6183d0;
import qf.B0;
import qf.I;
import qf.InterfaceC6181c0;
import qf.S;
import qf.r0;
import rf.AbstractC6317g;
import rf.InterfaceC6315e;
import vf.AbstractC6867d;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class k extends I implements InterfaceC6181c0 {
    private k(AbstractC6183d0 abstractC6183d0, AbstractC6183d0 abstractC6183d02, boolean z10) {
        super(abstractC6183d0, abstractC6183d02);
        if (z10) {
            return;
        }
        InterfaceC6315e.f58773a.a(abstractC6183d0, abstractC6183d02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence b1(String it) {
        AbstractC5504s.h(it, "it");
        return "(raw) " + it;
    }

    private static final boolean c1(String str, String str2) {
        return AbstractC5504s.c(str, r.C0(str2, "out ")) || AbstractC5504s.c(str2, "*");
    }

    private static final List d1(n nVar, S s10) {
        List listL0 = s10.L0();
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listL0, 10));
        Iterator it = listL0.iterator();
        while (it.hasNext()) {
            arrayList.add(nVar.T((B0) it.next()));
        }
        return arrayList;
    }

    private static final String e1(String str, String str2) {
        if (!r.V(str, '<', false, 2, null)) {
            return str;
        }
        return r.d1(str, '<', null, 2, null) + '<' + str2 + '>' + r.Z0(str, '>', null, 2, null);
    }

    @Override // qf.I
    public AbstractC6183d0 U0() {
        return V0();
    }

    @Override // qf.I
    public String X0(n renderer, w options) {
        AbstractC5504s.h(renderer, "renderer");
        AbstractC5504s.h(options, "options");
        String strS = renderer.S(V0());
        String strS2 = renderer.S(W0());
        if (options.i()) {
            return "raw (" + strS + ".." + strS2 + ')';
        }
        if (W0().L0().isEmpty()) {
            return renderer.P(strS, strS2, AbstractC6867d.n(this));
        }
        List listD1 = d1(renderer, V0());
        List listD12 = d1(renderer, W0());
        String strW0 = AbstractC2279u.w0(listD1, ", ", null, null, 0, null, j.f12429a, 30, null);
        List<Pair> listJ1 = AbstractC2279u.j1(listD1, listD12);
        if (listJ1 == null || !listJ1.isEmpty()) {
            for (Pair pair : listJ1) {
                if (!c1((String) pair.c(), (String) pair.d())) {
                    break;
                }
            }
            strS2 = e1(strS2, strW0);
        } else {
            strS2 = e1(strS2, strW0);
        }
        String strE1 = e1(strS, strW0);
        return AbstractC5504s.c(strE1, strS2) ? strE1 : renderer.P(strE1, strS2, AbstractC6867d.n(this));
    }

    @Override // qf.M0
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public k R0(boolean z10) {
        return new k(V0().R0(z10), W0().R0(z10));
    }

    @Override // qf.M0
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public I X0(AbstractC6317g kotlinTypeRefiner) {
        AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        S sA = kotlinTypeRefiner.a(V0());
        AbstractC5504s.f(sA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        S sA2 = kotlinTypeRefiner.a(W0());
        AbstractC5504s.f(sA2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new k((AbstractC6183d0) sA, (AbstractC6183d0) sA2, true);
    }

    @Override // qf.M0
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public k T0(r0 newAttributes) {
        AbstractC5504s.h(newAttributes, "newAttributes");
        return new k(V0().T0(newAttributes), W0().T0(newAttributes));
    }

    @Override // qf.I, qf.S
    public InterfaceC5387k o() {
        InterfaceC7230h interfaceC7230hP = N0().p();
        A0 a02 = null;
        byte b10 = 0;
        InterfaceC7227e interfaceC7227e = interfaceC7230hP instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC7230hP : null;
        if (interfaceC7227e != null) {
            InterfaceC5387k interfaceC5387kL = interfaceC7227e.L(new i(a02, 1, b10 == true ? 1 : 0));
            AbstractC5504s.g(interfaceC5387kL, "getMemberScope(...)");
            return interfaceC5387kL;
        }
        throw new IllegalStateException(("Incorrect classifier: " + N0().p()).toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(AbstractC6183d0 lowerBound, AbstractC6183d0 upperBound) {
        this(lowerBound, upperBound, false);
        AbstractC5504s.h(lowerBound, "lowerBound");
        AbstractC5504s.h(upperBound, "upperBound");
    }
}
