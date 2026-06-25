package com.facebook.react.modules.core;

import android.net.Uri;
import com.facebook.fbreact.specs.NativeDeviceEventManagerSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import q7.InterfaceC6143a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC5454a(name = "DeviceEventManager")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/modules/core/DeviceEventManagerModule;", "Lcom/facebook/fbreact/specs/NativeDeviceEventManagerSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Lq7/a;", "backBtnHandler", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lq7/a;)V", "LTd/L;", "emitHardwareBackPressed", "()V", "Landroid/net/Uri;", "uri", "emitNewIntentReceived", "(Landroid/net/Uri;)V", "invokeDefaultBackPressHandler", "Ljava/lang/Runnable;", "invokeDefaultBackPressRunnable", "Ljava/lang/Runnable;", "Companion", "RCTDeviceEventEmitter", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class DeviceEventManagerModule extends NativeDeviceEventManagerSpec {
    public static final String NAME = "DeviceEventManager";
    private final Runnable invokeDefaultBackPressRunnable;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;", "Lcom/facebook/react/bridge/JavaScriptModule;", "", "eventName", "", "data", "LTd/L;", "emit", "(Ljava/lang/String;Ljava/lang/Object;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface RCTDeviceEventEmitter extends JavaScriptModule {
        void emit(String eventName, Object data);
    }

    public DeviceEventManagerModule(ReactApplicationContext reactApplicationContext, final InterfaceC6143a interfaceC6143a) {
        super(reactApplicationContext);
        this.invokeDefaultBackPressRunnable = new Runnable() { // from class: q7.b
            @Override // java.lang.Runnable
            public final void run() {
                DeviceEventManagerModule.invokeDefaultBackPressRunnable$lambda$0(interfaceC6143a);
            }
        };
    }

    public static final void invokeDefaultBackPressRunnable$lambda$0(InterfaceC6143a interfaceC6143a) {
        UiThreadUtil.assertOnUiThread();
        if (interfaceC6143a != null) {
            interfaceC6143a.a();
        }
    }

    public void emitHardwareBackPressed() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("hardwareBackPress", null);
        }
    }

    public void emitNewIntentReceived(Uri uri) {
        AbstractC5504s.h(uri, "uri");
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        WritableMap writableMapCreateMap = Arguments.createMap();
        new ReadableMapBuilder(writableMapCreateMap).put("url", uri.toString());
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("url", writableMapCreateMap);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeDeviceEventManagerSpec
    public void invokeDefaultBackPressHandler() {
        getReactApplicationContext().runOnUiQueueThread(this.invokeDefaultBackPressRunnable);
    }
}
