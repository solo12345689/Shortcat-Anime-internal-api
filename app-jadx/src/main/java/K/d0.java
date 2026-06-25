package K;

import androidx.compose.ui.layout.s;
import i1.AbstractC5010c;
import i1.AbstractC5022o;
import i1.C5009b;
import i1.C5021n;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import r0.C6226h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class d0 implements I0.B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5082a f10020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5082a f10021b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f10022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f10023b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List list, List list2) {
            super(1);
            this.f10022a = list;
            this.f10023b = list2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return Td.L.f17438a;
        }

        public final void invoke(s.a aVar) {
            List list = this.f10022a;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Pair pair = (Pair) list.get(i10);
                    s.a.U(aVar, (androidx.compose.ui.layout.s) pair.getFirst(), ((C5021n) pair.getSecond()).q(), 0.0f, 2, null);
                }
            }
            List list2 = this.f10023b;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    Pair pair2 = (Pair) list2.get(i11);
                    androidx.compose.ui.layout.s sVar = (androidx.compose.ui.layout.s) pair2.getFirst();
                    InterfaceC5082a interfaceC5082a = (InterfaceC5082a) pair2.getSecond();
                    s.a.U(aVar, sVar, interfaceC5082a != null ? ((C5021n) interfaceC5082a.invoke()).q() : C5021n.f48560b.b(), 0.0f, 2, null);
                }
            }
        }
    }

    public d0(InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2) {
        this.f10020a = interfaceC5082a;
        this.f10021b = interfaceC5082a2;
    }

    @Override // I0.B
    /* JADX INFO: renamed from: measure-3p2s80s */
    public I0.C mo0measure3p2s80s(androidx.compose.ui.layout.l lVar, List list, long j10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (!(((I0.A) obj).j() instanceof h0)) {
                arrayList.add(obj);
            }
        }
        List list2 = (List) this.f10021b.invoke();
        ArrayList arrayList2 = null;
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                C6226h c6226h = (C6226h) list2.get(i11);
                Pair pair = c6226h != null ? new Pair(((I0.A) arrayList.get(i11)).v0(AbstractC5010c.b(0, (int) Math.floor(c6226h.n()), 0, (int) Math.floor(c6226h.h()), 5, null)), C5021n.c(AbstractC5022o.a(Math.round(c6226h.i()), Math.round(c6226h.l())))) : null;
                if (pair != null) {
                    arrayList3.add(pair);
                }
            }
            arrayList2 = arrayList3;
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        int size3 = list.size();
        for (int i12 = 0; i12 < size3; i12++) {
            Object obj2 = list.get(i12);
            if (((I0.A) obj2).j() instanceof h0) {
                arrayList4.add(obj2);
            }
        }
        return androidx.compose.ui.layout.l.u0(lVar, C5009b.l(j10), C5009b.k(j10), null, new a(arrayList2, AbstractC1754d.i(arrayList4, this.f10020a)), 4, null);
    }
}
