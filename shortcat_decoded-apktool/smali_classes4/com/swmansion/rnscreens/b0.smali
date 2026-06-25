.class public final Lcom/swmansion/rnscreens/b0;
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
    iput-object p1, p0, Lcom/swmansion/rnscreens/b0;->a:Lcom/facebook/react/bridge/ReactContext;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public setLocalData(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/P;->setLocalData(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
