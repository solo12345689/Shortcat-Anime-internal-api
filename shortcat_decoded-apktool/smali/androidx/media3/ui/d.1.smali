.class public Landroidx/media3/ui/d;
.super Landroid/widget/FrameLayout;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/ui/d$j;,
        Landroidx/media3/ui/d$b;,
        Landroidx/media3/ui/d$e;,
        Landroidx/media3/ui/d$h;,
        Landroidx/media3/ui/d$c;,
        Landroidx/media3/ui/d$f;,
        Landroidx/media3/ui/d$d;,
        Landroidx/media3/ui/d$m;,
        Landroidx/media3/ui/d$k;,
        Landroidx/media3/ui/d$i;,
        Landroidx/media3/ui/d$l;,
        Landroidx/media3/ui/d$g;
    }
.end annotation


# static fields
.field private static final g1:[F


# instance fields
.field private final A:Landroid/widget/ImageView;

.field private final A0:Landroid/graphics/drawable/Drawable;

.field private final B:Landroid/widget/ImageView;

.field private final B0:Landroid/graphics/drawable/Drawable;

.field private final C:Landroid/widget/ImageView;

.field private final C0:F

.field private final D:Landroid/widget/ImageView;

.field private final D0:F

.field private final E:Landroid/widget/ImageView;

.field private final E0:Ljava/lang/String;

.field private final F:Landroid/view/View;

.field private final F0:Ljava/lang/String;

.field private final G:Landroid/view/View;

.field private final G0:Landroid/graphics/drawable/Drawable;

.field private final H:Landroid/view/View;

.field private final H0:Landroid/graphics/drawable/Drawable;

.field private final I:Landroid/widget/TextView;

.field private final I0:Ljava/lang/String;

.field private final J0:Ljava/lang/String;

.field private final K0:Landroid/graphics/drawable/Drawable;

.field private final L0:Landroid/graphics/drawable/Drawable;

.field private final M0:Ljava/lang/String;

.field private final N0:Ljava/lang/String;

.field private O0:Lq2/P;

.field private P0:Landroidx/media3/ui/d$d;

.field private Q0:Z

.field private R0:Z

.field private S0:Z

.field private T0:Z

.field private U0:Z

.field private V0:Z

.field private W0:I

.field private X0:Z

.field private Y0:I

.field private Z0:I

.field private final a:Landroidx/media3/ui/w;

.field private a1:[J

.field private final b:Landroid/content/res/Resources;

.field private b1:[Z

.field private final c:Landroidx/media3/ui/d$c;

.field private c1:[J

.field private final d:Ljava/lang/Class;

.field private d1:[Z

.field private final e:Ljava/lang/reflect/Method;

.field private e1:J

.field private final f:Ljava/lang/reflect/Method;

.field private f1:Z

.field private final g:Ljava/lang/Class;

.field private final h:Ljava/lang/reflect/Method;

.field private final i:Ljava/lang/reflect/Method;

.field private final j:Ljava/util/concurrent/CopyOnWriteArrayList;

.field private final k:Landroidx/recyclerview/widget/RecyclerView;

.field private final l:Landroidx/media3/ui/d$h;

.field private final l0:Landroid/widget/TextView;

.field private final m:Landroidx/media3/ui/d$e;

.field private final m0:Landroidx/media3/ui/G;

.field private final n:Landroidx/media3/ui/d$j;

.field private final n0:Ljava/lang/StringBuilder;

.field private final o:Landroidx/media3/ui/d$b;

.field private final o0:Ljava/util/Formatter;

.field private final p:LG3/E;

.field private final p0:Lq2/Y$b;

.field private final q:Landroid/widget/PopupWindow;

.field private final q0:Lq2/Y$d;

.field private final r:I

.field private final r0:Ljava/lang/Runnable;

.field private final s:Landroid/widget/ImageView;

.field private final s0:Landroid/graphics/drawable/Drawable;

.field private final t:Landroid/widget/ImageView;

.field private final t0:Landroid/graphics/drawable/Drawable;

.field private final u:Landroid/widget/ImageView;

.field private final u0:Landroid/graphics/drawable/Drawable;

.field private final v:Landroid/view/View;

.field private final v0:Landroid/graphics/drawable/Drawable;

.field private final w:Landroid/view/View;

.field private final w0:Landroid/graphics/drawable/Drawable;

.field private final x:Landroid/widget/TextView;

.field private final x0:Ljava/lang/String;

.field private final y:Landroid/widget/TextView;

.field private final y0:Ljava/lang/String;

.field private final z:Landroid/widget/ImageView;

.field private final z0:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "media3.ui"

    .line 2
    .line 3
    invoke-static {v0}, Lq2/H;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x7

    .line 7
    new-array v0, v0, [F

    .line 8
    .line 9
    fill-array-data v0, :array_0

    .line 10
    .line 11
    .line 12
    sput-object v0, Landroidx/media3/ui/d;->g1:[F

    .line 13
    .line 14
    return-void

    .line 15
    :array_0
    .array-data 4
        0x3e800000    # 0.25f
        0x3f000000    # 0.5f
        0x3f400000    # 0.75f
        0x3f800000    # 1.0f
        0x3fa00000    # 1.25f
        0x3fc00000    # 1.5f
        0x40000000    # 2.0f
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/util/AttributeSet;)V
    .locals 35

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v6, p4

    .line 4
    .line 5
    const-string v0, "isScrubbingModeEnabled"

    .line 6
    .line 7
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 8
    .line 9
    const-string v3, "setScrubbingModeEnabled"

    .line 10
    .line 11
    invoke-direct/range {p0 .. p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 12
    .line 13
    .line 14
    sget v4, LG3/z;->b:I

    .line 15
    .line 16
    sget v5, LG3/v;->i:I

    .line 17
    .line 18
    sget v7, LG3/v;->h:I

    .line 19
    .line 20
    sget v8, LG3/v;->g:I

    .line 21
    .line 22
    sget v9, LG3/v;->p:I

    .line 23
    .line 24
    sget v10, LG3/v;->j:I

    .line 25
    .line 26
    sget v11, LG3/v;->q:I

    .line 27
    .line 28
    sget v12, LG3/v;->f:I

    .line 29
    .line 30
    sget v13, LG3/v;->e:I

    .line 31
    .line 32
    sget v14, LG3/v;->l:I

    .line 33
    .line 34
    sget v15, LG3/v;->m:I

    .line 35
    .line 36
    move-object/from16 v16, v2

    .line 37
    .line 38
    sget v2, LG3/v;->k:I

    .line 39
    .line 40
    move-object/from16 v17, v0

    .line 41
    .line 42
    sget v0, LG3/v;->o:I

    .line 43
    .line 44
    move-object/from16 v18, v3

    .line 45
    .line 46
    sget v3, LG3/v;->n:I

    .line 47
    .line 48
    move/from16 p2, v3

    .line 49
    .line 50
    sget v3, LG3/v;->t:I

    .line 51
    .line 52
    move/from16 v19, v3

    .line 53
    .line 54
    sget v3, LG3/v;->s:I

    .line 55
    .line 56
    move/from16 v20, v3

    .line 57
    .line 58
    sget v3, LG3/v;->u:I

    .line 59
    .line 60
    move/from16 v21, v3

    .line 61
    .line 62
    const/4 v3, 0x1

    .line 63
    iput-boolean v3, v1, Landroidx/media3/ui/d;->T0:Z

    .line 64
    .line 65
    const/16 v3, 0x1388

    .line 66
    .line 67
    iput v3, v1, Landroidx/media3/ui/d;->W0:I

    .line 68
    .line 69
    const/4 v3, 0x0

    .line 70
    iput v3, v1, Landroidx/media3/ui/d;->Z0:I

    .line 71
    .line 72
    const/16 v3, 0xc8

    .line 73
    .line 74
    iput v3, v1, Landroidx/media3/ui/d;->Y0:I

    .line 75
    .line 76
    if-eqz v6, :cond_0

    .line 77
    .line 78
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    sget-object v1, LG3/D;->y:[I

    .line 83
    .line 84
    move/from16 v24, v0

    .line 85
    .line 86
    move/from16 v25, v2

    .line 87
    .line 88
    const/4 v2, 0x0

    .line 89
    move/from16 v0, p3

    .line 90
    .line 91
    invoke-virtual {v3, v6, v1, v0, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    :try_start_0
    sget v0, LG3/D;->A:I

    .line 96
    .line 97
    invoke-virtual {v1, v0, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    sget v0, LG3/D;->G:I

    .line 102
    .line 103
    invoke-virtual {v1, v0, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    sget v0, LG3/D;->F:I

    .line 108
    .line 109
    invoke-virtual {v1, v0, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    sget v0, LG3/D;->E:I

    .line 114
    .line 115
    invoke-virtual {v1, v0, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    sget v0, LG3/D;->B:I

    .line 120
    .line 121
    invoke-virtual {v1, v0, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    sget v0, LG3/D;->H:I

    .line 126
    .line 127
    invoke-virtual {v1, v0, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 128
    .line 129
    .line 130
    move-result v10

    .line 131
    sget v0, LG3/D;->M:I

    .line 132
    .line 133
    invoke-virtual {v1, v0, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 134
    .line 135
    .line 136
    move-result v11

    .line 137
    sget v0, LG3/D;->D:I

    .line 138
    .line 139
    invoke-virtual {v1, v0, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 140
    .line 141
    .line 142
    move-result v12

    .line 143
    sget v0, LG3/D;->C:I

    .line 144
    .line 145
    invoke-virtual {v1, v0, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 146
    .line 147
    .line 148
    move-result v13

    .line 149
    sget v0, LG3/D;->J:I

    .line 150
    .line 151
    invoke-virtual {v1, v0, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 152
    .line 153
    .line 154
    move-result v14

    .line 155
    sget v0, LG3/D;->K:I

    .line 156
    .line 157
    invoke-virtual {v1, v0, v15}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 158
    .line 159
    .line 160
    move-result v15

    .line 161
    sget v0, LG3/D;->I:I

    .line 162
    .line 163
    move/from16 v2, v25

    .line 164
    .line 165
    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    sget v0, LG3/D;->W:I

    .line 170
    .line 171
    move/from16 v3, v24

    .line 172
    .line 173
    invoke-virtual {v1, v0, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    sget v3, LG3/D;->V:I

    .line 178
    .line 179
    move/from16 p3, v0

    .line 180
    .line 181
    move/from16 v0, p2

    .line 182
    .line 183
    invoke-virtual {v1, v3, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    sget v0, LG3/D;->Y:I

    .line 188
    .line 189
    move/from16 p2, v2

    .line 190
    .line 191
    move/from16 v2, v19

    .line 192
    .line 193
    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    sget v2, LG3/D;->X:I

    .line 198
    .line 199
    move/from16 v19, v0

    .line 200
    .line 201
    move/from16 v0, v20

    .line 202
    .line 203
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    sget v2, LG3/D;->b0:I

    .line 208
    .line 209
    move/from16 v20, v0

    .line 210
    .line 211
    move/from16 v0, v21

    .line 212
    .line 213
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    sget v2, LG3/D;->T:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 218
    .line 219
    move/from16 v24, v0

    .line 220
    .line 221
    move/from16 v21, v4

    .line 222
    .line 223
    move-object/from16 v4, p0

    .line 224
    .line 225
    :try_start_1
    iget v0, v4, Landroidx/media3/ui/d;->W0:I

    .line 226
    .line 227
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    iput v0, v4, Landroidx/media3/ui/d;->W0:I

    .line 232
    .line 233
    iget v0, v4, Landroidx/media3/ui/d;->Z0:I

    .line 234
    .line 235
    invoke-static {v1, v0}, Landroidx/media3/ui/d;->d0(Landroid/content/res/TypedArray;I)I

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    iput v0, v4, Landroidx/media3/ui/d;->Z0:I

    .line 240
    .line 241
    sget v0, LG3/D;->Q:I

    .line 242
    .line 243
    const/4 v2, 0x1

    .line 244
    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    move/from16 v25, v0

    .line 249
    .line 250
    sget v0, LG3/D;->N:I

    .line 251
    .line 252
    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    move/from16 v26, v0

    .line 257
    .line 258
    sget v0, LG3/D;->P:I

    .line 259
    .line 260
    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    move/from16 v27, v0

    .line 265
    .line 266
    sget v0, LG3/D;->O:I

    .line 267
    .line 268
    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    sget v2, LG3/D;->R:I

    .line 273
    .line 274
    move/from16 v28, v0

    .line 275
    .line 276
    const/4 v0, 0x0

    .line 277
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 278
    .line 279
    .line 280
    move-result v2

    .line 281
    move/from16 v29, v2

    .line 282
    .line 283
    sget v2, LG3/D;->S:I

    .line 284
    .line 285
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    move/from16 v30, v2

    .line 290
    .line 291
    sget v2, LG3/D;->U:I

    .line 292
    .line 293
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 294
    .line 295
    .line 296
    move-result v2

    .line 297
    move/from16 v31, v2

    .line 298
    .line 299
    sget v2, LG3/D;->a0:I

    .line 300
    .line 301
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    iput-boolean v2, v4, Landroidx/media3/ui/d;->X0:Z

    .line 306
    .line 307
    sget v0, LG3/D;->Z:I

    .line 308
    .line 309
    iget v2, v4, Landroidx/media3/ui/d;->Y0:I

    .line 310
    .line 311
    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    invoke-virtual {v4, v0}, Landroidx/media3/ui/d;->setTimeBarMinUpdateInterval(I)V

    .line 316
    .line 317
    .line 318
    sget v0, LG3/D;->z:I

    .line 319
    .line 320
    const/4 v2, 0x1

    .line 321
    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 322
    .line 323
    .line 324
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 325
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 326
    .line 327
    .line 328
    move v1, v13

    .line 329
    move v13, v9

    .line 330
    move v9, v12

    .line 331
    move v12, v10

    .line 332
    move v10, v1

    .line 333
    move/from16 v1, v28

    .line 334
    .line 335
    move/from16 v28, v25

    .line 336
    .line 337
    move/from16 v25, v29

    .line 338
    .line 339
    move/from16 v29, v26

    .line 340
    .line 341
    move/from16 v26, v1

    .line 342
    .line 343
    move v1, v0

    .line 344
    move/from16 v22, v2

    .line 345
    .line 346
    move v0, v14

    .line 347
    move v14, v8

    .line 348
    move v8, v15

    .line 349
    move v15, v7

    .line 350
    move v7, v5

    .line 351
    move/from16 v5, v21

    .line 352
    .line 353
    move/from16 v21, v31

    .line 354
    .line 355
    move/from16 v31, p2

    .line 356
    .line 357
    move/from16 p2, v19

    .line 358
    .line 359
    move/from16 v19, v3

    .line 360
    .line 361
    move/from16 v3, v24

    .line 362
    .line 363
    move/from16 v24, v30

    .line 364
    .line 365
    move/from16 v30, p3

    .line 366
    .line 367
    goto :goto_1

    .line 368
    :catchall_0
    move-exception v0

    .line 369
    goto :goto_0

    .line 370
    :catchall_1
    move-exception v0

    .line 371
    move-object/from16 v4, p0

    .line 372
    .line 373
    :goto_0
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 374
    .line 375
    .line 376
    throw v0

    .line 377
    :cond_0
    move v3, v4

    .line 378
    move-object v4, v1

    .line 379
    move v1, v3

    .line 380
    move v3, v0

    .line 381
    move/from16 v25, v2

    .line 382
    .line 383
    move/from16 v2, v19

    .line 384
    .line 385
    move/from16 v0, v21

    .line 386
    .line 387
    const/16 v22, 0x1

    .line 388
    .line 389
    move/from16 v19, p2

    .line 390
    .line 391
    move/from16 p2, v13

    .line 392
    .line 393
    move v13, v9

    .line 394
    move v9, v12

    .line 395
    move v12, v10

    .line 396
    move/from16 v10, p2

    .line 397
    .line 398
    move/from16 p2, v2

    .line 399
    .line 400
    move/from16 v30, v3

    .line 401
    .line 402
    move/from16 v26, v22

    .line 403
    .line 404
    move/from16 v27, v26

    .line 405
    .line 406
    move/from16 v28, v27

    .line 407
    .line 408
    move/from16 v29, v28

    .line 409
    .line 410
    move/from16 v31, v25

    .line 411
    .line 412
    const/16 v21, 0x0

    .line 413
    .line 414
    const/16 v24, 0x0

    .line 415
    .line 416
    const/16 v25, 0x0

    .line 417
    .line 418
    move v3, v0

    .line 419
    move v0, v14

    .line 420
    move v14, v8

    .line 421
    move v8, v15

    .line 422
    move v15, v7

    .line 423
    move v7, v5

    .line 424
    move v5, v1

    .line 425
    move/from16 v1, v29

    .line 426
    .line 427
    :goto_1
    invoke-static/range {p1 .. p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    invoke-virtual {v2, v5, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 432
    .line 433
    .line 434
    const/high16 v2, 0x40000

    .line 435
    .line 436
    invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 437
    .line 438
    .line 439
    new-instance v2, Landroidx/media3/ui/d$c;

    .line 440
    .line 441
    const/4 v5, 0x0

    .line 442
    invoke-direct {v2, v4, v5}, Landroidx/media3/ui/d$c;-><init>(Landroidx/media3/ui/d;Landroidx/media3/ui/d$a;)V

    .line 443
    .line 444
    .line 445
    iput-object v2, v4, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 446
    .line 447
    new-instance v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 448
    .line 449
    invoke-direct {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 450
    .line 451
    .line 452
    iput-object v2, v4, Landroidx/media3/ui/d;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 453
    .line 454
    new-instance v2, Lq2/Y$b;

    .line 455
    .line 456
    invoke-direct {v2}, Lq2/Y$b;-><init>()V

    .line 457
    .line 458
    .line 459
    iput-object v2, v4, Landroidx/media3/ui/d;->p0:Lq2/Y$b;

    .line 460
    .line 461
    new-instance v2, Lq2/Y$d;

    .line 462
    .line 463
    invoke-direct {v2}, Lq2/Y$d;-><init>()V

    .line 464
    .line 465
    .line 466
    iput-object v2, v4, Landroidx/media3/ui/d;->q0:Lq2/Y$d;

    .line 467
    .line 468
    new-instance v2, Ljava/lang/StringBuilder;

    .line 469
    .line 470
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 471
    .line 472
    .line 473
    iput-object v2, v4, Landroidx/media3/ui/d;->n0:Ljava/lang/StringBuilder;

    .line 474
    .line 475
    new-instance v5, Ljava/util/Formatter;

    .line 476
    .line 477
    move/from16 v32, v3

    .line 478
    .line 479
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 480
    .line 481
    .line 482
    move-result-object v3

    .line 483
    invoke-direct {v5, v2, v3}, Ljava/util/Formatter;-><init>(Ljava/lang/Appendable;Ljava/util/Locale;)V

    .line 484
    .line 485
    .line 486
    iput-object v5, v4, Landroidx/media3/ui/d;->o0:Ljava/util/Formatter;

    .line 487
    .line 488
    const/4 v2, 0x0

    .line 489
    new-array v3, v2, [J

    .line 490
    .line 491
    iput-object v3, v4, Landroidx/media3/ui/d;->a1:[J

    .line 492
    .line 493
    new-array v3, v2, [Z

    .line 494
    .line 495
    iput-object v3, v4, Landroidx/media3/ui/d;->b1:[Z

    .line 496
    .line 497
    new-array v3, v2, [J

    .line 498
    .line 499
    iput-object v3, v4, Landroidx/media3/ui/d;->c1:[J

    .line 500
    .line 501
    new-array v3, v2, [Z

    .line 502
    .line 503
    iput-object v3, v4, Landroidx/media3/ui/d;->d1:[Z

    .line 504
    .line 505
    new-instance v3, LG3/f;

    .line 506
    .line 507
    invoke-direct {v3, v4}, LG3/f;-><init>(Landroidx/media3/ui/d;)V

    .line 508
    .line 509
    .line 510
    iput-object v3, v4, Landroidx/media3/ui/d;->r0:Ljava/lang/Runnable;

    .line 511
    .line 512
    :try_start_2
    const-class v3, Landroidx/media3/exoplayer/ExoPlayer;
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_2

    .line 513
    .line 514
    :try_start_3
    filled-new-array/range {v16 .. v16}, [Ljava/lang/Class;

    .line 515
    .line 516
    .line 517
    move-result-object v5
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_1

    .line 518
    move-object/from16 v2, v18

    .line 519
    .line 520
    :try_start_4
    invoke-virtual {v3, v2, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 521
    .line 522
    .line 523
    move-result-object v5
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_0

    .line 524
    move-object/from16 v18, v5

    .line 525
    .line 526
    move-object/from16 v5, v17

    .line 527
    .line 528
    const/4 v6, 0x0

    .line 529
    :try_start_5
    invoke-virtual {v3, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 530
    .line 531
    .line 532
    move-result-object v17
    :try_end_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_3

    .line 533
    move-object/from16 v6, v17

    .line 534
    .line 535
    move/from16 v17, v7

    .line 536
    .line 537
    move-object v7, v6

    .line 538
    :goto_2
    move-object/from16 v6, v18

    .line 539
    .line 540
    goto :goto_5

    .line 541
    :catch_0
    move-object/from16 v5, v17

    .line 542
    .line 543
    :goto_3
    const/16 v18, 0x0

    .line 544
    .line 545
    goto :goto_4

    .line 546
    :catch_1
    move-object/from16 v5, v17

    .line 547
    .line 548
    move-object/from16 v2, v18

    .line 549
    .line 550
    goto :goto_3

    .line 551
    :catch_2
    move-object/from16 v5, v17

    .line 552
    .line 553
    move-object/from16 v2, v18

    .line 554
    .line 555
    const/4 v3, 0x0

    .line 556
    goto :goto_3

    .line 557
    :catch_3
    :goto_4
    move/from16 v17, v7

    .line 558
    .line 559
    const/4 v7, 0x0

    .line 560
    goto :goto_2

    .line 561
    :goto_5
    iput-object v3, v4, Landroidx/media3/ui/d;->d:Ljava/lang/Class;

    .line 562
    .line 563
    iput-object v6, v4, Landroidx/media3/ui/d;->e:Ljava/lang/reflect/Method;

    .line 564
    .line 565
    iput-object v7, v4, Landroidx/media3/ui/d;->f:Ljava/lang/reflect/Method;

    .line 566
    .line 567
    :try_start_6
    const-string v3, "androidx.media3.transformer.CompositionPlayer"

    .line 568
    .line 569
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    move-result-object v6
    :try_end_6
    .catch Ljava/lang/ClassNotFoundException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_6 .. :try_end_6} :catch_5

    .line 573
    :try_start_7
    filled-new-array/range {v16 .. v16}, [Ljava/lang/Class;

    .line 574
    .line 575
    .line 576
    move-result-object v3

    .line 577
    invoke-virtual {v6, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 578
    .line 579
    .line 580
    move-result-object v2
    :try_end_7
    .catch Ljava/lang/ClassNotFoundException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_7 .. :try_end_7} :catch_4

    .line 581
    const/4 v3, 0x0

    .line 582
    :try_start_8
    invoke-virtual {v6, v5, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 583
    .line 584
    .line 585
    move-result-object v5
    :try_end_8
    .catch Ljava/lang/ClassNotFoundException; {:try_start_8 .. :try_end_8} :catch_6
    .catch Ljava/lang/NoSuchMethodException; {:try_start_8 .. :try_end_8} :catch_6

    .line 586
    goto :goto_7

    .line 587
    :catch_4
    const/4 v3, 0x0

    .line 588
    move-object v2, v3

    .line 589
    goto :goto_6

    .line 590
    :catch_5
    const/4 v3, 0x0

    .line 591
    move-object v2, v3

    .line 592
    move-object v6, v2

    .line 593
    :catch_6
    :goto_6
    move-object v5, v3

    .line 594
    :goto_7
    iput-object v6, v4, Landroidx/media3/ui/d;->g:Ljava/lang/Class;

    .line 595
    .line 596
    iput-object v2, v4, Landroidx/media3/ui/d;->h:Ljava/lang/reflect/Method;

    .line 597
    .line 598
    iput-object v5, v4, Landroidx/media3/ui/d;->i:Ljava/lang/reflect/Method;

    .line 599
    .line 600
    sget v2, LG3/x;->m:I

    .line 601
    .line 602
    invoke-virtual {v4, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 603
    .line 604
    .line 605
    move-result-object v2

    .line 606
    check-cast v2, Landroid/widget/TextView;

    .line 607
    .line 608
    iput-object v2, v4, Landroidx/media3/ui/d;->I:Landroid/widget/TextView;

    .line 609
    .line 610
    sget v2, LG3/x;->E:I

    .line 611
    .line 612
    invoke-virtual {v4, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 613
    .line 614
    .line 615
    move-result-object v2

    .line 616
    check-cast v2, Landroid/widget/TextView;

    .line 617
    .line 618
    iput-object v2, v4, Landroidx/media3/ui/d;->l0:Landroid/widget/TextView;

    .line 619
    .line 620
    sget v2, LG3/x;->P:I

    .line 621
    .line 622
    invoke-virtual {v4, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 623
    .line 624
    .line 625
    move-result-object v2

    .line 626
    check-cast v2, Landroid/widget/ImageView;

    .line 627
    .line 628
    iput-object v2, v4, Landroidx/media3/ui/d;->C:Landroid/widget/ImageView;

    .line 629
    .line 630
    if-eqz v2, :cond_1

    .line 631
    .line 632
    iget-object v5, v4, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 633
    .line 634
    invoke-virtual {v2, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 635
    .line 636
    .line 637
    :cond_1
    sget v5, LG3/x;->s:I

    .line 638
    .line 639
    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 640
    .line 641
    .line 642
    move-result-object v5

    .line 643
    check-cast v5, Landroid/widget/ImageView;

    .line 644
    .line 645
    iput-object v5, v4, Landroidx/media3/ui/d;->D:Landroid/widget/ImageView;

    .line 646
    .line 647
    new-instance v6, LG3/g;

    .line 648
    .line 649
    invoke-direct {v6, v4}, LG3/g;-><init>(Landroidx/media3/ui/d;)V

    .line 650
    .line 651
    .line 652
    invoke-static {v5, v6}, Landroidx/media3/ui/d;->h0(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 653
    .line 654
    .line 655
    sget v5, LG3/x;->x:I

    .line 656
    .line 657
    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 658
    .line 659
    .line 660
    move-result-object v5

    .line 661
    check-cast v5, Landroid/widget/ImageView;

    .line 662
    .line 663
    iput-object v5, v4, Landroidx/media3/ui/d;->E:Landroid/widget/ImageView;

    .line 664
    .line 665
    new-instance v6, LG3/g;

    .line 666
    .line 667
    invoke-direct {v6, v4}, LG3/g;-><init>(Landroidx/media3/ui/d;)V

    .line 668
    .line 669
    .line 670
    invoke-static {v5, v6}, Landroidx/media3/ui/d;->h0(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 671
    .line 672
    .line 673
    sget v5, LG3/x;->L:I

    .line 674
    .line 675
    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 676
    .line 677
    .line 678
    move-result-object v5

    .line 679
    iput-object v5, v4, Landroidx/media3/ui/d;->F:Landroid/view/View;

    .line 680
    .line 681
    if-eqz v5, :cond_2

    .line 682
    .line 683
    iget-object v6, v4, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 684
    .line 685
    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 686
    .line 687
    .line 688
    :cond_2
    sget v5, LG3/x;->D:I

    .line 689
    .line 690
    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 691
    .line 692
    .line 693
    move-result-object v5

    .line 694
    iput-object v5, v4, Landroidx/media3/ui/d;->G:Landroid/view/View;

    .line 695
    .line 696
    if-eqz v5, :cond_3

    .line 697
    .line 698
    iget-object v6, v4, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 699
    .line 700
    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 701
    .line 702
    .line 703
    :cond_3
    sget v5, LG3/x;->c:I

    .line 704
    .line 705
    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 706
    .line 707
    .line 708
    move-result-object v5

    .line 709
    iput-object v5, v4, Landroidx/media3/ui/d;->H:Landroid/view/View;

    .line 710
    .line 711
    if-eqz v5, :cond_4

    .line 712
    .line 713
    iget-object v6, v4, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 714
    .line 715
    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 716
    .line 717
    .line 718
    :cond_4
    sget v5, LG3/x;->G:I

    .line 719
    .line 720
    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 721
    .line 722
    .line 723
    move-result-object v5

    .line 724
    check-cast v5, Landroidx/media3/ui/G;

    .line 725
    .line 726
    sget v6, LG3/x;->H:I

    .line 727
    .line 728
    invoke-virtual {v4, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 729
    .line 730
    .line 731
    move-result-object v6

    .line 732
    if-eqz v5, :cond_5

    .line 733
    .line 734
    iput-object v5, v4, Landroidx/media3/ui/d;->m0:Landroidx/media3/ui/G;

    .line 735
    .line 736
    move/from16 v16, v20

    .line 737
    .line 738
    move/from16 v20, v15

    .line 739
    .line 740
    move/from16 v15, v16

    .line 741
    .line 742
    move/from16 v16, v0

    .line 743
    .line 744
    move-object/from16 v34, v2

    .line 745
    .line 746
    move/from16 v18, v8

    .line 747
    .line 748
    move/from16 v23, v17

    .line 749
    .line 750
    move/from16 v33, v19

    .line 751
    .line 752
    move/from16 v0, v32

    .line 753
    .line 754
    move-object v8, v4

    .line 755
    move/from16 v19, v9

    .line 756
    .line 757
    move/from16 v17, v10

    .line 758
    .line 759
    move/from16 v9, p2

    .line 760
    .line 761
    move-object v10, v3

    .line 762
    move-object/from16 v3, p1

    .line 763
    .line 764
    goto/16 :goto_8

    .line 765
    .line 766
    :cond_5
    if-eqz v6, :cond_6

    .line 767
    .line 768
    move-object v5, v2

    .line 769
    new-instance v2, Landroidx/media3/ui/b;

    .line 770
    .line 771
    move-object v7, v5

    .line 772
    const/4 v5, 0x0

    .line 773
    move-object/from16 v16, v7

    .line 774
    .line 775
    sget v7, LG3/C;->a:I

    .line 776
    .line 777
    const/4 v4, 0x0

    .line 778
    move/from16 v18, v20

    .line 779
    .line 780
    move/from16 v20, v15

    .line 781
    .line 782
    move/from16 v15, v18

    .line 783
    .line 784
    move/from16 v18, v8

    .line 785
    .line 786
    move-object/from16 v34, v16

    .line 787
    .line 788
    move/from16 v23, v17

    .line 789
    .line 790
    move/from16 v33, v19

    .line 791
    .line 792
    move-object/from16 v8, p0

    .line 793
    .line 794
    move/from16 v16, v0

    .line 795
    .line 796
    move/from16 v19, v9

    .line 797
    .line 798
    move/from16 v17, v10

    .line 799
    .line 800
    move/from16 v0, v32

    .line 801
    .line 802
    move/from16 v9, p2

    .line 803
    .line 804
    move-object v10, v3

    .line 805
    move-object/from16 p2, v6

    .line 806
    .line 807
    move-object/from16 v3, p1

    .line 808
    .line 809
    move-object/from16 v6, p4

    .line 810
    .line 811
    invoke-direct/range {v2 .. v7}, Landroidx/media3/ui/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/util/AttributeSet;I)V

    .line 812
    .line 813
    .line 814
    sget v4, LG3/x;->G:I

    .line 815
    .line 816
    invoke-virtual {v2, v4}, Landroid/view/View;->setId(I)V

    .line 817
    .line 818
    .line 819
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 820
    .line 821
    .line 822
    move-result-object v4

    .line 823
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 824
    .line 825
    .line 826
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 827
    .line 828
    .line 829
    move-result-object v4

    .line 830
    check-cast v4, Landroid/view/ViewGroup;

    .line 831
    .line 832
    move-object/from16 v5, p2

    .line 833
    .line 834
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 835
    .line 836
    .line 837
    move-result v6

    .line 838
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 839
    .line 840
    .line 841
    invoke-virtual {v4, v2, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 842
    .line 843
    .line 844
    iput-object v2, v8, Landroidx/media3/ui/d;->m0:Landroidx/media3/ui/G;

    .line 845
    .line 846
    goto :goto_8

    .line 847
    :cond_6
    move/from16 v16, v20

    .line 848
    .line 849
    move/from16 v20, v15

    .line 850
    .line 851
    move/from16 v15, v16

    .line 852
    .line 853
    move/from16 v16, v0

    .line 854
    .line 855
    move-object/from16 v34, v2

    .line 856
    .line 857
    move/from16 v18, v8

    .line 858
    .line 859
    move/from16 v23, v17

    .line 860
    .line 861
    move/from16 v33, v19

    .line 862
    .line 863
    move/from16 v0, v32

    .line 864
    .line 865
    move-object v8, v4

    .line 866
    move/from16 v19, v9

    .line 867
    .line 868
    move/from16 v17, v10

    .line 869
    .line 870
    move/from16 v9, p2

    .line 871
    .line 872
    move-object v10, v3

    .line 873
    move-object/from16 v3, p1

    .line 874
    .line 875
    iput-object v10, v8, Landroidx/media3/ui/d;->m0:Landroidx/media3/ui/G;

    .line 876
    .line 877
    :goto_8
    iget-object v2, v8, Landroidx/media3/ui/d;->m0:Landroidx/media3/ui/G;

    .line 878
    .line 879
    if-eqz v2, :cond_7

    .line 880
    .line 881
    iget-object v4, v8, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 882
    .line 883
    invoke-interface {v2, v4}, Landroidx/media3/ui/G;->a(Landroidx/media3/ui/G$a;)V

    .line 884
    .line 885
    .line 886
    :cond_7
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 887
    .line 888
    .line 889
    move-result-object v2

    .line 890
    iput-object v2, v8, Landroidx/media3/ui/d;->b:Landroid/content/res/Resources;

    .line 891
    .line 892
    sget v4, LG3/x;->C:I

    .line 893
    .line 894
    invoke-virtual {v8, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 895
    .line 896
    .line 897
    move-result-object v4

    .line 898
    check-cast v4, Landroid/widget/ImageView;

    .line 899
    .line 900
    iput-object v4, v8, Landroidx/media3/ui/d;->u:Landroid/widget/ImageView;

    .line 901
    .line 902
    if-eqz v4, :cond_8

    .line 903
    .line 904
    iget-object v5, v8, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 905
    .line 906
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 907
    .line 908
    .line 909
    :cond_8
    sget v4, LG3/x;->F:I

    .line 910
    .line 911
    invoke-virtual {v8, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 912
    .line 913
    .line 914
    move-result-object v4

    .line 915
    check-cast v4, Landroid/widget/ImageView;

    .line 916
    .line 917
    iput-object v4, v8, Landroidx/media3/ui/d;->s:Landroid/widget/ImageView;

    .line 918
    .line 919
    if-eqz v4, :cond_9

    .line 920
    .line 921
    invoke-static {v3, v2, v12}, Lt2/a0;->c0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 922
    .line 923
    .line 924
    move-result-object v5

    .line 925
    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 926
    .line 927
    .line 928
    iget-object v5, v8, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 929
    .line 930
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 931
    .line 932
    .line 933
    :cond_9
    sget v5, LG3/x;->y:I

    .line 934
    .line 935
    invoke-virtual {v8, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 936
    .line 937
    .line 938
    move-result-object v5

    .line 939
    check-cast v5, Landroid/widget/ImageView;

    .line 940
    .line 941
    iput-object v5, v8, Landroidx/media3/ui/d;->t:Landroid/widget/ImageView;

    .line 942
    .line 943
    if-eqz v5, :cond_a

    .line 944
    .line 945
    invoke-static {v3, v2, v14}, Lt2/a0;->c0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 946
    .line 947
    .line 948
    move-result-object v6

    .line 949
    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 950
    .line 951
    .line 952
    iget-object v6, v8, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 953
    .line 954
    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 955
    .line 956
    .line 957
    :cond_a
    sget v6, LG3/w;->a:I

    .line 958
    .line 959
    invoke-static {v3, v6}, Lz1/k;->h(Landroid/content/Context;I)Landroid/graphics/Typeface;

    .line 960
    .line 961
    .line 962
    move-result-object v6

    .line 963
    sget v7, LG3/x;->J:I

    .line 964
    .line 965
    invoke-virtual {v8, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 966
    .line 967
    .line 968
    move-result-object v7

    .line 969
    check-cast v7, Landroid/widget/ImageView;

    .line 970
    .line 971
    sget v12, LG3/x;->K:I

    .line 972
    .line 973
    invoke-virtual {v8, v12}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 974
    .line 975
    .line 976
    move-result-object v12

    .line 977
    check-cast v12, Landroid/widget/TextView;

    .line 978
    .line 979
    if-eqz v7, :cond_b

    .line 980
    .line 981
    invoke-static {v3, v2, v11}, Lt2/a0;->c0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 982
    .line 983
    .line 984
    move-result-object v11

    .line 985
    invoke-virtual {v7, v11}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 986
    .line 987
    .line 988
    iput-object v7, v8, Landroidx/media3/ui/d;->w:Landroid/view/View;

    .line 989
    .line 990
    iput-object v10, v8, Landroidx/media3/ui/d;->y:Landroid/widget/TextView;

    .line 991
    .line 992
    goto :goto_9

    .line 993
    :cond_b
    if-eqz v12, :cond_c

    .line 994
    .line 995
    invoke-virtual {v12, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 996
    .line 997
    .line 998
    iput-object v12, v8, Landroidx/media3/ui/d;->y:Landroid/widget/TextView;

    .line 999
    .line 1000
    iput-object v12, v8, Landroidx/media3/ui/d;->w:Landroid/view/View;

    .line 1001
    .line 1002
    goto :goto_9

    .line 1003
    :cond_c
    iput-object v10, v8, Landroidx/media3/ui/d;->y:Landroid/widget/TextView;

    .line 1004
    .line 1005
    iput-object v10, v8, Landroidx/media3/ui/d;->w:Landroid/view/View;

    .line 1006
    .line 1007
    :goto_9
    iget-object v7, v8, Landroidx/media3/ui/d;->w:Landroid/view/View;

    .line 1008
    .line 1009
    if-eqz v7, :cond_d

    .line 1010
    .line 1011
    iget-object v11, v8, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 1012
    .line 1013
    invoke-virtual {v7, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1014
    .line 1015
    .line 1016
    :cond_d
    sget v7, LG3/x;->q:I

    .line 1017
    .line 1018
    invoke-virtual {v8, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v7

    .line 1022
    check-cast v7, Landroid/widget/ImageView;

    .line 1023
    .line 1024
    sget v11, LG3/x;->r:I

    .line 1025
    .line 1026
    invoke-virtual {v8, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v11

    .line 1030
    check-cast v11, Landroid/widget/TextView;

    .line 1031
    .line 1032
    if-eqz v7, :cond_e

    .line 1033
    .line 1034
    invoke-static {v3, v2, v13}, Lt2/a0;->c0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v6

    .line 1038
    invoke-virtual {v7, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1039
    .line 1040
    .line 1041
    iput-object v7, v8, Landroidx/media3/ui/d;->v:Landroid/view/View;

    .line 1042
    .line 1043
    iput-object v10, v8, Landroidx/media3/ui/d;->x:Landroid/widget/TextView;

    .line 1044
    .line 1045
    goto :goto_a

    .line 1046
    :cond_e
    if-eqz v11, :cond_f

    .line 1047
    .line 1048
    invoke-virtual {v11, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 1049
    .line 1050
    .line 1051
    iput-object v11, v8, Landroidx/media3/ui/d;->x:Landroid/widget/TextView;

    .line 1052
    .line 1053
    iput-object v11, v8, Landroidx/media3/ui/d;->v:Landroid/view/View;

    .line 1054
    .line 1055
    goto :goto_a

    .line 1056
    :cond_f
    iput-object v10, v8, Landroidx/media3/ui/d;->x:Landroid/widget/TextView;

    .line 1057
    .line 1058
    iput-object v10, v8, Landroidx/media3/ui/d;->v:Landroid/view/View;

    .line 1059
    .line 1060
    :goto_a
    iget-object v6, v8, Landroidx/media3/ui/d;->v:Landroid/view/View;

    .line 1061
    .line 1062
    if-eqz v6, :cond_10

    .line 1063
    .line 1064
    iget-object v7, v8, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 1065
    .line 1066
    invoke-virtual {v6, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1067
    .line 1068
    .line 1069
    :cond_10
    sget v6, LG3/x;->I:I

    .line 1070
    .line 1071
    invoke-virtual {v8, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v6

    .line 1075
    check-cast v6, Landroid/widget/ImageView;

    .line 1076
    .line 1077
    iput-object v6, v8, Landroidx/media3/ui/d;->z:Landroid/widget/ImageView;

    .line 1078
    .line 1079
    if-eqz v6, :cond_11

    .line 1080
    .line 1081
    iget-object v7, v8, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 1082
    .line 1083
    invoke-virtual {v6, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1084
    .line 1085
    .line 1086
    :cond_11
    sget v7, LG3/x;->M:I

    .line 1087
    .line 1088
    invoke-virtual {v8, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v7

    .line 1092
    check-cast v7, Landroid/widget/ImageView;

    .line 1093
    .line 1094
    iput-object v7, v8, Landroidx/media3/ui/d;->A:Landroid/widget/ImageView;

    .line 1095
    .line 1096
    if-eqz v7, :cond_12

    .line 1097
    .line 1098
    iget-object v11, v8, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 1099
    .line 1100
    invoke-virtual {v7, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1101
    .line 1102
    .line 1103
    :cond_12
    sget v11, LG3/y;->b:I

    .line 1104
    .line 1105
    invoke-virtual {v2, v11}, Landroid/content/res/Resources;->getInteger(I)I

    .line 1106
    .line 1107
    .line 1108
    move-result v11

    .line 1109
    int-to-float v11, v11

    .line 1110
    const/high16 v12, 0x42c80000    # 100.0f

    .line 1111
    .line 1112
    div-float/2addr v11, v12

    .line 1113
    iput v11, v8, Landroidx/media3/ui/d;->C0:F

    .line 1114
    .line 1115
    sget v11, LG3/y;->a:I

    .line 1116
    .line 1117
    invoke-virtual {v2, v11}, Landroid/content/res/Resources;->getInteger(I)I

    .line 1118
    .line 1119
    .line 1120
    move-result v11

    .line 1121
    int-to-float v11, v11

    .line 1122
    div-float/2addr v11, v12

    .line 1123
    iput v11, v8, Landroidx/media3/ui/d;->D0:F

    .line 1124
    .line 1125
    sget v11, LG3/x;->T:I

    .line 1126
    .line 1127
    invoke-virtual {v8, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v11

    .line 1131
    check-cast v11, Landroid/widget/ImageView;

    .line 1132
    .line 1133
    iput-object v11, v8, Landroidx/media3/ui/d;->B:Landroid/widget/ImageView;

    .line 1134
    .line 1135
    if-eqz v11, :cond_13

    .line 1136
    .line 1137
    invoke-static {v3, v2, v0}, Lt2/a0;->c0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v0

    .line 1141
    invoke-virtual {v11, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1142
    .line 1143
    .line 1144
    const/4 v0, 0x0

    .line 1145
    invoke-direct {v8, v0, v11}, Landroidx/media3/ui/d;->x0(ZLandroid/view/View;)V

    .line 1146
    .line 1147
    .line 1148
    goto :goto_b

    .line 1149
    :cond_13
    const/4 v0, 0x0

    .line 1150
    :goto_b
    new-instance v12, Landroidx/media3/ui/w;

    .line 1151
    .line 1152
    invoke-direct {v12, v8}, Landroidx/media3/ui/w;-><init>(Landroidx/media3/ui/d;)V

    .line 1153
    .line 1154
    .line 1155
    iput-object v12, v8, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 1156
    .line 1157
    invoke-virtual {v12, v1}, Landroidx/media3/ui/w;->T(Z)V

    .line 1158
    .line 1159
    .line 1160
    sget v1, LG3/B;->h:I

    .line 1161
    .line 1162
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v1

    .line 1166
    sget v13, LG3/v;->r:I

    .line 1167
    .line 1168
    invoke-static {v3, v2, v13}, Lt2/a0;->c0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v13

    .line 1172
    sget v14, LG3/B;->y:I

    .line 1173
    .line 1174
    invoke-virtual {v2, v14}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v14

    .line 1178
    filled-new-array {v1, v14}, [Ljava/lang/String;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v1

    .line 1182
    sget v14, LG3/v;->d:I

    .line 1183
    .line 1184
    invoke-static {v3, v2, v14}, Lt2/a0;->c0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v14

    .line 1188
    filled-new-array {v13, v14}, [Landroid/graphics/drawable/Drawable;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v13

    .line 1192
    new-instance v14, Landroidx/media3/ui/d$h;

    .line 1193
    .line 1194
    invoke-direct {v14, v8, v1, v13}, Landroidx/media3/ui/d$h;-><init>(Landroidx/media3/ui/d;[Ljava/lang/String;[Landroid/graphics/drawable/Drawable;)V

    .line 1195
    .line 1196
    .line 1197
    iput-object v14, v8, Landroidx/media3/ui/d;->l:Landroidx/media3/ui/d$h;

    .line 1198
    .line 1199
    sget v1, LG3/u;->a:I

    .line 1200
    .line 1201
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 1202
    .line 1203
    .line 1204
    move-result v1

    .line 1205
    iput v1, v8, Landroidx/media3/ui/d;->r:I

    .line 1206
    .line 1207
    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v1

    .line 1211
    sget v13, LG3/z;->d:I

    .line 1212
    .line 1213
    invoke-virtual {v1, v13, v10}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v1

    .line 1217
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 1218
    .line 1219
    iput-object v1, v8, Landroidx/media3/ui/d;->k:Landroidx/recyclerview/widget/RecyclerView;

    .line 1220
    .line 1221
    invoke-virtual {v1, v14}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 1222
    .line 1223
    .line 1224
    new-instance v13, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 1225
    .line 1226
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v14

    .line 1230
    invoke-direct {v13, v14}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 1231
    .line 1232
    .line 1233
    invoke-virtual {v1, v13}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    .line 1234
    .line 1235
    .line 1236
    new-instance v13, Landroid/widget/PopupWindow;

    .line 1237
    .line 1238
    const/4 v14, -0x2

    .line 1239
    const/4 v0, 0x1

    .line 1240
    invoke-direct {v13, v1, v14, v14, v0}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    .line 1241
    .line 1242
    .line 1243
    iput-object v13, v8, Landroidx/media3/ui/d;->q:Landroid/widget/PopupWindow;

    .line 1244
    .line 1245
    iget-object v1, v8, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 1246
    .line 1247
    invoke-virtual {v13, v1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 1248
    .line 1249
    .line 1250
    iput-boolean v0, v8, Landroidx/media3/ui/d;->f1:Z

    .line 1251
    .line 1252
    new-instance v0, LG3/e;

    .line 1253
    .line 1254
    invoke-virtual {v8}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v1

    .line 1258
    invoke-direct {v0, v1}, LG3/e;-><init>(Landroid/content/res/Resources;)V

    .line 1259
    .line 1260
    .line 1261
    iput-object v0, v8, Landroidx/media3/ui/d;->p:LG3/E;

    .line 1262
    .line 1263
    invoke-static {v3, v2, v9}, Lt2/a0;->c0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v0

    .line 1267
    iput-object v0, v8, Landroidx/media3/ui/d;->G0:Landroid/graphics/drawable/Drawable;

    .line 1268
    .line 1269
    invoke-static {v3, v2, v15}, Lt2/a0;->c0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v0

    .line 1273
    iput-object v0, v8, Landroidx/media3/ui/d;->H0:Landroid/graphics/drawable/Drawable;

    .line 1274
    .line 1275
    sget v0, LG3/B;->b:I

    .line 1276
    .line 1277
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1278
    .line 1279
    .line 1280
    move-result-object v0

    .line 1281
    iput-object v0, v8, Landroidx/media3/ui/d;->I0:Ljava/lang/String;

    .line 1282
    .line 1283
    sget v0, LG3/B;->a:I

    .line 1284
    .line 1285
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v0

    .line 1289
    iput-object v0, v8, Landroidx/media3/ui/d;->J0:Ljava/lang/String;

    .line 1290
    .line 1291
    new-instance v0, Landroidx/media3/ui/d$j;

    .line 1292
    .line 1293
    invoke-direct {v0, v8, v10}, Landroidx/media3/ui/d$j;-><init>(Landroidx/media3/ui/d;Landroidx/media3/ui/d$a;)V

    .line 1294
    .line 1295
    .line 1296
    iput-object v0, v8, Landroidx/media3/ui/d;->n:Landroidx/media3/ui/d$j;

    .line 1297
    .line 1298
    new-instance v0, Landroidx/media3/ui/d$b;

    .line 1299
    .line 1300
    invoke-direct {v0, v8, v10}, Landroidx/media3/ui/d$b;-><init>(Landroidx/media3/ui/d;Landroidx/media3/ui/d$a;)V

    .line 1301
    .line 1302
    .line 1303
    iput-object v0, v8, Landroidx/media3/ui/d;->o:Landroidx/media3/ui/d$b;

    .line 1304
    .line 1305
    new-instance v0, Landroidx/media3/ui/d$e;

    .line 1306
    .line 1307
    sget v1, LG3/s;->a:I

    .line 1308
    .line 1309
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v1

    .line 1313
    sget-object v9, Landroidx/media3/ui/d;->g1:[F

    .line 1314
    .line 1315
    invoke-direct {v0, v8, v1, v9}, Landroidx/media3/ui/d$e;-><init>(Landroidx/media3/ui/d;[Ljava/lang/String;[F)V

    .line 1316
    .line 1317
    .line 1318
    iput-object v0, v8, Landroidx/media3/ui/d;->m:Landroidx/media3/ui/d$e;

    .line 1319
    .line 1320
    move/from16 v0, v23

    .line 1321
    .line 1322
    invoke-static {v3, v2, v0}, Lt2/a0;->c0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v0

    .line 1326
    iput-object v0, v8, Landroidx/media3/ui/d;->s0:Landroid/graphics/drawable/Drawable;

    .line 1327
    .line 1328
    move/from16 v0, v20

    .line 1329
    .line 1330
    invoke-static {v3, v2, v0}, Lt2/a0;->c0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 1331
    .line 1332
    .line 1333
    move-result-object v0

    .line 1334
    iput-object v0, v8, Landroidx/media3/ui/d;->t0:Landroid/graphics/drawable/Drawable;

    .line 1335
    .line 1336
    move/from16 v0, v19

    .line 1337
    .line 1338
    invoke-static {v3, v2, v0}, Lt2/a0;->c0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v0

    .line 1342
    iput-object v0, v8, Landroidx/media3/ui/d;->K0:Landroid/graphics/drawable/Drawable;

    .line 1343
    .line 1344
    move/from16 v13, v17

    .line 1345
    .line 1346
    invoke-static {v3, v2, v13}, Lt2/a0;->c0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v0

    .line 1350
    iput-object v0, v8, Landroidx/media3/ui/d;->L0:Landroid/graphics/drawable/Drawable;

    .line 1351
    .line 1352
    move/from16 v14, v16

    .line 1353
    .line 1354
    invoke-static {v3, v2, v14}, Lt2/a0;->c0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v0

    .line 1358
    iput-object v0, v8, Landroidx/media3/ui/d;->u0:Landroid/graphics/drawable/Drawable;

    .line 1359
    .line 1360
    move/from16 v15, v18

    .line 1361
    .line 1362
    invoke-static {v3, v2, v15}, Lt2/a0;->c0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v0

    .line 1366
    iput-object v0, v8, Landroidx/media3/ui/d;->v0:Landroid/graphics/drawable/Drawable;

    .line 1367
    .line 1368
    move/from16 v0, v31

    .line 1369
    .line 1370
    invoke-static {v3, v2, v0}, Lt2/a0;->c0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v0

    .line 1374
    iput-object v0, v8, Landroidx/media3/ui/d;->w0:Landroid/graphics/drawable/Drawable;

    .line 1375
    .line 1376
    move/from16 v0, v30

    .line 1377
    .line 1378
    invoke-static {v3, v2, v0}, Lt2/a0;->c0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v0

    .line 1382
    iput-object v0, v8, Landroidx/media3/ui/d;->A0:Landroid/graphics/drawable/Drawable;

    .line 1383
    .line 1384
    move/from16 v0, v33

    .line 1385
    .line 1386
    invoke-static {v3, v2, v0}, Lt2/a0;->c0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v0

    .line 1390
    iput-object v0, v8, Landroidx/media3/ui/d;->B0:Landroid/graphics/drawable/Drawable;

    .line 1391
    .line 1392
    sget v0, LG3/B;->d:I

    .line 1393
    .line 1394
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v0

    .line 1398
    iput-object v0, v8, Landroidx/media3/ui/d;->M0:Ljava/lang/String;

    .line 1399
    .line 1400
    sget v0, LG3/B;->c:I

    .line 1401
    .line 1402
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v0

    .line 1406
    iput-object v0, v8, Landroidx/media3/ui/d;->N0:Ljava/lang/String;

    .line 1407
    .line 1408
    sget v0, LG3/B;->j:I

    .line 1409
    .line 1410
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v0

    .line 1414
    iput-object v0, v8, Landroidx/media3/ui/d;->x0:Ljava/lang/String;

    .line 1415
    .line 1416
    sget v0, LG3/B;->k:I

    .line 1417
    .line 1418
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v0

    .line 1422
    iput-object v0, v8, Landroidx/media3/ui/d;->y0:Ljava/lang/String;

    .line 1423
    .line 1424
    sget v0, LG3/B;->i:I

    .line 1425
    .line 1426
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v0

    .line 1430
    iput-object v0, v8, Landroidx/media3/ui/d;->z0:Ljava/lang/String;

    .line 1431
    .line 1432
    sget v0, LG3/B;->n:I

    .line 1433
    .line 1434
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v0

    .line 1438
    iput-object v0, v8, Landroidx/media3/ui/d;->E0:Ljava/lang/String;

    .line 1439
    .line 1440
    sget v0, LG3/B;->m:I

    .line 1441
    .line 1442
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1443
    .line 1444
    .line 1445
    move-result-object v0

    .line 1446
    iput-object v0, v8, Landroidx/media3/ui/d;->F0:Ljava/lang/String;

    .line 1447
    .line 1448
    sget v0, LG3/x;->e:I

    .line 1449
    .line 1450
    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v0

    .line 1454
    check-cast v0, Landroid/view/ViewGroup;

    .line 1455
    .line 1456
    const/4 v2, 0x1

    .line 1457
    invoke-virtual {v12, v0, v2}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 1458
    .line 1459
    .line 1460
    iget-object v0, v8, Landroidx/media3/ui/d;->v:Landroid/view/View;

    .line 1461
    .line 1462
    move/from16 v1, v29

    .line 1463
    .line 1464
    invoke-virtual {v12, v0, v1}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 1465
    .line 1466
    .line 1467
    iget-object v0, v8, Landroidx/media3/ui/d;->w:Landroid/view/View;

    .line 1468
    .line 1469
    move/from16 v1, v28

    .line 1470
    .line 1471
    invoke-virtual {v12, v0, v1}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 1472
    .line 1473
    .line 1474
    move/from16 v0, v27

    .line 1475
    .line 1476
    invoke-virtual {v12, v4, v0}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 1477
    .line 1478
    .line 1479
    move/from16 v0, v26

    .line 1480
    .line 1481
    invoke-virtual {v12, v5, v0}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 1482
    .line 1483
    .line 1484
    move/from16 v0, v25

    .line 1485
    .line 1486
    invoke-virtual {v12, v7, v0}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 1487
    .line 1488
    .line 1489
    move/from16 v0, v24

    .line 1490
    .line 1491
    move-object/from16 v5, v34

    .line 1492
    .line 1493
    invoke-virtual {v12, v5, v0}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 1494
    .line 1495
    .line 1496
    move/from16 v0, v21

    .line 1497
    .line 1498
    invoke-virtual {v12, v11, v0}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 1499
    .line 1500
    .line 1501
    iget v0, v8, Landroidx/media3/ui/d;->Z0:I

    .line 1502
    .line 1503
    if-eqz v0, :cond_14

    .line 1504
    .line 1505
    move v3, v2

    .line 1506
    goto :goto_c

    .line 1507
    :cond_14
    const/4 v3, 0x0

    .line 1508
    :goto_c
    invoke-virtual {v12, v6, v3}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 1509
    .line 1510
    .line 1511
    new-instance v0, LG3/h;

    .line 1512
    .line 1513
    invoke-direct {v0, v8}, LG3/h;-><init>(Landroidx/media3/ui/d;)V

    .line 1514
    .line 1515
    .line 1516
    invoke-virtual {v8, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 1517
    .line 1518
    .line 1519
    return-void
.end method

.method static synthetic A(Landroidx/media3/ui/d;)I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/media3/ui/d;->Z0:I

    .line 2
    .line 3
    return p0
.end method

.method private static A0(Landroid/view/View;Z)V
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    if-eqz p1, :cond_1

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_1
    const/16 p1, 0x8

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method static synthetic B(Landroidx/media3/ui/d;)Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->A:Landroid/widget/ImageView;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic C(Landroidx/media3/ui/d;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->F:Landroid/view/View;

    .line 2
    .line 3
    return-object p0
.end method

.method private C0()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/media3/ui/d;->n0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/media3/ui/d;->R0:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/media3/ui/d;->O0:Lq2/P;

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    iget-boolean v1, p0, Landroidx/media3/ui/d;->S0:Z

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    iget-object v1, p0, Landroidx/media3/ui/d;->q0:Lq2/Y$d;

    .line 21
    .line 22
    invoke-static {v0, v1}, Landroidx/media3/ui/d;->Z(Lq2/P;Lq2/Y$d;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    const/16 v1, 0xa

    .line 29
    .line 30
    invoke-interface {v0, v1}, Lq2/P;->k(I)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v1, 0x5

    .line 36
    invoke-interface {v0, v1}, Lq2/P;->k(I)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    :goto_0
    const/4 v2, 0x7

    .line 41
    invoke-interface {v0, v2}, Lq2/P;->k(I)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    const/16 v3, 0xb

    .line 46
    .line 47
    invoke-interface {v0, v3}, Lq2/P;->k(I)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    const/16 v4, 0xc

    .line 52
    .line 53
    invoke-interface {v0, v4}, Lq2/P;->k(I)Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    const/16 v5, 0x9

    .line 58
    .line 59
    invoke-interface {v0, v5}, Lq2/P;->k(I)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    const/4 v1, 0x0

    .line 65
    move v0, v1

    .line 66
    move v2, v0

    .line 67
    move v3, v2

    .line 68
    move v4, v3

    .line 69
    :goto_1
    if-eqz v3, :cond_3

    .line 70
    .line 71
    invoke-direct {p0}, Landroidx/media3/ui/d;->H0()V

    .line 72
    .line 73
    .line 74
    :cond_3
    if-eqz v4, :cond_4

    .line 75
    .line 76
    invoke-direct {p0}, Landroidx/media3/ui/d;->y0()V

    .line 77
    .line 78
    .line 79
    :cond_4
    iget-object v5, p0, Landroidx/media3/ui/d;->s:Landroid/widget/ImageView;

    .line 80
    .line 81
    invoke-direct {p0, v2, v5}, Landroidx/media3/ui/d;->x0(ZLandroid/view/View;)V

    .line 82
    .line 83
    .line 84
    iget-object v2, p0, Landroidx/media3/ui/d;->w:Landroid/view/View;

    .line 85
    .line 86
    invoke-direct {p0, v3, v2}, Landroidx/media3/ui/d;->x0(ZLandroid/view/View;)V

    .line 87
    .line 88
    .line 89
    iget-object v2, p0, Landroidx/media3/ui/d;->v:Landroid/view/View;

    .line 90
    .line 91
    invoke-direct {p0, v4, v2}, Landroidx/media3/ui/d;->x0(ZLandroid/view/View;)V

    .line 92
    .line 93
    .line 94
    iget-object v2, p0, Landroidx/media3/ui/d;->t:Landroid/widget/ImageView;

    .line 95
    .line 96
    invoke-direct {p0, v0, v2}, Landroidx/media3/ui/d;->x0(ZLandroid/view/View;)V

    .line 97
    .line 98
    .line 99
    iget-object v0, p0, Landroidx/media3/ui/d;->m0:Landroidx/media3/ui/G;

    .line 100
    .line 101
    if-eqz v0, :cond_5

    .line 102
    .line 103
    invoke-interface {v0, v1}, Landroidx/media3/ui/G;->setEnabled(Z)V

    .line 104
    .line 105
    .line 106
    :cond_5
    :goto_2
    return-void
.end method

.method static synthetic D(Landroidx/media3/ui/d;)Landroidx/media3/ui/d$h;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->l:Landroidx/media3/ui/d$h;

    .line 2
    .line 3
    return-object p0
.end method

.method private D0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/media3/ui/d;->n0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/media3/ui/d;->R0:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/media3/ui/d;->u:Landroid/widget/ImageView;

    .line 13
    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/media3/ui/d;->O0:Lq2/P;

    .line 17
    .line 18
    iget-boolean v1, p0, Landroidx/media3/ui/d;->T0:Z

    .line 19
    .line 20
    invoke-static {v0, v1}, Lt2/a0;->s1(Lq2/P;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v1, p0, Landroidx/media3/ui/d;->s0:Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-object v1, p0, Landroidx/media3/ui/d;->t0:Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    :goto_0
    if-eqz v0, :cond_2

    .line 32
    .line 33
    sget v0, LG3/B;->g:I

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    sget v0, LG3/B;->f:I

    .line 37
    .line 38
    :goto_1
    iget-object v2, p0, Landroidx/media3/ui/d;->u:Landroid/widget/ImageView;

    .line 39
    .line 40
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, Landroidx/media3/ui/d;->u:Landroid/widget/ImageView;

    .line 44
    .line 45
    iget-object v2, p0, Landroidx/media3/ui/d;->b:Landroid/content/res/Resources;

    .line 46
    .line 47
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v1, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Landroidx/media3/ui/d;->O0:Lq2/P;

    .line 55
    .line 56
    invoke-static {v0}, Lt2/a0;->r1(Lq2/P;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-object v1, p0, Landroidx/media3/ui/d;->u:Landroid/widget/ImageView;

    .line 61
    .line 62
    invoke-direct {p0, v0, v1}, Landroidx/media3/ui/d;->x0(ZLandroid/view/View;)V

    .line 63
    .line 64
    .line 65
    :cond_3
    :goto_2
    return-void
.end method

.method static synthetic E(Landroidx/media3/ui/d;Landroidx/recyclerview/widget/RecyclerView$h;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/media3/ui/d;->b0(Landroidx/recyclerview/widget/RecyclerView$h;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private E0()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->O0:Lq2/P;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v1, p0, Landroidx/media3/ui/d;->m:Landroidx/media3/ui/d$e;

    .line 7
    .line 8
    invoke-interface {v0}, Lq2/P;->c()Lq2/O;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget v0, v0, Lq2/O;->a:F

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Landroidx/media3/ui/d$e;->z(F)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Landroidx/media3/ui/d;->l:Landroidx/media3/ui/d$h;

    .line 18
    .line 19
    iget-object v1, p0, Landroidx/media3/ui/d;->m:Landroidx/media3/ui/d$e;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroidx/media3/ui/d$e;->w()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-virtual {v0, v2, v1}, Landroidx/media3/ui/d$h;->y(ILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0}, Landroidx/media3/ui/d;->I0()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method static synthetic F(Landroidx/media3/ui/d;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->G:Landroid/view/View;

    .line 2
    .line 3
    return-object p0
.end method

.method private F0()V
    .locals 13

    .line 1
    invoke-virtual {p0}, Landroidx/media3/ui/d;->n0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_9

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/media3/ui/d;->R0:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_3

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Landroidx/media3/ui/d;->O0:Lq2/P;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/16 v1, 0x10

    .line 18
    .line 19
    invoke-interface {v0, v1}, Lq2/P;->k(I)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    iget-wide v1, p0, Landroidx/media3/ui/d;->e1:J

    .line 26
    .line 27
    invoke-interface {v0}, Lq2/P;->G0()J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    add-long/2addr v1, v3

    .line 32
    iget-wide v3, p0, Landroidx/media3/ui/d;->e1:J

    .line 33
    .line 34
    invoke-interface {v0}, Lq2/P;->R0()J

    .line 35
    .line 36
    .line 37
    move-result-wide v5

    .line 38
    add-long/2addr v3, v5

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const-wide/16 v1, 0x0

    .line 41
    .line 42
    move-wide v3, v1

    .line 43
    :goto_0
    iget-object v5, p0, Landroidx/media3/ui/d;->l0:Landroid/widget/TextView;

    .line 44
    .line 45
    if-eqz v5, :cond_2

    .line 46
    .line 47
    iget-boolean v6, p0, Landroidx/media3/ui/d;->V0:Z

    .line 48
    .line 49
    if-nez v6, :cond_2

    .line 50
    .line 51
    iget-object v6, p0, Landroidx/media3/ui/d;->n0:Ljava/lang/StringBuilder;

    .line 52
    .line 53
    iget-object v7, p0, Landroidx/media3/ui/d;->o0:Ljava/util/Formatter;

    .line 54
    .line 55
    invoke-static {v6, v7, v1, v2}, Lt2/a0;->s0(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    iget-object v5, p0, Landroidx/media3/ui/d;->m0:Landroidx/media3/ui/G;

    .line 63
    .line 64
    if-eqz v5, :cond_4

    .line 65
    .line 66
    invoke-interface {v5, v1, v2}, Landroidx/media3/ui/G;->setPosition(J)V

    .line 67
    .line 68
    .line 69
    iget-object v5, p0, Landroidx/media3/ui/d;->m0:Landroidx/media3/ui/G;

    .line 70
    .line 71
    invoke-direct {p0, v0}, Landroidx/media3/ui/d;->m0(Lq2/P;)Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-eqz v6, :cond_3

    .line 76
    .line 77
    move-wide v3, v1

    .line 78
    :cond_3
    invoke-interface {v5, v3, v4}, Landroidx/media3/ui/G;->setBufferedPosition(J)V

    .line 79
    .line 80
    .line 81
    :cond_4
    iget-object v3, p0, Landroidx/media3/ui/d;->r0:Ljava/lang/Runnable;

    .line 82
    .line 83
    invoke-virtual {p0, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 84
    .line 85
    .line 86
    const/4 v3, 0x1

    .line 87
    if-nez v0, :cond_5

    .line 88
    .line 89
    move v4, v3

    .line 90
    goto :goto_1

    .line 91
    :cond_5
    invoke-interface {v0}, Lq2/P;->p()I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    :goto_1
    const-wide/16 v5, 0x3e8

    .line 96
    .line 97
    if-eqz v0, :cond_8

    .line 98
    .line 99
    invoke-interface {v0}, Lq2/P;->isPlaying()Z

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    if-eqz v7, :cond_8

    .line 104
    .line 105
    iget-object v3, p0, Landroidx/media3/ui/d;->m0:Landroidx/media3/ui/G;

    .line 106
    .line 107
    if-eqz v3, :cond_6

    .line 108
    .line 109
    invoke-interface {v3}, Landroidx/media3/ui/G;->getPreferredUpdateDelay()J

    .line 110
    .line 111
    .line 112
    move-result-wide v3

    .line 113
    goto :goto_2

    .line 114
    :cond_6
    move-wide v3, v5

    .line 115
    :goto_2
    rem-long/2addr v1, v5

    .line 116
    sub-long v1, v5, v1

    .line 117
    .line 118
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 119
    .line 120
    .line 121
    move-result-wide v1

    .line 122
    invoke-interface {v0}, Lq2/P;->c()Lq2/O;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iget v0, v0, Lq2/O;->a:F

    .line 127
    .line 128
    const/4 v3, 0x0

    .line 129
    cmpl-float v3, v0, v3

    .line 130
    .line 131
    if-lez v3, :cond_7

    .line 132
    .line 133
    long-to-float v1, v1

    .line 134
    div-float/2addr v1, v0

    .line 135
    float-to-long v5, v1

    .line 136
    :cond_7
    move-wide v7, v5

    .line 137
    iget v0, p0, Landroidx/media3/ui/d;->Y0:I

    .line 138
    .line 139
    int-to-long v9, v0

    .line 140
    const-wide/16 v11, 0x3e8

    .line 141
    .line 142
    invoke-static/range {v7 .. v12}, Lt2/a0;->s(JJJ)J

    .line 143
    .line 144
    .line 145
    move-result-wide v0

    .line 146
    iget-object v2, p0, Landroidx/media3/ui/d;->r0:Ljava/lang/Runnable;

    .line 147
    .line 148
    invoke-virtual {p0, v2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_8
    const/4 v0, 0x4

    .line 153
    if-eq v4, v0, :cond_9

    .line 154
    .line 155
    if-eq v4, v3, :cond_9

    .line 156
    .line 157
    iget-object v0, p0, Landroidx/media3/ui/d;->r0:Ljava/lang/Runnable;

    .line 158
    .line 159
    invoke-virtual {p0, v0, v5, v6}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 160
    .line 161
    .line 162
    :cond_9
    :goto_3
    return-void
.end method

.method static synthetic G(Landroidx/media3/ui/d;)Landroidx/media3/ui/d$e;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->m:Landroidx/media3/ui/d$e;

    .line 2
    .line 3
    return-object p0
.end method

.method private G0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/media3/ui/d;->n0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/media3/ui/d;->R0:Z

    .line 8
    .line 9
    if-eqz v0, :cond_7

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/ui/d;->z:Landroid/widget/ImageView;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    iget v1, p0, Landroidx/media3/ui/d;->Z0:I

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    invoke-direct {p0, v2, v0}, Landroidx/media3/ui/d;->x0(ZLandroid/view/View;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    iget-object v0, p0, Landroidx/media3/ui/d;->O0:Lq2/P;

    .line 26
    .line 27
    if-eqz v0, :cond_6

    .line 28
    .line 29
    const/16 v1, 0xf

    .line 30
    .line 31
    invoke-interface {v0, v1}, Lq2/P;->k(I)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    iget-object v1, p0, Landroidx/media3/ui/d;->z:Landroid/widget/ImageView;

    .line 39
    .line 40
    const/4 v2, 0x1

    .line 41
    invoke-direct {p0, v2, v1}, Landroidx/media3/ui/d;->x0(ZLandroid/view/View;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v0}, Lq2/P;->x()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_5

    .line 49
    .line 50
    if-eq v0, v2, :cond_4

    .line 51
    .line 52
    const/4 v1, 0x2

    .line 53
    if-eq v0, v1, :cond_3

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    iget-object v0, p0, Landroidx/media3/ui/d;->z:Landroid/widget/ImageView;

    .line 57
    .line 58
    iget-object v1, p0, Landroidx/media3/ui/d;->w0:Landroid/graphics/drawable/Drawable;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Landroidx/media3/ui/d;->z:Landroid/widget/ImageView;

    .line 64
    .line 65
    iget-object v1, p0, Landroidx/media3/ui/d;->z0:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_4
    iget-object v0, p0, Landroidx/media3/ui/d;->z:Landroid/widget/ImageView;

    .line 72
    .line 73
    iget-object v1, p0, Landroidx/media3/ui/d;->v0:Landroid/graphics/drawable/Drawable;

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Landroidx/media3/ui/d;->z:Landroid/widget/ImageView;

    .line 79
    .line 80
    iget-object v1, p0, Landroidx/media3/ui/d;->y0:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_5
    iget-object v0, p0, Landroidx/media3/ui/d;->z:Landroid/widget/ImageView;

    .line 87
    .line 88
    iget-object v1, p0, Landroidx/media3/ui/d;->u0:Landroid/graphics/drawable/Drawable;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 91
    .line 92
    .line 93
    iget-object v0, p0, Landroidx/media3/ui/d;->z:Landroid/widget/ImageView;

    .line 94
    .line 95
    iget-object v1, p0, Landroidx/media3/ui/d;->x0:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_6
    :goto_0
    iget-object v0, p0, Landroidx/media3/ui/d;->z:Landroid/widget/ImageView;

    .line 102
    .line 103
    invoke-direct {p0, v2, v0}, Landroidx/media3/ui/d;->x0(ZLandroid/view/View;)V

    .line 104
    .line 105
    .line 106
    iget-object v0, p0, Landroidx/media3/ui/d;->z:Landroid/widget/ImageView;

    .line 107
    .line 108
    iget-object v1, p0, Landroidx/media3/ui/d;->u0:Landroid/graphics/drawable/Drawable;

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 111
    .line 112
    .line 113
    iget-object v0, p0, Landroidx/media3/ui/d;->z:Landroid/widget/ImageView;

    .line 114
    .line 115
    iget-object v1, p0, Landroidx/media3/ui/d;->x0:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 118
    .line 119
    .line 120
    :cond_7
    :goto_1
    return-void
.end method

.method static synthetic H(Landroidx/media3/ui/d;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->H:Landroid/view/View;

    .line 2
    .line 3
    return-object p0
.end method

.method private H0()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->O0:Lq2/P;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lq2/P;->X0()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-wide/16 v0, 0x1388

    .line 11
    .line 12
    :goto_0
    const-wide/16 v2, 0x3e8

    .line 13
    .line 14
    div-long/2addr v0, v2

    .line 15
    long-to-int v0, v0

    .line 16
    iget-object v1, p0, Landroidx/media3/ui/d;->y:Landroid/widget/TextView;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    iget-object v1, p0, Landroidx/media3/ui/d;->w:Landroid/view/View;

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    iget-object v2, p0, Landroidx/media3/ui/d;->b:Landroid/content/res/Resources;

    .line 32
    .line 33
    sget v3, LG3/A;->b:I

    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v2, v3, v0, v4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v1, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    return-void
.end method

.method static synthetic I(Landroidx/media3/ui/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/ui/d;->F0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private I0()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->l:Landroidx/media3/ui/d$h;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/ui/d$h;->v()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Landroidx/media3/ui/d;->F:Landroid/view/View;

    .line 8
    .line 9
    invoke-direct {p0, v0, v1}, Landroidx/media3/ui/d;->x0(ZLandroid/view/View;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method static synthetic J(Landroidx/media3/ui/d;)Landroidx/media3/ui/d$b;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->o:Landroidx/media3/ui/d$b;

    .line 2
    .line 3
    return-object p0
.end method

.method private J0()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->k:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1, v1}, Landroid/view/View;->measure(II)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget v1, p0, Landroidx/media3/ui/d;->r:I

    .line 12
    .line 13
    mul-int/lit8 v1, v1, 0x2

    .line 14
    .line 15
    sub-int/2addr v0, v1

    .line 16
    iget-object v1, p0, Landroidx/media3/ui/d;->k:Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v1, p0, Landroidx/media3/ui/d;->q:Landroid/widget/PopupWindow;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget v1, p0, Landroidx/media3/ui/d;->r:I

    .line 36
    .line 37
    mul-int/lit8 v1, v1, 0x2

    .line 38
    .line 39
    sub-int/2addr v0, v1

    .line 40
    iget-object v1, p0, Landroidx/media3/ui/d;->k:Landroidx/recyclerview/widget/RecyclerView;

    .line 41
    .line 42
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v1, p0, Landroidx/media3/ui/d;->q:Landroid/widget/PopupWindow;

    .line 51
    .line 52
    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method static synthetic K(Landroidx/media3/ui/d;)Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->C:Landroid/widget/ImageView;

    .line 2
    .line 3
    return-object p0
.end method

.method private K0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/media3/ui/d;->n0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_6

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/media3/ui/d;->R0:Z

    .line 8
    .line 9
    if-eqz v0, :cond_6

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/ui/d;->A:Landroid/widget/ImageView;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_3

    .line 16
    :cond_0
    iget-object v1, p0, Landroidx/media3/ui/d;->O0:Lq2/P;

    .line 17
    .line 18
    iget-object v2, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Landroidx/media3/ui/w;->A(Landroid/view/View;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v2, 0x0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Landroidx/media3/ui/d;->A:Landroid/widget/ImageView;

    .line 28
    .line 29
    invoke-direct {p0, v2, v0}, Landroidx/media3/ui/d;->x0(ZLandroid/view/View;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    if-eqz v1, :cond_5

    .line 34
    .line 35
    const/16 v0, 0xe

    .line 36
    .line 37
    invoke-interface {v1, v0}, Lq2/P;->k(I)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    const/4 v0, 0x1

    .line 45
    iget-object v2, p0, Landroidx/media3/ui/d;->A:Landroid/widget/ImageView;

    .line 46
    .line 47
    invoke-direct {p0, v0, v2}, Landroidx/media3/ui/d;->x0(ZLandroid/view/View;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Landroidx/media3/ui/d;->A:Landroid/widget/ImageView;

    .line 51
    .line 52
    invoke-interface {v1}, Lq2/P;->Q0()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_3

    .line 57
    .line 58
    iget-object v2, p0, Landroidx/media3/ui/d;->A0:Landroid/graphics/drawable/Drawable;

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    iget-object v2, p0, Landroidx/media3/ui/d;->B0:Landroid/graphics/drawable/Drawable;

    .line 62
    .line 63
    :goto_0
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Landroidx/media3/ui/d;->A:Landroid/widget/ImageView;

    .line 67
    .line 68
    invoke-interface {v1}, Lq2/P;->Q0()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_4

    .line 73
    .line 74
    iget-object v1, p0, Landroidx/media3/ui/d;->E0:Ljava/lang/String;

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    iget-object v1, p0, Landroidx/media3/ui/d;->F0:Ljava/lang/String;

    .line 78
    .line 79
    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_5
    :goto_2
    iget-object v0, p0, Landroidx/media3/ui/d;->A:Landroid/widget/ImageView;

    .line 84
    .line 85
    invoke-direct {p0, v2, v0}, Landroidx/media3/ui/d;->x0(ZLandroid/view/View;)V

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, Landroidx/media3/ui/d;->A:Landroid/widget/ImageView;

    .line 89
    .line 90
    iget-object v1, p0, Landroidx/media3/ui/d;->B0:Landroid/graphics/drawable/Drawable;

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Landroidx/media3/ui/d;->A:Landroid/widget/ImageView;

    .line 96
    .line 97
    iget-object v1, p0, Landroidx/media3/ui/d;->F0:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 100
    .line 101
    .line 102
    :cond_6
    :goto_3
    return-void
.end method

.method static synthetic L(Landroidx/media3/ui/d;)Landroidx/media3/ui/d$j;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->n:Landroidx/media3/ui/d$j;

    .line 2
    .line 3
    return-object p0
.end method

.method private L0()V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/ui/d;->O0:Lq2/P;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-boolean v2, v0, Landroidx/media3/ui/d;->S0:Z

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x1

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    iget-object v2, v0, Landroidx/media3/ui/d;->q0:Lq2/Y$d;

    .line 15
    .line 16
    invoke-static {v1, v2}, Landroidx/media3/ui/d;->Z(Lq2/P;Lq2/Y$d;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    move v2, v4

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move v2, v3

    .line 25
    :goto_0
    iput-boolean v2, v0, Landroidx/media3/ui/d;->U0:Z

    .line 26
    .line 27
    const-wide/16 v5, 0x0

    .line 28
    .line 29
    iput-wide v5, v0, Landroidx/media3/ui/d;->e1:J

    .line 30
    .line 31
    const/16 v2, 0x11

    .line 32
    .line 33
    invoke-interface {v1, v2}, Lq2/P;->k(I)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    invoke-interface {v1}, Lq2/P;->h0()Lq2/Y;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    sget-object v2, Lq2/Y;->a:Lq2/Y;

    .line 45
    .line 46
    :goto_1
    invoke-virtual {v2}, Lq2/Y;->u()Z

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    if-nez v7, :cond_f

    .line 56
    .line 57
    invoke-interface {v1}, Lq2/P;->K0()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    iget-boolean v7, v0, Landroidx/media3/ui/d;->U0:Z

    .line 62
    .line 63
    if-eqz v7, :cond_3

    .line 64
    .line 65
    move v10, v3

    .line 66
    goto :goto_2

    .line 67
    :cond_3
    move v10, v1

    .line 68
    :goto_2
    if-eqz v7, :cond_4

    .line 69
    .line 70
    invoke-virtual {v2}, Lq2/Y;->t()I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    sub-int/2addr v7, v4

    .line 75
    goto :goto_3

    .line 76
    :cond_4
    move v7, v1

    .line 77
    :goto_3
    move v13, v3

    .line 78
    move-wide v11, v5

    .line 79
    :goto_4
    if-gt v10, v7, :cond_e

    .line 80
    .line 81
    if-ne v10, v1, :cond_5

    .line 82
    .line 83
    invoke-static {v11, v12}, Lt2/a0;->F1(J)J

    .line 84
    .line 85
    .line 86
    move-result-wide v14

    .line 87
    iput-wide v14, v0, Landroidx/media3/ui/d;->e1:J

    .line 88
    .line 89
    :cond_5
    iget-object v14, v0, Landroidx/media3/ui/d;->q0:Lq2/Y$d;

    .line 90
    .line 91
    invoke-virtual {v2, v10, v14}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 92
    .line 93
    .line 94
    iget-object v14, v0, Landroidx/media3/ui/d;->q0:Lq2/Y$d;

    .line 95
    .line 96
    move v15, v4

    .line 97
    move-wide/from16 v16, v5

    .line 98
    .line 99
    iget-wide v4, v14, Lq2/Y$d;->m:J

    .line 100
    .line 101
    cmp-long v4, v4, v8

    .line 102
    .line 103
    if-nez v4, :cond_6

    .line 104
    .line 105
    iget-boolean v1, v0, Landroidx/media3/ui/d;->U0:Z

    .line 106
    .line 107
    xor-int/2addr v1, v15

    .line 108
    invoke-static {v1}, Lt2/a;->g(Z)V

    .line 109
    .line 110
    .line 111
    goto/16 :goto_a

    .line 112
    .line 113
    :cond_6
    iget v4, v14, Lq2/Y$d;->n:I

    .line 114
    .line 115
    :goto_5
    iget-object v5, v0, Landroidx/media3/ui/d;->q0:Lq2/Y$d;

    .line 116
    .line 117
    iget v6, v5, Lq2/Y$d;->o:I

    .line 118
    .line 119
    if-gt v4, v6, :cond_d

    .line 120
    .line 121
    iget-object v5, v0, Landroidx/media3/ui/d;->p0:Lq2/Y$b;

    .line 122
    .line 123
    invoke-virtual {v2, v4, v5}, Lq2/Y;->j(ILq2/Y$b;)Lq2/Y$b;

    .line 124
    .line 125
    .line 126
    iget-object v5, v0, Landroidx/media3/ui/d;->p0:Lq2/Y$b;

    .line 127
    .line 128
    invoke-virtual {v5}, Lq2/Y$b;->p()I

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    iget-object v6, v0, Landroidx/media3/ui/d;->p0:Lq2/Y$b;

    .line 133
    .line 134
    invoke-virtual {v6}, Lq2/Y$b;->d()I

    .line 135
    .line 136
    .line 137
    move-result v6

    .line 138
    :goto_6
    if-ge v5, v6, :cond_c

    .line 139
    .line 140
    iget-object v14, v0, Landroidx/media3/ui/d;->p0:Lq2/Y$b;

    .line 141
    .line 142
    invoke-virtual {v14, v5}, Lq2/Y$b;->g(I)J

    .line 143
    .line 144
    .line 145
    move-result-wide v18

    .line 146
    const-wide/high16 v20, -0x8000000000000000L

    .line 147
    .line 148
    cmp-long v14, v18, v20

    .line 149
    .line 150
    if-nez v14, :cond_8

    .line 151
    .line 152
    iget-object v14, v0, Landroidx/media3/ui/d;->p0:Lq2/Y$b;

    .line 153
    .line 154
    move-wide/from16 v20, v8

    .line 155
    .line 156
    iget-wide v8, v14, Lq2/Y$b;->d:J

    .line 157
    .line 158
    cmp-long v14, v8, v20

    .line 159
    .line 160
    if-nez v14, :cond_7

    .line 161
    .line 162
    goto :goto_9

    .line 163
    :cond_7
    move-wide/from16 v18, v8

    .line 164
    .line 165
    goto :goto_7

    .line 166
    :cond_8
    move-wide/from16 v20, v8

    .line 167
    .line 168
    :goto_7
    iget-object v8, v0, Landroidx/media3/ui/d;->p0:Lq2/Y$b;

    .line 169
    .line 170
    invoke-virtual {v8}, Lq2/Y$b;->o()J

    .line 171
    .line 172
    .line 173
    move-result-wide v8

    .line 174
    add-long v18, v18, v8

    .line 175
    .line 176
    cmp-long v8, v18, v16

    .line 177
    .line 178
    if-ltz v8, :cond_b

    .line 179
    .line 180
    iget-object v8, v0, Landroidx/media3/ui/d;->a1:[J

    .line 181
    .line 182
    array-length v9, v8

    .line 183
    if-ne v13, v9, :cond_a

    .line 184
    .line 185
    array-length v9, v8

    .line 186
    if-nez v9, :cond_9

    .line 187
    .line 188
    move v9, v15

    .line 189
    goto :goto_8

    .line 190
    :cond_9
    array-length v9, v8

    .line 191
    mul-int/lit8 v9, v9, 0x2

    .line 192
    .line 193
    :goto_8
    invoke-static {v8, v9}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    iput-object v8, v0, Landroidx/media3/ui/d;->a1:[J

    .line 198
    .line 199
    iget-object v8, v0, Landroidx/media3/ui/d;->b1:[Z

    .line 200
    .line 201
    invoke-static {v8, v9}, Ljava/util/Arrays;->copyOf([ZI)[Z

    .line 202
    .line 203
    .line 204
    move-result-object v8

    .line 205
    iput-object v8, v0, Landroidx/media3/ui/d;->b1:[Z

    .line 206
    .line 207
    :cond_a
    iget-object v8, v0, Landroidx/media3/ui/d;->a1:[J

    .line 208
    .line 209
    add-long v18, v11, v18

    .line 210
    .line 211
    invoke-static/range {v18 .. v19}, Lt2/a0;->F1(J)J

    .line 212
    .line 213
    .line 214
    move-result-wide v18

    .line 215
    aput-wide v18, v8, v13

    .line 216
    .line 217
    iget-object v8, v0, Landroidx/media3/ui/d;->b1:[Z

    .line 218
    .line 219
    iget-object v9, v0, Landroidx/media3/ui/d;->p0:Lq2/Y$b;

    .line 220
    .line 221
    invoke-virtual {v9, v5}, Lq2/Y$b;->q(I)Z

    .line 222
    .line 223
    .line 224
    move-result v9

    .line 225
    aput-boolean v9, v8, v13

    .line 226
    .line 227
    add-int/lit8 v13, v13, 0x1

    .line 228
    .line 229
    :cond_b
    :goto_9
    add-int/lit8 v5, v5, 0x1

    .line 230
    .line 231
    move-wide/from16 v8, v20

    .line 232
    .line 233
    goto :goto_6

    .line 234
    :cond_c
    move-wide/from16 v20, v8

    .line 235
    .line 236
    add-int/lit8 v4, v4, 0x1

    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_d
    move-wide/from16 v20, v8

    .line 240
    .line 241
    iget-wide v4, v5, Lq2/Y$d;->m:J

    .line 242
    .line 243
    add-long/2addr v11, v4

    .line 244
    add-int/lit8 v10, v10, 0x1

    .line 245
    .line 246
    move v4, v15

    .line 247
    move-wide/from16 v5, v16

    .line 248
    .line 249
    goto/16 :goto_4

    .line 250
    .line 251
    :cond_e
    :goto_a
    move-wide v5, v11

    .line 252
    goto :goto_b

    .line 253
    :cond_f
    move-wide/from16 v16, v5

    .line 254
    .line 255
    move-wide/from16 v20, v8

    .line 256
    .line 257
    const/16 v2, 0x10

    .line 258
    .line 259
    invoke-interface {v1, v2}, Lq2/P;->k(I)Z

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    if-eqz v2, :cond_10

    .line 264
    .line 265
    invoke-interface {v1}, Lq2/P;->t0()J

    .line 266
    .line 267
    .line 268
    move-result-wide v1

    .line 269
    cmp-long v4, v1, v20

    .line 270
    .line 271
    if-eqz v4, :cond_10

    .line 272
    .line 273
    invoke-static {v1, v2}, Lt2/a0;->V0(J)J

    .line 274
    .line 275
    .line 276
    move-result-wide v5

    .line 277
    move v13, v3

    .line 278
    goto :goto_b

    .line 279
    :cond_10
    move v13, v3

    .line 280
    move-wide/from16 v5, v16

    .line 281
    .line 282
    :goto_b
    invoke-static {v5, v6}, Lt2/a0;->F1(J)J

    .line 283
    .line 284
    .line 285
    move-result-wide v1

    .line 286
    iget-object v4, v0, Landroidx/media3/ui/d;->I:Landroid/widget/TextView;

    .line 287
    .line 288
    if-eqz v4, :cond_11

    .line 289
    .line 290
    iget-object v5, v0, Landroidx/media3/ui/d;->n0:Ljava/lang/StringBuilder;

    .line 291
    .line 292
    iget-object v6, v0, Landroidx/media3/ui/d;->o0:Ljava/util/Formatter;

    .line 293
    .line 294
    invoke-static {v5, v6, v1, v2}, Lt2/a0;->s0(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 299
    .line 300
    .line 301
    :cond_11
    iget-object v4, v0, Landroidx/media3/ui/d;->m0:Landroidx/media3/ui/G;

    .line 302
    .line 303
    if-eqz v4, :cond_13

    .line 304
    .line 305
    invoke-interface {v4, v1, v2}, Landroidx/media3/ui/G;->setDuration(J)V

    .line 306
    .line 307
    .line 308
    iget-object v1, v0, Landroidx/media3/ui/d;->c1:[J

    .line 309
    .line 310
    array-length v1, v1

    .line 311
    add-int v2, v13, v1

    .line 312
    .line 313
    iget-object v4, v0, Landroidx/media3/ui/d;->a1:[J

    .line 314
    .line 315
    array-length v5, v4

    .line 316
    if-le v2, v5, :cond_12

    .line 317
    .line 318
    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 319
    .line 320
    .line 321
    move-result-object v4

    .line 322
    iput-object v4, v0, Landroidx/media3/ui/d;->a1:[J

    .line 323
    .line 324
    iget-object v4, v0, Landroidx/media3/ui/d;->b1:[Z

    .line 325
    .line 326
    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([ZI)[Z

    .line 327
    .line 328
    .line 329
    move-result-object v4

    .line 330
    iput-object v4, v0, Landroidx/media3/ui/d;->b1:[Z

    .line 331
    .line 332
    :cond_12
    iget-object v4, v0, Landroidx/media3/ui/d;->c1:[J

    .line 333
    .line 334
    iget-object v5, v0, Landroidx/media3/ui/d;->a1:[J

    .line 335
    .line 336
    invoke-static {v4, v3, v5, v13, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 337
    .line 338
    .line 339
    iget-object v4, v0, Landroidx/media3/ui/d;->d1:[Z

    .line 340
    .line 341
    iget-object v5, v0, Landroidx/media3/ui/d;->b1:[Z

    .line 342
    .line 343
    invoke-static {v4, v3, v5, v13, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 344
    .line 345
    .line 346
    iget-object v1, v0, Landroidx/media3/ui/d;->m0:Landroidx/media3/ui/G;

    .line 347
    .line 348
    iget-object v3, v0, Landroidx/media3/ui/d;->a1:[J

    .line 349
    .line 350
    iget-object v4, v0, Landroidx/media3/ui/d;->b1:[Z

    .line 351
    .line 352
    invoke-interface {v1, v3, v4, v2}, Landroidx/media3/ui/G;->b([J[ZI)V

    .line 353
    .line 354
    .line 355
    :cond_13
    invoke-direct {v0}, Landroidx/media3/ui/d;->F0()V

    .line 356
    .line 357
    .line 358
    return-void
.end method

.method static synthetic M(Landroidx/media3/ui/d;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/ui/d;->r0(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private M0()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/ui/d;->g0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/ui/d;->n:Landroidx/media3/ui/d$j;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/media3/ui/d$l;->e()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-lez v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    iget-object v1, p0, Landroidx/media3/ui/d;->C:Landroid/widget/ImageView;

    .line 16
    .line 17
    invoke-direct {p0, v0, v1}, Landroidx/media3/ui/d;->x0(ZLandroid/view/View;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Landroidx/media3/ui/d;->I0()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method static synthetic N(Landroidx/media3/ui/d;F)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/ui/d;->setPlaybackSpeed(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic O(Landroidx/media3/ui/d;)Landroid/widget/PopupWindow;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->q:Landroid/widget/PopupWindow;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic P(Landroidx/media3/ui/d;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->G0:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic Q(Landroidx/media3/ui/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/ui/d;->G0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic R(Landroidx/media3/ui/d;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->H0:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic S(Landroidx/media3/ui/d;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->I0:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic T(Landroidx/media3/ui/d;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->J0:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic U(Landroidx/media3/ui/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/ui/d;->K0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic V(Landroidx/media3/ui/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/ui/d;->C0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic W(Landroidx/media3/ui/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/ui/d;->L0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic X(Landroidx/media3/ui/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/ui/d;->E0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static Z(Lq2/P;Lq2/Y$d;)Z
    .locals 8

    .line 1
    const/16 v0, 0x11

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lq2/P;->k(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-interface {p0}, Lq2/P;->h0()Lq2/Y;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Lq2/Y;->t()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v2, 0x1

    .line 20
    if-le v0, v2, :cond_4

    .line 21
    .line 22
    const/16 v3, 0x64

    .line 23
    .line 24
    if-le v0, v3, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move v3, v1

    .line 28
    :goto_0
    if-ge v3, v0, :cond_3

    .line 29
    .line 30
    invoke-virtual {p0, v3, p1}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    iget-wide v4, v4, Lq2/Y$d;->m:J

    .line 35
    .line 36
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    cmp-long v4, v4, v6

    .line 42
    .line 43
    if-nez v4, :cond_2

    .line 44
    .line 45
    return v1

    .line 46
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    return v2

    .line 50
    :cond_4
    :goto_1
    return v1
.end method

.method public static synthetic a(Landroidx/media3/ui/d;Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p9}, Landroidx/media3/ui/d;->q0(Landroid/view/View;IIIIIIII)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Landroidx/media3/ui/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/ui/d;->F0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private b0(Landroidx/recyclerview/widget/RecyclerView$h;Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->k:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/media3/ui/d;->J0()V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Landroidx/media3/ui/d;->f1:Z

    .line 11
    .line 12
    iget-object p1, p0, Landroidx/media3/ui/d;->q:Landroid/widget/PopupWindow;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Landroidx/media3/ui/d;->f1:Z

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iget-object v0, p0, Landroidx/media3/ui/d;->q:Landroid/widget/PopupWindow;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getWidth()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    sub-int/2addr p1, v0

    .line 31
    iget v0, p0, Landroidx/media3/ui/d;->r:I

    .line 32
    .line 33
    sub-int/2addr p1, v0

    .line 34
    iget-object v0, p0, Landroidx/media3/ui/d;->q:Landroid/widget/PopupWindow;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getHeight()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    neg-int v0, v0

    .line 41
    iget v1, p0, Landroidx/media3/ui/d;->r:I

    .line 42
    .line 43
    sub-int/2addr v0, v1

    .line 44
    iget-object v1, p0, Landroidx/media3/ui/d;->q:Landroid/widget/PopupWindow;

    .line 45
    .line 46
    invoke-virtual {v1, p2, p1, v0}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public static synthetic c(Landroidx/media3/ui/d;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/ui/d;->p0(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private c0(Lq2/h0;I)LP9/u;
    .locals 8

    .line 1
    new-instance v0, LP9/u$a;

    .line 2
    .line 3
    invoke-direct {v0}, LP9/u$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lq2/h0;->b()LP9/u;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-ge v3, v4, :cond_4

    .line 17
    .line 18
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    check-cast v4, Lq2/h0$a;

    .line 23
    .line 24
    invoke-virtual {v4}, Lq2/h0$a;->e()I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-eq v5, p2, :cond_0

    .line 29
    .line 30
    goto :goto_3

    .line 31
    :cond_0
    move v5, v2

    .line 32
    :goto_1
    iget v6, v4, Lq2/h0$a;->a:I

    .line 33
    .line 34
    if-ge v5, v6, :cond_3

    .line 35
    .line 36
    invoke-virtual {v4, v5}, Lq2/h0$a;->j(I)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-nez v6, :cond_1

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_1
    invoke-virtual {v4, v5}, Lq2/h0$a;->d(I)Lq2/x;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    iget v7, v6, Lq2/x;->e:I

    .line 48
    .line 49
    and-int/lit8 v7, v7, 0x2

    .line 50
    .line 51
    if-eqz v7, :cond_2

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    iget-object v7, p0, Landroidx/media3/ui/d;->p:LG3/E;

    .line 55
    .line 56
    invoke-interface {v7, v6}, LG3/E;->a(Lq2/x;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    new-instance v7, Landroidx/media3/ui/d$k;

    .line 61
    .line 62
    invoke-direct {v7, p1, v3, v5, v6}, Landroidx/media3/ui/d$k;-><init>(Lq2/h0;IILjava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v7}, LP9/u$a;->h(Ljava/lang/Object;)LP9/u$a;

    .line 66
    .line 67
    .line 68
    :goto_2
    add-int/lit8 v5, v5, 0x1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_4
    invoke-virtual {v0}, LP9/u$a;->k()LP9/u;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1
.end method

.method static synthetic d(Landroidx/media3/ui/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/ui/d;->M0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static d0(Landroid/content/res/TypedArray;I)I
    .locals 1

    .line 1
    sget v0, LG3/D;->L:I

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method static synthetic e(Landroidx/media3/ui/d;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/ui/d;->V0:Z

    .line 2
    .line 3
    return p1
.end method

.method static synthetic f(Landroidx/media3/ui/d;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->l0:Landroid/widget/TextView;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic g(Landroidx/media3/ui/d;)Ljava/lang/StringBuilder;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->n0:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    return-object p0
.end method

.method private g0()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->n:Landroidx/media3/ui/d$j;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/ui/d$l;->w()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/ui/d;->o:Landroidx/media3/ui/d$b;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/media3/ui/d$l;->w()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/ui/d;->O0:Lq2/P;

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    const/16 v1, 0x1e

    .line 16
    .line 17
    invoke-interface {v0, v1}, Lq2/P;->k(I)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Landroidx/media3/ui/d;->O0:Lq2/P;

    .line 24
    .line 25
    const/16 v1, 0x1d

    .line 26
    .line 27
    invoke-interface {v0, v1}, Lq2/P;->k(I)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object v0, p0, Landroidx/media3/ui/d;->O0:Lq2/P;

    .line 35
    .line 36
    invoke-interface {v0}, Lq2/P;->Y()Lq2/h0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iget-object v1, p0, Landroidx/media3/ui/d;->o:Landroidx/media3/ui/d$b;

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    invoke-direct {p0, v0, v2}, Landroidx/media3/ui/d;->c0(Lq2/h0;I)LP9/u;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v1, v2}, Landroidx/media3/ui/d$b;->D(Ljava/util/List;)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 51
    .line 52
    iget-object v2, p0, Landroidx/media3/ui/d;->C:Landroid/widget/ImageView;

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Landroidx/media3/ui/w;->A(Landroid/view/View;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    iget-object v1, p0, Landroidx/media3/ui/d;->n:Landroidx/media3/ui/d$j;

    .line 61
    .line 62
    const/4 v2, 0x3

    .line 63
    invoke-direct {p0, v0, v2}, Landroidx/media3/ui/d;->c0(Lq2/h0;I)LP9/u;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v1, v0}, Landroidx/media3/ui/d$j;->C(Ljava/util/List;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_1
    iget-object v0, p0, Landroidx/media3/ui/d;->n:Landroidx/media3/ui/d$j;

    .line 72
    .line 73
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v0, v1}, Landroidx/media3/ui/d$j;->C(Ljava/util/List;)V

    .line 78
    .line 79
    .line 80
    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic h(Landroidx/media3/ui/d;)Ljava/util/Formatter;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->o0:Ljava/util/Formatter;

    .line 2
    .line 3
    return-object p0
.end method

.method private static h0(Landroid/view/View;Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const/16 v0, 0x8

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method static synthetic i(Landroidx/media3/ui/d;)Landroidx/media3/ui/w;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 2
    .line 3
    return-object p0
.end method

.method private i0(Lq2/P;)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/ui/d;->g:Ljava/lang/Class;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
.end method

.method static synthetic j(Landroidx/media3/ui/d;)Lq2/P;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->O0:Lq2/P;

    .line 2
    .line 3
    return-object p0
.end method

.method private j0(Lq2/P;)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/ui/d;->d:Ljava/lang/Class;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
.end method

.method static synthetic k(Landroidx/media3/ui/d;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/media3/ui/d;->X0:Z

    .line 2
    .line 3
    return p0
.end method

.method static synthetic l(Landroidx/media3/ui/d;Lq2/P;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/ui/d;->j0(Lq2/P;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static l0(I)Z
    .locals 1

    .line 1
    const/16 v0, 0x5a

    .line 2
    .line 3
    if-eq p0, v0, :cond_1

    .line 4
    .line 5
    const/16 v0, 0x59

    .line 6
    .line 7
    if-eq p0, v0, :cond_1

    .line 8
    .line 9
    const/16 v0, 0x55

    .line 10
    .line 11
    if-eq p0, v0, :cond_1

    .line 12
    .line 13
    const/16 v0, 0x4f

    .line 14
    .line 15
    if-eq p0, v0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x7e

    .line 18
    .line 19
    if-eq p0, v0, :cond_1

    .line 20
    .line 21
    const/16 v0, 0x7f

    .line 22
    .line 23
    if-eq p0, v0, :cond_1

    .line 24
    .line 25
    const/16 v0, 0x57

    .line 26
    .line 27
    if-eq p0, v0, :cond_1

    .line 28
    .line 29
    const/16 v0, 0x58

    .line 30
    .line 31
    if-ne p0, v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p0, 0x0

    .line 35
    return p0

    .line 36
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 37
    return p0
.end method

.method static synthetic m(Landroidx/media3/ui/d;)Ljava/lang/reflect/Method;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->e:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    return-object p0
.end method

.method private m0(Lq2/P;)Z
    .locals 2

    .line 1
    :try_start_0
    invoke-direct {p0, p1}, Landroidx/media3/ui/d;->j0(Lq2/P;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/ui/d;->f:Ljava/lang/reflect/Method;

    .line 9
    .line 10
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/lang/reflect/Method;

    .line 15
    .line 16
    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catch_0
    move-exception p1

    .line 34
    goto :goto_1

    .line 35
    :catch_1
    move-exception p1

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    :goto_0
    invoke-direct {p0, p1}, Landroidx/media3/ui/d;->i0(Lq2/P;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    iget-object v0, p0, Landroidx/media3/ui/d;->i:Ljava/lang/reflect/Method;

    .line 44
    .line 45
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Ljava/lang/reflect/Method;

    .line 50
    .line 51
    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 62
    .line 63
    .line 64
    move-result p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    :cond_1
    const/4 p1, 0x1

    .line 68
    return p1

    .line 69
    :cond_2
    const/4 p1, 0x0

    .line 70
    return p1

    .line 71
    :goto_1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 72
    .line 73
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    throw v0
.end method

.method static synthetic n(Landroidx/media3/ui/d;Lq2/P;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/ui/d;->i0(Lq2/P;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method static synthetic o(Landroidx/media3/ui/d;)Ljava/lang/reflect/Method;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->h:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic p(Landroidx/media3/ui/d;Lq2/P;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/ui/d;->m0(Lq2/P;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private p0(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-boolean p1, p0, Landroidx/media3/ui/d;->Q0:Z

    .line 2
    .line 3
    xor-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroidx/media3/ui/d;->B0(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method static synthetic q(Landroidx/media3/ui/d;Lq2/P;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/media3/ui/d;->u0(Lq2/P;J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private q0(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    sub-int/2addr p4, p2

    .line 2
    sub-int/2addr p5, p3

    .line 3
    sub-int/2addr p8, p6

    .line 4
    sub-int/2addr p9, p7

    .line 5
    if-ne p4, p8, :cond_0

    .line 6
    .line 7
    if-eq p5, p9, :cond_1

    .line 8
    .line 9
    :cond_0
    iget-object p2, p0, Landroidx/media3/ui/d;->q:Landroid/widget/PopupWindow;

    .line 10
    .line 11
    invoke-virtual {p2}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-eqz p2, :cond_1

    .line 16
    .line 17
    invoke-direct {p0}, Landroidx/media3/ui/d;->J0()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    iget-object p3, p0, Landroidx/media3/ui/d;->q:Landroid/widget/PopupWindow;

    .line 25
    .line 26
    invoke-virtual {p3}, Landroid/widget/PopupWindow;->getWidth()I

    .line 27
    .line 28
    .line 29
    move-result p3

    .line 30
    sub-int/2addr p2, p3

    .line 31
    iget p3, p0, Landroidx/media3/ui/d;->r:I

    .line 32
    .line 33
    sub-int p6, p2, p3

    .line 34
    .line 35
    iget-object p2, p0, Landroidx/media3/ui/d;->q:Landroid/widget/PopupWindow;

    .line 36
    .line 37
    invoke-virtual {p2}, Landroid/widget/PopupWindow;->getHeight()I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    neg-int p2, p2

    .line 42
    iget p3, p0, Landroidx/media3/ui/d;->r:I

    .line 43
    .line 44
    sub-int p7, p2, p3

    .line 45
    .line 46
    iget-object p4, p0, Landroidx/media3/ui/d;->q:Landroid/widget/PopupWindow;

    .line 47
    .line 48
    const/4 p8, -0x1

    .line 49
    const/4 p9, -0x1

    .line 50
    move-object p5, p1

    .line 51
    invoke-virtual/range {p4 .. p9}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    .line 52
    .line 53
    .line 54
    :cond_1
    return-void
.end method

.method static synthetic r(Landroidx/media3/ui/d;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/media3/ui/d;->f1:Z

    .line 2
    .line 3
    return p0
.end method

.method private r0(I)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Landroidx/media3/ui/d;->m:Landroidx/media3/ui/d$e;

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/ui/d;->F:Landroid/view/View;

    .line 6
    .line 7
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/view/View;

    .line 12
    .line 13
    invoke-direct {p0, p1, v0}, Landroidx/media3/ui/d;->b0(Landroidx/recyclerview/widget/RecyclerView$h;Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const/4 v0, 0x1

    .line 18
    if-ne p1, v0, :cond_1

    .line 19
    .line 20
    iget-object p1, p0, Landroidx/media3/ui/d;->o:Landroidx/media3/ui/d$b;

    .line 21
    .line 22
    iget-object v0, p0, Landroidx/media3/ui/d;->F:Landroid/view/View;

    .line 23
    .line 24
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Landroid/view/View;

    .line 29
    .line 30
    invoke-direct {p0, p1, v0}, Landroidx/media3/ui/d;->b0(Landroidx/recyclerview/widget/RecyclerView$h;Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    iget-object p1, p0, Landroidx/media3/ui/d;->q:Landroid/widget/PopupWindow;

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method static synthetic s(Landroidx/media3/ui/d;)Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->t:Landroid/widget/ImageView;

    .line 2
    .line 3
    return-object p0
.end method

.method private setPlaybackSpeed(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->O0:Lq2/P;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/16 v1, 0xd

    .line 6
    .line 7
    invoke-interface {v0, v1}, Lq2/P;->k(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Landroidx/media3/ui/d;->O0:Lq2/P;

    .line 15
    .line 16
    invoke-interface {v0}, Lq2/P;->c()Lq2/O;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1, p1}, Lq2/O;->d(F)Lq2/O;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {v0, p1}, Lq2/P;->e(Lq2/O;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic t(Landroidx/media3/ui/d;)Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->s:Landroid/widget/ImageView;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic u(Landroidx/media3/ui/d;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->v:Landroid/view/View;

    .line 2
    .line 3
    return-object p0
.end method

.method private u0(Lq2/P;J)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Landroidx/media3/ui/d;->U0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    const/16 v0, 0x11

    .line 6
    .line 7
    invoke-interface {p1, v0}, Lq2/P;->k(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    const/16 v0, 0xa

    .line 14
    .line 15
    invoke-interface {p1, v0}, Lq2/P;->k(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    invoke-interface {p1}, Lq2/P;->h0()Lq2/Y;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Lq2/Y;->t()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/4 v2, 0x0

    .line 30
    :goto_0
    iget-object v3, p0, Landroidx/media3/ui/d;->q0:Lq2/Y$d;

    .line 31
    .line 32
    invoke-virtual {v0, v2, v3}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v3}, Lq2/Y$d;->e()J

    .line 37
    .line 38
    .line 39
    move-result-wide v3

    .line 40
    cmp-long v5, p2, v3

    .line 41
    .line 42
    if-gez v5, :cond_0

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    add-int/lit8 v5, v1, -0x1

    .line 46
    .line 47
    if-ne v2, v5, :cond_1

    .line 48
    .line 49
    move-wide p2, v3

    .line 50
    :goto_1
    invoke-interface {p1, v2, p2, p3}, Lq2/P;->o0(IJ)V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_1
    sub-long/2addr p2, v3

    .line 55
    add-int/lit8 v2, v2, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    const/4 v0, 0x5

    .line 59
    invoke-interface {p1, v0}, Lq2/P;->k(I)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    invoke-interface {p1, p2, p3}, Lq2/P;->z(J)V

    .line 66
    .line 67
    .line 68
    :cond_3
    :goto_2
    invoke-direct {p0}, Landroidx/media3/ui/d;->F0()V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method static synthetic v(Landroidx/media3/ui/d;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->w:Landroid/view/View;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic w(Landroidx/media3/ui/d;)Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->u:Landroid/widget/ImageView;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic x(Landroidx/media3/ui/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/ui/d;->D0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private x0(ZLandroid/view/View;)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p2, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 5
    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    iget p1, p0, Landroidx/media3/ui/d;->C0:F

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    iget p1, p0, Landroidx/media3/ui/d;->D0:F

    .line 13
    .line 14
    :goto_0
    invoke-virtual {p2, p1}, Landroid/view/View;->setAlpha(F)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method static synthetic y(Landroidx/media3/ui/d;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/media3/ui/d;->T0:Z

    .line 2
    .line 3
    return p0
.end method

.method private y0()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->O0:Lq2/P;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lq2/P;->F0()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-wide/16 v0, 0x3a98

    .line 11
    .line 12
    :goto_0
    const-wide/16 v2, 0x3e8

    .line 13
    .line 14
    div-long/2addr v0, v2

    .line 15
    long-to-int v0, v0

    .line 16
    iget-object v1, p0, Landroidx/media3/ui/d;->x:Landroid/widget/TextView;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    iget-object v1, p0, Landroidx/media3/ui/d;->v:Landroid/view/View;

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    iget-object v2, p0, Landroidx/media3/ui/d;->b:Landroid/content/res/Resources;

    .line 32
    .line 33
    sget v3, LG3/A;->a:I

    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v2, v3, v0, v4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v1, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    return-void
.end method

.method static synthetic z(Landroidx/media3/ui/d;)Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->z:Landroid/widget/ImageView;

    .line 2
    .line 3
    return-object p0
.end method

.method private z0(Landroid/widget/ImageView;Z)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    if-eqz p2, :cond_1

    .line 5
    .line 6
    iget-object p2, p0, Landroidx/media3/ui/d;->K0:Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Landroidx/media3/ui/d;->M0:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    iget-object p2, p0, Landroidx/media3/ui/d;->L0:Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 20
    .line 21
    .line 22
    iget-object p2, p0, Landroidx/media3/ui/d;->N0:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public B0(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/ui/d;->Q0:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput-boolean p1, p0, Landroidx/media3/ui/d;->Q0:Z

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/ui/d;->D:Landroid/widget/ImageView;

    .line 9
    .line 10
    invoke-direct {p0, v0, p1}, Landroidx/media3/ui/d;->z0(Landroid/widget/ImageView;Z)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Landroidx/media3/ui/d;->E:Landroid/widget/ImageView;

    .line 14
    .line 15
    invoke-direct {p0, v0, p1}, Landroidx/media3/ui/d;->z0(Landroid/widget/ImageView;Z)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Landroidx/media3/ui/d;->P0:Landroidx/media3/ui/d$d;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-interface {v0, p1}, Landroidx/media3/ui/d$d;->K(Z)V

    .line 23
    .line 24
    .line 25
    :cond_1
    :goto_0
    return-void
.end method

.method public Y(Landroidx/media3/ui/d$m;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/ui/d;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public a0(Landroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Landroidx/media3/ui/d;->O0:Lq2/P;

    .line 6
    .line 7
    if-eqz v1, :cond_9

    .line 8
    .line 9
    invoke-static {v0}, Landroidx/media3/ui/d;->l0(I)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    goto/16 :goto_1

    .line 16
    .line 17
    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_8

    .line 22
    .line 23
    const/16 v2, 0x5a

    .line 24
    .line 25
    if-ne v0, v2, :cond_1

    .line 26
    .line 27
    invoke-interface {v1}, Lq2/P;->p()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    const/4 v0, 0x4

    .line 32
    if-eq p1, v0, :cond_8

    .line 33
    .line 34
    const/16 p1, 0xc

    .line 35
    .line 36
    invoke-interface {v1, p1}, Lq2/P;->k(I)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_8

    .line 41
    .line 42
    invoke-interface {v1}, Lq2/P;->T0()V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/16 v2, 0x59

    .line 47
    .line 48
    if-ne v0, v2, :cond_2

    .line 49
    .line 50
    const/16 v2, 0xb

    .line 51
    .line 52
    invoke-interface {v1, v2}, Lq2/P;->k(I)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    invoke-interface {v1}, Lq2/P;->U0()V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-nez p1, :cond_8

    .line 67
    .line 68
    const/16 p1, 0x4f

    .line 69
    .line 70
    if-eq v0, p1, :cond_7

    .line 71
    .line 72
    const/16 p1, 0x55

    .line 73
    .line 74
    if-eq v0, p1, :cond_7

    .line 75
    .line 76
    const/16 p1, 0x57

    .line 77
    .line 78
    if-eq v0, p1, :cond_6

    .line 79
    .line 80
    const/16 p1, 0x58

    .line 81
    .line 82
    if-eq v0, p1, :cond_5

    .line 83
    .line 84
    const/16 p1, 0x7e

    .line 85
    .line 86
    if-eq v0, p1, :cond_4

    .line 87
    .line 88
    const/16 p1, 0x7f

    .line 89
    .line 90
    if-eq v0, p1, :cond_3

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    invoke-static {v1}, Lt2/a0;->A0(Lq2/P;)Z

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_4
    invoke-static {v1}, Lt2/a0;->B0(Lq2/P;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_5
    const/4 p1, 0x7

    .line 102
    invoke-interface {v1, p1}, Lq2/P;->k(I)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-eqz p1, :cond_8

    .line 107
    .line 108
    invoke-interface {v1}, Lq2/P;->U()V

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_6
    const/16 p1, 0x9

    .line 113
    .line 114
    invoke-interface {v1, p1}, Lq2/P;->k(I)Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-eqz p1, :cond_8

    .line 119
    .line 120
    invoke-interface {v1}, Lq2/P;->k0()V

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_7
    iget-boolean p1, p0, Landroidx/media3/ui/d;->T0:Z

    .line 125
    .line 126
    invoke-static {v1, p1}, Lt2/a0;->C0(Lq2/P;Z)Z

    .line 127
    .line 128
    .line 129
    :cond_8
    :goto_0
    const/4 p1, 0x1

    .line 130
    return p1

    .line 131
    :cond_9
    :goto_1
    const/4 p1, 0x0

    .line 132
    return p1
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/ui/d;->a0(Landroid/view/KeyEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1

    .line 16
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 17
    return p1
.end method

.method public e0()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/ui/w;->C()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public f0()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/ui/w;->F()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getPlayer()Lq2/P;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->O0:Lq2/P;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRepeatToggleModes()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/ui/d;->Z0:I

    .line 2
    .line 3
    return v0
.end method

.method public getShowShuffleButton()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/d;->A:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/media3/ui/w;->A(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getShowSubtitleButton()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/d;->C:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/media3/ui/w;->A(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getShowTimeoutMs()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/ui/d;->W0:I

    .line 2
    .line 3
    return v0
.end method

.method public getShowVrButton()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/d;->B:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/media3/ui/w;->A(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public k0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/ui/w;->I()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public n0()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method o0()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroidx/media3/ui/d$m;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-interface {v1, v2}, Landroidx/media3/ui/d$m;->G(I)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/media3/ui/w;->K()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Landroidx/media3/ui/d;->R0:Z

    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/media3/ui/d;->k0()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroidx/media3/ui/w;->S()V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, Landroidx/media3/ui/d;->w0()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/media3/ui/w;->L()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Landroidx/media3/ui/d;->R0:Z

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/media3/ui/d;->r0:Ljava/lang/Runnable;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/media3/ui/w;->R()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 6

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move v1, p1

    .line 5
    move-object p1, p0

    .line 6
    iget-object v0, p1, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 7
    .line 8
    move v2, p2

    .line 9
    move v3, p3

    .line 10
    move v4, p4

    .line 11
    move v5, p5

    .line 12
    invoke-virtual/range {v0 .. v5}, Landroidx/media3/ui/w;->M(ZIIII)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public s0(Landroidx/media3/ui/d$m;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setAnimationEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/media3/ui/w;->T(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setOnFullScreenModeChangedListener(Landroidx/media3/ui/d$d;)V
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/media3/ui/d;->P0:Landroidx/media3/ui/d$d;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/ui/d;->D:Landroid/widget/ImageView;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    move v3, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v3, v1

    .line 12
    :goto_0
    invoke-static {v0, v3}, Landroidx/media3/ui/d;->A0(Landroid/view/View;Z)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/ui/d;->E:Landroid/widget/ImageView;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    move v1, v2

    .line 20
    :cond_1
    invoke-static {v0, v1}, Landroidx/media3/ui/d;->A0(Landroid/view/View;Z)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setPlayer(Lq2/P;)V
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    move v0, v3

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v2

    .line 16
    :goto_0
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 17
    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    invoke-interface {p1}, Lq2/P;->m()Landroid/os/Looper;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-ne v0, v1, :cond_2

    .line 30
    .line 31
    :cond_1
    move v2, v3

    .line 32
    :cond_2
    invoke-static {v2}, Lt2/a;->a(Z)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Landroidx/media3/ui/d;->O0:Lq2/P;

    .line 36
    .line 37
    if-ne v0, p1, :cond_3

    .line 38
    .line 39
    return-void

    .line 40
    :cond_3
    if-eqz v0, :cond_4

    .line 41
    .line 42
    iget-object v1, p0, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 43
    .line 44
    invoke-interface {v0, v1}, Lq2/P;->H(Lq2/P$d;)V

    .line 45
    .line 46
    .line 47
    :cond_4
    iput-object p1, p0, Landroidx/media3/ui/d;->O0:Lq2/P;

    .line 48
    .line 49
    if-eqz p1, :cond_5

    .line 50
    .line 51
    iget-object v0, p0, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 52
    .line 53
    invoke-interface {p1, v0}, Lq2/P;->a0(Lq2/P$d;)V

    .line 54
    .line 55
    .line 56
    :cond_5
    invoke-virtual {p0}, Landroidx/media3/ui/d;->w0()V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public setProgressUpdateListener(Landroidx/media3/ui/d$f;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setRepeatToggleModes(I)V
    .locals 4

    .line 1
    iput p1, p0, Landroidx/media3/ui/d;->Z0:I

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/ui/d;->O0:Lq2/P;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    const/16 v3, 0xf

    .line 10
    .line 11
    invoke-interface {v0, v3}, Lq2/P;->k(I)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/media3/ui/d;->O0:Lq2/P;

    .line 18
    .line 19
    invoke-interface {v0}, Lq2/P;->x()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Landroidx/media3/ui/d;->O0:Lq2/P;

    .line 28
    .line 29
    invoke-interface {v0, v1}, Lq2/P;->v(I)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v3, 0x2

    .line 34
    if-ne p1, v2, :cond_1

    .line 35
    .line 36
    if-ne v0, v3, :cond_1

    .line 37
    .line 38
    iget-object v0, p0, Landroidx/media3/ui/d;->O0:Lq2/P;

    .line 39
    .line 40
    invoke-interface {v0, v2}, Lq2/P;->v(I)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    if-ne p1, v3, :cond_2

    .line 45
    .line 46
    if-ne v0, v2, :cond_2

    .line 47
    .line 48
    iget-object v0, p0, Landroidx/media3/ui/d;->O0:Lq2/P;

    .line 49
    .line 50
    invoke-interface {v0, v3}, Lq2/P;->v(I)V

    .line 51
    .line 52
    .line 53
    :cond_2
    :goto_0
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 54
    .line 55
    iget-object v3, p0, Landroidx/media3/ui/d;->z:Landroid/widget/ImageView;

    .line 56
    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    move v1, v2

    .line 60
    :cond_3
    invoke-virtual {v0, v3, v1}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 61
    .line 62
    .line 63
    invoke-direct {p0}, Landroidx/media3/ui/d;->G0()V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public setShowFastForwardButton(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/d;->v:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Landroidx/media3/ui/d;->C0()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setShowMultiWindowTimeBar(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iput-boolean p1, p0, Landroidx/media3/ui/d;->S0:Z

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/media3/ui/d;->L0()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setShowNextButton(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/d;->t:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Landroidx/media3/ui/d;->C0()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setShowPlayButtonIfPlaybackIsSuppressed(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/ui/d;->T0:Z

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/media3/ui/d;->D0()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setShowPreviousButton(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/d;->s:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Landroidx/media3/ui/d;->C0()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setShowRewindButton(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/d;->w:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Landroidx/media3/ui/d;->C0()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setShowShuffleButton(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/d;->A:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Landroidx/media3/ui/d;->K0()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setShowSubtitleButton(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/d;->C:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setShowTimeoutMs(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/ui/d;->W0:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/media3/ui/d;->k0()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/media3/ui/w;->S()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setShowVrButton(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/d;->B:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setTimeBarMinUpdateInterval(I)V
    .locals 2

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    const/16 v1, 0x3e8

    .line 4
    .line 5
    invoke-static {p1, v0, v1}, Lt2/a0;->r(III)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iput p1, p0, Landroidx/media3/ui/d;->Y0:I

    .line 10
    .line 11
    return-void
.end method

.method public setTimeBarScrubbingEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/ui/d;->X0:Z

    .line 2
    .line 3
    return-void
.end method

.method public setVrButtonListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->B:Landroid/widget/ImageView;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    iget-object v0, p0, Landroidx/media3/ui/d;->B:Landroid/widget/ImageView;

    .line 14
    .line 15
    invoke-direct {p0, p1, v0}, Landroidx/media3/ui/d;->x0(ZLandroid/view/View;)V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method t0()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->u:Landroid/widget/ImageView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public v0()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/ui/w;->X()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method w0()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/ui/d;->D0()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/media3/ui/d;->C0()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Landroidx/media3/ui/d;->G0()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Landroidx/media3/ui/d;->K0()V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Landroidx/media3/ui/d;->M0()V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Landroidx/media3/ui/d;->E0()V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Landroidx/media3/ui/d;->L0()V

    .line 20
    .line 21
    .line 22
    return-void
.end method
