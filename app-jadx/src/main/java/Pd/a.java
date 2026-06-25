package Pd;

import X9.k;
import android.content.Context;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import io.invertase.firebase.app.ReactNativeFirebaseAppModule;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static Map a(X9.e eVar) {
        String strP = eVar.p();
        X9.k kVarQ = eVar.q();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map3.put("name", strP);
        map3.put("automaticDataCollectionEnabled", Boolean.valueOf(eVar.w()));
        map2.put("apiKey", kVarQ.b());
        map2.put("appId", kVarQ.c());
        map2.put("projectId", kVarQ.g());
        map2.put("databaseURL", kVarQ.d());
        map2.put("measurementId", kVarQ.e());
        map2.put("messagingSenderId", kVarQ.f());
        map2.put("storageBucket", kVarQ.h());
        if (ReactNativeFirebaseAppModule.authDomains.get(strP) != null) {
            map2.put("authDomain", ReactNativeFirebaseAppModule.authDomains.get(strP));
        }
        map.put("options", map2);
        map.put("appConfig", map3);
        return map;
    }

    public static WritableMap b(X9.e eVar) {
        return Arguments.makeNativeMap((Map<String, ? extends Object>) a(eVar));
    }

    public static X9.e c(ReadableMap readableMap, ReadableMap readableMap2, Context context) {
        k.b bVar = new k.b();
        String string = readableMap2.getString("name");
        bVar.b(readableMap.getString("apiKey"));
        bVar.c(readableMap.getString("appId"));
        bVar.g(readableMap.getString("projectId"));
        bVar.d(readableMap.getString("databaseURL"));
        if (readableMap.hasKey("measurementId")) {
            bVar.e(readableMap.getString("measurementId"));
        }
        bVar.h(readableMap.getString("storageBucket"));
        bVar.f(readableMap.getString("messagingSenderId"));
        X9.e eVarU = string.equals("[DEFAULT]") ? X9.e.u(context, bVar.a()) : X9.e.v(context, bVar.a(), string);
        if (readableMap2.hasKey("automaticDataCollectionEnabled")) {
            eVarU.C(Boolean.valueOf(readableMap2.getBoolean("automaticDataCollectionEnabled")));
        }
        if (readableMap2.hasKey("automaticResourceManagement")) {
            eVarU.B(readableMap2.getBoolean("automaticResourceManagement"));
        }
        return eVarU;
    }

    public static WritableMap d(ReadableMap readableMap) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.merge(readableMap);
        return writableMapCreateMap;
    }
}
