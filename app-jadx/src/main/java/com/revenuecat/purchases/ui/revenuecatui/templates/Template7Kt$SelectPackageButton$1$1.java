package com.revenuecat.purchases.ui.revenuecatui.templates;

import R0.A;
import R0.C;
import Td.L;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR0/C;", "LTd/L;", "invoke", "(LR0/C;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class Template7Kt$SelectPackageButton$1$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ boolean $isSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Template7Kt$SelectPackageButton$1$1(boolean z10) {
        super(1);
        this.$isSelected = z10;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C) obj);
        return L.f17438a;
    }

    public final void invoke(C semantics) {
        AbstractC5504s.h(semantics, "$this$semantics");
        A.d0(semantics, this.$isSelected);
    }
}
