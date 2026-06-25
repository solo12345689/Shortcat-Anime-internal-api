.class public final Lexpo/modules/video/player/VideoPlayer$g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lq2/P$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/video/player/VideoPlayer;-><init>(Landroid/content/Context;LUb/d;Lexpo/modules/video/records/VideoSource;Lexpo/modules/video/records/PlayerBuilderOptions;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lexpo/modules/video/player/VideoPlayer;


# direct methods
.method constructor <init>(Lexpo/modules/video/player/VideoPlayer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public E(Lq2/C;I)V
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 4
    .line 5
    new-instance v1, Lexpo/modules/video/player/a$h;

    .line 6
    .line 7
    invoke-direct {v1}, Lexpo/modules/video/player/a$h;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lexpo/modules/video/player/VideoPlayer;->A1(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/player/a;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 15
    .line 16
    invoke-static {v0}, Lexpo/modules/video/player/VideoPlayer;->y1(Lexpo/modules/video/player/VideoPlayer;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 20
    .line 21
    invoke-virtual {v0}, Lexpo/modules/video/player/VideoPlayer;->I2()LKd/p;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-virtual {v0, v1}, LKd/p;->g(Z)V

    .line 27
    .line 28
    .line 29
    invoke-super {p0, p1, p2}, Lq2/P$d;->E(Lq2/C;I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public J(I)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 5
    .line 6
    invoke-virtual {v0}, Lexpo/modules/video/player/VideoPlayer;->y2()Landroidx/media3/exoplayer/ExoPlayer;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Landroidx/media3/exoplayer/ExoPlayer;->y()Landroidx/media3/exoplayer/s;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const/4 v0, 0x3

    .line 18
    if-ne p1, v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 21
    .line 22
    invoke-static {v0}, Lexpo/modules/video/player/VideoPlayer;->u1(Lexpo/modules/video/player/VideoPlayer;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 26
    .line 27
    invoke-static {v0, p1}, Lexpo/modules/video/player/VideoPlayer;->t1(Lexpo/modules/video/player/VideoPlayer;I)Lexpo/modules/video/enums/PlayerStatus;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-static {v0, v1, v2}, Lexpo/modules/video/player/VideoPlayer;->Z1(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/enums/PlayerStatus;Lq2/N;)V

    .line 33
    .line 34
    .line 35
    invoke-super {p0, p1}, Lq2/P$d;->J(I)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public Z(Lq2/d0;)V
    .locals 6

    .line 1
    const-string v0, "parameters"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 7
    .line 8
    invoke-virtual {v0}, Lexpo/modules/video/player/VideoPlayer;->I2()LKd/p;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, LKd/p;->d()Lexpo/modules/video/records/SubtitleTrack;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 17
    .line 18
    invoke-virtual {v1}, Lexpo/modules/video/player/VideoPlayer;->i2()LKd/l;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, LKd/l;->d()Lexpo/modules/video/records/AudioTrack;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v2, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 27
    .line 28
    new-instance v3, Lexpo/modules/video/player/a$o;

    .line 29
    .line 30
    invoke-direct {v3, p1}, Lexpo/modules/video/player/a$o;-><init>(Lq2/d0;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v2, v3}, Lexpo/modules/video/player/VideoPlayer;->A1(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/player/a;)V

    .line 34
    .line 35
    .line 36
    iget-object v2, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 37
    .line 38
    invoke-virtual {v2}, Lexpo/modules/video/player/VideoPlayer;->I2()LKd/p;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v2}, LKd/p;->d()Lexpo/modules/video/records/SubtitleTrack;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    iget-object v3, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 47
    .line 48
    invoke-virtual {v3}, Lexpo/modules/video/player/VideoPlayer;->i2()LKd/l;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v3}, LKd/l;->d()Lexpo/modules/video/records/AudioTrack;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    iget-object v4, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 57
    .line 58
    new-instance v5, Lexpo/modules/video/player/a$l;

    .line 59
    .line 60
    invoke-direct {v5, v2, v0}, Lexpo/modules/video/player/a$l;-><init>(Lexpo/modules/video/records/SubtitleTrack;Lexpo/modules/video/records/SubtitleTrack;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v4, v5}, Lexpo/modules/video/player/VideoPlayer;->A1(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/player/a;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 67
    .line 68
    new-instance v2, Lexpo/modules/video/player/a$b;

    .line 69
    .line 70
    invoke-direct {v2, v3, v1}, Lexpo/modules/video/player/a$b;-><init>(Lexpo/modules/video/records/AudioTrack;Lexpo/modules/video/records/AudioTrack;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v0, v2}, Lexpo/modules/video/player/VideoPlayer;->A1(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/player/a;)V

    .line 74
    .line 75
    .line 76
    invoke-super {p0, p1}, Lq2/P$d;->Z(Lq2/d0;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public d0(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/video/player/VideoPlayer;->w2()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lexpo/modules/video/player/VideoPlayer;->t3(F)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public g0(Lq2/h0;)V
    .locals 14

    .line 1
    const-string v0, "tracks"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    iget-object v1, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 9
    .line 10
    invoke-virtual {v1}, Lexpo/modules/video/player/VideoPlayer;->I2()LKd/p;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, LKd/p;->c()Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Ljava/util/ArrayList;

    .line 22
    .line 23
    iget-object v2, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 24
    .line 25
    invoke-virtual {v2}, Lexpo/modules/video/player/VideoPlayer;->i2()LKd/l;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2}, LKd/l;->c()Ljava/util/ArrayList;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 34
    .line 35
    .line 36
    iget-object v2, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 37
    .line 38
    invoke-virtual {v2}, Lexpo/modules/video/player/VideoPlayer;->I2()LKd/p;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v2}, LKd/p;->d()Lexpo/modules/video/records/SubtitleTrack;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    iget-object v3, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 47
    .line 48
    invoke-virtual {v3}, Lexpo/modules/video/player/VideoPlayer;->i2()LKd/l;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v3}, LKd/l;->d()Lexpo/modules/video/records/AudioTrack;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    iget-object v4, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 57
    .line 58
    new-instance v5, Lexpo/modules/video/player/a$p;

    .line 59
    .line 60
    invoke-direct {v5, p1}, Lexpo/modules/video/player/a$p;-><init>(Lq2/h0;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v4, v5}, Lexpo/modules/video/player/VideoPlayer;->A1(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/player/a;)V

    .line 64
    .line 65
    .line 66
    iget-object v4, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 67
    .line 68
    invoke-virtual {v4}, Lexpo/modules/video/player/VideoPlayer;->I2()LKd/p;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {v4}, LKd/p;->c()Ljava/util/ArrayList;

    .line 73
    .line 74
    .line 75
    move-result-object v10

    .line 76
    iget-object v4, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 77
    .line 78
    invoke-virtual {v4}, Lexpo/modules/video/player/VideoPlayer;->i2()LKd/l;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual {v4}, LKd/l;->c()Ljava/util/ArrayList;

    .line 83
    .line 84
    .line 85
    move-result-object v11

    .line 86
    iget-object v4, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 87
    .line 88
    invoke-virtual {v4}, Lexpo/modules/video/player/VideoPlayer;->I2()LKd/p;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-virtual {v4}, LKd/p;->d()Lexpo/modules/video/records/SubtitleTrack;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    iget-object v5, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 97
    .line 98
    invoke-virtual {v5}, Lexpo/modules/video/player/VideoPlayer;->i2()LKd/l;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-virtual {v5}, LKd/l;->d()Lexpo/modules/video/records/AudioTrack;

    .line 103
    .line 104
    .line 105
    move-result-object v12

    .line 106
    iget-object v5, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 107
    .line 108
    invoke-virtual {v5}, Lexpo/modules/video/player/VideoPlayer;->y2()Landroidx/media3/exoplayer/ExoPlayer;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-interface {v5}, Lq2/P;->i()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    instance-of v6, v5, Landroidx/media3/exoplayer/hls/d;

    .line 117
    .line 118
    if-eqz v6, :cond_0

    .line 119
    .line 120
    check-cast v5, Landroidx/media3/exoplayer/hls/d;

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_0
    const/4 v5, 0x0

    .line 124
    :goto_0
    iget-object v6, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 125
    .line 126
    invoke-static {p1, v5}, LKd/n;->a(Lq2/h0;Landroidx/media3/exoplayer/hls/d;)Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    invoke-static {v6, v5}, Lexpo/modules/video/player/VideoPlayer;->O1(Lexpo/modules/video/player/VideoPlayer;Ljava/util/List;)V

    .line 131
    .line 132
    .line 133
    iget-object v5, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 134
    .line 135
    invoke-static {v5}, Lexpo/modules/video/player/VideoPlayer;->u1(Lexpo/modules/video/player/VideoPlayer;)V

    .line 136
    .line 137
    .line 138
    iget-object v5, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 139
    .line 140
    invoke-virtual {v5}, Lexpo/modules/video/player/VideoPlayer;->N2()Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-eqz v5, :cond_1

    .line 145
    .line 146
    iget-object v13, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 147
    .line 148
    new-instance v5, Lexpo/modules/video/player/a$q;

    .line 149
    .line 150
    invoke-static {v13}, Lexpo/modules/video/player/VideoPlayer;->a1(Lexpo/modules/video/player/VideoPlayer;)Lexpo/modules/video/records/VideoSource;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    iget-object v7, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 155
    .line 156
    invoke-virtual {v7}, Lexpo/modules/video/player/VideoPlayer;->r2()F

    .line 157
    .line 158
    .line 159
    move-result v7

    .line 160
    float-to-double v7, v7

    .line 161
    iget-object v9, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 162
    .line 163
    invoke-virtual {v9}, Lexpo/modules/video/player/VideoPlayer;->j2()Ljava/util/List;

    .line 164
    .line 165
    .line 166
    move-result-object v9

    .line 167
    invoke-direct/range {v5 .. v11}, Lexpo/modules/video/player/a$q;-><init>(Lexpo/modules/video/records/VideoSource;DLjava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 168
    .line 169
    .line 170
    invoke-static {v13, v5}, Lexpo/modules/video/player/VideoPlayer;->A1(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/player/a;)V

    .line 171
    .line 172
    .line 173
    iget-object v5, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 174
    .line 175
    const/4 v6, 0x0

    .line 176
    invoke-static {v5, v6}, Lexpo/modules/video/player/VideoPlayer;->Y1(Lexpo/modules/video/player/VideoPlayer;Z)V

    .line 177
    .line 178
    .line 179
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    invoke-virtual {v10}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    invoke-static {v5, v6}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v5

    .line 191
    if-nez v5, :cond_2

    .line 192
    .line 193
    iget-object v5, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 194
    .line 195
    new-instance v6, Lexpo/modules/video/player/a$d;

    .line 196
    .line 197
    invoke-direct {v6, v10, v0}, Lexpo/modules/video/player/a$d;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 198
    .line 199
    .line 200
    invoke-static {v5, v6}, Lexpo/modules/video/player/VideoPlayer;->A1(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/player/a;)V

    .line 201
    .line 202
    .line 203
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-virtual {v11}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    invoke-static {v0, v5}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-nez v0, :cond_3

    .line 216
    .line 217
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 218
    .line 219
    new-instance v5, Lexpo/modules/video/player/a$c;

    .line 220
    .line 221
    invoke-direct {v5, v11, v1}, Lexpo/modules/video/player/a$c;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 222
    .line 223
    .line 224
    invoke-static {v0, v5}, Lexpo/modules/video/player/VideoPlayer;->A1(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/player/a;)V

    .line 225
    .line 226
    .line 227
    :cond_3
    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-nez v0, :cond_4

    .line 232
    .line 233
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 234
    .line 235
    new-instance v1, Lexpo/modules/video/player/a$l;

    .line 236
    .line 237
    invoke-direct {v1, v4, v2}, Lexpo/modules/video/player/a$l;-><init>(Lexpo/modules/video/records/SubtitleTrack;Lexpo/modules/video/records/SubtitleTrack;)V

    .line 238
    .line 239
    .line 240
    invoke-static {v0, v1}, Lexpo/modules/video/player/VideoPlayer;->A1(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/player/a;)V

    .line 241
    .line 242
    .line 243
    :cond_4
    invoke-static {v3, v12}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-nez v0, :cond_5

    .line 248
    .line 249
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 250
    .line 251
    new-instance v1, Lexpo/modules/video/player/a$b;

    .line 252
    .line 253
    invoke-direct {v1, v12, v3}, Lexpo/modules/video/player/a$b;-><init>(Lexpo/modules/video/records/AudioTrack;Lexpo/modules/video/records/AudioTrack;)V

    .line 254
    .line 255
    .line 256
    invoke-static {v0, v1}, Lexpo/modules/video/player/VideoPlayer;->A1(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/player/a;)V

    .line 257
    .line 258
    .line 259
    :cond_5
    invoke-super {p0, p1}, Lq2/P$d;->g0(Lq2/h0;)V

    .line 260
    .line 261
    .line 262
    return-void
.end method

.method public n(Lq2/O;)V
    .locals 1

    .line 1
    const-string v0, "playbackParameters"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lexpo/modules/video/player/VideoPlayer;->i3(Lq2/O;)V

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1}, Lq2/P$d;->n(Lq2/O;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public t0(Lq2/N;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 4
    .line 5
    invoke-static {v0}, Lexpo/modules/video/player/VideoPlayer;->y1(Lexpo/modules/video/player/VideoPlayer;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lexpo/modules/video/enums/PlayerStatus;->ERROR:Lexpo/modules/video/enums/PlayerStatus;

    .line 9
    .line 10
    invoke-static {v0, v1, p1}, Lexpo/modules/video/player/VideoPlayer;->Z1(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/enums/PlayerStatus;Lq2/N;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 15
    .line 16
    invoke-virtual {v0}, Lexpo/modules/video/player/VideoPlayer;->y2()Landroidx/media3/exoplayer/ExoPlayer;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {v1}, Lq2/P;->p()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-static {v0, v1}, Lexpo/modules/video/player/VideoPlayer;->t1(Lexpo/modules/video/player/VideoPlayer;I)Lexpo/modules/video/enums/PlayerStatus;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-static {v0, v1, v2}, Lexpo/modules/video/player/VideoPlayer;->Z1(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/enums/PlayerStatus;Lq2/N;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-super {p0, p1}, Lq2/P$d;->t0(Lq2/N;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public y0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer$g;->a:Lexpo/modules/video/player/VideoPlayer;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lexpo/modules/video/player/VideoPlayer;->j3(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
