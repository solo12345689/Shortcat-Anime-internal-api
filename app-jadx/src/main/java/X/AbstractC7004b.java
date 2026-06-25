package x;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: renamed from: x.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7004b {
    public static final InterfaceC6999T a(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC6999T interfaceC6999T;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1476348564, i10, -1, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.android.kt:63)");
        }
        Context context = (Context) interfaceC2425m.n(AndroidCompositionLocals_androidKt.g());
        C6997Q c6997q = (C6997Q) interfaceC2425m.n(AbstractC6998S.a());
        if (c6997q != null) {
            interfaceC2425m.V(1586021609);
            boolean zU = interfaceC2425m.U(context) | interfaceC2425m.U(c6997q);
            Object objD = interfaceC2425m.D();
            if (zU || objD == InterfaceC2425m.f22370a.a()) {
                objD = new C7003a(context, c6997q);
                interfaceC2425m.u(objD);
            }
            interfaceC6999T = (C7003a) objD;
            interfaceC2425m.O();
        } else {
            interfaceC2425m.V(1586120933);
            interfaceC2425m.O();
            interfaceC6999T = C6996P.f63287a;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return interfaceC6999T;
    }
}
