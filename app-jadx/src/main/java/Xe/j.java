package Xe;

import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class j {
    public static final b k(String str) {
        c cVarB = i.f21842a.b();
        f fVarM = f.m(str);
        AbstractC5504s.g(fVarM, "identifier(...)");
        return new b(cVarB, fVarM);
    }

    public static final b l(String str) {
        c cVarF = i.f21842a.f();
        f fVarM = f.m(str);
        AbstractC5504s.g(fVarM, "identifier(...)");
        return new b(cVarF, fVarM);
    }

    public static final b m(String str) {
        c cVarC = i.f21842a.c();
        f fVarM = f.m(str);
        AbstractC5504s.g(fVarM, "identifier(...)");
        return new b(cVarC, fVarM);
    }

    public static final b n(String str) {
        c cVarD = i.f21842a.d();
        f fVarM = f.m(str);
        AbstractC5504s.g(fVarM, "identifier(...)");
        return new b(cVarD, fVarM);
    }

    public static final b o(String str) {
        c cVarE = i.f21842a.e();
        f fVarM = f.m(str);
        AbstractC5504s.g(fVarM, "identifier(...)");
        return new b(cVarE, fVarM);
    }

    public static final Map p(Map map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5874j.e(S.e(AbstractC2279u.x(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            Pair pairA = z.a(entry.getValue(), entry.getKey());
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        return linkedHashMap;
    }

    public static final b q(f fVar) {
        i iVar = i.f21842a;
        c cVarF = iVar.a().f();
        f fVarM = f.m(fVar.h() + iVar.a().h().h());
        AbstractC5504s.g(fVarM, "identifier(...)");
        return new b(cVarF, fVarM);
    }

    public static final b r(String str) {
        c cVarG = i.f21842a.g();
        f fVarM = f.m(str);
        AbstractC5504s.g(fVarM, "identifier(...)");
        return new b(cVarG, fVarM);
    }

    public static final b s(String str) {
        c cVarH = i.f21842a.h();
        f fVarM = f.m(str);
        AbstractC5504s.g(fVarM, "identifier(...)");
        return new b(cVarH, fVarM);
    }

    public static final b t(b bVar) {
        c cVarF = i.f21842a.f();
        f fVarM = f.m('U' + bVar.h().h());
        AbstractC5504s.g(fVarM, "identifier(...)");
        return new b(cVarF, fVarM);
    }
}
