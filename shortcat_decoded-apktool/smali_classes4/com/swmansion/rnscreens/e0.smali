.class public final synthetic Lcom/swmansion/rnscreens/e0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Landroidx/core/view/l1;


# direct methods
.method public synthetic constructor <init>(ZLandroidx/core/view/l1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/e0;->a:Z

    .line 5
    .line 6
    iput-object p2, p0, Lcom/swmansion/rnscreens/e0;->b:Landroidx/core/view/l1;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/e0;->a:Z

    .line 2
    .line 3
    iget-object v1, p0, Lcom/swmansion/rnscreens/e0;->b:Landroidx/core/view/l1;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/swmansion/rnscreens/g0;->b(ZLandroidx/core/view/l1;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
