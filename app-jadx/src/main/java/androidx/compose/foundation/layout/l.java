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
import i1.C5021n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class l extends e.c implements E {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f26170a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.s sVar) {
            super(1);
            this.f26170a = sVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
            s.a.Z(aVar, this.f26170a, C5021n.f48560b.b(), 0.0f, 2, null);
        }
    }

    public abstract long E1(androidx.compose.ui.layout.l lVar, A a10, long j10);

    public abstract boolean F1();

    public int maxIntrinsicHeight(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return interfaceC1686l.I(i10);
    }

    @Override // K0.E
    public int maxIntrinsicWidth(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return interfaceC1686l.q0(i10);
    }

    @Override // K0.E
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final C mo5measure3p2s80s(androidx.compose.ui.layout.l lVar, A a10, long j10) {
        long jE1 = E1(lVar, a10, j10);
        if (F1()) {
            jE1 = AbstractC5010c.e(j10, jE1);
        }
        androidx.compose.ui.layout.s sVarV0 = a10.v0(jE1);
        return androidx.compose.ui.layout.l.u0(lVar, sVarV0.W0(), sVarV0.P0(), null, new a(sVarV0), 4, null);
    }

    public int minIntrinsicHeight(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return interfaceC1686l.Z(i10);
    }

    @Override // K0.E
    public int minIntrinsicWidth(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return interfaceC1686l.l0(i10);
    }
}
