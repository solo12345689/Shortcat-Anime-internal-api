.class public final Lv4/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lv4/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv4/e$a;
    }
.end annotation


# static fields
.field public static final o:Lv4/e$a;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:LG4/c;

.field private final c:Lkotlin/Lazy;

.field private final d:Lkotlin/Lazy;

.field private final e:Lkotlin/Lazy;

.field private final f:Lv4/b$c;

.field private final g:Lv4/a;

.field private final h:LL4/o;

.field private final i:LGf/O;

.field private final j:LL4/t;

.field private final k:LG4/p;

.field private final l:Lv4/a;

.field private final m:Ljava/util/List;

.field private final n:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lv4/e$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lv4/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lv4/e;->o:Lv4/e$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LG4/c;Lkotlin/Lazy;Lkotlin/Lazy;Lkotlin/Lazy;Lv4/b$c;Lv4/a;LL4/o;LL4/r;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv4/e;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lv4/e;->b:LG4/c;

    .line 7
    .line 8
    iput-object p3, p0, Lv4/e;->c:Lkotlin/Lazy;

    .line 9
    .line 10
    iput-object p4, p0, Lv4/e;->d:Lkotlin/Lazy;

    .line 11
    .line 12
    iput-object p5, p0, Lv4/e;->e:Lkotlin/Lazy;

    .line 13
    .line 14
    iput-object p6, p0, Lv4/e;->f:Lv4/b$c;

    .line 15
    .line 16
    iput-object p7, p0, Lv4/e;->g:Lv4/a;

    .line 17
    .line 18
    iput-object p8, p0, Lv4/e;->h:LL4/o;

    .line 19
    .line 20
    const/4 p2, 0x1

    .line 21
    const/4 p3, 0x0

    .line 22
    invoke-static {p3, p2, p3}, LGf/X0;->b(LGf/C0;ILjava/lang/Object;)LGf/A;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-static {}, LGf/f0;->c()LGf/M0;

    .line 27
    .line 28
    .line 29
    move-result-object p6

    .line 30
    invoke-virtual {p6}, LGf/M0;->b2()LGf/M0;

    .line 31
    .line 32
    .line 33
    move-result-object p6

    .line 34
    invoke-interface {p2, p6}, LZd/i;->w(LZd/i;)LZd/i;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    sget-object p6, LGf/L;->J:LGf/L$b;

    .line 39
    .line 40
    new-instance p9, Lv4/e$f;

    .line 41
    .line 42
    invoke-direct {p9, p6, p0}, Lv4/e$f;-><init>(LGf/L$b;Lv4/e;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {p2, p9}, LZd/i;->w(LZd/i;)LZd/i;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-static {p2}, LGf/P;->a(LZd/i;)LGf/O;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    iput-object p2, p0, Lv4/e;->i:LGf/O;

    .line 54
    .line 55
    new-instance p2, LL4/t;

    .line 56
    .line 57
    invoke-virtual {p8}, LL4/o;->d()Z

    .line 58
    .line 59
    .line 60
    move-result p6

    .line 61
    invoke-direct {p2, p0, p1, p6}, LL4/t;-><init>(Lv4/e;Landroid/content/Context;Z)V

    .line 62
    .line 63
    .line 64
    iput-object p2, p0, Lv4/e;->j:LL4/t;

    .line 65
    .line 66
    new-instance p1, LG4/p;

    .line 67
    .line 68
    invoke-direct {p1, p0, p2, p3}, LG4/p;-><init>(Lv4/d;LL4/t;LL4/r;)V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, Lv4/e;->k:LG4/p;

    .line 72
    .line 73
    invoke-virtual {p7}, Lv4/a;->h()Lv4/a$a;

    .line 74
    .line 75
    .line 76
    move-result-object p6

    .line 77
    new-instance p7, LD4/c;

    .line 78
    .line 79
    invoke-direct {p7}, LD4/c;-><init>()V

    .line 80
    .line 81
    .line 82
    const-class p9, Ldg/u;

    .line 83
    .line 84
    invoke-virtual {p6, p7, p9}, Lv4/a$a;->d(LD4/d;Ljava/lang/Class;)Lv4/a$a;

    .line 85
    .line 86
    .line 87
    move-result-object p6

    .line 88
    new-instance p7, LD4/g;

    .line 89
    .line 90
    invoke-direct {p7}, LD4/g;-><init>()V

    .line 91
    .line 92
    .line 93
    const-class p9, Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {p6, p7, p9}, Lv4/a$a;->d(LD4/d;Ljava/lang/Class;)Lv4/a$a;

    .line 96
    .line 97
    .line 98
    move-result-object p6

    .line 99
    new-instance p7, LD4/b;

    .line 100
    .line 101
    invoke-direct {p7}, LD4/b;-><init>()V

    .line 102
    .line 103
    .line 104
    const-class p9, Landroid/net/Uri;

    .line 105
    .line 106
    invoke-virtual {p6, p7, p9}, Lv4/a$a;->d(LD4/d;Ljava/lang/Class;)Lv4/a$a;

    .line 107
    .line 108
    .line 109
    move-result-object p6

    .line 110
    new-instance p7, LD4/f;

    .line 111
    .line 112
    invoke-direct {p7}, LD4/f;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p6, p7, p9}, Lv4/a$a;->d(LD4/d;Ljava/lang/Class;)Lv4/a$a;

    .line 116
    .line 117
    .line 118
    move-result-object p6

    .line 119
    new-instance p7, LD4/e;

    .line 120
    .line 121
    invoke-direct {p7}, LD4/e;-><init>()V

    .line 122
    .line 123
    .line 124
    const-class v0, Ljava/lang/Integer;

    .line 125
    .line 126
    invoke-virtual {p6, p7, v0}, Lv4/a$a;->d(LD4/d;Ljava/lang/Class;)Lv4/a$a;

    .line 127
    .line 128
    .line 129
    move-result-object p6

    .line 130
    new-instance p7, LD4/a;

    .line 131
    .line 132
    invoke-direct {p7}, LD4/a;-><init>()V

    .line 133
    .line 134
    .line 135
    const-class v0, [B

    .line 136
    .line 137
    invoke-virtual {p6, p7, v0}, Lv4/a$a;->d(LD4/d;Ljava/lang/Class;)Lv4/a$a;

    .line 138
    .line 139
    .line 140
    move-result-object p6

    .line 141
    new-instance p7, LC4/c;

    .line 142
    .line 143
    invoke-direct {p7}, LC4/c;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p6, p7, p9}, Lv4/a$a;->c(LC4/b;Ljava/lang/Class;)Lv4/a$a;

    .line 147
    .line 148
    .line 149
    move-result-object p6

    .line 150
    new-instance p7, LC4/a;

    .line 151
    .line 152
    invoke-virtual {p8}, LL4/o;->a()Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    invoke-direct {p7, v0}, LC4/a;-><init>(Z)V

    .line 157
    .line 158
    .line 159
    const-class v0, Ljava/io/File;

    .line 160
    .line 161
    invoke-virtual {p6, p7, v0}, Lv4/a$a;->c(LC4/b;Ljava/lang/Class;)Lv4/a$a;

    .line 162
    .line 163
    .line 164
    move-result-object p6

    .line 165
    new-instance p7, LA4/k$b;

    .line 166
    .line 167
    invoke-virtual {p8}, LL4/o;->e()Z

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    invoke-direct {p7, p5, p4, v1}, LA4/k$b;-><init>(Lkotlin/Lazy;Lkotlin/Lazy;Z)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p6, p7, p9}, Lv4/a$a;->a(LA4/i$a;Ljava/lang/Class;)Lv4/a$a;

    .line 175
    .line 176
    .line 177
    move-result-object p4

    .line 178
    new-instance p5, LA4/j$a;

    .line 179
    .line 180
    invoke-direct {p5}, LA4/j$a;-><init>()V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p4, p5, v0}, Lv4/a$a;->a(LA4/i$a;Ljava/lang/Class;)Lv4/a$a;

    .line 184
    .line 185
    .line 186
    move-result-object p4

    .line 187
    new-instance p5, LA4/a$a;

    .line 188
    .line 189
    invoke-direct {p5}, LA4/a$a;-><init>()V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p4, p5, p9}, Lv4/a$a;->a(LA4/i$a;Ljava/lang/Class;)Lv4/a$a;

    .line 193
    .line 194
    .line 195
    move-result-object p4

    .line 196
    new-instance p5, LA4/e$a;

    .line 197
    .line 198
    invoke-direct {p5}, LA4/e$a;-><init>()V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p4, p5, p9}, Lv4/a$a;->a(LA4/i$a;Ljava/lang/Class;)Lv4/a$a;

    .line 202
    .line 203
    .line 204
    move-result-object p4

    .line 205
    new-instance p5, LA4/l$b;

    .line 206
    .line 207
    invoke-direct {p5}, LA4/l$b;-><init>()V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p4, p5, p9}, Lv4/a$a;->a(LA4/i$a;Ljava/lang/Class;)Lv4/a$a;

    .line 211
    .line 212
    .line 213
    move-result-object p4

    .line 214
    new-instance p5, LA4/f$a;

    .line 215
    .line 216
    invoke-direct {p5}, LA4/f$a;-><init>()V

    .line 217
    .line 218
    .line 219
    const-class p6, Landroid/graphics/drawable/Drawable;

    .line 220
    .line 221
    invoke-virtual {p4, p5, p6}, Lv4/a$a;->a(LA4/i$a;Ljava/lang/Class;)Lv4/a$a;

    .line 222
    .line 223
    .line 224
    move-result-object p4

    .line 225
    new-instance p5, LA4/b$a;

    .line 226
    .line 227
    invoke-direct {p5}, LA4/b$a;-><init>()V

    .line 228
    .line 229
    .line 230
    const-class p6, Landroid/graphics/Bitmap;

    .line 231
    .line 232
    invoke-virtual {p4, p5, p6}, Lv4/a$a;->a(LA4/i$a;Ljava/lang/Class;)Lv4/a$a;

    .line 233
    .line 234
    .line 235
    move-result-object p4

    .line 236
    new-instance p5, LA4/c$a;

    .line 237
    .line 238
    invoke-direct {p5}, LA4/c$a;-><init>()V

    .line 239
    .line 240
    .line 241
    const-class p6, Ljava/nio/ByteBuffer;

    .line 242
    .line 243
    invoke-virtual {p4, p5, p6}, Lv4/a$a;->a(LA4/i$a;Ljava/lang/Class;)Lv4/a$a;

    .line 244
    .line 245
    .line 246
    move-result-object p4

    .line 247
    new-instance p5, Lx4/d$c;

    .line 248
    .line 249
    invoke-virtual {p8}, LL4/o;->c()I

    .line 250
    .line 251
    .line 252
    move-result p6

    .line 253
    invoke-virtual {p8}, LL4/o;->b()Lx4/l;

    .line 254
    .line 255
    .line 256
    move-result-object p7

    .line 257
    invoke-direct {p5, p6, p7}, Lx4/d$c;-><init>(ILx4/l;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {p4, p5}, Lv4/a$a;->e(Lx4/i$a;)Lv4/a$a;

    .line 261
    .line 262
    .line 263
    move-result-object p4

    .line 264
    invoke-virtual {p4}, Lv4/a$a;->f()Lv4/a;

    .line 265
    .line 266
    .line 267
    move-result-object p4

    .line 268
    iput-object p4, p0, Lv4/e;->l:Lv4/a;

    .line 269
    .line 270
    invoke-virtual {p0}, Lv4/e;->getComponents()Lv4/a;

    .line 271
    .line 272
    .line 273
    move-result-object p4

    .line 274
    invoke-virtual {p4}, Lv4/a;->c()Ljava/util/List;

    .line 275
    .line 276
    .line 277
    move-result-object p4

    .line 278
    new-instance p5, LB4/a;

    .line 279
    .line 280
    invoke-direct {p5, p0, p1, p3}, LB4/a;-><init>(Lv4/d;LG4/p;LL4/r;)V

    .line 281
    .line 282
    .line 283
    invoke-static {p4, p5}, LUd/u;->J0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    iput-object p1, p0, Lv4/e;->m:Ljava/util/List;

    .line 288
    .line 289
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 290
    .line 291
    const/4 p3, 0x0

    .line 292
    invoke-direct {p1, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 293
    .line 294
    .line 295
    iput-object p1, p0, Lv4/e;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 296
    .line 297
    invoke-virtual {p2}, LL4/t;->c()V

    .line 298
    .line 299
    .line 300
    return-void
.end method

.method public static final synthetic e(Lv4/e;LG4/h;ILZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lv4/e;->g(LG4/h;ILZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic f(Lv4/e;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lv4/e;->m:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method private final g(LG4/h;ILZd/e;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    instance-of v3, v2, Lv4/e$d;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lv4/e$d;

    .line 13
    .line 14
    iget v4, v3, Lv4/e$d;->h:I

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
    iput v4, v3, Lv4/e$d;->h:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Lv4/e$d;

    .line 27
    .line 28
    invoke-direct {v3, v1, v2}, Lv4/e$d;-><init>(Lv4/e;LZd/e;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, Lv4/e$d;->f:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget v5, v3, Lv4/e$d;->h:I

    .line 38
    .line 39
    const/4 v6, 0x3

    .line 40
    const/4 v7, 0x2

    .line 41
    const/4 v8, 0x1

    .line 42
    const/4 v9, 0x0

    .line 43
    if-eqz v5, :cond_4

    .line 44
    .line 45
    if-eq v5, v8, :cond_3

    .line 46
    .line 47
    if-eq v5, v7, :cond_2

    .line 48
    .line 49
    if-ne v5, v6, :cond_1

    .line 50
    .line 51
    iget-object v0, v3, Lv4/e$d;->d:Ljava/lang/Object;

    .line 52
    .line 53
    move-object v4, v0

    .line 54
    check-cast v4, Lv4/b;

    .line 55
    .line 56
    iget-object v0, v3, Lv4/e$d;->c:Ljava/lang/Object;

    .line 57
    .line 58
    move-object v5, v0

    .line 59
    check-cast v5, LG4/h;

    .line 60
    .line 61
    iget-object v0, v3, Lv4/e$d;->b:Ljava/lang/Object;

    .line 62
    .line 63
    move-object v6, v0

    .line 64
    check-cast v6, LG4/o;

    .line 65
    .line 66
    iget-object v0, v3, Lv4/e$d;->a:Ljava/lang/Object;

    .line 67
    .line 68
    move-object v3, v0

    .line 69
    check-cast v3, Lv4/e;

    .line 70
    .line 71
    :try_start_0
    invoke-static {v2}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    .line 73
    .line 74
    goto/16 :goto_a

    .line 75
    .line 76
    :catchall_0
    move-exception v0

    .line 77
    goto/16 :goto_d

    .line 78
    .line 79
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 80
    .line 81
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 82
    .line 83
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v0

    .line 87
    :cond_2
    iget-object v0, v3, Lv4/e$d;->e:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Landroid/graphics/Bitmap;

    .line 90
    .line 91
    iget-object v5, v3, Lv4/e$d;->d:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v5, Lv4/b;

    .line 94
    .line 95
    iget-object v7, v3, Lv4/e$d;->c:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v7, LG4/h;

    .line 98
    .line 99
    iget-object v8, v3, Lv4/e$d;->b:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v8, LG4/o;

    .line 102
    .line 103
    iget-object v10, v3, Lv4/e$d;->a:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v10, Lv4/e;

    .line 106
    .line 107
    :try_start_1
    invoke-static {v2}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 108
    .line 109
    .line 110
    move-object v13, v7

    .line 111
    move-object v14, v10

    .line 112
    :goto_1
    move-object/from16 v17, v0

    .line 113
    .line 114
    goto/16 :goto_8

    .line 115
    .line 116
    :catchall_1
    move-exception v0

    .line 117
    move-object v4, v5

    .line 118
    move-object v5, v7

    .line 119
    move-object v6, v8

    .line 120
    move-object v3, v10

    .line 121
    goto/16 :goto_d

    .line 122
    .line 123
    :cond_3
    iget-object v0, v3, Lv4/e$d;->d:Ljava/lang/Object;

    .line 124
    .line 125
    move-object v5, v0

    .line 126
    check-cast v5, Lv4/b;

    .line 127
    .line 128
    iget-object v0, v3, Lv4/e$d;->c:Ljava/lang/Object;

    .line 129
    .line 130
    move-object v8, v0

    .line 131
    check-cast v8, LG4/h;

    .line 132
    .line 133
    iget-object v0, v3, Lv4/e$d;->b:Ljava/lang/Object;

    .line 134
    .line 135
    move-object v10, v0

    .line 136
    check-cast v10, LG4/o;

    .line 137
    .line 138
    iget-object v0, v3, Lv4/e$d;->a:Ljava/lang/Object;

    .line 139
    .line 140
    move-object v11, v0

    .line 141
    check-cast v11, Lv4/e;

    .line 142
    .line 143
    :try_start_2
    invoke-static {v2}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 144
    .line 145
    .line 146
    goto :goto_3

    .line 147
    :catchall_2
    move-exception v0

    .line 148
    move-object v4, v5

    .line 149
    move-object v5, v8

    .line 150
    move-object v6, v10

    .line 151
    :goto_2
    move-object v3, v11

    .line 152
    goto/16 :goto_d

    .line 153
    .line 154
    :cond_4
    invoke-static {v2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    iget-object v2, v1, Lv4/e;->k:LG4/p;

    .line 158
    .line 159
    invoke-interface {v3}, LZd/e;->getContext()LZd/i;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    invoke-static {v5}, LGf/F0;->k(LZd/i;)LGf/C0;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    invoke-virtual {v2, v0, v5}, LG4/p;->g(LG4/h;LGf/C0;)LG4/o;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-interface {v2}, LG4/o;->w()V

    .line 172
    .line 173
    .line 174
    invoke-static {v0, v9, v8, v9}, LG4/h;->R(LG4/h;Landroid/content/Context;ILjava/lang/Object;)LG4/h$a;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-virtual {v1}, Lv4/e;->a()LG4/c;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    invoke-virtual {v0, v5}, LG4/h$a;->d(LG4/c;)LG4/h$a;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {v0}, LG4/h$a;->a()LG4/h;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    iget-object v0, v1, Lv4/e;->f:Lv4/b$c;

    .line 191
    .line 192
    invoke-interface {v0, v5}, Lv4/b$c;->c(LG4/h;)Lv4/b;

    .line 193
    .line 194
    .line 195
    move-result-object v10

    .line 196
    :try_start_3
    invoke-virtual {v5}, LG4/h;->m()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    sget-object v11, LG4/j;->a:LG4/j;

    .line 201
    .line 202
    if-eq v0, v11, :cond_10

    .line 203
    .line 204
    invoke-interface {v2}, LG4/o;->start()V

    .line 205
    .line 206
    .line 207
    if-nez p2, :cond_6

    .line 208
    .line 209
    invoke-virtual {v5}, LG4/h;->z()Landroidx/lifecycle/k;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    iput-object v1, v3, Lv4/e$d;->a:Ljava/lang/Object;

    .line 214
    .line 215
    iput-object v2, v3, Lv4/e$d;->b:Ljava/lang/Object;

    .line 216
    .line 217
    iput-object v5, v3, Lv4/e$d;->c:Ljava/lang/Object;

    .line 218
    .line 219
    iput-object v10, v3, Lv4/e$d;->d:Ljava/lang/Object;

    .line 220
    .line 221
    iput v8, v3, Lv4/e$d;->h:I

    .line 222
    .line 223
    invoke-static {v0, v3}, LL4/g;->a(Landroidx/lifecycle/k;LZd/e;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 227
    if-ne v0, v4, :cond_5

    .line 228
    .line 229
    goto/16 :goto_9

    .line 230
    .line 231
    :cond_5
    move-object v11, v1

    .line 232
    move-object v8, v5

    .line 233
    move-object v5, v10

    .line 234
    move-object v10, v2

    .line 235
    :goto_3
    move-object v2, v10

    .line 236
    goto :goto_4

    .line 237
    :catchall_3
    move-exception v0

    .line 238
    move-object v3, v1

    .line 239
    move-object v6, v2

    .line 240
    move-object v4, v10

    .line 241
    goto/16 :goto_d

    .line 242
    .line 243
    :cond_6
    move-object v11, v1

    .line 244
    move-object v8, v5

    .line 245
    move-object v5, v10

    .line 246
    :goto_4
    :try_start_4
    invoke-virtual {v11}, Lv4/e;->d()LE4/c;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    if-eqz v0, :cond_8

    .line 251
    .line 252
    invoke-virtual {v8}, LG4/h;->G()LE4/c$b;

    .line 253
    .line 254
    .line 255
    move-result-object v10

    .line 256
    if-eqz v10, :cond_7

    .line 257
    .line 258
    invoke-interface {v0, v10}, LE4/c;->b(LE4/c$b;)LE4/c$c;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    goto :goto_5

    .line 263
    :catchall_4
    move-exception v0

    .line 264
    move-object v6, v2

    .line 265
    move-object v4, v5

    .line 266
    move-object v5, v8

    .line 267
    goto :goto_2

    .line 268
    :cond_7
    move-object v0, v9

    .line 269
    :goto_5
    if-eqz v0, :cond_8

    .line 270
    .line 271
    invoke-virtual {v0}, LE4/c$c;->a()Landroid/graphics/Bitmap;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    goto :goto_6

    .line 276
    :cond_8
    move-object v0, v9

    .line 277
    :goto_6
    if-eqz v0, :cond_9

    .line 278
    .line 279
    invoke-virtual {v8}, LG4/h;->l()Landroid/content/Context;

    .line 280
    .line 281
    .line 282
    move-result-object v10

    .line 283
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 284
    .line 285
    .line 286
    move-result-object v10

    .line 287
    new-instance v12, Landroid/graphics/drawable/BitmapDrawable;

    .line 288
    .line 289
    invoke-direct {v12, v10, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 290
    .line 291
    .line 292
    goto :goto_7

    .line 293
    :cond_9
    invoke-virtual {v8}, LG4/h;->F()Landroid/graphics/drawable/Drawable;

    .line 294
    .line 295
    .line 296
    move-result-object v12

    .line 297
    :goto_7
    invoke-virtual {v8}, LG4/h;->M()LI4/a;

    .line 298
    .line 299
    .line 300
    move-result-object v10

    .line 301
    if-eqz v10, :cond_a

    .line 302
    .line 303
    invoke-interface {v10, v12}, LI4/a;->c(Landroid/graphics/drawable/Drawable;)V

    .line 304
    .line 305
    .line 306
    :cond_a
    invoke-interface {v5, v8}, Lv4/b;->c(LG4/h;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v8}, LG4/h;->A()LG4/h$b;

    .line 310
    .line 311
    .line 312
    move-result-object v10

    .line 313
    if-eqz v10, :cond_b

    .line 314
    .line 315
    invoke-interface {v10, v8}, LG4/h$b;->c(LG4/h;)V

    .line 316
    .line 317
    .line 318
    :cond_b
    invoke-interface {v5, v8}, Lv4/b;->r(LG4/h;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v8}, LG4/h;->K()LH4/i;

    .line 322
    .line 323
    .line 324
    move-result-object v10

    .line 325
    iput-object v11, v3, Lv4/e$d;->a:Ljava/lang/Object;

    .line 326
    .line 327
    iput-object v2, v3, Lv4/e$d;->b:Ljava/lang/Object;

    .line 328
    .line 329
    iput-object v8, v3, Lv4/e$d;->c:Ljava/lang/Object;

    .line 330
    .line 331
    iput-object v5, v3, Lv4/e$d;->d:Ljava/lang/Object;

    .line 332
    .line 333
    iput-object v0, v3, Lv4/e$d;->e:Ljava/lang/Object;

    .line 334
    .line 335
    iput v7, v3, Lv4/e$d;->h:I

    .line 336
    .line 337
    invoke-interface {v10, v3}, LH4/i;->c(LZd/e;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 341
    if-ne v7, v4, :cond_c

    .line 342
    .line 343
    goto :goto_9

    .line 344
    :cond_c
    move-object v13, v8

    .line 345
    move-object v14, v11

    .line 346
    move-object v8, v2

    .line 347
    move-object v2, v7

    .line 348
    goto/16 :goto_1

    .line 349
    .line 350
    :goto_8
    :try_start_5
    move-object v15, v2

    .line 351
    check-cast v15, LH4/h;

    .line 352
    .line 353
    invoke-interface {v5, v13, v15}, Lv4/b;->k(LG4/h;LH4/h;)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v13}, LG4/h;->y()LGf/K;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    new-instance v12, Lv4/e$e;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 361
    .line 362
    const/16 v18, 0x0

    .line 363
    .line 364
    move-object/from16 v16, v5

    .line 365
    .line 366
    :try_start_6
    invoke-direct/range {v12 .. v18}, Lv4/e$e;-><init>(LG4/h;Lv4/e;LH4/h;Lv4/b;Landroid/graphics/Bitmap;LZd/e;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 367
    .line 368
    .line 369
    :try_start_7
    iput-object v14, v3, Lv4/e$d;->a:Ljava/lang/Object;

    .line 370
    .line 371
    iput-object v8, v3, Lv4/e$d;->b:Ljava/lang/Object;

    .line 372
    .line 373
    iput-object v13, v3, Lv4/e$d;->c:Ljava/lang/Object;

    .line 374
    .line 375
    iput-object v5, v3, Lv4/e$d;->d:Ljava/lang/Object;

    .line 376
    .line 377
    iput-object v9, v3, Lv4/e$d;->e:Ljava/lang/Object;

    .line 378
    .line 379
    iput v6, v3, Lv4/e$d;->h:I

    .line 380
    .line 381
    invoke-static {v0, v12, v3}, LGf/i;->g(LZd/i;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 385
    if-ne v2, v4, :cond_d

    .line 386
    .line 387
    :goto_9
    return-object v4

    .line 388
    :cond_d
    move-object v4, v5

    .line 389
    move-object v6, v8

    .line 390
    move-object v5, v13

    .line 391
    move-object v3, v14

    .line 392
    :goto_a
    :try_start_8
    check-cast v2, LG4/i;

    .line 393
    .line 394
    instance-of v0, v2, LG4/q;

    .line 395
    .line 396
    if-eqz v0, :cond_e

    .line 397
    .line 398
    move-object v0, v2

    .line 399
    check-cast v0, LG4/q;

    .line 400
    .line 401
    invoke-virtual {v5}, LG4/h;->M()LI4/a;

    .line 402
    .line 403
    .line 404
    move-result-object v7

    .line 405
    invoke-direct {v3, v0, v7, v4}, Lv4/e;->k(LG4/q;LI4/a;Lv4/b;)V

    .line 406
    .line 407
    .line 408
    goto :goto_b

    .line 409
    :cond_e
    instance-of v0, v2, LG4/f;

    .line 410
    .line 411
    if-eqz v0, :cond_f

    .line 412
    .line 413
    move-object v0, v2

    .line 414
    check-cast v0, LG4/f;

    .line 415
    .line 416
    invoke-virtual {v5}, LG4/h;->M()LI4/a;

    .line 417
    .line 418
    .line 419
    move-result-object v7

    .line 420
    invoke-direct {v3, v0, v7, v4}, Lv4/e;->j(LG4/f;LI4/a;Lv4/b;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 421
    .line 422
    .line 423
    :cond_f
    :goto_b
    invoke-interface {v6}, LG4/o;->E()V

    .line 424
    .line 425
    .line 426
    return-object v2

    .line 427
    :catchall_5
    move-exception v0

    .line 428
    :goto_c
    move-object v4, v5

    .line 429
    move-object v6, v8

    .line 430
    move-object v5, v13

    .line 431
    move-object v3, v14

    .line 432
    goto :goto_d

    .line 433
    :catchall_6
    move-exception v0

    .line 434
    move-object/from16 v5, v16

    .line 435
    .line 436
    goto :goto_c

    .line 437
    :cond_10
    :try_start_9
    new-instance v0, LG4/k;

    .line 438
    .line 439
    invoke-direct {v0}, LG4/k;-><init>()V

    .line 440
    .line 441
    .line 442
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 443
    :goto_d
    :try_start_a
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    .line 444
    .line 445
    if-nez v2, :cond_11

    .line 446
    .line 447
    iget-object v2, v3, Lv4/e;->k:LG4/p;

    .line 448
    .line 449
    invoke-virtual {v2, v5, v0}, LG4/p;->b(LG4/h;Ljava/lang/Throwable;)LG4/f;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    invoke-virtual {v5}, LG4/h;->M()LI4/a;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    invoke-direct {v3, v0, v2, v4}, Lv4/e;->j(LG4/f;LI4/a;Lv4/b;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 458
    .line 459
    .line 460
    invoke-interface {v6}, LG4/o;->E()V

    .line 461
    .line 462
    .line 463
    return-object v0

    .line 464
    :catchall_7
    move-exception v0

    .line 465
    goto :goto_e

    .line 466
    :cond_11
    :try_start_b
    invoke-direct {v3, v5, v4}, Lv4/e;->i(LG4/h;Lv4/b;)V

    .line 467
    .line 468
    .line 469
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 470
    :goto_e
    invoke-interface {v6}, LG4/o;->E()V

    .line 471
    .line 472
    .line 473
    throw v0
.end method

.method private final i(LG4/h;Lv4/b;)V
    .locals 0

    .line 1
    invoke-interface {p2, p1}, Lv4/b;->d(LG4/h;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, LG4/h;->A()LG4/h$b;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    invoke-interface {p2, p1}, LG4/h$b;->d(LG4/h;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method private final j(LG4/f;LI4/a;Lv4/b;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, LG4/f;->b()LG4/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, p2, LK4/d;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    if-eqz p2, :cond_2

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p1}, LG4/i;->b()LG4/h;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, LG4/h;->P()LK4/c$a;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    move-object v2, p2

    .line 21
    check-cast v2, LK4/d;

    .line 22
    .line 23
    invoke-interface {v1, v2, p1}, LK4/c$a;->a(LK4/d;LG4/i;)LK4/c;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    instance-of v2, v1, LK4/b;

    .line 28
    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    :goto_0
    invoke-virtual {p1}, LG4/f;->a()Landroid/graphics/drawable/Drawable;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {p2, v1}, LI4/a;->d(Landroid/graphics/drawable/Drawable;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {p1}, LG4/i;->b()LG4/h;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-interface {p3, p2, v1}, Lv4/b;->o(LG4/h;LK4/c;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v1}, LK4/c;->a()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, LG4/i;->b()LG4/h;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-interface {p3, p2, v1}, Lv4/b;->p(LG4/h;LK4/c;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    :goto_1
    invoke-interface {p3, v0, p1}, Lv4/b;->a(LG4/h;LG4/f;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, LG4/h;->A()LG4/h$b;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    if-eqz p2, :cond_3

    .line 64
    .line 65
    invoke-interface {p2, v0, p1}, LG4/h$b;->a(LG4/h;LG4/f;)V

    .line 66
    .line 67
    .line 68
    :cond_3
    return-void
.end method

.method private final k(LG4/q;LI4/a;Lv4/b;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, LG4/q;->b()LG4/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, LG4/q;->c()Lx4/f;

    .line 6
    .line 7
    .line 8
    instance-of v1, p2, LK4/d;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    if-eqz p2, :cond_2

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p1}, LG4/i;->b()LG4/h;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, LG4/h;->P()LK4/c$a;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    move-object v2, p2

    .line 24
    check-cast v2, LK4/d;

    .line 25
    .line 26
    invoke-interface {v1, v2, p1}, LK4/c$a;->a(LK4/d;LG4/i;)LK4/c;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    instance-of v2, v1, LK4/b;

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    :goto_0
    invoke-virtual {p1}, LG4/q;->a()Landroid/graphics/drawable/Drawable;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-interface {p2, v1}, LI4/a;->a(Landroid/graphics/drawable/Drawable;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {p1}, LG4/i;->b()LG4/h;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-interface {p3, p2, v1}, Lv4/b;->o(LG4/h;LK4/c;)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v1}, LK4/c;->a()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, LG4/i;->b()LG4/h;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-interface {p3, p2, v1}, Lv4/b;->p(LG4/h;LK4/c;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    :goto_1
    invoke-interface {p3, v0, p1}, Lv4/b;->b(LG4/h;LG4/q;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, LG4/h;->A()LG4/h$b;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    if-eqz p2, :cond_3

    .line 67
    .line 68
    invoke-interface {p2, v0, p1}, LG4/h$b;->b(LG4/h;LG4/q;)V

    .line 69
    .line 70
    .line 71
    :cond_3
    return-void
.end method


# virtual methods
.method public a()LG4/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/e;->b:LG4/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public b(LG4/h;)LG4/e;
    .locals 6

    .line 1
    iget-object v0, p0, Lv4/e;->i:LGf/O;

    .line 2
    .line 3
    new-instance v3, Lv4/e$b;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v3, p0, p1, v1}, Lv4/e$b;-><init>(Lv4/e;LG4/h;LZd/e;)V

    .line 7
    .line 8
    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-static/range {v0 .. v5}, LGf/i;->b(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/W;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1}, LG4/h;->M()LI4/a;

    .line 17
    .line 18
    .line 19
    new-instance p1, LG4/l;

    .line 20
    .line 21
    invoke-direct {p1, v0}, LG4/l;-><init>(LGf/W;)V

    .line 22
    .line 23
    .line 24
    return-object p1
.end method

.method public c(LG4/h;LZd/e;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lv4/e$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, p0, v1}, Lv4/e$c;-><init>(LG4/h;Lv4/e;LZd/e;)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p2}, LGf/P;->e(Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public d()LE4/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/e;->c:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LE4/c;

    .line 8
    .line 9
    return-object v0
.end method

.method public getComponents()Lv4/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/e;->l:Lv4/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()LL4/r;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final l(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/e;->c:Lkotlin/Lazy;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, LE4/c;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v0, p1}, LE4/c;->a(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
