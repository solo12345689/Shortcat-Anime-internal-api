package com.facebook.react.views.text;

import Td.L;
import Td.z;
import Ud.S;
import android.content.Context;
import android.os.Build;
import android.text.Spannable;
import com.facebook.react.AbstractC3247l;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.InterfaceC3282a0;
import com.facebook.react.uimanager.InterfaceC3298n;
import com.facebook.react.uimanager.Q;
import com.facebook.react.views.text.n;
import com.facebook.react.views.text.q;
import ge.AbstractC4877a;
import h7.C4914b;
import java.util.HashMap;
import java.util.Map;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC5454a(name = "RCTText")
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u0000 D2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001EB\u0015\b\u0007\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010!\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b!\u0010#J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b'\u0010\u001aJ\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J)\u0010-\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u001d\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e\u0018\u00010/H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00182\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J7\u0010;\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\b2\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u0002062\u0006\u00109\u001a\u0002062\u0006\u0010:\u001a\u000206H\u0016¢\u0006\u0004\b;\u0010<J!\u0010>\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\b2\b\u0010=\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b>\u0010?R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010\u0007¨\u0006F"}, d2 = {"Lcom/facebook/react/views/text/ReactTextViewManager;", "Lcom/facebook/react/views/text/ReactTextAnchorViewManager;", "Lcom/facebook/react/views/text/h;", "Lcom/facebook/react/uimanager/n;", "Lcom/facebook/react/views/text/o;", "reactTextViewManagerCallback", "<init>", "(Lcom/facebook/react/views/text/o;)V", "Lcom/facebook/react/views/text/m;", "view", "Lcom/facebook/react/uimanager/Q;", "props", "Lcom/facebook/react/common/mapbuffer/a;", "state", "", "getReactTextUpdate", "(Lcom/facebook/react/views/text/m;Lcom/facebook/react/uimanager/Q;Lcom/facebook/react/common/mapbuffer/a;)Ljava/lang/Object;", "Lcom/facebook/react/uimanager/b0;", "reactContext", "prepareToRecycleView", "(Lcom/facebook/react/uimanager/b0;Lcom/facebook/react/views/text/m;)Lcom/facebook/react/views/text/m;", "", "getName", "()Ljava/lang/String;", "LTd/L;", "updateViewAccessibility", "(Lcom/facebook/react/views/text/m;)V", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)Lcom/facebook/react/views/text/m;", "extraData", "updateExtraData", "(Lcom/facebook/react/views/text/m;Ljava/lang/Object;)V", "createShadowNodeInstance", "()Lcom/facebook/react/views/text/h;", "(Lcom/facebook/react/views/text/o;)Lcom/facebook/react/views/text/h;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "onAfterUpdateTransaction", "", "needsCustomLayoutForChildren", "()Z", "Lcom/facebook/react/uimanager/a0;", "stateWrapper", "updateState", "(Lcom/facebook/react/views/text/m;Lcom/facebook/react/uimanager/Q;Lcom/facebook/react/uimanager/a0;)Ljava/lang/Object;", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "Landroid/text/Spannable;", "text", "onPostProcessSpannable", "(Landroid/text/Spannable;)V", "", "left", "top", "right", "bottom", "setPadding", "(Lcom/facebook/react/views/text/m;IIII)V", "overflow", "setOverflow", "(Lcom/facebook/react/views/text/m;Ljava/lang/String;)V", "Lcom/facebook/react/views/text/o;", "getReactTextViewManagerCallback", "()Lcom/facebook/react/views/text/o;", "setReactTextViewManagerCallback", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactTextViewManager extends ReactTextAnchorViewManager<h> implements InterfaceC3298n, o {
    public static final String REACT_CLASS = "RCTText";
    private static final short TX_STATE_KEY_ATTRIBUTED_STRING = 0;
    private static final short TX_STATE_KEY_PARAGRAPH_ATTRIBUTES = 1;
    private o reactTextViewManagerCallback;

    public ReactTextViewManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final Object getReactTextUpdate(m view, Q props, com.facebook.react.common.mapbuffer.a state) {
        com.facebook.react.common.mapbuffer.a aVarF0 = state.F0(0);
        com.facebook.react.common.mapbuffer.a aVarF02 = state.F0(1);
        s sVar = s.f38347a;
        Context context = view.getContext();
        AbstractC5504s.g(context, "getContext(...)");
        Spannable spannableM = sVar.m(context, aVarF0, this.reactTextViewManagerCallback);
        view.setSpanned(spannableM);
        view.setMinimumFontSize((float) aVarF02.getDouble(6));
        q.a aVar = q.f38309C;
        return new i(spannableM, -1, false, s.p(aVarF0, spannableM), aVar.g(aVarF02.getString(2)), aVar.d(props, Build.VERSION.SDK_INT >= 26 ? view.getJustificationMode() : 0));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(S.f(z.a("topTextLayout", S.f(z.a("registrationName", "onTextLayout")))));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RCTText";
    }

    protected final o getReactTextViewManagerCallback() {
        return this.reactTextViewManagerCallback;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<h> getShadowNodeClass() {
        return h.class;
    }

    @Override // com.facebook.react.uimanager.InterfaceC3298n
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.views.text.o
    public void onPostProcessSpannable(Spannable text) {
        AbstractC5504s.h(text, "text");
        o oVar = this.reactTextViewManagerCallback;
        if (oVar != null) {
            oVar.onPostProcessSpannable(text);
        }
    }

    @B7.a(name = "overflow")
    public final void setOverflow(m view, String overflow) {
        AbstractC5504s.h(view, "view");
        view.setOverflow(overflow);
    }

    protected final void setReactTextViewManagerCallback(o oVar) {
        this.reactTextViewManagerCallback = oVar;
    }

    public /* synthetic */ ReactTextViewManager(o oVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : oVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public h createShadowNodeInstance() {
        return new h(this.reactTextViewManagerCallback);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public m createViewInstance(C3284b0 context) {
        AbstractC5504s.h(context, "context");
        return new m(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(m view) {
        AbstractC5504s.h(view, "view");
        super.onAfterUpdateTransaction(view);
        view.w();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public m prepareToRecycleView(C3284b0 reactContext, m view) {
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(view, "view");
        m mVar = (m) super.prepareToRecycleView(reactContext, view);
        if (mVar != null) {
            mVar.u();
            setSelectionColor$ReactAndroid_release(mVar, null);
        }
        return mVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(m view, int left, int top, int right, int bottom) {
        AbstractC5504s.h(view, "view");
        view.setPadding(left, top, right, bottom);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(m view, Object extraData) throws Exception {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(extraData, "extraData");
        g7.c cVar = new g7.c("ReactTextViewManager.updateExtraData");
        try {
            i iVar = (i) extraData;
            Spannable spannableH = iVar.h();
            if (iVar.a()) {
                P7.r.f13545a.a(spannableH, view);
            }
            view.setText(iVar);
            n.a aVar = new n.a(spannableH);
            int i10 = AbstractC3247l.f36912f;
            if (aVar.c() <= 0) {
                aVar = null;
            }
            view.setTag(i10, aVar);
            n.f38300z.a(view, view.isFocusable(), view.getImportantForAccessibility());
            L l10 = L.f17438a;
            AbstractC4877a.a(cVar, null);
        } finally {
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(m view, Q props, InterfaceC3282a0 stateWrapper) throws Exception {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(props, "props");
        AbstractC5504s.h(stateWrapper, "stateWrapper");
        g7.c cVar = new g7.c("ReactTextViewManager.updateState");
        try {
            ReadableMapBuffer stateDataMapBuffer = stateWrapper.getStateDataMapBuffer();
            Object reactTextUpdate = stateDataMapBuffer != null ? getReactTextUpdate(view, props, stateDataMapBuffer) : null;
            AbstractC4877a.a(cVar, null);
            return reactTextUpdate;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager
    public void updateViewAccessibility(m view) {
        AbstractC5504s.h(view, "view");
        n.f38300z.b(view, view.isFocusable(), view.getImportantForAccessibility());
    }

    public ReactTextViewManager(o oVar) {
        this.reactTextViewManagerCallback = oVar;
        if (C4914b.x()) {
            setupViewRecycling();
        }
    }

    public final h createShadowNodeInstance(o reactTextViewManagerCallback) {
        return new h(reactTextViewManagerCallback);
    }
}
