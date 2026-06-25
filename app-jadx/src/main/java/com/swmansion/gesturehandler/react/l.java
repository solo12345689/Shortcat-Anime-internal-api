package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.W;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends com.facebook.react.views.view.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f44306d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f44307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f44308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k f44309c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(ViewGroup viewGroup) {
            UiThreadUtil.assertOnUiThread();
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof l) {
                    return true;
                }
                if (parent instanceof W) {
                    return false;
                }
            }
            return false;
        }

        private a() {
        }
    }

    public l(Context context) {
        super(context);
    }

    public final void B(View view) {
        AbstractC5504s.h(view, "view");
        k kVar = this.f44309c;
        if (kVar != null) {
            kVar.d(view);
        }
    }

    public final boolean C() {
        return this.f44307a;
    }

    public final void D() {
        k kVar = this.f44309c;
        if (kVar != null) {
            kVar.j();
        }
    }

    @Override // com.facebook.react.views.view.g, android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent ev) {
        AbstractC5504s.h(ev, "ev");
        if (this.f44307a && com.swmansion.gesturehandler.react.a.c(ev)) {
            k kVar = this.f44309c;
            AbstractC5504s.e(kVar);
            if (kVar.e(ev)) {
                return true;
            }
        }
        return super.dispatchGenericMotionEvent(ev);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        AbstractC5504s.h(event, "event");
        if (this.f44307a) {
            k kVar = this.f44309c;
            AbstractC5504s.e(kVar);
            if (kVar.e(event)) {
                return true;
            }
        }
        return super.dispatchTouchEvent(event);
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z10 = this.f44308b || !f44306d.b(this);
        this.f44307a = z10;
        if (!z10) {
            Log.i("ReactNative", "[GESTURE HANDLER] Gesture handler is already enabled for a parent view");
        }
        if (this.f44307a && this.f44309c == null) {
            Context context = getContext();
            AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            this.f44309c = new k((ReactContext) context, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.f44307a) {
            k kVar = this.f44309c;
            AbstractC5504s.e(kVar);
            kVar.i();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void setUnstableForceActive(boolean z10) {
        this.f44308b = z10;
    }
}
