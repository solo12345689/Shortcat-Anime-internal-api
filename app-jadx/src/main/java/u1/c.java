package u1;

import java.util.ArrayList;
import java.util.Iterator;
import t1.C6591d;
import t1.C6592e;
import t1.C6593f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class c extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    ArrayList f61139k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f61140l;

    public c(C6592e c6592e, int i10) {
        super(c6592e);
        this.f61139k = new ArrayList();
        this.f61207f = i10;
        q();
    }

    private void q() {
        C6592e c6592e;
        C6592e c6592e2 = this.f61203b;
        C6592e c6592eM = c6592e2.M(this.f61207f);
        while (true) {
            C6592e c6592e3 = c6592eM;
            c6592e = c6592e2;
            c6592e2 = c6592e3;
            if (c6592e2 == null) {
                break;
            } else {
                c6592eM = c6592e2.M(this.f61207f);
            }
        }
        this.f61203b = c6592e;
        this.f61139k.add(c6592e.O(this.f61207f));
        C6592e c6592eK = c6592e.K(this.f61207f);
        while (c6592eK != null) {
            this.f61139k.add(c6592eK.O(this.f61207f));
            c6592eK = c6592eK.K(this.f61207f);
        }
        for (p pVar : this.f61139k) {
            int i10 = this.f61207f;
            if (i10 == 0) {
                pVar.f61203b.f60357c = this;
            } else if (i10 == 1) {
                pVar.f61203b.f60359d = this;
            }
        }
        if (this.f61207f == 0 && ((C6593f) this.f61203b.L()).M1() && this.f61139k.size() > 1) {
            ArrayList arrayList = this.f61139k;
            this.f61203b = ((p) arrayList.get(arrayList.size() - 1)).f61203b;
        }
        this.f61140l = this.f61207f == 0 ? this.f61203b.z() : this.f61203b.R();
    }

    private C6592e r() {
        for (int i10 = 0; i10 < this.f61139k.size(); i10++) {
            p pVar = (p) this.f61139k.get(i10);
            if (pVar.f61203b.U() != 8) {
                return pVar.f61203b;
            }
        }
        return null;
    }

    private C6592e s() {
        for (int size = this.f61139k.size() - 1; size >= 0; size--) {
            p pVar = (p) this.f61139k.get(size);
            if (pVar.f61203b.U() != 8) {
                return pVar.f61203b;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0160  */
    @Override // u1.p, u1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(u1.d r27) {
        /*
            Method dump skipped, instruction units count: 1054
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.c.a(u1.d):void");
    }

    @Override // u1.p
    void d() {
        Iterator it = this.f61139k.iterator();
        while (it.hasNext()) {
            ((p) it.next()).d();
        }
        int size = this.f61139k.size();
        if (size < 1) {
            return;
        }
        C6592e c6592e = ((p) this.f61139k.get(0)).f61203b;
        C6592e c6592e2 = ((p) this.f61139k.get(size - 1)).f61203b;
        if (this.f61207f == 0) {
            C6591d c6591d = c6592e.f60341O;
            C6591d c6591d2 = c6592e2.f60343Q;
            f fVarI = i(c6591d, 0);
            int iF = c6591d.f();
            C6592e c6592eR = r();
            if (c6592eR != null) {
                iF = c6592eR.f60341O.f();
            }
            if (fVarI != null) {
                b(this.f61209h, fVarI, iF);
            }
            f fVarI2 = i(c6591d2, 0);
            int iF2 = c6591d2.f();
            C6592e c6592eS = s();
            if (c6592eS != null) {
                iF2 = c6592eS.f60343Q.f();
            }
            if (fVarI2 != null) {
                b(this.f61210i, fVarI2, -iF2);
            }
        } else {
            C6591d c6591d3 = c6592e.f60342P;
            C6591d c6591d4 = c6592e2.f60344R;
            f fVarI3 = i(c6591d3, 1);
            int iF3 = c6591d3.f();
            C6592e c6592eR2 = r();
            if (c6592eR2 != null) {
                iF3 = c6592eR2.f60342P.f();
            }
            if (fVarI3 != null) {
                b(this.f61209h, fVarI3, iF3);
            }
            f fVarI4 = i(c6591d4, 1);
            int iF4 = c6591d4.f();
            C6592e c6592eS2 = s();
            if (c6592eS2 != null) {
                iF4 = c6592eS2.f60344R.f();
            }
            if (fVarI4 != null) {
                b(this.f61210i, fVarI4, -iF4);
            }
        }
        this.f61209h.f61150a = this;
        this.f61210i.f61150a = this;
    }

    @Override // u1.p
    public void e() {
        for (int i10 = 0; i10 < this.f61139k.size(); i10++) {
            ((p) this.f61139k.get(i10)).e();
        }
    }

    @Override // u1.p
    void f() {
        this.f61204c = null;
        Iterator it = this.f61139k.iterator();
        while (it.hasNext()) {
            ((p) it.next()).f();
        }
    }

    @Override // u1.p
    public long j() {
        int size = this.f61139k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = (p) this.f61139k.get(i10);
            j10 = j10 + ((long) pVar.f61209h.f61155f) + pVar.j() + ((long) pVar.f61210i.f61155f);
        }
        return j10;
    }

    @Override // u1.p
    boolean m() {
        int size = this.f61139k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((p) this.f61139k.get(i10)).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f61207f == 0 ? "horizontal : " : "vertical : ");
        for (p pVar : this.f61139k) {
            sb2.append("<");
            sb2.append(pVar);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
