package com.revenuecat.purchases.hybridcommon;

import Td.L;
import com.revenuecat.purchases.hybridcommon.mappers.StoreProductMapperKt;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "it", "LTd/L;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class CommonKt$getProductInfo$onReceived$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ OnResultList $onResult;

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getProductInfo$onReceived$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "", "", "list", "LTd/L;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        final /* synthetic */ OnResultList $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(OnResultList onResultList) {
            super(1);
            this.$onResult = onResultList;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<? extends Map<String, ? extends Object>>) obj);
            return L.f17438a;
        }

        public final void invoke(List<? extends Map<String, ? extends Object>> list) {
            AbstractC5504s.h(list, "list");
            this.$onResult.onReceived(list);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonKt$getProductInfo$onReceived$1(OnResultList onResultList) {
        super(1);
        this.$onResult = onResultList;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends StoreProduct>) obj);
        return L.f17438a;
    }

    public final void invoke(List<? extends StoreProduct> it) {
        AbstractC5504s.h(it, "it");
        StoreProductMapperKt.mapAsync(it, new AnonymousClass1(this.$onResult));
    }
}
