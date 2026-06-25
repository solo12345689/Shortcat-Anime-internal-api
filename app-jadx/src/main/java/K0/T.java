package K0;

import I0.AbstractC1675a;
import I0.AbstractC1691q;
import I0.InterfaceC1690p;
import K0.J;
import androidx.compose.ui.layout.s;
import i1.AbstractC5022o;
import i1.C5021n;
import i1.C5025r;
import ie.InterfaceC5082a;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t.C6550P;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class T extends androidx.compose.ui.layout.s implements androidx.compose.ui.layout.l, Z {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f10517o = new b(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Function1 f10518p = a.f10528a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f10519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Function1 f10520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private u0 f10521h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f10522i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f10523j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f10524k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final s.a f10525l = androidx.compose.ui.layout.t.a(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private z0 f10526m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C6550P f10527n;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f10528a = new a();

        a() {
            super(1);
        }

        public final void a(u0 u0Var) {
            if (u0Var.J0()) {
                u0Var.a().F1(u0Var);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((u0) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class c implements I0.M {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f10529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f10530b = C5021n.f48560b.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f10531c = C5025r.f48570b.a();

        public c() {
        }

        @Override // I0.M
        public void A0(androidx.compose.ui.layout.y yVar, float f10) {
            T.this.X1(yVar, f10);
        }

        public final long a() {
            return this.f10531c;
        }

        public final boolean b() {
            return this.f10529a;
        }

        @Override // i1.InterfaceC5011d
        public float getDensity() {
            return T.this.getDensity();
        }

        public final long j() {
            return this.f10530b;
        }

        @Override // i1.InterfaceC5019l
        public float j1() {
            return T.this.j1();
        }

        public final void p(boolean z10) {
            this.f10529a = z10;
        }

        public final void q(long j10) {
            this.f10530b = j10;
        }

        @Override // I0.M
        public InterfaceC1690p x() {
            this.f10529a = true;
            InterfaceC1690p interfaceC1690pX = T.this.x();
            if (C5021n.j(this.f10530b, C5021n.f48560b.a())) {
                this.f10530b = AbstractC5022o.d(AbstractC1691q.g(interfaceC1690pX));
                this.f10531c = interfaceC1690pX.a();
            }
            T.this.L1().d0().H();
            return interfaceC1690pX;
        }

        public final void z(long j10) {
            this.f10531c = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f10534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f10535c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ u0 f10536d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j10, long j11, u0 u0Var) {
            super(0);
            this.f10534b = j10;
            this.f10535c = j11;
            this.f10536d = u0Var;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m17invoke();
            return Td.L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m17invoke() {
            T.this.Q1().p(false);
            T.this.Q1().q(this.f10534b);
            T.this.Q1().z(this.f10535c);
            Function1 function1B = this.f10536d.b().B();
            if (function1B != null) {
                function1B.invoke(T.this.Q1());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements I0.C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f10537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f10538b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f10539c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f10540d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f10541e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ T f10542f;

        e(int i10, int i11, Map map, Function1 function1, Function1 function12, T t10) {
            this.f10537a = i10;
            this.f10538b = i11;
            this.f10539c = map;
            this.f10540d = function1;
            this.f10541e = function12;
            this.f10542f = t10;
        }

        @Override // I0.C
        public void A() {
            this.f10541e.invoke(this.f10542f.O1());
        }

        @Override // I0.C
        public Function1 B() {
            return this.f10540d;
        }

        @Override // I0.C
        public int getHeight() {
            return this.f10538b;
        }

        @Override // I0.C
        public int getWidth() {
            return this.f10537a;
        }

        @Override // I0.C
        public Map z() {
            return this.f10539c;
        }
    }

    static /* synthetic */ void E1(T t10, u0 u0Var, long j10, long j11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: captureRulers-OSxE8f4");
        }
        if ((i10 & 2) != 0) {
            j10 = C5021n.f48560b.a();
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = C5025r.f48570b.a();
        }
        t10.z1(u0Var, j12, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F1(K0.u0 r15) {
        /*
            r14 = this;
            boolean r0 = r14.f10524k
            if (r0 == 0) goto L5
            goto L5b
        L5:
            I0.C r0 = r15.b()
            kotlin.jvm.functions.Function1 r0 = r0.B()
            t.P r1 = r14.f10527n
            if (r0 != 0) goto L5c
            if (r1 == 0) goto L5b
            java.lang.Object[] r15 = r1.f60045c
            long[] r0 = r1.f60043a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L58
            r3 = 0
            r4 = r3
        L1e:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L53
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L38:
            if (r9 >= r7) goto L51
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4d
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r15[r10]
            t.Q r10 = (t.Q) r10
            r14.W1(r10)
        L4d:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L38
        L51:
            if (r7 != r8) goto L58
        L53:
            if (r4 == r2) goto L58
            int r4 = r4 + 1
            goto L1e
        L58:
            r1.k()
        L5b:
            return
        L5c:
            r11 = 6
            r12 = 0
            r7 = 0
            r9 = 0
            r5 = r14
            r6 = r15
            E1(r5, r6, r7, r9, r11, r12)
            r5.f10520g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.T.F1(K0.u0):void");
    }

    private final T H1(androidx.compose.ui.layout.y yVar) {
        T t10 = this;
        while (true) {
            z0 z0Var = t10.f10526m;
            if (z0Var != null && z0Var.b(yVar)) {
                return t10;
            }
            T tN1 = t10.N1();
            if (tN1 == null) {
                return t10;
            }
            t10 = tN1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c Q1() {
        c cVar = this.f10519f;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f10519f = cVar2;
        return cVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void W1(t.Q q10) {
        J j10;
        Object[] objArr = q10.f60055b;
        long[] jArr = q10.f60054a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j11 = jArr[i10];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j11) < 128 && (j10 = (J) ((L0) objArr[(i10 << 3) + i12]).get()) != null) {
                        if (k0()) {
                            j10.B1(false);
                        } else {
                            j10.F1(false);
                        }
                    }
                    j11 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x009f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void x1(K0.J r32, androidx.compose.ui.layout.y r33) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.T.x1(K0.J, androidx.compose.ui.layout.y):void");
    }

    private final void z1(u0 u0Var, long j10, long j11) {
        r0 snapshotObserver;
        C6550P c6550p = this.f10527n;
        z0 z0Var = this.f10526m;
        if (z0Var == null) {
            z0Var = new z0();
            this.f10526m = z0Var;
        }
        p0 p0VarZ0 = L1().z0();
        if (p0VarZ0 != null && (snapshotObserver = p0VarZ0.getSnapshotObserver()) != null) {
            snapshotObserver.i(u0Var, f10518p, new d(j10, j11, u0Var));
        }
        z0Var.d(k0(), this, c6550p);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G1(I0.C r24) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.T.G1(I0.C):void");
    }

    public final float I1(androidx.compose.ui.layout.y yVar, float f10) {
        if (this.f10524k) {
            return f10;
        }
        T t10 = this;
        while (true) {
            z0 z0Var = t10.f10526m;
            float fC = z0Var != null ? z0Var.c(yVar, Float.NaN) : Float.NaN;
            if (!Float.isNaN(fC)) {
                t10.x1(L1(), yVar);
                return yVar.a(fC, t10.x(), x());
            }
            T tN1 = t10.N1();
            if (tN1 == null) {
                t10.x1(L1(), yVar);
                return f10;
            }
            t10 = tN1;
        }
    }

    public abstract T J1();

    public abstract boolean K1();

    public abstract J L1();

    public abstract I0.C M1();

    @Override // I0.D
    public final int N(AbstractC1675a abstractC1675a) {
        int iY1;
        if (K1() && (iY1 = y1(abstractC1675a)) != Integer.MIN_VALUE) {
            return iY1 + C5021n.l(O0());
        }
        return Integer.MIN_VALUE;
    }

    public abstract T N1();

    public final s.a O1() {
        return this.f10525l;
    }

    public abstract long P1();

    protected final void R1(AbstractC1785e0 abstractC1785e0) {
        AbstractC1776a abstractC1776aZ;
        AbstractC1785e0 abstractC1785e0O2 = abstractC1785e0.O2();
        if (!AbstractC5504s.c(abstractC1785e0O2 != null ? abstractC1785e0O2.L1() : null, abstractC1785e0.L1())) {
            abstractC1785e0.C2().z().m();
            return;
        }
        InterfaceC1778b interfaceC1778bS = abstractC1785e0.C2().S();
        if (interfaceC1778bS == null || (abstractC1776aZ = interfaceC1778bS.z()) == null) {
            return;
        }
        abstractC1776aZ.m();
    }

    public final void S1(androidx.compose.ui.layout.y yVar) {
        C6550P c6550p = H1(yVar).f10527n;
        t.Q q10 = c6550p != null ? (t.Q) c6550p.u(yVar) : null;
        if (q10 != null) {
            W1(q10);
        }
    }

    public boolean T1() {
        return this.f10522i;
    }

    public final boolean U1() {
        return this.f10524k;
    }

    public final boolean V1() {
        return this.f10523j;
    }

    @Override // K0.Z
    public void W(boolean z10) {
        T tN1 = N1();
        J jL1 = tN1 != null ? tN1.L1() : null;
        if (AbstractC5504s.c(jL1, L1())) {
            Z1(z10);
            return;
        }
        if ((jL1 != null ? jL1.f0() : null) != J.e.f10478c) {
            if ((jL1 != null ? jL1.f0() : null) != J.e.f10479d) {
                return;
            }
        }
        Z1(z10);
    }

    public final void X1(androidx.compose.ui.layout.y yVar, float f10) {
        z0 z0Var = this.f10526m;
        if (z0Var == null) {
            z0Var = new z0();
            this.f10526m = z0Var;
        }
        z0Var.e(yVar, f10);
    }

    public abstract void Y1();

    public void Z1(boolean z10) {
        this.f10522i = z10;
    }

    public final void a2(boolean z10) {
        this.f10524k = z10;
    }

    public final void b2(boolean z10) {
        this.f10523j = z10;
    }

    @Override // I0.InterfaceC1687m
    public boolean k0() {
        return false;
    }

    @Override // androidx.compose.ui.layout.l
    public I0.C q1(int i10, int i11, Map map, Function1 function1, Function1 function12) {
        if (!((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0)) {
            H0.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new e(i10, i11, map, function1, function12, this);
    }

    public abstract InterfaceC1690p x();

    public abstract int y1(AbstractC1675a abstractC1675a);
}
