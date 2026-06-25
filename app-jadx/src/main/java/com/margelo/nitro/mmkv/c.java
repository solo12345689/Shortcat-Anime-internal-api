package com.margelo.nitro.mmkv;

import com.facebook.react.AbstractC3206a;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.HashMap;
import java.util.Map;
import l7.InterfaceC5558a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c extends AbstractC3206a {
    static {
        a.c();
    }

    public static /* synthetic */ Map a() {
        return new HashMap();
    }

    @Override // com.facebook.react.AbstractC3206a, com.facebook.react.O
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        return null;
    }

    @Override // com.facebook.react.AbstractC3206a
    public InterfaceC5558a getReactModuleInfoProvider() {
        return new InterfaceC5558a() { // from class: com.margelo.nitro.mmkv.b
            @Override // l7.InterfaceC5558a
            public final Map a() {
                return c.a();
            }
        };
    }
}
