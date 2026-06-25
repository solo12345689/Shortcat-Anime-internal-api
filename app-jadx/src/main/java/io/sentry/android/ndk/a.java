package io.sentry.android.ndk;

import io.sentry.C5322z3;
import io.sentry.android.core.D0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.ndk.NativeModuleListLoader;
import io.sentry.util.C5288a;
import io.sentry.util.w;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements D0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final C5288a f50075c = new C5288a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5322z3 f50076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NativeModuleListLoader f50077b;

    public a(SentryAndroidOptions sentryAndroidOptions, NativeModuleListLoader nativeModuleListLoader) {
        this.f50076a = (C5322z3) w.c(sentryAndroidOptions, "The SentryAndroidOptions is required.");
        this.f50077b = (NativeModuleListLoader) w.c(nativeModuleListLoader, "The NativeModuleListLoader is required.");
    }
}
