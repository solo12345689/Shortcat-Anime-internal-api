.class public final Lcom/revenuecat/purchases/galaxy/GalaxyBillingWrapperFactory;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/revenuecat/purchases/galaxy/GalaxyBillingWrapperFactory;",
        "",
        "()V",
        "createGalaxyBillingWrapper",
        "Lcom/revenuecat/purchases/common/BillingAbstract;",
        "stateProvider",
        "Lcom/revenuecat/purchases/PurchasesStateProvider;",
        "context",
        "Landroid/content/Context;",
        "billingMode",
        "Lcom/revenuecat/purchases/galaxy/GalaxyBillingMode;",
        "deviceCache",
        "Lcom/revenuecat/purchases/common/caching/DeviceCache;",
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
.field public static final INSTANCE:Lcom/revenuecat/purchases/galaxy/GalaxyBillingWrapperFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/galaxy/GalaxyBillingWrapperFactory;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/galaxy/GalaxyBillingWrapperFactory;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/galaxy/GalaxyBillingWrapperFactory;->INSTANCE:Lcom/revenuecat/purchases/galaxy/GalaxyBillingWrapperFactory;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final createGalaxyBillingWrapper(Lcom/revenuecat/purchases/PurchasesStateProvider;Landroid/content/Context;Lcom/revenuecat/purchases/galaxy/GalaxyBillingMode;Lcom/revenuecat/purchases/common/caching/DeviceCache;)Lcom/revenuecat/purchases/common/BillingAbstract;
    .locals 5

    .line 1
    const-string v0, "stateProvider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "billingMode"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "deviceCache"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :try_start_0
    const-string v0, "com.revenuecat.purchases.galaxy.GalaxyBillingWrapper"

    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-class v1, Lcom/revenuecat/purchases/PurchasesStateProvider;

    .line 28
    .line 29
    const-class v2, Landroid/content/Context;

    .line 30
    .line 31
    const-class v3, Lcom/revenuecat/purchases/galaxy/GalaxyBillingMode;

    .line 32
    .line 33
    const-class v4, Lcom/revenuecat/purchases/common/caching/DeviceCache;

    .line 34
    .line 35
    filled-new-array {v1, v2, v3, v4}, [Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    filled-new-array {p1, p2, p3, p4}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string p2, "null cannot be cast to non-null type com.revenuecat.purchases.common.BillingAbstract"

    .line 52
    .line 53
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    check-cast p1, Lcom/revenuecat/purchases/common/BillingAbstract;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    return-object p1

    .line 59
    :catch_0
    move-exception p1

    .line 60
    goto :goto_0

    .line 61
    :catch_1
    move-exception p1

    .line 62
    goto :goto_1

    .line 63
    :catch_2
    move-exception p1

    .line 64
    goto :goto_2

    .line 65
    :goto_0
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    const-string p3, "Failed to create GalaxyBillingWrapper"

    .line 68
    .line 69
    invoke-direct {p2, p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    throw p2

    .line 73
    :goto_1
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    const-string p3, "Failed to find GalaxyBillingWrapper constructor. Please ensure that you\'ve declared a dependency on the purchases-galaxy module."

    .line 76
    .line 77
    invoke-direct {p2, p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    throw p2

    .line 81
    :goto_2
    new-instance p2, Ljava/lang/NoClassDefFoundError;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p3

    .line 87
    invoke-direct {p2, p3}, Ljava/lang/NoClassDefFoundError;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 91
    .line 92
    .line 93
    throw p2
.end method
