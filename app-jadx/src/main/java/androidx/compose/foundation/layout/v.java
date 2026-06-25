package androidx.compose.foundation.layout;

import C.EnumC1143n;
import I0.A;
import I0.C;
import K0.E;
import Td.L;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.s;
import i1.AbstractC5010c;
import i1.AbstractC5026s;
import i1.C5009b;
import i1.C5021n;
import i1.C5025r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class v extends e.c implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private EnumC1143n f26241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Function2 f26243c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f26245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f26246c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f26247d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.l f26248e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, androidx.compose.ui.layout.s sVar, int i11, androidx.compose.ui.layout.l lVar) {
            super(1);
            this.f26245b = i10;
            this.f26246c = sVar;
            this.f26247d = i11;
            this.f26248e = lVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
            s.a.U(aVar, this.f26246c, ((C5021n) v.this.E1().invoke(C5025r.b(AbstractC5026s.a(this.f26245b - this.f26246c.W0(), this.f26247d - this.f26246c.P0())), this.f26248e.getLayoutDirection())).q(), 0.0f, 2, null);
        }
    }

    public v(EnumC1143n enumC1143n, boolean z10, Function2 function2) {
        this.f26241a = enumC1143n;
        this.f26242b = z10;
        this.f26243c = function2;
    }

    public final Function2 E1() {
        return this.f26243c;
    }

    public final void F1(Function2 function2) {
        this.f26243c = function2;
    }

    public final void G1(EnumC1143n enumC1143n) {
        this.f26241a = enumC1143n;
    }

    public final void H1(boolean z10) {
        this.f26242b = z10;
    }

    @Override // K0.E
    /* JADX INFO: renamed from: measure-3p2s80s */
    public C mo5measure3p2s80s(androidx.compose.ui.layout.l lVar, A a10, long j10) {
        EnumC1143n enumC1143n = this.f26241a;
        EnumC1143n enumC1143n2 = EnumC1143n.Vertical;
        int iN = enumC1143n != enumC1143n2 ? 0 : C5009b.n(j10);
        EnumC1143n enumC1143n3 = this.f26241a;
        EnumC1143n enumC1143n4 = EnumC1143n.Horizontal;
        androidx.compose.ui.layout.s sVarV0 = a10.v0(AbstractC5010c.a(iN, (this.f26241a == enumC1143n2 || !this.f26242b) ? C5009b.l(j10) : Integer.MAX_VALUE, enumC1143n3 == enumC1143n4 ? C5009b.m(j10) : 0, (this.f26241a == enumC1143n4 || !this.f26242b) ? C5009b.k(j10) : Integer.MAX_VALUE));
        int iM = AbstractC5874j.m(sVarV0.W0(), C5009b.n(j10), C5009b.l(j10));
        int iM2 = AbstractC5874j.m(sVarV0.P0(), C5009b.m(j10), C5009b.k(j10));
        return androidx.compose.ui.layout.l.u0(lVar, iM, iM2, null, new a(iM, sVarV0, iM2, lVar), 4, null);
    }
}
