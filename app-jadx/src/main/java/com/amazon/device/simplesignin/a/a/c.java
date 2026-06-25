package com.amazon.device.simplesignin.a.a;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import com.amazon.a.a.n.a.h;
import com.amazon.device.simplesignin.ISimpleSignInResponseHandler;
import com.amazon.device.simplesignin.SimpleSignInService;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.response.GetUserAndLinksResponse;
import com.amazon.device.simplesignin.model.response.LinkUserAccountResponse;
import com.amazon.device.simplesignin.model.response.RecordMetricsEventResponse;
import com.amazon.device.simplesignin.model.response.ShowLoginSelectionResponse;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends h {

    /* JADX INFO: renamed from: b */
    private static final String f35206b = "c";

    /* JADX INFO: renamed from: com.amazon.device.simplesignin.a.a.c$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f35207a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ISimpleSignInResponseHandler f35208b;

        AnonymousClass1(Object obj, ISimpleSignInResponseHandler iSimpleSignInResponseHandler) {
            obj = obj;
            iSimpleSignInResponseHandler = iSimpleSignInResponseHandler;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Object obj = obj;
                if (obj instanceof GetUserAndLinksResponse) {
                    iSimpleSignInResponseHandler.onGetUserAndLinksResponse((GetUserAndLinksResponse) obj);
                    return;
                }
                if (obj instanceof LinkUserAccountResponse) {
                    iSimpleSignInResponseHandler.onLinkUserAccountResponse((LinkUserAccountResponse) obj);
                    return;
                }
                if (obj instanceof ShowLoginSelectionResponse) {
                    iSimpleSignInResponseHandler.onShowLoginSelectionResponse((ShowLoginSelectionResponse) obj);
                    return;
                }
                if (obj instanceof RecordMetricsEventResponse) {
                    iSimpleSignInResponseHandler.onRecordMetricsEventResponse((RecordMetricsEventResponse) obj);
                    return;
                }
                com.amazon.device.simplesignin.a.d.a.b(c.f35206b, "Unknown response type:" + obj.getClass().getName());
            } catch (Exception e10) {
                com.amazon.device.simplesignin.a.d.a.b(c.f35206b, "Error in sending response to callback: " + e10);
            }
        }
    }

    public c(d dVar, String str, String str2) {
        super(dVar, str, str2, dVar.e().toString(), SimpleSignInService.SDK_VERSION);
        super.b(false);
    }

    protected abstract void a(RequestStatus requestStatus);

    protected void a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("response is marked non-null but is null");
        }
        String str = f35206b;
        com.amazon.device.simplesignin.a.d.a.a(str, "Response type received: " + obj.getClass().getSimpleName());
        Context contextC = com.amazon.device.simplesignin.a.c.a().c();
        ISimpleSignInResponseHandler iSimpleSignInResponseHandlerD = com.amazon.device.simplesignin.a.c.a().d();
        if (contextC == null || iSimpleSignInResponseHandlerD == null) {
            com.amazon.device.simplesignin.a.d.a.a(str, "Dropping the response as context of response handler is null.");
        } else {
            new Handler(contextC.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.simplesignin.a.a.c.1

                /* JADX INFO: renamed from: a */
                final /* synthetic */ Object f35207a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ ISimpleSignInResponseHandler f35208b;

                AnonymousClass1(Object obj2, ISimpleSignInResponseHandler iSimpleSignInResponseHandlerD2) {
                    obj = obj2;
                    iSimpleSignInResponseHandler = iSimpleSignInResponseHandlerD2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Object obj2 = obj;
                        if (obj2 instanceof GetUserAndLinksResponse) {
                            iSimpleSignInResponseHandler.onGetUserAndLinksResponse((GetUserAndLinksResponse) obj2);
                            return;
                        }
                        if (obj2 instanceof LinkUserAccountResponse) {
                            iSimpleSignInResponseHandler.onLinkUserAccountResponse((LinkUserAccountResponse) obj2);
                            return;
                        }
                        if (obj2 instanceof ShowLoginSelectionResponse) {
                            iSimpleSignInResponseHandler.onShowLoginSelectionResponse((ShowLoginSelectionResponse) obj2);
                            return;
                        }
                        if (obj2 instanceof RecordMetricsEventResponse) {
                            iSimpleSignInResponseHandler.onRecordMetricsEventResponse((RecordMetricsEventResponse) obj2);
                            return;
                        }
                        com.amazon.device.simplesignin.a.d.a.b(c.f35206b, "Unknown response type:" + obj.getClass().getName());
                    } catch (Exception e10) {
                        com.amazon.device.simplesignin.a.d.a.b(c.f35206b, "Error in sending response to callback: " + e10);
                    }
                }
            });
        }
    }

    @Override // com.amazon.a.a.n.a.h
    public void b(com.amazon.d.a.h hVar) {
        String strG;
        try {
            strG = hVar.g();
        } catch (RemoteException unused) {
            com.amazon.device.simplesignin.a.d.a.b(f35206b, "Exception while fetching reason for failure");
        }
        if (a.f35160F.equals(strG)) {
            a(RequestStatus.NOT_SUPPORTED);
            return;
        }
        if (a.f35163I.equals(strG)) {
            a(RequestStatus.NOT_AVAILABLE);
            return;
        }
        if (a.f35161G.equals(strG)) {
            a(RequestStatus.DUPLICATE_REQUEST);
            return;
        }
        if (a.f35162H.equals(strG)) {
            a(RequestStatus.FEATURE_TURNED_OFF);
            return;
        }
        if (a.f35164J.equals(strG)) {
            a(RequestStatus.RETRYABLE_FAILURE);
            return;
        }
        if (a.f35165K.equals(strG)) {
            a(RequestStatus.INVALID_LINK_SIGNING_KEY_ENCRYPTION);
            return;
        }
        if (a.f35166L.equals(strG)) {
            a(RequestStatus.INVALID_LINK_SIGNING_KEY);
            return;
        }
        a(RequestStatus.FAILURE);
    }
}
