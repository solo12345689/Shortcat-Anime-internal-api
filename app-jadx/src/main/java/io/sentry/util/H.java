package io.sentry.util;

import io.sentry.C5186d;
import io.sentry.C5310x1;
import io.sentry.C5322z3;
import io.sentry.E1;
import io.sentry.G1;
import io.sentry.InterfaceC5114a0;
import io.sentry.N0;
import io.sentry.Y;
import io.sentry.h4;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class H {
    public static /* synthetic */ void b(Y y10, C5322z3 c5322z3, C5310x1 c5310x1) {
        C5186d c5186dA = c5310x1.a();
        if (c5186dA.q()) {
            c5186dA.H(y10, c5322z3);
            c5186dA.b();
        }
    }

    public static C5186d d(C5186d c5186d, h4 h4Var) {
        return e(c5186d, h4Var == null ? null : h4Var.e(), h4Var == null ? null : h4Var.d(), h4Var != null ? h4Var.c() : null);
    }

    public static C5186d e(C5186d c5186d, Boolean bool, Double d10, Double d11) {
        if (c5186d == null) {
            c5186d = new C5186d(N0.e());
        }
        if (c5186d.i() == null) {
            Double dJ = c5186d.j();
            if (dJ != null) {
                d10 = dJ;
            }
            c5186d.B(A.b(d11, d10, bool));
        }
        if (c5186d.q() && c5186d.r()) {
            c5186d.b();
        }
        return c5186d;
    }

    public static boolean f(List list, String str) {
        if (str != null && list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((io.sentry.F) it.next()).a().equalsIgnoreCase(str)) {
                    return true;
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((io.sentry.F) it2.next()).b(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static C5310x1 g(final Y y10, final C5322z3 c5322z3) {
        return y10.N(new E1.a() { // from class: io.sentry.util.E
            @Override // io.sentry.E1.a
            public final void a(C5310x1 c5310x1) {
                H.b(y10, c5322z3, c5310x1);
            }
        });
    }

    public static void h(InterfaceC5114a0 interfaceC5114a0) {
        interfaceC5114a0.r(new G1() { // from class: io.sentry.util.F
            @Override // io.sentry.G1
            public final void a(Y y10) {
                y10.N(new E1.a() { // from class: io.sentry.util.G
                    @Override // io.sentry.E1.a
                    public final void a(C5310x1 c5310x1) {
                        y10.R(new C5310x1());
                    }
                });
            }
        });
    }
}
