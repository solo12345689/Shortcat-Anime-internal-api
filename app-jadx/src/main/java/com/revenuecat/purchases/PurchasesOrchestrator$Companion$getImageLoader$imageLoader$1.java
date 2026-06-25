package com.revenuecat.purchases;

import android.content.Context;
import ie.InterfaceC5082a;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import y4.InterfaceC7199a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ly4/a;", "invoke", "()Ly4/a;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PurchasesOrchestrator$Companion$getImageLoader$imageLoader$1 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ String $cacheFolder;
    final /* synthetic */ Context $context;
    final /* synthetic */ long $maxCacheSizeBytes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchasesOrchestrator$Companion$getImageLoader$imageLoader$1(Context context, String str, long j10) {
        super(0);
        this.$context = context;
        this.$cacheFolder = str;
        this.$maxCacheSizeBytes = j10;
    }

    @Override // ie.InterfaceC5082a
    public final InterfaceC7199a invoke() {
        InterfaceC7199a.C0978a c0978a = new InterfaceC7199a.C0978a();
        File cacheDir = this.$context.getCacheDir();
        AbstractC5504s.g(cacheDir, "context.cacheDir");
        return c0978a.b(fe.k.F(cacheDir, this.$cacheFolder)).d(this.$maxCacheSizeBytes).a();
    }
}
