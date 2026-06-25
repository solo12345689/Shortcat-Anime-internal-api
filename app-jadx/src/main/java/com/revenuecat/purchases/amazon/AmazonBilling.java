package com.revenuecat.purchases.amazon;

import Td.L;
import Td.r;
import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import app.notifee.core.event.LogEvent;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.LWAConsentStatus;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.AmazonLWAConsentStatus;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.PurchasesStateProvider;
import com.revenuecat.purchases.amazon.AmazonPurchasingData;
import com.revenuecat.purchases.amazon.handler.ProductDataHandler;
import com.revenuecat.purchases.amazon.handler.PurchaseHandler;
import com.revenuecat.purchases.amazon.handler.PurchaseUpdatesHandler;
import com.revenuecat.purchases.amazon.handler.UserDataHandler;
import com.revenuecat.purchases.amazon.listener.ProductDataResponseListener;
import com.revenuecat.purchases.amazon.listener.PurchaseResponseListener;
import com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener;
import com.revenuecat.purchases.amazon.listener.UserDataResponseListener;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.PurchaseStrings;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Â\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B}\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dBC\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u001e\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001c\u0010\"JA\u0010+\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020*0%*\b\u0012\u0004\u0012\u00020$0#2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&0%2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b+\u0010,J\u0019\u0010/\u001a\u0004\u0018\u00010&2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J#\u00104\u001a\u0002032\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u0002010%H\u0002¢\u0006\u0004\b4\u00105JK\u0010:\u001a\u0002032\u0006\u00106\u001a\u00020\f2\u001e\u00108\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020*0%\u0012\u0004\u0012\u000203072\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020307H\u0002¢\u0006\u0004\b:\u0010;JW\u0010@\u001a\u0002032\u0006\u0010<\u001a\u00020&2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020$0#20\u0010?\u001a,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&0%\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u0002010%\u0012\u0004\u0012\u0002030>H\u0002¢\u0006\u0004\b@\u0010AJ1\u0010G\u001a\u0002032\u0006\u0010B\u001a\u00020$2\u0006\u0010)\u001a\u00020(2\u0006\u0010D\u001a\u00020C2\b\u0010F\u001a\u0004\u0018\u00010EH\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u0002032\u0006\u0010I\u001a\u000201H\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\fH\u0002¢\u0006\u0004\bL\u0010MJ%\u0010O\u001a\u0002032\u0014\u0010N\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000101\u0012\u0004\u0012\u00020307H\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u000203H\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010U\u001a\u0002032\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\bU\u0010VJ-\u0010\\\u001a\u0002032\u0006\u0010W\u001a\u00020\f2\u0006\u0010Y\u001a\u00020X2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020&0ZH\u0002¢\u0006\u0004\b\\\u0010]J/\u0010^\u001a\u0002032\u0006\u0010W\u001a\u00020\f2\u0006\u0010Y\u001a\u00020X2\u000e\u0010=\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#H\u0002¢\u0006\u0004\b^\u0010_JT\u0010c\u001a\u0002032\f\u0010`\u001a\b\u0012\u0004\u0012\u00020&0Z2\u0006\u0010a\u001a\u00020&2\u0018\u0010b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0#\u0012\u0004\u0012\u000203072\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020307H\u0096\u0001¢\u0006\u0004\bc\u0010dJ^\u0010h\u001a\u0002032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010f\u001a\u00020e2\u0006\u0010g\u001a\u00020&2\u0006\u0010D\u001a\u00020C2\u0018\u00108\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u0002030>2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020307H\u0096\u0001¢\u0006\u0004\bh\u0010iJD\u0010:\u001a\u0002032\u001e\u00108\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u0002030>2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020307H\u0096\u0001¢\u0006\u0004\b:\u0010jJ8\u0010k\u001a\u0002032\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u000203072\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020307H\u0096\u0001¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u000203H\u0016¢\u0006\u0004\bm\u0010RJ\u0017\u0010p\u001a\u0002032\u0006\u0010o\u001a\u00020nH\u0016¢\u0006\u0004\bp\u0010qJ\u000f\u0010r\u001a\u000203H\u0014¢\u0006\u0004\br\u0010RJI\u0010v\u001a\u0002032\u0006\u0010g\u001a\u00020&2\u0018\u0010s\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0#\u0012\u0004\u0012\u000203072\u0016\u0010u\u001a\u0012\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020307j\u0002`tH\u0016¢\u0006\u0004\bv\u0010wJO\u0010{\u001a\u0002032\u0006\u0010x\u001a\u00020&2\u0006\u0010y\u001a\u00020&2\u0006\u0010z\u001a\u00020&2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u000203072\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020307H\u0016¢\u0006\u0004\b{\u0010|J_\u0010\u0081\u0001\u001a\u0002032\u0006\u0010~\u001a\u00020}2\f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020&0Z2\u001d\u0010b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0#\u0012\u0004\u0012\u00020307j\u0003`\u0080\u00012\u0016\u00109\u001a\u0012\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020307j\u0002`tH\u0016¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J5\u0010\u0086\u0001\u001a\u0002032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010h\u001a\u00020*2\u0007\u0010\u0083\u0001\u001a\u00020\f2\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0016¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001JS\u0010\u0089\u0001\u001a\u0002032\u0006\u0010g\u001a\u00020&2\u0006\u0010~\u001a\u00020}2\u0007\u0010\u0088\u0001\u001a\u00020&2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u000203072\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020307H\u0016¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001JM\u0010\u0090\u0001\u001a\u0002032\u0006\u0010f\u001a\u00020e2\u0006\u0010g\u001a\u00020&2\b\u0010\u008c\u0001\u001a\u00030\u008b\u00012\n\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u00012\b\u0010F\u001a\u0004\u0018\u00010E2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u0011\u0010\u0092\u0001\u001a\u00020\fH\u0016¢\u0006\u0005\b\u0092\u0001\u0010MJK\u0010:\u001a\u0002032\u0006\u0010g\u001a\u00020&2\u001e\u00108\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020*0%\u0012\u0004\u0012\u000203072\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020307H\u0016¢\u0006\u0004\b:\u0010wJ:\u0010\u0097\u0001\u001a\u0002032\u0006\u0010f\u001a\u00020e2\u000e\u0010\u0094\u0001\u001a\t\u0012\u0005\u0012\u00030\u0093\u00010#2\u000e\u0010\u0096\u0001\u001a\t\u0012\u0004\u0012\u0002030\u0095\u0001H\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J=\u0010\u0099\u0001\u001a\u0002032\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u000203072\u0016\u00109\u001a\u0012\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020307j\u0002`tH\u0016¢\u0006\u0005\b\u0099\u0001\u0010lJ>\u0010\u009b\u0001\u001a\u0002032\u0013\u00108\u001a\u000f\u0012\u0005\u0012\u00030\u009a\u0001\u0012\u0004\u0012\u000203072\u0016\u00109\u001a\u0012\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020307j\u0002`tH\u0016¢\u0006\u0005\b\u009b\u0001\u0010lJ\u001b\u0010\u009d\u0001\u001a\u0002032\u0007\u0010.\u001a\u00030\u009c\u0001H\u0016¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u001b\u0010 \u0001\u001a\u0002032\u0007\u0010.\u001a\u00030\u009f\u0001H\u0016¢\u0006\u0006\b \u0001\u0010¡\u0001J\u001b\u0010£\u0001\u001a\u0002032\u0007\u0010.\u001a\u00030¢\u0001H\u0016¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u001b\u0010¦\u0001\u001a\u0002032\u0007\u0010.\u001a\u00030¥\u0001H\u0016¢\u0006\u0006\b¦\u0001\u0010§\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010¨\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010©\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010ª\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010«\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010¬\u0001R\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010\u00ad\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010®\u0001R\u0015\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010¯\u0001R\u0015\u0010\u0017\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010°\u0001R\u0015\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010±\u0001R\u0015\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010²\u0001R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010³\u0001R\u0019\u0010´\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010«\u0001R,\u0010¶\u0001\u001a\u0017\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u000101\u0012\u0004\u0012\u000203070µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001¨\u0006¸\u0001"}, d2 = {"Lcom/revenuecat/purchases/amazon/AmazonBilling;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/amazon/listener/ProductDataResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/PurchaseResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/PurchaseUpdatesResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/UserDataResponseListener;", "Landroid/content/Context;", "applicationContext", "Lcom/revenuecat/purchases/amazon/AmazonBackend;", "amazonBackend", "Lcom/revenuecat/purchases/amazon/AmazonCache;", "cache", "", "finishTransactions", "Landroid/os/Handler;", "mainHandler", "Lcom/revenuecat/purchases/PurchasesStateProvider;", "stateProvider", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "purchasingServiceProvider", "productDataHandler", "purchaseHandler", "purchaseUpdatesHandler", "userDataHandler", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "<init>", "(Landroid/content/Context;Lcom/revenuecat/purchases/amazon/AmazonBackend;Lcom/revenuecat/purchases/amazon/AmazonCache;ZLandroid/os/Handler;Lcom/revenuecat/purchases/PurchasesStateProvider;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;Lcom/revenuecat/purchases/amazon/listener/ProductDataResponseListener;Lcom/revenuecat/purchases/amazon/listener/PurchaseResponseListener;Lcom/revenuecat/purchases/amazon/listener/PurchaseUpdatesResponseListener;Lcom/revenuecat/purchases/amazon/listener/UserDataResponseListener;Lcom/revenuecat/purchases/common/DateProvider;)V", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/BackendHelper;", "backendHelper", "diagnosticsTracker", "(Landroid/content/Context;Lcom/revenuecat/purchases/common/caching/DeviceCache;ZLandroid/os/Handler;Lcom/revenuecat/purchases/common/BackendHelper;Lcom/revenuecat/purchases/PurchasesStateProvider;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;)V", "", "Lcom/amazon/device/iap/model/Receipt;", "", "", "tokensToSkusMap", "Lcom/amazon/device/iap/model/UserData;", "userData", "Lcom/revenuecat/purchases/models/StoreTransaction;", "toMapOfReceiptHashesToRestoredPurchases", "(Ljava/util/List;Ljava/util/Map;Lcom/amazon/device/iap/model/UserData;)Ljava/util/Map;", "Lorg/json/JSONObject;", "response", "getTermSkuFromJSON", "(Lorg/json/JSONObject;)Ljava/lang/String;", "Lcom/revenuecat/purchases/PurchasesError;", "errors", "LTd/L;", "logErrorsIfAny", "(Ljava/util/Map;)V", "filterOnlyActivePurchases", "Lkotlin/Function1;", "onSuccess", "onError", "queryPurchases", "(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "amazonUserID", com.amazon.a.a.o.b.f34614G, "Lkotlin/Function2;", "onCompletion", "getMissingSkusForReceipts", "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", com.amazon.a.a.o.b.f34611D, "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProduct", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "handleReceipt", "(Lcom/amazon/device/iap/model/Receipt;Lcom/amazon/device/iap/model/UserData;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", LogEvent.LEVEL_ERROR, "onPurchaseError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "shouldFinishTransactions", "()Z", "request", "executeRequestOnUIThread", "(Lkotlin/jvm/functions/Function1;)V", "executePendingRequests", "()V", "Ljava/lang/Runnable;", "runnable", "runOnUIThread", "(Ljava/lang/Runnable;)V", "wasSuccessful", "Ljava/util/Date;", "requestStartTime", "", "requestedProductIds", "trackAmazonQueryProductDetailsRequestIfNeeded", "(ZLjava/util/Date;Ljava/util/Set;)V", "trackAmazonQueryPurchasesRequestIfNeeded", "(ZLjava/util/Date;Ljava/util/List;)V", com.amazon.a.a.o.b.f34622O, com.amazon.a.a.o.b.f34655m, "onReceive", "getProductData", "(Ljava/util/Set;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/app/Activity;", "activity", "appUserID", "purchase", "(Landroid/os/Handler;Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/models/StoreProduct;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "getUserData", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "startConnection", "", "delayMilliseconds", "startConnectionOnMainThread", "(J)V", "endConnection", "onReceivePurchaseHistory", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onReceivePurchaseHistoryError", "queryAllPurchases", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "productID", "purchaseToken", "storeUserID", "normalizePurchaseData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/revenuecat/purchases/ProductType;", "productType", "productIds", "Lcom/revenuecat/purchases/common/StoreProductsCallback;", "queryProductDetailsAsync", "(Lcom/revenuecat/purchases/ProductType;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "shouldConsume", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "initiationSource", "consumeAndSave", "(ZLcom/revenuecat/purchases/models/StoreTransaction;ZLcom/revenuecat/purchases/PostReceiptInitiationSource;)V", "productId", "findPurchaseInPurchaseHistory", "(Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "Lcom/revenuecat/purchases/common/ReplaceProductInfo;", "replaceProductInfo", "isPersonalizedPrice", "makePurchaseAsync", "(Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchasingData;Lcom/revenuecat/purchases/common/ReplaceProductInfo;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/Boolean;)V", "isConnected", "Lcom/revenuecat/purchases/models/InAppMessageType;", "inAppMessageTypes", "Lkotlin/Function0;", "subscriptionStatusChange", "showInAppMessagesIfNeeded", "(Landroid/app/Activity;Ljava/util/List;Lie/a;)V", "getStorefront", "Lcom/revenuecat/purchases/AmazonLWAConsentStatus;", "getAmazonLWAConsentStatus", "Lcom/amazon/device/iap/model/UserDataResponse;", "onUserDataResponse", "(Lcom/amazon/device/iap/model/UserDataResponse;)V", "Lcom/amazon/device/iap/model/ProductDataResponse;", "onProductDataResponse", "(Lcom/amazon/device/iap/model/ProductDataResponse;)V", "Lcom/amazon/device/iap/model/PurchaseResponse;", "onPurchaseResponse", "(Lcom/amazon/device/iap/model/PurchaseResponse;)V", "Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;", "onPurchaseUpdatesResponse", "(Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;)V", "Landroid/content/Context;", "Lcom/revenuecat/purchases/amazon/AmazonBackend;", "Lcom/revenuecat/purchases/amazon/AmazonCache;", "Z", "Landroid/os/Handler;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "Lcom/revenuecat/purchases/amazon/listener/ProductDataResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/PurchaseResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/PurchaseUpdatesResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/UserDataResponseListener;", "Lcom/revenuecat/purchases/common/DateProvider;", "connected", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "serviceRequests", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AmazonBilling extends BillingAbstract implements ProductDataResponseListener, PurchaseResponseListener, PurchaseUpdatesResponseListener, UserDataResponseListener {
    private final AmazonBackend amazonBackend;
    private final Context applicationContext;
    private final AmazonCache cache;
    private boolean connected;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final boolean finishTransactions;
    private final Handler mainHandler;
    private final ProductDataResponseListener productDataHandler;
    private final PurchaseResponseListener purchaseHandler;
    private final PurchaseUpdatesResponseListener purchaseUpdatesHandler;
    private final PurchasingServiceProvider purchasingServiceProvider;
    private final ConcurrentLinkedQueue<Function1> serviceRequests;
    private final UserDataResponseListener userDataHandler;

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$consumeAndSave$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        final /* synthetic */ StoreTransaction $purchase;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(StoreTransaction storeTransaction) {
            super(1);
            this.$purchase = storeTransaction;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError == null) {
                AmazonBilling.this.purchasingServiceProvider.notifyFulfillment(this.$purchase.getPurchaseToken(), FulfillmentResult.FULFILLED);
            } else {
                LogUtilsKt.errorLog(purchasesError);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$findPurchaseInPurchaseHistory$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreTransaction;", "it", "LTd/L;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass2 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Function1 $onCompletion;
        final /* synthetic */ Function1 $onError;
        final /* synthetic */ String $productId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Function1 function1, String str, Function1 function12) {
            super(1);
            this.$onCompletion = function1;
            this.$productId = str;
            this.$onError = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<StoreTransaction>) obj);
            return L.f17438a;
        }

        public final void invoke(List<StoreTransaction> it) {
            Object next;
            AbstractC5504s.h(it, "it");
            String str = this.$productId;
            Iterator<T> it2 = it.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (AbstractC5504s.c(str, ((StoreTransaction) next).getProductIds().get(0))) {
                        break;
                    }
                }
            }
            StoreTransaction storeTransaction = (StoreTransaction) next;
            if (storeTransaction != null) {
                this.$onCompletion.invoke(storeTransaction);
                return;
            }
            String str2 = String.format(PurchaseStrings.NO_EXISTING_PURCHASE, Arrays.copyOf(new Object[]{this.$productId}, 1));
            AbstractC5504s.g(str2, "format(...)");
            this.$onError.invoke(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, str2));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$getAmazonLWAConsentStatus$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40681 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Function1 $onError;
        final /* synthetic */ Function1 $onSuccess;

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$getAmazonLWAConsentStatus$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/amazon/device/iap/model/UserData;", "userData", "LTd/L;", "invoke", "(Lcom/amazon/device/iap/model/UserData;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C06621 extends AbstractC5506u implements Function1 {
            final /* synthetic */ Function1 $onError;
            final /* synthetic */ Function1 $onSuccess;
            final /* synthetic */ AmazonBilling this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$getAmazonLWAConsentStatus$1$1$WhenMappings */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LWAConsentStatus.values().length];
                    try {
                        iArr[LWAConsentStatus.CONSENTED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[LWAConsentStatus.UNAVAILABLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06621(AmazonBilling amazonBilling, Function1 function1, Function1 function12) {
                super(1);
                this.this$0 = amazonBilling;
                this.$onSuccess = function1;
                this.$onError = function12;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((UserData) obj);
                return L.f17438a;
            }

            public final void invoke(UserData userData) {
                AmazonLWAConsentStatus amazonLWAConsentStatus;
                AbstractC5504s.h(userData, "userData");
                LWAConsentStatus lWAConsentStatus = userData.getLWAConsentStatus();
                if (lWAConsentStatus == null) {
                    this.$onError.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, AmazonStrings.ERROR_USER_DATA_LWA_CONSENT_STATUS_NULL_STORE_PROBLEM));
                    return;
                }
                Function1 function1 = this.$onSuccess;
                int i10 = WhenMappings.$EnumSwitchMapping$0[lWAConsentStatus.ordinal()];
                if (i10 == 1) {
                    amazonLWAConsentStatus = AmazonLWAConsentStatus.CONSENTED;
                } else {
                    if (i10 != 2) {
                        throw new r();
                    }
                    amazonLWAConsentStatus = AmazonLWAConsentStatus.UNAVAILABLE;
                }
                function1.invoke(amazonLWAConsentStatus);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$getAmazonLWAConsentStatus$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass2 extends AbstractC5506u implements Function1 {
            final /* synthetic */ Function1 $onError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Function1 function1) {
                super(1);
                this.$onError = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return L.f17438a;
            }

            public final void invoke(PurchasesError error) {
                AbstractC5504s.h(error, "error");
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                String str = String.format(BillingStrings.BILLING_AMAZON_ERROR_LWA_CONSENT_STATUS, Arrays.copyOf(new Object[]{error}, 1));
                AbstractC5504s.g(str, "format(...)");
                currentLogHandler.e("[Purchases] - ERROR", str, null);
                this.$onError.invoke(error);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40681(Function1 function1, Function1 function12) {
            super(1);
            this.$onError = function1;
            this.$onSuccess = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError == null) {
                AmazonBilling.this.userDataHandler.getUserData(new C06621(AmazonBilling.this, this.$onSuccess, this.$onError), new AnonymousClass2(this.$onError));
                return;
            }
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            String str = String.format(BillingStrings.BILLING_CONNECTION_ERROR_LWA_CONSENT_STATUS, Arrays.copyOf(new Object[]{purchasesError}, 1));
            AbstractC5504s.g(str, "format(...)");
            currentLogHandler.e("[Purchases] - ERROR", str, null);
            this.$onError.invoke(purchasesError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$getStorefront$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40691 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Function1 $onError;
        final /* synthetic */ Function1 $onSuccess;

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$getStorefront$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/amazon/device/iap/model/UserData;", "userData", "LTd/L;", "invoke", "(Lcom/amazon/device/iap/model/UserData;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C06631 extends AbstractC5506u implements Function1 {
            final /* synthetic */ Function1 $onError;
            final /* synthetic */ Function1 $onSuccess;
            final /* synthetic */ AmazonBilling this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06631(AmazonBilling amazonBilling, Function1 function1, Function1 function12) {
                super(1);
                this.this$0 = amazonBilling;
                this.$onSuccess = function1;
                this.$onError = function12;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((UserData) obj);
                return L.f17438a;
            }

            public final void invoke(UserData userData) {
                AbstractC5504s.h(userData, "userData");
                String marketplace = userData.getMarketplace();
                if (marketplace == null) {
                    this.$onError.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, AmazonStrings.ERROR_USER_DATA_MARKETPLACE_NULL_STORE_PROBLEM));
                } else {
                    this.$onSuccess.invoke(marketplace);
                }
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$getStorefront$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass2 extends AbstractC5506u implements Function1 {
            final /* synthetic */ Function1 $onError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Function1 function1) {
                super(1);
                this.$onError = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return L.f17438a;
            }

            public final void invoke(PurchasesError error) {
                AbstractC5504s.h(error, "error");
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                String str = String.format(BillingStrings.BILLING_AMAZON_ERROR_STOREFRONT, Arrays.copyOf(new Object[]{error}, 1));
                AbstractC5504s.g(str, "format(...)");
                currentLogHandler.e("[Purchases] - ERROR", str, null);
                this.$onError.invoke(error);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40691(Function1 function1, Function1 function12) {
            super(1);
            this.$onError = function1;
            this.$onSuccess = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError == null) {
                AmazonBilling.this.userDataHandler.getUserData(new C06631(AmazonBilling.this, this.$onSuccess, this.$onError), new AnonymousClass2(this.$onError));
                return;
            }
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            String str = String.format(BillingStrings.BILLING_CONNECTION_ERROR_STORE_COUNTRY, Arrays.copyOf(new Object[]{purchasesError}, 1));
            AbstractC5504s.g(str, "format(...)");
            currentLogHandler.e("[Purchases] - ERROR", str, null);
            this.$onError.invoke(purchasesError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$handleReceipt$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "response", "LTd/L;", "invoke", "(Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40701 extends AbstractC5506u implements Function1 {
        final /* synthetic */ PresentedOfferingContext $presentedOfferingContext;
        final /* synthetic */ Receipt $receipt;
        final /* synthetic */ UserData $userData;
        final /* synthetic */ AmazonBilling this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40701(Receipt receipt, PresentedOfferingContext presentedOfferingContext, UserData userData, AmazonBilling amazonBilling) {
            super(1);
            this.$receipt = receipt;
            this.$presentedOfferingContext = presentedOfferingContext;
            this.$userData = userData;
            this.this$0 = amazonBilling;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws JSONException {
            invoke((JSONObject) obj);
            return L.f17438a;
        }

        public final void invoke(JSONObject response) throws JSONException {
            AbstractC5504s.h(response, "response");
            Object obj = response.get(com.amazon.a.a.o.b.f34619L);
            AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.String");
            StoreTransaction storeTransaction = StoreTransactionConversionsKt.toStoreTransaction(this.$receipt, (String) obj, this.$presentedOfferingContext, PurchaseState.PURCHASED, this.$userData);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = this.this$0.getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesUpdated(AbstractC2279u.e(storeTransaction));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$handleReceipt$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class C40712 extends AbstractC5502p implements Function1 {
        C40712(Object obj) {
            super(1, obj, AmazonBilling.class, "onPurchaseError", "onPurchaseError(Lcom/revenuecat/purchases/PurchasesError;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError p02) {
            AbstractC5504s.h(p02, "p0");
            ((AmazonBilling) this.receiver).onPurchaseError(p02);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$makePurchaseAsync$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40722 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ PresentedOfferingContext $presentedOfferingContext;
        final /* synthetic */ AmazonStoreProduct $storeProduct;

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$makePurchaseAsync$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/amazon/device/iap/model/Receipt;", com.amazon.a.a.o.b.f34611D, "Lcom/amazon/device/iap/model/UserData;", "userData", "LTd/L;", "invoke", "(Lcom/amazon/device/iap/model/Receipt;Lcom/amazon/device/iap/model/UserData;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
            final /* synthetic */ PresentedOfferingContext $presentedOfferingContext;
            final /* synthetic */ AmazonStoreProduct $storeProduct;
            final /* synthetic */ AmazonBilling this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AmazonBilling amazonBilling, AmazonStoreProduct amazonStoreProduct, PresentedOfferingContext presentedOfferingContext) {
                super(2);
                this.this$0 = amazonBilling;
                this.$storeProduct = amazonStoreProduct;
                this.$presentedOfferingContext = presentedOfferingContext;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Receipt) obj, (UserData) obj2);
                return L.f17438a;
            }

            public final void invoke(Receipt receipt, UserData userData) {
                AbstractC5504s.h(receipt, "receipt");
                AbstractC5504s.h(userData, "userData");
                this.this$0.handleReceipt(receipt, userData, this.$storeProduct, this.$presentedOfferingContext);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$makePurchaseAsync$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C06642 extends AbstractC5506u implements Function1 {
            final /* synthetic */ AmazonBilling this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06642(AmazonBilling amazonBilling) {
                super(1);
                this.this$0 = amazonBilling;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return L.f17438a;
            }

            public final void invoke(PurchasesError it) {
                AbstractC5504s.h(it, "it");
                this.this$0.onPurchaseError(it);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40722(Activity activity, String str, AmazonStoreProduct amazonStoreProduct, PresentedOfferingContext presentedOfferingContext) {
            super(1);
            this.$activity = activity;
            this.$appUserID = str;
            this.$storeProduct = amazonStoreProduct;
            this.$presentedOfferingContext = presentedOfferingContext;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError != null) {
                AmazonBilling.this.onPurchaseError(purchasesError);
                return;
            }
            PurchaseResponseListener purchaseResponseListener = AmazonBilling.this.purchaseHandler;
            Handler handler = AmazonBilling.this.mainHandler;
            Activity activity = this.$activity;
            String str = this.$appUserID;
            AmazonStoreProduct amazonStoreProduct = this.$storeProduct;
            purchaseResponseListener.purchase(handler, activity, str, amazonStoreProduct, new AnonymousClass1(AmazonBilling.this, amazonStoreProduct, this.$presentedOfferingContext), new C06642(AmazonBilling.this));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$normalizePurchaseData$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "response", "LTd/L;", "invoke", "(Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40732 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Function1 $onError;
        final /* synthetic */ Function1 $onSuccess;
        final /* synthetic */ String $purchaseToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40732(Function1 function1, String str, Function1 function12) {
            super(1);
            this.$onError = function1;
            this.$purchaseToken = str;
            this.$onSuccess = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return L.f17438a;
        }

        public final void invoke(JSONObject response) {
            LogHandler currentLogHandler;
            String str;
            String str2;
            AbstractC5504s.h(response, "response");
            LogIntent logIntent = LogIntent.DEBUG;
            AmazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1 amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1 = new AmazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1(logIntent, response);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke(), null);
                    break;
            }
            String termSkuFromJSON = AmazonBilling.this.getTermSkuFromJSON(response);
            if (termSkuFromJSON == null) {
                this.$onError.invoke(ErrorsKt.missingTermSkuError(response));
            } else {
                AmazonBilling.this.cache.cacheSkusByToken(S.f(z.a(this.$purchaseToken, termSkuFromJSON)));
                this.$onSuccess.invoke(termSkuFromJSON);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$normalizePurchaseData$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass3 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Function1 $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Function1 function1) {
            super(1);
            this.$onError = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError error) {
            AbstractC5504s.h(error, "error");
            this.$onError.invoke(ErrorsKt.errorGettingReceiptInfo(error));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryAllPurchases$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "it", "LTd/L;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40741 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Function1 $onReceivePurchaseHistory;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40741(Function1 function1) {
            super(1);
            this.$onReceivePurchaseHistory = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map<String, StoreTransaction>) obj);
            return L.f17438a;
        }

        public final void invoke(Map<String, StoreTransaction> it) {
            AbstractC5504s.h(it, "it");
            this.$onReceivePurchaseHistory.invoke(AbstractC2279u.b1(it.values()));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryProductDetailsAsync$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40751 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Function1 $onError;
        final /* synthetic */ Function1 $onReceive;
        final /* synthetic */ Set<String> $productIds;

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryProductDetailsAsync$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/amazon/device/iap/model/UserData;", "userData", "LTd/L;", "invoke", "(Lcom/amazon/device/iap/model/UserData;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C06651 extends AbstractC5506u implements Function1 {
            final /* synthetic */ Function1 $onError;
            final /* synthetic */ Function1 $onReceive;
            final /* synthetic */ Set<String> $productIds;
            final /* synthetic */ AmazonBilling this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryProductDetailsAsync$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "it", "LTd/L;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            static final class C06661 extends AbstractC5506u implements Function1 {
                final /* synthetic */ Function1 $onReceive;
                final /* synthetic */ Set<String> $productIds;
                final /* synthetic */ Date $requestStartTime;
                final /* synthetic */ AmazonBilling this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C06661(AmazonBilling amazonBilling, Date date, Set<String> set, Function1 function1) {
                    super(1);
                    this.this$0 = amazonBilling;
                    this.$requestStartTime = date;
                    this.$productIds = set;
                    this.$onReceive = function1;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((List<? extends StoreProduct>) obj);
                    return L.f17438a;
                }

                public final void invoke(List<? extends StoreProduct> it) {
                    AbstractC5504s.h(it, "it");
                    this.this$0.trackAmazonQueryProductDetailsRequestIfNeeded(true, this.$requestStartTime, this.$productIds);
                    this.$onReceive.invoke(it);
                }
            }

            /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryProductDetailsAsync$1$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            static final class AnonymousClass2 extends AbstractC5506u implements Function1 {
                final /* synthetic */ Function1 $onError;
                final /* synthetic */ Set<String> $productIds;
                final /* synthetic */ Date $requestStartTime;
                final /* synthetic */ AmazonBilling this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(AmazonBilling amazonBilling, Date date, Set<String> set, Function1 function1) {
                    super(1);
                    this.this$0 = amazonBilling;
                    this.$requestStartTime = date;
                    this.$productIds = set;
                    this.$onError = function1;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((PurchasesError) obj);
                    return L.f17438a;
                }

                public final void invoke(PurchasesError it) {
                    AbstractC5504s.h(it, "it");
                    this.this$0.trackAmazonQueryProductDetailsRequestIfNeeded(false, this.$requestStartTime, this.$productIds);
                    this.$onError.invoke(it);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06651(AmazonBilling amazonBilling, Set<String> set, Function1 function1, Function1 function12) {
                super(1);
                this.this$0 = amazonBilling;
                this.$productIds = set;
                this.$onReceive = function1;
                this.$onError = function12;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((UserData) obj);
                return L.f17438a;
            }

            public final void invoke(UserData userData) {
                AbstractC5504s.h(userData, "userData");
                Date now = this.this$0.dateProvider.getNow();
                ProductDataResponseListener productDataResponseListener = this.this$0.productDataHandler;
                Set<String> set = this.$productIds;
                String marketplace = userData.getMarketplace();
                AbstractC5504s.g(marketplace, "userData.marketplace");
                productDataResponseListener.getProductData(set, marketplace, new C06661(this.this$0, now, this.$productIds, this.$onReceive), new AnonymousClass2(this.this$0, now, this.$productIds, this.$onError));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40751(Function1 function1, Set<String> set, Function1 function12) {
            super(1);
            this.$onError = function1;
            this.$productIds = set;
            this.$onReceive = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError == null) {
                AmazonBilling.this.userDataHandler.getUserData(new C06651(AmazonBilling.this, this.$productIds, this.$onReceive, this.$onError), this.$onError);
            } else {
                this.$onError.invoke(purchasesError);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryPurchases$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40761 extends AbstractC5506u implements Function1 {
        final /* synthetic */ boolean $filterOnlyActivePurchases;
        final /* synthetic */ Function1 $onError;
        final /* synthetic */ Function1 $onSuccess;

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryPurchases$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/amazon/device/iap/model/Receipt;", com.amazon.a.a.o.b.f34614G, "Lcom/amazon/device/iap/model/UserData;", "userData", "LTd/L;", "invoke", "(Ljava/util/List;Lcom/amazon/device/iap/model/UserData;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C06671 extends AbstractC5506u implements Function2 {
            final /* synthetic */ boolean $filterOnlyActivePurchases;
            final /* synthetic */ Function1 $onError;
            final /* synthetic */ Function1 $onSuccess;
            final /* synthetic */ Date $requestStartTime;
            final /* synthetic */ AmazonBilling this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryPurchases$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "tokensToSkusMap", "Lcom/revenuecat/purchases/PurchasesError;", "errors", "LTd/L;", "invoke", "(Ljava/util/Map;Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            static final class C06681 extends AbstractC5506u implements Function2 {
                final /* synthetic */ List<Receipt> $filteredReceipts;
                final /* synthetic */ Function1 $onError;
                final /* synthetic */ Function1 $onSuccess;
                final /* synthetic */ UserData $userData;
                final /* synthetic */ AmazonBilling this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C06681(AmazonBilling amazonBilling, Function1 function1, List<Receipt> list, UserData userData, Function1 function12) {
                    super(2);
                    this.this$0 = amazonBilling;
                    this.$onError = function1;
                    this.$filteredReceipts = list;
                    this.$userData = userData;
                    this.$onSuccess = function12;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Map<String, String>) obj, (Map<String, PurchasesError>) obj2);
                    return L.f17438a;
                }

                public final void invoke(Map<String, String> tokensToSkusMap, Map<String, PurchasesError> errors) {
                    AbstractC5504s.h(tokensToSkusMap, "tokensToSkusMap");
                    AbstractC5504s.h(errors, "errors");
                    this.this$0.logErrorsIfAny(errors);
                    if (tokensToSkusMap.isEmpty()) {
                        this.$onError.invoke(new PurchasesError(PurchasesErrorCode.InvalidReceiptError, AmazonStrings.ERROR_FETCHING_PURCHASE_HISTORY_ALL_RECEIPTS_INVALID));
                    } else {
                        this.$onSuccess.invoke(this.this$0.toMapOfReceiptHashesToRestoredPurchases(this.$filteredReceipts, tokensToSkusMap, this.$userData));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06671(AmazonBilling amazonBilling, Date date, boolean z10, Function1 function1, Function1 function12) {
                super(2);
                this.this$0 = amazonBilling;
                this.$requestStartTime = date;
                this.$filterOnlyActivePurchases = z10;
                this.$onSuccess = function1;
                this.$onError = function12;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((List<Receipt>) obj, (UserData) obj2);
                return L.f17438a;
            }

            public final void invoke(List<Receipt> receipts, UserData userData) {
                List list;
                AbstractC5504s.h(receipts, "receipts");
                AbstractC5504s.h(userData, "userData");
                this.this$0.trackAmazonQueryPurchasesRequestIfNeeded(true, this.$requestStartTime, receipts);
                if (this.$filterOnlyActivePurchases) {
                    AmazonBilling amazonBilling = this.this$0;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : receipts) {
                        Receipt receipt = (Receipt) obj;
                        if (receipt.getCancelDate() == null || receipt.getCancelDate().compareTo(amazonBilling.dateProvider.getNow()) > 0) {
                            arrayList.add(obj);
                        }
                    }
                    list = arrayList;
                } else {
                    list = receipts;
                }
                if (list.isEmpty()) {
                    this.$onSuccess.invoke(S.i());
                    return;
                }
                AmazonBilling amazonBilling2 = this.this$0;
                String userId = userData.getUserId();
                AbstractC5504s.g(userId, "userData.userId");
                amazonBilling2.getMissingSkusForReceipts(userId, list, new C06681(this.this$0, this.$onError, list, userData, this.$onSuccess));
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryPurchases$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass2 extends AbstractC5506u implements Function1 {
            final /* synthetic */ Function1 $onError;
            final /* synthetic */ Date $requestStartTime;
            final /* synthetic */ AmazonBilling this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AmazonBilling amazonBilling, Date date, Function1 function1) {
                super(1);
                this.this$0 = amazonBilling;
                this.$requestStartTime = date;
                this.$onError = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return L.f17438a;
            }

            public final void invoke(PurchasesError it) {
                AbstractC5504s.h(it, "it");
                this.this$0.trackAmazonQueryPurchasesRequestIfNeeded(false, this.$requestStartTime, null);
                this.$onError.invoke(it);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40761(Function1 function1, boolean z10, Function1 function12) {
            super(1);
            this.$onError = function1;
            this.$filterOnlyActivePurchases = z10;
            this.$onSuccess = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError != null) {
                this.$onError.invoke(purchasesError);
            } else {
                Date now = AmazonBilling.this.dateProvider.getNow();
                AmazonBilling.this.purchaseUpdatesHandler.queryPurchases(new C06671(AmazonBilling.this, now, this.$filterOnlyActivePurchases, this.$onSuccess, this.$onError), new AnonymousClass2(AmazonBilling.this, now, this.$onError));
            }
        }
    }

    public /* synthetic */ AmazonBilling(Context context, AmazonBackend amazonBackend, AmazonCache amazonCache, boolean z10, Handler handler, PurchasesStateProvider purchasesStateProvider, DiagnosticsTracker diagnosticsTracker, PurchasingServiceProvider purchasingServiceProvider, ProductDataResponseListener productDataResponseListener, PurchaseResponseListener purchaseResponseListener, PurchaseUpdatesResponseListener purchaseUpdatesResponseListener, UserDataResponseListener userDataResponseListener, DateProvider dateProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        Handler handler2;
        ProductDataResponseListener productDataHandler;
        PurchasingServiceProvider defaultPurchasingServiceProvider = (i10 & 128) != 0 ? new DefaultPurchasingServiceProvider() : purchasingServiceProvider;
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            handler2 = handler;
            productDataHandler = new ProductDataHandler(defaultPurchasingServiceProvider, handler2);
        } else {
            handler2 = handler;
            productDataHandler = productDataResponseListener;
        }
        this(context, amazonBackend, amazonCache, z10, handler, purchasesStateProvider, diagnosticsTracker, defaultPurchasingServiceProvider, productDataHandler, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new PurchaseHandler(defaultPurchasingServiceProvider, context, diagnosticsTracker, null, 8, null) : purchaseResponseListener, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? new PurchaseUpdatesHandler(defaultPurchasingServiceProvider) : purchaseUpdatesResponseListener, (i10 & 2048) != 0 ? new UserDataHandler(defaultPurchasingServiceProvider, handler2, null, 4, null) : userDataResponseListener, (i10 & 4096) != 0 ? new DefaultDateProvider() : dateProvider);
    }

    private final void executePendingRequests() {
        synchronized (this) {
            while (getConnected() && !this.serviceRequests.isEmpty()) {
                try {
                    final Function1 function1Remove = this.serviceRequests.remove();
                    runOnUIThread(new Runnable() { // from class: com.revenuecat.purchases.amazon.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            function1Remove.invoke(null);
                        }
                    });
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            L l10 = L.f17438a;
        }
    }

    private final synchronized void executeRequestOnUIThread(Function1 request) {
        try {
            if (getPurchasesUpdatedListener() != null) {
                this.serviceRequests.add(request);
                if (getConnected()) {
                    executePendingRequests();
                } else {
                    BillingAbstract.startConnectionOnMainThread$default(this, 0L, 1, null);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getMissingSkusForReceipts(String amazonUserID, List<Receipt> receipts, Function2 onCompletion) {
        Map<String, String> receiptSkus = this.cache.getReceiptSkus();
        Map mapB = S.B(receiptSkus);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<Receipt> arrayList = new ArrayList();
        for (Object obj : receipts) {
            if (((Receipt) obj).getProductType() != ProductType.SUBSCRIPTION) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(arrayList, 10));
        for (Receipt receipt : arrayList) {
            arrayList2.add(z.a(receipt.getReceiptId(), receipt.getSku()));
        }
        S.s(mapB, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : receipts) {
            if (((Receipt) obj2).getProductType() == ProductType.SUBSCRIPTION) {
                arrayList3.add(obj2);
            }
        }
        ArrayList<Receipt> arrayList4 = new ArrayList();
        for (Object obj3 : arrayList3) {
            if (!receiptSkus.containsKey(((Receipt) obj3).getReceiptId())) {
                arrayList4.add(obj3);
            }
        }
        if (arrayList4.isEmpty()) {
            onCompletion.invoke(mapB, linkedHashMap);
            return;
        }
        kotlin.jvm.internal.L l10 = new kotlin.jvm.internal.L();
        l10.f52257a = arrayList4.size();
        for (Receipt receipt2 : arrayList4) {
            AmazonBackend amazonBackend = this.amazonBackend;
            String receiptId = receipt2.getReceiptId();
            AbstractC5504s.g(receiptId, "receipt.receiptId");
            Function2 function2 = onCompletion;
            AmazonBilling$getMissingSkusForReceipts$1$1 amazonBilling$getMissingSkusForReceipts$1$1 = new AmazonBilling$getMissingSkusForReceipts$1$1(mapB, receipt2, l10, this, function2, linkedHashMap);
            Map map = mapB;
            mapB = map;
            amazonBackend.getAmazonReceiptData(receiptId, amazonUserID, amazonBilling$getMissingSkusForReceipts$1$1, new AmazonBilling$getMissingSkusForReceipts$1$2(linkedHashMap, receipt2, l10, function2, map));
            onCompletion = function2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getTermSkuFromJSON(JSONObject response) {
        try {
            return response.getString(com.amazon.a.a.o.b.f34619L);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleReceipt(Receipt receipt, UserData userData, StoreProduct storeProduct, PresentedOfferingContext presentedOfferingContext) {
        if (receipt.getProductType() != ProductType.SUBSCRIPTION) {
            StoreTransaction storeTransaction = StoreTransactionConversionsKt.toStoreTransaction(receipt, storeProduct.getId(), presentedOfferingContext, PurchaseState.PURCHASED, userData);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesUpdated(AbstractC2279u.e(storeTransaction));
                return;
            }
            return;
        }
        AmazonBackend amazonBackend = this.amazonBackend;
        String receiptId = receipt.getReceiptId();
        AbstractC5504s.g(receiptId, "receipt.receiptId");
        String userId = userData.getUserId();
        AbstractC5504s.g(userId, "userData.userId");
        amazonBackend.getAmazonReceiptData(receiptId, userId, new C40701(receipt, presentedOfferingContext, userData, this), new C40712(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logErrorsIfAny(Map<String, PurchasesError> errors) {
        if (errors.isEmpty()) {
            return;
        }
        String strW0 = AbstractC2279u.w0(errors.keySet(), "\n", null, null, 0, null, null, 62, null);
        LogIntent logIntent = LogIntent.AMAZON_ERROR;
        AmazonBilling$logErrorsIfAny$$inlined$log$1 amazonBilling$logErrorsIfAny$$inlined$log$1 = new AmazonBilling$logErrorsIfAny$$inlined$log$1(logIntent, strW0);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke());
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    currentLogHandler4.d("[Purchases] - " + logLevel4.name(), (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke());
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    currentLogHandler6.d("[Purchases] - " + logLevel6.name(), (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke());
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    currentLogHandler7.d("[Purchases] - " + logLevel7.name(), (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke());
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler8.w("[Purchases] - " + logLevel8.name(), (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler9.w("[Purchases] - " + logLevel9.name(), (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler10.w("[Purchases] - " + logLevel10.name(), (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke(), null);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPurchaseError(PurchasesError error) {
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
        if (purchasesUpdatedListener != null) {
            purchasesUpdatedListener.onPurchasesFailedToUpdate(error);
        }
    }

    private final void runOnUIThread(Runnable runnable) {
        if (AbstractC5504s.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            runnable.run();
        } else {
            this.mainHandler.post(runnable);
        }
    }

    private final boolean shouldFinishTransactions() {
        LogHandler currentLogHandler;
        String str;
        String str2;
        if (this.finishTransactions) {
            return true;
        }
        LogIntent logIntent = LogIntent.AMAZON_WARNING;
        AmazonBilling$shouldFinishTransactions$$inlined$log$1 amazonBilling$shouldFinishTransactions$$inlined$log$1 = new AmazonBilling$shouldFinishTransactions$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) > 0) {
                    return false;
                }
                str = "[Purchases] - " + logLevel.name();
                str2 = (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke();
                break;
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke(), null);
                return false;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) > 0) {
                    return false;
                }
                currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke());
                return false;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) > 0) {
                    return false;
                }
                currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke());
                return false;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) > 0) {
                    return false;
                }
                str = "[Purchases] - " + logLevel4.name();
                str2 = (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke();
                break;
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke(), null);
                return false;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) > 0) {
                    return false;
                }
                currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke());
                return false;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) > 0) {
                    return false;
                }
                str = "[Purchases] - " + logLevel6.name();
                str2 = (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke();
                break;
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) > 0) {
                    return false;
                }
                str = "[Purchases] - " + logLevel7.name();
                str2 = (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke();
                break;
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) > 0) {
                    return false;
                }
                currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke());
                return false;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) > 0) {
                    return false;
                }
                currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke());
                return false;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke(), null);
                return false;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) > 0) {
                    return false;
                }
                currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke());
                return false;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke(), null);
                return false;
            default:
                return false;
        }
        currentLogHandler.d(str, str2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, StoreTransaction> toMapOfReceiptHashesToRestoredPurchases(List<Receipt> list, Map<String, String> map, UserData userData) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        for (Receipt receipt : list) {
            String str3 = map.get(receipt.getReceiptId());
            Pair pairA = null;
            if (str3 == null) {
                LogIntent logIntent = LogIntent.AMAZON_ERROR;
                AmazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1 amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1 = new AmazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1(logIntent);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            str = "[Purchases] - " + logLevel.name();
                            str2 = (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke());
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke());
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            str = "[Purchases] - " + logLevel4.name();
                            str2 = (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke());
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            str = "[Purchases] - " + logLevel6.name();
                            str2 = (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            str = "[Purchases] - " + logLevel7.name();
                            str2 = (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke());
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke());
                        }
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke());
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke(), null);
                        break;
                }
            } else {
                StoreTransaction storeTransaction = StoreTransactionConversionsKt.toStoreTransaction(receipt, str3, null, PurchaseState.UNSPECIFIED_STATE, userData);
                String receiptId = receipt.getReceiptId();
                AbstractC5504s.g(receiptId, "receipt.receiptId");
                pairA = z.a(UtilsKt.sha1(receiptId), storeTransaction);
            }
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        return S.w(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackAmazonQueryProductDetailsRequestIfNeeded(boolean wasSuccessful, Date requestStartTime, Set<String> requestedProductIds) {
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            diagnosticsTracker.m231trackAmazonQueryProductDetailsRequestKLykuaI(DurationExtensionsKt.between(Ef.a.f5961b, requestStartTime, this.dateProvider.getNow()), wasSuccessful, requestedProductIds);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackAmazonQueryPurchasesRequestIfNeeded(boolean wasSuccessful, Date requestStartTime, List<Receipt> receipts) {
        ArrayList arrayList;
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            long jBetween = DurationExtensionsKt.between(Ef.a.f5961b, requestStartTime, this.dateProvider.getNow());
            if (receipts != null) {
                arrayList = new ArrayList(AbstractC2279u.x(receipts, 10));
                Iterator<T> it = receipts.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Receipt) it.next()).getSku());
                }
            } else {
                arrayList = null;
            }
            diagnosticsTracker.m232trackAmazonQueryPurchasesRequestKLykuaI(jBetween, wasSuccessful, arrayList);
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void consumeAndSave(boolean finishTransactions, StoreTransaction purchase, boolean shouldConsume, PostReceiptInitiationSource initiationSource) {
        AbstractC5504s.h(purchase, "purchase");
        AbstractC5504s.h(initiationSource, "initiationSource");
        if (!shouldFinishTransactions() || purchase.getType() == com.revenuecat.purchases.ProductType.UNKNOWN || purchase.getPurchaseState() == PurchaseState.PENDING) {
            return;
        }
        if (finishTransactions) {
            executeRequestOnUIThread(new AnonymousClass1(purchase));
        }
        this.cache.addSuccessfullyPostedToken(purchase.getPurchaseToken(), purchase.getIsAutoRenewing());
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void findPurchaseInPurchaseHistory(String appUserID, com.revenuecat.purchases.ProductType productType, String productId, Function1 onCompletion, Function1 onError) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        AbstractC5504s.h(appUserID, "appUserID");
        AbstractC5504s.h(productType, "productType");
        AbstractC5504s.h(productId, "productId");
        AbstractC5504s.h(onCompletion, "onCompletion");
        AbstractC5504s.h(onError, "onError");
        LogIntent logIntent = LogIntent.DEBUG;
        AmazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1 amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1 = new AmazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1(logIntent, productId, productType);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke(), null);
                break;
        }
        queryAllPurchases(appUserID, new AnonymousClass2(onCompletion, productId, onError), onError);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void getAmazonLWAConsentStatus(Function1 onSuccess, Function1 onError) {
        AbstractC5504s.h(onSuccess, "onSuccess");
        AbstractC5504s.h(onError, "onError");
        executeRequestOnUIThread(new C40681(onError, onSuccess));
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener
    public void getProductData(Set<String> skus, String marketplace, Function1 onReceive, Function1 onError) {
        AbstractC5504s.h(skus, "skus");
        AbstractC5504s.h(marketplace, "marketplace");
        AbstractC5504s.h(onReceive, "onReceive");
        AbstractC5504s.h(onError, "onError");
        this.productDataHandler.getProductData(skus, marketplace, onReceive, onError);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void getStorefront(Function1 onSuccess, Function1 onError) {
        AbstractC5504s.h(onSuccess, "onSuccess");
        AbstractC5504s.h(onError, "onError");
        executeRequestOnUIThread(new C40691(onError, onSuccess));
    }

    @Override // com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void getUserData(Function1 onSuccess, Function1 onError) {
        AbstractC5504s.h(onSuccess, "onSuccess");
        AbstractC5504s.h(onError, "onError");
        this.userDataHandler.getUserData(onSuccess, onError);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    /* JADX INFO: renamed from: isConnected, reason: from getter */
    public boolean getConnected() {
        return this.connected;
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void makePurchaseAsync(Activity activity, String appUserID, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, PresentedOfferingContext presentedOfferingContext, Boolean isPersonalizedPrice) {
        AbstractC5504s.h(activity, "activity");
        AbstractC5504s.h(appUserID, "appUserID");
        AbstractC5504s.h(purchasingData, "purchasingData");
        AmazonPurchasingData.Product product = purchasingData instanceof AmazonPurchasingData.Product ? (AmazonPurchasingData.Product) purchasingData : null;
        if (product == null) {
            PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.UnknownError;
            String str = String.format(PurchaseStrings.INVALID_PURCHASE_TYPE, Arrays.copyOf(new Object[]{"Amazon", "AmazonPurchaseInfo"}, 2));
            AbstractC5504s.g(str, "format(...)");
            PurchasesError purchasesError = new PurchasesError(purchasesErrorCode, str);
            LogUtilsKt.errorLog(purchasesError);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesFailedToUpdate(purchasesError);
            }
            return;
        }
        AmazonStoreProduct storeProduct = product.getStoreProduct();
        if (shouldFinishTransactions()) {
            if (replaceProductInfo == null) {
                executeRequestOnUIThread(new C40722(activity, appUserID, storeProduct, presentedOfferingContext));
                return;
            }
            LogIntent logIntent = LogIntent.AMAZON_WARNING;
            AmazonBilling$makePurchaseAsync$$inlined$log$1 amazonBilling$makePurchaseAsync$$inlined$log$1 = new AmazonBilling$makePurchaseAsync$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.d("[Purchases] - " + logLevel.name(), (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        currentLogHandler4.d("[Purchases] - " + logLevel4.name(), (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        currentLogHandler6.d("[Purchases] - " + logLevel6.name(), (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        currentLogHandler7.d("[Purchases] - " + logLevel7.name(), (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler8.w("[Purchases] - " + logLevel8.name(), (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler9.w("[Purchases] - " + logLevel9.name(), (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke());
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler10.w("[Purchases] - " + logLevel10.name(), (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke(), null);
                    break;
            }
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void normalizePurchaseData(String productID, String purchaseToken, String storeUserID, Function1 onSuccess, Function1 onError) {
        AbstractC5504s.h(productID, "productID");
        AbstractC5504s.h(purchaseToken, "purchaseToken");
        AbstractC5504s.h(storeUserID, "storeUserID");
        AbstractC5504s.h(onSuccess, "onSuccess");
        AbstractC5504s.h(onError, "onError");
        String str = this.cache.getReceiptSkus().get(purchaseToken);
        if (str != null) {
            onSuccess.invoke(str);
        } else {
            this.amazonBackend.getAmazonReceiptData(purchaseToken, storeUserID, new C40732(onError, purchaseToken, onSuccess), new AnonymousClass3(onError));
        }
    }

    @Override // com.amazon.device.iap.PurchasingListener, com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onProductDataResponse(ProductDataResponse response) {
        AbstractC5504s.h(response, "response");
        if (shouldFinishTransactions()) {
            this.productDataHandler.onProductDataResponse(response);
        }
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener, com.amazon.device.iap.PurchasingListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onPurchaseResponse(PurchaseResponse response) {
        AbstractC5504s.h(response, "response");
        if (shouldFinishTransactions()) {
            this.purchaseHandler.onPurchaseResponse(response);
        }
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener, com.amazon.device.iap.PurchasingListener, com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onPurchaseUpdatesResponse(PurchaseUpdatesResponse response) {
        AbstractC5504s.h(response, "response");
        if (shouldFinishTransactions()) {
            this.purchaseUpdatesHandler.onPurchaseUpdatesResponse(response);
        }
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener, com.amazon.device.iap.PurchasingListener, com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener
    public void onUserDataResponse(UserDataResponse response) {
        AbstractC5504s.h(response, "response");
        if (shouldFinishTransactions()) {
            this.userDataHandler.onUserDataResponse(response);
        }
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseResponseListener
    public void purchase(Handler mainHandler, Activity activity, String appUserID, StoreProduct storeProduct, Function2 onSuccess, Function1 onError) {
        AbstractC5504s.h(mainHandler, "mainHandler");
        AbstractC5504s.h(activity, "activity");
        AbstractC5504s.h(appUserID, "appUserID");
        AbstractC5504s.h(storeProduct, "storeProduct");
        AbstractC5504s.h(onSuccess, "onSuccess");
        AbstractC5504s.h(onError, "onError");
        this.purchaseHandler.purchase(mainHandler, activity, appUserID, storeProduct, onSuccess, onError);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryAllPurchases(String appUserID, Function1 onReceivePurchaseHistory, Function1 onReceivePurchaseHistoryError) {
        AbstractC5504s.h(appUserID, "appUserID");
        AbstractC5504s.h(onReceivePurchaseHistory, "onReceivePurchaseHistory");
        AbstractC5504s.h(onReceivePurchaseHistoryError, "onReceivePurchaseHistoryError");
        queryPurchases(false, (Function1) new C40741(onReceivePurchaseHistory), onReceivePurchaseHistoryError);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryProductDetailsAsync(com.revenuecat.purchases.ProductType productType, Set<String> productIds, Function1 onReceive, Function1 onError) {
        AbstractC5504s.h(productType, "productType");
        AbstractC5504s.h(productIds, "productIds");
        AbstractC5504s.h(onReceive, "onReceive");
        AbstractC5504s.h(onError, "onError");
        if (shouldFinishTransactions()) {
            executeRequestOnUIThread(new C40751(onError, productIds, onReceive));
        }
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener
    public void queryPurchases(Function2 onSuccess, Function1 onError) {
        AbstractC5504s.h(onSuccess, "onSuccess");
        AbstractC5504s.h(onError, "onError");
        this.purchaseUpdatesHandler.queryPurchases(onSuccess, onError);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> inAppMessageTypes, InterfaceC5082a subscriptionStatusChange) {
        AbstractC5504s.h(activity, "activity");
        AbstractC5504s.h(inAppMessageTypes, "inAppMessageTypes");
        AbstractC5504s.h(subscriptionStatusChange, "subscriptionStatusChange");
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void startConnection() {
        if (shouldFinishTransactions()) {
            this.purchasingServiceProvider.registerListener(this.applicationContext, this);
            this.connected = true;
            BillingAbstract.StateListener stateListener = getStateListener();
            if (stateListener != null) {
                stateListener.onConnected();
            }
            executePendingRequests();
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void startConnectionOnMainThread(long delayMilliseconds) {
        runOnUIThread(new Runnable() { // from class: com.revenuecat.purchases.amazon.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f44030a.startConnection();
            }
        });
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryPurchases(String appUserID, Function1 onSuccess, Function1 onError) {
        AbstractC5504s.h(appUserID, "appUserID");
        AbstractC5504s.h(onSuccess, "onSuccess");
        AbstractC5504s.h(onError, "onError");
        if (shouldFinishTransactions()) {
            queryPurchases(true, onSuccess, onError);
        }
    }

    private final void queryPurchases(boolean filterOnlyActivePurchases, Function1 onSuccess, Function1 onError) {
        executeRequestOnUIThread(new C40761(onError, filterOnlyActivePurchases, onSuccess));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonBilling(Context applicationContext, AmazonBackend amazonBackend, AmazonCache cache, boolean z10, Handler mainHandler, PurchasesStateProvider stateProvider, DiagnosticsTracker diagnosticsTracker, PurchasingServiceProvider purchasingServiceProvider, ProductDataResponseListener productDataHandler, PurchaseResponseListener purchaseHandler, PurchaseUpdatesResponseListener purchaseUpdatesHandler, UserDataResponseListener userDataHandler, DateProvider dateProvider) {
        super(stateProvider);
        AbstractC5504s.h(applicationContext, "applicationContext");
        AbstractC5504s.h(amazonBackend, "amazonBackend");
        AbstractC5504s.h(cache, "cache");
        AbstractC5504s.h(mainHandler, "mainHandler");
        AbstractC5504s.h(stateProvider, "stateProvider");
        AbstractC5504s.h(purchasingServiceProvider, "purchasingServiceProvider");
        AbstractC5504s.h(productDataHandler, "productDataHandler");
        AbstractC5504s.h(purchaseHandler, "purchaseHandler");
        AbstractC5504s.h(purchaseUpdatesHandler, "purchaseUpdatesHandler");
        AbstractC5504s.h(userDataHandler, "userDataHandler");
        AbstractC5504s.h(dateProvider, "dateProvider");
        this.applicationContext = applicationContext;
        this.amazonBackend = amazonBackend;
        this.cache = cache;
        this.finishTransactions = z10;
        this.mainHandler = mainHandler;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.purchasingServiceProvider = purchasingServiceProvider;
        this.productDataHandler = productDataHandler;
        this.purchaseHandler = purchaseHandler;
        this.purchaseUpdatesHandler = purchaseUpdatesHandler;
        this.userDataHandler = userDataHandler;
        this.dateProvider = dateProvider;
        this.serviceRequests = new ConcurrentLinkedQueue<>();
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    protected void endConnection() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmazonBilling(Context applicationContext, DeviceCache cache, boolean z10, Handler mainHandler, BackendHelper backendHelper, PurchasesStateProvider stateProvider, DiagnosticsTracker diagnosticsTracker) {
        this(applicationContext, new AmazonBackend(backendHelper), new AmazonCache(cache), z10, mainHandler, stateProvider, diagnosticsTracker, null, null, null, null, null, null, 8064, null);
        AbstractC5504s.h(applicationContext, "applicationContext");
        AbstractC5504s.h(cache, "cache");
        AbstractC5504s.h(mainHandler, "mainHandler");
        AbstractC5504s.h(backendHelper, "backendHelper");
        AbstractC5504s.h(stateProvider, "stateProvider");
    }
}
