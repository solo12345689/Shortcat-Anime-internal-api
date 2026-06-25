package expo.modules.adapters.react;

import com.facebook.react.bridge.BaseJavaModule;
import pb.C5957b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class ModuleRegistryReadyNotifier extends BaseJavaModule {
    private C5957b mModuleRegistry;

    public ModuleRegistryReadyNotifier(C5957b c5957b) {
        this.mModuleRegistry = c5957b;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ModuleRegistryReadyNotifier";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        this.mModuleRegistry.a();
    }
}
