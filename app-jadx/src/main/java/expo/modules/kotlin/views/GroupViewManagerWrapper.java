package expo.modules.kotlin.views;

import Td.L;
import Ud.S;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.InterfaceC3282a0;
import com.facebook.react.uimanager.Q;
import com.facebook.react.uimanager.T;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010\u0017J\u001b\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001a0!H\u0016¢\u0006\u0004\b\"\u0010\u001fJ'\u0010(\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020&2\u0006\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010+J!\u0010,\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020$H\u0016¢\u0006\u0004\b0\u00101R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"Lexpo/modules/kotlin/views/GroupViewManagerWrapper;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Landroid/view/ViewGroup;", "Lexpo/modules/kotlin/views/v;", "Lexpo/modules/kotlin/views/t;", "viewWrapperDelegate", "<init>", "(Lexpo/modules/kotlin/views/t;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/b0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)Landroid/view/ViewGroup;", "viewToUpdate", "Lcom/facebook/react/uimanager/Q;", "props", "LTd/L;", "updateProperties", "(Landroid/view/ViewGroup;Lcom/facebook/react/uimanager/Q;)V", "view", "onAfterUpdateTransaction", "(Landroid/view/ViewGroup;)V", "Lcom/facebook/react/uimanager/a0;", "stateWrapper", "", "updateState", "(Landroid/view/ViewGroup;Lcom/facebook/react/uimanager/Q;Lcom/facebook/react/uimanager/a0;)Ljava/lang/Object;", "", "getNativeProps", "()Ljava/util/Map;", "onDropViewInstance", "", "getExportedCustomDirectEventTypeConstants", "parent", "Landroid/view/View;", "child", "", "index", "addView", "(Landroid/view/ViewGroup;Landroid/view/View;I)V", "getChildCount", "(Landroid/view/ViewGroup;)I", "getChildAt", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "removeViewAt", "(Landroid/view/ViewGroup;I)V", "removeView", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "Lexpo/modules/kotlin/views/t;", "getViewWrapperDelegate", "()Lexpo/modules/kotlin/views/t;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GroupViewManagerWrapper extends ViewGroupManager<ViewGroup> implements v {
    private final t viewWrapperDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupViewManagerWrapper(t viewWrapperDelegate) {
        super(null, 1, null);
        AbstractC5504s.h(viewWrapperDelegate, "viewWrapperDelegate");
        this.viewWrapperDelegate = viewWrapperDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> mapP;
        Map<String, Object> mapB = getViewWrapperDelegate().b();
        if (mapB == null) {
            mapB = S.i();
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        return (exportedCustomDirectEventTypeConstants == null || (mapP = S.p(exportedCustomDirectEventTypeConstants, mapB)) == null) ? mapB : mapP;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ViewManagerAdapter_" + getViewWrapperDelegate().d();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, String> getNativeProps() {
        Map<String, String> nativeProps = super.getNativeProps();
        for (Map.Entry entry : getViewWrapperDelegate().e().entrySet()) {
            String str = (String) entry.getKey();
            a aVar = (a) entry.getValue();
            AbstractC5504s.e(nativeProps);
            nativeProps.put(str, String.valueOf(aVar.b().g().c()));
        }
        AbstractC5504s.e(nativeProps);
        return nativeProps;
    }

    @Override // expo.modules.kotlin.views.v
    public t getViewWrapperDelegate() {
        return this.viewWrapperDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(ViewGroup parent, View view) {
        AbstractC5504s.h(parent, "parent");
        AbstractC5504s.h(view, "view");
        getViewWrapperDelegate().f();
        super.removeView(parent, view);
        L l10 = L.f17438a;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
    public void addView(ViewGroup parent, View child, int index) {
        AbstractC5504s.h(parent, "parent");
        AbstractC5504s.h(child, "child");
        getViewWrapperDelegate().f();
        super.addView(parent, child, index);
        L l10 = L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ViewGroup createViewInstance(C3284b0 reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        View viewA = getViewWrapperDelegate().a(reactContext);
        AbstractC5504s.f(viewA, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) viewA;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
    public View getChildAt(ViewGroup parent, int index) {
        AbstractC5504s.h(parent, "parent");
        getViewWrapperDelegate().f();
        return super.getChildAt(parent, index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
    public int getChildCount(ViewGroup parent) {
        AbstractC5504s.h(parent, "parent");
        getViewWrapperDelegate().f();
        return Integer.valueOf(super.getChildCount(parent)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(ViewGroup view) {
        AbstractC5504s.h(view, "view");
        super.onAfterUpdateTransaction(view);
        getViewWrapperDelegate().h(view);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(ViewGroup view) {
        AbstractC5504s.h(view, "view");
        super.onDropViewInstance(view);
        getViewWrapperDelegate().g(view);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
    public void removeViewAt(ViewGroup parent, int index) {
        AbstractC5504s.h(parent, "parent");
        getViewWrapperDelegate().f();
        super.removeViewAt(parent, index);
        L l10 = L.f17438a;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateProperties(ViewGroup viewToUpdate, Q props) {
        AbstractC5504s.h(viewToUpdate, "viewToUpdate");
        AbstractC5504s.h(props, "props");
        ReadableMap readableMapA = T.a(props);
        super.updateProperties(viewToUpdate, new Q(new k(readableMapA, getViewWrapperDelegate().j(viewToUpdate, readableMapA))));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(ViewGroup view, Q props, InterfaceC3282a0 stateWrapper) {
        AbstractC5504s.h(view, "view");
        h hVar = view instanceof h ? (h) view : null;
        if (hVar == null) {
            return null;
        }
        hVar.setStateWrapper(stateWrapper);
        return super.updateState(hVar, props, stateWrapper);
    }
}
