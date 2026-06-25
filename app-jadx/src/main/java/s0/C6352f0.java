package s0;

import K0.AbstractC1785e0;
import K0.AbstractC1789g0;
import K0.AbstractC1796k;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.s;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: s0.f0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6352f0 extends e.c implements K0.E, K0.A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Function1 f58938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f58939b;

    /* JADX INFO: renamed from: s0.f0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f58940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6352f0 f58941b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.s sVar, C6352f0 c6352f0) {
            super(1);
            this.f58940a = sVar;
            this.f58941b = c6352f0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return Td.L.f17438a;
        }

        public final void invoke(s.a aVar) {
            s.a.v0(aVar, this.f58940a, 0, 0, 0.0f, this.f58941b.E1(), 4, null);
        }
    }

    public C6352f0(Function1 function1) {
        this.f58938a = function1;
    }

    public final Function1 E1() {
        return this.f58938a;
    }

    public final void F1() {
        AbstractC1785e0 abstractC1785e0O2 = AbstractC1796k.i(this, AbstractC1789g0.a(2)).O2();
        if (abstractC1785e0O2 != null) {
            abstractC1785e0O2.F3(this.f58938a, true);
        }
    }

    public final void G1(Function1 function1) {
        this.f58938a = function1;
    }

    @Override // androidx.compose.ui.e.c
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // K0.E
    /* JADX INFO: renamed from: measure-3p2s80s */
    public I0.C mo5measure3p2s80s(androidx.compose.ui.layout.l lVar, I0.A a10, long j10) {
        androidx.compose.ui.layout.s sVarV0 = a10.v0(j10);
        return androidx.compose.ui.layout.l.u0(lVar, sVarV0.W0(), sVarV0.P0(), null, new a(sVarV0, this), 4, null);
    }

    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f58938a + ')';
    }

    @Override // K0.A0
    public boolean z() {
        return this.f58939b;
    }

    @Override // K0.A0
    public void Y(R0.C c10) {
    }
}
