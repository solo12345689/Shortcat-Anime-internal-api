package com.facebook.react.views.drawer;

import L1.B;
import a2.AbstractC2559a;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.C2746a;
import com.facebook.react.AbstractC3247l;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.D;
import com.facebook.react.uimanager.events.p;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends AbstractC2559a {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final b f37892v0 = new b(null);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f37893s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f37894t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private boolean f37895u0;

    /* JADX INFO: renamed from: com.facebook.react.views.drawer.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0626a extends C2746a {
        C0626a() {
        }

        @Override // androidx.core.view.C2746a
        public void f(View host, AccessibilityEvent event) {
            AbstractC5504s.h(host, "host");
            AbstractC5504s.h(event, "event");
            super.f(host, event);
            Object tag = host.getTag(AbstractC3247l.f36914h);
            if (tag instanceof D.b) {
                event.setClassName(D.b.f37415a.d((D.b) tag));
            }
        }

        @Override // androidx.core.view.C2746a
        public void g(View host, B info) {
            AbstractC5504s.h(host, "host");
            AbstractC5504s.h(info, "info");
            super.g(host, info);
            D.b.a aVar = D.b.f37415a;
            D.b bVarC = aVar.c(host);
            if (bVarC != null) {
                info.z0(aVar.d(bVarC));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ReactContext reactContext) {
        super(reactContext);
        AbstractC5504s.h(reactContext, "reactContext");
        this.f37893s0 = 8388611;
        this.f37894t0 = -1;
        AbstractC2747a0.k0(this, new C0626a());
    }

    public final void W() {
        d(this.f37893s0);
    }

    public final void X() {
        I(this.f37893s0);
    }

    public final void Y() {
        if (getChildCount() == 2) {
            View childAt = getChildAt(1);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            AbstractC5504s.f(layoutParams, "null cannot be cast to non-null type androidx.drawerlayout.widget.DrawerLayout.LayoutParams");
            AbstractC2559a.f fVar = (AbstractC2559a.f) layoutParams;
            fVar.f23716a = this.f37893s0;
            ((ViewGroup.MarginLayoutParams) fVar).width = this.f37894t0;
            childAt.setLayoutParams(fVar);
            childAt.setClickable(true);
        }
    }

    @Override // a2.AbstractC2559a, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        AbstractC5504s.h(ev, "ev");
        try {
            if (!super.onInterceptTouchEvent(ev)) {
                return false;
            }
            p.b(this, ev);
            this.f37895u0 = true;
            return true;
        } catch (IllegalArgumentException e10) {
            AbstractC7283a.J("ReactNative", "Error intercepting touch event.", e10);
            return false;
        }
    }

    @Override // a2.AbstractC2559a, android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        AbstractC5504s.h(ev, "ev");
        if (ev.getActionMasked() == 1 && this.f37895u0) {
            p.a(this, ev);
            this.f37895u0 = false;
        }
        return super.onTouchEvent(ev);
    }

    public final void setDrawerPosition$ReactAndroid_release(int i10) {
        this.f37893s0 = i10;
        Y();
    }

    public final void setDrawerWidth$ReactAndroid_release(int i10) {
        this.f37894t0 = i10;
        Y();
    }
}
