package zg;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class s0 extends AbstractC7388C {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f66437d;

    s0(boolean z10, InterfaceC7400e[] interfaceC7400eArr) {
        super(F(z10), interfaceC7400eArr);
        this.f66437d = -1;
    }

    private static boolean F(boolean z10) {
        if (z10) {
            return z10;
        }
        throw new IllegalStateException("DERSet elements should always be in sorted order");
    }

    private int G() {
        if (this.f66437d < 0) {
            int length = this.f66319a.length;
            int iT = 0;
            for (int i10 = 0; i10 < length; i10++) {
                iT += this.f66319a[i10].e().w().t(true);
            }
            this.f66437d = iT;
        }
        return this.f66437d;
    }

    @Override // zg.AbstractC7432y
    void n(C7430w c7430w, boolean z10) throws IOException {
        c7430w.s(z10, 49);
        C7423p0 c7423p0D = c7430w.d();
        int length = this.f66319a.length;
        int i10 = 0;
        if (this.f66437d >= 0 || length > 16) {
            c7430w.k(G());
            while (i10 < length) {
                this.f66319a[i10].e().w().n(c7423p0D, true);
                i10++;
            }
            return;
        }
        AbstractC7432y[] abstractC7432yArr = new AbstractC7432y[length];
        int iT = 0;
        for (int i11 = 0; i11 < length; i11++) {
            AbstractC7432y abstractC7432yW = this.f66319a[i11].e().w();
            abstractC7432yArr[i11] = abstractC7432yW;
            iT += abstractC7432yW.t(true);
        }
        this.f66437d = iT;
        c7430w.k(iT);
        while (i10 < length) {
            abstractC7432yArr[i10].n(c7423p0D, true);
            i10++;
        }
    }

    @Override // zg.AbstractC7432y
    int t(boolean z10) {
        return C7430w.g(z10, G());
    }

    @Override // zg.AbstractC7388C, zg.AbstractC7432y
    AbstractC7432y w() {
        return this.f66320b != null ? this : super.w();
    }

    @Override // zg.AbstractC7388C, zg.AbstractC7432y
    AbstractC7432y x() {
        return this;
    }
}
