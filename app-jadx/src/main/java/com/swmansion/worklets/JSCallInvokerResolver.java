package com.swmansion.worklets;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class JSCallInvokerResolver {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public static CallInvokerHolderImpl getJSCallInvokerHolder(ReactApplicationContext reactApplicationContext) {
        try {
            try {
                return (CallInvokerHolderImpl) reactApplicationContext.getClass().getMethod("getJSCallInvokerHolder", null).invoke(reactApplicationContext, null);
            } catch (Exception unused) {
                Object objInvoke = reactApplicationContext.getClass().getMethod("getCatalystInstance", null).invoke(reactApplicationContext, null);
                return (CallInvokerHolderImpl) objInvoke.getClass().getMethod("getJSCallInvokerHolder", null).invoke(objInvoke, null);
            }
        } catch (Exception e10) {
            throw new RuntimeException("Failed to get JSCallInvokerHolder", e10);
        }
    }
}
