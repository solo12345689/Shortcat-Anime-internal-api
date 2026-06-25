package com.revenuecat.purchases.paywalls;

import Df.r;
import Ud.AbstractC2279u;
import Ud.a0;
import android.content.Context;
import app.notifee.core.event.LogEvent;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfoKt;
import com.revenuecat.purchases.utils.Result;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u0004\u0018\u00010\r*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/revenuecat/purchases/paywalls/OfferingFontPreDownloader;", "", "Landroid/content/Context;", "context", "Lcom/revenuecat/purchases/paywalls/FontLoader;", "fontLoader", "<init>", "(Landroid/content/Context;Lcom/revenuecat/purchases/paywalls/FontLoader;)V", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;", LogEvent.LEVEL_INFO, "", "isBundled", "(Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;)Z", "", "name", "type", "", "getResourceIdentifier", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I", "getAssetFontPath", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "Lcom/revenuecat/purchases/Offerings;", "offerings", "LTd/L;", "preDownloadOfferingFontsIfNeeded", "(Lcom/revenuecat/purchases/Offerings;)V", "Landroid/content/Context;", "Lcom/revenuecat/purchases/paywalls/FontLoader;", "assetsFontsDir", "Ljava/lang/String;", "", "genericFonts", "Ljava/util/Set;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OfferingFontPreDownloader {
    private final String assetsFontsDir;
    private final Context context;
    private final FontLoader fontLoader;
    private final Set<String> genericFonts;

    public OfferingFontPreDownloader(Context context, FontLoader fontLoader) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(fontLoader, "fontLoader");
        this.context = context;
        this.fontLoader = fontLoader;
        this.assetsFontsDir = "fonts";
        this.genericFonts = a0.h("sans-serif", "serif", "monospace");
    }

    private final String getAssetFontPath(Context context, String str) throws IOException {
        String str2;
        int i10 = 0;
        if (!r.A(str, ".ttf", false, 2, null)) {
            str = str + ".ttf";
        }
        String[] list = context.getResources().getAssets().list(this.assetsFontsDir);
        if (list != null) {
            int length = list.length;
            while (true) {
                if (i10 >= length) {
                    str2 = null;
                    break;
                }
                str2 = list[i10];
                if (AbstractC5504s.c(str2, str)) {
                    break;
                }
                i10++;
            }
            if (str2 != null) {
                return this.assetsFontsDir + '/' + str2;
            }
        }
        return null;
    }

    private final int getResourceIdentifier(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, context.getPackageName());
    }

    private final boolean isBundled(UiConfig.AppConfig.FontsConfig.FontInfo.Name info) {
        if (info.getValue().length() == 0) {
            return false;
        }
        return (!this.genericFonts.contains(info.getValue()) && getResourceIdentifier(this.context, info.getValue(), "font") == 0 && getAssetFontPath(this.context, info.getValue()) == null) ? false : true;
    }

    public final void preDownloadOfferingFontsIfNeeded(Offerings offerings) {
        Collection collectionM;
        UiConfig uiConfig;
        UiConfig.AppConfig app2;
        Map fonts;
        AbstractC5504s.h(offerings, "offerings");
        Iterator<T> it = offerings.getAll().values().iterator();
        do {
            collectionM = null;
            if (!it.hasNext()) {
                break;
            }
            Offering.PaywallComponents paywallComponents = ((Offering) it.next()).getPaywallComponents();
            if (paywallComponents != null && (uiConfig = paywallComponents.getUiConfig()) != null && (app2 = uiConfig.getApp()) != null && (fonts = app2.getFonts()) != null) {
                collectionM = fonts.values();
            }
        } while (collectionM == null);
        if (collectionM == null) {
            collectionM = AbstractC2279u.m();
        }
        Collection collection = collectionM;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(collection, 10));
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(((UiConfig.AppConfig.FontsConfig) it2.next()).getAndroid());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof UiConfig.AppConfig.FontsConfig.FontInfo.Name) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            UiConfig.AppConfig.FontsConfig.FontInfo.Name name = (UiConfig.AppConfig.FontsConfig.FontInfo.Name) obj2;
            if ((DownloadableFontInfoKt.toDownloadableFontInfo(name) instanceof Result.Success) && !isBundled(name)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList3) {
            UiConfig.AppConfig.FontsConfig.FontInfo.Name name2 = (UiConfig.AppConfig.FontsConfig.FontInfo.Name) obj3;
            try {
                new URL(name2.getUrl());
                arrayList4.add(obj3);
            } catch (MalformedURLException e10) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Malformed URL for font: " + name2.getValue() + ". Skipping download.", e10);
            }
        }
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            this.fontLoader.getCachedFontFamilyOrStartDownload((UiConfig.AppConfig.FontsConfig.FontInfo.Name) it3.next());
        }
    }
}
