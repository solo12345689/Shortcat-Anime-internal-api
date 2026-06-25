package qf;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rf.C6319i;
import uf.InterfaceC6773e;
import ye.InterfaceC7230h;

/* JADX INFO: renamed from: qf.y */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6214y extends AbstractC6175A implements InterfaceC6212w, InterfaceC6773e {

    /* JADX INFO: renamed from: d */
    public static final a f58124d = new a(null);

    /* JADX INFO: renamed from: b */
    private final AbstractC6183d0 f58125b;

    /* JADX INFO: renamed from: c */
    private final boolean f58126c;

    /* JADX INFO: renamed from: qf.y$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean a(M0 m02) {
            m02.N0();
            return (m02.N0().p() instanceof ye.m0) || (m02 instanceof C6319i);
        }

        public static /* synthetic */ C6214y c(a aVar, M0 m02, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            return aVar.b(m02, z10, z11);
        }

        private final boolean d(M0 m02, boolean z10) {
            if (!a(m02)) {
                return false;
            }
            InterfaceC7230h interfaceC7230hP = m02.N0().p();
            Be.U u10 = interfaceC7230hP instanceof Be.U ? (Be.U) interfaceC7230hP : null;
            if (u10 == null || u10.T0()) {
                return (z10 && (m02.N0().p() instanceof ye.m0)) ? J0.l(m02) : !rf.r.f58799a.a(m02);
            }
            return true;
        }

        public final C6214y b(M0 type, boolean z10, boolean z11) {
            AbstractC5504s.h(type, "type");
            if (type instanceof C6214y) {
                return (C6214y) type;
            }
            if (!z11 && !d(type, z10)) {
                return null;
            }
            if (type instanceof I) {
                I i10 = (I) type;
                AbstractC5504s.c(i10.V0().N0(), i10.W0().N0());
            }
            return new C6214y(L.c(type).R0(false), z10, null);
        }

        private a() {
        }
    }

    public /* synthetic */ C6214y(AbstractC6183d0 abstractC6183d0, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC6183d0, z10);
    }

    @Override // qf.InterfaceC6212w
    public boolean F0() {
        W0().N0();
        return W0().N0().p() instanceof ye.m0;
    }

    @Override // qf.AbstractC6175A, qf.S
    public boolean O0() {
        return false;
    }

    @Override // qf.InterfaceC6212w
    public S T(S replacement) {
        AbstractC5504s.h(replacement, "replacement");
        return AbstractC6191h0.e(replacement.Q0(), this.f58126c);
    }

    @Override // qf.M0
    /* JADX INFO: renamed from: U0 */
    public AbstractC6183d0 R0(boolean z10) {
        return z10 ? W0().R0(z10) : this;
    }

    @Override // qf.M0
    /* JADX INFO: renamed from: V0 */
    public AbstractC6183d0 T0(r0 newAttributes) {
        AbstractC5504s.h(newAttributes, "newAttributes");
        return new C6214y(W0().T0(newAttributes), this.f58126c);
    }

    @Override // qf.AbstractC6175A
    protected AbstractC6183d0 W0() {
        return this.f58125b;
    }

    public final AbstractC6183d0 Z0() {
        return this.f58125b;
    }

    @Override // qf.AbstractC6175A
    /* JADX INFO: renamed from: a1 */
    public C6214y Y0(AbstractC6183d0 delegate) {
        AbstractC5504s.h(delegate, "delegate");
        return new C6214y(delegate, this.f58126c);
    }

    @Override // qf.AbstractC6183d0
    public String toString() {
        return W0() + " & Any";
    }

    private C6214y(AbstractC6183d0 abstractC6183d0, boolean z10) {
        this.f58125b = abstractC6183d0;
        this.f58126c = z10;
    }
}
