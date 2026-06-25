package com.revenuecat.purchases.ui.revenuecatui.data;

import G1.i;
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
import Ud.AbstractC2279u;
import Ud.S;
import Y.C0;
import Y.b2;
import Y.h2;
import Zd.e;
import ae.AbstractC2605b;
import android.app.Activity;
import android.os.LocaleList;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import app.notifee.core.event.LogEvent;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PurchasesAreCompletedBy;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesException;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.models.GoogleStoreProduct;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.paywalls.components.common.ExitOffer;
import com.revenuecat.purchases.paywalls.components.common.ExitOffers;
import com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData;
import com.revenuecat.purchases.paywalls.components.common.ProductChangeConfig;
import com.revenuecat.purchases.paywalls.events.ExitOfferType;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.paywalls.events.PaywallEventType;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import com.revenuecat.purchases.ui.revenuecatui.PaywallListener;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.PaywallModeKt;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.PaywallPurchaseLogic;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableDataProvider;
import com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError;
import com.revenuecat.purchases.ui.revenuecatui.helpers.LocaleHelpersKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyList;
import com.revenuecat.purchases.ui.revenuecatui.helpers.OfferingToStateMapperKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallValidationResult;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider;
import com.revenuecat.purchases.ui.revenuecatui.strings.PaywallValidationErrorStrings;
import com.revenuecat.purchases.ui.revenuecatui.utils.URIExtensionsKt;
import ie.InterfaceC5082a;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¨\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B[\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ6\u0010\"\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010!\u001a\u0004\u0018\u00010 H\u0082@¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001bH\u0002¢\u0006\u0004\b&\u0010%J\u000f\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u0013\u0010+\u001a\u00020**\u00020'H\u0002¢\u0006\u0004\b+\u0010,J1\u00104\u001a\u0002032\u0006\u0010.\u001a\u00020-2\u0006\u0010\n\u001a\u00020\t2\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000bH\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u001bH\u0002¢\u0006\u0004\b8\u0010%J\u000f\u00109\u001a\u00020\u001bH\u0002¢\u0006\u0004\b9\u0010%J\u0017\u0010;\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020\u001eH\u0002¢\u0006\u0004\b;\u0010<J\u001f\u0010?\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u001bH\u0002¢\u0006\u0004\bA\u0010%J\u0017\u0010D\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010EJ\u0011\u0010G\u001a\u0004\u0018\u00010FH\u0002¢\u0006\u0004\bG\u0010HJ\u0015\u0010G\u001a\u0004\u0018\u00010F*\u00020IH\u0002¢\u0006\u0004\bG\u0010JJ\u0015\u0010G\u001a\u0004\u0018\u00010F*\u00020KH\u0002¢\u0006\u0004\bG\u0010LJ#\u0010O\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020N0M2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\bO\u0010PJ\u0015\u0010Q\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u001bH\u0016¢\u0006\u0004\bS\u0010%J\u001f\u0010U\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010T\u001a\u00020\u000bH\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010Y\u001a\u00020\u001b2\u0006\u0010X\u001a\u00020WH\u0016¢\u0006\u0004\bY\u0010ZJ\u0019\u0010]\u001a\u00020\u001b2\b\u0010\\\u001a\u0004\u0018\u00010[H\u0016¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\u001bH\u0016¢\u0006\u0004\b_\u0010%J\u0019\u0010b\u001a\u0004\u0018\u00010/2\u0006\u0010a\u001a\u00020`H\u0016¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020\u001bH\u0016¢\u0006\u0004\bd\u0010%J\u0019\u0010e\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\be\u0010fJ\u000f\u0010g\u001a\u00020\u001bH\u0016¢\u0006\u0004\bg\u0010%J\u000f\u0010h\u001a\u00020\u001bH\u0016¢\u0006\u0004\bh\u0010%J\u000f\u0010i\u001a\u00020\u001bH\u0016¢\u0006\u0004\bi\u0010%J\u001f\u0010m\u001a\u00020\u001b2\u0006\u0010k\u001a\u00020j2\u0006\u0010l\u001a\u00020/H\u0016¢\u0006\u0004\bm\u0010nJ\u0010\u0010o\u001a\u00020\u001bH\u0096@¢\u0006\u0004\bo\u0010pJ,\u0010t\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010q\u001a\u0004\u0018\u00010\u001e2\b\u0010s\u001a\u0004\u0018\u00010rH\u0096@¢\u0006\u0004\bt\u0010uR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010v\u001a\u0004\bw\u0010xR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010yR\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010zR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010{R\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010|R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010}R\u0015\u0010\u007f\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001e\u0010\u0082\u0001\u001a\t\u0012\u0004\u0012\u0002030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001e\u0010\u0085\u0001\u001a\t\u0012\u0004\u0012\u00020\u000b0\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R \u0010\u0087\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010=0\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0086\u0001R\u001e\u0010\u0088\u0001\u001a\t\u0012\u0004\u0012\u00020\u000b0\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0086\u0001R \u0010\u0089\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010-0\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0086\u0001R\u001e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00020'0\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0083\u0001R\u001e\u0010\u008b\u0001\u001a\t\u0012\u0004\u0012\u00020\t0\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0083\u0001R\u001b\u0010\u008c\u0001\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001a\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008e\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0016\u00102\u001a\u0002018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001a\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0094\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001c\u0010\u009b\u0001\u001a\u00030\u0098\u0001*\u00020-8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001e\u0010\u009f\u0001\u001a\t\u0012\u0004\u0012\u0002030\u009c\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001e\u0010£\u0001\u001a\t\u0012\u0004\u0012\u00020\u000b0 \u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R \u0010¥\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010=0 \u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¤\u0001\u0010¢\u0001R\u001e\u0010§\u0001\u001a\t\u0012\u0004\u0012\u00020\u000b0 \u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010¢\u0001R \u0010©\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010-0 \u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¨\u0001\u0010¢\u0001¨\u0006ª\u0001"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;", "Landroidx/lifecycle/U;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;", "resourceProvider", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;", "purchases", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;", "options", "LU/l;", "colorScheme", "", "isDarkMode", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/CustomerInfo;", "shouldDisplayBlock", "preview", "Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator;", "productChangeCalculator", "<init>", "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;LU/l;ZLkotlin/jvm/functions/Function1;ZLcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator;)V", "Landroid/app/Activity;", "activity", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$SelectedPackageInfo;", "packageInfo", "Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;", "productChangeConfig", "LTd/L;", "performPurchaseIfNecessary", "(Landroid/app/Activity;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$SelectedPackageInfo;Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;LZd/e;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/Package;", "packageToPurchase", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "subscriptionOption", "performPurchase", "(Landroid/app/Activity;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;Lcom/revenuecat/purchases/models/SubscriptionOption;LZd/e;)Ljava/lang/Object;", "validateState", "()V", "updateState", "LG1/i;", "getCurrentLocaleList", "()LG1/i;", "Landroid/os/LocaleList;", "toFrameworkLocaleList", "(LG1/i;)Landroid/os/LocaleList;", "Lcom/revenuecat/purchases/Offering;", "offering", "", "storefrontCountryCode", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;", "mode", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState;", "calculateState", "(Lcom/revenuecat/purchases/Offering;LU/l;Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;)Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState;", "verifyNoActionInProgressOrStartAction", "()Z", "finishAction", "trackPaywallClose", "rcPackage", "trackPaywallPurchaseInitiated", "(Lcom/revenuecat/purchases/Package;)V", "Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "trackPaywallPurchaseError", "(Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/PurchasesError;)V", "trackPaywallCancel", "Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;", "eventType", "track", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;)V", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "createEventData", "()Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;)Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;)Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "extractDefaultCustomVariables", "(Lcom/revenuecat/purchases/Offering;)Ljava/util/Map;", "updateOptions", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;)V", "refreshStateIfLocaleChanged", "isDark", "refreshStateIfColorsChanged", "(LU/l;Z)V", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;", "packageToSelect", "selectPackage", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;", "result", "closePaywall", "(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;)V", "preloadExitOffering", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout;", "launchWebCheckout", "getWebCheckoutUrl", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout;)Ljava/lang/String;", "invalidateCustomerInfoCache", "purchaseSelectedPackage", "(Landroid/app/Activity;)V", "restorePurchases", "clearActionError", "trackPaywallImpressionIfNeeded", "Lcom/revenuecat/purchases/paywalls/events/ExitOfferType;", "exitOfferType", "exitOfferingIdentifier", "trackExitOffer", "(Lcom/revenuecat/purchases/paywalls/events/ExitOfferType;Ljava/lang/String;)V", "handleRestorePurchases", "(LZd/e;)Ljava/lang/Object;", "pkg", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "resolvedOffer", "handlePackagePurchase", "(Landroid/app/Activity;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;LZd/e;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;", "getResourceProvider", "()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;", "Z", "Lkotlin/jvm/functions/Function1;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;", "variableDataProvider", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;", "LJf/u;", "_state", "LJf/u;", "LY/C0;", "_actionInProgress", "LY/C0;", "_actionError", "_purchaseCompleted", "_preloadedExitOffering", "_lastLocaleList", "_colorScheme", "paywallPresentationData", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;", "getListener", "()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;", "listener", "getMode", "()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;", "getPurchaseLogic", "()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;", "purchaseLogic", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext", "(Lcom/revenuecat/purchases/Offering;)Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "LJf/I;", "getState", "()LJf/I;", "state", "LY/h2;", "getActionInProgress", "()LY/h2;", "actionInProgress", "getActionError", "actionError", "getPurchaseCompleted", "purchaseCompleted", "getPreloadedExitOffering", "preloadedExitOffering", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallViewModelImpl extends U implements PaywallViewModel {
    public static final int $stable = 0;
    private final C0 _actionError;
    private final C0 _actionInProgress;
    private final u _colorScheme;
    private final u _lastLocaleList;
    private final C0 _preloadedExitOffering;
    private final C0 _purchaseCompleted;
    private final u _state;
    private boolean isDarkMode;
    private PaywallOptions options;
    private PaywallEvent.Data paywallPresentationData;
    private final ProductChangeCalculator productChangeCalculator;
    private final PurchasesType purchases;
    private final ResourceProvider resourceProvider;
    private final Function1 shouldDisplayBlock;
    private final VariableDataProvider variableDataProvider;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchasesAreCompletedBy.values().length];
            try {
                iArr[PurchasesAreCompletedBy.MY_APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchasesAreCompletedBy.REVENUECAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl$calculateState$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/Date;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements InterfaceC5082a {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Date invoke() {
            return new Date();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl$handlePackagePurchase$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl", f = "PaywallViewModel.kt", l = {425, 441}, m = "handlePackagePurchase")
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
            return PaywallViewModelImpl.this.handlePackagePurchase(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl$handleRestorePurchases$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl", f = "PaywallViewModel.kt", l = {849, 358, 359, 361, 392}, m = "handleRestorePurchases")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44221 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C44221(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaywallViewModelImpl.this.handleRestorePurchases(this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl$performPurchase$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl", f = "PaywallViewModel.kt", l = {476, 491, 510, 513, 557}, m = "performPurchase")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44231 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C44231(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaywallViewModelImpl.this.performPurchase(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl$preloadExitOffering$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl$preloadExitOffering$1", f = "PaywallViewModel.kt", l = {230}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
    static final class C44241 extends l implements Function2 {
        Object L$0;
        Object L$1;
        int label;

        C44241(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return PaywallViewModelImpl.this.new C44241(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, e eVar) {
            return ((C44241) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Offering offering;
            String offeringId;
            C0 c02;
            C0 c03;
            Offering.PaywallComponents paywallComponents;
            PaywallComponentsData data;
            ExitOffers exitOffers;
            ExitOffer dismiss;
            Object objF = AbstractC2605b.f();
            int i10 = this.label;
            try {
            } catch (PurchasesException e10) {
                Logger.INSTANCE.e("Failed to preload exit offering", e10);
            }
            if (i10 == 0) {
                v.b(obj);
                PaywallState paywallState = (PaywallState) PaywallViewModelImpl.this._state.getValue();
                offering = null;
                Offering offering2 = paywallState instanceof PaywallState.Loaded.Legacy ? ((PaywallState.Loaded.Legacy) paywallState).getOffering() : paywallState instanceof PaywallState.Loaded.Components ? ((PaywallState.Loaded.Components) paywallState).getOffering() : null;
                offeringId = (offering2 == null || (paywallComponents = offering2.getPaywallComponents()) == null || (data = paywallComponents.getData()) == null || (exitOffers = data.getExitOffers()) == null || (dismiss = exitOffers.getDismiss()) == null) ? null : dismiss.getOfferingId();
                c02 = PaywallViewModelImpl.this._preloadedExitOffering;
                if (offeringId != null) {
                    PurchasesType purchasesType = PaywallViewModelImpl.this.purchases;
                    this.L$0 = offeringId;
                    this.L$1 = c02;
                    this.label = 1;
                    Object objAwaitOfferings = purchasesType.awaitOfferings(this);
                    if (objAwaitOfferings == objF) {
                        return objF;
                    }
                    c03 = c02;
                    obj = objAwaitOfferings;
                }
                c02.setValue(offering);
                return L.f17438a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c03 = (C0) this.L$1;
            offeringId = (String) this.L$0;
            v.b(obj);
            offering = ((Offerings) obj).get(offeringId);
            if (offering == null) {
                Logger.INSTANCE.e("Exit offering with ID '" + offeringId + "' not found in available offerings. Exit offer will not be displayed.");
            }
            c02 = c03;
            c02.setValue(offering);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl$purchaseSelectedPackage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl$purchaseSelectedPackage$1", f = "PaywallViewModel.kt", l = {290}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
    static final class C44251 extends l implements Function2 {
        final /* synthetic */ Activity $activity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44251(Activity activity, e eVar) {
            super(2, eVar);
            this.$activity = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return PaywallViewModelImpl.this.new C44251(this.$activity, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, e eVar) {
            return ((C44251) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.label;
            if (i10 == 0) {
                v.b(obj);
                PaywallViewModelImpl paywallViewModelImpl = PaywallViewModelImpl.this;
                Activity activity = this.$activity;
                this.label = 1;
                if (PaywallViewModel.DefaultImpls.handlePackagePurchase$default(paywallViewModelImpl, activity, null, null, this, 4, null) == objF) {
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl$restorePurchases$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl$restorePurchases$1", f = "PaywallViewModel.kt", l = {296}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
    static final class C44261 extends l implements Function2 {
        int label;

        C44261(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return PaywallViewModelImpl.this.new C44261(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, e eVar) {
            return ((C44261) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.label;
            if (i10 == 0) {
                v.b(obj);
                PaywallViewModelImpl paywallViewModelImpl = PaywallViewModelImpl.this;
                this.label = 1;
                if (paywallViewModelImpl.handleRestorePurchases(this) == objF) {
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl$updateState$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl$updateState$1", f = "PaywallViewModel.kt", l = {595, 603}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
    static final class C44271 extends l implements Function2 {
        Object L$0;
        int label;

        C44271(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return PaywallViewModelImpl.this.new C44271(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, e eVar) {
            return ((C44271) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x008f, code lost:
        
            if (r6 == r0) goto L40;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x006a A[Catch: PurchasesException -> 0x0013, TryCatch #0 {PurchasesException -> 0x0013, blocks: (B:6:0x000e, B:41:0x0092, B:43:0x009a, B:44:0x00ab, B:13:0x0022, B:25:0x0055, B:27:0x006a, B:31:0x0074, B:16:0x0029, B:18:0x0037, B:19:0x003e, B:21:0x0042, B:36:0x007f, B:38:0x0083, B:45:0x00d9, B:46:0x00de), top: B:50:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                Method dump skipped, instruction units count: 281
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl.C44271.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PaywallViewModelImpl(ResourceProvider resourceProvider, PurchasesType purchasesType, PaywallOptions paywallOptions, C2175l c2175l, boolean z10, Function1 function1, boolean z11, ProductChangeCalculator productChangeCalculator, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        PurchasesType purchasesImpl = (i10 & 2) != 0 ? new PurchasesImpl(null, 1, 0 == true ? 1 : 0) : purchasesType;
        this(resourceProvider, purchasesImpl, paywallOptions, c2175l, z10, function1, (i10 & 64) != 0 ? false : z11, (i10 & 128) != 0 ? new ProductChangeCalculator(purchasesImpl) : productChangeCalculator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaywallState calculateState(Offering offering, C2175l colorScheme, String storefrontCountryCode, PaywallMode mode) {
        if (offering.getAvailablePackages().isEmpty()) {
            return new PaywallState.Error("No packages available");
        }
        PaywallValidationResult paywallValidationResultValidatedPaywall = OfferingToStateMapperKt.validatedPaywall(offering, colorScheme, getResourceProvider());
        if ((paywallValidationResultValidatedPaywall instanceof PaywallValidationResult.Components) && !PaywallModeKt.isFullScreen(mode)) {
            paywallValidationResultValidatedPaywall = OfferingToStateMapperKt.fallbackPaywall(offering, colorScheme, getResourceProvider(), PaywallValidationError.InvalidModeForComponentsPaywall.INSTANCE);
        }
        NonEmptyList<PaywallValidationError> errors = paywallValidationResultValidatedPaywall.getErrors();
        if (errors != null) {
            Iterator<PaywallValidationError> it = errors.iterator();
            while (it.hasNext()) {
                Logger.INSTANCE.e(it.next().associatedErrorString(offering));
            }
            Logger.INSTANCE.e(PaywallValidationErrorStrings.DISPLAYING_DEFAULT);
        }
        if (paywallValidationResultValidatedPaywall instanceof PaywallValidationResult.Legacy) {
            PaywallValidationResult.Legacy legacy = (PaywallValidationResult.Legacy) paywallValidationResultValidatedPaywall;
            return OfferingToStateMapperKt.toLegacyPaywallState(offering, this.variableDataProvider, mode, legacy.getDisplayablePaywall(), legacy.getTemplate(), this.options.getShouldDisplayDismissButton(), storefrontCountryCode, legacy.getWarning());
        }
        if (paywallValidationResultValidatedPaywall instanceof PaywallValidationResult.Components) {
            return OfferingToStateMapperKt.toComponentsPaywallState(offering, (PaywallValidationResult.Components) paywallValidationResultValidatedPaywall, storefrontCountryCode, AnonymousClass2.INSTANCE, this.purchases, this.options.getCustomVariables(), extractDefaultCustomVariables(offering));
        }
        throw new r();
    }

    private final PaywallEvent.Data createEventData() {
        PaywallState paywallState = (PaywallState) getState().getValue();
        if (paywallState instanceof PaywallState.Loaded.Legacy) {
            return createEventData((PaywallState.Loaded.Legacy) paywallState);
        }
        if (paywallState instanceof PaywallState.Loaded.Components) {
            return createEventData((PaywallState.Loaded.Components) paywallState);
        }
        if (!(paywallState instanceof PaywallState.Error ? true : paywallState instanceof PaywallState.Loading)) {
            throw new r();
        }
        Logger.INSTANCE.e("Unexpected state trying to create event data: " + paywallState);
        return null;
    }

    private final Map<String, CustomVariableValue> extractDefaultCustomVariables(Offering offering) {
        UiConfig uiConfig;
        Map customVariables;
        Offering.PaywallComponents paywallComponents = offering.getPaywallComponents();
        if (paywallComponents == null || (uiConfig = paywallComponents.getUiConfig()) == null || (customVariables = uiConfig.getCustomVariables()) == null) {
            return S.i();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(S.e(customVariables.size()));
        for (Map.Entry entry : customVariables.entrySet()) {
            linkedHashMap.put(entry.getKey(), CustomVariableValue.INSTANCE.from(((UiConfig.CustomVariableDefinition) entry.getValue()).getDefaultValue()));
        }
        return linkedHashMap;
    }

    private final void finishAction() {
        this._actionInProgress.setValue(Boolean.FALSE);
    }

    private final i getCurrentLocaleList() {
        String preferredUILocaleOverride = this.purchases.getPreferredUILocaleOverride();
        if (preferredUILocaleOverride == null) {
            i iVarD = i.d();
            AbstractC5504s.g(iVarD, "getDefault()");
            return iVarD;
        }
        try {
            i iVarA = i.a(LocaleHelpersKt.createLocaleFromString(preferredUILocaleOverride));
            AbstractC5504s.g(iVarA, "create(locale)");
            return iVarA;
        } catch (IllegalArgumentException e10) {
            Logger.INSTANCE.e("Invalid preferred locale format: " + preferredUILocaleOverride + ". Using system default.", e10);
            i iVarD2 = i.d();
            AbstractC5504s.g(iVarD2, "{\n            Logger.e(\"…at.getDefault()\n        }");
            return iVarD2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaywallListener getListener() {
        return this.options.getListener();
    }

    private final PaywallMode getMode() {
        return this.options.getMode();
    }

    private final PresentedOfferingContext getPresentedOfferingContext(Offering offering) {
        PresentedOfferingContext presentedOfferingContext;
        Package r02 = (Package) AbstractC2279u.o0(offering.getAvailablePackages());
        return (r02 == null || (presentedOfferingContext = r02.getPresentedOfferingContext()) == null) ? new PresentedOfferingContext(offering.getIdentifier()) : presentedOfferingContext;
    }

    private final PaywallPurchaseLogic getPurchaseLogic() {
        return this.options.getPurchaseLogic();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x027b A[Catch: PurchasesException -> 0x0138, TRY_ENTER, TryCatch #2 {PurchasesException -> 0x0138, blocks: (B:97:0x024a, B:99:0x0250, B:105:0x027b, B:107:0x027f, B:108:0x0283, B:110:0x0287, B:112:0x028f, B:59:0x0135, B:65:0x0144, B:68:0x0156, B:69:0x0174, B:71:0x017a, B:72:0x017d, B:74:0x0183, B:76:0x018c, B:79:0x01a1, B:80:0x01d6, B:77:0x019a, B:89:0x021b, B:92:0x0223, B:94:0x0232, B:113:0x0298, B:114:0x029f), top: B:130:0x0135 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ff A[Catch: PurchasesException -> 0x0049, TryCatch #3 {PurchasesException -> 0x0049, blocks: (B:16:0x0044, B:84:0x01ee, B:86:0x01ff, B:87:0x020a, B:23:0x005e, B:103:0x0262), top: B:131:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021b A[Catch: PurchasesException -> 0x0138, TRY_ENTER, TryCatch #2 {PurchasesException -> 0x0138, blocks: (B:97:0x024a, B:99:0x0250, B:105:0x027b, B:107:0x027f, B:108:0x0283, B:110:0x0287, B:112:0x028f, B:59:0x0135, B:65:0x0144, B:68:0x0156, B:69:0x0174, B:71:0x017a, B:72:0x017d, B:74:0x0183, B:76:0x018c, B:79:0x01a1, B:80:0x01d6, B:77:0x019a, B:89:0x021b, B:92:0x0223, B:94:0x0232, B:113:0x0298, B:114:0x029f), top: B:130:0x0135 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0250 A[Catch: PurchasesException -> 0x0138, TRY_LEAVE, TryCatch #2 {PurchasesException -> 0x0138, blocks: (B:97:0x024a, B:99:0x0250, B:105:0x027b, B:107:0x027f, B:108:0x0283, B:110:0x0287, B:112:0x028f, B:59:0x0135, B:65:0x0144, B:68:0x0156, B:69:0x0174, B:71:0x017a, B:72:0x017d, B:74:0x0183, B:76:0x018c, B:79:0x01a1, B:80:0x01d6, B:77:0x019a, B:89:0x021b, B:92:0x0223, B:94:0x0232, B:113:0x0298, B:114:0x029f), top: B:130:0x0135 }] */
    /* JADX WARN: Type inference failed for: r0v25, types: [com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType] */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r2v12, types: [com.revenuecat.purchases.ui.revenuecatui.data.ProductChangeCalculator] */
    /* JADX WARN: Type inference failed for: r2v20, types: [com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2, types: [Zd.e, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl$performPurchase$1] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.revenuecat.purchases.Package] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.revenuecat.purchases.ui.revenuecatui.PaywallPurchaseLogic] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object performPurchase(android.app.Activity r18, com.revenuecat.purchases.Package r19, com.revenuecat.purchases.paywalls.components.common.ProductChangeConfig r20, com.revenuecat.purchases.models.SubscriptionOption r21, Zd.e r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 731
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl.performPurchase(android.app.Activity, com.revenuecat.purchases.Package, com.revenuecat.purchases.paywalls.components.common.ProductChangeConfig, com.revenuecat.purchases.models.SubscriptionOption, Zd.e):java.lang.Object");
    }

    static /* synthetic */ Object performPurchase$default(PaywallViewModelImpl paywallViewModelImpl, Activity activity, Package r82, ProductChangeConfig productChangeConfig, SubscriptionOption subscriptionOption, e eVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            productChangeConfig = null;
        }
        return paywallViewModelImpl.performPurchase(activity, r82, productChangeConfig, subscriptionOption, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object performPurchaseIfNecessary(Activity activity, PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo, ProductChangeConfig productChangeConfig, e eVar) throws Throwable {
        if (selectedPackageInfo == null) {
            Logger.INSTANCE.w("Ignoring purchase request as no package is selected");
            return L.f17438a;
        }
        Package rcPackage = selectedPackageInfo.getRcPackage();
        ResolvedOffer resolvedOffer = selectedPackageInfo.getResolvedOffer();
        Object objPerformPurchase = performPurchase(activity, rcPackage, productChangeConfig, resolvedOffer != null ? resolvedOffer.getSubscriptionOption() : null, eVar);
        return objPerformPurchase == AbstractC2605b.f() ? objPerformPurchase : L.f17438a;
    }

    private final LocaleList toFrameworkLocaleList(i iVar) {
        int iG = iVar.g();
        Locale[] localeArr = new Locale[iG];
        for (int i10 = 0; i10 < iG; i10++) {
            Locale localeC = iVar.c(i10);
            AbstractC5504s.e(localeC);
            localeArr[i10] = localeC;
        }
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, iG));
    }

    private final void track(PaywallEventType eventType) {
        PaywallEvent.Data data = this.paywallPresentationData;
        if (data != null) {
            UUID uuidRandomUUID = UUID.randomUUID();
            AbstractC5504s.g(uuidRandomUUID, "randomUUID()");
            this.purchases.track(new PaywallEvent(new PaywallEvent.CreationData(uuidRandomUUID, new Date()), data, eventType));
            return;
        }
        Logger.INSTANCE.e("Paywall event data is null, not tracking event " + eventType);
    }

    private final void trackPaywallCancel() {
        track(PaywallEventType.CANCEL);
    }

    private final void trackPaywallClose() {
        if (this.paywallPresentationData != null) {
            track(PaywallEventType.CLOSE);
        }
    }

    private final void trackPaywallPurchaseError(Package rcPackage, PurchasesError error) {
        PaywallEvent.Data data = this.paywallPresentationData;
        if (data == null) {
            Logger.INSTANCE.e("Paywall event data is null, not tracking purchase error event");
            return;
        }
        StoreProduct product = rcPackage.getProduct();
        PaywallEvent.Data dataCopy$default = PaywallEvent.Data.copy$default(data, null, null, 0, null, null, null, false, null, null, rcPackage.getIdentifier(), product instanceof GoogleStoreProduct ? ((GoogleStoreProduct) product).getProductId() : product.getId(), Integer.valueOf(error.getCode().getCode()), error.getMessage(), 511, null);
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC5504s.g(uuidRandomUUID, "randomUUID()");
        this.purchases.track(new PaywallEvent(new PaywallEvent.CreationData(uuidRandomUUID, new Date()), dataCopy$default, PaywallEventType.PURCHASE_ERROR));
    }

    private final void trackPaywallPurchaseInitiated(Package rcPackage) {
        PaywallEvent.Data data = this.paywallPresentationData;
        if (data == null) {
            Logger.INSTANCE.e("Paywall event data is null, not tracking purchase initiated event");
            return;
        }
        StoreProduct product = rcPackage.getProduct();
        PaywallEvent.Data dataCopy$default = PaywallEvent.Data.copy$default(data, null, null, 0, null, null, null, false, null, null, rcPackage.getIdentifier(), product instanceof GoogleStoreProduct ? ((GoogleStoreProduct) product).getProductId() : product.getId(), null, null, 6655, null);
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC5504s.g(uuidRandomUUID, "randomUUID()");
        this.purchases.track(new PaywallEvent(new PaywallEvent.CreationData(uuidRandomUUID, new Date()), dataCopy$default, PaywallEventType.PURCHASE_INITIATED));
    }

    private final void updateState() {
        AbstractC1617k.d(V.a(this), null, null, new C44271(null), 3, null);
    }

    private final void validateState() {
        if (this.purchases.getPurchasesAreCompletedBy() == PurchasesAreCompletedBy.MY_APP && this.options.getPurchaseLogic() == null) {
            this._state.setValue(new PaywallState.Error("myAppPurchaseLogic is null, but is required when purchases.purchasesAreCompletedBy is .MY_APP. App purchases will not be successful."));
        }
    }

    private final boolean verifyNoActionInProgressOrStartAction() {
        if (((Boolean) this._actionInProgress.getValue()).booleanValue()) {
            Logger.INSTANCE.d("Ignoring purchase or restore because there already is an action in progress");
            return true;
        }
        this._actionInProgress.setValue(Boolean.TRUE);
        return false;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void clearActionError() {
        this._actionError.setValue(null);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void closePaywall(PaywallResult result) {
        Logger.INSTANCE.d("Paywalls: Close paywall initiated");
        trackPaywallClose();
        Offering offering = !((Boolean) this._purchaseCompleted.getValue()).booleanValue() ? (Offering) this._preloadedExitOffering.getValue() : null;
        if (offering != null) {
            trackExitOffer(ExitOfferType.DISMISS, offering.getIdentifier());
        }
        this.paywallPresentationData = null;
        Function2 dismissRequestWithExitOffering = this.options.getDismissRequestWithExitOffering();
        if (dismissRequestWithExitOffering != null) {
            dismissRequestWithExitOffering.invoke(offering, result);
        } else {
            this.options.getDismissRequest().invoke();
        }
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public h2 getActionError() {
        return this._actionError;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public h2 getActionInProgress() {
        return this._actionInProgress;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public h2 getPreloadedExitOffering() {
        return this._preloadedExitOffering;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public h2 getPurchaseCompleted() {
        return this._purchaseCompleted;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public ResourceProvider getResourceProvider() {
        return this.resourceProvider;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public I getState() {
        return AbstractC1744g.b(this._state);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public String getWebCheckoutUrl(PaywallAction.External.LaunchWebCheckout launchWebCheckout) {
        Pair pairA;
        URL webCheckoutURL;
        String string;
        AbstractC5504s.h(launchWebCheckout, "launchWebCheckout");
        String customUrl = launchWebCheckout.getCustomUrl();
        Object value = getState().getValue();
        PaywallState.Loaded.Components components = value instanceof PaywallState.Loaded.Components ? (PaywallState.Loaded.Components) value : null;
        if (components == null) {
            Logger.INSTANCE.e("Web checkout URL can only be constructed for loaded Components paywalls");
            return null;
        }
        PaywallAction.External.LaunchWebCheckout.PackageParamBehavior packageParamBehavior = launchWebCheckout.getPackageParamBehavior();
        if (packageParamBehavior instanceof PaywallAction.External.LaunchWebCheckout.PackageParamBehavior.Append) {
            PaywallAction.External.LaunchWebCheckout.PackageParamBehavior.Append append = (PaywallAction.External.LaunchWebCheckout.PackageParamBehavior.Append) packageParamBehavior;
            Package rcPackage = append.getRcPackage();
            if (rcPackage == null) {
                PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo = components.getSelectedPackageInfo();
                rcPackage = selectedPackageInfo != null ? selectedPackageInfo.getRcPackage() : null;
            }
            pairA = z.a(rcPackage, append.getPackageParam());
        } else {
            if (!(packageParamBehavior instanceof PaywallAction.External.LaunchWebCheckout.PackageParamBehavior.DoNotAppend)) {
                throw new r();
            }
            pairA = z.a(null, null);
        }
        Package r22 = (Package) pairA.getFirst();
        String str = (String) pairA.getSecond();
        if (customUrl == null) {
            return (r22 == null || (webCheckoutURL = r22.getWebCheckoutURL()) == null || (string = webCheckoutURL.toString()) == null) ? String.valueOf(components.getOffering().getWebCheckoutURL()) : string;
        }
        try {
            URI uri = new URI(customUrl);
            if (str != null && r22 != null) {
                uri = URIExtensionsKt.appendQueryParameter(uri, str, r22.getIdentifier());
            }
            return uri.toString();
        } catch (URISyntaxException e10) {
            Logger.INSTANCE.e("Invalid custom URI: " + customUrl, e10);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        if (performPurchase$default(r1, r10, r11, null, null, r6, 4, null) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b3, code lost:
    
        if (performPurchaseIfNecessary(r10, r3, r11, r6) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b5, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object handlePackagePurchase(android.app.Activity r10, com.revenuecat.purchases.Package r11, com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer r12, Zd.e r13) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl.handlePackagePurchase(android.app.Activity, com.revenuecat.purchases.Package, com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer, Zd.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01dc A[Catch: PurchasesException -> 0x003d, TryCatch #1 {PurchasesException -> 0x003d, blocks: (B:16:0x0038, B:77:0x0159, B:79:0x0177, B:80:0x017a, B:82:0x017e, B:84:0x018a, B:23:0x004c, B:99:0x01d6, B:101:0x01dc, B:103:0x01e8), top: B:122:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ff A[Catch: PurchasesException -> 0x005a, TRY_ENTER, TryCatch #2 {PurchasesException -> 0x005a, blocks: (B:26:0x0055, B:93:0x01c2, B:95:0x01c8, B:105:0x01ff, B:107:0x0203, B:109:0x0207, B:111:0x020f, B:90:0x01b3, B:60:0x00ff, B:62:0x0105, B:64:0x010c, B:67:0x011e, B:68:0x013a, B:70:0x0140, B:72:0x0145, B:73:0x014a, B:87:0x01a4, B:112:0x0215, B:113:0x021c), top: B:122:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0177 A[Catch: PurchasesException -> 0x003d, TryCatch #1 {PurchasesException -> 0x003d, blocks: (B:16:0x0038, B:77:0x0159, B:79:0x0177, B:80:0x017a, B:82:0x017e, B:84:0x018a, B:23:0x004c, B:99:0x01d6, B:101:0x01dc, B:103:0x01e8), top: B:122:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017e A[Catch: PurchasesException -> 0x003d, TryCatch #1 {PurchasesException -> 0x003d, blocks: (B:16:0x0038, B:77:0x0159, B:79:0x0177, B:80:0x017a, B:82:0x017e, B:84:0x018a, B:23:0x004c, B:99:0x01d6, B:101:0x01dc, B:103:0x01e8), top: B:122:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c2 A[Catch: PurchasesException -> 0x005a, PHI: r2 r15
  0x01c2: PHI (r2v19 com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl) = 
  (r2v38 com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl)
  (r2v39 com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl)
 binds: [B:91:0x01bf, B:26:0x0055] A[DONT_GENERATE, DONT_INLINE]
  0x01c2: PHI (r15v32 java.lang.Object) = (r15v31 java.lang.Object), (r15v1 java.lang.Object) binds: [B:91:0x01bf, B:26:0x0055] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {PurchasesException -> 0x005a, blocks: (B:26:0x0055, B:93:0x01c2, B:95:0x01c8, B:105:0x01ff, B:107:0x0203, B:109:0x0207, B:111:0x020f, B:90:0x01b3, B:60:0x00ff, B:62:0x0105, B:64:0x010c, B:67:0x011e, B:68:0x013a, B:70:0x0140, B:72:0x0145, B:73:0x014a, B:87:0x01a4, B:112:0x0215, B:113:0x021c), top: B:122:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c8 A[Catch: PurchasesException -> 0x005a, TRY_LEAVE, TryCatch #2 {PurchasesException -> 0x005a, blocks: (B:26:0x0055, B:93:0x01c2, B:95:0x01c8, B:105:0x01ff, B:107:0x0203, B:109:0x0207, B:111:0x020f, B:90:0x01b3, B:60:0x00ff, B:62:0x0105, B:64:0x010c, B:67:0x011e, B:68:0x013a, B:70:0x0140, B:72:0x0145, B:73:0x014a, B:87:0x01a4, B:112:0x0215, B:113:0x021c), top: B:122:0x0028 }] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [Zd.e, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl$handleRestorePurchases$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r10v10, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r15v23, types: [com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType] */
    /* JADX WARN: Type inference failed for: r15v36, types: [com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object handleRestorePurchases(Zd.e r15) {
        /*
            Method dump skipped, instruction units count: 593
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl.handleRestorePurchases(Zd.e):java.lang.Object");
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void invalidateCustomerInfoCache() {
        this.purchases.invalidateVirtualCurrenciesCache();
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void preloadExitOffering() {
        AbstractC1617k.d(V.a(this), null, null, new C44241(null), 3, null);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void purchaseSelectedPackage(Activity activity) {
        if (activity == null) {
            Logger.INSTANCE.e("Activity is null, not initiating package purchase");
        } else {
            AbstractC1617k.d(V.a(this), null, null, new C44251(activity, null), 3, null);
        }
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void refreshStateIfColorsChanged(C2175l colorScheme, boolean isDark) {
        AbstractC5504s.h(colorScheme, "colorScheme");
        if (this.isDarkMode != isDark) {
            this.isDarkMode = isDark;
        }
        if (AbstractC5504s.c(this._colorScheme.getValue(), colorScheme)) {
            return;
        }
        this._colorScheme.setValue(colorScheme);
        updateState();
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void refreshStateIfLocaleChanged() {
        i currentLocaleList = getCurrentLocaleList();
        if (AbstractC5504s.c(this._lastLocaleList.getValue(), currentLocaleList)) {
            return;
        }
        this._lastLocaleList.setValue(currentLocaleList);
        PaywallState paywallState = (PaywallState) this._state.getValue();
        if (paywallState instanceof PaywallState.Loaded.Components) {
            PaywallState.Loaded.Components.update$default((PaywallState.Loaded.Components) paywallState, toFrameworkLocaleList(currentLocaleList), null, null, 6, null);
        } else {
            updateState();
        }
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void restorePurchases() {
        AbstractC1617k.d(V.a(this), null, null, new C44261(null), 3, null);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void selectPackage(TemplateConfiguration.PackageInfo packageToSelect) {
        AbstractC5504s.h(packageToSelect, "packageToSelect");
        PaywallState paywallState = (PaywallState) this._state.getValue();
        if (paywallState instanceof PaywallState.Loaded.Legacy) {
            ((PaywallState.Loaded.Legacy) paywallState).selectPackage(packageToSelect);
            return;
        }
        Logger.INSTANCE.e("Unexpected state trying to select package: " + paywallState);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void trackExitOffer(ExitOfferType exitOfferType, String exitOfferingIdentifier) {
        AbstractC5504s.h(exitOfferType, "exitOfferType");
        AbstractC5504s.h(exitOfferingIdentifier, "exitOfferingIdentifier");
        PaywallEvent.Data data = this.paywallPresentationData;
        if (data == null) {
            Logger.INSTANCE.e("Paywall event data is null, not tracking exit offer event");
            return;
        }
        PaywallEvent.Data dataCopy$default = PaywallEvent.Data.copy$default(data, null, null, 0, null, null, null, false, exitOfferType, exitOfferingIdentifier, null, null, null, null, 7807, null);
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC5504s.g(uuidRandomUUID, "randomUUID()");
        this.purchases.track(new PaywallEvent(new PaywallEvent.CreationData(uuidRandomUUID, new Date()), dataCopy$default, PaywallEventType.EXIT_OFFER));
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void trackPaywallImpressionIfNeeded() {
        if (this.paywallPresentationData == null) {
            this.paywallPresentationData = createEventData();
            track(PaywallEventType.IMPRESSION);
        }
    }

    public final void updateOptions(PaywallOptions options) {
        AbstractC5504s.h(options, "options");
        boolean z10 = this.options.hashCode() != options.hashCode();
        this.options = options;
        if (z10) {
            updateState();
        }
    }

    public PaywallViewModelImpl(ResourceProvider resourceProvider, PurchasesType purchases, PaywallOptions options, C2175l colorScheme, boolean z10, Function1 function1, boolean z11, ProductChangeCalculator productChangeCalculator) {
        AbstractC5504s.h(resourceProvider, "resourceProvider");
        AbstractC5504s.h(purchases, "purchases");
        AbstractC5504s.h(options, "options");
        AbstractC5504s.h(colorScheme, "colorScheme");
        AbstractC5504s.h(productChangeCalculator, "productChangeCalculator");
        this.resourceProvider = resourceProvider;
        this.purchases = purchases;
        this.options = options;
        this.isDarkMode = z10;
        this.shouldDisplayBlock = function1;
        this.productChangeCalculator = productChangeCalculator;
        this.variableDataProvider = new VariableDataProvider(getResourceProvider(), z11);
        this._state = K.a(PaywallState.Loading.INSTANCE);
        Boolean bool = Boolean.FALSE;
        this._actionInProgress = b2.e(bool, null, 2, null);
        this._actionError = b2.e(null, null, 2, null);
        this._purchaseCompleted = b2.e(bool, null, 2, null);
        this._preloadedExitOffering = b2.e(null, null, 2, null);
        this._lastLocaleList = K.a(getCurrentLocaleList());
        this._colorScheme = K.a(colorScheme);
        updateState();
        validateState();
    }

    private final PaywallEvent.Data createEventData(PaywallState.Loaded.Legacy legacy) {
        PaywallComponentsData data;
        int revision;
        String str;
        PaywallComponentsData data2;
        String id2;
        Offering offering = legacy.getOffering();
        PaywallData paywall = legacy.getOffering().getPaywall();
        String id3 = null;
        if (paywall != null) {
            revision = paywall.getRevision();
        } else {
            Offering.PaywallComponents paywallComponents = legacy.getOffering().getPaywallComponents();
            if (paywallComponents == null || (data = paywallComponents.getData()) == null) {
                Logger.INSTANCE.e("Null paywall revision trying to create event data");
                return null;
            }
            revision = data.getRevision();
        }
        int i10 = revision;
        PaywallData paywall2 = legacy.getOffering().getPaywall();
        if (paywall2 == null || (id2 = paywall2.getId()) == null) {
            Offering.PaywallComponents paywallComponents2 = legacy.getOffering().getPaywallComponents();
            if (paywallComponents2 != null && (data2 = paywallComponents2.getData()) != null) {
                id3 = data2.getId();
            }
            str = id3;
        } else {
            str = id2;
        }
        Locale localeC = ((i) this._lastLocaleList.getValue()).c(0);
        if (localeC == null) {
            localeC = Locale.getDefault();
        }
        PresentedOfferingContext presentedOfferingContext = getPresentedOfferingContext(offering);
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC5504s.g(uuidRandomUUID, "randomUUID()");
        String lowerCase = getMode().name().toLowerCase(Locale.ROOT);
        AbstractC5504s.g(lowerCase, "toLowerCase(...)");
        String string = localeC.toString();
        AbstractC5504s.g(string, "locale.toString()");
        return new PaywallEvent.Data(str, presentedOfferingContext, i10, uuidRandomUUID, lowerCase, string, this.isDarkMode, null, null, null, null, null, null, 8064, null);
    }

    private final PaywallEvent.Data createEventData(PaywallState.Loaded.Components components) {
        Offering offering = components.getOffering();
        Offering.PaywallComponents paywallComponents = components.getOffering().getPaywallComponents();
        if (paywallComponents == null) {
            Logger.INSTANCE.e("Null paywall revision trying to create event data");
            return null;
        }
        String id2 = paywallComponents.getData().getId();
        PresentedOfferingContext presentedOfferingContext = getPresentedOfferingContext(offering);
        int revision = paywallComponents.getData().getRevision();
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC5504s.g(uuidRandomUUID, "randomUUID()");
        String lowerCase = getMode().name().toLowerCase(Locale.ROOT);
        AbstractC5504s.g(lowerCase, "toLowerCase(...)");
        return new PaywallEvent.Data(id2, presentedOfferingContext, revision, uuidRandomUUID, lowerCase, components.getLocale().toString(), this.isDarkMode, null, null, null, null, null, null, 8064, null);
    }
}
