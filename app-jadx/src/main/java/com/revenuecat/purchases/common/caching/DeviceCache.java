package com.revenuecat.purchases.common.caching;

import Df.r;
import Rf.j;
import Td.AbstractC2163n;
import Ud.AbstractC2279u;
import Ud.S;
import Ud.a0;
import Wf.AbstractC2358b;
import android.content.SharedPreferences;
import app.notifee.core.event.LogEvent;
import com.amazon.a.a.o.c.a.b;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.CustomerInfoOriginalSource;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.CustomerInfoFactory;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.interfaces.StorefrontProvider;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrenciesFactory;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\"\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\bM\b\u0017\u0018\u0000 Ó\u00012\u00020\u0001:\u0002Ó\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u001b\u0010\u000f\u001a\u00020\n*\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0013J\u001b\u0010\u001b\u001a\u00020\n*\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u0010J\u001b\u0010\u001c\u001a\u00020\n*\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u0010J\u001b\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b!\u0010 J#\u0010#\u001a\u00020\u00142\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b%\u0010&J\u0011\u0010'\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010+\u001a\u00020\nH\u0000¢\u0006\u0004\b)\u0010*J\u0011\u0010.\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b,\u0010-J\u0011\u00100\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b/\u0010-J\u0017\u00102\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0004H\u0000¢\u0006\u0004\b1\u0010\u0016J\u001f\u00102\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u00103\u001a\u00020\nH\u0000¢\u0006\u0004\b1\u00104J\u0017\u00106\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0004H\u0000¢\u0006\u0004\b5\u0010\u0016J\u0017\u00109\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0001¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0001¢\u0006\u0004\b:\u00108J\u0019\u0010?\u001a\u0004\u0018\u00010<2\u0006\u0010\u000e\u001a\u00020\u0004H\u0000¢\u0006\u0004\b=\u0010>J\u001f\u0010C\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010@\u001a\u00020<H\u0000¢\u0006\u0004\bA\u0010BJ\u001f\u0010H\u001a\u00020D2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010E\u001a\u00020DH\u0000¢\u0006\u0004\bF\u0010GJ\u0017\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0004H\u0000¢\u0006\u0004\bI\u0010\u0016J\u0017\u0010K\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0004H\u0000¢\u0006\u0004\bJ\u0010\u0016J\u001f\u0010K\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\nH\u0000¢\u0006\u0004\bJ\u0010MJ\u0017\u0010O\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0004H\u0000¢\u0006\u0004\bN\u0010\u0016J\u001f\u0010Q\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0011H\u0001¢\u0006\u0004\bP\u0010\u0019J\u0017\u0010T\u001a\u00020\u00142\u0006\u0010R\u001a\u00020\u0004H\u0000¢\u0006\u0004\bS\u0010\u0016J\u0011\u0010U\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\bU\u0010-J\u0017\u0010W\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0001¢\u0006\u0004\bV\u00108J\u0017\u0010Y\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0001¢\u0006\u0004\bX\u00108J\u0019\u0010]\u001a\u0004\u0018\u00010Z2\u0006\u0010\u000e\u001a\u00020\u0004H\u0000¢\u0006\u0004\b[\u0010\\J\u001f\u0010a\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010^\u001a\u00020ZH\u0000¢\u0006\u0004\b_\u0010`J\u001f\u0010c\u001a\u00020D2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010E\u001a\u00020DH\u0000¢\u0006\u0004\bb\u0010GJ\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0004H\u0000¢\u0006\u0004\bd\u0010\u0016J\u001f\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\nH\u0000¢\u0006\u0004\bd\u0010MJ\u000f\u0010g\u001a\u00020\u0014H\u0000¢\u0006\u0004\be\u0010fJ\u0015\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00040hH\u0000¢\u0006\u0004\bi\u0010jJ#\u0010n\u001a\u00020\u00142\u0006\u0010l\u001a\u00020\u00042\n\b\u0002\u0010m\u001a\u0004\u0018\u00010DH\u0007¢\u0006\u0004\bn\u0010oJ\u001d\u0010s\u001a\u00020\u00142\f\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00040hH\u0000¢\u0006\u0004\bq\u0010rJ)\u0010x\u001a\b\u0012\u0004\u0012\u00020t0u2\u0012\u0010p\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020t0\u001dH\u0000¢\u0006\u0004\bv\u0010wJ)\u0010z\u001a\b\u0012\u0004\u0012\u00020t0u2\u0012\u0010p\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020t0\u001dH\u0000¢\u0006\u0004\by\u0010wJ#\u0010|\u001a\u00020\u00142\u0012\u0010p\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020t0\u001dH\u0000¢\u0006\u0004\b{\u0010$J\u0012\u0010\u0080\u0001\u001a\u0004\u0018\u00010}H\u0000¢\u0006\u0004\b~\u0010\u007fJ\u001b\u0010\u0084\u0001\u001a\u00020\u00142\u0007\u0010\u0081\u0001\u001a\u00020}H\u0000¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0011\u0010\u0086\u0001\u001a\u00020\u0014H\u0000¢\u0006\u0005\b\u0085\u0001\u0010fJ\u001c\u0010\u008b\u0001\u001a\u00020\u00142\b\u0010\u0088\u0001\u001a\u00030\u0087\u0001H\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0011\u0010\u008d\u0001\u001a\u00020\u0014H\u0001¢\u0006\u0005\b\u008c\u0001\u0010fJ\u0012\u0010\u0090\u0001\u001a\u00020DH\u0000¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0015\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0087\u0001H\u0000¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u001d\u0010\u0097\u0001\u001a\u0004\u0018\u00010}2\u0007\u0010\u0094\u0001\u001a\u00020\u0004H\u0010¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J$\u0010\u009c\u0001\u001a\u00020\u00142\u0007\u0010\u0098\u0001\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u0004H\u0010¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u001a\u0010\u009e\u0001\u001a\u00020\u00142\u0007\u0010\u0098\u0001\u001a\u00020\u0004H\u0000¢\u0006\u0005\b\u009d\u0001\u0010\u0016J!\u0010¡\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040h2\u0007\u0010\u0098\u0001\u001a\u00020\u0004H\u0000¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u001a\u0010£\u0001\u001a\u00020\u00042\u0007\u0010\u0094\u0001\u001a\u00020\u0004H\u0000¢\u0006\u0005\b¢\u0001\u00108R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010¤\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010¥\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010¦\u0001R\u001f\u0010ª\u0001\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0005\b©\u0001\u0010-R&\u0010®\u0001\u001a\u00020\u00048@X\u0081\u0084\u0002¢\u0006\u0016\n\u0006\b«\u0001\u0010¨\u0001\u0012\u0005\b\u00ad\u0001\u0010f\u001a\u0005\b¬\u0001\u0010-R&\u0010²\u0001\u001a\u00020\u00048@X\u0081\u0084\u0002¢\u0006\u0016\n\u0006\b¯\u0001\u0010¨\u0001\u0012\u0005\b±\u0001\u0010f\u001a\u0005\b°\u0001\u0010-R\u001e\u0010³\u0001\u001a\u00020\u00048\u0000X\u0080D¢\u0006\u000f\n\u0006\b³\u0001\u0010¥\u0001\u001a\u0005\b´\u0001\u0010-R\u001f\u0010·\u0001\u001a\u00020\u00048@X\u0080\u0084\u0002¢\u0006\u000f\n\u0006\bµ\u0001\u0010¨\u0001\u001a\u0005\b¶\u0001\u0010-R\u001f\u0010º\u0001\u001a\u00020\u00048@X\u0080\u0084\u0002¢\u0006\u000f\n\u0006\b¸\u0001\u0010¨\u0001\u001a\u0005\b¹\u0001\u0010-R'\u0010»\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R&\u0010À\u0001\u001a\u00020\u00048@X\u0081\u0084\u0002¢\u0006\u0016\n\u0006\b½\u0001\u0010¨\u0001\u0012\u0005\b¿\u0001\u0010f\u001a\u0005\b¾\u0001\u0010-R\u001f\u0010Ã\u0001\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÁ\u0001\u0010¨\u0001\u001a\u0005\bÂ\u0001\u0010-R\u001f\u0010Æ\u0001\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÄ\u0001\u0010¨\u0001\u001a\u0005\bÅ\u0001\u0010-R\u001f\u0010É\u0001\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÇ\u0001\u0010¨\u0001\u001a\u0005\bÈ\u0001\u0010-R\u001f\u0010Ì\u0001\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÊ\u0001\u0010¨\u0001\u001a\u0005\bË\u0001\u0010-R\u001f\u0010Ï\u0001\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÍ\u0001\u0010¨\u0001\u001a\u0005\bÎ\u0001\u0010-R\u001f\u0010Ò\u0001\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÐ\u0001\u0010¨\u0001\u001a\u0005\bÑ\u0001\u0010-¨\u0006Ô\u0001"}, d2 = {"Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/interfaces/StorefrontProvider;", "Landroid/content/SharedPreferences;", "preferences", "", "apiKey", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "<init>", "(Landroid/content/SharedPreferences;Ljava/lang/String;Lcom/revenuecat/purchases/common/DateProvider;)V", "Landroid/content/SharedPreferences$Editor;", "clearCustomerInfo", "(Landroid/content/SharedPreferences$Editor;)Landroid/content/SharedPreferences$Editor;", "clearAppUserID", "appUserID", "clearCustomerInfoCacheTimestamp", "(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;", "Ljava/util/Date;", "getCustomerInfoCachesLastUpdated", "(Ljava/lang/String;)Ljava/util/Date;", "LTd/L;", "setVirtualCurrenciesCacheTimestampToNow", "(Ljava/lang/String;)V", "date", "setVirtualCurrenciesCacheTimestamp", "(Ljava/lang/String;Ljava/util/Date;)V", "getVirtualCurrenciesCacheLastUpdated", "clearVirtualCurrenciesCacheTimestamp", "clearVirtualCurrenciesCache", "", "Lcom/revenuecat/purchases/common/caching/TokenCacheEntry;", "getTokenMap", "()Ljava/util/Map;", "loadTokenMapFromPreferences", "tokenMap", "saveTokenMap", "(Ljava/util/Map;)V", "setProductEntitlementMappingCacheTimestamp", "(Ljava/util/Date;)V", "getProductEntitlementMappingLastUpdated", "()Ljava/util/Date;", "startEditing$purchases_defaultsBc8Release", "()Landroid/content/SharedPreferences$Editor;", "startEditing", "getLegacyCachedAppUserID$purchases_defaultsBc8Release", "()Ljava/lang/String;", "getLegacyCachedAppUserID", "getCachedAppUserID$purchases_defaultsBc8Release", "getCachedAppUserID", "cacheAppUserID$purchases_defaultsBc8Release", "cacheAppUserID", "cacheEditor", "(Ljava/lang/String;Landroid/content/SharedPreferences$Editor;)Landroid/content/SharedPreferences$Editor;", "clearCachesForAppUserID$purchases_defaultsBc8Release", "clearCachesForAppUserID", "customerInfoCacheKey$purchases_defaultsBc8Release", "(Ljava/lang/String;)Ljava/lang/String;", "customerInfoCacheKey", "customerInfoLastUpdatedCacheKey$purchases_defaultsBc8Release", "customerInfoLastUpdatedCacheKey", "Lcom/revenuecat/purchases/CustomerInfo;", "getCachedCustomerInfo$purchases_defaultsBc8Release", "(Ljava/lang/String;)Lcom/revenuecat/purchases/CustomerInfo;", "getCachedCustomerInfo", LogEvent.LEVEL_INFO, "cacheCustomerInfo$purchases_defaultsBc8Release", "(Ljava/lang/String;Lcom/revenuecat/purchases/CustomerInfo;)V", "cacheCustomerInfo", "", "appInBackground", "isCustomerInfoCacheStale$purchases_defaultsBc8Release", "(Ljava/lang/String;Z)Z", "isCustomerInfoCacheStale", "clearCustomerInfoCacheTimestamp$purchases_defaultsBc8Release", "clearCustomerInfoCache$purchases_defaultsBc8Release", "clearCustomerInfoCache", "editor", "(Ljava/lang/String;Landroid/content/SharedPreferences$Editor;)V", "setCustomerInfoCacheTimestampToNow$purchases_defaultsBc8Release", "setCustomerInfoCacheTimestampToNow", "setCustomerInfoCacheTimestamp$purchases_defaultsBc8Release", "setCustomerInfoCacheTimestamp", "countryCode", "setStorefront$purchases_defaultsBc8Release", "setStorefront", "getStorefront", "virtualCurrenciesCacheKey$purchases_defaultsBc8Release", "virtualCurrenciesCacheKey", "virtualCurrenciesLastUpdatedCacheKey$purchases_defaultsBc8Release", "virtualCurrenciesLastUpdatedCacheKey", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "getCachedVirtualCurrencies$purchases_defaultsBc8Release", "(Ljava/lang/String;)Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "getCachedVirtualCurrencies", "virtualCurrencies", "cacheVirtualCurrencies$purchases_defaultsBc8Release", "(Ljava/lang/String;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;)V", "cacheVirtualCurrencies", "isVirtualCurrenciesCacheStale$purchases_defaultsBc8Release", "isVirtualCurrenciesCacheStale", "clearVirtualCurrenciesCache$purchases_defaultsBc8Release", "cleanupOldAttributionData$purchases_defaultsBc8Release", "()V", "cleanupOldAttributionData", "", "getPreviouslySentHashedTokens$purchases_defaultsBc8Release", "()Ljava/util/Set;", "getPreviouslySentHashedTokens", "token", "isAutoRenewing", "addSuccessfullyPostedToken", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "hashedTokens", "cleanPreviouslySentTokens$purchases_defaultsBc8Release", "(Ljava/util/Set;)V", "cleanPreviouslySentTokens", "Lcom/revenuecat/purchases/models/StoreTransaction;", "", "getActivePurchasesNotInCache$purchases_defaultsBc8Release", "(Ljava/util/Map;)Ljava/util/List;", "getActivePurchasesNotInCache", "getPurchasesWithAutoRenewingChange$purchases_defaultsBc8Release", "getPurchasesWithAutoRenewingChange", "saveAutoRenewingStatus$purchases_defaultsBc8Release", "saveAutoRenewingStatus", "Lorg/json/JSONObject;", "getOfferingsResponseCache$purchases_defaultsBc8Release", "()Lorg/json/JSONObject;", "getOfferingsResponseCache", "offeringsResponse", "cacheOfferingsResponse$purchases_defaultsBc8Release", "(Lorg/json/JSONObject;)V", "cacheOfferingsResponse", "clearOfferingsResponseCache$purchases_defaultsBc8Release", "clearOfferingsResponseCache", "Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "productEntitlementMapping", "cacheProductEntitlementMapping$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;)V", "cacheProductEntitlementMapping", "setProductEntitlementMappingCacheTimestampToNow$purchases_defaultsBc8Release", "setProductEntitlementMappingCacheTimestampToNow", "isProductEntitlementMappingCacheStale$purchases_defaultsBc8Release", "()Z", "isProductEntitlementMappingCacheStale", "getProductEntitlementMapping$purchases_defaultsBc8Release", "()Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "getProductEntitlementMapping", SubscriberAttributeKt.JSON_NAME_KEY, "getJSONObjectOrNull$purchases_defaultsBc8Release", "(Ljava/lang/String;)Lorg/json/JSONObject;", "getJSONObjectOrNull", "cacheKey", "value", "putString$purchases_defaultsBc8Release", "(Ljava/lang/String;Ljava/lang/String;)V", "putString", "remove$purchases_defaultsBc8Release", "remove", "findKeysThatStartWith$purchases_defaultsBc8Release", "(Ljava/lang/String;)Ljava/util/Set;", "findKeysThatStartWith", "newKey$purchases_defaultsBc8Release", "newKey", "Landroid/content/SharedPreferences;", "Ljava/lang/String;", "Lcom/revenuecat/purchases/common/DateProvider;", "apiKeyPrefix$delegate", "Lkotlin/Lazy;", "getApiKeyPrefix", "apiKeyPrefix", "legacyAppUserIDCacheKey$delegate", "getLegacyAppUserIDCacheKey$purchases_defaultsBc8Release", "getLegacyAppUserIDCacheKey$purchases_defaultsBc8Release$annotations", "legacyAppUserIDCacheKey", "appUserIDCacheKey$delegate", "getAppUserIDCacheKey$purchases_defaultsBc8Release", "getAppUserIDCacheKey$purchases_defaultsBc8Release$annotations", "appUserIDCacheKey", "attributionCacheKey", "getAttributionCacheKey$purchases_defaultsBc8Release", "legacyTokensCacheKey$delegate", "getLegacyTokensCacheKey$purchases_defaultsBc8Release", "legacyTokensCacheKey", "tokensCacheKey$delegate", "getTokensCacheKey$purchases_defaultsBc8Release", "tokensCacheKey", "tokenMapCache", "Ljava/util/Map;", "storefrontCacheKey$delegate", "getStorefrontCacheKey$purchases_defaultsBc8Release", "getStorefrontCacheKey$purchases_defaultsBc8Release$annotations", "storefrontCacheKey", "productEntitlementMappingCacheKey$delegate", "getProductEntitlementMappingCacheKey", "productEntitlementMappingCacheKey", "productEntitlementMappingLastUpdatedCacheKey$delegate", "getProductEntitlementMappingLastUpdatedCacheKey", "productEntitlementMappingLastUpdatedCacheKey", "customerInfoCachesLastUpdatedCacheBaseKey$delegate", "getCustomerInfoCachesLastUpdatedCacheBaseKey", "customerInfoCachesLastUpdatedCacheBaseKey", "virtualCurrenciesCacheBaseKey$delegate", "getVirtualCurrenciesCacheBaseKey", "virtualCurrenciesCacheBaseKey", "virtualCurrenciesLastUpdatedCacheBaseKey$delegate", "getVirtualCurrenciesLastUpdatedCacheBaseKey", "virtualCurrenciesLastUpdatedCacheBaseKey", "offeringsResponseCacheKey$delegate", "getOfferingsResponseCacheKey", "offeringsResponseCacheKey", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DeviceCache implements StorefrontProvider {
    private static final String CUSTOMER_INFO_ORIGINAL_SOURCE_KEY = "customer_info_original_source";
    private static final String CUSTOMER_INFO_REQUEST_DATE_KEY = "customer_info_request_date";
    private static final String CUSTOMER_INFO_SCHEMA_VERSION_KEY = "schema_version";
    private static final String CUSTOMER_INFO_VERIFICATION_RESULT_KEY = "verification_result";
    private static final Companion Companion = new Companion(null);
    private final String apiKey;

    /* JADX INFO: renamed from: apiKeyPrefix$delegate, reason: from kotlin metadata */
    private final Lazy apiKeyPrefix;

    /* JADX INFO: renamed from: appUserIDCacheKey$delegate, reason: from kotlin metadata */
    private final Lazy appUserIDCacheKey;
    private final String attributionCacheKey;

    /* JADX INFO: renamed from: customerInfoCachesLastUpdatedCacheBaseKey$delegate, reason: from kotlin metadata */
    private final Lazy customerInfoCachesLastUpdatedCacheBaseKey;
    private final DateProvider dateProvider;

    /* JADX INFO: renamed from: legacyAppUserIDCacheKey$delegate, reason: from kotlin metadata */
    private final Lazy legacyAppUserIDCacheKey;

    /* JADX INFO: renamed from: legacyTokensCacheKey$delegate, reason: from kotlin metadata */
    private final Lazy legacyTokensCacheKey;

    /* JADX INFO: renamed from: offeringsResponseCacheKey$delegate, reason: from kotlin metadata */
    private final Lazy offeringsResponseCacheKey;
    private final SharedPreferences preferences;

    /* JADX INFO: renamed from: productEntitlementMappingCacheKey$delegate, reason: from kotlin metadata */
    private final Lazy productEntitlementMappingCacheKey;

    /* JADX INFO: renamed from: productEntitlementMappingLastUpdatedCacheKey$delegate, reason: from kotlin metadata */
    private final Lazy productEntitlementMappingLastUpdatedCacheKey;

    /* JADX INFO: renamed from: storefrontCacheKey$delegate, reason: from kotlin metadata */
    private final Lazy storefrontCacheKey;
    private Map<String, TokenCacheEntry> tokenMapCache;

    /* JADX INFO: renamed from: tokensCacheKey$delegate, reason: from kotlin metadata */
    private final Lazy tokensCacheKey;

    /* JADX INFO: renamed from: virtualCurrenciesCacheBaseKey$delegate, reason: from kotlin metadata */
    private final Lazy virtualCurrenciesCacheBaseKey;

    /* JADX INFO: renamed from: virtualCurrenciesLastUpdatedCacheBaseKey$delegate, reason: from kotlin metadata */
    private final Lazy virtualCurrenciesLastUpdatedCacheBaseKey;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/caching/DeviceCache$Companion;", "", "()V", "CUSTOMER_INFO_ORIGINAL_SOURCE_KEY", "", "CUSTOMER_INFO_REQUEST_DATE_KEY", "CUSTOMER_INFO_SCHEMA_VERSION_KEY", "CUSTOMER_INFO_VERIFICATION_RESULT_KEY", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DeviceCache(SharedPreferences preferences, String apiKey, DateProvider dateProvider) {
        AbstractC5504s.h(preferences, "preferences");
        AbstractC5504s.h(apiKey, "apiKey");
        AbstractC5504s.h(dateProvider, "dateProvider");
        this.preferences = preferences;
        this.apiKey = apiKey;
        this.dateProvider = dateProvider;
        this.apiKeyPrefix = AbstractC2163n.b(new DeviceCache$apiKeyPrefix$2(this));
        this.legacyAppUserIDCacheKey = AbstractC2163n.b(new DeviceCache$legacyAppUserIDCacheKey$2(this));
        this.appUserIDCacheKey = AbstractC2163n.b(new DeviceCache$appUserIDCacheKey$2(this));
        this.attributionCacheKey = "com.revenuecat.purchases..attribution";
        this.legacyTokensCacheKey = AbstractC2163n.b(new DeviceCache$legacyTokensCacheKey$2(this));
        this.tokensCacheKey = AbstractC2163n.b(new DeviceCache$tokensCacheKey$2(this));
        this.storefrontCacheKey = AbstractC2163n.b(DeviceCache$storefrontCacheKey$2.INSTANCE);
        this.productEntitlementMappingCacheKey = AbstractC2163n.b(new DeviceCache$productEntitlementMappingCacheKey$2(this));
        this.productEntitlementMappingLastUpdatedCacheKey = AbstractC2163n.b(new DeviceCache$productEntitlementMappingLastUpdatedCacheKey$2(this));
        this.customerInfoCachesLastUpdatedCacheBaseKey = AbstractC2163n.b(new DeviceCache$customerInfoCachesLastUpdatedCacheBaseKey$2(this));
        this.virtualCurrenciesCacheBaseKey = AbstractC2163n.b(new DeviceCache$virtualCurrenciesCacheBaseKey$2(this));
        this.virtualCurrenciesLastUpdatedCacheBaseKey = AbstractC2163n.b(new DeviceCache$virtualCurrenciesLastUpdatedCacheBaseKey$2(this));
        this.offeringsResponseCacheKey = AbstractC2163n.b(new DeviceCache$offeringsResponseCacheKey$2(this));
    }

    public static /* synthetic */ void addSuccessfullyPostedToken$default(DeviceCache deviceCache, String str, Boolean bool, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSuccessfullyPostedToken");
        }
        if ((i10 & 2) != 0) {
            bool = null;
        }
        deviceCache.addSuccessfullyPostedToken(str, bool);
    }

    private final SharedPreferences.Editor clearAppUserID(SharedPreferences.Editor editor) {
        editor.remove(getAppUserIDCacheKey$purchases_defaultsBc8Release());
        editor.remove(getLegacyAppUserIDCacheKey$purchases_defaultsBc8Release());
        return editor;
    }

    private final SharedPreferences.Editor clearCustomerInfo(SharedPreferences.Editor editor) {
        String cachedAppUserID$purchases_defaultsBc8Release = getCachedAppUserID$purchases_defaultsBc8Release();
        if (cachedAppUserID$purchases_defaultsBc8Release != null) {
            editor.remove(customerInfoCacheKey$purchases_defaultsBc8Release(cachedAppUserID$purchases_defaultsBc8Release));
        }
        String legacyCachedAppUserID$purchases_defaultsBc8Release = getLegacyCachedAppUserID$purchases_defaultsBc8Release();
        if (legacyCachedAppUserID$purchases_defaultsBc8Release != null) {
            editor.remove(customerInfoCacheKey$purchases_defaultsBc8Release(legacyCachedAppUserID$purchases_defaultsBc8Release));
        }
        return editor;
    }

    private final SharedPreferences.Editor clearCustomerInfoCacheTimestamp(SharedPreferences.Editor editor, String str) {
        editor.remove(customerInfoLastUpdatedCacheKey$purchases_defaultsBc8Release(str));
        return editor;
    }

    private final SharedPreferences.Editor clearVirtualCurrenciesCache(SharedPreferences.Editor editor, String str) {
        editor.remove(virtualCurrenciesCacheKey$purchases_defaultsBc8Release(str));
        String cachedAppUserID$purchases_defaultsBc8Release = getCachedAppUserID$purchases_defaultsBc8Release();
        if (cachedAppUserID$purchases_defaultsBc8Release != null) {
            editor.remove(virtualCurrenciesCacheKey$purchases_defaultsBc8Release(cachedAppUserID$purchases_defaultsBc8Release));
        }
        String legacyCachedAppUserID$purchases_defaultsBc8Release = getLegacyCachedAppUserID$purchases_defaultsBc8Release();
        if (legacyCachedAppUserID$purchases_defaultsBc8Release != null) {
            editor.remove(virtualCurrenciesCacheKey$purchases_defaultsBc8Release(legacyCachedAppUserID$purchases_defaultsBc8Release));
        }
        return editor;
    }

    private final SharedPreferences.Editor clearVirtualCurrenciesCacheTimestamp(SharedPreferences.Editor editor, String str) {
        editor.remove(virtualCurrenciesLastUpdatedCacheKey$purchases_defaultsBc8Release(str));
        String cachedAppUserID$purchases_defaultsBc8Release = getCachedAppUserID$purchases_defaultsBc8Release();
        if (cachedAppUserID$purchases_defaultsBc8Release != null) {
            editor.remove(virtualCurrenciesLastUpdatedCacheKey$purchases_defaultsBc8Release(cachedAppUserID$purchases_defaultsBc8Release));
        }
        String legacyCachedAppUserID$purchases_defaultsBc8Release = getLegacyCachedAppUserID$purchases_defaultsBc8Release();
        if (legacyCachedAppUserID$purchases_defaultsBc8Release != null) {
            editor.remove(virtualCurrenciesLastUpdatedCacheKey$purchases_defaultsBc8Release(legacyCachedAppUserID$purchases_defaultsBc8Release));
        }
        return editor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getApiKeyPrefix() {
        return (String) this.apiKeyPrefix.getValue();
    }

    private final synchronized Date getCustomerInfoCachesLastUpdated(String appUserID) {
        return new Date(this.preferences.getLong(customerInfoLastUpdatedCacheKey$purchases_defaultsBc8Release(appUserID), 0L));
    }

    private final String getCustomerInfoCachesLastUpdatedCacheBaseKey() {
        return (String) this.customerInfoCachesLastUpdatedCacheBaseKey.getValue();
    }

    private final String getOfferingsResponseCacheKey() {
        return (String) this.offeringsResponseCacheKey.getValue();
    }

    private final String getProductEntitlementMappingCacheKey() {
        return (String) this.productEntitlementMappingCacheKey.getValue();
    }

    private final Date getProductEntitlementMappingLastUpdated() {
        if (this.preferences.contains(getProductEntitlementMappingLastUpdatedCacheKey())) {
            return new Date(this.preferences.getLong(getProductEntitlementMappingLastUpdatedCacheKey(), -1L));
        }
        return null;
    }

    private final String getProductEntitlementMappingLastUpdatedCacheKey() {
        return (String) this.productEntitlementMappingLastUpdatedCacheKey.getValue();
    }

    private final synchronized Map<String, TokenCacheEntry> getTokenMap() {
        Map<String, TokenCacheEntry> map = this.tokenMapCache;
        if (map != null) {
            return map;
        }
        Map<String, TokenCacheEntry> mapLoadTokenMapFromPreferences = loadTokenMapFromPreferences();
        this.tokenMapCache = mapLoadTokenMapFromPreferences;
        return mapLoadTokenMapFromPreferences;
    }

    private final String getVirtualCurrenciesCacheBaseKey() {
        return (String) this.virtualCurrenciesCacheBaseKey.getValue();
    }

    private final synchronized Date getVirtualCurrenciesCacheLastUpdated(String appUserID) {
        return new Date(this.preferences.getLong(virtualCurrenciesLastUpdatedCacheKey$purchases_defaultsBc8Release(appUserID), 0L));
    }

    private final String getVirtualCurrenciesLastUpdatedCacheBaseKey() {
        return (String) this.virtualCurrenciesLastUpdatedCacheBaseKey.getValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final Map<String, TokenCacheEntry> loadTokenMapFromPreferences() {
        LogHandler currentLogHandler;
        String str;
        String str2;
        String string = this.preferences.getString(getTokensCacheKey$purchases_defaultsBc8Release(), null);
        if (string != null) {
            try {
                return (Map) AbstractC2358b.f20895d.d(DeviceCacheKt.tokenMapSerializer, string);
            } catch (j unused) {
                return S.i();
            } catch (IllegalArgumentException unused2) {
                return S.i();
            }
        }
        try {
            Set<String> stringSet = this.preferences.getStringSet(getLegacyTokensCacheKey$purchases_defaultsBc8Release(), null);
            Set setF1 = stringSet != null ? AbstractC2279u.f1(stringSet) : null;
            if (setF1 == null) {
                return S.i();
            }
            Set set = setF1;
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5874j.e(S.e(AbstractC2279u.x(set, 10)), 16));
            for (Object obj : set) {
                linkedHashMap.put(obj, new TokenCacheEntry((Boolean) null, 1, (DefaultConstructorMarker) null));
            }
            saveTokenMap(linkedHashMap);
            this.preferences.edit().remove(getLegacyTokensCacheKey$purchases_defaultsBc8Release()).apply();
            LogIntent logIntent = LogIntent.DEBUG;
            DeviceCache$loadTokenMapFromPreferences$$inlined$log$1 deviceCache$loadTokenMapFromPreferences$$inlined$log$1 = new DeviceCache$loadTokenMapFromPreferences$$inlined$log$1(logIntent, linkedHashMap);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke());
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke(), null);
                    break;
            }
            return linkedHashMap;
        } catch (ClassCastException unused3) {
            return S.i();
        }
    }

    private final synchronized void saveTokenMap(Map<String, TokenCacheEntry> tokenMap) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        try {
            LogIntent logIntent = LogIntent.DEBUG;
            DeviceCache$saveTokenMap$$inlined$log$1 deviceCache$saveTokenMap$$inlined$log$1 = new DeviceCache$saveTokenMap$$inlined$log$1(logIntent, tokenMap);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) deviceCache$saveTokenMap$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$saveTokenMap$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) deviceCache$saveTokenMap$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) deviceCache$saveTokenMap$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) deviceCache$saveTokenMap$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$saveTokenMap$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) deviceCache$saveTokenMap$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) deviceCache$saveTokenMap$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) deviceCache$saveTokenMap$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) deviceCache$saveTokenMap$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) deviceCache$saveTokenMap$$inlined$log$1.invoke());
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$saveTokenMap$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) deviceCache$saveTokenMap$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$saveTokenMap$$inlined$log$1.invoke(), null);
                    break;
            }
            putString$purchases_defaultsBc8Release(getTokensCacheKey$purchases_defaultsBc8Release(), AbstractC2358b.f20895d.b(DeviceCacheKt.tokenMapSerializer, tokenMap));
            this.tokenMapCache = tokenMap;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final void setProductEntitlementMappingCacheTimestamp(Date date) {
        this.preferences.edit().putLong(getProductEntitlementMappingLastUpdatedCacheKey(), date.getTime()).apply();
    }

    private final synchronized void setVirtualCurrenciesCacheTimestamp(String appUserID, Date date) {
        this.preferences.edit().putLong(virtualCurrenciesLastUpdatedCacheKey$purchases_defaultsBc8Release(appUserID), date.getTime()).apply();
    }

    private final synchronized void setVirtualCurrenciesCacheTimestampToNow(String appUserID) {
        setVirtualCurrenciesCacheTimestamp(appUserID, this.dateProvider.getNow());
    }

    public final synchronized void addSuccessfullyPostedToken(String token, Boolean isAutoRenewing) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        try {
            AbstractC5504s.h(token, "token");
            String strSha1 = UtilsKt.sha1(token);
            LogIntent logIntent = LogIntent.DEBUG;
            DeviceCache$addSuccessfullyPostedToken$$inlined$log$1 deviceCache$addSuccessfullyPostedToken$$inlined$log$1 = new DeviceCache$addSuccessfullyPostedToken$$inlined$log$1(logIntent, token, strSha1);
            int[] iArr = LogWrapperKt.WhenMappings.$EnumSwitchMapping$0;
            switch (iArr[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke());
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke(), null);
                    break;
            }
            Map<String, TokenCacheEntry> mapB = S.B(getTokenMap());
            DeviceCache$addSuccessfullyPostedToken$$inlined$log$2 deviceCache$addSuccessfullyPostedToken$$inlined$log$2 = new DeviceCache$addSuccessfullyPostedToken$$inlined$log$2(logIntent, mapB);
            switch (iArr[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel11 = LogLevel.DEBUG;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        currentLogHandler8.d("[Purchases] - " + logLevel11.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel12 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler9.w("[Purchases] - " + logLevel12.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel13 = LogLevel.INFO;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler10.i("[Purchases] - " + logLevel13.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel14 = LogLevel.DEBUG;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        currentLogHandler11.d("[Purchases] - " + logLevel14.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel15 = LogLevel.INFO;
                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler12.i("[Purchases] - " + logLevel15.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel16 = LogLevel.DEBUG;
                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        currentLogHandler13.d("[Purchases] - " + logLevel16.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel17 = LogLevel.DEBUG;
                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        currentLogHandler14.d("[Purchases] - " + logLevel17.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel18 = LogLevel.WARN;
                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel19 = LogLevel.WARN;
                    LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel20 = LogLevel.WARN;
                    LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke(), null);
                    break;
            }
            TokenCacheEntry tokenCacheEntry = mapB.get(strSha1);
            if (tokenCacheEntry == null) {
                mapB.put(strSha1, new TokenCacheEntry(isAutoRenewing));
                saveTokenMap(mapB);
            } else if (isAutoRenewing != null && !AbstractC5504s.c(tokenCacheEntry.isAutoRenewing(), isAutoRenewing)) {
                mapB.put(strSha1, tokenCacheEntry.copy(isAutoRenewing));
                saveTokenMap(mapB);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void cacheAppUserID$purchases_defaultsBc8Release(String appUserID) {
        AbstractC5504s.h(appUserID, "appUserID");
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        AbstractC5504s.g(editorEdit, "preferences.edit()");
        cacheAppUserID$purchases_defaultsBc8Release(appUserID, editorEdit).apply();
    }

    public final synchronized void cacheCustomerInfo$purchases_defaultsBc8Release(String appUserID, CustomerInfo info) {
        AbstractC5504s.h(appUserID, "appUserID");
        AbstractC5504s.h(info, "info");
        JSONObject jsonObject = info.getJsonObject();
        jsonObject.put(CUSTOMER_INFO_SCHEMA_VERSION_KEY, 3);
        jsonObject.put("verification_result", info.getEntitlements().getVerification().name());
        jsonObject.put(CUSTOMER_INFO_REQUEST_DATE_KEY, info.getRequestDate().getTime());
        jsonObject.put(CUSTOMER_INFO_ORIGINAL_SOURCE_KEY, info.getOriginalSource().name());
        this.preferences.edit().putString(customerInfoCacheKey$purchases_defaultsBc8Release(appUserID), jsonObject.toString()).apply();
        setCustomerInfoCacheTimestampToNow$purchases_defaultsBc8Release(appUserID);
    }

    public final synchronized void cacheOfferingsResponse$purchases_defaultsBc8Release(JSONObject offeringsResponse) {
        AbstractC5504s.h(offeringsResponse, "offeringsResponse");
        this.preferences.edit().putString(getOfferingsResponseCacheKey(), offeringsResponse.toString()).apply();
    }

    public final synchronized void cacheProductEntitlementMapping$purchases_defaultsBc8Release(ProductEntitlementMapping productEntitlementMapping) {
        AbstractC5504s.h(productEntitlementMapping, "productEntitlementMapping");
        this.preferences.edit().putString(getProductEntitlementMappingCacheKey(), productEntitlementMapping.toJson$purchases_defaultsBc8Release().toString()).apply();
        setProductEntitlementMappingCacheTimestampToNow$purchases_defaultsBc8Release();
    }

    public final synchronized void cacheVirtualCurrencies$purchases_defaultsBc8Release(String appUserID, VirtualCurrencies virtualCurrencies) {
        AbstractC5504s.h(appUserID, "appUserID");
        AbstractC5504s.h(virtualCurrencies, "virtualCurrencies");
        this.preferences.edit().putString(virtualCurrenciesCacheKey$purchases_defaultsBc8Release(appUserID), AbstractC2358b.f20895d.b(VirtualCurrencies.INSTANCE.serializer(), virtualCurrencies)).apply();
        setVirtualCurrenciesCacheTimestampToNow(appUserID);
    }

    public final synchronized void cleanPreviouslySentTokens$purchases_defaultsBc8Release(Set<String> hashedTokens) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        try {
            AbstractC5504s.h(hashedTokens, "hashedTokens");
            LogIntent logIntent = LogIntent.DEBUG;
            DeviceCache$cleanPreviouslySentTokens$$inlined$log$1 deviceCache$cleanPreviouslySentTokens$$inlined$log$1 = new DeviceCache$cleanPreviouslySentTokens$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke());
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke(), null);
                    break;
            }
            Map<String, TokenCacheEntry> tokenMap = getTokenMap();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, TokenCacheEntry> entry : tokenMap.entrySet()) {
                if (hashedTokens.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            saveTokenMap(linkedHashMap);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void cleanupOldAttributionData$purchases_defaultsBc8Release() {
        try {
            SharedPreferences.Editor editorEdit = this.preferences.edit();
            for (String str : this.preferences.getAll().keySet()) {
                if (str != null && r.Q(str, this.attributionCacheKey, false, 2, null)) {
                    editorEdit.remove(str);
                }
            }
            editorEdit.apply();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void clearCachesForAppUserID$purchases_defaultsBc8Release(String appUserID) {
        AbstractC5504s.h(appUserID, "appUserID");
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        AbstractC5504s.g(editorEdit, "preferences.edit()");
        clearVirtualCurrenciesCache(clearVirtualCurrenciesCacheTimestamp(clearCustomerInfoCacheTimestamp(clearAppUserID(clearCustomerInfo(editorEdit)), appUserID), appUserID), appUserID).apply();
    }

    public final synchronized void clearCustomerInfoCache$purchases_defaultsBc8Release(String appUserID) {
        AbstractC5504s.h(appUserID, "appUserID");
        SharedPreferences.Editor editor = this.preferences.edit();
        AbstractC5504s.g(editor, "editor");
        clearCustomerInfoCache$purchases_defaultsBc8Release(appUserID, editor);
        editor.apply();
    }

    public final synchronized void clearCustomerInfoCacheTimestamp$purchases_defaultsBc8Release(String appUserID) {
        AbstractC5504s.h(appUserID, "appUserID");
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        AbstractC5504s.g(editorEdit, "preferences.edit()");
        clearCustomerInfoCacheTimestamp(editorEdit, appUserID).apply();
    }

    public final synchronized void clearOfferingsResponseCache$purchases_defaultsBc8Release() {
        this.preferences.edit().remove(getOfferingsResponseCacheKey()).apply();
    }

    public final synchronized void clearVirtualCurrenciesCache$purchases_defaultsBc8Release(String appUserID) {
        AbstractC5504s.h(appUserID, "appUserID");
        SharedPreferences.Editor editor = this.preferences.edit();
        AbstractC5504s.g(editor, "editor");
        clearVirtualCurrenciesCache$purchases_defaultsBc8Release(appUserID, editor);
        editor.apply();
    }

    public final String customerInfoCacheKey$purchases_defaultsBc8Release(String appUserID) {
        AbstractC5504s.h(appUserID, "appUserID");
        return getLegacyAppUserIDCacheKey$purchases_defaultsBc8Release() + b.f34706a + appUserID;
    }

    public final String customerInfoLastUpdatedCacheKey$purchases_defaultsBc8Release(String appUserID) {
        AbstractC5504s.h(appUserID, "appUserID");
        return getCustomerInfoCachesLastUpdatedCacheBaseKey() + b.f34706a + appUserID;
    }

    public final Set<String> findKeysThatStartWith$purchases_defaultsBc8Release(String cacheKey) {
        AbstractC5504s.h(cacheKey, "cacheKey");
        try {
            Map<String, ?> all = this.preferences.getAll();
            if (all != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    String it = entry.getKey();
                    AbstractC5504s.g(it, "it");
                    if (r.Q(it, cacheKey, false, 2, null)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Set<String> setKeySet = linkedHashMap.keySet();
                if (setKeySet != null) {
                    return setKeySet;
                }
            }
            return a0.d();
        } catch (NullPointerException unused) {
            return a0.d();
        }
    }

    public final synchronized List<StoreTransaction> getActivePurchasesNotInCache$purchases_defaultsBc8Release(Map<String, StoreTransaction> hashedTokens) {
        AbstractC5504s.h(hashedTokens, "hashedTokens");
        return AbstractC2279u.b1(S.m(hashedTokens, getPreviouslySentHashedTokens$purchases_defaultsBc8Release()).values());
    }

    public final String getAppUserIDCacheKey$purchases_defaultsBc8Release() {
        return (String) this.appUserIDCacheKey.getValue();
    }

    /* JADX INFO: renamed from: getAttributionCacheKey$purchases_defaultsBc8Release, reason: from getter */
    public final String getAttributionCacheKey() {
        return this.attributionCacheKey;
    }

    public final synchronized String getCachedAppUserID$purchases_defaultsBc8Release() {
        return this.preferences.getString(getAppUserIDCacheKey$purchases_defaultsBc8Release(), null);
    }

    public final CustomerInfo getCachedCustomerInfo$purchases_defaultsBc8Release(String appUserID) {
        AbstractC5504s.h(appUserID, "appUserID");
        String string = this.preferences.getString(customerInfoCacheKey$purchases_defaultsBc8Release(appUserID), null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                int iOptInt = jSONObject.optInt(CUSTOMER_INFO_SCHEMA_VERSION_KEY);
                String verificationResultString = jSONObject.has("verification_result") ? jSONObject.getString("verification_result") : "NOT_REQUESTED";
                Long lValueOf = Long.valueOf(jSONObject.optLong(CUSTOMER_INFO_REQUEST_DATE_KEY));
                if (lValueOf.longValue() <= 0) {
                    lValueOf = null;
                }
                Date date = lValueOf != null ? new Date(lValueOf.longValue()) : null;
                CustomerInfoOriginalSource customerInfoOriginalSourceFromString = CustomerInfoOriginalSource.INSTANCE.fromString(JSONObjectExtensionsKt.optNullableString(jSONObject, CUSTOMER_INFO_ORIGINAL_SOURCE_KEY));
                jSONObject.remove("verification_result");
                jSONObject.remove(CUSTOMER_INFO_REQUEST_DATE_KEY);
                jSONObject.remove(CUSTOMER_INFO_ORIGINAL_SOURCE_KEY);
                AbstractC5504s.g(verificationResultString, "verificationResultString");
                VerificationResult verificationResultValueOf = VerificationResult.valueOf(verificationResultString);
                if (iOptInt == 3) {
                    return CustomerInfoFactory.INSTANCE.buildCustomerInfo(jSONObject, date, verificationResultValueOf, customerInfoOriginalSourceFromString, true);
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final synchronized VirtualCurrencies getCachedVirtualCurrencies$purchases_defaultsBc8Release(String appUserID) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        AbstractC5504s.h(appUserID, "appUserID");
        String string = this.preferences.getString(virtualCurrenciesCacheKey$purchases_defaultsBc8Release(appUserID), null);
        if (string != null) {
            try {
                return VirtualCurrenciesFactory.INSTANCE.buildVirtualCurrencies(string);
            } catch (j e10) {
                LogIntent logIntent = LogIntent.WARNING;
                DeviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2 deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2 = new DeviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2(logIntent, e10);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            currentLogHandler2.d("[Purchases] - " + logLevel.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            currentLogHandler5.d("[Purchases] - " + logLevel4.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler6.i("[Purchases] - " + logLevel5.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            currentLogHandler7.d("[Purchases] - " + logLevel6.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            currentLogHandler8.d("[Purchases] - " + logLevel7.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler9.w("[Purchases] - " + logLevel8.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler10.w("[Purchases] - " + logLevel9.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                        }
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler11.w("[Purchases] - " + logLevel10.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke(), null);
                        break;
                }
            } catch (IllegalArgumentException e11) {
                LogIntent logIntent2 = LogIntent.WARNING;
                DeviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3 deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3 = new DeviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3(logIntent2, e11);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                    case 1:
                        LogLevel logLevel11 = LogLevel.DEBUG;
                        LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                            currentLogHandler12.d("[Purchases] - " + logLevel11.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel12 = LogLevel.WARN;
                        LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                            currentLogHandler13.w("[Purchases] - " + logLevel12.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                        }
                        break;
                    case 4:
                        LogLevel logLevel13 = LogLevel.INFO;
                        LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                            currentLogHandler14.i("[Purchases] - " + logLevel13.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                        }
                        break;
                    case 5:
                        LogLevel logLevel14 = LogLevel.DEBUG;
                        LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                            currentLogHandler15.d("[Purchases] - " + logLevel14.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel15 = LogLevel.INFO;
                        LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                            currentLogHandler16.i("[Purchases] - " + logLevel15.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                        }
                        break;
                    case 8:
                        LogLevel logLevel16 = LogLevel.DEBUG;
                        LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                            currentLogHandler17.d("[Purchases] - " + logLevel16.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                        }
                        break;
                    case 9:
                        LogLevel logLevel17 = LogLevel.DEBUG;
                        LogHandler currentLogHandler18 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                            currentLogHandler18.d("[Purchases] - " + logLevel17.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                        }
                        break;
                    case 10:
                        LogLevel logLevel18 = LogLevel.WARN;
                        LogHandler currentLogHandler19 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                            currentLogHandler19.w("[Purchases] - " + logLevel18.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                        }
                        break;
                    case 11:
                        LogLevel logLevel19 = LogLevel.WARN;
                        LogHandler currentLogHandler20 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                            currentLogHandler20.w("[Purchases] - " + logLevel19.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                        }
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel20 = LogLevel.WARN;
                        LogHandler currentLogHandler21 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                            currentLogHandler21.w("[Purchases] - " + logLevel20.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke(), null);
                        break;
                }
            } catch (JSONException e12) {
                LogIntent logIntent3 = LogIntent.WARNING;
                DeviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1 deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1 = new DeviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1(logIntent3, e12);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent3.ordinal()]) {
                    case 1:
                        LogLevel logLevel21 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel21) <= 0) {
                            str = "[Purchases] - " + logLevel21.name();
                            str2 = (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel22 = LogLevel.WARN;
                        LogHandler currentLogHandler22 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel22) <= 0) {
                            currentLogHandler22.w("[Purchases] - " + logLevel22.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke());
                        }
                        break;
                    case 4:
                        LogLevel logLevel23 = LogLevel.INFO;
                        LogHandler currentLogHandler23 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel23) <= 0) {
                            currentLogHandler23.i("[Purchases] - " + logLevel23.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke());
                        }
                        break;
                    case 5:
                        LogLevel logLevel24 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel24) <= 0) {
                            str = "[Purchases] - " + logLevel24.name();
                            str2 = (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel25 = LogLevel.INFO;
                        LogHandler currentLogHandler24 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel25) <= 0) {
                            currentLogHandler24.i("[Purchases] - " + logLevel25.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke());
                        }
                        break;
                    case 8:
                        LogLevel logLevel26 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel26) <= 0) {
                            str = "[Purchases] - " + logLevel26.name();
                            str2 = (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 9:
                        LogLevel logLevel27 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel27) <= 0) {
                            str = "[Purchases] - " + logLevel27.name();
                            str2 = (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 10:
                        LogLevel logLevel28 = LogLevel.WARN;
                        LogHandler currentLogHandler25 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel28) <= 0) {
                            currentLogHandler25.w("[Purchases] - " + logLevel28.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke());
                        }
                        break;
                    case 11:
                        LogLevel logLevel29 = LogLevel.WARN;
                        LogHandler currentLogHandler26 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel29) <= 0) {
                            currentLogHandler26.w("[Purchases] - " + logLevel29.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke());
                        }
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel30 = LogLevel.WARN;
                        LogHandler currentLogHandler27 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel30) <= 0) {
                            currentLogHandler27.w("[Purchases] - " + logLevel30.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke());
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke(), null);
                        break;
                }
            }
        }
        return null;
    }

    public JSONObject getJSONObjectOrNull$purchases_defaultsBc8Release(String key) {
        AbstractC5504s.h(key, "key");
        String string = this.preferences.getString(key, null);
        if (string == null) {
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String getLegacyAppUserIDCacheKey$purchases_defaultsBc8Release() {
        return (String) this.legacyAppUserIDCacheKey.getValue();
    }

    public final synchronized String getLegacyCachedAppUserID$purchases_defaultsBc8Release() {
        return this.preferences.getString(getLegacyAppUserIDCacheKey$purchases_defaultsBc8Release(), null);
    }

    public final String getLegacyTokensCacheKey$purchases_defaultsBc8Release() {
        return (String) this.legacyTokensCacheKey.getValue();
    }

    public final synchronized JSONObject getOfferingsResponseCache$purchases_defaultsBc8Release() {
        return getJSONObjectOrNull$purchases_defaultsBc8Release(getOfferingsResponseCacheKey());
    }

    public final synchronized Set<String> getPreviouslySentHashedTokens$purchases_defaultsBc8Release() {
        Set<String> setKeySet;
        LogHandler currentLogHandler;
        String str;
        String str2;
        try {
            setKeySet = getTokenMap().keySet();
            LogIntent logIntent = LogIntent.DEBUG;
            DeviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1 deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1 = new DeviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1(logIntent, setKeySet);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke());
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke(), null);
                    break;
            }
        } finally {
        }
        return setKeySet;
    }

    public final synchronized ProductEntitlementMapping getProductEntitlementMapping$purchases_defaultsBc8Release() {
        ProductEntitlementMapping productEntitlementMappingFromJson$purchases_defaultsBc8Release = null;
        String string = this.preferences.getString(getProductEntitlementMappingCacheKey(), null);
        if (string == null) {
            return null;
        }
        try {
            productEntitlementMappingFromJson$purchases_defaultsBc8Release = ProductEntitlementMapping.INSTANCE.fromJson$purchases_defaultsBc8Release(new JSONObject(string), true);
        } catch (JSONException e10) {
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            String str = String.format(OfflineEntitlementsStrings.ERROR_PARSING_PRODUCT_ENTITLEMENT_MAPPING, Arrays.copyOf(new Object[]{string}, 1));
            AbstractC5504s.g(str, "format(...)");
            currentLogHandler.e("[Purchases] - ERROR", str, e10);
            this.preferences.edit().remove(getProductEntitlementMappingCacheKey()).apply();
        }
        return productEntitlementMappingFromJson$purchases_defaultsBc8Release;
    }

    public final synchronized List<StoreTransaction> getPurchasesWithAutoRenewingChange$purchases_defaultsBc8Release(Map<String, StoreTransaction> hashedTokens) {
        LinkedHashMap linkedHashMap;
        try {
            AbstractC5504s.h(hashedTokens, "hashedTokens");
            Map<String, TokenCacheEntry> tokenMap = getTokenMap();
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, StoreTransaction> entry : hashedTokens.entrySet()) {
                String key = entry.getKey();
                StoreTransaction value = entry.getValue();
                TokenCacheEntry tokenCacheEntry = tokenMap.get(key);
                if (tokenCacheEntry != null && tokenCacheEntry.isAutoRenewing() != null && value.getIsAutoRenewing() != null && !AbstractC5504s.c(value.getIsAutoRenewing(), tokenCacheEntry.isAutoRenewing())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return AbstractC2279u.b1(linkedHashMap.values());
    }

    @Override // com.revenuecat.purchases.interfaces.StorefrontProvider
    public synchronized String getStorefront() {
        String string;
        string = this.preferences.getString(getStorefrontCacheKey$purchases_defaultsBc8Release(), null);
        if (string == null) {
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d("[Purchases] - " + logLevel.name(), BillingStrings.BILLING_STOREFRONT_NULL_FROM_CACHE);
            }
        }
        return string;
    }

    public final String getStorefrontCacheKey$purchases_defaultsBc8Release() {
        return (String) this.storefrontCacheKey.getValue();
    }

    public final String getTokensCacheKey$purchases_defaultsBc8Release() {
        return (String) this.tokensCacheKey.getValue();
    }

    public final synchronized boolean isCustomerInfoCacheStale$purchases_defaultsBc8Release(String appUserID, boolean appInBackground) {
        AbstractC5504s.h(appUserID, "appUserID");
        return DateExtensionsKt.isCacheStale(getCustomerInfoCachesLastUpdated(appUserID), appInBackground, this.dateProvider);
    }

    public final synchronized boolean isProductEntitlementMappingCacheStale$purchases_defaultsBc8Release() {
        return DateExtensionsKt.m226isCacheStale8Mi8wO0(getProductEntitlementMappingLastUpdated(), DeviceCacheKt.PRODUCT_ENTITLEMENT_MAPPING_CACHE_REFRESH_PERIOD, this.dateProvider);
    }

    public final synchronized boolean isVirtualCurrenciesCacheStale$purchases_defaultsBc8Release(String appUserID, boolean appInBackground) {
        AbstractC5504s.h(appUserID, "appUserID");
        return DateExtensionsKt.isCacheStale(getVirtualCurrenciesCacheLastUpdated(appUserID), appInBackground, this.dateProvider);
    }

    public final String newKey$purchases_defaultsBc8Release(String key) {
        AbstractC5504s.h(key, "key");
        return getApiKeyPrefix() + b.f34706a + key;
    }

    public void putString$purchases_defaultsBc8Release(String cacheKey, String value) {
        AbstractC5504s.h(cacheKey, "cacheKey");
        AbstractC5504s.h(value, "value");
        this.preferences.edit().putString(cacheKey, value).apply();
    }

    public final void remove$purchases_defaultsBc8Release(String cacheKey) {
        AbstractC5504s.h(cacheKey, "cacheKey");
        this.preferences.edit().remove(cacheKey).apply();
    }

    public final synchronized void saveAutoRenewingStatus$purchases_defaultsBc8Release(Map<String, StoreTransaction> hashedTokens) {
        try {
            AbstractC5504s.h(hashedTokens, "hashedTokens");
            Map<String, TokenCacheEntry> mapB = S.B(getTokenMap());
            boolean z10 = false;
            for (Map.Entry<String, StoreTransaction> entry : hashedTokens.entrySet()) {
                String key = entry.getKey();
                StoreTransaction value = entry.getValue();
                TokenCacheEntry tokenCacheEntry = mapB.get(key);
                if (tokenCacheEntry != null && value.getIsAutoRenewing() != null && !AbstractC5504s.c(tokenCacheEntry.isAutoRenewing(), value.getIsAutoRenewing())) {
                    mapB.put(key, tokenCacheEntry.copy(value.getIsAutoRenewing()));
                    z10 = true;
                }
            }
            if (z10) {
                saveTokenMap(mapB);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void setCustomerInfoCacheTimestamp$purchases_defaultsBc8Release(String appUserID, Date date) {
        AbstractC5504s.h(appUserID, "appUserID");
        AbstractC5504s.h(date, "date");
        this.preferences.edit().putLong(customerInfoLastUpdatedCacheKey$purchases_defaultsBc8Release(appUserID), date.getTime()).apply();
    }

    public final synchronized void setCustomerInfoCacheTimestampToNow$purchases_defaultsBc8Release(String appUserID) {
        AbstractC5504s.h(appUserID, "appUserID");
        setCustomerInfoCacheTimestamp$purchases_defaultsBc8Release(appUserID, this.dateProvider.getNow());
    }

    public final synchronized void setProductEntitlementMappingCacheTimestampToNow$purchases_defaultsBc8Release() {
        setProductEntitlementMappingCacheTimestamp(this.dateProvider.getNow());
    }

    public final synchronized void setStorefront$purchases_defaultsBc8Release(String countryCode) {
        try {
            AbstractC5504s.h(countryCode, "countryCode");
            LogLevel logLevel = LogLevel.VERBOSE;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                String str = "[Purchases] - " + logLevel.name();
                String str2 = String.format(BillingStrings.BILLING_STOREFRONT_CACHING, Arrays.copyOf(new Object[]{countryCode}, 1));
                AbstractC5504s.g(str2, "format(...)");
                currentLogHandler.v(str, str2);
            }
            this.preferences.edit().putString(getStorefrontCacheKey$purchases_defaultsBc8Release(), countryCode).apply();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final SharedPreferences.Editor startEditing$purchases_defaultsBc8Release() {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        AbstractC5504s.g(editorEdit, "preferences.edit()");
        return editorEdit;
    }

    public final String virtualCurrenciesCacheKey$purchases_defaultsBc8Release(String appUserID) {
        AbstractC5504s.h(appUserID, "appUserID");
        return getVirtualCurrenciesCacheBaseKey() + b.f34706a + appUserID;
    }

    public final String virtualCurrenciesLastUpdatedCacheKey$purchases_defaultsBc8Release(String appUserID) {
        AbstractC5504s.h(appUserID, "appUserID");
        return getVirtualCurrenciesLastUpdatedCacheBaseKey() + b.f34706a + appUserID;
    }

    public final synchronized SharedPreferences.Editor cacheAppUserID$purchases_defaultsBc8Release(String appUserID, SharedPreferences.Editor cacheEditor) {
        SharedPreferences.Editor editorPutString;
        AbstractC5504s.h(appUserID, "appUserID");
        AbstractC5504s.h(cacheEditor, "cacheEditor");
        editorPutString = cacheEditor.putString(getAppUserIDCacheKey$purchases_defaultsBc8Release(), appUserID);
        AbstractC5504s.g(editorPutString, "cacheEditor.putString(ap…serIDCacheKey, appUserID)");
        return editorPutString;
    }

    public final synchronized void clearCustomerInfoCache$purchases_defaultsBc8Release(String appUserID, SharedPreferences.Editor editor) {
        AbstractC5504s.h(appUserID, "appUserID");
        AbstractC5504s.h(editor, "editor");
        clearCustomerInfoCacheTimestamp(editor, appUserID);
        editor.remove(customerInfoCacheKey$purchases_defaultsBc8Release(appUserID));
    }

    public final synchronized void clearVirtualCurrenciesCache$purchases_defaultsBc8Release(String appUserID, SharedPreferences.Editor editor) {
        AbstractC5504s.h(appUserID, "appUserID");
        AbstractC5504s.h(editor, "editor");
        clearVirtualCurrenciesCacheTimestamp(editor, appUserID);
        clearVirtualCurrenciesCache(editor, appUserID);
    }

    public static /* synthetic */ void getAppUserIDCacheKey$purchases_defaultsBc8Release$annotations() {
    }

    public static /* synthetic */ void getLegacyAppUserIDCacheKey$purchases_defaultsBc8Release$annotations() {
    }

    public static /* synthetic */ void getStorefrontCacheKey$purchases_defaultsBc8Release$annotations() {
    }

    public /* synthetic */ DeviceCache(SharedPreferences sharedPreferences, String str, DateProvider dateProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(sharedPreferences, str, (i10 & 4) != 0 ? new DefaultDateProvider() : dateProvider);
    }
}
