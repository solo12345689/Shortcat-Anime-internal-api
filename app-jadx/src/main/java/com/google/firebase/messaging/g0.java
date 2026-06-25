package com.google.firebase.messaging;

import R8.AbstractC2113n;
import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f43447d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f43449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f43450c;

    private g0(String str, String str2) {
        this.f43448a = d(str2, str);
        this.f43449b = str;
        this.f43450c = str + "!" + str2;
    }

    static g0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("!", -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new g0(strArrSplit[0], strArrSplit[1]);
    }

    private static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f43447d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public static g0 f(String str) {
        return new g0("S", str);
    }

    public static g0 g(String str) {
        return new g0("U", str);
    }

    public String b() {
        return this.f43449b;
    }

    public String c() {
        return this.f43448a;
    }

    public String e() {
        return this.f43450c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f43448a.equals(g0Var.f43448a) && this.f43449b.equals(g0Var.f43449b);
    }

    public int hashCode() {
        return AbstractC2113n.b(this.f43449b, this.f43448a);
    }
}
