package x;

import Gf.AbstractC1617k;
import I0.AbstractC1691q;
import I0.InterfaceC1690p;
import K0.A0;
import K0.AbstractC1796k;
import K0.AbstractC1797k0;
import K0.AbstractC1798l;
import K0.InterfaceC1795j0;
import K0.InterfaceC1806t;
import K0.InterfaceC1808v;
import Y.C0;
import Y.U1;
import Y.h2;
import android.view.View;
import androidx.compose.ui.e;
import i1.AbstractC5026s;
import i1.C5015h;
import i1.C5018k;
import i1.C5025r;
import i1.InterfaceC5011d;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6224f;
import u0.InterfaceC6708c;

/* JADX INFO: renamed from: x.J */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6990J extends e.c implements InterfaceC1808v, InterfaceC1806t, A0, InterfaceC1795j0 {

    /* JADX INFO: renamed from: a */
    private Function1 f63243a;

    /* JADX INFO: renamed from: b */
    private Function1 f63244b;

    /* JADX INFO: renamed from: c */
    private Function1 f63245c;

    /* JADX INFO: renamed from: d */
    private float f63246d;

    /* JADX INFO: renamed from: e */
    private boolean f63247e;

    /* JADX INFO: renamed from: f */
    private long f63248f;

    /* JADX INFO: renamed from: g */
    private float f63249g;

    /* JADX INFO: renamed from: h */
    private float f63250h;

    /* JADX INFO: renamed from: i */
    private boolean f63251i;

    /* JADX INFO: renamed from: j */
    private InterfaceC7002W f63252j;

    /* JADX INFO: renamed from: k */
    private View f63253k;

    /* JADX INFO: renamed from: l */
    private InterfaceC5011d f63254l;

    /* JADX INFO: renamed from: m */
    private InterfaceC7001V f63255m;

    /* JADX INFO: renamed from: n */
    private final C0 f63256n;

    /* JADX INFO: renamed from: o */
    private h2 f63257o;

    /* JADX INFO: renamed from: p */
    private long f63258p;

    /* JADX INFO: renamed from: q */
    private C5025r f63259q;

    /* JADX INFO: renamed from: r */
    private If.g f63260r;

    /* JADX INFO: renamed from: x.J$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {
        a() {
            super(0);
        }

        public final long a() {
            InterfaceC1690p interfaceC1690pO0 = C6990J.this.o0();
            return interfaceC1690pO0 != null ? AbstractC1691q.e(interfaceC1690pO0) : C6224f.f58329b.b();
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            return C6224f.d(a());
        }
    }

    /* JADX INFO: renamed from: x.J$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {
        b() {
            super(0);
        }

        public final long a() {
            return C6990J.this.f63258p;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            return C6224f.d(a());
        }
    }

    /* JADX INFO: renamed from: x.J$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements InterfaceC5082a {
        d() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m976invoke();
            return Td.L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m976invoke() {
            C6990J.this.N1();
        }
    }

    public /* synthetic */ C6990J(Function1 function1, Function1 function12, Function1 function13, float f10, boolean z10, long j10, float f11, float f12, boolean z11, InterfaceC7002W interfaceC7002W, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, function12, function13, f10, z10, j10, f11, f12, z11, interfaceC7002W);
    }

    private final long J1() {
        if (this.f63257o == null) {
            this.f63257o = U1.d(new a());
        }
        h2 h2Var = this.f63257o;
        return h2Var != null ? ((C6224f) h2Var.getValue()).u() : C6224f.f58329b.b();
    }

    private final void K1() {
        InterfaceC7001V interfaceC7001V = this.f63255m;
        if (interfaceC7001V != null) {
            interfaceC7001V.dismiss();
        }
        View viewA = this.f63253k;
        if (viewA == null) {
            viewA = AbstractC1798l.a(this);
        }
        View view = viewA;
        this.f63253k = view;
        InterfaceC5011d interfaceC5011dJ = this.f63254l;
        if (interfaceC5011dJ == null) {
            interfaceC5011dJ = AbstractC1796k.j(this);
        }
        InterfaceC5011d interfaceC5011d = interfaceC5011dJ;
        this.f63254l = interfaceC5011d;
        this.f63255m = this.f63252j.a(view, this.f63247e, this.f63248f, this.f63249g, this.f63250h, this.f63251i, interfaceC5011d, this.f63246d);
        O1();
    }

    private final void L1(InterfaceC1690p interfaceC1690p) {
        this.f63256n.setValue(interfaceC1690p);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N1() {
        /*
            r8 = this;
            i1.d r0 = r8.f63254l
            if (r0 != 0) goto La
            i1.d r0 = K0.AbstractC1796k.j(r8)
            r8.f63254l = r0
        La:
            kotlin.jvm.functions.Function1 r1 = r8.f63243a
            java.lang.Object r1 = r1.invoke(r0)
            r0.f r1 = (r0.C6224f) r1
            long r1 = r1.u()
            boolean r3 = r0.AbstractC6225g.b(r1)
            if (r3 == 0) goto L7b
            long r3 = r8.J1()
            boolean r3 = r0.AbstractC6225g.b(r3)
            if (r3 == 0) goto L7b
            long r3 = r8.J1()
            long r1 = r0.C6224f.q(r3, r1)
            r8.f63258p = r1
            kotlin.jvm.functions.Function1 r1 = r8.f63244b
            if (r1 == 0) goto L5e
            java.lang.Object r0 = r1.invoke(r0)
            r0.f r0 = (r0.C6224f) r0
            long r0 = r0.u()
            r0.f r0 = r0.C6224f.d(r0)
            long r1 = r0.u()
            boolean r1 = r0.AbstractC6225g.b(r1)
            if (r1 == 0) goto L4d
            goto L4e
        L4d:
            r0 = 0
        L4e:
            if (r0 == 0) goto L5e
            long r0 = r0.u()
            long r2 = r8.J1()
            long r0 = r0.C6224f.q(r2, r0)
        L5c:
            r5 = r0
            goto L65
        L5e:
            r0.f$a r0 = r0.C6224f.f58329b
            long r0 = r0.b()
            goto L5c
        L65:
            x.V r0 = r8.f63255m
            if (r0 != 0) goto L6c
            r8.K1()
        L6c:
            x.V r2 = r8.f63255m
            if (r2 == 0) goto L77
            long r3 = r8.f63258p
            float r7 = r8.f63246d
            r2.b(r3, r5, r7)
        L77:
            r8.O1()
            return
        L7b:
            r0.f$a r0 = r0.C6224f.f58329b
            long r0 = r0.b()
            r8.f63258p = r0
            x.V r0 = r8.f63255m
            if (r0 == 0) goto L8a
            r0.dismiss()
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C6990J.N1():void");
    }

    private final void O1() {
        InterfaceC5011d interfaceC5011d;
        InterfaceC7001V interfaceC7001V = this.f63255m;
        if (interfaceC7001V == null || (interfaceC5011d = this.f63254l) == null || C5025r.d(interfaceC7001V.a(), this.f63259q)) {
            return;
        }
        Function1 function1 = this.f63245c;
        if (function1 != null) {
            function1.invoke(C5018k.c(interfaceC5011d.Q(AbstractC5026s.d(interfaceC7001V.a()))));
        }
        this.f63259q = C5025r.b(interfaceC7001V.a());
    }

    public final InterfaceC1690p o0() {
        return (InterfaceC1690p) this.f63256n.getValue();
    }

    public final void M1(Function1 function1, Function1 function12, float f10, boolean z10, long j10, float f11, float f12, boolean z11, Function1 function13, InterfaceC7002W interfaceC7002W) {
        float f13 = this.f63246d;
        long j11 = this.f63248f;
        float f14 = this.f63249g;
        boolean z12 = this.f63247e;
        float f15 = this.f63250h;
        boolean z13 = this.f63251i;
        InterfaceC7002W interfaceC7002W2 = this.f63252j;
        View view = this.f63253k;
        InterfaceC5011d interfaceC5011d = this.f63254l;
        this.f63243a = function1;
        this.f63244b = function12;
        this.f63246d = f10;
        this.f63247e = z10;
        this.f63248f = j10;
        this.f63249g = f11;
        this.f63250h = f12;
        this.f63251i = z11;
        this.f63245c = function13;
        this.f63252j = interfaceC7002W;
        View viewA = AbstractC1798l.a(this);
        InterfaceC5011d interfaceC5011dJ = AbstractC1796k.j(this);
        if (this.f63255m != null && ((!AbstractC6991K.a(f10, f13) && !interfaceC7002W.b()) || !C5018k.f(j10, j11) || !C5015h.q(f11, f14) || !C5015h.q(f12, f15) || z10 != z12 || z11 != z13 || !AbstractC5504s.c(interfaceC7002W, interfaceC7002W2) || !AbstractC5504s.c(viewA, view) || !AbstractC5504s.c(interfaceC5011dJ, interfaceC5011d))) {
            K1();
        }
        N1();
    }

    @Override // K0.A0
    public void Y(R0.C c10) {
        c10.b(AbstractC6991K.b(), new b());
    }

    @Override // K0.InterfaceC1806t
    public void draw(InterfaceC6708c interfaceC6708c) {
        interfaceC6708c.B1();
        If.g gVar = this.f63260r;
        if (gVar != null) {
            If.k.b(gVar.d(Td.L.f17438a));
        }
    }

    @Override // androidx.compose.ui.e.c
    public void onAttach() {
        q0();
        this.f63260r = If.j.b(0, null, null, 7, null);
        AbstractC1617k.d(getCoroutineScope(), null, null, new c(null), 3, null);
    }

    @Override // androidx.compose.ui.e.c
    public void onDetach() {
        InterfaceC7001V interfaceC7001V = this.f63255m;
        if (interfaceC7001V != null) {
            interfaceC7001V.dismiss();
        }
        this.f63255m = null;
    }

    @Override // K0.InterfaceC1808v
    public void p(InterfaceC1690p interfaceC1690p) {
        L1(interfaceC1690p);
    }

    @Override // K0.InterfaceC1795j0
    public void q0() {
        AbstractC1797k0.a(this, new d());
    }

    private C6990J(Function1 function1, Function1 function12, Function1 function13, float f10, boolean z10, long j10, float f11, float f12, boolean z11, InterfaceC7002W interfaceC7002W) {
        this.f63243a = function1;
        this.f63244b = function12;
        this.f63245c = function13;
        this.f63246d = f10;
        this.f63247e = z10;
        this.f63248f = j10;
        this.f63249g = f11;
        this.f63250h = f12;
        this.f63251i = z11;
        this.f63252j = interfaceC7002W;
        this.f63256n = U1.h(null, U1.j());
        this.f63258p = C6224f.f58329b.b();
    }

    /* JADX INFO: renamed from: x.J$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f63263a;

        c(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return C6990J.this.new c(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((c) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x0042, code lost:
        
            if (Y.AbstractC2452v0.b(r5, r4) == r0) goto L44;
         */
        /* JADX WARN: Path cross not found for [B:37:0x0029, B:40:0x0032], limit reached: 23 */
        /* JADX WARN: Path cross not found for [B:40:0x0032, B:37:0x0029], limit reached: 23 */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x003a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0038 -> B:35:0x0021). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0042 -> B:45:0x0045). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = ae.AbstractC2605b.f()
                int r1 = r4.f63263a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                Td.v.b(r5)
                goto L45
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                Td.v.b(r5)
                goto L32
            L1e:
                Td.v.b(r5)
            L21:
                x.J r5 = x.C6990J.this
                If.g r5 = x.C6990J.E1(r5)
                if (r5 == 0) goto L32
                r4.f63263a = r3
                java.lang.Object r5 = r5.a(r4)
                if (r5 != r0) goto L32
                goto L44
            L32:
                x.J r5 = x.C6990J.this
                x.V r5 = x.C6990J.G1(r5)
                if (r5 == 0) goto L21
                x.J$c$a r5 = x.C6990J.c.a.f63265a
                r4.f63263a = r2
                java.lang.Object r5 = Y.AbstractC2452v0.b(r5, r4)
                if (r5 != r0) goto L45
            L44:
                return r0
            L45:
                x.J r5 = x.C6990J.this
                x.V r5 = x.C6990J.G1(r5)
                if (r5 == 0) goto L21
                r5.c()
                goto L21
            */
            throw new UnsupportedOperationException("Method not decompiled: x.C6990J.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: x.J$c$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a */
            public static final a f63265a = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Number) obj).longValue());
                return Td.L.f17438a;
            }

            public final void a(long j10) {
            }
        }
    }
}
