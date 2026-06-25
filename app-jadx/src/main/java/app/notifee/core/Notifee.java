package app.notifee.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import androidx.core.app.q;
import app.notifee.core.Notifee;
import app.notifee.core.interfaces.EventListener;
import app.notifee.core.interfaces.MethodCallResult;
import app.notifee.core.model.NotificationModel;
import cg.AbstractC3104a;
import com.google.common.util.concurrent.r;
import com.google.common.util.concurrent.s;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import r4.AbstractC6244b0;
import r4.E0;
import s4.C6429i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class Notifee {
    public static final int REQUEST_CODE_NOTIFICATION_PERMISSION = 11111;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Notifee f32970b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f32971c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f32972d = s.b(Executors.newCachedThreadPool());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MethodCallResult f32973a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class a implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodCallResult f32974a;

        public a(Notifee notifee, MethodCallResult methodCallResult) {
            this.f32974a = methodCallResult;
        }

        @Override // com.google.common.util.concurrent.i
        public void a(Throwable th2) {
            this.f32974a.onComplete(new Exception(th2), null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f32974a.onComplete(null, (List) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class b implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodCallResult f32975a;

        public b(Notifee notifee, MethodCallResult methodCallResult) {
            this.f32975a = methodCallResult;
        }

        @Override // com.google.common.util.concurrent.i
        public void a(Throwable th2) {
            this.f32975a.onComplete(new Exception(th2), null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f32975a.onComplete(null, (Bundle) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class c implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodCallResult f32976a;

        public c(Notifee notifee, MethodCallResult methodCallResult) {
            this.f32976a = methodCallResult;
        }

        @Override // com.google.common.util.concurrent.i
        public void a(Throwable th2) {
            this.f32976a.onComplete(new Exception(th2), null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f32976a.onComplete(null, (List) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class d implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodCallResult f32977a;

        public d(Notifee notifee, MethodCallResult methodCallResult) {
            this.f32977a = methodCallResult;
        }

        @Override // com.google.common.util.concurrent.i
        public void a(Throwable th2) {
            this.f32977a.onComplete(new Exception(th2), null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f32977a.onComplete(null, (Bundle) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class e implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodCallResult f32978a;

        public e(Notifee notifee, MethodCallResult methodCallResult) {
            this.f32978a = methodCallResult;
        }

        @Override // com.google.common.util.concurrent.i
        public void a(Throwable th2) {
            this.f32978a.onComplete(new Exception(th2), null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f32978a.onComplete(null, (Boolean) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class f implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodCallResult f32979a;

        public f(Notifee notifee, MethodCallResult methodCallResult) {
            this.f32979a = methodCallResult;
        }

        @Override // com.google.common.util.concurrent.i
        public void a(Throwable th2) {
            this.f32979a.onComplete(new Exception(th2), null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f32979a.onComplete(null, (Boolean) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class g implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodCallResult f32980a;

        public g(Notifee notifee, MethodCallResult methodCallResult) {
            this.f32980a = methodCallResult;
        }

        @Override // com.google.common.util.concurrent.i
        public void a(Throwable th2) {
            this.f32980a.onComplete(new Exception(th2), null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f32980a.onComplete(null, (Void) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class h implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodCallResult f32981a;

        public h(Notifee notifee, MethodCallResult methodCallResult) {
            this.f32981a = methodCallResult;
        }

        @Override // com.google.common.util.concurrent.i
        public void a(Throwable th2) {
            this.f32981a.onComplete(new Exception(th2), null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f32981a.onComplete(null, (Void) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class i implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodCallResult f32982a;

        public i(Notifee notifee, MethodCallResult methodCallResult) {
            this.f32982a = methodCallResult;
        }

        @Override // com.google.common.util.concurrent.i
        public void a(Throwable th2) {
            this.f32982a.onComplete(new Exception(th2), null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f32982a.onComplete(null, (Void) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class j implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodCallResult f32983a;

        public j(Notifee notifee, MethodCallResult methodCallResult) {
            this.f32983a = methodCallResult;
        }

        @Override // com.google.common.util.concurrent.i
        public void a(Throwable th2) {
            this.f32983a.onComplete(new Exception(th2), null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f32983a.onComplete(null, (Void) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class k implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodCallResult f32984a;

        public k(Notifee notifee, MethodCallResult methodCallResult) {
            this.f32984a = methodCallResult;
        }

        @Override // com.google.common.util.concurrent.i
        public void a(Throwable th2) {
            this.f32984a.onComplete(new Exception(th2), null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f32984a.onComplete(null, (Void) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class l implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodCallResult f32985a;

        public l(Notifee notifee, MethodCallResult methodCallResult) {
            this.f32985a = methodCallResult;
        }

        @Override // com.google.common.util.concurrent.i
        public void a(Throwable th2) {
            this.f32985a.onComplete(new Exception(th2), null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f32985a.onComplete(null, (Void) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class m implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodCallResult f32986a;

        public m(Notifee notifee, MethodCallResult methodCallResult) {
            this.f32986a = methodCallResult;
        }

        @Override // com.google.common.util.concurrent.i
        public void a(Throwable th2) {
            Exception exc = new Exception(th2);
            Logger.e("API", "displayNotification", exc);
            this.f32986a.onComplete(exc, null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f32986a.onComplete(null, (Void) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class n implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodCallResult f32987a;

        public n(Notifee notifee, MethodCallResult methodCallResult) {
            this.f32987a = methodCallResult;
        }

        @Override // com.google.common.util.concurrent.i
        public void a(Throwable th2) {
            Exception exc = new Exception(th2);
            Logger.e("API", "createTriggerNotification", exc);
            this.f32987a.onComplete(exc, null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f32987a.onComplete(null, (Void) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class o implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodCallResult f32988a;

        public o(Notifee notifee, MethodCallResult methodCallResult) {
            this.f32988a = methodCallResult;
        }

        @Override // com.google.common.util.concurrent.i
        public void a(Throwable th2) {
            this.f32988a.onComplete(new Exception(th2), null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f32988a.onComplete(null, (List) obj);
        }
    }

    public static Context getContext() {
        return cg.f.f33622a;
    }

    public static Notifee getInstance() {
        if (!f32971c) {
            Logger.w("API", "getInstance() accessed before event listener is initialized");
            f32970b = new Notifee();
        }
        return f32970b;
    }

    public static r getListeningExecutorService() {
        return f32972d;
    }

    public static void initialize(EventListener eventListener) {
        synchronized (Notifee.class) {
            try {
                if (f32971c) {
                    return;
                }
                if (f32970b == null) {
                    f32970b = new Notifee();
                }
                if (eventListener != null) {
                    EventSubscriber.register(eventListener);
                }
                f32971c = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void cancelAllNotifications(int i10, MethodCallResult<Void> methodCallResult) {
        com.google.common.util.concurrent.j.a(E0.e(i10), new g(this, methodCallResult), getListeningExecutorService());
    }

    public void cancelAllNotificationsWithIds(int i10, List<String> list, String str, MethodCallResult<Void> methodCallResult) {
        com.google.common.util.concurrent.j.a(E0.h(i10, list, str), new h(this, methodCallResult), getListeningExecutorService());
    }

    public void createChannel(Bundle bundle, MethodCallResult<Void> methodCallResult) {
        com.google.common.util.concurrent.j.a(AbstractC6244b0.e(new cg.d(bundle)), new i(this, methodCallResult), getListeningExecutorService());
    }

    public void createChannelGroup(Bundle bundle, MethodCallResult<Void> methodCallResult) {
        com.google.common.util.concurrent.j.a(AbstractC6244b0.d(new cg.c(bundle)), new k(this, methodCallResult), getListeningExecutorService());
    }

    public void createChannelGroups(List<Bundle> list, MethodCallResult<Void> methodCallResult) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Bundle> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new cg.c(it.next()));
        }
        com.google.common.util.concurrent.j.a(AbstractC6244b0.g(arrayList), new l(this, methodCallResult), getListeningExecutorService());
    }

    public void createChannels(List<Bundle> list, MethodCallResult<Void> methodCallResult) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Bundle> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new cg.d(it.next()));
        }
        com.google.common.util.concurrent.j.a(AbstractC6244b0.j(arrayList), new j(this, methodCallResult), getListeningExecutorService());
    }

    public void createTriggerNotification(Bundle bundle, Bundle bundle2, MethodCallResult<Void> methodCallResult) {
        com.google.common.util.concurrent.j.a(E0.m(new NotificationModel(bundle), bundle2), new n(this, methodCallResult), getListeningExecutorService());
    }

    public void deleteChannel(String str, MethodCallResult<Void> methodCallResult) {
        q.i(cg.f.f33622a).g(str);
        methodCallResult.onComplete(null, null);
    }

    public void deleteChannelGroup(String str, MethodCallResult<Void> methodCallResult) {
        q.i(cg.f.f33622a).h(str);
        methodCallResult.onComplete(null, null);
    }

    public void displayNotification(Bundle bundle, MethodCallResult<Void> methodCallResult) {
        com.google.common.util.concurrent.j.a(E0.y(new NotificationModel(bundle), null), new m(this, methodCallResult), getListeningExecutorService());
    }

    public void getChannel(String str, MethodCallResult<Bundle> methodCallResult) {
        com.google.common.util.concurrent.j.a(AbstractC6244b0.f(str), new b(this, methodCallResult), getListeningExecutorService());
    }

    public void getChannelGroup(String str, MethodCallResult<Bundle> methodCallResult) {
        com.google.common.util.concurrent.j.a(AbstractC6244b0.i(str), new d(this, methodCallResult), getListeningExecutorService());
    }

    public void getChannelGroups(MethodCallResult<List<Bundle>> methodCallResult) {
        com.google.common.util.concurrent.j.a(AbstractC6244b0.c(), new c(this, methodCallResult), getListeningExecutorService());
    }

    public void getChannels(MethodCallResult<List<Bundle>> methodCallResult) {
        com.google.common.util.concurrent.j.a(AbstractC6244b0.h(), new a(this, methodCallResult), getListeningExecutorService());
    }

    public void getDisplayedNotifications(MethodCallResult<List<Bundle>> methodCallResult) {
        com.google.common.util.concurrent.j.a(E0.d(), new o(this, methodCallResult), getListeningExecutorService());
    }

    public void getInitialNotification(Activity activity, MethodCallResult<Bundle> methodCallResult) {
        cg.i iVar = (cg.i) cg.g.f33623b.f33624a.q(cg.i.class);
        Bundle bundle = new Bundle();
        if (iVar != null) {
            bundle.putAll(iVar.f33628b);
            bundle.putBundle("notification", iVar.f33627a.toBundle());
            methodCallResult.onComplete(null, bundle);
            return;
        }
        if (activity != null) {
            try {
                Intent intent = activity.getIntent();
                if (intent != null && intent.getExtras() != null && intent.hasExtra("notification")) {
                    bundle.putBundle("notification", intent.getBundleExtra("notification"));
                    methodCallResult.onComplete(null, bundle);
                    return;
                }
            } catch (Exception e10) {
                Logger.e("API", "getInitialNotification", e10);
            }
        }
        methodCallResult.onComplete(null, null);
    }

    public String getMainComponent(String str) {
        cg.l lVar = (cg.l) cg.g.f33623b.f33624a.q(cg.l.class);
        return lVar == null ? str : lVar.f33631a;
    }

    public void getNotificationSettings(MethodCallResult<Bundle> methodCallResult) {
        boolean zA = q.i(cg.f.f33622a).a();
        Bundle bundle = new Bundle();
        if (zA) {
            bundle.putInt("authorizationStatus", 1);
        } else {
            bundle.putInt("authorizationStatus", 0);
        }
        boolean zCanScheduleExactAlarms = Build.VERSION.SDK_INT >= 31 ? AbstractC3104a.a().canScheduleExactAlarms() : true;
        Bundle bundle2 = new Bundle();
        if (zCanScheduleExactAlarms) {
            bundle2.putInt("alarm", 1);
        } else {
            bundle2.putInt("alarm", 0);
        }
        bundle.putBundle("android", bundle2);
        methodCallResult.onComplete(null, bundle);
    }

    public void getPowerManagerInfo(MethodCallResult<Bundle> methodCallResult) {
        String strB = cg.k.b(cg.r.a(cg.f.f33622a));
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        Bundle bundle = new Bundle();
        bundle.putString("manufacturer", str);
        bundle.putString("model", str2);
        bundle.putString(DiagnosticsEntry.VERSION_KEY, str3);
        bundle.putString("activity", strB);
        methodCallResult.onComplete(null, bundle);
    }

    public void getTriggerNotificationIds(MethodCallResult<List<String>> methodCallResult) {
        ExecutorService executorService = E0.f58551a;
        com.google.common.util.concurrent.j.a(new C6429i(cg.f.f33622a).o(), new cg.n(methodCallResult), E0.f58552b);
    }

    public void getTriggerNotifications(MethodCallResult<List<Bundle>> methodCallResult) {
        ExecutorService executorService = E0.f58551a;
        com.google.common.util.concurrent.j.a(new C6429i(cg.f.f33622a).o(), new cg.m(new ArrayList(), methodCallResult), E0.f58552b);
    }

    public void isBatteryOptimizationEnabled(MethodCallResult<Boolean> methodCallResult) {
        Context context = cg.f.f33622a;
        methodCallResult.onComplete(null, Boolean.valueOf(!((PowerManager) context.getSystemService("power")).isIgnoringBatteryOptimizations(context.getPackageName())));
    }

    public void isChannelBlocked(String str, MethodCallResult<Boolean> methodCallResult) {
        com.google.common.util.concurrent.j.a(AbstractC6244b0.m(str), new f(this, methodCallResult), getListeningExecutorService());
    }

    public void isChannelCreated(String str, MethodCallResult<Boolean> methodCallResult) {
        com.google.common.util.concurrent.j.a(AbstractC6244b0.p(str), new e(this, methodCallResult), getListeningExecutorService());
    }

    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        MethodCallResult<Bundle> methodCallResult;
        if (i10 != 11111 || (methodCallResult = this.f32973a) == null) {
            return false;
        }
        getNotificationSettings(methodCallResult);
        return true;
    }

    public void openAlarmPermissionSettings(Activity activity, MethodCallResult<Void> methodCallResult) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                Intent intent = new Intent();
                intent.setFlags(268435456);
                intent.setAction("android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
                intent.setData(Uri.parse("package:" + cg.f.f33622a.getPackageName()));
                cg.k.c(activity, intent);
            } catch (Exception e10) {
                Logger.e("AlarmUtils", "An error occurred whilst trying to open alarm permission settings", e10);
            }
        }
        methodCallResult.onComplete(null, null);
    }

    public void openBatteryOptimizationSettings(Activity activity, MethodCallResult<Void> methodCallResult) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
            intent.setFlags(268435456);
            if (activity != null) {
                if (cg.k.d(cg.f.f33622a, intent)) {
                    cg.k.c(activity, intent);
                } else {
                    Logger.d("PowerManagerUtils", "battery optimization settings is not available on device");
                }
            }
        } catch (Exception e10) {
            Logger.e("PowerManagerUtils", "An error occurred whilst trying to open battery optimization settings", e10);
        }
        methodCallResult.onComplete(null, null);
    }

    public void openNotificationSettings(String str, Activity activity, MethodCallResult<Void> methodCallResult) {
        final Intent intent;
        if (getContext() == null || activity == null) {
            Logger.d("openNotificationSettings", "attempted to start activity but no current activity or context was available.");
            methodCallResult.onComplete(null, null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (str != null) {
                intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.CHANNEL_ID", str);
            } else {
                intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            }
            intent.putExtra("android.provider.extra.APP_PACKAGE", getContext().getPackageName());
        } else {
            intent = new Intent("android.settings.APPLICATION_SETTINGS");
        }
        intent.setFlags(268435456);
        activity.runOnUiThread(new Runnable() { // from class: r4.g
            @Override // java.lang.Runnable
            public final void run() {
                Notifee.getContext().startActivity(intent);
            }
        });
        methodCallResult.onComplete(null, null);
    }

    public void openPowerManagerSettings(Activity activity, MethodCallResult<Void> methodCallResult) {
        Intent intentA;
        synchronized (cg.r.class) {
            intentA = cg.r.f33635a;
        }
        if (intentA == null) {
            intentA = cg.r.a(cg.f.f33622a);
        }
        if (intentA != null) {
            try {
                intentA.setFlags(268435456);
                cg.k.c(activity, intentA);
            } catch (Exception e10) {
                Logger.e("PowerManagerUtils", "Unable to start activity: " + cg.k.b(intentA), e10);
            }
        } else {
            Logger.w("PowerManagerUtils", "Unable to find an activity to open the device's power manager");
        }
        methodCallResult.onComplete(null, null);
    }

    public void setRequestPermissionCallback(MethodCallResult<Bundle> methodCallResult) {
        this.f32973a = methodCallResult;
    }

    public void stopForegroundService(MethodCallResult<Void> methodCallResult) {
        String str = ForegroundService.f32968a;
        Intent intent = new Intent(cg.f.f33622a, (Class<?>) ForegroundService.class);
        intent.setAction("app.notifee.core.ForegroundService.STOP");
        try {
            cg.f.f33622a.startService(intent);
        } catch (IllegalStateException unused) {
            cg.f.f33622a.stopService(intent);
        } catch (Exception e10) {
            Logger.e("ForegroundService", "Unable to stop foreground service", e10);
        }
        methodCallResult.onComplete(null, null);
    }
}
