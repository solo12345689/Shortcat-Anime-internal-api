package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import androidx.compose.animation.d;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.navigation.CustomerCenterAnimations;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.navigation.CustomerCenterDestination;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import v.j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/d;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination;", "Lv/j;", "invoke", "(Landroidx/compose/animation/d;)Lv/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class InternalCustomerCenterKt$CustomerCenterNavHost$1$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ CustomerCenterState.Success $customerCenterState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalCustomerCenterKt$CustomerCenterNavHost$1$1(CustomerCenterState.Success success) {
        super(1);
        this.$customerCenterState = success;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j invoke(d AnimatedContent) {
        AbstractC5504s.h(AnimatedContent, "$this$AnimatedContent");
        return CustomerCenterAnimations.INSTANCE.getTransitionForNavigation((CustomerCenterDestination) AnimatedContent.b(), (CustomerCenterDestination) AnimatedContent.a(), this.$customerCenterState.getNavigationState());
    }
}
