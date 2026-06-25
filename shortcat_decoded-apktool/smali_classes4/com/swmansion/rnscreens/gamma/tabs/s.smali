.class public final Lcom/swmansion/rnscreens/gamma/tabs/s;
.super LWa/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;I)V
    .locals 1

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, LWa/a;-><init>(Lcom/facebook/react/bridge/ReactContext;I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final h(Ljava/lang/String;IZ)V
    .locals 7

    .line 1
    const-string v0, "tabKey"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LWa/a;->e()Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, LZa/e;

    .line 11
    .line 12
    invoke-virtual {p0}, LWa/a;->f()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-virtual {p0}, LWa/a;->g()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    move-object v4, p1

    .line 21
    move v5, p2

    .line 22
    move v6, p3

    .line 23
    invoke-direct/range {v1 .. v6}, LZa/e;-><init>(IILjava/lang/String;IZ)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->d(Lcom/facebook/react/uimanager/events/d;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
