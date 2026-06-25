.class public final LO2/i;
.super Landroidx/media3/exoplayer/h;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field private A:Lr3/p;

.field private B:Lr3/p;

.field private C:I

.field private final D:Landroid/os/Handler;

.field private final E:LO2/h;

.field private final F:LA2/J;

.field private G:Z

.field private H:Z

.field private I:Lq2/x;

.field private X:J

.field private Y:J

.field private Z:Z

.field private final s:Lr3/a;

.field private final t:Lz2/f;

.field private u:LO2/a;

.field private final v:LO2/g;

.field private w:Z

.field private x:I

.field private y:Lr3/k;

.field private z:Lr3/o;


# direct methods
.method public constructor <init>(LO2/h;Landroid/os/Looper;)V
    .locals 1

    .line 1
    sget-object v0, LO2/g;->a:LO2/g;

    invoke-direct {p0, p1, p2, v0}, LO2/i;-><init>(LO2/h;Landroid/os/Looper;LO2/g;)V

    return-void
.end method

.method public constructor <init>(LO2/h;Landroid/os/Looper;LO2/g;)V
    .locals 1

    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/h;-><init>(I)V

    .line 3
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LO2/h;

    iput-object p1, p0, LO2/i;->E:LO2/h;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {p2, p0}, Lt2/a0;->B(Landroid/os/Looper;Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    :goto_0
    iput-object p1, p0, LO2/i;->D:Landroid/os/Handler;

    .line 5
    iput-object p3, p0, LO2/i;->v:LO2/g;

    .line 6
    new-instance p1, Lr3/a;

    invoke-direct {p1}, Lr3/a;-><init>()V

    iput-object p1, p0, LO2/i;->s:Lr3/a;

    .line 7
    new-instance p1, Lz2/f;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Lz2/f;-><init>(I)V

    iput-object p1, p0, LO2/i;->t:Lz2/f;

    .line 8
    new-instance p1, LA2/J;

    invoke-direct {p1}, LA2/J;-><init>()V

    iput-object p1, p0, LO2/i;->F:LA2/J;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    iput-wide p1, p0, LO2/i;->Y:J

    .line 10
    iput-wide p1, p0, LO2/i;->X:J

    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, LO2/i;->Z:Z

    return-void
.end method

.method private static A0(Lq2/x;)Z
    .locals 1

    .line 1
    iget-object p0, p0, Lq2/x;->o:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "application/x-media3-cues"

    .line 4
    .line 5
    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method private B0(J)Z
    .locals 7

    .line 1
    iget-boolean v0, p0, LO2/i;->G:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v0, p0, LO2/i;->F:LA2/J;

    .line 8
    .line 9
    iget-object v2, p0, LO2/i;->t:Lz2/f;

    .line 10
    .line 11
    invoke-virtual {p0, v0, v2, v1}, Landroidx/media3/exoplayer/h;->o0(LA2/J;Lz2/f;I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v2, -0x4

    .line 16
    if-eq v0, v2, :cond_1

    .line 17
    .line 18
    return v1

    .line 19
    :cond_1
    iget-object v0, p0, LO2/i;->t:Lz2/f;

    .line 20
    .line 21
    invoke-virtual {v0}, Lz2/a;->q()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    iput-boolean p1, p0, LO2/i;->G:Z

    .line 29
    .line 30
    return v1

    .line 31
    :cond_2
    iget-object v0, p0, LO2/i;->t:Lz2/f;

    .line 32
    .line 33
    invoke-virtual {v0}, Lz2/f;->y()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, LO2/i;->t:Lz2/f;

    .line 37
    .line 38
    iget-object v0, v0, Lz2/f;->d:Ljava/nio/ByteBuffer;

    .line 39
    .line 40
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 45
    .line 46
    iget-object v1, p0, LO2/i;->s:Lr3/a;

    .line 47
    .line 48
    iget-object v2, p0, LO2/i;->t:Lz2/f;

    .line 49
    .line 50
    iget-wide v2, v2, Lz2/f;->f:J

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    invoke-virtual/range {v1 .. v6}, Lr3/a;->a(J[BII)Lr3/d;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iget-object v1, p0, LO2/i;->t:Lz2/f;

    .line 69
    .line 70
    invoke-virtual {v1}, Lz2/f;->m()V

    .line 71
    .line 72
    .line 73
    iget-object v1, p0, LO2/i;->u:LO2/a;

    .line 74
    .line 75
    invoke-interface {v1, v0, p1, p2}, LO2/a;->a(Lr3/d;J)Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    return p1
.end method

.method private C0()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LO2/i;->z:Lr3/o;

    .line 3
    .line 4
    const/4 v1, -0x1

    .line 5
    iput v1, p0, LO2/i;->C:I

    .line 6
    .line 7
    iget-object v1, p0, LO2/i;->A:Lr3/p;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Lz2/g;->w()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, LO2/i;->A:Lr3/p;

    .line 15
    .line 16
    :cond_0
    iget-object v1, p0, LO2/i;->B:Lr3/p;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v1}, Lz2/g;->w()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, LO2/i;->B:Lr3/p;

    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method private D0()V
    .locals 1

    .line 1
    invoke-direct {p0}, LO2/i;->C0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LO2/i;->y:Lr3/k;

    .line 5
    .line 6
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lr3/k;

    .line 11
    .line 12
    invoke-interface {v0}, Lz2/d;->a()V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, LO2/i;->y:Lr3/k;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput v0, p0, LO2/i;->x:I

    .line 20
    .line 21
    return-void
.end method

.method private E0(J)V
    .locals 6

    .line 1
    invoke-direct {p0, p1, p2}, LO2/i;->B0(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, LO2/i;->u:LO2/a;

    .line 6
    .line 7
    iget-wide v2, p0, LO2/i;->X:J

    .line 8
    .line 9
    invoke-interface {v1, v2, v3}, LO2/a;->d(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    const-wide/high16 v3, -0x8000000000000000L

    .line 14
    .line 15
    cmp-long v3, v1, v3

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    iget-boolean v5, p0, LO2/i;->G:Z

    .line 21
    .line 22
    if-eqz v5, :cond_0

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    iput-boolean v4, p0, LO2/i;->H:Z

    .line 27
    .line 28
    :cond_0
    if-eqz v3, :cond_1

    .line 29
    .line 30
    cmp-long v1, v1, p1

    .line 31
    .line 32
    if-gtz v1, :cond_1

    .line 33
    .line 34
    move v0, v4

    .line 35
    :cond_1
    if-eqz v0, :cond_2

    .line 36
    .line 37
    iget-object v0, p0, LO2/i;->u:LO2/a;

    .line 38
    .line 39
    invoke-interface {v0, p1, p2}, LO2/a;->b(J)LP9/u;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v1, p0, LO2/i;->u:LO2/a;

    .line 44
    .line 45
    invoke-interface {v1, p1, p2}, LO2/a;->c(J)J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    new-instance v3, Ls2/e;

    .line 50
    .line 51
    invoke-direct {p0, v1, v2}, LO2/i;->v0(J)J

    .line 52
    .line 53
    .line 54
    move-result-wide v4

    .line 55
    invoke-direct {v3, v0, v4, v5}, Ls2/e;-><init>(Ljava/util/List;J)V

    .line 56
    .line 57
    .line 58
    invoke-direct {p0, v3}, LO2/i;->I0(Ls2/e;)V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, LO2/i;->u:LO2/a;

    .line 62
    .line 63
    invoke-interface {v0, v1, v2}, LO2/a;->e(J)V

    .line 64
    .line 65
    .line 66
    :cond_2
    iput-wide p1, p0, LO2/i;->X:J

    .line 67
    .line 68
    return-void
.end method

.method private F0(J)V
    .locals 10

    .line 1
    iput-wide p1, p0, LO2/i;->X:J

    .line 2
    .line 3
    iget-object v0, p0, LO2/i;->B:Lr3/p;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LO2/i;->y:Lr3/k;

    .line 8
    .line 9
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lr3/k;

    .line 14
    .line 15
    invoke-interface {v0, p1, p2}, Lr3/k;->c(J)V

    .line 16
    .line 17
    .line 18
    :try_start_0
    iget-object v0, p0, LO2/i;->y:Lr3/k;

    .line 19
    .line 20
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lr3/k;

    .line 25
    .line 26
    invoke-interface {v0}, Lz2/d;->b()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lr3/p;

    .line 31
    .line 32
    iput-object v0, p0, LO2/i;->B:Lr3/p;
    :try_end_0
    .catch Lr3/l; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catch_0
    move-exception p1

    .line 36
    invoke-direct {p0, p1}, LO2/i;->w0(Lr3/l;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    :goto_0
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->getState()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/4 v1, 0x2

    .line 45
    if-eq v0, v1, :cond_1

    .line 46
    .line 47
    goto/16 :goto_6

    .line 48
    .line 49
    :cond_1
    iget-object v0, p0, LO2/i;->A:Lr3/p;

    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    const/4 v3, 0x1

    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    invoke-direct {p0}, LO2/i;->u0()J

    .line 56
    .line 57
    .line 58
    move-result-wide v4

    .line 59
    move v0, v2

    .line 60
    :goto_1
    cmp-long v4, v4, p1

    .line 61
    .line 62
    if-gtz v4, :cond_3

    .line 63
    .line 64
    iget v0, p0, LO2/i;->C:I

    .line 65
    .line 66
    add-int/2addr v0, v3

    .line 67
    iput v0, p0, LO2/i;->C:I

    .line 68
    .line 69
    invoke-direct {p0}, LO2/i;->u0()J

    .line 70
    .line 71
    .line 72
    move-result-wide v4

    .line 73
    move v0, v3

    .line 74
    goto :goto_1

    .line 75
    :cond_2
    move v0, v2

    .line 76
    :cond_3
    iget-object v4, p0, LO2/i;->B:Lr3/p;

    .line 77
    .line 78
    const/4 v5, 0x0

    .line 79
    if-eqz v4, :cond_7

    .line 80
    .line 81
    invoke-virtual {v4}, Lz2/a;->q()Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-eqz v6, :cond_5

    .line 86
    .line 87
    if-nez v0, :cond_7

    .line 88
    .line 89
    invoke-direct {p0}, LO2/i;->u0()J

    .line 90
    .line 91
    .line 92
    move-result-wide v6

    .line 93
    const-wide v8, 0x7fffffffffffffffL

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    cmp-long v4, v6, v8

    .line 99
    .line 100
    if-nez v4, :cond_7

    .line 101
    .line 102
    iget v4, p0, LO2/i;->x:I

    .line 103
    .line 104
    if-ne v4, v1, :cond_4

    .line 105
    .line 106
    invoke-direct {p0}, LO2/i;->G0()V

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_4
    invoke-direct {p0}, LO2/i;->C0()V

    .line 111
    .line 112
    .line 113
    iput-boolean v3, p0, LO2/i;->H:Z

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_5
    iget-wide v6, v4, Lz2/g;->b:J

    .line 117
    .line 118
    cmp-long v6, v6, p1

    .line 119
    .line 120
    if-gtz v6, :cond_7

    .line 121
    .line 122
    iget-object v0, p0, LO2/i;->A:Lr3/p;

    .line 123
    .line 124
    if-eqz v0, :cond_6

    .line 125
    .line 126
    invoke-virtual {v0}, Lz2/g;->w()V

    .line 127
    .line 128
    .line 129
    :cond_6
    invoke-virtual {v4, p1, p2}, Lr3/p;->a(J)I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    iput v0, p0, LO2/i;->C:I

    .line 134
    .line 135
    iput-object v4, p0, LO2/i;->A:Lr3/p;

    .line 136
    .line 137
    iput-object v5, p0, LO2/i;->B:Lr3/p;

    .line 138
    .line 139
    move v0, v3

    .line 140
    :cond_7
    :goto_2
    if-eqz v0, :cond_8

    .line 141
    .line 142
    iget-object v0, p0, LO2/i;->A:Lr3/p;

    .line 143
    .line 144
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    invoke-direct {p0, p1, p2}, LO2/i;->t0(J)J

    .line 148
    .line 149
    .line 150
    move-result-wide v6

    .line 151
    invoke-direct {p0, v6, v7}, LO2/i;->v0(J)J

    .line 152
    .line 153
    .line 154
    move-result-wide v6

    .line 155
    new-instance v0, Ls2/e;

    .line 156
    .line 157
    iget-object v4, p0, LO2/i;->A:Lr3/p;

    .line 158
    .line 159
    invoke-virtual {v4, p1, p2}, Lr3/p;->b(J)Ljava/util/List;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-direct {v0, p1, v6, v7}, Ls2/e;-><init>(Ljava/util/List;J)V

    .line 164
    .line 165
    .line 166
    invoke-direct {p0, v0}, LO2/i;->I0(Ls2/e;)V

    .line 167
    .line 168
    .line 169
    :cond_8
    iget p1, p0, LO2/i;->x:I

    .line 170
    .line 171
    if-ne p1, v1, :cond_9

    .line 172
    .line 173
    goto/16 :goto_6

    .line 174
    .line 175
    :cond_9
    :goto_3
    :try_start_1
    iget-boolean p1, p0, LO2/i;->G:Z

    .line 176
    .line 177
    if-nez p1, :cond_10

    .line 178
    .line 179
    iget-object p1, p0, LO2/i;->z:Lr3/o;

    .line 180
    .line 181
    if-nez p1, :cond_b

    .line 182
    .line 183
    iget-object p1, p0, LO2/i;->y:Lr3/k;

    .line 184
    .line 185
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    check-cast p1, Lr3/k;

    .line 190
    .line 191
    invoke-interface {p1}, Lz2/d;->g()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    check-cast p1, Lr3/o;

    .line 196
    .line 197
    if-nez p1, :cond_a

    .line 198
    .line 199
    goto :goto_6

    .line 200
    :cond_a
    iput-object p1, p0, LO2/i;->z:Lr3/o;

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :catch_1
    move-exception p1

    .line 204
    goto :goto_7

    .line 205
    :cond_b
    :goto_4
    iget p2, p0, LO2/i;->x:I

    .line 206
    .line 207
    if-ne p2, v3, :cond_c

    .line 208
    .line 209
    const/4 p2, 0x4

    .line 210
    invoke-virtual {p1, p2}, Lz2/a;->v(I)V

    .line 211
    .line 212
    .line 213
    iget-object p2, p0, LO2/i;->y:Lr3/k;

    .line 214
    .line 215
    invoke-static {p2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p2

    .line 219
    check-cast p2, Lr3/k;

    .line 220
    .line 221
    invoke-interface {p2, p1}, Lz2/d;->e(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    iput-object v5, p0, LO2/i;->z:Lr3/o;

    .line 225
    .line 226
    iput v1, p0, LO2/i;->x:I

    .line 227
    .line 228
    return-void

    .line 229
    :cond_c
    iget-object p2, p0, LO2/i;->F:LA2/J;

    .line 230
    .line 231
    invoke-virtual {p0, p2, p1, v2}, Landroidx/media3/exoplayer/h;->o0(LA2/J;Lz2/f;I)I

    .line 232
    .line 233
    .line 234
    move-result p2

    .line 235
    const/4 v0, -0x4

    .line 236
    if-ne p2, v0, :cond_f

    .line 237
    .line 238
    invoke-virtual {p1}, Lz2/a;->q()Z

    .line 239
    .line 240
    .line 241
    move-result p2

    .line 242
    if-eqz p2, :cond_d

    .line 243
    .line 244
    iput-boolean v3, p0, LO2/i;->G:Z

    .line 245
    .line 246
    iput-boolean v2, p0, LO2/i;->w:Z

    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_d
    iget-object p2, p0, LO2/i;->F:LA2/J;

    .line 250
    .line 251
    iget-object p2, p2, LA2/J;->b:Lq2/x;

    .line 252
    .line 253
    if-nez p2, :cond_e

    .line 254
    .line 255
    goto :goto_6

    .line 256
    :cond_e
    iget-wide v6, p2, Lq2/x;->t:J

    .line 257
    .line 258
    iput-wide v6, p1, Lr3/o;->j:J

    .line 259
    .line 260
    invoke-virtual {p1}, Lz2/f;->y()V

    .line 261
    .line 262
    .line 263
    iget-boolean p2, p0, LO2/i;->w:Z

    .line 264
    .line 265
    invoke-virtual {p1}, Lz2/a;->s()Z

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    xor-int/2addr v0, v3

    .line 270
    and-int/2addr p2, v0

    .line 271
    iput-boolean p2, p0, LO2/i;->w:Z

    .line 272
    .line 273
    :goto_5
    iget-boolean p2, p0, LO2/i;->w:Z

    .line 274
    .line 275
    if-nez p2, :cond_9

    .line 276
    .line 277
    iget-object p2, p0, LO2/i;->y:Lr3/k;

    .line 278
    .line 279
    invoke-static {p2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object p2

    .line 283
    check-cast p2, Lr3/k;

    .line 284
    .line 285
    invoke-interface {p2, p1}, Lz2/d;->e(Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    iput-object v5, p0, LO2/i;->z:Lr3/o;
    :try_end_1
    .catch Lr3/l; {:try_start_1 .. :try_end_1} :catch_1

    .line 289
    .line 290
    goto :goto_3

    .line 291
    :cond_f
    const/4 p1, -0x3

    .line 292
    if-ne p2, p1, :cond_9

    .line 293
    .line 294
    :cond_10
    :goto_6
    return-void

    .line 295
    :goto_7
    invoke-direct {p0, p1}, LO2/i;->w0(Lr3/l;)V

    .line 296
    .line 297
    .line 298
    return-void
.end method

.method private G0()V
    .locals 0

    .line 1
    invoke-direct {p0}, LO2/i;->D0()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, LO2/i;->y0()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private I0(Ls2/e;)V
    .locals 2

    .line 1
    iget-object v0, p0, LO2/i;->D:Landroid/os/Handler;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-direct {p0, p1}, LO2/i;->z0(Ls2/e;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private r0()V
    .locals 3

    .line 1
    iget-boolean v0, p0, LO2/i;->Z:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, LO2/i;->I:Lq2/x;

    .line 6
    .line 7
    iget-object v0, v0, Lq2/x;->o:Ljava/lang/String;

    .line 8
    .line 9
    const-string v1, "application/cea-608"

    .line 10
    .line 11
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, LO2/i;->I:Lq2/x;

    .line 18
    .line 19
    iget-object v0, v0, Lq2/x;->o:Ljava/lang/String;

    .line 20
    .line 21
    const-string v1, "application/x-mp4-cea-608"

    .line 22
    .line 23
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, LO2/i;->I:Lq2/x;

    .line 30
    .line 31
    iget-object v0, v0, Lq2/x;->o:Ljava/lang/String;

    .line 32
    .line 33
    const-string v1, "application/cea-708"

    .line 34
    .line 35
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v0, 0x0

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 45
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    const-string v2, "Legacy decoding is disabled, can\'t handle "

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-object v2, p0, LO2/i;->I:Lq2/x;

    .line 56
    .line 57
    iget-object v2, v2, Lq2/x;->o:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v2, " samples (expected "

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v2, "application/x-media3-cues"

    .line 68
    .line 69
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v2, ")."

    .line 73
    .line 74
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-static {v0, v1}, Lt2/a;->h(ZLjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method private s0()V
    .locals 4

    .line 1
    new-instance v0, Ls2/e;

    .line 2
    .line 3
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-wide v2, p0, LO2/i;->X:J

    .line 8
    .line 9
    invoke-direct {p0, v2, v3}, LO2/i;->v0(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    invoke-direct {v0, v1, v2, v3}, Ls2/e;-><init>(Ljava/util/List;J)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0}, LO2/i;->I0(Ls2/e;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private t0(J)J
    .locals 1

    .line 1
    iget-object v0, p0, LO2/i;->A:Lr3/p;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lr3/p;->a(J)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_2

    .line 8
    .line 9
    iget-object p2, p0, LO2/i;->A:Lr3/p;

    .line 10
    .line 11
    invoke-virtual {p2}, Lr3/p;->h()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p2, -0x1

    .line 19
    if-ne p1, p2, :cond_1

    .line 20
    .line 21
    iget-object p1, p0, LO2/i;->A:Lr3/p;

    .line 22
    .line 23
    invoke-virtual {p1}, Lr3/p;->h()I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    add-int/lit8 p2, p2, -0x1

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Lr3/p;->c(I)J

    .line 30
    .line 31
    .line 32
    move-result-wide p1

    .line 33
    return-wide p1

    .line 34
    :cond_1
    iget-object p2, p0, LO2/i;->A:Lr3/p;

    .line 35
    .line 36
    add-int/lit8 p1, p1, -0x1

    .line 37
    .line 38
    invoke-virtual {p2, p1}, Lr3/p;->c(I)J

    .line 39
    .line 40
    .line 41
    move-result-wide p1

    .line 42
    return-wide p1

    .line 43
    :cond_2
    :goto_0
    iget-object p1, p0, LO2/i;->A:Lr3/p;

    .line 44
    .line 45
    iget-wide p1, p1, Lz2/g;->b:J

    .line 46
    .line 47
    return-wide p1
.end method

.method private u0()J
    .locals 4

    .line 1
    iget v0, p0, LO2/i;->C:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const-wide v2, 0x7fffffffffffffffL

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    return-wide v2

    .line 12
    :cond_0
    iget-object v0, p0, LO2/i;->A:Lr3/p;

    .line 13
    .line 14
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    iget v0, p0, LO2/i;->C:I

    .line 18
    .line 19
    iget-object v1, p0, LO2/i;->A:Lr3/p;

    .line 20
    .line 21
    invoke-virtual {v1}, Lr3/p;->h()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-lt v0, v1, :cond_1

    .line 26
    .line 27
    return-wide v2

    .line 28
    :cond_1
    iget-object v0, p0, LO2/i;->A:Lr3/p;

    .line 29
    .line 30
    iget v1, p0, LO2/i;->C:I

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lr3/p;->c(I)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    return-wide v0
.end method

.method private v0(J)J
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v0, p1, v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->a0()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    sub-long/2addr p1, v0

    .line 21
    return-wide p1
.end method

.method private w0(Lr3/l;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Subtitle decoding failed. streamFormat="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LO2/i;->I:Lq2/x;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "TextRenderer"

    .line 21
    .line 22
    invoke-static {v1, v0, p1}, Lt2/w;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, LO2/i;->s0()V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0}, LO2/i;->G0()V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method private static x0(Lr3/j;J)Z
    .locals 4

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-interface {p0}, Lr3/j;->h()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    invoke-interface {p0}, Lr3/j;->h()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    sub-int/2addr v0, v1

    .line 15
    invoke-interface {p0, v0}, Lr3/j;->c(I)J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    cmp-long p0, v2, p1

    .line 20
    .line 21
    if-lez p0, :cond_0

    .line 22
    .line 23
    return v1

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method private y0()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LO2/i;->w:Z

    .line 3
    .line 4
    iget-object v0, p0, LO2/i;->v:LO2/g;

    .line 5
    .line 6
    iget-object v1, p0, LO2/i;->I:Lq2/x;

    .line 7
    .line 8
    invoke-static {v1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lq2/x;

    .line 13
    .line 14
    invoke-interface {v0, v1}, LO2/g;->a(Lq2/x;)Lr3/k;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, LO2/i;->y:Lr3/k;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->X()J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    invoke-interface {v0, v1, v2}, Lz2/d;->f(J)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private z0(Ls2/e;)V
    .locals 2

    .line 1
    iget-object v0, p0, LO2/i;->E:LO2/h;

    .line 2
    .line 3
    iget-object v1, p1, Ls2/e;->a:LP9/u;

    .line 4
    .line 5
    invoke-interface {v0, v1}, LO2/h;->p(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LO2/i;->E:LO2/h;

    .line 9
    .line 10
    invoke-interface {v0, p1}, LO2/h;->t(Ls2/e;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public H0(J)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->A()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 6
    .line 7
    .line 8
    iput-wide p1, p0, LO2/i;->Y:J

    .line 9
    .line 10
    return-void
.end method

.method public b(Lq2/x;)I
    .locals 1

    .line 1
    invoke-static {p1}, LO2/i;->A0(Lq2/x;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, LO2/i;->v:LO2/g;

    .line 8
    .line 9
    invoke-interface {v0, p1}, LO2/g;->b(Lq2/x;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p1, p1, Lq2/x;->o:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {p1}, Lq2/K;->s(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    invoke-static {p1}, Landroidx/media3/exoplayer/O0;->t(I)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1

    .line 30
    :cond_1
    const/4 p1, 0x0

    .line 31
    invoke-static {p1}, Landroidx/media3/exoplayer/O0;->t(I)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    return p1

    .line 36
    :cond_2
    :goto_0
    iget p1, p1, Lq2/x;->P:I

    .line 37
    .line 38
    if-nez p1, :cond_3

    .line 39
    .line 40
    const/4 p1, 0x4

    .line 41
    goto :goto_1

    .line 42
    :cond_3
    const/4 p1, 0x2

    .line 43
    :goto_1
    invoke-static {p1}, Landroidx/media3/exoplayer/O0;->t(I)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    return p1
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LO2/i;->H:Z

    .line 2
    .line 3
    return v0
.end method

.method protected d0()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LO2/i;->I:Lq2/x;

    .line 3
    .line 4
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v0, p0, LO2/i;->Y:J

    .line 10
    .line 11
    invoke-direct {p0}, LO2/i;->s0()V

    .line 12
    .line 13
    .line 14
    iput-wide v0, p0, LO2/i;->X:J

    .line 15
    .line 16
    iget-object v0, p0, LO2/i;->y:Lr3/k;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-direct {p0}, LO2/i;->D0()V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public g(JJ)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->A()Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    iget-wide p3, p0, LO2/i;->Y:J

    .line 8
    .line 9
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v0, p3, v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    cmp-long p3, p1, p3

    .line 19
    .line 20
    if-ltz p3, :cond_0

    .line 21
    .line 22
    invoke-direct {p0}, LO2/i;->C0()V

    .line 23
    .line 24
    .line 25
    const/4 p3, 0x1

    .line 26
    iput-boolean p3, p0, LO2/i;->H:Z

    .line 27
    .line 28
    :cond_0
    iget-boolean p3, p0, LO2/i;->H:Z

    .line 29
    .line 30
    if-eqz p3, :cond_1

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    iget-object p3, p0, LO2/i;->I:Lq2/x;

    .line 34
    .line 35
    invoke-static {p3}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    check-cast p3, Lq2/x;

    .line 40
    .line 41
    invoke-static {p3}, LO2/i;->A0(Lq2/x;)Z

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    if-eqz p3, :cond_2

    .line 46
    .line 47
    iget-object p3, p0, LO2/i;->u:LO2/a;

    .line 48
    .line 49
    invoke-static {p3}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    invoke-direct {p0, p1, p2}, LO2/i;->E0(J)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_2
    invoke-direct {p0}, LO2/i;->r0()V

    .line 57
    .line 58
    .line 59
    invoke-direct {p0, p1, p2}, LO2/i;->F0(J)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method protected g0(JZ)V
    .locals 0

    .line 1
    iput-wide p1, p0, LO2/i;->X:J

    .line 2
    .line 3
    iget-object p1, p0, LO2/i;->u:LO2/a;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, LO2/a;->clear()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-direct {p0}, LO2/i;->s0()V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput-boolean p1, p0, LO2/i;->G:Z

    .line 15
    .line 16
    iput-boolean p1, p0, LO2/i;->H:Z

    .line 17
    .line 18
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    iput-wide p1, p0, LO2/i;->Y:J

    .line 24
    .line 25
    iget-object p1, p0, LO2/i;->I:Lq2/x;

    .line 26
    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    invoke-static {p1}, LO2/i;->A0(Lq2/x;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-nez p1, :cond_2

    .line 34
    .line 35
    iget p1, p0, LO2/i;->x:I

    .line 36
    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    invoke-direct {p0}, LO2/i;->G0()V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    invoke-direct {p0}, LO2/i;->C0()V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, LO2/i;->y:Lr3/k;

    .line 47
    .line 48
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Lr3/k;

    .line 53
    .line 54
    invoke-interface {p1}, Lz2/d;->flush()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->X()J

    .line 58
    .line 59
    .line 60
    move-result-wide p2

    .line 61
    invoke-interface {p1, p2, p3}, Lz2/d;->f(J)V

    .line 62
    .line 63
    .line 64
    :cond_2
    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "TextRenderer"

    .line 2
    .line 3
    return-object v0
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 2

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Ls2/e;

    .line 9
    .line 10
    invoke-direct {p0, p1}, LO2/i;->z0(Ls2/e;)V

    .line 11
    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw p1
.end method

.method public isReady()Z
    .locals 7

    .line 1
    iget-object v0, p0, LO2/i;->I:Lq2/x;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lq2/x;

    .line 12
    .line 13
    invoke-static {v0}, LO2/i;->A0(Lq2/x;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    iget-object v0, p0, LO2/i;->u:LO2/a;

    .line 21
    .line 22
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, LO2/a;

    .line 27
    .line 28
    iget-wide v3, p0, LO2/i;->X:J

    .line 29
    .line 30
    invoke-interface {v0, v3, v4}, LO2/a;->d(J)J

    .line 31
    .line 32
    .line 33
    move-result-wide v3

    .line 34
    const-wide/high16 v5, -0x8000000000000000L

    .line 35
    .line 36
    cmp-long v0, v3, v5

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    return v1

    .line 41
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->x()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    return v1

    .line 45
    :catch_0
    return v2

    .line 46
    :cond_2
    iget-boolean v0, p0, LO2/i;->H:Z

    .line 47
    .line 48
    if-nez v0, :cond_4

    .line 49
    .line 50
    iget-boolean v0, p0, LO2/i;->G:Z

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    iget-object v0, p0, LO2/i;->A:Lr3/p;

    .line 55
    .line 56
    iget-wide v3, p0, LO2/i;->X:J

    .line 57
    .line 58
    invoke-static {v0, v3, v4}, LO2/i;->x0(Lr3/j;J)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_3

    .line 63
    .line 64
    iget-object v0, p0, LO2/i;->B:Lr3/p;

    .line 65
    .line 66
    iget-wide v3, p0, LO2/i;->X:J

    .line 67
    .line 68
    invoke-static {v0, v3, v4}, LO2/i;->x0(Lr3/j;J)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_3

    .line 73
    .line 74
    iget-object v0, p0, LO2/i;->z:Lr3/o;

    .line 75
    .line 76
    if-nez v0, :cond_4

    .line 77
    .line 78
    :cond_3
    return v1

    .line 79
    :cond_4
    return v2
.end method

.method protected m0([Lq2/x;JJLM2/D$b;)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    .line 2
    aget-object p1, p1, p2

    .line 3
    .line 4
    iput-object p1, p0, LO2/i;->I:Lq2/x;

    .line 5
    .line 6
    invoke-static {p1}, LO2/i;->A0(Lq2/x;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const/4 p2, 0x1

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    invoke-direct {p0}, LO2/i;->r0()V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, LO2/i;->y:Lr3/k;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    iput p2, p0, LO2/i;->x:I

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-direct {p0}, LO2/i;->y0()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    iget-object p1, p0, LO2/i;->I:Lq2/x;

    .line 28
    .line 29
    iget p1, p1, Lq2/x;->M:I

    .line 30
    .line 31
    if-ne p1, p2, :cond_2

    .line 32
    .line 33
    new-instance p1, LO2/e;

    .line 34
    .line 35
    invoke-direct {p1}, LO2/e;-><init>()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    new-instance p1, LO2/f;

    .line 40
    .line 41
    invoke-direct {p1}, LO2/f;-><init>()V

    .line 42
    .line 43
    .line 44
    :goto_0
    iput-object p1, p0, LO2/i;->u:LO2/a;

    .line 45
    .line 46
    return-void
.end method
