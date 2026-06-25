package zg;

import com.facebook.imageutils.JfifUtil;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: zg.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C7389D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f66323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f66324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[][] f66325c;

    C7389D(InputStream inputStream, int i10, byte[][] bArr) {
        this.f66323a = inputStream;
        this.f66324b = i10;
        this.f66325c = bArr;
    }

    private void i(boolean z10) {
        InputStream inputStream = this.f66323a;
        if (inputStream instanceof M0) {
            ((M0) inputStream).h(z10);
        }
    }

    InterfaceC7400e a(int i10) throws IOException {
        i(false);
        int iQ = C7418n.q(this.f66323a, i10);
        int iM = C7418n.m(this.f66323a, this.f66324b, iQ == 3 || iQ == 4 || iQ == 16 || iQ == 17 || iQ == 8);
        if (iM < 0) {
            if ((i10 & 32) == 0) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            C7389D c7389d = new C7389D(new M0(this.f66323a, this.f66324b), this.f66324b, this.f66325c);
            int i11 = i10 & JfifUtil.MARKER_SOFn;
            return i11 != 0 ? new C7393a0(i11, iQ, c7389d) : c7389d.e(iQ);
        }
        K0 k02 = new K0(this.f66323a, iM, this.f66324b);
        if ((i10 & 224) == 0) {
            return f(iQ, k02);
        }
        C7389D c7389d2 = new C7389D(k02, k02.a(), this.f66325c);
        int i12 = i10 & JfifUtil.MARKER_SOFn;
        if (i12 != 0) {
            return new J0(i12, iQ, (i10 & 32) != 0, c7389d2);
        }
        return c7389d2.d(iQ);
    }

    AbstractC7432y b(int i10, int i11, boolean z10) {
        return !z10 ? G.B(i10, i11, ((K0) this.f66323a).j()) : G.z(i10, i11, h());
    }

    AbstractC7432y c(int i10, int i11) {
        return G.A(i10, i11, h());
    }

    InterfaceC7400e d(int i10) throws C7406h {
        if (i10 == 3) {
            return new Q(this);
        }
        if (i10 == 4) {
            return new U(this);
        }
        if (i10 == 8) {
            return new C7405g0(this);
        }
        if (i10 == 16) {
            return new F0(this);
        }
        if (i10 == 17) {
            return new H0(this);
        }
        throw new C7406h("unknown DL object encountered: 0x" + Integer.toHexString(i10));
    }

    InterfaceC7400e e(int i10) throws C7406h {
        if (i10 == 3) {
            return new Q(this);
        }
        if (i10 == 4) {
            return new U(this);
        }
        if (i10 == 8) {
            return new C7405g0(this);
        }
        if (i10 == 16) {
            return new W(this);
        }
        if (i10 == 17) {
            return new Y(this);
        }
        throw new C7406h("unknown BER object encountered: 0x" + Integer.toHexString(i10));
    }

    InterfaceC7400e f(int i10, K0 k02) throws C7406h {
        if (i10 == 3) {
            return new A0(k02);
        }
        if (i10 == 4) {
            return new C7421o0(k02);
        }
        if (i10 == 8) {
            throw new C7406h("externals must use constructed encoding (see X.690 8.18)");
        }
        if (i10 == 16) {
            throw new C7406h("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
        }
        if (i10 == 17) {
            throw new C7406h("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
        }
        try {
            return C7418n.h(i10, k02, this.f66325c);
        } catch (IllegalArgumentException e10) {
            throw new C7406h("corrupted stream detected", e10);
        }
    }

    public InterfaceC7400e g() throws IOException {
        int i10 = this.f66323a.read();
        if (i10 < 0) {
            return null;
        }
        return a(i10);
    }

    C7402f h() throws IOException {
        int i10 = this.f66323a.read();
        if (i10 < 0) {
            return new C7402f(0);
        }
        C7402f c7402f = new C7402f();
        do {
            InterfaceC7400e interfaceC7400eA = a(i10);
            c7402f.a(interfaceC7400eA instanceof L0 ? ((L0) interfaceC7400eA).d() : interfaceC7400eA.e());
            i10 = this.f66323a.read();
        } while (i10 >= 0);
        return c7402f;
    }
}
