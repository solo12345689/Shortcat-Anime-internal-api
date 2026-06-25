package com.google.android.gms.internal.play_billing;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.r2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC3725r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC3745v2 f40544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f40545b = 0;

    static {
        int i10 = C3701m2.f40505d;
        f40544a = new C3753x2();
    }

    public static void A(int i10, List list, G2 g22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g22.v(i10, list, z10);
    }

    public static void B(int i10, List list, G2 g22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g22.q(i10, list, z10);
    }

    public static void C(int i10, List list, G2 g22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g22.F(i10, list, z10);
    }

    public static void D(int i10, List list, G2 g22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g22.d(i10, list, z10);
    }

    public static void E(int i10, List list, G2 g22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g22.a(i10, list, z10);
    }

    public static void a(int i10, List list, G2 g22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g22.h(i10, list, z10);
    }

    public static void b(int i10, List list, G2 g22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g22.i(i10, list, z10);
    }

    public static void c(int i10, List list, G2 g22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g22.f(i10, list, z10);
    }

    public static void d(int i10, List list, G2 g22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g22.c(i10, list, z10);
    }

    static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int f(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof K1)) {
            int iD = 0;
            while (i10 < size) {
                iD += AbstractC3744v1.d(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iD;
        }
        K1 k12 = (K1) list;
        int iD2 = 0;
        while (i10 < size) {
            iD2 += AbstractC3744v1.d(k12.c(i10));
            i10++;
        }
        return iD2;
    }

    static int g(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC3744v1.c(i10 << 3) + 4);
    }

    static int h(List list) {
        return list.size() * 4;
    }

    static int i(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC3744v1.c(i10 << 3) + 8);
    }

    static int j(List list) {
        return list.size() * 8;
    }

    static int k(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof K1)) {
            int iD = 0;
            while (i10 < size) {
                iD += AbstractC3744v1.d(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iD;
        }
        K1 k12 = (K1) list;
        int iD2 = 0;
        while (i10 < size) {
            iD2 += AbstractC3744v1.d(k12.c(i10));
            i10++;
        }
        return iD2;
    }

    static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iD = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iD += AbstractC3744v1.d(((Long) list.get(i10)).longValue());
        }
        return iD;
    }

    static int m(int i10, Object obj, InterfaceC3716p2 interfaceC3716p2) {
        return AbstractC3744v1.c(i10 << 3) + AbstractC3744v1.a((InterfaceC3666f2) obj, interfaceC3716p2);
    }

    static int n(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof K1)) {
            int iC = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iC += AbstractC3744v1.c((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return iC;
        }
        K1 k12 = (K1) list;
        int iC2 = 0;
        while (i10 < size) {
            int iC3 = k12.c(i10);
            iC2 += AbstractC3744v1.c((iC3 >> 31) ^ (iC3 + iC3));
            i10++;
        }
        return iC2;
    }

    static int o(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iD = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long jLongValue = ((Long) list.get(i10)).longValue();
            iD += AbstractC3744v1.d((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iD;
    }

    static int p(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof K1)) {
            int iC = 0;
            while (i10 < size) {
                iC += AbstractC3744v1.c(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iC;
        }
        K1 k12 = (K1) list;
        int iC2 = 0;
        while (i10 < size) {
            iC2 += AbstractC3744v1.c(k12.c(i10));
            i10++;
        }
        return iC2;
    }

    static int q(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iD = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iD += AbstractC3744v1.d(((Long) list.get(i10)).longValue());
        }
        return iD;
    }

    public static AbstractC3745v2 r() {
        return f40544a;
    }

    static Object s(Object obj, int i10, int i11, Object obj2, AbstractC3745v2 abstractC3745v2) {
        if (obj2 == null) {
            obj2 = abstractC3745v2.a(obj);
        }
        ((C3749w2) obj2).j(i10 << 3, Long.valueOf(i11));
        return obj2;
    }

    static void t(A1 a12, Object obj, Object obj2) {
        android.support.v4.media.session.b.a(obj2);
        throw null;
    }

    static void u(AbstractC3745v2 abstractC3745v2, Object obj, Object obj2) {
        J1 j12 = (J1) obj;
        C3749w2 c3749w2E = j12.zzc;
        C3749w2 c3749w2 = ((J1) obj2).zzc;
        if (!C3749w2.c().equals(c3749w2)) {
            if (C3749w2.c().equals(c3749w2E)) {
                c3749w2E = C3749w2.e(c3749w2E, c3749w2);
            } else {
                c3749w2E.d(c3749w2);
            }
        }
        j12.zzc = c3749w2E;
    }

    public static void v(int i10, List list, G2 g22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g22.p(i10, list, z10);
    }

    public static void w(int i10, List list, G2 g22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g22.G(i10, list, z10);
    }

    public static void x(int i10, List list, G2 g22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g22.C(i10, list, z10);
    }

    public static void y(int i10, List list, G2 g22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g22.A(i10, list, z10);
    }

    public static void z(int i10, List list, G2 g22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g22.t(i10, list, z10);
    }
}
