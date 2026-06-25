package io.invertase.firebase.messaging;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: io.invertase.firebase.messaging.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class C0778a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f48956a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f48956a = iArr;
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48956a[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f48956a[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f48956a[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f48956a[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f48956a[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static WritableArray a(JSONArray jSONArray) throws JSONException {
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
                writableArrayCreateArray.pushMap(b(jSONArray.getJSONObject(i10)));
            } else if (obj instanceof JSONArray) {
                writableArrayCreateArray.pushArray(a(jSONArray.getJSONArray(i10)));
            } else if (obj == JSONObject.NULL) {
                writableArrayCreateArray.pushNull();
            }
        }
        return writableArrayCreateArray;
    }

    public static WritableMap b(JSONObject jSONObject) throws JSONException {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Iterator<String> itKeys = jSONObject.keys();
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
                writableMapCreateMap.putMap(next, b(jSONObject.getJSONObject(next)));
            } else if (obj instanceof JSONArray) {
                writableMapCreateMap.putArray(next, a(jSONObject.getJSONArray(next)));
            } else if (obj == JSONObject.NULL) {
                writableMapCreateMap.putNull(next);
            }
        }
        return writableMapCreateMap;
    }

    public static JSONArray c(ReadableArray readableArray) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            switch (C0778a.f48956a[readableArray.getType(i10).ordinal()]) {
                case 1:
                    jSONArray.put(JSONObject.NULL);
                    break;
                case 2:
                    jSONArray.put(readableArray.getBoolean(i10));
                    break;
                case 3:
                    try {
                        jSONArray.put(readableArray.getInt(i10));
                    } catch (Exception unused) {
                        jSONArray.put(readableArray.getDouble(i10));
                    }
                    break;
                case 4:
                    jSONArray.put(readableArray.getString(i10));
                    break;
                case 5:
                    jSONArray.put(d(readableArray.getMap(i10)));
                    break;
                case 6:
                    jSONArray.put(c(readableArray.getArray(i10)));
                    break;
            }
        }
        return jSONArray;
    }

    public static JSONObject d(ReadableMap readableMap) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            switch (C0778a.f48956a[readableMap.getType(strNextKey).ordinal()]) {
                case 1:
                    jSONObject.put(strNextKey, JSONObject.NULL);
                    break;
                case 2:
                    jSONObject.put(strNextKey, readableMap.getBoolean(strNextKey));
                    break;
                case 3:
                    try {
                        jSONObject.put(strNextKey, readableMap.getInt(strNextKey));
                    } catch (Exception unused) {
                        jSONObject.put(strNextKey, readableMap.getDouble(strNextKey));
                    }
                    break;
                case 4:
                    jSONObject.put(strNextKey, readableMap.getString(strNextKey));
                    break;
                case 5:
                    jSONObject.put(strNextKey, d(readableMap.getMap(strNextKey)));
                    break;
                case 6:
                    jSONObject.put(strNextKey, c(readableMap.getArray(strNextKey)));
                    break;
            }
        }
        return jSONObject;
    }
}
