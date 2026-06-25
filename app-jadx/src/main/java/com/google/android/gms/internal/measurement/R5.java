package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class R5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC3416a6 f39563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f39564b = 0;

    static {
        int i10 = M5.f39422d;
        f39563a = new C3434c6();
    }

    static int A(List list) {
        return list.size() * 4;
    }

    static int B(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (N4.E(i10 << 3) + 4);
    }

    static int C(List list) {
        return list.size() * 8;
    }

    static int D(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (N4.E(i10 << 3) + 8);
    }

    static int E(int i10, Object obj, P5 p52) {
        return N4.E(i10 << 3) + N4.d((E5) obj, p52);
    }

    public static AbstractC3416a6 a() {
        return f39563a;
    }

    static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static void c(S4 s42, Object obj, Object obj2) {
        android.support.v4.media.session.b.a(obj2);
        throw null;
    }

    static void d(AbstractC3416a6 abstractC3416a6, Object obj, Object obj2) {
        AbstractC3442d5 abstractC3442d5 = (AbstractC3442d5) obj;
        C3425b6 c3425b6C = abstractC3442d5.zzc;
        C3425b6 c3425b6 = ((AbstractC3442d5) obj2).zzc;
        if (!C3425b6.a().equals(c3425b6)) {
            if (C3425b6.a().equals(c3425b6C)) {
                c3425b6C = C3425b6.c(c3425b6C, c3425b6);
            } else {
                c3425b6C.k(c3425b6);
            }
        }
        abstractC3442d5.zzc = c3425b6C;
    }

    static Object e(Object obj, int i10, int i11, Object obj2, AbstractC3416a6 abstractC3416a6) {
        if (obj2 == null) {
            obj2 = abstractC3416a6.a(obj);
        }
        ((C3425b6) obj2).j(i10 << 3, Long.valueOf(i11));
        return obj2;
    }

    public static void f(int i10, List list, InterfaceC3533n6 interfaceC3533n6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3533n6.h(i10, list, z10);
    }

    public static void g(int i10, List list, InterfaceC3533n6 interfaceC3533n6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3533n6.D(i10, list, z10);
    }

    public static void h(int i10, List list, InterfaceC3533n6 interfaceC3533n6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3533n6.d(i10, list, z10);
    }

    public static void i(int i10, List list, InterfaceC3533n6 interfaceC3533n6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3533n6.y(i10, list, z10);
    }

    public static void j(int i10, List list, InterfaceC3533n6 interfaceC3533n6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3533n6.c(i10, list, z10);
    }

    public static void k(int i10, List list, InterfaceC3533n6 interfaceC3533n6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3533n6.a(i10, list, z10);
    }

    public static void l(int i10, List list, InterfaceC3533n6 interfaceC3533n6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3533n6.f(i10, list, z10);
    }

    public static void m(int i10, List list, InterfaceC3533n6 interfaceC3533n6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3533n6.K(i10, list, z10);
    }

    public static void n(int i10, List list, InterfaceC3533n6 interfaceC3533n6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3533n6.B(i10, list, z10);
    }

    public static void o(int i10, List list, InterfaceC3533n6 interfaceC3533n6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3533n6.r(i10, list, z10);
    }

    public static void p(int i10, List list, InterfaceC3533n6 interfaceC3533n6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3533n6.H(i10, list, z10);
    }

    public static void q(int i10, List list, InterfaceC3533n6 interfaceC3533n6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3533n6.z(i10, list, z10);
    }

    public static void r(int i10, List list, InterfaceC3533n6 interfaceC3533n6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3533n6.J(i10, list, z10);
    }

    public static void s(int i10, List list, InterfaceC3533n6 interfaceC3533n6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3533n6.i(i10, list, z10);
    }

    static int t(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3576s5)) {
            int iA = 0;
            while (i10 < size) {
                iA += N4.a(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iA;
        }
        C3576s5 c3576s5 = (C3576s5) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += N4.a(c3576s5.p0(i10));
            i10++;
        }
        return iA2;
    }

    static int u(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3576s5)) {
            int iA = 0;
            while (i10 < size) {
                iA += N4.a(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iA;
        }
        C3576s5 c3576s5 = (C3576s5) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += N4.a(c3576s5.p0(i10));
            i10++;
        }
        return iA2;
    }

    static int v(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3576s5)) {
            int iA = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iA += N4.a((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return iA;
        }
        C3576s5 c3576s5 = (C3576s5) list;
        int iA2 = 0;
        while (i10 < size) {
            long jP0 = c3576s5.p0(i10);
            iA2 += N4.a((jP0 >> 63) ^ (jP0 + jP0));
            i10++;
        }
        return iA2;
    }

    static int w(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3451e5)) {
            int iA = 0;
            while (i10 < size) {
                iA += N4.a(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iA;
        }
        C3451e5 c3451e5 = (C3451e5) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += N4.a(c3451e5.d(i10));
            i10++;
        }
        return iA2;
    }

    static int x(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3451e5)) {
            int iA = 0;
            while (i10 < size) {
                iA += N4.a(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iA;
        }
        C3451e5 c3451e5 = (C3451e5) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += N4.a(c3451e5.d(i10));
            i10++;
        }
        return iA2;
    }

    static int y(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3451e5)) {
            int iE = 0;
            while (i10 < size) {
                iE += N4.E(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iE;
        }
        C3451e5 c3451e5 = (C3451e5) list;
        int iE2 = 0;
        while (i10 < size) {
            iE2 += N4.E(c3451e5.d(i10));
            i10++;
        }
        return iE2;
    }

    static int z(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3451e5)) {
            int iE = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iE += N4.E((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return iE;
        }
        C3451e5 c3451e5 = (C3451e5) list;
        int iE2 = 0;
        while (i10 < size) {
            int iD = c3451e5.d(i10);
            iE2 += N4.E((iD >> 31) ^ (iD + iD));
            i10++;
        }
        return iE2;
    }
}
