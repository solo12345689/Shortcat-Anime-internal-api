package yd;

import Ud.AbstractC2279u;
import Ud.S;
import android.util.Log;
import expo.modules.updates.db.UpdatesDatabase;
import id.C5072d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pe.InterfaceC6014d;
import qd.c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f65039a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f65040b = k.class.getSimpleName();

    private k() {
    }

    private final Map b(JSONObject jSONObject) throws JSONException {
        String string;
        Map mapC = S.c();
        Iterator<String> itKeys = jSONObject.keys();
        AbstractC5504s.g(itKeys, "keys(...)");
        for (String str : Cf.l.g(itKeys)) {
            AbstractC5504s.e(str);
            InterfaceC6014d interfaceC6014dB = O.b(String.class);
            if (AbstractC5504s.c(interfaceC6014dB, O.b(String.class))) {
                string = jSONObject.getString(str);
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (AbstractC5504s.c(interfaceC6014dB, O.b(Double.TYPE))) {
                string = (String) Double.valueOf(jSONObject.getDouble(str));
            } else if (AbstractC5504s.c(interfaceC6014dB, O.b(Integer.TYPE))) {
                string = (String) Integer.valueOf(jSONObject.getInt(str));
            } else if (AbstractC5504s.c(interfaceC6014dB, O.b(Long.TYPE))) {
                string = (String) Long.valueOf(jSONObject.getLong(str));
            } else if (AbstractC5504s.c(interfaceC6014dB, O.b(Boolean.TYPE))) {
                string = (String) Boolean.valueOf(jSONObject.getBoolean(str));
            } else if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONArray.class))) {
                Object jSONArray = jSONObject.getJSONArray(str);
                if (jSONArray == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) jSONArray;
            } else if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONObject.class))) {
                Object jSONObject2 = jSONObject.getJSONObject(str);
                if (jSONObject2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) jSONObject2;
            } else {
                Object obj = jSONObject.get(str);
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) obj;
            }
            mapC.put(str, string);
        }
        return S.b(mapC);
    }

    private final JSONObject e(c.a aVar, UpdatesDatabase updatesDatabase, expo.modules.updates.d dVar) {
        try {
            qd.c cVarP = updatesDatabase.P();
            AbstractC5504s.e(cVarP);
            String strF = cVarP.f(aVar, dVar.s());
            if (strF != null) {
                return new JSONObject(strF);
            }
            return null;
        } catch (Exception e10) {
            Log.e(f65040b, "Error retrieving " + aVar + " from database", e10);
            return null;
        }
    }

    public static final JSONObject g(UpdatesDatabase database, expo.modules.updates.d configuration) {
        AbstractC5504s.h(database, "database");
        AbstractC5504s.h(configuration, "configuration");
        return f65039a.e(c.a.f57926d, database, configuration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(String str, String str2, String str3) {
        Map linkedHashMap;
        Map mapB;
        JSONObject jSONObject = str3 != null ? new JSONObject(str3) : null;
        if (jSONObject == null || (mapB = f65039a.b(jSONObject)) == null || (linkedHashMap = S.B(mapB)) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        if (str != null) {
            linkedHashMap.put(str2, str);
        } else {
            linkedHashMap.remove(str2);
        }
        Map mapY = S.y(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(S.e(mapY.size()));
        for (Map.Entry entry : mapY.entrySet()) {
            linkedHashMap2.put(entry.getKey(), id.o.f((String) entry.getValue()));
        }
        C5072d.f(linkedHashMap2).e();
        String string = new JSONObject(mapY).toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }

    public final void c(UpdatesDatabase database) {
        AbstractC5504s.h(database, "database");
        qd.c cVarP = database.P();
        AbstractC5504s.e(cVarP);
        cVarP.b(AbstractC2279u.p(c.a.f57925c, c.a.f57926d, c.a.f57927e));
    }

    public final Map d(UpdatesDatabase database, expo.modules.updates.d configuration) {
        AbstractC5504s.h(database, "database");
        AbstractC5504s.h(configuration, "configuration");
        JSONObject jSONObjectE = e(c.a.f57925c, database, configuration);
        if (jSONObjectE != null) {
            return b(jSONObjectE);
        }
        return null;
    }

    public final JSONObject f(UpdatesDatabase database, expo.modules.updates.d configuration) {
        AbstractC5504s.h(database, "database");
        AbstractC5504s.h(configuration, "configuration");
        return e(c.a.f57927e, database, configuration);
    }

    public final void h(n responseHeaderData, UpdatesDatabase database, expo.modules.updates.d configuration) {
        AbstractC5504s.h(responseHeaderData, "responseHeaderData");
        AbstractC5504s.h(database, "database");
        AbstractC5504s.h(configuration, "configuration");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (responseHeaderData.f() != null) {
            linkedHashMap.put(c.a.f57926d, String.valueOf(responseHeaderData.f()));
        }
        if (responseHeaderData.d() != null) {
            linkedHashMap.put(c.a.f57927e, String.valueOf(responseHeaderData.d()));
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        qd.c cVarP = database.P();
        AbstractC5504s.e(cVarP);
        cVarP.h(linkedHashMap, configuration.s());
    }

    public final void i(UpdatesDatabase database, expo.modules.updates.d configuration, final String key, final String str) {
        AbstractC5504s.h(database, "database");
        AbstractC5504s.h(configuration, "configuration");
        AbstractC5504s.h(key, "key");
        qd.c cVarP = database.P();
        AbstractC5504s.e(cVarP);
        cVarP.i(c.a.f57925c, configuration.s(), new Function1() { // from class: yd.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k.j(str, key, (String) obj);
            }
        });
    }
}
