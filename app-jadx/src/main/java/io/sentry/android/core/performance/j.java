package io.sentry.android.core.performance;

import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class j extends io.sentry.android.core.internal.gestures.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f49997b;

    public j(Window.Callback callback, Runnable runnable) {
        super(callback);
        this.f49997b = runnable;
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public void onContentChanged() {
        super.onContentChanged();
        this.f49997b.run();
    }
}
