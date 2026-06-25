package com.revenuecat.purchases.hybridcommon;

import Td.InterfaceC2154e;
import Td.L;
import Td.r;
import Td.u;
import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import app.notifee.core.event.LogEvent;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.AmazonLWAConsentStatus;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.DangerousSettings;
import com.revenuecat.purchases.DebugEvent;
import com.revenuecat.purchases.DebugEventListener;
import com.revenuecat.purchases.EntitlementVerificationMode;
import com.revenuecat.purchases.ListenerConversionsCommonKt;
import com.revenuecat.purchases.ListenerConversionsKt;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchaseParams;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesAreCompletedBy;
import com.revenuecat.purchases.PurchasesConfiguration;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.PurchasesException;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.TrackedEventListener;
import com.revenuecat.purchases.WebPurchaseRedemption;
import com.revenuecat.purchases.ads.events.types.AdDisplayedData;
import com.revenuecat.purchases.ads.events.types.AdFailedToLoadData;
import com.revenuecat.purchases.ads.events.types.AdFormat;
import com.revenuecat.purchases.ads.events.types.AdLoadedData;
import com.revenuecat.purchases.ads.events.types.AdMediatorName;
import com.revenuecat.purchases.ads.events.types.AdOpenedData;
import com.revenuecat.purchases.ads.events.types.AdRevenueData;
import com.revenuecat.purchases.ads.events.types.AdRevenuePrecision;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.common.events.FeatureEvent;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.hybridcommon.PurchasableItem;
import com.revenuecat.purchases.hybridcommon.mappers.CustomerInfoMapperKt;
import com.revenuecat.purchases.hybridcommon.mappers.DebugEventMapperKt;
import com.revenuecat.purchases.hybridcommon.mappers.FeatureEventMapperKt;
import com.revenuecat.purchases.hybridcommon.mappers.LogHandlerWithMapping;
import com.revenuecat.purchases.hybridcommon.mappers.MappedProductCategory;
import com.revenuecat.purchases.hybridcommon.mappers.OfferingsMapperKt;
import com.revenuecat.purchases.hybridcommon.mappers.PurchasesErrorKt;
import com.revenuecat.purchases.hybridcommon.mappers.VirtualCurrenciesMapperKt;
import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;
import com.revenuecat.purchases.interfaces.Callback;
import com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener;
import com.revenuecat.purchases.interfaces.SyncAttributesAndOfferingsCallback;
import com.revenuecat.purchases.models.BillingFeature;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.GoogleStoreProduct;
import com.revenuecat.purchases.models.GoogleStoreProductKt;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import com.revenuecat.purchases.paywalls.events.CustomPaywallImpressionParams;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000þ\u0001\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\b\u001a)\u0010\u0012\u001a\u00020\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0018\u001a\u00020\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00142\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019\u001a5\u0010\u001d\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001e\u001a+\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0002¢\u0006\u0004\b!\u0010\"\u001aÑ\u0001\u0010-\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010#\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\t2\b\u0010%\u001a\u0004\u0018\u00010\t2\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010(\u001a\u0004\u0018\u00010\u00002\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u001e\b\u0002\u0010*\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0018\u00010\u00142\u001e\b\u0002\u0010+\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0018\u00010\u00142\u001e\b\u0002\u0010,\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0018\u00010\u0014H\u0007¢\u0006\u0004\b-\u0010.\u001a½\u0001\u00100\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010/\u001a\u00020\t2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\b\u0010%\u001a\u0004\u0018\u00010\t2\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010(\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u001e\b\u0002\u0010*\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0018\u00010\u00142\u001e\b\u0002\u0010+\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0018\u00010\u00142\u001e\b\u0002\u0010,\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0018\u00010\u0014H\u0007¢\u0006\u0004\b0\u00101\u001aÇ\u0001\u00103\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010#\u001a\u00020\t2\u0006\u00102\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010\t2\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010(\u001a\u0004\u0018\u00010\u00002\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u001e\b\u0002\u0010*\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0018\u00010\u00142\u001e\b\u0002\u0010+\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0018\u00010\u00142\u001e\b\u0002\u0010,\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0018\u00010\u0014H\u0007¢\u0006\u0004\b3\u00104\u001a\r\u00105\u001a\u00020\t¢\u0006\u0004\b5\u00106\u001a/\u00109\u001a\u00020\u00022 \u00108\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u000207¢\u0006\u0004\b9\u0010:\u001a\u0015\u0010;\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b;\u0010\b\u001a\u001d\u0010=\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b=\u0010>\u001a\u0015\u0010?\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b?\u0010\b\u001a\u0017\u0010A\u001a\u00020\u00022\u0006\u0010@\u001a\u00020\u0000H\u0007¢\u0006\u0004\bA\u0010\u0004\u001a\u0015\u0010C\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\t¢\u0006\u0004\bC\u0010D\u001a-\u0010E\u001a\u00020\u00022\u001e\u00108\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0004\u0012\u00020\u000207¢\u0006\u0004\bE\u0010:\u001a\u0015\u0010F\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\bF\u0010\b\u001a\u0017\u0010H\u001a\u00020\u00022\b\u0010G\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bH\u0010D\u001a\u000f\u0010I\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bI\u00106\u001a\u0015\u0010J\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\bJ\u0010\b\u001a\r\u0010K\u001a\u00020\u0002¢\u0006\u0004\bK\u0010L\u001a\u0015\u0010K\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\bK\u0010\b\u001a\r\u0010M\u001a\u00020\u0000¢\u0006\u0004\bM\u0010N\u001a\u0015\u0010P\u001a\u00020\u00022\u0006\u0010O\u001a\u00020\t¢\u0006\u0004\bP\u0010D\u001a3\u0010R\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\u000f0\u000f2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\t0\u0014¢\u0006\u0004\bR\u0010S\u001a\r\u0010T\u001a\u00020\u0002¢\u0006\u0004\bT\u0010L\u001a\u0017\u0010V\u001a\u00020\u00022\b\u0010U\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bV\u0010D\u001a1\u0010[\u001a\u00020\u00022\u0006\u0010X\u001a\u00020W2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020&0\u00142\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000Z¢\u0006\u0004\b[\u0010\\\u001a\u001b\u0010]\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000Z¢\u0006\u0004\b]\u0010^\u001a+\u0010a\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0010\b\u0002\u0010`\u001a\n\u0012\u0004\u0012\u00020_\u0018\u00010\u0014H\u0007¢\u0006\u0004\ba\u0010b\u001a\u0099\u0001\u0010p\u001a\u00020\u00022\u0006\u0010X\u001a\u00020W2\u0006\u0010c\u001a\u00020\t2\b\u0010<\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\t2\u0006\u0010e\u001a\u00020d2\b\b\u0002\u0010g\u001a\u00020f2\b\b\u0002\u0010i\u001a\u00020h2\n\b\u0002\u0010j\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010k\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010l\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010m\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010n\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010o\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\bp\u0010q\u001a/\u0010r\u001a\u00020\u00022 \u00108\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0012\u0004\u0012\u00020\u000207¢\u0006\u0004\br\u0010:\u001a/\u0010s\u001a\u00020\u00022 \u00108\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0012\u0004\u0012\u00020\u000207¢\u0006\u0004\bs\u0010:\u001a\r\u0010u\u001a\u00020t¢\u0006\u0004\bu\u0010v\u001a\u0015\u0010x\u001a\u00020\u00002\u0006\u0010w\u001a\u00020\t¢\u0006\u0004\bx\u0010y\u001a\u001d\u0010z\u001a\u00020\u00022\u0006\u0010w\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\bz\u0010>\u001a\u0015\u0010{\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b{\u0010\b\u001a\r\u0010|\u001a\u00020\u0002¢\u0006\u0004\b|\u0010L\u001a\u001d\u0010}\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f¢\u0006\u0004\b}\u0010~\u001a&\u0010\u0080\u0001\u001a\u00020\u00022\u0014\u0010\u007f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a&\u0010\u0082\u0001\u001a\u00020\u00022\u0014\u0010\u007f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f¢\u0006\u0006\b\u0082\u0001\u0010\u0081\u0001\u001a&\u0010\u0083\u0001\u001a\u00020\u00022\u0014\u0010\u007f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f¢\u0006\u0006\b\u0083\u0001\u0010\u0081\u0001\u001a&\u0010\u0084\u0001\u001a\u00020\u00022\u0014\u0010\u007f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f¢\u0006\u0006\b\u0084\u0001\u0010\u0081\u0001\u001a&\u0010\u0085\u0001\u001a\u00020\u00022\u0014\u0010\u007f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f¢\u0006\u0006\b\u0085\u0001\u0010\u0081\u0001\u001a&\u0010\u0086\u0001\u001a\u00020\u00022\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f¢\u0006\u0006\b\u0086\u0001\u0010\u0081\u0001\u001aB\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008a\u00012\u0007\u0010\u0087\u0001\u001a\u00020\t2\u0007\u0010\u0016\u001a\u00030\u0088\u00012\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\t2\u000e\u0010\u008b\u0001\u001a\t\u0012\u0005\u0012\u00030\u008a\u00010\u0014H\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a5\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u00012\u0006\u0010#\u001a\u00020\t2\u0006\u00102\u001a\u00020\t2\u000e\u0010\u008b\u0001\u001a\t\u0012\u0005\u0012\u00030\u008a\u00010\u0014H\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001\u001aJ\u0010\u0092\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u008e\u0001\u0018\u00010\u00142\u001d\u0010\u0091\u0001\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0018\u00010\u00142\u000e\u0010\u008b\u0001\u001a\t\u0012\u0005\u0012\u00030\u008a\u00010\u0014H\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001\u001aD\u0010\u0098\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0097\u0001\u0018\u00010\u00142\u001d\u0010\u0094\u0001\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0018\u00010\u00142\b\u0010\u0096\u0001\u001a\u00030\u0095\u0001H\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001\u001aJ\u0010\u009b\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u008a\u0001\u0018\u00010\u00142\u001d\u0010\u009a\u0001\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0018\u00010\u00142\u000e\u0010\u008b\u0001\u001a\t\u0012\u0005\u0012\u00030\u008a\u00010\u0014H\u0002¢\u0006\u0006\b\u009b\u0001\u0010\u0093\u0001\u001a\u0017\u0010\u009d\u0001\u001a\u00020\t*\u00030\u009c\u0001H\u0002¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0019\u0010 \u0001\u001a\u0005\u0018\u00010\u009f\u0001*\u00020\tH\u0002¢\u0006\u0006\b \u0001\u0010¡\u0001\u001a\u0019\u0010£\u0001\u001a\u0005\u0018\u00010¢\u0001*\u00020\tH\u0002¢\u0006\u0006\b£\u0001\u0010¤\u0001\u001a\u001b\u0010¥\u0001\u001a\u00030\u0088\u00012\u0006\u0010\u0016\u001a\u00020\tH\u0001¢\u0006\u0006\b¥\u0001\u0010¦\u0001\u001a5\u0010¨\u0001\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f2\u0011\u0010§\u0001\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000fH\u0002¢\u0006\u0006\b¨\u0001\u0010©\u0001\u001a7\u0010«\u0001\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0018\u00010\u00142\r\u0010ª\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0014H\u0002¢\u0006\u0006\b«\u0001\u0010¬\u0001\u001a\u0091\u0001\u0010°\u0001\u001a\u00020\u00022\u001c\u0010*\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0018\u00010\u00142\u001c\u0010+\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0018\u00010\u00142\u0014\u0010®\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u00ad\u0001\u0012\u0004\u0012\u00020\u0002072+\u0010\u0006\u001a'\u0012\r\u0012\u000b\u0012\u0005\u0012\u00030\u008a\u0001\u0018\u00010\u0014\u0012\r\u0012\u000b\u0012\u0005\u0012\u00030\u008e\u0001\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00020¯\u0001H\u0002¢\u0006\u0006\b°\u0001\u0010±\u0001\u001aT\u0010²\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u00142\u001c\u0010*\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0018\u00010\u00142\u001c\u0010+\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0018\u00010\u0014H\u0002¢\u0006\u0006\b²\u0001\u0010\u0093\u0001\u001a \u0010µ\u0001\u001a\u0005\u0018\u00010´\u00012\t\u0010³\u0001\u001a\u0004\u0018\u00010&H\u0001¢\u0006\u0006\bµ\u0001\u0010¶\u0001\u001a.\u0010·\u0001\u001a\u0016\u0012\u0005\u0012\u00030\u00ad\u0001\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020¯\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0006\b·\u0001\u0010¸\u0001\u001a1\u0010»\u0001\u001a\u0019\u0012\u0007\u0012\u0005\u0018\u00010¹\u0001\u0012\u0005\u0012\u00030º\u0001\u0012\u0004\u0012\u00020\u00020¯\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0006\b»\u0001\u0010¸\u0001\u001a\u001a\u0010½\u0001\u001a\u00020\u00022\u0007\u0010¼\u0001\u001a\u00020\tH\u0000¢\u0006\u0005\b½\u0001\u0010D\u001a\u001a\u0010¾\u0001\u001a\u00020\u00022\u0007\u0010¼\u0001\u001a\u00020\tH\u0000¢\u0006\u0005\b¾\u0001\u0010D\u001a'\u0010À\u0001\u001a\u0005\u0018\u00010¿\u0001*\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0000¢\u0006\u0006\bÀ\u0001\u0010Á\u0001\u001a\u001f\u0010Ã\u0001\u001a\u0004\u0018\u00010&2\t\u0010Â\u0001\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001¨\u0006Å\u0001"}, d2 = {"", "allowSharingAppStoreAccount", "LTd/L;", "setAllowSharingAppStoreAccount", "(Z)V", "Lcom/revenuecat/purchases/hybridcommon/OnResult;", "onResult", "getOfferings", "(Lcom/revenuecat/purchases/hybridcommon/OnResult;)V", "", "placementIdentifier", "Lcom/revenuecat/purchases/hybridcommon/OnNullableResult;", "getCurrentOfferingForPlacement", "(Ljava/lang/String;Lcom/revenuecat/purchases/hybridcommon/OnNullableResult;)V", "syncAttributesAndOfferingsIfNeeded", "", "", "data", "setAppstackAttributionParams", "(Ljava/util/Map;Lcom/revenuecat/purchases/hybridcommon/OnResult;)V", "", "productIDs", "type", "Lcom/revenuecat/purchases/hybridcommon/OnResultList;", "getProductInfo", "(Ljava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/hybridcommon/OnResultList;)V", "Landroid/app/Activity;", "activity", "options", "purchase", "(Landroid/app/Activity;Ljava/util/Map;Lcom/revenuecat/purchases/hybridcommon/OnResult;)V", "LTd/u;", "Lcom/revenuecat/purchases/hybridcommon/CommonPurchaseParams;", "validatePurchaseParams", "(Ljava/util/Map;)Ljava/lang/Object;", "productIdentifier", "googleBasePlanId", "googleOldProductId", "", "googleReplacementModeInt", "googleIsPersonalizedPrice", "presentedOfferingContext", "addOnStoreProducts", "addOnSubscriptionOptions", "addOnPackages", "purchaseProduct", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Lcom/revenuecat/purchases/hybridcommon/OnResult;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "packageIdentifier", "purchasePackage", "(Landroid/app/Activity;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/revenuecat/purchases/hybridcommon/OnResult;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "optionIdentifier", "purchaseSubscriptionOption", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Lcom/revenuecat/purchases/hybridcommon/OnResult;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAppUserID", "()Ljava/lang/String;", "Lkotlin/Function1;", "callback", "getStorefront", "(Lkotlin/jvm/functions/Function1;)V", "restorePurchases", "appUserID", "logIn", "(Ljava/lang/String;Lcom/revenuecat/purchases/hybridcommon/OnResult;)V", "logOut", "enabled", "setDebugLogsEnabled", "level", "setLogLevel", "(Ljava/lang/String;)V", "setLogHandler", "setLogHandlerWithOnResult", "proxyURLString", "setProxyURLString", "getProxyURLString", "getCustomerInfo", "syncPurchases", "()V", "isAnonymous", "()Z", "purchasesAreCompletedBy", "setPurchasesAreCompletedBy", "productIdentifiers", "checkTrialOrIntroductoryPriceEligibility", "(Ljava/util/List;)Ljava/util/Map;", "invalidateCustomerInfoCache", "locale", "overridePreferredLocale", "Landroid/content/Context;", "context", "features", "Lcom/revenuecat/purchases/hybridcommon/OnResultAny;", "canMakePayments", "(Landroid/content/Context;Ljava/util/List;Lcom/revenuecat/purchases/hybridcommon/OnResultAny;)V", "getAmazonLWAConsentStatus", "(Lcom/revenuecat/purchases/hybridcommon/OnResultAny;)V", "Lcom/revenuecat/purchases/models/InAppMessageType;", "inAppMessageTypes", "showInAppMessagesIfNeeded", "(Landroid/app/Activity;Ljava/util/List;)V", "apiKey", "Lcom/revenuecat/purchases/common/PlatformInfo;", "platformInfo", "Lcom/revenuecat/purchases/Store;", ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/DangerousSettings;", "dangerousSettings", "shouldShowInAppMessagesAutomatically", "verificationMode", "pendingTransactionsForPrepaidPlansEnabled", "diagnosticsEnabled", "automaticDeviceIdentifierCollectionEnabled", "preferredLocale", "configure", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/common/PlatformInfo;Lcom/revenuecat/purchases/Store;Lcom/revenuecat/purchases/DangerousSettings;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "setTrackedEventListener", "setDebugEventListener", "Lcom/revenuecat/purchases/hybridcommon/ErrorContainer;", "getPromotionalOffer", "()Lcom/revenuecat/purchases/hybridcommon/ErrorContainer;", "urlString", "isWebPurchaseRedemptionURL", "(Ljava/lang/String;)Z", "redeemWebPurchase", "getVirtualCurrencies", "invalidateVirtualCurrenciesCache", "getCachedVirtualCurrencies", "()Ljava/util/Map;", "adData", "trackAdDisplayed", "(Ljava/util/Map;)V", "trackAdOpened", "trackAdRevenue", "trackAdLoaded", "trackAdFailedToLoad", "trackCustomPaywallImpression", "productId", "Lcom/revenuecat/purchases/ProductType;", "basePlanId", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProducts", "storeProductForProductId", "(Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Ljava/lang/String;Ljava/util/List;)Lcom/revenuecat/purchases/models/StoreProduct;", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "subscriptionOptionForIdentifiers", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/revenuecat/purchases/models/SubscriptionOption;", "rawAddOnSubscriptionOptions", "createAddOnSubscriptionOptions", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "rawAddOnPackages", "Lcom/revenuecat/purchases/Offerings;", "offerings", "Lcom/revenuecat/purchases/Package;", "createAddOnPackages", "(Ljava/util/List;Lcom/revenuecat/purchases/Offerings;)Ljava/util/List;", "rawAddOnStoreProducts", "createAddOnStoreProducts", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "toResultName", "(Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;)Ljava/lang/String;", "Lcom/revenuecat/purchases/WebPurchaseRedemption;", "toWebPurchaseRedemption", "(Ljava/lang/String;)Lcom/revenuecat/purchases/WebPurchaseRedemption;", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "toPurchasesAreCompletedBy", "(Ljava/lang/String;)Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "mapStringToProductType", "(Ljava/lang/String;)Lcom/revenuecat/purchases/ProductType;", "wildCardMap", "castWildcardMapToStringToOptionalAnyMap", "(Ljava/util/Map;)Ljava/util/Map;", "wildCardList", "castWildcardListToListOfStringToAnyMaps", "(Ljava/util/List;)Ljava/util/List;", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "Lkotlin/Function2;", "fetchAddOnStoreProductsAndSubscriptionOptions", "(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "addOnProductIdsToFetch", "replacementModeInt", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "getGoogleReplacementMode", "(Ljava/lang/Integer;)Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "getPurchaseErrorFunction", "(Lcom/revenuecat/purchases/hybridcommon/OnResult;)Lkotlin/jvm/functions/Function2;", "Lcom/revenuecat/purchases/models/StoreTransaction;", "Lcom/revenuecat/purchases/CustomerInfo;", "getPurchaseCompletedFunction", "message", "warnLog", "errorLog", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "toPresentedOfferingContext", "(Ljava/util/Map;)Lcom/revenuecat/purchases/PresentedOfferingContext;", "value", "convertToInt", "(Ljava/lang/Object;)Ljava/lang/Integer;", "hybridcommon_bc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CommonKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$fetchAddOnStoreProductsAndSubscriptionOptions$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Function1 $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function1 function1) {
            super(1);
            this.$onError = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError it) {
            AbstractC5504s.h(it, "it");
            this.$onError.invoke(it);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$fetchAddOnStoreProductsAndSubscriptionOptions$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProducts", "LTd/L;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass2 extends AbstractC5506u implements Function1 {
        final /* synthetic */ List<Map<String, Object>> $addOnStoreProducts;
        final /* synthetic */ List<Map<String, Object>> $addOnSubscriptionOptions;
        final /* synthetic */ Function2 $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(List<? extends Map<String, ? extends Object>> list, List<? extends Map<String, ? extends Object>> list2, Function2 function2) {
            super(1);
            this.$addOnStoreProducts = list;
            this.$addOnSubscriptionOptions = list2;
            this.$onResult = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<? extends StoreProduct>) obj);
            return L.f17438a;
        }

        public final void invoke(List<? extends StoreProduct> storeProducts) {
            AbstractC5504s.h(storeProducts, "storeProducts");
            this.$onResult.invoke(CommonKt.createAddOnStoreProducts(this.$addOnStoreProducts, storeProducts), CommonKt.createAddOnSubscriptionOptions(this.$addOnSubscriptionOptions, storeProducts));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getAmazonLWAConsentStatus$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41121 extends AbstractC5506u implements Function1 {
        final /* synthetic */ OnResultAny<Boolean> $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41121(OnResultAny<Boolean> onResultAny) {
            super(1);
            this.$onResult = onResultAny;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError it) {
            AbstractC5504s.h(it, "it");
            this.$onResult.onError(PurchasesErrorKt.map$default(it, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getAmazonLWAConsentStatus$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/AmazonLWAConsentStatus;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/AmazonLWAConsentStatus;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41132 extends AbstractC5506u implements Function1 {
        final /* synthetic */ OnResultAny<Boolean> $onResult;

        /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getAmazonLWAConsentStatus$2$WhenMappings */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AmazonLWAConsentStatus.values().length];
                try {
                    iArr[AmazonLWAConsentStatus.CONSENTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AmazonLWAConsentStatus.UNAVAILABLE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41132(OnResultAny<Boolean> onResultAny) {
            super(1);
            this.$onResult = onResultAny;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AmazonLWAConsentStatus) obj);
            return L.f17438a;
        }

        public final void invoke(AmazonLWAConsentStatus it) {
            AbstractC5504s.h(it, "it");
            OnResultAny<Boolean> onResultAny = this.$onResult;
            int i10 = WhenMappings.$EnumSwitchMapping$0[it.ordinal()];
            boolean z10 = true;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new r();
                }
                z10 = false;
            }
            onResultAny.onReceived(Boolean.valueOf(z10));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getCurrentOfferingForPlacement$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41141 extends AbstractC5506u implements Function1 {
        final /* synthetic */ OnNullableResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41141(OnNullableResult onNullableResult) {
            super(1);
            this.$onResult = onNullableResult;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError it) {
            AbstractC5504s.h(it, "it");
            this.$onResult.onError(PurchasesErrorKt.map$default(it, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getCurrentOfferingForPlacement$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/Offerings;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/Offerings;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41152 extends AbstractC5506u implements Function1 {
        final /* synthetic */ OnNullableResult $onResult;
        final /* synthetic */ String $placementIdentifier;

        /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getCurrentOfferingForPlacement$2$1 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "map", "LTd/L;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
            final /* synthetic */ OnNullableResult $onResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OnNullableResult onNullableResult) {
                super(1);
                this.$onResult = onNullableResult;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Map<String, ? extends Object>) obj);
                return L.f17438a;
            }

            public final void invoke(Map<String, ? extends Object> map) {
                AbstractC5504s.h(map, "map");
                this.$onResult.onReceived(map);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41152(String str, OnNullableResult onNullableResult) {
            super(1);
            this.$placementIdentifier = str;
            this.$onResult = onNullableResult;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Offerings) obj);
            return L.f17438a;
        }

        public final void invoke(Offerings it) {
            AbstractC5504s.h(it, "it");
            Offering currentOfferingForPlacement = it.getCurrentOfferingForPlacement(this.$placementIdentifier);
            if (currentOfferingForPlacement != null) {
                OfferingsMapperKt.mapAsync(currentOfferingForPlacement, new AnonymousClass1(this.$onResult));
            } else {
                this.$onResult.onReceived(null);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getCustomerInfo$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41161 extends AbstractC5506u implements Function1 {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41161(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError it) {
            AbstractC5504s.h(it, "it");
            this.$onResult.onError(PurchasesErrorKt.map$default(it, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getCustomerInfo$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41172 extends AbstractC5506u implements Function1 {
        final /* synthetic */ OnResult $onResult;

        /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getCustomerInfo$2$1 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "map", "LTd/L;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
            final /* synthetic */ OnResult $onResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OnResult onResult) {
                super(1);
                this.$onResult = onResult;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Map<String, ? extends Object>) obj);
                return L.f17438a;
            }

            public final void invoke(Map<String, ? extends Object> map) {
                AbstractC5504s.h(map, "map");
                this.$onResult.onReceived(map);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41172(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return L.f17438a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            AbstractC5504s.h(customerInfo, "customerInfo");
            CustomerInfoMapperKt.mapAsync(customerInfo, new AnonymousClass1(this.$onResult));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getOfferings$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41181 extends AbstractC5506u implements Function1 {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41181(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError it) {
            AbstractC5504s.h(it, "it");
            this.$onResult.onError(PurchasesErrorKt.map$default(it, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getOfferings$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/Offerings;", "offerings", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/Offerings;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41192 extends AbstractC5506u implements Function1 {
        final /* synthetic */ OnResult $onResult;

        /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getOfferings$2$1 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "map", "LTd/L;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
            final /* synthetic */ OnResult $onResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OnResult onResult) {
                super(1);
                this.$onResult = onResult;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Map<String, ? extends Object>) obj);
                return L.f17438a;
            }

            public final void invoke(Map<String, ? extends Object> map) {
                AbstractC5504s.h(map, "map");
                this.$onResult.onReceived(map);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41192(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Offerings) obj);
            return L.f17438a;
        }

        public final void invoke(Offerings offerings) {
            AbstractC5504s.h(offerings, "offerings");
            OfferingsMapperKt.mapAsync(offerings, new AnonymousClass1(this.$onResult));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getPurchaseCompletedFunction$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "transaction", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41201 extends AbstractC5506u implements Function2 {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41201(OnResult onResult) {
            super(2);
            this.$onResult = onResult;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((StoreTransaction) obj, (CustomerInfo) obj2);
            return L.f17438a;
        }

        public final void invoke(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
            L l10;
            AbstractC5504s.h(customerInfo, "customerInfo");
            if (storeTransaction != null) {
                CustomerInfoMapperKt.mapAsync(customerInfo, new CommonKt$getPurchaseCompletedFunction$1$1$1(this.$onResult, storeTransaction));
                l10 = L.f17438a;
            } else {
                l10 = null;
            }
            if (l10 == null) {
                this.$onResult.onError(new ErrorContainer(PurchasesErrorCode.UnsupportedError.getCode(), "Error purchasing. Null transaction returned from a successful non-upgrade purchase.", S.i()));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getPurchaseErrorFunction$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "", "userCancelled", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41211 extends AbstractC5506u implements Function2 {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41211(OnResult onResult) {
            super(2);
            this.$onResult = onResult;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
            return L.f17438a;
        }

        public final void invoke(PurchasesError error, boolean z10) {
            AbstractC5504s.h(error, "error");
            this.$onResult.onError(PurchasesErrorKt.map(error, S.f(z.a("userCancelled", Boolean.valueOf(z10)))));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getStorefront$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41221 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Function1 $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41221(Function1 function1) {
            super(1);
            this.$callback = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError it) {
            AbstractC5504s.h(it, "it");
            this.$callback.invoke(null);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getStorefront$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LTd/L;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41232 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Function1 $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41232(Function1 function1) {
            super(1);
            this.$callback = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return L.f17438a;
        }

        public final void invoke(String it) {
            AbstractC5504s.h(it, "it");
            this.$callback.invoke(S.f(z.a("countryCode", it)));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getVirtualCurrencies$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41241 extends AbstractC5506u implements Function1 {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41241(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError error) {
            AbstractC5504s.h(error, "error");
            this.$onResult.onError(PurchasesErrorKt.map$default(error, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getVirtualCurrencies$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "virtualCurrencies", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41252 extends AbstractC5506u implements Function1 {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41252(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((VirtualCurrencies) obj);
            return L.f17438a;
        }

        public final void invoke(VirtualCurrencies virtualCurrencies) {
            AbstractC5504s.h(virtualCurrencies, "virtualCurrencies");
            this.$onResult.onReceived(VirtualCurrenciesMapperKt.map(virtualCurrencies));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$logIn$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41261 extends AbstractC5506u implements Function1 {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41261(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError it) {
            AbstractC5504s.h(it, "it");
            this.$onResult.onError(PurchasesErrorKt.map$default(it, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$logIn$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "", "created", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41272 extends AbstractC5506u implements Function2 {
        final /* synthetic */ OnResult $onResult;

        /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$logIn$2$1 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "map", "LTd/L;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
            final /* synthetic */ boolean $created;
            final /* synthetic */ OnResult $onResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(boolean z10, OnResult onResult) {
                super(1);
                this.$created = z10;
                this.$onResult = onResult;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Map<String, ? extends Object>) obj);
                return L.f17438a;
            }

            public final void invoke(Map<String, ? extends Object> map) {
                AbstractC5504s.h(map, "map");
                this.$onResult.onReceived(S.l(z.a("customerInfo", map), z.a("created", Boolean.valueOf(this.$created))));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41272(OnResult onResult) {
            super(2);
            this.$onResult = onResult;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((CustomerInfo) obj, ((Boolean) obj2).booleanValue());
            return L.f17438a;
        }

        public final void invoke(CustomerInfo customerInfo, boolean z10) {
            AbstractC5504s.h(customerInfo, "customerInfo");
            CustomerInfoMapperKt.mapAsync(customerInfo, new AnonymousClass1(z10, this.$onResult));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$logOut$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41281 extends AbstractC5506u implements Function1 {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41281(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError it) {
            AbstractC5504s.h(it, "it");
            this.$onResult.onError(PurchasesErrorKt.map$default(it, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$logOut$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41292 extends AbstractC5506u implements Function1 {
        final /* synthetic */ OnResult $onResult;

        /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$logOut$2$1 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "map", "LTd/L;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
            final /* synthetic */ OnResult $onResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OnResult onResult) {
                super(1);
                this.$onResult = onResult;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Map<String, ? extends Object>) obj);
                return L.f17438a;
            }

            public final void invoke(Map<String, ? extends Object> map) {
                AbstractC5504s.h(map, "map");
                this.$onResult.onReceived(map);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41292(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return L.f17438a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            AbstractC5504s.h(customerInfo, "customerInfo");
            CustomerInfoMapperKt.mapAsync(customerInfo, new AnonymousClass1(this.$onResult));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$purchasePackage$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41301 extends AbstractC5506u implements Function1 {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41301(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError it) {
            AbstractC5504s.h(it, "it");
            this.$onResult.onError(PurchasesErrorKt.map$default(it, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$purchasePackage$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/Offerings;", "offerings", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/Offerings;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41312 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ List<Map<String, Object>> $addOnPackages;
        final /* synthetic */ List<Map<String, Object>> $addOnStoreProducts;
        final /* synthetic */ List<Map<String, Object>> $addOnSubscriptionOptions;
        final /* synthetic */ Boolean $googleIsPersonalizedPrice;
        final /* synthetic */ String $googleOldProductId;
        final /* synthetic */ GoogleReplacementMode $googleReplacementMode;
        final /* synthetic */ OnResult $onResult;
        final /* synthetic */ String $packageIdentifier;
        final /* synthetic */ Map<String, Object> $presentedOfferingContext;

        /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$purchasePackage$2$2 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C06752 extends AbstractC5506u implements Function1 {
            final /* synthetic */ OnResult $onResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06752(OnResult onResult) {
                super(1);
                this.$onResult = onResult;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return L.f17438a;
            }

            public final void invoke(PurchasesError it) {
                AbstractC5504s.h(it, "it");
                this.$onResult.onError(PurchasesErrorKt.map$default(it, null, 1, null));
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$purchasePackage$2$3 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "addOnStoreProducts", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "addOnSubscriptionOptions", "LTd/L;", "invoke", "(Ljava/util/List;Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass3 extends AbstractC5506u implements Function2 {
            final /* synthetic */ List<Map<String, Object>> $addOnPackages;
            final /* synthetic */ Offerings $offerings;
            final /* synthetic */ OnResult $onResult;
            final /* synthetic */ PurchaseParams.Builder $purchaseParams;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(List<? extends Map<String, ? extends Object>> list, Offerings offerings, OnResult onResult, PurchaseParams.Builder builder) {
                super(2);
                this.$addOnPackages = list;
                this.$offerings = offerings;
                this.$onResult = onResult;
                this.$purchaseParams = builder;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((List<? extends StoreProduct>) obj, (List<? extends SubscriptionOption>) obj2);
                return L.f17438a;
            }

            public final void invoke(List<? extends StoreProduct> list, List<? extends SubscriptionOption> list2) {
                if (list == null || list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    this.$purchaseParams.addOnStoreProducts(list);
                }
                if (list2 == null || list2.isEmpty()) {
                    list2 = null;
                }
                if (list2 != null) {
                    this.$purchaseParams.addOnSubscriptionOptions(list2);
                }
                try {
                    List<Package> listCreateAddOnPackages = CommonKt.createAddOnPackages(this.$addOnPackages, this.$offerings);
                    if (listCreateAddOnPackages == null || listCreateAddOnPackages.isEmpty()) {
                        listCreateAddOnPackages = null;
                    }
                    if (listCreateAddOnPackages != null) {
                        this.$purchaseParams.addOnPackages(listCreateAddOnPackages);
                    }
                    ListenerConversionsCommonKt.purchaseWith(Purchases.INSTANCE.getSharedInstance(), this.$purchaseParams.build(), CommonKt.getPurchaseErrorFunction(this.$onResult), CommonKt.getPurchaseCompletedFunction(this.$onResult));
                } catch (IllegalArgumentException e10) {
                    this.$onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, e10.getMessage()), null, 1, null));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C41312(Map<String, ? extends Object> map, OnResult onResult, Activity activity, String str, GoogleReplacementMode googleReplacementMode, Boolean bool, List<? extends Map<String, ? extends Object>> list, List<? extends Map<String, ? extends Object>> list2, List<? extends Map<String, ? extends Object>> list3, String str2) {
            super(1);
            this.$presentedOfferingContext = map;
            this.$onResult = onResult;
            this.$activity = activity;
            this.$googleOldProductId = str;
            this.$googleReplacementMode = googleReplacementMode;
            this.$googleIsPersonalizedPrice = bool;
            this.$addOnStoreProducts = list;
            this.$addOnSubscriptionOptions = list2;
            this.$addOnPackages = list3;
            this.$packageIdentifier = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Offerings) obj);
            return L.f17438a;
        }

        public final void invoke(Offerings offerings) {
            Package r52;
            List<Map<String, Object>> list;
            List<Map<String, Object>> list2;
            List<Package> availablePackages;
            Object next;
            AbstractC5504s.h(offerings, "offerings");
            PresentedOfferingContext presentedOfferingContext = CommonKt.toPresentedOfferingContext(this.$presentedOfferingContext);
            if (presentedOfferingContext == null) {
                this.$onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, "There is no or invalid presented offering context data provided to make this purchase"), null, 1, null));
                return;
            }
            Offering offering = offerings.get(presentedOfferingContext.getOfferingIdentifier());
            if (offering == null || (availablePackages = offering.getAvailablePackages()) == null) {
                r52 = null;
            } else {
                String str = this.$packageIdentifier;
                Iterator<T> it = availablePackages.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (Df.r.B(((Package) next).getIdentifier(), str, true)) {
                            break;
                        }
                    }
                }
                r52 = (Package) next;
            }
            if (r52 == null) {
                this.$onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.ProductNotAvailableForPurchaseError, "Couldn't find product for package " + this.$packageIdentifier), null, 1, null));
                return;
            }
            PurchaseParams.Builder builder = new PurchaseParams.Builder(this.$activity, r52);
            builder.presentedOfferingContext(presentedOfferingContext);
            String str2 = this.$googleOldProductId;
            if (str2 != null && !Df.r.l0(str2)) {
                builder.oldProductId(this.$googleOldProductId);
                GoogleReplacementMode googleReplacementMode = this.$googleReplacementMode;
                if (googleReplacementMode != null) {
                    builder.googleReplacementMode(googleReplacementMode);
                }
            }
            Boolean bool = this.$googleIsPersonalizedPrice;
            if (bool != null) {
                builder.isPersonalizedPrice(bool.booleanValue());
            }
            List<Map<String, Object>> list3 = this.$addOnStoreProducts;
            if ((list3 == null || list3.isEmpty()) && (((list = this.$addOnSubscriptionOptions) == null || list.isEmpty()) && ((list2 = this.$addOnPackages) == null || list2.isEmpty()))) {
                ListenerConversionsCommonKt.purchaseWith(Purchases.INSTANCE.getSharedInstance(), builder.build(), CommonKt.getPurchaseErrorFunction(this.$onResult), CommonKt.getPurchaseCompletedFunction(this.$onResult));
            } else {
                CommonKt.fetchAddOnStoreProductsAndSubscriptionOptions(this.$addOnStoreProducts, this.$addOnSubscriptionOptions, new C06752(this.$onResult), new AnonymousClass3(this.$addOnPackages, offerings, this.$onResult, builder));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$purchaseProduct$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41321 extends AbstractC5506u implements Function1 {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41321(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError it) {
            AbstractC5504s.h(it, "it");
            this.$onResult.onError(PurchasesErrorKt.map$default(it, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$purchaseProduct$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41332 extends AbstractC5506u implements Function1 {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41332(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError it) {
            AbstractC5504s.h(it, "it");
            this.$onResult.onError(PurchasesErrorKt.map$default(it, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$purchaseSubscriptionOption$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41341 extends AbstractC5506u implements Function1 {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41341(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError it) {
            AbstractC5504s.h(it, "it");
            this.$onResult.onError(PurchasesErrorKt.map$default(it, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$restorePurchases$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41351 extends AbstractC5506u implements Function1 {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41351(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError it) {
            AbstractC5504s.h(it, "it");
            this.$onResult.onError(PurchasesErrorKt.map$default(it, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$restorePurchases$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41362 extends AbstractC5506u implements Function1 {
        final /* synthetic */ OnResult $onResult;

        /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$restorePurchases$2$1 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "map", "LTd/L;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
            final /* synthetic */ OnResult $onResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OnResult onResult) {
                super(1);
                this.$onResult = onResult;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Map<String, ? extends Object>) obj);
                return L.f17438a;
            }

            public final void invoke(Map<String, ? extends Object> map) {
                AbstractC5504s.h(map, "map");
                this.$onResult.onReceived(map);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41362(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return L.f17438a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            AbstractC5504s.h(customerInfo, "customerInfo");
            CustomerInfoMapperKt.mapAsync(customerInfo, new AnonymousClass1(this.$onResult));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$setAppstackAttributionParams$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/revenuecat/purchases/hybridcommon/CommonKt$setAppstackAttributionParams$1", "Lcom/revenuecat/purchases/interfaces/SyncAttributesAndOfferingsCallback;", "Lcom/revenuecat/purchases/Offerings;", "offerings", "LTd/L;", "onSuccess", "(Lcom/revenuecat/purchases/Offerings;)V", "Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "onError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "hybridcommon_bc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C41371 implements SyncAttributesAndOfferingsCallback {
        C41371() {
        }

        @Override // com.revenuecat.purchases.interfaces.SyncAttributesAndOfferingsCallback
        public void onError(PurchasesError purchasesError) {
            AbstractC5504s.h(purchasesError, "error");
            onResult.onError(PurchasesErrorKt.map$default(purchasesError, null, 1, null));
        }

        @Override // com.revenuecat.purchases.interfaces.SyncAttributesAndOfferingsCallback
        public void onSuccess(Offerings offerings) {
            AbstractC5504s.h(offerings, "offerings");
            OfferingsMapperKt.mapAsync(offerings, new CommonKt$setAppstackAttributionParams$1$onSuccess$1(onResult));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$setLogHandlerWithOnResult$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "logDetails", "LTd/L;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41381 extends AbstractC5506u implements Function1 {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41381(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map<String, String>) obj);
            return L.f17438a;
        }

        public final void invoke(Map<String, String> logDetails) {
            AbstractC5504s.h(logDetails, "logDetails");
            this.$onResult.onReceived(logDetails);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$syncAttributesAndOfferingsIfNeeded$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41391 extends AbstractC5506u implements Function1 {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41391(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError it) {
            AbstractC5504s.h(it, "it");
            this.$onResult.onError(PurchasesErrorKt.map$default(it, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$syncAttributesAndOfferingsIfNeeded$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/Offerings;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/Offerings;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41402 extends AbstractC5506u implements Function1 {
        final /* synthetic */ OnResult $onResult;

        /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$syncAttributesAndOfferingsIfNeeded$2$1 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "map", "LTd/L;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
            final /* synthetic */ OnResult $onResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OnResult onResult) {
                super(1);
                this.$onResult = onResult;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Map<String, ? extends Object>) obj);
                return L.f17438a;
            }

            public final void invoke(Map<String, ? extends Object> map) {
                AbstractC5504s.h(map, "map");
                this.$onResult.onReceived(map);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41402(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Offerings) obj);
            return L.f17438a;
        }

        public final void invoke(Offerings it) {
            AbstractC5504s.h(it, "it");
            OfferingsMapperKt.mapAsync(it, new AnonymousClass1(this.$onResult));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$syncPurchases$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41411 extends AbstractC5506u implements Function1 {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41411(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError it) {
            AbstractC5504s.h(it, "it");
            this.$onResult.onError(PurchasesErrorKt.map$default(it, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$syncPurchases$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41422 extends AbstractC5506u implements Function1 {
        final /* synthetic */ OnResult $onResult;

        /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$syncPurchases$2$1 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "map", "LTd/L;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
            final /* synthetic */ OnResult $onResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OnResult onResult) {
                super(1);
                this.$onResult = onResult;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Map<String, ? extends Object>) obj);
                return L.f17438a;
            }

            public final void invoke(Map<String, ? extends Object> map) {
                AbstractC5504s.h(map, "map");
                this.$onResult.onReceived(map);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41422(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return L.f17438a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            AbstractC5504s.h(customerInfo, "customerInfo");
            CustomerInfoMapperKt.mapAsync(customerInfo, new AnonymousClass1(this.$onResult));
        }
    }

    private static final List<String> addOnProductIdsToFetch(List<? extends Map<String, ? extends Object>> list, List<? extends Map<String, ? extends Object>> list2) {
        List listM;
        List listM2 = null;
        if (list != null) {
            listM = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Object obj = ((Map) it.next()).get("productIdentifier");
                String str = obj instanceof String ? (String) obj : null;
                String str2 = str == null ? null : (String) AbstractC2279u.m0(Df.r.N0(str, new String[]{Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR}, false, 0, 6, null));
                if (str2 != null) {
                    listM.add(str2);
                }
            }
        } else {
            listM = null;
        }
        if (listM == null) {
            listM = AbstractC2279u.m();
        }
        if (list2 != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                Object obj2 = ((Map) it2.next()).get("productIdentifier");
                String str3 = obj2 instanceof String ? (String) obj2 : null;
                String str4 = str3 == null ? null : (String) AbstractC2279u.m0(Df.r.N0(str3, new String[]{Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR}, false, 0, 6, null));
                if (str4 != null) {
                    arrayList.add(str4);
                }
            }
            listM2 = arrayList;
        }
        if (listM2 == null) {
            listM2 = AbstractC2279u.m();
        }
        return AbstractC2279u.I0(listM, listM2);
    }

    public static final void canMakePayments(Context context, List<Integer> features, final OnResultAny<Boolean> onResult) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(features, "features");
        AbstractC5504s.h(onResult, "onResult");
        ArrayList arrayList = new ArrayList();
        try {
            BillingFeature[] billingFeatureArrValues = BillingFeature.values();
            ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(features, 10));
            Iterator<T> it = features.iterator();
            while (it.hasNext()) {
                arrayList2.add(billingFeatureArrValues[((Number) it.next()).intValue()]);
            }
            arrayList.addAll(arrayList2);
            Purchases.INSTANCE.canMakePayments(context, arrayList, new Callback() { // from class: com.revenuecat.purchases.hybridcommon.d
                @Override // com.revenuecat.purchases.interfaces.Callback
                public final void onReceived(Object obj) {
                    CommonKt.canMakePayments$lambda$5(onResult, (Boolean) obj);
                }
            });
        } catch (IndexOutOfBoundsException unused) {
            onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.UnknownError, "Invalid feature type passed to canMakePayments."), null, 1, null));
        }
    }

    public static final void canMakePayments$lambda$5(OnResultAny onResultAny, Boolean it) {
        AbstractC5504s.g(it, "it");
        onResultAny.onReceived(it);
    }

    private static final List<Map<String, Object>> castWildcardListToListOfStringToAnyMaps(List<?> list) {
        LinkedHashMap linkedHashMap;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Map map = obj instanceof Map ? (Map) obj : null;
            if (map == null) {
                linkedHashMap = null;
                break;
            }
            Set setKeySet = map.keySet();
            if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof String)) {
                        linkedHashMap = null;
                        break;
                    }
                }
            }
            linkedHashMap = new LinkedHashMap(S.e(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                AbstractC5504s.f(key, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) key, entry.getValue());
            }
            if (linkedHashMap != null) {
                arrayList.add(linkedHashMap);
            }
        }
        return arrayList;
    }

    private static final Map<String, Object> castWildcardMapToStringToOptionalAnyMap(Map<?, ?> map) {
        LinkedHashMap linkedHashMap = null;
        if (map != null) {
            Set<?> setKeySet = map.keySet();
            if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                Iterator<T> it = setKeySet.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof String)) {
                        return null;
                    }
                }
            }
            linkedHashMap = new LinkedHashMap(S.e(map.size()));
            Iterator<T> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Object key = entry.getKey();
                AbstractC5504s.f(key, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) key, entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final Map<String, Map<String, Object>> checkTrialOrIntroductoryPriceEligibility(List<String> productIdentifiers) {
        AbstractC5504s.h(productIdentifiers, "productIdentifiers");
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(productIdentifiers, 10));
        Iterator<T> it = productIdentifiers.iterator();
        while (it.hasNext()) {
            arrayList.add(z.a((String) it.next(), S.l(z.a("status", 0), z.a(com.amazon.a.a.o.b.f34645c, "Status indeterminate."))));
        }
        return S.w(arrayList);
    }

    public static final void configure(Context context, String apiKey, String str, PlatformInfo platformInfo) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(apiKey, "apiKey");
        AbstractC5504s.h(platformInfo, "platformInfo");
        configure$default(context, apiKey, str, null, platformInfo, null, null, null, null, null, null, null, null, 8168, null);
    }

    public static /* synthetic */ void configure$default(Context context, String str, String str2, String str3, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool, String str4, Boolean bool2, Boolean bool3, Boolean bool4, String str5, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        if ((i10 & 32) != 0) {
            store = Store.PLAY_STORE;
        }
        if ((i10 & 64) != 0) {
            dangerousSettings = new DangerousSettings(true);
        }
        if ((i10 & 128) != 0) {
            bool = null;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            str4 = null;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            bool2 = null;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
            bool3 = null;
        }
        if ((i10 & 2048) != 0) {
            bool4 = null;
        }
        if ((i10 & 4096) != 0) {
            str5 = null;
        }
        configure(context, str, str2, str3, platformInfo, store, dangerousSettings, bool, str4, bool2, bool3, bool4, str5);
    }

    public static final Integer convertToInt(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Double) {
            return Integer.valueOf((int) ((Number) obj).doubleValue());
        }
        return null;
    }

    public static final List<Package> createAddOnPackages(List<? extends Map<String, ? extends Object>> list, Offerings offerings) {
        Package r22;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            Object obj = map.get("packageIdentifier");
            String str = obj instanceof String ? (String) obj : null;
            if (str != null) {
                Object obj2 = map.get("presentedOfferingContext");
                Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
                if (map2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry entry : map2.entrySet()) {
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        String str2 = key instanceof String ? (String) key : null;
                        Pair pairA = str2 != null ? z.a(str2, value) : null;
                        if (pairA != null) {
                            arrayList2.add(pairA);
                        }
                    }
                    Map mapW = S.w(arrayList2);
                    if (mapW != null) {
                        Object obj3 = mapW.get("offeringIdentifier");
                        String str3 = obj3 instanceof String ? (String) obj3 : null;
                        if (str3 == null) {
                            throw new IllegalArgumentException("Missing offeringIdentifier for add-on package " + str);
                        }
                        Offering offering = offerings.get(str3);
                        if (offering == null) {
                            throw new IllegalArgumentException("Could not find offering with identifier " + str3 + " for add-on package " + str);
                        }
                        try {
                            r22 = offering.getPackage(str);
                        } catch (NoSuchElementException unused) {
                            throw new IllegalArgumentException("Could not find package with identifier " + str + " in offering with identifier " + str3);
                        }
                    }
                }
                throw new IllegalArgumentException("Missing presentedOfferingContext for add-on package " + str);
            }
            r22 = null;
            if (r22 != null) {
                arrayList.add(r22);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List<com.revenuecat.purchases.models.StoreProduct> createAddOnStoreProducts(java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> r5, java.util.List<? extends com.revenuecat.purchases.models.StoreProduct> r6) {
        /*
            r0 = 0
            if (r5 == 0) goto L51
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto La
            goto L51
        La:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        L13:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L50
            java.lang.Object r2 = r5.next()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "productIdentifier"
            java.lang.Object r3 = r2.get(r3)
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L2c
            java.lang.String r3 = (java.lang.String) r3
            goto L2d
        L2c:
            r3 = r0
        L2d:
            if (r3 != 0) goto L31
        L2f:
            r2 = r0
            goto L4a
        L31:
            java.lang.String r4 = "type"
            java.lang.Object r2 = r2.get(r4)
            boolean r4 = r2 instanceof java.lang.String
            if (r4 == 0) goto L3e
            java.lang.String r2 = (java.lang.String) r2
            goto L3f
        L3e:
            r2 = r0
        L3f:
            if (r2 != 0) goto L42
            goto L2f
        L42:
            com.revenuecat.purchases.ProductType r2 = mapStringToProductType(r2)
            com.revenuecat.purchases.models.StoreProduct r2 = storeProductForProductId(r3, r2, r0, r6)
        L4a:
            if (r2 == 0) goto L13
            r1.add(r2)
            goto L13
        L50:
            return r1
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.hybridcommon.CommonKt.createAddOnStoreProducts(java.util.List, java.util.List):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List<com.revenuecat.purchases.models.SubscriptionOption> createAddOnSubscriptionOptions(java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> r5, java.util.List<? extends com.revenuecat.purchases.models.StoreProduct> r6) {
        /*
            r0 = 0
            if (r5 == 0) goto L4d
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto La
            goto L4d
        La:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        L13:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L4c
            java.lang.Object r2 = r5.next()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "productIdentifier"
            java.lang.Object r3 = r2.get(r3)
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L2c
            java.lang.String r3 = (java.lang.String) r3
            goto L2d
        L2c:
            r3 = r0
        L2d:
            if (r3 != 0) goto L31
        L2f:
            r2 = r0
            goto L46
        L31:
            java.lang.String r4 = "optionIdentifier"
            java.lang.Object r2 = r2.get(r4)
            boolean r4 = r2 instanceof java.lang.String
            if (r4 == 0) goto L3e
            java.lang.String r2 = (java.lang.String) r2
            goto L3f
        L3e:
            r2 = r0
        L3f:
            if (r2 != 0) goto L42
            goto L2f
        L42:
            com.revenuecat.purchases.models.SubscriptionOption r2 = subscriptionOptionForIdentifiers(r3, r2, r6)
        L46:
            if (r2 == 0) goto L13
            r1.add(r2)
            goto L13
        L4c:
            return r1
        L4d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.hybridcommon.CommonKt.createAddOnSubscriptionOptions(java.util.List, java.util.List):java.util.List");
    }

    public static final void errorLog(String message) {
        AbstractC5504s.h(message, "message");
        if (Purchases.INSTANCE.getLogLevel().compareTo(LogLevel.ERROR) <= 0) {
            Log.e("PurchasesHybridCommon", message);
        }
    }

    public static final void fetchAddOnStoreProductsAndSubscriptionOptions(List<? extends Map<String, ? extends Object>> list, List<? extends Map<String, ? extends Object>> list2, Function1 function1, Function2 function2) {
        List<String> listAddOnProductIdsToFetch = addOnProductIdsToFetch(list, list2);
        if (listAddOnProductIdsToFetch.isEmpty()) {
            function2.invoke(null, null);
        } else {
            ListenerConversionsCommonKt.getProductsWith(Purchases.INSTANCE.getSharedInstance(), listAddOnProductIdsToFetch, ProductType.SUBS, new AnonymousClass1(function1), new AnonymousClass2(list, list2, function2));
        }
    }

    public static final void getAmazonLWAConsentStatus(OnResultAny<Boolean> onResult) {
        AbstractC5504s.h(onResult, "onResult");
        ListenerConversionsKt.getAmazonLWAConsentStatusWith(Purchases.INSTANCE.getSharedInstance(), new C41121(onResult), new C41132(onResult));
    }

    public static final String getAppUserID() {
        return Purchases.INSTANCE.getSharedInstance().getAppUserID();
    }

    public static final Map<String, Object> getCachedVirtualCurrencies() {
        VirtualCurrencies cachedVirtualCurrencies = Purchases.INSTANCE.getSharedInstance().getCachedVirtualCurrencies();
        if (cachedVirtualCurrencies != null) {
            return VirtualCurrenciesMapperKt.map(cachedVirtualCurrencies);
        }
        return null;
    }

    public static final void getCurrentOfferingForPlacement(String placementIdentifier, OnNullableResult onResult) {
        AbstractC5504s.h(placementIdentifier, "placementIdentifier");
        AbstractC5504s.h(onResult, "onResult");
        ListenerConversionsCommonKt.getOfferingsWith(Purchases.INSTANCE.getSharedInstance(), new C41141(onResult), new C41152(placementIdentifier, onResult));
    }

    public static final void getCustomerInfo(OnResult onResult) {
        AbstractC5504s.h(onResult, "onResult");
        ListenerConversionsKt.getCustomerInfoWith(Purchases.INSTANCE.getSharedInstance(), new C41161(onResult), new C41172(onResult));
    }

    public static final GoogleReplacementMode getGoogleReplacementMode(Integer num) throws InvalidReplacementModeException {
        GoogleReplacementMode googleReplacementMode = null;
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        GoogleReplacementMode[] googleReplacementModeArrValues = GoogleReplacementMode.values();
        int length = googleReplacementModeArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            GoogleReplacementMode googleReplacementMode2 = googleReplacementModeArrValues[i10];
            if (googleReplacementMode2.getPlayBillingClientMode() == iIntValue) {
                googleReplacementMode = googleReplacementMode2;
                break;
            }
            i10++;
        }
        if (googleReplacementMode != null) {
            return googleReplacementMode;
        }
        throw new InvalidReplacementModeException();
    }

    public static final void getOfferings(OnResult onResult) {
        AbstractC5504s.h(onResult, "onResult");
        ListenerConversionsCommonKt.getOfferingsWith(Purchases.INSTANCE.getSharedInstance(), new C41181(onResult), new C41192(onResult));
    }

    public static final void getProductInfo(List<String> productIDs, String type, OnResultList onResult) {
        AbstractC5504s.h(productIDs, "productIDs");
        AbstractC5504s.h(type, "type");
        AbstractC5504s.h(onResult, "onResult");
        CommonKt$getProductInfo$onError$1 commonKt$getProductInfo$onError$1 = new CommonKt$getProductInfo$onError$1(onResult);
        CommonKt$getProductInfo$onReceived$1 commonKt$getProductInfo$onReceived$1 = new CommonKt$getProductInfo$onReceived$1(onResult);
        ProductType productTypeMapStringToProductType = mapStringToProductType(type);
        ProductType productType = ProductType.SUBS;
        if (productTypeMapStringToProductType == productType) {
            ListenerConversionsCommonKt.getProductsWith(Purchases.INSTANCE.getSharedInstance(), productIDs, productType, commonKt$getProductInfo$onError$1, commonKt$getProductInfo$onReceived$1);
        } else {
            ListenerConversionsCommonKt.getProductsWith(Purchases.INSTANCE.getSharedInstance(), productIDs, ProductType.INAPP, commonKt$getProductInfo$onError$1, commonKt$getProductInfo$onReceived$1);
        }
    }

    public static final ErrorContainer getPromotionalOffer() {
        return new ErrorContainer(PurchasesErrorCode.UnsupportedError.getCode(), "Android platform doesn't support promotional offers", S.i());
    }

    public static final String getProxyURLString() {
        return String.valueOf(Purchases.INSTANCE.getProxyURL());
    }

    public static final Function2 getPurchaseCompletedFunction(OnResult onResult) {
        return new C41201(onResult);
    }

    public static final Function2 getPurchaseErrorFunction(OnResult onResult) {
        return new C41211(onResult);
    }

    public static final void getStorefront(Function1 callback) {
        AbstractC5504s.h(callback, "callback");
        ListenerConversionsCommonKt.getStorefrontCountryCodeWith(Purchases.INSTANCE.getSharedInstance(), new C41221(callback), new C41232(callback));
    }

    public static final void getVirtualCurrencies(OnResult onResult) {
        AbstractC5504s.h(onResult, "onResult");
        ListenerConversionsKt.getVirtualCurrenciesWith(Purchases.INSTANCE.getSharedInstance(), new C41241(onResult), new C41252(onResult));
    }

    public static final void invalidateCustomerInfoCache() {
        Purchases.INSTANCE.getSharedInstance().invalidateCustomerInfoCache();
    }

    public static final void invalidateVirtualCurrenciesCache() {
        Purchases.INSTANCE.getSharedInstance().invalidateVirtualCurrenciesCache();
    }

    public static final boolean isAnonymous() {
        return Purchases.INSTANCE.getSharedInstance().isAnonymous();
    }

    public static final boolean isWebPurchaseRedemptionURL(String urlString) {
        AbstractC5504s.h(urlString, "urlString");
        return toWebPurchaseRedemption(urlString) != null;
    }

    public static final void logIn(String appUserID, OnResult onResult) {
        AbstractC5504s.h(appUserID, "appUserID");
        AbstractC5504s.h(onResult, "onResult");
        ListenerConversionsKt.logInWith(Purchases.INSTANCE.getSharedInstance(), appUserID, new C41261(onResult), new C41272(onResult));
    }

    public static final void logOut(OnResult onResult) {
        AbstractC5504s.h(onResult, "onResult");
        ListenerConversionsKt.logOutWith(Purchases.INSTANCE.getSharedInstance(), new C41281(onResult), new C41292(onResult));
    }

    public static final ProductType mapStringToProductType(String type) {
        MappedProductCategory mappedProductCategory;
        AbstractC5504s.h(type, "type");
        MappedProductCategory[] mappedProductCategoryArrValues = MappedProductCategory.values();
        int length = mappedProductCategoryArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                mappedProductCategory = null;
                break;
            }
            mappedProductCategory = mappedProductCategoryArrValues[i10];
            if (Df.r.B(mappedProductCategory.getValue(), type, true)) {
                break;
            }
            i10++;
        }
        if (mappedProductCategory != null) {
            return mappedProductCategory.getToProductType();
        }
        String lowerCase = type.toLowerCase(Locale.ROOT);
        AbstractC5504s.g(lowerCase, "toLowerCase(...)");
        if (AbstractC5504s.c(lowerCase, "subs")) {
            return ProductType.SUBS;
        }
        if (AbstractC5504s.c(lowerCase, "inapp")) {
            return ProductType.INAPP;
        }
        warnLog("Unrecognized product type: " + type + "... Defaulting to INAPP");
        return ProductType.INAPP;
    }

    public static final void overridePreferredLocale(String str) {
        Purchases.INSTANCE.getSharedInstance().overridePreferredUILocale(str);
    }

    public static final void purchase(Activity activity, Map<String, ? extends Object> options, OnResult onResult) {
        AbstractC5504s.h(options, "options");
        AbstractC5504s.h(onResult, "onResult");
        Object objValidatePurchaseParams = validatePurchaseParams(options);
        Throwable thE = u.e(objValidatePurchaseParams);
        if (thE != null) {
            AbstractC5504s.f(thE, "null cannot be cast to non-null type com.revenuecat.purchases.PurchasesException");
            onResult.onError(PurchasesErrorKt.map$default(((PurchasesException) thE).getError(), null, 1, null));
        }
        if (u.g(objValidatePurchaseParams)) {
            objValidatePurchaseParams = null;
        }
        CommonPurchaseParams commonPurchaseParams = (CommonPurchaseParams) objValidatePurchaseParams;
        if (commonPurchaseParams == null) {
            return;
        }
        PurchasableItem purchasableItem = commonPurchaseParams.getPurchasableItem();
        if (purchasableItem instanceof PurchasableItem.Product) {
            PurchasableItem.Product product = (PurchasableItem.Product) purchasableItem;
            purchaseProduct(activity, product.getProductIdentifier(), product.getType(), product.getGoogleBasePlanId(), commonPurchaseParams.getGoogleOldProductId(), commonPurchaseParams.getGoogleReplacementMode(), commonPurchaseParams.getGoogleIsPersonalizedPrice(), commonPurchaseParams.getPresentedOfferingContext(), onResult, commonPurchaseParams.getAddOnStoreProducts(), commonPurchaseParams.getAddOnSubscriptionOptions(), commonPurchaseParams.getAddOnPackages());
            return;
        }
        if (!(purchasableItem instanceof PurchasableItem.Package)) {
            if (purchasableItem instanceof PurchasableItem.SubscriptionOption) {
                PurchasableItem.SubscriptionOption subscriptionOption = (PurchasableItem.SubscriptionOption) purchasableItem;
                purchaseSubscriptionOption(activity, subscriptionOption.getProductIdentifier(), subscriptionOption.getOptionIdentifier(), commonPurchaseParams.getGoogleOldProductId(), commonPurchaseParams.getGoogleReplacementMode(), commonPurchaseParams.getGoogleIsPersonalizedPrice(), commonPurchaseParams.getPresentedOfferingContext(), onResult, commonPurchaseParams.getAddOnStoreProducts(), commonPurchaseParams.getAddOnSubscriptionOptions(), commonPurchaseParams.getAddOnPackages());
                return;
            }
            return;
        }
        String packageIdentifier = ((PurchasableItem.Package) purchasableItem).getPackageIdentifier();
        Map<String, Object> presentedOfferingContext = commonPurchaseParams.getPresentedOfferingContext();
        if (presentedOfferingContext == null) {
            presentedOfferingContext = S.i();
        }
        purchasePackage(activity, packageIdentifier, presentedOfferingContext, commonPurchaseParams.getGoogleOldProductId(), commonPurchaseParams.getGoogleReplacementMode(), commonPurchaseParams.getGoogleIsPersonalizedPrice(), onResult, commonPurchaseParams.getAddOnStoreProducts(), commonPurchaseParams.getAddOnSubscriptionOptions(), commonPurchaseParams.getAddOnPackages());
    }

    public static final void purchasePackage(Activity activity, String packageIdentifier, Map<String, ? extends Object> presentedOfferingContext, String str, Integer num, Boolean bool, OnResult onResult) {
        AbstractC5504s.h(packageIdentifier, "packageIdentifier");
        AbstractC5504s.h(presentedOfferingContext, "presentedOfferingContext");
        AbstractC5504s.h(onResult, "onResult");
        purchasePackage$default(activity, packageIdentifier, presentedOfferingContext, str, num, bool, onResult, null, null, null, 896, null);
    }

    public static /* synthetic */ void purchasePackage$default(Activity activity, String str, Map map, String str2, Integer num, Boolean bool, OnResult onResult, List list, List list2, List list3, int i10, Object obj) {
        if ((i10 & 128) != 0) {
            list = null;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            list2 = null;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            list3 = null;
        }
        purchasePackage(activity, str, map, str2, num, bool, onResult, list, list2, list3);
    }

    public static final void purchaseProduct(Activity activity, String productIdentifier, String type, String str, String str2, Integer num, Boolean bool, Map<String, ? extends Object> map, OnResult onResult) {
        AbstractC5504s.h(productIdentifier, "productIdentifier");
        AbstractC5504s.h(type, "type");
        AbstractC5504s.h(onResult, "onResult");
        purchaseProduct$default(activity, productIdentifier, type, str, str2, num, bool, map, onResult, null, null, null, 3584, null);
    }

    public static /* synthetic */ void purchaseProduct$default(Activity activity, String str, String str2, String str3, String str4, Integer num, Boolean bool, Map map, OnResult onResult, List list, List list2, List list3, int i10, Object obj) {
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            list = null;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
            list2 = null;
        }
        if ((i10 & 2048) != 0) {
            list3 = null;
        }
        purchaseProduct(activity, str, str2, str3, str4, num, bool, map, onResult, list, list2, list3);
    }

    public static final void purchaseSubscriptionOption(Activity activity, String productIdentifier, String optionIdentifier, String str, Integer num, Boolean bool, Map<String, ? extends Object> map, OnResult onResult) {
        AbstractC5504s.h(productIdentifier, "productIdentifier");
        AbstractC5504s.h(optionIdentifier, "optionIdentifier");
        AbstractC5504s.h(onResult, "onResult");
        purchaseSubscriptionOption$default(activity, productIdentifier, optionIdentifier, str, num, bool, map, onResult, null, null, null, 1792, null);
    }

    public static /* synthetic */ void purchaseSubscriptionOption$default(Activity activity, String str, String str2, String str3, Integer num, Boolean bool, Map map, OnResult onResult, List list, List list2, List list3, int i10, Object obj) {
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            list = null;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            list2 = null;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
            list3 = null;
        }
        purchaseSubscriptionOption(activity, str, str2, str3, num, bool, map, onResult, list, list2, list3);
    }

    public static final void redeemWebPurchase(String urlString, final OnResult onResult) {
        AbstractC5504s.h(urlString, "urlString");
        AbstractC5504s.h(onResult, "onResult");
        WebPurchaseRedemption webPurchaseRedemption = toWebPurchaseRedemption(urlString);
        if (webPurchaseRedemption == null) {
            onResult.onError(new ErrorContainer(PurchasesErrorCode.UnsupportedError.getCode(), "Invalid URL for web purchase redemption", S.i()));
        } else {
            Purchases.INSTANCE.getSharedInstance().redeemWebPurchase(webPurchaseRedemption, new RedeemWebPurchaseListener() { // from class: com.revenuecat.purchases.hybridcommon.c
                @Override // com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener
                public final void handleResult(RedeemWebPurchaseListener.Result result) {
                    CommonKt.redeemWebPurchase$lambda$17(onResult, result);
                }
            });
        }
    }

    public static final void redeemWebPurchase$lambda$17(OnResult onResult, RedeemWebPurchaseListener.Result result) {
        AbstractC5504s.h(result, "result");
        if (result instanceof RedeemWebPurchaseListener.Result.Success) {
            CustomerInfoMapperKt.mapAsync(((RedeemWebPurchaseListener.Result.Success) result).getCustomerInfo(), new CommonKt$redeemWebPurchase$1$1(onResult, result));
            return;
        }
        if (result instanceof RedeemWebPurchaseListener.Result.Error) {
            onResult.onReceived(S.n(z.a("result", toResultName(result)), z.a(LogEvent.LEVEL_ERROR, PurchasesErrorKt.map$default(((RedeemWebPurchaseListener.Result.Error) result).getError(), null, 1, null))));
        } else {
            if (result instanceof RedeemWebPurchaseListener.Result.Expired) {
                onResult.onReceived(S.n(z.a("result", toResultName(result)), z.a("obfuscatedEmail", ((RedeemWebPurchaseListener.Result.Expired) result).getObfuscatedEmail())));
                return;
            }
            if (AbstractC5504s.c(result, RedeemWebPurchaseListener.Result.PurchaseBelongsToOtherUser.INSTANCE) ? true : AbstractC5504s.c(result, RedeemWebPurchaseListener.Result.InvalidToken.INSTANCE)) {
                onResult.onReceived(S.n(z.a("result", toResultName(result))));
            }
        }
    }

    public static final void restorePurchases(OnResult onResult) {
        AbstractC5504s.h(onResult, "onResult");
        ListenerConversionsCommonKt.restorePurchasesWith(Purchases.INSTANCE.getSharedInstance(), new C41351(onResult), new C41362(onResult));
    }

    @InterfaceC2154e
    public static final void setAllowSharingAppStoreAccount(boolean z10) {
        Purchases.INSTANCE.getSharedInstance().setAllowSharingPlayStoreAccount(z10);
    }

    public static final void setAppstackAttributionParams(Map<String, ? extends Object> data, OnResult onResult) {
        AbstractC5504s.h(data, "data");
        AbstractC5504s.h(onResult, "onResult");
        LinkedHashMap linkedHashMap = new LinkedHashMap(S.e(data.size()));
        Iterator<T> it = data.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        Purchases.INSTANCE.getSharedInstance().setAppstackAttributionParams(linkedHashMap, new SyncAttributesAndOfferingsCallback() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt.setAppstackAttributionParams.1
            C41371() {
            }

            @Override // com.revenuecat.purchases.interfaces.SyncAttributesAndOfferingsCallback
            public void onError(PurchasesError purchasesError) {
                AbstractC5504s.h(purchasesError, "error");
                onResult.onError(PurchasesErrorKt.map$default(purchasesError, null, 1, null));
            }

            @Override // com.revenuecat.purchases.interfaces.SyncAttributesAndOfferingsCallback
            public void onSuccess(Offerings offerings) {
                AbstractC5504s.h(offerings, "offerings");
                OfferingsMapperKt.mapAsync(offerings, new CommonKt$setAppstackAttributionParams$1$onSuccess$1(onResult));
            }
        });
    }

    public static final void setDebugEventListener(final Function1 callback) {
        AbstractC5504s.h(callback, "callback");
        Purchases.INSTANCE.getSharedInstance().setDebugEventListener(new DebugEventListener() { // from class: com.revenuecat.purchases.hybridcommon.a
            @Override // com.revenuecat.purchases.DebugEventListener
            public final void onDebugEventReceived(DebugEvent debugEvent) {
                CommonKt.setDebugEventListener$lambda$16(callback, debugEvent);
            }
        });
    }

    public static final void setDebugEventListener$lambda$16(Function1 function1, DebugEvent event) {
        AbstractC5504s.h(event, "event");
        function1.invoke(DebugEventMapperKt.toMap(event));
    }

    @InterfaceC2154e
    public static final void setDebugLogsEnabled(boolean z10) {
        Purchases.INSTANCE.setDebugLogsEnabled(z10);
    }

    public static final void setLogHandler(Function1 callback) {
        AbstractC5504s.h(callback, "callback");
        Purchases.INSTANCE.setLogHandler(new LogHandlerWithMapping(callback));
    }

    public static final void setLogHandlerWithOnResult(OnResult onResult) {
        AbstractC5504s.h(onResult, "onResult");
        setLogHandler(new C41381(onResult));
    }

    public static final void setLogLevel(String level) {
        AbstractC5504s.h(level, "level");
        try {
            Purchases.INSTANCE.setLogLevel(LogLevel.valueOf(level));
        } catch (IllegalArgumentException unused) {
            warnLog("Unrecognized log level: " + level);
        }
    }

    public static final void setProxyURLString(String str) {
        Purchases.INSTANCE.setProxyURL(str != null ? new URL(str) : null);
    }

    public static final void setPurchasesAreCompletedBy(String purchasesAreCompletedBy) {
        AbstractC5504s.h(purchasesAreCompletedBy, "purchasesAreCompletedBy");
        PurchasesAreCompletedBy purchasesAreCompletedBy2 = toPurchasesAreCompletedBy(purchasesAreCompletedBy);
        if (purchasesAreCompletedBy2 != null) {
            Purchases.INSTANCE.getSharedInstance().setPurchasesAreCompletedBy(purchasesAreCompletedBy2);
        }
    }

    public static final void setTrackedEventListener(final Function1 callback) {
        AbstractC5504s.h(callback, "callback");
        Purchases.INSTANCE.getSharedInstance().setTrackedEventListener(new TrackedEventListener() { // from class: com.revenuecat.purchases.hybridcommon.b
            @Override // com.revenuecat.purchases.TrackedEventListener
            public final void onEventTracked(FeatureEvent featureEvent) {
                CommonKt.setTrackedEventListener$lambda$15(callback, featureEvent);
            }
        });
    }

    public static final void setTrackedEventListener$lambda$15(Function1 function1, FeatureEvent event) {
        AbstractC5504s.h(event, "event");
        function1.invoke(FeatureEventMapperKt.toMap(event));
    }

    public static final void showInAppMessagesIfNeeded(Activity activity) {
        showInAppMessagesIfNeeded$default(activity, null, 2, null);
    }

    public static /* synthetic */ void showInAppMessagesIfNeeded$default(Activity activity, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = null;
        }
        showInAppMessagesIfNeeded(activity, list);
    }

    public static final StoreProduct storeProductForProductId(String str, ProductType productType, String str2, List<? extends StoreProduct> list) {
        Object obj;
        Object next;
        boolean z10;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                break;
            }
            next = it.next();
            StoreProduct storeProduct = (StoreProduct) next;
            z10 = false;
            boolean z11 = AbstractC5504s.c(storeProduct.getId(), str) && storeProduct.getType() == productType;
            if (AbstractC5504s.c(storeProduct.getPurchasingData().getProductId(), str)) {
                GoogleStoreProduct googleProduct = GoogleStoreProductKt.getGoogleProduct(storeProduct);
                if (AbstractC5504s.c(googleProduct != null ? googleProduct.getBasePlanId() : null, str2) && storeProduct.getType() == productType) {
                    z10 = true;
                }
            }
            if (z11) {
                break;
            }
        } while (!z10);
        obj = next;
        return (StoreProduct) obj;
    }

    public static final SubscriptionOption subscriptionOptionForIdentifiers(String str, String str2, List<? extends StoreProduct> list) {
        SubscriptionOption subscriptionOption;
        Iterator<T> it = list.iterator();
        do {
            subscriptionOption = null;
            if (!it.hasNext()) {
                break;
            }
            StoreProduct storeProduct = (StoreProduct) it.next();
            SubscriptionOptions subscriptionOptions = storeProduct.getSubscriptionOptions();
            if (subscriptionOptions != null) {
                Iterator<SubscriptionOption> it2 = subscriptionOptions.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    SubscriptionOption next = it2.next();
                    SubscriptionOption subscriptionOption2 = next;
                    if (AbstractC5504s.c(storeProduct.getPurchasingData().getProductId(), str) && AbstractC5504s.c(subscriptionOption2.get$id(), str2)) {
                        subscriptionOption = next;
                        break;
                    }
                }
                subscriptionOption = subscriptionOption;
            }
        } while (subscriptionOption == null);
        return subscriptionOption;
    }

    public static final void syncAttributesAndOfferingsIfNeeded(OnResult onResult) {
        AbstractC5504s.h(onResult, "onResult");
        ListenerConversionsKt.syncAttributesAndOfferingsIfNeededWith(Purchases.INSTANCE.getSharedInstance(), new C41391(onResult), new C41402(onResult));
    }

    public static final void syncPurchases() {
        Purchases.syncPurchases$default(Purchases.INSTANCE.getSharedInstance(), null, 1, null);
    }

    public static final PresentedOfferingContext toPresentedOfferingContext(Map<String, ? extends Object> map) {
        AbstractC5504s.h(map, "<this>");
        Object obj = map.get("offeringIdentifier");
        PresentedOfferingContext.TargetingContext targetingContext = null;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            return null;
        }
        Object obj2 = map.get("placementIdentifier");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get("targetingContext");
        Map map2 = obj3 instanceof Map ? (Map) obj3 : null;
        if (map2 != null) {
            Integer numConvertToInt = convertToInt(map2.get("revision"));
            Object obj4 = map2.get("ruleId");
            String str3 = obj4 instanceof String ? (String) obj4 : null;
            if (numConvertToInt != null && str3 != null) {
                targetingContext = new PresentedOfferingContext.TargetingContext(numConvertToInt.intValue(), str3);
            }
        }
        return new PresentedOfferingContext(str, str2, targetingContext);
    }

    private static final PurchasesAreCompletedBy toPurchasesAreCompletedBy(String str) {
        try {
            return PurchasesAreCompletedBy.valueOf(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final String toResultName(RedeemWebPurchaseListener.Result result) {
        if (result instanceof RedeemWebPurchaseListener.Result.Success) {
            return HybridPurchaseLogicBridge.RESULT_SUCCESS;
        }
        if (result instanceof RedeemWebPurchaseListener.Result.Error) {
            return HybridPurchaseLogicBridge.RESULT_ERROR;
        }
        if (AbstractC5504s.c(result, RedeemWebPurchaseListener.Result.PurchaseBelongsToOtherUser.INSTANCE)) {
            return "PURCHASE_BELONGS_TO_OTHER_USER";
        }
        if (AbstractC5504s.c(result, RedeemWebPurchaseListener.Result.InvalidToken.INSTANCE)) {
            return "INVALID_TOKEN";
        }
        if (result instanceof RedeemWebPurchaseListener.Result.Expired) {
            return "EXPIRED";
        }
        throw new r();
    }

    private static final WebPurchaseRedemption toWebPurchaseRedemption(String str) {
        try {
            return Purchases.INSTANCE.parseAsWebPurchaseRedemption(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Throwable th2) {
            errorLog("Error parsing WebPurchaseRedemption from URL: " + str + ". Error: " + th2);
            return null;
        }
    }

    public static final void trackAdDisplayed(Map<String, ? extends Object> adData) {
        AbstractC5504s.h(adData, "adData");
        Object obj = adData.get("networkName");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = adData.get("mediatorName");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = adData.get("adFormat");
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = adData.get("adUnitId");
        String str4 = obj4 instanceof String ? (String) obj4 : null;
        Object obj5 = adData.get("impressionId");
        String str5 = obj5 instanceof String ? (String) obj5 : null;
        if (str2 == null || str3 == null || str4 == null || str5 == null) {
            errorLog("trackAdDisplayed: Missing required parameters - mediatorName, adFormat, adUnitId, or impressionId");
            return;
        }
        Object obj6 = adData.get("placement");
        Purchases.INSTANCE.getSharedInstance().getAdTracker().trackAdDisplayed(new AdDisplayedData(str, AdMediatorName.INSTANCE.m200fromStringCJOXPJU(str2), AdFormat.INSTANCE.m183fromStringXxFlno4(str3), obj6 instanceof String ? (String) obj6 : null, str4, str5, null));
    }

    public static final void trackAdFailedToLoad(Map<String, ? extends Object> adData) {
        AbstractC5504s.h(adData, "adData");
        Object obj = adData.get("mediatorName");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = adData.get("adFormat");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = adData.get("adUnitId");
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        if (str == null || str2 == null || str3 == null) {
            errorLog("trackAdFailedToLoad: Missing required parameters - mediatorName, adFormat, or adUnitId");
            return;
        }
        Object obj4 = adData.get("placement");
        String str4 = obj4 instanceof String ? (String) obj4 : null;
        Object obj5 = adData.get("mediatorErrorCode");
        Number number = obj5 instanceof Number ? (Number) obj5 : null;
        Purchases.INSTANCE.getSharedInstance().getAdTracker().trackAdFailedToLoad(new AdFailedToLoadData(AdMediatorName.INSTANCE.m200fromStringCJOXPJU(str), AdFormat.INSTANCE.m183fromStringXxFlno4(str2), str4, str3, number != null ? Integer.valueOf(number.intValue()) : null, null));
    }

    public static final void trackAdLoaded(Map<String, ? extends Object> adData) {
        AbstractC5504s.h(adData, "adData");
        Object obj = adData.get("networkName");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = adData.get("mediatorName");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = adData.get("adFormat");
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = adData.get("adUnitId");
        String str4 = obj4 instanceof String ? (String) obj4 : null;
        Object obj5 = adData.get("impressionId");
        String str5 = obj5 instanceof String ? (String) obj5 : null;
        if (str2 == null || str3 == null || str4 == null || str5 == null) {
            errorLog("trackAdLoaded: Missing required parameters - mediatorName, adFormat, adUnitId, or impressionId");
            return;
        }
        Object obj6 = adData.get("placement");
        Purchases.INSTANCE.getSharedInstance().getAdTracker().trackAdLoaded(new AdLoadedData(str, AdMediatorName.INSTANCE.m200fromStringCJOXPJU(str2), AdFormat.INSTANCE.m183fromStringXxFlno4(str3), obj6 instanceof String ? (String) obj6 : null, str4, str5, null));
    }

    public static final void trackAdOpened(Map<String, ? extends Object> adData) {
        AbstractC5504s.h(adData, "adData");
        Object obj = adData.get("networkName");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = adData.get("mediatorName");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = adData.get("adFormat");
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = adData.get("adUnitId");
        String str4 = obj4 instanceof String ? (String) obj4 : null;
        Object obj5 = adData.get("impressionId");
        String str5 = obj5 instanceof String ? (String) obj5 : null;
        if (str2 == null || str3 == null || str4 == null || str5 == null) {
            errorLog("trackAdOpened: Missing required parameters - mediatorName, adFormat, adUnitId, or impressionId");
            return;
        }
        Object obj6 = adData.get("placement");
        Purchases.INSTANCE.getSharedInstance().getAdTracker().trackAdOpened(new AdOpenedData(str, AdMediatorName.INSTANCE.m200fromStringCJOXPJU(str2), AdFormat.INSTANCE.m183fromStringXxFlno4(str3), obj6 instanceof String ? (String) obj6 : null, str4, str5, null));
    }

    public static final void trackAdRevenue(Map<String, ? extends Object> adData) {
        AbstractC5504s.h(adData, "adData");
        Object obj = adData.get("networkName");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = adData.get("mediatorName");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = adData.get("adFormat");
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = adData.get("adUnitId");
        String str4 = obj4 instanceof String ? (String) obj4 : null;
        Object obj5 = adData.get("impressionId");
        String str5 = obj5 instanceof String ? (String) obj5 : null;
        Object obj6 = adData.get("revenueMicros");
        Number number = obj6 instanceof Number ? (Number) obj6 : null;
        Long lValueOf = number != null ? Long.valueOf(number.longValue()) : null;
        Object obj7 = adData.get(com.amazon.a.a.o.b.f34634a);
        String str6 = obj7 instanceof String ? (String) obj7 : null;
        Object obj8 = adData.get("precision");
        String str7 = obj8 instanceof String ? (String) obj8 : null;
        if (str2 == null || str3 == null || str4 == null || str5 == null || lValueOf == null || str6 == null || str7 == null) {
            errorLog("trackAdRevenue: Missing required parameters - mediatorName, adFormat, adUnitId, impressionId, revenueMicros, currency, or precision");
            return;
        }
        Object obj9 = adData.get("placement");
        Purchases.INSTANCE.getSharedInstance().getAdTracker().trackAdRevenue(new AdRevenueData(str, AdMediatorName.INSTANCE.m200fromStringCJOXPJU(str2), AdFormat.INSTANCE.m183fromStringXxFlno4(str3), obj9 instanceof String ? (String) obj9 : null, str4, str5, lValueOf.longValue(), str6, AdRevenuePrecision.INSTANCE.m215fromStringQAIqrgA(str7), null));
    }

    public static final void trackCustomPaywallImpression(Map<String, ? extends Object> data) {
        AbstractC5504s.h(data, "data");
        Object obj = data.get("paywallId");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = data.get("offeringId");
        Purchases.INSTANCE.getSharedInstance().trackCustomPaywallImpression(new CustomPaywallImpressionParams(str, obj2 instanceof String ? (String) obj2 : null));
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.lang.Object validatePurchaseParams(java.util.Map<java.lang.String, ? extends java.lang.Object> r14) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.hybridcommon.CommonKt.validatePurchaseParams(java.util.Map):java.lang.Object");
    }

    public static final void warnLog(String message) {
        AbstractC5504s.h(message, "message");
        if (Purchases.INSTANCE.getLogLevel().compareTo(LogLevel.WARN) <= 0) {
            Log.w("PurchasesHybridCommon", message);
        }
    }

    public static final void configure(Context context, String apiKey, String str, String str2, PlatformInfo platformInfo) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(apiKey, "apiKey");
        AbstractC5504s.h(platformInfo, "platformInfo");
        configure$default(context, apiKey, str, str2, platformInfo, null, null, null, null, null, null, null, null, 8160, null);
    }

    public static final void purchasePackage(Activity activity, String packageIdentifier, Map<String, ? extends Object> presentedOfferingContext, String str, Integer num, Boolean bool, OnResult onResult, List<? extends Map<String, ? extends Object>> list) {
        AbstractC5504s.h(packageIdentifier, "packageIdentifier");
        AbstractC5504s.h(presentedOfferingContext, "presentedOfferingContext");
        AbstractC5504s.h(onResult, "onResult");
        purchasePackage$default(activity, packageIdentifier, presentedOfferingContext, str, num, bool, onResult, list, null, null, 768, null);
    }

    public static final void purchaseProduct(Activity activity, String productIdentifier, String type, String str, String str2, Integer num, Boolean bool, Map<String, ? extends Object> map, OnResult onResult, List<? extends Map<String, ? extends Object>> list) {
        AbstractC5504s.h(productIdentifier, "productIdentifier");
        AbstractC5504s.h(type, "type");
        AbstractC5504s.h(onResult, "onResult");
        purchaseProduct$default(activity, productIdentifier, type, str, str2, num, bool, map, onResult, list, null, null, 3072, null);
    }

    public static final void purchaseSubscriptionOption(Activity activity, String productIdentifier, String optionIdentifier, String str, Integer num, Boolean bool, Map<String, ? extends Object> map, OnResult onResult, List<? extends Map<String, ? extends Object>> list) {
        AbstractC5504s.h(productIdentifier, "productIdentifier");
        AbstractC5504s.h(optionIdentifier, "optionIdentifier");
        AbstractC5504s.h(onResult, "onResult");
        purchaseSubscriptionOption$default(activity, productIdentifier, optionIdentifier, str, num, bool, map, onResult, list, null, null, 1536, null);
    }

    public static final void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> list) {
        if (activity == null) {
            errorLog("showInAppMessages called with null activity");
        } else if (list == null) {
            Purchases.showInAppMessagesIfNeeded$default(Purchases.INSTANCE.getSharedInstance(), activity, null, 2, null);
        } else {
            Purchases.INSTANCE.getSharedInstance().showInAppMessagesIfNeeded(activity, list);
        }
    }

    public static final void syncPurchases(OnResult onResult) {
        AbstractC5504s.h(onResult, "onResult");
        ListenerConversionsKt.syncPurchasesWith(Purchases.INSTANCE.getSharedInstance(), new C41411(onResult), new C41422(onResult));
    }

    public static final void configure(Context context, String apiKey, String str, String str2, PlatformInfo platformInfo, Store store) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(apiKey, "apiKey");
        AbstractC5504s.h(platformInfo, "platformInfo");
        AbstractC5504s.h(store, "store");
        configure$default(context, apiKey, str, str2, platformInfo, store, null, null, null, null, null, null, null, 8128, null);
    }

    public static final void purchasePackage(Activity activity, String packageIdentifier, Map<String, ? extends Object> presentedOfferingContext, String str, Integer num, Boolean bool, OnResult onResult, List<? extends Map<String, ? extends Object>> list, List<? extends Map<String, ? extends Object>> list2) {
        AbstractC5504s.h(packageIdentifier, "packageIdentifier");
        AbstractC5504s.h(presentedOfferingContext, "presentedOfferingContext");
        AbstractC5504s.h(onResult, "onResult");
        purchasePackage$default(activity, packageIdentifier, presentedOfferingContext, str, num, bool, onResult, list, list2, null, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, null);
    }

    public static final void purchaseProduct(Activity activity, String productIdentifier, String type, String str, String str2, Integer num, Boolean bool, Map<String, ? extends Object> map, OnResult onResult, List<? extends Map<String, ? extends Object>> list, List<? extends Map<String, ? extends Object>> list2) {
        AbstractC5504s.h(productIdentifier, "productIdentifier");
        AbstractC5504s.h(type, "type");
        AbstractC5504s.h(onResult, "onResult");
        purchaseProduct$default(activity, productIdentifier, type, str, str2, num, bool, map, onResult, list, list2, null, 2048, null);
    }

    public static final void purchaseSubscriptionOption(Activity activity, String productIdentifier, String optionIdentifier, String str, Integer num, Boolean bool, Map<String, ? extends Object> map, OnResult onResult, List<? extends Map<String, ? extends Object>> list, List<? extends Map<String, ? extends Object>> list2) {
        AbstractC5504s.h(productIdentifier, "productIdentifier");
        AbstractC5504s.h(optionIdentifier, "optionIdentifier");
        AbstractC5504s.h(onResult, "onResult");
        purchaseSubscriptionOption$default(activity, productIdentifier, optionIdentifier, str, num, bool, map, onResult, list, list2, null, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, null);
    }

    public static final void configure(Context context, String apiKey, String str, String str2, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(apiKey, "apiKey");
        AbstractC5504s.h(platformInfo, "platformInfo");
        AbstractC5504s.h(store, "store");
        AbstractC5504s.h(dangerousSettings, "dangerousSettings");
        configure$default(context, apiKey, str, str2, platformInfo, store, dangerousSettings, null, null, null, null, null, null, 8064, null);
    }

    public static final void purchasePackage(Activity activity, String packageIdentifier, Map<String, ? extends Object> presentedOfferingContext, String str, Integer num, Boolean bool, OnResult onResult, List<? extends Map<String, ? extends Object>> list, List<? extends Map<String, ? extends Object>> list2, List<? extends Map<String, ? extends Object>> list3) {
        AbstractC5504s.h(packageIdentifier, "packageIdentifier");
        AbstractC5504s.h(presentedOfferingContext, "presentedOfferingContext");
        AbstractC5504s.h(onResult, "onResult");
        try {
            GoogleReplacementMode googleReplacementMode = getGoogleReplacementMode(num);
            if (activity != null) {
                ListenerConversionsCommonKt.getOfferingsWith(Purchases.INSTANCE.getSharedInstance(), new C41301(onResult), new C41312(presentedOfferingContext, onResult, activity, str, googleReplacementMode, bool, list, list2, list3, packageIdentifier));
            } else {
                onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, "There is no current Activity"), null, 1, null));
            }
        } catch (InvalidReplacementModeException unused) {
            onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.UnknownError, "Invalid google replacement mode passed to purchasePackage."), null, 1, null));
        }
    }

    public static final void purchaseProduct(Activity activity, String productIdentifier, String type, String str, String str2, Integer num, Boolean bool, Map<String, ? extends Object> map, OnResult onResult, List<? extends Map<String, ? extends Object>> list, List<? extends Map<String, ? extends Object>> list2, List<? extends Map<String, ? extends Object>> list3) {
        AbstractC5504s.h(productIdentifier, "productIdentifier");
        AbstractC5504s.h(type, "type");
        AbstractC5504s.h(onResult, "onResult");
        try {
            GoogleReplacementMode googleReplacementMode = getGoogleReplacementMode(num);
            ProductType productTypeMapStringToProductType = mapStringToProductType(type);
            if (activity != null) {
                CommonKt$purchaseProduct$onReceiveStoreProducts$1 commonKt$purchaseProduct$onReceiveStoreProducts$1 = new CommonKt$purchaseProduct$onReceiveStoreProducts$1(productIdentifier, productTypeMapStringToProductType, str, activity, map, str2, googleReplacementMode, bool, list, list2, list3, onResult);
                ProductType productType = ProductType.SUBS;
                if (productTypeMapStringToProductType == productType) {
                    String str3 = (String) AbstractC2279u.m0(Df.r.N0(productIdentifier, new String[]{Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR}, false, 0, 6, null));
                    ListenerConversionsCommonKt.getProductsWith(Purchases.INSTANCE.getSharedInstance(), AbstractC2279u.I0(AbstractC2279u.e(str3), addOnProductIdsToFetch(list, list2)), productType, new C41321(onResult), commonKt$purchaseProduct$onReceiveStoreProducts$1);
                    return;
                }
                ListenerConversionsCommonKt.getProductsWith(Purchases.INSTANCE.getSharedInstance(), AbstractC2279u.e(productIdentifier), ProductType.INAPP, new C41332(onResult), commonKt$purchaseProduct$onReceiveStoreProducts$1);
                return;
            }
            onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, "There is no current Activity"), null, 1, null));
        } catch (InvalidReplacementModeException unused) {
            onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.UnknownError, "Invalid google replacement mode passed to purchaseProduct."), null, 1, null));
        }
    }

    public static final void purchaseSubscriptionOption(Activity activity, String productIdentifier, String optionIdentifier, String str, Integer num, Boolean bool, Map<String, ? extends Object> map, OnResult onResult, List<? extends Map<String, ? extends Object>> list, List<? extends Map<String, ? extends Object>> list2, List<? extends Map<String, ? extends Object>> list3) {
        AbstractC5504s.h(productIdentifier, "productIdentifier");
        AbstractC5504s.h(optionIdentifier, "optionIdentifier");
        AbstractC5504s.h(onResult, "onResult");
        Purchases.Companion companion = Purchases.INSTANCE;
        if (companion.getSharedInstance().getStore() != Store.PLAY_STORE) {
            onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.UnknownError, "purchaseSubscriptionOption() is only supported on the Play Store."), null, 1, null));
            return;
        }
        try {
            GoogleReplacementMode googleReplacementMode = getGoogleReplacementMode(num);
            if (activity != null) {
                CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1 commonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1 = new CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1(productIdentifier, optionIdentifier, activity, map, str, bool, list, list2, list3, onResult, googleReplacementMode);
                ListenerConversionsCommonKt.getProductsWith(companion.getSharedInstance(), AbstractC2279u.I0(AbstractC2279u.e(productIdentifier), addOnProductIdsToFetch(list, list2)), ProductType.SUBS, new C41341(onResult), commonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1);
                return;
            }
            onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, "There is no current Activity"), null, 1, null));
        } catch (InvalidReplacementModeException unused) {
            onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.UnknownError, "Invalid google replacement mode passed to purchaseSubscriptionOption."), null, 1, null));
        }
    }

    public static final void configure(Context context, String apiKey, String str, String str2, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(apiKey, "apiKey");
        AbstractC5504s.h(platformInfo, "platformInfo");
        AbstractC5504s.h(store, "store");
        AbstractC5504s.h(dangerousSettings, "dangerousSettings");
        configure$default(context, apiKey, str, str2, platformInfo, store, dangerousSettings, bool, null, null, null, null, null, 7936, null);
    }

    public static final void configure(Context context, String apiKey, String str, String str2, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool, String str3) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(apiKey, "apiKey");
        AbstractC5504s.h(platformInfo, "platformInfo");
        AbstractC5504s.h(store, "store");
        AbstractC5504s.h(dangerousSettings, "dangerousSettings");
        configure$default(context, apiKey, str, str2, platformInfo, store, dangerousSettings, bool, str3, null, null, null, null, 7680, null);
    }

    public static final void configure(Context context, String apiKey, String str, String str2, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool, String str3, Boolean bool2) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(apiKey, "apiKey");
        AbstractC5504s.h(platformInfo, "platformInfo");
        AbstractC5504s.h(store, "store");
        AbstractC5504s.h(dangerousSettings, "dangerousSettings");
        configure$default(context, apiKey, str, str2, platformInfo, store, dangerousSettings, bool, str3, bool2, null, null, null, 7168, null);
    }

    public static final void configure(Context context, String apiKey, String str, String str2, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool, String str3, Boolean bool2, Boolean bool3) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(apiKey, "apiKey");
        AbstractC5504s.h(platformInfo, "platformInfo");
        AbstractC5504s.h(store, "store");
        AbstractC5504s.h(dangerousSettings, "dangerousSettings");
        configure$default(context, apiKey, str, str2, platformInfo, store, dangerousSettings, bool, str3, bool2, bool3, null, null, 6144, null);
    }

    public static final void configure(Context context, String apiKey, String str, String str2, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool, String str3, Boolean bool2, Boolean bool3, Boolean bool4) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(apiKey, "apiKey");
        AbstractC5504s.h(platformInfo, "platformInfo");
        AbstractC5504s.h(store, "store");
        AbstractC5504s.h(dangerousSettings, "dangerousSettings");
        configure$default(context, apiKey, str, str2, platformInfo, store, dangerousSettings, bool, str3, bool2, bool3, bool4, null, 4096, null);
    }

    public static final void configure(Context context, String apiKey, String str, String str2, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool, String str3, Boolean bool2, Boolean bool3, Boolean bool4, String str4) {
        PurchasesAreCompletedBy purchasesAreCompletedBy;
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(apiKey, "apiKey");
        AbstractC5504s.h(platformInfo, "platformInfo");
        AbstractC5504s.h(store, "store");
        AbstractC5504s.h(dangerousSettings, "dangerousSettings");
        Purchases.INSTANCE.setPlatformInfo(platformInfo);
        PurchasesConfiguration.Builder builderDangerousSettings = new PurchasesConfiguration.Builder(context, apiKey).appUserID(str).store(store).dangerousSettings(dangerousSettings);
        if (str2 != null && (purchasesAreCompletedBy = toPurchasesAreCompletedBy(str2)) != null) {
            builderDangerousSettings.purchasesAreCompletedBy(purchasesAreCompletedBy);
        }
        if (bool != null) {
            builderDangerousSettings.showInAppMessagesAutomatically(bool.booleanValue());
        }
        if (str3 != null) {
            try {
                builderDangerousSettings.entitlementVerificationMode(EntitlementVerificationMode.valueOf(str3));
            } catch (IllegalArgumentException unused) {
                warnLog("Attempted to configure with unknown verification mode: " + str3 + com.amazon.a.a.o.c.a.b.f34706a);
                L l10 = L.f17438a;
            }
        }
        if (bool2 != null) {
            builderDangerousSettings.pendingTransactionsForPrepaidPlansEnabled(bool2.booleanValue());
        }
        if (bool3 != null) {
            builderDangerousSettings.diagnosticsEnabled(bool3.booleanValue());
        }
        if (bool4 != null) {
            builderDangerousSettings.automaticDeviceIdentifierCollectionEnabled(bool4.booleanValue());
        }
        if (str4 != null) {
            builderDangerousSettings.preferredUILocaleOverride(str4);
        }
        Purchases.INSTANCE.configure(builderDangerousSettings.build());
    }
}
