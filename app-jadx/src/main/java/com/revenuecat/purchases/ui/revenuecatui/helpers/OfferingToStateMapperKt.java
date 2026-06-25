package com.revenuecat.purchases.ui.revenuecatui.helpers;

import Td.r;
import Td.u;
import Td.v;
import U.C2175l;
import Ud.AbstractC2279u;
import Ud.S;
import Ud.a0;
import app.notifee.core.event.LogEvent;
import com.amazon.a.a.o.b.f;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.paywalls.components.PaywallComponent;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.StickyFooterComponent;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.paywalls.components.common.LocalizationData;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.PaywallComponentsConfig;
import com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData;
import com.revenuecat.purchases.paywalls.components.common.VariableLocalizationKey;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.LocalizationKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconName;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.PackageConfigurationType;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.PaywallTemplate;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfigurationFactory;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableDataProvider;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessor;
import com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PaywallDataExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallValidationResult;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\n\u001a\u00020\t*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u000e\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a1\u0010\u000e\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0002¢\u0006\u0004\b\u000e\u0010\u0012\u001a/\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0018\u00010\u0013*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u0019\u001a7\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001b\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u001b2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0015\u0010\n\u001a\u0004\u0018\u00010\f*\u00020\u001fH\u0002¢\u0006\u0004\b\n\u0010 \u001aQ\u0010.\u001a\u00020-*\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u00182\u0006\u0010(\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+H\u0000¢\u0006\u0004\b.\u0010/\u001ag\u0010;\u001a\u00020:*\u00020\u00002\u0006\u00100\u001a\u00020\u00142\b\u0010*\u001a\u0004\u0018\u00010)2\f\u00103\u001a\b\u0012\u0004\u0012\u000202012\u0006\u00105\u001a\u0002042\u0014\b\u0002\u00108\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u000207062\u0014\b\u0002\u00109\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020706H\u0000¢\u0006\u0004\b;\u0010<\u001a\u0015\u0010>\u001a\u0004\u0018\u00010=*\u00020\u001fH\u0002¢\u0006\u0004\b>\u0010?\u001a\u0015\u0010A\u001a\u0004\u0018\u00010@*\u00020\u001fH\u0002¢\u0006\u0004\bA\u0010B\u001a\u0015\u0010C\u001a\u0004\u0018\u00010\u0018*\u00020\bH\u0002¢\u0006\u0004\bC\u0010D\u001a\u0013\u0010F\u001a\u00020'*\u00020EH\u0000¢\u0006\u0004\bF\u0010G\u001a\u0013\u0010F\u001a\u00020'*\u00020HH\u0000¢\u0006\u0004\bF\u0010I\u001a\u0013\u0010F\u001a\u00020'*\u00020JH\u0000¢\u0006\u0004\bF\u0010K\u001a\u001d\u0010N\u001a\u00020'*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030M0LH\u0000¢\u0006\u0004\bN\u0010O\"&\u0010U\u001a\u0010\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020R\u0018\u000106*\u00020P8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010T\"&\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020)\u0018\u000106*\u00020V8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006["}, d2 = {"Lcom/revenuecat/purchases/Offering;", "LU/l;", "currentColorScheme", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;", "resourceProvider", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallValidationResult;", "validatedPaywall", "(Lcom/revenuecat/purchases/Offering;LU/l;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallValidationResult;", "Lcom/revenuecat/purchases/paywalls/PaywallData;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallValidationResult$Legacy;", "validate", "(Lcom/revenuecat/purchases/paywalls/PaywallData;LU/l;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallValidationResult$Legacy;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", LogEvent.LEVEL_ERROR, "fallbackPaywall", "(Lcom/revenuecat/purchases/Offering;LU/l;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallValidationResult$Legacy;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "errors", "(Lcom/revenuecat/purchases/Offering;LU/l;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallValidationResult$Legacy;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallValidationResult$Components;", "validatePaywallComponentsDataOrNull", "(Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "LTd/u;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PaywallTemplate;", "(Lcom/revenuecat/purchases/paywalls/PaywallData;)Ljava/lang/Object;", "T", "", "set", "getMissingElements", "(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "(Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;)Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;", "variableDataProvider", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;", "mode", "validatedPaywallData", "template", "", "shouldDisplayDismissButton", "", "storefrontCountryCode", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;", "validationWarning", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState;", "toLegacyPaywallState", "(Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;Lcom/revenuecat/purchases/paywalls/PaywallData;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PaywallTemplate;ZLjava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;)Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState;", "validationResult", "Lkotlin/Function0;", "Ljava/util/Date;", "dateProvider", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;", "purchases", "", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "customVariables", "defaultCustomVariables", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;", "toComponentsPaywallState", "(Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallValidationResult$Components;Ljava/lang/String;Lie/a;Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;Ljava/util/Map;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$InvalidVariables;", "validateVariables", "(Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;)Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$InvalidVariables;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$InvalidIcons;", "validateIcons", "(Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;)Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$InvalidIcons;", "validateTemplate", "(Lcom/revenuecat/purchases/paywalls/PaywallData;)Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PaywallTemplate;", "Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsConfig;", "containsUnsupportedCondition", "(Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsConfig;)Z", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "(Lcom/revenuecat/purchases/paywalls/components/StackComponent;)Z", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "(Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;)Z", "", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "hasUnsupportedCondition", "(Ljava/util/List;)Z", "Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "getDefaultLocalization", "(Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;)Ljava/util/Map;", "defaultLocalization", "Lcom/revenuecat/purchases/Offering$PaywallComponents;", "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;", "getDefaultVariableLocalization", "(Lcom/revenuecat/purchases/Offering$PaywallComponents;)Ljava/util/Map;", "defaultVariableLocalization", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class OfferingToStateMapperKt {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PackageConfigurationType.values().length];
            try {
                iArr[PackageConfigurationType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PackageConfigurationType.MULTIPLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PackageConfigurationType.MULTITIER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ boolean containsUnsupportedCondition(PaywallComponentsConfig paywallComponentsConfig) {
        StickyFooterComponent stickyFooter;
        StackComponent stack;
        AbstractC5504s.h(paywallComponentsConfig, "<this>");
        return containsUnsupportedCondition(paywallComponentsConfig.getStack()) || !((stickyFooter = paywallComponentsConfig.getStickyFooter()) == null || (stack = stickyFooter.getStack()) == null || !containsUnsupportedCondition(stack));
    }

    public static final /* synthetic */ PaywallValidationResult.Legacy fallbackPaywall(Offering offering, C2175l currentColorScheme, ResourceProvider resourceProvider, PaywallValidationError error) {
        AbstractC5504s.h(offering, "<this>");
        AbstractC5504s.h(currentColorScheme, "currentColorScheme");
        AbstractC5504s.h(resourceProvider, "resourceProvider");
        AbstractC5504s.h(error, "error");
        return fallbackPaywall(offering, currentColorScheme, resourceProvider, (NonEmptyList<? extends PaywallValidationError>) NonEmptyListKt.nonEmptyListOf(error, new PaywallValidationError[0]));
    }

    private static final Map<LocalizationKey, LocalizationData> getDefaultLocalization(PaywallComponentsData paywallComponentsData) {
        return (Map) LocalizationKt.m420getBestMatch64pKzr8(paywallComponentsData.getComponentsLocalizations(), paywallComponentsData.getDefaultLocaleIdentifier());
    }

    private static final Map<VariableLocalizationKey, String> getDefaultVariableLocalization(Offering.PaywallComponents paywallComponents) {
        return (Map) LocalizationKt.m420getBestMatch64pKzr8(paywallComponents.getUiConfig().getLocalizations(), paywallComponents.getData().getDefaultLocaleIdentifier());
    }

    private static final <T> Set<T> getMissingElements(Set<? extends T> set, Set<? extends T> set2) {
        if (set2 == null) {
            set2 = a0.d();
        }
        Set<T> setJ = a0.j(set, AbstractC2279u.f1(set2));
        if (setJ.isEmpty()) {
            return null;
        }
        return setJ;
    }

    public static final /* synthetic */ boolean hasUnsupportedCondition(List list) {
        AbstractC5504s.h(list, "<this>");
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List conditions = ((ComponentOverride) it.next()).getConditions();
            if (conditions == null || !conditions.isEmpty()) {
                Iterator it2 = conditions.iterator();
                while (it2.hasNext()) {
                    if (((ComponentOverride.Condition) it2.next()) instanceof ComponentOverride.Condition.Unsupported) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final PaywallState.Loaded.Components toComponentsPaywallState(Offering offering, PaywallValidationResult.Components validationResult, String str, InterfaceC5082a dateProvider, PurchasesType purchases, Map<String, ? extends CustomVariableValue> customVariables, Map<String, ? extends CustomVariableValue> defaultCustomVariables) {
        AbstractC5504s.h(offering, "<this>");
        AbstractC5504s.h(validationResult, "validationResult");
        AbstractC5504s.h(dateProvider, "dateProvider");
        AbstractC5504s.h(purchases, "purchases");
        AbstractC5504s.h(customVariables, "customVariables");
        AbstractC5504s.h(defaultCustomVariables, "defaultCustomVariables");
        return new PaywallState.Loaded.Components(validationResult.getStack(), validationResult.getStickyFooter(), validationResult.getBackground(), str != null ? true ^ validationResult.getZeroDecimalPlaceCountries().contains(str) : true, validationResult.getVariableConfig(), validationResult.getVariableDataProvider(), offering, validationResult.getLocales(), str, dateProvider, validationResult.getPackages(), customVariables, defaultCustomVariables, null, validationResult.getInitialSelectedTabIndex(), null, purchases, 40960, null);
    }

    public static /* synthetic */ PaywallState.Loaded.Components toComponentsPaywallState$default(Offering offering, PaywallValidationResult.Components components, String str, InterfaceC5082a interfaceC5082a, PurchasesType purchasesType, Map map, Map map2, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            map = S.i();
        }
        Map map3 = map;
        if ((i10 & 32) != 0) {
            map2 = S.i();
        }
        return toComponentsPaywallState(offering, components, str, interfaceC5082a, purchasesType, map3, map2);
    }

    public static final PaywallState toLegacyPaywallState(Offering offering, VariableDataProvider variableDataProvider, PaywallMode mode, PaywallData validatedPaywallData, PaywallTemplate template, boolean z10, String str, PaywallWarning paywallWarning) {
        AbstractC5504s.h(offering, "<this>");
        AbstractC5504s.h(variableDataProvider, "variableDataProvider");
        AbstractC5504s.h(mode, "mode");
        AbstractC5504s.h(validatedPaywallData, "validatedPaywallData");
        AbstractC5504s.h(template, "template");
        Object objM793createhUnOzRk = TemplateConfigurationFactory.INSTANCE.m793createhUnOzRk(variableDataProvider, mode, validatedPaywallData, offering.getAvailablePackages(), template, str);
        Throwable thE = u.e(objM793createhUnOzRk);
        if (thE == null) {
            TemplateConfiguration templateConfiguration = (TemplateConfiguration) objM793createhUnOzRk;
            return new PaywallState.Loaded.Legacy(offering, templateConfiguration, templateConfiguration.getPackages().getDefault(), z10, paywallWarning);
        }
        String message = thE.getMessage();
        if (message == null) {
            message = "Unknown error";
        }
        return new PaywallState.Error(message);
    }

    public static final PaywallValidationResult.Legacy validate(PaywallData paywallData, C2175l currentColorScheme, ResourceProvider resourceProvider) {
        AbstractC5504s.h(paywallData, "<this>");
        AbstractC5504s.h(currentColorScheme, "currentColorScheme");
        AbstractC5504s.h(resourceProvider, "resourceProvider");
        Object objValidate = validate(paywallData);
        Throwable thE = u.e(objValidate);
        if (thE == null) {
            return new PaywallValidationResult.Legacy(paywallData, (PaywallTemplate) objValidate, null, 4, null);
        }
        PaywallData.Companion companion = PaywallData.INSTANCE;
        PaywallData paywallDataCreateDefaultForIdentifiers = PaywallDataExtensionsKt.createDefaultForIdentifiers(companion, paywallData.getConfig().getPackageIds(), currentColorScheme, resourceProvider);
        PaywallTemplate defaultTemplate = PaywallDataExtensionsKt.getDefaultTemplate(companion);
        AbstractC5504s.f(thE, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError");
        return new PaywallValidationResult.Legacy(paywallDataCreateDefaultForIdentifiers, defaultTemplate, (PaywallValidationError) thE);
    }

    private static final PaywallValidationError.InvalidIcons validateIcons(PaywallData.LocalizedConfiguration localizedConfiguration) {
        List<PaywallData.LocalizedConfiguration.Feature> features = localizedConfiguration.getFeatures();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = features.iterator();
        while (it.hasNext()) {
            String strValidateIcons$validateIcon = validateIcons$validateIcon((PaywallData.LocalizedConfiguration.Feature) it.next());
            if (strValidateIcons$validateIcon != null) {
                arrayList.add(strValidateIcons$validateIcon);
            }
        }
        Set setF1 = AbstractC2279u.f1(arrayList);
        if (setF1.isEmpty()) {
            return null;
        }
        return new PaywallValidationError.InvalidIcons(setF1);
    }

    private static final String validateIcons$validateIcon(PaywallData.LocalizedConfiguration.Feature feature) {
        String iconID = feature.getIconID();
        if (iconID == null || PaywallIconName.INSTANCE.fromValue(iconID) != null) {
            return null;
        }
        return iconID;
    }

    /* JADX WARN: Removed duplicated region for block: B:385:0x04fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.revenuecat.purchases.ui.revenuecatui.helpers.Result<com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallValidationResult.Components, com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyList<com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError>> validatePaywallComponentsDataOrNull(com.revenuecat.purchases.Offering r41, com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider r42) {
        /*
            Method dump skipped, instruction units count: 1489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.helpers.OfferingToStateMapperKt.validatePaywallComponentsDataOrNull(com.revenuecat.purchases.Offering, com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider):com.revenuecat.purchases.ui.revenuecatui.helpers.Result");
    }

    private static final PaywallTemplate validateTemplate(PaywallData paywallData) {
        return PaywallTemplate.INSTANCE.fromId(paywallData.getTemplateName());
    }

    private static final PaywallValidationError.InvalidVariables validateVariables(PaywallData.LocalizedConfiguration localizedConfiguration) {
        Set setL = a0.l(a0.l(a0.l(a0.l(a0.l(a0.l(validateVariables$validateVariablesInProperty(localizedConfiguration.getTitle()), validateVariables$validateVariablesInProperty(localizedConfiguration.getSubtitle())), validateVariables$validateVariablesInProperty(localizedConfiguration.getCallToAction())), validateVariables$validateVariablesInProperty(localizedConfiguration.getCallToActionWithIntroOffer())), validateVariables$validateVariablesInProperty(localizedConfiguration.getOfferDetails())), validateVariables$validateVariablesInProperty(localizedConfiguration.getOfferDetailsWithIntroOffer())), validateVariables$validateVariablesInProperty(localizedConfiguration.getOfferName()));
        List<PaywallData.LocalizedConfiguration.Feature> features = localizedConfiguration.getFeatures();
        ArrayList arrayList = new ArrayList();
        for (PaywallData.LocalizedConfiguration.Feature feature : features) {
            AbstractC2279u.D(arrayList, a0.l(validateVariables$validateVariablesInProperty(feature.getTitle()), validateVariables$validateVariablesInProperty(feature.getContent())));
        }
        Set setL2 = a0.l(setL, arrayList);
        if (setL2.isEmpty()) {
            return null;
        }
        return new PaywallValidationError.InvalidVariables(setL2);
    }

    private static final Set<String> validateVariables$validateVariablesInProperty(String str) {
        Set<String> setValidateVariables;
        return (str == null || (setValidateVariables = VariableProcessor.INSTANCE.validateVariables(str)) == null) ? a0.d() : setValidateVariables;
    }

    public static final PaywallValidationResult validatedPaywall(Offering offering, C2175l currentColorScheme, ResourceProvider resourceProvider) {
        PaywallValidationResult paywallValidationResultFallbackPaywall;
        AbstractC5504s.h(offering, "<this>");
        AbstractC5504s.h(currentColorScheme, "currentColorScheme");
        AbstractC5504s.h(resourceProvider, "resourceProvider");
        Result<PaywallValidationResult.Components, NonEmptyList<PaywallValidationError>> resultValidatePaywallComponentsDataOrNull = validatePaywallComponentsDataOrNull(offering, resourceProvider);
        if (resultValidatePaywallComponentsDataOrNull != null) {
            if (resultValidatePaywallComponentsDataOrNull instanceof Result.Success) {
                paywallValidationResultFallbackPaywall = (PaywallValidationResult) ((Result.Success) resultValidatePaywallComponentsDataOrNull).getValue();
            } else {
                if (!(resultValidatePaywallComponentsDataOrNull instanceof Result.Error)) {
                    throw new r();
                }
                paywallValidationResultFallbackPaywall = fallbackPaywall(offering, currentColorScheme, resourceProvider, (NonEmptyList<? extends PaywallValidationError>) ((Result.Error) resultValidatePaywallComponentsDataOrNull).getValue());
            }
            if (paywallValidationResultFallbackPaywall != null) {
                return paywallValidationResultFallbackPaywall;
            }
        }
        PaywallData paywall = offering.getPaywall();
        return paywall != null ? validate(paywall, currentColorScheme, resourceProvider) : fallbackPaywall(offering, currentColorScheme, resourceProvider, PaywallValidationError.MissingPaywall.INSTANCE);
    }

    public static final /* synthetic */ boolean containsUnsupportedCondition(StackComponent stackComponent) {
        AbstractC5504s.h(stackComponent, "<this>");
        if (hasUnsupportedCondition(stackComponent.getOverrides())) {
            return true;
        }
        List components = stackComponent.getComponents();
        if (components != null && components.isEmpty()) {
            return false;
        }
        Iterator it = components.iterator();
        while (it.hasNext()) {
            if (containsUnsupportedCondition((PaywallComponent) it.next())) {
                return true;
            }
        }
        return false;
    }

    private static final PaywallValidationResult.Legacy fallbackPaywall(Offering offering, C2175l c2175l, ResourceProvider resourceProvider, NonEmptyList<? extends PaywallValidationError> nonEmptyList) {
        PaywallData.Companion companion = PaywallData.INSTANCE;
        return new PaywallValidationResult.Legacy(PaywallDataExtensionsKt.createDefault(companion, offering.getAvailablePackages(), c2175l, resourceProvider), PaywallDataExtensionsKt.getDefaultTemplate(companion), nonEmptyList);
    }

    /* JADX WARN: Removed duplicated region for block: B:298:0x011a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x01f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:407:? A[LOOP:2: B:338:0x01a5->B:407:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ boolean containsUnsupportedCondition(com.revenuecat.purchases.paywalls.components.PaywallComponent r4) {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.helpers.OfferingToStateMapperKt.containsUnsupportedCondition(com.revenuecat.purchases.paywalls.components.PaywallComponent):boolean");
    }

    private static final Object validate(PaywallData paywallData) {
        PaywallTemplate paywallTemplateValidateTemplate = validateTemplate(paywallData);
        if (paywallTemplateValidateTemplate == null) {
            u.a aVar = u.f17466b;
            return u.b(v.a(new PaywallValidationError.InvalidTemplate(paywallData.getTemplateName())));
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[paywallTemplateValidateTemplate.getConfigurationType().ordinal()];
        if (i10 == 1 || i10 == 2) {
            PaywallValidationError paywallValidationErrorValidate = validate((PaywallData.LocalizedConfiguration) paywallData.getLocalizedConfiguration().getSecond());
            if (paywallValidationErrorValidate != null) {
                u.a aVar2 = u.f17466b;
                return u.b(v.a(paywallValidationErrorValidate));
            }
        } else if (i10 == 3) {
            List<PaywallData.Configuration.Tier> tiers = paywallData.getConfig().getTiers();
            if (tiers == null) {
                tiers = AbstractC2279u.m();
            }
            if (tiers.isEmpty()) {
                u.a aVar3 = u.f17466b;
                return u.b(v.a(PaywallValidationError.MissingTiers.INSTANCE));
            }
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(tiers, 10));
            Iterator<T> it = tiers.iterator();
            while (it.hasNext()) {
                arrayList.add(((PaywallData.Configuration.Tier) it.next()).getId());
            }
            Set setF1 = AbstractC2279u.f1(arrayList);
            Map<String, PaywallData.Configuration.ColorInformation> colorsByTier = paywallData.getConfig().getColorsByTier();
            Set missingElements = getMissingElements(setF1, colorsByTier != null ? colorsByTier.keySet() : null);
            if (missingElements != null) {
                u.a aVar4 = u.f17466b;
                return u.b(v.a(new PaywallValidationError.MissingTierConfigurations(missingElements)));
            }
            Map<String, PaywallData.Configuration.Images> imagesByTier = paywallData.getConfig().getImagesByTier();
            Set missingElements2 = getMissingElements(setF1, imagesByTier != null ? imagesByTier.keySet() : null);
            if (missingElements2 != null) {
                Logger.INSTANCE.w("Missing images for tier(s): " + AbstractC2279u.w0(missingElements2, f.f34694a, null, null, 0, null, null, 62, null));
            }
            Map map = (Map) paywallData.getTieredLocalizedConfiguration().getSecond();
            Set missingElements3 = getMissingElements(setF1, map.keySet());
            if (missingElements3 != null) {
                u.a aVar5 = u.f17466b;
                return u.b(v.a(new PaywallValidationError.MissingTierConfigurations(missingElements3)));
            }
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                PaywallValidationError paywallValidationErrorValidate2 = validate((PaywallData.LocalizedConfiguration) ((Map.Entry) it2.next()).getValue());
                if (paywallValidationErrorValidate2 != null) {
                    u.a aVar6 = u.f17466b;
                    return u.b(v.a(paywallValidationErrorValidate2));
                }
            }
        }
        return u.b(paywallTemplateValidateTemplate);
    }

    private static final PaywallValidationError validate(PaywallData.LocalizedConfiguration localizedConfiguration) {
        PaywallValidationError.InvalidVariables invalidVariablesValidateVariables = validateVariables(localizedConfiguration);
        if (invalidVariablesValidateVariables != null) {
            return invalidVariablesValidateVariables;
        }
        PaywallValidationError.InvalidIcons invalidIconsValidateIcons = validateIcons(localizedConfiguration);
        if (invalidIconsValidateIcons != null) {
            return invalidIconsValidateIcons;
        }
        return null;
    }
}
