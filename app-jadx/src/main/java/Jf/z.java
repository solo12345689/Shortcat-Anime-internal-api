package Jf;

import Gf.C1627p;
import Gf.InterfaceC1612h0;
import Td.u;
import ae.AbstractC2605b;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class z extends Kf.b implements t, InterfaceC1742e, Kf.m {

    /* JADX INFO: renamed from: e */
    private final int f9672e;

    /* JADX INFO: renamed from: f */
    private final int f9673f;

    /* JADX INFO: renamed from: g */
    private final If.a f9674g;

    /* JADX INFO: renamed from: h */
    private Object[] f9675h;

    /* JADX INFO: renamed from: i */
    private long f9676i;

    /* JADX INFO: renamed from: j */
    private long f9677j;

    /* JADX INFO: renamed from: k */
    private int f9678k;

    /* JADX INFO: renamed from: l */
    private int f9679l;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements InterfaceC1612h0 {

        /* JADX INFO: renamed from: a */
        public final z f9680a;

        /* JADX INFO: renamed from: b */
        public long f9681b;

        /* JADX INFO: renamed from: c */
        public final Object f9682c;

        /* JADX INFO: renamed from: d */
        public final Zd.e f9683d;

        public a(z zVar, long j10, Object obj, Zd.e eVar) {
            this.f9680a = zVar;
            this.f9681b = j10;
            this.f9682c = obj;
            this.f9683d = eVar;
        }

        @Override // Gf.InterfaceC1612h0
        public void dispose() {
            this.f9680a.y(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f9684a;

        static {
            int[] iArr = new int[If.a.values().length];
            try {
                iArr[If.a.f9114a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[If.a.f9116c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[If.a.f9115b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9684a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        Object f9685a;

        /* JADX INFO: renamed from: b */
        Object f9686b;

        /* JADX INFO: renamed from: c */
        Object f9687c;

        /* JADX INFO: renamed from: d */
        Object f9688d;

        /* JADX INFO: renamed from: e */
        /* synthetic */ Object f9689e;

        /* JADX INFO: renamed from: g */
        int f9691g;

        c(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9689e = obj;
            this.f9691g |= Integer.MIN_VALUE;
            return z.A(z.this, null, this);
        }
    }

    public z(int i10, int i11, If.a aVar) {
        this.f9672e = i10;
        this.f9673f = i11;
        this.f9674g = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x00ab, code lost:
    
        if (r8 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00ad, code lost:
    
        Gf.F0.i(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00b0, code lost:
    
        r0.f9685a = r5;
        r0.f9686b = r2;
        r0.f9687c = r9;
        r0.f9688d = r8;
        r0.f9691g = 3;
        r10 = r2.emit(r10, r0);
        r2 = r2;
        r5 = r5;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00be, code lost:
    
        if (r10 != r1) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00ab A[EDGE_INSN: B:108:0x00ab->B:93:0x00ab BREAK  A[LOOP:0: B:88:0x0092->B:111:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x009a A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:71:0x003b, B:88:0x0092, B:90:0x009a, B:94:0x00ad, B:95:0x00b0, B:78:0x005d), top: B:104:0x0022 }] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v4, types: [Jf.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [Kf.b] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [Jf.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [Jf.f] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [Kf.d] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [Jf.B, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9, types: [Jf.B] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x00be -> B:72:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object A(Jf.z r8, Jf.InterfaceC1743f r9, Zd.e r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof Jf.z.c
            if (r0 == 0) goto L13
            r0 = r10
            Jf.z$c r0 = (Jf.z.c) r0
            int r1 = r0.f9691g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9691g = r1
            goto L18
        L13:
            Jf.z$c r0 = new Jf.z$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f9689e
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f9691g
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L77
            r8 = 1
            if (r2 == r8) goto L61
            if (r2 == r4) goto L4d
            if (r2 != r3) goto L45
            java.lang.Object r8 = r0.f9688d
            Gf.C0 r8 = (Gf.C0) r8
            java.lang.Object r9 = r0.f9687c
            Jf.B r9 = (Jf.B) r9
            java.lang.Object r2 = r0.f9686b
            Jf.f r2 = (Jf.InterfaceC1743f) r2
            java.lang.Object r5 = r0.f9685a
            Jf.z r5 = (Jf.z) r5
            Td.v.b(r10)     // Catch: java.lang.Throwable -> L42
        L3e:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L8f
        L42:
            r8 = move-exception
            goto Lc4
        L45:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4d:
            java.lang.Object r8 = r0.f9688d
            Gf.C0 r8 = (Gf.C0) r8
            java.lang.Object r9 = r0.f9687c
            Jf.B r9 = (Jf.B) r9
            java.lang.Object r2 = r0.f9686b
            Jf.f r2 = (Jf.InterfaceC1743f) r2
            java.lang.Object r5 = r0.f9685a
            Jf.z r5 = (Jf.z) r5
            Td.v.b(r10)     // Catch: java.lang.Throwable -> L42
            goto L92
        L61:
            java.lang.Object r8 = r0.f9687c
            r9 = r8
            Jf.B r9 = (Jf.B) r9
            java.lang.Object r8 = r0.f9686b
            Jf.f r8 = (Jf.InterfaceC1743f) r8
            java.lang.Object r2 = r0.f9685a
            Jf.z r2 = (Jf.z) r2
            Td.v.b(r10)     // Catch: java.lang.Throwable -> L74
            r10 = r8
            r8 = r2
            goto L83
        L74:
            r8 = move-exception
            r5 = r2
            goto Lc4
        L77:
            Td.v.b(r10)
            Kf.d r10 = r8.g()
            Jf.B r10 = (Jf.B) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L83:
            Zd.i r2 = r0.getContext()     // Catch: java.lang.Throwable -> Lc1
            Gf.C0$b r5 = Gf.C0.f7490K     // Catch: java.lang.Throwable -> Lc1
            Zd.i$b r2 = r2.l(r5)     // Catch: java.lang.Throwable -> Lc1
            Gf.C0 r2 = (Gf.C0) r2     // Catch: java.lang.Throwable -> Lc1
        L8f:
            r5 = r8
            r8 = r2
            r2 = r10
        L92:
            java.lang.Object r10 = r5.U(r9)     // Catch: java.lang.Throwable -> L42
            Lf.E r6 = Jf.A.f9513a     // Catch: java.lang.Throwable -> L42
            if (r10 != r6) goto Lab
            r0.f9685a = r5     // Catch: java.lang.Throwable -> L42
            r0.f9686b = r2     // Catch: java.lang.Throwable -> L42
            r0.f9687c = r9     // Catch: java.lang.Throwable -> L42
            r0.f9688d = r8     // Catch: java.lang.Throwable -> L42
            r0.f9691g = r4     // Catch: java.lang.Throwable -> L42
            java.lang.Object r10 = r5.x(r9, r0)     // Catch: java.lang.Throwable -> L42
            if (r10 != r1) goto L92
            goto Lc0
        Lab:
            if (r8 == 0) goto Lb0
            Gf.F0.i(r8)     // Catch: java.lang.Throwable -> L42
        Lb0:
            r0.f9685a = r5     // Catch: java.lang.Throwable -> L42
            r0.f9686b = r2     // Catch: java.lang.Throwable -> L42
            r0.f9687c = r9     // Catch: java.lang.Throwable -> L42
            r0.f9688d = r8     // Catch: java.lang.Throwable -> L42
            r0.f9691g = r3     // Catch: java.lang.Throwable -> L42
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L42
            if (r10 != r1) goto L3e
        Lc0:
            return r1
        Lc1:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lc4:
            r5.k(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Jf.z.A(Jf.z, Jf.f, Zd.e):java.lang.Object");
    }

    private final void B(long j10) {
        Kf.d[] dVarArr;
        if (((Kf.b) this).f11080b != 0 && (dVarArr = ((Kf.b) this).f11079a) != null) {
            for (Kf.d dVar : dVarArr) {
                if (dVar != null) {
                    B b10 = (B) dVar;
                    long j11 = b10.f9514a;
                    if (j11 >= 0 && j11 < j10) {
                        b10.f9514a = j10;
                    }
                }
            }
        }
        this.f9677j = j10;
    }

    private final void E() {
        Object[] objArr = this.f9675h;
        AbstractC5504s.e(objArr);
        A.g(objArr, K(), null);
        this.f9678k--;
        long jK = K() + 1;
        if (this.f9676i < jK) {
            this.f9676i = jK;
        }
        if (this.f9677j < jK) {
            B(jK);
        }
    }

    static /* synthetic */ Object F(z zVar, Object obj, Zd.e eVar) throws Throwable {
        if (zVar.c(obj)) {
            return Td.L.f17438a;
        }
        Object objG = zVar.G(obj, eVar);
        return objG == AbstractC2605b.f() ? objG : Td.L.f17438a;
    }

    private final Object G(Object obj, Zd.e eVar) throws Throwable {
        Throwable th2;
        Zd.e[] eVarArrI;
        a aVar;
        C1627p c1627p = new C1627p(AbstractC2605b.c(eVar), 1);
        c1627p.C();
        Zd.e[] eVarArrI2 = Kf.c.f11083a;
        synchronized (this) {
            try {
                if (R(obj)) {
                    try {
                        u.a aVar2 = Td.u.f17466b;
                        c1627p.resumeWith(Td.u.b(Td.L.f17438a));
                        eVarArrI = I(eVarArrI2);
                        aVar = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    try {
                        aVar = new a(this, K() + ((long) P()), obj, c1627p);
                        H(aVar);
                        this.f9679l++;
                        if (this.f9673f == 0) {
                            eVarArrI2 = I(eVarArrI2);
                        }
                        eVarArrI = eVarArrI2;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        throw th2;
                    }
                }
                if (aVar != null) {
                    Gf.r.a(c1627p, aVar);
                }
                for (Zd.e eVar2 : eVarArrI) {
                    if (eVar2 != null) {
                        u.a aVar3 = Td.u.f17466b;
                        eVar2.resumeWith(Td.u.b(Td.L.f17438a));
                    }
                }
                Object objV = c1627p.v();
                if (objV == AbstractC2605b.f()) {
                    kotlin.coroutines.jvm.internal.h.c(eVar);
                }
                return objV == AbstractC2605b.f() ? objV : Td.L.f17438a;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public final void H(Object obj) {
        int iP = P();
        Object[] objArrQ = this.f9675h;
        if (objArrQ == null) {
            objArrQ = Q(null, 0, 2);
        } else if (iP >= objArrQ.length) {
            objArrQ = Q(objArrQ, iP, objArrQ.length * 2);
        }
        A.g(objArrQ, K() + ((long) iP), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [Zd.e[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final Zd.e[] I(Zd.e[] eVarArr) {
        Kf.d[] dVarArr;
        B b10;
        Zd.e eVar;
        int length = eVarArr.length;
        if (((Kf.b) this).f11080b != 0 && (dVarArr = ((Kf.b) this).f11079a) != null) {
            int length2 = dVarArr.length;
            int i10 = 0;
            eVarArr = eVarArr;
            while (i10 < length2) {
                Kf.d dVar = dVarArr[i10];
                if (dVar != null && (eVar = (b10 = (B) dVar).f9515b) != null && T(b10) >= 0) {
                    int length3 = eVarArr.length;
                    eVarArr = eVarArr;
                    if (length >= length3) {
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) eVarArr, Math.max(2, eVarArr.length * 2));
                        AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
                        eVarArr = objArrCopyOf;
                    }
                    ((Zd.e[]) eVarArr)[length] = eVar;
                    b10.f9515b = null;
                    length++;
                }
                i10++;
                eVarArr = eVarArr;
            }
        }
        return (Zd.e[]) eVarArr;
    }

    private final long J() {
        return K() + ((long) this.f9678k);
    }

    public final long K() {
        return Math.min(this.f9677j, this.f9676i);
    }

    private final Object M(long j10) {
        Object[] objArr = this.f9675h;
        AbstractC5504s.e(objArr);
        Object objF = A.f(objArr, j10);
        return objF instanceof a ? ((a) objF).f9682c : objF;
    }

    private final long N() {
        return K() + ((long) this.f9678k) + ((long) this.f9679l);
    }

    private final int O() {
        return (int) ((K() + ((long) this.f9678k)) - this.f9676i);
    }

    public final int P() {
        return this.f9678k + this.f9679l;
    }

    private final Object[] Q(Object[] objArr, int i10, int i11) {
        if (i11 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i11];
        this.f9675h = objArr2;
        if (objArr != null) {
            long jK = K();
            for (int i12 = 0; i12 < i10; i12++) {
                long j10 = ((long) i12) + jK;
                A.g(objArr2, j10, A.f(objArr, j10));
            }
        }
        return objArr2;
    }

    public final boolean R(Object obj) {
        if (l() == 0) {
            return S(obj);
        }
        if (this.f9678k >= this.f9673f && this.f9677j <= this.f9676i) {
            int i10 = b.f9684a[this.f9674g.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
            if (i10 != 3) {
                throw new Td.r();
            }
        }
        H(obj);
        int i11 = this.f9678k + 1;
        this.f9678k = i11;
        if (i11 > this.f9673f) {
            E();
        }
        if (O() > this.f9672e) {
            V(this.f9676i + 1, this.f9677j, J(), N());
        }
        return true;
    }

    private final boolean S(Object obj) {
        if (this.f9672e == 0) {
            return true;
        }
        H(obj);
        int i10 = this.f9678k + 1;
        this.f9678k = i10;
        if (i10 > this.f9672e) {
            E();
        }
        this.f9677j = K() + ((long) this.f9678k);
        return true;
    }

    public final long T(B b10) {
        long j10 = b10.f9514a;
        if (j10 >= J() && (this.f9673f > 0 || j10 > K() || this.f9679l == 0)) {
            return -1L;
        }
        return j10;
    }

    private final Object U(B b10) {
        Object obj;
        Zd.e[] eVarArrW = Kf.c.f11083a;
        synchronized (this) {
            try {
                long jT = T(b10);
                if (jT < 0) {
                    obj = A.f9513a;
                } else {
                    long j10 = b10.f9514a;
                    Object objM = M(jT);
                    b10.f9514a = jT + 1;
                    eVarArrW = W(j10);
                    obj = objM;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (Zd.e eVar : eVarArrW) {
            if (eVar != null) {
                u.a aVar = Td.u.f17466b;
                eVar.resumeWith(Td.u.b(Td.L.f17438a));
            }
        }
        return obj;
    }

    private final void V(long j10, long j11, long j12, long j13) {
        long jMin = Math.min(j11, j10);
        for (long jK = K(); jK < jMin; jK++) {
            Object[] objArr = this.f9675h;
            AbstractC5504s.e(objArr);
            A.g(objArr, jK, null);
        }
        this.f9676i = j10;
        this.f9677j = j11;
        this.f9678k = (int) (j12 - jMin);
        this.f9679l = (int) (j13 - j12);
    }

    private final Object x(B b10, Zd.e eVar) {
        C1627p c1627p = new C1627p(AbstractC2605b.c(eVar), 1);
        c1627p.C();
        synchronized (this) {
            try {
                if (T(b10) < 0) {
                    b10.f9515b = c1627p;
                } else {
                    u.a aVar = Td.u.f17466b;
                    c1627p.resumeWith(Td.u.b(Td.L.f17438a));
                }
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object objV = c1627p.v();
        if (objV == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objV == AbstractC2605b.f() ? objV : Td.L.f17438a;
    }

    public final void y(a aVar) {
        synchronized (this) {
            if (aVar.f9681b < K()) {
                return;
            }
            Object[] objArr = this.f9675h;
            AbstractC5504s.e(objArr);
            if (A.f(objArr, aVar.f9681b) != aVar) {
                return;
            }
            A.g(objArr, aVar.f9681b, A.f9513a);
            z();
            Td.L l10 = Td.L.f17438a;
        }
    }

    private final void z() {
        if (this.f9673f != 0 || this.f9679l > 1) {
            Object[] objArr = this.f9675h;
            AbstractC5504s.e(objArr);
            while (this.f9679l > 0 && A.f(objArr, (K() + ((long) P())) - 1) == A.f9513a) {
                this.f9679l--;
                A.g(objArr, K() + ((long) P()), null);
            }
        }
    }

    @Override // Kf.b
    /* JADX INFO: renamed from: C */
    public B i() {
        return new B();
    }

    @Override // Kf.b
    /* JADX INFO: renamed from: D */
    public B[] j(int i10) {
        return new B[i10];
    }

    protected final Object L() {
        Object[] objArr = this.f9675h;
        AbstractC5504s.e(objArr);
        return A.f(objArr, (this.f9676i + ((long) O())) - 1);
    }

    public final Zd.e[] W(long j10) {
        long j11;
        long j12;
        long j13;
        Kf.d[] dVarArr;
        if (j10 > this.f9677j) {
            return Kf.c.f11083a;
        }
        long jK = K();
        long j14 = ((long) this.f9678k) + jK;
        if (this.f9673f == 0 && this.f9679l > 0) {
            j14++;
        }
        if (((Kf.b) this).f11080b != 0 && (dVarArr = ((Kf.b) this).f11079a) != null) {
            for (Kf.d dVar : dVarArr) {
                if (dVar != null) {
                    long j15 = ((B) dVar).f9514a;
                    if (j15 >= 0 && j15 < j14) {
                        j14 = j15;
                    }
                }
            }
        }
        if (j14 <= this.f9677j) {
            return Kf.c.f11083a;
        }
        long J10 = J();
        int iMin = l() > 0 ? Math.min(this.f9679l, this.f9673f - ((int) (J10 - j14))) : this.f9679l;
        Zd.e[] eVarArr = Kf.c.f11083a;
        long j16 = ((long) this.f9679l) + J10;
        if (iMin > 0) {
            eVarArr = new Zd.e[iMin];
            Object[] objArr = this.f9675h;
            AbstractC5504s.e(objArr);
            j13 = 1;
            long j17 = J10;
            int i10 = 0;
            while (true) {
                if (J10 >= j16) {
                    j11 = jK;
                    j12 = j14;
                    J10 = j17;
                    break;
                }
                Object objF = A.f(objArr, J10);
                j11 = jK;
                Lf.E e10 = A.f9513a;
                if (objF != e10) {
                    AbstractC5504s.f(objF, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) objF;
                    int i11 = i10 + 1;
                    j12 = j14;
                    eVarArr[i10] = aVar.f9683d;
                    A.g(objArr, J10, e10);
                    A.g(objArr, j17, aVar.f9682c);
                    long j18 = j17 + 1;
                    if (i11 >= iMin) {
                        J10 = j18;
                        break;
                    }
                    i10 = i11;
                    j17 = j18;
                } else {
                    j12 = j14;
                }
                J10++;
                jK = j11;
                j14 = j12;
            }
        } else {
            j11 = jK;
            j12 = j14;
            j13 = 1;
        }
        Zd.e[] eVarArr2 = eVarArr;
        int i12 = (int) (J10 - j11);
        long j19 = l() == 0 ? J10 : j12;
        long jMax = Math.max(this.f9676i, J10 - ((long) Math.min(this.f9672e, i12)));
        if (this.f9673f == 0 && jMax < j16) {
            Object[] objArr2 = this.f9675h;
            AbstractC5504s.e(objArr2);
            if (AbstractC5504s.c(A.f(objArr2, jMax), A.f9513a)) {
                J10 += j13;
                jMax += j13;
            }
        }
        V(jMax, j19, J10, j16);
        z();
        return !(eVarArr2.length == 0) ? I(eVarArr2) : eVarArr2;
    }

    public final long X() {
        long j10 = this.f9676i;
        if (j10 < this.f9677j) {
            this.f9677j = j10;
        }
        return j10;
    }

    @Override // Kf.m
    public InterfaceC1742e a(Zd.i iVar, int i10, If.a aVar) {
        return A.e(this, iVar, i10, aVar);
    }

    @Override // Jf.t
    public boolean c(Object obj) {
        int i10;
        boolean z10;
        Zd.e[] eVarArrI = Kf.c.f11083a;
        synchronized (this) {
            if (R(obj)) {
                eVarArrI = I(eVarArrI);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (Zd.e eVar : eVarArrI) {
            if (eVar != null) {
                u.a aVar = Td.u.f17466b;
                eVar.resumeWith(Td.u.b(Td.L.f17438a));
            }
        }
        return z10;
    }

    @Override // Jf.y, Jf.InterfaceC1742e
    public Object collect(InterfaceC1743f interfaceC1743f, Zd.e eVar) {
        return A(this, interfaceC1743f, eVar);
    }

    @Override // Jf.t, Jf.InterfaceC1743f
    public Object emit(Object obj, Zd.e eVar) {
        return F(this, obj, eVar);
    }

    @Override // Jf.t
    public void h() throws Throwable {
        synchronized (this) {
            try {
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                V(J(), this.f9677j, J(), N());
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }
}
