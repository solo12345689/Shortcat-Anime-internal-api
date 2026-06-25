package zg;

/* JADX INFO: loaded from: classes5.dex */
public class B0 extends AbstractC7408i {
    public B0(E0 e02) {
        super(e02);
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
            c7402f.a(abstractC7432y.x());
        }
        int i10 = this.f66412d;
        c7402f.a(new I0(i10 == 0, i10, this.f66413e));
        return new E0(c7402f);
    }

    @Override // zg.AbstractC7432y
    AbstractC7432y x() {
        return this;
    }
}
