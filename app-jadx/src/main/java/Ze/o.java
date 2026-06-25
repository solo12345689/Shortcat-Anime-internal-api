package Ze;

import Ze.d;
import java.io.IOException;
import java.io.OutputStream;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
class o extends d {

    /* JADX INFO: renamed from: b */
    protected final byte[] f23348b;

    /* JADX INFO: renamed from: c */
    private int f23349c = 0;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class b implements d.a {

        /* JADX INFO: renamed from: a */
        private int f23350a;

        /* JADX INFO: renamed from: b */
        private final int f23351b;

        /* synthetic */ b(o oVar, a aVar) {
            this();
        }

        @Override // Ze.d.a
        public byte a() {
            try {
                byte[] bArr = o.this.f23348b;
                int i10 = this.f23350a;
                this.f23350a = i10 + 1;
                return bArr[i10];
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new NoSuchElementException(e10.getMessage());
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b */
        public Byte next() {
            return Byte.valueOf(a());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23350a < this.f23351b;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b() {
            this.f23350a = 0;
            this.f23351b = o.this.size();
        }
    }

    o(byte[] bArr) {
        this.f23348b = bArr;
    }

    static int G(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    @Override // Ze.d
    void B(OutputStream outputStream, int i10, int i11) throws IOException {
        outputStream.write(this.f23348b, F() + i10, i11);
    }

    boolean D(o oVar, int i10, int i11) {
        if (i11 > oVar.size()) {
            int size = size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(size);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i10 + i11 > oVar.size()) {
            int size2 = oVar.size();
            StringBuilder sb3 = new StringBuilder(59);
            sb3.append("Ran off end of other: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            sb3.append(", ");
            sb3.append(size2);
            throw new IllegalArgumentException(sb3.toString());
        }
        byte[] bArr = this.f23348b;
        byte[] bArr2 = oVar.f23348b;
        int iF = F() + i11;
        int iF2 = F();
        int iF3 = oVar.F() + i10;
        while (iF2 < iF) {
            if (bArr[iF2] != bArr2[iF3]) {
                return false;
            }
            iF2++;
            iF3++;
        }
        return true;
    }

    protected int F() {
        return 0;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: I */
    public d.a iterator() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d) || size() != ((d) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof o) {
            return D((o) obj, 0, size());
        }
        if (obj instanceof t) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
        sb2.append("Has a new type of ByteString been created? Found ");
        sb2.append(strValueOf);
        throw new IllegalArgumentException(sb2.toString());
    }

    public int hashCode() {
        int iU = this.f23349c;
        if (iU == 0) {
            int size = size();
            iU = u(size, 0, size);
            if (iU == 0) {
                iU = 1;
            }
            this.f23349c = iU;
        }
        return iU;
    }

    @Override // Ze.d
    protected void n(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f23348b, i10, bArr, i11, i12);
    }

    @Override // Ze.d
    protected int p() {
        return 0;
    }

    @Override // Ze.d
    protected boolean r() {
        return true;
    }

    @Override // Ze.d
    public boolean s() {
        int iF = F();
        return x.f(this.f23348b, iF, size() + iF);
    }

    @Override // Ze.d
    public int size() {
        return this.f23348b.length;
    }

    @Override // Ze.d
    protected int u(int i10, int i11, int i12) {
        return G(i10, this.f23348b, F() + i11, i12);
    }

    @Override // Ze.d
    protected int v(int i10, int i11, int i12) {
        int iF = F() + i11;
        return x.g(i10, this.f23348b, iF, i12 + iF);
    }

    @Override // Ze.d
    protected int w() {
        return this.f23349c;
    }

    @Override // Ze.d
    public String y(String str) {
        return new String(this.f23348b, F(), size(), str);
    }
}
