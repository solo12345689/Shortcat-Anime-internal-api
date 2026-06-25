.class public final Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager$Companion;,
        Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager$RequestResult;,
        Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;",
        "",
        "Lcom/revenuecat/purchases/common/AppConfig;",
        "appConfig",
        "Lcom/revenuecat/purchases/common/DateProvider;",
        "dateProvider",
        "<init>",
        "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/DateProvider;)V",
        "",
        "shouldResetTimeout",
        "()Z",
        "LTd/L;",
        "resetTimeout",
        "()V",
        "isFallback",
        "fallbackAvailable",
        "",
        "getTimeoutForRequest",
        "(ZZ)J",
        "Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager$RequestResult;",
        "result",
        "recordRequestResult",
        "(Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager$RequestResult;)V",
        "Lcom/revenuecat/purchases/common/AppConfig;",
        "Lcom/revenuecat/purchases/common/DateProvider;",
        "Ljava/util/concurrent/atomic/AtomicLong;",
        "lastTimeoutRequestTime",
        "Ljava/util/concurrent/atomic/AtomicLong;",
        "Companion",
        "RequestResult",
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
.field public static final Companion:Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager$Companion;

.field public static final DEFAULT_TIMEOUT_MS:J = 0x7530L

.field public static final REDUCED_TIMEOUT_MS:J = 0x7d0L

.field public static final SUPPORTED_FALLBACK_TIMEOUT_MS:J = 0x1388L

.field public static final TEST_DIVIDER:J = 0xaL

.field public static final TIMEOUT_RESET_INTERVAL_MS:J = 0x927c0L


# instance fields
.field private final appConfig:Lcom/revenuecat/purchases/common/AppConfig;

.field private final dateProvider:Lcom/revenuecat/purchases/common/DateProvider;

.field private final lastTimeoutRequestTime:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;->Companion:Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/DateProvider;)V
    .locals 2

    const-string v0, "appConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;->appConfig:Lcom/revenuecat/purchases/common/AppConfig;

    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;->dateProvider:Lcom/revenuecat/purchases/common/DateProvider;

    .line 4
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v0, 0x0

    invoke-direct {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p1, p0, Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;->lastTimeoutRequestTime:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/DateProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 5
    new-instance p2, Lcom/revenuecat/purchases/common/DefaultDateProvider;

    invoke-direct {p2}, Lcom/revenuecat/purchases/common/DefaultDateProvider;-><init>()V

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;-><init>(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/DateProvider;)V

    return-void
.end method

.method private final resetTimeout()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;->lastTimeoutRequestTime:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final shouldResetTimeout()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;->lastTimeoutRequestTime:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long v2, v0, v2

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    return v3

    .line 15
    :cond_0
    iget-object v2, p0, Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;->dateProvider:Lcom/revenuecat/purchases/common/DateProvider;

    .line 16
    .line 17
    invoke-interface {v2}, Lcom/revenuecat/purchases/common/DateProvider;->getNow()Ljava/util/Date;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    .line 22
    .line 23
    .line 24
    move-result-wide v4

    .line 25
    sub-long/2addr v4, v0

    .line 26
    const-wide/32 v0, 0x927c0

    .line 27
    .line 28
    .line 29
    cmp-long v0, v4, v0

    .line 30
    .line 31
    if-ltz v0, :cond_1

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    return v0

    .line 35
    :cond_1
    return v3
.end method


# virtual methods
.method public final getTimeoutForRequest(ZZ)J
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;->shouldResetTimeout()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;->resetTimeout()V

    .line 8
    .line 9
    .line 10
    :cond_0
    if-nez p1, :cond_3

    .line 11
    .line 12
    if-nez p2, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    iget-object p1, p0, Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;->lastTimeoutRequestTime:Ljava/util/concurrent/atomic/AtomicLong;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 18
    .line 19
    .line 20
    move-result-wide p1

    .line 21
    const-wide/16 v0, 0x0

    .line 22
    .line 23
    cmp-long p1, p1, v0

    .line 24
    .line 25
    if-lez p1, :cond_2

    .line 26
    .line 27
    const-wide/16 p1, 0x7d0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_2
    const-wide/16 p1, 0x1388

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_3
    :goto_0
    const-wide/16 p1, 0x7530

    .line 34
    .line 35
    :goto_1
    iget-object v0, p0, Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;->appConfig:Lcom/revenuecat/purchases/common/AppConfig;

    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/revenuecat/purchases/common/AppConfig;->getRunningTests()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_4

    .line 42
    .line 43
    const-wide/16 v0, 0xa

    .line 44
    .line 45
    div-long/2addr p1, v0

    .line 46
    :cond_4
    return-wide p1
.end method

.method public final recordRequestResult(Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager$RequestResult;)V
    .locals 2

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    aget p1, v0, p1

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    if-eq p1, v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    if-eq p1, v0, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object p1, p0, Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;->lastTimeoutRequestTime:Ljava/util/concurrent/atomic/AtomicLong;

    .line 22
    .line 23
    iget-object v0, p0, Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;->dateProvider:Lcom/revenuecat/purchases/common/DateProvider;

    .line 24
    .line 25
    invoke-interface {v0}, Lcom/revenuecat/purchases/common/DateProvider;->getNow()Ljava/util/Date;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    invoke-direct {p0}, Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;->resetTimeout()V

    .line 38
    .line 39
    .line 40
    return-void
.end method
