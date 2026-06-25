.class public final Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/blockstore/BlockstoreHelper$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0082@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J,\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0013\u001a\u00020\u000eH\u0082@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0015\u0010\u0019J\u001b\u0010\u001c\u001a\u00020\u00142\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001b\u0010\u001e\u001a\u00020\u00142\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u001a\u00a2\u0006\u0004\u0008\u001e\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u001fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010 R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010!R\u0014\u0010\n\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;",
        "",
        "Landroid/content/Context;",
        "applicationContext",
        "Lcom/revenuecat/purchases/identity/IdentityManager;",
        "identityManager",
        "LL8/b;",
        "blockstoreClient",
        "LGf/O;",
        "ioScope",
        "mainScope",
        "<init>",
        "(Landroid/content/Context;Lcom/revenuecat/purchases/identity/IdentityManager;LL8/b;LGf/O;LGf/O;)V",
        "",
        "",
        "LL8/e$a;",
        "getBlockstoreData",
        "(LZd/e;)Ljava/lang/Object;",
        "blockstoreDataMap",
        "userId",
        "LTd/L;",
        "storeUserIdIfNeeded",
        "(Ljava/util/Map;Ljava/lang/String;LZd/e;)Ljava/lang/Object;",
        "Lcom/revenuecat/purchases/CustomerInfo;",
        "customerInfo",
        "(Lcom/revenuecat/purchases/CustomerInfo;)V",
        "Lkotlin/Function0;",
        "callback",
        "aliasCurrentAndStoredUserIdsIfNeeded",
        "(Lie/a;)V",
        "clearUserIdBackupIfNeeded",
        "Lcom/revenuecat/purchases/identity/IdentityManager;",
        "LL8/b;",
        "LGf/O;",
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
.field public static final BLOCKSTORE_MAX_ENTRIES:I = 0x10
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final BLOCKSTORE_USER_ID_KEY:Ljava/lang/String; = "com.revenuecat.purchases.app_user_id"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final Companion:Lcom/revenuecat/purchases/blockstore/BlockstoreHelper$Companion;


# instance fields
.field private final blockstoreClient:LL8/b;

.field private final identityManager:Lcom/revenuecat/purchases/identity/IdentityManager;

.field private final ioScope:LGf/O;

.field private final mainScope:LGf/O;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;->Companion:Lcom/revenuecat/purchases/blockstore/BlockstoreHelper$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/revenuecat/purchases/identity/IdentityManager;LL8/b;LGf/O;LGf/O;)V
    .locals 1

    const-string v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "identityManager"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "ioScope"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "mainScope"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;->identityManager:Lcom/revenuecat/purchases/identity/IdentityManager;

    .line 3
    iput-object p3, p0, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;->blockstoreClient:LL8/b;

    .line 4
    iput-object p4, p0, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;->ioScope:LGf/O;

    .line 5
    iput-object p5, p0, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;->mainScope:LGf/O;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lcom/revenuecat/purchases/identity/IdentityManager;LL8/b;LGf/O;LGf/O;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    .line 6
    sget-object p3, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;->Companion:Lcom/revenuecat/purchases/blockstore/BlockstoreHelper$Companion;

    invoke-virtual {p3, p1}, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper$Companion;->initializeBlockstoreClient(Landroid/content/Context;)LL8/b;

    move-result-object p3

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x8

    const/4 p7, 0x1

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    .line 7
    invoke-static {v0, p7, v0}, LGf/X0;->b(LGf/C0;ILjava/lang/Object;)LGf/A;

    move-result-object p3

    invoke-static {}, LGf/f0;->b()LGf/K;

    move-result-object p4

    invoke-virtual {p4, p7}, LGf/K;->Y1(I)LGf/K;

    move-result-object p4

    invoke-interface {p3, p4}, LZd/i;->w(LZd/i;)LZd/i;

    move-result-object p3

    invoke-static {p3}, LGf/P;->a(LZd/i;)LGf/O;

    move-result-object p4

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_2

    .line 8
    invoke-static {v0, p7, v0}, LGf/X0;->b(LGf/C0;ILjava/lang/Object;)LGf/A;

    move-result-object p3

    invoke-static {}, LGf/f0;->c()LGf/M0;

    move-result-object p4

    invoke-interface {p3, p4}, LZd/i;->w(LZd/i;)LZd/i;

    move-result-object p3

    invoke-static {p3}, LGf/P;->a(LZd/i;)LGf/O;

    move-result-object p5

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p5

    .line 9
    invoke-direct/range {v0 .. v5}, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;-><init>(Landroid/content/Context;Lcom/revenuecat/purchases/identity/IdentityManager;LL8/b;LGf/O;LGf/O;)V

    return-void
.end method

.method public static final synthetic access$aliasCurrentAndStoredUserIdsIfNeeded$callCompletion(Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;Lie/a;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;->aliasCurrentAndStoredUserIdsIfNeeded$callCompletion(Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;Lie/a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getBlockstoreData(Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;->getBlockstoreData(LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getIdentityManager$p(Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;)Lcom/revenuecat/purchases/identity/IdentityManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;->identityManager:Lcom/revenuecat/purchases/identity/IdentityManager;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$storeUserIdIfNeeded(Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;Ljava/util/Map;Ljava/lang/String;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;->storeUserIdIfNeeded(Ljava/util/Map;Ljava/lang/String;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final aliasCurrentAndStoredUserIdsIfNeeded$callCompletion(Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;Lie/a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;",
            "Lie/a;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;->mainScope:LGf/O;

    .line 2
    .line 3
    new-instance v3, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper$aliasCurrentAndStoredUserIdsIfNeeded$callCompletion$1;

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    invoke-direct {v3, p1, p0}, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper$aliasCurrentAndStoredUserIdsIfNeeded$callCompletion$1;-><init>(Lie/a;LZd/e;)V

    .line 7
    .line 8
    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-static/range {v0 .. v5}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private final getBlockstoreData(LZd/e;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;->blockstoreClient:LL8/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, LUd/S;->i()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_0
    new-instance v1, LL8/d$a;

    .line 11
    .line 12
    invoke-direct {v1}, LL8/d$a;-><init>()V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-virtual {v1, v2}, LL8/d$a;->b(Z)LL8/d$a;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, LL8/d$a;->a()LL8/d;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v2, "Builder()\n            .s\u2026rue)\n            .build()"

    .line 25
    .line 26
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    new-instance v2, LZd/k;

    .line 30
    .line 31
    invoke-static {p1}, Lae/b;->c(LZd/e;)LZd/e;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-direct {v2, v3}, LZd/k;-><init>(LZd/e;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v0, v1}, LL8/b;->e(LL8/d;)Ln9/i;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    new-instance v1, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper$getBlockstoreData$2$1;

    .line 43
    .line 44
    invoke-direct {v1, v2}, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper$getBlockstoreData$2$1;-><init>(LZd/e;)V

    .line 45
    .line 46
    .line 47
    new-instance v3, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper$sam$com_google_android_gms_tasks_OnSuccessListener$0;

    .line 48
    .line 49
    invoke-direct {v3, v1}, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper$sam$com_google_android_gms_tasks_OnSuccessListener$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v3}, Ln9/i;->g(Ln9/f;)Ln9/i;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    new-instance v1, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper$getBlockstoreData$2$2;

    .line 57
    .line 58
    invoke-direct {v1, v2}, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper$getBlockstoreData$2$2;-><init>(LZd/e;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ln9/i;->e(Ln9/e;)Ln9/i;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, LZd/k;->a()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    if-ne v0, v1, :cond_1

    .line 73
    .line 74
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 75
    .line 76
    .line 77
    :cond_1
    return-object v0
.end method

.method private final storeUserIdIfNeeded(Ljava/util/Map;Ljava/lang/String;LZd/e;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "LL8/e$a;",
            ">;",
            "Ljava/lang/String;",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 6
    iget-object v0, p0, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;->blockstoreClient:LL8/b;

    if-nez v0, :cond_0

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1

    .line 7
    :cond_0
    const-string v1, "com.revenuecat.purchases.app_user_id"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "[Purchases] - "

    if-eqz v2, :cond_2

    .line 8
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    move-result-object p2

    .line 9
    sget-object p3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    invoke-virtual {p3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p3

    if-gtz p3, :cond_1

    .line 10
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 11
    const-string p3, "Block store: Not storing user id since there is one already present."

    .line 12
    invoke-interface {p2, p1, p3}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    :cond_1
    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1

    .line 14
    :cond_2
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result p1

    const/16 v2, 0x10

    if-lt p1, v2, :cond_4

    .line 15
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    move-result-object p2

    .line 16
    sget-object p3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    invoke-virtual {p3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p3

    if-gtz p3, :cond_3

    .line 17
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 18
    const-string p3, "Block store: Not storing user id since block store is already full."

    .line 19
    invoke-interface {p2, p1, p3}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    :cond_3
    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1

    .line 21
    :cond_4
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    move-result-object v2

    .line 22
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v4

    if-gtz v4, :cond_5

    .line 23
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 24
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Block store: Storing UserID: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " in Block store."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 25
    invoke-interface {v2, p1, v3}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    :cond_5
    new-instance p1, LL8/f$a;

    invoke-direct {p1}, LL8/f$a;-><init>()V

    .line 27
    sget-object v2, LDf/d;->b:Ljava/nio/charset/Charset;

    invoke-virtual {p2, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    const-string v3, "getBytes(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, LL8/f$a;->b([B)LL8/f$a;

    move-result-object p1

    .line 28
    invoke-virtual {p1, v1}, LL8/f$a;->c(Ljava/lang/String;)LL8/f$a;

    move-result-object p1

    const/4 v1, 0x1

    .line 29
    invoke-virtual {p1, v1}, LL8/f$a;->d(Z)LL8/f$a;

    move-result-object p1

    .line 30
    invoke-virtual {p1}, LL8/f$a;->a()LL8/f;

    move-result-object p1

    const-string v1, "Builder()\n            .s\u2026rue)\n            .build()"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    new-instance v1, LZd/k;

    invoke-static {p3}, Lae/b;->c(LZd/e;)LZd/e;

    move-result-object v2

    invoke-direct {v1, v2}, LZd/k;-><init>(LZd/e;)V

    .line 32
    invoke-interface {v0, p1}, LL8/b;->a(LL8/f;)Ln9/i;

    move-result-object p1

    .line 33
    new-instance v0, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper$storeUserIdIfNeeded$6$1;

    invoke-direct {v0, v1, p2}, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper$storeUserIdIfNeeded$6$1;-><init>(LZd/e;Ljava/lang/String;)V

    new-instance p2, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper$sam$com_google_android_gms_tasks_OnSuccessListener$0;

    invoke-direct {p2, v0}, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper$sam$com_google_android_gms_tasks_OnSuccessListener$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p2}, Ln9/i;->g(Ln9/f;)Ln9/i;

    move-result-object p1

    .line 34
    new-instance p2, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper$storeUserIdIfNeeded$6$2;

    invoke-direct {p2, v1}, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper$storeUserIdIfNeeded$6$2;-><init>(LZd/e;)V

    invoke-virtual {p1, p2}, Ln9/i;->e(Ln9/e;)Ln9/i;

    .line 35
    invoke-virtual {v1}, LZd/k;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_6

    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    :cond_6
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_7

    return-object p1

    :cond_7
    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method


# virtual methods
.method public final aliasCurrentAndStoredUserIdsIfNeeded(Lie/a;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lie/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;->identityManager:Lcom/revenuecat/purchases/identity/IdentityManager;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/revenuecat/purchases/identity/IdentityManager;->getCurrentAppUserID()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Lcom/revenuecat/purchases/identity/IdentityManager;->Companion:Lcom/revenuecat/purchases/identity/IdentityManager$Companion;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Lcom/revenuecat/purchases/identity/IdentityManager$Companion;->isUserIDAnonymous(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;->aliasCurrentAndStoredUserIdsIfNeeded$callCompletion(Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;Lie/a;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object v2, p0, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;->ioScope:LGf/O;

    .line 25
    .line 26
    new-instance v5, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper$aliasCurrentAndStoredUserIdsIfNeeded$1;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v5, p0, v0, p1, v1}, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper$aliasCurrentAndStoredUserIdsIfNeeded$1;-><init>(Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;Ljava/lang/String;Lie/a;LZd/e;)V

    .line 30
    .line 31
    .line 32
    const/4 v6, 0x3

    .line 33
    const/4 v7, 0x0

    .line 34
    const/4 v3, 0x0

    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-static/range {v2 .. v7}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final clearUserIdBackupIfNeeded(Lie/a;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lie/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;->blockstoreClient:LL8/b;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v1, LL8/c$a;

    .line 15
    .line 16
    invoke-direct {v1}, LL8/c$a;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v2, "com.revenuecat.purchases.app_user_id"

    .line 20
    .line 21
    invoke-static {v2}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v1, v2}, LL8/c$a;->b(Ljava/util/List;)LL8/c$a;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, LL8/c$a;->a()LL8/c;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-string v2, "Builder()\n            .s\u2026EY))\n            .build()"

    .line 34
    .line 35
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object v3, p0, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;->ioScope:LGf/O;

    .line 39
    .line 40
    new-instance v6, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper$clearUserIdBackupIfNeeded$1;

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-direct {v6, v0, v1, p1, v2}, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper$clearUserIdBackupIfNeeded$1;-><init>(LL8/b;LL8/c;Lie/a;LZd/e;)V

    .line 44
    .line 45
    .line 46
    const/4 v7, 0x3

    .line 47
    const/4 v8, 0x0

    .line 48
    const/4 v4, 0x0

    .line 49
    const/4 v5, 0x0

    .line 50
    invoke-static/range {v3 .. v8}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final storeUserIdIfNeeded(Lcom/revenuecat/purchases/CustomerInfo;)V
    .locals 7

    const-string v0, "customerInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;->blockstoreClient:LL8/b;

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;->identityManager:Lcom/revenuecat/purchases/identity/IdentityManager;

    invoke-virtual {v0}, Lcom/revenuecat/purchases/identity/IdentityManager;->getCurrentAppUserID()Ljava/lang/String;

    move-result-object v0

    .line 3
    sget-object v1, Lcom/revenuecat/purchases/identity/IdentityManager;->Companion:Lcom/revenuecat/purchases/identity/IdentityManager$Companion;

    invoke-virtual {v1, v0}, Lcom/revenuecat/purchases/identity/IdentityManager$Companion;->isUserIDAnonymous(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 4
    invoke-virtual {p1}, Lcom/revenuecat/purchases/CustomerInfo;->getAllPurchasedProductIds()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    iget-object v1, p0, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;->ioScope:LGf/O;

    new-instance v4, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper$storeUserIdIfNeeded$1;

    const/4 p1, 0x0

    invoke-direct {v4, p0, v0, p1}, Lcom/revenuecat/purchases/blockstore/BlockstoreHelper$storeUserIdIfNeeded$1;-><init>(Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;Ljava/lang/String;LZd/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    :cond_2
    :goto_0
    return-void
.end method
