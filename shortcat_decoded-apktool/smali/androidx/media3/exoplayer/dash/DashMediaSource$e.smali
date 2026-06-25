.class final Landroidx/media3/exoplayer/dash/DashMediaSource$e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LQ2/m$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/dash/DashMediaSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Landroidx/media3/exoplayer/dash/DashMediaSource;


# direct methods
.method private constructor <init>(Landroidx/media3/exoplayer/dash/DashMediaSource;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$e;->a:Landroidx/media3/exoplayer/dash/DashMediaSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroidx/media3/exoplayer/dash/DashMediaSource;Landroidx/media3/exoplayer/dash/DashMediaSource$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource$e;-><init>(Landroidx/media3/exoplayer/dash/DashMediaSource;)V

    return-void
.end method


# virtual methods
.method public a(LQ2/o;JJZ)V
    .locals 0

    .line 1
    move-wide p5, p4

    .line 2
    move-wide p3, p2

    .line 3
    move-object p2, p1

    .line 4
    iget-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$e;->a:Landroidx/media3/exoplayer/dash/DashMediaSource;

    .line 5
    .line 6
    invoke-virtual/range {p1 .. p6}, Landroidx/media3/exoplayer/dash/DashMediaSource;->S(LQ2/o;JJ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public b(LQ2/o;JJ)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$e;->a:Landroidx/media3/exoplayer/dash/DashMediaSource;

    .line 2
    .line 3
    move-object v1, p1

    .line 4
    move-wide v2, p2

    .line 5
    move-wide v4, p4

    .line 6
    invoke-virtual/range {v0 .. v5}, Landroidx/media3/exoplayer/dash/DashMediaSource;->T(LQ2/o;JJ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public c(LQ2/o;JJLjava/io/IOException;I)LQ2/m$c;
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$e;->a:Landroidx/media3/exoplayer/dash/DashMediaSource;

    .line 2
    .line 3
    move-object v1, p1

    .line 4
    move-wide v2, p2

    .line 5
    move-wide v4, p4

    .line 6
    move-object v6, p6

    .line 7
    move v7, p7

    .line 8
    invoke-virtual/range {v0 .. v7}, Landroidx/media3/exoplayer/dash/DashMediaSource;->U(LQ2/o;JJLjava/io/IOException;I)LQ2/m$c;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public d(LQ2/o;JJI)V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$e;->a:Landroidx/media3/exoplayer/dash/DashMediaSource;

    .line 2
    .line 3
    move-object v1, p1

    .line 4
    move-wide v2, p2

    .line 5
    move-wide v4, p4

    .line 6
    move v6, p6

    .line 7
    invoke-virtual/range {v0 .. v6}, Landroidx/media3/exoplayer/dash/DashMediaSource;->V(LQ2/o;JJI)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public bridge synthetic h(LQ2/m$e;JJZ)V
    .locals 0

    .line 1
    check-cast p1, LQ2/o;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p6}, Landroidx/media3/exoplayer/dash/DashMediaSource$e;->a(LQ2/o;JJZ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic j(LQ2/m$e;JJ)V
    .locals 0

    .line 1
    check-cast p1, LQ2/o;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, Landroidx/media3/exoplayer/dash/DashMediaSource$e;->b(LQ2/o;JJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic n(LQ2/m$e;JJLjava/io/IOException;I)LQ2/m$c;
    .locals 0

    .line 1
    check-cast p1, LQ2/o;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p7}, Landroidx/media3/exoplayer/dash/DashMediaSource$e;->c(LQ2/o;JJLjava/io/IOException;I)LQ2/m$c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic v(LQ2/m$e;JJI)V
    .locals 0

    .line 1
    check-cast p1, LQ2/o;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p6}, Landroidx/media3/exoplayer/dash/DashMediaSource$e;->d(LQ2/o;JJI)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
