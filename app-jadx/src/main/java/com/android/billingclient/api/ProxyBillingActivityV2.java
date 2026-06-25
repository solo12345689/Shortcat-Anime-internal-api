package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.AbstractActivityC2640j;
import com.google.android.gms.internal.play_billing.R2;
import g.AbstractC4814d;
import g.C4811a;
import g.C4818h;
import g.InterfaceC4812b;
import h.C4891d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class ProxyBillingActivityV2 extends AbstractActivityC2640j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AbstractC4814d f35304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AbstractC4814d f35305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AbstractC4814d f35306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ResultReceiver f35307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ResultReceiver f35308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ResultReceiver f35309f;

    @Override // androidx.activity.AbstractActivityC2640j, androidx.core.app.i, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f35304a = registerForActivityResult(new C4891d(), new InterfaceC4812b() { // from class: com.android.billingclient.api.a0
            @Override // g.InterfaceC4812b
            public final void onActivityResult(Object obj) {
                this.f35364a.x((C4811a) obj);
            }
        });
        this.f35305b = registerForActivityResult(new C4891d(), new InterfaceC4812b() { // from class: com.android.billingclient.api.b0
            @Override // g.InterfaceC4812b
            public final void onActivityResult(Object obj) {
                this.f35401a.y((C4811a) obj);
            }
        });
        this.f35306c = registerForActivityResult(new C4891d(), new InterfaceC4812b() { // from class: com.android.billingclient.api.c0
            @Override // g.InterfaceC4812b
            public final void onActivityResult(Object obj) {
                this.f35403a.z((C4811a) obj);
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f35307d = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.f35308e = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.f35309f = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
                return;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.V.l("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f35307d = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.f35304a.a(new C4818h.a(pendingIntent).a());
        } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f35308e = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.f35305b.a(new C4818h.a(pendingIntent2).a());
        } else if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.f35309f = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            this.f35306c.a(new C4818h.a(pendingIntent3).a());
        }
    }

    @Override // androidx.activity.AbstractActivityC2640j, androidx.core.app.i, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f35307d;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f35308e;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.f35309f;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
    }

    final void x(C4811a c4811a) {
        Intent intentA = c4811a.a();
        int iC = com.google.android.gms.internal.play_billing.V.g(intentA, "ProxyBillingActivityV2").c();
        ResultReceiver resultReceiver = this.f35307d;
        if (resultReceiver != null) {
            resultReceiver.send(iC, intentA == null ? null : intentA.getExtras());
        }
        if (c4811a.b() != -1 || iC != 0) {
            com.google.android.gms.internal.play_billing.V.m("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + c4811a.b() + " and billing's responseCode: " + iC);
        }
        finish();
    }

    final void y(C4811a c4811a) {
        Intent intentA = c4811a.a();
        int iC = com.google.android.gms.internal.play_billing.V.g(intentA, "ProxyBillingActivityV2").c();
        ResultReceiver resultReceiver = this.f35308e;
        if (resultReceiver != null) {
            resultReceiver.send(iC, intentA == null ? null : intentA.getExtras());
        }
        if (c4811a.b() != -1 || iC != 0) {
            com.google.android.gms.internal.play_billing.V.m("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(c4811a.b()), Integer.valueOf(iC)));
        }
        finish();
    }

    final void z(C4811a c4811a) {
        Intent intentA = c4811a.a();
        Bundle extras = intentA == null ? null : intentA.getExtras();
        if (c4811a.b() != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            com.google.android.gms.internal.play_billing.V.m("ProxyBillingActivityV2", String.format("External offer flow finished with resultCode: %s", Integer.valueOf(c4811a.b())));
            extras.putInt("INTERNAL_LOG_ERROR_REASON", R2.ERROR_IN_ACTIVITY_RESULT.zza());
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("External offer flow finished with error resultCode: %s", Integer.valueOf(c4811a.b())));
        }
        int iC = com.google.android.gms.internal.play_billing.V.g(intentA, "ProxyBillingActivityV2").c();
        ResultReceiver resultReceiver = this.f35309f;
        if (resultReceiver != null) {
            resultReceiver.send(iC, extras);
        } else {
            com.google.android.gms.internal.play_billing.V.m("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (iC != 0) {
            com.google.android.gms.internal.play_billing.V.m("ProxyBillingActivityV2", String.format("External offer flow finished with billing responseCode: %s", Integer.valueOf(iC)));
        }
        finish();
    }
}
