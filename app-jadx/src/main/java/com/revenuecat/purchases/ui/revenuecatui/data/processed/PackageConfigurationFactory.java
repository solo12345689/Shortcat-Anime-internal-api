package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import Td.r;
import Td.u;
import Td.v;
import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.ProcessedLocalizedConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessor;
import com.revenuecat.purchases.ui.revenuecatui.errors.PackageConfigurationError;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J]\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010\u0016*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JY\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001c0\u000f0\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJO\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020 0\u000f0\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"JI\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00060\u000f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b&\u0010'Ja\u0010.\u001a\b\u0012\u0004\u0012\u00020%0\u00062\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010+\u001a\u00020*2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00072\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u0004\u0018\u0001002\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0002¢\u0006\u0004\b1\u00102J%\u00106\u001a\u0004\u0018\u0001052\b\u00103\u001a\u0004\u0018\u0001002\b\u00104\u001a\u0004\u0018\u000100H\u0002¢\u0006\u0004\b6\u00107Jm\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020:0\u000f0\u000e2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0006\u00109\u001a\u0002082\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b;\u0010<\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006>"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackageConfigurationFactory;", "", "<init>", "()V", "Lcom/revenuecat/purchases/paywalls/PaywallData;", "paywallData", "", "", "packageIdsInConfig", "Lcom/revenuecat/purchases/Package;", "availablePackages", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;", "variableDataProvider", "storefrontCountryCode", "LTd/u;", "Lkotlin/Pair;", "Ljava/util/Locale;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageConfiguration$MultiTier;", "makeMultiTierPackageConfiguration-yxL6bBk", "(Lcom/revenuecat/purchases/paywalls/PaywallData;Ljava/util/List;Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Ljava/lang/String;)Ljava/lang/Object;", "makeMultiTierPackageConfiguration", "K", "V", "", "filterNotNullValues", "(Ljava/util/Map;)Ljava/util/Map;", "filteredRCPackages", "default", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageConfiguration$Multiple;", "makeMultiplePackageConfiguration-yxL6bBk", "(Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/paywalls/PaywallData;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "makeMultiplePackageConfiguration", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageConfiguration$Single;", "makeSinglePackageConfiguration-BWLJW6A", "(Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/paywalls/PaywallData;Ljava/lang/String;)Ljava/lang/Object;", "makeSinglePackageConfiguration", "packages", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;", "makePackageInfo", "(Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/paywalls/PaywallData;Ljava/lang/String;)Lkotlin/Pair;", "from", "filter", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "localization", "locale", "zeroDecimalPlaceCountries", "reprocessPackagesForTiers", "(Ljava/util/List;Ljava/util/List;Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Ljava/util/Locale;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "Lcom/revenuecat/purchases/models/Price;", "mostExpensivePricePerMonth", "(Ljava/util/List;)Lcom/revenuecat/purchases/models/Price;", "pricePerMonth", "mostExpensive", "", "productDiscount", "(Lcom/revenuecat/purchases/models/Price;Lcom/revenuecat/purchases/models/Price;)Ljava/lang/Double;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackageConfigurationType;", "configurationType", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageConfiguration;", "createPackageConfiguration-bMdYcbs", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackageConfigurationType;Lcom/revenuecat/purchases/paywalls/PaywallData;Ljava/lang/String;)Ljava/lang/Object;", "createPackageConfiguration", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PackageConfigurationFactory {
    public static final int $stable = 0;
    public static final PackageConfigurationFactory INSTANCE = new PackageConfigurationFactory();

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

    private PackageConfigurationFactory() {
    }

    private final <K, V> Map<K, V> filterNotNullValues(Map<K, ? extends V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x01d4  */
    /* JADX INFO: renamed from: makeMultiTierPackageConfiguration-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m757makeMultiTierPackageConfigurationyxL6bBk(com.revenuecat.purchases.paywalls.PaywallData r16, java.util.List<java.lang.String> r17, java.util.List<com.revenuecat.purchases.Package> r18, com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableDataProvider r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.data.processed.PackageConfigurationFactory.m757makeMultiTierPackageConfigurationyxL6bBk(com.revenuecat.purchases.paywalls.PaywallData, java.util.List, java.util.List, com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableDataProvider, java.lang.String):java.lang.Object");
    }

    /* JADX INFO: renamed from: makeMultiplePackageConfiguration-yxL6bBk, reason: not valid java name */
    private final Object m758makeMultiplePackageConfigurationyxL6bBk(List<Package> filteredRCPackages, VariableDataProvider variableDataProvider, PaywallData paywallData, String str, String storefrontCountryCode) {
        Object next;
        Pair<Locale, List<TemplateConfiguration.PackageInfo>> pairMakePackageInfo = makePackageInfo(filteredRCPackages, variableDataProvider, paywallData, storefrontCountryCode);
        Locale locale = (Locale) pairMakePackageInfo.getFirst();
        List list = (List) pairMakePackageInfo.getSecond();
        TemplateConfiguration.PackageInfo packageInfo = (TemplateConfiguration.PackageInfo) AbstractC2279u.m0(list);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC5504s.c(((TemplateConfiguration.PackageInfo) next).getRcPackage().getIdentifier(), str)) {
                break;
            }
        }
        TemplateConfiguration.PackageInfo packageInfo2 = (TemplateConfiguration.PackageInfo) next;
        if (packageInfo2 == null) {
            packageInfo2 = packageInfo;
        }
        u.a aVar = u.f17466b;
        return u.b(z.a(locale, new TemplateConfiguration.PackageConfiguration.Multiple(new TemplateConfiguration.PackageConfiguration.MultiPackage(packageInfo, packageInfo2, list))));
    }

    private final Pair<Locale, List<TemplateConfiguration.PackageInfo>> makePackageInfo(List<Package> packages, VariableDataProvider variableDataProvider, PaywallData paywallData, String storefrontCountryCode) {
        Price priceMostExpensivePricePerMonth = mostExpensivePricePerMonth(packages);
        Pair<Locale, PaywallData.LocalizedConfiguration> localizedConfiguration = paywallData.getLocalizedConfiguration();
        Locale locale = (Locale) localizedConfiguration.getFirst();
        PaywallData.LocalizedConfiguration localizedConfiguration2 = (PaywallData.LocalizedConfiguration) localizedConfiguration.getSecond();
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(packages, 10));
        for (Package r72 : packages) {
            Double dProductDiscount = INSTANCE.productDiscount(StoreProduct.pricePerMonth$default(r72.getProduct(), null, 1, null), priceMostExpensivePricePerMonth);
            boolean zContains = storefrontCountryCode != null ? paywallData.getZeroDecimalPlaceCountries().contains(storefrontCountryCode) : false;
            ProcessedLocalizedConfiguration.Companion companion = ProcessedLocalizedConfiguration.INSTANCE;
            VariableProcessor.PackageContext packageContext = new VariableProcessor.PackageContext(dProductDiscount, zContains);
            VariableDataProvider variableDataProvider2 = variableDataProvider;
            arrayList.add(new TemplateConfiguration.PackageInfo(r72, companion.create(variableDataProvider2, packageContext, localizedConfiguration2, r72, locale), dProductDiscount));
            variableDataProvider = variableDataProvider2;
        }
        return z.a(locale, arrayList);
    }

    /* JADX INFO: renamed from: makeSinglePackageConfiguration-BWLJW6A, reason: not valid java name */
    private final Object m759makeSinglePackageConfigurationBWLJW6A(List<Package> filteredRCPackages, VariableDataProvider variableDataProvider, PaywallData paywallData, String storefrontCountryCode) {
        Pair<Locale, List<TemplateConfiguration.PackageInfo>> pairMakePackageInfo = makePackageInfo(filteredRCPackages, variableDataProvider, paywallData, storefrontCountryCode);
        Locale locale = (Locale) pairMakePackageInfo.getFirst();
        TemplateConfiguration.PackageInfo packageInfo = (TemplateConfiguration.PackageInfo) AbstractC2279u.m0((List) pairMakePackageInfo.getSecond());
        u.a aVar = u.f17466b;
        return u.b(z.a(locale, new TemplateConfiguration.PackageConfiguration.Single(packageInfo)));
    }

    private final Price mostExpensivePricePerMonth(List<Package> packages) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = packages.iterator();
        while (true) {
            next = null;
            if (!it.hasNext()) {
                break;
            }
            Price pricePricePerMonth$default = StoreProduct.pricePerMonth$default(((Package) it.next()).getProduct(), null, 1, null);
            if (pricePricePerMonth$default != null) {
                arrayList.add(pricePricePerMonth$default);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                long amountMicros = ((Price) next).getAmountMicros();
                do {
                    Object next2 = it2.next();
                    long amountMicros2 = ((Price) next2).getAmountMicros();
                    if (amountMicros < amountMicros2) {
                        next = next2;
                        amountMicros = amountMicros2;
                    }
                } while (it2.hasNext());
            }
        }
        return (Price) next;
    }

    private final Double productDiscount(Price pricePerMonth, Price mostExpensive) {
        if (pricePerMonth != null) {
            long amountMicros = pricePerMonth.getAmountMicros();
            if (mostExpensive != null) {
                long amountMicros2 = mostExpensive.getAmountMicros();
                if (amountMicros >= amountMicros2) {
                    return null;
                }
                return Double.valueOf((amountMicros2 - amountMicros) / amountMicros2);
            }
        }
        return null;
    }

    private final List<TemplateConfiguration.PackageInfo> reprocessPackagesForTiers(List<Package> from, List<String> filter, PaywallData.LocalizedConfiguration localization, VariableDataProvider variableDataProvider, Locale locale, String storefrontCountryCode, List<String> zeroDecimalPlaceCountries) {
        ArrayList<Package> arrayList = new ArrayList();
        Iterator<T> it = filter.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            Iterator<T> it2 = from.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (AbstractC5504s.c(((Package) next).getIdentifier(), str)) {
                    obj = next;
                    break;
                }
            }
            Package r42 = (Package) obj;
            if (r42 != null) {
                arrayList.add(r42);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add((Package) it3.next());
        }
        Price priceMostExpensivePricePerMonth = mostExpensivePricePerMonth(arrayList2);
        ArrayList arrayList3 = new ArrayList(AbstractC2279u.x(arrayList, 10));
        for (Package r10 : arrayList) {
            Double dProductDiscount = INSTANCE.productDiscount(StoreProduct.pricePerMonth$default(r10.getProduct(), null, 1, null), priceMostExpensivePricePerMonth);
            arrayList3.add(new TemplateConfiguration.PackageInfo(r10, ProcessedLocalizedConfiguration.INSTANCE.create(variableDataProvider, new VariableProcessor.PackageContext(dProductDiscount, storefrontCountryCode != null ? zeroDecimalPlaceCountries.contains(storefrontCountryCode) : false), localization, r10, locale), dProductDiscount));
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: createPackageConfiguration-bMdYcbs, reason: not valid java name */
    public final Object m760createPackageConfigurationbMdYcbs(VariableDataProvider variableDataProvider, List<Package> availablePackages, List<String> packageIdsInConfig, String str, PackageConfigurationType configurationType, PaywallData paywallData, String storefrontCountryCode) {
        AbstractC5504s.h(variableDataProvider, "variableDataProvider");
        AbstractC5504s.h(availablePackages, "availablePackages");
        AbstractC5504s.h(packageIdsInConfig, "packageIdsInConfig");
        AbstractC5504s.h(configurationType, "configurationType");
        AbstractC5504s.h(paywallData, "paywallData");
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5874j.e(S.e(AbstractC2279u.x(availablePackages, 10)), 16));
        for (Object obj : availablePackages) {
            linkedHashMap.put(((Package) obj).getIdentifier(), obj);
        }
        List<Package> arrayList = new ArrayList<>();
        for (String str2 : packageIdsInConfig) {
            Package r42 = (Package) linkedHashMap.get(str2);
            if (r42 == null) {
                Logger.INSTANCE.d("Package with id " + str2 + " not found. Ignoring.");
            }
            if (r42 != null) {
                arrayList.add(r42);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = availablePackages;
        }
        if (arrayList.isEmpty()) {
            u.a aVar = u.f17466b;
            return u.b(v.a(new PackageConfigurationError("No packages found for ids " + packageIdsInConfig)));
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[configurationType.ordinal()];
        if (i10 == 1) {
            return m759makeSinglePackageConfigurationBWLJW6A(arrayList, variableDataProvider, paywallData, storefrontCountryCode);
        }
        if (i10 == 2) {
            return m758makeMultiplePackageConfigurationyxL6bBk(arrayList, variableDataProvider, paywallData, str, storefrontCountryCode);
        }
        if (i10 == 3) {
            return m757makeMultiTierPackageConfigurationyxL6bBk(paywallData, packageIdsInConfig, availablePackages, variableDataProvider, storefrontCountryCode);
        }
        throw new r();
    }
}
