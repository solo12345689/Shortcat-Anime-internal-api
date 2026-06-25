package com.facebook.react.uimanager;

import Ud.AbstractC2279u;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u0000 ,*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00032\b\u0012\u0004\u0012\u00028\u00000\u0005:\u0001-B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00028\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!J!\u0010\"\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u0016H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/facebook/react/uimanager/ViewGroupManager;", "Landroid/view/ViewGroup;", "T", "Lcom/facebook/react/uimanager/BaseViewManager;", "Lcom/facebook/react/uimanager/r;", "Lcom/facebook/react/uimanager/m;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "createShadowNodeInstance", "()Lcom/facebook/react/uimanager/r;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "root", "", "extraData", "LTd/L;", "updateExtraData", "(Landroid/view/ViewGroup;Ljava/lang/Object;)V", "parent", "Landroid/view/View;", "child", "", "index", "addView", "(Landroid/view/ViewGroup;Landroid/view/View;I)V", "", "views", "addViews", "(Landroid/view/ViewGroup;Ljava/util/List;)V", "getChildCount", "(Landroid/view/ViewGroup;)I", "getChildAt", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "removeViewAt", "(Landroid/view/ViewGroup;I)V", "view", "removeView", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "", "needsCustomLayoutForChildren", "()Z", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ViewGroupManager<T extends ViewGroup> extends BaseViewManager<T, r> implements InterfaceC3297m {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final WeakHashMap<View, Integer> zIndexHash = new WeakHashMap<>();

    /* JADX INFO: renamed from: com.facebook.react.uimanager.ViewGroupManager$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Integer a(View view) {
            return (Integer) ViewGroupManager.zIndexHash.get(view);
        }

        public final void b(View view, int i10) {
            AbstractC5504s.h(view, "view");
            ViewGroupManager.zIndexHash.put(view, Integer.valueOf(i10));
        }

        private Companion() {
        }
    }

    public ViewGroupManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final Integer getViewZIndex(View view) {
        return INSTANCE.a(view);
    }

    public static final void setViewZIndex(View view, int i10) {
        INSTANCE.b(view, i10);
    }

    public final void addViews(T parent, List<? extends View> views) {
        AbstractC5504s.h(parent, "parent");
        AbstractC5504s.h(views, "views");
        UiThreadUtil.assertOnUiThread();
        int i10 = 0;
        for (Object obj : views) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2279u.w();
            }
            addView((ViewGroup) parent, (View) obj, i10);
            i10 = i11;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends r> getShadowNodeClass() {
        return r.class;
    }

    @Override // com.facebook.react.uimanager.InterfaceC3298n
    public boolean needsCustomLayoutForChildren() {
        return false;
    }

    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    public void removeView(T parent, View view) {
        AbstractC5504s.h(parent, "parent");
        AbstractC5504s.h(view, "view");
        UiThreadUtil.assertOnUiThread();
        int childCount = getChildCount((ViewGroup) parent);
        for (int i10 = 0; i10 < childCount; i10++) {
            if (getChildAt((ViewGroup) parent, i10) == view) {
                removeViewAt((ViewGroup) parent, i10);
                return;
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(T root, Object extraData) {
        AbstractC5504s.h(root, "root");
        AbstractC5504s.h(extraData, "extraData");
    }

    public /* synthetic */ ViewGroupManager(ReactApplicationContext reactApplicationContext, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : reactApplicationContext);
    }

    @Override // com.facebook.react.uimanager.InterfaceC3297m
    public void addView(T parent, View child, int index) {
        AbstractC5504s.h(parent, "parent");
        AbstractC5504s.h(child, "child");
        parent.addView(child, index);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public r createShadowNodeInstance() {
        return new r();
    }

    @Override // com.facebook.react.uimanager.InterfaceC3297m
    public View getChildAt(T parent, int index) {
        AbstractC5504s.h(parent, "parent");
        return parent.getChildAt(index);
    }

    @Override // com.facebook.react.uimanager.InterfaceC3297m
    public int getChildCount(T parent) {
        AbstractC5504s.h(parent, "parent");
        return parent.getChildCount();
    }

    @Override // com.facebook.react.uimanager.InterfaceC3297m
    public void removeViewAt(T parent, int index) {
        AbstractC5504s.h(parent, "parent");
        UiThreadUtil.assertOnUiThread();
        parent.removeViewAt(index);
    }

    public ViewGroupManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
