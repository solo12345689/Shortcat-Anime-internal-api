package com.revenuecat.purchases;

import Td.L;
import Td.u;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class CoroutinesExtensionsCommonKt$awaitGetProducts$2$1 extends AbstractC5502p implements Function1 {
    CoroutinesExtensionsCommonKt$awaitGetProducts$2$1(Object obj) {
        super(1, obj, Zd.g.class, "resume", "resume(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends StoreProduct>) obj);
        return L.f17438a;
    }

    public final void invoke(List<? extends StoreProduct> p02) {
        AbstractC5504s.h(p02, "p0");
        ((Zd.e) this.receiver).resumeWith(u.b(p02));
    }
}
