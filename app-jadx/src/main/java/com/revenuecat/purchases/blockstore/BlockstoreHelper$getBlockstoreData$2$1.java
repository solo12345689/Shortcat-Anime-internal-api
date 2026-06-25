package com.revenuecat.purchases.blockstore;

import Td.L;
import Td.u;
import Zd.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL8/e;", "kotlin.jvm.PlatformType", "it", "LTd/L;", "invoke", "(LL8/e;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class BlockstoreHelper$getBlockstoreData$2$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ e $cont;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BlockstoreHelper$getBlockstoreData$2$1(e eVar) {
        super(1);
        this.$cont = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((L8.e) obj);
        return L.f17438a;
    }

    public final void invoke(L8.e eVar) {
        e eVar2 = this.$cont;
        u.a aVar = u.f17466b;
        eVar2.resumeWith(u.b(eVar.c()));
    }
}
