package B3;

import B3.L;
import U2.InterfaceC2255p;
import U2.InterfaceC2256q;
import U2.J;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import q2.C6080L;
import r3.r;
import t2.AbstractC6614a;
import t2.C6608H;
import t2.C6609I;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class K implements InterfaceC2255p {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final U2.u f1107v = new U2.u() { // from class: B3.J
        @Override // U2.u
        public final InterfaceC2255p[] f() {
            return K.d();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f1111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C6609I f1112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SparseIntArray f1113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final L.c f1114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final r.a f1115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SparseArray f1116i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final SparseBooleanArray f1117j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final SparseBooleanArray f1118k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final I f1119l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private H f1120m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private U2.r f1121n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f1122o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f1123p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f1124q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f1125r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private L f1126s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f1127t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f1128u;

    public K(int i10, r.a aVar) {
        this(1, i10, aVar, new t2.O(0L), new C1092j(0), 112800);
    }

    private void A() {
        this.f1117j.clear();
        this.f1116i.clear();
        SparseArray sparseArrayA = this.f1114g.a();
        int size = sparseArrayA.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f1116i.put(sparseArrayA.keyAt(i10), (L) sparseArrayA.valueAt(i10));
        }
        this.f1116i.put(0, new E(new a()));
        this.f1126s = null;
    }

    private boolean B(int i10) {
        return this.f1108a == 2 || this.f1123p || !this.f1118k.get(i10, false);
    }

    public static /* synthetic */ InterfaceC2255p[] d() {
        return new InterfaceC2255p[]{new K(1, r.a.f58521a)};
    }

    static /* synthetic */ int n(K k10) {
        int i10 = k10.f1122o;
        k10.f1122o = i10 + 1;
        return i10;
    }

    private boolean x(InterfaceC2256q interfaceC2256q) {
        byte[] bArrF = this.f1112e.f();
        if (9400 - this.f1112e.g() < 188) {
            int iA = this.f1112e.a();
            if (iA > 0) {
                System.arraycopy(bArrF, this.f1112e.g(), bArrF, 0, iA);
            }
            this.f1112e.Z(bArrF, iA);
        }
        while (this.f1112e.a() < 188) {
            int iJ = this.f1112e.j();
            int i10 = interfaceC2256q.read(bArrF, iJ, 9400 - iJ);
            if (i10 == -1) {
                return false;
            }
            this.f1112e.a0(iJ + i10);
        }
        return true;
    }

    private int y() throws C6080L {
        int iG = this.f1112e.g();
        int iJ = this.f1112e.j();
        int iA = M.a(this.f1112e.f(), iG, iJ);
        this.f1112e.b0(iA);
        int i10 = iA + 188;
        if (i10 <= iJ) {
            this.f1127t = 0;
            return i10;
        }
        int i11 = this.f1127t + (iA - iG);
        this.f1127t = i11;
        if (this.f1108a != 2 || i11 <= 376) {
            return i10;
        }
        throw C6080L.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
    }

    private void z(long j10) {
        if (this.f1124q) {
            return;
        }
        this.f1124q = true;
        if (this.f1119l.b() == -9223372036854775807L) {
            this.f1121n.t(new J.b(this.f1119l.b()));
            return;
        }
        H h10 = new H(this.f1119l.c(), this.f1119l.b(), j10, this.f1128u, this.f1110c);
        this.f1120m = h10;
        this.f1121n.t(h10.b());
    }

    @Override // U2.InterfaceC2255p
    public void b(long j10, long j11) {
        H h10;
        AbstractC6614a.g(this.f1108a != 2);
        int size = this.f1111d.size();
        for (int i10 = 0; i10 < size; i10++) {
            t2.O o10 = (t2.O) this.f1111d.get(i10);
            boolean z10 = o10.f() == -9223372036854775807L;
            if (!z10) {
                long jD = o10.d();
                z10 = (jD == -9223372036854775807L || jD == 0 || jD == j11) ? false : true;
            }
            if (z10) {
                o10.i(j11);
            }
        }
        if (j11 != 0 && (h10 = this.f1120m) != null) {
            h10.h(j11);
        }
        this.f1112e.X(0);
        this.f1113f.clear();
        for (int i11 = 0; i11 < this.f1116i.size(); i11++) {
            ((L) this.f1116i.valueAt(i11)).c();
        }
        this.f1127t = 0;
    }

    @Override // U2.InterfaceC2255p
    public void c(U2.r rVar) {
        if ((this.f1109b & 1) == 0) {
            rVar = new r3.s(rVar, this.f1115h);
        }
        this.f1121n = rVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // U2.InterfaceC2255p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean f(U2.InterfaceC2256q r7) {
        /*
            r6 = this;
            t2.I r0 = r6.f1112e
            byte[] r0 = r0.f()
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.o(r0, r2, r1)
            r1 = r2
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L29
            r3 = r2
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r1 = r1 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.m(r1)
            r7 = 1
            return r7
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.K.f(U2.q):boolean");
    }

    @Override // U2.InterfaceC2255p
    public int h(InterfaceC2256q interfaceC2256q, U2.I i10) throws C6080L {
        int i11;
        long length = interfaceC2256q.getLength();
        boolean z10 = this.f1108a == 2;
        if (this.f1123p) {
            if (length != -1 && !z10 && !this.f1119l.d()) {
                return this.f1119l.e(interfaceC2256q, i10, this.f1128u);
            }
            z(length);
            if (this.f1125r) {
                this.f1125r = false;
                b(0L, 0L);
                if (interfaceC2256q.getPosition() != 0) {
                    i10.f18917a = 0L;
                    return 1;
                }
            }
            H h10 = this.f1120m;
            if (h10 != null && h10.d()) {
                return this.f1120m.c(interfaceC2256q, i10);
            }
        }
        if (!x(interfaceC2256q)) {
            for (int i12 = 0; i12 < this.f1116i.size(); i12++) {
                L l10 = (L) this.f1116i.valueAt(i12);
                if (l10 instanceof y) {
                    y yVar = (y) l10;
                    if (yVar.d(z10)) {
                        yVar.b(new C6609I(), 1);
                    }
                }
            }
            return -1;
        }
        int iY = y();
        int iJ = this.f1112e.j();
        if (iY > iJ) {
            return 0;
        }
        int iV = this.f1112e.v();
        if ((8388608 & iV) != 0) {
            this.f1112e.b0(iY);
            return 0;
        }
        int i13 = (4194304 & iV) != 0 ? 1 : 0;
        int i14 = (2096896 & iV) >> 8;
        boolean z11 = (iV & 32) != 0;
        L l11 = (iV & 16) != 0 ? (L) this.f1116i.get(i14) : null;
        if (l11 == null) {
            this.f1112e.b0(iY);
            return 0;
        }
        if (this.f1108a != 2) {
            int i15 = iV & 15;
            i11 = 0;
            int i16 = this.f1113f.get(i14, i15 - 1);
            this.f1113f.put(i14, i15);
            if (i16 == i15) {
                this.f1112e.b0(iY);
                return 0;
            }
            if (i15 != ((i16 + 1) & 15)) {
                l11.c();
            }
        } else {
            i11 = 0;
        }
        if (z11) {
            int iM = this.f1112e.M();
            i13 |= (this.f1112e.M() & 64) != 0 ? 2 : i11;
            this.f1112e.c0(iM - 1);
        }
        boolean z12 = this.f1123p;
        if (B(i14)) {
            this.f1112e.a0(iY);
            l11.b(this.f1112e, i13);
            this.f1112e.a0(iJ);
        }
        if (this.f1108a != 2 && !z12 && this.f1123p && length != -1) {
            this.f1125r = true;
        }
        this.f1112e.b0(iY);
        return i11;
    }

    public K(int i10, int i11, r.a aVar, t2.O o10, L.c cVar, int i12) {
        this.f1114g = (L.c) AbstractC6614a.e(cVar);
        this.f1110c = i12;
        this.f1108a = i10;
        this.f1109b = i11;
        this.f1115h = aVar;
        if (i10 == 1 || i10 == 2) {
            this.f1111d = Collections.singletonList(o10);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f1111d = arrayList;
            arrayList.add(o10);
        }
        this.f1112e = new C6609I(new byte[9400], 0);
        this.f1117j = new SparseBooleanArray();
        this.f1118k = new SparseBooleanArray();
        this.f1116i = new SparseArray();
        this.f1113f = new SparseIntArray();
        this.f1119l = new I(i12);
        this.f1121n = U2.r.f19092P;
        this.f1128u = -1;
        A();
    }

    @Override // U2.InterfaceC2255p
    public void a() {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class a implements D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C6608H f1129a = new C6608H(new byte[4]);

        public a() {
        }

        @Override // B3.D
        public void b(C6609I c6609i) {
            if (c6609i.M() == 0 && (c6609i.M() & 128) != 0) {
                c6609i.c0(6);
                int iA = c6609i.a() / 4;
                for (int i10 = 0; i10 < iA; i10++) {
                    c6609i.p(this.f1129a, 4);
                    int iH = this.f1129a.h(16);
                    this.f1129a.r(3);
                    if (iH == 0) {
                        this.f1129a.r(13);
                    } else {
                        int iH2 = this.f1129a.h(13);
                        if (K.this.f1116i.get(iH2) == null) {
                            K.this.f1116i.put(iH2, new E(K.this.new b(iH2)));
                            K.n(K.this);
                        }
                    }
                }
                if (K.this.f1108a != 2) {
                    K.this.f1116i.remove(0);
                }
            }
        }

        @Override // B3.D
        public void a(t2.O o10, U2.r rVar, L.d dVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class b implements D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C6608H f1131a = new C6608H(new byte[5]);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray f1132b = new SparseArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final SparseIntArray f1133c = new SparseIntArray();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f1134d;

        public b(int i10) {
            this.f1134d = i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private B3.L.b c(t2.C6609I r17, int r18) {
            /*
                Method dump skipped, instruction units count: 235
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: B3.K.b.c(t2.I, int):B3.L$b");
        }

        @Override // B3.D
        public void b(C6609I c6609i) {
            t2.O o10;
            if (c6609i.M() != 2) {
                return;
            }
            if (K.this.f1108a == 1 || K.this.f1108a == 2 || K.this.f1122o == 1) {
                o10 = (t2.O) K.this.f1111d.get(0);
            } else {
                o10 = new t2.O(((t2.O) K.this.f1111d.get(0)).d());
                K.this.f1111d.add(o10);
            }
            if ((c6609i.M() & 128) == 0) {
                return;
            }
            c6609i.c0(1);
            int iU = c6609i.U();
            int i10 = 3;
            c6609i.c0(3);
            c6609i.p(this.f1131a, 2);
            this.f1131a.r(3);
            int i11 = 13;
            K.this.f1128u = this.f1131a.h(13);
            c6609i.p(this.f1131a, 2);
            int i12 = 4;
            this.f1131a.r(4);
            c6609i.c0(this.f1131a.h(12));
            if (K.this.f1108a == 2 && K.this.f1126s == null) {
                L.b bVar = new L.b(21, null, 0, null, a0.f60567f);
                K k10 = K.this;
                k10.f1126s = k10.f1114g.b(21, bVar);
                if (K.this.f1126s != null) {
                    K.this.f1126s.a(o10, K.this.f1121n, new L.d(iU, 21, 8192));
                }
            }
            this.f1132b.clear();
            this.f1133c.clear();
            int iA = c6609i.a();
            while (iA > 0) {
                c6609i.p(this.f1131a, 5);
                int iH = this.f1131a.h(8);
                this.f1131a.r(i10);
                int iH2 = this.f1131a.h(i11);
                this.f1131a.r(i12);
                int iH3 = this.f1131a.h(12);
                L.b bVarC = c(c6609i, iH3);
                if (iH == 6 || iH == 5) {
                    iH = bVarC.f1139a;
                }
                iA -= iH3 + 5;
                int i13 = K.this.f1108a == 2 ? iH : iH2;
                if (!K.this.f1117j.get(i13)) {
                    L lB = (K.this.f1108a == 2 && iH == 21) ? K.this.f1126s : K.this.f1114g.b(iH, bVarC);
                    if (K.this.f1108a != 2 || iH2 < this.f1133c.get(i13, 8192)) {
                        this.f1133c.put(i13, iH2);
                        this.f1132b.put(i13, lB);
                    }
                }
                i10 = 3;
                i12 = 4;
                i11 = 13;
            }
            int size = this.f1133c.size();
            for (int i14 = 0; i14 < size; i14++) {
                int iKeyAt = this.f1133c.keyAt(i14);
                int iValueAt = this.f1133c.valueAt(i14);
                K.this.f1117j.put(iKeyAt, true);
                K.this.f1118k.put(iValueAt, true);
                L l10 = (L) this.f1132b.valueAt(i14);
                if (l10 != null) {
                    if (l10 != K.this.f1126s) {
                        l10.a(o10, K.this.f1121n, new L.d(iU, iKeyAt, 8192));
                    }
                    K.this.f1116i.put(iValueAt, l10);
                }
            }
            if (K.this.f1108a == 2) {
                if (K.this.f1123p) {
                    return;
                }
                K.this.f1121n.p();
                K.this.f1122o = 0;
                K.this.f1123p = true;
                return;
            }
            K.this.f1116i.remove(this.f1134d);
            K k11 = K.this;
            k11.f1122o = k11.f1108a == 1 ? 0 : K.this.f1122o - 1;
            if (K.this.f1122o == 0) {
                K.this.f1121n.p();
                K.this.f1123p = true;
            }
        }

        @Override // B3.D
        public void a(t2.O o10, U2.r rVar, L.d dVar) {
        }
    }
}
