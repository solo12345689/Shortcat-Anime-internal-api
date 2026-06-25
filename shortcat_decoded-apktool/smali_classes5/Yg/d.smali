.class LYg/d;
.super Ljava/lang/Object;


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:[I

.field private final l:I

.field private m:LYg/k;

.field private n:LYg/c;

.field private o:Z

.field private p:Z

.field private q:Z


# direct methods
.method public constructor <init>(III[IZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p5, p0, LYg/d;->q:Z

    .line 5
    .line 6
    iput p2, p0, LYg/d;->a:I

    .line 7
    .line 8
    iput p3, p0, LYg/d;->b:I

    .line 9
    .line 10
    iput p1, p0, LYg/d;->c:I

    .line 11
    .line 12
    iput-object p4, p0, LYg/d;->k:[I

    .line 13
    .line 14
    iput p6, p0, LYg/d;->l:I

    .line 15
    .line 16
    mul-int/lit8 p4, p3, 0x2

    .line 17
    .line 18
    iput p4, p0, LYg/d;->d:I

    .line 19
    .line 20
    add-int/lit8 p4, p1, -0x4

    .line 21
    .line 22
    const/4 p5, 0x1

    .line 23
    shl-int p4, p5, p4

    .line 24
    .line 25
    mul-int/lit8 p6, p1, 0x2

    .line 26
    .line 27
    sub-int/2addr p6, p5

    .line 28
    mul-int/2addr p4, p6

    .line 29
    iput p4, p0, LYg/d;->e:I

    .line 30
    .line 31
    mul-int/2addr p3, p1

    .line 32
    iput p3, p0, LYg/d;->f:I

    .line 33
    .line 34
    sub-int/2addr p2, p3

    .line 35
    iput p2, p0, LYg/d;->g:I

    .line 36
    .line 37
    add-int/lit8 p2, p2, 0x7

    .line 38
    .line 39
    div-int/lit8 p2, p2, 0x8

    .line 40
    .line 41
    iput p2, p0, LYg/d;->h:I

    .line 42
    .line 43
    add-int/lit8 p3, p3, 0x7

    .line 44
    .line 45
    div-int/lit8 p3, p3, 0x8

    .line 46
    .line 47
    iput p3, p0, LYg/d;->i:I

    .line 48
    .line 49
    shl-int p2, p5, p1

    .line 50
    .line 51
    sub-int/2addr p2, p5

    .line 52
    iput p2, p0, LYg/d;->j:I

    .line 53
    .line 54
    const/16 p2, 0xc

    .line 55
    .line 56
    if-ne p1, p2, :cond_0

    .line 57
    .line 58
    new-instance p1, LYg/i;

    .line 59
    .line 60
    invoke-direct {p1}, LYg/i;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, LYg/d;->m:LYg/k;

    .line 64
    .line 65
    new-instance p1, LYg/a;

    .line 66
    .line 67
    iget p2, p0, LYg/d;->a:I

    .line 68
    .line 69
    iget p3, p0, LYg/d;->b:I

    .line 70
    .line 71
    iget p4, p0, LYg/d;->c:I

    .line 72
    .line 73
    invoke-direct {p1, p2, p3, p4}, LYg/a;-><init>(III)V

    .line 74
    .line 75
    .line 76
    :goto_0
    iput-object p1, p0, LYg/d;->n:LYg/c;

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_0
    new-instance p1, LYg/j;

    .line 80
    .line 81
    invoke-direct {p1}, LYg/j;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object p1, p0, LYg/d;->m:LYg/k;

    .line 85
    .line 86
    new-instance p1, LYg/b;

    .line 87
    .line 88
    iget p2, p0, LYg/d;->a:I

    .line 89
    .line 90
    iget p3, p0, LYg/d;->b:I

    .line 91
    .line 92
    iget p4, p0, LYg/d;->c:I

    .line 93
    .line 94
    invoke-direct {p1, p2, p3, p4}, LYg/b;-><init>(III)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :goto_1
    iget p1, p0, LYg/d;->b:I

    .line 99
    .line 100
    rem-int/lit8 p1, p1, 0x8

    .line 101
    .line 102
    const/4 p2, 0x0

    .line 103
    if-eqz p1, :cond_1

    .line 104
    .line 105
    move p1, p5

    .line 106
    goto :goto_2

    .line 107
    :cond_1
    move p1, p2

    .line 108
    :goto_2
    iput-boolean p1, p0, LYg/d;->o:Z

    .line 109
    .line 110
    iget p1, p0, LYg/d;->c:I

    .line 111
    .line 112
    shl-int p1, p5, p1

    .line 113
    .line 114
    iget p3, p0, LYg/d;->a:I

    .line 115
    .line 116
    if-le p1, p3, :cond_2

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_2
    move p5, p2

    .line 120
    :goto_3
    iput-boolean p5, p0, LYg/d;->p:Z

    .line 121
    .line 122
    return-void
.end method

.method private static a(J)I
    .locals 10

    .line 1
    not-long p0, p0

    .line 2
    const-wide v0, 0x101010101010101L

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    :goto_0
    const/16 v5, 0x8

    .line 11
    .line 12
    if-ge v4, v5, :cond_0

    .line 13
    .line 14
    ushr-long v5, p0, v4

    .line 15
    .line 16
    and-long/2addr v0, v5

    .line 17
    add-long/2addr v2, v0

    .line 18
    add-int/lit8 v4, v4, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-wide p0, 0x808080808080808L

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    and-long/2addr p0, v2

    .line 27
    const/4 v0, 0x1

    .line 28
    ushr-long v0, p0, v0

    .line 29
    .line 30
    or-long/2addr p0, v0

    .line 31
    const/4 v0, 0x2

    .line 32
    ushr-long v6, p0, v0

    .line 33
    .line 34
    or-long/2addr p0, v6

    .line 35
    ushr-long v6, v2, v5

    .line 36
    .line 37
    and-long v8, v6, p0

    .line 38
    .line 39
    add-long/2addr v2, v8

    .line 40
    :goto_1
    if-ge v0, v5, :cond_1

    .line 41
    .line 42
    ushr-long v8, p0, v5

    .line 43
    .line 44
    and-long/2addr p0, v8

    .line 45
    ushr-long/2addr v6, v5

    .line 46
    and-long v8, v6, p0

    .line 47
    .line 48
    add-long/2addr v2, v8

    .line 49
    add-int/lit8 v0, v0, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    long-to-int p0, v2

    .line 53
    and-int/lit16 p0, p0, 0xff

    .line 54
    .line 55
    return p0
.end method

.method private b([SS)S
    .locals 3

    .line 1
    iget v0, p0, LYg/d;->b:I

    .line 2
    .line 3
    aget-short v1, p1, v0

    .line 4
    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    :goto_0
    if-ltz v0, :cond_0

    .line 8
    .line 9
    iget-object v2, p0, LYg/d;->m:LYg/k;

    .line 10
    .line 11
    invoke-virtual {v2, v1, p2}, LYg/k;->b(SS)S

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    aget-short v2, p1, v0

    .line 16
    .line 17
    xor-int/2addr v1, v2

    .line 18
    int-to-short v1, v1

    .line 19
    add-int/lit8 v0, v0, -0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return v1
.end method

.method private e([[B[S[J)I
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x40

    .line 4
    .line 5
    new-array v2, v1, [J

    .line 6
    .line 7
    const/16 v3, 0x20

    .line 8
    .line 9
    new-array v4, v3, [J

    .line 10
    .line 11
    const/16 v5, 0x9

    .line 12
    .line 13
    new-array v6, v5, [B

    .line 14
    .line 15
    iget v7, v0, LYg/d;->f:I

    .line 16
    .line 17
    sub-int/2addr v7, v3

    .line 18
    div-int/lit8 v8, v7, 0x8

    .line 19
    .line 20
    rem-int/lit8 v9, v7, 0x8

    .line 21
    .line 22
    iget-boolean v10, v0, LYg/d;->o:Z

    .line 23
    .line 24
    const/4 v11, 0x0

    .line 25
    const/16 v12, 0x8

    .line 26
    .line 27
    if-eqz v10, :cond_2

    .line 28
    .line 29
    move v10, v11

    .line 30
    :goto_0
    if-ge v10, v3, :cond_3

    .line 31
    .line 32
    move v13, v11

    .line 33
    :goto_1
    if-ge v13, v5, :cond_0

    .line 34
    .line 35
    add-int v14, v7, v10

    .line 36
    .line 37
    aget-object v14, p1, v14

    .line 38
    .line 39
    add-int v15, v8, v13

    .line 40
    .line 41
    aget-byte v14, v14, v15

    .line 42
    .line 43
    aput-byte v14, v6, v13

    .line 44
    .line 45
    add-int/lit8 v13, v13, 0x1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    move v13, v11

    .line 49
    :goto_2
    if-ge v13, v12, :cond_1

    .line 50
    .line 51
    aget-byte v14, v6, v13

    .line 52
    .line 53
    and-int/lit16 v14, v14, 0xff

    .line 54
    .line 55
    shr-int/2addr v14, v9

    .line 56
    add-int/lit8 v15, v13, 0x1

    .line 57
    .line 58
    aget-byte v16, v6, v15

    .line 59
    .line 60
    rsub-int/lit8 v17, v9, 0x8

    .line 61
    .line 62
    shl-int v16, v16, v17

    .line 63
    .line 64
    or-int v14, v14, v16

    .line 65
    .line 66
    int-to-byte v14, v14

    .line 67
    aput-byte v14, v6, v13

    .line 68
    .line 69
    move v13, v15

    .line 70
    goto :goto_2

    .line 71
    :cond_1
    invoke-static {v6, v11}, LYg/l;->c([BI)J

    .line 72
    .line 73
    .line 74
    move-result-wide v13

    .line 75
    aput-wide v13, v2, v10

    .line 76
    .line 77
    add-int/lit8 v10, v10, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    move v10, v11

    .line 81
    :goto_3
    if-ge v10, v3, :cond_3

    .line 82
    .line 83
    add-int v13, v7, v10

    .line 84
    .line 85
    aget-object v13, p1, v13

    .line 86
    .line 87
    invoke-static {v13, v8}, LYg/l;->c([BI)J

    .line 88
    .line 89
    .line 90
    move-result-wide v13

    .line 91
    aput-wide v13, v2, v10

    .line 92
    .line 93
    add-int/lit8 v10, v10, 0x1

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_3
    const-wide/16 v13, 0x0

    .line 97
    .line 98
    aput-wide v13, p3, v11

    .line 99
    .line 100
    move v10, v11

    .line 101
    :goto_4
    const-wide/16 v15, 0x1

    .line 102
    .line 103
    if-ge v10, v3, :cond_8

    .line 104
    .line 105
    aget-wide v17, v2, v10

    .line 106
    .line 107
    add-int/lit8 v19, v10, 0x1

    .line 108
    .line 109
    move-wide/from16 v20, v13

    .line 110
    .line 111
    move/from16 v13, v19

    .line 112
    .line 113
    :goto_5
    if-ge v13, v3, :cond_4

    .line 114
    .line 115
    aget-wide v22, v2, v13

    .line 116
    .line 117
    or-long v17, v17, v22

    .line 118
    .line 119
    add-int/lit8 v13, v13, 0x1

    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_4
    cmp-long v13, v17, v20

    .line 123
    .line 124
    if-nez v13, :cond_5

    .line 125
    .line 126
    const/4 v1, -0x1

    .line 127
    return v1

    .line 128
    :cond_5
    invoke-static/range {v17 .. v18}, LYg/d;->a(J)I

    .line 129
    .line 130
    .line 131
    move-result v13

    .line 132
    move v14, v11

    .line 133
    int-to-long v11, v13

    .line 134
    aput-wide v11, v4, v10

    .line 135
    .line 136
    aget-wide v22, p3, v14

    .line 137
    .line 138
    long-to-int v11, v11

    .line 139
    shl-long v11, v15, v11

    .line 140
    .line 141
    or-long v11, v22, v11

    .line 142
    .line 143
    aput-wide v11, p3, v14

    .line 144
    .line 145
    move/from16 v11, v19

    .line 146
    .line 147
    :goto_6
    if-ge v11, v3, :cond_6

    .line 148
    .line 149
    aget-wide v22, v2, v10

    .line 150
    .line 151
    shr-long v24, v22, v13

    .line 152
    .line 153
    and-long v24, v24, v15

    .line 154
    .line 155
    sub-long v24, v24, v15

    .line 156
    .line 157
    aget-wide v26, v2, v11

    .line 158
    .line 159
    and-long v24, v26, v24

    .line 160
    .line 161
    xor-long v22, v22, v24

    .line 162
    .line 163
    aput-wide v22, v2, v10

    .line 164
    .line 165
    add-int/lit8 v11, v11, 0x1

    .line 166
    .line 167
    goto :goto_6

    .line 168
    :cond_6
    move/from16 v11, v19

    .line 169
    .line 170
    :goto_7
    if-ge v11, v3, :cond_7

    .line 171
    .line 172
    aget-wide v22, v2, v11

    .line 173
    .line 174
    shr-long v24, v22, v13

    .line 175
    .line 176
    move-wide/from16 v26, v15

    .line 177
    .line 178
    and-long v14, v24, v26

    .line 179
    .line 180
    neg-long v14, v14

    .line 181
    aget-wide v24, v2, v10

    .line 182
    .line 183
    and-long v14, v24, v14

    .line 184
    .line 185
    xor-long v14, v22, v14

    .line 186
    .line 187
    aput-wide v14, v2, v11

    .line 188
    .line 189
    add-int/lit8 v11, v11, 0x1

    .line 190
    .line 191
    move-wide/from16 v15, v26

    .line 192
    .line 193
    const/4 v14, 0x0

    .line 194
    goto :goto_7

    .line 195
    :cond_7
    move v11, v14

    .line 196
    move/from16 v10, v19

    .line 197
    .line 198
    move-wide/from16 v13, v20

    .line 199
    .line 200
    const/16 v12, 0x8

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_8
    move-wide/from16 v26, v15

    .line 204
    .line 205
    const/4 v14, 0x0

    .line 206
    :goto_8
    if-ge v14, v3, :cond_a

    .line 207
    .line 208
    add-int/lit8 v2, v14, 0x1

    .line 209
    .line 210
    move v10, v2

    .line 211
    :goto_9
    if-ge v10, v1, :cond_9

    .line 212
    .line 213
    add-int v11, v7, v14

    .line 214
    .line 215
    aget-short v13, p2, v11

    .line 216
    .line 217
    add-int v15, v7, v10

    .line 218
    .line 219
    aget-short v16, p2, v15

    .line 220
    .line 221
    xor-int v13, v13, v16

    .line 222
    .line 223
    move/from16 p3, v2

    .line 224
    .line 225
    int-to-long v1, v13

    .line 226
    int-to-short v13, v10

    .line 227
    move-object/from16 v19, v4

    .line 228
    .line 229
    aget-wide v3, v19, v14

    .line 230
    .line 231
    long-to-int v3, v3

    .line 232
    int-to-short v3, v3

    .line 233
    invoke-static {v13, v3}, LYg/d;->h(SS)J

    .line 234
    .line 235
    .line 236
    move-result-wide v3

    .line 237
    and-long/2addr v1, v3

    .line 238
    aget-short v3, p2, v11

    .line 239
    .line 240
    int-to-long v3, v3

    .line 241
    xor-long/2addr v3, v1

    .line 242
    long-to-int v3, v3

    .line 243
    int-to-short v3, v3

    .line 244
    aput-short v3, p2, v11

    .line 245
    .line 246
    aget-short v3, p2, v15

    .line 247
    .line 248
    int-to-long v3, v3

    .line 249
    xor-long/2addr v1, v3

    .line 250
    long-to-int v1, v1

    .line 251
    int-to-short v1, v1

    .line 252
    aput-short v1, p2, v15

    .line 253
    .line 254
    add-int/lit8 v10, v10, 0x1

    .line 255
    .line 256
    move/from16 v2, p3

    .line 257
    .line 258
    move-object/from16 v4, v19

    .line 259
    .line 260
    const/16 v1, 0x40

    .line 261
    .line 262
    const/16 v3, 0x20

    .line 263
    .line 264
    goto :goto_9

    .line 265
    :cond_9
    move/from16 p3, v2

    .line 266
    .line 267
    move/from16 v14, p3

    .line 268
    .line 269
    goto :goto_8

    .line 270
    :cond_a
    move-object/from16 v19, v4

    .line 271
    .line 272
    const/4 v1, 0x0

    .line 273
    :goto_a
    iget v2, v0, LYg/d;->f:I

    .line 274
    .line 275
    if-ge v1, v2, :cond_11

    .line 276
    .line 277
    iget-boolean v2, v0, LYg/d;->o:Z

    .line 278
    .line 279
    if-eqz v2, :cond_d

    .line 280
    .line 281
    const/4 v14, 0x0

    .line 282
    :goto_b
    if-ge v14, v5, :cond_b

    .line 283
    .line 284
    aget-object v2, p1, v1

    .line 285
    .line 286
    add-int v3, v8, v14

    .line 287
    .line 288
    aget-byte v2, v2, v3

    .line 289
    .line 290
    aput-byte v2, v6, v14

    .line 291
    .line 292
    add-int/lit8 v14, v14, 0x1

    .line 293
    .line 294
    goto :goto_b

    .line 295
    :cond_b
    const/16 v2, 0x8

    .line 296
    .line 297
    const/4 v14, 0x0

    .line 298
    :goto_c
    if-ge v14, v2, :cond_c

    .line 299
    .line 300
    aget-byte v3, v6, v14

    .line 301
    .line 302
    and-int/lit16 v3, v3, 0xff

    .line 303
    .line 304
    shr-int/2addr v3, v9

    .line 305
    add-int/lit8 v4, v14, 0x1

    .line 306
    .line 307
    aget-byte v7, v6, v4

    .line 308
    .line 309
    rsub-int/lit8 v10, v9, 0x8

    .line 310
    .line 311
    shl-int/2addr v7, v10

    .line 312
    or-int/2addr v3, v7

    .line 313
    int-to-byte v3, v3

    .line 314
    aput-byte v3, v6, v14

    .line 315
    .line 316
    move v14, v4

    .line 317
    goto :goto_c

    .line 318
    :cond_c
    const/4 v14, 0x0

    .line 319
    invoke-static {v6, v14}, LYg/l;->c([BI)J

    .line 320
    .line 321
    .line 322
    move-result-wide v3

    .line 323
    goto :goto_d

    .line 324
    :cond_d
    const/16 v2, 0x8

    .line 325
    .line 326
    aget-object v3, p1, v1

    .line 327
    .line 328
    invoke-static {v3, v8}, LYg/l;->c([BI)J

    .line 329
    .line 330
    .line 331
    move-result-wide v3

    .line 332
    :goto_d
    const/4 v7, 0x0

    .line 333
    :goto_e
    const/16 v10, 0x20

    .line 334
    .line 335
    if-ge v7, v10, :cond_e

    .line 336
    .line 337
    shr-long v11, v3, v7

    .line 338
    .line 339
    move-wide/from16 p2, v11

    .line 340
    .line 341
    aget-wide v10, v19, v7

    .line 342
    .line 343
    long-to-int v12, v10

    .line 344
    shr-long v12, v3, v12

    .line 345
    .line 346
    xor-long v12, p2, v12

    .line 347
    .line 348
    and-long v12, v12, v26

    .line 349
    .line 350
    long-to-int v10, v10

    .line 351
    shl-long v10, v12, v10

    .line 352
    .line 353
    xor-long/2addr v3, v10

    .line 354
    shl-long v10, v12, v7

    .line 355
    .line 356
    xor-long/2addr v3, v10

    .line 357
    add-int/lit8 v7, v7, 0x1

    .line 358
    .line 359
    goto :goto_e

    .line 360
    :cond_e
    iget-boolean v7, v0, LYg/d;->o:Z

    .line 361
    .line 362
    if-eqz v7, :cond_f

    .line 363
    .line 364
    const/4 v14, 0x0

    .line 365
    invoke-static {v6, v14, v3, v4}, LYg/l;->e([BIJ)V

    .line 366
    .line 367
    .line 368
    aget-object v3, p1, v1

    .line 369
    .line 370
    add-int/lit8 v4, v8, 0x8

    .line 371
    .line 372
    aget-byte v7, v3, v4

    .line 373
    .line 374
    and-int/lit16 v7, v7, 0xff

    .line 375
    .line 376
    ushr-int/2addr v7, v9

    .line 377
    shl-int/2addr v7, v9

    .line 378
    const/4 v10, 0x7

    .line 379
    aget-byte v11, v6, v10

    .line 380
    .line 381
    and-int/lit16 v11, v11, 0xff

    .line 382
    .line 383
    rsub-int/lit8 v12, v9, 0x8

    .line 384
    .line 385
    ushr-int/2addr v11, v12

    .line 386
    or-int/2addr v7, v11

    .line 387
    int-to-byte v7, v7

    .line 388
    aput-byte v7, v3, v4

    .line 389
    .line 390
    const/4 v14, 0x0

    .line 391
    aget-byte v4, v6, v14

    .line 392
    .line 393
    and-int/lit16 v4, v4, 0xff

    .line 394
    .line 395
    shl-int/2addr v4, v9

    .line 396
    aget-byte v7, v3, v8

    .line 397
    .line 398
    and-int/lit16 v7, v7, 0xff

    .line 399
    .line 400
    shl-int/2addr v7, v12

    .line 401
    ushr-int/2addr v7, v12

    .line 402
    or-int/2addr v4, v7

    .line 403
    int-to-byte v4, v4

    .line 404
    aput-byte v4, v3, v8

    .line 405
    .line 406
    :goto_f
    const/4 v3, 0x1

    .line 407
    if-lt v10, v3, :cond_10

    .line 408
    .line 409
    aget-object v3, p1, v1

    .line 410
    .line 411
    add-int v4, v8, v10

    .line 412
    .line 413
    aget-byte v7, v6, v10

    .line 414
    .line 415
    and-int/lit16 v7, v7, 0xff

    .line 416
    .line 417
    shl-int/2addr v7, v9

    .line 418
    add-int/lit8 v11, v10, -0x1

    .line 419
    .line 420
    aget-byte v11, v6, v11

    .line 421
    .line 422
    and-int/lit16 v11, v11, 0xff

    .line 423
    .line 424
    ushr-int/2addr v11, v12

    .line 425
    or-int/2addr v7, v11

    .line 426
    int-to-byte v7, v7

    .line 427
    aput-byte v7, v3, v4

    .line 428
    .line 429
    add-int/lit8 v10, v10, -0x1

    .line 430
    .line 431
    goto :goto_f

    .line 432
    :cond_f
    aget-object v7, p1, v1

    .line 433
    .line 434
    invoke-static {v7, v8, v3, v4}, LYg/l;->e([BIJ)V

    .line 435
    .line 436
    .line 437
    :cond_10
    add-int/lit8 v1, v1, 0x1

    .line 438
    .line 439
    goto/16 :goto_a

    .line 440
    .line 441
    :cond_11
    const/4 v14, 0x0

    .line 442
    return v14
.end method

.method private f([B[B[I[S[J)I
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    iget v3, v0, LYg/d;->b:I

    .line 8
    .line 9
    add-int/lit8 v4, v3, 0x1

    .line 10
    .line 11
    new-array v4, v4, [S

    .line 12
    .line 13
    const/4 v5, 0x1

    .line 14
    aput-short v5, v4, v3

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    move v6, v3

    .line 18
    :goto_0
    iget v7, v0, LYg/d;->b:I

    .line 19
    .line 20
    if-ge v6, v7, :cond_0

    .line 21
    .line 22
    mul-int/lit8 v7, v6, 0x2

    .line 23
    .line 24
    add-int/lit8 v7, v7, 0x28

    .line 25
    .line 26
    iget v8, v0, LYg/d;->j:I

    .line 27
    .line 28
    move-object/from16 v9, p2

    .line 29
    .line 30
    invoke-static {v9, v7, v8}, LYg/l;->d([BII)S

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    aput-short v7, v4, v6

    .line 35
    .line 36
    add-int/lit8 v6, v6, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget v6, v0, LYg/d;->c:I

    .line 40
    .line 41
    shl-int v6, v5, v6

    .line 42
    .line 43
    new-array v7, v6, [J

    .line 44
    .line 45
    move v8, v3

    .line 46
    :goto_1
    iget v9, v0, LYg/d;->c:I

    .line 47
    .line 48
    shl-int v9, v5, v9

    .line 49
    .line 50
    const/16 v10, 0x1f

    .line 51
    .line 52
    if-ge v8, v9, :cond_1

    .line 53
    .line 54
    aget v9, p3, v8

    .line 55
    .line 56
    int-to-long v11, v9

    .line 57
    aput-wide v11, v7, v8

    .line 58
    .line 59
    shl-long v9, v11, v10

    .line 60
    .line 61
    aput-wide v9, v7, v8

    .line 62
    .line 63
    int-to-long v11, v8

    .line 64
    or-long/2addr v9, v11

    .line 65
    aput-wide v9, v7, v8

    .line 66
    .line 67
    const-wide v11, 0x7fffffffffffffffL

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    and-long/2addr v9, v11

    .line 73
    aput-wide v9, v7, v8

    .line 74
    .line 75
    add-int/lit8 v8, v8, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    invoke-static {v7, v3, v6}, LYg/d;->i([JII)V

    .line 79
    .line 80
    .line 81
    move v6, v5

    .line 82
    :goto_2
    iget v8, v0, LYg/d;->c:I

    .line 83
    .line 84
    shl-int v8, v5, v8

    .line 85
    .line 86
    const/4 v9, -0x1

    .line 87
    if-ge v6, v8, :cond_3

    .line 88
    .line 89
    add-int/lit8 v8, v6, -0x1

    .line 90
    .line 91
    aget-wide v11, v7, v8

    .line 92
    .line 93
    shr-long/2addr v11, v10

    .line 94
    aget-wide v13, v7, v6

    .line 95
    .line 96
    shr-long/2addr v13, v10

    .line 97
    cmp-long v8, v11, v13

    .line 98
    .line 99
    if-nez v8, :cond_2

    .line 100
    .line 101
    return v9

    .line 102
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_3
    iget v6, v0, LYg/d;->a:I

    .line 106
    .line 107
    new-array v6, v6, [S

    .line 108
    .line 109
    move v8, v3

    .line 110
    :goto_3
    iget v10, v0, LYg/d;->c:I

    .line 111
    .line 112
    shl-int v10, v5, v10

    .line 113
    .line 114
    if-ge v8, v10, :cond_4

    .line 115
    .line 116
    aget-wide v10, v7, v8

    .line 117
    .line 118
    iget v12, v0, LYg/d;->j:I

    .line 119
    .line 120
    int-to-long v12, v12

    .line 121
    and-long/2addr v10, v12

    .line 122
    long-to-int v10, v10

    .line 123
    int-to-short v10, v10

    .line 124
    aput-short v10, v2, v8

    .line 125
    .line 126
    add-int/lit8 v8, v8, 0x1

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_4
    move v7, v3

    .line 130
    :goto_4
    iget v8, v0, LYg/d;->a:I

    .line 131
    .line 132
    if-ge v7, v8, :cond_5

    .line 133
    .line 134
    aget-short v8, v2, v7

    .line 135
    .line 136
    iget v10, v0, LYg/d;->c:I

    .line 137
    .line 138
    invoke-static {v8, v10}, LYg/l;->a(SI)S

    .line 139
    .line 140
    .line 141
    move-result v8

    .line 142
    aput-short v8, v6, v7

    .line 143
    .line 144
    add-int/lit8 v7, v7, 0x1

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_5
    new-array v7, v8, [S

    .line 148
    .line 149
    invoke-direct {v0, v7, v4, v6}, LYg/d;->g([S[S[S)V

    .line 150
    .line 151
    .line 152
    move v4, v3

    .line 153
    :goto_5
    iget v8, v0, LYg/d;->a:I

    .line 154
    .line 155
    if-ge v4, v8, :cond_6

    .line 156
    .line 157
    iget-object v8, v0, LYg/d;->m:LYg/k;

    .line 158
    .line 159
    aget-short v10, v7, v4

    .line 160
    .line 161
    invoke-virtual {v8, v10}, LYg/k;->a(S)S

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    aput-short v8, v7, v4

    .line 166
    .line 167
    add-int/lit8 v4, v4, 0x1

    .line 168
    .line 169
    goto :goto_5

    .line 170
    :cond_6
    iget v4, v0, LYg/d;->f:I

    .line 171
    .line 172
    div-int/lit8 v8, v8, 0x8

    .line 173
    .line 174
    const/4 v10, 0x2

    .line 175
    new-array v10, v10, [I

    .line 176
    .line 177
    aput v8, v10, v5

    .line 178
    .line 179
    aput v4, v10, v3

    .line 180
    .line 181
    sget-object v4, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 182
    .line 183
    invoke-static {v4, v10}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    check-cast v4, [[B

    .line 188
    .line 189
    move v8, v3

    .line 190
    :goto_6
    iget v10, v0, LYg/d;->f:I

    .line 191
    .line 192
    if-ge v8, v10, :cond_8

    .line 193
    .line 194
    move v10, v3

    .line 195
    :goto_7
    iget v11, v0, LYg/d;->a:I

    .line 196
    .line 197
    div-int/lit8 v11, v11, 0x8

    .line 198
    .line 199
    if-ge v10, v11, :cond_7

    .line 200
    .line 201
    aget-object v11, v4, v8

    .line 202
    .line 203
    aput-byte v3, v11, v10

    .line 204
    .line 205
    add-int/lit8 v10, v10, 0x1

    .line 206
    .line 207
    goto :goto_7

    .line 208
    :cond_7
    add-int/lit8 v8, v8, 0x1

    .line 209
    .line 210
    goto :goto_6

    .line 211
    :cond_8
    move v8, v3

    .line 212
    :goto_8
    iget v10, v0, LYg/d;->b:I

    .line 213
    .line 214
    if-ge v8, v10, :cond_c

    .line 215
    .line 216
    move v10, v3

    .line 217
    :goto_9
    iget v11, v0, LYg/d;->a:I

    .line 218
    .line 219
    if-ge v10, v11, :cond_a

    .line 220
    .line 221
    move v11, v3

    .line 222
    :goto_a
    iget v12, v0, LYg/d;->c:I

    .line 223
    .line 224
    if-ge v11, v12, :cond_9

    .line 225
    .line 226
    add-int/lit8 v13, v10, 0x7

    .line 227
    .line 228
    aget-short v13, v7, v13

    .line 229
    .line 230
    ushr-int/2addr v13, v11

    .line 231
    and-int/2addr v13, v5

    .line 232
    int-to-byte v13, v13

    .line 233
    shl-int/2addr v13, v5

    .line 234
    int-to-byte v13, v13

    .line 235
    add-int/lit8 v14, v10, 0x6

    .line 236
    .line 237
    aget-short v14, v7, v14

    .line 238
    .line 239
    ushr-int/2addr v14, v11

    .line 240
    and-int/2addr v14, v5

    .line 241
    or-int/2addr v13, v14

    .line 242
    int-to-byte v13, v13

    .line 243
    shl-int/2addr v13, v5

    .line 244
    int-to-byte v13, v13

    .line 245
    add-int/lit8 v14, v10, 0x5

    .line 246
    .line 247
    aget-short v14, v7, v14

    .line 248
    .line 249
    ushr-int/2addr v14, v11

    .line 250
    and-int/2addr v14, v5

    .line 251
    or-int/2addr v13, v14

    .line 252
    int-to-byte v13, v13

    .line 253
    shl-int/2addr v13, v5

    .line 254
    int-to-byte v13, v13

    .line 255
    add-int/lit8 v14, v10, 0x4

    .line 256
    .line 257
    aget-short v14, v7, v14

    .line 258
    .line 259
    ushr-int/2addr v14, v11

    .line 260
    and-int/2addr v14, v5

    .line 261
    or-int/2addr v13, v14

    .line 262
    int-to-byte v13, v13

    .line 263
    shl-int/2addr v13, v5

    .line 264
    int-to-byte v13, v13

    .line 265
    add-int/lit8 v14, v10, 0x3

    .line 266
    .line 267
    aget-short v14, v7, v14

    .line 268
    .line 269
    ushr-int/2addr v14, v11

    .line 270
    and-int/2addr v14, v5

    .line 271
    or-int/2addr v13, v14

    .line 272
    int-to-byte v13, v13

    .line 273
    shl-int/2addr v13, v5

    .line 274
    int-to-byte v13, v13

    .line 275
    add-int/lit8 v14, v10, 0x2

    .line 276
    .line 277
    aget-short v14, v7, v14

    .line 278
    .line 279
    ushr-int/2addr v14, v11

    .line 280
    and-int/2addr v14, v5

    .line 281
    or-int/2addr v13, v14

    .line 282
    int-to-byte v13, v13

    .line 283
    shl-int/2addr v13, v5

    .line 284
    int-to-byte v13, v13

    .line 285
    add-int/lit8 v14, v10, 0x1

    .line 286
    .line 287
    aget-short v14, v7, v14

    .line 288
    .line 289
    ushr-int/2addr v14, v11

    .line 290
    and-int/2addr v14, v5

    .line 291
    or-int/2addr v13, v14

    .line 292
    int-to-byte v13, v13

    .line 293
    shl-int/2addr v13, v5

    .line 294
    int-to-byte v13, v13

    .line 295
    aget-short v14, v7, v10

    .line 296
    .line 297
    ushr-int/2addr v14, v11

    .line 298
    and-int/2addr v14, v5

    .line 299
    or-int/2addr v13, v14

    .line 300
    int-to-byte v13, v13

    .line 301
    mul-int/2addr v12, v8

    .line 302
    add-int/2addr v12, v11

    .line 303
    aget-object v12, v4, v12

    .line 304
    .line 305
    div-int/lit8 v14, v10, 0x8

    .line 306
    .line 307
    aput-byte v13, v12, v14

    .line 308
    .line 309
    add-int/lit8 v11, v11, 0x1

    .line 310
    .line 311
    goto :goto_a

    .line 312
    :cond_9
    add-int/lit8 v10, v10, 0x8

    .line 313
    .line 314
    goto :goto_9

    .line 315
    :cond_a
    move v10, v3

    .line 316
    :goto_b
    iget v11, v0, LYg/d;->a:I

    .line 317
    .line 318
    if-ge v10, v11, :cond_b

    .line 319
    .line 320
    iget-object v11, v0, LYg/d;->m:LYg/k;

    .line 321
    .line 322
    aget-short v12, v7, v10

    .line 323
    .line 324
    aget-short v13, v6, v10

    .line 325
    .line 326
    invoke-virtual {v11, v12, v13}, LYg/k;->b(SS)S

    .line 327
    .line 328
    .line 329
    move-result v11

    .line 330
    aput-short v11, v7, v10

    .line 331
    .line 332
    add-int/lit8 v10, v10, 0x1

    .line 333
    .line 334
    goto :goto_b

    .line 335
    :cond_b
    add-int/lit8 v8, v8, 0x1

    .line 336
    .line 337
    goto :goto_8

    .line 338
    :cond_c
    move v6, v3

    .line 339
    :goto_c
    iget v7, v0, LYg/d;->f:I

    .line 340
    .line 341
    if-ge v6, v7, :cond_14

    .line 342
    .line 343
    ushr-int/lit8 v8, v6, 0x3

    .line 344
    .line 345
    and-int/lit8 v10, v6, 0x7

    .line 346
    .line 347
    iget-boolean v11, v0, LYg/d;->q:Z

    .line 348
    .line 349
    if-eqz v11, :cond_d

    .line 350
    .line 351
    add-int/lit8 v7, v7, -0x20

    .line 352
    .line 353
    if-ne v6, v7, :cond_d

    .line 354
    .line 355
    move-object/from16 v11, p5

    .line 356
    .line 357
    invoke-direct {v0, v4, v2, v11}, LYg/d;->e([[B[S[J)I

    .line 358
    .line 359
    .line 360
    move-result v7

    .line 361
    if-eqz v7, :cond_e

    .line 362
    .line 363
    return v9

    .line 364
    :cond_d
    move-object/from16 v11, p5

    .line 365
    .line 366
    :cond_e
    add-int/lit8 v7, v6, 0x1

    .line 367
    .line 368
    move v12, v7

    .line 369
    :goto_d
    iget v13, v0, LYg/d;->f:I

    .line 370
    .line 371
    if-ge v12, v13, :cond_10

    .line 372
    .line 373
    aget-object v13, v4, v6

    .line 374
    .line 375
    aget-byte v13, v13, v8

    .line 376
    .line 377
    aget-object v14, v4, v12

    .line 378
    .line 379
    aget-byte v14, v14, v8

    .line 380
    .line 381
    xor-int/2addr v13, v14

    .line 382
    int-to-byte v13, v13

    .line 383
    shr-int/2addr v13, v10

    .line 384
    int-to-byte v13, v13

    .line 385
    and-int/2addr v13, v5

    .line 386
    int-to-byte v13, v13

    .line 387
    neg-int v13, v13

    .line 388
    int-to-byte v13, v13

    .line 389
    move v14, v3

    .line 390
    :goto_e
    iget v15, v0, LYg/d;->a:I

    .line 391
    .line 392
    div-int/lit8 v15, v15, 0x8

    .line 393
    .line 394
    if-ge v14, v15, :cond_f

    .line 395
    .line 396
    aget-object v15, v4, v6

    .line 397
    .line 398
    aget-byte v16, v15, v14

    .line 399
    .line 400
    aget-object v17, v4, v12

    .line 401
    .line 402
    aget-byte v17, v17, v14

    .line 403
    .line 404
    and-int v17, v17, v13

    .line 405
    .line 406
    move/from16 v18, v5

    .line 407
    .line 408
    xor-int v5, v16, v17

    .line 409
    .line 410
    int-to-byte v5, v5

    .line 411
    aput-byte v5, v15, v14

    .line 412
    .line 413
    add-int/lit8 v14, v14, 0x1

    .line 414
    .line 415
    move/from16 v5, v18

    .line 416
    .line 417
    goto :goto_e

    .line 418
    :cond_f
    move/from16 v18, v5

    .line 419
    .line 420
    add-int/lit8 v12, v12, 0x1

    .line 421
    .line 422
    goto :goto_d

    .line 423
    :cond_10
    move/from16 v18, v5

    .line 424
    .line 425
    aget-object v5, v4, v6

    .line 426
    .line 427
    aget-byte v5, v5, v8

    .line 428
    .line 429
    shr-int/2addr v5, v10

    .line 430
    and-int/lit8 v5, v5, 0x1

    .line 431
    .line 432
    if-nez v5, :cond_11

    .line 433
    .line 434
    return v9

    .line 435
    :cond_11
    move v5, v3

    .line 436
    :goto_f
    iget v12, v0, LYg/d;->f:I

    .line 437
    .line 438
    if-ge v5, v12, :cond_13

    .line 439
    .line 440
    if-eq v5, v6, :cond_12

    .line 441
    .line 442
    aget-object v12, v4, v5

    .line 443
    .line 444
    aget-byte v12, v12, v8

    .line 445
    .line 446
    shr-int/2addr v12, v10

    .line 447
    int-to-byte v12, v12

    .line 448
    and-int/lit8 v12, v12, 0x1

    .line 449
    .line 450
    int-to-byte v12, v12

    .line 451
    neg-int v12, v12

    .line 452
    int-to-byte v12, v12

    .line 453
    move v13, v3

    .line 454
    :goto_10
    iget v14, v0, LYg/d;->a:I

    .line 455
    .line 456
    div-int/lit8 v14, v14, 0x8

    .line 457
    .line 458
    if-ge v13, v14, :cond_12

    .line 459
    .line 460
    aget-object v14, v4, v5

    .line 461
    .line 462
    aget-byte v15, v14, v13

    .line 463
    .line 464
    aget-object v16, v4, v6

    .line 465
    .line 466
    aget-byte v16, v16, v13

    .line 467
    .line 468
    and-int v16, v16, v12

    .line 469
    .line 470
    xor-int v15, v15, v16

    .line 471
    .line 472
    int-to-byte v15, v15

    .line 473
    aput-byte v15, v14, v13

    .line 474
    .line 475
    add-int/lit8 v13, v13, 0x1

    .line 476
    .line 477
    goto :goto_10

    .line 478
    :cond_12
    add-int/lit8 v5, v5, 0x1

    .line 479
    .line 480
    goto :goto_f

    .line 481
    :cond_13
    move v6, v7

    .line 482
    move/from16 v5, v18

    .line 483
    .line 484
    goto/16 :goto_c

    .line 485
    .line 486
    :cond_14
    move/from16 v18, v5

    .line 487
    .line 488
    if-eqz v1, :cond_18

    .line 489
    .line 490
    iget-boolean v2, v0, LYg/d;->o:Z

    .line 491
    .line 492
    if-eqz v2, :cond_17

    .line 493
    .line 494
    rem-int/lit8 v2, v7, 0x8

    .line 495
    .line 496
    if-nez v2, :cond_15

    .line 497
    .line 498
    aget-object v2, v4, v8

    .line 499
    .line 500
    add-int/lit8 v7, v7, -0x1

    .line 501
    .line 502
    div-int/lit8 v7, v7, 0x8

    .line 503
    .line 504
    iget v4, v0, LYg/d;->a:I

    .line 505
    .line 506
    div-int/lit8 v4, v4, 0x8

    .line 507
    .line 508
    invoke-static {v2, v7, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 509
    .line 510
    .line 511
    goto :goto_14

    .line 512
    :cond_15
    move v5, v3

    .line 513
    move v6, v5

    .line 514
    :goto_11
    iget v7, v0, LYg/d;->f:I

    .line 515
    .line 516
    if-ge v5, v7, :cond_18

    .line 517
    .line 518
    add-int/lit8 v7, v7, -0x1

    .line 519
    .line 520
    div-int/lit8 v7, v7, 0x8

    .line 521
    .line 522
    :goto_12
    iget v8, v0, LYg/d;->a:I

    .line 523
    .line 524
    div-int/lit8 v8, v8, 0x8

    .line 525
    .line 526
    add-int/lit8 v8, v8, -0x1

    .line 527
    .line 528
    if-ge v7, v8, :cond_16

    .line 529
    .line 530
    add-int/lit8 v8, v6, 0x1

    .line 531
    .line 532
    aget-object v9, v4, v5

    .line 533
    .line 534
    aget-byte v10, v9, v7

    .line 535
    .line 536
    and-int/lit16 v10, v10, 0xff

    .line 537
    .line 538
    ushr-int/2addr v10, v2

    .line 539
    add-int/lit8 v7, v7, 0x1

    .line 540
    .line 541
    aget-byte v9, v9, v7

    .line 542
    .line 543
    rsub-int/lit8 v11, v2, 0x8

    .line 544
    .line 545
    shl-int/2addr v9, v11

    .line 546
    or-int/2addr v9, v10

    .line 547
    int-to-byte v9, v9

    .line 548
    aput-byte v9, v1, v6

    .line 549
    .line 550
    move v6, v8

    .line 551
    goto :goto_12

    .line 552
    :cond_16
    add-int/lit8 v8, v6, 0x1

    .line 553
    .line 554
    aget-object v9, v4, v5

    .line 555
    .line 556
    aget-byte v7, v9, v7

    .line 557
    .line 558
    and-int/lit16 v7, v7, 0xff

    .line 559
    .line 560
    ushr-int/2addr v7, v2

    .line 561
    int-to-byte v7, v7

    .line 562
    aput-byte v7, v1, v6

    .line 563
    .line 564
    add-int/lit8 v5, v5, 0x1

    .line 565
    .line 566
    move v6, v8

    .line 567
    goto :goto_11

    .line 568
    :cond_17
    iget v2, v0, LYg/d;->a:I

    .line 569
    .line 570
    sub-int/2addr v2, v7

    .line 571
    add-int/lit8 v2, v2, 0x7

    .line 572
    .line 573
    div-int/lit8 v2, v2, 0x8

    .line 574
    .line 575
    move v5, v3

    .line 576
    :goto_13
    iget v6, v0, LYg/d;->f:I

    .line 577
    .line 578
    if-ge v5, v6, :cond_18

    .line 579
    .line 580
    aget-object v7, v4, v5

    .line 581
    .line 582
    div-int/lit8 v6, v6, 0x8

    .line 583
    .line 584
    mul-int v8, v2, v5

    .line 585
    .line 586
    invoke-static {v7, v6, v1, v8, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 587
    .line 588
    .line 589
    add-int/lit8 v5, v5, 0x1

    .line 590
    .line 591
    goto :goto_13

    .line 592
    :cond_18
    :goto_14
    return v3
.end method

.method private g([S[S[S)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget v1, p0, LYg/d;->a:I

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    aget-short v1, p3, v0

    .line 7
    .line 8
    invoke-direct {p0, p2, v1}, LYg/d;->b([SS)S

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    aput-short v1, p1, v0

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    return-void
.end method

.method private static h(SS)J
    .locals 2

    .line 1
    xor-int/2addr p0, p1

    .line 2
    int-to-long p0, p0

    .line 3
    const-wide/16 v0, 0x1

    .line 4
    .line 5
    sub-long/2addr p0, v0

    .line 6
    const/16 v0, 0x3f

    .line 7
    .line 8
    ushr-long/2addr p0, v0

    .line 9
    neg-long p0, p0

    .line 10
    return-wide p0
.end method

.method private static i([JII)V
    .locals 18

    .line 1
    sub-int v0, p2, p1

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    goto/16 :goto_6

    .line 7
    .line 8
    :cond_0
    const/4 v1, 0x1

    .line 9
    :goto_0
    sub-int v2, v0, v1

    .line 10
    .line 11
    if-ge v1, v2, :cond_1

    .line 12
    .line 13
    add-int/2addr v1, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    move v2, v1

    .line 16
    :goto_1
    if-lez v2, :cond_8

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    move v4, v3

    .line 20
    :goto_2
    sub-int v5, v0, v2

    .line 21
    .line 22
    const/16 v6, 0x3f

    .line 23
    .line 24
    if-ge v4, v5, :cond_3

    .line 25
    .line 26
    and-int v5, v4, v2

    .line 27
    .line 28
    if-nez v5, :cond_2

    .line 29
    .line 30
    add-int v5, p1, v4

    .line 31
    .line 32
    add-int v7, v5, v2

    .line 33
    .line 34
    aget-wide v8, p0, v7

    .line 35
    .line 36
    aget-wide v10, p0, v5

    .line 37
    .line 38
    sub-long v12, v8, v10

    .line 39
    .line 40
    ushr-long/2addr v12, v6

    .line 41
    neg-long v12, v12

    .line 42
    xor-long/2addr v8, v10

    .line 43
    and-long/2addr v8, v12

    .line 44
    xor-long/2addr v10, v8

    .line 45
    aput-wide v10, p0, v5

    .line 46
    .line 47
    aget-wide v5, p0, v7

    .line 48
    .line 49
    xor-long/2addr v5, v8

    .line 50
    aput-wide v5, p0, v7

    .line 51
    .line 52
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_3
    move v4, v1

    .line 56
    :goto_3
    if-le v4, v2, :cond_7

    .line 57
    .line 58
    :goto_4
    sub-int v5, v0, v4

    .line 59
    .line 60
    if-ge v3, v5, :cond_6

    .line 61
    .line 62
    and-int v5, v3, v2

    .line 63
    .line 64
    if-nez v5, :cond_5

    .line 65
    .line 66
    add-int v5, p1, v3

    .line 67
    .line 68
    add-int v7, v5, v2

    .line 69
    .line 70
    aget-wide v8, p0, v7

    .line 71
    .line 72
    move v10, v4

    .line 73
    :goto_5
    if-le v10, v2, :cond_4

    .line 74
    .line 75
    add-int v11, v5, v10

    .line 76
    .line 77
    aget-wide v12, p0, v11

    .line 78
    .line 79
    sub-long v14, v12, v8

    .line 80
    .line 81
    ushr-long/2addr v14, v6

    .line 82
    neg-long v14, v14

    .line 83
    xor-long v16, v8, v12

    .line 84
    .line 85
    and-long v14, v14, v16

    .line 86
    .line 87
    xor-long/2addr v8, v14

    .line 88
    xor-long/2addr v12, v14

    .line 89
    aput-wide v12, p0, v11

    .line 90
    .line 91
    ushr-int/lit8 v10, v10, 0x1

    .line 92
    .line 93
    goto :goto_5

    .line 94
    :cond_4
    aput-wide v8, p0, v7

    .line 95
    .line 96
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_6
    ushr-int/lit8 v4, v4, 0x1

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_7
    ushr-int/lit8 v2, v2, 0x1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_8
    :goto_6
    return-void
.end method


# virtual methods
.method public c([B)[B
    .locals 11

    .line 1
    invoke-virtual {p0}, LYg/d;->d()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-array v2, v0, [B

    .line 6
    .line 7
    iget v0, p0, LYg/d;->c:I

    .line 8
    .line 9
    const/4 v7, 0x1

    .line 10
    shl-int v1, v7, v0

    .line 11
    .line 12
    new-array v5, v1, [S

    .line 13
    .line 14
    new-array v6, v7, [J

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const-wide/16 v3, 0x0

    .line 18
    .line 19
    aput-wide v3, v6, v1

    .line 20
    .line 21
    shl-int v3, v7, v0

    .line 22
    .line 23
    new-array v4, v3, [I

    .line 24
    .line 25
    iget v3, p0, LYg/d;->a:I

    .line 26
    .line 27
    div-int/lit8 v3, v3, 0x8

    .line 28
    .line 29
    shl-int v8, v7, v0

    .line 30
    .line 31
    mul-int/lit8 v8, v8, 0x4

    .line 32
    .line 33
    add-int/2addr v3, v8

    .line 34
    new-array v8, v3, [B

    .line 35
    .line 36
    add-int/lit8 v9, v3, -0x20

    .line 37
    .line 38
    iget v10, p0, LYg/d;->d:I

    .line 39
    .line 40
    sub-int/2addr v9, v10

    .line 41
    shl-int v0, v7, v0

    .line 42
    .line 43
    mul-int/lit8 v0, v0, 0x4

    .line 44
    .line 45
    sub-int/2addr v9, v0

    .line 46
    new-instance v0, LHg/h;

    .line 47
    .line 48
    const/16 v10, 0x100

    .line 49
    .line 50
    invoke-direct {v0, v10}, LHg/h;-><init>(I)V

    .line 51
    .line 52
    .line 53
    const/16 v10, 0x40

    .line 54
    .line 55
    invoke-interface {v0, v10}, LFg/j;->b(B)V

    .line 56
    .line 57
    .line 58
    const/16 v10, 0x20

    .line 59
    .line 60
    invoke-interface {v0, p1, v1, v10}, LFg/j;->update([BII)V

    .line 61
    .line 62
    .line 63
    invoke-interface {v0, v8, v1, v3}, LFg/q;->e([BII)I

    .line 64
    .line 65
    .line 66
    :goto_0
    iget v0, p0, LYg/d;->c:I

    .line 67
    .line 68
    shl-int v0, v7, v0

    .line 69
    .line 70
    if-ge v1, v0, :cond_0

    .line 71
    .line 72
    mul-int/lit8 v0, v1, 0x4

    .line 73
    .line 74
    add-int/2addr v0, v9

    .line 75
    invoke-static {v8, v0}, LYg/l;->b([BI)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    aput v0, v4, v1

    .line 80
    .line 81
    add-int/lit8 v1, v1, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    move-object v1, p0

    .line 85
    move-object v3, p1

    .line 86
    invoke-direct/range {v1 .. v6}, LYg/d;->f([B[B[I[S[J)I

    .line 87
    .line 88
    .line 89
    return-object v2
.end method

.method public d()I
    .locals 3

    .line 1
    iget-boolean v0, p0, LYg/d;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, LYg/d;->f:I

    .line 6
    .line 7
    iget v1, p0, LYg/d;->a:I

    .line 8
    .line 9
    div-int/lit8 v1, v1, 0x8

    .line 10
    .line 11
    add-int/lit8 v2, v0, -0x1

    .line 12
    .line 13
    div-int/lit8 v2, v2, 0x8

    .line 14
    .line 15
    sub-int/2addr v1, v2

    .line 16
    mul-int/2addr v0, v1

    .line 17
    return v0

    .line 18
    :cond_0
    iget v0, p0, LYg/d;->f:I

    .line 19
    .line 20
    iget v1, p0, LYg/d;->g:I

    .line 21
    .line 22
    mul-int/2addr v0, v1

    .line 23
    div-int/lit8 v0, v0, 0x8

    .line 24
    .line 25
    return v0
.end method
