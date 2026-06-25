.class public final Lyd/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lyd/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyd/d$a;
    }
.end annotation


# static fields
.field public static final l:Lyd/d$a;

.field private static final m:Ljava/lang/String;


# instance fields
.field private final a:LAc/a;

.field private final b:Ljava/util/UUID;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/util/Date;

.field private final e:Ljava/lang/String;

.field private final f:Lorg/json/JSONArray;

.field private final g:Landroid/net/Uri;

.field private final h:Ljava/util/Map;

.field private final i:Lkotlin/Lazy;

.field private final j:Lkotlin/Lazy;

.field private final k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyd/d$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lyd/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lyd/d;->l:Lyd/d$a;

    .line 8
    .line 9
    const-class v0, Lyd/d;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lyd/d;->m:Ljava/lang/String;

    .line 16
    .line 17
    return-void
.end method

.method private constructor <init>(LAc/a;Ljava/util/UUID;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lorg/json/JSONArray;Landroid/net/Uri;Ljava/util/Map;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lyd/d;->a:LAc/a;

    .line 4
    iput-object p2, p0, Lyd/d;->b:Ljava/util/UUID;

    .line 5
    iput-object p3, p0, Lyd/d;->c:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lyd/d;->d:Ljava/util/Date;

    .line 7
    iput-object p5, p0, Lyd/d;->e:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lyd/d;->f:Lorg/json/JSONArray;

    .line 9
    iput-object p7, p0, Lyd/d;->g:Landroid/net/Uri;

    .line 10
    iput-object p8, p0, Lyd/d;->h:Ljava/util/Map;

    .line 11
    new-instance p1, Lyd/b;

    invoke-direct {p1, p0}, Lyd/b;-><init>(Lyd/d;)V

    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lyd/d;->i:Lkotlin/Lazy;

    .line 12
    new-instance p1, Lyd/c;

    invoke-direct {p1, p0}, Lyd/c;-><init>(Lyd/d;)V

    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lyd/d;->j:Lkotlin/Lazy;

    return-void
.end method

.method public synthetic constructor <init>(LAc/a;Ljava/util/UUID;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lorg/json/JSONArray;Landroid/net/Uri;Ljava/util/Map;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p8}, Lyd/d;-><init>(LAc/a;Ljava/util/UUID;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lorg/json/JSONArray;Landroid/net/Uri;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic e(Lyd/d;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Lyd/d;->g(Lyd/d;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic f(Lyd/d;)Lrd/d;
    .locals 0

    .line 1
    invoke-static {p0}, Lyd/d;->i(Lyd/d;)Lrd/d;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final g(Lyd/d;)Ljava/util/List;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    new-instance v2, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Lyd/d;->b:Ljava/util/UUID;

    .line 9
    .line 10
    new-instance v3, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v4, "bundle-"

    .line 16
    .line 17
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v3, Lrd/a;

    .line 28
    .line 29
    const-string v4, "js"

    .line 30
    .line 31
    invoke-direct {v3, v0, v4}, Lrd/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 v4, 0x1

    .line 35
    invoke-virtual {v3, v4}, Lrd/a;->C(Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "index.android.bundle"

    .line 39
    .line 40
    invoke-virtual {v3, v0}, Lrd/a;->v(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    iget-object v0, v1, Lyd/d;->f:Lorg/json/JSONArray;

    .line 47
    .line 48
    if-eqz v0, :cond_27

    .line 49
    .line 50
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-lez v0, :cond_27

    .line 55
    .line 56
    iget-object v0, v1, Lyd/d;->f:Lorg/json/JSONArray;

    .line 57
    .line 58
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    const/4 v6, 0x0

    .line 63
    :goto_0
    if-ge v6, v3, :cond_27

    .line 64
    .line 65
    :try_start_0
    iget-object v0, v1, Lyd/d;->f:Lorg/json/JSONArray;

    .line 66
    .line 67
    invoke-virtual {v0, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const-string v7, "type"

    .line 72
    .line 73
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    new-instance v8, Lrd/a;

    .line 78
    .line 79
    const-string v9, "packagerHash"

    .line 80
    .line 81
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    invoke-direct {v8, v9, v7}, Lrd/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    const-string v7, "resourcesFilename"

    .line 92
    .line 93
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 94
    .line 95
    .line 96
    move-result v9
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    const-class v10, Lorg/json/JSONObject;

    .line 98
    .line 99
    sget-object v11, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 100
    .line 101
    sget-object v12, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 102
    .line 103
    sget-object v13, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 104
    .line 105
    sget-object v14, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 106
    .line 107
    const-class v16, Lorg/json/JSONArray;

    .line 108
    .line 109
    const-class v17, Ljava/lang/String;

    .line 110
    .line 111
    const-string v5, "null cannot be cast to non-null type kotlin.String"

    .line 112
    .line 113
    if-nez v9, :cond_0

    .line 114
    .line 115
    const/4 v7, 0x0

    .line 116
    goto/16 :goto_1

    .line 117
    .line 118
    :cond_0
    :try_start_1
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 119
    .line 120
    .line 121
    move-result-object v9

    .line 122
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 123
    .line 124
    .line 125
    move-result-object v15

    .line 126
    invoke-static {v9, v15}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v15

    .line 130
    if-eqz v15, :cond_2

    .line 131
    .line 132
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    if-eqz v7, :cond_1

    .line 137
    .line 138
    goto/16 :goto_1

    .line 139
    .line 140
    :cond_1
    new-instance v0, Ljava/lang/NullPointerException;

    .line 141
    .line 142
    invoke-direct {v0, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw v0

    .line 146
    :catch_0
    move-exception v0

    .line 147
    goto/16 :goto_7

    .line 148
    .line 149
    :cond_2
    invoke-static {v14}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 150
    .line 151
    .line 152
    move-result-object v15

    .line 153
    invoke-static {v9, v15}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v15

    .line 157
    if-eqz v15, :cond_3

    .line 158
    .line 159
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    .line 160
    .line 161
    .line 162
    move-result-wide v18

    .line 163
    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    check-cast v7, Ljava/lang/String;

    .line 168
    .line 169
    goto/16 :goto_1

    .line 170
    .line 171
    :cond_3
    invoke-static {v13}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 172
    .line 173
    .line 174
    move-result-object v15

    .line 175
    invoke-static {v9, v15}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v15

    .line 179
    if-eqz v15, :cond_4

    .line 180
    .line 181
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    check-cast v7, Ljava/lang/String;

    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_4
    invoke-static {v12}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 193
    .line 194
    .line 195
    move-result-object v15

    .line 196
    invoke-static {v9, v15}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v15

    .line 200
    if-eqz v15, :cond_5

    .line 201
    .line 202
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 203
    .line 204
    .line 205
    move-result-wide v18

    .line 206
    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 207
    .line 208
    .line 209
    move-result-object v7

    .line 210
    check-cast v7, Ljava/lang/String;

    .line 211
    .line 212
    goto :goto_1

    .line 213
    :cond_5
    invoke-static {v11}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 214
    .line 215
    .line 216
    move-result-object v15

    .line 217
    invoke-static {v9, v15}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v15

    .line 221
    if-eqz v15, :cond_6

    .line 222
    .line 223
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 224
    .line 225
    .line 226
    move-result v7

    .line 227
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 228
    .line 229
    .line 230
    move-result-object v7

    .line 231
    check-cast v7, Ljava/lang/String;

    .line 232
    .line 233
    goto :goto_1

    .line 234
    :cond_6
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 235
    .line 236
    .line 237
    move-result-object v15

    .line 238
    invoke-static {v9, v15}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v15

    .line 242
    if-eqz v15, :cond_8

    .line 243
    .line 244
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 245
    .line 246
    .line 247
    move-result-object v7

    .line 248
    if-eqz v7, :cond_7

    .line 249
    .line 250
    check-cast v7, Ljava/lang/String;

    .line 251
    .line 252
    goto :goto_1

    .line 253
    :cond_7
    new-instance v0, Ljava/lang/NullPointerException;

    .line 254
    .line 255
    invoke-direct {v0, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    throw v0

    .line 259
    :cond_8
    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 260
    .line 261
    .line 262
    move-result-object v15

    .line 263
    invoke-static {v9, v15}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v9

    .line 267
    if-eqz v9, :cond_a

    .line 268
    .line 269
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    if-eqz v7, :cond_9

    .line 274
    .line 275
    check-cast v7, Ljava/lang/String;

    .line 276
    .line 277
    goto :goto_1

    .line 278
    :cond_9
    new-instance v0, Ljava/lang/NullPointerException;

    .line 279
    .line 280
    invoke-direct {v0, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    throw v0

    .line 284
    :cond_a
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v7

    .line 288
    if-eqz v7, :cond_26

    .line 289
    .line 290
    check-cast v7, Ljava/lang/String;

    .line 291
    .line 292
    :goto_1
    invoke-virtual {v8, v7}, Lrd/a;->G(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    const-string v7, "resourcesFolder"

    .line 296
    .line 297
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 298
    .line 299
    .line 300
    move-result v9

    .line 301
    if-nez v9, :cond_b

    .line 302
    .line 303
    const/4 v7, 0x0

    .line 304
    goto/16 :goto_2

    .line 305
    .line 306
    :cond_b
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 307
    .line 308
    .line 309
    move-result-object v9

    .line 310
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 311
    .line 312
    .line 313
    move-result-object v15

    .line 314
    invoke-static {v9, v15}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result v15

    .line 318
    if-eqz v15, :cond_d

    .line 319
    .line 320
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v7

    .line 324
    if-eqz v7, :cond_c

    .line 325
    .line 326
    goto/16 :goto_2

    .line 327
    .line 328
    :cond_c
    new-instance v0, Ljava/lang/NullPointerException;

    .line 329
    .line 330
    invoke-direct {v0, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    throw v0

    .line 334
    :cond_d
    invoke-static {v14}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 335
    .line 336
    .line 337
    move-result-object v15

    .line 338
    invoke-static {v9, v15}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result v15

    .line 342
    if-eqz v15, :cond_e

    .line 343
    .line 344
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    .line 345
    .line 346
    .line 347
    move-result-wide v18

    .line 348
    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 349
    .line 350
    .line 351
    move-result-object v5

    .line 352
    move-object v7, v5

    .line 353
    check-cast v7, Ljava/lang/String;

    .line 354
    .line 355
    goto/16 :goto_2

    .line 356
    .line 357
    :cond_e
    invoke-static {v13}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 358
    .line 359
    .line 360
    move-result-object v15

    .line 361
    invoke-static {v9, v15}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    move-result v15

    .line 365
    if-eqz v15, :cond_f

    .line 366
    .line 367
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 368
    .line 369
    .line 370
    move-result v5

    .line 371
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 372
    .line 373
    .line 374
    move-result-object v5

    .line 375
    move-object v7, v5

    .line 376
    check-cast v7, Ljava/lang/String;

    .line 377
    .line 378
    goto :goto_2

    .line 379
    :cond_f
    invoke-static {v12}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 380
    .line 381
    .line 382
    move-result-object v15

    .line 383
    invoke-static {v9, v15}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    move-result v15

    .line 387
    if-eqz v15, :cond_10

    .line 388
    .line 389
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 390
    .line 391
    .line 392
    move-result-wide v18

    .line 393
    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 394
    .line 395
    .line 396
    move-result-object v5

    .line 397
    move-object v7, v5

    .line 398
    check-cast v7, Ljava/lang/String;

    .line 399
    .line 400
    goto :goto_2

    .line 401
    :cond_10
    invoke-static {v11}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 402
    .line 403
    .line 404
    move-result-object v15

    .line 405
    invoke-static {v9, v15}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 406
    .line 407
    .line 408
    move-result v15

    .line 409
    if-eqz v15, :cond_11

    .line 410
    .line 411
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 412
    .line 413
    .line 414
    move-result v5

    .line 415
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 416
    .line 417
    .line 418
    move-result-object v5

    .line 419
    move-object v7, v5

    .line 420
    check-cast v7, Ljava/lang/String;

    .line 421
    .line 422
    goto :goto_2

    .line 423
    :cond_11
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 424
    .line 425
    .line 426
    move-result-object v15

    .line 427
    invoke-static {v9, v15}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    move-result v15

    .line 431
    if-eqz v15, :cond_13

    .line 432
    .line 433
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 434
    .line 435
    .line 436
    move-result-object v7

    .line 437
    if-eqz v7, :cond_12

    .line 438
    .line 439
    check-cast v7, Ljava/lang/String;

    .line 440
    .line 441
    goto :goto_2

    .line 442
    :cond_12
    new-instance v0, Ljava/lang/NullPointerException;

    .line 443
    .line 444
    invoke-direct {v0, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    throw v0

    .line 448
    :cond_13
    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 449
    .line 450
    .line 451
    move-result-object v15

    .line 452
    invoke-static {v9, v15}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    move-result v9

    .line 456
    if-eqz v9, :cond_15

    .line 457
    .line 458
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 459
    .line 460
    .line 461
    move-result-object v7

    .line 462
    if-eqz v7, :cond_14

    .line 463
    .line 464
    check-cast v7, Ljava/lang/String;

    .line 465
    .line 466
    goto :goto_2

    .line 467
    :cond_14
    new-instance v0, Ljava/lang/NullPointerException;

    .line 468
    .line 469
    invoke-direct {v0, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 470
    .line 471
    .line 472
    throw v0

    .line 473
    :cond_15
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v7

    .line 477
    if-eqz v7, :cond_25

    .line 478
    .line 479
    check-cast v7, Ljava/lang/String;

    .line 480
    .line 481
    :goto_2
    invoke-virtual {v8, v7}, Lrd/a;->H(Ljava/lang/String;)V

    .line 482
    .line 483
    .line 484
    const-string v5, "scales"

    .line 485
    .line 486
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 487
    .line 488
    .line 489
    move-result v7

    .line 490
    if-nez v7, :cond_16

    .line 491
    .line 492
    const/4 v15, 0x0

    .line 493
    goto/16 :goto_4

    .line 494
    .line 495
    :cond_16
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 496
    .line 497
    .line 498
    move-result-object v7

    .line 499
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 500
    .line 501
    .line 502
    move-result-object v9

    .line 503
    invoke-static {v7, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    move-result v9
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 507
    const-string v15, "null cannot be cast to non-null type org.json.JSONArray"

    .line 508
    .line 509
    if-eqz v9, :cond_18

    .line 510
    .line 511
    :try_start_2
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v5

    .line 515
    if-eqz v5, :cond_17

    .line 516
    .line 517
    check-cast v5, Lorg/json/JSONArray;

    .line 518
    .line 519
    :goto_3
    move-object v15, v5

    .line 520
    goto/16 :goto_4

    .line 521
    .line 522
    :cond_17
    new-instance v0, Ljava/lang/NullPointerException;

    .line 523
    .line 524
    invoke-direct {v0, v15}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    throw v0

    .line 528
    :cond_18
    invoke-static {v14}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 529
    .line 530
    .line 531
    move-result-object v9

    .line 532
    invoke-static {v7, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    move-result v9

    .line 536
    if-eqz v9, :cond_19

    .line 537
    .line 538
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    .line 539
    .line 540
    .line 541
    move-result-wide v9

    .line 542
    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 543
    .line 544
    .line 545
    move-result-object v5

    .line 546
    check-cast v5, Lorg/json/JSONArray;

    .line 547
    .line 548
    goto :goto_3

    .line 549
    :cond_19
    invoke-static {v13}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 550
    .line 551
    .line 552
    move-result-object v9

    .line 553
    invoke-static {v7, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    move-result v9

    .line 557
    if-eqz v9, :cond_1a

    .line 558
    .line 559
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 560
    .line 561
    .line 562
    move-result v5

    .line 563
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 564
    .line 565
    .line 566
    move-result-object v5

    .line 567
    check-cast v5, Lorg/json/JSONArray;

    .line 568
    .line 569
    goto :goto_3

    .line 570
    :cond_1a
    invoke-static {v12}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 571
    .line 572
    .line 573
    move-result-object v9

    .line 574
    invoke-static {v7, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    move-result v9

    .line 578
    if-eqz v9, :cond_1b

    .line 579
    .line 580
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 581
    .line 582
    .line 583
    move-result-wide v9

    .line 584
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 585
    .line 586
    .line 587
    move-result-object v5

    .line 588
    check-cast v5, Lorg/json/JSONArray;

    .line 589
    .line 590
    goto :goto_3

    .line 591
    :cond_1b
    invoke-static {v11}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 592
    .line 593
    .line 594
    move-result-object v9

    .line 595
    invoke-static {v7, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 596
    .line 597
    .line 598
    move-result v9

    .line 599
    if-eqz v9, :cond_1c

    .line 600
    .line 601
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 602
    .line 603
    .line 604
    move-result v5

    .line 605
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 606
    .line 607
    .line 608
    move-result-object v5

    .line 609
    check-cast v5, Lorg/json/JSONArray;

    .line 610
    .line 611
    goto :goto_3

    .line 612
    :cond_1c
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 613
    .line 614
    .line 615
    move-result-object v9

    .line 616
    invoke-static {v7, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 617
    .line 618
    .line 619
    move-result v9

    .line 620
    if-eqz v9, :cond_1e

    .line 621
    .line 622
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 623
    .line 624
    .line 625
    move-result-object v5

    .line 626
    if-eqz v5, :cond_1d

    .line 627
    .line 628
    goto :goto_3

    .line 629
    :cond_1d
    new-instance v0, Ljava/lang/NullPointerException;

    .line 630
    .line 631
    invoke-direct {v0, v15}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 632
    .line 633
    .line 634
    throw v0

    .line 635
    :cond_1e
    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 636
    .line 637
    .line 638
    move-result-object v9

    .line 639
    invoke-static {v7, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 640
    .line 641
    .line 642
    move-result v7

    .line 643
    if-eqz v7, :cond_20

    .line 644
    .line 645
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 646
    .line 647
    .line 648
    move-result-object v5

    .line 649
    if-eqz v5, :cond_1f

    .line 650
    .line 651
    check-cast v5, Lorg/json/JSONArray;

    .line 652
    .line 653
    goto/16 :goto_3

    .line 654
    .line 655
    :cond_1f
    new-instance v0, Ljava/lang/NullPointerException;

    .line 656
    .line 657
    invoke-direct {v0, v15}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 658
    .line 659
    .line 660
    throw v0

    .line 661
    :cond_20
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object v5

    .line 665
    if-eqz v5, :cond_24

    .line 666
    .line 667
    check-cast v5, Lorg/json/JSONArray;

    .line 668
    .line 669
    goto/16 :goto_3

    .line 670
    .line 671
    :goto_4
    if-eqz v15, :cond_23

    .line 672
    .line 673
    invoke-virtual {v15}, Lorg/json/JSONArray;->length()I

    .line 674
    .line 675
    .line 676
    move-result v5

    .line 677
    if-le v5, v4, :cond_23

    .line 678
    .line 679
    const-string v5, "scale"

    .line 680
    .line 681
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    .line 682
    .line 683
    .line 684
    move-result-wide v9

    .line 685
    double-to-float v0, v9

    .line 686
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    invoke-virtual {v8, v0}, Lrd/a;->I(Ljava/lang/Float;)V

    .line 691
    .line 692
    .line 693
    invoke-virtual {v15}, Lorg/json/JSONArray;->length()I

    .line 694
    .line 695
    .line 696
    move-result v0

    .line 697
    new-array v5, v0, [Ljava/lang/Float;

    .line 698
    .line 699
    const/4 v7, 0x0

    .line 700
    :goto_5
    if-ge v7, v0, :cond_21

    .line 701
    .line 702
    const/4 v9, 0x0

    .line 703
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 704
    .line 705
    .line 706
    move-result-object v9

    .line 707
    aput-object v9, v5, v7

    .line 708
    .line 709
    add-int/lit8 v7, v7, 0x1

    .line 710
    .line 711
    goto :goto_5

    .line 712
    :cond_21
    invoke-virtual {v15}, Lorg/json/JSONArray;->length()I

    .line 713
    .line 714
    .line 715
    move-result v0

    .line 716
    const/4 v7, 0x0

    .line 717
    :goto_6
    if-ge v7, v0, :cond_22

    .line 718
    .line 719
    invoke-virtual {v15, v7}, Lorg/json/JSONArray;->getDouble(I)D

    .line 720
    .line 721
    .line 722
    move-result-wide v9

    .line 723
    double-to-float v9, v9

    .line 724
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 725
    .line 726
    .line 727
    move-result-object v9

    .line 728
    aput-object v9, v5, v7

    .line 729
    .line 730
    add-int/lit8 v7, v7, 0x1

    .line 731
    .line 732
    goto :goto_6

    .line 733
    :cond_22
    invoke-virtual {v8, v5}, Lrd/a;->J([Ljava/lang/Float;)V

    .line 734
    .line 735
    .line 736
    :cond_23
    invoke-interface {v2, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 737
    .line 738
    .line 739
    goto :goto_8

    .line 740
    :cond_24
    new-instance v0, Ljava/lang/NullPointerException;

    .line 741
    .line 742
    invoke-direct {v0, v15}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 743
    .line 744
    .line 745
    throw v0

    .line 746
    :cond_25
    new-instance v0, Ljava/lang/NullPointerException;

    .line 747
    .line 748
    invoke-direct {v0, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 749
    .line 750
    .line 751
    throw v0

    .line 752
    :cond_26
    new-instance v0, Ljava/lang/NullPointerException;

    .line 753
    .line 754
    invoke-direct {v0, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 755
    .line 756
    .line 757
    throw v0
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 758
    :goto_7
    sget-object v5, Lyd/d;->m:Ljava/lang/String;

    .line 759
    .line 760
    const-string v7, "Could not read asset from manifest"

    .line 761
    .line 762
    invoke-static {v5, v7, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 763
    .line 764
    .line 765
    :goto_8
    add-int/lit8 v6, v6, 0x1

    .line 766
    .line 767
    goto/16 :goto_0

    .line 768
    .line 769
    :cond_27
    return-object v2
.end method

.method private static final i(Lyd/d;)Lrd/d;
    .locals 8

    .line 1
    new-instance v0, Lrd/d;

    .line 2
    .line 3
    iget-object v1, p0, Lyd/d;->b:Ljava/util/UUID;

    .line 4
    .line 5
    iget-object v2, p0, Lyd/d;->d:Ljava/util/Date;

    .line 6
    .line 7
    iget-object v3, p0, Lyd/d;->e:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lyd/d;->c:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p0}, Lyd/d;->h()LAc/a;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-virtual {v5}, LAc/e;->i()Lorg/json/JSONObject;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    iget-object v6, p0, Lyd/d;->g:Landroid/net/Uri;

    .line 20
    .line 21
    iget-object v7, p0, Lyd/d;->h:Ljava/util/Map;

    .line 22
    .line 23
    invoke-direct/range {v0 .. v7}, Lrd/d;-><init>(Ljava/util/UUID;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Landroid/net/Uri;Ljava/util/Map;)V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lsd/b;->c:Lsd/b;

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Lrd/d;->v(Lsd/b;)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lyd/d;->j:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/List;

    .line 8
    .line 9
    return-object v0
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyd/d;->k:Z

    .line 2
    .line 3
    return v0
.end method

.method public c()Lrd/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lyd/d;->i:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lrd/d;

    .line 8
    .line 9
    return-object v0
.end method

.method public bridge synthetic d()LAc/e;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lyd/d;->h()LAc/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public h()LAc/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lyd/d;->a:LAc/a;

    .line 2
    .line 3
    return-object v0
.end method
