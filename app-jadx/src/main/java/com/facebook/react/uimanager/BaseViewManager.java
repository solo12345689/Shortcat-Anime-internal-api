package com.facebook.react.uimanager;

import U6.c;
import android.graphics.Paint;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.AbstractC2747a0;
import com.facebook.react.AbstractC3247l;
import com.facebook.react.AbstractC3250o;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.C3305v;
import com.facebook.react.uimanager.D;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.t;
import com.facebook.react.uimanager.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseViewManager<T extends View, C extends r> extends ViewManager<T, C> implements View.OnLayoutChangeListener {
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    private static final String STATE_BUSY = "busy";
    private static final String STATE_CHECKED = "checked";
    private static final String STATE_EXPANDED = "expanded";
    private static final String STATE_MIXED = "mixed";
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = (float) Math.sqrt(5.0d);
    private static final C3305v.a sMatrixDecompositionContext = new C3305v.a();
    private static final double[] sTransformDecompositionArray = new double[16];

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class a implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a */
        private View.OnFocusChangeListener f37385a;

        public a(View.OnFocusChangeListener onFocusChangeListener) {
            this.f37385a = onFocusChangeListener;
        }

        public void a(View view) {
            view.setOnFocusChangeListener(this);
        }

        public void b(View view) {
            view.setOnFocusChangeListener(this.f37385a);
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            EventDispatcher eventDispatcherC;
            View.OnFocusChangeListener onFocusChangeListener = this.f37385a;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(view, z10);
            }
            int iE = f0.e(view.getContext());
            if (iE == -1 || !(view.getContext() instanceof C3284b0) || (eventDispatcherC = f0.c((C3284b0) view.getContext(), view.getId())) == null) {
                return;
            }
            if (z10) {
                eventDispatcherC.d(new com.facebook.react.uimanager.events.o(iE, view.getId()));
            } else {
                eventDispatcherC.d(new com.facebook.react.uimanager.events.c(iE, view.getId()));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b {
        public static void a(View view, ReadableArray readableArray, Boolean bool) {
            Paint paint;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31) {
                view.setRenderEffect(null);
            }
            if (readableArray == null) {
                paint = null;
            } else if (C3294j.t(readableArray)) {
                paint = new Paint();
                paint.setColorFilter(C3294j.v(readableArray));
            } else {
                if (i10 >= 31) {
                    view.setRenderEffect(C3294j.w(readableArray));
                }
                paint = null;
            }
            if (paint == null) {
                view.setLayerType((bool == null || !bool.booleanValue()) ? 0 : 2, null);
            } else {
                view.setLayerType(2, paint);
            }
        }
    }

    public BaseViewManager() {
        super(null);
    }

    private void logUnsupportedPropertyWarning(String str) {
        AbstractC7283a.K("ReactNative", "%s doesn't support property '%s'", getName(), str);
    }

    private static float sanitizeFloatPropertyValue(float f10) {
        if (f10 >= -3.4028235E38f && f10 <= Float.MAX_VALUE) {
            return f10;
        }
        if (f10 < -3.4028235E38f || f10 == Float.NEGATIVE_INFINITY) {
            return -3.4028235E38f;
        }
        if (f10 > Float.MAX_VALUE || f10 == Float.POSITIVE_INFINITY) {
            return Float.MAX_VALUE;
        }
        if (Float.isNaN(f10)) {
            return 0.0f;
        }
        throw new IllegalStateException("Invalid float property value: " + f10);
    }

    private static void setPointerEventsFlag(View view, t.a aVar, boolean z10) {
        Integer num = (Integer) view.getTag(AbstractC3247l.f36927u);
        int iIntValue = num != null ? num.intValue() : 0;
        int iOrdinal = 1 << aVar.ordinal();
        view.setTag(AbstractC3247l.f36927u, Integer.valueOf(z10 ? iOrdinal | iIntValue : (~iOrdinal) & iIntValue));
    }

    private void updateViewContentDescription(T t10) {
        Dynamic dynamic;
        String str = (String) t10.getTag(AbstractC3247l.f36911e);
        ReadableMap readableMap = (ReadableMap) t10.getTag(AbstractC3247l.f36915i);
        ArrayList arrayList = new ArrayList();
        ReadableMap readableMap2 = (ReadableMap) t10.getTag(AbstractC3247l.f36917k);
        if (str != null) {
            arrayList.add(str);
        }
        if (readableMap != null) {
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                Dynamic dynamic2 = readableMap.getDynamic(strNextKey);
                if (strNextKey.equals(STATE_CHECKED) && dynamic2.getType() == ReadableType.String && dynamic2.asString().equals(STATE_MIXED)) {
                    arrayList.add(t10.getContext().getString(AbstractC3250o.f37119Q));
                } else if (strNextKey.equals(STATE_BUSY) && dynamic2.getType() == ReadableType.Boolean && dynamic2.asBoolean()) {
                    arrayList.add(t10.getContext().getString(AbstractC3250o.f37118P));
                }
            }
        }
        if (readableMap2 != null && readableMap2.hasKey("text") && (dynamic = readableMap2.getDynamic("text")) != null && dynamic.getType() == ReadableType.String) {
            arrayList.add(dynamic.asString());
        }
        if (arrayList.isEmpty()) {
            return;
        }
        t10.setContentDescription(TextUtils.join(", ", arrayList));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected void addEventEmitters(C3284b0 c3284b0, T t10) {
        super.addEventEmitters(c3284b0, t10);
        new a(t10.getOnFocusChangeListener()).a(t10);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        c.a aVarB = U6.c.a().b("topPointerCancel", U6.c.c("phasedRegistrationNames", U6.c.d("bubbled", "onPointerCancel", "captured", "onPointerCancelCapture"))).b("topPointerDown", U6.c.c("phasedRegistrationNames", U6.c.d("bubbled", "onPointerDown", "captured", "onPointerDownCapture")));
        Boolean bool = Boolean.TRUE;
        exportedCustomDirectEventTypeConstants.putAll(aVarB.b("topPointerEnter", U6.c.c("phasedRegistrationNames", U6.c.e("bubbled", "onPointerEnter", "captured", "onPointerEnterCapture", "skipBubbling", bool))).b("topPointerLeave", U6.c.c("phasedRegistrationNames", U6.c.e("bubbled", "onPointerLeave", "captured", "onPointerLeaveCapture", "skipBubbling", bool))).b("topPointerMove", U6.c.c("phasedRegistrationNames", U6.c.d("bubbled", "onPointerMove", "captured", "onPointerMoveCapture"))).b("topPointerUp", U6.c.c("phasedRegistrationNames", U6.c.d("bubbled", "onPointerUp", "captured", "onPointerUpCapture"))).b("topPointerOut", U6.c.c("phasedRegistrationNames", U6.c.d("bubbled", "onPointerOut", "captured", "onPointerOutCapture"))).b("topPointerOver", U6.c.c("phasedRegistrationNames", U6.c.d("bubbled", "onPointerOver", "captured", "onPointerOverCapture"))).b("topClick", U6.c.c("phasedRegistrationNames", U6.c.d("bubbled", "onClick", "captured", "onClickCapture"))).b("topBlur", U6.c.c("phasedRegistrationNames", U6.c.d("bubbled", "onBlur", "captured", "onBlurCapture"))).b("topFocus", U6.c.c("phasedRegistrationNames", U6.c.d("bubbled", "onFocus", "captured", "onFocusCapture"))).a());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(U6.c.a().b("topAccessibilityAction", U6.c.c("registrationName", "onAccessibilityAction")).a());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected void onAfterUpdateTransaction(T t10) {
        super.onAfterUpdateTransaction(t10);
        updateViewAccessibility(t10);
        Boolean bool = (Boolean) t10.getTag(AbstractC3247l.f36923q);
        if (bool != null && bool.booleanValue()) {
            t10.addOnLayoutChangeListener(this);
            setTransformProperty(t10, (ReadableArray) t10.getTag(AbstractC3247l.f36902C), (ReadableArray) t10.getTag(AbstractC3247l.f36903D));
            t10.setTag(AbstractC3247l.f36923q, Boolean.FALSE);
        }
        b.a(t10, (ReadableArray) t10.getTag(AbstractC3247l.f36921o), (Boolean) t10.getTag(AbstractC3247l.f36904E));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(T t10) {
        super.onDropViewInstance(t10);
        View.OnFocusChangeListener onFocusChangeListener = t10.getOnFocusChangeListener();
        if (onFocusChangeListener instanceof a) {
            ((a) onFocusChangeListener).b(t10);
        }
        if (t10 instanceof ViewGroup) {
            ((ViewGroup) t10).setOnHierarchyChangeListener(null);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = i16 - i14;
        int i19 = i12 - i10;
        if (i13 - i11 == i17 - i15 && i19 == i18) {
            return;
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(AbstractC3247l.f36903D);
        ReadableArray readableArray2 = (ReadableArray) view.getTag(AbstractC3247l.f36902C);
        if (readableArray2 == null && readableArray == null) {
            return;
        }
        setTransformProperty(view, readableArray2, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected T prepareToRecycleView(C3284b0 c3284b0, T t10) {
        t10.setTag(null);
        t10.setTag(AbstractC3247l.f36927u, null);
        t10.setTag(AbstractC3247l.f36928v, null);
        t10.setTag(AbstractC3247l.f36906G, null);
        t10.setTag(AbstractC3247l.f36924r, null);
        t10.setTag(AbstractC3247l.f36911e, null);
        t10.setTag(AbstractC3247l.f36910d, null);
        t10.setTag(AbstractC3247l.f36914h, null);
        t10.setTag(AbstractC3247l.f36915i, null);
        t10.setTag(AbstractC3247l.f36907a, null);
        t10.setTag(AbstractC3247l.f36917k, null);
        t10.setTag(AbstractC3247l.f36916j, null);
        t10.setTag(AbstractC3247l.f36905F, null);
        setTransformProperty(t10, null, null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 28) {
            return null;
        }
        t10.resetPivot();
        t10.setTop(0);
        t10.setBottom(0);
        t10.setLeft(0);
        t10.setRight(0);
        t10.setElevation(0.0f);
        if (i10 >= 29) {
            t10.setAnimationMatrix(null);
        }
        t10.setTag(AbstractC3247l.f36902C, null);
        t10.setTag(AbstractC3247l.f36903D, null);
        t10.setTag(AbstractC3247l.f36923q, null);
        t10.removeOnLayoutChangeListener(this);
        t10.setTag(AbstractC3247l.f36904E, null);
        t10.setTag(AbstractC3247l.f36921o, null);
        t10.setTag(AbstractC3247l.f36925s, null);
        b.a(t10, null, null);
        if (i10 >= 28) {
            t10.setOutlineAmbientShadowColor(-16777216);
            t10.setOutlineSpotShadowColor(-16777216);
        }
        t10.setNextFocusDownId(-1);
        t10.setNextFocusForwardId(-1);
        t10.setNextFocusRightId(-1);
        t10.setNextFocusUpId(-1);
        t10.setFocusable(false);
        t10.setFocusableInTouchMode(false);
        t10.setElevation(0.0f);
        t10.setAlpha(1.0f);
        setPadding(t10, 0, 0, 0, 0);
        t10.setForeground(null);
        return t10;
    }

    @B7.a(name = "accessibilityActions")
    public void setAccessibilityActions(T t10, ReadableArray readableArray) {
        if (readableArray == null) {
            return;
        }
        t10.setTag(AbstractC3247l.f36907a, readableArray);
    }

    @B7.a(name = "accessibilityCollection")
    public void setAccessibilityCollection(T t10, ReadableMap readableMap) {
        t10.setTag(AbstractC3247l.f36908b, readableMap);
    }

    @B7.a(name = "accessibilityCollectionItem")
    public void setAccessibilityCollectionItem(T t10, ReadableMap readableMap) {
        t10.setTag(AbstractC3247l.f36909c, readableMap);
    }

    @B7.a(name = "accessibilityHint")
    public void setAccessibilityHint(T t10, String str) {
        t10.setTag(AbstractC3247l.f36910d, str);
        updateViewContentDescription(t10);
    }

    @B7.a(name = "accessibilityLabel")
    public void setAccessibilityLabel(T t10, String str) {
        t10.setTag(AbstractC3247l.f36911e, str);
        updateViewContentDescription(t10);
    }

    @B7.a(name = "accessibilityLabelledBy")
    public void setAccessibilityLabelledBy(T t10, Dynamic dynamic) {
        if (dynamic.isNull()) {
            return;
        }
        if (dynamic.getType() == ReadableType.String) {
            t10.setTag(AbstractC3247l.f36924r, dynamic.asString());
        } else if (dynamic.getType() == ReadableType.Array) {
            t10.setTag(AbstractC3247l.f36924r, dynamic.asArray().getString(0));
        }
    }

    @B7.a(name = "accessibilityLiveRegion")
    public void setAccessibilityLiveRegion(T t10, String str) {
        if (str == null || str.equals("none")) {
            AbstractC2747a0.m0(t10, 0);
        } else if (str.equals("polite")) {
            AbstractC2747a0.m0(t10, 1);
        } else if (str.equals("assertive")) {
            AbstractC2747a0.m0(t10, 2);
        }
    }

    @B7.a(name = "accessibilityRole")
    public void setAccessibilityRole(T t10, String str) {
        if (str == null) {
            t10.setTag(AbstractC3247l.f36914h, null);
        } else {
            t10.setTag(AbstractC3247l.f36914h, D.b.b(str));
        }
    }

    @B7.a(name = "accessibilityValue")
    public void setAccessibilityValue(T t10, ReadableMap readableMap) {
        if (readableMap == null) {
            t10.setTag(AbstractC3247l.f36917k, null);
            t10.setContentDescription(null);
        } else {
            t10.setTag(AbstractC3247l.f36917k, readableMap);
            if (readableMap.hasKey("text")) {
                updateViewContentDescription(t10);
            }
        }
    }

    @B7.a(customType = "Color", defaultInt = 0, name = "backgroundColor")
    public void setBackgroundColor(T t10, int i10) {
        C3281a.m(t10, Integer.valueOf(i10));
    }

    public void setBorderBottomLeftRadius(T t10, float f10) {
        logUnsupportedPropertyWarning("borderBottomLeftRadius");
    }

    public void setBorderBottomRightRadius(T t10, float f10) {
        logUnsupportedPropertyWarning("borderBottomRightRadius");
    }

    public void setBorderRadius(T t10, float f10) {
        logUnsupportedPropertyWarning("borderRadius");
    }

    public void setBorderTopLeftRadius(T t10, float f10) {
        logUnsupportedPropertyWarning("borderTopLeftRadius");
    }

    public void setBorderTopRightRadius(T t10, float f10) {
        logUnsupportedPropertyWarning("borderTopRightRadius");
    }

    @B7.a(customType = "BoxShadow", name = "boxShadow")
    public void setBoxShadow(T t10, ReadableArray readableArray) {
        C3281a.v(t10, readableArray);
    }

    @B7.a(name = "onClick")
    public void setClick(T t10, boolean z10) {
        setPointerEventsFlag(t10, t.a.f37650c, z10);
    }

    @B7.a(name = "onClickCapture")
    public void setClickCapture(T t10, boolean z10) {
        setPointerEventsFlag(t10, t.a.f37651d, z10);
    }

    @B7.a(name = "elevation")
    public void setElevation(T t10, float f10) {
        AbstractC2747a0.r0(t10, B.i(f10));
    }

    @B7.a(customType = "Filter", name = "filter")
    public void setFilter(T t10, ReadableArray readableArray) {
        if (C7.a.c(t10) == 2) {
            t10.setTag(AbstractC3247l.f36921o, readableArray);
        }
    }

    @B7.a(name = "importantForAccessibility")
    public void setImportantForAccessibility(T t10, String str) {
        if (str == null || str.equals("auto")) {
            AbstractC2747a0.s0(t10, 0);
            return;
        }
        if (str.equals("yes")) {
            AbstractC2747a0.s0(t10, 1);
        } else if (str.equals("no")) {
            AbstractC2747a0.s0(t10, 2);
        } else if (str.equals("no-hide-descendants")) {
            AbstractC2747a0.s0(t10, 4);
        }
    }

    @B7.a(name = "mixBlendMode")
    public void setMixBlendMode(T t10, String str) {
        if (C7.a.c(t10) == 2) {
            t10.setTag(AbstractC3247l.f36925s, C3287d.b(str));
            if (t10.getParent() instanceof View) {
                ((View) t10.getParent()).invalidate();
            }
        }
    }

    @B7.a(name = "nativeID")
    public void setNativeId(T t10, String str) {
        t10.setTag(AbstractC3247l.f36906G, str);
        I7.a.c(t10);
    }

    @B7.a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(T t10, float f10) {
        t10.setAlpha(f10);
    }

    @B7.a(customType = "Color", name = "outlineColor")
    public void setOutlineColor(T t10, Integer num) {
        C3281a.y(t10, num);
    }

    @B7.a(name = "outlineOffset")
    public void setOutlineOffset(T t10, float f10) {
        C3281a.z(t10, f10);
    }

    @B7.a(name = "outlineStyle")
    public void setOutlineStyle(T t10, String str) {
        C3281a.A(t10, str == null ? null : H7.u.b(str));
    }

    @B7.a(name = "outlineWidth")
    public void setOutlineWidth(T t10, float f10) {
        C3281a.B(t10, f10);
    }

    @B7.a(name = "onPointerEnter")
    public void setPointerEnter(T t10, boolean z10) {
        setPointerEventsFlag(t10, t.a.f37654g, z10);
    }

    @B7.a(name = "onPointerEnterCapture")
    public void setPointerEnterCapture(T t10, boolean z10) {
        setPointerEventsFlag(t10, t.a.f37655h, z10);
    }

    @B7.a(name = "onPointerLeave")
    public void setPointerLeave(T t10, boolean z10) {
        setPointerEventsFlag(t10, t.a.f37656i, z10);
    }

    @B7.a(name = "onPointerLeaveCapture")
    public void setPointerLeaveCapture(T t10, boolean z10) {
        setPointerEventsFlag(t10, t.a.f37657j, z10);
    }

    @B7.a(name = "onPointerMove")
    public void setPointerMove(T t10, boolean z10) {
        setPointerEventsFlag(t10, t.a.f37658k, z10);
    }

    @B7.a(name = "onPointerMoveCapture")
    public void setPointerMoveCapture(T t10, boolean z10) {
        setPointerEventsFlag(t10, t.a.f37659l, z10);
    }

    @B7.a(name = "onPointerOut")
    public void setPointerOut(T t10, boolean z10) {
        setPointerEventsFlag(t10, t.a.f37662o, z10);
    }

    @B7.a(name = "onPointerOutCapture")
    public void setPointerOutCapture(T t10, boolean z10) {
        setPointerEventsFlag(t10, t.a.f37663p, z10);
    }

    @B7.a(name = "onPointerOver")
    public void setPointerOver(T t10, boolean z10) {
        setPointerEventsFlag(t10, t.a.f37664q, z10);
    }

    @B7.a(name = "onPointerOverCapture")
    public void setPointerOverCapture(T t10, boolean z10) {
        setPointerEventsFlag(t10, t.a.f37665r, z10);
    }

    @B7.a(name = "renderToHardwareTextureAndroid")
    public void setRenderToHardwareTexture(T t10, boolean z10) {
        t10.setTag(AbstractC3247l.f36904E, Boolean.valueOf(z10));
    }

    @B7.a(name = "role")
    public void setRole(T t10, String str) {
        if (str == null) {
            t10.setTag(AbstractC3247l.f36901B, null);
        } else {
            t10.setTag(AbstractC3247l.f36901B, D.d.b(str));
        }
    }

    @B7.a(name = "rotation")
    @Deprecated
    public void setRotation(T t10, float f10) {
        t10.setRotation(f10);
    }

    @B7.a(defaultFloat = 1.0f, name = "scaleX")
    @Deprecated
    public void setScaleX(T t10, float f10) {
        t10.setScaleX(f10);
    }

    @B7.a(defaultFloat = 1.0f, name = "scaleY")
    @Deprecated
    public void setScaleY(T t10, float f10) {
        t10.setScaleY(f10);
    }

    @B7.a(name = "screenReaderFocusable")
    public void setScreenReaderFocusable(T t10, boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            t10.setScreenReaderFocusable(z10);
        }
    }

    @B7.a(customType = "Color", defaultInt = -16777216, name = "shadowColor")
    public void setShadowColor(T t10, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            t10.setOutlineAmbientShadowColor(i10);
            t10.setOutlineSpotShadowColor(i10);
        }
    }

    @B7.a(name = "testID")
    public void setTestId(T t10, String str) {
        t10.setTag(AbstractC3247l.f36928v, str);
        t10.setTag(str);
    }

    @B7.a(name = "transform")
    public void setTransform(T t10, ReadableArray readableArray) {
        if (Objects.equals((ReadableArray) t10.getTag(AbstractC3247l.f36902C), readableArray)) {
            return;
        }
        t10.setTag(AbstractC3247l.f36902C, readableArray);
        t10.setTag(AbstractC3247l.f36923q, Boolean.TRUE);
    }

    @B7.a(name = "transformOrigin")
    public void setTransformOrigin(T t10, ReadableArray readableArray) {
        if (Objects.equals((ReadableArray) t10.getTag(AbstractC3247l.f36903D), readableArray)) {
            return;
        }
        t10.setTag(AbstractC3247l.f36903D, readableArray);
        t10.setTag(AbstractC3247l.f36923q, Boolean.TRUE);
    }

    protected void setTransformProperty(T t10, ReadableArray readableArray, ReadableArray readableArray2) {
        if (readableArray == null) {
            t10.setTranslationX(B.i(0.0f));
            t10.setTranslationY(B.i(0.0f));
            t10.setRotation(0.0f);
            t10.setRotationX(0.0f);
            t10.setRotationY(0.0f);
            t10.setScaleX(1.0f);
            t10.setScaleY(1.0f);
            t10.setCameraDistance(0.0f);
            return;
        }
        boolean z10 = C7.a.c(t10) == 2;
        C3305v.a aVar = sMatrixDecompositionContext;
        aVar.a();
        double[] dArr = sTransformDecompositionArray;
        TransformHelper.d(readableArray, dArr, B.g(t10.getWidth()), B.g(t10.getHeight()), readableArray2, z10);
        C3305v.k(dArr, aVar);
        t10.setTranslationX(B.i(sanitizeFloatPropertyValue((float) aVar.f37842d[0])));
        t10.setTranslationY(B.i(sanitizeFloatPropertyValue((float) aVar.f37842d[1])));
        t10.setRotation(sanitizeFloatPropertyValue((float) aVar.f37843e[2]));
        t10.setRotationX(sanitizeFloatPropertyValue((float) aVar.f37843e[0]));
        t10.setRotationY(sanitizeFloatPropertyValue((float) aVar.f37843e[1]));
        t10.setScaleX(sanitizeFloatPropertyValue((float) aVar.f37840b[0]));
        t10.setScaleY(sanitizeFloatPropertyValue((float) aVar.f37840b[1]));
        double[] dArr2 = aVar.f37839a;
        if (dArr2.length > 2) {
            float f10 = (float) dArr2[2];
            if (f10 == 0.0f) {
                f10 = 7.8125E-4f;
            }
            float f11 = (-1.0f) / f10;
            float f12 = C3289e.e().density;
            t10.setCameraDistance(sanitizeFloatPropertyValue(f12 * f12 * f11 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        }
    }

    @B7.a(defaultFloat = 0.0f, name = "translateX")
    @Deprecated
    public void setTranslateX(T t10, float f10) {
        t10.setTranslationX(B.i(f10));
    }

    @B7.a(defaultFloat = 0.0f, name = "translateY")
    @Deprecated
    public void setTranslateY(T t10, float f10) {
        t10.setTranslationY(B.i(f10));
    }

    @B7.a(name = "accessibilityState")
    public void setViewState(T t10, ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        if (readableMap.hasKey(STATE_EXPANDED)) {
            t10.setTag(AbstractC3247l.f36916j, Boolean.valueOf(readableMap.getBoolean(STATE_EXPANDED)));
        }
        if (readableMap.hasKey("selected")) {
            boolean zIsSelected = t10.isSelected();
            boolean z10 = readableMap.getBoolean("selected");
            t10.setSelected(z10);
            if (t10.isAccessibilityFocused() && zIsSelected && !z10) {
                t10.announceForAccessibility(t10.getContext().getString(AbstractC3250o.f37120R));
            }
        } else {
            t10.setSelected(false);
        }
        t10.setTag(AbstractC3247l.f36915i, readableMap);
        if (readableMap.hasKey("disabled") && !readableMap.getBoolean("disabled")) {
            t10.setEnabled(true);
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            if (strNextKey.equals(STATE_BUSY) || strNextKey.equals(STATE_EXPANDED) || (strNextKey.equals(STATE_CHECKED) && readableMap.getType(STATE_CHECKED) == ReadableType.String)) {
                updateViewContentDescription(t10);
                return;
            } else if (t10.isAccessibilityFocused()) {
                t10.sendAccessibilityEvent(1);
            }
        }
    }

    @B7.a(name = "zIndex")
    public void setZIndex(T t10, float f10) {
        ViewGroupManager.setViewZIndex(t10, Math.round(f10));
        ViewParent parent = t10.getParent();
        if (parent instanceof U) {
            ((U) parent).updateDrawingOrder();
        }
    }

    protected void updateViewAccessibility(T t10) {
        D.Y(t10, t10.isFocusable(), t10.getImportantForAccessibility());
    }

    public BaseViewManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @B7.a(name = "onMoveShouldSetResponder")
    public void setMoveShouldSetResponder(T t10, boolean z10) {
    }

    @B7.a(name = "onMoveShouldSetResponderCapture")
    public void setMoveShouldSetResponderCapture(T t10, boolean z10) {
    }

    @B7.a(name = "onResponderEnd")
    public void setResponderEnd(T t10, boolean z10) {
    }

    @B7.a(name = "onResponderGrant")
    public void setResponderGrant(T t10, boolean z10) {
    }

    @B7.a(name = "onResponderMove")
    public void setResponderMove(T t10, boolean z10) {
    }

    @B7.a(name = "onResponderReject")
    public void setResponderReject(T t10, boolean z10) {
    }

    @B7.a(name = "onResponderRelease")
    public void setResponderRelease(T t10, boolean z10) {
    }

    @B7.a(name = "onResponderStart")
    public void setResponderStart(T t10, boolean z10) {
    }

    @B7.a(name = "onResponderTerminate")
    public void setResponderTerminate(T t10, boolean z10) {
    }

    @B7.a(name = "onResponderTerminationRequest")
    public void setResponderTerminationRequest(T t10, boolean z10) {
    }

    @B7.a(name = "onShouldBlockNativeResponder")
    public void setShouldBlockNativeResponder(T t10, boolean z10) {
    }

    @B7.a(name = "onStartShouldSetResponder")
    public void setStartShouldSetResponder(T t10, boolean z10) {
    }

    @B7.a(name = "onStartShouldSetResponderCapture")
    public void setStartShouldSetResponderCapture(T t10, boolean z10) {
    }

    @B7.a(name = "onTouchCancel")
    public void setTouchCancel(T t10, boolean z10) {
    }

    @B7.a(name = "onTouchEnd")
    public void setTouchEnd(T t10, boolean z10) {
    }

    @B7.a(name = "onTouchMove")
    public void setTouchMove(T t10, boolean z10) {
    }

    @B7.a(name = "onTouchStart")
    public void setTouchStart(T t10, boolean z10) {
    }
}
