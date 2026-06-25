package com.revenuecat.purchases.ui.revenuecatui.components.pkg;

import Td.L;
import androidx.compose.foundation.d;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.components.style.PackageComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/e;", "invoke", "(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class PackageComponentViewKt$PackageComponentView$2$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ PaywallState.Loaded.Components $state;
    final /* synthetic */ PackageComponentStyle $style;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.pkg.PackageComponentViewKt$PackageComponentView$2$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ PackageComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PaywallState.Loaded.Components components, PackageComponentStyle packageComponentStyle) {
            super(0);
            this.$state = components;
            this.$style = packageComponentStyle;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m439invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m439invoke() {
            this.$state.update(this.$style.getUniqueId());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PackageComponentViewKt$PackageComponentView$2$1(PaywallState.Loaded.Components components, PackageComponentStyle packageComponentStyle) {
        super(1);
        this.$state = components;
        this.$style = packageComponentStyle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final e invoke(e conditional) {
        AbstractC5504s.h(conditional, "$this$conditional");
        return d.d(conditional, !AbstractC5504s.c(this.$state.getSelectedPackageInfo() != null ? r0.getUniqueId() : null, this.$style.getUniqueId()), null, null, new AnonymousClass1(this.$state, this.$style), 6, null);
    }
}
