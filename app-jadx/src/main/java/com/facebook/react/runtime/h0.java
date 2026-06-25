package com.facebook.react.runtime;

import android.app.Activity;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.LifecycleState;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f37290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LifecycleState f37291b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37292a;

        static {
            int[] iArr = new int[LifecycleState.values().length];
            try {
                iArr[LifecycleState.f36550a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LifecycleState.f36552c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LifecycleState.f36551b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37292a = iArr;
        }
    }

    public h0(c0 stateTracker) {
        AbstractC5504s.h(stateTracker, "stateTracker");
        this.f37290a = stateTracker;
        this.f37291b = LifecycleState.f36550a;
    }

    public final LifecycleState a() {
        return this.f37291b;
    }

    public final void b(ReactContext reactContext) {
        if (reactContext != null) {
            int i10 = a.f37292a[this.f37291b.ordinal()];
            if (i10 == 2) {
                c0.b(this.f37290a, "ReactContext.onHostPause()", null, 2, null);
                reactContext.onHostPause();
                c0.b(this.f37290a, "ReactContext.onHostDestroy()", null, 2, null);
                reactContext.onHostDestroy();
            } else if (i10 == 3) {
                c0.b(this.f37290a, "ReactContext.onHostDestroy()", null, 2, null);
                reactContext.onHostDestroy();
            }
        }
        this.f37291b = LifecycleState.f36550a;
    }

    public final void c(ReactContext reactContext, Activity activity) {
        if (reactContext != null) {
            int i10 = a.f37292a[this.f37291b.ordinal()];
            if (i10 == 1) {
                c0.b(this.f37290a, "ReactContext.onHostResume()", null, 2, null);
                reactContext.onHostResume(activity);
                c0.b(this.f37290a, "ReactContext.onHostPause()", null, 2, null);
                reactContext.onHostPause();
            } else if (i10 == 2) {
                c0.b(this.f37290a, "ReactContext.onHostPause()", null, 2, null);
                reactContext.onHostPause();
            }
        }
        this.f37291b = LifecycleState.f36551b;
    }

    public final void d(ReactContext reactContext, Activity activity) {
        LifecycleState lifecycleState = this.f37291b;
        LifecycleState lifecycleState2 = LifecycleState.f36552c;
        if (lifecycleState == lifecycleState2) {
            return;
        }
        if (reactContext != null) {
            c0.b(this.f37290a, "ReactContext.onHostResume()", null, 2, null);
            reactContext.onHostResume(activity);
        }
        this.f37291b = lifecycleState2;
    }

    public final void e(ReactContext currentContext, Activity activity) {
        AbstractC5504s.h(currentContext, "currentContext");
        if (this.f37291b == LifecycleState.f36552c) {
            c0.b(this.f37290a, "ReactContext.onHostResume()", null, 2, null);
            currentContext.onHostResume(activity);
        }
    }
}
