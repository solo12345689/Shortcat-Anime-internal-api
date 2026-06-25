package t1;

import java.util.ArrayList;
import m1.C5624c;

/* JADX INFO: renamed from: t1.m */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6600m extends C6592e {

    /* JADX INFO: renamed from: L0 */
    public ArrayList f60509L0;

    public AbstractC6600m() {
        this.f60509L0 = new ArrayList();
    }

    public void c(C6592e c6592e) {
        this.f60509L0.add(c6592e);
        if (c6592e.L() != null) {
            ((AbstractC6600m) c6592e.L()).q1(c6592e);
        }
        c6592e.Y0(this);
    }

    public void n1(C6592e... c6592eArr) {
        for (C6592e c6592e : c6592eArr) {
            c(c6592e);
        }
    }

    public ArrayList o1() {
        return this.f60509L0;
    }

    public abstract void p1();

    public void q1(C6592e c6592e) {
        this.f60509L0.remove(c6592e);
        c6592e.s0();
    }

    public void r1() {
        this.f60509L0.clear();
    }

    @Override // t1.C6592e
    public void s0() {
        this.f60509L0.clear();
        super.s0();
    }

    @Override // t1.C6592e
    public void v0(C5624c c5624c) {
        super.v0(c5624c);
        int size = this.f60509L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C6592e) this.f60509L0.get(i10)).v0(c5624c);
        }
    }

    public AbstractC6600m(int i10, int i11) {
        super(i10, i11);
        this.f60509L0 = new ArrayList();
    }
}
