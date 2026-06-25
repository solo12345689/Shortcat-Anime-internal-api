package K0;

import Td.C2160k;
import Ud.AbstractC2279u;
import a0.C2507c;
import androidx.compose.ui.e;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: K0.c0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1781c0 {

    /* JADX INFO: renamed from: a */
    private final J f10665a;

    /* JADX INFO: renamed from: b */
    private final c f10666b;

    /* JADX INFO: renamed from: c */
    private final C1811y f10667c;

    /* JADX INFO: renamed from: d */
    private AbstractC1785e0 f10668d;

    /* JADX INFO: renamed from: e */
    private final e.c f10669e;

    /* JADX INFO: renamed from: f */
    private e.c f10670f;

    /* JADX INFO: renamed from: g */
    private C2507c f10671g;

    /* JADX INFO: renamed from: h */
    private C2507c f10672h;

    /* JADX INFO: renamed from: i */
    private final C2507c f10673i;

    /* JADX INFO: renamed from: j */
    private a f10674j;

    /* JADX INFO: renamed from: K0.c0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class a implements InterfaceC1804q {

        /* JADX INFO: renamed from: a */
        private e.c f10675a;

        /* JADX INFO: renamed from: b */
        private int f10676b;

        /* JADX INFO: renamed from: c */
        private C2507c f10677c;

        /* JADX INFO: renamed from: d */
        private C2507c f10678d;

        /* JADX INFO: renamed from: e */
        private boolean f10679e;

        public a(e.c cVar, int i10, C2507c c2507c, C2507c c2507c2, boolean z10) {
            this.f10675a = cVar;
            this.f10676b = i10;
            this.f10677c = c2507c;
            this.f10678d = c2507c2;
            this.f10679e = z10;
        }

        public final void a(C2507c c2507c) {
            this.f10678d = c2507c;
        }

        @Override // K0.InterfaceC1804q
        public void b(int i10, int i11) {
            e.c child$ui_release = this.f10675a.getChild$ui_release();
            AbstractC5504s.e(child$ui_release);
            C1781c0.d(C1781c0.this);
            if ((AbstractC1789g0.a(2) & child$ui_release.getKindSet$ui_release()) != 0) {
                AbstractC1785e0 coordinator$ui_release = child$ui_release.getCoordinator$ui_release();
                AbstractC5504s.e(coordinator$ui_release);
                AbstractC1785e0 abstractC1785e0P2 = coordinator$ui_release.P2();
                AbstractC1785e0 abstractC1785e0O2 = coordinator$ui_release.O2();
                AbstractC5504s.e(abstractC1785e0O2);
                if (abstractC1785e0P2 != null) {
                    abstractC1785e0P2.v3(abstractC1785e0O2);
                }
                abstractC1785e0O2.w3(abstractC1785e0P2);
                C1781c0.this.w(this.f10675a, abstractC1785e0O2);
            }
            this.f10675a = C1781c0.this.h(child$ui_release);
        }

        @Override // K0.InterfaceC1804q
        public boolean c(int i10, int i11) {
            C2507c c2507c = this.f10677c;
            int i12 = this.f10676b;
            return AbstractC1783d0.c((e.b) c2507c.f23496a[i10 + i12], (e.b) this.f10678d.f23496a[i12 + i11]) != 0;
        }

        @Override // K0.InterfaceC1804q
        public void d(int i10) {
            int i11 = this.f10676b + i10;
            this.f10675a = C1781c0.this.g((e.b) this.f10678d.f23496a[i11], this.f10675a);
            C1781c0.d(C1781c0.this);
            if (!this.f10679e) {
                this.f10675a.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
                return;
            }
            e.c child$ui_release = this.f10675a.getChild$ui_release();
            AbstractC5504s.e(child$ui_release);
            AbstractC1785e0 coordinator$ui_release = child$ui_release.getCoordinator$ui_release();
            AbstractC5504s.e(coordinator$ui_release);
            E eD = AbstractC1796k.d(this.f10675a);
            if (eD != null) {
                F f10 = new F(C1781c0.this.m(), eD);
                this.f10675a.updateCoordinator$ui_release(f10);
                C1781c0.this.w(this.f10675a, f10);
                f10.w3(coordinator$ui_release.P2());
                f10.v3(coordinator$ui_release);
                coordinator$ui_release.w3(f10);
            } else {
                this.f10675a.updateCoordinator$ui_release(coordinator$ui_release);
            }
            this.f10675a.markAsAttached$ui_release();
            this.f10675a.runAttachLifecycle$ui_release();
            AbstractC1791h0.a(this.f10675a);
        }

        @Override // K0.InterfaceC1804q
        public void e(int i10, int i11) {
            e.c child$ui_release = this.f10675a.getChild$ui_release();
            AbstractC5504s.e(child$ui_release);
            this.f10675a = child$ui_release;
            C2507c c2507c = this.f10677c;
            int i12 = this.f10676b;
            e.b bVar = (e.b) c2507c.f23496a[i10 + i12];
            e.b bVar2 = (e.b) this.f10678d.f23496a[i12 + i11];
            if (AbstractC5504s.c(bVar, bVar2)) {
                C1781c0.d(C1781c0.this);
            } else {
                C1781c0.this.G(bVar, bVar2, this.f10675a);
                C1781c0.d(C1781c0.this);
            }
        }

        public final void f(C2507c c2507c) {
            this.f10677c = c2507c;
        }

        public final void g(e.c cVar) {
            this.f10675a = cVar;
        }

        public final void h(int i10) {
            this.f10676b = i10;
        }

        public final void i(boolean z10) {
            this.f10679e = z10;
        }
    }

    /* JADX INFO: renamed from: K0.c0$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
    }

    /* JADX INFO: renamed from: K0.c0$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends e.c {
        c() {
        }

        public String toString() {
            return "<Head>";
        }
    }

    public C1781c0(J j10) {
        this.f10665a = j10;
        c cVar = new c();
        cVar.setAggregateChildKindSet$ui_release(-1);
        this.f10666b = cVar;
        C1811y c1811y = new C1811y(j10);
        this.f10667c = c1811y;
        this.f10668d = c1811y;
        E0 e0N2 = c1811y.N2();
        this.f10669e = e0N2;
        this.f10670f = e0N2;
        this.f10673i = new C2507c(new androidx.compose.ui.e[16], 0);
    }

    private final void B(int i10, C2507c c2507c, C2507c c2507c2, e.c cVar, boolean z10) {
        AbstractC1779b0.e(c2507c.p() - i10, c2507c2.p() - i10, j(cVar, i10, c2507c, c2507c2, z10));
        C();
    }

    private final void C() {
        int kindSet$ui_release = 0;
        for (e.c parent$ui_release = this.f10669e.getParent$ui_release(); parent$ui_release != null && parent$ui_release != this.f10666b; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            kindSet$ui_release |= parent$ui_release.getKindSet$ui_release();
            parent$ui_release.setAggregateChildKindSet$ui_release(kindSet$ui_release);
        }
    }

    private final e.c E(e.c cVar) {
        if (!(cVar == this.f10666b)) {
            H0.a.b("trimChain called on already trimmed chain");
        }
        e.c child$ui_release = this.f10666b.getChild$ui_release();
        if (child$ui_release == null) {
            child$ui_release = this.f10669e;
        }
        child$ui_release.setParent$ui_release(null);
        this.f10666b.setChild$ui_release(null);
        this.f10666b.setAggregateChildKindSet$ui_release(-1);
        this.f10666b.updateCoordinator$ui_release(null);
        if (!(child$ui_release != this.f10666b)) {
            H0.a.b("trimChain did not update the head");
        }
        return child$ui_release;
    }

    public final void G(e.b bVar, e.b bVar2, e.c cVar) {
        if ((bVar instanceof Y) && (bVar2 instanceof Y)) {
            AbstractC1783d0.e((Y) bVar2, cVar);
            if (cVar.isAttached()) {
                AbstractC1791h0.e(cVar);
                return;
            } else {
                cVar.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                return;
            }
        }
        if (!(cVar instanceof C1780c)) {
            H0.a.b("Unknown Modifier.Node type");
            return;
        }
        ((C1780c) cVar).I1(bVar2);
        if (cVar.isAttached()) {
            AbstractC1791h0.e(cVar);
        } else {
            cVar.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
        }
    }

    public static final /* synthetic */ b d(C1781c0 c1781c0) {
        c1781c0.getClass();
        return null;
    }

    public final e.c g(e.b bVar, e.c cVar) {
        e.c c1780c;
        if (bVar instanceof Y) {
            c1780c = ((Y) bVar).create();
            c1780c.setKindSet$ui_release(AbstractC1791h0.h(c1780c));
        } else {
            c1780c = new C1780c(bVar);
        }
        if (c1780c.isAttached()) {
            H0.a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        c1780c.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        return r(c1780c, cVar);
    }

    public final e.c h(e.c cVar) {
        if (cVar.isAttached()) {
            AbstractC1791h0.d(cVar);
            cVar.runDetachLifecycle$ui_release();
            cVar.markAsDetached$ui_release();
        }
        return x(cVar);
    }

    public final int i() {
        return this.f10670f.getAggregateChildKindSet$ui_release();
    }

    private final a j(e.c cVar, int i10, C2507c c2507c, C2507c c2507c2, boolean z10) {
        a aVar = this.f10674j;
        if (aVar == null) {
            a aVar2 = new a(cVar, i10, c2507c, c2507c2, z10);
            this.f10674j = aVar2;
            return aVar2;
        }
        aVar.g(cVar);
        aVar.h(i10);
        aVar.f(c2507c);
        aVar.a(c2507c2);
        aVar.i(z10);
        return aVar;
    }

    private final e.c r(e.c cVar, e.c cVar2) {
        e.c child$ui_release = cVar2.getChild$ui_release();
        if (child$ui_release != null) {
            child$ui_release.setParent$ui_release(cVar);
            cVar.setChild$ui_release(child$ui_release);
        }
        cVar2.setChild$ui_release(cVar);
        cVar.setParent$ui_release(cVar2);
        return cVar;
    }

    private final e.c v() {
        if (!(this.f10670f != this.f10666b)) {
            H0.a.b("padChain called on already padded chain");
        }
        e.c cVar = this.f10670f;
        cVar.setParent$ui_release(this.f10666b);
        this.f10666b.setChild$ui_release(cVar);
        return this.f10666b;
    }

    public final void w(e.c cVar, AbstractC1785e0 abstractC1785e0) {
        for (e.c parent$ui_release = cVar.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (parent$ui_release == this.f10666b) {
                J jA0 = this.f10665a.A0();
                abstractC1785e0.w3(jA0 != null ? jA0.X() : null);
                this.f10668d = abstractC1785e0;
                return;
            } else {
                if ((AbstractC1789g0.a(2) & parent$ui_release.getKindSet$ui_release()) != 0) {
                    return;
                }
                parent$ui_release.updateCoordinator$ui_release(abstractC1785e0);
            }
        }
    }

    private final e.c x(e.c cVar) {
        e.c child$ui_release = cVar.getChild$ui_release();
        e.c parent$ui_release = cVar.getParent$ui_release();
        if (child$ui_release != null) {
            child$ui_release.setParent$ui_release(parent$ui_release);
            cVar.setChild$ui_release(null);
        }
        if (parent$ui_release != null) {
            parent$ui_release.setChild$ui_release(child$ui_release);
            cVar.setParent$ui_release(null);
        }
        AbstractC5504s.e(parent$ui_release);
        return parent$ui_release;
    }

    public final void A() {
        for (e.c cVarP = p(); cVarP != null; cVarP = cVarP.getParent$ui_release()) {
            if (cVarP.isAttached()) {
                cVarP.runDetachLifecycle$ui_release();
            }
        }
    }

    public final void D() {
        AbstractC1785e0 f10;
        AbstractC1785e0 abstractC1785e0 = this.f10667c;
        for (e.c parent$ui_release = this.f10669e.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            E eD = AbstractC1796k.d(parent$ui_release);
            if (eD != null) {
                if (parent$ui_release.getCoordinator$ui_release() != null) {
                    AbstractC1785e0 coordinator$ui_release = parent$ui_release.getCoordinator$ui_release();
                    AbstractC5504s.f(coordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    f10 = (F) coordinator$ui_release;
                    E eL3 = f10.L3();
                    f10.O3(eD);
                    if (eL3 != parent$ui_release) {
                        f10.e3();
                    }
                } else {
                    f10 = new F(this.f10665a, eD);
                    parent$ui_release.updateCoordinator$ui_release(f10);
                }
                abstractC1785e0.w3(f10);
                f10.v3(abstractC1785e0);
                abstractC1785e0 = f10;
            } else {
                parent$ui_release.updateCoordinator$ui_release(abstractC1785e0);
            }
        }
        J jA0 = this.f10665a.A0();
        abstractC1785e0.w3(jA0 != null ? jA0.X() : null);
        this.f10668d = abstractC1785e0;
    }

    public final void F(androidx.compose.ui.e eVar) {
        C1781c0 c1781c0;
        e.c cVarV = v();
        C2507c c2507c = this.f10671g;
        int i10 = 0;
        int iP = c2507c != null ? c2507c.p() : 0;
        C2507c c2507c2 = this.f10672h;
        if (c2507c2 == null) {
            c2507c2 = new C2507c(new e.b[16], 0);
        }
        C2507c c2507cD = AbstractC1783d0.d(eVar, c2507c2, this.f10673i);
        C2507c c2507c3 = null;
        if (c2507cD.p() == iP) {
            e.c child$ui_release = cVarV.getChild$ui_release();
            int i11 = 0;
            while (true) {
                if (child$ui_release == null || i11 >= iP) {
                    break;
                }
                if (c2507c == null) {
                    H0.a.c("expected prior modifier list to be non-empty");
                    throw new C2160k();
                }
                e.b bVar = (e.b) c2507c.f23496a[i11];
                e.b bVar2 = (e.b) c2507cD.f23496a[i11];
                int iC = AbstractC1783d0.c(bVar, bVar2);
                if (iC == 0) {
                    child$ui_release = child$ui_release.getParent$ui_release();
                    break;
                }
                if (iC == 1) {
                    G(bVar, bVar2, child$ui_release);
                }
                child$ui_release = child$ui_release.getChild$ui_release();
                i11++;
            }
            e.c cVar = child$ui_release;
            if (i11 >= iP) {
                c1781c0 = this;
            } else {
                if (c2507c == null) {
                    H0.a.c("expected prior modifier list to be non-empty");
                    throw new C2160k();
                }
                if (cVar == null) {
                    H0.a.c("structuralUpdate requires a non-null tail");
                    throw new C2160k();
                }
                c1781c0 = this;
                c1781c0.B(i11, c2507c, c2507cD, cVar, !this.f10665a.L());
                i10 = 1;
            }
        } else {
            c1781c0 = this;
            if (c1781c0.f10665a.L() && iP == 0) {
                e.c cVarG = cVarV;
                while (i10 < c2507cD.p()) {
                    cVarG = g((e.b) c2507cD.f23496a[i10], cVarG);
                    i10++;
                }
                C();
            } else if (c2507cD.p() != 0) {
                if (c2507c == null) {
                    c2507c = new C2507c(new e.b[16], 0);
                }
                C2507c c2507c4 = c2507c;
                c1781c0.B(0, c2507c4, c2507cD, cVarV, !c1781c0.f10665a.L());
                c1781c0 = c1781c0;
                c2507c = c2507c4;
            } else {
                if (c2507c == null) {
                    H0.a.c("expected prior modifier list to be non-empty");
                    throw new C2160k();
                }
                e.c child$ui_release2 = cVarV.getChild$ui_release();
                for (int i12 = 0; child$ui_release2 != null && i12 < c2507c.p(); i12++) {
                    child$ui_release2 = h(child$ui_release2).getChild$ui_release();
                }
                C1811y c1811y = c1781c0.f10667c;
                J jA0 = c1781c0.f10665a.A0();
                c1811y.w3(jA0 != null ? jA0.X() : null);
                c1781c0.f10668d = c1781c0.f10667c;
            }
            i10 = 1;
        }
        c1781c0.f10671g = c2507cD;
        if (c2507c != null) {
            c2507c.i();
            c2507c3 = c2507c;
        }
        c1781c0.f10672h = c2507c3;
        c1781c0.f10670f = E(cVarV);
        if (i10 != 0) {
            D();
        }
    }

    public final e.c k() {
        return this.f10670f;
    }

    public final C1811y l() {
        return this.f10667c;
    }

    public final J m() {
        return this.f10665a;
    }

    public final List n() {
        C2507c c2507c = this.f10671g;
        if (c2507c == null) {
            return AbstractC2279u.m();
        }
        int i10 = 0;
        C2507c c2507c2 = new C2507c(new I0.F[c2507c.p()], 0);
        e.c cVarK = k();
        while (cVarK != null && cVarK != p()) {
            AbstractC1785e0 coordinator$ui_release = cVarK.getCoordinator$ui_release();
            if (coordinator$ui_release == null) {
                throw new IllegalArgumentException("getModifierInfo called on node with no coordinator");
            }
            o0 o0VarH2 = coordinator$ui_release.H2();
            o0 o0VarH22 = this.f10667c.H2();
            e.c child$ui_release = cVarK.getChild$ui_release();
            if (child$ui_release != this.f10669e || cVarK.getCoordinator$ui_release() == child$ui_release.getCoordinator$ui_release()) {
                o0VarH22 = null;
            }
            if (o0VarH2 == null) {
                o0VarH2 = o0VarH22;
            }
            c2507c2.c(new I0.F((androidx.compose.ui.e) c2507c.f23496a[i10], coordinator$ui_release, o0VarH2));
            cVarK = cVarK.getChild$ui_release();
            i10++;
        }
        return c2507c2.h();
    }

    public final AbstractC1785e0 o() {
        return this.f10668d;
    }

    public final e.c p() {
        return this.f10669e;
    }

    public final boolean q(int i10) {
        return (i10 & i()) != 0;
    }

    public final boolean s() {
        return this.f10666b.getChild$ui_release() != null;
    }

    public final void t() {
        for (e.c cVarK = k(); cVarK != null; cVarK = cVarK.getChild$ui_release()) {
            cVarK.markAsAttached$ui_release();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        if (this.f10670f == this.f10669e) {
            sb2.append("]");
        } else {
            e.c cVarK = k();
            while (true) {
                if (cVarK == null || cVarK == p()) {
                    break;
                }
                sb2.append(String.valueOf(cVarK));
                if (cVarK.getChild$ui_release() == this.f10669e) {
                    sb2.append("]");
                    break;
                }
                sb2.append(com.amazon.a.a.o.b.f.f34694a);
                cVarK = cVarK.getChild$ui_release();
            }
        }
        String string = sb2.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }

    public final void u() {
        for (e.c cVarP = p(); cVarP != null; cVarP = cVarP.getParent$ui_release()) {
            if (cVarP.isAttached()) {
                cVarP.markAsDetached$ui_release();
            }
        }
    }

    public final void y() {
        for (e.c cVarP = p(); cVarP != null; cVarP = cVarP.getParent$ui_release()) {
            if (cVarP.isAttached()) {
                cVarP.reset$ui_release();
            }
        }
        A();
        u();
    }

    public final void z() {
        for (e.c cVarK = k(); cVarK != null; cVarK = cVarK.getChild$ui_release()) {
            cVarK.runAttachLifecycle$ui_release();
            if (cVarK.getInsertedNodeAwaitingAttachForInvalidation$ui_release()) {
                AbstractC1791h0.a(cVarK);
            }
            if (cVarK.getUpdatedNodeAwaitingAttachForInvalidation$ui_release()) {
                AbstractC1791h0.e(cVarK);
            }
            cVarK.setInsertedNodeAwaitingAttachForInvalidation$ui_release(false);
            cVarK.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(false);
        }
    }
}
