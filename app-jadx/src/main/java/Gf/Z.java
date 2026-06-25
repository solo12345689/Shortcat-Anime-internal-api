package Gf;

import Zd.i;
import ae.AbstractC2605b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class Z {
    public static final Object a(long j10, Zd.e eVar) {
        if (j10 <= 0) {
            return Td.L.f17438a;
        }
        C1627p c1627p = new C1627p(AbstractC2605b.c(eVar), 1);
        c1627p.C();
        if (j10 < Long.MAX_VALUE) {
            c(c1627p.getContext()).G0(j10, c1627p);
        }
        Object objV = c1627p.v();
        if (objV == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objV == AbstractC2605b.f() ? objV : Td.L.f17438a;
    }

    public static final Object b(long j10, Zd.e eVar) {
        Object objA = a(d(j10), eVar);
        return objA == AbstractC2605b.f() ? objA : Td.L.f17438a;
    }

    public static final Y c(Zd.i iVar) {
        i.b bVarL = iVar.l(Zd.f.f23273S);
        Y y10 = bVarL instanceof Y ? (Y) bVarL : null;
        return y10 == null ? V.a() : y10;
    }

    public static final long d(long j10) {
        boolean zK = Ef.a.K(j10);
        if (zK) {
            return Ef.a.w(Ef.a.L(j10, Ef.c.t(999999L, Ef.d.f5968b)));
        }
        if (zK) {
            throw new Td.r();
        }
        return 0L;
    }
}
