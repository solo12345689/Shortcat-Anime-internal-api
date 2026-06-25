package com.revenuecat.purchases.ui.revenuecatui.composables;

import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import p0.AbstractC5907b;
import p0.C5908c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/e;", "invoke", "(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PaywallBackgroundKt$PaywallBackground$modifier$1 extends AbstractC5506u implements Function1 {
    public static final PaywallBackgroundKt$PaywallBackground$modifier$1 INSTANCE = new PaywallBackgroundKt$PaywallBackground$modifier$1();

    PaywallBackgroundKt$PaywallBackground$modifier$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final e invoke(e conditional) {
        AbstractC5504s.h(conditional, "$this$conditional");
        return AbstractC5907b.b(conditional, BackgroundUIConstants.INSTANCE.m565getBlurSizeD9Ej5fM(), C5908c.f55675b.b());
    }
}
