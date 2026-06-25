package com.android.billingclient.api;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.android.billingclient.api.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3158c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35402a;

    C3158c(String str) {
        this.f35402a = new JSONObject(str).optString("countryCode");
    }

    public String a() {
        return this.f35402a;
    }
}
