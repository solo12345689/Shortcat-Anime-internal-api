package K;

import U0.C2197e;
import U0.S0;
import U0.T0;
import U0.Y0;
import Y0.AbstractC2485u;
import i1.C5009b;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Y {
    public static final boolean a(T0 t02, C2197e c2197e, Y0 y02, List list, int i10, boolean z10, int i11, InterfaceC5011d interfaceC5011d, EnumC5027t enumC5027t, AbstractC2485u.b bVar, long j10) {
        S0 s0L = t02.l();
        if (t02.w().m().a() || !AbstractC5504s.c(s0L.j(), c2197e) || !s0L.i().I(y02) || !AbstractC5504s.c(s0L.g(), list) || s0L.e() != i10 || s0L.h() != z10 || !g1.v.g(s0L.f(), i11) || !AbstractC5504s.c(s0L.b(), interfaceC5011d) || s0L.d() != enumC5027t || !AbstractC5504s.c(s0L.c(), bVar) || C5009b.n(j10) != C5009b.n(s0L.a())) {
            return false;
        }
        if (z10 || g1.v.g(i11, g1.v.f47323a.b())) {
            return C5009b.l(j10) == C5009b.l(s0L.a()) && C5009b.k(j10) == C5009b.k(s0L.a());
        }
        return true;
    }
}
