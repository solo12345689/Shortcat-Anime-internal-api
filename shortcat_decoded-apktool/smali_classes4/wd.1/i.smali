.class public abstract Lwd/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwd/i$a;,
        Lwd/i$b;,
        Lwd/i$c;,
        Lwd/i$d;,
        Lwd/i$e;,
        Lwd/i$f;
    }
.end annotation


# static fields
.field public static final r:Lwd/i$c;

.field private static final s:Ljava/lang/String;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lexpo/modules/updates/d;

.field private final c:Lxd/g;

.field private final d:Lexpo/modules/updates/db/UpdatesDatabase;

.field private final e:Ljava/io/File;

.field private final f:Lwd/j;

.field private g:LGf/O;

.field private h:Lwd/v;

.field private i:Lrd/d;

.field private j:I

.field private k:Ljava/util/List;

.field private l:Ljava/util/List;

.field private m:Ljava/util/List;

.field private final n:LJf/t;

.field private o:Ljava/util/Map;

.field private p:Lkotlin/jvm/functions/Function1;

.field private final q:LJf/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lwd/i$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lwd/i$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lwd/i;->r:Lwd/i$c;

    .line 8
    .line 9
    const-class v0, Lwd/i;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lwd/i;->s:Ljava/lang/String;

    .line 16
    .line 17
    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Lexpo/modules/updates/d;Lxd/g;Lexpo/modules/updates/db/UpdatesDatabase;Ljava/io/File;Lwd/j;LGf/O;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "database"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatesDirectory"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loaderFiles"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lwd/i;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lwd/i;->b:Lexpo/modules/updates/d;

    .line 4
    iput-object p3, p0, Lwd/i;->c:Lxd/g;

    .line 5
    iput-object p4, p0, Lwd/i;->d:Lexpo/modules/updates/db/UpdatesDatabase;

    .line 6
    iput-object p5, p0, Lwd/i;->e:Ljava/io/File;

    .line 7
    iput-object p6, p0, Lwd/i;->f:Lwd/j;

    .line 8
    iput-object p7, p0, Lwd/i;->g:LGf/O;

    .line 9
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lwd/i;->k:Ljava/util/List;

    .line 10
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lwd/i;->l:Ljava/util/List;

    .line 11
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lwd/i;->m:Ljava/util/List;

    const/4 p1, 0x0

    const/4 p2, 0x7

    const/4 p3, 0x0

    .line 12
    invoke-static {p3, p3, p1, p2, p1}, LJf/A;->b(IILIf/a;ILjava/lang/Object;)LJf/t;

    move-result-object p1

    iput-object p1, p0, Lwd/i;->n:LJf/t;

    .line 13
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p2, p0, Lwd/i;->o:Ljava/util/Map;

    .line 14
    invoke-static {p1}, LJf/g;->a(LJf/t;)LJf/y;

    move-result-object p1

    iput-object p1, p0, Lwd/i;->q:LJf/e;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lexpo/modules/updates/d;Lxd/g;Lexpo/modules/updates/db/UpdatesDatabase;Ljava/io/File;Lwd/j;LGf/O;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 15
    invoke-static {v1, v0, v1}, LGf/X0;->b(LGf/C0;ILjava/lang/Object;)LGf/A;

    move-result-object v0

    invoke-static {}, LGf/f0;->b()LGf/K;

    move-result-object v1

    invoke-interface {v0, v1}, LZd/i;->w(LZd/i;)LZd/i;

    move-result-object v0

    invoke-static {v0}, LGf/P;->a(LZd/i;)LGf/O;

    move-result-object v0

    move-object v8, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    goto :goto_1

    :cond_0
    move-object/from16 v8, p7

    goto :goto_0

    .line 16
    :goto_1
    invoke-direct/range {v1 .. v8}, Lwd/i;-><init>(Landroid/content/Context;Lexpo/modules/updates/d;Lxd/g;Lexpo/modules/updates/db/UpdatesDatabase;Ljava/io/File;Lwd/j;LGf/O;)V

    return-void
.end method

.method public static final synthetic a(Lwd/i;Lyd/q;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lwd/i;->f(Lyd/q;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic b(Lwd/i;)Lexpo/modules/updates/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lwd/i;->b:Lexpo/modules/updates/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic c(Lwd/i;)Ljava/io/File;
    .locals 0

    .line 1
    iget-object p0, p0, Lwd/i;->e:Ljava/io/File;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(Lwd/i;Lrd/a;Lwd/i$b;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lwd/i;->j(Lrd/a;Lwd/i$b;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final f(Lyd/q;LZd/e;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    instance-of v2, v0, Lwd/i$g;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lwd/i$g;

    .line 11
    .line 12
    iget v3, v2, Lwd/i$g;->g:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lwd/i$g;->g:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lwd/i$g;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, Lwd/i$g;-><init>(Lwd/i;LZd/e;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, Lwd/i$g;->e:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    iget v3, v2, Lwd/i$g;->g:I

    .line 36
    .line 37
    const/4 v7, 0x2

    .line 38
    const/4 v8, 0x1

    .line 39
    const/4 v9, 0x0

    .line 40
    if-eqz v3, :cond_3

    .line 41
    .line 42
    if-eq v3, v8, :cond_2

    .line 43
    .line 44
    if-ne v3, v7, :cond_1

    .line 45
    .line 46
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_4

    .line 50
    .line 51
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v0

    .line 59
    :cond_2
    iget-object v3, v2, Lwd/i$g;->d:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v3, Ljava/util/Iterator;

    .line 62
    .line 63
    iget-object v4, v2, Lwd/i$g;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v4, Ljava/util/List;

    .line 66
    .line 67
    iget-object v5, v2, Lwd/i$g;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v5, Lyd/q;

    .line 70
    .line 71
    iget-object v10, v2, Lwd/i$g;->a:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v10, Lyd/q;

    .line 74
    .line 75
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    move-object v11, v3

    .line 79
    move-object v12, v4

    .line 80
    move-object v4, v5

    .line 81
    move-object v3, v10

    .line 82
    move-object v10, v2

    .line 83
    goto :goto_2

    .line 84
    :cond_3
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-interface/range {p1 .. p1}, Lyd/q;->a()Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    new-instance v3, Ljava/util/HashSet;

    .line 92
    .line 93
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 94
    .line 95
    .line 96
    new-instance v4, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    if-eqz v5, :cond_5

    .line 110
    .line 111
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    move-object v10, v5

    .line 116
    check-cast v10, Lrd/a;

    .line 117
    .line 118
    invoke-virtual {v10}, Lrd/a;->j()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v10

    .line 122
    invoke-virtual {v3, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v10

    .line 126
    if-eqz v10, :cond_4

    .line 127
    .line 128
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_5
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    iput v0, v1, Lwd/i;->j:I

    .line 137
    .line 138
    iget-object v0, v1, Lwd/i;->f:Lwd/j;

    .line 139
    .line 140
    iget-object v3, v1, Lwd/i;->a:Landroid/content/Context;

    .line 141
    .line 142
    iget-object v5, v1, Lwd/i;->b:Lexpo/modules/updates/d;

    .line 143
    .line 144
    invoke-virtual {v0, v3, v5}, Lwd/j;->e(Landroid/content/Context;Lexpo/modules/updates/d;)Lyd/q;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    new-instance v3, Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 151
    .line 152
    .line 153
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    move-object v10, v2

    .line 158
    move-object v12, v3

    .line 159
    move-object v11, v4

    .line 160
    move-object/from16 v3, p1

    .line 161
    .line 162
    move-object v4, v0

    .line 163
    :cond_6
    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-eqz v0, :cond_9

    .line 168
    .line 169
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    check-cast v0, Lrd/a;

    .line 174
    .line 175
    new-instance v2, Lkotlin/jvm/internal/N;

    .line 176
    .line 177
    invoke-direct {v2}, Lkotlin/jvm/internal/N;-><init>()V

    .line 178
    .line 179
    .line 180
    iput-object v0, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 181
    .line 182
    iget-object v0, v1, Lwd/i;->d:Lexpo/modules/updates/db/UpdatesDatabase;

    .line 183
    .line 184
    invoke-virtual {v0}, Lexpo/modules/updates/db/UpdatesDatabase;->O()Lqd/a;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    iget-object v5, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v5, Lrd/a;

    .line 191
    .line 192
    invoke-virtual {v5}, Lrd/a;->j()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    invoke-virtual {v0, v5}, Lqd/a;->g(Ljava/lang/String;)Lrd/a;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    if-eqz v0, :cond_7

    .line 201
    .line 202
    iget-object v5, v1, Lwd/i;->d:Lexpo/modules/updates/db/UpdatesDatabase;

    .line 203
    .line 204
    invoke-virtual {v5}, Lexpo/modules/updates/db/UpdatesDatabase;->O()Lqd/a;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    iget-object v13, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v13, Lrd/a;

    .line 211
    .line 212
    invoke-virtual {v5, v0, v13}, Lqd/a;->l(Lrd/a;Lrd/a;)V

    .line 213
    .line 214
    .line 215
    iput-object v0, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 216
    .line 217
    :cond_7
    iget-object v0, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v0, Lrd/a;

    .line 220
    .line 221
    invoke-virtual {v0}, Lrd/a;->m()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    if-eqz v0, :cond_8

    .line 226
    .line 227
    iget-object v0, v1, Lwd/i;->f:Lwd/j;

    .line 228
    .line 229
    iget-object v5, v1, Lwd/i;->a:Landroid/content/Context;

    .line 230
    .line 231
    iget-object v13, v1, Lwd/i;->e:Ljava/io/File;

    .line 232
    .line 233
    iget-object v14, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v14, Lrd/a;

    .line 236
    .line 237
    invoke-virtual {v14}, Lrd/a;->m()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v14

    .line 241
    invoke-virtual {v0, v5, v13, v14}, Lwd/j;->d(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Z

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    if-eqz v0, :cond_8

    .line 246
    .line 247
    iget-object v0, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v0, Lrd/a;

    .line 250
    .line 251
    sget-object v2, Lwd/i$b;->b:Lwd/i$b;

    .line 252
    .line 253
    iput-object v3, v10, Lwd/i$g;->a:Ljava/lang/Object;

    .line 254
    .line 255
    iput-object v4, v10, Lwd/i$g;->b:Ljava/lang/Object;

    .line 256
    .line 257
    iput-object v12, v10, Lwd/i$g;->c:Ljava/lang/Object;

    .line 258
    .line 259
    iput-object v11, v10, Lwd/i$g;->d:Ljava/lang/Object;

    .line 260
    .line 261
    iput v8, v10, Lwd/i$g;->g:I

    .line 262
    .line 263
    invoke-direct {v1, v0, v2, v10}, Lwd/i;->j(Lrd/a;Lwd/i$b;LZd/e;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    if-ne v0, v6, :cond_6

    .line 268
    .line 269
    goto :goto_3

    .line 270
    :cond_8
    iget-object v13, v1, Lwd/i;->g:LGf/O;

    .line 271
    .line 272
    new-instance v0, Lwd/i$h;

    .line 273
    .line 274
    const/4 v5, 0x0

    .line 275
    invoke-direct/range {v0 .. v5}, Lwd/i$h;-><init>(Lwd/i;Lkotlin/jvm/internal/N;Lyd/q;Lyd/q;LZd/e;)V

    .line 276
    .line 277
    .line 278
    const/16 v17, 0x3

    .line 279
    .line 280
    const/16 v18, 0x0

    .line 281
    .line 282
    const/4 v14, 0x0

    .line 283
    const/4 v15, 0x0

    .line 284
    move-object/from16 v16, v0

    .line 285
    .line 286
    invoke-static/range {v13 .. v18}, LGf/i;->b(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/W;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    goto/16 :goto_2

    .line 294
    .line 295
    :cond_9
    iput-object v9, v10, Lwd/i$g;->a:Ljava/lang/Object;

    .line 296
    .line 297
    iput-object v9, v10, Lwd/i$g;->b:Ljava/lang/Object;

    .line 298
    .line 299
    iput-object v9, v10, Lwd/i$g;->c:Ljava/lang/Object;

    .line 300
    .line 301
    iput-object v9, v10, Lwd/i$g;->d:Ljava/lang/Object;

    .line 302
    .line 303
    iput v7, v10, Lwd/i$g;->g:I

    .line 304
    .line 305
    invoke-static {v12, v10}, LGf/f;->a(Ljava/util/Collection;LZd/e;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    if-ne v0, v6, :cond_a

    .line 310
    .line 311
    :goto_3
    return-object v6

    .line 312
    :cond_a
    :goto_4
    :try_start_0
    iget-object v0, v1, Lwd/i;->l:Ljava/util/List;

    .line 313
    .line 314
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    :cond_b
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 319
    .line 320
    .line 321
    move-result v2

    .line 322
    if-eqz v2, :cond_c

    .line 323
    .line 324
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    check-cast v2, Lrd/a;

    .line 329
    .line 330
    iget-object v3, v1, Lwd/i;->d:Lexpo/modules/updates/db/UpdatesDatabase;

    .line 331
    .line 332
    invoke-virtual {v3}, Lexpo/modules/updates/db/UpdatesDatabase;->O()Lqd/a;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    iget-object v4, v1, Lwd/i;->i:Lrd/d;

    .line 337
    .line 338
    invoke-static {v4}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v2}, Lrd/a;->t()Z

    .line 342
    .line 343
    .line 344
    move-result v5

    .line 345
    invoke-virtual {v3, v4, v2, v5}, Lqd/a;->a(Lrd/d;Lrd/a;Z)Z

    .line 346
    .line 347
    .line 348
    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 349
    if-nez v3, :cond_b

    .line 350
    .line 351
    :try_start_1
    sget-object v3, Lexpo/modules/updates/g;->a:Lexpo/modules/updates/g;

    .line 352
    .line 353
    new-instance v4, Ljava/io/File;

    .line 354
    .line 355
    iget-object v5, v1, Lwd/i;->e:Ljava/io/File;

    .line 356
    .line 357
    invoke-virtual {v2}, Lrd/a;->m()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v6

    .line 361
    invoke-direct {v4, v5, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v3, v4}, Lexpo/modules/updates/g;->i(Ljava/io/File;)[B

    .line 365
    .line 366
    .line 367
    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 368
    goto :goto_6

    .line 369
    :catch_0
    move-object v3, v9

    .line 370
    :goto_6
    :try_start_2
    new-instance v4, Ljava/util/Date;

    .line 371
    .line 372
    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v2, v4}, Lrd/a;->u(Ljava/util/Date;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v2, v3}, Lrd/a;->y([B)V

    .line 379
    .line 380
    .line 381
    iget-object v3, v1, Lwd/i;->m:Ljava/util/List;

    .line 382
    .line 383
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    goto :goto_5

    .line 387
    :catch_1
    move-exception v0

    .line 388
    goto :goto_7

    .line 389
    :cond_c
    iget-object v0, v1, Lwd/i;->d:Lexpo/modules/updates/db/UpdatesDatabase;

    .line 390
    .line 391
    invoke-virtual {v0}, Lexpo/modules/updates/db/UpdatesDatabase;->O()Lqd/a;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    iget-object v2, v1, Lwd/i;->m:Ljava/util/List;

    .line 396
    .line 397
    iget-object v3, v1, Lwd/i;->i:Lrd/d;

    .line 398
    .line 399
    invoke-static {v3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v0, v2, v3}, Lqd/a;->e(Ljava/util/List;Lrd/d;)V

    .line 403
    .line 404
    .line 405
    iget-object v0, v1, Lwd/i;->d:Lexpo/modules/updates/db/UpdatesDatabase;

    .line 406
    .line 407
    invoke-virtual {v0}, Lexpo/modules/updates/db/UpdatesDatabase;->Q()Lqd/e;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    iget-object v2, v1, Lwd/i;->i:Lrd/d;

    .line 412
    .line 413
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v0, v2}, Lqd/e;->s(Lrd/d;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 417
    .line 418
    .line 419
    invoke-direct {v1}, Lwd/i;->g()Lwd/i$d;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    return-object v0

    .line 424
    :goto_7
    new-instance v2, Ljava/io/IOException;

    .line 425
    .line 426
    const-string v3, "Error while adding new update to database"

    .line 427
    .line 428
    invoke-direct {v2, v3, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 429
    .line 430
    .line 431
    throw v2
.end method

.method private final g()Lwd/i$d;
    .locals 4

    .line 1
    iget-object v0, p0, Lwd/i;->h:Lwd/v;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lwd/v;->c()Lyd/n;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    sget-object v1, Lyd/k;->a:Lyd/k;

    .line 13
    .line 14
    iget-object v2, p0, Lwd/i;->d:Lexpo/modules/updates/db/UpdatesDatabase;

    .line 15
    .line 16
    iget-object v3, p0, Lwd/i;->b:Lexpo/modules/updates/d;

    .line 17
    .line 18
    invoke-virtual {v1, v0, v2, v3}, Lyd/k;->h(Lyd/n;Lexpo/modules/updates/db/UpdatesDatabase;Lexpo/modules/updates/d;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lwd/i;->h:Lwd/v;

    .line 22
    .line 23
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lwd/v;->a()Lwd/w$a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, Lwd/w$a;->a()Lwd/u;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v0, 0x0

    .line 38
    :goto_0
    new-instance v1, Lwd/i$d;

    .line 39
    .line 40
    iget-object v2, p0, Lwd/i;->i:Lrd/d;

    .line 41
    .line 42
    invoke-direct {v1, v2, v0}, Lwd/i$d;-><init>(Lrd/d;Lwd/u;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p0}, Lwd/i;->p()V

    .line 46
    .line 47
    .line 48
    return-object v1
.end method

.method private final j(Lrd/a;Lwd/i$b;LZd/e;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p3, Lwd/i$i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lwd/i$i;

    .line 7
    .line 8
    iget v1, v0, Lwd/i$i;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lwd/i$i;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lwd/i$i;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lwd/i$i;-><init>(Lwd/i;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lwd/i$i;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lwd/i$i;->d:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Lwd/i$i;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Lwd/i$b;

    .line 41
    .line 42
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    sget-object p3, Lwd/i$f;->a:[I

    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    aget p3, p3, v2

    .line 64
    .line 65
    if-eq p3, v3, :cond_5

    .line 66
    .line 67
    const/4 v2, 0x2

    .line 68
    if-eq p3, v2, :cond_4

    .line 69
    .line 70
    const/4 v2, 0x3

    .line 71
    if-ne p3, v2, :cond_3

    .line 72
    .line 73
    iget-object p3, p0, Lwd/i;->k:Ljava/util/List;

    .line 74
    .line 75
    invoke-interface {p3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    new-instance p1, LTd/r;

    .line 80
    .line 81
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 82
    .line 83
    .line 84
    throw p1

    .line 85
    :cond_4
    iget-object p3, p0, Lwd/i;->l:Ljava/util/List;

    .line 86
    .line 87
    invoke-interface {p3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_5
    iget-object p3, p0, Lwd/i;->m:Ljava/util/List;

    .line 92
    .line 93
    invoke-interface {p3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    :goto_1
    sget-object p3, Lwd/i$b;->a:Lwd/i$b;

    .line 97
    .line 98
    if-eq p2, p3, :cond_6

    .line 99
    .line 100
    sget-object p3, Lwd/i$b;->b:Lwd/i$b;

    .line 101
    .line 102
    if-ne p2, p3, :cond_7

    .line 103
    .line 104
    :cond_6
    iget-object p3, p0, Lwd/i;->o:Ljava/util/Map;

    .line 105
    .line 106
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 107
    .line 108
    invoke-static {v4, v5}, Lkotlin/coroutines/jvm/internal/b;->b(D)Ljava/lang/Double;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-interface {p3, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    invoke-direct {p0}, Lwd/i;->n()V

    .line 116
    .line 117
    .line 118
    :cond_7
    iget-object p3, p0, Lwd/i;->n:LJf/t;

    .line 119
    .line 120
    new-instance v2, Lwd/i$a;

    .line 121
    .line 122
    iget-object v4, p0, Lwd/i;->m:Ljava/util/List;

    .line 123
    .line 124
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    iget-object v5, p0, Lwd/i;->l:Ljava/util/List;

    .line 129
    .line 130
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    add-int/2addr v4, v5

    .line 135
    iget-object v5, p0, Lwd/i;->k:Ljava/util/List;

    .line 136
    .line 137
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    iget v6, p0, Lwd/i;->j:I

    .line 142
    .line 143
    invoke-direct {v2, p1, v4, v5, v6}, Lwd/i$a;-><init>(Lrd/a;III)V

    .line 144
    .line 145
    .line 146
    iput-object p2, v0, Lwd/i$i;->a:Ljava/lang/Object;

    .line 147
    .line 148
    iput v3, v0, Lwd/i$i;->d:I

    .line 149
    .line 150
    invoke-interface {p3, v2, v0}, LJf/t;->emit(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    if-ne p1, v1, :cond_8

    .line 155
    .line 156
    return-object v1

    .line 157
    :cond_8
    return-object p2
.end method

.method private final n()V
    .locals 4

    .line 1
    iget v0, p0, Lwd/i;->j:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lwd/i;->o:Ljava/util/Map;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Iterable;

    .line 12
    .line 13
    invoke-static {v0}, LUd/u;->S0(Ljava/lang/Iterable;)D

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    iget v2, p0, Lwd/i;->j:I

    .line 18
    .line 19
    int-to-double v2, v2

    .line 20
    div-double/2addr v0, v2

    .line 21
    iget-object v2, p0, Lwd/i;->p:Lkotlin/jvm/functions/Function1;

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method private final o(Lyd/q;LZd/e;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-interface {p1}, Lyd/q;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, Lyd/q;->c()Lrd/d;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p2, p0, Lwd/i;->d:Lexpo/modules/updates/db/UpdatesDatabase;

    .line 12
    .line 13
    invoke-virtual {p2}, Lexpo/modules/updates/db/UpdatesDatabase;->Q()Lqd/e;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, p1}, Lqd/e;->g(Lrd/d;)V

    .line 21
    .line 22
    .line 23
    iget-object p2, p0, Lwd/i;->d:Lexpo/modules/updates/db/UpdatesDatabase;

    .line 24
    .line 25
    invoke-virtual {p2}, Lexpo/modules/updates/db/UpdatesDatabase;->Q()Lqd/e;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p2, p1}, Lqd/e;->s(Lrd/d;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lwd/i;->i:Lrd/d;

    .line 33
    .line 34
    invoke-direct {p0}, Lwd/i;->g()Lwd/i$d;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    :cond_0
    invoke-interface {p1}, Lyd/q;->c()Lrd/d;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v1, p0, Lwd/i;->d:Lexpo/modules/updates/db/UpdatesDatabase;

    .line 44
    .line 45
    invoke-virtual {v1}, Lexpo/modules/updates/db/UpdatesDatabase;->Q()Lqd/e;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Lrd/d;->d()Ljava/util/UUID;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v1, v2}, Lqd/e;->o(Ljava/util/UUID;)Lrd/d;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    invoke-virtual {v1}, Lrd/d;->l()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v0}, Lrd/d;->l()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_1

    .line 75
    .line 76
    iget-object v2, p0, Lwd/i;->c:Lxd/g;

    .line 77
    .line 78
    const-string v3, "Loaded an update with the same ID but a different scopeKey than one we already have on disk. This is a server error. Overwriting the scopeKey and loading the existing update."

    .line 79
    .line 80
    const/4 v4, 0x2

    .line 81
    const/4 v5, 0x0

    .line 82
    invoke-static {v2, v3, v5, v4, v5}, Lxd/g;->q(Lxd/g;Ljava/lang/String;Lxd/b;ILjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iget-object v2, p0, Lwd/i;->d:Lexpo/modules/updates/db/UpdatesDatabase;

    .line 86
    .line 87
    invoke-virtual {v2}, Lexpo/modules/updates/db/UpdatesDatabase;->Q()Lqd/e;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v0}, Lrd/d;->l()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-virtual {v2, v1, v3}, Lqd/e;->x(Lrd/d;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    :cond_1
    if-eqz v1, :cond_2

    .line 99
    .line 100
    invoke-virtual {v1}, Lrd/d;->m()Lsd/b;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    sget-object v3, Lsd/b;->a:Lsd/b;

    .line 105
    .line 106
    if-ne v2, v3, :cond_2

    .line 107
    .line 108
    iput-object v1, p0, Lwd/i;->i:Lrd/d;

    .line 109
    .line 110
    invoke-direct {p0}, Lwd/i;->g()Lwd/i$d;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    return-object p1

    .line 115
    :cond_2
    if-nez v1, :cond_3

    .line 116
    .line 117
    iput-object v0, p0, Lwd/i;->i:Lrd/d;

    .line 118
    .line 119
    iget-object v0, p0, Lwd/i;->d:Lexpo/modules/updates/db/UpdatesDatabase;

    .line 120
    .line 121
    invoke-virtual {v0}, Lexpo/modules/updates/db/UpdatesDatabase;->Q()Lqd/e;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    iget-object v1, p0, Lwd/i;->i:Lrd/d;

    .line 126
    .line 127
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v1}, Lqd/e;->g(Lrd/d;)V

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_3
    iput-object v1, p0, Lwd/i;->i:Lrd/d;

    .line 135
    .line 136
    :goto_0
    invoke-direct {p0, p1, p2}, Lwd/i;->f(Lyd/q;LZd/e;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    return-object p1
.end method

.method private final p()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lwd/i;->h:Lwd/v;

    .line 3
    .line 4
    iput-object v0, p0, Lwd/i;->i:Lrd/d;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput v1, p0, Lwd/i;->j:I

    .line 8
    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Lwd/i;->k:Ljava/util/List;

    .line 15
    .line 16
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Lwd/i;->l:Ljava/util/List;

    .line 22
    .line 23
    new-instance v1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lwd/i;->m:Ljava/util/List;

    .line 29
    .line 30
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 31
    .line 32
    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lwd/i;->o:Ljava/util/Map;

    .line 36
    .line 37
    iput-object v0, p0, Lwd/i;->p:Lkotlin/jvm/functions/Function1;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final e(Lrd/a;D)V
    .locals 1

    .line 1
    const-string v0, "asset"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    iget-object p3, p0, Lwd/i;->o:Ljava/util/Map;

    .line 11
    .line 12
    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lwd/i;->n()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method protected final h()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lwd/i;->a:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()LJf/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lwd/i;->q:LJf/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k(Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lwd/i$j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lwd/i$j;

    .line 7
    .line 8
    iget v1, v0, Lwd/i$j;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lwd/i$j;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lwd/i$j;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lwd/i$j;-><init>(Lwd/i;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lwd/i$j;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lwd/i$j;->d:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    :try_start_0
    invoke-static {p2}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    return-object p2

    .line 45
    :catch_0
    move-exception p1

    .line 46
    goto :goto_4

    .line 47
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_2
    iget-object p1, v0, Lwd/i$j;->a:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, Lkotlin/jvm/functions/Function1;

    .line 58
    .line 59
    :try_start_1
    invoke-static {p2}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-static {p2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :try_start_2
    iget-object p2, p0, Lwd/i;->d:Lexpo/modules/updates/db/UpdatesDatabase;

    .line 67
    .line 68
    iget-object v2, p0, Lwd/i;->b:Lexpo/modules/updates/d;

    .line 69
    .line 70
    iput-object p1, v0, Lwd/i$j;->a:Ljava/lang/Object;

    .line 71
    .line 72
    iput v4, v0, Lwd/i$j;->d:I

    .line 73
    .line 74
    invoke-virtual {p0, p2, v2, v0}, Lwd/i;->m(Lexpo/modules/updates/db/UpdatesDatabase;Lexpo/modules/updates/d;LZd/e;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    if-ne p2, v1, :cond_4

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_4
    :goto_1
    check-cast p2, Lwd/v;

    .line 82
    .line 83
    iput-object p2, p0, Lwd/i;->h:Lwd/v;

    .line 84
    .line 85
    invoke-virtual {p2}, Lwd/v;->b()Lwd/w$b;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    const/4 v4, 0x0

    .line 90
    if-eqz v2, :cond_5

    .line 91
    .line 92
    invoke-virtual {v2}, Lwd/w$b;->a()Lyd/q;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    goto :goto_2

    .line 97
    :cond_5
    move-object v2, v4

    .line 98
    :goto_2
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    check-cast p1, Lwd/i$e;

    .line 103
    .line 104
    if-eqz v2, :cond_7

    .line 105
    .line 106
    invoke-virtual {p1}, Lwd/i$e;->a()Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-eqz p1, :cond_7

    .line 111
    .line 112
    iput-object v4, v0, Lwd/i$j;->a:Ljava/lang/Object;

    .line 113
    .line 114
    iput v3, v0, Lwd/i$j;->d:I

    .line 115
    .line 116
    invoke-direct {p0, v2, v0}, Lwd/i;->o(Lyd/q;LZd/e;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-ne p1, v1, :cond_6

    .line 121
    .line 122
    :goto_3
    return-object v1

    .line 123
    :cond_6
    return-object p1

    .line 124
    :cond_7
    iput-object v4, p0, Lwd/i;->i:Lrd/d;

    .line 125
    .line 126
    invoke-direct {p0}, Lwd/i;->g()Lwd/i$d;

    .line 127
    .line 128
    .line 129
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 130
    return-object p1

    .line 131
    :goto_4
    iget-object p2, p0, Lwd/i;->c:Lxd/g;

    .line 132
    .line 133
    const-string v0, "Load error"

    .line 134
    .line 135
    sget-object v1, Lxd/b;->h:Lxd/b;

    .line 136
    .line 137
    invoke-virtual {p2, v0, p1, v1}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V

    .line 138
    .line 139
    .line 140
    throw p1
.end method

.method protected abstract l(Lrd/a;Ljava/io/File;Lexpo/modules/updates/d;Lrd/d;Lrd/d;LZd/e;)Ljava/lang/Object;
.end method

.method protected abstract m(Lexpo/modules/updates/db/UpdatesDatabase;Lexpo/modules/updates/d;LZd/e;)Ljava/lang/Object;
.end method

.method public final q(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwd/i;->p:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-void
.end method
