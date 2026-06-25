package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import Df.AbstractC1268a;
import Df.InterfaceC1279l;
import Df.p;
import Df.r;
import Td.AbstractC2163n;
import Ud.AbstractC2279u;
import Ud.S;
import com.amazon.a.a.o.b.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.paywalls.components.common.VariableLocalizationKey;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownTime;
import com.revenuecat.purchases.ui.revenuecatui.composables.BackgroundUIConstants;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessor;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import ke.AbstractC5466a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002VWB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\b\u001a\u00020\u0004*\u00020\u00042\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0004\u0012\u00020\u00040\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ»\u0001\u0010%\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\"0\f2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\"0\fH\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b*\u0010+JU\u0010/\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\"0\f2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\"0\f2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b/\u00100J-\u00103\u001a\u0004\u0018\u0001022\u0006\u0010\n\u001a\u00020\u00042\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\fH\u0002¢\u0006\u0004\b3\u00104J-\u00107\u001a\u0004\u0018\u00010-2\u0006\u00105\u001a\u00020\u00042\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\fH\u0002¢\u0006\u0004\b7\u00108J#\u0010:\u001a\u00020)*\u0002092\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b:\u0010;J#\u0010>\u001a\u00020)*\u0002092\u0006\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u0004H\u0002¢\u0006\u0004\b>\u0010?J\u001b\u0010@\u001a\u00020)*\u0002092\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b@\u0010AJ#\u0010B\u001a\u00020)*\u0002092\u0006\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u0004H\u0002¢\u0006\u0004\bB\u0010?J\u001b\u0010C\u001a\u00020)*\u0002092\u0006\u00105\u001a\u00020\u0004H\u0002¢\u0006\u0004\bC\u0010AJ{\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u0002022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\u0007\u0010DJ#\u0010G\u001a\u00020\u0004*\u00020\u00042\u0006\u0010E\u001a\u00020-2\u0006\u0010F\u001a\u00020\u0019H\u0002¢\u0006\u0004\bG\u0010HJ)\u0010I\u001a\u0004\u0018\u00010\u0004*\u00020\u00132\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\fH\u0002¢\u0006\u0004\bI\u0010JJÁ\u0001\u0010L\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u00042\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010!\u001a\u00020 2\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\"0\f2\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\"0\f¢\u0006\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082T¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006X"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;", "", "<init>", "()V", "", "Lkotlin/Function2;", "", "getValue", "replaceVariablesWithValues", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;", "variableIdentifier", "functionIdentifiers", "", "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;", "localizedVariableKeys", "Lcom/revenuecat/purchases/UiConfig$VariableConfig;", "variableConfig", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;", "variableDataProvider", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;", "packageContext", "Lcom/revenuecat/purchases/Package;", "rcPackage", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "subscriptionOption", "Ljava/util/Locale;", "currencyLocale", "dateLocale", "Ljava/util/Date;", "date", "Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;", "countdownTime", "Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;", "countFrom", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "customVariables", "defaultCustomVariables", "getVariableValue", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lcom/revenuecat/purchases/UiConfig$VariableConfig;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/models/SubscriptionOption;Ljava/util/Locale;Ljava/util/Locale;Ljava/util/Date;Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;Ljava/util/Map;Ljava/util/Map;)Ljava/lang/String;", "extractCustomVariableKey", "(Ljava/lang/String;)Ljava/lang/String;", "LTd/L;", "checkForMalformedCustomVariable", "(Ljava/lang/String;)V", SubscriberAttributeKt.JSON_NAME_KEY, "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Function;", "functions", "resolveCustomVariable", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/Locale;)Ljava/lang/String;", "variableCompatibilityMap", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Variable;", "findVariable", "(Ljava/lang/String;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Variable;", "functionIdentifier", "functionCompatibilityMap", "findFunction", "(Ljava/lang/String;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Function;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;", "failedToGetValue", "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;Ljava/lang/String;Lcom/revenuecat/purchases/Package;)V", "original", "fallback", "usingFallbackVariable", "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;Ljava/lang/String;Ljava/lang/String;)V", "unsupportedVariableWithoutFallback", "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;Ljava/lang/String;)V", "usingFallbackFunction", "unsupportedFunctionWithoutFallback", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Variable;Ljava/util/Map;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/models/SubscriptionOption;Ljava/util/Locale;Ljava/util/Locale;Ljava/util/Date;Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;)Ljava/lang/String;", "function", "locale", "processFunction", "(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Function;Ljava/util/Locale;)Ljava/lang/String;", "relativeDiscount", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Ljava/util/Map;)Ljava/lang/String;", "template", "processVariables", "(Ljava/lang/String;Ljava/util/Map;Lcom/revenuecat/purchases/UiConfig$VariableConfig;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/models/SubscriptionOption;Ljava/util/Locale;Ljava/util/Locale;Ljava/util/Date;Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;Ljava/util/Map;Ljava/util/Map;)Ljava/lang/String;", "", "PERCENT_SCALE", "F", "LDf/p;", "regex", "LDf/p;", "customVariablePrefixes", "Ljava/util/List;", "Function", "Variable", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VariableProcessorV2 {
    private static final float PERCENT_SCALE = 100.0f;
    public static final VariableProcessorV2 INSTANCE = new VariableProcessorV2();
    private static final p regex = new p("\\{\\{\\s*(.*?)\\s*\\}\\}");
    private static final List<String> customVariablePrefixes = AbstractC2279u.p("custom.", "$custom.");
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Function;", "", "identifier", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "LOWERCASE", "UPPERCASE", "CAPITALIZE", "Companion", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Function {
        LOWERCASE("lowercase"),
        UPPERCASE("uppercase"),
        CAPITALIZE("capitalize");

        private final String identifier;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy valuesByIdentifier$delegate = AbstractC2163n.b(VariableProcessorV2$Function$Companion$valuesByIdentifier$2.INSTANCE);

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u0005R'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Function$Companion;", "", "()V", "valuesByIdentifier", "", "", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Function;", "getValuesByIdentifier", "()Ljava/util/Map;", "valuesByIdentifier$delegate", "Lkotlin/Lazy;", "valueOfIdentifier", "identifier", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final Map<String, Function> getValuesByIdentifier() {
                return (Map) Function.valuesByIdentifier$delegate.getValue();
            }

            public final Function valueOfIdentifier(String identifier) {
                AbstractC5504s.h(identifier, "identifier");
                return getValuesByIdentifier().get(identifier);
            }

            private Companion() {
            }
        }

        Function(String str) {
            this.identifier = str;
        }

        public final /* synthetic */ String getIdentifier() {
            return this.identifier;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b0\b\u0080\u0001\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00000\u0001:\u00012B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1¨\u00063"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Variable;", "", "identifier", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "PRODUCT_CURRENCY_CODE", "PRODUCT_CURRENCY_SYMBOL", "PRODUCT_PERIODLY", "PRODUCT_PRICE", "PRODUCT_PRICE_PER_PERIOD", "PRODUCT_PRICE_PER_PERIOD_ABBREVIATED", "PRODUCT_PRICE_PER_DAY", "PRODUCT_PRICE_PER_WEEK", "PRODUCT_PRICE_PER_MONTH", "PRODUCT_PRICE_PER_YEAR", "PRODUCT_PERIOD", "PRODUCT_PERIOD_ABBREVIATED", "PRODUCT_PERIOD_IN_DAYS", "PRODUCT_PERIOD_IN_WEEKS", "PRODUCT_PERIOD_IN_MONTHS", "PRODUCT_PERIOD_IN_YEARS", "PRODUCT_PERIOD_WITH_UNIT", "PRODUCT_OFFER_PRICE", "PRODUCT_OFFER_PRICE_PER_DAY", "PRODUCT_OFFER_PRICE_PER_WEEK", "PRODUCT_OFFER_PRICE_PER_MONTH", "PRODUCT_OFFER_PRICE_PER_YEAR", "PRODUCT_OFFER_PERIOD", "PRODUCT_OFFER_PERIOD_ABBREVIATED", "PRODUCT_OFFER_PERIOD_IN_DAYS", "PRODUCT_OFFER_PERIOD_IN_WEEKS", "PRODUCT_OFFER_PERIOD_IN_MONTHS", "PRODUCT_OFFER_PERIOD_IN_YEARS", "PRODUCT_OFFER_PERIOD_WITH_UNIT", "PRODUCT_OFFER_END_DATE", "PRODUCT_SECONDARY_OFFER_PRICE", "PRODUCT_SECONDARY_OFFER_PERIOD", "PRODUCT_SECONDARY_OFFER_PERIOD_ABBREVIATED", "PRODUCT_RELATIVE_DISCOUNT", "PRODUCT_STORE_PRODUCT_NAME", "COUNT_DAYS_WITH_ZERO", "COUNT_DAYS_WITHOUT_ZERO", "COUNT_HOURS_WITH_ZERO", "COUNT_HOURS_WITHOUT_ZERO", "COUNT_MINUTES_WITH_ZERO", "COUNT_MINUTES_WITHOUT_ZERO", "COUNT_SECONDS_WITH_ZERO", "COUNT_SECONDS_WITHOUT_ZERO", "Companion", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Variable {
        PRODUCT_CURRENCY_CODE("product.currency_code"),
        PRODUCT_CURRENCY_SYMBOL("product.currency_symbol"),
        PRODUCT_PERIODLY("product.periodly"),
        PRODUCT_PRICE("product.price"),
        PRODUCT_PRICE_PER_PERIOD("product.price_per_period"),
        PRODUCT_PRICE_PER_PERIOD_ABBREVIATED("product.price_per_period_abbreviated"),
        PRODUCT_PRICE_PER_DAY("product.price_per_day"),
        PRODUCT_PRICE_PER_WEEK("product.price_per_week"),
        PRODUCT_PRICE_PER_MONTH("product.price_per_month"),
        PRODUCT_PRICE_PER_YEAR("product.price_per_year"),
        PRODUCT_PERIOD("product.period"),
        PRODUCT_PERIOD_ABBREVIATED("product.period_abbreviated"),
        PRODUCT_PERIOD_IN_DAYS("product.period_in_days"),
        PRODUCT_PERIOD_IN_WEEKS("product.period_in_weeks"),
        PRODUCT_PERIOD_IN_MONTHS("product.period_in_months"),
        PRODUCT_PERIOD_IN_YEARS("product.period_in_years"),
        PRODUCT_PERIOD_WITH_UNIT("product.period_with_unit"),
        PRODUCT_OFFER_PRICE("product.offer_price"),
        PRODUCT_OFFER_PRICE_PER_DAY("product.offer_price_per_day"),
        PRODUCT_OFFER_PRICE_PER_WEEK("product.offer_price_per_week"),
        PRODUCT_OFFER_PRICE_PER_MONTH("product.offer_price_per_month"),
        PRODUCT_OFFER_PRICE_PER_YEAR("product.offer_price_per_year"),
        PRODUCT_OFFER_PERIOD("product.offer_period"),
        PRODUCT_OFFER_PERIOD_ABBREVIATED("product.offer_period_abbreviated"),
        PRODUCT_OFFER_PERIOD_IN_DAYS("product.offer_period_in_days"),
        PRODUCT_OFFER_PERIOD_IN_WEEKS("product.offer_period_in_weeks"),
        PRODUCT_OFFER_PERIOD_IN_MONTHS("product.offer_period_in_months"),
        PRODUCT_OFFER_PERIOD_IN_YEARS("product.offer_period_in_years"),
        PRODUCT_OFFER_PERIOD_WITH_UNIT("product.offer_period_with_unit"),
        PRODUCT_OFFER_END_DATE("product.offer_end_date"),
        PRODUCT_SECONDARY_OFFER_PRICE("product.secondary_offer_price"),
        PRODUCT_SECONDARY_OFFER_PERIOD("product.secondary_offer_period"),
        PRODUCT_SECONDARY_OFFER_PERIOD_ABBREVIATED("product.secondary_offer_period_abbreviated"),
        PRODUCT_RELATIVE_DISCOUNT("product.relative_discount"),
        PRODUCT_STORE_PRODUCT_NAME("product.store_product_name"),
        COUNT_DAYS_WITH_ZERO("count_days_with_zero"),
        COUNT_DAYS_WITHOUT_ZERO("count_days_without_zero"),
        COUNT_HOURS_WITH_ZERO("count_hours_with_zero"),
        COUNT_HOURS_WITHOUT_ZERO("count_hours_without_zero"),
        COUNT_MINUTES_WITH_ZERO("count_minutes_with_zero"),
        COUNT_MINUTES_WITHOUT_ZERO("count_minutes_without_zero"),
        COUNT_SECONDS_WITH_ZERO("count_seconds_with_zero"),
        COUNT_SECONDS_WITHOUT_ZERO("count_seconds_without_zero");

        private final String identifier;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy valuesByIdentifier$delegate = AbstractC2163n.b(VariableProcessorV2$Variable$Companion$valuesByIdentifier$2.INSTANCE);

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u0005R'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Variable$Companion;", "", "()V", "valuesByIdentifier", "", "", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Variable;", "getValuesByIdentifier", "()Ljava/util/Map;", "valuesByIdentifier$delegate", "Lkotlin/Lazy;", "valueOfIdentifier", "identifier", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final Map<String, Variable> getValuesByIdentifier() {
                return (Map) Variable.valuesByIdentifier$delegate.getValue();
            }

            public final Variable valueOfIdentifier(String identifier) {
                AbstractC5504s.h(identifier, "identifier");
                return getValuesByIdentifier().get(identifier);
            }

            private Companion() {
            }
        }

        Variable(String str) {
            this.identifier = str;
        }

        public final /* synthetic */ String getIdentifier() {
            return this.identifier;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[CountdownComponent.CountFrom.values().length];
            try {
                iArr[CountdownComponent.CountFrom.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CountdownComponent.CountFrom.HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CountdownComponent.CountFrom.MINUTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Variable.values().length];
            try {
                iArr2[Variable.PRODUCT_CURRENCY_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Variable.PRODUCT_CURRENCY_SYMBOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Variable.PRODUCT_PERIODLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Variable.PRODUCT_PRICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Variable.PRODUCT_PRICE_PER_PERIOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Variable.PRODUCT_PRICE_PER_PERIOD_ABBREVIATED.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[Variable.PRODUCT_PRICE_PER_DAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[Variable.PRODUCT_PRICE_PER_WEEK.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[Variable.PRODUCT_PRICE_PER_MONTH.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[Variable.PRODUCT_PRICE_PER_YEAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[Variable.PRODUCT_PERIOD.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[Variable.PRODUCT_PERIOD_ABBREVIATED.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[Variable.PRODUCT_PERIOD_IN_DAYS.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[Variable.PRODUCT_PERIOD_IN_WEEKS.ordinal()] = 14;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[Variable.PRODUCT_PERIOD_IN_MONTHS.ordinal()] = 15;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[Variable.PRODUCT_PERIOD_IN_YEARS.ordinal()] = 16;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[Variable.PRODUCT_PERIOD_WITH_UNIT.ordinal()] = 17;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[Variable.PRODUCT_OFFER_PRICE.ordinal()] = 18;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[Variable.PRODUCT_OFFER_PRICE_PER_DAY.ordinal()] = 19;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[Variable.PRODUCT_OFFER_PRICE_PER_WEEK.ordinal()] = 20;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[Variable.PRODUCT_OFFER_PRICE_PER_MONTH.ordinal()] = 21;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[Variable.PRODUCT_OFFER_PRICE_PER_YEAR.ordinal()] = 22;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[Variable.PRODUCT_OFFER_PERIOD.ordinal()] = 23;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[Variable.PRODUCT_OFFER_PERIOD_ABBREVIATED.ordinal()] = 24;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[Variable.PRODUCT_OFFER_PERIOD_IN_DAYS.ordinal()] = 25;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[Variable.PRODUCT_OFFER_PERIOD_IN_WEEKS.ordinal()] = 26;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[Variable.PRODUCT_OFFER_PERIOD_IN_MONTHS.ordinal()] = 27;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[Variable.PRODUCT_OFFER_PERIOD_IN_YEARS.ordinal()] = 28;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[Variable.PRODUCT_OFFER_PERIOD_WITH_UNIT.ordinal()] = 29;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[Variable.PRODUCT_OFFER_END_DATE.ordinal()] = 30;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[Variable.PRODUCT_SECONDARY_OFFER_PRICE.ordinal()] = 31;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr2[Variable.PRODUCT_SECONDARY_OFFER_PERIOD.ordinal()] = 32;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr2[Variable.PRODUCT_SECONDARY_OFFER_PERIOD_ABBREVIATED.ordinal()] = 33;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr2[Variable.PRODUCT_RELATIVE_DISCOUNT.ordinal()] = 34;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr2[Variable.PRODUCT_STORE_PRODUCT_NAME.ordinal()] = 35;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr2[Variable.COUNT_DAYS_WITH_ZERO.ordinal()] = 36;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr2[Variable.COUNT_DAYS_WITHOUT_ZERO.ordinal()] = 37;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr2[Variable.COUNT_HOURS_WITH_ZERO.ordinal()] = 38;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr2[Variable.COUNT_HOURS_WITHOUT_ZERO.ordinal()] = 39;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr2[Variable.COUNT_MINUTES_WITH_ZERO.ordinal()] = 40;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr2[Variable.COUNT_MINUTES_WITHOUT_ZERO.ordinal()] = 41;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr2[Variable.COUNT_SECONDS_WITH_ZERO.ordinal()] = 42;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr2[Variable.COUNT_SECONDS_WITHOUT_ZERO.ordinal()] = 43;
            } catch (NoSuchFieldError unused46) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Function.values().length];
            try {
                iArr3[Function.LOWERCASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr3[Function.UPPERCASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr3[Function.CAPITALIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused49) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessorV2$getValue$14, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/revenuecat/purchases/models/PricingPhase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass14 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Map<VariableLocalizationKey, String> $localizedVariableKeys;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass14(Map<VariableLocalizationKey, String> map) {
            super(1);
            this.$localizedVariableKeys = map;
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(PricingPhase it) {
            AbstractC5504s.h(it, "it");
            return PricingPhaseExtensionsKt.productOfferPeriod(it, this.$localizedVariableKeys);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessorV2$getValue$15, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass15 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ Map<VariableLocalizationKey, String> $localizedVariableKeys;
        final /* synthetic */ Package $rcPackage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass15(Package r12, Map<VariableLocalizationKey, String> map) {
            super(0);
            this.$rcPackage = r12;
            this.$localizedVariableKeys = map;
        }

        @Override // ie.InterfaceC5082a
        public final String invoke() {
            Package r02 = this.$rcPackage;
            if (r02 != null) {
                return PackagePeriodExtensionsKt.productPeriod(r02, this.$localizedVariableKeys);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessorV2$getValue$16, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/revenuecat/purchases/models/PricingPhase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass16 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Map<VariableLocalizationKey, String> $localizedVariableKeys;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass16(Map<VariableLocalizationKey, String> map) {
            super(1);
            this.$localizedVariableKeys = map;
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(PricingPhase it) {
            AbstractC5504s.h(it, "it");
            return PricingPhaseExtensionsKt.productOfferPeriodAbbreviated(it, this.$localizedVariableKeys);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessorV2$getValue$17, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass17 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ Map<VariableLocalizationKey, String> $localizedVariableKeys;
        final /* synthetic */ Package $rcPackage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass17(Package r12, Map<VariableLocalizationKey, String> map) {
            super(0);
            this.$rcPackage = r12;
            this.$localizedVariableKeys = map;
        }

        @Override // ie.InterfaceC5082a
        public final String invoke() {
            Package r02 = this.$rcPackage;
            if (r02 != null) {
                return PackagePeriodExtensionsKt.productPeriodAbbreviated(r02, this.$localizedVariableKeys);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessorV2$getValue$18, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass18 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ Locale $currencyLocale;
        final /* synthetic */ VariableProcessor.PackageContext $packageContext;
        final /* synthetic */ Package $rcPackage;
        final /* synthetic */ VariableDataProvider $variableDataProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass18(Package r12, VariableProcessor.PackageContext packageContext, VariableDataProvider variableDataProvider, Locale locale) {
            super(0);
            this.$rcPackage = r12;
            this.$packageContext = packageContext;
            this.$variableDataProvider = variableDataProvider;
            this.$currencyLocale = locale;
        }

        @Override // ie.InterfaceC5082a
        public final String invoke() {
            Package r02 = this.$rcPackage;
            if (r02 != null) {
                VariableProcessor.PackageContext packageContext = this.$packageContext;
                VariableDataProvider variableDataProvider = this.$variableDataProvider;
                Locale locale = this.$currencyLocale;
                boolean showZeroDecimalPlacePrices = packageContext != null ? packageContext.getShowZeroDecimalPlacePrices() : false;
                if (variableDataProvider != null) {
                    return variableDataProvider.localizedPrice(r02, locale, showZeroDecimalPlacePrices);
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessorV2$getValue$19, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/revenuecat/purchases/models/PricingPhase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass19 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Map<VariableLocalizationKey, String> $localizedVariableKeys;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass19(Map<VariableLocalizationKey, String> map) {
            super(1);
            this.$localizedVariableKeys = map;
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(PricingPhase it) {
            AbstractC5504s.h(it, "it");
            return PricingPhaseExtensionsKt.productOfferPeriod(it, this.$localizedVariableKeys);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessorV2$getValue$20, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass20 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ Map<VariableLocalizationKey, String> $localizedVariableKeys;
        final /* synthetic */ Package $rcPackage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass20(Package r12, Map<VariableLocalizationKey, String> map) {
            super(0);
            this.$rcPackage = r12;
            this.$localizedVariableKeys = map;
        }

        @Override // ie.InterfaceC5082a
        public final String invoke() {
            Package r02 = this.$rcPackage;
            if (r02 != null) {
                return PackagePeriodExtensionsKt.productPeriod(r02, this.$localizedVariableKeys);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessorV2$getValue$21, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/revenuecat/purchases/models/PricingPhase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass21 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Map<VariableLocalizationKey, String> $localizedVariableKeys;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass21(Map<VariableLocalizationKey, String> map) {
            super(1);
            this.$localizedVariableKeys = map;
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(PricingPhase it) {
            AbstractC5504s.h(it, "it");
            return PricingPhaseExtensionsKt.productOfferPeriodAbbreviated(it, this.$localizedVariableKeys);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessorV2$getValue$22, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass22 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ Map<VariableLocalizationKey, String> $localizedVariableKeys;
        final /* synthetic */ Package $rcPackage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass22(Package r12, Map<VariableLocalizationKey, String> map) {
            super(0);
            this.$rcPackage = r12;
            this.$localizedVariableKeys = map;
        }

        @Override // ie.InterfaceC5082a
        public final String invoke() {
            Package r02 = this.$rcPackage;
            if (r02 != null) {
                return PackagePeriodExtensionsKt.productPeriodAbbreviated(r02, this.$localizedVariableKeys);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessorV2$getValue$9, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass9 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ Locale $currencyLocale;
        final /* synthetic */ VariableProcessor.PackageContext $packageContext;
        final /* synthetic */ Package $rcPackage;
        final /* synthetic */ VariableDataProvider $variableDataProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass9(Package r12, VariableProcessor.PackageContext packageContext, VariableDataProvider variableDataProvider, Locale locale) {
            super(0);
            this.$rcPackage = r12;
            this.$packageContext = packageContext;
            this.$variableDataProvider = variableDataProvider;
            this.$currencyLocale = locale;
        }

        @Override // ie.InterfaceC5082a
        public final String invoke() {
            Package r02 = this.$rcPackage;
            if (r02 != null) {
                VariableProcessor.PackageContext packageContext = this.$packageContext;
                VariableDataProvider variableDataProvider = this.$variableDataProvider;
                Locale locale = this.$currencyLocale;
                boolean showZeroDecimalPlacePrices = packageContext != null ? packageContext.getShowZeroDecimalPlacePrices() : false;
                if (variableDataProvider != null) {
                    return variableDataProvider.localizedPrice(r02, locale, showZeroDecimalPlacePrices);
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessorV2$processVariables$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "variable", "functions", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ CountdownComponent.CountFrom $countFrom;
        final /* synthetic */ CountdownTime $countdownTime;
        final /* synthetic */ Locale $currencyLocale;
        final /* synthetic */ Map<String, CustomVariableValue> $customVariables;
        final /* synthetic */ Date $date;
        final /* synthetic */ Locale $dateLocale;
        final /* synthetic */ Map<String, CustomVariableValue> $defaultCustomVariables;
        final /* synthetic */ Map<VariableLocalizationKey, String> $localizedVariableKeys;
        final /* synthetic */ VariableProcessor.PackageContext $packageContext;
        final /* synthetic */ Package $rcPackage;
        final /* synthetic */ SubscriptionOption $subscriptionOption;
        final /* synthetic */ UiConfig.VariableConfig $variableConfig;
        final /* synthetic */ VariableDataProvider $variableDataProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Map<VariableLocalizationKey, String> map, UiConfig.VariableConfig variableConfig, VariableDataProvider variableDataProvider, VariableProcessor.PackageContext packageContext, Package r52, SubscriptionOption subscriptionOption, Locale locale, Locale locale2, Date date, CountdownTime countdownTime, CountdownComponent.CountFrom countFrom, Map<String, ? extends CustomVariableValue> map2, Map<String, ? extends CustomVariableValue> map3) {
            super(2);
            this.$localizedVariableKeys = map;
            this.$variableConfig = variableConfig;
            this.$variableDataProvider = variableDataProvider;
            this.$packageContext = packageContext;
            this.$rcPackage = r52;
            this.$subscriptionOption = subscriptionOption;
            this.$currencyLocale = locale;
            this.$dateLocale = locale2;
            this.$date = date;
            this.$countdownTime = countdownTime;
            this.$countFrom = countFrom;
            this.$customVariables = map2;
            this.$defaultCustomVariables = map3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final String invoke(String variable, List<String> functions) {
            AbstractC5504s.h(variable, "variable");
            AbstractC5504s.h(functions, "functions");
            return VariableProcessorV2.INSTANCE.getVariableValue(variable, functions, this.$localizedVariableKeys, this.$variableConfig, this.$variableDataProvider, this.$packageContext, this.$rcPackage, this.$subscriptionOption, this.$currencyLocale, this.$dateLocale, this.$date, this.$countdownTime, this.$countFrom, this.$customVariables, this.$defaultCustomVariables);
        }
    }

    private VariableProcessorV2() {
    }

    private final void checkForMalformedCustomVariable(String variableIdentifier) {
        for (String str : AbstractC2279u.p("custom", "$custom")) {
            if (!AbstractC5504s.c(variableIdentifier, str)) {
                if (r.Q(variableIdentifier, str + ' ', false, 2, null)) {
                }
            }
            Logger.INSTANCE.w("Variable '" + variableIdentifier + "' looks like it might be intended as a custom variable. Use 'custom.<variable_name>' or '$custom.<variable_name>' syntax instead.");
            return;
        }
    }

    private final String extractCustomVariableKey(String variableIdentifier) {
        for (String str : customVariablePrefixes) {
            if (r.Q(variableIdentifier, str, false, 2, null)) {
                String strC0 = r.C0(variableIdentifier, str);
                if (strC0.length() != 0) {
                    return strC0;
                }
                Logger.INSTANCE.w("Custom variable '" + variableIdentifier + "' appears to be malformed. Expected format: 'custom.<variable_name>' or '$custom.<variable_name>'.");
                return null;
            }
        }
        checkForMalformedCustomVariable(variableIdentifier);
        return null;
    }

    private final void failedToGetValue(Logger logger, String str, Package r52) {
        logger.w("Could not process value for variable '" + str + "' for package '" + r52.getIdentifier() + "'. Please check that the product for that package matches the requirements for that variable. Defaulting to empty string.");
    }

    private final Function findFunction(String functionIdentifier, Map<String, String> functionCompatibilityMap) {
        Function functionValueOfIdentifier = Function.INSTANCE.valueOfIdentifier(functionIdentifier);
        if (functionValueOfIdentifier != null) {
            return functionValueOfIdentifier;
        }
        String str = functionCompatibilityMap.get(functionIdentifier);
        if (str == null) {
            unsupportedFunctionWithoutFallback(Logger.INSTANCE, functionIdentifier);
            return null;
        }
        Function functionFindFunction = findFunction(str, functionCompatibilityMap);
        if (functionFindFunction == null) {
            return null;
        }
        INSTANCE.usingFallbackFunction(Logger.INSTANCE, functionIdentifier, str);
        return functionFindFunction;
    }

    private final Variable findVariable(String variableIdentifier, Map<String, String> variableCompatibilityMap) {
        Variable variableValueOfIdentifier = Variable.INSTANCE.valueOfIdentifier(variableIdentifier);
        if (variableValueOfIdentifier != null) {
            return variableValueOfIdentifier;
        }
        String str = variableCompatibilityMap.get(variableIdentifier);
        if (str == null) {
            unsupportedVariableWithoutFallback(Logger.INSTANCE, variableIdentifier);
            return null;
        }
        Variable variableFindVariable = findVariable(str, variableCompatibilityMap);
        if (variableFindVariable == null) {
            return null;
        }
        INSTANCE.usingFallbackVariable(Logger.INSTANCE, variableIdentifier, str);
        return variableFindVariable;
    }

    private final String getValue(Variable variable, Map<VariableLocalizationKey, String> map, VariableDataProvider variableDataProvider, VariableProcessor.PackageContext packageContext, Package r23, SubscriptionOption subscriptionOption, Locale locale, Locale locale2, Date date, CountdownTime countdownTime, CountdownComponent.CountFrom countFrom) {
        StoreProduct product;
        Price price;
        StoreProduct product2;
        Period period;
        StoreProduct product3;
        Period period2;
        StoreProduct product4;
        Period period3;
        StoreProduct product5;
        Period period4;
        String strProductOfferPricePerDay;
        String strProductOfferPricePerWeek;
        String strProductOfferPricePerMonth;
        String strProductOfferPricePerYear;
        StoreProduct product6;
        Period period5;
        String productOfferPeriodInDays;
        StoreProduct product7;
        Period period6;
        String productOfferPeriodInWeeks;
        StoreProduct product8;
        Period period7;
        String productOfferPeriodInMonths;
        StoreProduct product9;
        Period period8;
        String productOfferPeriodInYears;
        String strProductOfferPeriodWithUnit;
        StoreProduct product10;
        int minutes;
        int minutes2;
        int hours = 0;
        int hours2 = 0;
        days = 0;
        int days = 0;
        days = 0;
        int days2 = 0;
        switch (WhenMappings.$EnumSwitchMapping$1[variable.ordinal()]) {
            case 1:
                if (r23 == null || (product = r23.getProduct()) == null || (price = product.getPrice()) == null) {
                    return null;
                }
                return price.getCurrencyCode();
            case 2:
                if (r23 != null) {
                    return Currency.getInstance(r23.getProduct().getPrice().getCurrencyCode()).getSymbol(locale);
                }
                return null;
            case 3:
                if (r23 != null) {
                    return PackagePeriodExtensionsKt.productPeriodly(r23, map);
                }
                return null;
            case 4:
                if (r23 == null || variableDataProvider == null) {
                    return null;
                }
                return variableDataProvider.localizedPrice(r23, locale, packageContext != null ? packageContext.getShowZeroDecimalPlacePrices() : false);
            case 5:
                if (r23 != null && variableDataProvider != null) {
                    String strLocalizedPrice = variableDataProvider.localizedPrice(r23, locale, packageContext != null ? packageContext.getShowZeroDecimalPlacePrices() : false);
                    if (strLocalizedPrice != null) {
                        String strProductPeriod = PackagePeriodExtensionsKt.productPeriod(r23, map);
                        if (PackagePeriodExtensionsKt.isLifetime(r23)) {
                            return strLocalizedPrice;
                        }
                        if (strProductPeriod != null) {
                            return strLocalizedPrice + '/' + strProductPeriod;
                        }
                    }
                }
                return null;
            case 6:
                if (r23 != null && variableDataProvider != null) {
                    String strLocalizedPrice2 = variableDataProvider.localizedPrice(r23, locale, packageContext != null ? packageContext.getShowZeroDecimalPlacePrices() : false);
                    if (strLocalizedPrice2 != null) {
                        String strProductPeriodAbbreviated = PackagePeriodExtensionsKt.productPeriodAbbreviated(r23, map);
                        if (PackagePeriodExtensionsKt.isLifetime(r23)) {
                            return strLocalizedPrice2;
                        }
                        if (strProductPeriodAbbreviated != null) {
                            return strLocalizedPrice2 + '/' + strProductPeriodAbbreviated;
                        }
                    }
                }
                return null;
            case 7:
                if (r23 != null) {
                    boolean showZeroDecimalPlacePrices = packageContext != null ? packageContext.getShowZeroDecimalPlacePrices() : false;
                    if (PackagePeriodExtensionsKt.isLifetime(r23)) {
                        if (variableDataProvider != null) {
                            return variableDataProvider.localizedPrice(r23, locale, showZeroDecimalPlacePrices);
                        }
                        return null;
                    }
                    if (variableDataProvider != null) {
                        return variableDataProvider.localizedPricePerDay(r23, locale, showZeroDecimalPlacePrices);
                    }
                }
                return null;
            case 8:
                if (r23 != null) {
                    boolean showZeroDecimalPlacePrices2 = packageContext != null ? packageContext.getShowZeroDecimalPlacePrices() : false;
                    if (PackagePeriodExtensionsKt.isLifetime(r23)) {
                        if (variableDataProvider != null) {
                            return variableDataProvider.localizedPrice(r23, locale, showZeroDecimalPlacePrices2);
                        }
                        return null;
                    }
                    if (variableDataProvider != null) {
                        return variableDataProvider.localizedPricePerWeek(r23, locale, showZeroDecimalPlacePrices2);
                    }
                }
                return null;
            case 9:
                if (r23 != null) {
                    boolean showZeroDecimalPlacePrices3 = packageContext != null ? packageContext.getShowZeroDecimalPlacePrices() : false;
                    if (PackagePeriodExtensionsKt.isLifetime(r23)) {
                        if (variableDataProvider != null) {
                            return variableDataProvider.localizedPrice(r23, locale, showZeroDecimalPlacePrices3);
                        }
                        return null;
                    }
                    if (variableDataProvider != null) {
                        return variableDataProvider.localizedPricePerMonth(r23, locale, showZeroDecimalPlacePrices3);
                    }
                }
                return null;
            case 10:
                if (r23 != null) {
                    boolean showZeroDecimalPlacePrices4 = packageContext != null ? packageContext.getShowZeroDecimalPlacePrices() : false;
                    if (PackagePeriodExtensionsKt.isLifetime(r23)) {
                        if (variableDataProvider != null) {
                            return variableDataProvider.localizedPrice(r23, locale, showZeroDecimalPlacePrices4);
                        }
                        return null;
                    }
                    if (variableDataProvider != null) {
                        return variableDataProvider.localizedPricePerYear(r23, locale, showZeroDecimalPlacePrices4);
                    }
                }
                return null;
            case 11:
                if (r23 != null) {
                    return PackagePeriodExtensionsKt.productPeriod(r23, map);
                }
                return null;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                if (r23 != null) {
                    return PackagePeriodExtensionsKt.productPeriodAbbreviated(r23, map);
                }
                return null;
            case 13:
                if (r23 == null || (product2 = r23.getProduct()) == null || (period = product2.getPeriod()) == null) {
                    return null;
                }
                return PeriodExtensionsKt.getRoundedValueInDays(period);
            case 14:
                if (r23 == null || (product3 = r23.getProduct()) == null || (period2 = product3.getPeriod()) == null) {
                    return null;
                }
                return PeriodExtensionsKt.getRoundedValueInWeeks(period2);
            case 15:
                if (r23 == null || (product4 = r23.getProduct()) == null || (period3 = product4.getPeriod()) == null) {
                    return null;
                }
                return PeriodExtensionsKt.getRoundedValueInMonths(period3);
            case 16:
                if (r23 == null || (product5 = r23.getProduct()) == null || (period4 = product5.getPeriod()) == null) {
                    return null;
                }
                return PeriodExtensionsKt.getRoundedValueInYears(period4);
            case 17:
                if (r23 != null) {
                    return PackagePeriodExtensionsKt.productPeriodWithUnit(r23, map);
                }
                return null;
            case 18:
                return PricingPhaseExtensionsKt.resolveOfferPrice(PricingPhaseExtensionsKt.primaryDiscountPhase(subscriptionOption, r23), locale, map, new AnonymousClass9(r23, packageContext, variableDataProvider, locale));
            case 19:
                PricingPhase pricingPhasePrimaryDiscountPhase = PricingPhaseExtensionsKt.primaryDiscountPhase(subscriptionOption, r23);
                if (pricingPhasePrimaryDiscountPhase != null && (strProductOfferPricePerDay = PricingPhaseExtensionsKt.productOfferPricePerDay(pricingPhasePrimaryDiscountPhase, locale, map)) != null) {
                    return strProductOfferPricePerDay;
                }
                if (r23 != null) {
                    boolean showZeroDecimalPlacePrices5 = packageContext != null ? packageContext.getShowZeroDecimalPlacePrices() : false;
                    if (variableDataProvider != null) {
                        return variableDataProvider.localizedPricePerDay(r23, locale, showZeroDecimalPlacePrices5);
                    }
                }
                return null;
            case 20:
                PricingPhase pricingPhasePrimaryDiscountPhase2 = PricingPhaseExtensionsKt.primaryDiscountPhase(subscriptionOption, r23);
                if (pricingPhasePrimaryDiscountPhase2 != null && (strProductOfferPricePerWeek = PricingPhaseExtensionsKt.productOfferPricePerWeek(pricingPhasePrimaryDiscountPhase2, locale, map)) != null) {
                    return strProductOfferPricePerWeek;
                }
                if (r23 != null) {
                    boolean showZeroDecimalPlacePrices6 = packageContext != null ? packageContext.getShowZeroDecimalPlacePrices() : false;
                    if (variableDataProvider != null) {
                        return variableDataProvider.localizedPricePerWeek(r23, locale, showZeroDecimalPlacePrices6);
                    }
                }
                return null;
            case 21:
                PricingPhase pricingPhasePrimaryDiscountPhase3 = PricingPhaseExtensionsKt.primaryDiscountPhase(subscriptionOption, r23);
                if (pricingPhasePrimaryDiscountPhase3 != null && (strProductOfferPricePerMonth = PricingPhaseExtensionsKt.productOfferPricePerMonth(pricingPhasePrimaryDiscountPhase3, locale, map)) != null) {
                    return strProductOfferPricePerMonth;
                }
                if (r23 != null) {
                    boolean showZeroDecimalPlacePrices7 = packageContext != null ? packageContext.getShowZeroDecimalPlacePrices() : false;
                    if (variableDataProvider != null) {
                        return variableDataProvider.localizedPricePerMonth(r23, locale, showZeroDecimalPlacePrices7);
                    }
                }
                return null;
            case 22:
                PricingPhase pricingPhasePrimaryDiscountPhase4 = PricingPhaseExtensionsKt.primaryDiscountPhase(subscriptionOption, r23);
                if (pricingPhasePrimaryDiscountPhase4 != null && (strProductOfferPricePerYear = PricingPhaseExtensionsKt.productOfferPricePerYear(pricingPhasePrimaryDiscountPhase4, locale, map)) != null) {
                    return strProductOfferPricePerYear;
                }
                if (r23 != null) {
                    boolean showZeroDecimalPlacePrices8 = packageContext != null ? packageContext.getShowZeroDecimalPlacePrices() : false;
                    if (variableDataProvider != null) {
                        return variableDataProvider.localizedPricePerYear(r23, locale, showZeroDecimalPlacePrices8);
                    }
                }
                return null;
            case 23:
                return PricingPhaseExtensionsKt.resolveOfferPeriod(PricingPhaseExtensionsKt.primaryDiscountPhase(subscriptionOption, r23), new AnonymousClass14(map), new AnonymousClass15(r23, map));
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                return PricingPhaseExtensionsKt.resolveOfferPeriod(PricingPhaseExtensionsKt.primaryDiscountPhase(subscriptionOption, r23), new AnonymousClass16(map), new AnonymousClass17(r23, map));
            case 25:
                PricingPhase pricingPhasePrimaryDiscountPhase5 = PricingPhaseExtensionsKt.primaryDiscountPhase(subscriptionOption, r23);
                if (pricingPhasePrimaryDiscountPhase5 != null && (productOfferPeriodInDays = PricingPhaseExtensionsKt.getProductOfferPeriodInDays(pricingPhasePrimaryDiscountPhase5)) != null) {
                    return productOfferPeriodInDays;
                }
                if (r23 == null || (product6 = r23.getProduct()) == null || (period5 = product6.getPeriod()) == null) {
                    return null;
                }
                return PeriodExtensionsKt.getRoundedValueInDays(period5);
            case 26:
                PricingPhase pricingPhasePrimaryDiscountPhase6 = PricingPhaseExtensionsKt.primaryDiscountPhase(subscriptionOption, r23);
                if (pricingPhasePrimaryDiscountPhase6 != null && (productOfferPeriodInWeeks = PricingPhaseExtensionsKt.getProductOfferPeriodInWeeks(pricingPhasePrimaryDiscountPhase6)) != null) {
                    return productOfferPeriodInWeeks;
                }
                if (r23 == null || (product7 = r23.getProduct()) == null || (period6 = product7.getPeriod()) == null) {
                    return null;
                }
                return PeriodExtensionsKt.getRoundedValueInWeeks(period6);
            case 27:
                PricingPhase pricingPhasePrimaryDiscountPhase7 = PricingPhaseExtensionsKt.primaryDiscountPhase(subscriptionOption, r23);
                if (pricingPhasePrimaryDiscountPhase7 != null && (productOfferPeriodInMonths = PricingPhaseExtensionsKt.getProductOfferPeriodInMonths(pricingPhasePrimaryDiscountPhase7)) != null) {
                    return productOfferPeriodInMonths;
                }
                if (r23 == null || (product8 = r23.getProduct()) == null || (period7 = product8.getPeriod()) == null) {
                    return null;
                }
                return PeriodExtensionsKt.getRoundedValueInMonths(period7);
            case 28:
                PricingPhase pricingPhasePrimaryDiscountPhase8 = PricingPhaseExtensionsKt.primaryDiscountPhase(subscriptionOption, r23);
                if (pricingPhasePrimaryDiscountPhase8 != null && (productOfferPeriodInYears = PricingPhaseExtensionsKt.getProductOfferPeriodInYears(pricingPhasePrimaryDiscountPhase8)) != null) {
                    return productOfferPeriodInYears;
                }
                if (r23 == null || (product9 = r23.getProduct()) == null || (period8 = product9.getPeriod()) == null) {
                    return null;
                }
                return PeriodExtensionsKt.getRoundedValueInYears(period8);
            case 29:
                PricingPhase pricingPhasePrimaryDiscountPhase9 = PricingPhaseExtensionsKt.primaryDiscountPhase(subscriptionOption, r23);
                if (pricingPhasePrimaryDiscountPhase9 != null && (strProductOfferPeriodWithUnit = PricingPhaseExtensionsKt.productOfferPeriodWithUnit(pricingPhasePrimaryDiscountPhase9, map)) != null) {
                    return strProductOfferPeriodWithUnit;
                }
                if (r23 != null) {
                    return PackagePeriodExtensionsKt.productPeriodWithUnit(r23, map);
                }
                return null;
            case 30:
                PricingPhase pricingPhasePrimaryDiscountPhase10 = PricingPhaseExtensionsKt.primaryDiscountPhase(subscriptionOption, r23);
                if (pricingPhasePrimaryDiscountPhase10 != null) {
                    return PricingPhaseExtensionsKt.productOfferEndDate(pricingPhasePrimaryDiscountPhase10, locale2, date);
                }
                return null;
            case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                return PricingPhaseExtensionsKt.resolveOfferPrice(PricingPhaseExtensionsKt.secondaryDiscountPhase(subscriptionOption, r23), locale, map, new AnonymousClass18(r23, packageContext, variableDataProvider, locale));
            case 32:
                return PricingPhaseExtensionsKt.resolveOfferPeriod(PricingPhaseExtensionsKt.secondaryDiscountPhase(subscriptionOption, r23), new AnonymousClass19(map), new AnonymousClass20(r23, map));
            case 33:
                return PricingPhaseExtensionsKt.resolveOfferPeriod(PricingPhaseExtensionsKt.secondaryDiscountPhase(subscriptionOption, r23), new AnonymousClass21(map), new AnonymousClass22(r23, map));
            case 34:
                if (packageContext != null) {
                    return relativeDiscount(packageContext, map);
                }
                return null;
            case 35:
                if (r23 == null || (product10 = r23.getProduct()) == null) {
                    return null;
                }
                return product10.getName();
            case 36:
                if (countdownTime == null) {
                    return "";
                }
                int i10 = WhenMappings.$EnumSwitchMapping$0[countFrom.ordinal()];
                if (i10 == 1) {
                    days2 = countdownTime.getDays();
                } else if (i10 != 2 && i10 != 3) {
                    throw new Td.r();
                }
                U u10 = U.f52264a;
                String str = String.format(locale2, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(days2)}, 1));
                AbstractC5504s.g(str, "format(...)");
                return str;
            case 37:
                if (countdownTime == null) {
                    return "";
                }
                int i11 = WhenMappings.$EnumSwitchMapping$0[countFrom.ordinal()];
                if (i11 == 1) {
                    days = countdownTime.getDays();
                } else if (i11 != 2 && i11 != 3) {
                    throw new Td.r();
                }
                U u11 = U.f52264a;
                String str2 = String.format(locale2, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(days)}, 1));
                AbstractC5504s.g(str2, "format(...)");
                return str2;
            case 38:
                if (countdownTime == null) {
                    return "";
                }
                int i12 = WhenMappings.$EnumSwitchMapping$0[countFrom.ordinal()];
                if (i12 == 1) {
                    hours2 = countdownTime.getHours();
                } else if (i12 == 2) {
                    hours2 = countdownTime.getTotalHours();
                } else if (i12 != 3) {
                    throw new Td.r();
                }
                U u12 = U.f52264a;
                String str3 = String.format(locale2, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(hours2)}, 1));
                AbstractC5504s.g(str3, "format(...)");
                return str3;
            case 39:
                if (countdownTime == null) {
                    return "";
                }
                int i13 = WhenMappings.$EnumSwitchMapping$0[countFrom.ordinal()];
                if (i13 == 1) {
                    hours = countdownTime.getHours();
                } else if (i13 == 2) {
                    hours = countdownTime.getTotalHours();
                } else if (i13 != 3) {
                    throw new Td.r();
                }
                U u13 = U.f52264a;
                String str4 = String.format(locale2, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(hours)}, 1));
                AbstractC5504s.g(str4, "format(...)");
                return str4;
            case 40:
                if (countdownTime == null) {
                    return "";
                }
                int i14 = WhenMappings.$EnumSwitchMapping$0[countFrom.ordinal()];
                if (i14 == 1 || i14 == 2) {
                    minutes = countdownTime.getMinutes();
                } else {
                    if (i14 != 3) {
                        throw new Td.r();
                    }
                    minutes = countdownTime.getTotalMinutes();
                }
                U u14 = U.f52264a;
                String str5 = String.format(locale2, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(minutes)}, 1));
                AbstractC5504s.g(str5, "format(...)");
                return str5;
            case 41:
                if (countdownTime == null) {
                    return "";
                }
                int i15 = WhenMappings.$EnumSwitchMapping$0[countFrom.ordinal()];
                if (i15 == 1 || i15 == 2) {
                    minutes2 = countdownTime.getMinutes();
                } else {
                    if (i15 != 3) {
                        throw new Td.r();
                    }
                    minutes2 = countdownTime.getTotalMinutes();
                }
                U u15 = U.f52264a;
                String str6 = String.format(locale2, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(minutes2)}, 1));
                AbstractC5504s.g(str6, "format(...)");
                return str6;
            case 42:
                if (countdownTime == null) {
                    return "";
                }
                int seconds = countdownTime.getSeconds();
                U u16 = U.f52264a;
                String str7 = String.format(locale2, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(seconds)}, 1));
                AbstractC5504s.g(str7, "format(...)");
                return str7;
            case 43:
                if (countdownTime == null) {
                    return "";
                }
                int seconds2 = countdownTime.getSeconds();
                U u17 = U.f52264a;
                String str8 = String.format(locale2, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(seconds2)}, 1));
                AbstractC5504s.g(str8, "format(...)");
                return str8;
            default:
                throw new Td.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getVariableValue(String variableIdentifier, List<String> functionIdentifiers, Map<VariableLocalizationKey, String> localizedVariableKeys, UiConfig.VariableConfig variableConfig, VariableDataProvider variableDataProvider, VariableProcessor.PackageContext packageContext, Package rcPackage, SubscriptionOption subscriptionOption, Locale currencyLocale, Locale dateLocale, Date date, CountdownTime countdownTime, CountdownComponent.CountFrom countFrom, Map<String, ? extends CustomVariableValue> customVariables, Map<String, ? extends CustomVariableValue> defaultCustomVariables) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = functionIdentifiers.iterator();
        while (it.hasNext()) {
            Function functionFindFunction = INSTANCE.findFunction((String) it.next(), variableConfig.getFunctionCompatibilityMap());
            if (functionFindFunction != null) {
                arrayList.add(functionFindFunction);
            }
        }
        String strExtractCustomVariableKey = extractCustomVariableKey(variableIdentifier);
        if (strExtractCustomVariableKey != null) {
            return resolveCustomVariable(strExtractCustomVariableKey, customVariables, defaultCustomVariables, arrayList, currencyLocale);
        }
        Variable variableFindVariable = findVariable(variableIdentifier, variableConfig.getVariableCompatibilityMap());
        if (variableFindVariable == null) {
            return "";
        }
        String value = getValue(variableFindVariable, localizedVariableKeys, variableDataProvider, packageContext, rcPackage, subscriptionOption, currencyLocale, dateLocale, date, countdownTime, countFrom);
        if (value != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                value = INSTANCE.processFunction(value, (Function) it2.next(), currencyLocale);
            }
        } else {
            value = null;
        }
        if (value != null) {
            return value;
        }
        if (rcPackage != null) {
            failedToGetValue(Logger.INSTANCE, variableIdentifier, rcPackage);
        }
        return "";
    }

    private final String processFunction(String str, Function function, Locale locale) {
        int i10 = WhenMappings.$EnumSwitchMapping$2[function.ordinal()];
        if (i10 == 1) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            AbstractC5504s.g(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }
        if (i10 == 2) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            AbstractC5504s.g(upperCase, "toUpperCase(...)");
            return upperCase;
        }
        if (i10 != 3) {
            throw new Td.r();
        }
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb2.append((Object) (Character.isLowerCase(cCharAt) ? AbstractC1268a.d(cCharAt, locale) : String.valueOf(cCharAt)));
        String strSubstring = str.substring(1);
        AbstractC5504s.g(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String processVariables$default(VariableProcessorV2 variableProcessorV2, String str, Map map, UiConfig.VariableConfig variableConfig, VariableDataProvider variableDataProvider, VariableProcessor.PackageContext packageContext, Package r23, SubscriptionOption subscriptionOption, Locale locale, Locale locale2, Date date, CountdownTime countdownTime, CountdownComponent.CountFrom countFrom, Map map2, Map map3, int i10, Object obj) {
        Locale locale3;
        Map mapI = (i10 & 2) != 0 ? S.i() : map;
        VariableDataProvider variableDataProvider2 = (i10 & 8) != 0 ? null : variableDataProvider;
        VariableProcessor.PackageContext packageContext2 = (i10 & 16) != 0 ? null : packageContext;
        Package r82 = (i10 & 32) != 0 ? null : r23;
        SubscriptionOption subscriptionOption2 = (i10 & 64) != 0 ? null : subscriptionOption;
        if ((i10 & 128) != 0) {
            Locale locale4 = Locale.getDefault();
            AbstractC5504s.g(locale4, "getDefault()");
            locale3 = locale4;
        } else {
            locale3 = locale;
        }
        return variableProcessorV2.processVariables(str, mapI, variableConfig, variableDataProvider2, packageContext2, r82, subscriptionOption2, locale3, locale2, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Date() : date, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : countdownTime, (i10 & 2048) != 0 ? CountdownComponent.CountFrom.DAYS : countFrom, (i10 & 4096) != 0 ? S.i() : map2, (i10 & 8192) != 0 ? S.i() : map3);
    }

    private final String relativeDiscount(VariableProcessor.PackageContext packageContext, Map<VariableLocalizationKey, String> map) {
        Double discountRelativeToMostExpensivePerMonth = packageContext.getDiscountRelativeToMostExpensivePerMonth();
        if (discountRelativeToMostExpensivePerMonth != null) {
            int iC = AbstractC5466a.c(discountRelativeToMostExpensivePerMonth.doubleValue() * ((double) PERCENT_SCALE));
            String stringOrLogError = PackagePeriodExtensionsKt.getStringOrLogError(map, VariableLocalizationKey.PERCENT);
            if (stringOrLogError != null) {
                String str = String.format(stringOrLogError, Arrays.copyOf(new Object[]{Integer.valueOf(iC)}, 1));
                AbstractC5504s.g(str, "format(...)");
                return str;
            }
        }
        return null;
    }

    private final String replaceVariablesWithValues(String str, Function2 function2) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (InterfaceC1279l interfaceC1279l : p.e(regex, str, 0, 2, null)) {
            sb2.append((CharSequence) str, i10, interfaceC1279l.c().f());
            List listN0 = r.N0((String) interfaceC1279l.a().a().b().get(1), new String[]{f.f34696c}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(listN0, 10));
            Iterator it = listN0.iterator();
            while (it.hasNext()) {
                arrayList.add(r.k1((String) it.next()).toString());
            }
            sb2.append((String) function2.invoke((String) arrayList.get(0), arrayList.size() > 1 ? AbstractC2279u.g0(arrayList, 1) : AbstractC2279u.m()));
            i10 = interfaceC1279l.c().i() + 1;
        }
        sb2.append((CharSequence) str, i10, str.length());
        String string = sb2.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }

    private final String resolveCustomVariable(String key, Map<String, ? extends CustomVariableValue> customVariables, Map<String, ? extends CustomVariableValue> defaultCustomVariables, List<? extends Function> functions, Locale currencyLocale) {
        CustomVariableValue customVariableValue = customVariables.get(key);
        if (customVariableValue != null || (customVariableValue = defaultCustomVariables.get(key)) != null) {
            String stringValue = customVariableValue.getStringValue();
            Iterator<T> it = functions.iterator();
            while (it.hasNext()) {
                stringValue = INSTANCE.processFunction(stringValue, (Function) it.next(), currencyLocale);
            }
            return stringValue;
        }
        Logger.INSTANCE.w("Custom variable '" + key + "' was not provided and has no default value. Defaulting to empty string.");
        return "";
    }

    private final void unsupportedFunctionWithoutFallback(Logger logger, String str) {
        logger.e("Paywall function '" + str + "' is not supported and no backwards compatible replacement found.");
    }

    private final void unsupportedVariableWithoutFallback(Logger logger, String str) {
        logger.e("Paywall variable '" + str + "' is not supported and no backwards compatible replacement found.");
    }

    private final void usingFallbackFunction(Logger logger, String str, String str2) {
        logger.w("Paywall function '" + str + "' is not supported. Using backward compatible '" + str2 + "' instead.");
    }

    private final void usingFallbackVariable(Logger logger, String str, String str2) {
        logger.w("Paywall variable '" + str + "' is not supported. Using backwards compatible '" + str2 + "' instead.");
    }

    public final String processVariables(String template, Map<VariableLocalizationKey, String> localizedVariableKeys, UiConfig.VariableConfig variableConfig, VariableDataProvider variableDataProvider, VariableProcessor.PackageContext packageContext, Package rcPackage, SubscriptionOption subscriptionOption, Locale currencyLocale, Locale dateLocale, Date date, CountdownTime countdownTime, CountdownComponent.CountFrom countFrom, Map<String, ? extends CustomVariableValue> customVariables, Map<String, ? extends CustomVariableValue> defaultCustomVariables) {
        AbstractC5504s.h(template, "template");
        AbstractC5504s.h(localizedVariableKeys, "localizedVariableKeys");
        AbstractC5504s.h(variableConfig, "variableConfig");
        AbstractC5504s.h(currencyLocale, "currencyLocale");
        AbstractC5504s.h(dateLocale, "dateLocale");
        AbstractC5504s.h(date, "date");
        AbstractC5504s.h(countFrom, "countFrom");
        AbstractC5504s.h(customVariables, "customVariables");
        AbstractC5504s.h(defaultCustomVariables, "defaultCustomVariables");
        return replaceVariablesWithValues(template, new AnonymousClass1(localizedVariableKeys, variableConfig, variableDataProvider, packageContext, rcPackage, subscriptionOption, currencyLocale, dateLocale, date, countdownTime, countFrom, customVariables, defaultCustomVariables));
    }
}
