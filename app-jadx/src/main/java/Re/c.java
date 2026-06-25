package re;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC5504s;
import pe.AbstractC6034x;
import pe.InterfaceC6018h;
import pe.InterfaceC6019i;
import pe.InterfaceC6023m;
import pe.InterfaceC6027q;
import se.AbstractC6453A;
import se.K0;
import se.U0;
import se.j1;
import te.h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final Constructor a(InterfaceC6018h interfaceC6018h) {
        h hVarT;
        AbstractC5504s.h(interfaceC6018h, "<this>");
        AbstractC6453A abstractC6453AB = j1.b(interfaceC6018h);
        Member memberB = (abstractC6453AB == null || (hVarT = abstractC6453AB.T()) == null) ? null : hVarT.b();
        if (memberB instanceof Constructor) {
            return (Constructor) memberB;
        }
        return null;
    }

    public static final Field b(InterfaceC6023m interfaceC6023m) {
        AbstractC5504s.h(interfaceC6023m, "<this>");
        K0 k0D = j1.d(interfaceC6023m);
        if (k0D != null) {
            return k0D.k0();
        }
        return null;
    }

    public static final Method c(InterfaceC6023m interfaceC6023m) {
        AbstractC5504s.h(interfaceC6023m, "<this>");
        return d(interfaceC6023m.j0());
    }

    public static final Method d(InterfaceC6018h interfaceC6018h) {
        h hVarT;
        AbstractC5504s.h(interfaceC6018h, "<this>");
        AbstractC6453A abstractC6453AB = j1.b(interfaceC6018h);
        Member memberB = (abstractC6453AB == null || (hVarT = abstractC6453AB.T()) == null) ? null : hVarT.b();
        if (memberB instanceof Method) {
            return (Method) memberB;
        }
        return null;
    }

    public static final Method e(InterfaceC6019i interfaceC6019i) {
        AbstractC5504s.h(interfaceC6019i, "<this>");
        return d(interfaceC6019i.g());
    }

    public static final Type f(InterfaceC6027q interfaceC6027q) {
        AbstractC5504s.h(interfaceC6027q, "<this>");
        Type typeF = ((U0) interfaceC6027q).f();
        return typeF == null ? AbstractC6034x.f(interfaceC6027q) : typeF;
    }
}
