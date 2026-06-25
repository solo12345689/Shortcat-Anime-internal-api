package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: com.facebook.react.uimanager.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3285c implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final BaseViewManager f37554a;

    public AbstractC3285c(BaseViewManager mViewManager) {
        AbstractC5504s.h(mViewManager, "mViewManager");
        this.f37554a = mViewManager;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.q0
    public void a(View view, String propName, Object obj) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(propName, "propName");
        switch (propName.hashCode()) {
            case -2018402664:
                if (propName.equals("mixBlendMode")) {
                    this.f37554a.setMixBlendMode(view, (String) obj);
                    break;
                }
                break;
            case -1898517556:
                if (propName.equals("onPointerEnterCapture")) {
                    Boolean bool = (Boolean) obj;
                    this.f37554a.setPointerEnterCapture(view, bool != null ? bool.booleanValue() : false);
                    break;
                }
                break;
            case -1721943862:
                if (propName.equals("translateX")) {
                    Double d10 = (Double) obj;
                    this.f37554a.setTranslateX(view, d10 != null ? (float) d10.doubleValue() : 0.0f);
                    break;
                }
                break;
            case -1721943861:
                if (propName.equals("translateY")) {
                    Double d11 = (Double) obj;
                    this.f37554a.setTranslateY(view, d11 != null ? (float) d11.doubleValue() : 0.0f);
                    break;
                }
                break;
            case -1589741021:
                if (propName.equals("shadowColor")) {
                    BaseViewManager baseViewManager = this.f37554a;
                    Context context = view.getContext();
                    AbstractC5504s.g(context, "getContext(...)");
                    baseViewManager.setShadowColor(view, ColorPropConverter.getColor(obj, context, 0));
                    break;
                }
                break;
            case -1489432511:
                if (propName.equals("outlineColor")) {
                    this.f37554a.setOutlineColor(view, (Integer) obj);
                    break;
                }
                break;
            case -1474494833:
                if (propName.equals("outlineStyle")) {
                    this.f37554a.setOutlineStyle(view, (String) obj);
                    break;
                }
                break;
            case -1471148380:
                if (propName.equals("outlineWidth")) {
                    Double d12 = (Double) obj;
                    this.f37554a.setOutlineWidth(view, d12 != null ? (float) d12.doubleValue() : com.facebook.yoga.g.f38662b);
                    break;
                }
                break;
            case -1351902487:
                if (propName.equals("onClick")) {
                    Boolean bool2 = (Boolean) obj;
                    this.f37554a.setClick(view, bool2 != null ? bool2.booleanValue() : false);
                    break;
                }
                break;
            case -1274492040:
                if (propName.equals("filter")) {
                    this.f37554a.setFilter(view, (ReadableArray) obj);
                    break;
                }
                break;
            case -1267206133:
                if (propName.equals("opacity")) {
                    Double d13 = (Double) obj;
                    this.f37554a.setOpacity(view, d13 != null ? (float) d13.doubleValue() : 1.0f);
                    break;
                }
                break;
            case -1247970794:
                if (propName.equals("onPointerOutCapture")) {
                    Boolean bool3 = (Boolean) obj;
                    this.f37554a.setPointerOutCapture(view, bool3 != null ? bool3.booleanValue() : false);
                    break;
                }
                break;
            case -1228066334:
                if (propName.equals("borderTopLeftRadius")) {
                    Double d14 = (Double) obj;
                    this.f37554a.setBorderTopLeftRadius(view, d14 != null ? (float) d14.doubleValue() : com.facebook.yoga.g.f38662b);
                    break;
                }
                break;
            case -1219666915:
                if (propName.equals("onClickCapture")) {
                    Boolean bool4 = (Boolean) obj;
                    this.f37554a.setClickCapture(view, bool4 != null ? bool4.booleanValue() : false);
                    break;
                }
                break;
            case -1036769289:
                if (propName.equals("onPointerMoveCapture")) {
                    Boolean bool5 = (Boolean) obj;
                    this.f37554a.setPointerMoveCapture(view, bool5 != null ? bool5.booleanValue() : false);
                    break;
                }
                break;
            case -994557277:
                if (propName.equals("screenReaderFocusable")) {
                    Boolean bool6 = (Boolean) obj;
                    this.f37554a.setScreenReaderFocusable(view, bool6 != null ? bool6.booleanValue() : false);
                    break;
                }
                break;
            case -908189618:
                if (propName.equals("scaleX")) {
                    Double d15 = (Double) obj;
                    this.f37554a.setScaleX(view, d15 != null ? (float) d15.doubleValue() : 1.0f);
                    break;
                }
                break;
            case -908189617:
                if (propName.equals("scaleY")) {
                    Double d16 = (Double) obj;
                    this.f37554a.setScaleY(view, d16 != null ? (float) d16.doubleValue() : 1.0f);
                    break;
                }
                break;
            case -877170387:
                if (propName.equals("testID")) {
                    this.f37554a.setTestId(view, (String) obj);
                    break;
                }
                break;
            case -781597262:
                if (propName.equals("transformOrigin")) {
                    this.f37554a.setTransformOrigin(view, (ReadableArray) obj);
                    break;
                }
                break;
            case -731417480:
                if (propName.equals("zIndex")) {
                    Double d17 = (Double) obj;
                    this.f37554a.setZIndex(view, d17 != null ? (float) d17.doubleValue() : 0.0f);
                    break;
                }
                break;
            case -112141555:
                if (propName.equals("onPointerLeaveCapture")) {
                    Boolean bool7 = (Boolean) obj;
                    this.f37554a.setPointerLeaveCapture(view, bool7 != null ? bool7.booleanValue() : false);
                    break;
                }
                break;
            case -101663499:
                if (propName.equals("accessibilityHint")) {
                    this.f37554a.setAccessibilityHint(view, (String) obj);
                    break;
                }
                break;
            case -101359900:
                if (propName.equals("accessibilityRole")) {
                    this.f37554a.setAccessibilityRole(view, (String) obj);
                    break;
                }
                break;
            case -80891667:
                if (propName.equals("renderToHardwareTextureAndroid")) {
                    Boolean bool8 = (Boolean) obj;
                    this.f37554a.setRenderToHardwareTexture(view, bool8 != null ? bool8.booleanValue() : false);
                    break;
                }
                break;
            case -40300674:
                if (propName.equals("rotation")) {
                    Double d18 = (Double) obj;
                    this.f37554a.setRotation(view, d18 != null ? (float) d18.doubleValue() : 0.0f);
                    break;
                }
                break;
            case -4379043:
                if (propName.equals("elevation")) {
                    Double d19 = (Double) obj;
                    this.f37554a.setElevation(view, d19 != null ? (float) d19.doubleValue() : 0.0f);
                    break;
                }
                break;
            case 3506294:
                if (propName.equals("role")) {
                    this.f37554a.setRole(view, (String) obj);
                    break;
                }
                break;
            case 17941018:
                if (propName.equals("onPointerEnter")) {
                    Boolean bool9 = (Boolean) obj;
                    this.f37554a.setPointerEnter(view, bool9 != null ? bool9.booleanValue() : false);
                    break;
                }
                break;
            case 24119801:
                if (propName.equals("onPointerLeave")) {
                    Boolean bool10 = (Boolean) obj;
                    this.f37554a.setPointerLeave(view, bool10 != null ? bool10.booleanValue() : false);
                    break;
                }
                break;
            case 36255470:
                if (propName.equals("accessibilityLiveRegion")) {
                    this.f37554a.setAccessibilityLiveRegion(view, (String) obj);
                    break;
                }
                break;
            case 132353428:
                if (propName.equals("onPointerOverCapture")) {
                    Boolean bool11 = (Boolean) obj;
                    this.f37554a.setPointerOverCapture(view, bool11 != null ? bool11.booleanValue() : false);
                    break;
                }
                break;
            case 317346576:
                if (propName.equals("onPointerOut")) {
                    Boolean bool12 = (Boolean) obj;
                    this.f37554a.setPointerOut(view, bool12 != null ? bool12.booleanValue() : false);
                    break;
                }
                break;
            case 333432965:
                if (propName.equals("borderTopRightRadius")) {
                    Double d20 = (Double) obj;
                    this.f37554a.setBorderTopRightRadius(view, d20 != null ? (float) d20.doubleValue() : com.facebook.yoga.g.f38662b);
                    break;
                }
                break;
            case 581268560:
                if (propName.equals("borderBottomLeftRadius")) {
                    Double d21 = (Double) obj;
                    this.f37554a.setBorderBottomLeftRadius(view, d21 != null ? (float) d21.doubleValue() : com.facebook.yoga.g.f38662b);
                    break;
                }
                break;
            case 588239831:
                if (propName.equals("borderBottomRightRadius")) {
                    Double d22 = (Double) obj;
                    this.f37554a.setBorderBottomRightRadius(view, d22 != null ? (float) d22.doubleValue() : com.facebook.yoga.g.f38662b);
                    break;
                }
                break;
            case 743055051:
                if (propName.equals("boxShadow")) {
                    this.f37554a.setBoxShadow(view, (ReadableArray) obj);
                    break;
                }
                break;
            case 746986311:
                if (propName.equals("importantForAccessibility")) {
                    this.f37554a.setImportantForAccessibility(view, (String) obj);
                    break;
                }
                break;
            case 1052666732:
                if (propName.equals("transform")) {
                    this.f37554a.setTransform(view, (ReadableArray) obj);
                    break;
                }
                break;
            case 1146842694:
                if (propName.equals("accessibilityLabel")) {
                    this.f37554a.setAccessibilityLabel(view, (String) obj);
                    break;
                }
                break;
            case 1153872867:
                if (propName.equals("accessibilityState")) {
                    this.f37554a.setViewState(view, (ReadableMap) obj);
                    break;
                }
                break;
            case 1156088003:
                if (propName.equals("accessibilityValue")) {
                    this.f37554a.setAccessibilityValue(view, (ReadableMap) obj);
                    break;
                }
                break;
            case 1247744079:
                if (propName.equals("onPointerMove")) {
                    Boolean bool13 = (Boolean) obj;
                    this.f37554a.setPointerMove(view, bool13 != null ? bool13.booleanValue() : false);
                    break;
                }
                break;
            case 1247809874:
                if (propName.equals("onPointerOver")) {
                    Boolean bool14 = (Boolean) obj;
                    this.f37554a.setPointerOver(view, bool14 != null ? bool14.booleanValue() : false);
                    break;
                }
                break;
            case 1287124693:
                if (propName.equals("backgroundColor")) {
                    BaseViewManager baseViewManager2 = this.f37554a;
                    Context context2 = view.getContext();
                    AbstractC5504s.g(context2, "getContext(...)");
                    baseViewManager2.setBackgroundColor(view, ColorPropConverter.getColor(obj, context2, 0));
                    break;
                }
                break;
            case 1349188574:
                if (propName.equals("borderRadius")) {
                    Double d23 = (Double) obj;
                    this.f37554a.setBorderRadius(view, d23 != null ? (float) d23.doubleValue() : com.facebook.yoga.g.f38662b);
                    break;
                }
                break;
            case 1407295349:
                if (propName.equals("outlineOffset")) {
                    Double d24 = (Double) obj;
                    this.f37554a.setOutlineOffset(view, d24 != null ? (float) d24.doubleValue() : com.facebook.yoga.g.f38662b);
                    break;
                }
                break;
            case 1505602511:
                if (propName.equals("accessibilityActions")) {
                    this.f37554a.setAccessibilityActions(view, (ReadableArray) obj);
                    break;
                }
                break;
            case 1761903244:
                if (propName.equals("accessibilityCollection")) {
                    this.f37554a.setAccessibilityCollection(view, (ReadableMap) obj);
                    break;
                }
                break;
            case 1865277756:
                if (propName.equals("accessibilityLabelledBy")) {
                    this.f37554a.setAccessibilityLabelledBy(view, new DynamicFromObject(obj));
                    break;
                }
                break;
            case 1993034687:
                if (propName.equals("accessibilityCollectionItem")) {
                    this.f37554a.setAccessibilityCollectionItem(view, (ReadableMap) obj);
                    break;
                }
                break;
            case 2045685618:
                if (propName.equals("nativeID")) {
                    this.f37554a.setNativeId(view, (String) obj);
                    break;
                }
                break;
        }
    }

    @Override // com.facebook.react.uimanager.q0
    public void b(View view, String commandName, ReadableArray args) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(commandName, "commandName");
        AbstractC5504s.h(args, "args");
    }
}
