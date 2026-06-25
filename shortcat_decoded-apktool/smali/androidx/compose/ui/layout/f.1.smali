.class public final Landroidx/compose/ui/layout/f;
.super Landroidx/core/view/p0$b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;
.implements Landroidx/core/view/I;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field private final a:Landroidx/compose/ui/platform/AndroidComposeView;

.field private b:Z

.field private c:I

.field private d:Landroidx/core/view/L0;

.field private final e:Lt/c0;

.field private final f:LY/A0;

.field private final g:Lt/L;

.field private final h:Li0/E;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Landroidx/core/view/p0$b;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Landroidx/compose/ui/layout/f;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 6
    .line 7
    new-instance p1, Lt/P;

    .line 8
    .line 9
    const/16 v0, 0x9

    .line 10
    .line 11
    invoke-direct {p1, v0}, Lt/P;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sget-object v0, Landroidx/compose/ui/layout/F;->a:Landroidx/compose/ui/layout/F$a;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/compose/ui/layout/F$a;->a()Landroidx/compose/ui/layout/F;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, LI0/T;

    .line 21
    .line 22
    const-string v3, "caption bar"

    .line 23
    .line 24
    invoke-direct {v2, v3}, LI0/T;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v1, v2}, Lt/P;->x(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Landroidx/compose/ui/layout/F$a;->b()Landroidx/compose/ui/layout/F;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    new-instance v2, LI0/T;

    .line 35
    .line 36
    const-string v3, "display cutout"

    .line 37
    .line 38
    invoke-direct {v2, v3}, LI0/T;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v1, v2}, Lt/P;->x(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Landroidx/compose/ui/layout/F$a;->c()Landroidx/compose/ui/layout/F;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    new-instance v2, LI0/T;

    .line 49
    .line 50
    const-string v3, "ime"

    .line 51
    .line 52
    invoke-direct {v2, v3}, LI0/T;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v1, v2}, Lt/P;->x(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Landroidx/compose/ui/layout/F$a;->d()Landroidx/compose/ui/layout/F;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    new-instance v2, LI0/T;

    .line 63
    .line 64
    const-string v3, "mandatory system gestures"

    .line 65
    .line 66
    invoke-direct {v2, v3}, LI0/T;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v1, v2}, Lt/P;->x(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Landroidx/compose/ui/layout/F$a;->e()Landroidx/compose/ui/layout/F;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    new-instance v2, LI0/T;

    .line 77
    .line 78
    const-string v3, "navigation bars"

    .line 79
    .line 80
    invoke-direct {v2, v3}, LI0/T;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v1, v2}, Lt/P;->x(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Landroidx/compose/ui/layout/F$a;->f()Landroidx/compose/ui/layout/F;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    new-instance v2, LI0/T;

    .line 91
    .line 92
    const-string v3, "status bars"

    .line 93
    .line 94
    invoke-direct {v2, v3}, LI0/T;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v1, v2}, Lt/P;->x(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Landroidx/compose/ui/layout/F$a;->g()Landroidx/compose/ui/layout/F;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    new-instance v2, LI0/T;

    .line 105
    .line 106
    const-string v3, "system gestures"

    .line 107
    .line 108
    invoke-direct {v2, v3}, LI0/T;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v1, v2}, Lt/P;->x(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Landroidx/compose/ui/layout/F$a;->h()Landroidx/compose/ui/layout/F;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    new-instance v2, LI0/T;

    .line 119
    .line 120
    const-string v3, "tappable element"

    .line 121
    .line 122
    invoke-direct {v2, v3}, LI0/T;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, v1, v2}, Lt/P;->x(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Landroidx/compose/ui/layout/F$a;->i()Landroidx/compose/ui/layout/F;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    new-instance v1, LI0/T;

    .line 133
    .line 134
    const-string v2, "waterfall"

    .line 135
    .line 136
    invoke-direct {v1, v2}, LI0/T;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v0, v1}, Lt/P;->x(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    iput-object p1, p0, Landroidx/compose/ui/layout/f;->e:Lt/c0;

    .line 143
    .line 144
    const/4 p1, 0x0

    .line 145
    invoke-static {p1}, LY/J1;->a(I)LY/A0;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    iput-object p1, p0, Landroidx/compose/ui/layout/f;->f:LY/A0;

    .line 150
    .line 151
    new-instance p1, Lt/L;

    .line 152
    .line 153
    const/4 v0, 0x4

    .line 154
    invoke-direct {p1, v0}, Lt/L;-><init>(I)V

    .line 155
    .line 156
    .line 157
    iput-object p1, p0, Landroidx/compose/ui/layout/f;->g:Lt/L;

    .line 158
    .line 159
    invoke-static {}, LY/U1;->e()Li0/E;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    iput-object p1, p0, Landroidx/compose/ui/layout/f;->h:Li0/E;

    .line 164
    .line 165
    return-void
.end method

.method private final g(LI0/T;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, LI0/T;->i(Z)V

    .line 3
    .line 4
    .line 5
    invoke-static {}, LI0/S;->a()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-virtual {p1, v0, v1}, LI0/T;->n(J)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, LI0/S;->a()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    invoke-virtual {p1, v0, v1}, LI0/T;->o(J)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private final h(LI0/T;Landroidx/core/view/p0;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroidx/core/view/p0;->c()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1, v0}, LI0/T;->l(F)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Landroidx/core/view/p0;->a()F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p1, v0}, LI0/T;->h(F)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Landroidx/core/view/p0;->b()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    invoke-virtual {p1, v0, v1}, LI0/T;->k(J)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private final i(Landroidx/core/view/L0;)V
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-static {}, Landroidx/compose/ui/layout/H;->c()Lt/o;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object v3, v2, Lt/o;->b:[I

    .line 10
    .line 11
    iget-object v4, v2, Lt/o;->c:[Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v2, v2, Lt/o;->a:[J

    .line 14
    .line 15
    array-length v5, v2

    .line 16
    const/4 v6, 0x2

    .line 17
    sub-int/2addr v5, v6

    .line 18
    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    const-wide/16 v17, 0x80

    .line 24
    .line 25
    const/16 v7, 0x8

    .line 26
    .line 27
    const/16 v19, 0x0

    .line 28
    .line 29
    if-ltz v5, :cond_4

    .line 30
    .line 31
    move/from16 v8, v19

    .line 32
    .line 33
    move/from16 v21, v8

    .line 34
    .line 35
    move/from16 v22, v21

    .line 36
    .line 37
    const/16 v20, 0x1

    .line 38
    .line 39
    const-wide/16 v23, 0xff

    .line 40
    .line 41
    :goto_0
    aget-wide v9, v2, v8

    .line 42
    .line 43
    const/16 v25, 0x7

    .line 44
    .line 45
    const/16 v26, 0x10

    .line 46
    .line 47
    not-long v11, v9

    .line 48
    shl-long v11, v11, v25

    .line 49
    .line 50
    and-long/2addr v11, v9

    .line 51
    and-long/2addr v11, v15

    .line 52
    cmp-long v11, v11, v15

    .line 53
    .line 54
    if-eqz v11, :cond_3

    .line 55
    .line 56
    sub-int v11, v8, v5

    .line 57
    .line 58
    not-int v11, v11

    .line 59
    ushr-int/lit8 v11, v11, 0x1f

    .line 60
    .line 61
    rsub-int/lit8 v11, v11, 0x8

    .line 62
    .line 63
    move/from16 v12, v19

    .line 64
    .line 65
    :goto_1
    if-ge v12, v11, :cond_2

    .line 66
    .line 67
    and-long v27, v9, v23

    .line 68
    .line 69
    cmp-long v27, v27, v17

    .line 70
    .line 71
    if-gez v27, :cond_0

    .line 72
    .line 73
    shl-int/lit8 v27, v8, 0x3

    .line 74
    .line 75
    add-int v27, v27, v12

    .line 76
    .line 77
    const/16 v28, 0x20

    .line 78
    .line 79
    aget v13, v3, v27

    .line 80
    .line 81
    aget-object v27, v4, v27

    .line 82
    .line 83
    const/16 v29, 0x30

    .line 84
    .line 85
    move-object/from16 v14, v27

    .line 86
    .line 87
    check-cast v14, Landroidx/compose/ui/layout/F;

    .line 88
    .line 89
    invoke-virtual {v1, v13}, Landroidx/core/view/L0;->f(I)LA1/b;

    .line 90
    .line 91
    .line 92
    move-result-object v13

    .line 93
    move-wide/from16 v30, v15

    .line 94
    .line 95
    iget v15, v13, LA1/b;->a:I

    .line 96
    .line 97
    move/from16 v16, v6

    .line 98
    .line 99
    move/from16 v27, v7

    .line 100
    .line 101
    int-to-long v6, v15

    .line 102
    shl-long v6, v6, v29

    .line 103
    .line 104
    iget v15, v13, LA1/b;->b:I

    .line 105
    .line 106
    move-object/from16 v33, v2

    .line 107
    .line 108
    move-object/from16 v32, v3

    .line 109
    .line 110
    int-to-long v2, v15

    .line 111
    shl-long v2, v2, v28

    .line 112
    .line 113
    or-long/2addr v2, v6

    .line 114
    iget v6, v13, LA1/b;->c:I

    .line 115
    .line 116
    int-to-long v6, v6

    .line 117
    shl-long v6, v6, v26

    .line 118
    .line 119
    or-long/2addr v2, v6

    .line 120
    iget v6, v13, LA1/b;->d:I

    .line 121
    .line 122
    int-to-long v6, v6

    .line 123
    or-long/2addr v2, v6

    .line 124
    invoke-static {v2, v3}, LI0/Q;->a(J)J

    .line 125
    .line 126
    .line 127
    move-result-wide v2

    .line 128
    iget-object v6, v0, Landroidx/compose/ui/layout/f;->e:Lt/c0;

    .line 129
    .line 130
    invoke-virtual {v6, v14}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    invoke-static {v6}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    check-cast v6, LI0/T;

    .line 138
    .line 139
    invoke-virtual {v6}, LI0/T;->a()J

    .line 140
    .line 141
    .line 142
    move-result-wide v13

    .line 143
    invoke-static {v2, v3, v13, v14}, LI0/Q;->b(JJ)Z

    .line 144
    .line 145
    .line 146
    move-result v7

    .line 147
    if-nez v7, :cond_1

    .line 148
    .line 149
    invoke-virtual {v6, v2, v3}, LI0/T;->j(J)V

    .line 150
    .line 151
    .line 152
    invoke-static {}, LI0/S;->b()J

    .line 153
    .line 154
    .line 155
    move-result-wide v6

    .line 156
    invoke-static {v2, v3, v6, v7}, LI0/Q;->b(JJ)Z

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    move/from16 v21, v20

    .line 161
    .line 162
    if-nez v2, :cond_1

    .line 163
    .line 164
    move/from16 v22, v21

    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_0
    move-object/from16 v33, v2

    .line 168
    .line 169
    move-object/from16 v32, v3

    .line 170
    .line 171
    move/from16 v27, v7

    .line 172
    .line 173
    move-wide/from16 v30, v15

    .line 174
    .line 175
    const/16 v28, 0x20

    .line 176
    .line 177
    const/16 v29, 0x30

    .line 178
    .line 179
    move/from16 v16, v6

    .line 180
    .line 181
    :cond_1
    :goto_2
    shr-long v9, v9, v27

    .line 182
    .line 183
    add-int/lit8 v12, v12, 0x1

    .line 184
    .line 185
    move/from16 v6, v16

    .line 186
    .line 187
    move/from16 v7, v27

    .line 188
    .line 189
    move-wide/from16 v15, v30

    .line 190
    .line 191
    move-object/from16 v3, v32

    .line 192
    .line 193
    move-object/from16 v2, v33

    .line 194
    .line 195
    goto/16 :goto_1

    .line 196
    .line 197
    :cond_2
    move-object/from16 v33, v2

    .line 198
    .line 199
    move-object/from16 v32, v3

    .line 200
    .line 201
    move v2, v7

    .line 202
    move-wide/from16 v30, v15

    .line 203
    .line 204
    const/16 v28, 0x20

    .line 205
    .line 206
    const/16 v29, 0x30

    .line 207
    .line 208
    move/from16 v16, v6

    .line 209
    .line 210
    if-ne v11, v2, :cond_5

    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_3
    move-object/from16 v33, v2

    .line 214
    .line 215
    move-object/from16 v32, v3

    .line 216
    .line 217
    move-wide/from16 v30, v15

    .line 218
    .line 219
    const/16 v28, 0x20

    .line 220
    .line 221
    const/16 v29, 0x30

    .line 222
    .line 223
    move/from16 v16, v6

    .line 224
    .line 225
    :goto_3
    if-eq v8, v5, :cond_5

    .line 226
    .line 227
    add-int/lit8 v8, v8, 0x1

    .line 228
    .line 229
    move/from16 v6, v16

    .line 230
    .line 231
    move-wide/from16 v15, v30

    .line 232
    .line 233
    move-object/from16 v3, v32

    .line 234
    .line 235
    move-object/from16 v2, v33

    .line 236
    .line 237
    const/16 v7, 0x8

    .line 238
    .line 239
    goto/16 :goto_0

    .line 240
    .line 241
    :cond_4
    move-wide/from16 v30, v15

    .line 242
    .line 243
    const/16 v20, 0x1

    .line 244
    .line 245
    const-wide/16 v23, 0xff

    .line 246
    .line 247
    const/16 v25, 0x7

    .line 248
    .line 249
    const/16 v26, 0x10

    .line 250
    .line 251
    const/16 v28, 0x20

    .line 252
    .line 253
    const/16 v29, 0x30

    .line 254
    .line 255
    move/from16 v16, v6

    .line 256
    .line 257
    move/from16 v21, v19

    .line 258
    .line 259
    move/from16 v22, v21

    .line 260
    .line 261
    :cond_5
    invoke-static {}, Landroidx/compose/ui/layout/H;->b()Lt/F;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    iget-object v3, v2, Lt/o;->b:[I

    .line 266
    .line 267
    iget-object v4, v2, Lt/o;->c:[Ljava/lang/Object;

    .line 268
    .line 269
    iget-object v2, v2, Lt/o;->a:[J

    .line 270
    .line 271
    array-length v5, v2

    .line 272
    add-int/lit8 v5, v5, -0x2

    .line 273
    .line 274
    if-ltz v5, :cond_b

    .line 275
    .line 276
    move/from16 v6, v19

    .line 277
    .line 278
    :goto_4
    aget-wide v7, v2, v6

    .line 279
    .line 280
    not-long v9, v7

    .line 281
    shl-long v9, v9, v25

    .line 282
    .line 283
    and-long/2addr v9, v7

    .line 284
    and-long v9, v9, v30

    .line 285
    .line 286
    cmp-long v9, v9, v30

    .line 287
    .line 288
    if-eqz v9, :cond_a

    .line 289
    .line 290
    sub-int v9, v6, v5

    .line 291
    .line 292
    not-int v9, v9

    .line 293
    ushr-int/lit8 v9, v9, 0x1f

    .line 294
    .line 295
    const/16 v27, 0x8

    .line 296
    .line 297
    rsub-int/lit8 v9, v9, 0x8

    .line 298
    .line 299
    move/from16 v10, v19

    .line 300
    .line 301
    :goto_5
    if-ge v10, v9, :cond_9

    .line 302
    .line 303
    and-long v11, v7, v23

    .line 304
    .line 305
    cmp-long v11, v11, v17

    .line 306
    .line 307
    if-gez v11, :cond_8

    .line 308
    .line 309
    shl-int/lit8 v11, v6, 0x3

    .line 310
    .line 311
    add-int/2addr v11, v10

    .line 312
    aget v12, v3, v11

    .line 313
    .line 314
    aget-object v11, v4, v11

    .line 315
    .line 316
    check-cast v11, Landroidx/compose/ui/layout/F;

    .line 317
    .line 318
    iget-object v13, v0, Landroidx/compose/ui/layout/f;->e:Lt/c0;

    .line 319
    .line 320
    invoke-virtual {v13, v11}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v11

    .line 324
    invoke-static {v11}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    check-cast v11, LI0/T;

    .line 328
    .line 329
    invoke-static {}, Landroidx/core/view/L0$p;->d()I

    .line 330
    .line 331
    .line 332
    move-result v13

    .line 333
    if-eq v12, v13, :cond_6

    .line 334
    .line 335
    invoke-virtual {v1, v12}, Landroidx/core/view/L0;->g(I)LA1/b;

    .line 336
    .line 337
    .line 338
    move-result-object v13

    .line 339
    iget v14, v13, LA1/b;->a:I

    .line 340
    .line 341
    int-to-long v14, v14

    .line 342
    shl-long v14, v14, v29

    .line 343
    .line 344
    move-object/from16 v32, v2

    .line 345
    .line 346
    iget v2, v13, LA1/b;->b:I

    .line 347
    .line 348
    move-object/from16 v33, v3

    .line 349
    .line 350
    int-to-long v2, v2

    .line 351
    shl-long v2, v2, v28

    .line 352
    .line 353
    or-long/2addr v2, v14

    .line 354
    iget v14, v13, LA1/b;->c:I

    .line 355
    .line 356
    int-to-long v14, v14

    .line 357
    shl-long v14, v14, v26

    .line 358
    .line 359
    or-long/2addr v2, v14

    .line 360
    iget v13, v13, LA1/b;->d:I

    .line 361
    .line 362
    int-to-long v13, v13

    .line 363
    or-long/2addr v2, v13

    .line 364
    invoke-static {v2, v3}, LI0/Q;->a(J)J

    .line 365
    .line 366
    .line 367
    move-result-wide v2

    .line 368
    invoke-virtual {v11}, LI0/T;->b()J

    .line 369
    .line 370
    .line 371
    move-result-wide v13

    .line 372
    invoke-static {v13, v14, v2, v3}, LI0/Q;->b(JJ)Z

    .line 373
    .line 374
    .line 375
    move-result v13

    .line 376
    if-nez v13, :cond_7

    .line 377
    .line 378
    invoke-virtual {v11, v2, v3}, LI0/T;->m(J)V

    .line 379
    .line 380
    .line 381
    invoke-static {}, LI0/S;->b()J

    .line 382
    .line 383
    .line 384
    move-result-wide v13

    .line 385
    invoke-static {v2, v3, v13, v14}, LI0/Q;->b(JJ)Z

    .line 386
    .line 387
    .line 388
    move-result v2

    .line 389
    move/from16 v21, v20

    .line 390
    .line 391
    if-nez v2, :cond_7

    .line 392
    .line 393
    move/from16 v22, v21

    .line 394
    .line 395
    goto :goto_6

    .line 396
    :cond_6
    move-object/from16 v32, v2

    .line 397
    .line 398
    move-object/from16 v33, v3

    .line 399
    .line 400
    :cond_7
    :goto_6
    invoke-virtual {v1, v12}, Landroidx/core/view/L0;->r(I)Z

    .line 401
    .line 402
    .line 403
    move-result v2

    .line 404
    invoke-virtual {v11, v2}, LI0/T;->p(Z)V

    .line 405
    .line 406
    .line 407
    :goto_7
    const/16 v2, 0x8

    .line 408
    .line 409
    goto :goto_8

    .line 410
    :cond_8
    move-object/from16 v32, v2

    .line 411
    .line 412
    move-object/from16 v33, v3

    .line 413
    .line 414
    goto :goto_7

    .line 415
    :goto_8
    shr-long/2addr v7, v2

    .line 416
    add-int/lit8 v10, v10, 0x1

    .line 417
    .line 418
    move-object/from16 v2, v32

    .line 419
    .line 420
    move-object/from16 v3, v33

    .line 421
    .line 422
    goto :goto_5

    .line 423
    :cond_9
    move-object/from16 v32, v2

    .line 424
    .line 425
    move-object/from16 v33, v3

    .line 426
    .line 427
    const/16 v2, 0x8

    .line 428
    .line 429
    if-ne v9, v2, :cond_b

    .line 430
    .line 431
    goto :goto_9

    .line 432
    :cond_a
    move-object/from16 v32, v2

    .line 433
    .line 434
    move-object/from16 v33, v3

    .line 435
    .line 436
    const/16 v2, 0x8

    .line 437
    .line 438
    :goto_9
    if-eq v6, v5, :cond_b

    .line 439
    .line 440
    add-int/lit8 v6, v6, 0x1

    .line 441
    .line 442
    move-object/from16 v2, v32

    .line 443
    .line 444
    move-object/from16 v3, v33

    .line 445
    .line 446
    goto/16 :goto_4

    .line 447
    .line 448
    :cond_b
    invoke-virtual {v1}, Landroidx/core/view/L0;->e()Landroidx/core/view/r;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    if-nez v1, :cond_c

    .line 453
    .line 454
    invoke-static {}, LI0/S;->b()J

    .line 455
    .line 456
    .line 457
    move-result-wide v2

    .line 458
    goto :goto_a

    .line 459
    :cond_c
    invoke-virtual {v1}, Landroidx/core/view/r;->f()LA1/b;

    .line 460
    .line 461
    .line 462
    move-result-object v2

    .line 463
    iget v3, v2, LA1/b;->a:I

    .line 464
    .line 465
    int-to-long v3, v3

    .line 466
    shl-long v3, v3, v29

    .line 467
    .line 468
    iget v5, v2, LA1/b;->b:I

    .line 469
    .line 470
    int-to-long v5, v5

    .line 471
    shl-long v5, v5, v28

    .line 472
    .line 473
    or-long/2addr v3, v5

    .line 474
    iget v5, v2, LA1/b;->c:I

    .line 475
    .line 476
    int-to-long v5, v5

    .line 477
    shl-long v5, v5, v26

    .line 478
    .line 479
    or-long/2addr v3, v5

    .line 480
    iget v2, v2, LA1/b;->d:I

    .line 481
    .line 482
    int-to-long v5, v2

    .line 483
    or-long v2, v3, v5

    .line 484
    .line 485
    invoke-static {v2, v3}, LI0/Q;->a(J)J

    .line 486
    .line 487
    .line 488
    move-result-wide v2

    .line 489
    :goto_a
    iget-object v4, v0, Landroidx/compose/ui/layout/f;->e:Lt/c0;

    .line 490
    .line 491
    sget-object v5, Landroidx/compose/ui/layout/F;->a:Landroidx/compose/ui/layout/F$a;

    .line 492
    .line 493
    invoke-virtual {v5}, Landroidx/compose/ui/layout/F$a;->i()Landroidx/compose/ui/layout/F;

    .line 494
    .line 495
    .line 496
    move-result-object v6

    .line 497
    invoke-virtual {v4, v6}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v4

    .line 501
    invoke-static {v4}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 502
    .line 503
    .line 504
    check-cast v4, LI0/T;

    .line 505
    .line 506
    invoke-virtual {v4}, LI0/T;->a()J

    .line 507
    .line 508
    .line 509
    move-result-wide v6

    .line 510
    invoke-static {v6, v7, v2, v3}, LI0/Q;->b(JJ)Z

    .line 511
    .line 512
    .line 513
    move-result v6

    .line 514
    if-nez v6, :cond_d

    .line 515
    .line 516
    invoke-virtual {v4, v2, v3}, LI0/T;->j(J)V

    .line 517
    .line 518
    .line 519
    invoke-virtual {v4, v2, v3}, LI0/T;->m(J)V

    .line 520
    .line 521
    .line 522
    invoke-static {}, LI0/S;->b()J

    .line 523
    .line 524
    .line 525
    move-result-wide v6

    .line 526
    invoke-static {v2, v3, v6, v7}, LI0/Q;->b(JJ)Z

    .line 527
    .line 528
    .line 529
    move-result v2

    .line 530
    move/from16 v21, v20

    .line 531
    .line 532
    if-nez v2, :cond_d

    .line 533
    .line 534
    move/from16 v22, v21

    .line 535
    .line 536
    :cond_d
    if-nez v1, :cond_e

    .line 537
    .line 538
    invoke-static {}, LI0/S;->b()J

    .line 539
    .line 540
    .line 541
    move-result-wide v2

    .line 542
    goto :goto_b

    .line 543
    :cond_e
    invoke-virtual {v1}, Landroidx/core/view/r;->c()I

    .line 544
    .line 545
    .line 546
    move-result v2

    .line 547
    invoke-virtual {v1}, Landroidx/core/view/r;->e()I

    .line 548
    .line 549
    .line 550
    move-result v3

    .line 551
    invoke-virtual {v1}, Landroidx/core/view/r;->d()I

    .line 552
    .line 553
    .line 554
    move-result v4

    .line 555
    invoke-virtual {v1}, Landroidx/core/view/r;->b()I

    .line 556
    .line 557
    .line 558
    move-result v6

    .line 559
    int-to-long v7, v2

    .line 560
    shl-long v7, v7, v29

    .line 561
    .line 562
    int-to-long v2, v3

    .line 563
    shl-long v2, v2, v28

    .line 564
    .line 565
    or-long/2addr v2, v7

    .line 566
    int-to-long v7, v4

    .line 567
    shl-long v7, v7, v26

    .line 568
    .line 569
    or-long/2addr v2, v7

    .line 570
    int-to-long v6, v6

    .line 571
    or-long/2addr v2, v6

    .line 572
    invoke-static {v2, v3}, LI0/Q;->a(J)J

    .line 573
    .line 574
    .line 575
    move-result-wide v2

    .line 576
    :goto_b
    iget-object v4, v0, Landroidx/compose/ui/layout/f;->e:Lt/c0;

    .line 577
    .line 578
    invoke-virtual {v5}, Landroidx/compose/ui/layout/F$a;->b()Landroidx/compose/ui/layout/F;

    .line 579
    .line 580
    .line 581
    move-result-object v5

    .line 582
    invoke-virtual {v4, v5}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v4

    .line 586
    invoke-static {v4}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 587
    .line 588
    .line 589
    check-cast v4, LI0/T;

    .line 590
    .line 591
    invoke-virtual {v4}, LI0/T;->a()J

    .line 592
    .line 593
    .line 594
    move-result-wide v5

    .line 595
    invoke-static {v2, v3, v5, v6}, LI0/Q;->b(JJ)Z

    .line 596
    .line 597
    .line 598
    move-result v5

    .line 599
    if-nez v5, :cond_f

    .line 600
    .line 601
    invoke-virtual {v4, v2, v3}, LI0/T;->j(J)V

    .line 602
    .line 603
    .line 604
    invoke-virtual {v4, v2, v3}, LI0/T;->m(J)V

    .line 605
    .line 606
    .line 607
    invoke-static {}, LI0/S;->b()J

    .line 608
    .line 609
    .line 610
    move-result-wide v4

    .line 611
    invoke-static {v2, v3, v4, v5}, LI0/Q;->b(JJ)Z

    .line 612
    .line 613
    .line 614
    move-result v2

    .line 615
    move/from16 v21, v20

    .line 616
    .line 617
    if-nez v2, :cond_f

    .line 618
    .line 619
    move/from16 v22, v21

    .line 620
    .line 621
    :cond_f
    if-nez v1, :cond_10

    .line 622
    .line 623
    iget-object v1, v0, Landroidx/compose/ui/layout/f;->g:Lt/L;

    .line 624
    .line 625
    invoke-virtual {v1}, Lt/V;->d()I

    .line 626
    .line 627
    .line 628
    move-result v1

    .line 629
    if-lez v1, :cond_15

    .line 630
    .line 631
    iget-object v1, v0, Landroidx/compose/ui/layout/f;->g:Lt/L;

    .line 632
    .line 633
    invoke-virtual {v1}, Lt/L;->n()V

    .line 634
    .line 635
    .line 636
    iget-object v1, v0, Landroidx/compose/ui/layout/f;->h:Li0/E;

    .line 637
    .line 638
    invoke-virtual {v1}, Li0/E;->clear()V

    .line 639
    .line 640
    .line 641
    move/from16 v21, v20

    .line 642
    .line 643
    goto/16 :goto_f

    .line 644
    .line 645
    :cond_10
    invoke-virtual {v1}, Landroidx/core/view/r;->a()Ljava/util/List;

    .line 646
    .line 647
    .line 648
    move-result-object v1

    .line 649
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 650
    .line 651
    .line 652
    move-result v2

    .line 653
    iget-object v3, v0, Landroidx/compose/ui/layout/f;->g:Lt/L;

    .line 654
    .line 655
    invoke-virtual {v3}, Lt/V;->d()I

    .line 656
    .line 657
    .line 658
    move-result v3

    .line 659
    if-ge v2, v3, :cond_11

    .line 660
    .line 661
    iget-object v2, v0, Landroidx/compose/ui/layout/f;->g:Lt/L;

    .line 662
    .line 663
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 664
    .line 665
    .line 666
    move-result v3

    .line 667
    iget-object v4, v0, Landroidx/compose/ui/layout/f;->g:Lt/L;

    .line 668
    .line 669
    invoke-virtual {v4}, Lt/V;->d()I

    .line 670
    .line 671
    .line 672
    move-result v4

    .line 673
    invoke-virtual {v2, v3, v4}, Lt/L;->s(II)V

    .line 674
    .line 675
    .line 676
    iget-object v2, v0, Landroidx/compose/ui/layout/f;->h:Li0/E;

    .line 677
    .line 678
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 679
    .line 680
    .line 681
    move-result v3

    .line 682
    iget-object v4, v0, Landroidx/compose/ui/layout/f;->h:Li0/E;

    .line 683
    .line 684
    invoke-virtual {v4}, Li0/E;->size()I

    .line 685
    .line 686
    .line 687
    move-result v4

    .line 688
    invoke-virtual {v2, v3, v4}, Li0/E;->y(II)V

    .line 689
    .line 690
    .line 691
    move/from16 v21, v20

    .line 692
    .line 693
    goto :goto_d

    .line 694
    :cond_11
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 695
    .line 696
    .line 697
    move-result v2

    .line 698
    iget-object v3, v0, Landroidx/compose/ui/layout/f;->g:Lt/L;

    .line 699
    .line 700
    invoke-virtual {v3}, Lt/V;->d()I

    .line 701
    .line 702
    .line 703
    move-result v3

    .line 704
    sub-int/2addr v2, v3

    .line 705
    move/from16 v3, v19

    .line 706
    .line 707
    :goto_c
    if-ge v3, v2, :cond_12

    .line 708
    .line 709
    iget-object v4, v0, Landroidx/compose/ui/layout/f;->g:Lt/L;

    .line 710
    .line 711
    invoke-virtual {v4}, Lt/V;->d()I

    .line 712
    .line 713
    .line 714
    move-result v5

    .line 715
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v5

    .line 719
    const/4 v6, 0x0

    .line 720
    move/from16 v7, v16

    .line 721
    .line 722
    invoke-static {v5, v6, v7, v6}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 723
    .line 724
    .line 725
    move-result-object v5

    .line 726
    invoke-virtual {v4, v5}, Lt/L;->k(Ljava/lang/Object;)Z

    .line 727
    .line 728
    .line 729
    iget-object v4, v0, Landroidx/compose/ui/layout/f;->h:Li0/E;

    .line 730
    .line 731
    new-instance v5, Ljava/lang/StringBuilder;

    .line 732
    .line 733
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 734
    .line 735
    .line 736
    const-string v6, "display cutout rect "

    .line 737
    .line 738
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 739
    .line 740
    .line 741
    iget-object v6, v0, Landroidx/compose/ui/layout/f;->g:Lt/L;

    .line 742
    .line 743
    invoke-virtual {v6}, Lt/V;->d()I

    .line 744
    .line 745
    .line 746
    move-result v6

    .line 747
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 748
    .line 749
    .line 750
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 751
    .line 752
    .line 753
    move-result-object v5

    .line 754
    invoke-static {v5}, Landroidx/compose/ui/layout/w;->a(Ljava/lang/String;)Landroidx/compose/ui/layout/u;

    .line 755
    .line 756
    .line 757
    move-result-object v5

    .line 758
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 759
    .line 760
    .line 761
    add-int/lit8 v3, v3, 0x1

    .line 762
    .line 763
    move/from16 v21, v20

    .line 764
    .line 765
    goto :goto_c

    .line 766
    :cond_12
    :goto_d
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 767
    .line 768
    .line 769
    move-result v2

    .line 770
    move/from16 v3, v19

    .line 771
    .line 772
    :goto_e
    if-ge v3, v2, :cond_14

    .line 773
    .line 774
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    move-result-object v4

    .line 778
    check-cast v4, Landroid/graphics/Rect;

    .line 779
    .line 780
    iget-object v5, v0, Landroidx/compose/ui/layout/f;->g:Lt/L;

    .line 781
    .line 782
    invoke-virtual {v5, v3}, Lt/V;->c(I)Ljava/lang/Object;

    .line 783
    .line 784
    .line 785
    move-result-object v5

    .line 786
    check-cast v5, LY/C0;

    .line 787
    .line 788
    invoke-interface {v5}, LY/C0;->getValue()Ljava/lang/Object;

    .line 789
    .line 790
    .line 791
    move-result-object v6

    .line 792
    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 793
    .line 794
    .line 795
    move-result v6

    .line 796
    if-nez v6, :cond_13

    .line 797
    .line 798
    invoke-interface {v5, v4}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 799
    .line 800
    .line 801
    move/from16 v21, v20

    .line 802
    .line 803
    :cond_13
    add-int/lit8 v3, v3, 0x1

    .line 804
    .line 805
    goto :goto_e

    .line 806
    :cond_14
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 807
    .line 808
    .line 809
    move-result v1

    .line 810
    if-nez v1, :cond_15

    .line 811
    .line 812
    move/from16 v22, v20

    .line 813
    .line 814
    :cond_15
    :goto_f
    if-nez v22, :cond_16

    .line 815
    .line 816
    iget-object v1, v0, Landroidx/compose/ui/layout/f;->f:LY/A0;

    .line 817
    .line 818
    invoke-interface {v1}, LY/A0;->b()I

    .line 819
    .line 820
    .line 821
    move-result v1

    .line 822
    if-eqz v1, :cond_17

    .line 823
    .line 824
    :cond_16
    if-eqz v21, :cond_17

    .line 825
    .line 826
    iget-object v1, v0, Landroidx/compose/ui/layout/f;->f:LY/A0;

    .line 827
    .line 828
    invoke-interface {v1}, LY/A0;->b()I

    .line 829
    .line 830
    .line 831
    move-result v2

    .line 832
    add-int/lit8 v2, v2, 0x1

    .line 833
    .line 834
    invoke-interface {v1, v2}, LY/A0;->f(I)V

    .line 835
    .line 836
    .line 837
    sget-object v1, Li0/l;->e:Li0/l$a;

    .line 838
    .line 839
    invoke-virtual {v1}, Li0/l$a;->m()V

    .line 840
    .line 841
    .line 842
    :cond_17
    return-void
.end method


# virtual methods
.method public final b()Li0/E;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/f;->h:Li0/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Lt/L;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/f;->g:Lt/L;

    .line 2
    .line 3
    return-object v0
.end method

.method public d(Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/layout/f;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput-object p2, p0, Landroidx/compose/ui/layout/f;->d:Landroidx/core/view/L0;

    .line 6
    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v1, 0x1e

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 14
    .line 15
    .line 16
    return-object p2

    .line 17
    :cond_0
    iget p1, p0, Landroidx/compose/ui/layout/f;->c:I

    .line 18
    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    invoke-direct {p0, p2}, Landroidx/compose/ui/layout/f;->i(Landroidx/core/view/L0;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-object p2
.end method

.method public final e()LY/A0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/f;->f:LY/A0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Lt/c0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/f;->e:Lt/c0;

    .line 2
    .line 3
    return-object v0
.end method

.method public onEnd(Landroidx/core/view/p0;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/compose/ui/layout/f;->b:Z

    .line 3
    .line 4
    invoke-virtual {p1}, Landroidx/core/view/p0;->d()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget v1, p0, Landroidx/compose/ui/layout/f;->c:I

    .line 9
    .line 10
    not-int v2, v0

    .line 11
    and-int/2addr v1, v2

    .line 12
    iput v1, p0, Landroidx/compose/ui/layout/f;->c:I

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iput-object v1, p0, Landroidx/compose/ui/layout/f;->d:Landroidx/core/view/L0;

    .line 16
    .line 17
    invoke-static {}, Landroidx/compose/ui/layout/H;->b()Lt/F;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1, v0}, Lt/o;->c(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroidx/compose/ui/layout/F;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iget-object v1, p0, Landroidx/compose/ui/layout/f;->e:Lt/c0;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    check-cast v0, LI0/T;

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-virtual {v0, v1}, LI0/T;->l(F)V

    .line 42
    .line 43
    .line 44
    const/high16 v2, 0x3f800000    # 1.0f

    .line 45
    .line 46
    invoke-virtual {v0, v2}, LI0/T;->h(F)V

    .line 47
    .line 48
    .line 49
    const-wide/16 v2, 0x0

    .line 50
    .line 51
    invoke-virtual {v0, v2, v3}, LI0/T;->k(J)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, LI0/T;->l(F)V

    .line 55
    .line 56
    .line 57
    invoke-direct {p0, v0}, Landroidx/compose/ui/layout/f;->g(LI0/T;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Landroidx/compose/ui/layout/f;->f:LY/A0;

    .line 61
    .line 62
    invoke-interface {v0}, LY/A0;->b()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    add-int/lit8 v1, v1, 0x1

    .line 67
    .line 68
    invoke-interface {v0, v1}, LY/A0;->f(I)V

    .line 69
    .line 70
    .line 71
    sget-object v0, Li0/l;->e:Li0/l$a;

    .line 72
    .line 73
    invoke-virtual {v0}, Li0/l$a;->m()V

    .line 74
    .line 75
    .line 76
    :cond_0
    invoke-super {p0, p1}, Landroidx/core/view/p0$b;->onEnd(Landroidx/core/view/p0;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public onPrepare(Landroidx/core/view/p0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/compose/ui/layout/f;->b:Z

    .line 3
    .line 4
    invoke-super {p0, p1}, Landroidx/core/view/p0$b;->onPrepare(Landroidx/core/view/p0;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onProgress(Landroidx/core/view/L0;Ljava/util/List;)Landroidx/core/view/L0;
    .locals 5

    .line 1
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_1

    .line 7
    .line 8
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Landroidx/core/view/p0;

    .line 13
    .line 14
    invoke-virtual {v2}, Landroidx/core/view/p0;->d()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    invoke-static {}, Landroidx/compose/ui/layout/H;->b()Lt/F;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-virtual {v4, v3}, Lt/o;->c(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Landroidx/compose/ui/layout/F;

    .line 27
    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    iget-object v4, p0, Landroidx/compose/ui/layout/f;->e:Lt/c0;

    .line 31
    .line 32
    invoke-virtual {v4, v3}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-static {v3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    check-cast v3, LI0/T;

    .line 40
    .line 41
    invoke-virtual {v3}, LI0/T;->g()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_0

    .line 46
    .line 47
    invoke-direct {p0, v3, v2}, Landroidx/compose/ui/layout/f;->h(LI0/T;Landroidx/core/view/p0;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-direct {p0, p1}, Landroidx/compose/ui/layout/f;->i(Landroidx/core/view/L0;)V

    .line 54
    .line 55
    .line 56
    return-object p1
.end method

.method public onStart(Landroidx/core/view/p0;Landroidx/core/view/p0$a;)Landroidx/core/view/p0$a;
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/f;->d:Landroidx/core/view/L0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, Landroidx/compose/ui/layout/f;->b:Z

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-object v1, p0, Landroidx/compose/ui/layout/f;->d:Landroidx/core/view/L0;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/core/view/p0;->b()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    const-wide/16 v3, 0x0

    .line 14
    .line 15
    cmp-long v1, v1, v3

    .line 16
    .line 17
    if-lez v1, :cond_0

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Landroidx/core/view/p0;->d()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iget v2, p0, Landroidx/compose/ui/layout/f;->c:I

    .line 26
    .line 27
    or-int/2addr v2, v1

    .line 28
    iput v2, p0, Landroidx/compose/ui/layout/f;->c:I

    .line 29
    .line 30
    invoke-static {}, Landroidx/compose/ui/layout/H;->b()Lt/F;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v2, v1}, Lt/o;->c(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Landroidx/compose/ui/layout/F;

    .line 39
    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    iget-object v3, p0, Landroidx/compose/ui/layout/f;->e:Lt/c0;

    .line 43
    .line 44
    invoke-virtual {v3, v2}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    check-cast v2, LI0/T;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroidx/core/view/L0;->f(I)LA1/b;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iget v1, v0, LA1/b;->a:I

    .line 58
    .line 59
    int-to-long v3, v1

    .line 60
    const/16 v1, 0x30

    .line 61
    .line 62
    shl-long/2addr v3, v1

    .line 63
    iget v1, v0, LA1/b;->b:I

    .line 64
    .line 65
    int-to-long v5, v1

    .line 66
    const/16 v1, 0x20

    .line 67
    .line 68
    shl-long/2addr v5, v1

    .line 69
    or-long/2addr v3, v5

    .line 70
    iget v1, v0, LA1/b;->c:I

    .line 71
    .line 72
    int-to-long v5, v1

    .line 73
    const/16 v1, 0x10

    .line 74
    .line 75
    shl-long/2addr v5, v1

    .line 76
    or-long/2addr v3, v5

    .line 77
    iget v0, v0, LA1/b;->d:I

    .line 78
    .line 79
    int-to-long v0, v0

    .line 80
    or-long/2addr v0, v3

    .line 81
    invoke-static {v0, v1}, LI0/Q;->a(J)J

    .line 82
    .line 83
    .line 84
    move-result-wide v0

    .line 85
    invoke-virtual {v2}, LI0/T;->a()J

    .line 86
    .line 87
    .line 88
    move-result-wide v3

    .line 89
    invoke-static {v0, v1, v3, v4}, LI0/Q;->b(JJ)Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-nez v5, :cond_0

    .line 94
    .line 95
    invoke-virtual {v2, v3, v4}, LI0/T;->n(J)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2, v0, v1}, LI0/T;->o(J)V

    .line 99
    .line 100
    .line 101
    const/4 v0, 0x1

    .line 102
    invoke-virtual {v2, v0}, LI0/T;->i(Z)V

    .line 103
    .line 104
    .line 105
    invoke-direct {p0, v2, p1}, Landroidx/compose/ui/layout/f;->h(LI0/T;Landroidx/core/view/p0;)V

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, Landroidx/compose/ui/layout/f;->f:LY/A0;

    .line 109
    .line 110
    invoke-interface {v1}, LY/A0;->b()I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    add-int/2addr v2, v0

    .line 115
    invoke-interface {v1, v2}, LY/A0;->f(I)V

    .line 116
    .line 117
    .line 118
    sget-object v0, Li0/l;->e:Li0/l$a;

    .line 119
    .line 120
    invoke-virtual {v0}, Li0/l$a;->m()V

    .line 121
    .line 122
    .line 123
    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/core/view/p0$b;->onStart(Landroidx/core/view/p0;Landroidx/core/view/p0$a;)Landroidx/core/view/p0$a;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    return-object p1
.end method

.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Landroid/view/View;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Landroid/view/View;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-nez v0, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    move-object p1, v0

    .line 17
    :goto_1
    invoke-static {p1, p0}, Landroidx/core/view/a0;->w0(Landroid/view/View;Landroidx/core/view/I;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1, p0}, Landroidx/core/view/a0;->C0(Landroid/view/View;Landroidx/core/view/p0$b;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Landroid/view/View;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Landroid/view/View;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v2

    .line 14
    :goto_0
    if-nez v0, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    move-object p1, v0

    .line 18
    :goto_1
    invoke-static {p1, v2}, Landroidx/core/view/a0;->w0(Landroid/view/View;Landroidx/core/view/I;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v2}, Landroidx/core/view/a0;->C0(Landroid/view/View;Landroidx/core/view/p0$b;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public run()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/layout/f;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput v0, p0, Landroidx/compose/ui/layout/f;->c:I

    .line 7
    .line 8
    iput-boolean v0, p0, Landroidx/compose/ui/layout/f;->b:Z

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/compose/ui/layout/f;->d:Landroidx/core/view/L0;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-direct {p0, v0}, Landroidx/compose/ui/layout/f;->i(Landroidx/core/view/L0;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Landroidx/compose/ui/layout/f;->d:Landroidx/core/view/L0;

    .line 19
    .line 20
    :cond_0
    return-void
.end method
