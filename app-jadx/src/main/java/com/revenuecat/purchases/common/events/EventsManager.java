package com.revenuecat.purchases.common.events;

import Cf.i;
import Cf.l;
import Df.r;
import Ef.a;
import Ef.c;
import Ef.d;
import Td.L;
import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import Wf.AbstractC2358b;
import Wf.u;
import app.notifee.core.event.LogEvent;
import com.amazon.a.a.o.c.a.b;
import com.revenuecat.purchases.DebugEvent;
import com.revenuecat.purchases.DebugEventListener;
import com.revenuecat.purchases.DebugEventName;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.ads.events.AdEvent;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.FileHelper;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.events.BackendStoredEvent;
import com.revenuecat.purchases.customercenter.events.CustomerCenterImpressionEvent;
import com.revenuecat.purchases.customercenter.events.CustomerCenterSurveyOptionChosenEvent;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.paywalls.events.CustomPaywallEvent;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.paywalls.events.PaywallStoredEvent;
import com.revenuecat.purchases.utils.EventsFileHelper;
import com.revenuecat.purchases.utils.RateLimiter;
import ie.InterfaceC5082a;
import ie.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 H2\u00020\u0001:\u0001HB\u0087\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012<\u0010\u0015\u001a8\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0012\u0012\u0004\u0012\u00020\u00110\r\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\u001bJ\u000f\u0010\"\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\"\u0010\u001bJ\u000f\u0010#\u001a\u00020\u0011H\u0002¢\u0006\u0004\b#\u0010\u001bJ\u000f\u0010$\u001a\u00020\u0011H\u0002¢\u0006\u0004\b$\u0010\u001bJ\u0017\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070%H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050%H\u0002¢\u0006\u0004\b(\u0010'J'\u0010*\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u000f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\u00112\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00104R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00104R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00105R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00106RJ\u0010\u0015\u001a8\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0012\u0012\u0004\u0012\u00020\u00110\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00107R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00108R.\u0010;\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u0001098F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001e\u0010E\u001a\u00020\u00142\u0006\u0010D\u001a\u00020\u00148B@BX\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001e\u0010G\u001a\u00020\u00142\u0006\u0010D\u001a\u00020\u00148B@BX\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010F¨\u0006I"}, d2 = {"Lcom/revenuecat/purchases/common/events/EventsManager;", "", "Ljava/util/UUID;", "appSessionID", "Lcom/revenuecat/purchases/utils/EventsFileHelper;", "Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "legacyEventsFileHelper", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "fileHelper", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lcom/revenuecat/purchases/common/Dispatcher;", "eventsDispatcher", "Lkotlin/Function4;", "Lcom/revenuecat/purchases/common/events/EventsRequest;", "Lcom/revenuecat/purchases/common/Delay;", "Lkotlin/Function0;", "LTd/L;", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/PurchasesError;", "", "postEvents", "Lcom/revenuecat/purchases/utils/RateLimiter;", "priorityFlushRateLimiter", "<init>", "(Ljava/util/UUID;Lcom/revenuecat/purchases/utils/EventsFileHelper;Lcom/revenuecat/purchases/utils/EventsFileHelper;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/common/Dispatcher;Lie/p;Lcom/revenuecat/purchases/utils/RateLimiter;)V", "checkFileSizeAndClearIfNeeded", "()V", "", "batchNumber", "delay", "flushNextBatch", "(ILcom/revenuecat/purchases/common/Delay;)V", "performPriorityFlush", "onFlushComplete", "startPendingPriorityFlushIfNeeded", "flushLegacyEvents", "", "getStoredEvents", "()Ljava/util/List;", "getLegacyPaywallsStoredEvents", "command", "enqueue", "(Lcom/revenuecat/purchases/common/Delay;Lie/a;)V", "Lcom/revenuecat/purchases/common/events/FeatureEvent;", "event", "track", "(Lcom/revenuecat/purchases/common/events/FeatureEvent;)V", "flushEvents", "(Lcom/revenuecat/purchases/common/Delay;)V", "appSessionID$1", "Ljava/util/UUID;", "Lcom/revenuecat/purchases/utils/EventsFileHelper;", "Lcom/revenuecat/purchases/identity/IdentityManager;", "Lcom/revenuecat/purchases/common/Dispatcher;", "Lie/p;", "Lcom/revenuecat/purchases/utils/RateLimiter;", "Lcom/revenuecat/purchases/DebugEventListener;", "value", "debugEventListener", "Lcom/revenuecat/purchases/DebugEventListener;", "getDebugEventListener", "()Lcom/revenuecat/purchases/DebugEventListener;", "setDebugEventListener", "(Lcom/revenuecat/purchases/DebugEventListener;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "flushInProgress", "Ljava/util/concurrent/atomic/AtomicBoolean;", "<set-?>", "pendingPriorityFlush", "Z", "legacyFlushTriggered", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EventsManager {
    public static final String AD_EVENTS_FILE_PATH = "RevenueCat/event_store/ad_event_store.jsonl";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String EVENTS_FILE_PATH_NEW = "RevenueCat/event_store/event_store.jsonl";
    public static final int EVENTS_TO_CLEAR_ON_LIMIT = 50;
    public static final double FILE_SIZE_LIMIT_KB = 2048.0d;
    private static final int FLUSH_COUNT = 50;
    private static final int MAX_FLUSH_BATCHES = 10;
    private static final String PAYWALL_EVENTS_FILE_PATH = "RevenueCat/paywall_event_store/paywall_event_store.jsonl";
    private static final UUID appSessionID;
    private static final AbstractC2358b json;

    /* JADX INFO: renamed from: appSessionID$1, reason: from kotlin metadata */
    private final UUID appSessionID;
    private DebugEventListener debugEventListener;
    private final Dispatcher eventsDispatcher;
    private final EventsFileHelper<BackendStoredEvent> fileHelper;
    private AtomicBoolean flushInProgress;
    private final IdentityManager identityManager;
    private final EventsFileHelper<PaywallStoredEvent> legacyEventsFileHelper;
    private boolean legacyFlushTriggered;
    private boolean pendingPriorityFlush;
    private final p postEvents;
    private final RateLimiter priorityFlushRateLimiter;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\tJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\tR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087T¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\u0003R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087T¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0014\u0010\u0003R\u001a\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\u0003R\u001a\u0010\u001a\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0013R\u0014\u0010#\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0013R\u0014\u0010$\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010 ¨\u0006%"}, d2 = {"Lcom/revenuecat/purchases/common/events/EventsManager$Companion;", "", "<init>", "()V", "Lcom/revenuecat/purchases/common/FileHelper;", "fileHelper", "Lcom/revenuecat/purchases/utils/EventsFileHelper;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "backendEvents", "(Lcom/revenuecat/purchases/common/FileHelper;)Lcom/revenuecat/purchases/utils/EventsFileHelper;", "adEvents", "Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "paywalls", "", "FILE_SIZE_LIMIT_KB", "D", "getFILE_SIZE_LIMIT_KB$annotations", "", "EVENTS_TO_CLEAR_ON_LIMIT", "I", "getEVENTS_TO_CLEAR_ON_LIMIT$annotations", "LWf/b;", "json", "LWf/b;", "getJson$annotations", "Ljava/util/UUID;", "appSessionID", "Ljava/util/UUID;", "getAppSessionID$purchases_defaultsBc8Release", "()Ljava/util/UUID;", "", "AD_EVENTS_FILE_PATH", "Ljava/lang/String;", "EVENTS_FILE_PATH_NEW", "FLUSH_COUNT", "MAX_FLUSH_BATCHES", "PAYWALL_EVENTS_FILE_PATH", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EventsFileHelper<BackendStoredEvent> adEvents(FileHelper fileHelper) {
            AbstractC5504s.h(fileHelper, "fileHelper");
            return new EventsFileHelper<>(fileHelper, EventsManager.AD_EVENTS_FILE_PATH, EventsManager$Companion$adEvents$1.INSTANCE, EventsManager$Companion$adEvents$2.INSTANCE);
        }

        public final EventsFileHelper<BackendStoredEvent> backendEvents(FileHelper fileHelper) {
            AbstractC5504s.h(fileHelper, "fileHelper");
            return new EventsFileHelper<>(fileHelper, EventsManager.EVENTS_FILE_PATH_NEW, EventsManager$Companion$backendEvents$1.INSTANCE, EventsManager$Companion$backendEvents$2.INSTANCE);
        }

        public final UUID getAppSessionID$purchases_defaultsBc8Release() {
            return EventsManager.appSessionID;
        }

        public final EventsFileHelper<PaywallStoredEvent> paywalls(FileHelper fileHelper) {
            AbstractC5504s.h(fileHelper, "fileHelper");
            return new EventsFileHelper<>(fileHelper, EventsManager.PAYWALL_EVENTS_FILE_PATH, EventsManager$Companion$paywalls$1.INSTANCE, new EventsManager$Companion$paywalls$2(PaywallStoredEvent.INSTANCE));
        }

        private Companion() {
        }

        public static /* synthetic */ void getEVENTS_TO_CLEAR_ON_LIMIT$annotations() {
        }

        public static /* synthetic */ void getFILE_SIZE_LIMIT_KB$annotations() {
        }

        private static /* synthetic */ void getJson$annotations() {
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.events.EventsManager$flushEvents$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ Delay $delay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Delay delay) {
            super(0);
            this.$delay = delay;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m245invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m245invoke() {
            if (EventsManager.this.flushInProgress.getAndSet(true)) {
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), "Flush already in progress.");
                    return;
                }
                return;
            }
            DebugEventListener debugEventListener = EventsManager.this.getDebugEventListener();
            if (debugEventListener != null) {
                debugEventListener.onDebugEventReceived(new DebugEvent(DebugEventName.FLUSH_STARTED, null, 2, null));
            }
            EventsManager.this.flushNextBatch(1, this.$delay);
            if (EventsManager.this.legacyFlushTriggered) {
                return;
            }
            EventsManager.this.legacyFlushTriggered = true;
            EventsManager.this.flushLegacyEvents();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.events.EventsManager$flushLegacyEvents$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40831 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ EventsFileHelper<PaywallStoredEvent> $legacyEventsFileHelper;

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.events.EventsManager$flushLegacyEvents$1$4, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass4 extends AbstractC5506u implements InterfaceC5082a {
            final /* synthetic */ EventsFileHelper<PaywallStoredEvent> $legacyEventsFileHelper;
            final /* synthetic */ List<PaywallStoredEvent> $storedLegacyEventsWithNullValues;
            final /* synthetic */ EventsManager this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.common.events.EventsManager$flushLegacyEvents$1$4$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            static final class AnonymousClass2 extends AbstractC5506u implements InterfaceC5082a {
                final /* synthetic */ EventsFileHelper<PaywallStoredEvent> $legacyEventsFileHelper;
                final /* synthetic */ List<PaywallStoredEvent> $storedLegacyEventsWithNullValues;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(EventsFileHelper<PaywallStoredEvent> eventsFileHelper, List<PaywallStoredEvent> list) {
                    super(0);
                    this.$legacyEventsFileHelper = eventsFileHelper;
                    this.$storedLegacyEventsWithNullValues = list;
                }

                @Override // ie.InterfaceC5082a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m248invoke();
                    return L.f17438a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m248invoke() {
                    this.$legacyEventsFileHelper.clear(this.$storedLegacyEventsWithNullValues.size());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(EventsManager eventsManager, EventsFileHelper<PaywallStoredEvent> eventsFileHelper, List<PaywallStoredEvent> list) {
                super(0);
                this.this$0 = eventsManager;
                this.$legacyEventsFileHelper = eventsFileHelper;
                this.$storedLegacyEventsWithNullValues = list;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m247invoke();
                return L.f17438a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m247invoke() {
                LogLevel logLevel = LogLevel.VERBOSE;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.v("[Purchases] - " + logLevel.name(), "Legacy event flush: success.");
                }
                EventsManager.enqueue$default(this.this$0, null, new AnonymousClass2(this.$legacyEventsFileHelper, this.$storedLegacyEventsWithNullValues), 1, null);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.events.EventsManager$flushLegacyEvents$1$5, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "", "shouldMarkAsSynced", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass5 extends AbstractC5506u implements Function2 {
            final /* synthetic */ EventsFileHelper<PaywallStoredEvent> $legacyEventsFileHelper;
            final /* synthetic */ List<PaywallStoredEvent> $storedLegacyEventsWithNullValues;
            final /* synthetic */ EventsManager this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.common.events.EventsManager$flushLegacyEvents$1$5$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            static final class AnonymousClass2 extends AbstractC5506u implements InterfaceC5082a {
                final /* synthetic */ EventsFileHelper<PaywallStoredEvent> $legacyEventsFileHelper;
                final /* synthetic */ boolean $shouldMarkAsSynced;
                final /* synthetic */ List<PaywallStoredEvent> $storedLegacyEventsWithNullValues;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(boolean z10, EventsFileHelper<PaywallStoredEvent> eventsFileHelper, List<PaywallStoredEvent> list) {
                    super(0);
                    this.$shouldMarkAsSynced = z10;
                    this.$legacyEventsFileHelper = eventsFileHelper;
                    this.$storedLegacyEventsWithNullValues = list;
                }

                @Override // ie.InterfaceC5082a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m249invoke();
                    return L.f17438a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m249invoke() {
                    if (this.$shouldMarkAsSynced) {
                        this.$legacyEventsFileHelper.clear(this.$storedLegacyEventsWithNullValues.size());
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(EventsManager eventsManager, EventsFileHelper<PaywallStoredEvent> eventsFileHelper, List<PaywallStoredEvent> list) {
                super(2);
                this.this$0 = eventsManager;
                this.$legacyEventsFileHelper = eventsFileHelper;
                this.$storedLegacyEventsWithNullValues = list;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
                return L.f17438a;
            }

            public final void invoke(PurchasesError error, boolean z10) {
                AbstractC5504s.h(error, "error");
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Legacy event flush error: " + error + b.f34706a, null);
                EventsManager.enqueue$default(this.this$0, null, new AnonymousClass2(z10, this.$legacyEventsFileHelper, this.$storedLegacyEventsWithNullValues), 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40831(EventsFileHelper<PaywallStoredEvent> eventsFileHelper) {
            super(0);
            this.$legacyEventsFileHelper = eventsFileHelper;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m246invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m246invoke() {
            List legacyPaywallsStoredEvents = EventsManager.this.getLegacyPaywallsStoredEvents();
            List listJ0 = AbstractC2279u.j0(legacyPaywallsStoredEvents);
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(listJ0, EventsManager.MAX_FLUSH_BATCHES));
            Iterator it = listJ0.iterator();
            while (it.hasNext()) {
                arrayList.add(new BackendStoredEvent.Paywalls(((PaywallStoredEvent) it.next()).toBackendEvent()));
            }
            if (listJ0.isEmpty()) {
                LogLevel logLevel = LogLevel.VERBOSE;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.v("[Purchases] - " + logLevel.name(), "No legacy events to sync. Skipping legacy flush.");
                    return;
                }
                return;
            }
            LogLevel logLevel2 = LogLevel.VERBOSE;
            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                currentLogHandler2.v("[Purchases] - " + logLevel2.name(), "Legacy event flush: posting " + arrayList.size() + " events.");
            }
            p pVar = EventsManager.this.postEvents;
            ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(arrayList, EventsManager.MAX_FLUSH_BATCHES));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(BackendStoredEventKt.toBackendEvent((BackendStoredEvent.Paywalls) it2.next()));
            }
            pVar.invoke(new EventsRequest(arrayList2), Delay.LONG, new AnonymousClass4(EventsManager.this, this.$legacyEventsFileHelper, legacyPaywallsStoredEvents), new AnonymousClass5(EventsManager.this, this.$legacyEventsFileHelper, legacyPaywallsStoredEvents));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.events.EventsManager$flushNextBatch$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass5 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ int $batchNumber;
        final /* synthetic */ long $batchStartTimeMillis;
        final /* synthetic */ Delay $delay;
        final /* synthetic */ List<BackendStoredEvent> $storedEventsWithNullValues;

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.events.EventsManager$flushNextBatch$5$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass2 extends AbstractC5506u implements InterfaceC5082a {
            final /* synthetic */ int $batchNumber;
            final /* synthetic */ Delay $delay;
            final /* synthetic */ List<BackendStoredEvent> $storedEventsWithNullValues;
            final /* synthetic */ EventsManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(EventsManager eventsManager, List<? extends BackendStoredEvent> list, int i10, Delay delay) {
                super(0);
                this.this$0 = eventsManager;
                this.$storedEventsWithNullValues = list;
                this.$batchNumber = i10;
                this.$delay = delay;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m251invoke();
                return L.f17438a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m251invoke() {
                this.this$0.fileHelper.clear(this.$storedEventsWithNullValues.size());
                this.this$0.flushNextBatch(this.$batchNumber + 1, this.$delay);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass5(int i10, long j10, List<? extends BackendStoredEvent> list, Delay delay) {
            super(0);
            this.$batchNumber = i10;
            this.$batchStartTimeMillis = j10;
            this.$storedEventsWithNullValues = list;
            this.$delay = delay;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m250invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m250invoke() {
            int i10 = this.$batchNumber;
            LogLevel logLevel = LogLevel.VERBOSE;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.v("[Purchases] - " + logLevel.name(), "New event flush (batch " + i10 + "): success.");
            }
            DebugEventListener debugEventListener = EventsManager.this.getDebugEventListener();
            if (debugEventListener != null) {
                debugEventListener.onDebugEventReceived(new DebugEvent(DebugEventName.FLUSH_COMPLETED, S.l(z.a("batch_number", String.valueOf(this.$batchNumber)), z.a("elapsed_millis", String.valueOf(System.currentTimeMillis() - this.$batchStartTimeMillis)))));
            }
            EventsManager eventsManager = EventsManager.this;
            EventsManager.enqueue$default(eventsManager, null, new AnonymousClass2(eventsManager, this.$storedEventsWithNullValues, this.$batchNumber, this.$delay), 1, null);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.events.EventsManager$flushNextBatch$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "", "shouldMarkAsSynced", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass6 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $batchNumber;
        final /* synthetic */ List<BackendStoredEvent> $storedEventsWithNullValues;

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.events.EventsManager$flushNextBatch$6$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass3 extends AbstractC5506u implements InterfaceC5082a {
            final /* synthetic */ boolean $shouldMarkAsSynced;
            final /* synthetic */ List<BackendStoredEvent> $storedEventsWithNullValues;
            final /* synthetic */ EventsManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(boolean z10, EventsManager eventsManager, List<? extends BackendStoredEvent> list) {
                super(0);
                this.$shouldMarkAsSynced = z10;
                this.this$0 = eventsManager;
                this.$storedEventsWithNullValues = list;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m252invoke();
                return L.f17438a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m252invoke() {
                if (this.$shouldMarkAsSynced) {
                    this.this$0.fileHelper.clear(this.$storedEventsWithNullValues.size());
                }
                this.this$0.onFlushComplete();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass6(int i10, List<? extends BackendStoredEvent> list) {
            super(2);
            this.$batchNumber = i10;
            this.$storedEventsWithNullValues = list;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
            return L.f17438a;
        }

        public final void invoke(PurchasesError error, boolean z10) {
            AbstractC5504s.h(error, "error");
            int i10 = this.$batchNumber;
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "New event flush (batch " + i10 + ") error: " + error + b.f34706a, null);
            DebugEventListener debugEventListener = EventsManager.this.getDebugEventListener();
            if (debugEventListener != null) {
                DebugEventName debugEventName = DebugEventName.FLUSH_ERROR;
                Map mapC = S.c();
                mapC.put("errorCode", error.getCode().name());
                String underlyingErrorMessage = error.getUnderlyingErrorMessage();
                if (underlyingErrorMessage != null) {
                    mapC.put("underlyingErrorMessage", r.s1(underlyingErrorMessage, 80));
                }
                L l10 = L.f17438a;
                debugEventListener.onDebugEventReceived(new DebugEvent(debugEventName, S.b(mapC)));
            }
            EventsManager eventsManager = EventsManager.this;
            EventsManager.enqueue$default(eventsManager, null, new AnonymousClass3(z10, eventsManager, this.$storedEventsWithNullValues), 1, null);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.events.EventsManager$getLegacyPaywallsStoredEvents$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LCf/i;", "Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "sequence", "LTd/L;", "invoke", "(LCf/i;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40841 extends AbstractC5506u implements Function1 {
        final /* synthetic */ N $events;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40841(N n10) {
            super(1);
            this.$events = n10;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((i) obj);
            return L.f17438a;
        }

        public final void invoke(i sequence) {
            AbstractC5504s.h(sequence, "sequence");
            this.$events.f52259a = l.T(l.Q(sequence, 50));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.events.EventsManager$getStoredEvents$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LCf/i;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "sequence", "LTd/L;", "invoke", "(LCf/i;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40851 extends AbstractC5506u implements Function1 {
        final /* synthetic */ N $events;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40851(N n10) {
            super(1);
            this.$events = n10;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((i) obj);
            return L.f17438a;
        }

        public final void invoke(i sequence) {
            AbstractC5504s.h(sequence, "sequence");
            this.$events.f52259a = l.T(l.Q(sequence, 50));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.events.EventsManager$track$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40861 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ FeatureEvent $event;
        final /* synthetic */ EventsManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40861(FeatureEvent featureEvent, EventsManager eventsManager) {
            super(0);
            this.$event = featureEvent;
            this.this$0 = eventsManager;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m253invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m253invoke() {
            BackendStoredEvent backendStoredEvent;
            FeatureEvent featureEvent = this.$event;
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            Config config = Config.INSTANCE;
            if (config.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d("[Purchases] - " + logLevel.name(), "Tracking event: " + featureEvent);
            }
            FeatureEvent featureEvent2 = this.$event;
            if (featureEvent2 instanceof PaywallEvent) {
                backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((PaywallEvent) featureEvent2, this.this$0.identityManager.getCurrentAppUserID());
            } else if (featureEvent2 instanceof CustomerCenterImpressionEvent) {
                String currentAppUserID = this.this$0.identityManager.getCurrentAppUserID();
                String string = this.this$0.appSessionID.toString();
                AbstractC5504s.g(string, "appSessionID.toString()");
                backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((CustomerCenterImpressionEvent) featureEvent2, currentAppUserID, string);
            } else if (featureEvent2 instanceof CustomerCenterSurveyOptionChosenEvent) {
                String currentAppUserID2 = this.this$0.identityManager.getCurrentAppUserID();
                String string2 = this.this$0.appSessionID.toString();
                AbstractC5504s.g(string2, "appSessionID.toString()");
                backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((CustomerCenterSurveyOptionChosenEvent) featureEvent2, currentAppUserID2, string2);
            } else if (featureEvent2 instanceof AdEvent.Displayed) {
                String currentAppUserID3 = this.this$0.identityManager.getCurrentAppUserID();
                String string3 = this.this$0.appSessionID.toString();
                AbstractC5504s.g(string3, "appSessionID.toString()");
                backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((AdEvent.Displayed) featureEvent2, currentAppUserID3, string3);
            } else if (featureEvent2 instanceof AdEvent.Open) {
                String currentAppUserID4 = this.this$0.identityManager.getCurrentAppUserID();
                String string4 = this.this$0.appSessionID.toString();
                AbstractC5504s.g(string4, "appSessionID.toString()");
                backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((AdEvent.Open) featureEvent2, currentAppUserID4, string4);
            } else if (featureEvent2 instanceof AdEvent.Revenue) {
                String currentAppUserID5 = this.this$0.identityManager.getCurrentAppUserID();
                String string5 = this.this$0.appSessionID.toString();
                AbstractC5504s.g(string5, "appSessionID.toString()");
                backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((AdEvent.Revenue) featureEvent2, currentAppUserID5, string5);
            } else if (featureEvent2 instanceof AdEvent.Loaded) {
                String currentAppUserID6 = this.this$0.identityManager.getCurrentAppUserID();
                String string6 = this.this$0.appSessionID.toString();
                AbstractC5504s.g(string6, "appSessionID.toString()");
                backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((AdEvent.Loaded) featureEvent2, currentAppUserID6, string6);
            } else if (featureEvent2 instanceof AdEvent.FailedToLoad) {
                String currentAppUserID7 = this.this$0.identityManager.getCurrentAppUserID();
                String string7 = this.this$0.appSessionID.toString();
                AbstractC5504s.g(string7, "appSessionID.toString()");
                backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((AdEvent.FailedToLoad) featureEvent2, currentAppUserID7, string7);
            } else if (featureEvent2 instanceof CustomPaywallEvent.Impression) {
                String currentAppUserID8 = this.this$0.identityManager.getCurrentAppUserID();
                String string8 = this.this$0.appSessionID.toString();
                AbstractC5504s.g(string8, "appSessionID.toString()");
                backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((CustomPaywallEvent.Impression) featureEvent2, currentAppUserID8, string8);
            } else {
                backendStoredEvent = null;
            }
            if (backendStoredEvent != null) {
                this.this$0.checkFileSizeAndClearIfNeeded();
                this.this$0.fileHelper.appendEvent(backendStoredEvent);
                if (this.$event.isPriorityEvent()) {
                    this.this$0.performPriorityFlush();
                    return;
                }
                return;
            }
            FeatureEvent featureEvent3 = this.$event;
            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
            if (config.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler2.d("[Purchases] - " + logLevel.name(), "Backend event not implemented for: " + featureEvent3);
            }
        }
    }

    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC5504s.g(uuidRandomUUID, "randomUUID()");
        appSessionID = uuidRandomUUID;
        json = u.b(null, EventsManager$Companion$json$1.INSTANCE, 1, null);
    }

    public EventsManager(UUID appSessionID2, EventsFileHelper<PaywallStoredEvent> eventsFileHelper, EventsFileHelper<BackendStoredEvent> fileHelper, IdentityManager identityManager, Dispatcher eventsDispatcher, p postEvents, RateLimiter priorityFlushRateLimiter) {
        AbstractC5504s.h(appSessionID2, "appSessionID");
        AbstractC5504s.h(fileHelper, "fileHelper");
        AbstractC5504s.h(identityManager, "identityManager");
        AbstractC5504s.h(eventsDispatcher, "eventsDispatcher");
        AbstractC5504s.h(postEvents, "postEvents");
        AbstractC5504s.h(priorityFlushRateLimiter, "priorityFlushRateLimiter");
        this.appSessionID = appSessionID2;
        this.legacyEventsFileHelper = eventsFileHelper;
        this.fileHelper = fileHelper;
        this.identityManager = identityManager;
        this.eventsDispatcher = eventsDispatcher;
        this.postEvents = postEvents;
        this.priorityFlushRateLimiter = priorityFlushRateLimiter;
        this.flushInProgress = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkFileSizeAndClearIfNeeded() {
        if (this.fileHelper.fileSizeInKB() >= 2048.0d) {
            LogLevel logLevel = LogLevel.WARN;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.w("[Purchases] - " + logLevel.name(), "Event store size limit reached. Clearing oldest events to free up space.");
            }
            this.fileHelper.clear(50);
            DebugEventListener debugEventListener = this.debugEventListener;
            if (debugEventListener != null) {
                debugEventListener.onDebugEventReceived(new DebugEvent(DebugEventName.FILE_SIZE_LIMIT_REACHED, null, 2, null));
            }
        }
    }

    private final void enqueue(Delay delay, final InterfaceC5082a command) {
        this.eventsDispatcher.enqueue(new Runnable() { // from class: com.revenuecat.purchases.common.events.a
            @Override // java.lang.Runnable
            public final void run() {
                command.invoke();
            }
        }, delay);
    }

    static /* synthetic */ void enqueue$default(EventsManager eventsManager, Delay delay, InterfaceC5082a interfaceC5082a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            delay = Delay.NONE;
        }
        eventsManager.enqueue(delay, interfaceC5082a);
    }

    public static /* synthetic */ void flushEvents$default(EventsManager eventsManager, Delay delay, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            delay = Delay.DEFAULT;
        }
        eventsManager.flushEvents(delay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void flushLegacyEvents() {
        EventsFileHelper<PaywallStoredEvent> eventsFileHelper = this.legacyEventsFileHelper;
        if (eventsFileHelper == null) {
            return;
        }
        enqueue$default(this, null, new C40831(eventsFileHelper), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void flushNextBatch(int batchNumber, Delay delay) {
        DebugEventListener debugEventListener;
        if (batchNumber > MAX_FLUSH_BATCHES) {
            LogLevel logLevel = LogLevel.VERBOSE;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.v("[Purchases] - " + logLevel.name(), "Reached maximum number of flush batches (10). Stopping flush.");
            }
            onFlushComplete();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<BackendStoredEvent> storedEvents = getStoredEvents();
        List listJ0 = AbstractC2279u.j0(storedEvents);
        if (listJ0.isEmpty()) {
            LogLevel logLevel2 = LogLevel.VERBOSE;
            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                currentLogHandler2.v("[Purchases] - " + logLevel2.name(), "No new events to sync.");
            }
            if (batchNumber == 1 && (debugEventListener = this.debugEventListener) != null) {
                debugEventListener.onDebugEventReceived(new DebugEvent(DebugEventName.FLUSH_SKIPPED_NO_EVENTS, null, 2, null));
            }
            onFlushComplete();
            return;
        }
        LogLevel logLevel3 = LogLevel.VERBOSE;
        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
            currentLogHandler3.v("[Purchases] - " + logLevel3.name(), "New event flush (batch " + batchNumber + "): posting " + listJ0.size() + " events.");
        }
        p pVar = this.postEvents;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listJ0, MAX_FLUSH_BATCHES));
        Iterator it = listJ0.iterator();
        while (it.hasNext()) {
            arrayList.add(BackendStoredEventKt.toBackendEvent((BackendStoredEvent) it.next()));
        }
        pVar.invoke(new EventsRequest(arrayList), delay, new AnonymousClass5(batchNumber, jCurrentTimeMillis, storedEvents, delay), new AnonymousClass6(batchNumber, storedEvents));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<PaywallStoredEvent> getLegacyPaywallsStoredEvents() {
        N n10 = new N();
        n10.f52259a = AbstractC2279u.m();
        EventsFileHelper<PaywallStoredEvent> eventsFileHelper = this.legacyEventsFileHelper;
        if (eventsFileHelper != null) {
            eventsFileHelper.readFile(new C40841(n10));
        }
        return (List) n10.f52259a;
    }

    private final List<BackendStoredEvent> getStoredEvents() {
        N n10 = new N();
        n10.f52259a = AbstractC2279u.m();
        this.fileHelper.readFile(new C40851(n10));
        return (List) n10.f52259a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFlushComplete() {
        this.flushInProgress.set(false);
        startPendingPriorityFlushIfNeeded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performPriorityFlush() {
        this.pendingPriorityFlush = true;
        if (!this.flushInProgress.get()) {
            startPendingPriorityFlushIfNeeded();
            return;
        }
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "Flush in progress. Queuing priority flush.");
        }
    }

    private final void startPendingPriorityFlushIfNeeded() {
        if (this.pendingPriorityFlush) {
            this.pendingPriorityFlush = false;
            if (!this.priorityFlushRateLimiter.shouldProceed()) {
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), "Priority flush rate limited. Skipping.");
                    return;
                }
                return;
            }
            if (this.flushInProgress.getAndSet(true)) {
                LogLevel logLevel2 = LogLevel.DEBUG;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.d("[Purchases] - " + logLevel2.name(), "Flush in progress. Queuing priority flush.");
                }
                this.pendingPriorityFlush = true;
                return;
            }
            LogLevel logLevel3 = LogLevel.DEBUG;
            LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                currentLogHandler3.d("[Purchases] - " + logLevel3.name(), "Starting priority flush.");
            }
            flushNextBatch(1, Delay.NONE);
        }
    }

    public final synchronized void flushEvents(Delay delay) {
        AbstractC5504s.h(delay, "delay");
        enqueue$default(this, null, new AnonymousClass1(delay), 1, null);
    }

    public final synchronized DebugEventListener getDebugEventListener() {
        return this.debugEventListener;
    }

    public final synchronized void setDebugEventListener(DebugEventListener debugEventListener) {
        try {
            this.debugEventListener = debugEventListener;
            this.fileHelper.setDebugEventCallback(debugEventListener != null ? new EventsManager$debugEventListener$callback$1$1(debugEventListener) : null);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void track(FeatureEvent event) {
        AbstractC5504s.h(event, "event");
        enqueue$default(this, null, new C40861(event, this), 1, null);
    }

    public /* synthetic */ EventsManager(UUID uuid, EventsFileHelper eventsFileHelper, EventsFileHelper eventsFileHelper2, IdentityManager identityManager, Dispatcher dispatcher, p pVar, RateLimiter rateLimiter, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        uuid = (i10 & 1) != 0 ? appSessionID : uuid;
        if ((i10 & 64) != 0) {
            a.C0060a c0060a = Ef.a.f5961b;
            rateLimiter = new RateLimiter(5, c.s(60, d.f5971e), null);
        }
        this(uuid, eventsFileHelper, eventsFileHelper2, identityManager, dispatcher, pVar, rateLimiter);
    }
}
