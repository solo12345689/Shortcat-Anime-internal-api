package o3;

import P9.AbstractC2011u;
import U2.AbstractC2242c;
import U2.B;
import U2.I;
import U2.InterfaceC2255p;
import U2.InterfaceC2256q;
import U2.J;
import U2.N;
import U2.O;
import U2.P;
import j3.C5333a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import q2.C6078J;
import q2.C6080L;
import q2.C6109x;
import r3.r;
import t2.AbstractC6614a;
import t2.C6609I;
import t2.a0;
import u2.AbstractC6723e;
import u2.AbstractC6726h;
import u2.C6721c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements InterfaceC2255p, J {

    /* JADX INFO: renamed from: G */
    public static final U2.u f54357G = new U2.u() { // from class: o3.m
        @Override // U2.u
        public final InterfaceC2255p[] f() {
            return n.p();
        }
    };

    /* JADX INFO: renamed from: A */
    private a[] f54358A;

    /* JADX INFO: renamed from: B */
    private long[][] f54359B;

    /* JADX INFO: renamed from: C */
    private int f54360C;

    /* JADX INFO: renamed from: D */
    private long f54361D;

    /* JADX INFO: renamed from: E */
    private int f54362E;

    /* JADX INFO: renamed from: F */
    private C5333a f54363F;

    /* JADX INFO: renamed from: a */
    private final r.a f54364a;

    /* JADX INFO: renamed from: b */
    private final int f54365b;

    /* JADX INFO: renamed from: c */
    private final C6609I f54366c;

    /* JADX INFO: renamed from: d */
    private final C6609I f54367d;

    /* JADX INFO: renamed from: e */
    private final C6609I f54368e;

    /* JADX INFO: renamed from: f */
    private final C6609I f54369f;

    /* JADX INFO: renamed from: g */
    private final ArrayDeque f54370g;

    /* JADX INFO: renamed from: h */
    private final q f54371h;

    /* JADX INFO: renamed from: i */
    private final List f54372i;

    /* JADX INFO: renamed from: j */
    private AbstractC2011u f54373j = AbstractC2011u.A();

    /* JADX INFO: renamed from: k */
    private int f54374k;

    /* JADX INFO: renamed from: l */
    private int f54375l;

    /* JADX INFO: renamed from: m */
    private long f54376m;

    /* JADX INFO: renamed from: n */
    private int f54377n;

    /* JADX INFO: renamed from: o */
    private C6609I f54378o;

    /* JADX INFO: renamed from: p */
    private int f54379p;

    /* JADX INFO: renamed from: q */
    private int f54380q;

    /* JADX INFO: renamed from: r */
    private int f54381r;

    /* JADX INFO: renamed from: s */
    private int f54382s;

    /* JADX INFO: renamed from: t */
    private boolean f54383t;

    /* JADX INFO: renamed from: u */
    private boolean f54384u;

    /* JADX INFO: renamed from: v */
    private boolean f54385v;

    /* JADX INFO: renamed from: w */
    private long f54386w;

    /* JADX INFO: renamed from: x */
    private boolean f54387x;

    /* JADX INFO: renamed from: y */
    private long f54388y;

    /* JADX INFO: renamed from: z */
    private U2.r f54389z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a */
        public final t f54390a;

        /* JADX INFO: renamed from: b */
        public final w f54391b;

        /* JADX INFO: renamed from: c */
        public final O f54392c;

        /* JADX INFO: renamed from: d */
        public final P f54393d;

        /* JADX INFO: renamed from: e */
        public int f54394e;

        public a(t tVar, w wVar, O o10) {
            this.f54390a = tVar;
            this.f54391b = wVar;
            this.f54392c = o10;
            this.f54393d = "audio/true-hd".equals(tVar.f54415g.f57022o) ? new P() : null;
        }
    }

    public n(r.a aVar, int i10) {
        this.f54364a = aVar;
        this.f54365b = i10;
        this.f54374k = (i10 & 4) != 0 ? 3 : 0;
        this.f54371h = new q();
        this.f54372i = new ArrayList();
        this.f54369f = new C6609I(16);
        this.f54370g = new ArrayDeque();
        this.f54366c = new C6609I(AbstractC6726h.f61236a);
        this.f54367d = new C6609I(6);
        this.f54368e = new C6609I();
        this.f54379p = -1;
        this.f54389z = U2.r.f19092P;
        this.f54358A = new a[0];
    }

    private static long A(w wVar, long j10, long j11) {
        int iY = y(wVar, j10);
        return iY == -1 ? j11 : Math.min(wVar.f54446c[iY], j11);
    }

    private void B(C6078J c6078j) {
        C6721c c6721cA = j.a(c6078j, "auxiliary.tracks.interleaved");
        if (c6721cA == null || c6721cA.f61222b[0] != 0) {
            return;
        }
        this.f54388y = this.f54386w + 16;
    }

    private void C(InterfaceC2256q interfaceC2256q) {
        this.f54368e.X(8);
        interfaceC2256q.o(this.f54368e.f(), 0, 8);
        AbstractC5811b.g(this.f54368e);
        interfaceC2256q.m(this.f54368e.g());
        interfaceC2256q.g();
    }

    private void D(long j10) {
        while (!this.f54370g.isEmpty() && ((AbstractC6723e.b) this.f54370g.peek()).f61227b == j10) {
            AbstractC6723e.b bVar = (AbstractC6723e.b) this.f54370g.pop();
            if (bVar.f61226a == 1836019574) {
                G(bVar);
                this.f54370g.clear();
                if (!this.f54385v) {
                    this.f54374k = 2;
                }
            } else if (!this.f54370g.isEmpty()) {
                ((AbstractC6723e.b) this.f54370g.peek()).b(bVar);
            }
        }
        if (this.f54374k != 2) {
            u();
        }
    }

    private void E() {
        if (this.f54362E != 2 || (this.f54365b & 2) == 0) {
            return;
        }
        O oE = this.f54389z.e(0, 4);
        C5333a c5333a = this.f54363F;
        oE.c(new C6109x.b().r0(c5333a == null ? null : new C6078J(c5333a)).P());
        this.f54389z.p();
        this.f54389z.t(new J.b(-9223372036854775807L));
    }

    private static int F(C6609I c6609i) {
        c6609i.b0(8);
        int iQ = q(c6609i.v());
        if (iQ != 0) {
            return iQ;
        }
        c6609i.c0(4);
        while (c6609i.a() > 0) {
            int iQ2 = q(c6609i.v());
            if (iQ2 != 0) {
                return iQ2;
            }
        }
        return 0;
    }

    private void G(AbstractC6723e.b bVar) {
        List list;
        C6078J c6078j;
        C6078J c6078j2;
        List list2;
        C6078J c6078j3;
        C6078J c6078j4;
        B b10;
        String str;
        ArrayList arrayList;
        AbstractC6723e.b bVarD = bVar.d(1835365473);
        List arrayList2 = new ArrayList();
        if (bVarD != null) {
            C6078J c6078jU = AbstractC5811b.u(bVarD);
            if (this.f54387x) {
                AbstractC6614a.i(c6078jU);
                B(c6078jU);
                arrayList2 = v(c6078jU);
            } else if (O(c6078jU)) {
                this.f54385v = true;
                return;
            }
            c6078j = c6078jU;
            list = arrayList2;
        } else {
            list = arrayList2;
            c6078j = null;
        }
        ArrayList arrayList3 = new ArrayList();
        boolean z10 = this.f54362E == 1;
        B b11 = new B();
        AbstractC6723e.c cVarE = bVar.e(1969517665);
        if (cVarE != null) {
            C6078J c6078jI = AbstractC5811b.I(cVarE);
            b11.c(c6078jI);
            c6078j2 = c6078jI;
        } else {
            c6078j2 = null;
        }
        C6078J c6078j5 = new C6078J(AbstractC5811b.w(((AbstractC6723e.c) AbstractC6614a.e(bVar.e(1836476516))).f61230b));
        List listH = AbstractC5811b.H(bVar, b11, -9223372036854775807L, null, (this.f54365b & 1) != 0, z10, new O9.f() { // from class: o3.l
            @Override // O9.f
            public final Object apply(Object obj) {
                return n.o((t) obj);
            }
        });
        if (this.f54387x) {
            AbstractC6614a.h(list.size() == listH.size(), String.format(Locale.US, "The number of auxiliary track types from metadata (%d) is not same as the number of auxiliary tracks (%d)", Integer.valueOf(list.size()), Integer.valueOf(listH.size())));
        }
        String strA = k.a(listH);
        int i10 = 0;
        int i11 = 0;
        long jMax = -9223372036854775807L;
        int size = -1;
        while (i10 < listH.size()) {
            w wVar = (w) listH.get(i10);
            if (wVar.f54445b == 0) {
                list2 = listH;
                b10 = b11;
                str = strA;
                c6078j3 = c6078j;
                arrayList = arrayList3;
            } else {
                t tVar = wVar.f54444a;
                list2 = listH;
                ArrayList arrayList4 = arrayList3;
                int i12 = i11 + 1;
                String str2 = strA;
                a aVar = new a(tVar, wVar, this.f54389z.e(i11, tVar.f54410b));
                c6078j3 = c6078j;
                long j10 = tVar.f54413e;
                if (j10 == -9223372036854775807L) {
                    j10 = wVar.f54451h;
                }
                aVar.f54392c.d(j10);
                jMax = Math.max(jMax, j10);
                int i13 = "audio/true-hd".equals(tVar.f54415g.f57022o) ? wVar.f54448e * 16 : wVar.f54448e + 30;
                C6109x.b bVarB = tVar.f54415g.b();
                bVarB.o0(i13);
                if (tVar.f54410b == 2) {
                    int i14 = tVar.f54415g.f57013f;
                    if ((this.f54365b & 8) != 0) {
                        i14 |= size == -1 ? 1 : 2;
                    }
                    if (this.f54387x) {
                        i14 |= 32768;
                        bVarB.R(((Integer) list.get(i10)).intValue());
                    }
                    bVarB.w0(i14);
                }
                j.l(tVar.f54410b, b11, bVarB);
                int i15 = tVar.f54410b;
                C6078J c6078j6 = tVar.f54415g.f57019l;
                if (this.f54372i.isEmpty()) {
                    b10 = b11;
                    c6078j4 = null;
                } else {
                    b10 = b11;
                    c6078j4 = new C6078J(this.f54372i);
                }
                j.m(i15, c6078j3, bVarB, c6078j6, c6078j4, c6078j2, c6078j5);
                str = str2;
                bVarB.W(str);
                aVar.f54392c.c(bVarB.P());
                if (tVar.f54410b == 2 && size == -1) {
                    size = arrayList4.size();
                }
                arrayList = arrayList4;
                arrayList.add(aVar);
                i11 = i12;
            }
            i10++;
            c6078j = c6078j3;
            arrayList3 = arrayList;
            listH = list2;
            strA = str;
            b11 = b10;
        }
        this.f54360C = size;
        this.f54361D = jMax;
        a[] aVarArr = (a[]) arrayList3.toArray(new a[0]);
        this.f54358A = aVarArr;
        this.f54359B = r(aVarArr);
        this.f54389z.p();
        this.f54389z.t(this);
    }

    private void H(long j10) {
        if (this.f54375l == 1836086884) {
            int i10 = this.f54377n;
            this.f54363F = new C5333a(0L, j10, -9223372036854775807L, j10 + ((long) i10), this.f54376m - ((long) i10));
        }
    }

    private boolean I(InterfaceC2256q interfaceC2256q) throws C6080L {
        AbstractC6723e.b bVar;
        if (this.f54377n == 0) {
            if (!interfaceC2256q.h(this.f54369f.f(), 0, 8, true)) {
                E();
                return false;
            }
            this.f54377n = 8;
            this.f54369f.b0(0);
            this.f54376m = this.f54369f.O();
            this.f54375l = this.f54369f.v();
        }
        long j10 = this.f54376m;
        if (j10 == 1) {
            interfaceC2256q.readFully(this.f54369f.f(), 8, 8);
            this.f54377n += 8;
            this.f54376m = this.f54369f.T();
        } else if (j10 == 0) {
            long length = interfaceC2256q.getLength();
            if (length == -1 && (bVar = (AbstractC6723e.b) this.f54370g.peek()) != null) {
                length = bVar.f61227b;
            }
            if (length != -1) {
                this.f54376m = (length - interfaceC2256q.getPosition()) + ((long) this.f54377n);
            }
        }
        if (this.f54376m < this.f54377n) {
            throw C6080L.d("Atom size less than header length (unsupported).");
        }
        if (M(this.f54375l)) {
            long position = interfaceC2256q.getPosition();
            long j11 = this.f54376m;
            int i10 = this.f54377n;
            long j12 = (position + j11) - ((long) i10);
            if (j11 != i10 && this.f54375l == 1835365473) {
                C(interfaceC2256q);
            }
            this.f54370g.push(new AbstractC6723e.b(this.f54375l, j12));
            if (this.f54376m == this.f54377n) {
                D(j12);
            } else {
                u();
            }
        } else if (N(this.f54375l)) {
            AbstractC6614a.g(this.f54377n == 8);
            AbstractC6614a.g(this.f54376m <= 2147483647L);
            C6609I c6609i = new C6609I((int) this.f54376m);
            System.arraycopy(this.f54369f.f(), 0, c6609i.f(), 0, 8);
            this.f54378o = c6609i;
            this.f54374k = 1;
        } else {
            H(interfaceC2256q.getPosition() - ((long) this.f54377n));
            this.f54378o = null;
            this.f54374k = 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean J(U2.InterfaceC2256q r10, U2.I r11) {
        /*
            r9 = this;
            long r0 = r9.f54376m
            int r2 = r9.f54377n
            long r2 = (long) r2
            long r0 = r0 - r2
            long r2 = r10.getPosition()
            long r2 = r2 + r0
            t2.I r4 = r9.f54378o
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L46
            byte[] r7 = r4.f()
            int r8 = r9.f54377n
            int r0 = (int) r0
            r10.readFully(r7, r8, r0)
            int r10 = r9.f54375l
            r0 = 1718909296(0x66747970, float:2.8862439E23)
            if (r10 != r0) goto L2b
            r9.f54384u = r5
            int r10 = F(r4)
            r9.f54362E = r10
            goto L5e
        L2b:
            java.util.ArrayDeque r10 = r9.f54370g
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L5e
            java.util.ArrayDeque r10 = r9.f54370g
            java.lang.Object r10 = r10.peek()
            u2.e$b r10 = (u2.AbstractC6723e.b) r10
            u2.e$c r0 = new u2.e$c
            int r1 = r9.f54375l
            r0.<init>(r1, r4)
            r10.c(r0)
            goto L5e
        L46:
            boolean r4 = r9.f54384u
            if (r4 != 0) goto L53
            int r4 = r9.f54375l
            r7 = 1835295092(0x6d646174, float:4.4175247E27)
            if (r4 != r7) goto L53
            r9.f54362E = r5
        L53:
            r7 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 >= 0) goto L60
            int r0 = (int) r0
            r10.m(r0)
        L5e:
            r10 = r6
            goto L68
        L60:
            long r7 = r10.getPosition()
            long r7 = r7 + r0
            r11.f18917a = r7
            r10 = r5
        L68:
            r9.D(r2)
            boolean r0 = r9.f54385v
            if (r0 == 0) goto L78
            r9.f54387x = r5
            long r0 = r9.f54386w
            r11.f18917a = r0
            r9.f54385v = r6
            r10 = r5
        L78:
            if (r10 == 0) goto L80
            int r10 = r9.f54374k
            r11 = 2
            if (r10 == r11) goto L80
            return r5
        L80:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.n.J(U2.q, U2.I):boolean");
    }

    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean, int] */
    private int K(InterfaceC2256q interfaceC2256q, I i10) throws C6080L {
        O.a aVar;
        ?? r12;
        int iO;
        long position = interfaceC2256q.getPosition();
        if (this.f54379p == -1) {
            int iZ = z(position);
            this.f54379p = iZ;
            if (iZ == -1) {
                return -1;
            }
        }
        a aVar2 = this.f54358A[this.f54379p];
        O o10 = aVar2.f54392c;
        int i11 = aVar2.f54394e;
        w wVar = aVar2.f54391b;
        long j10 = wVar.f54446c[i11] + this.f54388y;
        int i12 = wVar.f54447d[i11];
        P p10 = aVar2.f54393d;
        long j11 = (j10 - position) + ((long) this.f54380q);
        if (j11 < 0 || j11 >= 262144) {
            i10.f18917a = j10;
            return 1;
        }
        if (aVar2.f54390a.f54416h == 1) {
            j11 += 8;
            i12 -= 8;
        }
        interfaceC2256q.m((int) j11);
        if (!s(aVar2.f54390a.f54415g)) {
            this.f54383t = true;
        }
        t tVar = aVar2.f54390a;
        if (tVar.f54419k == 0) {
            aVar = null;
            if ("audio/ac4".equals(tVar.f54415g.f57022o)) {
                if (this.f54381r == 0) {
                    AbstractC2242c.b(i12, this.f54368e);
                    o10.f(this.f54368e, 7);
                    this.f54381r += 7;
                }
                i12 += 7;
            } else if (p10 != null) {
                p10.d(interfaceC2256q);
            }
            while (true) {
                int i13 = this.f54381r;
                if (i13 >= i12) {
                    break;
                }
                int iE = o10.e(interfaceC2256q, i12 - i13, false);
                this.f54380q += iE;
                this.f54381r += iE;
                this.f54382s -= iE;
            }
        } else {
            byte[] bArrF = this.f54367d.f();
            bArrF[0] = 0;
            bArrF[1] = 0;
            bArrF[2] = 0;
            int i14 = 4 - aVar2.f54390a.f54419k;
            i12 += i14;
            while (this.f54381r < i12) {
                int i15 = this.f54382s;
                if (i15 == 0) {
                    t tVar2 = aVar2.f54390a;
                    int i16 = tVar2.f54419k;
                    if (this.f54383t || AbstractC6726h.o(tVar2.f54415g) + i16 > aVar2.f54391b.f54447d[i11] - this.f54380q) {
                        iO = 0;
                    } else {
                        iO = AbstractC6726h.o(aVar2.f54390a.f54415g);
                        i16 = aVar2.f54390a.f54419k + iO;
                    }
                    interfaceC2256q.readFully(bArrF, i14, i16);
                    this.f54380q += i16;
                    this.f54367d.b0(0);
                    int iV = this.f54367d.v();
                    if (iV < 0) {
                        throw C6080L.a("Invalid NAL length", null);
                    }
                    this.f54382s = iV - iO;
                    this.f54366c.b0(0);
                    o10.f(this.f54366c, 4);
                    this.f54381r += 4;
                    if (iO > 0) {
                        o10.f(this.f54367d, iO);
                        this.f54381r += iO;
                        if (AbstractC6726h.k(bArrF, 4, iO, aVar2.f54390a.f54415g)) {
                            this.f54383t = true;
                        }
                    }
                } else {
                    int iE2 = o10.e(interfaceC2256q, i15, false);
                    this.f54380q += iE2;
                    this.f54381r += iE2;
                    this.f54382s -= iE2;
                }
            }
            aVar = null;
        }
        int i17 = i12;
        w wVar2 = aVar2.f54391b;
        long j12 = wVar2.f54449f[i11];
        int i18 = wVar2.f54450g[i11];
        if (!this.f54383t) {
            i18 |= 67108864;
        }
        int i19 = i18;
        if (p10 != null) {
            boolean z10 = false;
            p10.c(o10, j12, i19, i17, 0, null);
            r12 = z10;
            if (i11 + 1 == aVar2.f54391b.f54445b) {
                p10.a(o10, aVar);
                r12 = z10;
            }
        } else {
            r12 = 0;
            o10.a(j12, i19, i17, 0, null);
        }
        aVar2.f54394e++;
        this.f54379p = -1;
        this.f54380q = r12;
        this.f54381r = r12;
        this.f54382s = r12;
        this.f54383t = r12;
        return r12;
    }

    private int L(InterfaceC2256q interfaceC2256q, I i10) throws C6080L {
        int iC = this.f54371h.c(interfaceC2256q, i10, this.f54372i);
        if (iC == 1 && i10.f18917a == 0) {
            u();
        }
        return iC;
    }

    private static boolean M(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473 || i10 == 1635284069;
    }

    private static boolean N(int i10) {
        return i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    private boolean O(C6078J c6078j) {
        C6721c c6721cA;
        if (c6078j != null && (this.f54365b & 64) != 0 && (c6721cA = j.a(c6078j, "auxiliary.tracks.offset")) != null) {
            long jT = new C6609I(c6721cA.f61222b).T();
            if (jT > 0) {
                this.f54386w = jT;
                return true;
            }
        }
        return false;
    }

    private void P(a aVar, long j10) {
        w wVar = aVar.f54391b;
        int iA = wVar.a(j10);
        if (iA == -1) {
            iA = wVar.b(j10);
        }
        aVar.f54394e = iA;
    }

    public static /* synthetic */ InterfaceC2255p[] p() {
        return new InterfaceC2255p[]{new n(r.a.f58521a, 16)};
    }

    private static int q(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static long[][] r(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            jArr[i10] = new long[aVarArr[i10].f54391b.f54445b];
            jArr2[i10] = aVarArr[i10].f54391b.f54449f[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < aVarArr.length) {
            long j11 = Long.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < aVarArr.length; i13++) {
                if (!zArr[i13]) {
                    long j12 = jArr2[i13];
                    if (j12 <= j11) {
                        i12 = i13;
                        j11 = j12;
                    }
                }
            }
            int i14 = iArr[i12];
            long[] jArr3 = jArr[i12];
            jArr3[i14] = j10;
            w wVar = aVarArr[i12].f54391b;
            j10 += (long) wVar.f54447d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr3.length) {
                jArr2[i12] = wVar.f54449f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    private boolean s(C6109x c6109x) {
        return Objects.equals(c6109x.f57022o, "video/avc") ? (this.f54365b & 32) != 0 : Objects.equals(c6109x.f57022o, "video/hevc") && (this.f54365b & 128) != 0;
    }

    public static int t(int i10) {
        int i11 = (i10 & 1) != 0 ? 32 : 0;
        return (i10 & 2) != 0 ? i11 | 128 : i11;
    }

    private void u() {
        this.f54374k = 0;
        this.f54377n = 0;
    }

    private List v(C6078J c6078j) {
        List listD = ((C6721c) AbstractC6614a.i(j.a(c6078j, "auxiliary.tracks.map"))).d();
        ArrayList arrayList = new ArrayList(listD.size());
        for (int i10 = 0; i10 < listD.size(); i10++) {
            int iIntValue = ((Integer) listD.get(i10)).intValue();
            int i11 = 1;
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    i11 = 3;
                    if (iIntValue != 2) {
                        i11 = iIntValue != 3 ? 0 : 4;
                    }
                } else {
                    i11 = 2;
                }
            }
            arrayList.add(Integer.valueOf(i11));
        }
        return arrayList;
    }

    private static int y(w wVar, long j10) {
        int iA = wVar.a(j10);
        return iA == -1 ? wVar.b(j10) : iA;
    }

    private int z(long j10) {
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.f54358A;
            if (i12 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i12];
            int i13 = aVar.f54394e;
            w wVar = aVar.f54391b;
            if (i13 != wVar.f54445b) {
                long j14 = wVar.f54446c[i13];
                long j15 = ((long[][]) a0.l(this.f54359B))[i12][i13];
                long j16 = j14 - j10;
                boolean z12 = j16 < 0 || j16 >= 262144;
                if ((!z12 && z11) || (z12 == z11 && j16 < j13)) {
                    z11 = z12;
                    j12 = j15;
                    i11 = i12;
                    j13 = j16;
                }
                if (j15 < j11) {
                    z10 = z12;
                    j11 = j15;
                    i10 = i12;
                }
            }
            i12++;
        }
        return (j11 == Long.MAX_VALUE || !z10 || j12 < j11 + 10485760) ? i11 : i10;
    }

    @Override // U2.InterfaceC2255p
    public void b(long j10, long j11) {
        this.f54370g.clear();
        this.f54377n = 0;
        this.f54379p = -1;
        this.f54380q = 0;
        this.f54381r = 0;
        this.f54382s = 0;
        this.f54383t = false;
        if (j10 == 0) {
            if (this.f54374k != 3) {
                u();
                return;
            } else {
                this.f54371h.g();
                this.f54372i.clear();
                return;
            }
        }
        for (a aVar : this.f54358A) {
            P(aVar, j11);
            P p10 = aVar.f54393d;
            if (p10 != null) {
                p10.b();
            }
        }
    }

    @Override // U2.InterfaceC2255p
    public void c(U2.r rVar) {
        if ((this.f54365b & 16) == 0) {
            rVar = new r3.s(rVar, this.f54364a);
        }
        this.f54389z = rVar;
    }

    @Override // U2.InterfaceC2255p
    public boolean f(InterfaceC2256q interfaceC2256q) {
        N nD = s.d(interfaceC2256q, (this.f54365b & 2) != 0);
        this.f54373j = nD != null ? AbstractC2011u.B(nD) : AbstractC2011u.A();
        return nD == null;
    }

    @Override // U2.J
    public J.a g(long j10) {
        return w(j10, -1);
    }

    @Override // U2.InterfaceC2255p
    public int h(InterfaceC2256q interfaceC2256q, I i10) {
        while (true) {
            int i11 = this.f54374k;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        return K(interfaceC2256q, i10);
                    }
                    if (i11 == 3) {
                        return L(interfaceC2256q, i10);
                    }
                    throw new IllegalStateException();
                }
                if (J(interfaceC2256q, i10)) {
                    return 1;
                }
            } else if (!I(interfaceC2256q)) {
                return -1;
            }
        }
    }

    @Override // U2.J
    public boolean k() {
        return true;
    }

    @Override // U2.J
    public long n() {
        return this.f54361D;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public U2.J.a w(long r17, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            o3.n$a[] r4 = r0.f54358A
            int r5 = r4.length
            if (r5 != 0) goto L13
            U2.J$a r1 = new U2.J$a
            U2.K r2 = U2.K.f18922c
            r1.<init>(r2)
            return r1
        L13:
            r5 = -1
            if (r3 == r5) goto L18
            r6 = r3
            goto L1a
        L18:
            int r6 = r0.f54360C
        L1a:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = -1
            if (r6 == r5) goto L58
            r4 = r4[r6]
            o3.w r4 = r4.f54391b
            int r6 = y(r4, r1)
            if (r6 != r5) goto L35
            U2.J$a r1 = new U2.J$a
            U2.K r2 = U2.K.f18922c
            r1.<init>(r2)
            return r1
        L35:
            long[] r11 = r4.f54449f
            r12 = r11[r6]
            long[] r11 = r4.f54446c
            r14 = r11[r6]
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r11 >= 0) goto L5e
            int r11 = r4.f54445b
            int r11 = r11 + (-1)
            if (r6 >= r11) goto L5e
            int r1 = r4.b(r1)
            if (r1 == r5) goto L5e
            if (r1 == r6) goto L5e
            long[] r2 = r4.f54449f
            r9 = r2[r1]
            long[] r2 = r4.f54446c
            r1 = r2[r1]
            goto L60
        L58:
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = r1
        L5e:
            r1 = r9
            r9 = r7
        L60:
            if (r3 != r5) goto L80
            r3 = 0
        L63:
            o3.n$a[] r4 = r0.f54358A
            int r5 = r4.length
            if (r3 >= r5) goto L80
            int r5 = r0.f54360C
            if (r3 == r5) goto L7d
            r4 = r4[r3]
            o3.w r4 = r4.f54391b
            long r5 = A(r4, r12, r14)
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L7c
            long r1 = A(r4, r9, r1)
        L7c:
            r14 = r5
        L7d:
            int r3 = r3 + 1
            goto L63
        L80:
            U2.K r3 = new U2.K
            r3.<init>(r12, r14)
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 != 0) goto L8f
            U2.J$a r1 = new U2.J$a
            r1.<init>(r3)
            return r1
        L8f:
            U2.K r4 = new U2.K
            r4.<init>(r9, r1)
            U2.J$a r1 = new U2.J$a
            r1.<init>(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.n.w(long, int):U2.J$a");
    }

    @Override // U2.InterfaceC2255p
    /* JADX INFO: renamed from: x */
    public AbstractC2011u l() {
        return this.f54373j;
    }

    @Override // U2.InterfaceC2255p
    public void a() {
    }

    public static /* synthetic */ t o(t tVar) {
        return tVar;
    }
}
