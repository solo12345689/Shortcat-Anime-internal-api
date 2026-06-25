package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import D.InterfaceC1231c;
import Td.L;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import ie.InterfaceC5082a;
import ie.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "LD/c;", "", "it", "LTd/L;", "invoke", "(LD/c;ILY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class DefaultPaywallViewKt$DefaultPaywallView$2$2$1$1$2$1$invoke$$inlined$items$default$4 extends AbstractC5506u implements p {
    final /* synthetic */ long $foregroundOnAccentColor$inlined;
    final /* synthetic */ List $items;
    final /* synthetic */ long $mainColor$inlined;
    final /* synthetic */ Function1 $onSelectPackage$inlined;
    final /* synthetic */ TemplateConfiguration.PackageInfo $selectedPackage$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPaywallViewKt$DefaultPaywallView$2$2$1$1$2$1$invoke$$inlined$items$default$4(List list, long j10, long j11, TemplateConfiguration.PackageInfo packageInfo, Function1 function1) {
        super(4);
        this.$items = list;
        this.$mainColor$inlined = j10;
        this.$foregroundOnAccentColor$inlined = j11;
        this.$selectedPackage$inlined = packageInfo;
        this.$onSelectPackage$inlined = function1;
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
            AbstractC2454w.U(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
        }
        TemplateConfiguration.PackageInfo packageInfo = (TemplateConfiguration.PackageInfo) this.$items.get(i10);
        interfaceC2425m.V(-350675214);
        Package rcPackage = packageInfo.getRcPackage();
        long j10 = this.$mainColor$inlined;
        long j11 = this.$foregroundOnAccentColor$inlined;
        boolean zC = AbstractC5504s.c(this.$selectedPackage$inlined, packageInfo);
        interfaceC2425m.V(819982243);
        boolean zU = interfaceC2425m.U(this.$onSelectPackage$inlined) | interfaceC2425m.U(packageInfo);
        Object objD = interfaceC2425m.D();
        if (zU || objD == InterfaceC2425m.f22370a.a()) {
            objD = new DefaultPaywallViewKt$DefaultPaywallView$2$2$1$1$2$1$2$1$1(this.$onSelectPackage$inlined, packageInfo);
            interfaceC2425m.u(objD);
        }
        interfaceC2425m.O();
        DefaultProductCellKt.m805DefaultProductCellqi6gXK8(rcPackage, j10, j11, zC, (InterfaceC5082a) objD, null, interfaceC2425m, 0, 32);
        interfaceC2425m.O();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
