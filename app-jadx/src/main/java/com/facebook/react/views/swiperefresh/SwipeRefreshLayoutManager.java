package com.facebook.react.views.swiperefresh;

import K7.C1821e;
import K7.InterfaceC1823f;
import Td.z;
import Ud.S;
import android.content.Context;
import android.view.View;
import androidx.swiperefreshlayout.widget.c;
import com.adjust.sdk.Constants;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.f0;
import com.facebook.react.uimanager.q0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC5454a(name = SwipeRefreshLayoutManager.REACT_CLASS)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0011\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u00011B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0016H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u0019\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001bJ\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u0019\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u001f\u0010\u0012J\u001f\u0010!\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020 H\u0017¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010\u0012J\u001f\u0010$\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b$\u0010%J\u001b\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020'0&H\u0016¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020'0&H\u0016¢\u0006\u0004\b*\u0010)J\u0015\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020+H\u0014¢\u0006\u0004\b,\u0010-R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/facebook/react/views/swiperefresh/SwipeRefreshLayoutManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/facebook/react/views/swiperefresh/a;", "LK7/f;", "<init>", "()V", "Lcom/facebook/react/uimanager/b0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)Lcom/facebook/react/views/swiperefresh/a;", "", "getName", "()Ljava/lang/String;", "view", "", "value", "LTd/L;", "setEnabled", "(Lcom/facebook/react/views/swiperefresh/a;Z)V", "Lcom/facebook/react/bridge/ReadableArray;", "setColors", "(Lcom/facebook/react/views/swiperefresh/a;Lcom/facebook/react/bridge/ReadableArray;)V", "", "setProgressBackgroundColor", "(Lcom/facebook/react/views/swiperefresh/a;Ljava/lang/Integer;)V", "setSize", "(Lcom/facebook/react/views/swiperefresh/a;I)V", "(Lcom/facebook/react/views/swiperefresh/a;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/Dynamic;", "size", "(Lcom/facebook/react/views/swiperefresh/a;Lcom/facebook/react/bridge/Dynamic;)V", "setRefreshing", "", "setProgressViewOffset", "(Lcom/facebook/react/views/swiperefresh/a;F)V", "setNativeRefreshing", "addEventEmitters", "(Lcom/facebook/react/uimanager/b0;Lcom/facebook/react/views/swiperefresh/a;)V", "", "", "getExportedViewConstants", "()Ljava/util/Map;", "getExportedCustomDirectEventTypeConstants", "Lcom/facebook/react/uimanager/q0;", "getDelegate", "()Lcom/facebook/react/uimanager/q0;", "delegate", "Lcom/facebook/react/uimanager/q0;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class SwipeRefreshLayoutManager extends ViewGroupManager<a> implements InterfaceC1823f {
    public static final String REACT_CLASS = "AndroidSwipeRefreshLayout";
    private final q0 delegate;

    public SwipeRefreshLayoutManager() {
        super(null, 1, null);
        this.delegate = new C1821e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEventEmitters$lambda$0(C3284b0 c3284b0, a aVar) {
        EventDispatcher eventDispatcherC = f0.c(c3284b0, aVar.getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.d(new b(f0.f(aVar), aVar.getId()));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected q0 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(S.n(z.a("topRefresh", S.n(z.a("registrationName", "onRefresh")))));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return S.n(z.a("SIZE", S.n(z.a("DEFAULT", 1), z.a("LARGE", 0))));
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
    public void addEventEmitters(final C3284b0 reactContext, final a view) {
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(view, "view");
        view.setOnRefreshListener(new c.j() { // from class: com.facebook.react.views.swiperefresh.c
            @Override // androidx.swiperefreshlayout.widget.c.j
            public final void a() {
                SwipeRefreshLayoutManager.addEventEmitters$lambda$0(reactContext, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(C3284b0 reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        return new a(reactContext);
    }

    @Override // K7.InterfaceC1823f
    @B7.a(customType = "ColorArray", name = "colors")
    public void setColors(a view, ReadableArray value) {
        AbstractC5504s.h(view, "view");
        if (value == null) {
            view.setColorSchemeColors(new int[0]);
            return;
        }
        int size = value.size();
        int[] iArr = new int[size];
        int size2 = value.size();
        for (int i10 = 0; i10 < size2; i10++) {
            if (value.getType(i10) == ReadableType.Map) {
                ReadableMap map = value.getMap(i10);
                Context context = view.getContext();
                AbstractC5504s.g(context, "getContext(...)");
                iArr[i10] = ColorPropConverter.getColor(map, context, 0);
            } else {
                iArr[i10] = value.getInt(i10);
            }
        }
        view.setColorSchemeColors(Arrays.copyOf(iArr, size));
    }

    @Override // K7.InterfaceC1823f
    @B7.a(defaultBoolean = true, name = "enabled")
    public void setEnabled(a view, boolean value) {
        AbstractC5504s.h(view, "view");
        view.setEnabled(value);
    }

    @Override // K7.InterfaceC1823f
    public void setNativeRefreshing(a view, boolean value) {
        AbstractC5504s.h(view, "view");
        setRefreshing(view, value);
    }

    @Override // K7.InterfaceC1823f
    @B7.a(customType = "Color", name = "progressBackgroundColor")
    public void setProgressBackgroundColor(a view, Integer value) {
        AbstractC5504s.h(view, "view");
        view.setProgressBackgroundColorSchemeColor(value != null ? value.intValue() : 0);
    }

    @Override // K7.InterfaceC1823f
    @B7.a(defaultFloat = 0.0f, name = "progressViewOffset")
    public void setProgressViewOffset(a view, float value) {
        AbstractC5504s.h(view, "view");
        view.setProgressViewOffset(value);
    }

    @Override // K7.InterfaceC1823f
    @B7.a(name = "refreshing")
    public void setRefreshing(a view, boolean value) {
        AbstractC5504s.h(view, "view");
        view.setRefreshing(value);
    }

    public final void setSize(a view, int value) {
        AbstractC5504s.h(view, "view");
        view.setSize(value);
    }

    @Override // K7.InterfaceC1823f
    public void setSize(a view, String value) {
        AbstractC5504s.h(view, "view");
        if (value != null && !value.equals("default")) {
            if (value.equals(Constants.LARGE)) {
                view.setSize(0);
                return;
            }
            throw new IllegalArgumentException("Size must be 'default' or 'large', received: " + value);
        }
        view.setSize(1);
    }

    @B7.a(name = "size")
    public final void setSize(a view, Dynamic size) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(size, "size");
        if (size.isNull()) {
            view.setSize(1);
        } else if (size.getType() == ReadableType.Number) {
            view.setSize(size.asInt());
        } else {
            if (size.getType() != ReadableType.String) {
                throw new IllegalArgumentException("Size must be 'default' or 'large'");
            }
            setSize(view, size.asString());
        }
    }
}
