package zg;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class G0 extends AbstractC7388C {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f66336d;

    public G0() {
        this.f66336d = -1;
    }

    private int F() {
        if (this.f66336d < 0) {
            int length = this.f66319a.length;
            int iT = 0;
            for (int i10 = 0; i10 < length; i10++) {
                iT += this.f66319a[i10].e().x().t(true);
            }
            this.f66336d = iT;
        }
        return this.f66336d;
    }

    @Override // zg.AbstractC7432y
    void n(C7430w c7430w, boolean z10) throws IOException {
        c7430w.s(z10, 49);
        D0 d0E = c7430w.e();
        int length = this.f66319a.length;
        int i10 = 0;
        if (this.f66336d >= 0 || length > 16) {
            c7430w.k(F());
            while (i10 < length) {
                d0E.u(this.f66319a[i10].e(), true);
                i10++;
            }
            return;
        }
        AbstractC7432y[] abstractC7432yArr = new AbstractC7432y[length];
        int iT = 0;
        for (int i11 = 0; i11 < length; i11++) {
            AbstractC7432y abstractC7432yX = this.f66319a[i11].e().x();
            abstractC7432yArr[i11] = abstractC7432yX;
            iT += abstractC7432yX.t(true);
        }
        this.f66336d = iT;
        c7430w.k(iT);
        while (i10 < length) {
            d0E.u(abstractC7432yArr[i10], true);
            i10++;
        }
    }

    @Override // zg.AbstractC7432y
    int t(boolean z10) {
        return C7430w.g(z10, F());
    }

    public G0(C7402f c7402f) {
        super(c7402f, false);
        this.f66336d = -1;
    }

    G0(boolean z10, InterfaceC7400e[] interfaceC7400eArr) {
        super(z10, interfaceC7400eArr);
        this.f66336d = -1;
    }

    G0(InterfaceC7400e[] interfaceC7400eArr, InterfaceC7400e[] interfaceC7400eArr2) {
        super(interfaceC7400eArr, interfaceC7400eArr2);
        this.f66336d = -1;
    }

    @Override // zg.AbstractC7388C, zg.AbstractC7432y
    AbstractC7432y x() {
        return this;
    }
}
