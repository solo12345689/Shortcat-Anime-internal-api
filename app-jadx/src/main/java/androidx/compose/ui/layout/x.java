package androidx.compose.ui.layout;

import K0.J;
import Td.L;
import androidx.compose.ui.layout.s;
import i1.AbstractC5010c;
import i1.C5009b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends J.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f27019b = new x();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27020a = new a();

        a() {
            super(1);
        }

        public final void invoke(s.a aVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f27021a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(s sVar) {
            super(1);
            this.f27021a = sVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
            s.a.f0(aVar, this.f27021a, 0, 0, 0.0f, null, 12, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f27022a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list) {
            super(1);
            this.f27022a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
            List list = this.f27022a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                s.a.f0(aVar, (s) list.get(i10), 0, 0, 0.0f, null, 12, null);
            }
        }
    }

    private x() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // I0.B
    /* JADX INFO: renamed from: measure-3p2s80s */
    public I0.C mo0measure3p2s80s(l lVar, List list, long j10) {
        int size = list.size();
        if (size == 0) {
            return l.u0(lVar, C5009b.n(j10), C5009b.m(j10), null, a.f27020a, 4, null);
        }
        if (size == 1) {
            s sVarV0 = ((I0.A) list.get(0)).v0(j10);
            return l.u0(lVar, AbstractC5010c.g(j10, sVarV0.W0()), AbstractC5010c.f(j10, sVarV0.P0()), null, new b(sVarV0), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size2; i10++) {
            s sVarV02 = ((I0.A) list.get(i10)).v0(j10);
            iMax = Math.max(sVarV02.W0(), iMax);
            iMax2 = Math.max(sVarV02.P0(), iMax2);
            arrayList.add(sVarV02);
        }
        return l.u0(lVar, AbstractC5010c.g(j10, iMax), AbstractC5010c.f(j10, iMax2), null, new c(arrayList), 4, null);
    }
}
