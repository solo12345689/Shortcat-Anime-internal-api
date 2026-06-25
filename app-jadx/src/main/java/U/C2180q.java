package U;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import ie.InterfaceC5096o;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: U.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2180q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2180q f18645a = new C2180q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static InterfaceC5096o f18646b = g0.i.b(818736383, false, a.f18647a);

    /* JADX INFO: renamed from: U.q$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f18647a = new a();

        a() {
            super(3);
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((W) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(W w10, InterfaceC2425m interfaceC2425m, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC2425m.U(w10) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(818736383, i11, -1, "androidx.compose.material3.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:220)");
            }
            b0.d(w10, null, false, null, 0L, 0L, 0L, 0L, 0L, interfaceC2425m, i11 & 14, 510);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    public final InterfaceC5096o a() {
        return f18646b;
    }
}
