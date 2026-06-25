package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Df.r;
import K.InterfaceC1771v;
import Td.L;
import Y.h2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LK/v;", "LTd/L;", "invoke", "(LK/v;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class CreateSupportTicketViewKt$DescriptionInputField$1$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ h2 $currentOnSubmit$delegate;
    final /* synthetic */ DescriptionInputState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateSupportTicketViewKt$DescriptionInputField$1$1(DescriptionInputState descriptionInputState, h2 h2Var) {
        super(1);
        this.$state = descriptionInputState;
        this.$currentOnSubmit$delegate = h2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC1771v) obj);
        return L.f17438a;
    }

    public final void invoke(InterfaceC1771v $receiver) {
        AbstractC5504s.h($receiver, "$this$$receiver");
        if (!this.$state.getShowDone() || r.l0(this.$state.getDescription())) {
            return;
        }
        CreateSupportTicketViewKt.DescriptionInputField$lambda$23(this.$currentOnSubmit$delegate).invoke();
    }
}
