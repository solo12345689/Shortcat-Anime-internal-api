package com.revenuecat.purchases.ui.revenuecatui.helpers;

import Y0.AbstractC2485u;
import android.content.res.AssetManager;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.paywalls.DownloadedFontFamily;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 #2\u00020\u0001:\u0001#J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0005H&¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010!\u001a\u0004\u0018\u00010 H&¢\u0006\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;", "", "", "getApplicationName", "()Ljava/lang/String;", "", "resId", "", "formatArgs", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "name", "type", "getResourceIdentifier", "(Ljava/lang/String;Ljava/lang/String;)I", "resourceId", "LY0/u;", "getXmlFontFamily", "(I)LY0/u;", "", "names", "", "getAssetFontPaths", "(Ljava/util/List;)Ljava/util/Map;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;", "fontInfo", "Lcom/revenuecat/purchases/paywalls/DownloadedFontFamily;", "getCachedFontFamilyOrStartDownload", "(Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;)Lcom/revenuecat/purchases/paywalls/DownloadedFontFamily;", "Landroid/content/res/AssetManager;", "getAssetManager", "()Landroid/content/res/AssetManager;", "Companion", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ResourceProvider {
    public static final String ASSETS_FONTS_DIR = "fonts";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider$Companion;", "", "()V", "ASSETS_FONTS_DIR", "", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String ASSETS_FONTS_DIR = "fonts";

        private Companion() {
        }
    }

    String getApplicationName();

    Map<String, String> getAssetFontPaths(List<String> names);

    AssetManager getAssetManager();

    DownloadedFontFamily getCachedFontFamilyOrStartDownload(UiConfig.AppConfig.FontsConfig.FontInfo.Name fontInfo);

    Locale getLocale();

    int getResourceIdentifier(String name, String type);

    String getString(int resId, Object... formatArgs);

    AbstractC2485u getXmlFontFamily(int resourceId);
}
