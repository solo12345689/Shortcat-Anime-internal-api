package D0;

import Gf.O;
import Gf.P;
import K0.I0;
import K0.J0;
import androidx.compose.ui.e;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import l0.h;
import r0.C6224f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends e.c implements I0, D0.a {

    /* JADX INFO: renamed from: a */
    private D0.a f3517a;

    /* JADX INFO: renamed from: b */
    private D0.b f3518b;

    /* JADX INFO: renamed from: c */
    private c f3519c;

    /* JADX INFO: renamed from: d */
    private final Object f3520d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        long f3521a;

        /* JADX INFO: renamed from: b */
        long f3522b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ Object f3523c;

        /* JADX INFO: renamed from: e */
        int f3525e;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3523c = obj;
            this.f3525e |= Integer.MIN_VALUE;
            return c.this.L0(0L, 0L, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        long f3526a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f3527b;

        /* JADX INFO: renamed from: d */
        int f3529d;

        b(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3527b = obj;
            this.f3529d |= Integer.MIN_VALUE;
            return c.this.R0(0L, this);
        }
    }

    /* JADX INFO: renamed from: D0.c$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0038c extends AbstractC5506u implements InterfaceC5082a {
        C0038c() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public final O invoke() {
            return c.this.F1();
        }
    }

    public c(D0.a aVar, D0.b bVar) {
        this.f3517a = aVar;
        this.f3518b = bVar == null ? new D0.b() : bVar;
        this.f3520d = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    public final O F1() {
        O oF1;
        if (!h.f52340m) {
            c cVarH1 = H1();
            if (cVarH1 != null && (oF1 = cVarH1.F1()) != null) {
                return oF1;
            }
            O oH = this.f3518b.h();
            if (oH != null) {
                return oH;
            }
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        c cVarH12 = H1();
        O oF12 = cVarH12 != null ? cVarH12.F1() : null;
        if (oF12 != null && P.g(oF12)) {
            return oF12;
        }
        O oH2 = this.f3518b.h();
        if (oH2 != null) {
            return oH2;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    private final D0.a G1() {
        if (isAttached()) {
            return H1();
        }
        return null;
    }

    private final void I1() {
        if (this.f3518b.f() == this) {
            this.f3518b.k(null);
        }
    }

    private final void J1(D0.b bVar) {
        I1();
        if (bVar == null) {
            this.f3518b = new D0.b();
        } else if (!AbstractC5504s.c(bVar, this.f3518b)) {
            this.f3518b = bVar;
        }
        if (isAttached()) {
            K1();
        }
    }

    private final void K1() {
        this.f3518b.k(this);
        this.f3518b.j(null);
        this.f3519c = null;
        this.f3518b.i(new C0038c());
        this.f3518b.l(getCoroutineScope());
    }

    @Override // K0.I0
    public Object B() {
        return this.f3520d;
    }

    public final c H1() {
        if (isAttached()) {
            return (c) J0.b(this);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0014  */
    @Override // D0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object L0(long r11, long r13, Zd.e r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof D0.c.a
            if (r0 == 0) goto L14
            r0 = r15
            D0.c$a r0 = (D0.c.a) r0
            int r1 = r0.f3525e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f3525e = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            D0.c$a r0 = new D0.c$a
            r0.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.f3523c
            java.lang.Object r0 = ae.AbstractC2605b.f()
            int r1 = r6.f3525e
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L40
            if (r1 == r2) goto L38
            if (r1 != r7) goto L30
            long r11 = r6.f3521a
            Td.v.b(r15)
            goto L81
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L38:
            long r13 = r6.f3522b
            long r11 = r6.f3521a
            Td.v.b(r15)
            goto L56
        L40:
            Td.v.b(r15)
            D0.a r1 = r10.f3517a
            r6.f3521a = r11
            r6.f3522b = r13
            r6.f3525e = r2
            r2 = r11
            r4 = r13
            java.lang.Object r15 = r1.L0(r2, r4, r6)
            if (r15 != r0) goto L54
            goto L7f
        L54:
            r11 = r2
            r13 = r4
        L56:
            i1.y r15 = (i1.y) r15
            long r8 = r15.o()
            boolean r15 = r10.isAttached()
            if (r15 == 0) goto L68
            D0.a r15 = r10.G1()
        L66:
            r1 = r15
            goto L6b
        L68:
            D0.c r15 = r10.f3519c
            goto L66
        L6b:
            if (r1 == 0) goto L89
            long r2 = i1.y.l(r11, r8)
            long r4 = i1.y.k(r13, r8)
            r6.f3521a = r8
            r6.f3525e = r7
            java.lang.Object r15 = r1.L0(r2, r4, r6)
            if (r15 != r0) goto L80
        L7f:
            return r0
        L80:
            r11 = r8
        L81:
            i1.y r15 = (i1.y) r15
            long r13 = r15.o()
            r8 = r11
            goto L8f
        L89:
            i1.y$a r11 = i1.y.f48587b
            long r13 = r11.a()
        L8f:
            long r11 = i1.y.l(r8, r13)
            i1.y r11 = i1.y.b(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.c.L0(long, long, Zd.e):java.lang.Object");
    }

    public final void L1(D0.a aVar, D0.b bVar) {
        this.f3517a = aVar;
        J1(bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x004d, code lost:
    
        if (r11 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x006f, code lost:
    
        if (r11 != r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0071, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0013  */
    @Override // D0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object R0(long r9, Zd.e r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof D0.c.b
            if (r0 == 0) goto L13
            r0 = r11
            D0.c$b r0 = (D0.c.b) r0
            int r1 = r0.f3529d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3529d = r1
            goto L18
        L13:
            D0.c$b r0 = new D0.c$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f3527b
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f3529d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r9 = r0.f3526a
            Td.v.b(r11)
            goto L72
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            long r9 = r0.f3526a
            Td.v.b(r11)
            goto L50
        L3c:
            Td.v.b(r11)
            D0.a r11 = r8.G1()
            if (r11 == 0) goto L5a
            r0.f3526a = r9
            r0.f3529d = r4
            java.lang.Object r11 = r11.R0(r9, r0)
            if (r11 != r1) goto L50
            goto L71
        L50:
            i1.y r11 = (i1.y) r11
            long r4 = r11.o()
        L56:
            r6 = r4
            r4 = r9
            r9 = r6
            goto L61
        L5a:
            i1.y$a r11 = i1.y.f48587b
            long r4 = r11.a()
            goto L56
        L61:
            D0.a r11 = r8.f3517a
            long r4 = i1.y.k(r4, r9)
            r0.f3526a = r9
            r0.f3529d = r3
            java.lang.Object r11 = r11.R0(r4, r0)
            if (r11 != r1) goto L72
        L71:
            return r1
        L72:
            i1.y r11 = (i1.y) r11
            long r0 = r11.o()
            long r9 = i1.y.l(r9, r0)
            i1.y r9 = i1.y.b(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.c.R0(long, Zd.e):java.lang.Object");
    }

    @Override // D0.a
    public long i1(long j10, int i10) {
        D0.a aVarG1 = G1();
        long jI1 = aVarG1 != null ? aVarG1.i1(j10, i10) : C6224f.f58329b.c();
        return C6224f.q(jI1, this.f3517a.i1(C6224f.p(j10, jI1), i10));
    }

    @Override // androidx.compose.ui.e.c
    public void onAttach() {
        K1();
    }

    @Override // androidx.compose.ui.e.c
    public void onDetach() {
        c cVar = (c) d.b(this);
        this.f3519c = cVar;
        this.f3518b.j(cVar);
        I1();
    }

    @Override // D0.a
    public long y0(long j10, long j11, int i10) {
        long jY0 = this.f3517a.y0(j10, j11, i10);
        D0.a aVarG1 = G1();
        return C6224f.q(jY0, aVarG1 != null ? aVarG1.y0(C6224f.q(j10, jY0), C6224f.p(j11, jY0), i10) : C6224f.f58329b.c());
    }
}
