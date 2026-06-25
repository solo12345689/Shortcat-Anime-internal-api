.class final Landroidx/media3/exoplayer/hls/l;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LQ2/m$b;
.implements LQ2/m$f;
.implements LM2/d0;
.implements LU2/r;
.implements LM2/b0$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/hls/l$b;,
        Landroidx/media3/exoplayer/hls/l$d;,
        Landroidx/media3/exoplayer/hls/l$c;
    }
.end annotation


# static fields
.field private static final x0:Ljava/util/Set;


# instance fields
.field private A:I

.field private B:I

.field private C:Z

.field private D:Z

.field private E:I

.field private F:Lq2/x;

.field private G:Lq2/x;

.field private H:Z

.field private I:LM2/n0;

.field private X:Ljava/util/Set;

.field private Y:[I

.field private Z:I

.field private final a:Ljava/lang/String;

.field private final b:I

.field private final c:Landroidx/media3/exoplayer/hls/l$b;

.field private final d:Landroidx/media3/exoplayer/hls/c;

.field private final e:LQ2/b;

.field private final f:Lq2/x;

.field private final g:LF2/u;

.field private final h:LF2/t$a;

.field private final i:LQ2/k;

.field private final j:LQ2/m;

.field private final k:LM2/L$a;

.field private final l:I

.field private l0:Z

.field private final m:Landroidx/media3/exoplayer/hls/c$b;

.field private m0:[Z

.field private final n:Ljava/util/ArrayList;

.field private n0:[Z

.field private final o:Ljava/util/List;

.field private o0:J

.field private final p:Ljava/lang/Runnable;

.field private p0:J

.field private final q:Ljava/lang/Runnable;

.field private q0:Z

.field private final r:Landroid/os/Handler;

.field private r0:Z

.field private final s:Ljava/util/ArrayList;

.field private s0:Z

.field private final t:Ljava/util/Map;

.field private t0:Z

.field private u:LN2/e;

.field private u0:J

.field private v:[Landroidx/media3/exoplayer/hls/l$d;

.field private v0:Lq2/q;

.field private w:[I

.field private w0:Landroidx/media3/exoplayer/hls/e;

.field private x:Ljava/util/Set;

.field private y:Landroid/util/SparseIntArray;

.field private z:LU2/O;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/4 v2, 0x2

    .line 9
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x5

    .line 14
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    filled-new-array {v1, v2, v3}, [Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Landroidx/media3/exoplayer/hls/l;->x0:Ljava/util/Set;

    .line 34
    .line 35
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILandroidx/media3/exoplayer/hls/l$b;Landroidx/media3/exoplayer/hls/c;Ljava/util/Map;LQ2/b;JLq2/x;LF2/u;LF2/t$a;LQ2/k;LM2/L$a;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Landroidx/media3/exoplayer/hls/l;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/media3/exoplayer/hls/l;->c:Landroidx/media3/exoplayer/hls/l$b;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/media3/exoplayer/hls/l;->d:Landroidx/media3/exoplayer/hls/c;

    .line 11
    .line 12
    iput-object p5, p0, Landroidx/media3/exoplayer/hls/l;->t:Ljava/util/Map;

    .line 13
    .line 14
    iput-object p6, p0, Landroidx/media3/exoplayer/hls/l;->e:LQ2/b;

    .line 15
    .line 16
    iput-object p9, p0, Landroidx/media3/exoplayer/hls/l;->f:Lq2/x;

    .line 17
    .line 18
    iput-object p10, p0, Landroidx/media3/exoplayer/hls/l;->g:LF2/u;

    .line 19
    .line 20
    iput-object p11, p0, Landroidx/media3/exoplayer/hls/l;->h:LF2/t$a;

    .line 21
    .line 22
    iput-object p12, p0, Landroidx/media3/exoplayer/hls/l;->i:LQ2/k;

    .line 23
    .line 24
    iput-object p13, p0, Landroidx/media3/exoplayer/hls/l;->k:LM2/L$a;

    .line 25
    .line 26
    iput p14, p0, Landroidx/media3/exoplayer/hls/l;->l:I

    .line 27
    .line 28
    new-instance p1, LQ2/m;

    .line 29
    .line 30
    const-string p2, "Loader:HlsSampleStreamWrapper"

    .line 31
    .line 32
    invoke-direct {p1, p2}, LQ2/m;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->j:LQ2/m;

    .line 36
    .line 37
    new-instance p1, Landroidx/media3/exoplayer/hls/c$b;

    .line 38
    .line 39
    invoke-direct {p1}, Landroidx/media3/exoplayer/hls/c$b;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->m:Landroidx/media3/exoplayer/hls/c$b;

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    new-array p2, p1, [I

    .line 46
    .line 47
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/l;->w:[I

    .line 48
    .line 49
    new-instance p2, Ljava/util/HashSet;

    .line 50
    .line 51
    sget-object p3, Landroidx/media3/exoplayer/hls/l;->x0:Ljava/util/Set;

    .line 52
    .line 53
    invoke-interface {p3}, Ljava/util/Set;->size()I

    .line 54
    .line 55
    .line 56
    move-result p4

    .line 57
    invoke-direct {p2, p4}, Ljava/util/HashSet;-><init>(I)V

    .line 58
    .line 59
    .line 60
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/l;->x:Ljava/util/Set;

    .line 61
    .line 62
    new-instance p2, Landroid/util/SparseIntArray;

    .line 63
    .line 64
    invoke-interface {p3}, Ljava/util/Set;->size()I

    .line 65
    .line 66
    .line 67
    move-result p3

    .line 68
    invoke-direct {p2, p3}, Landroid/util/SparseIntArray;-><init>(I)V

    .line 69
    .line 70
    .line 71
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/l;->y:Landroid/util/SparseIntArray;

    .line 72
    .line 73
    new-array p2, p1, [Landroidx/media3/exoplayer/hls/l$d;

    .line 74
    .line 75
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 76
    .line 77
    new-array p2, p1, [Z

    .line 78
    .line 79
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/l;->n0:[Z

    .line 80
    .line 81
    new-array p1, p1, [Z

    .line 82
    .line 83
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->m0:[Z

    .line 84
    .line 85
    new-instance p1, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 88
    .line 89
    .line 90
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->o:Ljava/util/List;

    .line 97
    .line 98
    new-instance p1, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 101
    .line 102
    .line 103
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->s:Ljava/util/ArrayList;

    .line 104
    .line 105
    new-instance p1, Landroidx/media3/exoplayer/hls/j;

    .line 106
    .line 107
    invoke-direct {p1, p0}, Landroidx/media3/exoplayer/hls/j;-><init>(Landroidx/media3/exoplayer/hls/l;)V

    .line 108
    .line 109
    .line 110
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->p:Ljava/lang/Runnable;

    .line 111
    .line 112
    new-instance p1, Landroidx/media3/exoplayer/hls/k;

    .line 113
    .line 114
    invoke-direct {p1, p0}, Landroidx/media3/exoplayer/hls/k;-><init>(Landroidx/media3/exoplayer/hls/l;)V

    .line 115
    .line 116
    .line 117
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->q:Ljava/lang/Runnable;

    .line 118
    .line 119
    invoke-static {}, Lt2/a0;->C()Landroid/os/Handler;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->r:Landroid/os/Handler;

    .line 124
    .line 125
    iput-wide p7, p0, Landroidx/media3/exoplayer/hls/l;->o0:J

    .line 126
    .line 127
    iput-wide p7, p0, Landroidx/media3/exoplayer/hls/l;->p0:J

    .line 128
    .line 129
    return-void
.end method

.method private B()V
    .locals 15

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, -0x2

    .line 5
    const/4 v2, -0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    move v5, v1

    .line 8
    move v6, v2

    .line 9
    move v4, v3

    .line 10
    :goto_0
    const/4 v7, 0x2

    .line 11
    const/4 v8, 0x1

    .line 12
    if-ge v4, v0, :cond_5

    .line 13
    .line 14
    iget-object v9, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 15
    .line 16
    aget-object v9, v9, v4

    .line 17
    .line 18
    invoke-virtual {v9}, LM2/b0;->I()Lq2/x;

    .line 19
    .line 20
    .line 21
    move-result-object v9

    .line 22
    invoke-static {v9}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v9

    .line 26
    check-cast v9, Lq2/x;

    .line 27
    .line 28
    iget-object v9, v9, Lq2/x;->o:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v9}, Lq2/K;->t(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v10

    .line 34
    if-eqz v10, :cond_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    invoke-static {v9}, Lq2/K;->o(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    if-eqz v7, :cond_1

    .line 42
    .line 43
    move v7, v8

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-static {v9}, Lq2/K;->s(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    if-eqz v7, :cond_2

    .line 50
    .line 51
    const/4 v7, 0x3

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    move v7, v1

    .line 54
    :goto_1
    invoke-static {v7}, Landroidx/media3/exoplayer/hls/l;->O(I)I

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    invoke-static {v5}, Landroidx/media3/exoplayer/hls/l;->O(I)I

    .line 59
    .line 60
    .line 61
    move-result v9

    .line 62
    if-le v8, v9, :cond_3

    .line 63
    .line 64
    move v6, v4

    .line 65
    move v5, v7

    .line 66
    goto :goto_2

    .line 67
    :cond_3
    if-ne v7, v5, :cond_4

    .line 68
    .line 69
    if-eq v6, v2, :cond_4

    .line 70
    .line 71
    move v6, v2

    .line 72
    :cond_4
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_5
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->d:Landroidx/media3/exoplayer/hls/c;

    .line 76
    .line 77
    invoke-virtual {v1}, Landroidx/media3/exoplayer/hls/c;->l()Lq2/a0;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    iget v4, v1, Lq2/a0;->a:I

    .line 82
    .line 83
    iput v2, p0, Landroidx/media3/exoplayer/hls/l;->Z:I

    .line 84
    .line 85
    new-array v2, v0, [I

    .line 86
    .line 87
    iput-object v2, p0, Landroidx/media3/exoplayer/hls/l;->Y:[I

    .line 88
    .line 89
    move v2, v3

    .line 90
    :goto_3
    if-ge v2, v0, :cond_6

    .line 91
    .line 92
    iget-object v9, p0, Landroidx/media3/exoplayer/hls/l;->Y:[I

    .line 93
    .line 94
    aput v2, v9, v2

    .line 95
    .line 96
    add-int/lit8 v2, v2, 0x1

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_6
    new-array v2, v0, [Lq2/a0;

    .line 100
    .line 101
    move v9, v3

    .line 102
    :goto_4
    if-ge v9, v0, :cond_d

    .line 103
    .line 104
    iget-object v10, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 105
    .line 106
    aget-object v10, v10, v9

    .line 107
    .line 108
    invoke-virtual {v10}, LM2/b0;->I()Lq2/x;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    invoke-static {v10}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    check-cast v10, Lq2/x;

    .line 117
    .line 118
    if-ne v9, v6, :cond_a

    .line 119
    .line 120
    new-array v11, v4, [Lq2/x;

    .line 121
    .line 122
    move v12, v3

    .line 123
    :goto_5
    if-ge v12, v4, :cond_9

    .line 124
    .line 125
    invoke-virtual {v1, v12}, Lq2/a0;->c(I)Lq2/x;

    .line 126
    .line 127
    .line 128
    move-result-object v13

    .line 129
    if-ne v5, v8, :cond_7

    .line 130
    .line 131
    iget-object v14, p0, Landroidx/media3/exoplayer/hls/l;->f:Lq2/x;

    .line 132
    .line 133
    if-eqz v14, :cond_7

    .line 134
    .line 135
    invoke-virtual {v13, v14}, Lq2/x;->m(Lq2/x;)Lq2/x;

    .line 136
    .line 137
    .line 138
    move-result-object v13

    .line 139
    :cond_7
    if-ne v4, v8, :cond_8

    .line 140
    .line 141
    invoke-virtual {v10, v13}, Lq2/x;->m(Lq2/x;)Lq2/x;

    .line 142
    .line 143
    .line 144
    move-result-object v13

    .line 145
    goto :goto_6

    .line 146
    :cond_8
    invoke-static {v13, v10, v8}, Landroidx/media3/exoplayer/hls/l;->H(Lq2/x;Lq2/x;Z)Lq2/x;

    .line 147
    .line 148
    .line 149
    move-result-object v13

    .line 150
    :goto_6
    aput-object v13, v11, v12

    .line 151
    .line 152
    add-int/lit8 v12, v12, 0x1

    .line 153
    .line 154
    goto :goto_5

    .line 155
    :cond_9
    new-instance v10, Lq2/a0;

    .line 156
    .line 157
    iget-object v12, p0, Landroidx/media3/exoplayer/hls/l;->a:Ljava/lang/String;

    .line 158
    .line 159
    invoke-direct {v10, v12, v11}, Lq2/a0;-><init>(Ljava/lang/String;[Lq2/x;)V

    .line 160
    .line 161
    .line 162
    aput-object v10, v2, v9

    .line 163
    .line 164
    iput v9, p0, Landroidx/media3/exoplayer/hls/l;->Z:I

    .line 165
    .line 166
    goto :goto_9

    .line 167
    :cond_a
    if-ne v5, v7, :cond_b

    .line 168
    .line 169
    iget-object v11, v10, Lq2/x;->o:Ljava/lang/String;

    .line 170
    .line 171
    invoke-static {v11}, Lq2/K;->o(Ljava/lang/String;)Z

    .line 172
    .line 173
    .line 174
    move-result v11

    .line 175
    if-eqz v11, :cond_b

    .line 176
    .line 177
    iget-object v11, p0, Landroidx/media3/exoplayer/hls/l;->f:Lq2/x;

    .line 178
    .line 179
    goto :goto_7

    .line 180
    :cond_b
    const/4 v11, 0x0

    .line 181
    :goto_7
    new-instance v12, Ljava/lang/StringBuilder;

    .line 182
    .line 183
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 184
    .line 185
    .line 186
    iget-object v13, p0, Landroidx/media3/exoplayer/hls/l;->a:Ljava/lang/String;

    .line 187
    .line 188
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    const-string v13, ":muxed:"

    .line 192
    .line 193
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    if-ge v9, v6, :cond_c

    .line 197
    .line 198
    move v13, v9

    .line 199
    goto :goto_8

    .line 200
    :cond_c
    add-int/lit8 v13, v9, -0x1

    .line 201
    .line 202
    :goto_8
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v12

    .line 209
    new-instance v13, Lq2/a0;

    .line 210
    .line 211
    invoke-static {v11, v10, v3}, Landroidx/media3/exoplayer/hls/l;->H(Lq2/x;Lq2/x;Z)Lq2/x;

    .line 212
    .line 213
    .line 214
    move-result-object v10

    .line 215
    filled-new-array {v10}, [Lq2/x;

    .line 216
    .line 217
    .line 218
    move-result-object v10

    .line 219
    invoke-direct {v13, v12, v10}, Lq2/a0;-><init>(Ljava/lang/String;[Lq2/x;)V

    .line 220
    .line 221
    .line 222
    aput-object v13, v2, v9

    .line 223
    .line 224
    :goto_9
    add-int/lit8 v9, v9, 0x1

    .line 225
    .line 226
    goto :goto_4

    .line 227
    :cond_d
    invoke-direct {p0, v2}, Landroidx/media3/exoplayer/hls/l;->G([Lq2/a0;)LM2/n0;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    iput-object v0, p0, Landroidx/media3/exoplayer/hls/l;->I:LM2/n0;

    .line 232
    .line 233
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->X:Ljava/util/Set;

    .line 234
    .line 235
    if-nez v0, :cond_e

    .line 236
    .line 237
    move v3, v8

    .line 238
    :cond_e
    invoke-static {v3}, Lt2/a;->g(Z)V

    .line 239
    .line 240
    .line 241
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 242
    .line 243
    iput-object v0, p0, Landroidx/media3/exoplayer/hls/l;->X:Ljava/util/Set;

    .line 244
    .line 245
    return-void
.end method

.method private C(I)Z
    .locals 4

    .line 1
    move v0, p1

    .line 2
    :goto_0
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-ge v0, v1, :cond_1

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroidx/media3/exoplayer/hls/e;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroidx/media3/exoplayer/hls/e;->x()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    return v2

    .line 26
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Landroidx/media3/exoplayer/hls/e;

    .line 36
    .line 37
    move v0, v2

    .line 38
    :goto_1
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 39
    .line 40
    array-length v1, v1

    .line 41
    if-ge v0, v1, :cond_3

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/hls/e;->n(I)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 48
    .line 49
    aget-object v3, v3, v0

    .line 50
    .line 51
    invoke-virtual {v3}, LM2/b0;->F()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-le v3, v1, :cond_2

    .line 56
    .line 57
    return v2

    .line 58
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    const/4 p1, 0x1

    .line 62
    return p1
.end method

.method private static E(II)LU2/n;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Unmapped track with id "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p0, " of type "

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string p1, "HlsSampleStreamWrapper"

    .line 27
    .line 28
    invoke-static {p1, p0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance p0, LU2/n;

    .line 32
    .line 33
    invoke-direct {p0}, LU2/n;-><init>()V

    .line 34
    .line 35
    .line 36
    return-object p0
.end method

.method private F(II)LM2/b0;
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x1

    .line 5
    if-eq p2, v1, :cond_1

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    if-ne p2, v2, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :cond_1
    :goto_0
    new-instance v2, Landroidx/media3/exoplayer/hls/l$d;

    .line 13
    .line 14
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->e:LQ2/b;

    .line 15
    .line 16
    iget-object v4, p0, Landroidx/media3/exoplayer/hls/l;->g:LF2/u;

    .line 17
    .line 18
    iget-object v5, p0, Landroidx/media3/exoplayer/hls/l;->h:LF2/t$a;

    .line 19
    .line 20
    iget-object v6, p0, Landroidx/media3/exoplayer/hls/l;->t:Ljava/util/Map;

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    invoke-direct/range {v2 .. v7}, Landroidx/media3/exoplayer/hls/l$d;-><init>(LQ2/b;LF2/u;LF2/t$a;Ljava/util/Map;Landroidx/media3/exoplayer/hls/l$a;)V

    .line 24
    .line 25
    .line 26
    iget-wide v3, p0, Landroidx/media3/exoplayer/hls/l;->o0:J

    .line 27
    .line 28
    invoke-virtual {v2, v3, v4}, LM2/b0;->d0(J)V

    .line 29
    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->v0:Lq2/q;

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Landroidx/media3/exoplayer/hls/l$d;->k0(Lq2/q;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    iget-wide v3, p0, Landroidx/media3/exoplayer/hls/l;->u0:J

    .line 39
    .line 40
    invoke-virtual {v2, v3, v4}, LM2/b0;->c0(J)V

    .line 41
    .line 42
    .line 43
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->w0:Landroidx/media3/exoplayer/hls/e;

    .line 44
    .line 45
    if-eqz v3, :cond_3

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Landroidx/media3/exoplayer/hls/l$d;->l0(Landroidx/media3/exoplayer/hls/e;)V

    .line 48
    .line 49
    .line 50
    :cond_3
    invoke-virtual {v2, p0}, LM2/b0;->f0(LM2/b0$d;)V

    .line 51
    .line 52
    .line 53
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->w:[I

    .line 54
    .line 55
    add-int/lit8 v4, v0, 0x1

    .line 56
    .line 57
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([II)[I

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    iput-object v3, p0, Landroidx/media3/exoplayer/hls/l;->w:[I

    .line 62
    .line 63
    aput p1, v3, v0

    .line 64
    .line 65
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 66
    .line 67
    invoke-static {p1, v2}, Lt2/a0;->Z0([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast p1, [Landroidx/media3/exoplayer/hls/l$d;

    .line 72
    .line 73
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 74
    .line 75
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->n0:[Z

    .line 76
    .line 77
    invoke-static {p1, v4}, Ljava/util/Arrays;->copyOf([ZI)[Z

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->n0:[Z

    .line 82
    .line 83
    aput-boolean v1, p1, v0

    .line 84
    .line 85
    iget-boolean p1, p0, Landroidx/media3/exoplayer/hls/l;->l0:Z

    .line 86
    .line 87
    or-int/2addr p1, v1

    .line 88
    iput-boolean p1, p0, Landroidx/media3/exoplayer/hls/l;->l0:Z

    .line 89
    .line 90
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->x:Ljava/util/Set;

    .line 91
    .line 92
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-interface {p1, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->y:Landroid/util/SparseIntArray;

    .line 100
    .line 101
    invoke-virtual {p1, p2, v0}, Landroid/util/SparseIntArray;->append(II)V

    .line 102
    .line 103
    .line 104
    invoke-static {p2}, Landroidx/media3/exoplayer/hls/l;->O(I)I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    iget v1, p0, Landroidx/media3/exoplayer/hls/l;->A:I

    .line 109
    .line 110
    invoke-static {v1}, Landroidx/media3/exoplayer/hls/l;->O(I)I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-le p1, v1, :cond_4

    .line 115
    .line 116
    iput v0, p0, Landroidx/media3/exoplayer/hls/l;->B:I

    .line 117
    .line 118
    iput p2, p0, Landroidx/media3/exoplayer/hls/l;->A:I

    .line 119
    .line 120
    :cond_4
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->m0:[Z

    .line 121
    .line 122
    invoke-static {p1, v4}, Ljava/util/Arrays;->copyOf([ZI)[Z

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->m0:[Z

    .line 127
    .line 128
    return-object v2
.end method

.method private G([Lq2/a0;)LM2/n0;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    array-length v2, p1

    .line 4
    if-ge v1, v2, :cond_1

    .line 5
    .line 6
    aget-object v2, p1, v1

    .line 7
    .line 8
    iget v3, v2, Lq2/a0;->a:I

    .line 9
    .line 10
    new-array v3, v3, [Lq2/x;

    .line 11
    .line 12
    move v4, v0

    .line 13
    :goto_1
    iget v5, v2, Lq2/a0;->a:I

    .line 14
    .line 15
    if-ge v4, v5, :cond_0

    .line 16
    .line 17
    invoke-virtual {v2, v4}, Lq2/a0;->c(I)Lq2/x;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    iget-object v6, p0, Landroidx/media3/exoplayer/hls/l;->g:LF2/u;

    .line 22
    .line 23
    invoke-interface {v6, v5}, LF2/u;->b(Lq2/x;)I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    invoke-virtual {v5, v6}, Lq2/x;->c(I)Lq2/x;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    aput-object v5, v3, v4

    .line 32
    .line 33
    add-int/lit8 v4, v4, 0x1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    new-instance v4, Lq2/a0;

    .line 37
    .line 38
    iget-object v2, v2, Lq2/a0;->b:Ljava/lang/String;

    .line 39
    .line 40
    invoke-direct {v4, v2, v3}, Lq2/a0;-><init>(Ljava/lang/String;[Lq2/x;)V

    .line 41
    .line 42
    .line 43
    aput-object v4, p1, v1

    .line 44
    .line 45
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    new-instance v0, LM2/n0;

    .line 49
    .line 50
    invoke-direct {v0, p1}, LM2/n0;-><init>([Lq2/a0;)V

    .line 51
    .line 52
    .line 53
    return-object v0
.end method

.method private static H(Lq2/x;Lq2/x;Z)Lq2/x;
    .locals 7

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-object p1

    .line 4
    :cond_0
    iget-object v0, p1, Lq2/x;->o:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {v0}, Lq2/K;->k(Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, Lq2/x;->k:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v1, v0}, Lt2/a0;->T(Ljava/lang/String;I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x1

    .line 17
    if-ne v1, v2, :cond_1

    .line 18
    .line 19
    iget-object v1, p0, Lq2/x;->k:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v1, v0}, Lt2/a0;->U(Ljava/lang/String;I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1}, Lq2/K;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object v1, p0, Lq2/x;->k:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v3, p1, Lq2/x;->o:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v1, v3}, Lq2/K;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v3, p1, Lq2/x;->o:Ljava/lang/String;

    .line 39
    .line 40
    :goto_0
    invoke-virtual {p1}, Lq2/x;->b()Lq2/x$b;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    iget-object v5, p0, Lq2/x;->a:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v4, v5}, Lq2/x$b;->j0(Ljava/lang/String;)Lq2/x$b;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    iget-object v5, p0, Lq2/x;->b:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v4, v5}, Lq2/x$b;->l0(Ljava/lang/String;)Lq2/x$b;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    iget-object v5, p0, Lq2/x;->c:Ljava/util/List;

    .line 57
    .line 58
    invoke-virtual {v4, v5}, Lq2/x$b;->m0(Ljava/util/List;)Lq2/x$b;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    iget-object v5, p0, Lq2/x;->d:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v4, v5}, Lq2/x$b;->n0(Ljava/lang/String;)Lq2/x$b;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    iget v5, p0, Lq2/x;->e:I

    .line 69
    .line 70
    invoke-virtual {v4, v5}, Lq2/x$b;->A0(I)Lq2/x$b;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    iget v5, p0, Lq2/x;->f:I

    .line 75
    .line 76
    invoke-virtual {v4, v5}, Lq2/x$b;->w0(I)Lq2/x$b;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    const/4 v5, -0x1

    .line 81
    if-eqz p2, :cond_2

    .line 82
    .line 83
    iget v6, p0, Lq2/x;->h:I

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    move v6, v5

    .line 87
    :goto_1
    invoke-virtual {v4, v6}, Lq2/x$b;->S(I)Lq2/x$b;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    if-eqz p2, :cond_3

    .line 92
    .line 93
    iget p2, p0, Lq2/x;->i:I

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_3
    move p2, v5

    .line 97
    :goto_2
    invoke-virtual {v4, p2}, Lq2/x$b;->t0(I)Lq2/x$b;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    invoke-virtual {p2, v1}, Lq2/x$b;->U(Ljava/lang/String;)Lq2/x$b;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    const/4 v1, 0x2

    .line 106
    if-ne v0, v1, :cond_4

    .line 107
    .line 108
    iget v1, p0, Lq2/x;->v:I

    .line 109
    .line 110
    invoke-virtual {p2, v1}, Lq2/x$b;->F0(I)Lq2/x$b;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    iget v4, p0, Lq2/x;->w:I

    .line 115
    .line 116
    invoke-virtual {v1, v4}, Lq2/x$b;->h0(I)Lq2/x$b;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    iget v4, p0, Lq2/x;->z:F

    .line 121
    .line 122
    invoke-virtual {v1, v4}, Lq2/x$b;->f0(F)Lq2/x$b;

    .line 123
    .line 124
    .line 125
    :cond_4
    if-eqz v3, :cond_5

    .line 126
    .line 127
    invoke-virtual {p2, v3}, Lq2/x$b;->y0(Ljava/lang/String;)Lq2/x$b;

    .line 128
    .line 129
    .line 130
    :cond_5
    iget v1, p0, Lq2/x;->G:I

    .line 131
    .line 132
    if-eq v1, v5, :cond_6

    .line 133
    .line 134
    if-ne v0, v2, :cond_6

    .line 135
    .line 136
    invoke-virtual {p2, v1}, Lq2/x$b;->T(I)Lq2/x$b;

    .line 137
    .line 138
    .line 139
    :cond_6
    iget-object p0, p0, Lq2/x;->l:Lq2/J;

    .line 140
    .line 141
    if-eqz p0, :cond_8

    .line 142
    .line 143
    iget-object p1, p1, Lq2/x;->l:Lq2/J;

    .line 144
    .line 145
    if-eqz p1, :cond_7

    .line 146
    .line 147
    invoke-virtual {p1, p0}, Lq2/J;->b(Lq2/J;)Lq2/J;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    :cond_7
    invoke-virtual {p2, p0}, Lq2/x$b;->r0(Lq2/J;)Lq2/x$b;

    .line 152
    .line 153
    .line 154
    :cond_8
    invoke-virtual {p2}, Lq2/x$b;->P()Lq2/x;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    return-object p0
.end method

.method private I(I)V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->j:LQ2/m;

    .line 2
    .line 3
    invoke-virtual {v0}, LQ2/m;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    xor-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 10
    .line 11
    .line 12
    :goto_0
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, -0x1

    .line 19
    if-ge p1, v0, :cond_1

    .line 20
    .line 21
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/hls/l;->C(I)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move p1, v1

    .line 32
    :goto_1
    if-ne p1, v1, :cond_2

    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->M()Landroidx/media3/exoplayer/hls/e;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-wide v5, v0, LN2/e;->h:J

    .line 40
    .line 41
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/hls/l;->J(I)Landroidx/media3/exoplayer/hls/e;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    iget-wide v0, p0, Landroidx/media3/exoplayer/hls/l;->o0:J

    .line 54
    .line 55
    iput-wide v0, p0, Landroidx/media3/exoplayer/hls/l;->p0:J

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-static {v0}, LP9/x;->d(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Landroidx/media3/exoplayer/hls/e;

    .line 65
    .line 66
    invoke-virtual {v0}, Landroidx/media3/exoplayer/hls/e;->q()V

    .line 67
    .line 68
    .line 69
    :goto_2
    const/4 v0, 0x0

    .line 70
    iput-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->s0:Z

    .line 71
    .line 72
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->k:LM2/L$a;

    .line 73
    .line 74
    iget v2, p0, Landroidx/media3/exoplayer/hls/l;->A:I

    .line 75
    .line 76
    iget-wide v3, p1, LN2/e;->g:J

    .line 77
    .line 78
    invoke-virtual/range {v1 .. v6}, LM2/L$a;->y(IJJ)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method private J(I)Landroidx/media3/exoplayer/hls/e;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/media3/exoplayer/hls/e;

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-static {v1, p1, v2}, Lt2/a0;->k1(Ljava/util/List;II)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    :goto_0
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 20
    .line 21
    array-length v1, v1

    .line 22
    if-ge p1, v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/hls/e;->n(I)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 29
    .line 30
    aget-object v2, v2, p1

    .line 31
    .line 32
    invoke-virtual {v2, v1}, LM2/b0;->w(I)V

    .line 33
    .line 34
    .line 35
    add-int/lit8 p1, p1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-object v0
.end method

.method private K(Landroidx/media3/exoplayer/hls/e;)Z
    .locals 7

    .line 1
    iget p1, p1, Landroidx/media3/exoplayer/hls/e;->k:I

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 4
    .line 5
    array-length v0, v0

    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    if-ge v2, v0, :cond_1

    .line 9
    .line 10
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->m0:[Z

    .line 11
    .line 12
    aget-boolean v3, v3, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 17
    .line 18
    aget-object v3, v3, v2

    .line 19
    .line 20
    invoke-virtual {v3}, LM2/b0;->S()J

    .line 21
    .line 22
    .line 23
    move-result-wide v3

    .line 24
    int-to-long v5, p1

    .line 25
    cmp-long v3, v3, v5

    .line 26
    .line 27
    if-nez v3, :cond_0

    .line 28
    .line 29
    return v1

    .line 30
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 p1, 0x1

    .line 34
    return p1
.end method

.method private static L(Lq2/x;Lq2/x;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lq2/x;->o:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p1, Lq2/x;->o:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Lq2/K;->k(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x3

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x1

    .line 12
    if-eq v2, v3, :cond_1

    .line 13
    .line 14
    invoke-static {v1}, Lq2/K;->k(Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-ne v2, p0, :cond_0

    .line 19
    .line 20
    return v5

    .line 21
    :cond_0
    return v4

    .line 22
    :cond_1
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_2

    .line 27
    .line 28
    return v4

    .line 29
    :cond_2
    const-string v1, "application/cea-608"

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_4

    .line 36
    .line 37
    const-string v1, "application/cea-708"

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    return v5

    .line 47
    :cond_4
    :goto_0
    iget p0, p0, Lq2/x;->L:I

    .line 48
    .line 49
    iget p1, p1, Lq2/x;->L:I

    .line 50
    .line 51
    if-ne p0, p1, :cond_5

    .line 52
    .line 53
    return v5

    .line 54
    :cond_5
    return v4
.end method

.method private M()Landroidx/media3/exoplayer/hls/e;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroidx/media3/exoplayer/hls/e;

    .line 14
    .line 15
    return-object v0
.end method

.method private N(II)LU2/O;
    .locals 3

    .line 1
    sget-object v0, Landroidx/media3/exoplayer/hls/l;->x0:Ljava/util/Set;

    .line 2
    .line 3
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Lt2/a;->a(Z)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->y:Landroid/util/SparseIntArray;

    .line 15
    .line 16
    const/4 v1, -0x1

    .line 17
    invoke-virtual {v0, p2, v1}, Landroid/util/SparseIntArray;->get(II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    return-object p1

    .line 25
    :cond_0
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->x:Ljava/util/Set;

    .line 26
    .line 27
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->w:[I

    .line 38
    .line 39
    aput p1, v1, v0

    .line 40
    .line 41
    :cond_1
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->w:[I

    .line 42
    .line 43
    aget v1, v1, v0

    .line 44
    .line 45
    if-ne v1, p1, :cond_2

    .line 46
    .line 47
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 48
    .line 49
    aget-object p1, p1, v0

    .line 50
    .line 51
    return-object p1

    .line 52
    :cond_2
    invoke-static {p1, p2}, Landroidx/media3/exoplayer/hls/l;->E(II)LU2/n;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1
.end method

.method private static O(I)I
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eq p0, v1, :cond_2

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    if-eq p0, v0, :cond_1

    .line 7
    .line 8
    if-eq p0, v2, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_0
    return v1

    .line 13
    :cond_1
    return v2

    .line 14
    :cond_2
    return v0
.end method

.method private P(Landroidx/media3/exoplayer/hls/e;)V
    .locals 6

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->w0:Landroidx/media3/exoplayer/hls/e;

    .line 2
    .line 3
    iget-object v0, p1, LN2/e;->d:Lq2/x;

    .line 4
    .line 5
    iput-object v0, p0, Landroidx/media3/exoplayer/hls/l;->F:Lq2/x;

    .line 6
    .line 7
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    iput-wide v0, p0, Landroidx/media3/exoplayer/hls/l;->p0:J

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    invoke-static {}, LP9/u;->t()LP9/u$a;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 24
    .line 25
    array-length v2, v1

    .line 26
    const/4 v3, 0x0

    .line 27
    move v4, v3

    .line 28
    :goto_0
    if-ge v4, v2, :cond_0

    .line 29
    .line 30
    aget-object v5, v1, v4

    .line 31
    .line 32
    invoke-virtual {v5}, LM2/b0;->J()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v0, v5}, LP9/u$a;->h(Ljava/lang/Object;)LP9/u$a;

    .line 41
    .line 42
    .line 43
    add-int/lit8 v4, v4, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-virtual {v0}, LP9/u$a;->k()LP9/u;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {p1, p0, v0}, Landroidx/media3/exoplayer/hls/e;->p(Landroidx/media3/exoplayer/hls/l;LP9/u;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 54
    .line 55
    array-length v1, v0

    .line 56
    :goto_1
    if-ge v3, v1, :cond_2

    .line 57
    .line 58
    aget-object v2, v0, v3

    .line 59
    .line 60
    invoke-virtual {v2, p1}, Landroidx/media3/exoplayer/hls/l$d;->l0(Landroidx/media3/exoplayer/hls/e;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Landroidx/media3/exoplayer/hls/e;->x()Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_1

    .line 68
    .line 69
    invoke-virtual {v2}, LM2/b0;->i0()V

    .line 70
    .line 71
    .line 72
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    return-void
.end method

.method private static Q(LN2/e;)Z
    .locals 0

    .line 1
    instance-of p0, p0, Landroidx/media3/exoplayer/hls/e;

    .line 2
    .line 3
    return p0
.end method

.method private R()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/hls/l;->p0:J

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
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    return v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0
.end method

.method private U()V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->I:LM2/n0;

    .line 2
    .line 3
    iget v0, v0, LM2/n0;->a:I

    .line 4
    .line 5
    new-array v1, v0, [I

    .line 6
    .line 7
    iput-object v1, p0, Landroidx/media3/exoplayer/hls/l;->Y:[I

    .line 8
    .line 9
    const/4 v2, -0x1

    .line 10
    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([II)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    move v2, v1

    .line 15
    :goto_0
    if-ge v2, v0, :cond_2

    .line 16
    .line 17
    move v3, v1

    .line 18
    :goto_1
    iget-object v4, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 19
    .line 20
    array-length v5, v4

    .line 21
    if-ge v3, v5, :cond_1

    .line 22
    .line 23
    aget-object v4, v4, v3

    .line 24
    .line 25
    invoke-virtual {v4}, LM2/b0;->I()Lq2/x;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-static {v4}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, Lq2/x;

    .line 34
    .line 35
    iget-object v5, p0, Landroidx/media3/exoplayer/hls/l;->I:LM2/n0;

    .line 36
    .line 37
    invoke-virtual {v5, v2}, LM2/n0;->b(I)Lq2/a0;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-virtual {v5, v1}, Lq2/a0;->c(I)Lq2/x;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-static {v4, v5}, Landroidx/media3/exoplayer/hls/l;->L(Lq2/x;Lq2/x;)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_0

    .line 50
    .line 51
    iget-object v4, p0, Landroidx/media3/exoplayer/hls/l;->Y:[I

    .line 52
    .line 53
    aput v3, v4, v2

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->s:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    check-cast v1, Landroidx/media3/exoplayer/hls/h;

    .line 79
    .line 80
    invoke-virtual {v1}, Landroidx/media3/exoplayer/hls/h;->a()V

    .line 81
    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_3
    return-void
.end method

.method private V(Landroidx/media3/exoplayer/hls/e;)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->M()Landroidx/media3/exoplayer/hls/e;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroidx/media3/exoplayer/hls/e;->r()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/lit8 v0, v0, -0x1

    .line 27
    .line 28
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/hls/l;->I(I)V

    .line 29
    .line 30
    .line 31
    :cond_1
    iget-boolean v0, p1, Landroidx/media3/exoplayer/hls/e;->n:Z

    .line 32
    .line 33
    if-eqz v0, :cond_4

    .line 34
    .line 35
    invoke-virtual {p1}, Landroidx/media3/exoplayer/hls/e;->x()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    add-int/lit8 v0, v0, -0x1

    .line 48
    .line 49
    :goto_0
    if-ltz v0, :cond_4

    .line 50
    .line 51
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Landroidx/media3/exoplayer/hls/e;

    .line 58
    .line 59
    iget-wide v1, v1, LN2/e;->g:J

    .line 60
    .line 61
    iget-wide v3, p1, LN2/e;->g:J

    .line 62
    .line 63
    cmp-long v5, v1, v3

    .line 64
    .line 65
    if-gez v5, :cond_2

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    cmp-long v1, v1, v3

    .line 69
    .line 70
    if-nez v1, :cond_3

    .line 71
    .line 72
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/hls/l;->C(I)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_3

    .line 77
    .line 78
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/hls/l;->I(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Landroidx/media3/exoplayer/hls/e;->j()V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_3
    add-int/lit8 v0, v0, -0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_4
    :goto_1
    return-void
.end method

.method private W()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->H:Z

    .line 2
    .line 3
    if-nez v0, :cond_4

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->Y:[I

    .line 6
    .line 7
    if-nez v0, :cond_4

    .line 8
    .line 9
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->C:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 15
    .line 16
    array-length v1, v0

    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    if-ge v2, v1, :cond_2

    .line 19
    .line 20
    aget-object v3, v0, v2

    .line 21
    .line 22
    invoke-virtual {v3}, LM2/b0;->I()Lq2/x;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    if-nez v3, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->I:LM2/n0;

    .line 33
    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->U()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_3
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->B()V

    .line 41
    .line 42
    .line 43
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->p0()V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->c:Landroidx/media3/exoplayer/hls/l$b;

    .line 47
    .line 48
    invoke-interface {v0}, Landroidx/media3/exoplayer/hls/l$b;->e()V

    .line 49
    .line 50
    .line 51
    :cond_4
    :goto_1
    return-void
.end method

.method private g0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->C:Z

    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->W()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private k0()V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v3, v1, :cond_0

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    iget-boolean v5, p0, Landroidx/media3/exoplayer/hls/l;->q0:Z

    .line 11
    .line 12
    invoke-virtual {v4, v5}, LM2/b0;->Y(Z)V

    .line 13
    .line 14
    .line 15
    add-int/lit8 v3, v3, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iput-boolean v2, p0, Landroidx/media3/exoplayer/hls/l;->q0:Z

    .line 19
    .line 20
    return-void
.end method

.method private l0(JLandroidx/media3/exoplayer/hls/e;)Z
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    :goto_0
    const/4 v3, 0x1

    .line 7
    if-ge v2, v0, :cond_5

    .line 8
    .line 9
    iget-object v4, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 10
    .line 11
    aget-object v4, v4, v2

    .line 12
    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    invoke-virtual {p3, v2}, Landroidx/media3/exoplayer/hls/e;->n(I)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {v4, v3}, LM2/b0;->a0(I)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    goto :goto_2

    .line 24
    :cond_0
    invoke-virtual {p0}, Landroidx/media3/exoplayer/hls/l;->c()J

    .line 25
    .line 26
    .line 27
    move-result-wide v5

    .line 28
    const-wide/high16 v7, -0x8000000000000000L

    .line 29
    .line 30
    cmp-long v7, v5, v7

    .line 31
    .line 32
    if-eqz v7, :cond_2

    .line 33
    .line 34
    cmp-long v5, p1, v5

    .line 35
    .line 36
    if-gez v5, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move v3, v1

    .line 40
    :cond_2
    :goto_1
    invoke-virtual {v4, p1, p2, v3}, LM2/b0;->b0(JZ)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    :goto_2
    if-nez v3, :cond_4

    .line 45
    .line 46
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->n0:[Z

    .line 47
    .line 48
    aget-boolean v3, v3, v2

    .line 49
    .line 50
    if-nez v3, :cond_3

    .line 51
    .line 52
    iget-boolean v3, p0, Landroidx/media3/exoplayer/hls/l;->l0:Z

    .line 53
    .line 54
    if-nez v3, :cond_4

    .line 55
    .line 56
    :cond_3
    return v1

    .line 57
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_5
    return v3
.end method

.method private p0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->D:Z

    .line 3
    .line 4
    return-void
.end method

.method private u0([LM2/c0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->s:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    array-length v0, p1

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_1

    .line 9
    .line 10
    aget-object v2, p1, v1

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->s:Ljava/util/ArrayList;

    .line 15
    .line 16
    check-cast v2, Landroidx/media3/exoplayer/hls/h;

    .line 17
    .line 18
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    return-void
.end method

.method public static synthetic w(Landroidx/media3/exoplayer/hls/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->g0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic x(Landroidx/media3/exoplayer/hls/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->W()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic y(Landroidx/media3/exoplayer/hls/l;Landroidx/media3/exoplayer/hls/e;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/hls/l;->c:Landroidx/media3/exoplayer/hls/l$b;

    .line 2
    .line 3
    iget-object p1, p1, Landroidx/media3/exoplayer/hls/e;->m:Landroid/net/Uri;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Landroidx/media3/exoplayer/hls/l$b;->m(Landroid/net/Uri;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private z()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->D:Z

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->I:LM2/n0;

    .line 7
    .line 8
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->X:Ljava/util/Set;

    .line 12
    .line 13
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public A(I)I
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->z()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->Y:[I

    .line 5
    .line 6
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->Y:[I

    .line 10
    .line 11
    aget v0, v0, p1

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    const/4 v2, -0x2

    .line 15
    if-ne v0, v1, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->X:Ljava/util/Set;

    .line 18
    .line 19
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->I:LM2/n0;

    .line 20
    .line 21
    invoke-virtual {v1, p1}, LM2/n0;->b(I)Lq2/a0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    const/4 p1, -0x3

    .line 32
    return p1

    .line 33
    :cond_0
    return v2

    .line 34
    :cond_1
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->m0:[Z

    .line 35
    .line 36
    aget-boolean v1, p1, v0

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    return v2

    .line 41
    :cond_2
    const/4 v1, 0x1

    .line 42
    aput-boolean v1, p1, v0

    .line 43
    .line 44
    return v0
.end method

.method public D()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->D:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/media3/exoplayer/q0$b;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/media3/exoplayer/q0$b;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-wide v1, p0, Landroidx/media3/exoplayer/hls/l;->o0:J

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Landroidx/media3/exoplayer/q0$b;->f(J)Landroidx/media3/exoplayer/q0$b;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Landroidx/media3/exoplayer/q0$b;->d()Landroidx/media3/exoplayer/q0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p0, v0}, Landroidx/media3/exoplayer/hls/l;->a(Landroidx/media3/exoplayer/q0;)Z

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public S(I)Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->R()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 8
    .line 9
    aget-object p1, v0, p1

    .line 10
    .line 11
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->s0:Z

    .line 12
    .line 13
    invoke-virtual {p1, v0}, LM2/b0;->N(Z)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    return p1
.end method

.method public T()Z
    .locals 2

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/hls/l;->A:I

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

.method public X()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->j:LQ2/m;

    .line 2
    .line 3
    invoke-virtual {v0}, LQ2/m;->b()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->d:Landroidx/media3/exoplayer/hls/c;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/media3/exoplayer/hls/c;->r()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public Y(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/hls/l;->X()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 5
    .line 6
    aget-object p1, v0, p1

    .line 7
    .line 8
    invoke-virtual {p1}, LM2/b0;->P()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public Z(LN2/e;JJZ)V
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroidx/media3/exoplayer/hls/l;->u:LN2/e;

    .line 3
    .line 4
    new-instance v1, LM2/y;

    .line 5
    .line 6
    iget-wide v2, p1, LN2/e;->a:J

    .line 7
    .line 8
    iget-object v4, p1, LN2/e;->b:Lw2/o;

    .line 9
    .line 10
    invoke-virtual {p1}, LN2/e;->f()Landroid/net/Uri;

    .line 11
    .line 12
    .line 13
    move-result-object v5

    .line 14
    invoke-virtual {p1}, LN2/e;->e()Ljava/util/Map;

    .line 15
    .line 16
    .line 17
    move-result-object v6

    .line 18
    invoke-virtual {p1}, LN2/e;->b()J

    .line 19
    .line 20
    .line 21
    move-result-wide v11

    .line 22
    move-wide v7, p2

    .line 23
    move-wide/from16 v9, p4

    .line 24
    .line 25
    invoke-direct/range {v1 .. v12}, LM2/y;-><init>(JLw2/o;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->i:LQ2/k;

    .line 29
    .line 30
    iget-wide v2, p1, LN2/e;->a:J

    .line 31
    .line 32
    invoke-interface {v0, v2, v3}, LQ2/k;->d(J)V

    .line 33
    .line 34
    .line 35
    move-object v2, v1

    .line 36
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->k:LM2/L$a;

    .line 37
    .line 38
    iget v3, p1, LN2/e;->c:I

    .line 39
    .line 40
    iget v4, p0, Landroidx/media3/exoplayer/hls/l;->b:I

    .line 41
    .line 42
    iget-object v5, p1, LN2/e;->d:Lq2/x;

    .line 43
    .line 44
    iget v6, p1, LN2/e;->e:I

    .line 45
    .line 46
    iget-object v7, p1, LN2/e;->f:Ljava/lang/Object;

    .line 47
    .line 48
    iget-wide v8, p1, LN2/e;->g:J

    .line 49
    .line 50
    iget-wide v10, p1, LN2/e;->h:J

    .line 51
    .line 52
    invoke-virtual/range {v1 .. v11}, LM2/L$a;->m(LM2/y;IILq2/x;ILjava/lang/Object;JJ)V

    .line 53
    .line 54
    .line 55
    if-nez p6, :cond_2

    .line 56
    .line 57
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->R()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-nez p1, :cond_0

    .line 62
    .line 63
    iget p1, p0, Landroidx/media3/exoplayer/hls/l;->E:I

    .line 64
    .line 65
    if-nez p1, :cond_1

    .line 66
    .line 67
    :cond_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->k0()V

    .line 68
    .line 69
    .line 70
    :cond_1
    iget p1, p0, Landroidx/media3/exoplayer/hls/l;->E:I

    .line 71
    .line 72
    if-lez p1, :cond_2

    .line 73
    .line 74
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->c:Landroidx/media3/exoplayer/hls/l$b;

    .line 75
    .line 76
    invoke-interface {p1, p0}, LM2/d0$a;->j(LM2/d0;)V

    .line 77
    .line 78
    .line 79
    :cond_2
    return-void
.end method

.method public a(Landroidx/media3/exoplayer/q0;)Z
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Landroidx/media3/exoplayer/hls/l;->s0:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v1, :cond_c

    .line 7
    .line 8
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/l;->j:LQ2/m;

    .line 9
    .line 10
    invoke-virtual {v1}, LQ2/m;->j()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_c

    .line 15
    .line 16
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/l;->j:LQ2/m;

    .line 17
    .line 18
    invoke-virtual {v1}, LQ2/m;->i()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    goto/16 :goto_7

    .line 25
    .line 26
    :cond_0
    invoke-direct {v0}, Landroidx/media3/exoplayer/hls/l;->R()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 33
    .line 34
    iget-wide v3, v0, Landroidx/media3/exoplayer/hls/l;->p0:J

    .line 35
    .line 36
    iget-object v5, v0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 37
    .line 38
    array-length v6, v5

    .line 39
    move v7, v2

    .line 40
    :goto_0
    if-ge v7, v6, :cond_1

    .line 41
    .line 42
    aget-object v8, v5, v7

    .line 43
    .line 44
    iget-wide v9, v0, Landroidx/media3/exoplayer/hls/l;->p0:J

    .line 45
    .line 46
    invoke-virtual {v8, v9, v10}, LM2/b0;->d0(J)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v7, v7, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    move-object/from16 v16, v1

    .line 53
    .line 54
    move-wide v12, v3

    .line 55
    move-wide v14, v12

    .line 56
    goto :goto_4

    .line 57
    :cond_2
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/l;->o:Ljava/util/List;

    .line 58
    .line 59
    invoke-direct {v0}, Landroidx/media3/exoplayer/hls/l;->M()Landroidx/media3/exoplayer/hls/e;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v3}, Landroidx/media3/exoplayer/hls/e;->h()Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_4

    .line 68
    .line 69
    invoke-virtual {v3}, Landroidx/media3/exoplayer/hls/e;->r()Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-nez v4, :cond_3

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    invoke-virtual {v3}, Landroidx/media3/exoplayer/hls/e;->o()J

    .line 77
    .line 78
    .line 79
    move-result-wide v3

    .line 80
    goto :goto_2

    .line 81
    :cond_4
    :goto_1
    iget-wide v4, v0, Landroidx/media3/exoplayer/hls/l;->o0:J

    .line 82
    .line 83
    iget-wide v6, v3, LN2/e;->g:J

    .line 84
    .line 85
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 86
    .line 87
    .line 88
    move-result-wide v3

    .line 89
    :goto_2
    iget-wide v5, v0, Landroidx/media3/exoplayer/hls/l;->o0:J

    .line 90
    .line 91
    iget-boolean v7, v0, Landroidx/media3/exoplayer/hls/l;->C:Z

    .line 92
    .line 93
    if-eqz v7, :cond_5

    .line 94
    .line 95
    iget-object v7, v0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 96
    .line 97
    array-length v8, v7

    .line 98
    move v9, v2

    .line 99
    :goto_3
    if-ge v9, v8, :cond_5

    .line 100
    .line 101
    aget-object v10, v7, v9

    .line 102
    .line 103
    invoke-virtual {v10}, LM2/b0;->D()J

    .line 104
    .line 105
    .line 106
    move-result-wide v10

    .line 107
    invoke-static {v5, v6, v10, v11}, Ljava/lang/Math;->max(JJ)J

    .line 108
    .line 109
    .line 110
    move-result-wide v5

    .line 111
    add-int/lit8 v9, v9, 0x1

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_5
    move-object/from16 v16, v1

    .line 115
    .line 116
    move-wide v12, v3

    .line 117
    move-wide v14, v5

    .line 118
    :goto_4
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/l;->m:Landroidx/media3/exoplayer/hls/c$b;

    .line 119
    .line 120
    invoke-virtual {v1}, Landroidx/media3/exoplayer/hls/c$b;->a()V

    .line 121
    .line 122
    .line 123
    iget-object v10, v0, Landroidx/media3/exoplayer/hls/l;->d:Landroidx/media3/exoplayer/hls/c;

    .line 124
    .line 125
    iget-boolean v1, v0, Landroidx/media3/exoplayer/hls/l;->D:Z

    .line 126
    .line 127
    const/4 v3, 0x1

    .line 128
    if-nez v1, :cond_7

    .line 129
    .line 130
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->isEmpty()Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-nez v1, :cond_6

    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_6
    move/from16 v17, v2

    .line 138
    .line 139
    goto :goto_6

    .line 140
    :cond_7
    :goto_5
    move/from16 v17, v3

    .line 141
    .line 142
    :goto_6
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/l;->m:Landroidx/media3/exoplayer/hls/c$b;

    .line 143
    .line 144
    move-object/from16 v11, p1

    .line 145
    .line 146
    move-object/from16 v18, v1

    .line 147
    .line 148
    invoke-virtual/range {v10 .. v18}, Landroidx/media3/exoplayer/hls/c;->f(Landroidx/media3/exoplayer/q0;JJLjava/util/List;ZLandroidx/media3/exoplayer/hls/c$b;)V

    .line 149
    .line 150
    .line 151
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/l;->m:Landroidx/media3/exoplayer/hls/c$b;

    .line 152
    .line 153
    iget-boolean v4, v1, Landroidx/media3/exoplayer/hls/c$b;->b:Z

    .line 154
    .line 155
    iget-object v5, v1, Landroidx/media3/exoplayer/hls/c$b;->a:LN2/e;

    .line 156
    .line 157
    iget-object v1, v1, Landroidx/media3/exoplayer/hls/c$b;->c:Landroid/net/Uri;

    .line 158
    .line 159
    if-eqz v4, :cond_8

    .line 160
    .line 161
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    iput-wide v1, v0, Landroidx/media3/exoplayer/hls/l;->p0:J

    .line 167
    .line 168
    iput-boolean v3, v0, Landroidx/media3/exoplayer/hls/l;->s0:Z

    .line 169
    .line 170
    return v3

    .line 171
    :cond_8
    if-nez v5, :cond_a

    .line 172
    .line 173
    if-eqz v1, :cond_9

    .line 174
    .line 175
    iget-object v3, v0, Landroidx/media3/exoplayer/hls/l;->c:Landroidx/media3/exoplayer/hls/l$b;

    .line 176
    .line 177
    invoke-interface {v3, v1}, Landroidx/media3/exoplayer/hls/l$b;->m(Landroid/net/Uri;)V

    .line 178
    .line 179
    .line 180
    :cond_9
    return v2

    .line 181
    :cond_a
    invoke-static {v5}, Landroidx/media3/exoplayer/hls/l;->Q(LN2/e;)Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-eqz v1, :cond_b

    .line 186
    .line 187
    move-object v1, v5

    .line 188
    check-cast v1, Landroidx/media3/exoplayer/hls/e;

    .line 189
    .line 190
    invoke-direct {v0, v1}, Landroidx/media3/exoplayer/hls/l;->V(Landroidx/media3/exoplayer/hls/e;)V

    .line 191
    .line 192
    .line 193
    invoke-direct {v0, v1}, Landroidx/media3/exoplayer/hls/l;->P(Landroidx/media3/exoplayer/hls/e;)V

    .line 194
    .line 195
    .line 196
    :cond_b
    iput-object v5, v0, Landroidx/media3/exoplayer/hls/l;->u:LN2/e;

    .line 197
    .line 198
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/l;->j:LQ2/m;

    .line 199
    .line 200
    iget-object v2, v0, Landroidx/media3/exoplayer/hls/l;->i:LQ2/k;

    .line 201
    .line 202
    iget v4, v5, LN2/e;->c:I

    .line 203
    .line 204
    invoke-interface {v2, v4}, LQ2/k;->a(I)I

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    invoke-virtual {v1, v5, v0, v2}, LQ2/m;->n(LQ2/m$e;LQ2/m$b;I)J

    .line 209
    .line 210
    .line 211
    return v3

    .line 212
    :cond_c
    :goto_7
    return v2
.end method

.method public a0(LN2/e;JJ)V
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroidx/media3/exoplayer/hls/l;->u:LN2/e;

    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->d:Landroidx/media3/exoplayer/hls/c;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/hls/c;->t(LN2/e;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, LM2/y;

    .line 10
    .line 11
    iget-wide v2, p1, LN2/e;->a:J

    .line 12
    .line 13
    iget-object v4, p1, LN2/e;->b:Lw2/o;

    .line 14
    .line 15
    invoke-virtual {p1}, LN2/e;->f()Landroid/net/Uri;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    invoke-virtual {p1}, LN2/e;->e()Ljava/util/Map;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    invoke-virtual {p1}, LN2/e;->b()J

    .line 24
    .line 25
    .line 26
    move-result-wide v11

    .line 27
    move-wide v7, p2

    .line 28
    move-wide/from16 v9, p4

    .line 29
    .line 30
    invoke-direct/range {v1 .. v12}, LM2/y;-><init>(JLw2/o;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->i:LQ2/k;

    .line 34
    .line 35
    iget-wide v2, p1, LN2/e;->a:J

    .line 36
    .line 37
    invoke-interface {v0, v2, v3}, LQ2/k;->d(J)V

    .line 38
    .line 39
    .line 40
    move-object v2, v1

    .line 41
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->k:LM2/L$a;

    .line 42
    .line 43
    iget v3, p1, LN2/e;->c:I

    .line 44
    .line 45
    iget v4, p0, Landroidx/media3/exoplayer/hls/l;->b:I

    .line 46
    .line 47
    iget-object v5, p1, LN2/e;->d:Lq2/x;

    .line 48
    .line 49
    iget v6, p1, LN2/e;->e:I

    .line 50
    .line 51
    iget-object v7, p1, LN2/e;->f:Ljava/lang/Object;

    .line 52
    .line 53
    iget-wide v8, p1, LN2/e;->g:J

    .line 54
    .line 55
    iget-wide v10, p1, LN2/e;->h:J

    .line 56
    .line 57
    invoke-virtual/range {v1 .. v11}, LM2/L$a;->p(LM2/y;IILq2/x;ILjava/lang/Object;JJ)V

    .line 58
    .line 59
    .line 60
    iget-boolean p1, p0, Landroidx/media3/exoplayer/hls/l;->D:Z

    .line 61
    .line 62
    if-nez p1, :cond_0

    .line 63
    .line 64
    new-instance p1, Landroidx/media3/exoplayer/q0$b;

    .line 65
    .line 66
    invoke-direct {p1}, Landroidx/media3/exoplayer/q0$b;-><init>()V

    .line 67
    .line 68
    .line 69
    iget-wide v0, p0, Landroidx/media3/exoplayer/hls/l;->o0:J

    .line 70
    .line 71
    invoke-virtual {p1, v0, v1}, Landroidx/media3/exoplayer/q0$b;->f(J)Landroidx/media3/exoplayer/q0$b;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1}, Landroidx/media3/exoplayer/q0$b;->d()Landroidx/media3/exoplayer/q0;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/hls/l;->a(Landroidx/media3/exoplayer/q0;)Z

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_0
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->c:Landroidx/media3/exoplayer/hls/l$b;

    .line 84
    .line 85
    invoke-interface {p1, p0}, LM2/d0$a;->j(LM2/d0;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public b(Lq2/x;)V
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->r:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->p:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public b0(LN2/e;JJLjava/io/IOException;I)LQ2/m$c;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v13, p6

    .line 6
    .line 7
    invoke-static {v1}, Landroidx/media3/exoplayer/hls/l;->Q(LN2/e;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    move-object v3, v1

    .line 14
    check-cast v3, Landroidx/media3/exoplayer/hls/e;

    .line 15
    .line 16
    invoke-virtual {v3}, Landroidx/media3/exoplayer/hls/e;->r()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    instance-of v3, v13, Lw2/x;

    .line 23
    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    move-object v3, v13

    .line 27
    check-cast v3, Lw2/x;

    .line 28
    .line 29
    iget v3, v3, Lw2/x;->d:I

    .line 30
    .line 31
    const/16 v4, 0x19a

    .line 32
    .line 33
    if-eq v3, v4, :cond_0

    .line 34
    .line 35
    const/16 v4, 0x194

    .line 36
    .line 37
    if-ne v3, v4, :cond_1

    .line 38
    .line 39
    :cond_0
    sget-object v1, LQ2/m;->d:LQ2/m$c;

    .line 40
    .line 41
    return-object v1

    .line 42
    :cond_1
    invoke-virtual {v1}, LN2/e;->b()J

    .line 43
    .line 44
    .line 45
    move-result-wide v24

    .line 46
    new-instance v14, LM2/y;

    .line 47
    .line 48
    iget-wide v3, v1, LN2/e;->a:J

    .line 49
    .line 50
    iget-object v5, v1, LN2/e;->b:Lw2/o;

    .line 51
    .line 52
    invoke-virtual {v1}, LN2/e;->f()Landroid/net/Uri;

    .line 53
    .line 54
    .line 55
    move-result-object v18

    .line 56
    invoke-virtual {v1}, LN2/e;->e()Ljava/util/Map;

    .line 57
    .line 58
    .line 59
    move-result-object v19

    .line 60
    move-wide/from16 v20, p2

    .line 61
    .line 62
    move-wide/from16 v22, p4

    .line 63
    .line 64
    move-wide v15, v3

    .line 65
    move-object/from16 v17, v5

    .line 66
    .line 67
    invoke-direct/range {v14 .. v25}, LM2/y;-><init>(JLw2/o;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 68
    .line 69
    .line 70
    new-instance v3, LM2/B;

    .line 71
    .line 72
    iget v4, v1, LN2/e;->c:I

    .line 73
    .line 74
    iget v5, v0, Landroidx/media3/exoplayer/hls/l;->b:I

    .line 75
    .line 76
    iget-object v6, v1, LN2/e;->d:Lq2/x;

    .line 77
    .line 78
    iget v7, v1, LN2/e;->e:I

    .line 79
    .line 80
    iget-object v8, v1, LN2/e;->f:Ljava/lang/Object;

    .line 81
    .line 82
    iget-wide v9, v1, LN2/e;->g:J

    .line 83
    .line 84
    invoke-static {v9, v10}, Lt2/a0;->F1(J)J

    .line 85
    .line 86
    .line 87
    move-result-wide v9

    .line 88
    iget-wide v11, v1, LN2/e;->h:J

    .line 89
    .line 90
    invoke-static {v11, v12}, Lt2/a0;->F1(J)J

    .line 91
    .line 92
    .line 93
    move-result-wide v11

    .line 94
    invoke-direct/range {v3 .. v12}, LM2/B;-><init>(IILq2/x;ILjava/lang/Object;JJ)V

    .line 95
    .line 96
    .line 97
    new-instance v4, LQ2/k$c;

    .line 98
    .line 99
    move/from16 v5, p7

    .line 100
    .line 101
    invoke-direct {v4, v14, v3, v13, v5}, LQ2/k$c;-><init>(LM2/y;LM2/B;Ljava/io/IOException;I)V

    .line 102
    .line 103
    .line 104
    iget-object v3, v0, Landroidx/media3/exoplayer/hls/l;->i:LQ2/k;

    .line 105
    .line 106
    iget-object v5, v0, Landroidx/media3/exoplayer/hls/l;->d:Landroidx/media3/exoplayer/hls/c;

    .line 107
    .line 108
    invoke-virtual {v5}, Landroidx/media3/exoplayer/hls/c;->m()LP2/A;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-static {v5}, LP2/F;->c(LP2/A;)LQ2/k$a;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-interface {v3, v5, v4}, LQ2/k;->b(LQ2/k$a;LQ2/k$c;)LQ2/k$b;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    const/4 v5, 0x0

    .line 121
    if-eqz v3, :cond_2

    .line 122
    .line 123
    iget v6, v3, LQ2/k$b;->a:I

    .line 124
    .line 125
    const/4 v7, 0x2

    .line 126
    if-ne v6, v7, :cond_2

    .line 127
    .line 128
    iget-object v6, v0, Landroidx/media3/exoplayer/hls/l;->d:Landroidx/media3/exoplayer/hls/c;

    .line 129
    .line 130
    iget-wide v7, v3, LQ2/k$b;->b:J

    .line 131
    .line 132
    invoke-virtual {v6, v1, v7, v8}, Landroidx/media3/exoplayer/hls/c;->q(LN2/e;J)Z

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    move v15, v3

    .line 137
    goto :goto_0

    .line 138
    :cond_2
    move v15, v5

    .line 139
    :goto_0
    if-eqz v15, :cond_6

    .line 140
    .line 141
    if-eqz v2, :cond_5

    .line 142
    .line 143
    const-wide/16 v2, 0x0

    .line 144
    .line 145
    cmp-long v2, v24, v2

    .line 146
    .line 147
    if-nez v2, :cond_5

    .line 148
    .line 149
    iget-object v2, v0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 150
    .line 151
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    const/4 v4, 0x1

    .line 156
    sub-int/2addr v3, v4

    .line 157
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    check-cast v2, Landroidx/media3/exoplayer/hls/e;

    .line 162
    .line 163
    if-ne v2, v1, :cond_3

    .line 164
    .line 165
    move v5, v4

    .line 166
    :cond_3
    invoke-static {v5}, Lt2/a;->g(Z)V

    .line 167
    .line 168
    .line 169
    iget-object v2, v0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    if-eqz v2, :cond_4

    .line 176
    .line 177
    iget-wide v2, v0, Landroidx/media3/exoplayer/hls/l;->o0:J

    .line 178
    .line 179
    iput-wide v2, v0, Landroidx/media3/exoplayer/hls/l;->p0:J

    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_4
    iget-object v2, v0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-static {v2}, LP9/x;->d(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    check-cast v2, Landroidx/media3/exoplayer/hls/e;

    .line 189
    .line 190
    invoke-virtual {v2}, Landroidx/media3/exoplayer/hls/e;->q()V

    .line 191
    .line 192
    .line 193
    :cond_5
    :goto_1
    sget-object v2, LQ2/m;->f:LQ2/m$c;

    .line 194
    .line 195
    :goto_2
    move-object/from16 v16, v2

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_6
    iget-object v2, v0, Landroidx/media3/exoplayer/hls/l;->i:LQ2/k;

    .line 199
    .line 200
    invoke-interface {v2, v4}, LQ2/k;->c(LQ2/k$c;)J

    .line 201
    .line 202
    .line 203
    move-result-wide v2

    .line 204
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    cmp-long v4, v2, v6

    .line 210
    .line 211
    if-eqz v4, :cond_7

    .line 212
    .line 213
    invoke-static {v5, v2, v3}, LQ2/m;->h(ZJ)LQ2/m$c;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    goto :goto_2

    .line 218
    :cond_7
    sget-object v2, LQ2/m;->g:LQ2/m$c;

    .line 219
    .line 220
    goto :goto_2

    .line 221
    :goto_3
    invoke-virtual/range {v16 .. v16}, LQ2/m$c;->c()Z

    .line 222
    .line 223
    .line 224
    move-result v17

    .line 225
    move-object v3, v14

    .line 226
    xor-int/lit8 v14, v17, 0x1

    .line 227
    .line 228
    iget-object v2, v0, Landroidx/media3/exoplayer/hls/l;->k:LM2/L$a;

    .line 229
    .line 230
    iget v4, v1, LN2/e;->c:I

    .line 231
    .line 232
    iget v5, v0, Landroidx/media3/exoplayer/hls/l;->b:I

    .line 233
    .line 234
    iget-object v6, v1, LN2/e;->d:Lq2/x;

    .line 235
    .line 236
    iget v7, v1, LN2/e;->e:I

    .line 237
    .line 238
    iget-object v8, v1, LN2/e;->f:Ljava/lang/Object;

    .line 239
    .line 240
    iget-wide v9, v1, LN2/e;->g:J

    .line 241
    .line 242
    iget-wide v11, v1, LN2/e;->h:J

    .line 243
    .line 244
    invoke-virtual/range {v2 .. v14}, LM2/L$a;->r(LM2/y;IILq2/x;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    .line 245
    .line 246
    .line 247
    if-nez v17, :cond_8

    .line 248
    .line 249
    const/4 v2, 0x0

    .line 250
    iput-object v2, v0, Landroidx/media3/exoplayer/hls/l;->u:LN2/e;

    .line 251
    .line 252
    iget-object v2, v0, Landroidx/media3/exoplayer/hls/l;->i:LQ2/k;

    .line 253
    .line 254
    iget-wide v3, v1, LN2/e;->a:J

    .line 255
    .line 256
    invoke-interface {v2, v3, v4}, LQ2/k;->d(J)V

    .line 257
    .line 258
    .line 259
    :cond_8
    if-eqz v15, :cond_a

    .line 260
    .line 261
    iget-boolean v1, v0, Landroidx/media3/exoplayer/hls/l;->D:Z

    .line 262
    .line 263
    if-nez v1, :cond_9

    .line 264
    .line 265
    new-instance v1, Landroidx/media3/exoplayer/q0$b;

    .line 266
    .line 267
    invoke-direct {v1}, Landroidx/media3/exoplayer/q0$b;-><init>()V

    .line 268
    .line 269
    .line 270
    iget-wide v2, v0, Landroidx/media3/exoplayer/hls/l;->o0:J

    .line 271
    .line 272
    invoke-virtual {v1, v2, v3}, Landroidx/media3/exoplayer/q0$b;->f(J)Landroidx/media3/exoplayer/q0$b;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    invoke-virtual {v1}, Landroidx/media3/exoplayer/q0$b;->d()Landroidx/media3/exoplayer/q0;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/hls/l;->a(Landroidx/media3/exoplayer/q0;)Z

    .line 281
    .line 282
    .line 283
    return-object v16

    .line 284
    :cond_9
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/l;->c:Landroidx/media3/exoplayer/hls/l$b;

    .line 285
    .line 286
    invoke-interface {v1, v0}, LM2/d0$a;->j(LM2/d0;)V

    .line 287
    .line 288
    .line 289
    :cond_a
    return-object v16
.end method

.method public c()J
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->R()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-wide v0, p0, Landroidx/media3/exoplayer/hls/l;->p0:J

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->s0:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const-wide/high16 v0, -0x8000000000000000L

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_1
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->M()Landroidx/media3/exoplayer/hls/e;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-wide v0, v0, LN2/e;->h:J

    .line 22
    .line 23
    return-wide v0
.end method

.method public c0(LN2/e;JJI)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    if-nez p6, :cond_0

    .line 6
    .line 7
    new-instance v2, LM2/y;

    .line 8
    .line 9
    iget-wide v3, v1, LN2/e;->a:J

    .line 10
    .line 11
    iget-object v5, v1, LN2/e;->b:Lw2/o;

    .line 12
    .line 13
    move-wide/from16 v6, p2

    .line 14
    .line 15
    invoke-direct/range {v2 .. v7}, LM2/y;-><init>(JLw2/o;J)V

    .line 16
    .line 17
    .line 18
    move-object v5, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v3, LM2/y;

    .line 21
    .line 22
    iget-wide v4, v1, LN2/e;->a:J

    .line 23
    .line 24
    iget-object v6, v1, LN2/e;->b:Lw2/o;

    .line 25
    .line 26
    invoke-virtual {v1}, LN2/e;->f()Landroid/net/Uri;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    invoke-virtual {v1}, LN2/e;->e()Ljava/util/Map;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    invoke-virtual {v1}, LN2/e;->b()J

    .line 35
    .line 36
    .line 37
    move-result-wide v13

    .line 38
    move-wide/from16 v9, p2

    .line 39
    .line 40
    move-wide/from16 v11, p4

    .line 41
    .line 42
    invoke-direct/range {v3 .. v14}, LM2/y;-><init>(JLw2/o;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 43
    .line 44
    .line 45
    move-object v5, v3

    .line 46
    :goto_0
    iget-object v4, v0, Landroidx/media3/exoplayer/hls/l;->k:LM2/L$a;

    .line 47
    .line 48
    iget v6, v1, LN2/e;->c:I

    .line 49
    .line 50
    iget v7, v0, Landroidx/media3/exoplayer/hls/l;->b:I

    .line 51
    .line 52
    iget-object v8, v1, LN2/e;->d:Lq2/x;

    .line 53
    .line 54
    iget v9, v1, LN2/e;->e:I

    .line 55
    .line 56
    iget-object v10, v1, LN2/e;->f:Ljava/lang/Object;

    .line 57
    .line 58
    iget-wide v11, v1, LN2/e;->g:J

    .line 59
    .line 60
    iget-wide v13, v1, LN2/e;->h:J

    .line 61
    .line 62
    move/from16 v15, p6

    .line 63
    .line 64
    invoke-virtual/range {v4 .. v15}, LM2/L$a;->v(LM2/y;IILq2/x;ILjava/lang/Object;JJI)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public d(JLA2/Q;)J
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->d:Landroidx/media3/exoplayer/hls/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Landroidx/media3/exoplayer/hls/c;->c(JLA2/Q;)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method

.method public d0()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->x:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public e(II)LU2/O;
    .locals 3

    .line 1
    sget-object v0, Landroidx/media3/exoplayer/hls/l;->x0:Ljava/util/Set;

    .line 2
    .line 3
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/hls/l;->N(II)LU2/O;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 20
    .line 21
    array-length v2, v1

    .line 22
    if-ge v0, v2, :cond_2

    .line 23
    .line 24
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/l;->w:[I

    .line 25
    .line 26
    aget v2, v2, v0

    .line 27
    .line 28
    if-ne v2, p1, :cond_1

    .line 29
    .line 30
    aget-object v0, v1, v0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    const/4 v0, 0x0

    .line 37
    :goto_1
    if-nez v0, :cond_4

    .line 38
    .line 39
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->t0:Z

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    invoke-static {p1, p2}, Landroidx/media3/exoplayer/hls/l;->E(II)LU2/n;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    :cond_3
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/hls/l;->F(II)LM2/b0;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    :cond_4
    const/4 p1, 0x5

    .line 53
    if-ne p2, p1, :cond_6

    .line 54
    .line 55
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->z:LU2/O;

    .line 56
    .line 57
    if-nez p1, :cond_5

    .line 58
    .line 59
    new-instance p1, Landroidx/media3/exoplayer/hls/l$c;

    .line 60
    .line 61
    iget p2, p0, Landroidx/media3/exoplayer/hls/l;->l:I

    .line 62
    .line 63
    invoke-direct {p1, v0, p2}, Landroidx/media3/exoplayer/hls/l$c;-><init>(LU2/O;I)V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->z:LU2/O;

    .line 67
    .line 68
    :cond_5
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->z:LU2/O;

    .line 69
    .line 70
    return-object p1

    .line 71
    :cond_6
    return-object v0
.end method

.method public e0(Landroid/net/Uri;LQ2/k$c;Z)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->d:Landroidx/media3/exoplayer/hls/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/hls/c;->s(Landroid/net/Uri;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    if-nez p3, :cond_1

    .line 12
    .line 13
    iget-object p3, p0, Landroidx/media3/exoplayer/hls/l;->i:LQ2/k;

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->d:Landroidx/media3/exoplayer/hls/c;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/media3/exoplayer/hls/c;->m()LP2/A;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, LP2/F;->c(LP2/A;)LQ2/k$a;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {p3, v0, p2}, LQ2/k;->b(LQ2/k$a;LQ2/k$c;)LQ2/k$b;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    iget p3, p2, LQ2/k$b;->a:I

    .line 32
    .line 33
    const/4 v0, 0x2

    .line 34
    if-ne p3, v0, :cond_1

    .line 35
    .line 36
    iget-wide p2, p2, LQ2/k$b;->b:J

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    :goto_0
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->d:Landroidx/media3/exoplayer/hls/c;

    .line 45
    .line 46
    invoke-virtual {v0, p1, p2, p3}, Landroidx/media3/exoplayer/hls/c;->u(Landroid/net/Uri;J)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    return p1
.end method

.method public f()J
    .locals 7

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->s0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-wide/high16 v0, -0x8000000000000000L

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->R()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-wide v0, p0, Landroidx/media3/exoplayer/hls/l;->p0:J

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_1
    iget-wide v0, p0, Landroidx/media3/exoplayer/hls/l;->o0:J

    .line 18
    .line 19
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->M()Landroidx/media3/exoplayer/hls/e;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Landroidx/media3/exoplayer/hls/e;->h()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    const/4 v3, 0x1

    .line 37
    if-le v2, v3, :cond_3

    .line 38
    .line 39
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    add-int/lit8 v3, v3, -0x2

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Landroidx/media3/exoplayer/hls/e;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    const/4 v2, 0x0

    .line 55
    :goto_0
    if-eqz v2, :cond_4

    .line 56
    .line 57
    iget-wide v2, v2, LN2/e;->h:J

    .line 58
    .line 59
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 60
    .line 61
    .line 62
    move-result-wide v0

    .line 63
    :cond_4
    iget-boolean v2, p0, Landroidx/media3/exoplayer/hls/l;->C:Z

    .line 64
    .line 65
    if-eqz v2, :cond_5

    .line 66
    .line 67
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 68
    .line 69
    array-length v3, v2

    .line 70
    const/4 v4, 0x0

    .line 71
    :goto_1
    if-ge v4, v3, :cond_5

    .line 72
    .line 73
    aget-object v5, v2, v4

    .line 74
    .line 75
    invoke-virtual {v5}, LM2/b0;->C()J

    .line 76
    .line 77
    .line 78
    move-result-wide v5

    .line 79
    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 80
    .line 81
    .line 82
    move-result-wide v0

    .line 83
    add-int/lit8 v4, v4, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_5
    return-wide v0
.end method

.method public f0()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-static {v0}, LP9/x;->d(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Landroidx/media3/exoplayer/hls/e;

    .line 17
    .line 18
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->d:Landroidx/media3/exoplayer/hls/c;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Landroidx/media3/exoplayer/hls/c;->d(Landroidx/media3/exoplayer/hls/e;)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v2, 0x1

    .line 25
    if-ne v1, v2, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0}, Landroidx/media3/exoplayer/hls/e;->r()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_3

    .line 32
    .line 33
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->d:Landroidx/media3/exoplayer/hls/c;

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Landroidx/media3/exoplayer/hls/c;->j(Landroidx/media3/exoplayer/hls/e;)J

    .line 36
    .line 37
    .line 38
    move-result-wide v1

    .line 39
    invoke-virtual {v0, v1, v2}, Landroidx/media3/exoplayer/hls/e;->w(J)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    if-nez v1, :cond_2

    .line 44
    .line 45
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->r:Landroid/os/Handler;

    .line 46
    .line 47
    new-instance v2, Landroidx/media3/exoplayer/hls/i;

    .line 48
    .line 49
    invoke-direct {v2, p0, v0}, Landroidx/media3/exoplayer/hls/i;-><init>(Landroidx/media3/exoplayer/hls/l;Landroidx/media3/exoplayer/hls/e;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_2
    const/4 v0, 0x2

    .line 57
    if-ne v1, v0, :cond_3

    .line 58
    .line 59
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->s0:Z

    .line 60
    .line 61
    if-nez v0, :cond_3

    .line 62
    .line 63
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->j:LQ2/m;

    .line 64
    .line 65
    invoke-virtual {v0}, LQ2/m;->j()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->j:LQ2/m;

    .line 72
    .line 73
    invoke-virtual {v0}, LQ2/m;->f()V

    .line 74
    .line 75
    .line 76
    :cond_3
    :goto_0
    return-void
.end method

.method public g(J)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->j:LQ2/m;

    .line 2
    .line 3
    invoke-virtual {v0}, LQ2/m;->i()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_4

    .line 8
    .line 9
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->R()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->j:LQ2/m;

    .line 17
    .line 18
    invoke-virtual {v0}, LQ2/m;->j()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->u:LN2/e;

    .line 25
    .line 26
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->d:Landroidx/media3/exoplayer/hls/c;

    .line 30
    .line 31
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->u:LN2/e;

    .line 32
    .line 33
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/l;->o:Ljava/util/List;

    .line 34
    .line 35
    invoke-virtual {v0, p1, p2, v1, v2}, Landroidx/media3/exoplayer/hls/c;->z(JLN2/e;Ljava/util/List;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_4

    .line 40
    .line 41
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->j:LQ2/m;

    .line 42
    .line 43
    invoke-virtual {p1}, LQ2/m;->f()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->o:Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    :goto_0
    if-lez v0, :cond_2

    .line 54
    .line 55
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->d:Landroidx/media3/exoplayer/hls/c;

    .line 56
    .line 57
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/l;->o:Ljava/util/List;

    .line 58
    .line 59
    add-int/lit8 v3, v0, -0x1

    .line 60
    .line 61
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, Landroidx/media3/exoplayer/hls/e;

    .line 66
    .line 67
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/hls/c;->d(Landroidx/media3/exoplayer/hls/e;)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    const/4 v2, 0x2

    .line 72
    if-ne v1, v2, :cond_2

    .line 73
    .line 74
    add-int/lit8 v0, v0, -0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->o:Ljava/util/List;

    .line 78
    .line 79
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-ge v0, v1, :cond_3

    .line 84
    .line 85
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/hls/l;->I(I)V

    .line 86
    .line 87
    .line 88
    :cond_3
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->d:Landroidx/media3/exoplayer/hls/c;

    .line 89
    .line 90
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->o:Ljava/util/List;

    .line 91
    .line 92
    invoke-virtual {v0, p1, p2, v1}, Landroidx/media3/exoplayer/hls/c;->i(JLjava/util/List;)I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    iget-object p2, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    if-ge p1, p2, :cond_4

    .line 103
    .line 104
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/hls/l;->I(I)V

    .line 105
    .line 106
    .line 107
    :cond_4
    :goto_1
    return-void
.end method

.method public bridge synthetic h(LQ2/m$e;JJZ)V
    .locals 0

    .line 1
    check-cast p1, LN2/e;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p6}, Landroidx/media3/exoplayer/hls/l;->Z(LN2/e;JJZ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public varargs h0([Lq2/a0;I[I)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/hls/l;->G([Lq2/a0;)LM2/n0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->I:LM2/n0;

    .line 6
    .line 7
    new-instance p1, Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->X:Ljava/util/Set;

    .line 13
    .line 14
    array-length p1, p3

    .line 15
    const/4 v0, 0x0

    .line 16
    :goto_0
    if-ge v0, p1, :cond_0

    .line 17
    .line 18
    aget v1, p3, v0

    .line 19
    .line 20
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/l;->X:Ljava/util/Set;

    .line 21
    .line 22
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->I:LM2/n0;

    .line 23
    .line 24
    invoke-virtual {v3, v1}, LM2/n0;->b(I)Lq2/a0;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iput p2, p0, Landroidx/media3/exoplayer/hls/l;->Z:I

    .line 35
    .line 36
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->r:Landroid/os/Handler;

    .line 37
    .line 38
    iget-object p2, p0, Landroidx/media3/exoplayer/hls/l;->c:Landroidx/media3/exoplayer/hls/l$b;

    .line 39
    .line 40
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    new-instance p3, LG2/g;

    .line 44
    .line 45
    invoke-direct {p3, p2}, LG2/g;-><init>(Landroidx/media3/exoplayer/hls/l$b;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 49
    .line 50
    .line 51
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->p0()V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public i0(ILA2/J;Lz2/f;I)I
    .locals 10

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->R()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x3

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v2, 0x0

    .line 16
    if-nez v0, :cond_3

    .line 17
    .line 18
    move v0, v2

    .line 19
    :goto_0
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    add-int/lit8 v3, v3, -0x1

    .line 26
    .line 27
    if-ge v0, v3, :cond_1

    .line 28
    .line 29
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Landroidx/media3/exoplayer/hls/e;

    .line 36
    .line 37
    invoke-direct {p0, v3}, Landroidx/media3/exoplayer/hls/l;->K(Landroidx/media3/exoplayer/hls/e;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-static {v3, v2, v0}, Lt2/a0;->k1(Ljava/util/List;II)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Landroidx/media3/exoplayer/hls/e;

    .line 58
    .line 59
    iget-object v5, v0, LN2/e;->d:Lq2/x;

    .line 60
    .line 61
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->G:Lq2/x;

    .line 62
    .line 63
    invoke-virtual {v5, v3}, Lq2/x;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-nez v3, :cond_2

    .line 68
    .line 69
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->k:LM2/L$a;

    .line 70
    .line 71
    iget v4, p0, Landroidx/media3/exoplayer/hls/l;->b:I

    .line 72
    .line 73
    iget v6, v0, LN2/e;->e:I

    .line 74
    .line 75
    iget-object v7, v0, LN2/e;->f:Ljava/lang/Object;

    .line 76
    .line 77
    iget-wide v8, v0, LN2/e;->g:J

    .line 78
    .line 79
    invoke-virtual/range {v3 .. v9}, LM2/L$a;->j(ILq2/x;ILjava/lang/Object;J)V

    .line 80
    .line 81
    .line 82
    :cond_2
    iput-object v5, p0, Landroidx/media3/exoplayer/hls/l;->G:Lq2/x;

    .line 83
    .line 84
    :cond_3
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_4

    .line 91
    .line 92
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, Landroidx/media3/exoplayer/hls/e;

    .line 99
    .line 100
    invoke-virtual {v0}, Landroidx/media3/exoplayer/hls/e;->r()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-nez v0, :cond_4

    .line 105
    .line 106
    return v1

    .line 107
    :cond_4
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 108
    .line 109
    aget-object v0, v0, p1

    .line 110
    .line 111
    iget-boolean v1, p0, Landroidx/media3/exoplayer/hls/l;->s0:Z

    .line 112
    .line 113
    invoke-virtual {v0, p2, p3, p4, v1}, LM2/b0;->U(LA2/J;Lz2/f;IZ)I

    .line 114
    .line 115
    .line 116
    move-result p3

    .line 117
    const/4 p4, -0x5

    .line 118
    if-ne p3, p4, :cond_8

    .line 119
    .line 120
    iget-object p4, p2, LA2/J;->b:Lq2/x;

    .line 121
    .line 122
    invoke-static {p4}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p4

    .line 126
    check-cast p4, Lq2/x;

    .line 127
    .line 128
    iget v0, p0, Landroidx/media3/exoplayer/hls/l;->B:I

    .line 129
    .line 130
    if-ne p1, v0, :cond_7

    .line 131
    .line 132
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 133
    .line 134
    aget-object p1, v0, p1

    .line 135
    .line 136
    invoke-virtual {p1}, LM2/b0;->S()J

    .line 137
    .line 138
    .line 139
    move-result-wide v0

    .line 140
    invoke-static {v0, v1}, LS9/f;->e(J)I

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    :goto_1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-ge v2, v0, :cond_5

    .line 151
    .line 152
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    check-cast v0, Landroidx/media3/exoplayer/hls/e;

    .line 159
    .line 160
    iget v0, v0, Landroidx/media3/exoplayer/hls/e;->k:I

    .line 161
    .line 162
    if-eq v0, p1, :cond_5

    .line 163
    .line 164
    add-int/lit8 v2, v2, 0x1

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_5
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 168
    .line 169
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    if-ge v2, p1, :cond_6

    .line 174
    .line 175
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 176
    .line 177
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    check-cast p1, Landroidx/media3/exoplayer/hls/e;

    .line 182
    .line 183
    iget-object p1, p1, LN2/e;->d:Lq2/x;

    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_6
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->F:Lq2/x;

    .line 187
    .line 188
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    check-cast p1, Lq2/x;

    .line 193
    .line 194
    :goto_2
    invoke-virtual {p4, p1}, Lq2/x;->m(Lq2/x;)Lq2/x;

    .line 195
    .line 196
    .line 197
    move-result-object p4

    .line 198
    :cond_7
    iput-object p4, p2, LA2/J;->b:Lq2/x;

    .line 199
    .line 200
    :cond_8
    return p3
.end method

.method public bridge synthetic j(LQ2/m$e;JJ)V
    .locals 0

    .line 1
    check-cast p1, LN2/e;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, Landroidx/media3/exoplayer/hls/l;->a0(LN2/e;JJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public j0()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->D:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    invoke-virtual {v3}, LM2/b0;->T()V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->d:Landroidx/media3/exoplayer/hls/c;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/media3/exoplayer/hls/c;->v()V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->j:LQ2/m;

    .line 25
    .line 26
    invoke-virtual {v0, p0}, LQ2/m;->m(LQ2/m$f;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->r:Landroid/os/Handler;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    iput-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->H:Z

    .line 37
    .line 38
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->s:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public m()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_0

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3}, LM2/b0;->V()V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method

.method public m0(JZ)Z
    .locals 6

    .line 1
    iput-wide p1, p0, Landroidx/media3/exoplayer/hls/l;->o0:J

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->R()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iput-wide p1, p0, Landroidx/media3/exoplayer/hls/l;->p0:J

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->d:Landroidx/media3/exoplayer/hls/c;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/media3/exoplayer/hls/c;->n()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    move v0, v2

    .line 23
    :goto_0
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-ge v0, v3, :cond_2

    .line 30
    .line 31
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Landroidx/media3/exoplayer/hls/e;

    .line 38
    .line 39
    iget-wide v4, v3, LN2/e;->g:J

    .line 40
    .line 41
    cmp-long v4, v4, p1

    .line 42
    .line 43
    if-nez v4, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const/4 v3, 0x0

    .line 50
    :goto_1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->C:Z

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    if-nez p3, :cond_3

    .line 55
    .line 56
    iget-object p3, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-virtual {p3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result p3

    .line 62
    if-nez p3, :cond_3

    .line 63
    .line 64
    invoke-direct {p0, p1, p2, v3}, Landroidx/media3/exoplayer/hls/l;->l0(JLandroidx/media3/exoplayer/hls/e;)Z

    .line 65
    .line 66
    .line 67
    move-result p3

    .line 68
    if-eqz p3, :cond_3

    .line 69
    .line 70
    return v2

    .line 71
    :cond_3
    iput-wide p1, p0, Landroidx/media3/exoplayer/hls/l;->p0:J

    .line 72
    .line 73
    iput-boolean v2, p0, Landroidx/media3/exoplayer/hls/l;->s0:Z

    .line 74
    .line 75
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->j:LQ2/m;

    .line 81
    .line 82
    invoke-virtual {p1}, LQ2/m;->j()Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_5

    .line 87
    .line 88
    iget-boolean p1, p0, Landroidx/media3/exoplayer/hls/l;->C:Z

    .line 89
    .line 90
    if-eqz p1, :cond_4

    .line 91
    .line 92
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 93
    .line 94
    array-length p2, p1

    .line 95
    :goto_2
    if-ge v2, p2, :cond_4

    .line 96
    .line 97
    aget-object p3, p1, v2

    .line 98
    .line 99
    invoke-virtual {p3}, LM2/b0;->s()V

    .line 100
    .line 101
    .line 102
    add-int/lit8 v2, v2, 0x1

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_4
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->j:LQ2/m;

    .line 106
    .line 107
    invoke-virtual {p1}, LQ2/m;->f()V

    .line 108
    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_5
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->j:LQ2/m;

    .line 112
    .line 113
    invoke-virtual {p1}, LQ2/m;->g()V

    .line 114
    .line 115
    .line 116
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->k0()V

    .line 117
    .line 118
    .line 119
    :goto_3
    return v1
.end method

.method public bridge synthetic n(LQ2/m$e;JJLjava/io/IOException;I)LQ2/m$c;
    .locals 0

    .line 1
    check-cast p1, LN2/e;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p7}, Landroidx/media3/exoplayer/hls/l;->b0(LN2/e;JJLjava/io/IOException;I)LQ2/m$c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public n0([LP2/A;[Z[LM2/c0;[ZJZ)Z
    .locals 13

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    move-wide/from16 v2, p5

    .line 4
    .line 5
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->z()V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Landroidx/media3/exoplayer/hls/l;->E:I

    .line 9
    .line 10
    const/4 v10, 0x0

    .line 11
    move v4, v10

    .line 12
    :goto_0
    array-length v5, p1

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v11, 0x1

    .line 15
    if-ge v4, v5, :cond_2

    .line 16
    .line 17
    aget-object v5, v0, v4

    .line 18
    .line 19
    check-cast v5, Landroidx/media3/exoplayer/hls/h;

    .line 20
    .line 21
    if-eqz v5, :cond_1

    .line 22
    .line 23
    aget-object v7, p1, v4

    .line 24
    .line 25
    if-eqz v7, :cond_0

    .line 26
    .line 27
    aget-boolean v7, p2, v4

    .line 28
    .line 29
    if-nez v7, :cond_1

    .line 30
    .line 31
    :cond_0
    iget v7, p0, Landroidx/media3/exoplayer/hls/l;->E:I

    .line 32
    .line 33
    sub-int/2addr v7, v11

    .line 34
    iput v7, p0, Landroidx/media3/exoplayer/hls/l;->E:I

    .line 35
    .line 36
    invoke-virtual {v5}, Landroidx/media3/exoplayer/hls/h;->d()V

    .line 37
    .line 38
    .line 39
    aput-object v6, v0, v4

    .line 40
    .line 41
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    if-nez p7, :cond_5

    .line 45
    .line 46
    iget-boolean v4, p0, Landroidx/media3/exoplayer/hls/l;->r0:Z

    .line 47
    .line 48
    if-eqz v4, :cond_3

    .line 49
    .line 50
    if-nez v1, :cond_4

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    iget-wide v4, p0, Landroidx/media3/exoplayer/hls/l;->o0:J

    .line 54
    .line 55
    cmp-long v1, v2, v4

    .line 56
    .line 57
    if-eqz v1, :cond_4

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_4
    move v1, v10

    .line 61
    goto :goto_2

    .line 62
    :cond_5
    :goto_1
    move v1, v11

    .line 63
    :goto_2
    iget-object v4, p0, Landroidx/media3/exoplayer/hls/l;->d:Landroidx/media3/exoplayer/hls/c;

    .line 64
    .line 65
    invoke-virtual {v4}, Landroidx/media3/exoplayer/hls/c;->m()LP2/A;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    move v12, v1

    .line 70
    move-object v5, v4

    .line 71
    move v1, v10

    .line 72
    :goto_3
    array-length v7, p1

    .line 73
    if-ge v1, v7, :cond_a

    .line 74
    .line 75
    aget-object v7, p1, v1

    .line 76
    .line 77
    if-nez v7, :cond_6

    .line 78
    .line 79
    goto :goto_5

    .line 80
    :cond_6
    iget-object v8, p0, Landroidx/media3/exoplayer/hls/l;->I:LM2/n0;

    .line 81
    .line 82
    invoke-interface {v7}, LP2/E;->m()Lq2/a0;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    invoke-virtual {v8, v9}, LM2/n0;->d(Lq2/a0;)I

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    iget v9, p0, Landroidx/media3/exoplayer/hls/l;->Z:I

    .line 91
    .line 92
    if-ne v8, v9, :cond_7

    .line 93
    .line 94
    iget-object v5, p0, Landroidx/media3/exoplayer/hls/l;->d:Landroidx/media3/exoplayer/hls/c;

    .line 95
    .line 96
    invoke-virtual {v5, v7}, Landroidx/media3/exoplayer/hls/c;->y(LP2/A;)V

    .line 97
    .line 98
    .line 99
    move-object v5, v7

    .line 100
    :cond_7
    aget-object v7, v0, v1

    .line 101
    .line 102
    if-nez v7, :cond_9

    .line 103
    .line 104
    iget v7, p0, Landroidx/media3/exoplayer/hls/l;->E:I

    .line 105
    .line 106
    add-int/2addr v7, v11

    .line 107
    iput v7, p0, Landroidx/media3/exoplayer/hls/l;->E:I

    .line 108
    .line 109
    new-instance v7, Landroidx/media3/exoplayer/hls/h;

    .line 110
    .line 111
    invoke-direct {v7, p0, v8}, Landroidx/media3/exoplayer/hls/h;-><init>(Landroidx/media3/exoplayer/hls/l;I)V

    .line 112
    .line 113
    .line 114
    aput-object v7, v0, v1

    .line 115
    .line 116
    aput-boolean v11, p4, v1

    .line 117
    .line 118
    iget-object v9, p0, Landroidx/media3/exoplayer/hls/l;->Y:[I

    .line 119
    .line 120
    if-eqz v9, :cond_9

    .line 121
    .line 122
    invoke-virtual {v7}, Landroidx/media3/exoplayer/hls/h;->a()V

    .line 123
    .line 124
    .line 125
    if-nez v12, :cond_9

    .line 126
    .line 127
    iget-object v7, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 128
    .line 129
    iget-object v9, p0, Landroidx/media3/exoplayer/hls/l;->Y:[I

    .line 130
    .line 131
    aget v8, v9, v8

    .line 132
    .line 133
    aget-object v7, v7, v8

    .line 134
    .line 135
    invoke-virtual {v7}, LM2/b0;->F()I

    .line 136
    .line 137
    .line 138
    move-result v8

    .line 139
    if-eqz v8, :cond_8

    .line 140
    .line 141
    invoke-virtual {v7, v2, v3, v11}, LM2/b0;->b0(JZ)Z

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    if-nez v7, :cond_8

    .line 146
    .line 147
    move v7, v11

    .line 148
    goto :goto_4

    .line 149
    :cond_8
    move v7, v10

    .line 150
    :goto_4
    move v12, v7

    .line 151
    :cond_9
    :goto_5
    add-int/lit8 v1, v1, 0x1

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_a
    iget p1, p0, Landroidx/media3/exoplayer/hls/l;->E:I

    .line 155
    .line 156
    if-nez p1, :cond_d

    .line 157
    .line 158
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->d:Landroidx/media3/exoplayer/hls/c;

    .line 159
    .line 160
    invoke-virtual {p1}, Landroidx/media3/exoplayer/hls/c;->v()V

    .line 161
    .line 162
    .line 163
    iput-object v6, p0, Landroidx/media3/exoplayer/hls/l;->G:Lq2/x;

    .line 164
    .line 165
    iput-boolean v11, p0, Landroidx/media3/exoplayer/hls/l;->q0:Z

    .line 166
    .line 167
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 168
    .line 169
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 170
    .line 171
    .line 172
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->j:LQ2/m;

    .line 173
    .line 174
    invoke-virtual {p1}, LQ2/m;->j()Z

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    if-eqz p1, :cond_c

    .line 179
    .line 180
    iget-boolean p1, p0, Landroidx/media3/exoplayer/hls/l;->C:Z

    .line 181
    .line 182
    if-eqz p1, :cond_b

    .line 183
    .line 184
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 185
    .line 186
    array-length v1, p1

    .line 187
    :goto_6
    if-ge v10, v1, :cond_b

    .line 188
    .line 189
    aget-object v2, p1, v10

    .line 190
    .line 191
    invoke-virtual {v2}, LM2/b0;->s()V

    .line 192
    .line 193
    .line 194
    add-int/lit8 v10, v10, 0x1

    .line 195
    .line 196
    goto :goto_6

    .line 197
    :cond_b
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->j:LQ2/m;

    .line 198
    .line 199
    invoke-virtual {p1}, LQ2/m;->f()V

    .line 200
    .line 201
    .line 202
    goto :goto_9

    .line 203
    :cond_c
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->k0()V

    .line 204
    .line 205
    .line 206
    goto :goto_9

    .line 207
    :cond_d
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 208
    .line 209
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    if-nez p1, :cond_10

    .line 214
    .line 215
    invoke-static {v5, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    if-nez p1, :cond_10

    .line 220
    .line 221
    iget-boolean p1, p0, Landroidx/media3/exoplayer/hls/l;->r0:Z

    .line 222
    .line 223
    if-nez p1, :cond_f

    .line 224
    .line 225
    const-wide/16 v6, 0x0

    .line 226
    .line 227
    cmp-long p1, v2, v6

    .line 228
    .line 229
    if-gez p1, :cond_e

    .line 230
    .line 231
    neg-long v6, v2

    .line 232
    :cond_e
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->M()Landroidx/media3/exoplayer/hls/e;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->d:Landroidx/media3/exoplayer/hls/c;

    .line 237
    .line 238
    invoke-virtual {v1, p1, v2, v3}, Landroidx/media3/exoplayer/hls/c;->a(Landroidx/media3/exoplayer/hls/e;J)[LN2/n;

    .line 239
    .line 240
    .line 241
    move-result-object v9

    .line 242
    move-object v1, v5

    .line 243
    move-wide v4, v6

    .line 244
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    iget-object v8, p0, Landroidx/media3/exoplayer/hls/l;->o:Ljava/util/List;

    .line 250
    .line 251
    invoke-interface/range {v1 .. v9}, LP2/A;->k(JJJLjava/util/List;[LN2/n;)V

    .line 252
    .line 253
    .line 254
    iget-object v4, p0, Landroidx/media3/exoplayer/hls/l;->d:Landroidx/media3/exoplayer/hls/c;

    .line 255
    .line 256
    invoke-virtual {v4}, Landroidx/media3/exoplayer/hls/c;->l()Lq2/a0;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    iget-object p1, p1, LN2/e;->d:Lq2/x;

    .line 261
    .line 262
    invoke-virtual {v4, p1}, Lq2/a0;->d(Lq2/x;)I

    .line 263
    .line 264
    .line 265
    move-result p1

    .line 266
    invoke-interface {v1}, LP2/A;->p()I

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    if-eq v1, p1, :cond_10

    .line 271
    .line 272
    :cond_f
    iput-boolean v11, p0, Landroidx/media3/exoplayer/hls/l;->q0:Z

    .line 273
    .line 274
    move p1, v11

    .line 275
    move v12, p1

    .line 276
    goto :goto_7

    .line 277
    :cond_10
    move/from16 p1, p7

    .line 278
    .line 279
    :goto_7
    if-eqz v12, :cond_12

    .line 280
    .line 281
    invoke-virtual {p0, v2, v3, p1}, Landroidx/media3/exoplayer/hls/l;->m0(JZ)Z

    .line 282
    .line 283
    .line 284
    :goto_8
    array-length p1, v0

    .line 285
    if-ge v10, p1, :cond_12

    .line 286
    .line 287
    aget-object p1, v0, v10

    .line 288
    .line 289
    if-eqz p1, :cond_11

    .line 290
    .line 291
    aput-boolean v11, p4, v10

    .line 292
    .line 293
    :cond_11
    add-int/lit8 v10, v10, 0x1

    .line 294
    .line 295
    goto :goto_8

    .line 296
    :cond_12
    :goto_9
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/hls/l;->u0([LM2/c0;)V

    .line 297
    .line 298
    .line 299
    iput-boolean v11, p0, Landroidx/media3/exoplayer/hls/l;->r0:Z

    .line 300
    .line 301
    return v12
.end method

.method public o()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/hls/l;->X()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->s0:Z

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->D:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string v0, "Loading finished before preparation is complete."

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-static {v0, v1}, Lq2/L;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lq2/L;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    throw v0

    .line 21
    :cond_1
    :goto_0
    return-void
.end method

.method public o0(Lq2/q;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->v0:Lq2/q;

    .line 2
    .line 3
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/l;->v0:Lq2/q;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    :goto_0
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 13
    .line 14
    array-length v2, v1

    .line 15
    if-ge v0, v2, :cond_1

    .line 16
    .line 17
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/l;->n0:[Z

    .line 18
    .line 19
    aget-boolean v2, v2, v0

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    aget-object v1, v1, v0

    .line 24
    .line 25
    invoke-virtual {v1, p1}, Landroidx/media3/exoplayer/hls/l$d;->k0(Lq2/q;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return-void
.end method

.method public p()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->t0:Z

    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->r:Landroid/os/Handler;

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/l;->q:Ljava/lang/Runnable;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public q()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->j:LQ2/m;

    .line 2
    .line 3
    invoke-virtual {v0}, LQ2/m;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public q0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->d:Landroidx/media3/exoplayer/hls/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/hls/c;->x(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public r0(J)V
    .locals 4

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/hls/l;->u0:J

    .line 2
    .line 3
    cmp-long v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput-wide p1, p0, Landroidx/media3/exoplayer/hls/l;->u0:J

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 10
    .line 11
    array-length v1, v0

    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    if-ge v2, v1, :cond_0

    .line 14
    .line 15
    aget-object v3, v0, v2

    .line 16
    .line 17
    invoke-virtual {v3, p1, p2}, LM2/b0;->c0(J)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method public s()LM2/n0;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->z()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->I:LM2/n0;

    .line 5
    .line 6
    return-object v0
.end method

.method public s0(IJ)I
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->R()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 10
    .line 11
    aget-object v0, v0, p1

    .line 12
    .line 13
    iget-boolean v1, p0, Landroidx/media3/exoplayer/hls/l;->s0:Z

    .line 14
    .line 15
    invoke-virtual {v0, p2, p3, v1}, LM2/b0;->H(JZ)I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    iget-object p3, p0, Landroidx/media3/exoplayer/hls/l;->n:Ljava/util/ArrayList;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-static {p3, v1}, LP9/x;->e(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    check-cast p3, Landroidx/media3/exoplayer/hls/e;

    .line 27
    .line 28
    if-eqz p3, :cond_1

    .line 29
    .line 30
    invoke-virtual {p3}, Landroidx/media3/exoplayer/hls/e;->r()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0}, LM2/b0;->F()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {p3, p1}, Landroidx/media3/exoplayer/hls/e;->n(I)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    sub-int/2addr p1, v1

    .line 45
    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    :cond_1
    invoke-virtual {v0, p2}, LM2/b0;->g0(I)V

    .line 50
    .line 51
    .line 52
    return p2
.end method

.method public t(LU2/J;)V
    .locals 0

    .line 1
    return-void
.end method

.method public t0(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->z()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->Y:[I

    .line 5
    .line 6
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->Y:[I

    .line 10
    .line 11
    aget p1, v0, p1

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->m0:[Z

    .line 14
    .line 15
    aget-boolean v0, v0, p1

    .line 16
    .line 17
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->m0:[Z

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    aput-boolean v1, v0, p1

    .line 24
    .line 25
    return-void
.end method

.method public u(JZ)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/l;->C:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/l;->R()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 13
    .line 14
    array-length v0, v0

    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-ge v1, v0, :cond_1

    .line 17
    .line 18
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/l;->v:[Landroidx/media3/exoplayer/hls/l$d;

    .line 19
    .line 20
    aget-object v2, v2, v1

    .line 21
    .line 22
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/l;->m0:[Z

    .line 23
    .line 24
    aget-boolean v3, v3, v1

    .line 25
    .line 26
    invoke-virtual {v2, p1, p2, p3, v3}, LM2/b0;->r(JZZ)V

    .line 27
    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    :goto_1
    return-void
.end method

.method public bridge synthetic v(LQ2/m$e;JJI)V
    .locals 0

    .line 1
    check-cast p1, LN2/e;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p6}, Landroidx/media3/exoplayer/hls/l;->c0(LN2/e;JJI)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
