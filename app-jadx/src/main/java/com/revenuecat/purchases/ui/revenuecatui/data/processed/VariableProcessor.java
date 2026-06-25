package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import Cf.l;
import Df.InterfaceC1279l;
import Df.p;
import Df.r;
import Td.AbstractC2163n;
import Ud.AbstractC2279u;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002!\"B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ9\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ5\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u0014R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor;", "", "<init>", "()V", "", "string", "Lkotlin/Function1;", "executeAndReplaceWith", "handleVariablesAndReplace", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;", "variableDataProvider", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;", "context", "variableNameString", "Lcom/revenuecat/purchases/Package;", "rcPackage", "Ljava/util/Locale;", "locale", "variableValue", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Ljava/lang/String;Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$VariableName;", "variableName", "processVariable", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$VariableName;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;", "originalString", "", "validateVariables", "(Ljava/lang/String;)Ljava/util/Set;", "processVariables", "LDf/p;", "REGEX", "LDf/p;", "PackageContext", "VariableName", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VariableProcessor {
    public static final VariableProcessor INSTANCE = new VariableProcessor();
    private static final p REGEX = new p("\\{\\{\\s[a-zA-Z0-9_]+\\s\\}\\}");
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0082\u0001\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001aB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$VariableName;", "", "identifier", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "APP_NAME", "PRICE", "PRICE_PER_PERIOD", "PRICE_PER_PERIOD_FULL", "TOTAL_PRICE_AND_PER_MONTH", "TOTAL_PRICE_AND_PER_MONTH_FULL", "PRODUCT_NAME", "SUB_PERIOD", "SUB_PERIOD_LENGTH", "SUB_PERIOD_ABBREVIATED", "SUB_PRICE_PER_WEEK", "SUB_PRICE_PER_MONTH", "SUB_DURATION", "SUB_DURATION_IN_MONTHS", "SUB_OFFER_DURATION", "SUB_OFFER_DURATION_2", "SUB_OFFER_PRICE", "SUB_OFFER_PRICE_2", "SUB_RELATIVE_DISCOUNT", "Companion", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    enum VariableName {
        APP_NAME("app_name"),
        PRICE(b.f34666x),
        PRICE_PER_PERIOD("price_per_period"),
        PRICE_PER_PERIOD_FULL("price_per_period_full"),
        TOTAL_PRICE_AND_PER_MONTH("total_price_and_per_month"),
        TOTAL_PRICE_AND_PER_MONTH_FULL("total_price_and_per_month_full"),
        PRODUCT_NAME("product_name"),
        SUB_PERIOD("sub_period"),
        SUB_PERIOD_LENGTH("sub_period_length"),
        SUB_PERIOD_ABBREVIATED("sub_period_abbreviated"),
        SUB_PRICE_PER_WEEK("sub_price_per_week"),
        SUB_PRICE_PER_MONTH("sub_price_per_month"),
        SUB_DURATION("sub_duration"),
        SUB_DURATION_IN_MONTHS("sub_duration_in_months"),
        SUB_OFFER_DURATION("sub_offer_duration"),
        SUB_OFFER_DURATION_2("sub_offer_duration_2"),
        SUB_OFFER_PRICE("sub_offer_price"),
        SUB_OFFER_PRICE_2("sub_offer_price_2"),
        SUB_RELATIVE_DISCOUNT("sub_relative_discount");

        private final String identifier;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy valueMap$delegate = AbstractC2163n.b(VariableProcessor$VariableName$Companion$valueMap$2.INSTANCE);

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u0005R'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$VariableName$Companion;", "", "()V", "valueMap", "", "", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$VariableName;", "getValueMap", "()Ljava/util/Map;", "valueMap$delegate", "Lkotlin/Lazy;", "valueOfIdentifier", "identifier", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final Map<String, VariableName> getValueMap() {
                return (Map) VariableName.valueMap$delegate.getValue();
            }

            public final VariableName valueOfIdentifier(String identifier) {
                AbstractC5504s.h(identifier, "identifier");
                return getValueMap().get(identifier);
            }

            private Companion() {
            }
        }

        VariableName(String str) {
            this.identifier = str;
        }

        public final String getIdentifier() {
            return this.identifier;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VariableName.values().length];
            try {
                iArr[VariableName.APP_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VariableName.PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VariableName.PRICE_PER_PERIOD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VariableName.PRICE_PER_PERIOD_FULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VariableName.TOTAL_PRICE_AND_PER_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VariableName.TOTAL_PRICE_AND_PER_MONTH_FULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VariableName.PRODUCT_NAME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VariableName.SUB_PERIOD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VariableName.SUB_PERIOD_LENGTH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[VariableName.SUB_PERIOD_ABBREVIATED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[VariableName.SUB_PRICE_PER_WEEK.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[VariableName.SUB_PRICE_PER_MONTH.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[VariableName.SUB_DURATION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[VariableName.SUB_DURATION_IN_MONTHS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[VariableName.SUB_OFFER_DURATION.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[VariableName.SUB_OFFER_DURATION_2.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[VariableName.SUB_OFFER_PRICE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[VariableName.SUB_OFFER_PRICE_2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[VariableName.SUB_RELATIVE_DISCOUNT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessor$validateVariables$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "variable", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        final /* synthetic */ List<String> $errors;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<String> list) {
            super(1);
            this.$errors = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String variable) {
            AbstractC5504s.h(variable, "variable");
            if (VariableName.INSTANCE.valueOfIdentifier(variable) != null) {
                return null;
            }
            this.$errors.add(variable);
            return null;
        }
    }

    private VariableProcessor() {
    }

    private final String handleVariablesAndReplace(String string, Function1 executeAndReplaceWith) {
        for (InterfaceC1279l interfaceC1279l : AbstractC2279u.K0(l.T(p.e(REGEX, string, 0, 2, null)))) {
            String value = interfaceC1279l.getValue();
            String strSubstring = value.substring(2, value.length() - 2);
            AbstractC5504s.g(strSubstring, "substring(...)");
            String str = (String) executeAndReplaceWith.invoke(r.k1(strSubstring).toString());
            if (str != null) {
                string = r.H0(string, interfaceC1279l.c(), str).toString();
            }
        }
        return string;
    }

    private final String processVariable(VariableName variableName, VariableDataProvider variableDataProvider, PackageContext context, Package rcPackage, Locale locale) {
        switch (WhenMappings.$EnumSwitchMapping$0[variableName.ordinal()]) {
            case 1:
                return variableDataProvider.getApplicationName();
            case 2:
                return variableDataProvider.localizedPrice(rcPackage, locale, context.getShowZeroDecimalPlacePrices());
            case 3:
                return variableDataProvider.localizedPricePerPeriod(rcPackage, locale, context.getShowZeroDecimalPlacePrices());
            case 4:
                return variableDataProvider.localizedPricePerPeriodFull(rcPackage, locale, context.getShowZeroDecimalPlacePrices());
            case 5:
                return variableDataProvider.localizedPriceAndPerMonth(rcPackage, locale, context.getShowZeroDecimalPlacePrices());
            case 6:
                return variableDataProvider.localizedPriceAndPerMonthFull(rcPackage, locale, context.getShowZeroDecimalPlacePrices());
            case 7:
                return variableDataProvider.productName(rcPackage);
            case 8:
                return variableDataProvider.periodName(rcPackage);
            case 9:
                return variableDataProvider.periodLength(rcPackage, locale);
            case 10:
                return variableDataProvider.periodNameAbbreviation(rcPackage, locale);
            case 11:
                return variableDataProvider.localizedPricePerWeek(rcPackage, locale, context.getShowZeroDecimalPlacePrices());
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                return variableDataProvider.localizedPricePerMonth(rcPackage, locale, context.getShowZeroDecimalPlacePrices());
            case 13:
                return variableDataProvider.subscriptionDuration(rcPackage, locale);
            case 14:
                return variableDataProvider.subscriptionDurationInMonths(rcPackage, locale);
            case 15:
                return variableDataProvider.firstIntroductoryOfferDuration(rcPackage, locale);
            case 16:
                return variableDataProvider.secondIntroductoryOfferDuration(rcPackage, locale);
            case 17:
                return variableDataProvider.localizedFirstIntroductoryOfferPrice(rcPackage, locale, context.getShowZeroDecimalPlacePrices());
            case 18:
                return variableDataProvider.localizedSecondIntroductoryOfferPrice(rcPackage, locale, context.getShowZeroDecimalPlacePrices());
            case 19:
                return variableDataProvider.localizedRelativeDiscount(context.getDiscountRelativeToMostExpensivePerMonth());
            default:
                throw new Td.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String variableValue(VariableDataProvider variableDataProvider, PackageContext context, String variableNameString, Package rcPackage, Locale locale) {
        VariableName variableNameValueOfIdentifier = VariableName.INSTANCE.valueOfIdentifier(variableNameString);
        if (variableNameValueOfIdentifier == null) {
            Logger.INSTANCE.e("Unknown variable: " + variableNameString);
            return null;
        }
        String strProcessVariable = processVariable(variableNameValueOfIdentifier, variableDataProvider, context, rcPackage, locale);
        if (strProcessVariable != null) {
            return strProcessVariable;
        }
        Logger.INSTANCE.w("Could not process value for variable '" + variableNameString + "' for package '" + rcPackage.getIdentifier() + "'. Please check that the product for that package matches the requirements for that variable. Defaulting to empty string.");
        return "";
    }

    public final String processVariables(VariableDataProvider variableDataProvider, PackageContext context, String originalString, Package rcPackage, Locale locale) {
        AbstractC5504s.h(variableDataProvider, "variableDataProvider");
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(originalString, "originalString");
        AbstractC5504s.h(rcPackage, "rcPackage");
        AbstractC5504s.h(locale, "locale");
        return handleVariablesAndReplace(originalString, new VariableProcessor$processVariables$resultString$1(variableDataProvider, context, rcPackage, locale));
    }

    public final Set<String> validateVariables(String originalString) {
        AbstractC5504s.h(originalString, "originalString");
        ArrayList arrayList = new ArrayList();
        handleVariablesAndReplace(originalString, new AnonymousClass1(arrayList));
        return AbstractC2279u.f1(arrayList);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0005HÆ\u0003J$\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;", "", "discountRelativeToMostExpensivePerMonth", "", "showZeroDecimalPlacePrices", "", "(Ljava/lang/Double;Z)V", "getDiscountRelativeToMostExpensivePerMonth", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getShowZeroDecimalPlacePrices", "()Z", "component1", "component2", "copy", "(Ljava/lang/Double;Z)Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;", "equals", "other", "hashCode", "", "toString", "", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PackageContext {
        public static final int $stable = 0;
        private final Double discountRelativeToMostExpensivePerMonth;
        private final boolean showZeroDecimalPlacePrices;

        public PackageContext(Double d10, boolean z10) {
            this.discountRelativeToMostExpensivePerMonth = d10;
            this.showZeroDecimalPlacePrices = z10;
        }

        public static /* synthetic */ PackageContext copy$default(PackageContext packageContext, Double d10, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                d10 = packageContext.discountRelativeToMostExpensivePerMonth;
            }
            if ((i10 & 2) != 0) {
                z10 = packageContext.showZeroDecimalPlacePrices;
            }
            return packageContext.copy(d10, z10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Double getDiscountRelativeToMostExpensivePerMonth() {
            return this.discountRelativeToMostExpensivePerMonth;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getShowZeroDecimalPlacePrices() {
            return this.showZeroDecimalPlacePrices;
        }

        public final PackageContext copy(Double discountRelativeToMostExpensivePerMonth, boolean showZeroDecimalPlacePrices) {
            return new PackageContext(discountRelativeToMostExpensivePerMonth, showZeroDecimalPlacePrices);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PackageContext)) {
                return false;
            }
            PackageContext packageContext = (PackageContext) other;
            return AbstractC5504s.c(this.discountRelativeToMostExpensivePerMonth, packageContext.discountRelativeToMostExpensivePerMonth) && this.showZeroDecimalPlacePrices == packageContext.showZeroDecimalPlacePrices;
        }

        public final Double getDiscountRelativeToMostExpensivePerMonth() {
            return this.discountRelativeToMostExpensivePerMonth;
        }

        public final boolean getShowZeroDecimalPlacePrices() {
            return this.showZeroDecimalPlacePrices;
        }

        public int hashCode() {
            Double d10 = this.discountRelativeToMostExpensivePerMonth;
            return ((d10 == null ? 0 : d10.hashCode()) * 31) + Boolean.hashCode(this.showZeroDecimalPlacePrices);
        }

        public String toString() {
            return "PackageContext(discountRelativeToMostExpensivePerMonth=" + this.discountRelativeToMostExpensivePerMonth + ", showZeroDecimalPlacePrices=" + this.showZeroDecimalPlacePrices + ')';
        }

        public /* synthetic */ PackageContext(Double d10, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(d10, (i10 & 2) != 0 ? false : z10);
        }
    }
}
