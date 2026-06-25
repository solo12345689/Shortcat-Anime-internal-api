.class public abstract Lcoil/compose/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Ljava/lang/Object;Ljava/lang/String;Lv4/d;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ll0/e;LI0/f;FLandroidx/compose/ui/graphics/d;ILY/m;III)V
    .locals 18

    .line 1
    move/from16 v12, p12

    .line 2
    .line 3
    move/from16 v14, p14

    .line 4
    .line 5
    const v0, -0x79027051

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p11

    .line 9
    .line 10
    invoke-interface {v1, v0}, LY/m;->g(I)LY/m;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    and-int/lit8 v2, v14, 0x8

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    sget-object v2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 19
    .line 20
    move-object v4, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object/from16 v4, p3

    .line 23
    .line 24
    :goto_0
    and-int/lit8 v2, v14, 0x10

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    sget-object v2, Lcoil/compose/AsyncImagePainter;->v:Lcoil/compose/AsyncImagePainter$b;

    .line 29
    .line 30
    invoke-virtual {v2}, Lcoil/compose/AsyncImagePainter$b;->a()Lkotlin/jvm/functions/Function1;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    move-object v5, v2

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move-object/from16 v5, p4

    .line 37
    .line 38
    :goto_1
    and-int/lit8 v2, v14, 0x20

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    move-object v6, v3

    .line 44
    goto :goto_2

    .line 45
    :cond_2
    move-object/from16 v6, p5

    .line 46
    .line 47
    :goto_2
    and-int/lit8 v2, v14, 0x40

    .line 48
    .line 49
    if-eqz v2, :cond_3

    .line 50
    .line 51
    sget-object v2, Ll0/e;->a:Ll0/e$a;

    .line 52
    .line 53
    invoke-virtual {v2}, Ll0/e$a;->e()Ll0/e;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    move-object v7, v2

    .line 58
    goto :goto_3

    .line 59
    :cond_3
    move-object/from16 v7, p6

    .line 60
    .line 61
    :goto_3
    and-int/lit16 v2, v14, 0x80

    .line 62
    .line 63
    if-eqz v2, :cond_4

    .line 64
    .line 65
    sget-object v2, LI0/f;->a:LI0/f$a;

    .line 66
    .line 67
    invoke-virtual {v2}, LI0/f$a;->b()LI0/f;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    move-object v8, v2

    .line 72
    goto :goto_4

    .line 73
    :cond_4
    move-object/from16 v8, p7

    .line 74
    .line 75
    :goto_4
    and-int/lit16 v2, v14, 0x100

    .line 76
    .line 77
    if-eqz v2, :cond_5

    .line 78
    .line 79
    const/high16 v2, 0x3f800000    # 1.0f

    .line 80
    .line 81
    move v9, v2

    .line 82
    goto :goto_5

    .line 83
    :cond_5
    move/from16 v9, p8

    .line 84
    .line 85
    :goto_5
    and-int/lit16 v2, v14, 0x200

    .line 86
    .line 87
    if-eqz v2, :cond_6

    .line 88
    .line 89
    move-object v10, v3

    .line 90
    goto :goto_6

    .line 91
    :cond_6
    move-object/from16 v10, p9

    .line 92
    .line 93
    :goto_6
    and-int/lit16 v2, v14, 0x400

    .line 94
    .line 95
    if-eqz v2, :cond_7

    .line 96
    .line 97
    sget-object v2, Lu0/f;->j0:Lu0/f$a;

    .line 98
    .line 99
    invoke-virtual {v2}, Lu0/f$a;->b()I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    and-int/lit8 v3, p13, -0xf

    .line 104
    .line 105
    move v11, v2

    .line 106
    goto :goto_7

    .line 107
    :cond_7
    move/from16 v11, p10

    .line 108
    .line 109
    move/from16 v3, p13

    .line 110
    .line 111
    :goto_7
    invoke-static {}, LY/w;->L()Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-eqz v2, :cond_8

    .line 116
    .line 117
    const-string v2, "coil.compose.AsyncImage (AsyncImage.kt:118)"

    .line 118
    .line 119
    invoke-static {v0, v12, v3, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :cond_8
    const/16 v0, 0x8

    .line 123
    .line 124
    move-object/from16 v2, p0

    .line 125
    .line 126
    invoke-static {v2, v1, v0}, Lcoil/compose/c;->e(Ljava/lang/Object;LY/m;I)LG4/h;

    .line 127
    .line 128
    .line 129
    move-result-object v13

    .line 130
    shr-int/lit8 v15, v12, 0x12

    .line 131
    .line 132
    and-int/lit8 v15, v15, 0x70

    .line 133
    .line 134
    or-int/2addr v0, v15

    .line 135
    invoke-static {v13, v8, v1, v0}, Lcoil/compose/a;->g(LG4/h;LI0/f;LY/m;I)LG4/h;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    shr-int/lit8 v13, v12, 0x6

    .line 140
    .line 141
    and-int/lit16 v15, v13, 0x380

    .line 142
    .line 143
    or-int/lit8 v15, v15, 0x48

    .line 144
    .line 145
    and-int/lit16 v13, v13, 0x1c00

    .line 146
    .line 147
    or-int/2addr v13, v15

    .line 148
    shr-int/lit8 v15, v12, 0x9

    .line 149
    .line 150
    const v16, 0xe000

    .line 151
    .line 152
    .line 153
    and-int v16, v15, v16

    .line 154
    .line 155
    or-int v13, v13, v16

    .line 156
    .line 157
    shl-int/lit8 v3, v3, 0xf

    .line 158
    .line 159
    const/high16 v17, 0x70000

    .line 160
    .line 161
    and-int v3, v3, v17

    .line 162
    .line 163
    or-int/2addr v3, v13

    .line 164
    const/4 v13, 0x0

    .line 165
    move-object/from16 p4, p2

    .line 166
    .line 167
    move-object/from16 p3, v0

    .line 168
    .line 169
    move-object/from16 p9, v1

    .line 170
    .line 171
    move/from16 p10, v3

    .line 172
    .line 173
    move-object/from16 p5, v5

    .line 174
    .line 175
    move-object/from16 p6, v6

    .line 176
    .line 177
    move-object/from16 p7, v8

    .line 178
    .line 179
    move/from16 p8, v11

    .line 180
    .line 181
    move/from16 p11, v13

    .line 182
    .line 183
    invoke-static/range {p3 .. p11}, Lcoil/compose/b;->e(Ljava/lang/Object;Lv4/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LI0/f;ILY/m;II)Lcoil/compose/AsyncImagePainter;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    move-object/from16 v3, p3

    .line 188
    .line 189
    invoke-virtual {v3}, LG4/h;->K()LH4/i;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    instance-of v13, v3, Lw4/a;

    .line 194
    .line 195
    if-eqz v13, :cond_9

    .line 196
    .line 197
    check-cast v3, Landroidx/compose/ui/e;

    .line 198
    .line 199
    invoke-interface {v4, v3}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    goto :goto_8

    .line 204
    :cond_9
    move-object v3, v4

    .line 205
    :goto_8
    shl-int/lit8 v13, v12, 0x3

    .line 206
    .line 207
    and-int/lit16 v13, v13, 0x380

    .line 208
    .line 209
    move-object/from16 p4, v0

    .line 210
    .line 211
    and-int/lit16 v0, v15, 0x1c00

    .line 212
    .line 213
    or-int/2addr v0, v13

    .line 214
    or-int v0, v0, v16

    .line 215
    .line 216
    and-int v13, v15, v17

    .line 217
    .line 218
    or-int/2addr v0, v13

    .line 219
    const/high16 v13, 0x380000

    .line 220
    .line 221
    and-int/2addr v13, v15

    .line 222
    or-int/2addr v0, v13

    .line 223
    move-object/from16 p5, p1

    .line 224
    .line 225
    move/from16 p11, v0

    .line 226
    .line 227
    move-object/from16 p10, v1

    .line 228
    .line 229
    move-object/from16 p3, v3

    .line 230
    .line 231
    move-object/from16 p6, v7

    .line 232
    .line 233
    move-object/from16 p7, v8

    .line 234
    .line 235
    move/from16 p8, v9

    .line 236
    .line 237
    move-object/from16 p9, v10

    .line 238
    .line 239
    invoke-static/range {p3 .. p11}, Lcoil/compose/a;->c(Landroidx/compose/ui/e;Lw0/b;Ljava/lang/String;Ll0/e;LI0/f;FLandroidx/compose/ui/graphics/d;LY/m;I)V

    .line 240
    .line 241
    .line 242
    invoke-static {}, LY/w;->L()Z

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    if-eqz v0, :cond_a

    .line 247
    .line 248
    invoke-static {}, LY/w;->T()V

    .line 249
    .line 250
    .line 251
    :cond_a
    invoke-interface {v1}, LY/m;->k()LY/B1;

    .line 252
    .line 253
    .line 254
    move-result-object v15

    .line 255
    if-nez v15, :cond_b

    .line 256
    .line 257
    return-void

    .line 258
    :cond_b
    new-instance v0, Lcoil/compose/a$a;

    .line 259
    .line 260
    move-object/from16 v3, p2

    .line 261
    .line 262
    move/from16 v13, p13

    .line 263
    .line 264
    move-object v1, v2

    .line 265
    move-object/from16 v2, p1

    .line 266
    .line 267
    invoke-direct/range {v0 .. v14}, Lcoil/compose/a$a;-><init>(Ljava/lang/Object;Ljava/lang/String;Lv4/d;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ll0/e;LI0/f;FLandroidx/compose/ui/graphics/d;IIII)V

    .line 268
    .line 269
    .line 270
    invoke-interface {v15, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 271
    .line 272
    .line 273
    return-void
.end method

.method public static final b(Ljava/lang/Object;Ljava/lang/String;Lv4/d;Landroidx/compose/ui/e;Lw0/b;Lw0/b;Lw0/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ll0/e;LI0/f;FLandroidx/compose/ui/graphics/d;ILY/m;III)V
    .locals 19

    move/from16 v0, p16

    move/from16 v1, p17

    move/from16 v2, p18

    const v3, -0xea92007

    move-object/from16 v15, p15

    invoke-interface {v15, v3}, LY/m;->C(I)V

    and-int/lit8 v4, v2, 0x8

    if-eqz v4, :cond_0

    .line 1
    sget-object v4, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    move-object v7, v4

    goto :goto_0

    :cond_0
    move-object/from16 v7, p3

    :goto_0
    and-int/lit8 v4, v2, 0x10

    if-eqz v4, :cond_1

    const/4 v4, 0x0

    goto :goto_1

    :cond_1
    move-object/from16 v4, p4

    :goto_1
    and-int/lit8 v6, v2, 0x20

    if-eqz v6, :cond_2

    const/4 v6, 0x0

    goto :goto_2

    :cond_2
    move-object/from16 v6, p5

    :goto_2
    and-int/lit8 v8, v2, 0x40

    if-eqz v8, :cond_3

    move-object v8, v6

    goto :goto_3

    :cond_3
    move-object/from16 v8, p6

    :goto_3
    and-int/lit16 v9, v2, 0x80

    if-eqz v9, :cond_4

    const/4 v9, 0x0

    goto :goto_4

    :cond_4
    move-object/from16 v9, p7

    :goto_4
    and-int/lit16 v10, v2, 0x100

    if-eqz v10, :cond_5

    const/4 v10, 0x0

    goto :goto_5

    :cond_5
    move-object/from16 v10, p8

    :goto_5
    and-int/lit16 v11, v2, 0x200

    if-eqz v11, :cond_6

    const/4 v11, 0x0

    goto :goto_6

    :cond_6
    move-object/from16 v11, p9

    :goto_6
    and-int/lit16 v12, v2, 0x400

    if-eqz v12, :cond_7

    .line 2
    sget-object v12, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v12}, Ll0/e$a;->e()Ll0/e;

    move-result-object v12

    goto :goto_7

    :cond_7
    move-object/from16 v12, p10

    :goto_7
    and-int/lit16 v13, v2, 0x800

    if-eqz v13, :cond_8

    .line 3
    sget-object v13, LI0/f;->a:LI0/f$a;

    invoke-virtual {v13}, LI0/f$a;->b()LI0/f;

    move-result-object v13

    goto :goto_8

    :cond_8
    move-object/from16 v13, p11

    :goto_8
    and-int/lit16 v14, v2, 0x1000

    if-eqz v14, :cond_9

    const/high16 v14, 0x3f800000    # 1.0f

    goto :goto_9

    :cond_9
    move/from16 v14, p12

    :goto_9
    and-int/lit16 v5, v2, 0x2000

    if-eqz v5, :cond_a

    const/4 v5, 0x0

    goto :goto_a

    :cond_a
    move-object/from16 v5, p13

    :goto_a
    and-int/lit16 v2, v2, 0x4000

    if-eqz v2, :cond_b

    .line 4
    sget-object v2, Lu0/f;->j0:Lu0/f$a;

    invoke-virtual {v2}, Lu0/f$a;->b()I

    move-result v2

    goto :goto_b

    :cond_b
    move/from16 v2, p14

    :goto_b
    invoke-static {}, LY/w;->L()Z

    move-result v16

    move/from16 p3, v2

    if-eqz v16, :cond_c

    const-string v2, "coil.compose.AsyncImage (AsyncImage.kt:64)"

    .line 5
    invoke-static {v3, v0, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 6
    :cond_c
    invoke-static {v4, v6, v8}, Lcoil/compose/c;->h(Lw0/b;Lw0/b;Lw0/b;)Lkotlin/jvm/functions/Function1;

    move-result-object v8

    .line 7
    invoke-static {v9, v10, v11}, Lcoil/compose/c;->d(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;

    move-result-object v9

    and-int/lit8 v2, v0, 0x70

    or-int/lit16 v2, v2, 0x208

    and-int/lit16 v0, v0, 0x1c00

    or-int/2addr v0, v2

    shl-int/lit8 v2, v1, 0x12

    const/high16 v3, 0x380000

    and-int/2addr v3, v2

    or-int/2addr v0, v3

    const/high16 v3, 0x1c00000

    and-int/2addr v3, v2

    or-int/2addr v0, v3

    const/high16 v3, 0xe000000

    and-int/2addr v3, v2

    or-int/2addr v0, v3

    const/high16 v3, 0x70000000

    and-int/2addr v2, v3

    or-int v16, v0, v2

    shr-int/lit8 v0, v1, 0xc

    and-int/lit8 v17, v0, 0xe

    const/16 v18, 0x0

    move-object/from16 v4, p0

    move-object/from16 v6, p2

    move-object v10, v12

    move-object v11, v13

    move v12, v14

    move/from16 v14, p3

    move-object v13, v5

    move-object/from16 v5, p1

    .line 8
    invoke-static/range {v4 .. v18}, Lcoil/compose/a;->a(Ljava/lang/Object;Ljava/lang/String;Lv4/d;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ll0/e;LI0/f;FLandroidx/compose/ui/graphics/d;ILY/m;III)V

    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, LY/w;->T()V

    :cond_d
    invoke-interface/range {p15 .. p15}, LY/m;->T()V

    return-void
.end method

.method public static final c(Landroidx/compose/ui/e;Lw0/b;Ljava/lang/String;Ll0/e;LI0/f;FLandroidx/compose/ui/graphics/d;LY/m;I)V
    .locals 19

    .line 1
    const v0, 0x9d0565

    .line 2
    .line 3
    .line 4
    move-object/from16 v1, p7

    .line 5
    .line 6
    invoke-interface {v1, v0}, LY/m;->g(I)LY/m;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {}, LY/w;->L()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    const/4 v2, -0x1

    .line 17
    const-string v3, "coil.compose.Content (AsyncImage.kt:156)"

    .line 18
    .line 19
    move/from16 v12, p8

    .line 20
    .line 21
    invoke-static {v0, v12, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    move-object/from16 v5, p0

    .line 25
    .line 26
    move-object/from16 v7, p2

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    move/from16 v12, p8

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :goto_1
    invoke-static {v5, v7}, Lcoil/compose/a;->e(Landroidx/compose/ui/e;Ljava/lang/String;)Landroidx/compose/ui/e;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, Lp0/g;->b(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v13, Lcoil/compose/ContentPainterModifier;

    .line 41
    .line 42
    move-object/from16 v14, p1

    .line 43
    .line 44
    move-object/from16 v15, p3

    .line 45
    .line 46
    move-object/from16 v16, p4

    .line 47
    .line 48
    move/from16 v17, p5

    .line 49
    .line 50
    move-object/from16 v18, p6

    .line 51
    .line 52
    invoke-direct/range {v13 .. v18}, Lcoil/compose/ContentPainterModifier;-><init>(Lw0/b;Ll0/e;LI0/f;FLandroidx/compose/ui/graphics/d;)V

    .line 53
    .line 54
    .line 55
    invoke-interface {v0, v13}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sget-object v2, Lcoil/compose/a$c;->a:Lcoil/compose/a$c;

    .line 60
    .line 61
    const v3, 0x207baf9a

    .line 62
    .line 63
    .line 64
    invoke-interface {v1, v3}, LY/m;->C(I)V

    .line 65
    .line 66
    .line 67
    invoke-static {}, Landroidx/compose/ui/platform/w0;->e()LY/b1;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-interface {v1, v3}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    check-cast v3, Li1/d;

    .line 76
    .line 77
    invoke-static {}, Landroidx/compose/ui/platform/w0;->k()LY/b1;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-interface {v1, v4}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    check-cast v4, Li1/t;

    .line 86
    .line 87
    invoke-static {}, Landroidx/compose/ui/platform/w0;->r()LY/b1;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    invoke-interface {v1, v6}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    check-cast v6, Landroidx/compose/ui/platform/A1;

    .line 96
    .line 97
    invoke-static {v1, v0}, Landroidx/compose/ui/c;->d(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    sget-object v8, LK0/g;->M:LK0/g$a;

    .line 102
    .line 103
    invoke-virtual {v8}, LK0/g$a;->a()Lie/a;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    const v10, 0x53ca7ea5

    .line 108
    .line 109
    .line 110
    invoke-interface {v1, v10}, LY/m;->C(I)V

    .line 111
    .line 112
    .line 113
    invoke-interface {v1}, LY/m;->j()LY/d;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    if-nez v10, :cond_1

    .line 118
    .line 119
    invoke-static {}, LY/h;->d()V

    .line 120
    .line 121
    .line 122
    :cond_1
    invoke-interface {v1}, LY/m;->I()V

    .line 123
    .line 124
    .line 125
    invoke-interface {v1}, LY/m;->e()Z

    .line 126
    .line 127
    .line 128
    move-result v10

    .line 129
    if-eqz v10, :cond_2

    .line 130
    .line 131
    new-instance v10, Lcoil/compose/a$b;

    .line 132
    .line 133
    invoke-direct {v10, v9}, Lcoil/compose/a$b;-><init>(Lie/a;)V

    .line 134
    .line 135
    .line 136
    invoke-interface {v1, v10}, LY/m;->h(Lie/a;)V

    .line 137
    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_2
    invoke-interface {v1}, LY/m;->s()V

    .line 141
    .line 142
    .line 143
    :goto_2
    invoke-static {v1}, LY/m2;->b(LY/m;)LY/m;

    .line 144
    .line 145
    .line 146
    move-result-object v9

    .line 147
    invoke-virtual {v8}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 148
    .line 149
    .line 150
    move-result-object v10

    .line 151
    invoke-static {v9, v2, v10}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v8}, LK0/g$a;->c()Lkotlin/jvm/functions/Function2;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-static {v9, v3, v2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v8}, LK0/g$a;->d()Lkotlin/jvm/functions/Function2;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-static {v9, v4, v2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v8}, LK0/g$a;->h()Lkotlin/jvm/functions/Function2;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-static {v9, v6, v2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v8}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    invoke-static {v9, v0, v2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 180
    .line 181
    .line 182
    invoke-interface {v1}, LY/m;->x()V

    .line 183
    .line 184
    .line 185
    invoke-interface {v1}, LY/m;->T()V

    .line 186
    .line 187
    .line 188
    invoke-interface {v1}, LY/m;->T()V

    .line 189
    .line 190
    .line 191
    invoke-static {}, LY/w;->L()Z

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-eqz v0, :cond_3

    .line 196
    .line 197
    invoke-static {}, LY/w;->T()V

    .line 198
    .line 199
    .line 200
    :cond_3
    invoke-interface {v1}, LY/m;->k()LY/B1;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    if-nez v0, :cond_4

    .line 205
    .line 206
    return-void

    .line 207
    :cond_4
    new-instance v4, Lcoil/compose/a$d;

    .line 208
    .line 209
    move-object/from16 v6, p1

    .line 210
    .line 211
    move-object/from16 v8, p3

    .line 212
    .line 213
    move-object/from16 v9, p4

    .line 214
    .line 215
    move/from16 v10, p5

    .line 216
    .line 217
    move-object/from16 v11, p6

    .line 218
    .line 219
    invoke-direct/range {v4 .. v12}, Lcoil/compose/a$d;-><init>(Landroidx/compose/ui/e;Lw0/b;Ljava/lang/String;Ll0/e;LI0/f;FLandroidx/compose/ui/graphics/d;I)V

    .line 220
    .line 221
    .line 222
    invoke-interface {v0, v4}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 223
    .line 224
    .line 225
    return-void
.end method

.method public static final synthetic d(J)LH4/h;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcoil/compose/a;->f(J)LH4/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/e;Ljava/lang/String;)Landroidx/compose/ui/e;
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Lcoil/compose/a$e;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Lcoil/compose/a$e;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-static {p0, v2, v0, p1, v1}, LR0/r;->f(Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :cond_0
    return-object p0
.end method

.method private static final f(J)LH4/h;
    .locals 3

    .line 1
    invoke-static {p0, p1}, Li1/b;->p(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance v0, LH4/h;

    .line 10
    .line 11
    invoke-static {p0, p1}, Li1/b;->h(J)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-static {p0, p1}, Li1/b;->l(J)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {v1}, LH4/a;->a(I)LH4/c$a;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    sget-object v1, LH4/c$b;->a:LH4/c$b;

    .line 27
    .line 28
    :goto_0
    invoke-static {p0, p1}, Li1/b;->g(J)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    invoke-static {p0, p1}, Li1/b;->k(J)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    invoke-static {p0}, LH4/a;->a(I)LH4/c$a;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    sget-object p0, LH4/c$b;->a:LH4/c$b;

    .line 44
    .line 45
    :goto_1
    invoke-direct {v0, v1, p0}, LH4/h;-><init>(LH4/c;LH4/c;)V

    .line 46
    .line 47
    .line 48
    return-object v0
.end method

.method public static final g(LG4/h;LI0/f;LY/m;I)LG4/h;
    .locals 3

    .line 1
    const v0, 0x17fba9d7

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, v0}, LY/m;->C(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, LY/w;->L()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    const-string v2, "coil.compose.updateRequest (AsyncImage.kt:183)"

    .line 15
    .line 16
    invoke-static {v0, p3, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, LG4/h;->q()LG4/d;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    invoke-virtual {p3}, LG4/d;->m()LH4/i;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    if-nez p3, :cond_3

    .line 28
    .line 29
    sget-object p3, LI0/f;->a:LI0/f$a;

    .line 30
    .line 31
    invoke-virtual {p3}, LI0/f$a;->d()LI0/i;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    sget-object p1, LH4/h;->d:LH4/h;

    .line 42
    .line 43
    invoke-static {p1}, LH4/j;->a(LH4/h;)LH4/i;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const p1, -0x1d58f75c

    .line 49
    .line 50
    .line 51
    invoke-interface {p2, p1}, LY/m;->C(I)V

    .line 52
    .line 53
    .line 54
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    sget-object p3, LY/m;->a:LY/m$a;

    .line 59
    .line 60
    invoke-virtual {p3}, LY/m$a;->a()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    if-ne p1, p3, :cond_2

    .line 65
    .line 66
    new-instance p1, Lw4/a;

    .line 67
    .line 68
    invoke-direct {p1}, Lw4/a;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-interface {p2, p1}, LY/m;->u(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    invoke-interface {p2}, LY/m;->T()V

    .line 75
    .line 76
    .line 77
    check-cast p1, LH4/i;

    .line 78
    .line 79
    :goto_0
    const/4 p3, 0x1

    .line 80
    const/4 v0, 0x0

    .line 81
    invoke-static {p0, v0, p3, v0}, LG4/h;->R(LG4/h;Landroid/content/Context;ILjava/lang/Object;)LG4/h$a;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p0, p1}, LG4/h$a;->n(LH4/i;)LG4/h$a;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-virtual {p0}, LG4/h$a;->a()LG4/h;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    :cond_3
    invoke-static {}, LY/w;->L()Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_4

    .line 98
    .line 99
    invoke-static {}, LY/w;->T()V

    .line 100
    .line 101
    .line 102
    :cond_4
    invoke-interface {p2}, LY/m;->T()V

    .line 103
    .line 104
    .line 105
    return-object p0
.end method
