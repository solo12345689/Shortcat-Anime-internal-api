package Q;

import K.Z;
import U0.W0;
import Ud.AbstractC2279u;
import a1.C2524Q;
import a1.C2527U;
import a1.C2533a;
import a1.InterfaceC2517J;
import a1.InterfaceC2541i;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class E extends AbstractC2042b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C2527U f13998j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Z f13999k;

    public E(C2527U c2527u, InterfaceC2517J interfaceC2517J, Z z10, I i10) {
        super(c2527u.i(), c2527u.k(), z10 != null ? z10.f() : null, interfaceC2517J, i10, null);
        this.f13998j = c2527u;
        this.f13999k = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int a0(K.Z r6, int r7) {
        /*
            r5 = this;
            I0.p r0 = r6.c()
            if (r0 == 0) goto L15
            I0.p r1 = r6.b()
            r2 = 0
            if (r1 == 0) goto L13
            r3 = 0
            r4 = 2
            r0.h r2 = I0.InterfaceC1690p.V(r1, r0, r3, r4, r2)
        L13:
            if (r2 != 0) goto L1b
        L15:
            r0.h$a r0 = r0.C6226h.f58334e
            r0.h r2 = r0.a()
        L1b:
            a1.J r0 = r5.p()
            a1.U r1 = r5.f13998j
            long r3 = r1.k()
            int r1 = U0.W0.i(r3)
            int r0 = r0.b(r1)
            U0.T0 r1 = r6.f()
            r0.h r0 = r1.e(r0)
            float r1 = r0.i()
            float r0 = r0.l()
            long r2 = r2.k()
            float r2 = r0.C6230l.g(r2)
            float r7 = (float) r7
            float r2 = r2 * r7
            float r0 = r0 + r2
            a1.J r7 = r5.p()
            U0.T0 r6 = r6.f()
            long r0 = r0.AbstractC6225g.a(r1, r0)
            int r6 = r6.x(r0)
            int r6 = r7.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.E.a0(K.Z, int):int");
    }

    public final List Y(Function1 function1) {
        if (!W0.h(u())) {
            return AbstractC2279u.p(new C2533a("", 0), new C2524Q(W0.l(u()), W0.l(u())));
        }
        InterfaceC2541i interfaceC2541i = (InterfaceC2541i) function1.invoke(this);
        if (interfaceC2541i != null) {
            return AbstractC2279u.e(interfaceC2541i);
        }
        return null;
    }

    public final C2527U Z() {
        return C2527U.g(this.f13998j, e(), u(), null, 4, null);
    }

    public final E b0() {
        Z z10;
        if (w().length() > 0 && (z10 = this.f13999k) != null) {
            T(a0(z10, 1));
        }
        AbstractC5504s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final E c0() {
        Z z10;
        if (w().length() > 0 && (z10 = this.f13999k) != null) {
            T(a0(z10, -1));
        }
        AbstractC5504s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }
}
