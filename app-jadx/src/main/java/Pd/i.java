package Pd;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: b */
    private static i f13815b = new i();

    /* JADX INFO: renamed from: a */
    private JSONObject f13816a;

    private i() {
        try {
            this.f13816a = new JSONObject("{}");
        } catch (JSONException unused) {
        }
    }

    public static i g() {
        return f13815b;
    }

    public boolean a(String str) {
        JSONObject jSONObject = this.f13816a;
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.has(str);
    }

    public WritableMap b() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        JSONArray jSONArrayNames = this.f13816a.names();
        for (int i10 = 0; i10 < jSONArrayNames.length(); i10++) {
            try {
                String string = jSONArrayNames.getString(i10);
                m.g(string, this.f13816a.get(string), writableMapCreateMap);
            } catch (JSONException unused) {
            }
        }
        return writableMapCreateMap;
    }

    public ArrayList c(String str) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f13816a;
        if (jSONObject != null) {
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
                if (jSONArrayOptJSONArray != null) {
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        arrayList.add(jSONArrayOptJSONArray.getString(i10));
                    }
                }
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    public int d(String str, int i10) {
        JSONObject jSONObject = this.f13816a;
        return jSONObject == null ? i10 : jSONObject.optInt(str, i10);
    }

    public long e(String str, long j10) {
        JSONObject jSONObject = this.f13816a;
        return jSONObject == null ? j10 : jSONObject.optLong(str, j10);
    }

    public String f() {
        return "{}";
    }
}
