package com.swmansion.rnscreens.gamma.stack.screen;

import K7.U;
import K7.V;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.q0;
import com.swmansion.rnscreens.gamma.stack.screen.a;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC5454a(name = StackScreenViewManager.REACT_CLASS)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/swmansion/rnscreens/gamma/stack/screen/StackScreenViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/gamma/stack/screen/a;", "LK7/V;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/q0;", "getDelegate", "()Lcom/facebook/react/uimanager/q0;", "Lcom/facebook/react/uimanager/b0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)Lcom/swmansion/rnscreens/gamma/stack/screen/a;", "view", "LTd/L;", "addEventEmitters", "(Lcom/facebook/react/uimanager/b0;Lcom/swmansion/rnscreens/gamma/stack/screen/a;)V", "value", "setActivityMode", "(Lcom/swmansion/rnscreens/gamma/stack/screen/a;Ljava/lang/String;)V", "setScreenKey", "delegate", "Lcom/facebook/react/uimanager/q0;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StackScreenViewManager extends ViewGroupManager<a> implements V {
    public static final String REACT_CLASS = "RNSStackScreen";
    private final q0 delegate;

    public StackScreenViewManager() {
        super(null, 1, null);
        this.delegate = new U(this);
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(C3284b0 reactContext, a view) {
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(view, "view");
        super.addEventEmitters(reactContext, view);
        view.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(C3284b0 reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        return new a(reactContext);
    }

    @Override // K7.V
    public void setActivityMode(a view, String value) {
        AbstractC5504s.h(view, "view");
        if (AbstractC5504s.c(value, "attached")) {
            view.setActivityMode(a.EnumC0698a.f44523b);
            return;
        }
        if (AbstractC5504s.c(value, "detached")) {
            view.setActivityMode(a.EnumC0698a.f44522a);
            return;
        }
        throw new JSApplicationIllegalArgumentException("[RNScreens] Invalid activity mode: " + value + ".");
    }

    @Override // K7.V
    public void setScreenKey(a view, String value) {
        AbstractC5504s.h(view, "view");
        if (value == null) {
            throw new IllegalArgumentException("[RNScreens] screenKey must not be null.");
        }
        view.setScreenKey(value);
    }
}
