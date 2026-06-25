package com.revenuecat.purchases.ui.revenuecatui.templates;

import C.InterfaceC1138i;
import Td.L;
import Y.AbstractC2409g1;
import Y.InterfaceC2425m;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class Template3Kt$Features$3 extends AbstractC5506u implements Function2 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ float $spacing;
    final /* synthetic */ PaywallState.Loaded.Legacy $state;
    final /* synthetic */ InterfaceC1138i $this_Features;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Template3Kt$Features$3(InterfaceC1138i interfaceC1138i, PaywallState.Loaded.Legacy legacy, float f10, int i10) {
        super(2);
        this.$this_Features = interfaceC1138i;
        this.$state = legacy;
        this.$spacing = f10;
        this.$$changed = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
        return L.f17438a;
    }

    public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
        Template3Kt.m883FeaturesTDGSqEk(this.$this_Features, this.$state, this.$spacing, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
    }
}
