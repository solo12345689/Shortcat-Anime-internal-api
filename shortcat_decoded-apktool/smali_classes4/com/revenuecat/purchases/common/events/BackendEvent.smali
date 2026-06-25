.class public abstract Lcom/revenuecat/purchases/common/events/BackendEvent;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/revenuecat/purchases/utils/Event;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;,
        Lcom/revenuecat/purchases/common/events/BackendEvent$Companion;,
        Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;,
        Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;,
        Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u0000 \u00112\u00020\u0001:\u0005\u0012\u0011\u0013\u0014\u0015B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003B\u001b\u0008\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0002\u0010\u0008J(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u00c7\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u0082\u0001\u0004\u0016\u0017\u0018\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/revenuecat/purchases/common/events/BackendEvent;",
        "Lcom/revenuecat/purchases/utils/Event;",
        "<init>",
        "()V",
        "",
        "seen1",
        "LVf/t0;",
        "serializationConstructorMarker",
        "(ILVf/t0;)V",
        "self",
        "LUf/d;",
        "output",
        "LTf/e;",
        "serialDesc",
        "LTd/L;",
        "write$Self",
        "(Lcom/revenuecat/purchases/common/events/BackendEvent;LUf/d;LTf/e;)V",
        "Companion",
        "Ad",
        "CustomPaywall",
        "CustomerCenter",
        "Paywalls",
        "Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;",
        "Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;",
        "Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;",
        "Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;",
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
.field private static final $cachedSerializer$delegate:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy;"
        }
    .end annotation
.end field

.field public static final AD_EVENT_SCHEMA_VERSION:I = 0x1

.field public static final CUSTOMER_CENTER_EVENT_SCHEMA_VERSION:I = 0x1

.field public static final CUSTOM_PAYWALL_EVENT_SCHEMA_VERSION:I = 0x1

.field public static final Companion:Lcom/revenuecat/purchases/common/events/BackendEvent$Companion;

.field public static final PAYWALL_EVENT_SCHEMA_VERSION:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/common/events/BackendEvent$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/common/events/BackendEvent$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/revenuecat/purchases/common/events/BackendEvent;->Companion:Lcom/revenuecat/purchases/common/events/BackendEvent$Companion;

    .line 8
    .line 9
    sget-object v0, LTd/q;->b:LTd/q;

    .line 10
    .line 11
    sget-object v1, Lcom/revenuecat/purchases/common/events/BackendEvent$Companion$1;->INSTANCE:Lcom/revenuecat/purchases/common/events/BackendEvent$Companion$1;

    .line 12
    .line 13
    invoke-static {v0, v1}, LTd/n;->a(LTd/q;Lie/a;)Lkotlin/Lazy;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lcom/revenuecat/purchases/common/events/BackendEvent;->$cachedSerializer$delegate:Lkotlin/Lazy;

    .line 18
    .line 19
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILVf/t0;)V
    .locals 0
    .annotation runtime LTd/e;
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/revenuecat/purchases/common/events/BackendEvent;-><init>()V

    return-void
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Lkotlin/Lazy;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/common/events/BackendEvent;->$cachedSerializer$delegate:Lkotlin/Lazy;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic write$Self(Lcom/revenuecat/purchases/common/events/BackendEvent;LUf/d;LTf/e;)V
    .locals 0

    .line 1
    return-void
.end method
