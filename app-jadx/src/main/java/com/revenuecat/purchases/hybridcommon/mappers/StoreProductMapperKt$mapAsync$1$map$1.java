package com.revenuecat.purchases.hybridcommon.mappers;

import Gf.O;
import Td.L;
import Td.v;
import Zd.e;
import ae.AbstractC2605b;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@f(c = "com.revenuecat.purchases.hybridcommon.mappers.StoreProductMapperKt$mapAsync$1$map$1", f = "StoreProductMapper.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LGf/O;", "", "", "", "", "<anonymous>", "(LGf/O;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
final class StoreProductMapperKt$mapAsync$1$map$1 extends l implements Function2 {
    final /* synthetic */ List<StoreProduct> $this_mapAsync;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    StoreProductMapperKt$mapAsync$1$map$1(List<? extends StoreProduct> list, e eVar) {
        super(2, eVar);
        this.$this_mapAsync = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final e create(Object obj, e eVar) {
        return new StoreProductMapperKt$mapAsync$1$map$1(this.$this_mapAsync, eVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(O o10, e eVar) {
        return ((StoreProductMapperKt$mapAsync$1$map$1) create(o10, eVar)).invokeSuspend(L.f17438a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AbstractC2605b.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        v.b(obj);
        return StoreProductMapperKt.map((List<? extends StoreProduct>) this.$this_mapAsync);
    }
}
