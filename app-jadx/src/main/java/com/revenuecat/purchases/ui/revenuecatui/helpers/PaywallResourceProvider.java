package com.revenuecat.purchases.ui.revenuecatui.helpers;

import Y0.AbstractC2485u;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.paywalls.DownloadedFontFamily;
import com.revenuecat.purchases.ui.revenuecatui.utils.FontFamilyXmlParser;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b(\u0010)J\u0011\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010-R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010.¨\u0006/"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallResourceProvider;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;", "", "applicationName", "packageName", "Landroid/content/res/Resources;", "resources", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/content/res/Resources;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "getApplicationName", "()Ljava/lang/String;", "", "resId", "", "", "formatArgs", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "name", "type", "getResourceIdentifier", "(Ljava/lang/String;Ljava/lang/String;)I", "resourceId", "LY0/u;", "getXmlFontFamily", "(I)LY0/u;", "", "names", "", "getAssetFontPaths", "(Ljava/util/List;)Ljava/util/Map;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;", "fontInfo", "Lcom/revenuecat/purchases/paywalls/DownloadedFontFamily;", "getCachedFontFamilyOrStartDownload", "(Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;)Lcom/revenuecat/purchases/paywalls/DownloadedFontFamily;", "Landroid/content/res/AssetManager;", "getAssetManager", "()Landroid/content/res/AssetManager;", "Ljava/lang/String;", "Landroid/content/res/Resources;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallResourceProvider implements ResourceProvider {
    public static final int $stable = 8;
    private final String applicationName;
    private final String packageName;
    private final Resources resources;

    public PaywallResourceProvider(String applicationName, String packageName, Resources resources) {
        AbstractC5504s.h(applicationName, "applicationName");
        AbstractC5504s.h(packageName, "packageName");
        AbstractC5504s.h(resources, "resources");
        this.applicationName = applicationName;
        this.packageName = packageName;
        this.resources = resources;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider
    public String getApplicationName() {
        return this.applicationName;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    @Override // com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map<java.lang.String, java.lang.String> getAssetFontPaths(java.util.List<java.lang.String> r10) throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = "names"
            kotlin.jvm.internal.AbstractC5504s.h(r10, r0)
            android.content.res.Resources r0 = r9.resources
            android.content.res.AssetManager r0 = r0.getAssets()
            java.lang.String r1 = "fonts"
            java.lang.String[] r0 = r0.list(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r10 = r10.iterator()
        L1a:
            boolean r2 = r10.hasNext()
            r3 = 0
            if (r2 == 0) goto L75
            java.lang.Object r2 = r10.next()
            java.lang.String r2 = (java.lang.String) r2
            r4 = 2
            java.lang.String r5 = ".ttf"
            r6 = 0
            boolean r4 = Df.r.A(r2, r5, r6, r4, r3)
            if (r4 == 0) goto L33
            r4 = r2
            goto L42
        L33:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
        L42:
            if (r0 == 0) goto L68
            int r5 = r0.length
        L45:
            if (r6 >= r5) goto L53
            r7 = r0[r6]
            boolean r8 = kotlin.jvm.internal.AbstractC5504s.c(r7, r4)
            if (r8 == 0) goto L50
            goto L54
        L50:
            int r6 = r6 + 1
            goto L45
        L53:
            r7 = r3
        L54:
            if (r7 == 0) goto L68
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "fonts/"
            r4.append(r5)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            goto L69
        L68:
            r4 = r3
        L69:
            if (r4 == 0) goto L6f
            kotlin.Pair r3 = Td.z.a(r2, r4)
        L6f:
            if (r3 == 0) goto L1a
            r1.add(r3)
            goto L1a
        L75:
            java.util.Map r10 = Ud.S.w(r1)
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L80
            return r10
        L80:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallResourceProvider.getAssetFontPaths(java.util.List):java.util.Map");
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider
    /* JADX INFO: renamed from: getAssetManager */
    public AssetManager getMockAssetManager() {
        return this.resources.getAssets();
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider
    public DownloadedFontFamily getCachedFontFamilyOrStartDownload(UiConfig.AppConfig.FontsConfig.FontInfo.Name fontInfo) {
        AbstractC5504s.h(fontInfo, "fontInfo");
        Purchases.Companion companion = Purchases.INSTANCE;
        if (companion.isConfigured()) {
            return companion.getSharedInstance().getCachedFontFamilyOrStartDownload(fontInfo);
        }
        Logger.INSTANCE.e("getCachedFontFileOrStartDownload called before Purchases is configured. Returning null.");
        return null;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider
    public Locale getLocale() {
        Locale locale = this.resources.getConfiguration().getLocales().get(0);
        AbstractC5504s.g(locale, "resources.configuration.locales.get(0)");
        return locale;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider
    public int getResourceIdentifier(String name, String type) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(type, "type");
        return this.resources.getIdentifier(name, type, this.packageName);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider
    public String getString(int resId, Object... formatArgs) {
        AbstractC5504s.h(formatArgs, "formatArgs");
        String string = this.resources.getString(resId, Arrays.copyOf(formatArgs, formatArgs.length));
        AbstractC5504s.g(string, "resources.getString(resId, *formatArgs)");
        return string;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider
    public AbstractC2485u getXmlFontFamily(int resourceId) {
        try {
            XmlResourceParser xml = this.resources.getXml(resourceId);
            AbstractC5504s.g(xml, "try {\n            resour…    return null\n        }");
            try {
                AbstractC2485u abstractC2485u = FontFamilyXmlParser.INSTANCE.parse(xml);
                xml.close();
                return abstractC2485u;
            } catch (Throwable th2) {
                try {
                    Object resourceEntryNameOrNull = PaywallResourceProviderKt.getResourceEntryNameOrNull(this.resources, resourceId);
                    Logger logger = Logger.INSTANCE;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error parsing XML font family with resource ID ");
                    if (resourceEntryNameOrNull == null) {
                        resourceEntryNameOrNull = Integer.valueOf(resourceId);
                    }
                    sb2.append(resourceEntryNameOrNull);
                    logger.e(sb2.toString(), th2);
                    xml.close();
                    return null;
                } catch (Throwable th3) {
                    xml.close();
                    throw th3;
                }
            }
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PaywallResourceProvider(Context context) {
        AbstractC5504s.h(context, "context");
        Context applicationContext = context.getApplicationContext();
        AbstractC5504s.g(applicationContext, "context.applicationContext");
        String strApplicationName = PaywallResourceProviderKt.applicationName(applicationContext);
        String packageName = context.getPackageName();
        AbstractC5504s.g(packageName, "context.packageName");
        Resources resources = context.getResources();
        AbstractC5504s.g(resources, "context.resources");
        this(strApplicationName, packageName, resources);
    }
}
