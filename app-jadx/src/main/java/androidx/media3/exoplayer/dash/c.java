package androidx.media3.exoplayer.dash;

import A2.Q;
import B2.K1;
import E2.g;
import E2.j;
import F2.t;
import F2.u;
import M2.C;
import M2.C1928s;
import M2.InterfaceC1920j;
import M2.L;
import M2.c0;
import M2.d0;
import M2.n0;
import N2.h;
import P2.A;
import P9.AbstractC2011u;
import Q2.k;
import Q2.n;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.exoplayer.C2905q0;
import androidx.media3.exoplayer.dash.a;
import androidx.media3.exoplayer.dash.f;
import com.revenuecat.purchases.common.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q2.C6109x;
import t2.a0;
import w2.InterfaceC6932F;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class c implements C, d0.a, h.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final Pattern f30660A = Pattern.compile("CC([1-4])=(.+)");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final Pattern f30661B = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f30662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a.InterfaceC0521a f30663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC6932F f30664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u f30665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f30666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final D2.b f30667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f30668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final n f30669h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Q2.b f30670i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final n0 f30671j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a[] f30672k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final InterfaceC1920j f30673l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final f f30674m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final L.a f30676o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final t.a f30677p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final K1 f30678q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private C.a f30679r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private d0 f30682u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private E2.c f30683v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f30684w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private List f30685x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f30687z;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f30686y = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private h[] f30680s = I(0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private e[] f30681t = new e[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final IdentityHashMap f30675n = new IdentityHashMap();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f30688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f30689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f30690c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f30691d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f30692e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f30693f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f30694g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AbstractC2011u f30695h;

        private a(int i10, int i11, int[] iArr, int i12, int i13, int i14, int i15, AbstractC2011u abstractC2011u) {
            this.f30689b = i10;
            this.f30688a = iArr;
            this.f30690c = i11;
            this.f30692e = i12;
            this.f30693f = i13;
            this.f30694g = i14;
            this.f30691d = i15;
            this.f30695h = abstractC2011u;
        }

        public static a a(int[] iArr, int i10, AbstractC2011u abstractC2011u) {
            return new a(3, 1, iArr, i10, -1, -1, -1, abstractC2011u);
        }

        public static a b(int[] iArr, int i10) {
            return new a(5, 1, iArr, i10, -1, -1, -1, AbstractC2011u.A());
        }

        public static a c(int i10) {
            return new a(5, 2, new int[0], -1, -1, -1, i10, AbstractC2011u.A());
        }

        public static a d(int i10, int[] iArr, int i11, int i12, int i13) {
            return new a(i10, 0, iArr, i11, i12, i13, -1, AbstractC2011u.A());
        }
    }

    public c(int i10, E2.c cVar, D2.b bVar, int i11, a.InterfaceC0521a interfaceC0521a, InterfaceC6932F interfaceC6932F, Q2.e eVar, u uVar, t.a aVar, k kVar, L.a aVar2, long j10, n nVar, Q2.b bVar2, InterfaceC1920j interfaceC1920j, f.b bVar3, K1 k12) {
        this.f30662a = i10;
        this.f30683v = cVar;
        this.f30667f = bVar;
        this.f30684w = i11;
        this.f30663b = interfaceC0521a;
        this.f30664c = interfaceC6932F;
        this.f30665d = uVar;
        this.f30677p = aVar;
        this.f30666e = kVar;
        this.f30676o = aVar2;
        this.f30668g = j10;
        this.f30669h = nVar;
        this.f30670i = bVar2;
        this.f30673l = interfaceC1920j;
        this.f30678q = k12;
        this.f30674m = new f(cVar, bVar3, bVar2);
        this.f30682u = interfaceC1920j.empty();
        g gVarD = cVar.d(i11);
        List list = gVarD.f4247d;
        this.f30685x = list;
        Pair pairW = w(uVar, interfaceC0521a, gVarD.f4246c, list);
        this.f30671j = (n0) pairW.first;
        this.f30672k = (a[]) pairW.second;
    }

    private static E2.e A(List list) {
        return z(list, "http://dashif.org/guidelines/trickmode");
    }

    private static C6109x[] B(List list, int[] iArr) {
        for (int i10 : iArr) {
            E2.a aVar = (E2.a) list.get(i10);
            List list2 = ((E2.a) list.get(i10)).f4201d;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                E2.e eVar = (E2.e) list2.get(i11);
                if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f4236a)) {
                    return K(eVar, f30660A, new C6109x.b().y0("application/cea-608").j0(aVar.f4198a + ":cea608").P());
                }
                if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f4236a)) {
                    return K(eVar, f30661B, new C6109x.b().y0("application/cea-708").j0(aVar.f4198a + ":cea708").P());
                }
            }
        }
        return new C6109x[0];
    }

    private static int[][] C(List list) {
        E2.e eVarY;
        Integer num;
        int size = list.size();
        HashMap mapE = P9.C.e(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            mapE.put(Long.valueOf(((E2.a) list.get(i10)).f4198a), Integer.valueOf(i10));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i10));
            arrayList.add(arrayList2);
            sparseArray.put(i10, arrayList2);
        }
        for (int i11 = 0; i11 < size; i11++) {
            E2.a aVar = (E2.a) list.get(i11);
            E2.e eVarA = A(aVar.f4202e);
            if (eVarA == null) {
                eVarA = A(aVar.f4203f);
            }
            int iIntValue = (eVarA == null || (num = (Integer) mapE.get(Long.valueOf(Long.parseLong(eVarA.f4237b)))) == null || !x(aVar, (E2.a) list.get(num.intValue()))) ? i11 : num.intValue();
            if (iIntValue == i11 && (eVarY = y(aVar.f4203f)) != null) {
                for (String str : a0.v1(eVarY.f4237b, com.amazon.a.a.o.b.f.f34694a)) {
                    Integer num2 = (Integer) mapE.get(Long.valueOf(Long.parseLong(str)));
                    if (num2 != null && x(aVar, (E2.a) list.get(num2.intValue()))) {
                        iIntValue = Math.min(iIntValue, num2.intValue());
                    }
                }
            }
            if (iIntValue != i11) {
                List list2 = (List) sparseArray.get(i11);
                List list3 = (List) sparseArray.get(iIntValue);
                list3.addAll(list2);
                sparseArray.put(i11, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i12 = 0; i12 < size2; i12++) {
            int[] iArrO = S9.f.o((Collection) arrayList.get(i12));
            iArr[i12] = iArrO;
            Arrays.sort(iArrO);
        }
        return iArr;
    }

    private int D(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 == -1) {
            return -1;
        }
        int i12 = this.f30672k[i11].f30692e;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 == i12 && this.f30672k[i14].f30690c == 0) {
                return i13;
            }
        }
        return -1;
    }

    private int[] E(A[] aArr) {
        int[] iArr = new int[aArr.length];
        for (int i10 = 0; i10 < aArr.length; i10++) {
            A a10 = aArr[i10];
            if (a10 != null) {
                iArr[i10] = this.f30671j.d(a10.m());
            } else {
                iArr[i10] = -1;
            }
        }
        return iArr;
    }

    private static boolean F(List list, int[] iArr) {
        for (int i10 : iArr) {
            List list2 = ((E2.a) list.get(i10)).f4200c;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (!((j) list2.get(i11)).f4262e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int G(int i10, List list, int[][] iArr, boolean[] zArr, C6109x[][] c6109xArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (F(list, iArr[i12])) {
                zArr[i12] = true;
                i11++;
            }
            C6109x[] c6109xArrB = B(list, iArr[i12]);
            c6109xArr[i12] = c6109xArrB;
            if (c6109xArrB.length != 0) {
                i11++;
            }
        }
        return i11;
    }

    private static void H(a.InterfaceC0521a interfaceC0521a, C6109x[] c6109xArr) {
        for (int i10 = 0; i10 < c6109xArr.length; i10++) {
            c6109xArr[i10] = interfaceC0521a.d(c6109xArr[i10]);
        }
    }

    private static h[] I(int i10) {
        return new h[i10];
    }

    private static C6109x[] K(E2.e eVar, Pattern pattern, C6109x c6109x) {
        String str = eVar.f4237b;
        if (str == null) {
            return new C6109x[]{c6109x};
        }
        String[] strArrV1 = a0.v1(str, ";");
        C6109x[] c6109xArr = new C6109x[strArrV1.length];
        for (int i10 = 0; i10 < strArrV1.length; i10++) {
            Matcher matcher = pattern.matcher(strArrV1[i10]);
            if (!matcher.matches()) {
                return new C6109x[]{c6109x};
            }
            int i11 = Integer.parseInt(matcher.group(1));
            c6109xArr[i10] = c6109x.b().j0(c6109x.f57008a + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + i11).Q(i11).n0(matcher.group(2)).P();
        }
        return c6109xArr;
    }

    private void M(A[] aArr, boolean[] zArr, c0[] c0VarArr) {
        for (int i10 = 0; i10 < aArr.length; i10++) {
            if (aArr[i10] == null || !zArr[i10]) {
                c0 c0Var = c0VarArr[i10];
                if (c0Var instanceof h) {
                    ((h) c0Var).S(this);
                } else if (c0Var instanceof h.a) {
                    ((h.a) c0Var).c();
                }
                c0VarArr[i10] = null;
            }
        }
    }

    private void N(A[] aArr, c0[] c0VarArr, int[] iArr) {
        boolean z10;
        for (int i10 = 0; i10 < aArr.length; i10++) {
            c0 c0Var = c0VarArr[i10];
            if ((c0Var instanceof C1928s) || (c0Var instanceof h.a)) {
                int iD = D(i10, iArr);
                if (iD == -1) {
                    z10 = c0VarArr[i10] instanceof C1928s;
                } else {
                    c0 c0Var2 = c0VarArr[i10];
                    z10 = (c0Var2 instanceof h.a) && ((h.a) c0Var2).f12641a == c0VarArr[iD];
                }
                if (!z10) {
                    c0 c0Var3 = c0VarArr[i10];
                    if (c0Var3 instanceof h.a) {
                        ((h.a) c0Var3).c();
                    }
                    c0VarArr[i10] = null;
                }
            }
        }
    }

    private void O(A[] aArr, c0[] c0VarArr, boolean[] zArr, long j10, int[] iArr) {
        for (int i10 = 0; i10 < aArr.length; i10++) {
            A a10 = aArr[i10];
            if (a10 != null) {
                c0 c0Var = c0VarArr[i10];
                if (c0Var == null) {
                    zArr[i10] = true;
                    a aVar = this.f30672k[iArr[i10]];
                    int i11 = aVar.f30690c;
                    if (i11 == 0) {
                        c0VarArr[i10] = v(aVar, a10, j10);
                    } else if (i11 == 2) {
                        c0VarArr[i10] = new e((E2.f) this.f30685x.get(aVar.f30691d), a10.m().c(0), this.f30683v.f4211d);
                    }
                } else if (c0Var instanceof h) {
                    ((androidx.media3.exoplayer.dash.a) ((h) c0Var).G()).h(a10);
                }
            }
        }
        for (int i12 = 0; i12 < aArr.length; i12++) {
            if (c0VarArr[i12] == null && aArr[i12] != null) {
                a aVar2 = this.f30672k[iArr[i12]];
                if (aVar2.f30690c == 1) {
                    int iD = D(i12, iArr);
                    if (iD == -1) {
                        c0VarArr[i12] = new C1928s();
                    } else {
                        c0VarArr[i12] = ((h) c0VarArr[iD]).V(j10, aVar2.f30689b);
                    }
                }
            }
        }
    }

    private static void p(List list, q2.a0[] a0VarArr, a[] aVarArr, int i10) {
        int i11 = 0;
        while (i11 < list.size()) {
            E2.f fVar = (E2.f) list.get(i11);
            a0VarArr[i10] = new q2.a0(fVar.a() + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + i11, new C6109x.b().j0(fVar.a()).y0("application/x-emsg").P());
            aVarArr[i10] = a.c(i11);
            i11++;
            i10++;
        }
    }

    private static int t(u uVar, a.InterfaceC0521a interfaceC0521a, List list, int[][] iArr, int i10, boolean[] zArr, C6109x[][] c6109xArr, q2.a0[] a0VarArr, a[] aVarArr) {
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            int[] iArr2 = iArr[i13];
            ArrayList arrayList = new ArrayList();
            for (int i15 : iArr2) {
                arrayList.addAll(((E2.a) list.get(i15)).f4200c);
            }
            int size = arrayList.size();
            C6109x[] c6109xArr2 = new C6109x[size];
            for (int i16 = 0; i16 < size; i16++) {
                C6109x c6109x = ((j) arrayList.get(i16)).f4259b;
                c6109xArr2[i16] = c6109x.b().X(uVar.b(c6109x)).P();
            }
            E2.a aVar = (E2.a) list.get(iArr2[0]);
            long j10 = aVar.f4198a;
            String string = j10 != -1 ? Long.toString(j10) : "unset:" + i13;
            int i17 = i14 + 1;
            if (zArr[i13]) {
                i11 = i14 + 2;
            } else {
                i11 = i17;
                i17 = -1;
            }
            if (c6109xArr[i13].length != 0) {
                i12 = i11 + 1;
            } else {
                i12 = i11;
                i11 = -1;
            }
            H(interfaceC0521a, c6109xArr2);
            a0VarArr[i14] = new q2.a0(string, c6109xArr2);
            aVarArr[i14] = a.d(aVar.f4199b, iArr2, i14, i17, i11);
            if (i17 != -1) {
                String str = string + ":emsg";
                a0VarArr[i17] = new q2.a0(str, new C6109x.b().j0(str).y0("application/x-emsg").P());
                aVarArr[i17] = a.b(iArr2, i14);
            }
            if (i11 != -1) {
                aVarArr[i11] = a.a(iArr2, i14, AbstractC2011u.x(c6109xArr[i13]));
                H(interfaceC0521a, c6109xArr[i13]);
                a0VarArr[i11] = new q2.a0(string + ":cc", c6109xArr[i13]);
            }
            i13++;
            i14 = i12;
        }
        return i14;
    }

    private h v(a aVar, A a10, long j10) {
        int i10;
        q2.a0 a0VarB;
        int i11;
        int i12 = aVar.f30693f;
        boolean z10 = i12 != -1;
        f.c cVarK = null;
        if (z10) {
            a0VarB = this.f30671j.b(i12);
            i10 = 1;
        } else {
            i10 = 0;
            a0VarB = null;
        }
        int i13 = aVar.f30694g;
        AbstractC2011u abstractC2011uA = i13 != -1 ? this.f30672k[i13].f30695h : AbstractC2011u.A();
        int size = i10 + abstractC2011uA.size();
        C6109x[] c6109xArr = new C6109x[size];
        int[] iArr = new int[size];
        if (z10) {
            c6109xArr[0] = a0VarB.c(0);
            iArr[0] = 5;
            i11 = 1;
        } else {
            i11 = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < abstractC2011uA.size(); i14++) {
            C6109x c6109x = (C6109x) abstractC2011uA.get(i14);
            c6109xArr[i11] = c6109x;
            iArr[i11] = 3;
            arrayList.add(c6109x);
            i11++;
        }
        if (this.f30683v.f4211d && z10) {
            cVarK = this.f30674m.k();
        }
        f.c cVar = cVarK;
        h hVar = new h(aVar.f30689b, iArr, c6109xArr, this.f30663b.e(this.f30669h, this.f30683v, this.f30667f, this.f30684w, aVar.f30688a, a10, aVar.f30689b, this.f30668g, z10, arrayList, cVar, this.f30664c, this.f30678q, null), this, this.f30670i, j10, this.f30665d, this.f30677p, this.f30666e, this.f30676o, this.f30686y, null);
        synchronized (this) {
            this.f30675n.put(hVar, cVar);
        }
        return hVar;
    }

    private static Pair w(u uVar, a.InterfaceC0521a interfaceC0521a, List list, List list2) {
        int[][] iArrC = C(list);
        int length = iArrC.length;
        boolean[] zArr = new boolean[length];
        C6109x[][] c6109xArr = new C6109x[length][];
        int iG = G(length, list, iArrC, zArr, c6109xArr) + length + list2.size();
        q2.a0[] a0VarArr = new q2.a0[iG];
        a[] aVarArr = new a[iG];
        p(list2, a0VarArr, aVarArr, t(uVar, interfaceC0521a, list, iArrC, length, zArr, c6109xArr, a0VarArr, aVarArr));
        return Pair.create(new n0(a0VarArr), aVarArr);
    }

    private static boolean x(E2.a aVar, E2.a aVar2) {
        if (aVar.f4199b != aVar2.f4199b) {
            return false;
        }
        if (aVar.f4200c.isEmpty() || aVar2.f4200c.isEmpty()) {
            return true;
        }
        C6109x c6109x = ((j) aVar.f4200c.get(0)).f4259b;
        C6109x c6109x2 = ((j) aVar2.f4200c.get(0)).f4259b;
        return Objects.equals(c6109x.f57011d, c6109x2.f57011d) && (c6109x.f57013f & (-16385)) == (c6109x2.f57013f & (-16385));
    }

    private static E2.e y(List list) {
        return z(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    private static E2.e z(List list, String str) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            E2.e eVar = (E2.e) list.get(i10);
            if (str.equals(eVar.f4236a)) {
                return eVar;
            }
        }
        return null;
    }

    @Override // M2.d0.a
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void j(h hVar) {
        this.f30679r.j(this);
    }

    public void L() {
        this.f30674m.o();
        for (h hVar : this.f30680s) {
            hVar.S(this);
        }
        this.f30679r = null;
    }

    public void P(E2.c cVar, int i10) {
        this.f30683v = cVar;
        this.f30684w = i10;
        this.f30674m.q(cVar);
        h[] hVarArr = this.f30680s;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                ((androidx.media3.exoplayer.dash.a) hVar.G()).g(cVar, i10);
            }
            this.f30679r.j(this);
        }
        this.f30685x = cVar.d(i10).f4247d;
        for (e eVar : this.f30681t) {
            Iterator it = this.f30685x.iterator();
            while (true) {
                if (it.hasNext()) {
                    E2.f fVar = (E2.f) it.next();
                    if (fVar.a().equals(eVar.a())) {
                        eVar.d(fVar, cVar.f4211d && i10 == cVar.e() - 1);
                    }
                }
            }
        }
    }

    @Override // M2.C, M2.d0
    public boolean a(C2905q0 c2905q0) {
        return this.f30682u.a(c2905q0);
    }

    @Override // M2.C, M2.d0
    public long c() {
        return this.f30682u.c();
    }

    @Override // M2.C
    public long d(long j10, Q q10) {
        for (h hVar : this.f30680s) {
            if (hVar.f12616a == 2) {
                return hVar.d(j10, q10);
            }
        }
        return j10;
    }

    @Override // M2.C, M2.d0
    public long f() {
        return this.f30682u.f();
    }

    @Override // M2.C, M2.d0
    public void g(long j10) {
        for (h hVar : this.f30680s) {
            if (!hVar.q()) {
                hVar.F(this.f30683v.g(this.f30684w));
            }
        }
        this.f30682u.g(j10);
    }

    @Override // N2.h.b
    public synchronized void h(h hVar) {
        f.c cVar = (f.c) this.f30675n.remove(hVar);
        if (cVar != null) {
            cVar.o();
        }
    }

    @Override // M2.C
    public long i(long j10) throws Throwable {
        for (h hVar : this.f30680s) {
            hVar.U(j10);
        }
        for (e eVar : this.f30681t) {
            eVar.c(j10);
        }
        return j10;
    }

    @Override // M2.C
    public long k() {
        for (h hVar : this.f30680s) {
            if (hVar.B()) {
                return this.f30687z;
            }
        }
        return -9223372036854775807L;
    }

    @Override // M2.C
    public void l(C.a aVar, long j10) {
        this.f30679r = aVar;
        aVar.b(this);
    }

    @Override // M2.C
    public void o() {
        this.f30669h.b();
    }

    @Override // M2.C, M2.d0
    public boolean q() {
        return this.f30682u.q();
    }

    @Override // M2.C
    public long r(A[] aArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        int[] iArrE = E(aArr);
        M(aArr, zArr, c0VarArr);
        N(aArr, c0VarArr, iArrE);
        O(aArr, c0VarArr, zArr2, j10, iArrE);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (c0 c0Var : c0VarArr) {
            if (c0Var instanceof h) {
                arrayList.add((h) c0Var);
            } else if (c0Var instanceof e) {
                arrayList2.add((e) c0Var);
            }
        }
        h[] hVarArrI = I(arrayList.size());
        this.f30680s = hVarArrI;
        arrayList.toArray(hVarArrI);
        e[] eVarArr = new e[arrayList2.size()];
        this.f30681t = eVarArr;
        arrayList2.toArray(eVarArr);
        this.f30682u = this.f30673l.a(arrayList, P9.A.k(arrayList, new O9.f() { // from class: androidx.media3.exoplayer.dash.b
            @Override // O9.f
            public final Object apply(Object obj) {
                return AbstractC2011u.B(Integer.valueOf(((h) obj).f12616a));
            }
        }));
        if (this.f30686y) {
            this.f30686y = false;
            this.f30687z = j10;
        }
        return j10;
    }

    @Override // M2.C
    public n0 s() {
        return this.f30671j;
    }

    @Override // M2.C
    public void u(long j10, boolean z10) {
        for (h hVar : this.f30680s) {
            hVar.u(j10, z10);
        }
    }
}
