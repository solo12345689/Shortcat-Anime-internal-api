.class public final synthetic Landroidx/media3/exoplayer/k1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/media3/exoplayer/m1;

.field public final synthetic b:Z

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/m1;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/k1;->a:Landroidx/media3/exoplayer/m1;

    .line 5
    .line 6
    iput-boolean p2, p0, Landroidx/media3/exoplayer/k1;->b:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Landroidx/media3/exoplayer/k1;->c:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/k1;->a:Landroidx/media3/exoplayer/m1;

    .line 2
    .line 3
    iget-boolean v1, p0, Landroidx/media3/exoplayer/k1;->b:Z

    .line 4
    .line 5
    iget-boolean v2, p0, Landroidx/media3/exoplayer/k1;->c:Z

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Landroidx/media3/exoplayer/m1;->a(Landroidx/media3/exoplayer/m1;ZZ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
