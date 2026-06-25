.class public final LT2/b;
.super Landroidx/media3/exoplayer/h;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final s:Lz2/f;

.field private final t:Lt2/I;

.field private u:LT2/a;

.field private v:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/h;-><init>(I)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Lz2/f;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1}, Lz2/f;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LT2/b;->s:Lz2/f;

    .line 12
    .line 13
    new-instance v0, Lt2/I;

    .line 14
    .line 15
    invoke-direct {v0}, Lt2/I;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, LT2/b;->t:Lt2/I;

    .line 19
    .line 20
    return-void
.end method

.method private r0(Ljava/nio/ByteBuffer;)[F
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x10

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1

    .line 11
    :cond_0
    iget-object v0, p0, LT2/b;->t:Lt2/I;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-virtual {v0, v1, v2}, Lt2/I;->Z([BI)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, LT2/b;->t:Lt2/I;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    add-int/lit8 p1, p1, 0x4

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lt2/I;->b0(I)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x3

    .line 36
    new-array v0, p1, [F

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    :goto_0
    if-ge v1, p1, :cond_1

    .line 40
    .line 41
    iget-object v2, p0, LT2/b;->t:Lt2/I;

    .line 42
    .line 43
    invoke-virtual {v2}, Lt2/I;->z()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    aput v2, v0, v1

    .line 52
    .line 53
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    return-object v0
.end method

.method private s0()V
    .locals 1

    .line 1
    iget-object v0, p0, LT2/b;->u:LT2/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, LT2/a;->c()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method


# virtual methods
.method public b(Lq2/x;)I
    .locals 1

    .line 1
    const-string v0, "application/x-camera-motion"

    .line 2
    .line 3
    iget-object p1, p1, Lq2/x;->o:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x4

    .line 12
    invoke-static {p1}, Landroidx/media3/exoplayer/O0;->t(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    invoke-static {p1}, Landroidx/media3/exoplayer/O0;->t(I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1
.end method

.method public d()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method protected d0()V
    .locals 0

    .line 1
    invoke-direct {p0}, LT2/b;->s0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public g(JJ)V
    .locals 4

    .line 1
    :cond_0
    :goto_0
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->i()Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    if-nez p3, :cond_5

    .line 6
    .line 7
    iget-wide p3, p0, LT2/b;->v:J

    .line 8
    .line 9
    const-wide/32 v0, 0x186a0

    .line 10
    .line 11
    .line 12
    add-long/2addr v0, p1

    .line 13
    cmp-long p3, p3, v0

    .line 14
    .line 15
    if-gez p3, :cond_5

    .line 16
    .line 17
    iget-object p3, p0, LT2/b;->s:Lz2/f;

    .line 18
    .line 19
    invoke-virtual {p3}, Lz2/f;->m()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->V()LA2/J;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    iget-object p4, p0, LT2/b;->s:Lz2/f;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-virtual {p0, p3, p4, v0}, Landroidx/media3/exoplayer/h;->o0(LA2/J;Lz2/f;I)I

    .line 30
    .line 31
    .line 32
    move-result p3

    .line 33
    const/4 p4, -0x4

    .line 34
    if-ne p3, p4, :cond_5

    .line 35
    .line 36
    iget-object p3, p0, LT2/b;->s:Lz2/f;

    .line 37
    .line 38
    invoke-virtual {p3}, Lz2/a;->q()Z

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    if-eqz p3, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    iget-object p3, p0, LT2/b;->s:Lz2/f;

    .line 46
    .line 47
    iget-wide p3, p3, Lz2/f;->f:J

    .line 48
    .line 49
    iput-wide p3, p0, LT2/b;->v:J

    .line 50
    .line 51
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->X()J

    .line 52
    .line 53
    .line 54
    move-result-wide v1

    .line 55
    cmp-long p3, p3, v1

    .line 56
    .line 57
    if-gez p3, :cond_2

    .line 58
    .line 59
    const/4 v0, 0x1

    .line 60
    :cond_2
    iget-object p3, p0, LT2/b;->u:LT2/a;

    .line 61
    .line 62
    if-eqz p3, :cond_0

    .line 63
    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    iget-object p3, p0, LT2/b;->s:Lz2/f;

    .line 68
    .line 69
    invoke-virtual {p3}, Lz2/f;->y()V

    .line 70
    .line 71
    .line 72
    iget-object p3, p0, LT2/b;->s:Lz2/f;

    .line 73
    .line 74
    iget-object p3, p3, Lz2/f;->d:Ljava/nio/ByteBuffer;

    .line 75
    .line 76
    invoke-static {p3}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    check-cast p3, Ljava/nio/ByteBuffer;

    .line 81
    .line 82
    invoke-direct {p0, p3}, LT2/b;->r0(Ljava/nio/ByteBuffer;)[F

    .line 83
    .line 84
    .line 85
    move-result-object p3

    .line 86
    if-nez p3, :cond_4

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_4
    iget-object p4, p0, LT2/b;->u:LT2/a;

    .line 90
    .line 91
    invoke-static {p4}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p4

    .line 95
    check-cast p4, LT2/a;

    .line 96
    .line 97
    iget-wide v0, p0, LT2/b;->v:J

    .line 98
    .line 99
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->a0()J

    .line 100
    .line 101
    .line 102
    move-result-wide v2

    .line 103
    sub-long/2addr v0, v2

    .line 104
    invoke-interface {p4, v0, v1, p3}, LT2/a;->b(J[F)V

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_5
    :goto_1
    return-void
.end method

.method protected g0(JZ)V
    .locals 0

    .line 1
    const-wide/high16 p1, -0x8000000000000000L

    .line 2
    .line 3
    iput-wide p1, p0, LT2/b;->v:J

    .line 4
    .line 5
    invoke-direct {p0}, LT2/b;->s0()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "CameraMotionRenderer"

    .line 2
    .line 3
    return-object v0
.end method

.method public isReady()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public v(ILjava/lang/Object;)V
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    check-cast p2, LT2/a;

    .line 6
    .line 7
    iput-object p2, p0, LT2/b;->u:LT2/a;

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/media3/exoplayer/h;->v(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
