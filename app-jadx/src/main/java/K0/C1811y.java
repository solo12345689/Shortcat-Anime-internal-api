package K0;

import I0.AbstractC1675a;
import K0.J;
import a0.C2507c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.AbstractC6371l1;
import s0.C6385r0;
import s0.InterfaceC6364j0;
import s0.InterfaceC6368k1;
import v0.C6811c;

/* JADX INFO: renamed from: K0.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1811y extends AbstractC1785e0 {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final a f10829x0 = new a(null);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final InterfaceC6368k1 f10830y0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private final E0 f10831v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private U f10832w0;

    /* JADX INFO: renamed from: K0.y$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: K0.y$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class b extends U {
        public b() {
            super(C1811y.this);
        }

        @Override // K0.U, I0.InterfaceC1686l
        public int I(int i10) {
            return L1().j1(i10);
        }

        @Override // K0.U, I0.InterfaceC1686l
        public int Z(int i10) {
            return L1().n1(i10);
        }

        @Override // K0.U
        protected void k2() {
            V vI0 = L1().i0();
            AbstractC5504s.e(vI0);
            vI0.d2();
        }

        @Override // K0.U, I0.InterfaceC1686l
        public int l0(int i10) {
            return L1().o1(i10);
        }

        @Override // K0.U, I0.InterfaceC1686l
        public int q0(int i10) {
            return L1().k1(i10);
        }

        @Override // I0.A
        public androidx.compose.ui.layout.s v0(long j10) {
            i1(j10);
            C2507c c2507cI0 = L1().I0();
            Object[] objArr = c2507cI0.f23496a;
            int iP = c2507cI0.p();
            for (int i10 = 0; i10 < iP; i10++) {
                V vI0 = ((J) objArr[i10]).i0();
                AbstractC5504s.e(vI0);
                vI0.n2(J.g.f10486c);
            }
            p2(L1().n0().mo0measure3p2s80s(this, L1().N(), j10));
            return this;
        }

        @Override // K0.T
        public int y1(AbstractC1675a abstractC1675a) {
            Integer num = (Integer) e2().L().get(abstractC1675a);
            int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            g2().u(abstractC1675a, iIntValue);
            return iIntValue;
        }
    }

    static {
        InterfaceC6368k1 interfaceC6368k1A = s0.Q.a();
        interfaceC6368k1A.p(C6385r0.f58985b.h());
        interfaceC6368k1A.A(1.0f);
        interfaceC6368k1A.z(AbstractC6371l1.f58959a.b());
        f10830y0 = interfaceC6368k1A;
    }

    public C1811y(J j10) {
        super(j10);
        this.f10831v0 = new E0();
        N2().updateCoordinator$ui_release(this);
        this.f10832w0 = j10.j0() != null ? new b() : null;
    }

    private final void L3() {
        if (V1()) {
            return;
        }
        L1().l0().h2();
    }

    @Override // I0.InterfaceC1686l
    public int I(int i10) {
        return L1().h1(i10);
    }

    @Override // K0.AbstractC1785e0
    public U I2() {
        return this.f10832w0;
    }

    @Override // K0.AbstractC1785e0
    /* JADX INFO: renamed from: K3, reason: merged with bridge method [inline-methods] */
    public E0 N2() {
        return this.f10831v0;
    }

    protected void M3(U u10) {
        this.f10832w0 = u10;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // K0.AbstractC1785e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void X2(K0.AbstractC1785e0.f r11, long r12, K0.C1809w r14, int r15, boolean r16) {
        /*
            r10 = this;
            K0.J r0 = r10.L1()
            boolean r0 = r11.d(r0)
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L39
            boolean r0 = r10.J3(r12)
            if (r0 == 0) goto L17
            r6 = r15
            r5 = r16
        L15:
            r0 = r4
            goto L3d
        L17:
            E0.Q$a r0 = E0.Q.f4086a
            int r0 = r0.d()
            r6 = r15
            boolean r0 = E0.Q.g(r15, r0)
            if (r0 == 0) goto L3a
            long r7 = r10.J2()
            float r0 = r10.t2(r12, r7)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r7 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r7
            r7 = 2139095040(0x7f800000, float:Infinity)
            if (r0 >= r7) goto L3a
            goto L15
        L39:
            r6 = r15
        L3a:
            r0 = r5
            r5 = r16
        L3d:
            if (r0 == 0) goto L87
            int r7 = K0.C1809w.e(r14)
            K0.J r0 = r10.L1()
            a0.c r0 = r0.H0()
            java.lang.Object[] r8 = r0.f23496a
            int r0 = r0.p()
            int r0 = r0 - r4
            r9 = r0
        L53:
            if (r9 < 0) goto L84
            r0 = r8[r9]
            K0.J r0 = (K0.J) r0
            boolean r4 = r0.p()
            if (r4 == 0) goto L7e
            r1 = r6
            r6 = r5
            r5 = r1
            r2 = r12
            r4 = r14
            r1 = r0
            r0 = r11
            r0.c(r1, r2, r4, r5, r6)
            boolean r0 = r14.u()
            if (r0 != 0) goto L70
            goto L7f
        L70:
            K0.e0 r0 = r1.w0()
            boolean r0 = r0.x3()
            if (r0 == 0) goto L84
            r14.b()
            goto L7f
        L7e:
            r6 = r5
        L7f:
            int r9 = r9 + (-1)
            r5 = r6
            r6 = r15
            goto L53
        L84:
            K0.C1809w.l(r14, r7)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.C1811y.X2(K0.e0$f, long, K0.w, int, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // K0.AbstractC1785e0, androidx.compose.ui.layout.s
    public void Y0(long j10, float f10, Function1 function1) {
        super.Y0(j10, f10, function1);
        L3();
    }

    @Override // I0.InterfaceC1686l
    public int Z(int i10) {
        return L1().l1(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // K0.AbstractC1785e0, androidx.compose.ui.layout.s
    public void a1(long j10, float f10, C6811c c6811c) {
        super.a1(j10, f10, c6811c);
        L3();
    }

    @Override // I0.InterfaceC1686l
    public int l0(int i10) {
        return L1().m1(i10);
    }

    @Override // K0.AbstractC1785e0
    public void m3(InterfaceC6364j0 interfaceC6364j0, C6811c c6811c) throws Throwable {
        p0 p0VarB = N.b(L1());
        C2507c c2507cH0 = L1().H0();
        Object[] objArr = c2507cH0.f23496a;
        int iP = c2507cH0.p();
        for (int i10 = 0; i10 < iP; i10++) {
            J j10 = (J) objArr[i10];
            if (j10.p()) {
                j10.I(interfaceC6364j0, c6811c);
            }
        }
        if (p0VarB.getShowLayoutBounds()) {
            v2(interfaceC6364j0, f10830y0);
        }
    }

    @Override // I0.InterfaceC1686l
    public int q0(int i10) {
        return L1().i1(i10);
    }

    @Override // I0.A
    public androidx.compose.ui.layout.s v0(long j10) {
        if (E2()) {
            U uI2 = I2();
            AbstractC5504s.e(uI2);
            j10 = uI2.h2();
        }
        i1(j10);
        C2507c c2507cI0 = L1().I0();
        Object[] objArr = c2507cI0.f23496a;
        int iP = c2507cI0.p();
        for (int i10 = 0; i10 < iP; i10++) {
            ((J) objArr[i10]).l0().p2(J.g.f10486c);
        }
        t3(L1().n0().mo0measure3p2s80s(this, L1().O(), j10));
        h3();
        return this;
    }

    @Override // K0.AbstractC1785e0
    public void x2() {
        if (I2() == null) {
            M3(new b());
        }
    }

    @Override // K0.T
    public int y1(AbstractC1675a abstractC1675a) {
        U uI2 = I2();
        if (uI2 != null) {
            return uI2.y1(abstractC1675a);
        }
        Integer num = (Integer) C2().L().get(abstractC1675a);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
