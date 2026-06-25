package com.amazon.device.iap.internal.c;

import com.amazon.device.iap.model.Promotion;
import com.amazon.device.iap.model.PromotionPlan;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class a {
    a() {
    }

    static List<Promotion> a(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray(com.amazon.a.a.o.b.f34659q);
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(b(jSONArray.getJSONObject(i10)));
        }
        return arrayList;
    }

    private static Promotion b(JSONObject jSONObject) {
        return new Promotion(jSONObject.getString(com.amazon.a.a.o.b.f34660r), a(jSONObject.getJSONArray(com.amazon.a.a.o.b.f34661s)));
    }

    private static PromotionPlan c(JSONObject jSONObject) throws JSONException {
        String str;
        String string = jSONObject.getString(com.amazon.a.a.o.b.f34662t);
        int i10 = jSONObject.getInt(com.amazon.a.a.o.b.f34663u);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(com.amazon.a.a.o.b.f34665w);
        if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject == JSONObject.NULL) {
            str = null;
        } else {
            Currency currency = Currency.getInstance(jSONObjectOptJSONObject.optString(com.amazon.a.a.o.b.f34634a));
            str = currency.getSymbol() + jSONObjectOptJSONObject.optString("value");
        }
        return new PromotionPlan(string, str, i10);
    }

    private static List<PromotionPlan> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(c(jSONArray.getJSONObject(i10)));
        }
        return arrayList;
    }
}
