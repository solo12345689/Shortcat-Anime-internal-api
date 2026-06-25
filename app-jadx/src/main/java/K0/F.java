package K0;

import I0.AbstractC1675a;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.C2673b;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i1.C5009b;
import i1.C5021n;
import i1.C5025r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.AbstractC6371l1;
import s0.C6385r0;
import s0.InterfaceC6364j0;
import s0.InterfaceC6368k1;
import v0.C6811c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class F extends AbstractC1785e0 {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private static final InterfaceC6368k1 f10411A0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final a f10412z0 = new a(null);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private E f10413v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private C5009b f10414w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private U f10415x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private C2673b f10416y0;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class b extends U {
        public b() {
            super(F.this);
        }

        @Override // K0.U, I0.InterfaceC1686l
        public int I(int i10) {
            E eL3 = F.this.L3();
            U uI2 = F.this.M3().I2();
            AbstractC5504s.e(uI2);
            return eL3.maxIntrinsicHeight(this, uI2, i10);
        }

        @Override // K0.U, I0.InterfaceC1686l
        public int Z(int i10) {
            E eL3 = F.this.L3();
            U uI2 = F.this.M3().I2();
            AbstractC5504s.e(uI2);
            return eL3.minIntrinsicHeight(this, uI2, i10);
        }

        @Override // K0.U, I0.InterfaceC1686l
        public int l0(int i10) {
            E eL3 = F.this.L3();
            U uI2 = F.this.M3().I2();
            AbstractC5504s.e(uI2);
            return eL3.minIntrinsicWidth(this, uI2, i10);
        }

        @Override // K0.U, I0.InterfaceC1686l
        public int q0(int i10) {
            E eL3 = F.this.L3();
            U uI2 = F.this.M3().I2();
            AbstractC5504s.e(uI2);
            return eL3.maxIntrinsicWidth(this, uI2, i10);
        }

        @Override // I0.A
        public androidx.compose.ui.layout.s v0(long j10) {
            F f10 = F.this;
            i1(j10);
            f10.P3(C5009b.a(j10));
            E eL3 = f10.L3();
            U uI2 = f10.M3().I2();
            AbstractC5504s.e(uI2);
            p2(eL3.mo5measure3p2s80s(this, uI2, j10));
            return this;
        }

        @Override // K0.T
        public int y1(AbstractC1675a abstractC1675a) {
            int iB = G.b(this, abstractC1675a);
            g2().u(abstractC1675a, iB);
            return iB;
        }
    }

    static {
        InterfaceC6368k1 interfaceC6368k1A = s0.Q.a();
        interfaceC6368k1A.p(C6385r0.f58985b.b());
        interfaceC6368k1A.A(1.0f);
        interfaceC6368k1A.z(AbstractC6371l1.f58959a.b());
        f10411A0 = interfaceC6368k1A;
    }

    public F(J j10, E e10) {
        super(j10);
        this.f10413v0 = e10;
        C2673b c2673b = null;
        this.f10415x0 = j10.j0() != null ? new b() : null;
        if ((e10.getNode().getKindSet$ui_release() & AbstractC1789g0.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING)) != 0) {
            AbstractC5504s.f(e10, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
            android.support.v4.media.session.b.a(e10);
            c2673b = new C2673b(this, null);
        }
        this.f10416y0 = c2673b;
    }

    private final void N3() {
        if (V1()) {
            return;
        }
        i3();
        C2673b c2673b = this.f10416y0;
        if (c2673b == null) {
            M1().A();
            M3().s3(false);
            return;
        }
        c2673b.b();
        O1();
        U uI2 = I2();
        AbstractC5504s.e(uI2);
        uI2.j2();
        throw null;
    }

    @Override // I0.InterfaceC1686l
    public int I(int i10) {
        C2673b c2673b = this.f10416y0;
        if (c2673b == null) {
            return this.f10413v0.maxIntrinsicHeight(this, M3(), i10);
        }
        c2673b.b();
        M3();
        throw null;
    }

    @Override // K0.AbstractC1785e0
    public U I2() {
        return this.f10415x0;
    }

    public final E L3() {
        return this.f10413v0;
    }

    public final AbstractC1785e0 M3() {
        AbstractC1785e0 abstractC1785e0O2 = O2();
        AbstractC5504s.e(abstractC1785e0O2);
        return abstractC1785e0O2;
    }

    @Override // K0.AbstractC1785e0
    public e.c N2() {
        return this.f10413v0.getNode();
    }

    public final void O3(E e10) {
        if (!AbstractC5504s.c(e10, this.f10413v0)) {
            e.c node = e10.getNode();
            if ((node.getKindSet$ui_release() & AbstractC1789g0.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING)) != 0) {
                AbstractC5504s.f(e10, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
                android.support.v4.media.session.b.a(e10);
                C2673b c2673b = this.f10416y0;
                if (c2673b != null) {
                    android.support.v4.media.session.b.a(e10);
                    c2673b.q(null);
                } else {
                    android.support.v4.media.session.b.a(e10);
                    c2673b = new C2673b(this, null);
                }
                this.f10416y0 = c2673b;
            } else {
                this.f10416y0 = null;
            }
        }
        this.f10413v0 = e10;
    }

    public final void P3(C5009b c5009b) {
        this.f10414w0 = c5009b;
    }

    protected void Q3(U u10) {
        this.f10415x0 = u10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // K0.AbstractC1785e0, androidx.compose.ui.layout.s
    public void Y0(long j10, float f10, Function1 function1) {
        super.Y0(j10, f10, function1);
        N3();
    }

    @Override // I0.InterfaceC1686l
    public int Z(int i10) {
        C2673b c2673b = this.f10416y0;
        if (c2673b == null) {
            return this.f10413v0.minIntrinsicHeight(this, M3(), i10);
        }
        c2673b.b();
        M3();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // K0.AbstractC1785e0, androidx.compose.ui.layout.s
    public void a1(long j10, float f10, C6811c c6811c) {
        super.a1(j10, f10, c6811c);
        N3();
    }

    @Override // I0.InterfaceC1686l
    public int l0(int i10) {
        C2673b c2673b = this.f10416y0;
        if (c2673b == null) {
            return this.f10413v0.minIntrinsicWidth(this, M3(), i10);
        }
        c2673b.b();
        M3();
        throw null;
    }

    @Override // K0.AbstractC1785e0
    public void m3(InterfaceC6364j0 interfaceC6364j0, C6811c c6811c) {
        AbstractC1785e0 abstractC1785e0O2;
        M3().u2(interfaceC6364j0, c6811c);
        if (!N.b(L1()).getShowLayoutBounds() || (abstractC1785e0O2 = O2()) == null) {
            return;
        }
        if (C5025r.e(a(), abstractC1785e0O2.a()) && C5021n.j(abstractC1785e0O2.P1(), C5021n.f48560b.b())) {
            return;
        }
        v2(interfaceC6364j0, f10411A0);
    }

    @Override // I0.InterfaceC1686l
    public int q0(int i10) {
        C2673b c2673b = this.f10416y0;
        if (c2673b == null) {
            return this.f10413v0.maxIntrinsicWidth(this, M3(), i10);
        }
        c2673b.b();
        M3();
        throw null;
    }

    @Override // I0.A
    public androidx.compose.ui.layout.s v0(long j10) {
        if (E2()) {
            C5009b c5009b = this.f10414w0;
            if (c5009b == null) {
                throw new IllegalArgumentException("Lookahead constraints cannot be null in approach pass.");
            }
            j10 = c5009b.r();
        }
        i1(j10);
        C2673b c2673b = this.f10416y0;
        if (c2673b == null) {
            t3(L3().mo5measure3p2s80s(this, M3(), j10));
            h3();
            return this;
        }
        c2673b.b();
        c2673b.p();
        throw null;
    }

    @Override // K0.AbstractC1785e0
    public void x2() {
        if (I2() == null) {
            Q3(new b());
        }
    }

    @Override // K0.T
    public int y1(AbstractC1675a abstractC1675a) {
        U uI2 = I2();
        return uI2 != null ? uI2.f2(abstractC1675a) : G.b(this, abstractC1675a);
    }
}
