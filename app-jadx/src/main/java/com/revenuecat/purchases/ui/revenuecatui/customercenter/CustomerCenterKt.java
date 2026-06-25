package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import Td.L;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import androidx.compose.ui.e;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterOptions;", "options", "Lkotlin/Function0;", "LTd/L;", "onDismiss", "CustomerCenter", "(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterOptions;Lie/a;LY/m;II)V", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CustomerCenterKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterKt$CustomerCenter$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ e $modifier;
        final /* synthetic */ InterfaceC5082a $onDismiss;
        final /* synthetic */ CustomerCenterOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(e eVar, CustomerCenterOptions customerCenterOptions, InterfaceC5082a interfaceC5082a) {
            super(2);
            this.$modifier = eVar;
            this.$options = customerCenterOptions;
            this.$onDismiss = interfaceC5082a;
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
                AbstractC2454w.U(-676995342, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenter.<anonymous> (CustomerCenter.kt:30)");
            }
            InternalCustomerCenterKt.InternalCustomerCenter(this.$modifier, this.$options.getListener(), null, this.$onDismiss, interfaceC2425m, 0, 4);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterKt$CustomerCenter$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ InterfaceC5082a $onDismiss;
        final /* synthetic */ CustomerCenterOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(e eVar, CustomerCenterOptions customerCenterOptions, InterfaceC5082a interfaceC5082a, int i10, int i11) {
            super(2);
            this.$modifier = eVar;
            this.$options = customerCenterOptions;
            this.$onDismiss = interfaceC5082a;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            CustomerCenterKt.CustomerCenter(this.$modifier, this.$options, this.$onDismiss, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void CustomerCenter(androidx.compose.ui.e r7, com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterOptions r8, ie.InterfaceC5082a r9, Y.InterfaceC2425m r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterKt.CustomerCenter(androidx.compose.ui.e, com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterOptions, ie.a, Y.m, int, int):void");
    }
}
