.class public final Lq0/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lq0/j;

.field private final b:LK0/p0;

.field private final c:Lt/Q;

.field private final d:Lt/Q;

.field private e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lq0/j;LK0/p0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq0/f;->a:Lq0/j;

    .line 5
    .line 6
    iput-object p2, p0, Lq0/f;->b:LK0/p0;

    .line 7
    .line 8
    invoke-static {}, Lt/f0;->b()Lt/Q;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lq0/f;->c:Lt/Q;

    .line 13
    .line 14
    invoke-static {}, Lt/f0;->b()Lt/Q;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lq0/f;->d:Lt/Q;

    .line 19
    .line 20
    return-void
.end method

.method public static final synthetic a(Lq0/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lq0/f;->c()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final c()V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lq0/f;->a:Lq0/j;

    .line 4
    .line 5
    invoke-interface {v1}, Lq0/j;->j()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-wide/16 v4, 0xff

    .line 10
    .line 11
    const/4 v6, 0x7

    .line 12
    const-wide v7, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    const/16 v9, 0x8

    .line 18
    .line 19
    const/4 v10, 0x0

    .line 20
    if-nez v1, :cond_3

    .line 21
    .line 22
    iget-object v1, v0, Lq0/f;->d:Lt/Q;

    .line 23
    .line 24
    iget-object v11, v1, Lt/e0;->b:[Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v1, v1, Lt/e0;->a:[J

    .line 27
    .line 28
    array-length v12, v1

    .line 29
    add-int/lit8 v12, v12, -0x2

    .line 30
    .line 31
    if-ltz v12, :cond_10

    .line 32
    .line 33
    move v13, v10

    .line 34
    :goto_0
    aget-wide v14, v1, v13

    .line 35
    .line 36
    const-wide/16 v16, 0x80

    .line 37
    .line 38
    not-long v2, v14

    .line 39
    shl-long/2addr v2, v6

    .line 40
    and-long/2addr v2, v14

    .line 41
    and-long/2addr v2, v7

    .line 42
    cmp-long v2, v2, v7

    .line 43
    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    sub-int v2, v13, v12

    .line 47
    .line 48
    not-int v2, v2

    .line 49
    ushr-int/lit8 v2, v2, 0x1f

    .line 50
    .line 51
    rsub-int/lit8 v2, v2, 0x8

    .line 52
    .line 53
    move v3, v10

    .line 54
    :goto_1
    if-ge v3, v2, :cond_1

    .line 55
    .line 56
    and-long v18, v14, v4

    .line 57
    .line 58
    cmp-long v18, v18, v16

    .line 59
    .line 60
    if-gez v18, :cond_0

    .line 61
    .line 62
    shl-int/lit8 v18, v13, 0x3

    .line 63
    .line 64
    add-int v18, v18, v3

    .line 65
    .line 66
    aget-object v18, v11, v18

    .line 67
    .line 68
    move-wide/from16 v19, v4

    .line 69
    .line 70
    move-object/from16 v4, v18

    .line 71
    .line 72
    check-cast v4, Lq0/d;

    .line 73
    .line 74
    sget-object v5, Lq0/o;->d:Lq0/o;

    .line 75
    .line 76
    invoke-interface {v4, v5}, Lq0/d;->W0(Lq0/n;)V

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_0
    move-wide/from16 v19, v4

    .line 81
    .line 82
    :goto_2
    shr-long/2addr v14, v9

    .line 83
    add-int/lit8 v3, v3, 0x1

    .line 84
    .line 85
    move-wide/from16 v4, v19

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    move-wide/from16 v19, v4

    .line 89
    .line 90
    if-ne v2, v9, :cond_10

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_2
    move-wide/from16 v19, v4

    .line 94
    .line 95
    :goto_3
    if-eq v13, v12, :cond_10

    .line 96
    .line 97
    add-int/lit8 v13, v13, 0x1

    .line 98
    .line 99
    move-wide/from16 v4, v19

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_3
    move-wide/from16 v19, v4

    .line 103
    .line 104
    const-wide/16 v16, 0x80

    .line 105
    .line 106
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-eqz v2, :cond_10

    .line 111
    .line 112
    iget-object v2, v0, Lq0/f;->c:Lt/Q;

    .line 113
    .line 114
    invoke-virtual {v2, v1}, Lt/e0;->a(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-eqz v2, :cond_4

    .line 119
    .line 120
    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusTargetNode;->N1()V

    .line 121
    .line 122
    .line 123
    :cond_4
    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusTargetNode;->L1()Lq0/o;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    const/16 v3, 0x400

    .line 128
    .line 129
    invoke-static {v3}, LK0/g0;->a(I)I

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    const/16 v5, 0x1000

    .line 134
    .line 135
    invoke-static {v5}, LK0/g0;->a(I)I

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    or-int/2addr v4, v5

    .line 140
    invoke-interface {v1}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    if-nez v5, :cond_5

    .line 149
    .line 150
    const-string v5, "visitAncestors called on an unattached node"

    .line 151
    .line 152
    invoke-static {v5}, LH0/a;->b(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    :cond_5
    invoke-interface {v1}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    invoke-static {v1}, LK0/k;->n(LK0/j;)LK0/J;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    move v11, v10

    .line 164
    :goto_4
    if-eqz v1, :cond_c

    .line 165
    .line 166
    invoke-virtual {v1}, LK0/J;->t0()LK0/c0;

    .line 167
    .line 168
    .line 169
    move-result-object v12

    .line 170
    invoke-virtual {v12}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 171
    .line 172
    .line 173
    move-result-object v12

    .line 174
    invoke-virtual {v12}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 175
    .line 176
    .line 177
    move-result v12

    .line 178
    and-int/2addr v12, v4

    .line 179
    if-eqz v12, :cond_a

    .line 180
    .line 181
    :goto_5
    if-eqz v5, :cond_a

    .line 182
    .line 183
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 184
    .line 185
    .line 186
    move-result v12

    .line 187
    and-int/2addr v12, v4

    .line 188
    if-eqz v12, :cond_9

    .line 189
    .line 190
    invoke-static {v3}, LK0/g0;->a(I)I

    .line 191
    .line 192
    .line 193
    move-result v12

    .line 194
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 195
    .line 196
    .line 197
    move-result v13

    .line 198
    and-int/2addr v12, v13

    .line 199
    if-eqz v12, :cond_6

    .line 200
    .line 201
    add-int/lit8 v11, v11, 0x1

    .line 202
    .line 203
    :cond_6
    instance-of v12, v5, Lq0/d;

    .line 204
    .line 205
    if-eqz v12, :cond_9

    .line 206
    .line 207
    iget-object v12, v0, Lq0/f;->d:Lt/Q;

    .line 208
    .line 209
    invoke-virtual {v12, v5}, Lt/e0;->a(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v12

    .line 213
    if-nez v12, :cond_7

    .line 214
    .line 215
    goto :goto_7

    .line 216
    :cond_7
    const/4 v12, 0x1

    .line 217
    if-gt v11, v12, :cond_8

    .line 218
    .line 219
    move-object v12, v5

    .line 220
    check-cast v12, Lq0/d;

    .line 221
    .line 222
    invoke-interface {v12, v2}, Lq0/d;->W0(Lq0/n;)V

    .line 223
    .line 224
    .line 225
    goto :goto_6

    .line 226
    :cond_8
    move-object v12, v5

    .line 227
    check-cast v12, Lq0/d;

    .line 228
    .line 229
    sget-object v13, Lq0/o;->b:Lq0/o;

    .line 230
    .line 231
    invoke-interface {v12, v13}, Lq0/d;->W0(Lq0/n;)V

    .line 232
    .line 233
    .line 234
    :goto_6
    iget-object v12, v0, Lq0/f;->d:Lt/Q;

    .line 235
    .line 236
    invoke-virtual {v12, v5}, Lt/Q;->y(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    :cond_9
    :goto_7
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    goto :goto_5

    .line 244
    :cond_a
    invoke-virtual {v1}, LK0/J;->A0()LK0/J;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    if-eqz v1, :cond_b

    .line 249
    .line 250
    invoke-virtual {v1}, LK0/J;->t0()LK0/c0;

    .line 251
    .line 252
    .line 253
    move-result-object v5

    .line 254
    if-eqz v5, :cond_b

    .line 255
    .line 256
    invoke-virtual {v5}, LK0/c0;->p()Landroidx/compose/ui/e$c;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    goto :goto_4

    .line 261
    :cond_b
    const/4 v5, 0x0

    .line 262
    goto :goto_4

    .line 263
    :cond_c
    iget-object v1, v0, Lq0/f;->d:Lt/Q;

    .line 264
    .line 265
    iget-object v2, v1, Lt/e0;->b:[Ljava/lang/Object;

    .line 266
    .line 267
    iget-object v1, v1, Lt/e0;->a:[J

    .line 268
    .line 269
    array-length v3, v1

    .line 270
    add-int/lit8 v3, v3, -0x2

    .line 271
    .line 272
    if-ltz v3, :cond_10

    .line 273
    .line 274
    move v4, v10

    .line 275
    :goto_8
    aget-wide v11, v1, v4

    .line 276
    .line 277
    not-long v13, v11

    .line 278
    shl-long/2addr v13, v6

    .line 279
    and-long/2addr v13, v11

    .line 280
    and-long/2addr v13, v7

    .line 281
    cmp-long v5, v13, v7

    .line 282
    .line 283
    if-eqz v5, :cond_f

    .line 284
    .line 285
    sub-int v5, v4, v3

    .line 286
    .line 287
    not-int v5, v5

    .line 288
    ushr-int/lit8 v5, v5, 0x1f

    .line 289
    .line 290
    rsub-int/lit8 v5, v5, 0x8

    .line 291
    .line 292
    move v13, v10

    .line 293
    :goto_9
    if-ge v13, v5, :cond_e

    .line 294
    .line 295
    and-long v14, v11, v19

    .line 296
    .line 297
    cmp-long v14, v14, v16

    .line 298
    .line 299
    if-gez v14, :cond_d

    .line 300
    .line 301
    shl-int/lit8 v14, v4, 0x3

    .line 302
    .line 303
    add-int/2addr v14, v13

    .line 304
    aget-object v14, v2, v14

    .line 305
    .line 306
    check-cast v14, Lq0/d;

    .line 307
    .line 308
    sget-object v15, Lq0/o;->d:Lq0/o;

    .line 309
    .line 310
    invoke-interface {v14, v15}, Lq0/d;->W0(Lq0/n;)V

    .line 311
    .line 312
    .line 313
    :cond_d
    shr-long/2addr v11, v9

    .line 314
    add-int/lit8 v13, v13, 0x1

    .line 315
    .line 316
    goto :goto_9

    .line 317
    :cond_e
    if-ne v5, v9, :cond_10

    .line 318
    .line 319
    :cond_f
    if-eq v4, v3, :cond_10

    .line 320
    .line 321
    add-int/lit8 v4, v4, 0x1

    .line 322
    .line 323
    goto :goto_8

    .line 324
    :cond_10
    invoke-direct {v0}, Lq0/f;->d()V

    .line 325
    .line 326
    .line 327
    iget-object v1, v0, Lq0/f;->c:Lt/Q;

    .line 328
    .line 329
    invoke-virtual {v1}, Lt/Q;->m()V

    .line 330
    .line 331
    .line 332
    iget-object v1, v0, Lq0/f;->d:Lt/Q;

    .line 333
    .line 334
    invoke-virtual {v1}, Lt/Q;->m()V

    .line 335
    .line 336
    .line 337
    iput-boolean v10, v0, Lq0/f;->e:Z

    .line 338
    .line 339
    return-void
.end method

.method private final d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lq0/f;->a:Lq0/j;

    .line 2
    .line 3
    invoke-interface {v0}, Lq0/j;->j()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lq0/f;->a:Lq0/j;

    .line 10
    .line 11
    invoke-interface {v0}, Lq0/j;->q()Lq0/n;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Lq0/o;->d:Lq0/o;

    .line 16
    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-void

    .line 21
    :cond_1
    :goto_0
    iget-object v0, p0, Lq0/f;->a:Lq0/j;

    .line 22
    .line 23
    invoke-interface {v0}, Lq0/j;->a()V

    .line 24
    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq0/f;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public final e()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lq0/f;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lq0/f;->b:LK0/p0;

    .line 6
    .line 7
    new-instance v1, Lq0/f$a;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Lq0/f$a;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1}, LK0/p0;->F(Lie/a;)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, Lq0/f;->e:Z

    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final f(Landroidx/compose/ui/focus/FocusTargetNode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq0/f;->c:Lt/Q;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lt/Q;->h(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lq0/f;->e()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final g(Lq0/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq0/f;->d:Lt/Q;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lt/Q;->h(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lq0/f;->e()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
