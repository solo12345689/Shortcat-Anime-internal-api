package io.sentry.react.replay;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import androidx.fragment.app.K;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5320z1;
import io.sentry.Q1;
import io.sentry.android.replay.ReplayIntegration;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class a extends K.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ILogger f51247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ReplayIntegration f51248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f51249c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f51250d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WeakReference f51251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f51252f;

    /* JADX INFO: renamed from: io.sentry.react.replay.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class ViewTreeObserverOnGlobalLayoutListenerC0802a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference f51253a;

        ViewTreeObserverOnGlobalLayoutListenerC0802a(WeakReference weakReference) {
            this.f51253a = weakReference;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            View view = (View) this.f51253a.get();
            if (view != null) {
                a.this.q(view);
            }
        }
    }

    public a(ILogger iLogger) {
        this.f51247a = iLogger;
    }

    private void p(View view) {
        ViewTreeObserverOnGlobalLayoutListenerC0802a viewTreeObserverOnGlobalLayoutListenerC0802a = new ViewTreeObserverOnGlobalLayoutListenerC0802a(new WeakReference(view));
        this.f51251e = new WeakReference(view);
        this.f51252f = viewTreeObserverOnGlobalLayoutListenerC0802a;
        view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0802a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(View view) {
        try {
            DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
            int i10 = displayMetrics.widthPixels;
            int i11 = displayMetrics.heightPixels;
            if (this.f51249c == i10 && this.f51250d == i11) {
                return;
            }
            this.f51249c = i10;
            this.f51250d = i11;
            t(i10, i11);
        } catch (Exception e10) {
            this.f51247a.b(EnumC5215i3.DEBUG, "Failed to check window size", e10);
        }
    }

    private void r() {
        WeakReference weakReference = this.f51251e;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && this.f51252f != null) {
            try {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this.f51252f);
                }
            } catch (Exception e10) {
                this.f51247a.b(EnumC5215i3.DEBUG, "Failed to remove layout change listener", e10);
            }
        }
        this.f51251e = null;
        this.f51252f = null;
    }

    private ReplayIntegration s() {
        try {
            InterfaceC5320z1 replayController = Q1.b().h().getReplayController();
            if (replayController instanceof ReplayIntegration) {
                return (ReplayIntegration) replayController;
            }
            this.f51247a.c(EnumC5215i3.DEBUG, "Error getting replay integration", new Object[0]);
            return null;
        } catch (Exception e10) {
            this.f51247a.b(EnumC5215i3.DEBUG, "Error getting replay integration", e10);
            return null;
        }
    }

    private void t(int i10, int i11) {
        if (this.f51248b == null) {
            this.f51248b = s();
        }
        ReplayIntegration replayIntegration = this.f51248b;
        if (replayIntegration == null) {
            return;
        }
        try {
            replayIntegration.h(i10, i11);
        } catch (Exception e10) {
            this.f51247a.b(EnumC5215i3.DEBUG, "Failed to notify replay integration of size change", e10);
        }
    }

    @Override // androidx.fragment.app.K.l
    public void m(K k10, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, View view, Bundle bundle) {
        r();
        p(view);
    }

    @Override // androidx.fragment.app.K.l
    public void n(K k10, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        r();
    }
}
