package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import C.K;
import D.InterfaceC1231c;
import Td.L;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.e;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterConstants;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrency;
import ie.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "LD/c;", "", "it", "LTd/L;", "invoke", "(LD/c;ILY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class VirtualCurrencyBalancesScreenKt$InternalVirtualCurrencyBalancesScreen$1$1$invoke$$inlined$itemsIndexed$default$3 extends AbstractC5506u implements p {
    final /* synthetic */ CustomerCenterConfigData.Appearance $appearance$inlined;
    final /* synthetic */ List $items;
    final /* synthetic */ CustomerCenterConfigData.Localization $localization$inlined;
    final /* synthetic */ List $virtualCurrencyBalanceData$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VirtualCurrencyBalancesScreenKt$InternalVirtualCurrencyBalancesScreen$1$1$invoke$$inlined$itemsIndexed$default$3(List list, List list2, CustomerCenterConfigData.Appearance appearance, CustomerCenterConfigData.Localization localization) {
        super(4);
        this.$items = list;
        this.$virtualCurrencyBalanceData$inlined = list2;
        this.$appearance$inlined = appearance;
        this.$localization$inlined = localization;
    }

    @Override // ie.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((InterfaceC1231c) obj, ((Number) obj2).intValue(), (InterfaceC2425m) obj3, ((Number) obj4).intValue());
        return L.f17438a;
    }

    public final void invoke(InterfaceC1231c interfaceC1231c, int i10, InterfaceC2425m interfaceC2425m, int i11) {
        int i12;
        if ((i11 & 6) == 0) {
            i12 = (interfaceC2425m.U(interfaceC1231c) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= interfaceC2425m.c(i10) ? 32 : 16;
        }
        if ((i12 & 147) == 146 && interfaceC2425m.i()) {
            interfaceC2425m.K();
            return;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1091073711, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)");
        }
        VirtualCurrency virtualCurrency = (VirtualCurrency) this.$items.get(i10);
        interfaceC2425m.V(1805699008);
        interfaceC2425m.V(58247682);
        if (i10 > 0) {
            K.a(s.r(e.f26613a, CustomerCenterConstants.Layout.INSTANCE.m656getITEMS_SPACINGD9Ej5fM()), interfaceC2425m, 6);
        }
        interfaceC2425m.O();
        VirtualCurrenciesListViewKt.VirtualCurrencyRow(this.$appearance$inlined, this.$localization$inlined, virtualCurrency, this.$virtualCurrencyBalanceData$inlined.size() == 1 ? ButtonPosition.SINGLE : i10 == 0 ? ButtonPosition.FIRST : i10 == this.$virtualCurrencyBalanceData$inlined.size() - 1 ? ButtonPosition.LAST : ButtonPosition.MIDDLE, null, interfaceC2425m, 0, 16);
        interfaceC2425m.O();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
