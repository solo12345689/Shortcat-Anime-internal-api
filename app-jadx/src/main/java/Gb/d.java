package gb;

import Df.r;
import Td.z;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import Ud.S;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.SparseArray;
import androidx.core.app.q;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import q7.g;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: b */
    private static int f47406b;

    /* JADX INFO: renamed from: a */
    public static final d f47405a = new d();

    /* JADX INFO: renamed from: c */
    private static final Map f47407c = S.l(z.a("android.permission.ACCEPT_HANDOVER", 28), z.a("android.permission.ACCESS_BACKGROUND_LOCATION", 29), z.a("android.permission.ACCESS_MEDIA_LOCATION", 29), z.a("android.permission.ACTIVITY_RECOGNITION", 29), z.a("android.permission.ANSWER_PHONE_CALLS", 26), z.a("android.permission.BLUETOOTH_ADVERTISE", 31), z.a("android.permission.BLUETOOTH_CONNECT", 31), z.a("android.permission.BLUETOOTH_SCAN", 31), z.a("android.permission.BODY_SENSORS_BACKGROUND", 33), z.a("android.permission.NEARBY_WIFI_DEVICES", 33), z.a("android.permission.READ_MEDIA_AUDIO", 33), z.a("android.permission.READ_MEDIA_IMAGES", 33), z.a("android.permission.READ_MEDIA_VIDEO", 33), z.a("android.permission.READ_MEDIA_VISUAL_USER_SELECTED", 34), z.a("android.permission.READ_PHONE_NUMBERS", 26), z.a("android.permission.UWB_RANGING", 31));

    private d() {
    }

    private final q7.f i(ReactApplicationContext reactApplicationContext) {
        ComponentCallbacks2 currentActivity = reactApplicationContext.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (currentActivity instanceof q7.f) {
            return (q7.f) currentActivity;
        }
        throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
    }

    private final boolean j(String str) {
        if (r.Q(str, "android.", false, 2, null) || r.Q(str, "com.android", false, 2, null)) {
            int i10 = Build.VERSION.SDK_INT;
            Integer num = (Integer) f47407c.get(str);
            if (i10 >= (num != null ? num.intValue() : 1)) {
                return true;
            }
        }
        return false;
    }

    public static final void o(Promise promise, String str, Object[] args) {
        AbstractC5504s.h(args, "args");
        Object obj = args[0];
        AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.IntArray");
        Object obj2 = args[1];
        AbstractC5504s.f(obj2, "null cannot be cast to non-null type com.facebook.react.modules.core.PermissionAwareActivity");
        q7.f fVar = (q7.f) obj2;
        Integer numH0 = AbstractC2273n.h0((int[]) obj, 0);
        promise.resolve((numH0 != null && numH0.intValue() == 0) ? "granted" : fVar.shouldShowRequestPermissionRationale(str) ? "denied" : "blocked");
    }

    public static final void r(ArrayList arrayList, Promise promise, WritableMap writableMap, Object[] args) {
        AbstractC5504s.h(args, "args");
        int i10 = 0;
        Object obj = args[0];
        AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.IntArray");
        int[] iArr = (int[]) obj;
        Object obj2 = args[1];
        AbstractC5504s.f(obj2, "null cannot be cast to non-null type com.facebook.react.modules.core.PermissionAwareActivity");
        q7.f fVar = (q7.f) obj2;
        for (Object obj3 : arrayList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2279u.w();
            }
            String str = (String) obj3;
            Integer numH0 = AbstractC2273n.h0(iArr, i10);
            writableMap.putString(str, (numH0 != null && numH0.intValue() == 0) ? "granted" : fVar.shouldShowRequestPermissionRationale(str) ? "denied" : "blocked");
            i10 = i11;
        }
        promise.resolve(writableMap);
    }

    public final void c(ReactApplicationContext reactContext, Promise promise) {
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(promise, "promise");
        if (Build.VERSION.SDK_INT < 31) {
            promise.resolve(Boolean.TRUE);
            return;
        }
        Object systemService = reactContext.getSystemService("alarm");
        AlarmManager alarmManager = systemService instanceof AlarmManager ? (AlarmManager) systemService : null;
        promise.resolve(Boolean.valueOf(alarmManager != null ? alarmManager.canScheduleExactAlarms() : false));
    }

    public final void d(ReactApplicationContext reactContext, Promise promise) {
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(promise, "promise");
        if (Build.VERSION.SDK_INT < 34) {
            promise.resolve(Boolean.TRUE);
            return;
        }
        Object systemService = reactContext.getSystemService("notification");
        AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        promise.resolve(Boolean.valueOf(((NotificationManager) systemService).canUseFullScreenIntent()));
    }

    public final void e(ReactApplicationContext reactContext, String permission, Promise promise) {
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(permission, "permission");
        AbstractC5504s.h(promise, "promise");
        if (!j(permission)) {
            promise.resolve("unavailable");
        } else if (reactContext.getBaseContext().checkSelfPermission(permission) == 0) {
            promise.resolve("granted");
        } else {
            promise.resolve("denied");
        }
    }

    public final void f(Promise promise) {
        AbstractC5504s.h(promise, "promise");
        promise.reject("Permissions:checkLocationAccuracy", "checkLocationAccuracy is not supported on Android");
    }

    public final void g(ReactApplicationContext reactContext, ReadableArray permissions, Promise promise) {
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(permissions, "permissions");
        AbstractC5504s.h(promise, "promise");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Context baseContext = reactContext.getBaseContext();
        int size = permissions.size();
        for (int i10 = 0; i10 < size; i10++) {
            String string = permissions.getString(i10);
            if (string != null && !r.l0(string)) {
                writableNativeMap.putString(string, !j(string) ? "unavailable" : baseContext.checkSelfPermission(string) == 0 ? "granted" : "denied");
            }
        }
        promise.resolve(writableNativeMap);
    }

    public final void h(ReactApplicationContext reactContext, Promise promise) {
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(promise, "promise");
        boolean zA = q.i(reactContext).a();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("status", zA ? "granted" : "denied");
        writableMapCreateMap.putMap("settings", Arguments.createMap());
        promise.resolve(writableMapCreateMap);
    }

    public final boolean k(ReactApplicationContext reactContext, SparseArray callbacks, int i10, int[] grantResults) {
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(callbacks, "callbacks");
        AbstractC5504s.h(grantResults, "grantResults");
        try {
            Callback callback = (Callback) callbacks.get(i10);
            if (callback != null) {
                callback.invoke(grantResults, i(reactContext));
                callbacks.remove(i10);
            } else {
                AbstractC7283a.K("PermissionsModule", "Unable to find callback with requestCode %d", Integer.valueOf(i10));
            }
            return callbacks.size() == 0;
        } catch (IllegalStateException e10) {
            AbstractC7283a.p("PermissionsModule", e10, "Unexpected invocation of `onRequestPermissionsResult`", new Object[0]);
            return false;
        }
    }

    public final void l(Promise promise) {
        AbstractC5504s.h(promise, "promise");
        promise.reject("Permissions:openPhotoPicker", "openPhotoPicker is not supported on Android");
    }

    public final void m(ReactApplicationContext reactContext, String str, Promise promise) {
        Intent intent;
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(promise, "promise");
        try {
            String packageName = reactContext.getPackageName();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31 && AbstractC5504s.c(str, "alarms")) {
                intent = new Intent();
                intent.setAction("android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
                intent.setData(Uri.parse("package:" + packageName));
            } else if (i10 >= 34 && AbstractC5504s.c(str, "fullscreen")) {
                intent = new Intent();
                intent.setAction("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent.setData(Uri.parse("package:" + packageName));
            } else if (i10 < 26 || !AbstractC5504s.c(str, "notifications")) {
                intent = new Intent();
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.parse("package:" + packageName));
            } else {
                intent = new Intent();
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", packageName);
            }
            intent.addFlags(268435456);
            reactContext.startActivity(intent);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            promise.reject("E_INVALID_ACTIVITY", e10);
        }
    }

    public final void n(ReactApplicationContext reactContext, g listener, SparseArray callbacks, final String permission, final Promise promise) {
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(listener, "listener");
        AbstractC5504s.h(callbacks, "callbacks");
        AbstractC5504s.h(permission, "permission");
        AbstractC5504s.h(promise, "promise");
        if (!j(permission)) {
            promise.resolve("unavailable");
            return;
        }
        if (reactContext.getBaseContext().checkSelfPermission(permission) == 0) {
            promise.resolve("granted");
            return;
        }
        try {
            q7.f fVarI = i(reactContext);
            callbacks.put(f47406b, new Callback() { // from class: gb.b
                @Override // com.facebook.react.bridge.Callback
                public final void invoke(Object[] objArr) {
                    d.o(promise, permission, objArr);
                }
            });
            fVarI.c(new String[]{permission}, f47406b, listener);
            f47406b++;
        } catch (IllegalStateException e10) {
            promise.reject("E_INVALID_ACTIVITY", e10);
        }
    }

    public final void p(Promise promise) {
        AbstractC5504s.h(promise, "promise");
        promise.reject("Permissions:requestLocationAccuracy", "requestLocationAccuracy is not supported on Android");
    }

    public final void q(ReactApplicationContext reactContext, g listener, SparseArray callbacks, ReadableArray permissions, final Promise promise) {
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(listener, "listener");
        AbstractC5504s.h(callbacks, "callbacks");
        AbstractC5504s.h(permissions, "permissions");
        AbstractC5504s.h(promise, "promise");
        final WritableNativeMap writableNativeMap = new WritableNativeMap();
        final ArrayList arrayList = new ArrayList();
        Context baseContext = reactContext.getBaseContext();
        int size = permissions.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            String string = permissions.getString(i11);
            if (string != null && !r.l0(string)) {
                if (!j(string)) {
                    writableNativeMap.putString(string, "unavailable");
                } else if (baseContext.checkSelfPermission(string) == 0) {
                    writableNativeMap.putString(string, "granted");
                } else {
                    arrayList.add(string);
                }
                i10++;
            }
        }
        if (permissions.size() == i10) {
            promise.resolve(writableNativeMap);
            return;
        }
        try {
            q7.f fVarI = i(reactContext);
            callbacks.put(f47406b, new Callback() { // from class: gb.c
                @Override // com.facebook.react.bridge.Callback
                public final void invoke(Object[] objArr) {
                    d.r(arrayList, promise, writableNativeMap, objArr);
                }
            });
            fVarI.c((String[]) arrayList.toArray(new String[0]), f47406b, listener);
            f47406b++;
        } catch (IllegalStateException e10) {
            promise.reject("E_INVALID_ACTIVITY", e10);
        }
    }

    public final void s(ReactApplicationContext reactContext, Promise promise) {
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(promise, "promise");
        boolean zA = q.i(reactContext).a();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("status", zA ? "granted" : "blocked");
        writableMapCreateMap.putMap("settings", Arguments.createMap());
        promise.resolve(writableMapCreateMap);
    }

    public final void t(ReactApplicationContext reactContext, String permission, Promise promise) {
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(permission, "permission");
        AbstractC5504s.h(promise, "promise");
        try {
            promise.resolve(Boolean.valueOf(i(reactContext).shouldShowRequestPermissionRationale(permission)));
        } catch (IllegalStateException e10) {
            promise.reject("E_INVALID_ACTIVITY", e10);
        }
    }
}
