package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class E3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E3 f40738c = new E3(null, null, 100);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumMap f40739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f40740b;

    public E3(Boolean bool, Boolean bool2, int i10) {
        EnumMap enumMap = new EnumMap(j9.v.class);
        this.f40739a = enumMap;
        enumMap.put(j9.v.AD_STORAGE, h(null));
        enumMap.put(j9.v.ANALYTICS_STORAGE, h(null));
        this.f40740b = i10;
    }

    public static E3 a(j9.u uVar, j9.u uVar2, int i10) {
        EnumMap enumMap = new EnumMap(j9.v.class);
        enumMap.put(j9.v.AD_STORAGE, uVar);
        enumMap.put(j9.v.ANALYTICS_STORAGE, uVar2);
        return new E3(enumMap, -10);
    }

    static String d(int i10) {
        return i10 != -30 ? i10 != -20 ? i10 != -10 ? i10 != 0 ? i10 != 30 ? i10 != 90 ? i10 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static E3 e(Bundle bundle, int i10) {
        if (bundle == null) {
            return new E3(null, null, i10);
        }
        EnumMap enumMap = new EnumMap(j9.v.class);
        for (j9.v vVar : D3.STORAGE.b()) {
            enumMap.put(vVar, g(bundle.getString(vVar.f51715a)));
        }
        return new E3(enumMap, i10);
    }

    public static E3 f(String str, int i10) {
        EnumMap enumMap = new EnumMap(j9.v.class);
        j9.v[] vVarArrA = D3.STORAGE.a();
        for (int i11 = 0; i11 < vVarArrA.length; i11++) {
            String str2 = str == null ? "" : str;
            j9.v vVar = vVarArrA[i11];
            int i12 = i11 + 2;
            if (i12 < str2.length()) {
                enumMap.put(vVar, j(str2.charAt(i12)));
            } else {
                enumMap.put(vVar, j9.u.UNINITIALIZED);
            }
        }
        return new E3(enumMap, i10);
    }

    static j9.u g(String str) {
        return str == null ? j9.u.UNINITIALIZED : str.equals("granted") ? j9.u.GRANTED : str.equals("denied") ? j9.u.DENIED : j9.u.UNINITIALIZED;
    }

    static j9.u h(Boolean bool) {
        return bool == null ? j9.u.UNINITIALIZED : bool.booleanValue() ? j9.u.GRANTED : j9.u.DENIED;
    }

    static String i(j9.u uVar) {
        int iOrdinal = uVar.ordinal();
        if (iOrdinal == 2) {
            return "denied";
        }
        if (iOrdinal != 3) {
            return null;
        }
        return "granted";
    }

    static j9.u j(char c10) {
        return c10 != '+' ? c10 != '0' ? c10 != '1' ? j9.u.UNINITIALIZED : j9.u.GRANTED : j9.u.DENIED : j9.u.POLICY;
    }

    static char m(j9.u uVar) {
        if (uVar == null) {
            return '-';
        }
        int iOrdinal = uVar.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean u(int i10, int i11) {
        int i12 = -30;
        if (i10 == -20) {
            if (i11 == -30) {
                return true;
            }
            i10 = -20;
        }
        if (i10 != -30) {
            i12 = i10;
        } else if (i11 == -20) {
            return true;
        }
        return i12 == i11 || i10 < i11;
    }

    public final int b() {
        return this.f40740b;
    }

    public final boolean c() {
        Iterator it = this.f40739a.values().iterator();
        while (it.hasNext()) {
            if (((j9.u) it.next()) != j9.u.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof E3)) {
            return false;
        }
        E3 e32 = (E3) obj;
        for (j9.v vVar : D3.STORAGE.b()) {
            if (this.f40739a.get(vVar) != e32.f40739a.get(vVar)) {
                return false;
            }
        }
        return this.f40740b == e32.f40740b;
    }

    public final int hashCode() {
        Iterator it = this.f40739a.values().iterator();
        int iHashCode = this.f40740b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((j9.u) it.next()).hashCode();
        }
        return iHashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String k() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "G1"
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.D3 r1 = com.google.android.gms.measurement.internal.D3.STORAGE
            j9.v[] r1 = r1.a()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L3a
            r4 = r1[r3]
            java.util.EnumMap r5 = r7.f40739a
            java.lang.Object r4 = r5.get(r4)
            j9.u r4 = (j9.u) r4
            r5 = 45
            if (r4 == 0) goto L34
            int r4 = r4.ordinal()
            if (r4 == 0) goto L34
            r6 = 1
            if (r4 == r6) goto L32
            r6 = 2
            if (r4 == r6) goto L2f
            r6 = 3
            if (r4 == r6) goto L32
            goto L34
        L2f:
            r5 = 48
            goto L34
        L32:
            r5 = 49
        L34:
            r0.append(r5)
            int r3 = r3 + 1
            goto Lf
        L3a:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.E3.k():java.lang.String");
    }

    public final String l() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (j9.v vVar : D3.STORAGE.a()) {
            sb2.append(m((j9.u) this.f40739a.get(vVar)));
        }
        return sb2.toString();
    }

    public final Bundle n() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f40739a.entrySet()) {
            String strI = i((j9.u) entry.getValue());
            if (strI != null) {
                bundle.putString(((j9.v) entry.getKey()).f51715a, strI);
            }
        }
        return bundle;
    }

    public final boolean o(j9.v vVar) {
        return ((j9.u) this.f40739a.get(vVar)) != j9.u.DENIED;
    }

    public final j9.u p() {
        j9.u uVar = (j9.u) this.f40739a.get(j9.v.AD_STORAGE);
        return uVar == null ? j9.u.UNINITIALIZED : uVar;
    }

    public final j9.u q() {
        j9.u uVar = (j9.u) this.f40739a.get(j9.v.ANALYTICS_STORAGE);
        return uVar == null ? j9.u.UNINITIALIZED : uVar;
    }

    public final boolean r(E3 e32) {
        EnumMap enumMap = this.f40739a;
        for (j9.v vVar : (j9.v[]) enumMap.keySet().toArray(new j9.v[0])) {
            j9.u uVar = (j9.u) enumMap.get(vVar);
            j9.u uVar2 = (j9.u) e32.f40739a.get(vVar);
            j9.u uVar3 = j9.u.DENIED;
            if (uVar == uVar3 && uVar2 != uVar3) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.E3 s(com.google.android.gms.measurement.internal.E3 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<j9.v> r1 = j9.v.class
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.D3 r1 = com.google.android.gms.measurement.internal.D3.STORAGE
            j9.v[] r1 = r1.b()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L4a
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.f40739a
            java.lang.Object r5 = r5.get(r4)
            j9.u r5 = (j9.u) r5
            java.util.EnumMap r6 = r9.f40739a
            java.lang.Object r6 = r6.get(r4)
            j9.u r6 = (j9.u) r6
            if (r5 != 0) goto L26
            goto L33
        L26:
            if (r6 == 0) goto L42
            j9.u r7 = j9.u.UNINITIALIZED
            if (r5 != r7) goto L2d
            goto L33
        L2d:
            if (r6 == r7) goto L42
            j9.u r7 = j9.u.POLICY
            if (r5 != r7) goto L35
        L33:
            r5 = r6
            goto L42
        L35:
            if (r6 == r7) goto L42
            j9.u r7 = j9.u.DENIED
            if (r5 == r7) goto L41
            if (r6 != r7) goto L3e
            goto L41
        L3e:
            j9.u r5 = j9.u.GRANTED
            goto L42
        L41:
            r5 = r7
        L42:
            if (r5 == 0) goto L47
            r0.put(r4, r5)
        L47:
            int r3 = r3 + 1
            goto Lf
        L4a:
            com.google.android.gms.measurement.internal.E3 r9 = new com.google.android.gms.measurement.internal.E3
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.E3.s(com.google.android.gms.measurement.internal.E3):com.google.android.gms.measurement.internal.E3");
    }

    public final E3 t(E3 e32) {
        EnumMap enumMap = new EnumMap(j9.v.class);
        for (j9.v vVar : D3.STORAGE.b()) {
            j9.u uVar = (j9.u) this.f40739a.get(vVar);
            if (uVar == j9.u.UNINITIALIZED) {
                uVar = (j9.u) e32.f40739a.get(vVar);
            }
            if (uVar != null) {
                enumMap.put(vVar, uVar);
            }
        }
        return new E3(enumMap, this.f40740b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(d(this.f40740b));
        for (j9.v vVar : D3.STORAGE.b()) {
            sb2.append(com.amazon.a.a.o.b.f.f34694a);
            sb2.append(vVar.f51715a);
            sb2.append(com.amazon.a.a.o.b.f.f34695b);
            j9.u uVar = (j9.u) this.f40739a.get(vVar);
            if (uVar == null) {
                uVar = j9.u.UNINITIALIZED;
            }
            sb2.append(uVar);
        }
        return sb2.toString();
    }

    private E3(EnumMap enumMap, int i10) {
        EnumMap enumMap2 = new EnumMap(j9.v.class);
        this.f40739a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f40740b = i10;
    }
}
