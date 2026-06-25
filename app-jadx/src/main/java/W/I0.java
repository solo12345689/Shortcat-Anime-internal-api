package w;

import i1.AbstractC5022o;
import i1.AbstractC5026s;
import i1.C5015h;
import i1.C5017j;
import i1.C5021n;
import i1.C5025r;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C5498l;
import r0.AbstractC6225g;
import r0.AbstractC6231m;
import r0.C6224f;
import r0.C6226h;
import r0.C6230l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C6226h f62365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f62366b;

    static {
        Float fValueOf = Float.valueOf(0.5f);
        f62365a = new C6226h(0.5f, 0.5f, 0.5f, 0.5f);
        s0 s0VarG = u0.g(kotlin.jvm.internal.r.f52290a);
        Float fValueOf2 = Float.valueOf(1.0f);
        Pair pairA = Td.z.a(s0VarG, fValueOf2);
        Pair pairA2 = Td.z.a(u0.e(C5025r.f48570b), fValueOf2);
        Pair pairA3 = Td.z.a(u0.d(C5021n.f48560b), fValueOf2);
        Pair pairA4 = Td.z.a(u0.f(C5498l.f52289a), Float.valueOf(0.01f));
        Pair pairA5 = Td.z.a(u0.i(C6226h.f58334e), fValueOf);
        Pair pairA6 = Td.z.a(u0.j(C6230l.f58350b), fValueOf);
        Pair pairA7 = Td.z.a(u0.h(C6224f.f58329b), fValueOf);
        s0 s0VarB = u0.b(C5015h.f48547b);
        Float fValueOf3 = Float.valueOf(0.1f);
        f62366b = Ud.S.l(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, Td.z.a(s0VarB, fValueOf3), Td.z.a(u0.c(C5017j.f48552b), fValueOf3));
    }

    public static final float a(C5015h.a aVar) {
        return C5015h.n(0.1f);
    }

    public static final int b(kotlin.jvm.internal.r rVar) {
        return 1;
    }

    public static final long c(C5021n.a aVar) {
        return AbstractC5022o.a(1, 1);
    }

    public static final long d(C5025r.a aVar) {
        return AbstractC5026s.a(1, 1);
    }

    public static final long e(C6224f.a aVar) {
        return AbstractC6225g.a(0.5f, 0.5f);
    }

    public static final long f(C6230l.a aVar) {
        return AbstractC6231m.a(0.5f, 0.5f);
    }

    public static final C6226h g(C6226h.a aVar) {
        return f62365a;
    }

    public static final Map h() {
        return f62366b;
    }
}
