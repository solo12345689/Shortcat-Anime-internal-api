package com.revenuecat.purchases.ui.revenuecatui.extensions;

import android.content.Context;
import com.revenuecat.purchases.Purchases;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import v4.InterfaceC6845d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/Purchases$Companion;", "Landroid/content/Context;", "context", "Lv4/d;", "getImageLoaderTyped", "(Lcom/revenuecat/purchases/Purchases$Companion;Landroid/content/Context;)Lv4/d;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PurchasesExtensionsKt {
    public static final InterfaceC6845d getImageLoaderTyped(Purchases.Companion companion, Context context) {
        AbstractC5504s.h(companion, "<this>");
        AbstractC5504s.h(context, "context");
        Object imageLoader = Purchases.INSTANCE.getImageLoader(context);
        AbstractC5504s.f(imageLoader, "null cannot be cast to non-null type coil.ImageLoader");
        return (InterfaceC6845d) imageLoader;
    }
}
