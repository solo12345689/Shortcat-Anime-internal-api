package se;

import Td.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: se.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6479b {
    static {
        Object objB;
        try {
            u.a aVar = Td.u.f17466b;
            objB = Td.u.b(Class.forName("java.lang.ClassValue"));
        } catch (Throwable th2) {
            u.a aVar2 = Td.u.f17466b;
            objB = Td.u.b(Td.v.a(th2));
        }
        if (Td.u.h(objB)) {
            objB = Boolean.TRUE;
        }
        Object objB2 = Td.u.b(objB);
        Boolean bool = Boolean.FALSE;
        if (Td.u.g(objB2)) {
            objB2 = bool;
        }
        ((Boolean) objB2).getClass();
    }

    public static final AbstractC6477a a(Function1 compute) {
        AbstractC5504s.h(compute, "compute");
        return new C6493i(compute);
    }
}
