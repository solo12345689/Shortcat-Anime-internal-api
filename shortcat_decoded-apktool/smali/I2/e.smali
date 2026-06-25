.class public LI2/e;
.super Landroidx/media3/exoplayer/h;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI2/e$a;,
        LI2/e$b;
    }
.end annotation


# instance fields
.field private A:I

.field private B:I

.field private C:Lq2/x;

.field private D:LI2/b;

.field private E:Lz2/f;

.field private F:Landroidx/media3/exoplayer/image/ImageOutput;

.field private G:Landroid/graphics/Bitmap;

.field private H:Z

.field private I:LI2/e$b;

.field private X:LI2/e$b;

.field private Y:I

.field private Z:Z

.field private final s:LI2/b$a;

.field private final t:Lz2/f;

.field private final u:Ljava/util/ArrayDeque;

.field private v:Z

.field private w:Z

.field private x:LI2/e$a;

.field private y:J

.field private z:J


# direct methods
.method public constructor <init>(LI2/b$a;Landroidx/media3/exoplayer/image/ImageOutput;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/h;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, LI2/e;->s:LI2/b$a;

    .line 6
    .line 7
    invoke-static {p2}, LI2/e;->v0(Landroidx/media3/exoplayer/image/ImageOutput;)Landroidx/media3/exoplayer/image/ImageOutput;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, LI2/e;->F:Landroidx/media3/exoplayer/image/ImageOutput;

    .line 12
    .line 13
    invoke-static {}, Lz2/f;->A()Lz2/f;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, LI2/e;->t:Lz2/f;

    .line 18
    .line 19
    sget-object p1, LI2/e$a;->c:LI2/e$a;

    .line 20
    .line 21
    iput-object p1, p0, LI2/e;->x:LI2/e$a;

    .line 22
    .line 23
    new-instance p1, Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, LI2/e;->u:Ljava/util/ArrayDeque;

    .line 29
    .line 30
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    iput-wide p1, p0, LI2/e;->z:J

    .line 36
    .line 37
    iput-wide p1, p0, LI2/e;->y:J

    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    iput p1, p0, LI2/e;->A:I

    .line 41
    .line 42
    const/4 p1, 0x1

    .line 43
    iput p1, p0, LI2/e;->B:I

    .line 44
    .line 45
    return-void
.end method

.method private B0(J)V
    .locals 2

    .line 1
    iput-wide p1, p0, LI2/e;->y:J

    .line 2
    .line 3
    :goto_0
    iget-object v0, p0, LI2/e;->u:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LI2/e;->u:Ljava/util/ArrayDeque;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, LI2/e$a;

    .line 18
    .line 19
    iget-wide v0, v0, LI2/e$a;->a:J

    .line 20
    .line 21
    cmp-long v0, p1, v0

    .line 22
    .line 23
    if-ltz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, LI2/e;->u:Ljava/util/ArrayDeque;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, LI2/e$a;

    .line 32
    .line 33
    iput-object v0, p0, LI2/e;->x:LI2/e$a;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    return-void
.end method

.method private D0()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LI2/e;->E:Lz2/f;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput v1, p0, LI2/e;->A:I

    .line 6
    .line 7
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    iput-wide v1, p0, LI2/e;->z:J

    .line 13
    .line 14
    iget-object v1, p0, LI2/e;->D:LI2/b;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v1}, Lz2/d;->a()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, LI2/e;->D:LI2/b;

    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method private E0(Landroidx/media3/exoplayer/image/ImageOutput;)V
    .locals 0

    .line 1
    invoke-static {p1}, LI2/e;->v0(Landroidx/media3/exoplayer/image/ImageOutput;)Landroidx/media3/exoplayer/image/ImageOutput;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, LI2/e;->F:Landroidx/media3/exoplayer/image/ImageOutput;

    .line 6
    .line 7
    return-void
.end method

.method private F0()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->getState()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    move v0, v3

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v0, v2

    .line 13
    :goto_0
    iget v1, p0, LI2/e;->B:I

    .line 14
    .line 15
    if-eqz v1, :cond_3

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    const/4 v0, 0x3

    .line 20
    if-ne v1, v0, :cond_1

    .line 21
    .line 22
    return v2

    .line 23
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 26
    .line 27
    .line 28
    throw v0

    .line 29
    :cond_2
    return v3

    .line 30
    :cond_3
    return v0
.end method

.method private r0(Lq2/x;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LI2/e;->s:LI2/b$a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LI2/b$a;->b(Lq2/x;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x4

    .line 8
    invoke-static {v0}, Landroidx/media3/exoplayer/O0;->t(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eq p1, v0, :cond_1

    .line 13
    .line 14
    const/4 v0, 0x3

    .line 15
    invoke-static {v0}, Landroidx/media3/exoplayer/O0;->t(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    return p1

    .line 24
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 25
    return p1
.end method

.method private s0(I)Landroid/graphics/Bitmap;
    .locals 4

    .line 1
    iget-object v0, p0, LI2/e;->G:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LI2/e;->G:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v1, p0, LI2/e;->C:Lq2/x;

    .line 13
    .line 14
    invoke-static {v1}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lq2/x;

    .line 19
    .line 20
    iget v1, v1, Lq2/x;->N:I

    .line 21
    .line 22
    div-int/2addr v0, v1

    .line 23
    iget-object v1, p0, LI2/e;->G:Landroid/graphics/Bitmap;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    iget-object v2, p0, LI2/e;->C:Lq2/x;

    .line 30
    .line 31
    invoke-static {v2}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lq2/x;

    .line 36
    .line 37
    iget v2, v2, Lq2/x;->O:I

    .line 38
    .line 39
    div-int/2addr v1, v2

    .line 40
    iget-object v2, p0, LI2/e;->C:Lq2/x;

    .line 41
    .line 42
    iget v2, v2, Lq2/x;->N:I

    .line 43
    .line 44
    rem-int v3, p1, v2

    .line 45
    .line 46
    mul-int/2addr v3, v0

    .line 47
    div-int/2addr p1, v2

    .line 48
    mul-int/2addr p1, v1

    .line 49
    iget-object v2, p0, LI2/e;->G:Landroid/graphics/Bitmap;

    .line 50
    .line 51
    invoke-static {v2, v3, p1, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    return-object p1
.end method

.method private t0(JJ)Z
    .locals 12

    .line 1
    iget-object v1, p0, LI2/e;->G:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    const/4 v8, 0x0

    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, LI2/e;->I:LI2/e$b;

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    return v8

    .line 11
    :cond_0
    iget v1, p0, LI2/e;->B:I

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->getState()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x2

    .line 20
    if-eq v1, v2, :cond_1

    .line 21
    .line 22
    return v8

    .line 23
    :cond_1
    iget-object v1, p0, LI2/e;->G:Landroid/graphics/Bitmap;

    .line 24
    .line 25
    const/4 v9, 0x3

    .line 26
    const/4 v10, 0x1

    .line 27
    if-nez v1, :cond_6

    .line 28
    .line 29
    iget-object v1, p0, LI2/e;->D:LI2/b;

    .line 30
    .line 31
    invoke-static {v1}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, LI2/e;->D:LI2/b;

    .line 35
    .line 36
    invoke-interface {v1}, LI2/b;->b()LI2/d;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-nez v1, :cond_2

    .line 41
    .line 42
    return v8

    .line 43
    :cond_2
    invoke-static {v1}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, LI2/d;

    .line 48
    .line 49
    invoke-virtual {v2}, Lz2/a;->q()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_5

    .line 54
    .line 55
    iget v2, p0, LI2/e;->A:I

    .line 56
    .line 57
    if-ne v2, v9, :cond_3

    .line 58
    .line 59
    invoke-direct {p0}, LI2/e;->D0()V

    .line 60
    .line 61
    .line 62
    iget-object v1, p0, LI2/e;->C:Lq2/x;

    .line 63
    .line 64
    invoke-static {v1}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    invoke-direct {p0}, LI2/e;->z0()Z

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    invoke-static {v1}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, LI2/d;

    .line 76
    .line 77
    invoke-virtual {v1}, Lz2/g;->w()V

    .line 78
    .line 79
    .line 80
    iget-object v1, p0, LI2/e;->u:Ljava/util/ArrayDeque;

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_4

    .line 87
    .line 88
    iput-boolean v10, p0, LI2/e;->w:Z

    .line 89
    .line 90
    :cond_4
    :goto_0
    return v8

    .line 91
    :cond_5
    iget-object v2, v1, LI2/d;->e:Landroid/graphics/Bitmap;

    .line 92
    .line 93
    const-string v3, "Non-EOS buffer came back from the decoder without bitmap."

    .line 94
    .line 95
    invoke-static {v2, v3}, Lt2/a;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    iget-object v2, v1, LI2/d;->e:Landroid/graphics/Bitmap;

    .line 99
    .line 100
    iput-object v2, p0, LI2/e;->G:Landroid/graphics/Bitmap;

    .line 101
    .line 102
    invoke-static {v1}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    check-cast v1, LI2/d;

    .line 107
    .line 108
    invoke-virtual {v1}, Lz2/g;->w()V

    .line 109
    .line 110
    .line 111
    :cond_6
    iget-boolean v1, p0, LI2/e;->H:Z

    .line 112
    .line 113
    if-eqz v1, :cond_e

    .line 114
    .line 115
    iget-object v1, p0, LI2/e;->G:Landroid/graphics/Bitmap;

    .line 116
    .line 117
    if-eqz v1, :cond_e

    .line 118
    .line 119
    iget-object v1, p0, LI2/e;->I:LI2/e$b;

    .line 120
    .line 121
    if-eqz v1, :cond_e

    .line 122
    .line 123
    iget-object v1, p0, LI2/e;->C:Lq2/x;

    .line 124
    .line 125
    invoke-static {v1}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    iget-object v1, p0, LI2/e;->C:Lq2/x;

    .line 129
    .line 130
    iget v2, v1, Lq2/x;->N:I

    .line 131
    .line 132
    if-ne v2, v10, :cond_7

    .line 133
    .line 134
    iget v3, v1, Lq2/x;->O:I

    .line 135
    .line 136
    if-eq v3, v10, :cond_8

    .line 137
    .line 138
    :cond_7
    const/4 v3, -0x1

    .line 139
    if-eq v2, v3, :cond_8

    .line 140
    .line 141
    iget v1, v1, Lq2/x;->O:I

    .line 142
    .line 143
    if-eq v1, v3, :cond_8

    .line 144
    .line 145
    move v11, v10

    .line 146
    goto :goto_1

    .line 147
    :cond_8
    move v11, v8

    .line 148
    :goto_1
    iget-object v1, p0, LI2/e;->I:LI2/e$b;

    .line 149
    .line 150
    invoke-virtual {v1}, LI2/e$b;->d()Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-nez v1, :cond_a

    .line 155
    .line 156
    iget-object v1, p0, LI2/e;->I:LI2/e$b;

    .line 157
    .line 158
    if-eqz v11, :cond_9

    .line 159
    .line 160
    invoke-virtual {v1}, LI2/e$b;->c()I

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    invoke-direct {p0, v2}, LI2/e;->s0(I)Landroid/graphics/Bitmap;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    goto :goto_2

    .line 169
    :cond_9
    iget-object v2, p0, LI2/e;->G:Landroid/graphics/Bitmap;

    .line 170
    .line 171
    invoke-static {v2}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    check-cast v2, Landroid/graphics/Bitmap;

    .line 176
    .line 177
    :goto_2
    invoke-virtual {v1, v2}, LI2/e$b;->e(Landroid/graphics/Bitmap;)V

    .line 178
    .line 179
    .line 180
    :cond_a
    iget-object v1, p0, LI2/e;->I:LI2/e$b;

    .line 181
    .line 182
    invoke-virtual {v1}, LI2/e$b;->b()Landroid/graphics/Bitmap;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    invoke-static {v1}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    move-object v5, v1

    .line 191
    check-cast v5, Landroid/graphics/Bitmap;

    .line 192
    .line 193
    iget-object v1, p0, LI2/e;->I:LI2/e$b;

    .line 194
    .line 195
    invoke-virtual {v1}, LI2/e$b;->a()J

    .line 196
    .line 197
    .line 198
    move-result-wide v6

    .line 199
    move-object v0, p0

    .line 200
    move-wide v1, p1

    .line 201
    move-wide v3, p3

    .line 202
    invoke-virtual/range {v0 .. v7}, LI2/e;->C0(JJLandroid/graphics/Bitmap;J)Z

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    if-nez v1, :cond_b

    .line 207
    .line 208
    return v8

    .line 209
    :cond_b
    iget-object v1, p0, LI2/e;->I:LI2/e$b;

    .line 210
    .line 211
    invoke-static {v1}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    check-cast v1, LI2/e$b;

    .line 216
    .line 217
    invoke-virtual {v1}, LI2/e$b;->a()J

    .line 218
    .line 219
    .line 220
    move-result-wide v1

    .line 221
    invoke-direct {p0, v1, v2}, LI2/e;->B0(J)V

    .line 222
    .line 223
    .line 224
    iput v9, p0, LI2/e;->B:I

    .line 225
    .line 226
    const/4 v1, 0x0

    .line 227
    if-eqz v11, :cond_c

    .line 228
    .line 229
    iget-object v2, p0, LI2/e;->I:LI2/e$b;

    .line 230
    .line 231
    invoke-static {v2}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    check-cast v2, LI2/e$b;

    .line 236
    .line 237
    invoke-virtual {v2}, LI2/e$b;->c()I

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    iget-object v3, p0, LI2/e;->C:Lq2/x;

    .line 242
    .line 243
    invoke-static {v3}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    check-cast v3, Lq2/x;

    .line 248
    .line 249
    iget v3, v3, Lq2/x;->O:I

    .line 250
    .line 251
    iget-object v4, p0, LI2/e;->C:Lq2/x;

    .line 252
    .line 253
    invoke-static {v4}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    check-cast v4, Lq2/x;

    .line 258
    .line 259
    iget v4, v4, Lq2/x;->N:I

    .line 260
    .line 261
    mul-int/2addr v3, v4

    .line 262
    sub-int/2addr v3, v10

    .line 263
    if-ne v2, v3, :cond_d

    .line 264
    .line 265
    :cond_c
    iput-object v1, p0, LI2/e;->G:Landroid/graphics/Bitmap;

    .line 266
    .line 267
    :cond_d
    iget-object v2, p0, LI2/e;->X:LI2/e$b;

    .line 268
    .line 269
    iput-object v2, p0, LI2/e;->I:LI2/e$b;

    .line 270
    .line 271
    iput-object v1, p0, LI2/e;->X:LI2/e$b;

    .line 272
    .line 273
    return v10

    .line 274
    :cond_e
    return v8
.end method

.method private u0(J)Z
    .locals 7

    .line 1
    iget-boolean v0, p0, LI2/e;->H:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, LI2/e;->I:LI2/e$b;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->V()LA2/J;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v2, p0, LI2/e;->D:LI2/b;

    .line 16
    .line 17
    if-eqz v2, :cond_d

    .line 18
    .line 19
    iget v3, p0, LI2/e;->A:I

    .line 20
    .line 21
    const/4 v4, 0x3

    .line 22
    if-eq v3, v4, :cond_d

    .line 23
    .line 24
    iget-boolean v3, p0, LI2/e;->v:Z

    .line 25
    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    goto/16 :goto_2

    .line 29
    .line 30
    :cond_1
    iget-object v3, p0, LI2/e;->E:Lz2/f;

    .line 31
    .line 32
    if-nez v3, :cond_2

    .line 33
    .line 34
    invoke-interface {v2}, Lz2/d;->g()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Lz2/f;

    .line 39
    .line 40
    iput-object v2, p0, LI2/e;->E:Lz2/f;

    .line 41
    .line 42
    if-nez v2, :cond_2

    .line 43
    .line 44
    return v1

    .line 45
    :cond_2
    iget v2, p0, LI2/e;->A:I

    .line 46
    .line 47
    const/4 v3, 0x2

    .line 48
    const/4 v5, 0x0

    .line 49
    if-ne v2, v3, :cond_3

    .line 50
    .line 51
    iget-object p1, p0, LI2/e;->E:Lz2/f;

    .line 52
    .line 53
    invoke-static {p1}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, LI2/e;->E:Lz2/f;

    .line 57
    .line 58
    const/4 p2, 0x4

    .line 59
    invoke-virtual {p1, p2}, Lz2/a;->v(I)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, LI2/e;->D:LI2/b;

    .line 63
    .line 64
    invoke-static {p1}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    check-cast p1, LI2/b;

    .line 69
    .line 70
    iget-object p2, p0, LI2/e;->E:Lz2/f;

    .line 71
    .line 72
    invoke-interface {p1, p2}, LI2/b;->d(Lz2/f;)V

    .line 73
    .line 74
    .line 75
    iput-object v5, p0, LI2/e;->E:Lz2/f;

    .line 76
    .line 77
    iput v4, p0, LI2/e;->A:I

    .line 78
    .line 79
    return v1

    .line 80
    :cond_3
    iget-object v2, p0, LI2/e;->E:Lz2/f;

    .line 81
    .line 82
    invoke-virtual {p0, v0, v2, v1}, Landroidx/media3/exoplayer/h;->o0(LA2/J;Lz2/f;I)I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    const/4 v4, -0x5

    .line 87
    const/4 v6, 0x1

    .line 88
    if-eq v2, v4, :cond_c

    .line 89
    .line 90
    const/4 v0, -0x4

    .line 91
    if-eq v2, v0, :cond_5

    .line 92
    .line 93
    const/4 p1, -0x3

    .line 94
    if-ne v2, p1, :cond_4

    .line 95
    .line 96
    return v1

    .line 97
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 98
    .line 99
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 100
    .line 101
    .line 102
    throw p1

    .line 103
    :cond_5
    iget-object v0, p0, LI2/e;->E:Lz2/f;

    .line 104
    .line 105
    invoke-virtual {v0}, Lz2/f;->y()V

    .line 106
    .line 107
    .line 108
    iget-object v0, p0, LI2/e;->E:Lz2/f;

    .line 109
    .line 110
    iget-object v0, v0, Lz2/f;->d:Ljava/nio/ByteBuffer;

    .line 111
    .line 112
    if-eqz v0, :cond_6

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-gtz v0, :cond_7

    .line 119
    .line 120
    :cond_6
    iget-object v0, p0, LI2/e;->E:Lz2/f;

    .line 121
    .line 122
    invoke-static {v0}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    check-cast v0, Lz2/f;

    .line 127
    .line 128
    invoke-virtual {v0}, Lz2/a;->q()Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_8

    .line 133
    .line 134
    :cond_7
    move v0, v6

    .line 135
    goto :goto_0

    .line 136
    :cond_8
    move v0, v1

    .line 137
    :goto_0
    if-eqz v0, :cond_9

    .line 138
    .line 139
    iget-object v2, p0, LI2/e;->E:Lz2/f;

    .line 140
    .line 141
    invoke-static {v2}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    check-cast v2, Lz2/f;

    .line 146
    .line 147
    iget-object v3, p0, LI2/e;->C:Lq2/x;

    .line 148
    .line 149
    iput-object v3, v2, Lz2/f;->b:Lq2/x;

    .line 150
    .line 151
    iget-object v2, p0, LI2/e;->D:LI2/b;

    .line 152
    .line 153
    invoke-static {v2}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    check-cast v2, LI2/b;

    .line 158
    .line 159
    iget-object v3, p0, LI2/e;->E:Lz2/f;

    .line 160
    .line 161
    invoke-static {v3}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    check-cast v3, Lz2/f;

    .line 166
    .line 167
    invoke-interface {v2, v3}, LI2/b;->d(Lz2/f;)V

    .line 168
    .line 169
    .line 170
    iput v1, p0, LI2/e;->Y:I

    .line 171
    .line 172
    :cond_9
    iget-object v2, p0, LI2/e;->E:Lz2/f;

    .line 173
    .line 174
    invoke-static {v2}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    check-cast v2, Lz2/f;

    .line 179
    .line 180
    invoke-direct {p0, p1, p2, v2}, LI2/e;->y0(JLz2/f;)V

    .line 181
    .line 182
    .line 183
    iget-object p1, p0, LI2/e;->E:Lz2/f;

    .line 184
    .line 185
    invoke-static {p1}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    check-cast p1, Lz2/f;

    .line 190
    .line 191
    invoke-virtual {p1}, Lz2/a;->q()Z

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    if-eqz p1, :cond_a

    .line 196
    .line 197
    iput-boolean v6, p0, LI2/e;->v:Z

    .line 198
    .line 199
    iput-object v5, p0, LI2/e;->E:Lz2/f;

    .line 200
    .line 201
    return v1

    .line 202
    :cond_a
    iget-wide p1, p0, LI2/e;->z:J

    .line 203
    .line 204
    iget-object v1, p0, LI2/e;->E:Lz2/f;

    .line 205
    .line 206
    invoke-static {v1}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    check-cast v1, Lz2/f;

    .line 211
    .line 212
    iget-wide v1, v1, Lz2/f;->f:J

    .line 213
    .line 214
    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 215
    .line 216
    .line 217
    move-result-wide p1

    .line 218
    iput-wide p1, p0, LI2/e;->z:J

    .line 219
    .line 220
    if-eqz v0, :cond_b

    .line 221
    .line 222
    iput-object v5, p0, LI2/e;->E:Lz2/f;

    .line 223
    .line 224
    goto :goto_1

    .line 225
    :cond_b
    iget-object p1, p0, LI2/e;->E:Lz2/f;

    .line 226
    .line 227
    invoke-static {p1}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    check-cast p1, Lz2/f;

    .line 232
    .line 233
    invoke-virtual {p1}, Lz2/f;->m()V

    .line 234
    .line 235
    .line 236
    :goto_1
    iget-boolean p1, p0, LI2/e;->H:Z

    .line 237
    .line 238
    xor-int/2addr p1, v6

    .line 239
    return p1

    .line 240
    :cond_c
    iget-object p1, v0, LA2/J;->b:Lq2/x;

    .line 241
    .line 242
    invoke-static {p1}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    check-cast p1, Lq2/x;

    .line 247
    .line 248
    iput-object p1, p0, LI2/e;->C:Lq2/x;

    .line 249
    .line 250
    iput-boolean v6, p0, LI2/e;->Z:Z

    .line 251
    .line 252
    iput v3, p0, LI2/e;->A:I

    .line 253
    .line 254
    return v6

    .line 255
    :cond_d
    :goto_2
    return v1
.end method

.method private static v0(Landroidx/media3/exoplayer/image/ImageOutput;)Landroidx/media3/exoplayer/image/ImageOutput;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Landroidx/media3/exoplayer/image/ImageOutput;->a:Landroidx/media3/exoplayer/image/ImageOutput;

    .line 4
    .line 5
    :cond_0
    return-object p0
.end method

.method private w0(LI2/e$b;)Z
    .locals 3

    .line 1
    iget-object v0, p0, LI2/e;->C:Lq2/x;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lq2/x;

    .line 8
    .line 9
    iget v0, v0, Lq2/x;->N:I

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v2, -0x1

    .line 13
    if-eq v0, v2, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, LI2/e;->C:Lq2/x;

    .line 16
    .line 17
    iget v0, v0, Lq2/x;->O:I

    .line 18
    .line 19
    if-eq v0, v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1}, LI2/e$b;->c()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget-object v0, p0, LI2/e;->C:Lq2/x;

    .line 26
    .line 27
    invoke-static {v0}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lq2/x;

    .line 32
    .line 33
    iget v0, v0, Lq2/x;->O:I

    .line 34
    .line 35
    iget-object v2, p0, LI2/e;->C:Lq2/x;

    .line 36
    .line 37
    iget v2, v2, Lq2/x;->N:I

    .line 38
    .line 39
    mul-int/2addr v0, v2

    .line 40
    sub-int/2addr v0, v1

    .line 41
    if-ne p1, v0, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 p1, 0x0

    .line 45
    return p1

    .line 46
    :cond_1
    :goto_0
    return v1
.end method

.method private x0(I)V
    .locals 1

    .line 1
    iget v0, p0, LI2/e;->B:I

    .line 2
    .line 3
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iput p1, p0, LI2/e;->B:I

    .line 8
    .line 9
    return-void
.end method

.method private y0(JLz2/f;)V
    .locals 8

    .line 1
    invoke-virtual {p3}, Lz2/a;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iput-boolean v1, p0, LI2/e;->H:Z

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance v0, LI2/e$b;

    .line 12
    .line 13
    iget v2, p0, LI2/e;->Y:I

    .line 14
    .line 15
    iget-wide v3, p3, Lz2/f;->f:J

    .line 16
    .line 17
    invoke-direct {v0, v2, v3, v4}, LI2/e$b;-><init>(IJ)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, LI2/e;->X:LI2/e$b;

    .line 21
    .line 22
    iget p3, p0, LI2/e;->Y:I

    .line 23
    .line 24
    add-int/2addr p3, v1

    .line 25
    iput p3, p0, LI2/e;->Y:I

    .line 26
    .line 27
    iget-boolean p3, p0, LI2/e;->H:Z

    .line 28
    .line 29
    if-nez p3, :cond_5

    .line 30
    .line 31
    invoke-virtual {v0}, LI2/e$b;->a()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    const-wide/16 v4, 0x7530

    .line 36
    .line 37
    sub-long v6, v2, v4

    .line 38
    .line 39
    cmp-long p3, v6, p1

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    if-gtz p3, :cond_1

    .line 43
    .line 44
    add-long/2addr v4, v2

    .line 45
    cmp-long p3, p1, v4

    .line 46
    .line 47
    if-gtz p3, :cond_1

    .line 48
    .line 49
    move p3, v1

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move p3, v0

    .line 52
    :goto_0
    iget-object v4, p0, LI2/e;->I:LI2/e$b;

    .line 53
    .line 54
    if-eqz v4, :cond_2

    .line 55
    .line 56
    invoke-virtual {v4}, LI2/e$b;->a()J

    .line 57
    .line 58
    .line 59
    move-result-wide v4

    .line 60
    cmp-long v4, v4, p1

    .line 61
    .line 62
    if-gtz v4, :cond_2

    .line 63
    .line 64
    cmp-long p1, p1, v2

    .line 65
    .line 66
    if-gez p1, :cond_2

    .line 67
    .line 68
    move p1, v1

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    move p1, v0

    .line 71
    :goto_1
    iget-object p2, p0, LI2/e;->X:LI2/e$b;

    .line 72
    .line 73
    invoke-static {p2}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    check-cast p2, LI2/e$b;

    .line 78
    .line 79
    invoke-direct {p0, p2}, LI2/e;->w0(LI2/e$b;)Z

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    if-nez p3, :cond_4

    .line 84
    .line 85
    if-nez p1, :cond_4

    .line 86
    .line 87
    if-eqz p2, :cond_3

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    move v1, v0

    .line 91
    :cond_4
    :goto_2
    iput-boolean v1, p0, LI2/e;->H:Z

    .line 92
    .line 93
    if-eqz p1, :cond_5

    .line 94
    .line 95
    if-nez p3, :cond_5

    .line 96
    .line 97
    return-void

    .line 98
    :cond_5
    iget-object p1, p0, LI2/e;->X:LI2/e$b;

    .line 99
    .line 100
    iput-object p1, p0, LI2/e;->I:LI2/e$b;

    .line 101
    .line 102
    const/4 p1, 0x0

    .line 103
    iput-object p1, p0, LI2/e;->X:LI2/e$b;

    .line 104
    .line 105
    return-void
.end method

.method private z0()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, LI2/e;->A0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-boolean v0, p0, LI2/e;->Z:Z

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    return v2

    .line 15
    :cond_1
    iget-object v0, p0, LI2/e;->C:Lq2/x;

    .line 16
    .line 17
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lq2/x;

    .line 22
    .line 23
    invoke-direct {p0, v0}, LI2/e;->r0(Lq2/x;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    iget-object v0, p0, LI2/e;->D:LI2/b;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    invoke-interface {v0}, Lz2/d;->a()V

    .line 34
    .line 35
    .line 36
    :cond_2
    iget-object v0, p0, LI2/e;->s:LI2/b$a;

    .line 37
    .line 38
    invoke-interface {v0}, LI2/b$a;->a()LI2/b;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, LI2/e;->D:LI2/b;

    .line 43
    .line 44
    iput-boolean v1, p0, LI2/e;->Z:Z

    .line 45
    .line 46
    return v2

    .line 47
    :cond_3
    new-instance v0, LI2/c;

    .line 48
    .line 49
    const-string v1, "Provided decoder factory can\'t create decoder for format."

    .line 50
    .line 51
    invoke-direct {v0, v1}, LI2/c;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, LI2/e;->C:Lq2/x;

    .line 55
    .line 56
    const/16 v2, 0xfa5

    .line 57
    .line 58
    invoke-virtual {p0, v0, v1, v2}, Landroidx/media3/exoplayer/h;->R(Ljava/lang/Throwable;Lq2/x;I)Landroidx/media3/exoplayer/s;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    throw v0
.end method


# virtual methods
.method protected A0()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method protected C0(JJLandroid/graphics/Bitmap;J)Z
    .locals 0

    .line 1
    sub-long p1, p6, p1

    .line 2
    .line 3
    invoke-direct {p0}, LI2/e;->F0()Z

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    if-nez p3, :cond_1

    .line 8
    .line 9
    const-wide/16 p3, 0x7530

    .line 10
    .line 11
    cmp-long p1, p1, p3

    .line 12
    .line 13
    if-gez p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1

    .line 18
    :cond_1
    :goto_0
    iget-object p1, p0, LI2/e;->F:Landroidx/media3/exoplayer/image/ImageOutput;

    .line 19
    .line 20
    iget-object p2, p0, LI2/e;->x:LI2/e$a;

    .line 21
    .line 22
    iget-wide p2, p2, LI2/e$a;->b:J

    .line 23
    .line 24
    sub-long/2addr p6, p2

    .line 25
    invoke-interface {p1, p6, p7, p5}, Landroidx/media3/exoplayer/image/ImageOutput;->onImageAvailable(JLandroid/graphics/Bitmap;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    return p1
.end method

.method public b(Lq2/x;)I
    .locals 1

    .line 1
    iget-object v0, p0, LI2/e;->s:LI2/b$a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LI2/b$a;->b(Lq2/x;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LI2/e;->w:Z

    .line 2
    .line 3
    return v0
.end method

.method protected d0()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LI2/e;->C:Lq2/x;

    .line 3
    .line 4
    sget-object v0, LI2/e$a;->c:LI2/e$a;

    .line 5
    .line 6
    iput-object v0, p0, LI2/e;->x:LI2/e$a;

    .line 7
    .line 8
    iget-object v0, p0, LI2/e;->u:Ljava/util/ArrayDeque;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, LI2/e;->D0()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, LI2/e;->F:Landroidx/media3/exoplayer/image/ImageOutput;

    .line 17
    .line 18
    invoke-interface {v0}, Landroidx/media3/exoplayer/image/ImageOutput;->a()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method protected e0(ZZ)V
    .locals 0

    .line 1
    iput p2, p0, LI2/e;->B:I

    .line 2
    .line 3
    return-void
.end method

.method public g(JJ)V
    .locals 4

    .line 1
    iget-boolean v0, p0, LI2/e;->w:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iget-object v0, p0, LI2/e;->C:Lq2/x;

    .line 7
    .line 8
    if-nez v0, :cond_2

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->V()LA2/J;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, LI2/e;->t:Lz2/f;

    .line 15
    .line 16
    invoke-virtual {v1}, Lz2/f;->m()V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, LI2/e;->t:Lz2/f;

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    invoke-virtual {p0, v0, v1, v2}, Landroidx/media3/exoplayer/h;->o0(LA2/J;Lz2/f;I)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, -0x5

    .line 27
    const/4 v3, 0x1

    .line 28
    if-ne v1, v2, :cond_1

    .line 29
    .line 30
    iget-object v0, v0, LA2/J;->b:Lq2/x;

    .line 31
    .line 32
    invoke-static {v0}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lq2/x;

    .line 37
    .line 38
    iput-object v0, p0, LI2/e;->C:Lq2/x;

    .line 39
    .line 40
    iput-boolean v3, p0, LI2/e;->Z:Z

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 p1, -0x4

    .line 44
    if-ne v1, p1, :cond_3

    .line 45
    .line 46
    iget-object p1, p0, LI2/e;->t:Lz2/f;

    .line 47
    .line 48
    invoke-virtual {p1}, Lz2/a;->q()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-static {p1}, Lt2/a;->g(Z)V

    .line 53
    .line 54
    .line 55
    iput-boolean v3, p0, LI2/e;->v:Z

    .line 56
    .line 57
    iput-boolean v3, p0, LI2/e;->w:Z

    .line 58
    .line 59
    return-void

    .line 60
    :cond_2
    :goto_0
    iget-object v0, p0, LI2/e;->D:LI2/b;

    .line 61
    .line 62
    if-nez v0, :cond_4

    .line 63
    .line 64
    invoke-direct {p0}, LI2/e;->z0()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_4

    .line 69
    .line 70
    :cond_3
    :goto_1
    return-void

    .line 71
    :cond_4
    :try_start_0
    const-string v0, "drainAndFeedDecoder"

    .line 72
    .line 73
    invoke-static {v0}, Lt2/P;->a(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :goto_2
    invoke-direct {p0, p1, p2, p3, p4}, LI2/e;->t0(JJ)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_5

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_5
    :goto_3
    invoke-direct {p0, p1, p2}, LI2/e;->u0(J)Z

    .line 84
    .line 85
    .line 86
    move-result p3

    .line 87
    if-eqz p3, :cond_6

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_6
    invoke-static {}, Lt2/P;->b()V
    :try_end_0
    .catch LI2/c; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :catch_0
    move-exception p1

    .line 95
    const/4 p2, 0x0

    .line 96
    const/16 p3, 0xfa3

    .line 97
    .line 98
    invoke-virtual {p0, p1, p2, p3}, Landroidx/media3/exoplayer/h;->R(Ljava/lang/Throwable;Lq2/x;I)Landroidx/media3/exoplayer/s;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    throw p1
.end method

.method protected g0(JZ)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    invoke-direct {p0, p1}, LI2/e;->x0(I)V

    .line 3
    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, LI2/e;->w:Z

    .line 7
    .line 8
    iput-boolean p1, p0, LI2/e;->v:Z

    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    iput-object p2, p0, LI2/e;->G:Landroid/graphics/Bitmap;

    .line 12
    .line 13
    iput-object p2, p0, LI2/e;->I:LI2/e$b;

    .line 14
    .line 15
    iput-object p2, p0, LI2/e;->X:LI2/e$b;

    .line 16
    .line 17
    iput-boolean p1, p0, LI2/e;->H:Z

    .line 18
    .line 19
    iput-object p2, p0, LI2/e;->E:Lz2/f;

    .line 20
    .line 21
    iget-object p1, p0, LI2/e;->D:LI2/b;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-interface {p1}, Lz2/d;->flush()V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object p1, p0, LI2/e;->u:Ljava/util/ArrayDeque;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "ImageRenderer"

    .line 2
    .line 3
    return-object v0
.end method

.method protected h0()V
    .locals 0

    .line 1
    invoke-direct {p0}, LI2/e;->D0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public isReady()Z
    .locals 2

    .line 1
    iget v0, p0, LI2/e;->B:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-boolean v0, p0, LI2/e;->H:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0

    .line 15
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 16
    return v0
.end method

.method protected j0()V
    .locals 1

    .line 1
    invoke-direct {p0}, LI2/e;->D0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-direct {p0, v0}, LI2/e;->x0(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method protected m0([Lq2/x;JJLM2/D$b;)V
    .locals 4

    .line 1
    invoke-super/range {p0 .. p6}, Landroidx/media3/exoplayer/h;->m0([Lq2/x;JJLM2/D$b;)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    iget-object p2, p1, LI2/e;->x:LI2/e$a;

    .line 6
    .line 7
    iget-wide p2, p2, LI2/e$a;->b:J

    .line 8
    .line 9
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long p2, p2, v0

    .line 15
    .line 16
    if-eqz p2, :cond_1

    .line 17
    .line 18
    iget-object p2, p1, LI2/e;->u:Ljava/util/ArrayDeque;

    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eqz p2, :cond_0

    .line 25
    .line 26
    iget-wide p2, p1, LI2/e;->z:J

    .line 27
    .line 28
    cmp-long p6, p2, v0

    .line 29
    .line 30
    if-eqz p6, :cond_1

    .line 31
    .line 32
    iget-wide v2, p1, LI2/e;->y:J

    .line 33
    .line 34
    cmp-long p6, v2, v0

    .line 35
    .line 36
    if-eqz p6, :cond_0

    .line 37
    .line 38
    cmp-long p2, v2, p2

    .line 39
    .line 40
    if-ltz p2, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget-object p2, p1, LI2/e;->u:Ljava/util/ArrayDeque;

    .line 44
    .line 45
    new-instance p3, LI2/e$a;

    .line 46
    .line 47
    iget-wide v0, p1, LI2/e;->z:J

    .line 48
    .line 49
    invoke-direct {p3, v0, v1, p4, p5}, LI2/e$a;-><init>(JJ)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2, p3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    :goto_0
    new-instance p2, LI2/e$a;

    .line 57
    .line 58
    invoke-direct {p2, v0, v1, p4, p5}, LI2/e$a;-><init>(JJ)V

    .line 59
    .line 60
    .line 61
    iput-object p2, p1, LI2/e;->x:LI2/e$a;

    .line 62
    .line 63
    return-void
.end method

.method public v(ILjava/lang/Object;)V
    .locals 1

    .line 1
    const/16 v0, 0xf

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1, p2}, Landroidx/media3/exoplayer/h;->v(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    instance-of p1, p2, Landroidx/media3/exoplayer/image/ImageOutput;

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    check-cast p2, Landroidx/media3/exoplayer/image/ImageOutput;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 p2, 0x0

    .line 17
    :goto_0
    invoke-direct {p0, p2}, LI2/e;->E0(Landroidx/media3/exoplayer/image/ImageOutput;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
