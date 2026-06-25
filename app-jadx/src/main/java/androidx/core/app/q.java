package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import c.InterfaceC3055a;
import com.revenuecat.purchases.common.Constants;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f28872d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static f f28875g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f28876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NotificationManager f28877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f28871c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Set f28873e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f28874f = new Object();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b {
        static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        static void b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        static void c(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        static void d(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        static String e(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        static NotificationChannel f(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        static List g(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        static List h(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class c {
        static NotificationChannelGroup a(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannelGroup(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f28878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f28879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f28880c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Notification f28881d;

        d(String str, int i10, String str2, Notification notification) {
            this.f28878a = str;
            this.f28879b = i10;
            this.f28880c = str2;
            this.f28881d = notification;
        }

        @Override // androidx.core.app.q.g
        public void a(InterfaceC3055a interfaceC3055a) {
            interfaceC3055a.v3(this.f28878a, this.f28879b, this.f28880c, this.f28881d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f28878a + ", id:" + this.f28879b + ", tag:" + this.f28880c + "]";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ComponentName f28882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final IBinder f28883b;

        e(ComponentName componentName, IBinder iBinder) {
            this.f28882a = componentName;
            this.f28883b = iBinder;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class f implements Handler.Callback, ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f28884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HandlerThread f28885b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f28886c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f28887d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Set f28888e = new HashSet();

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final ComponentName f28889a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            InterfaceC3055a f28891c;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            boolean f28890b = false;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            ArrayDeque f28892d = new ArrayDeque();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f28893e = 0;

            a(ComponentName componentName) {
                this.f28889a = componentName;
            }
        }

        f(Context context) {
            this.f28884a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f28885b = handlerThread;
            handlerThread.start();
            this.f28886c = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f28890b) {
                return true;
            }
            boolean zBindService = this.f28884a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f28889a), this, 33);
            aVar.f28890b = zBindService;
            if (zBindService) {
                aVar.f28893e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f28889a);
                this.f28884a.unbindService(this);
            }
            return aVar.f28890b;
        }

        private void b(a aVar) {
            if (aVar.f28890b) {
                this.f28884a.unbindService(this);
                aVar.f28890b = false;
            }
            aVar.f28891c = null;
        }

        private void c(g gVar) {
            j();
            for (a aVar : this.f28887d.values()) {
                aVar.f28892d.add(gVar);
                g(aVar);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = (a) this.f28887d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = (a) this.f28887d.get(componentName);
            if (aVar != null) {
                aVar.f28891c = InterfaceC3055a.AbstractBinderC0561a.c(iBinder);
                aVar.f28893e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = (a) this.f28887d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f28889a + ", " + aVar.f28892d.size() + " queued tasks");
            }
            if (aVar.f28892d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.f28891c == null) {
                i(aVar);
                return;
            }
            while (true) {
                g gVar = (g) aVar.f28892d.peek();
                if (gVar == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + gVar);
                    }
                    gVar.a(aVar.f28891c);
                    aVar.f28892d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + aVar.f28889a);
                    }
                } catch (RemoteException e10) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f28889a, e10);
                }
            }
            if (aVar.f28892d.isEmpty()) {
                return;
            }
            i(aVar);
        }

        private void i(a aVar) {
            if (this.f28886c.hasMessages(3, aVar.f28889a)) {
                return;
            }
            int i10 = aVar.f28893e;
            int i11 = i10 + 1;
            aVar.f28893e = i11;
            if (i11 <= 6) {
                int i12 = (1 << i10) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i12 + " ms");
                }
                this.f28886c.sendMessageDelayed(this.f28886c.obtainMessage(3, aVar.f28889a), i12);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + aVar.f28892d.size() + " tasks to " + aVar.f28889a + " after " + aVar.f28893e + " retries");
            aVar.f28892d.clear();
        }

        private void j() {
            Set setJ = q.j(this.f28884a);
            if (setJ.equals(this.f28888e)) {
                return;
            }
            this.f28888e = setJ;
            List<ResolveInfo> listQueryIntentServices = this.f28884a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setJ.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f28887d.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f28887d.put(componentName2, new a(componentName2));
                }
            }
            Iterator it = this.f28887d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                    }
                    b((a) entry.getValue());
                    it.remove();
                }
            }
        }

        public void h(g gVar) {
            this.f28886c.obtainMessage(0, gVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c((g) message.obj);
                return true;
            }
            if (i10 == 1) {
                e eVar = (e) message.obj;
                e(eVar.f28882a, eVar.f28883b);
                return true;
            }
            if (i10 == 2) {
                f((ComponentName) message.obj);
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            d((ComponentName) message.obj);
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f28886c.obtainMessage(1, new e(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f28886c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface g {
        void a(InterfaceC3055a interfaceC3055a);
    }

    private q(Context context) {
        this.f28876a = context;
        this.f28877b = (NotificationManager) context.getSystemService("notification");
    }

    public static q i(Context context) {
        return new q(context);
    }

    public static Set j(Context context) {
        Set set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f28871c) {
            if (string != null) {
                try {
                    if (!string.equals(f28872d)) {
                        String[] strArrSplit = string.split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        f28873e = hashSet;
                        f28872d = string;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            set = f28873e;
        }
        return set;
    }

    private void r(g gVar) {
        synchronized (f28874f) {
            try {
                if (f28875g == null) {
                    f28875g = new f(this.f28876a.getApplicationContext());
                }
                f28875g.h(gVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean s(Notification notification) {
        Bundle bundleD = m.d(notification);
        return bundleD != null && bundleD.getBoolean("android.support.useSideChannel");
    }

    public boolean a() {
        return a.a(this.f28877b);
    }

    public void b(int i10) {
        c(null, i10);
    }

    public void c(String str, int i10) {
        this.f28877b.cancel(str, i10);
    }

    public void d() {
        this.f28877b.cancelAll();
    }

    public void e(NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.a(this.f28877b, notificationChannel);
        }
    }

    public void f(NotificationChannelGroup notificationChannelGroup) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.b(this.f28877b, notificationChannelGroup);
        }
    }

    public void g(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.c(this.f28877b, str);
        }
    }

    public void h(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.d(this.f28877b, str);
        }
    }

    public int k() {
        return a.b(this.f28877b);
    }

    public NotificationChannel l(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return b.f(this.f28877b, str);
        }
        return null;
    }

    public NotificationChannelGroup m(String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return c.a(this.f28877b, str);
        }
        if (i10 >= 26) {
            Iterator it = n().iterator();
            while (it.hasNext()) {
                NotificationChannelGroup notificationChannelGroupA = p.a(it.next());
                if (b.e(notificationChannelGroupA).equals(str)) {
                    return notificationChannelGroupA;
                }
            }
        }
        return null;
    }

    public List n() {
        return Build.VERSION.SDK_INT >= 26 ? b.g(this.f28877b) : Collections.EMPTY_LIST;
    }

    public List o() {
        return Build.VERSION.SDK_INT >= 26 ? b.h(this.f28877b) : Collections.EMPTY_LIST;
    }

    public void p(int i10, Notification notification) {
        q(null, i10, notification);
    }

    public void q(String str, int i10, Notification notification) {
        if (!s(notification)) {
            this.f28877b.notify(str, i10, notification);
        } else {
            r(new d(this.f28876a.getPackageName(), i10, str, notification));
            this.f28877b.cancel(str, i10);
        }
    }
}
