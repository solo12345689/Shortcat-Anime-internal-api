package com.revenuecat.purchases.paywalls.fonts;

import Df.r;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.utils.Result;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toDownloadableFontInfo", "Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/paywalls/fonts/DownloadableFontInfo;", "", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DownloadableFontInfoKt {
    public static final /* synthetic */ Result toDownloadableFontInfo(UiConfig.AppConfig.FontsConfig.FontInfo.Name name) {
        AbstractC5504s.h(name, "<this>");
        String url = name.getUrl();
        if (url == null || r.l0(url)) {
            return new Result.Error("Font URL is empty for " + name.getValue() + ". Cannot download font. Please try to re-upload your font in the RevenueCat dashboard.");
        }
        String hash = name.getHash();
        if (hash == null || r.l0(hash)) {
            return new Result.Error("Font hash is empty for " + name.getValue() + ". Cannot validate downloaded font. Please try to re-upload your font in the RevenueCat dashboard.");
        }
        String family = name.getFamily();
        if (family == null || r.l0(family)) {
            return new Result.Error("Font family is empty for " + name.getValue() + ". Cannot download font. Please try to re-upload your font in the RevenueCat dashboard.");
        }
        if (name.getWeight() == null) {
            return new Result.Error("Font weight is null for " + name.getValue() + ". Cannot download font. Please try to re-upload your font in the RevenueCat dashboard.");
        }
        if (name.getStyle() != null) {
            return new Result.Success(new DownloadableFontInfo(name.getUrl(), name.getHash(), name.getFamily(), name.getWeight().intValue(), name.getStyle()));
        }
        return new Result.Error("Font style is null for " + name.getValue() + ". Cannot download font. Please try to re-upload your font in the RevenueCat dashboard.");
    }
}
