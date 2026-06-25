package com.reactnativekeyboardcontroller;

import K7.C1845q;
import K7.r;
import Na.e;
import android.view.View;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.InterfaceC3282a0;
import com.facebook.react.uimanager.Q;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.q0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R0\u0010(\u001a\u001e\u0012\f\u0012\n '*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n '*\u0004\u0018\u00010\u00000\u00000&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/reactnativekeyboardcontroller/OverKeyboardViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "LNa/e;", "LK7/r;", "<init>", "()V", "Lcom/facebook/react/uimanager/q0;", "getDelegate", "()Lcom/facebook/react/uimanager/q0;", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/b0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)LNa/e;", "Lcom/facebook/react/uimanager/r;", "createShadowNodeInstance", "()Lcom/facebook/react/uimanager/r;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "view", "Lcom/facebook/react/uimanager/Q;", "props", "Lcom/facebook/react/uimanager/a0;", "stateWrapper", "", "updateState", "(LNa/e;Lcom/facebook/react/uimanager/Q;Lcom/facebook/react/uimanager/a0;)Ljava/lang/Object;", "", "value", "LTd/L;", "setVisible", "(LNa/e;Z)V", "LGa/d;", "manager", "LGa/d;", "LK7/q;", "kotlin.jvm.PlatformType", "mDelegate", "LK7/q;", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OverKeyboardViewManager extends ViewGroupManager<e> implements r {
    private final C1845q mDelegate;
    private final Ga.d manager;

    public OverKeyboardViewManager() {
        super(null, 1, null);
        this.manager = new Ga.d();
        this.mDelegate = new C1845q(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected q0 getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "OverKeyboardView";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends com.facebook.react.uimanager.r> getShadowNodeClass() {
        return Na.d.class;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public com.facebook.react.uimanager.r createShadowNodeInstance() {
        return new Na.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public e createViewInstance(C3284b0 context) {
        AbstractC5504s.h(context, "context");
        return this.manager.a(context);
    }

    @Override // K7.r
    @B7.a(name = "visible")
    public void setVisible(e view, boolean value) {
        AbstractC5504s.h(view, "view");
        this.manager.b(view, value);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(e view, Q props, InterfaceC3282a0 stateWrapper) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(props, "props");
        AbstractC5504s.h(stateWrapper, "stateWrapper");
        view.setStateWrapper(stateWrapper);
        return null;
    }
}
