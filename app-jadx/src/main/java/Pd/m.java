package Pd;

import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m {
    public static void a(Object obj, WritableArray writableArray) {
        if (obj == null || obj == JSONObject.NULL) {
            writableArray.pushNull();
            return;
        }
        String name = obj.getClass().getName();
        if (name.equals("java.lang.Integer")) {
            writableArray.pushInt(((Integer) obj).intValue());
            return;
        }
        if (name.equals("java.lang.Float")) {
            writableArray.pushDouble(((Float) obj).floatValue());
            return;
        }
        if (name.equals("org.json.JSONArray$1")) {
            try {
                writableArray.pushArray(d((JSONArray) obj));
                return;
            } catch (JSONException unused) {
                writableArray.pushNull();
                return;
            }
        }
        if (name.equals("java.lang.Boolean")) {
            writableArray.pushBoolean(((Boolean) obj).booleanValue());
            return;
        }
        if (name.equals("java.lang.Long")) {
            writableArray.pushDouble(((Long) obj).longValue());
            return;
        }
        if (name.equals("java.lang.Double")) {
            writableArray.pushDouble(((Double) obj).doubleValue());
            return;
        }
        if (name.equals("java.lang.String")) {
            writableArray.pushString((String) obj);
            return;
        }
        if (name.equals("org.json.JSONObject$1")) {
            try {
                writableArray.pushMap(e((JSONObject) obj));
            } catch (JSONException unused2) {
                writableArray.pushNull();
            }
        } else {
            if (List.class.isAssignableFrom(obj.getClass())) {
                writableArray.pushArray(f((List) obj));
                return;
            }
            if (Map.class.isAssignableFrom(obj.getClass())) {
                writableArray.pushMap(h((Map) obj));
                return;
            }
            Log.d("Utils", "utils:arrayPushValue:unknownType:" + name);
            writableArray.pushNull();
        }
    }

    public static WritableMap b(Exception exc) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String message = exc.getMessage();
        writableMapCreateMap.putString("code", "unknown");
        writableMapCreateMap.putString("nativeErrorCode", "unknown");
        writableMapCreateMap.putString("message", message);
        writableMapCreateMap.putString("nativeErrorMessage", message);
        return writableMapCreateMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(android.content.Context r6) {
        /*
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            java.util.List r2 = r0.getRunningAppProcesses()
            if (r2 != 0) goto L13
            return r1
        L13:
            Pd.i r3 = Pd.i.g()
            java.lang.String r4 = "android_background_activity_names"
            boolean r5 = r3.a(r4)
            if (r5 == 0) goto L5c
            java.util.ArrayList r3 = r3.c(r4)
            int r4 = r3.size()
            if (r4 == 0) goto L5c
            java.util.List r0 = r0.getAppTasks()
            int r4 = r0.size()
            java.lang.String r5 = ""
            if (r4 <= 0) goto L4e
            java.lang.Object r0 = r0.get(r1)
            android.app.ActivityManager$AppTask r0 = (android.app.ActivityManager.AppTask) r0
            android.app.ActivityManager$RecentTaskInfo r0 = r0.getTaskInfo()
            android.content.ComponentName r4 = Pd.l.a(r0)
            if (r4 == 0) goto L4e
            android.content.ComponentName r0 = Pd.l.a(r0)
            java.lang.String r0 = r0.getShortClassName()
            goto L4f
        L4e:
            r0 = r5
        L4f:
            boolean r4 = r5.equals(r0)
            if (r4 != 0) goto L5c
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L5c
            return r1
        L5c:
            java.lang.String r0 = r6.getPackageName()
            java.util.Iterator r2 = r2.iterator()
        L64:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L8c
            java.lang.Object r3 = r2.next()
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3
            int r4 = r3.importance
            r5 = 100
            if (r4 != r5) goto L64
            java.lang.String r3 = r3.processName
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L64
            r0 = 1
            com.facebook.react.bridge.ReactContext r6 = (com.facebook.react.bridge.ReactContext) r6     // Catch: java.lang.ClassCastException -> L8b
            com.facebook.react.common.LifecycleState r6 = r6.getLifecycleState()
            com.facebook.react.common.LifecycleState r2 = com.facebook.react.common.LifecycleState.f36552c
            if (r6 != r2) goto L8a
            return r0
        L8a:
            return r1
        L8b:
            return r0
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Pd.m.c(android.content.Context):boolean");
    }

    public static WritableArray d(JSONArray jSONArray) throws JSONException {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                writableArrayCreateArray.pushDouble(jSONArray.getDouble(i10));
            } else if (obj instanceof Number) {
                writableArrayCreateArray.pushInt(jSONArray.getInt(i10));
            } else if (obj instanceof String) {
                writableArrayCreateArray.pushString(jSONArray.getString(i10));
            } else if (obj instanceof JSONObject) {
                writableArrayCreateArray.pushMap(e(jSONArray.getJSONObject(i10)));
            } else if (obj instanceof JSONArray) {
                writableArrayCreateArray.pushArray(d(jSONArray.getJSONArray(i10)));
            } else if (obj == JSONObject.NULL) {
                writableArrayCreateArray.pushNull();
            }
        }
        return writableArrayCreateArray;
    }

    public static WritableMap e(JSONObject jSONObject) throws JSONException {
        Iterator<String> itKeys = jSONObject.keys();
        WritableMap writableMapCreateMap = Arguments.createMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                writableMapCreateMap.putDouble(next, jSONObject.getDouble(next));
            } else if (obj instanceof Number) {
                writableMapCreateMap.putInt(next, jSONObject.getInt(next));
            } else if (obj instanceof String) {
                writableMapCreateMap.putString(next, jSONObject.getString(next));
            } else if (obj instanceof JSONObject) {
                writableMapCreateMap.putMap(next, e(jSONObject.getJSONObject(next)));
            } else if (obj instanceof JSONArray) {
                writableMapCreateMap.putArray(next, d(jSONObject.getJSONArray(next)));
            } else if (obj == JSONObject.NULL) {
                writableMapCreateMap.putNull(next);
            }
        }
        return writableMapCreateMap;
    }

    private static WritableArray f(List list) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a(it.next(), writableArrayCreateArray);
        }
        return writableArrayCreateArray;
    }

    public static void g(String str, Object obj, WritableMap writableMap) {
        if (obj == null || obj == JSONObject.NULL) {
            writableMap.putNull(str);
            return;
        }
        String name = obj.getClass().getName();
        if (name.equals("java.lang.Integer")) {
            writableMap.putInt(str, ((Integer) obj).intValue());
            return;
        }
        if (name.equals("java.lang.Float")) {
            writableMap.putDouble(str, ((Float) obj).floatValue());
            return;
        }
        if (name.equals("org.json.JSONArray$1")) {
            try {
                writableMap.putArray(str, d((JSONArray) obj));
                return;
            } catch (JSONException unused) {
                writableMap.putNull(str);
                return;
            }
        }
        if (name.equals("java.lang.Boolean")) {
            writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (name.equals("java.lang.Long")) {
            writableMap.putDouble(str, ((Long) obj).longValue());
            return;
        }
        if (name.equals("java.lang.Double")) {
            writableMap.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (name.equals("java.lang.String")) {
            writableMap.putString(str, (String) obj);
            return;
        }
        if (name.equals("org.json.JSONObject$1")) {
            try {
                writableMap.putMap(str, e((JSONObject) obj));
            } catch (JSONException unused2) {
                writableMap.putNull(str);
            }
        } else {
            if (List.class.isAssignableFrom(obj.getClass())) {
                writableMap.putArray(str, f((List) obj));
                return;
            }
            if (Map.class.isAssignableFrom(obj.getClass())) {
                writableMap.putMap(str, h((Map) obj));
                return;
            }
            Log.d("Utils", "utils:mapPutValue:unknownType:" + name);
            writableMap.putNull(str);
        }
    }

    public static WritableMap h(Map map) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        for (Map.Entry entry : map.entrySet()) {
            g((String) entry.getKey(), entry.getValue(), writableMapCreateMap);
        }
        return writableMapCreateMap;
    }
}
