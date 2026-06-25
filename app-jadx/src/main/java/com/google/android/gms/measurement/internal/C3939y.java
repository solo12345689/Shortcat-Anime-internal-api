package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.revenuecat.purchases.common.Constants;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3939y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C3939y f41778f = new C3939y((Boolean) null, 100, (Boolean) null, (String) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f41780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Boolean f41781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f41782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EnumMap f41783e;

    C3939y(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(j9.v.class);
        this.f41783e = enumMap;
        enumMap.put(j9.v.AD_USER_DATA, E3.h(bool));
        this.f41779a = i10;
        this.f41780b = l();
        this.f41781c = bool2;
        this.f41782d = str;
    }

    static C3939y a(j9.u uVar, int i10) {
        EnumMap enumMap = new EnumMap(j9.v.class);
        enumMap.put(j9.v.AD_USER_DATA, uVar);
        return new C3939y(enumMap, -10, (Boolean) null, (String) null);
    }

    public static C3939y g(String str) {
        if (str == null || str.length() <= 0) {
            return f41778f;
        }
        String[] strArrSplit = str.split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        int i10 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(j9.v.class);
        j9.v[] vVarArrA = D3.DMA.a();
        int length = vVarArrA.length;
        int i11 = 1;
        int i12 = 0;
        while (i12 < length) {
            enumMap.put(vVarArrA[i12], E3.j(strArrSplit[i11].charAt(0)));
            i12++;
            i11++;
        }
        return new C3939y(enumMap, i10, (Boolean) null, (String) null);
    }

    public static C3939y h(Bundle bundle, int i10) {
        if (bundle == null) {
            return new C3939y((Boolean) null, i10, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(j9.v.class);
        for (j9.v vVar : D3.DMA.a()) {
            enumMap.put(vVar, E3.g(bundle.getString(vVar.f51715a)));
        }
        return new C3939y(enumMap, i10, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static Boolean i(Bundle bundle) {
        j9.u uVarG;
        if (bundle == null || (uVarG = E3.g(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int iOrdinal = uVarG.ordinal();
        if (iOrdinal == 2) {
            return Boolean.FALSE;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return Boolean.TRUE;
    }

    private final String l() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f41779a);
        for (j9.v vVar : D3.DMA.a()) {
            sb2.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
            sb2.append(E3.m((j9.u) this.f41783e.get(vVar)));
        }
        return sb2.toString();
    }

    public final int b() {
        return this.f41779a;
    }

    public final j9.u c() {
        j9.u uVar = (j9.u) this.f41783e.get(j9.v.AD_USER_DATA);
        return uVar == null ? j9.u.UNINITIALIZED : uVar;
    }

    public final boolean d() {
        Iterator it = this.f41783e.values().iterator();
        while (it.hasNext()) {
            if (((j9.u) it.next()) != j9.u.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String e() {
        return this.f41780b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3939y)) {
            return false;
        }
        C3939y c3939y = (C3939y) obj;
        if (this.f41780b.equalsIgnoreCase(c3939y.f41780b) && Objects.equals(this.f41781c, c3939y.f41781c)) {
            return Objects.equals(this.f41782d, c3939y.f41782d);
        }
        return false;
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f41783e.entrySet()) {
            String strI = E3.i((j9.u) entry.getValue());
            if (strI != null) {
                bundle.putString(((j9.v) entry.getKey()).f51715a, strI);
            }
        }
        Boolean bool = this.f41781c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f41782d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final int hashCode() {
        Boolean bool = this.f41781c;
        int i10 = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.f41782d;
        return this.f41780b.hashCode() + (i10 * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final Boolean j() {
        return this.f41781c;
    }

    public final String k() {
        return this.f41782d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(E3.d(this.f41779a));
        for (j9.v vVar : D3.DMA.a()) {
            sb2.append(com.amazon.a.a.o.b.f.f34694a);
            sb2.append(vVar.f51715a);
            sb2.append(com.amazon.a.a.o.b.f.f34695b);
            j9.u uVar = (j9.u) this.f41783e.get(vVar);
            if (uVar == null) {
                sb2.append("uninitialized");
            } else {
                int iOrdinal = uVar.ordinal();
                if (iOrdinal == 0) {
                    sb2.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb2.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb2.append("denied");
                } else if (iOrdinal == 3) {
                    sb2.append("granted");
                }
            }
        }
        Boolean bool = this.f41781c;
        if (bool != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(bool);
        }
        String str = this.f41782d;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }

    private C3939y(EnumMap enumMap, int i10, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(j9.v.class);
        this.f41783e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f41779a = i10;
        this.f41780b = l();
        this.f41781c = bool;
        this.f41782d = str;
    }
}
