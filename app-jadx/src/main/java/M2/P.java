package M2;

import M2.D;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import q2.C6071C;
import q2.Y;
import t2.AbstractC6614a;
import w2.InterfaceC6932F;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class P extends AbstractC1918h {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final C6071C f11706w = new C6071C.c().d("MergingMediaSource").a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f11707k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f11708l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final D[] f11709m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f11710n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final q2.Y[] f11711o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ArrayList f11712p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final InterfaceC1920j f11713q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Map f11714r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final P9.D f11715s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f11716t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long[][] f11717u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private c f11718v;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b extends AbstractC1932w {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long[] f11719f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long[] f11720g;

        public b(q2.Y y10, Map map) {
            super(y10);
            int iT = y10.t();
            this.f11720g = new long[y10.t()];
            Y.d dVar = new Y.d();
            for (int i10 = 0; i10 < iT; i10++) {
                this.f11720g[i10] = y10.r(i10, dVar).f56690m;
            }
            int iM = y10.m();
            this.f11719f = new long[iM];
            Y.b bVar = new Y.b();
            for (int i11 = 0; i11 < iM; i11++) {
                y10.k(i11, bVar, true);
                long jLongValue = ((Long) AbstractC6614a.e((Long) map.get(bVar.f56652b))).longValue();
                long[] jArr = this.f11719f;
                jLongValue = jLongValue == Long.MIN_VALUE ? bVar.f56654d : jLongValue;
                jArr[i11] = jLongValue;
                long j10 = bVar.f56654d;
                if (j10 != -9223372036854775807L) {
                    long[] jArr2 = this.f11720g;
                    int i12 = bVar.f56653c;
                    jArr2[i12] = jArr2[i12] - (j10 - jLongValue);
                }
            }
        }

        @Override // M2.AbstractC1932w, q2.Y
        public Y.b k(int i10, Y.b bVar, boolean z10) {
            super.k(i10, bVar, z10);
            bVar.f56654d = this.f11719f[i10];
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        @Override // M2.AbstractC1932w, q2.Y
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public q2.Y.d s(int r5, q2.Y.d r6, long r7) {
            /*
                r4 = this;
                super.s(r5, r6, r7)
                long[] r7 = r4.f11720g
                r0 = r7[r5]
                r6.f56690m = r0
                r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                if (r5 == 0) goto L1e
                long r2 = r6.f56689l
                int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r5 != 0) goto L19
                goto L1e
            L19:
                long r7 = java.lang.Math.min(r2, r0)
                goto L20
            L1e:
                long r7 = r6.f56689l
            L20:
                r6.f56689l = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: M2.P.b.s(int, q2.Y$d, long):q2.Y$d");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11721a;

        public c(int i10) {
            this.f11721a = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final D.b f11722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C f11723b;

        private d(D.b bVar, C c10) {
            this.f11722a = bVar;
            this.f11723b = c10;
        }
    }

    public P(D... dArr) {
        this(false, dArr);
    }

    private void J() {
        Y.b bVar = new Y.b();
        for (int i10 = 0; i10 < this.f11716t; i10++) {
            long j10 = -this.f11711o[0].j(i10, bVar).o();
            int i11 = 1;
            while (true) {
                q2.Y[] yArr = this.f11711o;
                if (i11 < yArr.length) {
                    this.f11717u[i10][i11] = j10 - (-yArr[i11].j(i10, bVar).o());
                    i11++;
                }
            }
        }
    }

    private void M() {
        q2.Y[] yArr;
        Y.b bVar = new Y.b();
        for (int i10 = 0; i10 < this.f11716t; i10++) {
            int i11 = 0;
            long j10 = Long.MIN_VALUE;
            while (true) {
                yArr = this.f11711o;
                if (i11 >= yArr.length) {
                    break;
                }
                long jK = yArr[i11].j(i10, bVar).k();
                if (jK != -9223372036854775807L) {
                    long j11 = jK + this.f11717u[i10][i11];
                    if (j10 == Long.MIN_VALUE || j11 < j10) {
                        j10 = j11;
                    }
                }
                i11++;
            }
            Object objQ = yArr[0].q(i10);
            this.f11714r.put(objQ, Long.valueOf(j10));
            Iterator it = this.f11715s.get(objQ).iterator();
            while (it.hasNext()) {
                ((C1915e) it.next()).x(0L, j10);
            }
        }
    }

    @Override // M2.AbstractC1918h, M2.AbstractC1911a
    protected void A(InterfaceC6932F interfaceC6932F) {
        super.A(interfaceC6932F);
        for (int i10 = 0; i10 < this.f11709m.length; i10++) {
            I(Integer.valueOf(i10), this.f11709m[i10]);
        }
    }

    @Override // M2.AbstractC1918h, M2.AbstractC1911a
    protected void C() {
        super.C();
        Arrays.fill(this.f11711o, (Object) null);
        this.f11716t = -1;
        this.f11718v = null;
        this.f11712p.clear();
        Collections.addAll(this.f11712p, this.f11709m);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // M2.AbstractC1918h
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public D.b E(Integer num, D.b bVar) {
        List list = (List) this.f11710n.get(num.intValue());
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((d) list.get(i10)).f11722a.equals(bVar)) {
                return ((d) ((List) this.f11710n.get(0)).get(i10)).f11722a;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // M2.AbstractC1918h
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void H(Integer num, D d10, q2.Y y10) {
        if (this.f11718v != null) {
            return;
        }
        if (this.f11716t == -1) {
            this.f11716t = y10.m();
        } else if (y10.m() != this.f11716t) {
            this.f11718v = new c(0);
            return;
        }
        if (this.f11717u.length == 0) {
            this.f11717u = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f11716t, this.f11711o.length);
        }
        this.f11712p.remove(d10);
        this.f11711o[num.intValue()] = y10;
        if (this.f11712p.isEmpty()) {
            if (this.f11707k) {
                J();
            }
            q2.Y bVar = this.f11711o[0];
            if (this.f11708l) {
                M();
                bVar = new b(bVar, this.f11714r);
            }
            B(bVar);
        }
    }

    @Override // M2.D
    public C6071C a() {
        D[] dArr = this.f11709m;
        return dArr.length > 0 ? dArr[0].a() : f11706w;
    }

    @Override // M2.D
    public boolean e(C6071C c6071c) {
        D[] dArr = this.f11709m;
        return dArr.length > 0 && dArr[0].e(c6071c);
    }

    @Override // M2.D
    public C f(D.b bVar, Q2.b bVar2, long j10) {
        int length = this.f11709m.length;
        C[] cArr = new C[length];
        int iF = this.f11711o[0].f(bVar.f11662a);
        for (int i10 = 0; i10 < length; i10++) {
            D.b bVarA = bVar.a(this.f11711o[i10].q(iF));
            cArr[i10] = this.f11709m[i10].f(bVarA, bVar2, j10 - this.f11717u[iF][i10]);
            ((List) this.f11710n.get(i10)).add(new d(bVarA, cArr[i10]));
        }
        O o10 = new O(this.f11713q, this.f11717u[iF], cArr);
        if (!this.f11708l) {
            return o10;
        }
        C1915e c1915e = new C1915e(o10, false, 0L, ((Long) AbstractC6614a.e((Long) this.f11714r.get(bVar.f11662a))).longValue());
        this.f11715s.put(bVar.f11662a, c1915e);
        return c1915e;
    }

    @Override // M2.D
    public void j(C6071C c6071c) {
        this.f11709m[0].j(c6071c);
    }

    @Override // M2.AbstractC1918h, M2.D
    public void l() throws c {
        c cVar = this.f11718v;
        if (cVar != null) {
            throw cVar;
        }
        super.l();
    }

    @Override // M2.D
    public void m(C c10) {
        if (this.f11708l) {
            C1915e c1915e = (C1915e) c10;
            Iterator it = this.f11715s.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((C1915e) entry.getValue()).equals(c1915e)) {
                    this.f11715s.remove(entry.getKey(), entry.getValue());
                    break;
                }
            }
            c10 = c1915e.f11880a;
        }
        O o10 = (O) c10;
        for (int i10 = 0; i10 < this.f11709m.length; i10++) {
            List list = (List) this.f11710n.get(i10);
            C cN = o10.n(i10);
            int i11 = 0;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                if (((d) list.get(i11)).f11723b.equals(cN)) {
                    list.remove(i11);
                    break;
                }
                i11++;
            }
            this.f11709m[i10].m(o10.n(i10));
        }
    }

    public P(boolean z10, D... dArr) {
        this(z10, false, dArr);
    }

    public P(boolean z10, boolean z11, D... dArr) {
        this(z10, z11, new C1921k(), dArr);
    }

    public P(boolean z10, boolean z11, InterfaceC1920j interfaceC1920j, D... dArr) {
        this.f11707k = z10;
        this.f11708l = z11;
        this.f11709m = dArr;
        this.f11713q = interfaceC1920j;
        this.f11712p = new ArrayList(Arrays.asList(dArr));
        this.f11716t = -1;
        this.f11710n = new ArrayList(dArr.length);
        for (int i10 = 0; i10 < dArr.length; i10++) {
            this.f11710n.add(new ArrayList());
        }
        this.f11711o = new q2.Y[dArr.length];
        this.f11717u = new long[0][];
        this.f11714r = new HashMap();
        this.f11715s = P9.E.a().a().e();
    }
}
