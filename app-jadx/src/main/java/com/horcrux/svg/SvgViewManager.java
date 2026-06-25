package com.horcrux.svg;

import K7.Q0;
import K7.R0;
import android.graphics.Rect;
import android.util.SparseArray;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.q0;
import com.facebook.react.views.view.ReactViewManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class SvgViewManager extends ReactViewManager implements R0 {
    public static final String REACT_CLASS = "RNSVGSvgViewAndroid";
    private final q0 mDelegate = new Q0(this);
    private static final SparseArray<SvgView> mTagToSvgView = new SparseArray<>();
    private static final SparseArray<Runnable> mTagToRunnable = new SparseArray<>();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f43689a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f43689a = iArr;
            try {
                iArr[ReadableType.Map.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43689a[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43689a[ReadableType.Null.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static SvgView getSvgViewByTag(int i10) {
        return mTagToSvgView.get(i10);
    }

    static void runWhenViewIsAvailable(int i10, Runnable runnable) {
        mTagToRunnable.put(i10, runnable);
    }

    static void setSvgView(int i10, SvgView svgView) {
        mTagToSvgView.put(i10, svgView);
        SparseArray<Runnable> sparseArray = mTagToRunnable;
        Runnable runnable = sparseArray.get(i10);
        if (runnable != null) {
            runnable.run();
            sparseArray.delete(i10);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* JADX INFO: renamed from: getDelegate */
    protected q0 getMDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3298n
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.view.g createViewInstance(C3284b0 c3284b0) {
        return new SvgView(c3284b0);
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(com.facebook.react.views.view.g gVar) {
        super.onDropViewInstance(gVar);
        mTagToSvgView.remove(gVar.getId());
    }

    @Override // K7.R0
    public void setAccessible(SvgView svgView, boolean z10) {
        super.setAccessible((com.facebook.react.views.view.g) svgView, z10);
    }

    @Override // K7.R0
    @B7.a(name = "align")
    public void setAlign(SvgView svgView, String str) {
        svgView.setAlign(str);
    }

    @Override // K7.R0
    public void setBackfaceVisibility(SvgView svgView, String str) {
        super.setBackfaceVisibility((com.facebook.react.views.view.g) svgView, str);
    }

    @Override // K7.R0
    @B7.a(name = "bbHeight")
    public void setBbHeight(SvgView svgView, Dynamic dynamic) {
        svgView.setBbHeight(dynamic);
    }

    @Override // K7.R0
    @B7.a(name = "bbWidth")
    public void setBbWidth(SvgView svgView, Dynamic dynamic) {
        svgView.setBbWidth(dynamic);
    }

    @Override // K7.R0
    public void setBorderBlockColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 9, num);
    }

    @Override // K7.R0
    public void setBorderBlockEndColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 10, num);
    }

    @Override // K7.R0
    public void setBorderBlockStartColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 11, num);
    }

    @Override // K7.R0
    public void setBorderBottomColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 4, num);
    }

    @Override // K7.R0
    public void setBorderBottomEndRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 8, dynamic);
    }

    @Override // K7.R0
    public void setBorderBottomLeftRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 4, dynamic);
    }

    @Override // K7.R0
    public void setBorderBottomRightRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 3, dynamic);
    }

    @Override // K7.R0
    public void setBorderBottomStartRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 7, dynamic);
    }

    @Override // K7.R0
    public void setBorderColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 0, num);
    }

    @Override // K7.R0
    public void setBorderEndColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 6, num);
    }

    @Override // K7.R0
    public void setBorderEndEndRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 9, dynamic);
    }

    @Override // K7.R0
    public void setBorderEndStartRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 10, dynamic);
    }

    @Override // K7.R0
    public void setBorderLeftColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 1, num);
    }

    @Override // K7.R0
    public void setBorderRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 0, dynamic);
    }

    @Override // K7.R0
    public void setBorderRightColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 2, num);
    }

    @Override // K7.R0
    public void setBorderStartColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 5, num);
    }

    @Override // K7.R0
    public void setBorderStartEndRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 11, dynamic);
    }

    @Override // K7.R0
    public void setBorderStartStartRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 12, dynamic);
    }

    @Override // K7.R0
    public void setBorderStyle(SvgView svgView, String str) {
        super.setBorderStyle((com.facebook.react.views.view.g) svgView, str);
    }

    @Override // K7.R0
    public void setBorderTopColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 3, num);
    }

    @Override // K7.R0
    public void setBorderTopEndRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 6, dynamic);
    }

    @Override // K7.R0
    public void setBorderTopLeftRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 1, dynamic);
    }

    @Override // K7.R0
    public void setBorderTopRightRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 2, dynamic);
    }

    @Override // K7.R0
    public void setBorderTopStartRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 5, dynamic);
    }

    @Override // K7.R0
    @B7.a(customType = "Color", name = "color")
    public void setColor(SvgView svgView, Integer num) {
        svgView.setCurrentColor(num);
    }

    @Override // K7.R0
    public void setFocusable(SvgView svgView, boolean z10) {
        super.setFocusable((com.facebook.react.views.view.g) svgView, z10);
    }

    @Override // K7.R0
    public void setHasTVPreferredFocus(SvgView svgView, boolean z10) {
        super.setTVPreferredFocus(svgView, z10);
    }

    @Override // K7.R0
    public void setHitSlop(SvgView svgView, Dynamic dynamic) {
        int i10 = a.f43689a[dynamic.getType().ordinal()];
        if (i10 == 1) {
            ReadableMap readableMapAsMap = dynamic.asMap();
            svgView.setHitSlopRect(new Rect(readableMapAsMap.hasKey("left") ? (int) com.facebook.react.uimanager.B.h(readableMapAsMap.getDouble("left")) : 0, readableMapAsMap.hasKey("top") ? (int) com.facebook.react.uimanager.B.h(readableMapAsMap.getDouble("top")) : 0, readableMapAsMap.hasKey("right") ? (int) com.facebook.react.uimanager.B.h(readableMapAsMap.getDouble("right")) : 0, readableMapAsMap.hasKey("bottom") ? (int) com.facebook.react.uimanager.B.h(readableMapAsMap.getDouble("bottom")) : 0));
        } else {
            if (i10 == 2) {
                int iH = (int) com.facebook.react.uimanager.B.h(dynamic.asDouble());
                svgView.setHitSlopRect(new Rect(iH, iH, iH, iH));
                return;
            }
            if (i10 != 3) {
                AbstractC7283a.I("ReactNative", "Invalid type for 'hitSlop' value " + dynamic.getType());
            }
            svgView.setHitSlopRect(null);
        }
    }

    @Override // K7.R0
    @B7.a(name = "meetOrSlice")
    public void setMeetOrSlice(SvgView svgView, int i10) {
        svgView.setMeetOrSlice(i10);
    }

    @Override // K7.R0
    @B7.a(name = "minX")
    public void setMinX(SvgView svgView, float f10) {
        svgView.setMinX(f10);
    }

    @Override // K7.R0
    @B7.a(name = "minY")
    public void setMinY(SvgView svgView, float f10) {
        svgView.setMinY(f10);
    }

    @Override // K7.R0
    public void setNativeBackgroundAndroid(SvgView svgView, ReadableMap readableMap) {
        super.setNativeBackground(svgView, readableMap);
    }

    @Override // K7.R0
    public void setNativeForegroundAndroid(SvgView svgView, ReadableMap readableMap) {
        super.setNativeForeground(svgView, readableMap);
    }

    @Override // K7.R0
    public void setNeedsOffscreenAlphaCompositing(SvgView svgView, boolean z10) {
        super.setNeedsOffscreenAlphaCompositing((com.facebook.react.views.view.g) svgView, z10);
    }

    @Override // K7.R0
    public void setNextFocusDown(SvgView svgView, int i10) {
        super.nextFocusDown(svgView, i10);
    }

    @Override // K7.R0
    public void setNextFocusForward(SvgView svgView, int i10) {
        super.nextFocusForward(svgView, i10);
    }

    @Override // K7.R0
    public void setNextFocusLeft(SvgView svgView, int i10) {
        super.nextFocusLeft(svgView, i10);
    }

    @Override // K7.R0
    public void setNextFocusRight(SvgView svgView, int i10) {
        super.nextFocusRight(svgView, i10);
    }

    @Override // K7.R0
    public void setNextFocusUp(SvgView svgView, int i10) {
        super.nextFocusUp(svgView, i10);
    }

    @Override // K7.R0
    @B7.a(name = "pointerEvents")
    public void setPointerEvents(SvgView svgView, String str) {
        try {
            Class<? super Object> superclass = svgView.getClass().getSuperclass();
            if (superclass != null) {
                Method declaredMethod = superclass.getDeclaredMethod("setPointerEvents", com.facebook.react.uimanager.C.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(svgView, com.facebook.react.uimanager.C.valueOf(str.toUpperCase(Locale.US).replace("-", "_")));
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            e10.printStackTrace();
        }
    }

    @Override // K7.R0
    public void setRemoveClippedSubviews(SvgView svgView, boolean z10) {
        super.setRemoveClippedSubviews(svgView, z10);
    }

    @Override // K7.R0
    @B7.a(name = "vbHeight")
    public void setVbHeight(SvgView svgView, float f10) {
        svgView.setVbHeight(f10);
    }

    @Override // K7.R0
    @B7.a(name = "vbWidth")
    public void setVbWidth(SvgView svgView, float f10) {
        svgView.setVbWidth(f10);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(com.facebook.react.views.view.g gVar, Object obj) {
        super.updateExtraData(gVar, obj);
        gVar.invalidate();
    }
}
