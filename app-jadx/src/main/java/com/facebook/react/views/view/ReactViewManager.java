package com.facebook.react.views.view;

import H7.a;
import H7.k;
import H7.t;
import Td.InterfaceC2154e;
import Td.z;
import Ud.S;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.B;
import com.facebook.react.uimanager.C;
import com.facebook.react.uimanager.C3281a;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.C3303t;
import com.facebook.react.uimanager.E;
import com.facebook.react.uimanager.EnumC3304u;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.f0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import h7.C4914b;
import java.util.ArrayList;
import java.util.Map;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC5454a(name = ReactViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b,\n\u0002\u0010%\n\u0002\b\t\b\u0017\u0018\u0000 k2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001lB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J!\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u0013J\u001f\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b \u0010\u0010J\u001f\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\"\u0010\u001eJ!\u0010$\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b$\u0010\u0010J!\u0010&\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b&\u0010\u0010J!\u0010(\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b(\u0010\u0010J!\u0010*\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b*\u0010\u0010J\u001f\u0010,\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\bH\u0017¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\bH\u0017¢\u0006\u0004\b.\u0010-J\u001f\u0010/\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\bH\u0017¢\u0006\u0004\b/\u0010-J\u001f\u00100\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\bH\u0017¢\u0006\u0004\b0\u0010-J\u001f\u00101\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\bH\u0017¢\u0006\u0004\b1\u0010-J'\u00105\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u00102\u001a\u00020\b2\u0006\u00104\u001a\u000203H\u0017¢\u0006\u0004\b5\u00106J'\u00105\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u00102\u001a\u00020\b2\u0006\u00108\u001a\u000207H\u0017¢\u0006\u0004\b5\u00109J!\u0010;\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010:\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b;\u0010<J\u001f\u0010>\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010=\u001a\u000203H\u0017¢\u0006\u0004\b>\u0010?J!\u0010A\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010@\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\bA\u0010<J!\u0010C\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010B\u001a\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\bC\u0010DJ!\u0010F\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010E\u001a\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\bF\u0010DJ\u001f\u0010H\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010G\u001a\u00020\u001bH\u0017¢\u0006\u0004\bH\u0010\u001eJ'\u0010J\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u00102\u001a\u00020\b2\u0006\u0010I\u001a\u000207H\u0017¢\u0006\u0004\bJ\u00109J)\u0010L\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u00102\u001a\u00020\b2\b\u0010K\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\bL\u0010MJ\u001f\u0010O\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u001bH\u0017¢\u0006\u0004\bO\u0010\u001eJ\u001f\u0010Q\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010P\u001a\u00020\u001bH\u0017¢\u0006\u0004\bQ\u0010\u001eJ\u001f\u0010S\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010R\u001a\u00020\u001bH\u0017¢\u0006\u0004\bS\u0010\u001eJ!\u0010U\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010T\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\bU\u0010<J\u001f\u0010W\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010V\u001a\u00020\u0006H\u0017¢\u0006\u0004\bW\u0010<J\u001f\u0010Y\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010X\u001a\u000207H\u0016¢\u0006\u0004\bY\u0010ZJ+\u0010]\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010[\u001a\u0004\u0018\u00010\f2\b\u0010\\\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\u0006H\u0016¢\u0006\u0004\b_\u0010`J\u0017\u0010b\u001a\u00020\u00022\u0006\u0010a\u001a\u00020\u0015H\u0016¢\u0006\u0004\bb\u0010cJ\u001b\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0dH\u0016¢\u0006\u0004\be\u0010fJ)\u0010h\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010g\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\bh\u0010iJ)\u0010h\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010g\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\bh\u0010j¨\u0006m"}, d2 = {"Lcom/facebook/react/views/view/ReactViewManager;", "Lcom/facebook/react/views/view/ReactClippingViewManager;", "Lcom/facebook/react/views/view/g;", "<init>", "()V", "Lcom/facebook/react/bridge/ReadableMap;", "", SubscriberAttributeKt.JSON_NAME_KEY, "", "px", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)I", "root", "Lcom/facebook/react/bridge/ReadableArray;", "args", "LTd/L;", "handleSetPressed", "(Lcom/facebook/react/views/view/g;Lcom/facebook/react/bridge/ReadableArray;)V", "handleHotspotUpdate", "handleFocus", "(Lcom/facebook/react/views/view/g;)V", "handleBlur", "Lcom/facebook/react/uimanager/b0;", "reactContext", "view", "prepareToRecycleView", "(Lcom/facebook/react/uimanager/b0;Lcom/facebook/react/views/view/g;)Lcom/facebook/react/views/view/g;", "onDropViewInstance", "", "accessible", "setAccessible", "(Lcom/facebook/react/views/view/g;Z)V", "nativeIds", "setAccessibilityOrder", "hasTVPreferredFocus", "setTVPreferredFocus", "backgroundImage", "setBackgroundImage", "backgroundSize", "setBackgroundSize", "backgroundPosition", "setBackgroundPosition", "backgroundRepeat", "setBackgroundRepeat", "viewId", "nextFocusDown", "(Lcom/facebook/react/views/view/g;I)V", "nextFocusForward", "nextFocusLeft", "nextFocusRight", "nextFocusUp", "index", "Lcom/facebook/react/bridge/Dynamic;", "rawBorderRadius", "setBorderRadius", "(Lcom/facebook/react/views/view/g;ILcom/facebook/react/bridge/Dynamic;)V", "", "borderRadius", "(Lcom/facebook/react/views/view/g;IF)V", "borderStyle", "setBorderStyle", "(Lcom/facebook/react/views/view/g;Ljava/lang/String;)V", "hitSlop", "setHitSlop", "(Lcom/facebook/react/views/view/g;Lcom/facebook/react/bridge/Dynamic;)V", "pointerEventsStr", "setPointerEvents", AppStateModule.APP_STATE_BACKGROUND, "setNativeBackground", "(Lcom/facebook/react/views/view/g;Lcom/facebook/react/bridge/ReadableMap;)V", "foreground", "setNativeForeground", "needsOffscreenAlphaCompositing", "setNeedsOffscreenAlphaCompositing", "width", "setBorderWidth", "color", "setBorderColor", "(Lcom/facebook/react/views/view/g;ILjava/lang/Integer;)V", "collapsable", "setCollapsable", "collapsableChildren", "setCollapsableChildren", "focusable", "setFocusable", "overflow", "setOverflow", "backfaceVisibility", "setBackfaceVisibility", "opacity", "setOpacity", "(Lcom/facebook/react/views/view/g;F)V", "transforms", "transformOrigin", "setTransformProperty", "(Lcom/facebook/react/views/view/g;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;)V", "getName", "()Ljava/lang/String;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)Lcom/facebook/react/views/view/g;", "", "getCommandsMap", "()Ljava/util/Map;", "commandId", "receiveCommand", "(Lcom/facebook/react/views/view/g;ILcom/facebook/react/bridge/ReadableArray;)V", "(Lcom/facebook/react/views/view/g;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ReactViewManager extends ReactClippingViewManager<g> {
    private static final int CMD_HOTSPOT_UPDATE = 1;
    private static final int CMD_SET_PRESSED = 2;
    private static final String HOTSPOT_UPDATE_KEY = "hotspotUpdate";
    public static final String REACT_CLASS = "RCTView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5, 9, 10, 11};

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38479a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Map.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Null.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f38479a = iArr;
        }
    }

    public ReactViewManager() {
        if (C4914b.y() && AbstractC5504s.c(getClass(), ReactViewManager.class)) {
            setupViewRecycling();
        }
    }

    private final void handleBlur(g root) {
        if (C4914b.q()) {
            root.clearFocusFromJS$ReactAndroid_release();
        }
    }

    private final void handleFocus(g root) {
        if (C4914b.q()) {
            root.requestFocusFromJS$ReactAndroid_release();
        }
    }

    private final void handleHotspotUpdate(g root, ReadableArray args) {
        if (args == null || args.size() != 2) {
            throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'updateHotspot' command");
        }
        B b10 = B.f37368a;
        root.drawableHotspotChanged(b10.a(args.getDouble(0)), b10.a(args.getDouble(1)));
    }

    private final void handleSetPressed(g root, ReadableArray args) {
        if (args == null || args.size() != 1) {
            throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'setPressed' command");
        }
        root.setPressed(args.getBoolean(0));
    }

    private final int px(ReadableMap readableMap, String str) {
        if (readableMap.hasKey(str)) {
            return (int) B.f37368a.a(readableMap.getDouble(str));
        }
        return 0;
    }

    public static final void setFocusable$lambda$2(g gVar, View view) {
        Context context = gVar.getContext();
        AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherC = f0.c((ReactContext) context, gVar.getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.d(new i(f0.e(gVar.getContext()), gVar.getId()));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return S.n(z.a(HOTSPOT_UPDATE_KEY, 1), z.a("setPressed", 2));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @B7.a(defaultInt = -1, name = "nextFocusDown")
    public void nextFocusDown(g view, int viewId) {
        AbstractC5504s.h(view, "view");
        view.setNextFocusDownId(viewId);
    }

    @B7.a(defaultInt = -1, name = "nextFocusForward")
    public void nextFocusForward(g view, int viewId) {
        AbstractC5504s.h(view, "view");
        view.setNextFocusForwardId(viewId);
    }

    @B7.a(defaultInt = -1, name = "nextFocusLeft")
    public void nextFocusLeft(g view, int viewId) {
        AbstractC5504s.h(view, "view");
        view.setNextFocusLeftId(viewId);
    }

    @B7.a(defaultInt = -1, name = "nextFocusRight")
    public void nextFocusRight(g view, int viewId) {
        AbstractC5504s.h(view, "view");
        view.setNextFocusRightId(viewId);
    }

    @B7.a(defaultInt = -1, name = "nextFocusUp")
    public void nextFocusUp(g view, int viewId) {
        AbstractC5504s.h(view, "view");
        view.setNextFocusUpId(viewId);
    }

    @B7.a(name = "experimental_accessibilityOrder")
    public void setAccessibilityOrder(g view, ReadableArray nativeIds) {
        AbstractC5504s.h(view, "view");
        if (C4914b.f()) {
            int childCount = view.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = view.getChildAt(i10);
                AbstractC5504s.g(childAt, "getChildAt(...)");
                E.b(childAt);
            }
            if (nativeIds == null) {
                view.setAxOrderList(null);
                return;
            }
            ArrayList arrayList = new ArrayList();
            int size = nativeIds.size();
            for (int i11 = 0; i11 < size; i11++) {
                String string = nativeIds.getString(i11);
                if (string != null) {
                    arrayList.add(string);
                }
            }
            view.setAxOrderList(arrayList);
        }
    }

    @B7.a(name = "accessible")
    public void setAccessible(g view, boolean accessible) {
        AbstractC5504s.h(view, "view");
        view.setFocusable(accessible);
    }

    @B7.a(name = "backfaceVisibility")
    public void setBackfaceVisibility(g view, String backfaceVisibility) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(backfaceVisibility, "backfaceVisibility");
        view.setBackfaceVisibility(backfaceVisibility);
    }

    @B7.a(customType = "BackgroundImage", name = "experimental_backgroundImage")
    public void setBackgroundImage(g view, ReadableArray backgroundImage) {
        AbstractC5504s.h(view, "view");
        if (C7.a.c(view) == 2) {
            if (backgroundImage == null || backgroundImage.size() <= 0) {
                C3281a.n(view, null);
                return;
            }
            ArrayList arrayList = new ArrayList(backgroundImage.size());
            int size = backgroundImage.size();
            for (int i10 = 0; i10 < size; i10++) {
                ReadableMap map = backgroundImage.getMap(i10);
                a.C0102a c0102a = H7.a.f8019b;
                Context context = view.getContext();
                AbstractC5504s.g(context, "getContext(...)");
                H7.a aVarA = c0102a.a(map, context);
                if (aVarA != null) {
                    arrayList.add(aVarA);
                }
            }
            C3281a.n(view, arrayList);
        }
    }

    @B7.a(customType = "BackgroundPosition", name = "experimental_backgroundPosition")
    public void setBackgroundPosition(g view, ReadableArray backgroundPosition) {
        AbstractC5504s.h(view, "view");
        if (C7.a.c(view) == 2) {
            if (backgroundPosition == null || backgroundPosition.size() <= 0) {
                C3281a.o(view, null);
                return;
            }
            ArrayList arrayList = new ArrayList(backgroundPosition.size());
            int size = backgroundPosition.size();
            for (int i10 = 0; i10 < size; i10++) {
                H7.b bVarA = H7.b.f8021e.a(backgroundPosition.getMap(i10));
                if (bVarA != null) {
                    arrayList.add(bVarA);
                }
            }
            C3281a.o(view, arrayList);
        }
    }

    @B7.a(customType = "BackgroundRepeat", name = "experimental_backgroundRepeat")
    public void setBackgroundRepeat(g view, ReadableArray backgroundRepeat) {
        AbstractC5504s.h(view, "view");
        if (C7.a.c(view) == 2) {
            if (backgroundRepeat == null || backgroundRepeat.size() <= 0) {
                C3281a.p(view, null);
                return;
            }
            ArrayList arrayList = new ArrayList(backgroundRepeat.size());
            int size = backgroundRepeat.size();
            for (int i10 = 0; i10 < size; i10++) {
                H7.c cVarA = H7.c.f8026c.a(backgroundRepeat.getMap(i10));
                if (cVarA != null) {
                    arrayList.add(cVarA);
                }
            }
            C3281a.p(view, arrayList);
        }
    }

    @B7.a(customType = "BackgroundSize", name = "experimental_backgroundSize")
    public void setBackgroundSize(g view, ReadableArray backgroundSize) {
        AbstractC5504s.h(view, "view");
        if (C7.a.c(view) != 2) {
            C3281a.q(view, null);
            return;
        }
        if (backgroundSize == null || backgroundSize.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(backgroundSize.size());
        int size = backgroundSize.size();
        for (int i10 = 0; i10 < size; i10++) {
            H7.e eVarA = H7.e.f8035a.a(backgroundSize.getDynamic(i10));
            if (eVarA != null) {
                arrayList.add(eVarA);
            }
        }
        C3281a.q(view, arrayList);
    }

    @B7.b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor", "borderStartColor", "borderEndColor", "borderBlockColor", "borderBlockEndColor", "borderBlockStartColor"})
    public void setBorderColor(g view, int index, Integer color) {
        AbstractC5504s.h(view, "view");
        C3281a.r(view, t.f8114a.a(SPACING_TYPES[index]), color);
    }

    @B7.b(names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius", "borderTopStartRadius", "borderTopEndRadius", "borderBottomStartRadius", "borderBottomEndRadius", "borderEndEndRadius", "borderEndStartRadius", "borderStartEndRadius", "borderStartStartRadius"})
    public void setBorderRadius(g view, int index, Dynamic rawBorderRadius) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(rawBorderRadius, "rawBorderRadius");
        C3303t c3303tB = C3303t.a.b(C3303t.f37827c, rawBorderRadius, false, 2, null);
        C3281a.s(view, H7.i.values()[index], (C7.a.c(view) == 2 || c3303tB == null || c3303tB.a() != EnumC3304u.f37833b) ? c3303tB : null);
    }

    @B7.a(name = "borderStyle")
    public void setBorderStyle(g view, String borderStyle) {
        AbstractC5504s.h(view, "view");
        C3281a.t(view, borderStyle == null ? null : k.f8072a.a(borderStyle));
    }

    @B7.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"})
    public void setBorderWidth(g view, int index, float width) {
        AbstractC5504s.h(view, "view");
        C3281a.u(view, t.values()[index], Float.valueOf(width));
    }

    @B7.a(name = "collapsable")
    public void setCollapsable(g view, boolean collapsable) {
        AbstractC5504s.h(view, "view");
    }

    @B7.a(name = "collapsableChildren")
    public void setCollapsableChildren(g view, boolean collapsableChildren) {
        AbstractC5504s.h(view, "view");
    }

    @B7.a(name = "focusable")
    public void setFocusable(final g view, boolean focusable) {
        AbstractC5504s.h(view, "view");
        if (focusable) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.views.view.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ReactViewManager.setFocusable$lambda$2(view, view2);
                }
            });
            view.setFocusable(true);
        } else {
            view.setOnClickListener(null);
            view.setClickable(false);
        }
    }

    @B7.a(name = "hitSlop")
    public void setHitSlop(g view, Dynamic hitSlop) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(hitSlop, "hitSlop");
        int i10 = b.f38479a[hitSlop.getType().ordinal()];
        if (i10 == 1) {
            ReadableMap readableMapAsMap = hitSlop.asMap();
            if (readableMapAsMap == null) {
                view.setHitSlopRect(null);
                return;
            } else {
                view.setHitSlopRect(new Rect(px(readableMapAsMap, "left"), px(readableMapAsMap, "top"), px(readableMapAsMap, "right"), px(readableMapAsMap, "bottom")));
                return;
            }
        }
        if (i10 == 2) {
            int iA = (int) B.f37368a.a(hitSlop.asDouble());
            view.setHitSlopRect(new Rect(iA, iA, iA, iA));
        } else {
            if (i10 == 3) {
                view.setHitSlopRect(null);
                return;
            }
            AbstractC7283a.I("ReactNative", "Invalid type for 'hitSlop' value " + hitSlop.getType());
            view.setHitSlopRect(null);
        }
    }

    @B7.a(name = "nativeBackgroundAndroid")
    public void setNativeBackground(g view, ReadableMap readableMap) {
        Drawable drawableA;
        AbstractC5504s.h(view, "view");
        if (readableMap != null) {
            Context context = view.getContext();
            AbstractC5504s.g(context, "getContext(...)");
            drawableA = d.a(context, readableMap);
        } else {
            drawableA = null;
        }
        C3281a.x(view, drawableA);
    }

    @B7.a(name = "nativeForegroundAndroid")
    public void setNativeForeground(g view, ReadableMap foreground) {
        Drawable drawableA;
        AbstractC5504s.h(view, "view");
        if (foreground != null) {
            Context context = view.getContext();
            AbstractC5504s.g(context, "getContext(...)");
            drawableA = d.a(context, foreground);
        } else {
            drawableA = null;
        }
        view.setForeground(drawableA);
    }

    @B7.a(name = "needsOffscreenAlphaCompositing")
    public void setNeedsOffscreenAlphaCompositing(g view, boolean needsOffscreenAlphaCompositing) {
        AbstractC5504s.h(view, "view");
        view.setNeedsOffscreenAlphaCompositing(needsOffscreenAlphaCompositing);
    }

    @B7.a(name = "overflow")
    public void setOverflow(g view, String overflow) {
        AbstractC5504s.h(view, "view");
        view.setOverflow(overflow);
    }

    @B7.a(name = "pointerEvents")
    public void setPointerEvents(g view, String pointerEventsStr) {
        AbstractC5504s.h(view, "view");
        view.setPointerEvents(C.f37387a.c(pointerEventsStr));
    }

    @B7.a(name = "hasTVPreferredFocus")
    public void setTVPreferredFocus(g view, boolean hasTVPreferredFocus) {
        AbstractC5504s.h(view, "view");
        if (hasTVPreferredFocus) {
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public g createViewInstance(C3284b0 context) {
        AbstractC5504s.h(context, "context");
        return new g(context);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(g view) {
        AbstractC5504s.h(view, "view");
        super.onDropViewInstance(view);
        view.cleanUpAxOrderListener();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public g prepareToRecycleView(C3284b0 reactContext, g view) {
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(view, "view");
        view.setRemoveClippedSubviews(false);
        g gVar = (g) super.prepareToRecycleView(reactContext, view);
        if (gVar != null) {
            gVar.recycleView$ReactAndroid_release();
        }
        return gVar;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setOpacity(g view, float opacity) {
        AbstractC5504s.h(view, "view");
        view.setOpacityIfPossible(opacity);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setTransformProperty(g view, ReadableArray transforms, ReadableArray transformOrigin) {
        AbstractC5504s.h(view, "view");
        super.setTransformProperty(view, transforms, transformOrigin);
        view.setBackfaceVisibilityDependantOpacity();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @InterfaceC2154e
    public void receiveCommand(g root, int commandId, ReadableArray args) {
        AbstractC5504s.h(root, "root");
        if (commandId == 1) {
            handleHotspotUpdate(root, args);
        } else {
            if (commandId != 2) {
                return;
            }
            handleSetPressed(root, args);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(g root, String commandId, ReadableArray args) {
        AbstractC5504s.h(root, "root");
        AbstractC5504s.h(commandId, "commandId");
        switch (commandId.hashCode()) {
            case -1639565984:
                if (commandId.equals("setPressed")) {
                    handleSetPressed(root, args);
                    break;
                }
                break;
            case -399823752:
                if (commandId.equals(HOTSPOT_UPDATE_KEY)) {
                    handleHotspotUpdate(root, args);
                    break;
                }
                break;
            case 3027047:
                if (commandId.equals("blur")) {
                    handleBlur(root);
                    break;
                }
                break;
            case 97604824:
                if (commandId.equals("focus")) {
                    handleFocus(root);
                    break;
                }
                break;
        }
    }

    @InterfaceC2154e
    public void setBorderRadius(g view, int index, float borderRadius) {
        AbstractC5504s.h(view, "view");
        setBorderRadius(view, index, new DynamicFromObject(Float.valueOf(borderRadius)));
    }
}
