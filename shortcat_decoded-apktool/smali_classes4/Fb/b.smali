.class public LFb/b;
.super Lgc/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0016\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "LFb/b;",
        "Lgc/c;",
        "<init>",
        "()V",
        "",
        "",
        "z",
        "()Ljava/util/List;",
        "Lgc/e;",
        "n",
        "()Lgc/e;",
        "Landroid/content/Context;",
        "y",
        "()Landroid/content/Context;",
        "context",
        "expo-font_release"
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

.method public static final synthetic x(LFb/b;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-direct {p0}, LFb/b;->z()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final y()Landroid/content/Context;
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

.method private final z()Ljava/util/List;
    .locals 9

    .line 1
    invoke-direct {p0}, LFb/b;->y()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, LDf/p;

    .line 10
    .line 11
    const-string v2, "^(.+?)(_bold|_italic|_bold_italic)?\\.(ttf|otf)$"

    .line 12
    .line 13
    invoke-direct {v1, v2}, LDf/p;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v2, "fonts/"

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz v0, :cond_4

    .line 24
    .line 25
    new-instance v3, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    array-length v4, v0

    .line 31
    const/4 v5, 0x0

    .line 32
    move v6, v5

    .line 33
    :goto_0
    if-ge v6, v4, :cond_2

    .line 34
    .line 35
    aget-object v7, v0, v6

    .line 36
    .line 37
    invoke-static {v7}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    const/4 v8, 0x2

    .line 41
    invoke-static {v1, v7, v5, v8, v2}, LDf/p;->c(LDf/p;Ljava/lang/CharSequence;IILjava/lang/Object;)LDf/l;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    if-eqz v7, :cond_0

    .line 46
    .line 47
    invoke-interface {v7}, LDf/l;->b()Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    if-eqz v7, :cond_0

    .line 52
    .line 53
    const/4 v8, 0x1

    .line 54
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    check-cast v7, Ljava/lang/String;

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_0
    move-object v7, v2

    .line 62
    :goto_1
    if-eqz v7, :cond_1

    .line 63
    .line 64
    invoke-interface {v3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    new-instance v2, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_4

    .line 84
    .line 85
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    move-object v3, v1

    .line 90
    check-cast v3, Ljava/lang/String;

    .line 91
    .line 92
    invoke-static {v3}, LDf/r;->l0(Ljava/lang/CharSequence;)Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-nez v3, :cond_3

    .line 97
    .line 98
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_4
    if-nez v2, :cond_5

    .line 103
    .line 104
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    return-object v0

    .line 109
    :cond_5
    return-object v2
.end method


# virtual methods
.method public n()Lgc/e;
    .locals 12

    .line 1
    const-class v0, Ljava/lang/Object;

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
    new-instance v3, Lkotlin/jvm/internal/N;

    .line 62
    .line 63
    invoke-direct {v3}, Lkotlin/jvm/internal/N;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-static {p0}, LFb/b;->x(LFb/b;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    iput-object v4, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 71
    .line 72
    const-string v4, "ExpoFontLoader"

    .line 73
    .line 74
    invoke-virtual {v2, v4}, Lgc/a;->s(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const-string v4, "getLoadedFonts"

    .line 78
    .line 79
    new-instance v5, Ldc/r;

    .line 80
    .line 81
    const/4 v6, 0x0

    .line 82
    new-array v7, v6, [Lpc/b;

    .line 83
    .line 84
    sget-object v8, Lpc/V;->a:Lpc/V;

    .line 85
    .line 86
    invoke-virtual {v8}, Lpc/V;->a()Ljava/util/Map;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 91
    .line 92
    .line 93
    move-result-object v10

    .line 94
    invoke-interface {v9, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v9

    .line 98
    check-cast v9, Lpc/U;

    .line 99
    .line 100
    if-nez v9, :cond_0

    .line 101
    .line 102
    new-instance v9, Lpc/U;

    .line 103
    .line 104
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    invoke-direct {v9, v10}, Lpc/U;-><init>(Lpe/d;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v8}, Lpc/V;->a()Ljava/util/Map;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-interface {v8, v0, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :catchall_0
    move-exception v0

    .line 124
    goto/16 :goto_2

    .line 125
    .line 126
    :cond_0
    :goto_0
    new-instance v0, LFb/b$d;

    .line 127
    .line 128
    invoke-direct {v0, v3}, LFb/b$d;-><init>(Lkotlin/jvm/internal/N;)V

    .line 129
    .line 130
    .line 131
    invoke-direct {v5, v4, v7, v9, v0}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2}, Lhc/f;->p()Ljava/util/Map;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    const-string v0, "loadAsync"

    .line 142
    .line 143
    invoke-virtual {v2}, Lhc/f;->m()Lpc/X;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    sget-object v5, Lpc/d;->a:Lpc/d;

    .line 148
    .line 149
    new-instance v7, Lkotlin/Pair;

    .line 150
    .line 151
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 152
    .line 153
    .line 154
    move-result-object v8

    .line 155
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 156
    .line 157
    invoke-direct {v7, v8, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v5}, Lpc/d;->a()Ljava/util/Map;

    .line 161
    .line 162
    .line 163
    move-result-object v8

    .line 164
    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    check-cast v7, Lpc/b;

    .line 169
    .line 170
    if-nez v7, :cond_1

    .line 171
    .line 172
    sget-object v7, LFb/b$a;->a:LFb/b$a;

    .line 173
    .line 174
    new-instance v8, Lpc/b;

    .line 175
    .line 176
    new-instance v10, Lpc/M;

    .line 177
    .line 178
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 179
    .line 180
    .line 181
    move-result-object v11

    .line 182
    invoke-direct {v10, v11, v6, v7}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 183
    .line 184
    .line 185
    invoke-direct {v8, v10, v4}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 186
    .line 187
    .line 188
    move-object v7, v8

    .line 189
    :cond_1
    new-instance v8, Lkotlin/Pair;

    .line 190
    .line 191
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 192
    .line 193
    .line 194
    move-result-object v10

    .line 195
    invoke-direct {v8, v10, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v5}, Lpc/d;->a()Ljava/util/Map;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    invoke-interface {v5, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v5

    .line 206
    check-cast v5, Lpc/b;

    .line 207
    .line 208
    if-nez v5, :cond_2

    .line 209
    .line 210
    sget-object v5, LFb/b$b;->a:LFb/b$b;

    .line 211
    .line 212
    new-instance v8, Lpc/b;

    .line 213
    .line 214
    new-instance v9, Lpc/M;

    .line 215
    .line 216
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 217
    .line 218
    .line 219
    move-result-object v10

    .line 220
    invoke-direct {v9, v10, v6, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 221
    .line 222
    .line 223
    invoke-direct {v8, v9, v4}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 224
    .line 225
    .line 226
    move-object v5, v8

    .line 227
    :cond_2
    filled-new-array {v7, v5}, [Lpc/b;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    new-instance v5, LFb/b$c;

    .line 232
    .line 233
    invoke-direct {v5, p0, v3}, LFb/b$c;-><init>(LFb/b;Lkotlin/jvm/internal/N;)V

    .line 234
    .line 235
    .line 236
    const-class v3, LTd/L;

    .line 237
    .line 238
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 239
    .line 240
    invoke-static {v3, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v6

    .line 244
    if-eqz v6, :cond_3

    .line 245
    .line 246
    new-instance v1, Ldc/l;

    .line 247
    .line 248
    invoke-direct {v1, v0, v4, v5}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 249
    .line 250
    .line 251
    goto :goto_1

    .line 252
    :cond_3
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 253
    .line 254
    invoke-static {v3, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v6

    .line 258
    if-eqz v6, :cond_4

    .line 259
    .line 260
    new-instance v1, Ldc/h;

    .line 261
    .line 262
    invoke-direct {v1, v0, v4, v5}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 263
    .line 264
    .line 265
    goto :goto_1

    .line 266
    :cond_4
    sget-object v6, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 267
    .line 268
    invoke-static {v3, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v6

    .line 272
    if-eqz v6, :cond_5

    .line 273
    .line 274
    new-instance v1, Ldc/i;

    .line 275
    .line 276
    invoke-direct {v1, v0, v4, v5}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 277
    .line 278
    .line 279
    goto :goto_1

    .line 280
    :cond_5
    sget-object v6, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 281
    .line 282
    invoke-static {v3, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v6

    .line 286
    if-eqz v6, :cond_6

    .line 287
    .line 288
    new-instance v1, Ldc/j;

    .line 289
    .line 290
    invoke-direct {v1, v0, v4, v5}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 291
    .line 292
    .line 293
    goto :goto_1

    .line 294
    :cond_6
    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v1

    .line 298
    if-eqz v1, :cond_7

    .line 299
    .line 300
    new-instance v1, Ldc/n;

    .line 301
    .line 302
    invoke-direct {v1, v0, v4, v5}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 303
    .line 304
    .line 305
    goto :goto_1

    .line 306
    :cond_7
    new-instance v1, Ldc/s;

    .line 307
    .line 308
    invoke-direct {v1, v0, v4, v5}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 309
    .line 310
    .line 311
    :goto_1
    invoke-virtual {v2}, Lhc/f;->k()Ljava/util/Map;

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v2}, Lgc/a;->u()Lgc/e;

    .line 319
    .line 320
    .line 321
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 322
    invoke-static {}, LX3/a;->f()V

    .line 323
    .line 324
    .line 325
    return-object v0

    .line 326
    :goto_2
    invoke-static {}, LX3/a;->f()V

    .line 327
    .line 328
    .line 329
    throw v0
.end method
