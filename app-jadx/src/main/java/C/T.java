package C;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import androidx.compose.ui.platform.T0;
import androidx.compose.ui.platform.V0;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final J0.l f2066a = J0.e.a(a.f2067a);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2067a = new a();

        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P invoke() {
            return S.a(0, 0, 0, 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f2068a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1) {
            super(1);
            this.f2068a = function1;
        }

        public final void a(V0 v02) {
            v02.d("onConsumedWindowInsetsChanged");
            v02.b().c("block", this.f2068a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f2069a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function1 function1) {
            super(3);
            this.f2069a = function1;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC2425m interfaceC2425m, int i10) {
            interfaceC2425m.V(-1608161351);
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1608161351, i10, -1, "androidx.compose.foundation.layout.onConsumedWindowInsetsChanged.<anonymous> (WindowInsetsPadding.kt:125)");
            }
            boolean zU = interfaceC2425m.U(this.f2069a);
            Function1 function1 = this.f2069a;
            Object objD = interfaceC2425m.D();
            if (zU || objD == InterfaceC2425m.f22370a.a()) {
                objD = new C1140k(function1);
                interfaceC2425m.u(objD);
            }
            C1140k c1140k = (C1140k) objD;
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            interfaceC2425m.O();
            return c1140k;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ P f2070a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(P p10) {
            super(1);
            this.f2070a = p10;
        }

        public final void a(V0 v02) {
            v02.d("windowInsetsPadding");
            v02.b().c("insets", this.f2070a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ P f2071a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(P p10) {
            super(3);
            this.f2071a = p10;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC2425m interfaceC2425m, int i10) {
            interfaceC2425m.V(-1415685722);
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1415685722, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.kt:61)");
            }
            boolean zU = interfaceC2425m.U(this.f2071a);
            P p10 = this.f2071a;
            Object objD = interfaceC2425m.D();
            if (zU || objD == InterfaceC2425m.f22370a.a()) {
                objD = new C1148t(p10);
                interfaceC2425m.u(objD);
            }
            C1148t c1148t = (C1148t) objD;
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            interfaceC2425m.O();
            return c1148t;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final J0.l a() {
        return f2066a;
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, Function1 function1) {
        return androidx.compose.ui.c.b(eVar, T0.b() ? new b(function1) : T0.a(), new c(function1));
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, P p10) {
        return androidx.compose.ui.c.b(eVar, T0.b() ? new d(p10) : T0.a(), new e(p10));
    }
}
