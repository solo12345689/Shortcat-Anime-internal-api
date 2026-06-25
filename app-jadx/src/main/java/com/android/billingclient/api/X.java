package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.C3;
import com.google.android.gms.internal.play_billing.C3657d3;
import com.google.android.gms.internal.play_billing.C3667f3;
import com.google.android.gms.internal.play_billing.C3712o3;
import com.google.android.gms.internal.play_billing.C3741u3;
import com.google.android.gms.internal.play_billing.G3;
import com.google.android.gms.internal.play_billing.H2;
import com.google.android.gms.internal.play_billing.J2;
import com.google.android.gms.internal.play_billing.L2;
import com.google.android.gms.internal.play_billing.O2;
import com.google.android.gms.internal.play_billing.W2;
import com.google.android.gms.internal.play_billing.w3;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class X implements V {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C3667f3 f35354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Y f35355c;

    X(Context context, C3667f3 c3667f3) {
        this.f35355c = new Y(context);
        this.f35354b = c3667f3;
    }

    private final void l(J2 j22, C3667f3 c3667f3) {
        if (j22 == null) {
            return;
        }
        try {
            C3741u3 c3741u3I = w3.I();
            c3741u3I.r(c3667f3);
            c3741u3I.n(j22);
            this.f35355c.a((w3) c3741u3I.i());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingLogger", "Unable to log.", th2);
        }
    }

    private final void m(O2 o22, C3667f3 c3667f3) {
        if (o22 == null) {
            return;
        }
        try {
            C3741u3 c3741u3I = w3.I();
            c3741u3I.r(c3667f3);
            c3741u3I.p(o22);
            this.f35355c.a((w3) c3741u3I.i());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.V
    public final void a(J2 j22, int i10, long j10, boolean z10) {
        C3667f3 c3667f3;
        try {
            C3657d3 c3657d3 = (C3657d3) this.f35354b.p();
            c3657d3.q(i10);
            this.f35354b = (C3667f3) c3657d3.i();
            H2 h22 = (H2) j22.p();
            C3712o3 c3712o3 = (C3712o3) j22.D().p();
            c3712o3.n(z10);
            h22.r(c3712o3);
            J2 j23 = (J2) h22.i();
            if (j10 == 0) {
                c3667f3 = this.f35354b;
            } else {
                C3657d3 c3657d32 = (C3657d3) this.f35354b.p();
                c3657d32.s(j10);
                c3667f3 = (C3667f3) c3657d32.i();
            }
            l(j23, c3667f3);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.V
    public final void b(J2 j22) {
        try {
            l(j22, this.f35354b);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.V
    public final void c(J2 j22, long j10, boolean z10) {
        C3667f3 c3667f3;
        try {
            H2 h22 = (H2) j22.p();
            C3712o3 c3712o3 = (C3712o3) j22.D().p();
            c3712o3.n(z10);
            h22.r(c3712o3);
            J2 j23 = (J2) h22.i();
            if (j10 == 0) {
                c3667f3 = this.f35354b;
            } else {
                C3657d3 c3657d3 = (C3657d3) this.f35354b.p();
                c3657d3.s(j10);
                c3667f3 = (C3667f3) c3657d3.i();
            }
            l(j23, c3667f3);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.V
    public final void d(J2 j22, int i10, long j10) {
        try {
            C3657d3 c3657d3 = (C3657d3) this.f35354b.p();
            c3657d3.q(i10);
            C3667f3 c3667f3 = (C3667f3) c3657d3.i();
            this.f35354b = c3667f3;
            if (j10 != 0) {
                C3657d3 c3657d32 = (C3657d3) c3667f3.p();
                c3657d32.s(j10);
                c3667f3 = (C3667f3) c3657d32.i();
            }
            l(j22, c3667f3);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.V
    public final void e(W2 w22) {
        try {
            C3741u3 c3741u3I = w3.I();
            c3741u3I.r(this.f35354b);
            c3741u3I.q(w22);
            this.f35355c.a((w3) c3741u3I.i());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.V
    public final void f(O2 o22, int i10) {
        try {
            C3657d3 c3657d3 = (C3657d3) this.f35354b.p();
            c3657d3.q(i10);
            this.f35354b = (C3667f3) c3657d3.i();
            i(o22);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.V
    public final void g(C3 c32) {
        try {
            Y y10 = this.f35355c;
            C3741u3 c3741u3I = w3.I();
            c3741u3I.r(this.f35354b);
            c3741u3I.s(c32);
            y10.a((w3) c3741u3I.i());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.V
    public final void h(O2 o22, long j10, boolean z10) {
        C3667f3 c3667f3;
        try {
            L2 l22 = (L2) o22.p();
            C3712o3 c3712o3 = (C3712o3) o22.C().p();
            c3712o3.n(z10);
            l22.q(c3712o3);
            O2 o23 = (O2) l22.i();
            if (j10 == 0) {
                c3667f3 = this.f35354b;
            } else {
                C3657d3 c3657d3 = (C3657d3) this.f35354b.p();
                c3657d3.s(j10);
                c3667f3 = (C3667f3) c3657d3.i();
            }
            m(o23, c3667f3);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.V
    public final void i(O2 o22) {
        try {
            m(o22, this.f35354b);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.V
    public final void j(G3 g32) {
        if (g32 == null) {
            return;
        }
        try {
            C3741u3 c3741u3I = w3.I();
            c3741u3I.r(this.f35354b);
            c3741u3I.t(g32);
            this.f35355c.a((w3) c3741u3I.i());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.V
    public final void k(J2 j22, int i10) {
        try {
            C3657d3 c3657d3 = (C3657d3) this.f35354b.p();
            c3657d3.q(i10);
            this.f35354b = (C3667f3) c3657d3.i();
            b(j22);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingLogger", "Unable to log.", th2);
        }
    }
}
