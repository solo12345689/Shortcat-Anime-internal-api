package com.swmansion.worklets;

import com.facebook.react.AbstractC3206a;
import com.facebook.react.O;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import k7.InterfaceC5454a;
import l7.InterfaceC5558a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class WorkletsPackage extends AbstractC3206a implements O {
    @Override // com.facebook.react.AbstractC3206a, com.facebook.react.O
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals(NativeWorkletsModuleSpec.NAME)) {
            return new WorkletsModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC3206a
    public InterfaceC5558a getReactModuleInfoProvider() {
        final HashMap map = new HashMap();
        Class cls = new Class[]{WorkletsModule.class}[0];
        InterfaceC5454a interfaceC5454a = (InterfaceC5454a) cls.getAnnotation(InterfaceC5454a.class);
        Objects.requireNonNull(interfaceC5454a);
        InterfaceC5454a interfaceC5454a2 = interfaceC5454a;
        map.put(interfaceC5454a2.name(), new ReactModuleInfo(interfaceC5454a2.name(), cls.getName(), interfaceC5454a2.canOverrideExistingModule(), interfaceC5454a2.needsEagerInit(), interfaceC5454a2.isCxxModule(), true));
        return new InterfaceC5558a() { // from class: com.swmansion.worklets.c
            @Override // l7.InterfaceC5558a
            public final Map a() {
                return WorkletsPackage.a(map);
            }
        };
    }

    public static /* synthetic */ Map a(Map map) {
        return map;
    }
}
