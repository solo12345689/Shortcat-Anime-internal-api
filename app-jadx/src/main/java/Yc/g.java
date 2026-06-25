package Yc;

import Td.L;
import Ud.AbstractC2279u;
import android.content.Context;
import android.os.Bundle;
import bd.InterfaceC3047a;
import com.google.firebase.messaging.W;
import expo.modules.interfaces.taskManager.TaskServiceProviderHelper;
import expo.modules.notifications.service.NotificationsService;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class g implements Zc.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f22918c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22917b = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final HashSet f22919d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Set f22920e = new LinkedHashSet();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(InterfaceC3047a listener) {
            AbstractC5504s.h(listener, "listener");
            synchronized (e()) {
                try {
                    a aVar = g.f22917b;
                    if (!aVar.e().contains(listener)) {
                        aVar.e().add(listener);
                        String strD = aVar.d();
                        if (strD != null) {
                            listener.a(strD);
                        }
                    }
                    L l10 = L.f17438a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final List b() {
            return AbstractC2279u.b1(c());
        }

        protected final Set c() {
            return g.f22920e;
        }

        protected final String d() {
            return g.f22918c;
        }

        protected final HashSet e() {
            return g.f22919d;
        }

        public final boolean f(InterfaceC3047a listener) {
            boolean zRemove;
            AbstractC5504s.h(listener, "listener");
            synchronized (e()) {
                zRemove = g.f22917b.e().remove(listener);
            }
            return zRemove;
        }

        public final void g(Context applicationContext, Bundle bundle) {
            AbstractC5504s.h(applicationContext, "applicationContext");
            AbstractC5504s.h(bundle, "bundle");
            TaskServiceProviderHelper.f46117a.getTaskServiceImpl(applicationContext);
            Iterator it = b().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }

        private a() {
        }
    }

    public g(Context context) {
        AbstractC5504s.h(context, "context");
        this.f22921a = context;
    }

    @Override // Zc.b
    public void a(String token) {
        AbstractC5504s.h(token, "token");
        Iterator it = f22919d.iterator();
        AbstractC5504s.g(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC5504s.g(next, "next(...)");
            ((InterfaceC3047a) next).a(token);
        }
        f22918c = token;
    }

    @Override // Zc.b
    public void b() {
        NotificationsService.INSTANCE.o(this.f22921a);
    }

    @Override // Zc.b
    public void c(W remoteMessage) {
        AbstractC5504s.h(remoteMessage, "remoteMessage");
        Kc.a aVar = Kc.a.f10974a;
        aVar.c("FirebaseMessagingDelegate.onMessageReceived: message", remoteMessage);
        Pc.a aVarG = g(remoteMessage);
        aVar.b("FirebaseMessagingDelegate.onMessageReceived: notification", aVarG);
        NotificationsService.Companion.t(NotificationsService.INSTANCE, this.f22921a, aVarG, null, 4, null);
        a aVar2 = f22917b;
        Context applicationContext = this.f22921a.getApplicationContext();
        AbstractC5504s.g(applicationContext, "getApplicationContext(...)");
        Bundle bundleB = Dc.d.b(remoteMessage);
        AbstractC5504s.g(bundleB, "toBundle(...)");
        aVar2.g(applicationContext, bundleB);
    }

    protected final Pc.a g(W remoteMessage) {
        AbstractC5504s.h(remoteMessage, "remoteMessage");
        return new Pc.a(h(i(remoteMessage), new Pc.i(remoteMessage), new Qc.a(remoteMessage)), new Date(remoteMessage.x()));
    }

    protected Pc.g h(String identifier, Oc.a content, Qc.a notificationTrigger) {
        AbstractC5504s.h(identifier, "identifier");
        AbstractC5504s.h(content, "content");
        AbstractC5504s.h(notificationTrigger, "notificationTrigger");
        return new Pc.g(identifier, content, notificationTrigger);
    }

    protected final String i(W remoteMessage) {
        AbstractC5504s.h(remoteMessage, "remoteMessage");
        String str = (String) remoteMessage.d().get("tag");
        if (str != null) {
            return str;
        }
        String strF = remoteMessage.f();
        if (strF != null) {
            return strF;
        }
        String string = UUID.randomUUID().toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }
}
