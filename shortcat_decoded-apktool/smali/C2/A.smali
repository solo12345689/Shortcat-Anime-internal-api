.class final LC2/A;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC2/A$a;
    }
.end annotation


# instance fields
.field private final a:LC2/A$a;

.field private final b:I

.field private final c:LC2/B$a;

.field private d:I

.field private e:J

.field private f:J

.field private g:J

.field private h:J

.field private i:J


# direct methods
.method public constructor <init>(Landroid/media/AudioTrack;LC2/B$a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LC2/A$a;

    .line 5
    .line 6
    invoke-direct {v0, p1}, LC2/A$a;-><init>(Landroid/media/AudioTrack;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LC2/A;->a:LC2/A$a;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/media/AudioTrack;->getSampleRate()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iput p1, p0, LC2/A;->b:I

    .line 16
    .line 17
    iput-object p2, p0, LC2/A;->c:LC2/B$a;

    .line 18
    .line 19
    invoke-virtual {p0}, LC2/A;->j()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private a(JFJ)V
    .locals 11

    .line 1
    iget-object v0, p0, LC2/A;->a:LC2/A$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LC2/A$a;->c()J

    .line 4
    .line 5
    .line 6
    move-result-wide v4

    .line 7
    invoke-direct/range {p0 .. p3}, LC2/A;->b(JF)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    sub-long v2, v4, p1

    .line 12
    .line 13
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    const-wide/32 v6, 0x4c4b40

    .line 18
    .line 19
    .line 20
    cmp-long p3, v2, v6

    .line 21
    .line 22
    const/4 v10, 0x4

    .line 23
    if-lez p3, :cond_0

    .line 24
    .line 25
    iget-object v1, p0, LC2/A;->c:LC2/B$a;

    .line 26
    .line 27
    iget-object p3, p0, LC2/A;->a:LC2/A$a;

    .line 28
    .line 29
    invoke-virtual {p3}, LC2/A$a;->b()J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    move-wide v6, p1

    .line 34
    move-wide v8, p4

    .line 35
    invoke-interface/range {v1 .. v9}, LC2/B$a;->e(JJJJ)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, v10}, LC2/A;->k(I)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    sub-long/2addr v0, p4

    .line 43
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    cmp-long p3, v0, v6

    .line 48
    .line 49
    if-lez p3, :cond_1

    .line 50
    .line 51
    iget-object v1, p0, LC2/A;->c:LC2/B$a;

    .line 52
    .line 53
    iget-object p3, p0, LC2/A;->a:LC2/A$a;

    .line 54
    .line 55
    invoke-virtual {p3}, LC2/A$a;->b()J

    .line 56
    .line 57
    .line 58
    move-result-wide v2

    .line 59
    move-wide v6, p1

    .line 60
    move-wide v8, p4

    .line 61
    invoke-interface/range {v1 .. v9}, LC2/B$a;->d(JJJJ)V

    .line 62
    .line 63
    .line 64
    invoke-direct {p0, v10}, LC2/A;->k(I)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_1
    iget p1, p0, LC2/A;->d:I

    .line 69
    .line 70
    if-ne p1, v10, :cond_2

    .line 71
    .line 72
    invoke-virtual {p0}, LC2/A;->j()V

    .line 73
    .line 74
    .line 75
    :cond_2
    return-void
.end method

.method private b(JF)J
    .locals 9

    .line 1
    iget-object v0, p0, LC2/A;->a:LC2/A$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LC2/A$a;->b()J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    iget-object v0, p0, LC2/A;->a:LC2/A$a;

    .line 8
    .line 9
    invoke-virtual {v0}, LC2/A$a;->c()J

    .line 10
    .line 11
    .line 12
    move-result-wide v4

    .line 13
    move-object v1, p0

    .line 14
    move-wide v6, p1

    .line 15
    move v8, p3

    .line 16
    invoke-direct/range {v1 .. v8}, LC2/A;->c(JJJF)J

    .line 17
    .line 18
    .line 19
    move-result-wide p1

    .line 20
    return-wide p1
.end method

.method private c(JJJF)J
    .locals 1

    .line 1
    iget v0, p0, LC2/A;->b:I

    .line 2
    .line 3
    invoke-static {p1, p2, v0}, Lt2/a0;->l1(JI)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    sub-long/2addr p5, p3

    .line 8
    invoke-static {p5, p6, p7}, Lt2/a0;->j0(JF)J

    .line 9
    .line 10
    .line 11
    move-result-wide p3

    .line 12
    add-long/2addr p1, p3

    .line 13
    return-wide p1
.end method

.method private g(JF)Z
    .locals 10

    .line 1
    iget-object v0, p0, LC2/A;->a:LC2/A$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LC2/A$a;->b()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-wide v3, p0, LC2/A;->h:J

    .line 8
    .line 9
    cmp-long v0, v0, v3

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-gtz v0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    iget-wide v5, p0, LC2/A;->i:J

    .line 16
    .line 17
    move-object v2, p0

    .line 18
    move-wide v7, p1

    .line 19
    move v9, p3

    .line 20
    invoke-direct/range {v2 .. v9}, LC2/A;->c(JJJF)J

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    invoke-direct {p0, v7, v8, v9}, LC2/A;->b(JF)J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    sub-long/2addr v2, p1

    .line 29
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide p1

    .line 33
    const-wide/16 v2, 0x3e8

    .line 34
    .line 35
    cmp-long p1, p1, v2

    .line 36
    .line 37
    if-gez p1, :cond_1

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    return p1

    .line 41
    :cond_1
    return v1
.end method

.method private k(I)V
    .locals 6

    .line 1
    iput p1, p0, LC2/A;->d:I

    .line 2
    .line 3
    const-wide/16 v0, 0x2710

    .line 4
    .line 5
    if-eqz p1, :cond_3

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eq p1, v2, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-eq p1, v0, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    if-eq p1, v0, :cond_1

    .line 15
    .line 16
    const/4 v0, 0x4

    .line 17
    if-ne p1, v0, :cond_0

    .line 18
    .line 19
    const-wide/32 v0, 0x7a120

    .line 20
    .line 21
    .line 22
    iput-wide v0, p0, LC2/A;->f:J

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    const-wide/32 v0, 0x989680

    .line 32
    .line 33
    .line 34
    iput-wide v0, p0, LC2/A;->f:J

    .line 35
    .line 36
    return-void

    .line 37
    :cond_2
    iput-wide v0, p0, LC2/A;->f:J

    .line 38
    .line 39
    return-void

    .line 40
    :cond_3
    const-wide/16 v2, 0x0

    .line 41
    .line 42
    iput-wide v2, p0, LC2/A;->g:J

    .line 43
    .line 44
    const-wide/16 v2, -0x1

    .line 45
    .line 46
    iput-wide v2, p0, LC2/A;->h:J

    .line 47
    .line 48
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    iput-wide v2, p0, LC2/A;->i:J

    .line 54
    .line 55
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 56
    .line 57
    .line 58
    move-result-wide v2

    .line 59
    const-wide/16 v4, 0x3e8

    .line 60
    .line 61
    div-long/2addr v2, v4

    .line 62
    iput-wide v2, p0, LC2/A;->e:J

    .line 63
    .line 64
    iput-wide v0, p0, LC2/A;->f:J

    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, LC2/A;->a:LC2/A$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LC2/A$a;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public e(JF)J
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LC2/A;->b(JF)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    return-wide p1
.end method

.method public f()Z
    .locals 2

    .line 1
    iget v0, p0, LC2/A;->d:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    return v0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return v0
.end method

.method public h()Z
    .locals 2

    .line 1
    iget v0, p0, LC2/A;->d:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_1
    :goto_0
    return v1
.end method

.method public i(JFJ)V
    .locals 4

    .line 1
    iget-wide v0, p0, LC2/A;->g:J

    .line 2
    .line 3
    sub-long v0, p1, v0

    .line 4
    .line 5
    iget-wide v2, p0, LC2/A;->f:J

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-gez v0, :cond_0

    .line 10
    .line 11
    move-object p1, p0

    .line 12
    goto/16 :goto_0

    .line 13
    .line 14
    :cond_0
    iput-wide p1, p0, LC2/A;->g:J

    .line 15
    .line 16
    iget-object v0, p0, LC2/A;->a:LC2/A$a;

    .line 17
    .line 18
    invoke-virtual {v0}, LC2/A$a;->d()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-direct/range {p0 .. p5}, LC2/A;->a(JFJ)V

    .line 25
    .line 26
    .line 27
    :cond_1
    move p4, p3

    .line 28
    move-wide p2, p1

    .line 29
    move-object p1, p0

    .line 30
    iget p5, p1, LC2/A;->d:I

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    const/4 v2, 0x3

    .line 34
    if-eqz p5, :cond_9

    .line 35
    .line 36
    const/4 v3, 0x2

    .line 37
    if-eq p5, v1, :cond_5

    .line 38
    .line 39
    if-eq p5, v3, :cond_4

    .line 40
    .line 41
    if-eq p5, v2, :cond_3

    .line 42
    .line 43
    const/4 p2, 0x4

    .line 44
    if-ne p5, p2, :cond_2

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    invoke-direct {p2}, Ljava/lang/IllegalStateException;-><init>()V

    .line 50
    .line 51
    .line 52
    throw p2

    .line 53
    :cond_3
    if-eqz v0, :cond_b

    .line 54
    .line 55
    invoke-virtual {p0}, LC2/A;->j()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_4
    if-nez v0, :cond_b

    .line 60
    .line 61
    invoke-virtual {p0}, LC2/A;->j()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_5
    if-eqz v0, :cond_8

    .line 66
    .line 67
    invoke-direct {p0, p2, p3, p4}, LC2/A;->g(JF)Z

    .line 68
    .line 69
    .line 70
    move-result p4

    .line 71
    if-eqz p4, :cond_6

    .line 72
    .line 73
    invoke-direct {p0, v3}, LC2/A;->k(I)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_6
    iget-wide p4, p1, LC2/A;->e:J

    .line 78
    .line 79
    sub-long/2addr p2, p4

    .line 80
    const-wide/32 p4, 0x1e8480

    .line 81
    .line 82
    .line 83
    cmp-long p2, p2, p4

    .line 84
    .line 85
    if-lez p2, :cond_7

    .line 86
    .line 87
    invoke-direct {p0, v2}, LC2/A;->k(I)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_7
    iget-object p2, p1, LC2/A;->a:LC2/A$a;

    .line 92
    .line 93
    invoke-virtual {p2}, LC2/A$a;->b()J

    .line 94
    .line 95
    .line 96
    move-result-wide p2

    .line 97
    iput-wide p2, p1, LC2/A;->h:J

    .line 98
    .line 99
    iget-object p2, p1, LC2/A;->a:LC2/A$a;

    .line 100
    .line 101
    invoke-virtual {p2}, LC2/A$a;->c()J

    .line 102
    .line 103
    .line 104
    move-result-wide p2

    .line 105
    iput-wide p2, p1, LC2/A;->i:J

    .line 106
    .line 107
    return-void

    .line 108
    :cond_8
    invoke-virtual {p0}, LC2/A;->j()V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_9
    if-eqz v0, :cond_a

    .line 113
    .line 114
    iget-object p2, p1, LC2/A;->a:LC2/A$a;

    .line 115
    .line 116
    invoke-virtual {p2}, LC2/A$a;->c()J

    .line 117
    .line 118
    .line 119
    move-result-wide p2

    .line 120
    iget-wide p4, p1, LC2/A;->e:J

    .line 121
    .line 122
    cmp-long p2, p2, p4

    .line 123
    .line 124
    if-ltz p2, :cond_b

    .line 125
    .line 126
    iget-object p2, p1, LC2/A;->a:LC2/A$a;

    .line 127
    .line 128
    invoke-virtual {p2}, LC2/A$a;->b()J

    .line 129
    .line 130
    .line 131
    move-result-wide p2

    .line 132
    iput-wide p2, p1, LC2/A;->h:J

    .line 133
    .line 134
    iget-object p2, p1, LC2/A;->a:LC2/A$a;

    .line 135
    .line 136
    invoke-virtual {p2}, LC2/A$a;->c()J

    .line 137
    .line 138
    .line 139
    move-result-wide p2

    .line 140
    iput-wide p2, p1, LC2/A;->i:J

    .line 141
    .line 142
    invoke-direct {p0, v1}, LC2/A;->k(I)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :cond_a
    iget-wide p4, p1, LC2/A;->e:J

    .line 147
    .line 148
    sub-long/2addr p2, p4

    .line 149
    const-wide/32 p4, 0x7a120

    .line 150
    .line 151
    .line 152
    cmp-long p2, p2, p4

    .line 153
    .line 154
    if-lez p2, :cond_b

    .line 155
    .line 156
    invoke-direct {p0, v2}, LC2/A;->k(I)V

    .line 157
    .line 158
    .line 159
    :cond_b
    :goto_0
    return-void
.end method

.method public j()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, LC2/A;->k(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method
