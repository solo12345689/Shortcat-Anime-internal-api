package x;

import I0.InterfaceC1686l;
import I0.InterfaceC1687m;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.s;
import i1.C5009b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends e.c implements K0.E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private androidx.compose.foundation.o f63321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f63322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f63323c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f63325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f63326c;

        /* JADX INFO: renamed from: x.b0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0956a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.s f63327a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f63328b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f63329c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0956a(androidx.compose.ui.layout.s sVar, int i10, int i11) {
                super(1);
                this.f63327a = sVar;
                this.f63328b = i10;
                this.f63329c = i11;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((s.a) obj);
                return Td.L.f17438a;
            }

            public final void invoke(s.a aVar) {
                s.a.f0(aVar, this.f63327a, this.f63328b, this.f63329c, 0.0f, null, 12, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, androidx.compose.ui.layout.s sVar) {
            super(1);
            this.f63325b = i10;
            this.f63326c = sVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return Td.L.f17438a;
        }

        public final void invoke(s.a aVar) {
            int iM = AbstractC5874j.m(b0.this.E1().m(), 0, this.f63325b);
            int i10 = b0.this.F1() ? iM - this.f63325b : -iM;
            aVar.E0(new C0956a(this.f63326c, b0.this.G1() ? 0 : i10, b0.this.G1() ? i10 : 0));
        }
    }

    public b0(androidx.compose.foundation.o oVar, boolean z10, boolean z11) {
        this.f63321a = oVar;
        this.f63322b = z10;
        this.f63323c = z11;
    }

    public final androidx.compose.foundation.o E1() {
        return this.f63321a;
    }

    public final boolean F1() {
        return this.f63322b;
    }

    public final boolean G1() {
        return this.f63323c;
    }

    public final void H1(boolean z10) {
        this.f63322b = z10;
    }

    public final void I1(androidx.compose.foundation.o oVar) {
        this.f63321a = oVar;
    }

    public final void J1(boolean z10) {
        this.f63323c = z10;
    }

    @Override // K0.E
    public int maxIntrinsicHeight(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return this.f63323c ? interfaceC1686l.I(i10) : interfaceC1686l.I(Integer.MAX_VALUE);
    }

    @Override // K0.E
    public int maxIntrinsicWidth(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return this.f63323c ? interfaceC1686l.q0(Integer.MAX_VALUE) : interfaceC1686l.q0(i10);
    }

    @Override // K0.E
    /* JADX INFO: renamed from: measure-3p2s80s */
    public I0.C mo5measure3p2s80s(androidx.compose.ui.layout.l lVar, I0.A a10, long j10) {
        AbstractC7012j.a(j10, this.f63323c ? z.q.Vertical : z.q.Horizontal);
        androidx.compose.ui.layout.s sVarV0 = a10.v0(C5009b.d(j10, 0, this.f63323c ? C5009b.l(j10) : Integer.MAX_VALUE, 0, this.f63323c ? Integer.MAX_VALUE : C5009b.k(j10), 5, null));
        int i10 = AbstractC5874j.i(sVarV0.W0(), C5009b.l(j10));
        int i11 = AbstractC5874j.i(sVarV0.P0(), C5009b.k(j10));
        int iP0 = sVarV0.P0() - i11;
        int iW0 = sVarV0.W0() - i10;
        if (!this.f63323c) {
            iP0 = iW0;
        }
        this.f63321a.n(iP0);
        this.f63321a.p(this.f63323c ? i11 : i10);
        return androidx.compose.ui.layout.l.u0(lVar, i10, i11, null, new a(iP0, sVarV0), 4, null);
    }

    @Override // K0.E
    public int minIntrinsicHeight(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return this.f63323c ? interfaceC1686l.Z(i10) : interfaceC1686l.Z(Integer.MAX_VALUE);
    }

    @Override // K0.E
    public int minIntrinsicWidth(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return this.f63323c ? interfaceC1686l.l0(Integer.MAX_VALUE) : interfaceC1686l.l0(i10);
    }
}
