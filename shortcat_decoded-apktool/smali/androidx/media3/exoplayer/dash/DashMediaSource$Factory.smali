.class public final Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LM2/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/dash/DashMediaSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation


# static fields
.field public static final synthetic k:I


# instance fields
.field private final c:Landroidx/media3/exoplayer/dash/a$a;

.field private final d:Lw2/g$a;

.field private e:LF2/w;

.field private f:LM2/j;

.field private g:LQ2/k;

.field private h:J

.field private i:J

.field private j:LQ2/o$a;


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/dash/a$a;Lw2/g$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/media3/exoplayer/dash/a$a;

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->c:Landroidx/media3/exoplayer/dash/a$a;

    .line 4
    iput-object p2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->d:Lw2/g$a;

    .line 5
    new-instance p1, LF2/l;

    invoke-direct {p1}, LF2/l;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->e:LF2/w;

    .line 6
    new-instance p1, LQ2/j;

    invoke-direct {p1}, LQ2/j;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->g:LQ2/k;

    const-wide/16 p1, 0x7530

    .line 7
    iput-wide p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->h:J

    const-wide/32 p1, 0x4c4b40

    .line 8
    iput-wide p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->i:J

    .line 9
    new-instance p1, LM2/k;

    invoke-direct {p1}, LM2/k;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->f:LM2/j;

    const/4 p1, 0x1

    .line 10
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->h(Z)Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;

    return-void
.end method

.method public constructor <init>(Lw2/g$a;)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/dash/d$a;

    invoke-direct {v0, p1}, Landroidx/media3/exoplayer/dash/d$a;-><init>(Lw2/g$a;)V

    invoke-direct {p0, v0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;-><init>(Landroidx/media3/exoplayer/dash/a$a;Lw2/g$a;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lr3/r$a;)LM2/D$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->l(Lr3/r$a;)Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic b(I)LM2/D$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->i(I)Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic c(Z)LM2/D$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->h(Z)Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic d(LQ2/k;)LM2/D$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->k(LQ2/k;)Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic e(Lq2/C;)LM2/D;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->g(Lq2/C;)Landroidx/media3/exoplayer/dash/DashMediaSource;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic f(LF2/w;)LM2/D$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->j(LF2/w;)Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public g(Lq2/C;)Landroidx/media3/exoplayer/dash/DashMediaSource;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget-object v1, v2, Lq2/C;->b:Lq2/C$h;

    .line 6
    .line 7
    invoke-static {v1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->j:LQ2/o$a;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    new-instance v1, LE2/d;

    .line 15
    .line 16
    invoke-direct {v1}, LE2/d;-><init>()V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v3, v2, Lq2/C;->b:Lq2/C$h;

    .line 20
    .line 21
    iget-object v3, v3, Lq2/C$h;->e:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-nez v4, :cond_1

    .line 28
    .line 29
    new-instance v4, LL2/b;

    .line 30
    .line 31
    invoke-direct {v4, v1, v3}, LL2/b;-><init>(LQ2/o$a;Ljava/util/List;)V

    .line 32
    .line 33
    .line 34
    move-object v5, v4

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object v5, v1

    .line 37
    :goto_0
    new-instance v1, Landroidx/media3/exoplayer/dash/DashMediaSource;

    .line 38
    .line 39
    iget-object v4, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->d:Lw2/g$a;

    .line 40
    .line 41
    iget-object v6, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->c:Landroidx/media3/exoplayer/dash/a$a;

    .line 42
    .line 43
    iget-object v7, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->f:LM2/j;

    .line 44
    .line 45
    iget-object v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->e:LF2/w;

    .line 46
    .line 47
    invoke-interface {v3, v2}, LF2/w;->a(Lq2/C;)LF2/u;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    iget-object v10, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->g:LQ2/k;

    .line 52
    .line 53
    iget-wide v11, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->h:J

    .line 54
    .line 55
    iget-wide v13, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->i:J

    .line 56
    .line 57
    const/4 v15, 0x0

    .line 58
    const/4 v3, 0x0

    .line 59
    const/4 v8, 0x0

    .line 60
    invoke-direct/range {v1 .. v15}, Landroidx/media3/exoplayer/dash/DashMediaSource;-><init>(Lq2/C;LE2/c;Lw2/g$a;LQ2/o$a;Landroidx/media3/exoplayer/dash/a$a;LM2/j;LQ2/e;LF2/u;LQ2/k;JJLandroidx/media3/exoplayer/dash/DashMediaSource$a;)V

    .line 61
    .line 62
    .line 63
    return-object v1
.end method

.method public h(Z)Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->c:Landroidx/media3/exoplayer/dash/a$a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/dash/a$a;->c(Z)Landroidx/media3/exoplayer/dash/a$a;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public i(I)Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->c:Landroidx/media3/exoplayer/dash/a$a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/dash/a$a;->b(I)Landroidx/media3/exoplayer/dash/a$a;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public j(LF2/w;)Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;
    .locals 1

    .line 1
    const-string v0, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LF2/w;

    .line 8
    .line 9
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->e:LF2/w;

    .line 10
    .line 11
    return-object p0
.end method

.method public k(LQ2/k;)Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;
    .locals 1

    .line 1
    const-string v0, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LQ2/k;

    .line 8
    .line 9
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->g:LQ2/k;

    .line 10
    .line 11
    return-object p0
.end method

.method public l(Lr3/r$a;)Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->c:Landroidx/media3/exoplayer/dash/a$a;

    .line 2
    .line 3
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lr3/r$a;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/dash/a$a;->a(Lr3/r$a;)Landroidx/media3/exoplayer/dash/a$a;

    .line 10
    .line 11
    .line 12
    return-object p0
.end method
