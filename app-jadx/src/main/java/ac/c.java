package Ac;

import Cf.i;
import Cf.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    public static final Map a(JSONObject jSONObject) throws JSONException {
        AbstractC5504s.h(jSONObject, "<this>");
        Iterator<String> itKeys = jSONObject.keys();
        AbstractC5504s.g(itKeys, "keys(...)");
        i iVarG = l.g(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : iVarG) {
            Object objA = jSONObject.get((String) obj);
            if (objA instanceof JSONObject) {
                objA = a((JSONObject) objA);
            }
            linkedHashMap.put(obj, objA);
        }
        return linkedHashMap;
    }
}
