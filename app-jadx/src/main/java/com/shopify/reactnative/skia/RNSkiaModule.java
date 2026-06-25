package com.shopify.reactnative.skia;

import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import java.lang.ref.WeakReference;
import k7.InterfaceC5454a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC5454a(name = "RNSkiaModule")
public class RNSkiaModule extends NativeSkiaModuleSpec {
    public static final String NAME = "RNSkiaModule";
    private static volatile boolean sIsValid = false;
    private SkiaManager skiaManager;
    private final WeakReference<ReactApplicationContext> weakReactContext;

    public RNSkiaModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.weakReactContext = new WeakReference<>(reactApplicationContext);
    }

    public static boolean isModuleValid() {
        return sIsValid;
    }

    @Override // com.shopify.reactnative.skia.NativeSkiaModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSkiaModule";
    }

    public SkiaManager getSkiaManager() {
        return this.skiaManager;
    }

    @Override // com.shopify.reactnative.skia.NativeSkiaModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean install() {
        if (this.skiaManager != null) {
            return true;
        }
        try {
            System.loadLibrary("rnskia");
            ReactApplicationContext reactApplicationContext = this.weakReactContext.get();
            if (reactApplicationContext == null) {
                Log.e("RNSkiaModule", "React Application Context was null!");
                return false;
            }
            this.skiaManager = new SkiaManager(reactApplicationContext);
            sIsValid = true;
            return true;
        } catch (Exception e10) {
            Log.e("RNSkiaModule", "Failed to initialize Skia Manager!", e10);
            return false;
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        sIsValid = false;
        SkiaManager skiaManager = this.skiaManager;
        if (skiaManager != null) {
            skiaManager.invalidate();
            this.skiaManager.a();
            this.skiaManager = null;
        }
    }
}
