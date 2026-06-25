package com.revenuecat.purchases.ui.revenuecatui.components;

import B4.b;
import C.A;
import G4.q;
import Td.r;
import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import Y0.L;
import Zd.e;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.p;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.paywalls.components.IconComponent;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.ComponentsConfig;
import com.revenuecat.purchases.paywalls.components.common.ExitOffers;
import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.paywalls.components.common.LocalizationData;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.PaywallComponentsConfig;
import com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData;
import com.revenuecat.purchases.paywalls.components.common.ProductChangeConfig;
import com.revenuecat.purchases.paywalls.components.common.VariableLocalizationKey;
import com.revenuecat.purchases.paywalls.components.properties.Badge;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.MaskShape;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.BuildConfig;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.AlignmentKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.FontKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.PaddingKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.FontSpec;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.style.BadgeStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.IconComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.composables.BackgroundUIConstants;
import com.revenuecat.purchases.ui.revenuecatui.data.MockPurchasesType;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyList;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMap;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMapKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.OfferingToStateMapperKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallResourceProvider;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallValidationResult;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt;
import g1.C4830j;
import i1.C5015h;
import ie.InterfaceC5082a;
import java.net.URL;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;
import s0.AbstractC6387s0;
import s0.C6385r0;
import v4.C6842a;
import v4.InterfaceC6845d;
import x4.f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0086\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001aE\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u00052 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00070\u00072\b\b\u0002\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a¶\u0001\u00102\u001a\u00020/2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\b\b\u0002\u0010.\u001a\u00020-H\u0000ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001aÁ\u0001\u0010E\u001a\u00020D2\u0006\u00103\u001a\u00020\n2\b\b\u0002\u00105\u001a\u0002042\b\b\u0002\u00106\u001a\u00020\u00002\b\b\u0002\u00108\u001a\u0002072\n\b\u0002\u0010:\u001a\u0004\u0018\u0001092\b\b\u0002\u0010<\u001a\u00020;2\b\b\u0002\u0010=\u001a\u00020;2\n\b\u0002\u0010>\u001a\u0004\u0018\u0001042\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001f\u001a\u00020?2\b\b\u0002\u0010 \u001a\u00020?2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\b\b\u0002\u0010.\u001a\u00020-2\u0014\b\u0002\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0A0\u0011H\u0000¢\u0006\u0004\bE\u0010F\u001ak\u0010K\u001a\u00020J2\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u00105\u001a\u0002042\b\b\u0002\u0010>\u001a\u0002042\b\b\u0002\u0010G\u001a\u00020\u001e2\b\b\u0002\u0010H\u001a\u00020\u001e2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010\"\u001a\u00020IH\u0001¢\u0006\u0004\bK\u0010L\u001a\u0019\u0010O\u001a\u00020N2\b\b\u0003\u0010M\u001a\u00020\u0000H\u0001¢\u0006\u0004\bO\u0010P\u001a'\u0010V\u001a\u0016\u0012\u0004\u0012\u00020S\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0T\u0018\u00010R*\u00020QH\u0001¢\u0006\u0004\bV\u0010W\u001a\u001b\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0XH\u0001¢\u0006\u0004\bY\u0010Z\"\u0014\u0010\\\u001a\u00020[8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\\\u0010]\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006^"}, d2 = {"", "initialSelectedTabIndex", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;", "previewEmptyState", "(Ljava/lang/Integer;LY/m;II)Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;", "Lcom/revenuecat/purchases/UiConfig$AppConfig;", "app", "", "Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;", "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;", "", "localizations", "Lcom/revenuecat/purchases/UiConfig$VariableConfig;", "variableConfig", "Lcom/revenuecat/purchases/UiConfig;", "previewUiConfig", "(Lcom/revenuecat/purchases/UiConfig$AppConfig;Ljava/util/Map;Lcom/revenuecat/purchases/UiConfig$VariableConfig;)Lcom/revenuecat/purchases/UiConfig;", "", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;", "children", "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;", "dimension", "", "visible", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Li1/h;", "spacing", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;", AppStateModule.APP_STATE_BACKGROUND, "LC/A;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "shape", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "border", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "shadow", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/BadgeStyle;", "badge", "Lz/q;", "scrollOrientation", "Ljava/util/Date;", "countdownDate", "Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;", "countFrom", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;", "previewStackComponentStyle-7SJ-wSw", "(Ljava/util/List;Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;ZLcom/revenuecat/purchases/paywalls/components/properties/Size;FLcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;LC/A;LC/A;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/BadgeStyle;Lz/q;Ljava/util/Date;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;", "previewStackComponentStyle", "text", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "color", "fontSize", "Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;", "fontWeight", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/FontSpec;", "fontSpec", "Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;", "textAlign", "horizontalAlignment", "backgroundColor", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "tabIndex", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedOverride;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/LocalizedTextPartial;", "overrides", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;", "previewTextComponentStyle", "(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;ILcom/revenuecat/purchases/paywalls/components/properties/FontWeight;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/FontSpec;Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;ZLcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Ljava/lang/Integer;Ljava/util/Date;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;Ljava/util/List;)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;", "paddingValues", "marginValues", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;", "previewIconComponentStyle", "(Lcom/revenuecat/purchases/paywalls/components/properties/Size;ZLcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;LC/A;LC/A;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;LY/m;II)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;", "resource", "Lv4/d;", "previewImageLoader", "(ILY/m;II)Lv4/d;", "Lcom/revenuecat/purchases/Offering;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallValidationResult$Components;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "validatePaywallComponentsDataOrNullForPreviews", "(Lcom/revenuecat/purchases/Offering;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;", "variableLocalizationKeysForEnUs", "()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;", "", "MILLIS_2025_01_25", "J", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class PreviewHelpersKt {
    private static final long MILLIS_2025_01_25 = 1737763200000L;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VariableLocalizationKey.values().length];
            try {
                iArr[VariableLocalizationKey.ANNUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VariableLocalizationKey.ANNUAL_SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VariableLocalizationKey.ANNUALLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VariableLocalizationKey.DAILY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VariableLocalizationKey.DAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VariableLocalizationKey.DAY_SHORT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VariableLocalizationKey.FREE_PRICE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VariableLocalizationKey.MONTH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VariableLocalizationKey.MONTH_SHORT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[VariableLocalizationKey.MONTHLY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[VariableLocalizationKey.LIFETIME.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_DAY_FEW.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_DAY_MANY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_DAY_ONE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_DAY_OTHER.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_DAY_TWO.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_DAY_ZERO.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_MONTH_FEW.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_MONTH_MANY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_MONTH_ONE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_MONTH_OTHER.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_MONTH_TWO.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_MONTH_ZERO.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_WEEK_FEW.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_WEEK_MANY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_WEEK_ONE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_WEEK_OTHER.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_WEEK_TWO.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_WEEK_ZERO.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_YEAR_FEW.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_YEAR_MANY.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_YEAR_ONE.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_YEAR_OTHER.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_YEAR_TWO.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_YEAR_ZERO.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[VariableLocalizationKey.PERCENT.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[VariableLocalizationKey.WEEK.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[VariableLocalizationKey.WEEK_SHORT.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[VariableLocalizationKey.WEEKLY.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[VariableLocalizationKey.YEAR.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[VariableLocalizationKey.YEAR_SHORT.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[VariableLocalizationKey.YEARLY.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_DAYS_SHORT.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_WEEKS_SHORT.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_MONTHS_SHORT.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_YEARS_SHORT.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.PreviewHelpersKt$previewEmptyState$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/Date;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Date invoke() {
            return new Date(PreviewHelpersKt.MILLIS_2025_01_25);
        }
    }

    public static final /* synthetic */ PaywallState.Loaded.Components previewEmptyState(Integer num, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        interfaceC2425m.V(1055380879);
        PaywallValidationResult.Components components = null;
        Integer num2 = (i11 & 1) != 0 ? null : num;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1055380879, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.previewEmptyState (PreviewHelpers.kt:85)");
        }
        Offering offering = new Offering("identifier", "serverDescription", S.i(), AbstractC2279u.e(TestData.Packages.INSTANCE.getMonthly()), null, new Offering.PaywallComponents(new UiConfig((UiConfig.AppConfig) null, NonEmptyMapKt.nonEmptyMapOf(z.a(LocaleId.m307boximpl(LocaleId.m308constructorimpl("en_US")), variableLocalizationKeysForEnUs()), new Pair[0]), (UiConfig.VariableConfig) null, (Map) null, 13, (DefaultConstructorMarker) null), new PaywallComponentsData("preview_paywall_id", "template", new URL("https://assets.pawwalls.com"), new ComponentsConfig(new PaywallComponentsConfig(new StackComponent(AbstractC2279u.e(TestData.Components.INSTANCE.getMonthlyPackageComponent()), (Boolean) null, (Dimension) null, (Size) null, (Float) null, (ColorScheme) null, (Background) null, (Padding) null, (Padding) null, (Shape) null, (Border) null, (Shadow) null, (Badge) null, (StackComponent.Overflow) null, (List) null, 32766, (DefaultConstructorMarker) null), new Background.Color(new ColorScheme(new ColorInfo.Hex(AbstractC6387s0.k(C6385r0.f58985b.k())), (ColorInfo) null, 2, (DefaultConstructorMarker) null)), null)), NonEmptyMapKt.nonEmptyMapOf(z.a(LocaleId.m307boximpl(LocaleId.m308constructorimpl("en_US")), NonEmptyMapKt.nonEmptyMapOf(z.a(LocalizationKey.m343boximpl(LocalizationKey.m344constructorimpl("text")), LocalizationData.Text.m325boximpl(LocalizationData.Text.m326constructorimpl("text"))), new Pair[0])), new Pair[0]), LocaleId.m308constructorimpl("en_US"), 0, (List) null, (ExitOffers) null, (ProductChangeConfig) null, 960, (DefaultConstructorMarker) null)), null, 80, null);
        Result resultValidatePaywallComponentsDataOrNullForPreviews = validatePaywallComponentsDataOrNullForPreviews(offering, interfaceC2425m, 0);
        if (resultValidatePaywallComponentsDataOrNullForPreviews != null) {
            if (resultValidatePaywallComponentsDataOrNullForPreviews instanceof Result.Success) {
                PaywallValidationResult.Components componentsCopy$default = (PaywallValidationResult.Components) ((Result.Success) resultValidatePaywallComponentsDataOrNullForPreviews).getValue();
                if (num2 != null) {
                    componentsCopy$default = PaywallValidationResult.Components.copy$default(componentsCopy$default, null, null, null, null, null, null, null, null, num2, 255, null);
                }
                resultValidatePaywallComponentsDataOrNullForPreviews = new Result.Success(componentsCopy$default);
            } else if (!(resultValidatePaywallComponentsDataOrNullForPreviews instanceof Result.Error)) {
                throw new r();
            }
            components = (PaywallValidationResult.Components) ResultKt.getOrThrow(resultValidatePaywallComponentsDataOrNullForPreviews);
        }
        PaywallValidationResult.Components components2 = components;
        AbstractC5504s.e(components2);
        PaywallState.Loaded.Components componentsPaywallState$default = OfferingToStateMapperKt.toComponentsPaywallState$default(offering, components2, null, AnonymousClass1.INSTANCE, new MockPurchasesType(null, null, null, null, 15, null), null, null, 48, null);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return componentsPaywallState$default;
    }

    public static final IconComponentStyle previewIconComponentStyle(Size size, boolean z10, ColorStyles colorStyles, ColorStyles colorStyles2, A a10, A a11, BorderStyles borderStyles, ShadowStyles shadowStyles, MaskShape maskShape, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        AbstractC5504s.h(size, "size");
        interfaceC2425m.V(971508494);
        boolean z11 = (i11 & 2) != 0 ? true : z10;
        ColorStyles colorStyles3 = (i11 & 4) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.c())), null, 2, null) : colorStyles;
        ColorStyles colorStyles4 = (i11 & 8) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.h())), null, 2, null) : colorStyles2;
        A a12 = (i11 & 16) != 0 ? p.a(C5015h.n(10)) : a10;
        A a13 = (i11 & 32) != 0 ? p.a(C5015h.n(10)) : a11;
        BorderStyles borderStyles2 = (i11 & 64) != 0 ? new BorderStyles(C5015h.n(2), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.c())), null, 2, null), null) : borderStyles;
        ShadowStyles shadowStyles2 = (i11 & 128) != 0 ? new ShadowStyles(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null), C5015h.n(10), C5015h.n(0), C5015h.n(3), null) : shadowStyles;
        MaskShape maskShape2 = (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? MaskShape.Circle.INSTANCE : maskShape;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(971508494, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.previewIconComponentStyle (PreviewHelpers.kt:261)");
        }
        IconComponentStyle iconComponentStyle = new IconComponentStyle("https://example.com", "test-icon-name", new IconComponent.Formats("test-webp"), z11, size, colorStyles3, a12, a13, new IconComponentStyle.Background(colorStyles4, maskShape2, borderStyles2, shadowStyles2), null, null, null, null, AbstractC2279u.m(), 5120, null);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return iconComponentStyle;
    }

    public static final /* synthetic */ InterfaceC6845d previewImageLoader(final int i10, InterfaceC2425m interfaceC2425m, int i11, int i12) {
        interfaceC2425m.V(-1745938743);
        boolean z10 = true;
        if ((i12 & 1) != 0) {
            i10 = R.drawable.f44179android;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1745938743, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.components.previewImageLoader (PreviewHelpers.kt:287)");
        }
        final Context context = (Context) interfaceC2425m.n(AndroidCompositionLocals_androidKt.g());
        InterfaceC6845d.a aVar = new InterfaceC6845d.a(context);
        C6842a.C0928a c0928a = new C6842a.C0928a();
        interfaceC2425m.V(1695006590);
        boolean zF = interfaceC2425m.F(context);
        if ((((i11 & 14) ^ 6) <= 4 || !interfaceC2425m.c(i10)) && (i11 & 6) != 4) {
            z10 = false;
        }
        boolean z11 = zF | z10;
        Object objD = interfaceC2425m.D();
        if (z11 || objD == InterfaceC2425m.f22370a.a()) {
            objD = new b() { // from class: com.revenuecat.purchases.ui.revenuecatui.components.PreviewHelpersKt$previewImageLoader$1$1$1
                @Override // B4.b
                public final Object intercept(b.a aVar2, e eVar) {
                    Drawable drawable = context.getDrawable(i10);
                    AbstractC5504s.e(drawable);
                    return new q(drawable, aVar2.c(), f.MEMORY, null, null, false, false, 120, null);
                }
            };
            interfaceC2425m.u(objD);
        }
        interfaceC2425m.O();
        c0928a.b((b) objD);
        InterfaceC6845d interfaceC6845dB = aVar.c(c0928a.f()).b();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return interfaceC6845dB;
    }

    /* JADX INFO: renamed from: previewStackComponentStyle-7SJ-wSw */
    public static final StackComponentStyle m393previewStackComponentStyle7SJwSw(List<? extends ComponentStyle> children, Dimension dimension, boolean z10, Size size, float f10, BackgroundStyles background, A padding, A margin, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, BadgeStyle badgeStyle, z.q qVar, Date date, CountdownComponent.CountFrom countFrom) {
        AbstractC5504s.h(children, "children");
        AbstractC5504s.h(dimension, "dimension");
        AbstractC5504s.h(size, "size");
        AbstractC5504s.h(background, "background");
        AbstractC5504s.h(padding, "padding");
        AbstractC5504s.h(margin, "margin");
        AbstractC5504s.h(shape, "shape");
        AbstractC5504s.h(countFrom, "countFrom");
        return new StackComponentStyle(children, dimension, z10, size, f10, background, padding, margin, shape, borderStyles, shadowStyles, badgeStyle, qVar, null, null, null, null, date, countFrom, AbstractC2279u.m(), false, false, false, 7421952, null);
    }

    public static final /* synthetic */ TextComponentStyle previewTextComponentStyle(String text, ColorStyles color, int i10, FontWeight fontWeight, FontSpec fontSpec, HorizontalAlignment textAlign, HorizontalAlignment horizontalAlignment, ColorStyles colorStyles, boolean z10, Size size, Padding padding, Padding margin, Integer num, Date date, CountdownComponent.CountFrom countFrom, List overrides) {
        AbstractC5504s.h(text, "text");
        AbstractC5504s.h(color, "color");
        AbstractC5504s.h(fontWeight, "fontWeight");
        AbstractC5504s.h(textAlign, "textAlign");
        AbstractC5504s.h(horizontalAlignment, "horizontalAlignment");
        AbstractC5504s.h(size, "size");
        AbstractC5504s.h(padding, "padding");
        AbstractC5504s.h(margin, "margin");
        AbstractC5504s.h(countFrom, "countFrom");
        AbstractC5504s.h(overrides, "overrides");
        L fontWeight2 = FontKt.toFontWeight(fontWeight);
        String strM308constructorimpl = LocaleId.m308constructorimpl("en_US");
        return new TextComponentStyle(NonEmptyMapKt.nonEmptyMapOf(z.a(LocaleId.m307boximpl(strM308constructorimpl), text), new Pair[0]), color, i10, fontWeight2, fontSpec, C4830j.h(AlignmentKt.toTextAlign(textAlign)), AlignmentKt.toAlignment(horizontalAlignment), colorStyles, z10, size, PaddingKt.toPaddingValues(padding), PaddingKt.toPaddingValues(margin), null, null, num, null, date, countFrom, NonEmptyMapKt.nonEmptyMapOf(z.a(LocaleId.m307boximpl(strM308constructorimpl), variableLocalizationKeysForEnUs()), new Pair[0]), overrides, 40960, null);
    }

    public static final UiConfig previewUiConfig(UiConfig.AppConfig app2, Map<LocaleId, ? extends Map<VariableLocalizationKey, String>> localizations, UiConfig.VariableConfig variableConfig) {
        AbstractC5504s.h(app2, "app");
        AbstractC5504s.h(localizations, "localizations");
        AbstractC5504s.h(variableConfig, "variableConfig");
        return new UiConfig(app2, localizations, variableConfig, (Map) null, 8, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ UiConfig previewUiConfig$default(UiConfig.AppConfig appConfig, Map map, UiConfig.VariableConfig variableConfig, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            appConfig = new UiConfig.AppConfig((Map) null, (Map) null, 3, (DefaultConstructorMarker) null);
        }
        if ((i10 & 2) != 0) {
            map = S.f(z.a(LocaleId.m307boximpl(LocaleId.m308constructorimpl("en_US")), variableLocalizationKeysForEnUs()));
        }
        if ((i10 & 4) != 0) {
            variableConfig = new UiConfig.VariableConfig((Map) null, (Map) null, 3, (DefaultConstructorMarker) null);
        }
        return previewUiConfig(appConfig, map, variableConfig);
    }

    public static final /* synthetic */ Result validatePaywallComponentsDataOrNullForPreviews(Offering offering, InterfaceC2425m interfaceC2425m, int i10) {
        AbstractC5504s.h(offering, "<this>");
        interfaceC2425m.V(1679297795);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1679297795, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.validatePaywallComponentsDataOrNullForPreviews (PreviewHelpers.kt:306)");
        }
        Resources resources = ((Context) interfaceC2425m.n(AndroidCompositionLocals_androidKt.g())).getResources();
        AbstractC5504s.g(resources, "LocalContext.current.resources");
        Result<PaywallValidationResult.Components, NonEmptyList<PaywallValidationError>> resultValidatePaywallComponentsDataOrNull = OfferingToStateMapperKt.validatePaywallComponentsDataOrNull(offering, new PaywallResourceProvider("RevenueCatUI Previews", BuildConfig.LIBRARY_PACKAGE_NAME, resources));
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return resultValidatePaywallComponentsDataOrNull;
    }

    public static final /* synthetic */ NonEmptyMap variableLocalizationKeysForEnUs() {
        VariableLocalizationKey[] variableLocalizationKeyArrValues = VariableLocalizationKey.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5874j.e(S.e(variableLocalizationKeyArrValues.length), 16));
        for (VariableLocalizationKey variableLocalizationKey : variableLocalizationKeyArrValues) {
            String str = "day";
            switch (WhenMappings.$EnumSwitchMapping$0[variableLocalizationKey.ordinal()]) {
                case 1:
                    str = "annual";
                    break;
                case 2:
                case 41:
                    str = "yr";
                    break;
                case 3:
                    str = "annually";
                    break;
                case 4:
                    str = "daily";
                    break;
                case 5:
                case 6:
                    break;
                case 7:
                    str = "free";
                    break;
                case 8:
                    str = "month";
                    break;
                case 9:
                    str = "mo";
                    break;
                case 10:
                    str = "monthly";
                    break;
                case 11:
                    str = "lifetime";
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                case 13:
                case 15:
                case 16:
                    str = "%d days";
                    break;
                case 14:
                case 17:
                    str = "%d day";
                    break;
                case 18:
                case 19:
                case 21:
                case 22:
                    str = "%d months";
                    break;
                case 20:
                case 23:
                    str = "%d month";
                    break;
                case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                case 25:
                case 27:
                case 28:
                    str = "%d weeks";
                    break;
                case 26:
                case 29:
                    str = "%d week";
                    break;
                case 30:
                case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                case 33:
                case 34:
                    str = "%d years";
                    break;
                case 32:
                case 35:
                    str = "%d year";
                    break;
                case 36:
                    str = "%d%%";
                    break;
                case 37:
                    str = "week";
                    break;
                case 38:
                    str = "wk";
                    break;
                case 39:
                    str = "weekly";
                    break;
                case 40:
                    str = "year";
                    break;
                case 42:
                    str = "yearly";
                    break;
                case 43:
                    str = "%dd";
                    break;
                case 44:
                    str = "%dwk";
                    break;
                case 45:
                    str = "%dmo";
                    break;
                case 46:
                    str = "%dyr";
                    break;
                default:
                    throw new r();
            }
            linkedHashMap.put(variableLocalizationKey, str);
        }
        NonEmptyMap nonEmptyMapOrNull = NonEmptyMapKt.toNonEmptyMapOrNull(linkedHashMap);
        AbstractC5504s.e(nonEmptyMapOrNull);
        return nonEmptyMapOrNull;
    }
}
