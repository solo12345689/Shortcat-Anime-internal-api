package M2;

import F2.InterfaceC1558m;
import F2.t;
import F2.u;
import M2.b0;
import U2.O;
import java.util.Objects;
import q2.AbstractC6079K;
import q2.C6102q;
import q2.C6109x;
import q2.InterfaceC6098m;
import t2.AbstractC6614a;
import t2.C6609I;
import t2.InterfaceC6627n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class b0 implements U2.O {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private C6109x f11839A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private C6109x f11840B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f11841C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f11843E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private long f11844F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f11845G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z f11846a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F2.u f11849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t.a f11850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f11851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C6109x f11852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC1558m f11853h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f11861p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f11862q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f11863r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f11864s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f11868w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f11871z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f11847b = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f11854i = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long[] f11855j = new long[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long[] f11856k = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long[] f11859n = new long[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int[] f11858m = new int[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f11857l = new int[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private O.a[] f11860o = new O.a[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i0 f11848c = new i0(new InterfaceC6627n() { // from class: M2.a0
        @Override // t2.InterfaceC6627n
        public final void accept(Object obj) {
            ((b0.c) obj).f11876b.a();
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f11865t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f11866u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f11867v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f11870y = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f11869x = true;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f11842D = true;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f11872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f11873b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public O.a f11874c;

        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C6109x f11875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u.b f11876b;

        private c(C6109x c6109x, u.b bVar) {
            this.f11875a = c6109x;
            this.f11876b = bVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface d {
        void b(C6109x c6109x);
    }

    protected b0(Q2.b bVar, F2.u uVar, t.a aVar) {
        this.f11849d = uVar;
        this.f11850e = aVar;
        this.f11846a = new Z(bVar);
    }

    private long E(int i10) {
        long jMax = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int iG = G(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.f11859n[iG]);
            if ((this.f11858m[iG] & 1) != 0) {
                return jMax;
            }
            iG--;
            if (iG == -1) {
                iG = this.f11854i - 1;
            }
        }
        return jMax;
    }

    private int G(int i10) {
        int i11 = this.f11863r + i10;
        int i12 = this.f11854i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    private boolean K() {
        return this.f11864s != this.f11861p;
    }

    private boolean O(int i10) {
        InterfaceC1558m interfaceC1558m = this.f11853h;
        if (interfaceC1558m == null || interfaceC1558m.getState() == 4) {
            return true;
        }
        return (this.f11858m[i10] & 1073741824) == 0 && this.f11853h.b();
    }

    private void Q(C6109x c6109x, A2.J j10) {
        C6109x c6109x2 = this.f11852g;
        boolean z10 = c6109x2 == null;
        C6102q c6102q = c6109x2 == null ? null : c6109x2.f57026s;
        this.f11852g = c6109x;
        C6102q c6102q2 = c6109x.f57026s;
        F2.u uVar = this.f11849d;
        j10.f142b = uVar != null ? c6109x.c(uVar.b(c6109x)) : c6109x;
        j10.f141a = this.f11853h;
        if (this.f11849d == null) {
            return;
        }
        if (z10 || !Objects.equals(c6102q, c6102q2)) {
            InterfaceC1558m interfaceC1558m = this.f11853h;
            InterfaceC1558m interfaceC1558mD = this.f11849d.d(this.f11850e, c6109x);
            this.f11853h = interfaceC1558mD;
            j10.f141a = interfaceC1558mD;
            if (interfaceC1558m != null) {
                interfaceC1558m.h(this.f11850e);
            }
        }
    }

    private synchronized int R(A2.J j10, z2.f fVar, boolean z10, boolean z11, b bVar) {
        try {
            fVar.f65556e = false;
            if (!K()) {
                if (!z11 && !this.f11868w) {
                    C6109x c6109x = this.f11840B;
                    if (c6109x == null || (!z10 && c6109x == this.f11852g)) {
                        return -3;
                    }
                    Q((C6109x) AbstractC6614a.e(c6109x), j10);
                    return -5;
                }
                fVar.v(4);
                fVar.f65557f = Long.MIN_VALUE;
                return -4;
            }
            C6109x c6109x2 = ((c) this.f11848c.e(F())).f11875a;
            if (!z10 && c6109x2 == this.f11852g) {
                int iG = G(this.f11864s);
                if (!O(iG)) {
                    fVar.f65556e = true;
                    return -3;
                }
                fVar.v(this.f11858m[iG]);
                if (this.f11864s == this.f11861p - 1 && (z11 || this.f11868w)) {
                    fVar.k(536870912);
                }
                fVar.f65557f = this.f11859n[iG];
                bVar.f11872a = this.f11857l[iG];
                bVar.f11873b = this.f11856k[iG];
                bVar.f11874c = this.f11860o[iG];
                return -4;
            }
            Q(c6109x2, j10);
            return -5;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void W() {
        InterfaceC1558m interfaceC1558m = this.f11853h;
        if (interfaceC1558m != null) {
            interfaceC1558m.h(this.f11850e);
            this.f11853h = null;
            this.f11852g = null;
        }
    }

    private synchronized void Z() {
        this.f11864s = 0;
        this.f11846a.o();
    }

    private synchronized boolean e0(C6109x c6109x) {
        try {
            this.f11870y = false;
            if (Objects.equals(c6109x, this.f11840B)) {
                return false;
            }
            if (this.f11848c.g() || !((c) this.f11848c.f()).f11875a.equals(c6109x)) {
                this.f11840B = c6109x;
            } else {
                this.f11840B = ((c) this.f11848c.f()).f11875a;
            }
            boolean z10 = this.f11842D;
            C6109x c6109x2 = this.f11840B;
            this.f11842D = z10 & AbstractC6079K.a(c6109x2.f57022o, c6109x2.f57018k);
            this.f11843E = false;
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized boolean i(long j10) {
        if (this.f11861p == 0) {
            return j10 > this.f11866u;
        }
        if (D() >= j10) {
            return false;
        }
        v(this.f11862q + k(j10));
        return true;
    }

    private synchronized void j(long j10, int i10, long j11, int i11, O.a aVar) {
        try {
            int i12 = this.f11861p;
            if (i12 > 0) {
                int iG = G(i12 - 1);
                AbstractC6614a.a(this.f11856k[iG] + ((long) this.f11857l[iG]) <= j11);
            }
            this.f11868w = (536870912 & i10) != 0;
            this.f11867v = Math.max(this.f11867v, j10);
            int iG2 = G(this.f11861p);
            this.f11859n[iG2] = j10;
            this.f11856k[iG2] = j11;
            this.f11857l[iG2] = i11;
            this.f11858m[iG2] = i10;
            this.f11860o[iG2] = aVar;
            this.f11855j[iG2] = this.f11841C;
            if (this.f11848c.g() || !((c) this.f11848c.f()).f11875a.equals(this.f11840B)) {
                C6109x c6109x = (C6109x) AbstractC6614a.e(this.f11840B);
                F2.u uVar = this.f11849d;
                this.f11848c.a(J(), new c(c6109x, uVar != null ? uVar.c(this.f11850e, c6109x) : u.b.f6274a));
            }
            int i13 = this.f11861p + 1;
            this.f11861p = i13;
            int i14 = this.f11854i;
            if (i13 == i14) {
                int i15 = i14 + 1000;
                long[] jArr = new long[i15];
                long[] jArr2 = new long[i15];
                long[] jArr3 = new long[i15];
                int[] iArr = new int[i15];
                int[] iArr2 = new int[i15];
                O.a[] aVarArr = new O.a[i15];
                int i16 = this.f11863r;
                int i17 = i14 - i16;
                System.arraycopy(this.f11856k, i16, jArr2, 0, i17);
                System.arraycopy(this.f11859n, this.f11863r, jArr3, 0, i17);
                System.arraycopy(this.f11858m, this.f11863r, iArr, 0, i17);
                System.arraycopy(this.f11857l, this.f11863r, iArr2, 0, i17);
                System.arraycopy(this.f11860o, this.f11863r, aVarArr, 0, i17);
                System.arraycopy(this.f11855j, this.f11863r, jArr, 0, i17);
                int i18 = this.f11863r;
                System.arraycopy(this.f11856k, 0, jArr2, i17, i18);
                System.arraycopy(this.f11859n, 0, jArr3, i17, i18);
                System.arraycopy(this.f11858m, 0, iArr, i17, i18);
                System.arraycopy(this.f11857l, 0, iArr2, i17, i18);
                System.arraycopy(this.f11860o, 0, aVarArr, i17, i18);
                System.arraycopy(this.f11855j, 0, jArr, i17, i18);
                this.f11856k = jArr2;
                this.f11859n = jArr3;
                this.f11858m = iArr;
                this.f11857l = iArr2;
                this.f11860o = aVarArr;
                this.f11855j = jArr;
                this.f11863r = 0;
                this.f11854i = i15;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private int k(long j10) {
        int i10 = this.f11861p;
        int iG = G(i10 - 1);
        while (i10 > this.f11864s && this.f11859n[iG] >= j10) {
            i10--;
            iG--;
            if (iG == -1) {
                iG = this.f11854i - 1;
            }
        }
        return i10;
    }

    public static b0 l(Q2.b bVar, F2.u uVar, t.a aVar) {
        return new b0(bVar, (F2.u) AbstractC6614a.e(uVar), (t.a) AbstractC6614a.e(aVar));
    }

    public static b0 m(Q2.b bVar) {
        return new b0(bVar, null, null);
    }

    private synchronized long n(long j10, boolean z10, boolean z11) throws Throwable {
        Throwable th2;
        try {
            try {
                int i10 = this.f11861p;
                if (i10 != 0) {
                    long[] jArr = this.f11859n;
                    int i11 = this.f11863r;
                    if (j10 >= jArr[i11]) {
                        if (z11) {
                            try {
                                int i12 = this.f11864s;
                                if (i12 != i10) {
                                    i10 = i12 + 1;
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
                        }
                        int iY = y(i11, i10, j10, z10);
                        if (iY == -1) {
                            return -1L;
                        }
                        return q(iY);
                    }
                }
                return -1L;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    private synchronized long o() {
        int i10 = this.f11861p;
        if (i10 == 0) {
            return -1L;
        }
        return q(i10);
    }

    private long q(int i10) {
        this.f11866u = Math.max(this.f11866u, E(i10));
        this.f11861p -= i10;
        int i11 = this.f11862q + i10;
        this.f11862q = i11;
        int i12 = this.f11863r + i10;
        this.f11863r = i12;
        int i13 = this.f11854i;
        if (i12 >= i13) {
            this.f11863r = i12 - i13;
        }
        int i14 = this.f11864s - i10;
        this.f11864s = i14;
        if (i14 < 0) {
            this.f11864s = 0;
        }
        this.f11848c.d(i11);
        if (this.f11861p != 0) {
            return this.f11856k[this.f11863r];
        }
        int i15 = this.f11863r;
        if (i15 == 0) {
            i15 = this.f11854i;
        }
        int i16 = i15 - 1;
        return this.f11856k[i16] + ((long) this.f11857l[i16]);
    }

    private long v(int i10) {
        int iJ = J() - i10;
        boolean z10 = false;
        AbstractC6614a.a(iJ >= 0 && iJ <= this.f11861p - this.f11864s);
        int i11 = this.f11861p - iJ;
        this.f11861p = i11;
        this.f11867v = Math.max(this.f11866u, E(i11));
        if (iJ == 0 && this.f11868w) {
            z10 = true;
        }
        this.f11868w = z10;
        this.f11848c.c(i10);
        int i12 = this.f11861p;
        if (i12 == 0) {
            return 0L;
        }
        int iG = G(i12 - 1);
        return this.f11856k[iG] + ((long) this.f11857l[iG]);
    }

    private int x(int i10, int i11, long j10, boolean z10) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f11859n[i10] >= j10) {
                return i12;
            }
            i10++;
            if (i10 == this.f11854i) {
                i10 = 0;
            }
        }
        if (z10) {
            return i11;
        }
        return -1;
    }

    private int y(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f11859n[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.f11858m[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f11854i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final int A() {
        return this.f11862q;
    }

    public final synchronized long B() {
        return this.f11861p == 0 ? Long.MIN_VALUE : this.f11859n[this.f11863r];
    }

    public final synchronized long C() {
        return this.f11867v;
    }

    public final synchronized long D() {
        return Math.max(this.f11866u, E(this.f11864s));
    }

    public final int F() {
        return this.f11862q + this.f11864s;
    }

    public final synchronized int H(long j10, boolean z10) throws Throwable {
        Throwable th2;
        try {
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            int iG = G(this.f11864s);
            if (!K() || j10 < this.f11859n[iG]) {
                return 0;
            }
            if (j10 <= this.f11867v || !z10) {
                int iY = y(iG, this.f11861p - this.f11864s, j10, true);
                if (iY == -1) {
                    return 0;
                }
                return iY;
            }
            try {
                return this.f11861p - this.f11864s;
            } catch (Throwable th4) {
                th2 = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
        }
        throw th2;
    }

    public final synchronized C6109x I() {
        return this.f11870y ? null : this.f11840B;
    }

    public final int J() {
        return this.f11862q + this.f11861p;
    }

    protected final void L() {
        this.f11871z = true;
    }

    public final synchronized boolean M() {
        return this.f11868w;
    }

    public synchronized boolean N(boolean z10) {
        C6109x c6109x;
        boolean z11 = true;
        if (K()) {
            if (((c) this.f11848c.e(F())).f11875a != this.f11852g) {
                return true;
            }
            return O(G(this.f11864s));
        }
        if (!z10 && !this.f11868w && ((c6109x = this.f11840B) == null || c6109x == this.f11852g)) {
            z11 = false;
        }
        return z11;
    }

    public void P() throws InterfaceC1558m.a {
        InterfaceC1558m interfaceC1558m = this.f11853h;
        if (interfaceC1558m != null && interfaceC1558m.getState() == 1) {
            throw ((InterfaceC1558m.a) AbstractC6614a.e(this.f11853h.c()));
        }
    }

    public final synchronized long S() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return K() ? this.f11855j[G(this.f11864s)] : this.f11841C;
    }

    public void T() {
        s();
        W();
    }

    public int U(A2.J j10, z2.f fVar, int i10, boolean z10) {
        int iR = R(j10, fVar, (i10 & 2) != 0, z10, this.f11847b);
        if (iR == -4 && !fVar.q()) {
            boolean z11 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z11) {
                    this.f11846a.f(fVar, this.f11847b);
                } else {
                    this.f11846a.m(fVar, this.f11847b);
                }
            }
            if (!z11) {
                this.f11864s++;
            }
        }
        return iR;
    }

    public void V() {
        Y(true);
        W();
    }

    public final void X() {
        Y(false);
    }

    public void Y(boolean z10) {
        this.f11846a.n();
        this.f11861p = 0;
        this.f11862q = 0;
        this.f11863r = 0;
        this.f11864s = 0;
        this.f11869x = true;
        this.f11865t = Long.MIN_VALUE;
        this.f11866u = Long.MIN_VALUE;
        this.f11867v = Long.MIN_VALUE;
        this.f11868w = false;
        this.f11848c.b();
        if (z10) {
            this.f11839A = null;
            this.f11840B = null;
            this.f11870y = true;
            this.f11842D = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    @Override // U2.O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r12, int r14, int r15, int r16, U2.O.a r17) {
        /*
            r11 = this;
            boolean r1 = r11.f11871z
            if (r1 == 0) goto Lf
            q2.x r1 = r11.f11839A
            java.lang.Object r1 = t2.AbstractC6614a.i(r1)
            q2.x r1 = (q2.C6109x) r1
            r11.c(r1)
        Lf:
            r1 = r14 & 1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L17
            r4 = r3
            goto L18
        L17:
            r4 = r2
        L18:
            boolean r5 = r11.f11869x
            if (r5 == 0) goto L21
            if (r4 != 0) goto L1f
            goto L64
        L1f:
            r11.f11869x = r2
        L21:
            long r5 = r11.f11844F
            long r5 = r5 + r12
            boolean r7 = r11.f11842D
            if (r7 == 0) goto L53
            long r7 = r11.f11865t
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 >= 0) goto L2f
            goto L64
        L2f:
            if (r1 != 0) goto L53
            boolean r1 = r11.f11843E
            if (r1 != 0) goto L4f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "Overriding unexpected non-sync sample for format: "
            r1.append(r7)
            q2.x r7 = r11.f11840B
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.String r7 = "SampleQueue"
            t2.AbstractC6635w.i(r7, r1)
            r11.f11843E = r3
        L4f:
            r1 = r14 | 1
            r3 = r1
            goto L54
        L53:
            r3 = r14
        L54:
            boolean r1 = r11.f11845G
            if (r1 == 0) goto L65
            if (r4 == 0) goto L64
            boolean r1 = r11.i(r5)
            if (r1 != 0) goto L61
            goto L64
        L61:
            r11.f11845G = r2
            goto L65
        L64:
            return
        L65:
            M2.Z r1 = r11.f11846a
            long r1 = r1.e()
            long r7 = (long) r15
            long r1 = r1 - r7
            r7 = r16
            long r7 = (long) r7
            long r1 = r1 - r7
            r9 = r5
            r4 = r1
            r1 = r9
            r0 = r11
            r6 = r15
            r7 = r17
            r0.j(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.b0.a(long, int, int, int, U2.O$a):void");
    }

    public final synchronized boolean a0(int i10) {
        Z();
        int i11 = this.f11862q;
        if (i10 >= i11 && i10 <= this.f11861p + i11) {
            this.f11865t = Long.MIN_VALUE;
            this.f11864s = i10 - i11;
            return true;
        }
        return false;
    }

    @Override // U2.O
    public final int b(InterfaceC6098m interfaceC6098m, int i10, boolean z10, int i11) {
        return this.f11846a.p(interfaceC6098m, i10, z10);
    }

    public final synchronized boolean b0(long j10, boolean z10) throws Throwable {
        b0 b0Var;
        long j11;
        int iY;
        try {
            try {
                Z();
                int iG = G(this.f11864s);
                if (!K() || j10 < this.f11859n[iG] || (j10 > this.f11867v && !z10)) {
                    return false;
                }
                if (this.f11842D) {
                    b0Var = this;
                    j11 = j10;
                    iY = b0Var.x(iG, this.f11861p - this.f11864s, j11, z10);
                } else {
                    b0Var = this;
                    j11 = j10;
                    iY = b0Var.y(iG, b0Var.f11861p - b0Var.f11864s, j11, true);
                }
                if (iY == -1) {
                    return false;
                }
                b0Var.f11865t = j11;
                b0Var.f11864s += iY;
                return true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        throw th;
    }

    @Override // U2.O
    public final void c(C6109x c6109x) {
        C6109x c6109xZ = z(c6109x);
        this.f11871z = false;
        this.f11839A = c6109x;
        boolean zE0 = e0(c6109xZ);
        d dVar = this.f11851f;
        if (dVar == null || !zE0) {
            return;
        }
        dVar.b(c6109xZ);
    }

    public final void c0(long j10) {
        if (this.f11844F != j10) {
            this.f11844F = j10;
            L();
        }
    }

    public final void d0(long j10) {
        this.f11865t = j10;
    }

    public final void f0(d dVar) {
        this.f11851f = dVar;
    }

    @Override // U2.O
    public final void g(C6609I c6609i, int i10, int i11) {
        this.f11846a.q(c6609i, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void g0(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.f11864s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.f11861p     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            t2.AbstractC6614a.a(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.f11864s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.f11864s = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.b0.g0(int):void");
    }

    public final void h0(long j10) {
        this.f11841C = j10;
    }

    public final void i0() {
        this.f11845G = true;
    }

    public synchronized long p() {
        int i10 = this.f11864s;
        if (i10 == 0) {
            return -1L;
        }
        return q(i10);
    }

    public final void r(long j10, boolean z10, boolean z11) {
        this.f11846a.b(n(j10, z10, z11));
    }

    public final void s() {
        this.f11846a.b(o());
    }

    public final void t() {
        this.f11846a.b(p());
    }

    public final void u(long j10) {
        if (this.f11861p == 0) {
            return;
        }
        AbstractC6614a.a(j10 > D());
        w(this.f11862q + k(j10));
    }

    public final void w(int i10) {
        this.f11846a.c(v(i10));
    }

    protected C6109x z(C6109x c6109x) {
        return (this.f11844F == 0 || c6109x.f57027t == Long.MAX_VALUE) ? c6109x : c6109x.b().C0(c6109x.f57027t + this.f11844F).P();
    }
}
