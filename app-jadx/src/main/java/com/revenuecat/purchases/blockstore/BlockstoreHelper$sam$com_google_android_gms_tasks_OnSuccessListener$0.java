package com.revenuecat.purchases.blockstore;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import n9.InterfaceC5762f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class BlockstoreHelper$sam$com_google_android_gms_tasks_OnSuccessListener$0 implements InterfaceC5762f {
    private final /* synthetic */ Function1 function;

    BlockstoreHelper$sam$com_google_android_gms_tasks_OnSuccessListener$0(Function1 function) {
        AbstractC5504s.h(function, "function");
        this.function = function;
    }

    @Override // n9.InterfaceC5762f
    public final /* synthetic */ void onSuccess(Object obj) {
        this.function.invoke(obj);
    }
}
