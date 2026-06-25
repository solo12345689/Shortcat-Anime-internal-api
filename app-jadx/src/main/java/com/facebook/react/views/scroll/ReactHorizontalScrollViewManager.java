package com.facebook.react.views.scroll;

import Td.InterfaceC2154e;
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
import h7.C4914b;
import java.util.ArrayList;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC5454a(name = ReactHorizontalScrollViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0017\u0018\u0000 k2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001lB\u0015\b\u0007\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001f\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u001aH\u0007¢\u0006\u0004\b%\u0010\u001eJ\u001f\u0010'\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010&\u001a\u00020 H\u0007¢\u0006\u0004\b'\u0010#J!\u0010)\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b)\u0010*J!\u0010-\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010+H\u0007¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u001aH\u0007¢\u0006\u0004\b0\u0010\u001eJ\u001f\u00102\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u001aH\u0007¢\u0006\u0004\b2\u0010\u001eJ\u001f\u00104\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u001aH\u0007¢\u0006\u0004\b4\u0010\u001eJ\u001f\u00106\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u001aH\u0007¢\u0006\u0004\b6\u0010\u001eJ!\u00108\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b8\u0010*J\u001f\u0010:\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u001aH\u0007¢\u0006\u0004\b:\u0010\u001eJ!\u0010;\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b;\u0010*J!\u0010<\u001a\u00020\u001c2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b<\u0010\u001eJ)\u0010A\u001a\u00020\u001c2\u0006\u0010=\u001a\u00020\u00022\u0006\u0010?\u001a\u00020>2\b\u0010@\u001a\u0004\u0018\u00010+H\u0017¢\u0006\u0004\bA\u0010BJ)\u0010A\u001a\u00020\u001c2\u0006\u0010=\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\r2\b\u0010@\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\bA\u0010CJ\u0017\u0010D\u001a\u00020\u001c2\u0006\u0010=\u001a\u00020\u0002H\u0016¢\u0006\u0004\bD\u0010EJ\u001f\u0010H\u001a\u00020\u001c2\u0006\u0010=\u001a\u00020\u00022\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bH\u0010IJ\u001f\u0010K\u001a\u00020\u001c2\u0006\u0010=\u001a\u00020\u00022\u0006\u0010G\u001a\u00020JH\u0016¢\u0006\u0004\bK\u0010LJ\u001f\u0010N\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010M\u001a\u00020>H\u0007¢\u0006\u0004\bN\u0010OJ)\u0010R\u001a\u00020\u001c2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010P\u001a\u00020>2\u0006\u0010Q\u001a\u00020 H\u0007¢\u0006\u0004\bR\u0010SJ#\u0010U\u001a\u00020\u001c2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010T\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\bU\u0010*J)\u0010W\u001a\u00020\u001c2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010P\u001a\u00020>2\u0006\u0010V\u001a\u00020 H\u0007¢\u0006\u0004\bW\u0010SJ)\u0010X\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010P\u001a\u00020>2\b\u0010M\u001a\u0004\u0018\u00010>H\u0007¢\u0006\u0004\bX\u0010YJ!\u0010[\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\b\u0010Z\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b[\u0010*J\u001f\u0010\\\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\\\u0010\u001eJ\u001f\u0010^\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020]H\u0007¢\u0006\u0004\b^\u0010_J!\u0010a\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010`H\u0007¢\u0006\u0004\ba\u0010bJ!\u0010c\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010`H\u0007¢\u0006\u0004\bc\u0010bJ!\u0010e\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\b\u0010d\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\be\u0010*J\u001f\u0010g\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010f\u001a\u00020>H\u0007¢\u0006\u0004\bg\u0010OJ!\u0010i\u001a\u00020\u001c2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010h\u001a\u00020\u001aH\u0007¢\u0006\u0004\bi\u0010\u001eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010j¨\u0006m"}, d2 = {"Lcom/facebook/react/views/scroll/ReactHorizontalScrollViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/facebook/react/views/scroll/j;", "Lcom/facebook/react/views/scroll/m$b;", "Lcom/facebook/react/views/scroll/a;", "fpsListener", "<init>", "(Lcom/facebook/react/views/scroll/a;)V", "Lcom/facebook/react/uimanager/b0;", "reactContext", "view", "prepareToRecycleView", "(Lcom/facebook/react/uimanager/b0;Lcom/facebook/react/views/scroll/j;)Lcom/facebook/react/views/scroll/j;", "", "getName", "()Ljava/lang/String;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)Lcom/facebook/react/views/scroll/j;", "Lcom/facebook/react/uimanager/Q;", "props", "Lcom/facebook/react/uimanager/a0;", "stateWrapper", "", "updateState", "(Lcom/facebook/react/views/scroll/j;Lcom/facebook/react/uimanager/Q;Lcom/facebook/react/uimanager/a0;)Ljava/lang/Object;", "", "value", "LTd/L;", "setScrollEnabled", "(Lcom/facebook/react/views/scroll/j;Z)V", "setShowsHorizontalScrollIndicator", "", "decelerationRate", "setDecelerationRate", "(Lcom/facebook/react/views/scroll/j;F)V", "disableIntervalMomentum", "setDisableIntervalMomentum", "snapToInterval", "setSnapToInterval", "alignment", "setSnapToAlignment", "(Lcom/facebook/react/views/scroll/j;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/ReadableArray;", "snapToOffsets", "setSnapToOffsets", "(Lcom/facebook/react/views/scroll/j;Lcom/facebook/react/bridge/ReadableArray;)V", "snapToStart", "setSnapToStart", "snapToEnd", "setSnapToEnd", "removeClippedSubviews", "setRemoveClippedSubviews", "sendMomentumEvents", "setSendMomentumEvents", "scrollPerfTag", "setScrollPerfTag", "pagingEnabled", "setPagingEnabled", "setOverScrollMode", "setNestedScrollEnabled", "scrollView", "", "commandId", "args", "receiveCommand", "(Lcom/facebook/react/views/scroll/j;ILcom/facebook/react/bridge/ReadableArray;)V", "(Lcom/facebook/react/views/scroll/j;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "flashScrollIndicators", "(Lcom/facebook/react/views/scroll/j;)V", "Lcom/facebook/react/views/scroll/m$c;", "data", "scrollTo", "(Lcom/facebook/react/views/scroll/j;Lcom/facebook/react/views/scroll/m$c;)V", "Lcom/facebook/react/views/scroll/m$d;", "scrollToEnd", "(Lcom/facebook/react/views/scroll/j;Lcom/facebook/react/views/scroll/m$d;)V", "color", "setBottomFillColor", "(Lcom/facebook/react/views/scroll/j;I)V", "index", "borderRadius", "setBorderRadius", "(Lcom/facebook/react/views/scroll/j;IF)V", "borderStyle", "setBorderStyle", "width", "setBorderWidth", "setBorderColor", "(Lcom/facebook/react/views/scroll/j;ILjava/lang/Integer;)V", "overflow", "setOverflow", "setPersistentScrollbar", "Lcom/facebook/react/bridge/Dynamic;", "setFadingEdgeLength", "(Lcom/facebook/react/views/scroll/j;Lcom/facebook/react/bridge/Dynamic;)V", "Lcom/facebook/react/bridge/ReadableMap;", "setContentOffset", "(Lcom/facebook/react/views/scroll/j;Lcom/facebook/react/bridge/ReadableMap;)V", "setMaintainVisibleContentPosition", "pointerEventsStr", "setPointerEvents", "scrollEventThrottle", "setScrollEventThrottle", "horizontal", "setHorizontal", "Lcom/facebook/react/views/scroll/a;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ReactHorizontalScrollViewManager extends ViewGroupManager<j> implements m.b {
    public static final String REACT_CLASS = "AndroidHorizontalScrollView";
    private final a fpsListener;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37991a;

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
            f37991a = iArr;
        }
    }

    public ReactHorizontalScrollViewManager() {
        this(null, 1, 0 == true ? 1 : 0);
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
    public final void setBorderColor(j view, int index, Integer color) {
        AbstractC5504s.h(view, "view");
        C3281a.r(view, H7.t.f8115b, color);
    }

    @B7.b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public final void setBorderRadius(j view, int index, float borderRadius) {
        if (view != null) {
            C3281a.s(view, (H7.i) H7.i.b().get(index), Float.isNaN(borderRadius) ? null : new C3303t(borderRadius, EnumC3304u.f37832a));
        }
    }

    @B7.a(name = "borderStyle")
    public final void setBorderStyle(j view, String borderStyle) {
        if (view != null) {
            C3281a.t(view, borderStyle == null ? null : H7.k.f8072a.a(borderStyle));
        }
    }

    @B7.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public final void setBorderWidth(j view, int index, float width) {
        if (view != null) {
            C3281a.u(view, (H7.t) H7.t.b().get(index), Float.valueOf(width));
        }
    }

    @B7.a(customType = "Color", defaultInt = 0, name = "endFillColor")
    public final void setBottomFillColor(j view, int color) {
        AbstractC5504s.h(view, "view");
        view.setEndFillColor(color);
    }

    @B7.a(name = "contentOffset")
    public final void setContentOffset(j view, ReadableMap value) {
        AbstractC5504s.h(view, "view");
        if (value != null) {
            view.scrollTo((int) B.h(value.hasKey("x") ? value.getDouble("x") : 0.0d), (int) B.h(value.hasKey("y") ? value.getDouble("y") : 0.0d));
        } else {
            view.scrollTo(0, 0);
        }
    }

    @B7.a(name = "decelerationRate")
    public final void setDecelerationRate(j view, float decelerationRate) {
        AbstractC5504s.h(view, "view");
        view.setDecelerationRate(decelerationRate);
    }

    @B7.a(name = "disableIntervalMomentum")
    public final void setDisableIntervalMomentum(j view, boolean disableIntervalMomentum) {
        AbstractC5504s.h(view, "view");
        view.setDisableIntervalMomentum(disableIntervalMomentum);
    }

    @B7.a(name = "fadingEdgeLength")
    public final void setFadingEdgeLength(j view, Dynamic value) {
        ReadableMap readableMapAsMap;
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(value, "value");
        int i10 = b.f37991a[value.getType().ordinal()];
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
            view.setHorizontalFadingEdgeEnabled(true);
            view.setFadingEdgeLength(Math.round(B.f37368a.c(Math.max(view.getFadingEdgeLengthStart(), view.getFadingEdgeLengthEnd()))));
        } else {
            view.setHorizontalFadingEdgeEnabled(false);
            view.setFadingEdgeLength(0);
        }
    }

    @B7.a(name = "maintainVisibleContentPosition")
    public final void setMaintainVisibleContentPosition(j view, ReadableMap value) {
        AbstractC5504s.h(view, "view");
        if (value != null) {
            view.setMaintainVisibleContentPosition(f.a.f38012c.a(value));
        } else {
            view.setMaintainVisibleContentPosition(null);
        }
    }

    @B7.a(name = "nestedScrollEnabled")
    public final void setNestedScrollEnabled(j view, boolean value) {
        if (view != null) {
            AbstractC2747a0.v0(view, value);
        }
    }

    @B7.a(name = "overScrollMode")
    public void setOverScrollMode(j view, String value) {
        AbstractC5504s.h(view, "view");
        view.setOverScrollMode(n.s(value));
    }

    @B7.a(name = "overflow")
    public final void setOverflow(j view, String overflow) {
        AbstractC5504s.h(view, "view");
        view.setOverflow(overflow);
    }

    @B7.a(name = "pagingEnabled")
    public final void setPagingEnabled(j view, boolean pagingEnabled) {
        AbstractC5504s.h(view, "view");
        view.setPagingEnabled(pagingEnabled);
    }

    @B7.a(name = "persistentScrollbar")
    public final void setPersistentScrollbar(j view, boolean value) {
        AbstractC5504s.h(view, "view");
        view.setScrollbarFadingEnabled(!value);
    }

    @B7.a(name = "pointerEvents")
    public final void setPointerEvents(j view, String pointerEventsStr) {
        AbstractC5504s.h(view, "view");
        view.setPointerEvents(C.f37387a.c(pointerEventsStr));
    }

    @B7.a(name = "removeClippedSubviews")
    public final void setRemoveClippedSubviews(j view, boolean removeClippedSubviews) {
        AbstractC5504s.h(view, "view");
        view.setRemoveClippedSubviews(removeClippedSubviews);
    }

    @B7.a(defaultBoolean = true, name = "scrollEnabled")
    public final void setScrollEnabled(j view, boolean value) {
        AbstractC5504s.h(view, "view");
        view.setScrollEnabled(value);
    }

    @B7.a(name = "scrollEventThrottle")
    public final void setScrollEventThrottle(j view, int scrollEventThrottle) {
        AbstractC5504s.h(view, "view");
        view.setScrollEventThrottle(scrollEventThrottle);
    }

    @B7.a(name = "scrollPerfTag")
    public final void setScrollPerfTag(j view, String scrollPerfTag) {
        AbstractC5504s.h(view, "view");
        view.setScrollPerfTag(scrollPerfTag);
    }

    @B7.a(name = "sendMomentumEvents")
    public final void setSendMomentumEvents(j view, boolean sendMomentumEvents) {
        AbstractC5504s.h(view, "view");
        view.setSendMomentumEvents(sendMomentumEvents);
    }

    @B7.a(defaultBoolean = true, name = "showsHorizontalScrollIndicator")
    public final void setShowsHorizontalScrollIndicator(j view, boolean value) {
        AbstractC5504s.h(view, "view");
        view.setHorizontalScrollBarEnabled(value);
    }

    @B7.a(name = "snapToAlignment")
    public final void setSnapToAlignment(j view, String alignment) {
        AbstractC5504s.h(view, "view");
        view.setSnapToAlignment(n.t(alignment));
    }

    @B7.a(name = "snapToEnd")
    public final void setSnapToEnd(j view, boolean snapToEnd) {
        AbstractC5504s.h(view, "view");
        view.setSnapToEnd(snapToEnd);
    }

    @B7.a(name = "snapToInterval")
    public final void setSnapToInterval(j view, float snapToInterval) {
        AbstractC5504s.h(view, "view");
        view.setSnapInterval((int) (snapToInterval * B.d()));
    }

    @B7.a(name = "snapToOffsets")
    public final void setSnapToOffsets(j view, ReadableArray snapToOffsets) {
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
    public final void setSnapToStart(j view, boolean snapToStart) {
        AbstractC5504s.h(view, "view");
        view.setSnapToStart(snapToStart);
    }

    public /* synthetic */ ReactHorizontalScrollViewManager(a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : aVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public j createViewInstance(C3284b0 context) {
        AbstractC5504s.h(context, "context");
        return new j(context, null);
    }

    @Override // com.facebook.react.views.scroll.m.b
    public void flashScrollIndicators(j scrollView) {
        AbstractC5504s.h(scrollView, "scrollView");
        scrollView.r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public j prepareToRecycleView(C3284b0 reactContext, j view) {
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(view, "view");
        j jVar = (j) super.prepareToRecycleView(reactContext, view);
        if (jVar != null) {
            jVar.F();
        }
        return jVar;
    }

    @Override // com.facebook.react.views.scroll.m.b
    public void scrollTo(j scrollView, m.c data) {
        AbstractC5504s.h(scrollView, "scrollView");
        AbstractC5504s.h(data, "data");
        scrollView.l();
        if (data.f38117c) {
            scrollView.b(data.f38115a, data.f38116b);
        } else {
            scrollView.scrollTo(data.f38115a, data.f38116b);
        }
    }

    @Override // com.facebook.react.views.scroll.m.b
    public void scrollToEnd(j scrollView, m.d data) {
        AbstractC5504s.h(scrollView, "scrollView");
        AbstractC5504s.h(data, "data");
        View childAt = scrollView.getChildAt(0);
        if (childAt == null) {
            throw new RetryableMountingLayerException("scrollToEnd called on HorizontalScrollView without child");
        }
        int width = childAt.getWidth() + scrollView.getPaddingRight();
        scrollView.l();
        if (data.f38118a) {
            scrollView.b(width, scrollView.getScrollY());
        } else {
            scrollView.scrollTo(width, scrollView.getScrollY());
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(j view, Q props, InterfaceC3282a0 stateWrapper) {
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

    public ReactHorizontalScrollViewManager(a aVar) {
        super(null, 1, null);
        if (C4914b.w()) {
            setupViewRecycling();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @InterfaceC2154e
    public void receiveCommand(j scrollView, int commandId, ReadableArray args) {
        AbstractC5504s.h(scrollView, "scrollView");
        m.f38114a.b(this, scrollView, commandId, args);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(j scrollView, String commandId, ReadableArray args) {
        AbstractC5504s.h(scrollView, "scrollView");
        AbstractC5504s.h(commandId, "commandId");
        m.f38114a.c(this, scrollView, commandId, args);
    }

    @B7.a(name = "horizontal")
    public final void setHorizontal(j view, boolean horizontal) {
    }
}
