package com.revenuecat.purchases.ui.revenuecatui.components.video;

import C.A;
import I0.InterfaceC1680f;
import Td.N;
import Td.r;
import Ud.S;
import Y.C0;
import Y.U1;
import Y.b2;
import Y.h2;
import b4.C2986c;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.paywalls.components.properties.ImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls;
import com.revenuecat.purchases.paywalls.components.properties.VideoUrls;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedVideoPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.AspectRatio;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.state.PackageAwareDelegate;
import com.revenuecat.purchases.ui.revenuecatui.components.style.VideoComponentStyle;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import ie.InterfaceC5082a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.E1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f\u0012\u001a\b\u0002\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00150\f¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001f\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J6\u0010(\u001a\u00020!*\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'J=\u0010-\u001a\u00020,2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b-\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010/R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00100R\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00100R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00100R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00100R&\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00150\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00100R+\u0010)\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R+\u0010\u001e\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b8\u00103\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R+\u0010*\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b=\u00103\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR+\u0010+\u001a\u00020\b2\u0006\u00101\u001a\u00020\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bB\u00103\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001d\u0010O\u001a\u0004\u0018\u00010J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001b\u0010T\u001a\u00020P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010L\u001a\u0004\bR\u0010SR\u001d\u0010Y\u001a\u0004\u0018\u00010U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010L\u001a\u0004\bW\u0010XR\u001b\u0010\\\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010L\u001a\u0004\b[\u0010?R\u001b\u0010\u001d\u001a\u00020\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b]\u0010L\u001a\u0004\b^\u0010_R\u001d\u0010d\u001a\u0004\u0018\u00010`8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\ba\u0010L\u001a\u0004\bb\u0010cR\u001d\u0010i\u001a\u0004\u0018\u00010e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010L\u001a\u0004\bg\u0010hR\u001b\u0010m\u001a\u00020e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010L\u001a\u0004\bk\u0010lR\u001b\u0010q\u001a\u00020\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bn\u0010L\u001a\u0004\bo\u0010pR\u001d\u0010v\u001a\u0004\u0018\u00010r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bs\u0010L\u001a\u0004\bt\u0010uR\u001d\u0010y\u001a\u0004\u0018\u00010r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bw\u0010L\u001a\u0004\bx\u0010uR\u001b\u0010~\u001a\u00020z8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b{\u0010L\u001a\u0004\b|\u0010}R\u001d\u0010\u0081\u0001\u001a\u00020z8FX\u0086\u0084\u0002¢\u0006\r\n\u0004\b\u007f\u0010L\u001a\u0005\b\u0080\u0001\u0010}R\u001e\u0010\u0084\u0001\u001a\u00020\u001b8FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010L\u001a\u0005\b\u0083\u0001\u0010pR \u0010\u0087\u0001\u001a\u0004\u0018\u00010r8FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010L\u001a\u0005\b\u0086\u0001\u0010uR\"\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u0088\u00018FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u0089\u0001\u0010L\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\"\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008d\u00018FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u008e\u0001\u0010L\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\"\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0092\u00018FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u0093\u0001\u0010L\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\"\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0097\u00018FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u0098\u0001\u0010L\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R \u0010 \u0001\u001a\u00030\u009c\u00018FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u009d\u0001\u0010L\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006¡\u0001"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState;", "", "Lb4/c;", "initialWindowSize", "Li1/d;", "initialDensity", "", "initialDarkMode", "Li1/t;", "initialLayoutDirection", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;", "style", "Lkotlin/Function0;", "Lc1/d;", "localeProvider", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$SelectedPackageInfo;", "selectedPackageInfoProvider", "", "selectedTabIndexProvider", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "selectedOfferEligibilityProvider", "", "", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "customVariablesProvider", "<init>", "(Lb4/c;Li1/d;ZLi1/t;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;Lie/a;Lie/a;Lie/a;Lie/a;Lie/a;)V", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;", "videoUrls", "density", "adjustForVideo", "(Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;Li1/d;)Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "other", "LTd/D;", "thisDimensionPx", "otherDimensionPx", "adjustDimension-yOCu0fQ", "(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;IILi1/d;)Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "adjustDimension", "windowSize", "darkMode", "layoutDirection", "LTd/L;", "update", "(Lb4/c;Li1/d;Ljava/lang/Boolean;Li1/t;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;", "Lie/a;", "<set-?>", "windowSize$delegate", "LY/C0;", "getWindowSize", "()Lb4/c;", "setWindowSize", "(Lb4/c;)V", "density$delegate", "getDensity", "()Li1/d;", "setDensity", "(Li1/d;)V", "darkMode$delegate", "getDarkMode", "()Z", "setDarkMode", "(Z)V", "layoutDirection$delegate", "getLayoutDirection", "()Li1/t;", "setLayoutDirection", "(Li1/t;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/components/state/PackageAwareDelegate;", "packageAwareDelegate", "Lcom/revenuecat/purchases/ui/revenuecatui/components/state/PackageAwareDelegate;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedVideoPartial;", "presentedPartial$delegate", "LY/h2;", "getPresentedPartial", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedVideoPartial;", "presentedPartial", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;", "themeVideoUrls$delegate", "getThemeVideoUrls", "()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;", "themeVideoUrls", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "fallbackImageUrls$delegate", "getFallbackImageUrls", "()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "fallbackImageUrls", "visible$delegate", "getVisible", "visible", "videoUrls$delegate", "getVideoUrls", "()Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;", "Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;", "fallbackUrls$delegate", "getFallbackUrls", "()Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;", "fallbackUrls", "", "imageAspectRatio$delegate", "getImageAspectRatio", "()Ljava/lang/Float;", "imageAspectRatio", "videoAspectRatio$delegate", "getVideoAspectRatio", "()F", "videoAspectRatio", "size$delegate", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/AspectRatio;", "aspectRatio$delegate", "getAspectRatio", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/AspectRatio;", "aspectRatio", "fallbackAspectRatio$delegate", "getFallbackAspectRatio", "fallbackAspectRatio", "LC/A;", "padding$delegate", "getPadding", "()LC/A;", "padding", "margin$delegate", "getMargin", "margin", "sizePlusMargin$delegate", "getSizePlusMargin", "sizePlusMargin", "marginAdjustedAspectRatio$delegate", "getMarginAdjustedAspectRatio", "marginAdjustedAspectRatio", "Ls0/E1;", "shape$delegate", "getShape", "()Ls0/E1;", "shape", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "border$delegate", "getBorder", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "border", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "shadow$delegate", "getShadow", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "shadow", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "overlay$delegate", "getOverlay", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "overlay", "LI0/f;", "contentScale$delegate", "getContentScale", "()LI0/f;", "contentScale", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VideoComponentState {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: aspectRatio$delegate, reason: from kotlin metadata */
    private final h2 aspectRatio;

    /* JADX INFO: renamed from: border$delegate, reason: from kotlin metadata */
    private final h2 border;

    /* JADX INFO: renamed from: contentScale$delegate, reason: from kotlin metadata */
    private final h2 contentScale;
    private final InterfaceC5082a customVariablesProvider;

    /* JADX INFO: renamed from: darkMode$delegate, reason: from kotlin metadata */
    private final C0 darkMode;

    /* JADX INFO: renamed from: density$delegate, reason: from kotlin metadata */
    private final C0 density;

    /* JADX INFO: renamed from: fallbackAspectRatio$delegate, reason: from kotlin metadata */
    private final h2 fallbackAspectRatio;

    /* JADX INFO: renamed from: fallbackImageUrls$delegate, reason: from kotlin metadata */
    private final h2 fallbackImageUrls;

    /* JADX INFO: renamed from: fallbackUrls$delegate, reason: from kotlin metadata */
    private final h2 fallbackUrls;

    /* JADX INFO: renamed from: imageAspectRatio$delegate, reason: from kotlin metadata */
    private final h2 imageAspectRatio;

    /* JADX INFO: renamed from: layoutDirection$delegate, reason: from kotlin metadata */
    private final C0 layoutDirection;
    private final InterfaceC5082a localeProvider;

    /* JADX INFO: renamed from: margin$delegate, reason: from kotlin metadata */
    private final h2 margin;

    /* JADX INFO: renamed from: marginAdjustedAspectRatio$delegate, reason: from kotlin metadata */
    private final h2 marginAdjustedAspectRatio;

    /* JADX INFO: renamed from: overlay$delegate, reason: from kotlin metadata */
    private final h2 overlay;
    private final PackageAwareDelegate packageAwareDelegate;

    /* JADX INFO: renamed from: padding$delegate, reason: from kotlin metadata */
    private final h2 padding;

    /* JADX INFO: renamed from: presentedPartial$delegate, reason: from kotlin metadata */
    private final h2 presentedPartial;
    private final InterfaceC5082a selectedOfferEligibilityProvider;
    private final InterfaceC5082a selectedPackageInfoProvider;
    private final InterfaceC5082a selectedTabIndexProvider;

    /* JADX INFO: renamed from: shadow$delegate, reason: from kotlin metadata */
    private final h2 shadow;

    /* JADX INFO: renamed from: shape$delegate, reason: from kotlin metadata */
    private final h2 shape;

    /* JADX INFO: renamed from: size$delegate, reason: from kotlin metadata */
    private final h2 size;

    /* JADX INFO: renamed from: sizePlusMargin$delegate, reason: from kotlin metadata */
    private final h2 sizePlusMargin;
    private final VideoComponentStyle style;

    /* JADX INFO: renamed from: themeVideoUrls$delegate, reason: from kotlin metadata */
    private final h2 themeVideoUrls;

    /* JADX INFO: renamed from: videoAspectRatio$delegate, reason: from kotlin metadata */
    private final h2 videoAspectRatio;

    /* JADX INFO: renamed from: videoUrls$delegate, reason: from kotlin metadata */
    private final h2 videoUrls;

    /* JADX INFO: renamed from: visible$delegate, reason: from kotlin metadata */
    private final h2 visible;

    /* JADX INFO: renamed from: windowSize$delegate, reason: from kotlin metadata */
    private final C0 windowSize;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.video.VideoComponentState$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Map<String, CustomVariableValue> invoke() {
            return S.i();
        }
    }

    public VideoComponentState(C2986c initialWindowSize, InterfaceC5011d initialDensity, boolean z10, EnumC5027t initialLayoutDirection, VideoComponentStyle style, InterfaceC5082a localeProvider, InterfaceC5082a selectedPackageInfoProvider, InterfaceC5082a selectedTabIndexProvider, InterfaceC5082a selectedOfferEligibilityProvider, InterfaceC5082a customVariablesProvider) {
        AbstractC5504s.h(initialWindowSize, "initialWindowSize");
        AbstractC5504s.h(initialDensity, "initialDensity");
        AbstractC5504s.h(initialLayoutDirection, "initialLayoutDirection");
        AbstractC5504s.h(style, "style");
        AbstractC5504s.h(localeProvider, "localeProvider");
        AbstractC5504s.h(selectedPackageInfoProvider, "selectedPackageInfoProvider");
        AbstractC5504s.h(selectedTabIndexProvider, "selectedTabIndexProvider");
        AbstractC5504s.h(selectedOfferEligibilityProvider, "selectedOfferEligibilityProvider");
        AbstractC5504s.h(customVariablesProvider, "customVariablesProvider");
        this.style = style;
        this.localeProvider = localeProvider;
        this.selectedPackageInfoProvider = selectedPackageInfoProvider;
        this.selectedTabIndexProvider = selectedTabIndexProvider;
        this.selectedOfferEligibilityProvider = selectedOfferEligibilityProvider;
        this.customVariablesProvider = customVariablesProvider;
        this.windowSize = b2.e(initialWindowSize, null, 2, null);
        this.density = b2.e(initialDensity, null, 2, null);
        this.darkMode = b2.e(Boolean.valueOf(z10), null, 2, null);
        this.layoutDirection = b2.e(initialLayoutDirection, null, 2, null);
        this.packageAwareDelegate = new PackageAwareDelegate(style, selectedPackageInfoProvider, selectedTabIndexProvider, selectedOfferEligibilityProvider);
        this.presentedPartial = U1.d(new VideoComponentState$presentedPartial$2(this));
        this.themeVideoUrls = U1.d(new VideoComponentState$themeVideoUrls$2(this));
        this.fallbackImageUrls = U1.d(new VideoComponentState$fallbackImageUrls$2(this));
        this.visible = U1.d(new VideoComponentState$visible$2(this));
        this.videoUrls = U1.d(new VideoComponentState$videoUrls$2(this));
        this.fallbackUrls = U1.d(new VideoComponentState$fallbackUrls$2(this));
        this.imageAspectRatio = U1.d(new VideoComponentState$imageAspectRatio$2(this));
        this.videoAspectRatio = U1.d(new VideoComponentState$videoAspectRatio$2(this));
        this.size = U1.d(new VideoComponentState$size$2(this));
        this.aspectRatio = U1.d(new VideoComponentState$aspectRatio$2(this));
        this.fallbackAspectRatio = U1.d(new VideoComponentState$fallbackAspectRatio$2(this));
        this.padding = U1.d(new VideoComponentState$padding$2(this));
        this.margin = U1.d(new VideoComponentState$margin$2(this));
        this.sizePlusMargin = U1.d(new VideoComponentState$sizePlusMargin$2(this));
        this.marginAdjustedAspectRatio = U1.d(new VideoComponentState$marginAdjustedAspectRatio$2(this));
        this.shape = U1.d(new VideoComponentState$shape$2(this));
        this.border = U1.d(new VideoComponentState$border$2(this));
        this.shadow = U1.d(new VideoComponentState$shadow$2(this));
        this.overlay = U1.d(new VideoComponentState$overlay$2(this));
        this.contentScale = U1.d(new VideoComponentState$contentScale$2(this));
    }

    /* JADX INFO: renamed from: adjustDimension-yOCu0fQ, reason: not valid java name */
    private final SizeConstraint m561adjustDimensionyOCu0fQ(SizeConstraint sizeConstraint, SizeConstraint sizeConstraint2, int i10, int i11, InterfaceC5011d interfaceC5011d) {
        if (!(sizeConstraint instanceof SizeConstraint.Fit)) {
            if (sizeConstraint instanceof SizeConstraint.Fill ? true : sizeConstraint instanceof SizeConstraint.Fixed) {
                return sizeConstraint;
            }
            throw new r();
        }
        if (sizeConstraint2 instanceof SizeConstraint.Fit) {
            return new SizeConstraint.Fixed(N.a(interfaceC5011d.A(i10)), null);
        }
        if (sizeConstraint2 instanceof SizeConstraint.Fill) {
            return sizeConstraint;
        }
        if (sizeConstraint2 instanceof SizeConstraint.Fixed) {
            return new SizeConstraint.Fixed(N.a(interfaceC5011d.e1((((float) N.c(((SizeConstraint.Fixed) sizeConstraint2).getValue())) / interfaceC5011d.A(i11)) * i10)), null);
        }
        throw new r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Size adjustForVideo(Size size, VideoUrls videoUrls, InterfaceC5011d interfaceC5011d) {
        return new Size(m561adjustDimensionyOCu0fQ(size.getWidth(), size.getHeight(), videoUrls.getWidth(), videoUrls.getHeight(), interfaceC5011d), m561adjustDimensionyOCu0fQ(size.getHeight(), size.getWidth(), videoUrls.getHeight(), videoUrls.getWidth(), interfaceC5011d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getDarkMode() {
        return ((Boolean) this.darkMode.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC5011d getDensity() {
        return (InterfaceC5011d) this.density.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ThemeImageUrls getFallbackImageUrls() {
        return (ThemeImageUrls) this.fallbackImageUrls.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Float getImageAspectRatio() {
        return (Float) this.imageAspectRatio.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EnumC5027t getLayoutDirection() {
        return (EnumC5027t) this.layoutDirection.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PresentedVideoPartial getPresentedPartial() {
        return (PresentedVideoPartial) this.presentedPartial.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ThemeVideoUrls getThemeVideoUrls() {
        return (ThemeVideoUrls) this.themeVideoUrls.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getVideoAspectRatio() {
        return ((Number) this.videoAspectRatio.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2986c getWindowSize() {
        return (C2986c) this.windowSize.getValue();
    }

    private final void setDarkMode(boolean z10) {
        this.darkMode.setValue(Boolean.valueOf(z10));
    }

    private final void setDensity(InterfaceC5011d interfaceC5011d) {
        this.density.setValue(interfaceC5011d);
    }

    private final void setLayoutDirection(EnumC5027t enumC5027t) {
        this.layoutDirection.setValue(enumC5027t);
    }

    private final void setWindowSize(C2986c c2986c) {
        this.windowSize.setValue(c2986c);
    }

    public static /* synthetic */ void update$default(VideoComponentState videoComponentState, C2986c c2986c, InterfaceC5011d interfaceC5011d, Boolean bool, EnumC5027t enumC5027t, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c2986c = null;
        }
        if ((i10 & 2) != 0) {
            interfaceC5011d = null;
        }
        if ((i10 & 4) != 0) {
            bool = null;
        }
        if ((i10 & 8) != 0) {
            enumC5027t = null;
        }
        videoComponentState.update(c2986c, interfaceC5011d, bool, enumC5027t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoComponentState)) {
            return false;
        }
        VideoComponentState videoComponentState = (VideoComponentState) obj;
        return AbstractC5504s.c(this.style, videoComponentState.style) && AbstractC5504s.c(this.localeProvider, videoComponentState.localeProvider) && AbstractC5504s.c(this.selectedPackageInfoProvider, videoComponentState.selectedPackageInfoProvider) && AbstractC5504s.c(this.selectedTabIndexProvider, videoComponentState.selectedTabIndexProvider) && AbstractC5504s.c(this.selectedOfferEligibilityProvider, videoComponentState.selectedOfferEligibilityProvider) && AbstractC5504s.c(this.customVariablesProvider, videoComponentState.customVariablesProvider);
    }

    public final /* synthetic */ AspectRatio getAspectRatio() {
        return (AspectRatio) this.aspectRatio.getValue();
    }

    public final /* synthetic */ BorderStyles getBorder() {
        return (BorderStyles) this.border.getValue();
    }

    public final /* synthetic */ InterfaceC1680f getContentScale() {
        return (InterfaceC1680f) this.contentScale.getValue();
    }

    public final /* synthetic */ AspectRatio getFallbackAspectRatio() {
        return (AspectRatio) this.fallbackAspectRatio.getValue();
    }

    public final /* synthetic */ ImageUrls getFallbackUrls() {
        return (ImageUrls) this.fallbackUrls.getValue();
    }

    public final /* synthetic */ A getMargin() {
        return (A) this.margin.getValue();
    }

    public final /* synthetic */ AspectRatio getMarginAdjustedAspectRatio() {
        return (AspectRatio) this.marginAdjustedAspectRatio.getValue();
    }

    public final /* synthetic */ ColorStyles getOverlay() {
        return (ColorStyles) this.overlay.getValue();
    }

    public final /* synthetic */ A getPadding() {
        return (A) this.padding.getValue();
    }

    public final /* synthetic */ ShadowStyles getShadow() {
        return (ShadowStyles) this.shadow.getValue();
    }

    public final /* synthetic */ E1 getShape() {
        return (E1) this.shape.getValue();
    }

    public final /* synthetic */ Size getSize() {
        return (Size) this.size.getValue();
    }

    public final /* synthetic */ Size getSizePlusMargin() {
        return (Size) this.sizePlusMargin.getValue();
    }

    public final /* synthetic */ VideoUrls getVideoUrls() {
        return (VideoUrls) this.videoUrls.getValue();
    }

    public final /* synthetic */ boolean getVisible() {
        return ((Boolean) this.visible.getValue()).booleanValue();
    }

    public int hashCode() {
        return (((((((((this.style.hashCode() * 31) + this.localeProvider.hashCode()) * 31) + this.selectedPackageInfoProvider.hashCode()) * 31) + this.selectedTabIndexProvider.hashCode()) * 31) + this.selectedOfferEligibilityProvider.hashCode()) * 31) + this.customVariablesProvider.hashCode();
    }

    public String toString() {
        return "VideoComponentState(style=" + this.style + ", localeProvider=" + this.localeProvider + ", selectedPackageInfoProvider=" + this.selectedPackageInfoProvider + ", selectedTabIndexProvider=" + this.selectedTabIndexProvider + ", selectedOfferEligibilityProvider=" + this.selectedOfferEligibilityProvider + ", customVariablesProvider=" + this.customVariablesProvider + ')';
    }

    public final /* synthetic */ void update(C2986c windowSize, InterfaceC5011d density, Boolean darkMode, EnumC5027t layoutDirection) {
        if (windowSize != null) {
            setWindowSize(windowSize);
        }
        if (density != null) {
            setDensity(density);
        }
        if (darkMode != null) {
            setDarkMode(darkMode.booleanValue());
        }
        if (layoutDirection != null) {
            setLayoutDirection(layoutDirection);
        }
    }

    public /* synthetic */ VideoComponentState(C2986c c2986c, InterfaceC5011d interfaceC5011d, boolean z10, EnumC5027t enumC5027t, VideoComponentStyle videoComponentStyle, InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, InterfaceC5082a interfaceC5082a3, InterfaceC5082a interfaceC5082a4, InterfaceC5082a interfaceC5082a5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2986c, interfaceC5011d, z10, enumC5027t, videoComponentStyle, interfaceC5082a, interfaceC5082a2, interfaceC5082a3, interfaceC5082a4, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? AnonymousClass1.INSTANCE : interfaceC5082a5);
    }
}
