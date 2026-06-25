package com.amazon.device.simplesignin.a.a.d;

import android.app.Activity;
import android.content.Intent;
import com.amazon.d.a.j;
import com.amazon.device.simplesignin.a.a.c;
import com.amazon.device.simplesignin.a.a.d;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.response.ShowLoginSelectionResponse;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f35216d = a.class.getSimpleName();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f35217e = "SSI_ShowLoginSelection";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f35218f = "1.0";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.amazon.a.a.k.a
    protected com.amazon.a.a.n.b f35219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    protected com.amazon.a.a.a.a f35220c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, String> f35221g;

    b(a aVar, Map<String, String> map) {
        super(aVar, f35217e, "1.0");
        this.f35221g = map;
    }

    @Override // com.amazon.device.simplesignin.a.a.c
    protected void a(RequestStatus requestStatus) {
        d dVar = (d) j();
        ShowLoginSelectionResponse showLoginSelectionResponse = new ShowLoginSelectionResponse();
        showLoginSelectionResponse.setRequestId(dVar.e());
        if (RequestStatus.INVALID_LINK_SIGNING_KEY_ENCRYPTION.equals(requestStatus) || RequestStatus.INVALID_LINK_SIGNING_KEY.equals(requestStatus)) {
            showLoginSelectionResponse.setRequestStatus(RequestStatus.FAILURE);
        } else {
            showLoginSelectionResponse.setRequestStatus(requestStatus);
            super.a(showLoginSelectionResponse);
        }
    }

    @Override // com.amazon.a.a.n.a.h
    protected boolean b(j jVar) {
        Map mapB = jVar.b();
        if (!mapB.containsKey(com.amazon.device.simplesignin.a.a.a.f35182p)) {
            a(RequestStatus.FAILURE);
            return false;
        }
        Intent intent = (Intent) mapB.get(com.amazon.device.simplesignin.a.a.a.f35182p);
        if (intent == null) {
            a(RequestStatus.FAILURE);
            return false;
        }
        intent.putExtra(com.amazon.device.simplesignin.a.a.a.f35181o, new HashMap(this.f35221g));
        a(intent);
        return true;
    }

    private void a(final Intent intent) {
        this.f35219b.b(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.device.simplesignin.a.a.d.b.1
            @Override // com.amazon.a.a.n.a
            public void a() {
                try {
                    Activity activityB = b.this.f35220c.b();
                    if (activityB == null) {
                        activityB = b.this.f35220c.a();
                    }
                    com.amazon.device.simplesignin.a.d.a.a(b.f35216d, "ShowLoginSelection activity initiated through startActivity");
                    activityB.startActivity(intent);
                } catch (Exception e10) {
                    com.amazon.device.simplesignin.a.d.a.a(b.f35216d, "Exception when starting show login selection activity: " + e10);
                }
            }
        });
    }
}
