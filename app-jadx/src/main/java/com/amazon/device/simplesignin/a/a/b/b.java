package com.amazon.device.simplesignin.a.a.b;

import android.app.Activity;
import android.content.Intent;
import com.amazon.a.a.n.b.d;
import com.amazon.d.a.j;
import com.amazon.device.simplesignin.model.request.LinkUserAccountRequest;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f35199d = "SSI_LinkUserAccount";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f35200e = "1.0";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f35201f = "b";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.amazon.a.a.k.a
    protected com.amazon.a.a.n.b f35202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    protected com.amazon.a.a.a.a f35203c;

    b(a aVar, LinkUserAccountRequest linkUserAccountRequest) {
        super(aVar, f35199d, "1.0");
        super.a(com.amazon.device.simplesignin.a.a.a.f35170d, linkUserAccountRequest.getPartnerUserId());
        super.a(com.amazon.device.simplesignin.a.a.a.f35167a, linkUserAccountRequest.getIdentityProviderName());
        super.a(com.amazon.device.simplesignin.a.a.a.f35171e, linkUserAccountRequest.getUserLoginName());
        super.a(com.amazon.device.simplesignin.a.a.a.f35174h, com.amazon.device.simplesignin.a.a.a.f35175i);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("token", linkUserAccountRequest.getLinkToken().getToken());
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f35159E, linkUserAccountRequest.getLinkToken().getSchema());
            super.a(com.amazon.device.simplesignin.a.a.a.f35173g, jSONObject.toString());
            super.a(com.amazon.device.simplesignin.a.a.a.f35172f, linkUserAccountRequest.getLinkSigningKey());
        } catch (JSONException e10) {
            com.amazon.device.simplesignin.a.d.a.b(f35201f, "Unable to create linkToken json");
            throw new IllegalStateException("Unable to create linkToken json", e10);
        }
    }

    private void a(final Intent intent) {
        this.f35202b.b(d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.device.simplesignin.a.a.b.b.1
            @Override // com.amazon.a.a.n.a
            public void a() {
                try {
                    Activity activityB = b.this.f35203c.b();
                    if (activityB == null) {
                        activityB = b.this.f35203c.a();
                    }
                    com.amazon.device.simplesignin.a.d.a.a(b.f35201f, "Consent activity is about to start: " + activityB);
                    activityB.startActivity(intent);
                } catch (Exception e10) {
                    com.amazon.device.simplesignin.a.d.a.a(b.f35201f, "Exception when starting consent activity: " + e10);
                }
            }
        });
    }

    @Override // com.amazon.a.a.n.a.h
    protected boolean b(j jVar) {
        Map mapB = jVar.b();
        if (!mapB.containsKey(com.amazon.device.simplesignin.a.a.a.f35176j) || mapB.get(com.amazon.device.simplesignin.a.a.a.f35176j) == null) {
            return super.a(mapB);
        }
        a((Intent) mapB.get(com.amazon.device.simplesignin.a.a.a.f35176j));
        return true;
    }
}
