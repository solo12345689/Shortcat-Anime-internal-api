.class public final LSa/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/uimanager/L;


# instance fields
.field private final a:LSa/d;


# direct methods
.method public constructor <init>(LSa/d;)V
    .locals 1

    .line 1
    const-string v0, "dimmingView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LSa/h;->a:LSa/d;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public getPointerEvents()Lcom/facebook/react/uimanager/C;
    .locals 1

    .line 1
    iget-object v0, p0, LSa/h;->a:LSa/d;

    .line 2
    .line 3
    invoke-virtual {v0}, LSa/d;->getBlockGestures$react_native_screens_release()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/facebook/react/uimanager/C;->e:Lcom/facebook/react/uimanager/C;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    sget-object v0, Lcom/facebook/react/uimanager/C;->b:Lcom/facebook/react/uimanager/C;

    .line 13
    .line 14
    return-object v0
.end method
