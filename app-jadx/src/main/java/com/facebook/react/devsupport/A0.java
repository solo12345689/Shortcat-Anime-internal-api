package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.L0;
import com.facebook.fbreact.specs.NativeRedBoxSpec;
import com.facebook.react.AbstractC3251p;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.devsupport.A0;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class A0 implements U6.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f36600e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c7.f f36601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3217d0 f36602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Dialog f36603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private y0 f36604d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(ReactContext reactContext, Runnable runnable) {
            reactContext.addLifecycleEventListener(new C0612a(runnable, reactContext));
        }

        private a() {
        }

        /* JADX INFO: renamed from: com.facebook.react.devsupport.A0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0612a implements LifecycleEventListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f36605a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ReactContext f36606b;

            C0612a(Runnable runnable, ReactContext reactContext) {
                this.f36605a = runnable;
                this.f36606b = reactContext;
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostResume() {
                this.f36605a.run();
                this.f36606b.removeLifecycleEventListener(this);
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostDestroy() {
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostPause() {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends Dialog {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ A0 f36607a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Activity activity, A0 a02, int i10) {
            super(activity, i10);
            this.f36607a = a02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final L0 b(int i10, View view, L0 windowInsetsCompat) {
            AbstractC5504s.h(view, "view");
            AbstractC5504s.h(windowInsetsCompat, "windowInsetsCompat");
            A1.b bVarF = windowInsetsCompat.f(i10);
            AbstractC5504s.g(bVarF, "getInsets(...)");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            AbstractC5504s.f(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ((FrameLayout.LayoutParams) layoutParams).setMargins(bVarF.f104a, bVarF.f105b, bVarF.f106c, bVarF.f107d);
            return L0.f28953b;
        }

        @Override // android.app.Dialog
        protected void onCreate(Bundle bundle) {
            Window window = getWindow();
            if (window == null) {
                throw new IllegalStateException("Required value was null.");
            }
            window.setBackgroundDrawable(new ColorDrawable(-16777216));
            final int i10 = L0.p.i() | L0.p.c();
            y0 y0Var = this.f36607a.f36604d;
            if (y0Var == null) {
                throw new IllegalStateException("Required value was null.");
            }
            AbstractC2747a0.w0(y0Var, new androidx.core.view.I() { // from class: com.facebook.react.devsupport.B0
                @Override // androidx.core.view.I
                public final L0 d(View view, L0 l02) {
                    return A0.b.b(i10, view, l02);
                }
            });
        }

        @Override // android.app.Dialog, android.view.KeyEvent.Callback
        public boolean onKeyUp(int i10, KeyEvent event) {
            AbstractC5504s.h(event, "event");
            if (i10 == 82) {
                this.f36607a.f36601a.F();
                return true;
            }
            if (this.f36607a.f36602b.b(i10, getCurrentFocus())) {
                this.f36607a.f36601a.B();
            }
            return super.onKeyUp(i10, event);
        }
    }

    public A0(c7.f devSupportManager) {
        AbstractC5504s.h(devSupportManager, "devSupportManager");
        this.f36601a = devSupportManager;
        this.f36602b = new C3217d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(A0 a02) {
        a02.c();
    }

    @Override // U6.g
    public void a() {
        try {
            Dialog dialog = this.f36603c;
            if (dialog != null) {
                dialog.dismiss();
            }
        } catch (IllegalArgumentException e10) {
            AbstractC7283a.n("ReactNative", "RedBoxDialogSurfaceDelegate: error while dismissing dialog: ", e10);
        }
        f();
        this.f36603c = null;
    }

    @Override // U6.g
    public boolean b() {
        Dialog dialog = this.f36603c;
        return dialog != null && dialog.isShowing();
    }

    @Override // U6.g
    public void c() {
        String strK = this.f36601a.k();
        Activity activityA = this.f36601a.a();
        if (activityA == null || activityA.isFinishing()) {
            ReactContext currentReactContext = this.f36601a.getCurrentReactContext();
            if (currentReactContext != null) {
                f36600e.b(currentReactContext, new Runnable() { // from class: com.facebook.react.devsupport.z0
                    @Override // java.lang.Runnable
                    public final void run() {
                        A0.k(this.f36871a);
                    }
                });
                return;
            }
            if (strK == null) {
                strK = "N/A";
            }
            AbstractC7283a.m("ReactNative", "Unable to launch redbox because react activity and react context is not available, here is the error that redbox would've displayed: " + strK);
            return;
        }
        y0 y0Var = this.f36604d;
        if ((y0Var != null ? y0Var.getContext() : null) != activityA) {
            e(NativeRedBoxSpec.NAME);
        }
        y0 y0Var2 = this.f36604d;
        if (y0Var2 != null) {
            y0Var2.g();
        }
        if (this.f36603c == null) {
            b bVar = new b(activityA, this, AbstractC3251p.f37153c);
            bVar.requestWindowFeature(1);
            y0 y0Var3 = this.f36604d;
            if (y0Var3 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            bVar.setContentView(y0Var3);
            this.f36603c = bVar;
        }
        Dialog dialog = this.f36603c;
        if (dialog != null) {
            dialog.show();
        }
    }

    @Override // U6.g
    public boolean d() {
        return this.f36604d != null;
    }

    @Override // U6.g
    public void e(String appKey) {
        AbstractC5504s.h(appKey, "appKey");
        this.f36601a.x();
        Activity activityA = this.f36601a.a();
        if (activityA != null && !activityA.isFinishing()) {
            y0 y0Var = new y0(activityA, this.f36601a, null);
            y0Var.d();
            this.f36604d = y0Var;
            return;
        }
        String strK = this.f36601a.k();
        if (strK == null) {
            strK = "N/A";
        }
        AbstractC7283a.m("ReactNative", "Unable to launch redbox because react activity is not available, here is the error that redbox would've displayed: " + strK);
    }

    @Override // U6.g
    public void f() {
        this.f36604d = null;
    }
}
