package J7;

import app.notifee.core.event.LogEvent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.util.RCTLog;
import kotlin.jvm.internal.AbstractC5504s;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f9454a = new d();

    private d() {
    }

    public static final void a(String message) {
        AbstractC5504s.h(message, "message");
        AbstractC7283a.m("ReactNative", message);
    }

    private final String b(int i10) {
        return (i10 == 2 || i10 == 3) ? "log" : (i10 == 4 || i10 == 5) ? LogEvent.LEVEL_WARN : i10 != 6 ? "none" : LogEvent.LEVEL_ERROR;
    }

    private final void c(ReactContext reactContext, String str, int i10) {
        if (i10 < 5 || reactContext == null || !reactContext.hasActiveReactInstance() || str == null) {
            return;
        }
        ((RCTLog) reactContext.getJSModule(RCTLog.class)).logIfNoNativeHook(b(i10), str);
    }

    public static final void d(ReactContext reactContext, String message) {
        AbstractC5504s.h(message, "message");
        f9454a.c(reactContext, message, 5);
        AbstractC7283a.I("ReactNative", message);
    }
}
