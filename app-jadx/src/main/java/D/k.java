package D;

import F.AbstractC1542m;
import F.G;
import Td.L;
import Ud.AbstractC2279u;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import ie.InterfaceC5096o;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends AbstractC1542m implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G f3386a = new G();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f3387b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f3388a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj) {
            super(1);
            this.f3388a = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i10) {
            return this.f3388a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f3389a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object obj) {
            super(1);
            this.f3389a = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i10) {
            return this.f3389a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements ie.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5096o f3390a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC5096o interfaceC5096o) {
            super(4);
            this.f3390a = interfaceC5096o;
        }

        @Override // ie.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((InterfaceC1231c) obj, ((Number) obj2).intValue(), (InterfaceC2425m) obj3, ((Number) obj4).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC1231c interfaceC1231c, int i10, InterfaceC2425m interfaceC2425m, int i11) {
            if ((i11 & 6) == 0) {
                i11 |= interfaceC2425m.U(interfaceC1231c) ? 4 : 2;
            }
            if ((i11 & 131) == 130 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1010194746, i11, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.item.<anonymous> (LazyListIntervalContent.kt:58)");
            }
            this.f3390a.invoke(interfaceC1231c, interfaceC2425m, Integer.valueOf(i11 & 14));
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    public k(Function1 function1) {
        function1.invoke(this);
    }

    @Override // D.y
    public void c(Object obj, Object obj2, InterfaceC5096o interfaceC5096o) {
        g().b(1, new j(obj != null ? new a(obj) : null, new b(obj2), g0.i.b(-1010194746, true, new c(interfaceC5096o))));
    }

    @Override // D.y
    public void d(int i10, Function1 function1, Function1 function12, ie.p pVar) {
        g().b(i10, new j(function1, function12, pVar));
    }

    public final List j() {
        List list = this.f3387b;
        return list == null ? AbstractC2279u.m() : list;
    }

    @Override // F.AbstractC1542m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public G g() {
        return this.f3386a;
    }
}
