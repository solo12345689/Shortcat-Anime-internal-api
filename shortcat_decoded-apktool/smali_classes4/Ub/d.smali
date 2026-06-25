.class public final LUb/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lic/b;


# instance fields
.field private final a:Lpb/b;

.field private final b:Llc/a;

.field private final c:Lkotlin/Lazy;

.field private final d:LUb/x;

.field private e:Z

.field private final f:LHf/g;

.field private final g:LGf/O;

.field private final h:LGf/O;

.field private final i:LGf/O;

.field private final j:LUb/s;

.field private final k:Lexpo/modules/kotlin/services/a;

.field private l:Ljava/lang/ref/WeakReference;

.field private final m:LWb/a;

.field private final n:LWb/m;

.field private final o:Lkotlin/Lazy;

.field private final p:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(LUb/t;Lpb/b;Ljava/lang/ref/WeakReference;)V
    .locals 8

    .line 1
    const-string v0, "modulesProvider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "legacyModuleRegistry"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "reactContextHolder"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, LUb/d;->a:Lpb/b;

    .line 20
    .line 21
    new-instance v0, Llc/a;

    .line 22
    .line 23
    invoke-direct {v0, p0, p3}, Llc/a;-><init>(LUb/d;Ljava/lang/ref/WeakReference;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, LUb/d;->b:Llc/a;

    .line 27
    .line 28
    new-instance v0, LUb/a;

    .line 29
    .line 30
    invoke-direct {v0, p0, p3}, LUb/a;-><init>(LUb/d;Ljava/lang/ref/WeakReference;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, LUb/d;->c:Lkotlin/Lazy;

    .line 38
    .line 39
    new-instance v0, LUb/x;

    .line 40
    .line 41
    invoke-direct {v0, p0}, LUb/x;-><init>(LUb/d;)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, LUb/d;->d:LUb/x;

    .line 45
    .line 46
    new-instance v1, Landroid/os/HandlerThread;

    .line 47
    .line 48
    const-string v2, "expo.modules.AsyncFunctionQueue"

    .line 49
    .line 50
    invoke-direct {v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    new-instance v3, Landroid/os/Handler;

    .line 61
    .line 62
    invoke-direct {v3, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 63
    .line 64
    .line 65
    const/4 v1, 0x0

    .line 66
    const/4 v4, 0x1

    .line 67
    invoke-static {v3, v1, v4, v1}, LHf/h;->c(Landroid/os/Handler;Ljava/lang/String;ILjava/lang/Object;)LHf/g;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    iput-object v3, p0, LUb/d;->f:LHf/g;

    .line 72
    .line 73
    invoke-static {}, LGf/f0;->b()LGf/K;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-static {v1, v4, v1}, LGf/X0;->b(LGf/C0;ILjava/lang/Object;)LGf/A;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-virtual {v5, v6}, LZd/a;->w(LZd/i;)LZd/i;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    new-instance v6, LGf/N;

    .line 86
    .line 87
    const-string v7, "expo.modules.BackgroundCoroutineScope"

    .line 88
    .line 89
    invoke-direct {v6, v7}, LGf/N;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-interface {v5, v6}, LZd/i;->w(LZd/i;)LZd/i;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    invoke-static {v5}, LGf/P;->a(LZd/i;)LGf/O;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    iput-object v5, p0, LUb/d;->g:LGf/O;

    .line 101
    .line 102
    invoke-static {v1, v4, v1}, LGf/X0;->b(LGf/C0;ILjava/lang/Object;)LGf/A;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    invoke-virtual {v3, v5}, LZd/a;->w(LZd/i;)LZd/i;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    new-instance v5, LGf/N;

    .line 111
    .line 112
    invoke-direct {v5, v2}, LGf/N;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-interface {v3, v5}, LZd/i;->w(LZd/i;)LZd/i;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-static {v2}, LGf/P;->a(LZd/i;)LGf/O;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    iput-object v2, p0, LUb/d;->h:LGf/O;

    .line 124
    .line 125
    invoke-static {}, LGf/f0;->c()LGf/M0;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-static {v1, v4, v1}, LGf/X0;->b(LGf/C0;ILjava/lang/Object;)LGf/A;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-virtual {v2, v3}, LZd/a;->w(LZd/i;)LZd/i;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    new-instance v3, LGf/N;

    .line 138
    .line 139
    const-string v4, "expo.modules.MainQueue"

    .line 140
    .line 141
    invoke-direct {v3, v4}, LGf/N;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-interface {v2, v3}, LZd/i;->w(LZd/i;)LZd/i;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-static {v2}, LGf/P;->a(LZd/i;)LGf/O;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    iput-object v2, p0, LUb/d;->i:LGf/O;

    .line 153
    .line 154
    new-instance v2, LUb/s;

    .line 155
    .line 156
    invoke-static {p0}, LUb/A;->a(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    invoke-direct {v2, v3}, LUb/s;-><init>(Ljava/lang/ref/WeakReference;)V

    .line 161
    .line 162
    .line 163
    iput-object v2, p0, LUb/d;->j:LUb/s;

    .line 164
    .line 165
    new-instance v3, Lexpo/modules/kotlin/services/a;

    .line 166
    .line 167
    invoke-static {p0}, LUb/A;->a(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    invoke-direct {v3, v4}, Lexpo/modules/kotlin/services/a;-><init>(Ljava/lang/ref/WeakReference;)V

    .line 172
    .line 173
    .line 174
    iput-object v3, p0, LUb/d;->k:Lexpo/modules/kotlin/services/a;

    .line 175
    .line 176
    new-instance v4, LWb/a;

    .line 177
    .line 178
    invoke-direct {v4, p0}, LWb/a;-><init>(Lic/b;)V

    .line 179
    .line 180
    .line 181
    iput-object v4, p0, LUb/d;->m:LWb/a;

    .line 182
    .line 183
    new-instance v5, LWb/m;

    .line 184
    .line 185
    invoke-direct {v5, v4}, LWb/m;-><init>(LWb/a;)V

    .line 186
    .line 187
    .line 188
    iput-object v5, p0, LUb/d;->n:LWb/m;

    .line 189
    .line 190
    invoke-virtual {p3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p3

    .line 194
    if-eqz p3, :cond_0

    .line 195
    .line 196
    check-cast p3, Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 197
    .line 198
    invoke-virtual {p2, p0}, Lpb/b;->g(LUb/d;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p3, v0}, Lcom/facebook/react/bridge/ReactContext;->addLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {p3, v0}, Lcom/facebook/react/bridge/ReactContext;->addActivityEventListener(Lcom/facebook/react/bridge/ActivityEventListener;)V

    .line 205
    .line 206
    .line 207
    const-class p2, Lexpo/modules/kotlin/services/FilePermissionService;

    .line 208
    .line 209
    invoke-virtual {v3, p2}, Lexpo/modules/kotlin/services/a;->c(Ljava/lang/Class;)Lexpo/modules/kotlin/services/a;

    .line 210
    .line 211
    .line 212
    const-class p2, Lexpo/modules/kotlin/services/AppDirectoriesService;

    .line 213
    .line 214
    invoke-virtual {v3, p2}, Lexpo/modules/kotlin/services/a;->c(Ljava/lang/Class;)Lexpo/modules/kotlin/services/a;

    .line 215
    .line 216
    .line 217
    invoke-interface {p1}, LUb/t;->getServices()Ljava/util/List;

    .line 218
    .line 219
    .line 220
    move-result-object p2

    .line 221
    invoke-virtual {v3, p2}, Lexpo/modules/kotlin/services/a;->d(Ljava/util/List;)Lexpo/modules/kotlin/services/a;

    .line 222
    .line 223
    .line 224
    new-instance p2, LZb/d;

    .line 225
    .line 226
    invoke-direct {p2}, LZb/d;-><init>()V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2, p2, v1}, LUb/s;->F(Lgc/c;Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    new-instance p2, LZb/b;

    .line 233
    .line 234
    invoke-direct {p2}, LZb/b;-><init>()V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2, p2, v1}, LUb/s;->F(Lgc/c;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v2, p1}, LUb/s;->D(LUb/t;)LUb/s;

    .line 241
    .line 242
    .line 243
    invoke-direct {p0}, LUb/d;->R()V

    .line 244
    .line 245
    .line 246
    invoke-static {}, LUb/f;->a()Lub/d;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    const-string p2, "\u2705 AppContext was initialized"

    .line 251
    .line 252
    invoke-virtual {p1, p2}, Lub/d;->d(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    new-instance p1, LUb/b;

    .line 256
    .line 257
    invoke-direct {p1, p0}, LUb/b;-><init>(LUb/d;)V

    .line 258
    .line 259
    .line 260
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    iput-object p1, p0, LUb/d;->o:Lkotlin/Lazy;

    .line 265
    .line 266
    new-instance p1, LUb/c;

    .line 267
    .line 268
    invoke-direct {p1, p0}, LUb/c;-><init>(LUb/d;)V

    .line 269
    .line 270
    .line 271
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    iput-object p1, p0, LUb/d;->p:Lkotlin/Lazy;

    .line 276
    .line 277
    return-void

    .line 278
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 279
    .line 280
    const-string p2, "The app context should be created with valid react context."

    .line 281
    .line 282
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    throw p1
.end method

.method private static final I(LUb/d;)Lub/d;
    .locals 3

    .line 1
    iget-object p0, p0, LUb/d;->j:LUb/s;

    .line 2
    .line 3
    invoke-virtual {p0}, LUb/s;->t()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/Iterable;

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    move-object v2, v0

    .line 29
    check-cast v2, LUb/r;

    .line 30
    .line 31
    invoke-virtual {v2}, LUb/r;->g()Lgc/c;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    instance-of v2, v2, LZb/b;

    .line 36
    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move-object v0, v1

    .line 41
    :goto_0
    check-cast v0, LUb/r;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-virtual {v0}, LUb/r;->g()Lgc/c;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move-object p0, v1

    .line 51
    :goto_1
    instance-of v0, p0, LZb/b;

    .line 52
    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    move-object p0, v1

    .line 56
    :cond_3
    check-cast p0, LZb/b;

    .line 57
    .line 58
    if-eqz p0, :cond_4

    .line 59
    .line 60
    invoke-virtual {p0}, LZb/b;->A()Lub/d;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_4
    return-object v1
.end method

.method private final R()V
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "inline.modules.ExpoInlineModulesList"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "null cannot be cast to non-null type expo.modules.kotlin.ModulesProvider"

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    check-cast v0, LUb/t;

    .line 22
    .line 23
    iget-object v1, p0, LUb/d;->j:LUb/s;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, LUb/s;->D(LUb/t;)LUb/s;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    :catch_0
    return-void
.end method

.method private static final T(LUb/d;Ljava/lang/ref/WeakReference;)Llc/c;
    .locals 1

    .line 1
    new-instance v0, Llc/c;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Llc/c;-><init>(LUb/d;Ljava/lang/ref/WeakReference;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic b(LUb/d;Ljava/lang/ref/WeakReference;)Llc/c;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LUb/d;->T(LUb/d;Ljava/lang/ref/WeakReference;)Llc/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(LUb/d;)Lub/d;
    .locals 0

    .line 1
    invoke-static {p0}, LUb/d;->I(LUb/d;)Lub/d;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic d(LUb/d;)LZb/b;
    .locals 0

    .line 1
    invoke-static {p0}, LUb/d;->h(LUb/d;)LZb/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic e(LUb/d;)LUb/x;
    .locals 0

    .line 1
    iget-object p0, p0, LUb/d;->d:LUb/x;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(LUb/d;)Lkotlin/Lazy;
    .locals 0

    .line 1
    iget-object p0, p0, LUb/d;->c:Lkotlin/Lazy;

    .line 2
    .line 3
    return-object p0
.end method

.method private static final h(LUb/d;)LZb/b;
    .locals 3

    .line 1
    iget-object p0, p0, LUb/d;->j:LUb/s;

    .line 2
    .line 3
    invoke-virtual {p0}, LUb/s;->t()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/Iterable;

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    move-object v2, v0

    .line 29
    check-cast v2, LUb/r;

    .line 30
    .line 31
    invoke-virtual {v2}, LUb/r;->g()Lgc/c;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    instance-of v2, v2, LZb/b;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v2, 0x1

    .line 41
    :goto_0
    if-eqz v2, :cond_0

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move-object v0, v1

    .line 45
    :goto_1
    check-cast v0, LUb/r;

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    invoke-virtual {v0}, LUb/r;->g()Lgc/c;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    goto :goto_2

    .line 54
    :cond_3
    move-object p0, v1

    .line 55
    :goto_2
    instance-of v0, p0, LZb/b;

    .line 56
    .line 57
    if-nez v0, :cond_4

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_4
    move-object v1, p0

    .line 61
    :goto_3
    check-cast v1, LZb/b;

    .line 62
    .line 63
    return-object v1
.end method

.method private final n()Lexpo/modules/kotlin/services/AppDirectoriesService;
    .locals 2

    .line 1
    invoke-virtual {p0}, LUb/d;->E()Lexpo/modules/kotlin/services/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lexpo/modules/kotlin/services/a;->a()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-class v1, Lexpo/modules/kotlin/services/AppDirectoriesService;

    .line 10
    .line 11
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    instance-of v1, v0, Lexpo/modules/kotlin/services/AppDirectoriesService;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    :cond_0
    check-cast v0, Lexpo/modules/kotlin/services/AppDirectoriesService;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v1, "AppDirectoriesService is not registered in the ServicesRegistry."

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0
.end method


# virtual methods
.method public final A()Ljava/io/File;
    .locals 1

    .line 1
    invoke-direct {p0}, LUb/d;->n()Lexpo/modules/kotlin/services/AppDirectoriesService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lexpo/modules/kotlin/services/AppDirectoriesService;->c()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final B()Landroid/content/Context;
    .locals 1

    .line 1
    invoke-virtual {p0}, LUb/d;->D()Llc/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Llc/a;->j()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final C()LUb/s;
    .locals 1

    .line 1
    iget-object v0, p0, LUb/d;->j:LUb/s;

    .line 2
    .line 3
    return-object v0
.end method

.method public final D()Llc/a;
    .locals 1

    .line 1
    iget-object v0, p0, LUb/d;->b:Llc/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final E()Lexpo/modules/kotlin/services/a;
    .locals 1

    .line 1
    iget-object v0, p0, LUb/d;->k:Lexpo/modules/kotlin/services/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F()Landroid/app/Activity;
    .locals 3

    .line 1
    invoke-virtual {p0}, LUb/d;->l()Lsb/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Lsb/a;->a()Landroid/app/Activity;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_3

    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, LUb/d;->B()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    instance-of v1, v0, Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    check-cast v0, Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move-object v0, v2

    .line 26
    :goto_0
    if-eqz v0, :cond_2

    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    move-object v0, v2

    .line 34
    :cond_3
    :goto_1
    if-eqz v0, :cond_4

    .line 35
    .line 36
    return-object v0

    .line 37
    :cond_4
    new-instance v0, Lcc/h;

    .line 38
    .line 39
    invoke-direct {v0}, Lcc/h;-><init>()V

    .line 40
    .line 41
    .line 42
    throw v0
.end method

.method public final G()Llc/c;
    .locals 1

    .line 1
    iget-object v0, p0, LUb/d;->c:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Llc/c;

    .line 8
    .line 9
    return-object v0
.end method

.method public final H()V
    .locals 1

    .line 1
    invoke-virtual {p0}, LUb/d;->D()Llc/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Llc/a;->l()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final J(Landroid/app/Activity;IILandroid/content/Intent;)V
    .locals 3

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LUb/d;->m:LWb/a;

    .line 7
    .line 8
    invoke-virtual {v0, p2, p3, p4}, LWb/a;->f(IILandroid/content/Intent;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LUb/d;->j:LUb/s;

    .line 12
    .line 13
    sget-object v1, Lbc/e;->g:Lbc/e;

    .line 14
    .line 15
    new-instance v2, Lbc/j;

    .line 16
    .line 17
    invoke-direct {v2, p2, p3, p4}, Lbc/j;-><init>(IILandroid/content/Intent;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1, p1, v2}, LUb/s;->z(Lbc/e;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final K()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "["

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, "ExpoModulesCore"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, "] "

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v1, "AppContext.onCreate"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, LX3/a;->c(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :try_start_0
    invoke-virtual {p0}, LUb/d;->C()LUb/s;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, LUb/s;->A()V

    .line 38
    .line 39
    .line 40
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    invoke-static {}, LX3/a;->f()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    invoke-static {}, LX3/a;->f()V

    .line 48
    .line 49
    .line 50
    throw v0
.end method

.method public final L()V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "["

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, "ExpoModulesCore"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, "] "

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v1, "AppContext.onDestroy"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, LX3/a;->c(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :try_start_0
    invoke-virtual {p0}, LUb/d;->D()Llc/a;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Llc/a;->j()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    invoke-static {p0}, LUb/d;->e(LUb/d;)LUb/x;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->removeLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    .line 48
    .line 49
    .line 50
    invoke-static {p0}, LUb/d;->e(LUb/d;)LUb/x;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->removeActivityEventListener(Lcom/facebook/react/bridge/ActivityEventListener;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catchall_0
    move-exception v0

    .line 59
    goto :goto_1

    .line 60
    :cond_0
    :goto_0
    invoke-virtual {p0}, LUb/d;->C()LUb/s;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sget-object v1, Lbc/e;->b:Lbc/e;

    .line 65
    .line 66
    invoke-virtual {v0, v1}, LUb/s;->w(Lbc/e;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, LUb/s;->f()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, LUb/d;->y()LGf/O;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    new-instance v1, Lrb/c;

    .line 77
    .line 78
    const/4 v2, 0x1

    .line 79
    const/4 v3, 0x0

    .line 80
    invoke-direct {v1, v3, v2, v3}, Lrb/c;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v0, v1}, LGf/P;->c(LGf/O;Ljava/util/concurrent/CancellationException;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, LUb/d;->x()LGf/O;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    new-instance v1, Lrb/c;

    .line 91
    .line 92
    invoke-direct {v1, v3, v2, v3}, Lrb/c;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 93
    .line 94
    .line 95
    invoke-static {v0, v1}, LGf/P;->c(LGf/O;Ljava/util/concurrent/CancellationException;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, LUb/d;->o()LGf/O;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    new-instance v1, Lrb/c;

    .line 103
    .line 104
    invoke-direct {v1, v3, v2, v3}, Lrb/c;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v0, v1}, LGf/P;->c(LGf/O;Ljava/util/concurrent/CancellationException;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, LUb/d;->D()Llc/a;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v0}, Llc/a;->f()V

    .line 115
    .line 116
    .line 117
    invoke-static {p0}, LUb/d;->f(LUb/d;)Lkotlin/Lazy;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-interface {v0}, Lkotlin/Lazy;->e()Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_1

    .line 126
    .line 127
    invoke-virtual {p0}, LUb/d;->G()Llc/c;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0}, Llc/c;->f()V

    .line 132
    .line 133
    .line 134
    :cond_1
    invoke-static {}, LUb/f;->a()Lub/d;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    const-string v1, "\u2705 AppContext was destroyed"

    .line 139
    .line 140
    invoke-virtual {v0, v1}, Lub/d;->d(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 144
    .line 145
    invoke-static {}, LX3/a;->f()V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :goto_1
    invoke-static {}, LX3/a;->f()V

    .line 150
    .line 151
    .line 152
    throw v0
.end method

.method public final M()V
    .locals 3

    .line 1
    invoke-virtual {p0}, LUb/d;->a()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    instance-of v1, v0, Landroidx/appcompat/app/c;

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, LUb/d;->a()Landroid/app/Activity;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v2, "Current Activity is of incorrect class, expected AppCompatActivity, received "

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v1

    .line 50
    :cond_1
    iget-object v1, p0, LUb/d;->m:LWb/a;

    .line 51
    .line 52
    check-cast v0, Landroidx/appcompat/app/c;

    .line 53
    .line 54
    invoke-virtual {v1, v0}, LWb/a;->g(Landroidx/appcompat/app/c;)V

    .line 55
    .line 56
    .line 57
    :cond_2
    iget-object v0, p0, LUb/d;->j:LUb/s;

    .line 58
    .line 59
    sget-object v1, Lbc/e;->e:Lbc/e;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, LUb/s;->w(Lbc/e;)V

    .line 62
    .line 63
    .line 64
    const/4 v0, 0x1

    .line 65
    iput-boolean v0, p0, LUb/d;->e:Z

    .line 66
    .line 67
    return-void
.end method

.method public final N()V
    .locals 2

    .line 1
    iget-object v0, p0, LUb/d;->j:LUb/s;

    .line 2
    .line 3
    sget-object v1, Lbc/e;->d:Lbc/e;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LUb/s;->w(Lbc/e;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final O()V
    .locals 3

    .line 1
    invoke-virtual {p0}, LUb/d;->a()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    instance-of v1, v0, Landroidx/appcompat/app/c;

    .line 9
    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    invoke-virtual {p0}, LUb/d;->a()Landroid/app/Activity;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v2, "Current Activity is of incorrect class, expected AppCompatActivity, received "

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v1

    .line 51
    :cond_2
    iget-boolean v1, p0, LUb/d;->e:Z

    .line 52
    .line 53
    if-eqz v1, :cond_3

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    iput-boolean v1, p0, LUb/d;->e:Z

    .line 57
    .line 58
    iget-object v1, p0, LUb/d;->j:LUb/s;

    .line 59
    .line 60
    invoke-virtual {v1}, LUb/s;->G()V

    .line 61
    .line 62
    .line 63
    :cond_3
    iget-object v1, p0, LUb/d;->m:LWb/a;

    .line 64
    .line 65
    check-cast v0, Landroidx/appcompat/app/c;

    .line 66
    .line 67
    invoke-virtual {v1, v0}, LWb/a;->h(Landroidx/appcompat/app/c;)V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, LUb/d;->j:LUb/s;

    .line 71
    .line 72
    sget-object v1, Lbc/e;->c:Lbc/e;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, LUb/s;->w(Lbc/e;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final P(Landroid/content/Intent;)V
    .locals 2

    .line 1
    iget-object v0, p0, LUb/d;->j:LUb/s;

    .line 2
    .line 3
    sget-object v1, Lbc/e;->f:Lbc/e;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, LUb/s;->y(Lbc/e;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final Q()V
    .locals 2

    .line 1
    iget-object v0, p0, LUb/d;->j:LUb/s;

    .line 2
    .line 3
    sget-object v1, Lbc/e;->h:Lbc/e;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LUb/s;->w(Lbc/e;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final S(Ljava/lang/ref/WeakReference;)V
    .locals 0

    .line 1
    iput-object p1, p0, LUb/d;->l:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    return-void
.end method

.method public a()Landroid/app/Activity;
    .locals 3

    .line 1
    invoke-virtual {p0}, LUb/d;->l()Lsb/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-interface {v0}, Lsb/a;->a()Landroid/app/Activity;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-object v0

    .line 15
    :cond_1
    :goto_0
    invoke-virtual {p0}, LUb/d;->B()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    instance-of v1, v0, Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    check-cast v0, Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_2
    move-object v0, v2

    .line 28
    :goto_1
    if-eqz v0, :cond_3

    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0

    .line 35
    :cond_3
    return-object v2
.end method

.method public final g()V
    .locals 4

    .line 1
    sget-object v0, LUb/z;->a:LUb/z;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance v0, Lcc/g;

    .line 19
    .line 20
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "getName(...)"

    .line 29
    .line 30
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v3}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, v1, v3}, Lcc/g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v0
.end method

.method public final i(Lgc/c;)Lbc/b;
    .locals 10

    .line 1
    const-string v0, "module"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    :try_start_0
    invoke-virtual {p0}, LUb/d;->v()Lpb/b;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-class v2, Ltb/a;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Lpb/b;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-object v1, v0

    .line 19
    :goto_0
    check-cast v1, Ltb/a;

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_0
    iget-object v0, p0, LUb/d;->j:LUb/s;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, LUb/s;->n(Lgc/c;)LUb/r;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, LUb/d;->D()Llc/a;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Llc/a;->k()Ljava/lang/ref/WeakReference;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    new-instance v2, Lbc/h;

    .line 41
    .line 42
    invoke-direct {v2, v0, v1, p1}, Lbc/h;-><init>(LUb/r;Ltb/a;Ljava/lang/ref/WeakReference;)V

    .line 43
    .line 44
    .line 45
    return-object v2

    .line 46
    :cond_1
    iget-object v0, p0, LUb/d;->j:LUb/s;

    .line 47
    .line 48
    invoke-virtual {v0}, LUb/s;->t()Ljava/util/Map;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    move-object v1, v0

    .line 57
    check-cast v1, Ljava/lang/Iterable;

    .line 58
    .line 59
    const/16 v8, 0x3e

    .line 60
    .line 61
    const/4 v9, 0x0

    .line 62
    const-string v2, ", "

    .line 63
    .line 64
    const/4 v3, 0x0

    .line 65
    const/4 v4, 0x0

    .line 66
    const/4 v5, 0x0

    .line 67
    const/4 v6, 0x0

    .line 68
    const/4 v7, 0x0

    .line 69
    invoke-static/range {v1 .. v9}, LUd/u;->w0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    new-instance v1, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    const-string v2, "Cannot create an event emitter for module "

    .line 83
    .line 84
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string p1, " that isn\'t present in the module registry. Available modules: ["

    .line 91
    .line 92
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string p1, "]."

    .line 99
    .line 100
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v0
.end method

.method public final j(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    const-string v0, "runnable"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LUb/d;->D()Llc/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Llc/a;->j()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcom/facebook/react/bridge/ReactContext;->runOnJSQueueThread(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final k(I)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p0}, LUb/d;->D()Llc/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Llc/a;->j()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_0
    invoke-static {v0, p1}, Lcom/facebook/react/uimanager/f0;->i(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/bridge/UIManager;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/UIManager;->resolveView(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move-object p1, v1

    .line 25
    :goto_0
    if-eqz p1, :cond_2

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_2
    return-object v1
.end method

.method public final l()Lsb/a;
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, LUb/d;->v()Lpb/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lsb/a;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lpb/b;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    goto :goto_0

    .line 12
    :catch_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    check-cast v0, Lsb/a;

    .line 14
    .line 15
    return-object v0
.end method

.method public final m()LWb/m;
    .locals 1

    .line 1
    iget-object v0, p0, LUb/d;->n:LWb/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()LGf/O;
    .locals 1

    .line 1
    iget-object v0, p0, LUb/d;->g:LGf/O;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()Ljava/io/File;
    .locals 1

    .line 1
    invoke-direct {p0}, LUb/d;->n()Lexpo/modules/kotlin/services/AppDirectoriesService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lexpo/modules/kotlin/services/AppDirectoriesService;->a()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final q()Lbc/b;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, LUb/d;->v()Lpb/b;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const-class v2, Ltb/a;

    .line 7
    .line 8
    invoke-virtual {v1, v2}, Lpb/b;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    goto :goto_0

    .line 13
    :catch_0
    move-object v1, v0

    .line 14
    :goto_0
    check-cast v1, Ltb/a;

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    new-instance v0, Lbc/g;

    .line 20
    .line 21
    invoke-virtual {p0}, LUb/d;->D()Llc/a;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Llc/a;->k()Ljava/lang/ref/WeakReference;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-direct {v0, v1, v2}, Lbc/g;-><init>(Ltb/a;Ljava/lang/ref/WeakReference;)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method

.method public final r()LZb/b;
    .locals 1

    .line 1
    iget-object v0, p0, LUb/d;->o:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LZb/b;

    .line 8
    .line 9
    return-object v0
.end method

.method public final s()Lexpo/modules/kotlin/services/FilePermissionService;
    .locals 2

    .line 1
    invoke-virtual {p0}, LUb/d;->E()Lexpo/modules/kotlin/services/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lexpo/modules/kotlin/services/a;->a()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-class v1, Lexpo/modules/kotlin/services/FilePermissionService;

    .line 10
    .line 11
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    instance-of v1, v0, Lexpo/modules/kotlin/services/FilePermissionService;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    :cond_0
    check-cast v0, Lexpo/modules/kotlin/services/FilePermissionService;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v1, "FilePermissionService is not registered in the ServicesRegistry."

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0
.end method

.method public final t()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, LUb/d;->D()Llc/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Llc/a;->j()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->hasActiveReactInstance()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v2, 0x1

    .line 17
    if-ne v0, v2, :cond_0

    .line 18
    .line 19
    return v2

    .line 20
    :cond_0
    return v1
.end method

.method public final u()Lub/d;
    .locals 1

    .line 1
    iget-object v0, p0, LUb/d;->p:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lub/d;

    .line 8
    .line 9
    return-object v0
.end method

.method public final v()Lpb/b;
    .locals 1

    .line 1
    iget-object v0, p0, LUb/d;->a:Lpb/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final w()Ljava/lang/ref/WeakReference;
    .locals 1

    .line 1
    iget-object v0, p0, LUb/d;->l:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    return-object v0
.end method

.method public final x()LGf/O;
    .locals 1

    .line 1
    iget-object v0, p0, LUb/d;->i:LGf/O;

    .line 2
    .line 3
    return-object v0
.end method

.method public final y()LGf/O;
    .locals 1

    .line 1
    iget-object v0, p0, LUb/d;->h:LGf/O;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z()LRb/a;
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, LUb/d;->v()Lpb/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, LRb/a;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lpb/b;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    goto :goto_0

    .line 12
    :catch_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    check-cast v0, LRb/a;

    .line 14
    .line 15
    return-object v0
.end method
