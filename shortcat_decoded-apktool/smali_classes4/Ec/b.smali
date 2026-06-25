.class public final LEc/b;
.super Lgc/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001b\u0010\u000c\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "LEc/b;",
        "Lgc/c;",
        "<init>",
        "()V",
        "Lgc/e;",
        "n",
        "()Lgc/e;",
        "LSb/a;",
        "d",
        "Lkotlin/Lazy;",
        "z",
        "()LSb/a;",
        "taskManager",
        "expo-notifications_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final d:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lgc/c;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LEc/a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LEc/a;-><init>(LEc/b;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, LEc/b;->d:Lkotlin/Lazy;

    .line 14
    .line 15
    return-void
.end method

.method private static final A(LEc/b;)LSb/a;
    .locals 1

    .line 1
    const-class v0, LSb/a;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgc/c;->i()LUb/d;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :try_start_0
    invoke-virtual {p0}, LUb/d;->v()Lpb/b;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0, v0}, Lpb/b;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    goto :goto_0

    .line 16
    :catch_0
    const/4 p0, 0x0

    .line 17
    :goto_0
    invoke-static {p0}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    new-instance p0, LBc/a;

    .line 21
    .line 22
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-direct {p0, v0}, LBc/a;-><init>(Lpe/d;)V

    .line 27
    .line 28
    .line 29
    throw p0
.end method

.method public static synthetic x(LEc/b;)LSb/a;
    .locals 0

    .line 1
    invoke-static {p0}, LEc/b;->A(LEc/b;)LSb/a;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method public static final synthetic y(LEc/b;)LSb/a;
    .locals 0

    .line 1
    invoke-direct {p0}, LEc/b;->z()LSb/a;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method private final z()LSb/a;
    .locals 1

    .line 1
    iget-object v0, p0, LEc/b;->d:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method


# virtual methods
.method public n()Lgc/e;
    .locals 15

    .line 1
    const-class v0, LUb/u;

    .line 2
    .line 3
    const-class v1, Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    new-instance v3, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v2, ".ModuleDefinition"

    .line 18
    .line 19
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    new-instance v3, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v4, "["

    .line 32
    .line 33
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v4, "ExpoModulesCore"

    .line 37
    .line 38
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v4, "] "

    .line 42
    .line 43
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {v2}, LX3/a;->c(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :try_start_0
    new-instance v2, Lgc/d;

    .line 57
    .line 58
    invoke-direct {v2, p0}, Lgc/d;-><init>(Lgc/c;)V

    .line 59
    .line 60
    .line 61
    const-string v3, "ExpoBackgroundNotificationTasksModule"

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Lgc/a;->s(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string v3, "registerTaskAsync"

    .line 67
    .line 68
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 73
    .line 74
    sget-object v6, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 75
    .line 76
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 77
    .line 78
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 79
    .line 80
    const-class v9, LTd/L;

    .line 81
    .line 82
    const/4 v10, 0x0

    .line 83
    if-eqz v4, :cond_0

    .line 84
    .line 85
    :try_start_1
    new-instance v4, Ldc/f;

    .line 86
    .line 87
    new-array v11, v10, [Lpc/b;

    .line 88
    .line 89
    new-instance v12, LEc/b$a;

    .line 90
    .line 91
    invoke-direct {v12, p0}, LEc/b$a;-><init>(LEc/b;)V

    .line 92
    .line 93
    .line 94
    invoke-direct {v4, v3, v11, v12}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 95
    .line 96
    .line 97
    goto/16 :goto_1

    .line 98
    .line 99
    :catchall_0
    move-exception v0

    .line 100
    goto/16 :goto_4

    .line 101
    .line 102
    :cond_0
    invoke-virtual {v2}, Lhc/f;->m()Lpc/X;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    sget-object v11, Lpc/d;->a:Lpc/d;

    .line 107
    .line 108
    new-instance v12, Lkotlin/Pair;

    .line 109
    .line 110
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 111
    .line 112
    .line 113
    move-result-object v13

    .line 114
    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 115
    .line 116
    invoke-direct {v12, v13, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v11}, Lpc/d;->a()Ljava/util/Map;

    .line 120
    .line 121
    .line 122
    move-result-object v11

    .line 123
    invoke-interface {v11, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v11

    .line 127
    check-cast v11, Lpc/b;

    .line 128
    .line 129
    if-nez v11, :cond_1

    .line 130
    .line 131
    sget-object v11, LEc/b$b;->a:LEc/b$b;

    .line 132
    .line 133
    new-instance v12, Lpc/b;

    .line 134
    .line 135
    new-instance v13, Lpc/M;

    .line 136
    .line 137
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 138
    .line 139
    .line 140
    move-result-object v14

    .line 141
    invoke-direct {v13, v14, v10, v11}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 142
    .line 143
    .line 144
    invoke-direct {v12, v13, v4}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 145
    .line 146
    .line 147
    move-object v11, v12

    .line 148
    :cond_1
    filled-new-array {v11}, [Lpc/b;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    new-instance v11, LEc/b$c;

    .line 153
    .line 154
    invoke-direct {v11, p0}, LEc/b$c;-><init>(LEc/b;)V

    .line 155
    .line 156
    .line 157
    invoke-static {v9, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v12

    .line 161
    if-eqz v12, :cond_2

    .line 162
    .line 163
    new-instance v12, Ldc/l;

    .line 164
    .line 165
    invoke-direct {v12, v3, v4, v11}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 166
    .line 167
    .line 168
    :goto_0
    move-object v4, v12

    .line 169
    goto :goto_1

    .line 170
    :cond_2
    invoke-static {v9, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v12

    .line 174
    if-eqz v12, :cond_3

    .line 175
    .line 176
    new-instance v12, Ldc/h;

    .line 177
    .line 178
    invoke-direct {v12, v3, v4, v11}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 179
    .line 180
    .line 181
    goto :goto_0

    .line 182
    :cond_3
    invoke-static {v9, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v12

    .line 186
    if-eqz v12, :cond_4

    .line 187
    .line 188
    new-instance v12, Ldc/i;

    .line 189
    .line 190
    invoke-direct {v12, v3, v4, v11}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 191
    .line 192
    .line 193
    goto :goto_0

    .line 194
    :cond_4
    invoke-static {v9, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v12

    .line 198
    if-eqz v12, :cond_5

    .line 199
    .line 200
    new-instance v12, Ldc/j;

    .line 201
    .line 202
    invoke-direct {v12, v3, v4, v11}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 203
    .line 204
    .line 205
    goto :goto_0

    .line 206
    :cond_5
    invoke-static {v9, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v12

    .line 210
    if-eqz v12, :cond_6

    .line 211
    .line 212
    new-instance v12, Ldc/n;

    .line 213
    .line 214
    invoke-direct {v12, v3, v4, v11}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 215
    .line 216
    .line 217
    goto :goto_0

    .line 218
    :cond_6
    new-instance v12, Ldc/s;

    .line 219
    .line 220
    invoke-direct {v12, v3, v4, v11}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 221
    .line 222
    .line 223
    goto :goto_0

    .line 224
    :goto_1
    invoke-virtual {v2}, Lhc/f;->k()Ljava/util/Map;

    .line 225
    .line 226
    .line 227
    move-result-object v11

    .line 228
    invoke-interface {v11, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    const-string v3, "unregisterTaskAsync"

    .line 232
    .line 233
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    if-eqz v0, :cond_7

    .line 238
    .line 239
    new-instance v0, Ldc/f;

    .line 240
    .line 241
    new-array v1, v10, [Lpc/b;

    .line 242
    .line 243
    new-instance v4, LEc/b$d;

    .line 244
    .line 245
    invoke-direct {v4, p0}, LEc/b$d;-><init>(LEc/b;)V

    .line 246
    .line 247
    .line 248
    invoke-direct {v0, v3, v1, v4}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 249
    .line 250
    .line 251
    goto/16 :goto_3

    .line 252
    .line 253
    :cond_7
    invoke-virtual {v2}, Lhc/f;->m()Lpc/X;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    sget-object v4, Lpc/d;->a:Lpc/d;

    .line 258
    .line 259
    new-instance v11, Lkotlin/Pair;

    .line 260
    .line 261
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 262
    .line 263
    .line 264
    move-result-object v12

    .line 265
    sget-object v13, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 266
    .line 267
    invoke-direct {v11, v12, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v4}, Lpc/d;->a()Ljava/util/Map;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    invoke-interface {v4, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v4

    .line 278
    check-cast v4, Lpc/b;

    .line 279
    .line 280
    if-nez v4, :cond_8

    .line 281
    .line 282
    sget-object v4, LEc/b$e;->a:LEc/b$e;

    .line 283
    .line 284
    new-instance v11, Lpc/b;

    .line 285
    .line 286
    new-instance v12, Lpc/M;

    .line 287
    .line 288
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 289
    .line 290
    .line 291
    move-result-object v13

    .line 292
    invoke-direct {v12, v13, v10, v4}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 293
    .line 294
    .line 295
    invoke-direct {v11, v12, v0}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 296
    .line 297
    .line 298
    move-object v4, v11

    .line 299
    :cond_8
    filled-new-array {v4}, [Lpc/b;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    new-instance v4, LEc/b$f;

    .line 304
    .line 305
    invoke-direct {v4, p0}, LEc/b$f;-><init>(LEc/b;)V

    .line 306
    .line 307
    .line 308
    invoke-static {v9, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v8

    .line 312
    if-eqz v8, :cond_9

    .line 313
    .line 314
    new-instance v1, Ldc/l;

    .line 315
    .line 316
    invoke-direct {v1, v3, v0, v4}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 317
    .line 318
    .line 319
    :goto_2
    move-object v0, v1

    .line 320
    goto :goto_3

    .line 321
    :cond_9
    invoke-static {v9, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result v7

    .line 325
    if-eqz v7, :cond_a

    .line 326
    .line 327
    new-instance v1, Ldc/h;

    .line 328
    .line 329
    invoke-direct {v1, v3, v0, v4}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 330
    .line 331
    .line 332
    goto :goto_2

    .line 333
    :cond_a
    invoke-static {v9, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v6

    .line 337
    if-eqz v6, :cond_b

    .line 338
    .line 339
    new-instance v1, Ldc/i;

    .line 340
    .line 341
    invoke-direct {v1, v3, v0, v4}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 342
    .line 343
    .line 344
    goto :goto_2

    .line 345
    :cond_b
    invoke-static {v9, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v5

    .line 349
    if-eqz v5, :cond_c

    .line 350
    .line 351
    new-instance v1, Ldc/j;

    .line 352
    .line 353
    invoke-direct {v1, v3, v0, v4}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 354
    .line 355
    .line 356
    goto :goto_2

    .line 357
    :cond_c
    invoke-static {v9, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v1

    .line 361
    if-eqz v1, :cond_d

    .line 362
    .line 363
    new-instance v1, Ldc/n;

    .line 364
    .line 365
    invoke-direct {v1, v3, v0, v4}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 366
    .line 367
    .line 368
    goto :goto_2

    .line 369
    :cond_d
    new-instance v1, Ldc/s;

    .line 370
    .line 371
    invoke-direct {v1, v3, v0, v4}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 372
    .line 373
    .line 374
    goto :goto_2

    .line 375
    :goto_3
    invoke-virtual {v2}, Lhc/f;->k()Ljava/util/Map;

    .line 376
    .line 377
    .line 378
    move-result-object v1

    .line 379
    invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v2}, Lgc/a;->u()Lgc/e;

    .line 383
    .line 384
    .line 385
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 386
    invoke-static {}, LX3/a;->f()V

    .line 387
    .line 388
    .line 389
    return-object v0

    .line 390
    :goto_4
    invoke-static {}, LX3/a;->f()V

    .line 391
    .line 392
    .line 393
    throw v0
.end method
