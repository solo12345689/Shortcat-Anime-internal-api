package com.facebook.react.modules.deviceinfo;

import Td.z;
import Ud.S;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.facebook.fbreact.specs.NativeDeviceInfoSpec;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C3289e;
import com.facebook.react.views.view.WindowUtilKt;
import java.util.Map;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC5454a(name = "DeviceInfo")
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u001aB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;", "Lcom/facebook/fbreact/specs/NativeDeviceInfoSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "", "", "getTypedExportedConstants", "()Ljava/util/Map;", "LTd/L;", "onHostResume", "()V", "onHostPause", "onHostDestroy", "emitUpdateDimensionsEvent", "invalidate", "", "fontScale", "F", "Lcom/facebook/react/bridge/ReadableMap;", "previousDisplayMetrics", "Lcom/facebook/react/bridge/ReadableMap;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeviceInfoModule extends NativeDeviceInfoSpec implements LifecycleEventListener {
    public static final String NAME = "DeviceInfo";
    private float fontScale;
    private ReadableMap previousDisplayMetrics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceInfoModule(ReactApplicationContext reactContext) {
        super(reactContext);
        AbstractC5504s.h(reactContext, "reactContext");
        this.fontScale = reactContext.getResources().getConfiguration().fontScale;
        C3289e.i(reactContext);
        reactContext.addLifecycleEventListener(this);
    }

    public final void emitUpdateDimensionsEvent() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (!reactApplicationContext.hasActiveReactInstance()) {
            ReactSoftExceptionLogger.logSoftException("DeviceInfo", new ReactNoCrashSoftException("No active CatalystInstance, cannot emitUpdateDimensionsEvent"));
            return;
        }
        WritableMap writableMapB = C3289e.b(this.fontScale);
        ReadableMap readableMap = this.previousDisplayMetrics;
        if (readableMap == null) {
            this.previousDisplayMetrics = writableMapB.copy();
        } else {
            if (AbstractC5504s.c(writableMapB, readableMap)) {
                return;
            }
            this.previousDisplayMetrics = writableMapB.copy();
            reactApplicationContext.emitDeviceEvent("didUpdateDimensions", writableMapB);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeDeviceInfoSpec
    public Map<String, Object> getTypedExportedConstants() {
        WritableMap writableMapB = C3289e.b(this.fontScale);
        this.previousDisplayMetrics = writableMapB.copy();
        return S.l(z.a("Dimensions", writableMapB.toHashMap()), z.a("isEdgeToEdge", Boolean.valueOf(WindowUtilKt.isEdgeToEdgeFeatureFlagOn())));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        getReactApplicationContext().removeLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        Configuration configuration;
        Resources resources = getReactApplicationContext().getResources();
        Float fValueOf = (resources == null || (configuration = resources.getConfiguration()) == null) ? null : Float.valueOf(configuration.fontScale);
        if (fValueOf == null || AbstractC5504s.b(fValueOf, this.fontScale)) {
            return;
        }
        this.fontScale = fValueOf.floatValue();
        emitUpdateDimensionsEvent();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }
}
