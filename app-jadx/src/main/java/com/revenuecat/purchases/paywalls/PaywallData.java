package com.revenuecat.purchases.paywalls;

import Rf.b;
import Td.InterfaceC2154e;
import Td.z;
import Tf.e;
import Ud.AbstractC2279u;
import Ud.S;
import Uf.d;
import Vf.AbstractC2327f0;
import Vf.C2324e;
import Vf.M;
import Vf.t0;
import Vf.x0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.paywalls.PaywallColor;
import com.revenuecat.purchases.utils.LocaleExtensionsKt;
import com.revenuecat.purchases.utils.serializers.GoogleListSerializer;
import com.revenuecat.purchases.utils.serializers.OptionalURLSerializer;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\b\u0007\u0018\u0000 N2\u00020\u0001:\u0004ONPQB\u0087\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b\u0012 \b\u0002\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b0\u000b\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013B©\u0001\b\u0011\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0001\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\"\b\u0001\u0010\u000e\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\u000b\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J5\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b0\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010%\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 HÁ\u0001¢\u0006\u0004\b#\u0010$J)\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000fH\u0007¢\u0006\u0004\b&\u0010\u001cJ\u0017\u0010(\u001a\u0004\u0018\u00010\f2\u0006\u0010'\u001a\u00020\u0018¢\u0006\u0004\b(\u0010)J%\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020\u0018H\u0007¢\u0006\u0004\b*\u0010+J\u008b\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b2 \b\u0002\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b0\u000b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u00100R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010.\u0012\u0004\b2\u00103\u001a\u0004\b1\u00100R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b5\u00106R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00107\u0012\u0004\b:\u00103\u001a\u0004\b8\u00109R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b<\u0010=R,\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\r\u0010>\u0012\u0004\bA\u00103\u001a\u0004\b?\u0010@R8\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b0\u000b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010>\u0012\u0004\bC\u00103\u001a\u0004\bB\u0010@R&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010D\u0012\u0004\bG\u00103\u001a\u0004\bE\u0010FR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010.\u0012\u0004\bI\u00103\u001a\u0004\bH\u00100R\u001d\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0\u001a8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR)\u0010M\u001a\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b0\u001a8F¢\u0006\u0006\u001a\u0004\bL\u0010K¨\u0006R"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData;", "", "", DiagnosticsEntry.ID_KEY, "templateName", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "config", "Ljava/net/URL;", "assetBaseURL", "", "revision", "", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "localization", "localizationByTier", "", "zeroDecimalPlaceCountries", "defaultLocale", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;Ljava/net/URL;ILjava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)V", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;Ljava/net/URL;ILjava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;LVf/t0;)V", "Ljava/util/Locale;", "locales", "Lkotlin/Pair;", "tieredConfigForLocales", "(Ljava/util/List;)Lkotlin/Pair;", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/PaywallData;LUf/d;LTf/e;)V", "write$Self", "localizedConfiguration", "requiredLocale", "configForLocale", "(Ljava/util/Locale;)Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "tieredConfigForLocale", "(Ljava/util/Locale;)Ljava/util/Map;", "copy", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;Ljava/net/URL;ILjava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/PaywallData;", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTemplateName", "getTemplateName$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "getConfig", "()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "Ljava/net/URL;", "getAssetBaseURL", "()Ljava/net/URL;", "getAssetBaseURL$annotations", "I", "getRevision", "()I", "Ljava/util/Map;", "getLocalization$purchases_defaultsBc8Release", "()Ljava/util/Map;", "getLocalization$purchases_defaultsBc8Release$annotations", "getLocalizationByTier$purchases_defaultsBc8Release", "getLocalizationByTier$purchases_defaultsBc8Release$annotations", "Ljava/util/List;", "getZeroDecimalPlaceCountries", "()Ljava/util/List;", "getZeroDecimalPlaceCountries$annotations", "getDefaultLocale", "getDefaultLocale$annotations", "getLocalizedConfiguration", "()Lkotlin/Pair;", "getTieredLocalizedConfiguration", "tieredLocalizedConfiguration", "Companion", "$serializer", "Configuration", "LocalizedConfiguration", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallData {
    private static final b[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final URL assetBaseURL;
    private final Configuration config;
    private final String defaultLocale;
    private final String id;
    private final Map<String, LocalizedConfiguration> localization;
    private final Map<String, Map<String, LocalizedConfiguration>> localizationByTier;
    private final int revision;
    private final String templateName;
    private final List<String> zeroDecimalPlaceCountries;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/PaywallData;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b serializer() {
            return PaywallData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        x0 x0Var = x0.f20253a;
        PaywallData$LocalizedConfiguration$$serializer paywallData$LocalizedConfiguration$$serializer = PaywallData$LocalizedConfiguration$$serializer.INSTANCE;
        $childSerializers = new b[]{null, null, null, null, null, new M(x0Var, paywallData$LocalizedConfiguration$$serializer), new M(x0Var, new M(x0Var, paywallData$LocalizedConfiguration$$serializer)), null, null};
    }

    @InterfaceC2154e
    public /* synthetic */ PaywallData(int i10, String str, String str2, Configuration configuration, URL url, int i11, Map map, Map map2, List list, String str3, t0 t0Var) {
        if (46 != (i10 & 46)) {
            AbstractC2327f0.a(i10, 46, PaywallData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        this.templateName = str2;
        this.config = configuration;
        this.assetBaseURL = url;
        if ((i10 & 16) == 0) {
            this.revision = 0;
        } else {
            this.revision = i11;
        }
        this.localization = map;
        if ((i10 & 64) == 0) {
            this.localizationByTier = S.i();
        } else {
            this.localizationByTier = map2;
        }
        if ((i10 & 128) == 0) {
            this.zeroDecimalPlaceCountries = AbstractC2279u.m();
        } else {
            this.zeroDecimalPlaceCountries = list;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.defaultLocale = null;
        } else {
            this.defaultLocale = str3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaywallData copy$default(PaywallData paywallData, String str, Configuration configuration, URL url, int i10, Map map, Map map2, List list, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = paywallData.templateName;
        }
        if ((i11 & 2) != 0) {
            configuration = paywallData.config;
        }
        if ((i11 & 4) != 0) {
            url = paywallData.assetBaseURL;
        }
        if ((i11 & 8) != 0) {
            i10 = paywallData.revision;
        }
        if ((i11 & 16) != 0) {
            map = paywallData.localization;
        }
        if ((i11 & 32) != 0) {
            map2 = paywallData.localizationByTier;
        }
        if ((i11 & 64) != 0) {
            list = paywallData.zeroDecimalPlaceCountries;
        }
        if ((i11 & 128) != 0) {
            str2 = paywallData.defaultLocale;
        }
        List list2 = list;
        String str3 = str2;
        Map map3 = map;
        Map map4 = map2;
        return paywallData.copy(str, configuration, url, i10, map3, map4, list2, str3);
    }

    private final Pair<Locale, Map<String, LocalizedConfiguration>> tieredConfigForLocales(List<Locale> locales) {
        Object next;
        Iterator<Locale> it = locales.iterator();
        while (it.hasNext()) {
            Locale localeConvertToCorrectlyFormattedLocale = LocaleExtensionsKt.convertToCorrectlyFormattedLocale(it.next());
            Map<String, LocalizedConfiguration> mapTieredConfigForLocale = tieredConfigForLocale(localeConvertToCorrectlyFormattedLocale);
            if (mapTieredConfigForLocale != null) {
                return z.a(localeConvertToCorrectlyFormattedLocale, mapTieredConfigForLocale);
            }
        }
        String str = this.defaultLocale;
        if (str != null) {
            Iterator<T> it2 = this.localizationByTier.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (AbstractC5504s.c(LocaleExtensionsKt.toLocale((String) ((Map.Entry) next).getKey()), LocaleExtensionsKt.toLocale(str))) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry != null) {
                return z.a(LocaleExtensionsKt.toLocale((String) entry.getKey()), entry.getValue());
            }
        }
        Map.Entry entry2 = (Map.Entry) AbstractC2279u.l0(this.localizationByTier.entrySet());
        return z.a(LocaleExtensionsKt.toLocale((String) entry2.getKey()), entry2.getValue());
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PaywallData self, d output, e serialDesc) {
        b[] bVarArr = $childSerializers;
        if (output.g(serialDesc, 0) || self.id != null) {
            output.f(serialDesc, 0, x0.f20253a, self.id);
        }
        output.k(serialDesc, 1, self.templateName);
        output.m(serialDesc, 2, PaywallData$Configuration$$serializer.INSTANCE, self.config);
        output.m(serialDesc, 3, URLSerializer.INSTANCE, self.assetBaseURL);
        if (output.g(serialDesc, 4) || self.revision != 0) {
            output.p(serialDesc, 4, self.revision);
        }
        output.m(serialDesc, 5, bVarArr[5], self.localization);
        if (output.g(serialDesc, 6) || !AbstractC5504s.c(self.localizationByTier, S.i())) {
            output.m(serialDesc, 6, bVarArr[6], self.localizationByTier);
        }
        if (output.g(serialDesc, 7) || !AbstractC5504s.c(self.zeroDecimalPlaceCountries, AbstractC2279u.m())) {
            output.m(serialDesc, 7, GoogleListSerializer.INSTANCE, self.zeroDecimalPlaceCountries);
        }
        if (!output.g(serialDesc, 8) && self.defaultLocale == null) {
            return;
        }
        output.f(serialDesc, 8, x0.f20253a, self.defaultLocale);
    }

    public final LocalizedConfiguration configForLocale(Locale requiredLocale) {
        Object next;
        AbstractC5504s.h(requiredLocale, "requiredLocale");
        LocalizedConfiguration localizedConfiguration = this.localization.get(requiredLocale.toString());
        if (localizedConfiguration != null) {
            return localizedConfiguration;
        }
        Iterator<T> it = this.localization.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (LocaleExtensionsKt.sharedLanguageCodeWith(requiredLocale, LocaleExtensionsKt.toLocale((String) ((Map.Entry) next).getKey()))) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (LocalizedConfiguration) entry.getValue();
        }
        return null;
    }

    public final PaywallData copy(String templateName, Configuration config, URL assetBaseURL, int revision, Map<String, LocalizedConfiguration> localization, Map<String, ? extends Map<String, LocalizedConfiguration>> localizationByTier, List<String> zeroDecimalPlaceCountries, String defaultLocale) {
        AbstractC5504s.h(templateName, "templateName");
        AbstractC5504s.h(config, "config");
        AbstractC5504s.h(assetBaseURL, "assetBaseURL");
        AbstractC5504s.h(localization, "localization");
        AbstractC5504s.h(localizationByTier, "localizationByTier");
        AbstractC5504s.h(zeroDecimalPlaceCountries, "zeroDecimalPlaceCountries");
        return new PaywallData((String) null, templateName, config, assetBaseURL, revision, localization, localizationByTier, zeroDecimalPlaceCountries, defaultLocale, 1, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallData)) {
            return false;
        }
        PaywallData paywallData = (PaywallData) obj;
        return AbstractC5504s.c(this.id, paywallData.id) && AbstractC5504s.c(this.templateName, paywallData.templateName) && AbstractC5504s.c(this.config, paywallData.config) && AbstractC5504s.c(this.assetBaseURL, paywallData.assetBaseURL) && this.revision == paywallData.revision && AbstractC5504s.c(this.localization, paywallData.localization) && AbstractC5504s.c(this.localizationByTier, paywallData.localizationByTier) && AbstractC5504s.c(this.zeroDecimalPlaceCountries, paywallData.zeroDecimalPlaceCountries) && AbstractC5504s.c(this.defaultLocale, paywallData.defaultLocale);
    }

    public final URL getAssetBaseURL() {
        return this.assetBaseURL;
    }

    public final Configuration getConfig() {
        return this.config;
    }

    public final String getDefaultLocale() {
        return this.defaultLocale;
    }

    public final String getId() {
        return this.id;
    }

    public final Map<String, LocalizedConfiguration> getLocalization$purchases_defaultsBc8Release() {
        return this.localization;
    }

    public final Map<String, Map<String, LocalizedConfiguration>> getLocalizationByTier$purchases_defaultsBc8Release() {
        return this.localizationByTier;
    }

    public final Pair<Locale, LocalizedConfiguration> getLocalizedConfiguration() {
        return localizedConfiguration(LocaleExtensionsKt.getDefaultLocales());
    }

    public final int getRevision() {
        return this.revision;
    }

    public final String getTemplateName() {
        return this.templateName;
    }

    public final Pair<Locale, Map<String, LocalizedConfiguration>> getTieredLocalizedConfiguration() {
        return tieredConfigForLocales(LocaleExtensionsKt.getDefaultLocales());
    }

    public final List<String> getZeroDecimalPlaceCountries() {
        return this.zeroDecimalPlaceCountries;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.templateName.hashCode()) * 31) + this.config.hashCode()) * 31) + this.assetBaseURL.hashCode()) * 31) + this.revision) * 31) + this.localization.hashCode()) * 31) + this.localizationByTier.hashCode()) * 31) + this.zeroDecimalPlaceCountries.hashCode()) * 31;
        String str2 = this.defaultLocale;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final Pair<Locale, LocalizedConfiguration> localizedConfiguration(List<Locale> locales) {
        Object next;
        AbstractC5504s.h(locales, "locales");
        Iterator<Locale> it = locales.iterator();
        while (it.hasNext()) {
            Locale localeConvertToCorrectlyFormattedLocale = LocaleExtensionsKt.convertToCorrectlyFormattedLocale(it.next());
            LocalizedConfiguration localizedConfigurationConfigForLocale = configForLocale(localeConvertToCorrectlyFormattedLocale);
            if (localizedConfigurationConfigForLocale != null) {
                return z.a(localeConvertToCorrectlyFormattedLocale, localizedConfigurationConfigForLocale);
            }
        }
        String str = this.defaultLocale;
        if (str != null) {
            Iterator<T> it2 = this.localization.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (AbstractC5504s.c(LocaleExtensionsKt.toLocale((String) ((Map.Entry) next).getKey()), LocaleExtensionsKt.toLocale(str))) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry != null) {
                return z.a(LocaleExtensionsKt.toLocale((String) entry.getKey()), entry.getValue());
            }
        }
        Map.Entry entry2 = (Map.Entry) AbstractC2279u.l0(this.localization.entrySet());
        return z.a(LocaleExtensionsKt.toLocale((String) entry2.getKey()), entry2.getValue());
    }

    public final Map<String, LocalizedConfiguration> tieredConfigForLocale(Locale requiredLocale) {
        Object next;
        AbstractC5504s.h(requiredLocale, "requiredLocale");
        Map<String, LocalizedConfiguration> map = this.localizationByTier.get(requiredLocale.toString());
        if (map != null) {
            return map;
        }
        Iterator<T> it = this.localizationByTier.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (LocaleExtensionsKt.sharedLanguageCodeWith(requiredLocale, LocaleExtensionsKt.toLocale((String) ((Map.Entry) next).getKey()))) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (Map) entry.getValue();
        }
        return null;
    }

    public String toString() {
        return "PaywallData(id=" + this.id + ", templateName=" + this.templateName + ", config=" + this.config + ", assetBaseURL=" + this.assetBaseURL + ", revision=" + this.revision + ", localization=" + this.localization + ", localizationByTier=" + this.localizationByTier + ", zeroDecimalPlaceCountries=" + this.zeroDecimalPlaceCountries + ", defaultLocale=" + this.defaultLocale + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b4\b\u0007\u0018\u0000 S2\u00020\u0001:\u0006TUVSWXB½\u0001\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0017\u0010\u0018B¡\u0001\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0017\u0010\u001aBÓ\u0001\b\u0011\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0001\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\r\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0016\b\u0001\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0017\u0010\u001fJ(\u0010(\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#HÁ\u0001¢\u0006\u0004\b&\u0010'JÇ\u0001\u0010)\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b)\u0010*R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010+\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010-R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00100\u0012\u0004\b3\u0010/\u001a\u0004\b1\u00102R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0007\u00104\u0012\u0004\b7\u0010/\u001a\u0004\b5\u00106R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\b\u00104\u0012\u0004\b9\u0010/\u001a\u0004\b8\u00106R.\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010:\u0012\u0004\b=\u0010/\u001a\u0004\b;\u0010<R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010>\u0012\u0004\bA\u0010/\u001a\u0004\b?\u0010@R \u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010>\u0012\u0004\bC\u0010/\u001a\u0004\bB\u0010@R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010D\u0012\u0004\bG\u0010/\u001a\u0004\bE\u0010FR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010D\u0012\u0004\bI\u0010/\u001a\u0004\bH\u0010FR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010J\u001a\u0004\bK\u0010LR.\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010:\u0012\u0004\bN\u0010/\u001a\u0004\bM\u0010<R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010+\u001a\u0004\bO\u0010-R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u00100\u0012\u0004\bQ\u0010/\u001a\u0004\bP\u00102R\u0011\u0010\u0019\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bR\u00106¨\u0006Y"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "", "", "", "packageIds", "defaultPackage", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;", "imagesWebp", "legacyImages", "", "imagesByTier", "", "blurredBackgroundImage", "displayRestorePurchases", "Ljava/net/URL;", "termsOfServiceURL", "privacyURL", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "colors", "colorsByTier", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;", "tiers", "defaultTier", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Ljava/util/Map;ZZLjava/net/URL;Ljava/net/URL;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)V", "images", "(Ljava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Ljava/util/Map;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;Ljava/util/Map;Ljava/util/List;ZZLjava/net/URL;Ljava/net/URL;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Ljava/util/Map;ZZLjava/net/URL;Ljava/net/URL;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;LUf/d;LTf/e;)V", "write$Self", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Ljava/util/Map;ZZLjava/net/URL;Ljava/net/URL;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "Ljava/util/List;", "getPackageIds", "()Ljava/util/List;", "getPackageIds$annotations", "()V", "Ljava/lang/String;", "getDefaultPackage", "()Ljava/lang/String;", "getDefaultPackage$annotations", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;", "getImagesWebp$purchases_defaultsBc8Release", "()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;", "getImagesWebp$purchases_defaultsBc8Release$annotations", "getLegacyImages$purchases_defaultsBc8Release", "getLegacyImages$purchases_defaultsBc8Release$annotations", "Ljava/util/Map;", "getImagesByTier", "()Ljava/util/Map;", "getImagesByTier$annotations", "Z", "getBlurredBackgroundImage", "()Z", "getBlurredBackgroundImage$annotations", "getDisplayRestorePurchases", "getDisplayRestorePurchases$annotations", "Ljava/net/URL;", "getTermsOfServiceURL", "()Ljava/net/URL;", "getTermsOfServiceURL$annotations", "getPrivacyURL", "getPrivacyURL$annotations", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "getColors", "()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "getColorsByTier", "getColorsByTier$annotations", "getTiers", "getDefaultTier", "getDefaultTier$annotations", "getImages", "Companion", "$serializer", "ColorInformation", "Colors", "Images", "Tier", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Configuration {
        private static final b[] $childSerializers;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean blurredBackgroundImage;
        private final ColorInformation colors;
        private final Map<String, ColorInformation> colorsByTier;
        private final String defaultPackage;
        private final String defaultTier;
        private final boolean displayRestorePurchases;
        private final Map<String, Images> imagesByTier;
        private final Images imagesWebp;
        private final Images legacyImages;
        private final List<String> packageIds;
        private final URL privacyURL;
        private final URL termsOfServiceURL;
        private final List<Tier> tiers;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u0019B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "light", "dark", "<init>", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;LUf/d;LTf/e;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "getLight", "()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "getDark", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ColorInformation {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final Colors dark;
            private final Colors light;

            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b serializer() {
                    return PaywallData$Configuration$ColorInformation$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC2154e
            public /* synthetic */ ColorInformation(int i10, Colors colors, Colors colors2, t0 t0Var) {
                if (1 != (i10 & 1)) {
                    AbstractC2327f0.a(i10, 1, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE.getDescriptor());
                }
                this.light = colors;
                if ((i10 & 2) == 0) {
                    this.dark = null;
                } else {
                    this.dark = colors2;
                }
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(ColorInformation self, d output, e serialDesc) {
                PaywallData$Configuration$Colors$$serializer paywallData$Configuration$Colors$$serializer = PaywallData$Configuration$Colors$$serializer.INSTANCE;
                output.m(serialDesc, 0, paywallData$Configuration$Colors$$serializer, self.light);
                if (!output.g(serialDesc, 1) && self.dark == null) {
                    return;
                }
                output.f(serialDesc, 1, paywallData$Configuration$Colors$$serializer, self.dark);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ColorInformation)) {
                    return false;
                }
                ColorInformation colorInformation = (ColorInformation) obj;
                return AbstractC5504s.c(this.light, colorInformation.light) && AbstractC5504s.c(this.dark, colorInformation.dark);
            }

            public final Colors getDark() {
                return this.dark;
            }

            public final Colors getLight() {
                return this.light;
            }

            public int hashCode() {
                int iHashCode = this.light.hashCode() * 31;
                Colors colors = this.dark;
                return iHashCode + (colors == null ? 0 : colors.hashCode());
            }

            public String toString() {
                return "ColorInformation(light=" + this.light + ", dark=" + this.dark + ')';
            }

            public ColorInformation(Colors light, Colors colors) {
                AbstractC5504s.h(light, "light");
                this.light = light;
                this.dark = colors;
            }

            public /* synthetic */ ColorInformation(Colors colors, Colors colors2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(colors, (i10 & 2) != 0 ? null : colors2);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\b\u0007\u0018\u0000 C2\u00020\u0001:\u0002DCB«\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013BÏ\u0001\b\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J(\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cHÁ\u0001¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010$R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010$R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u0012\u0004\b,\u0010&\u001a\u0004\b+\u0010$R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u0012\u0004\b.\u0010&\u001a\u0004\b-\u0010$R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\"\u0012\u0004\b0\u0010&\u001a\u0004\b/\u0010$R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\"\u0012\u0004\b2\u0010&\u001a\u0004\b1\u0010$R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\"\u0012\u0004\b4\u0010&\u001a\u0004\b3\u0010$R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\"\u0012\u0004\b6\u0010&\u001a\u0004\b5\u0010$R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\"\u0012\u0004\b8\u0010&\u001a\u0004\b7\u0010$R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\"\u0012\u0004\b:\u0010&\u001a\u0004\b9\u0010$R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\"\u0012\u0004\b<\u0010&\u001a\u0004\b;\u0010$R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\"\u0012\u0004\b>\u0010&\u001a\u0004\b=\u0010$R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\"\u0012\u0004\b@\u0010&\u001a\u0004\b?\u0010$R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\"\u0012\u0004\bB\u0010&\u001a\u0004\bA\u0010$¨\u0006E"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "", "Lcom/revenuecat/purchases/paywalls/PaywallColor;", AppStateModule.APP_STATE_BACKGROUND, "text1", "text2", "text3", "callToActionBackground", "callToActionForeground", "callToActionSecondaryBackground", "accent1", "accent2", "accent3", "closeButton", "tierControlBackground", "tierControlForeground", "tierControlSelectedBackground", "tierControlSelectedForeground", "<init>", "(Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;LUf/d;LTf/e;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/PaywallColor;", "getBackground", "()Lcom/revenuecat/purchases/paywalls/PaywallColor;", "getBackground$annotations", "()V", "getText1", "getText1$annotations", "getText2", "getText2$annotations", "getText3", "getText3$annotations", "getCallToActionBackground", "getCallToActionBackground$annotations", "getCallToActionForeground", "getCallToActionForeground$annotations", "getCallToActionSecondaryBackground", "getCallToActionSecondaryBackground$annotations", "getAccent1", "getAccent1$annotations", "getAccent2", "getAccent2$annotations", "getAccent3", "getAccent3$annotations", "getCloseButton", "getCloseButton$annotations", "getTierControlBackground", "getTierControlBackground$annotations", "getTierControlForeground", "getTierControlForeground$annotations", "getTierControlSelectedBackground", "getTierControlSelectedBackground$annotations", "getTierControlSelectedForeground", "getTierControlSelectedForeground$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Colors {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final PaywallColor accent1;
            private final PaywallColor accent2;
            private final PaywallColor accent3;
            private final PaywallColor background;
            private final PaywallColor callToActionBackground;
            private final PaywallColor callToActionForeground;
            private final PaywallColor callToActionSecondaryBackground;
            private final PaywallColor closeButton;
            private final PaywallColor text1;
            private final PaywallColor text2;
            private final PaywallColor text3;
            private final PaywallColor tierControlBackground;
            private final PaywallColor tierControlForeground;
            private final PaywallColor tierControlSelectedBackground;
            private final PaywallColor tierControlSelectedForeground;

            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b serializer() {
                    return PaywallData$Configuration$Colors$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC2154e
            public /* synthetic */ Colors(int i10, PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, PaywallColor paywallColor6, PaywallColor paywallColor7, PaywallColor paywallColor8, PaywallColor paywallColor9, PaywallColor paywallColor10, PaywallColor paywallColor11, PaywallColor paywallColor12, PaywallColor paywallColor13, PaywallColor paywallColor14, PaywallColor paywallColor15, t0 t0Var) {
                if (51 != (i10 & 51)) {
                    AbstractC2327f0.a(i10, 51, PaywallData$Configuration$Colors$$serializer.INSTANCE.getDescriptor());
                }
                this.background = paywallColor;
                this.text1 = paywallColor2;
                if ((i10 & 4) == 0) {
                    this.text2 = null;
                } else {
                    this.text2 = paywallColor3;
                }
                if ((i10 & 8) == 0) {
                    this.text3 = null;
                } else {
                    this.text3 = paywallColor4;
                }
                this.callToActionBackground = paywallColor5;
                this.callToActionForeground = paywallColor6;
                if ((i10 & 64) == 0) {
                    this.callToActionSecondaryBackground = null;
                } else {
                    this.callToActionSecondaryBackground = paywallColor7;
                }
                if ((i10 & 128) == 0) {
                    this.accent1 = null;
                } else {
                    this.accent1 = paywallColor8;
                }
                if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
                    this.accent2 = null;
                } else {
                    this.accent2 = paywallColor9;
                }
                if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
                    this.accent3 = null;
                } else {
                    this.accent3 = paywallColor10;
                }
                if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 0) {
                    this.closeButton = null;
                } else {
                    this.closeButton = paywallColor11;
                }
                if ((i10 & 2048) == 0) {
                    this.tierControlBackground = null;
                } else {
                    this.tierControlBackground = paywallColor12;
                }
                if ((i10 & 4096) == 0) {
                    this.tierControlForeground = null;
                } else {
                    this.tierControlForeground = paywallColor13;
                }
                if ((i10 & 8192) == 0) {
                    this.tierControlSelectedBackground = null;
                } else {
                    this.tierControlSelectedBackground = paywallColor14;
                }
                if ((i10 & 16384) == 0) {
                    this.tierControlSelectedForeground = null;
                } else {
                    this.tierControlSelectedForeground = paywallColor15;
                }
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Colors self, d output, e serialDesc) {
                PaywallColor.Serializer serializer = PaywallColor.Serializer.INSTANCE;
                output.m(serialDesc, 0, serializer, self.background);
                output.m(serialDesc, 1, serializer, self.text1);
                if (output.g(serialDesc, 2) || self.text2 != null) {
                    output.f(serialDesc, 2, serializer, self.text2);
                }
                if (output.g(serialDesc, 3) || self.text3 != null) {
                    output.f(serialDesc, 3, serializer, self.text3);
                }
                output.m(serialDesc, 4, serializer, self.callToActionBackground);
                output.m(serialDesc, 5, serializer, self.callToActionForeground);
                if (output.g(serialDesc, 6) || self.callToActionSecondaryBackground != null) {
                    output.f(serialDesc, 6, serializer, self.callToActionSecondaryBackground);
                }
                if (output.g(serialDesc, 7) || self.accent1 != null) {
                    output.f(serialDesc, 7, serializer, self.accent1);
                }
                if (output.g(serialDesc, 8) || self.accent2 != null) {
                    output.f(serialDesc, 8, serializer, self.accent2);
                }
                if (output.g(serialDesc, 9) || self.accent3 != null) {
                    output.f(serialDesc, 9, serializer, self.accent3);
                }
                if (output.g(serialDesc, 10) || self.closeButton != null) {
                    output.f(serialDesc, 10, serializer, self.closeButton);
                }
                if (output.g(serialDesc, 11) || self.tierControlBackground != null) {
                    output.f(serialDesc, 11, serializer, self.tierControlBackground);
                }
                if (output.g(serialDesc, 12) || self.tierControlForeground != null) {
                    output.f(serialDesc, 12, serializer, self.tierControlForeground);
                }
                if (output.g(serialDesc, 13) || self.tierControlSelectedBackground != null) {
                    output.f(serialDesc, 13, serializer, self.tierControlSelectedBackground);
                }
                if (!output.g(serialDesc, 14) && self.tierControlSelectedForeground == null) {
                    return;
                }
                output.f(serialDesc, 14, serializer, self.tierControlSelectedForeground);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Colors)) {
                    return false;
                }
                Colors colors = (Colors) obj;
                return AbstractC5504s.c(this.background, colors.background) && AbstractC5504s.c(this.text1, colors.text1) && AbstractC5504s.c(this.text2, colors.text2) && AbstractC5504s.c(this.text3, colors.text3) && AbstractC5504s.c(this.callToActionBackground, colors.callToActionBackground) && AbstractC5504s.c(this.callToActionForeground, colors.callToActionForeground) && AbstractC5504s.c(this.callToActionSecondaryBackground, colors.callToActionSecondaryBackground) && AbstractC5504s.c(this.accent1, colors.accent1) && AbstractC5504s.c(this.accent2, colors.accent2) && AbstractC5504s.c(this.accent3, colors.accent3) && AbstractC5504s.c(this.closeButton, colors.closeButton) && AbstractC5504s.c(this.tierControlBackground, colors.tierControlBackground) && AbstractC5504s.c(this.tierControlForeground, colors.tierControlForeground) && AbstractC5504s.c(this.tierControlSelectedBackground, colors.tierControlSelectedBackground) && AbstractC5504s.c(this.tierControlSelectedForeground, colors.tierControlSelectedForeground);
            }

            public final PaywallColor getAccent1() {
                return this.accent1;
            }

            public final PaywallColor getAccent2() {
                return this.accent2;
            }

            public final PaywallColor getAccent3() {
                return this.accent3;
            }

            public final PaywallColor getBackground() {
                return this.background;
            }

            public final PaywallColor getCallToActionBackground() {
                return this.callToActionBackground;
            }

            public final PaywallColor getCallToActionForeground() {
                return this.callToActionForeground;
            }

            public final PaywallColor getCallToActionSecondaryBackground() {
                return this.callToActionSecondaryBackground;
            }

            public final PaywallColor getCloseButton() {
                return this.closeButton;
            }

            public final PaywallColor getText1() {
                return this.text1;
            }

            public final PaywallColor getText2() {
                return this.text2;
            }

            public final PaywallColor getText3() {
                return this.text3;
            }

            public final PaywallColor getTierControlBackground() {
                return this.tierControlBackground;
            }

            public final PaywallColor getTierControlForeground() {
                return this.tierControlForeground;
            }

            public final PaywallColor getTierControlSelectedBackground() {
                return this.tierControlSelectedBackground;
            }

            public final PaywallColor getTierControlSelectedForeground() {
                return this.tierControlSelectedForeground;
            }

            public int hashCode() {
                int iHashCode = ((this.background.hashCode() * 31) + this.text1.hashCode()) * 31;
                PaywallColor paywallColor = this.text2;
                int iHashCode2 = (iHashCode + (paywallColor == null ? 0 : paywallColor.hashCode())) * 31;
                PaywallColor paywallColor2 = this.text3;
                int iHashCode3 = (((((iHashCode2 + (paywallColor2 == null ? 0 : paywallColor2.hashCode())) * 31) + this.callToActionBackground.hashCode()) * 31) + this.callToActionForeground.hashCode()) * 31;
                PaywallColor paywallColor3 = this.callToActionSecondaryBackground;
                int iHashCode4 = (iHashCode3 + (paywallColor3 == null ? 0 : paywallColor3.hashCode())) * 31;
                PaywallColor paywallColor4 = this.accent1;
                int iHashCode5 = (iHashCode4 + (paywallColor4 == null ? 0 : paywallColor4.hashCode())) * 31;
                PaywallColor paywallColor5 = this.accent2;
                int iHashCode6 = (iHashCode5 + (paywallColor5 == null ? 0 : paywallColor5.hashCode())) * 31;
                PaywallColor paywallColor6 = this.accent3;
                int iHashCode7 = (iHashCode6 + (paywallColor6 == null ? 0 : paywallColor6.hashCode())) * 31;
                PaywallColor paywallColor7 = this.closeButton;
                int iHashCode8 = (iHashCode7 + (paywallColor7 == null ? 0 : paywallColor7.hashCode())) * 31;
                PaywallColor paywallColor8 = this.tierControlBackground;
                int iHashCode9 = (iHashCode8 + (paywallColor8 == null ? 0 : paywallColor8.hashCode())) * 31;
                PaywallColor paywallColor9 = this.tierControlForeground;
                int iHashCode10 = (iHashCode9 + (paywallColor9 == null ? 0 : paywallColor9.hashCode())) * 31;
                PaywallColor paywallColor10 = this.tierControlSelectedBackground;
                int iHashCode11 = (iHashCode10 + (paywallColor10 == null ? 0 : paywallColor10.hashCode())) * 31;
                PaywallColor paywallColor11 = this.tierControlSelectedForeground;
                return iHashCode11 + (paywallColor11 != null ? paywallColor11.hashCode() : 0);
            }

            public String toString() {
                return "Colors(background=" + this.background + ", text1=" + this.text1 + ", text2=" + this.text2 + ", text3=" + this.text3 + ", callToActionBackground=" + this.callToActionBackground + ", callToActionForeground=" + this.callToActionForeground + ", callToActionSecondaryBackground=" + this.callToActionSecondaryBackground + ", accent1=" + this.accent1 + ", accent2=" + this.accent2 + ", accent3=" + this.accent3 + ", closeButton=" + this.closeButton + ", tierControlBackground=" + this.tierControlBackground + ", tierControlForeground=" + this.tierControlForeground + ", tierControlSelectedBackground=" + this.tierControlSelectedBackground + ", tierControlSelectedForeground=" + this.tierControlSelectedForeground + ')';
            }

            public Colors(PaywallColor background, PaywallColor text1, PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor callToActionBackground, PaywallColor callToActionForeground, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, PaywallColor paywallColor6, PaywallColor paywallColor7, PaywallColor paywallColor8, PaywallColor paywallColor9, PaywallColor paywallColor10, PaywallColor paywallColor11) {
                AbstractC5504s.h(background, "background");
                AbstractC5504s.h(text1, "text1");
                AbstractC5504s.h(callToActionBackground, "callToActionBackground");
                AbstractC5504s.h(callToActionForeground, "callToActionForeground");
                this.background = background;
                this.text1 = text1;
                this.text2 = paywallColor;
                this.text3 = paywallColor2;
                this.callToActionBackground = callToActionBackground;
                this.callToActionForeground = callToActionForeground;
                this.callToActionSecondaryBackground = paywallColor3;
                this.accent1 = paywallColor4;
                this.accent2 = paywallColor5;
                this.accent3 = paywallColor6;
                this.closeButton = paywallColor7;
                this.tierControlBackground = paywallColor8;
                this.tierControlForeground = paywallColor9;
                this.tierControlSelectedBackground = paywallColor10;
                this.tierControlSelectedForeground = paywallColor11;
            }

            public static /* synthetic */ void getAccent1$annotations() {
            }

            public static /* synthetic */ void getAccent2$annotations() {
            }

            public static /* synthetic */ void getAccent3$annotations() {
            }

            public static /* synthetic */ void getBackground$annotations() {
            }

            public static /* synthetic */ void getCallToActionBackground$annotations() {
            }

            public static /* synthetic */ void getCallToActionForeground$annotations() {
            }

            public static /* synthetic */ void getCallToActionSecondaryBackground$annotations() {
            }

            public static /* synthetic */ void getCloseButton$annotations() {
            }

            public static /* synthetic */ void getText1$annotations() {
            }

            public static /* synthetic */ void getText2$annotations() {
            }

            public static /* synthetic */ void getText3$annotations() {
            }

            public static /* synthetic */ void getTierControlBackground$annotations() {
            }

            public static /* synthetic */ void getTierControlForeground$annotations() {
            }

            public static /* synthetic */ void getTierControlSelectedBackground$annotations() {
            }

            public static /* synthetic */ void getTierControlSelectedForeground$annotations() {
            }

            public /* synthetic */ Colors(PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, PaywallColor paywallColor6, PaywallColor paywallColor7, PaywallColor paywallColor8, PaywallColor paywallColor9, PaywallColor paywallColor10, PaywallColor paywallColor11, PaywallColor paywallColor12, PaywallColor paywallColor13, PaywallColor paywallColor14, PaywallColor paywallColor15, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(paywallColor, paywallColor2, (i10 & 4) != 0 ? null : paywallColor3, (i10 & 8) != 0 ? null : paywallColor4, paywallColor5, paywallColor6, (i10 & 64) != 0 ? null : paywallColor7, (i10 & 128) != 0 ? null : paywallColor8, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : paywallColor9, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : paywallColor10, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : paywallColor11, (i10 & 2048) != 0 ? null : paywallColor12, (i10 & 4096) != 0 ? null : paywallColor13, (i10 & 8192) != 0 ? null : paywallColor14, (i10 & 16384) != 0 ? null : paywallColor15);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b serializer() {
                return PaywallData$Configuration$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002$#B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B?\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0016\u0012\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001b\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0016\u0012\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001d\u0010\u0018R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;", "", "", "header", AppStateModule.APP_STATE_BACKGROUND, "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;LUf/d;LTf/e;)V", "write$Self", "Ljava/lang/String;", "getHeader", "()Ljava/lang/String;", "getHeader$annotations", "()V", "getBackground", "getBackground$annotations", "getIcon", "getIcon$annotations", "", "getAll$purchases_defaultsBc8Release", "()Ljava/util/List;", "all", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Images {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String background;
            private final String header;
            private final String icon;

            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b serializer() {
                    return PaywallData$Configuration$Images$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public Images() {
                this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Images self, d output, e serialDesc) {
                if (output.g(serialDesc, 0) || self.header != null) {
                    output.f(serialDesc, 0, EmptyStringToNullSerializer.INSTANCE, self.header);
                }
                if (output.g(serialDesc, 1) || self.background != null) {
                    output.f(serialDesc, 1, EmptyStringToNullSerializer.INSTANCE, self.background);
                }
                if (!output.g(serialDesc, 2) && self.icon == null) {
                    return;
                }
                output.f(serialDesc, 2, EmptyStringToNullSerializer.INSTANCE, self.icon);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Images)) {
                    return false;
                }
                Images images = (Images) obj;
                return AbstractC5504s.c(this.header, images.header) && AbstractC5504s.c(this.background, images.background) && AbstractC5504s.c(this.icon, images.icon);
            }

            public final List<String> getAll$purchases_defaultsBc8Release() {
                return AbstractC2279u.r(this.header, this.background, this.icon);
            }

            public final String getBackground() {
                return this.background;
            }

            public final String getHeader() {
                return this.header;
            }

            public final String getIcon() {
                return this.icon;
            }

            public int hashCode() {
                String str = this.header;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.background;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.icon;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "Images(header=" + this.header + ", background=" + this.background + ", icon=" + this.icon + ')';
            }

            @InterfaceC2154e
            public /* synthetic */ Images(int i10, String str, String str2, String str3, t0 t0Var) {
                if ((i10 & 1) == 0) {
                    this.header = null;
                } else {
                    this.header = str;
                }
                if ((i10 & 2) == 0) {
                    this.background = null;
                } else {
                    this.background = str2;
                }
                if ((i10 & 4) == 0) {
                    this.icon = null;
                } else {
                    this.icon = str3;
                }
            }

            public Images(String str, String str2, String str3) {
                this.header = str;
                this.background = str2;
                this.icon = str3;
            }

            public /* synthetic */ Images(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
            }

            public static /* synthetic */ void getBackground$annotations() {
            }

            public static /* synthetic */ void getHeader$annotations() {
            }

            public static /* synthetic */ void getIcon$annotations() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 !2\u00020\u0001:\u0002\"!B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0017\u0012\u0004\b \u0010\u001e\u001a\u0004\b\u001f\u0010\u0019¨\u0006#"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;", "", "", DiagnosticsEntry.ID_KEY, "", "packageIds", "defaultPackageId", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;LUf/d;LTf/e;)V", "write$Self", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Ljava/util/List;", "getPackageIds", "()Ljava/util/List;", "getPackageIds$annotations", "()V", "getDefaultPackageId", "getDefaultPackageId$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Tier {
            private final String defaultPackageId;
            private final String id;
            private final List<String> packageIds;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final b[] $childSerializers = {null, new C2324e(x0.f20253a), null};

            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b serializer() {
                    return PaywallData$Configuration$Tier$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC2154e
            public /* synthetic */ Tier(int i10, String str, List list, String str2, t0 t0Var) {
                if (7 != (i10 & 7)) {
                    AbstractC2327f0.a(i10, 7, PaywallData$Configuration$Tier$$serializer.INSTANCE.getDescriptor());
                }
                this.id = str;
                this.packageIds = list;
                this.defaultPackageId = str2;
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Tier self, d output, e serialDesc) {
                b[] bVarArr = $childSerializers;
                output.k(serialDesc, 0, self.id);
                output.m(serialDesc, 1, bVarArr[1], self.packageIds);
                output.k(serialDesc, 2, self.defaultPackageId);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Tier)) {
                    return false;
                }
                Tier tier = (Tier) obj;
                return AbstractC5504s.c(this.id, tier.id) && AbstractC5504s.c(this.packageIds, tier.packageIds) && AbstractC5504s.c(this.defaultPackageId, tier.defaultPackageId);
            }

            public final String getDefaultPackageId() {
                return this.defaultPackageId;
            }

            public final String getId() {
                return this.id;
            }

            public final List<String> getPackageIds() {
                return this.packageIds;
            }

            public int hashCode() {
                return (((this.id.hashCode() * 31) + this.packageIds.hashCode()) * 31) + this.defaultPackageId.hashCode();
            }

            public String toString() {
                return "Tier(id=" + this.id + ", packageIds=" + this.packageIds + ", defaultPackageId=" + this.defaultPackageId + ')';
            }

            public Tier(String id2, List<String> packageIds, String defaultPackageId) {
                AbstractC5504s.h(id2, "id");
                AbstractC5504s.h(packageIds, "packageIds");
                AbstractC5504s.h(defaultPackageId, "defaultPackageId");
                this.id = id2;
                this.packageIds = packageIds;
                this.defaultPackageId = defaultPackageId;
            }

            public static /* synthetic */ void getDefaultPackageId$annotations() {
            }

            public static /* synthetic */ void getPackageIds$annotations() {
            }
        }

        static {
            x0 x0Var = x0.f20253a;
            $childSerializers = new b[]{new C2324e(x0Var), null, null, null, new M(x0Var, PaywallData$Configuration$Images$$serializer.INSTANCE), null, null, null, null, null, new M(x0Var, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE), new C2324e(PaywallData$Configuration$Tier$$serializer.INSTANCE), null};
        }

        @InterfaceC2154e
        public /* synthetic */ Configuration(int i10, List list, String str, Images images, Images images2, Map map, boolean z10, boolean z11, URL url, URL url2, ColorInformation colorInformation, Map map2, List list2, String str2, t0 t0Var) {
            if (512 != (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING)) {
                AbstractC2327f0.a(i10, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, PaywallData$Configuration$$serializer.INSTANCE.getDescriptor());
            }
            this.packageIds = (i10 & 1) == 0 ? AbstractC2279u.m() : list;
            if ((i10 & 2) == 0) {
                this.defaultPackage = null;
            } else {
                this.defaultPackage = str;
            }
            if ((i10 & 4) == 0) {
                this.imagesWebp = null;
            } else {
                this.imagesWebp = images;
            }
            if ((i10 & 8) == 0) {
                this.legacyImages = null;
            } else {
                this.legacyImages = images2;
            }
            if ((i10 & 16) == 0) {
                this.imagesByTier = null;
            } else {
                this.imagesByTier = map;
            }
            if ((i10 & 32) == 0) {
                this.blurredBackgroundImage = false;
            } else {
                this.blurredBackgroundImage = z10;
            }
            if ((i10 & 64) == 0) {
                this.displayRestorePurchases = true;
            } else {
                this.displayRestorePurchases = z11;
            }
            if ((i10 & 128) == 0) {
                this.termsOfServiceURL = null;
            } else {
                this.termsOfServiceURL = url;
            }
            if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
                this.privacyURL = null;
            } else {
                this.privacyURL = url2;
            }
            this.colors = colorInformation;
            if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 0) {
                this.colorsByTier = null;
            } else {
                this.colorsByTier = map2;
            }
            if ((i10 & 2048) == 0) {
                this.tiers = null;
            } else {
                this.tiers = list2;
            }
            if ((i10 & 4096) == 0) {
                this.defaultTier = null;
            } else {
                this.defaultTier = str2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Configuration copy$default(Configuration configuration, List list, String str, Images images, Images images2, Map map, boolean z10, boolean z11, URL url, URL url2, ColorInformation colorInformation, Map map2, List list2, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = configuration.packageIds;
            }
            return configuration.copy(list, (i10 & 2) != 0 ? configuration.defaultPackage : str, (i10 & 4) != 0 ? configuration.imagesWebp : images, (i10 & 8) != 0 ? configuration.legacyImages : images2, (i10 & 16) != 0 ? configuration.imagesByTier : map, (i10 & 32) != 0 ? configuration.blurredBackgroundImage : z10, (i10 & 64) != 0 ? configuration.displayRestorePurchases : z11, (i10 & 128) != 0 ? configuration.termsOfServiceURL : url, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? configuration.privacyURL : url2, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? configuration.colors : colorInformation, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? configuration.colorsByTier : map2, (i10 & 2048) != 0 ? configuration.tiers : list2, (i10 & 4096) != 0 ? configuration.defaultTier : str2);
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Configuration self, d output, e serialDesc) {
            b[] bVarArr = $childSerializers;
            if (output.g(serialDesc, 0) || !AbstractC5504s.c(self.packageIds, AbstractC2279u.m())) {
                output.m(serialDesc, 0, bVarArr[0], self.packageIds);
            }
            if (output.g(serialDesc, 1) || self.defaultPackage != null) {
                output.f(serialDesc, 1, x0.f20253a, self.defaultPackage);
            }
            if (output.g(serialDesc, 2) || self.imagesWebp != null) {
                output.f(serialDesc, 2, PaywallData$Configuration$Images$$serializer.INSTANCE, self.imagesWebp);
            }
            if (output.g(serialDesc, 3) || self.legacyImages != null) {
                output.f(serialDesc, 3, PaywallData$Configuration$Images$$serializer.INSTANCE, self.legacyImages);
            }
            if (output.g(serialDesc, 4) || self.imagesByTier != null) {
                output.f(serialDesc, 4, bVarArr[4], self.imagesByTier);
            }
            if (output.g(serialDesc, 5) || self.blurredBackgroundImage) {
                output.B(serialDesc, 5, self.blurredBackgroundImage);
            }
            if (output.g(serialDesc, 6) || !self.displayRestorePurchases) {
                output.B(serialDesc, 6, self.displayRestorePurchases);
            }
            if (output.g(serialDesc, 7) || self.termsOfServiceURL != null) {
                output.f(serialDesc, 7, OptionalURLSerializer.INSTANCE, self.termsOfServiceURL);
            }
            if (output.g(serialDesc, 8) || self.privacyURL != null) {
                output.f(serialDesc, 8, OptionalURLSerializer.INSTANCE, self.privacyURL);
            }
            output.m(serialDesc, 9, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE, self.colors);
            if (output.g(serialDesc, 10) || self.colorsByTier != null) {
                output.f(serialDesc, 10, bVarArr[10], self.colorsByTier);
            }
            if (output.g(serialDesc, 11) || self.tiers != null) {
                output.f(serialDesc, 11, bVarArr[11], self.tiers);
            }
            if (!output.g(serialDesc, 12) && self.defaultTier == null) {
                return;
            }
            output.f(serialDesc, 12, x0.f20253a, self.defaultTier);
        }

        public final Configuration copy(List<String> packageIds, String defaultPackage, Images imagesWebp, Images legacyImages, Map<String, Images> imagesByTier, boolean blurredBackgroundImage, boolean displayRestorePurchases, URL termsOfServiceURL, URL privacyURL, ColorInformation colors, Map<String, ColorInformation> colorsByTier, List<Tier> tiers, String defaultTier) {
            AbstractC5504s.h(packageIds, "packageIds");
            AbstractC5504s.h(colors, "colors");
            return new Configuration(packageIds, defaultPackage, imagesWebp, legacyImages, imagesByTier, blurredBackgroundImage, displayRestorePurchases, termsOfServiceURL, privacyURL, colors, colorsByTier, tiers, defaultTier);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) obj;
            return AbstractC5504s.c(this.packageIds, configuration.packageIds) && AbstractC5504s.c(this.defaultPackage, configuration.defaultPackage) && AbstractC5504s.c(this.imagesWebp, configuration.imagesWebp) && AbstractC5504s.c(this.legacyImages, configuration.legacyImages) && AbstractC5504s.c(this.imagesByTier, configuration.imagesByTier) && this.blurredBackgroundImage == configuration.blurredBackgroundImage && this.displayRestorePurchases == configuration.displayRestorePurchases && AbstractC5504s.c(this.termsOfServiceURL, configuration.termsOfServiceURL) && AbstractC5504s.c(this.privacyURL, configuration.privacyURL) && AbstractC5504s.c(this.colors, configuration.colors) && AbstractC5504s.c(this.colorsByTier, configuration.colorsByTier) && AbstractC5504s.c(this.tiers, configuration.tiers) && AbstractC5504s.c(this.defaultTier, configuration.defaultTier);
        }

        public final boolean getBlurredBackgroundImage() {
            return this.blurredBackgroundImage;
        }

        public final ColorInformation getColors() {
            return this.colors;
        }

        public final Map<String, ColorInformation> getColorsByTier() {
            return this.colorsByTier;
        }

        public final String getDefaultPackage() {
            return this.defaultPackage;
        }

        public final String getDefaultTier() {
            return this.defaultTier;
        }

        public final boolean getDisplayRestorePurchases() {
            return this.displayRestorePurchases;
        }

        public final Images getImages() {
            String header;
            String background;
            String icon;
            Images images = this.imagesWebp;
            String icon2 = null;
            if (images == null || (header = images.getHeader()) == null) {
                Images images2 = this.legacyImages;
                header = images2 != null ? images2.getHeader() : null;
            }
            Images images3 = this.imagesWebp;
            if (images3 == null || (background = images3.getBackground()) == null) {
                Images images4 = this.legacyImages;
                background = images4 != null ? images4.getBackground() : null;
            }
            Images images5 = this.imagesWebp;
            if (images5 == null || (icon = images5.getIcon()) == null) {
                Images images6 = this.legacyImages;
                if (images6 != null) {
                    icon2 = images6.getIcon();
                }
            } else {
                icon2 = icon;
            }
            return new Images(header, background, icon2);
        }

        public final Map<String, Images> getImagesByTier() {
            return this.imagesByTier;
        }

        /* JADX INFO: renamed from: getImagesWebp$purchases_defaultsBc8Release, reason: from getter */
        public final Images getImagesWebp() {
            return this.imagesWebp;
        }

        /* JADX INFO: renamed from: getLegacyImages$purchases_defaultsBc8Release, reason: from getter */
        public final Images getLegacyImages() {
            return this.legacyImages;
        }

        public final List<String> getPackageIds() {
            return this.packageIds;
        }

        public final URL getPrivacyURL() {
            return this.privacyURL;
        }

        public final URL getTermsOfServiceURL() {
            return this.termsOfServiceURL;
        }

        public final List<Tier> getTiers() {
            return this.tiers;
        }

        public int hashCode() {
            int iHashCode = this.packageIds.hashCode() * 31;
            String str = this.defaultPackage;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Images images = this.imagesWebp;
            int iHashCode3 = (iHashCode2 + (images == null ? 0 : images.hashCode())) * 31;
            Images images2 = this.legacyImages;
            int iHashCode4 = (iHashCode3 + (images2 == null ? 0 : images2.hashCode())) * 31;
            Map<String, Images> map = this.imagesByTier;
            int iHashCode5 = (((((iHashCode4 + (map == null ? 0 : map.hashCode())) * 31) + Boolean.hashCode(this.blurredBackgroundImage)) * 31) + Boolean.hashCode(this.displayRestorePurchases)) * 31;
            URL url = this.termsOfServiceURL;
            int iHashCode6 = (iHashCode5 + (url == null ? 0 : url.hashCode())) * 31;
            URL url2 = this.privacyURL;
            int iHashCode7 = (((iHashCode6 + (url2 == null ? 0 : url2.hashCode())) * 31) + this.colors.hashCode()) * 31;
            Map<String, ColorInformation> map2 = this.colorsByTier;
            int iHashCode8 = (iHashCode7 + (map2 == null ? 0 : map2.hashCode())) * 31;
            List<Tier> list = this.tiers;
            int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
            String str2 = this.defaultTier;
            return iHashCode9 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Configuration(packageIds=" + this.packageIds + ", defaultPackage=" + this.defaultPackage + ", imagesWebp=" + this.imagesWebp + ", legacyImages=" + this.legacyImages + ", imagesByTier=" + this.imagesByTier + ", blurredBackgroundImage=" + this.blurredBackgroundImage + ", displayRestorePurchases=" + this.displayRestorePurchases + ", termsOfServiceURL=" + this.termsOfServiceURL + ", privacyURL=" + this.privacyURL + ", colors=" + this.colors + ", colorsByTier=" + this.colorsByTier + ", tiers=" + this.tiers + ", defaultTier=" + this.defaultTier + ')';
        }

        public Configuration(List<String> packageIds, String str, Images images, Images images2, Map<String, Images> map, boolean z10, boolean z11, URL url, URL url2, ColorInformation colors, Map<String, ColorInformation> map2, List<Tier> list, String str2) {
            AbstractC5504s.h(packageIds, "packageIds");
            AbstractC5504s.h(colors, "colors");
            this.packageIds = packageIds;
            this.defaultPackage = str;
            this.imagesWebp = images;
            this.legacyImages = images2;
            this.imagesByTier = map;
            this.blurredBackgroundImage = z10;
            this.displayRestorePurchases = z11;
            this.termsOfServiceURL = url;
            this.privacyURL = url2;
            this.colors = colors;
            this.colorsByTier = map2;
            this.tiers = list;
            this.defaultTier = str2;
        }

        public static /* synthetic */ void getBlurredBackgroundImage$annotations() {
        }

        public static /* synthetic */ void getColorsByTier$annotations() {
        }

        public static /* synthetic */ void getDefaultPackage$annotations() {
        }

        public static /* synthetic */ void getDefaultTier$annotations() {
        }

        public static /* synthetic */ void getDisplayRestorePurchases$annotations() {
        }

        public static /* synthetic */ void getImagesByTier$annotations() {
        }

        public static /* synthetic */ void getImagesWebp$purchases_defaultsBc8Release$annotations() {
        }

        public static /* synthetic */ void getLegacyImages$purchases_defaultsBc8Release$annotations() {
        }

        public static /* synthetic */ void getPackageIds$annotations() {
        }

        public static /* synthetic */ void getPrivacyURL$annotations() {
        }

        public static /* synthetic */ void getTermsOfServiceURL$annotations() {
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Configuration(java.util.List r17, java.lang.String r18, com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images r19, com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images r20, java.util.Map r21, boolean r22, boolean r23, java.net.URL r24, java.net.URL r25, com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation r26, java.util.Map r27, java.util.List r28, java.lang.String r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
            /*
                r16 = this;
                r0 = r30
                r1 = r0 & 1
                if (r1 == 0) goto Lc
                java.util.List r1 = Ud.AbstractC2279u.m()
                r3 = r1
                goto Le
            Lc:
                r3 = r17
            Le:
                r1 = r0 & 2
                r2 = 0
                if (r1 == 0) goto L15
                r4 = r2
                goto L17
            L15:
                r4 = r18
            L17:
                r1 = r0 & 4
                if (r1 == 0) goto L1d
                r5 = r2
                goto L1f
            L1d:
                r5 = r19
            L1f:
                r1 = r0 & 8
                if (r1 == 0) goto L25
                r6 = r2
                goto L27
            L25:
                r6 = r20
            L27:
                r1 = r0 & 16
                if (r1 == 0) goto L2d
                r7 = r2
                goto L2f
            L2d:
                r7 = r21
            L2f:
                r1 = r0 & 32
                if (r1 == 0) goto L36
                r1 = 0
                r8 = r1
                goto L38
            L36:
                r8 = r22
            L38:
                r1 = r0 & 64
                if (r1 == 0) goto L3f
                r1 = 1
                r9 = r1
                goto L41
            L3f:
                r9 = r23
            L41:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L47
                r10 = r2
                goto L49
            L47:
                r10 = r24
            L49:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L4f
                r11 = r2
                goto L51
            L4f:
                r11 = r25
            L51:
                r1 = r0 & 1024(0x400, float:1.435E-42)
                if (r1 == 0) goto L57
                r13 = r2
                goto L59
            L57:
                r13 = r27
            L59:
                r1 = r0 & 2048(0x800, float:2.87E-42)
                if (r1 == 0) goto L5f
                r14 = r2
                goto L61
            L5f:
                r14 = r28
            L61:
                r0 = r0 & 4096(0x1000, float:5.74E-42)
                if (r0 == 0) goto L6b
                r15 = r2
                r12 = r26
                r2 = r16
                goto L71
            L6b:
                r15 = r29
                r2 = r16
                r12 = r26
            L71:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.PaywallData.Configuration.<init>(java.util.List, java.lang.String, com.revenuecat.purchases.paywalls.PaywallData$Configuration$Images, com.revenuecat.purchases.paywalls.PaywallData$Configuration$Images, java.util.Map, boolean, boolean, java.net.URL, java.net.URL, com.revenuecat.purchases.paywalls.PaywallData$Configuration$ColorInformation, java.util.Map, java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public /* synthetic */ Configuration(List list, String str, Images images, Map map, ColorInformation colorInformation, Map map2, List list2, boolean z10, boolean z11, URL url, URL url2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i10 & 2) != 0 ? null : str, images, (i10 & 8) != 0 ? null : map, colorInformation, (i10 & 32) != 0 ? null : map2, (i10 & 64) != 0 ? null : list2, (i10 & 128) != 0 ? false : z10, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? true : z11, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : url, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : url2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(List<String> packageIds, String str, Images images, Map<String, Images> map, ColorInformation colors, Map<String, ColorInformation> map2, List<Tier> list, boolean z10, boolean z11, URL url, URL url2) {
            this(packageIds, str, images, (Images) null, map, z10, z11, url, url2, colors, map2, list, (String) null, 4104, (DefaultConstructorMarker) null);
            AbstractC5504s.h(packageIds, "packageIds");
            AbstractC5504s.h(images, "images");
            AbstractC5504s.h(colors, "colors");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0007\u0018\u0000 @2\u00020\u0001:\u0004A@BCB\u009d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014B¹\u0001\b\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J(\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dHÁ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010%R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010#\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010%R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010#\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010%R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010#\u0012\u0004\b.\u0010(\u001a\u0004\b-\u0010%R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010#\u0012\u0004\b0\u0010(\u001a\u0004\b/\u0010%R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010#\u0012\u0004\b2\u0010(\u001a\u0004\b1\u0010%R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010#\u0012\u0004\b4\u0010(\u001a\u0004\b3\u0010%R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010#\u0012\u0004\b6\u0010(\u001a\u0004\b5\u0010%R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b8\u00109R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010#\u0012\u0004\b;\u0010(\u001a\u0004\b:\u0010%R,\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010<\u0012\u0004\b?\u0010(\u001a\u0004\b=\u0010>¨\u0006D"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "", "", com.amazon.a.a.o.b.f34626S, "subtitle", "callToAction", "callToActionWithIntroOffer", "callToActionWithMultipleIntroOffers", "offerDetails", "offerDetailsWithIntroOffer", "offerDetailsWithMultipleIntroOffers", "offerName", "", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;", "features", "tierName", "", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;", "offerOverrides", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;LUf/d;LTf/e;)V", "write$Self", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getSubtitle$annotations", "()V", "getCallToAction", "getCallToAction$annotations", "getCallToActionWithIntroOffer", "getCallToActionWithIntroOffer$annotations", "getCallToActionWithMultipleIntroOffers", "getCallToActionWithMultipleIntroOffers$annotations", "getOfferDetails", "getOfferDetails$annotations", "getOfferDetailsWithIntroOffer", "getOfferDetailsWithIntroOffer$annotations", "getOfferDetailsWithMultipleIntroOffers", "getOfferDetailsWithMultipleIntroOffers$annotations", "getOfferName", "getOfferName$annotations", "Ljava/util/List;", "getFeatures", "()Ljava/util/List;", "getTierName", "getTierName$annotations", "Ljava/util/Map;", "getOfferOverrides", "()Ljava/util/Map;", "getOfferOverrides$annotations", "Companion", "$serializer", "Feature", "OfferOverride", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LocalizedConfiguration {
        private final String callToAction;
        private final String callToActionWithIntroOffer;
        private final String callToActionWithMultipleIntroOffers;
        private final List<Feature> features;
        private final String offerDetails;
        private final String offerDetailsWithIntroOffer;
        private final String offerDetailsWithMultipleIntroOffers;
        private final String offerName;
        private final Map<String, OfferOverride> offerOverrides;
        private final String subtitle;
        private final String tierName;
        private final String title;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final b[] $childSerializers = {null, null, null, null, null, null, null, null, null, new C2324e(PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE), null, new M(x0.f20253a, PaywallData$LocalizedConfiguration$OfferOverride$$serializer.INSTANCE)};

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b serializer() {
                return PaywallData$LocalizedConfiguration$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0018\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u001a¨\u0006!"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;", "", "", com.amazon.a.a.o.b.f34626S, "content", "iconID", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;LUf/d;LTf/e;)V", "write$Self", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getContent", "getIconID", "getIconID$annotations", "()V", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Feature {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String content;
            private final String iconID;
            private final String title;

            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b serializer() {
                    return PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC2154e
            public /* synthetic */ Feature(int i10, String str, String str2, String str3, t0 t0Var) {
                if (1 != (i10 & 1)) {
                    AbstractC2327f0.a(i10, 1, PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE.getDescriptor());
                }
                this.title = str;
                if ((i10 & 2) == 0) {
                    this.content = null;
                } else {
                    this.content = str2;
                }
                if ((i10 & 4) == 0) {
                    this.iconID = null;
                } else {
                    this.iconID = str3;
                }
            }

            public static /* synthetic */ Feature copy$default(Feature feature, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = feature.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = feature.content;
                }
                if ((i10 & 4) != 0) {
                    str3 = feature.iconID;
                }
                return feature.copy(str, str2, str3);
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Feature self, d output, e serialDesc) {
                output.k(serialDesc, 0, self.title);
                if (output.g(serialDesc, 1) || self.content != null) {
                    output.f(serialDesc, 1, x0.f20253a, self.content);
                }
                if (!output.g(serialDesc, 2) && self.iconID == null) {
                    return;
                }
                output.f(serialDesc, 2, x0.f20253a, self.iconID);
            }

            public final /* synthetic */ Feature copy(String str, String content, String iconID) {
                AbstractC5504s.h(str, "title");
                return new Feature(str, content, iconID);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Feature)) {
                    return false;
                }
                Feature feature = (Feature) obj;
                return AbstractC5504s.c(this.title, feature.title) && AbstractC5504s.c(this.content, feature.content) && AbstractC5504s.c(this.iconID, feature.iconID);
            }

            public final String getContent() {
                return this.content;
            }

            public final String getIconID() {
                return this.iconID;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                String str = this.content;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.iconID;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "Feature(title=" + this.title + ", content=" + this.content + ", iconID=" + this.iconID + ')';
            }

            public Feature(String title, String str, String str2) {
                AbstractC5504s.h(title, "title");
                this.title = title;
                this.content = str;
                this.iconID = str2;
            }

            public /* synthetic */ Feature(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
            }

            public static /* synthetic */ void getIconID$annotations() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 %2\u00020\u0001:\u0002&%B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBW\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0018\u0012\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0018\u0012\u0004\b \u0010\u001c\u001a\u0004\b\u001f\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0018\u0012\u0004\b\"\u0010\u001c\u001a\u0004\b!\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0018\u0012\u0004\b$\u0010\u001c\u001a\u0004\b#\u0010\u001a¨\u0006'"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;", "", "", "offerName", "offerDetails", "offerDetailsWithIntroOffer", "offerDetailsWithMultipleIntroOffers", "offerBadge", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;LUf/d;LTf/e;)V", "write$Self", "Ljava/lang/String;", "getOfferName", "()Ljava/lang/String;", "getOfferName$annotations", "()V", "getOfferDetails", "getOfferDetails$annotations", "getOfferDetailsWithIntroOffer", "getOfferDetailsWithIntroOffer$annotations", "getOfferDetailsWithMultipleIntroOffers", "getOfferDetailsWithMultipleIntroOffers$annotations", "getOfferBadge", "getOfferBadge$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class OfferOverride {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String offerBadge;
            private final String offerDetails;
            private final String offerDetailsWithIntroOffer;
            private final String offerDetailsWithMultipleIntroOffers;
            private final String offerName;

            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b serializer() {
                    return PaywallData$LocalizedConfiguration$OfferOverride$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC2154e
            public /* synthetic */ OfferOverride(int i10, String str, String str2, String str3, String str4, String str5, t0 t0Var) {
                if (3 != (i10 & 3)) {
                    AbstractC2327f0.a(i10, 3, PaywallData$LocalizedConfiguration$OfferOverride$$serializer.INSTANCE.getDescriptor());
                }
                this.offerName = str;
                this.offerDetails = str2;
                if ((i10 & 4) == 0) {
                    this.offerDetailsWithIntroOffer = null;
                } else {
                    this.offerDetailsWithIntroOffer = str3;
                }
                if ((i10 & 8) == 0) {
                    this.offerDetailsWithMultipleIntroOffers = null;
                } else {
                    this.offerDetailsWithMultipleIntroOffers = str4;
                }
                if ((i10 & 16) == 0) {
                    this.offerBadge = null;
                } else {
                    this.offerBadge = str5;
                }
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(OfferOverride self, d output, e serialDesc) {
                output.k(serialDesc, 0, self.offerName);
                output.k(serialDesc, 1, self.offerDetails);
                if (output.g(serialDesc, 2) || self.offerDetailsWithIntroOffer != null) {
                    output.f(serialDesc, 2, EmptyStringToNullSerializer.INSTANCE, self.offerDetailsWithIntroOffer);
                }
                if (output.g(serialDesc, 3) || self.offerDetailsWithMultipleIntroOffers != null) {
                    output.f(serialDesc, 3, EmptyStringToNullSerializer.INSTANCE, self.offerDetailsWithMultipleIntroOffers);
                }
                if (!output.g(serialDesc, 4) && self.offerBadge == null) {
                    return;
                }
                output.f(serialDesc, 4, EmptyStringToNullSerializer.INSTANCE, self.offerBadge);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OfferOverride)) {
                    return false;
                }
                OfferOverride offerOverride = (OfferOverride) obj;
                return AbstractC5504s.c(this.offerName, offerOverride.offerName) && AbstractC5504s.c(this.offerDetails, offerOverride.offerDetails) && AbstractC5504s.c(this.offerDetailsWithIntroOffer, offerOverride.offerDetailsWithIntroOffer) && AbstractC5504s.c(this.offerDetailsWithMultipleIntroOffers, offerOverride.offerDetailsWithMultipleIntroOffers) && AbstractC5504s.c(this.offerBadge, offerOverride.offerBadge);
            }

            public final String getOfferBadge() {
                return this.offerBadge;
            }

            public final String getOfferDetails() {
                return this.offerDetails;
            }

            public final String getOfferDetailsWithIntroOffer() {
                return this.offerDetailsWithIntroOffer;
            }

            public final String getOfferDetailsWithMultipleIntroOffers() {
                return this.offerDetailsWithMultipleIntroOffers;
            }

            public final String getOfferName() {
                return this.offerName;
            }

            public int hashCode() {
                int iHashCode = ((this.offerName.hashCode() * 31) + this.offerDetails.hashCode()) * 31;
                String str = this.offerDetailsWithIntroOffer;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.offerDetailsWithMultipleIntroOffers;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.offerBadge;
                return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "OfferOverride(offerName=" + this.offerName + ", offerDetails=" + this.offerDetails + ", offerDetailsWithIntroOffer=" + this.offerDetailsWithIntroOffer + ", offerDetailsWithMultipleIntroOffers=" + this.offerDetailsWithMultipleIntroOffers + ", offerBadge=" + this.offerBadge + ')';
            }

            public OfferOverride(String offerName, String offerDetails, String str, String str2, String str3) {
                AbstractC5504s.h(offerName, "offerName");
                AbstractC5504s.h(offerDetails, "offerDetails");
                this.offerName = offerName;
                this.offerDetails = offerDetails;
                this.offerDetailsWithIntroOffer = str;
                this.offerDetailsWithMultipleIntroOffers = str2;
                this.offerBadge = str3;
            }

            public /* synthetic */ OfferOverride(String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5);
            }

            public static /* synthetic */ void getOfferBadge$annotations() {
            }

            public static /* synthetic */ void getOfferDetails$annotations() {
            }

            public static /* synthetic */ void getOfferDetailsWithIntroOffer$annotations() {
            }

            public static /* synthetic */ void getOfferDetailsWithMultipleIntroOffers$annotations() {
            }

            public static /* synthetic */ void getOfferName$annotations() {
            }
        }

        @InterfaceC2154e
        public /* synthetic */ LocalizedConfiguration(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, String str10, Map map, t0 t0Var) {
            if (5 != (i10 & 5)) {
                AbstractC2327f0.a(i10, 5, PaywallData$LocalizedConfiguration$$serializer.INSTANCE.getDescriptor());
            }
            this.title = str;
            if ((i10 & 2) == 0) {
                this.subtitle = null;
            } else {
                this.subtitle = str2;
            }
            this.callToAction = str3;
            if ((i10 & 8) == 0) {
                this.callToActionWithIntroOffer = null;
            } else {
                this.callToActionWithIntroOffer = str4;
            }
            if ((i10 & 16) == 0) {
                this.callToActionWithMultipleIntroOffers = null;
            } else {
                this.callToActionWithMultipleIntroOffers = str5;
            }
            if ((i10 & 32) == 0) {
                this.offerDetails = null;
            } else {
                this.offerDetails = str6;
            }
            if ((i10 & 64) == 0) {
                this.offerDetailsWithIntroOffer = null;
            } else {
                this.offerDetailsWithIntroOffer = str7;
            }
            if ((i10 & 128) == 0) {
                this.offerDetailsWithMultipleIntroOffers = null;
            } else {
                this.offerDetailsWithMultipleIntroOffers = str8;
            }
            if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
                this.offerName = null;
            } else {
                this.offerName = str9;
            }
            if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
                this.features = AbstractC2279u.m();
            } else {
                this.features = list;
            }
            if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 0) {
                this.tierName = null;
            } else {
                this.tierName = str10;
            }
            if ((i10 & 2048) == 0) {
                this.offerOverrides = S.i();
            } else {
                this.offerOverrides = map;
            }
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(LocalizedConfiguration self, d output, e serialDesc) {
            b[] bVarArr = $childSerializers;
            output.k(serialDesc, 0, self.title);
            if (output.g(serialDesc, 1) || self.subtitle != null) {
                output.f(serialDesc, 1, EmptyStringToNullSerializer.INSTANCE, self.subtitle);
            }
            output.k(serialDesc, 2, self.callToAction);
            if (output.g(serialDesc, 3) || self.callToActionWithIntroOffer != null) {
                output.f(serialDesc, 3, EmptyStringToNullSerializer.INSTANCE, self.callToActionWithIntroOffer);
            }
            if (output.g(serialDesc, 4) || self.callToActionWithMultipleIntroOffers != null) {
                output.f(serialDesc, 4, EmptyStringToNullSerializer.INSTANCE, self.callToActionWithMultipleIntroOffers);
            }
            if (output.g(serialDesc, 5) || self.offerDetails != null) {
                output.f(serialDesc, 5, EmptyStringToNullSerializer.INSTANCE, self.offerDetails);
            }
            if (output.g(serialDesc, 6) || self.offerDetailsWithIntroOffer != null) {
                output.f(serialDesc, 6, EmptyStringToNullSerializer.INSTANCE, self.offerDetailsWithIntroOffer);
            }
            if (output.g(serialDesc, 7) || self.offerDetailsWithMultipleIntroOffers != null) {
                output.f(serialDesc, 7, EmptyStringToNullSerializer.INSTANCE, self.offerDetailsWithMultipleIntroOffers);
            }
            if (output.g(serialDesc, 8) || self.offerName != null) {
                output.f(serialDesc, 8, EmptyStringToNullSerializer.INSTANCE, self.offerName);
            }
            if (output.g(serialDesc, 9) || !AbstractC5504s.c(self.features, AbstractC2279u.m())) {
                output.m(serialDesc, 9, bVarArr[9], self.features);
            }
            if (output.g(serialDesc, 10) || self.tierName != null) {
                output.f(serialDesc, 10, EmptyStringToNullSerializer.INSTANCE, self.tierName);
            }
            if (!output.g(serialDesc, 11) && AbstractC5504s.c(self.offerOverrides, S.i())) {
                return;
            }
            output.m(serialDesc, 11, bVarArr[11], self.offerOverrides);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocalizedConfiguration)) {
                return false;
            }
            LocalizedConfiguration localizedConfiguration = (LocalizedConfiguration) obj;
            return AbstractC5504s.c(this.title, localizedConfiguration.title) && AbstractC5504s.c(this.subtitle, localizedConfiguration.subtitle) && AbstractC5504s.c(this.callToAction, localizedConfiguration.callToAction) && AbstractC5504s.c(this.callToActionWithIntroOffer, localizedConfiguration.callToActionWithIntroOffer) && AbstractC5504s.c(this.callToActionWithMultipleIntroOffers, localizedConfiguration.callToActionWithMultipleIntroOffers) && AbstractC5504s.c(this.offerDetails, localizedConfiguration.offerDetails) && AbstractC5504s.c(this.offerDetailsWithIntroOffer, localizedConfiguration.offerDetailsWithIntroOffer) && AbstractC5504s.c(this.offerDetailsWithMultipleIntroOffers, localizedConfiguration.offerDetailsWithMultipleIntroOffers) && AbstractC5504s.c(this.offerName, localizedConfiguration.offerName) && AbstractC5504s.c(this.features, localizedConfiguration.features) && AbstractC5504s.c(this.tierName, localizedConfiguration.tierName) && AbstractC5504s.c(this.offerOverrides, localizedConfiguration.offerOverrides);
        }

        public final String getCallToAction() {
            return this.callToAction;
        }

        public final String getCallToActionWithIntroOffer() {
            return this.callToActionWithIntroOffer;
        }

        public final String getCallToActionWithMultipleIntroOffers() {
            return this.callToActionWithMultipleIntroOffers;
        }

        public final List<Feature> getFeatures() {
            return this.features;
        }

        public final String getOfferDetails() {
            return this.offerDetails;
        }

        public final String getOfferDetailsWithIntroOffer() {
            return this.offerDetailsWithIntroOffer;
        }

        public final String getOfferDetailsWithMultipleIntroOffers() {
            return this.offerDetailsWithMultipleIntroOffers;
        }

        public final String getOfferName() {
            return this.offerName;
        }

        public final Map<String, OfferOverride> getOfferOverrides() {
            return this.offerOverrides;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTierName() {
            return this.tierName;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.callToAction.hashCode()) * 31;
            String str2 = this.callToActionWithIntroOffer;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.callToActionWithMultipleIntroOffers;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.offerDetails;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.offerDetailsWithIntroOffer;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.offerDetailsWithMultipleIntroOffers;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.offerName;
            int iHashCode8 = (((iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.features.hashCode()) * 31;
            String str8 = this.tierName;
            return ((iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31) + this.offerOverrides.hashCode();
        }

        public String toString() {
            return "LocalizedConfiguration(title=" + this.title + ", subtitle=" + this.subtitle + ", callToAction=" + this.callToAction + ", callToActionWithIntroOffer=" + this.callToActionWithIntroOffer + ", callToActionWithMultipleIntroOffers=" + this.callToActionWithMultipleIntroOffers + ", offerDetails=" + this.offerDetails + ", offerDetailsWithIntroOffer=" + this.offerDetailsWithIntroOffer + ", offerDetailsWithMultipleIntroOffers=" + this.offerDetailsWithMultipleIntroOffers + ", offerName=" + this.offerName + ", features=" + this.features + ", tierName=" + this.tierName + ", offerOverrides=" + this.offerOverrides + ')';
        }

        public LocalizedConfiguration(String title, String str, String callToAction, String str2, String str3, String str4, String str5, String str6, String str7, List<Feature> features, String str8, Map<String, OfferOverride> offerOverrides) {
            AbstractC5504s.h(title, "title");
            AbstractC5504s.h(callToAction, "callToAction");
            AbstractC5504s.h(features, "features");
            AbstractC5504s.h(offerOverrides, "offerOverrides");
            this.title = title;
            this.subtitle = str;
            this.callToAction = callToAction;
            this.callToActionWithIntroOffer = str2;
            this.callToActionWithMultipleIntroOffers = str3;
            this.offerDetails = str4;
            this.offerDetailsWithIntroOffer = str5;
            this.offerDetailsWithMultipleIntroOffers = str6;
            this.offerName = str7;
            this.features = features;
            this.tierName = str8;
            this.offerOverrides = offerOverrides;
        }

        public static /* synthetic */ void getCallToAction$annotations() {
        }

        public static /* synthetic */ void getCallToActionWithIntroOffer$annotations() {
        }

        public static /* synthetic */ void getCallToActionWithMultipleIntroOffers$annotations() {
        }

        public static /* synthetic */ void getOfferDetails$annotations() {
        }

        public static /* synthetic */ void getOfferDetailsWithIntroOffer$annotations() {
        }

        public static /* synthetic */ void getOfferDetailsWithMultipleIntroOffers$annotations() {
        }

        public static /* synthetic */ void getOfferName$annotations() {
        }

        public static /* synthetic */ void getOfferOverrides$annotations() {
        }

        public static /* synthetic */ void getSubtitle$annotations() {
        }

        public static /* synthetic */ void getTierName$annotations() {
        }

        public /* synthetic */ LocalizedConfiguration(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, String str10, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : str2, str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str9, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? AbstractC2279u.m() : list, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : str10, (i10 & 2048) != 0 ? S.i() : map);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaywallData(String str, String templateName, Configuration config, URL assetBaseURL, int i10, Map<String, LocalizedConfiguration> localization, Map<String, ? extends Map<String, LocalizedConfiguration>> localizationByTier, List<String> zeroDecimalPlaceCountries, String str2) {
        AbstractC5504s.h(templateName, "templateName");
        AbstractC5504s.h(config, "config");
        AbstractC5504s.h(assetBaseURL, "assetBaseURL");
        AbstractC5504s.h(localization, "localization");
        AbstractC5504s.h(localizationByTier, "localizationByTier");
        AbstractC5504s.h(zeroDecimalPlaceCountries, "zeroDecimalPlaceCountries");
        this.id = str;
        this.templateName = templateName;
        this.config = config;
        this.assetBaseURL = assetBaseURL;
        this.revision = i10;
        this.localization = localization;
        this.localizationByTier = localizationByTier;
        this.zeroDecimalPlaceCountries = zeroDecimalPlaceCountries;
        this.defaultLocale = str2;
    }

    public /* synthetic */ PaywallData(String str, String str2, Configuration configuration, URL url, int i10, Map map, Map map2, List list, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, str2, configuration, url, (i11 & 16) != 0 ? 0 : i10, map, (i11 & 64) != 0 ? S.i() : map2, (i11 & 128) != 0 ? AbstractC2279u.m() : list, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str3);
    }

    public static /* synthetic */ void getAssetBaseURL$annotations() {
    }

    public static /* synthetic */ void getDefaultLocale$annotations() {
    }

    public static /* synthetic */ void getLocalization$purchases_defaultsBc8Release$annotations() {
    }

    public static /* synthetic */ void getLocalizationByTier$purchases_defaultsBc8Release$annotations() {
    }

    public static /* synthetic */ void getTemplateName$annotations() {
    }

    public static /* synthetic */ void getZeroDecimalPlaceCountries$annotations() {
    }
}
