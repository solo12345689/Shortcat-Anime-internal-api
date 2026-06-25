package io.sentry.android.core;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: io.sentry.android.core.q0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class C5158q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C5158q0 f50001b = new C5158q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference f50002a;

    private C5158q0() {
    }

    public static C5158q0 c() {
        return f50001b;
    }

    public void a(Activity activity) {
        WeakReference weakReference = this.f50002a;
        if (weakReference == null || weakReference.get() == activity) {
            this.f50002a = null;
        }
    }

    public Activity b() {
        WeakReference weakReference = this.f50002a;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public void d(Activity activity) {
        WeakReference weakReference = this.f50002a;
        if (weakReference == null || weakReference.get() != activity) {
            this.f50002a = new WeakReference(activity);
        }
    }
}
