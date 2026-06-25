package Ze;

import Ze.d;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
class t extends Ze.d {

    /* JADX INFO: renamed from: h */
    private static final int[] f23353h;

    /* JADX INFO: renamed from: b */
    private final int f23354b;

    /* JADX INFO: renamed from: c */
    private final Ze.d f23355c;

    /* JADX INFO: renamed from: d */
    private final Ze.d f23356d;

    /* JADX INFO: renamed from: e */
    private final int f23357e;

    /* JADX INFO: renamed from: f */
    private final int f23358f;

    /* JADX INFO: renamed from: g */
    private int f23359g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c implements Iterator {

        /* JADX INFO: renamed from: a */
        private final Stack f23361a;

        /* JADX INFO: renamed from: b */
        private o f23362b;

        /* synthetic */ c(Ze.d dVar, a aVar) {
            this(dVar);
        }

        private o b(Ze.d dVar) {
            while (dVar instanceof t) {
                t tVar = (t) dVar;
                this.f23361a.push(tVar);
                dVar = tVar.f23355c;
            }
            return (o) dVar;
        }

        private o c() {
            while (!this.f23361a.isEmpty()) {
                o oVarB = b(((t) this.f23361a.pop()).f23356d);
                if (!oVarB.isEmpty()) {
                    return oVarB;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d */
        public o next() {
            o oVar = this.f23362b;
            if (oVar == null) {
                throw new NoSuchElementException();
            }
            this.f23362b = c();
            return oVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23362b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c(Ze.d dVar) {
            this.f23361a = new Stack();
            this.f23362b = b(dVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class d implements d.a {

        /* JADX INFO: renamed from: a */
        private final c f23363a;

        /* JADX INFO: renamed from: b */
        private d.a f23364b;

        /* JADX INFO: renamed from: c */
        int f23365c;

        /* synthetic */ d(t tVar, a aVar) {
            this();
        }

        @Override // Ze.d.a
        public byte a() {
            if (!this.f23364b.hasNext()) {
                this.f23364b = this.f23363a.next().iterator();
            }
            this.f23365c--;
            return this.f23364b.a();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b */
        public Byte next() {
            return Byte.valueOf(a());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23365c > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private d() {
            c cVar = new c(t.this);
            this.f23363a = cVar;
            this.f23364b = cVar.next().iterator();
            this.f23365c = t.this.size();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 1;
        while (i10 > 0) {
            arrayList.add(Integer.valueOf(i10));
            int i12 = i11 + i10;
            i11 = i10;
            i10 = i12;
        }
        arrayList.add(Integer.MAX_VALUE);
        f23353h = new int[arrayList.size()];
        int i13 = 0;
        while (true) {
            int[] iArr = f23353h;
            if (i13 >= iArr.length) {
                return;
            }
            iArr[i13] = ((Integer) arrayList.get(i13)).intValue();
            i13++;
        }
    }

    /* synthetic */ t(Ze.d dVar, Ze.d dVar2, a aVar) {
        this(dVar, dVar2);
    }

    static Ze.d I(Ze.d dVar, Ze.d dVar2) {
        t tVar = dVar instanceof t ? (t) dVar : null;
        if (dVar2.size() == 0) {
            return dVar;
        }
        if (dVar.size() == 0) {
            return dVar2;
        }
        int size = dVar.size() + dVar2.size();
        if (size < 128) {
            return K(dVar, dVar2);
        }
        if (tVar != null && tVar.f23356d.size() + dVar2.size() < 128) {
            return new t(tVar.f23355c, K(tVar.f23356d, dVar2));
        }
        if (tVar == null || tVar.f23355c.p() <= tVar.f23356d.p() || tVar.p() <= dVar2.p()) {
            return size >= f23353h[Math.max(dVar.p(), dVar2.p()) + 1] ? new t(dVar, dVar2) : new b().b(dVar, dVar2);
        }
        return new t(tVar.f23355c, new t(tVar.f23356d, dVar2));
    }

    private static o K(Ze.d dVar, Ze.d dVar2) {
        int size = dVar.size();
        int size2 = dVar2.size();
        byte[] bArr = new byte[size + size2];
        dVar.l(bArr, 0, 0, size);
        dVar2.l(bArr, 0, size, size2);
        return new o(bArr);
    }

    private boolean L(Ze.d dVar) {
        c cVar = new c(this);
        o oVar = (o) cVar.next();
        c cVar2 = new c(dVar);
        o oVar2 = (o) cVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = oVar.size() - i10;
            int size2 = oVar2.size() - i11;
            int iMin = Math.min(size, size2);
            if (!(i10 == 0 ? oVar.D(oVar2, i11, iMin) : oVar2.D(oVar, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.f23354b;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                oVar = (o) cVar.next();
                i10 = 0;
            } else {
                i10 += iMin;
            }
            if (iMin == size2) {
                oVar2 = (o) cVar2.next();
                i11 = 0;
            } else {
                i11 += iMin;
            }
        }
    }

    @Override // Ze.d
    void B(OutputStream outputStream, int i10, int i11) {
        int i12 = i10 + i11;
        int i13 = this.f23357e;
        if (i12 <= i13) {
            this.f23355c.B(outputStream, i10, i11);
        } else {
            if (i10 >= i13) {
                this.f23356d.B(outputStream, i10 - i13, i11);
                return;
            }
            int i14 = i13 - i10;
            this.f23355c.B(outputStream, i10, i14);
            this.f23356d.B(outputStream, 0, i11 - i14);
        }
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: M */
    public d.a iterator() {
        return new d();
    }

    public boolean equals(Object obj) {
        int iW;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Ze.d)) {
            return false;
        }
        Ze.d dVar = (Ze.d) obj;
        if (this.f23354b != dVar.size()) {
            return false;
        }
        if (this.f23354b == 0) {
            return true;
        }
        if (this.f23359g == 0 || (iW = dVar.w()) == 0 || this.f23359g == iW) {
            return L(dVar);
        }
        return false;
    }

    public int hashCode() {
        int iU = this.f23359g;
        if (iU == 0) {
            int i10 = this.f23354b;
            iU = u(i10, 0, i10);
            if (iU == 0) {
                iU = 1;
            }
            this.f23359g = iU;
        }
        return iU;
    }

    @Override // Ze.d
    protected void n(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.f23357e;
        if (i13 <= i14) {
            this.f23355c.n(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.f23356d.n(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.f23355c.n(bArr, i10, i11, i15);
            this.f23356d.n(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // Ze.d
    protected int p() {
        return this.f23358f;
    }

    @Override // Ze.d
    protected boolean r() {
        return this.f23354b >= f23353h[this.f23358f];
    }

    @Override // Ze.d
    public boolean s() {
        int iV = this.f23355c.v(0, 0, this.f23357e);
        Ze.d dVar = this.f23356d;
        return dVar.v(iV, 0, dVar.size()) == 0;
    }

    @Override // Ze.d
    public int size() {
        return this.f23354b;
    }

    @Override // Ze.d
    protected int u(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f23357e;
        if (i13 <= i14) {
            return this.f23355c.u(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f23356d.u(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f23356d.u(this.f23355c.u(i10, i11, i15), 0, i12 - i15);
    }

    @Override // Ze.d
    protected int v(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f23357e;
        if (i13 <= i14) {
            return this.f23355c.v(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f23356d.v(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f23356d.v(this.f23355c.v(i10, i11, i15), 0, i12 - i15);
    }

    @Override // Ze.d
    protected int w() {
        return this.f23359g;
    }

    @Override // Ze.d
    public String y(String str) {
        return new String(x(), str);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b {

        /* JADX INFO: renamed from: a */
        private final Stack f23360a;

        private b() {
            this.f23360a = new Stack();
        }

        public Ze.d b(Ze.d dVar, Ze.d dVar2) {
            c(dVar);
            c(dVar2);
            Ze.d tVar = (Ze.d) this.f23360a.pop();
            while (!this.f23360a.isEmpty()) {
                tVar = new t((Ze.d) this.f23360a.pop(), tVar);
            }
            return tVar;
        }

        private void c(Ze.d dVar) {
            if (dVar.r()) {
                e(dVar);
                return;
            }
            if (dVar instanceof t) {
                t tVar = (t) dVar;
                c(tVar.f23355c);
                c(tVar.f23356d);
            } else {
                String strValueOf = String.valueOf(dVar.getClass());
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
                sb2.append("Has a new type of ByteString been created? Found ");
                sb2.append(strValueOf);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        private int d(int i10) {
            int iBinarySearch = Arrays.binarySearch(t.f23353h, i10);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        private void e(Ze.d dVar) {
            int iD = d(dVar.size());
            int i10 = t.f23353h[iD + 1];
            if (this.f23360a.isEmpty() || ((Ze.d) this.f23360a.peek()).size() >= i10) {
                this.f23360a.push(dVar);
                return;
            }
            int i11 = t.f23353h[iD];
            Ze.d tVar = (Ze.d) this.f23360a.pop();
            while (!this.f23360a.isEmpty() && ((Ze.d) this.f23360a.peek()).size() < i11) {
                tVar = new t((Ze.d) this.f23360a.pop(), tVar);
            }
            t tVar2 = new t(tVar, dVar);
            while (!this.f23360a.isEmpty()) {
                if (((Ze.d) this.f23360a.peek()).size() >= t.f23353h[d(tVar2.size()) + 1]) {
                    break;
                } else {
                    tVar2 = new t((Ze.d) this.f23360a.pop(), tVar2);
                }
            }
            this.f23360a.push(tVar2);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    private t(Ze.d dVar, Ze.d dVar2) {
        this.f23359g = 0;
        this.f23355c = dVar;
        this.f23356d = dVar2;
        int size = dVar.size();
        this.f23357e = size;
        this.f23354b = size + dVar2.size();
        this.f23358f = Math.max(dVar.p(), dVar2.p()) + 1;
    }
}
