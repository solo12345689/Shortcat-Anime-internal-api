package com.google.firebase.iid;

import N8.AbstractC1973b;
import N8.C1972a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.C3976n;
import com.google.firebase.messaging.L;
import java.util.concurrent.ExecutionException;
import n9.l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC1973b {
    private static Intent f(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // N8.AbstractC1973b
    protected int b(Context context, C1972a c1972a) {
        try {
            return ((Integer) l.a(new C3976n(context).g(c1972a.c()))).intValue();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e10);
            return 500;
        }
    }

    @Override // N8.AbstractC1973b
    protected void c(Context context, Bundle bundle) {
        Intent intentF = f(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (L.E(intentF)) {
            L.v(intentF);
        }
    }
}
