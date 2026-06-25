package v0;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import i1.AbstractC5026s;
import i1.C5021n;
import i1.C5025r;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.AbstractC6219a;
import r0.AbstractC6229k;
import r0.C6224f;
import r0.C6226h;
import r0.C6230l;
import s0.AbstractC6362i1;
import s0.AbstractC6384q0;
import s0.C6385r0;
import s0.InterfaceC6364j0;
import s0.InterfaceC6368k1;
import s0.InterfaceC6374m1;
import s0.u1;
import u0.AbstractC6710e;
import u0.C6706a;
import u0.InterfaceC6709d;
import u0.InterfaceC6711f;

/* JADX INFO: renamed from: v0.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6811c {

    /* JADX INFO: renamed from: A */
    private static final InterfaceC6790F f61792A;

    /* JADX INFO: renamed from: y */
    public static final a f61793y = new a(null);

    /* JADX INFO: renamed from: z */
    private static final boolean f61794z;

    /* JADX INFO: renamed from: a */
    private final InterfaceC6812d f61795a;

    /* JADX INFO: renamed from: f */
    private Outline f61800f;

    /* JADX INFO: renamed from: h */
    private long f61802h;

    /* JADX INFO: renamed from: i */
    private long f61803i;

    /* JADX INFO: renamed from: j */
    private float f61804j;

    /* JADX INFO: renamed from: k */
    private AbstractC6362i1 f61805k;

    /* JADX INFO: renamed from: l */
    private InterfaceC6374m1 f61806l;

    /* JADX INFO: renamed from: m */
    private InterfaceC6374m1 f61807m;

    /* JADX INFO: renamed from: n */
    private boolean f61808n;

    /* JADX INFO: renamed from: o */
    private C6706a f61809o;

    /* JADX INFO: renamed from: p */
    private InterfaceC6368k1 f61810p;

    /* JADX INFO: renamed from: q */
    private int f61811q;

    /* JADX INFO: renamed from: r */
    private final C6809a f61812r;

    /* JADX INFO: renamed from: s */
    private boolean f61813s;

    /* JADX INFO: renamed from: t */
    private long f61814t;

    /* JADX INFO: renamed from: u */
    private long f61815u;

    /* JADX INFO: renamed from: v */
    private long f61816v;

    /* JADX INFO: renamed from: w */
    private boolean f61817w;

    /* JADX INFO: renamed from: x */
    private RectF f61818x;

    /* JADX INFO: renamed from: b */
    private InterfaceC5011d f61796b = AbstractC6710e.a();

    /* JADX INFO: renamed from: c */
    private EnumC5027t f61797c = EnumC5027t.f48573a;

    /* JADX INFO: renamed from: d */
    private Function1 f61798d = C0926c.f61820a;

    /* JADX INFO: renamed from: e */
    private final Function1 f61799e = new b();

    /* JADX INFO: renamed from: g */
    private boolean f61801g = true;

    /* JADX INFO: renamed from: v0.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: v0.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC6711f) obj);
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC6711f interfaceC6711f) {
            InterfaceC6374m1 interfaceC6374m1 = C6811c.this.f61806l;
            if (!C6811c.this.f61808n || !C6811c.this.l() || interfaceC6374m1 == null) {
                C6811c.this.i(interfaceC6711f);
                return;
            }
            C6811c c6811c = C6811c.this;
            int iB = AbstractC6384q0.f58976a.b();
            InterfaceC6709d interfaceC6709dN1 = interfaceC6711f.n1();
            long jF = interfaceC6709dN1.f();
            interfaceC6709dN1.b().p();
            try {
                interfaceC6709dN1.a().b(interfaceC6374m1, iB);
                c6811c.i(interfaceC6711f);
            } finally {
                interfaceC6709dN1.b().k();
                interfaceC6709dN1.e(jF);
            }
        }
    }

    /* JADX INFO: renamed from: v0.c$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0926c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final C0926c f61820a = new C0926c();

        C0926c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC6711f) obj);
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC6711f interfaceC6711f) {
        }
    }

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        AbstractC5504s.g(lowerCase, "toLowerCase(...)");
        boolean zC = AbstractC5504s.c(lowerCase, "robolectric");
        f61794z = zC;
        f61792A = zC ? C6791G.f61760a : Build.VERSION.SDK_INT >= 28 ? C6793I.f61762a : C6801Q.f61768a.a() ? C6792H.f61761a : C6791G.f61760a;
    }

    public C6811c(InterfaceC6812d interfaceC6812d) {
        this.f61795a = interfaceC6812d;
        C6224f.a aVar = C6224f.f58329b;
        this.f61802h = aVar.c();
        this.f61803i = C6230l.f58350b.a();
        this.f61812r = new C6809a();
        interfaceC6812d.n(false);
        this.f61814t = C5021n.f48560b.b();
        this.f61815u = C5025r.f48570b.a();
        this.f61816v = aVar.b();
    }

    private final Outline B() {
        Outline outline = this.f61800f;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.f61800f = outline2;
        return outline2;
    }

    private final RectF C() {
        RectF rectF = this.f61818x;
        if (rectF != null) {
            return rectF;
        }
        RectF rectF2 = new RectF();
        this.f61818x = rectF2;
        return rectF2;
    }

    private final void D() {
        this.f61811q++;
    }

    private final void E() {
        this.f61811q--;
        f();
    }

    private final void G() {
        this.f61795a.B(this.f61796b, this.f61797c, this, this.f61799e);
    }

    private final void H() {
        if (this.f61795a.z()) {
            return;
        }
        try {
            G();
        } catch (Throwable unused) {
        }
    }

    private final void J() {
        this.f61805k = null;
        this.f61806l = null;
        this.f61803i = C6230l.f58350b.a();
        this.f61802h = C6224f.f58329b.c();
        this.f61804j = 0.0f;
        this.f61801g = true;
        this.f61808n = false;
    }

    private final void T(long j10, long j11) {
        this.f61795a.x(C5021n.k(j10), C5021n.l(j10), j11);
    }

    private final void d(C6811c c6811c) {
        if (this.f61812r.i(c6811c)) {
            c6811c.D();
        }
    }

    private final void d0(long j10) {
        if (C5025r.e(this.f61815u, j10)) {
            return;
        }
        this.f61815u = j10;
        T(this.f61814t, j10);
        if (this.f61803i == 9205357640488583168L) {
            this.f61801g = true;
            e();
        }
    }

    private final void e() {
        if (this.f61801g) {
            Outline outline = null;
            if (this.f61817w || v() > 0.0f) {
                InterfaceC6374m1 interfaceC6374m1 = this.f61806l;
                if (interfaceC6374m1 != null) {
                    RectF rectFC = C();
                    if (!(interfaceC6374m1 instanceof s0.S)) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((s0.S) interfaceC6374m1).v().computeBounds(rectFC, false);
                    Outline outlineJ0 = j0(interfaceC6374m1);
                    if (outlineJ0 != null) {
                        outlineJ0.setAlpha(j());
                        outline = outlineJ0;
                    }
                    this.f61795a.N(outline, C5025r.c((4294967295L & ((long) Math.round(rectFC.height()))) | (((long) Math.round(rectFC.width())) << 32)));
                    if (this.f61808n && this.f61817w) {
                        this.f61795a.n(false);
                        this.f61795a.p();
                    } else {
                        this.f61795a.n(this.f61817w);
                    }
                } else {
                    this.f61795a.n(this.f61817w);
                    C6230l.f58350b.b();
                    Outline outlineB = B();
                    long jD = AbstractC5026s.d(this.f61815u);
                    long j10 = this.f61802h;
                    long j11 = this.f61803i;
                    long j12 = j11 == 9205357640488583168L ? jD : j11;
                    int i10 = (int) (j10 >> 32);
                    int i11 = (int) (j10 & 4294967295L);
                    outlineB.setRoundRect(Math.round(Float.intBitsToFloat(i10)), Math.round(Float.intBitsToFloat(i11)), Math.round(Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (j12 >> 32))), Math.round(Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j12 & 4294967295L))), this.f61804j);
                    outlineB.setAlpha(j());
                    this.f61795a.N(outlineB, AbstractC5026s.c(j12));
                }
            } else {
                this.f61795a.n(false);
                this.f61795a.N(null, C5025r.f48570b.a());
            }
        }
        this.f61801g = false;
    }

    private final void f() {
        if (this.f61813s && this.f61811q == 0) {
            g();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(u0.InterfaceC6711f r15) {
        /*
            r14 = this;
            v0.a r0 = r14.f61812r
            v0.c r1 = v0.C6809a.b(r0)
            v0.C6809a.g(r0, r1)
            t.Q r1 = v0.C6809a.a(r0)
            if (r1 == 0) goto L28
            boolean r2 = r1.e()
            if (r2 == 0) goto L28
            t.Q r2 = v0.C6809a.c(r0)
            if (r2 != 0) goto L22
            t.Q r2 = t.f0.b()
            v0.C6809a.f(r0, r2)
        L22:
            r2.j(r1)
            r1.m()
        L28:
            r1 = 1
            v0.C6809a.h(r0, r1)
            kotlin.jvm.functions.Function1 r1 = r14.f61798d
            r1.invoke(r15)
            r15 = 0
            v0.C6809a.h(r0, r15)
            v0.c r1 = v0.C6809a.d(r0)
            if (r1 == 0) goto L3e
            r1.E()
        L3e:
            t.Q r0 = v0.C6809a.c(r0)
            if (r0 == 0) goto L91
            boolean r1 = r0.e()
            if (r1 == 0) goto L91
            java.lang.Object[] r1 = r0.f60055b
            long[] r2 = r0.f60054a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L8e
            r4 = r15
        L54:
            r5 = r2[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L89
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r15
        L6e:
            if (r9 >= r7) goto L87
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L83
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            v0.c r10 = (v0.C6811c) r10
            r10.E()
        L83:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L6e
        L87:
            if (r7 != r8) goto L8e
        L89:
            if (r4 == r3) goto L8e
            int r4 = r4 + 1
            goto L54
        L8e:
            r0.m()
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.C6811c.i(u0.f):void");
    }

    private final void i0(Canvas canvas) {
        Canvas canvas2;
        float fK = C5021n.k(this.f61814t);
        float fL = C5021n.l(this.f61814t);
        float fK2 = C5021n.k(this.f61814t) + ((int) (this.f61815u >> 32));
        float fL2 = C5021n.l(this.f61814t) + ((int) (this.f61815u & 4294967295L));
        float fJ = j();
        androidx.compose.ui.graphics.d dVarM = m();
        int iK = k();
        if (fJ < 1.0f || !androidx.compose.ui.graphics.c.G(iK, androidx.compose.ui.graphics.c.f26737b.B()) || dVarM != null || AbstractC6810b.e(n(), AbstractC6810b.f61788a.c())) {
            InterfaceC6368k1 interfaceC6368k1A = this.f61810p;
            if (interfaceC6368k1A == null) {
                interfaceC6368k1A = s0.Q.a();
                this.f61810p = interfaceC6368k1A;
            }
            interfaceC6368k1A.e(fJ);
            interfaceC6368k1A.c(iK);
            interfaceC6368k1A.d(dVarM);
            canvas2 = canvas;
            canvas2.saveLayer(fK, fL, fK2, fL2, interfaceC6368k1A.u());
        } else {
            canvas.save();
            canvas2 = canvas;
        }
        canvas2.translate(fK, fL);
        canvas2.concat(this.f61795a.J());
    }

    private final Outline j0(InterfaceC6374m1 interfaceC6374m1) {
        Outline outline;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 28 || interfaceC6374m1.d()) {
            Outline outlineB = B();
            if (i10 >= 30) {
                C6796L.f61764a.a(outlineB, interfaceC6374m1);
            } else {
                if (!(interfaceC6374m1 instanceof s0.S)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outlineB.setConvexPath(((s0.S) interfaceC6374m1).v());
            }
            this.f61808n = !outlineB.canClip();
            outline = outlineB;
        } else {
            Outline outline2 = this.f61800f;
            if (outline2 != null) {
                outline2.setEmpty();
            }
            this.f61808n = true;
            this.f61795a.M(true);
            outline = null;
        }
        this.f61806l = interfaceC6374m1;
        return outline;
    }

    public final boolean A() {
        return this.f61813s;
    }

    public final void F(InterfaceC5011d interfaceC5011d, EnumC5027t enumC5027t, long j10, Function1 function1) {
        d0(j10);
        this.f61796b = interfaceC5011d;
        this.f61797c = enumC5027t;
        this.f61798d = function1;
        this.f61795a.M(true);
        G();
    }

    public final void I() {
        if (this.f61813s) {
            return;
        }
        this.f61813s = true;
        f();
    }

    public final void K(float f10) {
        if (this.f61795a.a() == f10) {
            return;
        }
        this.f61795a.e(f10);
    }

    public final void L(long j10) {
        if (C6385r0.s(j10, this.f61795a.A())) {
            return;
        }
        this.f61795a.k(j10);
    }

    public final void M(int i10) {
        if (androidx.compose.ui.graphics.c.G(this.f61795a.j(), i10)) {
            return;
        }
        this.f61795a.c(i10);
    }

    public final void N(float f10) {
        if (this.f61795a.m() == f10) {
            return;
        }
        this.f61795a.r(f10);
    }

    public final void O(boolean z10) {
        if (this.f61817w != z10) {
            this.f61817w = z10;
            this.f61801g = true;
            e();
        }
    }

    public final void P(androidx.compose.ui.graphics.d dVar) {
        if (AbstractC5504s.c(this.f61795a.f(), dVar)) {
            return;
        }
        this.f61795a.d(dVar);
    }

    public final void Q(int i10) {
        if (AbstractC6810b.e(this.f61795a.q(), i10)) {
            return;
        }
        this.f61795a.P(i10);
    }

    public final void R(InterfaceC6374m1 interfaceC6374m1) {
        J();
        this.f61806l = interfaceC6374m1;
        e();
    }

    public final void S(long j10) {
        if (C6224f.j(this.f61816v, j10)) {
            return;
        }
        this.f61816v = j10;
        this.f61795a.O(j10);
    }

    public final void U(long j10, long j11) {
        Z(j10, j11, 0.0f);
    }

    public final void V(u1 u1Var) {
        if (AbstractC5504s.c(this.f61795a.b(), u1Var)) {
            return;
        }
        this.f61795a.G(u1Var);
    }

    public final void W(float f10) {
        if (this.f61795a.E() == f10) {
            return;
        }
        this.f61795a.s(f10);
    }

    public final void X(float f10) {
        if (this.f61795a.h() == f10) {
            return;
        }
        this.f61795a.t(f10);
    }

    public final void Y(float f10) {
        if (this.f61795a.i() == f10) {
            return;
        }
        this.f61795a.w(f10);
    }

    public final void Z(long j10, long j11, float f10) {
        if (C6224f.j(this.f61802h, j10) && C6230l.f(this.f61803i, j11) && this.f61804j == f10 && this.f61806l == null) {
            return;
        }
        J();
        this.f61802h = j10;
        this.f61803i = j11;
        this.f61804j = f10;
        e();
    }

    public final void a0(float f10) {
        if (this.f61795a.u() == f10) {
            return;
        }
        this.f61795a.l(f10);
    }

    public final void b0(float f10) {
        if (this.f61795a.H() == f10) {
            return;
        }
        this.f61795a.y(f10);
    }

    public final void c0(float f10) {
        if (this.f61795a.Q() == f10) {
            return;
        }
        this.f61795a.v(f10);
        this.f61801g = true;
        e();
    }

    public final void e0(long j10) {
        if (C6385r0.s(j10, this.f61795a.I())) {
            return;
        }
        this.f61795a.o(j10);
    }

    public final void f0(long j10) {
        if (C5021n.j(this.f61814t, j10)) {
            return;
        }
        this.f61814t = j10;
        T(j10, this.f61815u);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r15 = this;
            v0.a r0 = r15.f61812r
            v0.c r1 = v0.C6809a.b(r0)
            if (r1 == 0) goto Lf
            r1.E()
            r1 = 0
            v0.C6809a.e(r0, r1)
        Lf:
            t.Q r0 = v0.C6809a.a(r0)
            if (r0 == 0) goto L5d
            java.lang.Object[] r1 = r0.f60055b
            long[] r2 = r0.f60054a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5a
            r4 = 0
            r5 = r4
        L20:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L55
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L3a:
            if (r10 >= r8) goto L53
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.32E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L4f
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            v0.c r11 = (v0.C6811c) r11
            r11.E()
        L4f:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L3a
        L53:
            if (r8 != r9) goto L5a
        L55:
            if (r5 == r3) goto L5a
            int r5 = r5 + 1
            goto L20
        L5a:
            r0.m()
        L5d:
            v0.d r0 = r15.f61795a
            r0.p()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.C6811c.g():void");
    }

    public final void g0(float f10) {
        if (this.f61795a.D() == f10) {
            return;
        }
        this.f61795a.F(f10);
    }

    public final void h(InterfaceC6364j0 interfaceC6364j0, C6811c c6811c) {
        boolean z10;
        boolean z11;
        if (this.f61813s) {
            return;
        }
        e();
        H();
        boolean z12 = v() > 0.0f;
        if (z12) {
            interfaceC6364j0.m();
        }
        Canvas canvasD = s0.E.d(interfaceC6364j0);
        boolean zIsHardwareAccelerated = canvasD.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            i0(canvasD);
        }
        boolean z13 = !zIsHardwareAccelerated && this.f61817w;
        if (z13) {
            interfaceC6364j0.p();
            AbstractC6362i1 abstractC6362i1O = o();
            if (abstractC6362i1O instanceof AbstractC6362i1.b) {
                InterfaceC6364j0.n(interfaceC6364j0, ((AbstractC6362i1.b) abstractC6362i1O).a(), 0, 2, null);
            } else if (abstractC6362i1O instanceof AbstractC6362i1.c) {
                InterfaceC6374m1 interfaceC6374m1A = this.f61807m;
                if (interfaceC6374m1A != null) {
                    interfaceC6374m1A.C();
                } else {
                    interfaceC6374m1A = s0.V.a();
                    this.f61807m = interfaceC6374m1A;
                }
                InterfaceC6374m1.s(interfaceC6374m1A, ((AbstractC6362i1.c) abstractC6362i1O).b(), null, 2, null);
                InterfaceC6364j0.v(interfaceC6364j0, interfaceC6374m1A, 0, 2, null);
            } else {
                if (!(abstractC6362i1O instanceof AbstractC6362i1.a)) {
                    throw new Td.r();
                }
                InterfaceC6364j0.v(interfaceC6364j0, ((AbstractC6362i1.a) abstractC6362i1O).b(), 0, 2, null);
            }
        }
        if (c6811c != null) {
            c6811c.d(this);
        }
        if (s0.E.d(interfaceC6364j0).isHardwareAccelerated() || this.f61795a.L()) {
            z10 = z12;
            z11 = z13;
            this.f61795a.K(interfaceC6364j0);
        } else {
            C6706a c6706a = this.f61809o;
            if (c6706a == null) {
                c6706a = new C6706a();
                this.f61809o = c6706a;
            }
            InterfaceC6711f interfaceC6711f = c6706a;
            InterfaceC5011d interfaceC5011d = this.f61796b;
            EnumC5027t enumC5027t = this.f61797c;
            long jD = AbstractC5026s.d(this.f61815u);
            InterfaceC5011d density = interfaceC6711f.n1().getDensity();
            EnumC5027t layoutDirection = interfaceC6711f.n1().getLayoutDirection();
            InterfaceC6364j0 interfaceC6364j0B = interfaceC6711f.n1().b();
            long jF = interfaceC6711f.n1().f();
            z10 = z12;
            C6811c c6811cG = interfaceC6711f.n1().g();
            z11 = z13;
            InterfaceC6709d interfaceC6709dN1 = interfaceC6711f.n1();
            interfaceC6709dN1.c(interfaceC5011d);
            interfaceC6709dN1.d(enumC5027t);
            interfaceC6709dN1.h(interfaceC6364j0);
            interfaceC6709dN1.e(jD);
            interfaceC6709dN1.i(this);
            interfaceC6364j0.p();
            try {
                i(interfaceC6711f);
            } finally {
                interfaceC6364j0.k();
                InterfaceC6709d interfaceC6709dN12 = interfaceC6711f.n1();
                interfaceC6709dN12.c(density);
                interfaceC6709dN12.d(layoutDirection);
                interfaceC6709dN12.h(interfaceC6364j0B);
                interfaceC6709dN12.e(jF);
                interfaceC6709dN12.i(c6811cG);
            }
        }
        if (z11) {
            interfaceC6364j0.k();
        }
        if (z10) {
            interfaceC6364j0.q();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvasD.restore();
    }

    public final void h0(float f10) {
        if (this.f61795a.C() == f10) {
            return;
        }
        this.f61795a.g(f10);
    }

    public final float j() {
        return this.f61795a.a();
    }

    public final int k() {
        return this.f61795a.j();
    }

    public final boolean l() {
        return this.f61817w;
    }

    public final androidx.compose.ui.graphics.d m() {
        return this.f61795a.f();
    }

    public final int n() {
        return this.f61795a.q();
    }

    public final AbstractC6362i1 o() {
        AbstractC6362i1 bVar;
        AbstractC6362i1 abstractC6362i1 = this.f61805k;
        InterfaceC6374m1 interfaceC6374m1 = this.f61806l;
        if (abstractC6362i1 != null) {
            return abstractC6362i1;
        }
        if (interfaceC6374m1 != null) {
            AbstractC6362i1.a aVar = new AbstractC6362i1.a(interfaceC6374m1);
            this.f61805k = aVar;
            return aVar;
        }
        long jD = AbstractC5026s.d(this.f61815u);
        long j10 = this.f61802h;
        long j11 = this.f61803i;
        if (j11 != 9205357640488583168L) {
            jD = j11;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jD >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = fIntBitsToFloat2 + Float.intBitsToFloat((int) (jD & 4294967295L));
        float f10 = this.f61804j;
        if (f10 > 0.0f) {
            bVar = new AbstractC6362i1.c(AbstractC6229k.c(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, AbstractC6219a.b((((long) Float.floatToRawIntBits(f10)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f10))))));
        } else {
            bVar = new AbstractC6362i1.b(new C6226h(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.f61805k = bVar;
        return bVar;
    }

    public final long p() {
        return this.f61816v;
    }

    public final float q() {
        return this.f61795a.E();
    }

    public final float r() {
        return this.f61795a.h();
    }

    public final float s() {
        return this.f61795a.i();
    }

    public final float t() {
        return this.f61795a.u();
    }

    public final float u() {
        return this.f61795a.H();
    }

    public final float v() {
        return this.f61795a.Q();
    }

    public final long w() {
        return this.f61815u;
    }

    public final long x() {
        return this.f61814t;
    }

    public final float y() {
        return this.f61795a.D();
    }

    public final float z() {
        return this.f61795a.C();
    }
}
