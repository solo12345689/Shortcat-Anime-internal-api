package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z2 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3633z2 {
    public static void a(String str, int i10, List list) {
        if (list.size() != i10) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static void b(String str, int i10, List list) {
        if (list.size() < i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static void c(String str, int i10, List list) {
        if (list.size() > i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static boolean d(InterfaceC3553q interfaceC3553q) {
        if (interfaceC3553q == null) {
            return false;
        }
        Double dL = interfaceC3553q.l();
        return !dL.isNaN() && dL.doubleValue() >= 0.0d && dL.equals(Double.valueOf(Math.floor(dL.doubleValue())));
    }

    public static N e(String str) {
        N nA = null;
        if (str != null && !str.isEmpty()) {
            nA = N.a(Integer.parseInt(str));
        }
        if (nA != null) {
            return nA;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static boolean f(InterfaceC3553q interfaceC3553q, InterfaceC3553q interfaceC3553q2) {
        if (!interfaceC3553q.getClass().equals(interfaceC3553q2.getClass())) {
            return false;
        }
        if ((interfaceC3553q instanceof C3597v) || (interfaceC3553q instanceof C3535o)) {
            return true;
        }
        if (!(interfaceC3553q instanceof C3490j)) {
            return interfaceC3553q instanceof C3588u ? interfaceC3553q.k().equals(interfaceC3553q2.k()) : interfaceC3553q instanceof C3463g ? interfaceC3553q.m().equals(interfaceC3553q2.m()) : interfaceC3553q == interfaceC3553q2;
        }
        if (Double.isNaN(interfaceC3553q.l().doubleValue()) || Double.isNaN(interfaceC3553q2.l().doubleValue())) {
            return false;
        }
        return interfaceC3553q.l().equals(interfaceC3553q2.l());
    }

    public static int g(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d10 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d10))) % 4.294967296E9d);
    }

    public static long h(double d10) {
        return ((long) g(d10)) & 4294967295L;
    }

    public static double i(double d10) {
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (Double.isInfinite(d10) || d10 == 0.0d || d10 == 0.0d) {
            return d10;
        }
        return ((double) (d10 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d10));
    }

    public static Object j(InterfaceC3553q interfaceC3553q) {
        if (InterfaceC3553q.f39930a0.equals(interfaceC3553q)) {
            return null;
        }
        if (InterfaceC3553q.f39929W.equals(interfaceC3553q)) {
            return "";
        }
        if (interfaceC3553q instanceof C3526n) {
            return k((C3526n) interfaceC3553q);
        }
        if (!(interfaceC3553q instanceof C3454f)) {
            return !interfaceC3553q.l().isNaN() ? interfaceC3553q.l() : interfaceC3553q.k();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C3454f) interfaceC3553q).iterator();
        while (it.hasNext()) {
            Object objJ = j((InterfaceC3553q) it.next());
            if (objJ != null) {
                arrayList.add(objJ);
            }
        }
        return arrayList;
    }

    public static Map k(C3526n c3526n) {
        HashMap map = new HashMap();
        for (String str : c3526n.a()) {
            Object objJ = j(c3526n.c(str));
            if (objJ != null) {
                map.put(str, objJ);
            }
        }
        return map;
    }

    public static int l(Y1 y12) {
        int iG = g(y12.h("runtime.counter").l().doubleValue() + 1.0d);
        if (iG > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        y12.e("runtime.counter", new C3490j(Double.valueOf(iG)));
        return iG;
    }
}
