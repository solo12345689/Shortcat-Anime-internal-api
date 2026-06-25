.class Landroidx/media3/exoplayer/P0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Landroidx/media3/exoplayer/N0;

.field private final b:I

.field private final c:Landroidx/media3/exoplayer/N0;

.field private d:I

.field private e:Z

.field private f:Z


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/N0;Landroidx/media3/exoplayer/N0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 5
    .line 6
    iput p3, p0, Landroidx/media3/exoplayer/P0;->b:I

    .line 7
    .line 8
    iput-object p2, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput p1, p0, Landroidx/media3/exoplayer/P0;->d:I

    .line 12
    .line 13
    iput-boolean p1, p0, Landroidx/media3/exoplayer/P0;->e:Z

    .line 14
    .line 15
    iput-boolean p1, p0, Landroidx/media3/exoplayer/P0;->f:Z

    .line 16
    .line 17
    return-void
.end method

.method private A()Z
    .locals 2

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/P0;->d:I

    .line 2
    .line 3
    const/4 v1, 0x3

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

.method private C(Landroidx/media3/exoplayer/N0;LM2/c0;Landroidx/media3/exoplayer/k;JZ)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroidx/media3/exoplayer/P0;->z(Landroidx/media3/exoplayer/N0;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-interface {p1}, Landroidx/media3/exoplayer/N0;->M()LM2/c0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eq p2, v0, :cond_0

    .line 12
    .line 13
    invoke-direct {p0, p1, p3}, Landroidx/media3/exoplayer/P0;->d(Landroidx/media3/exoplayer/N0;Landroidx/media3/exoplayer/k;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    if-eqz p6, :cond_1

    .line 18
    .line 19
    invoke-interface {p1, p4, p5}, Landroidx/media3/exoplayer/N0;->O(J)V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method

.method private E(Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-boolean p1, p0, Landroidx/media3/exoplayer/P0;->e:Z

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    iget-object p1, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 9
    .line 10
    invoke-interface {p1}, Landroidx/media3/exoplayer/N0;->reset()V

    .line 11
    .line 12
    .line 13
    iput-boolean v0, p0, Landroidx/media3/exoplayer/P0;->e:Z

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-boolean p1, p0, Landroidx/media3/exoplayer/P0;->f:Z

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    iget-object p1, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 21
    .line 22
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Landroidx/media3/exoplayer/N0;

    .line 27
    .line 28
    invoke-interface {p1}, Landroidx/media3/exoplayer/N0;->reset()V

    .line 29
    .line 30
    .line 31
    iput-boolean v0, p0, Landroidx/media3/exoplayer/P0;->f:Z

    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method private K(Landroidx/media3/exoplayer/N0;Landroidx/media3/exoplayer/r0;LP2/H;Landroidx/media3/exoplayer/k;)I
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p1, :cond_9

    .line 3
    .line 4
    invoke-static {p1}, Landroidx/media3/exoplayer/P0;->z(Landroidx/media3/exoplayer/N0;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_9

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 11
    .line 12
    if-ne p1, v1, :cond_0

    .line 13
    .line 14
    invoke-direct {p0}, Landroidx/media3/exoplayer/P0;->w()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_9

    .line 19
    .line 20
    :cond_0
    iget-object v1, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 21
    .line 22
    if-ne p1, v1, :cond_1

    .line 23
    .line 24
    invoke-direct {p0}, Landroidx/media3/exoplayer/P0;->A()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-interface {p1}, Landroidx/media3/exoplayer/N0;->M()LM2/c0;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iget-object v2, p2, Landroidx/media3/exoplayer/r0;->c:[LM2/c0;

    .line 36
    .line 37
    iget v3, p0, Landroidx/media3/exoplayer/P0;->b:I

    .line 38
    .line 39
    aget-object v2, v2, v3

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    if-eq v1, v2, :cond_2

    .line 43
    .line 44
    move v1, v0

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move v1, v4

    .line 47
    :goto_0
    invoke-virtual {p3, v3}, LP2/H;->c(I)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_3

    .line 52
    .line 53
    if-nez v1, :cond_3

    .line 54
    .line 55
    return v0

    .line 56
    :cond_3
    invoke-interface {p1}, Landroidx/media3/exoplayer/N0;->A()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_4

    .line 61
    .line 62
    iget-object p3, p3, LP2/H;->c:[LP2/A;

    .line 63
    .line 64
    iget p4, p0, Landroidx/media3/exoplayer/P0;->b:I

    .line 65
    .line 66
    aget-object p3, p3, p4

    .line 67
    .line 68
    invoke-static {p3}, Landroidx/media3/exoplayer/P0;->i(LP2/A;)[Lq2/x;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    iget-object p3, p2, Landroidx/media3/exoplayer/r0;->c:[LM2/c0;

    .line 73
    .line 74
    iget p4, p0, Landroidx/media3/exoplayer/P0;->b:I

    .line 75
    .line 76
    aget-object p3, p3, p4

    .line 77
    .line 78
    invoke-static {p3}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    move-object v2, p3

    .line 83
    check-cast v2, LM2/c0;

    .line 84
    .line 85
    invoke-virtual {p2}, Landroidx/media3/exoplayer/r0;->n()J

    .line 86
    .line 87
    .line 88
    move-result-wide v3

    .line 89
    invoke-virtual {p2}, Landroidx/media3/exoplayer/r0;->m()J

    .line 90
    .line 91
    .line 92
    move-result-wide v5

    .line 93
    iget-object p2, p2, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 94
    .line 95
    iget-object v7, p2, Landroidx/media3/exoplayer/s0;->a:LM2/D$b;

    .line 96
    .line 97
    move-object v0, p1

    .line 98
    invoke-interface/range {v0 .. v7}, Landroidx/media3/exoplayer/N0;->p([Lq2/x;LM2/c0;JJLM2/D$b;)V

    .line 99
    .line 100
    .line 101
    const/4 p1, 0x3

    .line 102
    return p1

    .line 103
    :cond_4
    invoke-interface {p1}, Landroidx/media3/exoplayer/N0;->d()Z

    .line 104
    .line 105
    .line 106
    move-result p2

    .line 107
    if-eqz p2, :cond_8

    .line 108
    .line 109
    invoke-direct {p0, p1, p4}, Landroidx/media3/exoplayer/P0;->d(Landroidx/media3/exoplayer/N0;Landroidx/media3/exoplayer/k;)V

    .line 110
    .line 111
    .line 112
    if-eqz v2, :cond_5

    .line 113
    .line 114
    invoke-virtual {p0}, Landroidx/media3/exoplayer/P0;->u()Z

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    if-eqz p2, :cond_7

    .line 119
    .line 120
    :cond_5
    iget-object p2, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 121
    .line 122
    if-ne p1, p2, :cond_6

    .line 123
    .line 124
    move v4, v0

    .line 125
    :cond_6
    invoke-direct {p0, v4}, Landroidx/media3/exoplayer/P0;->E(Z)V

    .line 126
    .line 127
    .line 128
    :cond_7
    return v0

    .line 129
    :cond_8
    return v4

    .line 130
    :cond_9
    :goto_1
    return v0
.end method

.method private P(Landroidx/media3/exoplayer/N0;J)V
    .locals 1

    .line 1
    invoke-interface {p1}, Landroidx/media3/exoplayer/N0;->n()V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, LO2/i;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p1, LO2/i;

    .line 9
    .line 10
    invoke-virtual {p1, p2, p3}, LO2/i;->H0(J)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method private Z(Z)V
    .locals 2

    .line 1
    const/16 v0, 0x11

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 6
    .line 7
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Landroidx/media3/exoplayer/N0;

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 14
    .line 15
    invoke-interface {p1, v0, v1}, Landroidx/media3/exoplayer/L0$b;->v(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object p1, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 20
    .line 21
    iget-object v1, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 22
    .line 23
    invoke-static {v1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {p1, v0, v1}, Landroidx/media3/exoplayer/L0$b;->v(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private d(Landroidx/media3/exoplayer/N0;Landroidx/media3/exoplayer/k;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 6
    .line 7
    if-ne v0, p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 13
    :goto_1
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Landroidx/media3/exoplayer/P0;->z(Landroidx/media3/exoplayer/N0;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    return-void

    .line 23
    :cond_2
    invoke-virtual {p2, p1}, Landroidx/media3/exoplayer/k;->a(Landroidx/media3/exoplayer/N0;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/P0;->g(Landroidx/media3/exoplayer/N0;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Landroidx/media3/exoplayer/N0;->disable()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method private g(Landroidx/media3/exoplayer/N0;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Landroidx/media3/exoplayer/N0;->getState()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-interface {p1}, Landroidx/media3/exoplayer/N0;->stop()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method private static i(LP2/A;)[Lq2/x;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    invoke-interface {p0}, LP2/E;->length()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    new-array v2, v1, [Lq2/x;

    .line 11
    .line 12
    :goto_1
    if-ge v0, v1, :cond_1

    .line 13
    .line 14
    invoke-static {p0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, LP2/A;

    .line 19
    .line 20
    invoke-interface {v3, v0}, LP2/E;->d(I)Lq2/x;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    aput-object v3, v2, v0

    .line 25
    .line 26
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    return-object v2
.end method

.method private l(Landroidx/media3/exoplayer/r0;)Landroidx/media3/exoplayer/N0;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_2

    .line 3
    .line 4
    iget-object v1, p1, Landroidx/media3/exoplayer/r0;->c:[LM2/c0;

    .line 5
    .line 6
    iget v2, p0, Landroidx/media3/exoplayer/P0;->b:I

    .line 7
    .line 8
    aget-object v1, v1, v2

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v1, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 14
    .line 15
    invoke-interface {v1}, Landroidx/media3/exoplayer/N0;->M()LM2/c0;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v2, p1, Landroidx/media3/exoplayer/r0;->c:[LM2/c0;

    .line 20
    .line 21
    iget v3, p0, Landroidx/media3/exoplayer/P0;->b:I

    .line 22
    .line 23
    aget-object v2, v2, v3

    .line 24
    .line 25
    if-ne v1, v2, :cond_1

    .line 26
    .line 27
    iget-object p1, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_1
    iget-object v1, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-interface {v1}, Landroidx/media3/exoplayer/N0;->M()LM2/c0;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object p1, p1, Landroidx/media3/exoplayer/r0;->c:[LM2/c0;

    .line 39
    .line 40
    iget v2, p0, Landroidx/media3/exoplayer/P0;->b:I

    .line 41
    .line 42
    aget-object p1, p1, v2

    .line 43
    .line 44
    if-ne v1, p1, :cond_2

    .line 45
    .line 46
    iget-object p1, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 47
    .line 48
    return-object p1

    .line 49
    :cond_2
    :goto_0
    return-object v0
.end method

.method private p(Landroidx/media3/exoplayer/r0;Landroidx/media3/exoplayer/N0;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p1, Landroidx/media3/exoplayer/r0;->c:[LM2/c0;

    .line 6
    .line 7
    iget v2, p0, Landroidx/media3/exoplayer/P0;->b:I

    .line 8
    .line 9
    aget-object v1, v1, v2

    .line 10
    .line 11
    invoke-interface {p2}, Landroidx/media3/exoplayer/N0;->M()LM2/c0;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_3

    .line 16
    .line 17
    invoke-interface {p2}, Landroidx/media3/exoplayer/N0;->M()LM2/c0;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-ne v2, v1, :cond_1

    .line 22
    .line 23
    if-eqz v1, :cond_3

    .line 24
    .line 25
    invoke-interface {p2}, Landroidx/media3/exoplayer/N0;->i()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_3

    .line 30
    .line 31
    invoke-direct {p0, p2, p1}, Landroidx/media3/exoplayer/P0;->q(Landroidx/media3/exoplayer/N0;Landroidx/media3/exoplayer/r0;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_3

    .line 36
    .line 37
    :cond_1
    invoke-virtual {p1}, Landroidx/media3/exoplayer/r0;->k()Landroidx/media3/exoplayer/r0;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    iget-object p1, p1, Landroidx/media3/exoplayer/r0;->c:[LM2/c0;

    .line 44
    .line 45
    iget v1, p0, Landroidx/media3/exoplayer/P0;->b:I

    .line 46
    .line 47
    aget-object p1, p1, v1

    .line 48
    .line 49
    invoke-interface {p2}, Landroidx/media3/exoplayer/N0;->M()LM2/c0;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    if-ne p1, p2, :cond_2

    .line 54
    .line 55
    return v0

    .line 56
    :cond_2
    const/4 p1, 0x0

    .line 57
    return p1

    .line 58
    :cond_3
    return v0
.end method

.method private q(Landroidx/media3/exoplayer/N0;Landroidx/media3/exoplayer/r0;)Z
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroidx/media3/exoplayer/r0;->k()Landroidx/media3/exoplayer/r0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p2, p2, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 6
    .line 7
    iget-boolean p2, p2, Landroidx/media3/exoplayer/s0;->g:Z

    .line 8
    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-boolean p2, v0, Landroidx/media3/exoplayer/r0;->f:Z

    .line 14
    .line 15
    if-eqz p2, :cond_1

    .line 16
    .line 17
    instance-of p2, p1, LO2/i;

    .line 18
    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    instance-of p2, p1, LK2/c;

    .line 22
    .line 23
    if-nez p2, :cond_0

    .line 24
    .line 25
    invoke-interface {p1}, Landroidx/media3/exoplayer/N0;->N()J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    invoke-virtual {v0}, Landroidx/media3/exoplayer/r0;->n()J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    cmp-long p1, p1, v0

    .line 34
    .line 35
    if-ltz p1, :cond_1

    .line 36
    .line 37
    :cond_0
    const/4 p1, 0x1

    .line 38
    return p1

    .line 39
    :cond_1
    const/4 p1, 0x0

    .line 40
    return p1
.end method

.method private w()Z
    .locals 2

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/P0;->d:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0

    .line 12
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 13
    return v0
.end method

.method private static z(Landroidx/media3/exoplayer/N0;)Z
    .locals 0

    .line 1
    invoke-interface {p0}, Landroidx/media3/exoplayer/N0;->getState()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method


# virtual methods
.method public B(LM2/c0;Landroidx/media3/exoplayer/k;JZ)V
    .locals 9

    .line 1
    iget-object v1, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v2, p1

    .line 5
    move-object v3, p2

    .line 6
    move-wide v4, p3

    .line 7
    move v6, p5

    .line 8
    invoke-direct/range {v0 .. v6}, Landroidx/media3/exoplayer/P0;->C(Landroidx/media3/exoplayer/N0;LM2/c0;Landroidx/media3/exoplayer/k;JZ)V

    .line 9
    .line 10
    .line 11
    iget-object p1, v0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    move v8, v6

    .line 16
    move-wide v6, v4

    .line 17
    move-object v4, v2

    .line 18
    move-object v5, v3

    .line 19
    move-object v3, p1

    .line 20
    move-object v2, v0

    .line 21
    invoke-direct/range {v2 .. v8}, Landroidx/media3/exoplayer/P0;->C(Landroidx/media3/exoplayer/N0;LM2/c0;Landroidx/media3/exoplayer/k;JZ)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public D()V
    .locals 4

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/P0;->d:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x4

    .line 6
    if-eq v0, v1, :cond_2

    .line 7
    .line 8
    if-ne v0, v3, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x2

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    iput v2, p0, Landroidx/media3/exoplayer/P0;->d:I

    .line 15
    .line 16
    :cond_1
    return-void

    .line 17
    :cond_2
    :goto_0
    const/4 v1, 0x1

    .line 18
    if-ne v0, v3, :cond_3

    .line 19
    .line 20
    move v0, v1

    .line 21
    goto :goto_1

    .line 22
    :cond_3
    move v0, v2

    .line 23
    :goto_1
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/P0;->Z(Z)V

    .line 24
    .line 25
    .line 26
    iget v0, p0, Landroidx/media3/exoplayer/P0;->d:I

    .line 27
    .line 28
    if-ne v0, v3, :cond_4

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_4
    move v2, v1

    .line 32
    :goto_2
    iput v2, p0, Landroidx/media3/exoplayer/P0;->d:I

    .line 33
    .line 34
    return-void
.end method

.method public F(LP2/H;LP2/H;J)V
    .locals 4

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/P0;->b:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, LP2/H;->c(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Landroidx/media3/exoplayer/P0;->b:I

    .line 8
    .line 9
    invoke-virtual {p2, v1}, LP2/H;->c(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    iget v2, p0, Landroidx/media3/exoplayer/P0;->d:I

    .line 18
    .line 19
    const/4 v3, 0x3

    .line 20
    if-eq v2, v3, :cond_1

    .line 21
    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    iget-object v2, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 25
    .line 26
    invoke-static {v2}, Landroidx/media3/exoplayer/P0;->z(Landroidx/media3/exoplayer/N0;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object v2, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 34
    .line 35
    invoke-static {v2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Landroidx/media3/exoplayer/N0;

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    :goto_0
    iget-object v2, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 43
    .line 44
    :goto_1
    if-eqz v0, :cond_4

    .line 45
    .line 46
    invoke-interface {v2}, Landroidx/media3/exoplayer/N0;->A()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_4

    .line 51
    .line 52
    invoke-virtual {p0}, Landroidx/media3/exoplayer/P0;->m()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    const/4 v3, -0x2

    .line 57
    if-ne v0, v3, :cond_2

    .line 58
    .line 59
    const/4 v0, 0x1

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    const/4 v0, 0x0

    .line 62
    :goto_2
    iget-object p1, p1, LP2/H;->b:[LA2/N;

    .line 63
    .line 64
    iget v3, p0, Landroidx/media3/exoplayer/P0;->b:I

    .line 65
    .line 66
    aget-object p1, p1, v3

    .line 67
    .line 68
    iget-object p2, p2, LP2/H;->b:[LA2/N;

    .line 69
    .line 70
    aget-object p2, p2, v3

    .line 71
    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    invoke-static {p2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_3

    .line 79
    .line 80
    if-nez v0, :cond_3

    .line 81
    .line 82
    invoke-virtual {p0}, Landroidx/media3/exoplayer/P0;->u()Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_4

    .line 87
    .line 88
    :cond_3
    invoke-direct {p0, v2, p3, p4}, Landroidx/media3/exoplayer/P0;->P(Landroidx/media3/exoplayer/N0;J)V

    .line 89
    .line 90
    .line 91
    :cond_4
    return-void
.end method

.method public G(Landroidx/media3/exoplayer/r0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/P0;->l(Landroidx/media3/exoplayer/r0;)Landroidx/media3/exoplayer/N0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Landroidx/media3/exoplayer/N0;

    .line 10
    .line 11
    invoke-interface {p1}, Landroidx/media3/exoplayer/N0;->x()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public H()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/media3/exoplayer/N0;->a()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Landroidx/media3/exoplayer/P0;->e:Z

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v1}, Landroidx/media3/exoplayer/N0;->a()V

    .line 14
    .line 15
    .line 16
    iput-boolean v0, p0, Landroidx/media3/exoplayer/P0;->f:Z

    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public I(JJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/exoplayer/P0;->z(Landroidx/media3/exoplayer/N0;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 10
    .line 11
    invoke-interface {v0, p1, p2, p3, p4}, Landroidx/media3/exoplayer/N0;->g(JJ)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-static {v0}, Landroidx/media3/exoplayer/P0;->z(Landroidx/media3/exoplayer/N0;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 25
    .line 26
    invoke-interface {v0, p1, p2, p3, p4}, Landroidx/media3/exoplayer/N0;->g(JJ)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public J(Landroidx/media3/exoplayer/r0;LP2/H;Landroidx/media3/exoplayer/k;)I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 2
    .line 3
    invoke-direct {p0, v0, p1, p2, p3}, Landroidx/media3/exoplayer/P0;->K(Landroidx/media3/exoplayer/N0;Landroidx/media3/exoplayer/r0;LP2/H;Landroidx/media3/exoplayer/k;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 8
    .line 9
    invoke-direct {p0, v1, p1, p2, p3}, Landroidx/media3/exoplayer/P0;->K(Landroidx/media3/exoplayer/N0;Landroidx/media3/exoplayer/r0;LP2/H;Landroidx/media3/exoplayer/k;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 p2, 0x1

    .line 14
    if-ne v0, p2, :cond_0

    .line 15
    .line 16
    return p1

    .line 17
    :cond_0
    return v0
.end method

.method public L()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/exoplayer/P0;->z(Landroidx/media3/exoplayer/N0;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/P0;->E(Z)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-static {v0}, Landroidx/media3/exoplayer/P0;->z(Landroidx/media3/exoplayer/N0;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/P0;->E(Z)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public M(Landroidx/media3/exoplayer/r0;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/P0;->l(Landroidx/media3/exoplayer/r0;)Landroidx/media3/exoplayer/N0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-interface {p1, p2, p3}, Landroidx/media3/exoplayer/N0;->O(J)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public N(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/exoplayer/P0;->z(Landroidx/media3/exoplayer/N0;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Landroidx/media3/exoplayer/P0;->d:I

    .line 10
    .line 11
    const/4 v1, 0x4

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    if-eq v0, v1, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 18
    .line 19
    invoke-direct {p0, v0, p1, p2}, Landroidx/media3/exoplayer/P0;->P(Landroidx/media3/exoplayer/N0;J)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-static {v0}, Landroidx/media3/exoplayer/P0;->z(Landroidx/media3/exoplayer/N0;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget v0, p0, Landroidx/media3/exoplayer/P0;->d:I

    .line 33
    .line 34
    const/4 v1, 0x3

    .line 35
    if-eq v0, v1, :cond_1

    .line 36
    .line 37
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 38
    .line 39
    invoke-direct {p0, v0, p1, p2}, Landroidx/media3/exoplayer/P0;->P(Landroidx/media3/exoplayer/N0;J)V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method

.method public O(Landroidx/media3/exoplayer/r0;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/P0;->l(Landroidx/media3/exoplayer/r0;)Landroidx/media3/exoplayer/N0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Landroidx/media3/exoplayer/N0;

    .line 10
    .line 11
    invoke-direct {p0, p1, p2, p3}, Landroidx/media3/exoplayer/P0;->P(Landroidx/media3/exoplayer/N0;J)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public Q(FF)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Landroidx/media3/exoplayer/N0;->J(FF)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0, p1, p2}, Landroidx/media3/exoplayer/N0;->J(FF)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public R(LA2/P;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    invoke-interface {v0, v1, p1}, Landroidx/media3/exoplayer/L0$b;->v(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {v0, v1, p1}, Landroidx/media3/exoplayer/L0$b;->v(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public S(Lq2/Y;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/N0;->D(Lq2/Y;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/N0;->D(Lq2/Y;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public T(LS2/u;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/P0;->m()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 10
    .line 11
    const/4 v1, 0x7

    .line 12
    invoke-interface {v0, v1, p1}, Landroidx/media3/exoplayer/L0$b;->v(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-interface {v0, v1, p1}, Landroidx/media3/exoplayer/L0$b;->v(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    :goto_0
    return-void
.end method

.method public U(Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/P0;->m()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget v0, p0, Landroidx/media3/exoplayer/P0;->d:I

    .line 10
    .line 11
    const/4 v1, 0x4

    .line 12
    const/4 v2, 0x1

    .line 13
    if-eq v0, v1, :cond_2

    .line 14
    .line 15
    if-ne v0, v2, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 19
    .line 20
    invoke-interface {v0, v2, p1}, Landroidx/media3/exoplayer/L0$b;->v(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_2
    :goto_0
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 25
    .line 26
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Landroidx/media3/exoplayer/N0;

    .line 31
    .line 32
    invoke-interface {v0, v2, p1}, Landroidx/media3/exoplayer/L0$b;->v(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public V(F)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/P0;->m()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 10
    .line 11
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x2

    .line 16
    invoke-interface {v0, v2, v1}, Landroidx/media3/exoplayer/L0$b;->v(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {v0, v2, p1}, Landroidx/media3/exoplayer/L0$b;->v(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    :goto_0
    return-void
.end method

.method public W()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/media3/exoplayer/N0;->getState()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget v0, p0, Landroidx/media3/exoplayer/P0;->d:I

    .line 11
    .line 12
    const/4 v2, 0x4

    .line 13
    if-eq v0, v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 16
    .line 17
    invoke-interface {v0}, Landroidx/media3/exoplayer/N0;->start()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-interface {v0}, Landroidx/media3/exoplayer/N0;->getState()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-ne v0, v1, :cond_1

    .line 30
    .line 31
    iget v0, p0, Landroidx/media3/exoplayer/P0;->d:I

    .line 32
    .line 33
    const/4 v1, 0x3

    .line 34
    if-eq v0, v1, :cond_1

    .line 35
    .line 36
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 37
    .line 38
    invoke-interface {v0}, Landroidx/media3/exoplayer/N0;->start()V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public X()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/P0;->u()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 11
    .line 12
    invoke-static {v0}, Landroidx/media3/exoplayer/P0;->z(Landroidx/media3/exoplayer/N0;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x3

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-static {v0}, Landroidx/media3/exoplayer/P0;->z(Landroidx/media3/exoplayer/N0;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    const/4 v0, 0x4

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v0, 0x2

    .line 33
    :goto_0
    iput v0, p0, Landroidx/media3/exoplayer/P0;->d:I

    .line 34
    .line 35
    return-void
.end method

.method public Y()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/exoplayer/P0;->z(Landroidx/media3/exoplayer/N0;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 10
    .line 11
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/P0;->g(Landroidx/media3/exoplayer/N0;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-static {v0}, Landroidx/media3/exoplayer/P0;->z(Landroidx/media3/exoplayer/N0;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 25
    .line 26
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/P0;->g(Landroidx/media3/exoplayer/N0;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public a(Landroidx/media3/exoplayer/r0;)Z
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/P0;->l(Landroidx/media3/exoplayer/r0;)Landroidx/media3/exoplayer/N0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-interface {p1}, Landroidx/media3/exoplayer/N0;->i()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-interface {p1}, Landroidx/media3/exoplayer/N0;->isReady()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-interface {p1}, Landroidx/media3/exoplayer/N0;->d()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    return p1

    .line 28
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 29
    return p1
.end method

.method public b(Landroidx/media3/exoplayer/k;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Landroidx/media3/exoplayer/P0;->d(Landroidx/media3/exoplayer/N0;Landroidx/media3/exoplayer/k;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-static {v0}, Landroidx/media3/exoplayer/P0;->z(Landroidx/media3/exoplayer/N0;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v2, 0x1

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget v0, p0, Landroidx/media3/exoplayer/P0;->d:I

    .line 19
    .line 20
    const/4 v3, 0x3

    .line 21
    if-eq v0, v3, :cond_0

    .line 22
    .line 23
    move v0, v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v0, v1

    .line 26
    :goto_0
    iget-object v3, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 27
    .line 28
    invoke-direct {p0, v3, p1}, Landroidx/media3/exoplayer/P0;->d(Landroidx/media3/exoplayer/N0;Landroidx/media3/exoplayer/k;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, v1}, Landroidx/media3/exoplayer/P0;->E(Z)V

    .line 32
    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-direct {p0, v2}, Landroidx/media3/exoplayer/P0;->Z(Z)V

    .line 37
    .line 38
    .line 39
    :cond_1
    iput v1, p0, Landroidx/media3/exoplayer/P0;->d:I

    .line 40
    .line 41
    return-void
.end method

.method public c(Landroidx/media3/exoplayer/k;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/P0;->u()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Landroidx/media3/exoplayer/P0;->d:I

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x4

    .line 13
    if-eq v0, v3, :cond_2

    .line 14
    .line 15
    const/4 v4, 0x2

    .line 16
    if-ne v0, v4, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    move v4, v2

    .line 20
    goto :goto_1

    .line 21
    :cond_2
    :goto_0
    move v4, v1

    .line 22
    :goto_1
    if-ne v0, v3, :cond_3

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_3
    move v1, v2

    .line 26
    :goto_2
    if-eqz v4, :cond_4

    .line 27
    .line 28
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 29
    .line 30
    goto :goto_3

    .line 31
    :cond_4
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 32
    .line 33
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Landroidx/media3/exoplayer/N0;

    .line 38
    .line 39
    :goto_3
    invoke-direct {p0, v0, p1}, Landroidx/media3/exoplayer/P0;->d(Landroidx/media3/exoplayer/N0;Landroidx/media3/exoplayer/k;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, v4}, Landroidx/media3/exoplayer/P0;->E(Z)V

    .line 43
    .line 44
    .line 45
    iput v1, p0, Landroidx/media3/exoplayer/P0;->d:I

    .line 46
    .line 47
    return-void
.end method

.method public e(LA2/N;LP2/A;LM2/c0;JZZJJLM2/D$b;Landroidx/media3/exoplayer/k;)V
    .locals 14

    .line 1
    move-object/from16 v0, p13

    .line 2
    .line 3
    invoke-static/range {p2 .. p2}, Landroidx/media3/exoplayer/P0;->i(LP2/A;)[Lq2/x;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    iget v1, p0, Landroidx/media3/exoplayer/P0;->d:I

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    const/4 v4, 0x2

    .line 13
    if-eq v1, v4, :cond_1

    .line 14
    .line 15
    const/4 v4, 0x4

    .line 16
    if-ne v1, v4, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iput-boolean v2, p0, Landroidx/media3/exoplayer/P0;->f:Z

    .line 20
    .line 21
    iget-object v1, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 22
    .line 23
    invoke-static {v1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Landroidx/media3/exoplayer/N0;

    .line 28
    .line 29
    move-object v2, p1

    .line 30
    move-object/from16 v4, p3

    .line 31
    .line 32
    move-wide/from16 v5, p4

    .line 33
    .line 34
    move/from16 v7, p6

    .line 35
    .line 36
    move/from16 v8, p7

    .line 37
    .line 38
    move-wide/from16 v9, p8

    .line 39
    .line 40
    move-wide/from16 v11, p10

    .line 41
    .line 42
    move-object/from16 v13, p12

    .line 43
    .line 44
    invoke-interface/range {v1 .. v13}, Landroidx/media3/exoplayer/N0;->j(LA2/N;[Lq2/x;LM2/c0;JZZJJLM2/D$b;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/k;->b(Landroidx/media3/exoplayer/N0;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    :goto_0
    iput-boolean v2, p0, Landroidx/media3/exoplayer/P0;->e:Z

    .line 54
    .line 55
    iget-object v1, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 56
    .line 57
    move-object v2, p1

    .line 58
    move-object/from16 v4, p3

    .line 59
    .line 60
    move-wide/from16 v5, p4

    .line 61
    .line 62
    move/from16 v7, p6

    .line 63
    .line 64
    move/from16 v8, p7

    .line 65
    .line 66
    move-wide/from16 v9, p8

    .line 67
    .line 68
    move-wide/from16 v11, p10

    .line 69
    .line 70
    move-object/from16 v13, p12

    .line 71
    .line 72
    invoke-interface/range {v1 .. v13}, Landroidx/media3/exoplayer/N0;->j(LA2/N;[Lq2/x;LM2/c0;JZZJJLM2/D$b;)V

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 76
    .line 77
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/k;->b(Landroidx/media3/exoplayer/N0;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public f()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/exoplayer/P0;->z(Landroidx/media3/exoplayer/N0;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 10
    .line 11
    invoke-interface {v0}, Landroidx/media3/exoplayer/N0;->m()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-static {v0}, Landroidx/media3/exoplayer/P0;->z(Landroidx/media3/exoplayer/N0;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 26
    .line 27
    invoke-interface {v0}, Landroidx/media3/exoplayer/N0;->m()V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public h()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/exoplayer/P0;->z(Landroidx/media3/exoplayer/N0;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-static {v1}, Landroidx/media3/exoplayer/P0;->z(Landroidx/media3/exoplayer/N0;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    :goto_0
    add-int/2addr v0, v1

    .line 21
    return v0
.end method

.method public j(JJ)J
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/exoplayer/P0;->z(Landroidx/media3/exoplayer/N0;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 10
    .line 11
    invoke-interface {v0, p1, p2, p3, p4}, Landroidx/media3/exoplayer/N0;->E(JJ)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    :goto_0
    iget-object v2, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-static {v2}, Landroidx/media3/exoplayer/P0;->z(Landroidx/media3/exoplayer/N0;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    iget-object v2, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 32
    .line 33
    invoke-interface {v2, p1, p2, p3, p4}, Landroidx/media3/exoplayer/N0;->E(JJ)J

    .line 34
    .line 35
    .line 36
    move-result-wide p1

    .line 37
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(JJ)J

    .line 38
    .line 39
    .line 40
    move-result-wide p1

    .line 41
    return-wide p1

    .line 42
    :cond_1
    return-wide v0
.end method

.method public k(Landroidx/media3/exoplayer/r0;)J
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/P0;->l(Landroidx/media3/exoplayer/r0;)Landroidx/media3/exoplayer/N0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    check-cast p1, Landroidx/media3/exoplayer/N0;

    .line 9
    .line 10
    invoke-interface {p1}, Landroidx/media3/exoplayer/N0;->N()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    return-wide v0
.end method

.method public m()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/media3/exoplayer/N0;->f()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public n(ILjava/lang/Object;Landroidx/media3/exoplayer/r0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p3}, Landroidx/media3/exoplayer/P0;->l(Landroidx/media3/exoplayer/r0;)Landroidx/media3/exoplayer/N0;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-static {p3}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    check-cast p3, Landroidx/media3/exoplayer/N0;

    .line 10
    .line 11
    invoke-interface {p3, p1, p2}, Landroidx/media3/exoplayer/L0$b;->v(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public o(Landroidx/media3/exoplayer/r0;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Landroidx/media3/exoplayer/P0;->p(Landroidx/media3/exoplayer/r0;Landroidx/media3/exoplayer/N0;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 10
    .line 11
    invoke-direct {p0, p1, v0}, Landroidx/media3/exoplayer/P0;->p(Landroidx/media3/exoplayer/r0;Landroidx/media3/exoplayer/N0;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
.end method

.method public r(Landroidx/media3/exoplayer/r0;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/P0;->l(Landroidx/media3/exoplayer/r0;)Landroidx/media3/exoplayer/N0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Landroidx/media3/exoplayer/N0;

    .line 10
    .line 11
    invoke-interface {p1}, Landroidx/media3/exoplayer/N0;->i()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method public s()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public t()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/exoplayer/P0;->z(Landroidx/media3/exoplayer/N0;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 10
    .line 11
    invoke-interface {v0}, Landroidx/media3/exoplayer/N0;->d()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x1

    .line 17
    :goto_0
    iget-object v1, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-static {v1}, Landroidx/media3/exoplayer/P0;->z(Landroidx/media3/exoplayer/N0;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    iget-object v1, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 28
    .line 29
    invoke-interface {v1}, Landroidx/media3/exoplayer/N0;->d()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    and-int/2addr v0, v1

    .line 34
    :cond_1
    return v0
.end method

.method public u()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/P0;->w()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-direct {p0}, Landroidx/media3/exoplayer/P0;->A()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 17
    return v0
.end method

.method public v(Landroidx/media3/exoplayer/r0;)Z
    .locals 4

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/P0;->w()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/P0;->l(Landroidx/media3/exoplayer/r0;)Landroidx/media3/exoplayer/N0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v3, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 14
    .line 15
    if-ne v0, v3, :cond_0

    .line 16
    .line 17
    move v0, v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v0, v1

    .line 20
    :goto_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/P0;->A()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/P0;->l(Landroidx/media3/exoplayer/r0;)Landroidx/media3/exoplayer/N0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object v3, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 31
    .line 32
    if-ne p1, v3, :cond_1

    .line 33
    .line 34
    move p1, v2

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move p1, v1

    .line 37
    :goto_1
    if-nez v0, :cond_3

    .line 38
    .line 39
    if-eqz p1, :cond_2

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    return v1

    .line 43
    :cond_3
    :goto_2
    return v2
.end method

.method public x(Landroidx/media3/exoplayer/r0;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/P0;->l(Landroidx/media3/exoplayer/r0;)Landroidx/media3/exoplayer/N0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    return p1
.end method

.method public y()Z
    .locals 2

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/P0;->d:I

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    const/4 v1, 0x4

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->c:Landroidx/media3/exoplayer/N0;

    .line 13
    .line 14
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Landroidx/media3/exoplayer/N0;

    .line 19
    .line 20
    invoke-static {v0}, Landroidx/media3/exoplayer/P0;->z(Landroidx/media3/exoplayer/N0;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    return v0

    .line 25
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/media3/exoplayer/P0;->a:Landroidx/media3/exoplayer/N0;

    .line 26
    .line 27
    invoke-static {v0}, Landroidx/media3/exoplayer/P0;->z(Landroidx/media3/exoplayer/N0;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    return v0
.end method
