package com.revenuecat.purchases.react.ui;

import Ud.AbstractC2279u;
import com.facebook.react.O;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\n0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/revenuecat/purchases/react/ui/RevenueCatUIPackage;", "Lcom/facebook/react/O;", "<init>", "()V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "", "Lcom/facebook/react/bridge/NativeModule;", "createNativeModules", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;", "Lcom/facebook/react/uimanager/ViewManager;", "createViewManagers", "react-native-purchases-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RevenueCatUIPackage implements O {
    @Override // com.facebook.react.O
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        return AbstractC2279u.p(new RNPaywallsModule(reactContext), new RNCustomerCenterModule(reactContext));
    }

    @Override // com.facebook.react.O
    public List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        return AbstractC2279u.p(new PaywallViewManager(), new PaywallFooterViewManager(), new CustomerCenterViewManager());
    }

    @Override // com.facebook.react.O
    public /* bridge */ /* synthetic */ NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        return super.getModule(str, reactApplicationContext);
    }
}
