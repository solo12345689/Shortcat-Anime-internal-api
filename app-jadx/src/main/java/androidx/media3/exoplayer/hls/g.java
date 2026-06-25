package androidx.media3.exoplayer.hls;

import A2.Q;
import B2.K1;
import F2.t;
import F2.u;
import H2.i;
import H2.m;
import M2.C;
import M2.InterfaceC1920j;
import M2.L;
import M2.d0;
import M2.n0;
import P9.AbstractC2011u;
import Q2.k;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.exoplayer.C2905q0;
import androidx.media3.exoplayer.hls.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import q2.AbstractC6079K;
import q2.C6078J;
import q2.C6080L;
import q2.C6102q;
import q2.C6109x;
import q2.a0;
import t2.AbstractC6614a;
import w2.InterfaceC6932F;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class g implements C, m.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G2.e f30899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f30900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G2.d f30901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC6932F f30902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u f30903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t.a f30904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Q2.k f30905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final L.a f30906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Q2.b f30907i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final InterfaceC1920j f30910l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f30911m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f30912n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f30913o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final K1 f30914p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final long f30916r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private C.a f30917s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f30918t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private n0 f30919u;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f30923y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private d0 f30924z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final l.b f30915q = new b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final IdentityHashMap f30908j = new IdentityHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final G2.j f30909k = new G2.j();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private l[] f30920v = new l[0];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private l[] f30921w = new l[0];

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int[][] f30922x = new int[0][];

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class b implements l.b {
        private b() {
        }

        @Override // M2.d0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void j(l lVar) {
            g.this.f30917s.j(g.this);
        }

        @Override // androidx.media3.exoplayer.hls.l.b
        public void e() {
            if (g.j(g.this) > 0) {
                return;
            }
            int i10 = 0;
            for (l lVar : g.this.f30920v) {
                i10 += lVar.s().f12003a;
            }
            a0[] a0VarArr = new a0[i10];
            int i11 = 0;
            for (l lVar2 : g.this.f30920v) {
                int i12 = lVar2.s().f12003a;
                int i13 = 0;
                while (i13 < i12) {
                    a0VarArr[i11] = lVar2.s().b(i13);
                    i13++;
                    i11++;
                }
            }
            g.this.f30919u = new n0(a0VarArr);
            g.this.f30917s.b(g.this);
        }

        @Override // androidx.media3.exoplayer.hls.l.b
        public void m(Uri uri) {
            g.this.f30900b.f(uri);
        }
    }

    public g(G2.e eVar, m mVar, G2.d dVar, InterfaceC6932F interfaceC6932F, Q2.e eVar2, u uVar, t.a aVar, Q2.k kVar, L.a aVar2, Q2.b bVar, InterfaceC1920j interfaceC1920j, boolean z10, int i10, boolean z11, K1 k12, long j10) {
        this.f30899a = eVar;
        this.f30900b = mVar;
        this.f30901c = dVar;
        this.f30902d = interfaceC6932F;
        this.f30903e = uVar;
        this.f30904f = aVar;
        this.f30905g = kVar;
        this.f30906h = aVar2;
        this.f30907i = bVar;
        this.f30910l = interfaceC1920j;
        this.f30911m = z10;
        this.f30912n = i10;
        this.f30913o = z11;
        this.f30914p = k12;
        this.f30916r = j10;
        this.f30924z = interfaceC1920j.empty();
    }

    private static C6109x A(C6109x c6109x, C6109x c6109x2, boolean z10) {
        C6078J c6078j;
        int i10;
        String str;
        String str2;
        List list;
        int i11;
        int i12;
        String str3;
        AbstractC2011u abstractC2011uA = AbstractC2011u.A();
        if (c6109x2 != null) {
            str2 = c6109x2.f57018k;
            c6078j = c6109x2.f57019l;
            i11 = c6109x2.f56997G;
            i10 = c6109x2.f57012e;
            i12 = c6109x2.f57013f;
            str = c6109x2.f57011d;
            str3 = c6109x2.f57009b;
            list = c6109x2.f57010c;
        } else {
            String strU = t2.a0.U(c6109x.f57018k, 1);
            c6078j = c6109x.f57019l;
            if (z10) {
                i11 = c6109x.f56997G;
                i10 = c6109x.f57012e;
                i12 = c6109x.f57013f;
                str = c6109x.f57011d;
                str3 = c6109x.f57009b;
                str2 = strU;
                list = c6109x.f57010c;
            } else {
                i10 = 0;
                str = null;
                str2 = strU;
                list = abstractC2011uA;
                i11 = -1;
                i12 = 0;
                str3 = null;
            }
        }
        return new C6109x.b().j0(c6109x.f57008a).l0(str3).m0(list).W(c6109x.f57021n).y0(AbstractC6079K.g(str2)).U(str2).r0(c6078j).S(z10 ? c6109x.f57015h : -1).t0(z10 ? c6109x.f57016i : -1).T(i11).A0(i10).w0(i12).n0(str).P();
    }

    private static Map B(List list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap map = new HashMap();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            C6102q c6102qF = (C6102q) list.get(i10);
            String str = c6102qF.f56943c;
            i10++;
            int i11 = i10;
            while (i11 < arrayList.size()) {
                C6102q c6102q = (C6102q) arrayList.get(i11);
                if (TextUtils.equals(c6102q.f56943c, str)) {
                    c6102qF = c6102qF.f(c6102q);
                    arrayList.remove(i11);
                } else {
                    i11++;
                }
            }
            map.put(str, c6102qF);
        }
        return map;
    }

    private static C6109x C(C6109x c6109x) {
        String strU = t2.a0.U(c6109x.f57018k, 2);
        return new C6109x.b().j0(c6109x.f57008a).l0(c6109x.f57009b).m0(c6109x.f57010c).W(c6109x.f57021n).y0(AbstractC6079K.g(strU)).U(strU).r0(c6109x.f57019l).S(c6109x.f57015h).t0(c6109x.f57016i).F0(c6109x.f57029v).h0(c6109x.f57030w).f0(c6109x.f57033z).A0(c6109x.f57012e).w0(c6109x.f57013f).P();
    }

    static /* synthetic */ int j(g gVar) {
        int i10 = gVar.f30918t - 1;
        gVar.f30918t = i10;
        return i10;
    }

    private void v(long j10, List list, List list2, List list3, Map map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = ((i.a) list.get(i10)).f7816d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z10 = true;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (Objects.equals(str, ((i.a) list.get(i11)).f7816d)) {
                        i.a aVar = (i.a) list.get(i11);
                        arrayList3.add(Integer.valueOf(i11));
                        arrayList.add(aVar.f7813a);
                        arrayList2.add(aVar.f7814b);
                        z10 &= t2.a0.T(aVar.f7814b.f57018k, 1) == 1;
                    }
                }
                String str2 = "audio:" + str;
                l lVarZ = z(str2, 1, (Uri[]) arrayList.toArray((Uri[]) t2.a0.m(new Uri[0])), (C6109x[]) arrayList2.toArray(new C6109x[0]), null, Collections.EMPTY_LIST, map, j10);
                list3.add(S9.f.o(arrayList3));
                list2.add(lVarZ);
                if (this.f30911m && z10) {
                    lVarZ.h0(new a0[]{new a0(str2, (C6109x[]) arrayList2.toArray(new C6109x[0]))}, 0, new int[0]);
                }
            }
        }
    }

    private void w(H2.i iVar, long j10, List list, List list2, Map map) {
        int i10;
        boolean z10;
        boolean z11;
        int size = iVar.f7804e.size();
        int[] iArr = new int[size];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < iVar.f7804e.size(); i13++) {
            C6109x c6109x = ((i.b) iVar.f7804e.get(i13)).f7818b;
            if (c6109x.f57030w > 0 || t2.a0.U(c6109x.f57018k, 2) != null) {
                iArr[i13] = 2;
                i11++;
            } else if (t2.a0.U(c6109x.f57018k, 1) != null) {
                iArr[i13] = 1;
                i12++;
            } else {
                iArr[i13] = -1;
            }
        }
        if (i11 > 0) {
            i10 = i11;
            z11 = false;
            z10 = true;
        } else if (i12 < size) {
            i10 = size - i12;
            z10 = false;
            z11 = true;
        } else {
            i10 = size;
            z10 = false;
            z11 = false;
        }
        Uri[] uriArr = new Uri[i10];
        C6109x[] c6109xArr = new C6109x[i10];
        int[] iArr2 = new int[i10];
        int i14 = 0;
        for (int i15 = 0; i15 < iVar.f7804e.size(); i15++) {
            if ((!z10 || iArr[i15] == 2) && (!z11 || iArr[i15] != 1)) {
                i.b bVar = (i.b) iVar.f7804e.get(i15);
                uriArr[i14] = bVar.f7817a;
                c6109xArr[i14] = bVar.f7818b;
                iArr2[i14] = i15;
                i14++;
            }
        }
        String str = c6109xArr[0].f57018k;
        int iT = t2.a0.T(str, 2);
        int iT2 = t2.a0.T(str, 1);
        boolean z12 = (iT2 == 1 || (iT2 == 0 && iVar.f7806g.isEmpty())) && iT <= 1 && iT2 + iT > 0;
        l lVarZ = z("main", (z10 || iT2 <= 0) ? 0 : 1, uriArr, c6109xArr, iVar.f7809j, iVar.f7810k, map, j10);
        list.add(lVarZ);
        list2.add(iArr2);
        if (this.f30911m && z12) {
            ArrayList arrayList = new ArrayList();
            if (iT > 0) {
                C6109x[] c6109xArr2 = new C6109x[i10];
                for (int i16 = 0; i16 < i10; i16++) {
                    c6109xArr2[i16] = C(c6109xArr[i16]);
                }
                arrayList.add(new a0("main", c6109xArr2));
                if (iT2 > 0 && (iVar.f7809j != null || iVar.f7806g.isEmpty())) {
                    arrayList.add(new a0("main:audio", A(c6109xArr[0], iVar.f7809j, false)));
                }
                List list3 = iVar.f7810k;
                if (list3 != null) {
                    for (int i17 = 0; i17 < list3.size(); i17++) {
                        arrayList.add(new a0("main:cc:" + i17, this.f30899a.d((C6109x) list3.get(i17))));
                    }
                }
            } else {
                C6109x[] c6109xArr3 = new C6109x[i10];
                for (int i18 = 0; i18 < i10; i18++) {
                    c6109xArr3[i18] = A(c6109xArr[i18], iVar.f7809j, true);
                }
                arrayList.add(new a0("main", c6109xArr3));
            }
            a0 a0Var = new a0("main:id3", new C6109x.b().j0("ID3").y0("application/id3").P());
            arrayList.add(a0Var);
            lVarZ.h0((a0[]) arrayList.toArray(new a0[0]), 0, arrayList.indexOf(a0Var));
        }
    }

    private void x(long j10) {
        long j11;
        H2.i iVar = (H2.i) AbstractC6614a.e(this.f30900b.e());
        Map mapB = this.f30913o ? B(iVar.f7812m) : Collections.EMPTY_MAP;
        boolean zIsEmpty = iVar.f7804e.isEmpty();
        List list = iVar.f7806g;
        List list2 = iVar.f7807h;
        this.f30918t = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (zIsEmpty) {
            j11 = j10;
        } else {
            w(iVar, j10, arrayList, arrayList2, mapB);
            arrayList = arrayList;
            j11 = j10;
        }
        v(j11, list, arrayList, arrayList2, mapB);
        this.f30923y = arrayList.size();
        y(j11, list2, arrayList, arrayList2, mapB);
        this.f30920v = (l[]) arrayList.toArray(new l[0]);
        this.f30922x = (int[][]) arrayList2.toArray(new int[0][]);
        this.f30918t = this.f30920v.length;
        for (int i10 = 0; i10 < this.f30923y; i10++) {
            this.f30920v[i10].q0(true);
        }
        for (l lVar : this.f30920v) {
            lVar.D();
        }
        this.f30921w = this.f30920v;
    }

    private void y(long j10, List list, List list2, List list3, Map map) {
        List list4 = list;
        ArrayList arrayList = new ArrayList(list4.size());
        ArrayList arrayList2 = new ArrayList(list4.size());
        ArrayList arrayList3 = new ArrayList(list4.size());
        HashSet hashSet = new HashSet();
        int i10 = 0;
        int i11 = 0;
        while (i11 < list4.size()) {
            String str = ((i.a) list4.get(i11)).f7816d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                for (int i12 = i10; i12 < list4.size(); i12++) {
                    if (Objects.equals(str, ((i.a) list4.get(i12)).f7816d)) {
                        i.a aVar = (i.a) list4.get(i12);
                        arrayList3.add(Integer.valueOf(i12));
                        arrayList.add(aVar.f7813a);
                        arrayList2.add(aVar.f7814b);
                    }
                }
                String str2 = "subtitle:" + str;
                C6109x[] c6109xArr = (C6109x[]) arrayList2.toArray(new C6109x[i10]);
                l lVarZ = z(str2, 3, (Uri[]) arrayList.toArray((Uri[]) t2.a0.m(new Uri[i10])), c6109xArr, null, AbstractC2011u.A(), map, j10);
                list3.add(S9.f.o(arrayList3));
                list2.add(lVarZ);
                int length = c6109xArr.length;
                C6109x[] c6109xArr2 = new C6109x[length];
                for (int i13 = i10; i13 < length; i13++) {
                    c6109xArr2[i13] = this.f30899a.d(c6109xArr[i13]);
                }
                i10 = 0;
                lVarZ.h0(new a0[]{new a0(str2, c6109xArr2)}, 0, new int[0]);
            }
            i11++;
            list4 = list;
        }
    }

    private l z(String str, int i10, Uri[] uriArr, C6109x[] c6109xArr, C6109x c6109x, List list, Map map, long j10) {
        return new l(str, i10, this.f30915q, new c(this.f30899a, this.f30900b, uriArr, c6109xArr, this.f30901c, this.f30902d, this.f30909k, this.f30916r, list, this.f30914p, null), map, this.f30907i, j10, c6109x, this.f30903e, this.f30904f, this.f30905g, this.f30906h, this.f30912n);
    }

    public void D() {
        this.f30900b.p(this);
        for (l lVar : this.f30920v) {
            lVar.j0();
        }
        this.f30917s = null;
    }

    @Override // M2.C, M2.d0
    public boolean a(C2905q0 c2905q0) {
        if (this.f30919u != null) {
            return this.f30924z.a(c2905q0);
        }
        for (l lVar : this.f30920v) {
            lVar.D();
        }
        return false;
    }

    @Override // H2.m.b
    public boolean b(Uri uri, k.c cVar, boolean z10) {
        boolean zE0 = true;
        for (l lVar : this.f30920v) {
            zE0 &= lVar.e0(uri, cVar, z10);
        }
        this.f30917s.j(this);
        return zE0;
    }

    @Override // M2.C, M2.d0
    public long c() {
        return this.f30924z.c();
    }

    @Override // M2.C
    public long d(long j10, Q q10) {
        for (l lVar : this.f30921w) {
            if (lVar.T()) {
                return lVar.d(j10, q10);
            }
        }
        return j10;
    }

    @Override // H2.m.b
    public void e() {
        for (l lVar : this.f30920v) {
            lVar.f0();
        }
        this.f30917s.j(this);
    }

    @Override // M2.C, M2.d0
    public long f() {
        return this.f30924z.f();
    }

    @Override // M2.C, M2.d0
    public void g(long j10) {
        this.f30924z.g(j10);
    }

    @Override // M2.C
    public long i(long j10) {
        l[] lVarArr = this.f30921w;
        if (lVarArr.length > 0) {
            boolean zM0 = lVarArr[0].m0(j10, false);
            int i10 = 1;
            while (true) {
                l[] lVarArr2 = this.f30921w;
                if (i10 >= lVarArr2.length) {
                    break;
                }
                lVarArr2[i10].m0(j10, zM0);
                i10++;
            }
            if (zM0) {
                this.f30909k.b();
            }
        }
        return j10;
    }

    @Override // M2.C
    public long k() {
        return -9223372036854775807L;
    }

    @Override // M2.C
    public void l(C.a aVar, long j10) {
        this.f30917s = aVar;
        this.f30900b.o(this);
        x(j10);
    }

    @Override // M2.C
    public void o() throws C6080L {
        for (l lVar : this.f30920v) {
            lVar.o();
        }
    }

    @Override // M2.C, M2.d0
    public boolean q() {
        return this.f30924z.q();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00d8  */
    @Override // M2.C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long r(P2.A[] r21, boolean[] r22, M2.c0[] r23, boolean[] r24, long r25) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.g.r(P2.A[], boolean[], M2.c0[], boolean[], long):long");
    }

    @Override // M2.C
    public n0 s() {
        return (n0) AbstractC6614a.e(this.f30919u);
    }

    @Override // M2.C
    public void u(long j10, boolean z10) {
        for (l lVar : this.f30921w) {
            lVar.u(j10, z10);
        }
    }
}
