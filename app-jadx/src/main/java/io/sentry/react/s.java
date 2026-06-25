package io.sentry.react;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import androidx.fragment.app.K;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.f0;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.android.core.C5131g0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class s extends K.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5131g0 f51255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f51256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ILogger f51257c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements com.facebook.react.uimanager.events.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ EventDispatcher f51258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f51259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Runnable f51260c;

        a(EventDispatcher eventDispatcher, View view, Runnable runnable) {
            this.f51258a = eventDispatcher;
            this.f51259b = view;
            this.f51260c = runnable;
        }

        @Override // com.facebook.react.uimanager.events.i
        public void onEventDispatch(com.facebook.react.uimanager.events.d dVar) {
            if ("Ta.f".equals(dVar.getClass().getCanonicalName())) {
                this.f51258a.b(this);
                io.sentry.android.core.internal.util.t.e(this.f51259b, this.f51260c, s.this.f51255a);
            }
        }
    }

    public s(C5131g0 c5131g0, Runnable runnable, ILogger iLogger) {
        this.f51255a = c5131g0;
        this.f51256b = runnable;
        this.f51257c = iLogger;
    }

    private static EventDispatcher p(View view, int i10) {
        return f0.c(f0.d(view), i10);
    }

    @Override // androidx.fragment.app.K.l
    public void m(K k10, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, View view, Bundle bundle) {
        if (!"com.swmansion.rnscreens.X".equals(abstractComponentCallbacksC2838q.getClass().getCanonicalName())) {
            this.f51257c.c(EnumC5215i3.DEBUG, "Fragment is not a ScreenStackFragment, won't listen for the first draw.", new Object[0]);
            return;
        }
        if (!(view instanceof ViewGroup)) {
            this.f51257c.c(EnumC5215i3.WARNING, "Fragment view is not a ViewGroup, won't listen for the first draw.", new Object[0]);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getChildCount() == 0) {
            this.f51257c.c(EnumC5215i3.WARNING, "Fragment view has no children, won't listen for the first draw.", new Object[0]);
            return;
        }
        View childAt = viewGroup.getChildAt(0);
        if (childAt == null || !(childAt.getContext() instanceof ReactContext)) {
            this.f51257c.c(EnumC5215i3.WARNING, "Fragment view has no ReactContext, won't listen for the first draw.", new Object[0]);
            return;
        }
        int id2 = childAt.getId();
        if (id2 == -1) {
            this.f51257c.c(EnumC5215i3.WARNING, "Screen has no id, won't listen for the first draw.", new Object[0]);
            return;
        }
        EventDispatcher eventDispatcherP = p(childAt, id2);
        if (eventDispatcherP == null) {
            this.f51257c.c(EnumC5215i3.WARNING, "Screen has no event dispatcher, won't listen for the first draw.", new Object[0]);
        } else {
            eventDispatcherP.c(new a(eventDispatcherP, view, this.f51256b));
        }
    }
}
