package E;

import F.C1531b;
import F.C1537h;
import I0.L;
import Ud.AbstractC2279u;
import Y.C0;
import Y.U1;
import Y.b2;
import ae.AbstractC2605b;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import h0.AbstractC4893b;
import i0.AbstractC4993l;
import i1.C5009b;
import java.util.ArrayList;
import java.util.List;
import ke.AbstractC5466a;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.C5870f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class I implements z.x {

    /* JADX INFO: renamed from: v */
    public static final c f3821v = new c(null);

    /* JADX INFO: renamed from: w */
    private static final h0.v f3822w = AbstractC4893b.b(a.f3844a, b.f3845a);

    /* JADX INFO: renamed from: a */
    private final A f3823a;

    /* JADX INFO: renamed from: b */
    private final D f3824b;

    /* JADX INFO: renamed from: c */
    private final C0 f3825c;

    /* JADX INFO: renamed from: d */
    private final B.m f3826d;

    /* JADX INFO: renamed from: e */
    private float f3827e;

    /* JADX INFO: renamed from: f */
    private final z.x f3828f;

    /* JADX INFO: renamed from: g */
    private int f3829g;

    /* JADX INFO: renamed from: h */
    private boolean f3830h;

    /* JADX INFO: renamed from: i */
    private I0.K f3831i;

    /* JADX INFO: renamed from: j */
    private final L f3832j;

    /* JADX INFO: renamed from: k */
    private final C1531b f3833k;

    /* JADX INFO: renamed from: l */
    private final LazyLayoutItemAnimator f3834l;

    /* JADX INFO: renamed from: m */
    private final C1537h f3835m;

    /* JADX INFO: renamed from: n */
    private final androidx.compose.foundation.lazy.layout.d f3836n;

    /* JADX INFO: renamed from: o */
    private final z f3837o;

    /* JADX INFO: renamed from: p */
    private final C1284e f3838p;

    /* JADX INFO: renamed from: q */
    private final F.B f3839q;

    /* JADX INFO: renamed from: r */
    private final C0 f3840r;

    /* JADX INFO: renamed from: s */
    private final C0 f3841s;

    /* JADX INFO: renamed from: t */
    private final C0 f3842t;

    /* JADX INFO: renamed from: u */
    private final C0 f3843u;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        public static final a f3844a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a */
        public final List invoke(h0.z zVar, I i10) {
            return AbstractC2279u.p(Integer.valueOf(i10.o()), Integer.valueOf(i10.p()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final b f3845a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final I invoke(List list) {
            return new I(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h0.v a() {
            return I.f3822w;
        }

        private c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements z {
        d() {
        }

        @Override // E.z
        public List a(int i10) {
            ArrayList arrayList = new ArrayList();
            AbstractC4993l.a aVar = AbstractC4993l.f48495e;
            I i11 = I.this;
            AbstractC4993l abstractC4993lD = aVar.d();
            Function1 function1G = abstractC4993lD != null ? abstractC4993lD.g() : null;
            AbstractC4993l abstractC4993lE = aVar.e(abstractC4993lD);
            try {
                List list = (List) ((u) i11.f3825c.getValue()).o().invoke(Integer.valueOf(i10));
                int size = list.size();
                for (int i12 = 0; i12 < size; i12++) {
                    Pair pair = (Pair) list.get(i12);
                    arrayList.add(i11.x().e(((Number) pair.c()).intValue(), ((C5009b) pair.d()).r()));
                }
                Td.L l10 = Td.L.f17438a;
                aVar.l(abstractC4993lD, abstractC4993lE, function1G);
                return arrayList;
            } catch (Throwable th2) {
                aVar.l(abstractC4993lD, abstractC4993lE, function1G);
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f3848b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i10) {
            super(1);
            this.f3848b = i10;
        }

        public final void a(F.I i10) {
            A a10 = I.this.f3823a;
            int i11 = this.f3848b;
            AbstractC4993l.a aVar = AbstractC4993l.f48495e;
            AbstractC4993l abstractC4993lD = aVar.d();
            aVar.l(abstractC4993lD, aVar.e(abstractC4993lD), abstractC4993lD != null ? abstractC4993lD.g() : null);
            a10.a(i10, i11);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((F.I) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f implements L {
        f() {
        }

        @Override // I0.L
        public void d(I0.K k10) {
            I.this.f3831i = k10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        Object f3850a;

        /* JADX INFO: renamed from: b */
        Object f3851b;

        /* JADX INFO: renamed from: c */
        Object f3852c;

        /* JADX INFO: renamed from: d */
        /* synthetic */ Object f3853d;

        /* JADX INFO: renamed from: f */
        int f3855f;

        g(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3853d = obj;
            this.f3855f |= Integer.MIN_VALUE;
            return I.this.b(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class h extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f3856a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f3858c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f3859d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i10, int i11, Zd.e eVar) {
            super(2, eVar);
            this.f3858c = i10;
            this.f3859d = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a */
        public final Object invoke(z.u uVar, Zd.e eVar) {
            return ((h) create(uVar, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return I.this.new h(this.f3858c, this.f3859d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f3856a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Td.v.b(obj);
            I.this.I(this.f3858c, this.f3859d, true);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class i extends AbstractC5506u implements Function1 {
        i() {
            super(1);
        }

        public final Float a(float f10) {
            return Float.valueOf(-I.this.D(-f10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    public I(int i10, int i11, A a10) {
        this.f3823a = a10;
        D d10 = new D(i10, i11);
        this.f3824b = d10;
        this.f3825c = U1.h(J.f3861a, U1.j());
        this.f3826d = B.l.a();
        this.f3828f = z.y.a(new i());
        this.f3830h = true;
        this.f3832j = new f();
        this.f3833k = new C1531b();
        this.f3834l = new LazyLayoutItemAnimator();
        this.f3835m = new C1537h();
        this.f3836n = new androidx.compose.foundation.lazy.layout.d(a10.b(), new e(i10));
        this.f3837o = new d();
        this.f3838p = new C1284e(this);
        this.f3839q = new F.B();
        d10.b();
        this.f3840r = F.J.c(null, 1, null);
        this.f3841s = F.J.c(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.f3842t = b2.e(bool, null, 2, null);
        this.f3843u = b2.e(bool, null, 2, null);
    }

    private final void C(float f10, s sVar) {
        if (this.f3830h) {
            this.f3823a.c(this.f3837o, f10, sVar);
        }
    }

    public static /* synthetic */ Object F(I i10, int i11, int i12, Zd.e eVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return i10.E(i11, i12, eVar);
    }

    private void G(boolean z10) {
        this.f3843u.setValue(Boolean.valueOf(z10));
    }

    private void H(boolean z10) {
        this.f3842t.setValue(Boolean.valueOf(z10));
    }

    public static /* synthetic */ void l(I i10, u uVar, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        i10.k(uVar, z10);
    }

    public final float A() {
        return this.f3827e;
    }

    public final int B() {
        return ((u) this.f3825c.getValue()).p();
    }

    public final float D(float f10) {
        if ((f10 < 0.0f && !e()) || (f10 > 0.0f && !c())) {
            return 0.0f;
        }
        if (Math.abs(this.f3827e) > 0.5f) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.f3827e).toString());
        }
        float f11 = this.f3827e + f10;
        this.f3827e = f11;
        if (Math.abs(f11) > 0.5f) {
            u uVar = (u) this.f3825c.getValue();
            float f12 = this.f3827e;
            if (uVar.q(AbstractC5466a.d(f12))) {
                k(uVar, true);
                F.J.d(this.f3840r);
                C(f12 - this.f3827e, uVar);
            } else {
                I0.K k10 = this.f3831i;
                if (k10 != null) {
                    k10.i();
                }
                C(f12 - this.f3827e, s());
            }
        }
        if (Math.abs(this.f3827e) <= 0.5f) {
            return f10;
        }
        float f13 = f10 - this.f3827e;
        this.f3827e = 0.0f;
        return f13;
    }

    public final Object E(int i10, int i11, Zd.e eVar) {
        Object objD = z.x.d(this, null, new h(i10, i11, null), eVar, 1, null);
        return objD == AbstractC2605b.f() ? objD : Td.L.f17438a;
    }

    public final void I(int i10, int i11, boolean z10) {
        if (this.f3824b.a() != i10 || this.f3824b.c() != i11) {
            this.f3834l.n();
        }
        this.f3824b.d(i10, i11);
        if (!z10) {
            F.J.d(this.f3841s);
            return;
        }
        I0.K k10 = this.f3831i;
        if (k10 != null) {
            k10.i();
        }
    }

    public final int J(l lVar, int i10) {
        return this.f3824b.j(lVar, i10);
    }

    @Override // z.x
    public boolean a() {
        return this.f3828f.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0069, code lost:
    
        if (r8.b(r6, r7, r0) == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0013  */
    @Override // z.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(x.EnumC6992L r6, kotlin.jvm.functions.Function2 r7, Zd.e r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof E.I.g
            if (r0 == 0) goto L13
            r0 = r8
            E.I$g r0 = (E.I.g) r0
            int r1 = r0.f3855f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3855f = r1
            goto L18
        L13:
            E.I$g r0 = new E.I$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f3853d
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f3855f
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
            java.lang.Object r6 = r0.f3852c
            r7 = r6
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            java.lang.Object r6 = r0.f3851b
            x.L r6 = (x.EnumC6992L) r6
            java.lang.Object r2 = r0.f3850a
            E.I r2 = (E.I) r2
            Td.v.b(r8)
            goto L5a
        L45:
            Td.v.b(r8)
            F.b r8 = r5.f3833k
            r0.f3850a = r5
            r0.f3851b = r6
            r0.f3852c = r7
            r0.f3855f = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L59
            goto L6b
        L59:
            r2 = r5
        L5a:
            z.x r8 = r2.f3828f
            r2 = 0
            r0.f3850a = r2
            r0.f3851b = r2
            r0.f3852c = r2
            r0.f3855f = r3
            java.lang.Object r6 = r8.b(r6, r7, r0)
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            Td.L r6 = Td.L.f17438a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: E.I.b(x.L, kotlin.jvm.functions.Function2, Zd.e):java.lang.Object");
    }

    @Override // z.x
    public boolean c() {
        return ((Boolean) this.f3843u.getValue()).booleanValue();
    }

    @Override // z.x
    public boolean e() {
        return ((Boolean) this.f3842t.getValue()).booleanValue();
    }

    @Override // z.x
    public float f(float f10) {
        return this.f3828f.f(f10);
    }

    public final void k(u uVar, boolean z10) {
        this.f3827e -= uVar.l();
        this.f3825c.setValue(uVar);
        G(uVar.j());
        H(uVar.k());
        if (z10) {
            this.f3824b.i(uVar.n());
        } else {
            this.f3824b.h(uVar);
            if (this.f3830h) {
                this.f3823a.d(this.f3837o, uVar);
            }
        }
        this.f3829g++;
    }

    public final C1531b m() {
        return this.f3833k;
    }

    public final C1537h n() {
        return this.f3835m;
    }

    public final int o() {
        return this.f3824b.a();
    }

    public final int p() {
        return this.f3824b.c();
    }

    public final B.m q() {
        return this.f3826d;
    }

    public final LazyLayoutItemAnimator r() {
        return this.f3834l;
    }

    public final s s() {
        return (s) this.f3825c.getValue();
    }

    public final C0 t() {
        return this.f3841s;
    }

    public final C5870f u() {
        return (C5870f) this.f3824b.b().getValue();
    }

    public final F.B v() {
        return this.f3839q;
    }

    public final C0 w() {
        return this.f3840r;
    }

    public final androidx.compose.foundation.lazy.layout.d x() {
        return this.f3836n;
    }

    public final I0.K y() {
        return this.f3831i;
    }

    public final L z() {
        return this.f3832j;
    }

    public I(int i10, int i11) {
        this(i10, i11, B.b(0, 1, null));
    }
}
