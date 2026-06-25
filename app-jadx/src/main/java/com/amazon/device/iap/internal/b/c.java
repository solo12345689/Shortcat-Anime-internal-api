package com.amazon.device.iap.internal.b;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f35046a = "KEY_TIMESTAMP";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f35047b = "KEY_REQUEST_ID";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f35048c = "KEY_USER_ID";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f35049d = "KEY_RECEIPT_STRING";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f35050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f35051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f35052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f35053h;

    public c(String str, String str2, String str3, long j10) {
        this.f35050e = str;
        this.f35051f = str2;
        this.f35053h = str3;
        this.f35052g = j10;
    }

    public String a() {
        return this.f35050e;
    }

    public String b() {
        return this.f35053h;
    }

    public String c() {
        return this.f35051f;
    }

    public long d() {
        return this.f35052g;
    }

    public String e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f35048c, this.f35050e);
        jSONObject.put(f35049d, this.f35051f);
        jSONObject.put(f35047b, this.f35053h);
        jSONObject.put(f35046a, this.f35052g);
        return jSONObject.toString();
    }

    public static c a(String str) throws b {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new c(jSONObject.getString(f35048c), jSONObject.getString(f35049d), jSONObject.getString(f35047b), jSONObject.getLong(f35046a));
        } catch (Throwable th2) {
            throw new b("Input invalid for PendingReceipt Object:" + str, th2);
        }
    }
}
