package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class I4 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b */
    public static final I4 f39386b = new H4(AbstractC3505k5.f39813b);

    /* JADX INFO: renamed from: a */
    private int f39387a = 0;

    static {
        int i10 = AbstractC3611w4.f40013a;
    }

    I4() {
    }

    public static I4 l(byte[] bArr, int i10, int i11) {
        s(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new H4(bArr2);
    }

    static int s(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Beginning index: ");
            sb2.append(i10);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < i10) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 44 + String.valueOf(i11).length());
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(i11).length() + 15 + String.valueOf(i12).length());
        sb4.append("End index: ");
        sb4.append(i11);
        sb4.append(" >= ");
        sb4.append(i12);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    public abstract byte b(int i10);

    abstract byte c(int i10);

    public abstract int d();

    public abstract I4 e(int i10, int i11);

    public abstract boolean equals(Object obj);

    abstract void f(AbstractC3635z4 abstractC3635z4);

    public final int hashCode() {
        int i10 = this.f39387a;
        if (i10 == 0) {
            int iD = d();
            i10 = i(iD, 0, iD);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f39387a = i10;
        }
        return i10;
    }

    protected abstract int i(int i10, int i11, int i12);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new B4(this);
    }

    protected final int p() {
        return this.f39387a;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(d()), d() <= 50 ? Y5.a(this) : Y5.a(e(0, 47)).concat("..."));
    }
}
