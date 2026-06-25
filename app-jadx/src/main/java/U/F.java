package U;

import K0.AbstractC1792i;
import K0.InterfaceC1790h;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.s;
import i1.C5015h;
import ke.AbstractC5466a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class F extends e.c implements InterfaceC1790h, K0.E {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f17609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f17610b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f17611c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, androidx.compose.ui.layout.s sVar, int i11) {
            super(1);
            this.f17609a = i10;
            this.f17610b = sVar;
            this.f17611c = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return Td.L.f17438a;
        }

        public final void invoke(s.a aVar) {
            s.a.N(aVar, this.f17610b, AbstractC5466a.d((this.f17609a - this.f17610b.W0()) / 2.0f), AbstractC5466a.d((this.f17611c - this.f17610b.P0()) / 2.0f), 0.0f, 4, null);
        }
    }

    @Override // K0.E
    /* JADX INFO: renamed from: measure-3p2s80s */
    public I0.C mo5measure3p2s80s(androidx.compose.ui.layout.l lVar, I0.A a10, long j10) {
        float f10 = 0;
        float fN = C5015h.n(AbstractC5874j.d(((C5015h) AbstractC1792i.a(this, C.a())).t(), C5015h.n(f10)));
        androidx.compose.ui.layout.s sVarV0 = a10.v0(j10);
        boolean z10 = isAttached() && !Float.isNaN(fN) && C5015h.m(fN, C5015h.n(f10)) > 0;
        int iS0 = Float.isNaN(fN) ? 0 : lVar.s0(fN);
        int iMax = z10 ? Math.max(sVarV0.W0(), iS0) : sVarV0.W0();
        int iMax2 = z10 ? Math.max(sVarV0.P0(), iS0) : sVarV0.P0();
        return androidx.compose.ui.layout.l.u0(lVar, iMax, iMax2, null, new a(iMax, sVarV0, iMax2), 4, null);
    }
}
