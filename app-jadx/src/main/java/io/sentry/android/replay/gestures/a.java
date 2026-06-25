package io.sentry.android.replay.gestures;

import Td.L;
import Ud.AbstractC2279u;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import ge.AbstractC4877a;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.InterfaceC5192e0;
import io.sentry.android.replay.e;
import io.sentry.android.replay.util.h;
import io.sentry.android.replay.y;
import io.sentry.util.C5288a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5322z3 f50288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f50289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f50290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C5288a f50291d;

    /* JADX INFO: renamed from: io.sentry.android.replay.gestures.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0791a extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C5322z3 f50292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c f50293c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0791a(C5322z3 options, c cVar, Window.Callback callback) {
            super(callback);
            AbstractC5504s.h(options, "options");
            this.f50292b = options;
            this.f50293c = cVar;
        }

        @Override // io.sentry.android.replay.util.h, android.view.Window.Callback
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent != null) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                AbstractC5504s.g(motionEventObtainNoHistory, "obtainNoHistory(...)");
                try {
                    c cVar = this.f50293c;
                    if (cVar != null) {
                        cVar.b(motionEventObtainNoHistory);
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f50294a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(View view) {
            super(1);
            this.f50294a = view;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(WeakReference it) {
            AbstractC5504s.h(it, "it");
            return Boolean.valueOf(AbstractC5504s.c(it.get(), this.f50294a));
        }
    }

    public a(C5322z3 options, c touchRecorderCallback) {
        AbstractC5504s.h(options, "options");
        AbstractC5504s.h(touchRecorderCallback, "touchRecorderCallback");
        this.f50288a = options;
        this.f50289b = touchRecorderCallback;
        this.f50290c = new ArrayList();
        this.f50291d = new C5288a();
    }

    private final void b(View view) {
        Window windowA = y.a(view);
        if (windowA == null) {
            this.f50288a.getLogger().c(EnumC5215i3.DEBUG, "Window is invalid, not tracking gestures", new Object[0]);
            return;
        }
        Window.Callback callback = windowA.getCallback();
        if (callback instanceof C0791a) {
            return;
        }
        windowA.setCallback(new C0791a(this.f50288a, this.f50289b, callback));
    }

    private final void d(View view) {
        Window windowA = y.a(view);
        if (windowA == null) {
            this.f50288a.getLogger().c(EnumC5215i3.DEBUG, "Window was null in stopGestureTracking", new Object[0]);
            return;
        }
        Window.Callback callback = windowA.getCallback();
        if (callback instanceof C0791a) {
            windowA.setCallback(((C0791a) callback).f50429a);
        }
    }

    @Override // io.sentry.android.replay.e
    public void a(View root, boolean z10) throws Exception {
        AbstractC5504s.h(root, "root");
        InterfaceC5192e0 interfaceC5192e0A = this.f50291d.a();
        try {
            if (z10) {
                this.f50290c.add(new WeakReference(root));
                b(root);
                L l10 = L.f17438a;
            } else {
                d(root);
                AbstractC2279u.K(this.f50290c, new b(root));
            }
            AbstractC4877a.a(interfaceC5192e0A, null);
        } finally {
        }
    }

    public final void c() throws Exception {
        InterfaceC5192e0 interfaceC5192e0A = this.f50291d.a();
        try {
            Iterator it = this.f50290c.iterator();
            while (it.hasNext()) {
                View view = (View) ((WeakReference) it.next()).get();
                if (view != null) {
                    AbstractC5504s.e(view);
                    d(view);
                }
            }
            this.f50290c.clear();
            L l10 = L.f17438a;
            AbstractC4877a.a(interfaceC5192e0A, null);
        } finally {
        }
    }
}
