package com.google.android.gms.measurement.internal;

import com.revenuecat.purchases.google.history.BillingConstants;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class H2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final X2 f40788a;

    H2(q6 q6Var) {
        this.f40788a = q6Var.g0();
    }

    final boolean a() {
        try {
            X2 x22 = this.f40788a;
            X8.d dVarA = X8.e.a(x22.d());
            if (dVarA != null) {
                return dVarA.e(BillingConstants.VENDING_PACKAGE, 128).versionCode >= 80837300;
            }
            x22.a().w().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            this.f40788a.a().w().b("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
