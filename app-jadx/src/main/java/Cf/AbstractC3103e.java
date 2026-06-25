package cf;

import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import pf.C6041f;
import pf.n;
import qf.AbstractC6215z;
import qf.B0;
import qf.D0;
import qf.E0;
import qf.M;
import qf.N0;
import qf.S;
import qf.Y;
import ye.InterfaceC7230h;
import ye.m0;

/* JADX INFO: renamed from: cf.e */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3103e {

    /* JADX INFO: renamed from: cf.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC6215z {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ boolean f33618d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(E0 e02, boolean z10) {
            super(e02);
            this.f33618d = z10;
        }

        @Override // qf.E0
        public boolean b() {
            return this.f33618d;
        }

        @Override // qf.AbstractC6215z, qf.E0
        public B0 e(S key) {
            AbstractC5504s.h(key, "key");
            B0 b0E = super.e(key);
            if (b0E == null) {
                return null;
            }
            InterfaceC7230h interfaceC7230hP = key.N0().p();
            return AbstractC3103e.c(b0E, interfaceC7230hP instanceof m0 ? (m0) interfaceC7230hP : null);
        }
    }

    public static final B0 c(B0 b02, m0 m0Var) {
        if (m0Var == null || b02.b() == N0.f57999e) {
            return b02;
        }
        if (m0Var.m() != b02.b()) {
            return new D0(e(b02));
        }
        if (!b02.a()) {
            return new D0(b02.getType());
        }
        n NO_LOCKS = C6041f.f56045e;
        AbstractC5504s.g(NO_LOCKS, "NO_LOCKS");
        return new D0(new Y(NO_LOCKS, new C3102d(b02)));
    }

    public static final S d(B0 b02) {
        S type = b02.getType();
        AbstractC5504s.g(type, "getType(...)");
        return type;
    }

    public static final S e(B0 typeProjection) {
        AbstractC5504s.h(typeProjection, "typeProjection");
        return new C3099a(typeProjection, null, false, null, 14, null);
    }

    public static final boolean f(S s10) {
        AbstractC5504s.h(s10, "<this>");
        return s10.N0() instanceof InterfaceC3100b;
    }

    public static final E0 g(E0 e02, boolean z10) {
        AbstractC5504s.h(e02, "<this>");
        if (!(e02 instanceof M)) {
            return new a(e02, z10);
        }
        M m10 = (M) e02;
        m0[] m0VarArrJ = m10.j();
        List<Pair> listN1 = AbstractC2273n.n1(m10.i(), m10.j());
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listN1, 10));
        for (Pair pair : listN1) {
            arrayList.add(c((B0) pair.c(), (m0) pair.d()));
        }
        return new M(m0VarArrJ, (B0[]) arrayList.toArray(new B0[0]), z10);
    }

    public static /* synthetic */ E0 h(E0 e02, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return g(e02, z10);
    }
}
