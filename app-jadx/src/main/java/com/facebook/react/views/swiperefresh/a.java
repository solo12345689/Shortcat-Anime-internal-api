package com.facebook.react.views.swiperefresh;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.B;
import com.facebook.react.uimanager.events.p;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends androidx.swiperefreshlayout.widget.c {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private static final C0631a f38178A0 = new C0631a(null);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private boolean f38179t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private boolean f38180u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private float f38181v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private final int f38182w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private float f38183x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private boolean f38184y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private boolean f38185z0;

    /* JADX INFO: renamed from: com.facebook.react.views.swiperefresh.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0631a {
        public /* synthetic */ C0631a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0631a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ReactContext reactContext) {
        super(reactContext);
        AbstractC5504s.h(reactContext, "reactContext");
        this.f38182w0 = ViewConfiguration.get(reactContext).getScaledTouchSlop();
    }

    private final boolean B(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f38183x0 = motionEvent.getX();
            this.f38184y0 = false;
        } else if (action == 2) {
            float fAbs = Math.abs(motionEvent.getX() - this.f38183x0);
            if (this.f38184y0 || fAbs > this.f38182w0) {
                this.f38184y0 = true;
                return false;
            }
        }
        return true;
    }

    @Override // androidx.swiperefreshlayout.widget.c
    public boolean c() {
        View childAt = getChildAt(0);
        return childAt != null ? childAt.canScrollVertically(-1) : super.c();
    }

    @Override // androidx.swiperefreshlayout.widget.c, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        AbstractC5504s.h(ev, "ev");
        if (!B(ev) || !super.onInterceptTouchEvent(ev)) {
            return false;
        }
        p.b(this, ev);
        this.f38185z0 = true;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    @Override // androidx.swiperefreshlayout.widget.c, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f38179t0) {
            return;
        }
        this.f38179t0 = true;
        setProgressViewOffset(this.f38181v0);
        setRefreshing(this.f38180u0);
    }

    @Override // androidx.swiperefreshlayout.widget.c, android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        AbstractC5504s.h(ev, "ev");
        if (ev.getActionMasked() == 1 && this.f38185z0) {
            p.a(this, ev);
            this.f38185z0 = false;
        }
        return super.onTouchEvent(ev);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public final void setProgressViewOffset(float f10) {
        this.f38181v0 = f10;
        if (this.f38179t0) {
            int progressCircleDiameter = getProgressCircleDiameter();
            s(false, Math.round(B.i(f10)) - progressCircleDiameter, Math.round(B.i(f10 + 64.0f)) - progressCircleDiameter);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.c
    public void setRefreshing(boolean z10) {
        this.f38180u0 = z10;
        if (this.f38179t0) {
            super.setRefreshing(z10);
        }
    }
}
