package com.revenuecat.purchases.paywalls.components.common;

import Rf.b;
import Td.InterfaceC2154e;
import Tf.e;
import Ud.AbstractC2279u;
import Uf.d;
import Vf.AbstractC2327f0;
import Vf.M;
import Vf.t0;
import Vf.x0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.utils.serializers.GoogleListSerializer;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\b\u0007\u0018\u0000 I2\u00020\u0001:\u0002JIB\u0085\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u001e\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t0\t\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B«\u0001\b\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\"\b\u0001\u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0010\b\u0001\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0017\u0010\u001cJ(\u0010%\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 HÁ\u0001¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010(R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b/\u0010+\u001a\u0004\b-\u0010.R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b3\u0010+\u001a\u0004\b1\u00102R8\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00104\u0012\u0004\b7\u0010+\u001a\u0004\b5\u00106R&\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000e\u0010&\u0012\u0004\b9\u0010+\u001a\u0004\b8\u0010(R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\b;\u0010<R&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010=\u0012\u0004\b@\u0010+\u001a\u0004\b>\u0010?R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010A\u0012\u0004\bD\u0010+\u001a\u0004\bB\u0010CR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010E\u0012\u0004\bH\u0010+\u001a\u0004\bF\u0010G\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006K"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;", "", "", DiagnosticsEntry.ID_KEY, "templateName", "Ljava/net/URL;", "assetBaseURL", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentsConfig;", "componentsConfig", "", "Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "componentsLocalizations", "defaultLocaleIdentifier", "", "revision", "", "zeroDecimalPlaceCountries", "Lcom/revenuecat/purchases/paywalls/components/common/ExitOffers;", "exitOffers", "Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;", "productChangeConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;Lcom/revenuecat/purchases/paywalls/components/common/ComponentsConfig;Ljava/util/Map;Ljava/lang/String;ILjava/util/List;Lcom/revenuecat/purchases/paywalls/components/common/ExitOffers;Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/net/URL;Lcom/revenuecat/purchases/paywalls/components/common/ComponentsConfig;Ljava/util/Map;Ljava/lang/String;ILjava/util/List;Lcom/revenuecat/purchases/paywalls/components/common/ExitOffers;Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;LVf/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;LUf/d;LTf/e;)V", "write$Self", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTemplateName", "getTemplateName$annotations", "()V", "Ljava/net/URL;", "getAssetBaseURL", "()Ljava/net/URL;", "getAssetBaseURL$annotations", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentsConfig;", "getComponentsConfig", "()Lcom/revenuecat/purchases/paywalls/components/common/ComponentsConfig;", "getComponentsConfig$annotations", "Ljava/util/Map;", "getComponentsLocalizations", "()Ljava/util/Map;", "getComponentsLocalizations$annotations", "getDefaultLocaleIdentifier-uqtKvyA", "getDefaultLocaleIdentifier-uqtKvyA$annotations", "I", "getRevision", "()I", "Ljava/util/List;", "getZeroDecimalPlaceCountries", "()Ljava/util/List;", "getZeroDecimalPlaceCountries$annotations", "Lcom/revenuecat/purchases/paywalls/components/common/ExitOffers;", "getExitOffers", "()Lcom/revenuecat/purchases/paywalls/components/common/ExitOffers;", "getExitOffers$annotations", "Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;", "getProductChangeConfig", "()Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;", "getProductChangeConfig$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallComponentsData {
    private final URL assetBaseURL;
    private final ComponentsConfig componentsConfig;
    private final Map<LocaleId, Map<LocalizationKey, LocalizationData>> componentsLocalizations;
    private final String defaultLocaleIdentifier;
    private final ExitOffers exitOffers;
    private final String id;
    private final ProductChangeConfig productChangeConfig;
    private final int revision;
    private final String templateName;
    private final List<String> zeroDecimalPlaceCountries;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final b[] $childSerializers = {null, null, null, null, new M(LocaleId$$serializer.INSTANCE, new M(LocalizationKey$$serializer.INSTANCE, LocalizationDataSerializer.INSTANCE)), null, null, null, null, null};

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b serializer() {
            return PaywallComponentsData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC2154e
    public /* synthetic */ PaywallComponentsData(int i10, String str, String str2, URL url, ComponentsConfig componentsConfig, Map map, String str3, int i11, List list, ExitOffers exitOffers, ProductChangeConfig productChangeConfig, t0 t0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, str2, url, componentsConfig, (Map<LocaleId, ? extends Map<LocalizationKey, ? extends LocalizationData>>) map, str3, i11, (List<String>) list, exitOffers, productChangeConfig, t0Var);
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PaywallComponentsData self, d output, e serialDesc) {
        b[] bVarArr = $childSerializers;
        if (output.g(serialDesc, 0) || self.id != null) {
            output.f(serialDesc, 0, x0.f20253a, self.id);
        }
        output.k(serialDesc, 1, self.templateName);
        output.m(serialDesc, 2, URLSerializer.INSTANCE, self.assetBaseURL);
        output.m(serialDesc, 3, ComponentsConfig$$serializer.INSTANCE, self.componentsConfig);
        output.m(serialDesc, 4, bVarArr[4], self.componentsLocalizations);
        output.m(serialDesc, 5, LocaleId$$serializer.INSTANCE, LocaleId.m307boximpl(self.defaultLocaleIdentifier));
        if (output.g(serialDesc, 6) || self.revision != 0) {
            output.p(serialDesc, 6, self.revision);
        }
        if (output.g(serialDesc, 7) || !AbstractC5504s.c(self.zeroDecimalPlaceCountries, AbstractC2279u.m())) {
            output.m(serialDesc, 7, GoogleListSerializer.INSTANCE, self.zeroDecimalPlaceCountries);
        }
        if (output.g(serialDesc, 8) || self.exitOffers != null) {
            output.f(serialDesc, 8, ExitOffers$$serializer.INSTANCE, self.exitOffers);
        }
        if (!output.g(serialDesc, 9) && self.productChangeConfig == null) {
            return;
        }
        output.f(serialDesc, 9, ProductChangeConfigSerializer.INSTANCE, self.productChangeConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallComponentsData)) {
            return false;
        }
        PaywallComponentsData paywallComponentsData = (PaywallComponentsData) obj;
        return AbstractC5504s.c(this.id, paywallComponentsData.id) && AbstractC5504s.c(this.templateName, paywallComponentsData.templateName) && AbstractC5504s.c(this.assetBaseURL, paywallComponentsData.assetBaseURL) && AbstractC5504s.c(this.componentsConfig, paywallComponentsData.componentsConfig) && AbstractC5504s.c(this.componentsLocalizations, paywallComponentsData.componentsLocalizations) && LocaleId.m310equalsimpl0(this.defaultLocaleIdentifier, paywallComponentsData.defaultLocaleIdentifier) && this.revision == paywallComponentsData.revision && AbstractC5504s.c(this.zeroDecimalPlaceCountries, paywallComponentsData.zeroDecimalPlaceCountries) && AbstractC5504s.c(this.exitOffers, paywallComponentsData.exitOffers) && AbstractC5504s.c(this.productChangeConfig, paywallComponentsData.productChangeConfig);
    }

    public final /* synthetic */ URL getAssetBaseURL() {
        return this.assetBaseURL;
    }

    public final /* synthetic */ ComponentsConfig getComponentsConfig() {
        return this.componentsConfig;
    }

    public final /* synthetic */ Map getComponentsLocalizations() {
        return this.componentsLocalizations;
    }

    /* JADX INFO: renamed from: getDefaultLocaleIdentifier-uqtKvyA, reason: from getter */
    public final /* synthetic */ String getDefaultLocaleIdentifier() {
        return this.defaultLocaleIdentifier;
    }

    public final /* synthetic */ ExitOffers getExitOffers() {
        return this.exitOffers;
    }

    public final /* synthetic */ String getId() {
        return this.id;
    }

    public final /* synthetic */ ProductChangeConfig getProductChangeConfig() {
        return this.productChangeConfig;
    }

    public final /* synthetic */ int getRevision() {
        return this.revision;
    }

    public final /* synthetic */ String getTemplateName() {
        return this.templateName;
    }

    public final /* synthetic */ List getZeroDecimalPlaceCountries() {
        return this.zeroDecimalPlaceCountries;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.templateName.hashCode()) * 31) + this.assetBaseURL.hashCode()) * 31) + this.componentsConfig.hashCode()) * 31) + this.componentsLocalizations.hashCode()) * 31) + LocaleId.m311hashCodeimpl(this.defaultLocaleIdentifier)) * 31) + this.revision) * 31) + this.zeroDecimalPlaceCountries.hashCode()) * 31;
        ExitOffers exitOffers = this.exitOffers;
        int iHashCode2 = (iHashCode + (exitOffers == null ? 0 : exitOffers.hashCode())) * 31;
        ProductChangeConfig productChangeConfig = this.productChangeConfig;
        return iHashCode2 + (productChangeConfig != null ? productChangeConfig.hashCode() : 0);
    }

    public String toString() {
        return "PaywallComponentsData(id=" + this.id + ", templateName=" + this.templateName + ", assetBaseURL=" + this.assetBaseURL + ", componentsConfig=" + this.componentsConfig + ", componentsLocalizations=" + this.componentsLocalizations + ", defaultLocaleIdentifier=" + ((Object) LocaleId.m312toStringimpl(this.defaultLocaleIdentifier)) + ", revision=" + this.revision + ", zeroDecimalPlaceCountries=" + this.zeroDecimalPlaceCountries + ", exitOffers=" + this.exitOffers + ", productChangeConfig=" + this.productChangeConfig + ')';
    }

    public /* synthetic */ PaywallComponentsData(String str, String str2, URL url, ComponentsConfig componentsConfig, Map map, String str3, int i10, List list, ExitOffers exitOffers, ProductChangeConfig productChangeConfig, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, url, componentsConfig, map, str3, i10, list, exitOffers, productChangeConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private PaywallComponentsData(int i10, String str, String str2, URL url, ComponentsConfig componentsConfig, Map<LocaleId, ? extends Map<LocalizationKey, ? extends LocalizationData>> map, String str3, int i11, List<String> list, ExitOffers exitOffers, ProductChangeConfig productChangeConfig, t0 t0Var) {
        if (62 != (i10 & 62)) {
            AbstractC2327f0.a(i10, 62, PaywallComponentsData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        this.templateName = str2;
        this.assetBaseURL = url;
        this.componentsConfig = componentsConfig;
        this.componentsLocalizations = map;
        this.defaultLocaleIdentifier = str3;
        if ((i10 & 64) == 0) {
            this.revision = 0;
        } else {
            this.revision = i11;
        }
        if ((i10 & 128) == 0) {
            this.zeroDecimalPlaceCountries = AbstractC2279u.m();
        } else {
            this.zeroDecimalPlaceCountries = list;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.exitOffers = null;
        } else {
            this.exitOffers = exitOffers;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
            this.productChangeConfig = null;
        } else {
            this.productChangeConfig = productChangeConfig;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private PaywallComponentsData(String str, String templateName, URL assetBaseURL, ComponentsConfig componentsConfig, Map<LocaleId, ? extends Map<LocalizationKey, ? extends LocalizationData>> componentsLocalizations, String defaultLocaleIdentifier, int i10, List<String> zeroDecimalPlaceCountries, ExitOffers exitOffers, ProductChangeConfig productChangeConfig) {
        AbstractC5504s.h(templateName, "templateName");
        AbstractC5504s.h(assetBaseURL, "assetBaseURL");
        AbstractC5504s.h(componentsConfig, "componentsConfig");
        AbstractC5504s.h(componentsLocalizations, "componentsLocalizations");
        AbstractC5504s.h(defaultLocaleIdentifier, "defaultLocaleIdentifier");
        AbstractC5504s.h(zeroDecimalPlaceCountries, "zeroDecimalPlaceCountries");
        this.id = str;
        this.templateName = templateName;
        this.assetBaseURL = assetBaseURL;
        this.componentsConfig = componentsConfig;
        this.componentsLocalizations = componentsLocalizations;
        this.defaultLocaleIdentifier = defaultLocaleIdentifier;
        this.revision = i10;
        this.zeroDecimalPlaceCountries = zeroDecimalPlaceCountries;
        this.exitOffers = exitOffers;
        this.productChangeConfig = productChangeConfig;
    }

    public /* synthetic */ PaywallComponentsData(String str, String str2, URL url, ComponentsConfig componentsConfig, Map map, String str3, int i10, List list, ExitOffers exitOffers, ProductChangeConfig productChangeConfig, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, str2, url, componentsConfig, map, str3, (i11 & 64) != 0 ? 0 : i10, (i11 & 128) != 0 ? AbstractC2279u.m() : list, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : exitOffers, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : productChangeConfig, null);
    }

    public static /* synthetic */ void getAssetBaseURL$annotations() {
    }

    public static /* synthetic */ void getComponentsConfig$annotations() {
    }

    public static /* synthetic */ void getComponentsLocalizations$annotations() {
    }

    /* JADX INFO: renamed from: getDefaultLocaleIdentifier-uqtKvyA$annotations */
    public static /* synthetic */ void m352getDefaultLocaleIdentifieruqtKvyA$annotations() {
    }

    public static /* synthetic */ void getExitOffers$annotations() {
    }

    public static /* synthetic */ void getProductChangeConfig$annotations() {
    }

    public static /* synthetic */ void getTemplateName$annotations() {
    }

    public static /* synthetic */ void getZeroDecimalPlaceCountries$annotations() {
    }
}
