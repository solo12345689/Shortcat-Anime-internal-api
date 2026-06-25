package com.android.billingclient.api;

import N4.InterfaceC1965e;
import android.os.Bundle;
import com.android.billingclient.api.C3160e;
import com.google.android.gms.internal.play_billing.AbstractBinderC3643b;
import com.google.android.gms.internal.play_billing.R2;
import com.google.android.gms.internal.play_billing.Y2;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class F extends AbstractBinderC3643b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final InterfaceC1965e f35269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final V f35270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f35271c;

    /* synthetic */ F(InterfaceC1965e interfaceC1965e, V v10, int i10, N4.t tVar) {
        this.f35269a = interfaceC1965e;
        this.f35270b = v10;
        this.f35271c = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3648c
    public final void g(Bundle bundle) {
        if (bundle == null) {
            V v10 = this.f35270b;
            R2 r22 = R2.NULL_BUNDLE_FROM_GET_BILLING_CONFIG_SERVICE_CALL;
            C3160e c3160e = W.f35335h;
            int i10 = U.f35320a;
            v10.k(U.b(r22, 13, c3160e, null, Y2.BROADCAST_ACTION_UNSPECIFIED), this.f35271c);
            this.f35269a.a(c3160e, null);
            return;
        }
        int iB = com.google.android.gms.internal.play_billing.V.b(bundle, "BillingClient");
        String strI = com.google.android.gms.internal.play_billing.V.i(bundle, "BillingClient");
        C3160e.a aVarD = C3160e.d();
        aVarD.d(iB);
        aVarD.b(strI);
        if (iB != 0) {
            com.google.android.gms.internal.play_billing.V.m("BillingClient", "getBillingConfig() failed. Response code: " + iB);
            C3160e c3160eA = aVarD.a();
            V v11 = this.f35270b;
            R2 r23 = R2.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
            int i11 = U.f35320a;
            v11.k(U.b(r23, 13, c3160eA, null, Y2.BROADCAST_ACTION_UNSPECIFIED), this.f35271c);
            this.f35269a.a(c3160eA, null);
            return;
        }
        if (!bundle.containsKey("BILLING_CONFIG")) {
            com.google.android.gms.internal.play_billing.V.m("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
            aVarD.d(6);
            C3160e c3160eA2 = aVarD.a();
            V v12 = this.f35270b;
            R2 r24 = R2.MISSING_BILLING_CONFIG_IN_GET_BILLING_CONFIG_RESPONSE;
            int i12 = U.f35320a;
            v12.k(U.b(r24, 13, c3160eA2, null, Y2.BROADCAST_ACTION_UNSPECIFIED), this.f35271c);
            this.f35269a.a(c3160eA2, null);
            return;
        }
        try {
            this.f35269a.a(aVarD.a(), new C3158c(bundle.getString("BILLING_CONFIG")));
        } catch (JSONException e10) {
            com.google.android.gms.internal.play_billing.V.n("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e10);
            V v13 = this.f35270b;
            R2 r25 = R2.ERROR_DECODING_BILLING_CONFIG_DATA;
            C3160e c3160e2 = W.f35335h;
            int i13 = U.f35320a;
            v13.k(U.b(r25, 13, c3160e2, null, Y2.BROADCAST_ACTION_UNSPECIFIED), this.f35271c);
            this.f35269a.a(c3160e2, null);
        }
    }
}
