package u0;

import Td.r;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6230l;
import s0.AbstractC6358h0;
import s0.AbstractC6371l1;
import s0.C6385r0;
import s0.G1;
import s0.H1;
import s0.InterfaceC6341b1;
import s0.InterfaceC6364j0;
import s0.InterfaceC6368k1;
import s0.InterfaceC6374m1;
import s0.InterfaceC6377n1;
import s0.Q;
import s0.X0;
import v0.C6811c;

/* JADX INFO: renamed from: u0.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6706a implements InterfaceC6711f {

    /* JADX INFO: renamed from: a */
    private final C0912a f61097a = new C0912a(null, null, null, 0, 15, null);

    /* JADX INFO: renamed from: b */
    private final InterfaceC6709d f61098b = new b();

    /* JADX INFO: renamed from: c */
    private InterfaceC6368k1 f61099c;

    /* JADX INFO: renamed from: d */
    private InterfaceC6368k1 f61100d;

    /* JADX INFO: renamed from: u0.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0912a {

        /* JADX INFO: renamed from: a */
        private InterfaceC5011d f61101a;

        /* JADX INFO: renamed from: b */
        private EnumC5027t f61102b;

        /* JADX INFO: renamed from: c */
        private InterfaceC6364j0 f61103c;

        /* JADX INFO: renamed from: d */
        private long f61104d;

        public /* synthetic */ C0912a(InterfaceC5011d interfaceC5011d, EnumC5027t enumC5027t, InterfaceC6364j0 interfaceC6364j0, long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC5011d, enumC5027t, interfaceC6364j0, j10);
        }

        public final InterfaceC5011d a() {
            return this.f61101a;
        }

        public final EnumC5027t b() {
            return this.f61102b;
        }

        public final InterfaceC6364j0 c() {
            return this.f61103c;
        }

        public final long d() {
            return this.f61104d;
        }

        public final InterfaceC6364j0 e() {
            return this.f61103c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0912a)) {
                return false;
            }
            C0912a c0912a = (C0912a) obj;
            return AbstractC5504s.c(this.f61101a, c0912a.f61101a) && this.f61102b == c0912a.f61102b && AbstractC5504s.c(this.f61103c, c0912a.f61103c) && C6230l.f(this.f61104d, c0912a.f61104d);
        }

        public final InterfaceC5011d f() {
            return this.f61101a;
        }

        public final EnumC5027t g() {
            return this.f61102b;
        }

        public final long h() {
            return this.f61104d;
        }

        public int hashCode() {
            return (((((this.f61101a.hashCode() * 31) + this.f61102b.hashCode()) * 31) + this.f61103c.hashCode()) * 31) + C6230l.j(this.f61104d);
        }

        public final void i(InterfaceC6364j0 interfaceC6364j0) {
            this.f61103c = interfaceC6364j0;
        }

        public final void j(InterfaceC5011d interfaceC5011d) {
            this.f61101a = interfaceC5011d;
        }

        public final void k(EnumC5027t enumC5027t) {
            this.f61102b = enumC5027t;
        }

        public final void l(long j10) {
            this.f61104d = j10;
        }

        public String toString() {
            return "DrawParams(density=" + this.f61101a + ", layoutDirection=" + this.f61102b + ", canvas=" + this.f61103c + ", size=" + ((Object) C6230l.l(this.f61104d)) + ')';
        }

        private C0912a(InterfaceC5011d interfaceC5011d, EnumC5027t enumC5027t, InterfaceC6364j0 interfaceC6364j0, long j10) {
            this.f61101a = interfaceC5011d;
            this.f61102b = enumC5027t;
            this.f61103c = interfaceC6364j0;
            this.f61104d = j10;
        }

        public /* synthetic */ C0912a(InterfaceC5011d interfaceC5011d, EnumC5027t enumC5027t, InterfaceC6364j0 interfaceC6364j0, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? AbstractC6710e.a() : interfaceC5011d, (i10 & 2) != 0 ? EnumC5027t.f48573a : enumC5027t, (i10 & 4) != 0 ? C6714i.f61114a : interfaceC6364j0, (i10 & 8) != 0 ? C6230l.f58350b.b() : j10, null);
        }
    }

    /* JADX INFO: renamed from: u0.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements InterfaceC6709d {

        /* JADX INFO: renamed from: a */
        private final InterfaceC6713h f61105a = AbstractC6707b.b(this);

        /* JADX INFO: renamed from: b */
        private C6811c f61106b;

        b() {
        }

        @Override // u0.InterfaceC6709d
        public InterfaceC6713h a() {
            return this.f61105a;
        }

        @Override // u0.InterfaceC6709d
        public InterfaceC6364j0 b() {
            return C6706a.this.N().e();
        }

        @Override // u0.InterfaceC6709d
        public void c(InterfaceC5011d interfaceC5011d) {
            C6706a.this.N().j(interfaceC5011d);
        }

        @Override // u0.InterfaceC6709d
        public void d(EnumC5027t enumC5027t) {
            C6706a.this.N().k(enumC5027t);
        }

        @Override // u0.InterfaceC6709d
        public void e(long j10) {
            C6706a.this.N().l(j10);
        }

        @Override // u0.InterfaceC6709d
        public long f() {
            return C6706a.this.N().h();
        }

        @Override // u0.InterfaceC6709d
        public C6811c g() {
            return this.f61106b;
        }

        @Override // u0.InterfaceC6709d
        public InterfaceC5011d getDensity() {
            return C6706a.this.N().f();
        }

        @Override // u0.InterfaceC6709d
        public EnumC5027t getLayoutDirection() {
            return C6706a.this.N().g();
        }

        @Override // u0.InterfaceC6709d
        public void h(InterfaceC6364j0 interfaceC6364j0) {
            C6706a.this.N().i(interfaceC6364j0);
        }

        @Override // u0.InterfaceC6709d
        public void i(C6811c c6811c) {
            this.f61106b = c6811c;
        }
    }

    static /* synthetic */ InterfaceC6368k1 B(C6706a c6706a, long j10, float f10, float f11, int i10, int i11, InterfaceC6377n1 interfaceC6377n1, float f12, androidx.compose.ui.graphics.d dVar, int i12, int i13, int i14, Object obj) {
        return c6706a.z(j10, f10, f11, i10, i11, interfaceC6377n1, f12, dVar, i12, (i14 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? InterfaceC6711f.f61110j0.b() : i13);
    }

    private final InterfaceC6368k1 I(AbstractC6358h0 abstractC6358h0, float f10, float f11, int i10, int i11, InterfaceC6377n1 interfaceC6377n1, float f12, androidx.compose.ui.graphics.d dVar, int i12, int i13) {
        InterfaceC6368k1 interfaceC6368k1V = V();
        if (abstractC6358h0 != null) {
            abstractC6358h0.mo965applyToPq9zytI(f(), interfaceC6368k1V, f12);
        } else if (interfaceC6368k1V.a() != f12) {
            interfaceC6368k1V.e(f12);
        }
        if (!AbstractC5504s.c(interfaceC6368k1V.f(), dVar)) {
            interfaceC6368k1V.d(dVar);
        }
        if (!androidx.compose.ui.graphics.c.G(interfaceC6368k1V.j(), i12)) {
            interfaceC6368k1V.c(i12);
        }
        if (interfaceC6368k1V.B() != f10) {
            interfaceC6368k1V.A(f10);
        }
        if (interfaceC6368k1V.s() != f11) {
            interfaceC6368k1V.x(f11);
        }
        if (!G1.e(interfaceC6368k1V.n(), i10)) {
            interfaceC6368k1V.l(i10);
        }
        if (!H1.e(interfaceC6368k1V.r(), i11)) {
            interfaceC6368k1V.o(i11);
        }
        interfaceC6368k1V.q();
        if (!AbstractC5504s.c(null, interfaceC6377n1)) {
            interfaceC6368k1V.t(interfaceC6377n1);
        }
        if (!X0.d(interfaceC6368k1V.y(), i13)) {
            interfaceC6368k1V.m(i13);
        }
        return interfaceC6368k1V;
    }

    static /* synthetic */ InterfaceC6368k1 L(C6706a c6706a, AbstractC6358h0 abstractC6358h0, float f10, float f11, int i10, int i11, InterfaceC6377n1 interfaceC6377n1, float f12, androidx.compose.ui.graphics.d dVar, int i12, int i13, int i14, Object obj) {
        return c6706a.I(abstractC6358h0, f10, f11, i10, i11, interfaceC6377n1, f12, dVar, i12, (i14 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? InterfaceC6711f.f61110j0.b() : i13);
    }

    private final long S(long j10, float f10) {
        return f10 == 1.0f ? j10 : C6385r0.q(j10, C6385r0.t(j10) * f10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    private final InterfaceC6368k1 U() {
        InterfaceC6368k1 interfaceC6368k1 = this.f61099c;
        if (interfaceC6368k1 != null) {
            return interfaceC6368k1;
        }
        InterfaceC6368k1 interfaceC6368k1A = Q.a();
        interfaceC6368k1A.z(AbstractC6371l1.f58959a.a());
        this.f61099c = interfaceC6368k1A;
        return interfaceC6368k1A;
    }

    private final InterfaceC6368k1 V() {
        InterfaceC6368k1 interfaceC6368k1 = this.f61100d;
        if (interfaceC6368k1 != null) {
            return interfaceC6368k1;
        }
        InterfaceC6368k1 interfaceC6368k1A = Q.a();
        interfaceC6368k1A.z(AbstractC6371l1.f58959a.b());
        this.f61100d = interfaceC6368k1A;
        return interfaceC6368k1A;
    }

    private final InterfaceC6368k1 W(AbstractC6712g abstractC6712g) {
        if (AbstractC5504s.c(abstractC6712g, C6715j.f61115a)) {
            return U();
        }
        if (!(abstractC6712g instanceof C6716k)) {
            throw new r();
        }
        InterfaceC6368k1 interfaceC6368k1V = V();
        C6716k c6716k = (C6716k) abstractC6712g;
        if (interfaceC6368k1V.B() != c6716k.f()) {
            interfaceC6368k1V.A(c6716k.f());
        }
        if (!G1.e(interfaceC6368k1V.n(), c6716k.b())) {
            interfaceC6368k1V.l(c6716k.b());
        }
        if (interfaceC6368k1V.s() != c6716k.d()) {
            interfaceC6368k1V.x(c6716k.d());
        }
        if (!H1.e(interfaceC6368k1V.r(), c6716k.c())) {
            interfaceC6368k1V.o(c6716k.c());
        }
        interfaceC6368k1V.q();
        c6716k.e();
        if (!AbstractC5504s.c(null, null)) {
            c6716k.e();
            interfaceC6368k1V.t(null);
        }
        return interfaceC6368k1V;
    }

    private final InterfaceC6368k1 b(long j10, AbstractC6712g abstractC6712g, float f10, androidx.compose.ui.graphics.d dVar, int i10, int i11) {
        InterfaceC6368k1 interfaceC6368k1W = W(abstractC6712g);
        long jS = S(j10, f10);
        if (!C6385r0.s(interfaceC6368k1W.b(), jS)) {
            interfaceC6368k1W.p(jS);
        }
        if (interfaceC6368k1W.w() != null) {
            interfaceC6368k1W.v(null);
        }
        if (!AbstractC5504s.c(interfaceC6368k1W.f(), dVar)) {
            interfaceC6368k1W.d(dVar);
        }
        if (!androidx.compose.ui.graphics.c.G(interfaceC6368k1W.j(), i10)) {
            interfaceC6368k1W.c(i10);
        }
        if (!X0.d(interfaceC6368k1W.y(), i11)) {
            interfaceC6368k1W.m(i11);
        }
        return interfaceC6368k1W;
    }

    static /* synthetic */ InterfaceC6368k1 j(C6706a c6706a, long j10, AbstractC6712g abstractC6712g, float f10, androidx.compose.ui.graphics.d dVar, int i10, int i11, int i12, Object obj) {
        return c6706a.b(j10, abstractC6712g, f10, dVar, i10, (i12 & 32) != 0 ? InterfaceC6711f.f61110j0.b() : i11);
    }

    private final InterfaceC6368k1 p(AbstractC6358h0 abstractC6358h0, AbstractC6712g abstractC6712g, float f10, androidx.compose.ui.graphics.d dVar, int i10, int i11) {
        InterfaceC6368k1 interfaceC6368k1W = W(abstractC6712g);
        if (abstractC6358h0 != null) {
            abstractC6358h0.mo965applyToPq9zytI(f(), interfaceC6368k1W, f10);
        } else {
            if (interfaceC6368k1W.w() != null) {
                interfaceC6368k1W.v(null);
            }
            long jB = interfaceC6368k1W.b();
            C6385r0.a aVar = C6385r0.f58985b;
            if (!C6385r0.s(jB, aVar.a())) {
                interfaceC6368k1W.p(aVar.a());
            }
            if (interfaceC6368k1W.a() != f10) {
                interfaceC6368k1W.e(f10);
            }
        }
        if (!AbstractC5504s.c(interfaceC6368k1W.f(), dVar)) {
            interfaceC6368k1W.d(dVar);
        }
        if (!androidx.compose.ui.graphics.c.G(interfaceC6368k1W.j(), i10)) {
            interfaceC6368k1W.c(i10);
        }
        if (!X0.d(interfaceC6368k1W.y(), i11)) {
            interfaceC6368k1W.m(i11);
        }
        return interfaceC6368k1W;
    }

    static /* synthetic */ InterfaceC6368k1 q(C6706a c6706a, AbstractC6358h0 abstractC6358h0, AbstractC6712g abstractC6712g, float f10, androidx.compose.ui.graphics.d dVar, int i10, int i11, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            i11 = InterfaceC6711f.f61110j0.b();
        }
        return c6706a.p(abstractC6358h0, abstractC6712g, f10, dVar, i10, i11);
    }

    private final InterfaceC6368k1 z(long j10, float f10, float f11, int i10, int i11, InterfaceC6377n1 interfaceC6377n1, float f12, androidx.compose.ui.graphics.d dVar, int i12, int i13) {
        InterfaceC6368k1 interfaceC6368k1V = V();
        long jS = S(j10, f12);
        if (!C6385r0.s(interfaceC6368k1V.b(), jS)) {
            interfaceC6368k1V.p(jS);
        }
        if (interfaceC6368k1V.w() != null) {
            interfaceC6368k1V.v(null);
        }
        if (!AbstractC5504s.c(interfaceC6368k1V.f(), dVar)) {
            interfaceC6368k1V.d(dVar);
        }
        if (!androidx.compose.ui.graphics.c.G(interfaceC6368k1V.j(), i12)) {
            interfaceC6368k1V.c(i12);
        }
        if (interfaceC6368k1V.B() != f10) {
            interfaceC6368k1V.A(f10);
        }
        if (interfaceC6368k1V.s() != f11) {
            interfaceC6368k1V.x(f11);
        }
        if (!G1.e(interfaceC6368k1V.n(), i10)) {
            interfaceC6368k1V.l(i10);
        }
        if (!H1.e(interfaceC6368k1V.r(), i11)) {
            interfaceC6368k1V.o(i11);
        }
        interfaceC6368k1V.q();
        if (!AbstractC5504s.c(null, interfaceC6377n1)) {
            interfaceC6368k1V.t(interfaceC6377n1);
        }
        if (!X0.d(interfaceC6368k1V.y(), i13)) {
            interfaceC6368k1V.m(i13);
        }
        return interfaceC6368k1V;
    }

    @Override // u0.InterfaceC6711f
    public void A1(InterfaceC6341b1 interfaceC6341b1, long j10, long j11, long j12, long j13, float f10, AbstractC6712g abstractC6712g, androidx.compose.ui.graphics.d dVar, int i10, int i11) {
        this.f61097a.e().l(interfaceC6341b1, j10, j11, j12, j13, p(null, abstractC6712g, f10, dVar, i10, i11));
    }

    @Override // u0.InterfaceC6711f
    public void C1(InterfaceC6374m1 interfaceC6374m1, long j10, float f10, AbstractC6712g abstractC6712g, androidx.compose.ui.graphics.d dVar, int i10) {
        this.f61097a.e().t(interfaceC6374m1, j(this, j10, abstractC6712g, f10, dVar, i10, 0, 32, null));
    }

    @Override // u0.InterfaceC6711f
    public void D0(InterfaceC6341b1 interfaceC6341b1, long j10, float f10, AbstractC6712g abstractC6712g, androidx.compose.ui.graphics.d dVar, int i10) {
        this.f61097a.e().x(interfaceC6341b1, j10, q(this, null, abstractC6712g, f10, dVar, i10, 0, 32, null));
    }

    public final C0912a N() {
        return this.f61097a;
    }

    @Override // u0.InterfaceC6711f
    public void N0(long j10, long j11, long j12, float f10, int i10, InterfaceC6377n1 interfaceC6377n1, float f11, androidx.compose.ui.graphics.d dVar, int i11) {
        this.f61097a.e().g(j11, j12, B(this, j10, f10, 4.0f, i10, H1.f58881a.b(), interfaceC6377n1, f11, dVar, i11, 0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, null));
    }

    @Override // u0.InterfaceC6711f
    public void U0(AbstractC6358h0 abstractC6358h0, long j10, long j11, float f10, AbstractC6712g abstractC6712g, androidx.compose.ui.graphics.d dVar, int i10) {
        int i11 = (int) (j10 >> 32);
        int i12 = (int) (j10 & 4294967295L);
        this.f61097a.e().w(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j11 & 4294967295L)), q(this, abstractC6358h0, abstractC6712g, f10, dVar, i10, 0, 32, null));
    }

    @Override // u0.InterfaceC6711f
    public void V0(long j10, long j11, long j12, float f10, AbstractC6712g abstractC6712g, androidx.compose.ui.graphics.d dVar, int i10) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        this.f61097a.e().w(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j12 & 4294967295L)), j(this, j10, abstractC6712g, f10, dVar, i10, 0, 32, null));
    }

    @Override // u0.InterfaceC6711f
    public void Z0(long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, AbstractC6712g abstractC6712g, androidx.compose.ui.graphics.d dVar, int i10) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        this.f61097a.e().i(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j12 & 4294967295L)), f10, f11, z10, j(this, j10, abstractC6712g, f12, dVar, i10, 0, 32, null));
    }

    @Override // u0.InterfaceC6711f
    public void a0(AbstractC6358h0 abstractC6358h0, long j10, long j11, float f10, int i10, InterfaceC6377n1 interfaceC6377n1, float f11, androidx.compose.ui.graphics.d dVar, int i11) {
        this.f61097a.e().g(j10, j11, L(this, abstractC6358h0, f10, 4.0f, i10, H1.f58881a.b(), interfaceC6377n1, f11, dVar, i11, 0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, null));
    }

    @Override // u0.InterfaceC6711f
    public void c1(long j10, float f10, long j11, float f11, AbstractC6712g abstractC6712g, androidx.compose.ui.graphics.d dVar, int i10) {
        this.f61097a.e().u(j11, f10, j(this, j10, abstractC6712g, f11, dVar, i10, 0, 32, null));
    }

    @Override // u0.InterfaceC6711f
    public void g1(long j10, long j11, long j12, long j13, AbstractC6712g abstractC6712g, float f10, androidx.compose.ui.graphics.d dVar, int i10) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        this.f61097a.e().f(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j12 & 4294967295L)), Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)), j(this, j10, abstractC6712g, f10, dVar, i10, 0, 32, null));
    }

    @Override // i1.InterfaceC5011d
    public float getDensity() {
        return this.f61097a.f().getDensity();
    }

    @Override // u0.InterfaceC6711f
    public EnumC5027t getLayoutDirection() {
        return this.f61097a.g();
    }

    @Override // i1.InterfaceC5019l
    public float j1() {
        return this.f61097a.f().j1();
    }

    @Override // u0.InterfaceC6711f
    public void m1(AbstractC6358h0 abstractC6358h0, long j10, long j11, long j12, float f10, AbstractC6712g abstractC6712g, androidx.compose.ui.graphics.d dVar, int i10) {
        int i11 = (int) (j10 >> 32);
        int i12 = (int) (j10 & 4294967295L);
        this.f61097a.e().f(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j11 & 4294967295L)), Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)), q(this, abstractC6358h0, abstractC6712g, f10, dVar, i10, 0, 32, null));
    }

    @Override // u0.InterfaceC6711f
    public InterfaceC6709d n1() {
        return this.f61098b;
    }

    @Override // u0.InterfaceC6711f
    public void p1(InterfaceC6374m1 interfaceC6374m1, AbstractC6358h0 abstractC6358h0, float f10, AbstractC6712g abstractC6712g, androidx.compose.ui.graphics.d dVar, int i10) {
        this.f61097a.e().t(interfaceC6374m1, q(this, abstractC6358h0, abstractC6712g, f10, dVar, i10, 0, 32, null));
    }
}
