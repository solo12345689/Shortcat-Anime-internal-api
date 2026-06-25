package zg;

import java.io.IOException;

/* JADX INFO: renamed from: zg.i */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7408i extends AbstractC7432y {

    /* JADX INFO: renamed from: f */
    static final L f66408f = new a(AbstractC7408i.class, 8);

    /* JADX INFO: renamed from: a */
    C7427t f66409a;

    /* JADX INFO: renamed from: b */
    C7420o f66410b;

    /* JADX INFO: renamed from: c */
    AbstractC7432y f66411c;

    /* JADX INFO: renamed from: d */
    int f66412d;

    /* JADX INFO: renamed from: e */
    AbstractC7432y f66413e;

    /* JADX INFO: renamed from: zg.i$a */
    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // zg.L
        AbstractC7432y c(AbstractC7387B abstractC7387B) {
            return abstractC7387B.G();
        }
    }

    AbstractC7408i(C7427t c7427t, C7420o c7420o, AbstractC7432y abstractC7432y, int i10, AbstractC7432y abstractC7432y2) {
        this.f66409a = c7427t;
        this.f66410b = c7420o;
        this.f66411c = abstractC7432y;
        this.f66412d = z(i10);
        this.f66413e = A(i10, abstractC7432y2);
    }

    private static AbstractC7432y A(int i10, AbstractC7432y abstractC7432y) {
        L l10;
        if (i10 == 1) {
            l10 = AbstractC7428u.f66444b;
        } else {
            if (i10 != 2) {
                return abstractC7432y;
            }
            l10 = AbstractC7394b.f66382b;
        }
        return l10.a(abstractC7432y);
    }

    private static AbstractC7432y B(G g10) {
        M.a(g10);
        int iK = g10.K();
        if (iK == 0) {
            return g10.F().e();
        }
        if (iK == 1) {
            return AbstractC7428u.A(g10, false);
        }
        if (iK == 2) {
            return AbstractC7394b.B(g10, false);
        }
        throw new IllegalArgumentException("invalid tag: " + M.f(g10));
    }

    private static AbstractC7432y D(AbstractC7387B abstractC7387B, int i10) {
        if (abstractC7387B.size() > i10) {
            return abstractC7387B.B(i10).e();
        }
        throw new IllegalArgumentException("too few objects in input sequence");
    }

    private static int z(int i10) {
        if (i10 >= 0 && i10 <= 2) {
            return i10;
        }
        throw new IllegalArgumentException("invalid encoding value: " + i10);
    }

    @Override // zg.AbstractC7432y, zg.r
    public int hashCode() {
        return (((Oh.f.b(this.f66409a) ^ Oh.f.b(this.f66410b)) ^ Oh.f.b(this.f66411c)) ^ this.f66412d) ^ this.f66413e.hashCode();
    }

    @Override // zg.AbstractC7432y
    boolean l(AbstractC7432y abstractC7432y) {
        if (this == abstractC7432y) {
            return true;
        }
        if (!(abstractC7432y instanceof AbstractC7408i)) {
            return false;
        }
        AbstractC7408i abstractC7408i = (AbstractC7408i) abstractC7432y;
        return Oh.f.a(this.f66409a, abstractC7408i.f66409a) && Oh.f.a(this.f66410b, abstractC7408i.f66410b) && Oh.f.a(this.f66411c, abstractC7408i.f66411c) && this.f66412d == abstractC7408i.f66412d && this.f66413e.u(abstractC7408i.f66413e);
    }

    @Override // zg.AbstractC7432y
    void n(C7430w c7430w, boolean z10) throws IOException {
        c7430w.s(z10, 40);
        y().n(c7430w, false);
    }

    @Override // zg.AbstractC7432y
    boolean p() {
        return true;
    }

    @Override // zg.AbstractC7432y
    int t(boolean z10) {
        return y().t(z10);
    }

    @Override // zg.AbstractC7432y
    AbstractC7432y w() {
        return new C7403f0(this.f66409a, this.f66410b, this.f66411c, this.f66412d, this.f66413e);
    }

    abstract AbstractC7387B y();

    AbstractC7408i(AbstractC7387B abstractC7387B) {
        int i10 = 0;
        AbstractC7432y abstractC7432yD = D(abstractC7387B, 0);
        if (abstractC7432yD instanceof C7427t) {
            this.f66409a = (C7427t) abstractC7432yD;
            abstractC7432yD = D(abstractC7387B, 1);
            i10 = 1;
        }
        if (abstractC7432yD instanceof C7420o) {
            this.f66410b = (C7420o) abstractC7432yD;
            i10++;
            abstractC7432yD = D(abstractC7387B, i10);
        }
        if (!(abstractC7432yD instanceof G)) {
            this.f66411c = abstractC7432yD;
            i10++;
            abstractC7432yD = D(abstractC7387B, i10);
        }
        if (abstractC7387B.size() != i10 + 1) {
            throw new IllegalArgumentException("input sequence too large");
        }
        if (!(abstractC7432yD instanceof G)) {
            throw new IllegalArgumentException("No tagged object found in sequence. Structure doesn't seem to be of type External");
        }
        G g10 = (G) abstractC7432yD;
        this.f66412d = z(g10.K());
        this.f66413e = B(g10);
    }
}
