package R8;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Uri f15291a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    static Intent a(Context context, p0 p0Var) throws c0 {
        Bundle bundleCall;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        String strA = p0Var.a();
        if (strA == null) {
            return new Intent().setComponent(p0Var.c());
        }
        Intent intent = null;
        if (p0Var.d()) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", strA);
            try {
                contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f15291a);
            } catch (RemoteException e10) {
                e = e10;
                Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundleCall = null;
            } catch (IllegalArgumentException e11) {
                e = e11;
                Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundleCall = null;
            }
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                throw new RemoteException("Failed to acquire ContentProviderClient");
            }
            try {
                bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle);
                contentProviderClientAcquireUnstableContentProviderClient.release();
                if (bundleCall != null) {
                    Intent intent2 = (Intent) bundleCall.getParcelable("serviceResponseIntentKey");
                    if (intent2 != null) {
                        intent = intent2;
                    } else {
                        PendingIntent pendingIntent = (PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey");
                        if (pendingIntent != null) {
                            StringBuilder sb2 = new StringBuilder(strA.length() + 72);
                            sb2.append("Dynamic lookup for intent failed for action ");
                            sb2.append(strA);
                            sb2.append(" but has possible resolution");
                            Log.w("ServiceBindIntentUtils", sb2.toString());
                            throw new c0(new ConnectionResult(25, pendingIntent));
                        }
                    }
                }
                if (intent == null) {
                    Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(strA));
                }
            } catch (Throwable th2) {
                contentProviderClientAcquireUnstableContentProviderClient.release();
                throw th2;
            }
        }
        return intent == null ? new Intent(strA).setPackage(p0Var.b()) : intent;
    }
}
