package C;

import Y.C0;
import Y.b2;
import androidx.compose.ui.layout.s;
import i1.AbstractC5010c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: C.t */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1148t implements I0.v, J0.d, J0.j {

    /* JADX INFO: renamed from: b */
    private final P f2174b;

    /* JADX INFO: renamed from: c */
    private final C0 f2175c;

    /* JADX INFO: renamed from: d */
    private final C0 f2176d;

    /* JADX INFO: renamed from: C.t$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ androidx.compose.ui.layout.s f2177a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f2178b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f2179c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.s sVar, int i10, int i11) {
            super(1);
            this.f2177a = sVar;
            this.f2178b = i10;
            this.f2179c = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return Td.L.f17438a;
        }

        public final void invoke(s.a aVar) {
            s.a.N(aVar, this.f2177a, this.f2178b, this.f2179c, 0.0f, 4, null);
        }
    }

    public C1148t(P p10) {
        this.f2174b = p10;
        this.f2175c = b2.e(p10, null, 2, null);
        this.f2176d = b2.e(p10, null, 2, null);
    }

    private final P a() {
        return (P) this.f2176d.getValue();
    }

    private final P c() {
        return (P) this.f2175c.getValue();
    }

    private final void i(P p10) {
        this.f2176d.setValue(p10);
    }

    private final void j(P p10) {
        this.f2175c.setValue(p10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1148t) {
            return AbstractC5504s.c(((C1148t) obj).f2174b, this.f2174b);
        }
        return false;
    }

    @Override // J0.d
    public void f(J0.k kVar) {
        P p10 = (P) kVar.j(T.a());
        j(S.d(this.f2174b, p10));
        i(S.f(p10, this.f2174b));
    }

    @Override // J0.j
    public J0.l getKey() {
        return T.a();
    }

    @Override // J0.j
    /* JADX INFO: renamed from: h */
    public P getValue() {
        return a();
    }

    public int hashCode() {
        return this.f2174b.hashCode();
    }

    @Override // I0.v
    /* JADX INFO: renamed from: measure-3p2s80s */
    public I0.C mo2measure3p2s80s(androidx.compose.ui.layout.l lVar, I0.A a10, long j10) {
        int iD = c().d(lVar, lVar.getLayoutDirection());
        int iB = c().b(lVar);
        int iC = c().c(lVar, lVar.getLayoutDirection()) + iD;
        int iA = c().a(lVar) + iB;
        androidx.compose.ui.layout.s sVarV0 = a10.v0(AbstractC5010c.j(j10, -iC, -iA));
        return androidx.compose.ui.layout.l.u0(lVar, AbstractC5010c.g(j10, sVarV0.W0() + iC), AbstractC5010c.f(j10, sVarV0.P0() + iA), null, new a(sVarV0, iD, iB), 4, null);
    }
}
