package n2;

import Y.AbstractC2394b1;
import Y.AbstractC2454w;
import Y.H;
import Y.InterfaceC2425m;
import androidx.lifecycle.Y;
import ie.InterfaceC5082a;

/* JADX INFO: renamed from: n2.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5717b {

    /* JADX INFO: renamed from: a */
    public static final C5717b f53840a = new C5717b();

    /* JADX INFO: renamed from: b */
    private static final AbstractC2394b1 f53841b = H.h(null, new InterfaceC5082a() { // from class: n2.a
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return C5717b.b();
        }
    }, 1, null);

    private C5717b() {
    }

    public static final Y b() {
        return null;
    }

    public final Y c(InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-584162872, i10, -1, "androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.<get-current> (LocalViewModelStoreOwner.kt:34)");
        }
        Y yA = (Y) interfaceC2425m.n(f53841b);
        if (yA == null) {
            interfaceC2425m.V(1260197609);
            yA = AbstractC5718c.a(interfaceC2425m, 0);
        } else {
            interfaceC2425m.V(1260196493);
        }
        interfaceC2425m.O();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return yA;
    }
}
