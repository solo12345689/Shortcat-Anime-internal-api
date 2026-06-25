package com.revenuecat.purchases.ui.revenuecatui.composables;

import U0.Y0;
import Y.AbstractC2409g1;
import Y.InterfaceC2425m;
import Y0.L;
import androidx.compose.ui.e;
import g1.C4830j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class IntroEligibilityStateViewKt$IntroEligibilityStateView$2 extends AbstractC5506u implements Function2 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $allowLinks;
    final /* synthetic */ long $color;
    final /* synthetic */ OfferEligibility $eligibility;
    final /* synthetic */ L $fontWeight;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Y0 $style;
    final /* synthetic */ C4830j $textAlign;
    final /* synthetic */ String $textWithIntroOffer;
    final /* synthetic */ String $textWithMultipleIntroOffers;
    final /* synthetic */ String $textWithNoIntroOffer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IntroEligibilityStateViewKt$IntroEligibilityStateView$2(String str, String str2, String str3, OfferEligibility offerEligibility, long j10, Y0 y02, L l10, C4830j c4830j, boolean z10, e eVar, int i10, int i11) {
        super(2);
        this.$textWithNoIntroOffer = str;
        this.$textWithIntroOffer = str2;
        this.$textWithMultipleIntroOffers = str3;
        this.$eligibility = offerEligibility;
        this.$color = j10;
        this.$style = y02;
        this.$fontWeight = l10;
        this.$textAlign = c4830j;
        this.$allowLinks = z10;
        this.$modifier = eVar;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
        return Td.L.f17438a;
    }

    public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
        IntroEligibilityStateViewKt.m585IntroEligibilityStateViewQETHhvg(this.$textWithNoIntroOffer, this.$textWithIntroOffer, this.$textWithMultipleIntroOffers, this.$eligibility, this.$color, this.$style, this.$fontWeight, this.$textAlign, this.$allowLinks, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
    }
}
