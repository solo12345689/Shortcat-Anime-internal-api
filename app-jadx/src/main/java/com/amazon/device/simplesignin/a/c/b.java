package com.amazon.device.simplesignin.a.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.amazon.device.simplesignin.ISimpleSignInResponseHandler;
import com.amazon.device.simplesignin.SimpleSignInService;
import com.amazon.device.simplesignin.a.c;
import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.request.LinkUserAccountRequest;
import com.amazon.device.simplesignin.model.request.SSIEventRequest;
import com.amazon.device.simplesignin.model.response.GetUserAndLinksResponse;
import com.amazon.device.simplesignin.model.response.LinkUserAccountResponse;
import com.amazon.device.simplesignin.model.response.RecordMetricsEventResponse;
import com.amazon.device.simplesignin.model.response.ShowLoginSelectionResponse;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b implements com.amazon.device.simplesignin.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f35250a = "b";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f35251b = "com.amazon.sdktestclient";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f35252c = "com.amazon.sdktestclient.command.CommandBroker";

    private RecordMetricsEventResponse b(Intent intent) {
        RecordMetricsEventResponse recordMetricsEventResponse = new RecordMetricsEventResponse();
        try {
            JSONObject jSONObject = new JSONObject(intent.getStringExtra("recordMetricsEventOutput"));
            recordMetricsEventResponse.setRequestId(new RequestId(jSONObject.getString("requestId")));
            RequestStatus requestStatusValueOf = RequestStatus.valueOf(jSONObject.getString("status"));
            recordMetricsEventResponse.setRequestStatus(requestStatusValueOf);
            RequestStatus.SUCCESSFUL.equals(requestStatusValueOf);
            return recordMetricsEventResponse;
        } catch (JSONException e10) {
            Log.e(f35250a, "Exception while parsing RecordMetricsEvent response", e10);
            return recordMetricsEventResponse;
        }
    }

    private LinkUserAccountResponse c(Intent intent) {
        LinkUserAccountResponse linkUserAccountResponse = new LinkUserAccountResponse();
        try {
            String stringExtra = intent.getStringExtra("linkUserAccountOutput");
            Log.i(f35250a, "SimpleSignInService : linkUserAccountOutput " + stringExtra);
            JSONObject jSONObject = new JSONObject(stringExtra);
            linkUserAccountResponse.setRequestId(new RequestId(jSONObject.getString("requestId")));
            RequestStatus requestStatusValueOf = RequestStatus.valueOf(jSONObject.getString("status"));
            linkUserAccountResponse.setRequestStatus(requestStatusValueOf);
            if (!RequestStatus.SUCCESSFUL.equals(requestStatusValueOf)) {
                return linkUserAccountResponse;
            }
            String string = jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f35179m);
            if (!LinkUserAccountResponse.SuccessCode.ConsentDenied.equals(LinkUserAccountResponse.SuccessCode.valueOf(string))) {
                linkUserAccountResponse.setLinkId(jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f35177k));
            }
            linkUserAccountResponse.setSuccessCode(LinkUserAccountResponse.SuccessCode.valueOf(string));
            return linkUserAccountResponse;
        } catch (JSONException e10) {
            Log.e(f35250a, "Exception while parsing LinkUserAccount response", e10);
            return linkUserAccountResponse;
        }
    }

    private ShowLoginSelectionResponse d(Intent intent) {
        ShowLoginSelectionResponse showLoginSelectionResponse = new ShowLoginSelectionResponse();
        try {
            String stringExtra = intent.getStringExtra("showLoginSelectionOutput");
            Log.i(f35250a, "SimpleSignInService : loginSelectionOutput " + stringExtra);
            JSONObject jSONObject = new JSONObject(stringExtra);
            showLoginSelectionResponse.setRequestId(new RequestId(jSONObject.getString("requestId")));
            RequestStatus requestStatusValueOf = RequestStatus.valueOf(jSONObject.getString("status"));
            showLoginSelectionResponse.setRequestStatus(requestStatusValueOf);
            if (RequestStatus.SUCCESSFUL.equals(requestStatusValueOf)) {
                String string = jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f35183q);
                ShowLoginSelectionResponse.UserSelection userSelection = ShowLoginSelectionResponse.UserSelection.LoginSelected;
                if (!userSelection.name().equals(string)) {
                    showLoginSelectionResponse.setUserSelection(ShowLoginSelectionResponse.UserSelection.ManualSignIn);
                    return showLoginSelectionResponse;
                }
                String string2 = jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f35184r);
                if (string2 != null) {
                    showLoginSelectionResponse.setUserSelection(userSelection);
                    showLoginSelectionResponse.setLinkId(string2);
                }
            }
            return showLoginSelectionResponse;
        } catch (JSONException e10) {
            Log.e(f35250a, "Exception while parsing LinkUserAccount response", e10);
            showLoginSelectionResponse.setUserSelection(ShowLoginSelectionResponse.UserSelection.ManualSignIn);
            return showLoginSelectionResponse;
        }
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void a(RequestId requestId, String str) {
        Log.i(f35250a, "Handling getUserAndLinks sandbox request.");
        Context contextC = c.a().c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("requestId", requestId);
            jSONObject.put("packageName", contextC.getPackageName());
            jSONObject.put(com.amazon.a.a.o.b.f34616I, SimpleSignInService.SDK_VERSION);
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f35167a, str);
            Bundle bundle = new Bundle();
            bundle.putString("getUserAndLinksInput", jSONObject.toString());
            Intent intentA = a("com.amazon.testclient.simplesignin.getUserAndLinks");
            intentA.addFlags(268435456);
            intentA.putExtras(bundle);
            contextC.startService(intentA);
        } catch (JSONException unused) {
            Log.e(f35250a, "Error in preparing getUserAndLinksInput.");
        }
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void a(RequestId requestId, LinkUserAccountRequest linkUserAccountRequest) {
        Log.i(f35250a, "Handling linkUserAccount sandbox request.");
        Context contextC = c.a().c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("requestId", requestId);
            jSONObject.put("packageName", contextC.getPackageName());
            jSONObject.put(com.amazon.a.a.o.b.f34616I, SimpleSignInService.SDK_VERSION);
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f35170d, linkUserAccountRequest.getPartnerUserId());
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f35167a, linkUserAccountRequest.getIdentityProviderName());
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f35171e, linkUserAccountRequest.getUserLoginName());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("token", linkUserAccountRequest.getLinkToken().getToken());
            jSONObject2.put(com.amazon.device.simplesignin.a.a.a.f35159E, linkUserAccountRequest.getLinkToken().getSchema());
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f35173g, jSONObject2.toString());
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f35172f, linkUserAccountRequest.getLinkSigningKey());
            Bundle bundle = new Bundle();
            bundle.putString("linkUserAccountInput", jSONObject.toString());
            Intent intentA = a("com.amazon.testclient.simplesignin.linkUserAccount");
            intentA.addFlags(268435456);
            intentA.putExtras(bundle);
            contextC.startService(intentA);
        } catch (JSONException e10) {
            Log.e(f35250a, "Unable to create linkToken json");
            throw new IllegalStateException("Unable to create linkToken json", e10);
        }
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void a(RequestId requestId, Map<String, String> map) {
        Log.i(f35250a, "Handling showLoginSelection sandbox request.");
        Context contextC = c.a().c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("requestId", requestId);
            jSONObject.put("packageName", contextC.getPackageName());
            jSONObject.put(com.amazon.a.a.o.b.f34616I, SimpleSignInService.SDK_VERSION);
            Intent intentA = a("com.amazon.testclient.simplesignin.showLoginSelection");
            intentA.putExtra("showLoginSelectionInput", jSONObject.toString());
            intentA.putExtra(com.amazon.device.simplesignin.a.a.a.f35181o, new HashMap(map));
            intentA.addFlags(268435456);
            contextC.startService(intentA);
        } catch (JSONException e10) {
            Log.e(f35250a, "Unable to create showLoginSelection Input");
            throw new IllegalStateException("Unable to create showLoginSelection input json", e10);
        }
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void a(RequestId requestId, SSIEventRequest sSIEventRequest) {
        Context contextC = c.a().c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f35186t, sSIEventRequest.getEvent().toString());
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f35187u, sSIEventRequest.getEpochTimestamp());
            if (sSIEventRequest.getFailureReason() != null) {
                jSONObject.put(com.amazon.device.simplesignin.a.a.a.f35188v, sSIEventRequest.getFailureReason().toString());
            }
            Intent intentA = a("com.amazon.testclient.simplesignin.recordmetricsevent");
            intentA.addFlags(268435456);
            contextC.startService(intentA);
        } catch (JSONException e10) {
            Log.e(f35250a, "Error in preparing recordMetricEventInput for requestId: " + requestId, e10);
        }
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void a(Context context, Intent intent) {
        intent.setComponent(new ComponentName(f35251b, f35252c));
        try {
            String string = intent.getExtras().getString("responseType");
            if ("com.amazon.testclient.simplesignin.getUserAndLinks".equals(string)) {
                a(a(intent));
                return;
            }
            if ("com.amazon.testclient.simplesignin.linkUserAccount".equals(string)) {
                a(c(intent));
                return;
            }
            if ("com.amazon.testclient.simplesignin.showLoginSelection".equals(string)) {
                a(d(intent));
            } else if ("com.amazon.testclient.simplesignin.recordmetricsevent".equals(string)) {
                a(b(intent));
            } else {
                Log.d(f35250a, "Unknown response type received.");
            }
        } catch (Exception e10) {
            Log.e(f35250a, "Error handling response.", e10);
        }
    }

    private GetUserAndLinksResponse a(Intent intent) {
        GetUserAndLinksResponse getUserAndLinksResponse = new GetUserAndLinksResponse();
        try {
            JSONObject jSONObject = new JSONObject(intent.getStringExtra("getUserAndLinksOutput"));
            getUserAndLinksResponse.setRequestId(new RequestId(jSONObject.getString("requestId")));
            RequestStatus requestStatusValueOf = RequestStatus.valueOf(jSONObject.getString("status"));
            getUserAndLinksResponse.setRequestStatus(requestStatusValueOf);
            if (!RequestStatus.SUCCESSFUL.equals(requestStatusValueOf)) {
                return getUserAndLinksResponse;
            }
            String string = jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f35168b);
            getUserAndLinksResponse.setAmazonUserId(string);
            getUserAndLinksResponse.setLinks(com.amazon.device.simplesignin.a.d.b.a(string, jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f35169c)));
            return getUserAndLinksResponse;
        } catch (JSONException e10) {
            Log.e(f35250a, "Exception while parsing GetUserAndLinks response", e10);
            return getUserAndLinksResponse;
        }
    }

    private Intent a(String str) {
        Intent intent = new Intent(str);
        intent.setComponent(new ComponentName(f35251b, f35252c));
        return intent;
    }

    private void a(final Object obj) {
        Context contextC = c.a().c();
        final ISimpleSignInResponseHandler iSimpleSignInResponseHandlerD = c.a().d();
        if (contextC != null && obj != null) {
            new Handler(contextC.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.simplesignin.a.c.b.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Object obj2 = obj;
                        if (obj2 instanceof GetUserAndLinksResponse) {
                            iSimpleSignInResponseHandlerD.onGetUserAndLinksResponse((GetUserAndLinksResponse) obj2);
                            return;
                        }
                        if (obj2 instanceof LinkUserAccountResponse) {
                            iSimpleSignInResponseHandlerD.onLinkUserAccountResponse((LinkUserAccountResponse) obj2);
                            return;
                        }
                        if (obj2 instanceof ShowLoginSelectionResponse) {
                            iSimpleSignInResponseHandlerD.onShowLoginSelectionResponse((ShowLoginSelectionResponse) obj2);
                            return;
                        }
                        if (obj2 instanceof RecordMetricsEventResponse) {
                            iSimpleSignInResponseHandlerD.onRecordMetricsEventResponse((RecordMetricsEventResponse) obj2);
                            return;
                        }
                        Log.e(b.f35250a, "Unknown response type:" + obj.getClass().getName());
                    } catch (Exception e10) {
                        Log.e(b.f35250a, "Error in sendResponse: " + e10);
                    }
                }
            });
            return;
        }
        Log.i(f35250a, "ISimpleSignInResponseHandler is not set. Dropping response: " + obj);
    }
}
