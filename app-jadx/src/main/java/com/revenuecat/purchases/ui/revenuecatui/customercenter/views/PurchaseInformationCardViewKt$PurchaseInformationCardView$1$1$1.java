package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Td.L;
import androidx.compose.ui.e;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/e;", "Lkotlin/Function0;", "LTd/L;", "it", "invoke", "(Landroidx/compose/ui/e;Lie/a;)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PurchaseInformationCardViewKt$PurchaseInformationCardView$1$1$1 extends AbstractC5506u implements Function2 {
    final /* synthetic */ InterfaceC5082a $onCardClick;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseInformationCardViewKt$PurchaseInformationCardView$1$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ InterfaceC5082a $onCardClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC5082a interfaceC5082a) {
            super(0);
            this.$onCardClick = interfaceC5082a;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m748invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m748invoke() {
            InterfaceC5082a interfaceC5082a = this.$onCardClick;
            if (interfaceC5082a != null) {
                interfaceC5082a.invoke();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchaseInformationCardViewKt$PurchaseInformationCardView$1$1$1(InterfaceC5082a interfaceC5082a) {
        super(2);
        this.$onCardClick = interfaceC5082a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final e invoke(e applyIfNotNull, InterfaceC5082a it) {
        AbstractC5504s.h(applyIfNotNull, "$this$applyIfNotNull");
        AbstractC5504s.h(it, "it");
        return androidx.compose.foundation.d.d(applyIfNotNull, false, null, null, new AnonymousClass1(this.$onCardClick), 7, null);
    }
}
