package com.google.android.gms.internal.measurement;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class N4 extends AbstractC3635z4 {

    /* JADX INFO: renamed from: b */
    private static final Logger f39510b = Logger.getLogger(N4.class.getName());

    /* JADX INFO: renamed from: c */
    private static final boolean f39511c = AbstractC3479h6.f();

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f39512d = 0;

    /* JADX INFO: renamed from: a */
    O4 f39513a;

    /* synthetic */ N4(byte[] bArr) {
    }

    public static int E(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int a(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int b(String str) {
        int length;
        try {
            length = AbstractC3506k6.b(str);
        } catch (C3497j6 unused) {
            length = str.getBytes(AbstractC3505k5.f39812a).length;
        }
        return E(length) + length;
    }

    public static int c(E5 e52) {
        int iA = e52.a();
        return E(iA) + iA;
    }

    static int d(E5 e52, P5 p52) {
        int iF = ((AbstractC3593u4) e52).f(p52);
        return E(iF) + iF;
    }

    static int g(int i10, E5 e52, P5 p52) {
        int iE = E(i10 << 3);
        return iE + iE + ((AbstractC3593u4) e52).f(p52);
    }

    public abstract void A(long j10);

    public abstract void B(byte[] bArr, int i10, int i11);

    public abstract void C(String str);

    public abstract int D();

    public final void e() {
        if (D() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void f(String str, C3497j6 c3497j6) throws M4 {
        f39510b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c3497j6);
        byte[] bytes = str.getBytes(AbstractC3505k5.f39812a);
        try {
            int length = bytes.length;
            x(length);
            B(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new M4(e10);
        }
    }

    public abstract void i(int i10, int i11);

    public abstract void j(int i10, int i11);

    public abstract void k(int i10, int i11);

    public abstract void l(int i10, int i11);

    public abstract void m(int i10, long j10);

    public abstract void n(int i10, long j10);

    public abstract void o(int i10, boolean z10);

    public abstract void p(int i10, String str);

    public abstract void q(int i10, I4 i42);

    public abstract void r(I4 i42);

    abstract void s(byte[] bArr, int i10, int i11);

    abstract void t(int i10, E5 e52, P5 p52);

    public abstract void u(E5 e52);

    public abstract void v(byte b10);

    public abstract void w(int i10);

    public abstract void x(int i10);

    public abstract void y(int i10);

    public abstract void z(long j10);
}
