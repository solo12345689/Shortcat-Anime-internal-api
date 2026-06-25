package androidx.compose.ui.window;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import ie.InterfaceC5082a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f27826a = new g();

    private g() {
    }

    public static final OnBackInvokedCallback b(final InterfaceC5082a interfaceC5082a) {
        return new OnBackInvokedCallback() { // from class: androidx.compose.ui.window.f
            public final void onBackInvoked() {
                g.c(interfaceC5082a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(InterfaceC5082a interfaceC5082a) {
        if (interfaceC5082a != null) {
            interfaceC5082a.invoke();
        }
    }

    public static final void d(View view, Object obj) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj);
    }

    public static final void e(View view, Object obj) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
    }
}
