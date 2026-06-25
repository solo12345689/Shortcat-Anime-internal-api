package com.amazon.device.drm.a.d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.amazon.a.a.o.f;
import com.amazon.device.drm.LicensingListener;
import com.amazon.device.drm.LicensingService;
import com.amazon.device.drm.a.d;
import com.amazon.device.drm.model.LicenseResponse;
import com.amazon.device.drm.model.RequestId;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c implements com.amazon.device.drm.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f34974a = "c";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f34975b = "com.amazon.sdktestclient";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f34976c = "com.amazon.sdktestclient.command.CommandBroker";

    @Override // com.amazon.device.drm.a.c
    public void a(RequestId requestId) {
        com.amazon.device.drm.a.e.b.a(f34974a, "sendGetLicenseRequest");
        try {
            Context contextC = d.d().c();
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("requestId", requestId);
            jSONObject.put("packageName", contextC.getPackageName());
            jSONObject.put(com.amazon.a.a.o.b.f34616I, LicensingService.SDK_VERSION);
            bundle.putString("getLicenseInput", jSONObject.toString());
            Intent intentA = a("com.amazon.testclient.drm.getLicense");
            intentA.addFlags(268435456);
            intentA.putExtras(bundle);
            contextC.startService(intentA);
        } catch (JSONException unused) {
            com.amazon.device.drm.a.e.b.b(f34974a, "Error in sendGetUserDataRequest.");
        }
    }

    private Intent a(String str) {
        Intent intent = new Intent(str);
        intent.setComponent(new ComponentName(f34975b, f34976c));
        return intent;
    }

    @Override // com.amazon.device.drm.a.c
    public void a(Context context, Intent intent) {
        com.amazon.device.drm.a.e.b.a(f34974a, "handleResponse");
        intent.setComponent(new ComponentName(f34975b, f34976c));
        try {
            if (intent.getExtras().getString("responseType").equalsIgnoreCase("com.amazon.testclient.drm.getLicense")) {
                a(a(intent));
            }
        } catch (Exception e10) {
            Log.e(f34974a, "Error handling response.", e10);
        }
    }

    private LicenseResponse a(Intent intent) {
        RequestId requestIdFromString;
        LicenseResponse.RequestStatus requestStatusValueOf = LicenseResponse.RequestStatus.UNKNOWN_ERROR;
        try {
            JSONObject jSONObject = new JSONObject(intent.getStringExtra("getLicenseOutput"));
            requestStatusValueOf = LicenseResponse.RequestStatus.valueOf(jSONObject.optString("status"));
            requestIdFromString = RequestId.fromString(jSONObject.optString("requestId"));
        } catch (Exception e10) {
            Log.e(f34974a, "Error parsing getLicense response", e10);
            requestIdFromString = null;
        }
        return new com.amazon.device.drm.a.c.a().a(requestIdFromString).a(requestStatusValueOf).a();
    }

    protected void a(final Object obj) {
        f.a(obj, "response");
        Context contextC = d.d().c();
        final LicensingListener licensingListenerB = d.d().b();
        if (contextC != null && licensingListenerB != null) {
            new Handler(contextC.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.drm.a.d.c.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Object obj2 = obj;
                        if (obj2 instanceof LicenseResponse) {
                            licensingListenerB.onLicenseCommandResponse((LicenseResponse) obj2);
                            return;
                        }
                        com.amazon.device.drm.a.e.b.b(c.f34974a, "Unknown response type:" + obj.getClass().getName());
                    } catch (Exception e10) {
                        com.amazon.device.drm.a.e.b.b(c.f34974a, "Error in sendResponse: " + e10);
                    }
                }
            });
            return;
        }
        com.amazon.device.drm.a.e.b.a(f34974a, "LicensingListener is not set. Dropping response: " + obj);
    }
}
