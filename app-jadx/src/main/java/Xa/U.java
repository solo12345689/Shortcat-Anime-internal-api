package xa;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import xa.AbstractC7091q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class U {

    /* JADX INFO: renamed from: a */
    private static final Class f64112a = b();

    /* JADX INFO: renamed from: b */
    private static final Y f64113b = c();

    /* JADX INFO: renamed from: c */
    private static final Y f64114c = new a0();

    static Object a(Object obj, int i10, List list, AbstractC7091q.a aVar, Object obj2, Y y10) {
        if (aVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!aVar.a(iIntValue)) {
                    obj2 = j(obj, i10, iIntValue, obj2, y10);
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
                obj2 = j(obj, i10, iIntValue2, obj2, y10);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return obj2;
    }

    private static Class b() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Y c() {
        try {
            Class clsD = d();
            if (clsD == null) {
                return null;
            }
            return (Y) clsD.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class d() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static void e(AbstractC7085k abstractC7085k, Object obj, Object obj2) {
        AbstractC7088n abstractC7088nB = abstractC7085k.b(obj2);
        if (abstractC7088nB.a()) {
            return;
        }
        abstractC7085k.c(obj).d(abstractC7088nB);
    }

    static void f(InterfaceC7098y interfaceC7098y, Object obj, Object obj2, long j10) {
        c0.O(obj, j10, interfaceC7098y.a(c0.A(obj, j10), c0.A(obj2, j10)));
    }

    static void g(Y y10, Object obj, Object obj2) {
        y10.n(obj, y10.i(y10.g(obj), y10.g(obj2)));
    }

    public static void h(Class cls) {
        Class cls2;
        if (!AbstractC7090p.class.isAssignableFrom(cls) && (cls2 = f64112a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    static boolean i(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static Object j(Object obj, int i10, int i11, Object obj2, Y y10) {
        if (obj2 == null) {
            obj2 = y10.f(obj);
        }
        y10.e(obj2, i10, i11);
        return obj2;
    }

    public static Y k() {
        return f64113b;
    }

    public static Y l() {
        return f64114c;
    }
}
