package Ub;

import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C3284b0;
import expo.modules.adapters.react.NativeModulesProxy;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class w {
    public static final NativeModulesProxy a(ReactContext reactContext) {
        NativeModule nativeModule;
        Object next;
        AbstractC5504s.h(reactContext, "<this>");
        if (!reactContext.isBridgeless()) {
            CatalystInstance catalystInstance = reactContext.getCatalystInstance();
            NativeModule nativeModule2 = catalystInstance != null ? catalystInstance.getNativeModule("NativeUnimoduleProxy") : null;
            if (nativeModule2 instanceof NativeModulesProxy) {
                return (NativeModulesProxy) nativeModule2;
            }
            return null;
        }
        Collection<NativeModule> nativeModules = ((C3284b0) reactContext).b().getNativeModules();
        if (nativeModules != null) {
            Iterator<T> it = nativeModules.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((NativeModule) next) instanceof NativeModulesProxy) {
                    break;
                }
            }
            nativeModule = (NativeModule) next;
        } else {
            nativeModule = null;
        }
        if (nativeModule instanceof NativeModulesProxy) {
            return (NativeModulesProxy) nativeModule;
        }
        return null;
    }
}
