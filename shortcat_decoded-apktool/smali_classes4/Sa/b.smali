.class public final LSa/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private a:Z

.field private b:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final c(Lcom/swmansion/rnscreens/y;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, LSa/b;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, LSa/b;->b:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/y;->A()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/y;->F()V

    .line 14
    .line 15
    .line 16
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final a(Lcom/swmansion/rnscreens/y;)V
    .locals 1

    .line 1
    const-string v0, "screen"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, LSa/b;->b:Z

    .line 8
    .line 9
    invoke-direct {p0, p1}, LSa/b;->c(Lcom/swmansion/rnscreens/y;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final b(Lcom/swmansion/rnscreens/y;)V
    .locals 1

    .line 1
    const-string v0, "screen"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, LSa/b;->a:Z

    .line 8
    .line 9
    invoke-direct {p0, p1}, LSa/b;->c(Lcom/swmansion/rnscreens/y;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
