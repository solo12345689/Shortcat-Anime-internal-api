package Ia;

import Td.L;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.core.view.K0;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f8873d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f8874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ca.f f8875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8876c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public f(ReactApplicationContext mReactContext) {
        AbstractC5504s.h(mReactContext, "mReactContext");
        this.f8874a = mReactContext;
        this.f8875b = new Ca.f();
        this.f8876c = k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(boolean z10, f fVar, final View view, Activity activity, final boolean z11) {
        if (Build.VERSION.SDK_INT >= 30 && !z10) {
            fVar.f8875b.x(view, new Function1() { // from class: Ia.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f.h(view, z11, (K0) obj);
                }
            });
            return;
        }
        Object systemService = activity != null ? activity.getSystemService("input_method") : null;
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        j(z11, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L h(final View view, final boolean z10, K0 insetsController) {
        AbstractC5504s.h(insetsController, "insetsController");
        insetsController.a(false);
        view.post(new Runnable() { // from class: Ia.e
            @Override // java.lang.Runnable
            public final void run() {
                f.i(z10, view);
            }
        });
        return L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(boolean z10, View view) {
        j(z10, view);
    }

    private static final void j(boolean z10, View view) {
        if (z10) {
            return;
        }
        view.clearFocus();
    }

    private final int k() {
        Window window;
        WindowManager.LayoutParams attributes;
        Activity currentActivity = this.f8874a.getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
            return 0;
        }
        return attributes.softInputMode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o() {
        Ka.a.f10969a.a();
    }

    private final void q(final int i10) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: Ia.c
            @Override // java.lang.Runnable
            public final void run() {
                f.r(this.f8867a, i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(f fVar, int i10) {
        Activity currentActivity;
        Window window;
        if (fVar.k() == i10 || (currentActivity = fVar.f8874a.getCurrentActivity()) == null || (window = currentActivity.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(i10);
    }

    public final void f(final boolean z10, final boolean z11) {
        final Activity currentActivity = this.f8874a.getCurrentActivity();
        final EditText editTextB = Ka.a.f10969a.b();
        if (editTextB != null) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: Ia.a
                @Override // java.lang.Runnable
                public final void run() {
                    f.g(z11, this, editTextB, currentActivity, z10);
                }
            });
        }
    }

    public final void m() {
        q(this.f8876c);
    }

    public final void n(String direction) {
        AbstractC5504s.h(direction, "direction");
        if (AbstractC5504s.c(direction, "current")) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: Ia.b
                @Override // java.lang.Runnable
                public final void run() {
                    f.o();
                }
            });
            return;
        }
        EditText editTextB = Ka.a.f10969a.b();
        if (editTextB != null) {
            Ka.c.f10972a.j(direction, editTextB);
        }
    }

    public final void p(int i10) {
        q(i10);
    }

    public final void l() {
    }
}
