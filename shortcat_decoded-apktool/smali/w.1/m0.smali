.class public abstract Lw/m0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final synthetic a(Lw/h;JFLw/d;Lw/k;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lw/m0;->m(Lw/h;JFLw/d;Lw/k;Lkotlin/jvm/functions/Function1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final b(FFFLw/i;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lkotlin/jvm/internal/l;->a:Lkotlin/jvm/internal/l;

    .line 2
    .line 3
    invoke-static {v0}, Lw/u0;->f(Lkotlin/jvm/internal/l;)Lw/s0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    move-object v5, p3

    .line 20
    move-object v6, p4

    .line 21
    move-object v7, p5

    .line 22
    invoke-static/range {v1 .. v7}, Lw/m0;->d(Lw/s0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lw/i;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-ne p0, p1, :cond_0

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_0
    sget-object p0, LTd/L;->a:LTd/L;

    .line 34
    .line 35
    return-object p0
.end method

.method public static final c(Lw/k;Lw/d;JLkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v3, p1

    .line 2
    .line 3
    move-object/from16 v0, p5

    .line 4
    .line 5
    instance-of v1, v0, Lw/m0$b;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, Lw/m0$b;

    .line 11
    .line 12
    iget v2, v1, Lw/m0$b;->f:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v2, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v4

    .line 21
    iput v2, v1, Lw/m0$b;->f:I

    .line 22
    .line 23
    :goto_0
    move-object v8, v1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v1, Lw/m0$b;

    .line 26
    .line 27
    invoke-direct {v1, v0}, Lw/m0$b;-><init>(LZd/e;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v0, v8, Lw/m0$b;->e:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v9

    .line 37
    iget v1, v8, Lw/m0$b;->f:I

    .line 38
    .line 39
    const/4 v10, 0x2

    .line 40
    const/4 v11, 0x1

    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    if-eq v1, v11, :cond_1

    .line 44
    .line 45
    if-ne v1, v10, :cond_2

    .line 46
    .line 47
    :cond_1
    iget-object v1, v8, Lw/m0$b;->d:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Lkotlin/jvm/internal/N;

    .line 50
    .line 51
    iget-object v2, v8, Lw/m0$b;->c:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 54
    .line 55
    iget-object v3, v8, Lw/m0$b;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v3, Lw/d;

    .line 58
    .line 59
    iget-object v4, v8, Lw/m0$b;->a:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v4, Lw/k;

    .line 62
    .line 63
    :try_start_0
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    .line 66
    goto/16 :goto_5

    .line 67
    .line 68
    :catch_0
    move-exception v0

    .line 69
    goto/16 :goto_7

    .line 70
    .line 71
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 72
    .line 73
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 74
    .line 75
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v0

    .line 79
    :cond_3
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    const-wide/16 v0, 0x0

    .line 83
    .line 84
    invoke-interface {v3, v0, v1}, Lw/d;->f(J)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v13

    .line 88
    invoke-interface {v3, v0, v1}, Lw/d;->b(J)Lw/q;

    .line 89
    .line 90
    .line 91
    move-result-object v15

    .line 92
    new-instance v1, Lkotlin/jvm/internal/N;

    .line 93
    .line 94
    invoke-direct {v1}, Lkotlin/jvm/internal/N;-><init>()V

    .line 95
    .line 96
    .line 97
    const-wide/high16 v4, -0x8000000000000000L

    .line 98
    .line 99
    cmp-long v0, p2, v4

    .line 100
    .line 101
    if-nez v0, :cond_5

    .line 102
    .line 103
    :try_start_1
    invoke-interface {v8}, LZd/e;->getContext()LZd/i;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-static {v0}, Lw/m0;->n(LZd/i;)F

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    new-instance v0, Lw/m0$d;
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_3

    .line 112
    .line 113
    move-object/from16 v5, p0

    .line 114
    .line 115
    move-object/from16 v7, p4

    .line 116
    .line 117
    move-object v2, v13

    .line 118
    move-object v4, v15

    .line 119
    :try_start_2
    invoke-direct/range {v0 .. v7}, Lw/m0$d;-><init>(Lkotlin/jvm/internal/N;Ljava/lang/Object;Lw/d;Lw/q;Lw/k;FLkotlin/jvm/functions/Function1;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_2

    .line 120
    .line 121
    .line 122
    move-object v7, v1

    .line 123
    :try_start_3
    iput-object v5, v8, Lw/m0$b;->a:Ljava/lang/Object;

    .line 124
    .line 125
    iput-object v3, v8, Lw/m0$b;->b:Ljava/lang/Object;

    .line 126
    .line 127
    move-object/from16 v6, p4

    .line 128
    .line 129
    iput-object v6, v8, Lw/m0$b;->c:Ljava/lang/Object;

    .line 130
    .line 131
    iput-object v7, v8, Lw/m0$b;->d:Ljava/lang/Object;

    .line 132
    .line 133
    iput v11, v8, Lw/m0$b;->f:I

    .line 134
    .line 135
    invoke-static {v3, v0, v8}, Lw/m0;->k(Lw/d;Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1

    .line 139
    if-ne v0, v9, :cond_4

    .line 140
    .line 141
    goto/16 :goto_6

    .line 142
    .line 143
    :cond_4
    move-object v4, v5

    .line 144
    move-object v2, v6

    .line 145
    goto :goto_4

    .line 146
    :catch_1
    move-exception v0

    .line 147
    move-object v4, v5

    .line 148
    :goto_2
    move-object v1, v7

    .line 149
    goto/16 :goto_7

    .line 150
    .line 151
    :catch_2
    move-exception v0

    .line 152
    :goto_3
    move-object v7, v1

    .line 153
    move-object v4, v5

    .line 154
    goto/16 :goto_7

    .line 155
    .line 156
    :catch_3
    move-exception v0

    .line 157
    move-object/from16 v5, p0

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_5
    move-object/from16 v5, p0

    .line 161
    .line 162
    move-object/from16 v6, p4

    .line 163
    .line 164
    move-object v7, v1

    .line 165
    :try_start_4
    new-instance v12, Lw/h;

    .line 166
    .line 167
    invoke-interface {v3}, Lw/d;->e()Lw/s0;

    .line 168
    .line 169
    .line 170
    move-result-object v14

    .line 171
    invoke-interface {v3}, Lw/d;->g()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v18

    .line 175
    new-instance v0, Lw/m0$e;

    .line 176
    .line 177
    invoke-direct {v0, v5}, Lw/m0$e;-><init>(Lw/k;)V

    .line 178
    .line 179
    .line 180
    const/16 v21, 0x1

    .line 181
    .line 182
    move-wide/from16 v19, p2

    .line 183
    .line 184
    move-wide/from16 v16, p2

    .line 185
    .line 186
    move-object/from16 v22, v0

    .line 187
    .line 188
    invoke-direct/range {v12 .. v22}, Lw/h;-><init>(Ljava/lang/Object;Lw/s0;Lw/q;JLjava/lang/Object;JZLie/a;)V

    .line 189
    .line 190
    .line 191
    invoke-interface {v8}, LZd/e;->getContext()LZd/i;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-static {v0}, Lw/m0;->n(LZd/i;)F

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    move-wide/from16 v1, p2

    .line 200
    .line 201
    move-object v4, v3

    .line 202
    move v3, v0

    .line 203
    move-object v0, v12

    .line 204
    invoke-static/range {v0 .. v6}, Lw/m0;->m(Lw/h;JFLw/d;Lw/k;Lkotlin/jvm/functions/Function1;)V

    .line 205
    .line 206
    .line 207
    move-object v12, v0

    .line 208
    iput-object v12, v7, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_5

    .line 209
    .line 210
    move-object/from16 v4, p0

    .line 211
    .line 212
    move-object/from16 v3, p1

    .line 213
    .line 214
    move-object/from16 v2, p4

    .line 215
    .line 216
    :goto_4
    move-object v1, v7

    .line 217
    :cond_6
    :goto_5
    :try_start_5
    iget-object v0, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 218
    .line 219
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    check-cast v0, Lw/h;

    .line 223
    .line 224
    invoke-virtual {v0}, Lw/h;->h()Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-eqz v0, :cond_7

    .line 229
    .line 230
    invoke-interface {v8}, LZd/e;->getContext()LZd/i;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-static {v0}, Lw/m0;->n(LZd/i;)F

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    new-instance v5, Lw/m0$f;
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_0

    .line 239
    .line 240
    move/from16 p2, v0

    .line 241
    .line 242
    move-object/from16 p1, v1

    .line 243
    .line 244
    move-object/from16 p5, v2

    .line 245
    .line 246
    move-object/from16 p3, v3

    .line 247
    .line 248
    move-object/from16 p4, v4

    .line 249
    .line 250
    move-object/from16 p0, v5

    .line 251
    .line 252
    :try_start_6
    invoke-direct/range {p0 .. p5}, Lw/m0$f;-><init>(Lkotlin/jvm/internal/N;FLw/d;Lw/k;Lkotlin/jvm/functions/Function1;)V
    :try_end_6
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_4

    .line 253
    .line 254
    .line 255
    move-object/from16 v0, p0

    .line 256
    .line 257
    move-object/from16 v1, p1

    .line 258
    .line 259
    move-object/from16 v3, p3

    .line 260
    .line 261
    move-object/from16 v4, p4

    .line 262
    .line 263
    move-object/from16 v2, p5

    .line 264
    .line 265
    :try_start_7
    iput-object v4, v8, Lw/m0$b;->a:Ljava/lang/Object;

    .line 266
    .line 267
    iput-object v3, v8, Lw/m0$b;->b:Ljava/lang/Object;

    .line 268
    .line 269
    iput-object v2, v8, Lw/m0$b;->c:Ljava/lang/Object;

    .line 270
    .line 271
    iput-object v1, v8, Lw/m0$b;->d:Ljava/lang/Object;

    .line 272
    .line 273
    iput v10, v8, Lw/m0$b;->f:I

    .line 274
    .line 275
    invoke-static {v3, v0, v8}, Lw/m0;->k(Lw/d;Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v0
    :try_end_7
    .catch Ljava/util/concurrent/CancellationException; {:try_start_7 .. :try_end_7} :catch_0

    .line 279
    if-ne v0, v9, :cond_6

    .line 280
    .line 281
    :goto_6
    return-object v9

    .line 282
    :catch_4
    move-exception v0

    .line 283
    move-object/from16 v1, p1

    .line 284
    .line 285
    move-object/from16 v4, p4

    .line 286
    .line 287
    goto :goto_7

    .line 288
    :cond_7
    sget-object v0, LTd/L;->a:LTd/L;

    .line 289
    .line 290
    return-object v0

    .line 291
    :catch_5
    move-exception v0

    .line 292
    move-object/from16 v4, p0

    .line 293
    .line 294
    goto/16 :goto_2

    .line 295
    .line 296
    :goto_7
    iget-object v2, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v2, Lw/h;

    .line 299
    .line 300
    const/4 v3, 0x0

    .line 301
    if-nez v2, :cond_8

    .line 302
    .line 303
    goto :goto_8

    .line 304
    :cond_8
    invoke-virtual {v2, v3}, Lw/h;->k(Z)V

    .line 305
    .line 306
    .line 307
    :goto_8
    iget-object v1, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v1, Lw/h;

    .line 310
    .line 311
    if-eqz v1, :cond_9

    .line 312
    .line 313
    invoke-virtual {v1}, Lw/h;->c()J

    .line 314
    .line 315
    .line 316
    move-result-wide v1

    .line 317
    invoke-virtual {v4}, Lw/k;->l()J

    .line 318
    .line 319
    .line 320
    move-result-wide v5

    .line 321
    cmp-long v1, v1, v5

    .line 322
    .line 323
    if-nez v1, :cond_9

    .line 324
    .line 325
    invoke-virtual {v4, v3}, Lw/k;->u(Z)V

    .line 326
    .line 327
    .line 328
    :cond_9
    throw v0
.end method

.method public static final d(Lw/s0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lw/i;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-interface {p0}, Lw/s0;->a()Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lw/q;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    move-object v4, v0

    .line 19
    goto :goto_2

    .line 20
    :cond_1
    :goto_1
    invoke-interface {p0}, Lw/s0;->a()Lkotlin/jvm/functions/Function1;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lw/q;

    .line 29
    .line 30
    invoke-static {v0}, Lw/r;->g(Lw/q;)Lw/q;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    goto :goto_0

    .line 35
    :goto_2
    new-instance v1, Lw/n0;

    .line 36
    .line 37
    move-object v3, p0

    .line 38
    move-object v5, p2

    .line 39
    move-object/from16 v2, p4

    .line 40
    .line 41
    move-object v6, v4

    .line 42
    move-object v4, p1

    .line 43
    invoke-direct/range {v1 .. v6}, Lw/n0;-><init>(Lw/i;Lw/s0;Ljava/lang/Object;Ljava/lang/Object;Lw/q;)V

    .line 44
    .line 45
    .line 46
    move-object p2, v1

    .line 47
    move-object v4, v6

    .line 48
    new-instance v1, Lw/k;

    .line 49
    .line 50
    const/16 v10, 0x38

    .line 51
    .line 52
    const/4 v11, 0x0

    .line 53
    const-wide/16 v5, 0x0

    .line 54
    .line 55
    const-wide/16 v7, 0x0

    .line 56
    .line 57
    const/4 v9, 0x0

    .line 58
    move-object v2, p0

    .line 59
    move-object v3, p1

    .line 60
    invoke-direct/range {v1 .. v11}, Lw/k;-><init>(Lw/s0;Ljava/lang/Object;Lw/q;JJZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 61
    .line 62
    .line 63
    new-instance v9, Lw/m0$a;

    .line 64
    .line 65
    move-object/from16 p1, p5

    .line 66
    .line 67
    invoke-direct {v9, p1, p0}, Lw/m0$a;-><init>(Lkotlin/jvm/functions/Function2;Lw/s0;)V

    .line 68
    .line 69
    .line 70
    const/4 v11, 0x2

    .line 71
    const/4 v12, 0x0

    .line 72
    move-object v6, p2

    .line 73
    move-object/from16 v10, p6

    .line 74
    .line 75
    move-object v5, v1

    .line 76
    invoke-static/range {v5 .. v12}, Lw/m0;->f(Lw/k;Lw/d;JLkotlin/jvm/functions/Function1;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-ne p0, p1, :cond_2

    .line 85
    .line 86
    return-object p0

    .line 87
    :cond_2
    sget-object p0, LTd/L;->a:LTd/L;

    .line 88
    .line 89
    return-object p0
.end method

.method public static synthetic e(FFFLw/i;Lkotlin/jvm/functions/Function2;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    and-int/lit8 p7, p6, 0x4

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p7, :cond_0

    .line 5
    .line 6
    move p2, v0

    .line 7
    :cond_0
    and-int/lit8 p6, p6, 0x8

    .line 8
    .line 9
    if-eqz p6, :cond_1

    .line 10
    .line 11
    const/4 p3, 0x7

    .line 12
    const/4 p6, 0x0

    .line 13
    invoke-static {v0, v0, p6, p3, p6}, Lw/j;->h(FFLjava/lang/Object;ILjava/lang/Object;)Lw/h0;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    :cond_1
    invoke-static/range {p0 .. p5}, Lw/m0;->b(FFFLw/i;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static synthetic f(Lw/k;Lw/d;JLkotlin/jvm/functions/Function1;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    and-int/lit8 p7, p6, 0x2

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    const-wide/high16 p2, -0x8000000000000000L

    .line 6
    .line 7
    :cond_0
    move-wide v2, p2

    .line 8
    and-int/lit8 p2, p6, 0x4

    .line 9
    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    sget-object p4, Lw/m0$c;->a:Lw/m0$c;

    .line 13
    .line 14
    :cond_1
    move-object v0, p0

    .line 15
    move-object v1, p1

    .line 16
    move-object v4, p4

    .line 17
    move-object v5, p5

    .line 18
    invoke-static/range {v0 .. v5}, Lw/m0;->c(Lw/k;Lw/d;JLkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static final g(Lw/k;Lw/z;ZLkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-virtual {p0}, Lw/k;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lw/k;->q()Lw/q;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Lw/k;->n()Lw/s0;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    new-instance v4, Lw/y;

    .line 14
    .line 15
    invoke-direct {v4, p1, v2, v0, v1}, Lw/y;-><init>(Lw/z;Lw/s0;Ljava/lang/Object;Lw/q;)V

    .line 16
    .line 17
    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Lw/k;->l()J

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    :goto_0
    move-object v3, p0

    .line 25
    move-wide v5, p1

    .line 26
    move-object v7, p3

    .line 27
    move-object v8, p4

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    const-wide/high16 p1, -0x8000000000000000L

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :goto_1
    invoke-static/range {v3 .. v8}, Lw/m0;->c(Lw/k;Lw/d;JLkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-ne p0, p1, :cond_1

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_1
    sget-object p0, LTd/L;->a:LTd/L;

    .line 44
    .line 45
    return-object p0
.end method

.method public static synthetic h(Lw/k;Lw/z;ZLkotlin/jvm/functions/Function1;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p6, p5, 0x2

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    and-int/lit8 p5, p5, 0x4

    .line 7
    .line 8
    if-eqz p5, :cond_1

    .line 9
    .line 10
    sget-object p3, Lw/m0$g;->a:Lw/m0$g;

    .line 11
    .line 12
    :cond_1
    invoke-static {p0, p1, p2, p3, p4}, Lw/m0;->g(Lw/k;Lw/z;ZLkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static final i(Lw/k;Ljava/lang/Object;Lw/i;ZLkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lw/k;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v3

    .line 5
    invoke-virtual {p0}, Lw/k;->n()Lw/s0;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {p0}, Lw/k;->q()Lw/q;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    new-instance v0, Lw/n0;

    .line 14
    .line 15
    move-object v4, p1

    .line 16
    move-object v1, p2

    .line 17
    invoke-direct/range {v0 .. v5}, Lw/n0;-><init>(Lw/i;Lw/s0;Ljava/lang/Object;Ljava/lang/Object;Lw/q;)V

    .line 18
    .line 19
    .line 20
    move-object p1, v0

    .line 21
    if-eqz p3, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lw/k;->l()J

    .line 24
    .line 25
    .line 26
    move-result-wide p2

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-wide/high16 p2, -0x8000000000000000L

    .line 29
    .line 30
    :goto_0
    invoke-static/range {p0 .. p5}, Lw/m0;->c(Lw/k;Lw/d;JLkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    if-ne p0, p1, :cond_1

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_1
    sget-object p0, LTd/L;->a:LTd/L;

    .line 42
    .line 43
    return-object p0
.end method

.method public static synthetic j(Lw/k;Ljava/lang/Object;Lw/i;ZLkotlin/jvm/functions/Function1;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    and-int/lit8 p7, p6, 0x2

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x7

    .line 6
    const/4 p7, 0x0

    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-static {p7, p7, v0, p2, v0}, Lw/j;->h(FFLjava/lang/Object;ILjava/lang/Object;)Lw/h0;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    :cond_0
    move-object v2, p2

    .line 13
    and-int/lit8 p2, p6, 0x4

    .line 14
    .line 15
    if-eqz p2, :cond_1

    .line 16
    .line 17
    const/4 p3, 0x0

    .line 18
    :cond_1
    move v3, p3

    .line 19
    and-int/lit8 p2, p6, 0x8

    .line 20
    .line 21
    if-eqz p2, :cond_2

    .line 22
    .line 23
    sget-object p4, Lw/m0$h;->a:Lw/m0$h;

    .line 24
    .line 25
    :cond_2
    move-object v0, p0

    .line 26
    move-object v1, p1

    .line 27
    move-object v4, p4

    .line 28
    move-object v5, p5

    .line 29
    invoke-static/range {v0 .. v5}, Lw/m0;->i(Lw/k;Ljava/lang/Object;Lw/i;ZLkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method private static final k(Lw/d;Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p0}, Lw/d;->a()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-static {p1, p2}, Lw/L;->a(Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance p0, Lw/m0$i;

    .line 13
    .line 14
    invoke-direct {p0, p1}, Lw/m0$i;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0, p2}, LY/v0;->c(Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method private static final l(Lw/h;JJLw/d;Lw/k;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lw/h;->j(J)V

    .line 2
    .line 3
    .line 4
    invoke-interface {p5, p3, p4}, Lw/d;->f(J)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0, p1}, Lw/h;->l(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p5, p3, p4}, Lw/d;->b(J)Lw/q;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Lw/h;->m(Lw/q;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p5, p3, p4}, Lw/d;->c(J)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Lw/h;->c()J

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    invoke-virtual {p0, p1, p2}, Lw/h;->i(J)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    invoke-virtual {p0, p1}, Lw/h;->k(Z)V

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-static {p0, p6}, Lw/m0;->o(Lw/h;Lw/k;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p7, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method private static final m(Lw/h;JFLw/d;Lw/k;Lkotlin/jvm/functions/Function1;)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, p3, v0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-interface {p4}, Lw/d;->d()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    :goto_0
    move-object v2, p0

    .line 11
    move-wide v3, p1

    .line 12
    move-object v7, p4

    .line 13
    move-object v8, p5

    .line 14
    move-object/from16 v9, p6

    .line 15
    .line 16
    move-wide v5, v0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    invoke-virtual {p0}, Lw/h;->d()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    sub-long v0, p1, v0

    .line 23
    .line 24
    long-to-float v0, v0

    .line 25
    div-float/2addr v0, p3

    .line 26
    float-to-long v0, v0

    .line 27
    goto :goto_0

    .line 28
    :goto_1
    invoke-static/range {v2 .. v9}, Lw/m0;->l(Lw/h;JJLw/d;Lw/k;Lkotlin/jvm/functions/Function1;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static final n(LZd/i;)F
    .locals 1

    .line 1
    sget-object v0, Ll0/k;->h0:Ll0/k$b;

    .line 2
    .line 3
    invoke-interface {p0, v0}, LZd/i;->l(LZd/i$c;)LZd/i$b;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ll0/k;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Ll0/k;->E()F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/high16 p0, 0x3f800000    # 1.0f

    .line 17
    .line 18
    :goto_0
    const/4 v0, 0x0

    .line 19
    cmpl-float v0, p0, v0

    .line 20
    .line 21
    if-ltz v0, :cond_1

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    :goto_1
    if-nez v0, :cond_2

    .line 27
    .line 28
    const-string v0, "negative scale factor"

    .line 29
    .line 30
    invoke-static {v0}, Lw/a0;->b(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    return p0
.end method

.method public static final o(Lw/h;Lw/k;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lw/h;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Lw/k;->v(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lw/k;->q()Lw/q;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0}, Lw/h;->g()Lw/q;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v0, v1}, Lw/r;->f(Lw/q;Lw/q;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lw/h;->b()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    invoke-virtual {p1, v0, v1}, Lw/k;->s(J)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lw/h;->c()J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    invoke-virtual {p1, v0, v1}, Lw/k;->t(J)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lw/h;->h()Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    invoke-virtual {p1, p0}, Lw/k;->u(Z)V

    .line 38
    .line 39
    .line 40
    return-void
.end method
