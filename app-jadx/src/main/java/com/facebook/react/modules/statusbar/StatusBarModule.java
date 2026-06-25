package com.facebook.react.modules.statusbar;

import Td.z;
import Ud.S;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.uimanager.B;
import com.facebook.react.uimanager.C3289e;
import com.facebook.react.views.view.WindowUtilKt;
import java.util.Arrays;
import java.util.Map;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC5454a(name = "StatusBarManager")
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/facebook/react/modules/statusbar/StatusBarModule;", "Lcom/facebook/fbreact/specs/NativeStatusBarManagerAndroidSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "", "", "getTypedExportedConstants", "()Ljava/util/Map;", "", "colorDouble", "", "animated", "LTd/L;", "setColor", "(DZ)V", "translucent", "setTranslucent", "(Z)V", "hidden", "setHidden", "style", "setStyle", "(Ljava/lang/String;)V", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StatusBarModule extends NativeStatusBarManagerAndroidSpec {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String DEFAULT_BACKGROUND_COLOR_KEY = "DEFAULT_BACKGROUND_COLOR";
    private static final String HEIGHT_KEY = "HEIGHT";
    public static final String NAME = "StatusBarManager";

    /* JADX INFO: renamed from: com.facebook.react.modules.statusbar.StatusBarModule$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends GuardedRunnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f37066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f37068c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Activity activity, boolean z10, int i10, ReactApplicationContext reactApplicationContext) {
            super(reactApplicationContext);
            this.f37066a = activity;
            this.f37067b = z10;
            this.f37068c = i10;
            AbstractC5504s.e(reactApplicationContext);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(Activity activity, ValueAnimator animator) {
            AbstractC5504s.h(animator, "animator");
            Window window = activity.getWindow();
            if (window != null) {
                Object animatedValue = animator.getAnimatedValue();
                AbstractC5504s.f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                window.setStatusBarColor(((Integer) animatedValue).intValue());
            }
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            Window window = this.f37066a.getWindow();
            if (window == null) {
                return;
            }
            window.addFlags(Integer.MIN_VALUE);
            if (!this.f37067b) {
                window.setStatusBarColor(this.f37068c);
                return;
            }
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(window.getStatusBarColor()), Integer.valueOf(this.f37068c));
            final Activity activity = this.f37066a;
            valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facebook.react.modules.statusbar.c
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    StatusBarModule.b.b(activity, valueAnimator);
                }
            });
            valueAnimatorOfObject.setDuration(300L).setStartDelay(0L);
            valueAnimatorOfObject.start();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends GuardedRunnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f37069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37070b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Activity activity, boolean z10, ReactApplicationContext reactApplicationContext) {
            super(reactApplicationContext);
            this.f37069a = activity;
            this.f37070b = z10;
            AbstractC5504s.e(reactApplicationContext);
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            Window window = this.f37069a.getWindow();
            if (window != null) {
                WindowUtilKt.setStatusBarTranslucency(window, this.f37070b);
            }
        }
    }

    public StatusBarModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setHidden$lambda$1(Activity activity, boolean z10) {
        Window window = activity.getWindow();
        if (window != null) {
            WindowUtilKt.setStatusBarVisibility(window, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setStyle$lambda$2(Activity activity, String str) {
        Window window = activity.getWindow();
        if (window == null) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 30) {
            View decorView = window.getDecorView();
            AbstractC5504s.g(decorView, "getDecorView(...)");
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(AbstractC5504s.c("dark-content", str) ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
            return;
        }
        WindowInsetsController insetsController = window.getInsetsController();
        if (insetsController == null) {
            return;
        }
        if (AbstractC5504s.c("dark-content", str)) {
            insetsController.setSystemBarsAppearance(8, 8);
        } else {
            insetsController.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    protected Map<String, Object> getTypedExportedConstants() {
        String str;
        Window window;
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null) {
            str = "black";
        } else {
            int statusBarColor = window.getStatusBarColor();
            U u10 = U.f52264a;
            str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(statusBarColor & 16777215)}, 1));
            AbstractC5504s.g(str, "format(...)");
        }
        return S.l(z.a(HEIGHT_KEY, Float.valueOf(B.g(C3289e.f37568a.f(currentActivity)))), z.a(DEFAULT_BACKGROUND_COLOR_KEY, str));
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setColor(double colorDouble, boolean animated) {
        int i10 = (int) colorDouble;
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            AbstractC7283a.I("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else if (WindowUtilKt.isEdgeToEdgeFeatureFlagOn()) {
            AbstractC7283a.I("ReactNative", "StatusBarModule: Ignored status bar change, current activity is edge-to-edge.");
        } else {
            UiThreadUtil.runOnUiThread(new b(currentActivity, animated, i10, getReactApplicationContext()));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setHidden(final boolean hidden) {
        final Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            AbstractC7283a.I("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.statusbar.a
                @Override // java.lang.Runnable
                public final void run() {
                    StatusBarModule.setHidden$lambda$1(currentActivity, hidden);
                }
            });
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setStyle(final String style) {
        final Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            AbstractC7283a.I("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.statusbar.b
                @Override // java.lang.Runnable
                public final void run() {
                    StatusBarModule.setStyle$lambda$2(currentActivity, style);
                }
            });
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setTranslucent(boolean translucent) {
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            AbstractC7283a.I("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else if (WindowUtilKt.isEdgeToEdgeFeatureFlagOn()) {
            AbstractC7283a.I("ReactNative", "StatusBarModule: Ignored status bar change, current activity is edge-to-edge.");
        } else {
            UiThreadUtil.runOnUiThread(new c(currentActivity, translucent, getReactApplicationContext()));
        }
    }
}
