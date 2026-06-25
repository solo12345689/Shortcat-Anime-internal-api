package com.horcrux.svg;

import android.graphics.Matrix;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.C3289e;
import com.facebook.react.uimanager.C3305v;
import com.facebook.react.uimanager.TransformHelper;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.q0;
import com.horcrux.svg.VirtualView;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class VirtualViewManager<V extends VirtualView> extends ViewGroupManager<VirtualView> {
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = 5.0f;
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    protected final String mClassName;
    protected q0 mDelegate;
    protected final SVGClass svgClass;
    private static final C3305v.a sMatrixDecompositionContext = new C3305v.a();
    private static final double[] sTransformDecompositionArray = new double[16];
    private static final SparseArray<RenderableView> mTagToRenderableView = new SparseArray<>();
    private static final SparseArray<Runnable> mTagToRunnable = new SparseArray<>();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    protected enum SVGClass {
        RNSVGGroup,
        RNSVGPath,
        RNSVGText,
        RNSVGTSpan,
        RNSVGTextPath,
        RNSVGImage,
        RNSVGCircle,
        RNSVGEllipse,
        RNSVGLine,
        RNSVGRect,
        RNSVGClipPath,
        RNSVGDefs,
        RNSVGUse,
        RNSVGSymbol,
        RNSVGLinearGradient,
        RNSVGRadialGradient,
        RNSVGPattern,
        RNSVGMask,
        RNSVGFilter,
        RNSVGFeBlend,
        RNSVGFeColorMatrix,
        RNSVGFeComposite,
        RNSVGFeFlood,
        RNSVGFeGaussianBlur,
        RNSVGFeMerge,
        RNSVGFeOffset,
        RNSVGMarker,
        RNSVGForeignObject
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements ViewGroup.OnHierarchyChangeListener {
        a() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view instanceof VirtualView) {
                VirtualViewManager.this.invalidateSvgView((VirtualView) view);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view instanceof VirtualView) {
                VirtualViewManager.this.invalidateSvgView((VirtualView) view);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f43705a;

        static {
            int[] iArr = new int[SVGClass.values().length];
            f43705a = iArr;
            try {
                iArr[SVGClass.RNSVGGroup.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43705a[SVGClass.RNSVGPath.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43705a[SVGClass.RNSVGCircle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43705a[SVGClass.RNSVGEllipse.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43705a[SVGClass.RNSVGLine.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f43705a[SVGClass.RNSVGRect.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f43705a[SVGClass.RNSVGText.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f43705a[SVGClass.RNSVGTSpan.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f43705a[SVGClass.RNSVGTextPath.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f43705a[SVGClass.RNSVGImage.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f43705a[SVGClass.RNSVGClipPath.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f43705a[SVGClass.RNSVGDefs.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f43705a[SVGClass.RNSVGUse.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f43705a[SVGClass.RNSVGSymbol.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f43705a[SVGClass.RNSVGLinearGradient.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f43705a[SVGClass.RNSVGRadialGradient.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f43705a[SVGClass.RNSVGPattern.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f43705a[SVGClass.RNSVGMask.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f43705a[SVGClass.RNSVGFilter.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f43705a[SVGClass.RNSVGFeBlend.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f43705a[SVGClass.RNSVGFeColorMatrix.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f43705a[SVGClass.RNSVGFeComposite.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f43705a[SVGClass.RNSVGFeFlood.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f43705a[SVGClass.RNSVGFeGaussianBlur.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f43705a[SVGClass.RNSVGFeMerge.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f43705a[SVGClass.RNSVGFeOffset.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f43705a[SVGClass.RNSVGMarker.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f43705a[SVGClass.RNSVGForeignObject.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
        }
    }

    protected VirtualViewManager(SVGClass sVGClass) {
        this.svgClass = sVGClass;
        this.mClassName = sVGClass.toString();
    }

    static RenderableView getRenderableViewByTag(int i10) {
        return mTagToRenderableView.get(i10);
    }

    public void invalidateSvgView(V v10) {
        SvgView svgView = v10.getSvgView();
        if (svgView != null) {
            svgView.invalidate();
        }
        if (v10 instanceof l0) {
            ((l0) v10).R().clearChildCache();
        }
    }

    static void runWhenViewIsAvailable(int i10, Runnable runnable) {
        mTagToRunnable.put(i10, runnable);
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

    static void setRenderableView(int i10, RenderableView renderableView) {
        mTagToRenderableView.put(i10, renderableView);
        SparseArray<Runnable> sparseArray = mTagToRunnable;
        Runnable runnable = sparseArray.get(i10);
        if (runnable != null) {
            runnable.run();
            sparseArray.delete(i10);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected q0 getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return this.mClassName;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends com.facebook.react.uimanager.r> getShadowNodeClass() {
        return c.class;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @B7.a(name = "clipPath")
    public void setClipPath(V v10, String str) {
        v10.setClipPath(str);
    }

    @B7.a(name = "clipRule")
    public void setClipRule(V v10, int i10) {
        v10.setClipRule(i10);
    }

    @B7.a(name = "display")
    public void setDisplay(V v10, String str) {
        v10.setDisplay(str);
    }

    @B7.a(name = "markerEnd")
    public void setMarkerEnd(V v10, String str) {
        v10.setMarkerEnd(str);
    }

    @B7.a(name = "markerMid")
    public void setMarkerMid(V v10, String str) {
        v10.setMarkerMid(str);
    }

    @B7.a(name = "markerStart")
    public void setMarkerStart(V v10, String str) {
        v10.setMarkerStart(str);
    }

    @B7.a(name = "mask")
    public void setMask(V v10, String str) {
        v10.setMask(str);
    }

    @B7.a(name = "matrix")
    public void setMatrix(V v10, Dynamic dynamic) {
        v10.setMatrix(dynamic);
    }

    @B7.a(name = "name")
    public void setName(V v10, String str) {
        v10.setName(str);
    }

    @B7.a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(V v10, float f10) {
        v10.setOpacity(f10);
    }

    @B7.a(name = "pointerEvents")
    public void setPointerEvents(V v10, String str) {
        if (str == null) {
            v10.setPointerEvents(com.facebook.react.uimanager.C.f37391e);
        } else {
            v10.setPointerEvents(com.facebook.react.uimanager.C.valueOf(str.toUpperCase(Locale.US).replace("-", "_")));
        }
    }

    @B7.a(name = "responsible")
    public void setResponsible(V v10, boolean z10) {
        v10.setResponsible(z10);
    }

    protected void setTransformProperty(VirtualView virtualView, ReadableArray readableArray) {
        if (readableArray == null) {
            virtualView.setTranslationX(com.facebook.react.uimanager.B.i(0.0f));
            virtualView.setTranslationY(com.facebook.react.uimanager.B.i(0.0f));
            virtualView.setRotation(0.0f);
            virtualView.setRotationX(0.0f);
            virtualView.setRotationY(0.0f);
            virtualView.setScaleX(1.0f);
            virtualView.setScaleY(1.0f);
            virtualView.setCameraDistance(0.0f);
            return;
        }
        C3305v.a aVar = sMatrixDecompositionContext;
        aVar.a();
        double[] dArr = sTransformDecompositionArray;
        TransformHelper.d(readableArray, dArr, virtualView.getWidth(), virtualView.getHeight(), null, false);
        C3305v.k(dArr, aVar);
        virtualView.setTranslationX(com.facebook.react.uimanager.B.i(sanitizeFloatPropertyValue((float) aVar.f37842d[0])));
        virtualView.setTranslationY(com.facebook.react.uimanager.B.i(sanitizeFloatPropertyValue((float) aVar.f37842d[1])));
        virtualView.setRotation(sanitizeFloatPropertyValue((float) aVar.f37843e[2]));
        virtualView.setRotationX(sanitizeFloatPropertyValue((float) aVar.f37843e[0]));
        virtualView.setRotationY(sanitizeFloatPropertyValue((float) aVar.f37843e[1]));
        virtualView.setScaleX(sanitizeFloatPropertyValue((float) aVar.f37840b[0]));
        virtualView.setScaleY(sanitizeFloatPropertyValue((float) aVar.f37840b[1]));
        double[] dArr2 = aVar.f37839a;
        if (dArr2.length > 2) {
            float f10 = (float) dArr2[2];
            if (f10 == 0.0f) {
                f10 = 7.8125E-4f;
            }
            float f11 = (-1.0f) / f10;
            float f12 = C3289e.e().density;
            virtualView.setCameraDistance(f12 * f12 * f11 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(C3284b0 c3284b0, VirtualView virtualView) {
        super.addEventEmitters(c3284b0, virtualView);
        virtualView.setOnHierarchyChangeListener(new a());
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public com.facebook.react.uimanager.r createShadowNodeInstance() {
        return new c();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public VirtualView createViewInstance(C3284b0 c3284b0) {
        switch (b.f43705a[this.svgClass.ordinal()]) {
            case 1:
                return new B(c3284b0);
            case 2:
                return new J(c3284b0);
            case 3:
                return new C3993b(c3284b0);
            case 4:
                return new C3999h(c3284b0);
            case 5:
                return new D(c3284b0);
            case 6:
                return new Q(c3284b0);
            case 7:
                return new l0(c3284b0);
            case 8:
                return new Y(c3284b0);
            case 9:
                return new Z(c3284b0);
            case 10:
                return new C(c3284b0);
            case 11:
                return new C3994c(c3284b0);
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                return new C3997f(c3284b0);
            case 13:
                return new m0(c3284b0);
            case 14:
                return new T(c3284b0);
            case 15:
                return new E(c3284b0);
            case 16:
                return new P(c3284b0);
            case 17:
                return new K(c3284b0);
            case 18:
                return new G(c3284b0);
            case 19:
                return new C4014w(c3284b0);
            case 20:
                return new C4001j(c3284b0);
            case 21:
                return new C4002k(c3284b0);
            case 22:
                return new C4003l(c3284b0);
            case 23:
                return new C4004m(c3284b0);
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                return new C4005n(c3284b0);
            case 25:
                return new C4006o(c3284b0);
            case 26:
                return new C4007p(c3284b0);
            case 27:
                return new F(c3284b0);
            case 28:
                return new C4016y(c3284b0);
            default:
                throw new IllegalStateException("Unexpected type " + this.svgClass.toString());
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(VirtualView virtualView) {
        super.onAfterUpdateTransaction(virtualView);
        invalidateSvgView(virtualView);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(VirtualView virtualView) {
        super.onDropViewInstance(virtualView);
        mTagToRenderableView.remove(virtualView.getId());
    }

    public void setMatrix(V v10, ReadableArray readableArray) {
        v10.setMatrix(readableArray);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setTransform(VirtualView virtualView, ReadableArray readableArray) {
        setTransformProperty(virtualView, readableArray);
        Matrix matrix = virtualView.getMatrix();
        virtualView.mMatrix = matrix;
        virtualView.mInvertible = matrix.invert(virtualView.mInvMatrix);
    }

    @B7.a(name = "transform")
    public void setTransform(V v10, Dynamic dynamic) {
        if (dynamic.getType() != ReadableType.Array) {
            return;
        }
        setTransform((VirtualView) v10, dynamic.asArray());
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class c extends com.facebook.react.uimanager.r {
        c() {
        }

        @B7.b(names = {"alignSelf", "alignItems", "collapsable", "flex", "flexBasis", "flexDirection", "flexGrow", "flexShrink", "flexWrap", "justifyContent", "overflow", "alignContent", "display", "position", "right", "top", "bottom", "left", "start", "end", "width", "height", "minWidth", "maxWidth", "minHeight", "maxHeight", "margin", "marginVertical", "marginHorizontal", "marginLeft", "marginRight", "marginTop", "marginBottom", "marginStart", "marginEnd", "padding", "paddingVertical", "paddingHorizontal", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "paddingStart", "paddingEnd", "borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
        public void ignoreLayoutProps(int i10, Dynamic dynamic) {
        }
    }
}
