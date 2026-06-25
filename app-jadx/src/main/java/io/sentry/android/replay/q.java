package io.sentry.android.replay;

import android.view.View;
import android.view.ViewOverlay;
import android.view.ViewTreeObserver;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.S1;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class q implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f50338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5322z3 f50339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f50340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WeakReference f50341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f50342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.sentry.android.replay.util.d f50343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f50344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final io.sentry.android.replay.screenshot.j f50345h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50346a;

        static {
            int[] iArr = new int[S1.values().length];
            try {
                iArr[S1.CANVAS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[S1.PIXEL_COPY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f50346a = iArr;
        }
    }

    public q(s config, C5322z3 options, b executorProvider, r rVar) {
        io.sentry.android.replay.screenshot.j dVar;
        AbstractC5504s.h(config, "config");
        AbstractC5504s.h(options, "options");
        AbstractC5504s.h(executorProvider, "executorProvider");
        this.f50338a = config;
        this.f50339b = options;
        this.f50340c = executorProvider;
        this.f50342e = new AtomicBoolean(true);
        io.sentry.android.replay.util.d dVar2 = new io.sentry.android.replay.util.d();
        this.f50343f = dVar2;
        this.f50344g = new AtomicBoolean(false);
        int i10 = a.f50346a[options.getSessionReplay().n().ordinal()];
        if (i10 == 1) {
            dVar = new io.sentry.android.replay.screenshot.d(executorProvider, rVar, options, config);
        } else {
            if (i10 != 2) {
                throw new Td.r();
            }
            dVar = new io.sentry.android.replay.screenshot.i(executorProvider, rVar, options, config, dVar2);
        }
        this.f50345h = dVar;
    }

    public final void a(View root) {
        AbstractC5504s.h(root, "root");
        WeakReference weakReference = this.f50341d;
        f(weakReference != null ? (View) weakReference.get() : null);
        WeakReference weakReference2 = this.f50341d;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f50341d = new WeakReference(root);
        io.sentry.android.replay.util.r.a(root, this);
        this.f50344g.set(true);
        this.f50345h.onContentChanged();
    }

    public final void b() {
        if (this.f50339b.getSessionReplay().u()) {
            this.f50339b.getLogger().c(EnumC5215i3.DEBUG, "Capturing screenshot, isCapturing: %s", Boolean.valueOf(this.f50342e.get()));
        }
        if (!this.f50342e.get()) {
            if (this.f50339b.getSessionReplay().u()) {
                this.f50339b.getLogger().c(EnumC5215i3.DEBUG, "ScreenshotRecorder is paused, not capturing screenshot", new Object[0]);
                return;
            }
            return;
        }
        if (this.f50339b.getSessionReplay().u()) {
            this.f50339b.getLogger().c(EnumC5215i3.DEBUG, "Capturing screenshot, contentChanged: %s, lastCaptureSuccessful: %s", Boolean.valueOf(this.f50344g.get()), Boolean.valueOf(this.f50345h.a()));
        }
        if (!this.f50344g.get()) {
            this.f50345h.b();
            return;
        }
        WeakReference weakReference = this.f50341d;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            this.f50339b.getLogger().c(EnumC5215i3.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (y.a(view) == null) {
            this.f50339b.getLogger().c(EnumC5215i3.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            this.f50344g.set(false);
            this.f50345h.c(view);
        } catch (Throwable th2) {
            this.f50339b.getLogger().b(EnumC5215i3.WARNING, "Failed to capture replay recording", th2);
        }
    }

    public final void c() {
        this.f50342e.set(false);
        WeakReference weakReference = this.f50341d;
        f(weakReference != null ? (View) weakReference.get() : null);
        WeakReference weakReference2 = this.f50341d;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f50345h.close();
    }

    public final void d() {
        this.f50342e.set(false);
        WeakReference weakReference = this.f50341d;
        f(weakReference != null ? (View) weakReference.get() : null);
    }

    public final void e() {
        View view;
        WeakReference weakReference = this.f50341d;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            io.sentry.android.replay.util.r.a(view, this);
        }
        this.f50342e.set(true);
    }

    public final void f(View view) {
        ViewOverlay overlay;
        if (this.f50339b.getReplayController().o() && view != null && (overlay = view.getOverlay()) != null) {
            overlay.remove(this.f50343f);
        }
        if (view != null) {
            io.sentry.android.replay.util.r.h(view, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        if (this.f50342e.get()) {
            WeakReference weakReference = this.f50341d;
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
                this.f50339b.getLogger().c(EnumC5215i3.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            } else {
                this.f50344g.set(true);
                this.f50345h.onContentChanged();
            }
        }
    }
}
