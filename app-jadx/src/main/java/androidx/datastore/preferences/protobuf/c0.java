package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC2816u;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class f29263a = A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h0 f29264b = B();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h0 f29265c = new j0();

    private static Class A() {
        if (W.f29251d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static h0 B() {
        try {
            Class clsC = C();
            if (clsC == null) {
                return null;
            }
            return (h0) clsC.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class C() {
        if (W.f29251d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static void D(AbstractC2810n abstractC2810n, Object obj, Object obj2) {
        C2813q c2813qC = abstractC2810n.c(obj2);
        if (c2813qC.j()) {
            return;
        }
        abstractC2810n.d(obj).p(c2813qC);
    }

    static void E(F f10, Object obj, Object obj2, long j10) {
        k0.O(obj, j10, f10.a(k0.z(obj, j10), k0.z(obj2, j10)));
    }

    static void F(h0 h0Var, Object obj, Object obj2) {
        h0Var.p(obj, h0Var.k(h0Var.g(obj), h0Var.g(obj2)));
    }

    public static void G(Class cls) {
        Class cls2;
        if (!AbstractC2815t.class.isAssignableFrom(cls) && !W.f29251d && (cls2 = f29263a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean H(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static Object I(Object obj, int i10, int i11, Object obj2, h0 h0Var) {
        if (obj2 == null) {
            obj2 = h0Var.f(obj);
        }
        h0Var.e(obj2, i10, i11);
        return obj2;
    }

    public static h0 J() {
        return f29264b;
    }

    public static h0 K() {
        return f29265c;
    }

    public static void L(int i10, List list, n0 n0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.G(i10, list, z10);
    }

    public static void M(int i10, List list, n0 n0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.O(i10, list);
    }

    public static void N(int i10, List list, n0 n0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.M(i10, list, z10);
    }

    public static void O(int i10, List list, n0 n0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.q(i10, list, z10);
    }

    public static void P(int i10, List list, n0 n0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.l(i10, list, z10);
    }

    public static void Q(int i10, List list, n0 n0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.E(i10, list, z10);
    }

    public static void R(int i10, List list, n0 n0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.a(i10, list, z10);
    }

    public static void S(int i10, List list, n0 n0Var, a0 a0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.e(i10, list, a0Var);
    }

    public static void T(int i10, List list, n0 n0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.h(i10, list, z10);
    }

    public static void U(int i10, List list, n0 n0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.L(i10, list, z10);
    }

    public static void V(int i10, List list, n0 n0Var, a0 a0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.z(i10, list, a0Var);
    }

    public static void W(int i10, List list, n0 n0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.F(i10, list, z10);
    }

    public static void X(int i10, List list, n0 n0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.v(i10, list, z10);
    }

    public static void Y(int i10, List list, n0 n0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.J(i10, list, z10);
    }

    public static void Z(int i10, List list, n0 n0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.o(i10, list, z10);
    }

    static int a(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC2805i.O(i10) + AbstractC2805i.y(size) : size * AbstractC2805i.c(i10, true);
    }

    public static void a0(int i10, List list, n0 n0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.d(i10, list);
    }

    static int b(List list) {
        return list.size();
    }

    public static void b0(int i10, List list, n0 n0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.n(i10, list, z10);
    }

    static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO = size * AbstractC2805i.O(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iO += AbstractC2805i.g((AbstractC2802f) list.get(i11));
        }
        return iO;
    }

    public static void c0(int i10, List list, n0 n0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.w(i10, list, z10);
    }

    static int d(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        return z10 ? AbstractC2805i.O(i10) + AbstractC2805i.y(iE) : iE + (size * AbstractC2805i.O(i10));
    }

    static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iK = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iK += AbstractC2805i.k(((Integer) list.get(i10)).intValue());
        }
        return iK;
    }

    static int f(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC2805i.O(i10) + AbstractC2805i.y(size * 4) : size * AbstractC2805i.l(i10, 0);
    }

    static int g(List list) {
        return list.size() * 4;
    }

    static int h(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC2805i.O(i10) + AbstractC2805i.y(size * 8) : size * AbstractC2805i.n(i10, 0L);
    }

    static int i(List list) {
        return list.size() * 8;
    }

    static int j(int i10, List list, a0 a0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iR += AbstractC2805i.r(i10, (K) list.get(i11), a0Var);
        }
        return iR;
    }

    static int k(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        return z10 ? AbstractC2805i.O(i10) + AbstractC2805i.y(iL) : iL + (size * AbstractC2805i.O(i10));
    }

    static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iV = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iV += AbstractC2805i.v(((Integer) list.get(i10)).intValue());
        }
        return iV;
    }

    static int m(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z10 ? AbstractC2805i.O(i10) + AbstractC2805i.y(iN) : iN + (list.size() * AbstractC2805i.O(i10));
    }

    static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iX += AbstractC2805i.x(((Long) list.get(i10)).longValue());
        }
        return iX;
    }

    static int o(int i10, Object obj, a0 a0Var) {
        return AbstractC2805i.z(i10, (K) obj, a0Var);
    }

    static int p(int i10, List list, a0 a0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO = AbstractC2805i.O(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            iO += AbstractC2805i.B((K) list.get(i11), a0Var);
        }
        return iO;
    }

    static int q(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        return z10 ? AbstractC2805i.O(i10) + AbstractC2805i.y(iR) : iR + (size * AbstractC2805i.O(i10));
    }

    static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iJ += AbstractC2805i.J(((Integer) list.get(i10)).intValue());
        }
        return iJ;
    }

    static int s(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        return z10 ? AbstractC2805i.O(i10) + AbstractC2805i.y(iT) : iT + (size * AbstractC2805i.O(i10));
    }

    static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iL += AbstractC2805i.L(((Long) list.get(i10)).longValue());
        }
        return iL;
    }

    static int u(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO = AbstractC2805i.O(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            iO += obj instanceof AbstractC2802f ? AbstractC2805i.g((AbstractC2802f) obj) : AbstractC2805i.N((String) obj);
        }
        return iO;
    }

    static int v(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        return z10 ? AbstractC2805i.O(i10) + AbstractC2805i.y(iW) : iW + (size * AbstractC2805i.O(i10));
    }

    static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iQ = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iQ += AbstractC2805i.Q(((Integer) list.get(i10)).intValue());
        }
        return iQ;
    }

    static int x(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        return z10 ? AbstractC2805i.O(i10) + AbstractC2805i.y(iY) : iY + (size * AbstractC2805i.O(i10));
    }

    static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iS = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iS += AbstractC2805i.S(((Long) list.get(i10)).longValue());
        }
        return iS;
    }

    static Object z(Object obj, int i10, List list, AbstractC2816u.a aVar, Object obj2, h0 h0Var) {
        if (aVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!aVar.a(iIntValue)) {
                    obj2 = I(obj, i10, iIntValue, obj2, h0Var);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) list.get(i12);
            int iIntValue2 = num.intValue();
            if (aVar.a(iIntValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                obj2 = I(obj, i10, iIntValue2, obj2, h0Var);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return obj2;
    }
}
