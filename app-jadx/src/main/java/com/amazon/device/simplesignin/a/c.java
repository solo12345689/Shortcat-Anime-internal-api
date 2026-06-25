package com.amazon.device.simplesignin.a;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.amazon.a.a.o.f;
import com.amazon.device.simplesignin.ISimpleSignInResponseHandler;
import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.model.SSIEvent;
import com.amazon.device.simplesignin.model.request.LinkUserAccountRequest;
import com.amazon.device.simplesignin.model.request.SSIEventRequest;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f35228a = "c";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f35229b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final IllegalStateException f35230c = new IllegalStateException(String.format("%s. %s", "Simple Sign-In SDK not initialized", "To initialize and register responseHandler, call SimpleSignInService.registerResponseHandler()"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f35231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ISimpleSignInResponseHandler f35232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f35233f;

    private c() {
    }

    public static c a() {
        return f35229b;
    }

    private boolean f() {
        return this.f35231d != null;
    }

    private void g() {
        if (f()) {
            return;
        }
        com.amazon.device.simplesignin.a.d.a.b(f35228a, "Simple Sign-In SDK not initialized.");
        throw f35230c;
    }

    public String b() {
        if (f()) {
            return a.a().b(this.f35231d) ? com.amazon.device.simplesignin.a.b.a.SANDBOX.name() : com.amazon.device.simplesignin.a.b.a.PRODUCTION.name();
        }
        com.amazon.device.simplesignin.a.d.a.b(f35228a, "Application context not initialized, SDK mode is unknown.");
        return com.amazon.device.simplesignin.a.b.a.UNKNOWN.name();
    }

    public Context c() {
        return this.f35231d;
    }

    public ISimpleSignInResponseHandler d() {
        return this.f35232e;
    }

    public b e() {
        return this.f35233f;
    }

    public void a(Context context, ISimpleSignInResponseHandler iSimpleSignInResponseHandler) {
        com.amazon.a.a.a(context.getApplicationContext());
        this.f35231d = context;
        this.f35232e = iSimpleSignInResponseHandler;
        this.f35233f = a.a().a(context);
    }

    public RequestId a(String str) {
        g();
        f.a(str, com.amazon.device.simplesignin.a.a.a.f35192z);
        RequestId requestId = new RequestId();
        this.f35233f.a(requestId, str);
        return requestId;
    }

    private void b(LinkUserAccountRequest linkUserAccountRequest) {
        f.a(linkUserAccountRequest.getPartnerUserId(), com.amazon.device.simplesignin.a.a.a.f35155A);
        f.a(linkUserAccountRequest.getIdentityProviderName(), com.amazon.device.simplesignin.a.a.a.f35192z);
        f.a(linkUserAccountRequest.getLinkToken(), "linkToken");
        f.a(linkUserAccountRequest.getLinkToken().getToken(), "linkToken.token");
        f.a(linkUserAccountRequest.getLinkToken().getSchema(), "linkToken.schema");
        f.a(linkUserAccountRequest.getUserLoginName(), "userLoginName");
        f.a(linkUserAccountRequest.getLinkSigningKey(), "linkSigningKey");
    }

    public RequestId a(LinkUserAccountRequest linkUserAccountRequest) {
        g();
        b(linkUserAccountRequest);
        RequestId requestId = new RequestId();
        this.f35233f.a(requestId, linkUserAccountRequest);
        return requestId;
    }

    public RequestId a(Map<String, String> map) {
        g();
        if (!map.isEmpty()) {
            RequestId requestId = new RequestId();
            this.f35233f.a(requestId, map);
            return requestId;
        }
        throw new IllegalArgumentException("loginNames must not be empty");
    }

    public RequestId a(SSIEventRequest sSIEventRequest) {
        g();
        if (sSIEventRequest.getEvent().equals(SSIEvent.LOGIN_FAILURE) && sSIEventRequest.getFailureReason() == null) {
            throw new IllegalArgumentException("failureReason must not be empty for login failure");
        }
        RequestId requestId = new RequestId();
        this.f35233f.a(requestId, sSIEventRequest);
        Log.i(f35228a, "Initiating record event with requestId : " + requestId.toString());
        return requestId;
    }

    public void a(Context context, Intent intent) {
        this.f35233f.a(context, intent);
    }
}
