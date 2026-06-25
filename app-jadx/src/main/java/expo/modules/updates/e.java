package expo.modules.updates;

import Ud.S;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pe.InterfaceC6014d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: c */
    public static final a f46451c = new a(null);

    /* JADX INFO: renamed from: a */
    private final Uri f46452a;

    /* JADX INFO: renamed from: b */
    private final Map f46453b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(JSONObject json) throws JSONException {
            String string;
            JSONObject jSONObject;
            Map mapA;
            AbstractC5504s.h(json, "json");
            boolean zHas = json.has("updateUrl");
            Class cls = Boolean.TYPE;
            Class cls2 = Long.TYPE;
            Class cls3 = Integer.TYPE;
            Class cls4 = Double.TYPE;
            LinkedHashMap linkedHashMap = null;
            if (zHas) {
                InterfaceC6014d interfaceC6014dB = O.b(String.class);
                if (AbstractC5504s.c(interfaceC6014dB, O.b(String.class))) {
                    string = json.getString("updateUrl");
                    if (string == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                } else if (AbstractC5504s.c(interfaceC6014dB, O.b(cls4))) {
                    string = (String) Double.valueOf(json.getDouble("updateUrl"));
                } else if (AbstractC5504s.c(interfaceC6014dB, O.b(cls3))) {
                    string = (String) Integer.valueOf(json.getInt("updateUrl"));
                } else if (AbstractC5504s.c(interfaceC6014dB, O.b(cls2))) {
                    string = (String) Long.valueOf(json.getLong("updateUrl"));
                } else if (AbstractC5504s.c(interfaceC6014dB, O.b(cls))) {
                    string = (String) Boolean.valueOf(json.getBoolean("updateUrl"));
                } else if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONArray.class))) {
                    Object jSONArray = json.getJSONArray("updateUrl");
                    if (jSONArray == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    string = (String) jSONArray;
                } else if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONObject.class))) {
                    Object jSONObject2 = json.getJSONObject("updateUrl");
                    if (jSONObject2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    string = (String) jSONObject2;
                } else {
                    Object obj = json.get("updateUrl");
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    string = (String) obj;
                }
            } else {
                string = null;
            }
            Uri uri = string != null ? Uri.parse(string) : null;
            if (json.has("requestHeaders")) {
                InterfaceC6014d interfaceC6014dB2 = O.b(JSONObject.class);
                if (AbstractC5504s.c(interfaceC6014dB2, O.b(String.class))) {
                    Object string2 = json.getString("requestHeaders");
                    if (string2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject = (JSONObject) string2;
                } else if (AbstractC5504s.c(interfaceC6014dB2, O.b(cls4))) {
                    jSONObject = (JSONObject) Double.valueOf(json.getDouble("requestHeaders"));
                } else if (AbstractC5504s.c(interfaceC6014dB2, O.b(cls3))) {
                    jSONObject = (JSONObject) Integer.valueOf(json.getInt("requestHeaders"));
                } else if (AbstractC5504s.c(interfaceC6014dB2, O.b(cls2))) {
                    jSONObject = (JSONObject) Long.valueOf(json.getLong("requestHeaders"));
                } else if (AbstractC5504s.c(interfaceC6014dB2, O.b(cls))) {
                    jSONObject = (JSONObject) Boolean.valueOf(json.getBoolean("requestHeaders"));
                } else if (AbstractC5504s.c(interfaceC6014dB2, O.b(JSONArray.class))) {
                    Object jSONArray2 = json.getJSONArray("requestHeaders");
                    if (jSONArray2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject = (JSONObject) jSONArray2;
                } else if (AbstractC5504s.c(interfaceC6014dB2, O.b(JSONObject.class))) {
                    jSONObject = json.getJSONObject("requestHeaders");
                    if (jSONObject == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                } else {
                    Object obj2 = json.get("requestHeaders");
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject = (JSONObject) obj2;
                }
            } else {
                jSONObject = null;
            }
            if (jSONObject != null && (mapA = Ac.c.a(jSONObject)) != null) {
                linkedHashMap = new LinkedHashMap(S.e(mapA.size()));
                for (Map.Entry entry : mapA.entrySet()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                }
            }
            return new e(uri, linkedHashMap);
        }

        public final e b(Context context) {
            AbstractC5504s.h(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences("dev.expo.updates.prefs", 0);
            String string = sharedPreferences != null ? sharedPreferences.getString("updatesConfigOverride", null) : null;
            if (string != null) {
                return e.f46451c.a(new JSONObject(string));
            }
            return null;
        }

        public final void c(Context context, e eVar) {
            AbstractC5504s.h(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences("dev.expo.updates.prefs", 0);
            AbstractC5504s.e(sharedPreferences);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (eVar != null) {
                editorEdit.putString("updatesConfigOverride", eVar.e().toString());
            } else {
                editorEdit.remove("updatesConfigOverride");
            }
            editorEdit.apply();
        }

        public final e d(Context context, Map map) {
            AbstractC5504s.h(context, "context");
            e eVarB = b(context);
            if (eVarB == null) {
                eVarB = new e(null, null);
            }
            e eVarB2 = e.b(eVarB, null, map, 1, null);
            e eVar = (eVarB2.d() == null && eVarB2.c() == null) ? null : eVarB2;
            c(context, eVar);
            return eVar;
        }

        private a() {
        }
    }

    public e(Uri uri, Map map) {
        this.f46452a = uri;
        this.f46453b = map;
    }

    public static /* synthetic */ e b(e eVar, Uri uri, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            uri = eVar.f46452a;
        }
        if ((i10 & 2) != 0) {
            map = eVar.f46453b;
        }
        return eVar.a(uri, map);
    }

    public final e a(Uri uri, Map map) {
        return new e(uri, map);
    }

    public final Map c() {
        return this.f46453b;
    }

    public final Uri d() {
        return this.f46452a;
    }

    public final JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Uri uri = this.f46452a;
        if (uri != null) {
            jSONObject.put("updateUrl", uri.toString());
        }
        Map map = this.f46453b;
        if (map != null) {
            jSONObject.put("requestHeaders", new JSONObject(map));
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return AbstractC5504s.c(this.f46452a, eVar.f46452a) && AbstractC5504s.c(this.f46453b, eVar.f46453b);
    }

    public int hashCode() {
        Uri uri = this.f46452a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        Map map = this.f46453b;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "UpdatesConfigurationOverride(updateUrl=" + this.f46452a + ", requestHeaders=" + this.f46453b + ")";
    }
}
