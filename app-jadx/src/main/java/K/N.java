package K;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.ui.platform.InterfaceC2724o1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import q0.InterfaceC6062h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class N {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6062h f9790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1774y f9791b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6062h interfaceC6062h, C1774y c1774y) {
            super(1);
            this.f9790a = interfaceC6062h;
            this.f9791b = c1774y;
        }

        public final Boolean a(KeyEvent keyEvent) {
            InputDevice device = keyEvent.getDevice();
            boolean zH = false;
            if (device != null && device.supportsSource(513) && !device.isVirtual() && C0.c.e(C0.d.b(keyEvent), C0.c.f2484a.a()) && keyEvent.getSource() != 257) {
                if (N.c(keyEvent, 19)) {
                    zH = this.f9790a.h(androidx.compose.ui.focus.d.f26651b.h());
                } else if (N.c(keyEvent, 20)) {
                    zH = this.f9790a.h(androidx.compose.ui.focus.d.f26651b.a());
                } else if (N.c(keyEvent, 21)) {
                    zH = this.f9790a.h(androidx.compose.ui.focus.d.f26651b.d());
                } else if (N.c(keyEvent, 22)) {
                    zH = this.f9790a.h(androidx.compose.ui.focus.d.f26651b.g());
                } else if (N.c(keyEvent, 23)) {
                    InterfaceC2724o1 interfaceC2724o1H = this.f9791b.h();
                    if (interfaceC2724o1H != null) {
                        interfaceC2724o1H.c();
                    }
                    zH = true;
                }
            }
            return Boolean.valueOf(zH);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((C0.b) obj).f());
        }
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, C1774y c1774y, InterfaceC6062h interfaceC6062h) {
        return androidx.compose.ui.input.key.a.b(eVar, new a(interfaceC6062h, c1774y));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(KeyEvent keyEvent, int i10) {
        return C0.f.b(C0.d.a(keyEvent)) == i10;
    }
}
