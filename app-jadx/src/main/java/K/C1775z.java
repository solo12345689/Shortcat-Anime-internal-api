package K;

import androidx.compose.ui.layout.s;
import i1.C5009b;
import i1.C5021n;
import ie.InterfaceC5082a;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: K.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C1775z implements I0.B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5082a f10386a;

    /* JADX INFO: renamed from: K.z$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f10387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1775z f10388b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List list, C1775z c1775z) {
            super(1);
            this.f10387a = list;
            this.f10388b = c1775z;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return Td.L.f17438a;
        }

        public final void invoke(s.a aVar) {
            List listI = AbstractC1754d.i(this.f10387a, this.f10388b.f10386a);
            if (listI != null) {
                int size = listI.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Pair pair = (Pair) listI.get(i10);
                    androidx.compose.ui.layout.s sVar = (androidx.compose.ui.layout.s) pair.getFirst();
                    InterfaceC5082a interfaceC5082a = (InterfaceC5082a) pair.getSecond();
                    s.a.U(aVar, sVar, interfaceC5082a != null ? ((C5021n) interfaceC5082a.invoke()).q() : C5021n.f48560b.b(), 0.0f, 2, null);
                }
            }
        }
    }

    public C1775z(InterfaceC5082a interfaceC5082a) {
        this.f10386a = interfaceC5082a;
    }

    @Override // I0.B
    /* JADX INFO: renamed from: measure-3p2s80s */
    public I0.C mo0measure3p2s80s(androidx.compose.ui.layout.l lVar, List list, long j10) {
        return androidx.compose.ui.layout.l.u0(lVar, C5009b.l(j10), C5009b.k(j10), null, new a(list, this), 4, null);
    }
}
