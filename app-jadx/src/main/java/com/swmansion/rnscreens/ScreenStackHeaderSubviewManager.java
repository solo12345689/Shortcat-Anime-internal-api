package com.swmansion.rnscreens;

import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.InterfaceC3282a0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.q0;
import com.swmansion.rnscreens.d0;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC5454a(name = ScreenStackHeaderSubviewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001%B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J-\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0014¢\u0006\u0004\b \u0010!R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/swmansion/rnscreens/ScreenStackHeaderSubviewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/d0;", "LK7/N;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/b0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)Lcom/swmansion/rnscreens/d0;", "view", "type", "LTd/L;", "setType", "(Lcom/swmansion/rnscreens/d0;Ljava/lang/String;)V", "", "hidesSharedBackground", "setHidesSharedBackground", "(Lcom/swmansion/rnscreens/d0;Z)V", "value", "setSynchronousShadowStateUpdatesEnabled", "Lcom/facebook/react/uimanager/Q;", "props", "Lcom/facebook/react/uimanager/a0;", "stateWrapper", "", "updateState", "(Lcom/swmansion/rnscreens/d0;Lcom/facebook/react/uimanager/Q;Lcom/facebook/react/uimanager/a0;)Ljava/lang/Object;", "Lcom/facebook/react/uimanager/q0;", "getDelegate", "()Lcom/facebook/react/uimanager/q0;", "delegate", "Lcom/facebook/react/uimanager/q0;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScreenStackHeaderSubviewManager extends ViewGroupManager<d0> implements K7.N {
    public static final String REACT_CLASS = "RNSScreenStackHeaderSubview";
    private final q0 delegate;

    public ScreenStackHeaderSubviewManager() {
        super(null, 1, null);
        this.delegate = new K7.M(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected q0 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // K7.N
    public void setSynchronousShadowStateUpdatesEnabled(d0 view, boolean value) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public d0 createViewInstance(C3284b0 context) {
        AbstractC5504s.h(context, "context");
        return new d0(context);
    }

    @Override // K7.N
    @B7.a(name = "hidesSharedBackground")
    public void setHidesSharedBackground(d0 view, boolean hidesSharedBackground) {
        AbstractC5504s.h(view, "view");
        Log.w("[RNScreens]", "hidesSharedBackground prop is not available on Android");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // K7.N
    @B7.a(name = "type")
    public void setType(d0 view, String type) {
        d0.a aVar;
        AbstractC5504s.h(view, "view");
        if (type != null) {
            switch (type.hashCode()) {
                case -1364013995:
                    if (type.equals("center")) {
                        aVar = d0.a.f44455b;
                        view.setType(aVar);
                        return;
                    }
                    break;
                case 3015911:
                    if (type.equals("back")) {
                        aVar = d0.a.f44457d;
                        view.setType(aVar);
                        return;
                    }
                    break;
                case 3317767:
                    if (type.equals("left")) {
                        aVar = d0.a.f44454a;
                        view.setType(aVar);
                        return;
                    }
                    break;
                case 108511772:
                    if (type.equals("right")) {
                        aVar = d0.a.f44456c;
                        view.setType(aVar);
                        return;
                    }
                    break;
                case 1778179403:
                    if (type.equals("searchBar")) {
                        aVar = d0.a.f44458e;
                        view.setType(aVar);
                        return;
                    }
                    break;
            }
        }
        throw new JSApplicationIllegalArgumentException("Unknown type " + type);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(d0 view, com.facebook.react.uimanager.Q props, InterfaceC3282a0 stateWrapper) {
        AbstractC5504s.h(view, "view");
        view.setStateWrapper(stateWrapper);
        return super.updateState(view, props, stateWrapper);
    }
}
