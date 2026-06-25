package com.revenuecat.purchases.ui.revenuecatui.components.state;

import Y.U1;
import Y.h2;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u001b\u0010\u0012\u001a\u00020\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0017\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/state/PackageAwareDelegate;", "", "Lcom/revenuecat/purchases/ui/revenuecatui/components/state/PackageContext;", "style", "Lkotlin/Function0;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$SelectedPackageInfo;", "selectedPackageInfoProvider", "", "selectedTabIndexProvider", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "selectedOfferEligibilityProvider", "<init>", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/state/PackageContext;Lie/a;Lie/a;Lie/a;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/components/state/PackageContext;", "Lie/a;", "", "isSelected$delegate", "LY/h2;", "isSelected", "()Z", "offerEligibility$delegate", "getOfferEligibility", "()Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "offerEligibility", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PackageAwareDelegate {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: isSelected$delegate, reason: from kotlin metadata */
    private final h2 isSelected;

    /* JADX INFO: renamed from: offerEligibility$delegate, reason: from kotlin metadata */
    private final h2 offerEligibility;
    private final InterfaceC5082a selectedOfferEligibilityProvider;
    private final InterfaceC5082a selectedPackageInfoProvider;
    private final InterfaceC5082a selectedTabIndexProvider;
    private final PackageContext style;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.state.PackageAwareDelegate$isSelected$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements InterfaceC5082a {
        AnonymousClass2() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Boolean invoke() {
            return Boolean.valueOf(PackageAwareDelegate.this.style.computeIsSelected((PaywallState.Loaded.Components.SelectedPackageInfo) PackageAwareDelegate.this.selectedPackageInfoProvider.invoke(), ((Number) PackageAwareDelegate.this.selectedTabIndexProvider.invoke()).intValue()));
        }
    }

    public PackageAwareDelegate(PackageContext style, InterfaceC5082a selectedPackageInfoProvider, InterfaceC5082a selectedTabIndexProvider, InterfaceC5082a selectedOfferEligibilityProvider) {
        AbstractC5504s.h(style, "style");
        AbstractC5504s.h(selectedPackageInfoProvider, "selectedPackageInfoProvider");
        AbstractC5504s.h(selectedTabIndexProvider, "selectedTabIndexProvider");
        AbstractC5504s.h(selectedOfferEligibilityProvider, "selectedOfferEligibilityProvider");
        this.style = style;
        this.selectedPackageInfoProvider = selectedPackageInfoProvider;
        this.selectedTabIndexProvider = selectedTabIndexProvider;
        this.selectedOfferEligibilityProvider = selectedOfferEligibilityProvider;
        this.isSelected = U1.d(new AnonymousClass2());
        this.offerEligibility = U1.d(new PackageAwareDelegate$offerEligibility$2(this));
    }

    public final OfferEligibility getOfferEligibility() {
        return (OfferEligibility) this.offerEligibility.getValue();
    }

    public final boolean isSelected() {
        return ((Boolean) this.isSelected.getValue()).booleanValue();
    }
}
