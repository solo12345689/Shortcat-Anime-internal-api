package com.revenuecat.purchases.paywalls.components;

import Rf.b;
import Td.InterfaceC2154e;
import Tf.e;
import Uf.d;
import Vf.AbstractC2327f0;
import Vf.t0;
import com.revenuecat.purchases.paywalls.components.common.PromoOfferConfig;
import com.revenuecat.purchases.paywalls.components.common.ResilientPromoOfferConfigSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 )2\u00020\u0001:\u0002*)B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBG\b\u0011\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÁ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001f\u0012\u0004\b!\u0010\u001e\u001a\u0004\b\u0005\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010%\u0012\u0004\b(\u0010\u001e\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PackageComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "", "packageId", "", "isSelectedByDefault", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "stack", "Lcom/revenuecat/purchases/paywalls/components/common/PromoOfferConfig;", "playStoreOffer", "<init>", "(Ljava/lang/String;ZLcom/revenuecat/purchases/paywalls/components/StackComponent;Lcom/revenuecat/purchases/paywalls/components/common/PromoOfferConfig;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/lang/String;ZLcom/revenuecat/purchases/paywalls/components/StackComponent;Lcom/revenuecat/purchases/paywalls/components/common/PromoOfferConfig;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/PackageComponent;LUf/d;LTf/e;)V", "write$Self", "Ljava/lang/String;", "getPackageId", "()Ljava/lang/String;", "getPackageId$annotations", "()V", "Z", "()Z", "isSelectedByDefault$annotations", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "getStack", "()Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "Lcom/revenuecat/purchases/paywalls/components/common/PromoOfferConfig;", "getPlayStoreOffer", "()Lcom/revenuecat/purchases/paywalls/components/common/PromoOfferConfig;", "getPlayStoreOffer$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PackageComponent implements PaywallComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isSelectedByDefault;
    private final String packageId;
    private final PromoOfferConfig playStoreOffer;
    private final StackComponent stack;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PackageComponent$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/PackageComponent;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b serializer() {
            return PackageComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC2154e
    public /* synthetic */ PackageComponent(int i10, String str, boolean z10, StackComponent stackComponent, PromoOfferConfig promoOfferConfig, t0 t0Var) {
        if (7 != (i10 & 7)) {
            AbstractC2327f0.a(i10, 7, PackageComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.packageId = str;
        this.isSelectedByDefault = z10;
        this.stack = stackComponent;
        if ((i10 & 8) == 0) {
            this.playStoreOffer = null;
        } else {
            this.playStoreOffer = promoOfferConfig;
        }
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PackageComponent self, d output, e serialDesc) {
        output.k(serialDesc, 0, self.packageId);
        output.B(serialDesc, 1, self.isSelectedByDefault);
        output.m(serialDesc, 2, StackComponent$$serializer.INSTANCE, self.stack);
        if (!output.g(serialDesc, 3) && self.playStoreOffer == null) {
            return;
        }
        output.f(serialDesc, 3, ResilientPromoOfferConfigSerializer.INSTANCE, self.playStoreOffer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackageComponent)) {
            return false;
        }
        PackageComponent packageComponent = (PackageComponent) obj;
        return AbstractC5504s.c(this.packageId, packageComponent.packageId) && this.isSelectedByDefault == packageComponent.isSelectedByDefault && AbstractC5504s.c(this.stack, packageComponent.stack) && AbstractC5504s.c(this.playStoreOffer, packageComponent.playStoreOffer);
    }

    public final /* synthetic */ String getPackageId() {
        return this.packageId;
    }

    public final /* synthetic */ PromoOfferConfig getPlayStoreOffer() {
        return this.playStoreOffer;
    }

    public final /* synthetic */ StackComponent getStack() {
        return this.stack;
    }

    public int hashCode() {
        int iHashCode = ((((this.packageId.hashCode() * 31) + Boolean.hashCode(this.isSelectedByDefault)) * 31) + this.stack.hashCode()) * 31;
        PromoOfferConfig promoOfferConfig = this.playStoreOffer;
        return iHashCode + (promoOfferConfig == null ? 0 : promoOfferConfig.hashCode());
    }

    /* JADX INFO: renamed from: isSelectedByDefault, reason: from getter */
    public final /* synthetic */ boolean getIsSelectedByDefault() {
        return this.isSelectedByDefault;
    }

    public String toString() {
        return "PackageComponent(packageId=" + this.packageId + ", isSelectedByDefault=" + this.isSelectedByDefault + ", stack=" + this.stack + ", playStoreOffer=" + this.playStoreOffer + ')';
    }

    public PackageComponent(String packageId, boolean z10, StackComponent stack, PromoOfferConfig promoOfferConfig) {
        AbstractC5504s.h(packageId, "packageId");
        AbstractC5504s.h(stack, "stack");
        this.packageId = packageId;
        this.isSelectedByDefault = z10;
        this.stack = stack;
        this.playStoreOffer = promoOfferConfig;
    }

    public /* synthetic */ PackageComponent(String str, boolean z10, StackComponent stackComponent, PromoOfferConfig promoOfferConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z10, stackComponent, (i10 & 8) != 0 ? null : promoOfferConfig);
    }

    public static /* synthetic */ void getPackageId$annotations() {
    }

    public static /* synthetic */ void getPlayStoreOffer$annotations() {
    }

    public static /* synthetic */ void isSelectedByDefault$annotations() {
    }
}
