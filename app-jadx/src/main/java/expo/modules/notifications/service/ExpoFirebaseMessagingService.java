package expo.modules.notifications.service;

import Td.AbstractC2163n;
import Yc.g;
import Zc.b;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.W;
import expo.modules.notifications.service.ExpoFirebaseMessagingService;
import ie.InterfaceC5082a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003R\u001b\u0010\u0013\u001a\u00020\u000e8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lexpo/modules/notifications/service/ExpoFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "Lcom/google/firebase/messaging/W;", "remoteMessage", "LTd/L;", "p", "(Lcom/google/firebase/messaging/W;)V", "", "token", "r", "(Ljava/lang/String;)V", "o", "LZc/b;", "h", "Lkotlin/Lazy;", "w", "()LZc/b;", "firebaseMessagingDelegate", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ExpoFirebaseMessagingService extends FirebaseMessagingService {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Lazy firebaseMessagingDelegate = AbstractC2163n.b(new InterfaceC5082a() { // from class: Xc.a
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return ExpoFirebaseMessagingService.v(this.f21743a);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final g v(ExpoFirebaseMessagingService expoFirebaseMessagingService) {
        return new g(expoFirebaseMessagingService);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void o() {
        w().b();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void p(W remoteMessage) {
        AbstractC5504s.h(remoteMessage, "remoteMessage");
        w().c(remoteMessage);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void r(String token) {
        AbstractC5504s.h(token, "token");
        w().a(token);
    }

    protected b w() {
        return (b) this.firebaseMessagingDelegate.getValue();
    }
}
