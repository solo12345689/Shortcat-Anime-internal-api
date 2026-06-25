package androidx.compose.foundation.layout;

import C.A;
import I0.C;
import K0.E;
import Td.L;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.s;
import i1.AbstractC5010c;
import i1.C5015h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class r extends e.c implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private A f26197a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f26198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.l f26199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f26200c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.s sVar, androidx.compose.ui.layout.l lVar, r rVar) {
            super(1);
            this.f26198a = sVar;
            this.f26199b = lVar;
            this.f26200c = rVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
            s.a.N(aVar, this.f26198a, this.f26199b.s0(this.f26200c.E1().b(this.f26199b.getLayoutDirection())), this.f26199b.s0(this.f26200c.E1().d()), 0.0f, 4, null);
        }
    }

    public r(A a10) {
        this.f26197a = a10;
    }

    public final A E1() {
        return this.f26197a;
    }

    public final void F1(A a10) {
        this.f26197a = a10;
    }

    @Override // K0.E
    /* JADX INFO: renamed from: measure-3p2s80s */
    public C mo5measure3p2s80s(androidx.compose.ui.layout.l lVar, I0.A a10, long j10) {
        float f10 = 0;
        if (C5015h.m(this.f26197a.b(lVar.getLayoutDirection()), C5015h.n(f10)) < 0 || C5015h.m(this.f26197a.d(), C5015h.n(f10)) < 0 || C5015h.m(this.f26197a.a(lVar.getLayoutDirection()), C5015h.n(f10)) < 0 || C5015h.m(this.f26197a.c(), C5015h.n(f10)) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
        int iS0 = lVar.s0(this.f26197a.b(lVar.getLayoutDirection())) + lVar.s0(this.f26197a.a(lVar.getLayoutDirection()));
        int iS02 = lVar.s0(this.f26197a.d()) + lVar.s0(this.f26197a.c());
        androidx.compose.ui.layout.s sVarV0 = a10.v0(AbstractC5010c.j(j10, -iS0, -iS02));
        return androidx.compose.ui.layout.l.u0(lVar, AbstractC5010c.g(j10, sVarV0.W0() + iS0), AbstractC5010c.f(j10, sVarV0.P0() + iS02), null, new a(sVarV0, lVar, this), 4, null);
    }
}
