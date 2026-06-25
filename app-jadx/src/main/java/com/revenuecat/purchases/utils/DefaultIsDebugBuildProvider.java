package com.revenuecat.purchases.utils;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/utils/DefaultIsDebugBuildProvider;", "Lcom/revenuecat/purchases/utils/IsDebugBuildProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "invoke", "", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DefaultIsDebugBuildProvider implements IsDebugBuildProvider {
    private final Context context;

    public DefaultIsDebugBuildProvider(Context context) {
        AbstractC5504s.h(context, "context");
        Context applicationContext = context.getApplicationContext();
        AbstractC5504s.g(applicationContext, "context.applicationContext");
        this.context = applicationContext;
    }

    @Override // com.revenuecat.purchases.utils.IsDebugBuildProvider
    public boolean invoke() {
        return (this.context.getApplicationInfo().flags & 2) != 0;
    }
}
