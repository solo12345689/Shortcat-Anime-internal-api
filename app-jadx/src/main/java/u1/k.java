package u1;

import java.util.Iterator;
import t1.C6588a;
import t1.C6592e;
import u1.f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class k extends p {
    k(C6592e c6592e) {
        super(c6592e);
    }

    private void q(f fVar) {
        this.f61209h.f61160k.add(fVar);
        fVar.f61161l.add(this.f61209h);
    }

    @Override // u1.p, u1.d
    public void a(d dVar) {
        C6588a c6588a = (C6588a) this.f61203b;
        int iR1 = c6588a.r1();
        Iterator it = this.f61209h.f61161l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = ((f) it.next()).f61156g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (iR1 == 0 || iR1 == 2) {
            this.f61209h.d(i11 + c6588a.s1());
        } else {
            this.f61209h.d(i10 + c6588a.s1());
        }
    }

    @Override // u1.p
    void d() {
        C6592e c6592e = this.f61203b;
        if (c6592e instanceof C6588a) {
            this.f61209h.f61151b = true;
            C6588a c6588a = (C6588a) c6592e;
            int iR1 = c6588a.r1();
            boolean zQ1 = c6588a.q1();
            int i10 = 0;
            if (iR1 == 0) {
                this.f61209h.f61154e = f.a.LEFT;
                while (i10 < c6588a.f60494M0) {
                    C6592e c6592e2 = c6588a.f60493L0[i10];
                    if (zQ1 || c6592e2.U() != 8) {
                        f fVar = c6592e2.f60361e.f61209h;
                        fVar.f61160k.add(this.f61209h);
                        this.f61209h.f61161l.add(fVar);
                    }
                    i10++;
                }
                q(this.f61203b.f60361e.f61209h);
                q(this.f61203b.f60361e.f61210i);
                return;
            }
            if (iR1 == 1) {
                this.f61209h.f61154e = f.a.RIGHT;
                while (i10 < c6588a.f60494M0) {
                    C6592e c6592e3 = c6588a.f60493L0[i10];
                    if (zQ1 || c6592e3.U() != 8) {
                        f fVar2 = c6592e3.f60361e.f61210i;
                        fVar2.f61160k.add(this.f61209h);
                        this.f61209h.f61161l.add(fVar2);
                    }
                    i10++;
                }
                q(this.f61203b.f60361e.f61209h);
                q(this.f61203b.f60361e.f61210i);
                return;
            }
            if (iR1 == 2) {
                this.f61209h.f61154e = f.a.TOP;
                while (i10 < c6588a.f60494M0) {
                    C6592e c6592e4 = c6588a.f60493L0[i10];
                    if (zQ1 || c6592e4.U() != 8) {
                        f fVar3 = c6592e4.f60363f.f61209h;
                        fVar3.f61160k.add(this.f61209h);
                        this.f61209h.f61161l.add(fVar3);
                    }
                    i10++;
                }
                q(this.f61203b.f60363f.f61209h);
                q(this.f61203b.f60363f.f61210i);
                return;
            }
            if (iR1 != 3) {
                return;
            }
            this.f61209h.f61154e = f.a.BOTTOM;
            while (i10 < c6588a.f60494M0) {
                C6592e c6592e5 = c6588a.f60493L0[i10];
                if (zQ1 || c6592e5.U() != 8) {
                    f fVar4 = c6592e5.f60363f.f61210i;
                    fVar4.f61160k.add(this.f61209h);
                    this.f61209h.f61161l.add(fVar4);
                }
                i10++;
            }
            q(this.f61203b.f60363f.f61209h);
            q(this.f61203b.f60363f.f61210i);
        }
    }

    @Override // u1.p
    public void e() {
        C6592e c6592e = this.f61203b;
        if (c6592e instanceof C6588a) {
            int iR1 = ((C6588a) c6592e).r1();
            if (iR1 == 0 || iR1 == 1) {
                this.f61203b.i1(this.f61209h.f61156g);
            } else {
                this.f61203b.j1(this.f61209h.f61156g);
            }
        }
    }

    @Override // u1.p
    void f() {
        this.f61204c = null;
        this.f61209h.c();
    }

    @Override // u1.p
    boolean m() {
        return false;
    }
}
