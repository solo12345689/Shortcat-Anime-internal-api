package Ze;

import Ze.d;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
class c extends o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f23282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f23283e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class b implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f23284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f23285b;

        @Override // Ze.d.a
        public byte a() {
            int i10 = this.f23284a;
            if (i10 >= this.f23285b) {
                throw new NoSuchElementException();
            }
            byte[] bArr = c.this.f23348b;
            this.f23284a = i10 + 1;
            return bArr[i10];
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(a());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23284a < this.f23285b;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b() {
            int iF = c.this.F();
            this.f23284a = iF;
            this.f23285b = iF + c.this.size();
        }
    }

    c(byte[] bArr, int i10, int i11) {
        super(bArr);
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Offset too small: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(29);
            sb3.append("Length too small: ");
            sb3.append(i10);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (((long) i10) + ((long) i11) <= bArr.length) {
            this.f23282d = i10;
            this.f23283e = i11;
            return;
        }
        StringBuilder sb4 = new StringBuilder(48);
        sb4.append("Offset+Length too large: ");
        sb4.append(i10);
        sb4.append("+");
        sb4.append(i11);
        throw new IllegalArgumentException(sb4.toString());
    }

    @Override // Ze.o
    protected int F() {
        return this.f23282d;
    }

    @Override // Ze.o, java.lang.Iterable
    /* JADX INFO: renamed from: I */
    public d.a iterator() {
        return new b();
    }

    @Override // Ze.o, Ze.d
    protected void n(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f23348b, F() + i10, bArr, i11, i12);
    }

    @Override // Ze.o, Ze.d
    public int size() {
        return this.f23283e;
    }
}
