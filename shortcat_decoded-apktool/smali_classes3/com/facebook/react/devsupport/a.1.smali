.class public final Lcom/facebook/react/devsupport/a;
.super Lcom/facebook/react/devsupport/Y;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/react/devsupport/u0;Ljava/lang/String;ZLc7/j;Lc7/c;ILjava/util/Map;LU6/h;Lc7/d;Lc7/i;)V
    .locals 1

    .line 1
    const-string v0, "applicationContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "reactInstanceManagerHelper"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct/range {p0 .. p11}, Lcom/facebook/react/devsupport/Y;-><init>(Landroid/content/Context;Lcom/facebook/react/devsupport/u0;Ljava/lang/String;ZLc7/j;Lc7/c;ILjava/util/Map;LU6/h;Lc7/d;Lc7/i;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public B()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/Y;->p()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/Y;->x0()Lcom/facebook/react/devsupport/u0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "BridgelessDevSupportManager.handleReloadJS()"

    .line 12
    .line 13
    invoke-interface {v0, v1}, Lcom/facebook/react/devsupport/u0;->reload(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method protected z0()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Bridgeless"

    .line 2
    .line 3
    return-object v0
.end method
