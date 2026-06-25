.class public final LS2/v;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS2/v$b;,
        LS2/v$a;
    }
.end annotation


# instance fields
.field private final a:LS2/v$b;

.field private final b:LS2/y;

.field private final c:J

.field private d:Z

.field private e:I

.field private f:J

.field private g:J

.field private h:J

.field private i:J

.field private j:Z

.field private k:F

.field private l:Lt2/j;

.field private m:Z

.field private n:Z

.field private o:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;LS2/v$b;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LS2/v;->a:LS2/v$b;

    .line 5
    .line 6
    iput-wide p3, p0, LS2/v;->c:J

    .line 7
    .line 8
    new-instance p2, LS2/y;

    .line 9
    .line 10
    invoke-direct {p2, p1}, LS2/y;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, LS2/v;->b:LS2/y;

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput p1, p0, LS2/v;->e:I

    .line 17
    .line 18
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    iput-wide p1, p0, LS2/v;->f:J

    .line 24
    .line 25
    iput-wide p1, p0, LS2/v;->h:J

    .line 26
    .line 27
    iput-wide p1, p0, LS2/v;->i:J

    .line 28
    .line 29
    const/high16 p1, 0x3f800000    # 1.0f

    .line 30
    .line 31
    iput p1, p0, LS2/v;->k:F

    .line 32
    .line 33
    sget-object p1, Lt2/j;->a:Lt2/j;

    .line 34
    .line 35
    iput-object p1, p0, LS2/v;->l:Lt2/j;

    .line 36
    .line 37
    return-void
.end method

.method private b(JJJ)J
    .locals 0

    .line 1
    sub-long/2addr p5, p1

    .line 2
    long-to-double p1, p5

    .line 3
    iget p5, p0, LS2/v;->k:F

    .line 4
    .line 5
    float-to-double p5, p5

    .line 6
    div-double/2addr p1, p5

    .line 7
    double-to-long p1, p1

    .line 8
    iget-boolean p5, p0, LS2/v;->d:Z

    .line 9
    .line 10
    if-eqz p5, :cond_0

    .line 11
    .line 12
    iget-object p5, p0, LS2/v;->l:Lt2/j;

    .line 13
    .line 14
    invoke-interface {p5}, Lt2/j;->c()J

    .line 15
    .line 16
    .line 17
    move-result-wide p5

    .line 18
    invoke-static {p5, p6}, Lt2/a0;->V0(J)J

    .line 19
    .line 20
    .line 21
    move-result-wide p5

    .line 22
    sub-long/2addr p5, p3

    .line 23
    sub-long/2addr p1, p5

    .line 24
    :cond_0
    return-wide p1
.end method

.method private f(I)V
    .locals 1

    .line 1
    iget v0, p0, LS2/v;->e:I

    .line 2
    .line 3
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iput p1, p0, LS2/v;->e:I

    .line 8
    .line 9
    return-void
.end method

.method private q(JJJ)Z
    .locals 7

    .line 1
    iget-wide v0, p0, LS2/v;->i:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v0, v0, v2

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-boolean v0, p0, LS2/v;->j:Z

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return v1

    .line 18
    :cond_0
    iget v0, p0, LS2/v;->e:I

    .line 19
    .line 20
    if-eqz v0, :cond_7

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    if-eq v0, v4, :cond_6

    .line 24
    .line 25
    const/4 v5, 0x2

    .line 26
    if-eq v0, v5, :cond_4

    .line 27
    .line 28
    const/4 p5, 0x3

    .line 29
    if-ne v0, p5, :cond_3

    .line 30
    .line 31
    iget-object p5, p0, LS2/v;->l:Lt2/j;

    .line 32
    .line 33
    invoke-interface {p5}, Lt2/j;->c()J

    .line 34
    .line 35
    .line 36
    move-result-wide p5

    .line 37
    invoke-static {p5, p6}, Lt2/a0;->V0(J)J

    .line 38
    .line 39
    .line 40
    move-result-wide p5

    .line 41
    iget-wide v5, p0, LS2/v;->g:J

    .line 42
    .line 43
    sub-long/2addr p5, v5

    .line 44
    iget-boolean v0, p0, LS2/v;->d:Z

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    iget-boolean v0, p0, LS2/v;->o:Z

    .line 49
    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    iget-wide v5, p0, LS2/v;->f:J

    .line 53
    .line 54
    cmp-long v0, v5, v2

    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    cmp-long p1, v5, p1

    .line 59
    .line 60
    if-eqz p1, :cond_2

    .line 61
    .line 62
    :cond_1
    iget-object p1, p0, LS2/v;->a:LS2/v$b;

    .line 63
    .line 64
    invoke-interface {p1, p3, p4, p5, p6}, LS2/v$b;->z(JJ)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_2

    .line 69
    .line 70
    return v4

    .line 71
    :cond_2
    return v1

    .line 72
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 75
    .line 76
    .line 77
    throw p1

    .line 78
    :cond_4
    cmp-long p1, p1, p5

    .line 79
    .line 80
    if-ltz p1, :cond_5

    .line 81
    .line 82
    return v4

    .line 83
    :cond_5
    return v1

    .line 84
    :cond_6
    return v4

    .line 85
    :cond_7
    iget-boolean p1, p0, LS2/v;->d:Z

    .line 86
    .line 87
    return p1
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget v0, p0, LS2/v;->e:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput v0, p0, LS2/v;->e:I

    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public c(JJJJZZLS2/v$a;)I
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v5, p1

    .line 4
    .line 5
    move-wide/from16 v1, p3

    .line 6
    .line 7
    move-object/from16 v9, p11

    .line 8
    .line 9
    invoke-static {v9}, LS2/v$a;->a(LS2/v$a;)V

    .line 10
    .line 11
    .line 12
    iget-boolean v3, v0, LS2/v;->d:Z

    .line 13
    .line 14
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    iget-wide v3, v0, LS2/v;->f:J

    .line 22
    .line 23
    cmp-long v3, v3, v7

    .line 24
    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    iput-wide v1, v0, LS2/v;->f:J

    .line 28
    .line 29
    :cond_0
    iget-wide v3, v0, LS2/v;->h:J

    .line 30
    .line 31
    cmp-long v3, v3, v5

    .line 32
    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    iget-object v3, v0, LS2/v;->b:LS2/y;

    .line 36
    .line 37
    invoke-virtual {v3, v5, v6}, LS2/y;->h(J)V

    .line 38
    .line 39
    .line 40
    iput-wide v5, v0, LS2/v;->h:J

    .line 41
    .line 42
    :cond_1
    move-wide/from16 v3, p5

    .line 43
    .line 44
    invoke-direct/range {v0 .. v6}, LS2/v;->b(JJJ)J

    .line 45
    .line 46
    .line 47
    move-result-wide v5

    .line 48
    move-object v10, v0

    .line 49
    invoke-static {v9, v5, v6}, LS2/v$a;->c(LS2/v$a;J)J

    .line 50
    .line 51
    .line 52
    const/16 v16, 0x3

    .line 53
    .line 54
    if-eqz p9, :cond_2

    .line 55
    .line 56
    if-nez p10, :cond_2

    .line 57
    .line 58
    return v16

    .line 59
    :cond_2
    iget-boolean v0, v10, LS2/v;->m:Z

    .line 60
    .line 61
    const/4 v11, 0x4

    .line 62
    const/16 v17, 0x5

    .line 63
    .line 64
    const/4 v12, 0x1

    .line 65
    if-nez v0, :cond_5

    .line 66
    .line 67
    iput-boolean v12, v10, LS2/v;->n:Z

    .line 68
    .line 69
    iget-object v0, v10, LS2/v;->a:LS2/v$b;

    .line 70
    .line 71
    invoke-static {v9}, LS2/v$a;->b(LS2/v$a;)J

    .line 72
    .line 73
    .line 74
    move-result-wide v1

    .line 75
    const/4 v8, 0x1

    .line 76
    move-wide/from16 v3, p3

    .line 77
    .line 78
    move-wide/from16 v5, p5

    .line 79
    .line 80
    move/from16 v7, p10

    .line 81
    .line 82
    invoke-interface/range {v0 .. v8}, LS2/v$b;->B(JJJZZ)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_3

    .line 87
    .line 88
    return v11

    .line 89
    :cond_3
    iget-boolean v0, v10, LS2/v;->d:Z

    .line 90
    .line 91
    if-eqz v0, :cond_4

    .line 92
    .line 93
    invoke-static {v9}, LS2/v$a;->b(LS2/v$a;)J

    .line 94
    .line 95
    .line 96
    move-result-wide v0

    .line 97
    const-wide/16 v2, 0x7530

    .line 98
    .line 99
    cmp-long v0, v0, v2

    .line 100
    .line 101
    if-gez v0, :cond_4

    .line 102
    .line 103
    return v16

    .line 104
    :cond_4
    return v17

    .line 105
    :cond_5
    invoke-static {v9}, LS2/v$a;->b(LS2/v$a;)J

    .line 106
    .line 107
    .line 108
    move-result-wide v3

    .line 109
    move-wide/from16 v1, p3

    .line 110
    .line 111
    move-wide/from16 v5, p7

    .line 112
    .line 113
    move-object v0, v10

    .line 114
    invoke-direct/range {v0 .. v6}, LS2/v;->q(JJJ)Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    const/4 v0, 0x0

    .line 119
    if-eqz v3, :cond_6

    .line 120
    .line 121
    return v0

    .line 122
    :cond_6
    iget-boolean v1, v10, LS2/v;->d:Z

    .line 123
    .line 124
    if-eqz v1, :cond_d

    .line 125
    .line 126
    iget-wide v1, v10, LS2/v;->f:J

    .line 127
    .line 128
    cmp-long v1, p3, v1

    .line 129
    .line 130
    if-nez v1, :cond_7

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_7
    iget-object v1, v10, LS2/v;->l:Lt2/j;

    .line 134
    .line 135
    invoke-interface {v1}, Lt2/j;->b()J

    .line 136
    .line 137
    .line 138
    move-result-wide v1

    .line 139
    iget-object v3, v10, LS2/v;->b:LS2/y;

    .line 140
    .line 141
    invoke-static {v9}, LS2/v$a;->b(LS2/v$a;)J

    .line 142
    .line 143
    .line 144
    move-result-wide v4

    .line 145
    const-wide/16 v13, 0x3e8

    .line 146
    .line 147
    mul-long/2addr v4, v13

    .line 148
    add-long/2addr v4, v1

    .line 149
    invoke-virtual {v3, v4, v5}, LS2/y;->b(J)J

    .line 150
    .line 151
    .line 152
    move-result-wide v3

    .line 153
    invoke-static {v9, v3, v4}, LS2/v$a;->e(LS2/v$a;J)J

    .line 154
    .line 155
    .line 156
    invoke-static {v9}, LS2/v$a;->d(LS2/v$a;)J

    .line 157
    .line 158
    .line 159
    move-result-wide v3

    .line 160
    sub-long/2addr v3, v1

    .line 161
    div-long/2addr v3, v13

    .line 162
    invoke-static {v9, v3, v4}, LS2/v$a;->c(LS2/v$a;J)J

    .line 163
    .line 164
    .line 165
    iget-wide v1, v10, LS2/v;->i:J

    .line 166
    .line 167
    cmp-long v1, v1, v7

    .line 168
    .line 169
    if-eqz v1, :cond_8

    .line 170
    .line 171
    iget-boolean v1, v10, LS2/v;->j:Z

    .line 172
    .line 173
    if-nez v1, :cond_8

    .line 174
    .line 175
    move v8, v12

    .line 176
    goto :goto_0

    .line 177
    :cond_8
    move v8, v0

    .line 178
    :goto_0
    iget-object v0, v10, LS2/v;->a:LS2/v$b;

    .line 179
    .line 180
    invoke-static {v9}, LS2/v$a;->b(LS2/v$a;)J

    .line 181
    .line 182
    .line 183
    move-result-wide v1

    .line 184
    move-wide/from16 v3, p3

    .line 185
    .line 186
    move-wide/from16 v5, p5

    .line 187
    .line 188
    move/from16 v7, p10

    .line 189
    .line 190
    invoke-interface/range {v0 .. v8}, LS2/v$b;->B(JJJZZ)Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-eqz v0, :cond_9

    .line 195
    .line 196
    return v11

    .line 197
    :cond_9
    move-object v0, v10

    .line 198
    iget-object v10, v0, LS2/v;->a:LS2/v$b;

    .line 199
    .line 200
    move v1, v12

    .line 201
    invoke-static {v9}, LS2/v$a;->b(LS2/v$a;)J

    .line 202
    .line 203
    .line 204
    move-result-wide v11

    .line 205
    move-wide/from16 v13, p5

    .line 206
    .line 207
    move/from16 v15, p10

    .line 208
    .line 209
    invoke-interface/range {v10 .. v15}, LS2/v$b;->K(JJZ)Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-eqz v0, :cond_b

    .line 214
    .line 215
    if-eqz v8, :cond_a

    .line 216
    .line 217
    return v16

    .line 218
    :cond_a
    const/4 v0, 0x2

    .line 219
    return v0

    .line 220
    :cond_b
    invoke-static {v9}, LS2/v$a;->b(LS2/v$a;)J

    .line 221
    .line 222
    .line 223
    move-result-wide v2

    .line 224
    const-wide/32 v4, 0xc350

    .line 225
    .line 226
    .line 227
    cmp-long v0, v2, v4

    .line 228
    .line 229
    if-lez v0, :cond_c

    .line 230
    .line 231
    return v17

    .line 232
    :cond_c
    return v1

    .line 233
    :cond_d
    :goto_1
    return v17
.end method

.method public d(Z)Z
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    iget p1, p0, LS2/v;->e:I

    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    if-eq p1, v3, :cond_0

    .line 13
    .line 14
    iget-boolean p1, p0, LS2/v;->m:Z

    .line 15
    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    iget-boolean p1, p0, LS2/v;->n:Z

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    :cond_0
    iput-wide v1, p0, LS2/v;->i:J

    .line 23
    .line 24
    return v0

    .line 25
    :cond_1
    iget-wide v3, p0, LS2/v;->i:J

    .line 26
    .line 27
    cmp-long p1, v3, v1

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    if-nez p1, :cond_2

    .line 31
    .line 32
    return v3

    .line 33
    :cond_2
    iget-object p1, p0, LS2/v;->l:Lt2/j;

    .line 34
    .line 35
    invoke-interface {p1}, Lt2/j;->c()J

    .line 36
    .line 37
    .line 38
    move-result-wide v4

    .line 39
    iget-wide v6, p0, LS2/v;->i:J

    .line 40
    .line 41
    cmp-long p1, v4, v6

    .line 42
    .line 43
    if-gez p1, :cond_3

    .line 44
    .line 45
    return v0

    .line 46
    :cond_3
    iput-wide v1, p0, LS2/v;->i:J

    .line 47
    .line 48
    return v3
.end method

.method public e(Z)V
    .locals 4

    .line 1
    iput-boolean p1, p0, LS2/v;->j:Z

    .line 2
    .line 3
    iget-wide v0, p0, LS2/v;->c:J

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long p1, v0, v2

    .line 8
    .line 9
    if-lez p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, LS2/v;->l:Lt2/j;

    .line 12
    .line 13
    invoke-interface {p1}, Lt2/j;->c()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    iget-wide v2, p0, LS2/v;->c:J

    .line 18
    .line 19
    add-long/2addr v0, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    :goto_0
    iput-wide v0, p0, LS2/v;->i:J

    .line 27
    .line 28
    return-void
.end method

.method public g()Z
    .locals 3

    .line 1
    iget v0, p0, LS2/v;->e:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    iput v1, p0, LS2/v;->e:I

    .line 10
    .line 11
    iget-object v1, p0, LS2/v;->l:Lt2/j;

    .line 12
    .line 13
    invoke-interface {v1}, Lt2/j;->c()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    invoke-static {v1, v2}, Lt2/a0;->V0(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    iput-wide v1, p0, LS2/v;->g:J

    .line 22
    .line 23
    return v0
.end method

.method public h()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LS2/v;->d:Z

    .line 3
    .line 4
    iget-object v0, p0, LS2/v;->l:Lt2/j;

    .line 5
    .line 6
    invoke-interface {v0}, Lt2/j;->c()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, Lt2/a0;->V0(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iput-wide v0, p0, LS2/v;->g:J

    .line 15
    .line 16
    iget-object v0, p0, LS2/v;->b:LS2/y;

    .line 17
    .line 18
    invoke-virtual {v0}, LS2/y;->k()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public i()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LS2/v;->d:Z

    .line 3
    .line 4
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v0, p0, LS2/v;->i:J

    .line 10
    .line 11
    iget-object v0, p0, LS2/v;->b:LS2/y;

    .line 12
    .line 13
    invoke-virtual {v0}, LS2/y;->l()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public j(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p1, :cond_2

    .line 3
    .line 4
    if-eq p1, v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, v0}, LS2/v;->f(I)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 16
    .line 17
    .line 18
    throw p1

    .line 19
    :cond_1
    const/4 p1, 0x0

    .line 20
    iput p1, p0, LS2/v;->e:I

    .line 21
    .line 22
    return-void

    .line 23
    :cond_2
    iput v0, p0, LS2/v;->e:I

    .line 24
    .line 25
    return-void
.end method

.method public k()V
    .locals 3

    .line 1
    iget-object v0, p0, LS2/v;->b:LS2/y;

    .line 2
    .line 3
    invoke-virtual {v0}, LS2/y;->j()V

    .line 4
    .line 5
    .line 6
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    iput-wide v0, p0, LS2/v;->h:J

    .line 12
    .line 13
    iput-wide v0, p0, LS2/v;->f:J

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {p0, v2}, LS2/v;->f(I)V

    .line 17
    .line 18
    .line 19
    iput-wide v0, p0, LS2/v;->i:J

    .line 20
    .line 21
    return-void
.end method

.method public l(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LS2/v;->b:LS2/y;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LS2/y;->o(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public m(Lt2/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, LS2/v;->l:Lt2/j;

    .line 2
    .line 3
    return-void
.end method

.method public n(F)V
    .locals 1

    .line 1
    iget-object v0, p0, LS2/v;->b:LS2/y;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LS2/y;->g(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public o(Landroid/view/Surface;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    move v2, v1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move v2, v0

    .line 8
    :goto_0
    iput-boolean v2, p0, LS2/v;->m:Z

    .line 9
    .line 10
    iput-boolean v0, p0, LS2/v;->n:Z

    .line 11
    .line 12
    iget-object v0, p0, LS2/v;->b:LS2/y;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, LS2/y;->m(Landroid/view/Surface;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v1}, LS2/v;->f(I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public p(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p1, v0

    .line 3
    .line 4
    if-lez v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-static {v0}, Lt2/a;->a(Z)V

    .line 10
    .line 11
    .line 12
    iget v0, p0, LS2/v;->k:F

    .line 13
    .line 14
    cmpl-float v0, p1, v0

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    iput p1, p0, LS2/v;->k:F

    .line 20
    .line 21
    iget-object v0, p0, LS2/v;->b:LS2/y;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, LS2/y;->i(F)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
