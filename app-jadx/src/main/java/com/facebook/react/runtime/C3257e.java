package com.facebook.react.runtime;

import com.facebook.react.AbstractC3206a;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.LogBoxModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.debug.DevMenuModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import java.util.HashMap;
import java.util.Map;
import k7.InterfaceC5454a;
import kotlin.jvm.internal.AbstractC5504s;
import l7.InterfaceC5558a;
import q7.InterfaceC6143a;

/* JADX INFO: renamed from: com.facebook.react.runtime.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3257e extends AbstractC3206a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c7.f f37281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC6143a f37282b;

    public C3257e(c7.f devSupportManager, InterfaceC6143a hardwareBackBtnHandler) {
        AbstractC5504s.h(devSupportManager, "devSupportManager");
        AbstractC5504s.h(hardwareBackBtnHandler, "hardwareBackBtnHandler");
        this.f37281a = devSupportManager;
        this.f37282b = hardwareBackBtnHandler;
    }

    private final InterfaceC5558a b() {
        Class[] clsArr = {AndroidInfoModule.class, DeviceInfoModule.class, SourceCodeModule.class, DevMenuModule.class, DevSettingsModule.class, DeviceEventManagerModule.class, LogBoxModule.class, ExceptionsManagerModule.class};
        final HashMap map = new HashMap();
        for (int i10 = 0; i10 < 8; i10++) {
            Class cls = clsArr[i10];
            InterfaceC5454a interfaceC5454a = (InterfaceC5454a) cls.getAnnotation(InterfaceC5454a.class);
            if (interfaceC5454a != null) {
                String strName = interfaceC5454a.name();
                String strName2 = interfaceC5454a.name();
                String name = cls.getName();
                AbstractC5504s.g(name, "getName(...)");
                map.put(strName, new ReactModuleInfo(strName2, name, interfaceC5454a.canOverrideExistingModule(), interfaceC5454a.needsEagerInit(), interfaceC5454a.isCxxModule(), ReactModuleInfo.f36934g.a(cls)));
            }
        }
        return new InterfaceC5558a() { // from class: com.facebook.react.runtime.d
            @Override // l7.InterfaceC5558a
            public final Map a() {
                return C3257e.c(map);
            }
        };
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.AbstractC3206a, com.facebook.react.O
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(reactContext, "reactContext");
        switch (name.hashCode()) {
            case -2013505529:
                if (name.equals("LogBox")) {
                    return new LogBoxModule(reactContext, this.f37281a);
                }
                return null;
            case -1633589448:
                if (name.equals("DevSettings")) {
                    return new DevSettingsModule(reactContext, this.f37281a);
                }
                return null;
            case -1520650172:
                if (name.equals("DeviceInfo")) {
                    return new DeviceInfoModule(reactContext);
                }
                return null;
            case -1071344908:
                if (name.equals("DevMenu")) {
                    return new DevMenuModule(reactContext, this.f37281a);
                }
                return null;
            case -1037217463:
                if (name.equals("DeviceEventManager")) {
                    return new DeviceEventManagerModule(reactContext, this.f37282b);
                }
                return null;
            case -790603268:
                if (name.equals("PlatformConstants")) {
                    return new AndroidInfoModule(reactContext);
                }
                return null;
            case 512434409:
                if (name.equals("ExceptionsManager")) {
                    return new ExceptionsManagerModule(this.f37281a);
                }
                return null;
            case 881516744:
                if (name.equals("SourceCode")) {
                    return new SourceCodeModule(reactContext);
                }
                return null;
            default:
                return null;
        }
    }

    @Override // com.facebook.react.AbstractC3206a
    public InterfaceC5558a getReactModuleInfoProvider() throws Exception {
        if (!U6.a.a()) {
            return b();
        }
        try {
            Class clsB = U6.a.b(C3257e.class.getName() + "$$ReactModuleInfoProvider");
            Object objNewInstance = clsB != null ? clsB.newInstance() : null;
            InterfaceC5558a interfaceC5558a = objNewInstance instanceof InterfaceC5558a ? (InterfaceC5558a) objNewInstance : null;
            return interfaceC5558a == null ? b() : interfaceC5558a;
        } catch (Exception e10) {
            if (e10 instanceof ClassNotFoundException) {
                return b();
            }
            if (!(e10 instanceof InstantiationException) && !(e10 instanceof IllegalAccessException)) {
                throw e10;
            }
            throw new RuntimeException("No ReactModuleInfoProvider for " + C3257e.class.getName() + "$$ReactModuleInfoProvider", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map c(Map map) {
        return map;
    }
}
