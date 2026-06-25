package androidx.compose.ui.window;

import Td.L;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f27830a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Function2 f27831b = g0.i.b(-1131826196, false, a.f27832a);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27832a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if (!interfaceC2425m.p((i10 & 3) != 2, i10 & 1)) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1131826196, i10, -1, "androidx.compose.ui.window.ComposableSingletons$AndroidPopup_androidKt.lambda$-1131826196.<anonymous> (AndroidPopup.android.kt:555)");
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    public final Function2 a() {
        return f27831b;
    }
}
