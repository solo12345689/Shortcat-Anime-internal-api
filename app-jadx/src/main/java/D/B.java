package D;

import F.C1531b;
import F.C1537h;
import F.I;
import F.J;
import Gf.AbstractC1617k;
import Gf.O;
import I0.K;
import I0.L;
import Ud.AbstractC2279u;
import Y.C0;
import Y.U1;
import Y.b2;
import ae.AbstractC2605b;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.d;
import h0.AbstractC4893b;
import i0.AbstractC4993l;
import i1.InterfaceC5011d;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.C5498l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.C5870f;
import w.AbstractC6906j;
import w.AbstractC6908l;
import w.C6903h0;
import w.C6907k;
import w.m0;
import w.s0;
import w.u0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class B implements z.x {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c f3307y = new c(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final h0.v f3308z = AbstractC4893b.b(a.f3333a, b.f3334a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f3309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f3310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s f3311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z f3312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final D.f f3313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C0 f3314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final B.m f3315g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f3316h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final z.x f3317i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f3318j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f3319k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private K f3320l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final L f3321m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C1531b f3322n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final LazyLayoutItemAnimator f3323o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C1537h f3324p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final androidx.compose.foundation.lazy.layout.d f3325q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final v f3326r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final F.B f3327s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C0 f3328t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final C0 f3329u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final C0 f3330v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final C0 f3331w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private C6907k f3332x;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f3333a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(h0.z zVar, B b10) {
            return AbstractC2279u.p(Integer.valueOf(b10.p()), Integer.valueOf(b10.q()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f3334a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final B invoke(List list) {
            return new B(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h0.v a() {
            return B.f3308z;
        }

        private c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements v {
        d() {
        }

        @Override // D.v
        public d.b a(int i10) {
            AbstractC4993l.a aVar = AbstractC4993l.f48495e;
            B b10 = B.this;
            AbstractC4993l abstractC4993lD = aVar.d();
            Function1 function1G = abstractC4993lD != null ? abstractC4993lD.g() : null;
            AbstractC4993l abstractC4993lE = aVar.e(abstractC4993lD);
            try {
                long jL = ((s) b10.f3314f.getValue()).l();
                aVar.l(abstractC4993lD, abstractC4993lE, function1G);
                return B.this.A().e(i10, jL);
            } catch (Throwable th2) {
                aVar.l(abstractC4993lD, abstractC4993lE, function1G);
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f3337b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i10) {
            super(1);
            this.f3337b = i10;
        }

        public final void a(I i10) {
            w wVar = B.this.f3309a;
            int i11 = this.f3337b;
            AbstractC4993l.a aVar = AbstractC4993l.f48495e;
            AbstractC4993l abstractC4993lD = aVar.d();
            aVar.l(abstractC4993lD, aVar.e(abstractC4993lD), abstractC4993lD != null ? abstractC4993lD.g() : null);
            wVar.a(i10, i11);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((I) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f implements L {
        f() {
        }

        @Override // I0.L
        public void d(K k10) {
            B.this.f3320l = k10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f3339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f3340b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f3341c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f3342d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f3344f;

        g(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3342d = obj;
            this.f3344f |= Integer.MIN_VALUE;
            return B.this.b(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class h extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3345a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f3347c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f3348d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i10, int i11, Zd.e eVar) {
            super(2, eVar);
            this.f3347c = i10;
            this.f3348d = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(z.u uVar, Zd.e eVar) {
            return ((h) create(uVar, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return B.this.new h(this.f3347c, this.f3348d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f3345a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Td.v.b(obj);
            B.this.L(this.f3347c, this.f3348d, true);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class i extends AbstractC5506u implements Function1 {
        i() {
            super(1);
        }

        public final Float a(float f10) {
            return Float.valueOf(-B.this.G(-f10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class j extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3350a;

        j(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return B.this.new j(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((j) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f3350a;
            if (i10 == 0) {
                Td.v.b(obj);
                C6907k c6907k = B.this.f3332x;
                Float fC = kotlin.coroutines.jvm.internal.b.c(0.0f);
                C6903h0 c6903h0H = AbstractC6906j.h(0.0f, 400.0f, kotlin.coroutines.jvm.internal.b.c(0.5f), 1, null);
                this.f3350a = 1;
                if (m0.j(c6907k, fC, c6903h0H, true, null, this, 8, null) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class k extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3352a;

        k(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return B.this.new k(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((k) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f3352a;
            if (i10 == 0) {
                Td.v.b(obj);
                C6907k c6907k = B.this.f3332x;
                Float fC = kotlin.coroutines.jvm.internal.b.c(0.0f);
                C6903h0 c6903h0H = AbstractC6906j.h(0.0f, 400.0f, kotlin.coroutines.jvm.internal.b.c(0.5f), 1, null);
                this.f3352a = 1;
                if (m0.j(c6907k, fC, c6903h0H, true, null, this, 8, null) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            return Td.L.f17438a;
        }
    }

    public B(int i10, int i11, w wVar) {
        this.f3309a = wVar;
        z zVar = new z(i10, i11);
        this.f3312d = zVar;
        this.f3313e = new D.f(this);
        this.f3314f = U1.h(C.f3355b, U1.j());
        this.f3315g = B.l.a();
        this.f3317i = z.y.a(new i());
        this.f3319k = true;
        this.f3321m = new f();
        this.f3322n = new C1531b();
        this.f3323o = new LazyLayoutItemAnimator();
        this.f3324p = new C1537h();
        this.f3325q = new androidx.compose.foundation.lazy.layout.d(wVar.b(), new e(i10));
        this.f3326r = new d();
        this.f3327s = new F.B();
        zVar.b();
        this.f3328t = J.c(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.f3329u = b2.e(bool, null, 2, null);
        this.f3330v = b2.e(bool, null, 2, null);
        this.f3331w = J.c(null, 1, null);
        s0 s0VarF = u0.f(C5498l.f52289a);
        Float fValueOf = Float.valueOf(0.0f);
        this.f3332x = AbstractC6908l.d(s0VarF, fValueOf, fValueOf, 0L, 0L, false, 56, null);
    }

    private final void F(float f10, q qVar) {
        if (this.f3319k) {
            this.f3309a.d(this.f3326r, f10, qVar);
        }
    }

    public static /* synthetic */ Object I(B b10, int i10, int i11, Zd.e eVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return b10.H(i10, i11, eVar);
    }

    private void J(boolean z10) {
        this.f3330v.setValue(Boolean.valueOf(z10));
    }

    private void K(boolean z10) {
        this.f3329u.setValue(Boolean.valueOf(z10));
    }

    private final void M(float f10, InterfaceC5011d interfaceC5011d, O o10) {
        if (f10 <= interfaceC5011d.l1(C.f3354a)) {
            return;
        }
        AbstractC4993l.a aVar = AbstractC4993l.f48495e;
        AbstractC4993l abstractC4993lD = aVar.d();
        Function1 function1G = abstractC4993lD != null ? abstractC4993lD.g() : null;
        AbstractC4993l abstractC4993lE = aVar.e(abstractC4993lD);
        try {
            float fFloatValue = ((Number) this.f3332x.getValue()).floatValue();
            if (this.f3332x.r()) {
                this.f3332x = AbstractC6908l.g(this.f3332x, fFloatValue - f10, 0.0f, 0L, 0L, false, 30, null);
                AbstractC1617k.d(o10, null, null, new j(null), 3, null);
            } else {
                this.f3332x = new C6907k(u0.f(C5498l.f52289a), Float.valueOf(-f10), null, 0L, 0L, false, 60, null);
                AbstractC1617k.d(o10, null, null, new k(null), 3, null);
            }
            aVar.l(abstractC4993lD, abstractC4993lE, function1G);
        } catch (Throwable th2) {
            aVar.l(abstractC4993lD, abstractC4993lE, function1G);
            throw th2;
        }
    }

    public static /* synthetic */ void m(B b10, s sVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        b10.l(sVar, z10, z11);
    }

    public final androidx.compose.foundation.lazy.layout.d A() {
        return this.f3325q;
    }

    public final K B() {
        return this.f3320l;
    }

    public final L C() {
        return this.f3321m;
    }

    public final float D() {
        return ((Number) this.f3332x.getValue()).floatValue();
    }

    public final float E() {
        return this.f3316h;
    }

    public final float G(float f10) {
        if ((f10 < 0.0f && !e()) || (f10 > 0.0f && !c())) {
            return 0.0f;
        }
        if (Math.abs(this.f3316h) > 0.5f) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.f3316h).toString());
        }
        float f11 = this.f3316h + f10;
        this.f3316h = f11;
        if (Math.abs(f11) > 0.5f) {
            s sVar = (s) this.f3314f.getValue();
            float f12 = this.f3316h;
            int iRound = Math.round(f12);
            s sVar2 = this.f3311c;
            boolean zS = sVar.s(iRound, !this.f3310b);
            if (zS && sVar2 != null) {
                zS = sVar2.s(iRound, true);
            }
            if (zS) {
                l(sVar, this.f3310b, true);
                J.d(this.f3331w);
                F(f12 - this.f3316h, sVar);
            } else {
                K k10 = this.f3320l;
                if (k10 != null) {
                    k10.i();
                }
                F(f12 - this.f3316h, u());
            }
        }
        if (Math.abs(this.f3316h) <= 0.5f) {
            return f10;
        }
        float f13 = f10 - this.f3316h;
        this.f3316h = 0.0f;
        return f13;
    }

    public final Object H(int i10, int i11, Zd.e eVar) {
        Object objD = z.x.d(this, null, new h(i10, i11, null), eVar, 1, null);
        return objD == AbstractC2605b.f() ? objD : Td.L.f17438a;
    }

    public final void L(int i10, int i11, boolean z10) {
        if (this.f3312d.a() != i10 || this.f3312d.c() != i11) {
            this.f3323o.n();
        }
        this.f3312d.d(i10, i11);
        if (!z10) {
            J.d(this.f3328t);
            return;
        }
        K k10 = this.f3320l;
        if (k10 != null) {
            k10.i();
        }
    }

    public final int N(m mVar, int i10) {
        return this.f3312d.j(mVar, i10);
    }

    @Override // z.x
    public boolean a() {
        return this.f3317i.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r8.b(r6, r7, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // z.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(x.EnumC6992L r6, kotlin.jvm.functions.Function2 r7, Zd.e r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof D.B.g
            if (r0 == 0) goto L13
            r0 = r8
            D.B$g r0 = (D.B.g) r0
            int r1 = r0.f3344f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3344f = r1
            goto L18
        L13:
            D.B$g r0 = new D.B$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f3342d
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f3344f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            Td.v.b(r8)
            goto L6c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f3341c
            r7 = r6
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            java.lang.Object r6 = r0.f3340b
            x.L r6 = (x.EnumC6992L) r6
            java.lang.Object r2 = r0.f3339a
            D.B r2 = (D.B) r2
            Td.v.b(r8)
            goto L5a
        L45:
            Td.v.b(r8)
            F.b r8 = r5.f3322n
            r0.f3339a = r5
            r0.f3340b = r6
            r0.f3341c = r7
            r0.f3344f = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L59
            goto L6b
        L59:
            r2 = r5
        L5a:
            z.x r8 = r2.f3317i
            r2 = 0
            r0.f3339a = r2
            r0.f3340b = r2
            r0.f3341c = r2
            r0.f3344f = r3
            java.lang.Object r6 = r8.b(r6, r7, r0)
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            Td.L r6 = Td.L.f17438a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: D.B.b(x.L, kotlin.jvm.functions.Function2, Zd.e):java.lang.Object");
    }

    @Override // z.x
    public boolean c() {
        return ((Boolean) this.f3330v.getValue()).booleanValue();
    }

    @Override // z.x
    public boolean e() {
        return ((Boolean) this.f3329u.getValue()).booleanValue();
    }

    @Override // z.x
    public float f(float f10) {
        return this.f3317i.f(f10);
    }

    public final void l(s sVar, boolean z10, boolean z11) {
        if (!z10 && this.f3310b) {
            this.f3311c = sVar;
            return;
        }
        if (z10) {
            this.f3310b = true;
        }
        J(sVar.j());
        K(sVar.k());
        this.f3316h -= sVar.m();
        this.f3314f.setValue(sVar);
        if (z11) {
            this.f3312d.i(sVar.q());
        } else {
            this.f3312d.h(sVar);
            if (this.f3319k) {
                this.f3309a.c(this.f3326r, sVar);
            }
        }
        if (z10) {
            M(sVar.r(), sVar.o(), sVar.n());
        }
        this.f3318j++;
    }

    public final C1531b n() {
        return this.f3322n;
    }

    public final C1537h o() {
        return this.f3324p;
    }

    public final int p() {
        return this.f3312d.a();
    }

    public final int q() {
        return this.f3312d.c();
    }

    public final boolean r() {
        return this.f3310b;
    }

    public final B.m s() {
        return this.f3315g;
    }

    public final LazyLayoutItemAnimator t() {
        return this.f3323o;
    }

    public final q u() {
        return (q) this.f3314f.getValue();
    }

    public final C0 v() {
        return this.f3328t;
    }

    public final C5870f w() {
        return (C5870f) this.f3312d.b().getValue();
    }

    public final F.B x() {
        return this.f3327s;
    }

    public final C0 y() {
        return this.f3331w;
    }

    public final s z() {
        return this.f3311c;
    }

    public B(int i10, int i11) {
        this(i10, i11, x.b(0, 1, null));
    }
}
