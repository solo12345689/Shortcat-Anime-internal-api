package com.revenuecat.purchases.ui.revenuecatui.components.style;

import Td.r;
import Ud.AbstractC2279u;
import Ud.S;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.components.PackageComponent;
import com.revenuecat.purchases.paywalls.components.PaywallComponent;
import com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory;
import com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyList;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/PackageComponentStyle;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StyleFactory$StyleFactoryScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class StyleFactory$createPackageComponentStyle$1$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ PackageComponent $component;
    final /* synthetic */ Package $rcPackage;
    final /* synthetic */ ResolvedOffer $resolvedOffer;
    final /* synthetic */ StyleFactory this$0;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory$createPackageComponentStyle$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "invoke", "(Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(PaywallComponent it) {
            AbstractC5504s.h(it, "it");
            return Boolean.valueOf(it instanceof PurchaseButtonComponent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StyleFactory$createPackageComponentStyle$1$1(StyleFactory styleFactory, PackageComponent packageComponent, Package r32, ResolvedOffer resolvedOffer) {
        super(1);
        this.this$0 = styleFactory;
        this.$component = packageComponent;
        this.$rcPackage = r32;
        this.$resolvedOffer = resolvedOffer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Result<PackageComponentStyle, NonEmptyList<PaywallValidationError>> invoke(StyleFactory.StyleFactoryScope withSelectedScope) {
        AbstractC5504s.h(withSelectedScope, "$this$withSelectedScope");
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        StyleFactory styleFactory = this.this$0;
        PackageComponent packageComponent = this.$component;
        Integer num = (Integer) AbstractC2279u.C0(withSelectedScope.countPredicates.keySet());
        int iIntValue = (num != null ? num.intValue() : -1) + 1;
        withSelectedScope.countPredicates.put(Integer.valueOf(iIntValue), anonymousClass1);
        withSelectedScope.countValues.put(Integer.valueOf(iIntValue), 0);
        StyleFactory.StyleFactoryScope.WithCount withCount = new StyleFactory.StyleFactoryScope.WithCount(styleFactory.createStackComponentStyle(withSelectedScope, packageComponent.getStack()), ((Number) S.j(withSelectedScope.countValues, Integer.valueOf(iIntValue))).intValue());
        withSelectedScope.countPredicates.remove(Integer.valueOf(iIntValue));
        withSelectedScope.countValues.remove(Integer.valueOf(iIntValue));
        Result<PackageComponentStyle, NonEmptyList<PaywallValidationError>> result = (Result) withCount.component1();
        int count = withCount.getCount();
        PackageComponent packageComponent2 = this.$component;
        Package r82 = this.$rcPackage;
        ResolvedOffer resolvedOffer = this.$resolvedOffer;
        if (result instanceof Result.Success) {
            return new Result.Success(new PackageComponentStyle(r82, packageComponent2.getIsSelectedByDefault(), (StackComponentStyle) ((Result.Success) result).getValue(), count == 0, resolvedOffer));
        }
        if (result instanceof Result.Error) {
            return result;
        }
        throw new r();
    }
}
