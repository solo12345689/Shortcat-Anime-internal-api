package zg;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
class O0 extends AbstractC7387B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f66361c;

    O0(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'encoded' cannot be null");
        }
        this.f66361c = bArr;
    }

    private synchronized void M() {
        if (this.f66361c != null) {
            C7418n c7418n = new C7418n(this.f66361c, true);
            try {
                C7402f c7402fZ = c7418n.z();
                c7418n.close();
                this.f66315a = c7402fZ.g();
                this.f66361c = null;
            } catch (IOException e10) {
                throw new C7431x("malformed ASN.1: " + e10, e10);
            }
        }
    }

    private synchronized byte[] N() {
        return this.f66361c;
    }

    @Override // zg.AbstractC7387B
    public InterfaceC7400e B(int i10) {
        M();
        return super.B(i10);
    }

    @Override // zg.AbstractC7387B
    public Enumeration D() {
        byte[] bArrN = N();
        return bArrN != null ? new N0(bArrN) : super.D();
    }

    @Override // zg.AbstractC7387B
    AbstractC7394b F() {
        return ((AbstractC7387B) x()).F();
    }

    @Override // zg.AbstractC7387B
    AbstractC7408i G() {
        return ((AbstractC7387B) x()).G();
    }

    @Override // zg.AbstractC7387B
    AbstractC7428u I() {
        return ((AbstractC7387B) x()).I();
    }

    @Override // zg.AbstractC7387B
    AbstractC7388C K() {
        return ((AbstractC7387B) x()).K();
    }

    @Override // zg.AbstractC7387B, zg.AbstractC7432y, zg.r
    public int hashCode() {
        M();
        return super.hashCode();
    }

    @Override // zg.AbstractC7387B, java.lang.Iterable
    public Iterator iterator() {
        M();
        return super.iterator();
    }

    @Override // zg.AbstractC7432y
    void n(C7430w c7430w, boolean z10) {
        byte[] bArrN = N();
        if (bArrN != null) {
            c7430w.o(z10, 48, bArrN);
        } else {
            super.x().n(c7430w, z10);
        }
    }

    @Override // zg.AbstractC7387B
    public int size() {
        M();
        return super.size();
    }

    @Override // zg.AbstractC7432y
    int t(boolean z10) {
        byte[] bArrN = N();
        return bArrN != null ? C7430w.g(z10, bArrN.length) : super.x().t(z10);
    }

    @Override // zg.AbstractC7387B, zg.AbstractC7432y
    AbstractC7432y w() {
        M();
        return super.w();
    }

    @Override // zg.AbstractC7387B, zg.AbstractC7432y
    AbstractC7432y x() {
        M();
        return super.x();
    }
}
