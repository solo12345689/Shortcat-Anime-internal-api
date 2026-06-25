package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.q0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3383q0 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b */
    public static final AbstractC3383q0 f39290b = new C3374n0(G0.f39066d);

    /* JADX INFO: renamed from: c */
    private static final Comparator f39291c;

    /* JADX INFO: renamed from: d */
    private static final C3380p0 f39292d;

    /* JADX INFO: renamed from: a */
    private int f39293a = 0;

    static {
        int i10 = AbstractC3344d0.f39152a;
        f39292d = new C3380p0(null);
        f39291c = new C3356h0();
    }

    AbstractC3383q0() {
    }

    static int p(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static AbstractC3383q0 t(byte[] bArr, int i10, int i11) {
        p(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new C3374n0(bArr2);
    }

    public abstract byte b(int i10);

    abstract byte c(int i10);

    public abstract int d();

    protected abstract int e(int i10, int i11, int i12);

    public abstract boolean equals(Object obj);

    public abstract AbstractC3383q0 f(int i10, int i11);

    public final int hashCode() {
        int iE = this.f39293a;
        if (iE == 0) {
            int iD = d();
            iE = e(iD, 0, iD);
            if (iE == 0) {
                iE = 1;
            }
            this.f39293a = iE;
        }
        return iE;
    }

    protected abstract String i(Charset charset);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C3353g0(this);
    }

    public abstract boolean l();

    protected final int s() {
        return this.f39293a;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(d()), d() <= 50 ? AbstractC3375n1.a(this) : AbstractC3375n1.a(f(0, 47)).concat("..."));
    }

    public final String u(Charset charset) {
        return d() == 0 ? "" : i(charset);
    }
}
