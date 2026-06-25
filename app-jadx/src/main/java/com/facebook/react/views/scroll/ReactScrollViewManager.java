package com.facebook.react.views.scroll;

import Td.InterfaceC2154e;
import Td.z;
import Ud.S;
import android.view.View;
import androidx.core.view.AbstractC2747a0;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.uimanager.B;
import com.facebook.react.uimanager.C;
import com.facebook.react.uimanager.C3281a;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.C3303t;
import com.facebook.react.uimanager.EnumC3304u;
import com.facebook.react.uimanager.InterfaceC3282a0;
import com.facebook.react.uimanager.Q;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.views.scroll.f;
import com.facebook.react.views.scroll.m;
import com.facebook.react.views.scroll.p;
import h7.C4914b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC5454a(name = ReactScrollViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0017\u0018\u0000 q2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001rB\u0015\b\u0007\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0018\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001e\u0010\u0017J\u001f\u0010 \u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0019H\u0007¢\u0006\u0004\b \u0010\u001cJ!\u0010#\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0013H\u0007¢\u0006\u0004\b)\u0010\u0017J\u001f\u0010+\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0013H\u0007¢\u0006\u0004\b+\u0010\u0017J\u001f\u0010-\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0013H\u0007¢\u0006\u0004\b-\u0010\u0017J\u001f\u0010/\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0013H\u0007¢\u0006\u0004\b/\u0010\u0017J!\u00101\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b1\u0010'J\u001f\u00103\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u0013H\u0007¢\u0006\u0004\b3\u0010\u0017J\u001f\u00106\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u00105\u001a\u000204H\u0007¢\u0006\u0004\b6\u00107J!\u00108\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b8\u0010'J!\u00109\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b9\u0010\u0017J\u001d\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u000204\u0018\u00010:H\u0016¢\u0006\u0004\b;\u0010<J)\u0010@\u001a\u00020\u00152\u0006\u0010=\u001a\u00020\u00022\u0006\u0010>\u001a\u0002042\b\u0010?\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0004\b@\u0010AJ)\u0010@\u001a\u00020\u00152\u0006\u0010=\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\r2\b\u0010?\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b@\u0010BJ\u0017\u0010C\u001a\u00020\u00152\u0006\u0010=\u001a\u00020\u0002H\u0016¢\u0006\u0004\bC\u0010DJ\u001f\u0010G\u001a\u00020\u00152\u0006\u0010=\u001a\u00020\u00022\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ)\u0010K\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u0002042\u0006\u0010J\u001a\u00020\u0019H\u0007¢\u0006\u0004\bK\u0010LJ#\u0010N\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010M\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\bN\u0010'J)\u0010P\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u0002042\u0006\u0010O\u001a\u00020\u0019H\u0007¢\u0006\u0004\bP\u0010LJ+\u0010Q\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000104H\u0007¢\u0006\u0004\bQ\u0010RJ!\u0010T\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\b\u0010S\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\bT\u0010'J\u001f\u0010V\u001a\u00020\u00152\u0006\u0010=\u001a\u00020\u00022\u0006\u0010F\u001a\u00020UH\u0016¢\u0006\u0004\bV\u0010WJ\u001f\u0010X\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\bX\u0010\u0017J\u001f\u0010Z\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020YH\u0007¢\u0006\u0004\bZ\u0010[J!\u0010]\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\\H\u0007¢\u0006\u0004\b]\u0010^J!\u0010_\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\\H\u0007¢\u0006\u0004\b_\u0010^J)\u0010e\u001a\u0004\u0018\u00010d2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010a\u001a\u00020`2\u0006\u0010c\u001a\u00020bH\u0016¢\u0006\u0004\be\u0010fJ\u001d\u0010g\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020d\u0018\u00010:H\u0016¢\u0006\u0004\bg\u0010<J!\u0010i\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\b\u0010h\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\bi\u0010'J\u001f\u0010k\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010j\u001a\u000204H\u0007¢\u0006\u0004\bk\u00107J!\u0010m\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010l\u001a\u00020\u0013H\u0007¢\u0006\u0004\bm\u0010\u0017J\u001f\u0010o\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010n\u001a\u00020\u0013H\u0007¢\u0006\u0004\bo\u0010\u0017R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010p¨\u0006s"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/facebook/react/views/scroll/k;", "Lcom/facebook/react/views/scroll/m$b;", "Lcom/facebook/react/views/scroll/a;", "fpsListener", "<init>", "(Lcom/facebook/react/views/scroll/a;)V", "Lcom/facebook/react/uimanager/b0;", "reactContext", "view", "prepareToRecycleView", "(Lcom/facebook/react/uimanager/b0;Lcom/facebook/react/views/scroll/k;)Lcom/facebook/react/views/scroll/k;", "", "getName", "()Ljava/lang/String;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)Lcom/facebook/react/views/scroll/k;", "", "value", "LTd/L;", "setScrollEnabled", "(Lcom/facebook/react/views/scroll/k;Z)V", "setShowsVerticalScrollIndicator", "", "decelerationRate", "setDecelerationRate", "(Lcom/facebook/react/views/scroll/k;F)V", "disableIntervalMomentum", "setDisableIntervalMomentum", "snapToInterval", "setSnapToInterval", "Lcom/facebook/react/bridge/ReadableArray;", "snapToOffsets", "setSnapToOffsets", "(Lcom/facebook/react/views/scroll/k;Lcom/facebook/react/bridge/ReadableArray;)V", "alignment", "setSnapToAlignment", "(Lcom/facebook/react/views/scroll/k;Ljava/lang/String;)V", "snapToStart", "setSnapToStart", "snapToEnd", "setSnapToEnd", "removeClippedSubviews", "setRemoveClippedSubviews", "sendMomentumEvents", "setSendMomentumEvents", "scrollPerfTag", "setScrollPerfTag", "pagingEnabled", "setPagingEnabled", "", "color", "setBottomFillColor", "(Lcom/facebook/react/views/scroll/k;I)V", "setOverScrollMode", "setNestedScrollEnabled", "", "getCommandsMap", "()Ljava/util/Map;", "scrollView", "commandId", "args", "receiveCommand", "(Lcom/facebook/react/views/scroll/k;ILcom/facebook/react/bridge/ReadableArray;)V", "(Lcom/facebook/react/views/scroll/k;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "flashScrollIndicators", "(Lcom/facebook/react/views/scroll/k;)V", "Lcom/facebook/react/views/scroll/m$c;", "data", "scrollTo", "(Lcom/facebook/react/views/scroll/k;Lcom/facebook/react/views/scroll/m$c;)V", "index", "borderRadius", "setBorderRadius", "(Lcom/facebook/react/views/scroll/k;IF)V", "borderStyle", "setBorderStyle", "width", "setBorderWidth", "setBorderColor", "(Lcom/facebook/react/views/scroll/k;ILjava/lang/Integer;)V", "overflow", "setOverflow", "Lcom/facebook/react/views/scroll/m$d;", "scrollToEnd", "(Lcom/facebook/react/views/scroll/k;Lcom/facebook/react/views/scroll/m$d;)V", "setPersistentScrollbar", "Lcom/facebook/react/bridge/Dynamic;", "setFadingEdgeLength", "(Lcom/facebook/react/views/scroll/k;Lcom/facebook/react/bridge/Dynamic;)V", "Lcom/facebook/react/bridge/ReadableMap;", "setContentOffset", "(Lcom/facebook/react/views/scroll/k;Lcom/facebook/react/bridge/ReadableMap;)V", "setMaintainVisibleContentPosition", "Lcom/facebook/react/uimanager/Q;", "props", "Lcom/facebook/react/uimanager/a0;", "stateWrapper", "", "updateState", "(Lcom/facebook/react/views/scroll/k;Lcom/facebook/react/uimanager/Q;Lcom/facebook/react/uimanager/a0;)Ljava/lang/Object;", "getExportedCustomDirectEventTypeConstants", "pointerEventsStr", "setPointerEvents", "scrollEventThrottle", "setScrollEventThrottle", "horizontal", "setHorizontal", "applyFix", "setIsInvertedVirtualizedList", "Lcom/facebook/react/views/scroll/a;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ReactScrollViewManager extends ViewGroupManager<k> implements m.b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String REACT_CLASS = "RCTScrollView";
    private final a fpsListener;

    /* JADX INFO: renamed from: com.facebook.react.views.scroll.ReactScrollViewManager$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Map a() {
            p.a aVar = p.f38149a;
            return S.l(z.a(aVar.a(p.f38152d), S.f(z.a("registrationName", "onScroll"))), z.a(aVar.a(p.f38150b), S.f(z.a("registrationName", "onScrollBeginDrag"))), z.a(aVar.a(p.f38151c), S.f(z.a("registrationName", "onScrollEndDrag"))), z.a(aVar.a(p.f38153e), S.f(z.a("registrationName", "onMomentumScrollBegin"))), z.a(aVar.a(p.f38154f), S.f(z.a("registrationName", "onMomentumScrollEnd"))));
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37992a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f37992a = iArr;
        }
    }

    public ReactScrollViewManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return m.f38114a.a();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(INSTANCE.a());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @B7.b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public final void setBorderColor(k view, int index, Integer color) {
        if (view != null) {
            C3281a.r(view, H7.t.f8115b, color);
        }
    }

    @B7.b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public final void setBorderRadius(k view, int index, float borderRadius) {
        if (view != null) {
            C3281a.s(view, (H7.i) H7.i.b().get(index), Float.isNaN(borderRadius) ? null : new C3303t(borderRadius, EnumC3304u.f37832a));
        }
    }

    @B7.a(name = "borderStyle")
    public final void setBorderStyle(k view, String borderStyle) {
        if (view != null) {
            C3281a.t(view, borderStyle == null ? null : H7.k.f8072a.a(borderStyle));
        }
    }

    @B7.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public final void setBorderWidth(k view, int index, float width) {
        if (view != null) {
            C3281a.u(view, (H7.t) H7.t.b().get(index), Float.valueOf(width));
        }
    }

    @B7.a(customType = "Color", defaultInt = 0, name = "endFillColor")
    public final void setBottomFillColor(k view, int color) {
        AbstractC5504s.h(view, "view");
        view.setEndFillColor(color);
    }

    @B7.a(customType = "Point", name = "contentOffset")
    public final void setContentOffset(k view, ReadableMap value) {
        AbstractC5504s.h(view, "view");
        view.setContentOffset(value);
    }

    @B7.a(name = "decelerationRate")
    public final void setDecelerationRate(k view, float decelerationRate) {
        AbstractC5504s.h(view, "view");
        view.setDecelerationRate(decelerationRate);
    }

    @B7.a(name = "disableIntervalMomentum")
    public final void setDisableIntervalMomentum(k view, boolean disableIntervalMomentum) {
        AbstractC5504s.h(view, "view");
        view.setDisableIntervalMomentum(disableIntervalMomentum);
    }

    @B7.a(name = "fadingEdgeLength")
    public final void setFadingEdgeLength(k view, Dynamic value) {
        ReadableMap readableMapAsMap;
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(value, "value");
        int i10 = b.f37992a[value.getType().ordinal()];
        if (i10 == 1) {
            view.setFadingEdgeLengthStart(value.asInt());
            view.setFadingEdgeLengthEnd(value.asInt());
        } else if (i10 == 2 && (readableMapAsMap = value.asMap()) != null) {
            int i11 = (!readableMapAsMap.hasKey("start") || readableMapAsMap.getInt("start") <= 0) ? 0 : readableMapAsMap.getInt("start");
            int i12 = (!readableMapAsMap.hasKey("end") || readableMapAsMap.getInt("end") <= 0) ? 0 : readableMapAsMap.getInt("end");
            view.setFadingEdgeLengthStart(i11);
            view.setFadingEdgeLengthEnd(i12);
        }
        if (view.getFadingEdgeLengthStart() > 0 || view.getFadingEdgeLengthEnd() > 0) {
            view.setVerticalFadingEdgeEnabled(true);
            view.setFadingEdgeLength(Math.round(B.f37368a.c(Math.max(view.getFadingEdgeLengthStart(), view.getFadingEdgeLengthEnd()))));
        } else {
            view.setVerticalFadingEdgeEnabled(false);
            view.setFadingEdgeLength(0);
        }
    }

    @B7.a(name = "isInvertedVirtualizedList")
    public final void setIsInvertedVirtualizedList(k view, boolean applyFix) {
        AbstractC5504s.h(view, "view");
        if (applyFix) {
            view.setVerticalScrollbarPosition(1);
        } else {
            view.setVerticalScrollbarPosition(0);
        }
    }

    @B7.a(name = "maintainVisibleContentPosition")
    public final void setMaintainVisibleContentPosition(k view, ReadableMap value) {
        AbstractC5504s.h(view, "view");
        if (value != null) {
            view.setMaintainVisibleContentPosition(f.a.f38012c.a(value));
        } else {
            view.setMaintainVisibleContentPosition(null);
        }
    }

    @B7.a(name = "nestedScrollEnabled")
    public final void setNestedScrollEnabled(k view, boolean value) {
        if (view != null) {
            AbstractC2747a0.v0(view, value);
        }
    }

    @B7.a(name = "overScrollMode")
    public void setOverScrollMode(k view, String value) {
        AbstractC5504s.h(view, "view");
        view.setOverScrollMode(n.s(value));
    }

    @B7.a(name = "overflow")
    public final void setOverflow(k view, String overflow) {
        AbstractC5504s.h(view, "view");
        view.setOverflow(overflow);
    }

    @B7.a(name = "pagingEnabled")
    public final void setPagingEnabled(k view, boolean pagingEnabled) {
        AbstractC5504s.h(view, "view");
        view.setPagingEnabled(pagingEnabled);
    }

    @B7.a(name = "persistentScrollbar")
    public final void setPersistentScrollbar(k view, boolean value) {
        AbstractC5504s.h(view, "view");
        view.setScrollbarFadingEnabled(!value);
    }

    @B7.a(name = "pointerEvents")
    public final void setPointerEvents(k view, String pointerEventsStr) {
        AbstractC5504s.h(view, "view");
        view.setPointerEvents(C.f37387a.c(pointerEventsStr));
    }

    @B7.a(name = "removeClippedSubviews")
    public final void setRemoveClippedSubviews(k view, boolean removeClippedSubviews) {
        AbstractC5504s.h(view, "view");
        view.setRemoveClippedSubviews(removeClippedSubviews);
    }

    @B7.a(defaultBoolean = true, name = "scrollEnabled")
    public final void setScrollEnabled(k view, boolean value) {
        AbstractC5504s.h(view, "view");
        view.setScrollEnabled(value);
        view.setFocusable(value);
    }

    @B7.a(name = "scrollEventThrottle")
    public final void setScrollEventThrottle(k view, int scrollEventThrottle) {
        AbstractC5504s.h(view, "view");
        view.setScrollEventThrottle(scrollEventThrottle);
    }

    @B7.a(name = "scrollPerfTag")
    public final void setScrollPerfTag(k view, String scrollPerfTag) {
        AbstractC5504s.h(view, "view");
        view.setScrollPerfTag(scrollPerfTag);
    }

    @B7.a(name = "sendMomentumEvents")
    public final void setSendMomentumEvents(k view, boolean sendMomentumEvents) {
        AbstractC5504s.h(view, "view");
        view.setSendMomentumEvents(sendMomentumEvents);
    }

    @B7.a(defaultBoolean = true, name = "showsVerticalScrollIndicator")
    public final void setShowsVerticalScrollIndicator(k view, boolean value) {
        AbstractC5504s.h(view, "view");
        view.setVerticalScrollBarEnabled(value);
    }

    @B7.a(name = "snapToAlignment")
    public final void setSnapToAlignment(k view, String alignment) {
        AbstractC5504s.h(view, "view");
        view.setSnapToAlignment(n.t(alignment));
    }

    @B7.a(name = "snapToEnd")
    public final void setSnapToEnd(k view, boolean snapToEnd) {
        AbstractC5504s.h(view, "view");
        view.setSnapToEnd(snapToEnd);
    }

    @B7.a(name = "snapToInterval")
    public final void setSnapToInterval(k view, float snapToInterval) {
        AbstractC5504s.h(view, "view");
        view.setSnapInterval((int) (snapToInterval * B.d()));
    }

    @B7.a(name = "snapToOffsets")
    public final void setSnapToOffsets(k view, ReadableArray snapToOffsets) {
        AbstractC5504s.h(view, "view");
        if (snapToOffsets == null || snapToOffsets.size() == 0) {
            view.setSnapOffsets(null);
            return;
        }
        float fD = B.d();
        ArrayList arrayList = new ArrayList();
        int size = snapToOffsets.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(Integer.valueOf((int) (snapToOffsets.getDouble(i10) * ((double) fD))));
        }
        view.setSnapOffsets(arrayList);
    }

    @B7.a(name = "snapToStart")
    public final void setSnapToStart(k view, boolean snapToStart) {
        AbstractC5504s.h(view, "view");
        view.setSnapToStart(snapToStart);
    }

    public /* synthetic */ ReactScrollViewManager(a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : aVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public k createViewInstance(C3284b0 context) {
        AbstractC5504s.h(context, "context");
        return new k(context, null);
    }

    @Override // com.facebook.react.views.scroll.m.b
    public void flashScrollIndicators(k scrollView) {
        AbstractC5504s.h(scrollView, "scrollView");
        scrollView.r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public k prepareToRecycleView(C3284b0 reactContext, k view) {
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(view, "view");
        k kVar = (k) super.prepareToRecycleView(reactContext, view);
        if (kVar != null) {
            kVar.D();
        }
        return kVar;
    }

    @Override // com.facebook.react.views.scroll.m.b
    public void scrollTo(k scrollView, m.c data) {
        AbstractC5504s.h(scrollView, "scrollView");
        AbstractC5504s.h(data, "data");
        scrollView.m();
        if (data.f38117c) {
            scrollView.b(data.f38115a, data.f38116b);
        } else {
            scrollView.scrollTo(data.f38115a, data.f38116b);
        }
    }

    @Override // com.facebook.react.views.scroll.m.b
    public void scrollToEnd(k scrollView, m.d data) {
        AbstractC5504s.h(scrollView, "scrollView");
        AbstractC5504s.h(data, "data");
        View childAt = scrollView.getChildAt(0);
        if (childAt == null) {
            throw new RetryableMountingLayerException("scrollToEnd called on ScrollView without child");
        }
        int height = childAt.getHeight() + scrollView.getPaddingBottom();
        scrollView.m();
        if (data.f38118a) {
            scrollView.b(scrollView.getScrollX(), height);
        } else {
            scrollView.scrollTo(scrollView.getScrollX(), height);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(k view, Q props, InterfaceC3282a0 stateWrapper) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(props, "props");
        AbstractC5504s.h(stateWrapper, "stateWrapper");
        view.setStateWrapper(stateWrapper);
        if (!C4914b.u() && !C4914b.P()) {
            return null;
        }
        n.q(view, stateWrapper);
        return null;
    }

    public ReactScrollViewManager(a aVar) {
        super(null, 1, null);
        if (C4914b.w()) {
            setupViewRecycling();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @InterfaceC2154e
    public void receiveCommand(k scrollView, int commandId, ReadableArray args) {
        AbstractC5504s.h(scrollView, "scrollView");
        m.f38114a.b(this, scrollView, commandId, args);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(k scrollView, String commandId, ReadableArray args) {
        AbstractC5504s.h(scrollView, "scrollView");
        AbstractC5504s.h(commandId, "commandId");
        m.f38114a.c(this, scrollView, commandId, args);
    }

    @B7.a(name = "horizontal")
    public final void setHorizontal(k view, boolean horizontal) {
    }
}
