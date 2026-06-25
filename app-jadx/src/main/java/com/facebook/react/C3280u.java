package com.facebook.react;

import android.view.KeyEvent;
import android.view.View;
import app.notifee.core.event.LogEvent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.facebook.react.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3280u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f37359b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f37360c = Ud.S.l(Td.z.a(23, "select"), Td.z.a(66, "select"), Td.z.a(62, "select"), Td.z.a(85, "playPause"), Td.z.a(89, "rewind"), Td.z.a(90, "fastForward"), Td.z.a(86, "stop"), Td.z.a(87, "next"), Td.z.a(88, "previous"), Td.z.a(19, "up"), Td.z.a(22, "right"), Td.z.a(20, "down"), Td.z.a(21, "left"), Td.z.a(165, LogEvent.LEVEL_INFO), Td.z.a(82, "menu"), Td.z.a(166, "channelUp"), Td.z.a(167, "channelDown"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37361a = -1;

    /* JADX INFO: renamed from: com.facebook.react.u$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void b(ReactContext reactContext, String str, int i10, int i11) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("eventType", str);
        writableNativeMap.putInt("eventKeyAction", i11);
        if (i10 != -1) {
            writableNativeMap.putInt("tag", i10);
        }
        reactContext.emitDeviceEvent("onHWKeyEvent", writableNativeMap);
    }

    static /* synthetic */ void c(C3280u c3280u, ReactContext reactContext, String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        c3280u.b(reactContext, str, i10, i11);
    }

    public final void a(ReactContext context) {
        C3280u c3280u;
        AbstractC5504s.h(context, "context");
        int i10 = this.f37361a;
        if (i10 != -1) {
            c3280u = this;
            c(c3280u, context, "blur", i10, 0, 8, null);
        } else {
            c3280u = this;
        }
        c3280u.f37361a = -1;
    }

    public final void d(KeyEvent ev, ReactContext context) {
        AbstractC5504s.h(ev, "ev");
        AbstractC5504s.h(context, "context");
        int keyCode = ev.getKeyCode();
        int action = ev.getAction();
        if (action == 1 || action == 0) {
            Map map = f37360c;
            if (map.containsKey(Integer.valueOf(keyCode))) {
                b(context, (String) map.get(Integer.valueOf(keyCode)), this.f37361a, action);
            }
        }
    }

    public final void e(View newFocusedView, ReactContext context) {
        AbstractC5504s.h(newFocusedView, "newFocusedView");
        AbstractC5504s.h(context, "context");
        if (this.f37361a == newFocusedView.getId()) {
            return;
        }
        int i10 = this.f37361a;
        if (i10 != -1) {
            c(this, context, "blur", i10, 0, 8, null);
        }
        this.f37361a = newFocusedView.getId();
        c(this, context, "focus", newFocusedView.getId(), 0, 8, null);
    }
}
