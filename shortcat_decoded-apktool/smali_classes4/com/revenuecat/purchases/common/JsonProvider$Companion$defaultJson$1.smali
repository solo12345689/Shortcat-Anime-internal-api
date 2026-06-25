.class final Lcom/revenuecat/purchases/common/JsonProvider$Companion$defaultJson$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/common/JsonProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LWf/e;",
        "LTd/L;",
        "invoke",
        "(LWf/e;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/revenuecat/purchases/common/JsonProvider$Companion$defaultJson$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/common/JsonProvider$Companion$defaultJson$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/common/JsonProvider$Companion$defaultJson$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/common/JsonProvider$Companion$defaultJson$1;->INSTANCE:Lcom/revenuecat/purchases/common/JsonProvider$Companion$defaultJson$1;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LWf/e;

    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/common/JsonProvider$Companion$defaultJson$1;->invoke(LWf/e;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LWf/e;)V
    .locals 4

    const-string v0, "$this$Json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, LYf/f;

    invoke-direct {v0}, LYf/f;-><init>()V

    .line 3
    const-class v1, Lcom/revenuecat/purchases/common/events/BackendEvent;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v1

    .line 4
    new-instance v2, LYf/b;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, LYf/b;-><init>(Lpe/d;LRf/b;)V

    .line 5
    const-class v1, Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v1

    sget-object v3, Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;->Companion:Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter$Companion;

    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter$Companion;->serializer()LRf/b;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, LYf/b;->b(Lpe/d;LRf/b;)V

    .line 6
    const-class v1, Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v1

    sget-object v3, Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;->Companion:Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls$Companion;

    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls$Companion;->serializer()LRf/b;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, LYf/b;->b(Lpe/d;LRf/b;)V

    .line 7
    invoke-virtual {v2, v0}, LYf/b;->a(LYf/f;)V

    .line 8
    invoke-virtual {v0}, LYf/f;->f()LYf/e;

    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, LWf/e;->g(LYf/e;)V

    .line 10
    const-string v0, "discriminator"

    invoke-virtual {p1, v0}, LWf/e;->c(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 11
    invoke-virtual {p1, v0}, LWf/e;->d(Z)V

    const/4 v0, 0x1

    .line 12
    invoke-virtual {p1, v0}, LWf/e;->f(Z)V

    return-void
.end method
