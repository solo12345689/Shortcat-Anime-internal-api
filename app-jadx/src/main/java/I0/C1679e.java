package I0;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: I0.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1679e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1679e f8700a = new C1679e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Function2 f8701b = g0.i.b(641200809, false, a.f8702a);

    /* JADX INFO: renamed from: I0.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f8702a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if (!interfaceC2425m.p((i10 & 3) != 2, i10 & 1)) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(641200809, i10, -1, "androidx.compose.ui.layout.ComposableSingletons$SubcomposeLayoutKt.lambda$641200809.<anonymous> (SubcomposeLayout.kt:623)");
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    public final Function2 a() {
        return f8701b;
    }
}
