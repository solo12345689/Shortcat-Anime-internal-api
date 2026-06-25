package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.AbstractBinderC3668g;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class G extends AbstractBinderC3668g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WeakReference f35272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ResultReceiver f35273b;

    /* synthetic */ G(WeakReference weakReference, ResultReceiver resultReceiver, N4.t tVar) {
        this.f35272a = weakReference;
        this.f35273b = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3673h
    public final void g(Bundle bundle) {
        ResultReceiver resultReceiver = this.f35273b;
        if (resultReceiver == null) {
            com.google.android.gms.internal.play_billing.V.m("BillingClient", "Unable to send result for in-app messaging");
            return;
        }
        if (bundle == null) {
            resultReceiver.send(0, null);
            return;
        }
        Activity activity = (Activity) this.f35272a.get();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
        if (activity == null || pendingIntent == null) {
            resultReceiver.send(0, null);
            com.google.android.gms.internal.play_billing.V.m("BillingClient", "Unable to launch intent for in-app messaging");
            return;
        }
        try {
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
            intent.putExtra("in_app_message_result_receiver", resultReceiver);
            intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
            activity.startActivity(intent);
        } catch (CancellationException e10) {
            this.f35273b.send(0, null);
            com.google.android.gms.internal.play_billing.V.n("BillingClient", "Exception caught while launching intent for in-app messaging.", e10);
        }
    }
}
