package com.facebook.react.views.text;

import H7.v;
import Td.L;
import Td.z;
import Ud.S;
import android.content.Context;
import android.text.Spannable;
import android.text.Spanned;
import android.view.View;
import com.facebook.react.AbstractC3247l;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3281a;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.C3303t;
import com.facebook.react.uimanager.EnumC3304u;
import com.facebook.react.uimanager.InterfaceC3282a0;
import com.facebook.react.uimanager.InterfaceC3297m;
import com.facebook.react.uimanager.Q;
import com.facebook.react.uimanager.V;
import com.facebook.react.views.text.n;
import ge.AbstractC4877a;
import java.util.HashMap;
import java.util.Map;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC5454a(name = "RCTText")
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 Y2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u00042\u00020\u0005:\u0001ZB\u0015\b\u0017\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001f\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00170!H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010+\u001a\u00020'H\u0007¢\u0006\u0004\b,\u0010*J!\u0010/\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010-H\u0007¢\u0006\u0004\b/\u00100J'\u00104\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u00101\u001a\u00020-2\u0006\u00103\u001a\u000202H\u0007¢\u0006\u0004\b4\u00105J!\u00107\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\b\u00106\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b7\u0010&J'\u00109\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u00101\u001a\u00020-2\u0006\u00108\u001a\u000202H\u0007¢\u0006\u0004\b9\u00105J)\u0010:\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u00101\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010-H\u0007¢\u0006\u0004\b:\u0010;J\u001f\u0010=\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010<\u001a\u00020'H\u0007¢\u0006\u0004\b=\u0010*J7\u0010B\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010>\u001a\u00020-2\u0006\u0010?\u001a\u00020-2\u0006\u0010@\u001a\u00020-2\u0006\u0010A\u001a\u00020-H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030DH\u0016¢\u0006\u0004\bE\u0010FJ'\u0010J\u001a\u00020\u00112\u0006\u0010G\u001a\u00020\u00022\u0006\u0010I\u001a\u00020H2\u0006\u00101\u001a\u00020-H\u0016¢\u0006\u0004\bJ\u0010KJ!\u0010L\u001a\u0004\u0018\u00010H2\u0006\u0010G\u001a\u00020\u00022\u0006\u00101\u001a\u00020-H\u0016¢\u0006\u0004\bL\u0010MJ\u001f\u0010N\u001a\u00020\u00112\u0006\u0010G\u001a\u00020\u00022\u0006\u00101\u001a\u00020-H\u0016¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020-2\u0006\u0010G\u001a\u00020\u0002H\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020'H\u0016¢\u0006\u0004\bR\u0010SJ\u0017\u0010V\u001a\u00020\u00112\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bV\u0010WR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010X¨\u0006["}, d2 = {"Lcom/facebook/react/views/text/PreparedLayoutTextViewManager;", "Lcom/facebook/react/uimanager/BaseViewManager;", "Lcom/facebook/react/views/text/PreparedLayoutTextView;", "Lcom/facebook/react/uimanager/r;", "Lcom/facebook/react/uimanager/m;", "Lcom/facebook/react/views/text/o;", "reactTextViewManagerCallback", "<init>", "(Lcom/facebook/react/views/text/o;)V", "Lcom/facebook/react/uimanager/b0;", "reactContext", "view", "prepareToRecycleView", "(Lcom/facebook/react/uimanager/b0;Lcom/facebook/react/views/text/PreparedLayoutTextView;)Lcom/facebook/react/views/text/PreparedLayoutTextView;", "", "getName", "()Ljava/lang/String;", "LTd/L;", "updateViewAccessibility", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;)V", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)Lcom/facebook/react/views/text/PreparedLayoutTextView;", "", "extraData", "updateExtraData", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;Ljava/lang/Object;)V", "Lcom/facebook/react/uimanager/Q;", "props", "Lcom/facebook/react/uimanager/a0;", "stateWrapper", "updateState", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;Lcom/facebook/react/uimanager/Q;Lcom/facebook/react/uimanager/a0;)Ljava/lang/Object;", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "overflow", "setOverflow", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;Ljava/lang/String;)V", "", "accessible", "setAccessible", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;Z)V", "isSelectable", "setSelectable", "", "color", "setSelectionColor", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;Ljava/lang/Integer;)V", "index", "", "borderRadius", "setBorderRadius", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;IF)V", "borderStyle", "setBorderStyle", "width", "setBorderWidth", "setBorderColor", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;ILjava/lang/Integer;)V", "disabled", "setDisabled", "left", "top", "right", "bottom", "setPadding", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;IIII)V", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "parent", "Landroid/view/View;", "child", "addView", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;Landroid/view/View;I)V", "getChildAt", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;I)Landroid/view/View;", "removeViewAt", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;I)V", "getChildCount", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;)I", "needsCustomLayoutForChildren", "()Z", "Landroid/text/Spannable;", "text", "onPostProcessSpannable", "(Landroid/text/Spannable;)V", "Lcom/facebook/react/views/text/o;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PreparedLayoutTextViewManager extends BaseViewManager<PreparedLayoutTextView, com.facebook.react.uimanager.r> implements InterfaceC3297m, o {
    public static final String REACT_CLASS = "RCTText";
    private final o reactTextViewManagerCallback;

    public PreparedLayoutTextViewManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.put("topTextLayout", S.f(z.a("registrationName", "onTextLayout")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RCTText";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends com.facebook.react.uimanager.r> getShadowNodeClass() {
        return com.facebook.react.uimanager.r.class;
    }

    @Override // com.facebook.react.uimanager.InterfaceC3298n
    public boolean needsCustomLayoutForChildren() {
        return false;
    }

    @Override // com.facebook.react.views.text.o
    public void onPostProcessSpannable(Spannable text) {
        AbstractC5504s.h(text, "text");
        o oVar = this.reactTextViewManagerCallback;
        if (oVar != null) {
            oVar.onPostProcessSpannable(text);
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC3297m
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @B7.a(name = "accessible")
    public final void setAccessible(PreparedLayoutTextView view, boolean accessible) {
        AbstractC5504s.h(view, "view");
        view.setFocusable(accessible);
    }

    @B7.b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor", "borderStartColor", "borderEndColor", "borderBlockColor", "borderBlockEndColor", "borderBlockStartColor"})
    public final void setBorderColor(PreparedLayoutTextView view, int index, Integer color) {
        AbstractC5504s.h(view, "view");
        C3281a.r(view, H7.t.values()[index], color);
    }

    @B7.b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public final void setBorderRadius(PreparedLayoutTextView view, int index, float borderRadius) {
        AbstractC5504s.h(view, "view");
        C3281a.s(view, H7.i.values()[index], Float.isNaN(borderRadius) ? null : new C3303t(borderRadius, EnumC3304u.f37832a));
    }

    @B7.a(name = "borderStyle")
    public final void setBorderStyle(PreparedLayoutTextView view, String borderStyle) {
        AbstractC5504s.h(view, "view");
        C3281a.t(view, borderStyle == null ? null : H7.k.f8072a.a(borderStyle));
    }

    @B7.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"})
    public final void setBorderWidth(PreparedLayoutTextView view, int index, float width) {
        AbstractC5504s.h(view, "view");
        C3281a.u(view, H7.t.values()[index], Float.valueOf(width));
    }

    @B7.a(defaultBoolean = false, name = "disabled")
    public final void setDisabled(PreparedLayoutTextView view, boolean disabled) {
        AbstractC5504s.h(view, "view");
        view.setEnabled(!disabled);
    }

    @B7.a(name = "overflow")
    public final void setOverflow(PreparedLayoutTextView view, String overflow) {
        v vVarA;
        AbstractC5504s.h(view, "view");
        if (overflow == null || (vVarA = v.f8135a.a(overflow)) == null) {
            vVarA = v.f8137c;
        }
        view.setOverflow(vVarA);
    }

    @B7.a(defaultBoolean = false, name = "selectable")
    public final void setSelectable(PreparedLayoutTextView view, boolean isSelectable) {
        AbstractC5504s.h(view, "view");
    }

    @B7.a(customType = "Color", name = "selectionColor")
    public final void setSelectionColor(PreparedLayoutTextView view, Integer color) {
        AbstractC5504s.h(view, "view");
        if (color != null) {
            view.setSelectionColor(color);
            return;
        }
        Context context = view.getContext();
        AbstractC5504s.g(context, "getContext(...)");
        view.setSelectionColor(Integer.valueOf(a.c(context)));
    }

    public /* synthetic */ PreparedLayoutTextViewManager(o oVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : oVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC3297m
    public void addView(PreparedLayoutTextView parent, View child, int index) {
        AbstractC5504s.h(parent, "parent");
        AbstractC5504s.h(child, "child");
        parent.addView(child, index);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public PreparedLayoutTextView createViewInstance(C3284b0 context) {
        AbstractC5504s.h(context, "context");
        return new PreparedLayoutTextView(context);
    }

    @Override // com.facebook.react.uimanager.InterfaceC3297m
    public View getChildAt(PreparedLayoutTextView parent, int index) {
        AbstractC5504s.h(parent, "parent");
        return parent.getChildAt(index);
    }

    @Override // com.facebook.react.uimanager.InterfaceC3297m
    public int getChildCount(PreparedLayoutTextView parent) {
        AbstractC5504s.h(parent, "parent");
        return parent.getChildCount();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public PreparedLayoutTextView prepareToRecycleView(C3284b0 reactContext, PreparedLayoutTextView view) {
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(view, "view");
        PreparedLayoutTextView preparedLayoutTextView = (PreparedLayoutTextView) super.prepareToRecycleView(reactContext, view);
        if (preparedLayoutTextView != null) {
            preparedLayoutTextView.e();
        }
        return preparedLayoutTextView;
    }

    @Override // com.facebook.react.uimanager.InterfaceC3297m
    public void removeViewAt(PreparedLayoutTextView parent, int index) {
        AbstractC5504s.h(parent, "parent");
        parent.removeViewAt(index);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(PreparedLayoutTextView view, int left, int top, int right, int bottom) {
        AbstractC5504s.h(view, "view");
        view.setPadding(left, top, right, bottom);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(PreparedLayoutTextView view, Object extraData) throws Exception {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(extraData, "extraData");
        g7.c cVar = new g7.c("PreparedLayoutTextViewManager.updateExtraData");
        try {
            PreparedLayout preparedLayout = (PreparedLayout) extraData;
            view.setPreparedLayout(preparedLayout);
            if (preparedLayout.getLayout().getText() instanceof Spanned) {
                CharSequence text = preparedLayout.getLayout().getText();
                AbstractC5504s.f(text, "null cannot be cast to non-null type android.text.Spanned");
                n.a aVar = new n.a((Spanned) text);
                int i10 = AbstractC3247l.f36912f;
                if (aVar.c() <= 0) {
                    aVar = null;
                }
                view.setTag(i10, aVar);
                n.f38300z.a(view, view.isFocusable(), view.getImportantForAccessibility());
            }
            L l10 = L.f17438a;
            AbstractC4877a.a(cVar, null);
        } finally {
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(PreparedLayoutTextView view, Q props, InterfaceC3282a0 stateWrapper) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(props, "props");
        AbstractC5504s.h(stateWrapper, "stateWrapper");
        V v10 = stateWrapper instanceof V ? (V) stateWrapper : null;
        if (v10 != null) {
            return v10.getStateDataReference();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager
    public void updateViewAccessibility(PreparedLayoutTextView view) {
        AbstractC5504s.h(view, "view");
        n.f38300z.b(view, view.isFocusable(), view.getImportantForAccessibility());
    }

    public PreparedLayoutTextViewManager(o oVar) {
        this.reactTextViewManagerCallback = oVar;
        setupViewRecycling();
    }
}
