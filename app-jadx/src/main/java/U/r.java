package U;

import W.g;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import x0.C7032d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f18648a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Function2 f18649b = g0.i.b(-505750804, false, a.f18650a);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f18650a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-505750804, i10, -1, "androidx.compose.material3.ComposableSingletons$SnackbarKt.lambda-1.<anonymous> (Snackbar.kt:231)");
            }
            C7032d c7032dA = S.a.a(R.a.f14923a);
            g.a aVar = W.g.f20509a;
            B.b(c7032dA, W.h.a(W.g.a(L.f17808b), interfaceC2425m, 0), null, 0L, interfaceC2425m, 0, 12);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    public final Function2 a() {
        return f18649b;
    }
}
