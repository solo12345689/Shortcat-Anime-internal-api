package com.revenuecat.purchases.ui.revenuecatui.templates;

import Td.L;
import Y.AbstractC2409g1;
import Y.InterfaceC2425m;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class Template2Kt$Subtitle$1 extends AbstractC5506u implements Function2 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ e $childModifier;
    final /* synthetic */ PaywallState.Loaded.Legacy $state;
    final /* synthetic */ int $textAlign;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Template2Kt$Subtitle$1(PaywallState.Loaded.Legacy legacy, e eVar, int i10, int i11, int i12) {
        super(2);
        this.$state = legacy;
        this.$childModifier = eVar;
        this.$textAlign = i10;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
        return L.f17438a;
    }

    public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
        Template2Kt.m871Subtitle8iNrtrE(this.$state, this.$childModifier, this.$textAlign, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
    }
}
