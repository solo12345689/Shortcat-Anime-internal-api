package com.google.android.gms.measurement.internal;

import P9.AbstractC2011u;
import P9.AbstractC2012v;
import P9.AbstractC2013w;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.EnumC3566r4;
import com.google.android.gms.internal.measurement.EnumC3575s4;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final AbstractC2011u f40927a = AbstractC2011u.K("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    static int b(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    static final boolean c(EnumC3566r4 enumC3566r4, AbstractC2012v abstractC2012v, AbstractC2012v abstractC2012v2, AbstractC2013w abstractC2013w, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        int i15;
        int i16;
        AbstractC2013w abstractC2013w2;
        String str4;
        P5 p52;
        char c10;
        int iE = e(enumC3566r4, abstractC2012v, abstractC2012v2, abstractC2013w, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (iE > 0) {
            i16 = i12;
            if (i16 == 1) {
                i15 = i11;
                if (i15 != 1) {
                    i16 = 1;
                } else {
                    i15 = 1;
                    i16 = 1;
                }
            } else {
                i15 = i11;
            }
            cArr[iE] = '2';
        } else {
            i15 = i11;
            i16 = i12;
        }
        if (i(enumC3566r4, abstractC2012v, abstractC2012v2, abstractC2013w, cArr, i10, i15, i16, i13, i14, str, str2, str3, z10, z11, true) == EnumC3575s4.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c10 = '3';
        } else {
            int i17 = i14;
            if (enumC3566r4 == EnumC3566r4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
                abstractC2013w2 = abstractC2013w;
                str4 = str;
                if (i17 == 1) {
                    if (abstractC2013w2.contains(str4)) {
                        if (iE > 0 && cArr[iE] != '2') {
                            cArr[iE] = '1';
                        }
                        return true;
                    }
                    i17 = 1;
                }
            } else {
                abstractC2013w2 = abstractC2013w;
                str4 = str;
            }
            if (abstractC2012v.containsKey(enumC3566r4) && (p52 = (P5) abstractC2012v.get(enumC3566r4)) != null) {
                int iOrdinal = p52.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return i(enumC3566r4, abstractC2012v, abstractC2012v2, abstractC2013w, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) == EnumC3575s4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? h(enumC3566r4, abstractC2012v, abstractC2012v2, abstractC2013w, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) : g(enumC3566r4, abstractC2012v, abstractC2012v2, abstractC2013w, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                        }
                        if (iOrdinal == 3) {
                            return i(enumC3566r4, abstractC2012v, abstractC2012v2, abstractC2013w2, cArr, i10, i15, i16, i13, i17, str4, str2, str3, z10, z11, true) == EnumC3575s4.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? g(enumC3566r4, abstractC2012v, abstractC2012v2, abstractC2013w, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) : h(enumC3566r4, abstractC2012v, abstractC2012v2, abstractC2013w, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                        }
                        c10 = '0';
                    } else if (i(enumC3566r4, abstractC2012v, abstractC2012v2, abstractC2013w, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) != EnumC3575s4.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return h(enumC3566r4, abstractC2012v, abstractC2012v2, abstractC2013w, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                    }
                } else if (i(enumC3566r4, abstractC2012v, abstractC2012v2, abstractC2013w, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) != EnumC3575s4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return g(enumC3566r4, abstractC2012v, abstractC2012v2, abstractC2013w, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                }
                c10 = '8';
            } else {
                c10 = '0';
            }
        }
        if (iE <= 0 || cArr[iE] == '2') {
            return false;
        }
        cArr[iE] = c10;
        return false;
    }

    public static final Map d(AbstractC2012v abstractC2012v, AbstractC2012v abstractC2012v2, AbstractC2013w abstractC2013w, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        if (!z12) {
            return AbstractC2012v.k();
        }
        EnumC3566r4 enumC3566r4 = EnumC3566r4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        EnumC3575s4 enumC3575s4 = (EnumC3575s4) abstractC2012v2.get(enumC3566r4);
        EnumC3566r4 enumC3566r42 = EnumC3566r4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        EnumC3575s4 enumC3575s42 = (EnumC3575s4) abstractC2012v2.get(enumC3566r42);
        EnumC3566r4 enumC3566r43 = EnumC3566r4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        EnumC3575s4 enumC3575s43 = (EnumC3575s4) abstractC2012v2.get(enumC3566r43);
        EnumC3566r4 enumC3566r44 = EnumC3566r4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        EnumC3575s4 enumC3575s44 = (EnumC3575s4) abstractC2012v2.get(enumC3566r44);
        return AbstractC2012v.a().f("Version", "2").f("VendorConsent", true != z10 ? "0" : "1").f("VendorLegitimateInterest", true != z11 ? "0" : "1").f("gdprApplies", i12 != 1 ? "0" : "1").f("EnableAdvertiserConsentMode", i11 != 1 ? "0" : "1").f("PolicyVersion", String.valueOf(i13)).f("CmpSdkID", String.valueOf(i10)).f("PurposeOneTreatment", i14 != 1 ? "0" : "1").f("PublisherCC", str).f("PublisherRestrictions1", String.valueOf(enumC3575s4 != null ? enumC3575s4.zza() : EnumC3575s4.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions3", String.valueOf(enumC3575s42 != null ? enumC3575s42.zza() : EnumC3575s4.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions4", String.valueOf(enumC3575s43 != null ? enumC3575s43.zza() : EnumC3575s4.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions7", String.valueOf(enumC3575s44 != null ? enumC3575s44.zza() : EnumC3575s4.PURPOSE_RESTRICTION_UNDEFINED.zza())).i(AbstractC2012v.l("Purpose1", f(enumC3566r4, abstractC2012v, abstractC2012v2, abstractC2013w, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose3", f(enumC3566r42, abstractC2012v, abstractC2012v2, abstractC2013w, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose4", f(enumC3566r43, abstractC2012v, abstractC2012v2, abstractC2013w, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose7", f(enumC3566r44, abstractC2012v, abstractC2012v2, abstractC2013w, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true))).i(AbstractC2012v.m("AuthorizePurpose1", true != c(enumC3566r4, abstractC2012v, abstractC2012v2, abstractC2013w, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "0" : "1", "AuthorizePurpose3", true != c(enumC3566r42, abstractC2012v, abstractC2012v2, abstractC2013w, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "0" : "1", "AuthorizePurpose4", true != c(enumC3566r43, abstractC2012v, abstractC2012v2, abstractC2013w, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "0" : "1", "AuthorizePurpose7", true != c(enumC3566r44, abstractC2012v, abstractC2012v2, abstractC2013w, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "0" : "1", "PurposeDiagnostics", new String(cArr))).c();
    }

    private static final int e(EnumC3566r4 enumC3566r4, AbstractC2012v abstractC2012v, AbstractC2012v abstractC2012v2, AbstractC2013w abstractC2013w, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        if (enumC3566r4 == EnumC3566r4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (enumC3566r4 == EnumC3566r4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (enumC3566r4 == EnumC3566r4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return enumC3566r4 == EnumC3566r4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    private static final String f(EnumC3566r4 enumC3566r4, AbstractC2012v abstractC2012v, AbstractC2012v abstractC2012v2, AbstractC2013w abstractC2013w, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str2) || str2.length() < enumC3566r4.zza()) ? "0" : String.valueOf(str2.charAt(enumC3566r4.zza() - 1));
        if (!TextUtils.isEmpty(str3) && str3.length() >= enumC3566r4.zza()) {
            strValueOf = String.valueOf(str3.charAt(enumC3566r4.zza() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    private static final boolean g(EnumC3566r4 enumC3566r4, AbstractC2012v abstractC2012v, AbstractC2012v abstractC2012v2, AbstractC2013w abstractC2013w, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        char c10;
        int iE = e(enumC3566r4, abstractC2012v, abstractC2012v2, abstractC2013w, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (!z10) {
            c10 = '4';
        } else {
            if (str2.length() >= enumC3566r4.zza()) {
                char cCharAt = str2.charAt(enumC3566r4.zza() - 1);
                boolean z13 = cCharAt == '1';
                if (iE > 0 && cArr[iE] != '2') {
                    cArr[iE] = cCharAt != '1' ? '6' : '1';
                }
                return z13;
            }
            c10 = '0';
        }
        if (iE > 0 && cArr[iE] != '2') {
            cArr[iE] = c10;
        }
        return false;
    }

    private static final boolean h(EnumC3566r4 enumC3566r4, AbstractC2012v abstractC2012v, AbstractC2012v abstractC2012v2, AbstractC2013w abstractC2013w, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        char c10;
        int iE = e(enumC3566r4, abstractC2012v, abstractC2012v2, abstractC2013w, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (!z11) {
            c10 = '5';
        } else {
            if (str3.length() >= enumC3566r4.zza()) {
                char cCharAt = str3.charAt(enumC3566r4.zza() - 1);
                boolean z13 = cCharAt == '1';
                if (iE > 0 && cArr[iE] != '2') {
                    cArr[iE] = cCharAt != '1' ? '7' : '1';
                }
                return z13;
            }
            c10 = '0';
        }
        if (iE > 0 && cArr[iE] != '2') {
            cArr[iE] = c10;
        }
        return false;
    }

    private static final EnumC3575s4 i(EnumC3566r4 enumC3566r4, AbstractC2012v abstractC2012v, AbstractC2012v abstractC2012v2, AbstractC2013w abstractC2013w, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        return (EnumC3575s4) abstractC2012v2.getOrDefault(enumC3566r4, EnumC3575s4.PURPOSE_RESTRICTION_UNDEFINED);
    }
}
