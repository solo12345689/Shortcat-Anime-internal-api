.class public final LZ2/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LU2/p;


# static fields
.field public static final o:LU2/u;


# instance fields
.field private final a:[B

.field private final b:Lt2/I;

.field private final c:Z

.field private final d:LU2/v$a;

.field private e:LU2/r;

.field private f:LU2/O;

.field private g:I

.field private h:Lq2/J;

.field private i:LU2/y;

.field private j:I

.field private k:I

.field private l:LZ2/b;

.field private m:I

.field private n:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LZ2/c;

    .line 2
    .line 3
    invoke-direct {v0}, LZ2/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LZ2/d;->o:LU2/u;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, LZ2/d;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2a

    .line 3
    new-array v0, v0, [B

    iput-object v0, p0, LZ2/d;->a:[B

    .line 4
    new-instance v0, Lt2/I;

    const v1, 0x8000

    new-array v1, v1, [B

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lt2/I;-><init>([BI)V

    iput-object v0, p0, LZ2/d;->b:Lt2/I;

    const/4 v0, 0x1

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v0, v2

    .line 5
    :goto_0
    iput-boolean v0, p0, LZ2/d;->c:Z

    .line 6
    new-instance p1, LU2/v$a;

    invoke-direct {p1}, LU2/v$a;-><init>()V

    iput-object p1, p0, LZ2/d;->d:LU2/v$a;

    .line 7
    iput v2, p0, LZ2/d;->g:I

    return-void
.end method

.method public static synthetic d()[LU2/p;
    .locals 3

    .line 1
    new-instance v0, LZ2/d;

    .line 2
    .line 3
    invoke-direct {v0}, LZ2/d;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    new-array v1, v1, [LU2/p;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aput-object v0, v1, v2

    .line 11
    .line 12
    return-object v1
.end method

.method private e(Lt2/I;Z)J
    .locals 4

    .line 1
    iget-object v0, p0, LZ2/d;->i:LU2/y;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lt2/I;->g()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    :goto_0
    invoke-virtual {p1}, Lt2/I;->j()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    add-int/lit8 v1, v1, -0x10

    .line 15
    .line 16
    if-gt v0, v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lt2/I;->b0(I)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, LZ2/d;->i:LU2/y;

    .line 22
    .line 23
    iget v2, p0, LZ2/d;->k:I

    .line 24
    .line 25
    iget-object v3, p0, LZ2/d;->d:LU2/v$a;

    .line 26
    .line 27
    invoke-static {p1, v1, v2, v3}, LU2/v;->d(Lt2/I;LU2/y;ILU2/v$a;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Lt2/I;->b0(I)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, LZ2/d;->d:LU2/v$a;

    .line 37
    .line 38
    iget-wide p1, p1, LU2/v$a;->a:J

    .line 39
    .line 40
    return-wide p1

    .line 41
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    if-eqz p2, :cond_5

    .line 45
    .line 46
    :goto_1
    invoke-virtual {p1}, Lt2/I;->j()I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    iget v1, p0, LZ2/d;->j:I

    .line 51
    .line 52
    sub-int/2addr p2, v1

    .line 53
    if-gt v0, p2, :cond_4

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Lt2/I;->b0(I)V

    .line 56
    .line 57
    .line 58
    const/4 p2, 0x0

    .line 59
    :try_start_0
    iget-object v1, p0, LZ2/d;->i:LU2/y;

    .line 60
    .line 61
    iget v2, p0, LZ2/d;->k:I

    .line 62
    .line 63
    iget-object v3, p0, LZ2/d;->d:LU2/v$a;

    .line 64
    .line 65
    invoke-static {p1, v1, v2, v3}, LU2/v;->d(Lt2/I;LU2/y;ILU2/v$a;)Z

    .line 66
    .line 67
    .line 68
    move-result v1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    goto :goto_2

    .line 70
    :catch_0
    move v1, p2

    .line 71
    :goto_2
    invoke-virtual {p1}, Lt2/I;->g()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    invoke-virtual {p1}, Lt2/I;->j()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-le v2, v3, :cond_2

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_2
    move p2, v1

    .line 83
    :goto_3
    if-eqz p2, :cond_3

    .line 84
    .line 85
    invoke-virtual {p1, v0}, Lt2/I;->b0(I)V

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, LZ2/d;->d:LU2/v$a;

    .line 89
    .line 90
    iget-wide p1, p1, LU2/v$a;->a:J

    .line 91
    .line 92
    return-wide p1

    .line 93
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_4
    invoke-virtual {p1}, Lt2/I;->j()I

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    invoke-virtual {p1, p2}, Lt2/I;->b0(I)V

    .line 101
    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_5
    invoke-virtual {p1, v0}, Lt2/I;->b0(I)V

    .line 105
    .line 106
    .line 107
    :goto_4
    const-wide/16 p1, -0x1

    .line 108
    .line 109
    return-wide p1
.end method

.method private g(LU2/q;)V
    .locals 5

    .line 1
    invoke-static {p1}, LU2/w;->b(LU2/q;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput v0, p0, LZ2/d;->k:I

    .line 6
    .line 7
    iget-object v0, p0, LZ2/d;->e:LU2/r;

    .line 8
    .line 9
    invoke-static {v0}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, LU2/r;

    .line 14
    .line 15
    invoke-interface {p1}, LU2/q;->getPosition()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    invoke-interface {p1}, LU2/q;->getLength()J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    invoke-direct {p0, v1, v2, v3, v4}, LZ2/d;->j(JJ)LU2/J;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {v0, p1}, LU2/r;->t(LU2/J;)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x5

    .line 31
    iput p1, p0, LZ2/d;->g:I

    .line 32
    .line 33
    return-void
.end method

.method private j(JJ)LU2/J;
    .locals 8

    .line 1
    iget-object v0, p0, LZ2/d;->i:LU2/y;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, LZ2/d;->i:LU2/y;

    .line 7
    .line 8
    iget-object v0, v2, LU2/y;->k:LU2/y$a;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, v0, LU2/y$a;->a:[J

    .line 13
    .line 14
    array-length v0, v0

    .line 15
    if-lez v0, :cond_0

    .line 16
    .line 17
    new-instance p3, LU2/x;

    .line 18
    .line 19
    invoke-direct {p3, v2, p1, p2}, LU2/x;-><init>(LU2/y;J)V

    .line 20
    .line 21
    .line 22
    return-object p3

    .line 23
    :cond_0
    const-wide/16 v0, -0x1

    .line 24
    .line 25
    cmp-long v0, p3, v0

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-wide v0, v2, LU2/y;->j:J

    .line 30
    .line 31
    const-wide/16 v3, 0x0

    .line 32
    .line 33
    cmp-long v0, v0, v3

    .line 34
    .line 35
    if-lez v0, :cond_1

    .line 36
    .line 37
    new-instance v1, LZ2/b;

    .line 38
    .line 39
    iget v3, p0, LZ2/d;->k:I

    .line 40
    .line 41
    move-wide v4, p1

    .line 42
    move-wide v6, p3

    .line 43
    invoke-direct/range {v1 .. v7}, LZ2/b;-><init>(LU2/y;IJJ)V

    .line 44
    .line 45
    .line 46
    iput-object v1, p0, LZ2/d;->l:LZ2/b;

    .line 47
    .line 48
    invoke-virtual {v1}, LU2/e;->b()LU2/J;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1

    .line 53
    :cond_1
    new-instance p1, LU2/J$b;

    .line 54
    .line 55
    invoke-virtual {v2}, LU2/y;->f()J

    .line 56
    .line 57
    .line 58
    move-result-wide p2

    .line 59
    invoke-direct {p1, p2, p3}, LU2/J$b;-><init>(J)V

    .line 60
    .line 61
    .line 62
    return-object p1
.end method

.method private k(LU2/q;)V
    .locals 3

    .line 1
    iget-object v0, p0, LZ2/d;->a:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    array-length v2, v0

    .line 5
    invoke-interface {p1, v0, v1, v2}, LU2/q;->o([BII)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, LU2/q;->g()V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    iput p1, p0, LZ2/d;->g:I

    .line 13
    .line 14
    return-void
.end method

.method private m()V
    .locals 11

    .line 1
    iget-wide v0, p0, LZ2/d;->n:J

    .line 2
    .line 3
    const-wide/32 v2, 0xf4240

    .line 4
    .line 5
    .line 6
    mul-long/2addr v0, v2

    .line 7
    iget-object v2, p0, LZ2/d;->i:LU2/y;

    .line 8
    .line 9
    invoke-static {v2}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, LU2/y;

    .line 14
    .line 15
    iget v2, v2, LU2/y;->e:I

    .line 16
    .line 17
    int-to-long v2, v2

    .line 18
    div-long v5, v0, v2

    .line 19
    .line 20
    iget-object v0, p0, LZ2/d;->f:LU2/O;

    .line 21
    .line 22
    invoke-static {v0}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    move-object v4, v0

    .line 27
    check-cast v4, LU2/O;

    .line 28
    .line 29
    iget v8, p0, LZ2/d;->m:I

    .line 30
    .line 31
    const/4 v9, 0x0

    .line 32
    const/4 v10, 0x0

    .line 33
    const/4 v7, 0x1

    .line 34
    invoke-interface/range {v4 .. v10}, LU2/O;->a(JIIILU2/O$a;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method private n(LU2/q;LU2/I;)I
    .locals 6

    .line 1
    iget-object v0, p0, LZ2/d;->f:LU2/O;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LZ2/d;->i:LU2/y;

    .line 7
    .line 8
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LZ2/d;->l:LZ2/b;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, LU2/e;->d()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, LZ2/d;->l:LZ2/b;

    .line 22
    .line 23
    invoke-virtual {v0, p1, p2}, LU2/e;->c(LU2/q;LU2/I;)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1

    .line 28
    :cond_0
    iget-wide v0, p0, LZ2/d;->n:J

    .line 29
    .line 30
    const-wide/16 v2, -0x1

    .line 31
    .line 32
    cmp-long p2, v0, v2

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    if-nez p2, :cond_1

    .line 36
    .line 37
    iget-object p2, p0, LZ2/d;->i:LU2/y;

    .line 38
    .line 39
    invoke-static {p1, p2}, LU2/v;->i(LU2/q;LU2/y;)J

    .line 40
    .line 41
    .line 42
    move-result-wide p1

    .line 43
    iput-wide p1, p0, LZ2/d;->n:J

    .line 44
    .line 45
    return v0

    .line 46
    :cond_1
    iget-object p2, p0, LZ2/d;->b:Lt2/I;

    .line 47
    .line 48
    invoke-virtual {p2}, Lt2/I;->j()I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    const v1, 0x8000

    .line 53
    .line 54
    .line 55
    if-ge p2, v1, :cond_4

    .line 56
    .line 57
    iget-object v4, p0, LZ2/d;->b:Lt2/I;

    .line 58
    .line 59
    invoke-virtual {v4}, Lt2/I;->f()[B

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    sub-int/2addr v1, p2

    .line 64
    invoke-interface {p1, v4, p2, v1}, LU2/q;->read([BII)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    const/4 v1, -0x1

    .line 69
    if-ne p1, v1, :cond_2

    .line 70
    .line 71
    const/4 v4, 0x1

    .line 72
    goto :goto_0

    .line 73
    :cond_2
    move v4, v0

    .line 74
    :goto_0
    if-nez v4, :cond_3

    .line 75
    .line 76
    iget-object v1, p0, LZ2/d;->b:Lt2/I;

    .line 77
    .line 78
    add-int/2addr p2, p1

    .line 79
    invoke-virtual {v1, p2}, Lt2/I;->a0(I)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    iget-object p1, p0, LZ2/d;->b:Lt2/I;

    .line 84
    .line 85
    invoke-virtual {p1}, Lt2/I;->a()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-nez p1, :cond_5

    .line 90
    .line 91
    invoke-direct {p0}, LZ2/d;->m()V

    .line 92
    .line 93
    .line 94
    return v1

    .line 95
    :cond_4
    move v4, v0

    .line 96
    :cond_5
    :goto_1
    iget-object p1, p0, LZ2/d;->b:Lt2/I;

    .line 97
    .line 98
    invoke-virtual {p1}, Lt2/I;->g()I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    iget p2, p0, LZ2/d;->m:I

    .line 103
    .line 104
    iget v1, p0, LZ2/d;->j:I

    .line 105
    .line 106
    if-ge p2, v1, :cond_6

    .line 107
    .line 108
    iget-object v5, p0, LZ2/d;->b:Lt2/I;

    .line 109
    .line 110
    sub-int/2addr v1, p2

    .line 111
    invoke-virtual {v5}, Lt2/I;->a()I

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    invoke-virtual {v5, p2}, Lt2/I;->c0(I)V

    .line 120
    .line 121
    .line 122
    :cond_6
    iget-object p2, p0, LZ2/d;->b:Lt2/I;

    .line 123
    .line 124
    invoke-direct {p0, p2, v4}, LZ2/d;->e(Lt2/I;Z)J

    .line 125
    .line 126
    .line 127
    move-result-wide v4

    .line 128
    iget-object p2, p0, LZ2/d;->b:Lt2/I;

    .line 129
    .line 130
    invoke-virtual {p2}, Lt2/I;->g()I

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    sub-int/2addr p2, p1

    .line 135
    iget-object v1, p0, LZ2/d;->b:Lt2/I;

    .line 136
    .line 137
    invoke-virtual {v1, p1}, Lt2/I;->b0(I)V

    .line 138
    .line 139
    .line 140
    iget-object p1, p0, LZ2/d;->f:LU2/O;

    .line 141
    .line 142
    iget-object v1, p0, LZ2/d;->b:Lt2/I;

    .line 143
    .line 144
    invoke-interface {p1, v1, p2}, LU2/O;->f(Lt2/I;I)V

    .line 145
    .line 146
    .line 147
    iget p1, p0, LZ2/d;->m:I

    .line 148
    .line 149
    add-int/2addr p1, p2

    .line 150
    iput p1, p0, LZ2/d;->m:I

    .line 151
    .line 152
    cmp-long p1, v4, v2

    .line 153
    .line 154
    if-eqz p1, :cond_7

    .line 155
    .line 156
    invoke-direct {p0}, LZ2/d;->m()V

    .line 157
    .line 158
    .line 159
    iput v0, p0, LZ2/d;->m:I

    .line 160
    .line 161
    iput-wide v4, p0, LZ2/d;->n:J

    .line 162
    .line 163
    :cond_7
    iget-object p1, p0, LZ2/d;->b:Lt2/I;

    .line 164
    .line 165
    invoke-virtual {p1}, Lt2/I;->f()[B

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    array-length p1, p1

    .line 170
    iget-object p2, p0, LZ2/d;->b:Lt2/I;

    .line 171
    .line 172
    invoke-virtual {p2}, Lt2/I;->j()I

    .line 173
    .line 174
    .line 175
    move-result p2

    .line 176
    sub-int/2addr p1, p2

    .line 177
    iget-object p2, p0, LZ2/d;->b:Lt2/I;

    .line 178
    .line 179
    invoke-virtual {p2}, Lt2/I;->a()I

    .line 180
    .line 181
    .line 182
    move-result p2

    .line 183
    const/16 v1, 0x10

    .line 184
    .line 185
    if-ge p2, v1, :cond_8

    .line 186
    .line 187
    if-ge p1, v1, :cond_8

    .line 188
    .line 189
    iget-object p1, p0, LZ2/d;->b:Lt2/I;

    .line 190
    .line 191
    invoke-virtual {p1}, Lt2/I;->a()I

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    iget-object p2, p0, LZ2/d;->b:Lt2/I;

    .line 196
    .line 197
    invoke-virtual {p2}, Lt2/I;->f()[B

    .line 198
    .line 199
    .line 200
    move-result-object p2

    .line 201
    iget-object v1, p0, LZ2/d;->b:Lt2/I;

    .line 202
    .line 203
    invoke-virtual {v1}, Lt2/I;->g()I

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    iget-object v2, p0, LZ2/d;->b:Lt2/I;

    .line 208
    .line 209
    invoke-virtual {v2}, Lt2/I;->f()[B

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    invoke-static {p2, v1, v2, v0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 214
    .line 215
    .line 216
    iget-object p2, p0, LZ2/d;->b:Lt2/I;

    .line 217
    .line 218
    invoke-virtual {p2, v0}, Lt2/I;->b0(I)V

    .line 219
    .line 220
    .line 221
    iget-object p2, p0, LZ2/d;->b:Lt2/I;

    .line 222
    .line 223
    invoke-virtual {p2, p1}, Lt2/I;->a0(I)V

    .line 224
    .line 225
    .line 226
    :cond_8
    return v0
.end method

.method private o(LU2/q;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, LZ2/d;->c:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    invoke-static {p1, v0}, LU2/w;->d(LU2/q;Z)Lq2/J;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, LZ2/d;->h:Lq2/J;

    .line 10
    .line 11
    iput v1, p0, LZ2/d;->g:I

    .line 12
    .line 13
    return-void
.end method

.method private p(LU2/q;)V
    .locals 3

    .line 1
    new-instance v0, LU2/w$a;

    .line 2
    .line 3
    iget-object v1, p0, LZ2/d;->i:LU2/y;

    .line 4
    .line 5
    invoke-direct {v0, v1}, LU2/w$a;-><init>(LU2/y;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-static {p1, v0}, LU2/w;->e(LU2/q;LU2/w$a;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget-object v2, v0, LU2/w$a;->a:LU2/y;

    .line 16
    .line 17
    invoke-static {v2}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, LU2/y;

    .line 22
    .line 23
    iput-object v2, p0, LZ2/d;->i:LU2/y;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object p1, p0, LZ2/d;->i:LU2/y;

    .line 27
    .line 28
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, LZ2/d;->i:LU2/y;

    .line 32
    .line 33
    iget p1, p1, LU2/y;->c:I

    .line 34
    .line 35
    const/4 v0, 0x6

    .line 36
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iput p1, p0, LZ2/d;->j:I

    .line 41
    .line 42
    iget-object p1, p0, LZ2/d;->i:LU2/y;

    .line 43
    .line 44
    iget-object v0, p0, LZ2/d;->a:[B

    .line 45
    .line 46
    iget-object v1, p0, LZ2/d;->h:Lq2/J;

    .line 47
    .line 48
    invoke-virtual {p1, v0, v1}, LU2/y;->g([BLq2/J;)Lq2/x;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget-object v0, p0, LZ2/d;->f:LU2/O;

    .line 53
    .line 54
    invoke-static {v0}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, LU2/O;

    .line 59
    .line 60
    invoke-virtual {p1}, Lq2/x;->b()Lq2/x$b;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    const-string v1, "audio/flac"

    .line 65
    .line 66
    invoke-virtual {p1, v1}, Lq2/x$b;->W(Ljava/lang/String;)Lq2/x$b;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1}, Lq2/x$b;->P()Lq2/x;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-interface {v0, p1}, LU2/O;->c(Lq2/x;)V

    .line 75
    .line 76
    .line 77
    iget-object p1, p0, LZ2/d;->f:LU2/O;

    .line 78
    .line 79
    invoke-static {p1}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, LU2/O;

    .line 84
    .line 85
    iget-object v0, p0, LZ2/d;->i:LU2/y;

    .line 86
    .line 87
    invoke-virtual {v0}, LU2/y;->f()J

    .line 88
    .line 89
    .line 90
    move-result-wide v0

    .line 91
    invoke-interface {p1, v0, v1}, LU2/O;->d(J)V

    .line 92
    .line 93
    .line 94
    const/4 p1, 0x4

    .line 95
    iput p1, p0, LZ2/d;->g:I

    .line 96
    .line 97
    return-void
.end method

.method private q(LU2/q;)V
    .locals 0

    .line 1
    invoke-static {p1}, LU2/w;->i(LU2/q;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x3

    .line 5
    iput p1, p0, LZ2/d;->g:I

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    return-void
.end method

.method public b(JJ)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long p1, p1, v0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    iput p2, p0, LZ2/d;->g:I

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object p1, p0, LZ2/d;->l:LZ2/b;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1, p3, p4}, LU2/e;->h(J)V

    .line 16
    .line 17
    .line 18
    :cond_1
    :goto_0
    cmp-long p1, p3, v0

    .line 19
    .line 20
    if-nez p1, :cond_2

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_2
    const-wide/16 v0, -0x1

    .line 24
    .line 25
    :goto_1
    iput-wide v0, p0, LZ2/d;->n:J

    .line 26
    .line 27
    iput p2, p0, LZ2/d;->m:I

    .line 28
    .line 29
    iget-object p1, p0, LZ2/d;->b:Lt2/I;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lt2/I;->X(I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public c(LU2/r;)V
    .locals 2

    .line 1
    iput-object p1, p0, LZ2/d;->e:LU2/r;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-interface {p1, v0, v1}, LU2/r;->e(II)LU2/O;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, LZ2/d;->f:LU2/O;

    .line 10
    .line 11
    invoke-interface {p1}, LU2/r;->p()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public f(LU2/q;)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p1, v0}, LU2/w;->c(LU2/q;Z)Lq2/J;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, LU2/w;->a(LU2/q;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public h(LU2/q;LU2/I;)I
    .locals 3

    .line 1
    iget v0, p0, LZ2/d;->g:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_5

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-eq v0, v2, :cond_4

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    if-eq v0, v2, :cond_3

    .line 11
    .line 12
    const/4 v2, 0x3

    .line 13
    if-eq v0, v2, :cond_2

    .line 14
    .line 15
    const/4 v2, 0x4

    .line 16
    if-eq v0, v2, :cond_1

    .line 17
    .line 18
    const/4 v1, 0x5

    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    invoke-direct {p0, p1, p2}, LZ2/d;->n(LU2/q;LU2/I;)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1

    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    invoke-direct {p0, p1}, LZ2/d;->g(LU2/q;)V

    .line 33
    .line 34
    .line 35
    return v1

    .line 36
    :cond_2
    invoke-direct {p0, p1}, LZ2/d;->p(LU2/q;)V

    .line 37
    .line 38
    .line 39
    return v1

    .line 40
    :cond_3
    invoke-direct {p0, p1}, LZ2/d;->q(LU2/q;)V

    .line 41
    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    invoke-direct {p0, p1}, LZ2/d;->k(LU2/q;)V

    .line 45
    .line 46
    .line 47
    return v1

    .line 48
    :cond_5
    invoke-direct {p0, p1}, LZ2/d;->o(LU2/q;)V

    .line 49
    .line 50
    .line 51
    return v1
.end method
