package U2;

import i3.h;
import java.io.EOFException;
import q2.C6078J;
import t2.C6609I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6609I f18899a = new C6609I(10);

    public C6078J a(InterfaceC2256q interfaceC2256q, h.a aVar) throws Throwable {
        C6078J c6078jE = null;
        int i10 = 0;
        while (true) {
            try {
                interfaceC2256q.o(this.f18899a.f(), 0, 10);
                this.f18899a.b0(0);
                if (this.f18899a.P() != 4801587) {
                    break;
                }
                this.f18899a.c0(3);
                int iL = this.f18899a.L();
                int i11 = iL + 10;
                if (c6078jE == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f18899a.f(), 0, bArr, 0, 10);
                    interfaceC2256q.o(bArr, 10, iL);
                    c6078jE = new i3.h(aVar).e(bArr, i11);
                } else {
                    interfaceC2256q.k(iL);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        interfaceC2256q.g();
        interfaceC2256q.k(i10);
        return c6078jE;
    }
}
