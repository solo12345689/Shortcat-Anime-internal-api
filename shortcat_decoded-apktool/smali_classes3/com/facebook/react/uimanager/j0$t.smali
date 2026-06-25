.class final Lcom/facebook/react/uimanager/j0$t;
.super Lcom/facebook/react/uimanager/j0$v;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "t"
.end annotation


# instance fields
.field private final c:Lcom/facebook/react/uimanager/Q;

.field final synthetic d:Lcom/facebook/react/uimanager/j0;


# direct methods
.method private constructor <init>(Lcom/facebook/react/uimanager/j0;ILcom/facebook/react/uimanager/Q;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/facebook/react/uimanager/j0$t;->d:Lcom/facebook/react/uimanager/j0;

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/j0$v;-><init>(Lcom/facebook/react/uimanager/j0;I)V

    .line 4
    iput-object p3, p0, Lcom/facebook/react/uimanager/j0$t;->c:Lcom/facebook/react/uimanager/Q;

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/uimanager/j0;ILcom/facebook/react/uimanager/Q;Lcom/facebook/react/uimanager/k0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/j0$t;-><init>(Lcom/facebook/react/uimanager/j0;ILcom/facebook/react/uimanager/Q;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0$t;->d:Lcom/facebook/react/uimanager/j0;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/uimanager/j0;->d(Lcom/facebook/react/uimanager/j0;)Lcom/facebook/react/uimanager/y;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lcom/facebook/react/uimanager/j0$v;->a:I

    .line 8
    .line 9
    iget-object v2, p0, Lcom/facebook/react/uimanager/j0$t;->c:Lcom/facebook/react/uimanager/Q;

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/uimanager/y;->B(ILcom/facebook/react/uimanager/Q;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
