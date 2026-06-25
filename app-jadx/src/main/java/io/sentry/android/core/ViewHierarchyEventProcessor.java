package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import io.sentry.C5176b;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.V2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewHierarchyEventProcessor implements io.sentry.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SentryAndroidOptions f49644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.p f49645b = new io.sentry.android.core.internal.util.p(io.sentry.android.core.internal.util.h.a(), 2000, 3);

    public ViewHierarchyEventProcessor(SentryAndroidOptions sentryAndroidOptions) {
        this.f49644a = (SentryAndroidOptions) io.sentry.util.w.c(sentryAndroidOptions, "SentryAndroidOptions is required");
        if (sentryAndroidOptions.isAttachViewHierarchy()) {
            io.sentry.util.n.a("ViewHierarchy");
        }
    }

    public static /* synthetic */ void c(AtomicReference atomicReference, View view, List list, CountDownLatch countDownLatch, ILogger iLogger) {
        try {
            atomicReference.set(h(view, list));
            countDownLatch.countDown();
        } catch (Throwable th2) {
            iLogger.b(EnumC5215i3.ERROR, "Failed to process view hierarchy.", th2);
        }
    }

    private static void d(View view, io.sentry.protocol.K k10, List list) {
        if (view instanceof ViewGroup) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(childCount);
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != null) {
                    io.sentry.protocol.K kI = i(childAt);
                    arrayList.add(kI);
                    d(childAt, kI, list);
                }
            }
            k10.m(arrayList);
        }
    }

    public static io.sentry.protocol.J e(Activity activity, ILogger iLogger) {
        return f(activity, new ArrayList(0), io.sentry.android.core.internal.util.l.e(), iLogger);
    }

    public static io.sentry.protocol.J f(Activity activity, final List list, io.sentry.util.thread.a aVar, ILogger iLogger) {
        final ILogger iLogger2;
        Throwable th2;
        if (activity == null) {
            iLogger.c(EnumC5215i3.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            iLogger.c(EnumC5215i3.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        final View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            iLogger.c(EnumC5215i3.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        try {
        } catch (Throwable th3) {
            th = th3;
            iLogger2 = iLogger;
        }
        if (!aVar.a()) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final AtomicReference atomicReference = new AtomicReference(null);
            iLogger2 = iLogger;
            try {
                activity.runOnUiThread(new Runnable() { // from class: io.sentry.android.core.i1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewHierarchyEventProcessor.c(atomicReference, viewPeekDecorView, list, countDownLatch, iLogger2);
                    }
                });
                if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                    return (io.sentry.protocol.J) atomicReference.get();
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                iLogger2.b(EnumC5215i3.ERROR, "Failed to process view hierarchy.", th2);
            }
            return null;
        }
        try {
            return h(viewPeekDecorView, list);
        } catch (Throwable th5) {
            th2 = th5;
            iLogger2 = iLogger;
        }
        th2 = th;
        iLogger2.b(EnumC5215i3.ERROR, "Failed to process view hierarchy.", th2);
        return null;
    }

    public static io.sentry.protocol.J h(View view, List list) {
        ArrayList arrayList = new ArrayList(1);
        io.sentry.protocol.J j10 = new io.sentry.protocol.J("android_view_system", arrayList);
        io.sentry.protocol.K kI = i(view);
        arrayList.add(kI);
        d(view, kI, list);
        return j10;
    }

    private static io.sentry.protocol.K i(View view) {
        io.sentry.protocol.K k10 = new io.sentry.protocol.K();
        k10.p(io.sentry.android.core.internal.util.m.a(view));
        try {
            k10.o(io.sentry.android.core.internal.gestures.i.b(view));
        } catch (Throwable unused) {
        }
        k10.t(Double.valueOf(view.getX()));
        k10.u(Double.valueOf(view.getY()));
        k10.s(Double.valueOf(view.getWidth()));
        k10.n(Double.valueOf(view.getHeight()));
        k10.l(Double.valueOf(view.getAlpha()));
        int visibility = view.getVisibility();
        if (visibility == 0) {
            k10.r("visible");
        } else if (visibility == 4) {
            k10.r("invisible");
        } else if (visibility == 8) {
            k10.r("gone");
        }
        return k10;
    }

    @Override // io.sentry.C
    public V2 b(V2 v22, io.sentry.H h10) {
        io.sentry.protocol.J jF;
        if (v22.z0()) {
            if (!this.f49644a.isAttachViewHierarchy()) {
                this.f49644a.getLogger().c(EnumC5215i3.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
                return v22;
            }
            if (!io.sentry.util.l.g(h10)) {
                boolean zA = this.f49645b.a();
                this.f49644a.getBeforeViewHierarchyCaptureCallback();
                if (!zA && (jF = f(C5158q0.c().b(), this.f49644a.getViewHierarchyExporters(), this.f49644a.getThreadChecker(), this.f49644a.getLogger())) != null) {
                    h10.o(C5176b.c(jF));
                }
            }
        }
        return v22;
    }

    @Override // io.sentry.C
    public io.sentry.protocol.E g(io.sentry.protocol.E e10, io.sentry.H h10) {
        return e10;
    }
}
