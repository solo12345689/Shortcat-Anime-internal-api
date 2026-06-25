.class public final LKd/o;
.super LKd/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LKd/a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final s()J
    .locals 4

    .line 1
    iget-wide v0, p0, LKd/a;->c:J

    .line 2
    .line 3
    const/16 v2, 0x3e8

    .line 4
    .line 5
    int-to-long v2, v2

    .line 6
    div-long/2addr v0, v2

    .line 7
    return-wide v0
.end method

.method private final t(J)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lt2/a0;->V0(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    iput-wide p1, p0, LKd/a;->e:J

    .line 6
    .line 7
    return-void
.end method

.method private final u(J)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lt2/a0;->V0(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    iput-wide p1, p0, LKd/a;->d:J

    .line 6
    .line 7
    return-void
.end method

.method private final v(J)V
    .locals 2

    .line 1
    invoke-static {p1, p2}, Lt2/a0;->V0(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, LKd/a;->b:J

    .line 6
    .line 7
    invoke-static {p1, p2}, Lt2/a0;->V0(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide p1

    .line 11
    iput-wide p1, p0, LKd/a;->c:J

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final r(Lexpo/modules/video/records/BufferOptions;)V
    .locals 6

    .line 1
    const-string v0, "bufferOptions"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lexpo/modules/video/records/BufferOptions;->getPreferredForwardBufferDuration()Ljava/lang/Double;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/16 v1, 0x3e8

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    int-to-double v4, v1

    .line 19
    mul-double/2addr v2, v4

    .line 20
    double-to-long v2, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-wide/32 v2, 0xc350

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-direct {p0, v2, v3}, LKd/o;->v(J)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lexpo/modules/video/records/BufferOptions;->getMaxBufferBytes()J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    const-wide/16 v4, 0x0

    .line 33
    .line 34
    cmp-long v0, v2, v4

    .line 35
    .line 36
    const/4 v2, -0x1

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    move v0, v2

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-virtual {p1}, Lexpo/modules/video/records/BufferOptions;->getMaxBufferBytes()J

    .line 42
    .line 43
    .line 44
    move-result-wide v3

    .line 45
    long-to-int v0, v3

    .line 46
    :goto_1
    iput v0, p0, LKd/a;->f:I

    .line 47
    .line 48
    if-eq v0, v2, :cond_2

    .line 49
    .line 50
    iget-object v0, p0, LKd/a;->j:Ljava/util/HashMap;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_2

    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, LKd/a$a;

    .line 71
    .line 72
    iget v3, p0, LKd/a;->f:I

    .line 73
    .line 74
    iput v3, v2, LKd/a$a;->b:I

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    invoke-virtual {p1}, Lexpo/modules/video/records/BufferOptions;->getPrioritizeTimeOverSizeThreshold()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    iput-boolean v0, p0, LKd/a;->g:Z

    .line 82
    .line 83
    invoke-virtual {p1}, Lexpo/modules/video/records/BufferOptions;->getMinBufferForPlayback()D

    .line 84
    .line 85
    .line 86
    move-result-wide v2

    .line 87
    int-to-double v0, v1

    .line 88
    mul-double/2addr v2, v0

    .line 89
    invoke-direct {p0}, LKd/o;->s()J

    .line 90
    .line 91
    .line 92
    move-result-wide v4

    .line 93
    long-to-double v4, v4

    .line 94
    cmpl-double v2, v2, v4

    .line 95
    .line 96
    if-lez v2, :cond_3

    .line 97
    .line 98
    invoke-direct {p0}, LKd/o;->s()J

    .line 99
    .line 100
    .line 101
    move-result-wide v0

    .line 102
    goto :goto_3

    .line 103
    :cond_3
    invoke-virtual {p1}, Lexpo/modules/video/records/BufferOptions;->getMinBufferForPlayback()D

    .line 104
    .line 105
    .line 106
    move-result-wide v2

    .line 107
    mul-double/2addr v2, v0

    .line 108
    double-to-long v0, v2

    .line 109
    :goto_3
    invoke-direct {p0, v0, v1}, LKd/o;->u(J)V

    .line 110
    .line 111
    .line 112
    invoke-direct {p0, v0, v1}, LKd/o;->t(J)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, LKd/a;->q()V

    .line 116
    .line 117
    .line 118
    return-void
.end method
