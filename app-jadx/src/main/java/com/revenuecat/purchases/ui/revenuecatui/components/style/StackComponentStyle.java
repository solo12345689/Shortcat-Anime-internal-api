package com.revenuecat.purchases.ui.revenuecatui.components.style;

import C.A;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedOverride;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedStackPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import i1.C5015h;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z.q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b-\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002Bï\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0012\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0\u0003\u0012\b\b\u0002\u0010+\u001a\u00020\u0007\u0012\b\b\u0002\u0010,\u001a\u00020\u0007\u0012\b\b\u0002\u0010-\u001a\u00020\u0007¢\u0006\u0004\b.\u0010/J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b6\u00107J\u0016\u0010:\u001a\u00020\u000bHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00109J\u0012\u0010;\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b?\u0010>J\u0010\u0010@\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0012\u0010N\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0012\u0010R\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020&HÆ\u0003¢\u0006\u0004\bT\u0010UJ\u001c\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0\u0003HÆ\u0003¢\u0006\u0004\bV\u00101J\u0010\u0010W\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bW\u00105J\u0010\u0010X\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bX\u00105J\u0010\u0010Y\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bY\u00105J\u009f\u0002\u0010\\\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010'\u001a\u00020&2\u0014\b\u0002\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0\u00032\b\b\u0002\u0010+\u001a\u00020\u00072\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010-\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001¢\u0006\u0004\bZ\u0010[J\u0010\u0010^\u001a\u00020]HÖ\u0001¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020 HÖ\u0001¢\u0006\u0004\b`\u0010aJ\u001a\u0010d\u001a\u00020\u00072\b\u0010c\u001a\u0004\u0018\u00010bHÖ\u0003¢\u0006\u0004\bd\u0010eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010f\u001a\u0004\bg\u00101R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010h\u001a\u0004\bi\u00103R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010j\u001a\u0004\bk\u00105R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010l\u001a\u0004\bm\u00107R\u001d\u0010\f\u001a\u00020\u000b8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\f\u0010n\u001a\u0004\bo\u00109R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010p\u001a\u0004\bq\u0010<R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010r\u001a\u0004\bs\u0010>R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010r\u001a\u0004\bt\u0010>R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010u\u001a\u0004\bv\u0010AR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010w\u001a\u0004\bx\u0010CR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010y\u001a\u0004\bz\u0010ER\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010{\u001a\u0004\b|\u0010GR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010}\u001a\u0004\b~\u0010IR\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0016X\u0096\u0004¢\u0006\r\n\u0004\b\u001d\u0010\u007f\u001a\u0005\b\u0080\u0001\u0010KR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u001f\u0010\u0081\u0001\u001a\u0005\b\u0082\u0001\u0010MR\u001e\u0010!\u001a\u0004\u0018\u00010 8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b!\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010OR\u001e\u0010#\u001a\u0004\u0018\u00010\"8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b#\u0010\u0085\u0001\u001a\u0005\b\u0086\u0001\u0010QR\u001b\u0010%\u001a\u0004\u0018\u00010$8\u0006¢\u0006\u000e\n\u0005\b%\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010SR\u0019\u0010'\u001a\u00020&8\u0006¢\u0006\u000e\n\u0005\b'\u0010\u0089\u0001\u001a\u0005\b\u008a\u0001\u0010UR$\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0\u00038\u0006¢\u0006\r\n\u0004\b*\u0010f\u001a\u0005\b\u008b\u0001\u00101R\u0018\u0010+\u001a\u00020\u00078\u0006¢\u0006\r\n\u0004\b+\u0010j\u001a\u0005\b\u008c\u0001\u00105R\u0018\u0010,\u001a\u00020\u00078\u0006¢\u0006\r\n\u0004\b,\u0010j\u001a\u0005\b\u008d\u0001\u00105R\u0018\u0010-\u001a\u00020\u00078\u0006¢\u0006\r\n\u0004\b-\u0010j\u001a\u0005\b\u008e\u0001\u00105\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u008f\u0001"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/state/PackageContext;", "", "children", "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;", "dimension", "", "visible", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Li1/h;", "spacing", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;", AppStateModule.APP_STATE_BACKGROUND, "LC/A;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "shape", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "border", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "shadow", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/BadgeStyle;", "badge", "Lz/q;", "scrollOrientation", "Lcom/revenuecat/purchases/Package;", "rcPackage", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "resolvedOffer", "", "tabIndex", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "offerEligibility", "Ljava/util/Date;", "countdownDate", "Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;", "countFrom", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedOverride;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedStackPartial;", "overrides", "applyTopWindowInsets", "applyBottomWindowInsets", "applyHorizontalWindowInsets", "<init>", "(Ljava/util/List;Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;ZLcom/revenuecat/purchases/paywalls/components/properties/Size;FLcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;LC/A;LC/A;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/BadgeStyle;Lz/q;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;Ljava/lang/Integer;Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;Ljava/util/Date;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;Ljava/util/List;ZZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;", "component3", "()Z", "component4", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "component5-D9Ej5fM", "()F", "component5", "component6", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;", "component7", "()LC/A;", "component8", "component9", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "component10", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "component11", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "component12", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/BadgeStyle;", "component13", "()Lz/q;", "component14", "()Lcom/revenuecat/purchases/Package;", "component15", "()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "component16", "()Ljava/lang/Integer;", "component17", "()Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "component18", "()Ljava/util/Date;", "component19", "()Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;", "component20", "component21", "component22", "component23", "copy-KMZiVUk", "(Ljava/util/List;Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;ZLcom/revenuecat/purchases/paywalls/components/properties/Size;FLcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;LC/A;LC/A;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/BadgeStyle;Lz/q;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;Ljava/lang/Integer;Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;Ljava/util/Date;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;Ljava/util/List;ZZZ)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;", "copy", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getChildren", "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;", "getDimension", "Z", "getVisible", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "F", "getSpacing-D9Ej5fM", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;", "getBackground", "LC/A;", "getPadding", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "getShape", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "getBorder", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "getShadow", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/BadgeStyle;", "getBadge", "Lz/q;", "getScrollOrientation", "Lcom/revenuecat/purchases/Package;", "getRcPackage", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "getResolvedOffer", "Ljava/lang/Integer;", "getTabIndex", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "getOfferEligibility", "Ljava/util/Date;", "getCountdownDate", "Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;", "getCountFrom", "getOverrides", "getApplyTopWindowInsets", "getApplyBottomWindowInsets", "getApplyHorizontalWindowInsets", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class StackComponentStyle implements ComponentStyle, PackageContext {
    public static final int $stable = 0;
    private final boolean applyBottomWindowInsets;
    private final boolean applyHorizontalWindowInsets;
    private final boolean applyTopWindowInsets;
    private final BackgroundStyles background;
    private final BadgeStyle badge;
    private final BorderStyles border;
    private final List<ComponentStyle> children;
    private final CountdownComponent.CountFrom countFrom;
    private final Date countdownDate;
    private final Dimension dimension;
    private final A margin;
    private final OfferEligibility offerEligibility;
    private final List<PresentedOverride<PresentedStackPartial>> overrides;
    private final A padding;
    private final Package rcPackage;
    private final ResolvedOffer resolvedOffer;
    private final q scrollOrientation;
    private final ShadowStyles shadow;
    private final Shape shape;
    private final Size size;
    private final float spacing;
    private final Integer tabIndex;
    private final boolean visible;

    public /* synthetic */ StackComponentStyle(List list, Dimension dimension, boolean z10, Size size, float f10, BackgroundStyles backgroundStyles, A a10, A a11, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, BadgeStyle badgeStyle, q qVar, Package r14, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, Date date, CountdownComponent.CountFrom countFrom, List list2, boolean z11, boolean z12, boolean z13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, dimension, z10, size, f10, backgroundStyles, a10, a11, shape, borderStyles, shadowStyles, badgeStyle, qVar, r14, resolvedOffer, num, offerEligibility, date, countFrom, list2, z11, z12, z13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-KMZiVUk$default */
    public static /* synthetic */ StackComponentStyle m527copyKMZiVUk$default(StackComponentStyle stackComponentStyle, List list, Dimension dimension, boolean z10, Size size, float f10, BackgroundStyles backgroundStyles, A a10, A a11, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, BadgeStyle badgeStyle, q qVar, Package r31, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, Date date, CountdownComponent.CountFrom countFrom, List list2, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        boolean z14;
        boolean z15;
        List list3 = (i10 & 1) != 0 ? stackComponentStyle.children : list;
        Dimension dimension2 = (i10 & 2) != 0 ? stackComponentStyle.dimension : dimension;
        boolean z16 = (i10 & 4) != 0 ? stackComponentStyle.visible : z10;
        Size size2 = (i10 & 8) != 0 ? stackComponentStyle.size : size;
        float f11 = (i10 & 16) != 0 ? stackComponentStyle.spacing : f10;
        BackgroundStyles backgroundStyles2 = (i10 & 32) != 0 ? stackComponentStyle.background : backgroundStyles;
        A a12 = (i10 & 64) != 0 ? stackComponentStyle.padding : a10;
        A a13 = (i10 & 128) != 0 ? stackComponentStyle.margin : a11;
        Shape shape2 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? stackComponentStyle.shape : shape;
        BorderStyles borderStyles2 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? stackComponentStyle.border : borderStyles;
        ShadowStyles shadowStyles2 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? stackComponentStyle.shadow : shadowStyles;
        BadgeStyle badgeStyle2 = (i10 & 2048) != 0 ? stackComponentStyle.badge : badgeStyle;
        q qVar2 = (i10 & 4096) != 0 ? stackComponentStyle.scrollOrientation : qVar;
        Package r15 = (i10 & 8192) != 0 ? stackComponentStyle.rcPackage : r31;
        List list4 = list3;
        ResolvedOffer resolvedOffer2 = (i10 & 16384) != 0 ? stackComponentStyle.resolvedOffer : resolvedOffer;
        Integer num2 = (i10 & 32768) != 0 ? stackComponentStyle.tabIndex : num;
        OfferEligibility offerEligibility2 = (i10 & 65536) != 0 ? stackComponentStyle.offerEligibility : offerEligibility;
        Date date2 = (i10 & 131072) != 0 ? stackComponentStyle.countdownDate : date;
        CountdownComponent.CountFrom countFrom2 = (i10 & 262144) != 0 ? stackComponentStyle.countFrom : countFrom;
        List list5 = (i10 & 524288) != 0 ? stackComponentStyle.overrides : list2;
        boolean z17 = (i10 & 1048576) != 0 ? stackComponentStyle.applyTopWindowInsets : z11;
        boolean z18 = (i10 & 2097152) != 0 ? stackComponentStyle.applyBottomWindowInsets : z12;
        if ((i10 & 4194304) != 0) {
            z15 = z18;
            z14 = stackComponentStyle.applyHorizontalWindowInsets;
        } else {
            z14 = z13;
            z15 = z18;
        }
        return stackComponentStyle.m529copyKMZiVUk(list4, dimension2, z16, size2, f11, backgroundStyles2, a12, a13, shape2, borderStyles2, shadowStyles2, badgeStyle2, qVar2, r15, resolvedOffer2, num2, offerEligibility2, date2, countFrom2, list5, z17, z15, z14);
    }

    public final List<ComponentStyle> component1() {
        return this.children;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BorderStyles getBorder() {
        return this.border;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final ShadowStyles getShadow() {
        return this.shadow;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BadgeStyle getBadge() {
        return this.badge;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final q getScrollOrientation() {
        return this.scrollOrientation;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Package getRcPackage() {
        return this.rcPackage;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final ResolvedOffer getResolvedOffer() {
        return this.resolvedOffer;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Integer getTabIndex() {
        return this.tabIndex;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final OfferEligibility getOfferEligibility() {
        return this.offerEligibility;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Date getCountdownDate() {
        return this.countdownDate;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final CountdownComponent.CountFrom getCountFrom() {
        return this.countFrom;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Dimension getDimension() {
        return this.dimension;
    }

    public final List<PresentedOverride<PresentedStackPartial>> component20() {
        return this.overrides;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final boolean getApplyTopWindowInsets() {
        return this.applyTopWindowInsets;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final boolean getApplyBottomWindowInsets() {
        return this.applyBottomWindowInsets;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final boolean getApplyHorizontalWindowInsets() {
        return this.applyHorizontalWindowInsets;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component5-D9Ej5fM, reason: from getter */
    public final float getSpacing() {
        return this.spacing;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BackgroundStyles getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final A getPadding() {
        return this.padding;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final A getMargin() {
        return this.margin;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Shape getShape() {
        return this.shape;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
    public /* synthetic */ boolean computeIsSelected(PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo, int i10) {
        return PackageContext.DefaultImpls.computeIsSelected(this, selectedPackageInfo, i10);
    }

    /* JADX INFO: renamed from: copy-KMZiVUk */
    public final StackComponentStyle m529copyKMZiVUk(List<? extends ComponentStyle> children, Dimension dimension, boolean visible, Size size, float spacing, BackgroundStyles backgroundStyles, A padding, A margin, Shape shape, BorderStyles border, ShadowStyles shadow, BadgeStyle badge, q scrollOrientation, Package rcPackage, ResolvedOffer resolvedOffer, Integer tabIndex, OfferEligibility offerEligibility, Date countdownDate, CountdownComponent.CountFrom countFrom, List<PresentedOverride<PresentedStackPartial>> overrides, boolean applyTopWindowInsets, boolean applyBottomWindowInsets, boolean applyHorizontalWindowInsets) {
        AbstractC5504s.h(children, "children");
        AbstractC5504s.h(dimension, "dimension");
        AbstractC5504s.h(size, "size");
        AbstractC5504s.h(padding, "padding");
        AbstractC5504s.h(margin, "margin");
        AbstractC5504s.h(shape, "shape");
        AbstractC5504s.h(countFrom, "countFrom");
        AbstractC5504s.h(overrides, "overrides");
        return new StackComponentStyle(children, dimension, visible, size, spacing, backgroundStyles, padding, margin, shape, border, shadow, badge, scrollOrientation, rcPackage, resolvedOffer, tabIndex, offerEligibility, countdownDate, countFrom, overrides, applyTopWindowInsets, applyBottomWindowInsets, applyHorizontalWindowInsets, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StackComponentStyle)) {
            return false;
        }
        StackComponentStyle stackComponentStyle = (StackComponentStyle) other;
        return AbstractC5504s.c(this.children, stackComponentStyle.children) && AbstractC5504s.c(this.dimension, stackComponentStyle.dimension) && this.visible == stackComponentStyle.visible && AbstractC5504s.c(this.size, stackComponentStyle.size) && C5015h.q(this.spacing, stackComponentStyle.spacing) && AbstractC5504s.c(this.background, stackComponentStyle.background) && AbstractC5504s.c(this.padding, stackComponentStyle.padding) && AbstractC5504s.c(this.margin, stackComponentStyle.margin) && AbstractC5504s.c(this.shape, stackComponentStyle.shape) && AbstractC5504s.c(this.border, stackComponentStyle.border) && AbstractC5504s.c(this.shadow, stackComponentStyle.shadow) && AbstractC5504s.c(this.badge, stackComponentStyle.badge) && this.scrollOrientation == stackComponentStyle.scrollOrientation && AbstractC5504s.c(this.rcPackage, stackComponentStyle.rcPackage) && AbstractC5504s.c(this.resolvedOffer, stackComponentStyle.resolvedOffer) && AbstractC5504s.c(this.tabIndex, stackComponentStyle.tabIndex) && AbstractC5504s.c(this.offerEligibility, stackComponentStyle.offerEligibility) && AbstractC5504s.c(this.countdownDate, stackComponentStyle.countdownDate) && this.countFrom == stackComponentStyle.countFrom && AbstractC5504s.c(this.overrides, stackComponentStyle.overrides) && this.applyTopWindowInsets == stackComponentStyle.applyTopWindowInsets && this.applyBottomWindowInsets == stackComponentStyle.applyBottomWindowInsets && this.applyHorizontalWindowInsets == stackComponentStyle.applyHorizontalWindowInsets;
    }

    public final /* synthetic */ boolean getApplyBottomWindowInsets() {
        return this.applyBottomWindowInsets;
    }

    public final /* synthetic */ boolean getApplyHorizontalWindowInsets() {
        return this.applyHorizontalWindowInsets;
    }

    public final /* synthetic */ boolean getApplyTopWindowInsets() {
        return this.applyTopWindowInsets;
    }

    public final /* synthetic */ BackgroundStyles getBackground() {
        return this.background;
    }

    public final /* synthetic */ BadgeStyle getBadge() {
        return this.badge;
    }

    public final /* synthetic */ BorderStyles getBorder() {
        return this.border;
    }

    public final /* synthetic */ List getChildren() {
        return this.children;
    }

    public final /* synthetic */ CountdownComponent.CountFrom getCountFrom() {
        return this.countFrom;
    }

    public final /* synthetic */ Date getCountdownDate() {
        return this.countdownDate;
    }

    public final /* synthetic */ Dimension getDimension() {
        return this.dimension;
    }

    public final /* synthetic */ A getMargin() {
        return this.margin;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
    public /* synthetic */ OfferEligibility getOfferEligibility() {
        return this.offerEligibility;
    }

    public final /* synthetic */ List getOverrides() {
        return this.overrides;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
    public String getPackageUniqueId() {
        return PackageContext.DefaultImpls.getPackageUniqueId(this);
    }

    public final /* synthetic */ A getPadding() {
        return this.padding;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
    public /* synthetic */ Package getRcPackage() {
        return this.rcPackage;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
    public /* synthetic */ ResolvedOffer getResolvedOffer() {
        return this.resolvedOffer;
    }

    public final /* synthetic */ q getScrollOrientation() {
        return this.scrollOrientation;
    }

    public final /* synthetic */ ShadowStyles getShadow() {
        return this.shadow;
    }

    public final /* synthetic */ Shape getShape() {
        return this.shape;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle
    public /* synthetic */ Size getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
    public final /* synthetic */ float m530getSpacingD9Ej5fM() {
        return this.spacing;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
    public /* synthetic */ Integer getTabIndex() {
        return this.tabIndex;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle
    public /* synthetic */ boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.children.hashCode() * 31) + this.dimension.hashCode()) * 31) + Boolean.hashCode(this.visible)) * 31) + this.size.hashCode()) * 31) + C5015h.r(this.spacing)) * 31;
        BackgroundStyles backgroundStyles = this.background;
        int iHashCode2 = (((((((iHashCode + (backgroundStyles == null ? 0 : backgroundStyles.hashCode())) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31) + this.shape.hashCode()) * 31;
        BorderStyles borderStyles = this.border;
        int iHashCode3 = (iHashCode2 + (borderStyles == null ? 0 : borderStyles.hashCode())) * 31;
        ShadowStyles shadowStyles = this.shadow;
        int iHashCode4 = (iHashCode3 + (shadowStyles == null ? 0 : shadowStyles.hashCode())) * 31;
        BadgeStyle badgeStyle = this.badge;
        int iHashCode5 = (iHashCode4 + (badgeStyle == null ? 0 : badgeStyle.hashCode())) * 31;
        q qVar = this.scrollOrientation;
        int iHashCode6 = (iHashCode5 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Package r12 = this.rcPackage;
        int iHashCode7 = (iHashCode6 + (r12 == null ? 0 : r12.hashCode())) * 31;
        ResolvedOffer resolvedOffer = this.resolvedOffer;
        int iHashCode8 = (iHashCode7 + (resolvedOffer == null ? 0 : resolvedOffer.hashCode())) * 31;
        Integer num = this.tabIndex;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        OfferEligibility offerEligibility = this.offerEligibility;
        int iHashCode10 = (iHashCode9 + (offerEligibility == null ? 0 : offerEligibility.hashCode())) * 31;
        Date date = this.countdownDate;
        return ((((((((((iHashCode10 + (date != null ? date.hashCode() : 0)) * 31) + this.countFrom.hashCode()) * 31) + this.overrides.hashCode()) * 31) + Boolean.hashCode(this.applyTopWindowInsets)) * 31) + Boolean.hashCode(this.applyBottomWindowInsets)) * 31) + Boolean.hashCode(this.applyHorizontalWindowInsets);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
    public /* synthetic */ OfferEligibility resolveOfferEligibility(OfferEligibility offerEligibility) {
        return PackageContext.DefaultImpls.resolveOfferEligibility(this, offerEligibility);
    }

    public String toString() {
        return "StackComponentStyle(children=" + this.children + ", dimension=" + this.dimension + ", visible=" + this.visible + ", size=" + this.size + ", spacing=" + ((Object) C5015h.s(this.spacing)) + ", background=" + this.background + ", padding=" + this.padding + ", margin=" + this.margin + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ", badge=" + this.badge + ", scrollOrientation=" + this.scrollOrientation + ", rcPackage=" + this.rcPackage + ", resolvedOffer=" + this.resolvedOffer + ", tabIndex=" + this.tabIndex + ", offerEligibility=" + this.offerEligibility + ", countdownDate=" + this.countdownDate + ", countFrom=" + this.countFrom + ", overrides=" + this.overrides + ", applyTopWindowInsets=" + this.applyTopWindowInsets + ", applyBottomWindowInsets=" + this.applyBottomWindowInsets + ", applyHorizontalWindowInsets=" + this.applyHorizontalWindowInsets + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private StackComponentStyle(List<? extends ComponentStyle> children, Dimension dimension, boolean z10, Size size, float f10, BackgroundStyles backgroundStyles, A padding, A margin, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, BadgeStyle badgeStyle, q qVar, Package r17, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, Date date, CountdownComponent.CountFrom countFrom, List<PresentedOverride<PresentedStackPartial>> overrides, boolean z11, boolean z12, boolean z13) {
        AbstractC5504s.h(children, "children");
        AbstractC5504s.h(dimension, "dimension");
        AbstractC5504s.h(size, "size");
        AbstractC5504s.h(padding, "padding");
        AbstractC5504s.h(margin, "margin");
        AbstractC5504s.h(shape, "shape");
        AbstractC5504s.h(countFrom, "countFrom");
        AbstractC5504s.h(overrides, "overrides");
        this.children = children;
        this.dimension = dimension;
        this.visible = z10;
        this.size = size;
        this.spacing = f10;
        this.background = backgroundStyles;
        this.padding = padding;
        this.margin = margin;
        this.shape = shape;
        this.border = borderStyles;
        this.shadow = shadowStyles;
        this.badge = badgeStyle;
        this.scrollOrientation = qVar;
        this.rcPackage = r17;
        this.resolvedOffer = resolvedOffer;
        this.tabIndex = num;
        this.offerEligibility = offerEligibility;
        this.countdownDate = date;
        this.countFrom = countFrom;
        this.overrides = overrides;
        this.applyTopWindowInsets = z11;
        this.applyBottomWindowInsets = z12;
        this.applyHorizontalWindowInsets = z13;
    }

    public /* synthetic */ StackComponentStyle(List list, Dimension dimension, boolean z10, Size size, float f10, BackgroundStyles backgroundStyles, A a10, A a11, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, BadgeStyle badgeStyle, q qVar, Package r42, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, Date date, CountdownComponent.CountFrom countFrom, List list2, boolean z11, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, dimension, z10, size, f10, backgroundStyles, a10, a11, shape, borderStyles, shadowStyles, badgeStyle, qVar, r42, (i10 & 16384) != 0 ? null : resolvedOffer, num, (65536 & i10) != 0 ? null : offerEligibility, date, countFrom, list2, (1048576 & i10) != 0 ? false : z11, (2097152 & i10) != 0 ? false : z12, (i10 & 4194304) != 0 ? false : z13, null);
    }
}
