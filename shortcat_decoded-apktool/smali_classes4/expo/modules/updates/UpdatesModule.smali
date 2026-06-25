.class public final Lexpo/modules/updates/UpdatesModule;
.super Lgc/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lud/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/updates/UpdatesModule$a;,
        Lexpo/modules/updates/UpdatesModule$UpdatesConfigurationOverrideParam;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0002\u0015\u0016B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0010\u001a\u00020\r8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\t\u001a\u00020\u00118BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0017"
    }
    d2 = {
        "Lexpo/modules/updates/UpdatesModule;",
        "Lgc/c;",
        "Lud/b;",
        "<init>",
        "()V",
        "Lgc/e;",
        "n",
        "()Lgc/e;",
        "LCd/b;",
        "context",
        "LTd/L;",
        "b",
        "(LCd/b;)V",
        "Lxd/g;",
        "A",
        "()Lxd/g;",
        "logger",
        "Landroid/content/Context;",
        "z",
        "()Landroid/content/Context;",
        "d",
        "a",
        "UpdatesConfigurationOverrideParam",
        "expo-updates_release"
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
.field public static final d:Lexpo/modules/updates/UpdatesModule$a;

.field private static final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lexpo/modules/updates/UpdatesModule$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lexpo/modules/updates/UpdatesModule$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lexpo/modules/updates/UpdatesModule;->d:Lexpo/modules/updates/UpdatesModule$a;

    .line 8
    .line 9
    const-class v0, Lexpo/modules/updates/UpdatesModule;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lexpo/modules/updates/UpdatesModule;->e:Ljava/lang/String;

    .line 16
    .line 17
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

.method private final A()Lxd/g;
    .locals 3

    .line 1
    new-instance v0, Lxd/g;

    .line 2
    .line 3
    invoke-direct {p0}, Lexpo/modules/updates/UpdatesModule;->z()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "getFilesDir(...)"

    .line 12
    .line 13
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Lxd/g;-><init>(Ljava/io/File;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public static final synthetic x(Lexpo/modules/updates/UpdatesModule;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/updates/UpdatesModule;->z()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic y(Lexpo/modules/updates/UpdatesModule;)Lxd/g;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/updates/UpdatesModule;->A()Lxd/g;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final z()Landroid/content/Context;
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


# virtual methods
.method public b(LCd/b;)V
    .locals 3

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lexpo/modules/updates/UpdatesJSEvent;->StateChange:Lexpo/modules/updates/UpdatesJSEvent;

    .line 7
    .line 8
    new-instance v2, Landroid/os/Bundle;

    .line 9
    .line 10
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, LCd/b;->f()Landroid/os/Bundle;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {v2, v0, p1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 18
    .line 19
    .line 20
    sget-object p1, LTd/L;->a:LTd/L;

    .line 21
    .line 22
    invoke-virtual {p0, v1, v2}, Lgc/c;->r(Ljava/lang/Enum;Landroid/os/Bundle;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public n()Lgc/e;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-class v0, Ljava/util/Map;

    .line 4
    .line 5
    const-class v2, Lexpo/modules/updates/UpdatesModule$UpdatesConfigurationOverrideParam;

    .line 6
    .line 7
    const-class v3, Ljava/lang/Long;

    .line 8
    .line 9
    const-class v4, Lexpo/modules/updates/UpdatesJSEvent;

    .line 10
    .line 11
    const-class v5, Lexpo/modules/updates/reloadscreen/ReloadScreenOptions;

    .line 12
    .line 13
    const-class v6, LTd/L;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v7

    .line 19
    new-instance v8, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v7, ".ModuleDefinition"

    .line 28
    .line 29
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    new-instance v8, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v9, "["

    .line 42
    .line 43
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v9, "ExpoModulesCore"

    .line 47
    .line 48
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v9, "] "

    .line 52
    .line 53
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    invoke-static {v7}, LX3/a;->c(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :try_start_0
    new-instance v7, Lgc/d;

    .line 67
    .line 68
    invoke-direct {v7, v1}, Lgc/d;-><init>(Lgc/c;)V

    .line 69
    .line 70
    .line 71
    const-string v8, "ExpoUpdates"

    .line 72
    .line 73
    invoke-virtual {v7, v8}, Lgc/a;->s(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v4}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    invoke-static {v8}, LUb/n;->b(Lpe/d;)Lpe/h;

    .line 81
    .line 82
    .line 83
    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    const-class v9, Ljava/lang/String;

    .line 85
    .line 86
    const/4 v11, 0x1

    .line 87
    const/4 v12, 0x0

    .line 88
    if-eqz v8, :cond_4

    .line 89
    .line 90
    :try_start_1
    invoke-interface {v8}, Lpe/c;->getParameters()Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object v13

    .line 94
    if-eqz v13, :cond_4

    .line 95
    .line 96
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 97
    .line 98
    .line 99
    move-result v13

    .line 100
    if-ne v13, v11, :cond_4

    .line 101
    .line 102
    invoke-interface {v8}, Lpe/c;->getParameters()Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    invoke-static {v8}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    check-cast v8, Lpe/l;

    .line 111
    .line 112
    invoke-interface {v8}, Lpe/l;->getName()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    invoke-static {v4}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-static {v4}, Lqe/c;->a(Lpe/d;)Ljava/util/Collection;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    check-cast v4, Ljava/lang/Iterable;

    .line 125
    .line 126
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v13

    .line 134
    if-eqz v13, :cond_1

    .line 135
    .line 136
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v13

    .line 140
    move-object v14, v13

    .line 141
    check-cast v14, Lpe/o;

    .line 142
    .line 143
    invoke-interface {v14}, Lpe/c;->getName()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v14

    .line 147
    invoke-static {v14, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v14

    .line 151
    if-eqz v14, :cond_0

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :catchall_0
    move-exception v0

    .line 155
    goto/16 :goto_8

    .line 156
    .line 157
    :cond_1
    const/4 v13, 0x0

    .line 158
    :goto_0
    check-cast v13, Lpe/o;

    .line 159
    .line 160
    if-eqz v13, :cond_3

    .line 161
    .line 162
    invoke-interface {v13}, Lpe/c;->getReturnType()Lpe/q;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-interface {v4}, Lpe/q;->c()Lpe/f;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 171
    .line 172
    .line 173
    move-result-object v8

    .line 174
    invoke-static {v4, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    if-eqz v4, :cond_2

    .line 179
    .line 180
    invoke-static {}, Lexpo/modules/updates/UpdatesJSEvent;->values()[Lexpo/modules/updates/UpdatesJSEvent;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    new-instance v8, Ljava/util/ArrayList;

    .line 185
    .line 186
    array-length v14, v4

    .line 187
    invoke-direct {v8, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 188
    .line 189
    .line 190
    array-length v14, v4

    .line 191
    move v15, v12

    .line 192
    :goto_1
    if-ge v15, v14, :cond_5

    .line 193
    .line 194
    aget-object v10, v4, v15

    .line 195
    .line 196
    invoke-interface {v13, v10}, Lpe/o;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v10

    .line 200
    const-string v11, "null cannot be cast to non-null type kotlin.String"

    .line 201
    .line 202
    invoke-static {v10, v11}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    check-cast v10, Ljava/lang/String;

    .line 206
    .line 207
    invoke-interface {v8, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    add-int/lit8 v15, v15, 0x1

    .line 211
    .line 212
    const/4 v11, 0x1

    .line 213
    goto :goto_1

    .line 214
    :cond_2
    const-string v0, "The enum parameter has to be a string."

    .line 215
    .line 216
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 217
    .line 218
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    throw v2

    .line 222
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 223
    .line 224
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 225
    .line 226
    .line 227
    const-string v2, "Cannot find a property for "

    .line 228
    .line 229
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    const-string v2, " parameter"

    .line 236
    .line 237
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 245
    .line 246
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    throw v2

    .line 254
    :cond_4
    invoke-static {}, Lexpo/modules/updates/UpdatesJSEvent;->values()[Lexpo/modules/updates/UpdatesJSEvent;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    new-instance v8, Ljava/util/ArrayList;

    .line 259
    .line 260
    array-length v10, v4

    .line 261
    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 262
    .line 263
    .line 264
    array-length v10, v4

    .line 265
    move v11, v12

    .line 266
    :goto_2
    if-ge v11, v10, :cond_5

    .line 267
    .line 268
    aget-object v13, v4, v11

    .line 269
    .line 270
    invoke-virtual {v13}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v13

    .line 274
    invoke-interface {v8, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    add-int/lit8 v11, v11, 0x1

    .line 278
    .line 279
    goto :goto_2

    .line 280
    :cond_5
    new-instance v4, Lbc/f;

    .line 281
    .line 282
    new-array v10, v12, [Ljava/lang/String;

    .line 283
    .line 284
    invoke-interface {v8, v10}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v8

    .line 288
    check-cast v8, [Ljava/lang/String;

    .line 289
    .line 290
    invoke-direct {v4, v8}, Lbc/f;-><init>([Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v7, v4}, Lhc/f;->r(Lbc/f;)V

    .line 294
    .line 295
    .line 296
    new-instance v4, Lexpo/modules/updates/UpdatesModule$c;

    .line 297
    .line 298
    invoke-direct {v4, v1}, Lexpo/modules/updates/UpdatesModule$c;-><init>(Lexpo/modules/updates/UpdatesModule;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v7, v4}, Lhc/f;->c(Lie/a;)V

    .line 302
    .line 303
    .line 304
    sget-object v4, Lexpo/modules/updates/UpdatesJSEvent;->StateChange:Lexpo/modules/updates/UpdatesJSEvent;

    .line 305
    .line 306
    new-instance v8, Lexpo/modules/updates/UpdatesModule$d;

    .line 307
    .line 308
    invoke-direct {v8, v1}, Lexpo/modules/updates/UpdatesModule$d;-><init>(Lexpo/modules/updates/UpdatesModule;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v7, v4, v8}, Lhc/f;->e(Ljava/lang/Enum;Lie/a;)V

    .line 312
    .line 313
    .line 314
    sget-object v8, Lexpo/modules/updates/UpdatesModule$e;->a:Lexpo/modules/updates/UpdatesModule$e;

    .line 315
    .line 316
    invoke-virtual {v7, v4, v8}, Lhc/f;->g(Ljava/lang/Enum;Lie/a;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v7}, Lgc/a;->w()Ljava/util/Map;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    sget-object v8, Lbc/e;->b:Lbc/e;

    .line 324
    .line 325
    new-instance v10, Lbc/a;

    .line 326
    .line 327
    new-instance v11, Lexpo/modules/updates/UpdatesModule$y;

    .line 328
    .line 329
    invoke-direct {v11}, Lexpo/modules/updates/UpdatesModule$y;-><init>()V

    .line 330
    .line 331
    .line 332
    invoke-direct {v10, v8, v11}, Lbc/a;-><init>(Lbc/e;Lie/a;)V

    .line 333
    .line 334
    .line 335
    invoke-interface {v4, v8, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    const-string v4, "reload"

    .line 339
    .line 340
    invoke-virtual {v7, v4}, Lhc/f;->b(Ljava/lang/String;)Ldc/b;

    .line 341
    .line 342
    .line 343
    move-result-object v4

    .line 344
    new-instance v8, Ldc/p;

    .line 345
    .line 346
    invoke-virtual {v4}, Ldc/b;->c()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v10

    .line 350
    invoke-virtual {v4}, Ldc/b;->b()Lpc/X;

    .line 351
    .line 352
    .line 353
    move-result-object v11

    .line 354
    sget-object v13, Lpc/d;->a:Lpc/d;

    .line 355
    .line 356
    new-instance v14, Lkotlin/Pair;

    .line 357
    .line 358
    invoke-static {v5}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 359
    .line 360
    .line 361
    move-result-object v15

    .line 362
    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 363
    .line 364
    invoke-direct {v14, v15, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v13}, Lpc/d;->a()Ljava/util/Map;

    .line 368
    .line 369
    .line 370
    move-result-object v15

    .line 371
    invoke-interface {v15, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v14

    .line 375
    check-cast v14, Lpc/b;

    .line 376
    .line 377
    if-nez v14, :cond_6

    .line 378
    .line 379
    sget-object v14, Lexpo/modules/updates/UpdatesModule$l;->a:Lexpo/modules/updates/UpdatesModule$l;

    .line 380
    .line 381
    new-instance v15, Lpc/b;

    .line 382
    .line 383
    move-object/from16 v16, v0

    .line 384
    .line 385
    new-instance v0, Lpc/M;

    .line 386
    .line 387
    move-object/from16 v17, v2

    .line 388
    .line 389
    invoke-static {v5}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 390
    .line 391
    .line 392
    move-result-object v2

    .line 393
    move-object/from16 v18, v3

    .line 394
    .line 395
    const/4 v3, 0x1

    .line 396
    invoke-direct {v0, v2, v3, v14}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 397
    .line 398
    .line 399
    invoke-direct {v15, v0, v11}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 400
    .line 401
    .line 402
    move-object v14, v15

    .line 403
    goto :goto_3

    .line 404
    :cond_6
    move-object/from16 v16, v0

    .line 405
    .line 406
    move-object/from16 v17, v2

    .line 407
    .line 408
    move-object/from16 v18, v3

    .line 409
    .line 410
    :goto_3
    filled-new-array {v14}, [Lpc/b;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    new-instance v2, Lexpo/modules/updates/UpdatesModule$m;

    .line 415
    .line 416
    const/4 v3, 0x0

    .line 417
    invoke-direct {v2, v3}, Lexpo/modules/updates/UpdatesModule$m;-><init>(LZd/e;)V

    .line 418
    .line 419
    .line 420
    invoke-direct {v8, v10, v0, v2}, Ldc/p;-><init>(Ljava/lang/String;[Lpc/b;Lie/o;)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v4, v8}, Ldc/b;->d(Ldc/g;)V

    .line 424
    .line 425
    .line 426
    const-string v0, "checkForUpdateAsync"

    .line 427
    .line 428
    invoke-virtual {v7, v0}, Lhc/f;->b(Ljava/lang/String;)Ldc/b;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    new-instance v2, Ldc/p;

    .line 433
    .line 434
    invoke-virtual {v0}, Ldc/b;->c()Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v3

    .line 438
    const/4 v4, 0x0

    .line 439
    new-array v8, v4, [Lpc/b;

    .line 440
    .line 441
    new-instance v4, Lexpo/modules/updates/UpdatesModule$n;

    .line 442
    .line 443
    const/4 v10, 0x0

    .line 444
    invoke-direct {v4, v10}, Lexpo/modules/updates/UpdatesModule$n;-><init>(LZd/e;)V

    .line 445
    .line 446
    .line 447
    invoke-direct {v2, v3, v8, v4}, Ldc/p;-><init>(Ljava/lang/String;[Lpc/b;Lie/o;)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0, v2}, Ldc/b;->d(Ldc/g;)V

    .line 451
    .line 452
    .line 453
    const-string v0, "fetchUpdateAsync"

    .line 454
    .line 455
    invoke-virtual {v7, v0}, Lhc/f;->b(Ljava/lang/String;)Ldc/b;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    new-instance v2, Ldc/p;

    .line 460
    .line 461
    invoke-virtual {v0}, Ldc/b;->c()Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v3

    .line 465
    const/4 v4, 0x0

    .line 466
    new-array v8, v4, [Lpc/b;

    .line 467
    .line 468
    new-instance v4, Lexpo/modules/updates/UpdatesModule$o;

    .line 469
    .line 470
    const/4 v10, 0x0

    .line 471
    invoke-direct {v4, v10}, Lexpo/modules/updates/UpdatesModule$o;-><init>(LZd/e;)V

    .line 472
    .line 473
    .line 474
    invoke-direct {v2, v3, v8, v4}, Ldc/p;-><init>(Ljava/lang/String;[Lpc/b;Lie/o;)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v0, v2}, Ldc/b;->d(Ldc/g;)V

    .line 478
    .line 479
    .line 480
    const-string v0, "getExtraParamsAsync"

    .line 481
    .line 482
    invoke-virtual {v7, v0}, Lhc/f;->b(Ljava/lang/String;)Ldc/b;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    new-instance v2, Ldc/p;

    .line 487
    .line 488
    invoke-virtual {v0}, Ldc/b;->c()Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object v3

    .line 492
    const/4 v4, 0x0

    .line 493
    new-array v8, v4, [Lpc/b;

    .line 494
    .line 495
    new-instance v4, Lexpo/modules/updates/UpdatesModule$p;

    .line 496
    .line 497
    const/4 v10, 0x0

    .line 498
    invoke-direct {v4, v10, v1}, Lexpo/modules/updates/UpdatesModule$p;-><init>(LZd/e;Lexpo/modules/updates/UpdatesModule;)V

    .line 499
    .line 500
    .line 501
    invoke-direct {v2, v3, v8, v4}, Ldc/p;-><init>(Ljava/lang/String;[Lpc/b;Lie/o;)V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v0, v2}, Ldc/b;->d(Ldc/g;)V

    .line 505
    .line 506
    .line 507
    const-string v0, "setExtraParamAsync"

    .line 508
    .line 509
    invoke-virtual {v7, v0}, Lhc/f;->b(Ljava/lang/String;)Ldc/b;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    new-instance v2, Ldc/p;

    .line 514
    .line 515
    invoke-virtual {v0}, Ldc/b;->c()Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v3

    .line 519
    invoke-virtual {v0}, Ldc/b;->b()Lpc/X;

    .line 520
    .line 521
    .line 522
    move-result-object v4

    .line 523
    new-instance v8, Lkotlin/Pair;

    .line 524
    .line 525
    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 526
    .line 527
    .line 528
    move-result-object v10

    .line 529
    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 530
    .line 531
    invoke-direct {v8, v10, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 532
    .line 533
    .line 534
    invoke-virtual {v13}, Lpc/d;->a()Ljava/util/Map;

    .line 535
    .line 536
    .line 537
    move-result-object v10

    .line 538
    invoke-interface {v10, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v8

    .line 542
    check-cast v8, Lpc/b;

    .line 543
    .line 544
    if-nez v8, :cond_7

    .line 545
    .line 546
    sget-object v8, Lexpo/modules/updates/UpdatesModule$q;->a:Lexpo/modules/updates/UpdatesModule$q;

    .line 547
    .line 548
    new-instance v10, Lpc/b;

    .line 549
    .line 550
    new-instance v14, Lpc/M;

    .line 551
    .line 552
    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 553
    .line 554
    .line 555
    move-result-object v15

    .line 556
    move-object/from16 v19, v13

    .line 557
    .line 558
    const/4 v13, 0x0

    .line 559
    invoke-direct {v14, v15, v13, v8}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 560
    .line 561
    .line 562
    invoke-direct {v10, v14, v4}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 563
    .line 564
    .line 565
    move-object v8, v10

    .line 566
    goto :goto_4

    .line 567
    :cond_7
    move-object/from16 v19, v13

    .line 568
    .line 569
    :goto_4
    new-instance v10, Lkotlin/Pair;

    .line 570
    .line 571
    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 572
    .line 573
    .line 574
    move-result-object v13

    .line 575
    invoke-direct {v10, v13, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 576
    .line 577
    .line 578
    invoke-virtual/range {v19 .. v19}, Lpc/d;->a()Ljava/util/Map;

    .line 579
    .line 580
    .line 581
    move-result-object v13

    .line 582
    invoke-interface {v13, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v10

    .line 586
    check-cast v10, Lpc/b;

    .line 587
    .line 588
    if-nez v10, :cond_8

    .line 589
    .line 590
    sget-object v10, Lexpo/modules/updates/UpdatesModule$r;->a:Lexpo/modules/updates/UpdatesModule$r;

    .line 591
    .line 592
    new-instance v13, Lpc/b;

    .line 593
    .line 594
    new-instance v14, Lpc/M;

    .line 595
    .line 596
    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 597
    .line 598
    .line 599
    move-result-object v15

    .line 600
    move-object/from16 v20, v9

    .line 601
    .line 602
    const/4 v9, 0x1

    .line 603
    invoke-direct {v14, v15, v9, v10}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 604
    .line 605
    .line 606
    invoke-direct {v13, v14, v4}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 607
    .line 608
    .line 609
    move-object v10, v13

    .line 610
    goto :goto_5

    .line 611
    :cond_8
    move-object/from16 v20, v9

    .line 612
    .line 613
    :goto_5
    filled-new-array {v8, v10}, [Lpc/b;

    .line 614
    .line 615
    .line 616
    move-result-object v4

    .line 617
    new-instance v8, Lexpo/modules/updates/UpdatesModule$s;

    .line 618
    .line 619
    const/4 v10, 0x0

    .line 620
    invoke-direct {v8, v10, v1}, Lexpo/modules/updates/UpdatesModule$s;-><init>(LZd/e;Lexpo/modules/updates/UpdatesModule;)V

    .line 621
    .line 622
    .line 623
    invoke-direct {v2, v3, v4, v8}, Ldc/p;-><init>(Ljava/lang/String;[Lpc/b;Lie/o;)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v0, v2}, Ldc/b;->d(Ldc/g;)V

    .line 627
    .line 628
    .line 629
    const-string v0, "readLogEntriesAsync"

    .line 630
    .line 631
    invoke-virtual {v7, v0}, Lhc/f;->b(Ljava/lang/String;)Ldc/b;

    .line 632
    .line 633
    .line 634
    move-result-object v0

    .line 635
    new-instance v2, Ldc/p;

    .line 636
    .line 637
    invoke-virtual {v0}, Ldc/b;->c()Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v3

    .line 641
    invoke-virtual {v0}, Ldc/b;->b()Lpc/X;

    .line 642
    .line 643
    .line 644
    move-result-object v4

    .line 645
    new-instance v8, Lkotlin/Pair;

    .line 646
    .line 647
    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 648
    .line 649
    .line 650
    move-result-object v9

    .line 651
    invoke-direct {v8, v9, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 652
    .line 653
    .line 654
    invoke-virtual/range {v19 .. v19}, Lpc/d;->a()Ljava/util/Map;

    .line 655
    .line 656
    .line 657
    move-result-object v9

    .line 658
    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    move-result-object v8

    .line 662
    check-cast v8, Lpc/b;

    .line 663
    .line 664
    if-nez v8, :cond_9

    .line 665
    .line 666
    sget-object v8, Lexpo/modules/updates/UpdatesModule$t;->a:Lexpo/modules/updates/UpdatesModule$t;

    .line 667
    .line 668
    new-instance v9, Lpc/b;

    .line 669
    .line 670
    new-instance v10, Lpc/M;

    .line 671
    .line 672
    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 673
    .line 674
    .line 675
    move-result-object v11

    .line 676
    const/4 v13, 0x0

    .line 677
    invoke-direct {v10, v11, v13, v8}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 678
    .line 679
    .line 680
    invoke-direct {v9, v10, v4}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 681
    .line 682
    .line 683
    move-object v8, v9

    .line 684
    :cond_9
    filled-new-array {v8}, [Lpc/b;

    .line 685
    .line 686
    .line 687
    move-result-object v4

    .line 688
    new-instance v8, Lexpo/modules/updates/UpdatesModule$j;

    .line 689
    .line 690
    const/4 v10, 0x0

    .line 691
    invoke-direct {v8, v10, v1}, Lexpo/modules/updates/UpdatesModule$j;-><init>(LZd/e;Lexpo/modules/updates/UpdatesModule;)V

    .line 692
    .line 693
    .line 694
    invoke-direct {v2, v3, v4, v8}, Ldc/p;-><init>(Ljava/lang/String;[Lpc/b;Lie/o;)V

    .line 695
    .line 696
    .line 697
    invoke-virtual {v0, v2}, Ldc/b;->d(Ldc/g;)V

    .line 698
    .line 699
    .line 700
    const-string v0, "clearLogEntriesAsync"

    .line 701
    .line 702
    invoke-virtual {v7, v0}, Lhc/f;->b(Ljava/lang/String;)Ldc/b;

    .line 703
    .line 704
    .line 705
    move-result-object v0

    .line 706
    new-instance v2, Ldc/p;

    .line 707
    .line 708
    invoke-virtual {v0}, Ldc/b;->c()Ljava/lang/String;

    .line 709
    .line 710
    .line 711
    move-result-object v3

    .line 712
    const/4 v4, 0x0

    .line 713
    new-array v8, v4, [Lpc/b;

    .line 714
    .line 715
    new-instance v4, Lexpo/modules/updates/UpdatesModule$k;

    .line 716
    .line 717
    const/4 v10, 0x0

    .line 718
    invoke-direct {v4, v10, v1}, Lexpo/modules/updates/UpdatesModule$k;-><init>(LZd/e;Lexpo/modules/updates/UpdatesModule;)V

    .line 719
    .line 720
    .line 721
    invoke-direct {v2, v3, v8, v4}, Ldc/p;-><init>(Ljava/lang/String;[Lpc/b;Lie/o;)V

    .line 722
    .line 723
    .line 724
    invoke-virtual {v0, v2}, Ldc/b;->d(Ldc/g;)V

    .line 725
    .line 726
    .line 727
    const-string v0, "setUpdateURLAndRequestHeadersOverride"

    .line 728
    .line 729
    new-instance v2, Ldc/r;

    .line 730
    .line 731
    invoke-virtual {v7}, Lhc/f;->m()Lpc/X;

    .line 732
    .line 733
    .line 734
    move-result-object v3

    .line 735
    new-instance v4, Lkotlin/Pair;

    .line 736
    .line 737
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 738
    .line 739
    .line 740
    move-result-object v8

    .line 741
    invoke-direct {v4, v8, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 742
    .line 743
    .line 744
    invoke-virtual/range {v19 .. v19}, Lpc/d;->a()Ljava/util/Map;

    .line 745
    .line 746
    .line 747
    move-result-object v8

    .line 748
    invoke-interface {v8, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v4

    .line 752
    check-cast v4, Lpc/b;

    .line 753
    .line 754
    if-nez v4, :cond_a

    .line 755
    .line 756
    sget-object v4, Lexpo/modules/updates/UpdatesModule$u;->a:Lexpo/modules/updates/UpdatesModule$u;

    .line 757
    .line 758
    new-instance v8, Lpc/b;

    .line 759
    .line 760
    new-instance v9, Lpc/M;

    .line 761
    .line 762
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 763
    .line 764
    .line 765
    move-result-object v10

    .line 766
    const/4 v11, 0x1

    .line 767
    invoke-direct {v9, v10, v11, v4}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 768
    .line 769
    .line 770
    invoke-direct {v8, v9, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 771
    .line 772
    .line 773
    move-object v4, v8

    .line 774
    :cond_a
    filled-new-array {v4}, [Lpc/b;

    .line 775
    .line 776
    .line 777
    move-result-object v3

    .line 778
    sget-object v4, Lpc/V;->a:Lpc/V;

    .line 779
    .line 780
    invoke-virtual {v4}, Lpc/V;->a()Ljava/util/Map;

    .line 781
    .line 782
    .line 783
    move-result-object v8

    .line 784
    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 785
    .line 786
    .line 787
    move-result-object v9

    .line 788
    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 789
    .line 790
    .line 791
    move-result-object v8

    .line 792
    check-cast v8, Lpc/U;

    .line 793
    .line 794
    if-nez v8, :cond_b

    .line 795
    .line 796
    new-instance v8, Lpc/U;

    .line 797
    .line 798
    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 799
    .line 800
    .line 801
    move-result-object v9

    .line 802
    invoke-direct {v8, v9}, Lpc/U;-><init>(Lpe/d;)V

    .line 803
    .line 804
    .line 805
    invoke-virtual {v4}, Lpc/V;->a()Ljava/util/Map;

    .line 806
    .line 807
    .line 808
    move-result-object v9

    .line 809
    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 810
    .line 811
    .line 812
    move-result-object v10

    .line 813
    invoke-interface {v9, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 814
    .line 815
    .line 816
    :cond_b
    new-instance v9, Lexpo/modules/updates/UpdatesModule$v;

    .line 817
    .line 818
    invoke-direct {v9}, Lexpo/modules/updates/UpdatesModule$v;-><init>()V

    .line 819
    .line 820
    .line 821
    invoke-direct {v2, v0, v3, v8, v9}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 822
    .line 823
    .line 824
    invoke-virtual {v7}, Lhc/f;->p()Ljava/util/Map;

    .line 825
    .line 826
    .line 827
    move-result-object v3

    .line 828
    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 829
    .line 830
    .line 831
    const-string v0, "setUpdateRequestHeadersOverride"

    .line 832
    .line 833
    new-instance v2, Ldc/r;

    .line 834
    .line 835
    invoke-virtual {v7}, Lhc/f;->m()Lpc/X;

    .line 836
    .line 837
    .line 838
    move-result-object v3

    .line 839
    new-instance v8, Lkotlin/Pair;

    .line 840
    .line 841
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 842
    .line 843
    .line 844
    move-result-object v9

    .line 845
    invoke-direct {v8, v9, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 846
    .line 847
    .line 848
    invoke-virtual/range {v19 .. v19}, Lpc/d;->a()Ljava/util/Map;

    .line 849
    .line 850
    .line 851
    move-result-object v9

    .line 852
    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 853
    .line 854
    .line 855
    move-result-object v8

    .line 856
    check-cast v8, Lpc/b;

    .line 857
    .line 858
    if-nez v8, :cond_c

    .line 859
    .line 860
    sget-object v8, Lexpo/modules/updates/UpdatesModule$w;->a:Lexpo/modules/updates/UpdatesModule$w;

    .line 861
    .line 862
    new-instance v9, Lpc/b;

    .line 863
    .line 864
    new-instance v10, Lpc/M;

    .line 865
    .line 866
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 867
    .line 868
    .line 869
    move-result-object v11

    .line 870
    const/4 v13, 0x1

    .line 871
    invoke-direct {v10, v11, v13, v8}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 872
    .line 873
    .line 874
    invoke-direct {v9, v10, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 875
    .line 876
    .line 877
    move-object v8, v9

    .line 878
    :cond_c
    filled-new-array {v8}, [Lpc/b;

    .line 879
    .line 880
    .line 881
    move-result-object v3

    .line 882
    invoke-virtual {v4}, Lpc/V;->a()Ljava/util/Map;

    .line 883
    .line 884
    .line 885
    move-result-object v8

    .line 886
    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 887
    .line 888
    .line 889
    move-result-object v9

    .line 890
    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 891
    .line 892
    .line 893
    move-result-object v8

    .line 894
    check-cast v8, Lpc/U;

    .line 895
    .line 896
    if-nez v8, :cond_d

    .line 897
    .line 898
    new-instance v8, Lpc/U;

    .line 899
    .line 900
    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 901
    .line 902
    .line 903
    move-result-object v9

    .line 904
    invoke-direct {v8, v9}, Lpc/U;-><init>(Lpe/d;)V

    .line 905
    .line 906
    .line 907
    invoke-virtual {v4}, Lpc/V;->a()Ljava/util/Map;

    .line 908
    .line 909
    .line 910
    move-result-object v4

    .line 911
    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 912
    .line 913
    .line 914
    move-result-object v9

    .line 915
    invoke-interface {v4, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 916
    .line 917
    .line 918
    :cond_d
    new-instance v4, Lexpo/modules/updates/UpdatesModule$x;

    .line 919
    .line 920
    invoke-direct {v4}, Lexpo/modules/updates/UpdatesModule$x;-><init>()V

    .line 921
    .line 922
    .line 923
    invoke-direct {v2, v0, v3, v8, v4}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 924
    .line 925
    .line 926
    invoke-virtual {v7}, Lhc/f;->p()Ljava/util/Map;

    .line 927
    .line 928
    .line 929
    move-result-object v3

    .line 930
    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 931
    .line 932
    .line 933
    const-string v0, "showReloadScreen"

    .line 934
    .line 935
    const-class v2, LUb/u;

    .line 936
    .line 937
    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 938
    .line 939
    .line 940
    move-result v2

    .line 941
    if-eqz v2, :cond_e

    .line 942
    .line 943
    new-instance v2, Ldc/f;

    .line 944
    .line 945
    const/4 v4, 0x0

    .line 946
    new-array v3, v4, [Lpc/b;

    .line 947
    .line 948
    new-instance v4, Lexpo/modules/updates/UpdatesModule$f;

    .line 949
    .line 950
    invoke-direct {v4, v1}, Lexpo/modules/updates/UpdatesModule$f;-><init>(Lexpo/modules/updates/UpdatesModule;)V

    .line 951
    .line 952
    .line 953
    invoke-direct {v2, v0, v3, v4}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 954
    .line 955
    .line 956
    goto/16 :goto_7

    .line 957
    .line 958
    :cond_e
    invoke-virtual {v7}, Lhc/f;->m()Lpc/X;

    .line 959
    .line 960
    .line 961
    move-result-object v2

    .line 962
    new-instance v3, Lkotlin/Pair;

    .line 963
    .line 964
    invoke-static {v5}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 965
    .line 966
    .line 967
    move-result-object v4

    .line 968
    invoke-direct {v3, v4, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 969
    .line 970
    .line 971
    invoke-virtual/range {v19 .. v19}, Lpc/d;->a()Ljava/util/Map;

    .line 972
    .line 973
    .line 974
    move-result-object v4

    .line 975
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 976
    .line 977
    .line 978
    move-result-object v3

    .line 979
    check-cast v3, Lpc/b;

    .line 980
    .line 981
    if-nez v3, :cond_f

    .line 982
    .line 983
    sget-object v3, Lexpo/modules/updates/UpdatesModule$g;->a:Lexpo/modules/updates/UpdatesModule$g;

    .line 984
    .line 985
    new-instance v4, Lpc/b;

    .line 986
    .line 987
    new-instance v8, Lpc/M;

    .line 988
    .line 989
    invoke-static {v5}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 990
    .line 991
    .line 992
    move-result-object v5

    .line 993
    const/4 v9, 0x1

    .line 994
    invoke-direct {v8, v5, v9, v3}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 995
    .line 996
    .line 997
    invoke-direct {v4, v8, v2}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 998
    .line 999
    .line 1000
    move-object v3, v4

    .line 1001
    :cond_f
    filled-new-array {v3}, [Lpc/b;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v2

    .line 1005
    new-instance v3, Lexpo/modules/updates/UpdatesModule$h;

    .line 1006
    .line 1007
    invoke-direct {v3, v1}, Lexpo/modules/updates/UpdatesModule$h;-><init>(Lexpo/modules/updates/UpdatesModule;)V

    .line 1008
    .line 1009
    .line 1010
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 1011
    .line 1012
    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1013
    .line 1014
    .line 1015
    move-result v4

    .line 1016
    if-eqz v4, :cond_10

    .line 1017
    .line 1018
    new-instance v4, Ldc/l;

    .line 1019
    .line 1020
    invoke-direct {v4, v0, v2, v3}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 1021
    .line 1022
    .line 1023
    :goto_6
    move-object v2, v4

    .line 1024
    goto :goto_7

    .line 1025
    :cond_10
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 1026
    .line 1027
    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1028
    .line 1029
    .line 1030
    move-result v4

    .line 1031
    if-eqz v4, :cond_11

    .line 1032
    .line 1033
    new-instance v4, Ldc/h;

    .line 1034
    .line 1035
    invoke-direct {v4, v0, v2, v3}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 1036
    .line 1037
    .line 1038
    goto :goto_6

    .line 1039
    :cond_11
    sget-object v4, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 1040
    .line 1041
    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1042
    .line 1043
    .line 1044
    move-result v4

    .line 1045
    if-eqz v4, :cond_12

    .line 1046
    .line 1047
    new-instance v4, Ldc/i;

    .line 1048
    .line 1049
    invoke-direct {v4, v0, v2, v3}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 1050
    .line 1051
    .line 1052
    goto :goto_6

    .line 1053
    :cond_12
    sget-object v4, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 1054
    .line 1055
    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1056
    .line 1057
    .line 1058
    move-result v4

    .line 1059
    if-eqz v4, :cond_13

    .line 1060
    .line 1061
    new-instance v4, Ldc/j;

    .line 1062
    .line 1063
    invoke-direct {v4, v0, v2, v3}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 1064
    .line 1065
    .line 1066
    goto :goto_6

    .line 1067
    :cond_13
    move-object/from16 v4, v20

    .line 1068
    .line 1069
    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1070
    .line 1071
    .line 1072
    move-result v4

    .line 1073
    if-eqz v4, :cond_14

    .line 1074
    .line 1075
    new-instance v4, Ldc/n;

    .line 1076
    .line 1077
    invoke-direct {v4, v0, v2, v3}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 1078
    .line 1079
    .line 1080
    goto :goto_6

    .line 1081
    :cond_14
    new-instance v4, Ldc/s;

    .line 1082
    .line 1083
    invoke-direct {v4, v0, v2, v3}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 1084
    .line 1085
    .line 1086
    goto :goto_6

    .line 1087
    :goto_7
    invoke-virtual {v7}, Lhc/f;->k()Ljava/util/Map;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v3

    .line 1091
    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1092
    .line 1093
    .line 1094
    sget-object v0, Ldc/m;->a:Ldc/m;

    .line 1095
    .line 1096
    invoke-virtual {v2, v0}, Ldc/g;->n(Ldc/m;)Ldc/g;

    .line 1097
    .line 1098
    .line 1099
    const-string v2, "hideReloadScreen"

    .line 1100
    .line 1101
    const/4 v4, 0x0

    .line 1102
    new-array v3, v4, [Lpc/b;

    .line 1103
    .line 1104
    new-instance v4, Lexpo/modules/updates/UpdatesModule$i;

    .line 1105
    .line 1106
    invoke-direct {v4}, Lexpo/modules/updates/UpdatesModule$i;-><init>()V

    .line 1107
    .line 1108
    .line 1109
    new-instance v5, Ldc/s;

    .line 1110
    .line 1111
    invoke-direct {v5, v2, v3, v4}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 1112
    .line 1113
    .line 1114
    invoke-virtual {v7}, Lhc/f;->k()Ljava/util/Map;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v3

    .line 1118
    invoke-interface {v3, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1119
    .line 1120
    .line 1121
    invoke-virtual {v5, v0}, Ldc/g;->n(Ldc/m;)Ldc/g;

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual {v7}, Lgc/a;->u()Lgc/e;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1128
    invoke-static {}, LX3/a;->f()V

    .line 1129
    .line 1130
    .line 1131
    return-object v0

    .line 1132
    :goto_8
    invoke-static {}, LX3/a;->f()V

    .line 1133
    .line 1134
    .line 1135
    throw v0
.end method
