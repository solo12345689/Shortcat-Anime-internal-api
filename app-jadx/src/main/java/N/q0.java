package N;

import Gf.C0;
import I0.InterfaceC1690p;
import K.C1774y;
import a1.InterfaceC2520M;
import androidx.compose.ui.platform.A1;
import androidx.compose.ui.platform.InterfaceC2724o1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q0 implements InterfaceC2520M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f12535a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        C0 O0(Function2 function2);

        Q.F Y0();

        InterfaceC2724o1 getSoftwareKeyboardController();

        A1 getViewConfiguration();

        InterfaceC1690p o0();

        C1774y y1();
    }

    @Override // a1.InterfaceC2520M
    public final void e() {
        InterfaceC2724o1 softwareKeyboardController;
        a aVar = this.f12535a;
        if (aVar == null || (softwareKeyboardController = aVar.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.a();
    }

    @Override // a1.InterfaceC2520M
    public final void g() {
        InterfaceC2724o1 softwareKeyboardController;
        a aVar = this.f12535a;
        if (aVar == null || (softwareKeyboardController = aVar.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.c();
    }

    protected final a i() {
        return this.f12535a;
    }

    public final void j(a aVar) {
        if (this.f12535a != null) {
            throw new IllegalStateException("Expected textInputModifierNode to be null");
        }
        this.f12535a = aVar;
    }

    public abstract void k();

    public final void l(a aVar) {
        if (this.f12535a == aVar) {
            this.f12535a = null;
            return;
        }
        throw new IllegalStateException(("Expected textInputModifierNode to be " + aVar + " but was " + this.f12535a).toString());
    }
}
