package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Td.L;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import Y.h2;
import androidx.compose.ui.e;
import androidx.lifecycle.InterfaceC2854h;
import androidx.lifecycle.U;
import androidx.lifecycle.Y;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.theme.CustomerCenterPreviewThemeKt;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.VirtualCurrencyBalancesScreenViewModel;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.VirtualCurrencyBalancesScreenViewModelFactory;
import com.revenuecat.purchases.ui.revenuecatui.data.PurchasesImpl;
import com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.O;
import m2.AbstractC5628a;
import n2.AbstractC5719d;
import n2.C5717b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\u001a1\u0010\r\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0015\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u000f\u0010\u0017\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u000f\u0010\u0018\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u000f\u0010\u0019\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0019\u0010\u0016\u001a\u000f\u0010\u001a\u001a\u00020\bH\u0001¢\u0006\u0004\b\u001a\u0010\u0016¨\u0006\u001b²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;", "appearance", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;", "localization", "Landroidx/compose/ui/e;", "modifier", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/VirtualCurrencyBalancesScreenViewModel;", "viewModel", "LTd/L;", "VirtualCurrencyBalancesScreen", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/VirtualCurrencyBalancesScreenViewModel;LY/m;II)V", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrencyBalancesScreenViewState;", "viewState", "InternalVirtualCurrencyBalancesScreen", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrencyBalancesScreenViewState;Landroidx/compose/ui/e;LY/m;II)V", "EmptyStateView", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Landroidx/compose/ui/e;LY/m;II)V", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;", "purchases", "getVirtualCurrencyBalancesScreenViewModel", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/VirtualCurrencyBalancesScreenViewModel;LY/m;II)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/VirtualCurrencyBalancesScreenViewModel;", "VirtualCurrencyBalancesScreenLoaded0VCsPreview", "(LY/m;I)V", "VirtualCurrencyBalancesScreenLoaded4VCsPreview", "VirtualCurrencyBalancesScreenLoadedVCsPreview", "VirtualCurrencyBalancesScreenLoadingPreview", "VirtualCurrencyBalancesScreenErrorPreview", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class VirtualCurrencyBalancesScreenKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenKt$EmptyStateView$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ e $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(CustomerCenterConfigData.Localization localization, e eVar, int i10, int i11) {
            super(2);
            this.$localization = localization;
            this.$modifier = eVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            VirtualCurrencyBalancesScreenKt.EmptyStateView(this.$localization, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenKt$InternalVirtualCurrencyBalancesScreen$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44162 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CustomerCenterConfigData.Appearance $appearance;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ e $modifier;
        final /* synthetic */ VirtualCurrencyBalancesScreenViewState $viewState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44162(CustomerCenterConfigData.Appearance appearance, CustomerCenterConfigData.Localization localization, VirtualCurrencyBalancesScreenViewState virtualCurrencyBalancesScreenViewState, e eVar, int i10, int i11) {
            super(2);
            this.$appearance = appearance;
            this.$localization = localization;
            this.$viewState = virtualCurrencyBalancesScreenViewState;
            this.$modifier = eVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            VirtualCurrencyBalancesScreenKt.InternalVirtualCurrencyBalancesScreen(this.$appearance, this.$localization, this.$viewState, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenKt$VirtualCurrencyBalancesScreen$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CustomerCenterConfigData.Appearance $appearance;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ e $modifier;
        final /* synthetic */ VirtualCurrencyBalancesScreenViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CustomerCenterConfigData.Appearance appearance, CustomerCenterConfigData.Localization localization, e eVar, VirtualCurrencyBalancesScreenViewModel virtualCurrencyBalancesScreenViewModel, int i10, int i11) {
            super(2);
            this.$appearance = appearance;
            this.$localization = localization;
            this.$modifier = eVar;
            this.$viewModel = virtualCurrencyBalancesScreenViewModel;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            VirtualCurrencyBalancesScreenKt.VirtualCurrencyBalancesScreen(this.$appearance, this.$localization, this.$modifier, this.$viewModel, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenKt$VirtualCurrencyBalancesScreenErrorPreview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44171 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44171(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            VirtualCurrencyBalancesScreenKt.VirtualCurrencyBalancesScreenErrorPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenKt$VirtualCurrencyBalancesScreenLoaded0VCsPreview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44181 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44181(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            VirtualCurrencyBalancesScreenKt.VirtualCurrencyBalancesScreenLoaded0VCsPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenKt$VirtualCurrencyBalancesScreenLoaded4VCsPreview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44191 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44191(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            VirtualCurrencyBalancesScreenKt.VirtualCurrencyBalancesScreenLoaded4VCsPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenKt$VirtualCurrencyBalancesScreenLoadedVCsPreview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44201 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44201(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            VirtualCurrencyBalancesScreenKt.VirtualCurrencyBalancesScreenLoadedVCsPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenKt$VirtualCurrencyBalancesScreenLoadingPreview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44211 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44211(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            VirtualCurrencyBalancesScreenKt.VirtualCurrencyBalancesScreenLoadingPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void EmptyStateView(com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r29, androidx.compose.ui.e r30, Y.InterfaceC2425m r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenKt.EmptyStateView(com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, androidx.compose.ui.e, Y.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void InternalVirtualCurrencyBalancesScreen(com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Appearance r18, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r19, com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenViewState r20, androidx.compose.ui.e r21, Y.InterfaceC2425m r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenKt.InternalVirtualCurrencyBalancesScreen(com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Appearance, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenViewState, androidx.compose.ui.e, Y.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void VirtualCurrencyBalancesScreen(com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Appearance r17, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r18, androidx.compose.ui.e r19, com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.VirtualCurrencyBalancesScreenViewModel r20, Y.InterfaceC2425m r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenKt.VirtualCurrencyBalancesScreen(com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Appearance, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, androidx.compose.ui.e, com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.VirtualCurrencyBalancesScreenViewModel, Y.m, int, int):void");
    }

    private static final VirtualCurrencyBalancesScreenViewState VirtualCurrencyBalancesScreen$lambda$0(h2 h2Var) {
        return (VirtualCurrencyBalancesScreenViewState) h2Var.getValue();
    }

    public static final void VirtualCurrencyBalancesScreenErrorPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-508614020);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-508614020, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenErrorPreview (VirtualCurrencyBalancesScreen.kt:253)");
            }
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(ComposableSingletons$VirtualCurrencyBalancesScreenKt.INSTANCE.m716getLambda6$revenuecatui_defaultsBc8Release(), interfaceC2425mG, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44171(i10));
        }
    }

    public static final void VirtualCurrencyBalancesScreenLoaded0VCsPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(800159975);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(800159975, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenLoaded0VCsPreview (VirtualCurrencyBalancesScreen.kt:189)");
            }
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(ComposableSingletons$VirtualCurrencyBalancesScreenKt.INSTANCE.m712getLambda2$revenuecatui_defaultsBc8Release(), interfaceC2425mG, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44181(i10));
        }
    }

    public static final void VirtualCurrencyBalancesScreenLoaded4VCsPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1776254187);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1776254187, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenLoaded4VCsPreview (VirtualCurrencyBalancesScreen.kt:204)");
            }
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(ComposableSingletons$VirtualCurrencyBalancesScreenKt.INSTANCE.m713getLambda3$revenuecatui_defaultsBc8Release(), interfaceC2425mG, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44191(i10));
        }
    }

    public static final void VirtualCurrencyBalancesScreenLoadedVCsPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1774472093);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1774472093, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenLoadedVCsPreview (VirtualCurrencyBalancesScreen.kt:221)");
            }
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(ComposableSingletons$VirtualCurrencyBalancesScreenKt.INSTANCE.m714getLambda4$revenuecatui_defaultsBc8Release(), interfaceC2425mG, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44201(i10));
        }
    }

    public static final void VirtualCurrencyBalancesScreenLoadingPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(126970760);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(126970760, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenLoadingPreview (VirtualCurrencyBalancesScreen.kt:238)");
            }
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(ComposableSingletons$VirtualCurrencyBalancesScreenKt.INSTANCE.m715getLambda5$revenuecatui_defaultsBc8Release(), interfaceC2425mG, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44211(i10));
        }
    }

    private static final VirtualCurrencyBalancesScreenViewModel getVirtualCurrencyBalancesScreenViewModel(PurchasesType purchasesType, VirtualCurrencyBalancesScreenViewModel virtualCurrencyBalancesScreenViewModel, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        InterfaceC2425m interfaceC2425m2;
        interfaceC2425m.V(-1589946380);
        if ((i11 & 1) != 0) {
            purchasesType = new PurchasesImpl(null, 1, null);
        }
        if ((i11 & 2) != 0) {
            VirtualCurrencyBalancesScreenViewModelFactory virtualCurrencyBalancesScreenViewModelFactory = new VirtualCurrencyBalancesScreenViewModelFactory(purchasesType);
            interfaceC2425m.C(1729797275);
            Y yC = C5717b.f53840a.c(interfaceC2425m, 6);
            if (yC == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            interfaceC2425m2 = interfaceC2425m;
            U uB = AbstractC5719d.b(O.b(VirtualCurrencyBalancesScreenViewModel.class), yC, null, virtualCurrencyBalancesScreenViewModelFactory, yC instanceof InterfaceC2854h ? ((InterfaceC2854h) yC).getDefaultViewModelCreationExtras() : AbstractC5628a.b.f53049c, interfaceC2425m2, 0, 0);
            interfaceC2425m2.T();
            virtualCurrencyBalancesScreenViewModel = (VirtualCurrencyBalancesScreenViewModel) uB;
        } else {
            interfaceC2425m2 = interfaceC2425m;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1589946380, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.getVirtualCurrencyBalancesScreenViewModel (VirtualCurrencyBalancesScreen.kt:180)");
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m2.O();
        return virtualCurrencyBalancesScreenViewModel;
    }
}
