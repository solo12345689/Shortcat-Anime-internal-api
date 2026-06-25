package Y;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Y.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2407g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2407g f22327a = new C2407g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Function2 f22328b = g0.i.b(954879418, false, b.f22331a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Function2 f22329c = g0.i.b(1918065384, false, a.f22330a);

    /* JADX INFO: renamed from: Y.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f22330a = new a();

        a() {
        }

        public final void a(InterfaceC2425m interfaceC2425m, int i10) {
            if (!interfaceC2425m.p((i10 & 3) != 2, i10 & 1)) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1918065384, i10, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda$1918065384.<anonymous> (Composition.kt:854)");
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: Y.g$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f22331a = new b();

        b() {
        }

        public final void a(InterfaceC2425m interfaceC2425m, int i10) {
            if (!interfaceC2425m.p((i10 & 3) != 2, i10 & 1)) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(954879418, i10, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda$954879418.<anonymous> (Composition.kt:620)");
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }
    }

    public final Function2 a() {
        return f22329c;
    }

    public final Function2 b() {
        return f22328b;
    }
}
