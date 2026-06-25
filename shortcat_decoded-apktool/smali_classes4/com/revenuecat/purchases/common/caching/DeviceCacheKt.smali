.class public final Lcom/revenuecat/purchases/common/caching/DeviceCacheKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0001\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0005\"&\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00080\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\n\"\u0014\u0010\u000c\u001a\u00020\u000b8\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "LEf/a;",
        "PRODUCT_ENTITLEMENT_MAPPING_CACHE_REFRESH_PERIOD",
        "J",
        "",
        "SHARED_PREFERENCES_PREFIX",
        "Ljava/lang/String;",
        "LRf/b;",
        "",
        "Lcom/revenuecat/purchases/common/caching/TokenCacheEntry;",
        "tokenMapSerializer",
        "LRf/b;",
        "",
        "CUSTOMER_INFO_SCHEMA_VERSION",
        "I",
        "purchases_defaultsBc8Release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final CUSTOMER_INFO_SCHEMA_VERSION:I = 0x3

.field private static final PRODUCT_ENTITLEMENT_MAPPING_CACHE_REFRESH_PERIOD:J

.field private static final SHARED_PREFERENCES_PREFIX:Ljava/lang/String; = "com.revenuecat.purchases."

.field private static final tokenMapSerializer:LRf/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LRf/b;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, LEf/a;->b:LEf/a$a;

    .line 2
    .line 3
    const/16 v0, 0x19

    .line 4
    .line 5
    sget-object v1, LEf/d;->g:LEf/d;

    .line 6
    .line 7
    invoke-static {v0, v1}, LEf/c;->s(ILEf/d;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    sput-wide v0, Lcom/revenuecat/purchases/common/caching/DeviceCacheKt;->PRODUCT_ENTITLEMENT_MAPPING_CACHE_REFRESH_PERIOD:J

    .line 12
    .line 13
    sget-object v0, Lkotlin/jvm/internal/U;->a:Lkotlin/jvm/internal/U;

    .line 14
    .line 15
    invoke-static {v0}, LSf/a;->F(Lkotlin/jvm/internal/U;)LRf/b;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget-object v1, Lcom/revenuecat/purchases/common/caching/TokenCacheEntry;->Companion:Lcom/revenuecat/purchases/common/caching/TokenCacheEntry$Companion;

    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/revenuecat/purchases/common/caching/TokenCacheEntry$Companion;->serializer()LRf/b;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v0, v1}, LSf/a;->i(LRf/b;LRf/b;)LRf/b;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lcom/revenuecat/purchases/common/caching/DeviceCacheKt;->tokenMapSerializer:LRf/b;

    .line 30
    .line 31
    return-void
.end method

.method public static final synthetic access$getPRODUCT_ENTITLEMENT_MAPPING_CACHE_REFRESH_PERIOD$p()J
    .locals 2

    .line 1
    sget-wide v0, Lcom/revenuecat/purchases/common/caching/DeviceCacheKt;->PRODUCT_ENTITLEMENT_MAPPING_CACHE_REFRESH_PERIOD:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic access$getTokenMapSerializer$p()LRf/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/common/caching/DeviceCacheKt;->tokenMapSerializer:LRf/b;

    .line 2
    .line 3
    return-object v0
.end method
