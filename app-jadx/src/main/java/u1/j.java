package u1;

import t1.C6592e;
import t1.C6595h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class j extends p {
    j(C6592e c6592e) {
        super(c6592e);
        c6592e.f60361e.f();
        c6592e.f60363f.f();
        this.f61207f = ((C6595h) c6592e).o1();
    }

    private void q(f fVar) {
        this.f61209h.f61160k.add(fVar);
        fVar.f61161l.add(this.f61209h);
    }

    @Override // u1.p, u1.d
    public void a(d dVar) {
        f fVar = this.f61209h;
        if (fVar.f61152c && !fVar.f61159j) {
            this.f61209h.d((int) ((((f) fVar.f61161l.get(0)).f61156g * ((C6595h) this.f61203b).r1()) + 0.5f));
        }
    }

    @Override // u1.p
    void d() {
        C6595h c6595h = (C6595h) this.f61203b;
        int iP1 = c6595h.p1();
        int iQ1 = c6595h.q1();
        c6595h.r1();
        if (c6595h.o1() == 1) {
            if (iP1 != -1) {
                this.f61209h.f61161l.add(this.f61203b.f60354a0.f60361e.f61209h);
                this.f61203b.f60354a0.f60361e.f61209h.f61160k.add(this.f61209h);
                this.f61209h.f61155f = iP1;
            } else if (iQ1 != -1) {
                this.f61209h.f61161l.add(this.f61203b.f60354a0.f60361e.f61210i);
                this.f61203b.f60354a0.f60361e.f61210i.f61160k.add(this.f61209h);
                this.f61209h.f61155f = -iQ1;
            } else {
                f fVar = this.f61209h;
                fVar.f61151b = true;
                fVar.f61161l.add(this.f61203b.f60354a0.f60361e.f61210i);
                this.f61203b.f60354a0.f60361e.f61210i.f61160k.add(this.f61209h);
            }
            q(this.f61203b.f60361e.f61209h);
            q(this.f61203b.f60361e.f61210i);
            return;
        }
        if (iP1 != -1) {
            this.f61209h.f61161l.add(this.f61203b.f60354a0.f60363f.f61209h);
            this.f61203b.f60354a0.f60363f.f61209h.f61160k.add(this.f61209h);
            this.f61209h.f61155f = iP1;
        } else if (iQ1 != -1) {
            this.f61209h.f61161l.add(this.f61203b.f60354a0.f60363f.f61210i);
            this.f61203b.f60354a0.f60363f.f61210i.f61160k.add(this.f61209h);
            this.f61209h.f61155f = -iQ1;
        } else {
            f fVar2 = this.f61209h;
            fVar2.f61151b = true;
            fVar2.f61161l.add(this.f61203b.f60354a0.f60363f.f61210i);
            this.f61203b.f60354a0.f60363f.f61210i.f61160k.add(this.f61209h);
        }
        q(this.f61203b.f60363f.f61209h);
        q(this.f61203b.f60363f.f61210i);
    }

    @Override // u1.p
    public void e() {
        if (((C6595h) this.f61203b).o1() == 1) {
            this.f61203b.i1(this.f61209h.f61156g);
        } else {
            this.f61203b.j1(this.f61209h.f61156g);
        }
    }

    @Override // u1.p
    void f() {
        this.f61209h.c();
    }

    @Override // u1.p
    boolean m() {
        return false;
    }
}
