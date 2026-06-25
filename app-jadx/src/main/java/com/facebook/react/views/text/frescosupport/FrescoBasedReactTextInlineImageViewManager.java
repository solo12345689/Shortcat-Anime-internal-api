package com.facebook.react.views.text.frescosupport;

import O5.d;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3284b0;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC5454a(name = FrescoBasedReactTextInlineImageViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001fB3\b\u0007\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR(\u0010\u0006\u001a\u0016\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001d¨\u0006 "}, d2 = {"Lcom/facebook/react/views/text/frescosupport/FrescoBasedReactTextInlineImageViewManager;", "Lcom/facebook/react/uimanager/BaseViewManager;", "Landroid/view/View;", "Lcom/facebook/react/views/text/frescosupport/a;", "LS5/b;", "LK6/b;", "draweeControllerBuilder", "", "callerContext", "<init>", "(LS5/b;Ljava/lang/Object;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/b0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)Landroid/view/View;", "createShadowNodeInstance", "()Lcom/facebook/react/views/text/frescosupport/a;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "root", "extraData", "LTd/L;", "updateExtraData", "(Landroid/view/View;Ljava/lang/Object;)V", "LS5/b;", "Ljava/lang/Object;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FrescoBasedReactTextInlineImageViewManager extends BaseViewManager<View, a> {
    public static final String REACT_CLASS = "RCTTextInlineImage";
    private final Object callerContext;
    private final S5.b draweeControllerBuilder;

    public FrescoBasedReactTextInlineImageViewManager() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected View createViewInstance(C3284b0 context) {
        AbstractC5504s.h(context, "context");
        throw new IllegalStateException("RCTTextInlineImage doesn't map into a native view");
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<a> getShadowNodeClass() {
        return a.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View root, Object extraData) {
        AbstractC5504s.h(root, "root");
        AbstractC5504s.h(extraData, "extraData");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FrescoBasedReactTextInlineImageViewManager(S5.b bVar) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        this(bVar, defaultConstructorMarker, 2, defaultConstructorMarker);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createShadowNodeInstance() {
        S5.b bVarH = this.draweeControllerBuilder;
        if (bVarH == null) {
            bVarH = d.h();
        }
        AbstractC5504s.e(bVarH);
        return new a(bVarH, this.callerContext);
    }

    public /* synthetic */ FrescoBasedReactTextInlineImageViewManager(S5.b bVar, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : bVar, (i10 & 2) != 0 ? null : obj);
    }

    public FrescoBasedReactTextInlineImageViewManager(S5.b bVar, Object obj) {
        this.draweeControllerBuilder = bVar;
        this.callerContext = obj;
    }
}
