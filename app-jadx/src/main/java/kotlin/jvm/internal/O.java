package kotlin.jvm.internal;

import Ud.AbstractC2273n;
import java.util.Arrays;
import java.util.Collections;
import pe.C6029s;
import pe.InterfaceC6014d;
import pe.InterfaceC6017g;
import pe.InterfaceC6018h;
import pe.InterfaceC6020j;
import pe.InterfaceC6021k;
import pe.InterfaceC6024n;
import pe.InterfaceC6025o;
import pe.InterfaceC6026p;
import pe.InterfaceC6027q;
import se.b1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class O {

    /* JADX INFO: renamed from: a */
    private static final P f52260a;

    /* JADX INFO: renamed from: b */
    private static final InterfaceC6014d[] f52261b;

    static {
        P p10 = null;
        try {
            p10 = (P) b1.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (p10 == null) {
            p10 = new P();
        }
        f52260a = p10;
        f52261b = new InterfaceC6014d[0];
    }

    public static InterfaceC6018h a(AbstractC5501o abstractC5501o) {
        return f52260a.a(abstractC5501o);
    }

    public static InterfaceC6014d b(Class cls) {
        return f52260a.b(cls);
    }

    public static InterfaceC6017g c(Class cls) {
        return f52260a.c(cls, "");
    }

    public static InterfaceC6020j d(AbstractC5508w abstractC5508w) {
        return f52260a.d(abstractC5508w);
    }

    public static InterfaceC6021k e(AbstractC5510y abstractC5510y) {
        return f52260a.e(abstractC5510y);
    }

    public static InterfaceC6027q f(Class cls) {
        return f52260a.k(b(cls), Collections.EMPTY_LIST, true);
    }

    public static InterfaceC6027q g(Class cls, C6029s c6029s) {
        return f52260a.k(b(cls), Collections.singletonList(c6029s), true);
    }

    public static InterfaceC6027q h(Class cls, C6029s c6029s, C6029s c6029s2) {
        return f52260a.k(b(cls), Arrays.asList(c6029s, c6029s2), true);
    }

    public static InterfaceC6027q i(Class cls, C6029s... c6029sArr) {
        return f52260a.k(b(cls), AbstractC2273n.V0(c6029sArr), true);
    }

    public static InterfaceC6024n j(C c10) {
        return f52260a.f(c10);
    }

    public static InterfaceC6025o k(E e10) {
        return f52260a.g(e10);
    }

    public static InterfaceC6026p l(G g10) {
        return f52260a.h(g10);
    }

    public static String m(InterfaceC5500n interfaceC5500n) {
        return f52260a.i(interfaceC5500n);
    }

    public static String n(AbstractC5506u abstractC5506u) {
        return f52260a.j(abstractC5506u);
    }

    public static InterfaceC6027q o(Class cls) {
        return f52260a.k(b(cls), Collections.EMPTY_LIST, false);
    }

    public static InterfaceC6027q p(Class cls, C6029s c6029s) {
        return f52260a.k(b(cls), Collections.singletonList(c6029s), false);
    }

    public static InterfaceC6027q q(Class cls, C6029s c6029s, C6029s c6029s2) {
        return f52260a.k(b(cls), Arrays.asList(c6029s, c6029s2), false);
    }
}
