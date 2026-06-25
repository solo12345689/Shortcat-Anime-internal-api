package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import Td.u;
import Td.v;
import Ud.S;
import android.net.Uri;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJQ\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfigurationFactory;", "", "<init>", "()V", "Lcom/revenuecat/purchases/paywalls/PaywallData;", "", "image", "Landroid/net/Uri;", "getUriFromImage", "(Lcom/revenuecat/purchases/paywalls/PaywallData;Ljava/lang/String;)Landroid/net/Uri;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;", "variableDataProvider", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;", "mode", "paywallData", "", "Lcom/revenuecat/purchases/Package;", "availablePackages", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PaywallTemplate;", "template", "storefrontCountryCode", "LTd/u;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration;", "create-hUnOzRk", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;Lcom/revenuecat/purchases/paywalls/PaywallData;Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PaywallTemplate;Ljava/lang/String;)Ljava/lang/Object;", "create", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TemplateConfigurationFactory {
    public static final int $stable = 0;
    public static final TemplateConfigurationFactory INSTANCE = new TemplateConfigurationFactory();

    private TemplateConfigurationFactory() {
    }

    private final Uri getUriFromImage(PaywallData paywallData, String str) {
        if (str != null) {
            return Uri.parse(paywallData.getAssetBaseURL().toString()).buildUpon().path(str).build();
        }
        return null;
    }

    /* JADX INFO: renamed from: create-hUnOzRk, reason: not valid java name */
    public final Object m793createhUnOzRk(VariableDataProvider variableDataProvider, PaywallMode mode, PaywallData paywallData, List<Package> availablePackages, PaywallTemplate template, String storefrontCountryCode) {
        Map mapI;
        AbstractC5504s.h(variableDataProvider, "variableDataProvider");
        AbstractC5504s.h(mode, "mode");
        AbstractC5504s.h(paywallData, "paywallData");
        AbstractC5504s.h(availablePackages, "availablePackages");
        AbstractC5504s.h(template, "template");
        PaywallData.Configuration.Images images = paywallData.getConfig().getImages();
        TemplateConfiguration.Images images2 = new TemplateConfiguration.Images(getUriFromImage(paywallData, images.getIcon()), getUriFromImage(paywallData, images.getBackground()), getUriFromImage(paywallData, images.getHeader()));
        Map<String, PaywallData.Configuration.Images> imagesByTier = paywallData.getConfig().getImagesByTier();
        if (imagesByTier != null) {
            mapI = new LinkedHashMap(S.e(imagesByTier.size()));
            Iterator<T> it = imagesByTier.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                TemplateConfigurationFactory templateConfigurationFactory = INSTANCE;
                mapI.put(key, new TemplateConfiguration.Images(templateConfigurationFactory.getUriFromImage(paywallData, ((PaywallData.Configuration.Images) entry.getValue()).getIcon()), templateConfigurationFactory.getUriFromImage(paywallData, ((PaywallData.Configuration.Images) entry.getValue()).getBackground()), templateConfigurationFactory.getUriFromImage(paywallData, ((PaywallData.Configuration.Images) entry.getValue()).getHeader())));
            }
        } else {
            mapI = S.i();
        }
        Map map = mapI;
        Object objM760createPackageConfigurationbMdYcbs = PackageConfigurationFactory.INSTANCE.m760createPackageConfigurationbMdYcbs(variableDataProvider, availablePackages, paywallData.getConfig().getPackageIds(), paywallData.getConfig().getDefaultPackage(), template.getConfigurationType(), paywallData, storefrontCountryCode);
        Throwable thE = u.e(objM760createPackageConfigurationbMdYcbs);
        if (thE != null) {
            return u.b(v.a(thE));
        }
        Pair pair = (Pair) objM760createPackageConfigurationbMdYcbs;
        return u.b(new TemplateConfiguration(template, mode, (TemplateConfiguration.PackageConfiguration) pair.getSecond(), paywallData.getConfig(), images2, map, paywallData.getConfig().getColors(), (Locale) pair.getFirst()));
    }
}
