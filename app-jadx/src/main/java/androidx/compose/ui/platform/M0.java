package androidx.compose.ui.platform;

import Td.C2160k;
import android.os.Build;
import androidx.compose.ui.graphics.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i1.AbstractC5013f;
import i1.AbstractC5026s;
import i1.C5025r;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import r0.AbstractC6231m;
import r0.C6222d;
import r0.C6224f;
import s0.AbstractC6359h1;
import s0.AbstractC6362i1;
import s0.C6356g1;
import s0.InterfaceC6364j0;
import u0.C6706a;
import u0.InterfaceC6709d;
import u0.InterfaceC6711f;
import v0.AbstractC6810b;
import v0.AbstractC6813e;
import v0.C6811c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class M0 implements K0.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C6811c f27307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s0.Z0 f27308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AndroidComposeView f27309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Function2 f27310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC5082a f27311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f27312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f27313g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float[] f27315i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f27316j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f27320n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AbstractC6362i1 f27322p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f27323q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f27324r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f27326t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f27327u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f27328v;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f27314h = C6356g1.c(null, 1, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InterfaceC5011d f27317k = AbstractC5013f.b(1.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private EnumC5027t f27318l = EnumC5027t.f48573a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C6706a f27319m = new C6706a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f27321o = androidx.compose.ui.graphics.j.f26818b.a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f27325s = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Function1 f27329w = new a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC6711f) obj);
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC6711f interfaceC6711f) {
            M0 m02 = M0.this;
            InterfaceC6364j0 interfaceC6364j0B = interfaceC6711f.n1().b();
            Function2 function2 = m02.f27310d;
            if (function2 != null) {
                function2.invoke(interfaceC6364j0B, interfaceC6711f.n1().g());
            }
        }
    }

    public M0(C6811c c6811c, s0.Z0 z02, AndroidComposeView androidComposeView, Function2 function2, InterfaceC5082a interfaceC5082a) {
        this.f27307a = c6811c;
        this.f27308b = z02;
        this.f27309c = androidComposeView;
        this.f27310d = function2;
        this.f27311e = interfaceC5082a;
        long j10 = Integer.MAX_VALUE;
        this.f27312f = C5025r.c((j10 & 4294967295L) | (j10 << 32));
    }

    private final float[] o() {
        float[] fArrC = this.f27315i;
        if (fArrC == null) {
            fArrC = C6356g1.c(null, 1, null);
            this.f27315i = fArrC;
        }
        if (!this.f27324r) {
            if (Float.isNaN(fArrC[0])) {
                return null;
            }
            return fArrC;
        }
        this.f27324r = false;
        float[] fArrP = p();
        if (this.f27325s) {
            return fArrP;
        }
        if (X0.a(fArrP, fArrC)) {
            return fArrC;
        }
        fArrC[0] = Float.NaN;
        return null;
    }

    private final float[] p() {
        u();
        return this.f27314h;
    }

    private final void q(boolean z10) {
        if (z10 != this.f27316j) {
            this.f27316j = z10;
            this.f27309c.K0(this, z10);
        }
    }

    private final void t() {
        if (Build.VERSION.SDK_INT >= 26) {
            N1.f27333a.a(this.f27309c);
        } else {
            this.f27309c.invalidate();
        }
    }

    private final void u() {
        if (this.f27323q) {
            C6811c c6811c = this.f27307a;
            long jB = (c6811c.p() & 9223372034707292159L) == 9205357640488583168L ? AbstractC6231m.b(AbstractC5026s.d(this.f27312f)) : c6811c.p();
            C6356g1.i(this.f27314h, Float.intBitsToFloat((int) (jB >> 32)), Float.intBitsToFloat((int) (jB & 4294967295L)), c6811c.y(), c6811c.z(), 1.0f, c6811c.q(), c6811c.r(), c6811c.s(), c6811c.t(), c6811c.u(), 1.0f);
            this.f27323q = false;
            this.f27325s = AbstractC6359h1.a(this.f27314h);
        }
    }

    private final void v() {
        InterfaceC5082a interfaceC5082a;
        AbstractC6362i1 abstractC6362i1 = this.f27322p;
        if (abstractC6362i1 == null) {
            return;
        }
        AbstractC6813e.b(this.f27307a, abstractC6362i1);
        if (!(abstractC6362i1 instanceof AbstractC6362i1.a) || Build.VERSION.SDK_INT >= 33 || (interfaceC5082a = this.f27311e) == null) {
            return;
        }
        interfaceC5082a.invoke();
    }

    @Override // K0.o0
    public void a(float[] fArr) {
        C6356g1.l(fArr, p());
    }

    @Override // K0.o0
    public float[] b() {
        return p();
    }

    @Override // K0.o0
    public void c(Function2 function2, InterfaceC5082a interfaceC5082a) {
        s0.Z0 z02 = this.f27308b;
        if (z02 == null) {
            H0.a.c("currently reuse is only supported when we manage the layer lifecycle");
            throw new C2160k();
        }
        if (!this.f27307a.A()) {
            H0.a.a("layer should have been released before reuse");
        }
        this.f27307a = z02.a();
        this.f27313g = false;
        this.f27310d = function2;
        this.f27311e = interfaceC5082a;
        this.f27323q = false;
        this.f27324r = false;
        this.f27325s = true;
        C6356g1.h(this.f27314h);
        float[] fArr = this.f27315i;
        if (fArr != null) {
            C6356g1.h(fArr);
        }
        this.f27321o = androidx.compose.ui.graphics.j.f26818b.a();
        this.f27328v = false;
        long j10 = Integer.MAX_VALUE;
        this.f27312f = C5025r.c((j10 & 4294967295L) | (j10 << 32));
        this.f27322p = null;
        this.f27320n = 0;
    }

    @Override // K0.o0
    public long d(long j10, boolean z10) {
        float[] fArrP;
        if (z10) {
            fArrP = o();
            if (fArrP == null) {
                return C6224f.f58329b.a();
            }
        } else {
            fArrP = p();
        }
        return this.f27325s ? j10 : C6356g1.f(fArrP, j10);
    }

    @Override // K0.o0
    public void destroy() {
        r(0.0f);
        s(false);
        this.f27310d = null;
        this.f27311e = null;
        this.f27313g = true;
        q(false);
        s0.Z0 z02 = this.f27308b;
        if (z02 != null) {
            z02.b(this.f27307a);
            this.f27309c.P0(this);
        }
    }

    @Override // K0.o0
    public void e(long j10) {
        if (C5025r.e(j10, this.f27312f)) {
            return;
        }
        if (this.f27309c.getIsArrEnabled()) {
            this.f27309c.C(l0.i.f52342a.a());
        }
        this.f27312f = j10;
        invalidate();
    }

    @Override // K0.o0
    public void f(C6222d c6222d, boolean z10) {
        float[] fArrO = z10 ? o() : p();
        if (this.f27325s) {
            return;
        }
        if (fArrO == null) {
            c6222d.g(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            C6356g1.g(fArrO, c6222d);
        }
    }

    @Override // K0.o0
    public boolean g(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        if (this.f27307a.l()) {
            return AbstractC2721n1.c(this.f27307a.o(), fIntBitsToFloat, fIntBitsToFloat2, null, null, 24, null);
        }
        return true;
    }

    @Override // K0.o0
    public void h(androidx.compose.ui.graphics.h hVar) {
        int iB;
        InterfaceC5082a interfaceC5082a;
        int iN = hVar.N() | this.f27320n;
        this.f27318l = hVar.L();
        this.f27317k = hVar.I();
        int i10 = iN & 4096;
        if (i10 != 0) {
            this.f27321o = hVar.r0();
        }
        if ((iN & 1) != 0) {
            this.f27307a.a0(hVar.u());
        }
        if ((iN & 2) != 0) {
            this.f27307a.b0(hVar.H());
        }
        if ((iN & 4) != 0) {
            this.f27307a.K(hVar.b());
        }
        if ((iN & 8) != 0) {
            this.f27307a.g0(hVar.D());
        }
        if ((iN & 16) != 0) {
            this.f27307a.h0(hVar.C());
        }
        if ((iN & 32) != 0) {
            this.f27307a.c0(hVar.V());
            if (hVar.V() > 0.0f && !this.f27328v && (interfaceC5082a = this.f27311e) != null) {
                interfaceC5082a.invoke();
            }
        }
        if ((iN & 64) != 0) {
            this.f27307a.L(hVar.j());
        }
        if ((iN & 128) != 0) {
            this.f27307a.e0(hVar.Y());
        }
        if ((iN & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
            this.f27307a.Y(hVar.i());
        }
        if ((iN & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            this.f27307a.W(hVar.E());
        }
        if ((iN & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            this.f27307a.X(hVar.h());
        }
        if ((iN & 2048) != 0) {
            this.f27307a.N(hVar.m());
        }
        if (i10 != 0) {
            if (androidx.compose.ui.graphics.j.e(this.f27321o, androidx.compose.ui.graphics.j.f26818b.a())) {
                this.f27307a.S(C6224f.f58329b.b());
            } else {
                this.f27307a.S(C6224f.e((((long) Float.floatToRawIntBits(androidx.compose.ui.graphics.j.g(this.f27321o) * ((int) (this.f27312f & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(androidx.compose.ui.graphics.j.f(this.f27321o) * ((int) (this.f27312f >> 32)))) << 32)));
            }
        }
        if ((iN & 16384) != 0) {
            this.f27307a.O(hVar.q());
        }
        if ((131072 & iN) != 0) {
            this.f27307a.V(hVar.U());
        }
        if ((262144 & iN) != 0) {
            this.f27307a.P(hVar.z());
        }
        if ((524288 & iN) != 0) {
            this.f27307a.M(hVar.p());
        }
        if ((32768 & iN) != 0) {
            C6811c c6811c = this.f27307a;
            int iB2 = hVar.B();
            e.a aVar = androidx.compose.ui.graphics.e.f26765b;
            if (androidx.compose.ui.graphics.e.g(iB2, aVar.a())) {
                iB = AbstractC6810b.f61788a.a();
            } else if (androidx.compose.ui.graphics.e.g(iB2, aVar.c())) {
                iB = AbstractC6810b.f61788a.c();
            } else {
                if (!androidx.compose.ui.graphics.e.g(iB2, aVar.b())) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
                iB = AbstractC6810b.f61788a.b();
            }
            c6811c.Q(iB);
        }
        boolean z10 = true;
        if ((iN & 7963) != 0) {
            this.f27323q = true;
            this.f27324r = true;
        }
        if (AbstractC5504s.c(this.f27322p, hVar.S())) {
            z10 = false;
        } else {
            this.f27322p = hVar.S();
            v();
        }
        this.f27320n = hVar.N();
        if (iN != 0 || z10) {
            t();
            if (this.f27309c.getIsArrEnabled()) {
                this.f27309c.C(n());
            }
        }
    }

    @Override // K0.o0
    public void i(InterfaceC6364j0 interfaceC6364j0, C6811c c6811c) {
        l();
        this.f27328v = this.f27307a.v() > 0.0f;
        InterfaceC6709d interfaceC6709dN1 = this.f27319m.n1();
        interfaceC6709dN1.h(interfaceC6364j0);
        interfaceC6709dN1.i(c6811c);
        AbstractC6813e.a(this.f27319m, this.f27307a);
    }

    @Override // K0.o0
    public void invalidate() {
        if (this.f27316j || this.f27313g) {
            return;
        }
        this.f27309c.invalidate();
        q(true);
    }

    @Override // K0.o0
    public void j(float[] fArr) {
        float[] fArrO = o();
        if (fArrO != null) {
            C6356g1.l(fArr, fArrO);
        }
    }

    @Override // K0.o0
    public void k(long j10) {
        if (this.f27309c.getIsArrEnabled()) {
            this.f27309c.C(l0.i.f52342a.a());
        }
        this.f27307a.f0(j10);
        t();
    }

    @Override // K0.o0
    public void l() {
        if (this.f27309c.getIsArrEnabled() && n() != 0.0f) {
            this.f27309c.C(n());
        }
        if (this.f27316j) {
            if (!androidx.compose.ui.graphics.j.e(this.f27321o, androidx.compose.ui.graphics.j.f26818b.a()) && !C5025r.e(this.f27307a.w(), this.f27312f)) {
                C6811c c6811c = this.f27307a;
                float f10 = androidx.compose.ui.graphics.j.f(this.f27321o) * ((int) (this.f27312f >> 32));
                c6811c.S(C6224f.e((((long) Float.floatToRawIntBits(androidx.compose.ui.graphics.j.g(this.f27321o) * ((int) (this.f27312f & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32)));
            }
            this.f27307a.F(this.f27317k, this.f27318l, this.f27312f, this.f27329w);
            q(false);
        }
    }

    public float n() {
        return this.f27326t;
    }

    public void r(float f10) {
        this.f27326t = f10;
    }

    public void s(boolean z10) {
        this.f27327u = z10;
    }
}
