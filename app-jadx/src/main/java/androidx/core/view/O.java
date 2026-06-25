package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f28987a;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f28988a;

        a(View view) {
            this.f28988a = view;
        }

        @Override // androidx.core.view.O.c
        void a() {
            View view = this.f28988a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f28988a.getWindowToken(), 0);
            }
        }

        @Override // androidx.core.view.O.c
        void b() {
            final View viewFindViewById = this.f28988a;
            if (viewFindViewById == null) {
                return;
            }
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = viewFindViewById.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.f28988a.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new Runnable() { // from class: androidx.core.view.N
                @Override // java.lang.Runnable
                public final void run() {
                    View view = viewFindViewById;
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c {
        c() {
        }

        abstract void a();

        abstract void b();
    }

    public O(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f28987a = new b(view);
        } else {
            this.f28987a = new a(view);
        }
    }

    public void a() {
        this.f28987a.a();
    }

    public void b() {
        this.f28987a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private View f28989b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WindowInsetsController f28990c;

        b(View view) {
            super(view);
            this.f28989b = view;
        }

        @Override // androidx.core.view.O.a, androidx.core.view.O.c
        void a() {
            View view;
            WindowInsetsController windowInsetsController = this.f28990c;
            if (windowInsetsController == null) {
                View view2 = this.f28989b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.V
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i10) {
                    atomicBoolean.set((i10 & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.f28989b) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f28989b.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        @Override // androidx.core.view.O.a, androidx.core.view.O.c
        void b() {
            View view = this.f28989b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f28990c;
            if (windowInsetsController == null) {
                View view2 = this.f28989b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.b();
        }

        b(WindowInsetsController windowInsetsController) {
            super(null);
            this.f28990c = windowInsetsController;
        }
    }

    O(WindowInsetsController windowInsetsController) {
        this.f28987a = new b(windowInsetsController);
    }
}
