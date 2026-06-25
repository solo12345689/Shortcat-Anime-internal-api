package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class Purchase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f35311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f35312c;

    public Purchase(String str, String str2) {
        this.f35310a = str;
        this.f35311b = str2;
        this.f35312c = new JSONObject(str);
    }

    private final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f35312c;
        if (jSONObject.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i10));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }

    public String a() {
        String strOptString = this.f35312c.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        return strOptString;
    }

    public String b() {
        return this.f35310a;
    }

    public List c() {
        return j();
    }

    public int d() {
        return this.f35312c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public long e() {
        return this.f35312c.optLong("purchaseTime");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f35310a, purchase.b()) && TextUtils.equals(this.f35311b, purchase.g());
    }

    public String f() {
        JSONObject jSONObject = this.f35312c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public String g() {
        return this.f35311b;
    }

    public boolean h() {
        return this.f35312c.optBoolean("acknowledged", true);
    }

    public int hashCode() {
        return this.f35310a.hashCode();
    }

    public boolean i() {
        return this.f35312c.optBoolean("autoRenewing");
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f35310a));
    }
}
