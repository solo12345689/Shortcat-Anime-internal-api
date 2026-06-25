package com.google.android.gms.internal.measurement;

import com.revenuecat.purchases.common.verification.SigningManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class W4 {

    /* JADX INFO: renamed from: d */
    private static final W4 f39606d = new W4(true);

    /* JADX INFO: renamed from: a */
    final X5 f39607a = new T5();

    /* JADX INFO: renamed from: b */
    private boolean f39608b;

    /* JADX INFO: renamed from: c */
    private boolean f39609c;

    private W4() {
    }

    static void c(N4 n42, EnumC3515l6 enumC3515l6, int i10, Object obj) {
        if (enumC3515l6 == EnumC3515l6.f39829l) {
            E5 e52 = (E5) obj;
            AbstractC3505k5.d(e52);
            n42.i(i10, 3);
            e52.c(n42);
            n42.i(i10, 4);
            return;
        }
        n42.i(i10, enumC3515l6.b());
        EnumC3524m6 enumC3524m6 = EnumC3524m6.INT;
        switch (enumC3515l6.ordinal()) {
            case 0:
                n42.A(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                n42.y(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                n42.z(((Long) obj).longValue());
                break;
            case 3:
                n42.z(((Long) obj).longValue());
                break;
            case 4:
                n42.w(((Integer) obj).intValue());
                break;
            case 5:
                n42.A(((Long) obj).longValue());
                break;
            case 6:
                n42.y(((Integer) obj).intValue());
                break;
            case 7:
                n42.v(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof I4)) {
                    n42.C((String) obj);
                } else {
                    n42.r((I4) obj);
                }
                break;
            case 9:
                ((E5) obj).c(n42);
                break;
            case 10:
                n42.u((E5) obj);
                break;
            case 11:
                if (!(obj instanceof I4)) {
                    byte[] bArr = (byte[]) obj;
                    n42.s(bArr, 0, bArr.length);
                } else {
                    n42.r((I4) obj);
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                n42.x(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof InterfaceC3460f5)) {
                    n42.w(((Integer) obj).intValue());
                } else {
                    n42.w(((InterfaceC3460f5) obj).zza());
                }
                break;
            case 14:
                n42.y(((Integer) obj).intValue());
                break;
            case 15:
                n42.A(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                n42.x((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                n42.z((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    static int d(EnumC3515l6 enumC3515l6, int i10, Object obj) {
        int iE = N4.E(i10 << 3);
        if (enumC3515l6 == EnumC3515l6.f39829l) {
            AbstractC3505k5.d((E5) obj);
            iE += iE;
        }
        return iE + e(enumC3515l6, obj);
    }

    static int e(EnumC3515l6 enumC3515l6, Object obj) {
        int iD;
        int iE;
        EnumC3515l6 enumC3515l62 = EnumC3515l6.f39820c;
        EnumC3524m6 enumC3524m6 = EnumC3524m6.INT;
        switch (enumC3515l6.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                int i10 = N4.f39512d;
                return 8;
            case 1:
                ((Float) obj).getClass();
                int i11 = N4.f39512d;
                return 4;
            case 2:
                return N4.a(((Long) obj).longValue());
            case 3:
                return N4.a(((Long) obj).longValue());
            case 4:
                return N4.a(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                int i12 = N4.f39512d;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                int i13 = N4.f39512d;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                int i14 = N4.f39512d;
                return 1;
            case 8:
                if (!(obj instanceof I4)) {
                    return N4.b((String) obj);
                }
                int i15 = N4.f39512d;
                iD = ((I4) obj).d();
                iE = N4.E(iD);
                break;
                break;
            case 9:
                return ((E5) obj).a();
            case 10:
                return N4.c((E5) obj);
            case 11:
                if (!(obj instanceof I4)) {
                    int i16 = N4.f39512d;
                    iD = ((byte[]) obj).length;
                    iE = N4.E(iD);
                } else {
                    int i17 = N4.f39512d;
                    iD = ((I4) obj).d();
                    iE = N4.E(iD);
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                return N4.E(((Integer) obj).intValue());
            case 13:
                return obj instanceof InterfaceC3460f5 ? N4.a(((InterfaceC3460f5) obj).zza()) : N4.a(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i18 = N4.f39512d;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i19 = N4.f39512d;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return N4.E((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return N4.a((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iE + iD;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void f(com.google.android.gms.internal.measurement.V4 r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.measurement.l6 r0 = r2.j()
            byte[] r1 = com.google.android.gms.internal.measurement.AbstractC3505k5.f39813b
            r3.getClass()
            com.google.android.gms.internal.measurement.l6 r1 = com.google.android.gms.internal.measurement.EnumC3515l6.f39820c
            com.google.android.gms.internal.measurement.m6 r1 = com.google.android.gms.internal.measurement.EnumC3524m6.INT
            com.google.android.gms.internal.measurement.m6 r0 = r0.a()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L3f;
                case 1: goto L3c;
                case 2: goto L39;
                case 3: goto L36;
                case 4: goto L33;
                case 5: goto L30;
                case 6: goto L27;
                case 7: goto L1e;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L44
        L19:
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.E5
            if (r0 == 0) goto L44
            return
        L1e:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L26
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.InterfaceC3460f5
            if (r0 == 0) goto L44
        L26:
            return
        L27:
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.I4
            if (r0 != 0) goto L2f
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L44
        L2f:
            return
        L30:
            boolean r0 = r3 instanceof java.lang.String
            goto L41
        L33:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L41
        L36:
            boolean r0 = r3 instanceof java.lang.Double
            goto L41
        L39:
            boolean r0 = r3 instanceof java.lang.Float
            goto L41
        L3c:
            boolean r0 = r3 instanceof java.lang.Long
            goto L41
        L3f:
            boolean r0 = r3 instanceof java.lang.Integer
        L41:
            if (r0 == 0) goto L44
            return
        L44:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r2.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.measurement.l6 r2 = r2.j()
            com.google.android.gms.internal.measurement.m6 r2 = r2.a()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.W4.f(com.google.android.gms.internal.measurement.V4, java.lang.Object):void");
    }

    public final void a() {
        if (this.f39608b) {
            return;
        }
        X5 x52 = this.f39607a;
        int iD = x52.d();
        for (int i10 = 0; i10 < iD; i10++) {
            Object value = x52.e(i10).getValue();
            if (value instanceof AbstractC3442d5) {
                ((AbstractC3442d5) value).n();
            }
        }
        Iterator it = x52.f().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof AbstractC3442d5) {
                ((AbstractC3442d5) value2).n();
            }
        }
        x52.a();
        this.f39608b = true;
    }

    public final void b(V4 v42, Object obj) {
        if (!v42.l()) {
            f(v42, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                f(v42, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        this.f39607a.put(v42, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        W4 w42 = new W4();
        X5 x52 = this.f39607a;
        int iD = x52.d();
        for (int i10 = 0; i10 < iD; i10++) {
            Map.Entry entryE = x52.e(i10);
            android.support.v4.media.session.b.a(((U5) entryE).a());
            w42.b(null, entryE.getValue());
        }
        for (Map.Entry entry : x52.f()) {
            android.support.v4.media.session.b.a(entry.getKey());
            w42.b(null, entry.getValue());
        }
        w42.f39609c = this.f39609c;
        return w42;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof W4) {
            return this.f39607a.equals(((W4) obj).f39607a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39607a.hashCode();
    }

    private W4(boolean z10) {
        a();
        a();
    }
}
