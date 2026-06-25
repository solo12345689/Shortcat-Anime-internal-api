package Ja;

import android.app.Activity;
import android.view.Window;
import androidx.core.view.L0;
import androidx.core.view.l1;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f9462e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f9463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f9464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l1 f9465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WeakReference f9466d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(ReactApplicationContext mReactContext) {
        AbstractC5504s.h(mReactContext, "mReactContext");
        this.f9463a = mReactContext;
        this.f9464b = new e(mReactContext);
        this.f9466d = new WeakReference(null);
    }

    private final l1 d() {
        Activity currentActivity = this.f9463a.getCurrentActivity();
        if (this.f9465c == null || !AbstractC5504s.c(currentActivity, this.f9466d.get())) {
            if (currentActivity == null) {
                Fa.a.d(Fa.a.f6597a, d.f9467a, "StatusBarManagerCompatModule: can not get `WindowInsetsControllerCompat` because current activity is null.", null, 4, null);
                return this.f9465c;
            }
            Window window = currentActivity.getWindow();
            this.f9466d = new WeakReference(currentActivity);
            this.f9465c = new l1(window, window.getDecorView());
        }
        return this.f9465c;
    }

    private final boolean e() {
        La.c cVarL = l();
        if (cVarL != null) {
            return cVarL.getActive();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(boolean z10, c cVar) {
        if (z10) {
            l1 l1VarD = cVar.d();
            if (l1VarD != null) {
                l1VarD.b(L0.p.h());
                return;
            }
            return;
        }
        l1 l1VarD2 = cVar.d();
        if (l1VarD2 != null) {
            l1VarD2.g(L0.p.h());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(c cVar, String str) {
        l1 l1VarD = cVar.d();
        if (l1VarD != null) {
            l1VarD.e(AbstractC5504s.c(str, "dark-content"));
        }
    }

    private final La.c l() {
        return La.e.f11369a.a();
    }

    public final Map c() {
        return this.f9464b.a();
    }

    public final void f(int i10, boolean z10) {
        if (e()) {
            Fa.a.d(Fa.a.f6597a, d.f9467a, "StatusBarModule: Ignored status bar change, current activity is edge-to-edge.", null, 4, null);
        } else {
            this.f9464b.b(i10, z10);
        }
    }

    public final void g(final boolean z10) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: Ja.a
            @Override // java.lang.Runnable
            public final void run() {
                c.h(z10, this);
            }
        });
    }

    public final void i(final String style) {
        AbstractC5504s.h(style, "style");
        if (e()) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: Ja.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.j(this.f9460a, style);
                }
            });
        } else {
            this.f9464b.c(style);
        }
    }

    public final void k(boolean z10) {
        if (e()) {
            Fa.a.d(Fa.a.f6597a, d.f9467a, "StatusBarModule: Ignored status bar change, current activity is edge-to-edge.", null, 4, null);
        } else {
            this.f9464b.d(z10);
        }
    }
}
