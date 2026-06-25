.class public abstract LU2/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU2/c$b;,
        LU2/c$c;
    }
.end annotation


# static fields
.field private static final a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0xe

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LU2/c;->a:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        0x7d2
        0x7d0
        0x780
        0x641
        0x640
        0x3e9
        0x3e8
        0x3c0
        0x320
        0x320
        0x1e0
        0x190
        0x190
        0x800
    .end array-data
.end method

.method private static a(III)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    filled-new-array {p0, p1, p2}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string p1, "ac-4.%02d.%02d.%02d"

    .line 18
    .line 19
    invoke-static {p1, p0}, Lt2/a0;->I(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public static b(ILt2/I;)V
    .locals 2

    .line 1
    const/4 v0, 0x7

    .line 2
    invoke-virtual {p1, v0}, Lt2/I;->X(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lt2/I;->f()[B

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    const/16 v1, -0x54

    .line 11
    .line 12
    aput-byte v1, p1, v0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    const/16 v1, 0x40

    .line 16
    .line 17
    aput-byte v1, p1, v0

    .line 18
    .line 19
    const/4 v0, 0x2

    .line 20
    const/4 v1, -0x1

    .line 21
    aput-byte v1, p1, v0

    .line 22
    .line 23
    const/4 v0, 0x3

    .line 24
    aput-byte v1, p1, v0

    .line 25
    .line 26
    shr-int/lit8 v0, p0, 0x10

    .line 27
    .line 28
    and-int/lit16 v0, v0, 0xff

    .line 29
    .line 30
    int-to-byte v0, v0

    .line 31
    const/4 v1, 0x4

    .line 32
    aput-byte v0, p1, v1

    .line 33
    .line 34
    shr-int/lit8 v0, p0, 0x8

    .line 35
    .line 36
    and-int/lit16 v0, v0, 0xff

    .line 37
    .line 38
    int-to-byte v0, v0

    .line 39
    const/4 v1, 0x5

    .line 40
    aput-byte v0, p1, v1

    .line 41
    .line 42
    and-int/lit16 p0, p0, 0xff

    .line 43
    .line 44
    int-to-byte p0, p0

    .line 45
    const/4 v0, 0x6

    .line 46
    aput-byte p0, p1, v0

    .line 47
    .line 48
    return-void
.end method

.method private static c(IZI)I
    .locals 2

    .line 1
    invoke-static {p0}, LU2/c;->d(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0xb

    .line 6
    .line 7
    if-eq p0, v1, :cond_1

    .line 8
    .line 9
    const/16 v1, 0xc

    .line 10
    .line 11
    if-eq p0, v1, :cond_1

    .line 12
    .line 13
    const/16 v1, 0xd

    .line 14
    .line 15
    if-eq p0, v1, :cond_1

    .line 16
    .line 17
    const/16 v1, 0xe

    .line 18
    .line 19
    if-ne p0, v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return v0

    .line 23
    :cond_1
    :goto_0
    if-nez p1, :cond_2

    .line 24
    .line 25
    add-int/lit8 v0, v0, -0x2

    .line 26
    .line 27
    :cond_2
    if-eqz p2, :cond_4

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    if-eq p2, p0, :cond_3

    .line 31
    .line 32
    return v0

    .line 33
    :cond_3
    add-int/lit8 v0, v0, -0x2

    .line 34
    .line 35
    return v0

    .line 36
    :cond_4
    add-int/lit8 v0, v0, -0x4

    .line 37
    .line 38
    return v0
.end method

.method private static d(I)I
    .locals 0

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const/4 p0, -0x1

    .line 5
    return p0

    .line 6
    :pswitch_0
    const/16 p0, 0x18

    .line 7
    .line 8
    return p0

    .line 9
    :pswitch_1
    const/16 p0, 0xe

    .line 10
    .line 11
    return p0

    .line 12
    :pswitch_2
    const/16 p0, 0xd

    .line 13
    .line 14
    return p0

    .line 15
    :pswitch_3
    const/16 p0, 0xc

    .line 16
    .line 17
    return p0

    .line 18
    :pswitch_4
    const/16 p0, 0xb

    .line 19
    .line 20
    return p0

    .line 21
    :pswitch_5
    const/16 p0, 0x8

    .line 22
    .line 23
    return p0

    .line 24
    :pswitch_6
    const/4 p0, 0x7

    .line 25
    return p0

    .line 26
    :pswitch_7
    const/4 p0, 0x6

    .line 27
    return p0

    .line 28
    :pswitch_8
    const/4 p0, 0x5

    .line 29
    return p0

    .line 30
    :pswitch_9
    const/4 p0, 0x3

    .line 31
    return p0

    .line 32
    :pswitch_a
    const/4 p0, 0x2

    .line 33
    return p0

    .line 34
    :pswitch_b
    const/4 p0, 0x1

    .line 35
    return p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static e(Lt2/I;Ljava/lang/String;Ljava/lang/String;Lq2/q;)Lq2/x;
    .locals 20

    .line 1
    new-instance v0, Lt2/H;

    .line 2
    .line 3
    invoke-direct {v0}, Lt2/H;-><init>()V

    .line 4
    .line 5
    .line 6
    move-object/from16 v1, p0

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lt2/H;->m(Lt2/I;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lt2/H;->b()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x3

    .line 16
    invoke-virtual {v0, v2}, Lt2/H;->h(I)I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/4 v4, 0x1

    .line 21
    if-gt v3, v4, :cond_32

    .line 22
    .line 23
    const/4 v5, 0x7

    .line 24
    invoke-virtual {v0, v5}, Lt2/H;->h(I)I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    invoke-virtual {v0}, Lt2/H;->g()Z

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    if-eqz v7, :cond_0

    .line 33
    .line 34
    const v7, 0xbb80

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const v7, 0xac44

    .line 39
    .line 40
    .line 41
    :goto_0
    const/4 v8, 0x4

    .line 42
    invoke-virtual {v0, v8}, Lt2/H;->r(I)V

    .line 43
    .line 44
    .line 45
    const/16 v9, 0x9

    .line 46
    .line 47
    invoke-virtual {v0, v9}, Lt2/H;->h(I)I

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    const/16 v10, 0x10

    .line 52
    .line 53
    if-le v6, v4, :cond_2

    .line 54
    .line 55
    if-eqz v3, :cond_1

    .line 56
    .line 57
    invoke-virtual {v0}, Lt2/H;->g()Z

    .line 58
    .line 59
    .line 60
    move-result v11

    .line 61
    if-eqz v11, :cond_2

    .line 62
    .line 63
    invoke-virtual {v0, v10}, Lt2/H;->r(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Lt2/H;->g()Z

    .line 67
    .line 68
    .line 69
    move-result v11

    .line 70
    if-eqz v11, :cond_2

    .line 71
    .line 72
    const/16 v11, 0x80

    .line 73
    .line 74
    invoke-virtual {v0, v11}, Lt2/H;->r(I)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    const-string v1, "Invalid AC-4 DSI version: "

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-static {v0}, Lq2/L;->d(Ljava/lang/String;)Lq2/L;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    throw v0

    .line 100
    :cond_2
    :goto_1
    if-ne v3, v4, :cond_4

    .line 101
    .line 102
    invoke-static {v0}, LU2/c;->l(Lt2/H;)Z

    .line 103
    .line 104
    .line 105
    move-result v11

    .line 106
    if-eqz v11, :cond_3

    .line 107
    .line 108
    invoke-virtual {v0}, Lt2/H;->c()V

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_3
    const-string v0, "Invalid AC-4 DSI bitrate."

    .line 113
    .line 114
    invoke-static {v0}, Lq2/L;->d(Ljava/lang/String;)Lq2/L;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    throw v0

    .line 119
    :cond_4
    :goto_2
    new-instance v11, LU2/c$b;

    .line 120
    .line 121
    const/4 v12, 0x0

    .line 122
    invoke-direct {v11, v12}, LU2/c$b;-><init>(LU2/c$a;)V

    .line 123
    .line 124
    .line 125
    const/4 v13, 0x0

    .line 126
    :goto_3
    const/4 v15, 0x6

    .line 127
    const/16 v12, 0x8

    .line 128
    .line 129
    const/4 v5, 0x2

    .line 130
    if-ge v13, v9, :cond_27

    .line 131
    .line 132
    const/4 v8, 0x5

    .line 133
    if-nez v3, :cond_5

    .line 134
    .line 135
    invoke-virtual {v0}, Lt2/H;->g()Z

    .line 136
    .line 137
    .line 138
    move-result v9

    .line 139
    invoke-virtual {v0, v8}, Lt2/H;->h(I)I

    .line 140
    .line 141
    .line 142
    move-result v16

    .line 143
    invoke-virtual {v0, v8}, Lt2/H;->h(I)I

    .line 144
    .line 145
    .line 146
    move-result v17

    .line 147
    move/from16 v18, v12

    .line 148
    .line 149
    move/from16 v14, v16

    .line 150
    .line 151
    move/from16 v5, v17

    .line 152
    .line 153
    const/4 v4, 0x0

    .line 154
    const/4 v10, 0x0

    .line 155
    const/4 v12, 0x0

    .line 156
    goto :goto_5

    .line 157
    :cond_5
    invoke-virtual {v0, v12}, Lt2/H;->h(I)I

    .line 158
    .line 159
    .line 160
    move-result v14

    .line 161
    invoke-virtual {v0, v12}, Lt2/H;->h(I)I

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    move/from16 v18, v12

    .line 166
    .line 167
    const/16 v12, 0xff

    .line 168
    .line 169
    if-ne v4, v12, :cond_6

    .line 170
    .line 171
    invoke-virtual {v0, v10}, Lt2/H;->h(I)I

    .line 172
    .line 173
    .line 174
    move-result v12

    .line 175
    add-int/2addr v4, v12

    .line 176
    :cond_6
    if-le v14, v5, :cond_7

    .line 177
    .line 178
    mul-int/lit8 v4, v4, 0x8

    .line 179
    .line 180
    invoke-virtual {v0, v4}, Lt2/H;->r(I)V

    .line 181
    .line 182
    .line 183
    add-int/lit8 v13, v13, 0x1

    .line 184
    .line 185
    const/4 v4, 0x1

    .line 186
    const/4 v5, 0x7

    .line 187
    const/4 v8, 0x4

    .line 188
    goto :goto_3

    .line 189
    :cond_7
    invoke-virtual {v0}, Lt2/H;->b()I

    .line 190
    .line 191
    .line 192
    move-result v9

    .line 193
    sub-int v9, v1, v9

    .line 194
    .line 195
    div-int/lit8 v9, v9, 0x8

    .line 196
    .line 197
    invoke-virtual {v0, v8}, Lt2/H;->h(I)I

    .line 198
    .line 199
    .line 200
    move-result v12

    .line 201
    const/16 v10, 0x1f

    .line 202
    .line 203
    if-ne v12, v10, :cond_8

    .line 204
    .line 205
    const/4 v10, 0x1

    .line 206
    goto :goto_4

    .line 207
    :cond_8
    const/4 v10, 0x0

    .line 208
    :goto_4
    move v5, v14

    .line 209
    move v14, v12

    .line 210
    move v12, v10

    .line 211
    move v10, v9

    .line 212
    const/4 v9, 0x0

    .line 213
    :goto_5
    iput v5, v11, LU2/c$b;->f:I

    .line 214
    .line 215
    const/16 v8, 0xf

    .line 216
    .line 217
    if-nez v9, :cond_9

    .line 218
    .line 219
    if-nez v12, :cond_9

    .line 220
    .line 221
    if-ne v14, v15, :cond_9

    .line 222
    .line 223
    const/4 v2, 0x1

    .line 224
    goto/16 :goto_14

    .line 225
    .line 226
    :cond_9
    invoke-virtual {v0, v2}, Lt2/H;->h(I)I

    .line 227
    .line 228
    .line 229
    move-result v15

    .line 230
    iput v15, v11, LU2/c$b;->g:I

    .line 231
    .line 232
    invoke-virtual {v0}, Lt2/H;->g()Z

    .line 233
    .line 234
    .line 235
    move-result v15

    .line 236
    if-eqz v15, :cond_a

    .line 237
    .line 238
    const/4 v15, 0x5

    .line 239
    invoke-virtual {v0, v15}, Lt2/H;->r(I)V

    .line 240
    .line 241
    .line 242
    :cond_a
    const/4 v15, 0x2

    .line 243
    invoke-virtual {v0, v15}, Lt2/H;->r(I)V

    .line 244
    .line 245
    .line 246
    const/4 v2, 0x1

    .line 247
    if-ne v3, v2, :cond_b

    .line 248
    .line 249
    if-eq v5, v2, :cond_c

    .line 250
    .line 251
    if-ne v5, v15, :cond_b

    .line 252
    .line 253
    goto :goto_7

    .line 254
    :cond_b
    :goto_6
    const/4 v15, 0x5

    .line 255
    goto :goto_8

    .line 256
    :cond_c
    :goto_7
    invoke-virtual {v0, v15}, Lt2/H;->r(I)V

    .line 257
    .line 258
    .line 259
    goto :goto_6

    .line 260
    :goto_8
    invoke-virtual {v0, v15}, Lt2/H;->r(I)V

    .line 261
    .line 262
    .line 263
    const/16 v15, 0xa

    .line 264
    .line 265
    invoke-virtual {v0, v15}, Lt2/H;->r(I)V

    .line 266
    .line 267
    .line 268
    if-ne v3, v2, :cond_15

    .line 269
    .line 270
    if-lez v5, :cond_d

    .line 271
    .line 272
    invoke-virtual {v0}, Lt2/H;->g()Z

    .line 273
    .line 274
    .line 275
    move-result v15

    .line 276
    iput-boolean v15, v11, LU2/c$b;->a:Z

    .line 277
    .line 278
    :cond_d
    iget-boolean v15, v11, LU2/c$b;->a:Z

    .line 279
    .line 280
    if-eqz v15, :cond_12

    .line 281
    .line 282
    if-eq v5, v2, :cond_e

    .line 283
    .line 284
    const/4 v15, 0x2

    .line 285
    if-ne v5, v15, :cond_11

    .line 286
    .line 287
    :cond_e
    const/4 v15, 0x5

    .line 288
    invoke-virtual {v0, v15}, Lt2/H;->h(I)I

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    if-ltz v2, :cond_f

    .line 293
    .line 294
    if-gt v2, v8, :cond_f

    .line 295
    .line 296
    iput v2, v11, LU2/c$b;->b:I

    .line 297
    .line 298
    :cond_f
    const/16 v15, 0xb

    .line 299
    .line 300
    if-lt v2, v15, :cond_10

    .line 301
    .line 302
    const/16 v15, 0xe

    .line 303
    .line 304
    if-gt v2, v15, :cond_10

    .line 305
    .line 306
    invoke-virtual {v0}, Lt2/H;->g()Z

    .line 307
    .line 308
    .line 309
    move-result v2

    .line 310
    iput-boolean v2, v11, LU2/c$b;->d:Z

    .line 311
    .line 312
    const/4 v15, 0x2

    .line 313
    invoke-virtual {v0, v15}, Lt2/H;->h(I)I

    .line 314
    .line 315
    .line 316
    move-result v2

    .line 317
    iput v2, v11, LU2/c$b;->e:I

    .line 318
    .line 319
    goto :goto_9

    .line 320
    :cond_10
    const/4 v15, 0x2

    .line 321
    :cond_11
    :goto_9
    const/16 v2, 0x18

    .line 322
    .line 323
    invoke-virtual {v0, v2}, Lt2/H;->r(I)V

    .line 324
    .line 325
    .line 326
    const/4 v2, 0x1

    .line 327
    goto :goto_a

    .line 328
    :cond_12
    const/4 v15, 0x2

    .line 329
    :goto_a
    if-eq v5, v2, :cond_13

    .line 330
    .line 331
    if-ne v5, v15, :cond_15

    .line 332
    .line 333
    :cond_13
    invoke-virtual {v0}, Lt2/H;->g()Z

    .line 334
    .line 335
    .line 336
    move-result v2

    .line 337
    if-eqz v2, :cond_14

    .line 338
    .line 339
    invoke-virtual {v0}, Lt2/H;->g()Z

    .line 340
    .line 341
    .line 342
    move-result v2

    .line 343
    if-eqz v2, :cond_14

    .line 344
    .line 345
    invoke-virtual {v0, v15}, Lt2/H;->r(I)V

    .line 346
    .line 347
    .line 348
    :cond_14
    invoke-virtual {v0}, Lt2/H;->g()Z

    .line 349
    .line 350
    .line 351
    move-result v2

    .line 352
    if-eqz v2, :cond_15

    .line 353
    .line 354
    invoke-virtual {v0}, Lt2/H;->q()V

    .line 355
    .line 356
    .line 357
    move/from16 v2, v18

    .line 358
    .line 359
    invoke-virtual {v0, v2}, Lt2/H;->h(I)I

    .line 360
    .line 361
    .line 362
    move-result v15

    .line 363
    const/4 v8, 0x0

    .line 364
    :goto_b
    if-ge v8, v15, :cond_15

    .line 365
    .line 366
    invoke-virtual {v0, v2}, Lt2/H;->r(I)V

    .line 367
    .line 368
    .line 369
    add-int/lit8 v8, v8, 0x1

    .line 370
    .line 371
    const/16 v2, 0x8

    .line 372
    .line 373
    goto :goto_b

    .line 374
    :cond_15
    if-nez v9, :cond_1d

    .line 375
    .line 376
    if-eqz v12, :cond_16

    .line 377
    .line 378
    goto/16 :goto_12

    .line 379
    .line 380
    :cond_16
    invoke-virtual {v0}, Lt2/H;->q()V

    .line 381
    .line 382
    .line 383
    if-eqz v14, :cond_1b

    .line 384
    .line 385
    const/4 v2, 0x1

    .line 386
    if-eq v14, v2, :cond_1b

    .line 387
    .line 388
    const/4 v15, 0x2

    .line 389
    if-eq v14, v15, :cond_1b

    .line 390
    .line 391
    const/4 v2, 0x3

    .line 392
    if-eq v14, v2, :cond_19

    .line 393
    .line 394
    const/4 v2, 0x4

    .line 395
    if-eq v14, v2, :cond_19

    .line 396
    .line 397
    const/4 v15, 0x5

    .line 398
    if-eq v14, v15, :cond_17

    .line 399
    .line 400
    const/4 v2, 0x7

    .line 401
    invoke-virtual {v0, v2}, Lt2/H;->h(I)I

    .line 402
    .line 403
    .line 404
    move-result v8

    .line 405
    const/4 v2, 0x0

    .line 406
    :goto_c
    if-ge v2, v8, :cond_1f

    .line 407
    .line 408
    const/16 v9, 0x8

    .line 409
    .line 410
    invoke-virtual {v0, v9}, Lt2/H;->r(I)V

    .line 411
    .line 412
    .line 413
    add-int/lit8 v2, v2, 0x1

    .line 414
    .line 415
    goto :goto_c

    .line 416
    :cond_17
    if-nez v5, :cond_18

    .line 417
    .line 418
    invoke-static {v0, v11}, LU2/c;->i(Lt2/H;LU2/c$b;)V

    .line 419
    .line 420
    .line 421
    goto :goto_13

    .line 422
    :cond_18
    const/4 v2, 0x3

    .line 423
    invoke-virtual {v0, v2}, Lt2/H;->h(I)I

    .line 424
    .line 425
    .line 426
    move-result v8

    .line 427
    const/4 v2, 0x0

    .line 428
    :goto_d
    const/16 v19, 0x2

    .line 429
    .line 430
    add-int/lit8 v9, v8, 0x2

    .line 431
    .line 432
    if-ge v2, v9, :cond_1f

    .line 433
    .line 434
    invoke-static {v0, v11}, LU2/c;->j(Lt2/H;LU2/c$b;)V

    .line 435
    .line 436
    .line 437
    add-int/lit8 v2, v2, 0x1

    .line 438
    .line 439
    goto :goto_d

    .line 440
    :cond_19
    if-nez v5, :cond_1a

    .line 441
    .line 442
    const/4 v2, 0x0

    .line 443
    const/4 v8, 0x3

    .line 444
    :goto_e
    if-ge v2, v8, :cond_1f

    .line 445
    .line 446
    invoke-static {v0, v11}, LU2/c;->i(Lt2/H;LU2/c$b;)V

    .line 447
    .line 448
    .line 449
    add-int/lit8 v2, v2, 0x1

    .line 450
    .line 451
    goto :goto_e

    .line 452
    :cond_1a
    const/4 v2, 0x0

    .line 453
    :goto_f
    const/4 v8, 0x3

    .line 454
    if-ge v2, v8, :cond_1f

    .line 455
    .line 456
    invoke-static {v0, v11}, LU2/c;->j(Lt2/H;LU2/c$b;)V

    .line 457
    .line 458
    .line 459
    add-int/lit8 v2, v2, 0x1

    .line 460
    .line 461
    goto :goto_f

    .line 462
    :cond_1b
    if-nez v5, :cond_1c

    .line 463
    .line 464
    const/4 v2, 0x0

    .line 465
    const/4 v15, 0x2

    .line 466
    :goto_10
    if-ge v2, v15, :cond_1f

    .line 467
    .line 468
    invoke-static {v0, v11}, LU2/c;->i(Lt2/H;LU2/c$b;)V

    .line 469
    .line 470
    .line 471
    add-int/lit8 v2, v2, 0x1

    .line 472
    .line 473
    goto :goto_10

    .line 474
    :cond_1c
    const/4 v2, 0x0

    .line 475
    :goto_11
    const/4 v15, 0x2

    .line 476
    if-ge v2, v15, :cond_1f

    .line 477
    .line 478
    invoke-static {v0, v11}, LU2/c;->j(Lt2/H;LU2/c$b;)V

    .line 479
    .line 480
    .line 481
    add-int/lit8 v2, v2, 0x1

    .line 482
    .line 483
    goto :goto_11

    .line 484
    :cond_1d
    :goto_12
    if-nez v5, :cond_1e

    .line 485
    .line 486
    invoke-static {v0, v11}, LU2/c;->i(Lt2/H;LU2/c$b;)V

    .line 487
    .line 488
    .line 489
    goto :goto_13

    .line 490
    :cond_1e
    invoke-static {v0, v11}, LU2/c;->j(Lt2/H;LU2/c$b;)V

    .line 491
    .line 492
    .line 493
    :cond_1f
    :goto_13
    invoke-virtual {v0}, Lt2/H;->q()V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v0}, Lt2/H;->g()Z

    .line 497
    .line 498
    .line 499
    move-result v2

    .line 500
    :goto_14
    if-eqz v2, :cond_20

    .line 501
    .line 502
    const/4 v2, 0x7

    .line 503
    invoke-virtual {v0, v2}, Lt2/H;->h(I)I

    .line 504
    .line 505
    .line 506
    move-result v2

    .line 507
    const/4 v8, 0x0

    .line 508
    :goto_15
    if-ge v8, v2, :cond_20

    .line 509
    .line 510
    const/16 v9, 0xf

    .line 511
    .line 512
    invoke-virtual {v0, v9}, Lt2/H;->r(I)V

    .line 513
    .line 514
    .line 515
    add-int/lit8 v8, v8, 0x1

    .line 516
    .line 517
    goto :goto_15

    .line 518
    :cond_20
    if-lez v5, :cond_23

    .line 519
    .line 520
    invoke-virtual {v0}, Lt2/H;->g()Z

    .line 521
    .line 522
    .line 523
    move-result v2

    .line 524
    if-eqz v2, :cond_22

    .line 525
    .line 526
    invoke-static {v0}, LU2/c;->l(Lt2/H;)Z

    .line 527
    .line 528
    .line 529
    move-result v2

    .line 530
    if-eqz v2, :cond_21

    .line 531
    .line 532
    goto :goto_16

    .line 533
    :cond_21
    const-string v0, "Can\'t parse bitrate DSI."

    .line 534
    .line 535
    invoke-static {v0}, Lq2/L;->d(Ljava/lang/String;)Lq2/L;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    throw v0

    .line 540
    :cond_22
    :goto_16
    invoke-virtual {v0}, Lt2/H;->g()Z

    .line 541
    .line 542
    .line 543
    move-result v2

    .line 544
    if-eqz v2, :cond_23

    .line 545
    .line 546
    invoke-virtual {v0}, Lt2/H;->c()V

    .line 547
    .line 548
    .line 549
    const/16 v2, 0x10

    .line 550
    .line 551
    invoke-virtual {v0, v2}, Lt2/H;->h(I)I

    .line 552
    .line 553
    .line 554
    move-result v2

    .line 555
    invoke-virtual {v0, v2}, Lt2/H;->s(I)V

    .line 556
    .line 557
    .line 558
    const/4 v15, 0x5

    .line 559
    invoke-virtual {v0, v15}, Lt2/H;->h(I)I

    .line 560
    .line 561
    .line 562
    move-result v2

    .line 563
    const/4 v12, 0x0

    .line 564
    :goto_17
    if-ge v12, v2, :cond_23

    .line 565
    .line 566
    const/4 v8, 0x3

    .line 567
    invoke-virtual {v0, v8}, Lt2/H;->r(I)V

    .line 568
    .line 569
    .line 570
    const/16 v9, 0x8

    .line 571
    .line 572
    invoke-virtual {v0, v9}, Lt2/H;->r(I)V

    .line 573
    .line 574
    .line 575
    add-int/lit8 v12, v12, 0x1

    .line 576
    .line 577
    goto :goto_17

    .line 578
    :cond_23
    const/16 v9, 0x8

    .line 579
    .line 580
    invoke-virtual {v0}, Lt2/H;->c()V

    .line 581
    .line 582
    .line 583
    const/4 v2, 0x1

    .line 584
    if-ne v3, v2, :cond_25

    .line 585
    .line 586
    invoke-virtual {v0}, Lt2/H;->b()I

    .line 587
    .line 588
    .line 589
    move-result v2

    .line 590
    sub-int/2addr v1, v2

    .line 591
    div-int/2addr v1, v9

    .line 592
    sub-int/2addr v1, v10

    .line 593
    if-lt v4, v1, :cond_24

    .line 594
    .line 595
    sub-int/2addr v4, v1

    .line 596
    invoke-virtual {v0, v4}, Lt2/H;->s(I)V

    .line 597
    .line 598
    .line 599
    goto :goto_18

    .line 600
    :cond_24
    const-string v0, "pres_bytes is smaller than presentation bytes read."

    .line 601
    .line 602
    invoke-static {v0}, Lq2/L;->d(Ljava/lang/String;)Lq2/L;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    throw v0

    .line 607
    :cond_25
    :goto_18
    iget-boolean v0, v11, LU2/c$b;->a:Z

    .line 608
    .line 609
    if-eqz v0, :cond_28

    .line 610
    .line 611
    iget v0, v11, LU2/c$b;->b:I

    .line 612
    .line 613
    const/4 v1, -0x1

    .line 614
    if-eq v0, v1, :cond_26

    .line 615
    .line 616
    goto :goto_19

    .line 617
    :cond_26
    new-instance v0, Ljava/lang/StringBuilder;

    .line 618
    .line 619
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 620
    .line 621
    .line 622
    const-string v1, "Can\'t determine channel mode of presentation "

    .line 623
    .line 624
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 625
    .line 626
    .line 627
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    invoke-static {v0}, Lq2/L;->d(Ljava/lang/String;)Lq2/L;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    throw v0

    .line 639
    :cond_27
    move v9, v12

    .line 640
    :cond_28
    :goto_19
    iget-boolean v0, v11, LU2/c$b;->a:Z

    .line 641
    .line 642
    if-eqz v0, :cond_29

    .line 643
    .line 644
    iget v0, v11, LU2/c$b;->b:I

    .line 645
    .line 646
    iget-boolean v1, v11, LU2/c$b;->d:Z

    .line 647
    .line 648
    iget v2, v11, LU2/c$b;->e:I

    .line 649
    .line 650
    invoke-static {v0, v1, v2}, LU2/c;->c(IZI)I

    .line 651
    .line 652
    .line 653
    move-result v14

    .line 654
    goto :goto_1b

    .line 655
    :cond_29
    iget v0, v11, LU2/c$b;->c:I

    .line 656
    .line 657
    if-lez v0, :cond_2b

    .line 658
    .line 659
    const/16 v17, 0x1

    .line 660
    .line 661
    add-int/lit8 v0, v0, 0x1

    .line 662
    .line 663
    iget v1, v11, LU2/c$b;->g:I

    .line 664
    .line 665
    const/4 v2, 0x4

    .line 666
    if-ne v1, v2, :cond_2a

    .line 667
    .line 668
    const/16 v1, 0x11

    .line 669
    .line 670
    if-ne v0, v1, :cond_2a

    .line 671
    .line 672
    const/16 v0, 0x15

    .line 673
    .line 674
    :cond_2a
    move v14, v0

    .line 675
    goto :goto_1b

    .line 676
    :cond_2b
    iget v0, v11, LU2/c$b;->g:I

    .line 677
    .line 678
    if-eqz v0, :cond_30

    .line 679
    .line 680
    const/4 v2, 0x1

    .line 681
    if-eq v0, v2, :cond_2f

    .line 682
    .line 683
    const/4 v15, 0x2

    .line 684
    if-eq v0, v15, :cond_2e

    .line 685
    .line 686
    const/4 v2, 0x3

    .line 687
    if-eq v0, v2, :cond_2d

    .line 688
    .line 689
    const/4 v2, 0x4

    .line 690
    if-eq v0, v2, :cond_2c

    .line 691
    .line 692
    new-instance v0, Ljava/lang/StringBuilder;

    .line 693
    .line 694
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 695
    .line 696
    .line 697
    const-string v1, "AC-4 level "

    .line 698
    .line 699
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 700
    .line 701
    .line 702
    iget v1, v11, LU2/c$b;->g:I

    .line 703
    .line 704
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 705
    .line 706
    .line 707
    const-string v1, " has not been defined."

    .line 708
    .line 709
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 710
    .line 711
    .line 712
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    const-string v1, "Ac4Util"

    .line 717
    .line 718
    invoke-static {v1, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 719
    .line 720
    .line 721
    :goto_1a
    move v14, v15

    .line 722
    goto :goto_1b

    .line 723
    :cond_2c
    const/16 v14, 0xc

    .line 724
    .line 725
    goto :goto_1b

    .line 726
    :cond_2d
    const/16 v14, 0xa

    .line 727
    .line 728
    goto :goto_1b

    .line 729
    :cond_2e
    move v14, v9

    .line 730
    goto :goto_1b

    .line 731
    :cond_2f
    const/4 v14, 0x6

    .line 732
    goto :goto_1b

    .line 733
    :cond_30
    const/4 v15, 0x2

    .line 734
    goto :goto_1a

    .line 735
    :goto_1b
    if-lez v14, :cond_31

    .line 736
    .line 737
    iget v0, v11, LU2/c$b;->f:I

    .line 738
    .line 739
    iget v1, v11, LU2/c$b;->g:I

    .line 740
    .line 741
    invoke-static {v6, v0, v1}, LU2/c;->a(III)Ljava/lang/String;

    .line 742
    .line 743
    .line 744
    move-result-object v0

    .line 745
    new-instance v1, Lq2/x$b;

    .line 746
    .line 747
    invoke-direct {v1}, Lq2/x$b;-><init>()V

    .line 748
    .line 749
    .line 750
    move-object/from16 v2, p1

    .line 751
    .line 752
    invoke-virtual {v1, v2}, Lq2/x$b;->j0(Ljava/lang/String;)Lq2/x$b;

    .line 753
    .line 754
    .line 755
    move-result-object v1

    .line 756
    const-string v2, "audio/ac4"

    .line 757
    .line 758
    invoke-virtual {v1, v2}, Lq2/x$b;->y0(Ljava/lang/String;)Lq2/x$b;

    .line 759
    .line 760
    .line 761
    move-result-object v1

    .line 762
    invoke-virtual {v1, v14}, Lq2/x$b;->T(I)Lq2/x$b;

    .line 763
    .line 764
    .line 765
    move-result-object v1

    .line 766
    invoke-virtual {v1, v7}, Lq2/x$b;->z0(I)Lq2/x$b;

    .line 767
    .line 768
    .line 769
    move-result-object v1

    .line 770
    move-object/from16 v2, p3

    .line 771
    .line 772
    invoke-virtual {v1, v2}, Lq2/x$b;->c0(Lq2/q;)Lq2/x$b;

    .line 773
    .line 774
    .line 775
    move-result-object v1

    .line 776
    move-object/from16 v2, p2

    .line 777
    .line 778
    invoke-virtual {v1, v2}, Lq2/x$b;->n0(Ljava/lang/String;)Lq2/x$b;

    .line 779
    .line 780
    .line 781
    move-result-object v1

    .line 782
    invoke-virtual {v1, v0}, Lq2/x$b;->U(Ljava/lang/String;)Lq2/x$b;

    .line 783
    .line 784
    .line 785
    move-result-object v0

    .line 786
    invoke-virtual {v0}, Lq2/x$b;->P()Lq2/x;

    .line 787
    .line 788
    .line 789
    move-result-object v0

    .line 790
    return-object v0

    .line 791
    :cond_31
    const-string v0, "Cannot determine channel count of presentation."

    .line 792
    .line 793
    invoke-static {v0}, Lq2/L;->d(Ljava/lang/String;)Lq2/L;

    .line 794
    .line 795
    .line 796
    move-result-object v0

    .line 797
    throw v0

    .line 798
    :cond_32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 799
    .line 800
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 801
    .line 802
    .line 803
    const-string v1, "Unsupported AC-4 DSI version: "

    .line 804
    .line 805
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 806
    .line 807
    .line 808
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 809
    .line 810
    .line 811
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 812
    .line 813
    .line 814
    move-result-object v0

    .line 815
    invoke-static {v0}, Lq2/L;->d(Ljava/lang/String;)Lq2/L;

    .line 816
    .line 817
    .line 818
    move-result-object v0

    .line 819
    throw v0
.end method

.method public static f(Ljava/nio/ByteBuffer;)I
    .locals 2

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 13
    .line 14
    .line 15
    new-instance p0, Lt2/H;

    .line 16
    .line 17
    invoke-direct {p0, v0}, Lt2/H;-><init>([B)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0}, LU2/c;->g(Lt2/H;)LU2/c$c;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iget p0, p0, LU2/c$c;->e:I

    .line 25
    .line 26
    return p0
.end method

.method public static g(Lt2/H;)LU2/c$c;
    .locals 11

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lt2/H;->h(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0, v0}, Lt2/H;->h(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const v2, 0xffff

    .line 12
    .line 13
    .line 14
    const/4 v3, 0x4

    .line 15
    if-ne v0, v2, :cond_0

    .line 16
    .line 17
    const/16 v0, 0x18

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lt2/H;->h(I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v2, 0x7

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v2, v3

    .line 26
    :goto_0
    add-int/2addr v0, v2

    .line 27
    const v2, 0xac41

    .line 28
    .line 29
    .line 30
    if-ne v1, v2, :cond_1

    .line 31
    .line 32
    add-int/lit8 v0, v0, 0x2

    .line 33
    .line 34
    :cond_1
    move v8, v0

    .line 35
    const/4 v0, 0x2

    .line 36
    invoke-virtual {p0, v0}, Lt2/H;->h(I)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const/4 v2, 0x3

    .line 41
    if-ne v1, v2, :cond_2

    .line 42
    .line 43
    invoke-static {p0, v0}, LU2/c;->k(Lt2/H;I)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    add-int/2addr v1, v4

    .line 48
    :cond_2
    move v5, v1

    .line 49
    const/16 v1, 0xa

    .line 50
    .line 51
    invoke-virtual {p0, v1}, Lt2/H;->h(I)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-virtual {p0}, Lt2/H;->g()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_3

    .line 60
    .line 61
    invoke-virtual {p0, v2}, Lt2/H;->h(I)I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-lez v4, :cond_3

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Lt2/H;->r(I)V

    .line 68
    .line 69
    .line 70
    :cond_3
    invoke-virtual {p0}, Lt2/H;->g()Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    const v6, 0xac44

    .line 75
    .line 76
    .line 77
    const v7, 0xbb80

    .line 78
    .line 79
    .line 80
    if-eqz v4, :cond_4

    .line 81
    .line 82
    move v4, v7

    .line 83
    goto :goto_1

    .line 84
    :cond_4
    move v4, v7

    .line 85
    move v7, v6

    .line 86
    :goto_1
    invoke-virtual {p0, v3}, Lt2/H;->h(I)I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-ne v7, v6, :cond_5

    .line 91
    .line 92
    const/16 v6, 0xd

    .line 93
    .line 94
    if-ne p0, v6, :cond_5

    .line 95
    .line 96
    sget-object v0, LU2/c;->a:[I

    .line 97
    .line 98
    aget p0, v0, p0

    .line 99
    .line 100
    :goto_2
    move v9, p0

    .line 101
    goto :goto_5

    .line 102
    :cond_5
    if-ne v7, v4, :cond_b

    .line 103
    .line 104
    sget-object v4, LU2/c;->a:[I

    .line 105
    .line 106
    array-length v6, v4

    .line 107
    if-ge p0, v6, :cond_b

    .line 108
    .line 109
    aget v4, v4, p0

    .line 110
    .line 111
    rem-int/lit8 v1, v1, 0x5

    .line 112
    .line 113
    const/16 v6, 0x8

    .line 114
    .line 115
    const/4 v9, 0x1

    .line 116
    if-eq v1, v9, :cond_9

    .line 117
    .line 118
    const/16 v9, 0xb

    .line 119
    .line 120
    if-eq v1, v0, :cond_8

    .line 121
    .line 122
    if-eq v1, v2, :cond_9

    .line 123
    .line 124
    if-eq v1, v3, :cond_6

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_6
    if-eq p0, v2, :cond_7

    .line 128
    .line 129
    if-eq p0, v6, :cond_7

    .line 130
    .line 131
    if-ne p0, v9, :cond_a

    .line 132
    .line 133
    :cond_7
    :goto_3
    add-int/lit8 p0, v4, 0x1

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_8
    if-eq p0, v6, :cond_7

    .line 137
    .line 138
    if-ne p0, v9, :cond_a

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_9
    if-eq p0, v2, :cond_7

    .line 142
    .line 143
    if-ne p0, v6, :cond_a

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_a
    :goto_4
    move v9, v4

    .line 147
    goto :goto_5

    .line 148
    :cond_b
    const/4 p0, 0x0

    .line 149
    goto :goto_2

    .line 150
    :goto_5
    new-instance v4, LU2/c$c;

    .line 151
    .line 152
    const/4 v6, 0x2

    .line 153
    const/4 v10, 0x0

    .line 154
    invoke-direct/range {v4 .. v10}, LU2/c$c;-><init>(IIIIILU2/c$a;)V

    .line 155
    .line 156
    .line 157
    return-object v4
.end method

.method public static h([BI)I
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x7

    .line 3
    if-ge v0, v1, :cond_0

    .line 4
    .line 5
    const/4 p0, -0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 v0, 0x2

    .line 8
    aget-byte v0, p0, v0

    .line 9
    .line 10
    and-int/lit16 v0, v0, 0xff

    .line 11
    .line 12
    shl-int/lit8 v0, v0, 0x8

    .line 13
    .line 14
    const/4 v2, 0x3

    .line 15
    aget-byte v2, p0, v2

    .line 16
    .line 17
    and-int/lit16 v2, v2, 0xff

    .line 18
    .line 19
    or-int/2addr v0, v2

    .line 20
    const v2, 0xffff

    .line 21
    .line 22
    .line 23
    const/4 v3, 0x4

    .line 24
    if-ne v0, v2, :cond_1

    .line 25
    .line 26
    aget-byte v0, p0, v3

    .line 27
    .line 28
    and-int/lit16 v0, v0, 0xff

    .line 29
    .line 30
    shl-int/lit8 v0, v0, 0x10

    .line 31
    .line 32
    const/4 v2, 0x5

    .line 33
    aget-byte v2, p0, v2

    .line 34
    .line 35
    and-int/lit16 v2, v2, 0xff

    .line 36
    .line 37
    shl-int/lit8 v2, v2, 0x8

    .line 38
    .line 39
    or-int/2addr v0, v2

    .line 40
    const/4 v2, 0x6

    .line 41
    aget-byte p0, p0, v2

    .line 42
    .line 43
    and-int/lit16 p0, p0, 0xff

    .line 44
    .line 45
    or-int/2addr v0, p0

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move v1, v3

    .line 48
    :goto_0
    const p0, 0xac41

    .line 49
    .line 50
    .line 51
    if-ne p1, p0, :cond_2

    .line 52
    .line 53
    add-int/lit8 v1, v1, 0x2

    .line 54
    .line 55
    :cond_2
    add-int/2addr v0, v1

    .line 56
    return v0
.end method

.method private static i(Lt2/H;LU2/c$b;)V
    .locals 4

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-virtual {p0, v0}, Lt2/H;->h(I)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x2

    .line 7
    invoke-virtual {p0, v2}, Lt2/H;->r(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lt2/H;->g()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lt2/H;->r(I)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 v0, 0x7

    .line 20
    if-lt v1, v0, :cond_1

    .line 21
    .line 22
    const/16 v0, 0xa

    .line 23
    .line 24
    if-gt v1, v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Lt2/H;->q()V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p0}, Lt2/H;->g()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_4

    .line 34
    .line 35
    const/4 v0, 0x3

    .line 36
    invoke-virtual {p0, v0}, Lt2/H;->h(I)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p1, LU2/c$b;->b:I

    .line 41
    .line 42
    const/4 v3, -0x1

    .line 43
    if-ne v2, v3, :cond_3

    .line 44
    .line 45
    if-ltz v1, :cond_3

    .line 46
    .line 47
    const/16 v2, 0xf

    .line 48
    .line 49
    if-gt v1, v2, :cond_3

    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    const/4 v2, 0x1

    .line 54
    if-ne v0, v2, :cond_3

    .line 55
    .line 56
    :cond_2
    iput v1, p1, LU2/c$b;->b:I

    .line 57
    .line 58
    :cond_3
    invoke-virtual {p0}, Lt2/H;->g()Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_4

    .line 63
    .line 64
    invoke-static {p0}, LU2/c;->m(Lt2/H;)V

    .line 65
    .line 66
    .line 67
    :cond_4
    return-void
.end method

.method private static j(Lt2/H;LU2/c$b;)V
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lt2/H;->r(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lt2/H;->g()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/16 v2, 0x8

    .line 10
    .line 11
    invoke-virtual {p0, v2}, Lt2/H;->h(I)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    :goto_0
    if-ge v3, v2, :cond_4

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lt2/H;->r(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lt2/H;->g()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    const/4 v4, 0x5

    .line 28
    invoke-virtual {p0, v4}, Lt2/H;->r(I)V

    .line 29
    .line 30
    .line 31
    :cond_0
    if-eqz v1, :cond_1

    .line 32
    .line 33
    const/16 v4, 0x18

    .line 34
    .line 35
    invoke-virtual {p0, v4}, Lt2/H;->r(I)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {p0}, Lt2/H;->g()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    const/4 v5, 0x4

    .line 44
    if-eqz v4, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0}, Lt2/H;->g()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-nez v4, :cond_2

    .line 51
    .line 52
    invoke-virtual {p0, v5}, Lt2/H;->r(I)V

    .line 53
    .line 54
    .line 55
    :cond_2
    const/4 v4, 0x6

    .line 56
    invoke-virtual {p0, v4}, Lt2/H;->h(I)I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    add-int/lit8 v4, v4, 0x1

    .line 61
    .line 62
    iput v4, p1, LU2/c$b;->c:I

    .line 63
    .line 64
    :cond_3
    invoke-virtual {p0, v5}, Lt2/H;->r(I)V

    .line 65
    .line 66
    .line 67
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_4
    invoke-virtual {p0}, Lt2/H;->g()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_5

    .line 75
    .line 76
    const/4 p1, 0x3

    .line 77
    invoke-virtual {p0, p1}, Lt2/H;->r(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Lt2/H;->g()Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_5

    .line 85
    .line 86
    invoke-static {p0}, LU2/c;->m(Lt2/H;)V

    .line 87
    .line 88
    .line 89
    :cond_5
    return-void
.end method

.method private static k(Lt2/H;I)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-virtual {p0, p1}, Lt2/H;->h(I)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    add-int/2addr v0, v1

    .line 7
    invoke-virtual {p0}, Lt2/H;->g()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    return v0

    .line 14
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    shl-int/2addr v0, p1

    .line 17
    goto :goto_0
.end method

.method private static l(Lt2/H;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lt2/H;->b()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x42

    .line 6
    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_0
    invoke-virtual {p0, v1}, Lt2/H;->r(I)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0
.end method

.method private static m(Lt2/H;)V
    .locals 2

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-virtual {p0, v0}, Lt2/H;->h(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const/4 v1, 0x2

    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    const/16 v1, 0x2a

    .line 10
    .line 11
    if-gt v0, v1, :cond_0

    .line 12
    .line 13
    mul-int/lit8 v0, v0, 0x8

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lt2/H;->r(I)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string v0, "Invalid language tag bytes number: %d. Must be between 2 and 42."

    .line 28
    .line 29
    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Lq2/L;->d(Ljava/lang/String;)Lq2/L;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    throw p0
.end method
