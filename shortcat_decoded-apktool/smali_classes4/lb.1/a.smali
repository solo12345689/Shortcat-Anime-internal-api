.class public final Llb/a;
.super Lgc/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u001c\u0010\u000f\u001a\n \u000c*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000eR\u001c\u0010\u0013\u001a\n \u000c*\u0004\u0018\u00010\u00100\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Llb/a;",
        "Lgc/c;",
        "<init>",
        "()V",
        "Lgc/e;",
        "n",
        "()Lgc/e;",
        "Landroid/content/Context;",
        "A",
        "()Landroid/content/Context;",
        "context",
        "",
        "kotlin.jvm.PlatformType",
        "C",
        "()Ljava/lang/String;",
        "packageName",
        "Landroid/content/pm/PackageManager;",
        "B",
        "()Landroid/content/pm/PackageManager;",
        "packageManager",
        "expo-application_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lgc/c;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final A()Landroid/content/Context;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lgc/c;->i()LUb/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LUb/d;->B()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Lcc/i;

    .line 13
    .line 14
    invoke-direct {v0}, Lcc/i;-><init>()V

    .line 15
    .line 16
    .line 17
    throw v0
.end method

.method private final B()Landroid/content/pm/PackageManager;
    .locals 1

    .line 1
    invoke-direct {p0}, Llb/a;->A()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method private final C()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-direct {p0}, Llb/a;->A()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public static final synthetic x(Llb/a;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-direct {p0}, Llb/a;->A()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic y(Llb/a;)Landroid/content/pm/PackageManager;
    .locals 0

    .line 1
    invoke-direct {p0}, Llb/a;->B()Landroid/content/pm/PackageManager;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic z(Llb/a;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Llb/a;->C()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public n()Lgc/e;
    .locals 14

    .line 1
    const-class v0, Ljava/lang/Double;

    .line 2
    .line 3
    const-class v1, LUb/u;

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
    const-string v3, "ExpoApplication"

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Lgc/a;->s(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string v3, "applicationName"

    .line 67
    .line 68
    new-instance v4, Lhc/c;

    .line 69
    .line 70
    invoke-direct {v4, v3}, Lhc/c;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    new-instance v5, Llb/a$g;

    .line 74
    .line 75
    invoke-direct {v5, p0}, Llb/a$g;-><init>(Llb/a;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4, v5}, Lhc/c;->b(Lie/a;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Lhc/f;->l()Ljava/util/Map;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    const-string v3, "applicationId"

    .line 89
    .line 90
    new-instance v4, Lhc/c;

    .line 91
    .line 92
    invoke-direct {v4, v3}, Lhc/c;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    new-instance v5, Llb/a$h;

    .line 96
    .line 97
    invoke-direct {v5, p0}, Llb/a$h;-><init>(Llb/a;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4, v5}, Lhc/c;->b(Lie/a;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2}, Lhc/f;->l()Ljava/util/Map;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    const-string v3, "nativeApplicationVersion"

    .line 111
    .line 112
    new-instance v4, Lhc/c;

    .line 113
    .line 114
    invoke-direct {v4, v3}, Lhc/c;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    new-instance v5, Llb/a$i;

    .line 118
    .line 119
    invoke-direct {v5, p0}, Llb/a$i;-><init>(Llb/a;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4, v5}, Lhc/c;->b(Lie/a;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2}, Lhc/f;->l()Ljava/util/Map;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    const-string v3, "nativeBuildVersion"

    .line 133
    .line 134
    new-instance v4, Lhc/c;

    .line 135
    .line 136
    invoke-direct {v4, v3}, Lhc/c;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    new-instance v5, Llb/a$j;

    .line 140
    .line 141
    invoke-direct {v5, p0}, Llb/a$j;-><init>(Llb/a;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v4, v5}, Lhc/c;->b(Lie/a;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2}, Lhc/f;->l()Ljava/util/Map;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    const-string v3, "androidId"

    .line 155
    .line 156
    new-instance v4, Lhc/c;

    .line 157
    .line 158
    invoke-direct {v4, v3}, Lhc/c;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    new-instance v5, Llb/a$k;

    .line 162
    .line 163
    invoke-direct {v5, p0}, Llb/a$k;-><init>(Llb/a;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v4, v5}, Lhc/c;->b(Lie/a;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2}, Lhc/f;->l()Ljava/util/Map;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    const-string v3, "getInstallationTimeAsync"

    .line 177
    .line 178
    const/4 v4, 0x0

    .line 179
    new-array v5, v4, [Lpc/b;

    .line 180
    .line 181
    new-instance v6, Llb/a$b;

    .line 182
    .line 183
    invoke-direct {v6, p0}, Llb/a$b;-><init>(Llb/a;)V

    .line 184
    .line 185
    .line 186
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 187
    .line 188
    invoke-static {v0, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 192
    const-class v9, Ljava/lang/String;

    .line 193
    .line 194
    sget-object v10, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 195
    .line 196
    sget-object v11, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 197
    .line 198
    sget-object v12, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 199
    .line 200
    if-eqz v8, :cond_0

    .line 201
    .line 202
    :try_start_1
    new-instance v8, Ldc/l;

    .line 203
    .line 204
    invoke-direct {v8, v3, v5, v6}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 205
    .line 206
    .line 207
    goto :goto_0

    .line 208
    :catchall_0
    move-exception v0

    .line 209
    goto/16 :goto_4

    .line 210
    .line 211
    :cond_0
    invoke-static {v0, v12}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v8

    .line 215
    if-eqz v8, :cond_1

    .line 216
    .line 217
    new-instance v8, Ldc/h;

    .line 218
    .line 219
    invoke-direct {v8, v3, v5, v6}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 220
    .line 221
    .line 222
    goto :goto_0

    .line 223
    :cond_1
    invoke-static {v0, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v8

    .line 227
    if-eqz v8, :cond_2

    .line 228
    .line 229
    new-instance v8, Ldc/i;

    .line 230
    .line 231
    invoke-direct {v8, v3, v5, v6}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 232
    .line 233
    .line 234
    goto :goto_0

    .line 235
    :cond_2
    invoke-static {v0, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v8

    .line 239
    if-eqz v8, :cond_3

    .line 240
    .line 241
    new-instance v8, Ldc/j;

    .line 242
    .line 243
    invoke-direct {v8, v3, v5, v6}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 244
    .line 245
    .line 246
    goto :goto_0

    .line 247
    :cond_3
    invoke-static {v0, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v8

    .line 251
    if-eqz v8, :cond_4

    .line 252
    .line 253
    new-instance v8, Ldc/n;

    .line 254
    .line 255
    invoke-direct {v8, v3, v5, v6}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 256
    .line 257
    .line 258
    goto :goto_0

    .line 259
    :cond_4
    new-instance v8, Ldc/s;

    .line 260
    .line 261
    invoke-direct {v8, v3, v5, v6}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 262
    .line 263
    .line 264
    :goto_0
    invoke-virtual {v2}, Lhc/f;->k()Ljava/util/Map;

    .line 265
    .line 266
    .line 267
    move-result-object v5

    .line 268
    invoke-interface {v5, v3, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    const-string v3, "getLastUpdateTimeAsync"

    .line 272
    .line 273
    new-array v5, v4, [Lpc/b;

    .line 274
    .line 275
    new-instance v6, Llb/a$c;

    .line 276
    .line 277
    invoke-direct {v6, p0}, Llb/a$c;-><init>(Llb/a;)V

    .line 278
    .line 279
    .line 280
    invoke-static {v0, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v8

    .line 284
    if-eqz v8, :cond_5

    .line 285
    .line 286
    new-instance v0, Ldc/l;

    .line 287
    .line 288
    invoke-direct {v0, v3, v5, v6}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 289
    .line 290
    .line 291
    goto :goto_1

    .line 292
    :cond_5
    invoke-static {v0, v12}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v8

    .line 296
    if-eqz v8, :cond_6

    .line 297
    .line 298
    new-instance v0, Ldc/h;

    .line 299
    .line 300
    invoke-direct {v0, v3, v5, v6}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 301
    .line 302
    .line 303
    goto :goto_1

    .line 304
    :cond_6
    invoke-static {v0, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v8

    .line 308
    if-eqz v8, :cond_7

    .line 309
    .line 310
    new-instance v0, Ldc/i;

    .line 311
    .line 312
    invoke-direct {v0, v3, v5, v6}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 313
    .line 314
    .line 315
    goto :goto_1

    .line 316
    :cond_7
    invoke-static {v0, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result v8

    .line 320
    if-eqz v8, :cond_8

    .line 321
    .line 322
    new-instance v0, Ldc/j;

    .line 323
    .line 324
    invoke-direct {v0, v3, v5, v6}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 325
    .line 326
    .line 327
    goto :goto_1

    .line 328
    :cond_8
    invoke-static {v0, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    if-eqz v0, :cond_9

    .line 333
    .line 334
    new-instance v0, Ldc/n;

    .line 335
    .line 336
    invoke-direct {v0, v3, v5, v6}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 337
    .line 338
    .line 339
    goto :goto_1

    .line 340
    :cond_9
    new-instance v0, Ldc/s;

    .line 341
    .line 342
    invoke-direct {v0, v3, v5, v6}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 343
    .line 344
    .line 345
    :goto_1
    invoke-virtual {v2}, Lhc/f;->k()Ljava/util/Map;

    .line 346
    .line 347
    .line 348
    move-result-object v5

    .line 349
    invoke-interface {v5, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    const-string v0, "getInstallReferrerAsync"

    .line 353
    .line 354
    invoke-static {v1, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v3

    .line 358
    if-eqz v3, :cond_a

    .line 359
    .line 360
    new-instance v1, Ldc/f;

    .line 361
    .line 362
    new-array v3, v4, [Lpc/b;

    .line 363
    .line 364
    new-instance v4, Llb/a$d;

    .line 365
    .line 366
    invoke-direct {v4, p0}, Llb/a$d;-><init>(Llb/a;)V

    .line 367
    .line 368
    .line 369
    invoke-direct {v1, v0, v3, v4}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 370
    .line 371
    .line 372
    goto/16 :goto_3

    .line 373
    .line 374
    :cond_a
    invoke-virtual {v2}, Lhc/f;->m()Lpc/X;

    .line 375
    .line 376
    .line 377
    move-result-object v3

    .line 378
    sget-object v5, Lpc/d;->a:Lpc/d;

    .line 379
    .line 380
    new-instance v6, Lkotlin/Pair;

    .line 381
    .line 382
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 383
    .line 384
    .line 385
    move-result-object v8

    .line 386
    sget-object v13, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 387
    .line 388
    invoke-direct {v6, v8, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v5}, Lpc/d;->a()Ljava/util/Map;

    .line 392
    .line 393
    .line 394
    move-result-object v5

    .line 395
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v5

    .line 399
    check-cast v5, Lpc/b;

    .line 400
    .line 401
    if-nez v5, :cond_b

    .line 402
    .line 403
    sget-object v5, Llb/a$e;->a:Llb/a$e;

    .line 404
    .line 405
    new-instance v6, Lpc/b;

    .line 406
    .line 407
    new-instance v8, Lpc/M;

    .line 408
    .line 409
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    invoke-direct {v8, v1, v4, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 414
    .line 415
    .line 416
    invoke-direct {v6, v8, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 417
    .line 418
    .line 419
    move-object v5, v6

    .line 420
    :cond_b
    filled-new-array {v5}, [Lpc/b;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    new-instance v3, Llb/a$f;

    .line 425
    .line 426
    invoke-direct {v3, p0}, Llb/a$f;-><init>(Llb/a;)V

    .line 427
    .line 428
    .line 429
    const-class v4, LTd/L;

    .line 430
    .line 431
    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    move-result v5

    .line 435
    if-eqz v5, :cond_c

    .line 436
    .line 437
    new-instance v4, Ldc/l;

    .line 438
    .line 439
    invoke-direct {v4, v0, v1, v3}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 440
    .line 441
    .line 442
    :goto_2
    move-object v1, v4

    .line 443
    goto :goto_3

    .line 444
    :cond_c
    invoke-static {v4, v12}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    move-result v5

    .line 448
    if-eqz v5, :cond_d

    .line 449
    .line 450
    new-instance v4, Ldc/h;

    .line 451
    .line 452
    invoke-direct {v4, v0, v1, v3}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 453
    .line 454
    .line 455
    goto :goto_2

    .line 456
    :cond_d
    invoke-static {v4, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 457
    .line 458
    .line 459
    move-result v5

    .line 460
    if-eqz v5, :cond_e

    .line 461
    .line 462
    new-instance v4, Ldc/i;

    .line 463
    .line 464
    invoke-direct {v4, v0, v1, v3}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 465
    .line 466
    .line 467
    goto :goto_2

    .line 468
    :cond_e
    invoke-static {v4, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    move-result v5

    .line 472
    if-eqz v5, :cond_f

    .line 473
    .line 474
    new-instance v4, Ldc/j;

    .line 475
    .line 476
    invoke-direct {v4, v0, v1, v3}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 477
    .line 478
    .line 479
    goto :goto_2

    .line 480
    :cond_f
    invoke-static {v4, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 481
    .line 482
    .line 483
    move-result v4

    .line 484
    if-eqz v4, :cond_10

    .line 485
    .line 486
    new-instance v4, Ldc/n;

    .line 487
    .line 488
    invoke-direct {v4, v0, v1, v3}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 489
    .line 490
    .line 491
    goto :goto_2

    .line 492
    :cond_10
    new-instance v4, Ldc/s;

    .line 493
    .line 494
    invoke-direct {v4, v0, v1, v3}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 495
    .line 496
    .line 497
    goto :goto_2

    .line 498
    :goto_3
    invoke-virtual {v2}, Lhc/f;->k()Ljava/util/Map;

    .line 499
    .line 500
    .line 501
    move-result-object v3

    .line 502
    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v2}, Lgc/a;->u()Lgc/e;

    .line 506
    .line 507
    .line 508
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 509
    invoke-static {}, LX3/a;->f()V

    .line 510
    .line 511
    .line 512
    return-object v0

    .line 513
    :goto_4
    invoke-static {}, LX3/a;->f()V

    .line 514
    .line 515
    .line 516
    throw v0
.end method
