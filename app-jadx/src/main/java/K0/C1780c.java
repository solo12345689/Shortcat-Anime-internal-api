package K0;

import E0.C1307q;
import E0.EnumC1308s;
import I0.InterfaceC1686l;
import I0.InterfaceC1687m;
import I0.InterfaceC1690p;
import a0.C2507c;
import androidx.compose.ui.e;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i1.AbstractC5026s;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import ie.InterfaceC5082a;
import java.util.HashSet;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import p0.InterfaceC5909d;
import q0.C6063i;
import q0.InterfaceC6058d;
import q0.InterfaceC6065k;
import q0.InterfaceC6067m;
import u0.InterfaceC6708c;

/* JADX INFO: renamed from: K0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1780c extends e.c implements E, InterfaceC1806t, A0, v0, J0.h, J0.k, s0, D, InterfaceC1808v, InterfaceC6058d, InterfaceC6065k, InterfaceC6067m, q0, InterfaceC5909d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e.b f10658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private J0.a f10660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HashSet f10661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC1690p f10662e;

    /* JADX INFO: renamed from: K0.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {
        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m24invoke();
            return Td.L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m24invoke() {
            C1780c.this.K1();
        }
    }

    /* JADX INFO: renamed from: K0.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {
        b() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m25invoke();
            return Td.L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m25invoke() {
            e.b bVarE1 = C1780c.this.E1();
            AbstractC5504s.f(bVarE1, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
            ((J0.d) bVarE1).f(C1780c.this);
        }
    }

    public C1780c(e.b bVar) {
        setKindSet$ui_release(AbstractC1791h0.f(bVar));
        this.f10658a = bVar;
        this.f10659b = true;
        this.f10661d = new HashSet();
    }

    private final void G1(boolean z10) {
        if (!isAttached()) {
            H0.a.b("initializeModifier called on unattached node");
        }
        e.b bVar = this.f10658a;
        if ((AbstractC1789g0.a(32) & getKindSet$ui_release()) != 0) {
            if (bVar instanceof J0.d) {
                sideEffect(new a());
            }
            if (bVar instanceof J0.j) {
                L1((J0.j) bVar);
            }
        }
        if ((AbstractC1789g0.a(4) & getKindSet$ui_release()) != 0 && !z10) {
            H.a(this);
        }
        if ((AbstractC1789g0.a(2) & getKindSet$ui_release()) != 0) {
            if (AbstractC1782d.d(this)) {
                AbstractC1785e0 coordinator$ui_release = getCoordinator$ui_release();
                AbstractC5504s.e(coordinator$ui_release);
                ((F) coordinator$ui_release).O3(this);
                coordinator$ui_release.e3();
            }
            if (!z10) {
                H.a(this);
                AbstractC1796k.n(this).R0();
            }
        }
        if (bVar instanceof I0.L) {
            ((I0.L) bVar).d(AbstractC1796k.n(this));
        }
        AbstractC1789g0.a(128);
        getKindSet$ui_release();
        if ((AbstractC1789g0.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) & getKindSet$ui_release()) != 0 && (bVar instanceof I0.G) && AbstractC1782d.d(this)) {
            AbstractC1796k.n(this).R0();
        }
        if ((AbstractC1789g0.a(16) & getKindSet$ui_release()) != 0 && (bVar instanceof E0.J)) {
            ((E0.J) bVar).g().f(getCoordinator$ui_release());
        }
        if ((AbstractC1789g0.a(8) & getKindSet$ui_release()) != 0) {
            AbstractC1796k.o(this).H();
        }
    }

    private final void J1() {
        if (!isAttached()) {
            H0.a.b("unInitializeModifier called on unattached node");
        }
        e.b bVar = this.f10658a;
        if ((AbstractC1789g0.a(32) & getKindSet$ui_release()) != 0) {
            if (bVar instanceof J0.j) {
                AbstractC1796k.o(this).getModifierLocalManager().d(this, ((J0.j) bVar).getKey());
            }
            if (bVar instanceof J0.d) {
                ((J0.d) bVar).f(AbstractC1782d.f10681a);
            }
        }
        if ((AbstractC1789g0.a(8) & getKindSet$ui_release()) != 0) {
            AbstractC1796k.o(this).H();
        }
    }

    private final void L1(J0.j jVar) {
        J0.a aVar = this.f10660c;
        if (aVar != null && aVar.a(jVar.getKey())) {
            aVar.c(jVar);
            AbstractC1796k.o(this).getModifierLocalManager().f(this, jVar.getKey());
        } else {
            this.f10660c = new J0.a(jVar);
            if (AbstractC1782d.d(this)) {
                AbstractC1796k.o(this).getModifierLocalManager().a(this, jVar.getKey());
            }
        }
    }

    public final e.b E1() {
        return this.f10658a;
    }

    public final HashSet F1() {
        return this.f10661d;
    }

    public final void H1() {
        this.f10659b = true;
        AbstractC1807u.a(this);
    }

    public final void I1(e.b bVar) {
        if (isAttached()) {
            J1();
        }
        this.f10658a = bVar;
        setKindSet$ui_release(AbstractC1791h0.f(bVar));
        if (isAttached()) {
            G1(false);
        }
    }

    @Override // K0.q0
    public boolean J0() {
        return isAttached();
    }

    public final void K1() {
        if (isAttached()) {
            this.f10661d.clear();
            AbstractC1796k.o(this).getSnapshotObserver().i(this, AbstractC1782d.f10683c, new b());
        }
    }

    @Override // K0.D
    public void L(InterfaceC1690p interfaceC1690p) {
        this.f10662e = interfaceC1690p;
    }

    @Override // q0.InterfaceC6065k
    public void P0(androidx.compose.ui.focus.i iVar) {
        e.b bVar = this.f10658a;
        H0.a.b("applyFocusProperties called on wrong node");
        android.support.v4.media.session.b.a(bVar);
        new C6063i(iVar);
        throw null;
    }

    @Override // K0.v0
    public void S(C1307q c1307q, EnumC1308s enumC1308s, long j10) {
        e.b bVar = this.f10658a;
        AbstractC5504s.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((E0.J) bVar).g().e(c1307q, enumC1308s, j10);
    }

    @Override // q0.InterfaceC6058d
    public void W0(q0.n nVar) {
        e.b bVar = this.f10658a;
        H0.a.b("onFocusEvent called on wrong node");
        android.support.v4.media.session.b.a(bVar);
        throw null;
    }

    @Override // K0.A0
    public void Y(R0.C c10) {
        e.b bVar = this.f10658a;
        AbstractC5504s.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        SemanticsConfiguration semanticsConfigurationE = ((R0.q) bVar).e();
        AbstractC5504s.f(c10, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        ((SemanticsConfiguration) c10).d(semanticsConfigurationE);
    }

    @Override // K0.v0
    public void a1() {
        e.b bVar = this.f10658a;
        AbstractC5504s.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((E0.J) bVar).g().d();
    }

    @Override // K0.s0
    public Object b(InterfaceC5011d interfaceC5011d, Object obj) {
        e.b bVar = this.f10658a;
        AbstractC5504s.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((I0.H) bVar).b(interfaceC5011d, obj);
    }

    @Override // K0.InterfaceC1806t
    public void draw(InterfaceC6708c interfaceC6708c) {
        e.b bVar = this.f10658a;
        AbstractC5504s.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((p0.i) bVar).draw(interfaceC6708c);
    }

    @Override // p0.InterfaceC5909d
    public long f() {
        return AbstractC5026s.d(AbstractC1796k.i(this, AbstractC1789g0.a(128)).a());
    }

    @Override // K0.v0
    public boolean f0() {
        e.b bVar = this.f10658a;
        AbstractC5504s.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((E0.J) bVar).g().a();
    }

    @Override // p0.InterfaceC5909d
    public InterfaceC5011d getDensity() {
        return AbstractC1796k.n(this).R();
    }

    @Override // p0.InterfaceC5909d
    public EnumC5027t getLayoutDirection() {
        return AbstractC1796k.n(this).getLayoutDirection();
    }

    @Override // J0.h
    public J0.g h0() {
        J0.a aVar = this.f10660c;
        return aVar != null ? aVar : J0.i.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // J0.h, J0.k
    public Object j(J0.c cVar) {
        C1781c0 c1781c0T0;
        this.f10661d.add(cVar);
        int iA = AbstractC1789g0.a(32);
        if (!getNode().isAttached()) {
            H0.a.b("visitAncestors called on an unattached node");
        }
        e.c parent$ui_release = getNode().getParent$ui_release();
        J jN = AbstractC1796k.n(this);
        while (jN != null) {
            if ((jN.t0().k().getAggregateChildKindSet$ui_release() & iA) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & iA) != 0) {
                        ?? H10 = parent$ui_release;
                        ?? c2507c = 0;
                        while (H10 != 0) {
                            if (H10 instanceof J0.h) {
                                J0.h hVar = (J0.h) H10;
                                if (hVar.h0().a(cVar)) {
                                    return hVar.h0().b(cVar);
                                }
                            } else if ((H10.getKindSet$ui_release() & iA) != 0 && (H10 instanceof AbstractC1800m)) {
                                e.c cVarF1 = ((AbstractC1800m) H10).F1();
                                int i10 = 0;
                                H10 = H10;
                                c2507c = c2507c;
                                while (cVarF1 != null) {
                                    if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                                        i10++;
                                        c2507c = c2507c;
                                        if (i10 == 1) {
                                            H10 = cVarF1;
                                        } else {
                                            if (c2507c == 0) {
                                                c2507c = new C2507c(new e.c[16], 0);
                                            }
                                            if (H10 != 0) {
                                                c2507c.c(H10);
                                                H10 = 0;
                                            }
                                            c2507c.c(cVarF1);
                                        }
                                    }
                                    cVarF1 = cVarF1.getChild$ui_release();
                                    H10 = H10;
                                    c2507c = c2507c;
                                }
                                if (i10 == 1) {
                                }
                            }
                            H10 = AbstractC1796k.h(c2507c);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            jN = jN.A0();
            parent$ui_release = (jN == null || (c1781c0T0 = jN.t0()) == null) ? null : c1781c0T0.p();
        }
        return cVar.a().invoke();
    }

    @Override // K0.E
    public int maxIntrinsicHeight(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        e.b bVar = this.f10658a;
        AbstractC5504s.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((I0.v) bVar).maxIntrinsicHeight(interfaceC1687m, interfaceC1686l, i10);
    }

    @Override // K0.E
    public int maxIntrinsicWidth(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        e.b bVar = this.f10658a;
        AbstractC5504s.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((I0.v) bVar).maxIntrinsicWidth(interfaceC1687m, interfaceC1686l, i10);
    }

    @Override // K0.E
    /* JADX INFO: renamed from: measure-3p2s80s */
    public I0.C mo5measure3p2s80s(androidx.compose.ui.layout.l lVar, I0.A a10, long j10) {
        e.b bVar = this.f10658a;
        AbstractC5504s.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((I0.v) bVar).mo2measure3p2s80s(lVar, a10, j10);
    }

    @Override // K0.E
    public int minIntrinsicHeight(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        e.b bVar = this.f10658a;
        AbstractC5504s.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((I0.v) bVar).minIntrinsicHeight(interfaceC1687m, interfaceC1686l, i10);
    }

    @Override // K0.E
    public int minIntrinsicWidth(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        e.b bVar = this.f10658a;
        AbstractC5504s.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((I0.v) bVar).minIntrinsicWidth(interfaceC1687m, interfaceC1686l, i10);
    }

    @Override // androidx.compose.ui.e.c
    public void onAttach() {
        G1(true);
    }

    @Override // K0.InterfaceC1794j, K0.v0
    public void onDensityChange() {
        if (this.f10658a instanceof E0.J) {
            a1();
        }
    }

    @Override // androidx.compose.ui.e.c
    public void onDetach() {
        J1();
    }

    @Override // K0.InterfaceC1806t
    public void onMeasureResultChanged() {
        this.f10659b = true;
        AbstractC1807u.a(this);
    }

    @Override // K0.InterfaceC1808v
    public void p(InterfaceC1690p interfaceC1690p) {
        e.b bVar = this.f10658a;
        AbstractC5504s.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((I0.G) bVar).p(interfaceC1690p);
    }

    public String toString() {
        return this.f10658a.toString();
    }

    @Override // K0.v0
    public boolean u1() {
        e.b bVar = this.f10658a;
        AbstractC5504s.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((E0.J) bVar).g().c();
    }

    @Override // K0.D
    public void I(long j10) {
    }
}
