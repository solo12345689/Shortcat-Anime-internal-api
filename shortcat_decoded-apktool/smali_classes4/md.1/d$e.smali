.class final Lmd/d$e;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmd/d;->t(Ljava/lang/String;DLjava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:J

.field b:Ljava/lang/Object;

.field c:I

.field final synthetic d:Lmd/d;

.field final synthetic e:D

.field final synthetic f:Ljava/lang/String;

.field final synthetic g:Ljava/util/Map;

.field final synthetic h:Ljava/lang/Integer;

.field final synthetic i:Ljava/lang/Integer;


# direct methods
.method constructor <init>(Lmd/d;DLjava/lang/String;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Integer;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lmd/d$e;->d:Lmd/d;

    .line 2
    .line 3
    iput-wide p2, p0, Lmd/d$e;->e:D

    .line 4
    .line 5
    iput-object p4, p0, Lmd/d$e;->f:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p5, p0, Lmd/d$e;->g:Ljava/util/Map;

    .line 8
    .line 9
    iput-object p6, p0, Lmd/d$e;->h:Ljava/lang/Integer;

    .line 10
    .line 11
    iput-object p7, p0, Lmd/d$e;->i:Ljava/lang/Integer;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 9

    .line 1
    new-instance v0, Lmd/d$e;

    .line 2
    .line 3
    iget-object v1, p0, Lmd/d$e;->d:Lmd/d;

    .line 4
    .line 5
    iget-wide v2, p0, Lmd/d$e;->e:D

    .line 6
    .line 7
    iget-object v4, p0, Lmd/d$e;->f:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v5, p0, Lmd/d$e;->g:Ljava/util/Map;

    .line 10
    .line 11
    iget-object v6, p0, Lmd/d$e;->h:Ljava/lang/Integer;

    .line 12
    .line 13
    iget-object v7, p0, Lmd/d$e;->i:Ljava/lang/Integer;

    .line 14
    .line 15
    move-object v8, p2

    .line 16
    invoke-direct/range {v0 .. v8}, Lmd/d$e;-><init>(Lmd/d;DLjava/lang/String;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Integer;LZd/e;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lmd/d$e;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lmd/d$e;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lmd/d$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lmd/d$e;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v7

    .line 7
    iget v0, v6, Lmd/d$e;->c:I

    .line 8
    .line 9
    const/4 v8, 0x3

    .line 10
    const/4 v9, 0x2

    .line 11
    const/4 v1, 0x1

    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    if-eq v0, v1, :cond_2

    .line 15
    .line 16
    if-eq v0, v9, :cond_1

    .line 17
    .line 18
    if-ne v0, v8, :cond_0

    .line 19
    .line 20
    iget-wide v0, v6, Lmd/d$e;->a:J

    .line 21
    .line 22
    :try_start_0
    invoke-static/range {p1 .. p1}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    move-wide v2, v0

    .line 26
    move-object/from16 v0, p1

    .line 27
    .line 28
    goto/16 :goto_4

    .line 29
    .line 30
    :catch_0
    move-exception v0

    .line 31
    goto/16 :goto_5

    .line 32
    .line 33
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 36
    .line 37
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v0

    .line 41
    :cond_1
    iget-wide v0, v6, Lmd/d$e;->a:J

    .line 42
    .line 43
    iget-object v2, v6, Lmd/d$e;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v2, Landroidx/media3/exoplayer/ExoPlayer;

    .line 46
    .line 47
    :try_start_1
    invoke-static/range {p1 .. p1}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 48
    .line 49
    .line 50
    move-wide/from16 v16, v0

    .line 51
    .line 52
    move-object v1, v2

    .line 53
    move-wide/from16 v2, v16

    .line 54
    .line 55
    goto/16 :goto_2

    .line 56
    .line 57
    :cond_2
    iget-wide v0, v6, Lmd/d$e;->a:J

    .line 58
    .line 59
    iget-object v2, v6, Lmd/d$e;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, Landroidx/media3/exoplayer/ExoPlayer;

    .line 62
    .line 63
    :try_start_2
    invoke-static/range {p1 .. p1}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    invoke-static/range {p1 .. p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 71
    .line 72
    .line 73
    move-result-wide v3

    .line 74
    iget-object v0, v6, Lmd/d$e;->d:Lmd/d;

    .line 75
    .line 76
    iget-wide v10, v6, Lmd/d$e;->e:D

    .line 77
    .line 78
    new-instance v2, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    const-string v5, "Starting extraction at "

    .line 84
    .line 85
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v10, v11}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v5, "s"

    .line 92
    .line 93
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-static {v0, v2}, Lmd/d;->g(Lmd/d;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :try_start_3
    iget-object v0, v6, Lmd/d$e;->d:Lmd/d;

    .line 104
    .line 105
    invoke-static {v0}, Lmd/d;->c(Lmd/d;)V

    .line 106
    .line 107
    .line 108
    iget-object v0, v6, Lmd/d$e;->d:Lmd/d;

    .line 109
    .line 110
    invoke-static {v0}, Lmd/d;->i(Lmd/d;)Landroidx/media3/exoplayer/ExoPlayer;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    iget-object v2, v6, Lmd/d$e;->d:Lmd/d;

    .line 115
    .line 116
    iget-object v5, v6, Lmd/d$e;->f:Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {v2, v5}, Lmd/d;->k(Lmd/d;Ljava/lang/String;)Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-eqz v2, :cond_5

    .line 123
    .line 124
    iget-object v2, v6, Lmd/d$e;->d:Lmd/d;

    .line 125
    .line 126
    move-object v5, v2

    .line 127
    iget-object v2, v6, Lmd/d$e;->f:Ljava/lang/String;

    .line 128
    .line 129
    move-object v10, v5

    .line 130
    iget-object v5, v6, Lmd/d$e;->g:Ljava/util/Map;

    .line 131
    .line 132
    iput-object v0, v6, Lmd/d$e;->b:Ljava/lang/Object;

    .line 133
    .line 134
    iput-wide v3, v6, Lmd/d$e;->a:J

    .line 135
    .line 136
    iput v1, v6, Lmd/d$e;->c:I

    .line 137
    .line 138
    move-object v1, v0

    .line 139
    move-object v0, v10

    .line 140
    invoke-static/range {v0 .. v6}, Lmd/d;->f(Lmd/d;Landroidx/media3/exoplayer/ExoPlayer;Ljava/lang/String;JLjava/util/Map;LZd/e;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    if-ne v0, v7, :cond_4

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_4
    move-object v2, v1

    .line 148
    move-wide v0, v3

    .line 149
    :goto_0
    move-wide v14, v0

    .line 150
    move-object v11, v2

    .line 151
    goto :goto_1

    .line 152
    :cond_5
    move-object v1, v0

    .line 153
    move-object v11, v1

    .line 154
    move-wide v14, v3

    .line 155
    :goto_1
    iget-object v10, v6, Lmd/d$e;->d:Lmd/d;

    .line 156
    .line 157
    iget-wide v12, v6, Lmd/d$e;->e:D

    .line 158
    .line 159
    invoke-static/range {v10 .. v15}, Lmd/d;->j(Lmd/d;Landroidx/media3/exoplayer/ExoPlayer;DJ)V

    .line 160
    .line 161
    .line 162
    iget-object v0, v6, Lmd/d$e;->d:Lmd/d;

    .line 163
    .line 164
    iput-object v11, v6, Lmd/d$e;->b:Ljava/lang/Object;

    .line 165
    .line 166
    iput-wide v14, v6, Lmd/d$e;->a:J

    .line 167
    .line 168
    iput v9, v6, Lmd/d$e;->c:I

    .line 169
    .line 170
    invoke-static {v0, v11, v14, v15, v6}, Lmd/d;->l(Lmd/d;Landroidx/media3/exoplayer/ExoPlayer;JLZd/e;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    if-ne v0, v7, :cond_6

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_6
    move-object v1, v11

    .line 178
    move-wide v2, v14

    .line 179
    :goto_2
    iget-object v0, v6, Lmd/d$e;->d:Lmd/d;

    .line 180
    .line 181
    iget-object v4, v6, Lmd/d$e;->h:Ljava/lang/Integer;

    .line 182
    .line 183
    iget-object v5, v6, Lmd/d$e;->i:Ljava/lang/Integer;

    .line 184
    .line 185
    const/4 v9, 0x0

    .line 186
    iput-object v9, v6, Lmd/d$e;->b:Ljava/lang/Object;

    .line 187
    .line 188
    iput-wide v2, v6, Lmd/d$e;->a:J

    .line 189
    .line 190
    iput v8, v6, Lmd/d$e;->c:I

    .line 191
    .line 192
    invoke-static/range {v0 .. v6}, Lmd/d;->d(Lmd/d;Landroidx/media3/exoplayer/ExoPlayer;JLjava/lang/Integer;Ljava/lang/Integer;LZd/e;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    if-ne v0, v7, :cond_7

    .line 197
    .line 198
    :goto_3
    return-object v7

    .line 199
    :cond_7
    :goto_4
    check-cast v0, Landroid/graphics/Bitmap;

    .line 200
    .line 201
    iget-object v1, v6, Lmd/d$e;->d:Lmd/d;

    .line 202
    .line 203
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 204
    .line 205
    .line 206
    move-result-wide v4

    .line 207
    sub-long/2addr v4, v2

    .line 208
    new-instance v2, Ljava/lang/StringBuilder;

    .line 209
    .line 210
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 211
    .line 212
    .line 213
    const-string v3, "Extraction completed in "

    .line 214
    .line 215
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    const-string v3, "ms"

    .line 222
    .line 223
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    invoke-static {v1, v2}, Lmd/d;->g(Lmd/d;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 231
    .line 232
    .line 233
    return-object v0

    .line 234
    :goto_5
    iget-object v1, v6, Lmd/d$e;->d:Lmd/d;

    .line 235
    .line 236
    const-string v2, "Extraction failed"

    .line 237
    .line 238
    invoke-static {v1, v2, v0}, Lmd/d;->h(Lmd/d;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 239
    .line 240
    .line 241
    iget-object v1, v6, Lmd/d$e;->d:Lmd/d;

    .line 242
    .line 243
    invoke-virtual {v1}, Lmd/d;->z()V

    .line 244
    .line 245
    .line 246
    instance-of v1, v0, Lmd/a;

    .line 247
    .line 248
    if-nez v1, :cond_9

    .line 249
    .line 250
    new-instance v1, Lmd/a;

    .line 251
    .line 252
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    if-nez v0, :cond_8

    .line 257
    .line 258
    const-string v0, "Unknown error"

    .line 259
    .line 260
    :cond_8
    invoke-direct {v1, v0}, Lmd/a;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    move-object v0, v1

    .line 264
    :cond_9
    throw v0
.end method
