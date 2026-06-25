.class public final LSa/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/uimanager/L;


# instance fields
.field private a:LSa/h;


# direct methods
.method public constructor <init>(LSa/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LSa/i;->a:LSa/h;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(LSa/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, LSa/i;->a:LSa/h;

    .line 2
    .line 3
    return-void
.end method

.method public getPointerEvents()Lcom/facebook/react/uimanager/C;
    .locals 1

    .line 1
    iget-object v0, p0, LSa/i;->a:LSa/h;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, LSa/h;->getPointerEvents()Lcom/facebook/react/uimanager/C;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-object v0

    .line 13
    :cond_1
    :goto_0
    sget-object v0, Lcom/facebook/react/uimanager/C;->b:Lcom/facebook/react/uimanager/C;

    .line 14
    .line 15
    return-object v0
.end method
