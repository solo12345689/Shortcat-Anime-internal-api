package com.revenuecat.purchases.subscriberattributes;

import Td.z;
import Ud.AbstractC2279u;
import Ud.O;
import Ud.S;
import com.revenuecat.purchases.common.BackendKt;
import com.revenuecat.purchases.common.SubscriberAttributeError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;
import oe.C5870f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u0004\u0018\u00010\u0003H\u0000\u001a2\u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00050\u0005*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0005H\u0000¨\u0006\t"}, d2 = {"getAttributeErrors", "", "Lcom/revenuecat/purchases/common/SubscriberAttributeError;", "Lorg/json/JSONObject;", "toBackendMap", "", "", "", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BackendHelpersKt {
    public static final List<SubscriberAttributeError> getAttributeErrors(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return AbstractC2279u.m();
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(BackendKt.ATTRIBUTES_ERROR_RESPONSE_KEY);
        if (jSONObjectOptJSONObject != null) {
            jSONObject = jSONObjectOptJSONObject;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(BackendKt.ATTRIBUTE_ERRORS_KEY);
        if (jSONArrayOptJSONArray != null) {
            C5870f c5870fX = AbstractC5874j.x(0, jSONArrayOptJSONArray.length());
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(c5870fX, 10));
            Iterator it = c5870fX.iterator();
            while (it.hasNext()) {
                arrayList.add(jSONArrayOptJSONArray.getJSONObject(((O) it).nextInt()));
            }
            ArrayList<JSONObject> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2.has("key_name") && jSONObject2.has("message")) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(AbstractC2279u.x(arrayList2, 10));
            for (JSONObject jSONObject3 : arrayList2) {
                String string = jSONObject3.getString("key_name");
                AbstractC5504s.g(string, "it.getString(\"key_name\")");
                String string2 = jSONObject3.getString("message");
                AbstractC5504s.g(string2, "it.getString(\"message\")");
                arrayList3.add(new SubscriberAttributeError(string, string2));
            }
            List<SubscriberAttributeError> listB1 = AbstractC2279u.b1(arrayList3);
            if (listB1 != null) {
                return listB1;
            }
        }
        return AbstractC2279u.m();
    }

    public static final Map<String, Map<String, Object>> toBackendMap(Map<String, SubscriberAttribute> map) {
        AbstractC5504s.h(map, "<this>");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, SubscriberAttribute> entry : map.entrySet()) {
            arrayList.add(z.a(entry.getKey(), entry.getValue().toBackendMap()));
        }
        return S.w(arrayList);
    }
}
