.class public final Lzb/a;
.super Lgc/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzb/a$a;,
        Lzb/a$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0016"
    }
    d2 = {
        "Lzb/a;",
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
        "B",
        "()I",
        "deviceYearClass",
        "",
        "C",
        "()Ljava/lang/String;",
        "systemName",
        "d",
        "b",
        "a",
        "expo-device_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final d:Lzb/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lzb/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lzb/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lzb/a;->d:Lzb/a$a;

    .line 8
    .line 9
    return-void
.end method

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

.method private final B()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lzb/a;->A()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LM5/b;->d(Landroid/content/Context;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method private final C()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Landroid/os/Build$VERSION;->BASE_OS:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-lez v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    if-nez v0, :cond_1

    .line 15
    .line 16
    const-string v0, "Android"

    .line 17
    .line 18
    :cond_1
    return-object v0
.end method

.method public static final synthetic x(Lzb/a;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-direct {p0}, Lzb/a;->A()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic y(Lzb/a;)I
    .locals 0

    .line 1
    invoke-direct {p0}, Lzb/a;->B()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic z(Lzb/a;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lzb/a;->C()Ljava/lang/String;

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
    const-class v1, Ljava/lang/Boolean;

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
    const-string v3, "ExpoDevice"

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Lgc/a;->s(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string v3, "isDevice"

    .line 67
    .line 68
    new-instance v4, Lhc/c;

    .line 69
    .line 70
    invoke-direct {v4, v3}, Lhc/c;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    new-instance v5, Lzb/a$t;

    .line 74
    .line 75
    invoke-direct {v5}, Lzb/a$t;-><init>()V

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
    const-string v3, "brand"

    .line 89
    .line 90
    new-instance v4, Lhc/c;

    .line 91
    .line 92
    invoke-direct {v4, v3}, Lhc/c;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    new-instance v5, Lzb/a$u;

    .line 96
    .line 97
    invoke-direct {v5}, Lzb/a$u;-><init>()V

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
    const-string v3, "manufacturer"

    .line 111
    .line 112
    new-instance v4, Lhc/c;

    .line 113
    .line 114
    invoke-direct {v4, v3}, Lhc/c;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    new-instance v5, Lzb/a$v;

    .line 118
    .line 119
    invoke-direct {v5}, Lzb/a$v;-><init>()V

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
    const-string v3, "modelName"

    .line 133
    .line 134
    new-instance v4, Lhc/c;

    .line 135
    .line 136
    invoke-direct {v4, v3}, Lhc/c;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    new-instance v5, Lzb/a$w;

    .line 140
    .line 141
    invoke-direct {v5}, Lzb/a$w;-><init>()V

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
    const-string v3, "designName"

    .line 155
    .line 156
    new-instance v4, Lhc/c;

    .line 157
    .line 158
    invoke-direct {v4, v3}, Lhc/c;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    new-instance v5, Lzb/a$x;

    .line 162
    .line 163
    invoke-direct {v5}, Lzb/a$x;-><init>()V

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
    const-string v3, "productName"

    .line 177
    .line 178
    new-instance v4, Lhc/c;

    .line 179
    .line 180
    invoke-direct {v4, v3}, Lhc/c;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    new-instance v5, Lzb/a$y;

    .line 184
    .line 185
    invoke-direct {v5}, Lzb/a$y;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v4, v5}, Lhc/c;->b(Lie/a;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2}, Lhc/f;->l()Ljava/util/Map;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    const-string v3, "deviceYearClass"

    .line 199
    .line 200
    new-instance v4, Lhc/c;

    .line 201
    .line 202
    invoke-direct {v4, v3}, Lhc/c;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    new-instance v5, Lzb/a$z;

    .line 206
    .line 207
    invoke-direct {v5, p0}, Lzb/a$z;-><init>(Lzb/a;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v4, v5}, Lhc/c;->b(Lie/a;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2}, Lhc/f;->l()Ljava/util/Map;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    const-string v3, "totalMemory"

    .line 221
    .line 222
    new-instance v4, Lhc/c;

    .line 223
    .line 224
    invoke-direct {v4, v3}, Lhc/c;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    new-instance v5, Lzb/a$A;

    .line 228
    .line 229
    invoke-direct {v5, p0}, Lzb/a$A;-><init>(Lzb/a;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v4, v5}, Lhc/c;->b(Lie/a;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v2}, Lhc/f;->l()Ljava/util/Map;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    const-string v3, "deviceType"

    .line 243
    .line 244
    new-instance v4, Lhc/c;

    .line 245
    .line 246
    invoke-direct {v4, v3}, Lhc/c;-><init>(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    new-instance v5, Lzb/a$B;

    .line 250
    .line 251
    invoke-direct {v5, p0}, Lzb/a$B;-><init>(Lzb/a;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v4, v5}, Lhc/c;->b(Lie/a;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2}, Lhc/f;->l()Ljava/util/Map;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    const-string v3, "supportedCpuArchitectures"

    .line 265
    .line 266
    new-instance v4, Lhc/c;

    .line 267
    .line 268
    invoke-direct {v4, v3}, Lhc/c;-><init>(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    new-instance v5, Lzb/a$l;

    .line 272
    .line 273
    invoke-direct {v5}, Lzb/a$l;-><init>()V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v4, v5}, Lhc/c;->b(Lie/a;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2}, Lhc/f;->l()Ljava/util/Map;

    .line 280
    .line 281
    .line 282
    move-result-object v5

    .line 283
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    const-string v3, "osName"

    .line 287
    .line 288
    new-instance v4, Lhc/c;

    .line 289
    .line 290
    invoke-direct {v4, v3}, Lhc/c;-><init>(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    new-instance v5, Lzb/a$m;

    .line 294
    .line 295
    invoke-direct {v5, p0}, Lzb/a$m;-><init>(Lzb/a;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v4, v5}, Lhc/c;->b(Lie/a;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v2}, Lhc/f;->l()Ljava/util/Map;

    .line 302
    .line 303
    .line 304
    move-result-object v5

    .line 305
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    const-string v3, "osVersion"

    .line 309
    .line 310
    new-instance v4, Lhc/c;

    .line 311
    .line 312
    invoke-direct {v4, v3}, Lhc/c;-><init>(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    new-instance v5, Lzb/a$n;

    .line 316
    .line 317
    invoke-direct {v5}, Lzb/a$n;-><init>()V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v4, v5}, Lhc/c;->b(Lie/a;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v2}, Lhc/f;->l()Ljava/util/Map;

    .line 324
    .line 325
    .line 326
    move-result-object v5

    .line 327
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    const-string v3, "osBuildId"

    .line 331
    .line 332
    new-instance v4, Lhc/c;

    .line 333
    .line 334
    invoke-direct {v4, v3}, Lhc/c;-><init>(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    new-instance v5, Lzb/a$o;

    .line 338
    .line 339
    invoke-direct {v5}, Lzb/a$o;-><init>()V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v4, v5}, Lhc/c;->b(Lie/a;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v2}, Lhc/f;->l()Ljava/util/Map;

    .line 346
    .line 347
    .line 348
    move-result-object v5

    .line 349
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    const-string v3, "osInternalBuildId"

    .line 353
    .line 354
    new-instance v4, Lhc/c;

    .line 355
    .line 356
    invoke-direct {v4, v3}, Lhc/c;-><init>(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    new-instance v5, Lzb/a$p;

    .line 360
    .line 361
    invoke-direct {v5}, Lzb/a$p;-><init>()V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v4, v5}, Lhc/c;->b(Lie/a;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v2}, Lhc/f;->l()Ljava/util/Map;

    .line 368
    .line 369
    .line 370
    move-result-object v5

    .line 371
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    const-string v3, "osBuildFingerprint"

    .line 375
    .line 376
    new-instance v4, Lhc/c;

    .line 377
    .line 378
    invoke-direct {v4, v3}, Lhc/c;-><init>(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    new-instance v5, Lzb/a$q;

    .line 382
    .line 383
    invoke-direct {v5}, Lzb/a$q;-><init>()V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v4, v5}, Lhc/c;->b(Lie/a;)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v2}, Lhc/f;->l()Ljava/util/Map;

    .line 390
    .line 391
    .line 392
    move-result-object v5

    .line 393
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    const-string v3, "platformApiLevel"

    .line 397
    .line 398
    new-instance v4, Lhc/c;

    .line 399
    .line 400
    invoke-direct {v4, v3}, Lhc/c;-><init>(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    new-instance v5, Lzb/a$r;

    .line 404
    .line 405
    invoke-direct {v5}, Lzb/a$r;-><init>()V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v4, v5}, Lhc/c;->b(Lie/a;)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v2}, Lhc/f;->l()Ljava/util/Map;

    .line 412
    .line 413
    .line 414
    move-result-object v5

    .line 415
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    const-string v3, "deviceName"

    .line 419
    .line 420
    new-instance v4, Lhc/c;

    .line 421
    .line 422
    invoke-direct {v4, v3}, Lhc/c;-><init>(Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    new-instance v5, Lzb/a$s;

    .line 426
    .line 427
    invoke-direct {v5, p0}, Lzb/a$s;-><init>(Lzb/a;)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v4, v5}, Lhc/c;->b(Lie/a;)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v2}, Lhc/f;->l()Ljava/util/Map;

    .line 434
    .line 435
    .line 436
    move-result-object v5

    .line 437
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    const-string v3, "getDeviceTypeAsync"

    .line 441
    .line 442
    const/4 v4, 0x0

    .line 443
    new-array v5, v4, [Lpc/b;

    .line 444
    .line 445
    new-instance v6, Lzb/a$c;

    .line 446
    .line 447
    invoke-direct {v6, p0}, Lzb/a$c;-><init>(Lzb/a;)V

    .line 448
    .line 449
    .line 450
    const-class v7, Ljava/lang/Integer;

    .line 451
    .line 452
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 453
    .line 454
    invoke-static {v7, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 458
    sget-object v10, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 459
    .line 460
    sget-object v11, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 461
    .line 462
    sget-object v12, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 463
    .line 464
    const-class v13, Ljava/lang/String;

    .line 465
    .line 466
    if-eqz v9, :cond_0

    .line 467
    .line 468
    :try_start_1
    new-instance v7, Ldc/l;

    .line 469
    .line 470
    invoke-direct {v7, v3, v5, v6}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 471
    .line 472
    .line 473
    goto :goto_0

    .line 474
    :catchall_0
    move-exception v0

    .line 475
    goto/16 :goto_7

    .line 476
    .line 477
    :cond_0
    invoke-static {v7, v12}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 478
    .line 479
    .line 480
    move-result v9

    .line 481
    if-eqz v9, :cond_1

    .line 482
    .line 483
    new-instance v7, Ldc/h;

    .line 484
    .line 485
    invoke-direct {v7, v3, v5, v6}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 486
    .line 487
    .line 488
    goto :goto_0

    .line 489
    :cond_1
    invoke-static {v7, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    move-result v9

    .line 493
    if-eqz v9, :cond_2

    .line 494
    .line 495
    new-instance v7, Ldc/i;

    .line 496
    .line 497
    invoke-direct {v7, v3, v5, v6}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 498
    .line 499
    .line 500
    goto :goto_0

    .line 501
    :cond_2
    invoke-static {v7, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 502
    .line 503
    .line 504
    move-result v9

    .line 505
    if-eqz v9, :cond_3

    .line 506
    .line 507
    new-instance v7, Ldc/j;

    .line 508
    .line 509
    invoke-direct {v7, v3, v5, v6}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 510
    .line 511
    .line 512
    goto :goto_0

    .line 513
    :cond_3
    invoke-static {v7, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 514
    .line 515
    .line 516
    move-result v7

    .line 517
    if-eqz v7, :cond_4

    .line 518
    .line 519
    new-instance v7, Ldc/n;

    .line 520
    .line 521
    invoke-direct {v7, v3, v5, v6}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 522
    .line 523
    .line 524
    goto :goto_0

    .line 525
    :cond_4
    new-instance v7, Ldc/s;

    .line 526
    .line 527
    invoke-direct {v7, v3, v5, v6}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 528
    .line 529
    .line 530
    :goto_0
    invoke-virtual {v2}, Lhc/f;->k()Ljava/util/Map;

    .line 531
    .line 532
    .line 533
    move-result-object v5

    .line 534
    invoke-interface {v5, v3, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    const-string v3, "getUptimeAsync"

    .line 538
    .line 539
    new-array v5, v4, [Lpc/b;

    .line 540
    .line 541
    new-instance v6, Lzb/a$d;

    .line 542
    .line 543
    invoke-direct {v6}, Lzb/a$d;-><init>()V

    .line 544
    .line 545
    .line 546
    invoke-static {v0, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 547
    .line 548
    .line 549
    move-result v7

    .line 550
    if-eqz v7, :cond_5

    .line 551
    .line 552
    new-instance v7, Ldc/l;

    .line 553
    .line 554
    invoke-direct {v7, v3, v5, v6}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 555
    .line 556
    .line 557
    goto :goto_1

    .line 558
    :cond_5
    invoke-static {v0, v12}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    move-result v7

    .line 562
    if-eqz v7, :cond_6

    .line 563
    .line 564
    new-instance v7, Ldc/h;

    .line 565
    .line 566
    invoke-direct {v7, v3, v5, v6}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 567
    .line 568
    .line 569
    goto :goto_1

    .line 570
    :cond_6
    invoke-static {v0, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 571
    .line 572
    .line 573
    move-result v7

    .line 574
    if-eqz v7, :cond_7

    .line 575
    .line 576
    new-instance v7, Ldc/i;

    .line 577
    .line 578
    invoke-direct {v7, v3, v5, v6}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 579
    .line 580
    .line 581
    goto :goto_1

    .line 582
    :cond_7
    invoke-static {v0, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 583
    .line 584
    .line 585
    move-result v7

    .line 586
    if-eqz v7, :cond_8

    .line 587
    .line 588
    new-instance v7, Ldc/j;

    .line 589
    .line 590
    invoke-direct {v7, v3, v5, v6}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 591
    .line 592
    .line 593
    goto :goto_1

    .line 594
    :cond_8
    invoke-static {v0, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 595
    .line 596
    .line 597
    move-result v7

    .line 598
    if-eqz v7, :cond_9

    .line 599
    .line 600
    new-instance v7, Ldc/n;

    .line 601
    .line 602
    invoke-direct {v7, v3, v5, v6}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 603
    .line 604
    .line 605
    goto :goto_1

    .line 606
    :cond_9
    new-instance v7, Ldc/s;

    .line 607
    .line 608
    invoke-direct {v7, v3, v5, v6}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 609
    .line 610
    .line 611
    :goto_1
    invoke-virtual {v2}, Lhc/f;->k()Ljava/util/Map;

    .line 612
    .line 613
    .line 614
    move-result-object v5

    .line 615
    invoke-interface {v5, v3, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    const-string v3, "getMaxMemoryAsync"

    .line 619
    .line 620
    new-array v5, v4, [Lpc/b;

    .line 621
    .line 622
    new-instance v6, Lzb/a$e;

    .line 623
    .line 624
    invoke-direct {v6}, Lzb/a$e;-><init>()V

    .line 625
    .line 626
    .line 627
    invoke-static {v0, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 628
    .line 629
    .line 630
    move-result v7

    .line 631
    if-eqz v7, :cond_a

    .line 632
    .line 633
    new-instance v0, Ldc/l;

    .line 634
    .line 635
    invoke-direct {v0, v3, v5, v6}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 636
    .line 637
    .line 638
    goto :goto_2

    .line 639
    :cond_a
    invoke-static {v0, v12}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 640
    .line 641
    .line 642
    move-result v7

    .line 643
    if-eqz v7, :cond_b

    .line 644
    .line 645
    new-instance v0, Ldc/h;

    .line 646
    .line 647
    invoke-direct {v0, v3, v5, v6}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 648
    .line 649
    .line 650
    goto :goto_2

    .line 651
    :cond_b
    invoke-static {v0, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 652
    .line 653
    .line 654
    move-result v7

    .line 655
    if-eqz v7, :cond_c

    .line 656
    .line 657
    new-instance v0, Ldc/i;

    .line 658
    .line 659
    invoke-direct {v0, v3, v5, v6}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 660
    .line 661
    .line 662
    goto :goto_2

    .line 663
    :cond_c
    invoke-static {v0, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 664
    .line 665
    .line 666
    move-result v7

    .line 667
    if-eqz v7, :cond_d

    .line 668
    .line 669
    new-instance v0, Ldc/j;

    .line 670
    .line 671
    invoke-direct {v0, v3, v5, v6}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 672
    .line 673
    .line 674
    goto :goto_2

    .line 675
    :cond_d
    invoke-static {v0, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 676
    .line 677
    .line 678
    move-result v0

    .line 679
    if-eqz v0, :cond_e

    .line 680
    .line 681
    new-instance v0, Ldc/n;

    .line 682
    .line 683
    invoke-direct {v0, v3, v5, v6}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 684
    .line 685
    .line 686
    goto :goto_2

    .line 687
    :cond_e
    new-instance v0, Ldc/s;

    .line 688
    .line 689
    invoke-direct {v0, v3, v5, v6}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 690
    .line 691
    .line 692
    :goto_2
    invoke-virtual {v2}, Lhc/f;->k()Ljava/util/Map;

    .line 693
    .line 694
    .line 695
    move-result-object v5

    .line 696
    invoke-interface {v5, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    const-string v0, "isRootedExperimentalAsync"

    .line 700
    .line 701
    new-array v3, v4, [Lpc/b;

    .line 702
    .line 703
    new-instance v5, Lzb/a$f;

    .line 704
    .line 705
    invoke-direct {v5}, Lzb/a$f;-><init>()V

    .line 706
    .line 707
    .line 708
    invoke-static {v1, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 709
    .line 710
    .line 711
    move-result v6

    .line 712
    if-eqz v6, :cond_f

    .line 713
    .line 714
    new-instance v6, Ldc/l;

    .line 715
    .line 716
    invoke-direct {v6, v0, v3, v5}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 717
    .line 718
    .line 719
    goto :goto_3

    .line 720
    :cond_f
    invoke-static {v1, v12}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 721
    .line 722
    .line 723
    move-result v6

    .line 724
    if-eqz v6, :cond_10

    .line 725
    .line 726
    new-instance v6, Ldc/h;

    .line 727
    .line 728
    invoke-direct {v6, v0, v3, v5}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 729
    .line 730
    .line 731
    goto :goto_3

    .line 732
    :cond_10
    invoke-static {v1, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 733
    .line 734
    .line 735
    move-result v6

    .line 736
    if-eqz v6, :cond_11

    .line 737
    .line 738
    new-instance v6, Ldc/i;

    .line 739
    .line 740
    invoke-direct {v6, v0, v3, v5}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 741
    .line 742
    .line 743
    goto :goto_3

    .line 744
    :cond_11
    invoke-static {v1, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 745
    .line 746
    .line 747
    move-result v6

    .line 748
    if-eqz v6, :cond_12

    .line 749
    .line 750
    new-instance v6, Ldc/j;

    .line 751
    .line 752
    invoke-direct {v6, v0, v3, v5}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 753
    .line 754
    .line 755
    goto :goto_3

    .line 756
    :cond_12
    invoke-static {v1, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 757
    .line 758
    .line 759
    move-result v6

    .line 760
    if-eqz v6, :cond_13

    .line 761
    .line 762
    new-instance v6, Ldc/n;

    .line 763
    .line 764
    invoke-direct {v6, v0, v3, v5}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 765
    .line 766
    .line 767
    goto :goto_3

    .line 768
    :cond_13
    new-instance v6, Ldc/s;

    .line 769
    .line 770
    invoke-direct {v6, v0, v3, v5}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 771
    .line 772
    .line 773
    :goto_3
    invoke-virtual {v2}, Lhc/f;->k()Ljava/util/Map;

    .line 774
    .line 775
    .line 776
    move-result-object v3

    .line 777
    invoke-interface {v3, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 778
    .line 779
    .line 780
    const-string v0, "isSideLoadingEnabledAsync"

    .line 781
    .line 782
    new-array v3, v4, [Lpc/b;

    .line 783
    .line 784
    new-instance v5, Lzb/a$g;

    .line 785
    .line 786
    invoke-direct {v5, p0}, Lzb/a$g;-><init>(Lzb/a;)V

    .line 787
    .line 788
    .line 789
    invoke-static {v1, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 790
    .line 791
    .line 792
    move-result v6

    .line 793
    if-eqz v6, :cond_14

    .line 794
    .line 795
    new-instance v6, Ldc/l;

    .line 796
    .line 797
    invoke-direct {v6, v0, v3, v5}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 798
    .line 799
    .line 800
    goto :goto_4

    .line 801
    :cond_14
    invoke-static {v1, v12}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 802
    .line 803
    .line 804
    move-result v6

    .line 805
    if-eqz v6, :cond_15

    .line 806
    .line 807
    new-instance v6, Ldc/h;

    .line 808
    .line 809
    invoke-direct {v6, v0, v3, v5}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 810
    .line 811
    .line 812
    goto :goto_4

    .line 813
    :cond_15
    invoke-static {v1, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 814
    .line 815
    .line 816
    move-result v6

    .line 817
    if-eqz v6, :cond_16

    .line 818
    .line 819
    new-instance v6, Ldc/i;

    .line 820
    .line 821
    invoke-direct {v6, v0, v3, v5}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 822
    .line 823
    .line 824
    goto :goto_4

    .line 825
    :cond_16
    invoke-static {v1, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 826
    .line 827
    .line 828
    move-result v6

    .line 829
    if-eqz v6, :cond_17

    .line 830
    .line 831
    new-instance v6, Ldc/j;

    .line 832
    .line 833
    invoke-direct {v6, v0, v3, v5}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 834
    .line 835
    .line 836
    goto :goto_4

    .line 837
    :cond_17
    invoke-static {v1, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 838
    .line 839
    .line 840
    move-result v6

    .line 841
    if-eqz v6, :cond_18

    .line 842
    .line 843
    new-instance v6, Ldc/n;

    .line 844
    .line 845
    invoke-direct {v6, v0, v3, v5}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 846
    .line 847
    .line 848
    goto :goto_4

    .line 849
    :cond_18
    new-instance v6, Ldc/s;

    .line 850
    .line 851
    invoke-direct {v6, v0, v3, v5}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 852
    .line 853
    .line 854
    :goto_4
    invoke-virtual {v2}, Lhc/f;->k()Ljava/util/Map;

    .line 855
    .line 856
    .line 857
    move-result-object v3

    .line 858
    invoke-interface {v3, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 859
    .line 860
    .line 861
    const-string v0, "getPlatformFeaturesAsync"

    .line 862
    .line 863
    new-array v3, v4, [Lpc/b;

    .line 864
    .line 865
    new-instance v5, Lzb/a$h;

    .line 866
    .line 867
    invoke-direct {v5, p0}, Lzb/a$h;-><init>(Lzb/a;)V

    .line 868
    .line 869
    .line 870
    const-class v6, Ljava/util/List;

    .line 871
    .line 872
    invoke-static {v6, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 873
    .line 874
    .line 875
    move-result v7

    .line 876
    if-eqz v7, :cond_19

    .line 877
    .line 878
    new-instance v6, Ldc/l;

    .line 879
    .line 880
    invoke-direct {v6, v0, v3, v5}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 881
    .line 882
    .line 883
    goto :goto_5

    .line 884
    :cond_19
    invoke-static {v6, v12}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 885
    .line 886
    .line 887
    move-result v7

    .line 888
    if-eqz v7, :cond_1a

    .line 889
    .line 890
    new-instance v6, Ldc/h;

    .line 891
    .line 892
    invoke-direct {v6, v0, v3, v5}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 893
    .line 894
    .line 895
    goto :goto_5

    .line 896
    :cond_1a
    invoke-static {v6, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 897
    .line 898
    .line 899
    move-result v7

    .line 900
    if-eqz v7, :cond_1b

    .line 901
    .line 902
    new-instance v6, Ldc/i;

    .line 903
    .line 904
    invoke-direct {v6, v0, v3, v5}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 905
    .line 906
    .line 907
    goto :goto_5

    .line 908
    :cond_1b
    invoke-static {v6, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 909
    .line 910
    .line 911
    move-result v7

    .line 912
    if-eqz v7, :cond_1c

    .line 913
    .line 914
    new-instance v6, Ldc/j;

    .line 915
    .line 916
    invoke-direct {v6, v0, v3, v5}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 917
    .line 918
    .line 919
    goto :goto_5

    .line 920
    :cond_1c
    invoke-static {v6, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 921
    .line 922
    .line 923
    move-result v6

    .line 924
    if-eqz v6, :cond_1d

    .line 925
    .line 926
    new-instance v6, Ldc/n;

    .line 927
    .line 928
    invoke-direct {v6, v0, v3, v5}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 929
    .line 930
    .line 931
    goto :goto_5

    .line 932
    :cond_1d
    new-instance v6, Ldc/s;

    .line 933
    .line 934
    invoke-direct {v6, v0, v3, v5}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 935
    .line 936
    .line 937
    :goto_5
    invoke-virtual {v2}, Lhc/f;->k()Ljava/util/Map;

    .line 938
    .line 939
    .line 940
    move-result-object v3

    .line 941
    invoke-interface {v3, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 942
    .line 943
    .line 944
    const-string v0, "hasPlatformFeatureAsync"

    .line 945
    .line 946
    const-class v3, LUb/u;

    .line 947
    .line 948
    invoke-static {v13, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 949
    .line 950
    .line 951
    move-result v3

    .line 952
    if-eqz v3, :cond_1e

    .line 953
    .line 954
    new-instance v1, Ldc/f;

    .line 955
    .line 956
    new-array v3, v4, [Lpc/b;

    .line 957
    .line 958
    new-instance v4, Lzb/a$i;

    .line 959
    .line 960
    invoke-direct {v4, p0}, Lzb/a$i;-><init>(Lzb/a;)V

    .line 961
    .line 962
    .line 963
    invoke-direct {v1, v0, v3, v4}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 964
    .line 965
    .line 966
    goto/16 :goto_6

    .line 967
    .line 968
    :cond_1e
    invoke-virtual {v2}, Lhc/f;->m()Lpc/X;

    .line 969
    .line 970
    .line 971
    move-result-object v3

    .line 972
    sget-object v5, Lpc/d;->a:Lpc/d;

    .line 973
    .line 974
    new-instance v6, Lkotlin/Pair;

    .line 975
    .line 976
    invoke-static {v13}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 977
    .line 978
    .line 979
    move-result-object v7

    .line 980
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 981
    .line 982
    invoke-direct {v6, v7, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 983
    .line 984
    .line 985
    invoke-virtual {v5}, Lpc/d;->a()Ljava/util/Map;

    .line 986
    .line 987
    .line 988
    move-result-object v5

    .line 989
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 990
    .line 991
    .line 992
    move-result-object v5

    .line 993
    check-cast v5, Lpc/b;

    .line 994
    .line 995
    if-nez v5, :cond_1f

    .line 996
    .line 997
    sget-object v5, Lzb/a$j;->a:Lzb/a$j;

    .line 998
    .line 999
    new-instance v6, Lpc/b;

    .line 1000
    .line 1001
    new-instance v7, Lpc/M;

    .line 1002
    .line 1003
    invoke-static {v13}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v9

    .line 1007
    invoke-direct {v7, v9, v4, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 1008
    .line 1009
    .line 1010
    invoke-direct {v6, v7, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 1011
    .line 1012
    .line 1013
    move-object v5, v6

    .line 1014
    :cond_1f
    filled-new-array {v5}, [Lpc/b;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v3

    .line 1018
    new-instance v4, Lzb/a$k;

    .line 1019
    .line 1020
    invoke-direct {v4, p0}, Lzb/a$k;-><init>(Lzb/a;)V

    .line 1021
    .line 1022
    .line 1023
    invoke-static {v1, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1024
    .line 1025
    .line 1026
    move-result v5

    .line 1027
    if-eqz v5, :cond_20

    .line 1028
    .line 1029
    new-instance v1, Ldc/l;

    .line 1030
    .line 1031
    invoke-direct {v1, v0, v3, v4}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 1032
    .line 1033
    .line 1034
    goto :goto_6

    .line 1035
    :cond_20
    invoke-static {v1, v12}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1036
    .line 1037
    .line 1038
    move-result v5

    .line 1039
    if-eqz v5, :cond_21

    .line 1040
    .line 1041
    new-instance v1, Ldc/h;

    .line 1042
    .line 1043
    invoke-direct {v1, v0, v3, v4}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 1044
    .line 1045
    .line 1046
    goto :goto_6

    .line 1047
    :cond_21
    invoke-static {v1, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1048
    .line 1049
    .line 1050
    move-result v5

    .line 1051
    if-eqz v5, :cond_22

    .line 1052
    .line 1053
    new-instance v1, Ldc/i;

    .line 1054
    .line 1055
    invoke-direct {v1, v0, v3, v4}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 1056
    .line 1057
    .line 1058
    goto :goto_6

    .line 1059
    :cond_22
    invoke-static {v1, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1060
    .line 1061
    .line 1062
    move-result v5

    .line 1063
    if-eqz v5, :cond_23

    .line 1064
    .line 1065
    new-instance v1, Ldc/j;

    .line 1066
    .line 1067
    invoke-direct {v1, v0, v3, v4}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 1068
    .line 1069
    .line 1070
    goto :goto_6

    .line 1071
    :cond_23
    invoke-static {v1, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1072
    .line 1073
    .line 1074
    move-result v1

    .line 1075
    if-eqz v1, :cond_24

    .line 1076
    .line 1077
    new-instance v1, Ldc/n;

    .line 1078
    .line 1079
    invoke-direct {v1, v0, v3, v4}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 1080
    .line 1081
    .line 1082
    goto :goto_6

    .line 1083
    :cond_24
    new-instance v1, Ldc/s;

    .line 1084
    .line 1085
    invoke-direct {v1, v0, v3, v4}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 1086
    .line 1087
    .line 1088
    :goto_6
    invoke-virtual {v2}, Lhc/f;->k()Ljava/util/Map;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v3

    .line 1092
    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1093
    .line 1094
    .line 1095
    invoke-virtual {v2}, Lgc/a;->u()Lgc/e;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1099
    invoke-static {}, LX3/a;->f()V

    .line 1100
    .line 1101
    .line 1102
    return-object v0

    .line 1103
    :goto_7
    invoke-static {}, LX3/a;->f()V

    .line 1104
    .line 1105
    .line 1106
    throw v0
.end method
