package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.android.billingclient.api.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3166k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f35520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f35521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f35522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f35523e;

    C3166k(String str) {
        this.f35519a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f35520b = jSONObject.optString("productId");
        String strOptString = jSONObject.optString("type");
        this.f35521c = strOptString;
        this.f35522d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f35523e = jSONObject.optString("serializedDocid");
    }

    public String a() {
        return this.f35520b;
    }

    public String b() {
        return this.f35521c;
    }

    public String c() {
        return this.f35523e;
    }

    public int d() {
        return this.f35522d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3166k) {
            return TextUtils.equals(this.f35519a, ((C3166k) obj).f35519a);
        }
        return false;
    }

    public int hashCode() {
        return this.f35519a.hashCode();
    }

    public String toString() {
        return "UnfetchedProduct{productId='" + this.f35520b + "', productType='" + this.f35521c + "', statusCode=" + this.f35522d + "}";
    }
}
