package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C3498j7;
import java.util.Arrays;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class A2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f40607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bundle f40608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f40609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ E2 f40610d;

    public A2(E2 e22, String str, Bundle bundle) {
        Objects.requireNonNull(e22);
        this.f40610d = e22;
        AbstractC2115p.f(str);
        this.f40607a = str;
        this.f40608b = new Bundle();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00fc A[Catch: NumberFormatException | JSONException -> 0x010c, NumberFormatException | JSONException -> 0x010c, TRY_LEAVE, TryCatch #1 {NumberFormatException | JSONException -> 0x010c, blocks: (B:10:0x0027, B:24:0x005b, B:24:0x005b, B:26:0x006c, B:26:0x006c, B:28:0x007e, B:28:0x007e, B:29:0x0087, B:29:0x0087, B:51:0x00fc, B:51:0x00fc, B:33:0x0094, B:33:0x0094, B:35:0x00a5, B:35:0x00a5, B:37:0x00b7, B:37:0x00b7, B:38:0x00c0, B:38:0x00c0, B:42:0x00cc, B:42:0x00cc, B:46:0x00dc, B:46:0x00dc, B:50:0x00f0, B:50:0x00f0), top: B:65:0x0027, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle a() {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.A2.a():android.os.Bundle");
    }

    public final void b(Bundle bundle) {
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        E2 e22 = this.f40610d;
        SharedPreferences.Editor editorEdit = e22.p().edit();
        if (bundle2.size() == 0) {
            editorEdit.remove(this.f40607a);
        } else {
            String str = this.f40607a;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        C3498j7.a();
                        X2 x22 = e22.f40611a;
                        if (x22.w().H(null, AbstractC3789d2.f41176R0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                x22.a().o().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                x22.a().o().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e10) {
                        this.f40610d.f40611a.a().o().b("Cannot serialize bundle value to SharedPreferences", e10);
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f40609c = bundle2;
    }
}
