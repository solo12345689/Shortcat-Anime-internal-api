package C;

import androidx.compose.ui.platform.T0;
import androidx.compose.ui.platform.V0;
import i1.InterfaceC5011d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class W {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ P f2085a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(P p10) {
            super(1);
            this.f2085a = p10;
        }

        public final void a(V0 v02) {
            v02.d("insetsBottomHeight");
            v02.b().c("insets", this.f2085a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f2086a = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(P p10, InterfaceC5011d interfaceC5011d) {
            return Integer.valueOf(p10.a(interfaceC5011d));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ P f2087a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(P p10) {
            super(1);
            this.f2087a = p10;
        }

        public final void a(V0 v02) {
            v02.d("insetsTopHeight");
            v02.b().c("insets", this.f2087a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f2088a = new d();

        d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(P p10, InterfaceC5011d interfaceC5011d) {
            return Integer.valueOf(p10.b(interfaceC5011d));
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, P p10) {
        return eVar.then(new C1142m(p10, T0.b() ? new a(p10) : T0.a(), b.f2086a));
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, P p10) {
        return eVar.then(new C1142m(p10, T0.b() ? new c(p10) : T0.a(), d.f2088a));
    }
}
