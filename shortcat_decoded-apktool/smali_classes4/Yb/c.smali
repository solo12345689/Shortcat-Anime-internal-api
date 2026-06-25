.class public final LYb/c;
.super Lhc/f;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final k:LUb/d;

.field private final l:Ljava/lang/String;

.field private final m:Lpe/d;

.field private final n:Lpc/b;

.field private o:Ldc/r;

.field private final p:Ljava/util/List;

.field private q:Ljava/util/Map;

.field private r:Ljava/util/Map;

.field private s:Ljava/util/Map;

.field private t:Ljava/util/Map;


# direct methods
.method public constructor <init>(LUb/d;Ljava/lang/String;Lpe/d;Lpc/b;Lpc/X;)V
    .locals 1

    .line 1
    const-string v0, "appContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "name"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "ownerClass"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "ownerType"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, p5}, Lhc/f;-><init>(Lpc/X;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, LYb/c;->k:LUb/d;

    .line 25
    .line 26
    iput-object p2, p0, LYb/c;->l:Ljava/lang/String;

    .line 27
    .line 28
    iput-object p3, p0, LYb/c;->m:Lpe/d;

    .line 29
    .line 30
    iput-object p4, p0, LYb/c;->n:Lpc/b;

    .line 31
    .line 32
    new-instance p1, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, LYb/c;->p:Ljava/util/List;

    .line 38
    .line 39
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, LYb/c;->q:Ljava/util/Map;

    .line 45
    .line 46
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 47
    .line 48
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, LYb/c;->r:Ljava/util/Map;

    .line 52
    .line 53
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, LYb/c;->s:Ljava/util/Map;

    .line 59
    .line 60
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, LYb/c;->t:Ljava/util/Map;

    .line 66
    .line 67
    return-void
.end method

.method public static synthetic s([Ljava/lang/Object;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0}, LYb/c;->x([Ljava/lang/Object;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic t(Lpe/h;[Ljava/lang/Object;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LYb/c;->w(Lpe/h;[Ljava/lang/Object;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final w(Lpe/h;[Ljava/lang/Object;)LTd/L;
    .locals 2

    .line 1
    const-string v0, "<destruct>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aget-object v0, p1, v0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    aget-object p1, p1, v1

    .line 11
    .line 12
    check-cast p0, Lkotlin/jvm/functions/Function2;

    .line 13
    .line 14
    invoke-interface {p0, v0, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    sget-object p0, LTd/L;->a:LTd/L;

    .line 18
    .line 19
    return-object p0
.end method

.method private static final x([Ljava/lang/Object;)LTd/L;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, LTd/L;->a:LTd/L;

    .line 7
    .line 8
    return-object p0
.end method


# virtual methods
.method public final A()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, LYb/c;->q:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final B(Ldc/r;)V
    .locals 0

    .line 1
    iput-object p1, p0, LYb/c;->o:Ldc/r;

    .line 2
    .line 3
    return-void
.end method

.method public u(Ljava/lang/String;)Lhc/m;
    .locals 2

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lhc/m;

    .line 7
    .line 8
    iget-object v1, p0, LYb/c;->n:Lpc/b;

    .line 9
    .line 10
    invoke-virtual {v1}, Lpc/b;->g()Lpe/q;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1, p1}, Lhc/m;-><init>(Lpe/q;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lhc/f;->o()Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public final v()LYb/d;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LYb/c;->m:Lpe/d;

    .line 4
    .line 5
    const-class v2, LTd/L;

    .line 6
    .line 7
    invoke-static {v2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v4, 0x0

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    iget-object v5, v0, LYb/c;->m:Lpe/d;

    .line 19
    .line 20
    invoke-static {v5}, Lnc/d;->a(Lpe/d;)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v5, v4

    .line 29
    :goto_0
    if-nez v1, :cond_1

    .line 30
    .line 31
    iget-object v6, v0, LYb/c;->m:Lpe/d;

    .line 32
    .line 33
    invoke-static {v6}, Lnc/g;->a(Lpe/d;)Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    if-eqz v6, :cond_1

    .line 38
    .line 39
    const/4 v13, 0x1

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move v13, v4

    .line 42
    :goto_1
    invoke-virtual {v0}, Lhc/f;->n()Lbc/f;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    const/4 v7, 0x0

    .line 47
    if-eqz v6, :cond_4

    .line 48
    .line 49
    if-eqz v5, :cond_4

    .line 50
    .line 51
    const-string v5, "__expo_onStartListeningToEvent"

    .line 52
    .line 53
    sget-object v6, LYb/c$a;->a:LYb/c$a;

    .line 54
    .line 55
    invoke-static {v5, v6}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    const-string v6, "__expo_onStopListeningToEvent"

    .line 60
    .line 61
    sget-object v8, LYb/c$b;->a:LYb/c$b;

    .line 62
    .line 63
    invoke-static {v6, v8}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    filled-new-array {v5, v6}, [Lkotlin/Pair;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-static {v5}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    if-eqz v6, :cond_4

    .line 84
    .line 85
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    check-cast v6, Lkotlin/Pair;

    .line 90
    .line 91
    invoke-virtual {v6}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    check-cast v8, Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v6}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    check-cast v6, Lpe/h;

    .line 102
    .line 103
    new-instance v9, Ldc/r;

    .line 104
    .line 105
    iget-object v10, v0, LYb/c;->n:Lpc/b;

    .line 106
    .line 107
    sget-object v11, Lpc/d;->a:Lpc/d;

    .line 108
    .line 109
    new-instance v12, Lkotlin/Pair;

    .line 110
    .line 111
    const-class v14, Ljava/lang/String;

    .line 112
    .line 113
    invoke-static {v14}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 114
    .line 115
    .line 116
    move-result-object v15

    .line 117
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 118
    .line 119
    invoke-direct {v12, v15, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v11}, Lpc/d;->a()Ljava/util/Map;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-interface {v3, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    check-cast v3, Lpc/b;

    .line 131
    .line 132
    if-nez v3, :cond_2

    .line 133
    .line 134
    sget-object v3, LYb/c$c;->a:LYb/c$c;

    .line 135
    .line 136
    new-instance v11, Lpc/b;

    .line 137
    .line 138
    new-instance v12, Lpc/M;

    .line 139
    .line 140
    invoke-static {v14}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 141
    .line 142
    .line 143
    move-result-object v14

    .line 144
    invoke-direct {v12, v14, v4, v3}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 145
    .line 146
    .line 147
    invoke-direct {v11, v12, v7}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 148
    .line 149
    .line 150
    move-object v3, v11

    .line 151
    :cond_2
    filled-new-array {v10, v3}, [Lpc/b;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    sget-object v10, Lpc/V;->a:Lpc/V;

    .line 156
    .line 157
    invoke-virtual {v10}, Lpc/V;->a()Ljava/util/Map;

    .line 158
    .line 159
    .line 160
    move-result-object v11

    .line 161
    invoke-static {v2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 162
    .line 163
    .line 164
    move-result-object v12

    .line 165
    invoke-interface {v11, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v11

    .line 169
    check-cast v11, Lpc/U;

    .line 170
    .line 171
    if-nez v11, :cond_3

    .line 172
    .line 173
    new-instance v11, Lpc/U;

    .line 174
    .line 175
    invoke-static {v2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 176
    .line 177
    .line 178
    move-result-object v12

    .line 179
    invoke-direct {v11, v12}, Lpc/U;-><init>(Lpe/d;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v10}, Lpc/V;->a()Ljava/util/Map;

    .line 183
    .line 184
    .line 185
    move-result-object v10

    .line 186
    invoke-static {v2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 187
    .line 188
    .line 189
    move-result-object v12

    .line 190
    invoke-interface {v10, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    :cond_3
    new-instance v10, LYb/a;

    .line 194
    .line 195
    invoke-direct {v10, v6}, LYb/a;-><init>(Lpe/h;)V

    .line 196
    .line 197
    .line 198
    invoke-direct {v9, v8, v3, v11, v10}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v9, v4}, Ldc/a;->d(Z)Ldc/a;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0}, Lhc/f;->p()Ljava/util/Map;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    invoke-interface {v3, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    goto/16 :goto_2

    .line 212
    .line 213
    :cond_4
    invoke-virtual {v0}, Lhc/f;->j()Lhc/h;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    iget-object v5, v0, LYb/c;->p:Ljava/util/List;

    .line 218
    .line 219
    new-instance v6, Ljava/util/ArrayList;

    .line 220
    .line 221
    const/16 v8, 0xa

    .line 222
    .line 223
    invoke-static {v5, v8}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 224
    .line 225
    .line 226
    move-result v8

    .line 227
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 228
    .line 229
    .line 230
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 235
    .line 236
    .line 237
    move-result v8

    .line 238
    if-nez v8, :cond_e

    .line 239
    .line 240
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 241
    .line 242
    .line 243
    move-result-object v5

    .line 244
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 245
    .line 246
    .line 247
    move-result v6

    .line 248
    if-nez v6, :cond_5

    .line 249
    .line 250
    move-object v6, v7

    .line 251
    goto :goto_4

    .line 252
    :cond_5
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v6

    .line 256
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 257
    .line 258
    .line 259
    move-result v8

    .line 260
    if-eqz v8, :cond_6

    .line 261
    .line 262
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v8

    .line 266
    check-cast v8, Lhc/h;

    .line 267
    .line 268
    check-cast v6, Lhc/h;

    .line 269
    .line 270
    invoke-virtual {v6, v8}, Lhc/h;->i(Lhc/h;)Lhc/h;

    .line 271
    .line 272
    .line 273
    move-result-object v6

    .line 274
    goto :goto_3

    .line 275
    :cond_6
    :goto_4
    check-cast v6, Lhc/h;

    .line 276
    .line 277
    invoke-virtual {v3, v6}, Lhc/h;->i(Lhc/h;)Lhc/h;

    .line 278
    .line 279
    .line 280
    move-result-object v12

    .line 281
    invoke-virtual {v12}, Lhc/h;->e()LUb/e;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 286
    .line 287
    .line 288
    move-result v5

    .line 289
    if-eqz v5, :cond_7

    .line 290
    .line 291
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v5

    .line 295
    check-cast v5, Ldc/a;

    .line 296
    .line 297
    iget-object v6, v0, LYb/c;->n:Lpc/b;

    .line 298
    .line 299
    invoke-virtual {v6}, Lpc/b;->g()Lpe/q;

    .line 300
    .line 301
    .line 302
    move-result-object v6

    .line 303
    invoke-virtual {v5, v6}, Ldc/a;->l(Lpe/q;)V

    .line 304
    .line 305
    .line 306
    const/4 v6, 0x1

    .line 307
    invoke-virtual {v5, v6}, Ldc/a;->k(Z)V

    .line 308
    .line 309
    .line 310
    goto :goto_5

    .line 311
    :cond_7
    if-nez v1, :cond_9

    .line 312
    .line 313
    iget-object v1, v0, LYb/c;->o:Ldc/r;

    .line 314
    .line 315
    if-nez v1, :cond_9

    .line 316
    .line 317
    if-eqz v13, :cond_8

    .line 318
    .line 319
    goto :goto_6

    .line 320
    :cond_8
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 321
    .line 322
    const-string v2, "constructor cannot be null"

    .line 323
    .line 324
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    throw v1

    .line 328
    :cond_9
    :goto_6
    iget-object v1, v0, LYb/c;->o:Ldc/r;

    .line 329
    .line 330
    if-nez v1, :cond_b

    .line 331
    .line 332
    new-instance v1, Ldc/r;

    .line 333
    .line 334
    new-array v3, v4, [Lpc/b;

    .line 335
    .line 336
    sget-object v4, Lpc/V;->a:Lpc/V;

    .line 337
    .line 338
    invoke-virtual {v4}, Lpc/V;->a()Ljava/util/Map;

    .line 339
    .line 340
    .line 341
    move-result-object v5

    .line 342
    invoke-static {v2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 343
    .line 344
    .line 345
    move-result-object v6

    .line 346
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v5

    .line 350
    check-cast v5, Lpc/U;

    .line 351
    .line 352
    if-nez v5, :cond_a

    .line 353
    .line 354
    new-instance v5, Lpc/U;

    .line 355
    .line 356
    invoke-static {v2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 357
    .line 358
    .line 359
    move-result-object v6

    .line 360
    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v4}, Lpc/V;->a()Ljava/util/Map;

    .line 364
    .line 365
    .line 366
    move-result-object v4

    .line 367
    invoke-static {v2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    invoke-interface {v4, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    :cond_a
    new-instance v2, LYb/b;

    .line 375
    .line 376
    invoke-direct {v2}, LYb/b;-><init>()V

    .line 377
    .line 378
    .line 379
    const-string v4, "constructor"

    .line 380
    .line 381
    invoke-direct {v1, v4, v3, v5, v2}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 382
    .line 383
    .line 384
    :cond_b
    move-object v9, v1

    .line 385
    const/4 v6, 0x1

    .line 386
    invoke-virtual {v9, v6}, Ldc/a;->k(Z)V

    .line 387
    .line 388
    .line 389
    iget-object v1, v0, LYb/c;->n:Lpc/b;

    .line 390
    .line 391
    invoke-virtual {v1}, Lpc/b;->g()Lpe/q;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    invoke-virtual {v9, v1}, Ldc/a;->l(Lpe/q;)V

    .line 396
    .line 397
    .line 398
    iget-object v8, v0, LYb/c;->l:Ljava/lang/String;

    .line 399
    .line 400
    iget-object v1, v0, LYb/c;->q:Ljava/util/Map;

    .line 401
    .line 402
    iget-object v2, v0, LYb/c;->r:Ljava/util/Map;

    .line 403
    .line 404
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 405
    .line 406
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 407
    .line 408
    .line 409
    move-result v4

    .line 410
    invoke-static {v4}, LUd/S;->e(I)I

    .line 411
    .line 412
    .line 413
    move-result v4

    .line 414
    invoke-direct {v3, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 415
    .line 416
    .line 417
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    check-cast v2, Ljava/lang/Iterable;

    .line 422
    .line 423
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 428
    .line 429
    .line 430
    move-result v4

    .line 431
    if-nez v4, :cond_d

    .line 432
    .line 433
    invoke-static {v1, v3}, LUd/S;->p(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    .line 434
    .line 435
    .line 436
    move-result-object v10

    .line 437
    iget-object v1, v0, LYb/c;->s:Ljava/util/Map;

    .line 438
    .line 439
    iget-object v2, v0, LYb/c;->t:Ljava/util/Map;

    .line 440
    .line 441
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 442
    .line 443
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 444
    .line 445
    .line 446
    move-result v4

    .line 447
    invoke-static {v4}, LUd/S;->e(I)I

    .line 448
    .line 449
    .line 450
    move-result v4

    .line 451
    invoke-direct {v3, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 452
    .line 453
    .line 454
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    check-cast v2, Ljava/lang/Iterable;

    .line 459
    .line 460
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 461
    .line 462
    .line 463
    move-result-object v2

    .line 464
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 465
    .line 466
    .line 467
    move-result v4

    .line 468
    if-eqz v4, :cond_c

    .line 469
    .line 470
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v4

    .line 474
    check-cast v4, Ljava/util/Map$Entry;

    .line 475
    .line 476
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v5

    .line 480
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v4

    .line 484
    check-cast v4, Ldc/b;

    .line 485
    .line 486
    invoke-virtual {v4}, Ldc/b;->a()Ldc/g;

    .line 487
    .line 488
    .line 489
    move-result-object v4

    .line 490
    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    goto :goto_7

    .line 494
    :cond_c
    invoke-static {v1, v3}, LUd/S;->p(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    .line 495
    .line 496
    .line 497
    move-result-object v11

    .line 498
    new-instance v7, LYb/d;

    .line 499
    .line 500
    invoke-direct/range {v7 .. v13}, LYb/d;-><init>(Ljava/lang/String;Ldc/r;Ljava/util/Map;Ljava/util/Map;Lhc/h;Z)V

    .line 501
    .line 502
    .line 503
    return-object v7

    .line 504
    :cond_d
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v1

    .line 508
    check-cast v1, Ljava/util/Map$Entry;

    .line 509
    .line 510
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    invoke-static {v1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 518
    .line 519
    .line 520
    throw v7

    .line 521
    :cond_e
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v1

    .line 525
    invoke-static {v1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 526
    .line 527
    .line 528
    throw v7
.end method

.method public final y()Lpc/b;
    .locals 1

    .line 1
    iget-object v0, p0, LYb/c;->n:Lpc/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, LYb/c;->s:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method
