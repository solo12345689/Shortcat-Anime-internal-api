package L;

import I0.A;
import I0.C;
import K0.E;
import Td.L;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.layout.s;
import i1.AbstractC5010c;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends L.a implements E {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ s f11182a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f11183b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f11184c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s sVar, int i10, int i11) {
            super(1);
            this.f11182a = sVar;
            this.f11183b = i10;
            this.f11184c = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
            s.a.N(aVar, this.f11182a, -this.f11183b, -this.f11184c, 0.0f, 4, null);
        }
    }

    public b(InterfaceC5082a interfaceC5082a) {
        super(interfaceC5082a);
    }

    @Override // K0.E
    /* JADX INFO: renamed from: measure-3p2s80s */
    public C mo5measure3p2s80s(l lVar, A a10, long j10) {
        int iS0 = lVar.s0(androidx.compose.foundation.text.handwriting.a.b());
        int iS02 = lVar.s0(androidx.compose.foundation.text.handwriting.a.a());
        int i10 = iS02 * 2;
        int i11 = iS0 * 2;
        s sVarV0 = a10.v0(AbstractC5010c.j(j10, i10, i11));
        return l.u0(lVar, sVarV0.W0() - i10, sVarV0.P0() - i11, null, new a(sVarV0, iS02, iS0), 4, null);
    }

    @Override // K0.v0
    public boolean u1() {
        return true;
    }
}
