package com.revenuecat.purchases.ui.revenuecatui.data.testdata;

import Gf.AbstractC1617k;
import Gf.O;
import Jf.AbstractC1744g;
import Jf.I;
import Jf.K;
import Jf.u;
import Td.L;
import Td.r;
import Td.v;
import Td.z;
import U.C2175l;
import Y.C0;
import Y.b2;
import Y.h2;
import Zd.e;
import ae.AbstractC2605b;
import android.app.Activity;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.events.ExitOfferType;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import com.revenuecat.purchases.ui.revenuecatui.data.MockPurchasesType;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallStateKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableDataProvider;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import com.revenuecat.purchases.ui.revenuecatui.helpers.OfferingToStateMapperKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallValidationResult;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallWarning;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u0096\u00012\u00020\u00012\u00020\u0002:\u0002\u0096\u0001B9\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u0010J\u001f\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010\u0010J\u001f\u0010$\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u00100\u001a\u0004\u0018\u00010\u00132\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u000eH\u0016¢\u0006\u0004\b2\u0010\u0010J\u0019\u00105\u001a\u00020\u000e2\b\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b5\u00106J,\u0010;\u001a\u00020\u000e2\u0006\u00104\u001a\u0002032\b\u00108\u001a\u0004\u0018\u0001072\b\u0010:\u001a\u0004\u0018\u000109H\u0096@¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u000eH\u0016¢\u0006\u0004\b=\u0010\u0010J\u0010\u0010>\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b>\u0010\u0012J\u000f\u0010?\u001a\u00020\u000eH\u0016¢\u0006\u0004\b?\u0010\u0010J\u000f\u0010@\u001a\u00020\u000eH\u0016¢\u0006\u0004\b@\u0010\u0010J\u0015\u0010C\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010ER\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010ER \u0010G\u001a\b\u0012\u0004\u0012\u00020\t0F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\"\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010H\u001a\u0004\bL\u0010JR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020N0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\t0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001c\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010T0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010SR$\u0010X\u001a\u00020V2\u0006\u0010W\u001a\u00020V8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R$\u0010\\\u001a\u00020V2\u0006\u0010W\u001a\u00020V8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\\\u0010Y\u001a\u0004\b]\u0010[RH\u0010`\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00130_0^2\u0018\u0010W\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00130_0^8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR$\u0010d\u001a\u00020V2\u0006\u0010W\u001a\u00020V8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bd\u0010Y\u001a\u0004\be\u0010[R$\u0010f\u001a\u00020V2\u0006\u0010W\u001a\u00020V8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bf\u0010Y\u001a\u0004\bg\u0010[R$\u0010h\u001a\u00020V2\u0006\u0010W\u001a\u00020V8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bh\u0010Y\u001a\u0004\bi\u0010[R0\u0010j\u001a\b\u0012\u0004\u0012\u00020&0^2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020&0^8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bj\u0010a\u001a\u0004\bk\u0010cR$\u0010l\u001a\u00020V2\u0006\u0010W\u001a\u00020V8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bl\u0010Y\u001a\u0004\bm\u0010[R$\u0010n\u001a\u00020V2\u0006\u0010W\u001a\u00020V8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bn\u0010Y\u001a\u0004\bo\u0010[R0\u0010p\u001a\b\u0012\u0004\u0012\u00020.0^2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020.0^8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bp\u0010a\u001a\u0004\bq\u0010cR$\u0010r\u001a\u00020V2\u0006\u0010W\u001a\u00020V8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\br\u0010Y\u001a\u0004\bs\u0010[R$\u0010t\u001a\u00020V2\u0006\u0010W\u001a\u00020V8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bt\u0010Y\u001a\u0004\bu\u0010[R4\u0010v\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030^2\u000e\u0010W\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030^8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bv\u0010a\u001a\u0004\bw\u0010cR4\u0010x\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130^2\u000e\u0010W\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130^8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bx\u0010a\u001a\u0004\by\u0010cR$\u0010z\u001a\u00020V2\u0006\u0010W\u001a\u00020V8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bz\u0010Y\u001a\u0004\b{\u0010[RL\u0010|\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u000203\u0012\u0006\u0012\u0004\u0018\u0001070_0^2\u001a\u0010W\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u000203\u0012\u0006\u0012\u0004\u0018\u0001070_0^8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b|\u0010a\u001a\u0004\b}\u0010cR$\u0010~\u001a\u00020V2\u0006\u0010W\u001a\u00020V8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b~\u0010Y\u001a\u0004\b\u007f\u0010[R'\u0010\u0080\u0001\u001a\u00020V2\u0006\u0010W\u001a\u00020V8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010Y\u001a\u0005\b\u0081\u0001\u0010[R'\u0010\u0082\u0001\u001a\u00020V2\u0006\u0010W\u001a\u00020V8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010Y\u001a\u0005\b\u0083\u0001\u0010[R'\u0010\u0084\u0001\u001a\u00020V2\u0006\u0010W\u001a\u00020V8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010Y\u001a\u0005\b\u0085\u0001\u0010[R'\u0010\u0086\u0001\u001a\u00020V2\u0006\u0010W\u001a\u00020V8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010Y\u001a\u0005\b\u0087\u0001\u0010[R3\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020A0^2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020A0^8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010a\u001a\u0005\b\u0089\u0001\u0010cR\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001e\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00020N0\u008e\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001c\u0010\u0093\u0001\u001a\b\u0012\u0004\u0012\u00020\t0F8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010JR\u001e\u0010\u0095\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010T0F8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010J¨\u0006\u0097\u0001"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/MockViewModel;", "Landroidx/lifecycle/U;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;", "mode", "Lcom/revenuecat/purchases/Offering;", "offering", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;", "validationWarning", "", "allowsPurchases", "shouldErrorOnUnsupportedMethods", "<init>", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;ZZ)V", "LTd/L;", "simulateActionInProgress", "()V", "awaitSimulateActionInProgress", "(LZd/e;)Ljava/lang/Object;", "", b.f34648f, "unsupportedMethod", "(Ljava/lang/String;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;", "loadedLegacyState", "()Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;", "trackPaywallImpressionIfNeeded", "Lcom/revenuecat/purchases/paywalls/events/ExitOfferType;", "exitOfferType", "exitOfferingIdentifier", "trackExitOffer", "(Lcom/revenuecat/purchases/paywalls/events/ExitOfferType;Ljava/lang/String;)V", "refreshStateIfLocaleChanged", "LU/l;", "colorScheme", "isDarkMode", "refreshStateIfColorsChanged", "(LU/l;Z)V", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;", "packageToSelect", "selectPackage", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;", "result", "closePaywall", "(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout;", "launchWebCheckout", "getWebCheckoutUrl", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout;)Ljava/lang/String;", "invalidateCustomerInfoCache", "Landroid/app/Activity;", "activity", "purchaseSelectedPackage", "(Landroid/app/Activity;)V", "Lcom/revenuecat/purchases/Package;", "pkg", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "resolvedOffer", "handlePackagePurchase", "(Landroid/app/Activity;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;LZd/e;)Ljava/lang/Object;", "restorePurchases", "handleRestorePurchases", "clearActionError", "preloadExitOffering", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;", "options", "updateOptions", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;)V", "Z", "LY/h2;", "purchaseCompleted", "LY/h2;", "getPurchaseCompleted", "()LY/h2;", "preloadedExitOffering", "getPreloadedExitOffering", "LJf/u;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState;", "_state", "LJf/u;", "LY/C0;", "_actionInProgress", "LY/C0;", "Lcom/revenuecat/purchases/PurchasesError;", "_actionError", "", "<set-?>", "trackPaywallImpressionIfNeededCallCount", "I", "getTrackPaywallImpressionIfNeededCallCount", "()I", "trackExitOfferCallCount", "getTrackExitOfferCallCount", "", "Lkotlin/Pair;", "trackExitOfferParams", "Ljava/util/List;", "getTrackExitOfferParams", "()Ljava/util/List;", "refreshStateIfLocaleChangedCallCount", "getRefreshStateIfLocaleChangedCallCount", "refreshStateIfColorsChangedCallCount", "getRefreshStateIfColorsChangedCallCount", "selectPackageCallCount", "getSelectPackageCallCount", "selectPackageCallParams", "getSelectPackageCallParams", "closePaywallCallCount", "getClosePaywallCallCount", "getWebCheckoutUrlCallCount", "getGetWebCheckoutUrlCallCount", "getWebCheckoutUrlParams", "getGetWebCheckoutUrlParams", "invalidateCustomerInfoCacheCallCount", "getInvalidateCustomerInfoCacheCallCount", "purchaseSelectedPackageCallCount", "getPurchaseSelectedPackageCallCount", "purchaseSelectedPackageParams", "getPurchaseSelectedPackageParams", "purchaseSelectedPackageIdentifiers", "getPurchaseSelectedPackageIdentifiers", "handlePackagePurchaseCount", "getHandlePackagePurchaseCount", "handlePackagePurchaseParams", "getHandlePackagePurchaseParams", "restorePurchasesCallCount", "getRestorePurchasesCallCount", "handleRestorePurchasesCallCount", "getHandleRestorePurchasesCallCount", "clearActionErrorCallCount", "getClearActionErrorCallCount", "preloadExitOfferingCallCount", "getPreloadExitOfferingCallCount", "updateOptionsCallCount", "getUpdateOptionsCallCount", "updateOptionsParams", "getUpdateOptionsParams", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;", "getResourceProvider", "()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;", "resourceProvider", "LJf/I;", "getState", "()LJf/I;", "state", "getActionInProgress", "actionInProgress", "getActionError", "actionError", "Companion", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MockViewModel extends U implements PaywallViewModel {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    private static final long MILLIS_2025_01_25 = 1737763200000L;

    @Deprecated
    public static final long fakePurchaseDelayMillis = 2000;
    private final C0 _actionError;
    private final C0 _actionInProgress;
    private final u _state;
    private final boolean allowsPurchases;
    private int clearActionErrorCallCount;
    private int closePaywallCallCount;
    private int getWebCheckoutUrlCallCount;
    private List<PaywallAction.External.LaunchWebCheckout> getWebCheckoutUrlParams;
    private int handlePackagePurchaseCount;
    private List<Pair<Activity, Package>> handlePackagePurchaseParams;
    private int handleRestorePurchasesCallCount;
    private int invalidateCustomerInfoCacheCallCount;
    private int preloadExitOfferingCallCount;
    private final h2 preloadedExitOffering;
    private final h2 purchaseCompleted;
    private int purchaseSelectedPackageCallCount;
    private List<String> purchaseSelectedPackageIdentifiers;
    private List<Activity> purchaseSelectedPackageParams;
    private int refreshStateIfColorsChangedCallCount;
    private int refreshStateIfLocaleChangedCallCount;
    private int restorePurchasesCallCount;
    private int selectPackageCallCount;
    private List<TemplateConfiguration.PackageInfo> selectPackageCallParams;
    private final boolean shouldErrorOnUnsupportedMethods;
    private int trackExitOfferCallCount;
    private List<Pair<ExitOfferType, String>> trackExitOfferParams;
    private int trackPaywallImpressionIfNeededCallCount;
    private int updateOptionsCallCount;
    private List<PaywallOptions> updateOptionsParams;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/MockViewModel$Companion;", "", "()V", "MILLIS_2025_01_25", "", "fakePurchaseDelayMillis", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel$awaitSimulateActionInProgress$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel", f = "TestData.kt", l = {699}, m = "awaitSimulateActionInProgress")
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
            return MockViewModel.this.awaitSimulateActionInProgress(this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel$simulateActionInProgress$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel$simulateActionInProgress$1", f = "TestData.kt", l = {693}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
    static final class C44321 extends l implements Function2 {
        int label;

        C44321(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return MockViewModel.this.new C44321(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, e eVar) {
            return ((C44321) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.label;
            if (i10 == 0) {
                v.b(obj);
                MockViewModel mockViewModel = MockViewModel.this;
                this.label = 1;
                if (mockViewModel.awaitSimulateActionInProgress(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return L.f17438a;
        }
    }

    public /* synthetic */ MockViewModel(PaywallMode paywallMode, Offering offering, PaywallWarning paywallWarning, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? PaywallMode.INSTANCE.getDefault() : paywallMode, offering, (i10 & 4) != 0 ? null : paywallWarning, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? true : z11);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object awaitSimulateActionInProgress(Zd.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel$awaitSimulateActionInProgress$1 r0 = (com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel$awaitSimulateActionInProgress$1 r0 = new com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel$awaitSimulateActionInProgress$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel r0 = (com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel) r0
            Td.v.b(r5)
            goto L4f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            Td.v.b(r5)
            Y.C0 r5 = r4._actionInProgress
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.b.a(r3)
            r5.setValue(r2)
            r0.L$0 = r4
            r0.label = r3
            r2 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r5 = Gf.Z.a(r2, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r0 = r4
        L4f:
            Y.C0 r5 = r0._actionInProgress
            r0 = 0
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r0)
            r5.setValue(r0)
            Td.L r5 = Td.L.f17438a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel.awaitSimulateActionInProgress(Zd.e):java.lang.Object");
    }

    private final void simulateActionInProgress() {
        AbstractC1617k.d(V.a(this), null, null, new C44321(null), 3, null);
    }

    private final void unsupportedMethod(String str) {
        if (this.shouldErrorOnUnsupportedMethods) {
            throw new IllegalStateException(str.toString());
        }
    }

    static /* synthetic */ void unsupportedMethod$default(MockViewModel mockViewModel, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "Not supported";
        }
        mockViewModel.unsupportedMethod(str);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void clearActionError() {
        this.clearActionErrorCallCount++;
        this._actionError.setValue(null);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void closePaywall(PaywallResult result) {
        this.closePaywallCallCount++;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public h2 getActionError() {
        return this._actionError;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public h2 getActionInProgress() {
        return this._actionInProgress;
    }

    public final int getClearActionErrorCallCount() {
        return this.clearActionErrorCallCount;
    }

    public final int getClosePaywallCallCount() {
        return this.closePaywallCallCount;
    }

    public final int getGetWebCheckoutUrlCallCount() {
        return this.getWebCheckoutUrlCallCount;
    }

    public final List<PaywallAction.External.LaunchWebCheckout> getGetWebCheckoutUrlParams() {
        return this.getWebCheckoutUrlParams;
    }

    public final int getHandlePackagePurchaseCount() {
        return this.handlePackagePurchaseCount;
    }

    public final List<Pair<Activity, Package>> getHandlePackagePurchaseParams() {
        return this.handlePackagePurchaseParams;
    }

    public final int getHandleRestorePurchasesCallCount() {
        return this.handleRestorePurchasesCallCount;
    }

    public final int getInvalidateCustomerInfoCacheCallCount() {
        return this.invalidateCustomerInfoCacheCallCount;
    }

    public final int getPreloadExitOfferingCallCount() {
        return this.preloadExitOfferingCallCount;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public h2 getPreloadedExitOffering() {
        return this.preloadedExitOffering;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public h2 getPurchaseCompleted() {
        return this.purchaseCompleted;
    }

    public final int getPurchaseSelectedPackageCallCount() {
        return this.purchaseSelectedPackageCallCount;
    }

    public final List<String> getPurchaseSelectedPackageIdentifiers() {
        return this.purchaseSelectedPackageIdentifiers;
    }

    public final List<Activity> getPurchaseSelectedPackageParams() {
        return this.purchaseSelectedPackageParams;
    }

    public final int getRefreshStateIfColorsChangedCallCount() {
        return this.refreshStateIfColorsChangedCallCount;
    }

    public final int getRefreshStateIfLocaleChangedCallCount() {
        return this.refreshStateIfLocaleChangedCallCount;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public ResourceProvider getResourceProvider() {
        return new MockResourceProvider(null, null, null, null, null, 31, null);
    }

    public final int getRestorePurchasesCallCount() {
        return this.restorePurchasesCallCount;
    }

    public final int getSelectPackageCallCount() {
        return this.selectPackageCallCount;
    }

    public final List<TemplateConfiguration.PackageInfo> getSelectPackageCallParams() {
        return this.selectPackageCallParams;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public I getState() {
        return AbstractC1744g.b(this._state);
    }

    public final int getTrackExitOfferCallCount() {
        return this.trackExitOfferCallCount;
    }

    public final List<Pair<ExitOfferType, String>> getTrackExitOfferParams() {
        return this.trackExitOfferParams;
    }

    public final int getTrackPaywallImpressionIfNeededCallCount() {
        return this.trackPaywallImpressionIfNeededCallCount;
    }

    public final int getUpdateOptionsCallCount() {
        return this.updateOptionsCallCount;
    }

    public final List<PaywallOptions> getUpdateOptionsParams() {
        return this.updateOptionsParams;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public String getWebCheckoutUrl(PaywallAction.External.LaunchWebCheckout launchWebCheckout) {
        AbstractC5504s.h(launchWebCheckout, "launchWebCheckout");
        this.getWebCheckoutUrlCallCount++;
        this.getWebCheckoutUrlParams.add(launchWebCheckout);
        return null;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public Object handlePackagePurchase(Activity activity, Package r22, ResolvedOffer resolvedOffer, e eVar) {
        this.handlePackagePurchaseCount++;
        this.handlePackagePurchaseParams.add(z.a(activity, r22));
        if (this.allowsPurchases) {
            simulateActionInProgress();
        } else {
            unsupportedMethod("Can't purchase mock view model");
        }
        return L.f17438a;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public Object handleRestorePurchases(e eVar) {
        this.handleRestorePurchasesCallCount++;
        if (this.allowsPurchases) {
            simulateActionInProgress();
        } else {
            unsupportedMethod("Can't restore purchases");
        }
        return L.f17438a;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void invalidateCustomerInfoCache() {
        this.invalidateCustomerInfoCacheCallCount++;
    }

    public final PaywallState.Loaded.Legacy loadedLegacyState() {
        return PaywallStateKt.loadedLegacy((PaywallState) getState().getValue());
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void preloadExitOffering() {
        this.preloadExitOfferingCallCount++;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void purchaseSelectedPackage(Activity activity) {
        C0 selectedPackage;
        TemplateConfiguration.PackageInfo packageInfo;
        Package rcPackage;
        this.purchaseSelectedPackageCallCount++;
        this.purchaseSelectedPackageParams.add(activity);
        List<String> list = this.purchaseSelectedPackageIdentifiers;
        PaywallState.Loaded.Legacy legacyLoadedLegacyState = loadedLegacyState();
        list.add((legacyLoadedLegacyState == null || (selectedPackage = legacyLoadedLegacyState.getSelectedPackage()) == null || (packageInfo = (TemplateConfiguration.PackageInfo) selectedPackage.getValue()) == null || (rcPackage = packageInfo.getRcPackage()) == null) ? null : rcPackage.getIdentifier());
        if (this.allowsPurchases) {
            simulateActionInProgress();
        } else {
            unsupportedMethod("Can't purchase mock view model");
        }
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void refreshStateIfColorsChanged(C2175l colorScheme, boolean isDarkMode) {
        AbstractC5504s.h(colorScheme, "colorScheme");
        this.refreshStateIfColorsChangedCallCount++;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void refreshStateIfLocaleChanged() {
        this.refreshStateIfLocaleChangedCallCount++;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void restorePurchases() {
        this.restorePurchasesCallCount++;
        if (this.allowsPurchases) {
            simulateActionInProgress();
        } else {
            unsupportedMethod("Can't restore purchases");
        }
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void selectPackage(TemplateConfiguration.PackageInfo packageToSelect) {
        L l10;
        AbstractC5504s.h(packageToSelect, "packageToSelect");
        this.selectPackageCallCount++;
        this.selectPackageCallParams.add(packageToSelect);
        PaywallState.Loaded.Legacy legacyLoadedLegacyState = loadedLegacyState();
        if (legacyLoadedLegacyState != null) {
            legacyLoadedLegacyState.selectPackage(packageToSelect);
            l10 = L.f17438a;
        } else {
            l10 = null;
        }
        if (l10 == null) {
            unsupportedMethod$default(this, null, 1, null);
        }
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void trackExitOffer(ExitOfferType exitOfferType, String exitOfferingIdentifier) {
        AbstractC5504s.h(exitOfferType, "exitOfferType");
        AbstractC5504s.h(exitOfferingIdentifier, "exitOfferingIdentifier");
        this.trackExitOfferCallCount++;
        this.trackExitOfferParams.add(new Pair<>(exitOfferType, exitOfferingIdentifier));
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void trackPaywallImpressionIfNeeded() {
        this.trackPaywallImpressionIfNeededCallCount++;
    }

    public final void updateOptions(PaywallOptions options) {
        AbstractC5504s.h(options, "options");
        this.updateOptionsCallCount++;
        this.updateOptionsParams.add(options);
    }

    public MockViewModel(PaywallMode mode, Offering offering, PaywallWarning paywallWarning, boolean z10, boolean z11) {
        Object componentsPaywallState$default;
        AbstractC5504s.h(mode, "mode");
        AbstractC5504s.h(offering, "offering");
        this.allowsPurchases = z10;
        this.shouldErrorOnUnsupportedMethods = z11;
        Boolean bool = Boolean.FALSE;
        this.purchaseCompleted = b2.e(bool, null, 2, null);
        this.preloadedExitOffering = b2.e(null, null, 2, null);
        PaywallValidationResult paywallValidationResultValidatedPaywall = OfferingToStateMapperKt.validatedPaywall(offering, TestData.Constants.INSTANCE.getCurrentColorScheme(), getResourceProvider());
        if (paywallValidationResultValidatedPaywall instanceof PaywallValidationResult.Legacy) {
            PaywallValidationResult.Legacy legacy = (PaywallValidationResult.Legacy) paywallValidationResultValidatedPaywall;
            componentsPaywallState$default = OfferingToStateMapperKt.toLegacyPaywallState(offering, new VariableDataProvider(getResourceProvider(), false, 2, null), mode, legacy.getDisplayablePaywall(), legacy.getTemplate(), false, "US", paywallWarning);
        } else if (paywallValidationResultValidatedPaywall instanceof PaywallValidationResult.Components) {
            componentsPaywallState$default = OfferingToStateMapperKt.toComponentsPaywallState$default(offering, (PaywallValidationResult.Components) paywallValidationResultValidatedPaywall, null, MockViewModel$_state$1.INSTANCE, new MockPurchasesType(null, null, null, null, 15, null), null, null, 48, null);
        } else {
            throw new r();
        }
        this._state = K.a(componentsPaywallState$default);
        this._actionInProgress = b2.e(bool, null, 2, null);
        this._actionError = b2.e(null, null, 2, null);
        this.trackExitOfferParams = new ArrayList();
        this.selectPackageCallParams = new ArrayList();
        this.getWebCheckoutUrlParams = new ArrayList();
        this.purchaseSelectedPackageParams = new ArrayList();
        this.purchaseSelectedPackageIdentifiers = new ArrayList();
        this.handlePackagePurchaseParams = new ArrayList();
        this.updateOptionsParams = new ArrayList();
    }
}
