package com.revenuecat.purchases.ui.revenuecatui.helpers;

import Td.L;
import Td.u;
import Zd.e;
import Zd.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5502p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class HelperFunctionsKt$shouldDisplayPaywall$2$1 extends AbstractC5502p implements Function1 {
    HelperFunctionsKt$shouldDisplayPaywall$2$1(Object obj) {
        super(1, obj, g.class, "resume", "resume(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return L.f17438a;
    }

    public final void invoke(boolean z10) {
        ((e) this.receiver).resumeWith(u.b(Boolean.valueOf(z10)));
    }
}
