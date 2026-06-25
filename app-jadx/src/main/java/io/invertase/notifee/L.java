package io.invertase.notifee;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.AbstractC2857k;
import androidx.lifecycle.ProcessLifecycleOwner;
import app.notifee.core.EventSubscriber;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import io.invertase.notifee.C5102b;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
abstract class L {

    /* JADX INFO: renamed from: a */
    public static final C5102b f48988a = new C5102b();

    static void a() {
        try {
            Object systemService = EventSubscriber.getContext().getSystemService("statusbar");
            Method method = Class.forName("android.app.StatusBarManager").getMethod("collapsePanels", null);
            method.setAccessible(true);
            method.invoke(systemService, null);
        } catch (Exception e10) {
            Log.e("HIDE_NOTIF_DRAWER", "", e10);
        }
    }

    static boolean b() {
        return ProcessLifecycleOwner.l().getLifecycle().getCurrentState().b(AbstractC2857k.b.f30239e);
    }

    public static void c(Promise promise, Exception exc, Boolean bool) {
        if (exc != null) {
            promise.reject(exc);
        } else {
            promise.resolve(bool);
        }
    }

    public static void d(Promise promise, Exception exc) {
        if (exc != null) {
            promise.reject(exc);
        } else {
            promise.resolve(null);
        }
    }

    public static void e(Promise promise, Exception exc, Bundle bundle) {
        if (exc != null) {
            promise.reject(exc);
        } else if (bundle != null) {
            promise.resolve(Arguments.fromBundle(bundle));
        } else {
            promise.resolve(null);
        }
    }

    public static void f(Promise promise, Exception exc, List list) {
        if (exc != null) {
            promise.reject(exc);
            return;
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushMap(Arguments.fromBundle((Bundle) it.next()));
        }
        promise.resolve(writableArrayCreateArray);
    }

    public static void g(Promise promise, Exception exc, List list) {
        if (exc != null) {
            promise.reject(exc);
            return;
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushString((String) it.next());
        }
        promise.resolve(writableArrayCreateArray);
    }

    static void h(String str, WritableMap writableMap) {
        try {
            ReactContext reactContextH = C5102b.h(EventSubscriber.getContext());
            if (reactContextH != null && reactContextH.hasActiveCatalystInstance()) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContextH.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
            }
        } catch (Exception e10) {
            Log.e("SEND_EVENT", "", e10);
        }
    }

    static void i(String str, WritableMap writableMap, long j10, C5102b.d dVar) {
        f48988a.o(EventSubscriber.getContext(), new C5102b.e(str, j10, writableMap, dVar));
    }
}
