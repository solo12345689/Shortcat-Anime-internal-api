.class Lcom/facebook/react/t$a;
.super Lcom/facebook/react/w;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/t;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic j:Lcom/facebook/react/t;


# direct methods
.method constructor <init>(Lcom/facebook/react/t;Landroid/app/Activity;Lcom/facebook/react/N;Ljava/lang/String;Landroid/os/Bundle;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/t$a;->j:Lcom/facebook/react/t;

    .line 2
    .line 3
    move-object p1, p0

    .line 4
    invoke-direct/range {p1 .. p6}, Lcom/facebook/react/w;-><init>(Landroid/app/Activity;Lcom/facebook/react/N;Ljava/lang/String;Landroid/os/Bundle;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method protected b()Lcom/facebook/react/W;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/t$a;->j:Lcom/facebook/react/t;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/t;->createRootView()Lcom/facebook/react/W;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-super {p0}, Lcom/facebook/react/w;->b()Lcom/facebook/react/W;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    return-object v0
.end method
