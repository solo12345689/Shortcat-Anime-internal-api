package com.facebook.react.views.virtual.view;

import K7.l1;
import K7.m1;
import Q7.e;
import android.view.View;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.f0;
import com.facebook.react.uimanager.q0;
import com.facebook.react.views.view.ReactClippingViewManager;
import com.facebook.react.views.view.g;
import h7.C4914b;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC5454a(name = ReactVirtualViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001%B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001e\u0010\u001fR0\u0010\"\u001a\u001e\u0012\f\u0012\n !*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n !*\u0004\u0018\u00010\u00000\u00000 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/facebook/react/views/virtual/view/ReactVirtualViewManager;", "Lcom/facebook/react/views/view/ReactClippingViewManager;", "Lcom/facebook/react/views/virtual/view/b;", "LK7/m1;", "<init>", "()V", "Lcom/facebook/react/uimanager/q0;", "getDelegate", "()Lcom/facebook/react/uimanager/q0;", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/b0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)Lcom/facebook/react/views/virtual/view/b;", "view", "", "value", "LTd/L;", "setInitialHidden", "(Lcom/facebook/react/views/virtual/view/b;Z)V", "", "setRenderState", "(Lcom/facebook/react/views/virtual/view/b;I)V", "nativeId", "setNativeId", "(Lcom/facebook/react/views/virtual/view/b;Ljava/lang/String;)V", "addEventEmitters", "(Lcom/facebook/react/uimanager/b0;Lcom/facebook/react/views/virtual/view/b;)V", "prepareToRecycleView", "(Lcom/facebook/react/uimanager/b0;Lcom/facebook/react/views/virtual/view/b;)Lcom/facebook/react/views/virtual/view/b;", "LK7/l1;", "kotlin.jvm.PlatformType", "_delegate", "LK7/l1;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactVirtualViewManager extends ReactClippingViewManager<b> implements m1 {
    public static final String REACT_CLASS = "VirtualView";
    private final l1 _delegate = new l1(this);

    @Override // com.facebook.react.uimanager.ViewManager
    protected q0 getDelegate() {
        return this._delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // K7.m1
    public /* bridge */ /* synthetic */ void setRemoveClippedSubviews(View view, boolean z10) {
        setRemoveClippedSubviews((g) view, z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(C3284b0 reactContext, b view) {
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(view, "view");
        EventDispatcher eventDispatcherC = f0.c(reactContext, view.getId());
        if (eventDispatcherC == null) {
            return;
        }
        view.setModeChangeEmitter$ReactAndroid_release(new d(view.getId(), f0.e(reactContext), eventDispatcherC));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public b createViewInstance(C3284b0 reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        return new b(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public b prepareToRecycleView(C3284b0 reactContext, b view) {
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(view, "view");
        view.recycleView$ReactAndroid_release();
        return (b) super.prepareToRecycleView(reactContext, view);
    }

    @Override // K7.m1
    @B7.a(name = "initialHidden")
    public void setInitialHidden(b view, boolean value) {
        AbstractC5504s.h(view, "view");
        if (view.getMode$ReactAndroid_release() == null) {
            view.setMode$ReactAndroid_release(value ? Q7.a.f14377d : Q7.a.f14375b);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setNativeId(b view, String nativeId) {
        AbstractC5504s.h(view, "view");
        super.setNativeId(view, nativeId);
        if (view.getDebugLogEnabled$ReactAndroid_release()) {
            if (c.f38512a) {
                String strValueOf = String.valueOf(view.getId());
                AbstractC7283a.b("ReactVirtualView:setNativeId", ((Object) strValueOf) + " [" + view.getId() + "][" + view.getNativeId$ReactAndroid_release() + "]");
                return;
            }
            String strValueOf2 = String.valueOf(view.getId());
            AbstractC7283a.I("ReactVirtualView:setNativeId", ((Object) strValueOf2) + " [" + view.getId() + "][" + view.getNativeId$ReactAndroid_release() + "]");
        }
    }

    @Override // K7.m1
    @B7.a(name = "renderState")
    public void setRenderState(b view, int value) {
        AbstractC5504s.h(view, "view");
        if (C4914b.C()) {
            view.setRenderState$ReactAndroid_release(value != 1 ? value != 2 ? e.f14385b : e.f14387d : e.f14386c);
        }
    }
}
