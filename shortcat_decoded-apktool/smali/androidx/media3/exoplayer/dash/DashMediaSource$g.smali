.class final Landroidx/media3/exoplayer/dash/DashMediaSource$g;
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
    name = "g"
.end annotation


# instance fields
.field final synthetic a:Landroidx/media3/exoplayer/dash/DashMediaSource;


# direct methods
.method private constructor <init>(Landroidx/media3/exoplayer/dash/DashMediaSource;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$g;->a:Landroidx/media3/exoplayer/dash/DashMediaSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroidx/media3/exoplayer/dash/DashMediaSource;Landroidx/media3/exoplayer/dash/DashMediaSource$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource$g;-><init>(Landroidx/media3/exoplayer/dash/DashMediaSource;)V

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
    iget-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$g;->a:Landroidx/media3/exoplayer/dash/DashMediaSource;

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
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$g;->a:Landroidx/media3/exoplayer/dash/DashMediaSource;

    .line 2
    .line 3
    move-object v1, p1

    .line 4
    move-wide v2, p2

    .line 5
    move-wide v4, p4

    .line 6
    invoke-virtual/range {v0 .. v5}, Landroidx/media3/exoplayer/dash/DashMediaSource;->W(LQ2/o;JJ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public c(LQ2/o;JJLjava/io/IOException;I)LQ2/m$c;
    .locals 0

    .line 1
    move-object p7, p6

    .line 2
    move-wide p5, p4

    .line 3
    move-wide p3, p2

    .line 4
    move-object p2, p1

    .line 5
    iget-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$g;->a:Landroidx/media3/exoplayer/dash/DashMediaSource;

    .line 6
    .line 7
    invoke-virtual/range {p1 .. p7}, Landroidx/media3/exoplayer/dash/DashMediaSource;->X(LQ2/o;JJLjava/io/IOException;)LQ2/m$c;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public bridge synthetic h(LQ2/m$e;JJZ)V
    .locals 0

    .line 1
    check-cast p1, LQ2/o;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p6}, Landroidx/media3/exoplayer/dash/DashMediaSource$g;->a(LQ2/o;JJZ)V

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
    invoke-virtual/range {p0 .. p5}, Landroidx/media3/exoplayer/dash/DashMediaSource$g;->b(LQ2/o;JJ)V

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
    invoke-virtual/range {p0 .. p7}, Landroidx/media3/exoplayer/dash/DashMediaSource$g;->c(LQ2/o;JJLjava/io/IOException;I)LQ2/m$c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
