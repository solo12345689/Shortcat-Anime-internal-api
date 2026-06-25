package kotlin.jvm.internal;

import Td.InterfaceC2158i;
import ie.InterfaceC5082a;
import ie.InterfaceC5083b;
import ie.InterfaceC5084c;
import ie.InterfaceC5085d;
import ie.InterfaceC5086e;
import ie.InterfaceC5087f;
import ie.InterfaceC5088g;
import ie.InterfaceC5089h;
import ie.InterfaceC5090i;
import ie.InterfaceC5091j;
import ie.InterfaceC5092k;
import ie.InterfaceC5093l;
import ie.InterfaceC5094m;
import ie.InterfaceC5095n;
import ie.InterfaceC5096o;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import je.InterfaceC5371a;
import je.InterfaceC5372b;
import je.InterfaceC5373c;
import je.InterfaceC5374d;
import je.InterfaceC5375e;
import je.InterfaceC5376f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class V {
    public static Collection a(Object obj) {
        if ((obj instanceof InterfaceC5371a) && !(obj instanceof InterfaceC5372b)) {
            r(obj, "kotlin.collections.MutableCollection");
        }
        return f(obj);
    }

    public static Iterable b(Object obj) {
        if ((obj instanceof InterfaceC5371a) && !(obj instanceof InterfaceC5373c)) {
            r(obj, "kotlin.collections.MutableIterable");
        }
        return g(obj);
    }

    public static Map c(Object obj) {
        if ((obj instanceof InterfaceC5371a) && !(obj instanceof InterfaceC5375e)) {
            r(obj, "kotlin.collections.MutableMap");
        }
        return h(obj);
    }

    public static Set d(Object obj) {
        if ((obj instanceof InterfaceC5371a) && !(obj instanceof InterfaceC5376f)) {
            r(obj, "kotlin.collections.MutableSet");
        }
        return i(obj);
    }

    public static Object e(Object obj, int i10) {
        if (obj != null && !k(obj, i10)) {
            r(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static Collection f(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            throw q(e10);
        }
    }

    public static Iterable g(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e10) {
            throw q(e10);
        }
    }

    public static Map h(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw q(e10);
        }
    }

    public static Set i(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e10) {
            throw q(e10);
        }
    }

    public static int j(Object obj) {
        if (obj instanceof InterfaceC5500n) {
            return ((InterfaceC5500n) obj).getArity();
        }
        if (obj instanceof InterfaceC5082a) {
            return 0;
        }
        if (obj instanceof Function1) {
            return 1;
        }
        if (obj instanceof Function2) {
            return 2;
        }
        if (obj instanceof InterfaceC5096o) {
            return 3;
        }
        if (obj instanceof ie.p) {
            return 4;
        }
        if (obj instanceof ie.q) {
            return 5;
        }
        if (obj instanceof ie.r) {
            return 6;
        }
        if (obj instanceof ie.s) {
            return 7;
        }
        if (obj instanceof ie.t) {
            return 8;
        }
        if (obj instanceof ie.u) {
            return 9;
        }
        if (obj instanceof InterfaceC5083b) {
            return 10;
        }
        if (obj instanceof InterfaceC5084c) {
            return 11;
        }
        if (obj instanceof InterfaceC5085d) {
            return 12;
        }
        if (obj instanceof InterfaceC5086e) {
            return 13;
        }
        if (obj instanceof InterfaceC5087f) {
            return 14;
        }
        if (obj instanceof InterfaceC5088g) {
            return 15;
        }
        if (obj instanceof InterfaceC5089h) {
            return 16;
        }
        if (obj instanceof InterfaceC5090i) {
            return 17;
        }
        if (obj instanceof InterfaceC5091j) {
            return 18;
        }
        if (obj instanceof InterfaceC5092k) {
            return 19;
        }
        if (obj instanceof InterfaceC5093l) {
            return 20;
        }
        if (obj instanceof InterfaceC5094m) {
            return 21;
        }
        return obj instanceof InterfaceC5095n ? 22 : -1;
    }

    public static boolean k(Object obj, int i10) {
        return (obj instanceof InterfaceC2158i) && j(obj) == i10;
    }

    public static boolean l(Object obj) {
        if (obj instanceof List) {
            return !(obj instanceof InterfaceC5371a) || (obj instanceof InterfaceC5374d);
        }
        return false;
    }

    public static boolean m(Object obj) {
        if (obj instanceof Map) {
            return !(obj instanceof InterfaceC5371a) || (obj instanceof InterfaceC5375e);
        }
        return false;
    }

    public static boolean n(Object obj) {
        if (obj instanceof Map.Entry) {
            return !(obj instanceof InterfaceC5371a) || (obj instanceof InterfaceC5375e.a);
        }
        return false;
    }

    public static boolean o(Object obj) {
        if (obj instanceof Set) {
            return !(obj instanceof InterfaceC5371a) || (obj instanceof InterfaceC5376f);
        }
        return false;
    }

    private static Throwable p(Throwable th2) {
        return AbstractC5504s.n(th2, V.class.getName());
    }

    public static ClassCastException q(ClassCastException classCastException) {
        throw ((ClassCastException) p(classCastException));
    }

    public static void r(Object obj, String str) {
        s((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void s(String str) {
        throw q(new ClassCastException(str));
    }
}
