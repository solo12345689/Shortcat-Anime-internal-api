package com.revenuecat.purchases.common.offerings;

import Td.L;
import Ud.S;
import Ud.a0;
import android.os.Handler;
import android.os.Looper;
import app.notifee.core.event.LogEvent;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.GetOfferingsErrorHandlingBehavior;
import com.revenuecat.purchases.common.HTTPResponseOriginalSource;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.paywalls.OfferingFontPreDownloader;
import com.revenuecat.purchases.utils.OfferingImagePreDownloader;
import ie.InterfaceC5082a;
import java.util.Date;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u001b\b\u0000\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015Js\u0010\"\u001a2\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001a0\u001f\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001a0\u001f0\u001e2\u0006\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\"\u0010#J[\u0010*\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020 2\u0018\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001a0\u001f2\u0018\u0010)\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001a0\u001fH\u0002¢\u0006\u0004\b*\u0010+JE\u0010-\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018H\u0002¢\u0006\u0004\b-\u0010.JW\u00104\u001a\u00020\u001a2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u000e2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00182\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018H\u0002¢\u0006\u0004\b4\u00105J-\u00107\u001a\u00020\u001a2\u0006\u00106\u001a\u00020\u00192\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018H\u0002¢\u0006\u0004\b7\u00108J\u001d\u0010;\u001a\u00020\u001a2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001a09H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u001aH\u0002¢\u0006\u0004\b=\u0010>JI\u0010B\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010'\u001a\u00020 2\b\u00106\u001a\u0004\u0018\u00010\u00192\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010?2\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010?H\u0002¢\u0006\u0004\bB\u0010CJW\u0010E\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u000e2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00182\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00182\b\b\u0002\u0010D\u001a\u00020\u000e¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\u001a¢\u0006\u0004\bG\u0010>J\u0015\u0010H\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\bH\u0010IJM\u0010J\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u000e2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00182\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018¢\u0006\u0004\bJ\u0010KR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010LR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010MR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010NR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010OR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010PR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010QR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010RR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010SR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010TR\u0014\u0010U\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0013\u0010Y\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\bW\u0010X¨\u0006Z"}, d2 = {"Lcom/revenuecat/purchases/common/offerings/OfferingsManager;", "", "Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "offeringsCache", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;", "offeringsFactory", "Lcom/revenuecat/purchases/utils/OfferingImagePreDownloader;", "offeringImagePreDownloader", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/paywalls/OfferingFontPreDownloader;", "offeringFontPreDownloader", "", "uiPreviewMode", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "Landroid/os/Handler;", "mainHandler", "<init>", "(Lcom/revenuecat/purchases/common/offerings/OfferingsCache;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;Lcom/revenuecat/purchases/utils/OfferingImagePreDownloader;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/paywalls/OfferingFontPreDownloader;ZLcom/revenuecat/purchases/common/DateProvider;Landroid/os/Handler;)V", "Ljava/util/Date;", "startTime", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "LTd/L;", "onError", "Lcom/revenuecat/purchases/Offerings;", "onSuccess", "Lkotlin/Pair;", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker$CacheStatus;", "Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;", "createTrackedOfferingsCallbacks", "(Ljava/util/Date;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;", "", "appUserID", "appInBackground", "cacheStatus", "onErrorTracked", "onSuccessTracked", "fetchOfferingsFromNetwork", "(Ljava/lang/String;ZLcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker$CacheStatus;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "cachedOfferings", "vendCachedOfferingsAndMaybeRefresh", "(Ljava/lang/String;ZLcom/revenuecat/purchases/Offerings;Ljava/util/Date;Lkotlin/jvm/functions/Function1;)V", "Lorg/json/JSONObject;", "offeringsJSON", "Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;", "originalDataSource", "loadedFromDiskCache", "createAndCacheOfferings", "(Lorg/json/JSONObject;Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", LogEvent.LEVEL_ERROR, "handleErrorFetchingOfferings", "(Lcom/revenuecat/purchases/PurchasesError;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "action", "dispatch", "(Lie/a;)V", "trackGetOfferingsStartedIfNeeded", "()V", "", "requestedProductIds", "notFoundProductIds", "trackGetOfferingsResultIfNeeded", "(Ljava/util/Date;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker$CacheStatus;Lcom/revenuecat/purchases/PurchasesError;Ljava/util/Set;Ljava/util/Set;)V", "fetchCurrent", "getOfferings", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)V", "clearInMemoryOfferingsCache", "onAppForeground", "(Ljava/lang/String;)V", "fetchAndCacheOfferings", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;", "Lcom/revenuecat/purchases/utils/OfferingImagePreDownloader;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Lcom/revenuecat/purchases/paywalls/OfferingFontPreDownloader;", "Z", "Lcom/revenuecat/purchases/common/DateProvider;", "Landroid/os/Handler;", "emptyOfferings", "Lcom/revenuecat/purchases/Offerings;", "getCachedCurrentOfferingIdentifier", "()Ljava/lang/String;", "cachedCurrentOfferingIdentifier", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OfferingsManager {
    private final Backend backend;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final Offerings emptyOfferings;
    private final Handler mainHandler;
    private final OfferingFontPreDownloader offeringFontPreDownloader;
    private final OfferingImagePreDownloader offeringImagePreDownloader;
    private final OfferingsCache offeringsCache;
    private final OfferingsFactory offeringsFactory;
    private final boolean uiPreviewMode;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DiagnosticsTracker.CacheStatus.values().length];
            try {
                iArr[DiagnosticsTracker.CacheStatus.NOT_CHECKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DiagnosticsTracker.CacheStatus.NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$createAndCacheOfferings$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
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

        public final void invoke(PurchasesError error) {
            AbstractC5504s.h(error, "error");
            OfferingsManager.this.handleErrorFetchingOfferings(error, this.$onError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$createAndCacheOfferings$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;", "offeringsResultData", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass2 extends AbstractC5506u implements Function1 {
        final /* synthetic */ JSONObject $offeringsJSON;
        final /* synthetic */ Function1 $onSuccess;

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$createAndCacheOfferings$2$2 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C06702 extends AbstractC5506u implements InterfaceC5082a {
            final /* synthetic */ OfferingsResultData $offeringsResultData;
            final /* synthetic */ Function1 $onSuccess;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06702(Function1 function1, OfferingsResultData offeringsResultData) {
                super(0);
                this.$onSuccess = function1;
                this.$offeringsResultData = offeringsResultData;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m254invoke();
                return L.f17438a;
            }

            /* JADX INFO: renamed from: invoke */
            public final void m254invoke() {
                Function1 function1 = this.$onSuccess;
                if (function1 != null) {
                    function1.invoke(this.$offeringsResultData);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(JSONObject jSONObject, Function1 function1) {
            super(1);
            this.$offeringsJSON = jSONObject;
            this.$onSuccess = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((OfferingsResultData) obj);
            return L.f17438a;
        }

        public final void invoke(OfferingsResultData offeringsResultData) {
            AbstractC5504s.h(offeringsResultData, "offeringsResultData");
            Offering current = offeringsResultData.getOfferings().getCurrent();
            if (current != null) {
                OfferingsManager.this.offeringImagePreDownloader.preDownloadOfferingImages(current);
            }
            OfferingsManager.this.offeringFontPreDownloader.preDownloadOfferingFontsIfNeeded(offeringsResultData.getOfferings());
            OfferingsManager.this.offeringsCache.cacheOfferings(offeringsResultData.getOfferings(), this.$offeringsJSON);
            OfferingsManager.this.dispatch(new C06702(this.$onSuccess, offeringsResultData));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$fetchAndCacheOfferings$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40891 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ Function1 $onSuccess;
        final /* synthetic */ OfferingsManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40891(Function1 function1, OfferingsManager offeringsManager) {
            super(0);
            this.$onSuccess = function1;
            this.this$0 = offeringsManager;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m255invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m255invoke() {
            Function1 function1 = this.$onSuccess;
            if (function1 != null) {
                function1.invoke(new OfferingsResultData(this.this$0.emptyOfferings, a0.d(), a0.d()));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$fetchAndCacheOfferings$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lorg/json/JSONObject;", "body", "Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;", "originalDataSource", "LTd/L;", "invoke", "(Lorg/json/JSONObject;Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass3 extends AbstractC5506u implements Function2 {
        final /* synthetic */ Function1 $onError;
        final /* synthetic */ Function1 $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Function1 function1, Function1 function12) {
            super(2);
            this.$onError = function1;
            this.$onSuccess = function12;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((JSONObject) obj, (HTTPResponseOriginalSource) obj2);
            return L.f17438a;
        }

        public final void invoke(JSONObject body, HTTPResponseOriginalSource originalDataSource) {
            AbstractC5504s.h(body, "body");
            AbstractC5504s.h(originalDataSource, "originalDataSource");
            OfferingsManager.this.createAndCacheOfferings(body, originalDataSource, false, this.$onError, this.$onSuccess);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$fetchAndCacheOfferings$4 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "backendError", "Lcom/revenuecat/purchases/common/GetOfferingsErrorHandlingBehavior;", "errorBehavior", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/GetOfferingsErrorHandlingBehavior;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass4 extends AbstractC5506u implements Function2 {
        final /* synthetic */ Function1 $onError;
        final /* synthetic */ Function1 $onSuccess;

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$fetchAndCacheOfferings$4$WhenMappings */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[GetOfferingsErrorHandlingBehavior.values().length];
                try {
                    iArr[GetOfferingsErrorHandlingBehavior.SHOULD_FALLBACK_TO_CACHED_OFFERINGS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[GetOfferingsErrorHandlingBehavior.SHOULD_NOT_FALLBACK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(Function1 function1, Function1 function12) {
            super(2);
            this.$onError = function1;
            this.$onSuccess = function12;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((PurchasesError) obj, (GetOfferingsErrorHandlingBehavior) obj2);
            return L.f17438a;
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0080  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void invoke(com.revenuecat.purchases.PurchasesError r7, com.revenuecat.purchases.common.GetOfferingsErrorHandlingBehavior r8) {
            /*
                r6 = this;
                java.lang.String r0 = "backendError"
                kotlin.jvm.internal.AbstractC5504s.h(r7, r0)
                java.lang.String r0 = "errorBehavior"
                kotlin.jvm.internal.AbstractC5504s.h(r8, r0)
                int[] r0 = com.revenuecat.purchases.common.offerings.OfferingsManager.AnonymousClass4.WhenMappings.$EnumSwitchMapping$0
                int r8 = r8.ordinal()
                r8 = r0[r8]
                r0 = 1
                if (r8 == r0) goto L21
                r0 = 2
                if (r8 == r0) goto L19
                return
            L19:
                com.revenuecat.purchases.common.offerings.OfferingsManager r8 = com.revenuecat.purchases.common.offerings.OfferingsManager.this
                kotlin.jvm.functions.Function1 r0 = r6.$onError
                com.revenuecat.purchases.common.offerings.OfferingsManager.access$handleErrorFetchingOfferings(r8, r7, r0)
                return
            L21:
                com.revenuecat.purchases.common.offerings.OfferingsManager r8 = com.revenuecat.purchases.common.offerings.OfferingsManager.this
                com.revenuecat.purchases.common.offerings.OfferingsCache r8 = com.revenuecat.purchases.common.offerings.OfferingsManager.access$getOfferingsCache$p(r8)
                org.json.JSONObject r1 = r8.getCachedOfferingsResponse()
                if (r1 != 0) goto L35
                com.revenuecat.purchases.common.offerings.OfferingsManager r8 = com.revenuecat.purchases.common.offerings.OfferingsManager.this
                kotlin.jvm.functions.Function1 r0 = r6.$onError
                com.revenuecat.purchases.common.offerings.OfferingsManager.access$handleErrorFetchingOfferings(r8, r7, r0)
                return
            L35:
                com.revenuecat.purchases.LogLevel r7 = com.revenuecat.purchases.LogLevel.WARN
                com.revenuecat.purchases.LogHandler r8 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler()
                com.revenuecat.purchases.common.Config r0 = com.revenuecat.purchases.common.Config.INSTANCE
                com.revenuecat.purchases.LogLevel r0 = r0.getLogLevel()
                int r0 = r0.compareTo(r7)
                if (r0 > 0) goto L61
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "[Purchases] - "
                r0.append(r2)
                java.lang.String r7 = r7.name()
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                java.lang.String r0 = "Error fetching offerings. Using disk cache."
                r8.w(r7, r0)
            L61:
                java.lang.String r7 = "rc_original_source"
                java.lang.String r7 = com.revenuecat.purchases.utils.JSONObjectExtensionsKt.optNullableString(r1, r7)
                if (r7 == 0) goto L80
                com.revenuecat.purchases.common.HTTPResponseOriginalSource r7 = com.revenuecat.purchases.common.HTTPResponseOriginalSource.valueOf(r7)     // Catch: java.lang.IllegalArgumentException -> L6e
                goto L7c
            L6e:
                r0 = move-exception
                r7 = r0
                com.revenuecat.purchases.LogHandler r8 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler()
                java.lang.String r0 = "[Purchases] - ERROR"
                java.lang.String r2 = "Invalid original data source for cached offerings"
                r8.e(r0, r2, r7)
                r7 = 0
            L7c:
                if (r7 == 0) goto L80
            L7e:
                r2 = r7
                goto L83
            L80:
                com.revenuecat.purchases.common.HTTPResponseOriginalSource r7 = com.revenuecat.purchases.common.HTTPResponseOriginalSource.MAIN
                goto L7e
            L83:
                com.revenuecat.purchases.common.offerings.OfferingsManager r0 = com.revenuecat.purchases.common.offerings.OfferingsManager.this
                kotlin.jvm.functions.Function1 r4 = r6.$onError
                kotlin.jvm.functions.Function1 r5 = r6.$onSuccess
                r3 = 1
                com.revenuecat.purchases.common.offerings.OfferingsManager.access$createAndCacheOfferings(r0, r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.offerings.OfferingsManager.AnonymousClass4.invoke(com.revenuecat.purchases.PurchasesError, com.revenuecat.purchases.common.GetOfferingsErrorHandlingBehavior):void");
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$fetchOfferingsFromNetwork$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40902 extends AbstractC5506u implements Function1 {
        final /* synthetic */ DiagnosticsTracker.CacheStatus $cacheStatus;
        final /* synthetic */ Function2 $onErrorTracked;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40902(Function2 function2, DiagnosticsTracker.CacheStatus cacheStatus) {
            super(1);
            this.$onErrorTracked = function2;
            this.$cacheStatus = cacheStatus;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError it) {
            AbstractC5504s.h(it, "it");
            this.$onErrorTracked.invoke(it, this.$cacheStatus);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$fetchOfferingsFromNetwork$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40913 extends AbstractC5506u implements Function1 {
        final /* synthetic */ DiagnosticsTracker.CacheStatus $cacheStatus;
        final /* synthetic */ Function2 $onSuccessTracked;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40913(Function2 function2, DiagnosticsTracker.CacheStatus cacheStatus) {
            super(1);
            this.$onSuccessTracked = function2;
            this.$cacheStatus = cacheStatus;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((OfferingsResultData) obj);
            return L.f17438a;
        }

        public final void invoke(OfferingsResultData it) {
            AbstractC5504s.h(it, "it");
            this.$onSuccessTracked.invoke(it, this.$cacheStatus);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$getOfferings$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40921 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ Function1 $onSuccess;
        final /* synthetic */ OfferingsManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40921(Function1 function1, OfferingsManager offeringsManager) {
            super(0);
            this.$onSuccess = function1;
            this.this$0 = offeringsManager;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m256invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m256invoke() {
            Function1 function1 = this.$onSuccess;
            if (function1 != null) {
                function1.invoke(this.this$0.emptyOfferings);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$handleErrorFetchingOfferings$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40932 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ PurchasesError $error;
        final /* synthetic */ Function1 $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40932(Function1 function1, PurchasesError purchasesError) {
            super(0);
            this.$onError = function1;
            this.$error = purchasesError;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m257invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m257invoke() {
            Function1 function1 = this.$onError;
            if (function1 != null) {
                function1.invoke(this.$error);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$vendCachedOfferingsAndMaybeRefresh$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40942 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ Offerings $cachedOfferings;
        final /* synthetic */ Function1 $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40942(Function1 function1, Offerings offerings) {
            super(0);
            this.$onSuccess = function1;
            this.$cachedOfferings = offerings;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m258invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m258invoke() {
            Function1 function1 = this.$onSuccess;
            if (function1 != null) {
                function1.invoke(this.$cachedOfferings);
            }
        }
    }

    public OfferingsManager(OfferingsCache offeringsCache, Backend backend, OfferingsFactory offeringsFactory, OfferingImagePreDownloader offeringImagePreDownloader, DiagnosticsTracker diagnosticsTracker, OfferingFontPreDownloader offeringFontPreDownloader, boolean z10, DateProvider dateProvider, Handler handler) {
        AbstractC5504s.h(offeringsCache, "offeringsCache");
        AbstractC5504s.h(backend, "backend");
        AbstractC5504s.h(offeringsFactory, "offeringsFactory");
        AbstractC5504s.h(offeringImagePreDownloader, "offeringImagePreDownloader");
        AbstractC5504s.h(offeringFontPreDownloader, "offeringFontPreDownloader");
        AbstractC5504s.h(dateProvider, "dateProvider");
        this.offeringsCache = offeringsCache;
        this.backend = backend;
        this.offeringsFactory = offeringsFactory;
        this.offeringImagePreDownloader = offeringImagePreDownloader;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.offeringFontPreDownloader = offeringFontPreDownloader;
        this.uiPreviewMode = z10;
        this.dateProvider = dateProvider;
        this.mainHandler = handler;
        this.emptyOfferings = new Offerings(null, S.i());
    }

    public final void createAndCacheOfferings(JSONObject offeringsJSON, HTTPResponseOriginalSource originalDataSource, boolean loadedFromDiskCache, Function1 onError, Function1 onSuccess) {
        this.offeringsFactory.createOfferings(offeringsJSON, originalDataSource, loadedFromDiskCache, new AnonymousClass1(onError), new AnonymousClass2(offeringsJSON, onSuccess));
    }

    static /* synthetic */ void createAndCacheOfferings$default(OfferingsManager offeringsManager, JSONObject jSONObject, HTTPResponseOriginalSource hTTPResponseOriginalSource, boolean z10, Function1 function1, Function1 function12, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function1 = null;
        }
        if ((i10 & 16) != 0) {
            function12 = null;
        }
        offeringsManager.createAndCacheOfferings(jSONObject, hTTPResponseOriginalSource, z10, function1, function12);
    }

    private final Pair<Function2, Function2> createTrackedOfferingsCallbacks(Date startTime, Function1 onError, Function1 onSuccess) {
        return new Pair<>(new OfferingsManager$createTrackedOfferingsCallbacks$onErrorWithTracking$1(this, startTime, onError), new OfferingsManager$createTrackedOfferingsCallbacks$onSuccessWithTracking$1(this, startTime, onSuccess));
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
        handler.post(new Runnable() { // from class: com.revenuecat.purchases.common.offerings.c
            @Override // java.lang.Runnable
            public final void run() {
                action.invoke();
            }
        });
    }

    public static /* synthetic */ void fetchAndCacheOfferings$default(OfferingsManager offeringsManager, String str, boolean z10, Function1 function1, Function1 function12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        if ((i10 & 8) != 0) {
            function12 = null;
        }
        offeringsManager.fetchAndCacheOfferings(str, z10, function1, function12);
    }

    private final void fetchOfferingsFromNetwork(String appUserID, boolean appInBackground, DiagnosticsTracker.CacheStatus cacheStatus, Function2 onErrorTracked, Function2 onSuccessTracked) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        OfferingsManager$fetchOfferingsFromNetwork$$inlined$log$1 offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1 = new OfferingsManager$fetchOfferingsFromNetwork$$inlined$log$1(logIntent, cacheStatus);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke(), null);
                break;
        }
        fetchAndCacheOfferings(appUserID, appInBackground, new C40902(onErrorTracked, cacheStatus), new C40913(onSuccessTracked, cacheStatus));
    }

    public static /* synthetic */ void getOfferings$default(OfferingsManager offeringsManager, String str, boolean z10, Function1 function1, Function1 function12, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        if ((i10 & 8) != 0) {
            function12 = null;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        offeringsManager.getOfferings(str, z10, function1, function12, z11);
    }

    public final void handleErrorFetchingOfferings(PurchasesError purchasesError, Function1 onError) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = a0.h(PurchasesErrorCode.ConfigurationError, PurchasesErrorCode.UnexpectedBackendResponseError).contains(purchasesError.getCode()) ? LogIntent.RC_ERROR : LogIntent.GOOGLE_ERROR;
        OfferingsManager$handleErrorFetchingOfferings$$inlined$log$1 offeringsManager$handleErrorFetchingOfferings$$inlined$log$1 = new OfferingsManager$handleErrorFetchingOfferings$$inlined$log$1(logIntent, purchasesError);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke(), null);
                break;
        }
        this.offeringsCache.forceCacheStale();
        dispatch(new C40932(onError, purchasesError));
    }

    public final void trackGetOfferingsResultIfNeeded(Date startTime, DiagnosticsTracker.CacheStatus cacheStatus, PurchasesError purchasesError, Set<String> requestedProductIds, Set<String> notFoundProductIds) {
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
        diagnosticsTracker.m234trackGetOfferingsResultB8UsjHI(requestedProductIds, notFoundProductIds, message, numValueOf, null, cacheStatus, jBetween);
    }

    private final void trackGetOfferingsStartedIfNeeded() {
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            diagnosticsTracker.trackGetOfferingsStarted();
        }
    }

    private final void vendCachedOfferingsAndMaybeRefresh(String appUserID, boolean appInBackground, Offerings cachedOfferings, Date startTime, Function1 onSuccess) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        OfferingsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1 offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1 = new OfferingsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1(logIntent);
        int[] iArr = LogWrapperKt.WhenMappings.$EnumSwitchMapping$0;
        switch (iArr[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke(), null);
                break;
        }
        boolean zIsOfferingsCacheStale = this.offeringsCache.isOfferingsCacheStale(appInBackground);
        trackGetOfferingsResultIfNeeded(startTime, zIsOfferingsCacheStale ? DiagnosticsTracker.CacheStatus.STALE : DiagnosticsTracker.CacheStatus.VALID, null, null, null);
        dispatch(new C40942(onSuccess, cachedOfferings));
        if (zIsOfferingsCacheStale) {
            OfferingsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2 offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2 = new OfferingsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2(logIntent, appInBackground);
            switch (iArr[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel11 = LogLevel.DEBUG;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        currentLogHandler8.d("[Purchases] - " + logLevel11.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel12 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler9.w("[Purchases] - " + logLevel12.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel13 = LogLevel.INFO;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler10.i("[Purchases] - " + logLevel13.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel14 = LogLevel.DEBUG;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        currentLogHandler11.d("[Purchases] - " + logLevel14.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel15 = LogLevel.INFO;
                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler12.i("[Purchases] - " + logLevel15.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel16 = LogLevel.DEBUG;
                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        currentLogHandler13.d("[Purchases] - " + logLevel16.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel17 = LogLevel.DEBUG;
                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        currentLogHandler14.d("[Purchases] - " + logLevel17.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel18 = LogLevel.WARN;
                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel19 = LogLevel.WARN;
                    LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel20 = LogLevel.WARN;
                    LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke(), null);
                    break;
            }
            fetchAndCacheOfferings$default(this, appUserID, appInBackground, null, null, 12, null);
        }
    }

    public final void clearInMemoryOfferingsCache() {
        this.offeringsCache.clearInMemoryOfferingsCache();
    }

    public final void fetchAndCacheOfferings(String appUserID, boolean appInBackground, Function1 onError, Function1 onSuccess) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        AbstractC5504s.h(appUserID, "appUserID");
        if (this.uiPreviewMode) {
            dispatch(new C40891(onSuccess, this));
            return;
        }
        LogIntent logIntent = LogIntent.RC_SUCCESS;
        OfferingsManager$fetchAndCacheOfferings$$inlined$log$1 offeringsManager$fetchAndCacheOfferings$$inlined$log$1 = new OfferingsManager$fetchAndCacheOfferings$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke(), null);
                break;
        }
        this.backend.getOfferings(appUserID, appInBackground, new AnonymousClass3(onError, onSuccess), new AnonymousClass4(onError, onSuccess));
    }

    public final String getCachedCurrentOfferingIdentifier() {
        Offering current;
        Offerings cachedOfferings = this.offeringsCache.getCachedOfferings();
        if (cachedOfferings == null || (current = cachedOfferings.getCurrent()) == null) {
            return null;
        }
        return current.getIdentifier();
    }

    public final void getOfferings(String appUserID, boolean appInBackground, Function1 onError, Function1 onSuccess, boolean fetchCurrent) {
        AbstractC5504s.h(appUserID, "appUserID");
        if (this.uiPreviewMode) {
            dispatch(new C40921(onSuccess, this));
            return;
        }
        trackGetOfferingsStartedIfNeeded();
        Date now = this.dateProvider.getNow();
        Pair<Function2, Function2> pairCreateTrackedOfferingsCallbacks = createTrackedOfferingsCallbacks(now, onError, onSuccess);
        Function2 function2 = (Function2) pairCreateTrackedOfferingsCallbacks.getFirst();
        Function2 function22 = (Function2) pairCreateTrackedOfferingsCallbacks.getSecond();
        Offerings cachedOfferings = this.offeringsCache.getCachedOfferings();
        if (fetchCurrent) {
            fetchOfferingsFromNetwork(appUserID, appInBackground, DiagnosticsTracker.CacheStatus.NOT_CHECKED, function2, function22);
        } else if (cachedOfferings == null) {
            fetchOfferingsFromNetwork(appUserID, appInBackground, DiagnosticsTracker.CacheStatus.NOT_FOUND, function2, function22);
        } else {
            vendCachedOfferingsAndMaybeRefresh(appUserID, appInBackground, cachedOfferings, now, onSuccess);
        }
    }

    public final void onAppForeground(String appUserID) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        AbstractC5504s.h(appUserID, "appUserID");
        if (!this.uiPreviewMode && this.offeringsCache.isOfferingsCacheStale(false)) {
            LogIntent logIntent = LogIntent.DEBUG;
            OfferingsManager$onAppForeground$$inlined$log$1 offeringsManager$onAppForeground$$inlined$log$1 = new OfferingsManager$onAppForeground$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) offeringsManager$onAppForeground$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$onAppForeground$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) offeringsManager$onAppForeground$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) offeringsManager$onAppForeground$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) offeringsManager$onAppForeground$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$onAppForeground$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) offeringsManager$onAppForeground$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) offeringsManager$onAppForeground$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) offeringsManager$onAppForeground$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) offeringsManager$onAppForeground$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) offeringsManager$onAppForeground$$inlined$log$1.invoke());
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$onAppForeground$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) offeringsManager$onAppForeground$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$onAppForeground$$inlined$log$1.invoke(), null);
                    break;
            }
            fetchAndCacheOfferings$default(this, appUserID, false, null, null, 12, null);
        }
    }

    public /* synthetic */ OfferingsManager(OfferingsCache offeringsCache, Backend backend, OfferingsFactory offeringsFactory, OfferingImagePreDownloader offeringImagePreDownloader, DiagnosticsTracker diagnosticsTracker, OfferingFontPreDownloader offeringFontPreDownloader, boolean z10, DateProvider dateProvider, Handler handler, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(offeringsCache, backend, offeringsFactory, offeringImagePreDownloader, diagnosticsTracker, offeringFontPreDownloader, (i10 & 64) != 0 ? false : z10, (i10 & 128) != 0 ? new DefaultDateProvider() : dateProvider, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }
}
