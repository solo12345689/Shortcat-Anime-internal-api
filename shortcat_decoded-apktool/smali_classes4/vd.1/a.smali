.class public final Lvd/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lvd/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvd/a$a;
    }
.end annotation


# static fields
.field public static final p:Lvd/a$a;

.field private static final q:Ljava/lang/String;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lexpo/modules/updates/d;

.field private final c:Ljava/io/File;

.field private final d:Lwd/g;

.field private final e:LBd/h;

.field private final f:Lxd/g;

.field private final g:LGf/O;

.field private final h:Z

.field private final i:Lwd/j;

.field private j:Lrd/d;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Ljava/util/Map;

.field private n:Ljava/lang/Exception;

.field private o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lvd/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lvd/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lvd/a;->p:Lvd/a$a;

    .line 8
    .line 9
    const-class v0, Lvd/a;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lvd/a;->q:Ljava/lang/String;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lexpo/modules/updates/d;Ljava/io/File;Lwd/g;LBd/h;Lxd/g;LGf/O;Z)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatesDirectory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileDownloader"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectionPolicy"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lvd/a;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lvd/a;->b:Lexpo/modules/updates/d;

    .line 4
    iput-object p3, p0, Lvd/a;->c:Ljava/io/File;

    .line 5
    iput-object p4, p0, Lvd/a;->d:Lwd/g;

    .line 6
    iput-object p5, p0, Lvd/a;->e:LBd/h;

    .line 7
    iput-object p6, p0, Lvd/a;->f:Lxd/g;

    .line 8
    iput-object p7, p0, Lvd/a;->g:LGf/O;

    .line 9
    iput-boolean p8, p0, Lvd/a;->h:Z

    .line 10
    new-instance p1, Lwd/j;

    invoke-direct {p1}, Lwd/j;-><init>()V

    iput-object p1, p0, Lvd/a;->i:Lwd/j;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lexpo/modules/updates/d;Ljava/io/File;Lwd/g;LBd/h;Lxd/g;LGf/O;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    move/from16 v0, p9

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move v9, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    goto :goto_1

    :cond_0
    move/from16 v9, p8

    goto :goto_0

    .line 11
    :goto_1
    invoke-direct/range {v1 .. v9}, Lvd/a;-><init>(Landroid/content/Context;Lexpo/modules/updates/d;Ljava/io/File;Lwd/g;LBd/h;Lxd/g;LGf/O;Z)V

    return-void
.end method

.method private final f()Ljava/util/Map;
    .locals 13

    .line 1
    sget-object v0, Lyd/a;->a:Lyd/a;

    .line 2
    .line 3
    iget-object v1, p0, Lvd/a;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, p0, Lvd/a;->b:Lexpo/modules/updates/d;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lyd/a;->b(Landroid/content/Context;Lexpo/modules/updates/d;)Lyd/d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lyd/d;->a()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    :cond_0
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :cond_1
    iget-object v1, p0, Lvd/a;->f:Lxd/g;

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    new-instance v3, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v4, "embeddedAssetFileMap: embeddedAssets count = "

    .line 35
    .line 36
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    const/4 v3, 0x0

    .line 47
    const/4 v4, 0x2

    .line 48
    invoke-static {v1, v2, v3, v4, v3}, Lxd/g;->k(Lxd/g;Ljava/lang/String;Lxd/b;ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 52
    .line 53
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_7

    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Lrd/a;

    .line 71
    .line 72
    invoke-virtual {v2}, Lrd/a;->t()Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-eqz v5, :cond_2

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    iget-boolean v5, p0, Lvd/a;->h:Z

    .line 80
    .line 81
    const-string v6, "embeddedAssetFileMap: no file for "

    .line 82
    .line 83
    const-string v7, "Missing embedded asset"

    .line 84
    .line 85
    const-string v8, " => "

    .line 86
    .line 87
    const-string v9, "embeddedAssetFileMap: "

    .line 88
    .line 89
    const-string v10, ","

    .line 90
    .line 91
    if-nez v5, :cond_4

    .line 92
    .line 93
    sget-object v5, LDd/a;->a:LDd/a;

    .line 94
    .line 95
    invoke-virtual {v5, v2}, LDd/a;->a(Lrd/a;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    if-eqz v5, :cond_3

    .line 100
    .line 101
    invoke-virtual {v2, v5}, Lrd/a;->F(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v1, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    iget-object v5, p0, Lvd/a;->f:Lxd/g;

    .line 108
    .line 109
    invoke-virtual {v2}, Lrd/a;->j()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    invoke-virtual {v2}, Lrd/a;->r()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    new-instance v11, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-static {v5, v2, v3, v4, v3}, Lxd/g;->k(Lxd/g;Ljava/lang/String;Lxd/b;ILjava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_3
    new-instance v5, Ljava/lang/Exception;

    .line 153
    .line 154
    invoke-direct {v5, v7}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    iget-object v7, p0, Lvd/a;->f:Lxd/g;

    .line 158
    .line 159
    invoke-virtual {v2}, Lrd/a;->j()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    invoke-virtual {v2}, Lrd/a;->r()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    new-instance v9, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    sget-object v6, Lxd/b;->i:Lxd/b;

    .line 189
    .line 190
    invoke-virtual {v7, v2, v5, v6}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V

    .line 191
    .line 192
    .line 193
    goto/16 :goto_0

    .line 194
    .line 195
    :cond_4
    sget-object v5, Lexpo/modules/updates/g;->a:Lexpo/modules/updates/g;

    .line 196
    .line 197
    invoke-virtual {v5, v2}, Lexpo/modules/updates/g;->c(Lrd/a;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    invoke-virtual {v2, v5}, Lrd/a;->F(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    new-instance v11, Ljava/io/File;

    .line 205
    .line 206
    iget-object v12, p0, Lvd/a;->c:Ljava/io/File;

    .line 207
    .line 208
    invoke-direct {v11, v12, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    if-nez v5, :cond_5

    .line 216
    .line 217
    iget-object v5, p0, Lvd/a;->i:Lwd/j;

    .line 218
    .line 219
    iget-object v12, p0, Lvd/a;->a:Landroid/content/Context;

    .line 220
    .line 221
    invoke-virtual {v5, v2, v11, v12}, Lwd/j;->a(Lrd/a;Ljava/io/File;Landroid/content/Context;)[B

    .line 222
    .line 223
    .line 224
    :cond_5
    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    .line 225
    .line 226
    .line 227
    move-result v5

    .line 228
    if-eqz v5, :cond_6

    .line 229
    .line 230
    invoke-static {v11}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    invoke-virtual {v5}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    invoke-interface {v1, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    iget-object v5, p0, Lvd/a;->f:Lxd/g;

    .line 242
    .line 243
    invoke-virtual {v2}, Lrd/a;->j()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v6

    .line 247
    invoke-virtual {v2}, Lrd/a;->r()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v7

    .line 251
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    new-instance v11, Ljava/lang/StringBuilder;

    .line 256
    .line 257
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    invoke-static {v5, v2, v3, v4, v3}, Lxd/g;->k(Lxd/g;Ljava/lang/String;Lxd/b;ILjava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    goto/16 :goto_0

    .line 286
    .line 287
    :cond_6
    new-instance v5, Ljava/lang/Exception;

    .line 288
    .line 289
    invoke-direct {v5, v7}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    iget-object v7, p0, Lvd/a;->f:Lxd/g;

    .line 293
    .line 294
    invoke-virtual {v2}, Lrd/a;->j()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v8

    .line 298
    invoke-virtual {v2}, Lrd/a;->r()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    new-instance v9, Ljava/lang/StringBuilder;

    .line 303
    .line 304
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    sget-object v6, Lxd/b;->i:Lxd/b;

    .line 324
    .line 325
    invoke-virtual {v7, v2, v5, v6}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V

    .line 326
    .line 327
    .line 328
    goto/16 :goto_0

    .line 329
    .line 330
    :cond_7
    return-object v1
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lvd/a;->m:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lvd/a;->k:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lvd/a;->l:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Lrd/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lvd/a;->j:Lrd/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lvd/a;->a()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

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

.method public final g(Lrd/a;Lexpo/modules/updates/db/UpdatesDatabase;Lyd/d;Lorg/json/JSONObject;LZd/e;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    instance-of v1, v0, Lvd/a$b;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lvd/a$b;

    .line 9
    .line 10
    iget v2, v1, Lvd/a$b;->e:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lvd/a$b;->e:I

    .line 20
    .line 21
    :goto_0
    move-object v9, v1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v1, Lvd/a$b;

    .line 24
    .line 25
    invoke-direct {v1, p0, v0}, Lvd/a$b;-><init>(Lvd/a;LZd/e;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iget-object v0, v9, Lvd/a$b;->c:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iget v2, v9, Lvd/a$b;->e:I

    .line 36
    .line 37
    const/4 v12, 0x0

    .line 38
    const/4 v3, 0x1

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    if-ne v2, v3, :cond_1

    .line 42
    .line 43
    iget-object p1, v9, Lvd/a$b;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lexpo/modules/updates/db/UpdatesDatabase;

    .line 46
    .line 47
    iget-object v1, v9, Lvd/a$b;->a:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Lrd/a;

    .line 50
    .line 51
    :try_start_0
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    move-object v13, p1

    .line 55
    move-object p1, v1

    .line 56
    goto/16 :goto_5

    .line 57
    .line 58
    :catch_0
    move-exception v0

    .line 59
    :goto_2
    move-object p1, v0

    .line 60
    goto/16 :goto_6

    .line 61
    .line 62
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p1

    .line 70
    :cond_2
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    new-instance v2, Ljava/io/File;

    .line 74
    .line 75
    iget-object v0, p0, Lvd/a;->c:Ljava/io/File;

    .line 76
    .line 77
    invoke-virtual {p1}, Lrd/a;->m()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    if-nez v4, :cond_3

    .line 82
    .line 83
    const-string v4, ""

    .line 84
    .line 85
    :cond_3
    invoke-direct {v2, v0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-nez v4, :cond_6

    .line 93
    .line 94
    if-eqz p3, :cond_6

    .line 95
    .line 96
    invoke-virtual/range {p3 .. p3}, Lyd/d;->a()Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    if-eqz v5, :cond_5

    .line 109
    .line 110
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    check-cast v5, Lrd/a;

    .line 115
    .line 116
    invoke-virtual {v5}, Lrd/a;->j()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    if-eqz v6, :cond_4

    .line 121
    .line 122
    invoke-virtual {v5}, Lrd/a;->j()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    invoke-virtual {p1}, Lrd/a;->j()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    if-eqz v6, :cond_4

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_5
    move-object v5, v12

    .line 138
    :goto_3
    if-eqz v5, :cond_6

    .line 139
    .line 140
    :try_start_1
    iget-object v0, p0, Lvd/a;->i:Lwd/j;

    .line 141
    .line 142
    iget-object v6, p0, Lvd/a;->a:Landroid/content/Context;

    .line 143
    .line 144
    invoke-virtual {v0, v5, v2, v6}, Lwd/j;->a(Lrd/a;Ljava/io/File;Landroid/content/Context;)[B

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-virtual {p1}, Lrd/a;->f()[B

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    invoke-static {v0, v5}, Ljava/util/Arrays;->equals([B[B)Z

    .line 153
    .line 154
    .line 155
    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 156
    if-eqz v0, :cond_6

    .line 157
    .line 158
    move v4, v3

    .line 159
    goto :goto_4

    .line 160
    :catch_1
    move-exception v0

    .line 161
    iget-object v5, p0, Lvd/a;->f:Lxd/g;

    .line 162
    .line 163
    const-string v6, "Failed to copy matching embedded asset"

    .line 164
    .line 165
    sget-object v7, Lxd/b;->i:Lxd/b;

    .line 166
    .line 167
    invoke-virtual {v5, v6, v0, v7}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V

    .line 168
    .line 169
    .line 170
    :cond_6
    :goto_4
    if-nez v4, :cond_9

    .line 171
    .line 172
    :try_start_2
    iget-object v2, p0, Lvd/a;->d:Lwd/g;

    .line 173
    .line 174
    iget-object v4, p0, Lvd/a;->c:Ljava/io/File;

    .line 175
    .line 176
    invoke-virtual {p0}, Lvd/a;->d()Lrd/d;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    iput-object p1, v9, Lvd/a$b;->a:Ljava/lang/Object;

    .line 181
    .line 182
    move-object/from16 v13, p2

    .line 183
    .line 184
    iput-object v13, v9, Lvd/a$b;->b:Ljava/lang/Object;

    .line 185
    .line 186
    iput v3, v9, Lvd/a$b;->e:I

    .line 187
    .line 188
    const/4 v7, 0x0

    .line 189
    const/4 v8, 0x0

    .line 190
    const/16 v10, 0x20

    .line 191
    .line 192
    const/4 v11, 0x0

    .line 193
    move-object v3, p1

    .line 194
    move-object/from16 v5, p4

    .line 195
    .line 196
    invoke-static/range {v2 .. v11}, Lwd/g;->m(Lwd/g;Lrd/a;Ljava/io/File;Lorg/json/JSONObject;Lrd/d;Lrd/d;Lkotlin/jvm/functions/Function1;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    if-ne v0, v1, :cond_7

    .line 201
    .line 202
    return-object v1

    .line 203
    :cond_7
    :goto_5
    check-cast v0, Lwd/g$a;

    .line 204
    .line 205
    invoke-virtual {v13}, Lexpo/modules/updates/db/UpdatesDatabase;->O()Lqd/a;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-virtual {v0}, Lwd/g$a;->a()Lrd/a;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    invoke-virtual {v1, v2}, Lqd/a;->q(Lrd/a;)V

    .line 214
    .line 215
    .line 216
    new-instance v1, Ljava/io/File;

    .line 217
    .line 218
    iget-object v2, p0, Lvd/a;->c:Ljava/io/File;

    .line 219
    .line 220
    invoke-virtual {v0}, Lwd/g$a;->a()Lrd/a;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-virtual {v0}, Lrd/a;->m()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 235
    .line 236
    .line 237
    move-result p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 238
    if-eqz p1, :cond_8

    .line 239
    .line 240
    move-object v12, v1

    .line 241
    goto :goto_7

    .line 242
    :catch_2
    move-exception v0

    .line 243
    move-object v1, p1

    .line 244
    goto/16 :goto_2

    .line 245
    .line 246
    :goto_6
    iget-object v0, p0, Lvd/a;->f:Lxd/g;

    .line 247
    .line 248
    const-string v2, "Failed to load asset from disk or network"

    .line 249
    .line 250
    sget-object v3, Lxd/b;->i:Lxd/b;

    .line 251
    .line 252
    invoke-virtual {v0, v2, p1, v3}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v1}, Lrd/a;->t()Z

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    if-eqz v0, :cond_8

    .line 260
    .line 261
    iput-object p1, p0, Lvd/a;->n:Ljava/lang/Exception;

    .line 262
    .line 263
    :cond_8
    :goto_7
    move-object v2, v12

    .line 264
    :cond_9
    return-object v2
.end method

.method public final h(Lexpo/modules/updates/db/UpdatesDatabase;LZd/e;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p1}, Lexpo/modules/updates/db/UpdatesDatabase;->Q()Lqd/e;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object v0, p0, Lvd/a;->b:Lexpo/modules/updates/d;

    .line 6
    .line 7
    invoke-virtual {v0}, Lexpo/modules/updates/d;->s()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p2, v0}, Lqd/e;->m(Ljava/lang/String;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    sget-object v0, Lyd/a;->a:Lyd/a;

    .line 16
    .line 17
    iget-object v1, p0, Lvd/a;->a:Landroid/content/Context;

    .line 18
    .line 19
    iget-object v2, p0, Lvd/a;->b:Lexpo/modules/updates/d;

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Lyd/a;->c(Landroid/content/Context;Lexpo/modules/updates/d;)Lyd/d;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_4

    .line 39
    .line 40
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Lrd/d;

    .line 45
    .line 46
    invoke-virtual {v2}, Lrd/d;->m()Lsd/b;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    sget-object v4, Lsd/b;->c:Lsd/b;

    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    if-ne v3, v4, :cond_1

    .line 54
    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    invoke-virtual {v0}, Lyd/d;->c()Lrd/d;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    if-eqz v3, :cond_0

    .line 62
    .line 63
    invoke-virtual {v3}, Lrd/d;->d()Ljava/util/UUID;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    goto :goto_1

    .line 68
    :cond_0
    move-object v3, v5

    .line 69
    :goto_1
    invoke-virtual {v2}, Lrd/d;->d()Ljava/util/UUID;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-nez v3, :cond_1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    iget-object v3, p0, Lvd/a;->b:Lexpo/modules/updates/d;

    .line 81
    .line 82
    invoke-virtual {v3}, Lexpo/modules/updates/d;->j()Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-nez v3, :cond_3

    .line 87
    .line 88
    if-eqz v0, :cond_2

    .line 89
    .line 90
    invoke-virtual {v0}, Lyd/d;->c()Lrd/d;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    if-eqz v3, :cond_2

    .line 95
    .line 96
    invoke-virtual {v3}, Lrd/d;->d()Ljava/util/UUID;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    :cond_2
    invoke-virtual {v2}, Lrd/d;->d()Ljava/util/UUID;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-static {v5, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-eqz v3, :cond_3

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_3
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_4
    sget-object p2, Lyd/k;->a:Lyd/k;

    .line 116
    .line 117
    iget-object v0, p0, Lvd/a;->b:Lexpo/modules/updates/d;

    .line 118
    .line 119
    invoke-virtual {p2, p1, v0}, Lyd/k;->f(Lexpo/modules/updates/db/UpdatesDatabase;Lexpo/modules/updates/d;)Lorg/json/JSONObject;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    iget-object p2, p0, Lvd/a;->e:LBd/h;

    .line 124
    .line 125
    invoke-virtual {p2, v1, p1}, LBd/h;->a(Ljava/util/List;Lorg/json/JSONObject;)Lrd/d;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    return-object p1
.end method

.method public final i(Lexpo/modules/updates/db/UpdatesDatabase;LZd/e;)Ljava/lang/Object;
    .locals 22

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
    instance-of v3, v2, Lvd/a$c;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lvd/a$c;

    .line 13
    .line 14
    iget v4, v3, Lvd/a$c;->g:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lvd/a$c;->g:I

    .line 24
    .line 25
    :goto_0
    move-object v5, v3

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v3, Lvd/a$c;

    .line 28
    .line 29
    invoke-direct {v3, v0, v2}, Lvd/a$c;-><init>(Lvd/a;LZd/e;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v2, v5, Lvd/a$c;->e:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    iget v3, v5, Lvd/a$c;->g:I

    .line 40
    .line 41
    const/4 v8, 0x3

    .line 42
    const/4 v4, 0x2

    .line 43
    const/4 v6, 0x1

    .line 44
    const/4 v9, 0x0

    .line 45
    if-eqz v3, :cond_4

    .line 46
    .line 47
    if-eq v3, v6, :cond_3

    .line 48
    .line 49
    if-eq v3, v4, :cond_2

    .line 50
    .line 51
    if-ne v3, v8, :cond_1

    .line 52
    .line 53
    iget-object v1, v5, Lvd/a$c;->c:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Lvd/a;

    .line 56
    .line 57
    iget-object v3, v5, Lvd/a$c;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v3, Ljava/util/Map;

    .line 60
    .line 61
    iget-object v4, v5, Lvd/a$c;->a:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v4, Ljava/util/Map;

    .line 64
    .line 65
    invoke-static {v2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto/16 :goto_9

    .line 69
    .line 70
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 73
    .line 74
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw v1

    .line 78
    :cond_2
    iget-object v1, v5, Lvd/a$c;->d:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v1, Lorg/json/JSONObject;

    .line 81
    .line 82
    iget-object v3, v5, Lvd/a$c;->c:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v3, Lyd/d;

    .line 85
    .line 86
    iget-object v4, v5, Lvd/a$c;->b:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v4, Lrd/a;

    .line 89
    .line 90
    iget-object v6, v5, Lvd/a$c;->a:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v6, Lexpo/modules/updates/db/UpdatesDatabase;

    .line 93
    .line 94
    invoke-static {v2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    move-object v10, v4

    .line 98
    move-object v11, v5

    .line 99
    move-object v5, v1

    .line 100
    move-object v4, v3

    .line 101
    move-object v3, v6

    .line 102
    goto/16 :goto_6

    .line 103
    .line 104
    :cond_3
    iget-object v1, v5, Lvd/a$c;->b:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v1, Lvd/a;

    .line 107
    .line 108
    iget-object v3, v5, Lvd/a$c;->a:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v3, Lexpo/modules/updates/db/UpdatesDatabase;

    .line 111
    .line 112
    invoke-static {v2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    move-object/from16 v21, v3

    .line 116
    .line 117
    move-object v3, v2

    .line 118
    move-object/from16 v2, v21

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_4
    invoke-static {v2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    iget-boolean v2, v0, Lvd/a;->o:Z

    .line 125
    .line 126
    if-nez v2, :cond_19

    .line 127
    .line 128
    iput-boolean v6, v0, Lvd/a;->o:Z

    .line 129
    .line 130
    iput-object v1, v5, Lvd/a$c;->a:Ljava/lang/Object;

    .line 131
    .line 132
    iput-object v0, v5, Lvd/a$c;->b:Ljava/lang/Object;

    .line 133
    .line 134
    iput v6, v5, Lvd/a$c;->g:I

    .line 135
    .line 136
    invoke-virtual {v0, v1, v5}, Lvd/a;->h(Lexpo/modules/updates/db/UpdatesDatabase;LZd/e;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    if-ne v2, v7, :cond_5

    .line 141
    .line 142
    goto/16 :goto_8

    .line 143
    .line 144
    :cond_5
    move-object v3, v2

    .line 145
    move-object v2, v1

    .line 146
    move-object v1, v0

    .line 147
    :goto_2
    check-cast v3, Lrd/d;

    .line 148
    .line 149
    iput-object v3, v1, Lvd/a;->j:Lrd/d;

    .line 150
    .line 151
    invoke-virtual {v0}, Lvd/a;->d()Lrd/d;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    if-eqz v1, :cond_18

    .line 156
    .line 157
    invoke-virtual {v2}, Lexpo/modules/updates/db/UpdatesDatabase;->Q()Lqd/e;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-virtual {v0}, Lvd/a;->d()Lrd/d;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-static {v3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1, v3}, Lqd/e;->q(Lrd/d;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0}, Lvd/a;->d()Lrd/d;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1}, Lrd/d;->m()Lsd/b;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    sget-object v3, Lsd/b;->d:Lsd/b;

    .line 183
    .line 184
    if-ne v1, v3, :cond_6

    .line 185
    .line 186
    sget-object v1, LTd/L;->a:LTd/L;

    .line 187
    .line 188
    return-object v1

    .line 189
    :cond_6
    invoke-virtual {v2}, Lexpo/modules/updates/db/UpdatesDatabase;->Q()Lqd/e;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-virtual {v0}, Lvd/a;->d()Lrd/d;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    invoke-static {v3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v3}, Lrd/d;->d()Ljava/util/UUID;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    invoke-virtual {v1, v3}, Lqd/e;->j(Ljava/util/UUID;)Lrd/a;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    if-eqz v1, :cond_17

    .line 209
    .line 210
    invoke-virtual {v1}, Lrd/a;->m()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    if-eqz v3, :cond_16

    .line 215
    .line 216
    sget-object v3, Lyd/a;->a:Lyd/a;

    .line 217
    .line 218
    iget-object v6, v0, Lvd/a;->a:Landroid/content/Context;

    .line 219
    .line 220
    iget-object v10, v0, Lvd/a;->b:Lexpo/modules/updates/d;

    .line 221
    .line 222
    invoke-virtual {v3, v6, v10}, Lyd/a;->b(Landroid/content/Context;Lexpo/modules/updates/d;)Lyd/d;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    sget-object v6, Lwd/g;->h:Lwd/g$b;

    .line 227
    .line 228
    invoke-virtual {v0}, Lvd/a;->d()Lrd/d;

    .line 229
    .line 230
    .line 231
    move-result-object v10

    .line 232
    if-eqz v3, :cond_7

    .line 233
    .line 234
    invoke-virtual {v3}, Lyd/d;->c()Lrd/d;

    .line 235
    .line 236
    .line 237
    move-result-object v11

    .line 238
    goto :goto_3

    .line 239
    :cond_7
    move-object v11, v9

    .line 240
    :goto_3
    invoke-virtual {v6, v10, v11, v9}, Lwd/g$b;->a(Lrd/d;Lrd/d;Lrd/d;)Lorg/json/JSONObject;

    .line 241
    .line 242
    .line 243
    move-result-object v6

    .line 244
    iget-boolean v10, v0, Lvd/a;->h:Z

    .line 245
    .line 246
    if-nez v10, :cond_a

    .line 247
    .line 248
    if-eqz v3, :cond_a

    .line 249
    .line 250
    invoke-virtual {v3}, Lyd/d;->a()Ljava/util/List;

    .line 251
    .line 252
    .line 253
    move-result-object v10

    .line 254
    if-eqz v10, :cond_a

    .line 255
    .line 256
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 257
    .line 258
    .line 259
    move-result-object v10

    .line 260
    :cond_8
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 261
    .line 262
    .line 263
    move-result v11

    .line 264
    if-eqz v11, :cond_9

    .line 265
    .line 266
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v11

    .line 270
    move-object v12, v11

    .line 271
    check-cast v12, Lrd/a;

    .line 272
    .line 273
    invoke-virtual {v12}, Lrd/a;->j()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v12

    .line 277
    invoke-virtual {v1}, Lrd/a;->j()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v13

    .line 281
    invoke-static {v12, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v12

    .line 285
    if-eqz v12, :cond_8

    .line 286
    .line 287
    goto :goto_4

    .line 288
    :cond_9
    move-object v11, v9

    .line 289
    :goto_4
    check-cast v11, Lrd/a;

    .line 290
    .line 291
    if-eqz v11, :cond_a

    .line 292
    .line 293
    invoke-virtual {v11}, Lrd/a;->b()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v10

    .line 297
    if-eqz v10, :cond_a

    .line 298
    .line 299
    new-instance v11, Ljava/lang/StringBuilder;

    .line 300
    .line 301
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 302
    .line 303
    .line 304
    const-string v12, "assets://"

    .line 305
    .line 306
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v10

    .line 316
    goto :goto_5

    .line 317
    :cond_a
    move-object v10, v9

    .line 318
    :goto_5
    if-nez v10, :cond_c

    .line 319
    .line 320
    iput-object v2, v5, Lvd/a$c;->a:Ljava/lang/Object;

    .line 321
    .line 322
    iput-object v1, v5, Lvd/a$c;->b:Ljava/lang/Object;

    .line 323
    .line 324
    iput-object v3, v5, Lvd/a$c;->c:Ljava/lang/Object;

    .line 325
    .line 326
    iput-object v6, v5, Lvd/a$c;->d:Ljava/lang/Object;

    .line 327
    .line 328
    iput v4, v5, Lvd/a$c;->g:I

    .line 329
    .line 330
    move-object v4, v6

    .line 331
    invoke-virtual/range {v0 .. v5}, Lvd/a;->g(Lrd/a;Lexpo/modules/updates/db/UpdatesDatabase;Lyd/d;Lorg/json/JSONObject;LZd/e;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v6

    .line 335
    move-object v11, v5

    .line 336
    if-ne v6, v7, :cond_b

    .line 337
    .line 338
    goto/16 :goto_8

    .line 339
    .line 340
    :cond_b
    move-object v10, v1

    .line 341
    move-object v5, v4

    .line 342
    move-object v4, v3

    .line 343
    move-object v3, v2

    .line 344
    move-object v2, v6

    .line 345
    goto :goto_6

    .line 346
    :cond_c
    move-object v11, v5

    .line 347
    move-object v4, v6

    .line 348
    move-object v5, v4

    .line 349
    move-object v4, v3

    .line 350
    move-object v3, v2

    .line 351
    move-object v2, v10

    .line 352
    move-object v10, v1

    .line 353
    :goto_6
    if-eqz v2, :cond_14

    .line 354
    .line 355
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    iput-object v1, v0, Lvd/a;->k:Ljava/lang/String;

    .line 360
    .line 361
    invoke-virtual {v3}, Lexpo/modules/updates/db/UpdatesDatabase;->O()Lqd/a;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    invoke-virtual {v0}, Lvd/a;->d()Lrd/d;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v2}, Lrd/d;->d()Ljava/util/UUID;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    invoke-virtual {v1, v2}, Lqd/a;->i(Ljava/util/UUID;)Ljava/util/List;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    invoke-direct {v0}, Lvd/a;->f()Ljava/util/Map;

    .line 381
    .line 382
    .line 383
    move-result-object v12

    .line 384
    new-instance v13, Ljava/util/ArrayList;

    .line 385
    .line 386
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 387
    .line 388
    .line 389
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 390
    .line 391
    .line 392
    move-result-object v14

    .line 393
    :goto_7
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 394
    .line 395
    .line 396
    move-result v1

    .line 397
    if-eqz v1, :cond_10

    .line 398
    .line 399
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    move-object v2, v1

    .line 404
    check-cast v2, Lrd/a;

    .line 405
    .line 406
    invoke-virtual {v2}, Lrd/a;->i()J

    .line 407
    .line 408
    .line 409
    move-result-wide v15

    .line 410
    invoke-virtual {v10}, Lrd/a;->i()J

    .line 411
    .line 412
    .line 413
    move-result-wide v17

    .line 414
    cmp-long v1, v15, v17

    .line 415
    .line 416
    if-nez v1, :cond_d

    .line 417
    .line 418
    goto :goto_7

    .line 419
    :cond_d
    invoke-virtual {v2}, Lrd/a;->m()Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    if-nez v1, :cond_e

    .line 424
    .line 425
    goto :goto_7

    .line 426
    :cond_e
    sget-object v6, LDd/a;->a:LDd/a;

    .line 427
    .line 428
    invoke-virtual {v6, v1}, LDd/a;->e(Ljava/lang/String;)Z

    .line 429
    .line 430
    .line 431
    move-result v6

    .line 432
    if-nez v6, :cond_f

    .line 433
    .line 434
    iget-object v15, v0, Lvd/a;->g:LGf/O;

    .line 435
    .line 436
    new-instance v18, Lvd/a$d;

    .line 437
    .line 438
    const/4 v6, 0x0

    .line 439
    move-object v1, v0

    .line 440
    move-object/from16 v0, v18

    .line 441
    .line 442
    invoke-direct/range {v0 .. v6}, Lvd/a$d;-><init>(Lvd/a;Lrd/a;Lexpo/modules/updates/db/UpdatesDatabase;Lyd/d;Lorg/json/JSONObject;LZd/e;)V

    .line 443
    .line 444
    .line 445
    move-object v0, v1

    .line 446
    const/16 v19, 0x3

    .line 447
    .line 448
    const/16 v20, 0x0

    .line 449
    .line 450
    const/16 v16, 0x0

    .line 451
    .line 452
    const/16 v17, 0x0

    .line 453
    .line 454
    invoke-static/range {v15 .. v20}, LGf/i;->b(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/W;

    .line 455
    .line 456
    .line 457
    move-result-object v1

    .line 458
    invoke-interface {v13, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    move-result v1

    .line 462
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 463
    .line 464
    .line 465
    goto :goto_7

    .line 466
    :cond_f
    invoke-interface {v12, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    goto :goto_7

    .line 470
    :cond_10
    iput-object v12, v11, Lvd/a$c;->a:Ljava/lang/Object;

    .line 471
    .line 472
    iput-object v12, v11, Lvd/a$c;->b:Ljava/lang/Object;

    .line 473
    .line 474
    iput-object v0, v11, Lvd/a$c;->c:Ljava/lang/Object;

    .line 475
    .line 476
    iput-object v9, v11, Lvd/a$c;->d:Ljava/lang/Object;

    .line 477
    .line 478
    iput v8, v11, Lvd/a$c;->g:I

    .line 479
    .line 480
    invoke-static {v13, v11}, LGf/f;->a(Ljava/util/Collection;LZd/e;)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    if-ne v2, v7, :cond_11

    .line 485
    .line 486
    :goto_8
    return-object v7

    .line 487
    :cond_11
    move-object v1, v0

    .line 488
    move-object v3, v12

    .line 489
    move-object v4, v3

    .line 490
    :goto_9
    check-cast v2, Ljava/lang/Iterable;

    .line 491
    .line 492
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 493
    .line 494
    .line 495
    move-result-object v2

    .line 496
    :cond_12
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 497
    .line 498
    .line 499
    move-result v5

    .line 500
    if-eqz v5, :cond_13

    .line 501
    .line 502
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v5

    .line 506
    check-cast v5, Lkotlin/Pair;

    .line 507
    .line 508
    invoke-virtual {v5}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v6

    .line 512
    check-cast v6, Lrd/a;

    .line 513
    .line 514
    invoke-virtual {v5}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v5

    .line 518
    check-cast v5, Ljava/io/File;

    .line 519
    .line 520
    if-eqz v5, :cond_12

    .line 521
    .line 522
    invoke-static {v5}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 523
    .line 524
    .line 525
    move-result-object v5

    .line 526
    invoke-virtual {v5}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v5

    .line 530
    invoke-interface {v3, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    goto :goto_a

    .line 534
    :cond_13
    iput-object v4, v1, Lvd/a;->m:Ljava/util/Map;

    .line 535
    .line 536
    sget-object v1, LTd/L;->a:LTd/L;

    .line 537
    .line 538
    return-object v1

    .line 539
    :cond_14
    iget-object v1, v0, Lvd/a;->n:Ljava/lang/Exception;

    .line 540
    .line 541
    if-eqz v1, :cond_15

    .line 542
    .line 543
    goto :goto_b

    .line 544
    :cond_15
    new-instance v1, Ljava/lang/Exception;

    .line 545
    .line 546
    const-string v2, "Launch asset file was null after download attempt"

    .line 547
    .line 548
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 549
    .line 550
    .line 551
    :goto_b
    throw v1

    .line 552
    :cond_16
    new-instance v1, Ljava/lang/Exception;

    .line 553
    .line 554
    invoke-virtual {v0}, Lvd/a;->d()Lrd/d;

    .line 555
    .line 556
    .line 557
    move-result-object v2

    .line 558
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 559
    .line 560
    .line 561
    invoke-virtual {v2}, Lrd/d;->a()Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v2

    .line 565
    new-instance v3, Ljava/lang/StringBuilder;

    .line 566
    .line 567
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 568
    .line 569
    .line 570
    const-string v4, "Launch asset relative path should not be null. Debug info: "

    .line 571
    .line 572
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 576
    .line 577
    .line 578
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v2

    .line 582
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 583
    .line 584
    .line 585
    throw v1

    .line 586
    :cond_17
    new-instance v1, Ljava/lang/Exception;

    .line 587
    .line 588
    invoke-virtual {v0}, Lvd/a;->d()Lrd/d;

    .line 589
    .line 590
    .line 591
    move-result-object v2

    .line 592
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 593
    .line 594
    .line 595
    invoke-virtual {v2}, Lrd/d;->a()Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    new-instance v3, Ljava/lang/StringBuilder;

    .line 600
    .line 601
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 602
    .line 603
    .line 604
    const-string v4, "Launch asset not found for update; this should never happen. Debug info: "

    .line 605
    .line 606
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 607
    .line 608
    .line 609
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 610
    .line 611
    .line 612
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v2

    .line 616
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 617
    .line 618
    .line 619
    throw v1

    .line 620
    :cond_18
    new-instance v1, Ljava/lang/Exception;

    .line 621
    .line 622
    const-string v2, "No launchable update was found. If this is a generic app, ensure expo-updates is configured correctly."

    .line 623
    .line 624
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 625
    .line 626
    .line 627
    throw v1

    .line 628
    :cond_19
    new-instance v1, Ljava/lang/AssertionError;

    .line 629
    .line 630
    const-string v2, "DatabaseLauncher has already started. Create a new instance in order to launch a new version."

    .line 631
    .line 632
    invoke-direct {v1, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 633
    .line 634
    .line 635
    throw v1
.end method
