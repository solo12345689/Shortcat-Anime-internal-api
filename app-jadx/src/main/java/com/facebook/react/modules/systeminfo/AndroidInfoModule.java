package com.facebook.react.modules.systeminfo;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.adjust.sdk.Constants;
import com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.LinkedHashMap;
import java.util.Map;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC5454a(name = "PlatformConstants")
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/facebook/react/modules/systeminfo/AndroidInfoModule;", "Lcom/facebook/fbreact/specs/NativePlatformConstantsAndroidSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "uiMode", "()Ljava/lang/String;", "", "", "getTypedExportedConstants", "()Ljava/util/Map;", "getAndroidID", "LTd/L;", "invalidate", "()V", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidInfoModule extends NativePlatformConstantsAndroidSpec {
    private static final String IS_DISABLE_ANIMATIONS = "IS_DISABLE_ANIMATIONS";
    private static final String IS_TESTING = "IS_TESTING";
    public static final String NAME = "PlatformConstants";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidInfoModule(ReactApplicationContext reactContext) {
        super(reactContext);
        AbstractC5504s.h(reactContext, "reactContext");
    }

    private final String uiMode() {
        Object systemService = getReactApplicationContext().getSystemService("uimode");
        AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
        int currentModeType = ((UiModeManager) systemService).getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 2 ? currentModeType != 3 ? currentModeType != 4 ? currentModeType != 6 ? currentModeType != 7 ? "unknown" : "vrheadset" : "watch" : "tv" : "car" : "desk" : Constants.NORMAL;
    }

    @Override // com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec
    public String getAndroidID() {
        String string = Settings.Secure.getString(getReactApplicationContext().getContentResolver(), "android_id");
        AbstractC5504s.g(string, "getString(...)");
        return string;
    }

    @Override // com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec
    protected Map<String, Object> getTypedExportedConstants() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Version", Integer.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap.put("Release", Build.VERSION.RELEASE);
        linkedHashMap.put("Serial", Build.SERIAL);
        linkedHashMap.put("Fingerprint", Build.FINGERPRINT);
        linkedHashMap.put("Model", Build.MODEL);
        linkedHashMap.put("Manufacturer", Build.MANUFACTURER);
        linkedHashMap.put("Brand", Build.BRAND);
        if (Y6.a.f22860b) {
            Context applicationContext = getReactApplicationContext().getApplicationContext();
            AbstractC5504s.g(applicationContext, "getApplicationContext(...)");
            linkedHashMap.put("ServerHost", a.i(applicationContext));
        }
        linkedHashMap.put("isTesting", Boolean.valueOf(AbstractC5504s.c(com.amazon.a.a.o.b.f34640af, System.getProperty(IS_TESTING))));
        String property = System.getProperty(IS_DISABLE_ANIMATIONS);
        if (property != null) {
            linkedHashMap.put("isDisableAnimations", Boolean.valueOf(AbstractC5504s.c(com.amazon.a.a.o.b.f34640af, property)));
        }
        linkedHashMap.put("reactNativeVersion", b.f37080b);
        linkedHashMap.put("uiMode", uiMode());
        return linkedHashMap;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
    }
}
