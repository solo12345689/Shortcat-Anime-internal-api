package expo.modules.kotlin.views;

import Ud.S;
import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.Q;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.T;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u0017J\u001b\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lexpo/modules/kotlin/views/SimpleViewManagerWrapper;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Landroid/view/View;", "Lexpo/modules/kotlin/views/v;", "Lexpo/modules/kotlin/views/t;", "viewWrapperDelegate", "<init>", "(Lexpo/modules/kotlin/views/t;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/b0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)Landroid/view/View;", "viewToUpdate", "Lcom/facebook/react/uimanager/Q;", "props", "LTd/L;", "updateProperties", "(Landroid/view/View;Lcom/facebook/react/uimanager/Q;)V", "view", "onAfterUpdateTransaction", "(Landroid/view/View;)V", "", "getNativeProps", "()Ljava/util/Map;", "onDropViewInstance", "", "", "getExportedCustomDirectEventTypeConstants", "Lexpo/modules/kotlin/views/t;", "getViewWrapperDelegate", "()Lexpo/modules/kotlin/views/t;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SimpleViewManagerWrapper extends SimpleViewManager<View> implements v {
    private final t viewWrapperDelegate;

    public SimpleViewManagerWrapper(t viewWrapperDelegate) {
        AbstractC5504s.h(viewWrapperDelegate, "viewWrapperDelegate");
        this.viewWrapperDelegate = viewWrapperDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected View createViewInstance(C3284b0 reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        return getViewWrapperDelegate().a(reactContext);
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

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    protected void onAfterUpdateTransaction(View view) {
        AbstractC5504s.h(view, "view");
        super.onAfterUpdateTransaction(view);
        getViewWrapperDelegate().h(view);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(View view) {
        AbstractC5504s.h(view, "view");
        super.onDropViewInstance(view);
        getViewWrapperDelegate().g(view);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateProperties(View viewToUpdate, Q props) {
        AbstractC5504s.h(viewToUpdate, "viewToUpdate");
        AbstractC5504s.h(props, "props");
        ReadableMap readableMapA = T.a(props);
        super.updateProperties(viewToUpdate, new Q(new k(readableMapA, getViewWrapperDelegate().j(viewToUpdate, readableMapA))));
    }
}
