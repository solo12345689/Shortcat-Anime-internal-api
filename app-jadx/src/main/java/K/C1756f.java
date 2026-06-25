package K;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: K.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1756f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1756f f10034a = new C1756f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static InterfaceC5096o f10035b = g0.i.b(671295101, false, a.f10036a);

    /* JADX INFO: renamed from: K.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f10036a = new a();

        a() {
            super(3);
        }

        public final void a(Function2 function2, InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= interfaceC2425m.F(function2) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(671295101, i10, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda-1.<anonymous> (CoreTextField.kt:219)");
            }
            function2.invoke(interfaceC2425m, Integer.valueOf(i10 & 14));
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((Function2) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
            return Td.L.f17438a;
        }
    }

    public final InterfaceC5096o a() {
        return f10035b;
    }
}
