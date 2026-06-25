.class public final synthetic Lcom/swmansion/rnscreens/M;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/N;

.field public final synthetic b:Lcom/swmansion/rnscreens/S;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/N;Lcom/swmansion/rnscreens/S;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/swmansion/rnscreens/M;->a:Lkotlin/jvm/internal/N;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/swmansion/rnscreens/M;->b:Lcom/swmansion/rnscreens/S;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/M;->a:Lkotlin/jvm/internal/N;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/swmansion/rnscreens/M;->b:Lcom/swmansion/rnscreens/S;

    .line 4
    .line 5
    check-cast p1, Lcom/swmansion/rnscreens/G;

    .line 6
    .line 7
    invoke-static {v0, v1, p1}, Lcom/swmansion/rnscreens/S;->E(Lkotlin/jvm/internal/N;Lcom/swmansion/rnscreens/S;Lcom/swmansion/rnscreens/G;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
