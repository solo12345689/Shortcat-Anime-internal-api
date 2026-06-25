package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.views.view.WindowUtilKt;
import f7.InterfaceC4779a;
import h7.C4921i;
import java.util.Objects;

/* JADX INFO: renamed from: com.facebook.react.t */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3279t {

    /* JADX INFO: renamed from: a */
    private final Activity f37353a;

    /* JADX INFO: renamed from: b */
    private final String f37354b;

    /* JADX INFO: renamed from: c */
    private q7.g f37355c;

    /* JADX INFO: renamed from: d */
    private Callback f37356d;

    /* JADX INFO: renamed from: e */
    private C3323w f37357e;

    /* JADX INFO: renamed from: com.facebook.react.t$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends C3323w {
        a(Activity activity, N n10, String str, Bundle bundle, boolean z10) {
            super(activity, n10, str, bundle, z10);
        }

        @Override // com.facebook.react.C3323w
        protected W b() {
            W wCreateRootView = C3279t.this.createRootView();
            return wCreateRootView == null ? super.b() : wCreateRootView;
        }
    }

    @Deprecated
    public C3279t(Activity activity, String str) {
        this.f37353a = activity;
        this.f37354b = str;
    }

    public /* synthetic */ void c() {
        Window window;
        String mainComponentName = getMainComponentName();
        Bundle bundleComposeLaunchOptions = composeLaunchOptions();
        Activity activity = this.f37353a;
        if (activity != null && (window = activity.getWindow()) != null) {
            if (WindowUtilKt.isEdgeToEdgeFeatureFlagOn()) {
                WindowUtilKt.enableEdgeToEdge(window);
            }
            if (Build.VERSION.SDK_INT >= 26 && isWideColorGamutEnabled()) {
                window.setColorMode(1);
            }
        }
        if (C4921i.a()) {
            this.f37357e = new C3323w(getPlainActivity(), getReactHost(), mainComponentName, bundleComposeLaunchOptions);
        } else {
            this.f37357e = new a(getPlainActivity(), getReactNativeHost(), mainComponentName, bundleComposeLaunchOptions, isFabricEnabled());
        }
        if (mainComponentName != null) {
            loadApp(mainComponentName);
        }
    }

    public /* synthetic */ void d(int i10, String[] strArr, int[] iArr, Object[] objArr) {
        q7.g gVar = this.f37355c;
        if (gVar == null || !gVar.onRequestPermissionsResult(i10, strArr, iArr)) {
            return;
        }
        this.f37355c = null;
    }

    protected Bundle composeLaunchOptions() {
        return getLaunchOptions();
    }

    protected W createRootView() {
        return null;
    }

    protected Context getContext() {
        return (Context) Q6.a.c(this.f37353a);
    }

    public ReactContext getCurrentReactContext() {
        C3323w c3323w = this.f37357e;
        Objects.requireNonNull(c3323w);
        return c3323w.c();
    }

    protected Bundle getLaunchOptions() {
        return null;
    }

    public String getMainComponentName() {
        return this.f37354b;
    }

    protected Activity getPlainActivity() {
        return (Activity) getContext();
    }

    protected ReactActivity getReactActivity() {
        return (ReactActivity) getContext();
    }

    protected C3323w getReactDelegate() {
        return this.f37357e;
    }

    public ReactHost getReactHost() {
        return ((ReactApplication) getPlainActivity().getApplication()).getReactHost();
    }

    @Deprecated
    public H getReactInstanceManager() {
        C3323w c3323w = this.f37357e;
        Objects.requireNonNull(c3323w);
        return c3323w.e();
    }

    @Deprecated
    protected N getReactNativeHost() {
        return ((ReactApplication) getPlainActivity().getApplication()).getReactNativeHost();
    }

    protected boolean isFabricEnabled() {
        return C4921i.b();
    }

    protected boolean isWideColorGamutEnabled() {
        return false;
    }

    protected void loadApp(String str) {
        C3323w c3323w = this.f37357e;
        Objects.requireNonNull(c3323w);
        Objects.requireNonNull(str);
        c3323w.g(str);
        getPlainActivity().setContentView(this.f37357e.f());
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
        C3323w c3323w = this.f37357e;
        Objects.requireNonNull(c3323w);
        c3323w.h(i10, i11, intent, true);
    }

    public boolean onBackPressed() {
        C3323w c3323w = this.f37357e;
        Objects.requireNonNull(c3323w);
        return c3323w.i();
    }

    public void onConfigurationChanged(Configuration configuration) {
        C3323w c3323w = this.f37357e;
        Objects.requireNonNull(c3323w);
        c3323w.j(configuration);
    }

    public void onCreate(Bundle bundle) {
        U7.a.o(0L, "ReactActivityDelegate.onCreate::init", new Runnable() { // from class: com.facebook.react.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f37158a.c();
            }
        });
    }

    public void onDestroy() {
        C3323w c3323w = this.f37357e;
        Objects.requireNonNull(c3323w);
        c3323w.k();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        C3323w c3323w = this.f37357e;
        Objects.requireNonNull(c3323w);
        return c3323w.n(i10, keyEvent);
    }

    public boolean onKeyLongPress(int i10, KeyEvent keyEvent) {
        C3323w c3323w = this.f37357e;
        Objects.requireNonNull(c3323w);
        return c3323w.o(i10);
    }

    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        C3323w c3323w = this.f37357e;
        Objects.requireNonNull(c3323w);
        return c3323w.w(i10, keyEvent);
    }

    public boolean onNewIntent(Intent intent) {
        C3323w c3323w = this.f37357e;
        Objects.requireNonNull(c3323w);
        Objects.requireNonNull(intent);
        return c3323w.p(intent);
    }

    public void onPause() {
        C3323w c3323w = this.f37357e;
        Objects.requireNonNull(c3323w);
        c3323w.l();
    }

    public void onRequestPermissionsResult(final int i10, final String[] strArr, final int[] iArr) {
        LifecycleState lifecycleStateE;
        Callback callback = new Callback() { // from class: com.facebook.react.s
            @Override // com.facebook.react.bridge.Callback
            public final void invoke(Object[] objArr) {
                this.f37348a.d(i10, strArr, iArr, objArr);
            }
        };
        if (isFabricEnabled()) {
            ReactHost reactHost = getReactHost();
            lifecycleStateE = reactHost != null ? reactHost.getLifecycleState() : LifecycleState.f36550a;
        } else {
            N reactNativeHost = getReactNativeHost();
            lifecycleStateE = !reactNativeHost.g() ? LifecycleState.f36550a : reactNativeHost.c().E();
        }
        if (lifecycleStateE == LifecycleState.f36552c) {
            callback.invoke(new Object[0]);
        } else {
            this.f37356d = callback;
        }
    }

    public void onResume() {
        C3323w c3323w = this.f37357e;
        Objects.requireNonNull(c3323w);
        c3323w.m();
        Callback callback = this.f37356d;
        if (callback != null) {
            callback.invoke(new Object[0]);
            this.f37356d = null;
        }
    }

    public void onUserLeaveHint() {
        C3323w c3323w = this.f37357e;
        Objects.requireNonNull(c3323w);
        c3323w.q();
    }

    public void onWindowFocusChanged(boolean z10) {
        C3323w c3323w = this.f37357e;
        Objects.requireNonNull(c3323w);
        c3323w.r(z10);
    }

    public void requestPermissions(String[] strArr, int i10, q7.g gVar) {
        this.f37355c = gVar;
        getPlainActivity().requestPermissions(strArr, i10);
    }

    public void setReactRootView(W w10) {
        C3323w c3323w = this.f37357e;
        Objects.requireNonNull(c3323w);
        c3323w.u(w10);
    }

    public void setReactSurface(InterfaceC4779a interfaceC4779a) {
        C3323w c3323w = this.f37357e;
        Objects.requireNonNull(c3323w);
        c3323w.v(interfaceC4779a);
    }

    public C3279t(ReactActivity reactActivity, String str) {
        this.f37353a = reactActivity;
        this.f37354b = str;
    }
}
