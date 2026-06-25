.class public abstract LQ/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(LQ/i;Ll0/e;Lkotlin/jvm/functions/Function2;LY/m;I)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v5, p2

    .line 6
    .line 7
    move/from16 v9, p4

    .line 8
    .line 9
    const v2, 0x1c5fd74b

    .line 10
    .line 11
    .line 12
    move-object/from16 v3, p3

    .line 13
    .line 14
    invoke-interface {v3, v2}, LY/m;->g(I)LY/m;

    .line 15
    .line 16
    .line 17
    move-result-object v6

    .line 18
    and-int/lit8 v3, v9, 0x6

    .line 19
    .line 20
    const/4 v4, 0x4

    .line 21
    if-nez v3, :cond_2

    .line 22
    .line 23
    and-int/lit8 v3, v9, 0x8

    .line 24
    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    invoke-interface {v6, v0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-interface {v6, v0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    :goto_0
    if-eqz v3, :cond_1

    .line 37
    .line 38
    move v3, v4

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/4 v3, 0x2

    .line 41
    :goto_1
    or-int/2addr v3, v9

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    move v3, v9

    .line 44
    :goto_2
    and-int/lit8 v7, v9, 0x30

    .line 45
    .line 46
    const/16 v8, 0x20

    .line 47
    .line 48
    if-nez v7, :cond_4

    .line 49
    .line 50
    invoke-interface {v6, v1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    if-eqz v7, :cond_3

    .line 55
    .line 56
    move v7, v8

    .line 57
    goto :goto_3

    .line 58
    :cond_3
    const/16 v7, 0x10

    .line 59
    .line 60
    :goto_3
    or-int/2addr v3, v7

    .line 61
    :cond_4
    and-int/lit16 v7, v9, 0x180

    .line 62
    .line 63
    if-nez v7, :cond_6

    .line 64
    .line 65
    invoke-interface {v6, v5}, LY/m;->F(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    if-eqz v7, :cond_5

    .line 70
    .line 71
    const/16 v7, 0x100

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_5
    const/16 v7, 0x80

    .line 75
    .line 76
    :goto_4
    or-int/2addr v3, v7

    .line 77
    :cond_6
    and-int/lit16 v7, v3, 0x93

    .line 78
    .line 79
    const/16 v10, 0x92

    .line 80
    .line 81
    if-ne v7, v10, :cond_8

    .line 82
    .line 83
    invoke-interface {v6}, LY/m;->i()Z

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    if-nez v7, :cond_7

    .line 88
    .line 89
    goto :goto_5

    .line 90
    :cond_7
    invoke-interface {v6}, LY/m;->K()V

    .line 91
    .line 92
    .line 93
    goto :goto_7

    .line 94
    :cond_8
    :goto_5
    invoke-static {}, LY/w;->L()Z

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    if-eqz v7, :cond_9

    .line 99
    .line 100
    const/4 v7, -0x1

    .line 101
    const-string v10, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:247)"

    .line 102
    .line 103
    invoke-static {v2, v3, v7, v10}, LY/w;->U(IIILjava/lang/String;)V

    .line 104
    .line 105
    .line 106
    :cond_9
    and-int/lit8 v2, v3, 0x70

    .line 107
    .line 108
    const/4 v7, 0x0

    .line 109
    const/4 v10, 0x1

    .line 110
    if-ne v2, v8, :cond_a

    .line 111
    .line 112
    move v2, v10

    .line 113
    goto :goto_6

    .line 114
    :cond_a
    move v2, v7

    .line 115
    :goto_6
    and-int/lit8 v8, v3, 0xe

    .line 116
    .line 117
    if-eq v8, v4, :cond_b

    .line 118
    .line 119
    and-int/lit8 v4, v3, 0x8

    .line 120
    .line 121
    if-eqz v4, :cond_c

    .line 122
    .line 123
    invoke-interface {v6, v0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-eqz v4, :cond_c

    .line 128
    .line 129
    :cond_b
    move v7, v10

    .line 130
    :cond_c
    or-int/2addr v2, v7

    .line 131
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    if-nez v2, :cond_d

    .line 136
    .line 137
    sget-object v2, LY/m;->a:LY/m$a;

    .line 138
    .line 139
    invoke-virtual {v2}, LY/m$a;->a()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    if-ne v4, v2, :cond_e

    .line 144
    .line 145
    :cond_d
    new-instance v4, LQ/g;

    .line 146
    .line 147
    invoke-direct {v4, v1, v0}, LQ/g;-><init>(Ll0/e;LQ/i;)V

    .line 148
    .line 149
    .line 150
    invoke-interface {v6, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    :cond_e
    move-object v2, v4

    .line 154
    check-cast v2, LQ/g;

    .line 155
    .line 156
    new-instance v4, Landroidx/compose/ui/window/t;

    .line 157
    .line 158
    const/16 v17, 0xf

    .line 159
    .line 160
    const/16 v18, 0x0

    .line 161
    .line 162
    const/4 v11, 0x0

    .line 163
    const/4 v12, 0x0

    .line 164
    const/4 v13, 0x0

    .line 165
    const/4 v14, 0x0

    .line 166
    const/4 v15, 0x1

    .line 167
    const/16 v16, 0x0

    .line 168
    .line 169
    move-object v10, v4

    .line 170
    invoke-direct/range {v10 .. v18}, Landroidx/compose/ui/window/t;-><init>(ZZZLandroidx/compose/ui/window/u;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 171
    .line 172
    .line 173
    shl-int/lit8 v3, v3, 0x3

    .line 174
    .line 175
    and-int/lit16 v3, v3, 0x1c00

    .line 176
    .line 177
    or-int/lit16 v7, v3, 0x180

    .line 178
    .line 179
    const/4 v8, 0x2

    .line 180
    const/4 v3, 0x0

    .line 181
    invoke-static/range {v2 .. v8}, Landroidx/compose/ui/window/b;->a(Landroidx/compose/ui/window/s;Lie/a;Landroidx/compose/ui/window/t;Lkotlin/jvm/functions/Function2;LY/m;II)V

    .line 182
    .line 183
    .line 184
    invoke-static {}, LY/w;->L()Z

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    if-eqz v2, :cond_f

    .line 189
    .line 190
    invoke-static {}, LY/w;->T()V

    .line 191
    .line 192
    .line 193
    :cond_f
    :goto_7
    invoke-interface {v6}, LY/m;->k()LY/B1;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    if-eqz v2, :cond_10

    .line 198
    .line 199
    new-instance v3, LQ/a$a;

    .line 200
    .line 201
    invoke-direct {v3, v0, v1, v5, v9}, LQ/a$a;-><init>(LQ/i;Ll0/e;Lkotlin/jvm/functions/Function2;I)V

    .line 202
    .line 203
    .line 204
    invoke-interface {v2, v3}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 205
    .line 206
    .line 207
    :cond_10
    return-void
.end method

.method public static final b(LQ/i;ZLg1/i;ZJLandroidx/compose/ui/e;LY/m;II)V
    .locals 19

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v8, p6

    .line 6
    .line 7
    move/from16 v9, p8

    .line 8
    .line 9
    const v0, -0x324ab118

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p7

    .line 13
    .line 14
    invoke-interface {v1, v0}, LY/m;->g(I)LY/m;

    .line 15
    .line 16
    .line 17
    move-result-object v10

    .line 18
    and-int/lit8 v1, p9, 0x1

    .line 19
    .line 20
    const/4 v2, 0x4

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    or-int/lit8 v1, v9, 0x6

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_0
    and-int/lit8 v1, v9, 0x6

    .line 27
    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    and-int/lit8 v1, v9, 0x8

    .line 31
    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    invoke-interface {v10, v6}, LY/m;->U(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-interface {v10, v6}, LY/m;->F(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    :goto_0
    if-eqz v1, :cond_2

    .line 44
    .line 45
    move v1, v2

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    const/4 v1, 0x2

    .line 48
    :goto_1
    or-int/2addr v1, v9

    .line 49
    goto :goto_2

    .line 50
    :cond_3
    move v1, v9

    .line 51
    :goto_2
    and-int/lit8 v3, p9, 0x2

    .line 52
    .line 53
    const/16 v4, 0x20

    .line 54
    .line 55
    if-eqz v3, :cond_4

    .line 56
    .line 57
    or-int/lit8 v1, v1, 0x30

    .line 58
    .line 59
    goto :goto_4

    .line 60
    :cond_4
    and-int/lit8 v3, v9, 0x30

    .line 61
    .line 62
    if-nez v3, :cond_6

    .line 63
    .line 64
    invoke-interface {v10, v7}, LY/m;->a(Z)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_5

    .line 69
    .line 70
    move v3, v4

    .line 71
    goto :goto_3

    .line 72
    :cond_5
    const/16 v3, 0x10

    .line 73
    .line 74
    :goto_3
    or-int/2addr v1, v3

    .line 75
    :cond_6
    :goto_4
    and-int/lit8 v3, p9, 0x4

    .line 76
    .line 77
    if-eqz v3, :cond_7

    .line 78
    .line 79
    or-int/lit16 v1, v1, 0x180

    .line 80
    .line 81
    move-object/from16 v11, p2

    .line 82
    .line 83
    goto :goto_6

    .line 84
    :cond_7
    and-int/lit16 v3, v9, 0x180

    .line 85
    .line 86
    move-object/from16 v11, p2

    .line 87
    .line 88
    if-nez v3, :cond_9

    .line 89
    .line 90
    invoke-interface {v10, v11}, LY/m;->U(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_8

    .line 95
    .line 96
    const/16 v3, 0x100

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_8
    const/16 v3, 0x80

    .line 100
    .line 101
    :goto_5
    or-int/2addr v1, v3

    .line 102
    :cond_9
    :goto_6
    and-int/lit8 v3, p9, 0x8

    .line 103
    .line 104
    if-eqz v3, :cond_a

    .line 105
    .line 106
    or-int/lit16 v1, v1, 0xc00

    .line 107
    .line 108
    move/from16 v12, p3

    .line 109
    .line 110
    goto :goto_8

    .line 111
    :cond_a
    and-int/lit16 v3, v9, 0xc00

    .line 112
    .line 113
    move/from16 v12, p3

    .line 114
    .line 115
    if-nez v3, :cond_c

    .line 116
    .line 117
    invoke-interface {v10, v12}, LY/m;->a(Z)Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eqz v3, :cond_b

    .line 122
    .line 123
    const/16 v3, 0x800

    .line 124
    .line 125
    goto :goto_7

    .line 126
    :cond_b
    const/16 v3, 0x400

    .line 127
    .line 128
    :goto_7
    or-int/2addr v1, v3

    .line 129
    :cond_c
    :goto_8
    and-int/lit16 v3, v9, 0x6000

    .line 130
    .line 131
    if-nez v3, :cond_e

    .line 132
    .line 133
    and-int/lit8 v3, p9, 0x10

    .line 134
    .line 135
    move-wide/from16 v13, p4

    .line 136
    .line 137
    if-nez v3, :cond_d

    .line 138
    .line 139
    invoke-interface {v10, v13, v14}, LY/m;->d(J)Z

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-eqz v3, :cond_d

    .line 144
    .line 145
    const/16 v3, 0x4000

    .line 146
    .line 147
    goto :goto_9

    .line 148
    :cond_d
    const/16 v3, 0x2000

    .line 149
    .line 150
    :goto_9
    or-int/2addr v1, v3

    .line 151
    goto :goto_a

    .line 152
    :cond_e
    move-wide/from16 v13, p4

    .line 153
    .line 154
    :goto_a
    and-int/lit8 v3, p9, 0x20

    .line 155
    .line 156
    const/high16 v5, 0x30000

    .line 157
    .line 158
    if-eqz v3, :cond_f

    .line 159
    .line 160
    or-int/2addr v1, v5

    .line 161
    goto :goto_c

    .line 162
    :cond_f
    and-int v3, v9, v5

    .line 163
    .line 164
    if-nez v3, :cond_11

    .line 165
    .line 166
    invoke-interface {v10, v8}, LY/m;->U(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    if-eqz v3, :cond_10

    .line 171
    .line 172
    const/high16 v3, 0x20000

    .line 173
    .line 174
    goto :goto_b

    .line 175
    :cond_10
    const/high16 v3, 0x10000

    .line 176
    .line 177
    :goto_b
    or-int/2addr v1, v3

    .line 178
    :cond_11
    :goto_c
    const v3, 0x12493

    .line 179
    .line 180
    .line 181
    and-int/2addr v3, v1

    .line 182
    const v5, 0x12492

    .line 183
    .line 184
    .line 185
    if-ne v3, v5, :cond_13

    .line 186
    .line 187
    invoke-interface {v10}, LY/m;->i()Z

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    if-nez v3, :cond_12

    .line 192
    .line 193
    goto :goto_d

    .line 194
    :cond_12
    invoke-interface {v10}, LY/m;->K()V

    .line 195
    .line 196
    .line 197
    goto/16 :goto_16

    .line 198
    .line 199
    :cond_13
    :goto_d
    invoke-interface {v10}, LY/m;->G()V

    .line 200
    .line 201
    .line 202
    and-int/lit8 v3, v9, 0x1

    .line 203
    .line 204
    const v5, -0xe001

    .line 205
    .line 206
    .line 207
    if-eqz v3, :cond_15

    .line 208
    .line 209
    invoke-interface {v10}, LY/m;->N()Z

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    if-eqz v3, :cond_14

    .line 214
    .line 215
    goto :goto_f

    .line 216
    :cond_14
    invoke-interface {v10}, LY/m;->K()V

    .line 217
    .line 218
    .line 219
    and-int/lit8 v3, p9, 0x10

    .line 220
    .line 221
    if-eqz v3, :cond_16

    .line 222
    .line 223
    :goto_e
    and-int/2addr v1, v5

    .line 224
    goto :goto_10

    .line 225
    :cond_15
    :goto_f
    and-int/lit8 v3, p9, 0x10

    .line 226
    .line 227
    if-eqz v3, :cond_16

    .line 228
    .line 229
    sget-object v3, Li1/k;->b:Li1/k$a;

    .line 230
    .line 231
    invoke-virtual {v3}, Li1/k$a;->a()J

    .line 232
    .line 233
    .line 234
    move-result-wide v13

    .line 235
    goto :goto_e

    .line 236
    :cond_16
    :goto_10
    invoke-interface {v10}, LY/m;->y()V

    .line 237
    .line 238
    .line 239
    invoke-static {}, LY/w;->L()Z

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    if-eqz v3, :cond_17

    .line 244
    .line 245
    const/4 v3, -0x1

    .line 246
    const-string v5, "androidx.compose.foundation.text.selection.SelectionHandle (AndroidSelectionHandles.android.kt:64)"

    .line 247
    .line 248
    invoke-static {v0, v1, v3, v5}, LY/w;->U(IIILjava/lang/String;)V

    .line 249
    .line 250
    .line 251
    :cond_17
    invoke-static/range {p1 .. p3}, LQ/v;->f(ZLg1/i;Z)Z

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    sget-object v3, Ll0/a;->a:Ll0/a;

    .line 256
    .line 257
    if-eqz v0, :cond_18

    .line 258
    .line 259
    invoke-virtual {v3}, Ll0/a;->b()Ll0/e;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    :goto_11
    move-object v15, v3

    .line 264
    goto :goto_12

    .line 265
    :cond_18
    invoke-virtual {v3}, Ll0/a;->a()Ll0/e;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    goto :goto_11

    .line 270
    :goto_12
    and-int/lit8 v3, v1, 0xe

    .line 271
    .line 272
    const/4 v5, 0x1

    .line 273
    if-eq v3, v2, :cond_1a

    .line 274
    .line 275
    and-int/lit8 v2, v1, 0x8

    .line 276
    .line 277
    if-eqz v2, :cond_19

    .line 278
    .line 279
    invoke-interface {v10, v6}, LY/m;->F(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v2

    .line 283
    if-eqz v2, :cond_19

    .line 284
    .line 285
    goto :goto_13

    .line 286
    :cond_19
    const/4 v2, 0x0

    .line 287
    goto :goto_14

    .line 288
    :cond_1a
    :goto_13
    move v2, v5

    .line 289
    :goto_14
    and-int/lit8 v1, v1, 0x70

    .line 290
    .line 291
    if-ne v1, v4, :cond_1b

    .line 292
    .line 293
    move v1, v5

    .line 294
    goto :goto_15

    .line 295
    :cond_1b
    const/4 v1, 0x0

    .line 296
    :goto_15
    or-int/2addr v1, v2

    .line 297
    invoke-interface {v10, v0}, LY/m;->a(Z)Z

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    or-int/2addr v1, v2

    .line 302
    invoke-interface {v10}, LY/m;->D()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    if-nez v1, :cond_1c

    .line 307
    .line 308
    sget-object v1, LY/m;->a:LY/m$a;

    .line 309
    .line 310
    invoke-virtual {v1}, LY/m$a;->a()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    if-ne v2, v1, :cond_1d

    .line 315
    .line 316
    :cond_1c
    new-instance v2, LQ/a$d;

    .line 317
    .line 318
    invoke-direct {v2, v6, v7, v0}, LQ/a$d;-><init>(LQ/i;ZZ)V

    .line 319
    .line 320
    .line 321
    invoke-interface {v10, v2}, LY/m;->u(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    :cond_1d
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 325
    .line 326
    const/4 v1, 0x0

    .line 327
    const/4 v4, 0x0

    .line 328
    invoke-static {v8, v4, v2, v5, v1}, LR0/r;->f(Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    invoke-static {}, Landroidx/compose/ui/platform/w0;->r()LY/b1;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    invoke-interface {v10, v2}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    check-cast v2, Landroidx/compose/ui/platform/A1;

    .line 341
    .line 342
    move v4, v0

    .line 343
    new-instance v0, LQ/a$b;

    .line 344
    .line 345
    move/from16 v16, v5

    .line 346
    .line 347
    move-object v5, v1

    .line 348
    move-object v1, v2

    .line 349
    move-wide/from16 v17, v13

    .line 350
    .line 351
    move v13, v3

    .line 352
    move/from16 v14, v16

    .line 353
    .line 354
    move-wide/from16 v2, v17

    .line 355
    .line 356
    invoke-direct/range {v0 .. v6}, LQ/a$b;-><init>(Landroidx/compose/ui/platform/A1;JZLandroidx/compose/ui/e;LQ/i;)V

    .line 357
    .line 358
    .line 359
    const/16 v1, 0x36

    .line 360
    .line 361
    const v4, 0x10b320d1

    .line 362
    .line 363
    .line 364
    invoke-static {v4, v14, v0, v10, v1}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    or-int/lit16 v1, v13, 0x180

    .line 369
    .line 370
    invoke-static {v6, v15, v0, v10, v1}, LQ/a;->a(LQ/i;Ll0/e;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 371
    .line 372
    .line 373
    invoke-static {}, LY/w;->L()Z

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    if-eqz v0, :cond_1e

    .line 378
    .line 379
    invoke-static {}, LY/w;->T()V

    .line 380
    .line 381
    .line 382
    :cond_1e
    move-wide v13, v2

    .line 383
    :goto_16
    invoke-interface {v10}, LY/m;->k()LY/B1;

    .line 384
    .line 385
    .line 386
    move-result-object v10

    .line 387
    if-eqz v10, :cond_1f

    .line 388
    .line 389
    new-instance v0, LQ/a$c;

    .line 390
    .line 391
    move-object v1, v6

    .line 392
    move v2, v7

    .line 393
    move-object v7, v8

    .line 394
    move v8, v9

    .line 395
    move-object v3, v11

    .line 396
    move v4, v12

    .line 397
    move-wide v5, v13

    .line 398
    move/from16 v9, p9

    .line 399
    .line 400
    invoke-direct/range {v0 .. v9}, LQ/a$c;-><init>(LQ/i;ZLg1/i;ZJLandroidx/compose/ui/e;II)V

    .line 401
    .line 402
    .line 403
    invoke-interface {v10, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 404
    .line 405
    .line 406
    :cond_1f
    return-void
.end method

.method public static final c(Landroidx/compose/ui/e;Lie/a;ZLY/m;I)V
    .locals 4

    .line 1
    const v0, 0x7ddd909a

    .line 2
    .line 3
    .line 4
    invoke-interface {p3, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p3

    .line 8
    and-int/lit8 v1, p4, 0x6

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-interface {p3, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v1, 0x2

    .line 21
    :goto_0
    or-int/2addr v1, p4

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v1, p4

    .line 24
    :goto_1
    and-int/lit8 v2, p4, 0x30

    .line 25
    .line 26
    if-nez v2, :cond_3

    .line 27
    .line 28
    invoke-interface {p3, p1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    const/16 v2, 0x20

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    const/16 v2, 0x10

    .line 38
    .line 39
    :goto_2
    or-int/2addr v1, v2

    .line 40
    :cond_3
    and-int/lit16 v2, p4, 0x180

    .line 41
    .line 42
    if-nez v2, :cond_5

    .line 43
    .line 44
    invoke-interface {p3, p2}, LY/m;->a(Z)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_4

    .line 49
    .line 50
    const/16 v2, 0x100

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    const/16 v2, 0x80

    .line 54
    .line 55
    :goto_3
    or-int/2addr v1, v2

    .line 56
    :cond_5
    and-int/lit16 v2, v1, 0x93

    .line 57
    .line 58
    const/16 v3, 0x92

    .line 59
    .line 60
    if-ne v2, v3, :cond_7

    .line 61
    .line 62
    invoke-interface {p3}, LY/m;->i()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-nez v2, :cond_6

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_6
    invoke-interface {p3}, LY/m;->K()V

    .line 70
    .line 71
    .line 72
    goto :goto_5

    .line 73
    :cond_7
    :goto_4
    invoke-static {}, LY/w;->L()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_8

    .line 78
    .line 79
    const/4 v2, -0x1

    .line 80
    const-string v3, "androidx.compose.foundation.text.selection.SelectionHandleIcon (AndroidSelectionHandles.android.kt:122)"

    .line 81
    .line 82
    invoke-static {v0, v1, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :cond_8
    invoke-static {}, LQ/v;->c()F

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    invoke-static {}, LQ/v;->b()F

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    invoke-static {p0, v0, v1}, Landroidx/compose/foundation/layout/s;->s(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-static {v0, p1, p2}, LQ/a;->e(Landroidx/compose/ui/e;Lie/a;Z)Landroidx/compose/ui/e;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    const/4 v1, 0x0

    .line 102
    invoke-static {v0, p3, v1}, LC/K;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 103
    .line 104
    .line 105
    invoke-static {}, LY/w;->L()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_9

    .line 110
    .line 111
    invoke-static {}, LY/w;->T()V

    .line 112
    .line 113
    .line 114
    :cond_9
    :goto_5
    invoke-interface {p3}, LY/m;->k()LY/B1;

    .line 115
    .line 116
    .line 117
    move-result-object p3

    .line 118
    if-eqz p3, :cond_a

    .line 119
    .line 120
    new-instance v0, LQ/a$e;

    .line 121
    .line 122
    invoke-direct {v0, p0, p1, p2, p4}, LQ/a$e;-><init>(Landroidx/compose/ui/e;Lie/a;ZI)V

    .line 123
    .line 124
    .line 125
    invoke-interface {p3, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 126
    .line 127
    .line 128
    :cond_a
    return-void
.end method

.method public static final d(Lp0/f;F)Ls0/b1;
    .locals 29

    .line 1
    move/from16 v3, p1

    .line 2
    .line 3
    float-to-double v0, v3

    .line 4
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    double-to-float v0, v0

    .line 9
    float-to-int v0, v0

    .line 10
    mul-int/lit8 v4, v0, 0x2

    .line 11
    .line 12
    sget-object v0, LQ/f;->a:LQ/f;

    .line 13
    .line 14
    invoke-virtual {v0}, LQ/f;->c()Ls0/b1;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0}, LQ/f;->a()Ls0/j0;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v0}, LQ/f;->b()Lu0/a;

    .line 23
    .line 24
    .line 25
    move-result-object v11

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    invoke-interface {v1}, Ls0/b1;->getWidth()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-gt v4, v5, :cond_1

    .line 35
    .line 36
    invoke-interface {v1}, Ls0/b1;->getHeight()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-le v4, v5, :cond_0

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    :goto_0
    move-object v12, v1

    .line 44
    move-object v13, v2

    .line 45
    goto :goto_2

    .line 46
    :cond_1
    :goto_1
    sget-object v1, Ls0/c1;->b:Ls0/c1$a;

    .line 47
    .line 48
    invoke-virtual {v1}, Ls0/c1$a;->a()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    const/16 v9, 0x18

    .line 53
    .line 54
    const/4 v10, 0x0

    .line 55
    const/4 v7, 0x0

    .line 56
    const/4 v8, 0x0

    .line 57
    move v5, v4

    .line 58
    invoke-static/range {v4 .. v10}, Ls0/d1;->b(IIIZLt0/c;ILjava/lang/Object;)Ls0/b1;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v0, v1}, LQ/f;->f(Ls0/b1;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v1}, Ls0/l0;->a(Ls0/b1;)Ls0/j0;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v0, v2}, LQ/f;->d(Ls0/j0;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :goto_2
    if-nez v11, :cond_2

    .line 74
    .line 75
    new-instance v11, Lu0/a;

    .line 76
    .line 77
    invoke-direct {v11}, Lu0/a;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v11}, LQ/f;->e(Lu0/a;)V

    .line 81
    .line 82
    .line 83
    :cond_2
    move-object v14, v11

    .line 84
    invoke-virtual/range {p0 .. p0}, Lp0/f;->getLayoutDirection()Li1/t;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-interface {v12}, Ls0/b1;->getWidth()I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    int-to-float v1, v1

    .line 93
    invoke-interface {v12}, Ls0/b1;->getHeight()I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    int-to-float v2, v2

    .line 98
    invoke-static {v1, v2}, Lr0/m;->a(FF)J

    .line 99
    .line 100
    .line 101
    move-result-wide v1

    .line 102
    invoke-virtual {v14}, Lu0/a;->N()Lu0/a$a;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-virtual {v4}, Lu0/a$a;->a()Li1/d;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    invoke-virtual {v4}, Lu0/a$a;->b()Li1/t;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    invoke-virtual {v4}, Lu0/a$a;->c()Ls0/j0;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    invoke-virtual {v4}, Lu0/a$a;->d()J

    .line 119
    .line 120
    .line 121
    move-result-wide v8

    .line 122
    invoke-virtual {v14}, Lu0/a;->N()Lu0/a$a;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    move-object/from16 v10, p0

    .line 127
    .line 128
    invoke-virtual {v4, v10}, Lu0/a$a;->j(Li1/d;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v4, v0}, Lu0/a$a;->k(Li1/t;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4, v13}, Lu0/a$a;->i(Ls0/j0;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v4, v1, v2}, Lu0/a$a;->l(J)V

    .line 138
    .line 139
    .line 140
    invoke-interface {v13}, Ls0/j0;->p()V

    .line 141
    .line 142
    .line 143
    sget-object v0, Ls0/r0;->b:Ls0/r0$a;

    .line 144
    .line 145
    invoke-virtual {v0}, Ls0/r0$a;->a()J

    .line 146
    .line 147
    .line 148
    move-result-wide v15

    .line 149
    invoke-interface {v14}, Lu0/f;->f()J

    .line 150
    .line 151
    .line 152
    move-result-wide v19

    .line 153
    sget-object v0, Landroidx/compose/ui/graphics/c;->b:Landroidx/compose/ui/graphics/c$a;

    .line 154
    .line 155
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/c$a;->a()I

    .line 156
    .line 157
    .line 158
    move-result v24

    .line 159
    const/16 v25, 0x3a

    .line 160
    .line 161
    const/16 v26, 0x0

    .line 162
    .line 163
    const-wide/16 v17, 0x0

    .line 164
    .line 165
    const/16 v21, 0x0

    .line 166
    .line 167
    const/16 v22, 0x0

    .line 168
    .line 169
    const/16 v23, 0x0

    .line 170
    .line 171
    invoke-static/range {v14 .. v26}, Lu0/f;->B0(Lu0/f;JJJFLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    const-wide v0, 0xff000000L

    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    invoke-static {v0, v1}, Ls0/s0;->d(J)J

    .line 180
    .line 181
    .line 182
    move-result-wide v15

    .line 183
    sget-object v2, Lr0/f;->b:Lr0/f$a;

    .line 184
    .line 185
    invoke-virtual {v2}, Lr0/f$a;->c()J

    .line 186
    .line 187
    .line 188
    move-result-wide v17

    .line 189
    invoke-static {v3, v3}, Lr0/m;->a(FF)J

    .line 190
    .line 191
    .line 192
    move-result-wide v19

    .line 193
    const/16 v25, 0x78

    .line 194
    .line 195
    const/16 v24, 0x0

    .line 196
    .line 197
    invoke-static/range {v14 .. v26}, Lu0/f;->B0(Lu0/f;JJJFLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    invoke-static {v0, v1}, Ls0/s0;->d(J)J

    .line 201
    .line 202
    .line 203
    move-result-wide v1

    .line 204
    move-object v0, v5

    .line 205
    invoke-static {v3, v3}, Lr0/g;->a(FF)J

    .line 206
    .line 207
    .line 208
    move-result-wide v4

    .line 209
    const/16 v10, 0x78

    .line 210
    .line 211
    const/4 v11, 0x0

    .line 212
    move-object v15, v6

    .line 213
    const/4 v6, 0x0

    .line 214
    move-object/from16 v16, v7

    .line 215
    .line 216
    const/4 v7, 0x0

    .line 217
    move-wide/from16 v17, v8

    .line 218
    .line 219
    const/4 v8, 0x0

    .line 220
    const/4 v9, 0x0

    .line 221
    move-object/from16 v27, v14

    .line 222
    .line 223
    move-object v14, v0

    .line 224
    move-object/from16 v0, v27

    .line 225
    .line 226
    move-object/from16 v27, v16

    .line 227
    .line 228
    move-object/from16 v16, v12

    .line 229
    .line 230
    move-object/from16 v12, v27

    .line 231
    .line 232
    move-wide/from16 v27, v17

    .line 233
    .line 234
    invoke-static/range {v0 .. v11}, Lu0/f;->e0(Lu0/f;JFJFLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    invoke-interface {v13}, Ls0/j0;->k()V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0}, Lu0/a;->N()Lu0/a$a;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-virtual {v0, v14}, Lu0/a$a;->j(Li1/d;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0, v15}, Lu0/a$a;->k(Li1/t;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0, v12}, Lu0/a$a;->i(Ls0/j0;)V

    .line 251
    .line 252
    .line 253
    move-wide/from16 v1, v27

    .line 254
    .line 255
    invoke-virtual {v0, v1, v2}, Lu0/a$a;->l(J)V

    .line 256
    .line 257
    .line 258
    return-object v16
.end method

.method public static final e(Landroidx/compose/ui/e;Lie/a;Z)Landroidx/compose/ui/e;
    .locals 1

    .line 1
    new-instance v0, LQ/a$f;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, LQ/a$f;-><init>(Lie/a;Z)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    const/4 p2, 0x0

    .line 8
    invoke-static {p0, p2, v0, p1, p2}, Landroidx/compose/ui/c;->c(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Lie/o;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method
