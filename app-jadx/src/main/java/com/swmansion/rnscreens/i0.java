package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C3308y;
import com.facebook.react.uimanager.C3309z;
import com.facebook.react.uimanager.InterfaceC3288d0;
import com.facebook.react.uimanager.UIManagerModule;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class i0 extends com.facebook.react.uimanager.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ReactContext f44635a;

    public i0(ReactContext context) {
        AbstractC5504s.h(context, "context");
        this.f44635a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(i0 i0Var, C3308y c3308y) {
        if (c3308y == null) {
            return;
        }
        View viewU = c3308y.u(i0Var.getReactTag());
        if (viewU instanceof A) {
            ((A) viewU).v();
        }
    }

    @Override // com.facebook.react.uimanager.P, com.facebook.react.uimanager.O
    public void onBeforeLayout(C3309z nativeViewHierarchyOptimizer) {
        AbstractC5504s.h(nativeViewHierarchyOptimizer, "nativeViewHierarchyOptimizer");
        super.onBeforeLayout(nativeViewHierarchyOptimizer);
        UIManagerModule uIManagerModule = (UIManagerModule) this.f44635a.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.addUIBlock(new InterfaceC3288d0() { // from class: com.swmansion.rnscreens.h0
                @Override // com.facebook.react.uimanager.InterfaceC3288d0
                public final void a(C3308y c3308y) {
                    i0.g(this.f44630a, c3308y);
                }
            });
        }
    }
}
