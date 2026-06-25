package com.google.android.gms.measurement.internal;

import P9.AbstractC2011u;
import R8.AbstractC2115p;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class O5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f40893a;

    O5(Map map) {
        HashMap map2 = new HashMap();
        this.f40893a = map2;
        map2.putAll(map);
    }

    private final Bundle f() {
        int iG;
        Map map = this.f40893a;
        if ("1".equals(map.get("GoogleConsent")) && (iG = g()) >= 0) {
            String str = (String) map.get("PurposeConsents");
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle = new Bundle();
                String str2 = "denied";
                if (str.length() > 0) {
                    bundle.putString(j9.v.AD_STORAGE.f51715a, str.charAt(0) == '1' ? "granted" : "denied");
                }
                if (str.length() > 3) {
                    bundle.putString(j9.v.AD_PERSONALIZATION.f51715a, (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
                }
                if (str.length() > 6 && iG >= 4) {
                    String str3 = j9.v.AD_USER_DATA.f51715a;
                    if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                        str2 = "granted";
                    }
                    bundle.putString(str3, str2);
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    private final int g() {
        try {
            String str = (String) this.f40893a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    final String a() {
        StringBuilder sb2 = new StringBuilder();
        AbstractC2011u abstractC2011u = Q5.f40927a;
        int size = abstractC2011u.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = (String) abstractC2011u.get(i10);
            Map map = this.f40893a;
            if (map.containsKey(str)) {
                if (sb2.length() > 0) {
                    sb2.append(";");
                }
                sb2.append(str);
                sb2.append(com.amazon.a.a.o.b.f.f34695b);
                sb2.append((String) map.get(str));
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle b() {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.O5.b():android.os.Bundle");
    }

    public final String c() {
        String str = (String) this.f40893a.get("PurposeDiagnostics");
        return TextUtils.isEmpty(str) ? "200000" : str;
    }

    public final String d(O5 o52) {
        Map map = o52.f40893a;
        String str = (map.isEmpty() || ((String) map.get("Version")) != null) ? "0" : "1";
        Bundle bundleB = b();
        Bundle bundleB2 = o52.b();
        return str.concat((bundleB.size() == bundleB2.size() && Objects.equals(bundleB.getString("ad_storage"), bundleB2.getString("ad_storage")) && Objects.equals(bundleB.getString("ad_personalization"), bundleB2.getString("ad_personalization")) && Objects.equals(bundleB.getString("ad_user_data"), bundleB2.getString("ad_user_data"))) ? "0" : "1");
    }

    public final String e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("1");
        int i10 = -1;
        try {
            String str = (String) this.f40893a.get("CmpSdkID");
            if (!TextUtils.isEmpty(str)) {
                i10 = Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        if (i10 < 0 || i10 > 4095) {
            sb2.append("00");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 >> 6));
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 & 63));
        }
        int iG = g();
        if (iG < 0 || iG > 63) {
            sb2.append("0");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iG));
        }
        AbstractC2115p.a(true);
        Map map = this.f40893a;
        int i11 = true != "1".equals(map.get("gdprApplies")) ? 0 : 2;
        boolean zEquals = "1".equals(map.get("EnableAdvertiserConsentMode"));
        int i12 = i11 | 4;
        if (zEquals) {
            i12 = i11 | 12;
        }
        sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i12));
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof O5) {
            return a().equalsIgnoreCase(((O5) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }
}
