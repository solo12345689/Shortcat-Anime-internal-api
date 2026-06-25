package androidx.compose.foundation.layout;

import C.EnumC1143n;
import I0.A;
import I0.C;
import K0.E;
import Td.L;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.s;
import i1.AbstractC5010c;
import i1.C5009b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class i extends e.c implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private EnumC1143n f26163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f26164b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f26165a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.s sVar) {
            super(1);
            this.f26165a = sVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
            s.a.W(aVar, this.f26165a, 0, 0, 0.0f, 4, null);
        }
    }

    public i(EnumC1143n enumC1143n, float f10) {
        this.f26163a = enumC1143n;
        this.f26164b = f10;
    }

    public final void E1(EnumC1143n enumC1143n) {
        this.f26163a = enumC1143n;
    }

    public final void F1(float f10) {
        this.f26164b = f10;
    }

    @Override // K0.E
    /* JADX INFO: renamed from: measure-3p2s80s */
    public C mo5measure3p2s80s(androidx.compose.ui.layout.l lVar, A a10, long j10) {
        int iN;
        int iL;
        int iK;
        int iM;
        if (!C5009b.h(j10) || this.f26163a == EnumC1143n.Vertical) {
            iN = C5009b.n(j10);
            iL = C5009b.l(j10);
        } else {
            iN = AbstractC5874j.m(Math.round(C5009b.l(j10) * this.f26164b), C5009b.n(j10), C5009b.l(j10));
            iL = iN;
        }
        if (!C5009b.g(j10) || this.f26163a == EnumC1143n.Horizontal) {
            int iM2 = C5009b.m(j10);
            iK = C5009b.k(j10);
            iM = iM2;
        } else {
            iM = AbstractC5874j.m(Math.round(C5009b.k(j10) * this.f26164b), C5009b.m(j10), C5009b.k(j10));
            iK = iM;
        }
        androidx.compose.ui.layout.s sVarV0 = a10.v0(AbstractC5010c.a(iN, iL, iM, iK));
        return androidx.compose.ui.layout.l.u0(lVar, sVarV0.W0(), sVarV0.P0(), null, new a(sVarV0), 4, null);
    }
}
