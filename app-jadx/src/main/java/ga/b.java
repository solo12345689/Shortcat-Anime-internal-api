package Ga;

import Aa.f;
import Ea.g;
import Ea.k;
import Ea.p;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.uimanager.C3284b0;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: b */
    public static final a f7437b = new a(null);

    /* JADX INFO: renamed from: a */
    private p f7438a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final La.c a(C3284b0 reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        if (this.f7438a == null) {
            p pVar = new p(reactContext);
            this.f7438a = pVar;
            pVar.b();
        }
        return new La.c(reactContext);
    }

    public final Map b() {
        f.a aVar = f.f342f;
        return U6.c.f(aVar.c().b(), U6.c.c("registrationName", "onKeyboardMove"), aVar.d().b(), U6.c.c("registrationName", "onKeyboardMoveStart"), aVar.a().b(), U6.c.c("registrationName", "onKeyboardMoveEnd"), aVar.b().b(), U6.c.c("registrationName", "onKeyboardMoveInteractive"), "topFocusedInputLayoutChanged", U6.c.c("registrationName", "onFocusedInputLayoutChanged"), "topFocusedInputTextChanged", U6.c.c("registrationName", "onFocusedInputTextChanged"), "topFocusedInputSelectionChanged", U6.c.c("registrationName", "onFocusedInputSelectionChanged"));
    }

    public final void c() {
        p pVar = this.f7438a;
        if (pVar != null) {
            pVar.d();
        }
        this.f7438a = null;
    }

    public final void d(La.c view) {
        AbstractC5504s.h(view, "view");
        view.L();
    }

    public final void e(La.c view, boolean z10) {
        AbstractC5504s.h(view, "view");
        view.setActive(z10);
    }

    public final void f(La.c view, boolean z10) {
        AbstractC5504s.h(view, "view");
        view.setNavigationBarTranslucent(z10);
    }

    public final void g(La.c view, boolean z10) {
        AbstractC5504s.h(view, "view");
        view.setPreserveEdgeToEdge(z10);
    }

    public final void h(La.c view, boolean z10) {
        AbstractC5504s.h(view, "view");
        view.setStatusBarTranslucent(z10);
    }

    public final void i(La.c view) {
        g gVarI;
        AbstractC5504s.h(view, "view");
        k callback$react_native_keyboard_controller_release = view.getCallback$react_native_keyboard_controller_release();
        if (callback$react_native_keyboard_controller_release != null && (gVarI = callback$react_native_keyboard_controller_release.i()) != null) {
            gVarI.l();
        }
        Ba.g.b(view.getReactContext(), "KeyboardController::layoutDidSynchronize", Arguments.createMap());
    }
}
