package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import Zd.e;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0081@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;", "purchases", "Lcom/revenuecat/purchases/Offering;", "resolveOfferingSuspend", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;LZd/e;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;", "localization", "", "resolveButtonText", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)Ljava/lang/String;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ScreenOfferingExtensionsKt {

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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.ScreenOfferingExtensionsKt$resolveOfferingSuspend$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.ScreenOfferingExtensionsKt", f = "ScreenOfferingExtensions.kt", l = {14}, m = "resolveOfferingSuspend")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScreenOfferingExtensionsKt.resolveOfferingSuspend(null, null, this);
        }
    }

    public static final String resolveButtonText(CustomerCenterConfigData.Screen screen, CustomerCenterConfigData.Localization localization) {
        String buttonText;
        AbstractC5504s.h(screen, "<this>");
        AbstractC5504s.h(localization, "localization");
        CustomerCenterConfigData.ScreenOffering offering = screen.getOffering();
        return (offering == null || (buttonText = offering.getButtonText()) == null) ? localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.BUY_SUBSCRIPTION) : buttonText;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object resolveOfferingSuspend(com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Screen r5, com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType r6, Zd.e r7) {
        /*
            boolean r0 = r7 instanceof com.revenuecat.purchases.ui.revenuecatui.customercenter.ScreenOfferingExtensionsKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            com.revenuecat.purchases.ui.revenuecatui.customercenter.ScreenOfferingExtensionsKt$resolveOfferingSuspend$1 r0 = (com.revenuecat.purchases.ui.revenuecatui.customercenter.ScreenOfferingExtensionsKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.revenuecat.purchases.ui.revenuecatui.customercenter.ScreenOfferingExtensionsKt$resolveOfferingSuspend$1 r0 = new com.revenuecat.purchases.ui.revenuecatui.customercenter.ScreenOfferingExtensionsKt$resolveOfferingSuspend$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r5 = r0.L$0
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$ScreenOffering r5 = (com.revenuecat.purchases.customercenter.CustomerCenterConfigData.ScreenOffering) r5
            Td.v.b(r7)
            goto L4b
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            Td.v.b(r7)
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$ScreenOffering r5 = r5.getOffering()
            if (r5 != 0) goto L40
            return r3
        L40:
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r7 = r6.awaitOfferings(r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            com.revenuecat.purchases.Offerings r7 = (com.revenuecat.purchases.Offerings) r7
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$ScreenOffering$ScreenOfferingType r6 = r5.getType()
            int[] r0 = com.revenuecat.purchases.ui.revenuecatui.customercenter.ScreenOfferingExtensionsKt.WhenMappings.$EnumSwitchMapping$0
            int r6 = r6.ordinal()
            r6 = r0[r6]
            if (r6 == r4) goto L76
            r0 = 2
            if (r6 != r0) goto L70
            java.lang.String r5 = r5.getOfferingId()
            if (r5 == 0) goto L6f
            java.util.Map r6 = r7.getAll()
            java.lang.Object r5 = r6.get(r5)
            com.revenuecat.purchases.Offering r5 = (com.revenuecat.purchases.Offering) r5
            return r5
        L6f:
            return r3
        L70:
            Td.r r5 = new Td.r
            r5.<init>()
            throw r5
        L76:
            com.revenuecat.purchases.Offering r5 = r7.getCurrent()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.ScreenOfferingExtensionsKt.resolveOfferingSuspend(com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Screen, com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType, Zd.e):java.lang.Object");
    }
}
