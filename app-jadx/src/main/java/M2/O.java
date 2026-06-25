package M2;

import M2.C;
import androidx.media3.exoplayer.C2905q0;
import com.revenuecat.purchases.common.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import q2.C6109x;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class O implements C, C.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C[] f11695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean[] f11696b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1920j f11698d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C.a f11701g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private n0 f11702h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d0 f11704j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayList f11699e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap f11700f = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IdentityHashMap f11697c = new IdentityHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C[] f11703i = new C[0];

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a extends P2.C {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q2.a0 f11705b;

        public a(P2.A a10, q2.a0 a0Var) {
            super(a10);
            this.f11705b = a0Var;
        }

        @Override // P2.E
        public C6109x d(int i10) {
            return this.f11705b.c(t().f(i10));
        }

        @Override // P2.E
        public int e(C6109x c6109x) {
            return t().l(this.f11705b.d(c6109x));
        }

        @Override // P2.C
        public boolean equals(Object obj) {
            if (super.equals(obj) && (obj instanceof a)) {
                return this.f11705b.equals(((a) obj).f11705b);
            }
            return false;
        }

        @Override // P2.C
        public int hashCode() {
            return (super.hashCode() * 31) + this.f11705b.hashCode();
        }

        @Override // P2.E
        public q2.a0 m() {
            return this.f11705b;
        }

        @Override // P2.A
        public C6109x q() {
            return this.f11705b.c(t().p());
        }
    }

    public O(InterfaceC1920j interfaceC1920j, long[] jArr, C... cArr) {
        this.f11698d = interfaceC1920j;
        this.f11695a = cArr;
        this.f11704j = interfaceC1920j.empty();
        this.f11696b = new boolean[cArr.length];
        for (int i10 = 0; i10 < cArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f11696b[i10] = true;
                this.f11695a[i10] = new j0(cArr[i10], j10);
            }
        }
    }

    @Override // M2.C, M2.d0
    public boolean a(C2905q0 c2905q0) {
        if (this.f11699e.isEmpty()) {
            return this.f11704j.a(c2905q0);
        }
        int size = this.f11699e.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C) this.f11699e.get(i10)).a(c2905q0);
        }
        return false;
    }

    @Override // M2.C.a
    public void b(C c10) {
        this.f11699e.remove(c10);
        if (!this.f11699e.isEmpty()) {
            return;
        }
        int i10 = 0;
        for (C c11 : this.f11695a) {
            i10 += c11.s().f12003a;
        }
        q2.a0[] a0VarArr = new q2.a0[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            C[] cArr = this.f11695a;
            if (i11 >= cArr.length) {
                this.f11702h = new n0(a0VarArr);
                ((C.a) AbstractC6614a.e(this.f11701g)).b(this);
                return;
            }
            n0 n0VarS = cArr[i11].s();
            int i13 = n0VarS.f12003a;
            int i14 = 0;
            while (i14 < i13) {
                q2.a0 a0VarB = n0VarS.b(i14);
                C6109x[] c6109xArr = new C6109x[a0VarB.f56702a];
                for (int i15 = 0; i15 < a0VarB.f56702a; i15++) {
                    C6109x c6109xC = a0VarB.c(i15);
                    C6109x.b bVarB = c6109xC.b();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i11);
                    sb2.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                    String str = c6109xC.f57008a;
                    if (str == null) {
                        str = "";
                    }
                    sb2.append(str);
                    c6109xArr[i15] = bVarB.j0(sb2.toString()).P();
                }
                q2.a0 a0Var = new q2.a0(i11 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + a0VarB.f56703b, c6109xArr);
                this.f11700f.put(a0Var, a0VarB);
                a0VarArr[i12] = a0Var;
                i14++;
                i12++;
            }
            i11++;
        }
    }

    @Override // M2.C, M2.d0
    public long c() {
        return this.f11704j.c();
    }

    @Override // M2.C
    public long d(long j10, A2.Q q10) {
        C[] cArr = this.f11703i;
        return (cArr.length > 0 ? cArr[0] : this.f11695a[0]).d(j10, q10);
    }

    @Override // M2.C, M2.d0
    public long f() {
        return this.f11704j.f();
    }

    @Override // M2.C, M2.d0
    public void g(long j10) {
        this.f11704j.g(j10);
    }

    @Override // M2.C
    public long i(long j10) {
        long jI = this.f11703i[0].i(j10);
        int i10 = 1;
        while (true) {
            C[] cArr = this.f11703i;
            if (i10 >= cArr.length) {
                return jI;
            }
            if (cArr[i10].i(jI) != jI) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // M2.C
    public long k() {
        long j10 = -9223372036854775807L;
        for (C c10 : this.f11703i) {
            long jK = c10.k();
            if (jK == -9223372036854775807L) {
                if (j10 != -9223372036854775807L && c10.i(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == -9223372036854775807L) {
                for (C c11 : this.f11703i) {
                    if (c11 == c10) {
                        break;
                    }
                    if (c11.i(jK) != jK) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j10 = jK;
            } else if (jK != j10) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j10;
    }

    @Override // M2.C
    public void l(C.a aVar, long j10) {
        this.f11701g = aVar;
        Collections.addAll(this.f11699e, this.f11695a);
        for (C c10 : this.f11695a) {
            c10.l(this, j10);
        }
    }

    public C n(int i10) {
        return this.f11696b[i10] ? ((j0) this.f11695a[i10]).h() : this.f11695a[i10];
    }

    @Override // M2.C
    public void o() {
        for (C c10 : this.f11695a) {
            c10.o();
        }
    }

    @Override // M2.d0.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void j(C c10) {
        ((C.a) AbstractC6614a.e(this.f11701g)).j(this);
    }

    @Override // M2.C, M2.d0
    public boolean q() {
        return this.f11704j.q();
    }

    @Override // M2.C
    public long r(P2.A[] aArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        int[] iArr = new int[aArr.length];
        int[] iArr2 = new int[aArr.length];
        int i10 = 0;
        for (int i11 = 0; i11 < aArr.length; i11++) {
            c0 c0Var = c0VarArr[i11];
            Integer num = c0Var == null ? null : (Integer) this.f11697c.get(c0Var);
            iArr[i11] = num == null ? -1 : num.intValue();
            P2.A a10 = aArr[i11];
            if (a10 != null) {
                String str = a10.m().f56703b;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR)));
            } else {
                iArr2[i11] = -1;
            }
        }
        this.f11697c.clear();
        int length = aArr.length;
        c0[] c0VarArr2 = new c0[length];
        c0[] c0VarArr3 = new c0[aArr.length];
        P2.A[] aArr2 = new P2.A[aArr.length];
        ArrayList arrayList = new ArrayList(this.f11695a.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < this.f11695a.length) {
            for (int i13 = i10; i13 < aArr.length; i13++) {
                c0VarArr3[i13] = iArr[i13] == i12 ? c0VarArr[i13] : null;
                if (iArr2[i13] == i12) {
                    P2.A a11 = (P2.A) AbstractC6614a.e(aArr[i13]);
                    aArr2[i13] = new a(a11, (q2.a0) AbstractC6614a.e((q2.a0) this.f11700f.get(a11.m())));
                } else {
                    aArr2[i13] = null;
                }
            }
            int i14 = i12;
            long jR = this.f11695a[i12].r(aArr2, zArr, c0VarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = jR;
            } else if (jR != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < aArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    c0 c0Var2 = (c0) AbstractC6614a.e(c0VarArr3[i15]);
                    c0VarArr2[i15] = c0VarArr3[i15];
                    this.f11697c.put(c0Var2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    AbstractC6614a.g(c0VarArr3[i15] == null);
                }
            }
            if (z10) {
                arrayList.add(this.f11695a[i14]);
            }
            i12 = i14 + 1;
            i10 = 0;
        }
        int i16 = i10;
        System.arraycopy(c0VarArr2, i16, c0VarArr, i16, length);
        this.f11703i = (C[]) arrayList.toArray(new C[i16]);
        this.f11704j = this.f11698d.a(arrayList, P9.A.k(arrayList, new O9.f() { // from class: M2.N
            @Override // O9.f
            public final Object apply(Object obj) {
                return ((C) obj).s().c();
            }
        }));
        return j11;
    }

    @Override // M2.C
    public n0 s() {
        return (n0) AbstractC6614a.e(this.f11702h);
    }

    @Override // M2.C
    public void u(long j10, boolean z10) {
        for (C c10 : this.f11703i) {
            c10.u(j10, z10);
        }
    }
}
