package com.revenuecat.purchases.ui.revenuecatui;

import J.h;
import J.i;
import Td.L;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.composables.Fade;
import com.revenuecat.purchases.ui.revenuecatui.composables.PlaceholderDefaults;
import com.revenuecat.purchases.ui.revenuecatui.composables.PlaceholderKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import w.C6884M;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class LoadingPaywallKt$LoadingPaywall$3$1 extends AbstractC5506u implements Function2 {
    final /* synthetic */ PaywallState.Loaded.Legacy $state;
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoadingPaywallKt$LoadingPaywall$3$1(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel) {
        super(2);
        this.$state = legacy;
        this.$viewModel = paywallViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
        return L.f17438a;
    }

    public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
        if ((i10 & 3) == 2 && interfaceC2425m.i()) {
            interfaceC2425m.K();
            return;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1190756256, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.LoadingPaywall.<anonymous>.<anonymous> (LoadingPaywall.kt:101)");
        }
        PaywallState.Loaded.Legacy legacy = this.$state;
        PaywallViewModel paywallViewModel = this.$viewModel;
        e.a aVar = e.f26613a;
        h hVarD = i.d(UIConstant.INSTANCE.m388getDefaultPackageCornerRadiusD9Ej5fM());
        LoadingPaywallConstants loadingPaywallConstants = LoadingPaywallConstants.INSTANCE;
        Template2Kt.Template2(legacy, paywallViewModel, PlaceholderKt.m613placeholderTgFrcIs(aVar, true, loadingPaywallConstants.m377getPlaceholderColor0d7_KjU(), hVarD, new Fade(loadingPaywallConstants.m377getPlaceholderColor0d7_KjU(), PlaceholderDefaults.INSTANCE.getFadeAnimationSpec(), null), null, null, interfaceC2425m, (C6884M.f62376d << 12) | 54, 48), interfaceC2425m, 0, 0);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
