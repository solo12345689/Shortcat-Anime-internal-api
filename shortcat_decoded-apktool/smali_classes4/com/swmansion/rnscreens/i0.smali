.class public final Lcom/swmansion/rnscreens/i0;
.super Lcom/facebook/react/uimanager/r;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private a:Lcom/facebook/react/bridge/ReactContext;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/facebook/react/uimanager/r;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/swmansion/rnscreens/i0;->a:Lcom/facebook/react/bridge/ReactContext;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic f(Lcom/swmansion/rnscreens/i0;Lcom/facebook/react/uimanager/y;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/swmansion/rnscreens/i0;->g(Lcom/swmansion/rnscreens/i0;Lcom/facebook/react/uimanager/y;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final g(Lcom/swmansion/rnscreens/i0;Lcom/facebook/react/uimanager/y;)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/P;->getReactTag()I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    invoke-virtual {p1, p0}, Lcom/facebook/react/uimanager/y;->u(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    instance-of p1, p0, Lcom/swmansion/rnscreens/A;

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    check-cast p0, Lcom/swmansion/rnscreens/A;

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/A;->v()V

    .line 19
    .line 20
    .line 21
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public onBeforeLayout(Lcom/facebook/react/uimanager/z;)V
    .locals 1

    .line 1
    const-string v0, "nativeViewHierarchyOptimizer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/P;->onBeforeLayout(Lcom/facebook/react/uimanager/z;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lcom/swmansion/rnscreens/i0;->a:Lcom/facebook/react/bridge/ReactContext;

    .line 10
    .line 11
    const-class v0, Lcom/facebook/react/uimanager/UIManagerModule;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lcom/facebook/react/uimanager/UIManagerModule;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    new-instance v0, Lcom/swmansion/rnscreens/h0;

    .line 22
    .line 23
    invoke-direct {v0, p0}, Lcom/swmansion/rnscreens/h0;-><init>(Lcom/swmansion/rnscreens/i0;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Lcom/facebook/react/uimanager/UIManagerModule;->addUIBlock(Lcom/facebook/react/uimanager/d0;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method
