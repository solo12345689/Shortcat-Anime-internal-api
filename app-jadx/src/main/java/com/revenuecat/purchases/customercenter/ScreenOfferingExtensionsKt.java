package com.revenuecat.purchases.customercenter;

import Td.L;
import Td.r;
import com.revenuecat.purchases.ListenerConversionsCommonKt;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;", "Lcom/revenuecat/purchases/Purchases;", "purchases", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "LTd/L;", "onError", "Lcom/revenuecat/purchases/Offering;", "onSuccess", "resolveOffering", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;Lcom/revenuecat/purchases/Purchases;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ScreenOfferingExtensionsKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.customercenter.ScreenOfferingExtensionsKt$resolveOffering$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        public final void invoke(PurchasesError it) {
            AbstractC5504s.h(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.customercenter.ScreenOfferingExtensionsKt$resolveOffering$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/Offerings;", "offerings", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/Offerings;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass2 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Function1 $onSuccess;
        final /* synthetic */ CustomerCenterConfigData.ScreenOffering $screenOffering;

        /* JADX INFO: renamed from: com.revenuecat.purchases.customercenter.ScreenOfferingExtensionsKt$resolveOffering$2$WhenMappings */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CustomerCenterConfigData.ScreenOffering.ScreenOfferingType.values().length];
                try {
                    iArr[CustomerCenterConfigData.ScreenOffering.ScreenOfferingType.CURRENT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CustomerCenterConfigData.ScreenOffering.ScreenOfferingType.SPECIFIC.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(CustomerCenterConfigData.ScreenOffering screenOffering, Function1 function1) {
            super(1);
            this.$screenOffering = screenOffering;
            this.$onSuccess = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Offerings) obj);
            return L.f17438a;
        }

        public final void invoke(Offerings offerings) {
            Offering current;
            AbstractC5504s.h(offerings, "offerings");
            int i10 = WhenMappings.$EnumSwitchMapping$0[this.$screenOffering.getType().ordinal()];
            if (i10 == 1) {
                current = offerings.getCurrent();
            } else {
                if (i10 != 2) {
                    throw new r();
                }
                String offeringId = this.$screenOffering.getOfferingId();
                current = offeringId != null ? offerings.getAll().get(offeringId) : null;
            }
            this.$onSuccess.invoke(current);
        }
    }

    public static final void resolveOffering(CustomerCenterConfigData.Screen screen, Purchases purchases, Function1 onError, Function1 onSuccess) {
        AbstractC5504s.h(screen, "<this>");
        AbstractC5504s.h(purchases, "purchases");
        AbstractC5504s.h(onError, "onError");
        AbstractC5504s.h(onSuccess, "onSuccess");
        CustomerCenterConfigData.ScreenOffering offering = screen.getOffering();
        if (offering == null) {
            onSuccess.invoke(null);
        } else {
            ListenerConversionsCommonKt.getOfferingsWith(purchases, onError, new AnonymousClass2(offering, onSuccess));
        }
    }

    public static /* synthetic */ void resolveOffering$default(CustomerCenterConfigData.Screen screen, Purchases purchases, Function1 function1, Function1 function12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = AnonymousClass1.INSTANCE;
        }
        resolveOffering(screen, purchases, function1, function12);
    }
}
