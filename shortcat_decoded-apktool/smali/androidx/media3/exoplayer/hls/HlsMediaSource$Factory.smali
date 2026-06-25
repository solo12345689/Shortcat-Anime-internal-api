.class public final Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LM2/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/hls/HlsMediaSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation


# static fields
.field public static final synthetic r:I


# instance fields
.field private final c:LG2/d;

.field private d:LG2/e;

.field private e:Lr3/r$a;

.field private f:Z

.field private g:I

.field private h:LH2/l;

.field private i:LH2/m$a;

.field private j:LM2/j;

.field private k:LF2/w;

.field private l:LQ2/k;

.field private m:Z

.field private n:I

.field private o:Z

.field private p:J

.field private q:J


# direct methods
.method public constructor <init>(LG2/d;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG2/d;

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->c:LG2/d;

    .line 4
    new-instance p1, LF2/l;

    invoke-direct {p1}, LF2/l;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->k:LF2/w;

    .line 5
    new-instance p1, LH2/a;

    invoke-direct {p1}, LH2/a;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->h:LH2/l;

    .line 6
    sget-object p1, LH2/c;->p:LH2/m$a;

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->i:LH2/m$a;

    .line 7
    new-instance p1, LQ2/j;

    invoke-direct {p1}, LQ2/j;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->l:LQ2/k;

    .line 8
    new-instance p1, LM2/k;

    invoke-direct {p1}, LM2/k;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->j:LM2/j;

    const/4 p1, 0x1

    .line 9
    iput p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->n:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    iput-wide v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->p:J

    .line 11
    iput-boolean p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->m:Z

    .line 12
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->h(Z)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;

    return-void
.end method

.method public constructor <init>(Lw2/g$a;)V
    .locals 1

    .line 1
    new-instance v0, LG2/b;

    invoke-direct {v0, p1}, LG2/b;-><init>(Lw2/g$a;)V

    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;-><init>(LG2/d;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lr3/r$a;)LM2/D$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->l(Lr3/r$a;)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;

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
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->i(I)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;

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
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->h(Z)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;

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
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->k(LQ2/k;)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;

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
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->g(Lq2/C;)Landroidx/media3/exoplayer/hls/HlsMediaSource;

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
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->j(LF2/w;)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public g(Lq2/C;)Landroidx/media3/exoplayer/hls/HlsMediaSource;
    .locals 20

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
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->d:LG2/e;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    new-instance v1, LG2/c;

    .line 15
    .line 16
    invoke-direct {v1}, LG2/c;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->d:LG2/e;

    .line 20
    .line 21
    :cond_0
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->e:Lr3/r$a;

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    iget-object v3, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->d:LG2/e;

    .line 26
    .line 27
    invoke-interface {v3, v1}, LG2/e;->a(Lr3/r$a;)LG2/e;

    .line 28
    .line 29
    .line 30
    :cond_1
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->d:LG2/e;

    .line 31
    .line 32
    iget-boolean v3, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->f:Z

    .line 33
    .line 34
    invoke-interface {v1, v3}, LG2/e;->c(Z)LG2/e;

    .line 35
    .line 36
    .line 37
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->d:LG2/e;

    .line 38
    .line 39
    iget v3, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->g:I

    .line 40
    .line 41
    invoke-interface {v1, v3}, LG2/e;->b(I)LG2/e;

    .line 42
    .line 43
    .line 44
    iget-object v4, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->d:LG2/e;

    .line 45
    .line 46
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->h:LH2/l;

    .line 47
    .line 48
    iget-object v3, v2, Lq2/C;->b:Lq2/C$h;

    .line 49
    .line 50
    iget-object v3, v3, Lq2/C$h;->e:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-nez v5, :cond_2

    .line 57
    .line 58
    new-instance v5, LH2/e;

    .line 59
    .line 60
    invoke-direct {v5, v1, v3}, LH2/e;-><init>(LH2/l;Ljava/util/List;)V

    .line 61
    .line 62
    .line 63
    move-object v1, v5

    .line 64
    :cond_2
    new-instance v3, Landroidx/media3/exoplayer/hls/HlsMediaSource;

    .line 65
    .line 66
    move-object v5, v3

    .line 67
    iget-object v3, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->c:LG2/d;

    .line 68
    .line 69
    move-object v6, v5

    .line 70
    iget-object v5, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->j:LM2/j;

    .line 71
    .line 72
    iget-object v7, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->k:LF2/w;

    .line 73
    .line 74
    invoke-interface {v7, v2}, LF2/w;->a(Lq2/C;)LF2/u;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    iget-object v8, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->l:LQ2/k;

    .line 79
    .line 80
    iget-object v9, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->i:LH2/m$a;

    .line 81
    .line 82
    iget-object v10, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->c:LG2/d;

    .line 83
    .line 84
    move-object v11, v6

    .line 85
    const/4 v6, 0x0

    .line 86
    invoke-interface {v9, v10, v8, v1, v6}, LH2/m$a;->a(LG2/d;LQ2/k;LH2/l;LQ2/e;)LH2/m;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    move-object v1, v11

    .line 91
    iget-wide v10, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->p:J

    .line 92
    .line 93
    iget-boolean v12, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->m:Z

    .line 94
    .line 95
    iget v13, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->n:I

    .line 96
    .line 97
    iget-boolean v14, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->o:Z

    .line 98
    .line 99
    move-object v15, v7

    .line 100
    iget-wide v6, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->q:J

    .line 101
    .line 102
    const/16 v17, 0x0

    .line 103
    .line 104
    move-wide/from16 v18, v6

    .line 105
    .line 106
    move-object v7, v15

    .line 107
    move-wide/from16 v15, v18

    .line 108
    .line 109
    const/4 v6, 0x0

    .line 110
    invoke-direct/range {v1 .. v17}, Landroidx/media3/exoplayer/hls/HlsMediaSource;-><init>(Lq2/C;LG2/d;LG2/e;LM2/j;LQ2/e;LF2/u;LQ2/k;LH2/m;JZIZJLandroidx/media3/exoplayer/hls/HlsMediaSource$a;)V

    .line 111
    .line 112
    .line 113
    return-object v1
.end method

.method public h(Z)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->f:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public i(I)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->g:I

    .line 2
    .line 3
    return-object p0
.end method

.method public j(LF2/w;)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;
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
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->k:LF2/w;

    .line 10
    .line 11
    return-object p0
.end method

.method public k(LQ2/k;)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;
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
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->l:LQ2/k;

    .line 10
    .line 11
    return-object p0
.end method

.method public l(Lr3/r$a;)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->e:Lr3/r$a;

    .line 2
    .line 3
    return-object p0
.end method
