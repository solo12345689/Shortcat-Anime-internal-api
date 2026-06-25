.class public final Lcom/swmansion/rnscreens/X$a;
.super Landroidx/core/view/p0$b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/swmansion/rnscreens/X;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LSa/o;

.field final synthetic b:Lcom/swmansion/rnscreens/X;


# direct methods
.method constructor <init>(LSa/o;Lcom/swmansion/rnscreens/X;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/swmansion/rnscreens/X$a;->a:LSa/o;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/swmansion/rnscreens/X$a;->b:Lcom/swmansion/rnscreens/X;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Landroidx/core/view/p0$b;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public onEnd(Landroidx/core/view/p0;)V
    .locals 1

    .line 1
    const-string v0, "animation"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroidx/core/view/p0$b;->onEnd(Landroidx/core/view/p0;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lcom/swmansion/rnscreens/X$a;->b:Lcom/swmansion/rnscreens/X;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/F;->k()Lcom/swmansion/rnscreens/y;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/y;->y()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public onProgress(Landroidx/core/view/L0;Ljava/util/List;)Landroidx/core/view/L0;
    .locals 1

    .line 1
    const-string v0, "insets"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "runningAnimations"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 12
    .line 13
    const/16 v0, 0x1e

    .line 14
    .line 15
    if-lt p2, v0, :cond_0

    .line 16
    .line 17
    iget-object p2, p0, Lcom/swmansion/rnscreens/X$a;->a:LSa/o;

    .line 18
    .line 19
    invoke-virtual {p2, p1}, LSa/o;->J(Landroidx/core/view/L0;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-object p1
.end method
