package K;

import I0.InterfaceC1690p;
import U0.T0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6224f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T0 f9886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC1690p f9887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC1690p f9888c;

    public Z(T0 t02, InterfaceC1690p interfaceC1690p, InterfaceC1690p interfaceC1690p2) {
        this.f9886a = t02;
        this.f9887b = interfaceC1690p;
        this.f9888c = interfaceC1690p2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long a(long r6) {
        /*
            r5 = this;
            I0.p r0 = r5.f9887b
            if (r0 == 0) goto L1e
            boolean r1 = r0.b()
            if (r1 == 0) goto L16
            I0.p r1 = r5.f9888c
            r2 = 0
            if (r1 == 0) goto L1c
            r3 = 0
            r4 = 2
            r0.h r2 = I0.InterfaceC1690p.V(r1, r0, r3, r4, r2)
            goto L1c
        L16:
            r0.h$a r0 = r0.C6226h.f58334e
            r0.h r2 = r0.a()
        L1c:
            if (r2 != 0) goto L24
        L1e:
            r0.h$a r0 = r0.C6226h.f58334e
            r0.h r2 = r0.a()
        L24:
            long r6 = K.a0.a(r6, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: K.Z.a(long):long");
    }

    public static /* synthetic */ int e(Z z10, long j10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return z10.d(j10, z11);
    }

    public final InterfaceC1690p b() {
        return this.f9888c;
    }

    public final InterfaceC1690p c() {
        return this.f9887b;
    }

    public final int d(long j10, boolean z10) {
        if (z10) {
            j10 = a(j10);
        }
        return this.f9886a.x(j(j10));
    }

    public final T0 f() {
        return this.f9886a;
    }

    public final boolean g(long j10) {
        long j11 = j(a(j10));
        int iR = this.f9886a.r(C6224f.n(j11));
        return C6224f.m(j11) >= this.f9886a.s(iR) && C6224f.m(j11) <= this.f9886a.t(iR);
    }

    public final void h(InterfaceC1690p interfaceC1690p) {
        this.f9888c = interfaceC1690p;
    }

    public final void i(InterfaceC1690p interfaceC1690p) {
        this.f9887b = interfaceC1690p;
    }

    public final long j(long j10) {
        InterfaceC1690p interfaceC1690p;
        InterfaceC1690p interfaceC1690p2 = this.f9887b;
        if (interfaceC1690p2 == null) {
            return j10;
        }
        if (!interfaceC1690p2.b()) {
            interfaceC1690p2 = null;
        }
        if (interfaceC1690p2 == null || (interfaceC1690p = this.f9888c) == null) {
            return j10;
        }
        InterfaceC1690p interfaceC1690p3 = interfaceC1690p.b() ? interfaceC1690p : null;
        return interfaceC1690p3 == null ? j10 : interfaceC1690p2.y0(interfaceC1690p3, j10);
    }

    public final long k(long j10) {
        InterfaceC1690p interfaceC1690p;
        InterfaceC1690p interfaceC1690p2 = this.f9887b;
        if (interfaceC1690p2 == null) {
            return j10;
        }
        if (!interfaceC1690p2.b()) {
            interfaceC1690p2 = null;
        }
        if (interfaceC1690p2 == null || (interfaceC1690p = this.f9888c) == null) {
            return j10;
        }
        InterfaceC1690p interfaceC1690p3 = interfaceC1690p.b() ? interfaceC1690p : null;
        return interfaceC1690p3 == null ? j10 : interfaceC1690p3.y0(interfaceC1690p2, j10);
    }

    public /* synthetic */ Z(T0 t02, InterfaceC1690p interfaceC1690p, InterfaceC1690p interfaceC1690p2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(t02, (i10 & 2) != 0 ? null : interfaceC1690p, (i10 & 4) != 0 ? null : interfaceC1690p2);
    }
}
