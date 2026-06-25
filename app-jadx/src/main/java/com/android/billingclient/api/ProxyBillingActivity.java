package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.C3160e;
import com.google.android.gms.internal.play_billing.R2;
import com.google.android.gms.internal.play_billing.Y2;
import com.revenuecat.purchases.google.history.BillingConstants;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class ProxyBillingActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ResultReceiver f35298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f35299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f35301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f35302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f35303f;

    private R2 a(int i10) {
        return i10 != -1 ? i10 != 0 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? R2.NULL_DATA_WITH_OTHER_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT : R2.NULL_DATA_WITH_ON_CREATE_RUNTIME_EXCEPTION_RESULT_CODE : R2.NULL_DATA_WITH_PLAY_CANCELED_WITHOUT_COMPLETE_ACTION_RESULT_CODE : R2.NULL_DATA_WITH_PLAY_CANCELED_RESULT_CODE : R2.NULL_DATA_WITH_CANCELLED_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT : R2.NULL_DATA_WITH_OK_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
    }

    private Intent b(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    private Intent c(R2 r22, long j10) {
        Intent intentD = d();
        intentD.putExtra(BillingConstants.RESPONSE_CODE, 6);
        intentD.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        C3160e.a aVarD = C3160e.d();
        aVarD.d(6);
        aVarD.b("An internal error occurred.");
        C3160e c3160eA = aVarD.a();
        int i10 = U.f35320a;
        intentD.putExtra("FAILURE_LOGGING_PAYLOAD", U.b(r22, 2, c3160eA, null, Y2.BROADCAST_ACTION_UNSPECIFIED).b());
        intentD.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentD.putExtra("billingClientTransactionId", j10);
        intentD.putExtra("wasServiceAutoReconnected", this.f35303f);
        return intentD;
    }

    private Intent d() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dd  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            com.google.android.gms.internal.play_billing.V.l("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f35299b = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f35298a = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f35300c = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f35301d = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.f35302e = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.f35303f = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.V.l("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f35301d = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f35300c = true;
                this.f35301d = 110;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f35298a = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f35301d = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.f35302e = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.f35303f = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.f35299b = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f35301d, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e10) {
            com.google.android.gms.internal.play_billing.V.n("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e10);
            ResultReceiver resultReceiver = this.f35298a;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                Intent intentC = c(R2.INTENT_SENDER_EXCEPTION, this.f35302e);
                if (this.f35300c) {
                    intentC.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentC);
            }
            this.f35299b = false;
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f35299b) {
            Intent intentD = d();
            intentD.putExtra(BillingConstants.RESPONSE_CODE, 1);
            intentD.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            if (this.f35300c) {
                intentD.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i10 = this.f35301d;
            if (i10 == 110 || i10 == 100) {
                intentD.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentD.putExtra("billingClientTransactionId", this.f35302e);
            }
            sendBroadcast(intentD);
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f35298a;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f35299b);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f35300c);
        bundle.putInt("activity_code", this.f35301d);
        bundle.putLong("billingClientTransactionId", this.f35302e);
        bundle.putBoolean("wasServiceAutoReconnected", this.f35303f);
    }
}
