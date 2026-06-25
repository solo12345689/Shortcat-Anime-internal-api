.class final LC3/b$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LC3/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private final a:LU2/r;

.field private final b:LU2/O;

.field private final c:LC3/c;

.field private final d:Lq2/x;

.field private final e:I

.field private f:J

.field private g:I

.field private h:J


# direct methods
.method public constructor <init>(LU2/r;LU2/O;LC3/c;Ljava/lang/String;I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LC3/b$c;->a:LU2/r;

    .line 5
    .line 6
    iput-object p2, p0, LC3/b$c;->b:LU2/O;

    .line 7
    .line 8
    iput-object p3, p0, LC3/b$c;->c:LC3/c;

    .line 9
    .line 10
    iget p1, p3, LC3/c;->b:I

    .line 11
    .line 12
    iget p2, p3, LC3/c;->f:I

    .line 13
    .line 14
    mul-int/2addr p1, p2

    .line 15
    div-int/lit8 p1, p1, 0x8

    .line 16
    .line 17
    iget p2, p3, LC3/c;->e:I

    .line 18
    .line 19
    if-ne p2, p1, :cond_0

    .line 20
    .line 21
    iget p2, p3, LC3/c;->c:I

    .line 22
    .line 23
    mul-int v0, p2, p1

    .line 24
    .line 25
    mul-int/lit8 v0, v0, 0x8

    .line 26
    .line 27
    mul-int/2addr p2, p1

    .line 28
    div-int/lit8 p2, p2, 0xa

    .line 29
    .line 30
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iput p1, p0, LC3/b$c;->e:I

    .line 35
    .line 36
    new-instance p2, Lq2/x$b;

    .line 37
    .line 38
    invoke-direct {p2}, Lq2/x$b;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v1, "audio/wav"

    .line 42
    .line 43
    invoke-virtual {p2, v1}, Lq2/x$b;->W(Ljava/lang/String;)Lq2/x$b;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-virtual {p2, p4}, Lq2/x$b;->y0(Ljava/lang/String;)Lq2/x$b;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-virtual {p2, v0}, Lq2/x$b;->S(I)Lq2/x$b;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-virtual {p2, v0}, Lq2/x$b;->t0(I)Lq2/x$b;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-virtual {p2, p1}, Lq2/x$b;->o0(I)Lq2/x$b;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget p2, p3, LC3/c;->b:I

    .line 64
    .line 65
    invoke-virtual {p1, p2}, Lq2/x$b;->T(I)Lq2/x$b;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iget p2, p3, LC3/c;->c:I

    .line 70
    .line 71
    invoke-virtual {p1, p2}, Lq2/x$b;->z0(I)Lq2/x$b;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1, p5}, Lq2/x$b;->s0(I)Lq2/x$b;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p1}, Lq2/x$b;->P()Lq2/x;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, LC3/b$c;->d:Lq2/x;

    .line 84
    .line 85
    return-void

    .line 86
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    const-string p4, "Expected block size: "

    .line 92
    .line 93
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string p1, "; got: "

    .line 100
    .line 101
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    iget p1, p3, LC3/c;->e:I

    .line 105
    .line 106
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    const/4 p2, 0x0

    .line 114
    invoke-static {p1, p2}, Lq2/L;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lq2/L;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    throw p1
.end method


# virtual methods
.method public a(IJ)V
    .locals 7

    .line 1
    new-instance v0, LC3/e;

    .line 2
    .line 3
    iget-object v1, p0, LC3/b$c;->c:LC3/c;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    int-to-long v3, p1

    .line 7
    move-wide v5, p2

    .line 8
    invoke-direct/range {v0 .. v6}, LC3/e;-><init>(LC3/c;IJJ)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, LC3/b$c;->a:LU2/r;

    .line 12
    .line 13
    invoke-interface {p1, v0}, LU2/r;->t(LU2/J;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, LC3/b$c;->b:LU2/O;

    .line 17
    .line 18
    iget-object p2, p0, LC3/b$c;->d:Lq2/x;

    .line 19
    .line 20
    invoke-interface {p1, p2}, LU2/O;->c(Lq2/x;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, LC3/b$c;->b:LU2/O;

    .line 24
    .line 25
    invoke-virtual {v0}, LC3/e;->n()J

    .line 26
    .line 27
    .line 28
    move-result-wide p2

    .line 29
    invoke-interface {p1, p2, p3}, LU2/O;->d(J)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public b(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, LC3/b$c;->f:J

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput p1, p0, LC3/b$c;->g:I

    .line 5
    .line 6
    const-wide/16 p1, 0x0

    .line 7
    .line 8
    iput-wide p1, p0, LC3/b$c;->h:J

    .line 9
    .line 10
    return-void
.end method

.method public c(LU2/q;J)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p2

    .line 4
    .line 5
    :goto_0
    const-wide/16 v3, 0x0

    .line 6
    .line 7
    cmp-long v5, v1, v3

    .line 8
    .line 9
    const/4 v6, 0x1

    .line 10
    if-lez v5, :cond_1

    .line 11
    .line 12
    iget v7, v0, LC3/b$c;->g:I

    .line 13
    .line 14
    iget v8, v0, LC3/b$c;->e:I

    .line 15
    .line 16
    if-ge v7, v8, :cond_1

    .line 17
    .line 18
    sub-int/2addr v8, v7

    .line 19
    int-to-long v7, v8

    .line 20
    invoke-static {v7, v8, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 21
    .line 22
    .line 23
    move-result-wide v7

    .line 24
    long-to-int v5, v7

    .line 25
    iget-object v7, v0, LC3/b$c;->b:LU2/O;

    .line 26
    .line 27
    move-object/from16 v8, p1

    .line 28
    .line 29
    invoke-interface {v7, v8, v5, v6}, LU2/O;->e(Lq2/m;IZ)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    const/4 v6, -0x1

    .line 34
    if-ne v5, v6, :cond_0

    .line 35
    .line 36
    move-wide v1, v3

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget v3, v0, LC3/b$c;->g:I

    .line 39
    .line 40
    add-int/2addr v3, v5

    .line 41
    iput v3, v0, LC3/b$c;->g:I

    .line 42
    .line 43
    int-to-long v3, v5

    .line 44
    sub-long/2addr v1, v3

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iget-object v1, v0, LC3/b$c;->c:LC3/c;

    .line 47
    .line 48
    iget v2, v1, LC3/c;->e:I

    .line 49
    .line 50
    iget v3, v0, LC3/b$c;->g:I

    .line 51
    .line 52
    div-int/2addr v3, v2

    .line 53
    if-lez v3, :cond_2

    .line 54
    .line 55
    iget-wide v7, v0, LC3/b$c;->f:J

    .line 56
    .line 57
    iget-wide v9, v0, LC3/b$c;->h:J

    .line 58
    .line 59
    iget v1, v1, LC3/c;->c:I

    .line 60
    .line 61
    int-to-long v13, v1

    .line 62
    const-wide/32 v11, 0xf4240

    .line 63
    .line 64
    .line 65
    invoke-static/range {v9 .. v14}, Lt2/a0;->m1(JJJ)J

    .line 66
    .line 67
    .line 68
    move-result-wide v9

    .line 69
    add-long v12, v7, v9

    .line 70
    .line 71
    mul-int v15, v3, v2

    .line 72
    .line 73
    iget v1, v0, LC3/b$c;->g:I

    .line 74
    .line 75
    sub-int v16, v1, v15

    .line 76
    .line 77
    iget-object v11, v0, LC3/b$c;->b:LU2/O;

    .line 78
    .line 79
    const/4 v14, 0x1

    .line 80
    const/16 v17, 0x0

    .line 81
    .line 82
    invoke-interface/range {v11 .. v17}, LU2/O;->a(JIIILU2/O$a;)V

    .line 83
    .line 84
    .line 85
    move/from16 v1, v16

    .line 86
    .line 87
    iget-wide v7, v0, LC3/b$c;->h:J

    .line 88
    .line 89
    int-to-long v2, v3

    .line 90
    add-long/2addr v7, v2

    .line 91
    iput-wide v7, v0, LC3/b$c;->h:J

    .line 92
    .line 93
    iput v1, v0, LC3/b$c;->g:I

    .line 94
    .line 95
    :cond_2
    if-gtz v5, :cond_3

    .line 96
    .line 97
    return v6

    .line 98
    :cond_3
    const/4 v1, 0x0

    .line 99
    return v1
.end method
