package Vh;

import Yh.A;
import Yh.w;
import Yh.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class n implements Zh.b, Wh.i {

    /* JADX INFO: renamed from: a */
    private final BitSet f20448a;

    /* JADX INFO: renamed from: b */
    private final Map f20449b;

    /* JADX INFO: renamed from: c */
    private final Zh.c f20450c;

    /* JADX INFO: renamed from: d */
    private final Map f20451d;

    /* JADX INFO: renamed from: e */
    private Wh.m f20452e;

    /* JADX INFO: renamed from: f */
    private boolean f20453f;

    /* JADX INFO: renamed from: g */
    private int f20454g;

    /* JADX INFO: renamed from: h */
    private f f20455h;

    /* JADX INFO: renamed from: i */
    private e f20456i;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a {

        /* JADX INFO: renamed from: a */
        final List f20457a;

        /* JADX INFO: renamed from: b */
        final boolean f20458b;

        /* JADX INFO: renamed from: c */
        final boolean f20459c;

        a(List list, boolean z10, boolean z11) {
            this.f20457a = list;
            this.f20459c = z10;
            this.f20458b = z11;
        }
    }

    public n(Zh.c cVar) {
        Map mapF = f(cVar.b());
        this.f20449b = mapF;
        this.f20450c = cVar;
        HashMap map = new HashMap();
        this.f20451d = map;
        map.put('\\', Collections.singletonList(new Wh.c()));
        map.put('`', Collections.singletonList(new Wh.d()));
        map.put('&', Collections.singletonList(new Wh.f()));
        map.put('<', Arrays.asList(new Wh.b(), new Wh.g()));
        this.f20448a = g(mapF.keySet(), map.keySet());
    }

    private a B(bi.a aVar, char c10) {
        boolean z10;
        int iN = this.f20452e.n();
        Wh.l lVarO = this.f20452e.o();
        if (this.f20452e.g(c10) < aVar.b()) {
            this.f20452e.q(lVarO);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        this.f20452e.q(lVarO);
        while (this.f20452e.i(c10)) {
            Wh.m mVar = this.f20452e;
            arrayList.add(C(mVar.d(lVarO, mVar.o())));
            lVarO = this.f20452e.o();
        }
        int iM = this.f20452e.m();
        boolean z11 = iN == 0 || Xh.f.i(iN);
        boolean z12 = iN == 0 || Xh.f.k(iN);
        boolean z13 = iM == 0 || Xh.f.i(iM);
        boolean z14 = iM == 0 || Xh.f.k(iM);
        boolean z15 = !z14 && (!z13 || z12 || z11);
        boolean z16 = !z12 && (!z11 || z14 || z13);
        if (c10 == '_') {
            z10 = z15 && (!z16 || z11);
            if (!z16 || (z15 && !z13)) {
                z = false;
            }
        } else {
            boolean z17 = z15 && c10 == aVar.c();
            z = z16 && c10 == aVar.a();
            z10 = z17;
        }
        return new a(arrayList, z10, z);
    }

    private A C(Zh.g gVar) {
        A a10 = new A(gVar.c());
        a10.k(gVar.e());
        return a10;
    }

    private void c(e eVar) {
        e eVar2 = this.f20456i;
        if (eVar2 != null) {
            eVar2.f20403h = true;
        }
        this.f20456i = eVar;
    }

    private static void d(char c10, bi.a aVar, Map map) {
        if (((bi.a) map.put(Character.valueOf(c10), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    private static void e(Iterable iterable, Map map) {
        t tVar;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            bi.a aVar = (bi.a) it.next();
            char c10 = aVar.c();
            char cA = aVar.a();
            if (c10 == cA) {
                bi.a aVar2 = (bi.a) map.get(Character.valueOf(c10));
                if (aVar2 == null || aVar2.c() != aVar2.a()) {
                    d(c10, aVar, map);
                } else {
                    if (aVar2 instanceof t) {
                        tVar = (t) aVar2;
                    } else {
                        t tVar2 = new t(c10);
                        tVar2.e(aVar2);
                        tVar = tVar2;
                    }
                    tVar.e(aVar);
                    map.put(Character.valueOf(c10), tVar);
                }
            } else {
                d(c10, aVar, map);
                d(cA, aVar, map);
            }
        }
    }

    public static Map f(List list) {
        HashMap map = new HashMap();
        e(Arrays.asList(new Wh.a(), new Wh.n()), map);
        e(list, map);
        return map;
    }

    public static BitSet g(Set set, Set set2) {
        BitSet bitSet = new BitSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            bitSet.set(((Character) it2.next()).charValue());
        }
        bitSet.set(91);
        bitSet.set(93);
        bitSet.set(33);
        bitSet.set(10);
        return bitSet;
    }

    private void h(Yh.s sVar) {
        if (sVar.c() == null) {
            return;
        }
        j(sVar.c(), sVar.d());
    }

    private void i(A a10, A a11, int i10) {
        y yVar;
        if (a10 == null || a11 == null || a10 == a11) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(a10.n());
        if (this.f20453f) {
            yVar = new y();
            yVar.a(a10.g());
        } else {
            yVar = null;
        }
        Yh.s sVarE = a10.e();
        Yh.s sVarE2 = a11.e();
        while (sVarE != sVarE2) {
            sb2.append(((A) sVarE).n());
            if (yVar != null) {
                yVar.a(sVarE.g());
            }
            Yh.s sVarE3 = sVarE.e();
            sVarE.m();
            sVarE = sVarE3;
        }
        a10.o(sb2.toString());
        if (yVar != null) {
            a10.k(yVar.d());
        }
    }

    private void j(Yh.s sVar, Yh.s sVar2) {
        A a10 = null;
        A a11 = null;
        int length = 0;
        while (sVar != null) {
            if (sVar instanceof A) {
                a11 = (A) sVar;
                if (a10 == null) {
                    a10 = a11;
                }
                length += a11.n().length();
            } else {
                i(a10, a11, length);
                h(sVar);
                a10 = null;
                a11 = null;
                length = 0;
            }
            if (sVar == sVar2) {
                break;
            } else {
                sVar = sVar.e();
            }
        }
        i(a10, a11, length);
    }

    private Yh.s k() {
        Wh.l lVarO = this.f20452e.o();
        this.f20452e.h();
        if (!this.f20452e.i('[')) {
            Wh.m mVar = this.f20452e;
            return C(mVar.d(lVarO, mVar.o()));
        }
        Wh.l lVarO2 = this.f20452e.o();
        A aC = C(this.f20452e.d(lVarO, lVarO2));
        c(e.a(aC, lVarO, lVarO2, this.f20456i, this.f20455h));
        return aC;
    }

    private Yh.s l() {
        String strP;
        Yh.p pVarA;
        Wh.l lVarO = this.f20452e.o();
        this.f20452e.h();
        Wh.l lVarO2 = this.f20452e.o();
        e eVar = this.f20456i;
        if (eVar == null) {
            return C(this.f20452e.d(lVarO, lVarO2));
        }
        if (!eVar.f20402g) {
            z();
            return C(this.f20452e.d(lVarO, lVarO2));
        }
        String strN = null;
        if (this.f20452e.i('(')) {
            this.f20452e.r();
            String strP2 = p(this.f20452e);
            if (strP2 == null) {
                this.f20452e.q(lVarO2);
                strP = null;
            } else {
                if (this.f20452e.r() >= 1) {
                    strP = r(this.f20452e);
                    this.f20452e.r();
                } else {
                    strP = null;
                }
                if (!this.f20452e.i(')')) {
                    this.f20452e.q(lVarO2);
                    strP = null;
                }
            }
            strN = strP2;
        } else {
            strP = null;
        }
        if (strN == null) {
            String strQ = q(this.f20452e);
            if (strQ == null) {
                this.f20452e.q(lVarO2);
            }
            if ((strQ == null || strQ.isEmpty()) && !eVar.f20403h) {
                strQ = this.f20452e.d(eVar.f20398c, lVarO).c();
            }
            if (strQ != null && (pVarA = this.f20450c.a(strQ)) != null) {
                strN = pVarA.n();
                strP = pVarA.p();
            }
        }
        if (strN == null) {
            z();
            this.f20452e.q(lVarO2);
            return C(this.f20452e.d(lVarO, lVarO2));
        }
        Yh.s mVar = eVar.f20399d ? new Yh.m(strN, strP) : new Yh.o(strN, strP);
        Yh.s sVarE = eVar.f20396a.e();
        while (sVarE != null) {
            Yh.s sVarE2 = sVarE.e();
            mVar.b(sVarE);
            sVarE = sVarE2;
        }
        if (this.f20453f) {
            Wh.m mVar2 = this.f20452e;
            mVar.k(mVar2.d(eVar.f20397b, mVar2.o()).e());
        }
        u(eVar.f20401f);
        h(mVar);
        eVar.f20396a.m();
        z();
        if (!eVar.f20399d) {
            for (e eVar2 = this.f20456i; eVar2 != null; eVar2 = eVar2.f20400e) {
                if (!eVar2.f20399d) {
                    eVar2.f20402g = false;
                }
            }
        }
        return mVar;
    }

    private List m(bi.a aVar, char c10) {
        a aVarB = B(aVar, c10);
        if (aVarB == null) {
            return null;
        }
        List list = aVarB.f20457a;
        f fVar = new f(list, c10, aVarB.f20459c, aVarB.f20458b, this.f20455h);
        this.f20455h = fVar;
        f fVar2 = fVar.f20409f;
        if (fVar2 != null) {
            fVar2.f20410g = fVar;
        }
        return list;
    }

    private List n() {
        List listM;
        char cL = this.f20452e.l();
        if (cL == 0) {
            return null;
        }
        if (cL == '\n') {
            return Collections.singletonList(o());
        }
        if (cL == '!') {
            return Collections.singletonList(k());
        }
        if (cL == '[') {
            return Collections.singletonList(s());
        }
        if (cL == ']') {
            return Collections.singletonList(l());
        }
        if (!this.f20448a.get(cL)) {
            return Collections.singletonList(t());
        }
        List list = (List) this.f20451d.get(Character.valueOf(cL));
        if (list != null) {
            Wh.l lVarO = this.f20452e.o();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Wh.j jVarA = ((Wh.h) it.next()).a(this);
                if (jVarA instanceof Wh.k) {
                    Wh.k kVar = (Wh.k) jVarA;
                    Yh.s sVarC = kVar.c();
                    this.f20452e.q(kVar.d());
                    if (this.f20453f && sVarC.g().isEmpty()) {
                        Wh.m mVar = this.f20452e;
                        sVarC.k(mVar.d(lVarO, mVar.o()).e());
                    }
                    return Collections.singletonList(sVarC);
                }
                this.f20452e.q(lVarO);
            }
        }
        bi.a aVar = (bi.a) this.f20449b.get(Character.valueOf(cL));
        return (aVar == null || (listM = m(aVar, cL)) == null) ? Collections.singletonList(t()) : listM;
    }

    private Yh.s o() {
        this.f20452e.h();
        return this.f20454g >= 2 ? new Yh.i() : new w();
    }

    private String p(Wh.m mVar) {
        String strC;
        char cL = mVar.l();
        Wh.l lVarO = mVar.o();
        if (!Xh.e.a(mVar)) {
            return null;
        }
        if (cL == '<') {
            String strC2 = mVar.d(lVarO, mVar.o()).c();
            strC = strC2.substring(1, strC2.length() - 1);
        } else {
            strC = mVar.d(lVarO, mVar.o()).c();
        }
        return Xh.c.d(strC);
    }

    private String r(Wh.m mVar) {
        Wh.l lVarO = mVar.o();
        if (!Xh.e.d(mVar)) {
            return null;
        }
        String strC = mVar.d(lVarO, mVar.o()).c();
        return Xh.c.d(strC.substring(1, strC.length() - 1));
    }

    private Yh.s s() {
        Wh.l lVarO = this.f20452e.o();
        this.f20452e.h();
        Wh.l lVarO2 = this.f20452e.o();
        A aC = C(this.f20452e.d(lVarO, lVarO2));
        c(e.b(aC, lVarO, lVarO2, this.f20456i, this.f20455h));
        return aC;
    }

    private Yh.s t() {
        char cL;
        Wh.l lVarO = this.f20452e.o();
        this.f20452e.h();
        while (true) {
            cL = this.f20452e.l();
            if (cL == 0 || this.f20448a.get(cL)) {
                break;
            }
            this.f20452e.h();
        }
        Wh.m mVar = this.f20452e;
        Zh.g gVarD = mVar.d(lVarO, mVar.o());
        String strC = gVarD.c();
        if (cL == '\n') {
            int iN = Xh.f.n(' ', strC, strC.length() - 1, 0) + 1;
            this.f20454g = strC.length() - iN;
            strC = strC.substring(0, iN);
        } else if (cL == 0) {
            strC = strC.substring(0, Xh.f.p(strC, strC.length() - 1, 0) + 1);
        }
        A a10 = new A(strC);
        a10.k(gVarD.e());
        return a10;
    }

    private void u(f fVar) {
        boolean z10;
        HashMap map = new HashMap();
        f fVar2 = this.f20455h;
        while (fVar2 != null) {
            f fVar3 = fVar2.f20409f;
            if (fVar3 == fVar) {
                break;
            } else {
                fVar2 = fVar3;
            }
        }
        while (fVar2 != null) {
            char c10 = fVar2.f20405b;
            bi.a aVar = (bi.a) this.f20449b.get(Character.valueOf(c10));
            if (!fVar2.c() || aVar == null) {
                fVar2 = fVar2.f20410g;
            } else {
                char c11 = aVar.c();
                f fVar4 = fVar2.f20409f;
                int iD = 0;
                boolean z11 = false;
                while (fVar4 != null && fVar4 != fVar && fVar4 != map.get(Character.valueOf(c10))) {
                    if (fVar4.g() && fVar4.f20405b == c11) {
                        iD = aVar.d(fVar4, fVar2);
                        if (iD > 0) {
                            z10 = true;
                            z11 = true;
                            break;
                        }
                        z11 = true;
                    }
                    fVar4 = fVar4.f20409f;
                }
                z10 = false;
                if (z10) {
                    for (int i10 = 0; i10 < iD; i10++) {
                        List list = fVar4.f20404a;
                        ((A) list.remove(list.size() - 1)).m();
                    }
                    for (int i11 = 0; i11 < iD; i11++) {
                        ((A) fVar2.f20404a.remove(0)).m();
                    }
                    y(fVar4, fVar2);
                    if (fVar4.length() == 0) {
                        w(fVar4);
                    }
                    if (fVar2.length() == 0) {
                        f fVar5 = fVar2.f20410g;
                        w(fVar2);
                        fVar2 = fVar5;
                    }
                } else {
                    if (!z11) {
                        map.put(Character.valueOf(c10), fVar2.f20409f);
                        if (!fVar2.g()) {
                            x(fVar2);
                        }
                    }
                    fVar2 = fVar2.f20410g;
                }
            }
        }
        while (true) {
            f fVar6 = this.f20455h;
            if (fVar6 == null || fVar6 == fVar) {
                return;
            } else {
                x(fVar6);
            }
        }
    }

    private void v(f fVar) {
        f fVar2 = fVar.f20409f;
        if (fVar2 != null) {
            fVar2.f20410g = fVar.f20410g;
        }
        f fVar3 = fVar.f20410g;
        if (fVar3 == null) {
            this.f20455h = fVar2;
        } else {
            fVar3.f20409f = fVar2;
        }
    }

    private void w(f fVar) {
        v(fVar);
    }

    private void x(f fVar) {
        v(fVar);
    }

    private void y(f fVar, f fVar2) {
        f fVar3 = fVar2.f20409f;
        while (fVar3 != null && fVar3 != fVar) {
            f fVar4 = fVar3.f20409f;
            x(fVar3);
            fVar3 = fVar4;
        }
    }

    private void z() {
        this.f20456i = this.f20456i.f20400e;
    }

    void A(Zh.g gVar) {
        this.f20452e = Wh.m.k(gVar);
        this.f20453f = !gVar.e().isEmpty();
        this.f20454g = 0;
        this.f20455h = null;
        this.f20456i = null;
    }

    @Override // Wh.i
    public Wh.m a() {
        return this.f20452e;
    }

    @Override // Zh.b
    public void b(Zh.g gVar, Yh.s sVar) {
        A(gVar);
        while (true) {
            List listN = n();
            if (listN == null) {
                u(null);
                h(sVar);
                return;
            } else {
                Iterator it = listN.iterator();
                while (it.hasNext()) {
                    sVar.b((Yh.s) it.next());
                }
            }
        }
    }

    String q(Wh.m mVar) {
        if (!mVar.i('[')) {
            return null;
        }
        Wh.l lVarO = mVar.o();
        if (!Xh.e.c(mVar)) {
            return null;
        }
        Wh.l lVarO2 = mVar.o();
        if (!mVar.i(']')) {
            return null;
        }
        String strC = mVar.d(lVarO, lVarO2).c();
        if (strC.length() > 999) {
            return null;
        }
        return strC;
    }
}
