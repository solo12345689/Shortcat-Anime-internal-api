package com.revenuecat.purchases.ui.revenuecatui.templates;

import Td.L;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferDetailsKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import ie.InterfaceC5096o;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import v.InterfaceC6784e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv/e;", "LTd/L;", "invoke", "(Lv/e;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class Template7Kt$AnimatedPackages$1$1 extends AbstractC5506u implements InterfaceC5096o {
    final /* synthetic */ TemplateConfiguration.Colors $colors;
    final /* synthetic */ PaywallState.Loaded.Legacy $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Template7Kt$AnimatedPackages$1$1(PaywallState.Loaded.Legacy legacy, TemplateConfiguration.Colors colors) {
        super(3);
        this.$state = legacy;
        this.$colors = colors;
    }

    @Override // ie.InterfaceC5096o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((InterfaceC6784e) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        return L.f17438a;
    }

    public final void invoke(InterfaceC6784e AnimatedVisibility, InterfaceC2425m interfaceC2425m, int i10) {
        AbstractC5504s.h(AnimatedVisibility, "$this$AnimatedVisibility");
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-136603126, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.AnimatedPackages.<anonymous>.<anonymous> (Template7.kt:463)");
        }
        OfferDetailsKt.OfferDetails(this.$state, this.$colors, interfaceC2425m, 0, 0);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
