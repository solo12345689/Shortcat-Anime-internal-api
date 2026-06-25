package io.invertase.firebase.messaging;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.W;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class ReactNativeFirebaseMessagingService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void o() {
        Pd.g.i().o(u.c());
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void q(String str) {
        Pd.g.i().o(u.b(str));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void r(String str) {
        Pd.g.i().o(u.d(str));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void s(String str, Exception exc) {
        Pd.g.i().o(u.a(str, exc));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void p(W w10) {
    }
}
