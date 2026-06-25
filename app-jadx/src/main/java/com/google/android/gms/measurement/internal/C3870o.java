package com.google.android.gms.measurement.internal;

import java.util.EnumMap;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3870o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumMap f41469a;

    C3870o() {
        this.f41469a = new EnumMap(j9.v.class);
    }

    public static C3870o d(String str) {
        EnumMap enumMap = new EnumMap(j9.v.class);
        if (str.length() >= j9.v.values().length) {
            int i10 = 0;
            if (str.charAt(0) == '1') {
                j9.v[] vVarArrValues = j9.v.values();
                int length = vVarArrValues.length;
                int i11 = 1;
                while (i10 < length) {
                    enumMap.put(vVarArrValues[i10], EnumC3863n.a(str.charAt(i11)));
                    i10++;
                    i11++;
                }
                return new C3870o(enumMap);
            }
        }
        return new C3870o();
    }

    public final EnumC3863n a(j9.v vVar) {
        EnumC3863n enumC3863n = (EnumC3863n) this.f41469a.get(vVar);
        return enumC3863n == null ? EnumC3863n.UNSET : enumC3863n;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(j9.v r3, int r4) {
        /*
            r2 = this;
            com.google.android.gms.measurement.internal.n r0 = com.google.android.gms.measurement.internal.EnumC3863n.UNSET
            r1 = -30
            if (r4 == r1) goto L1e
            r1 = -20
            if (r4 == r1) goto L1b
            r1 = -10
            if (r4 == r1) goto L18
            if (r4 == 0) goto L1b
            r1 = 30
            if (r4 == r1) goto L15
            goto L20
        L15:
            com.google.android.gms.measurement.internal.n r0 = com.google.android.gms.measurement.internal.EnumC3863n.INITIALIZATION
            goto L20
        L18:
            com.google.android.gms.measurement.internal.n r0 = com.google.android.gms.measurement.internal.EnumC3863n.MANIFEST
            goto L20
        L1b:
            com.google.android.gms.measurement.internal.n r0 = com.google.android.gms.measurement.internal.EnumC3863n.API
            goto L20
        L1e:
            com.google.android.gms.measurement.internal.n r0 = com.google.android.gms.measurement.internal.EnumC3863n.TCF
        L20:
            java.util.EnumMap r4 = r2.f41469a
            r4.put(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3870o.b(j9.v, int):void");
    }

    public final void c(j9.v vVar, EnumC3863n enumC3863n) {
        this.f41469a.put(vVar, enumC3863n);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("1");
        for (j9.v vVar : j9.v.values()) {
            EnumC3863n enumC3863n = (EnumC3863n) this.f41469a.get(vVar);
            if (enumC3863n == null) {
                enumC3863n = EnumC3863n.UNSET;
            }
            sb2.append(enumC3863n.b());
        }
        return sb2.toString();
    }

    private C3870o(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(j9.v.class);
        this.f41469a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
