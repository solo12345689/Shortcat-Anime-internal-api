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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class u extends e.c implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f26238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f26239b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f26240a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.s sVar) {
            super(1);
            this.f26240a = sVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
            s.a.W(aVar, this.f26240a, 0, 0, 0.0f, 4, null);
        }
    }

    public /* synthetic */ u(float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11);
    }

    public final void E1(float f10) {
        this.f26239b = f10;
    }

    public final void F1(float f10) {
        this.f26238a = f10;
    }

    @Override // K0.E
    public int maxIntrinsicHeight(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return AbstractC5874j.e(interfaceC1686l.I(i10), !C5015h.q(this.f26239b, C5015h.f48547b.c()) ? interfaceC1687m.s0(this.f26239b) : 0);
    }

    @Override // K0.E
    public int maxIntrinsicWidth(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return AbstractC5874j.e(interfaceC1686l.q0(i10), !C5015h.q(this.f26238a, C5015h.f48547b.c()) ? interfaceC1687m.s0(this.f26238a) : 0);
    }

    @Override // K0.E
    /* JADX INFO: renamed from: measure-3p2s80s */
    public C mo5measure3p2s80s(androidx.compose.ui.layout.l lVar, A a10, long j10) {
        float f10 = this.f26238a;
        C5015h.a aVar = C5015h.f48547b;
        androidx.compose.ui.layout.s sVarV0 = a10.v0(AbstractC5010c.a((C5015h.q(f10, aVar.c()) || C5009b.n(j10) != 0) ? C5009b.n(j10) : AbstractC5874j.e(AbstractC5874j.i(lVar.s0(this.f26238a), C5009b.l(j10)), 0), C5009b.l(j10), (C5015h.q(this.f26239b, aVar.c()) || C5009b.m(j10) != 0) ? C5009b.m(j10) : AbstractC5874j.e(AbstractC5874j.i(lVar.s0(this.f26239b), C5009b.k(j10)), 0), C5009b.k(j10)));
        return androidx.compose.ui.layout.l.u0(lVar, sVarV0.W0(), sVarV0.P0(), null, new a(sVarV0), 4, null);
    }

    @Override // K0.E
    public int minIntrinsicHeight(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return AbstractC5874j.e(interfaceC1686l.Z(i10), !C5015h.q(this.f26239b, C5015h.f48547b.c()) ? interfaceC1687m.s0(this.f26239b) : 0);
    }

    @Override // K0.E
    public int minIntrinsicWidth(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return AbstractC5874j.e(interfaceC1686l.l0(i10), !C5015h.q(this.f26238a, C5015h.f48547b.c()) ? interfaceC1687m.s0(this.f26238a) : 0);
    }

    private u(float f10, float f11) {
        this.f26238a = f10;
        this.f26239b = f11;
    }
}
