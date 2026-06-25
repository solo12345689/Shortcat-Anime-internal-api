.class public final Lcom/revenuecat/purchases/common/events/EventsManager;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/common/events/EventsManager$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010 \n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000 H2\u00020\u0001:\u0001HB\u0087\u0001\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012<\u0010\u0015\u001a8\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0012\u0012\u0004\u0012\u00020\u00110\r\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008!\u0010\u001bJ\u000f\u0010\"\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\"\u0010\u001bJ\u000f\u0010#\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008#\u0010\u001bJ\u000f\u0010$\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008$\u0010\u001bJ\u0017\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070%H\u0002\u00a2\u0006\u0004\u0008&\u0010\'J\u0017\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050%H\u0002\u00a2\u0006\u0004\u0008(\u0010\'J\'\u0010*\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u000f2\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010H\u0002\u00a2\u0006\u0004\u0008*\u0010+J\u0015\u0010.\u001a\u00020\u00112\u0006\u0010-\u001a\u00020,\u00a2\u0006\u0004\u0008.\u0010/J\u0017\u00100\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u000f\u00a2\u0006\u0004\u00080\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u00104R\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u00104R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u00105R\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u00106RJ\u0010\u0015\u001a8\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0012\u0012\u0004\u0012\u00020\u00110\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u00107R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u00108R.\u0010;\u001a\u0004\u0018\u0001092\u0008\u0010:\u001a\u0004\u0018\u0001098F@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008;\u0010<\u001a\u0004\u0008=\u0010>\"\u0004\u0008?\u0010@R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008B\u0010CR\u001e\u0010E\u001a\u00020\u00142\u0006\u0010D\u001a\u00020\u00148B@BX\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008E\u0010FR\u001e\u0010G\u001a\u00020\u00142\u0006\u0010D\u001a\u00020\u00148B@BX\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008G\u0010F\u00a8\u0006I"
    }
    d2 = {
        "Lcom/revenuecat/purchases/common/events/EventsManager;",
        "",
        "Ljava/util/UUID;",
        "appSessionID",
        "Lcom/revenuecat/purchases/utils/EventsFileHelper;",
        "Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;",
        "legacyEventsFileHelper",
        "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;",
        "fileHelper",
        "Lcom/revenuecat/purchases/identity/IdentityManager;",
        "identityManager",
        "Lcom/revenuecat/purchases/common/Dispatcher;",
        "eventsDispatcher",
        "Lkotlin/Function4;",
        "Lcom/revenuecat/purchases/common/events/EventsRequest;",
        "Lcom/revenuecat/purchases/common/Delay;",
        "Lkotlin/Function0;",
        "LTd/L;",
        "Lkotlin/Function2;",
        "Lcom/revenuecat/purchases/PurchasesError;",
        "",
        "postEvents",
        "Lcom/revenuecat/purchases/utils/RateLimiter;",
        "priorityFlushRateLimiter",
        "<init>",
        "(Ljava/util/UUID;Lcom/revenuecat/purchases/utils/EventsFileHelper;Lcom/revenuecat/purchases/utils/EventsFileHelper;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/common/Dispatcher;Lie/p;Lcom/revenuecat/purchases/utils/RateLimiter;)V",
        "checkFileSizeAndClearIfNeeded",
        "()V",
        "",
        "batchNumber",
        "delay",
        "flushNextBatch",
        "(ILcom/revenuecat/purchases/common/Delay;)V",
        "performPriorityFlush",
        "onFlushComplete",
        "startPendingPriorityFlushIfNeeded",
        "flushLegacyEvents",
        "",
        "getStoredEvents",
        "()Ljava/util/List;",
        "getLegacyPaywallsStoredEvents",
        "command",
        "enqueue",
        "(Lcom/revenuecat/purchases/common/Delay;Lie/a;)V",
        "Lcom/revenuecat/purchases/common/events/FeatureEvent;",
        "event",
        "track",
        "(Lcom/revenuecat/purchases/common/events/FeatureEvent;)V",
        "flushEvents",
        "(Lcom/revenuecat/purchases/common/Delay;)V",
        "appSessionID$1",
        "Ljava/util/UUID;",
        "Lcom/revenuecat/purchases/utils/EventsFileHelper;",
        "Lcom/revenuecat/purchases/identity/IdentityManager;",
        "Lcom/revenuecat/purchases/common/Dispatcher;",
        "Lie/p;",
        "Lcom/revenuecat/purchases/utils/RateLimiter;",
        "Lcom/revenuecat/purchases/DebugEventListener;",
        "value",
        "debugEventListener",
        "Lcom/revenuecat/purchases/DebugEventListener;",
        "getDebugEventListener",
        "()Lcom/revenuecat/purchases/DebugEventListener;",
        "setDebugEventListener",
        "(Lcom/revenuecat/purchases/DebugEventListener;)V",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "flushInProgress",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "<set-?>",
        "pendingPriorityFlush",
        "Z",
        "legacyFlushTriggered",
        "Companion",
        "purchases_defaultsBc8Release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final AD_EVENTS_FILE_PATH:Ljava/lang/String; = "RevenueCat/event_store/ad_event_store.jsonl"

.field public static final Companion:Lcom/revenuecat/purchases/common/events/EventsManager$Companion;

.field public static final EVENTS_FILE_PATH_NEW:Ljava/lang/String; = "RevenueCat/event_store/event_store.jsonl"

.field public static final EVENTS_TO_CLEAR_ON_LIMIT:I = 0x32

.field public static final FILE_SIZE_LIMIT_KB:D = 2048.0

.field private static final FLUSH_COUNT:I = 0x32

.field private static final MAX_FLUSH_BATCHES:I = 0xa

.field private static final PAYWALL_EVENTS_FILE_PATH:Ljava/lang/String; = "RevenueCat/paywall_event_store/paywall_event_store.jsonl"

.field private static final appSessionID:Ljava/util/UUID;

.field private static final json:LWf/b;


# instance fields
.field private final appSessionID$1:Ljava/util/UUID;

.field private debugEventListener:Lcom/revenuecat/purchases/DebugEventListener;

.field private final eventsDispatcher:Lcom/revenuecat/purchases/common/Dispatcher;

.field private final fileHelper:Lcom/revenuecat/purchases/utils/EventsFileHelper;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/revenuecat/purchases/utils/EventsFileHelper<",
            "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;",
            ">;"
        }
    .end annotation
.end field

.field private flushInProgress:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final identityManager:Lcom/revenuecat/purchases/identity/IdentityManager;

.field private final legacyEventsFileHelper:Lcom/revenuecat/purchases/utils/EventsFileHelper;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/revenuecat/purchases/utils/EventsFileHelper<",
            "Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;",
            ">;"
        }
    .end annotation
.end field

.field private legacyFlushTriggered:Z

.field private pendingPriorityFlush:Z

.field private final postEvents:Lie/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lie/p;"
        }
    .end annotation
.end field

.field private final priorityFlushRateLimiter:Lcom/revenuecat/purchases/utils/RateLimiter;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/common/events/EventsManager$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/common/events/EventsManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/revenuecat/purchases/common/events/EventsManager;->Companion:Lcom/revenuecat/purchases/common/events/EventsManager$Companion;

    .line 8
    .line 9
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v2, "randomUUID()"

    .line 14
    .line 15
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lcom/revenuecat/purchases/common/events/EventsManager;->appSessionID:Ljava/util/UUID;

    .line 19
    .line 20
    sget-object v0, Lcom/revenuecat/purchases/common/events/EventsManager$Companion$json$1;->INSTANCE:Lcom/revenuecat/purchases/common/events/EventsManager$Companion$json$1;

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-static {v1, v0, v2, v1}, LWf/u;->b(LWf/b;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LWf/b;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Lcom/revenuecat/purchases/common/events/EventsManager;->json:LWf/b;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>(Ljava/util/UUID;Lcom/revenuecat/purchases/utils/EventsFileHelper;Lcom/revenuecat/purchases/utils/EventsFileHelper;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/common/Dispatcher;Lie/p;Lcom/revenuecat/purchases/utils/RateLimiter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            "Lcom/revenuecat/purchases/utils/EventsFileHelper<",
            "Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;",
            ">;",
            "Lcom/revenuecat/purchases/utils/EventsFileHelper<",
            "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;",
            ">;",
            "Lcom/revenuecat/purchases/identity/IdentityManager;",
            "Lcom/revenuecat/purchases/common/Dispatcher;",
            "Lie/p;",
            "Lcom/revenuecat/purchases/utils/RateLimiter;",
            ")V"
        }
    .end annotation

    const-string v0, "appSessionID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "identityManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventsDispatcher"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "postEvents"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "priorityFlushRateLimiter"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->appSessionID$1:Ljava/util/UUID;

    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->legacyEventsFileHelper:Lcom/revenuecat/purchases/utils/EventsFileHelper;

    .line 4
    iput-object p3, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->fileHelper:Lcom/revenuecat/purchases/utils/EventsFileHelper;

    .line 5
    iput-object p4, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->identityManager:Lcom/revenuecat/purchases/identity/IdentityManager;

    .line 6
    iput-object p5, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->eventsDispatcher:Lcom/revenuecat/purchases/common/Dispatcher;

    .line 7
    iput-object p6, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->postEvents:Lie/p;

    .line 8
    iput-object p7, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->priorityFlushRateLimiter:Lcom/revenuecat/purchases/utils/RateLimiter;

    .line 9
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->flushInProgress:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/UUID;Lcom/revenuecat/purchases/utils/EventsFileHelper;Lcom/revenuecat/purchases/utils/EventsFileHelper;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/common/Dispatcher;Lie/p;Lcom/revenuecat/purchases/utils/RateLimiter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    .line 10
    sget-object p1, Lcom/revenuecat/purchases/common/events/EventsManager;->appSessionID:Ljava/util/UUID;

    :cond_0
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_1

    .line 11
    new-instance p7, Lcom/revenuecat/purchases/utils/RateLimiter;

    .line 12
    sget-object p8, LEf/a;->b:LEf/a$a;

    const/16 p8, 0x3c

    sget-object p9, LEf/d;->e:LEf/d;

    invoke-static {p8, p9}, LEf/c;->s(ILEf/d;)J

    move-result-wide p8

    const/4 v0, 0x0

    const/4 v1, 0x5

    .line 13
    invoke-direct {p7, v1, p8, p9, v0}, Lcom/revenuecat/purchases/utils/RateLimiter;-><init>(IJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 14
    invoke-direct/range {p2 .. p9}, Lcom/revenuecat/purchases/common/events/EventsManager;-><init>(Ljava/util/UUID;Lcom/revenuecat/purchases/utils/EventsFileHelper;Lcom/revenuecat/purchases/utils/EventsFileHelper;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/common/Dispatcher;Lie/p;Lcom/revenuecat/purchases/utils/RateLimiter;)V

    return-void
.end method

.method public static synthetic a(Lie/a;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/revenuecat/purchases/common/events/EventsManager;->enqueue$lambda$10(Lie/a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$checkFileSizeAndClearIfNeeded(Lcom/revenuecat/purchases/common/events/EventsManager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/revenuecat/purchases/common/events/EventsManager;->checkFileSizeAndClearIfNeeded()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$flushLegacyEvents(Lcom/revenuecat/purchases/common/events/EventsManager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/revenuecat/purchases/common/events/EventsManager;->flushLegacyEvents()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$flushNextBatch(Lcom/revenuecat/purchases/common/events/EventsManager;ILcom/revenuecat/purchases/common/Delay;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/revenuecat/purchases/common/events/EventsManager;->flushNextBatch(ILcom/revenuecat/purchases/common/Delay;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getAppSessionID$cp()Ljava/util/UUID;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/common/events/EventsManager;->appSessionID:Ljava/util/UUID;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getAppSessionID$p(Lcom/revenuecat/purchases/common/events/EventsManager;)Ljava/util/UUID;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->appSessionID$1:Ljava/util/UUID;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getFileHelper$p(Lcom/revenuecat/purchases/common/events/EventsManager;)Lcom/revenuecat/purchases/utils/EventsFileHelper;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->fileHelper:Lcom/revenuecat/purchases/utils/EventsFileHelper;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getFlushInProgress$p(Lcom/revenuecat/purchases/common/events/EventsManager;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->flushInProgress:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getIdentityManager$p(Lcom/revenuecat/purchases/common/events/EventsManager;)Lcom/revenuecat/purchases/identity/IdentityManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->identityManager:Lcom/revenuecat/purchases/identity/IdentityManager;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getJson$cp()LWf/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/common/events/EventsManager;->json:LWf/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getLegacyFlushTriggered$p(Lcom/revenuecat/purchases/common/events/EventsManager;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->legacyFlushTriggered:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$getLegacyPaywallsStoredEvents(Lcom/revenuecat/purchases/common/events/EventsManager;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/revenuecat/purchases/common/events/EventsManager;->getLegacyPaywallsStoredEvents()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getPostEvents$p(Lcom/revenuecat/purchases/common/events/EventsManager;)Lie/p;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->postEvents:Lie/p;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$onFlushComplete(Lcom/revenuecat/purchases/common/events/EventsManager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/revenuecat/purchases/common/events/EventsManager;->onFlushComplete()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$performPriorityFlush(Lcom/revenuecat/purchases/common/events/EventsManager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/revenuecat/purchases/common/events/EventsManager;->performPriorityFlush()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$setLegacyFlushTriggered$p(Lcom/revenuecat/purchases/common/events/EventsManager;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->legacyFlushTriggered:Z

    .line 2
    .line 3
    return-void
.end method

.method private final checkFileSizeAndClearIfNeeded()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->fileHelper:Lcom/revenuecat/purchases/utils/EventsFileHelper;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/utils/EventsFileHelper;->fileSizeInKB()D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/high16 v2, 0x40a0000000000000L    # 2048.0

    .line 8
    .line 9
    cmpl-double v0, v0, v2

    .line 10
    .line 11
    if-ltz v0, :cond_1

    .line 12
    .line 13
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 14
    .line 15
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    sget-object v2, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 20
    .line 21
    invoke-virtual {v2}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-gtz v2, :cond_0

    .line 30
    .line 31
    new-instance v2, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v3, "[Purchases] - "

    .line 37
    .line 38
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const-string v2, "Event store size limit reached. Clearing oldest events to free up space."

    .line 53
    .line 54
    invoke-interface {v1, v0, v2}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    iget-object v0, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->fileHelper:Lcom/revenuecat/purchases/utils/EventsFileHelper;

    .line 58
    .line 59
    const/16 v1, 0x32

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lcom/revenuecat/purchases/utils/EventsFileHelper;->clear(I)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->debugEventListener:Lcom/revenuecat/purchases/DebugEventListener;

    .line 65
    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    new-instance v1, Lcom/revenuecat/purchases/DebugEvent;

    .line 69
    .line 70
    sget-object v2, Lcom/revenuecat/purchases/DebugEventName;->FILE_SIZE_LIMIT_REACHED:Lcom/revenuecat/purchases/DebugEventName;

    .line 71
    .line 72
    const/4 v3, 0x2

    .line 73
    const/4 v4, 0x0

    .line 74
    invoke-direct {v1, v2, v4, v3, v4}, Lcom/revenuecat/purchases/DebugEvent;-><init>(Lcom/revenuecat/purchases/DebugEventName;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 75
    .line 76
    .line 77
    invoke-interface {v0, v1}, Lcom/revenuecat/purchases/DebugEventListener;->onDebugEventReceived(Lcom/revenuecat/purchases/DebugEvent;)V

    .line 78
    .line 79
    .line 80
    :cond_1
    return-void
.end method

.method private final enqueue(Lcom/revenuecat/purchases/common/Delay;Lie/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/common/Delay;",
            "Lie/a;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->eventsDispatcher:Lcom/revenuecat/purchases/common/Dispatcher;

    .line 2
    .line 3
    new-instance v1, Lcom/revenuecat/purchases/common/events/a;

    .line 4
    .line 5
    invoke-direct {v1, p2}, Lcom/revenuecat/purchases/common/events/a;-><init>(Lie/a;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Lcom/revenuecat/purchases/common/Dispatcher;->enqueue(Ljava/lang/Runnable;Lcom/revenuecat/purchases/common/Delay;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method static synthetic enqueue$default(Lcom/revenuecat/purchases/common/events/EventsManager;Lcom/revenuecat/purchases/common/Delay;Lie/a;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    sget-object p1, Lcom/revenuecat/purchases/common/Delay;->NONE:Lcom/revenuecat/purchases/common/Delay;

    .line 6
    .line 7
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/revenuecat/purchases/common/events/EventsManager;->enqueue(Lcom/revenuecat/purchases/common/Delay;Lie/a;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static final enqueue$lambda$10(Lie/a;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic flushEvents$default(Lcom/revenuecat/purchases/common/events/EventsManager;Lcom/revenuecat/purchases/common/Delay;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    sget-object p1, Lcom/revenuecat/purchases/common/Delay;->DEFAULT:Lcom/revenuecat/purchases/common/Delay;

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/common/events/EventsManager;->flushEvents(Lcom/revenuecat/purchases/common/Delay;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final flushLegacyEvents()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->legacyEventsFileHelper:Lcom/revenuecat/purchases/utils/EventsFileHelper;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v1, Lcom/revenuecat/purchases/common/events/EventsManager$flushLegacyEvents$1;

    .line 7
    .line 8
    invoke-direct {v1, p0, v0}, Lcom/revenuecat/purchases/common/events/EventsManager$flushLegacyEvents$1;-><init>(Lcom/revenuecat/purchases/common/events/EventsManager;Lcom/revenuecat/purchases/utils/EventsFileHelper;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-static {p0, v2, v1, v0, v2}, Lcom/revenuecat/purchases/common/events/EventsManager;->enqueue$default(Lcom/revenuecat/purchases/common/events/EventsManager;Lcom/revenuecat/purchases/common/Delay;Lie/a;ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private final flushNextBatch(ILcom/revenuecat/purchases/common/Delay;)V
    .locals 9

    .line 1
    const-string v0, "[Purchases] - "

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    if-le p1, v1, :cond_1

    .line 6
    .line 7
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->VERBOSE:Lcom/revenuecat/purchases/LogLevel;

    .line 8
    .line 9
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    sget-object v1, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-gtz v1, :cond_0

    .line 24
    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const-string v0, "Reached maximum number of flush batches (10). Stopping flush."

    .line 45
    .line 46
    invoke-interface {p2, p1, v0}, Lcom/revenuecat/purchases/LogHandler;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    invoke-direct {p0}, Lcom/revenuecat/purchases/common/events/EventsManager;->onFlushComplete()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 54
    .line 55
    .line 56
    move-result-wide v4

    .line 57
    invoke-direct {p0}, Lcom/revenuecat/purchases/common/events/EventsManager;->getStoredEvents()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-static {v6}, LUd/u;->j0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_4

    .line 70
    .line 71
    sget-object p2, Lcom/revenuecat/purchases/LogLevel;->VERBOSE:Lcom/revenuecat/purchases/LogLevel;

    .line 72
    .line 73
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    sget-object v2, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 78
    .line 79
    invoke-virtual {v2}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v2, p2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-gtz v2, :cond_2

    .line 88
    .line 89
    new-instance v2, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    const-string v0, "No new events to sync."

    .line 109
    .line 110
    invoke-interface {v1, p2, v0}, Lcom/revenuecat/purchases/LogHandler;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :cond_2
    const/4 p2, 0x1

    .line 114
    if-ne p1, p2, :cond_3

    .line 115
    .line 116
    iget-object p1, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->debugEventListener:Lcom/revenuecat/purchases/DebugEventListener;

    .line 117
    .line 118
    if-eqz p1, :cond_3

    .line 119
    .line 120
    new-instance p2, Lcom/revenuecat/purchases/DebugEvent;

    .line 121
    .line 122
    sget-object v0, Lcom/revenuecat/purchases/DebugEventName;->FLUSH_SKIPPED_NO_EVENTS:Lcom/revenuecat/purchases/DebugEventName;

    .line 123
    .line 124
    const/4 v1, 0x2

    .line 125
    const/4 v2, 0x0

    .line 126
    invoke-direct {p2, v0, v2, v1, v2}, Lcom/revenuecat/purchases/DebugEvent;-><init>(Lcom/revenuecat/purchases/DebugEventName;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 127
    .line 128
    .line 129
    invoke-interface {p1, p2}, Lcom/revenuecat/purchases/DebugEventListener;->onDebugEventReceived(Lcom/revenuecat/purchases/DebugEvent;)V

    .line 130
    .line 131
    .line 132
    :cond_3
    invoke-direct {p0}, Lcom/revenuecat/purchases/common/events/EventsManager;->onFlushComplete()V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_4
    sget-object v3, Lcom/revenuecat/purchases/LogLevel;->VERBOSE:Lcom/revenuecat/purchases/LogLevel;

    .line 137
    .line 138
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    sget-object v8, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 143
    .line 144
    invoke-virtual {v8}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 145
    .line 146
    .line 147
    move-result-object v8

    .line 148
    invoke-virtual {v8, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 149
    .line 150
    .line 151
    move-result v8

    .line 152
    if-gtz v8, :cond_5

    .line 153
    .line 154
    new-instance v8, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    new-instance v3, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 176
    .line 177
    .line 178
    const-string v8, "New event flush (batch "

    .line 179
    .line 180
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    const-string v8, "): posting "

    .line 187
    .line 188
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 192
    .line 193
    .line 194
    move-result v8

    .line 195
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    const-string v8, " events."

    .line 199
    .line 200
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    invoke-interface {v7, v0, v3}, Lcom/revenuecat/purchases/LogHandler;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    :cond_5
    iget-object v0, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->postEvents:Lie/p;

    .line 211
    .line 212
    new-instance v3, Ljava/util/ArrayList;

    .line 213
    .line 214
    invoke-static {v2, v1}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 219
    .line 220
    .line 221
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    if-eqz v2, :cond_6

    .line 230
    .line 231
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    check-cast v2, Lcom/revenuecat/purchases/common/events/BackendStoredEvent;

    .line 236
    .line 237
    invoke-static {v2}, Lcom/revenuecat/purchases/common/events/BackendStoredEventKt;->toBackendEvent(Lcom/revenuecat/purchases/common/events/BackendStoredEvent;)Lcom/revenuecat/purchases/common/events/BackendEvent;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    goto :goto_0

    .line 245
    :cond_6
    new-instance v8, Lcom/revenuecat/purchases/common/events/EventsRequest;

    .line 246
    .line 247
    invoke-direct {v8, v3}, Lcom/revenuecat/purchases/common/events/EventsRequest;-><init>(Ljava/util/List;)V

    .line 248
    .line 249
    .line 250
    new-instance v1, Lcom/revenuecat/purchases/common/events/EventsManager$flushNextBatch$5;

    .line 251
    .line 252
    move-object v2, p0

    .line 253
    move v3, p1

    .line 254
    move-object v7, p2

    .line 255
    invoke-direct/range {v1 .. v7}, Lcom/revenuecat/purchases/common/events/EventsManager$flushNextBatch$5;-><init>(Lcom/revenuecat/purchases/common/events/EventsManager;IJLjava/util/List;Lcom/revenuecat/purchases/common/Delay;)V

    .line 256
    .line 257
    .line 258
    new-instance p1, Lcom/revenuecat/purchases/common/events/EventsManager$flushNextBatch$6;

    .line 259
    .line 260
    invoke-direct {p1, p0, v3, v6}, Lcom/revenuecat/purchases/common/events/EventsManager$flushNextBatch$6;-><init>(Lcom/revenuecat/purchases/common/events/EventsManager;ILjava/util/List;)V

    .line 261
    .line 262
    .line 263
    invoke-interface {v0, v8, v7, v1, p1}, Lie/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    return-void
.end method

.method private final getLegacyPaywallsStoredEvents()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkotlin/jvm/internal/N;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iput-object v1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->legacyEventsFileHelper:Lcom/revenuecat/purchases/utils/EventsFileHelper;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    new-instance v2, Lcom/revenuecat/purchases/common/events/EventsManager$getLegacyPaywallsStoredEvents$1;

    .line 17
    .line 18
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/common/events/EventsManager$getLegacyPaywallsStoredEvents$1;-><init>(Lkotlin/jvm/internal/N;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lcom/revenuecat/purchases/utils/EventsFileHelper;->readFile(Lkotlin/jvm/functions/Function1;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Ljava/util/List;

    .line 27
    .line 28
    return-object v0
.end method

.method private final getStoredEvents()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkotlin/jvm/internal/N;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iput-object v1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->fileHelper:Lcom/revenuecat/purchases/utils/EventsFileHelper;

    .line 13
    .line 14
    new-instance v2, Lcom/revenuecat/purchases/common/events/EventsManager$getStoredEvents$1;

    .line 15
    .line 16
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/common/events/EventsManager$getStoredEvents$1;-><init>(Lkotlin/jvm/internal/N;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Lcom/revenuecat/purchases/utils/EventsFileHelper;->readFile(Lkotlin/jvm/functions/Function1;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Ljava/util/List;

    .line 25
    .line 26
    return-object v0
.end method

.method private final onFlushComplete()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->flushInProgress:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/revenuecat/purchases/common/events/EventsManager;->startPendingPriorityFlushIfNeeded()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final performPriorityFlush()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->pendingPriorityFlush:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->flushInProgress:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 13
    .line 14
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sget-object v2, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-gtz v2, :cond_0

    .line 29
    .line 30
    new-instance v2, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v3, "[Purchases] - "

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v2, "Flush in progress. Queuing priority flush."

    .line 52
    .line 53
    invoke-interface {v1, v0, v2}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    return-void

    .line 57
    :cond_1
    invoke-direct {p0}, Lcom/revenuecat/purchases/common/events/EventsManager;->startPendingPriorityFlushIfNeeded()V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method private final startPendingPriorityFlushIfNeeded()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->pendingPriorityFlush:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->pendingPriorityFlush:Z

    .line 8
    .line 9
    iget-object v0, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->priorityFlushRateLimiter:Lcom/revenuecat/purchases/utils/RateLimiter;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/revenuecat/purchases/utils/RateLimiter;->shouldProceed()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const-string v1, "[Purchases] - "

    .line 16
    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 20
    .line 21
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 26
    .line 27
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-gtz v3, :cond_1

    .line 36
    .line 37
    new-instance v3, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const-string v1, "Priority flush rate limited. Skipping."

    .line 57
    .line 58
    invoke-interface {v2, v0, v1}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    :goto_0
    return-void

    .line 62
    :cond_2
    iget-object v0, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->flushInProgress:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 63
    .line 64
    const/4 v2, 0x1

    .line 65
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_4

    .line 70
    .line 71
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 72
    .line 73
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 78
    .line 79
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-virtual {v4, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-gtz v4, :cond_3

    .line 88
    .line 89
    new-instance v4, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    const-string v1, "Flush in progress. Queuing priority flush."

    .line 109
    .line 110
    invoke-interface {v3, v0, v1}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :cond_3
    iput-boolean v2, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->pendingPriorityFlush:Z

    .line 114
    .line 115
    return-void

    .line 116
    :cond_4
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 117
    .line 118
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 123
    .line 124
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-virtual {v4, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-gtz v4, :cond_5

    .line 133
    .line 134
    new-instance v4, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    const-string v1, "Starting priority flush."

    .line 154
    .line 155
    invoke-interface {v3, v0, v1}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    :cond_5
    sget-object v0, Lcom/revenuecat/purchases/common/Delay;->NONE:Lcom/revenuecat/purchases/common/Delay;

    .line 159
    .line 160
    invoke-direct {p0, v2, v0}, Lcom/revenuecat/purchases/common/events/EventsManager;->flushNextBatch(ILcom/revenuecat/purchases/common/Delay;)V

    .line 161
    .line 162
    .line 163
    return-void
.end method


# virtual methods
.method public final declared-synchronized flushEvents(Lcom/revenuecat/purchases/common/Delay;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "delay"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lcom/revenuecat/purchases/common/events/EventsManager$flushEvents$1;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1}, Lcom/revenuecat/purchases/common/events/EventsManager$flushEvents$1;-><init>(Lcom/revenuecat/purchases/common/events/EventsManager;Lcom/revenuecat/purchases/common/Delay;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-static {p0, v1, v0, p1, v1}, Lcom/revenuecat/purchases/common/events/EventsManager;->enqueue$default(Lcom/revenuecat/purchases/common/events/EventsManager;Lcom/revenuecat/purchases/common/Delay;Lie/a;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw p1
.end method

.method public final declared-synchronized getDebugEventListener()Lcom/revenuecat/purchases/DebugEventListener;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->debugEventListener:Lcom/revenuecat/purchases/DebugEventListener;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
.end method

.method public final declared-synchronized setDebugEventListener(Lcom/revenuecat/purchases/DebugEventListener;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->debugEventListener:Lcom/revenuecat/purchases/DebugEventListener;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/revenuecat/purchases/common/events/EventsManager$debugEventListener$callback$1$1;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/common/events/EventsManager$debugEventListener$callback$1$1;-><init>(Lcom/revenuecat/purchases/DebugEventListener;)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    iget-object p1, p0, Lcom/revenuecat/purchases/common/events/EventsManager;->fileHelper:Lcom/revenuecat/purchases/utils/EventsFileHelper;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lcom/revenuecat/purchases/utils/EventsFileHelper;->setDebugEventCallback(Lkotlin/jvm/functions/Function1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    monitor-exit p0

    .line 21
    return-void

    .line 22
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw p1
.end method

.method public final declared-synchronized track(Lcom/revenuecat/purchases/common/events/FeatureEvent;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "event"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lcom/revenuecat/purchases/common/events/EventsManager$track$1;

    .line 8
    .line 9
    invoke-direct {v0, p1, p0}, Lcom/revenuecat/purchases/common/events/EventsManager$track$1;-><init>(Lcom/revenuecat/purchases/common/events/FeatureEvent;Lcom/revenuecat/purchases/common/events/EventsManager;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-static {p0, v1, v0, p1, v1}, Lcom/revenuecat/purchases/common/events/EventsManager;->enqueue$default(Lcom/revenuecat/purchases/common/events/EventsManager;Lcom/revenuecat/purchases/common/Delay;Lie/a;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw p1
.end method
