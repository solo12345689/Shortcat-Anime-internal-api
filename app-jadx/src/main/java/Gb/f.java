package gb;

import com.facebook.react.X;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.zoontek.rnpermissions.NativeRNPermissionsSpec;
import com.zoontek.rnpermissions.RNPermissionsModule;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import l7.InterfaceC5558a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends X {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map b() {
        HashMap map = new HashMap();
        map.put(NativeRNPermissionsSpec.NAME, new ReactModuleInfo(NativeRNPermissionsSpec.NAME, NativeRNPermissionsSpec.NAME, false, true, false, true));
        return map;
    }

    @Override // com.facebook.react.AbstractC3206a, com.facebook.react.O
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(reactContext, "reactContext");
        if (AbstractC5504s.c(name, NativeRNPermissionsSpec.NAME)) {
            return new RNPermissionsModule(reactContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC3206a
    public InterfaceC5558a getReactModuleInfoProvider() {
        return new InterfaceC5558a() { // from class: gb.e
            @Override // l7.InterfaceC5558a
            public final Map a() {
                return f.b();
            }
        };
    }
}
