package Yc;

import Yc.g;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.AbstractC2857k;
import androidx.lifecycle.ProcessLifecycleOwner;
import expo.modules.notifications.service.NotificationForwarderActivity;
import expo.modules.notifications.service.NotificationsService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements Zc.c {

    /* JADX INFO: renamed from: b */
    public static final a f22903b = new a(null);

    /* JADX INFO: renamed from: c */
    private static Collection f22904c = new ArrayList();

    /* JADX INFO: renamed from: d */
    private static WeakHashMap f22905d = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    private final Context f22906a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Intent c(Context context) {
            return context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        }

        private final Intent d(Context context) {
            Intent intent = new Intent("expo.modules.notifications.OPEN_APP_ACTION");
            intent.addFlags(268435456);
            intent.setPackage(context.getApplicationContext().getPackageName());
            if (context.getPackageManager().resolveActivity(intent, 0) != null) {
                return intent;
            }
            return null;
        }

        public final void a(Dc.b listener) {
            AbstractC5504s.h(listener, "listener");
            if (e().containsKey(listener)) {
                return;
            }
            e().put(listener, new WeakReference(listener));
            Iterator it = f().iterator();
            while (it.hasNext()) {
                listener.d((Pc.h) it.next());
                it.remove();
            }
        }

        public final PendingIntent b(Context context, Intent broadcastIntent) {
            String className;
            AbstractC5504s.h(context, "context");
            AbstractC5504s.h(broadcastIntent, "broadcastIntent");
            int i10 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
            Intent intent = new Intent(context, (Class<?>) NotificationForwarderActivity.class);
            intent.setData(broadcastIntent.getData());
            intent.setFlags(402653184);
            intent.putExtras(broadcastIntent);
            ComponentName component = broadcastIntent.getComponent();
            PendingIntent activity = PendingIntent.getActivity(context, (component == null || (className = component.getClassName()) == null) ? NotificationsService.class.hashCode() : className.hashCode(), intent, i10);
            AbstractC5504s.g(activity, "getActivity(...)");
            return activity;
        }

        protected final WeakHashMap e() {
            return c.f22905d;
        }

        protected final Collection f() {
            return c.f22904c;
        }

        public final void g(Context context, Pc.h notificationResponse) {
            AbstractC5504s.h(context, "context");
            AbstractC5504s.h(notificationResponse, "notificationResponse");
            Intent intentD = d(context);
            if (intentD == null) {
                intentD = c(context);
            }
            if (intentD == null) {
                Log.w("expo-notifications", "No launch intent found for application. Interacting with the notification won't open the app. The implementation uses `getLaunchIntentForPackage` to find appropriate activity.");
            } else {
                NotificationsService.INSTANCE.B(intentD, notificationResponse);
                context.startActivity(intentD);
            }
        }

        private a() {
        }
    }

    public c(Context context) {
        AbstractC5504s.h(context, "context");
        this.f22906a = context;
    }

    private final boolean h(Pc.a aVar) {
        String title = aVar.a().a().getTitle();
        if (title != null && title.length() != 0) {
            return true;
        }
        String text = aVar.a().a().getText();
        return (text == null || text.length() == 0) ? false : true;
    }

    @Override // Zc.c
    public void a() {
        Iterator it = f().iterator();
        while (it.hasNext()) {
            ((Dc.b) it.next()).e();
        }
    }

    @Override // Zc.c
    public void b(Pc.h notificationResponse) {
        AbstractC5504s.h(notificationResponse, "notificationResponse");
        if (notificationResponse.a().b()) {
            f22903b.g(this.f22906a, notificationResponse);
        }
        if (!g() && !AbstractC5504s.c(notificationResponse.b(), "expo.modules.notifications.actions.DEFAULT")) {
            g.a aVar = g.f22917b;
            Context applicationContext = this.f22906a.getApplicationContext();
            AbstractC5504s.g(applicationContext, "getApplicationContext(...)");
            Bundle bundleD = Dc.c.d(notificationResponse);
            AbstractC5504s.g(bundleD, "toBundle(...)");
            aVar.g(applicationContext, bundleD);
        }
        List listF = f();
        if (listF.isEmpty()) {
            f22904c.add(notificationResponse);
            return;
        }
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            ((Dc.b) it.next()).d(notificationResponse);
        }
    }

    @Override // Zc.c
    public void c(Pc.a notification) {
        AbstractC5504s.h(notification, "notification");
        if (g()) {
            Iterator it = f().iterator();
            while (it.hasNext()) {
                ((Dc.b) it.next()).b(notification);
            }
        } else if (h(notification)) {
            NotificationsService.Companion.r(NotificationsService.INSTANCE, this.f22906a, notification, null, null, 12, null);
        }
    }

    public final List f() {
        Collection collectionValues = f22905d.values();
        AbstractC5504s.g(collectionValues, "<get-values>(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            Dc.b bVar = (Dc.b) ((WeakReference) it.next()).get();
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public final boolean g() {
        return ProcessLifecycleOwner.INSTANCE.a().getLifecycle().getCurrentState().b(AbstractC2857k.b.f30239e);
    }
}
