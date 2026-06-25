package u1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import t1.AbstractC6597j;
import t1.C6592e;
import t1.C6593f;
import t1.C6595h;
import u1.C6718b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C6593f f61141a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C6593f f61144d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f61142b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f61143c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f61145e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList f61146f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C6718b.InterfaceC0913b f61147g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C6718b.a f61148h = new C6718b.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ArrayList f61149i = new ArrayList();

    public e(C6593f c6593f) {
        this.f61141a = c6593f;
        this.f61144d = c6593f;
    }

    private void a(f fVar, int i10, int i11, f fVar2, ArrayList arrayList, m mVar) {
        int i12;
        f fVar3;
        ArrayList arrayList2;
        p pVar = fVar.f61153d;
        if (pVar.f61204c == null) {
            C6593f c6593f = this.f61141a;
            if (pVar == c6593f.f60361e || pVar == c6593f.f60363f) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i11);
                arrayList.add(mVar);
            }
            m mVar2 = mVar;
            pVar.f61204c = mVar2;
            mVar2.a(pVar);
            for (d dVar : pVar.f61209h.f61160k) {
                if (dVar instanceof f) {
                    i12 = i10;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                    a((f) dVar, i12, 0, fVar3, arrayList2, mVar2);
                } else {
                    i12 = i10;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                }
                i10 = i12;
                fVar2 = fVar3;
                arrayList = arrayList2;
            }
            int i13 = i10;
            f fVar4 = fVar2;
            ArrayList arrayList3 = arrayList;
            for (d dVar2 : pVar.f61210i.f61160k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i13, 1, fVar4, arrayList3, mVar2);
                }
            }
            if (i13 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).f61185k.f61160k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i13, 2, fVar4, arrayList3, mVar2);
                    }
                }
            }
            for (f fVar5 : pVar.f61209h.f61161l) {
                if (fVar5 == fVar4) {
                    mVar2.f61179b = true;
                }
                a(fVar5, i13, 0, fVar4, arrayList3, mVar2);
            }
            for (f fVar6 : pVar.f61210i.f61161l) {
                if (fVar6 == fVar4) {
                    mVar2.f61179b = true;
                }
                a(fVar6, i13, 1, fVar4, arrayList3, mVar2);
            }
            if (i13 == 1 && (pVar instanceof n)) {
                Iterator it = ((n) pVar).f61185k.f61161l.iterator();
                while (it.hasNext()) {
                    a((f) it.next(), i13, 2, fVar4, arrayList3, mVar2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x0284 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean b(t1.C6593f r20) {
        /*
            Method dump skipped, instruction units count: 833
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.e.b(t1.f):boolean");
    }

    private int e(C6593f c6593f, int i10) {
        int size = this.f61149i.size();
        long jMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            jMax = Math.max(jMax, ((m) this.f61149i.get(i11)).b(c6593f, i10));
        }
        return (int) jMax;
    }

    private void i(p pVar, int i10, ArrayList arrayList) {
        for (d dVar : pVar.f61209h.f61160k) {
            if (dVar instanceof f) {
                a((f) dVar, i10, 0, pVar.f61210i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f61209h, i10, 0, pVar.f61210i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.f61210i.f61160k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i10, 1, pVar.f61209h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f61210i, i10, 1, pVar.f61209h, arrayList, null);
            }
        }
        int i11 = i10;
        if (i11 == 1) {
            for (d dVar3 : ((n) pVar).f61185k.f61160k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i11, 2, null, arrayList, null);
                }
                i11 = i10;
            }
        }
    }

    private void l(C6592e c6592e, C6592e.b bVar, int i10, C6592e.b bVar2, int i11) {
        C6718b.a aVar = this.f61148h;
        aVar.f61129a = bVar;
        aVar.f61130b = bVar2;
        aVar.f61131c = i10;
        aVar.f61132d = i11;
        this.f61147g.b(c6592e, aVar);
        c6592e.g1(this.f61148h.f61133e);
        c6592e.H0(this.f61148h.f61134f);
        c6592e.G0(this.f61148h.f61136h);
        c6592e.w0(this.f61148h.f61135g);
    }

    public void c() {
        d(this.f61145e);
        this.f61149i.clear();
        m.f61177h = 0;
        i(this.f61141a.f60361e, 0, this.f61149i);
        i(this.f61141a.f60363f, 1, this.f61149i);
        this.f61142b = false;
    }

    public void d(ArrayList arrayList) {
        arrayList.clear();
        this.f61144d.f60361e.f();
        this.f61144d.f60363f.f();
        arrayList.add(this.f61144d.f60361e);
        arrayList.add(this.f61144d.f60363f);
        HashSet hashSet = null;
        for (C6592e c6592e : this.f61144d.f60509L0) {
            if (c6592e instanceof C6595h) {
                arrayList.add(new j(c6592e));
            } else {
                if (c6592e.h0()) {
                    if (c6592e.f60357c == null) {
                        c6592e.f60357c = new c(c6592e, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c6592e.f60357c);
                } else {
                    arrayList.add(c6592e.f60361e);
                }
                if (c6592e.j0()) {
                    if (c6592e.f60359d == null) {
                        c6592e.f60359d = new c(c6592e, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c6592e.f60359d);
                } else {
                    arrayList.add(c6592e.f60363f);
                }
                if (c6592e instanceof AbstractC6597j) {
                    arrayList.add(new k(c6592e));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((p) it.next()).f();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            p pVar = (p) it2.next();
            if (pVar.f61203b != this.f61144d) {
                pVar.d();
            }
        }
    }

    public boolean f(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (this.f61142b || this.f61143c) {
            for (C6592e c6592e : this.f61141a.f60509L0) {
                c6592e.n();
                c6592e.f60353a = false;
                c6592e.f60361e.r();
                c6592e.f60363f.q();
            }
            this.f61141a.n();
            C6593f c6593f = this.f61141a;
            c6593f.f60353a = false;
            c6593f.f60361e.r();
            this.f61141a.f60363f.q();
            this.f61143c = false;
        }
        if (b(this.f61144d)) {
            return false;
        }
        this.f61141a.i1(0);
        this.f61141a.j1(0);
        C6592e.b bVarU = this.f61141a.u(0);
        C6592e.b bVarU2 = this.f61141a.u(1);
        if (this.f61142b) {
            c();
        }
        int iW = this.f61141a.W();
        int iX = this.f61141a.X();
        this.f61141a.f60361e.f61209h.d(iW);
        this.f61141a.f60363f.f61209h.d(iX);
        m();
        C6592e.b bVar = C6592e.b.WRAP_CONTENT;
        if (bVarU == bVar || bVarU2 == bVar) {
            if (z10) {
                Iterator it = this.f61145e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!((p) it.next()).m()) {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10 && bVarU == C6592e.b.WRAP_CONTENT) {
                this.f61141a.L0(C6592e.b.FIXED);
                C6593f c6593f2 = this.f61141a;
                c6593f2.g1(e(c6593f2, 0));
                C6593f c6593f3 = this.f61141a;
                c6593f3.f60361e.f61206e.d(c6593f3.V());
            }
            if (z10 && bVarU2 == C6592e.b.WRAP_CONTENT) {
                this.f61141a.c1(C6592e.b.FIXED);
                C6593f c6593f4 = this.f61141a;
                c6593f4.H0(e(c6593f4, 1));
                C6593f c6593f5 = this.f61141a;
                c6593f5.f60363f.f61206e.d(c6593f5.x());
            }
        }
        C6593f c6593f6 = this.f61141a;
        C6592e.b bVar2 = c6593f6.f60352Z[0];
        C6592e.b bVar3 = C6592e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == C6592e.b.MATCH_PARENT) {
            int iV = c6593f6.V() + iW;
            this.f61141a.f60361e.f61210i.d(iV);
            this.f61141a.f60361e.f61206e.d(iV - iW);
            m();
            C6593f c6593f7 = this.f61141a;
            C6592e.b bVar4 = c6593f7.f60352Z[1];
            if (bVar4 == bVar3 || bVar4 == C6592e.b.MATCH_PARENT) {
                int iX2 = c6593f7.x() + iX;
                this.f61141a.f60363f.f61210i.d(iX2);
                this.f61141a.f60363f.f61206e.d(iX2 - iX);
            }
            m();
            z11 = true;
        } else {
            z11 = false;
        }
        for (p pVar : this.f61145e) {
            if (pVar.f61203b != this.f61141a || pVar.f61208g) {
                pVar.e();
            }
        }
        Iterator it2 = this.f61145e.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z12 = true;
                break;
            }
            p pVar2 = (p) it2.next();
            if (z11 || pVar2.f61203b != this.f61141a) {
                if (!pVar2.f61209h.f61159j || ((!pVar2.f61210i.f61159j && !(pVar2 instanceof j)) || (!pVar2.f61206e.f61159j && !(pVar2 instanceof c) && !(pVar2 instanceof j)))) {
                    break;
                }
            }
        }
        this.f61141a.L0(bVarU);
        this.f61141a.c1(bVarU2);
        return z12;
    }

    public boolean g(boolean z10) {
        if (this.f61142b) {
            for (C6592e c6592e : this.f61141a.f60509L0) {
                c6592e.n();
                c6592e.f60353a = false;
                l lVar = c6592e.f60361e;
                lVar.f61206e.f61159j = false;
                lVar.f61208g = false;
                lVar.r();
                n nVar = c6592e.f60363f;
                nVar.f61206e.f61159j = false;
                nVar.f61208g = false;
                nVar.q();
            }
            this.f61141a.n();
            C6593f c6593f = this.f61141a;
            c6593f.f60353a = false;
            l lVar2 = c6593f.f60361e;
            lVar2.f61206e.f61159j = false;
            lVar2.f61208g = false;
            lVar2.r();
            n nVar2 = this.f61141a.f60363f;
            nVar2.f61206e.f61159j = false;
            nVar2.f61208g = false;
            nVar2.q();
            c();
        }
        if (b(this.f61144d)) {
            return false;
        }
        this.f61141a.i1(0);
        this.f61141a.j1(0);
        this.f61141a.f60361e.f61209h.d(0);
        this.f61141a.f60363f.f61209h.d(0);
        return true;
    }

    public boolean h(boolean z10, int i10) {
        boolean z11;
        C6592e.b bVar;
        boolean z12 = false;
        C6592e.b bVarU = this.f61141a.u(0);
        C6592e.b bVarU2 = this.f61141a.u(1);
        int iW = this.f61141a.W();
        int iX = this.f61141a.X();
        if (z10 && (bVarU == (bVar = C6592e.b.WRAP_CONTENT) || bVarU2 == bVar)) {
            Iterator it = this.f61145e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p pVar = (p) it.next();
                if (pVar.f61207f == i10 && !pVar.m()) {
                    z10 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z10 && bVarU == C6592e.b.WRAP_CONTENT) {
                    this.f61141a.L0(C6592e.b.FIXED);
                    C6593f c6593f = this.f61141a;
                    c6593f.g1(e(c6593f, 0));
                    C6593f c6593f2 = this.f61141a;
                    c6593f2.f60361e.f61206e.d(c6593f2.V());
                }
            } else if (z10 && bVarU2 == C6592e.b.WRAP_CONTENT) {
                this.f61141a.c1(C6592e.b.FIXED);
                C6593f c6593f3 = this.f61141a;
                c6593f3.H0(e(c6593f3, 1));
                C6593f c6593f4 = this.f61141a;
                c6593f4.f60363f.f61206e.d(c6593f4.x());
            }
        }
        if (i10 == 0) {
            C6593f c6593f5 = this.f61141a;
            C6592e.b bVar2 = c6593f5.f60352Z[0];
            if (bVar2 == C6592e.b.FIXED || bVar2 == C6592e.b.MATCH_PARENT) {
                int iV = c6593f5.V() + iW;
                this.f61141a.f60361e.f61210i.d(iV);
                this.f61141a.f60361e.f61206e.d(iV - iW);
                z11 = true;
            }
            z11 = false;
        } else {
            C6593f c6593f6 = this.f61141a;
            C6592e.b bVar3 = c6593f6.f60352Z[1];
            if (bVar3 == C6592e.b.FIXED || bVar3 == C6592e.b.MATCH_PARENT) {
                int iX2 = c6593f6.x() + iX;
                this.f61141a.f60363f.f61210i.d(iX2);
                this.f61141a.f60363f.f61206e.d(iX2 - iX);
                z11 = true;
            }
            z11 = false;
        }
        m();
        for (p pVar2 : this.f61145e) {
            if (pVar2.f61207f == i10 && (pVar2.f61203b != this.f61141a || pVar2.f61208g)) {
                pVar2.e();
            }
        }
        Iterator it2 = this.f61145e.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z12 = true;
                break;
            }
            p pVar3 = (p) it2.next();
            if (pVar3.f61207f == i10 && (z11 || pVar3.f61203b != this.f61141a)) {
                if (!pVar3.f61209h.f61159j || !pVar3.f61210i.f61159j || (!(pVar3 instanceof c) && !pVar3.f61206e.f61159j)) {
                    break;
                }
            }
        }
        this.f61141a.L0(bVarU);
        this.f61141a.c1(bVarU2);
        return z12;
    }

    public void j() {
        this.f61142b = true;
    }

    public void k() {
        this.f61143c = true;
    }

    public void m() {
        g gVar;
        for (C6592e c6592e : this.f61141a.f60509L0) {
            if (!c6592e.f60353a) {
                C6592e.b[] bVarArr = c6592e.f60352Z;
                boolean z10 = false;
                C6592e.b bVar = bVarArr[0];
                C6592e.b bVar2 = bVarArr[1];
                int i10 = c6592e.f60397w;
                int i11 = c6592e.f60399x;
                C6592e.b bVar3 = C6592e.b.WRAP_CONTENT;
                boolean z11 = bVar == bVar3 || (bVar == C6592e.b.MATCH_CONSTRAINT && i10 == 1);
                if (bVar2 == bVar3 || (bVar2 == C6592e.b.MATCH_CONSTRAINT && i11 == 1)) {
                    z10 = true;
                }
                g gVar2 = c6592e.f60361e.f61206e;
                boolean z12 = gVar2.f61159j;
                g gVar3 = c6592e.f60363f.f61206e;
                boolean z13 = gVar3.f61159j;
                if (z12 && z13) {
                    C6592e.b bVar4 = C6592e.b.FIXED;
                    l(c6592e, bVar4, gVar2.f61156g, bVar4, gVar3.f61156g);
                    c6592e.f60353a = true;
                } else if (z12 && z10) {
                    l(c6592e, C6592e.b.FIXED, gVar2.f61156g, bVar3, gVar3.f61156g);
                    if (bVar2 == C6592e.b.MATCH_CONSTRAINT) {
                        c6592e.f60363f.f61206e.f61171m = c6592e.x();
                    } else {
                        c6592e.f60363f.f61206e.d(c6592e.x());
                        c6592e.f60353a = true;
                    }
                } else if (z13 && z11) {
                    l(c6592e, bVar3, gVar2.f61156g, C6592e.b.FIXED, gVar3.f61156g);
                    if (bVar == C6592e.b.MATCH_CONSTRAINT) {
                        c6592e.f60361e.f61206e.f61171m = c6592e.V();
                    } else {
                        c6592e.f60361e.f61206e.d(c6592e.V());
                        c6592e.f60353a = true;
                    }
                }
                if (c6592e.f60353a && (gVar = c6592e.f60363f.f61186l) != null) {
                    gVar.d(c6592e.p());
                }
            }
        }
    }

    public void n(C6718b.InterfaceC0913b interfaceC0913b) {
        this.f61147g = interfaceC0913b;
    }
}
