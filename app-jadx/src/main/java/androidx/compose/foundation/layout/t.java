package androidx.compose.foundation.layout;

import I0.A;
import I0.C;
import I0.InterfaceC1686l;
import I0.InterfaceC1687m;
import K0.E;
import Td.L;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.s;
import i1.AbstractC5010c;
import i1.C5009b;
import i1.C5015h;
import i1.InterfaceC5011d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class t extends e.c implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f26232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f26233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f26234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f26235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f26236e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f26237a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.s sVar) {
            super(1);
            this.f26237a = sVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
            s.a.W(aVar, this.f26237a, 0, 0, 0.0f, 4, null);
        }
    }

    public /* synthetic */ t(float f10, float f11, float f12, float f13, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, z10);
    }

    private final long E1(InterfaceC5011d interfaceC5011d) {
        int iE;
        int iE2;
        float f10 = this.f26234c;
        C5015h.a aVar = C5015h.f48547b;
        int i10 = 0;
        int iE3 = !C5015h.q(f10, aVar.c()) ? AbstractC5874j.e(interfaceC5011d.s0(this.f26234c), 0) : Integer.MAX_VALUE;
        int iE4 = !C5015h.q(this.f26235d, aVar.c()) ? AbstractC5874j.e(interfaceC5011d.s0(this.f26235d), 0) : Integer.MAX_VALUE;
        if (C5015h.q(this.f26232a, aVar.c()) || (iE = AbstractC5874j.e(AbstractC5874j.i(interfaceC5011d.s0(this.f26232a), iE3), 0)) == Integer.MAX_VALUE) {
            iE = 0;
        }
        if (!C5015h.q(this.f26233b, aVar.c()) && (iE2 = AbstractC5874j.e(AbstractC5874j.i(interfaceC5011d.s0(this.f26233b), iE4), 0)) != Integer.MAX_VALUE) {
            i10 = iE2;
        }
        return AbstractC5010c.a(iE, iE3, i10, iE4);
    }

    public final void F1(boolean z10) {
        this.f26236e = z10;
    }

    public final void G1(float f10) {
        this.f26235d = f10;
    }

    public final void H1(float f10) {
        this.f26234c = f10;
    }

    public final void I1(float f10) {
        this.f26233b = f10;
    }

    public final void J1(float f10) {
        this.f26232a = f10;
    }

    @Override // K0.E
    public int maxIntrinsicHeight(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        long jE1 = E1(interfaceC1687m);
        return C5009b.i(jE1) ? C5009b.k(jE1) : AbstractC5010c.f(jE1, interfaceC1686l.I(i10));
    }

    @Override // K0.E
    public int maxIntrinsicWidth(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        long jE1 = E1(interfaceC1687m);
        return C5009b.j(jE1) ? C5009b.l(jE1) : AbstractC5010c.g(jE1, interfaceC1686l.q0(i10));
    }

    @Override // K0.E
    /* JADX INFO: renamed from: measure-3p2s80s */
    public C mo5measure3p2s80s(androidx.compose.ui.layout.l lVar, A a10, long j10) {
        long jA;
        long jE1 = E1(lVar);
        if (this.f26236e) {
            jA = AbstractC5010c.e(j10, jE1);
        } else {
            float f10 = this.f26232a;
            C5015h.a aVar = C5015h.f48547b;
            jA = AbstractC5010c.a(!C5015h.q(f10, aVar.c()) ? C5009b.n(jE1) : AbstractC5874j.i(C5009b.n(j10), C5009b.l(jE1)), !C5015h.q(this.f26234c, aVar.c()) ? C5009b.l(jE1) : AbstractC5874j.e(C5009b.l(j10), C5009b.n(jE1)), !C5015h.q(this.f26233b, aVar.c()) ? C5009b.m(jE1) : AbstractC5874j.i(C5009b.m(j10), C5009b.k(jE1)), !C5015h.q(this.f26235d, aVar.c()) ? C5009b.k(jE1) : AbstractC5874j.e(C5009b.k(j10), C5009b.m(jE1)));
        }
        androidx.compose.ui.layout.s sVarV0 = a10.v0(jA);
        return androidx.compose.ui.layout.l.u0(lVar, sVarV0.W0(), sVarV0.P0(), null, new a(sVarV0), 4, null);
    }

    @Override // K0.E
    public int minIntrinsicHeight(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        long jE1 = E1(interfaceC1687m);
        return C5009b.i(jE1) ? C5009b.k(jE1) : AbstractC5010c.f(jE1, interfaceC1686l.Z(i10));
    }

    @Override // K0.E
    public int minIntrinsicWidth(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        long jE1 = E1(interfaceC1687m);
        return C5009b.j(jE1) ? C5009b.l(jE1) : AbstractC5010c.g(jE1, interfaceC1686l.l0(i10));
    }

    private t(float f10, float f11, float f12, float f13, boolean z10) {
        this.f26232a = f10;
        this.f26233b = f11;
        this.f26234c = f12;
        this.f26235d = f13;
        this.f26236e = z10;
    }
}
