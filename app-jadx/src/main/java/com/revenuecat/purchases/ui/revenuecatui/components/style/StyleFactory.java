package com.revenuecat.purchases.ui.revenuecatui.components.style;

import C.A;
import Td.L;
import Td.r;
import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import androidx.compose.foundation.layout.p;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.ColorAlias;
import com.revenuecat.purchases.FontAlias;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.paywalls.components.IconComponent;
import com.revenuecat.purchases.paywalls.components.ImageComponent;
import com.revenuecat.purchases.paywalls.components.PackageComponent;
import com.revenuecat.purchases.paywalls.components.PartialCarouselComponent;
import com.revenuecat.purchases.paywalls.components.PartialIconComponent;
import com.revenuecat.purchases.paywalls.components.PartialImageComponent;
import com.revenuecat.purchases.paywalls.components.PartialStackComponent;
import com.revenuecat.purchases.paywalls.components.PartialTextComponent;
import com.revenuecat.purchases.paywalls.components.PartialTimelineComponent;
import com.revenuecat.purchases.paywalls.components.PartialTimelineComponentItem;
import com.revenuecat.purchases.paywalls.components.PartialVideoComponent;
import com.revenuecat.purchases.paywalls.components.PaywallComponent;
import com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.StickyFooterComponent;
import com.revenuecat.purchases.paywalls.components.TabControlButtonComponent;
import com.revenuecat.purchases.paywalls.components.TabControlComponent;
import com.revenuecat.purchases.paywalls.components.TabControlToggleComponent;
import com.revenuecat.purchases.paywalls.components.TabsComponent;
import com.revenuecat.purchases.paywalls.components.TextComponent;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import com.revenuecat.purchases.paywalls.components.VideoComponent;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.paywalls.components.common.LocalizationData;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.VariableLocalizationKey;
import com.revenuecat.purchases.paywalls.components.properties.Badge;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.MaskShape;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls;
import com.revenuecat.purchases.ui.revenuecatui.components.LocalizedTextPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedCarouselPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedIconPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedImagePartial;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedPartialKt;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedStackPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedTimelineItemPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedTimelinePartial;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedVideoPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.AlignmentKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.FitModeKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.LocalizationKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.PaddingKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.ShapeKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.FontSpec;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ButtonComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.CarouselComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.IconComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TabControlStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TabsComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TimelineComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError;
import com.revenuecat.purchases.ui.revenuecatui.extensions.OverflowExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PackageExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PageControlExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyList;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyListKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMap;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMapKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PromoOfferResolver;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt;
import i1.C5015h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u009a\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u0084\u00012\u00020\u0001:\u0006\u0084\u0001\u0085\u0001\u0086\u0001B\u0083\u0001\u0012\"\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003j\u0002`\u00070\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\t\u0012\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u00030\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J6\u0010\u0017\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00182\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J4\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001a0\u00182\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020\u00152\b\b\u0002\u0010'\u001a\u00020\u0015J0\u0010(\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001a0\u00182\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010\u000bH\u0002J(\u0010-\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010.\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001a0\u0018*\u00020/2\u0006\u00100\u001a\u000201H\u0002J(\u00102\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u000103\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001a0\u0018*\u00020/2\u0006\u00104\u001a\u000205H\u0002J(\u00106\u001a\u0014\u0012\u0004\u0012\u00020.\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001a0\u0018*\u00020/2\b\u0010\u001d\u001a\u0004\u0018\u000107H\u0002J(\u00108\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u000109\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001a0\u0018*\u00020/2\u0006\u0010$\u001a\u00020:H\u0002J&\u0010;\u001a\u0014\u0012\u0004\u0012\u00020<\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001a0\u0018*\u00020/2\u0006\u0010$\u001a\u00020=H\u0002J&\u0010>\u001a\u0014\u0012\u0004\u0012\u00020?\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001a0\u0018*\u00020/2\u0006\u0010$\u001a\u00020@H\u0002J&\u0010A\u001a\u0014\u0012\u0004\u0012\u00020B\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001a0\u0018*\u00020/2\u0006\u0010$\u001a\u00020CH\u0002J&\u0010D\u001a\u0014\u0012\u0004\u0012\u00020E\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001a0\u0018*\u00020/2\u0006\u0010$\u001a\u00020FH\u0002J(\u0010G\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010H\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001a0\u0018*\u00020/2\u0006\u0010$\u001a\u00020%H\u0002J(\u0010I\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010J\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001a0\u0018*\u00020/2\u0006\u0010$\u001a\u00020KH\u0002J&\u0010L\u001a\u0014\u0012\u0004\u0012\u000209\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001a0\u0018*\u00020/2\u0006\u0010$\u001a\u00020MH\u0002J&\u0010N\u001a\u0014\u0012\u0004\u0012\u00020O\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001a0\u0018*\u00020/2\u0006\u0010$\u001a\u00020PH\u0002J&\u0010Q\u001a\u0014\u0012\u0004\u0012\u00020R\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001a0\u0018*\u00020/2\u0006\u0010$\u001a\u00020SH\u0002J&\u0010T\u001a\u0014\u0012\u0004\u0012\u00020U\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001a0\u0018*\u00020/2\u0006\u0010$\u001a\u00020VH\u0002J&\u0010W\u001a\u0014\u0012\u0004\u0012\u00020X\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001a0\u0018*\u00020/2\u0006\u0010$\u001a\u00020YH\u0002J&\u0010Z\u001a\u0014\u0012\u0004\u0012\u00020[\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001a0\u0018*\u00020/2\u0006\u0010$\u001a\u00020\\H\u0002J6\u0010]\u001a\u0014\u0012\u0004\u0012\u00020^\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001a0\u0018*\u00020/2\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020dH\u0002J&\u0010e\u001a\u0014\u0012\u0004\u0012\u00020b\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001a0\u0018*\u00020/2\u0006\u0010f\u001a\u00020gH\u0002J:\u0010h\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020^0\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001a0\u0018*\u00020/2\f\u0010i\u001a\b\u0012\u0004\u0012\u00020`0j2\u0006\u0010a\u001a\u00020bH\u0002J&\u0010k\u001a\u0014\u0012\u0004\u0012\u00020l\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001a0\u0018*\u00020/2\u0006\u0010$\u001a\u00020mH\u0002J&\u0010n\u001a\u0014\u0012\u0004\u0012\u00020o\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001a0\u0018*\u00020/2\u0006\u0010p\u001a\u00020qH\u0002J&\u0010r\u001a\u0014\u0012\u0004\u0012\u00020s\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001a0\u0018*\u00020/2\u0006\u0010$\u001a\u00020tH\u0002J&\u0010u\u001a\u0014\u0012\u0004\u0012\u00020v\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001a0\u0018*\u00020/2\u0006\u0010$\u001a\u00020wH\u0002J\u0016\u0010x\u001a\u0004\u0018\u00010y*\u00020\u00132\u0006\u0010z\u001a\u00020\u0011H\u0002J?\u0010{\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020|0\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020}0\u001a0\u0018*\u00020|2\b\u0010~\u001a\u0004\u0018\u00010\u0005H\u0002ø\u0001\u0000¢\u0006\u0005\b\u007f\u0010\u0080\u0001JB\u0010{\u001a\"\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u0004\u0012\u0005\u0012\u00030\u0081\u00010\u0003\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0082\u00010\u001a0\u0018*\u00030\u0081\u00012\b\u0010~\u001a\u0004\u0018\u00010\u0005H\u0002ø\u0001\u0000¢\u0006\u0005\b\u007f\u0010\u0083\u0001R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\tX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003j\u0002`\u00070\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0087\u0001"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory;", "", "localizations", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;", "Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/LocalizationDictionary;", "colorAliases", "", "Lcom/revenuecat/purchases/ColorAlias;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "fontAliases", "Lcom/revenuecat/purchases/FontAlias;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/FontSpec;", "variableLocalizations", "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;", "", "offering", "Lcom/revenuecat/purchases/Offering;", "stripRules", "", "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;Ljava/util/Map;Ljava/util/Map;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;Lcom/revenuecat/purchases/Offering;Z)V", "buttonComponentStyleUrlDestination", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$NavigateTo$Destination$Url;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$MissingStringLocalization;", "urlLid", "method", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "buttonComponentStyleUrlDestination-26kQY28", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "create", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleResult;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "component", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "applyBottomWindowInsets", "applyHorizontalWindowInsets", "createBackgroundStyles", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;", AppStateModule.APP_STATE_BACKGROUND, "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "backgroundColor", "convertAction", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope;", "action", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "convertDestination", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$NavigateTo$Destination;", "destination", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "convertPurchaseButtonMethod", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "createButtonComponentStyleOrNull", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent;", "createCarouselComponentStyle", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent;", "createCountdownComponentStyle", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CountdownComponentStyle;", "Lcom/revenuecat/purchases/paywalls/components/CountdownComponent;", "createIconComponentStyle", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;", "Lcom/revenuecat/purchases/paywalls/components/IconComponent;", "createImageComponentStyle", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ImageComponentStyle;", "Lcom/revenuecat/purchases/paywalls/components/ImageComponent;", "createInternal", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;", "createPackageComponentStyle", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/PackageComponentStyle;", "Lcom/revenuecat/purchases/paywalls/components/PackageComponent;", "createPurchaseButtonComponentStyle", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent;", "createStackComponentStyle", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "createStickyFooterComponentStyle", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StickyFooterComponentStyle;", "Lcom/revenuecat/purchases/paywalls/components/StickyFooterComponent;", "createTabControlButtonComponentStyle", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlButtonComponentStyle;", "Lcom/revenuecat/purchases/paywalls/components/TabControlButtonComponent;", "createTabControlToggleComponentStyle", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;", "Lcom/revenuecat/purchases/paywalls/components/TabControlToggleComponent;", "createTabsComponentStyle", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabsComponentStyle;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent;", "createTabsComponentStyleTab", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabsComponentStyle$Tab;", "componentTab", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$Tab;", "control", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlStyle;", "tabIndex", "", "createTabsComponentStyleTabControl", "componentControl", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl;", "createTabsComponentStyleTabs", "componentTabs", "", "createTextComponentStyle", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;", "Lcom/revenuecat/purchases/paywalls/components/TextComponent;", "createTimelineComponentItemStyle", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ItemStyle;", "item", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item;", "createTimelineComponentStyle", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle;", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;", "createVideoComponentStyle", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;", "Lcom/revenuecat/purchases/paywalls/components/VideoComponent;", "getPackageOrNull", "Lcom/revenuecat/purchases/Package;", "identifier", "withLocalizedOverrides", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$MissingImageLocalization;", "overrideSourceLid", "withLocalizedOverrides-TDPsjl0", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Ljava/lang/String;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$MissingVideoLocalization;", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;Ljava/lang/String;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Companion", "StyleFactoryScope", "StyleResult", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StyleFactory {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Shape.Rectangle DEFAULT_SHAPE = new Shape.Rectangle((CornerRadiuses) null, 1, (DefaultConstructorMarker) null);
    private static final float DEFAULT_SPACING = 0.0f;
    private static final boolean DEFAULT_VISIBILITY = true;
    private final Map<ColorAlias, ColorScheme> colorAliases;
    private final Map<FontAlias, FontSpec> fontAliases;
    private final NonEmptyMap<LocaleId, NonEmptyMap<LocalizationKey, LocalizationData>> localizations;
    private final Offering offering;
    private final boolean stripRules;
    private final NonEmptyMap<LocaleId, NonEmptyMap<VariableLocalizationKey, String>> variableLocalizations;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$Companion;", "", "()V", "DEFAULT_SHAPE", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape$Rectangle;", "getDEFAULT_SHAPE$revenuecatui_defaultsBc8Release", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shape$Rectangle;", "DEFAULT_SPACING", "", "DEFAULT_VISIBILITY", "", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Shape.Rectangle getDEFAULT_SHAPE$revenuecatui_defaultsBc8Release() {
            return StyleFactory.DEFAULT_SHAPE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001:\u0004\u0084\u0001\u0085\u0001B\u0085\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012 \b\u0002\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\r\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\rHÂ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\rHÂ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ;\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001c2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001c2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b \u0010!J/\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001c2\u0006\u0010\b\u001a\u00020\u00062\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\"\u0010#J7\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001c2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b$\u0010%JI\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'\"\u0004\b\u0000\u0010\u001c2\u0014\b\b\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u000eH\u0086\bø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u000f¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u00020-2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J#\u00102\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020-*\u00028\u00002\u0006\u00101\u001a\u00020\u0010¢\u0006\u0004\b2\u00103J#\u00104\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020-*\u00028\u00002\u0006\u00101\u001a\u00020\u0010¢\u0006\u0004\b4\u00103J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b;\u0010:J\u0012\u0010<\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b>\u0010?J\u008e\u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2 \b\u0002\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\r2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\rHÆ\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010C\u001a\u00020BHÖ\u0001¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bE\u0010FJ\u001a\u0010H\u001a\u00020\u00102\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bH\u0010IR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010J\u001a\u0004\bK\u00106\"\u0004\bL\u0010\u0018R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010M\u001a\u0004\bN\u00108\"\u0004\bO\u0010PR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010Q\u001a\u0004\bR\u0010:\"\u0004\bS\u0010TR$\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010Q\u001a\u0004\bU\u0010:\"\u0004\bV\u0010TR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010W\u001a\u0004\bX\u0010=\"\u0004\bY\u0010ZR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010[\u001a\u0004\b\\\u0010?\"\u0004\b]\u0010^R,\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010_R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010_R\u0017\u0010a\u001a\u00020`8\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR$\u0010e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010Q\u001a\u0004\bf\u0010:\"\u0004\bg\u0010TR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR&\u0010k\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020h0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010_R\u001b\u0010p\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bl\u0010m*\u0004\bn\u0010oR\u001b\u0010s\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bq\u0010m*\u0004\br\u0010oR\u0013\u0010w\u001a\u0004\u0018\u00010t8F¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0013\u0010{\u001a\u0004\u0018\u00010x8F¢\u0006\u0006\u001a\u0004\by\u0010zR\u0013\u0010\u007f\u001a\u0004\u0018\u00010|8F¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0015\u0010\u0083\u0001\u001a\u00030\u0080\u00018F¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0086\u0001"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope;", "", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$AvailablePackages$Info;", "packageInfo", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlStyle;", "tabControl", "", "tabControlIndex", "tabIndex", "Ljava/util/Date;", "countdownDate", "Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;", "countFrom", "", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "", "countPredicates", "countValues", "<init>", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$AvailablePackages$Info;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlStyle;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;Ljava/util/Map;Ljava/util/Map;)V", "pkg", "LTd/L;", "recordPackage", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$AvailablePackages$Info;)V", "component7", "()Ljava/util/Map;", "component8", "T", "block", "withSelectedScope", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$AvailablePackages$Info;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "withTabControl", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlStyle;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "withTabIndex", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "withCountdown", "(Ljava/util/Date;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "predicate", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WithCount;", "withCount", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WithCount;", "component", "recordComponent", "(Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;", "to", "applyTopWindowInsetsIfNotYetApplied", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;", "shouldApply", "applyBottomWindowInsetsIfNecessary", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;Z)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;", "applyHorizontalWindowInsetsIfNecessary", "component1", "()Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$AvailablePackages$Info;", "component2", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlStyle;", "component3", "()Ljava/lang/Integer;", "component4", "component5", "()Ljava/util/Date;", "component6", "()Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;", "copy", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$AvailablePackages$Info;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlStyle;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;Ljava/util/Map;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$AvailablePackages$Info;", "getPackageInfo", "setPackageInfo", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlStyle;", "getTabControl", "setTabControl", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlStyle;)V", "Ljava/lang/Integer;", "getTabControlIndex", "setTabControlIndex", "(Ljava/lang/Integer;)V", "getTabIndex", "setTabIndex", "Ljava/util/Date;", "getCountdownDate", "setCountdownDate", "(Ljava/util/Date;)V", "Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;", "getCountFrom", "setCountFrom", "(Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;)V", "Ljava/util/Map;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WindowInsetsState;", "windowInsetsState", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WindowInsetsState;", "getWindowInsetsState", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WindowInsetsState;", "defaultTabIndex", "getDefaultTabIndex", "setDefaultTabIndex", "", "packagesOutsideTabs", "Ljava/util/List;", "packagesByTab", "getApplyTopWindowInsets", "()Z", "getApplyTopWindowInsets$delegate", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope;)Ljava/lang/Object;", "applyTopWindowInsets", "getIgnoreTopWindowInsets", "getIgnoreTopWindowInsets$delegate", "ignoreTopWindowInsets", "Lcom/revenuecat/purchases/Package;", "getRcPackage", "()Lcom/revenuecat/purchases/Package;", "rcPackage", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "getResolvedOffer", "()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "resolvedOffer", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "getOfferEligibility", "()Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "offerEligibility", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$AvailablePackages;", "getPackages", "()Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$AvailablePackages;", "packages", "WindowInsetsState", "WithCount", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final /* data */ class StyleFactoryScope {
        private CountdownComponent.CountFrom countFrom;
        private final Map<Integer, Function1> countPredicates;
        private final Map<Integer, Integer> countValues;
        private Date countdownDate;
        private Integer defaultTabIndex;
        private PaywallState.Loaded.Components.AvailablePackages.Info packageInfo;
        private final Map<Integer, List<PaywallState.Loaded.Components.AvailablePackages.Info>> packagesByTab;
        private final List<PaywallState.Loaded.Components.AvailablePackages.Info> packagesOutsideTabs;
        private TabControlStyle tabControl;
        private Integer tabControlIndex;
        private Integer tabIndex;
        private final WindowInsetsState windowInsetsState;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u0016\u0010\u0016\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u000bR\u0018\u0010\u0017\u001a\u00020\t*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u00020\t*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018R\u0018\u0010\u001a\u001a\u00020\t*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WindowInsetsState;", "", "<init>", "()V", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "component", "LTd/L;", "handleHeaderMediaViewWindowInsets", "(Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;)V", "", "applyTopWindowInsets", "Z", "getApplyTopWindowInsets", "()Z", "setApplyTopWindowInsets", "(Z)V", "ignoreTopWindowInsets", "getIgnoreTopWindowInsets", "setIgnoreTopWindowInsets", "topWindowInsetsApplied", "getTopWindowInsetsApplied", "setTopWindowInsetsApplied", "stillLookingForHeaderMedia", "isHeaderMedia", "(Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;)Z", "isHeaderImage", "isHeaderVideo", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        private static final class WindowInsetsState {
            private boolean applyTopWindowInsets;
            private boolean ignoreTopWindowInsets;
            private boolean stillLookingForHeaderMedia = true;
            private boolean topWindowInsetsApplied;

            private final boolean isHeaderImage(PaywallComponent paywallComponent) {
                boolean z10;
                if (paywallComponent instanceof ImageComponent) {
                    SizeConstraint width = ((ImageComponent) paywallComponent).getSize().getWidth();
                    if (width instanceof SizeConstraint.Fill) {
                        z10 = true;
                    } else {
                        if (!(width instanceof SizeConstraint.Fit ? true : width instanceof SizeConstraint.Fixed)) {
                            throw new r();
                        }
                        z10 = false;
                    }
                    if (z10) {
                        return true;
                    }
                }
                return false;
            }

            private final boolean isHeaderMedia(PaywallComponent paywallComponent) {
                return isHeaderImage(paywallComponent) || isHeaderVideo(paywallComponent);
            }

            private final boolean isHeaderVideo(PaywallComponent paywallComponent) {
                boolean z10;
                if (paywallComponent instanceof VideoComponent) {
                    SizeConstraint width = ((VideoComponent) paywallComponent).getSize().getWidth();
                    if (width instanceof SizeConstraint.Fill) {
                        z10 = true;
                    } else {
                        if (!(width instanceof SizeConstraint.Fit ? true : width instanceof SizeConstraint.Fixed)) {
                            throw new r();
                        }
                        z10 = false;
                    }
                    if (z10) {
                        return true;
                    }
                }
                return false;
            }

            public final boolean getApplyTopWindowInsets() {
                boolean z10 = this.applyTopWindowInsets;
                this.applyTopWindowInsets = false;
                return z10;
            }

            public final boolean getIgnoreTopWindowInsets() {
                boolean z10 = this.ignoreTopWindowInsets;
                this.ignoreTopWindowInsets = false;
                return z10;
            }

            public final boolean getTopWindowInsetsApplied() {
                return this.topWindowInsetsApplied;
            }

            public final void handleHeaderMediaViewWindowInsets(PaywallComponent component) {
                AbstractC5504s.h(component, "component");
                boolean z10 = false;
                if (!(component instanceof StackComponent)) {
                    if (component instanceof ImageComponent) {
                        if (this.stillLookingForHeaderMedia) {
                            this.ignoreTopWindowInsets = isHeaderImage(component);
                        }
                        this.stillLookingForHeaderMedia = false;
                        return;
                    } else {
                        if (!(component instanceof VideoComponent)) {
                            this.stillLookingForHeaderMedia = false;
                            return;
                        }
                        if (this.stillLookingForHeaderMedia) {
                            this.ignoreTopWindowInsets = isHeaderVideo(component);
                        }
                        this.stillLookingForHeaderMedia = false;
                        return;
                    }
                }
                if (this.stillLookingForHeaderMedia) {
                    StackComponent stackComponent = (StackComponent) component;
                    Dimension dimension = stackComponent.getDimension();
                    if (dimension instanceof Dimension.ZLayer) {
                        PaywallComponent paywallComponent = (PaywallComponent) AbstractC2279u.o0(stackComponent.getComponents());
                        if (paywallComponent != null && isHeaderMedia(paywallComponent)) {
                            z10 = true;
                        }
                        this.topWindowInsetsApplied = z10;
                    } else {
                        if (!(dimension instanceof Dimension.Horizontal ? true : dimension instanceof Dimension.Vertical)) {
                            throw new r();
                        }
                    }
                    this.applyTopWindowInsets = z10;
                }
            }

            public final void setApplyTopWindowInsets(boolean z10) {
                this.applyTopWindowInsets = z10;
            }

            public final void setIgnoreTopWindowInsets(boolean z10) {
                this.ignoreTopWindowInsets = z10;
            }

            public final void setTopWindowInsetsApplied(boolean z10) {
                this.topWindowInsetsApplied = z10;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\r\u001a\u00020\u0005HÆ\u0003J(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WithCount;", "T", "", "value", "count", "", "(Ljava/lang/Object;I)V", "getCount", "()I", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(Ljava/lang/Object;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope$WithCount;", "equals", "", "other", "hashCode", "toString", "", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class WithCount<T> {
            public static final int $stable = 0;
            private final int count;
            private final T value;

            public WithCount(T t10, int i10) {
                this.value = t10;
                this.count = i10;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ WithCount copy$default(WithCount withCount, Object obj, int i10, int i11, Object obj2) {
                if ((i11 & 1) != 0) {
                    obj = withCount.value;
                }
                if ((i11 & 2) != 0) {
                    i10 = withCount.count;
                }
                return withCount.copy(obj, i10);
            }

            public final T component1() {
                return this.value;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final int getCount() {
                return this.count;
            }

            public final WithCount<T> copy(T value, int count) {
                return new WithCount<>(value, count);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof WithCount)) {
                    return false;
                }
                WithCount withCount = (WithCount) other;
                return AbstractC5504s.c(this.value, withCount.value) && this.count == withCount.count;
            }

            public final int getCount() {
                return this.count;
            }

            public final T getValue() {
                return this.value;
            }

            public int hashCode() {
                T t10 = this.value;
                return ((t10 == null ? 0 : t10.hashCode()) * 31) + Integer.hashCode(this.count);
            }

            public String toString() {
                return "WithCount(value=" + this.value + ", count=" + this.count + ')';
            }
        }

        public StyleFactoryScope() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        private final Map<Integer, Function1> component7() {
            return this.countPredicates;
        }

        private final Map<Integer, Integer> component8() {
            return this.countValues;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StyleFactoryScope copy$default(StyleFactoryScope styleFactoryScope, PaywallState.Loaded.Components.AvailablePackages.Info info, TabControlStyle tabControlStyle, Integer num, Integer num2, Date date, CountdownComponent.CountFrom countFrom, Map map, Map map2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                info = styleFactoryScope.packageInfo;
            }
            if ((i10 & 2) != 0) {
                tabControlStyle = styleFactoryScope.tabControl;
            }
            if ((i10 & 4) != 0) {
                num = styleFactoryScope.tabControlIndex;
            }
            if ((i10 & 8) != 0) {
                num2 = styleFactoryScope.tabIndex;
            }
            if ((i10 & 16) != 0) {
                date = styleFactoryScope.countdownDate;
            }
            if ((i10 & 32) != 0) {
                countFrom = styleFactoryScope.countFrom;
            }
            if ((i10 & 64) != 0) {
                map = styleFactoryScope.countPredicates;
            }
            if ((i10 & 128) != 0) {
                map2 = styleFactoryScope.countValues;
            }
            Map map3 = map;
            Map map4 = map2;
            Date date2 = date;
            CountdownComponent.CountFrom countFrom2 = countFrom;
            return styleFactoryScope.copy(info, tabControlStyle, num, num2, date2, countFrom2, map3, map4);
        }

        private final void recordPackage(PaywallState.Loaded.Components.AvailablePackages.Info pkg) {
            Integer num = this.tabIndex;
            if (num == null) {
                this.packagesOutsideTabs.add(pkg);
                return;
            }
            Map<Integer, List<PaywallState.Loaded.Components.AvailablePackages.Info>> map = this.packagesByTab;
            List<PaywallState.Loaded.Components.AvailablePackages.Info> arrayList = map.get(num);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map.put(num, arrayList);
            }
            arrayList.add(pkg);
        }

        public final <T extends ComponentStyle> T applyBottomWindowInsetsIfNecessary(T t10, boolean z10) {
            T tCopy = t10;
            AbstractC5504s.h(tCopy, "<this>");
            if (z10) {
                if (tCopy instanceof StackComponentStyle) {
                    tCopy = StackComponentStyle.m527copyKMZiVUk$default((StackComponentStyle) tCopy, null, null, false, null, StyleFactory.DEFAULT_SPACING, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, true, false, 6291455, null);
                } else if (tCopy instanceof StickyFooterComponentStyle) {
                    StickyFooterComponentStyle stickyFooterComponentStyle = (StickyFooterComponentStyle) tCopy;
                    tCopy = stickyFooterComponentStyle.copy(StackComponentStyle.m527copyKMZiVUk$default(stickyFooterComponentStyle.getStackComponentStyle(), null, null, false, null, StyleFactory.DEFAULT_SPACING, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, true, false, 6291455, null));
                }
                AbstractC5504s.f(tCopy, "null cannot be cast to non-null type T of com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory.StyleFactoryScope.applyBottomWindowInsetsIfNecessary");
            }
            return tCopy;
        }

        public final <T extends ComponentStyle> T applyHorizontalWindowInsetsIfNecessary(T t10, boolean z10) {
            T tCopy = t10;
            AbstractC5504s.h(tCopy, "<this>");
            if (z10) {
                if (tCopy instanceof StackComponentStyle) {
                    tCopy = StackComponentStyle.m527copyKMZiVUk$default((StackComponentStyle) tCopy, null, null, false, null, StyleFactory.DEFAULT_SPACING, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, true, 4194303, null);
                } else if (tCopy instanceof StickyFooterComponentStyle) {
                    StickyFooterComponentStyle stickyFooterComponentStyle = (StickyFooterComponentStyle) tCopy;
                    tCopy = stickyFooterComponentStyle.copy(StackComponentStyle.m527copyKMZiVUk$default(stickyFooterComponentStyle.getStackComponentStyle(), null, null, false, null, StyleFactory.DEFAULT_SPACING, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, true, 4194303, null));
                }
                AbstractC5504s.f(tCopy, "null cannot be cast to non-null type T of com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory.StyleFactoryScope.applyHorizontalWindowInsetsIfNecessary");
            }
            return tCopy;
        }

        public final ComponentStyle applyTopWindowInsetsIfNotYetApplied(ComponentStyle to) {
            AbstractC5504s.h(to, "to");
            return to instanceof StackComponentStyle ? StackComponentStyle.m527copyKMZiVUk$default((StackComponentStyle) to, null, null, false, null, StyleFactory.DEFAULT_SPACING, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, !this.windowInsetsState.getTopWindowInsetsApplied(), false, false, 7340031, null) : to;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final PaywallState.Loaded.Components.AvailablePackages.Info getPackageInfo() {
            return this.packageInfo;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final TabControlStyle getTabControl() {
            return this.tabControl;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getTabControlIndex() {
            return this.tabControlIndex;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Integer getTabIndex() {
            return this.tabIndex;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Date getCountdownDate() {
            return this.countdownDate;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final CountdownComponent.CountFrom getCountFrom() {
            return this.countFrom;
        }

        public final StyleFactoryScope copy(PaywallState.Loaded.Components.AvailablePackages.Info packageInfo, TabControlStyle tabControl, Integer tabControlIndex, Integer tabIndex, Date countdownDate, CountdownComponent.CountFrom countFrom, Map<Integer, Function1> countPredicates, Map<Integer, Integer> countValues) {
            AbstractC5504s.h(countFrom, "countFrom");
            AbstractC5504s.h(countPredicates, "countPredicates");
            AbstractC5504s.h(countValues, "countValues");
            return new StyleFactoryScope(packageInfo, tabControl, tabControlIndex, tabIndex, countdownDate, countFrom, countPredicates, countValues);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StyleFactoryScope)) {
                return false;
            }
            StyleFactoryScope styleFactoryScope = (StyleFactoryScope) other;
            return AbstractC5504s.c(this.packageInfo, styleFactoryScope.packageInfo) && AbstractC5504s.c(this.tabControl, styleFactoryScope.tabControl) && AbstractC5504s.c(this.tabControlIndex, styleFactoryScope.tabControlIndex) && AbstractC5504s.c(this.tabIndex, styleFactoryScope.tabIndex) && AbstractC5504s.c(this.countdownDate, styleFactoryScope.countdownDate) && this.countFrom == styleFactoryScope.countFrom && AbstractC5504s.c(this.countPredicates, styleFactoryScope.countPredicates) && AbstractC5504s.c(this.countValues, styleFactoryScope.countValues);
        }

        public final boolean getApplyTopWindowInsets() {
            return this.windowInsetsState.getApplyTopWindowInsets();
        }

        public final CountdownComponent.CountFrom getCountFrom() {
            return this.countFrom;
        }

        public final Date getCountdownDate() {
            return this.countdownDate;
        }

        public final Integer getDefaultTabIndex() {
            return this.defaultTabIndex;
        }

        public final boolean getIgnoreTopWindowInsets() {
            return this.windowInsetsState.getIgnoreTopWindowInsets();
        }

        public final OfferEligibility getOfferEligibility() {
            PaywallState.Loaded.Components.AvailablePackages.Info info = this.packageInfo;
            if (info != null) {
                return PackageExtensionsKt.calculateOfferEligibility(info.getResolvedOffer(), info.getPkg());
            }
            return null;
        }

        public final PaywallState.Loaded.Components.AvailablePackages.Info getPackageInfo() {
            return this.packageInfo;
        }

        public final PaywallState.Loaded.Components.AvailablePackages getPackages() {
            return new PaywallState.Loaded.Components.AvailablePackages(this.packagesOutsideTabs, this.packagesByTab);
        }

        public final Package getRcPackage() {
            PaywallState.Loaded.Components.AvailablePackages.Info info = this.packageInfo;
            if (info != null) {
                return info.getPkg();
            }
            return null;
        }

        public final ResolvedOffer getResolvedOffer() {
            PaywallState.Loaded.Components.AvailablePackages.Info info = this.packageInfo;
            if (info != null) {
                return info.getResolvedOffer();
            }
            return null;
        }

        public final TabControlStyle getTabControl() {
            return this.tabControl;
        }

        public final Integer getTabControlIndex() {
            return this.tabControlIndex;
        }

        public final Integer getTabIndex() {
            return this.tabIndex;
        }

        public final WindowInsetsState getWindowInsetsState() {
            return this.windowInsetsState;
        }

        public int hashCode() {
            PaywallState.Loaded.Components.AvailablePackages.Info info = this.packageInfo;
            int iHashCode = (info == null ? 0 : info.hashCode()) * 31;
            TabControlStyle tabControlStyle = this.tabControl;
            int iHashCode2 = (iHashCode + (tabControlStyle == null ? 0 : tabControlStyle.hashCode())) * 31;
            Integer num = this.tabControlIndex;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.tabIndex;
            int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Date date = this.countdownDate;
            return ((((((iHashCode4 + (date != null ? date.hashCode() : 0)) * 31) + this.countFrom.hashCode()) * 31) + this.countPredicates.hashCode()) * 31) + this.countValues.hashCode();
        }

        public final void recordComponent(PaywallComponent component) {
            AbstractC5504s.h(component, "component");
            for (Map.Entry<Integer, Function1> entry : this.countPredicates.entrySet()) {
                int iIntValue = entry.getKey().intValue();
                if (((Boolean) entry.getValue().invoke(component)).booleanValue()) {
                    Integer num = this.countValues.get(Integer.valueOf(iIntValue));
                    this.countValues.put(Integer.valueOf(iIntValue), Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                }
            }
            this.windowInsetsState.handleHeaderMediaViewWindowInsets(component);
        }

        public final void setCountFrom(CountdownComponent.CountFrom countFrom) {
            AbstractC5504s.h(countFrom, "<set-?>");
            this.countFrom = countFrom;
        }

        public final void setCountdownDate(Date date) {
            this.countdownDate = date;
        }

        public final void setDefaultTabIndex(Integer num) {
            this.defaultTabIndex = num;
        }

        public final void setPackageInfo(PaywallState.Loaded.Components.AvailablePackages.Info info) {
            this.packageInfo = info;
        }

        public final void setTabControl(TabControlStyle tabControlStyle) {
            this.tabControl = tabControlStyle;
        }

        public final void setTabControlIndex(Integer num) {
            this.tabControlIndex = num;
        }

        public final void setTabIndex(Integer num) {
            this.tabIndex = num;
        }

        public String toString() {
            return "StyleFactoryScope(packageInfo=" + this.packageInfo + ", tabControl=" + this.tabControl + ", tabControlIndex=" + this.tabControlIndex + ", tabIndex=" + this.tabIndex + ", countdownDate=" + this.countdownDate + ", countFrom=" + this.countFrom + ", countPredicates=" + this.countPredicates + ", countValues=" + this.countValues + ')';
        }

        public final <T> WithCount<T> withCount(Function1 predicate, Function1 block) {
            AbstractC5504s.h(predicate, "predicate");
            AbstractC5504s.h(block, "block");
            Integer num = (Integer) AbstractC2279u.C0(this.countPredicates.keySet());
            int iIntValue = (num != null ? num.intValue() : -1) + 1;
            this.countPredicates.put(Integer.valueOf(iIntValue), predicate);
            this.countValues.put(Integer.valueOf(iIntValue), 0);
            WithCount<T> withCount = new WithCount<>(block.invoke(this), ((Number) S.j(this.countValues, Integer.valueOf(iIntValue))).intValue());
            this.countPredicates.remove(Integer.valueOf(iIntValue));
            this.countValues.remove(Integer.valueOf(iIntValue));
            return withCount;
        }

        public final <T> T withCountdown(Date countdownDate, CountdownComponent.CountFrom countFrom, Function1 block) {
            AbstractC5504s.h(countdownDate, "countdownDate");
            AbstractC5504s.h(countFrom, "countFrom");
            AbstractC5504s.h(block, "block");
            StyleFactoryScope styleFactoryScopeCopy$default = copy$default(this, null, null, null, null, null, null, null, null, 255, null);
            this.countdownDate = countdownDate;
            this.countFrom = countFrom;
            T t10 = (T) block.invoke(this);
            this.countdownDate = styleFactoryScopeCopy$default.countdownDate;
            this.countFrom = styleFactoryScopeCopy$default.countFrom;
            return t10;
        }

        public final <T> T withSelectedScope(PaywallState.Loaded.Components.AvailablePackages.Info packageInfo, Integer tabControlIndex, Function1 block) {
            AbstractC5504s.h(block, "block");
            if (packageInfo != null) {
                recordPackage(packageInfo);
            }
            StyleFactoryScope styleFactoryScopeCopy$default = copy$default(this, null, null, null, null, null, null, null, null, 255, null);
            this.packageInfo = packageInfo;
            this.tabControlIndex = tabControlIndex;
            T t10 = (T) block.invoke(this);
            this.packageInfo = styleFactoryScopeCopy$default.packageInfo;
            this.tabControlIndex = styleFactoryScopeCopy$default.tabControlIndex;
            return t10;
        }

        public final <T> T withTabControl(TabControlStyle tabControl, Function1 block) {
            AbstractC5504s.h(tabControl, "tabControl");
            AbstractC5504s.h(block, "block");
            StyleFactoryScope styleFactoryScopeCopy$default = copy$default(this, null, null, null, null, null, null, null, null, 255, null);
            this.tabControl = tabControl;
            T t10 = (T) block.invoke(this);
            this.tabControl = styleFactoryScopeCopy$default.tabControl;
            return t10;
        }

        public final <T> T withTabIndex(int tabIndex, Function1 block) {
            AbstractC5504s.h(block, "block");
            StyleFactoryScope styleFactoryScopeCopy$default = copy$default(this, null, null, null, null, null, null, null, null, 255, null);
            this.tabIndex = Integer.valueOf(tabIndex);
            T t10 = (T) block.invoke(this);
            this.tabIndex = styleFactoryScopeCopy$default.tabIndex;
            return t10;
        }

        public StyleFactoryScope(PaywallState.Loaded.Components.AvailablePackages.Info info, TabControlStyle tabControlStyle, Integer num, Integer num2, Date date, CountdownComponent.CountFrom countFrom, Map<Integer, Function1> countPredicates, Map<Integer, Integer> countValues) {
            AbstractC5504s.h(countFrom, "countFrom");
            AbstractC5504s.h(countPredicates, "countPredicates");
            AbstractC5504s.h(countValues, "countValues");
            this.packageInfo = info;
            this.tabControl = tabControlStyle;
            this.tabControlIndex = num;
            this.tabIndex = num2;
            this.countdownDate = date;
            this.countFrom = countFrom;
            this.countPredicates = countPredicates;
            this.countValues = countValues;
            this.windowInsetsState = new WindowInsetsState();
            this.packagesOutsideTabs = new ArrayList();
            this.packagesByTab = new LinkedHashMap();
        }

        public /* synthetic */ StyleFactoryScope(PaywallState.Loaded.Components.AvailablePackages.Info info, TabControlStyle tabControlStyle, Integer num, Integer num2, Date date, CountdownComponent.CountFrom countFrom, Map map, Map map2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : info, (i10 & 2) != 0 ? null : tabControlStyle, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : num2, (i10 & 16) != 0 ? null : date, (i10 & 32) != 0 ? CountdownComponent.CountFrom.DAYS : countFrom, (i10 & 64) != 0 ? new LinkedHashMap() : map, (i10 & 128) != 0 ? new LinkedHashMap() : map2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleResult;", "", "componentStyle", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;", "availablePackages", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$AvailablePackages;", "defaultTabIndex", "", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$AvailablePackages;Ljava/lang/Integer;)V", "getAvailablePackages", "()Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$AvailablePackages;", "getComponentStyle", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;", "getDefaultTabIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class StyleResult {
        public static final int $stable = 0;
        private final PaywallState.Loaded.Components.AvailablePackages availablePackages;
        private final ComponentStyle componentStyle;
        private final Integer defaultTabIndex;

        public StyleResult(ComponentStyle componentStyle, PaywallState.Loaded.Components.AvailablePackages availablePackages, Integer num) {
            AbstractC5504s.h(componentStyle, "componentStyle");
            AbstractC5504s.h(availablePackages, "availablePackages");
            this.componentStyle = componentStyle;
            this.availablePackages = availablePackages;
            this.defaultTabIndex = num;
        }

        public final PaywallState.Loaded.Components.AvailablePackages getAvailablePackages() {
            return this.availablePackages;
        }

        public final ComponentStyle getComponentStyle() {
            return this.componentStyle;
        }

        public final Integer getDefaultTabIndex() {
            return this.defaultTabIndex;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonComponent.UrlMethod.values().length];
            try {
                iArr[ButtonComponent.UrlMethod.IN_APP_BROWSER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonComponent.UrlMethod.EXTERNAL_BROWSER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonComponent.UrlMethod.DEEP_LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonComponent.UrlMethod.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory$createCarouselComponentStyle$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedCarouselPartial;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "partial", "Lcom/revenuecat/purchases/paywalls/components/PartialCarouselComponent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Result<PresentedCarouselPartial, NonEmptyList<PaywallValidationError>> invoke(PartialCarouselComponent partial) {
            AbstractC5504s.h(partial, "partial");
            return PresentedCarouselPartial.INSTANCE.invoke(partial, StyleFactory.this.colorAliases);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory$createCountdownComponentStyle$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CountdownComponentStyle;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42621 extends AbstractC5506u implements Function1 {
        final /* synthetic */ CountdownComponent $component;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42621(CountdownComponent countdownComponent) {
            super(1);
            this.$component = countdownComponent;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Result<CountdownComponentStyle, NonEmptyList<PaywallValidationError>> invoke(StyleFactoryScope withCountdown) {
            AbstractC5504s.h(withCountdown, "$this$withCountdown");
            Result resultCreateStackComponentStyle = StyleFactory.this.createStackComponentStyle(withCountdown, this.$component.getCountdownStack());
            StackComponent endStack = this.$component.getEndStack();
            Result resultOrSuccessfullyNull = ResultKt.orSuccessfullyNull(endStack != null ? StyleFactory.this.createStackComponentStyle(withCountdown, endStack) : null);
            StackComponent fallback = this.$component.getFallback();
            Result resultOrSuccessfullyNull2 = ResultKt.orSuccessfullyNull(fallback != null ? StyleFactory.this.createStackComponentStyle(withCountdown, fallback) : null);
            CountdownComponent countdownComponent = this.$component;
            L l10 = L.f17438a;
            Result.Success success = new Result.Success(l10);
            Result.Success success2 = new Result.Success(l10);
            Result.Success success3 = new Result.Success(l10);
            NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.collectErrors(AbstractC2279u.p(resultCreateStackComponentStyle, resultOrSuccessfullyNull, resultOrSuccessfullyNull2, success, success2, success3)));
            if (nonEmptyListOrNull != null) {
                return new Result.Error(nonEmptyListOrNull);
            }
            AbstractC5504s.f(resultCreateStackComponentStyle, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
            Object value = ((Result.Success) resultCreateStackComponentStyle).getValue();
            AbstractC5504s.f(resultOrSuccessfullyNull, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<B of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
            Object value2 = ((Result.Success) resultOrSuccessfullyNull).getValue();
            AbstractC5504s.f(resultOrSuccessfullyNull2, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<C of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
            Object value3 = ((Result.Success) resultOrSuccessfullyNull2).getValue();
            Object value4 = success.getValue();
            Object value5 = success2.getValue();
            return new Result.Success(new CountdownComponentStyle(countdownComponent.getStyle().getDate(), countdownComponent.getCountFrom(), (StackComponentStyle) value, (StackComponentStyle) value2, (StackComponentStyle) value3));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory$createIconComponentStyle$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "partial", "Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42631 extends AbstractC5506u implements Function1 {
        C42631() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Result<PresentedIconPartial, NonEmptyList<PaywallValidationError>> invoke(PartialIconComponent partial) {
            AbstractC5504s.h(partial, "partial");
            return PresentedIconPartial.INSTANCE.invoke(partial, StyleFactory.this.colorAliases);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory$createImageComponentStyle$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedImagePartial;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "it", "Lcom/revenuecat/purchases/paywalls/components/PartialImageComponent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42641 extends AbstractC5506u implements Function1 {
        C42641() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Result<PresentedImagePartial, NonEmptyList<PaywallValidationError>> invoke(PartialImageComponent it) {
            AbstractC5504s.h(it, "it");
            ThemeImageUrls source = it.getSource();
            Result<PresentedImagePartial, NonEmptyList<PaywallValidationError>> resultOrSuccessfullyNull = ResultKt.orSuccessfullyNull(source != null ? StyleFactory.this.m534withLocalizedOverridesTDPsjl0(source, it.getOverrideSourceLid()) : null);
            StyleFactory styleFactory = StyleFactory.this;
            if (resultOrSuccessfullyNull instanceof Result.Success) {
                return PresentedImagePartial.INSTANCE.invoke(it, (NonEmptyMap) ((Result.Success) resultOrSuccessfullyNull).getValue(), styleFactory.colorAliases);
            }
            if (resultOrSuccessfullyNull instanceof Result.Error) {
                return resultOrSuccessfullyNull;
            }
            throw new r();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory$createStackComponentStyle$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedStackPartial;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "partial", "Lcom/revenuecat/purchases/paywalls/components/PartialStackComponent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42651 extends AbstractC5506u implements Function1 {
        final /* synthetic */ StyleFactoryScope $this_createStackComponentStyle;

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory$createStackComponentStyle$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "stackComponent", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class C06821 extends AbstractC5506u implements Function1 {
            final /* synthetic */ StyleFactoryScope $this_createStackComponentStyle;
            final /* synthetic */ StyleFactory this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06821(StyleFactory styleFactory, StyleFactoryScope styleFactoryScope) {
                super(1);
                this.this$0 = styleFactory;
                this.$this_createStackComponentStyle = styleFactoryScope;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Result<StackComponentStyle, NonEmptyList<PaywallValidationError>> invoke(StackComponent stackComponent) {
                AbstractC5504s.h(stackComponent, "stackComponent");
                return this.this$0.createStackComponentStyle(this.$this_createStackComponentStyle, stackComponent);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42651(StyleFactoryScope styleFactoryScope) {
            super(1);
            this.$this_createStackComponentStyle = styleFactoryScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Result<PresentedStackPartial, NonEmptyList<PaywallValidationError>> invoke(PartialStackComponent partial) {
            AbstractC5504s.h(partial, "partial");
            return PresentedStackPartial.INSTANCE.invoke(partial, StyleFactory.this.colorAliases, new C06821(StyleFactory.this, this.$this_createStackComponentStyle));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory$createStackComponentStyle$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "stackComponent", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass6 extends AbstractC5506u implements Function1 {
        final /* synthetic */ StyleFactoryScope $this_createStackComponentStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(StyleFactoryScope styleFactoryScope) {
            super(1);
            this.$this_createStackComponentStyle = styleFactoryScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Result<StackComponentStyle, NonEmptyList<PaywallValidationError>> invoke(StackComponent stackComponent) {
            AbstractC5504s.h(stackComponent, "stackComponent");
            return StyleFactory.this.createStackComponentStyle(this.$this_createStackComponentStyle, stackComponent);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory$createStickyFooterComponentStyle$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StickyFooterComponentStyle;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42661 extends AbstractC5506u implements Function1 {
        final /* synthetic */ StickyFooterComponent $component;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42661(StickyFooterComponent stickyFooterComponent) {
            super(1);
            this.$component = stickyFooterComponent;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Result<StickyFooterComponentStyle, NonEmptyList<PaywallValidationError>> invoke(StyleFactoryScope withSelectedScope) {
            AbstractC5504s.h(withSelectedScope, "$this$withSelectedScope");
            Result<StickyFooterComponentStyle, NonEmptyList<PaywallValidationError>> resultCreateStackComponentStyle = StyleFactory.this.createStackComponentStyle(withSelectedScope, this.$component.getStack());
            if (resultCreateStackComponentStyle instanceof Result.Success) {
                return new Result.Success(new StickyFooterComponentStyle((StackComponentStyle) ((Result.Success) resultCreateStackComponentStyle).getValue()));
            }
            if (resultCreateStackComponentStyle instanceof Result.Error) {
                return resultCreateStackComponentStyle;
            }
            throw new r();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory$createTabControlButtonComponentStyle$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlButtonComponentStyle;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42671 extends AbstractC5506u implements Function1 {
        final /* synthetic */ TabControlButtonComponent $component;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42671(TabControlButtonComponent tabControlButtonComponent) {
            super(1);
            this.$component = tabControlButtonComponent;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Result<TabControlButtonComponentStyle, NonEmptyList<PaywallValidationError>> invoke(StyleFactoryScope withSelectedScope) {
            AbstractC5504s.h(withSelectedScope, "$this$withSelectedScope");
            withSelectedScope.setDefaultTabIndex(0);
            Result<TabControlButtonComponentStyle, NonEmptyList<PaywallValidationError>> resultCreateStackComponentStyle = StyleFactory.this.createStackComponentStyle(withSelectedScope, this.$component.getStack());
            TabControlButtonComponent tabControlButtonComponent = this.$component;
            if (resultCreateStackComponentStyle instanceof Result.Success) {
                return new Result.Success(new TabControlButtonComponentStyle(tabControlButtonComponent.getTabIndex(), (StackComponentStyle) ((Result.Success) resultCreateStackComponentStyle).getValue()));
            }
            if (resultCreateStackComponentStyle instanceof Result.Error) {
                return resultCreateStackComponentStyle;
            }
            throw new r();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory$createTabsComponentStyleTab$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabsComponentStyle$Tab;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42681 extends AbstractC5506u implements Function1 {
        final /* synthetic */ TabsComponent.Tab $componentTab;
        final /* synthetic */ TabControlStyle $control;
        final /* synthetic */ int $tabIndex;
        final /* synthetic */ StyleFactory this$0;

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory$createTabsComponentStyleTab$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabsComponentStyle$Tab;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class C06831 extends AbstractC5506u implements Function1 {
            final /* synthetic */ TabsComponent.Tab $componentTab;
            final /* synthetic */ TabControlStyle $control;
            final /* synthetic */ StyleFactory this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory$createTabsComponentStyleTab$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabsComponentStyle$Tab;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
            static final class C06841 extends AbstractC5506u implements Function1 {
                final /* synthetic */ TabsComponent.Tab $componentTab;
                final /* synthetic */ StyleFactory this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C06841(StyleFactory styleFactory, TabsComponent.Tab tab) {
                    super(1);
                    this.this$0 = styleFactory;
                    this.$componentTab = tab;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Result<TabsComponentStyle.Tab, NonEmptyList<PaywallValidationError>> invoke(StyleFactoryScope withTabControl) {
                    AbstractC5504s.h(withTabControl, "$this$withTabControl");
                    Result<TabsComponentStyle.Tab, NonEmptyList<PaywallValidationError>> resultCreateStackComponentStyle = this.this$0.createStackComponentStyle(withTabControl, this.$componentTab.getStack());
                    if (resultCreateStackComponentStyle instanceof Result.Success) {
                        return new Result.Success(new TabsComponentStyle.Tab((StackComponentStyle) ((Result.Success) resultCreateStackComponentStyle).getValue()));
                    }
                    if (resultCreateStackComponentStyle instanceof Result.Error) {
                        return resultCreateStackComponentStyle;
                    }
                    throw new r();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06831(TabControlStyle tabControlStyle, StyleFactory styleFactory, TabsComponent.Tab tab) {
                super(1);
                this.$control = tabControlStyle;
                this.this$0 = styleFactory;
                this.$componentTab = tab;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Result<TabsComponentStyle.Tab, NonEmptyList<PaywallValidationError>> invoke(StyleFactoryScope withTabIndex) {
                AbstractC5504s.h(withTabIndex, "$this$withTabIndex");
                return (Result) withTabIndex.withTabControl(this.$control, new C06841(this.this$0, this.$componentTab));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42681(int i10, TabControlStyle tabControlStyle, StyleFactory styleFactory, TabsComponent.Tab tab) {
            super(1);
            this.$tabIndex = i10;
            this.$control = tabControlStyle;
            this.this$0 = styleFactory;
            this.$componentTab = tab;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Result<TabsComponentStyle.Tab, NonEmptyList<PaywallValidationError>> invoke(StyleFactoryScope withSelectedScope) {
            AbstractC5504s.h(withSelectedScope, "$this$withSelectedScope");
            return (Result) withSelectedScope.withTabIndex(this.$tabIndex, new C06831(this.$control, this.this$0, this.$componentTab));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory$createTabsComponentStyleTabControl$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlStyle;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42691 extends AbstractC5506u implements Function1 {
        final /* synthetic */ TabsComponent.TabControl $componentControl;
        final /* synthetic */ StyleFactory this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42691(TabsComponent.TabControl tabControl, StyleFactory styleFactory) {
            super(1);
            this.$componentControl = tabControl;
            this.this$0 = styleFactory;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Result<TabControlStyle, NonEmptyList<PaywallValidationError>> invoke(StyleFactoryScope withSelectedScope) {
            AbstractC5504s.h(withSelectedScope, "$this$withSelectedScope");
            TabsComponent.TabControl tabControl = this.$componentControl;
            if (tabControl instanceof TabsComponent.TabControl.Buttons) {
                Result<TabControlStyle, NonEmptyList<PaywallValidationError>> resultCreateStackComponentStyle = this.this$0.createStackComponentStyle(withSelectedScope, ((TabsComponent.TabControl.Buttons) tabControl).getStack());
                if (resultCreateStackComponentStyle instanceof Result.Success) {
                    return new Result.Success(new TabControlStyle.Buttons((StackComponentStyle) ((Result.Success) resultCreateStackComponentStyle).getValue()));
                }
                if (resultCreateStackComponentStyle instanceof Result.Error) {
                    return resultCreateStackComponentStyle;
                }
                throw new r();
            }
            if (!(tabControl instanceof TabsComponent.TabControl.Toggle)) {
                throw new r();
            }
            Result<TabControlStyle, NonEmptyList<PaywallValidationError>> resultCreateStackComponentStyle2 = this.this$0.createStackComponentStyle(withSelectedScope, ((TabsComponent.TabControl.Toggle) tabControl).getStack());
            if (resultCreateStackComponentStyle2 instanceof Result.Success) {
                return new Result.Success(new TabControlStyle.Toggle((StackComponentStyle) ((Result.Success) resultCreateStackComponentStyle2).getValue()));
            }
            if (resultCreateStackComponentStyle2 instanceof Result.Error) {
                return resultCreateStackComponentStyle2;
            }
            throw new r();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory$createTextComponentStyle$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/LocalizedTextPartial;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "it", "Lcom/revenuecat/purchases/paywalls/components/PartialTextComponent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function1 {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Result<LocalizedTextPartial, NonEmptyList<PaywallValidationError>> invoke(PartialTextComponent it) {
            AbstractC5504s.h(it, "it");
            return LocalizedTextPartial.INSTANCE.invoke(it, StyleFactory.this.localizations, StyleFactory.this.colorAliases, StyleFactory.this.fontAliases);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory$createTimelineComponentItemStyle$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "partial", "Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42701 extends AbstractC5506u implements Function1 {
        C42701() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Result<PresentedTimelineItemPartial, NonEmptyList<PaywallValidationError>> invoke(PartialTimelineComponentItem partial) {
            AbstractC5504s.h(partial, "partial");
            return PresentedTimelineItemPartial.INSTANCE.invoke(partial, StyleFactory.this.colorAliases);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory$createTimelineComponentStyle$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "partial", "Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42711 extends AbstractC5506u implements Function1 {
        public static final C42711 INSTANCE = new C42711();

        C42711() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Result<PresentedTimelinePartial, NonEmptyList<PaywallValidationError>> invoke(PartialTimelineComponent partial) {
            AbstractC5504s.h(partial, "partial");
            return new Result.Success(new PresentedTimelinePartial(partial));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory$createVideoComponentStyle$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedVideoPartial;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "videoPartial", "Lcom/revenuecat/purchases/paywalls/components/PartialVideoComponent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42721 extends AbstractC5506u implements Function1 {
        C42721() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Result<PresentedVideoPartial, NonEmptyList<PaywallValidationError>> invoke(PartialVideoComponent videoPartial) {
            Result resultM534withLocalizedOverridesTDPsjl0;
            AbstractC5504s.h(videoPartial, "videoPartial");
            ThemeVideoUrls source = videoPartial.getSource();
            NonEmptyMap nonEmptyMap = null;
            Result<PresentedVideoPartial, NonEmptyList<PaywallValidationError>> resultOrSuccessfullyNull = ResultKt.orSuccessfullyNull(source != null ? StyleFactory.this.m535withLocalizedOverridesTDPsjl0(source, videoPartial.getOverrideSourceLid()) : null);
            StyleFactory styleFactory = StyleFactory.this;
            if (!(resultOrSuccessfullyNull instanceof Result.Success)) {
                if (resultOrSuccessfullyNull instanceof Result.Error) {
                    return resultOrSuccessfullyNull;
                }
                throw new r();
            }
            NonEmptyMap nonEmptyMap2 = (NonEmptyMap) ((Result.Success) resultOrSuccessfullyNull).getValue();
            PresentedVideoPartial.Companion companion = PresentedVideoPartial.INSTANCE;
            ThemeImageUrls fallbackSource = videoPartial.getFallbackSource();
            if (fallbackSource != null && (resultM534withLocalizedOverridesTDPsjl0 = styleFactory.m534withLocalizedOverridesTDPsjl0(fallbackSource, videoPartial.getOverrideSourceLid())) != null && (resultM534withLocalizedOverridesTDPsjl0 instanceof Result.Success)) {
                nonEmptyMap = (NonEmptyMap) ((Result.Success) resultM534withLocalizedOverridesTDPsjl0).getValue();
            }
            return companion.invoke(videoPartial, nonEmptyMap2, nonEmptyMap, styleFactory.colorAliases);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StyleFactory(NonEmptyMap<LocaleId, ? extends NonEmptyMap<LocalizationKey, ? extends LocalizationData>> localizations, Map<ColorAlias, ColorScheme> colorAliases, Map<FontAlias, ? extends FontSpec> fontAliases, NonEmptyMap<LocaleId, NonEmptyMap<VariableLocalizationKey, String>> variableLocalizations, Offering offering, boolean z10) {
        AbstractC5504s.h(localizations, "localizations");
        AbstractC5504s.h(colorAliases, "colorAliases");
        AbstractC5504s.h(fontAliases, "fontAliases");
        AbstractC5504s.h(variableLocalizations, "variableLocalizations");
        AbstractC5504s.h(offering, "offering");
        this.localizations = localizations;
        this.colorAliases = colorAliases;
        this.fontAliases = fontAliases;
        this.variableLocalizations = variableLocalizations;
        this.offering = offering;
        this.stripRules = z10;
    }

    /* JADX INFO: renamed from: buttonComponentStyleUrlDestination-26kQY28, reason: not valid java name */
    private final Result<ButtonComponentStyle.Action.NavigateTo.Destination.Url, NonEmptyList<PaywallValidationError.MissingStringLocalization>> m533buttonComponentStyleUrlDestination26kQY28(String urlLid, ButtonComponent.UrlMethod method) {
        Result<ButtonComponentStyle.Action.NavigateTo.Destination.Url, NonEmptyList<PaywallValidationError.MissingStringLocalization>> resultM425stringForAllLocales7v81vok = LocalizationKt.m425stringForAllLocales7v81vok(this.localizations, urlLid);
        if (resultM425stringForAllLocales7v81vok instanceof Result.Success) {
            resultM425stringForAllLocales7v81vok = new Result.Success<>(new ButtonComponentStyle.Action.NavigateTo.Destination.Url((NonEmptyMap) ((Result.Success) resultM425stringForAllLocales7v81vok).getValue(), method));
        } else if (!(resultM425stringForAllLocales7v81vok instanceof Result.Error)) {
            throw new r();
        }
        if (!(resultM425stringForAllLocales7v81vok instanceof Result.Success)) {
            if (resultM425stringForAllLocales7v81vok instanceof Result.Error) {
                return resultM425stringForAllLocales7v81vok;
            }
            throw new r();
        }
        ButtonComponentStyle.Action.NavigateTo.Destination.Url url = (ButtonComponentStyle.Action.NavigateTo.Destination.Url) ((Result.Success) resultM425stringForAllLocales7v81vok).getValue();
        int i10 = WhenMappings.$EnumSwitchMapping$0[url.getMethod().ordinal()];
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            if (i10 != 4) {
                throw new r();
            }
            url = null;
        }
        return new Result.Success(url);
    }

    private final Result<ButtonComponentStyle.Action, NonEmptyList<PaywallValidationError>> convertAction(StyleFactoryScope styleFactoryScope, ButtonComponent.Action action) {
        if (action instanceof ButtonComponent.Action.NavigateBack) {
            return new Result.Success(ButtonComponentStyle.Action.NavigateBack.INSTANCE);
        }
        if (action instanceof ButtonComponent.Action.RestorePurchases) {
            return new Result.Success(ButtonComponentStyle.Action.RestorePurchases.INSTANCE);
        }
        if (!(action instanceof ButtonComponent.Action.NavigateTo)) {
            if (action instanceof ButtonComponent.Action.Unknown) {
                return new Result.Success(null);
            }
            throw new r();
        }
        Result resultConvertDestination = convertDestination(styleFactoryScope, ((ButtonComponent.Action.NavigateTo) action).getDestination());
        if (resultConvertDestination instanceof Result.Success) {
            ButtonComponentStyle.Action.NavigateTo.Destination destination = (ButtonComponentStyle.Action.NavigateTo.Destination) ((Result.Success) resultConvertDestination).getValue();
            return new Result.Success(destination != null ? new ButtonComponentStyle.Action.NavigateTo(destination) : null);
        }
        if (resultConvertDestination instanceof Result.Error) {
            return resultConvertDestination;
        }
        throw new r();
    }

    private final Result<ButtonComponentStyle.Action.NavigateTo.Destination, NonEmptyList<PaywallValidationError>> convertDestination(StyleFactoryScope styleFactoryScope, ButtonComponent.Destination destination) {
        if (destination instanceof ButtonComponent.Destination.CustomerCenter) {
            return new Result.Success(ButtonComponentStyle.Action.NavigateTo.Destination.CustomerCenter.INSTANCE);
        }
        if (destination instanceof ButtonComponent.Destination.PrivacyPolicy) {
            ButtonComponent.Destination.PrivacyPolicy privacyPolicy = (ButtonComponent.Destination.PrivacyPolicy) destination;
            return m533buttonComponentStyleUrlDestination26kQY28(privacyPolicy.m272getUrlLidz7Tp4o(), privacyPolicy.getMethod());
        }
        if (destination instanceof ButtonComponent.Destination.Terms) {
            ButtonComponent.Destination.Terms terms = (ButtonComponent.Destination.Terms) destination;
            return m533buttonComponentStyleUrlDestination26kQY28(terms.m276getUrlLidz7Tp4o(), terms.getMethod());
        }
        if (destination instanceof ButtonComponent.Destination.Url) {
            ButtonComponent.Destination.Url url = (ButtonComponent.Destination.Url) destination;
            return m533buttonComponentStyleUrlDestination26kQY28(url.m280getUrlLidz7Tp4o(), url.getMethod());
        }
        if (!(destination instanceof ButtonComponent.Destination.Sheet)) {
            if (destination instanceof ButtonComponent.Destination.Unknown) {
                return new Result.Success(null);
            }
            throw new r();
        }
        ButtonComponent.Destination.Sheet sheet = (ButtonComponent.Destination.Sheet) destination;
        Result resultCreateStackComponentStyle = createStackComponentStyle(styleFactoryScope, sheet.getStack());
        if (resultCreateStackComponentStyle instanceof Result.Success) {
            resultCreateStackComponentStyle = new Result.Success((StackComponentStyle) styleFactoryScope.applyBottomWindowInsetsIfNecessary((StackComponentStyle) ((Result.Success) resultCreateStackComponentStyle).getValue(), true));
        } else if (!(resultCreateStackComponentStyle instanceof Result.Error)) {
            throw new r();
        }
        if (resultCreateStackComponentStyle instanceof Result.Success) {
            resultCreateStackComponentStyle = new Result.Success((StackComponentStyle) styleFactoryScope.applyHorizontalWindowInsetsIfNecessary((StackComponentStyle) ((Result.Success) resultCreateStackComponentStyle).getValue(), true));
        } else if (!(resultCreateStackComponentStyle instanceof Result.Error)) {
            throw new r();
        }
        if (resultCreateStackComponentStyle instanceof Result.Success) {
            return new Result.Success(new ButtonComponentStyle.Action.NavigateTo.Destination.Sheet(sheet.getId(), sheet.getName(), (StackComponentStyle) ((Result.Success) resultCreateStackComponentStyle).getValue(), sheet.getBackgroundBlur(), sheet.getSize()));
        }
        if (resultCreateStackComponentStyle instanceof Result.Error) {
            return resultCreateStackComponentStyle;
        }
        throw new r();
    }

    private final Result<ButtonComponentStyle.Action, NonEmptyList<PaywallValidationError>> convertPurchaseButtonMethod(StyleFactoryScope styleFactoryScope, PurchaseButtonComponent.Method method) {
        boolean zBooleanValue;
        if (method == null) {
            return new Result.Success(new ButtonComponentStyle.Action.PurchasePackage(styleFactoryScope.getRcPackage(), styleFactoryScope.getResolvedOffer()));
        }
        if (method instanceof PurchaseButtonComponent.Method.InAppCheckout) {
            return new Result.Success(new ButtonComponentStyle.Action.PurchasePackage(styleFactoryScope.getRcPackage(), styleFactoryScope.getResolvedOffer()));
        }
        if (method instanceof PurchaseButtonComponent.Method.WebCheckout) {
            Package rcPackage = styleFactoryScope.getRcPackage();
            PurchaseButtonComponent.Method.WebCheckout webCheckout = (PurchaseButtonComponent.Method.WebCheckout) method;
            Boolean autoDismiss = webCheckout.getAutoDismiss();
            zBooleanValue = autoDismiss != null ? autoDismiss.booleanValue() : true;
            ButtonComponent.UrlMethod openMethod = webCheckout.getOpenMethod();
            if (openMethod == null) {
                openMethod = ButtonComponent.UrlMethod.EXTERNAL_BROWSER;
            }
            return new Result.Success(new ButtonComponentStyle.Action.WebCheckout(rcPackage, zBooleanValue, openMethod));
        }
        if (method instanceof PurchaseButtonComponent.Method.WebProductSelection) {
            PurchaseButtonComponent.Method.WebProductSelection webProductSelection = (PurchaseButtonComponent.Method.WebProductSelection) method;
            Boolean autoDismiss2 = webProductSelection.getAutoDismiss();
            zBooleanValue = autoDismiss2 != null ? autoDismiss2.booleanValue() : true;
            ButtonComponent.UrlMethod openMethod2 = webProductSelection.getOpenMethod();
            if (openMethod2 == null) {
                openMethod2 = ButtonComponent.UrlMethod.EXTERNAL_BROWSER;
            }
            return new Result.Success(new ButtonComponentStyle.Action.WebProductSelection(zBooleanValue, openMethod2));
        }
        if (!(method instanceof PurchaseButtonComponent.Method.CustomWebCheckout)) {
            if (!(method instanceof PurchaseButtonComponent.Method.Unknown)) {
                throw new r();
            }
            Logger.INSTANCE.e("Unknown purchase button method. Defaulting to purchasing current/default package.");
            return new Result.Success(new ButtonComponentStyle.Action.PurchasePackage(styleFactoryScope.getRcPackage(), styleFactoryScope.getResolvedOffer()));
        }
        PurchaseButtonComponent.Method.CustomWebCheckout customWebCheckout = (PurchaseButtonComponent.Method.CustomWebCheckout) method;
        Result<ButtonComponentStyle.Action, NonEmptyList<PaywallValidationError>> resultM425stringForAllLocales7v81vok = LocalizationKt.m425stringForAllLocales7v81vok(this.localizations, customWebCheckout.getCustomUrl().m299getUrlLidz7Tp4o());
        if (!(resultM425stringForAllLocales7v81vok instanceof Result.Success)) {
            if (resultM425stringForAllLocales7v81vok instanceof Result.Error) {
                return resultM425stringForAllLocales7v81vok;
            }
            throw new r();
        }
        NonEmptyMap nonEmptyMap = (NonEmptyMap) ((Result.Success) resultM425stringForAllLocales7v81vok).getValue();
        Boolean autoDismiss3 = customWebCheckout.getAutoDismiss();
        boolean zBooleanValue2 = autoDismiss3 != null ? autoDismiss3.booleanValue() : true;
        ButtonComponent.UrlMethod openMethod3 = customWebCheckout.getOpenMethod();
        if (openMethod3 == null) {
            openMethod3 = ButtonComponent.UrlMethod.EXTERNAL_BROWSER;
        }
        return new Result.Success(new ButtonComponentStyle.Action.CustomWebCheckout(nonEmptyMap, zBooleanValue2, openMethod3, styleFactoryScope.getRcPackage(), customWebCheckout.getCustomUrl().getPackageParam()));
    }

    public static /* synthetic */ Result create$default(StyleFactory styleFactory, PaywallComponent paywallComponent, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return styleFactory.create(paywallComponent, z10, z11);
    }

    private final Result<BackgroundStyles, NonEmptyList<PaywallValidationError>> createBackgroundStyles(Background background, ColorScheme backgroundColor) {
        Result colorStyles;
        Result<BackgroundStyles, NonEmptyList<PaywallValidationError>> backgroundStyles;
        if (background != null && (backgroundStyles = BackgroundStyleKt.toBackgroundStyles(background, this.colorAliases)) != null) {
            return backgroundStyles;
        }
        if (backgroundColor == null || (colorStyles = ColorStyleKt.toColorStyles(backgroundColor, this.colorAliases)) == null) {
            colorStyles = null;
        } else if (colorStyles instanceof Result.Success) {
            colorStyles = new Result.Success(BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl((ColorStyles) ((Result.Success) colorStyles).getValue())));
        } else if (!(colorStyles instanceof Result.Error)) {
            throw new r();
        }
        return ResultKt.orSuccessfullyNull(colorStyles);
    }

    private final Result<ButtonComponentStyle, NonEmptyList<PaywallValidationError>> createButtonComponentStyleOrNull(StyleFactoryScope styleFactoryScope, ButtonComponent buttonComponent) {
        Result<StackComponentStyle, NonEmptyList<PaywallValidationError>> resultCreateStackComponentStyle = createStackComponentStyle(styleFactoryScope, buttonComponent.getStack());
        Result<ButtonComponentStyle.Action, NonEmptyList<PaywallValidationError>> resultConvertAction = convertAction(styleFactoryScope, buttonComponent.getAction());
        L l10 = L.f17438a;
        Result.Success success = new Result.Success(l10);
        Result.Success success2 = new Result.Success(l10);
        Result.Success success3 = new Result.Success(l10);
        Result.Success success4 = new Result.Success(l10);
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.collectErrors(AbstractC2279u.p(resultCreateStackComponentStyle, resultConvertAction, success, success2, success3, success4)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        AbstractC5504s.f(resultCreateStackComponentStyle, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value = ((Result.Success) resultCreateStackComponentStyle).getValue();
        AbstractC5504s.f(resultConvertAction, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<B of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value2 = ((Result.Success) resultConvertAction).getValue();
        Object value3 = success.getValue();
        Object value4 = success2.getValue();
        Object value5 = success3.getValue();
        ButtonComponentStyle.Action action = (ButtonComponentStyle.Action) value2;
        return new Result.Success(action != null ? new ButtonComponentStyle((StackComponentStyle) value, action, buttonComponent.getTransition()) : null);
    }

    private final Result<CarouselComponentStyle, NonEmptyList<PaywallValidationError>> createCarouselComponentStyle(StyleFactoryScope styleFactoryScope, CarouselComponent carouselComponent) {
        Result error;
        Result presentedOverrides = PresentedPartialKt.toPresentedOverrides(carouselComponent.getOverrides(), this.stripRules, new AnonymousClass1());
        if (presentedOverrides instanceof Result.Success) {
            error = presentedOverrides;
        } else {
            if (!(presentedOverrides instanceof Result.Error)) {
                throw new r();
            }
            error = new Result.Error(NonEmptyListKt.nonEmptyListOf((PaywallValidationError) ((Result.Error) presentedOverrides).getValue(), new PaywallValidationError[0]));
        }
        List pages = carouselComponent.getPages();
        ArrayList<Result> arrayList = new ArrayList(AbstractC2279u.x(pages, 10));
        Iterator it = pages.iterator();
        while (it.hasNext()) {
            arrayList.add(createStackComponentStyle(styleFactoryScope, (StackComponent) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Result result : arrayList) {
            if (result instanceof Result.Success) {
                if (arrayList3.isEmpty()) {
                    arrayList2.add((StackComponentStyle) ((Result.Success) result).getValue());
                }
            } else if (result instanceof Result.Error) {
                arrayList3.addAll((Collection) ((Result.Error) result).getValue());
            }
        }
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(arrayList3);
        Result error2 = nonEmptyListOrNull != null ? new Result.Error(nonEmptyListOrNull) : new Result.Success(arrayList2);
        Border border = carouselComponent.getBorder();
        Result resultOrSuccessfullyNull = ResultKt.orSuccessfullyNull(border != null ? BorderStyleKt.toBorderStyles(border, this.colorAliases) : null);
        Shadow shadow = carouselComponent.getShadow();
        Result resultOrSuccessfullyNull2 = ResultKt.orSuccessfullyNull(shadow != null ? ShadowStyleKt.toShadowStyles(shadow, this.colorAliases) : null);
        Result<BackgroundStyles, NonEmptyList<PaywallValidationError>> resultCreateBackgroundStyles = createBackgroundStyles(carouselComponent.getBackground(), carouselComponent.getBackgroundColor());
        CarouselComponent.PageControl pageControl = carouselComponent.getPageControl();
        Result resultOrSuccessfullyNull3 = ResultKt.orSuccessfullyNull(pageControl != null ? PageControlExtensionsKt.toPageControlStyles(pageControl, this.colorAliases) : null);
        NonEmptyList nonEmptyListOrNull2 = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.collectErrors(AbstractC2279u.p(error, error2, resultOrSuccessfullyNull, resultOrSuccessfullyNull2, resultCreateBackgroundStyles, resultOrSuccessfullyNull3)));
        if (nonEmptyListOrNull2 != null) {
            return new Result.Error(nonEmptyListOrNull2);
        }
        AbstractC5504s.f(error, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value = ((Result.Success) error).getValue();
        Object value2 = ((Result.Success) error2).getValue();
        AbstractC5504s.f(resultOrSuccessfullyNull, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<C of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value3 = ((Result.Success) resultOrSuccessfullyNull).getValue();
        AbstractC5504s.f(resultOrSuccessfullyNull2, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<D of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value4 = ((Result.Success) resultOrSuccessfullyNull2).getValue();
        AbstractC5504s.f(resultCreateBackgroundStyles, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<E of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value5 = ((Result.Success) resultCreateBackgroundStyles).getValue();
        AbstractC5504s.f(resultOrSuccessfullyNull3, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<F of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        CarouselComponentStyle.PageControlStyles pageControlStyles = (CarouselComponentStyle.PageControlStyles) ((Result.Success) resultOrSuccessfullyNull3).getValue();
        BackgroundStyles backgroundStyles = (BackgroundStyles) value5;
        ShadowStyles shadowStyles = (ShadowStyles) value4;
        BorderStyles borderStyles = (BorderStyles) value3;
        List list = (List) value2;
        List list2 = (List) value;
        Integer initialPageIndex = carouselComponent.getInitialPageIndex();
        int iIntValue = initialPageIndex != null ? initialPageIndex.intValue() : 0;
        e.c alignment = AlignmentKt.toAlignment(carouselComponent.getPageAlignment());
        Boolean visible = carouselComponent.getVisible();
        boolean zBooleanValue = visible != null ? visible.booleanValue() : true;
        Size size = carouselComponent.getSize();
        float fN = C5015h.n(carouselComponent.getPagePeek() != null ? r2.intValue() : 0);
        Float pageSpacing = carouselComponent.getPageSpacing();
        float fN2 = C5015h.n(pageSpacing != null ? pageSpacing.floatValue() : DEFAULT_SPACING);
        A paddingValues = PaddingKt.toPaddingValues(carouselComponent.getPadding());
        A paddingValues2 = PaddingKt.toPaddingValues(carouselComponent.getMargin());
        Shape shape = carouselComponent.getShape();
        if (shape == null) {
            shape = DEFAULT_SHAPE;
        }
        Shape shape2 = shape;
        Boolean loop = carouselComponent.getLoop();
        return new Result.Success(new CarouselComponentStyle(list, iIntValue, alignment, zBooleanValue, size, fN, fN2, backgroundStyles, paddingValues, paddingValues2, shape2, borderStyles, shadowStyles, pageControlStyles, loop != null ? loop.booleanValue() : false, carouselComponent.getAutoAdvance(), styleFactoryScope.getRcPackage(), styleFactoryScope.getResolvedOffer(), styleFactoryScope.getTabControlIndex(), styleFactoryScope.getOfferEligibility(), list2, null));
    }

    private final Result<CountdownComponentStyle, NonEmptyList<PaywallValidationError>> createCountdownComponentStyle(StyleFactoryScope styleFactoryScope, CountdownComponent countdownComponent) {
        return (Result) styleFactoryScope.withCountdown(countdownComponent.getStyle().getDate(), countdownComponent.getCountFrom(), new C42621(countdownComponent));
    }

    private final Result<IconComponentStyle, NonEmptyList<PaywallValidationError>> createIconComponentStyle(StyleFactoryScope styleFactoryScope, IconComponent iconComponent) {
        Result presentedOverrides = PresentedPartialKt.toPresentedOverrides(iconComponent.getOverrides(), this.stripRules, new C42631());
        if (!(presentedOverrides instanceof Result.Success)) {
            if (!(presentedOverrides instanceof Result.Error)) {
                throw new r();
            }
            presentedOverrides = new Result.Error(NonEmptyListKt.nonEmptyListOf((PaywallValidationError) ((Result.Error) presentedOverrides).getValue(), new PaywallValidationError[0]));
        }
        ColorScheme color = iconComponent.getColor();
        Result resultOrSuccessfullyNull = ResultKt.orSuccessfullyNull(color != null ? ColorStyleKt.toColorStyles(color, this.colorAliases) : null);
        IconComponent.IconBackground iconBackground = iconComponent.getIconBackground();
        Result resultOrSuccessfullyNull2 = ResultKt.orSuccessfullyNull(iconBackground != null ? IconComponentStyleKt.toBackground(iconBackground, this.colorAliases) : null);
        L l10 = L.f17438a;
        Result.Success success = new Result.Success(l10);
        Result.Success success2 = new Result.Success(l10);
        Result.Success success3 = new Result.Success(l10);
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.collectErrors(AbstractC2279u.p(presentedOverrides, resultOrSuccessfullyNull, resultOrSuccessfullyNull2, success, success2, success3)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        AbstractC5504s.f(presentedOverrides, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value = ((Result.Success) presentedOverrides).getValue();
        AbstractC5504s.f(resultOrSuccessfullyNull, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<B of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value2 = ((Result.Success) resultOrSuccessfullyNull).getValue();
        AbstractC5504s.f(resultOrSuccessfullyNull2, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<C of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value3 = ((Result.Success) resultOrSuccessfullyNull2).getValue();
        Object value4 = success.getValue();
        Object value5 = success2.getValue();
        IconComponentStyle.Background background = (IconComponentStyle.Background) value3;
        ColorStyles colorStyles = (ColorStyles) value2;
        List list = (List) value;
        String baseUrl = iconComponent.getBaseUrl();
        String iconName = iconComponent.getIconName();
        IconComponent.Formats formats = iconComponent.getFormats();
        Boolean visible = iconComponent.getVisible();
        return new Result.Success(new IconComponentStyle(baseUrl, iconName, formats, visible != null ? visible.booleanValue() : true, iconComponent.getSize(), colorStyles, PaddingKt.toPaddingValues(iconComponent.getPadding()), PaddingKt.toPaddingValues(iconComponent.getMargin()), background, styleFactoryScope.getRcPackage(), styleFactoryScope.getResolvedOffer(), styleFactoryScope.getTabControlIndex(), styleFactoryScope.getOfferEligibility(), list));
    }

    private final Result<ImageComponentStyle, NonEmptyList<PaywallValidationError>> createImageComponentStyle(StyleFactoryScope styleFactoryScope, ImageComponent imageComponent) {
        Result<NonEmptyMap<LocaleId, ThemeImageUrls>, NonEmptyList<PaywallValidationError.MissingImageLocalization>> resultM534withLocalizedOverridesTDPsjl0 = m534withLocalizedOverridesTDPsjl0(imageComponent.getSource(), imageComponent.getOverrideSourceLid());
        Result presentedOverrides = PresentedPartialKt.toPresentedOverrides(imageComponent.getOverrides(), this.stripRules, new C42641());
        if (!(presentedOverrides instanceof Result.Success)) {
            if (!(presentedOverrides instanceof Result.Error)) {
                throw new r();
            }
            presentedOverrides = new Result.Error(NonEmptyListKt.nonEmptyListOf((PaywallValidationError) ((Result.Error) presentedOverrides).getValue(), new PaywallValidationError[0]));
        }
        ColorScheme colorOverlay = imageComponent.getColorOverlay();
        Result resultOrSuccessfullyNull = ResultKt.orSuccessfullyNull(colorOverlay != null ? ColorStyleKt.toColorStyles(colorOverlay, this.colorAliases) : null);
        Border border = imageComponent.getBorder();
        Result resultOrSuccessfullyNull2 = ResultKt.orSuccessfullyNull(border != null ? BorderStyleKt.toBorderStyles(border, this.colorAliases) : null);
        Shadow shadow = imageComponent.getShadow();
        Result resultOrSuccessfullyNull3 = ResultKt.orSuccessfullyNull(shadow != null ? ShadowStyleKt.toShadowStyles(shadow, this.colorAliases) : null);
        Result.Success success = new Result.Success(L.f17438a);
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.collectErrors(AbstractC2279u.p(resultM534withLocalizedOverridesTDPsjl0, presentedOverrides, resultOrSuccessfullyNull, resultOrSuccessfullyNull2, resultOrSuccessfullyNull3, success)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        AbstractC5504s.f(resultM534withLocalizedOverridesTDPsjl0, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value = ((Result.Success) resultM534withLocalizedOverridesTDPsjl0).getValue();
        AbstractC5504s.f(presentedOverrides, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<B of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value2 = ((Result.Success) presentedOverrides).getValue();
        AbstractC5504s.f(resultOrSuccessfullyNull, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<C of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value3 = ((Result.Success) resultOrSuccessfullyNull).getValue();
        AbstractC5504s.f(resultOrSuccessfullyNull2, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<D of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value4 = ((Result.Success) resultOrSuccessfullyNull2).getValue();
        AbstractC5504s.f(resultOrSuccessfullyNull3, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<E of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value5 = ((Result.Success) resultOrSuccessfullyNull3).getValue();
        ShadowStyles shadowStyles = (ShadowStyles) value5;
        BorderStyles borderStyles = (BorderStyles) value4;
        ColorStyles colorStyles = (ColorStyles) value3;
        List list = (List) value2;
        NonEmptyMap nonEmptyMap = (NonEmptyMap) value;
        Boolean visible = imageComponent.getVisible();
        boolean zBooleanValue = visible != null ? visible.booleanValue() : true;
        Size size = imageComponent.getSize();
        A paddingValues = PaddingKt.toPaddingValues(imageComponent.getPadding());
        A paddingValues2 = PaddingKt.toPaddingValues(imageComponent.getMargin());
        MaskShape maskShape = imageComponent.getMaskShape();
        return new Result.Success(new ImageComponentStyle(nonEmptyMap, zBooleanValue, size, paddingValues, paddingValues2, maskShape != null ? ShapeKt.toShape(maskShape) : null, borderStyles, shadowStyles, colorStyles, FitModeKt.toContentScale(imageComponent.getFitMode()), styleFactoryScope.getRcPackage(), styleFactoryScope.getResolvedOffer(), styleFactoryScope.getTabControlIndex(), styleFactoryScope.getOfferEligibility(), list, styleFactoryScope.getIgnoreTopWindowInsets()));
    }

    private final Result<ComponentStyle, NonEmptyList<PaywallValidationError>> createInternal(StyleFactoryScope styleFactoryScope, PaywallComponent paywallComponent) {
        styleFactoryScope.recordComponent(paywallComponent);
        if (paywallComponent instanceof ButtonComponent) {
            return createButtonComponentStyleOrNull(styleFactoryScope, (ButtonComponent) paywallComponent);
        }
        if (paywallComponent instanceof ImageComponent) {
            return createImageComponentStyle(styleFactoryScope, (ImageComponent) paywallComponent);
        }
        if (paywallComponent instanceof PackageComponent) {
            return createPackageComponentStyle(styleFactoryScope, (PackageComponent) paywallComponent);
        }
        if (paywallComponent instanceof PurchaseButtonComponent) {
            return createPurchaseButtonComponentStyle(styleFactoryScope, (PurchaseButtonComponent) paywallComponent);
        }
        if (paywallComponent instanceof StackComponent) {
            return createStackComponentStyle(styleFactoryScope, (StackComponent) paywallComponent);
        }
        if (paywallComponent instanceof StickyFooterComponent) {
            return createStickyFooterComponentStyle(styleFactoryScope, (StickyFooterComponent) paywallComponent);
        }
        if (paywallComponent instanceof TextComponent) {
            return createTextComponentStyle(styleFactoryScope, (TextComponent) paywallComponent);
        }
        if (paywallComponent instanceof IconComponent) {
            return createIconComponentStyle(styleFactoryScope, (IconComponent) paywallComponent);
        }
        if (paywallComponent instanceof TimelineComponent) {
            return createTimelineComponentStyle(styleFactoryScope, (TimelineComponent) paywallComponent);
        }
        if (paywallComponent instanceof CarouselComponent) {
            return createCarouselComponentStyle(styleFactoryScope, (CarouselComponent) paywallComponent);
        }
        if (paywallComponent instanceof TabControlButtonComponent) {
            return createTabControlButtonComponentStyle(styleFactoryScope, (TabControlButtonComponent) paywallComponent);
        }
        if (paywallComponent instanceof TabControlToggleComponent) {
            return createTabControlToggleComponentStyle(styleFactoryScope, (TabControlToggleComponent) paywallComponent);
        }
        if (paywallComponent instanceof TabControlComponent) {
            return ResultKt.errorIfNull(styleFactoryScope.getTabControl(), NonEmptyListKt.nonEmptyListOf(PaywallValidationError.TabControlNotInTab.INSTANCE, new PaywallValidationError.TabControlNotInTab[0]));
        }
        if (paywallComponent instanceof TabsComponent) {
            return createTabsComponentStyle(styleFactoryScope, (TabsComponent) paywallComponent);
        }
        if (paywallComponent instanceof VideoComponent) {
            return createVideoComponentStyle(styleFactoryScope, (VideoComponent) paywallComponent);
        }
        if (paywallComponent instanceof CountdownComponent) {
            return createCountdownComponentStyle(styleFactoryScope, (CountdownComponent) paywallComponent);
        }
        throw new r();
    }

    private final Result<PackageComponentStyle, NonEmptyList<PaywallValidationError>> createPackageComponentStyle(StyleFactoryScope styleFactoryScope, PackageComponent packageComponent) {
        Package r02 = (Package) new Result.Success(getPackageOrNull(this.offering, packageComponent.getPackageId())).getValue();
        if (r02 != null) {
            ResolvedOffer resolvedOfferResolve = PromoOfferResolver.INSTANCE.resolve(r02, packageComponent.getPlayStoreOffer());
            return (Result) styleFactoryScope.withSelectedScope(new PaywallState.Loaded.Components.AvailablePackages.Info(r02, packageComponent.getIsSelectedByDefault(), resolvedOfferResolve), null, new StyleFactory$createPackageComponentStyle$1$1(this, packageComponent, r02, resolvedOfferResolve));
        }
        String identifier = this.offering.getIdentifier();
        String packageId = packageComponent.getPackageId();
        List<Package> availablePackages = this.offering.getAvailablePackages();
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(availablePackages, 10));
        Iterator<T> it = availablePackages.iterator();
        while (it.hasNext()) {
            arrayList.add(((Package) it.next()).getIdentifier());
        }
        Logger.INSTANCE.w(new PaywallValidationError.MissingPackage(identifier, packageId, arrayList).getMessage());
        return new Result.Success(null);
    }

    private final Result<ButtonComponentStyle, NonEmptyList<PaywallValidationError>> createPurchaseButtonComponentStyle(StyleFactoryScope styleFactoryScope, PurchaseButtonComponent purchaseButtonComponent) {
        Result<StackComponentStyle, NonEmptyList<PaywallValidationError>> resultCreateStackComponentStyle = createStackComponentStyle(styleFactoryScope, purchaseButtonComponent.getStack());
        PurchaseButtonComponent.Method method = purchaseButtonComponent.getMethod();
        if (method == null) {
            PurchaseButtonComponent.Action action = purchaseButtonComponent.getAction();
            method = action != null ? action.toMethod() : null;
        }
        Result<ButtonComponentStyle.Action, NonEmptyList<PaywallValidationError>> resultConvertPurchaseButtonMethod = convertPurchaseButtonMethod(styleFactoryScope, method);
        L l10 = L.f17438a;
        Result.Success success = new Result.Success(l10);
        Result.Success success2 = new Result.Success(l10);
        Result.Success success3 = new Result.Success(l10);
        Result.Success success4 = new Result.Success(l10);
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.collectErrors(AbstractC2279u.p(resultCreateStackComponentStyle, resultConvertPurchaseButtonMethod, success, success2, success3, success4)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        AbstractC5504s.f(resultCreateStackComponentStyle, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value = ((Result.Success) resultCreateStackComponentStyle).getValue();
        AbstractC5504s.f(resultConvertPurchaseButtonMethod, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<B of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value2 = ((Result.Success) resultConvertPurchaseButtonMethod).getValue();
        Object value3 = success.getValue();
        Object value4 = success2.getValue();
        Object value5 = success3.getValue();
        return new Result.Success(new ButtonComponentStyle((StackComponentStyle) value, (ButtonComponentStyle.Action) value2, null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Result<StackComponentStyle, NonEmptyList<PaywallValidationError>> createStackComponentStyle(StyleFactoryScope styleFactoryScope, StackComponent stackComponent) {
        Result error;
        Result success;
        Result presentedOverrides = PresentedPartialKt.toPresentedOverrides(stackComponent.getOverrides(), this.stripRules, new C42651(styleFactoryScope));
        if (presentedOverrides instanceof Result.Success) {
            error = presentedOverrides;
        } else {
            if (!(presentedOverrides instanceof Result.Error)) {
                throw new r();
            }
            error = new Result.Error(NonEmptyListKt.nonEmptyListOf((PaywallValidationError) ((Result.Error) presentedOverrides).getValue(), new PaywallValidationError[0]));
        }
        List components = stackComponent.getComponents();
        ArrayList<Result> arrayList = new ArrayList(AbstractC2279u.x(components, 10));
        Iterator it = components.iterator();
        while (it.hasNext()) {
            arrayList.add(createInternal(styleFactoryScope, (PaywallComponent) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Result result : arrayList) {
            if (result instanceof Result.Success) {
                if (arrayList3.isEmpty()) {
                    arrayList2.add((ComponentStyle) ((Result.Success) result).getValue());
                }
            } else if (result instanceof Result.Error) {
                arrayList3.addAll((Collection) ((Result.Error) result).getValue());
            }
        }
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(arrayList3);
        Result error2 = nonEmptyListOrNull != null ? new Result.Error(nonEmptyListOrNull) : new Result.Success(arrayList2);
        if (error2 instanceof Result.Success) {
            success = new Result.Success(AbstractC2279u.j0((List) ((Result.Success) error2).getValue()));
        } else {
            if (!(error2 instanceof Result.Error)) {
                throw new r();
            }
            success = error2;
        }
        Badge badge = stackComponent.getBadge();
        Result resultOrSuccessfullyNull = ResultKt.orSuccessfullyNull(badge != null ? BadgeStyleKt.toBadgeStyle(badge, new AnonymousClass6(styleFactoryScope)) : null);
        Result<BackgroundStyles, NonEmptyList<PaywallValidationError>> resultCreateBackgroundStyles = createBackgroundStyles(stackComponent.getBackground(), stackComponent.getBackgroundColor());
        Border border = stackComponent.getBorder();
        Result resultOrSuccessfullyNull2 = ResultKt.orSuccessfullyNull(border != null ? BorderStyleKt.toBorderStyles(border, this.colorAliases) : null);
        Shadow shadow = stackComponent.getShadow();
        Result resultOrSuccessfullyNull3 = ResultKt.orSuccessfullyNull(shadow != null ? ShadowStyleKt.toShadowStyles(shadow, this.colorAliases) : null);
        NonEmptyList nonEmptyListOrNull2 = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.collectErrors(AbstractC2279u.p(error, success, resultOrSuccessfullyNull, resultCreateBackgroundStyles, resultOrSuccessfullyNull2, resultOrSuccessfullyNull3)));
        if (nonEmptyListOrNull2 != null) {
            return new Result.Error(nonEmptyListOrNull2);
        }
        AbstractC5504s.f(error, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value = ((Result.Success) error).getValue();
        Object value2 = ((Result.Success) success).getValue();
        AbstractC5504s.f(resultOrSuccessfullyNull, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<C of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value3 = ((Result.Success) resultOrSuccessfullyNull).getValue();
        AbstractC5504s.f(resultCreateBackgroundStyles, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<D of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value4 = ((Result.Success) resultCreateBackgroundStyles).getValue();
        AbstractC5504s.f(resultOrSuccessfullyNull2, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<E of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value5 = ((Result.Success) resultOrSuccessfullyNull2).getValue();
        AbstractC5504s.f(resultOrSuccessfullyNull3, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<F of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        ShadowStyles shadowStyles = (ShadowStyles) ((Result.Success) resultOrSuccessfullyNull3).getValue();
        BorderStyles borderStyles = (BorderStyles) value5;
        BackgroundStyles backgroundStyles = (BackgroundStyles) value4;
        BadgeStyle badgeStyle = (BadgeStyle) value3;
        List list = (List) value2;
        List list2 = (List) value;
        Dimension dimension = stackComponent.getDimension();
        Boolean visible = stackComponent.getVisible();
        boolean zBooleanValue = visible != null ? visible.booleanValue() : true;
        Size size = stackComponent.getSize();
        Float spacing = stackComponent.getSpacing();
        float fN = C5015h.n(spacing != null ? spacing.floatValue() : DEFAULT_SPACING);
        A paddingValues = PaddingKt.toPaddingValues(stackComponent.getPadding());
        A paddingValues2 = PaddingKt.toPaddingValues(stackComponent.getMargin());
        Shape shape = stackComponent.getShape();
        if (shape == null) {
            shape = DEFAULT_SHAPE;
        }
        Shape shape2 = shape;
        StackComponent.Overflow overflow = stackComponent.getOverflow();
        return new Result.Success(new StackComponentStyle(list, dimension, zBooleanValue, size, fN, backgroundStyles, paddingValues, paddingValues2, shape2, borderStyles, shadowStyles, badgeStyle, overflow != null ? OverflowExtensionsKt.toOrientation(overflow, stackComponent.getDimension()) : null, styleFactoryScope.getRcPackage(), styleFactoryScope.getResolvedOffer(), styleFactoryScope.getTabControlIndex(), styleFactoryScope.getOfferEligibility(), styleFactoryScope.getCountdownDate(), styleFactoryScope.getCountFrom(), list2, styleFactoryScope.getApplyTopWindowInsets(), false, false, 6291456, null));
    }

    private final Result<StickyFooterComponentStyle, NonEmptyList<PaywallValidationError>> createStickyFooterComponentStyle(StyleFactoryScope styleFactoryScope, StickyFooterComponent stickyFooterComponent) {
        return (Result) styleFactoryScope.withSelectedScope(null, null, new C42661(stickyFooterComponent));
    }

    private final Result<TabControlButtonComponentStyle, NonEmptyList<PaywallValidationError>> createTabControlButtonComponentStyle(StyleFactoryScope styleFactoryScope, TabControlButtonComponent tabControlButtonComponent) {
        return (Result) styleFactoryScope.withSelectedScope(null, Integer.valueOf(tabControlButtonComponent.getTabIndex()), new C42671(tabControlButtonComponent));
    }

    private final Result<TabControlToggleComponentStyle, NonEmptyList<PaywallValidationError>> createTabControlToggleComponentStyle(StyleFactoryScope styleFactoryScope, TabControlToggleComponent tabControlToggleComponent) {
        Result colorStyles = ColorStyleKt.toColorStyles(tabControlToggleComponent.getThumbColorOn(), this.colorAliases);
        Result colorStyles2 = ColorStyleKt.toColorStyles(tabControlToggleComponent.getThumbColorOff(), this.colorAliases);
        Result colorStyles3 = ColorStyleKt.toColorStyles(tabControlToggleComponent.getTrackColorOn(), this.colorAliases);
        Result colorStyles4 = ColorStyleKt.toColorStyles(tabControlToggleComponent.getTrackColorOff(), this.colorAliases);
        L l10 = L.f17438a;
        Result.Success success = new Result.Success(l10);
        Result.Success success2 = new Result.Success(l10);
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.collectErrors(AbstractC2279u.p(colorStyles, colorStyles2, colorStyles3, colorStyles4, success, success2)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        AbstractC5504s.f(colorStyles, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value = ((Result.Success) colorStyles).getValue();
        AbstractC5504s.f(colorStyles2, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<B of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value2 = ((Result.Success) colorStyles2).getValue();
        AbstractC5504s.f(colorStyles3, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<C of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value3 = ((Result.Success) colorStyles3).getValue();
        AbstractC5504s.f(colorStyles4, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<D of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value4 = ((Result.Success) colorStyles4).getValue();
        Object value5 = success.getValue();
        ColorStyles colorStyles5 = (ColorStyles) value4;
        ColorStyles colorStyles6 = (ColorStyles) value3;
        ColorStyles colorStyles7 = (ColorStyles) value2;
        ColorStyles colorStyles8 = (ColorStyles) value;
        styleFactoryScope.setDefaultTabIndex(tabControlToggleComponent.getDefaultValue() ? 1 : 0);
        return new Result.Success(new TabControlToggleComponentStyle(colorStyles8, colorStyles7, colorStyles6, colorStyles5));
    }

    private final Result<TabsComponentStyle, NonEmptyList<PaywallValidationError>> createTabsComponentStyle(StyleFactoryScope styleFactoryScope, TabsComponent tabsComponent) {
        Result resultCreateTabsComponentStyleTabControl = createTabsComponentStyleTabControl(styleFactoryScope, tabsComponent.getControl());
        if (!(resultCreateTabsComponentStyleTabControl instanceof Result.Success)) {
            if (resultCreateTabsComponentStyleTabControl instanceof Result.Error) {
                return resultCreateTabsComponentStyleTabControl;
            }
            throw new r();
        }
        TabControlStyle tabControlStyle = (TabControlStyle) ((Result.Success) resultCreateTabsComponentStyleTabControl).getValue();
        String defaultTabId = tabsComponent.getDefaultTabId();
        if (defaultTabId != null) {
            if (Df.r.l0(defaultTabId)) {
                defaultTabId = null;
            }
            if (defaultTabId != null) {
                Iterator it = tabsComponent.getTabs().iterator();
                int i10 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i10 = -1;
                        break;
                    }
                    if (AbstractC5504s.c(((TabsComponent.Tab) it.next()).getId(), defaultTabId)) {
                        break;
                    }
                    i10++;
                }
                Integer numValueOf = Integer.valueOf(i10);
                if (numValueOf.intValue() == -1) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    styleFactoryScope.setDefaultTabIndex(Integer.valueOf(numValueOf.intValue()));
                }
            }
        }
        Result presentedOverrides = PresentedPartialKt.toPresentedOverrides(tabsComponent.getOverrides(), this.stripRules, new StyleFactory$createTabsComponentStyle$1$5(this));
        if (!(presentedOverrides instanceof Result.Success)) {
            if (!(presentedOverrides instanceof Result.Error)) {
                throw new r();
            }
            presentedOverrides = new Result.Error(NonEmptyListKt.nonEmptyListOf((PaywallValidationError) ((Result.Error) presentedOverrides).getValue(), new PaywallValidationError[0]));
        }
        Result<NonEmptyList<TabsComponentStyle.Tab>, NonEmptyList<PaywallValidationError>> resultCreateTabsComponentStyleTabs = createTabsComponentStyleTabs(styleFactoryScope, tabsComponent.getTabs(), tabControlStyle);
        Result<BackgroundStyles, NonEmptyList<PaywallValidationError>> resultCreateBackgroundStyles = createBackgroundStyles(tabsComponent.getBackground(), tabsComponent.getBackgroundColor());
        Border border = tabsComponent.getBorder();
        Result resultOrSuccessfullyNull = ResultKt.orSuccessfullyNull(border != null ? BorderStyleKt.toBorderStyles(border, this.colorAliases) : null);
        Shadow shadow = tabsComponent.getShadow();
        Result resultOrSuccessfullyNull2 = ResultKt.orSuccessfullyNull(shadow != null ? ShadowStyleKt.toShadowStyles(shadow, this.colorAliases) : null);
        Result.Success success = new Result.Success(L.f17438a);
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.collectErrors(AbstractC2279u.p(presentedOverrides, resultCreateTabsComponentStyleTabs, resultCreateBackgroundStyles, resultOrSuccessfullyNull, resultOrSuccessfullyNull2, success)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        AbstractC5504s.f(presentedOverrides, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value = ((Result.Success) presentedOverrides).getValue();
        AbstractC5504s.f(resultCreateTabsComponentStyleTabs, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<B of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value2 = ((Result.Success) resultCreateTabsComponentStyleTabs).getValue();
        AbstractC5504s.f(resultCreateBackgroundStyles, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<C of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value3 = ((Result.Success) resultCreateBackgroundStyles).getValue();
        AbstractC5504s.f(resultOrSuccessfullyNull, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<D of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value4 = ((Result.Success) resultOrSuccessfullyNull).getValue();
        AbstractC5504s.f(resultOrSuccessfullyNull2, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<E of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value5 = ((Result.Success) resultOrSuccessfullyNull2).getValue();
        ShadowStyles shadowStyles = (ShadowStyles) value5;
        BorderStyles borderStyles = (BorderStyles) value4;
        BackgroundStyles backgroundStyles = (BackgroundStyles) value3;
        NonEmptyList nonEmptyList = (NonEmptyList) value2;
        List list = (List) value;
        boolean zBooleanValue = true;
        Boolean visible = tabsComponent.getVisible();
        if (visible != null) {
            zBooleanValue = visible.booleanValue();
        }
        boolean z10 = zBooleanValue;
        Size size = tabsComponent.getSize();
        A paddingValues = PaddingKt.toPaddingValues(tabsComponent.getPadding());
        A paddingValues2 = PaddingKt.toPaddingValues(tabsComponent.getMargin());
        Shape shape = tabsComponent.getShape();
        if (shape == null) {
            shape = DEFAULT_SHAPE;
        }
        return new Result.Success(new TabsComponentStyle(z10, size, paddingValues, paddingValues2, backgroundStyles, shape, borderStyles, shadowStyles, tabControlStyle, nonEmptyList, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Result<TabsComponentStyle.Tab, NonEmptyList<PaywallValidationError>> createTabsComponentStyleTab(StyleFactoryScope styleFactoryScope, TabsComponent.Tab tab, TabControlStyle tabControlStyle, int i10) {
        return (Result) styleFactoryScope.withSelectedScope(null, null, new C42681(i10, tabControlStyle, this, tab));
    }

    private final Result<TabControlStyle, NonEmptyList<PaywallValidationError>> createTabsComponentStyleTabControl(StyleFactoryScope styleFactoryScope, TabsComponent.TabControl tabControl) {
        return (Result) styleFactoryScope.withSelectedScope(null, null, new C42691(tabControl, this));
    }

    private final Result<NonEmptyList<TabsComponentStyle.Tab>, NonEmptyList<PaywallValidationError>> createTabsComponentStyleTabs(StyleFactoryScope styleFactoryScope, List<TabsComponent.Tab> list, TabControlStyle tabControlStyle) {
        Result<NonEmptyList<TabsComponentStyle.Tab>, NonEmptyList<PaywallValidationError>> resultErrorIfNull = ResultKt.errorIfNull(NonEmptyListKt.toNonEmptyListOrNull(list), NonEmptyListKt.nonEmptyListOf(PaywallValidationError.TabsComponentWithoutTabs.INSTANCE, new PaywallValidationError.TabsComponentWithoutTabs[0]));
        if (resultErrorIfNull instanceof Result.Success) {
            return NonEmptyListKt.flatten(((NonEmptyList) ((Result.Success) resultErrorIfNull).getValue()).mapIndexed(new StyleFactory$createTabsComponentStyleTabs$1$1(this, styleFactoryScope, tabControlStyle)));
        }
        if (resultErrorIfNull instanceof Result.Error) {
            return resultErrorIfNull;
        }
        throw new r();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0098 A[LOOP:1: B:18:0x0092->B:20:0x0098, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.revenuecat.purchases.ui.revenuecatui.helpers.Result<com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle, com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyList<com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError>> createTextComponentStyle(com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory.StyleFactoryScope r31, com.revenuecat.purchases.paywalls.components.TextComponent r32) {
        /*
            Method dump skipped, instruction units count: 593
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory.createTextComponentStyle(com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory$StyleFactoryScope, com.revenuecat.purchases.paywalls.components.TextComponent):com.revenuecat.purchases.ui.revenuecatui.helpers.Result");
    }

    private final Result<TimelineComponentStyle.ItemStyle, NonEmptyList<PaywallValidationError>> createTimelineComponentItemStyle(StyleFactoryScope styleFactoryScope, TimelineComponent.Item item) {
        ColorScheme color;
        Result presentedOverrides = PresentedPartialKt.toPresentedOverrides(item.getOverrides(), this.stripRules, new C42701());
        if (!(presentedOverrides instanceof Result.Success)) {
            if (!(presentedOverrides instanceof Result.Error)) {
                throw new r();
            }
            presentedOverrides = new Result.Error(NonEmptyListKt.nonEmptyListOf((PaywallValidationError) ((Result.Error) presentedOverrides).getValue(), new PaywallValidationError[0]));
        }
        Result<TextComponentStyle, NonEmptyList<PaywallValidationError>> resultCreateTextComponentStyle = createTextComponentStyle(styleFactoryScope, item.getTitle());
        TextComponent description = item.getDescription();
        TimelineComponentStyle.ConnectorStyle connectorStyle = null;
        Result resultOrSuccessfullyNull = ResultKt.orSuccessfullyNull(description != null ? createTextComponentStyle(styleFactoryScope, description) : null);
        Result<IconComponentStyle, NonEmptyList<PaywallValidationError>> resultCreateIconComponentStyle = createIconComponentStyle(styleFactoryScope, item.getIcon());
        TimelineComponent.Connector connector = item.getConnector();
        Result resultOrSuccessfullyNull2 = ResultKt.orSuccessfullyNull((connector == null || (color = connector.getColor()) == null) ? null : ColorStyleKt.toColorStyles(color, this.colorAliases));
        Result.Success success = new Result.Success(L.f17438a);
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.collectErrors(AbstractC2279u.p(presentedOverrides, resultCreateTextComponentStyle, resultOrSuccessfullyNull, resultCreateIconComponentStyle, resultOrSuccessfullyNull2, success)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        AbstractC5504s.f(presentedOverrides, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value = ((Result.Success) presentedOverrides).getValue();
        AbstractC5504s.f(resultCreateTextComponentStyle, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<B of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value2 = ((Result.Success) resultCreateTextComponentStyle).getValue();
        AbstractC5504s.f(resultOrSuccessfullyNull, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<C of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value3 = ((Result.Success) resultOrSuccessfullyNull).getValue();
        AbstractC5504s.f(resultCreateIconComponentStyle, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<D of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value4 = ((Result.Success) resultCreateIconComponentStyle).getValue();
        AbstractC5504s.f(resultOrSuccessfullyNull2, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<E of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value5 = ((Result.Success) resultOrSuccessfullyNull2).getValue();
        ColorStyles colorStyles = (ColorStyles) value5;
        IconComponentStyle iconComponentStyle = (IconComponentStyle) value4;
        TextComponentStyle textComponentStyle = (TextComponentStyle) value3;
        TextComponentStyle textComponentStyle2 = (TextComponentStyle) value2;
        List list = (List) value;
        TimelineComponent.Connector connector2 = item.getConnector();
        if (connector2 != null && colorStyles != null) {
            connectorStyle = new TimelineComponentStyle.ConnectorStyle(connector2.getWidth(), PaddingKt.toPaddingValues(connector2.getMargin()), colorStyles);
        }
        TimelineComponentStyle.ConnectorStyle connectorStyle2 = connectorStyle;
        Boolean visible = item.getVisible();
        return new Result.Success(new TimelineComponentStyle.ItemStyle(textComponentStyle2, visible != null ? visible.booleanValue() : true, textComponentStyle, iconComponentStyle, connectorStyle2, styleFactoryScope.getRcPackage(), styleFactoryScope.getResolvedOffer(), styleFactoryScope.getTabControlIndex(), styleFactoryScope.getOfferEligibility(), list));
    }

    private final Result<TimelineComponentStyle, NonEmptyList<PaywallValidationError>> createTimelineComponentStyle(StyleFactoryScope styleFactoryScope, TimelineComponent timelineComponent) {
        Result presentedOverrides = PresentedPartialKt.toPresentedOverrides(timelineComponent.getOverrides(), this.stripRules, C42711.INSTANCE);
        if (!(presentedOverrides instanceof Result.Success)) {
            if (!(presentedOverrides instanceof Result.Error)) {
                throw new r();
            }
            presentedOverrides = new Result.Error(NonEmptyListKt.nonEmptyListOf((PaywallValidationError) ((Result.Error) presentedOverrides).getValue(), new PaywallValidationError[0]));
        }
        List items = timelineComponent.getItems();
        ArrayList<Result> arrayList = new ArrayList(AbstractC2279u.x(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(createTimelineComponentItemStyle(styleFactoryScope, (TimelineComponent.Item) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Result result : arrayList) {
            if (result instanceof Result.Success) {
                if (arrayList3.isEmpty()) {
                    arrayList2.add((TimelineComponentStyle.ItemStyle) ((Result.Success) result).getValue());
                }
            } else if (result instanceof Result.Error) {
                arrayList3.addAll((Collection) ((Result.Error) result).getValue());
            }
        }
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(arrayList3);
        Result error = nonEmptyListOrNull != null ? new Result.Error(nonEmptyListOrNull) : new Result.Success(arrayList2);
        L l10 = L.f17438a;
        Result.Success success = new Result.Success(l10);
        Result.Success success2 = new Result.Success(l10);
        Result.Success success3 = new Result.Success(l10);
        Result.Success success4 = new Result.Success(l10);
        NonEmptyList nonEmptyListOrNull2 = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.collectErrors(AbstractC2279u.p(presentedOverrides, error, success, success2, success3, success4)));
        if (nonEmptyListOrNull2 != null) {
            return new Result.Error(nonEmptyListOrNull2);
        }
        AbstractC5504s.f(presentedOverrides, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value = ((Result.Success) presentedOverrides).getValue();
        Object value2 = ((Result.Success) error).getValue();
        Object value3 = success.getValue();
        Object value4 = success2.getValue();
        Object value5 = success3.getValue();
        List list = (List) value2;
        List list2 = (List) value;
        int itemSpacing = timelineComponent.getItemSpacing();
        int textSpacing = timelineComponent.getTextSpacing();
        int columnGutter = timelineComponent.getColumnGutter();
        TimelineComponent.IconAlignment iconAlignment = timelineComponent.getIconAlignment();
        Boolean visible = timelineComponent.getVisible();
        return new Result.Success(new TimelineComponentStyle(itemSpacing, textSpacing, columnGutter, iconAlignment, visible != null ? visible.booleanValue() : true, timelineComponent.getSize(), PaddingKt.toPaddingValues(timelineComponent.getPadding()), PaddingKt.toPaddingValues(timelineComponent.getMargin()), list, styleFactoryScope.getRcPackage(), styleFactoryScope.getResolvedOffer(), styleFactoryScope.getTabControlIndex(), styleFactoryScope.getOfferEligibility(), list2));
    }

    private final Result<VideoComponentStyle, NonEmptyList<PaywallValidationError>> createVideoComponentStyle(StyleFactoryScope styleFactoryScope, VideoComponent videoComponent) {
        Result presentedOverrides;
        A aC;
        A aC2;
        Result<NonEmptyMap<LocaleId, ThemeVideoUrls>, NonEmptyList<PaywallValidationError.MissingVideoLocalization>> resultM535withLocalizedOverridesTDPsjl0 = m535withLocalizedOverridesTDPsjl0(videoComponent.getSource(), videoComponent.getOverrideSourceLid());
        ThemeImageUrls fallbackSource = videoComponent.getFallbackSource();
        Result resultOrSuccessfullyNull = ResultKt.orSuccessfullyNull(fallbackSource != null ? m534withLocalizedOverridesTDPsjl0(fallbackSource, videoComponent.getOverrideSourceLid()) : null);
        List overrides = videoComponent.getOverrides();
        if (overrides == null || (presentedOverrides = PresentedPartialKt.toPresentedOverrides(overrides, this.stripRules, new C42721())) == null) {
            presentedOverrides = null;
        } else if (!(presentedOverrides instanceof Result.Success)) {
            if (!(presentedOverrides instanceof Result.Error)) {
                throw new r();
            }
            presentedOverrides = new Result.Error(NonEmptyListKt.nonEmptyListOf((PaywallValidationError) ((Result.Error) presentedOverrides).getValue(), new PaywallValidationError[0]));
        }
        Result resultOrSuccessfullyNull2 = ResultKt.orSuccessfullyNull(presentedOverrides);
        ColorScheme colorOverlay = videoComponent.getColorOverlay();
        Result resultOrSuccessfullyNull3 = ResultKt.orSuccessfullyNull(colorOverlay != null ? ColorStyleKt.toColorStyles(colorOverlay, this.colorAliases) : null);
        Border border = videoComponent.getBorder();
        Result resultOrSuccessfullyNull4 = ResultKt.orSuccessfullyNull(border != null ? BorderStyleKt.toBorderStyles(border, this.colorAliases) : null);
        Shadow shadow = videoComponent.getShadow();
        Result resultOrSuccessfullyNull5 = ResultKt.orSuccessfullyNull(shadow != null ? ShadowStyleKt.toShadowStyles(shadow, this.colorAliases) : null);
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.collectErrors(AbstractC2279u.p(resultM535withLocalizedOverridesTDPsjl0, resultOrSuccessfullyNull, resultOrSuccessfullyNull2, resultOrSuccessfullyNull3, resultOrSuccessfullyNull4, resultOrSuccessfullyNull5)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        AbstractC5504s.f(resultM535withLocalizedOverridesTDPsjl0, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value = ((Result.Success) resultM535withLocalizedOverridesTDPsjl0).getValue();
        AbstractC5504s.f(resultOrSuccessfullyNull, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<B of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value2 = ((Result.Success) resultOrSuccessfullyNull).getValue();
        AbstractC5504s.f(resultOrSuccessfullyNull2, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<C of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value3 = ((Result.Success) resultOrSuccessfullyNull2).getValue();
        AbstractC5504s.f(resultOrSuccessfullyNull3, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<D of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value4 = ((Result.Success) resultOrSuccessfullyNull3).getValue();
        AbstractC5504s.f(resultOrSuccessfullyNull4, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<E of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value5 = ((Result.Success) resultOrSuccessfullyNull4).getValue();
        AbstractC5504s.f(resultOrSuccessfullyNull5, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<F of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        ShadowStyles shadowStyles = (ShadowStyles) ((Result.Success) resultOrSuccessfullyNull5).getValue();
        BorderStyles borderStyles = (BorderStyles) value5;
        ColorStyles colorStyles = (ColorStyles) value4;
        List listM = (List) value3;
        NonEmptyMap nonEmptyMap = (NonEmptyMap) value2;
        NonEmptyMap nonEmptyMap2 = (NonEmptyMap) value;
        Boolean visible = videoComponent.getVisible();
        boolean zBooleanValue = visible != null ? visible.booleanValue() : true;
        Size size = videoComponent.getSize();
        Padding padding = videoComponent.getPadding();
        if (padding == null || (aC = PaddingKt.toPaddingValues(padding)) == null) {
            aC = p.c(DEFAULT_SPACING, DEFAULT_SPACING, 3, null);
        }
        A a10 = aC;
        Padding margin = videoComponent.getMargin();
        if (margin == null || (aC2 = PaddingKt.toPaddingValues(margin)) == null) {
            aC2 = p.c(DEFAULT_SPACING, DEFAULT_SPACING, 3, null);
        }
        A a11 = aC2;
        Package rcPackage = styleFactoryScope.getRcPackage();
        ResolvedOffer resolvedOffer = styleFactoryScope.getResolvedOffer();
        Integer tabControlIndex = styleFactoryScope.getTabControlIndex();
        OfferEligibility offerEligibility = styleFactoryScope.getOfferEligibility();
        if (listM == null) {
            listM = AbstractC2279u.m();
        }
        List list = listM;
        boolean showControls = videoComponent.getShowControls();
        boolean autoplay = videoComponent.getAutoplay();
        boolean loop = videoComponent.getLoop();
        boolean muteAudio = videoComponent.getMuteAudio();
        MaskShape maskShape = videoComponent.getMaskShape();
        return new Result.Success(new VideoComponentStyle(nonEmptyMap2, nonEmptyMap, showControls, autoplay, loop, muteAudio, size, zBooleanValue, a10, a11, maskShape != null ? ShapeKt.toShape(maskShape) : null, borderStyles, shadowStyles, colorStyles, FitModeKt.toContentScale(videoComponent.getFitMode()), rcPackage, resolvedOffer, tabControlIndex, offerEligibility, styleFactoryScope.getIgnoreTopWindowInsets(), list));
    }

    private final Package getPackageOrNull(Offering offering, String str) {
        try {
            return offering.getPackage(str);
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: withLocalizedOverrides-TDPsjl0, reason: not valid java name */
    public final Result<NonEmptyMap<LocaleId, ThemeImageUrls>, NonEmptyList<PaywallValidationError.MissingImageLocalization>> m534withLocalizedOverridesTDPsjl0(ThemeImageUrls themeImageUrls, String str) {
        Result<NonEmptyMap<LocaleId, ThemeImageUrls>, NonEmptyList<PaywallValidationError.MissingImageLocalization>> resultOrSuccessfullyNull = ResultKt.orSuccessfullyNull(str != null ? LocalizationKt.m423imageForAllLocales7v81vok(this.localizations, str) : null);
        if (!(resultOrSuccessfullyNull instanceof Result.Success)) {
            if (resultOrSuccessfullyNull instanceof Result.Error) {
                return resultOrSuccessfullyNull;
            }
            throw new r();
        }
        Map mapI = (NonEmptyMap) ((Result.Success) resultOrSuccessfullyNull).getValue();
        Pair pairA = z.a(this.localizations.getEntry().getKey(), themeImageUrls);
        if (mapI == null) {
            mapI = S.i();
        }
        return new Result.Success(NonEmptyMapKt.nonEmptyMapOf(pairA, mapI));
    }

    public final Result<StyleResult, NonEmptyList<PaywallValidationError>> create(PaywallComponent component, boolean applyBottomWindowInsets, boolean applyHorizontalWindowInsets) {
        AbstractC5504s.h(component, "component");
        StyleFactoryScope styleFactoryScope = new StyleFactoryScope(null, null, null, null, null, null, null, null, 255, null);
        Result resultCreateInternal = createInternal(styleFactoryScope, component);
        if (resultCreateInternal instanceof Result.Success) {
            ComponentStyle componentStyle = (ComponentStyle) ((Result.Success) resultCreateInternal).getValue();
            resultCreateInternal = componentStyle != null ? new Result.Success(componentStyle) : new Result.Error(NonEmptyListKt.nonEmptyListOf(new PaywallValidationError.RootComponentUnsupportedProperties(component), new PaywallValidationError.RootComponentUnsupportedProperties[0]));
        } else if (!(resultCreateInternal instanceof Result.Error)) {
            throw new r();
        }
        if (resultCreateInternal instanceof Result.Success) {
            resultCreateInternal = new Result.Success(styleFactoryScope.applyTopWindowInsetsIfNotYetApplied((ComponentStyle) ((Result.Success) resultCreateInternal).getValue()));
        } else if (!(resultCreateInternal instanceof Result.Error)) {
            throw new r();
        }
        if (resultCreateInternal instanceof Result.Success) {
            resultCreateInternal = new Result.Success(styleFactoryScope.applyBottomWindowInsetsIfNecessary((ComponentStyle) ((Result.Success) resultCreateInternal).getValue(), applyBottomWindowInsets));
        } else if (!(resultCreateInternal instanceof Result.Error)) {
            throw new r();
        }
        if (resultCreateInternal instanceof Result.Success) {
            resultCreateInternal = new Result.Success(styleFactoryScope.applyHorizontalWindowInsetsIfNecessary((ComponentStyle) ((Result.Success) resultCreateInternal).getValue(), applyHorizontalWindowInsets));
        } else if (!(resultCreateInternal instanceof Result.Error)) {
            throw new r();
        }
        if (resultCreateInternal instanceof Result.Success) {
            return new Result.Success(new StyleResult((ComponentStyle) ((Result.Success) resultCreateInternal).getValue(), styleFactoryScope.getPackages(), styleFactoryScope.getDefaultTabIndex()));
        }
        if (resultCreateInternal instanceof Result.Error) {
            return resultCreateInternal;
        }
        throw new r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: withLocalizedOverrides-TDPsjl0, reason: not valid java name */
    public final Result<NonEmptyMap<LocaleId, ThemeVideoUrls>, NonEmptyList<PaywallValidationError.MissingVideoLocalization>> m535withLocalizedOverridesTDPsjl0(ThemeVideoUrls themeVideoUrls, String str) {
        Result<NonEmptyMap<LocaleId, ThemeVideoUrls>, NonEmptyList<PaywallValidationError.MissingVideoLocalization>> resultOrSuccessfullyNull = ResultKt.orSuccessfullyNull(str != null ? LocalizationKt.m429videoForAllLocales7v81vok(this.localizations, str) : null);
        if (resultOrSuccessfullyNull instanceof Result.Success) {
            Map mapI = (NonEmptyMap) ((Result.Success) resultOrSuccessfullyNull).getValue();
            Pair pairA = z.a(this.localizations.getEntry().getKey(), themeVideoUrls);
            if (mapI == null) {
                mapI = S.i();
            }
            return new Result.Success(NonEmptyMapKt.nonEmptyMapOf(pairA, mapI));
        }
        if (resultOrSuccessfullyNull instanceof Result.Error) {
            return resultOrSuccessfullyNull;
        }
        throw new r();
    }

    public /* synthetic */ StyleFactory(NonEmptyMap nonEmptyMap, Map map, Map map2, NonEmptyMap nonEmptyMap2, Offering offering, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nonEmptyMap, map, map2, nonEmptyMap2, offering, (i10 & 32) != 0 ? false : z10);
    }
}
