.class public abstract Landroidx/compose/animation/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Ljava/lang/Object;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Ll0/e;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lie/p;LY/m;II)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v8, p8

    .line 4
    .line 5
    const v0, 0x7f1ebc6d

    .line 6
    .line 7
    .line 8
    move-object/from16 v2, p7

    .line 9
    .line 10
    invoke-interface {v2, v0}, LY/m;->g(I)LY/m;

    .line 11
    .line 12
    .line 13
    move-result-object v15

    .line 14
    and-int/lit8 v2, p9, 0x1

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    or-int/lit8 v2, v8, 0x6

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    and-int/lit8 v2, v8, 0x6

    .line 22
    .line 23
    if-nez v2, :cond_3

    .line 24
    .line 25
    and-int/lit8 v2, v8, 0x8

    .line 26
    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    invoke-interface {v15, v1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-interface {v15, v1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    :goto_0
    if-eqz v2, :cond_2

    .line 39
    .line 40
    const/4 v2, 0x4

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    const/4 v2, 0x2

    .line 43
    :goto_1
    or-int/2addr v2, v8

    .line 44
    goto :goto_2

    .line 45
    :cond_3
    move v2, v8

    .line 46
    :goto_2
    and-int/lit8 v3, p9, 0x2

    .line 47
    .line 48
    if-eqz v3, :cond_5

    .line 49
    .line 50
    or-int/lit8 v2, v2, 0x30

    .line 51
    .line 52
    :cond_4
    move-object/from16 v4, p1

    .line 53
    .line 54
    goto :goto_4

    .line 55
    :cond_5
    and-int/lit8 v4, v8, 0x30

    .line 56
    .line 57
    if-nez v4, :cond_4

    .line 58
    .line 59
    move-object/from16 v4, p1

    .line 60
    .line 61
    invoke-interface {v15, v4}, LY/m;->U(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_6

    .line 66
    .line 67
    const/16 v5, 0x20

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_6
    const/16 v5, 0x10

    .line 71
    .line 72
    :goto_3
    or-int/2addr v2, v5

    .line 73
    :goto_4
    and-int/lit8 v5, p9, 0x4

    .line 74
    .line 75
    if-eqz v5, :cond_8

    .line 76
    .line 77
    or-int/lit16 v2, v2, 0x180

    .line 78
    .line 79
    :cond_7
    move-object/from16 v6, p2

    .line 80
    .line 81
    goto :goto_6

    .line 82
    :cond_8
    and-int/lit16 v6, v8, 0x180

    .line 83
    .line 84
    if-nez v6, :cond_7

    .line 85
    .line 86
    move-object/from16 v6, p2

    .line 87
    .line 88
    invoke-interface {v15, v6}, LY/m;->F(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    if-eqz v7, :cond_9

    .line 93
    .line 94
    const/16 v7, 0x100

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_9
    const/16 v7, 0x80

    .line 98
    .line 99
    :goto_5
    or-int/2addr v2, v7

    .line 100
    :goto_6
    and-int/lit8 v7, p9, 0x8

    .line 101
    .line 102
    if-eqz v7, :cond_b

    .line 103
    .line 104
    or-int/lit16 v2, v2, 0xc00

    .line 105
    .line 106
    :cond_a
    move-object/from16 v9, p3

    .line 107
    .line 108
    goto :goto_8

    .line 109
    :cond_b
    and-int/lit16 v9, v8, 0xc00

    .line 110
    .line 111
    if-nez v9, :cond_a

    .line 112
    .line 113
    move-object/from16 v9, p3

    .line 114
    .line 115
    invoke-interface {v15, v9}, LY/m;->U(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v10

    .line 119
    if-eqz v10, :cond_c

    .line 120
    .line 121
    const/16 v10, 0x800

    .line 122
    .line 123
    goto :goto_7

    .line 124
    :cond_c
    const/16 v10, 0x400

    .line 125
    .line 126
    :goto_7
    or-int/2addr v2, v10

    .line 127
    :goto_8
    and-int/lit8 v10, p9, 0x10

    .line 128
    .line 129
    if-eqz v10, :cond_e

    .line 130
    .line 131
    or-int/lit16 v2, v2, 0x6000

    .line 132
    .line 133
    :cond_d
    move-object/from16 v11, p4

    .line 134
    .line 135
    goto :goto_a

    .line 136
    :cond_e
    and-int/lit16 v11, v8, 0x6000

    .line 137
    .line 138
    if-nez v11, :cond_d

    .line 139
    .line 140
    move-object/from16 v11, p4

    .line 141
    .line 142
    invoke-interface {v15, v11}, LY/m;->U(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v12

    .line 146
    if-eqz v12, :cond_f

    .line 147
    .line 148
    const/16 v12, 0x4000

    .line 149
    .line 150
    goto :goto_9

    .line 151
    :cond_f
    const/16 v12, 0x2000

    .line 152
    .line 153
    :goto_9
    or-int/2addr v2, v12

    .line 154
    :goto_a
    and-int/lit8 v12, p9, 0x20

    .line 155
    .line 156
    const/high16 v13, 0x30000

    .line 157
    .line 158
    if-eqz v12, :cond_11

    .line 159
    .line 160
    or-int/2addr v2, v13

    .line 161
    :cond_10
    move-object/from16 v13, p5

    .line 162
    .line 163
    goto :goto_c

    .line 164
    :cond_11
    and-int/2addr v13, v8

    .line 165
    if-nez v13, :cond_10

    .line 166
    .line 167
    move-object/from16 v13, p5

    .line 168
    .line 169
    invoke-interface {v15, v13}, LY/m;->F(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v14

    .line 173
    if-eqz v14, :cond_12

    .line 174
    .line 175
    const/high16 v14, 0x20000

    .line 176
    .line 177
    goto :goto_b

    .line 178
    :cond_12
    const/high16 v14, 0x10000

    .line 179
    .line 180
    :goto_b
    or-int/2addr v2, v14

    .line 181
    :goto_c
    and-int/lit8 v14, p9, 0x40

    .line 182
    .line 183
    const/high16 v16, 0x180000

    .line 184
    .line 185
    if-eqz v14, :cond_14

    .line 186
    .line 187
    or-int v2, v2, v16

    .line 188
    .line 189
    :cond_13
    move-object/from16 v14, p6

    .line 190
    .line 191
    goto :goto_e

    .line 192
    :cond_14
    and-int v14, v8, v16

    .line 193
    .line 194
    if-nez v14, :cond_13

    .line 195
    .line 196
    move-object/from16 v14, p6

    .line 197
    .line 198
    invoke-interface {v15, v14}, LY/m;->F(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v16

    .line 202
    if-eqz v16, :cond_15

    .line 203
    .line 204
    const/high16 v16, 0x100000

    .line 205
    .line 206
    goto :goto_d

    .line 207
    :cond_15
    const/high16 v16, 0x80000

    .line 208
    .line 209
    :goto_d
    or-int v2, v2, v16

    .line 210
    .line 211
    :goto_e
    const v16, 0x92493

    .line 212
    .line 213
    .line 214
    and-int v0, v2, v16

    .line 215
    .line 216
    move/from16 p7, v3

    .line 217
    .line 218
    const v3, 0x92492

    .line 219
    .line 220
    .line 221
    if-ne v0, v3, :cond_17

    .line 222
    .line 223
    invoke-interface {v15}, LY/m;->i()Z

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    if-nez v0, :cond_16

    .line 228
    .line 229
    goto :goto_10

    .line 230
    :cond_16
    invoke-interface {v15}, LY/m;->K()V

    .line 231
    .line 232
    .line 233
    move-object v2, v4

    .line 234
    move-object v3, v6

    .line 235
    move-object v4, v9

    .line 236
    move-object v5, v11

    .line 237
    :goto_f
    move-object v6, v13

    .line 238
    goto/16 :goto_13

    .line 239
    .line 240
    :cond_17
    :goto_10
    if-eqz p7, :cond_18

    .line 241
    .line 242
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 243
    .line 244
    goto :goto_11

    .line 245
    :cond_18
    move-object v0, v4

    .line 246
    :goto_11
    if-eqz v5, :cond_19

    .line 247
    .line 248
    sget-object v3, Landroidx/compose/animation/a$a;->a:Landroidx/compose/animation/a$a;

    .line 249
    .line 250
    move-object v6, v3

    .line 251
    :cond_19
    if-eqz v7, :cond_1a

    .line 252
    .line 253
    sget-object v3, Ll0/e;->a:Ll0/e$a;

    .line 254
    .line 255
    invoke-virtual {v3}, Ll0/e$a;->o()Ll0/e;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    move-object v9, v3

    .line 260
    :cond_1a
    if-eqz v10, :cond_1b

    .line 261
    .line 262
    const-string v3, "AnimatedContent"

    .line 263
    .line 264
    goto :goto_12

    .line 265
    :cond_1b
    move-object v3, v11

    .line 266
    :goto_12
    if-eqz v12, :cond_1c

    .line 267
    .line 268
    sget-object v4, Landroidx/compose/animation/a$b;->a:Landroidx/compose/animation/a$b;

    .line 269
    .line 270
    move-object v13, v4

    .line 271
    :cond_1c
    invoke-static {}, LY/w;->L()Z

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    if-eqz v4, :cond_1d

    .line 276
    .line 277
    const/4 v4, -0x1

    .line 278
    const-string v5, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)"

    .line 279
    .line 280
    const v7, 0x7f1ebc6d

    .line 281
    .line 282
    .line 283
    invoke-static {v7, v2, v4, v5}, LY/w;->U(IIILjava/lang/String;)V

    .line 284
    .line 285
    .line 286
    :cond_1d
    and-int/lit8 v4, v2, 0xe

    .line 287
    .line 288
    shr-int/lit8 v5, v2, 0x9

    .line 289
    .line 290
    and-int/lit8 v5, v5, 0x70

    .line 291
    .line 292
    or-int/2addr v4, v5

    .line 293
    const/4 v5, 0x0

    .line 294
    invoke-static {v1, v3, v15, v4, v5}, Lw/p0;->d(Ljava/lang/Object;Ljava/lang/String;LY/m;II)Lw/o0;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    and-int/lit16 v5, v2, 0x1ff0

    .line 299
    .line 300
    shr-int/lit8 v2, v2, 0x3

    .line 301
    .line 302
    const v7, 0xe000

    .line 303
    .line 304
    .line 305
    and-int/2addr v7, v2

    .line 306
    or-int/2addr v5, v7

    .line 307
    const/high16 v7, 0x70000

    .line 308
    .line 309
    and-int/2addr v2, v7

    .line 310
    or-int v16, v5, v2

    .line 311
    .line 312
    const/16 v17, 0x0

    .line 313
    .line 314
    move-object v10, v0

    .line 315
    move-object v11, v6

    .line 316
    move-object v12, v9

    .line 317
    move-object v9, v4

    .line 318
    invoke-static/range {v9 .. v17}, Landroidx/compose/animation/a;->b(Lw/o0;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Ll0/e;Lkotlin/jvm/functions/Function1;Lie/p;LY/m;II)V

    .line 319
    .line 320
    .line 321
    invoke-static {}, LY/w;->L()Z

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    if-eqz v0, :cond_1e

    .line 326
    .line 327
    invoke-static {}, LY/w;->T()V

    .line 328
    .line 329
    .line 330
    :cond_1e
    move-object v5, v3

    .line 331
    move-object v2, v10

    .line 332
    move-object v3, v11

    .line 333
    move-object v4, v12

    .line 334
    goto :goto_f

    .line 335
    :goto_13
    invoke-interface {v15}, LY/m;->k()LY/B1;

    .line 336
    .line 337
    .line 338
    move-result-object v10

    .line 339
    if-eqz v10, :cond_1f

    .line 340
    .line 341
    new-instance v0, Landroidx/compose/animation/a$c;

    .line 342
    .line 343
    move-object/from16 v7, p6

    .line 344
    .line 345
    move/from16 v9, p9

    .line 346
    .line 347
    invoke-direct/range {v0 .. v9}, Landroidx/compose/animation/a$c;-><init>(Ljava/lang/Object;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Ll0/e;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lie/p;II)V

    .line 348
    .line 349
    .line 350
    invoke-interface {v10, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 351
    .line 352
    .line 353
    :cond_1f
    return-void
.end method

.method public static final b(Lw/o0;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Ll0/e;Lkotlin/jvm/functions/Function1;Lie/p;LY/m;II)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v7, p7

    .line 4
    .line 5
    const v0, -0x6d60584

    .line 6
    .line 7
    .line 8
    move-object/from16 v2, p6

    .line 9
    .line 10
    invoke-interface {v2, v0}, LY/m;->g(I)LY/m;

    .line 11
    .line 12
    .line 13
    move-result-object v8

    .line 14
    const/high16 v2, -0x80000000

    .line 15
    .line 16
    and-int v2, p8, v2

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    or-int/lit8 v2, v7, 0x6

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    and-int/lit8 v2, v7, 0x6

    .line 24
    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    invoke-interface {v8, v1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    const/4 v2, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v2, 0x2

    .line 36
    :goto_0
    or-int/2addr v2, v7

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v2, v7

    .line 39
    :goto_1
    and-int/lit8 v4, p8, 0x1

    .line 40
    .line 41
    if-eqz v4, :cond_4

    .line 42
    .line 43
    or-int/lit8 v2, v2, 0x30

    .line 44
    .line 45
    :cond_3
    move-object/from16 v5, p1

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_4
    and-int/lit8 v5, v7, 0x30

    .line 49
    .line 50
    if-nez v5, :cond_3

    .line 51
    .line 52
    move-object/from16 v5, p1

    .line 53
    .line 54
    invoke-interface {v8, v5}, LY/m;->U(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-eqz v6, :cond_5

    .line 59
    .line 60
    const/16 v6, 0x20

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_5
    const/16 v6, 0x10

    .line 64
    .line 65
    :goto_2
    or-int/2addr v2, v6

    .line 66
    :goto_3
    and-int/lit8 v6, p8, 0x2

    .line 67
    .line 68
    if-eqz v6, :cond_7

    .line 69
    .line 70
    or-int/lit16 v2, v2, 0x180

    .line 71
    .line 72
    :cond_6
    move-object/from16 v9, p2

    .line 73
    .line 74
    goto :goto_5

    .line 75
    :cond_7
    and-int/lit16 v9, v7, 0x180

    .line 76
    .line 77
    if-nez v9, :cond_6

    .line 78
    .line 79
    move-object/from16 v9, p2

    .line 80
    .line 81
    invoke-interface {v8, v9}, LY/m;->F(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    if-eqz v10, :cond_8

    .line 86
    .line 87
    const/16 v10, 0x100

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_8
    const/16 v10, 0x80

    .line 91
    .line 92
    :goto_4
    or-int/2addr v2, v10

    .line 93
    :goto_5
    and-int/lit8 v10, p8, 0x4

    .line 94
    .line 95
    if-eqz v10, :cond_a

    .line 96
    .line 97
    or-int/lit16 v2, v2, 0xc00

    .line 98
    .line 99
    :cond_9
    move-object/from16 v11, p3

    .line 100
    .line 101
    goto :goto_7

    .line 102
    :cond_a
    and-int/lit16 v11, v7, 0xc00

    .line 103
    .line 104
    if-nez v11, :cond_9

    .line 105
    .line 106
    move-object/from16 v11, p3

    .line 107
    .line 108
    invoke-interface {v8, v11}, LY/m;->U(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v12

    .line 112
    if-eqz v12, :cond_b

    .line 113
    .line 114
    const/16 v12, 0x800

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_b
    const/16 v12, 0x400

    .line 118
    .line 119
    :goto_6
    or-int/2addr v2, v12

    .line 120
    :goto_7
    and-int/lit8 v12, p8, 0x8

    .line 121
    .line 122
    if-eqz v12, :cond_d

    .line 123
    .line 124
    or-int/lit16 v2, v2, 0x6000

    .line 125
    .line 126
    :cond_c
    move-object/from16 v13, p4

    .line 127
    .line 128
    goto :goto_9

    .line 129
    :cond_d
    and-int/lit16 v13, v7, 0x6000

    .line 130
    .line 131
    if-nez v13, :cond_c

    .line 132
    .line 133
    move-object/from16 v13, p4

    .line 134
    .line 135
    invoke-interface {v8, v13}, LY/m;->F(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v14

    .line 139
    if-eqz v14, :cond_e

    .line 140
    .line 141
    const/16 v14, 0x4000

    .line 142
    .line 143
    goto :goto_8

    .line 144
    :cond_e
    const/16 v14, 0x2000

    .line 145
    .line 146
    :goto_8
    or-int/2addr v2, v14

    .line 147
    :goto_9
    and-int/lit8 v14, p8, 0x10

    .line 148
    .line 149
    const/high16 v15, 0x30000

    .line 150
    .line 151
    if-eqz v14, :cond_10

    .line 152
    .line 153
    or-int/2addr v2, v15

    .line 154
    :cond_f
    move-object/from16 v14, p5

    .line 155
    .line 156
    goto :goto_b

    .line 157
    :cond_10
    and-int v14, v7, v15

    .line 158
    .line 159
    if-nez v14, :cond_f

    .line 160
    .line 161
    move-object/from16 v14, p5

    .line 162
    .line 163
    invoke-interface {v8, v14}, LY/m;->F(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v15

    .line 167
    if-eqz v15, :cond_11

    .line 168
    .line 169
    const/high16 v15, 0x20000

    .line 170
    .line 171
    goto :goto_a

    .line 172
    :cond_11
    const/high16 v15, 0x10000

    .line 173
    .line 174
    :goto_a
    or-int/2addr v2, v15

    .line 175
    :goto_b
    const v15, 0x12493

    .line 176
    .line 177
    .line 178
    and-int/2addr v15, v2

    .line 179
    const v3, 0x12492

    .line 180
    .line 181
    .line 182
    if-ne v15, v3, :cond_13

    .line 183
    .line 184
    invoke-interface {v8}, LY/m;->i()Z

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    if-nez v3, :cond_12

    .line 189
    .line 190
    goto :goto_d

    .line 191
    :cond_12
    invoke-interface {v8}, LY/m;->K()V

    .line 192
    .line 193
    .line 194
    move-object v2, v5

    .line 195
    move-object v3, v9

    .line 196
    :goto_c
    move-object v4, v11

    .line 197
    move-object v5, v13

    .line 198
    goto/16 :goto_1d

    .line 199
    .line 200
    :cond_13
    :goto_d
    if-eqz v4, :cond_14

    .line 201
    .line 202
    sget-object v3, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 203
    .line 204
    move-object v15, v3

    .line 205
    goto :goto_e

    .line 206
    :cond_14
    move-object v15, v5

    .line 207
    :goto_e
    if-eqz v6, :cond_15

    .line 208
    .line 209
    sget-object v3, Landroidx/compose/animation/a$d;->a:Landroidx/compose/animation/a$d;

    .line 210
    .line 211
    goto :goto_f

    .line 212
    :cond_15
    move-object v3, v9

    .line 213
    :goto_f
    if-eqz v10, :cond_16

    .line 214
    .line 215
    sget-object v4, Ll0/e;->a:Ll0/e$a;

    .line 216
    .line 217
    invoke-virtual {v4}, Ll0/e$a;->o()Ll0/e;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    move-object v11, v4

    .line 222
    :cond_16
    if-eqz v12, :cond_17

    .line 223
    .line 224
    sget-object v4, Landroidx/compose/animation/a$e;->a:Landroidx/compose/animation/a$e;

    .line 225
    .line 226
    move-object v13, v4

    .line 227
    :cond_17
    invoke-static {}, LY/w;->L()Z

    .line 228
    .line 229
    .line 230
    move-result v4

    .line 231
    const/4 v5, -0x1

    .line 232
    if-eqz v4, :cond_18

    .line 233
    .line 234
    const-string v4, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:713)"

    .line 235
    .line 236
    invoke-static {v0, v2, v5, v4}, LY/w;->U(IIILjava/lang/String;)V

    .line 237
    .line 238
    .line 239
    :cond_18
    invoke-static {}, Landroidx/compose/ui/platform/w0;->k()LY/b1;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-interface {v8, v0}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    check-cast v0, Li1/t;

    .line 248
    .line 249
    and-int/lit8 v2, v2, 0xe

    .line 250
    .line 251
    const/4 v9, 0x0

    .line 252
    const/4 v10, 0x1

    .line 253
    const/4 v4, 0x4

    .line 254
    if-ne v2, v4, :cond_19

    .line 255
    .line 256
    move v4, v10

    .line 257
    goto :goto_10

    .line 258
    :cond_19
    move v4, v9

    .line 259
    :goto_10
    invoke-interface {v8}, LY/m;->D()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v6

    .line 263
    if-nez v4, :cond_1a

    .line 264
    .line 265
    sget-object v4, LY/m;->a:LY/m$a;

    .line 266
    .line 267
    invoke-virtual {v4}, LY/m$a;->a()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    if-ne v6, v4, :cond_1b

    .line 272
    .line 273
    :cond_1a
    new-instance v6, Landroidx/compose/animation/e;

    .line 274
    .line 275
    invoke-direct {v6, v1, v11, v0}, Landroidx/compose/animation/e;-><init>(Lw/o0;Ll0/e;Li1/t;)V

    .line 276
    .line 277
    .line 278
    invoke-interface {v8, v6}, LY/m;->u(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    :cond_1b
    move-object v4, v6

    .line 282
    check-cast v4, Landroidx/compose/animation/e;

    .line 283
    .line 284
    const/4 v6, 0x4

    .line 285
    if-ne v2, v6, :cond_1c

    .line 286
    .line 287
    move v6, v10

    .line 288
    goto :goto_11

    .line 289
    :cond_1c
    move v6, v9

    .line 290
    :goto_11
    invoke-interface {v8}, LY/m;->D()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v12

    .line 294
    if-nez v6, :cond_1d

    .line 295
    .line 296
    sget-object v6, LY/m;->a:LY/m$a;

    .line 297
    .line 298
    invoke-virtual {v6}, LY/m$a;->a()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v6

    .line 302
    if-ne v12, v6, :cond_1e

    .line 303
    .line 304
    :cond_1d
    invoke-virtual {v1}, Lw/o0;->h()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v6

    .line 308
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v6

    .line 312
    invoke-static {v6}, LY/U1;->f([Ljava/lang/Object;)Li0/E;

    .line 313
    .line 314
    .line 315
    move-result-object v12

    .line 316
    invoke-interface {v8, v12}, LY/m;->u(Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    :cond_1e
    check-cast v12, Li0/E;

    .line 320
    .line 321
    const/4 v6, 0x4

    .line 322
    if-ne v2, v6, :cond_1f

    .line 323
    .line 324
    move v2, v10

    .line 325
    goto :goto_12

    .line 326
    :cond_1f
    move v2, v9

    .line 327
    :goto_12
    invoke-interface {v8}, LY/m;->D()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v6

    .line 331
    if-nez v2, :cond_20

    .line 332
    .line 333
    sget-object v2, LY/m;->a:LY/m$a;

    .line 334
    .line 335
    invoke-virtual {v2}, LY/m$a;->a()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    if-ne v6, v2, :cond_21

    .line 340
    .line 341
    :cond_20
    invoke-static {}, Lt/d0;->b()Lt/P;

    .line 342
    .line 343
    .line 344
    move-result-object v6

    .line 345
    invoke-interface {v8, v6}, LY/m;->u(Ljava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    :cond_21
    move-object v2, v6

    .line 349
    check-cast v2, Lt/P;

    .line 350
    .line 351
    invoke-virtual {v1}, Lw/o0;->h()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v6

    .line 355
    invoke-virtual {v12, v6}, Li0/E;->contains(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v6

    .line 359
    if-nez v6, :cond_22

    .line 360
    .line 361
    invoke-virtual {v12}, Li0/E;->clear()V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v1}, Lw/o0;->h()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v6

    .line 368
    invoke-virtual {v12, v6}, Li0/E;->add(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    :cond_22
    invoke-virtual {v1}, Lw/o0;->h()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v6

    .line 375
    invoke-virtual {v1}, Lw/o0;->o()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v5

    .line 379
    invoke-static {v6, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result v5

    .line 383
    if-eqz v5, :cond_27

    .line 384
    .line 385
    invoke-virtual {v12}, Li0/E;->size()I

    .line 386
    .line 387
    .line 388
    move-result v5

    .line 389
    if-ne v5, v10, :cond_23

    .line 390
    .line 391
    invoke-virtual {v12, v9}, Li0/E;->get(I)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v5

    .line 395
    invoke-virtual {v1}, Lw/o0;->h()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v6

    .line 399
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 400
    .line 401
    .line 402
    move-result v5

    .line 403
    if-nez v5, :cond_24

    .line 404
    .line 405
    :cond_23
    invoke-virtual {v12}, Li0/E;->clear()V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v1}, Lw/o0;->h()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v5

    .line 412
    invoke-virtual {v12, v5}, Li0/E;->add(Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    :cond_24
    invoke-virtual {v2}, Lt/c0;->g()I

    .line 416
    .line 417
    .line 418
    move-result v5

    .line 419
    if-ne v5, v10, :cond_25

    .line 420
    .line 421
    invoke-virtual {v1}, Lw/o0;->h()Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v5

    .line 425
    invoke-virtual {v2, v5}, Lt/c0;->c(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result v5

    .line 429
    if-eqz v5, :cond_26

    .line 430
    .line 431
    :cond_25
    invoke-virtual {v2}, Lt/P;->k()V

    .line 432
    .line 433
    .line 434
    :cond_26
    invoke-virtual {v4, v11}, Landroidx/compose/animation/e;->j(Ll0/e;)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v4, v0}, Landroidx/compose/animation/e;->k(Li1/t;)V

    .line 438
    .line 439
    .line 440
    :cond_27
    invoke-virtual {v1}, Lw/o0;->h()Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    invoke-virtual {v1}, Lw/o0;->o()Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v5

    .line 448
    invoke-static {v0, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 449
    .line 450
    .line 451
    move-result v0

    .line 452
    if-nez v0, :cond_2b

    .line 453
    .line 454
    invoke-virtual {v1}, Lw/o0;->o()Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    invoke-virtual {v12, v0}, Li0/E;->contains(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    move-result v0

    .line 462
    if-nez v0, :cond_2b

    .line 463
    .line 464
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    move v5, v9

    .line 469
    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 470
    .line 471
    .line 472
    move-result v6

    .line 473
    if-eqz v6, :cond_29

    .line 474
    .line 475
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v6

    .line 479
    invoke-interface {v13, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v6

    .line 483
    invoke-virtual {v1}, Lw/o0;->o()Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v9

    .line 487
    invoke-interface {v13, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v9

    .line 491
    invoke-static {v6, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 492
    .line 493
    .line 494
    move-result v6

    .line 495
    if-eqz v6, :cond_28

    .line 496
    .line 497
    :goto_14
    const/4 v0, -0x1

    .line 498
    goto :goto_15

    .line 499
    :cond_28
    add-int/lit8 v5, v5, 0x1

    .line 500
    .line 501
    const/4 v9, 0x0

    .line 502
    goto :goto_13

    .line 503
    :cond_29
    const/4 v5, -0x1

    .line 504
    goto :goto_14

    .line 505
    :goto_15
    if-ne v5, v0, :cond_2a

    .line 506
    .line 507
    invoke-virtual {v1}, Lw/o0;->o()Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    invoke-virtual {v12, v0}, Li0/E;->add(Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    goto :goto_16

    .line 515
    :cond_2a
    invoke-virtual {v1}, Lw/o0;->o()Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    invoke-virtual {v12, v5, v0}, Li0/E;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    :cond_2b
    :goto_16
    invoke-virtual {v1}, Lw/o0;->o()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    invoke-virtual {v2, v0}, Lt/c0;->c(Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    move-result v0

    .line 530
    if-eqz v0, :cond_2d

    .line 531
    .line 532
    invoke-virtual {v1}, Lw/o0;->h()Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    invoke-virtual {v2, v0}, Lt/c0;->c(Ljava/lang/Object;)Z

    .line 537
    .line 538
    .line 539
    move-result v0

    .line 540
    if-nez v0, :cond_2c

    .line 541
    .line 542
    goto :goto_17

    .line 543
    :cond_2c
    const v0, 0x3691f797    # 4.35016E-6f

    .line 544
    .line 545
    .line 546
    invoke-interface {v8, v0}, LY/m;->V(I)V

    .line 547
    .line 548
    .line 549
    invoke-interface {v8}, LY/m;->O()V

    .line 550
    .line 551
    .line 552
    move-object v5, v12

    .line 553
    move-object v12, v2

    .line 554
    goto :goto_19

    .line 555
    :cond_2d
    :goto_17
    const v0, 0x366a3a81

    .line 556
    .line 557
    .line 558
    invoke-interface {v8, v0}, LY/m;->V(I)V

    .line 559
    .line 560
    .line 561
    invoke-virtual {v2}, Lt/P;->k()V

    .line 562
    .line 563
    .line 564
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 565
    .line 566
    .line 567
    move-result v9

    .line 568
    const/4 v0, 0x0

    .line 569
    :goto_18
    if-ge v0, v9, :cond_2e

    .line 570
    .line 571
    move-object v6, v2

    .line 572
    invoke-interface {v12, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v2

    .line 576
    move v5, v0

    .line 577
    new-instance v0, Landroidx/compose/animation/a$f;

    .line 578
    .line 579
    move-object/from16 v16, v14

    .line 580
    .line 581
    move v14, v5

    .line 582
    move-object v5, v12

    .line 583
    move-object v12, v6

    .line 584
    move-object/from16 v6, v16

    .line 585
    .line 586
    invoke-direct/range {v0 .. v6}, Landroidx/compose/animation/a$f;-><init>(Lw/o0;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/e;Li0/E;Lie/p;)V

    .line 587
    .line 588
    .line 589
    const/16 v1, 0x36

    .line 590
    .line 591
    const v6, 0x34c9ce26

    .line 592
    .line 593
    .line 594
    invoke-static {v6, v10, v0, v8, v1}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    invoke-virtual {v12, v2, v0}, Lt/P;->x(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 599
    .line 600
    .line 601
    add-int/lit8 v0, v14, 0x1

    .line 602
    .line 603
    move-object/from16 v1, p0

    .line 604
    .line 605
    move-object/from16 v14, p5

    .line 606
    .line 607
    move-object v2, v12

    .line 608
    move-object v12, v5

    .line 609
    goto :goto_18

    .line 610
    :cond_2e
    move-object v5, v12

    .line 611
    move-object v12, v2

    .line 612
    invoke-interface {v8}, LY/m;->O()V

    .line 613
    .line 614
    .line 615
    :goto_19
    invoke-virtual/range {p0 .. p0}, Lw/o0;->m()Lw/o0$b;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    invoke-interface {v8, v4}, LY/m;->U(Ljava/lang/Object;)Z

    .line 620
    .line 621
    .line 622
    move-result v1

    .line 623
    invoke-interface {v8, v0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 624
    .line 625
    .line 626
    move-result v0

    .line 627
    or-int/2addr v0, v1

    .line 628
    invoke-interface {v8}, LY/m;->D()Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v1

    .line 632
    if-nez v0, :cond_2f

    .line 633
    .line 634
    sget-object v0, LY/m;->a:LY/m$a;

    .line 635
    .line 636
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    if-ne v1, v0, :cond_30

    .line 641
    .line 642
    :cond_2f
    invoke-interface {v3, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    move-object v1, v0

    .line 647
    check-cast v1, Lv/j;

    .line 648
    .line 649
    invoke-interface {v8, v1}, LY/m;->u(Ljava/lang/Object;)V

    .line 650
    .line 651
    .line 652
    :cond_30
    check-cast v1, Lv/j;

    .line 653
    .line 654
    const/4 v0, 0x0

    .line 655
    invoke-virtual {v4, v1, v8, v0}, Landroidx/compose/animation/e;->d(Lv/j;LY/m;I)Landroidx/compose/ui/e;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    invoke-interface {v15, v1}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    invoke-interface {v8}, LY/m;->D()Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    move-result-object v1

    .line 667
    sget-object v2, LY/m;->a:LY/m$a;

    .line 668
    .line 669
    invoke-virtual {v2}, LY/m$a;->a()Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object v2

    .line 673
    if-ne v1, v2, :cond_31

    .line 674
    .line 675
    new-instance v1, Landroidx/compose/animation/b;

    .line 676
    .line 677
    invoke-direct {v1, v4}, Landroidx/compose/animation/b;-><init>(Landroidx/compose/animation/e;)V

    .line 678
    .line 679
    .line 680
    invoke-interface {v8, v1}, LY/m;->u(Ljava/lang/Object;)V

    .line 681
    .line 682
    .line 683
    :cond_31
    check-cast v1, Landroidx/compose/animation/b;

    .line 684
    .line 685
    const/4 v2, 0x0

    .line 686
    invoke-static {v8, v2}, LY/h;->a(LY/m;I)I

    .line 687
    .line 688
    .line 689
    move-result v4

    .line 690
    invoke-interface {v8}, LY/m;->r()LY/I;

    .line 691
    .line 692
    .line 693
    move-result-object v2

    .line 694
    invoke-static {v8, v0}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 695
    .line 696
    .line 697
    move-result-object v0

    .line 698
    sget-object v6, LK0/g;->M:LK0/g$a;

    .line 699
    .line 700
    invoke-virtual {v6}, LK0/g$a;->a()Lie/a;

    .line 701
    .line 702
    .line 703
    move-result-object v9

    .line 704
    invoke-interface {v8}, LY/m;->j()LY/d;

    .line 705
    .line 706
    .line 707
    move-result-object v10

    .line 708
    if-nez v10, :cond_32

    .line 709
    .line 710
    invoke-static {}, LY/h;->d()V

    .line 711
    .line 712
    .line 713
    :cond_32
    invoke-interface {v8}, LY/m;->I()V

    .line 714
    .line 715
    .line 716
    invoke-interface {v8}, LY/m;->e()Z

    .line 717
    .line 718
    .line 719
    move-result v10

    .line 720
    if-eqz v10, :cond_33

    .line 721
    .line 722
    invoke-interface {v8, v9}, LY/m;->h(Lie/a;)V

    .line 723
    .line 724
    .line 725
    goto :goto_1a

    .line 726
    :cond_33
    invoke-interface {v8}, LY/m;->s()V

    .line 727
    .line 728
    .line 729
    :goto_1a
    invoke-static {v8}, LY/m2;->b(LY/m;)LY/m;

    .line 730
    .line 731
    .line 732
    move-result-object v9

    .line 733
    invoke-virtual {v6}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 734
    .line 735
    .line 736
    move-result-object v10

    .line 737
    invoke-static {v9, v1, v10}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 738
    .line 739
    .line 740
    invoke-virtual {v6}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 741
    .line 742
    .line 743
    move-result-object v1

    .line 744
    invoke-static {v9, v2, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 745
    .line 746
    .line 747
    invoke-virtual {v6}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 748
    .line 749
    .line 750
    move-result-object v1

    .line 751
    invoke-interface {v9}, LY/m;->e()Z

    .line 752
    .line 753
    .line 754
    move-result v2

    .line 755
    if-nez v2, :cond_34

    .line 756
    .line 757
    invoke-interface {v9}, LY/m;->D()Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object v2

    .line 761
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 762
    .line 763
    .line 764
    move-result-object v10

    .line 765
    invoke-static {v2, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 766
    .line 767
    .line 768
    move-result v2

    .line 769
    if-nez v2, :cond_35

    .line 770
    .line 771
    :cond_34
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 772
    .line 773
    .line 774
    move-result-object v2

    .line 775
    invoke-interface {v9, v2}, LY/m;->u(Ljava/lang/Object;)V

    .line 776
    .line 777
    .line 778
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 779
    .line 780
    .line 781
    move-result-object v2

    .line 782
    invoke-interface {v9, v2, v1}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 783
    .line 784
    .line 785
    :cond_35
    invoke-virtual {v6}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 786
    .line 787
    .line 788
    move-result-object v1

    .line 789
    invoke-static {v9, v0, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 790
    .line 791
    .line 792
    const v0, -0x58dee1d6

    .line 793
    .line 794
    .line 795
    invoke-interface {v8, v0}, LY/m;->V(I)V

    .line 796
    .line 797
    .line 798
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 799
    .line 800
    .line 801
    move-result v0

    .line 802
    const/4 v1, 0x0

    .line 803
    :goto_1b
    if-ge v1, v0, :cond_37

    .line 804
    .line 805
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 806
    .line 807
    .line 808
    move-result-object v2

    .line 809
    const v4, 0x71be94bd

    .line 810
    .line 811
    .line 812
    invoke-interface {v13, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 813
    .line 814
    .line 815
    move-result-object v6

    .line 816
    invoke-interface {v8, v4, v6}, LY/m;->H(ILjava/lang/Object;)V

    .line 817
    .line 818
    .line 819
    invoke-virtual {v12, v2}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 820
    .line 821
    .line 822
    move-result-object v2

    .line 823
    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 824
    .line 825
    if-nez v2, :cond_36

    .line 826
    .line 827
    const v2, -0x39eb2590

    .line 828
    .line 829
    .line 830
    invoke-interface {v8, v2}, LY/m;->V(I)V

    .line 831
    .line 832
    .line 833
    invoke-interface {v8}, LY/m;->O()V

    .line 834
    .line 835
    .line 836
    const/4 v4, 0x0

    .line 837
    goto :goto_1c

    .line 838
    :cond_36
    const v4, 0x71be9bb1

    .line 839
    .line 840
    .line 841
    invoke-interface {v8, v4}, LY/m;->V(I)V

    .line 842
    .line 843
    .line 844
    const/4 v4, 0x0

    .line 845
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 846
    .line 847
    .line 848
    move-result-object v6

    .line 849
    invoke-interface {v2, v8, v6}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    invoke-interface {v8}, LY/m;->O()V

    .line 853
    .line 854
    .line 855
    :goto_1c
    invoke-interface {v8}, LY/m;->S()V

    .line 856
    .line 857
    .line 858
    add-int/lit8 v1, v1, 0x1

    .line 859
    .line 860
    goto :goto_1b

    .line 861
    :cond_37
    invoke-interface {v8}, LY/m;->O()V

    .line 862
    .line 863
    .line 864
    invoke-interface {v8}, LY/m;->x()V

    .line 865
    .line 866
    .line 867
    invoke-static {}, LY/w;->L()Z

    .line 868
    .line 869
    .line 870
    move-result v0

    .line 871
    if-eqz v0, :cond_38

    .line 872
    .line 873
    invoke-static {}, LY/w;->T()V

    .line 874
    .line 875
    .line 876
    :cond_38
    move-object v2, v15

    .line 877
    goto/16 :goto_c

    .line 878
    .line 879
    :goto_1d
    invoke-interface {v8}, LY/m;->k()LY/B1;

    .line 880
    .line 881
    .line 882
    move-result-object v9

    .line 883
    if-eqz v9, :cond_39

    .line 884
    .line 885
    new-instance v0, Landroidx/compose/animation/a$g;

    .line 886
    .line 887
    move-object/from16 v1, p0

    .line 888
    .line 889
    move-object/from16 v6, p5

    .line 890
    .line 891
    move/from16 v8, p8

    .line 892
    .line 893
    invoke-direct/range {v0 .. v8}, Landroidx/compose/animation/a$g;-><init>(Lw/o0;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Ll0/e;Lkotlin/jvm/functions/Function1;Lie/p;II)V

    .line 894
    .line 895
    .line 896
    invoke-interface {v9, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 897
    .line 898
    .line 899
    :cond_39
    return-void
.end method

.method public static final c(ZLkotlin/jvm/functions/Function2;)Lv/w;
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/animation/l;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Landroidx/compose/animation/l;-><init>(ZLkotlin/jvm/functions/Function2;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic d(ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lv/w;
    .locals 0

    .line 1
    and-int/lit8 p3, p2, 0x1

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    :cond_0
    and-int/lit8 p2, p2, 0x2

    .line 7
    .line 8
    if-eqz p2, :cond_1

    .line 9
    .line 10
    sget-object p1, Landroidx/compose/animation/a$h;->a:Landroidx/compose/animation/a$h;

    .line 11
    .line 12
    :cond_1
    invoke-static {p0, p1}, Landroidx/compose/animation/a;->c(ZLkotlin/jvm/functions/Function2;)Lv/w;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static final e(Landroidx/compose/animation/h;Landroidx/compose/animation/j;)Lv/j;
    .locals 7

    .line 1
    new-instance v0, Lv/j;

    .line 2
    .line 3
    const/16 v5, 0xc

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    move-object v1, p0

    .line 9
    move-object v2, p1

    .line 10
    invoke-direct/range {v0 .. v6}, Lv/j;-><init>(Landroidx/compose/animation/h;Landroidx/compose/animation/j;FLv/w;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
