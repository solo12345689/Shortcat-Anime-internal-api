package androidx.compose.foundation.layout;

import I0.A;
import I0.AbstractC1675a;
import I0.AbstractC1676b;
import I0.C;
import I0.C1685k;
import Td.L;
import androidx.compose.ui.layout.s;
import androidx.compose.ui.platform.T0;
import androidx.compose.ui.platform.V0;
import i1.C5009b;
import i1.C5015h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0453a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC1675a f26118a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ float f26119b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f26120c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f26121d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f26122e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ androidx.compose.ui.layout.s f26123f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ int f26124g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0453a(AbstractC1675a abstractC1675a, float f10, int i10, int i11, int i12, androidx.compose.ui.layout.s sVar, int i13) {
            super(1);
            this.f26118a = abstractC1675a;
            this.f26119b = f10;
            this.f26120c = i10;
            this.f26121d = i11;
            this.f26122e = i12;
            this.f26123f = sVar;
            this.f26124g = i13;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
            int iW0;
            if (a.d(this.f26118a)) {
                iW0 = 0;
            } else {
                iW0 = !C5015h.q(this.f26119b, C5015h.f48547b.c()) ? this.f26120c : (this.f26121d - this.f26122e) - this.f26123f.W0();
            }
            s.a.W(aVar, this.f26123f, iW0, a.d(this.f26118a) ? !C5015h.q(this.f26119b, C5015h.f48547b.c()) ? this.f26120c : (this.f26124g - this.f26122e) - this.f26123f.P0() : 0, 0.0f, 4, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC1675a f26125a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ float f26126b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ float f26127c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC1675a abstractC1675a, float f10, float f11) {
            super(1);
            this.f26125a = abstractC1675a;
            this.f26126b = f10;
            this.f26127c = f11;
        }

        public final void a(V0 v02) {
            v02.d("paddingFrom");
            v02.b().c("alignmentLine", this.f26125a);
            v02.b().c("before", C5015h.h(this.f26126b));
            v02.b().c("after", C5015h.h(this.f26127c));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return L.f17438a;
        }
    }

    public static final C c(androidx.compose.ui.layout.l lVar, AbstractC1675a abstractC1675a, float f10, float f11, A a10, long j10) {
        androidx.compose.ui.layout.s sVarV0 = a10.v0(d(abstractC1675a) ? C5009b.d(j10, 0, 0, 0, 0, 11, null) : C5009b.d(j10, 0, 0, 0, 0, 14, null));
        int iN = sVarV0.N(abstractC1675a);
        if (iN == Integer.MIN_VALUE) {
            iN = 0;
        }
        int iP0 = d(abstractC1675a) ? sVarV0.P0() : sVarV0.W0();
        int iK = d(abstractC1675a) ? C5009b.k(j10) : C5009b.l(j10);
        C5015h.a aVar = C5015h.f48547b;
        int i10 = iK - iP0;
        int iM = AbstractC5874j.m((!C5015h.q(f10, aVar.c()) ? lVar.s0(f10) : 0) - iN, 0, i10);
        int iM2 = AbstractC5874j.m(((!C5015h.q(f11, aVar.c()) ? lVar.s0(f11) : 0) - iP0) + iN, 0, i10 - iM);
        int iW0 = d(abstractC1675a) ? sVarV0.W0() : Math.max(sVarV0.W0() + iM + iM2, C5009b.n(j10));
        int iMax = d(abstractC1675a) ? Math.max(sVarV0.P0() + iM + iM2, C5009b.m(j10)) : sVarV0.P0();
        int i11 = iW0;
        return androidx.compose.ui.layout.l.u0(lVar, i11, iMax, null, new C0453a(abstractC1675a, f10, iM, i11, iM2, sVarV0, iMax), 4, null);
    }

    public static final boolean d(AbstractC1675a abstractC1675a) {
        return abstractC1675a instanceof C1685k;
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, AbstractC1675a abstractC1675a, float f10, float f11) {
        return eVar.then(new AlignmentLineOffsetDpElement(abstractC1675a, f10, f11, T0.b() ? new b(abstractC1675a, f10, f11) : T0.a(), null));
    }

    public static /* synthetic */ androidx.compose.ui.e f(androidx.compose.ui.e eVar, AbstractC1675a abstractC1675a, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = C5015h.f48547b.c();
        }
        if ((i10 & 4) != 0) {
            f11 = C5015h.f48547b.c();
        }
        return e(eVar, abstractC1675a, f10, f11);
    }

    public static final androidx.compose.ui.e g(androidx.compose.ui.e eVar, float f10, float f11) {
        C5015h.a aVar = C5015h.f48547b;
        return eVar.then(!C5015h.q(f10, aVar.c()) ? f(androidx.compose.ui.e.f26613a, AbstractC1676b.a(), f10, 0.0f, 4, null) : androidx.compose.ui.e.f26613a).then(!C5015h.q(f11, aVar.c()) ? f(androidx.compose.ui.e.f26613a, AbstractC1676b.b(), 0.0f, f11, 2, null) : androidx.compose.ui.e.f26613a);
    }
}
