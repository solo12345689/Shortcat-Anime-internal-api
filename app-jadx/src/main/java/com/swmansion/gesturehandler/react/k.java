package com.swmansion.gesturehandler.react;

import Qa.AbstractC2081d;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.W;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: g */
    public static final a f44298g = new a(null);

    /* JADX INFO: renamed from: a */
    private final ReactContext f44299a;

    /* JADX INFO: renamed from: b */
    private final Qa.i f44300b;

    /* JADX INFO: renamed from: c */
    private final AbstractC2081d f44301c;

    /* JADX INFO: renamed from: d */
    private final ViewGroup f44302d;

    /* JADX INFO: renamed from: e */
    private boolean f44303e;

    /* JADX INFO: renamed from: f */
    private boolean f44304f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ViewGroup b(ViewGroup viewGroup) {
            UiThreadUtil.assertOnUiThread();
            ViewParent parent = viewGroup;
            while (parent != null && !(parent instanceof W)) {
                parent = parent.getParent();
            }
            if (parent != null) {
                return (ViewGroup) parent;
            }
            throw new IllegalStateException(("View " + viewGroup + " has not been mounted under ReactRootView").toString());
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class b extends AbstractC2081d {
        public b(int i10) {
            I0(i10);
        }

        private final void U0(MotionEvent motionEvent) {
            Qa.i iVarP;
            if (S() == 0 && (!k.this.f44303e || (iVarP = P()) == null || !iVarP.v())) {
                p();
                k.this.f44303e = false;
            }
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 10) {
                B();
            }
        }

        @Override // Qa.AbstractC2081d
        protected void j0() {
            k.this.f44303e = true;
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setAction(3);
            if (k.this.f() instanceof W) {
                W w10 = (W) k.this.f();
                ViewGroup viewGroupF = k.this.f();
                AbstractC5504s.e(motionEventObtain);
                w10.a(viewGroupF, motionEventObtain);
            }
            motionEventObtain.recycle();
        }

        @Override // Qa.AbstractC2081d
        protected void l0(MotionEvent event, MotionEvent sourceEvent) {
            AbstractC5504s.h(event, "event");
            AbstractC5504s.h(sourceEvent, "sourceEvent");
            U0(event);
        }

        @Override // Qa.AbstractC2081d
        protected void m0(MotionEvent event, MotionEvent sourceEvent) {
            AbstractC5504s.h(event, "event");
            AbstractC5504s.h(sourceEvent, "sourceEvent");
            U0(event);
        }
    }

    public k(ReactContext context, ViewGroup wrappedView) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(wrappedView, "wrappedView");
        this.f44299a = context;
        UiThreadUtil.assertOnUiThread();
        int id2 = wrappedView.getId();
        NativeModule nativeModule = context.getNativeModule((Class<NativeModule>) RNGestureHandlerModule.class);
        AbstractC5504s.e(nativeModule);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        i registry = rNGestureHandlerModule.getRegistry();
        ViewGroup viewGroupB = f44298g.b(wrappedView);
        this.f44302d = viewGroupB;
        Log.i("ReactNative", "[GESTURE HANDLER] Initialize gesture handler for root view " + viewGroupB);
        Qa.i iVar = new Qa.i(wrappedView, registry, new o(), viewGroupB);
        iVar.F(0.1f);
        this.f44300b = iVar;
        b bVar = new b(-id2);
        this.f44301c = bVar;
        registry.j(bVar);
        registry.c(bVar.T(), id2, 3);
        rNGestureHandlerModule.registerRootHelper(this);
    }

    public static final void h(k kVar) {
        kVar.k();
    }

    private final void k() {
        AbstractC2081d abstractC2081d = this.f44301c;
        if (abstractC2081d == null || abstractC2081d.S() != 2) {
            return;
        }
        abstractC2081d.k();
        abstractC2081d.B();
    }

    public final void d(View view) {
        AbstractC5504s.h(view, "view");
        Qa.i iVar = this.f44300b;
        if (iVar != null) {
            iVar.f(view);
        }
    }

    public final boolean e(MotionEvent event) {
        AbstractC5504s.h(event, "event");
        this.f44304f = true;
        Qa.i iVar = this.f44300b;
        AbstractC5504s.e(iVar);
        iVar.B(event);
        this.f44304f = false;
        return this.f44303e;
    }

    public final ViewGroup f() {
        return this.f44302d;
    }

    public final void g(int i10, boolean z10) {
        if (z10) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.gesturehandler.react.j
                @Override // java.lang.Runnable
                public final void run() {
                    k.h(this.f44297a);
                }
            });
        }
    }

    public final void i() {
        if (this.f44300b == null || this.f44304f) {
            return;
        }
        k();
    }

    public final void j() {
        Log.i("ReactNative", "[GESTURE HANDLER] Tearing down gesture handler registered for root view " + this.f44302d);
        ReactContext reactContext = this.f44299a;
        AbstractC5504s.f(reactContext, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        NativeModule nativeModule = ((C3284b0) reactContext).b().getNativeModule((Class<NativeModule>) RNGestureHandlerModule.class);
        AbstractC5504s.e(nativeModule);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        i registry = rNGestureHandlerModule.getRegistry();
        AbstractC2081d abstractC2081d = this.f44301c;
        AbstractC5504s.e(abstractC2081d);
        registry.g(abstractC2081d.T());
        rNGestureHandlerModule.unregisterRootHelper(this);
    }
}
