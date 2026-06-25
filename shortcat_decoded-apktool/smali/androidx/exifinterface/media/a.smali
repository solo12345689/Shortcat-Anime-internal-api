.class public Landroidx/exifinterface/media/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/exifinterface/media/a$b;,
        Landroidx/exifinterface/media/a$f;,
        Landroidx/exifinterface/media/a$d;,
        Landroidx/exifinterface/media/a$c;,
        Landroidx/exifinterface/media/a$e;
    }
.end annotation


# static fields
.field static final A:[B

.field private static final B:[B

.field private static final C:[B

.field private static final D:[B

.field private static final E:[B

.field private static final F:[B

.field private static final G:[B

.field private static final H:[B

.field private static final I:[B

.field private static final J:[B

.field private static final K:[B

.field private static final L:[B

.field private static final M:[B

.field private static final N:[B

.field private static final O:[B

.field private static final P:[B

.field private static final Q:[B

.field private static final R:[B

.field private static final S:[B

.field private static T:Ljava/text/SimpleDateFormat;

.field private static U:Ljava/text/SimpleDateFormat;

.field static final V:[Ljava/lang/String;

.field static final W:[I

.field static final X:[B

.field private static final Y:[Landroidx/exifinterface/media/a$d;

.field private static final Z:[Landroidx/exifinterface/media/a$d;

.field private static final a0:[Landroidx/exifinterface/media/a$d;

.field private static final b0:[Landroidx/exifinterface/media/a$d;

.field private static final c0:[Landroidx/exifinterface/media/a$d;

.field private static final d0:Landroidx/exifinterface/media/a$d;

.field private static final e0:[Landroidx/exifinterface/media/a$d;

.field private static final f0:[Landroidx/exifinterface/media/a$d;

.field private static final g0:[Landroidx/exifinterface/media/a$d;

.field private static final h0:[Landroidx/exifinterface/media/a$d;

.field static final i0:[[Landroidx/exifinterface/media/a$d;

.field private static final j0:[Landroidx/exifinterface/media/a$d;

.field private static final k0:[Ljava/util/HashMap;

.field private static final l0:[Ljava/util/HashMap;

.field private static final m0:Ljava/util/HashSet;

.field private static final n0:Ljava/util/HashMap;

.field static final o0:Ljava/nio/charset/Charset;

.field static final p0:[B

.field private static final q0:[B

.field private static final r0:Ljava/util/regex/Pattern;

.field private static final s0:Ljava/util/regex/Pattern;

.field private static final t0:Ljava/util/regex/Pattern;

.field private static final u:Z

.field private static final u0:Ljava/util/regex/Pattern;

.field private static final v:Ljava/util/List;

.field private static final w:Ljava/util/List;

.field public static final x:[I

.field public static final y:[I

.field public static final z:[I


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/io/FileDescriptor;

.field private c:Landroid/content/res/AssetManager$AssetInputStream;

.field private d:I

.field private e:Z

.field private final f:[Ljava/util/HashMap;

.field private g:Ljava/util/Set;

.field private h:Ljava/nio/ByteOrder;

.field private i:Z

.field private j:Z

.field private k:Z

.field private l:I

.field private m:I

.field private n:[B

.field private o:I

.field private p:I

.field private q:I

.field private r:I

.field private s:I

.field private t:Z


# direct methods
.method static constructor <clinit>()V
    .locals 139

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const-string v2, "ExifInterface"

    .line 7
    .line 8
    invoke-static {v2, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    sput-boolean v2, Landroidx/exifinterface/media/a;->u:Z

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    const/4 v4, 0x6

    .line 20
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    const/16 v6, 0x8

    .line 25
    .line 26
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    filled-new-array {v3, v5, v1, v7}, [Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    sput-object v5, Landroidx/exifinterface/media/a;->v:Ljava/util/List;

    .line 39
    .line 40
    const/4 v5, 0x2

    .line 41
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    const/4 v9, 0x7

    .line 46
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v10

    .line 50
    const/4 v11, 0x4

    .line 51
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v12

    .line 55
    const/4 v13, 0x5

    .line 56
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v14

    .line 60
    filled-new-array {v8, v10, v12, v14}, [Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v12

    .line 64
    invoke-static {v12}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v12

    .line 68
    sput-object v12, Landroidx/exifinterface/media/a;->w:Ljava/util/List;

    .line 69
    .line 70
    filled-new-array {v6, v6, v6}, [I

    .line 71
    .line 72
    .line 73
    move-result-object v12

    .line 74
    sput-object v12, Landroidx/exifinterface/media/a;->x:[I

    .line 75
    .line 76
    filled-new-array {v11}, [I

    .line 77
    .line 78
    .line 79
    move-result-object v12

    .line 80
    sput-object v12, Landroidx/exifinterface/media/a;->y:[I

    .line 81
    .line 82
    filled-new-array {v6}, [I

    .line 83
    .line 84
    .line 85
    move-result-object v12

    .line 86
    sput-object v12, Landroidx/exifinterface/media/a;->z:[I

    .line 87
    .line 88
    new-array v12, v0, [B

    .line 89
    .line 90
    fill-array-data v12, :array_0

    .line 91
    .line 92
    .line 93
    sput-object v12, Landroidx/exifinterface/media/a;->A:[B

    .line 94
    .line 95
    new-array v12, v11, [B

    .line 96
    .line 97
    fill-array-data v12, :array_1

    .line 98
    .line 99
    .line 100
    sput-object v12, Landroidx/exifinterface/media/a;->B:[B

    .line 101
    .line 102
    new-array v12, v11, [B

    .line 103
    .line 104
    fill-array-data v12, :array_2

    .line 105
    .line 106
    .line 107
    sput-object v12, Landroidx/exifinterface/media/a;->C:[B

    .line 108
    .line 109
    new-array v12, v11, [B

    .line 110
    .line 111
    fill-array-data v12, :array_3

    .line 112
    .line 113
    .line 114
    sput-object v12, Landroidx/exifinterface/media/a;->D:[B

    .line 115
    .line 116
    new-array v12, v4, [B

    .line 117
    .line 118
    fill-array-data v12, :array_4

    .line 119
    .line 120
    .line 121
    sput-object v12, Landroidx/exifinterface/media/a;->E:[B

    .line 122
    .line 123
    const/16 v12, 0xa

    .line 124
    .line 125
    new-array v15, v12, [B

    .line 126
    .line 127
    fill-array-data v15, :array_5

    .line 128
    .line 129
    .line 130
    sput-object v15, Landroidx/exifinterface/media/a;->F:[B

    .line 131
    .line 132
    new-array v15, v6, [B

    .line 133
    .line 134
    fill-array-data v15, :array_6

    .line 135
    .line 136
    .line 137
    sput-object v15, Landroidx/exifinterface/media/a;->G:[B

    .line 138
    .line 139
    new-array v15, v11, [B

    .line 140
    .line 141
    fill-array-data v15, :array_7

    .line 142
    .line 143
    .line 144
    sput-object v15, Landroidx/exifinterface/media/a;->H:[B

    .line 145
    .line 146
    new-array v15, v11, [B

    .line 147
    .line 148
    fill-array-data v15, :array_8

    .line 149
    .line 150
    .line 151
    sput-object v15, Landroidx/exifinterface/media/a;->I:[B

    .line 152
    .line 153
    new-array v15, v11, [B

    .line 154
    .line 155
    fill-array-data v15, :array_9

    .line 156
    .line 157
    .line 158
    sput-object v15, Landroidx/exifinterface/media/a;->J:[B

    .line 159
    .line 160
    new-array v15, v11, [B

    .line 161
    .line 162
    fill-array-data v15, :array_a

    .line 163
    .line 164
    .line 165
    sput-object v15, Landroidx/exifinterface/media/a;->K:[B

    .line 166
    .line 167
    new-array v15, v11, [B

    .line 168
    .line 169
    fill-array-data v15, :array_b

    .line 170
    .line 171
    .line 172
    sput-object v15, Landroidx/exifinterface/media/a;->L:[B

    .line 173
    .line 174
    new-array v15, v11, [B

    .line 175
    .line 176
    fill-array-data v15, :array_c

    .line 177
    .line 178
    .line 179
    sput-object v15, Landroidx/exifinterface/media/a;->M:[B

    .line 180
    .line 181
    new-array v15, v0, [B

    .line 182
    .line 183
    fill-array-data v15, :array_d

    .line 184
    .line 185
    .line 186
    sput-object v15, Landroidx/exifinterface/media/a;->N:[B

    .line 187
    .line 188
    const-string v15, "VP8X"

    .line 189
    .line 190
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 191
    .line 192
    .line 193
    move-result-object v12

    .line 194
    invoke-virtual {v15, v12}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 195
    .line 196
    .line 197
    move-result-object v12

    .line 198
    sput-object v12, Landroidx/exifinterface/media/a;->O:[B

    .line 199
    .line 200
    const-string v12, "VP8L"

    .line 201
    .line 202
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 203
    .line 204
    .line 205
    move-result-object v15

    .line 206
    invoke-virtual {v12, v15}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 207
    .line 208
    .line 209
    move-result-object v12

    .line 210
    sput-object v12, Landroidx/exifinterface/media/a;->P:[B

    .line 211
    .line 212
    const-string v12, "VP8 "

    .line 213
    .line 214
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 215
    .line 216
    .line 217
    move-result-object v15

    .line 218
    invoke-virtual {v12, v15}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 219
    .line 220
    .line 221
    move-result-object v12

    .line 222
    sput-object v12, Landroidx/exifinterface/media/a;->Q:[B

    .line 223
    .line 224
    const-string v12, "ANIM"

    .line 225
    .line 226
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 227
    .line 228
    .line 229
    move-result-object v15

    .line 230
    invoke-virtual {v12, v15}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 231
    .line 232
    .line 233
    move-result-object v12

    .line 234
    sput-object v12, Landroidx/exifinterface/media/a;->R:[B

    .line 235
    .line 236
    const-string v12, "ANMF"

    .line 237
    .line 238
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 239
    .line 240
    .line 241
    move-result-object v15

    .line 242
    invoke-virtual {v12, v15}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 243
    .line 244
    .line 245
    move-result-object v12

    .line 246
    sput-object v12, Landroidx/exifinterface/media/a;->S:[B

    .line 247
    .line 248
    const-string v29, "DOUBLE"

    .line 249
    .line 250
    const-string v30, "IFD"

    .line 251
    .line 252
    const-string v17, ""

    .line 253
    .line 254
    const-string v18, "BYTE"

    .line 255
    .line 256
    const-string v19, "STRING"

    .line 257
    .line 258
    const-string v20, "USHORT"

    .line 259
    .line 260
    const-string v21, "ULONG"

    .line 261
    .line 262
    const-string v22, "URATIONAL"

    .line 263
    .line 264
    const-string v23, "SBYTE"

    .line 265
    .line 266
    const-string v24, "UNDEFINED"

    .line 267
    .line 268
    const-string v25, "SSHORT"

    .line 269
    .line 270
    const-string v26, "SLONG"

    .line 271
    .line 272
    const-string v27, "SRATIONAL"

    .line 273
    .line 274
    const-string v28, "SINGLE"

    .line 275
    .line 276
    filled-new-array/range {v17 .. v30}, [Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v12

    .line 280
    sput-object v12, Landroidx/exifinterface/media/a;->V:[Ljava/lang/String;

    .line 281
    .line 282
    const/16 v12, 0xe

    .line 283
    .line 284
    new-array v12, v12, [I

    .line 285
    .line 286
    fill-array-data v12, :array_e

    .line 287
    .line 288
    .line 289
    sput-object v12, Landroidx/exifinterface/media/a;->W:[I

    .line 290
    .line 291
    new-array v12, v6, [B

    .line 292
    .line 293
    fill-array-data v12, :array_f

    .line 294
    .line 295
    .line 296
    sput-object v12, Landroidx/exifinterface/media/a;->X:[B

    .line 297
    .line 298
    new-instance v12, Landroidx/exifinterface/media/a$d;

    .line 299
    .line 300
    const-string v15, "NewSubfileType"

    .line 301
    .line 302
    const/16 v6, 0xfe

    .line 303
    .line 304
    invoke-direct {v12, v15, v6, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 305
    .line 306
    .line 307
    new-instance v6, Landroidx/exifinterface/media/a$d;

    .line 308
    .line 309
    const-string v15, "SubfileType"

    .line 310
    .line 311
    const/16 v2, 0xff

    .line 312
    .line 313
    invoke-direct {v6, v15, v2, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 314
    .line 315
    .line 316
    new-instance v2, Landroidx/exifinterface/media/a$d;

    .line 317
    .line 318
    const-string v15, "ImageWidth"

    .line 319
    .line 320
    const/16 v9, 0x100

    .line 321
    .line 322
    invoke-direct {v2, v15, v9, v0, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;III)V

    .line 323
    .line 324
    .line 325
    new-instance v15, Landroidx/exifinterface/media/a$d;

    .line 326
    .line 327
    const-string v9, "ImageLength"

    .line 328
    .line 329
    const/16 v4, 0x101

    .line 330
    .line 331
    invoke-direct {v15, v9, v4, v0, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;III)V

    .line 332
    .line 333
    .line 334
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 335
    .line 336
    const-string v4, "BitsPerSample"

    .line 337
    .line 338
    const/16 v13, 0x102

    .line 339
    .line 340
    invoke-direct {v9, v4, v13, v0}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 341
    .line 342
    .line 343
    new-instance v4, Landroidx/exifinterface/media/a$d;

    .line 344
    .line 345
    const-string v13, "Compression"

    .line 346
    .line 347
    const/16 v11, 0x103

    .line 348
    .line 349
    invoke-direct {v4, v13, v11, v0}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 350
    .line 351
    .line 352
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 353
    .line 354
    const-string v13, "PhotometricInterpretation"

    .line 355
    .line 356
    const/16 v5, 0x106

    .line 357
    .line 358
    invoke-direct {v11, v13, v5, v0}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 359
    .line 360
    .line 361
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 362
    .line 363
    const-string v13, "ImageDescription"

    .line 364
    .line 365
    const/16 v0, 0x10e

    .line 366
    .line 367
    move-object/from16 v19, v2

    .line 368
    .line 369
    const/4 v2, 0x2

    .line 370
    invoke-direct {v5, v13, v0, v2}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 371
    .line 372
    .line 373
    new-instance v0, Landroidx/exifinterface/media/a$d;

    .line 374
    .line 375
    const-string v13, "Make"

    .line 376
    .line 377
    move-object/from16 v22, v4

    .line 378
    .line 379
    const/16 v4, 0x10f

    .line 380
    .line 381
    invoke-direct {v0, v13, v4, v2}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 382
    .line 383
    .line 384
    new-instance v4, Landroidx/exifinterface/media/a$d;

    .line 385
    .line 386
    const-string v13, "Model"

    .line 387
    .line 388
    move-object/from16 v25, v0

    .line 389
    .line 390
    const/16 v0, 0x110

    .line 391
    .line 392
    invoke-direct {v4, v13, v0, v2}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 393
    .line 394
    .line 395
    new-instance v0, Landroidx/exifinterface/media/a$d;

    .line 396
    .line 397
    const-string v2, "StripOffsets"

    .line 398
    .line 399
    const/16 v13, 0x111

    .line 400
    .line 401
    move-object/from16 v26, v4

    .line 402
    .line 403
    move-object/from16 v24, v5

    .line 404
    .line 405
    const/4 v4, 0x3

    .line 406
    const/4 v5, 0x4

    .line 407
    invoke-direct {v0, v2, v13, v4, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;III)V

    .line 408
    .line 409
    .line 410
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 411
    .line 412
    const-string v13, "Orientation"

    .line 413
    .line 414
    move-object/from16 v27, v0

    .line 415
    .line 416
    const/16 v0, 0x112

    .line 417
    .line 418
    invoke-direct {v5, v13, v0, v4}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 419
    .line 420
    .line 421
    new-instance v0, Landroidx/exifinterface/media/a$d;

    .line 422
    .line 423
    const-string v13, "SamplesPerPixel"

    .line 424
    .line 425
    move-object/from16 v28, v5

    .line 426
    .line 427
    const/16 v5, 0x115

    .line 428
    .line 429
    invoke-direct {v0, v13, v5, v4}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 430
    .line 431
    .line 432
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 433
    .line 434
    const-string v13, "RowsPerStrip"

    .line 435
    .line 436
    move-object/from16 v29, v0

    .line 437
    .line 438
    const/16 v0, 0x116

    .line 439
    .line 440
    move-object/from16 v18, v6

    .line 441
    .line 442
    const/4 v6, 0x4

    .line 443
    invoke-direct {v5, v13, v0, v4, v6}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;III)V

    .line 444
    .line 445
    .line 446
    new-instance v0, Landroidx/exifinterface/media/a$d;

    .line 447
    .line 448
    const-string v13, "StripByteCounts"

    .line 449
    .line 450
    move-object/from16 v30, v5

    .line 451
    .line 452
    const/16 v5, 0x117

    .line 453
    .line 454
    invoke-direct {v0, v13, v5, v4, v6}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;III)V

    .line 455
    .line 456
    .line 457
    new-instance v4, Landroidx/exifinterface/media/a$d;

    .line 458
    .line 459
    const-string v5, "XResolution"

    .line 460
    .line 461
    const/16 v6, 0x11a

    .line 462
    .line 463
    const/4 v13, 0x5

    .line 464
    invoke-direct {v4, v5, v6, v13}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 465
    .line 466
    .line 467
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 468
    .line 469
    const-string v6, "YResolution"

    .line 470
    .line 471
    move-object/from16 v31, v0

    .line 472
    .line 473
    const/16 v0, 0x11b

    .line 474
    .line 475
    invoke-direct {v5, v6, v0, v13}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 476
    .line 477
    .line 478
    new-instance v0, Landroidx/exifinterface/media/a$d;

    .line 479
    .line 480
    const-string v6, "PlanarConfiguration"

    .line 481
    .line 482
    const/16 v13, 0x11c

    .line 483
    .line 484
    move-object/from16 v32, v4

    .line 485
    .line 486
    const/4 v4, 0x3

    .line 487
    invoke-direct {v0, v6, v13, v4}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 488
    .line 489
    .line 490
    new-instance v6, Landroidx/exifinterface/media/a$d;

    .line 491
    .line 492
    const-string v13, "ResolutionUnit"

    .line 493
    .line 494
    move-object/from16 v34, v0

    .line 495
    .line 496
    const/16 v0, 0x128

    .line 497
    .line 498
    invoke-direct {v6, v13, v0, v4}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 499
    .line 500
    .line 501
    new-instance v0, Landroidx/exifinterface/media/a$d;

    .line 502
    .line 503
    const-string v13, "TransferFunction"

    .line 504
    .line 505
    move-object/from16 v33, v5

    .line 506
    .line 507
    const/16 v5, 0x12d

    .line 508
    .line 509
    invoke-direct {v0, v13, v5, v4}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 510
    .line 511
    .line 512
    new-instance v4, Landroidx/exifinterface/media/a$d;

    .line 513
    .line 514
    const-string v5, "Software"

    .line 515
    .line 516
    const/16 v13, 0x131

    .line 517
    .line 518
    move-object/from16 v36, v0

    .line 519
    .line 520
    const/4 v0, 0x2

    .line 521
    invoke-direct {v4, v5, v13, v0}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 522
    .line 523
    .line 524
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 525
    .line 526
    const-string v13, "DateTime"

    .line 527
    .line 528
    move-object/from16 v37, v4

    .line 529
    .line 530
    const/16 v4, 0x132

    .line 531
    .line 532
    invoke-direct {v5, v13, v4, v0}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 533
    .line 534
    .line 535
    new-instance v4, Landroidx/exifinterface/media/a$d;

    .line 536
    .line 537
    const-string v13, "Artist"

    .line 538
    .line 539
    move-object/from16 v38, v5

    .line 540
    .line 541
    const/16 v5, 0x13b

    .line 542
    .line 543
    invoke-direct {v4, v13, v5, v0}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 544
    .line 545
    .line 546
    new-instance v0, Landroidx/exifinterface/media/a$d;

    .line 547
    .line 548
    const-string v5, "WhitePoint"

    .line 549
    .line 550
    const/16 v13, 0x13e

    .line 551
    .line 552
    move-object/from16 v39, v4

    .line 553
    .line 554
    const/4 v4, 0x5

    .line 555
    invoke-direct {v0, v5, v13, v4}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 556
    .line 557
    .line 558
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 559
    .line 560
    const-string v13, "PrimaryChromaticities"

    .line 561
    .line 562
    move-object/from16 v40, v0

    .line 563
    .line 564
    const/16 v0, 0x13f

    .line 565
    .line 566
    invoke-direct {v5, v13, v0, v4}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 567
    .line 568
    .line 569
    new-instance v0, Landroidx/exifinterface/media/a$d;

    .line 570
    .line 571
    const-string v4, "SubIFDPointer"

    .line 572
    .line 573
    const/16 v13, 0x14a

    .line 574
    .line 575
    move-object/from16 v41, v5

    .line 576
    .line 577
    const/4 v5, 0x4

    .line 578
    invoke-direct {v0, v4, v13, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 579
    .line 580
    .line 581
    new-instance v13, Landroidx/exifinterface/media/a$d;

    .line 582
    .line 583
    move-object/from16 v42, v0

    .line 584
    .line 585
    const-string v0, "JPEGInterchangeFormat"

    .line 586
    .line 587
    move-object/from16 v35, v6

    .line 588
    .line 589
    const/16 v6, 0x201

    .line 590
    .line 591
    invoke-direct {v13, v0, v6, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 592
    .line 593
    .line 594
    new-instance v0, Landroidx/exifinterface/media/a$d;

    .line 595
    .line 596
    const-string v6, "JPEGInterchangeFormatLength"

    .line 597
    .line 598
    move-object/from16 v21, v9

    .line 599
    .line 600
    const/16 v9, 0x202

    .line 601
    .line 602
    invoke-direct {v0, v6, v9, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 603
    .line 604
    .line 605
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 606
    .line 607
    const-string v6, "YCbCrCoefficients"

    .line 608
    .line 609
    const/16 v9, 0x211

    .line 610
    .line 611
    move-object/from16 v44, v0

    .line 612
    .line 613
    const/4 v0, 0x5

    .line 614
    invoke-direct {v5, v6, v9, v0}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 615
    .line 616
    .line 617
    new-instance v0, Landroidx/exifinterface/media/a$d;

    .line 618
    .line 619
    const-string v6, "YCbCrSubSampling"

    .line 620
    .line 621
    const/16 v9, 0x212

    .line 622
    .line 623
    move-object/from16 v45, v5

    .line 624
    .line 625
    const/4 v5, 0x3

    .line 626
    invoke-direct {v0, v6, v9, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 627
    .line 628
    .line 629
    new-instance v6, Landroidx/exifinterface/media/a$d;

    .line 630
    .line 631
    const-string v9, "YCbCrPositioning"

    .line 632
    .line 633
    move-object/from16 v46, v0

    .line 634
    .line 635
    const/16 v0, 0x213

    .line 636
    .line 637
    invoke-direct {v6, v9, v0, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 638
    .line 639
    .line 640
    new-instance v0, Landroidx/exifinterface/media/a$d;

    .line 641
    .line 642
    const-string v5, "ReferenceBlackWhite"

    .line 643
    .line 644
    const/16 v9, 0x214

    .line 645
    .line 646
    move-object/from16 v47, v6

    .line 647
    .line 648
    const/4 v6, 0x5

    .line 649
    invoke-direct {v0, v5, v9, v6}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 650
    .line 651
    .line 652
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 653
    .line 654
    const-string v6, "Copyright"

    .line 655
    .line 656
    const v9, 0x8298

    .line 657
    .line 658
    .line 659
    move-object/from16 v48, v0

    .line 660
    .line 661
    const/4 v0, 0x2

    .line 662
    invoke-direct {v5, v6, v9, v0}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 663
    .line 664
    .line 665
    new-instance v0, Landroidx/exifinterface/media/a$d;

    .line 666
    .line 667
    const-string v6, "ExifIFDPointer"

    .line 668
    .line 669
    const v9, 0x8769

    .line 670
    .line 671
    .line 672
    move-object/from16 v49, v5

    .line 673
    .line 674
    const/4 v5, 0x4

    .line 675
    invoke-direct {v0, v6, v9, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 676
    .line 677
    .line 678
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 679
    .line 680
    move-object/from16 v50, v0

    .line 681
    .line 682
    const-string v0, "GPSInfoIFDPointer"

    .line 683
    .line 684
    move-object/from16 v23, v11

    .line 685
    .line 686
    const v11, 0x8825

    .line 687
    .line 688
    .line 689
    invoke-direct {v9, v0, v11, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 690
    .line 691
    .line 692
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 693
    .line 694
    move-object/from16 v51, v9

    .line 695
    .line 696
    const-string v9, "SensorTopBorder"

    .line 697
    .line 698
    invoke-direct {v11, v9, v5, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 699
    .line 700
    .line 701
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 702
    .line 703
    move-object/from16 v52, v11

    .line 704
    .line 705
    const-string v11, "SensorLeftBorder"

    .line 706
    .line 707
    move-object/from16 v17, v12

    .line 708
    .line 709
    const/4 v12, 0x5

    .line 710
    invoke-direct {v9, v11, v12, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 711
    .line 712
    .line 713
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 714
    .line 715
    const-string v12, "SensorBottomBorder"

    .line 716
    .line 717
    move-object/from16 v53, v9

    .line 718
    .line 719
    const/4 v9, 0x6

    .line 720
    invoke-direct {v11, v12, v9, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 721
    .line 722
    .line 723
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 724
    .line 725
    const-string v12, "SensorRightBorder"

    .line 726
    .line 727
    move-object/from16 v54, v11

    .line 728
    .line 729
    const/4 v11, 0x7

    .line 730
    invoke-direct {v9, v12, v11, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 731
    .line 732
    .line 733
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 734
    .line 735
    const-string v12, "ISO"

    .line 736
    .line 737
    const/16 v11, 0x17

    .line 738
    .line 739
    move-object/from16 v55, v9

    .line 740
    .line 741
    const/4 v9, 0x3

    .line 742
    invoke-direct {v5, v12, v11, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 743
    .line 744
    .line 745
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 746
    .line 747
    const-string v11, "JpgFromRaw"

    .line 748
    .line 749
    const/16 v12, 0x2e

    .line 750
    .line 751
    move-object/from16 v56, v5

    .line 752
    .line 753
    const/4 v5, 0x7

    .line 754
    invoke-direct {v9, v11, v12, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 755
    .line 756
    .line 757
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 758
    .line 759
    const-string v11, "Xmp"

    .line 760
    .line 761
    const/16 v12, 0x2bc

    .line 762
    .line 763
    move-object/from16 v57, v9

    .line 764
    .line 765
    const/4 v9, 0x1

    .line 766
    invoke-direct {v5, v11, v12, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 767
    .line 768
    .line 769
    move-object/from16 v58, v5

    .line 770
    .line 771
    move-object/from16 v43, v13

    .line 772
    .line 773
    move-object/from16 v20, v15

    .line 774
    .line 775
    filled-new-array/range {v17 .. v58}, [Landroidx/exifinterface/media/a$d;

    .line 776
    .line 777
    .line 778
    move-result-object v64

    .line 779
    sput-object v64, Landroidx/exifinterface/media/a;->Y:[Landroidx/exifinterface/media/a$d;

    .line 780
    .line 781
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 782
    .line 783
    const-string v9, "ExposureTime"

    .line 784
    .line 785
    const v11, 0x829a

    .line 786
    .line 787
    .line 788
    const/4 v12, 0x5

    .line 789
    invoke-direct {v5, v9, v11, v12}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 790
    .line 791
    .line 792
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 793
    .line 794
    const-string v11, "FNumber"

    .line 795
    .line 796
    const v13, 0x829d

    .line 797
    .line 798
    .line 799
    invoke-direct {v9, v11, v13, v12}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 800
    .line 801
    .line 802
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 803
    .line 804
    const-string v12, "ExposureProgram"

    .line 805
    .line 806
    const v13, 0x8822

    .line 807
    .line 808
    .line 809
    const/4 v15, 0x3

    .line 810
    invoke-direct {v11, v12, v13, v15}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 811
    .line 812
    .line 813
    new-instance v12, Landroidx/exifinterface/media/a$d;

    .line 814
    .line 815
    const-string v13, "SpectralSensitivity"

    .line 816
    .line 817
    const v15, 0x8824

    .line 818
    .line 819
    .line 820
    move-object/from16 v65, v5

    .line 821
    .line 822
    const/4 v5, 0x2

    .line 823
    invoke-direct {v12, v13, v15, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 824
    .line 825
    .line 826
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 827
    .line 828
    const-string v13, "PhotographicSensitivity"

    .line 829
    .line 830
    const v15, 0x8827

    .line 831
    .line 832
    .line 833
    move-object/from16 v66, v9

    .line 834
    .line 835
    const/4 v9, 0x3

    .line 836
    invoke-direct {v5, v13, v15, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 837
    .line 838
    .line 839
    new-instance v13, Landroidx/exifinterface/media/a$d;

    .line 840
    .line 841
    const-string v15, "OECF"

    .line 842
    .line 843
    const v9, 0x8828

    .line 844
    .line 845
    .line 846
    move-object/from16 v69, v5

    .line 847
    .line 848
    const/4 v5, 0x7

    .line 849
    invoke-direct {v13, v15, v9, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 850
    .line 851
    .line 852
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 853
    .line 854
    const-string v9, "SensitivityType"

    .line 855
    .line 856
    const v15, 0x8830

    .line 857
    .line 858
    .line 859
    move-object/from16 v67, v11

    .line 860
    .line 861
    const/4 v11, 0x3

    .line 862
    invoke-direct {v5, v9, v15, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 863
    .line 864
    .line 865
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 866
    .line 867
    const-string v11, "StandardOutputSensitivity"

    .line 868
    .line 869
    const v15, 0x8831

    .line 870
    .line 871
    .line 872
    move-object/from16 v71, v5

    .line 873
    .line 874
    const/4 v5, 0x4

    .line 875
    invoke-direct {v9, v11, v15, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 876
    .line 877
    .line 878
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 879
    .line 880
    const-string v15, "RecommendedExposureIndex"

    .line 881
    .line 882
    move-object/from16 v72, v9

    .line 883
    .line 884
    const v9, 0x8832

    .line 885
    .line 886
    .line 887
    invoke-direct {v11, v15, v9, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 888
    .line 889
    .line 890
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 891
    .line 892
    const-string v15, "ISOSpeed"

    .line 893
    .line 894
    move-object/from16 v73, v11

    .line 895
    .line 896
    const v11, 0x8833

    .line 897
    .line 898
    .line 899
    invoke-direct {v9, v15, v11, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 900
    .line 901
    .line 902
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 903
    .line 904
    const-string v15, "ISOSpeedLatitudeyyy"

    .line 905
    .line 906
    move-object/from16 v74, v9

    .line 907
    .line 908
    const v9, 0x8834

    .line 909
    .line 910
    .line 911
    invoke-direct {v11, v15, v9, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 912
    .line 913
    .line 914
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 915
    .line 916
    const-string v15, "ISOSpeedLatitudezzz"

    .line 917
    .line 918
    move-object/from16 v75, v11

    .line 919
    .line 920
    const v11, 0x8835

    .line 921
    .line 922
    .line 923
    invoke-direct {v9, v15, v11, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 924
    .line 925
    .line 926
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 927
    .line 928
    const-string v11, "ExifVersion"

    .line 929
    .line 930
    const v15, 0x9000

    .line 931
    .line 932
    .line 933
    move-object/from16 v76, v9

    .line 934
    .line 935
    const/4 v9, 0x2

    .line 936
    invoke-direct {v5, v11, v15, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 937
    .line 938
    .line 939
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 940
    .line 941
    const-string v15, "DateTimeOriginal"

    .line 942
    .line 943
    move-object/from16 v77, v5

    .line 944
    .line 945
    const v5, 0x9003

    .line 946
    .line 947
    .line 948
    invoke-direct {v11, v15, v5, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 949
    .line 950
    .line 951
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 952
    .line 953
    const-string v15, "DateTimeDigitized"

    .line 954
    .line 955
    move-object/from16 v78, v11

    .line 956
    .line 957
    const v11, 0x9004

    .line 958
    .line 959
    .line 960
    invoke-direct {v5, v15, v11, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 961
    .line 962
    .line 963
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 964
    .line 965
    const-string v15, "OffsetTime"

    .line 966
    .line 967
    move-object/from16 v79, v5

    .line 968
    .line 969
    const v5, 0x9010

    .line 970
    .line 971
    .line 972
    invoke-direct {v11, v15, v5, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 973
    .line 974
    .line 975
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 976
    .line 977
    const-string v15, "OffsetTimeOriginal"

    .line 978
    .line 979
    move-object/from16 v80, v11

    .line 980
    .line 981
    const v11, 0x9011

    .line 982
    .line 983
    .line 984
    invoke-direct {v5, v15, v11, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 985
    .line 986
    .line 987
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 988
    .line 989
    const-string v15, "OffsetTimeDigitized"

    .line 990
    .line 991
    move-object/from16 v81, v5

    .line 992
    .line 993
    const v5, 0x9012

    .line 994
    .line 995
    .line 996
    invoke-direct {v11, v15, v5, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 997
    .line 998
    .line 999
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1000
    .line 1001
    const-string v9, "ComponentsConfiguration"

    .line 1002
    .line 1003
    const v15, 0x9101

    .line 1004
    .line 1005
    .line 1006
    move-object/from16 v82, v11

    .line 1007
    .line 1008
    const/4 v11, 0x7

    .line 1009
    invoke-direct {v5, v9, v15, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1010
    .line 1011
    .line 1012
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 1013
    .line 1014
    const-string v11, "CompressedBitsPerPixel"

    .line 1015
    .line 1016
    const v15, 0x9102

    .line 1017
    .line 1018
    .line 1019
    move-object/from16 v83, v5

    .line 1020
    .line 1021
    const/4 v5, 0x5

    .line 1022
    invoke-direct {v9, v11, v15, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1023
    .line 1024
    .line 1025
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 1026
    .line 1027
    const-string v15, "ShutterSpeedValue"

    .line 1028
    .line 1029
    const v5, 0x9201

    .line 1030
    .line 1031
    .line 1032
    move-object/from16 v84, v9

    .line 1033
    .line 1034
    const/16 v9, 0xa

    .line 1035
    .line 1036
    invoke-direct {v11, v15, v5, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1037
    .line 1038
    .line 1039
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1040
    .line 1041
    const-string v15, "ApertureValue"

    .line 1042
    .line 1043
    const v9, 0x9202

    .line 1044
    .line 1045
    .line 1046
    move-object/from16 v85, v11

    .line 1047
    .line 1048
    const/4 v11, 0x5

    .line 1049
    invoke-direct {v5, v15, v9, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1050
    .line 1051
    .line 1052
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 1053
    .line 1054
    const-string v11, "BrightnessValue"

    .line 1055
    .line 1056
    const v15, 0x9203

    .line 1057
    .line 1058
    .line 1059
    move-object/from16 v86, v5

    .line 1060
    .line 1061
    const/16 v5, 0xa

    .line 1062
    .line 1063
    invoke-direct {v9, v11, v15, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1064
    .line 1065
    .line 1066
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 1067
    .line 1068
    const-string v15, "ExposureBiasValue"

    .line 1069
    .line 1070
    move-object/from16 v87, v9

    .line 1071
    .line 1072
    const v9, 0x9204

    .line 1073
    .line 1074
    .line 1075
    invoke-direct {v11, v15, v9, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1076
    .line 1077
    .line 1078
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1079
    .line 1080
    const-string v9, "MaxApertureValue"

    .line 1081
    .line 1082
    const v15, 0x9205

    .line 1083
    .line 1084
    .line 1085
    move-object/from16 v88, v11

    .line 1086
    .line 1087
    const/4 v11, 0x5

    .line 1088
    invoke-direct {v5, v9, v15, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1089
    .line 1090
    .line 1091
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 1092
    .line 1093
    const-string v15, "SubjectDistance"

    .line 1094
    .line 1095
    move-object/from16 v89, v5

    .line 1096
    .line 1097
    const v5, 0x9206

    .line 1098
    .line 1099
    .line 1100
    invoke-direct {v9, v15, v5, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1101
    .line 1102
    .line 1103
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1104
    .line 1105
    const-string v11, "MeteringMode"

    .line 1106
    .line 1107
    const v15, 0x9207

    .line 1108
    .line 1109
    .line 1110
    move-object/from16 v90, v9

    .line 1111
    .line 1112
    const/4 v9, 0x3

    .line 1113
    invoke-direct {v5, v11, v15, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1114
    .line 1115
    .line 1116
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 1117
    .line 1118
    const-string v15, "LightSource"

    .line 1119
    .line 1120
    move-object/from16 v91, v5

    .line 1121
    .line 1122
    const v5, 0x9208

    .line 1123
    .line 1124
    .line 1125
    invoke-direct {v11, v15, v5, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1126
    .line 1127
    .line 1128
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1129
    .line 1130
    const-string v15, "Flash"

    .line 1131
    .line 1132
    move-object/from16 v92, v11

    .line 1133
    .line 1134
    const v11, 0x9209

    .line 1135
    .line 1136
    .line 1137
    invoke-direct {v5, v15, v11, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1138
    .line 1139
    .line 1140
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 1141
    .line 1142
    const-string v15, "FocalLength"

    .line 1143
    .line 1144
    const v9, 0x920a

    .line 1145
    .line 1146
    .line 1147
    move-object/from16 v93, v5

    .line 1148
    .line 1149
    const/4 v5, 0x5

    .line 1150
    invoke-direct {v11, v15, v9, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1151
    .line 1152
    .line 1153
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1154
    .line 1155
    const-string v9, "SubjectArea"

    .line 1156
    .line 1157
    const v15, 0x9214

    .line 1158
    .line 1159
    .line 1160
    move-object/from16 v94, v11

    .line 1161
    .line 1162
    const/4 v11, 0x3

    .line 1163
    invoke-direct {v5, v9, v15, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1164
    .line 1165
    .line 1166
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 1167
    .line 1168
    const-string v11, "MakerNote"

    .line 1169
    .line 1170
    const v15, 0x927c

    .line 1171
    .line 1172
    .line 1173
    move-object/from16 v95, v5

    .line 1174
    .line 1175
    const/4 v5, 0x7

    .line 1176
    invoke-direct {v9, v11, v15, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1177
    .line 1178
    .line 1179
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 1180
    .line 1181
    const-string v15, "UserComment"

    .line 1182
    .line 1183
    move-object/from16 v96, v9

    .line 1184
    .line 1185
    const v9, 0x9286

    .line 1186
    .line 1187
    .line 1188
    invoke-direct {v11, v15, v9, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1189
    .line 1190
    .line 1191
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1192
    .line 1193
    const-string v9, "SubSecTime"

    .line 1194
    .line 1195
    const v15, 0x9290

    .line 1196
    .line 1197
    .line 1198
    move-object/from16 v97, v11

    .line 1199
    .line 1200
    const/4 v11, 0x2

    .line 1201
    invoke-direct {v5, v9, v15, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1202
    .line 1203
    .line 1204
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 1205
    .line 1206
    const-string v15, "SubSecTimeOriginal"

    .line 1207
    .line 1208
    move-object/from16 v98, v5

    .line 1209
    .line 1210
    const v5, 0x9291

    .line 1211
    .line 1212
    .line 1213
    invoke-direct {v9, v15, v5, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1214
    .line 1215
    .line 1216
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1217
    .line 1218
    const-string v15, "SubSecTimeDigitized"

    .line 1219
    .line 1220
    move-object/from16 v99, v9

    .line 1221
    .line 1222
    const v9, 0x9292

    .line 1223
    .line 1224
    .line 1225
    invoke-direct {v5, v15, v9, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1226
    .line 1227
    .line 1228
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 1229
    .line 1230
    const-string v11, "FlashpixVersion"

    .line 1231
    .line 1232
    const v15, 0xa000

    .line 1233
    .line 1234
    .line 1235
    move-object/from16 v100, v5

    .line 1236
    .line 1237
    const/4 v5, 0x7

    .line 1238
    invoke-direct {v9, v11, v15, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1239
    .line 1240
    .line 1241
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1242
    .line 1243
    const-string v11, "ColorSpace"

    .line 1244
    .line 1245
    const v15, 0xa001

    .line 1246
    .line 1247
    .line 1248
    move-object/from16 v101, v9

    .line 1249
    .line 1250
    const/4 v9, 0x3

    .line 1251
    invoke-direct {v5, v11, v15, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1252
    .line 1253
    .line 1254
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 1255
    .line 1256
    const-string v15, "PixelXDimension"

    .line 1257
    .line 1258
    move-object/from16 v102, v5

    .line 1259
    .line 1260
    const v5, 0xa002

    .line 1261
    .line 1262
    .line 1263
    move-object/from16 v68, v12

    .line 1264
    .line 1265
    const/4 v12, 0x4

    .line 1266
    invoke-direct {v11, v15, v5, v9, v12}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;III)V

    .line 1267
    .line 1268
    .line 1269
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1270
    .line 1271
    const-string v15, "PixelYDimension"

    .line 1272
    .line 1273
    move-object/from16 v103, v11

    .line 1274
    .line 1275
    const v11, 0xa003

    .line 1276
    .line 1277
    .line 1278
    invoke-direct {v5, v15, v11, v9, v12}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;III)V

    .line 1279
    .line 1280
    .line 1281
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 1282
    .line 1283
    const-string v11, "RelatedSoundFile"

    .line 1284
    .line 1285
    const v15, 0xa004

    .line 1286
    .line 1287
    .line 1288
    const/4 v12, 0x2

    .line 1289
    invoke-direct {v9, v11, v15, v12}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1290
    .line 1291
    .line 1292
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 1293
    .line 1294
    const-string v12, "InteroperabilityIFDPointer"

    .line 1295
    .line 1296
    const v15, 0xa005

    .line 1297
    .line 1298
    .line 1299
    move-object/from16 v104, v5

    .line 1300
    .line 1301
    const/4 v5, 0x4

    .line 1302
    invoke-direct {v11, v12, v15, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1303
    .line 1304
    .line 1305
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1306
    .line 1307
    const-string v12, "FlashEnergy"

    .line 1308
    .line 1309
    const v15, 0xa20b

    .line 1310
    .line 1311
    .line 1312
    move-object/from16 v105, v9

    .line 1313
    .line 1314
    const/4 v9, 0x5

    .line 1315
    invoke-direct {v5, v12, v15, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1316
    .line 1317
    .line 1318
    new-instance v12, Landroidx/exifinterface/media/a$d;

    .line 1319
    .line 1320
    const-string v15, "SpatialFrequencyResponse"

    .line 1321
    .line 1322
    const v9, 0xa20c

    .line 1323
    .line 1324
    .line 1325
    move-object/from16 v107, v5

    .line 1326
    .line 1327
    const/4 v5, 0x7

    .line 1328
    invoke-direct {v12, v15, v9, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1329
    .line 1330
    .line 1331
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1332
    .line 1333
    const-string v9, "FocalPlaneXResolution"

    .line 1334
    .line 1335
    const v15, 0xa20e

    .line 1336
    .line 1337
    .line 1338
    move-object/from16 v106, v11

    .line 1339
    .line 1340
    const/4 v11, 0x5

    .line 1341
    invoke-direct {v5, v9, v15, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1342
    .line 1343
    .line 1344
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 1345
    .line 1346
    const-string v15, "FocalPlaneYResolution"

    .line 1347
    .line 1348
    move-object/from16 v109, v5

    .line 1349
    .line 1350
    const v5, 0xa20f

    .line 1351
    .line 1352
    .line 1353
    invoke-direct {v9, v15, v5, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1354
    .line 1355
    .line 1356
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1357
    .line 1358
    const-string v11, "FocalPlaneResolutionUnit"

    .line 1359
    .line 1360
    const v15, 0xa210

    .line 1361
    .line 1362
    .line 1363
    move-object/from16 v110, v9

    .line 1364
    .line 1365
    const/4 v9, 0x3

    .line 1366
    invoke-direct {v5, v11, v15, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1367
    .line 1368
    .line 1369
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 1370
    .line 1371
    const-string v15, "SubjectLocation"

    .line 1372
    .line 1373
    move-object/from16 v111, v5

    .line 1374
    .line 1375
    const v5, 0xa214

    .line 1376
    .line 1377
    .line 1378
    invoke-direct {v11, v15, v5, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1379
    .line 1380
    .line 1381
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1382
    .line 1383
    const-string v15, "ExposureIndex"

    .line 1384
    .line 1385
    const v9, 0xa215

    .line 1386
    .line 1387
    .line 1388
    move-object/from16 v112, v11

    .line 1389
    .line 1390
    const/4 v11, 0x5

    .line 1391
    invoke-direct {v5, v15, v9, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1392
    .line 1393
    .line 1394
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 1395
    .line 1396
    const-string v11, "SensingMethod"

    .line 1397
    .line 1398
    const v15, 0xa217

    .line 1399
    .line 1400
    .line 1401
    move-object/from16 v113, v5

    .line 1402
    .line 1403
    const/4 v5, 0x3

    .line 1404
    invoke-direct {v9, v11, v15, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1405
    .line 1406
    .line 1407
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1408
    .line 1409
    const-string v11, "FileSource"

    .line 1410
    .line 1411
    const v15, 0xa300

    .line 1412
    .line 1413
    .line 1414
    move-object/from16 v114, v9

    .line 1415
    .line 1416
    const/4 v9, 0x7

    .line 1417
    invoke-direct {v5, v11, v15, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1418
    .line 1419
    .line 1420
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 1421
    .line 1422
    const-string v15, "SceneType"

    .line 1423
    .line 1424
    move-object/from16 v115, v5

    .line 1425
    .line 1426
    const v5, 0xa301

    .line 1427
    .line 1428
    .line 1429
    invoke-direct {v11, v15, v5, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1430
    .line 1431
    .line 1432
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1433
    .line 1434
    const-string v15, "CFAPattern"

    .line 1435
    .line 1436
    move-object/from16 v116, v11

    .line 1437
    .line 1438
    const v11, 0xa302

    .line 1439
    .line 1440
    .line 1441
    invoke-direct {v5, v15, v11, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1442
    .line 1443
    .line 1444
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 1445
    .line 1446
    const-string v11, "CustomRendered"

    .line 1447
    .line 1448
    const v15, 0xa401

    .line 1449
    .line 1450
    .line 1451
    move-object/from16 v117, v5

    .line 1452
    .line 1453
    const/4 v5, 0x3

    .line 1454
    invoke-direct {v9, v11, v15, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1455
    .line 1456
    .line 1457
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 1458
    .line 1459
    const-string v15, "ExposureMode"

    .line 1460
    .line 1461
    move-object/from16 v118, v9

    .line 1462
    .line 1463
    const v9, 0xa402

    .line 1464
    .line 1465
    .line 1466
    invoke-direct {v11, v15, v9, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1467
    .line 1468
    .line 1469
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 1470
    .line 1471
    const-string v15, "WhiteBalance"

    .line 1472
    .line 1473
    move-object/from16 v119, v11

    .line 1474
    .line 1475
    const v11, 0xa403

    .line 1476
    .line 1477
    .line 1478
    invoke-direct {v9, v15, v11, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1479
    .line 1480
    .line 1481
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 1482
    .line 1483
    const-string v15, "DigitalZoomRatio"

    .line 1484
    .line 1485
    const v5, 0xa404

    .line 1486
    .line 1487
    .line 1488
    move-object/from16 v120, v9

    .line 1489
    .line 1490
    const/4 v9, 0x5

    .line 1491
    invoke-direct {v11, v15, v5, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1492
    .line 1493
    .line 1494
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1495
    .line 1496
    const-string v9, "FocalLengthIn35mmFilm"

    .line 1497
    .line 1498
    const v15, 0xa405

    .line 1499
    .line 1500
    .line 1501
    move-object/from16 v121, v11

    .line 1502
    .line 1503
    const/4 v11, 0x3

    .line 1504
    invoke-direct {v5, v9, v15, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1505
    .line 1506
    .line 1507
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 1508
    .line 1509
    const-string v15, "SceneCaptureType"

    .line 1510
    .line 1511
    move-object/from16 v122, v5

    .line 1512
    .line 1513
    const v5, 0xa406

    .line 1514
    .line 1515
    .line 1516
    invoke-direct {v9, v15, v5, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1517
    .line 1518
    .line 1519
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1520
    .line 1521
    const-string v15, "GainControl"

    .line 1522
    .line 1523
    move-object/from16 v123, v9

    .line 1524
    .line 1525
    const v9, 0xa407

    .line 1526
    .line 1527
    .line 1528
    invoke-direct {v5, v15, v9, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1529
    .line 1530
    .line 1531
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 1532
    .line 1533
    const-string v15, "Contrast"

    .line 1534
    .line 1535
    move-object/from16 v124, v5

    .line 1536
    .line 1537
    const v5, 0xa408

    .line 1538
    .line 1539
    .line 1540
    invoke-direct {v9, v15, v5, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1541
    .line 1542
    .line 1543
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1544
    .line 1545
    const-string v15, "Saturation"

    .line 1546
    .line 1547
    move-object/from16 v125, v9

    .line 1548
    .line 1549
    const v9, 0xa409

    .line 1550
    .line 1551
    .line 1552
    invoke-direct {v5, v15, v9, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1553
    .line 1554
    .line 1555
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 1556
    .line 1557
    const-string v15, "Sharpness"

    .line 1558
    .line 1559
    move-object/from16 v126, v5

    .line 1560
    .line 1561
    const v5, 0xa40a

    .line 1562
    .line 1563
    .line 1564
    invoke-direct {v9, v15, v5, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1565
    .line 1566
    .line 1567
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1568
    .line 1569
    const-string v15, "DeviceSettingDescription"

    .line 1570
    .line 1571
    const v11, 0xa40b

    .line 1572
    .line 1573
    .line 1574
    move-object/from16 v127, v9

    .line 1575
    .line 1576
    const/4 v9, 0x7

    .line 1577
    invoke-direct {v5, v15, v11, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1578
    .line 1579
    .line 1580
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 1581
    .line 1582
    const-string v11, "SubjectDistanceRange"

    .line 1583
    .line 1584
    const v15, 0xa40c

    .line 1585
    .line 1586
    .line 1587
    move-object/from16 v128, v5

    .line 1588
    .line 1589
    const/4 v5, 0x3

    .line 1590
    invoke-direct {v9, v11, v15, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1591
    .line 1592
    .line 1593
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1594
    .line 1595
    const-string v11, "ImageUniqueID"

    .line 1596
    .line 1597
    const v15, 0xa420

    .line 1598
    .line 1599
    .line 1600
    move-object/from16 v129, v9

    .line 1601
    .line 1602
    const/4 v9, 0x2

    .line 1603
    invoke-direct {v5, v11, v15, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1604
    .line 1605
    .line 1606
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 1607
    .line 1608
    const-string v15, "CameraOwnerName"

    .line 1609
    .line 1610
    move-object/from16 v130, v5

    .line 1611
    .line 1612
    const v5, 0xa430

    .line 1613
    .line 1614
    .line 1615
    invoke-direct {v11, v15, v5, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1616
    .line 1617
    .line 1618
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1619
    .line 1620
    const-string v15, "BodySerialNumber"

    .line 1621
    .line 1622
    move-object/from16 v131, v11

    .line 1623
    .line 1624
    const v11, 0xa431

    .line 1625
    .line 1626
    .line 1627
    invoke-direct {v5, v15, v11, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1628
    .line 1629
    .line 1630
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 1631
    .line 1632
    const-string v15, "LensSpecification"

    .line 1633
    .line 1634
    const v9, 0xa432

    .line 1635
    .line 1636
    .line 1637
    move-object/from16 v132, v5

    .line 1638
    .line 1639
    const/4 v5, 0x5

    .line 1640
    invoke-direct {v11, v15, v9, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1641
    .line 1642
    .line 1643
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1644
    .line 1645
    const-string v9, "LensMake"

    .line 1646
    .line 1647
    const v15, 0xa433

    .line 1648
    .line 1649
    .line 1650
    move-object/from16 v133, v11

    .line 1651
    .line 1652
    const/4 v11, 0x2

    .line 1653
    invoke-direct {v5, v9, v15, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1654
    .line 1655
    .line 1656
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 1657
    .line 1658
    const-string v15, "LensModel"

    .line 1659
    .line 1660
    move-object/from16 v134, v5

    .line 1661
    .line 1662
    const v5, 0xa434

    .line 1663
    .line 1664
    .line 1665
    invoke-direct {v9, v15, v5, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1666
    .line 1667
    .line 1668
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1669
    .line 1670
    const-string v11, "Gamma"

    .line 1671
    .line 1672
    const v15, 0xa500

    .line 1673
    .line 1674
    .line 1675
    move-object/from16 v135, v9

    .line 1676
    .line 1677
    const/4 v9, 0x5

    .line 1678
    invoke-direct {v5, v11, v15, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1679
    .line 1680
    .line 1681
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 1682
    .line 1683
    const-string v11, "DNGVersion"

    .line 1684
    .line 1685
    const v15, 0xc612

    .line 1686
    .line 1687
    .line 1688
    move-object/from16 v136, v5

    .line 1689
    .line 1690
    const/4 v5, 0x1

    .line 1691
    invoke-direct {v9, v11, v15, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1692
    .line 1693
    .line 1694
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 1695
    .line 1696
    const-string v15, "DefaultCropSize"

    .line 1697
    .line 1698
    const v5, 0xc620

    .line 1699
    .line 1700
    .line 1701
    move-object/from16 v137, v9

    .line 1702
    .line 1703
    move-object/from16 v108, v12

    .line 1704
    .line 1705
    const/4 v9, 0x3

    .line 1706
    const/4 v12, 0x4

    .line 1707
    invoke-direct {v11, v15, v5, v9, v12}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;III)V

    .line 1708
    .line 1709
    .line 1710
    move-object/from16 v138, v11

    .line 1711
    .line 1712
    move-object/from16 v70, v13

    .line 1713
    .line 1714
    filled-new-array/range {v65 .. v138}, [Landroidx/exifinterface/media/a$d;

    .line 1715
    .line 1716
    .line 1717
    move-result-object v65

    .line 1718
    sput-object v65, Landroidx/exifinterface/media/a;->Z:[Landroidx/exifinterface/media/a$d;

    .line 1719
    .line 1720
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1721
    .line 1722
    const-string v9, "GPSVersionID"

    .line 1723
    .line 1724
    const/4 v11, 0x0

    .line 1725
    const/4 v12, 0x1

    .line 1726
    invoke-direct {v5, v9, v11, v12}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1727
    .line 1728
    .line 1729
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 1730
    .line 1731
    const-string v13, "GPSLatitudeRef"

    .line 1732
    .line 1733
    const/4 v15, 0x2

    .line 1734
    invoke-direct {v9, v13, v12, v15}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1735
    .line 1736
    .line 1737
    new-instance v12, Landroidx/exifinterface/media/a$d;

    .line 1738
    .line 1739
    const-string v13, "GPSLatitude"

    .line 1740
    .line 1741
    move-object/from16 v17, v5

    .line 1742
    .line 1743
    move/from16 v49, v11

    .line 1744
    .line 1745
    const/16 v5, 0xa

    .line 1746
    .line 1747
    const/4 v11, 0x5

    .line 1748
    invoke-direct {v12, v13, v15, v11, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;III)V

    .line 1749
    .line 1750
    .line 1751
    new-instance v13, Landroidx/exifinterface/media/a$d;

    .line 1752
    .line 1753
    const-string v5, "GPSLongitudeRef"

    .line 1754
    .line 1755
    const/4 v11, 0x3

    .line 1756
    invoke-direct {v13, v5, v11, v15}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1757
    .line 1758
    .line 1759
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1760
    .line 1761
    const-string v11, "GPSLongitude"

    .line 1762
    .line 1763
    move-object/from16 v18, v9

    .line 1764
    .line 1765
    move-object/from16 v19, v12

    .line 1766
    .line 1767
    const/4 v9, 0x5

    .line 1768
    const/16 v12, 0xa

    .line 1769
    .line 1770
    const/4 v15, 0x4

    .line 1771
    invoke-direct {v5, v11, v15, v9, v12}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;III)V

    .line 1772
    .line 1773
    .line 1774
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 1775
    .line 1776
    const-string v12, "GPSAltitudeRef"

    .line 1777
    .line 1778
    const/4 v15, 0x1

    .line 1779
    invoke-direct {v11, v12, v9, v15}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1780
    .line 1781
    .line 1782
    new-instance v12, Landroidx/exifinterface/media/a$d;

    .line 1783
    .line 1784
    const-string v15, "GPSAltitude"

    .line 1785
    .line 1786
    move-object/from16 v21, v5

    .line 1787
    .line 1788
    const/4 v5, 0x6

    .line 1789
    invoke-direct {v12, v15, v5, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1790
    .line 1791
    .line 1792
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1793
    .line 1794
    const-string v15, "GPSTimeStamp"

    .line 1795
    .line 1796
    move-object/from16 v22, v11

    .line 1797
    .line 1798
    const/4 v11, 0x7

    .line 1799
    invoke-direct {v5, v15, v11, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1800
    .line 1801
    .line 1802
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 1803
    .line 1804
    const-string v11, "GPSSatellites"

    .line 1805
    .line 1806
    move-object/from16 v24, v5

    .line 1807
    .line 1808
    const/4 v5, 0x2

    .line 1809
    const/16 v15, 0x8

    .line 1810
    .line 1811
    invoke-direct {v9, v11, v15, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1812
    .line 1813
    .line 1814
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 1815
    .line 1816
    const-string v15, "GPSStatus"

    .line 1817
    .line 1818
    move-object/from16 v25, v9

    .line 1819
    .line 1820
    const/16 v9, 0x9

    .line 1821
    .line 1822
    invoke-direct {v11, v15, v9, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1823
    .line 1824
    .line 1825
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 1826
    .line 1827
    const-string v15, "GPSMeasureMode"

    .line 1828
    .line 1829
    move-object/from16 v26, v11

    .line 1830
    .line 1831
    const/16 v11, 0xa

    .line 1832
    .line 1833
    invoke-direct {v9, v15, v11, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1834
    .line 1835
    .line 1836
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 1837
    .line 1838
    const-string v15, "GPSDOP"

    .line 1839
    .line 1840
    const/16 v5, 0xb

    .line 1841
    .line 1842
    move-object/from16 v27, v9

    .line 1843
    .line 1844
    const/4 v9, 0x5

    .line 1845
    invoke-direct {v11, v15, v5, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1846
    .line 1847
    .line 1848
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1849
    .line 1850
    const-string v15, "GPSSpeedRef"

    .line 1851
    .line 1852
    const/16 v9, 0xc

    .line 1853
    .line 1854
    move-object/from16 v28, v11

    .line 1855
    .line 1856
    const/4 v11, 0x2

    .line 1857
    invoke-direct {v5, v15, v9, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1858
    .line 1859
    .line 1860
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 1861
    .line 1862
    const-string v15, "GPSSpeed"

    .line 1863
    .line 1864
    const/16 v11, 0xd

    .line 1865
    .line 1866
    move-object/from16 v29, v5

    .line 1867
    .line 1868
    const/4 v5, 0x5

    .line 1869
    invoke-direct {v9, v15, v11, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1870
    .line 1871
    .line 1872
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 1873
    .line 1874
    const-string v15, "GPSTrackRef"

    .line 1875
    .line 1876
    const/16 v5, 0xe

    .line 1877
    .line 1878
    move-object/from16 v30, v9

    .line 1879
    .line 1880
    const/4 v9, 0x2

    .line 1881
    invoke-direct {v11, v15, v5, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1882
    .line 1883
    .line 1884
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1885
    .line 1886
    const-string v15, "GPSTrack"

    .line 1887
    .line 1888
    const/16 v9, 0xf

    .line 1889
    .line 1890
    move-object/from16 v31, v11

    .line 1891
    .line 1892
    const/4 v11, 0x5

    .line 1893
    invoke-direct {v5, v15, v9, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1894
    .line 1895
    .line 1896
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 1897
    .line 1898
    const-string v15, "GPSImgDirectionRef"

    .line 1899
    .line 1900
    const/16 v11, 0x10

    .line 1901
    .line 1902
    move-object/from16 v32, v5

    .line 1903
    .line 1904
    const/4 v5, 0x2

    .line 1905
    invoke-direct {v9, v15, v11, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1906
    .line 1907
    .line 1908
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 1909
    .line 1910
    const-string v15, "GPSImgDirection"

    .line 1911
    .line 1912
    const/16 v5, 0x11

    .line 1913
    .line 1914
    move-object/from16 v33, v9

    .line 1915
    .line 1916
    const/4 v9, 0x5

    .line 1917
    invoke-direct {v11, v15, v5, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1918
    .line 1919
    .line 1920
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1921
    .line 1922
    const-string v9, "GPSMapDatum"

    .line 1923
    .line 1924
    const/16 v15, 0x12

    .line 1925
    .line 1926
    move-object/from16 v34, v11

    .line 1927
    .line 1928
    const/4 v11, 0x2

    .line 1929
    invoke-direct {v5, v9, v15, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1930
    .line 1931
    .line 1932
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 1933
    .line 1934
    const-string v15, "GPSDestLatitudeRef"

    .line 1935
    .line 1936
    move-object/from16 v35, v5

    .line 1937
    .line 1938
    const/16 v5, 0x13

    .line 1939
    .line 1940
    invoke-direct {v9, v15, v5, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1941
    .line 1942
    .line 1943
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1944
    .line 1945
    const-string v15, "GPSDestLatitude"

    .line 1946
    .line 1947
    const/16 v11, 0x14

    .line 1948
    .line 1949
    move-object/from16 v36, v9

    .line 1950
    .line 1951
    const/4 v9, 0x5

    .line 1952
    invoke-direct {v5, v15, v11, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1953
    .line 1954
    .line 1955
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 1956
    .line 1957
    const-string v15, "GPSDestLongitudeRef"

    .line 1958
    .line 1959
    const/16 v9, 0x15

    .line 1960
    .line 1961
    move-object/from16 v37, v5

    .line 1962
    .line 1963
    const/4 v5, 0x2

    .line 1964
    invoke-direct {v11, v15, v9, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1965
    .line 1966
    .line 1967
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 1968
    .line 1969
    const-string v15, "GPSDestLongitude"

    .line 1970
    .line 1971
    const/16 v5, 0x16

    .line 1972
    .line 1973
    move-object/from16 v38, v11

    .line 1974
    .line 1975
    const/4 v11, 0x5

    .line 1976
    invoke-direct {v9, v15, v5, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1977
    .line 1978
    .line 1979
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 1980
    .line 1981
    const-string v15, "GPSDestBearingRef"

    .line 1982
    .line 1983
    const/16 v11, 0x17

    .line 1984
    .line 1985
    move-object/from16 v39, v9

    .line 1986
    .line 1987
    const/4 v9, 0x2

    .line 1988
    invoke-direct {v5, v15, v11, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 1989
    .line 1990
    .line 1991
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 1992
    .line 1993
    const-string v15, "GPSDestBearing"

    .line 1994
    .line 1995
    const/16 v9, 0x18

    .line 1996
    .line 1997
    move-object/from16 v40, v5

    .line 1998
    .line 1999
    const/4 v5, 0x5

    .line 2000
    invoke-direct {v11, v15, v9, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2001
    .line 2002
    .line 2003
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 2004
    .line 2005
    const-string v15, "GPSDestDistanceRef"

    .line 2006
    .line 2007
    const/16 v5, 0x19

    .line 2008
    .line 2009
    move-object/from16 v41, v11

    .line 2010
    .line 2011
    const/4 v11, 0x2

    .line 2012
    invoke-direct {v9, v15, v5, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2013
    .line 2014
    .line 2015
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 2016
    .line 2017
    const-string v11, "GPSDestDistance"

    .line 2018
    .line 2019
    const/16 v15, 0x1a

    .line 2020
    .line 2021
    move-object/from16 v42, v9

    .line 2022
    .line 2023
    const/4 v9, 0x5

    .line 2024
    invoke-direct {v5, v11, v15, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2025
    .line 2026
    .line 2027
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 2028
    .line 2029
    const-string v11, "GPSProcessingMethod"

    .line 2030
    .line 2031
    const/16 v15, 0x1b

    .line 2032
    .line 2033
    move-object/from16 v43, v5

    .line 2034
    .line 2035
    const/4 v5, 0x7

    .line 2036
    invoke-direct {v9, v11, v15, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2037
    .line 2038
    .line 2039
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 2040
    .line 2041
    const-string v15, "GPSAreaInformation"

    .line 2042
    .line 2043
    move-object/from16 v44, v9

    .line 2044
    .line 2045
    const/16 v9, 0x1c

    .line 2046
    .line 2047
    invoke-direct {v11, v15, v9, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2048
    .line 2049
    .line 2050
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 2051
    .line 2052
    const-string v9, "GPSDateStamp"

    .line 2053
    .line 2054
    const/16 v15, 0x1d

    .line 2055
    .line 2056
    move-object/from16 v45, v11

    .line 2057
    .line 2058
    const/4 v11, 0x2

    .line 2059
    invoke-direct {v5, v9, v15, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2060
    .line 2061
    .line 2062
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 2063
    .line 2064
    const-string v11, "GPSDifferential"

    .line 2065
    .line 2066
    const/16 v15, 0x1e

    .line 2067
    .line 2068
    move-object/from16 v46, v5

    .line 2069
    .line 2070
    const/4 v5, 0x3

    .line 2071
    invoke-direct {v9, v11, v15, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2072
    .line 2073
    .line 2074
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 2075
    .line 2076
    const-string v11, "GPSHPositioningError"

    .line 2077
    .line 2078
    const/16 v15, 0x1f

    .line 2079
    .line 2080
    move-object/from16 v47, v9

    .line 2081
    .line 2082
    const/4 v9, 0x5

    .line 2083
    invoke-direct {v5, v11, v15, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2084
    .line 2085
    .line 2086
    move-object/from16 v48, v5

    .line 2087
    .line 2088
    move-object/from16 v23, v12

    .line 2089
    .line 2090
    move-object/from16 v20, v13

    .line 2091
    .line 2092
    filled-new-array/range {v17 .. v48}, [Landroidx/exifinterface/media/a$d;

    .line 2093
    .line 2094
    .line 2095
    move-result-object v66

    .line 2096
    sput-object v66, Landroidx/exifinterface/media/a;->a0:[Landroidx/exifinterface/media/a$d;

    .line 2097
    .line 2098
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 2099
    .line 2100
    const-string v9, "InteroperabilityIndex"

    .line 2101
    .line 2102
    const/4 v11, 0x2

    .line 2103
    const/4 v12, 0x1

    .line 2104
    invoke-direct {v5, v9, v12, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2105
    .line 2106
    .line 2107
    filled-new-array {v5}, [Landroidx/exifinterface/media/a$d;

    .line 2108
    .line 2109
    .line 2110
    move-result-object v67

    .line 2111
    sput-object v67, Landroidx/exifinterface/media/a;->b0:[Landroidx/exifinterface/media/a$d;

    .line 2112
    .line 2113
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 2114
    .line 2115
    const-string v9, "NewSubfileType"

    .line 2116
    .line 2117
    const/16 v11, 0xfe

    .line 2118
    .line 2119
    const/4 v12, 0x4

    .line 2120
    invoke-direct {v5, v9, v11, v12}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2121
    .line 2122
    .line 2123
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 2124
    .line 2125
    const-string v11, "SubfileType"

    .line 2126
    .line 2127
    const/16 v13, 0xff

    .line 2128
    .line 2129
    invoke-direct {v9, v11, v13, v12}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2130
    .line 2131
    .line 2132
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 2133
    .line 2134
    const-string v13, "ThumbnailImageWidth"

    .line 2135
    .line 2136
    move-object/from16 v68, v5

    .line 2137
    .line 2138
    const/16 v5, 0x100

    .line 2139
    .line 2140
    const/4 v15, 0x3

    .line 2141
    invoke-direct {v11, v13, v5, v15, v12}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;III)V

    .line 2142
    .line 2143
    .line 2144
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 2145
    .line 2146
    const-string v13, "ThumbnailImageLength"

    .line 2147
    .line 2148
    move-object/from16 v69, v9

    .line 2149
    .line 2150
    const/16 v9, 0x101

    .line 2151
    .line 2152
    invoke-direct {v5, v13, v9, v15, v12}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;III)V

    .line 2153
    .line 2154
    .line 2155
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 2156
    .line 2157
    const-string v12, "BitsPerSample"

    .line 2158
    .line 2159
    const/16 v13, 0x102

    .line 2160
    .line 2161
    invoke-direct {v9, v12, v13, v15}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2162
    .line 2163
    .line 2164
    new-instance v12, Landroidx/exifinterface/media/a$d;

    .line 2165
    .line 2166
    const-string v13, "Compression"

    .line 2167
    .line 2168
    move-object/from16 v71, v5

    .line 2169
    .line 2170
    const/16 v5, 0x103

    .line 2171
    .line 2172
    invoke-direct {v12, v13, v5, v15}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2173
    .line 2174
    .line 2175
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 2176
    .line 2177
    const-string v13, "PhotometricInterpretation"

    .line 2178
    .line 2179
    move-object/from16 v72, v9

    .line 2180
    .line 2181
    const/16 v9, 0x106

    .line 2182
    .line 2183
    invoke-direct {v5, v13, v9, v15}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2184
    .line 2185
    .line 2186
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 2187
    .line 2188
    const-string v13, "ImageDescription"

    .line 2189
    .line 2190
    const/16 v15, 0x10e

    .line 2191
    .line 2192
    move-object/from16 v74, v5

    .line 2193
    .line 2194
    const/4 v5, 0x2

    .line 2195
    invoke-direct {v9, v13, v15, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2196
    .line 2197
    .line 2198
    new-instance v13, Landroidx/exifinterface/media/a$d;

    .line 2199
    .line 2200
    const-string v15, "Make"

    .line 2201
    .line 2202
    move-object/from16 v75, v9

    .line 2203
    .line 2204
    const/16 v9, 0x10f

    .line 2205
    .line 2206
    invoke-direct {v13, v15, v9, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2207
    .line 2208
    .line 2209
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 2210
    .line 2211
    const-string v15, "Model"

    .line 2212
    .line 2213
    move-object/from16 v70, v11

    .line 2214
    .line 2215
    const/16 v11, 0x110

    .line 2216
    .line 2217
    invoke-direct {v9, v15, v11, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2218
    .line 2219
    .line 2220
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 2221
    .line 2222
    move-object/from16 v77, v9

    .line 2223
    .line 2224
    const/16 v9, 0x111

    .line 2225
    .line 2226
    const/4 v11, 0x3

    .line 2227
    const/4 v15, 0x4

    .line 2228
    invoke-direct {v5, v2, v9, v11, v15}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;III)V

    .line 2229
    .line 2230
    .line 2231
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 2232
    .line 2233
    const-string v15, "ThumbnailOrientation"

    .line 2234
    .line 2235
    move-object/from16 v78, v5

    .line 2236
    .line 2237
    const/16 v5, 0x112

    .line 2238
    .line 2239
    invoke-direct {v9, v15, v5, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2240
    .line 2241
    .line 2242
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 2243
    .line 2244
    const-string v15, "SamplesPerPixel"

    .line 2245
    .line 2246
    move-object/from16 v79, v9

    .line 2247
    .line 2248
    const/16 v9, 0x115

    .line 2249
    .line 2250
    invoke-direct {v5, v15, v9, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2251
    .line 2252
    .line 2253
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 2254
    .line 2255
    const-string v15, "RowsPerStrip"

    .line 2256
    .line 2257
    move-object/from16 v80, v5

    .line 2258
    .line 2259
    const/16 v5, 0x116

    .line 2260
    .line 2261
    move-object/from16 v73, v12

    .line 2262
    .line 2263
    const/4 v12, 0x4

    .line 2264
    invoke-direct {v9, v15, v5, v11, v12}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;III)V

    .line 2265
    .line 2266
    .line 2267
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 2268
    .line 2269
    const-string v15, "StripByteCounts"

    .line 2270
    .line 2271
    move-object/from16 v81, v9

    .line 2272
    .line 2273
    const/16 v9, 0x117

    .line 2274
    .line 2275
    invoke-direct {v5, v15, v9, v11, v12}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;III)V

    .line 2276
    .line 2277
    .line 2278
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 2279
    .line 2280
    const-string v11, "XResolution"

    .line 2281
    .line 2282
    const/16 v12, 0x11a

    .line 2283
    .line 2284
    const/4 v15, 0x5

    .line 2285
    invoke-direct {v9, v11, v12, v15}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2286
    .line 2287
    .line 2288
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 2289
    .line 2290
    const-string v12, "YResolution"

    .line 2291
    .line 2292
    move-object/from16 v82, v5

    .line 2293
    .line 2294
    const/16 v5, 0x11b

    .line 2295
    .line 2296
    invoke-direct {v11, v12, v5, v15}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2297
    .line 2298
    .line 2299
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 2300
    .line 2301
    const-string v12, "PlanarConfiguration"

    .line 2302
    .line 2303
    const/16 v15, 0x11c

    .line 2304
    .line 2305
    move-object/from16 v83, v9

    .line 2306
    .line 2307
    const/4 v9, 0x3

    .line 2308
    invoke-direct {v5, v12, v15, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2309
    .line 2310
    .line 2311
    new-instance v12, Landroidx/exifinterface/media/a$d;

    .line 2312
    .line 2313
    const-string v15, "ResolutionUnit"

    .line 2314
    .line 2315
    move-object/from16 v85, v5

    .line 2316
    .line 2317
    const/16 v5, 0x128

    .line 2318
    .line 2319
    invoke-direct {v12, v15, v5, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2320
    .line 2321
    .line 2322
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 2323
    .line 2324
    const-string v15, "TransferFunction"

    .line 2325
    .line 2326
    move-object/from16 v84, v11

    .line 2327
    .line 2328
    const/16 v11, 0x12d

    .line 2329
    .line 2330
    invoke-direct {v5, v15, v11, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2331
    .line 2332
    .line 2333
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 2334
    .line 2335
    const-string v11, "Software"

    .line 2336
    .line 2337
    const/16 v15, 0x131

    .line 2338
    .line 2339
    move-object/from16 v87, v5

    .line 2340
    .line 2341
    const/4 v5, 0x2

    .line 2342
    invoke-direct {v9, v11, v15, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2343
    .line 2344
    .line 2345
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 2346
    .line 2347
    const-string v15, "DateTime"

    .line 2348
    .line 2349
    move-object/from16 v88, v9

    .line 2350
    .line 2351
    const/16 v9, 0x132

    .line 2352
    .line 2353
    invoke-direct {v11, v15, v9, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2354
    .line 2355
    .line 2356
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 2357
    .line 2358
    const-string v15, "Artist"

    .line 2359
    .line 2360
    move-object/from16 v89, v11

    .line 2361
    .line 2362
    const/16 v11, 0x13b

    .line 2363
    .line 2364
    invoke-direct {v9, v15, v11, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2365
    .line 2366
    .line 2367
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 2368
    .line 2369
    const-string v11, "WhitePoint"

    .line 2370
    .line 2371
    const/16 v15, 0x13e

    .line 2372
    .line 2373
    move-object/from16 v90, v9

    .line 2374
    .line 2375
    const/4 v9, 0x5

    .line 2376
    invoke-direct {v5, v11, v15, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2377
    .line 2378
    .line 2379
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 2380
    .line 2381
    const-string v15, "PrimaryChromaticities"

    .line 2382
    .line 2383
    move-object/from16 v91, v5

    .line 2384
    .line 2385
    const/16 v5, 0x13f

    .line 2386
    .line 2387
    invoke-direct {v11, v15, v5, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2388
    .line 2389
    .line 2390
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 2391
    .line 2392
    const/16 v9, 0x14a

    .line 2393
    .line 2394
    const/4 v15, 0x4

    .line 2395
    invoke-direct {v5, v4, v9, v15}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2396
    .line 2397
    .line 2398
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 2399
    .line 2400
    move-object/from16 v93, v5

    .line 2401
    .line 2402
    const-string v5, "JPEGInterchangeFormat"

    .line 2403
    .line 2404
    move-object/from16 v92, v11

    .line 2405
    .line 2406
    const/16 v11, 0x201

    .line 2407
    .line 2408
    invoke-direct {v9, v5, v11, v15}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2409
    .line 2410
    .line 2411
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 2412
    .line 2413
    const-string v11, "JPEGInterchangeFormatLength"

    .line 2414
    .line 2415
    move-object/from16 v94, v9

    .line 2416
    .line 2417
    const/16 v9, 0x202

    .line 2418
    .line 2419
    invoke-direct {v5, v11, v9, v15}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2420
    .line 2421
    .line 2422
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 2423
    .line 2424
    const-string v11, "YCbCrCoefficients"

    .line 2425
    .line 2426
    const/16 v15, 0x211

    .line 2427
    .line 2428
    move-object/from16 v95, v5

    .line 2429
    .line 2430
    const/4 v5, 0x5

    .line 2431
    invoke-direct {v9, v11, v15, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2432
    .line 2433
    .line 2434
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 2435
    .line 2436
    const-string v11, "YCbCrSubSampling"

    .line 2437
    .line 2438
    const/16 v15, 0x212

    .line 2439
    .line 2440
    move-object/from16 v96, v9

    .line 2441
    .line 2442
    const/4 v9, 0x3

    .line 2443
    invoke-direct {v5, v11, v15, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2444
    .line 2445
    .line 2446
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 2447
    .line 2448
    const-string v15, "YCbCrPositioning"

    .line 2449
    .line 2450
    move-object/from16 v97, v5

    .line 2451
    .line 2452
    const/16 v5, 0x213

    .line 2453
    .line 2454
    invoke-direct {v11, v15, v5, v9}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2455
    .line 2456
    .line 2457
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 2458
    .line 2459
    const-string v9, "ReferenceBlackWhite"

    .line 2460
    .line 2461
    const/16 v15, 0x214

    .line 2462
    .line 2463
    move-object/from16 v98, v11

    .line 2464
    .line 2465
    const/4 v11, 0x5

    .line 2466
    invoke-direct {v5, v9, v15, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2467
    .line 2468
    .line 2469
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 2470
    .line 2471
    const-string v11, "Copyright"

    .line 2472
    .line 2473
    const v15, 0x8298

    .line 2474
    .line 2475
    .line 2476
    move-object/from16 v99, v5

    .line 2477
    .line 2478
    const/4 v5, 0x2

    .line 2479
    invoke-direct {v9, v11, v15, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2480
    .line 2481
    .line 2482
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 2483
    .line 2484
    const v11, 0x8769

    .line 2485
    .line 2486
    .line 2487
    const/4 v15, 0x4

    .line 2488
    invoke-direct {v5, v6, v11, v15}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2489
    .line 2490
    .line 2491
    new-instance v11, Landroidx/exifinterface/media/a$d;

    .line 2492
    .line 2493
    move-object/from16 v101, v5

    .line 2494
    .line 2495
    const v5, 0x8825

    .line 2496
    .line 2497
    .line 2498
    invoke-direct {v11, v0, v5, v15}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2499
    .line 2500
    .line 2501
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 2502
    .line 2503
    const-string v15, "DNGVersion"

    .line 2504
    .line 2505
    move-object/from16 v100, v9

    .line 2506
    .line 2507
    const v9, 0xc612

    .line 2508
    .line 2509
    .line 2510
    move-object/from16 v102, v11

    .line 2511
    .line 2512
    const/4 v11, 0x1

    .line 2513
    invoke-direct {v5, v15, v9, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2514
    .line 2515
    .line 2516
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 2517
    .line 2518
    const-string v11, "DefaultCropSize"

    .line 2519
    .line 2520
    const v15, 0xc620

    .line 2521
    .line 2522
    .line 2523
    move-object/from16 v103, v5

    .line 2524
    .line 2525
    move-object/from16 v86, v12

    .line 2526
    .line 2527
    const/4 v5, 0x3

    .line 2528
    const/4 v12, 0x4

    .line 2529
    invoke-direct {v9, v11, v15, v5, v12}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;III)V

    .line 2530
    .line 2531
    .line 2532
    move-object/from16 v104, v9

    .line 2533
    .line 2534
    move-object/from16 v76, v13

    .line 2535
    .line 2536
    filled-new-array/range {v68 .. v104}, [Landroidx/exifinterface/media/a$d;

    .line 2537
    .line 2538
    .line 2539
    move-result-object v68

    .line 2540
    sput-object v68, Landroidx/exifinterface/media/a;->c0:[Landroidx/exifinterface/media/a$d;

    .line 2541
    .line 2542
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 2543
    .line 2544
    const/16 v11, 0x111

    .line 2545
    .line 2546
    invoke-direct {v9, v2, v11, v5}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2547
    .line 2548
    .line 2549
    sput-object v9, Landroidx/exifinterface/media/a;->d0:Landroidx/exifinterface/media/a$d;

    .line 2550
    .line 2551
    new-instance v2, Landroidx/exifinterface/media/a$d;

    .line 2552
    .line 2553
    const-string v5, "ThumbnailImage"

    .line 2554
    .line 2555
    const/16 v9, 0x100

    .line 2556
    .line 2557
    const/4 v11, 0x7

    .line 2558
    invoke-direct {v2, v5, v9, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2559
    .line 2560
    .line 2561
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 2562
    .line 2563
    const-string v9, "CameraSettingsIFDPointer"

    .line 2564
    .line 2565
    const/16 v11, 0x2020

    .line 2566
    .line 2567
    const/4 v12, 0x4

    .line 2568
    invoke-direct {v5, v9, v11, v12}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2569
    .line 2570
    .line 2571
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 2572
    .line 2573
    const-string v11, "ImageProcessingIFDPointer"

    .line 2574
    .line 2575
    const/16 v13, 0x2040

    .line 2576
    .line 2577
    invoke-direct {v9, v11, v13, v12}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2578
    .line 2579
    .line 2580
    filled-new-array {v2, v5, v9}, [Landroidx/exifinterface/media/a$d;

    .line 2581
    .line 2582
    .line 2583
    move-result-object v70

    .line 2584
    sput-object v70, Landroidx/exifinterface/media/a;->e0:[Landroidx/exifinterface/media/a$d;

    .line 2585
    .line 2586
    new-instance v2, Landroidx/exifinterface/media/a$d;

    .line 2587
    .line 2588
    const-string v5, "PreviewImageStart"

    .line 2589
    .line 2590
    const/16 v9, 0x101

    .line 2591
    .line 2592
    invoke-direct {v2, v5, v9, v12}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2593
    .line 2594
    .line 2595
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 2596
    .line 2597
    const-string v9, "PreviewImageLength"

    .line 2598
    .line 2599
    const/16 v13, 0x102

    .line 2600
    .line 2601
    invoke-direct {v5, v9, v13, v12}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2602
    .line 2603
    .line 2604
    filled-new-array {v2, v5}, [Landroidx/exifinterface/media/a$d;

    .line 2605
    .line 2606
    .line 2607
    move-result-object v71

    .line 2608
    sput-object v71, Landroidx/exifinterface/media/a;->f0:[Landroidx/exifinterface/media/a$d;

    .line 2609
    .line 2610
    new-instance v2, Landroidx/exifinterface/media/a$d;

    .line 2611
    .line 2612
    const-string v5, "AspectFrame"

    .line 2613
    .line 2614
    const/16 v9, 0x1113

    .line 2615
    .line 2616
    const/4 v11, 0x3

    .line 2617
    invoke-direct {v2, v5, v9, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2618
    .line 2619
    .line 2620
    filled-new-array {v2}, [Landroidx/exifinterface/media/a$d;

    .line 2621
    .line 2622
    .line 2623
    move-result-object v72

    .line 2624
    sput-object v72, Landroidx/exifinterface/media/a;->g0:[Landroidx/exifinterface/media/a$d;

    .line 2625
    .line 2626
    new-instance v2, Landroidx/exifinterface/media/a$d;

    .line 2627
    .line 2628
    const-string v5, "ColorSpace"

    .line 2629
    .line 2630
    const/16 v9, 0x37

    .line 2631
    .line 2632
    invoke-direct {v2, v5, v9, v11}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2633
    .line 2634
    .line 2635
    filled-new-array {v2}, [Landroidx/exifinterface/media/a$d;

    .line 2636
    .line 2637
    .line 2638
    move-result-object v73

    .line 2639
    sput-object v73, Landroidx/exifinterface/media/a;->h0:[Landroidx/exifinterface/media/a$d;

    .line 2640
    .line 2641
    move-object/from16 v69, v64

    .line 2642
    .line 2643
    filled-new-array/range {v64 .. v73}, [[Landroidx/exifinterface/media/a$d;

    .line 2644
    .line 2645
    .line 2646
    move-result-object v2

    .line 2647
    sput-object v2, Landroidx/exifinterface/media/a;->i0:[[Landroidx/exifinterface/media/a$d;

    .line 2648
    .line 2649
    new-instance v15, Landroidx/exifinterface/media/a$d;

    .line 2650
    .line 2651
    const/16 v9, 0x14a

    .line 2652
    .line 2653
    const/4 v12, 0x4

    .line 2654
    invoke-direct {v15, v4, v9, v12}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2655
    .line 2656
    .line 2657
    new-instance v4, Landroidx/exifinterface/media/a$d;

    .line 2658
    .line 2659
    const v11, 0x8769

    .line 2660
    .line 2661
    .line 2662
    invoke-direct {v4, v6, v11, v12}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2663
    .line 2664
    .line 2665
    new-instance v5, Landroidx/exifinterface/media/a$d;

    .line 2666
    .line 2667
    const v6, 0x8825

    .line 2668
    .line 2669
    .line 2670
    invoke-direct {v5, v0, v6, v12}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2671
    .line 2672
    .line 2673
    new-instance v0, Landroidx/exifinterface/media/a$d;

    .line 2674
    .line 2675
    const-string v6, "InteroperabilityIFDPointer"

    .line 2676
    .line 2677
    const v9, 0xa005

    .line 2678
    .line 2679
    .line 2680
    invoke-direct {v0, v6, v9, v12}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2681
    .line 2682
    .line 2683
    new-instance v6, Landroidx/exifinterface/media/a$d;

    .line 2684
    .line 2685
    const-string v9, "CameraSettingsIFDPointer"

    .line 2686
    .line 2687
    const/16 v11, 0x2020

    .line 2688
    .line 2689
    const/4 v12, 0x1

    .line 2690
    invoke-direct {v6, v9, v11, v12}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2691
    .line 2692
    .line 2693
    new-instance v9, Landroidx/exifinterface/media/a$d;

    .line 2694
    .line 2695
    const-string v11, "ImageProcessingIFDPointer"

    .line 2696
    .line 2697
    const/16 v13, 0x2040

    .line 2698
    .line 2699
    invoke-direct {v9, v11, v13, v12}, Landroidx/exifinterface/media/a$d;-><init>(Ljava/lang/String;II)V

    .line 2700
    .line 2701
    .line 2702
    move-object/from16 v18, v0

    .line 2703
    .line 2704
    move-object/from16 v16, v4

    .line 2705
    .line 2706
    move-object/from16 v17, v5

    .line 2707
    .line 2708
    move-object/from16 v19, v6

    .line 2709
    .line 2710
    move-object/from16 v20, v9

    .line 2711
    .line 2712
    filled-new-array/range {v15 .. v20}, [Landroidx/exifinterface/media/a$d;

    .line 2713
    .line 2714
    .line 2715
    move-result-object v0

    .line 2716
    sput-object v0, Landroidx/exifinterface/media/a;->j0:[Landroidx/exifinterface/media/a$d;

    .line 2717
    .line 2718
    array-length v0, v2

    .line 2719
    new-array v0, v0, [Ljava/util/HashMap;

    .line 2720
    .line 2721
    sput-object v0, Landroidx/exifinterface/media/a;->k0:[Ljava/util/HashMap;

    .line 2722
    .line 2723
    array-length v0, v2

    .line 2724
    new-array v0, v0, [Ljava/util/HashMap;

    .line 2725
    .line 2726
    sput-object v0, Landroidx/exifinterface/media/a;->l0:[Ljava/util/HashMap;

    .line 2727
    .line 2728
    new-instance v0, Ljava/util/HashSet;

    .line 2729
    .line 2730
    const-string v2, "SubjectDistance"

    .line 2731
    .line 2732
    const-string v4, "GPSTimeStamp"

    .line 2733
    .line 2734
    const-string v5, "FNumber"

    .line 2735
    .line 2736
    const-string v6, "DigitalZoomRatio"

    .line 2737
    .line 2738
    const-string v9, "ExposureTime"

    .line 2739
    .line 2740
    filled-new-array {v5, v6, v9, v2, v4}, [Ljava/lang/String;

    .line 2741
    .line 2742
    .line 2743
    move-result-object v2

    .line 2744
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 2745
    .line 2746
    .line 2747
    move-result-object v2

    .line 2748
    invoke-direct {v0, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 2749
    .line 2750
    .line 2751
    sput-object v0, Landroidx/exifinterface/media/a;->m0:Ljava/util/HashSet;

    .line 2752
    .line 2753
    new-instance v0, Ljava/util/HashMap;

    .line 2754
    .line 2755
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 2756
    .line 2757
    .line 2758
    sput-object v0, Landroidx/exifinterface/media/a;->n0:Ljava/util/HashMap;

    .line 2759
    .line 2760
    const-string v0, "US-ASCII"

    .line 2761
    .line 2762
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 2763
    .line 2764
    .line 2765
    move-result-object v0

    .line 2766
    sput-object v0, Landroidx/exifinterface/media/a;->o0:Ljava/nio/charset/Charset;

    .line 2767
    .line 2768
    const-string v2, "Exif\u0000\u0000"

    .line 2769
    .line 2770
    invoke-virtual {v2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 2771
    .line 2772
    .line 2773
    move-result-object v2

    .line 2774
    sput-object v2, Landroidx/exifinterface/media/a;->p0:[B

    .line 2775
    .line 2776
    const-string v2, "http://ns.adobe.com/xap/1.0/\u0000"

    .line 2777
    .line 2778
    invoke-virtual {v2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 2779
    .line 2780
    .line 2781
    move-result-object v0

    .line 2782
    sput-object v0, Landroidx/exifinterface/media/a;->q0:[B

    .line 2783
    .line 2784
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 2785
    .line 2786
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 2787
    .line 2788
    const-string v4, "yyyy:MM:dd HH:mm:ss"

    .line 2789
    .line 2790
    invoke-direct {v0, v4, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 2791
    .line 2792
    .line 2793
    sput-object v0, Landroidx/exifinterface/media/a;->T:Ljava/text/SimpleDateFormat;

    .line 2794
    .line 2795
    const-string v4, "UTC"

    .line 2796
    .line 2797
    invoke-static {v4}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 2798
    .line 2799
    .line 2800
    move-result-object v4

    .line 2801
    invoke-virtual {v0, v4}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 2802
    .line 2803
    .line 2804
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 2805
    .line 2806
    const-string v4, "yyyy-MM-dd HH:mm:ss"

    .line 2807
    .line 2808
    invoke-direct {v0, v4, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 2809
    .line 2810
    .line 2811
    sput-object v0, Landroidx/exifinterface/media/a;->U:Ljava/text/SimpleDateFormat;

    .line 2812
    .line 2813
    const-string v2, "UTC"

    .line 2814
    .line 2815
    invoke-static {v2}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 2816
    .line 2817
    .line 2818
    move-result-object v2

    .line 2819
    invoke-virtual {v0, v2}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 2820
    .line 2821
    .line 2822
    move/from16 v0, v49

    .line 2823
    .line 2824
    :goto_0
    sget-object v2, Landroidx/exifinterface/media/a;->i0:[[Landroidx/exifinterface/media/a$d;

    .line 2825
    .line 2826
    array-length v4, v2

    .line 2827
    if-ge v0, v4, :cond_1

    .line 2828
    .line 2829
    sget-object v4, Landroidx/exifinterface/media/a;->k0:[Ljava/util/HashMap;

    .line 2830
    .line 2831
    new-instance v5, Ljava/util/HashMap;

    .line 2832
    .line 2833
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 2834
    .line 2835
    .line 2836
    aput-object v5, v4, v0

    .line 2837
    .line 2838
    sget-object v4, Landroidx/exifinterface/media/a;->l0:[Ljava/util/HashMap;

    .line 2839
    .line 2840
    new-instance v5, Ljava/util/HashMap;

    .line 2841
    .line 2842
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 2843
    .line 2844
    .line 2845
    aput-object v5, v4, v0

    .line 2846
    .line 2847
    aget-object v2, v2, v0

    .line 2848
    .line 2849
    array-length v4, v2

    .line 2850
    move/from16 v5, v49

    .line 2851
    .line 2852
    :goto_1
    if-ge v5, v4, :cond_0

    .line 2853
    .line 2854
    aget-object v6, v2, v5

    .line 2855
    .line 2856
    sget-object v9, Landroidx/exifinterface/media/a;->k0:[Ljava/util/HashMap;

    .line 2857
    .line 2858
    aget-object v9, v9, v0

    .line 2859
    .line 2860
    iget v11, v6, Landroidx/exifinterface/media/a$d;->a:I

    .line 2861
    .line 2862
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2863
    .line 2864
    .line 2865
    move-result-object v11

    .line 2866
    invoke-virtual {v9, v11, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2867
    .line 2868
    .line 2869
    sget-object v9, Landroidx/exifinterface/media/a;->l0:[Ljava/util/HashMap;

    .line 2870
    .line 2871
    aget-object v9, v9, v0

    .line 2872
    .line 2873
    iget-object v11, v6, Landroidx/exifinterface/media/a$d;->b:Ljava/lang/String;

    .line 2874
    .line 2875
    invoke-virtual {v9, v11, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2876
    .line 2877
    .line 2878
    add-int/lit8 v5, v5, 0x1

    .line 2879
    .line 2880
    goto :goto_1

    .line 2881
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 2882
    .line 2883
    goto :goto_0

    .line 2884
    :cond_1
    sget-object v0, Landroidx/exifinterface/media/a;->n0:Ljava/util/HashMap;

    .line 2885
    .line 2886
    sget-object v2, Landroidx/exifinterface/media/a;->j0:[Landroidx/exifinterface/media/a$d;

    .line 2887
    .line 2888
    aget-object v4, v2, v49

    .line 2889
    .line 2890
    iget v4, v4, Landroidx/exifinterface/media/a$d;->a:I

    .line 2891
    .line 2892
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2893
    .line 2894
    .line 2895
    move-result-object v4

    .line 2896
    invoke-virtual {v0, v4, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2897
    .line 2898
    .line 2899
    const/16 v59, 0x1

    .line 2900
    .line 2901
    aget-object v4, v2, v59

    .line 2902
    .line 2903
    iget v4, v4, Landroidx/exifinterface/media/a$d;->a:I

    .line 2904
    .line 2905
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2906
    .line 2907
    .line 2908
    move-result-object v4

    .line 2909
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2910
    .line 2911
    .line 2912
    const/16 v62, 0x2

    .line 2913
    .line 2914
    aget-object v3, v2, v62

    .line 2915
    .line 2916
    iget v3, v3, Landroidx/exifinterface/media/a$d;->a:I

    .line 2917
    .line 2918
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2919
    .line 2920
    .line 2921
    move-result-object v3

    .line 2922
    invoke-virtual {v0, v3, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2923
    .line 2924
    .line 2925
    const/16 v63, 0x3

    .line 2926
    .line 2927
    aget-object v3, v2, v63

    .line 2928
    .line 2929
    iget v3, v3, Landroidx/exifinterface/media/a$d;->a:I

    .line 2930
    .line 2931
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2932
    .line 2933
    .line 2934
    move-result-object v3

    .line 2935
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2936
    .line 2937
    .line 2938
    const/16 v61, 0x4

    .line 2939
    .line 2940
    aget-object v1, v2, v61

    .line 2941
    .line 2942
    iget v1, v1, Landroidx/exifinterface/media/a$d;->a:I

    .line 2943
    .line 2944
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2945
    .line 2946
    .line 2947
    move-result-object v1

    .line 2948
    invoke-virtual {v0, v1, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2949
    .line 2950
    .line 2951
    const/16 v60, 0x5

    .line 2952
    .line 2953
    aget-object v1, v2, v60

    .line 2954
    .line 2955
    iget v1, v1, Landroidx/exifinterface/media/a$d;->a:I

    .line 2956
    .line 2957
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2958
    .line 2959
    .line 2960
    move-result-object v1

    .line 2961
    invoke-virtual {v0, v1, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2962
    .line 2963
    .line 2964
    const-string v0, ".*[1-9].*"

    .line 2965
    .line 2966
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 2967
    .line 2968
    .line 2969
    move-result-object v0

    .line 2970
    sput-object v0, Landroidx/exifinterface/media/a;->r0:Ljava/util/regex/Pattern;

    .line 2971
    .line 2972
    const-string v0, "^(\\d{2}):(\\d{2}):(\\d{2})$"

    .line 2973
    .line 2974
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 2975
    .line 2976
    .line 2977
    move-result-object v0

    .line 2978
    sput-object v0, Landroidx/exifinterface/media/a;->s0:Ljava/util/regex/Pattern;

    .line 2979
    .line 2980
    const-string v0, "^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$"

    .line 2981
    .line 2982
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 2983
    .line 2984
    .line 2985
    move-result-object v0

    .line 2986
    sput-object v0, Landroidx/exifinterface/media/a;->t0:Ljava/util/regex/Pattern;

    .line 2987
    .line 2988
    const-string v0, "^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$"

    .line 2989
    .line 2990
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 2991
    .line 2992
    .line 2993
    move-result-object v0

    .line 2994
    sput-object v0, Landroidx/exifinterface/media/a;->u0:Ljava/util/regex/Pattern;

    .line 2995
    .line 2996
    return-void

    .line 2997
    :array_0
    .array-data 1
        -0x1t
        -0x28t
        -0x1t
    .end array-data

    .line 2998
    .line 2999
    .line 3000
    .line 3001
    .line 3002
    .line 3003
    :array_1
    .array-data 1
        0x66t
        0x74t
        0x79t
        0x70t
    .end array-data

    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    .line 3009
    :array_2
    .array-data 1
        0x6dt
        0x69t
        0x66t
        0x31t
    .end array-data

    .line 3010
    .line 3011
    .line 3012
    .line 3013
    .line 3014
    .line 3015
    :array_3
    .array-data 1
        0x68t
        0x65t
        0x69t
        0x63t
    .end array-data

    .line 3016
    .line 3017
    .line 3018
    .line 3019
    .line 3020
    .line 3021
    :array_4
    .array-data 1
        0x4ft
        0x4ct
        0x59t
        0x4dt
        0x50t
        0x0t
    .end array-data

    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    nop

    .line 3029
    :array_5
    .array-data 1
        0x4ft
        0x4ct
        0x59t
        0x4dt
        0x50t
        0x55t
        0x53t
        0x0t
        0x49t
        0x49t
    .end array-data

    .line 3030
    .line 3031
    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    nop

    :array_6
    .array-data 1
        -0x77t
        0x50t
        0x4et
        0x47t
        0xdt
        0xat
        0x1at
        0xat
    .end array-data

    :array_7
    .array-data 1
        0x65t
        0x58t
        0x49t
        0x66t
    .end array-data

    :array_8
    .array-data 1
        0x49t
        0x48t
        0x44t
        0x52t
    .end array-data

    :array_9
    .array-data 1
        0x49t
        0x45t
        0x4et
        0x44t
    .end array-data

    :array_a
    .array-data 1
        0x52t
        0x49t
        0x46t
        0x46t
    .end array-data

    :array_b
    .array-data 1
        0x57t
        0x45t
        0x42t
        0x50t
    .end array-data

    :array_c
    .array-data 1
        0x45t
        0x58t
        0x49t
        0x46t
    .end array-data

    :array_d
    .array-data 1
        -0x63t
        0x1t
        0x2at
    .end array-data

    :array_e
    .array-data 4
        0x0
        0x1
        0x1
        0x2
        0x4
        0x8
        0x1
        0x1
        0x2
        0x4
        0x8
        0x4
        0x8
        0x1
    .end array-data

    :array_f
    .array-data 1
        0x41t
        0x53t
        0x43t
        0x49t
        0x49t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Landroidx/exifinterface/media/a;-><init>(Ljava/io/InputStream;I)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, Landroidx/exifinterface/media/a;->i0:[[Landroidx/exifinterface/media/a$d;

    array-length v1, v0

    new-array v1, v1, [Ljava/util/HashMap;

    iput-object v1, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 4
    new-instance v1, Ljava/util/HashSet;

    array-length v0, v0

    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(I)V

    iput-object v1, p0, Landroidx/exifinterface/media/a;->g:Ljava/util/Set;

    .line 5
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    iput-object v0, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    if-eqz p1, :cond_4

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Landroidx/exifinterface/media/a;->a:Ljava/lang/String;

    const/4 v1, 0x1

    if-ne p2, v1, :cond_1

    .line 7
    new-instance p2, Ljava/io/BufferedInputStream;

    sget-object v2, Landroidx/exifinterface/media/a;->p0:[B

    array-length v2, v2

    invoke-direct {p2, p1, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 8
    invoke-static {p2}, Landroidx/exifinterface/media/a;->r(Ljava/io/BufferedInputStream;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 9
    const-string p1, "ExifInterface"

    const-string p2, "Given data does not follow the structure of an Exif-only data."

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 10
    :cond_0
    iput-boolean v1, p0, Landroidx/exifinterface/media/a;->e:Z

    .line 11
    iput-object v0, p0, Landroidx/exifinterface/media/a;->c:Landroid/content/res/AssetManager$AssetInputStream;

    .line 12
    iput-object v0, p0, Landroidx/exifinterface/media/a;->b:Ljava/io/FileDescriptor;

    move-object p1, p2

    goto :goto_0

    .line 13
    :cond_1
    instance-of p2, p1, Landroid/content/res/AssetManager$AssetInputStream;

    if-eqz p2, :cond_2

    .line 14
    move-object p2, p1

    check-cast p2, Landroid/content/res/AssetManager$AssetInputStream;

    iput-object p2, p0, Landroidx/exifinterface/media/a;->c:Landroid/content/res/AssetManager$AssetInputStream;

    .line 15
    iput-object v0, p0, Landroidx/exifinterface/media/a;->b:Ljava/io/FileDescriptor;

    goto :goto_0

    .line 16
    :cond_2
    instance-of p2, p1, Ljava/io/FileInputStream;

    if-eqz p2, :cond_3

    move-object p2, p1

    check-cast p2, Ljava/io/FileInputStream;

    .line 17
    invoke-virtual {p2}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-static {v1}, Landroidx/exifinterface/media/a;->z(Ljava/io/FileDescriptor;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 18
    iput-object v0, p0, Landroidx/exifinterface/media/a;->c:Landroid/content/res/AssetManager$AssetInputStream;

    .line 19
    invoke-virtual {p2}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object p2

    iput-object p2, p0, Landroidx/exifinterface/media/a;->b:Ljava/io/FileDescriptor;

    goto :goto_0

    .line 20
    :cond_3
    iput-object v0, p0, Landroidx/exifinterface/media/a;->c:Landroid/content/res/AssetManager$AssetInputStream;

    .line 21
    iput-object v0, p0, Landroidx/exifinterface/media/a;->b:Ljava/io/FileDescriptor;

    .line 22
    :goto_0
    invoke-direct {p0, p1}, Landroidx/exifinterface/media/a;->D(Ljava/io/InputStream;)V

    return-void

    .line 23
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "inputStream cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private A(Ljava/util/HashMap;)Z
    .locals 5

    .line 1
    const-string v0, "BitsPerSample"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/exifinterface/media/a$c;

    .line 8
    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroidx/exifinterface/media/a$c;->k(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, [I

    .line 18
    .line 19
    sget-object v1, Landroidx/exifinterface/media/a;->x:[I

    .line 20
    .line 21
    invoke-static {v1, v0}, Ljava/util/Arrays;->equals([I[I)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x1

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    return v3

    .line 29
    :cond_0
    iget v2, p0, Landroidx/exifinterface/media/a;->d:I

    .line 30
    .line 31
    const/4 v4, 0x3

    .line 32
    if-ne v2, v4, :cond_3

    .line 33
    .line 34
    const-string v2, "PhotometricInterpretation"

    .line 35
    .line 36
    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Landroidx/exifinterface/media/a$c;

    .line 41
    .line 42
    if-eqz p1, :cond_3

    .line 43
    .line 44
    iget-object v2, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 45
    .line 46
    invoke-virtual {p1, v2}, Landroidx/exifinterface/media/a$c;->i(Ljava/nio/ByteOrder;)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-ne p1, v3, :cond_1

    .line 51
    .line 52
    sget-object v2, Landroidx/exifinterface/media/a;->z:[I

    .line 53
    .line 54
    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([I[I)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-nez v2, :cond_2

    .line 59
    .line 60
    :cond_1
    const/4 v2, 0x6

    .line 61
    if-ne p1, v2, :cond_3

    .line 62
    .line 63
    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([I[I)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_3

    .line 68
    .line 69
    :cond_2
    return v3

    .line 70
    :cond_3
    sget-boolean p1, Landroidx/exifinterface/media/a;->u:Z

    .line 71
    .line 72
    if-eqz p1, :cond_4

    .line 73
    .line 74
    const-string p1, "ExifInterface"

    .line 75
    .line 76
    const-string v0, "Unsupported data type value"

    .line 77
    .line 78
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    :cond_4
    const/4 p1, 0x0

    .line 82
    return p1
.end method

.method private B(Ljava/util/HashMap;)Z
    .locals 2

    .line 1
    const-string v0, "ImageLength"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/exifinterface/media/a$c;

    .line 8
    .line 9
    const-string v1, "ImageWidth"

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Landroidx/exifinterface/media/a$c;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroidx/exifinterface/media/a$c;->i(Ljava/nio/ByteOrder;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-object v1, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 28
    .line 29
    invoke-virtual {p1, v1}, Landroidx/exifinterface/media/a$c;->i(Ljava/nio/ByteOrder;)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    const/16 v1, 0x200

    .line 34
    .line 35
    if-gt v0, v1, :cond_0

    .line 36
    .line 37
    if-gt p1, v1, :cond_0

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    return p1

    .line 41
    :cond_0
    const/4 p1, 0x0

    .line 42
    return p1
.end method

.method private C([B)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    sget-object v2, Landroidx/exifinterface/media/a;->K:[B

    .line 4
    .line 5
    array-length v3, v2

    .line 6
    if-ge v1, v3, :cond_1

    .line 7
    .line 8
    aget-byte v3, p1, v1

    .line 9
    .line 10
    aget-byte v2, v2, v1

    .line 11
    .line 12
    if-eq v3, v2, :cond_0

    .line 13
    .line 14
    return v0

    .line 15
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    move v1, v0

    .line 19
    :goto_1
    sget-object v2, Landroidx/exifinterface/media/a;->L:[B

    .line 20
    .line 21
    array-length v3, v2

    .line 22
    if-ge v1, v3, :cond_3

    .line 23
    .line 24
    sget-object v3, Landroidx/exifinterface/media/a;->K:[B

    .line 25
    .line 26
    array-length v3, v3

    .line 27
    add-int/2addr v3, v1

    .line 28
    add-int/lit8 v3, v3, 0x4

    .line 29
    .line 30
    aget-byte v3, p1, v3

    .line 31
    .line 32
    aget-byte v2, v2, v1

    .line 33
    .line 34
    if-eq v3, v2, :cond_2

    .line 35
    .line 36
    return v0

    .line 37
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_3
    const/4 p1, 0x1

    .line 41
    return p1
.end method

.method private D(Ljava/io/InputStream;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_e

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    move v1, v0

    .line 5
    :goto_0
    :try_start_0
    sget-object v2, Landroidx/exifinterface/media/a;->i0:[[Landroidx/exifinterface/media/a$d;

    .line 6
    .line 7
    array-length v2, v2

    .line 8
    if-ge v1, v2, :cond_0

    .line 9
    .line 10
    iget-object v2, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 11
    .line 12
    new-instance v3, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    aput-object v3, v2, v1

    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto/16 :goto_4

    .line 24
    .line 25
    :catch_0
    move-exception p1

    .line 26
    goto/16 :goto_3

    .line 27
    .line 28
    :catch_1
    move-exception p1

    .line 29
    goto/16 :goto_3

    .line 30
    .line 31
    :cond_0
    iget-boolean v1, p0, Landroidx/exifinterface/media/a;->e:Z

    .line 32
    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    new-instance v1, Ljava/io/BufferedInputStream;

    .line 36
    .line 37
    const/16 v2, 0x1388

    .line 38
    .line 39
    invoke-direct {v1, p1, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, v1}, Landroidx/exifinterface/media/a;->g(Ljava/io/BufferedInputStream;)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    iput p1, p0, Landroidx/exifinterface/media/a;->d:I

    .line 47
    .line 48
    move-object p1, v1

    .line 49
    :cond_1
    iget v1, p0, Landroidx/exifinterface/media/a;->d:I

    .line 50
    .line 51
    invoke-static {v1}, Landroidx/exifinterface/media/a;->M(I)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_6

    .line 56
    .line 57
    new-instance v0, Landroidx/exifinterface/media/a$f;

    .line 58
    .line 59
    invoke-direct {v0, p1}, Landroidx/exifinterface/media/a$f;-><init>(Ljava/io/InputStream;)V

    .line 60
    .line 61
    .line 62
    iget-boolean p1, p0, Landroidx/exifinterface/media/a;->e:Z

    .line 63
    .line 64
    if-eqz p1, :cond_2

    .line 65
    .line 66
    invoke-direct {p0, v0}, Landroidx/exifinterface/media/a;->n(Landroidx/exifinterface/media/a$f;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    iget p1, p0, Landroidx/exifinterface/media/a;->d:I

    .line 71
    .line 72
    const/16 v1, 0xc

    .line 73
    .line 74
    if-ne p1, v1, :cond_3

    .line 75
    .line 76
    invoke-direct {p0, v0}, Landroidx/exifinterface/media/a;->e(Landroidx/exifinterface/media/a$f;)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    const/4 v1, 0x7

    .line 81
    if-ne p1, v1, :cond_4

    .line 82
    .line 83
    invoke-direct {p0, v0}, Landroidx/exifinterface/media/a;->h(Landroidx/exifinterface/media/a$f;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    const/16 v1, 0xa

    .line 88
    .line 89
    if-ne p1, v1, :cond_5

    .line 90
    .line 91
    invoke-direct {p0, v0}, Landroidx/exifinterface/media/a;->m(Landroidx/exifinterface/media/a$f;)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_5
    invoke-direct {p0, v0}, Landroidx/exifinterface/media/a;->k(Landroidx/exifinterface/media/a$f;)V

    .line 96
    .line 97
    .line 98
    :goto_1
    iget p1, p0, Landroidx/exifinterface/media/a;->p:I

    .line 99
    .line 100
    int-to-long v1, p1

    .line 101
    invoke-virtual {v0, v1, v2}, Landroidx/exifinterface/media/a$f;->j(J)V

    .line 102
    .line 103
    .line 104
    invoke-direct {p0, v0}, Landroidx/exifinterface/media/a;->L(Landroidx/exifinterface/media/a$b;)V

    .line 105
    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_6
    new-instance v1, Landroidx/exifinterface/media/a$b;

    .line 109
    .line 110
    invoke-direct {v1, p1}, Landroidx/exifinterface/media/a$b;-><init>(Ljava/io/InputStream;)V

    .line 111
    .line 112
    .line 113
    iget p1, p0, Landroidx/exifinterface/media/a;->d:I

    .line 114
    .line 115
    const/4 v2, 0x4

    .line 116
    if-ne p1, v2, :cond_7

    .line 117
    .line 118
    invoke-direct {p0, v1, v0, v0}, Landroidx/exifinterface/media/a;->f(Landroidx/exifinterface/media/a$b;II)V

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_7
    const/16 v0, 0xd

    .line 123
    .line 124
    if-ne p1, v0, :cond_8

    .line 125
    .line 126
    invoke-direct {p0, v1}, Landroidx/exifinterface/media/a;->i(Landroidx/exifinterface/media/a$b;)V

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_8
    const/16 v0, 0x9

    .line 131
    .line 132
    if-ne p1, v0, :cond_9

    .line 133
    .line 134
    invoke-direct {p0, v1}, Landroidx/exifinterface/media/a;->j(Landroidx/exifinterface/media/a$b;)V

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_9
    const/16 v0, 0xe

    .line 139
    .line 140
    if-ne p1, v0, :cond_a

    .line 141
    .line 142
    invoke-direct {p0, v1}, Landroidx/exifinterface/media/a;->o(Landroidx/exifinterface/media/a$b;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 143
    .line 144
    .line 145
    :cond_a
    :goto_2
    invoke-direct {p0}, Landroidx/exifinterface/media/a;->a()V

    .line 146
    .line 147
    .line 148
    sget-boolean p1, Landroidx/exifinterface/media/a;->u:Z

    .line 149
    .line 150
    if-eqz p1, :cond_c

    .line 151
    .line 152
    invoke-direct {p0}, Landroidx/exifinterface/media/a;->F()V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :goto_3
    :try_start_1
    sget-boolean v0, Landroidx/exifinterface/media/a;->u:Z

    .line 157
    .line 158
    if-eqz v0, :cond_b

    .line 159
    .line 160
    const-string v1, "ExifInterface"

    .line 161
    .line 162
    const-string v2, "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."

    .line 163
    .line 164
    invoke-static {v1, v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 165
    .line 166
    .line 167
    :cond_b
    invoke-direct {p0}, Landroidx/exifinterface/media/a;->a()V

    .line 168
    .line 169
    .line 170
    if-eqz v0, :cond_c

    .line 171
    .line 172
    invoke-direct {p0}, Landroidx/exifinterface/media/a;->F()V

    .line 173
    .line 174
    .line 175
    :cond_c
    return-void

    .line 176
    :goto_4
    invoke-direct {p0}, Landroidx/exifinterface/media/a;->a()V

    .line 177
    .line 178
    .line 179
    sget-boolean v0, Landroidx/exifinterface/media/a;->u:Z

    .line 180
    .line 181
    if-eqz v0, :cond_d

    .line 182
    .line 183
    invoke-direct {p0}, Landroidx/exifinterface/media/a;->F()V

    .line 184
    .line 185
    .line 186
    :cond_d
    throw p1

    .line 187
    :cond_e
    new-instance p1, Ljava/lang/NullPointerException;

    .line 188
    .line 189
    const-string v0, "inputstream shouldn\'t be null"

    .line 190
    .line 191
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    throw p1
.end method

.method private E(Landroidx/exifinterface/media/a$b;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Landroidx/exifinterface/media/a;->G(Landroidx/exifinterface/media/a$b;)Ljava/nio/ByteOrder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroidx/exifinterface/media/a$b;->g(Ljava/nio/ByteOrder;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroidx/exifinterface/media/a$b;->readUnsignedShort()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget v1, p0, Landroidx/exifinterface/media/a;->d:I

    .line 15
    .line 16
    const/4 v2, 0x7

    .line 17
    if-eq v1, v2, :cond_1

    .line 18
    .line 19
    const/16 v2, 0xa

    .line 20
    .line 21
    if-eq v1, v2, :cond_1

    .line 22
    .line 23
    const/16 v1, 0x2a

    .line 24
    .line 25
    if-ne v0, v1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance p1, Ljava/io/IOException;

    .line 29
    .line 30
    new-instance v1, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v2, "Invalid start code: "

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroidx/exifinterface/media/a$b;->readInt()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    const/16 v1, 0x8

    .line 60
    .line 61
    if-lt v0, v1, :cond_3

    .line 62
    .line 63
    add-int/lit8 v0, v0, -0x8

    .line 64
    .line 65
    if-lez v0, :cond_2

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Landroidx/exifinterface/media/a$b;->h(I)V

    .line 68
    .line 69
    .line 70
    :cond_2
    return-void

    .line 71
    :cond_3
    new-instance p1, Ljava/io/IOException;

    .line 72
    .line 73
    new-instance v1, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    .line 77
    .line 78
    const-string v2, "Invalid first Ifd offset: "

    .line 79
    .line 80
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw p1
.end method

.method private F()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 3
    .line 4
    array-length v1, v1

    .line 5
    if-ge v0, v1, :cond_1

    .line 6
    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v2, "The size of tag group["

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v2, "]: "

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 26
    .line 27
    aget-object v2, v2, v0

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/util/HashMap;->size()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const-string v2, "ExifInterface"

    .line 41
    .line 42
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 46
    .line 47
    aget-object v1, v1, v0

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_0

    .line 62
    .line 63
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    check-cast v3, Ljava/util/Map$Entry;

    .line 68
    .line 69
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    check-cast v4, Landroidx/exifinterface/media/a$c;

    .line 74
    .line 75
    new-instance v5, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    const-string v6, "tagName: "

    .line 81
    .line 82
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    check-cast v3, Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v3, ", tagType: "

    .line 95
    .line 96
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4}, Landroidx/exifinterface/media/a$c;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v3, ", tagValue: \'"

    .line 107
    .line 108
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    iget-object v3, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 112
    .line 113
    invoke-virtual {v4, v3}, Landroidx/exifinterface/media/a$c;->j(Ljava/nio/ByteOrder;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v3, "\'"

    .line 121
    .line 122
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 134
    .line 135
    goto/16 :goto_0

    .line 136
    .line 137
    :cond_1
    return-void
.end method

.method private G(Landroidx/exifinterface/media/a$b;)Ljava/nio/ByteOrder;
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroidx/exifinterface/media/a$b;->readShort()S

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/16 v0, 0x4949

    .line 6
    .line 7
    const-string v1, "ExifInterface"

    .line 8
    .line 9
    if-eq p1, v0, :cond_2

    .line 10
    .line 11
    const/16 v0, 0x4d4d

    .line 12
    .line 13
    if-ne p1, v0, :cond_1

    .line 14
    .line 15
    sget-boolean p1, Landroidx/exifinterface/media/a;->u:Z

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const-string p1, "readExifSegment: Byte Align MM"

    .line 20
    .line 21
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    :cond_0
    sget-object p1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_1
    new-instance v0, Ljava/io/IOException;

    .line 28
    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v2, "Invalid byte order: "

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v0

    .line 54
    :cond_2
    sget-boolean p1, Landroidx/exifinterface/media/a;->u:Z

    .line 55
    .line 56
    if-eqz p1, :cond_3

    .line 57
    .line 58
    const-string p1, "readExifSegment: Byte Align II"

    .line 59
    .line 60
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    :cond_3
    sget-object p1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 64
    .line 65
    return-object p1
.end method

.method private H([BI)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/exifinterface/media/a$f;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroidx/exifinterface/media/a$f;-><init>([B)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Landroidx/exifinterface/media/a;->E(Landroidx/exifinterface/media/a$b;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, v0, p2}, Landroidx/exifinterface/media/a;->I(Landroidx/exifinterface/media/a$f;I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private I(Landroidx/exifinterface/media/a$f;I)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Landroidx/exifinterface/media/a;->g:Ljava/util/Set;

    .line 8
    .line 9
    iget v4, v1, Landroidx/exifinterface/media/a$b;->c:I

    .line 10
    .line 11
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Landroidx/exifinterface/media/a$b;->readShort()S

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    sget-boolean v4, Landroidx/exifinterface/media/a;->u:Z

    .line 23
    .line 24
    const-string v5, "ExifInterface"

    .line 25
    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    new-instance v4, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v6, "numberOfDirectoryEntry: "

    .line 34
    .line 35
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-static {v5, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    :cond_0
    if-gtz v3, :cond_1

    .line 49
    .line 50
    goto/16 :goto_11

    .line 51
    .line 52
    :cond_1
    const/4 v6, 0x0

    .line 53
    :goto_0
    if-ge v6, v3, :cond_24

    .line 54
    .line 55
    invoke-virtual {v1}, Landroidx/exifinterface/media/a$b;->readUnsignedShort()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    invoke-virtual {v1}, Landroidx/exifinterface/media/a$b;->readUnsignedShort()I

    .line 60
    .line 61
    .line 62
    move-result v11

    .line 63
    invoke-virtual {v1}, Landroidx/exifinterface/media/a$b;->readInt()I

    .line 64
    .line 65
    .line 66
    move-result v14

    .line 67
    invoke-virtual {v1}, Landroidx/exifinterface/media/a$b;->a()I

    .line 68
    .line 69
    .line 70
    move-result v12

    .line 71
    int-to-long v12, v12

    .line 72
    const-wide/16 v15, 0x4

    .line 73
    .line 74
    add-long/2addr v12, v15

    .line 75
    sget-object v17, Landroidx/exifinterface/media/a;->k0:[Ljava/util/HashMap;

    .line 76
    .line 77
    aget-object v4, v17, v2

    .line 78
    .line 79
    const-wide/16 v18, 0x0

    .line 80
    .line 81
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    invoke-virtual {v4, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    check-cast v4, Landroidx/exifinterface/media/a$d;

    .line 90
    .line 91
    sget-boolean v7, Landroidx/exifinterface/media/a;->u:Z

    .line 92
    .line 93
    if-eqz v7, :cond_3

    .line 94
    .line 95
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    move-wide/from16 v20, v15

    .line 100
    .line 101
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v15

    .line 105
    const/16 v16, 0x4

    .line 106
    .line 107
    if-eqz v4, :cond_2

    .line 108
    .line 109
    iget-object v9, v4, Landroidx/exifinterface/media/a$d;->b:Ljava/lang/String;

    .line 110
    .line 111
    :goto_1
    move/from16 v22, v3

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_2
    const/4 v9, 0x0

    .line 115
    goto :goto_1

    .line 116
    :goto_2
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    move/from16 v23, v6

    .line 121
    .line 122
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    filled-new-array {v8, v15, v9, v3, v6}, [Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    const-string v6, "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"

    .line 131
    .line 132
    invoke-static {v6, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-static {v5, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_3
    move/from16 v22, v3

    .line 141
    .line 142
    move/from16 v23, v6

    .line 143
    .line 144
    move-wide/from16 v20, v15

    .line 145
    .line 146
    const/16 v16, 0x4

    .line 147
    .line 148
    :goto_3
    const/4 v3, 0x7

    .line 149
    if-nez v4, :cond_5

    .line 150
    .line 151
    if-eqz v7, :cond_4

    .line 152
    .line 153
    new-instance v6, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 156
    .line 157
    .line 158
    const-string v8, "Skip the tag entry since tag number is not defined: "

    .line 159
    .line 160
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 171
    .line 172
    .line 173
    :cond_4
    :goto_4
    move-object/from16 v24, v4

    .line 174
    .line 175
    goto/16 :goto_8

    .line 176
    .line 177
    :cond_5
    if-lez v11, :cond_6

    .line 178
    .line 179
    sget-object v6, Landroidx/exifinterface/media/a;->W:[I

    .line 180
    .line 181
    array-length v8, v6

    .line 182
    if-lt v11, v8, :cond_7

    .line 183
    .line 184
    :cond_6
    move-object/from16 v24, v4

    .line 185
    .line 186
    goto :goto_7

    .line 187
    :cond_7
    invoke-virtual {v4, v11}, Landroidx/exifinterface/media/a$d;->a(I)Z

    .line 188
    .line 189
    .line 190
    move-result v8

    .line 191
    if-nez v8, :cond_8

    .line 192
    .line 193
    if-eqz v7, :cond_4

    .line 194
    .line 195
    new-instance v6, Ljava/lang/StringBuilder;

    .line 196
    .line 197
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 198
    .line 199
    .line 200
    const-string v8, "Skip the tag entry since data format ("

    .line 201
    .line 202
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    sget-object v8, Landroidx/exifinterface/media/a;->V:[Ljava/lang/String;

    .line 206
    .line 207
    aget-object v8, v8, v11

    .line 208
    .line 209
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    const-string v8, ") is unexpected for tag: "

    .line 213
    .line 214
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    iget-object v8, v4, Landroidx/exifinterface/media/a$d;->b:Ljava/lang/String;

    .line 218
    .line 219
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 227
    .line 228
    .line 229
    goto :goto_4

    .line 230
    :cond_8
    if-ne v11, v3, :cond_9

    .line 231
    .line 232
    iget v11, v4, Landroidx/exifinterface/media/a$d;->c:I

    .line 233
    .line 234
    :cond_9
    int-to-long v8, v14

    .line 235
    aget v6, v6, v11

    .line 236
    .line 237
    move-object/from16 v24, v4

    .line 238
    .line 239
    int-to-long v3, v6

    .line 240
    mul-long/2addr v8, v3

    .line 241
    cmp-long v3, v8, v18

    .line 242
    .line 243
    if-ltz v3, :cond_b

    .line 244
    .line 245
    const-wide/32 v3, 0x7fffffff

    .line 246
    .line 247
    .line 248
    cmp-long v3, v8, v3

    .line 249
    .line 250
    if-lez v3, :cond_a

    .line 251
    .line 252
    goto :goto_5

    .line 253
    :cond_a
    const/4 v3, 0x1

    .line 254
    goto :goto_9

    .line 255
    :cond_b
    :goto_5
    if-eqz v7, :cond_c

    .line 256
    .line 257
    new-instance v3, Ljava/lang/StringBuilder;

    .line 258
    .line 259
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 260
    .line 261
    .line 262
    const-string v4, "Skip the tag entry since the number of components is invalid: "

    .line 263
    .line 264
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    invoke-static {v5, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 275
    .line 276
    .line 277
    :cond_c
    :goto_6
    const/4 v3, 0x0

    .line 278
    goto :goto_9

    .line 279
    :goto_7
    if-eqz v7, :cond_d

    .line 280
    .line 281
    new-instance v3, Ljava/lang/StringBuilder;

    .line 282
    .line 283
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 284
    .line 285
    .line 286
    const-string v4, "Skip the tag entry since data format is invalid: "

    .line 287
    .line 288
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    invoke-static {v5, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 299
    .line 300
    .line 301
    :cond_d
    :goto_8
    move-wide/from16 v8, v18

    .line 302
    .line 303
    goto :goto_6

    .line 304
    :goto_9
    if-nez v3, :cond_e

    .line 305
    .line 306
    invoke-virtual {v1, v12, v13}, Landroidx/exifinterface/media/a$f;->j(J)V

    .line 307
    .line 308
    .line 309
    goto/16 :goto_10

    .line 310
    .line 311
    :cond_e
    cmp-long v3, v8, v20

    .line 312
    .line 313
    const-string v4, "Compression"

    .line 314
    .line 315
    if-lez v3, :cond_13

    .line 316
    .line 317
    invoke-virtual {v1}, Landroidx/exifinterface/media/a$b;->readInt()I

    .line 318
    .line 319
    .line 320
    move-result v3

    .line 321
    if-eqz v7, :cond_f

    .line 322
    .line 323
    new-instance v6, Ljava/lang/StringBuilder;

    .line 324
    .line 325
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 326
    .line 327
    .line 328
    const-string v15, "seek to data offset: "

    .line 329
    .line 330
    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v6

    .line 340
    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 341
    .line 342
    .line 343
    :cond_f
    iget v6, v0, Landroidx/exifinterface/media/a;->d:I

    .line 344
    .line 345
    const/4 v15, 0x7

    .line 346
    if-ne v6, v15, :cond_12

    .line 347
    .line 348
    const-string v6, "MakerNote"

    .line 349
    .line 350
    move/from16 v17, v7

    .line 351
    .line 352
    move-object/from16 v15, v24

    .line 353
    .line 354
    iget-object v7, v15, Landroidx/exifinterface/media/a$d;->b:Ljava/lang/String;

    .line 355
    .line 356
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result v6

    .line 360
    if-eqz v6, :cond_11

    .line 361
    .line 362
    iput v3, v0, Landroidx/exifinterface/media/a;->q:I

    .line 363
    .line 364
    :cond_10
    move-wide/from16 v20, v12

    .line 365
    .line 366
    goto :goto_a

    .line 367
    :cond_11
    const/4 v6, 0x6

    .line 368
    if-ne v2, v6, :cond_10

    .line 369
    .line 370
    const-string v7, "ThumbnailImage"

    .line 371
    .line 372
    iget-object v6, v15, Landroidx/exifinterface/media/a$d;->b:Ljava/lang/String;

    .line 373
    .line 374
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v6

    .line 378
    if-eqz v6, :cond_10

    .line 379
    .line 380
    iput v3, v0, Landroidx/exifinterface/media/a;->r:I

    .line 381
    .line 382
    iput v14, v0, Landroidx/exifinterface/media/a;->s:I

    .line 383
    .line 384
    iget-object v6, v0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 385
    .line 386
    const/4 v7, 0x6

    .line 387
    invoke-static {v7, v6}, Landroidx/exifinterface/media/a$c;->f(ILjava/nio/ByteOrder;)Landroidx/exifinterface/media/a$c;

    .line 388
    .line 389
    .line 390
    move-result-object v6

    .line 391
    iget v7, v0, Landroidx/exifinterface/media/a;->r:I

    .line 392
    .line 393
    move-wide/from16 v20, v12

    .line 394
    .line 395
    int-to-long v12, v7

    .line 396
    iget-object v7, v0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 397
    .line 398
    invoke-static {v12, v13, v7}, Landroidx/exifinterface/media/a$c;->b(JLjava/nio/ByteOrder;)Landroidx/exifinterface/media/a$c;

    .line 399
    .line 400
    .line 401
    move-result-object v7

    .line 402
    iget v12, v0, Landroidx/exifinterface/media/a;->s:I

    .line 403
    .line 404
    int-to-long v12, v12

    .line 405
    iget-object v2, v0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 406
    .line 407
    invoke-static {v12, v13, v2}, Landroidx/exifinterface/media/a$c;->b(JLjava/nio/ByteOrder;)Landroidx/exifinterface/media/a$c;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    iget-object v12, v0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 412
    .line 413
    aget-object v12, v12, v16

    .line 414
    .line 415
    invoke-virtual {v12, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    iget-object v6, v0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 419
    .line 420
    aget-object v6, v6, v16

    .line 421
    .line 422
    const-string v12, "JPEGInterchangeFormat"

    .line 423
    .line 424
    invoke-virtual {v6, v12, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    iget-object v6, v0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 428
    .line 429
    aget-object v6, v6, v16

    .line 430
    .line 431
    const-string v7, "JPEGInterchangeFormatLength"

    .line 432
    .line 433
    invoke-virtual {v6, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    goto :goto_a

    .line 437
    :cond_12
    move/from16 v17, v7

    .line 438
    .line 439
    move-wide/from16 v20, v12

    .line 440
    .line 441
    move-object/from16 v15, v24

    .line 442
    .line 443
    :goto_a
    int-to-long v2, v3

    .line 444
    invoke-virtual {v1, v2, v3}, Landroidx/exifinterface/media/a$f;->j(J)V

    .line 445
    .line 446
    .line 447
    goto :goto_b

    .line 448
    :cond_13
    move/from16 v17, v7

    .line 449
    .line 450
    move-wide/from16 v20, v12

    .line 451
    .line 452
    move-object/from16 v15, v24

    .line 453
    .line 454
    :goto_b
    sget-object v2, Landroidx/exifinterface/media/a;->n0:Ljava/util/HashMap;

    .line 455
    .line 456
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v2

    .line 464
    check-cast v2, Ljava/lang/Integer;

    .line 465
    .line 466
    if-eqz v17, :cond_14

    .line 467
    .line 468
    new-instance v3, Ljava/lang/StringBuilder;

    .line 469
    .line 470
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 471
    .line 472
    .line 473
    const-string v6, "nextIfdType: "

    .line 474
    .line 475
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 479
    .line 480
    .line 481
    const-string v6, " byteCount: "

    .line 482
    .line 483
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v3, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v3

    .line 493
    invoke-static {v5, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 494
    .line 495
    .line 496
    :cond_14
    const/16 v3, 0x8

    .line 497
    .line 498
    const/4 v6, 0x3

    .line 499
    if-eqz v2, :cond_1d

    .line 500
    .line 501
    if-eq v11, v6, :cond_18

    .line 502
    .line 503
    move/from16 v4, v16

    .line 504
    .line 505
    if-eq v11, v4, :cond_17

    .line 506
    .line 507
    if-eq v11, v3, :cond_16

    .line 508
    .line 509
    const/16 v3, 0x9

    .line 510
    .line 511
    if-eq v11, v3, :cond_15

    .line 512
    .line 513
    const/16 v3, 0xd

    .line 514
    .line 515
    if-eq v11, v3, :cond_15

    .line 516
    .line 517
    const-wide/16 v3, -0x1

    .line 518
    .line 519
    goto :goto_d

    .line 520
    :cond_15
    invoke-virtual {v1}, Landroidx/exifinterface/media/a$b;->readInt()I

    .line 521
    .line 522
    .line 523
    move-result v3

    .line 524
    :goto_c
    int-to-long v3, v3

    .line 525
    goto :goto_d

    .line 526
    :cond_16
    invoke-virtual {v1}, Landroidx/exifinterface/media/a$b;->readShort()S

    .line 527
    .line 528
    .line 529
    move-result v3

    .line 530
    goto :goto_c

    .line 531
    :cond_17
    invoke-virtual {v1}, Landroidx/exifinterface/media/a$b;->b()J

    .line 532
    .line 533
    .line 534
    move-result-wide v3

    .line 535
    goto :goto_d

    .line 536
    :cond_18
    invoke-virtual {v1}, Landroidx/exifinterface/media/a$b;->readUnsignedShort()I

    .line 537
    .line 538
    .line 539
    move-result v3

    .line 540
    goto :goto_c

    .line 541
    :goto_d
    if-eqz v17, :cond_19

    .line 542
    .line 543
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 544
    .line 545
    .line 546
    move-result-object v6

    .line 547
    iget-object v7, v15, Landroidx/exifinterface/media/a$d;->b:Ljava/lang/String;

    .line 548
    .line 549
    filled-new-array {v6, v7}, [Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v6

    .line 553
    const-string v7, "Offset: %d, tagName: %s"

    .line 554
    .line 555
    invoke-static {v7, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object v6

    .line 559
    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 560
    .line 561
    .line 562
    :cond_19
    cmp-long v6, v3, v18

    .line 563
    .line 564
    if-lez v6, :cond_1c

    .line 565
    .line 566
    iget-object v6, v0, Landroidx/exifinterface/media/a;->g:Ljava/util/Set;

    .line 567
    .line 568
    long-to-int v7, v3

    .line 569
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 570
    .line 571
    .line 572
    move-result-object v7

    .line 573
    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 574
    .line 575
    .line 576
    move-result v6

    .line 577
    if-nez v6, :cond_1b

    .line 578
    .line 579
    invoke-virtual {v1, v3, v4}, Landroidx/exifinterface/media/a$f;->j(J)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 583
    .line 584
    .line 585
    move-result v2

    .line 586
    invoke-direct {v0, v1, v2}, Landroidx/exifinterface/media/a;->I(Landroidx/exifinterface/media/a$f;I)V

    .line 587
    .line 588
    .line 589
    :cond_1a
    :goto_e
    move-wide/from16 v12, v20

    .line 590
    .line 591
    goto :goto_f

    .line 592
    :cond_1b
    if-eqz v17, :cond_1a

    .line 593
    .line 594
    new-instance v6, Ljava/lang/StringBuilder;

    .line 595
    .line 596
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 597
    .line 598
    .line 599
    const-string v7, "Skip jump into the IFD since it has already been read: IfdType "

    .line 600
    .line 601
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 602
    .line 603
    .line 604
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 605
    .line 606
    .line 607
    const-string v2, " (at "

    .line 608
    .line 609
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 610
    .line 611
    .line 612
    invoke-virtual {v6, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 613
    .line 614
    .line 615
    const-string v2, ")"

    .line 616
    .line 617
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 618
    .line 619
    .line 620
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v2

    .line 624
    invoke-static {v5, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 625
    .line 626
    .line 627
    goto :goto_e

    .line 628
    :cond_1c
    if-eqz v17, :cond_1a

    .line 629
    .line 630
    new-instance v2, Ljava/lang/StringBuilder;

    .line 631
    .line 632
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 633
    .line 634
    .line 635
    const-string v6, "Skip jump into the IFD since its offset is invalid: "

    .line 636
    .line 637
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 638
    .line 639
    .line 640
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 641
    .line 642
    .line 643
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object v2

    .line 647
    invoke-static {v5, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 648
    .line 649
    .line 650
    goto :goto_e

    .line 651
    :goto_f
    invoke-virtual {v1, v12, v13}, Landroidx/exifinterface/media/a$f;->j(J)V

    .line 652
    .line 653
    .line 654
    goto/16 :goto_10

    .line 655
    .line 656
    :cond_1d
    move-wide/from16 v12, v20

    .line 657
    .line 658
    invoke-virtual {v1}, Landroidx/exifinterface/media/a$b;->a()I

    .line 659
    .line 660
    .line 661
    move-result v2

    .line 662
    iget v7, v0, Landroidx/exifinterface/media/a;->p:I

    .line 663
    .line 664
    add-int/2addr v2, v7

    .line 665
    long-to-int v7, v8

    .line 666
    new-array v7, v7, [B

    .line 667
    .line 668
    invoke-virtual {v1, v7}, Landroidx/exifinterface/media/a$b;->readFully([B)V

    .line 669
    .line 670
    .line 671
    new-instance v12, Landroidx/exifinterface/media/a$c;

    .line 672
    .line 673
    int-to-long v8, v2

    .line 674
    move-object/from16 v17, v7

    .line 675
    .line 676
    move v13, v11

    .line 677
    move-object v2, v15

    .line 678
    move-wide v15, v8

    .line 679
    move-wide/from16 v7, v20

    .line 680
    .line 681
    invoke-direct/range {v12 .. v17}, Landroidx/exifinterface/media/a$c;-><init>(IIJ[B)V

    .line 682
    .line 683
    .line 684
    iget-object v9, v0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 685
    .line 686
    aget-object v9, v9, p2

    .line 687
    .line 688
    iget-object v10, v2, Landroidx/exifinterface/media/a$d;->b:Ljava/lang/String;

    .line 689
    .line 690
    invoke-virtual {v9, v10, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    const-string v9, "DNGVersion"

    .line 694
    .line 695
    iget-object v10, v2, Landroidx/exifinterface/media/a$d;->b:Ljava/lang/String;

    .line 696
    .line 697
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 698
    .line 699
    .line 700
    move-result v9

    .line 701
    if-eqz v9, :cond_1e

    .line 702
    .line 703
    iput v6, v0, Landroidx/exifinterface/media/a;->d:I

    .line 704
    .line 705
    :cond_1e
    const-string v6, "Make"

    .line 706
    .line 707
    iget-object v9, v2, Landroidx/exifinterface/media/a$d;->b:Ljava/lang/String;

    .line 708
    .line 709
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 710
    .line 711
    .line 712
    move-result v6

    .line 713
    if-nez v6, :cond_1f

    .line 714
    .line 715
    const-string v6, "Model"

    .line 716
    .line 717
    iget-object v9, v2, Landroidx/exifinterface/media/a$d;->b:Ljava/lang/String;

    .line 718
    .line 719
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 720
    .line 721
    .line 722
    move-result v6

    .line 723
    if-eqz v6, :cond_20

    .line 724
    .line 725
    :cond_1f
    iget-object v6, v0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 726
    .line 727
    invoke-virtual {v12, v6}, Landroidx/exifinterface/media/a$c;->j(Ljava/nio/ByteOrder;)Ljava/lang/String;

    .line 728
    .line 729
    .line 730
    move-result-object v6

    .line 731
    const-string v9, "PENTAX"

    .line 732
    .line 733
    invoke-virtual {v6, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 734
    .line 735
    .line 736
    move-result v6

    .line 737
    if-nez v6, :cond_21

    .line 738
    .line 739
    :cond_20
    iget-object v2, v2, Landroidx/exifinterface/media/a$d;->b:Ljava/lang/String;

    .line 740
    .line 741
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 742
    .line 743
    .line 744
    move-result v2

    .line 745
    if-eqz v2, :cond_22

    .line 746
    .line 747
    iget-object v2, v0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 748
    .line 749
    invoke-virtual {v12, v2}, Landroidx/exifinterface/media/a$c;->i(Ljava/nio/ByteOrder;)I

    .line 750
    .line 751
    .line 752
    move-result v2

    .line 753
    const v4, 0xffff

    .line 754
    .line 755
    .line 756
    if-ne v2, v4, :cond_22

    .line 757
    .line 758
    :cond_21
    iput v3, v0, Landroidx/exifinterface/media/a;->d:I

    .line 759
    .line 760
    :cond_22
    invoke-virtual {v1}, Landroidx/exifinterface/media/a$b;->a()I

    .line 761
    .line 762
    .line 763
    move-result v2

    .line 764
    int-to-long v2, v2

    .line 765
    cmp-long v2, v2, v7

    .line 766
    .line 767
    if-eqz v2, :cond_23

    .line 768
    .line 769
    invoke-virtual {v1, v7, v8}, Landroidx/exifinterface/media/a$f;->j(J)V

    .line 770
    .line 771
    .line 772
    :cond_23
    :goto_10
    add-int/lit8 v6, v23, 0x1

    .line 773
    .line 774
    int-to-short v6, v6

    .line 775
    move/from16 v2, p2

    .line 776
    .line 777
    move/from16 v3, v22

    .line 778
    .line 779
    goto/16 :goto_0

    .line 780
    .line 781
    :cond_24
    const-wide/16 v18, 0x0

    .line 782
    .line 783
    invoke-virtual {v1}, Landroidx/exifinterface/media/a$b;->readInt()I

    .line 784
    .line 785
    .line 786
    move-result v2

    .line 787
    sget-boolean v3, Landroidx/exifinterface/media/a;->u:Z

    .line 788
    .line 789
    if-eqz v3, :cond_25

    .line 790
    .line 791
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 792
    .line 793
    .line 794
    move-result-object v4

    .line 795
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 796
    .line 797
    .line 798
    move-result-object v4

    .line 799
    const-string v6, "nextIfdOffset: %d"

    .line 800
    .line 801
    invoke-static {v6, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 802
    .line 803
    .line 804
    move-result-object v4

    .line 805
    invoke-static {v5, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 806
    .line 807
    .line 808
    :cond_25
    int-to-long v6, v2

    .line 809
    cmp-long v4, v6, v18

    .line 810
    .line 811
    if-lez v4, :cond_28

    .line 812
    .line 813
    iget-object v4, v0, Landroidx/exifinterface/media/a;->g:Ljava/util/Set;

    .line 814
    .line 815
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 816
    .line 817
    .line 818
    move-result-object v8

    .line 819
    invoke-interface {v4, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 820
    .line 821
    .line 822
    move-result v4

    .line 823
    if-nez v4, :cond_27

    .line 824
    .line 825
    invoke-virtual {v1, v6, v7}, Landroidx/exifinterface/media/a$f;->j(J)V

    .line 826
    .line 827
    .line 828
    iget-object v2, v0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 829
    .line 830
    const/4 v4, 0x4

    .line 831
    aget-object v2, v2, v4

    .line 832
    .line 833
    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    .line 834
    .line 835
    .line 836
    move-result v2

    .line 837
    if-eqz v2, :cond_26

    .line 838
    .line 839
    invoke-direct {v0, v1, v4}, Landroidx/exifinterface/media/a;->I(Landroidx/exifinterface/media/a$f;I)V

    .line 840
    .line 841
    .line 842
    return-void

    .line 843
    :cond_26
    iget-object v2, v0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 844
    .line 845
    const/4 v3, 0x5

    .line 846
    aget-object v2, v2, v3

    .line 847
    .line 848
    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    .line 849
    .line 850
    .line 851
    move-result v2

    .line 852
    if-eqz v2, :cond_29

    .line 853
    .line 854
    invoke-direct {v0, v1, v3}, Landroidx/exifinterface/media/a;->I(Landroidx/exifinterface/media/a$f;I)V

    .line 855
    .line 856
    .line 857
    return-void

    .line 858
    :cond_27
    if-eqz v3, :cond_29

    .line 859
    .line 860
    new-instance v1, Ljava/lang/StringBuilder;

    .line 861
    .line 862
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 863
    .line 864
    .line 865
    const-string v3, "Stop reading file since re-reading an IFD may cause an infinite loop: "

    .line 866
    .line 867
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 868
    .line 869
    .line 870
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 871
    .line 872
    .line 873
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object v1

    .line 877
    invoke-static {v5, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 878
    .line 879
    .line 880
    return-void

    .line 881
    :cond_28
    if-eqz v3, :cond_29

    .line 882
    .line 883
    new-instance v1, Ljava/lang/StringBuilder;

    .line 884
    .line 885
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 886
    .line 887
    .line 888
    const-string v3, "Stop reading file since a wrong offset may cause an infinite loop: "

    .line 889
    .line 890
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 891
    .line 892
    .line 893
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 894
    .line 895
    .line 896
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 897
    .line 898
    .line 899
    move-result-object v1

    .line 900
    invoke-static {v5, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 901
    .line 902
    .line 903
    :cond_29
    :goto_11
    return-void
.end method

.method private J(ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 2
    .line 3
    aget-object v0, v0, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 12
    .line 13
    aget-object v0, v0, p1

    .line 14
    .line 15
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 22
    .line 23
    aget-object v0, v0, p1

    .line 24
    .line 25
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, p3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    iget-object p3, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 33
    .line 34
    aget-object p1, p3, p1

    .line 35
    .line 36
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method private K(Landroidx/exifinterface/media/a$f;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 2
    .line 3
    aget-object v0, v0, p2

    .line 4
    .line 5
    const-string v1, "ImageLength"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroidx/exifinterface/media/a$c;

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 14
    .line 15
    aget-object v1, v1, p2

    .line 16
    .line 17
    const-string v2, "ImageWidth"

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Landroidx/exifinterface/media/a$c;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    :cond_0
    iget-object v0, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 30
    .line 31
    aget-object v0, v0, p2

    .line 32
    .line 33
    const-string v1, "JPEGInterchangeFormat"

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Landroidx/exifinterface/media/a$c;

    .line 40
    .line 41
    iget-object v1, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 42
    .line 43
    aget-object v1, v1, p2

    .line 44
    .line 45
    const-string v2, "JPEGInterchangeFormatLength"

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Landroidx/exifinterface/media/a$c;

    .line 52
    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    if-eqz v1, :cond_1

    .line 56
    .line 57
    iget-object v1, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroidx/exifinterface/media/a$c;->i(Ljava/nio/ByteOrder;)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    iget-object v2, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 64
    .line 65
    invoke-virtual {v0, v2}, Landroidx/exifinterface/media/a$c;->i(Ljava/nio/ByteOrder;)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    int-to-long v2, v1

    .line 70
    invoke-virtual {p1, v2, v3}, Landroidx/exifinterface/media/a$f;->j(J)V

    .line 71
    .line 72
    .line 73
    new-array v0, v0, [B

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->read([B)I

    .line 76
    .line 77
    .line 78
    new-instance p1, Landroidx/exifinterface/media/a$b;

    .line 79
    .line 80
    invoke-direct {p1, v0}, Landroidx/exifinterface/media/a$b;-><init>([B)V

    .line 81
    .line 82
    .line 83
    invoke-direct {p0, p1, v1, p2}, Landroidx/exifinterface/media/a;->f(Landroidx/exifinterface/media/a$b;II)V

    .line 84
    .line 85
    .line 86
    :cond_1
    return-void
.end method

.method private L(Landroidx/exifinterface/media/a$b;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    const-string v1, "Compression"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Landroidx/exifinterface/media/a$c;

    .line 13
    .line 14
    const/4 v2, 0x6

    .line 15
    if-eqz v1, :cond_3

    .line 16
    .line 17
    iget-object v3, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 18
    .line 19
    invoke-virtual {v1, v3}, Landroidx/exifinterface/media/a$c;->i(Ljava/nio/ByteOrder;)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iput v1, p0, Landroidx/exifinterface/media/a;->o:I

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    if-eq v1, v3, :cond_1

    .line 27
    .line 28
    if-eq v1, v2, :cond_0

    .line 29
    .line 30
    const/4 v2, 0x7

    .line 31
    if-eq v1, v2, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-direct {p0, p1, v0}, Landroidx/exifinterface/media/a;->p(Landroidx/exifinterface/media/a$b;Ljava/util/HashMap;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    invoke-direct {p0, v0}, Landroidx/exifinterface/media/a;->A(Ljava/util/HashMap;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    invoke-direct {p0, p1, v0}, Landroidx/exifinterface/media/a;->q(Landroidx/exifinterface/media/a$b;Ljava/util/HashMap;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    :goto_0
    return-void

    .line 48
    :cond_3
    iput v2, p0, Landroidx/exifinterface/media/a;->o:I

    .line 49
    .line 50
    invoke-direct {p0, p1, v0}, Landroidx/exifinterface/media/a;->p(Landroidx/exifinterface/media/a$b;Ljava/util/HashMap;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method private static M(I)Z
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    if-eq p0, v0, :cond_1

    .line 3
    .line 4
    const/16 v0, 0x9

    .line 5
    .line 6
    if-eq p0, v0, :cond_1

    .line 7
    .line 8
    const/16 v0, 0xd

    .line 9
    .line 10
    if-eq p0, v0, :cond_1

    .line 11
    .line 12
    const/16 v0, 0xe

    .line 13
    .line 14
    if-ne p0, v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method private N(II)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 2
    .line 3
    aget-object v0, v0, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const-string v1, "ExifInterface"

    .line 10
    .line 11
    if-nez v0, :cond_5

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 14
    .line 15
    aget-object v0, v0, p2

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto/16 :goto_2

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 26
    .line 27
    aget-object v0, v0, p1

    .line 28
    .line 29
    const-string v2, "ImageLength"

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Landroidx/exifinterface/media/a$c;

    .line 36
    .line 37
    iget-object v3, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 38
    .line 39
    aget-object v3, v3, p1

    .line 40
    .line 41
    const-string v4, "ImageWidth"

    .line 42
    .line 43
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Landroidx/exifinterface/media/a$c;

    .line 48
    .line 49
    iget-object v5, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 50
    .line 51
    aget-object v5, v5, p2

    .line 52
    .line 53
    invoke-virtual {v5, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Landroidx/exifinterface/media/a$c;

    .line 58
    .line 59
    iget-object v5, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 60
    .line 61
    aget-object v5, v5, p2

    .line 62
    .line 63
    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    check-cast v4, Landroidx/exifinterface/media/a$c;

    .line 68
    .line 69
    if-eqz v0, :cond_4

    .line 70
    .line 71
    if-nez v3, :cond_1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    if-eqz v2, :cond_3

    .line 75
    .line 76
    if-nez v4, :cond_2

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    iget-object v1, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Landroidx/exifinterface/media/a$c;->i(Ljava/nio/ByteOrder;)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    iget-object v1, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 86
    .line 87
    invoke-virtual {v3, v1}, Landroidx/exifinterface/media/a$c;->i(Ljava/nio/ByteOrder;)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    iget-object v3, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 92
    .line 93
    invoke-virtual {v2, v3}, Landroidx/exifinterface/media/a$c;->i(Ljava/nio/ByteOrder;)I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    iget-object v3, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 98
    .line 99
    invoke-virtual {v4, v3}, Landroidx/exifinterface/media/a$c;->i(Ljava/nio/ByteOrder;)I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-ge v0, v2, :cond_6

    .line 104
    .line 105
    if-ge v1, v3, :cond_6

    .line 106
    .line 107
    iget-object v0, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 108
    .line 109
    aget-object v1, v0, p1

    .line 110
    .line 111
    aget-object v2, v0, p2

    .line 112
    .line 113
    aput-object v2, v0, p1

    .line 114
    .line 115
    aput-object v1, v0, p2

    .line 116
    .line 117
    return-void

    .line 118
    :cond_3
    :goto_0
    sget-boolean p1, Landroidx/exifinterface/media/a;->u:Z

    .line 119
    .line 120
    if-eqz p1, :cond_6

    .line 121
    .line 122
    const-string p1, "Second image does not contain valid size information"

    .line 123
    .line 124
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :cond_4
    :goto_1
    sget-boolean p1, Landroidx/exifinterface/media/a;->u:Z

    .line 129
    .line 130
    if-eqz p1, :cond_6

    .line 131
    .line 132
    const-string p1, "First image does not contain valid size information"

    .line 133
    .line 134
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_5
    :goto_2
    sget-boolean p1, Landroidx/exifinterface/media/a;->u:Z

    .line 139
    .line 140
    if-eqz p1, :cond_6

    .line 141
    .line 142
    const-string p1, "Cannot perform swap since only one image data exists"

    .line 143
    .line 144
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 145
    .line 146
    .line 147
    :cond_6
    return-void
.end method

.method private O(Landroidx/exifinterface/media/a$f;I)V
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 2
    .line 3
    aget-object v0, v0, p2

    .line 4
    .line 5
    const-string v1, "DefaultCropSize"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroidx/exifinterface/media/a$c;

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 14
    .line 15
    aget-object v1, v1, p2

    .line 16
    .line 17
    const-string v2, "SensorTopBorder"

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Landroidx/exifinterface/media/a$c;

    .line 24
    .line 25
    iget-object v2, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 26
    .line 27
    aget-object v2, v2, p2

    .line 28
    .line 29
    const-string v3, "SensorLeftBorder"

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Landroidx/exifinterface/media/a$c;

    .line 36
    .line 37
    iget-object v3, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 38
    .line 39
    aget-object v3, v3, p2

    .line 40
    .line 41
    const-string v4, "SensorBottomBorder"

    .line 42
    .line 43
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Landroidx/exifinterface/media/a$c;

    .line 48
    .line 49
    iget-object v4, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 50
    .line 51
    aget-object v4, v4, p2

    .line 52
    .line 53
    const-string v5, "SensorRightBorder"

    .line 54
    .line 55
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    check-cast v4, Landroidx/exifinterface/media/a$c;

    .line 60
    .line 61
    const-string v5, "ImageLength"

    .line 62
    .line 63
    const-string v6, "ImageWidth"

    .line 64
    .line 65
    if-eqz v0, :cond_5

    .line 66
    .line 67
    iget p1, v0, Landroidx/exifinterface/media/a$c;->a:I

    .line 68
    .line 69
    const/4 v1, 0x5

    .line 70
    const-string v2, "Invalid crop size values. cropSize="

    .line 71
    .line 72
    const-string v3, "ExifInterface"

    .line 73
    .line 74
    const/4 v4, 0x1

    .line 75
    const/4 v7, 0x0

    .line 76
    const/4 v8, 0x2

    .line 77
    if-ne p1, v1, :cond_2

    .line 78
    .line 79
    iget-object p1, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 80
    .line 81
    invoke-virtual {v0, p1}, Landroidx/exifinterface/media/a$c;->k(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    check-cast p1, [Landroidx/exifinterface/media/a$e;

    .line 86
    .line 87
    if-eqz p1, :cond_1

    .line 88
    .line 89
    array-length v0, p1

    .line 90
    if-eq v0, v8, :cond_0

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_0
    aget-object v0, p1, v7

    .line 94
    .line 95
    iget-object v1, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 96
    .line 97
    invoke-static {v0, v1}, Landroidx/exifinterface/media/a$c;->d(Landroidx/exifinterface/media/a$e;Ljava/nio/ByteOrder;)Landroidx/exifinterface/media/a$c;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    aget-object p1, p1, v4

    .line 102
    .line 103
    iget-object v1, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 104
    .line 105
    invoke-static {p1, v1}, Landroidx/exifinterface/media/a$c;->d(Landroidx/exifinterface/media/a$e;Ljava/nio/ByteOrder;)Landroidx/exifinterface/media/a$c;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    goto :goto_1

    .line 110
    :cond_1
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_2
    iget-object p1, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 134
    .line 135
    invoke-virtual {v0, p1}, Landroidx/exifinterface/media/a$c;->k(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    check-cast p1, [I

    .line 140
    .line 141
    if-eqz p1, :cond_4

    .line 142
    .line 143
    array-length v0, p1

    .line 144
    if-eq v0, v8, :cond_3

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_3
    aget v0, p1, v7

    .line 148
    .line 149
    iget-object v1, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 150
    .line 151
    invoke-static {v0, v1}, Landroidx/exifinterface/media/a$c;->f(ILjava/nio/ByteOrder;)Landroidx/exifinterface/media/a$c;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    aget p1, p1, v4

    .line 156
    .line 157
    iget-object v1, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 158
    .line 159
    invoke-static {p1, v1}, Landroidx/exifinterface/media/a$c;->f(ILjava/nio/ByteOrder;)Landroidx/exifinterface/media/a$c;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    :goto_1
    iget-object v1, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 164
    .line 165
    aget-object v1, v1, p2

    .line 166
    .line 167
    invoke-virtual {v1, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    iget-object v0, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 171
    .line 172
    aget-object p2, v0, p2

    .line 173
    .line 174
    invoke-virtual {p2, v5, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :cond_4
    :goto_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-static {p1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 198
    .line 199
    .line 200
    return-void

    .line 201
    :cond_5
    if-eqz v1, :cond_7

    .line 202
    .line 203
    if-eqz v2, :cond_7

    .line 204
    .line 205
    if-eqz v3, :cond_7

    .line 206
    .line 207
    if-eqz v4, :cond_7

    .line 208
    .line 209
    iget-object p1, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 210
    .line 211
    invoke-virtual {v1, p1}, Landroidx/exifinterface/media/a$c;->i(Ljava/nio/ByteOrder;)I

    .line 212
    .line 213
    .line 214
    move-result p1

    .line 215
    iget-object v0, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 216
    .line 217
    invoke-virtual {v3, v0}, Landroidx/exifinterface/media/a$c;->i(Ljava/nio/ByteOrder;)I

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    iget-object v1, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 222
    .line 223
    invoke-virtual {v4, v1}, Landroidx/exifinterface/media/a$c;->i(Ljava/nio/ByteOrder;)I

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    iget-object v3, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 228
    .line 229
    invoke-virtual {v2, v3}, Landroidx/exifinterface/media/a$c;->i(Ljava/nio/ByteOrder;)I

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    if-le v0, p1, :cond_6

    .line 234
    .line 235
    if-le v1, v2, :cond_6

    .line 236
    .line 237
    sub-int/2addr v0, p1

    .line 238
    sub-int/2addr v1, v2

    .line 239
    iget-object p1, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 240
    .line 241
    invoke-static {v0, p1}, Landroidx/exifinterface/media/a$c;->f(ILjava/nio/ByteOrder;)Landroidx/exifinterface/media/a$c;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    iget-object v0, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 246
    .line 247
    invoke-static {v1, v0}, Landroidx/exifinterface/media/a$c;->f(ILjava/nio/ByteOrder;)Landroidx/exifinterface/media/a$c;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    iget-object v1, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 252
    .line 253
    aget-object v1, v1, p2

    .line 254
    .line 255
    invoke-virtual {v1, v5, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    iget-object p1, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 259
    .line 260
    aget-object p1, p1, p2

    .line 261
    .line 262
    invoke-virtual {p1, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    :cond_6
    return-void

    .line 266
    :cond_7
    invoke-direct {p0, p1, p2}, Landroidx/exifinterface/media/a;->K(Landroidx/exifinterface/media/a$f;I)V

    .line 267
    .line 268
    .line 269
    return-void
.end method

.method private P()V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x5

    .line 3
    invoke-direct {p0, v0, v1}, Landroidx/exifinterface/media/a;->N(II)V

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x4

    .line 7
    invoke-direct {p0, v0, v2}, Landroidx/exifinterface/media/a;->N(II)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, v1, v2}, Landroidx/exifinterface/media/a;->N(II)V

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    aget-object v3, v3, v4

    .line 17
    .line 18
    const-string v5, "PixelXDimension"

    .line 19
    .line 20
    invoke-virtual {v3, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Landroidx/exifinterface/media/a$c;

    .line 25
    .line 26
    iget-object v5, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 27
    .line 28
    aget-object v4, v5, v4

    .line 29
    .line 30
    const-string v5, "PixelYDimension"

    .line 31
    .line 32
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Landroidx/exifinterface/media/a$c;

    .line 37
    .line 38
    const-string v5, "ImageLength"

    .line 39
    .line 40
    const-string v6, "ImageWidth"

    .line 41
    .line 42
    if-eqz v3, :cond_0

    .line 43
    .line 44
    if-eqz v4, :cond_0

    .line 45
    .line 46
    iget-object v7, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 47
    .line 48
    aget-object v7, v7, v0

    .line 49
    .line 50
    invoke-virtual {v7, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    iget-object v3, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 54
    .line 55
    aget-object v3, v3, v0

    .line 56
    .line 57
    invoke-virtual {v3, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    :cond_0
    iget-object v3, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 61
    .line 62
    aget-object v3, v3, v2

    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/util/HashMap;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_1

    .line 69
    .line 70
    iget-object v3, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 71
    .line 72
    aget-object v3, v3, v1

    .line 73
    .line 74
    invoke-direct {p0, v3}, Landroidx/exifinterface/media/a;->B(Ljava/util/HashMap;)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-eqz v3, :cond_1

    .line 79
    .line 80
    iget-object v3, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 81
    .line 82
    aget-object v4, v3, v1

    .line 83
    .line 84
    aput-object v4, v3, v2

    .line 85
    .line 86
    new-instance v4, Ljava/util/HashMap;

    .line 87
    .line 88
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 89
    .line 90
    .line 91
    aput-object v4, v3, v1

    .line 92
    .line 93
    :cond_1
    iget-object v3, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 94
    .line 95
    aget-object v3, v3, v2

    .line 96
    .line 97
    invoke-direct {p0, v3}, Landroidx/exifinterface/media/a;->B(Ljava/util/HashMap;)Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-nez v3, :cond_2

    .line 102
    .line 103
    const-string v3, "ExifInterface"

    .line 104
    .line 105
    const-string v4, "No image meets the size requirements of a thumbnail image."

    .line 106
    .line 107
    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    :cond_2
    const-string v3, "ThumbnailOrientation"

    .line 111
    .line 112
    const-string v4, "Orientation"

    .line 113
    .line 114
    invoke-direct {p0, v0, v3, v4}, Landroidx/exifinterface/media/a;->J(ILjava/lang/String;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    const-string v7, "ThumbnailImageLength"

    .line 118
    .line 119
    invoke-direct {p0, v0, v7, v5}, Landroidx/exifinterface/media/a;->J(ILjava/lang/String;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    const-string v8, "ThumbnailImageWidth"

    .line 123
    .line 124
    invoke-direct {p0, v0, v8, v6}, Landroidx/exifinterface/media/a;->J(ILjava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-direct {p0, v1, v3, v4}, Landroidx/exifinterface/media/a;->J(ILjava/lang/String;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-direct {p0, v1, v7, v5}, Landroidx/exifinterface/media/a;->J(ILjava/lang/String;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-direct {p0, v1, v8, v6}, Landroidx/exifinterface/media/a;->J(ILjava/lang/String;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-direct {p0, v2, v4, v3}, Landroidx/exifinterface/media/a;->J(ILjava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-direct {p0, v2, v5, v7}, Landroidx/exifinterface/media/a;->J(ILjava/lang/String;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-direct {p0, v2, v6, v8}, Landroidx/exifinterface/media/a;->J(ILjava/lang/String;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    return-void
.end method

.method private a()V
    .locals 6

    .line 1
    const-string v0, "DateTimeOriginal"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroidx/exifinterface/media/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v2, "DateTime"

    .line 11
    .line 12
    invoke-virtual {p0, v2}, Landroidx/exifinterface/media/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    iget-object v3, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 19
    .line 20
    aget-object v3, v3, v1

    .line 21
    .line 22
    invoke-static {v0}, Landroidx/exifinterface/media/a$c;->a(Ljava/lang/String;)Landroidx/exifinterface/media/a$c;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v3, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    :cond_0
    const-string v0, "ImageWidth"

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Landroidx/exifinterface/media/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const-wide/16 v3, 0x0

    .line 36
    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    iget-object v2, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 40
    .line 41
    aget-object v2, v2, v1

    .line 42
    .line 43
    iget-object v5, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 44
    .line 45
    invoke-static {v3, v4, v5}, Landroidx/exifinterface/media/a$c;->b(JLjava/nio/ByteOrder;)Landroidx/exifinterface/media/a$c;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v2, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    :cond_1
    const-string v0, "ImageLength"

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Landroidx/exifinterface/media/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    if-nez v2, :cond_2

    .line 59
    .line 60
    iget-object v2, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 61
    .line 62
    aget-object v2, v2, v1

    .line 63
    .line 64
    iget-object v5, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 65
    .line 66
    invoke-static {v3, v4, v5}, Landroidx/exifinterface/media/a$c;->b(JLjava/nio/ByteOrder;)Landroidx/exifinterface/media/a$c;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-virtual {v2, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    :cond_2
    const-string v0, "Orientation"

    .line 74
    .line 75
    invoke-virtual {p0, v0}, Landroidx/exifinterface/media/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    if-nez v2, :cond_3

    .line 80
    .line 81
    iget-object v2, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 82
    .line 83
    aget-object v1, v2, v1

    .line 84
    .line 85
    iget-object v2, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 86
    .line 87
    invoke-static {v3, v4, v2}, Landroidx/exifinterface/media/a$c;->b(JLjava/nio/ByteOrder;)Landroidx/exifinterface/media/a$c;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    :cond_3
    const-string v0, "LightSource"

    .line 95
    .line 96
    invoke-virtual {p0, v0}, Landroidx/exifinterface/media/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    if-nez v1, :cond_4

    .line 101
    .line 102
    iget-object v1, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 103
    .line 104
    const/4 v2, 0x1

    .line 105
    aget-object v1, v1, v2

    .line 106
    .line 107
    iget-object v2, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 108
    .line 109
    invoke-static {v3, v4, v2}, Landroidx/exifinterface/media/a$c;->b(JLjava/nio/ByteOrder;)Landroidx/exifinterface/media/a$c;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    :cond_4
    return-void
.end method

.method private d(Ljava/lang/String;)Landroidx/exifinterface/media/a$c;
    .locals 2

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    const-string v0, "ISOSpeedRatings"

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    sget-boolean p1, Landroidx/exifinterface/media/a;->u:Z

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const-string p1, "ExifInterface"

    .line 16
    .line 17
    const-string v0, "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY."

    .line 18
    .line 19
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    :cond_0
    const-string p1, "PhotographicSensitivity"

    .line 23
    .line 24
    :cond_1
    const/4 v0, 0x0

    .line 25
    :goto_0
    sget-object v1, Landroidx/exifinterface/media/a;->i0:[[Landroidx/exifinterface/media/a$d;

    .line 26
    .line 27
    array-length v1, v1

    .line 28
    if-ge v0, v1, :cond_3

    .line 29
    .line 30
    iget-object v1, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 31
    .line 32
    aget-object v1, v1, v0

    .line 33
    .line 34
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Landroidx/exifinterface/media/a$c;

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    return-object v1

    .line 43
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    const/4 p1, 0x0

    .line 47
    return-object p1

    .line 48
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    .line 49
    .line 50
    const-string v0, "tag shouldn\'t be null"

    .line 51
    .line 52
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1
.end method

.method private e(Landroidx/exifinterface/media/a$f;)V
    .locals 12

    .line 1
    const-string v0, "yes"

    .line 2
    .line 3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v2, 0x1c

    .line 6
    .line 7
    if-lt v1, v2, :cond_e

    .line 8
    .line 9
    new-instance v1, Landroid/media/MediaMetadataRetriever;

    .line 10
    .line 11
    invoke-direct {v1}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 12
    .line 13
    .line 14
    :try_start_0
    new-instance v2, Landroidx/exifinterface/media/a$a;

    .line 15
    .line 16
    invoke-direct {v2, p0, p1}, Landroidx/exifinterface/media/a$a;-><init>(Landroidx/exifinterface/media/a;Landroidx/exifinterface/media/a$f;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v2}, Landroidx/exifinterface/media/b$b;->a(Landroid/media/MediaMetadataRetriever;Landroid/media/MediaDataSource;)V

    .line 20
    .line 21
    .line 22
    const/16 v2, 0x21

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const/16 v3, 0x22

    .line 29
    .line 30
    invoke-virtual {v1, v3}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    const/16 v4, 0x1a

    .line 35
    .line 36
    invoke-virtual {v1, v4}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    const/16 v5, 0x11

    .line 41
    .line 42
    invoke-virtual {v1, v5}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_0

    .line 51
    .line 52
    const/16 v0, 0x1d

    .line 53
    .line 54
    invoke-virtual {v1, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const/16 v4, 0x1e

    .line 59
    .line 60
    invoke-virtual {v1, v4}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    const/16 v5, 0x1f

    .line 65
    .line 66
    invoke-virtual {v1, v5}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    goto :goto_0

    .line 71
    :catchall_0
    move-exception p1

    .line 72
    goto/16 :goto_3

    .line 73
    .line 74
    :cond_0
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_1

    .line 79
    .line 80
    const/16 v0, 0x12

    .line 81
    .line 82
    invoke-virtual {v1, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const/16 v4, 0x13

    .line 87
    .line 88
    invoke-virtual {v1, v4}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    const/16 v5, 0x18

    .line 93
    .line 94
    invoke-virtual {v1, v5}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    goto :goto_0

    .line 99
    :cond_1
    const/4 v0, 0x0

    .line 100
    move-object v4, v0

    .line 101
    move-object v5, v4

    .line 102
    :goto_0
    const/4 v6, 0x0

    .line 103
    if-eqz v0, :cond_2

    .line 104
    .line 105
    iget-object v7, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 106
    .line 107
    aget-object v7, v7, v6

    .line 108
    .line 109
    const-string v8, "ImageWidth"

    .line 110
    .line 111
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    move-result v9

    .line 115
    iget-object v10, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 116
    .line 117
    invoke-static {v9, v10}, Landroidx/exifinterface/media/a$c;->f(ILjava/nio/ByteOrder;)Landroidx/exifinterface/media/a$c;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    invoke-virtual {v7, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    :cond_2
    if-eqz v4, :cond_3

    .line 125
    .line 126
    iget-object v7, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 127
    .line 128
    aget-object v7, v7, v6

    .line 129
    .line 130
    const-string v8, "ImageLength"

    .line 131
    .line 132
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    iget-object v10, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 137
    .line 138
    invoke-static {v9, v10}, Landroidx/exifinterface/media/a$c;->f(ILjava/nio/ByteOrder;)Landroidx/exifinterface/media/a$c;

    .line 139
    .line 140
    .line 141
    move-result-object v9

    .line 142
    invoke-virtual {v7, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    :cond_3
    const/4 v7, 0x6

    .line 146
    if-eqz v5, :cond_7

    .line 147
    .line 148
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    move-result v8

    .line 152
    const/16 v9, 0x5a

    .line 153
    .line 154
    if-eq v8, v9, :cond_6

    .line 155
    .line 156
    const/16 v9, 0xb4

    .line 157
    .line 158
    if-eq v8, v9, :cond_5

    .line 159
    .line 160
    const/16 v9, 0x10e

    .line 161
    .line 162
    if-eq v8, v9, :cond_4

    .line 163
    .line 164
    const/4 v8, 0x1

    .line 165
    goto :goto_1

    .line 166
    :cond_4
    const/16 v8, 0x8

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_5
    const/4 v8, 0x3

    .line 170
    goto :goto_1

    .line 171
    :cond_6
    move v8, v7

    .line 172
    :goto_1
    iget-object v9, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 173
    .line 174
    aget-object v9, v9, v6

    .line 175
    .line 176
    const-string v10, "Orientation"

    .line 177
    .line 178
    iget-object v11, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 179
    .line 180
    invoke-static {v8, v11}, Landroidx/exifinterface/media/a$c;->f(ILjava/nio/ByteOrder;)Landroidx/exifinterface/media/a$c;

    .line 181
    .line 182
    .line 183
    move-result-object v8

    .line 184
    invoke-virtual {v9, v10, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    :cond_7
    if-eqz v2, :cond_c

    .line 188
    .line 189
    if-eqz v3, :cond_c

    .line 190
    .line 191
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    if-le v3, v7, :cond_b

    .line 200
    .line 201
    int-to-long v8, v2

    .line 202
    invoke-virtual {p1, v8, v9}, Landroidx/exifinterface/media/a$f;->j(J)V

    .line 203
    .line 204
    .line 205
    new-array v8, v7, [B

    .line 206
    .line 207
    invoke-virtual {p1, v8}, Ljava/io/InputStream;->read([B)I

    .line 208
    .line 209
    .line 210
    move-result v9

    .line 211
    if-ne v9, v7, :cond_a

    .line 212
    .line 213
    add-int/2addr v2, v7

    .line 214
    add-int/lit8 v3, v3, -0x6

    .line 215
    .line 216
    sget-object v7, Landroidx/exifinterface/media/a;->p0:[B

    .line 217
    .line 218
    invoke-static {v8, v7}, Ljava/util/Arrays;->equals([B[B)Z

    .line 219
    .line 220
    .line 221
    move-result v7

    .line 222
    if-eqz v7, :cond_9

    .line 223
    .line 224
    new-array v7, v3, [B

    .line 225
    .line 226
    invoke-virtual {p1, v7}, Ljava/io/InputStream;->read([B)I

    .line 227
    .line 228
    .line 229
    move-result p1

    .line 230
    if-ne p1, v3, :cond_8

    .line 231
    .line 232
    iput v2, p0, Landroidx/exifinterface/media/a;->p:I

    .line 233
    .line 234
    invoke-direct {p0, v7, v6}, Landroidx/exifinterface/media/a;->H([BI)V

    .line 235
    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_8
    new-instance p1, Ljava/io/IOException;

    .line 239
    .line 240
    const-string v0, "Can\'t read exif"

    .line 241
    .line 242
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    throw p1

    .line 246
    :cond_9
    new-instance p1, Ljava/io/IOException;

    .line 247
    .line 248
    const-string v0, "Invalid identifier"

    .line 249
    .line 250
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    throw p1

    .line 254
    :cond_a
    new-instance p1, Ljava/io/IOException;

    .line 255
    .line 256
    const-string v0, "Can\'t read identifier"

    .line 257
    .line 258
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    throw p1

    .line 262
    :cond_b
    new-instance p1, Ljava/io/IOException;

    .line 263
    .line 264
    const-string v0, "Invalid exif length"

    .line 265
    .line 266
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    throw p1

    .line 270
    :cond_c
    :goto_2
    sget-boolean p1, Landroidx/exifinterface/media/a;->u:Z

    .line 271
    .line 272
    if-eqz p1, :cond_d

    .line 273
    .line 274
    const-string p1, "ExifInterface"

    .line 275
    .line 276
    new-instance v2, Ljava/lang/StringBuilder;

    .line 277
    .line 278
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 279
    .line 280
    .line 281
    const-string v3, "Heif meta: "

    .line 282
    .line 283
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    const-string v0, "x"

    .line 290
    .line 291
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    const-string v0, ", rotation "

    .line 298
    .line 299
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 310
    .line 311
    .line 312
    :cond_d
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 313
    .line 314
    .line 315
    return-void

    .line 316
    :catch_0
    :try_start_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 317
    .line 318
    const-string v0, "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."

    .line 319
    .line 320
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 324
    :goto_3
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 325
    .line 326
    .line 327
    throw p1

    .line 328
    :cond_e
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 329
    .line 330
    const-string v0, "Reading EXIF from HEIF files is supported from SDK 28 and above"

    .line 331
    .line 332
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    throw p1
.end method

.method private f(Landroidx/exifinterface/media/a$b;II)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    sget-boolean v3, Landroidx/exifinterface/media/a;->u:Z

    .line 8
    .line 9
    const-string v4, "ExifInterface"

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    new-instance v3, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v5, "getJpegAttributes starting with: "

    .line 19
    .line 20
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-static {v4, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    :cond_0
    sget-object v3, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 34
    .line 35
    invoke-virtual {v1, v3}, Landroidx/exifinterface/media/a$b;->g(Ljava/nio/ByteOrder;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Landroidx/exifinterface/media/a$b;->readByte()B

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    const-string v5, "Invalid marker: "

    .line 43
    .line 44
    const/4 v6, -0x1

    .line 45
    if-ne v3, v6, :cond_11

    .line 46
    .line 47
    invoke-virtual {v1}, Landroidx/exifinterface/media/a$b;->readByte()B

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    const/16 v8, -0x28

    .line 52
    .line 53
    if-ne v7, v8, :cond_10

    .line 54
    .line 55
    const/4 v3, 0x2

    .line 56
    :goto_0
    invoke-virtual {v1}, Landroidx/exifinterface/media/a$b;->readByte()B

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-ne v5, v6, :cond_f

    .line 61
    .line 62
    invoke-virtual {v1}, Landroidx/exifinterface/media/a$b;->readByte()B

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    sget-boolean v7, Landroidx/exifinterface/media/a;->u:Z

    .line 67
    .line 68
    if-eqz v7, :cond_1

    .line 69
    .line 70
    new-instance v8, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    const-string v9, "Found JPEG segment indicator: "

    .line 76
    .line 77
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    and-int/lit16 v9, v5, 0xff

    .line 81
    .line 82
    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    invoke-static {v4, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    :cond_1
    const/16 v8, -0x27

    .line 97
    .line 98
    if-eq v5, v8, :cond_e

    .line 99
    .line 100
    const/16 v8, -0x26

    .line 101
    .line 102
    if-ne v5, v8, :cond_2

    .line 103
    .line 104
    goto/16 :goto_5

    .line 105
    .line 106
    :cond_2
    invoke-virtual {v1}, Landroidx/exifinterface/media/a$b;->readUnsignedShort()I

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    add-int/lit8 v9, v8, -0x2

    .line 111
    .line 112
    const/4 v10, 0x4

    .line 113
    add-int/2addr v3, v10

    .line 114
    if-eqz v7, :cond_3

    .line 115
    .line 116
    new-instance v7, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    const-string v11, "JPEG segment: "

    .line 122
    .line 123
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    and-int/lit16 v11, v5, 0xff

    .line 127
    .line 128
    invoke-static {v11}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v11

    .line 132
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const-string v11, " (length: "

    .line 136
    .line 137
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v11, ")"

    .line 144
    .line 145
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    invoke-static {v4, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 153
    .line 154
    .line 155
    :cond_3
    const-string v7, "Invalid length"

    .line 156
    .line 157
    if-ltz v9, :cond_d

    .line 158
    .line 159
    const/16 v11, -0x1f

    .line 160
    .line 161
    const/4 v12, 0x1

    .line 162
    const/4 v13, 0x0

    .line 163
    if-eq v5, v11, :cond_9

    .line 164
    .line 165
    const/4 v11, -0x2

    .line 166
    if-eq v5, v11, :cond_6

    .line 167
    .line 168
    packed-switch v5, :pswitch_data_0

    .line 169
    .line 170
    .line 171
    packed-switch v5, :pswitch_data_1

    .line 172
    .line 173
    .line 174
    packed-switch v5, :pswitch_data_2

    .line 175
    .line 176
    .line 177
    packed-switch v5, :pswitch_data_3

    .line 178
    .line 179
    .line 180
    goto/16 :goto_4

    .line 181
    .line 182
    :pswitch_0
    invoke-virtual {v1, v12}, Landroidx/exifinterface/media/a$b;->h(I)V

    .line 183
    .line 184
    .line 185
    iget-object v5, v0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 186
    .line 187
    aget-object v5, v5, v2

    .line 188
    .line 189
    if-eq v2, v10, :cond_4

    .line 190
    .line 191
    const-string v9, "ImageLength"

    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_4
    const-string v9, "ThumbnailImageLength"

    .line 195
    .line 196
    :goto_1
    invoke-virtual {v1}, Landroidx/exifinterface/media/a$b;->readUnsignedShort()I

    .line 197
    .line 198
    .line 199
    move-result v11

    .line 200
    int-to-long v11, v11

    .line 201
    iget-object v13, v0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 202
    .line 203
    invoke-static {v11, v12, v13}, Landroidx/exifinterface/media/a$c;->b(JLjava/nio/ByteOrder;)Landroidx/exifinterface/media/a$c;

    .line 204
    .line 205
    .line 206
    move-result-object v11

    .line 207
    invoke-virtual {v5, v9, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    iget-object v5, v0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 211
    .line 212
    aget-object v5, v5, v2

    .line 213
    .line 214
    if-eq v2, v10, :cond_5

    .line 215
    .line 216
    const-string v9, "ImageWidth"

    .line 217
    .line 218
    goto :goto_2

    .line 219
    :cond_5
    const-string v9, "ThumbnailImageWidth"

    .line 220
    .line 221
    :goto_2
    invoke-virtual {v1}, Landroidx/exifinterface/media/a$b;->readUnsignedShort()I

    .line 222
    .line 223
    .line 224
    move-result v10

    .line 225
    int-to-long v10, v10

    .line 226
    iget-object v12, v0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 227
    .line 228
    invoke-static {v10, v11, v12}, Landroidx/exifinterface/media/a$c;->b(JLjava/nio/ByteOrder;)Landroidx/exifinterface/media/a$c;

    .line 229
    .line 230
    .line 231
    move-result-object v10

    .line 232
    invoke-virtual {v5, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    add-int/lit8 v9, v8, -0x7

    .line 236
    .line 237
    goto/16 :goto_4

    .line 238
    .line 239
    :cond_6
    new-array v5, v9, [B

    .line 240
    .line 241
    invoke-virtual {v1, v5}, Ljava/io/InputStream;->read([B)I

    .line 242
    .line 243
    .line 244
    move-result v8

    .line 245
    if-ne v8, v9, :cond_8

    .line 246
    .line 247
    const-string v8, "UserComment"

    .line 248
    .line 249
    invoke-virtual {v0, v8}, Landroidx/exifinterface/media/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v9

    .line 253
    if-nez v9, :cond_7

    .line 254
    .line 255
    iget-object v9, v0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 256
    .line 257
    aget-object v9, v9, v12

    .line 258
    .line 259
    new-instance v10, Ljava/lang/String;

    .line 260
    .line 261
    sget-object v11, Landroidx/exifinterface/media/a;->o0:Ljava/nio/charset/Charset;

    .line 262
    .line 263
    invoke-direct {v10, v5, v11}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 264
    .line 265
    .line 266
    invoke-static {v10}, Landroidx/exifinterface/media/a$c;->a(Ljava/lang/String;)Landroidx/exifinterface/media/a$c;

    .line 267
    .line 268
    .line 269
    move-result-object v5

    .line 270
    invoke-virtual {v9, v8, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    :cond_7
    move v9, v13

    .line 274
    goto :goto_4

    .line 275
    :cond_8
    new-instance v1, Ljava/io/IOException;

    .line 276
    .line 277
    const-string v2, "Invalid exif"

    .line 278
    .line 279
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    throw v1

    .line 283
    :cond_9
    new-array v5, v9, [B

    .line 284
    .line 285
    invoke-virtual {v1, v5}, Landroidx/exifinterface/media/a$b;->readFully([B)V

    .line 286
    .line 287
    .line 288
    add-int v8, v3, v9

    .line 289
    .line 290
    sget-object v10, Landroidx/exifinterface/media/a;->p0:[B

    .line 291
    .line 292
    invoke-static {v5, v10}, Landroidx/exifinterface/media/b;->c([B[B)Z

    .line 293
    .line 294
    .line 295
    move-result v11

    .line 296
    if-eqz v11, :cond_a

    .line 297
    .line 298
    array-length v11, v10

    .line 299
    invoke-static {v5, v11, v9}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 300
    .line 301
    .line 302
    move-result-object v5

    .line 303
    add-int v3, p2, v3

    .line 304
    .line 305
    array-length v9, v10

    .line 306
    add-int/2addr v3, v9

    .line 307
    iput v3, v0, Landroidx/exifinterface/media/a;->p:I

    .line 308
    .line 309
    invoke-direct {v0, v5, v2}, Landroidx/exifinterface/media/a;->H([BI)V

    .line 310
    .line 311
    .line 312
    new-instance v3, Landroidx/exifinterface/media/a$b;

    .line 313
    .line 314
    invoke-direct {v3, v5}, Landroidx/exifinterface/media/a$b;-><init>([B)V

    .line 315
    .line 316
    .line 317
    invoke-direct {v0, v3}, Landroidx/exifinterface/media/a;->L(Landroidx/exifinterface/media/a$b;)V

    .line 318
    .line 319
    .line 320
    goto :goto_3

    .line 321
    :cond_a
    sget-object v10, Landroidx/exifinterface/media/a;->q0:[B

    .line 322
    .line 323
    invoke-static {v5, v10}, Landroidx/exifinterface/media/b;->c([B[B)Z

    .line 324
    .line 325
    .line 326
    move-result v11

    .line 327
    if-eqz v11, :cond_b

    .line 328
    .line 329
    array-length v11, v10

    .line 330
    add-int/2addr v3, v11

    .line 331
    array-length v10, v10

    .line 332
    invoke-static {v5, v10, v9}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 333
    .line 334
    .line 335
    move-result-object v5

    .line 336
    const-string v9, "Xmp"

    .line 337
    .line 338
    invoke-virtual {v0, v9}, Landroidx/exifinterface/media/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v10

    .line 342
    if-nez v10, :cond_b

    .line 343
    .line 344
    iget-object v10, v0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 345
    .line 346
    aget-object v10, v10, v13

    .line 347
    .line 348
    new-instance v14, Landroidx/exifinterface/media/a$c;

    .line 349
    .line 350
    array-length v11, v5

    .line 351
    move-object v15, v14

    .line 352
    int-to-long v13, v3

    .line 353
    move-wide/from16 v17, v13

    .line 354
    .line 355
    move-object v14, v15

    .line 356
    const/4 v15, 0x1

    .line 357
    move-object/from16 v19, v5

    .line 358
    .line 359
    move/from16 v16, v11

    .line 360
    .line 361
    invoke-direct/range {v14 .. v19}, Landroidx/exifinterface/media/a$c;-><init>(IIJ[B)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v10, v9, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    iput-boolean v12, v0, Landroidx/exifinterface/media/a;->t:Z

    .line 368
    .line 369
    :cond_b
    :goto_3
    move v3, v8

    .line 370
    const/4 v9, 0x0

    .line 371
    :goto_4
    if-ltz v9, :cond_c

    .line 372
    .line 373
    invoke-virtual {v1, v9}, Landroidx/exifinterface/media/a$b;->h(I)V

    .line 374
    .line 375
    .line 376
    add-int/2addr v3, v9

    .line 377
    goto/16 :goto_0

    .line 378
    .line 379
    :cond_c
    new-instance v1, Ljava/io/IOException;

    .line 380
    .line 381
    invoke-direct {v1, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    throw v1

    .line 385
    :cond_d
    new-instance v1, Ljava/io/IOException;

    .line 386
    .line 387
    invoke-direct {v1, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    throw v1

    .line 391
    :cond_e
    :goto_5
    iget-object v2, v0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 392
    .line 393
    invoke-virtual {v1, v2}, Landroidx/exifinterface/media/a$b;->g(Ljava/nio/ByteOrder;)V

    .line 394
    .line 395
    .line 396
    return-void

    .line 397
    :cond_f
    new-instance v1, Ljava/io/IOException;

    .line 398
    .line 399
    new-instance v2, Ljava/lang/StringBuilder;

    .line 400
    .line 401
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 402
    .line 403
    .line 404
    const-string v3, "Invalid marker:"

    .line 405
    .line 406
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    and-int/lit16 v3, v5, 0xff

    .line 410
    .line 411
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v3

    .line 415
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    throw v1

    .line 426
    :cond_10
    new-instance v1, Ljava/io/IOException;

    .line 427
    .line 428
    new-instance v2, Ljava/lang/StringBuilder;

    .line 429
    .line 430
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 434
    .line 435
    .line 436
    and-int/lit16 v3, v3, 0xff

    .line 437
    .line 438
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v3

    .line 442
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    throw v1

    .line 453
    :cond_11
    new-instance v1, Ljava/io/IOException;

    .line 454
    .line 455
    new-instance v2, Ljava/lang/StringBuilder;

    .line 456
    .line 457
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 461
    .line 462
    .line 463
    and-int/lit16 v3, v3, 0xff

    .line 464
    .line 465
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v3

    .line 469
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 477
    .line 478
    .line 479
    throw v1

    .line 480
    nop

    .line 481
    :pswitch_data_0
    .packed-switch -0x40
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    :pswitch_data_1
    .packed-switch -0x3b
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    :pswitch_data_2
    .packed-switch -0x37
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    :pswitch_data_3
    .packed-switch -0x33
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private g(Ljava/io/BufferedInputStream;)I
    .locals 1

    .line 1
    const/16 v0, 0x1388

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/io/BufferedInputStream;->mark(I)V

    .line 4
    .line 5
    .line 6
    new-array v0, v0, [B

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->read([B)I

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/io/BufferedInputStream;->reset()V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Landroidx/exifinterface/media/a;->u([B)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x4

    .line 21
    return p1

    .line 22
    :cond_0
    invoke-direct {p0, v0}, Landroidx/exifinterface/media/a;->x([B)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    const/16 p1, 0x9

    .line 29
    .line 30
    return p1

    .line 31
    :cond_1
    invoke-direct {p0, v0}, Landroidx/exifinterface/media/a;->t([B)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    const/16 p1, 0xc

    .line 38
    .line 39
    return p1

    .line 40
    :cond_2
    invoke-direct {p0, v0}, Landroidx/exifinterface/media/a;->v([B)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_3

    .line 45
    .line 46
    const/4 p1, 0x7

    .line 47
    return p1

    .line 48
    :cond_3
    invoke-direct {p0, v0}, Landroidx/exifinterface/media/a;->y([B)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_4

    .line 53
    .line 54
    const/16 p1, 0xa

    .line 55
    .line 56
    return p1

    .line 57
    :cond_4
    invoke-direct {p0, v0}, Landroidx/exifinterface/media/a;->w([B)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_5

    .line 62
    .line 63
    const/16 p1, 0xd

    .line 64
    .line 65
    return p1

    .line 66
    :cond_5
    invoke-direct {p0, v0}, Landroidx/exifinterface/media/a;->C([B)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_6

    .line 71
    .line 72
    const/16 p1, 0xe

    .line 73
    .line 74
    return p1

    .line 75
    :cond_6
    const/4 p1, 0x0

    .line 76
    return p1
.end method

.method private h(Landroidx/exifinterface/media/a$f;)V
    .locals 5

    .line 1
    invoke-direct {p0, p1}, Landroidx/exifinterface/media/a;->k(Landroidx/exifinterface/media/a$f;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    aget-object p1, p1, v0

    .line 8
    .line 9
    const-string v1, "MakerNote"

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Landroidx/exifinterface/media/a$c;

    .line 16
    .line 17
    if-eqz p1, :cond_6

    .line 18
    .line 19
    new-instance v1, Landroidx/exifinterface/media/a$f;

    .line 20
    .line 21
    iget-object p1, p1, Landroidx/exifinterface/media/a$c;->d:[B

    .line 22
    .line 23
    invoke-direct {v1, p1}, Landroidx/exifinterface/media/a$f;-><init>([B)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 27
    .line 28
    invoke-virtual {v1, p1}, Landroidx/exifinterface/media/a$b;->g(Ljava/nio/ByteOrder;)V

    .line 29
    .line 30
    .line 31
    sget-object p1, Landroidx/exifinterface/media/a;->E:[B

    .line 32
    .line 33
    array-length v2, p1

    .line 34
    new-array v2, v2, [B

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Landroidx/exifinterface/media/a$b;->readFully([B)V

    .line 37
    .line 38
    .line 39
    const-wide/16 v3, 0x0

    .line 40
    .line 41
    invoke-virtual {v1, v3, v4}, Landroidx/exifinterface/media/a$f;->j(J)V

    .line 42
    .line 43
    .line 44
    sget-object v3, Landroidx/exifinterface/media/a;->F:[B

    .line 45
    .line 46
    array-length v4, v3

    .line 47
    new-array v4, v4, [B

    .line 48
    .line 49
    invoke-virtual {v1, v4}, Landroidx/exifinterface/media/a$b;->readFully([B)V

    .line 50
    .line 51
    .line 52
    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_0

    .line 57
    .line 58
    const-wide/16 v2, 0x8

    .line 59
    .line 60
    invoke-virtual {v1, v2, v3}, Landroidx/exifinterface/media/a$f;->j(J)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    invoke-static {v4, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_1

    .line 69
    .line 70
    const-wide/16 v2, 0xc

    .line 71
    .line 72
    invoke-virtual {v1, v2, v3}, Landroidx/exifinterface/media/a$f;->j(J)V

    .line 73
    .line 74
    .line 75
    :cond_1
    :goto_0
    const/4 p1, 0x6

    .line 76
    invoke-direct {p0, v1, p1}, Landroidx/exifinterface/media/a;->I(Landroidx/exifinterface/media/a$f;I)V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 80
    .line 81
    const/4 v1, 0x7

    .line 82
    aget-object p1, p1, v1

    .line 83
    .line 84
    const-string v2, "PreviewImageStart"

    .line 85
    .line 86
    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, Landroidx/exifinterface/media/a$c;

    .line 91
    .line 92
    iget-object v2, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 93
    .line 94
    aget-object v1, v2, v1

    .line 95
    .line 96
    const-string v2, "PreviewImageLength"

    .line 97
    .line 98
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    check-cast v1, Landroidx/exifinterface/media/a$c;

    .line 103
    .line 104
    if-eqz p1, :cond_2

    .line 105
    .line 106
    if-eqz v1, :cond_2

    .line 107
    .line 108
    iget-object v2, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 109
    .line 110
    const/4 v3, 0x5

    .line 111
    aget-object v2, v2, v3

    .line 112
    .line 113
    const-string v4, "JPEGInterchangeFormat"

    .line 114
    .line 115
    invoke-virtual {v2, v4, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    iget-object p1, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 119
    .line 120
    aget-object p1, p1, v3

    .line 121
    .line 122
    const-string v2, "JPEGInterchangeFormatLength"

    .line 123
    .line 124
    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    :cond_2
    iget-object p1, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 128
    .line 129
    const/16 v1, 0x8

    .line 130
    .line 131
    aget-object p1, p1, v1

    .line 132
    .line 133
    const-string v1, "AspectFrame"

    .line 134
    .line 135
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    check-cast p1, Landroidx/exifinterface/media/a$c;

    .line 140
    .line 141
    if-eqz p1, :cond_6

    .line 142
    .line 143
    iget-object v1, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 144
    .line 145
    invoke-virtual {p1, v1}, Landroidx/exifinterface/media/a$c;->k(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    check-cast p1, [I

    .line 150
    .line 151
    if-eqz p1, :cond_5

    .line 152
    .line 153
    array-length v1, p1

    .line 154
    const/4 v2, 0x4

    .line 155
    if-eq v1, v2, :cond_3

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_3
    const/4 v1, 0x2

    .line 159
    aget v1, p1, v1

    .line 160
    .line 161
    const/4 v2, 0x0

    .line 162
    aget v3, p1, v2

    .line 163
    .line 164
    if-le v1, v3, :cond_6

    .line 165
    .line 166
    const/4 v4, 0x3

    .line 167
    aget v4, p1, v4

    .line 168
    .line 169
    aget p1, p1, v0

    .line 170
    .line 171
    if-le v4, p1, :cond_6

    .line 172
    .line 173
    sub-int/2addr v1, v3

    .line 174
    add-int/2addr v1, v0

    .line 175
    sub-int/2addr v4, p1

    .line 176
    add-int/2addr v4, v0

    .line 177
    if-ge v1, v4, :cond_4

    .line 178
    .line 179
    add-int/2addr v1, v4

    .line 180
    sub-int v4, v1, v4

    .line 181
    .line 182
    sub-int/2addr v1, v4

    .line 183
    :cond_4
    iget-object p1, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 184
    .line 185
    invoke-static {v1, p1}, Landroidx/exifinterface/media/a$c;->f(ILjava/nio/ByteOrder;)Landroidx/exifinterface/media/a$c;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    iget-object v0, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 190
    .line 191
    invoke-static {v4, v0}, Landroidx/exifinterface/media/a$c;->f(ILjava/nio/ByteOrder;)Landroidx/exifinterface/media/a$c;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    iget-object v1, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 196
    .line 197
    aget-object v1, v1, v2

    .line 198
    .line 199
    const-string v3, "ImageWidth"

    .line 200
    .line 201
    invoke-virtual {v1, v3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    iget-object p1, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 205
    .line 206
    aget-object p1, p1, v2

    .line 207
    .line 208
    const-string v1, "ImageLength"

    .line 209
    .line 210
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    return-void

    .line 214
    :cond_5
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 217
    .line 218
    .line 219
    const-string v1, "Invalid aspect frame values. frame="

    .line 220
    .line 221
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-static {p1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    const-string v0, "ExifInterface"

    .line 236
    .line 237
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 238
    .line 239
    .line 240
    :cond_6
    return-void
.end method

.method private i(Landroidx/exifinterface/media/a$b;)V
    .locals 5

    .line 1
    sget-boolean v0, Landroidx/exifinterface/media/a;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v1, "getPngAttributes starting with: "

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "ExifInterface"

    .line 23
    .line 24
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroidx/exifinterface/media/a$b;->g(Ljava/nio/ByteOrder;)V

    .line 30
    .line 31
    .line 32
    sget-object v0, Landroidx/exifinterface/media/a;->G:[B

    .line 33
    .line 34
    array-length v1, v0

    .line 35
    invoke-virtual {p1, v1}, Landroidx/exifinterface/media/a$b;->h(I)V

    .line 36
    .line 37
    .line 38
    array-length v0, v0

    .line 39
    :goto_0
    :try_start_0
    invoke-virtual {p1}, Landroidx/exifinterface/media/a$b;->readInt()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/4 v2, 0x4

    .line 44
    new-array v3, v2, [B

    .line 45
    .line 46
    invoke-virtual {p1, v3}, Ljava/io/InputStream;->read([B)I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-ne v4, v2, :cond_7

    .line 51
    .line 52
    add-int/lit8 v0, v0, 0x8

    .line 53
    .line 54
    const/16 v2, 0x10

    .line 55
    .line 56
    if-ne v0, v2, :cond_2

    .line 57
    .line 58
    sget-object v2, Landroidx/exifinterface/media/a;->I:[B

    .line 59
    .line 60
    invoke-static {v3, v2}, Ljava/util/Arrays;->equals([B[B)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    new-instance p1, Ljava/io/IOException;

    .line 68
    .line 69
    const-string v0, "Encountered invalid PNG file--IHDR chunk should appearas the first chunk"

    .line 70
    .line 71
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p1

    .line 75
    :cond_2
    :goto_1
    sget-object v2, Landroidx/exifinterface/media/a;->J:[B

    .line 76
    .line 77
    invoke-static {v3, v2}, Ljava/util/Arrays;->equals([B[B)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_3

    .line 82
    .line 83
    return-void

    .line 84
    :cond_3
    sget-object v2, Landroidx/exifinterface/media/a;->H:[B

    .line 85
    .line 86
    invoke-static {v3, v2}, Ljava/util/Arrays;->equals([B[B)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-eqz v2, :cond_6

    .line 91
    .line 92
    new-array v2, v1, [B

    .line 93
    .line 94
    invoke-virtual {p1, v2}, Ljava/io/InputStream;->read([B)I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-ne v4, v1, :cond_5

    .line 99
    .line 100
    invoke-virtual {p1}, Landroidx/exifinterface/media/a$b;->readInt()I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    new-instance v1, Ljava/util/zip/CRC32;

    .line 105
    .line 106
    invoke-direct {v1}, Ljava/util/zip/CRC32;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, v3}, Ljava/util/zip/CRC32;->update([B)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, v2}, Ljava/util/zip/CRC32;->update([B)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    .line 116
    .line 117
    .line 118
    move-result-wide v3

    .line 119
    long-to-int v3, v3

    .line 120
    if-ne v3, p1, :cond_4

    .line 121
    .line 122
    iput v0, p0, Landroidx/exifinterface/media/a;->p:I

    .line 123
    .line 124
    const/4 p1, 0x0

    .line 125
    invoke-direct {p0, v2, p1}, Landroidx/exifinterface/media/a;->H([BI)V

    .line 126
    .line 127
    .line 128
    invoke-direct {p0}, Landroidx/exifinterface/media/a;->P()V

    .line 129
    .line 130
    .line 131
    new-instance p1, Landroidx/exifinterface/media/a$b;

    .line 132
    .line 133
    invoke-direct {p1, v2}, Landroidx/exifinterface/media/a$b;-><init>([B)V

    .line 134
    .line 135
    .line 136
    invoke-direct {p0, p1}, Landroidx/exifinterface/media/a;->L(Landroidx/exifinterface/media/a$b;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_4
    new-instance v0, Ljava/io/IOException;

    .line 141
    .line 142
    new-instance v2, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 145
    .line 146
    .line 147
    const-string v3, "Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: "

    .line 148
    .line 149
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    const-string p1, ", calculated CRC value: "

    .line 156
    .line 157
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    .line 161
    .line 162
    .line 163
    move-result-wide v3

    .line 164
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw v0

    .line 175
    :cond_5
    new-instance p1, Ljava/io/IOException;

    .line 176
    .line 177
    new-instance v0, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 180
    .line 181
    .line 182
    const-string v1, "Failed to read given length for given PNG chunk type: "

    .line 183
    .line 184
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-static {v3}, Landroidx/exifinterface/media/b;->a([B)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    throw p1

    .line 202
    :cond_6
    add-int/lit8 v1, v1, 0x4

    .line 203
    .line 204
    invoke-virtual {p1, v1}, Landroidx/exifinterface/media/a$b;->h(I)V

    .line 205
    .line 206
    .line 207
    add-int/2addr v0, v1

    .line 208
    goto/16 :goto_0

    .line 209
    .line 210
    :cond_7
    new-instance p1, Ljava/io/IOException;

    .line 211
    .line 212
    const-string v0, "Encountered invalid length while parsing PNG chunktype"

    .line 213
    .line 214
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw p1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 218
    :catch_0
    new-instance p1, Ljava/io/IOException;

    .line 219
    .line 220
    const-string v0, "Encountered corrupt PNG file."

    .line 221
    .line 222
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    throw p1
.end method

.method private j(Landroidx/exifinterface/media/a$b;)V
    .locals 7

    .line 1
    sget-boolean v0, Landroidx/exifinterface/media/a;->u:Z

    .line 2
    .line 3
    const-string v1, "ExifInterface"

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v3, "getRafAttributes starting with: "

    .line 13
    .line 14
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    const/16 v2, 0x54

    .line 28
    .line 29
    invoke-virtual {p1, v2}, Landroidx/exifinterface/media/a$b;->h(I)V

    .line 30
    .line 31
    .line 32
    const/4 v2, 0x4

    .line 33
    new-array v3, v2, [B

    .line 34
    .line 35
    new-array v4, v2, [B

    .line 36
    .line 37
    new-array v2, v2, [B

    .line 38
    .line 39
    invoke-virtual {p1, v3}, Ljava/io/InputStream;->read([B)I

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v4}, Ljava/io/InputStream;->read([B)I

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v2}, Ljava/io/InputStream;->read([B)I

    .line 46
    .line 47
    .line 48
    invoke-static {v3}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    invoke-static {v4}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->getInt()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    invoke-static {v2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    new-array v4, v4, [B

    .line 73
    .line 74
    invoke-virtual {p1}, Landroidx/exifinterface/media/a$b;->a()I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    sub-int v5, v3, v5

    .line 79
    .line 80
    invoke-virtual {p1, v5}, Landroidx/exifinterface/media/a$b;->h(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v4}, Ljava/io/InputStream;->read([B)I

    .line 84
    .line 85
    .line 86
    new-instance v5, Landroidx/exifinterface/media/a$b;

    .line 87
    .line 88
    invoke-direct {v5, v4}, Landroidx/exifinterface/media/a$b;-><init>([B)V

    .line 89
    .line 90
    .line 91
    const/4 v4, 0x5

    .line 92
    invoke-direct {p0, v5, v3, v4}, Landroidx/exifinterface/media/a;->f(Landroidx/exifinterface/media/a$b;II)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Landroidx/exifinterface/media/a$b;->a()I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    sub-int/2addr v2, v3

    .line 100
    invoke-virtual {p1, v2}, Landroidx/exifinterface/media/a$b;->h(I)V

    .line 101
    .line 102
    .line 103
    sget-object v2, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 104
    .line 105
    invoke-virtual {p1, v2}, Landroidx/exifinterface/media/a$b;->g(Ljava/nio/ByteOrder;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1}, Landroidx/exifinterface/media/a$b;->readInt()I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v0, :cond_1

    .line 113
    .line 114
    new-instance v0, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .line 118
    .line 119
    const-string v3, "numberOfDirectoryEntry: "

    .line 120
    .line 121
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    :cond_1
    const/4 v0, 0x0

    .line 135
    move v3, v0

    .line 136
    :goto_0
    if-ge v3, v2, :cond_3

    .line 137
    .line 138
    invoke-virtual {p1}, Landroidx/exifinterface/media/a$b;->readUnsignedShort()I

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    invoke-virtual {p1}, Landroidx/exifinterface/media/a$b;->readUnsignedShort()I

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    sget-object v6, Landroidx/exifinterface/media/a;->d0:Landroidx/exifinterface/media/a$d;

    .line 147
    .line 148
    iget v6, v6, Landroidx/exifinterface/media/a$d;->a:I

    .line 149
    .line 150
    if-ne v4, v6, :cond_2

    .line 151
    .line 152
    invoke-virtual {p1}, Landroidx/exifinterface/media/a$b;->readShort()S

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    invoke-virtual {p1}, Landroidx/exifinterface/media/a$b;->readShort()S

    .line 157
    .line 158
    .line 159
    move-result p1

    .line 160
    iget-object v3, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 161
    .line 162
    invoke-static {v2, v3}, Landroidx/exifinterface/media/a$c;->f(ILjava/nio/ByteOrder;)Landroidx/exifinterface/media/a$c;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    iget-object v4, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 167
    .line 168
    invoke-static {p1, v4}, Landroidx/exifinterface/media/a$c;->f(ILjava/nio/ByteOrder;)Landroidx/exifinterface/media/a$c;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    iget-object v5, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 173
    .line 174
    aget-object v5, v5, v0

    .line 175
    .line 176
    const-string v6, "ImageLength"

    .line 177
    .line 178
    invoke-virtual {v5, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    iget-object v3, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 182
    .line 183
    aget-object v0, v3, v0

    .line 184
    .line 185
    const-string v3, "ImageWidth"

    .line 186
    .line 187
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    sget-boolean v0, Landroidx/exifinterface/media/a;->u:Z

    .line 191
    .line 192
    if-eqz v0, :cond_3

    .line 193
    .line 194
    new-instance v0, Ljava/lang/StringBuilder;

    .line 195
    .line 196
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 197
    .line 198
    .line 199
    const-string v3, "Updated to length: "

    .line 200
    .line 201
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    const-string v2, ", width: "

    .line 208
    .line 209
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 220
    .line 221
    .line 222
    return-void

    .line 223
    :cond_2
    invoke-virtual {p1, v5}, Landroidx/exifinterface/media/a$b;->h(I)V

    .line 224
    .line 225
    .line 226
    add-int/lit8 v3, v3, 0x1

    .line 227
    .line 228
    goto :goto_0

    .line 229
    :cond_3
    return-void
.end method

.method private k(Landroidx/exifinterface/media/a$f;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Landroidx/exifinterface/media/a;->E(Landroidx/exifinterface/media/a$b;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, v0}, Landroidx/exifinterface/media/a;->I(Landroidx/exifinterface/media/a$f;I)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1, v0}, Landroidx/exifinterface/media/a;->O(Landroidx/exifinterface/media/a$f;I)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x5

    .line 12
    invoke-direct {p0, p1, v0}, Landroidx/exifinterface/media/a;->O(Landroidx/exifinterface/media/a$f;I)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x4

    .line 16
    invoke-direct {p0, p1, v0}, Landroidx/exifinterface/media/a;->O(Landroidx/exifinterface/media/a$f;I)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Landroidx/exifinterface/media/a;->P()V

    .line 20
    .line 21
    .line 22
    iget p1, p0, Landroidx/exifinterface/media/a;->d:I

    .line 23
    .line 24
    const/16 v0, 0x8

    .line 25
    .line 26
    if-ne p1, v0, :cond_0

    .line 27
    .line 28
    iget-object p1, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    aget-object p1, p1, v0

    .line 32
    .line 33
    const-string v1, "MakerNote"

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Landroidx/exifinterface/media/a$c;

    .line 40
    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    new-instance v1, Landroidx/exifinterface/media/a$f;

    .line 44
    .line 45
    iget-object p1, p1, Landroidx/exifinterface/media/a$c;->d:[B

    .line 46
    .line 47
    invoke-direct {v1, p1}, Landroidx/exifinterface/media/a$f;-><init>([B)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 51
    .line 52
    invoke-virtual {v1, p1}, Landroidx/exifinterface/media/a$b;->g(Ljava/nio/ByteOrder;)V

    .line 53
    .line 54
    .line 55
    const/4 p1, 0x6

    .line 56
    invoke-virtual {v1, p1}, Landroidx/exifinterface/media/a$b;->h(I)V

    .line 57
    .line 58
    .line 59
    const/16 p1, 0x9

    .line 60
    .line 61
    invoke-direct {p0, v1, p1}, Landroidx/exifinterface/media/a;->I(Landroidx/exifinterface/media/a$f;I)V

    .line 62
    .line 63
    .line 64
    iget-object v1, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 65
    .line 66
    aget-object p1, v1, p1

    .line 67
    .line 68
    const-string v1, "ColorSpace"

    .line 69
    .line 70
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, Landroidx/exifinterface/media/a$c;

    .line 75
    .line 76
    if-eqz p1, :cond_0

    .line 77
    .line 78
    iget-object v2, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 79
    .line 80
    aget-object v0, v2, v0

    .line 81
    .line 82
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    :cond_0
    return-void
.end method

.method private m(Landroidx/exifinterface/media/a$f;)V
    .locals 4

    .line 1
    sget-boolean v0, Landroidx/exifinterface/media/a;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v1, "getRw2Attributes starting with: "

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "ExifInterface"

    .line 23
    .line 24
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-direct {p0, p1}, Landroidx/exifinterface/media/a;->k(Landroidx/exifinterface/media/a$f;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    aget-object p1, p1, v0

    .line 34
    .line 35
    const-string v1, "JpgFromRaw"

    .line 36
    .line 37
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Landroidx/exifinterface/media/a$c;

    .line 42
    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    new-instance v1, Landroidx/exifinterface/media/a$b;

    .line 46
    .line 47
    iget-object v2, p1, Landroidx/exifinterface/media/a$c;->d:[B

    .line 48
    .line 49
    invoke-direct {v1, v2}, Landroidx/exifinterface/media/a$b;-><init>([B)V

    .line 50
    .line 51
    .line 52
    iget-wide v2, p1, Landroidx/exifinterface/media/a$c;->c:J

    .line 53
    .line 54
    long-to-int p1, v2

    .line 55
    const/4 v2, 0x5

    .line 56
    invoke-direct {p0, v1, p1, v2}, Landroidx/exifinterface/media/a;->f(Landroidx/exifinterface/media/a$b;II)V

    .line 57
    .line 58
    .line 59
    :cond_1
    iget-object p1, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 60
    .line 61
    aget-object p1, p1, v0

    .line 62
    .line 63
    const-string v0, "ISO"

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Landroidx/exifinterface/media/a$c;

    .line 70
    .line 71
    iget-object v0, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 72
    .line 73
    const/4 v1, 0x1

    .line 74
    aget-object v0, v0, v1

    .line 75
    .line 76
    const-string v2, "PhotographicSensitivity"

    .line 77
    .line 78
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Landroidx/exifinterface/media/a$c;

    .line 83
    .line 84
    if-eqz p1, :cond_2

    .line 85
    .line 86
    if-nez v0, :cond_2

    .line 87
    .line 88
    iget-object v0, p0, Landroidx/exifinterface/media/a;->f:[Ljava/util/HashMap;

    .line 89
    .line 90
    aget-object v0, v0, v1

    .line 91
    .line 92
    invoke-virtual {v0, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    :cond_2
    return-void
.end method

.method private n(Landroidx/exifinterface/media/a$f;)V
    .locals 2

    .line 1
    sget-object v0, Landroidx/exifinterface/media/a;->p0:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    invoke-virtual {p1, v1}, Landroidx/exifinterface/media/a$b;->h(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/exifinterface/media/a$b;->available()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    new-array v1, v1, [B

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Landroidx/exifinterface/media/a$b;->readFully([B)V

    .line 14
    .line 15
    .line 16
    array-length p1, v0

    .line 17
    iput p1, p0, Landroidx/exifinterface/media/a;->p:I

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-direct {p0, v1, p1}, Landroidx/exifinterface/media/a;->H([BI)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method private o(Landroidx/exifinterface/media/a$b;)V
    .locals 5

    .line 1
    sget-boolean v0, Landroidx/exifinterface/media/a;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v1, "getWebpAttributes starting with: "

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "ExifInterface"

    .line 23
    .line 24
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroidx/exifinterface/media/a$b;->g(Ljava/nio/ByteOrder;)V

    .line 30
    .line 31
    .line 32
    sget-object v0, Landroidx/exifinterface/media/a;->K:[B

    .line 33
    .line 34
    array-length v0, v0

    .line 35
    invoke-virtual {p1, v0}, Landroidx/exifinterface/media/a$b;->h(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Landroidx/exifinterface/media/a$b;->readInt()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    add-int/lit8 v0, v0, 0x8

    .line 43
    .line 44
    sget-object v1, Landroidx/exifinterface/media/a;->L:[B

    .line 45
    .line 46
    array-length v2, v1

    .line 47
    invoke-virtual {p1, v2}, Landroidx/exifinterface/media/a$b;->h(I)V

    .line 48
    .line 49
    .line 50
    array-length v1, v1

    .line 51
    add-int/lit8 v1, v1, 0x8

    .line 52
    .line 53
    :goto_0
    const/4 v2, 0x4

    .line 54
    :try_start_0
    new-array v3, v2, [B

    .line 55
    .line 56
    invoke-virtual {p1, v3}, Ljava/io/InputStream;->read([B)I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-ne v4, v2, :cond_6

    .line 61
    .line 62
    invoke-virtual {p1}, Landroidx/exifinterface/media/a$b;->readInt()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    add-int/lit8 v1, v1, 0x8

    .line 67
    .line 68
    sget-object v4, Landroidx/exifinterface/media/a;->M:[B

    .line 69
    .line 70
    invoke-static {v4, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_2

    .line 75
    .line 76
    new-array v0, v2, [B

    .line 77
    .line 78
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->read([B)I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-ne p1, v2, :cond_1

    .line 83
    .line 84
    iput v1, p0, Landroidx/exifinterface/media/a;->p:I

    .line 85
    .line 86
    const/4 p1, 0x0

    .line 87
    invoke-direct {p0, v0, p1}, Landroidx/exifinterface/media/a;->H([BI)V

    .line 88
    .line 89
    .line 90
    new-instance p1, Landroidx/exifinterface/media/a$b;

    .line 91
    .line 92
    invoke-direct {p1, v0}, Landroidx/exifinterface/media/a$b;-><init>([B)V

    .line 93
    .line 94
    .line 95
    invoke-direct {p0, p1}, Landroidx/exifinterface/media/a;->L(Landroidx/exifinterface/media/a$b;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_1
    new-instance p1, Ljava/io/IOException;

    .line 100
    .line 101
    new-instance v0, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    .line 106
    const-string v1, "Failed to read given length for given PNG chunk type: "

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-static {v3}, Landroidx/exifinterface/media/b;->a([B)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw p1

    .line 126
    :cond_2
    rem-int/lit8 v3, v2, 0x2

    .line 127
    .line 128
    const/4 v4, 0x1

    .line 129
    if-ne v3, v4, :cond_3

    .line 130
    .line 131
    add-int/lit8 v2, v2, 0x1

    .line 132
    .line 133
    :cond_3
    add-int/2addr v1, v2

    .line 134
    if-ne v1, v0, :cond_4

    .line 135
    .line 136
    return-void

    .line 137
    :cond_4
    if-gt v1, v0, :cond_5

    .line 138
    .line 139
    invoke-virtual {p1, v2}, Landroidx/exifinterface/media/a$b;->h(I)V

    .line 140
    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_5
    new-instance p1, Ljava/io/IOException;

    .line 144
    .line 145
    const-string v0, "Encountered WebP file with invalid chunk size"

    .line 146
    .line 147
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw p1

    .line 151
    :cond_6
    new-instance p1, Ljava/io/IOException;

    .line 152
    .line 153
    const-string v0, "Encountered invalid length while parsing WebP chunktype"

    .line 154
    .line 155
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw p1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 159
    :catch_0
    new-instance p1, Ljava/io/IOException;

    .line 160
    .line 161
    const-string v0, "Encountered corrupt WebP file."

    .line 162
    .line 163
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw p1
.end method

.method private p(Landroidx/exifinterface/media/a$b;Ljava/util/HashMap;)V
    .locals 4

    .line 1
    const-string v0, "JPEGInterchangeFormat"

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/exifinterface/media/a$c;

    .line 8
    .line 9
    const-string v1, "JPEGInterchangeFormatLength"

    .line 10
    .line 11
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Landroidx/exifinterface/media/a$c;

    .line 16
    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    if-eqz p2, :cond_3

    .line 20
    .line 21
    iget-object v1, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroidx/exifinterface/media/a$c;->i(Ljava/nio/ByteOrder;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-object v1, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 28
    .line 29
    invoke-virtual {p2, v1}, Landroidx/exifinterface/media/a$c;->i(Ljava/nio/ByteOrder;)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    iget v1, p0, Landroidx/exifinterface/media/a;->d:I

    .line 34
    .line 35
    const/4 v2, 0x7

    .line 36
    if-ne v1, v2, :cond_0

    .line 37
    .line 38
    iget v1, p0, Landroidx/exifinterface/media/a;->q:I

    .line 39
    .line 40
    add-int/2addr v0, v1

    .line 41
    :cond_0
    if-lez v0, :cond_2

    .line 42
    .line 43
    if-lez p2, :cond_2

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    iput-boolean v1, p0, Landroidx/exifinterface/media/a;->i:Z

    .line 47
    .line 48
    iget-object v1, p0, Landroidx/exifinterface/media/a;->a:Ljava/lang/String;

    .line 49
    .line 50
    if-nez v1, :cond_1

    .line 51
    .line 52
    iget-object v1, p0, Landroidx/exifinterface/media/a;->c:Landroid/content/res/AssetManager$AssetInputStream;

    .line 53
    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    iget-object v1, p0, Landroidx/exifinterface/media/a;->b:Ljava/io/FileDescriptor;

    .line 57
    .line 58
    if-nez v1, :cond_1

    .line 59
    .line 60
    new-array v1, p2, [B

    .line 61
    .line 62
    int-to-long v2, v0

    .line 63
    invoke-virtual {p1, v2, v3}, Ljava/io/InputStream;->skip(J)J

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    .line 67
    .line 68
    .line 69
    iput-object v1, p0, Landroidx/exifinterface/media/a;->n:[B

    .line 70
    .line 71
    :cond_1
    iput v0, p0, Landroidx/exifinterface/media/a;->l:I

    .line 72
    .line 73
    iput p2, p0, Landroidx/exifinterface/media/a;->m:I

    .line 74
    .line 75
    :cond_2
    sget-boolean p1, Landroidx/exifinterface/media/a;->u:Z

    .line 76
    .line 77
    if-eqz p1, :cond_3

    .line 78
    .line 79
    new-instance p1, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    const-string v1, "Setting thumbnail attributes with offset: "

    .line 85
    .line 86
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v0, ", length: "

    .line 93
    .line 94
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    const-string p2, "ExifInterface"

    .line 105
    .line 106
    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    :cond_3
    return-void
.end method

.method private q(Landroidx/exifinterface/media/a$b;Ljava/util/HashMap;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v3, "StripOffsets"

    .line 8
    .line 9
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    check-cast v3, Landroidx/exifinterface/media/a$c;

    .line 14
    .line 15
    const-string v4, "StripByteCounts"

    .line 16
    .line 17
    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Landroidx/exifinterface/media/a$c;

    .line 22
    .line 23
    if-eqz v3, :cond_b

    .line 24
    .line 25
    if-eqz v2, :cond_b

    .line 26
    .line 27
    iget-object v4, v0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 28
    .line 29
    invoke-virtual {v3, v4}, Landroidx/exifinterface/media/a$c;->k(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-static {v3}, Landroidx/exifinterface/media/b;->b(Ljava/lang/Object;)[J

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    iget-object v4, v0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 38
    .line 39
    invoke-virtual {v2, v4}, Landroidx/exifinterface/media/a$c;->k(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-static {v2}, Landroidx/exifinterface/media/b;->b(Ljava/lang/Object;)[J

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    const-string v4, "ExifInterface"

    .line 48
    .line 49
    if-eqz v3, :cond_a

    .line 50
    .line 51
    array-length v5, v3

    .line 52
    if-nez v5, :cond_0

    .line 53
    .line 54
    goto/16 :goto_3

    .line 55
    .line 56
    :cond_0
    if-eqz v2, :cond_9

    .line 57
    .line 58
    array-length v5, v2

    .line 59
    if-nez v5, :cond_1

    .line 60
    .line 61
    goto/16 :goto_2

    .line 62
    .line 63
    :cond_1
    array-length v5, v3

    .line 64
    array-length v6, v2

    .line 65
    if-eq v5, v6, :cond_2

    .line 66
    .line 67
    const-string v1, "stripOffsets and stripByteCounts should have same length."

    .line 68
    .line 69
    invoke-static {v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_2
    array-length v5, v2

    .line 74
    const/4 v6, 0x0

    .line 75
    const-wide/16 v7, 0x0

    .line 76
    .line 77
    move v9, v6

    .line 78
    :goto_0
    if-ge v9, v5, :cond_3

    .line 79
    .line 80
    aget-wide v10, v2, v9

    .line 81
    .line 82
    add-long/2addr v7, v10

    .line 83
    add-int/lit8 v9, v9, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_3
    long-to-int v5, v7

    .line 87
    new-array v7, v5, [B

    .line 88
    .line 89
    const/4 v8, 0x1

    .line 90
    iput-boolean v8, v0, Landroidx/exifinterface/media/a;->k:Z

    .line 91
    .line 92
    iput-boolean v8, v0, Landroidx/exifinterface/media/a;->j:Z

    .line 93
    .line 94
    iput-boolean v8, v0, Landroidx/exifinterface/media/a;->i:Z

    .line 95
    .line 96
    move v9, v6

    .line 97
    move v10, v9

    .line 98
    move v11, v10

    .line 99
    :goto_1
    array-length v12, v3

    .line 100
    if-ge v9, v12, :cond_8

    .line 101
    .line 102
    aget-wide v12, v3, v9

    .line 103
    .line 104
    long-to-int v12, v12

    .line 105
    aget-wide v13, v2, v9

    .line 106
    .line 107
    long-to-int v13, v13

    .line 108
    array-length v14, v3

    .line 109
    sub-int/2addr v14, v8

    .line 110
    if-ge v9, v14, :cond_4

    .line 111
    .line 112
    add-int v14, v12, v13

    .line 113
    .line 114
    int-to-long v14, v14

    .line 115
    add-int/lit8 v16, v9, 0x1

    .line 116
    .line 117
    aget-wide v16, v3, v16

    .line 118
    .line 119
    cmp-long v14, v14, v16

    .line 120
    .line 121
    if-eqz v14, :cond_4

    .line 122
    .line 123
    iput-boolean v6, v0, Landroidx/exifinterface/media/a;->k:Z

    .line 124
    .line 125
    :cond_4
    sub-int/2addr v12, v10

    .line 126
    if-gez v12, :cond_5

    .line 127
    .line 128
    const-string v1, "Invalid strip offset value"

    .line 129
    .line 130
    invoke-static {v4, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_5
    int-to-long v14, v12

    .line 135
    invoke-virtual {v1, v14, v15}, Ljava/io/InputStream;->skip(J)J

    .line 136
    .line 137
    .line 138
    move-result-wide v16

    .line 139
    cmp-long v14, v16, v14

    .line 140
    .line 141
    const-string v15, " bytes."

    .line 142
    .line 143
    if-eqz v14, :cond_6

    .line 144
    .line 145
    new-instance v1, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    .line 150
    const-string v2, "Failed to skip "

    .line 151
    .line 152
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-static {v4, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :cond_6
    add-int/2addr v10, v12

    .line 170
    new-array v12, v13, [B

    .line 171
    .line 172
    invoke-virtual {v1, v12}, Ljava/io/InputStream;->read([B)I

    .line 173
    .line 174
    .line 175
    move-result v14

    .line 176
    if-eq v14, v13, :cond_7

    .line 177
    .line 178
    new-instance v1, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 181
    .line 182
    .line 183
    const-string v2, "Failed to read "

    .line 184
    .line 185
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-static {v4, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :cond_7
    add-int/2addr v10, v13

    .line 203
    invoke-static {v12, v6, v7, v11, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 204
    .line 205
    .line 206
    add-int/2addr v11, v13

    .line 207
    add-int/lit8 v9, v9, 0x1

    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_8
    iput-object v7, v0, Landroidx/exifinterface/media/a;->n:[B

    .line 211
    .line 212
    iget-boolean v1, v0, Landroidx/exifinterface/media/a;->k:Z

    .line 213
    .line 214
    if-eqz v1, :cond_b

    .line 215
    .line 216
    aget-wide v1, v3, v6

    .line 217
    .line 218
    long-to-int v1, v1

    .line 219
    iput v1, v0, Landroidx/exifinterface/media/a;->l:I

    .line 220
    .line 221
    iput v5, v0, Landroidx/exifinterface/media/a;->m:I

    .line 222
    .line 223
    return-void

    .line 224
    :cond_9
    :goto_2
    const-string v1, "stripByteCounts should not be null or have zero length."

    .line 225
    .line 226
    invoke-static {v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 227
    .line 228
    .line 229
    return-void

    .line 230
    :cond_a
    :goto_3
    const-string v1, "stripOffsets should not be null or have zero length."

    .line 231
    .line 232
    invoke-static {v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 233
    .line 234
    .line 235
    :cond_b
    return-void
.end method

.method private static r(Ljava/io/BufferedInputStream;)Z
    .locals 4

    .line 1
    sget-object v0, Landroidx/exifinterface/media/a;->p0:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    invoke-virtual {p0, v1}, Ljava/io/BufferedInputStream;->mark(I)V

    .line 5
    .line 6
    .line 7
    array-length v0, v0

    .line 8
    new-array v0, v0, [B

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/io/BufferedInputStream;->reset()V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    move v1, p0

    .line 18
    :goto_0
    sget-object v2, Landroidx/exifinterface/media/a;->p0:[B

    .line 19
    .line 20
    array-length v3, v2

    .line 21
    if-ge v1, v3, :cond_1

    .line 22
    .line 23
    aget-byte v3, v0, v1

    .line 24
    .line 25
    aget-byte v2, v2, v1

    .line 26
    .line 27
    if-eq v3, v2, :cond_0

    .line 28
    .line 29
    return p0

    .line 30
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 p0, 0x1

    .line 34
    return p0
.end method

.method private t([B)Z
    .locals 14

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    new-instance v2, Landroidx/exifinterface/media/a$b;

    .line 4
    .line 5
    invoke-direct {v2, p1}, Landroidx/exifinterface/media/a$b;-><init>([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 6
    .line 7
    .line 8
    :try_start_1
    invoke-virtual {v2}, Landroidx/exifinterface/media/a$b;->readInt()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    int-to-long v3, v1

    .line 13
    const/4 v1, 0x4

    .line 14
    new-array v5, v1, [B

    .line 15
    .line 16
    invoke-virtual {v2, v5}, Ljava/io/InputStream;->read([B)I

    .line 17
    .line 18
    .line 19
    sget-object v6, Landroidx/exifinterface/media/a;->B:[B

    .line 20
    .line 21
    invoke-static {v5, v6}, Ljava/util/Arrays;->equals([B[B)Z

    .line 22
    .line 23
    .line 24
    move-result v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    if-nez v5, :cond_0

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 28
    .line 29
    .line 30
    return v0

    .line 31
    :cond_0
    const-wide/16 v5, 0x1

    .line 32
    .line 33
    cmp-long v7, v3, v5

    .line 34
    .line 35
    const-wide/16 v8, 0x8

    .line 36
    .line 37
    if-nez v7, :cond_1

    .line 38
    .line 39
    :try_start_2
    invoke-virtual {v2}, Landroidx/exifinterface/media/a$b;->readLong()J

    .line 40
    .line 41
    .line 42
    move-result-wide v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 43
    const-wide/16 v10, 0x10

    .line 44
    .line 45
    cmp-long v7, v3, v10

    .line 46
    .line 47
    if-gez v7, :cond_2

    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 50
    .line 51
    .line 52
    return v0

    .line 53
    :catchall_0
    move-exception p1

    .line 54
    move-object v1, v2

    .line 55
    goto/16 :goto_5

    .line 56
    .line 57
    :catch_0
    move-exception p1

    .line 58
    move-object v1, v2

    .line 59
    goto :goto_3

    .line 60
    :cond_1
    move-wide v10, v8

    .line 61
    :cond_2
    :try_start_3
    array-length v7, p1

    .line 62
    int-to-long v12, v7

    .line 63
    cmp-long v7, v3, v12

    .line 64
    .line 65
    if-lez v7, :cond_3

    .line 66
    .line 67
    array-length p1, p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 68
    int-to-long v3, p1

    .line 69
    :cond_3
    sub-long/2addr v3, v10

    .line 70
    cmp-long p1, v3, v8

    .line 71
    .line 72
    if-gez p1, :cond_4

    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 75
    .line 76
    .line 77
    return v0

    .line 78
    :cond_4
    :try_start_4
    new-array p1, v1, [B

    .line 79
    .line 80
    const-wide/16 v7, 0x0

    .line 81
    .line 82
    move v9, v0

    .line 83
    move v10, v9

    .line 84
    :goto_0
    const-wide/16 v11, 0x4

    .line 85
    .line 86
    div-long v11, v3, v11

    .line 87
    .line 88
    cmp-long v11, v7, v11

    .line 89
    .line 90
    if-gez v11, :cond_a

    .line 91
    .line 92
    invoke-virtual {v2, p1}, Ljava/io/InputStream;->read([B)I

    .line 93
    .line 94
    .line 95
    move-result v11
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 96
    if-eq v11, v1, :cond_5

    .line 97
    .line 98
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 99
    .line 100
    .line 101
    return v0

    .line 102
    :cond_5
    cmp-long v11, v7, v5

    .line 103
    .line 104
    if-nez v11, :cond_6

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_6
    :try_start_5
    sget-object v11, Landroidx/exifinterface/media/a;->C:[B

    .line 108
    .line 109
    invoke-static {p1, v11}, Ljava/util/Arrays;->equals([B[B)Z

    .line 110
    .line 111
    .line 112
    move-result v11

    .line 113
    const/4 v12, 0x1

    .line 114
    if-eqz v11, :cond_7

    .line 115
    .line 116
    move v9, v12

    .line 117
    goto :goto_1

    .line 118
    :cond_7
    sget-object v11, Landroidx/exifinterface/media/a;->D:[B

    .line 119
    .line 120
    invoke-static {p1, v11}, Ljava/util/Arrays;->equals([B[B)Z

    .line 121
    .line 122
    .line 123
    move-result v11
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 124
    if-eqz v11, :cond_8

    .line 125
    .line 126
    move v10, v12

    .line 127
    :cond_8
    :goto_1
    if-eqz v9, :cond_9

    .line 128
    .line 129
    if-eqz v10, :cond_9

    .line 130
    .line 131
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 132
    .line 133
    .line 134
    return v12

    .line 135
    :cond_9
    :goto_2
    add-long/2addr v7, v5

    .line 136
    goto :goto_0

    .line 137
    :cond_a
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 138
    .line 139
    .line 140
    goto :goto_4

    .line 141
    :catchall_1
    move-exception p1

    .line 142
    goto :goto_5

    .line 143
    :catch_1
    move-exception p1

    .line 144
    :goto_3
    :try_start_6
    sget-boolean v2, Landroidx/exifinterface/media/a;->u:Z

    .line 145
    .line 146
    if-eqz v2, :cond_b

    .line 147
    .line 148
    const-string v2, "ExifInterface"

    .line 149
    .line 150
    const-string v3, "Exception parsing HEIF file type box."

    .line 151
    .line 152
    invoke-static {v2, v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 153
    .line 154
    .line 155
    :cond_b
    if-eqz v1, :cond_c

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 158
    .line 159
    .line 160
    :cond_c
    :goto_4
    return v0

    .line 161
    :goto_5
    if-eqz v1, :cond_d

    .line 162
    .line 163
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 164
    .line 165
    .line 166
    :cond_d
    throw p1
.end method

.method private static u([B)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    sget-object v2, Landroidx/exifinterface/media/a;->A:[B

    .line 4
    .line 5
    array-length v3, v2

    .line 6
    if-ge v1, v3, :cond_1

    .line 7
    .line 8
    aget-byte v3, p0, v1

    .line 9
    .line 10
    aget-byte v2, v2, v1

    .line 11
    .line 12
    if-eq v3, v2, :cond_0

    .line 13
    .line 14
    return v0

    .line 15
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 p0, 0x1

    .line 19
    return p0
.end method

.method private v([B)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    new-instance v2, Landroidx/exifinterface/media/a$b;

    .line 4
    .line 5
    invoke-direct {v2, p1}, Landroidx/exifinterface/media/a$b;-><init>([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 6
    .line 7
    .line 8
    :try_start_1
    invoke-direct {p0, v2}, Landroidx/exifinterface/media/a;->G(Landroidx/exifinterface/media/a$b;)Ljava/nio/ByteOrder;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 13
    .line 14
    invoke-virtual {v2, p1}, Landroidx/exifinterface/media/a$b;->g(Ljava/nio/ByteOrder;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Landroidx/exifinterface/media/a$b;->readShort()S

    .line 18
    .line 19
    .line 20
    move-result p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    const/16 v1, 0x4f52

    .line 22
    .line 23
    if-eq p1, v1, :cond_0

    .line 24
    .line 25
    const/16 v1, 0x5352

    .line 26
    .line 27
    if-ne p1, v1, :cond_1

    .line 28
    .line 29
    :cond_0
    const/4 v0, 0x1

    .line 30
    :cond_1
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 31
    .line 32
    .line 33
    return v0

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    move-object v1, v2

    .line 36
    goto :goto_0

    .line 37
    :catch_0
    move-object v1, v2

    .line 38
    goto :goto_1

    .line 39
    :catchall_1
    move-exception p1

    .line 40
    :goto_0
    if-eqz v1, :cond_2

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 43
    .line 44
    .line 45
    :cond_2
    throw p1

    .line 46
    :catch_1
    :goto_1
    if-eqz v1, :cond_3

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 49
    .line 50
    .line 51
    :cond_3
    return v0
.end method

.method private w([B)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    sget-object v2, Landroidx/exifinterface/media/a;->G:[B

    .line 4
    .line 5
    array-length v3, v2

    .line 6
    if-ge v1, v3, :cond_1

    .line 7
    .line 8
    aget-byte v3, p1, v1

    .line 9
    .line 10
    aget-byte v2, v2, v1

    .line 11
    .line 12
    if-eq v3, v2, :cond_0

    .line 13
    .line 14
    return v0

    .line 15
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 p1, 0x1

    .line 19
    return p1
.end method

.method private x([B)Z
    .locals 5

    .line 1
    const-string v0, "FUJIFILMCCD-RAW"

    .line 2
    .line 3
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    move v2, v1

    .line 13
    :goto_0
    array-length v3, v0

    .line 14
    if-ge v2, v3, :cond_1

    .line 15
    .line 16
    aget-byte v3, p1, v2

    .line 17
    .line 18
    aget-byte v4, v0, v2

    .line 19
    .line 20
    if-eq v3, v4, :cond_0

    .line 21
    .line 22
    return v1

    .line 23
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p1, 0x1

    .line 27
    return p1
.end method

.method private y([B)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    new-instance v2, Landroidx/exifinterface/media/a$b;

    .line 4
    .line 5
    invoke-direct {v2, p1}, Landroidx/exifinterface/media/a$b;-><init>([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 6
    .line 7
    .line 8
    :try_start_1
    invoke-direct {p0, v2}, Landroidx/exifinterface/media/a;->G(Landroidx/exifinterface/media/a$b;)Ljava/nio/ByteOrder;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 13
    .line 14
    invoke-virtual {v2, p1}, Landroidx/exifinterface/media/a$b;->g(Ljava/nio/ByteOrder;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Landroidx/exifinterface/media/a$b;->readShort()S

    .line 18
    .line 19
    .line 20
    move-result p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    const/16 v1, 0x55

    .line 22
    .line 23
    if-ne p1, v1, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    :cond_0
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 27
    .line 28
    .line 29
    return v0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    move-object v1, v2

    .line 32
    goto :goto_0

    .line 33
    :catch_0
    move-object v1, v2

    .line 34
    goto :goto_1

    .line 35
    :catchall_1
    move-exception p1

    .line 36
    :goto_0
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 39
    .line 40
    .line 41
    :cond_1
    throw p1

    .line 42
    :catch_1
    :goto_1
    if-eqz v1, :cond_2

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 45
    .line 46
    .line 47
    :cond_2
    return v0
.end method

.method private static z(Ljava/io/FileDescriptor;)Z
    .locals 3

    .line 1
    :try_start_0
    sget v0, Landroid/system/OsConstants;->SEEK_CUR:I

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-static {p0, v1, v2, v0}, Landroidx/exifinterface/media/b$a;->c(Ljava/io/FileDescriptor;JI)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :catch_0
    sget-boolean p0, Landroidx/exifinterface/media/a;->u:Z

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    const-string p0, "ExifInterface"

    .line 15
    .line 16
    const-string v0, "The file descriptor for the given input is not seekable"

    .line 17
    .line 18
    invoke-static {p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method


# virtual methods
.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    if-eqz p1, :cond_6

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroidx/exifinterface/media/a;->d(Ljava/lang/String;)Landroidx/exifinterface/media/a$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_5

    .line 9
    .line 10
    sget-object v2, Landroidx/exifinterface/media/a;->m0:Ljava/util/HashSet;

    .line 11
    .line 12
    invoke-virtual {v2, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Landroidx/exifinterface/media/a$c;->j(Ljava/nio/ByteOrder;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    :cond_0
    const-string v2, "GPSTimeStamp"

    .line 26
    .line 27
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_4

    .line 32
    .line 33
    iget p1, v0, Landroidx/exifinterface/media/a$c;->a:I

    .line 34
    .line 35
    const/4 v2, 0x5

    .line 36
    const-string v3, "ExifInterface"

    .line 37
    .line 38
    if-eq p1, v2, :cond_1

    .line 39
    .line 40
    const/16 v2, 0xa

    .line 41
    .line 42
    if-eq p1, v2, :cond_1

    .line 43
    .line 44
    new-instance p1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    const-string v2, "GPS Timestamp format is not rational. format="

    .line 50
    .line 51
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget v0, v0, Landroidx/exifinterface/media/a$c;->a:I

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_1
    iget-object p1, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 68
    .line 69
    invoke-virtual {v0, p1}, Landroidx/exifinterface/media/a$c;->k(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, [Landroidx/exifinterface/media/a$e;

    .line 74
    .line 75
    if-eqz p1, :cond_3

    .line 76
    .line 77
    array-length v0, p1

    .line 78
    const/4 v2, 0x3

    .line 79
    if-eq v0, v2, :cond_2

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    const/4 v0, 0x0

    .line 83
    aget-object v0, p1, v0

    .line 84
    .line 85
    iget-wide v1, v0, Landroidx/exifinterface/media/a$e;->a:J

    .line 86
    .line 87
    long-to-float v1, v1

    .line 88
    iget-wide v2, v0, Landroidx/exifinterface/media/a$e;->b:J

    .line 89
    .line 90
    long-to-float v0, v2

    .line 91
    div-float/2addr v1, v0

    .line 92
    float-to-int v0, v1

    .line 93
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    const/4 v1, 0x1

    .line 98
    aget-object v1, p1, v1

    .line 99
    .line 100
    iget-wide v2, v1, Landroidx/exifinterface/media/a$e;->a:J

    .line 101
    .line 102
    long-to-float v2, v2

    .line 103
    iget-wide v3, v1, Landroidx/exifinterface/media/a$e;->b:J

    .line 104
    .line 105
    long-to-float v1, v3

    .line 106
    div-float/2addr v2, v1

    .line 107
    float-to-int v1, v2

    .line 108
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    const/4 v2, 0x2

    .line 113
    aget-object p1, p1, v2

    .line 114
    .line 115
    iget-wide v2, p1, Landroidx/exifinterface/media/a$e;->a:J

    .line 116
    .line 117
    long-to-float v2, v2

    .line 118
    iget-wide v3, p1, Landroidx/exifinterface/media/a$e;->b:J

    .line 119
    .line 120
    long-to-float p1, v3

    .line 121
    div-float/2addr v2, p1

    .line 122
    float-to-int p1, v2

    .line 123
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    filled-new-array {v0, v1, p1}, [Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    const-string v0, "%02d:%02d:%02d"

    .line 132
    .line 133
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    return-object p1

    .line 138
    :cond_3
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    .line 142
    .line 143
    const-string v2, "Invalid GPS Timestamp array. array="

    .line 144
    .line 145
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 160
    .line 161
    .line 162
    return-object v1

    .line 163
    :cond_4
    :try_start_0
    iget-object p1, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 164
    .line 165
    invoke-virtual {v0, p1}, Landroidx/exifinterface/media/a$c;->h(Ljava/nio/ByteOrder;)D

    .line 166
    .line 167
    .line 168
    move-result-wide v2

    .line 169
    invoke-static {v2, v3}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 173
    return-object p1

    .line 174
    :catch_0
    :cond_5
    return-object v1

    .line 175
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    .line 176
    .line 177
    const-string v0, "tag shouldn\'t be null"

    .line 178
    .line 179
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw p1
.end method

.method public c(Ljava/lang/String;I)I
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroidx/exifinterface/media/a;->d(Ljava/lang/String;)Landroidx/exifinterface/media/a$c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    :try_start_0
    iget-object v0, p0, Landroidx/exifinterface/media/a;->h:Ljava/nio/ByteOrder;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroidx/exifinterface/media/a$c;->i(Ljava/nio/ByteOrder;)I

    .line 13
    .line 14
    .line 15
    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    return p1

    .line 17
    :catch_0
    :goto_0
    return p2

    .line 18
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 19
    .line 20
    const-string p2, "tag shouldn\'t be null"

    .line 21
    .line 22
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1
.end method

.method public l()I
    .locals 2

    .line 1
    const-string v0, "Orientation"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {p0, v0, v1}, Landroidx/exifinterface/media/a;->c(Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return v0

    .line 13
    :pswitch_0
    const/16 v0, 0x5a

    .line 14
    .line 15
    return v0

    .line 16
    :pswitch_1
    const/16 v0, 0x10e

    .line 17
    .line 18
    return v0

    .line 19
    :pswitch_2
    const/16 v0, 0xb4

    .line 20
    .line 21
    return v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public s()Z
    .locals 3

    .line 1
    const-string v0, "Orientation"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {p0, v0, v1}, Landroidx/exifinterface/media/a;->c(Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v2, 0x2

    .line 9
    if-eq v0, v2, :cond_0

    .line 10
    .line 11
    const/4 v2, 0x7

    .line 12
    if-eq v0, v2, :cond_0

    .line 13
    .line 14
    const/4 v2, 0x4

    .line 15
    if-eq v0, v2, :cond_0

    .line 16
    .line 17
    const/4 v2, 0x5

    .line 18
    if-eq v0, v2, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    return v0

    .line 22
    :cond_0
    return v1
.end method
