package He;

import Pe.C2027l;
import Pe.EnumC2026k;
import Ud.AbstractC2279u;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class x {

    /* JADX INFO: renamed from: a */
    private static final List f8582a;

    /* JADX INFO: renamed from: b */
    private static final List f8583b;

    /* JADX INFO: renamed from: c */
    private static final Map f8584c;

    /* JADX INFO: renamed from: d */
    private static final Map f8585d;

    /* JADX INFO: renamed from: e */
    private static final Map f8586e;

    static {
        EnumC1656c enumC1656c = EnumC1656c.f8549d;
        EnumC1656c enumC1656c2 = EnumC1656c.f8547b;
        EnumC1656c enumC1656c3 = EnumC1656c.f8548c;
        List listP = AbstractC2279u.p(enumC1656c, enumC1656c2, enumC1656c3, EnumC1656c.f8551f, EnumC1656c.f8550e);
        f8582a = listP;
        List listE = AbstractC2279u.e(enumC1656c3);
        f8583b = listE;
        Xe.c cVarK = J.k();
        EnumC2026k enumC2026k = EnumC2026k.f13900c;
        Map mapL = Ud.S.l(Td.z.a(cVarK, new w(new C2027l(enumC2026k, false, 2, null), listP, false)), Td.z.a(J.i(), new w(new C2027l(enumC2026k, false, 2, null), listP, false)), Td.z.a(J.j(), new w(new C2027l(EnumC2026k.f13898a, false, 2, null), listP, false, 4, null)));
        f8584c = mapL;
        Map mapL2 = Ud.S.l(Td.z.a(J.d(), new w(new C2027l(enumC2026k, false, 2, null), listE, false, 4, null)), Td.z.a(J.e(), new w(new C2027l(EnumC2026k.f13899b, false, 2, null), listE, false, 4, null)));
        f8585d = mapL2;
        f8586e = Ud.S.p(mapL, mapL2);
    }

    public static final Map a() {
        return f8586e;
    }

    public static final Map b() {
        return f8584c;
    }
}
