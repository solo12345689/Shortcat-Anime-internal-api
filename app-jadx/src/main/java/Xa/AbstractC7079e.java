package xa;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: xa.e */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7079e implements Iterable, Serializable {

    /* JADX INFO: renamed from: b */
    public static final AbstractC7079e f64161b = new i(AbstractC7091q.f64262d);

    /* JADX INFO: renamed from: c */
    private static final f f64162c;

    /* JADX INFO: renamed from: d */
    private static final Comparator f64163d;

    /* JADX INFO: renamed from: a */
    private int f64164a = 0;

    /* JADX INFO: renamed from: xa.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends c {

        /* JADX INFO: renamed from: a */
        private int f64165a = 0;

        /* JADX INFO: renamed from: b */
        private final int f64166b;

        a() {
            this.f64166b = AbstractC7079e.this.size();
        }

        @Override // xa.AbstractC7079e.g
        public byte a() {
            int i10 = this.f64165a;
            if (i10 >= this.f64166b) {
                throw new NoSuchElementException();
            }
            this.f64165a = i10 + 1;
            return AbstractC7079e.this.p(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f64165a < this.f64166b;
        }
    }

    /* JADX INFO: renamed from: xa.e$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements Comparator {
        b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a */
        public int compare(AbstractC7079e abstractC7079e, AbstractC7079e abstractC7079e2) {
            g gVarT = abstractC7079e.t();
            g gVarT2 = abstractC7079e2.t();
            while (gVarT.hasNext() && gVarT2.hasNext()) {
                int iCompareTo = Integer.valueOf(AbstractC7079e.x(gVarT.a())).compareTo(Integer.valueOf(AbstractC7079e.x(gVarT2.a())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(abstractC7079e.size()).compareTo(Integer.valueOf(abstractC7079e2.size()));
        }
    }

    /* JADX INFO: renamed from: xa.e$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static abstract class c implements g {
        c() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b */
        public final Byte next() {
            return Byte.valueOf(a());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: xa.e$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d implements f {
        private d() {
        }

        @Override // xa.AbstractC7079e.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: xa.e$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0966e extends i {

        /* JADX INFO: renamed from: f */
        private final int f64168f;

        /* JADX INFO: renamed from: g */
        private final int f64169g;

        C0966e(byte[] bArr, int i10, int i11) {
            super(bArr);
            AbstractC7079e.e(i10, i10 + i11, bArr.length);
            this.f64168f = i10;
            this.f64169g = i11;
        }

        @Override // xa.AbstractC7079e.i
        protected int I() {
            return this.f64168f;
        }

        @Override // xa.AbstractC7079e.i, xa.AbstractC7079e
        public byte c(int i10) {
            AbstractC7079e.d(i10, size());
            return this.f64170e[this.f64168f + i10];
        }

        @Override // xa.AbstractC7079e.i, xa.AbstractC7079e
        byte p(int i10) {
            return this.f64170e[this.f64168f + i10];
        }

        @Override // xa.AbstractC7079e.i, xa.AbstractC7079e
        public int size() {
            return this.f64169g;
        }
    }

    /* JADX INFO: renamed from: xa.e$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* JADX INFO: renamed from: xa.e$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface g extends Iterator {
        byte a();
    }

    /* JADX INFO: renamed from: xa.e$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static abstract class h extends AbstractC7079e {
        h() {
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.t();
        }
    }

    /* JADX INFO: renamed from: xa.e$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class i extends h {

        /* JADX INFO: renamed from: e */
        protected final byte[] f64170e;

        i(byte[] bArr) {
            bArr.getClass();
            this.f64170e = bArr;
        }

        final boolean G(AbstractC7079e abstractC7079e, int i10, int i11) {
            if (i11 > abstractC7079e.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > abstractC7079e.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + abstractC7079e.size());
            }
            if (!(abstractC7079e instanceof i)) {
                return abstractC7079e.w(i10, i12).equals(w(0, i11));
            }
            i iVar = (i) abstractC7079e;
            byte[] bArr = this.f64170e;
            byte[] bArr2 = iVar.f64170e;
            int I10 = I() + i11;
            int I11 = I();
            int I12 = iVar.I() + i10;
            while (I11 < I10) {
                if (bArr[I11] != bArr2[I12]) {
                    return false;
                }
                I11++;
                I12++;
            }
            return true;
        }

        protected int I() {
            return 0;
        }

        @Override // xa.AbstractC7079e
        public byte c(int i10) {
            return this.f64170e[i10];
        }

        @Override // xa.AbstractC7079e
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC7079e) || size() != ((AbstractC7079e) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i)) {
                return obj.equals(this);
            }
            i iVar = (i) obj;
            int iV = v();
            int iV2 = iVar.v();
            if (iV == 0 || iV2 == 0 || iV == iV2) {
                return G(iVar, 0, size());
            }
            return false;
        }

        @Override // xa.AbstractC7079e
        byte p(int i10) {
            return this.f64170e[i10];
        }

        @Override // xa.AbstractC7079e
        public final boolean s() {
            int I10 = I();
            return d0.k(this.f64170e, I10, size() + I10);
        }

        @Override // xa.AbstractC7079e
        public int size() {
            return this.f64170e.length;
        }

        @Override // xa.AbstractC7079e
        protected final int u(int i10, int i11, int i12) {
            return AbstractC7091q.h(i10, this.f64170e, I() + i11, i12);
        }

        @Override // xa.AbstractC7079e
        public final AbstractC7079e w(int i10, int i11) {
            int iE = AbstractC7079e.e(i10, i11, size());
            return iE == 0 ? AbstractC7079e.f64161b : new C0966e(this.f64170e, I() + i10, iE);
        }

        @Override // xa.AbstractC7079e
        protected final String z(Charset charset) {
            return new String(this.f64170e, I(), size(), charset);
        }
    }

    /* JADX INFO: renamed from: xa.e$j */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class j implements f {
        private j() {
        }

        @Override // xa.AbstractC7079e.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    static {
        f64162c = AbstractC7078d.c() ? new j(null) : new d(null);
        f64163d = new b();
    }

    AbstractC7079e() {
    }

    private String B() {
        if (size() <= 50) {
            return W.a(this);
        }
        return W.a(w(0, 47)) + "...";
    }

    static AbstractC7079e D(byte[] bArr) {
        return new i(bArr);
    }

    static AbstractC7079e F(byte[] bArr, int i10, int i11) {
        return new C0966e(bArr, i10, i11);
    }

    static void d(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    static int e(int i10, int i11, int i12) {
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

    public static AbstractC7079e f(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static AbstractC7079e i(byte[] bArr, int i10, int i11) {
        e(i10, i10 + i11, bArr.length);
        return new i(f64162c.a(bArr, i10, i11));
    }

    public static AbstractC7079e l(String str) {
        return new i(str.getBytes(AbstractC7091q.f64260b));
    }

    public static int x(byte b10) {
        return b10 & 255;
    }

    public final String A() {
        return y(AbstractC7091q.f64260b);
    }

    public abstract byte c(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iU = this.f64164a;
        if (iU == 0) {
            int size = size();
            iU = u(size, 0, size);
            if (iU == 0) {
                iU = 1;
            }
            this.f64164a = iU;
        }
        return iU;
    }

    abstract byte p(int i10);

    public abstract boolean s();

    public abstract int size();

    public g t() {
        return new a();
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), B());
    }

    protected abstract int u(int i10, int i11, int i12);

    protected final int v() {
        return this.f64164a;
    }

    public abstract AbstractC7079e w(int i10, int i11);

    public final String y(Charset charset) {
        return size() == 0 ? "" : z(charset);
    }

    protected abstract String z(Charset charset);
}
