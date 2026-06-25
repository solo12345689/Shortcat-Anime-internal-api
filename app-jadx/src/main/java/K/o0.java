package K;

import androidx.compose.ui.layout.s;
import i1.C5009b;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class o0 implements I0.v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V f10275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f10276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a1.d0 f10277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC5082a f10278e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.l f10279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0 f10280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f10281c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f10282d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.l lVar, o0 o0Var, androidx.compose.ui.layout.s sVar, int i10) {
            super(1);
            this.f10279a = lVar;
            this.f10280b = o0Var;
            this.f10281c = sVar;
            this.f10282d = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return Td.L.f17438a;
        }

        public final void invoke(s.a aVar) {
            androidx.compose.ui.layout.l lVar = this.f10279a;
            int iA = this.f10280b.a();
            a1.d0 d0VarI = this.f10280b.i();
            Z z10 = (Z) this.f10280b.h().invoke();
            this.f10280b.c().j(z.q.Vertical, U.b(lVar, iA, d0VarI, z10 != null ? z10.f() : null, false, this.f10281c.W0()), this.f10282d, this.f10281c.P0());
            s.a.W(aVar, this.f10281c, 0, Math.round(-this.f10280b.c().d()), 0.0f, 4, null);
        }
    }

    public o0(V v10, int i10, a1.d0 d0Var, InterfaceC5082a interfaceC5082a) {
        this.f10275b = v10;
        this.f10276c = i10;
        this.f10277d = d0Var;
        this.f10278e = interfaceC5082a;
    }

    public final int a() {
        return this.f10276c;
    }

    public final V c() {
        return this.f10275b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return AbstractC5504s.c(this.f10275b, o0Var.f10275b) && this.f10276c == o0Var.f10276c && AbstractC5504s.c(this.f10277d, o0Var.f10277d) && AbstractC5504s.c(this.f10278e, o0Var.f10278e);
    }

    public final InterfaceC5082a h() {
        return this.f10278e;
    }

    public int hashCode() {
        return (((((this.f10275b.hashCode() * 31) + Integer.hashCode(this.f10276c)) * 31) + this.f10277d.hashCode()) * 31) + this.f10278e.hashCode();
    }

    public final a1.d0 i() {
        return this.f10277d;
    }

    @Override // I0.v
    /* JADX INFO: renamed from: measure-3p2s80s */
    public I0.C mo2measure3p2s80s(androidx.compose.ui.layout.l lVar, I0.A a10, long j10) {
        androidx.compose.ui.layout.s sVarV0 = a10.v0(C5009b.d(j10, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        int iMin = Math.min(sVarV0.P0(), C5009b.k(j10));
        return androidx.compose.ui.layout.l.u0(lVar, sVarV0.W0(), iMin, null, new a(lVar, this, sVarV0, iMin), 4, null);
    }

    public String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f10275b + ", cursorOffset=" + this.f10276c + ", transformedText=" + this.f10277d + ", textLayoutResultProvider=" + this.f10278e + ')';
    }
}
