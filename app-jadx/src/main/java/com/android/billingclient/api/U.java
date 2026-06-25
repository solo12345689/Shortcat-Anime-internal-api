package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.H2;
import com.google.android.gms.internal.play_billing.J2;
import com.google.android.gms.internal.play_billing.L2;
import com.google.android.gms.internal.play_billing.O2;
import com.google.android.gms.internal.play_billing.P2;
import com.google.android.gms.internal.play_billing.R2;
import com.google.android.gms.internal.play_billing.T2;
import com.google.android.gms.internal.play_billing.Y2;
import com.revenuecat.purchases.common.Constants;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class U {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f35320a = 0;

    static {
        int i10 = V.f35321a;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + com.google.android.gms.internal.play_billing.D.b(exc.getMessage());
            int i10 = com.google.android.gms.internal.play_billing.V.f40412a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingLogger", "Unable to get truncated exception info", th2);
            return null;
        }
    }

    public static J2 b(R2 r22, int i10, C3160e c3160e, String str, Y2 y22) {
        try {
            P2 p2H = T2.H();
            p2H.s(c3160e.c());
            p2H.p(c3160e.a());
            if (c3160e.b() != 0) {
                p2H.q(c3160e.b());
            }
            if (r22 != null) {
                p2H.r(r22);
            }
            if (str != null) {
                p2H.n(str);
            }
            H2 h2K = J2.K();
            h2K.p(p2H);
            h2K.t(i10);
            if (!y22.equals(Y2.BROADCAST_ACTION_UNSPECIFIED)) {
                h2K.n(y22);
            }
            return (J2) h2K.i();
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingLogger", "Unable to create logging payload", th2);
            return null;
        }
    }

    public static O2 c(int i10, Y2 y22) {
        try {
            L2 l2I = O2.I();
            l2I.s(i10);
            if (!y22.equals(Y2.BROADCAST_ACTION_UNSPECIFIED)) {
                l2I.n(y22);
            }
            return (O2) l2I.i();
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.V.n("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }
}
