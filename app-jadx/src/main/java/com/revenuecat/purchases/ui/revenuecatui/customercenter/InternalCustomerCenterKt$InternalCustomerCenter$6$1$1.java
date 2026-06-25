package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import Td.L;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5502p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class InternalCustomerCenterKt$InternalCustomerCenter$6$1$1 extends AbstractC5502p implements InterfaceC5082a {
    InternalCustomerCenterKt$InternalCustomerCenter$6$1$1(Object obj) {
        super(0, obj, CustomerCenterViewModel.class, "clearActionError", "clearActionError()V", 0);
    }

    @Override // ie.InterfaceC5082a
    public /* bridge */ /* synthetic */ Object invoke() {
        m678invoke();
        return L.f17438a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m678invoke() {
        ((CustomerCenterViewModel) this.receiver).clearActionError();
    }
}
