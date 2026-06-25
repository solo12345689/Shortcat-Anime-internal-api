package com.google.android.gms.internal.play_billing;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.v1 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3744v1 extends AbstractC3665f1 {

    /* JADX INFO: renamed from: b */
    private static final Logger f40574b = Logger.getLogger(AbstractC3744v1.class.getName());

    /* JADX INFO: renamed from: c */
    private static final boolean f40575c = C2.C();

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f40576d = 0;

    /* JADX INFO: renamed from: a */
    C3748w1 f40577a;

    /* synthetic */ AbstractC3744v1(AbstractC3739u1 abstractC3739u1) {
    }

    static int a(InterfaceC3666f2 interfaceC3666f2, InterfaceC3716p2 interfaceC3716p2) {
        int iE = ((AbstractC3640a1) interfaceC3666f2).e(interfaceC3716p2);
        return c(iE) + iE;
    }

    public static int b(String str) {
        int length;
        try {
            length = F2.c(str);
        } catch (E2 unused) {
            length = str.getBytes(P1.f40249a).length;
        }
        return c(length) + length;
    }

    public static int c(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int d(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    static int z(int i10, InterfaceC3666f2 interfaceC3666f2, InterfaceC3716p2 interfaceC3716p2) {
        int iC = c(i10 << 3);
        return iC + iC + ((AbstractC3640a1) interfaceC3666f2).e(interfaceC3716p2);
    }

    public final void e() {
        if (h() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void f(String str, E2 e22) throws C3734t1 {
        f40574b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e22);
        byte[] bytes = str.getBytes(P1.f40249a);
        try {
            int length = bytes.length;
            w(length);
            r(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new C3734t1(e10);
        }
    }

    public abstract int h();

    public abstract void i(byte b10);

    public abstract void j(int i10, boolean z10);

    public abstract void k(int i10, AbstractC3710o1 abstractC3710o1);

    public abstract void l(int i10, int i11);

    public abstract void m(int i10);

    public abstract void n(int i10, long j10);

    public abstract void o(long j10);

    public abstract void p(int i10, int i11);

    public abstract void q(int i10);

    public abstract void r(byte[] bArr, int i10, int i11);

    abstract void s(int i10, InterfaceC3666f2 interfaceC3666f2, InterfaceC3716p2 interfaceC3716p2);

    public abstract void t(int i10, String str);

    public abstract void u(int i10, int i11);

    public abstract void v(int i10, int i11);

    public abstract void w(int i10);

    public abstract void x(int i10, long j10);

    public abstract void y(long j10);
}
