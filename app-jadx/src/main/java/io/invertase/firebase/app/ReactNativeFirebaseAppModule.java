package io.invertase.firebase.app;

import Pd.g;
import Pd.i;
import Pd.j;
import Pd.k;
import X9.e;
import android.util.Log;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class ReactNativeFirebaseAppModule extends ReactNativeFirebaseModule {
    private static final String TAG = "App";
    public static Map<String, String> authDomains = new HashMap();

    ReactNativeFirebaseAppModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
    }

    public static void configureAuthDomain(String str, String str2) {
        if (str2 == null) {
            authDomains.remove(str);
            return;
        }
        Log.d(TAG, str + " custom authDomain " + str2);
        authDomains.put(str, str2);
    }

    @ReactMethod
    public void deleteApp(String str, Promise promise) {
        e eVarO = e.o(str);
        if (eVarO != null) {
            eVarO.i();
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void eventsAddListener(String str) {
        g.i().e(str);
    }

    @ReactMethod
    public void eventsGetListeners(Promise promise) {
        promise.resolve(g.i().h());
    }

    @ReactMethod
    public void eventsNotifyReady(Boolean bool) {
        g.i().m(bool);
    }

    @ReactMethod
    public void eventsPing(String str, ReadableMap readableMap, Promise promise) {
        g.i().o(new Pd.b(str, Pd.a.d(readableMap)));
        promise.resolve(Pd.a.d(readableMap));
    }

    @ReactMethod
    public void eventsRemoveListener(String str, Boolean bool) {
        g.i().n(str, bool);
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = e.m(getReactApplicationContext()).iterator();
        while (it.hasNext()) {
            arrayList.add(Pd.a.a((e) it.next()));
        }
        map.put("NATIVE_FIREBASE_APPS", arrayList);
        map.put("FIREBASE_RAW_JSON", i.g().f());
        return map;
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        g.i().f(getContext());
    }

    @ReactMethod
    public void initializeApp(ReadableMap readableMap, ReadableMap readableMap2, Promise promise) {
        e eVarC = Pd.a.c(readableMap, readableMap2, getContext());
        configureAuthDomain(readableMap2.getString("name"), readableMap.getString("authDomain"));
        promise.resolve(Pd.a.b(eVarC));
    }

    @ReactMethod
    public void jsonGetAll(Promise promise) {
        promise.resolve(i.g().b());
    }

    @ReactMethod
    public void metaGetAll(Promise promise) {
        promise.resolve(j.c().a());
    }

    @ReactMethod
    public void preferencesClearAll(Promise promise) {
        k.d().a();
        promise.resolve(null);
    }

    @ReactMethod
    public void preferencesGetAll(Promise promise) {
        promise.resolve(k.d().b());
    }

    @ReactMethod
    public void preferencesSetBool(String str, boolean z10, Promise promise) {
        k.d().e(str, z10);
        promise.resolve(null);
    }

    @ReactMethod
    public void preferencesSetString(String str, String str2, Promise promise) {
        k.d().f(str, str2);
        promise.resolve(null);
    }

    @ReactMethod
    public void setAutomaticDataCollectionEnabled(String str, Boolean bool) {
        e.o(str).C(bool);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }
}
