package zg;

/* JADX INFO: renamed from: zg.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C7403f0 extends AbstractC7408i {
    public C7403f0(C7427t c7427t, C7420o c7420o, AbstractC7432y abstractC7432y, int i10, AbstractC7432y abstractC7432y2) {
        super(c7427t, c7420o, abstractC7432y, i10, abstractC7432y2);
    }

    @Override // zg.AbstractC7408i
    AbstractC7387B y() {
        C7402f c7402f = new C7402f(4);
        C7427t c7427t = this.f66409a;
        if (c7427t != null) {
            c7402f.a(c7427t);
        }
        C7420o c7420o = this.f66410b;
        if (c7420o != null) {
            c7402f.a(c7420o);
        }
        AbstractC7432y abstractC7432y = this.f66411c;
        if (abstractC7432y != null) {
            c7402f.a(abstractC7432y.w());
        }
        int i10 = this.f66412d;
        c7402f.a(new u0(i10 == 0, i10, this.f66413e));
        return new r0(c7402f);
    }

    public C7403f0(r0 r0Var) {
        super(r0Var);
    }

    @Override // zg.AbstractC7408i, zg.AbstractC7432y
    AbstractC7432y w() {
        return this;
    }

    @Override // zg.AbstractC7432y
    AbstractC7432y x() {
        return this;
    }
}
