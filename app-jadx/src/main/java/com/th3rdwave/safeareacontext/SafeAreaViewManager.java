package com.th3rdwave.safeareacontext;

import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.InterfaceC3282a0;
import com.facebook.react.uimanager.Q;
import com.facebook.react.views.view.ReactViewManager;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC5454a(name = SafeAreaViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u0012\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/th3rdwave/safeareacontext/SafeAreaViewManager;", "Lcom/facebook/react/views/view/ReactViewManager;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/b0;", "context", "Lcom/th3rdwave/safeareacontext/k;", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)Lcom/th3rdwave/safeareacontext/k;", "Lcom/th3rdwave/safeareacontext/p;", "createShadowNodeInstance", "()Lcom/th3rdwave/safeareacontext/p;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "view", "mode", "LTd/L;", "setMode", "(Lcom/th3rdwave/safeareacontext/k;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/ReadableMap;", "propList", "setEdges", "(Lcom/th3rdwave/safeareacontext/k;Lcom/facebook/react/bridge/ReadableMap;)V", "Lcom/facebook/react/views/view/g;", "Lcom/facebook/react/uimanager/Q;", "props", "Lcom/facebook/react/uimanager/a0;", "stateWrapper", "", "updateState", "(Lcom/facebook/react/views/view/g;Lcom/facebook/react/uimanager/Q;Lcom/facebook/react/uimanager/a0;)Ljava/lang/Object;", "Companion", "a", "react-native-safe-area-context_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SafeAreaViewManager extends ReactViewManager {
    public static final String REACT_CLASS = "RNCSafeAreaView";

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<p> getShadowNodeClass() {
        return p.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @B7.a(name = "edges")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setEdges(com.th3rdwave.safeareacontext.k r6, com.facebook.react.bridge.ReadableMap r7) {
        /*
            r5 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.AbstractC5504s.h(r6, r0)
            if (r7 == 0) goto L75
            java.lang.String r0 = "top"
            java.lang.String r0 = r7.getString(r0)
            java.lang.String r1 = "toUpperCase(...)"
            if (r0 == 0) goto L20
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r2)
            kotlin.jvm.internal.AbstractC5504s.g(r0, r1)
            com.th3rdwave.safeareacontext.l r0 = com.th3rdwave.safeareacontext.l.valueOf(r0)
            if (r0 != 0) goto L22
        L20:
            com.th3rdwave.safeareacontext.l r0 = com.th3rdwave.safeareacontext.l.f44868a
        L22:
            java.lang.String r2 = "right"
            java.lang.String r2 = r7.getString(r2)
            if (r2 == 0) goto L39
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toUpperCase(r3)
            kotlin.jvm.internal.AbstractC5504s.g(r2, r1)
            com.th3rdwave.safeareacontext.l r2 = com.th3rdwave.safeareacontext.l.valueOf(r2)
            if (r2 != 0) goto L3b
        L39:
            com.th3rdwave.safeareacontext.l r2 = com.th3rdwave.safeareacontext.l.f44868a
        L3b:
            java.lang.String r3 = "bottom"
            java.lang.String r3 = r7.getString(r3)
            if (r3 == 0) goto L52
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toUpperCase(r4)
            kotlin.jvm.internal.AbstractC5504s.g(r3, r1)
            com.th3rdwave.safeareacontext.l r3 = com.th3rdwave.safeareacontext.l.valueOf(r3)
            if (r3 != 0) goto L54
        L52:
            com.th3rdwave.safeareacontext.l r3 = com.th3rdwave.safeareacontext.l.f44868a
        L54:
            java.lang.String r4 = "left"
            java.lang.String r7 = r7.getString(r4)
            if (r7 == 0) goto L6b
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toUpperCase(r4)
            kotlin.jvm.internal.AbstractC5504s.g(r7, r1)
            com.th3rdwave.safeareacontext.l r7 = com.th3rdwave.safeareacontext.l.valueOf(r7)
            if (r7 != 0) goto L6d
        L6b:
            com.th3rdwave.safeareacontext.l r7 = com.th3rdwave.safeareacontext.l.f44868a
        L6d:
            com.th3rdwave.safeareacontext.m r1 = new com.th3rdwave.safeareacontext.m
            r1.<init>(r0, r2, r3, r7)
            r6.setEdges(r1)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.th3rdwave.safeareacontext.SafeAreaViewManager.setEdges(com.th3rdwave.safeareacontext.k, com.facebook.react.bridge.ReadableMap):void");
    }

    @B7.a(name = "mode")
    public final void setMode(k view, String mode) {
        AbstractC5504s.h(view, "view");
        if (AbstractC5504s.c(mode, "padding")) {
            view.setMode(o.f44880a);
        } else if (AbstractC5504s.c(mode, "margin")) {
            view.setMode(o.f44881b);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(com.facebook.react.views.view.g view, Q props, InterfaceC3282a0 stateWrapper) {
        AbstractC5504s.h(view, "view");
        ((k) view).setStateWrapper(stateWrapper);
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public p createShadowNodeInstance() {
        return new p();
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public k createViewInstance(C3284b0 context) {
        AbstractC5504s.h(context, "context");
        return new k(context);
    }
}
