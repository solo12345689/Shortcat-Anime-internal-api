.class final Landroidx/media3/exoplayer/l;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/media3/exoplayer/g1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/l$c;,
        Landroidx/media3/exoplayer/l$b;
    }
.end annotation


# instance fields
.field private final a:Landroidx/media3/exoplayer/g1;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x23

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    new-instance v0, Landroidx/media3/exoplayer/l$c;

    .line 12
    .line 13
    invoke-direct {v0, v2}, Landroidx/media3/exoplayer/l$c;-><init>(Landroidx/media3/exoplayer/l$a;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/media3/exoplayer/l;->a:Landroidx/media3/exoplayer/g1;

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance v0, Landroidx/media3/exoplayer/l$b;

    .line 20
    .line 21
    invoke-direct {v0, v2}, Landroidx/media3/exoplayer/l$b;-><init>(Landroidx/media3/exoplayer/l$a;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Landroidx/media3/exoplayer/l;->a:Landroidx/media3/exoplayer/g1;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public a(Landroidx/media3/exoplayer/g1$a;Landroid/content/Context;Landroid/os/Looper;Landroid/os/Looper;Lt2/j;)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/l;->a:Landroidx/media3/exoplayer/g1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v1, p1

    .line 6
    move-object v2, p2

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    move-object v5, p5

    .line 10
    invoke-interface/range {v0 .. v5}, Landroidx/media3/exoplayer/g1;->a(Landroidx/media3/exoplayer/g1$a;Landroid/content/Context;Landroid/os/Looper;Landroid/os/Looper;Lt2/j;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/l;->a:Landroidx/media3/exoplayer/g1;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/media3/exoplayer/g1;->b()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    return v0
.end method

.method public disable()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/l;->a:Landroidx/media3/exoplayer/g1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/media3/exoplayer/g1;->disable()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
