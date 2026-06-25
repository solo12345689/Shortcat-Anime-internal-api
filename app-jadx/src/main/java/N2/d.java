package N2;

import B2.K1;
import N2.f;
import U2.C2246g;
import U2.C2253n;
import U2.I;
import U2.InterfaceC2255p;
import U2.InterfaceC2256q;
import U2.J;
import U2.O;
import U2.r;
import android.util.SparseArray;
import c3.C3068a;
import java.util.List;
import java.util.Objects;
import m3.C5637e;
import q2.AbstractC6079K;
import q2.C6109x;
import q2.InterfaceC6098m;
import q3.C6112a;
import r3.r;
import t2.AbstractC6614a;
import t2.C6609I;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements r, f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f12584j = new b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final I f12585k = new I();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2255p f12586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6109x f12588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseArray f12589d = new SparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f12590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f.b f12591f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f12592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private J f12593h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C6109x[] f12594i;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements O {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f12595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f12596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final C6109x f12597c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final C2253n f12598d = new C2253n();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public C6109x f12599e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private O f12600f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f12601g;

        public a(int i10, int i11, C6109x c6109x) {
            this.f12595a = i10;
            this.f12596b = i11;
            this.f12597c = c6109x;
        }

        @Override // U2.O
        public void a(long j10, int i10, int i11, int i12, O.a aVar) {
            long j11 = this.f12601g;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                this.f12600f = this.f12598d;
            }
            ((O) a0.l(this.f12600f)).a(j10, i10, i11, i12, aVar);
        }

        @Override // U2.O
        public int b(InterfaceC6098m interfaceC6098m, int i10, boolean z10, int i11) {
            return ((O) a0.l(this.f12600f)).e(interfaceC6098m, i10, z10);
        }

        @Override // U2.O
        public void c(C6109x c6109x) {
            C6109x c6109x2 = this.f12597c;
            if (c6109x2 != null) {
                c6109x = c6109x.m(c6109x2);
            }
            this.f12599e = c6109x;
            ((O) a0.l(this.f12600f)).c(this.f12599e);
        }

        @Override // U2.O
        public void g(C6609I c6609i, int i10, int i11) {
            ((O) a0.l(this.f12600f)).f(c6609i, i10);
        }

        public void h(f.b bVar, long j10) {
            if (bVar == null) {
                this.f12600f = this.f12598d;
                return;
            }
            this.f12601g = j10;
            O oE = bVar.e(this.f12595a, this.f12596b);
            this.f12600f = oE;
            C6109x c6109x = this.f12599e;
            if (c6109x != null) {
                oE.c(c6109x);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private r.a f12602a = new r3.g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f12603b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f12604c;

        @Override // N2.f.a
        public C6109x d(C6109x c6109x) {
            String str;
            if (!this.f12603b || !this.f12602a.b(c6109x)) {
                return c6109x;
            }
            C6109x.b bVarY = c6109x.b().y0("application/x-media3-cues").Y(this.f12602a.c(c6109x));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c6109x.f57022o);
            if (c6109x.f57018k != null) {
                str = " " + c6109x.f57018k;
            } else {
                str = "";
            }
            sb2.append(str);
            return bVarY.U(sb2.toString()).C0(Long.MAX_VALUE).P();
        }

        @Override // N2.f.a
        public f e(int i10, C6109x c6109x, boolean z10, List list, O o10, K1 k12) {
            InterfaceC2255p hVar;
            String str = c6109x.f57021n;
            if (!AbstractC6079K.s(str)) {
                if (AbstractC6079K.r(str)) {
                    hVar = new C5637e(this.f12602a, this.f12603b ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    hVar = new C3068a(1);
                } else if (Objects.equals(str, "image/png")) {
                    hVar = new C6112a();
                } else {
                    int i11 = z10 ? 4 : 0;
                    if (!this.f12603b) {
                        i11 |= 32;
                    }
                    hVar = new o3.h(this.f12602a, i11 | o3.h.k(this.f12604c), null, null, list, o10);
                }
            } else {
                if (!this.f12603b) {
                    return null;
                }
                hVar = new r3.n(this.f12602a.a(c6109x), c6109x);
            }
            return new d(hVar, i10, c6109x);
        }

        @Override // N2.f.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public b c(boolean z10) {
            this.f12603b = z10;
            return this;
        }

        @Override // N2.f.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b b(int i10) {
            this.f12604c = i10;
            return this;
        }

        @Override // N2.f.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public b a(r.a aVar) {
            this.f12602a = (r.a) AbstractC6614a.e(aVar);
            return this;
        }
    }

    public d(InterfaceC2255p interfaceC2255p, int i10, C6109x c6109x) {
        this.f12586a = interfaceC2255p;
        this.f12587b = i10;
        this.f12588c = c6109x;
    }

    @Override // N2.f
    public void a() {
        this.f12586a.a();
    }

    @Override // N2.f
    public boolean b(InterfaceC2256q interfaceC2256q) {
        int iH = this.f12586a.h(interfaceC2256q, f12585k);
        AbstractC6614a.g(iH != 1);
        return iH == 0;
    }

    @Override // N2.f
    public void c(f.b bVar, long j10, long j11) {
        this.f12591f = bVar;
        this.f12592g = j11;
        if (!this.f12590e) {
            this.f12586a.c(this);
            if (j10 != -9223372036854775807L) {
                this.f12586a.b(0L, j10);
            }
            this.f12590e = true;
            return;
        }
        InterfaceC2255p interfaceC2255p = this.f12586a;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        interfaceC2255p.b(0L, j10);
        for (int i10 = 0; i10 < this.f12589d.size(); i10++) {
            ((a) this.f12589d.valueAt(i10)).h(bVar, j11);
        }
    }

    @Override // N2.f
    public C2246g d() {
        J j10 = this.f12593h;
        if (j10 instanceof C2246g) {
            return (C2246g) j10;
        }
        return null;
    }

    @Override // U2.r
    public O e(int i10, int i11) {
        a aVar = (a) this.f12589d.get(i10);
        if (aVar == null) {
            AbstractC6614a.g(this.f12594i == null);
            aVar = new a(i10, i11, i11 == this.f12587b ? this.f12588c : null);
            aVar.h(this.f12591f, this.f12592g);
            this.f12589d.put(i10, aVar);
        }
        return aVar;
    }

    @Override // N2.f
    public C6109x[] f() {
        return this.f12594i;
    }

    @Override // U2.r
    public void p() {
        C6109x[] c6109xArr = new C6109x[this.f12589d.size()];
        for (int i10 = 0; i10 < this.f12589d.size(); i10++) {
            c6109xArr[i10] = (C6109x) AbstractC6614a.i(((a) this.f12589d.valueAt(i10)).f12599e);
        }
        this.f12594i = c6109xArr;
    }

    @Override // U2.r
    public void t(J j10) {
        this.f12593h = j10;
    }
}
