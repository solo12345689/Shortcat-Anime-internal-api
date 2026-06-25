package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.o1 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3710o1 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b */
    public static final AbstractC3710o1 f40523b = new C3700m1(P1.f40250b);

    /* JADX INFO: renamed from: a */
    private int f40524a = 0;

    static {
        int i10 = AbstractC3650c1.f40447a;
    }

    AbstractC3710o1() {
    }

    static int l(int i10, int i11, int i12) {
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

    public static AbstractC3710o1 s(byte[] bArr, int i10, int i11) {
        l(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new C3700m1(bArr2);
    }

    public abstract byte b(int i10);

    abstract byte c(int i10);

    public abstract int d();

    protected abstract int e(int i10, int i11, int i12);

    public abstract boolean equals(Object obj);

    public abstract AbstractC3710o1 f(int i10, int i11);

    public final int hashCode() {
        int iE = this.f40524a;
        if (iE == 0) {
            int iD = d();
            iE = e(iD, 0, iD);
            if (iE == 0) {
                iE = 1;
            }
            this.f40524a = iE;
        }
        return iE;
    }

    abstract void i(AbstractC3665f1 abstractC3665f1);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C3675h1(this);
    }

    protected final int p() {
        return this.f40524a;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(d()), d() <= 50 ? AbstractC3735t2.a(this) : AbstractC3735t2.a(f(0, 47)).concat("..."));
    }
}
