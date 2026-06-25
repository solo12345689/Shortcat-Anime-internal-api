package x;

import Gf.AbstractC1617k;
import I0.InterfaceC1690p;
import K0.A0;
import K0.AbstractC1800m;
import K0.B0;
import K0.InterfaceC1808v;
import ae.AbstractC2605b;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import q0.InterfaceC6058d;
import q0.InterfaceC6067m;

/* JADX INFO: renamed from: x.z */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C7028z extends AbstractC1800m implements InterfaceC6058d, A0, InterfaceC1808v, InterfaceC6067m {

    /* JADX INFO: renamed from: c */
    private final boolean f63399c;

    /* JADX INFO: renamed from: d */
    private q0.n f63400d;

    /* JADX INFO: renamed from: e */
    private final C7027y f63401e;

    /* JADX INFO: renamed from: f */
    private final C6981A f63402f = (C6981A) E1(new C6981A());

    /* JADX INFO: renamed from: g */
    private final C6983C f63403g = (C6983C) E1(new C6983C());

    /* JADX INFO: renamed from: x.z$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {
        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Boolean invoke() {
            return Boolean.valueOf(androidx.compose.ui.focus.m.a(C7028z.this));
        }
    }

    /* JADX INFO: renamed from: x.z$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f63405a;

        b(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return C7028z.this.new b(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f63405a;
            if (i10 == 0) {
                Td.v.b(obj);
                C7028z c7028z = C7028z.this;
                this.f63405a = 1;
                if (H.f.b(c7028z, null, this, 1, null) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            return Td.L.f17438a;
        }
    }

    public C7028z(B.m mVar) {
        this.f63401e = (C7027y) E1(new C7027y(mVar));
        E1(androidx.compose.ui.focus.p.a());
    }

    public final void K1(B.m mVar) {
        this.f63401e.H1(mVar);
    }

    @Override // q0.InterfaceC6058d
    public void W0(q0.n nVar) {
        if (AbstractC5504s.c(this.f63400d, nVar)) {
            return;
        }
        boolean zA = nVar.a();
        if (zA) {
            AbstractC1617k.d(getCoroutineScope(), null, null, new b(null), 3, null);
        }
        if (isAttached()) {
            B0.b(this);
        }
        this.f63401e.G1(zA);
        this.f63403g.G1(zA);
        this.f63402f.F1(zA);
        this.f63400d = nVar;
    }

    @Override // K0.A0
    public void Y(R0.C c10) {
        q0.n nVar = this.f63400d;
        boolean z10 = false;
        if (nVar != null && nVar.a()) {
            z10 = true;
        }
        R0.A.X(c10, z10);
        R0.A.L(c10, null, new a(), 1, null);
    }

    @Override // androidx.compose.ui.e.c
    public boolean getShouldAutoInvalidate() {
        return this.f63399c;
    }

    @Override // K0.InterfaceC1808v
    public void p(InterfaceC1690p interfaceC1690p) {
        this.f63403g.p(interfaceC1690p);
    }
}
