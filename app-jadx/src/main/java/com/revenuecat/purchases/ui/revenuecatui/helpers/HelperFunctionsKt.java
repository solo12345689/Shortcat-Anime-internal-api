package com.revenuecat.purchases.ui.revenuecatui.helpers;

import Td.L;
import Y.AbstractC2394b1;
import Y.AbstractC2454w;
import Y.H;
import Y.InterfaceC2425m;
import Zd.e;
import Zd.k;
import ae.AbstractC2605b;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.U0;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.ListenerConversionsKt;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a$\u0010\t\u001a\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00000\u0006H\u0080@¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\t\u001a\u00020\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00000\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\u0006H\u0000¢\u0006\u0004\b\t\u0010\r\u001a#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00000\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\"\"\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"", "isInPreviewMode", "(LY/m;I)Z", "", "windowAspectRatio", "(LY/m;I)F", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/CustomerInfo;", "shouldDisplayBlock", "shouldDisplayPaywall", "(Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;", "LTd/L;", "result", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "entitlement", "shouldDisplayBlockForEntitlementIdentifier", "(Ljava/lang/String;)Lkotlin/jvm/functions/Function1;", "LY/b1;", "Landroid/app/Activity;", "LocalActivity", "LY/b1;", "getLocalActivity", "()LY/b1;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HelperFunctionsKt {
    private static final AbstractC2394b1 LocalActivity = H.h(null, HelperFunctionsKt$LocalActivity$1.INSTANCE, 1, null);

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.helpers.HelperFunctionsKt$shouldDisplayBlockForEntitlementIdentifier$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "customerInfo", "Lcom/revenuecat/purchases/CustomerInfo;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        final /* synthetic */ String $entitlement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str) {
            super(1);
            this.$entitlement = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(CustomerInfo customerInfo) {
            AbstractC5504s.h(customerInfo, "customerInfo");
            EntitlementInfo entitlementInfo = customerInfo.getEntitlements().get(this.$entitlement);
            boolean z10 = false;
            if (entitlementInfo != null && entitlementInfo.getIsActive()) {
                z10 = true;
            }
            return Boolean.valueOf(!z10);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.helpers.HelperFunctionsKt$shouldDisplayPaywall$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass3 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Function1 $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Function1 function1) {
            super(1);
            this.$result = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError it) {
            AbstractC5504s.h(it, "it");
            Logger.INSTANCE.e("Error fetching customer info to display paywall", new PurchasesException(it));
            this.$result.invoke(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.helpers.HelperFunctionsKt$shouldDisplayPaywall$4 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass4 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Function1 $result;
        final /* synthetic */ Function1 $shouldDisplayBlock;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(Function1 function1, Function1 function12) {
            super(1);
            this.$shouldDisplayBlock = function1;
            this.$result = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return L.f17438a;
        }

        public final void invoke(CustomerInfo it) {
            AbstractC5504s.h(it, "it");
            Boolean bool = (Boolean) this.$shouldDisplayBlock.invoke(it);
            if (bool.booleanValue()) {
                Logger.INSTANCE.d("Displaying paywall according to display logic");
            } else {
                Logger.INSTANCE.d("Not displaying paywall according to display logic");
            }
            this.$result.invoke(bool);
        }
    }

    public static final AbstractC2394b1 getLocalActivity() {
        return LocalActivity;
    }

    public static final boolean isInPreviewMode(InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(774792703, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.helpers.isInPreviewMode (HelperFunctions.kt:24)");
        }
        boolean zBooleanValue = ((Boolean) interfaceC2425m.n(U0.a())).booleanValue();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return zBooleanValue;
    }

    public static final Function1 shouldDisplayBlockForEntitlementIdentifier(String entitlement) {
        AbstractC5504s.h(entitlement, "entitlement");
        return new AnonymousClass1(entitlement);
    }

    public static final Object shouldDisplayPaywall(Function1 function1, e eVar) throws Throwable {
        k kVar = new k(AbstractC2605b.c(eVar));
        shouldDisplayPaywall(function1, new HelperFunctionsKt$shouldDisplayPaywall$2$1(kVar));
        Object objA = kVar.a();
        if (objA == AbstractC2605b.f()) {
            h.c(eVar);
        }
        return objA;
    }

    public static final float windowAspectRatio(InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1944383602, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.helpers.windowAspectRatio (HelperFunctions.kt:28)");
        }
        Configuration configuration = (Configuration) interfaceC2425m.n(AndroidCompositionLocals_androidKt.f());
        float f10 = configuration.screenHeightDp / configuration.screenWidthDp;
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return f10;
    }

    public static final void shouldDisplayPaywall(Function1 shouldDisplayBlock, Function1 result) {
        AbstractC5504s.h(shouldDisplayBlock, "shouldDisplayBlock");
        AbstractC5504s.h(result, "result");
        ListenerConversionsKt.getCustomerInfoWith(Purchases.INSTANCE.getSharedInstance(), new AnonymousClass3(result), new AnonymousClass4(shouldDisplayBlock, result));
    }
}
