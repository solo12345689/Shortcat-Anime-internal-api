package com.reactnativekeyboardcontroller;

import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.views.view.ReactViewManager;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/reactnativekeyboardcontroller/KeyboardBackgroundViewManager;", "Lcom/facebook/react/views/view/ReactViewManager;", "", "Lcom/facebook/react/views/view/g;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/b0;", "context", "LMa/b;", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)LMa/b;", "LGa/a;", "manager", "LGa/a;", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KeyboardBackgroundViewManager extends ReactViewManager implements A0 {
    private final Ga.a manager = new Ga.a();

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "KeyboardBackgroundView";
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public Ma.b createViewInstance(C3284b0 context) {
        AbstractC5504s.h(context, "context");
        return this.manager.a(context);
    }
}
