package com.revenuecat.purchases;

import Ef.a;
import Td.AbstractC2163n;
import Td.L;
import Td.z;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import Ud.S;
import Ud.a0;
import android.app.Activity;
import android.app.Application;
import android.app.backup.BackupManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.r;
import app.notifee.core.event.LogEvent;
import com.android.billingclient.api.AbstractC3156a;
import com.android.billingclient.api.C3160e;
import com.android.billingclient.api.C3162g;
import com.revenuecat.purchases.APIKeyValidator;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.ads.events.AdTracker;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultLocaleProvider;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.events.EventsManager;
import com.revenuecat.purchases.common.events.FeatureEvent;
import com.revenuecat.purchases.common.offerings.OfferingsManager;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.customercenter.CustomerCenterListener;
import com.revenuecat.purchases.deeplinks.WebPurchaseRedemptionHelper;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.Callback;
import com.revenuecat.purchases.interfaces.GetAmazonLWAConsentStatusCallback;
import com.revenuecat.purchases.interfaces.GetCustomerCenterConfigCallback;
import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.interfaces.GetStorefrontCallback;
import com.revenuecat.purchases.interfaces.GetStorefrontLocaleCallback;
import com.revenuecat.purchases.interfaces.GetVirtualCurrenciesCallback;
import com.revenuecat.purchases.interfaces.LogInCallback;
import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.interfaces.PurchaseErrorCallback;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback;
import com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener;
import com.revenuecat.purchases.interfaces.SyncAttributesAndOfferingsCallback;
import com.revenuecat.purchases.interfaces.SyncPurchasesCallback;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import com.revenuecat.purchases.models.BillingFeature;
import com.revenuecat.purchases.models.GalaxyReplacementMode;
import com.revenuecat.purchases.models.GooglePurchasingData;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.GoogleStoreProduct;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.paywalls.DownloadedFontFamily;
import com.revenuecat.purchases.paywalls.FontLoader;
import com.revenuecat.purchases.paywalls.PaywallPresentedCache;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.storage.FileRepository;
import com.revenuecat.purchases.strings.IdentityStrings;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.utils.AndroidVersionUtilsKt;
import com.revenuecat.purchases.utils.CustomActivityLifecycleHandler;
import com.revenuecat.purchases.utils.PurchaseParamsValidator;
import com.revenuecat.purchases.utils.RateLimiter;
import com.revenuecat.purchases.utils.Result;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencyManager;
import ie.InterfaceC5082a;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.N;
import v4.InterfaceC6845d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0090\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b>\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 Ë\u00032\u00020\u00012\u00020\u0002:\u0002Ë\u0003BÅ\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010+\u001a\u00020)\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u00109\u001a\u000208\u0012\b\b\u0002\u0010;\u001a\u00020:\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010?\u001a\u00020>\u0012\u000e\b\u0002\u0010B\u001a\b\u0012\u0004\u0012\u00020A0@\u0012\b\b\u0002\u0010D\u001a\u00020C\u0012\b\b\u0002\u0010F\u001a\u00020E\u0012\b\b\u0002\u0010H\u001a\u00020G\u0012\b\b\u0002\u0010J\u001a\u00020I¢\u0006\u0004\bK\u0010LJ\u0017\u0010P\u001a\u00020O2\u0006\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bP\u0010QJ-\u0010V\u001a\u00020U2\u001c\u0010N\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010S\u0012\u0006\u0012\u0004\u0018\u00010T\u0012\u0004\u0012\u00020O0RH\u0002¢\u0006\u0004\bV\u0010WJ\u001d\u0010Y\u001a\u00020O2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020O0@H\u0002¢\u0006\u0004\bY\u0010ZJ\u0017\u0010\\\u001a\u00020U2\u0006\u0010[\u001a\u00020UH\u0002¢\u0006\u0004\b\\\u0010]JM\u0010h\u001a\u00020O2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00050^2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020`0^2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020c0b2\n\b\u0002\u0010f\u001a\u0004\u0018\u00010e2\u0006\u0010N\u001a\u00020gH\u0002¢\u0006\u0004\bh\u0010iJ#\u0010l\u001a\u00020O2\u0006\u0010j\u001a\u00020\u00052\n\b\u0002\u0010k\u001a\u0004\u0018\u00010MH\u0002¢\u0006\u0004\bl\u0010mJ\u001d\u0010o\u001a\u00020O2\f\u0010n\u001a\b\u0012\u0004\u0012\u00020O0@H\u0002¢\u0006\u0004\bo\u0010ZJ\u0019\u0010r\u001a\u0004\u0018\u00010q2\u0006\u0010p\u001a\u00020\u0005H\u0002¢\u0006\u0004\br\u0010sJ\u0011\u0010u\u001a\u0004\u0018\u00010tH\u0002¢\u0006\u0004\bu\u0010vJ\u000f\u0010x\u001a\u00020wH\u0002¢\u0006\u0004\bx\u0010yJ\u0015\u0010z\u001a\b\u0012\u0004\u0012\u00020q0bH\u0002¢\u0006\u0004\bz\u0010{JK\u0010\u0081\u0001\u001a;\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020}\u0012\u0004\u0012\u00020~\u0012\u0004\u0012\u00020O0Rj\u0002`\u007f\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020}\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020O0Rj\u0003`\u0080\u00010|H\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001JV\u0010\u0084\u0001\u001a;\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020}\u0012\u0004\u0012\u00020~\u0012\u0004\u0012\u00020O0Rj\u0002`\u007f\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020}\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020O0Rj\u0003`\u0080\u00010|2\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010tH\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001e\u0010o\u001a\u00020O*\u00030\u0086\u00012\u0007\u0010\u0087\u0001\u001a\u00020TH\u0002¢\u0006\u0005\bo\u0010\u0088\u0001JF\u0010\u0091\u0001\u001a\u00020O2\b\u0010\u008a\u0001\u001a\u00030\u0089\u00012\b\u0010\u008c\u0001\u001a\u00030\u008b\u00012\n\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u00012\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010U2\u0007\u0010\u0090\u0001\u001a\u00020qH\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001Jc\u0010\u0099\u0001\u001a\u00020O2\b\u0010\u008a\u0001\u001a\u00030\u0089\u00012\b\u0010\u008c\u0001\u001a\u00030\u008b\u00012\n\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u00012\u0007\u0010\u0093\u0001\u001a\u00020\u00052\b\u0010\u0095\u0001\u001a\u00030\u0094\u00012\b\u0010\u0097\u0001\u001a\u00030\u0096\u00012\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010U2\u0007\u0010\u0098\u0001\u001a\u00020qH\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001Jd\u0010\u009d\u0001\u001a\u00020O2\b\u0010\u008c\u0001\u001a\u00030\u008b\u00012\u0007\u0010\u0093\u0001\u001a\u00020\u00052\n\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009b\u00012\b\u0010\u008a\u0001\u001a\u00030\u0089\u00012\u0006\u0010j\u001a\u00020\u00052\n\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u00012\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010U2\b\u0010\u0090\u0001\u001a\u00030\u0086\u0001H\u0002¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u0012\u0010\u009f\u0001\u001a\u00020OH\u0002¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u001c\u0010£\u0001\u001a\u00020O2\b\u0010¢\u0001\u001a\u00030¡\u0001H\u0002¢\u0006\u0006\b£\u0001\u0010¤\u0001J-\u0010¦\u0001\u001a\u00020q2\u0007\u0010¥\u0001\u001a\u00020q2\b\u0010\u008c\u0001\u001a\u00030\u008b\u00012\u0006\u0010f\u001a\u00020eH\u0002¢\u0006\u0006\b¦\u0001\u0010§\u0001J!\u0010©\u0001\u001a\u00020O2\r\u0010¨\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050^H\u0002¢\u0006\u0006\b©\u0001\u0010ª\u0001JC\u0010¬\u0001\u001a\u00020O2\u0006\u0010f\u001a\u00020e2\r\u0010¨\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050^2\r\u0010«\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050^2\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010TH\u0002¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J#\u0010¯\u0001\u001a\u00020O2\u0006\u0010p\u001a\u00020\u00052\u0007\u0010®\u0001\u001a\u00020`H\u0002¢\u0006\u0006\b¯\u0001\u0010°\u0001J;\u0010³\u0001\u001a\u00020O2\b\u0010\u008c\u0001\u001a\u00030\u008b\u00012\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010T2\u0006\u0010f\u001a\u00020e2\n\u0010²\u0001\u001a\u0005\u0018\u00010±\u0001H\u0002¢\u0006\u0006\b³\u0001\u0010´\u0001J\u0012\u0010µ\u0001\u001a\u00020OH\u0016¢\u0006\u0006\bµ\u0001\u0010 \u0001J\u0012\u0010¶\u0001\u001a\u00020OH\u0016¢\u0006\u0006\b¶\u0001\u0010 \u0001J\u001c\u0010·\u0001\u001a\u00020O2\b\u0010\u008a\u0001\u001a\u00030\u0089\u0001H\u0016¢\u0006\u0006\b·\u0001\u0010¸\u0001J\u001c\u0010¹\u0001\u001a\u00020O2\b\u0010\u008a\u0001\u001a\u00030\u0089\u0001H\u0016¢\u0006\u0006\b¹\u0001\u0010¸\u0001J$\u0010½\u0001\u001a\u00020O2\b\u0010»\u0001\u001a\u00030º\u00012\b\u0010\u0090\u0001\u001a\u00030¼\u0001¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u0019\u0010À\u0001\u001a\u00020O2\u0007\u0010N\u001a\u00030¿\u0001¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J\u001b\u0010Ã\u0001\u001a\u00020O2\u0007\u0010N\u001a\u00030Â\u0001H\u0007¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J\u0019\u0010Æ\u0001\u001a\u00020O2\u0007\u0010N\u001a\u00030Å\u0001¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J\u001e\u0010É\u0001\u001a\u00020O2\f\b\u0002\u0010\u0090\u0001\u001a\u0005\u0018\u00010È\u0001¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001JN\u0010Ó\u0001\u001a\u00020O2\u0007\u0010Ë\u0001\u001a\u00020\u00052\u0007\u0010Ì\u0001\u001a\u00020\u00052\u0007\u0010Í\u0001\u001a\u00020\u00052\t\u0010Î\u0001\u001a\u0004\u0018\u00010\u00052\n\u0010Ð\u0001\u001a\u0005\u0018\u00010Ï\u00012\n\u0010Ò\u0001\u001a\u0005\u0018\u00010Ñ\u0001¢\u0006\u0006\bÓ\u0001\u0010Ô\u0001J\u0019\u0010Ö\u0001\u001a\u00020O2\u0007\u0010N\u001a\u00030Õ\u0001¢\u0006\u0006\bÖ\u0001\u0010×\u0001J\u001b\u0010Ù\u0001\u001a\u00020U2\t\u0010Ø\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J%\u0010Ý\u0001\u001a\u00020O2\b\u0010\u0090\u0001\u001a\u00030Û\u00012\t\b\u0002\u0010Ü\u0001\u001a\u00020U¢\u0006\u0006\bÝ\u0001\u0010Þ\u0001J3\u0010à\u0001\u001a\u00020O2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00050b2\u000b\b\u0002\u0010ß\u0001\u001a\u0004\u0018\u00010`2\u0006\u0010N\u001a\u00020g¢\u0006\u0006\bà\u0001\u0010á\u0001J\"\u0010ä\u0001\u001a\u00020O2\b\u0010ã\u0001\u001a\u00030â\u00012\u0006\u0010N\u001a\u00020q¢\u0006\u0006\bä\u0001\u0010å\u0001J\u0017\u0010æ\u0001\u001a\u00020O2\u0006\u0010N\u001a\u00020M¢\u0006\u0005\bæ\u0001\u0010QJ&\u0010é\u0001\u001a\u00020O2\u0007\u0010ç\u0001\u001a\u00020\u00052\u000b\b\u0002\u0010N\u001a\u0005\u0018\u00010è\u0001¢\u0006\u0006\bé\u0001\u0010ê\u0001J\u001b\u0010ë\u0001\u001a\u00020O2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010M¢\u0006\u0005\bë\u0001\u0010QJ\u0010\u0010ì\u0001\u001a\u00020O¢\u0006\u0006\bì\u0001\u0010 \u0001J)\u0010P\u001a\u00020O2\b\u0010î\u0001\u001a\u00030í\u00012\u0007\u0010ï\u0001\u001a\u00020U2\u0006\u0010N\u001a\u00020M¢\u0006\u0005\bP\u0010ð\u0001J\u0010\u0010ñ\u0001\u001a\u00020O¢\u0006\u0006\bñ\u0001\u0010 \u0001J*\u0010ô\u0001\u001a\u00020O2\b\u0010\u008a\u0001\u001a\u00030\u0089\u00012\u000e\u0010ó\u0001\u001a\t\u0012\u0005\u0012\u00030ò\u00010b¢\u0006\u0006\bô\u0001\u0010õ\u0001J\u0010\u0010ö\u0001\u001a\u00020O¢\u0006\u0006\bö\u0001\u0010 \u0001J2\u0010h\u001a\u00020O2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00050^2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020`0^2\u0006\u0010N\u001a\u00020g¢\u0006\u0005\bh\u0010÷\u0001J\u001a\u0010ú\u0001\u001a\u00020O2\b\u0010ù\u0001\u001a\u00030ø\u0001¢\u0006\u0006\bú\u0001\u0010û\u0001J\u0019\u0010ý\u0001\u001a\u00020O2\u0007\u0010N\u001a\u00030ü\u0001¢\u0006\u0006\bý\u0001\u0010þ\u0001JN\u0010\u0084\u0002\u001a\u00020O2\u0007\u0010ÿ\u0001\u001a\u00020\u00052\u0007\u0010\u0080\u0002\u001a\u00020\u00052\u0014\u0010\u0082\u0002\u001a\u000f\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020O0\u0081\u00022\u0014\u0010\u0083\u0002\u001a\u000f\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020O0\u0081\u0002¢\u0006\u0006\b\u0084\u0002\u0010\u0085\u0002J(\u0010\u0088\u0002\u001a\u00020O2\u0016\u0010\u0087\u0002\u001a\u0011\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0086\u0002¢\u0006\u0006\b\u0088\u0002\u0010\u0089\u0002J\u001b\u0010\u008a\u0002\u001a\u00020O2\t\u0010ÿ\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b\u008a\u0002\u0010\u008b\u0002J\u001b\u0010\u008d\u0002\u001a\u00020O2\t\u0010\u008c\u0002\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b\u008d\u0002\u0010\u008b\u0002J\u001b\u0010\u008f\u0002\u001a\u00020O2\t\u0010\u008e\u0002\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b\u008f\u0002\u0010\u008b\u0002J\u001b\u0010\u0091\u0002\u001a\u00020O2\t\u0010\u0090\u0002\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b\u0091\u0002\u0010\u008b\u0002J\u001b\u0010\u0093\u0002\u001a\u00020O2\t\u0010\u0092\u0002\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b\u0093\u0002\u0010\u008b\u0002J\u001b\u0010\u0095\u0002\u001a\u00020O2\t\u0010\u0094\u0002\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b\u0095\u0002\u0010\u008b\u0002J\u001b\u0010\u0097\u0002\u001a\u00020O2\t\u0010\u0096\u0002\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b\u0097\u0002\u0010\u008b\u0002J\u001b\u0010\u0099\u0002\u001a\u00020O2\t\u0010\u0098\u0002\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b\u0099\u0002\u0010\u008b\u0002J\u001b\u0010\u009b\u0002\u001a\u00020O2\t\u0010\u009a\u0002\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b\u009b\u0002\u0010\u008b\u0002J\u001b\u0010\u009d\u0002\u001a\u00020O2\t\u0010\u009c\u0002\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b\u009d\u0002\u0010\u008b\u0002J\u001b\u0010\u009f\u0002\u001a\u00020O2\t\u0010\u009e\u0002\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b\u009f\u0002\u0010\u008b\u0002J\u0010\u0010 \u0002\u001a\u00020O¢\u0006\u0006\b \u0002\u0010 \u0001J\u001b\u0010¢\u0002\u001a\u00020O2\t\u0010¡\u0002\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b¢\u0002\u0010\u008b\u0002J\u001b\u0010¤\u0002\u001a\u00020O2\t\u0010£\u0002\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b¤\u0002\u0010\u008b\u0002J\u001b\u0010¦\u0002\u001a\u00020O2\t\u0010¥\u0002\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b¦\u0002\u0010\u008b\u0002J\u001b\u0010¨\u0002\u001a\u00020O2\t\u0010§\u0002\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b¨\u0002\u0010\u008b\u0002J\u001b\u0010ª\u0002\u001a\u00020O2\t\u0010©\u0002\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\bª\u0002\u0010\u008b\u0002J\u001b\u0010¬\u0002\u001a\u00020O2\t\u0010«\u0002\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b¬\u0002\u0010\u008b\u0002J\u001b\u0010®\u0002\u001a\u00020O2\t\u0010\u00ad\u0002\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b®\u0002\u0010\u008b\u0002J\u001b\u0010°\u0002\u001a\u00020O2\t\u0010¯\u0002\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b°\u0002\u0010\u008b\u0002J\u001b\u0010²\u0002\u001a\u00020O2\t\u0010±\u0002\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b²\u0002\u0010\u008b\u0002J\u001b\u0010´\u0002\u001a\u00020O2\t\u0010³\u0002\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b´\u0002\u0010\u008b\u0002J$\u0010¶\u0002\u001a\u00020O2\u0012\u0010µ\u0002\u001a\r\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0086\u0002¢\u0006\u0006\b¶\u0002\u0010\u0089\u0002J/\u0010·\u0002\u001a\u00020O2\u0014\u0010µ\u0002\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0086\u00022\u0007\u0010N\u001a\u00030Å\u0001¢\u0006\u0006\b·\u0002\u0010¸\u0002J\u001b\u0010º\u0002\u001a\u00020O2\t\u0010¹\u0002\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\bº\u0002\u0010\u008b\u0002J\u001b\u0010¼\u0002\u001a\u00020O2\t\u0010»\u0002\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b¼\u0002\u0010\u008b\u0002J\u001b\u0010¾\u0002\u001a\u00020O2\t\u0010½\u0002\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b¾\u0002\u0010\u008b\u0002J\u001b\u0010À\u0002\u001a\u00020O2\t\u0010¿\u0002\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\bÀ\u0002\u0010\u008b\u0002J\u001b\u0010Â\u0002\u001a\u00020O2\t\u0010Á\u0002\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\bÂ\u0002\u0010\u008b\u0002J\u001b\u0010Ä\u0002\u001a\u00020O2\t\u0010Ã\u0002\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\bÄ\u0002\u0010\u008b\u0002J\u0019\u0010Æ\u0002\u001a\u00020O2\u0007\u0010N\u001a\u00030Å\u0002¢\u0006\u0006\bÆ\u0002\u0010Ç\u0002J\u0010\u0010È\u0002\u001a\u00020O¢\u0006\u0006\bÈ\u0002\u0010 \u0001J\u0019\u0010É\u0002\u001a\u00020O2\u0007\u0010ç\u0001\u001a\u00020\u0005¢\u0006\u0006\bÉ\u0002\u0010\u008b\u0002J\u001f\u0010Í\u0002\u001a\u0005\u0018\u00010Ì\u00022\b\u0010Ë\u0002\u001a\u00030Ê\u0002H\u0007¢\u0006\u0006\bÍ\u0002\u0010Î\u0002R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010Ï\u0002R\u0015\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010Ð\u0002R\u0015\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010Ñ\u0002R\u0015\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010Ò\u0002R\u0015\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000e\u0010Ó\u0002R\u0015\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010Ô\u0002R'\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0012\u0010Õ\u0002\u001a\u0006\bÖ\u0002\u0010×\u0002\"\u0006\bØ\u0002\u0010Ù\u0002R\u0015\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010Ú\u0002R\u0015\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010Û\u0002R\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010Ü\u0002R\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001a\u0010Ý\u0002R\u0015\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001c\u0010Þ\u0002R\u001a\u0010\u001e\u001a\u00020\u001d8\u0007¢\u0006\u000f\n\u0005\b\u001e\u0010ß\u0002\u001a\u0006\bà\u0002\u0010á\u0002R\u0015\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b \u0010â\u0002R\u0015\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\"\u0010ã\u0002R\u0015\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b$\u0010ä\u0002R\u0015\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b&\u0010å\u0002R\u0015\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b(\u0010æ\u0002R\u0015\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b*\u0010ç\u0002R\u0015\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b+\u0010ç\u0002R\u0015\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b-\u0010è\u0002R\u0015\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b/\u0010é\u0002R\u0017\u00101\u001a\u0004\u0018\u0001008\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b1\u0010ê\u0002R\u0015\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b3\u0010ë\u0002R\u0015\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b5\u0010ì\u0002R\u0015\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b7\u0010í\u0002R\u0015\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b9\u0010î\u0002R\u0015\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b;\u0010ï\u0002R\u0015\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b=\u0010ð\u0002R\u0015\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b?\u0010ñ\u0002R \u0010B\u001a\b\u0012\u0004\u0012\u00020A0@8\u0006¢\u0006\u000f\n\u0005\bB\u0010ò\u0002\u001a\u0006\bó\u0002\u0010ô\u0002R\u0015\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bD\u0010õ\u0002R\u0015\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bF\u0010ö\u0002R\u001a\u0010H\u001a\u00020G8\u0006¢\u0006\u000f\n\u0005\bH\u0010÷\u0002\u001a\u0006\bø\u0002\u0010ù\u0002R\u001a\u0010J\u001a\u00020I8\u0006¢\u0006\u000f\n\u0005\bJ\u0010ú\u0002\u001a\u0006\bû\u0002\u0010ü\u0002R8\u0010ÿ\u0002\u001a\u0005\u0018\u00010ý\u00022\n\u0010þ\u0002\u001a\u0005\u0018\u00010ý\u00028F@FX\u0086\u000e¢\u0006\u0018\n\u0006\bÿ\u0002\u0010\u0080\u0003\u001a\u0006\b\u0081\u0003\u0010\u0082\u0003\"\u0006\b\u0083\u0003\u0010\u0084\u0003R8\u0010\u0086\u0003\u001a\u0005\u0018\u00010\u0085\u00032\n\u0010þ\u0002\u001a\u0005\u0018\u00010\u0085\u00038F@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0086\u0003\u0010\u0087\u0003\u001a\u0006\b\u0088\u0003\u0010\u0089\u0003\"\u0006\b\u008a\u0003\u0010\u008b\u0003R!\u0010\u0091\u0003\u001a\u00030\u008c\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008d\u0003\u0010\u008e\u0003\u001a\u0006\b\u008f\u0003\u0010\u0090\u0003R\u0018\u0010\u0093\u0003\u001a\u00030\u0092\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0003\u0010\u0094\u0003R\u0018\u0010\u0095\u0003\u001a\u00030\u0092\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0003\u0010\u0094\u0003R.\u0010\u0096\u0003\u001a\u0004\u0018\u00010\u00052\t\u0010þ\u0002\u001a\u0004\u0018\u00010\u00058\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0096\u0003\u0010\u0097\u0003\u001a\u0006\bÀ\u0001\u0010\u0098\u0003R\u001b\u0010\u0099\u0003\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0003\u0010\u0097\u0003R,\u0010 \u0003\u001a\u00030\u009a\u00032\b\u0010\u009b\u0003\u001a\u00030\u009a\u00038@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b\u009c\u0003\u0010\u009d\u0003\"\u0006\b\u009e\u0003\u0010\u009f\u0003R\u0016\u0010¢\u0003\u001a\u0004\u0018\u00010\u00058F¢\u0006\b\u001a\u0006\b¡\u0003\u0010\u0098\u0003R\u0014\u0010¥\u0003\u001a\u0002048F¢\u0006\b\u001a\u0006\b£\u0003\u0010¤\u0003R*\u0010ª\u0003\u001a\u00020U2\u0007\u0010\u009b\u0003\u001a\u00020U8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¦\u0003\u0010§\u0003\"\u0006\b¨\u0003\u0010©\u0003R\u0013\u0010j\u001a\u00020\u00058F¢\u0006\b\u001a\u0006\b«\u0003\u0010\u0098\u0003R0\u0010±\u0003\u001a\u0005\u0018\u00010¬\u00032\n\u0010\u009b\u0003\u001a\u0005\u0018\u00010¬\u00038F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u00ad\u0003\u0010®\u0003\"\u0006\b¯\u0003\u0010°\u0003R9\u0010¹\u0003\u001a\u0005\u0018\u00010²\u00032\n\u0010þ\u0002\u001a\u0005\u0018\u00010²\u00038F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b³\u0003\u0010´\u0003\"\u0006\bµ\u0003\u0010¶\u0003*\u0006\b·\u0003\u0010¸\u0003R\u0014\u0010º\u0003\u001a\u00020U8F¢\u0006\b\u001a\u0006\bº\u0003\u0010§\u0003R\u0015\u0010¾\u0003\u001a\u00030»\u00038F¢\u0006\b\u001a\u0006\b¼\u0003\u0010½\u0003R*\u0010Á\u0003\u001a\u00020U2\u0007\u0010\u009b\u0003\u001a\u00020U8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¿\u0003\u0010§\u0003\"\u0006\bÀ\u0003\u0010©\u0003R\u0017\u0010Ä\u0003\u001a\u0005\u0018\u00010Â\u00038F¢\u0006\b\u001a\u0006\bÃ\u0001\u0010Ã\u0003R\u0016\u0010Æ\u0003\u001a\u0004\u0018\u00010\u00058F¢\u0006\b\u001a\u0006\bÅ\u0003\u0010\u0098\u0003R\u0017\u0010Ê\u0003\u001a\u0005\u0018\u00010Ç\u00038F¢\u0006\b\u001a\u0006\bÈ\u0003\u0010É\u0003¨\u0006Ì\u0003"}, d2 = {"Lcom/revenuecat/purchases/PurchasesOrchestrator;", "Lcom/revenuecat/purchases/LifecycleDelegate;", "Lcom/revenuecat/purchases/utils/CustomActivityLifecycleHandler;", "Landroid/app/Application;", "application", "", "backingFieldAppUserID", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "subscriberAttributesManager", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/CustomerInfoHelper;", "customerInfoHelper", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "customerInfoUpdateHandler", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsSynchronizer;", "diagnosticsSynchronizer", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "offlineEntitlementsManager", "Lcom/revenuecat/purchases/PostReceiptHelper;", "postReceiptHelper", "Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;", "postTransactionWithProductDetailsHelper", "Lcom/revenuecat/purchases/PostPendingTransactionsHelper;", "postPendingTransactionsHelper", "Lcom/revenuecat/purchases/SyncPurchasesHelper;", "syncPurchasesHelper", "Lcom/revenuecat/purchases/common/offerings/OfferingsManager;", "offeringsManager", "Lcom/revenuecat/purchases/common/events/EventsManager;", "eventsManager", "adEventsManager", "Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;", "paywallPresentedCache", "Lcom/revenuecat/purchases/PurchasesStateCache;", "purchasesStateCache", "Landroid/os/Handler;", "mainHandler", "Lcom/revenuecat/purchases/common/Dispatcher;", "dispatcher", "Lcom/revenuecat/purchases/PurchasesConfiguration;", "initialConfiguration", "Lcom/revenuecat/purchases/paywalls/FontLoader;", "fontLoader", "Lcom/revenuecat/purchases/common/DefaultLocaleProvider;", "localeProvider", "Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper;", "webPurchaseRedemptionHelper", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencyManager;", "virtualCurrencyManager", "Lcom/revenuecat/purchases/utils/PurchaseParamsValidator;", "purchaseParamsValidator", "Lkotlin/Function0;", "Landroidx/lifecycle/r;", "processLifecycleOwnerProvider", "Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;", "blockstoreHelper", "Landroid/app/backup/BackupManager;", "backupManager", "Lcom/revenuecat/purchases/storage/FileRepository;", "fileRepository", "Lcom/revenuecat/purchases/ads/events/AdTracker;", "adTracker", "<init>", "(Landroid/app/Application;Ljava/lang/String;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/CustomerInfoHelper;Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsSynchronizer;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/common/DateProvider;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;Lcom/revenuecat/purchases/PostReceiptHelper;Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;Lcom/revenuecat/purchases/PostPendingTransactionsHelper;Lcom/revenuecat/purchases/SyncPurchasesHelper;Lcom/revenuecat/purchases/common/offerings/OfferingsManager;Lcom/revenuecat/purchases/common/events/EventsManager;Lcom/revenuecat/purchases/common/events/EventsManager;Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;Lcom/revenuecat/purchases/PurchasesStateCache;Landroid/os/Handler;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/PurchasesConfiguration;Lcom/revenuecat/purchases/paywalls/FontLoader;Lcom/revenuecat/purchases/common/DefaultLocaleProvider;Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencyManager;Lcom/revenuecat/purchases/utils/PurchaseParamsValidator;Lie/a;Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;Landroid/app/backup/BackupManager;Lcom/revenuecat/purchases/storage/FileRepository;Lcom/revenuecat/purchases/ads/events/AdTracker;)V", "Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "callback", "LTd/L;", "getCustomerInfo", "(Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/Offerings;", "Lcom/revenuecat/purchases/PurchasesError;", "", "clearInMemoryCacheAndFetchOfferingsWithRateLimit", "(Lkotlin/jvm/functions/Function2;)Z", "command", "enqueue", "(Lie/a;)V", "firstTimeInForeground", "shouldRefreshCustomerInfo", "(Z)Z", "", "productIds", "Lcom/revenuecat/purchases/ProductType;", "types", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "collectedStoreProducts", "Ljava/util/Date;", "startTime", "Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;", "getProductsOfTypes", "(Ljava/util/Set;Ljava/util/Set;Ljava/util/List;Ljava/util/Date;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V", "appUserID", "completion", "updateAllCaches", "(Ljava/lang/String;Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "action", "dispatch", "productId", "Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "getPurchaseCallback", "(Ljava/lang/String;)Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;", "getAndClearProductChangeCallback", "()Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;", "Lcom/revenuecat/purchases/common/BillingAbstract$PurchasesUpdatedListener;", "getPurchasesUpdatedListener", "()Lcom/revenuecat/purchases/common/BillingAbstract$PurchasesUpdatedListener;", "getAndClearAllPurchaseCallbacks", "()Ljava/util/List;", "Landroid/util/Pair;", "Lcom/revenuecat/purchases/models/StoreTransaction;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lcom/revenuecat/purchases/SuccessfulPurchaseCallback;", "Lcom/revenuecat/purchases/ErrorPurchaseCallback;", "getPurchaseCompletedCallbacks", "()Landroid/util/Pair;", "productChangeListener", "getProductChangeCompletedCallbacks", "(Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;)Landroid/util/Pair;", "Lcom/revenuecat/purchases/interfaces/PurchaseErrorCallback;", LogEvent.LEVEL_ERROR, "(Lcom/revenuecat/purchases/interfaces/PurchaseErrorCallback;Lcom/revenuecat/purchases/PurchasesError;)V", "Landroid/app/Activity;", "activity", "Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "isPersonalizedPrice", "listener", "startPurchase", "(Landroid/app/Activity;Lcom/revenuecat/purchases/models/PurchasingData;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/Boolean;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V", "oldProductId", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "googleReplacementMode", "Lcom/revenuecat/purchases/models/GalaxyReplacementMode;", "galaxyReplacementMode", "purchaseCallback", "startProductChange", "(Landroid/app/Activity;Lcom/revenuecat/purchases/models/PurchasingData;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/String;Lcom/revenuecat/purchases/models/GoogleReplacementMode;Lcom/revenuecat/purchases/models/GalaxyReplacementMode;Ljava/lang/Boolean;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V", "Lcom/revenuecat/purchases/ReplacementMode;", "replacementMode", "replaceOldPurchaseWithNewProduct", "(Lcom/revenuecat/purchases/models/PurchasingData;Ljava/lang/String;Lcom/revenuecat/purchases/ReplacementMode;Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/Boolean;Lcom/revenuecat/purchases/interfaces/PurchaseErrorCallback;)V", "synchronizeSubscriberAttributesIfNeeded", "()V", "Lcom/revenuecat/purchases/common/Delay;", "delay", "flushEvents", "(Lcom/revenuecat/purchases/common/Delay;)V", "originalCallback", "createCallbackWithDiagnosticsIfNeeded", "(Lcom/revenuecat/purchases/interfaces/PurchaseCallback;Lcom/revenuecat/purchases/models/PurchasingData;Ljava/util/Date;)Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "requestedProductIds", "trackGetProductsStarted", "(Ljava/util/Set;)V", "notFoundProductIds", "trackGetProductsResult", "(Ljava/util/Date;Ljava/util/Set;Ljava/util/Set;Lcom/revenuecat/purchases/PurchasesError;)V", "productType", "trackPurchaseStarted", "(Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;)V", "Lcom/revenuecat/purchases/VerificationResult;", "verificationResult", "trackPurchaseResultIfNeeded", "(Lcom/revenuecat/purchases/models/PurchasingData;Lcom/revenuecat/purchases/PurchasesError;Ljava/util/Date;Lcom/revenuecat/purchases/VerificationResult;)V", "onAppBackgrounded", "onAppForegrounded", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityPaused", "Lcom/revenuecat/purchases/WebPurchaseRedemption;", "webPurchaseRedemption", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener;", "redeemWebPurchase", "(Lcom/revenuecat/purchases/WebPurchaseRedemption;Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener;)V", "Lcom/revenuecat/purchases/interfaces/GetStorefrontCallback;", "getStorefrontCountryCode", "(Lcom/revenuecat/purchases/interfaces/GetStorefrontCallback;)V", "Lcom/revenuecat/purchases/interfaces/GetStorefrontLocaleCallback;", "getStorefrontLocale", "(Lcom/revenuecat/purchases/interfaces/GetStorefrontLocaleCallback;)V", "Lcom/revenuecat/purchases/interfaces/SyncAttributesAndOfferingsCallback;", "syncAttributesAndOfferingsIfNeeded", "(Lcom/revenuecat/purchases/interfaces/SyncAttributesAndOfferingsCallback;)V", "Lcom/revenuecat/purchases/interfaces/SyncPurchasesCallback;", "syncPurchases", "(Lcom/revenuecat/purchases/interfaces/SyncPurchasesCallback;)V", "productID", "receiptID", "amazonUserID", "isoCurrencyCode", "", com.amazon.a.a.o.b.f34666x, "", "purchaseTime", "syncAmazonPurchase", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;)V", "Lcom/revenuecat/purchases/interfaces/GetAmazonLWAConsentStatusCallback;", "getAmazonLWAConsentStatus", "(Lcom/revenuecat/purchases/interfaces/GetAmazonLWAConsentStatusCallback;)V", "localeString", "overridePreferredUILocale", "(Ljava/lang/String;)Z", "Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;", "fetchCurrent", "getOfferings", "(Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;Z)V", "type", "getProducts", "(Ljava/util/List;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V", "Lcom/revenuecat/purchases/PurchaseParams;", "purchaseParams", "purchase", "(Lcom/revenuecat/purchases/PurchaseParams;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V", "restorePurchases", "newAppUserID", "Lcom/revenuecat/purchases/interfaces/LogInCallback;", "logIn", "(Ljava/lang/String;Lcom/revenuecat/purchases/interfaces/LogInCallback;)V", "logOut", "close", "Lcom/revenuecat/purchases/CacheFetchPolicy;", "fetchPolicy", "trackDiagnostics", "(Lcom/revenuecat/purchases/CacheFetchPolicy;ZLcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "removeUpdatedCustomerInfoListener", "Lcom/revenuecat/purchases/models/InAppMessageType;", "inAppMessageTypes", "showInAppMessagesIfNeeded", "(Landroid/app/Activity;Ljava/util/List;)V", "invalidateCustomerInfoCache", "(Ljava/util/Set;Ljava/util/Set;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V", "Lcom/revenuecat/purchases/common/events/FeatureEvent;", "event", "track", "(Lcom/revenuecat/purchases/common/events/FeatureEvent;)V", "Lcom/revenuecat/purchases/interfaces/GetCustomerCenterConfigCallback;", "getCustomerCenterConfig", "(Lcom/revenuecat/purchases/interfaces/GetCustomerCenterConfigCallback;)V", "email", com.amazon.a.a.o.b.f34645c, "Lkotlin/Function1;", "onSuccess", "onError", "createSupportTicket", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "attributes", "setAttributes", "(Ljava/util/Map;)V", "setEmail", "(Ljava/lang/String;)V", "phoneNumber", "setPhoneNumber", "displayName", "setDisplayName", "fcmToken", "setPushToken", "mixpanelDistinctID", "setMixpanelDistinctID", "onesignalID", "setOnesignalID", "onesignalUserID", "setOnesignalUserID", "airshipChannelID", "setAirshipChannelID", "firebaseAppInstanceID", "setFirebaseAppInstanceID", "tenjinAnalyticsInstallationID", "setTenjinAnalyticsInstallationID", "postHogUserId", "setPostHogUserId", "collectDeviceIdentifiers", "adjustID", "setAdjustID", "appsflyerID", "setAppsflyerID", "fbAnonymousID", "setFBAnonymousID", "mparticleID", "setMparticleID", "cleverTapID", "setCleverTapID", "kochavaDeviceID", "setKochavaDeviceID", "airbridgeDeviceID", "setAirbridgeDeviceID", "solarEngineDistinctId", "setSolarEngineDistinctId", "solarEngineAccountId", "setSolarEngineAccountId", "solarEngineVisitorId", "setSolarEngineVisitorId", "data", "setAppsFlyerConversionData", "setAppstackAttributionParams", "(Ljava/util/Map;Lcom/revenuecat/purchases/interfaces/SyncAttributesAndOfferingsCallback;)V", "mediaSource", "setMediaSource", "campaign", "setCampaign", "adGroup", "setAdGroup", "ad", "setAd", "keyword", "setKeyword", "creative", "setCreative", "Lcom/revenuecat/purchases/interfaces/GetVirtualCurrenciesCallback;", "getVirtualCurrencies", "(Lcom/revenuecat/purchases/interfaces/GetVirtualCurrenciesCallback;)V", "invalidateVirtualCurrenciesCache", "switchUser", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;", "fontInfo", "Lcom/revenuecat/purchases/paywalls/DownloadedFontFamily;", "getCachedFontFamilyOrStartDownload", "(Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;)Lcom/revenuecat/purchases/paywalls/DownloadedFontFamily;", "Landroid/app/Application;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/identity/IdentityManager;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "Lcom/revenuecat/purchases/common/AppConfig;", "getAppConfig", "()Lcom/revenuecat/purchases/common/AppConfig;", "setAppConfig", "(Lcom/revenuecat/purchases/common/AppConfig;)V", "Lcom/revenuecat/purchases/CustomerInfoHelper;", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsSynchronizer;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Lcom/revenuecat/purchases/common/DateProvider;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "getOfflineEntitlementsManager", "()Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "Lcom/revenuecat/purchases/PostReceiptHelper;", "Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;", "Lcom/revenuecat/purchases/PostPendingTransactionsHelper;", "Lcom/revenuecat/purchases/SyncPurchasesHelper;", "Lcom/revenuecat/purchases/common/offerings/OfferingsManager;", "Lcom/revenuecat/purchases/common/events/EventsManager;", "Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;", "Lcom/revenuecat/purchases/PurchasesStateCache;", "Landroid/os/Handler;", "Lcom/revenuecat/purchases/common/Dispatcher;", "Lcom/revenuecat/purchases/PurchasesConfiguration;", "Lcom/revenuecat/purchases/paywalls/FontLoader;", "Lcom/revenuecat/purchases/common/DefaultLocaleProvider;", "Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper;", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencyManager;", "Lcom/revenuecat/purchases/utils/PurchaseParamsValidator;", "Lie/a;", "getProcessLifecycleOwnerProvider", "()Lie/a;", "Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;", "Landroid/app/backup/BackupManager;", "Lcom/revenuecat/purchases/storage/FileRepository;", "getFileRepository", "()Lcom/revenuecat/purchases/storage/FileRepository;", "Lcom/revenuecat/purchases/ads/events/AdTracker;", "getAdTracker", "()Lcom/revenuecat/purchases/ads/events/AdTracker;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;", "<set-?>", "customerCenterListener", "Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;", "getCustomerCenterListener", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;", "setCustomerCenterListener", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;)V", "Lcom/revenuecat/purchases/TrackedEventListener;", "trackedEventListener", "Lcom/revenuecat/purchases/TrackedEventListener;", "getTrackedEventListener", "()Lcom/revenuecat/purchases/TrackedEventListener;", "setTrackedEventListener", "(Lcom/revenuecat/purchases/TrackedEventListener;)V", "Lcom/revenuecat/purchases/AppLifecycleHandler;", "lifecycleHandler$delegate", "Lkotlin/Lazy;", "getLifecycleHandler", "()Lcom/revenuecat/purchases/AppLifecycleHandler;", "lifecycleHandler", "Lcom/revenuecat/purchases/utils/RateLimiter;", "lastSyncAttributesAndOfferingsRateLimiter", "Lcom/revenuecat/purchases/utils/RateLimiter;", "preferredLocaleOverrideRateLimiter", "storefrontCountryCode", "Ljava/lang/String;", "()Ljava/lang/String;", "_preferredUILocaleOverride", "Lcom/revenuecat/purchases/PurchasesState;", "value", "getState$purchases_defaultsBc8Release", "()Lcom/revenuecat/purchases/PurchasesState;", "setState$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/PurchasesState;)V", "state", "getCachedCurrentOfferingIdentifier", "cachedCurrentOfferingIdentifier", "getCurrentConfiguration", "()Lcom/revenuecat/purchases/PurchasesConfiguration;", "currentConfiguration", "getFinishTransactions", "()Z", "setFinishTransactions", "(Z)V", "finishTransactions", "getAppUserID", "Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "getUpdatedCustomerInfoListener", "()Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "setUpdatedCustomerInfoListener", "(Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;)V", "updatedCustomerInfoListener", "Lcom/revenuecat/purchases/DebugEventListener;", "getDebugEventListener", "()Lcom/revenuecat/purchases/DebugEventListener;", "setDebugEventListener", "(Lcom/revenuecat/purchases/DebugEventListener;)V", "getDebugEventListener$delegate", "(Lcom/revenuecat/purchases/PurchasesOrchestrator;)Ljava/lang/Object;", "debugEventListener", "isAnonymous", "Lcom/revenuecat/purchases/Store;", "getStore", "()Lcom/revenuecat/purchases/Store;", ProductResponseJsonKeys.STORE, "getAllowSharingPlayStoreAccount", "setAllowSharingPlayStoreAccount", "allowSharingPlayStoreAccount", "Ljava/util/Locale;", "()Ljava/util/Locale;", "storefrontLocale", "getPreferredUILocaleOverride", "preferredUILocaleOverride", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "getCachedVirtualCurrencies", "()Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "cachedVirtualCurrencies", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PurchasesOrchestrator implements LifecycleDelegate, CustomActivityLifecycleHandler {
    private static InterfaceC6845d cachedImageLoader = null;
    public static final String frameworkVersion = "9.29.0";
    private static URL proxyURL;
    private volatile String _preferredUILocaleOverride;
    private final EventsManager adEventsManager;
    private final AdTracker adTracker;
    private AppConfig appConfig;
    private final Application application;
    private final Backend backend;
    private final BackupManager backupManager;
    private final BillingAbstract billing;
    private final BlockstoreHelper blockstoreHelper;
    private CustomerCenterListener customerCenterListener;
    private final CustomerInfoHelper customerInfoHelper;
    private final CustomerInfoUpdateHandler customerInfoUpdateHandler;
    private final DateProvider dateProvider;
    private final DeviceCache deviceCache;
    private final DiagnosticsSynchronizer diagnosticsSynchronizer;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final Dispatcher dispatcher;
    private final EventsManager eventsManager;
    private final FileRepository fileRepository;
    private final FontLoader fontLoader;
    private final IdentityManager identityManager;
    private final PurchasesConfiguration initialConfiguration;
    private final RateLimiter lastSyncAttributesAndOfferingsRateLimiter;

    /* JADX INFO: renamed from: lifecycleHandler$delegate, reason: from kotlin metadata */
    private final Lazy lifecycleHandler;
    private final DefaultLocaleProvider localeProvider;
    private final Handler mainHandler;
    private final OfferingsManager offeringsManager;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final PaywallPresentedCache paywallPresentedCache;
    private final PostPendingTransactionsHelper postPendingTransactionsHelper;
    private final PostReceiptHelper postReceiptHelper;
    private final PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper;
    private final RateLimiter preferredLocaleOverrideRateLimiter;
    private final InterfaceC5082a processLifecycleOwnerProvider;
    private final PurchaseParamsValidator purchaseParamsValidator;
    private final PurchasesStateCache purchasesStateCache;
    private String storefrontCountryCode;
    private final SubscriberAttributesManager subscriberAttributesManager;
    private final SyncPurchasesHelper syncPurchasesHelper;
    private TrackedEventListener trackedEventListener;
    private final VirtualCurrencyManager virtualCurrencyManager;
    private final WebPurchaseRedemptionHelper webPurchaseRedemptionHelper;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static PlatformInfo platformInfo = new PlatformInfo("native", null);

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/r;", "invoke", "()Landroidx/lifecycle/r;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final r invoke() {
            r rVarL = ProcessLifecycleOwner.l();
            AbstractC5504s.g(rVarL, "get()");
            return rVarL;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revenuecat/purchases/PurchasesOrchestrator$2", "Lcom/revenuecat/purchases/common/BillingAbstract$StateListener;", "LTd/L;", "onConnected", "()V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass2 implements BillingAbstract.StateListener {
        AnonymousClass2() {
        }

        @Override // com.revenuecat.purchases.common.BillingAbstract.StateListener
        public void onConnected() {
            PostPendingTransactionsHelper.syncPendingPurchaseQueue$default(PurchasesOrchestrator.this.postPendingTransactionsHelper, PurchasesOrchestrator.this.getAllowSharingPlayStoreAccount(), null, 2, null);
            PurchasesOrchestrator.this.billing.getStorefront(new PurchasesOrchestrator$2$onConnected$1(PurchasesOrchestrator.this), PurchasesOrchestrator$2$onConnected$2.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass3 extends AbstractC5506u implements InterfaceC5082a {
        AnonymousClass3() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m148invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m148invoke() {
            ((r) PurchasesOrchestrator.this.getProcessLifecycleOwnerProvider().invoke()).getLifecycle().addObserver(PurchasesOrchestrator.this.getLifecycleHandler());
            PurchasesOrchestrator.this.application.registerActivityLifecycleCallbacks(PurchasesOrchestrator.this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010*\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020%8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010,\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"Lcom/revenuecat/purchases/PurchasesOrchestrator$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lv4/d;", "getImageLoader", "(Landroid/content/Context;)Lv4/d;", "", "Lcom/revenuecat/purchases/models/BillingFeature;", "features", "Lcom/revenuecat/purchases/interfaces/Callback;", "", "callback", "LTd/L;", "canMakePayments", "(Landroid/content/Context;Ljava/util/List;Lcom/revenuecat/purchases/interfaces/Callback;)V", "Lcom/revenuecat/purchases/common/PlatformInfo;", "platformInfo", "Lcom/revenuecat/purchases/common/PlatformInfo;", "getPlatformInfo", "()Lcom/revenuecat/purchases/common/PlatformInfo;", "setPlatformInfo", "(Lcom/revenuecat/purchases/common/PlatformInfo;)V", "value", "getDebugLogsEnabled", "()Z", "setDebugLogsEnabled", "(Z)V", "debugLogsEnabled", "Lcom/revenuecat/purchases/LogLevel;", "getLogLevel", "()Lcom/revenuecat/purchases/LogLevel;", "setLogLevel", "(Lcom/revenuecat/purchases/LogLevel;)V", "logLevel", "Lcom/revenuecat/purchases/LogHandler;", "getLogHandler", "()Lcom/revenuecat/purchases/LogHandler;", "setLogHandler", "(Lcom/revenuecat/purchases/LogHandler;)V", "logHandler", "Ljava/net/URL;", "proxyURL", "Ljava/net/URL;", "getProxyURL", "()Ljava/net/URL;", "setProxyURL", "(Ljava/net/URL;)V", "cachedImageLoader", "Lv4/d;", "", "frameworkVersion", "Ljava/lang/String;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void canMakePayments$default(Companion companion, Context context, List list, Callback callback, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                list = AbstractC2279u.m();
            }
            companion.canMakePayments(context, list, callback);
        }

        public final void canMakePayments(Context context, List<? extends BillingFeature> features, Callback<Boolean> callback) {
            AbstractC5504s.h(context, "context");
            AbstractC5504s.h(features, "features");
            AbstractC5504s.h(callback, "callback");
            AbstractC3156a abstractC3156aA = AbstractC3156a.h(context).b(C3162g.c().b().a()).c(new N4.m() { // from class: com.revenuecat.purchases.j
                @Override // N4.m
                public final void onPurchasesUpdated(C3160e c3160e, List list) {
                    AbstractC5504s.h(c3160e, "<anonymous parameter 0>");
                }
            }).a();
            abstractC3156aA.l(new PurchasesOrchestrator$Companion$canMakePayments$2$1(new Handler(context.getMainLooper()), new AtomicBoolean(false), callback, abstractC3156aA, features));
        }

        public final boolean getDebugLogsEnabled() {
            return LogUtilsKt.getDebugLogsEnabled(getLogLevel());
        }

        public final synchronized InterfaceC6845d getImageLoader(Context context) {
            InterfaceC6845d interfaceC6845dB;
            AbstractC5504s.h(context, "context");
            interfaceC6845dB = PurchasesOrchestrator.cachedImageLoader;
            if (interfaceC6845dB == null) {
                interfaceC6845dB = new InterfaceC6845d.a(context).d(new PurchasesOrchestrator$Companion$getImageLoader$imageLoader$1(context, "revenuecatui_cache", 26214400L)).b();
                PurchasesOrchestrator.cachedImageLoader = interfaceC6845dB;
            }
            return interfaceC6845dB;
        }

        public final synchronized LogHandler getLogHandler() {
            return LogWrapperKt.getCurrentLogHandler();
        }

        public final LogLevel getLogLevel() {
            return Config.INSTANCE.getLogLevel();
        }

        public final PlatformInfo getPlatformInfo() {
            return PurchasesOrchestrator.platformInfo;
        }

        public final URL getProxyURL() {
            return PurchasesOrchestrator.proxyURL;
        }

        public final void setDebugLogsEnabled(boolean z10) {
            setLogLevel(LogUtilsKt.debugLogsEnabled(LogLevel.INSTANCE, z10));
        }

        public final synchronized void setLogHandler(LogHandler value) {
            AbstractC5504s.h(value, "value");
            LogWrapperKt.setCurrentLogHandler(value);
        }

        public final void setLogLevel(LogLevel value) {
            AbstractC5504s.h(value, "value");
            Config.INSTANCE.setLogLevel(value);
        }

        public final void setPlatformInfo(PlatformInfo platformInfo) {
            AbstractC5504s.h(platformInfo, "<set-?>");
            PurchasesOrchestrator.platformInfo = platformInfo;
        }

        public final void setProxyURL(URL url) {
            PurchasesOrchestrator.proxyURL = url;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Store.values().length];
            try {
                iArr[Store.PLAY_STORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Store.GALAXY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$clearInMemoryCacheAndFetchOfferingsWithRateLimit$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/revenuecat/purchases/PurchasesOrchestrator$clearInMemoryCacheAndFetchOfferingsWithRateLimit$2", "Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;", "Lcom/revenuecat/purchases/Offerings;", "offerings", "LTd/L;", "onReceived", "(Lcom/revenuecat/purchases/Offerings;)V", "Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "onError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C40412 implements ReceiveOfferingsCallback {
        C40412() {
        }

        @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
        public void onError(PurchasesError purchasesError) {
            AbstractC5504s.h(purchasesError, "error");
            function2.invoke(null, purchasesError);
        }

        @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
        public void onReceived(Offerings offerings) {
            AbstractC5504s.h(offerings, "offerings");
            function2.invoke(offerings, null);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$close$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40422 extends AbstractC5506u implements InterfaceC5082a {
        C40422() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m149invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m149invoke() {
            ((r) PurchasesOrchestrator.this.getProcessLifecycleOwnerProvider().invoke()).getLifecycle().removeObserver(PurchasesOrchestrator.this.getLifecycleHandler());
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$createCallbackWithDiagnosticsIfNeeded$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"com/revenuecat/purchases/PurchasesOrchestrator$createCallbackWithDiagnosticsIfNeeded$1", "Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "Lcom/revenuecat/purchases/models/StoreTransaction;", "storeTransaction", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "LTd/L;", "onCompleted", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/CustomerInfo;)V", "Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "", "userCancelled", "onError", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C40431 implements PurchaseCallback {
        final /* synthetic */ PurchaseCallback $originalCallback;
        final /* synthetic */ PurchasingData $purchasingData;
        final /* synthetic */ Date $startTime;

        C40431(PurchasingData purchasingData, Date date, PurchaseCallback purchaseCallback) {
            purchasingData = purchasingData;
            date = date;
            purchaseCallback = purchaseCallback;
        }

        @Override // com.revenuecat.purchases.interfaces.PurchaseCallback
        public void onCompleted(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
            AbstractC5504s.h(storeTransaction, "storeTransaction");
            AbstractC5504s.h(customerInfo, "customerInfo");
            PurchasesOrchestrator.this.trackPurchaseResultIfNeeded(purchasingData, null, date, customerInfo.getEntitlements().getVerification());
            purchaseCallback.onCompleted(storeTransaction, customerInfo);
        }

        @Override // com.revenuecat.purchases.interfaces.PurchaseErrorCallback
        public void onError(PurchasesError purchasesError, boolean userCancelled) {
            AbstractC5504s.h(purchasesError, "error");
            PurchasesOrchestrator.this.trackPurchaseResultIfNeeded(purchasingData, purchasesError, date, null);
            purchaseCallback.onError(purchasesError, userCancelled);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$dispatch$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40441 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ PurchasesError $error;
        final /* synthetic */ PurchaseErrorCallback $this_dispatch;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40441(PurchaseErrorCallback purchaseErrorCallback, PurchasesError purchasesError) {
            super(0);
            this.$this_dispatch = purchaseErrorCallback;
            this.$error = purchasesError;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m150invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m150invoke() {
            PurchaseErrorCallback purchaseErrorCallback = this.$this_dispatch;
            PurchasesError purchasesError = this.$error;
            purchaseErrorCallback.onError(purchasesError, purchasesError.getCode() == PurchasesErrorCode.PurchaseCancelledError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$getAmazonLWAConsentStatus$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/AmazonLWAConsentStatus;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/AmazonLWAConsentStatus;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40451 extends AbstractC5506u implements Function1 {
        final /* synthetic */ GetAmazonLWAConsentStatusCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40451(GetAmazonLWAConsentStatusCallback getAmazonLWAConsentStatusCallback) {
            super(1);
            this.$callback = getAmazonLWAConsentStatusCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AmazonLWAConsentStatus) obj);
            return L.f17438a;
        }

        public final void invoke(AmazonLWAConsentStatus it) {
            AbstractC5504s.h(it, "it");
            this.$callback.onSuccess(it);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$getAmazonLWAConsentStatus$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40462 extends AbstractC5506u implements Function1 {
        final /* synthetic */ GetAmazonLWAConsentStatusCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40462(GetAmazonLWAConsentStatusCallback getAmazonLWAConsentStatusCallback) {
            super(1);
            this.$callback = getAmazonLWAConsentStatusCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError it) {
            AbstractC5504s.h(it, "it");
            this.$callback.onError(it);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$getCustomerCenterConfig$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "config", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40471 extends AbstractC5506u implements Function1 {
        final /* synthetic */ GetCustomerCenterConfigCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40471(GetCustomerCenterConfigCallback getCustomerCenterConfigCallback) {
            super(1);
            this.$callback = getCustomerCenterConfigCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerCenterConfigData) obj);
            return L.f17438a;
        }

        public final void invoke(CustomerCenterConfigData config) {
            AbstractC5504s.h(config, "config");
            this.$callback.onSuccess(config);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$getCustomerCenterConfig$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40482 extends AbstractC5506u implements Function1 {
        final /* synthetic */ GetCustomerCenterConfigCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40482(GetCustomerCenterConfigCallback getCustomerCenterConfigCallback) {
            super(1);
            this.$callback = getCustomerCenterConfigCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError error) {
            AbstractC5504s.h(error, "error");
            this.$callback.onError(error);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$getOfferings$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40491 extends AbstractC5506u implements Function1 {
        final /* synthetic */ ReceiveOfferingsCallback $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40491(ReceiveOfferingsCallback receiveOfferingsCallback) {
            super(1);
            this.$listener = receiveOfferingsCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError it) {
            AbstractC5504s.h(it, "it");
            this.$listener.onError(it);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$getOfferings$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/Offerings;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/Offerings;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40502 extends AbstractC5506u implements Function1 {
        final /* synthetic */ ReceiveOfferingsCallback $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40502(ReceiveOfferingsCallback receiveOfferingsCallback) {
            super(1);
            this.$listener = receiveOfferingsCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Offerings) obj);
            return L.f17438a;
        }

        public final void invoke(Offerings it) {
            AbstractC5504s.h(it, "it");
            this.$listener.onReceived(it);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$getProducts$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/revenuecat/purchases/PurchasesOrchestrator$getProducts$1", "Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProducts", "LTd/L;", "onReceived", "(Ljava/util/List;)V", "Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "onError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C40511 implements GetStoreProductsCallback {
        final /* synthetic */ GetStoreProductsCallback $callback;
        final /* synthetic */ Map<String, Set<String>> $requestedBasePlansByProductId;

        C40511(Map<String, Set<String>> map, GetStoreProductsCallback getStoreProductsCallback) {
            map = map;
            getStoreProductsCallback = getStoreProductsCallback;
        }

        @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
        public void onError(PurchasesError purchasesError) {
            AbstractC5504s.h(purchasesError, "error");
            getStoreProductsCallback.onError(purchasesError);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
        public void onReceived(List<? extends StoreProduct> storeProducts) {
            boolean zE0;
            AbstractC5504s.h(storeProducts, "storeProducts");
            if (!map.isEmpty()) {
                Map<String, Set<String>> map = map;
                ArrayList arrayList = new ArrayList();
                for (Object obj : storeProducts) {
                    StoreProduct storeProduct = (StoreProduct) obj;
                    Set<String> set = map.get(storeProduct.getPurchasingData().getProductId());
                    if (set != null) {
                        Set<String> set2 = set;
                        GoogleStoreProduct googleStoreProduct = storeProduct instanceof GoogleStoreProduct ? (GoogleStoreProduct) storeProduct : null;
                        zE0 = AbstractC2279u.e0(set2, googleStoreProduct != null ? googleStoreProduct.getBasePlanId() : null);
                    } else {
                        zE0 = true;
                    }
                    if (zE0) {
                        arrayList.add(obj);
                    }
                }
                storeProducts = arrayList;
            }
            getStoreProductsCallback.onReceived(storeProducts);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$getPurchasesUpdatedListener$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/revenuecat/purchases/PurchasesOrchestrator$getPurchasesUpdatedListener$1", "Lcom/revenuecat/purchases/common/BillingAbstract$PurchasesUpdatedListener;", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "purchases", "LTd/L;", "onPurchasesUpdated", "(Ljava/util/List;)V", "Lcom/revenuecat/purchases/PurchasesError;", "purchasesError", "onPurchasesFailedToUpdate", "(Lcom/revenuecat/purchases/PurchasesError;)V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C40521 implements BillingAbstract.PurchasesUpdatedListener {
        C40521() {
        }

        @Override // com.revenuecat.purchases.common.BillingAbstract.PurchasesUpdatedListener
        public void onPurchasesFailedToUpdate(PurchasesError purchasesError) {
            L l10;
            AbstractC5504s.h(purchasesError, "purchasesError");
            PurchasesOrchestrator purchasesOrchestrator = PurchasesOrchestrator.this;
            synchronized (purchasesOrchestrator) {
                try {
                    ProductChangeCallback andClearProductChangeCallback = purchasesOrchestrator.getAndClearProductChangeCallback();
                    if (andClearProductChangeCallback != null) {
                        purchasesOrchestrator.dispatch(andClearProductChangeCallback, purchasesError);
                        l10 = L.f17438a;
                    } else {
                        l10 = null;
                    }
                    if (l10 == null) {
                        Iterator it = purchasesOrchestrator.getAndClearAllPurchaseCallbacks().iterator();
                        while (it.hasNext()) {
                            purchasesOrchestrator.dispatch((PurchaseCallback) it.next(), purchasesError);
                        }
                    }
                    L l11 = L.f17438a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:54:0x0017 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:49:0x000b, B:69:0x0055, B:71:0x005f, B:73:0x006c, B:72:0x0068, B:54:0x0017, B:55:0x001b, B:57:0x0021, B:59:0x002d, B:62:0x0034, B:63:0x0038, B:65:0x003e), top: B:79:0x000b }] */
        @Override // com.revenuecat.purchases.common.BillingAbstract.PurchasesUpdatedListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onPurchasesUpdated(java.util.List<com.revenuecat.purchases.models.StoreTransaction> r11) {
            /*
                r10 = this;
                java.lang.String r0 = "purchases"
                kotlin.jvm.internal.AbstractC5504s.h(r11, r0)
                com.revenuecat.purchases.PurchasesOrchestrator r1 = com.revenuecat.purchases.PurchasesOrchestrator.this
                monitor-enter(r1)
                r0 = 1
                if (r11 == 0) goto L17
                boolean r2 = r11.isEmpty()     // Catch: java.lang.Throwable -> L13
                if (r2 == 0) goto L17
            L11:
                r7 = r0
                goto L55
            L13:
                r0 = move-exception
                r11 = r0
                goto L99
            L17:
                java.util.Iterator r2 = r11.iterator()     // Catch: java.lang.Throwable -> L13
            L1b:
                boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L13
                if (r3 == 0) goto L11
                java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L13
                com.revenuecat.purchases.models.StoreTransaction r3 = (com.revenuecat.purchases.models.StoreTransaction) r3     // Catch: java.lang.Throwable -> L13
                java.util.List r3 = r3.getProductIds()     // Catch: java.lang.Throwable -> L13
                if (r3 == 0) goto L34
                boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> L13
                if (r4 == 0) goto L34
                goto L53
            L34:
                java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L13
            L38:
                boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L13
                if (r4 == 0) goto L53
                java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L13
                java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L13
                com.revenuecat.purchases.PurchasesState r5 = r1.getState$purchases_defaultsBc8Release()     // Catch: java.lang.Throwable -> L13
                java.util.Map r5 = r5.getPurchaseCallbacksByProductId()     // Catch: java.lang.Throwable -> L13
                boolean r4 = r5.containsKey(r4)     // Catch: java.lang.Throwable -> L13
                if (r4 == 0) goto L38
                goto L1b
            L53:
                r0 = 0
                goto L11
            L55:
                com.revenuecat.purchases.PurchasesState r0 = r1.getState$purchases_defaultsBc8Release()     // Catch: java.lang.Throwable -> L13
                com.revenuecat.purchases.interfaces.ProductChangeCallback r0 = r0.getDeprecatedProductChangeCallback()     // Catch: java.lang.Throwable -> L13
                if (r0 == 0) goto L68
                com.revenuecat.purchases.interfaces.ProductChangeCallback r0 = com.revenuecat.purchases.PurchasesOrchestrator.access$getAndClearProductChangeCallback(r1)     // Catch: java.lang.Throwable -> L13
                android.util.Pair r0 = com.revenuecat.purchases.PurchasesOrchestrator.access$getProductChangeCompletedCallbacks(r1, r0)     // Catch: java.lang.Throwable -> L13
                goto L6c
            L68:
                android.util.Pair r0 = com.revenuecat.purchases.PurchasesOrchestrator.access$getPurchaseCompletedCallbacks(r1)     // Catch: java.lang.Throwable -> L13
            L6c:
                Td.L r2 = Td.L.f17438a     // Catch: java.lang.Throwable -> L13
                monitor-exit(r1)
                com.revenuecat.purchases.PurchasesOrchestrator r1 = com.revenuecat.purchases.PurchasesOrchestrator.this
                com.revenuecat.purchases.PostTransactionWithProductDetailsHelper r2 = com.revenuecat.purchases.PurchasesOrchestrator.access$getPostTransactionWithProductDetailsHelper$p(r1)
                com.revenuecat.purchases.PurchasesOrchestrator r1 = com.revenuecat.purchases.PurchasesOrchestrator.this
                boolean r4 = r1.getAllowSharingPlayStoreAccount()
                com.revenuecat.purchases.PurchasesOrchestrator r1 = com.revenuecat.purchases.PurchasesOrchestrator.this
                java.lang.String r5 = r1.getAppUserID()
                com.revenuecat.purchases.PostReceiptInitiationSource r6 = com.revenuecat.purchases.PostReceiptInitiationSource.PURCHASE
                java.lang.Object r1 = r0.first
                r8 = r1
                kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
                java.lang.Object r0 = r0.second
                r9 = r0
                kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
                r3 = r11
                r2.postTransactions(r3, r4, r5, r6, r7, r8, r9)
                com.revenuecat.purchases.PurchasesOrchestrator r11 = com.revenuecat.purchases.PurchasesOrchestrator.this
                com.revenuecat.purchases.common.Delay r0 = com.revenuecat.purchases.common.Delay.NONE
                com.revenuecat.purchases.PurchasesOrchestrator.access$flushEvents(r11, r0)
                return
            L99:
                monitor-exit(r1)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.PurchasesOrchestrator.C40521.onPurchasesUpdated(java.util.List):void");
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$getStorefrontLocale$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/revenuecat/purchases/PurchasesOrchestrator$getStorefrontLocale$1", "Lcom/revenuecat/purchases/interfaces/GetStorefrontCallback;", "", "storefrontCountryCode", "LTd/L;", "onReceived", "(Ljava/lang/String;)V", "Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "onError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C40531 implements GetStorefrontCallback {
        C40531() {
        }

        @Override // com.revenuecat.purchases.interfaces.GetStorefrontCallback
        public void onError(PurchasesError purchasesError) {
            AbstractC5504s.h(purchasesError, "error");
            getStorefrontLocaleCallback.onError(purchasesError);
        }

        @Override // com.revenuecat.purchases.interfaces.GetStorefrontCallback
        public void onReceived(String storefrontCountryCode) {
            AbstractC5504s.h(storefrontCountryCode, "storefrontCountryCode");
            GetStorefrontLocaleCallback getStorefrontLocaleCallback = getStorefrontLocaleCallback;
            Locale localeBuild = new Locale.Builder().setRegion(storefrontCountryCode).build();
            AbstractC5504s.g(localeBuild, "Builder().setRegion(storefrontCountryCode).build()");
            getStorefrontLocaleCallback.onReceived(localeBuild);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logIn$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40543 extends AbstractC5506u implements Function1 {
        final /* synthetic */ LogInCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logIn$3$1 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
            final /* synthetic */ LogInCallback $callback;
            final /* synthetic */ CustomerInfo $customerInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(LogInCallback logInCallback, CustomerInfo customerInfo) {
                super(0);
                this.$callback = logInCallback;
                this.$customerInfo = customerInfo;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m159invoke();
                return L.f17438a;
            }

            /* JADX INFO: renamed from: invoke */
            public final void m159invoke() {
                LogInCallback logInCallback = this.$callback;
                if (logInCallback != null) {
                    logInCallback.onReceived(this.$customerInfo, false);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40543(LogInCallback logInCallback) {
            super(1);
            this.$callback = logInCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return L.f17438a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            AbstractC5504s.h(customerInfo, "customerInfo");
            PurchasesOrchestrator.this.dispatch(new AnonymousClass1(this.$callback, customerInfo));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logIn$4 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass4 extends AbstractC5506u implements Function1 {
        final /* synthetic */ LogInCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logIn$4$1 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
            final /* synthetic */ LogInCallback $callback;
            final /* synthetic */ PurchasesError $error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(LogInCallback logInCallback, PurchasesError purchasesError) {
                super(0);
                this.$callback = logInCallback;
                this.$error = purchasesError;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m160invoke();
                return L.f17438a;
            }

            /* JADX INFO: renamed from: invoke */
            public final void m160invoke() {
                LogInCallback logInCallback = this.$callback;
                if (logInCallback != null) {
                    logInCallback.onError(this.$error);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(LogInCallback logInCallback) {
            super(1);
            this.$callback = logInCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError error) {
            AbstractC5504s.h(error, "error");
            PurchasesOrchestrator.this.dispatch(new AnonymousClass1(this.$callback, error));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logOut$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40551 extends AbstractC5506u implements Function1 {
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;
        final /* synthetic */ PurchasesOrchestrator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40551(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesOrchestrator purchasesOrchestrator) {
            super(1);
            this.$callback = receiveCustomerInfoCallback;
            this.this$0 = purchasesOrchestrator;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError != null) {
                ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
                if (receiveCustomerInfoCallback != null) {
                    receiveCustomerInfoCallback.onError(purchasesError);
                    return;
                }
                return;
            }
            PurchasesOrchestrator purchasesOrchestrator = this.this$0;
            synchronized (purchasesOrchestrator) {
                PurchasesState state$purchases_defaultsBc8Release = purchasesOrchestrator.getState$purchases_defaultsBc8Release();
                Map map = Collections.EMPTY_MAP;
                AbstractC5504s.g(map, "emptyMap()");
                purchasesOrchestrator.setState$purchases_defaultsBc8Release(PurchasesState.copy$default(state$purchases_defaultsBc8Release, null, map, null, false, false, 29, null));
                L l10 = L.f17438a;
            }
            PurchasesOrchestrator purchasesOrchestrator2 = this.this$0;
            purchasesOrchestrator2.updateAllCaches(purchasesOrchestrator2.identityManager.getCurrentAppUserID(), this.$callback);
            this.this$0.backupManager.dataChanged();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$onAppForegrounded$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40563 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ J $firstTimeInForeground;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$onAppForegrounded$3$2 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/revenuecat/purchases/PurchasesOrchestrator$onAppForegrounded$3$2", "Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "LTd/L;", "onReceived", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "onError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass2 implements ReceiveCustomerInfoCallback {
            AnonymousClass2() {
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onError(PurchasesError purchasesError) {
                AbstractC5504s.h(purchasesError, "error");
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onReceived(CustomerInfo customerInfo) {
                AbstractC5504s.h(customerInfo, "customerInfo");
                purchasesOrchestrator.blockstoreHelper.storeUserIdIfNeeded(customerInfo);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40563(J j10) {
            super(0);
            this.$firstTimeInForeground = j10;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m161invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m161invoke() {
            DiagnosticsSynchronizer diagnosticsSynchronizer;
            LogHandler currentLogHandler;
            String str;
            String str2;
            if (PurchasesOrchestrator.this.getAppConfig().getUiPreviewMode()) {
                return;
            }
            if (PurchasesOrchestrator.this.shouldRefreshCustomerInfo(this.$firstTimeInForeground.f52255a)) {
                LogIntent logIntent = LogIntent.DEBUG;
                PurchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1 purchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1 = new PurchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1(logIntent);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            str = "[Purchases] - " + logLevel.name();
                            str2 = (String) purchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            str = "[Purchases] - " + logLevel4.name();
                            str2 = (String) purchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            str = "[Purchases] - " + logLevel6.name();
                            str2 = (String) purchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            str = "[Purchases] - " + logLevel7.name();
                            str2 = (String) purchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1.invoke(), null);
                        break;
                }
                CustomerInfoHelper.retrieveCustomerInfo$default(PurchasesOrchestrator.this.customerInfoHelper, PurchasesOrchestrator.this.identityManager.getCurrentAppUserID(), CacheFetchPolicy.FETCH_CURRENT, false, PurchasesOrchestrator.this.getAllowSharingPlayStoreAccount(), false, new ReceiveCustomerInfoCallback() { // from class: com.revenuecat.purchases.PurchasesOrchestrator.onAppForegrounded.3.2
                    AnonymousClass2() {
                    }

                    @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
                    public void onError(PurchasesError purchasesError) {
                        AbstractC5504s.h(purchasesError, "error");
                    }

                    @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
                    public void onReceived(CustomerInfo customerInfo) {
                        AbstractC5504s.h(customerInfo, "customerInfo");
                        purchasesOrchestrator.blockstoreHelper.storeUserIdIfNeeded(customerInfo);
                    }
                }, 16, null);
            }
            PurchasesOrchestrator.this.offeringsManager.onAppForeground(PurchasesOrchestrator.this.identityManager.getCurrentAppUserID());
            PostPendingTransactionsHelper.syncPendingPurchaseQueue$default(PurchasesOrchestrator.this.postPendingTransactionsHelper, PurchasesOrchestrator.this.getAllowSharingPlayStoreAccount(), null, 2, null);
            PurchasesOrchestrator.this.synchronizeSubscriberAttributesIfNeeded();
            OfflineEntitlementsManager.updateProductEntitlementMappingCacheIfStale$default(PurchasesOrchestrator.this.getOfflineEntitlementsManager(), null, 1, null);
            PurchasesOrchestrator.this.flushEvents(Delay.DEFAULT);
            if (this.$firstTimeInForeground.f52255a && AndroidVersionUtilsKt.isAndroidNOrNewer() && (diagnosticsSynchronizer = PurchasesOrchestrator.this.diagnosticsSynchronizer) != null) {
                diagnosticsSynchronizer.syncDiagnosticsFileIfNeeded();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$overridePreferredUILocale$4 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/Offerings;", "offerings", "Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/Offerings;Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40574 extends AbstractC5506u implements Function2 {
        public static final C40574 INSTANCE = new C40574();

        C40574() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Offerings) obj, (PurchasesError) obj2);
            return L.f17438a;
        }

        public final void invoke(Offerings offerings, PurchasesError purchasesError) {
            if (offerings != null) {
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), "Fresh offerings fetch completed successfully");
                    return;
                }
                return;
            }
            LogLevel logLevel2 = LogLevel.DEBUG;
            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                String str = "[Purchases] - " + logLevel2.name();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Fresh offerings fetch failed: ");
                sb2.append(purchasesError != null ? purchasesError.getMessage() : null);
                currentLogHandler2.d(str, sb2.toString());
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$purchase$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40581 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ PurchaseCallback $callback;
        final /* synthetic */ Result<L, PurchasesError> $purchaseParamsValidationResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40581(PurchaseCallback purchaseCallback, Result<L, PurchasesError> result) {
            super(0);
            this.$callback = purchaseCallback;
            this.$purchaseParamsValidationResult = result;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m162invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m162invoke() {
            this.$callback.onError((PurchasesError) ((Result.Error) this.$purchaseParamsValidationResult).getValue(), false);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "purchaseRecord", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/models/StoreTransaction;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40593 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ Boolean $isPersonalizedPrice;
        final /* synthetic */ PresentedOfferingContext $presentedOfferingContext;
        final /* synthetic */ N $previousProductId;
        final /* synthetic */ PurchasingData $purchasingData;
        final /* synthetic */ ReplacementMode $replacementMode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40593(Activity activity, String str, PurchasingData purchasingData, ReplacementMode replacementMode, PresentedOfferingContext presentedOfferingContext, Boolean bool, N n10) {
            super(1);
            this.$activity = activity;
            this.$appUserID = str;
            this.$purchasingData = purchasingData;
            this.$replacementMode = replacementMode;
            this.$presentedOfferingContext = presentedOfferingContext;
            this.$isPersonalizedPrice = bool;
            this.$previousProductId = n10;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((StoreTransaction) obj);
            return L.f17438a;
        }

        public final void invoke(StoreTransaction purchaseRecord) {
            LogHandler currentLogHandler;
            String str;
            String str2;
            AbstractC5504s.h(purchaseRecord, "purchaseRecord");
            LogIntent logIntent = LogIntent.PURCHASE;
            PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1 purchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1 = new PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1(logIntent, this.$previousProductId);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1.invoke(), null);
                    break;
            }
            PurchasesOrchestrator.this.billing.makePurchaseAsync(this.$activity, this.$appUserID, this.$purchasingData, new ReplaceProductInfo(purchaseRecord, this.$replacementMode), this.$presentedOfferingContext, this.$isPersonalizedPrice);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$4 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40604 extends AbstractC5506u implements Function1 {
        final /* synthetic */ PurchaseErrorCallback $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40604(PurchaseErrorCallback purchaseErrorCallback) {
            super(1);
            this.$listener = purchaseErrorCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError error) {
            LogHandler currentLogHandler;
            String str;
            String str2;
            AbstractC5504s.h(error, "error");
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1 purchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1 = new PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1(logIntent, error);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1.invoke(), null);
                    break;
            }
            PurchasesOrchestrator.this.getAndClearProductChangeCallback();
            PurchasesOrchestrator.this.getAndClearAllPurchaseCallbacks();
            PurchasesOrchestrator.this.dispatch(this.$listener, error);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$restorePurchases$4 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40614 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ ReceiveCustomerInfoCallback $callbackWithTracking;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$restorePurchases$4$1 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreTransaction;", "allPurchases", "LTd/L;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
            final /* synthetic */ String $appUserID;
            final /* synthetic */ ReceiveCustomerInfoCallback $callbackWithTracking;
            final /* synthetic */ PurchasesOrchestrator this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PurchasesOrchestrator purchasesOrchestrator, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, String str) {
                super(1);
                this.this$0 = purchasesOrchestrator;
                this.$callbackWithTracking = receiveCustomerInfoCallback;
                this.$appUserID = str;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<StoreTransaction>) obj);
                return L.f17438a;
            }

            public final void invoke(List<StoreTransaction> allPurchases) {
                LogHandler currentLogHandler;
                String str;
                String str2;
                AbstractC5504s.h(allPurchases, "allPurchases");
                if (!allPurchases.isEmpty()) {
                    List<StoreTransaction> listR0 = AbstractC2279u.R0(allPurchases, new Comparator() { // from class: com.revenuecat.purchases.PurchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$sortedBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t10, T t11) {
                            return Xd.a.d(Long.valueOf(((StoreTransaction) t10).getPurchaseTime()), Long.valueOf(((StoreTransaction) t11).getPurchaseTime()));
                        }
                    });
                    PurchasesOrchestrator purchasesOrchestrator = this.this$0;
                    String str3 = this.$appUserID;
                    ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callbackWithTracking;
                    for (StoreTransaction storeTransaction : listR0) {
                        purchasesOrchestrator.postReceiptHelper.postTransactionAndConsumeIfNeeded(storeTransaction, null, null, true, str3, PostReceiptInitiationSource.RESTORE, false, new PurchasesOrchestrator$restorePurchases$4$1$3$1$1(listR0, storeTransaction, purchasesOrchestrator, receiveCustomerInfoCallback), new PurchasesOrchestrator$restorePurchases$4$1$3$1$2(listR0, storeTransaction, purchasesOrchestrator, receiveCustomerInfoCallback));
                    }
                    return;
                }
                LogIntent logIntent = LogIntent.DEBUG;
                PurchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1 purchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1 = new PurchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1(logIntent);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            str = "[Purchases] - " + logLevel.name();
                            str2 = (String) purchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            str = "[Purchases] - " + logLevel4.name();
                            str2 = (String) purchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            str = "[Purchases] - " + logLevel6.name();
                            str2 = (String) purchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            str = "[Purchases] - " + logLevel7.name();
                            str2 = (String) purchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                }
                this.this$0.getCustomerInfo(this.$callbackWithTracking);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$restorePurchases$4$2 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass2 extends AbstractC5506u implements Function1 {
            final /* synthetic */ ReceiveCustomerInfoCallback $callbackWithTracking;
            final /* synthetic */ PurchasesOrchestrator this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$restorePurchases$4$2$1 */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
                final /* synthetic */ ReceiveCustomerInfoCallback $callbackWithTracking;
                final /* synthetic */ PurchasesError $error;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesError purchasesError) {
                    super(0);
                    this.$callbackWithTracking = receiveCustomerInfoCallback;
                    this.$error = purchasesError;
                }

                @Override // ie.InterfaceC5082a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m166invoke();
                    return L.f17438a;
                }

                /* JADX INFO: renamed from: invoke */
                public final void m166invoke() {
                    this.$callbackWithTracking.onError(this.$error);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PurchasesOrchestrator purchasesOrchestrator, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
                super(1);
                this.this$0 = purchasesOrchestrator;
                this.$callbackWithTracking = receiveCustomerInfoCallback;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return L.f17438a;
            }

            public final void invoke(PurchasesError error) {
                AbstractC5504s.h(error, "error");
                this.this$0.dispatch(new AnonymousClass1(this.$callbackWithTracking, error));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40614(String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
            super(0);
            this.$appUserID = str;
            this.$callbackWithTracking = receiveCustomerInfoCallback;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m163invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m163invoke() {
            BillingAbstract billingAbstract = PurchasesOrchestrator.this.billing;
            String str = this.$appUserID;
            billingAbstract.queryAllPurchases(str, new AnonymousClass1(PurchasesOrchestrator.this, this.$callbackWithTracking, str), new AnonymousClass2(PurchasesOrchestrator.this, this.$callbackWithTracking));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$showInAppMessagesIfNeeded$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40621 extends AbstractC5506u implements InterfaceC5082a {
        C40621() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m167invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m167invoke() {
            PurchasesOrchestrator.syncPurchases$default(PurchasesOrchestrator.this, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncAmazonPurchase$4 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "normalizedProductID", "LTd/L;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40634 extends AbstractC5506u implements Function1 {
        final /* synthetic */ String $amazonUserID;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ String $isoCurrencyCode;
        final /* synthetic */ Double $price;
        final /* synthetic */ Long $purchaseTime;
        final /* synthetic */ String $receiptID;
        final /* synthetic */ PurchasesOrchestrator this$0;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncAmazonPurchase$4$1 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
            final /* synthetic */ String $amazonUserID;
            final /* synthetic */ String $receiptID;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str, String str2) {
                super(1);
                this.$receiptID = str;
                this.$amazonUserID = str2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CustomerInfo) obj);
                return L.f17438a;
            }

            public final void invoke(CustomerInfo it) {
                AbstractC5504s.h(it, "it");
                LogIntent logIntent = LogIntent.PURCHASE;
                PurchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1 purchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1 = new PurchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1(logIntent, this.$receiptID, this.$amazonUserID);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            currentLogHandler.d("[Purchases] - " + logLevel.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            currentLogHandler4.d("[Purchases] - " + logLevel4.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            currentLogHandler6.d("[Purchases] - " + logLevel6.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            currentLogHandler7.d("[Purchases] - " + logLevel7.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler8.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler9.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler10.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                }
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncAmazonPurchase$4$2 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass2 extends AbstractC5506u implements Function1 {
            final /* synthetic */ String $amazonUserID;
            final /* synthetic */ String $receiptID;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(String str, String str2) {
                super(1);
                this.$receiptID = str;
                this.$amazonUserID = str2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return L.f17438a;
            }

            public final void invoke(PurchasesError error) {
                AbstractC5504s.h(error, "error");
                LogIntent logIntent = LogIntent.RC_ERROR;
                PurchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1 purchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1 = new PurchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1(logIntent, this.$receiptID, this.$amazonUserID, error);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            currentLogHandler.d("[Purchases] - " + logLevel.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            currentLogHandler4.d("[Purchases] - " + logLevel4.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            currentLogHandler6.d("[Purchases] - " + logLevel6.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            currentLogHandler7.d("[Purchases] - " + logLevel7.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler8.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler9.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler10.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1.invoke(), null);
                        break;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40634(Double d10, String str, Long l10, String str2, PurchasesOrchestrator purchasesOrchestrator, String str3, String str4) {
            super(1);
            this.$price = d10;
            this.$isoCurrencyCode = str;
            this.$purchaseTime = l10;
            this.$amazonUserID = str2;
            this.this$0 = purchasesOrchestrator;
            this.$receiptID = str3;
            this.$appUserID = str4;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return L.f17438a;
        }

        public final void invoke(String normalizedProductID) {
            AbstractC5504s.h(normalizedProductID, "normalizedProductID");
            List listE = AbstractC2279u.e(normalizedProductID);
            Double d10 = this.$price;
            Double d11 = (d10 == null || d10.doubleValue() == 0.0d) ? null : d10;
            String str = this.$isoCurrencyCode;
            this.this$0.postReceiptHelper.postTokenWithoutConsuming(this.$receiptID, new ReceiptInfo(listE, this.$purchaseTime, null, d11, null, (str == null || Df.r.l0(str)) ? null : str, null, null, null, null, false, this.$amazonUserID, null, 2004, null), this.this$0.getAllowSharingPlayStoreAccount(), this.$appUserID, PostReceiptInitiationSource.RESTORE, new AnonymousClass1(this.$receiptID, this.$amazonUserID), new AnonymousClass2(this.$receiptID, this.$amazonUserID), (128 & 128) != 0 ? null : null);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncAmazonPurchase$5 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass5 extends AbstractC5506u implements Function1 {
        final /* synthetic */ String $amazonUserID;
        final /* synthetic */ String $receiptID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(String str, String str2) {
            super(1);
            this.$receiptID = str;
            this.$amazonUserID = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError error) {
            AbstractC5504s.h(error, "error");
            LogIntent logIntent = LogIntent.RC_ERROR;
            PurchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1 purchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1 = new PurchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1(logIntent, this.$receiptID, this.$amazonUserID, error);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.d("[Purchases] - " + logLevel.name(), (String) purchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        currentLogHandler4.d("[Purchases] - " + logLevel4.name(), (String) purchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        currentLogHandler6.d("[Purchases] - " + logLevel6.name(), (String) purchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        currentLogHandler7.d("[Purchases] - " + logLevel7.name(), (String) purchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler8.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler9.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler10.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1.invoke(), null);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40642 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1 $receiveOfferingsCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40642(PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1 purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1) {
            super(0);
            this.$receiveOfferingsCallback = purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m168invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m168invoke() {
            PurchasesOrchestrator.this.getOfferings(this.$receiveOfferingsCallback, true);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncPurchases$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/revenuecat/purchases/PurchasesOrchestrator$syncPurchases$2", "Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "LTd/L;", "onReceived", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "onError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C40652 implements ReceiveCustomerInfoCallback {
        C40652() {
        }

        @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
        public void onError(PurchasesError purchasesError) {
            AbstractC5504s.h(purchasesError, "error");
            SyncPurchasesCallback syncPurchasesCallback = syncPurchasesCallback;
            if (syncPurchasesCallback != null) {
                syncPurchasesCallback.onError(purchasesError);
            }
        }

        @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
        public void onReceived(CustomerInfo customerInfo) {
            AbstractC5504s.h(customerInfo, "customerInfo");
            SyncPurchasesCallback syncPurchasesCallback = syncPurchasesCallback;
            if (syncPurchasesCallback != null) {
                syncPurchasesCallback.onSuccess(customerInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncPurchases$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40663 extends AbstractC5506u implements Function1 {
        final /* synthetic */ SyncPurchasesCallback $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40663(SyncPurchasesCallback syncPurchasesCallback) {
            super(1);
            this.$listener = syncPurchasesCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return L.f17438a;
        }

        public final void invoke(CustomerInfo it) {
            AbstractC5504s.h(it, "it");
            SyncPurchasesCallback syncPurchasesCallback = this.$listener;
            if (syncPurchasesCallback != null) {
                syncPurchasesCallback.onSuccess(it);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncPurchases$4 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40674 extends AbstractC5506u implements Function1 {
        final /* synthetic */ SyncPurchasesCallback $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40674(SyncPurchasesCallback syncPurchasesCallback) {
            super(1);
            this.$listener = syncPurchasesCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError it) {
            AbstractC5504s.h(it, "it");
            SyncPurchasesCallback syncPurchasesCallback = this.$listener;
            if (syncPurchasesCallback != null) {
                syncPurchasesCallback.onError(it);
            }
        }
    }

    public PurchasesOrchestrator(Application application, String str, Backend backend, BillingAbstract billing, DeviceCache deviceCache, IdentityManager identityManager, SubscriberAttributesManager subscriberAttributesManager, AppConfig appConfig, CustomerInfoHelper customerInfoHelper, CustomerInfoUpdateHandler customerInfoUpdateHandler, DiagnosticsSynchronizer diagnosticsSynchronizer, DiagnosticsTracker diagnosticsTracker, DateProvider dateProvider, OfflineEntitlementsManager offlineEntitlementsManager, PostReceiptHelper postReceiptHelper, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, PostPendingTransactionsHelper postPendingTransactionsHelper, SyncPurchasesHelper syncPurchasesHelper, OfferingsManager offeringsManager, EventsManager eventsManager, EventsManager adEventsManager, PaywallPresentedCache paywallPresentedCache, PurchasesStateCache purchasesStateCache, Handler handler, Dispatcher dispatcher, PurchasesConfiguration initialConfiguration, FontLoader fontLoader, DefaultLocaleProvider localeProvider, WebPurchaseRedemptionHelper webPurchaseRedemptionHelper, VirtualCurrencyManager virtualCurrencyManager, PurchaseParamsValidator purchaseParamsValidator, InterfaceC5082a processLifecycleOwnerProvider, BlockstoreHelper blockstoreHelper, BackupManager backupManager, FileRepository fileRepository, AdTracker adTracker) {
        AbstractC5504s.h(application, "application");
        AbstractC5504s.h(backend, "backend");
        AbstractC5504s.h(billing, "billing");
        AbstractC5504s.h(deviceCache, "deviceCache");
        AbstractC5504s.h(identityManager, "identityManager");
        AbstractC5504s.h(subscriberAttributesManager, "subscriberAttributesManager");
        AbstractC5504s.h(appConfig, "appConfig");
        AbstractC5504s.h(customerInfoHelper, "customerInfoHelper");
        AbstractC5504s.h(customerInfoUpdateHandler, "customerInfoUpdateHandler");
        AbstractC5504s.h(dateProvider, "dateProvider");
        AbstractC5504s.h(offlineEntitlementsManager, "offlineEntitlementsManager");
        AbstractC5504s.h(postReceiptHelper, "postReceiptHelper");
        AbstractC5504s.h(postTransactionWithProductDetailsHelper, "postTransactionWithProductDetailsHelper");
        AbstractC5504s.h(postPendingTransactionsHelper, "postPendingTransactionsHelper");
        AbstractC5504s.h(syncPurchasesHelper, "syncPurchasesHelper");
        AbstractC5504s.h(offeringsManager, "offeringsManager");
        AbstractC5504s.h(eventsManager, "eventsManager");
        AbstractC5504s.h(adEventsManager, "adEventsManager");
        AbstractC5504s.h(paywallPresentedCache, "paywallPresentedCache");
        AbstractC5504s.h(purchasesStateCache, "purchasesStateCache");
        AbstractC5504s.h(dispatcher, "dispatcher");
        AbstractC5504s.h(initialConfiguration, "initialConfiguration");
        AbstractC5504s.h(fontLoader, "fontLoader");
        AbstractC5504s.h(localeProvider, "localeProvider");
        AbstractC5504s.h(webPurchaseRedemptionHelper, "webPurchaseRedemptionHelper");
        AbstractC5504s.h(virtualCurrencyManager, "virtualCurrencyManager");
        AbstractC5504s.h(purchaseParamsValidator, "purchaseParamsValidator");
        AbstractC5504s.h(processLifecycleOwnerProvider, "processLifecycleOwnerProvider");
        AbstractC5504s.h(blockstoreHelper, "blockstoreHelper");
        AbstractC5504s.h(backupManager, "backupManager");
        AbstractC5504s.h(fileRepository, "fileRepository");
        AbstractC5504s.h(adTracker, "adTracker");
        this.application = application;
        this.backend = backend;
        this.billing = billing;
        this.deviceCache = deviceCache;
        this.identityManager = identityManager;
        this.subscriberAttributesManager = subscriberAttributesManager;
        this.appConfig = appConfig;
        this.customerInfoHelper = customerInfoHelper;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler;
        this.diagnosticsSynchronizer = diagnosticsSynchronizer;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.dateProvider = dateProvider;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.postReceiptHelper = postReceiptHelper;
        this.postTransactionWithProductDetailsHelper = postTransactionWithProductDetailsHelper;
        this.postPendingTransactionsHelper = postPendingTransactionsHelper;
        this.syncPurchasesHelper = syncPurchasesHelper;
        this.offeringsManager = offeringsManager;
        this.eventsManager = eventsManager;
        this.adEventsManager = adEventsManager;
        this.paywallPresentedCache = paywallPresentedCache;
        this.purchasesStateCache = purchasesStateCache;
        this.mainHandler = handler;
        this.dispatcher = dispatcher;
        this.initialConfiguration = initialConfiguration;
        this.fontLoader = fontLoader;
        this.localeProvider = localeProvider;
        this.webPurchaseRedemptionHelper = webPurchaseRedemptionHelper;
        this.virtualCurrencyManager = virtualCurrencyManager;
        this.purchaseParamsValidator = purchaseParamsValidator;
        this.processLifecycleOwnerProvider = processLifecycleOwnerProvider;
        this.blockstoreHelper = blockstoreHelper;
        this.backupManager = backupManager;
        this.fileRepository = fileRepository;
        this.adTracker = adTracker;
        this.lifecycleHandler = AbstractC2163n.b(new PurchasesOrchestrator$lifecycleHandler$2(this));
        a.C0060a c0060a = Ef.a.f5961b;
        Ef.d dVar = Ef.d.f5971e;
        this.lastSyncAttributesAndOfferingsRateLimiter = new RateLimiter(5, Ef.c.s(60, dVar), null);
        this.preferredLocaleOverrideRateLimiter = new RateLimiter(2, Ef.c.s(60, dVar), null);
        this._preferredUILocaleOverride = initialConfiguration.getPreferredUILocaleOverride();
        localeProvider.setPreferredLocaleOverride(this._preferredUILocaleOverride);
        identityManager.configure(str);
        billing.setStateListener(new BillingAbstract.StateListener() { // from class: com.revenuecat.purchases.PurchasesOrchestrator.2
            AnonymousClass2() {
            }

            @Override // com.revenuecat.purchases.common.BillingAbstract.StateListener
            public void onConnected() {
                PostPendingTransactionsHelper.syncPendingPurchaseQueue$default(PurchasesOrchestrator.this.postPendingTransactionsHelper, PurchasesOrchestrator.this.getAllowSharingPlayStoreAccount(), null, 2, null);
                PurchasesOrchestrator.this.billing.getStorefront(new PurchasesOrchestrator$2$onConnected$1(PurchasesOrchestrator.this), PurchasesOrchestrator$2$onConnected$2.INSTANCE);
            }
        });
        billing.setPurchasesUpdatedListener(getPurchasesUpdatedListener());
        BillingAbstract.startConnectionOnMainThread$default(billing, 0L, 1, null);
        dispatch(new AnonymousClass3());
        if (this.appConfig.getDangerousSettings().getAutoSyncPurchases()) {
            return;
        }
        LogIntent logIntent = LogIntent.WARNING;
        PurchasesOrchestrator$special$$inlined$log$1 purchasesOrchestrator$special$$inlined$log$1 = new PurchasesOrchestrator$special$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), (String) purchasesOrchestrator$special$$inlined$log$1.invoke());
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$special$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$special$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$special$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    currentLogHandler4.d("[Purchases] - " + logLevel4.name(), (String) purchasesOrchestrator$special$$inlined$log$1.invoke());
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$special$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$special$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    currentLogHandler6.d("[Purchases] - " + logLevel6.name(), (String) purchasesOrchestrator$special$$inlined$log$1.invoke());
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    currentLogHandler7.d("[Purchases] - " + logLevel7.name(), (String) purchasesOrchestrator$special$$inlined$log$1.invoke());
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler8.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$special$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler9.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$special$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$special$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler10.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$special$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$special$$inlined$log$1.invoke(), null);
                break;
        }
    }

    private final boolean clearInMemoryCacheAndFetchOfferingsWithRateLimit(Function2 callback) {
        if (this.preferredLocaleOverrideRateLimiter.shouldProceed()) {
            this.offeringsManager.clearInMemoryOfferingsCache();
            LogLevel logLevel = LogLevel.VERBOSE;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.v("[Purchases] - " + logLevel.name(), "Fetching fresh offerings");
            }
            getOfferings$default(this, new ReceiveOfferingsCallback() { // from class: com.revenuecat.purchases.PurchasesOrchestrator.clearInMemoryCacheAndFetchOfferingsWithRateLimit.2
                C40412() {
                }

                @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
                public void onError(PurchasesError purchasesError) {
                    AbstractC5504s.h(purchasesError, "error");
                    function2.invoke(null, purchasesError);
                }

                @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
                public void onReceived(Offerings offerings) {
                    AbstractC5504s.h(offerings, "offerings");
                    function2.invoke(offerings, null);
                }
            }, false, 2, null);
            return true;
        }
        LogLevel logLevel2 = LogLevel.DEBUG;
        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
            currentLogHandler2.d("[Purchases] - " + logLevel2.name(), "Fresh offerings fetch rate limit reached: " + this.preferredLocaleOverrideRateLimiter.getMaxCallsInPeriod() + " per " + Ef.a.y(this.preferredLocaleOverrideRateLimiter.getPeriodSeconds()) + " seconds. Fetch not triggered.");
        }
        return false;
    }

    private final PurchaseCallback createCallbackWithDiagnosticsIfNeeded(PurchaseCallback originalCallback, PurchasingData purchasingData, Date startTime) {
        return this.diagnosticsTrackerIfEnabled == null ? originalCallback : new PurchaseCallback() { // from class: com.revenuecat.purchases.PurchasesOrchestrator.createCallbackWithDiagnosticsIfNeeded.1
            final /* synthetic */ PurchaseCallback $originalCallback;
            final /* synthetic */ PurchasingData $purchasingData;
            final /* synthetic */ Date $startTime;

            C40431(PurchasingData purchasingData2, Date startTime2, PurchaseCallback originalCallback2) {
                purchasingData = purchasingData2;
                date = startTime2;
                purchaseCallback = originalCallback2;
            }

            @Override // com.revenuecat.purchases.interfaces.PurchaseCallback
            public void onCompleted(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
                AbstractC5504s.h(storeTransaction, "storeTransaction");
                AbstractC5504s.h(customerInfo, "customerInfo");
                PurchasesOrchestrator.this.trackPurchaseResultIfNeeded(purchasingData, null, date, customerInfo.getEntitlements().getVerification());
                purchaseCallback.onCompleted(storeTransaction, customerInfo);
            }

            @Override // com.revenuecat.purchases.interfaces.PurchaseErrorCallback
            public void onError(PurchasesError purchasesError, boolean userCancelled) {
                AbstractC5504s.h(purchasesError, "error");
                PurchasesOrchestrator.this.trackPurchaseResultIfNeeded(purchasingData, purchasesError, date, null);
                purchaseCallback.onError(purchasesError, userCancelled);
            }
        };
    }

    public final void dispatch(final InterfaceC5082a action) {
        if (AbstractC5504s.c(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            action.invoke();
            return;
        }
        Handler handler = this.mainHandler;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new Runnable() { // from class: com.revenuecat.purchases.h
            @Override // java.lang.Runnable
            public final void run() {
                action.invoke();
            }
        });
    }

    private final void enqueue(final InterfaceC5082a command) {
        this.dispatcher.enqueue(new Runnable() { // from class: com.revenuecat.purchases.i
            @Override // java.lang.Runnable
            public final void run() {
                command.invoke();
            }
        }, Delay.NONE);
    }

    public final void flushEvents(Delay delay) {
        if (this.appConfig.getUiPreviewMode()) {
            return;
        }
        this.eventsManager.flushEvents(delay);
        this.adEventsManager.flushEvents(delay);
    }

    public final List<PurchaseCallback> getAndClearAllPurchaseCallbacks() {
        List<PurchaseCallback> listB1;
        synchronized (this) {
            Map<String, PurchaseCallback> purchaseCallbacksByProductId = getState$purchases_defaultsBc8Release().getPurchaseCallbacksByProductId();
            PurchasesState state$purchases_defaultsBc8Release = getState$purchases_defaultsBc8Release();
            Map map = Collections.EMPTY_MAP;
            AbstractC5504s.g(map, "emptyMap()");
            setState$purchases_defaultsBc8Release(PurchasesState.copy$default(state$purchases_defaultsBc8Release, null, map, null, false, false, 29, null));
            listB1 = AbstractC2279u.b1(purchaseCallbacksByProductId.values());
        }
        return listB1;
    }

    public final ProductChangeCallback getAndClearProductChangeCallback() {
        ProductChangeCallback deprecatedProductChangeCallback = getState$purchases_defaultsBc8Release().getDeprecatedProductChangeCallback();
        setState$purchases_defaultsBc8Release(PurchasesState.copy$default(getState$purchases_defaultsBc8Release(), null, null, null, false, false, 27, null));
        return deprecatedProductChangeCallback;
    }

    public final void getCustomerInfo(ReceiveCustomerInfoCallback callback) {
        getCustomerInfo(CacheFetchPolicy.INSTANCE.m113default(), false, callback);
    }

    public final AppLifecycleHandler getLifecycleHandler() {
        return (AppLifecycleHandler) this.lifecycleHandler.getValue();
    }

    public static /* synthetic */ void getOfferings$default(PurchasesOrchestrator purchasesOrchestrator, ReceiveOfferingsCallback receiveOfferingsCallback, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        purchasesOrchestrator.getOfferings(receiveOfferingsCallback, z10);
    }

    public final Pair<Function2, Function2> getProductChangeCompletedCallbacks(ProductChangeCallback productChangeListener) {
        return new Pair<>(new PurchasesOrchestrator$getProductChangeCompletedCallbacks$onSuccess$1(productChangeListener, this), new PurchasesOrchestrator$getProductChangeCompletedCallbacks$onError$1(productChangeListener, this));
    }

    public static /* synthetic */ void getProducts$default(PurchasesOrchestrator purchasesOrchestrator, List list, ProductType productType, GetStoreProductsCallback getStoreProductsCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            productType = null;
        }
        purchasesOrchestrator.getProducts(list, productType, getStoreProductsCallback);
    }

    static /* synthetic */ void getProductsOfTypes$default(PurchasesOrchestrator purchasesOrchestrator, Set set, Set set2, List list, Date date, GetStoreProductsCallback getStoreProductsCallback, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            date = null;
        }
        purchasesOrchestrator.getProductsOfTypes(set, set2, list, date, getStoreProductsCallback);
    }

    public final PurchaseCallback getPurchaseCallback(String productId) {
        PurchaseCallback purchaseCallback = getState$purchases_defaultsBc8Release().getPurchaseCallbacksByProductId().get(productId);
        PurchasesState state$purchases_defaultsBc8Release = getState$purchases_defaultsBc8Release();
        Map<String, PurchaseCallback> purchaseCallbacksByProductId = getState$purchases_defaultsBc8Release().getPurchaseCallbacksByProductId();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, PurchaseCallback> entry : purchaseCallbacksByProductId.entrySet()) {
            if (!AbstractC5504s.c(entry.getKey(), productId)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        setState$purchases_defaultsBc8Release(PurchasesState.copy$default(state$purchases_defaultsBc8Release, null, linkedHashMap, null, false, false, 29, null));
        return purchaseCallback;
    }

    public final Pair<Function2, Function2> getPurchaseCompletedCallbacks() {
        return new Pair<>(new PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1(this), new PurchasesOrchestrator$getPurchaseCompletedCallbacks$onError$1(this));
    }

    private final BillingAbstract.PurchasesUpdatedListener getPurchasesUpdatedListener() {
        return new BillingAbstract.PurchasesUpdatedListener() { // from class: com.revenuecat.purchases.PurchasesOrchestrator.getPurchasesUpdatedListener.1
            C40521() {
            }

            @Override // com.revenuecat.purchases.common.BillingAbstract.PurchasesUpdatedListener
            public void onPurchasesFailedToUpdate(PurchasesError purchasesError) {
                L l10;
                AbstractC5504s.h(purchasesError, "purchasesError");
                PurchasesOrchestrator purchasesOrchestrator = PurchasesOrchestrator.this;
                synchronized (purchasesOrchestrator) {
                    try {
                        ProductChangeCallback andClearProductChangeCallback = purchasesOrchestrator.getAndClearProductChangeCallback();
                        if (andClearProductChangeCallback != null) {
                            purchasesOrchestrator.dispatch(andClearProductChangeCallback, purchasesError);
                            l10 = L.f17438a;
                        } else {
                            l10 = null;
                        }
                        if (l10 == null) {
                            Iterator it = purchasesOrchestrator.getAndClearAllPurchaseCallbacks().iterator();
                            while (it.hasNext()) {
                                purchasesOrchestrator.dispatch((PurchaseCallback) it.next(), purchasesError);
                            }
                        }
                        L l11 = L.f17438a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.BillingAbstract.PurchasesUpdatedListener
            public void onPurchasesUpdated(List<StoreTransaction> v10) {
                /*
                    this = this;
                    java.lang.String r0 = "purchases"
                    kotlin.jvm.internal.AbstractC5504s.h(r11, r0)
                    com.revenuecat.purchases.PurchasesOrchestrator r1 = com.revenuecat.purchases.PurchasesOrchestrator.this
                    monitor-enter(r1)
                    r0 = 1
                    if (r11 == 0) goto L17
                    boolean r2 = r11.isEmpty()     // Catch: java.lang.Throwable -> L13
                    if (r2 == 0) goto L17
                L11:
                    r7 = r0
                    goto L55
                L13:
                    r0 = move-exception
                    r11 = r0
                    goto L99
                L17:
                    java.util.Iterator r2 = r11.iterator()     // Catch: java.lang.Throwable -> L13
                L1b:
                    boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L13
                    if (r3 == 0) goto L11
                    java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L13
                    com.revenuecat.purchases.models.StoreTransaction r3 = (com.revenuecat.purchases.models.StoreTransaction) r3     // Catch: java.lang.Throwable -> L13
                    java.util.List r3 = r3.getProductIds()     // Catch: java.lang.Throwable -> L13
                    if (r3 == 0) goto L34
                    boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> L13
                    if (r4 == 0) goto L34
                    goto L53
                L34:
                    java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L13
                L38:
                    boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L13
                    if (r4 == 0) goto L53
                    java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L13
                    java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L13
                    com.revenuecat.purchases.PurchasesState r5 = r1.getState$purchases_defaultsBc8Release()     // Catch: java.lang.Throwable -> L13
                    java.util.Map r5 = r5.getPurchaseCallbacksByProductId()     // Catch: java.lang.Throwable -> L13
                    boolean r4 = r5.containsKey(r4)     // Catch: java.lang.Throwable -> L13
                    if (r4 == 0) goto L38
                    goto L1b
                L53:
                    r0 = 0
                    goto L11
                L55:
                    com.revenuecat.purchases.PurchasesState r0 = r1.getState$purchases_defaultsBc8Release()     // Catch: java.lang.Throwable -> L13
                    com.revenuecat.purchases.interfaces.ProductChangeCallback r0 = r0.getDeprecatedProductChangeCallback()     // Catch: java.lang.Throwable -> L13
                    if (r0 == 0) goto L68
                    com.revenuecat.purchases.interfaces.ProductChangeCallback r0 = com.revenuecat.purchases.PurchasesOrchestrator.access$getAndClearProductChangeCallback(r1)     // Catch: java.lang.Throwable -> L13
                    android.util.Pair r0 = com.revenuecat.purchases.PurchasesOrchestrator.access$getProductChangeCompletedCallbacks(r1, r0)     // Catch: java.lang.Throwable -> L13
                    goto L6c
                L68:
                    android.util.Pair r0 = com.revenuecat.purchases.PurchasesOrchestrator.access$getPurchaseCompletedCallbacks(r1)     // Catch: java.lang.Throwable -> L13
                L6c:
                    Td.L r2 = Td.L.f17438a     // Catch: java.lang.Throwable -> L13
                    monitor-exit(r1)
                    com.revenuecat.purchases.PurchasesOrchestrator r1 = com.revenuecat.purchases.PurchasesOrchestrator.this
                    com.revenuecat.purchases.PostTransactionWithProductDetailsHelper r2 = com.revenuecat.purchases.PurchasesOrchestrator.access$getPostTransactionWithProductDetailsHelper$p(r1)
                    com.revenuecat.purchases.PurchasesOrchestrator r1 = com.revenuecat.purchases.PurchasesOrchestrator.this
                    boolean r4 = r1.getAllowSharingPlayStoreAccount()
                    com.revenuecat.purchases.PurchasesOrchestrator r1 = com.revenuecat.purchases.PurchasesOrchestrator.this
                    java.lang.String r5 = r1.getAppUserID()
                    com.revenuecat.purchases.PostReceiptInitiationSource r6 = com.revenuecat.purchases.PostReceiptInitiationSource.PURCHASE
                    java.lang.Object r1 = r0.first
                    r8 = r1
                    kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
                    java.lang.Object r0 = r0.second
                    r9 = r0
                    kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
                    r3 = r11
                    r2.postTransactions(r3, r4, r5, r6, r7, r8, r9)
                    com.revenuecat.purchases.PurchasesOrchestrator r11 = com.revenuecat.purchases.PurchasesOrchestrator.this
                    com.revenuecat.purchases.common.Delay r0 = com.revenuecat.purchases.common.Delay.NONE
                    com.revenuecat.purchases.PurchasesOrchestrator.access$flushEvents(r11, r0)
                    return
                L99:
                    monitor-exit(r1)
                    throw r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.PurchasesOrchestrator.C40521.onPurchasesUpdated(java.util.List):void");
            }
        };
    }

    public static /* synthetic */ void logIn$default(PurchasesOrchestrator purchasesOrchestrator, String str, LogInCallback logInCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            logInCallback = null;
        }
        purchasesOrchestrator.logIn(str, logInCallback);
    }

    public static /* synthetic */ void logOut$default(PurchasesOrchestrator purchasesOrchestrator, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            receiveCustomerInfoCallback = null;
        }
        purchasesOrchestrator.logOut(receiveCustomerInfoCallback);
    }

    private final void replaceOldPurchaseWithNewProduct(PurchasingData purchasingData, String oldProductId, ReplacementMode replacementMode, Activity activity, String appUserID, PresentedOfferingContext presentedOfferingContext, Boolean isPersonalizedPrice, PurchaseErrorCallback listener) {
        ProductType productType = purchasingData.getProductType();
        ProductType productType2 = ProductType.SUBS;
        if (productType != productType2) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PurchaseNotAllowedError, PurchaseStrings.UPGRADING_INVALID_TYPE);
            LogUtilsKt.errorLog(purchasesError);
            ProductChangeCallback andClearProductChangeCallback = getAndClearProductChangeCallback();
            if (andClearProductChangeCallback != null) {
                dispatch(andClearProductChangeCallback, purchasesError);
            }
            Iterator<T> it = getAndClearAllPurchaseCallbacks().iterator();
            while (it.hasNext()) {
                dispatch((PurchaseCallback) it.next(), purchasesError);
            }
            return;
        }
        N n10 = new N();
        n10.f52259a = oldProductId;
        if (Df.r.W(oldProductId, Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, false, 2, null)) {
            n10.f52259a = Df.r.e1(oldProductId, Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, null, 2, null);
            LogLevel logLevel = LogLevel.WARN;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.w("[Purchases] - " + logLevel.name(), "Using incorrect oldProductId: " + oldProductId + ". The productId should not contain the basePlanId. Using productId: " + ((String) n10.f52259a) + com.amazon.a.a.o.c.a.b.f34706a);
            }
        }
        this.billing.findPurchaseInPurchaseHistory(appUserID, productType2, (String) n10.f52259a, new C40593(activity, appUserID, purchasingData, replacementMode, presentedOfferingContext, isPersonalizedPrice, n10), new C40604(listener));
    }

    public final boolean shouldRefreshCustomerInfo(boolean firstTimeInForeground) {
        return !this.appConfig.getCustomEntitlementComputation() && (firstTimeInForeground || this.deviceCache.isCustomerInfoCacheStale$purchases_defaultsBc8Release(getAppUserID(), false));
    }

    private final void startProductChange(Activity activity, PurchasingData purchasingData, PresentedOfferingContext presentedOfferingContext, String oldProductId, GoogleReplacementMode googleReplacementMode, GalaxyReplacementMode galaxyReplacementMode, Boolean isPersonalizedPrice, PurchaseCallback purchaseCallback) {
        GoogleReplacementMode googleReplacementMode2;
        String currentAppUserID;
        L l10;
        Activity activity2;
        PurchasingData purchasingData2;
        Boolean bool;
        ReplacementMode replacementMode;
        PresentedOfferingContext presentedOfferingContext2;
        String productId;
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogHandler currentLogHandler2;
        String str3;
        String str4;
        List addOnProducts;
        trackPurchaseStarted(purchasingData.getProductId(), purchasingData.getProductType());
        PurchaseCallback purchaseCallbackCreateCallbackWithDiagnosticsIfNeeded = createCallbackWithDiagnosticsIfNeeded(purchaseCallback, purchasingData, this.dateProvider.getNow());
        if (purchasingData.getProductType() != ProductType.SUBS) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PurchaseNotAllowedError, PurchaseStrings.UPGRADING_INVALID_TYPE);
            LogUtilsKt.errorLog(purchasesError);
            dispatch(purchaseCallbackCreateCallbackWithDiagnosticsIfNeeded, purchasesError);
            return;
        }
        if ((purchasingData instanceof GooglePurchasingData.Subscription) && (addOnProducts = ((GooglePurchasingData.Subscription) purchasingData).getAddOnProducts()) != null && (!addOnProducts.isEmpty()) && getStore() != Store.PLAY_STORE) {
            PurchasesError purchasesError2 = new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, PurchaseStrings.PURCHASING_ADD_ONS_ONLY_SUPPORTED_ON_PLAY_STORE);
            LogUtilsKt.errorLog(purchasesError2);
            dispatch(purchaseCallbackCreateCallbackWithDiagnosticsIfNeeded, purchasesError2);
            return;
        }
        LogIntent logIntent = LogIntent.PURCHASE;
        PurchasesOrchestrator$startProductChange$$inlined$log$1 purchasesOrchestrator$startProductChange$$inlined$log$1 = new PurchasesOrchestrator$startProductChange$$inlined$log$1(logIntent, purchasingData, presentedOfferingContext, oldProductId, googleReplacementMode);
        int[] iArr = LogWrapperKt.WhenMappings.$EnumSwitchMapping$0;
        switch (iArr[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str3 = "[Purchases] - " + logLevel.name();
                    str4 = (String) purchasesOrchestrator$startProductChange$$inlined$log$1.invoke();
                    currentLogHandler2.d(str3, str4);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startProductChange$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$startProductChange$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$startProductChange$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str3 = "[Purchases] - " + logLevel4.name();
                    str4 = (String) purchasesOrchestrator$startProductChange$$inlined$log$1.invoke();
                    currentLogHandler2.d(str3, str4);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startProductChange$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$startProductChange$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str3 = "[Purchases] - " + logLevel6.name();
                    str4 = (String) purchasesOrchestrator$startProductChange$$inlined$log$1.invoke();
                    currentLogHandler2.d(str3, str4);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str3 = "[Purchases] - " + logLevel7.name();
                    str4 = (String) purchasesOrchestrator$startProductChange$$inlined$log$1.invoke();
                    currentLogHandler2.d(str3, str4);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$startProductChange$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$startProductChange$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startProductChange$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler8.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$startProductChange$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startProductChange$$inlined$log$1.invoke(), null);
                break;
        }
        synchronized (this) {
            try {
                if (!this.appConfig.getFinishTransactions()) {
                    LogIntent logIntent2 = LogIntent.WARNING;
                    PurchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1 purchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1 = new PurchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1(logIntent2);
                    switch (iArr[logIntent2.ordinal()]) {
                        case 1:
                            LogLevel logLevel11 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                                str = "[Purchases] - " + logLevel11.name();
                                str2 = (String) purchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1.invoke();
                                currentLogHandler.d(str, str2);
                            }
                            break;
                        case 2:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1.invoke(), null);
                            break;
                        case 3:
                            LogLevel logLevel12 = LogLevel.WARN;
                            LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                                currentLogHandler9.w("[Purchases] - " + logLevel12.name(), (String) purchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1.invoke());
                            }
                            break;
                        case 4:
                            LogLevel logLevel13 = LogLevel.INFO;
                            LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                                currentLogHandler10.i("[Purchases] - " + logLevel13.name(), (String) purchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1.invoke());
                            }
                            break;
                        case 5:
                            LogLevel logLevel14 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                                str = "[Purchases] - " + logLevel14.name();
                                str2 = (String) purchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1.invoke();
                                currentLogHandler.d(str, str2);
                            }
                            break;
                        case 6:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1.invoke(), null);
                            break;
                        case 7:
                            LogLevel logLevel15 = LogLevel.INFO;
                            LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                                currentLogHandler11.i("[Purchases] - " + logLevel15.name(), (String) purchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1.invoke());
                            }
                            break;
                        case 8:
                            LogLevel logLevel16 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                                str = "[Purchases] - " + logLevel16.name();
                                str2 = (String) purchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1.invoke();
                                currentLogHandler.d(str, str2);
                            }
                            break;
                        case 9:
                            LogLevel logLevel17 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                                str = "[Purchases] - " + logLevel17.name();
                                str2 = (String) purchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1.invoke();
                                currentLogHandler.d(str, str2);
                            }
                            break;
                        case 10:
                            LogLevel logLevel18 = LogLevel.WARN;
                            LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                                currentLogHandler12.w("[Purchases] - " + logLevel18.name(), (String) purchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1.invoke());
                            }
                            break;
                        case 11:
                            LogLevel logLevel19 = LogLevel.WARN;
                            LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                                currentLogHandler13.w("[Purchases] - " + logLevel19.name(), (String) purchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1.invoke());
                            }
                            break;
                        case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1.invoke(), null);
                            break;
                        case 13:
                            LogLevel logLevel20 = LogLevel.WARN;
                            LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                                currentLogHandler14.w("[Purchases] - " + logLevel20.name(), (String) purchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1.invoke());
                            }
                            break;
                        case 14:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1.invoke(), null);
                            break;
                    }
                }
                if (getState$purchases_defaultsBc8Release().getPurchaseCallbacksByProductId().containsKey(purchasingData.getProductId())) {
                    googleReplacementMode2 = googleReplacementMode;
                    currentAppUserID = null;
                } else {
                    googleReplacementMode2 = googleReplacementMode;
                    if (googleReplacementMode2 == GoogleReplacementMode.DEFERRED) {
                        if (Df.r.W(oldProductId, Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, false, 2, null)) {
                            LogLevel logLevel21 = LogLevel.WARN;
                            LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel21) <= 0) {
                                String str5 = "[Purchases] - " + logLevel21.name();
                                String str6 = String.format(PurchaseStrings.DEFERRED_PRODUCT_CHANGE_WITH_BASE_PLAN_ID, Arrays.copyOf(new Object[]{oldProductId}, 1));
                                AbstractC5504s.g(str6, "format(...)");
                                currentLogHandler15.w(str5, str6);
                            }
                        }
                        productId = Df.r.e1(oldProductId, Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, null, 2, null);
                    } else {
                        productId = purchasingData.getProductId();
                    }
                    setState$purchases_defaultsBc8Release(PurchasesState.copy$default(getState$purchases_defaultsBc8Release(), null, S.p(getState$purchases_defaultsBc8Release().getPurchaseCallbacksByProductId(), S.f(z.a(productId, purchaseCallbackCreateCallbackWithDiagnosticsIfNeeded))), null, false, false, 29, null));
                    currentAppUserID = this.identityManager.getCurrentAppUserID();
                }
                L l11 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (currentAppUserID != null) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[getStore().ordinal()];
            if (i10 == 1) {
                activity2 = activity;
                purchasingData2 = purchasingData;
                bool = isPersonalizedPrice;
                replacementMode = googleReplacementMode2;
                presentedOfferingContext2 = presentedOfferingContext;
            } else if (i10 != 2) {
                activity2 = activity;
                purchasingData2 = purchasingData;
                presentedOfferingContext2 = presentedOfferingContext;
                bool = isPersonalizedPrice;
                replacementMode = null;
            } else {
                activity2 = activity;
                purchasingData2 = purchasingData;
                presentedOfferingContext2 = presentedOfferingContext;
                replacementMode = galaxyReplacementMode;
                bool = isPersonalizedPrice;
            }
            replaceOldPurchaseWithNewProduct(purchasingData2, oldProductId, replacementMode, activity2, currentAppUserID, presentedOfferingContext2, bool, purchaseCallbackCreateCallbackWithDiagnosticsIfNeeded);
            l10 = L.f17438a;
        } else {
            l10 = null;
        }
        if (l10 == null) {
            PurchasesError purchasesError3 = new PurchasesError(PurchasesErrorCode.OperationAlreadyInProgressError, null, 2, null);
            LogUtilsKt.errorLog(purchasesError3);
            Iterator<T> it = getAndClearAllPurchaseCallbacks().iterator();
            while (it.hasNext()) {
                dispatch((PurchaseCallback) it.next(), purchasesError3);
            }
            L l12 = L.f17438a;
        }
    }

    private final void startPurchase(Activity activity, PurchasingData purchasingData, PresentedOfferingContext presentedOfferingContext, Boolean isPersonalizedPrice, PurchaseCallback listener) {
        String currentAppUserID;
        L l10;
        LogHandler currentLogHandler;
        String str;
        String str2;
        List addOnProducts;
        LogHandler currentLogHandler2;
        String str3;
        String str4;
        LogIntent logIntent = LogIntent.PURCHASE;
        PurchasesOrchestrator$startPurchase$$inlined$log$1 purchasesOrchestrator$startPurchase$$inlined$log$1 = new PurchasesOrchestrator$startPurchase$$inlined$log$1(logIntent, purchasingData, presentedOfferingContext);
        int[] iArr = LogWrapperKt.WhenMappings.$EnumSwitchMapping$0;
        switch (iArr[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str3 = "[Purchases] - " + logLevel.name();
                    str4 = (String) purchasesOrchestrator$startPurchase$$inlined$log$1.invoke();
                    currentLogHandler2.d(str3, str4);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startPurchase$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$startPurchase$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$startPurchase$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str3 = "[Purchases] - " + logLevel4.name();
                    str4 = (String) purchasesOrchestrator$startPurchase$$inlined$log$1.invoke();
                    currentLogHandler2.d(str3, str4);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startPurchase$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$startPurchase$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str3 = "[Purchases] - " + logLevel6.name();
                    str4 = (String) purchasesOrchestrator$startPurchase$$inlined$log$1.invoke();
                    currentLogHandler2.d(str3, str4);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str3 = "[Purchases] - " + logLevel7.name();
                    str4 = (String) purchasesOrchestrator$startPurchase$$inlined$log$1.invoke();
                    currentLogHandler2.d(str3, str4);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$startPurchase$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$startPurchase$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startPurchase$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler8.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$startPurchase$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startPurchase$$inlined$log$1.invoke(), null);
                break;
        }
        if ((purchasingData instanceof GooglePurchasingData.Subscription) && (addOnProducts = ((GooglePurchasingData.Subscription) purchasingData).getAddOnProducts()) != null && (!addOnProducts.isEmpty()) && getStore() != Store.PLAY_STORE) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, PurchaseStrings.PURCHASING_ADD_ONS_ONLY_SUPPORTED_ON_PLAY_STORE);
            LogUtilsKt.errorLog(purchasesError);
            dispatch(listener, purchasesError);
            return;
        }
        trackPurchaseStarted(purchasingData.getProductId(), purchasingData.getProductType());
        PurchaseCallback purchaseCallbackCreateCallbackWithDiagnosticsIfNeeded = createCallbackWithDiagnosticsIfNeeded(listener, purchasingData, this.dateProvider.getNow());
        synchronized (this) {
            try {
                if (!this.appConfig.getFinishTransactions()) {
                    LogIntent logIntent2 = LogIntent.WARNING;
                    PurchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1 purchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1 = new PurchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1(logIntent2);
                    switch (iArr[logIntent2.ordinal()]) {
                        case 1:
                            LogLevel logLevel11 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                                str = "[Purchases] - " + logLevel11.name();
                                str2 = (String) purchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1.invoke();
                                currentLogHandler.d(str, str2);
                            }
                            break;
                        case 2:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1.invoke(), null);
                            break;
                        case 3:
                            LogLevel logLevel12 = LogLevel.WARN;
                            LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                                currentLogHandler9.w("[Purchases] - " + logLevel12.name(), (String) purchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1.invoke());
                            }
                            break;
                        case 4:
                            LogLevel logLevel13 = LogLevel.INFO;
                            LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                                currentLogHandler10.i("[Purchases] - " + logLevel13.name(), (String) purchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1.invoke());
                            }
                            break;
                        case 5:
                            LogLevel logLevel14 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                                str = "[Purchases] - " + logLevel14.name();
                                str2 = (String) purchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1.invoke();
                                currentLogHandler.d(str, str2);
                            }
                            break;
                        case 6:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1.invoke(), null);
                            break;
                        case 7:
                            LogLevel logLevel15 = LogLevel.INFO;
                            LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                                currentLogHandler11.i("[Purchases] - " + logLevel15.name(), (String) purchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1.invoke());
                            }
                            break;
                        case 8:
                            LogLevel logLevel16 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                                str = "[Purchases] - " + logLevel16.name();
                                str2 = (String) purchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1.invoke();
                                currentLogHandler.d(str, str2);
                            }
                            break;
                        case 9:
                            LogLevel logLevel17 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                                str = "[Purchases] - " + logLevel17.name();
                                str2 = (String) purchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1.invoke();
                                currentLogHandler.d(str, str2);
                            }
                            break;
                        case 10:
                            LogLevel logLevel18 = LogLevel.WARN;
                            LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                                currentLogHandler12.w("[Purchases] - " + logLevel18.name(), (String) purchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1.invoke());
                            }
                            break;
                        case 11:
                            LogLevel logLevel19 = LogLevel.WARN;
                            LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                                currentLogHandler13.w("[Purchases] - " + logLevel19.name(), (String) purchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1.invoke());
                            }
                            break;
                        case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1.invoke(), null);
                            break;
                        case 13:
                            LogLevel logLevel20 = LogLevel.WARN;
                            LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                                currentLogHandler14.w("[Purchases] - " + logLevel20.name(), (String) purchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1.invoke());
                            }
                            break;
                        case 14:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1.invoke(), null);
                            break;
                    }
                }
                if (getState$purchases_defaultsBc8Release().getPurchaseCallbacksByProductId().containsKey(purchasingData.getProductId())) {
                    currentAppUserID = null;
                } else {
                    setState$purchases_defaultsBc8Release(PurchasesState.copy$default(getState$purchases_defaultsBc8Release(), null, S.p(getState$purchases_defaultsBc8Release().getPurchaseCallbacksByProductId(), S.f(z.a(purchasingData.getProductId(), purchaseCallbackCreateCallbackWithDiagnosticsIfNeeded))), null, false, false, 29, null));
                    currentAppUserID = this.identityManager.getCurrentAppUserID();
                }
                L l11 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (currentAppUserID != null) {
            this.billing.makePurchaseAsync(activity, currentAppUserID, purchasingData, null, presentedOfferingContext, isPersonalizedPrice);
            l10 = L.f17438a;
        } else {
            l10 = null;
        }
        if (l10 == null) {
            PurchasesError purchasesError2 = new PurchasesError(PurchasesErrorCode.OperationAlreadyInProgressError, null, 2, null);
            LogUtilsKt.errorLog(purchasesError2);
            dispatch(purchaseCallbackCreateCallbackWithDiagnosticsIfNeeded, purchasesError2);
        }
    }

    public static /* synthetic */ void syncPurchases$default(PurchasesOrchestrator purchasesOrchestrator, SyncPurchasesCallback syncPurchasesCallback, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            syncPurchasesCallback = null;
        }
        purchasesOrchestrator.syncPurchases(syncPurchasesCallback);
    }

    public final void synchronizeSubscriberAttributesIfNeeded() {
        if (this.appConfig.getUiPreviewMode()) {
            return;
        }
        SubscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers$default(this.subscriberAttributesManager, getAppUserID(), null, 2, null);
    }

    public final void trackGetProductsResult(Date startTime, Set<String> requestedProductIds, Set<String> notFoundProductIds, PurchasesError purchasesError) {
        PurchasesErrorCode code;
        if (this.diagnosticsTrackerIfEnabled == null) {
            return;
        }
        long jBetween = DurationExtensionsKt.between(Ef.a.f5961b, startTime, this.dateProvider.getNow());
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        Integer numValueOf = null;
        String message = purchasesError != null ? purchasesError.getMessage() : null;
        if (purchasesError != null && (code = purchasesError.getCode()) != null) {
            numValueOf = Integer.valueOf(code.getCode());
        }
        diagnosticsTracker.m235trackGetProductsResult9VgGkz4(requestedProductIds, notFoundProductIds, message, numValueOf, jBetween);
    }

    private final void trackGetProductsStarted(Set<String> requestedProductIds) {
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            diagnosticsTracker.trackGetProductsStarted(requestedProductIds);
        }
    }

    public final void trackPurchaseResultIfNeeded(PurchasingData purchasingData, PurchasesError purchasesError, Date startTime, VerificationResult verificationResult) {
        PurchasesErrorCode code;
        if (this.diagnosticsTrackerIfEnabled == null) {
            return;
        }
        this.diagnosticsTrackerIfEnabled.m240trackPurchaseResultmyKFqkg(purchasingData.getProductId(), purchasingData.getProductType(), (purchasesError == null || (code = purchasesError.getCode()) == null) ? null : Integer.valueOf(code.getCode()), purchasesError != null ? purchasesError.getMessage() : null, DurationExtensionsKt.between(Ef.a.f5961b, startTime, this.dateProvider.getNow()), verificationResult);
    }

    private final void trackPurchaseStarted(String productId, ProductType productType) {
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            diagnosticsTracker.trackPurchaseStarted(productId, productType);
        }
    }

    public final void updateAllCaches(String appUserID, ReceiveCustomerInfoCallback completion) {
        boolean appInBackground = getState$purchases_defaultsBc8Release().getAppInBackground();
        CustomerInfoHelper.retrieveCustomerInfo$default(this.customerInfoHelper, appUserID, CacheFetchPolicy.FETCH_CURRENT, appInBackground, getAllowSharingPlayStoreAccount(), false, completion, 16, null);
        OfferingsManager.fetchAndCacheOfferings$default(this.offeringsManager, appUserID, appInBackground, null, null, 12, null);
    }

    static /* synthetic */ void updateAllCaches$default(PurchasesOrchestrator purchasesOrchestrator, String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            receiveCustomerInfoCallback = null;
        }
        purchasesOrchestrator.updateAllCaches(str, receiveCustomerInfoCallback);
    }

    public final void close() {
        synchronized (this) {
            PurchasesState state$purchases_defaultsBc8Release = getState$purchases_defaultsBc8Release();
            Map map = Collections.EMPTY_MAP;
            AbstractC5504s.g(map, "emptyMap()");
            setState$purchases_defaultsBc8Release(PurchasesState.copy$default(state$purchases_defaultsBc8Release, null, map, null, false, false, 29, null));
            L l10 = L.f17438a;
        }
        this.backend.close();
        this.billing.close();
        setUpdatedCustomerInfoListener(null);
        dispatch(new C40422());
    }

    public final void collectDeviceIdentifiers() {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1 purchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1 = new PurchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.collectDeviceIdentifiers(getAppUserID(), this.application);
    }

    public final void createSupportTicket(String email, String str, Function1 onSuccess, Function1 onError) {
        AbstractC5504s.h(email, "email");
        AbstractC5504s.h(str, "description");
        AbstractC5504s.h(onSuccess, "onSuccess");
        AbstractC5504s.h(onError, "onError");
        this.backend.postCreateSupportTicket(this.identityManager.getCurrentAppUserID(), email, str, onSuccess, onError);
    }

    public final AdTracker getAdTracker() {
        return this.adTracker;
    }

    public final boolean getAllowSharingPlayStoreAccount() {
        Boolean allowSharingPlayStoreAccount;
        synchronized (this) {
            allowSharingPlayStoreAccount = getState$purchases_defaultsBc8Release().getAllowSharingPlayStoreAccount();
        }
        return allowSharingPlayStoreAccount != null ? allowSharingPlayStoreAccount.booleanValue() : this.identityManager.currentUserIsAnonymous();
    }

    public final void getAmazonLWAConsentStatus(GetAmazonLWAConsentStatusCallback callback) {
        AbstractC5504s.h(callback, "callback");
        this.billing.getAmazonLWAConsentStatus(new C40451(callback), new C40462(callback));
    }

    public final AppConfig getAppConfig() {
        return this.appConfig;
    }

    public final synchronized String getAppUserID() {
        return this.identityManager.getCurrentAppUserID();
    }

    public final String getCachedCurrentOfferingIdentifier() {
        return this.offeringsManager.getCachedCurrentOfferingIdentifier();
    }

    public final DownloadedFontFamily getCachedFontFamilyOrStartDownload(UiConfig.AppConfig.FontsConfig.FontInfo.Name fontInfo) {
        AbstractC5504s.h(fontInfo, "fontInfo");
        return this.fontLoader.getCachedFontFamilyOrStartDownload(fontInfo);
    }

    public final VirtualCurrencies getCachedVirtualCurrencies() {
        return this.virtualCurrencyManager.cachedVirtualCurrencies();
    }

    public final PurchasesConfiguration getCurrentConfiguration() {
        return this.initialConfiguration.getAppUserID() == null ? this.initialConfiguration : PurchasesConfiguration.copy$purchases_defaultsBc8Release$default(this.initialConfiguration, getAppUserID(), null, 2, null);
    }

    public final void getCustomerCenterConfig(GetCustomerCenterConfigCallback callback) {
        AbstractC5504s.h(callback, "callback");
        this.backend.getCustomerCenterConfig(this.identityManager.getCurrentAppUserID(), new C40471(callback), new C40482(callback));
    }

    public final synchronized CustomerCenterListener getCustomerCenterListener() {
        return this.customerCenterListener;
    }

    public final synchronized DebugEventListener getDebugEventListener() {
        return this.eventsManager.getDebugEventListener();
    }

    public final FileRepository getFileRepository() {
        return this.fileRepository;
    }

    public final synchronized boolean getFinishTransactions() {
        return this.appConfig.getFinishTransactions();
    }

    public final void getOfferings(ReceiveOfferingsCallback listener, boolean fetchCurrent) {
        AbstractC5504s.h(listener, "listener");
        this.offeringsManager.getOfferings(this.identityManager.getCurrentAppUserID(), getState$purchases_defaultsBc8Release().getAppInBackground(), new C40491(listener), new C40502(listener), fetchCurrent);
    }

    public final OfflineEntitlementsManager getOfflineEntitlementsManager() {
        return this.offlineEntitlementsManager;
    }

    /* JADX INFO: renamed from: getPreferredUILocaleOverride, reason: from getter */
    public final String get_preferredUILocaleOverride() {
        return this._preferredUILocaleOverride;
    }

    public final InterfaceC5082a getProcessLifecycleOwnerProvider() {
        return this.processLifecycleOwnerProvider;
    }

    public final void getProducts(List<String> productIds, ProductType type, GetStoreProductsCallback callback) {
        Set<? extends ProductType> setH;
        AbstractC5504s.h(productIds, "productIds");
        AbstractC5504s.h(callback, "callback");
        if (type == null || (setH = a0.c(type)) == null) {
            setH = a0.h(ProductType.SUBS, ProductType.INAPP);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : productIds) {
            if (!Df.r.W((String) obj, Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, false, 2, null)) {
                arrayList.add(obj);
            }
        }
        Set setF1 = AbstractC2279u.f1(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(productIds, 10));
        for (String str : productIds) {
            if (Df.r.W(str, Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, false, 2, null)) {
                String strE1 = Df.r.e1(str, Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, null, 2, null);
                String strW0 = Df.r.W0(str, Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, null, 2, null);
                if (!setF1.contains(strE1)) {
                    Object linkedHashSet = linkedHashMap.get(strE1);
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet();
                        linkedHashMap.put(strE1, linkedHashSet);
                    }
                    ((Set) linkedHashSet).add(strW0);
                }
                str = strE1;
            }
            arrayList2.add(str);
        }
        getProductsOfTypes(AbstractC2279u.f1(arrayList2), setH, new GetStoreProductsCallback() { // from class: com.revenuecat.purchases.PurchasesOrchestrator.getProducts.1
            final /* synthetic */ GetStoreProductsCallback $callback;
            final /* synthetic */ Map<String, Set<String>> $requestedBasePlansByProductId;

            C40511(Map<String, Set<String>> linkedHashMap2, GetStoreProductsCallback callback2) {
                map = linkedHashMap2;
                getStoreProductsCallback = callback2;
            }

            @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
            public void onError(PurchasesError purchasesError) {
                AbstractC5504s.h(purchasesError, "error");
                getStoreProductsCallback.onError(purchasesError);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
            public void onReceived(List<? extends StoreProduct> storeProducts) {
                boolean zE0;
                AbstractC5504s.h(storeProducts, "storeProducts");
                if (!map.isEmpty()) {
                    Map<String, Set<String>> map = map;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : storeProducts) {
                        StoreProduct storeProduct = (StoreProduct) obj2;
                        Set<String> set = map.get(storeProduct.getPurchasingData().getProductId());
                        if (set != null) {
                            Set<String> set2 = set;
                            GoogleStoreProduct googleStoreProduct = storeProduct instanceof GoogleStoreProduct ? (GoogleStoreProduct) storeProduct : null;
                            zE0 = AbstractC2279u.e0(set2, googleStoreProduct != null ? googleStoreProduct.getBasePlanId() : null);
                        } else {
                            zE0 = true;
                        }
                        if (zE0) {
                            arrayList3.add(obj2);
                        }
                    }
                    storeProducts = arrayList3;
                }
                getStoreProductsCallback.onReceived(storeProducts);
            }
        });
    }

    public final void getProductsOfTypes(Set<String> productIds, Set<? extends ProductType> types, GetStoreProductsCallback callback) {
        AbstractC5504s.h(productIds, "productIds");
        AbstractC5504s.h(types, "types");
        AbstractC5504s.h(callback, "callback");
        ArrayList arrayList = new ArrayList();
        for (Object obj : types) {
            if (((ProductType) obj) != ProductType.UNKNOWN) {
                arrayList.add(obj);
            }
        }
        getProductsOfTypes$default(this, productIds, AbstractC2279u.f1(arrayList), AbstractC2279u.m(), null, callback, 8, null);
    }

    public final PurchasesState getState$purchases_defaultsBc8Release() {
        return this.purchasesStateCache.getPurchasesState();
    }

    public final Store getStore() {
        return this.appConfig.getStore();
    }

    public final String getStorefrontCountryCode() {
        return this.storefrontCountryCode;
    }

    public final Locale getStorefrontLocale() {
        String str = this.storefrontCountryCode;
        if (str != null) {
            return new Locale.Builder().setRegion(str).build();
        }
        return null;
    }

    public final synchronized TrackedEventListener getTrackedEventListener() {
        return this.trackedEventListener;
    }

    public final synchronized UpdatedCustomerInfoListener getUpdatedCustomerInfoListener() {
        return this.customerInfoUpdateHandler.getUpdatedCustomerInfoListener();
    }

    public final void getVirtualCurrencies(GetVirtualCurrenciesCallback callback) {
        AbstractC5504s.h(callback, "callback");
        this.virtualCurrencyManager.virtualCurrencies(callback);
    }

    public final void invalidateCustomerInfoCache() {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1 purchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1 = new PurchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1.invoke(), null);
                break;
        }
        this.deviceCache.clearCustomerInfoCache$purchases_defaultsBc8Release(getAppUserID());
    }

    public final void invalidateVirtualCurrenciesCache() {
        this.virtualCurrencyManager.invalidateVirtualCurrenciesCache();
    }

    public final boolean isAnonymous() {
        return this.identityManager.currentUserIsAnonymous();
    }

    public final void logIn(String newAppUserID, LogInCallback callback) {
        AbstractC5504s.h(newAppUserID, "newAppUserID");
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        L l10 = null;
        if (AbstractC5504s.c(currentAppUserID, newAppUserID)) {
            currentAppUserID = null;
        }
        if (currentAppUserID != null) {
            this.blockstoreHelper.clearUserIdBackupIfNeeded(new PurchasesOrchestrator$logIn$2$1(this, newAppUserID, callback));
            l10 = L.f17438a;
        }
        if (l10 == null) {
            CustomerInfoHelper.retrieveCustomerInfo$default(this.customerInfoHelper, this.identityManager.getCurrentAppUserID(), CacheFetchPolicy.INSTANCE.m113default(), getState$purchases_defaultsBc8Release().getAppInBackground(), getAllowSharingPlayStoreAccount(), false, ListenerConversionsCommonKt.receiveCustomerInfoCallback(new C40543(callback), new AnonymousClass4(callback)), 16, null);
        }
    }

    public final void logOut(ReceiveCustomerInfoCallback callback) {
        this.identityManager.logOut(new C40551(callback, this));
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC5504s.h(activity, "activity");
        flushEvents(Delay.NONE);
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        AbstractC5504s.h(activity, "activity");
        if (this.appConfig.getShowInAppMessagesAutomatically()) {
            showInAppMessagesIfNeeded(activity, AbstractC2273n.V0(InAppMessageType.values()));
        }
    }

    @Override // com.revenuecat.purchases.LifecycleDelegate
    public void onAppBackgrounded() {
        LogHandler currentLogHandler;
        String str;
        String str2;
        synchronized (this) {
            setState$purchases_defaultsBc8Release(PurchasesState.copy$default(getState$purchases_defaultsBc8Release(), null, null, null, true, false, 23, null));
            L l10 = L.f17438a;
        }
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$onAppBackgrounded$$inlined$log$1 purchasesOrchestrator$onAppBackgrounded$$inlined$log$1 = new PurchasesOrchestrator$onAppBackgrounded$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$onAppBackgrounded$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$onAppBackgrounded$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$onAppBackgrounded$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$onAppBackgrounded$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$onAppBackgrounded$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$onAppBackgrounded$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$onAppBackgrounded$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$onAppBackgrounded$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$onAppBackgrounded$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$onAppBackgrounded$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$onAppBackgrounded$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$onAppBackgrounded$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$onAppBackgrounded$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$onAppBackgrounded$$inlined$log$1.invoke(), null);
                break;
        }
        DebugEventListener debugEventListener = getDebugEventListener();
        if (debugEventListener != null) {
            debugEventListener.onDebugEventReceived(new DebugEvent(DebugEventName.APP_BACKGROUNDED, null, 2, null));
        }
        this.appConfig.setAppBackgrounded(true);
        if (this.appConfig.getUiPreviewMode()) {
            return;
        }
        synchronizeSubscriberAttributesIfNeeded();
        flushEvents(Delay.NONE);
    }

    @Override // com.revenuecat.purchases.LifecycleDelegate
    public void onAppForegrounded() {
        LogHandler currentLogHandler;
        String str;
        String str2;
        J j10 = new J();
        synchronized (this) {
            j10.f52255a = getState$purchases_defaultsBc8Release().getFirstTimeInForeground();
            setState$purchases_defaultsBc8Release(PurchasesState.copy$default(getState$purchases_defaultsBc8Release(), null, null, null, false, false, 7, null));
            L l10 = L.f17438a;
        }
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$onAppForegrounded$$inlined$log$1 purchasesOrchestrator$onAppForegrounded$$inlined$log$1 = new PurchasesOrchestrator$onAppForegrounded$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$onAppForegrounded$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$onAppForegrounded$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$onAppForegrounded$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$onAppForegrounded$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$onAppForegrounded$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$onAppForegrounded$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$onAppForegrounded$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$onAppForegrounded$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$onAppForegrounded$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$onAppForegrounded$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$onAppForegrounded$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$onAppForegrounded$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$onAppForegrounded$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$onAppForegrounded$$inlined$log$1.invoke(), null);
                break;
        }
        this.appConfig.setAppBackgrounded(false);
        enqueue(new C40563(j10));
    }

    public final boolean overridePreferredUILocale(String localeString) {
        if (AbstractC5504s.c(this._preferredUILocaleOverride, localeString)) {
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) > 0) {
                return false;
            }
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "Locale unchanged, no fresh fetch needed");
            return false;
        }
        synchronized (this) {
            this._preferredUILocaleOverride = localeString;
            this.localeProvider.setPreferredLocaleOverride(localeString);
            L l10 = L.f17438a;
        }
        LogLevel logLevel2 = LogLevel.DEBUG;
        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
            currentLogHandler2.d("[Purchases] - " + logLevel2.name(), "Locale changed, attempting to fetch fresh offerings");
        }
        return clearInMemoryCacheAndFetchOfferingsWithRateLimit(C40574.INSTANCE);
    }

    public final void purchase(PurchaseParams purchaseParams, PurchaseCallback callback) {
        L l10;
        AbstractC5504s.h(purchaseParams, "purchaseParams");
        AbstractC5504s.h(callback, "callback");
        Result<L, PurchasesError> resultValidate = this.purchaseParamsValidator.validate(purchaseParams);
        if (resultValidate instanceof Result.Error) {
            dispatch(new C40581(callback, resultValidate));
            return;
        }
        String oldProductId = purchaseParams.getOldProductId();
        if (oldProductId != null) {
            startProductChange(purchaseParams.getActivity(), purchaseParams.getPurchasingData(), purchaseParams.getPresentedOfferingContext(), oldProductId, purchaseParams.getGoogleReplacementMode(), purchaseParams.getGalaxyReplacementMode(), purchaseParams.getIsPersonalizedPrice(), callback);
            l10 = L.f17438a;
        } else {
            l10 = null;
        }
        if (l10 == null) {
            startPurchase(purchaseParams.getActivity(), purchaseParams.getPurchasingData(), purchaseParams.getPresentedOfferingContext(), purchaseParams.getIsPersonalizedPrice(), callback);
        }
    }

    public final void redeemWebPurchase(WebPurchaseRedemption webPurchaseRedemption, RedeemWebPurchaseListener listener) {
        AbstractC5504s.h(webPurchaseRedemption, "webPurchaseRedemption");
        AbstractC5504s.h(listener, "listener");
        this.webPurchaseRedemptionHelper.handleRedeemWebPurchase(webPurchaseRedemption, listener);
    }

    public final void removeUpdatedCustomerInfoListener() {
        setUpdatedCustomerInfoListener(null);
    }

    public final void restorePurchases(final ReceiveCustomerInfoCallback callback) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        AbstractC5504s.h(callback, "callback");
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$restorePurchases$$inlined$log$1 purchasesOrchestrator$restorePurchases$$inlined$log$1 = new PurchasesOrchestrator$restorePurchases$$inlined$log$1(logIntent);
        int[] iArr = LogWrapperKt.WhenMappings.$EnumSwitchMapping$0;
        switch (iArr[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$restorePurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$restorePurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$restorePurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$restorePurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$$inlined$log$1.invoke(), null);
                break;
        }
        if (!getAllowSharingPlayStoreAccount()) {
            LogIntent logIntent2 = LogIntent.WARNING;
            PurchasesOrchestrator$restorePurchases$$inlined$log$2 purchasesOrchestrator$restorePurchases$$inlined$log$2 = new PurchasesOrchestrator$restorePurchases$$inlined$log$2(logIntent2);
            switch (iArr[logIntent2.ordinal()]) {
                case 1:
                    LogLevel logLevel11 = LogLevel.DEBUG;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        currentLogHandler8.d("[Purchases] - " + logLevel11.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$2.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel12 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler9.w("[Purchases] - " + logLevel12.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$2.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel13 = LogLevel.INFO;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler10.i("[Purchases] - " + logLevel13.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$2.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel14 = LogLevel.DEBUG;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        currentLogHandler11.d("[Purchases] - " + logLevel14.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$2.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel15 = LogLevel.INFO;
                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler12.i("[Purchases] - " + logLevel15.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$2.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel16 = LogLevel.DEBUG;
                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        currentLogHandler13.d("[Purchases] - " + logLevel16.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$2.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel17 = LogLevel.DEBUG;
                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        currentLogHandler14.d("[Purchases] - " + logLevel17.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$2.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel18 = LogLevel.WARN;
                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$2.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel19 = LogLevel.WARN;
                    LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$2.invoke());
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel20 = LogLevel.WARN;
                    LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$2.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$$inlined$log$2.invoke(), null);
                    break;
            }
        }
        if (this.appConfig.getApiKeyValidationResult() != APIKeyValidator.ValidationResult.SIMULATED_STORE) {
            final Date now = this.dateProvider.getNow();
            DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
            if (diagnosticsTracker != null) {
                diagnosticsTracker.trackRestorePurchasesStarted();
                L l10 = L.f17438a;
            }
            String currentAppUserID = this.identityManager.getCurrentAppUserID();
            if (this.diagnosticsTrackerIfEnabled != null) {
                callback = new ReceiveCustomerInfoCallback() { // from class: com.revenuecat.purchases.PurchasesOrchestrator$restorePurchases$callbackWithTracking$1
                    @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
                    public void onError(PurchasesError error) {
                        AbstractC5504s.h(error, "error");
                        this.this$0.diagnosticsTrackerIfEnabled.m241trackRestorePurchasesResultSxA4cEA(Integer.valueOf(error.getCode().getCode()), error.getMessage(), DurationExtensionsKt.between(Ef.a.f5961b, now, this.this$0.dateProvider.getNow()));
                        callback.onError(error);
                    }

                    @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
                    public void onReceived(CustomerInfo customerInfo) {
                        AbstractC5504s.h(customerInfo, "customerInfo");
                        this.this$0.diagnosticsTrackerIfEnabled.m241trackRestorePurchasesResultSxA4cEA(null, null, DurationExtensionsKt.between(Ef.a.f5961b, now, this.this$0.dateProvider.getNow()));
                        callback.onReceived(customerInfo);
                    }
                };
            }
            this.blockstoreHelper.aliasCurrentAndStoredUserIdsIfNeeded(new C40614(currentAppUserID, callback));
            return;
        }
        PurchasesOrchestrator$restorePurchases$$inlined$log$3 purchasesOrchestrator$restorePurchases$$inlined$log$3 = new PurchasesOrchestrator$restorePurchases$$inlined$log$3(logIntent);
        switch (iArr[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel21 = LogLevel.DEBUG;
                LogHandler currentLogHandler18 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel21) <= 0) {
                    currentLogHandler18.d("[Purchases] - " + logLevel21.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$3.invoke());
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$$inlined$log$3.invoke(), null);
                break;
            case 3:
                LogLevel logLevel22 = LogLevel.WARN;
                LogHandler currentLogHandler19 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel22) <= 0) {
                    currentLogHandler19.w("[Purchases] - " + logLevel22.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$3.invoke());
                }
                break;
            case 4:
                LogLevel logLevel23 = LogLevel.INFO;
                LogHandler currentLogHandler20 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel23) <= 0) {
                    currentLogHandler20.i("[Purchases] - " + logLevel23.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$3.invoke());
                }
                break;
            case 5:
                LogLevel logLevel24 = LogLevel.DEBUG;
                LogHandler currentLogHandler21 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel24) <= 0) {
                    currentLogHandler21.d("[Purchases] - " + logLevel24.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$3.invoke());
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$$inlined$log$3.invoke(), null);
                break;
            case 7:
                LogLevel logLevel25 = LogLevel.INFO;
                LogHandler currentLogHandler22 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel25) <= 0) {
                    currentLogHandler22.i("[Purchases] - " + logLevel25.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$3.invoke());
                }
                break;
            case 8:
                LogLevel logLevel26 = LogLevel.DEBUG;
                LogHandler currentLogHandler23 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel26) <= 0) {
                    currentLogHandler23.d("[Purchases] - " + logLevel26.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$3.invoke());
                }
                break;
            case 9:
                LogLevel logLevel27 = LogLevel.DEBUG;
                LogHandler currentLogHandler24 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel27) <= 0) {
                    currentLogHandler24.d("[Purchases] - " + logLevel27.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$3.invoke());
                }
                break;
            case 10:
                LogLevel logLevel28 = LogLevel.WARN;
                LogHandler currentLogHandler25 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel28) <= 0) {
                    currentLogHandler25.w("[Purchases] - " + logLevel28.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$3.invoke());
                }
                break;
            case 11:
                LogLevel logLevel29 = LogLevel.WARN;
                LogHandler currentLogHandler26 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel29) <= 0) {
                    currentLogHandler26.w("[Purchases] - " + logLevel29.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$3.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$$inlined$log$3.invoke(), null);
                break;
            case 13:
                LogLevel logLevel30 = LogLevel.WARN;
                LogHandler currentLogHandler27 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel30) <= 0) {
                    currentLogHandler27.w("[Purchases] - " + logLevel30.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$3.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$$inlined$log$3.invoke(), null);
                break;
        }
        getCustomerInfo(callback);
    }

    public final void setAd(String ad2) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setAd$$inlined$log$1 purchasesOrchestrator$setAd$$inlined$log$1 = new PurchasesOrchestrator$setAd$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setAd$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAd$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setAd$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setAd$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setAd$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAd$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setAd$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setAd$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setAd$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setAd$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setAd$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAd$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setAd$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAd$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Ad.INSTANCE, ad2, getAppUserID());
    }

    public final void setAdGroup(String adGroup) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setAdGroup$$inlined$log$1 purchasesOrchestrator$setAdGroup$$inlined$log$1 = new PurchasesOrchestrator$setAdGroup$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setAdGroup$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAdGroup$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setAdGroup$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setAdGroup$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setAdGroup$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAdGroup$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setAdGroup$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setAdGroup$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setAdGroup$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setAdGroup$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setAdGroup$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAdGroup$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setAdGroup$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAdGroup$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.AdGroup.INSTANCE, adGroup, getAppUserID());
    }

    public final void setAdjustID(String adjustID) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setAdjustID$$inlined$log$1 purchasesOrchestrator$setAdjustID$$inlined$log$1 = new PurchasesOrchestrator$setAdjustID$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setAdjustID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAdjustID$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setAdjustID$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setAdjustID$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setAdjustID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAdjustID$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setAdjustID$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setAdjustID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setAdjustID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setAdjustID$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setAdjustID$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAdjustID$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setAdjustID$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAdjustID$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Adjust.INSTANCE, adjustID, getAppUserID(), this.application);
    }

    public final void setAirbridgeDeviceID(String airbridgeDeviceID) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1 purchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1 = new PurchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Airbridge.INSTANCE, airbridgeDeviceID, getAppUserID(), this.application);
    }

    public final void setAirshipChannelID(String airshipChannelID) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setAirshipChannelID$$inlined$log$1 purchasesOrchestrator$setAirshipChannelID$$inlined$log$1 = new PurchasesOrchestrator$setAirshipChannelID$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setAirshipChannelID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAirshipChannelID$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setAirshipChannelID$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setAirshipChannelID$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setAirshipChannelID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAirshipChannelID$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setAirshipChannelID$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setAirshipChannelID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setAirshipChannelID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setAirshipChannelID$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setAirshipChannelID$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAirshipChannelID$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setAirshipChannelID$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAirshipChannelID$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.Airship.INSTANCE, airshipChannelID, getAppUserID());
    }

    public final synchronized void setAllowSharingPlayStoreAccount(boolean z10) {
        setState$purchases_defaultsBc8Release(PurchasesState.copy$default(getState$purchases_defaultsBc8Release(), Boolean.valueOf(z10), null, null, false, false, 30, null));
    }

    public final void setAppConfig(AppConfig appConfig) {
        AbstractC5504s.h(appConfig, "<set-?>");
        this.appConfig = appConfig;
    }

    public final void setAppsFlyerConversionData(Map<?, ?> data) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1 purchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1 = new PurchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAppsFlyerConversionData(getAppUserID(), data);
    }

    public final void setAppsflyerID(String appsflyerID) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setAppsflyerID$$inlined$log$1 purchasesOrchestrator$setAppsflyerID$$inlined$log$1 = new PurchasesOrchestrator$setAppsflyerID$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setAppsflyerID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAppsflyerID$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setAppsflyerID$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setAppsflyerID$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setAppsflyerID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAppsflyerID$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setAppsflyerID$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setAppsflyerID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setAppsflyerID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setAppsflyerID$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setAppsflyerID$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAppsflyerID$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setAppsflyerID$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAppsflyerID$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.AppsFlyer.INSTANCE, appsflyerID, getAppUserID(), this.application);
    }

    public final void setAppstackAttributionParams(Map<String, String> data, SyncAttributesAndOfferingsCallback callback) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        AbstractC5504s.h(data, "data");
        AbstractC5504s.h(callback, "callback");
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1 purchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1 = new PurchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAppstackAttributionParams(getAppUserID(), data, this.application);
        syncAttributesAndOfferingsIfNeeded(callback);
    }

    public final void setAttributes(Map<String, String> attributes) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        AbstractC5504s.h(attributes, "attributes");
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setAttributes$$inlined$log$1 purchasesOrchestrator$setAttributes$$inlined$log$1 = new PurchasesOrchestrator$setAttributes$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setAttributes$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAttributes$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setAttributes$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setAttributes$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setAttributes$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAttributes$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setAttributes$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setAttributes$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setAttributes$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setAttributes$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setAttributes$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAttributes$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setAttributes$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAttributes$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttributes(attributes, getAppUserID());
    }

    public final void setCampaign(String campaign) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setCampaign$$inlined$log$1 purchasesOrchestrator$setCampaign$$inlined$log$1 = new PurchasesOrchestrator$setCampaign$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setCampaign$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setCampaign$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setCampaign$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setCampaign$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setCampaign$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setCampaign$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setCampaign$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setCampaign$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setCampaign$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setCampaign$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setCampaign$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setCampaign$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setCampaign$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setCampaign$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Campaign.INSTANCE, campaign, getAppUserID());
    }

    public final void setCleverTapID(String cleverTapID) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setCleverTapID$$inlined$log$1 purchasesOrchestrator$setCleverTapID$$inlined$log$1 = new PurchasesOrchestrator$setCleverTapID$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setCleverTapID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setCleverTapID$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setCleverTapID$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setCleverTapID$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setCleverTapID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setCleverTapID$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setCleverTapID$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setCleverTapID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setCleverTapID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setCleverTapID$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setCleverTapID$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setCleverTapID$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setCleverTapID$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setCleverTapID$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.CleverTap.INSTANCE, cleverTapID, getAppUserID(), this.application);
    }

    public final void setCreative(String creative) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setCreative$$inlined$log$1 purchasesOrchestrator$setCreative$$inlined$log$1 = new PurchasesOrchestrator$setCreative$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setCreative$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setCreative$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setCreative$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setCreative$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setCreative$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setCreative$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setCreative$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setCreative$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setCreative$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setCreative$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setCreative$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setCreative$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setCreative$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setCreative$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Creative.INSTANCE, creative, getAppUserID());
    }

    public final synchronized void setCustomerCenterListener(CustomerCenterListener customerCenterListener) {
        this.customerCenterListener = customerCenterListener;
    }

    public final synchronized void setDebugEventListener(DebugEventListener debugEventListener) {
        this.eventsManager.setDebugEventListener(debugEventListener);
    }

    public final void setDisplayName(String displayName) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setDisplayName$$inlined$log$1 purchasesOrchestrator$setDisplayName$$inlined$log$1 = new PurchasesOrchestrator$setDisplayName$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setDisplayName$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setDisplayName$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setDisplayName$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setDisplayName$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setDisplayName$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setDisplayName$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setDisplayName$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setDisplayName$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setDisplayName$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setDisplayName$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setDisplayName$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setDisplayName$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setDisplayName$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setDisplayName$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.DisplayName.INSTANCE, displayName, getAppUserID());
    }

    public final void setEmail(String email) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setEmail$$inlined$log$1 purchasesOrchestrator$setEmail$$inlined$log$1 = new PurchasesOrchestrator$setEmail$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setEmail$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setEmail$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setEmail$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setEmail$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setEmail$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setEmail$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setEmail$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setEmail$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setEmail$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setEmail$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setEmail$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setEmail$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setEmail$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setEmail$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.Email.INSTANCE, email, getAppUserID());
    }

    public final void setFBAnonymousID(String fbAnonymousID) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setFBAnonymousID$$inlined$log$1 purchasesOrchestrator$setFBAnonymousID$$inlined$log$1 = new PurchasesOrchestrator$setFBAnonymousID$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setFBAnonymousID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setFBAnonymousID$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setFBAnonymousID$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setFBAnonymousID$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setFBAnonymousID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setFBAnonymousID$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setFBAnonymousID$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setFBAnonymousID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setFBAnonymousID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setFBAnonymousID$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setFBAnonymousID$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setFBAnonymousID$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setFBAnonymousID$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setFBAnonymousID$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Facebook.INSTANCE, fbAnonymousID, getAppUserID(), this.application);
    }

    public final synchronized void setFinishTransactions(boolean z10) {
        this.appConfig.setFinishTransactions(z10);
    }

    public final void setFirebaseAppInstanceID(String firebaseAppInstanceID) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1 purchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1 = new PurchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.FirebaseAppInstanceId.INSTANCE, firebaseAppInstanceID, getAppUserID());
    }

    public final void setKeyword(String keyword) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setKeyword$$inlined$log$1 purchasesOrchestrator$setKeyword$$inlined$log$1 = new PurchasesOrchestrator$setKeyword$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setKeyword$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setKeyword$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setKeyword$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setKeyword$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setKeyword$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setKeyword$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setKeyword$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setKeyword$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setKeyword$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setKeyword$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setKeyword$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setKeyword$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setKeyword$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setKeyword$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Keyword.INSTANCE, keyword, getAppUserID());
    }

    public final void setKochavaDeviceID(String kochavaDeviceID) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setKochavaDeviceID$$inlined$log$1 purchasesOrchestrator$setKochavaDeviceID$$inlined$log$1 = new PurchasesOrchestrator$setKochavaDeviceID$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setKochavaDeviceID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setKochavaDeviceID$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setKochavaDeviceID$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setKochavaDeviceID$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setKochavaDeviceID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setKochavaDeviceID$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setKochavaDeviceID$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setKochavaDeviceID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setKochavaDeviceID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setKochavaDeviceID$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setKochavaDeviceID$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setKochavaDeviceID$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setKochavaDeviceID$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setKochavaDeviceID$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Kochava.INSTANCE, kochavaDeviceID, getAppUserID(), this.application);
    }

    public final void setMediaSource(String mediaSource) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setMediaSource$$inlined$log$1 purchasesOrchestrator$setMediaSource$$inlined$log$1 = new PurchasesOrchestrator$setMediaSource$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setMediaSource$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setMediaSource$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setMediaSource$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setMediaSource$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setMediaSource$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setMediaSource$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setMediaSource$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setMediaSource$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setMediaSource$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setMediaSource$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setMediaSource$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setMediaSource$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setMediaSource$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setMediaSource$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.MediaSource.INSTANCE, mediaSource, getAppUserID());
    }

    public final void setMixpanelDistinctID(String mixpanelDistinctID) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1 purchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1 = new PurchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.MixpanelDistinctId.INSTANCE, mixpanelDistinctID, getAppUserID());
    }

    public final void setMparticleID(String mparticleID) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setMparticleID$$inlined$log$1 purchasesOrchestrator$setMparticleID$$inlined$log$1 = new PurchasesOrchestrator$setMparticleID$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setMparticleID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setMparticleID$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setMparticleID$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setMparticleID$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setMparticleID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setMparticleID$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setMparticleID$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setMparticleID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setMparticleID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setMparticleID$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setMparticleID$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setMparticleID$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setMparticleID$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setMparticleID$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Mparticle.INSTANCE, mparticleID, getAppUserID(), this.application);
    }

    public final void setOnesignalID(String onesignalID) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setOnesignalID$$inlined$log$1 purchasesOrchestrator$setOnesignalID$$inlined$log$1 = new PurchasesOrchestrator$setOnesignalID$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setOnesignalID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setOnesignalID$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setOnesignalID$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setOnesignalID$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setOnesignalID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setOnesignalID$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setOnesignalID$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setOnesignalID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setOnesignalID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setOnesignalID$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setOnesignalID$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setOnesignalID$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setOnesignalID$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setOnesignalID$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.OneSignal.INSTANCE, onesignalID, getAppUserID());
    }

    public final void setOnesignalUserID(String onesignalUserID) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setOnesignalUserID$$inlined$log$1 purchasesOrchestrator$setOnesignalUserID$$inlined$log$1 = new PurchasesOrchestrator$setOnesignalUserID$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setOnesignalUserID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setOnesignalUserID$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setOnesignalUserID$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setOnesignalUserID$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setOnesignalUserID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setOnesignalUserID$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setOnesignalUserID$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setOnesignalUserID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setOnesignalUserID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setOnesignalUserID$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setOnesignalUserID$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setOnesignalUserID$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setOnesignalUserID$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setOnesignalUserID$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.OneSignalUserId.INSTANCE, onesignalUserID, getAppUserID());
    }

    public final void setPhoneNumber(String phoneNumber) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setPhoneNumber$$inlined$log$1 purchasesOrchestrator$setPhoneNumber$$inlined$log$1 = new PurchasesOrchestrator$setPhoneNumber$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setPhoneNumber$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setPhoneNumber$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setPhoneNumber$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setPhoneNumber$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setPhoneNumber$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setPhoneNumber$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setPhoneNumber$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setPhoneNumber$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setPhoneNumber$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setPhoneNumber$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setPhoneNumber$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setPhoneNumber$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setPhoneNumber$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setPhoneNumber$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.PhoneNumber.INSTANCE, phoneNumber, getAppUserID());
    }

    public final void setPostHogUserId(String postHogUserId) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setPostHogUserId$$inlined$log$1 purchasesOrchestrator$setPostHogUserId$$inlined$log$1 = new PurchasesOrchestrator$setPostHogUserId$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setPostHogUserId$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setPostHogUserId$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setPostHogUserId$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setPostHogUserId$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setPostHogUserId$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setPostHogUserId$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setPostHogUserId$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setPostHogUserId$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setPostHogUserId$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setPostHogUserId$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setPostHogUserId$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setPostHogUserId$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setPostHogUserId$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setPostHogUserId$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.PostHogUserId.INSTANCE, postHogUserId, getAppUserID());
    }

    public final void setPushToken(String fcmToken) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setPushToken$$inlined$log$1 purchasesOrchestrator$setPushToken$$inlined$log$1 = new PurchasesOrchestrator$setPushToken$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setPushToken$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setPushToken$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setPushToken$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setPushToken$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setPushToken$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setPushToken$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setPushToken$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setPushToken$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setPushToken$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setPushToken$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setPushToken$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setPushToken$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setPushToken$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setPushToken$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.FCMTokens.INSTANCE, fcmToken, getAppUserID());
    }

    public final void setSolarEngineAccountId(String solarEngineAccountId) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1 purchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1 = new PurchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.SolarEngineAccountId.INSTANCE, solarEngineAccountId, getAppUserID(), this.application);
    }

    public final void setSolarEngineDistinctId(String solarEngineDistinctId) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1 purchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1 = new PurchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.SolarEngineDistinctId.INSTANCE, solarEngineDistinctId, getAppUserID(), this.application);
    }

    public final void setSolarEngineVisitorId(String solarEngineVisitorId) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1 purchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1 = new PurchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.SolarEngineVisitorId.INSTANCE, solarEngineVisitorId, getAppUserID(), this.application);
    }

    public final void setState$purchases_defaultsBc8Release(PurchasesState value) {
        AbstractC5504s.h(value, "value");
        this.purchasesStateCache.setPurchasesState(value);
    }

    public final void setTenjinAnalyticsInstallationID(String tenjinAnalyticsInstallationID) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1 purchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1 = new PurchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.TenjinAnalyticsInstallationId.INSTANCE, tenjinAnalyticsInstallationID, getAppUserID());
    }

    public final synchronized void setTrackedEventListener(TrackedEventListener trackedEventListener) {
        this.trackedEventListener = trackedEventListener;
    }

    public final synchronized void setUpdatedCustomerInfoListener(UpdatedCustomerInfoListener updatedCustomerInfoListener) {
        this.customerInfoUpdateHandler.setUpdatedCustomerInfoListener(updatedCustomerInfoListener);
    }

    public final void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> inAppMessageTypes) {
        AbstractC5504s.h(activity, "activity");
        AbstractC5504s.h(inAppMessageTypes, "inAppMessageTypes");
        this.billing.showInAppMessagesIfNeeded(activity, inAppMessageTypes, new C40621());
    }

    public final void switchUser(String newAppUserID) {
        AbstractC5504s.h(newAppUserID, "newAppUserID");
        if (!AbstractC5504s.c(this.identityManager.getCurrentAppUserID(), newAppUserID)) {
            this.identityManager.switchUser(newAppUserID);
            OfferingsManager.fetchAndCacheOfferings$default(this.offeringsManager, newAppUserID, getState$purchases_defaultsBc8Release().getAppInBackground(), null, null, 12, null);
            return;
        }
        LogLevel logLevel = LogLevel.WARN;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            String str = "[Purchases] - " + logLevel.name();
            String str2 = String.format(IdentityStrings.SWITCHING_USER_SAME_APP_USER_ID, Arrays.copyOf(new Object[]{newAppUserID}, 1));
            AbstractC5504s.g(str2, "format(...)");
            currentLogHandler.w(str, str2);
        }
    }

    public final void syncAmazonPurchase(String productID, String receiptID, String amazonUserID, String isoCurrencyCode, Double d10, Long purchaseTime) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        AbstractC5504s.h(productID, "productID");
        AbstractC5504s.h(receiptID, "receiptID");
        AbstractC5504s.h(amazonUserID, "amazonUserID");
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$syncAmazonPurchase$$inlined$log$1 purchasesOrchestrator$syncAmazonPurchase$$inlined$log$1 = new PurchasesOrchestrator$syncAmazonPurchase$$inlined$log$1(logIntent, receiptID, amazonUserID);
        int[] iArr = LogWrapperKt.WhenMappings.$EnumSwitchMapping$0;
        switch (iArr[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$syncAmazonPurchase$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$syncAmazonPurchase$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$syncAmazonPurchase$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$syncAmazonPurchase$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$syncAmazonPurchase$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$syncAmazonPurchase$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$syncAmazonPurchase$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$syncAmazonPurchase$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$syncAmazonPurchase$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$syncAmazonPurchase$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$$inlined$log$1.invoke(), null);
                break;
        }
        Set<String> previouslySentHashedTokens$purchases_defaultsBc8Release = this.deviceCache.getPreviouslySentHashedTokens$purchases_defaultsBc8Release();
        if (!previouslySentHashedTokens$purchases_defaultsBc8Release.contains(UtilsKt.sha1(receiptID))) {
            previouslySentHashedTokens$purchases_defaultsBc8Release = null;
        }
        if (previouslySentHashedTokens$purchases_defaultsBc8Release == null) {
            this.billing.normalizePurchaseData(productID, receiptID, amazonUserID, new C40634(d10, isoCurrencyCode, purchaseTime, amazonUserID, this, receiptID, this.identityManager.getCurrentAppUserID()), new AnonymousClass5(receiptID, amazonUserID));
            return;
        }
        PurchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1 purchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1 = new PurchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1(logIntent, receiptID, amazonUserID);
        switch (iArr[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel11 = LogLevel.DEBUG;
                LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                    currentLogHandler8.d("[Purchases] - " + logLevel11.name(), (String) purchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1.invoke());
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel12 = LogLevel.WARN;
                LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                    currentLogHandler9.w("[Purchases] - " + logLevel12.name(), (String) purchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel13 = LogLevel.INFO;
                LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                    currentLogHandler10.i("[Purchases] - " + logLevel13.name(), (String) purchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel14 = LogLevel.DEBUG;
                LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                    currentLogHandler11.d("[Purchases] - " + logLevel14.name(), (String) purchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1.invoke());
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel15 = LogLevel.INFO;
                LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                    currentLogHandler12.i("[Purchases] - " + logLevel15.name(), (String) purchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel16 = LogLevel.DEBUG;
                LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                    currentLogHandler13.d("[Purchases] - " + logLevel16.name(), (String) purchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1.invoke());
                }
                break;
            case 9:
                LogLevel logLevel17 = LogLevel.DEBUG;
                LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                    currentLogHandler14.d("[Purchases] - " + logLevel17.name(), (String) purchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1.invoke());
                }
                break;
            case 10:
                LogLevel logLevel18 = LogLevel.WARN;
                LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                    currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) purchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel19 = LogLevel.WARN;
                LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                    currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) purchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel20 = LogLevel.WARN;
                LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                    currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) purchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1.invoke(), null);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.revenuecat.purchases.PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1, com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback] */
    public final void syncAttributesAndOfferingsIfNeeded(final SyncAttributesAndOfferingsCallback callback) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        AbstractC5504s.h(callback, "callback");
        ?? r02 = new ReceiveOfferingsCallback() { // from class: com.revenuecat.purchases.PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1
            @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
            public void onError(PurchasesError error) {
                AbstractC5504s.h(error, "error");
                callback.onError(error);
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
            public void onReceived(Offerings offerings) {
                AbstractC5504s.h(offerings, "offerings");
                callback.onSuccess(offerings);
            }
        };
        if (this.lastSyncAttributesAndOfferingsRateLimiter.shouldProceed()) {
            this.subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(getAppUserID(), new C40642(r02));
            return;
        }
        LogIntent logIntent = LogIntent.WARNING;
        PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1 purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1 = new PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1(logIntent, this);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1.invoke(), null);
                break;
        }
        getOfferings$default(this, r02, false, 2, null);
    }

    public final void syncPurchases(SyncPurchasesCallback listener) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        if (this.appConfig.getApiKeyValidationResult() != APIKeyValidator.ValidationResult.SIMULATED_STORE) {
            this.syncPurchasesHelper.syncPurchases(getAllowSharingPlayStoreAccount(), getState$purchases_defaultsBc8Release().getAppInBackground(), new C40663(listener), new C40674(listener));
            return;
        }
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$syncPurchases$$inlined$log$1 purchasesOrchestrator$syncPurchases$$inlined$log$1 = new PurchasesOrchestrator$syncPurchases$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$syncPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncPurchases$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$syncPurchases$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$syncPurchases$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$syncPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncPurchases$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$syncPurchases$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$syncPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$syncPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$syncPurchases$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$syncPurchases$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncPurchases$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$syncPurchases$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncPurchases$$inlined$log$1.invoke(), null);
                break;
        }
        getCustomerInfo(new ReceiveCustomerInfoCallback() { // from class: com.revenuecat.purchases.PurchasesOrchestrator.syncPurchases.2
            C40652() {
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onError(PurchasesError purchasesError) {
                AbstractC5504s.h(purchasesError, "error");
                SyncPurchasesCallback syncPurchasesCallback = syncPurchasesCallback;
                if (syncPurchasesCallback != null) {
                    syncPurchasesCallback.onError(purchasesError);
                }
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onReceived(CustomerInfo customerInfo) {
                AbstractC5504s.h(customerInfo, "customerInfo");
                SyncPurchasesCallback syncPurchasesCallback = syncPurchasesCallback;
                if (syncPurchasesCallback != null) {
                    syncPurchasesCallback.onSuccess(customerInfo);
                }
            }
        });
    }

    public final void track(FeatureEvent event) {
        AbstractC5504s.h(event, "event");
        if (event instanceof PaywallEvent) {
            this.paywallPresentedCache.receiveEvent((PaywallEvent) event);
        }
        this.eventsManager.track(event);
        TrackedEventListener trackedEventListener = this.trackedEventListener;
        if (trackedEventListener != null) {
            trackedEventListener.onEventTracked(event);
        }
    }

    public final void getCustomerInfo(CacheFetchPolicy fetchPolicy, boolean trackDiagnostics, ReceiveCustomerInfoCallback callback) {
        AbstractC5504s.h(fetchPolicy, "fetchPolicy");
        AbstractC5504s.h(callback, "callback");
        this.customerInfoHelper.retrieveCustomerInfo(this.identityManager.getCurrentAppUserID(), fetchPolicy, getState$purchases_defaultsBc8Release().getAppInBackground(), getAllowSharingPlayStoreAccount(), trackDiagnostics, callback);
    }

    public final void getStorefrontCountryCode(GetStorefrontCallback callback) {
        L l10;
        AbstractC5504s.h(callback, "callback");
        String str = this.storefrontCountryCode;
        if (str != null) {
            callback.onReceived(str);
            l10 = L.f17438a;
        } else {
            l10 = null;
        }
        if (l10 == null) {
            this.billing.getStorefront(new PurchasesOrchestrator$getStorefrontCountryCode$2$1(this, callback), new PurchasesOrchestrator$getStorefrontCountryCode$2$2(callback));
        }
    }

    public final void getStorefrontLocale(GetStorefrontLocaleCallback callback) {
        AbstractC5504s.h(callback, "callback");
        getStorefrontCountryCode(new GetStorefrontCallback() { // from class: com.revenuecat.purchases.PurchasesOrchestrator.getStorefrontLocale.1
            C40531() {
            }

            @Override // com.revenuecat.purchases.interfaces.GetStorefrontCallback
            public void onError(PurchasesError purchasesError) {
                AbstractC5504s.h(purchasesError, "error");
                getStorefrontLocaleCallback.onError(purchasesError);
            }

            @Override // com.revenuecat.purchases.interfaces.GetStorefrontCallback
            public void onReceived(String storefrontCountryCode) {
                AbstractC5504s.h(storefrontCountryCode, "storefrontCountryCode");
                GetStorefrontLocaleCallback getStorefrontLocaleCallback = getStorefrontLocaleCallback;
                Locale localeBuild = new Locale.Builder().setRegion(storefrontCountryCode).build();
                AbstractC5504s.g(localeBuild, "Builder().setRegion(storefrontCountryCode).build()");
                getStorefrontLocaleCallback.onReceived(localeBuild);
            }
        });
    }

    public final void dispatch(PurchaseErrorCallback purchaseErrorCallback, PurchasesError purchasesError) {
        dispatch(new C40441(purchaseErrorCallback, purchasesError));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void getProductsOfTypes(Set<String> productIds, Set<? extends ProductType> types, List<? extends StoreProduct> collectedStoreProducts, Date startTime, GetStoreProductsCallback callback) {
        Set<String> set;
        List<? extends StoreProduct> list;
        GetStoreProductsCallback getStoreProductsCallback;
        L l10;
        if (startTime == null) {
            trackGetProductsStarted(productIds);
            startTime = this.dateProvider.getNow();
        }
        Date date = startTime;
        Set setE1 = AbstractC2279u.e1(types);
        ProductType productType = (ProductType) AbstractC2279u.n0(setE1);
        if (productType != null) {
            setE1.remove(productType);
        } else {
            productType = null;
        }
        if (productType != null) {
            set = productIds;
            list = collectedStoreProducts;
            GetStoreProductsCallback getStoreProductsCallback2 = callback;
            this.billing.queryProductDetailsAsync(productType, set, new PurchasesOrchestrator$getProductsOfTypes$1$1(this, set, setE1, list, date, getStoreProductsCallback2), new PurchasesOrchestrator$getProductsOfTypes$1$2(this, date, set, getStoreProductsCallback2));
            l10 = L.f17438a;
            getStoreProductsCallback = getStoreProductsCallback2;
        } else {
            set = productIds;
            list = collectedStoreProducts;
            getStoreProductsCallback = callback;
            l10 = null;
        }
        if (l10 == null) {
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((StoreProduct) it.next()).getId());
            }
            trackGetProductsResult(date, set, a0.j(set, AbstractC2279u.f1(arrayList)), null);
            getStoreProductsCallback.onReceived(list);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ PurchasesOrchestrator(android.app.Application r38, java.lang.String r39, com.revenuecat.purchases.common.Backend r40, com.revenuecat.purchases.common.BillingAbstract r41, com.revenuecat.purchases.common.caching.DeviceCache r42, com.revenuecat.purchases.identity.IdentityManager r43, com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager r44, com.revenuecat.purchases.common.AppConfig r45, com.revenuecat.purchases.CustomerInfoHelper r46, com.revenuecat.purchases.CustomerInfoUpdateHandler r47, com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer r48, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker r49, com.revenuecat.purchases.common.DateProvider r50, com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager r51, com.revenuecat.purchases.PostReceiptHelper r52, com.revenuecat.purchases.PostTransactionWithProductDetailsHelper r53, com.revenuecat.purchases.PostPendingTransactionsHelper r54, com.revenuecat.purchases.SyncPurchasesHelper r55, com.revenuecat.purchases.common.offerings.OfferingsManager r56, com.revenuecat.purchases.common.events.EventsManager r57, com.revenuecat.purchases.common.events.EventsManager r58, com.revenuecat.purchases.paywalls.PaywallPresentedCache r59, com.revenuecat.purchases.PurchasesStateCache r60, android.os.Handler r61, com.revenuecat.purchases.common.Dispatcher r62, com.revenuecat.purchases.PurchasesConfiguration r63, com.revenuecat.purchases.paywalls.FontLoader r64, com.revenuecat.purchases.common.DefaultLocaleProvider r65, com.revenuecat.purchases.deeplinks.WebPurchaseRedemptionHelper r66, com.revenuecat.purchases.virtualcurrencies.VirtualCurrencyManager r67, com.revenuecat.purchases.utils.PurchaseParamsValidator r68, ie.InterfaceC5082a r69, com.revenuecat.purchases.blockstore.BlockstoreHelper r70, android.app.backup.BackupManager r71, com.revenuecat.purchases.storage.FileRepository r72, com.revenuecat.purchases.ads.events.AdTracker r73, int r74, int r75, kotlin.jvm.internal.DefaultConstructorMarker r76) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.PurchasesOrchestrator.<init>(android.app.Application, java.lang.String, com.revenuecat.purchases.common.Backend, com.revenuecat.purchases.common.BillingAbstract, com.revenuecat.purchases.common.caching.DeviceCache, com.revenuecat.purchases.identity.IdentityManager, com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager, com.revenuecat.purchases.common.AppConfig, com.revenuecat.purchases.CustomerInfoHelper, com.revenuecat.purchases.CustomerInfoUpdateHandler, com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker, com.revenuecat.purchases.common.DateProvider, com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager, com.revenuecat.purchases.PostReceiptHelper, com.revenuecat.purchases.PostTransactionWithProductDetailsHelper, com.revenuecat.purchases.PostPendingTransactionsHelper, com.revenuecat.purchases.SyncPurchasesHelper, com.revenuecat.purchases.common.offerings.OfferingsManager, com.revenuecat.purchases.common.events.EventsManager, com.revenuecat.purchases.common.events.EventsManager, com.revenuecat.purchases.paywalls.PaywallPresentedCache, com.revenuecat.purchases.PurchasesStateCache, android.os.Handler, com.revenuecat.purchases.common.Dispatcher, com.revenuecat.purchases.PurchasesConfiguration, com.revenuecat.purchases.paywalls.FontLoader, com.revenuecat.purchases.common.DefaultLocaleProvider, com.revenuecat.purchases.deeplinks.WebPurchaseRedemptionHelper, com.revenuecat.purchases.virtualcurrencies.VirtualCurrencyManager, com.revenuecat.purchases.utils.PurchaseParamsValidator, ie.a, com.revenuecat.purchases.blockstore.BlockstoreHelper, android.app.backup.BackupManager, com.revenuecat.purchases.storage.FileRepository, com.revenuecat.purchases.ads.events.AdTracker, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
