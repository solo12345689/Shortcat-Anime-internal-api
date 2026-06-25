package com.reactnativegooglesignin;

import K7.InterfaceC1860y;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.f0;
import com.facebook.react.uimanager.q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class RNGoogleSigninButtonViewManager extends SimpleViewManager<O8.l> implements InterfaceC1860y {
    public static final String MODULE_NAME = "RNGoogleSigninButton";
    private static final View.OnClickListener mOnClickListener = new View.OnClickListener() { // from class: com.reactnativegooglesignin.e
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            RNGoogleSigninButtonViewManager.a(view);
        }
    };
    private final q0 mDelegate = new d(this);

    public static /* synthetic */ void a(View view) {
        ReactContext reactContext = (ReactContext) view.getContext();
        int id2 = view.getId();
        f0.c(reactContext, id2).d(new n(f0.e(reactContext), id2));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* JADX INFO: renamed from: getDelegate */
    protected q0 getMDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomBubblingEventTypeConstants = super.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants == null) {
            exportedCustomBubblingEventTypeConstants = new HashMap<>();
        }
        exportedCustomBubblingEventTypeConstants.put("topPress", U6.c.c("phasedRegistrationNames", U6.c.c("bubbled", "onPress")));
        return exportedCustomBubblingEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(C3284b0 c3284b0, O8.l lVar) {
        lVar.setOnClickListener(mOnClickListener);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public O8.l createViewInstance(C3284b0 c3284b0) {
        return new O8.l(c3284b0);
    }

    @Override // K7.InterfaceC1860y
    @B7.a(name = "color")
    public void setColor(O8.l lVar, String str) {
        if (str == null) {
            lVar.setColorScheme(2);
        } else {
            lVar.setColorScheme(!"dark".equals(str) ? 1 : 0);
        }
    }

    @Override // K7.InterfaceC1860y
    @B7.a(name = "disabled")
    public void setDisabled(O8.l lVar, boolean z10) {
        lVar.setEnabled(!z10);
    }

    @Override // K7.InterfaceC1860y
    @B7.a(name = "size")
    public void setSize(O8.l lVar, int i10) {
        lVar.setSize(i10);
    }
}
