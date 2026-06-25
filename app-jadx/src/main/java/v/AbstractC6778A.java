package v;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import android.view.ViewConfiguration;
import androidx.compose.ui.platform.AbstractC2739w0;
import i1.InterfaceC5011d;
import w.AbstractC6873B;
import w.InterfaceC6921z;

/* JADX INFO: renamed from: v.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6778A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f61565a = ViewConfiguration.getScrollFriction();

    public static final float a() {
        return f61565a;
    }

    public static final InterfaceC6921z b(InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(904445851, i10, -1, "androidx.compose.animation.rememberSplineBasedDecay (SplineBasedFloatDecayAnimationSpec.android.kt:40)");
        }
        InterfaceC5011d interfaceC5011d = (InterfaceC5011d) interfaceC2425m.n(AbstractC2739w0.e());
        boolean zB = interfaceC2425m.b(interfaceC5011d.getDensity());
        Object objD = interfaceC2425m.D();
        if (zB || objD == InterfaceC2425m.f22370a.a()) {
            objD = AbstractC6873B.b(new z(interfaceC5011d));
            interfaceC2425m.u(objD);
        }
        InterfaceC6921z interfaceC6921z = (InterfaceC6921z) objD;
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return interfaceC6921z;
    }
}
