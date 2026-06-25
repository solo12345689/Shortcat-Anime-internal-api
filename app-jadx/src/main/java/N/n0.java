package N;

import Gf.AbstractC1617k;
import I0.InterfaceC1690p;
import K.C1774y;
import K0.AbstractC1792i;
import K0.InterfaceC1790h;
import K0.InterfaceC1808v;
import N.q0;
import Td.C2160k;
import Y.C0;
import Y.b2;
import ae.AbstractC2605b;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.A1;
import androidx.compose.ui.platform.AbstractC2706i1;
import androidx.compose.ui.platform.AbstractC2739w0;
import androidx.compose.ui.platform.InterfaceC2703h1;
import androidx.compose.ui.platform.InterfaceC2724o1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends e.c implements InterfaceC2703h1, InterfaceC1790h, InterfaceC1808v, q0.a {

    /* JADX INFO: renamed from: a */
    private q0 f12503a;

    /* JADX INFO: renamed from: b */
    private C1774y f12504b;

    /* JADX INFO: renamed from: c */
    private Q.F f12505c;

    /* JADX INFO: renamed from: d */
    private final C0 f12506d = b2.e(null, null, 2, null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f12507a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Function2 f12509c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function2 function2, Zd.e eVar) {
            super(2, eVar);
            this.f12509c = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return n0.this.new a(this.f12509c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f12507a;
            if (i10 == 0) {
                Td.v.b(obj);
                n0 n0Var = n0.this;
                Function2 function2 = this.f12509c;
                this.f12507a = 1;
                if (AbstractC2706i1.b(n0Var, function2, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            throw new C2160k();
        }
    }

    public n0(q0 q0Var, C1774y c1774y, Q.F f10) {
        this.f12503a = q0Var;
        this.f12504b = c1774y;
        this.f12505c = f10;
    }

    private void E1(InterfaceC1690p interfaceC1690p) {
        this.f12506d.setValue(interfaceC1690p);
    }

    public void F1(C1774y c1774y) {
        this.f12504b = c1774y;
    }

    public final void G1(q0 q0Var) {
        if (isAttached()) {
            this.f12503a.b();
            this.f12503a.l(this);
        }
        this.f12503a = q0Var;
        if (isAttached()) {
            this.f12503a.j(this);
        }
    }

    public void H1(Q.F f10) {
        this.f12505c = f10;
    }

    @Override // N.q0.a
    public Gf.C0 O0(Function2 function2) {
        if (isAttached()) {
            return AbstractC1617k.d(getCoroutineScope(), null, Gf.Q.f7532d, new a(function2, null), 1, null);
        }
        return null;
    }

    @Override // N.q0.a
    public Q.F Y0() {
        return this.f12505c;
    }

    @Override // N.q0.a
    public InterfaceC2724o1 getSoftwareKeyboardController() {
        return (InterfaceC2724o1) AbstractC1792i.a(this, AbstractC2739w0.o());
    }

    @Override // N.q0.a
    public A1 getViewConfiguration() {
        return (A1) AbstractC1792i.a(this, AbstractC2739w0.r());
    }

    @Override // N.q0.a
    public InterfaceC1690p o0() {
        return (InterfaceC1690p) this.f12506d.getValue();
    }

    @Override // androidx.compose.ui.e.c
    public void onAttach() {
        this.f12503a.j(this);
    }

    @Override // androidx.compose.ui.e.c
    public void onDetach() {
        this.f12503a.l(this);
    }

    @Override // K0.InterfaceC1808v
    public void p(InterfaceC1690p interfaceC1690p) {
        E1(interfaceC1690p);
    }

    @Override // N.q0.a
    public C1774y y1() {
        return this.f12504b;
    }
}
