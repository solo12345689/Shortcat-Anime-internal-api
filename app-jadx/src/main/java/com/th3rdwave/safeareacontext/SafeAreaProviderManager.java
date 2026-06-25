package com.th3rdwave.safeareacontext;

import K7.C1848s;
import Td.L;
import Td.z;
import Ud.S;
import android.view.View;
import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.ViewGroupManager;
import ie.InterfaceC5096o;
import java.util.Map;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC5454a(name = SafeAreaProviderManager.REACT_CLASS)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001cB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\b\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00110\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R0\u0010\u0019\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/th3rdwave/safeareacontext/f;", "", "<init>", "()V", "LK7/s;", "kotlin.jvm.PlatformType", "getDelegate", "()LK7/s;", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/b0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)Lcom/th3rdwave/safeareacontext/f;", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "reactContext", "view", "LTd/L;", "addEventEmitters", "(Lcom/facebook/react/uimanager/b0;Lcom/th3rdwave/safeareacontext/f;)V", "mDelegate", "LK7/s;", "Companion", "a", "react-native-safe-area-context_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SafeAreaProviderManager extends ViewGroupManager<f> implements A0 {
    public static final String REACT_CLASS = "RNCSafeAreaProvider";
    private final C1848s mDelegate;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class b extends AbstractC5502p implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f44843a = new b();

        b() {
            super(3, g.class, "handleOnInsetsChange", "handleOnInsetsChange(Lcom/th3rdwave/safeareacontext/SafeAreaProvider;Lcom/th3rdwave/safeareacontext/EdgeInsets;Lcom/th3rdwave/safeareacontext/Rect;)V", 1);
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            j((f) obj, (a) obj2, (c) obj3);
            return L.f17438a;
        }

        public final void j(f p02, a p12, c p22) {
            AbstractC5504s.h(p02, "p0");
            AbstractC5504s.h(p12, "p1");
            AbstractC5504s.h(p22, "p2");
            g.b(p02, p12, p22);
        }
    }

    public SafeAreaProviderManager() {
        super(null, 1, null);
        this.mDelegate = new C1848s(this);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        return S.n(z.a("topInsetsChange", S.n(z.a("registrationName", "onInsetsChange"))));
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
    public void addEventEmitters(C3284b0 reactContext, f view) {
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(view, "view");
        super.addEventEmitters(reactContext, view);
        view.setOnInsetsChangeHandler(b.f44843a);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public f createViewInstance(C3284b0 context) {
        AbstractC5504s.h(context, "context");
        return new f(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* JADX INFO: renamed from: getDelegate, reason: from getter */
    public C1848s getMDelegate() {
        return this.mDelegate;
    }
}
