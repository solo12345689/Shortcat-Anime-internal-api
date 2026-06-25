package io.sentry.react.utils;

import android.app.Activity;
import com.facebook.react.bridge.ReactApplicationContext;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.android.core.C5158q0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static Activity a(ReactApplicationContext reactApplicationContext, ILogger iLogger) {
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        if (currentActivity != null) {
            return currentActivity;
        }
        iLogger.c(EnumC5215i3.DEBUG, "[RNSentryActivityUtils] Given ReactApplicationContext has no activity attached, using CurrentActivityHolder as a fallback.", new Object[0]);
        return C5158q0.c().b();
    }
}
