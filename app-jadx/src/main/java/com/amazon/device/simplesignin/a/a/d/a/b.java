package com.amazon.device.simplesignin.a.a.d.a;

import com.amazon.d.a.j;
import com.amazon.device.simplesignin.a.a.c;
import com.amazon.device.simplesignin.a.a.d;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.response.ShowLoginSelectionResponse;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class b extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f35214b = "SSI_LoginSelectionResponse";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f35215c = "1.0";

    b(a aVar) {
        super(aVar, f35214b, "1.0");
    }

    @Override // com.amazon.device.simplesignin.a.a.c
    protected void a(RequestStatus requestStatus) {
        if (RequestStatus.INVALID_LINK_SIGNING_KEY_ENCRYPTION.equals(requestStatus) || RequestStatus.INVALID_LINK_SIGNING_KEY.equals(requestStatus)) {
            a(RequestStatus.FAILURE, null, null);
        } else {
            a(requestStatus, null, null);
        }
    }

    @Override // com.amazon.a.a.n.a.h
    protected boolean b(j jVar) {
        Map mapB = jVar.b();
        if (!mapB.containsKey(com.amazon.device.simplesignin.a.a.a.f35183q)) {
            a(RequestStatus.FAILURE);
            return false;
        }
        String str = (String) mapB.get(com.amazon.device.simplesignin.a.a.a.f35183q);
        if (str == null) {
            a(RequestStatus.FAILURE);
            return false;
        }
        String str2 = (String) mapB.get(com.amazon.device.simplesignin.a.a.a.f35184r);
        ShowLoginSelectionResponse.UserSelection userSelection = ShowLoginSelectionResponse.UserSelection.LoginSelected;
        if (!userSelection.name().equals(str) || str2 == null) {
            a(RequestStatus.SUCCESSFUL, null, ShowLoginSelectionResponse.UserSelection.ManualSignIn);
            return true;
        }
        a(RequestStatus.SUCCESSFUL, str2, userSelection);
        return true;
    }

    private void a(RequestStatus requestStatus, String str, ShowLoginSelectionResponse.UserSelection userSelection) {
        d dVar = (d) j();
        ShowLoginSelectionResponse showLoginSelectionResponse = new ShowLoginSelectionResponse();
        showLoginSelectionResponse.setRequestId(dVar.e());
        showLoginSelectionResponse.setRequestStatus(requestStatus);
        showLoginSelectionResponse.setUserSelection(userSelection);
        showLoginSelectionResponse.setLinkId(str);
        super.a(showLoginSelectionResponse);
    }
}
