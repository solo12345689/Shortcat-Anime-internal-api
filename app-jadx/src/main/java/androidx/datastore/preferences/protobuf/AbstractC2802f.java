package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2802f implements Iterable, Serializable {

    /* JADX INFO: renamed from: b */
    public static final AbstractC2802f f29287b = new i(AbstractC2816u.f29505d);

    /* JADX INFO: renamed from: c */
    private static final InterfaceC0502f f29288c;

    /* JADX INFO: renamed from: d */
    private static final Comparator f29289d;

    /* JADX INFO: renamed from: a */
    private int f29290a = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends c {

        /* JADX INFO: renamed from: a */
        private int f29291a = 0;

        /* JADX INFO: renamed from: b */
        private final int f29292b;

        a() {
            this.f29292b = AbstractC2802f.this.size();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2802f.g
        public byte a() {
            int i10 = this.f29291a;
            if (i10 >= this.f29292b) {
                throw new NoSuchElementException();
            }
            this.f29291a = i10 + 1;
            return AbstractC2802f.this.s(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f29291a < this.f29292b;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements Comparator {
        b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a */
        public int compare(AbstractC2802f abstractC2802f, AbstractC2802f abstractC2802f2) {
            g gVarT = abstractC2802f.t();
            g gVarT2 = abstractC2802f2.t();
            while (gVarT.hasNext() && gVarT2.hasNext()) {
                int iCompareTo = Integer.valueOf(AbstractC2802f.y(gVarT.a())).compareTo(Integer.valueOf(AbstractC2802f.y(gVarT2.a())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(abstractC2802f.size()).compareTo(Integer.valueOf(abstractC2802f2.size()));
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$c */
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

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d implements InterfaceC0502f {
        private d() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2802f.InterfaceC0502f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class e extends i {

        /* JADX INFO: renamed from: f */
        private final int f29294f;

        /* JADX INFO: renamed from: g */
        private final int f29295g;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            AbstractC2802f.e(i10, i10 + i11, bArr.length);
            this.f29294f = i10;
            this.f29295g = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2802f.i
        protected int G() {
            return this.f29294f;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2802f.i, androidx.datastore.preferences.protobuf.AbstractC2802f
        public byte c(int i10) {
            AbstractC2802f.d(i10, size());
            return this.f29296e[this.f29294f + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2802f.i, androidx.datastore.preferences.protobuf.AbstractC2802f
        protected void p(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f29296e, G() + i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2802f.i, androidx.datastore.preferences.protobuf.AbstractC2802f
        byte s(int i10) {
            return this.f29296e[this.f29294f + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2802f.i, androidx.datastore.preferences.protobuf.AbstractC2802f
        public int size() {
            return this.f29295g;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface InterfaceC0502f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface g extends Iterator {
        byte a();
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static abstract class h extends AbstractC2802f {
        /* synthetic */ h(a aVar) {
            this();
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.t();
        }

        private h() {
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class i extends h {

        /* JADX INFO: renamed from: e */
        protected final byte[] f29296e;

        i(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.f29296e = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2802f
        final void D(AbstractC2801e abstractC2801e) {
            abstractC2801e.a(this.f29296e, G(), size());
        }

        final boolean F(AbstractC2802f abstractC2802f, int i10, int i11) {
            if (i11 > abstractC2802f.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > abstractC2802f.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + abstractC2802f.size());
            }
            if (!(abstractC2802f instanceof i)) {
                return abstractC2802f.w(i10, i12).equals(w(0, i11));
            }
            i iVar = (i) abstractC2802f;
            byte[] bArr = this.f29296e;
            byte[] bArr2 = iVar.f29296e;
            int iG = G() + i11;
            int iG2 = G();
            int iG3 = iVar.G() + i10;
            while (iG2 < iG) {
                if (bArr[iG2] != bArr2[iG3]) {
                    return false;
                }
                iG2++;
                iG3++;
            }
            return true;
        }

        protected int G() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2802f
        public byte c(int i10) {
            return this.f29296e[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2802f
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC2802f) || size() != ((AbstractC2802f) obj).size()) {
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
                return F(iVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2802f
        protected void p(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f29296e, i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2802f
        byte s(int i10) {
            return this.f29296e[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2802f
        public int size() {
            return this.f29296e.length;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2802f
        protected final int u(int i10, int i11, int i12) {
            return AbstractC2816u.g(i10, this.f29296e, G() + i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2802f
        public final AbstractC2802f w(int i10, int i11) {
            int iE = AbstractC2802f.e(i10, i11, size());
            return iE == 0 ? AbstractC2802f.f29287b : new e(this.f29296e, G() + i10, iE);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$j */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class j implements InterfaceC0502f {
        private j() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2802f.InterfaceC0502f
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
        f29288c = AbstractC2800d.c() ? new j(null) : new d(null);
        f29289d = new b();
    }

    AbstractC2802f() {
    }

    static AbstractC2802f A(byte[] bArr) {
        return new i(bArr);
    }

    static AbstractC2802f B(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
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

    public static AbstractC2802f f(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static AbstractC2802f i(byte[] bArr, int i10, int i11) {
        e(i10, i10 + i11, bArr.length);
        return new i(f29288c.a(bArr, i10, i11));
    }

    public static AbstractC2802f l(String str) {
        return new i(str.getBytes(AbstractC2816u.f29503b));
    }

    public static int y(byte b10) {
        return b10 & 255;
    }

    private String z() {
        if (size() <= 50) {
            return f0.a(this);
        }
        return f0.a(w(0, 47)) + "...";
    }

    abstract void D(AbstractC2801e abstractC2801e);

    public abstract byte c(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iU = this.f29290a;
        if (iU == 0) {
            int size = size();
            iU = u(size, 0, size);
            if (iU == 0) {
                iU = 1;
            }
            this.f29290a = iU;
        }
        return iU;
    }

    protected abstract void p(byte[] bArr, int i10, int i11, int i12);

    abstract byte s(int i10);

    public abstract int size();

    public g t() {
        return new a();
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), z());
    }

    protected abstract int u(int i10, int i11, int i12);

    protected final int v() {
        return this.f29290a;
    }

    public abstract AbstractC2802f w(int i10, int i11);

    public final byte[] x() {
        int size = size();
        if (size == 0) {
            return AbstractC2816u.f29505d;
        }
        byte[] bArr = new byte[size];
        p(bArr, 0, 0, size);
        return bArr;
    }
}
