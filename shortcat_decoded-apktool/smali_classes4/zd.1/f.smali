.class public final Lzd/f;
.super Lzd/j;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/ref/WeakReference;

.field private final c:Lexpo/modules/updates/d;

.field private final d:Lxd/g;

.field private final e:Lpd/c;

.field private final f:Ljava/io/File;

.field private final g:Lwd/g;

.field private final h:LBd/h;

.field private final i:Lie/a;

.field private final j:Lkotlin/jvm/functions/Function1;

.field private final k:Z

.field private final l:LAd/d;

.field private final m:Lvd/b$a;

.field private final n:LGf/O;

.field private final o:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/ref/WeakReference;Lexpo/modules/updates/d;Lxd/g;Lpd/c;Ljava/io/File;Lwd/g;LBd/h;Lie/a;Lkotlin/jvm/functions/Function1;ZLAd/d;Lvd/b$a;LGf/O;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "updatesConfiguration"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "logger"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "databaseHolder"

    .line 17
    .line 18
    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "updatesDirectory"

    .line 22
    .line 23
    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "fileDownloader"

    .line 27
    .line 28
    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "selectionPolicy"

    .line 32
    .line 33
    invoke-static {p8, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "getCurrentLauncher"

    .line 37
    .line 38
    invoke-static {p9, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string v0, "setCurrentLauncher"

    .line 42
    .line 43
    invoke-static {p10, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v0, "callback"

    .line 47
    .line 48
    invoke-static {p13, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string v0, "procedureScope"

    .line 52
    .line 53
    invoke-static {p14, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-direct {p0}, Lzd/j;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, Lzd/f;->a:Landroid/content/Context;

    .line 60
    .line 61
    iput-object p2, p0, Lzd/f;->b:Ljava/lang/ref/WeakReference;

    .line 62
    .line 63
    iput-object p3, p0, Lzd/f;->c:Lexpo/modules/updates/d;

    .line 64
    .line 65
    iput-object p4, p0, Lzd/f;->d:Lxd/g;

    .line 66
    .line 67
    iput-object p5, p0, Lzd/f;->e:Lpd/c;

    .line 68
    .line 69
    iput-object p6, p0, Lzd/f;->f:Ljava/io/File;

    .line 70
    .line 71
    iput-object p7, p0, Lzd/f;->g:Lwd/g;

    .line 72
    .line 73
    iput-object p8, p0, Lzd/f;->h:LBd/h;

    .line 74
    .line 75
    iput-object p9, p0, Lzd/f;->i:Lie/a;

    .line 76
    .line 77
    iput-object p10, p0, Lzd/f;->j:Lkotlin/jvm/functions/Function1;

    .line 78
    .line 79
    iput-boolean p11, p0, Lzd/f;->k:Z

    .line 80
    .line 81
    iput-object p12, p0, Lzd/f;->l:LAd/d;

    .line 82
    .line 83
    iput-object p13, p0, Lzd/f;->m:Lvd/b$a;

    .line 84
    .line 85
    iput-object p14, p0, Lzd/f;->n:LGf/O;

    .line 86
    .line 87
    const-string p1, "timer-relaunch"

    .line 88
    .line 89
    iput-object p1, p0, Lzd/f;->o:Ljava/lang/String;

    .line 90
    .line 91
    return-void
.end method

.method public static final synthetic c(Lzd/f;)Lpd/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lzd/f;->e:Lpd/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(Lzd/f;)Lie/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lzd/f;->i:Lie/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic e(Lzd/f;)Lxd/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lzd/f;->d:Lxd/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(Lzd/f;)LAd/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lzd/f;->l:LAd/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g(Lzd/f;)LBd/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lzd/f;->h:LBd/h;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic h(Lzd/f;)Lexpo/modules/updates/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lzd/f;->c:Lexpo/modules/updates/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic i(Lzd/f;)Ljava/io/File;
    .locals 0

    .line 1
    iget-object p0, p0, Lzd/f;->f:Ljava/io/File;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic j(Lzd/f;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 1
    iget-object p0, p0, Lzd/f;->b:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    return-object p0
.end method

.method private final k(Lvd/a;LZd/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lzd/f;->e:Lpd/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lpd/c;->c()Lexpo/modules/updates/db/UpdatesDatabase;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0, p2}, Lvd/a;->i(Lexpo/modules/updates/db/UpdatesDatabase;LZd/e;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    if-ne p1, p2, :cond_0

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 19
    .line 20
    return-object p1
.end method

.method private final l()V
    .locals 6

    .line 1
    iget-object v0, p0, Lzd/f;->n:LGf/O;

    .line 2
    .line 3
    new-instance v3, Lzd/f$c;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v3, p0, v1}, Lzd/f$c;-><init>(Lzd/f;LZd/e;)V

    .line 7
    .line 8
    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-static/range {v0 .. v5}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lzd/f;->o:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public b(Lzd/j$a;LZd/e;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    instance-of v3, v0, Lzd/f$a;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v0

    .line 12
    check-cast v3, Lzd/f$a;

    .line 13
    .line 14
    iget v4, v3, Lzd/f$a;->f:I

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
    iput v4, v3, Lzd/f$a;->f:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Lzd/f$a;

    .line 27
    .line 28
    invoke-direct {v3, v1, v0}, Lzd/f$a;-><init>(Lzd/f;LZd/e;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, v3, Lzd/f$a;->d:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget v5, v3, Lzd/f$a;->f:I

    .line 38
    .line 39
    const/4 v6, 0x1

    .line 40
    if-eqz v5, :cond_2

    .line 41
    .line 42
    if-ne v5, v6, :cond_1

    .line 43
    .line 44
    iget-object v2, v3, Lzd/f$a;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Lvd/a;

    .line 47
    .line 48
    iget-object v4, v3, Lzd/f$a;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v4, Lcom/facebook/react/ReactHost;

    .line 51
    .line 52
    iget-object v3, v3, Lzd/f$a;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v3, Lzd/j$a;

    .line 55
    .line 56
    :try_start_0
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    .line 59
    move-object v7, v2

    .line 60
    move-object v2, v3

    .line 61
    goto :goto_1

    .line 62
    :catch_0
    move-exception v0

    .line 63
    move-object v2, v3

    .line 64
    goto/16 :goto_2

    .line 65
    .line 66
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v0

    .line 74
    :cond_2
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object v0, v1, Lzd/f;->a:Landroid/content/Context;

    .line 78
    .line 79
    invoke-static {v0}, Lzd/g;->a(Landroid/content/Context;)Lcom/facebook/react/ReactHost;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-nez v0, :cond_3

    .line 84
    .line 85
    iget-object v0, v1, Lzd/f;->m:Lvd/b$a;

    .line 86
    .line 87
    new-instance v2, Ljava/lang/Exception;

    .line 88
    .line 89
    const-string v3, "Could not reload application. Ensure you have passed the correct instance of ReactApplication into UpdatesController.initialize()."

    .line 90
    .line 91
    invoke-direct {v2, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v0, v2}, Lvd/b$a;->onFailure(Ljava/lang/Exception;)V

    .line 95
    .line 96
    .line 97
    sget-object v0, LTd/L;->a:LTd/L;

    .line 98
    .line 99
    return-object v0

    .line 100
    :cond_3
    new-instance v5, LCd/e$m;

    .line 101
    .line 102
    invoke-direct {v5}, LCd/e$m;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-interface {v2, v5}, Lzd/j$b;->a(LCd/e;)V

    .line 106
    .line 107
    .line 108
    new-instance v7, Lvd/a;

    .line 109
    .line 110
    iget-object v8, v1, Lzd/f;->a:Landroid/content/Context;

    .line 111
    .line 112
    iget-object v9, v1, Lzd/f;->c:Lexpo/modules/updates/d;

    .line 113
    .line 114
    iget-object v10, v1, Lzd/f;->f:Ljava/io/File;

    .line 115
    .line 116
    iget-object v11, v1, Lzd/f;->g:Lwd/g;

    .line 117
    .line 118
    iget-object v12, v1, Lzd/f;->h:LBd/h;

    .line 119
    .line 120
    iget-object v13, v1, Lzd/f;->d:Lxd/g;

    .line 121
    .line 122
    iget-object v14, v1, Lzd/f;->n:LGf/O;

    .line 123
    .line 124
    const/16 v16, 0x80

    .line 125
    .line 126
    const/16 v17, 0x0

    .line 127
    .line 128
    const/4 v15, 0x0

    .line 129
    invoke-direct/range {v7 .. v17}, Lvd/a;-><init>(Landroid/content/Context;Lexpo/modules/updates/d;Ljava/io/File;Lwd/g;LBd/h;Lxd/g;LGf/O;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 130
    .line 131
    .line 132
    :try_start_1
    iput-object v2, v3, Lzd/f$a;->a:Ljava/lang/Object;

    .line 133
    .line 134
    iput-object v0, v3, Lzd/f$a;->b:Ljava/lang/Object;

    .line 135
    .line 136
    iput-object v7, v3, Lzd/f$a;->c:Ljava/lang/Object;

    .line 137
    .line 138
    iput v6, v3, Lzd/f$a;->f:I

    .line 139
    .line 140
    invoke-direct {v1, v7, v3}, Lzd/f;->k(Lvd/a;LZd/e;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 144
    if-ne v3, v4, :cond_4

    .line 145
    .line 146
    return-object v4

    .line 147
    :cond_4
    move-object v4, v0

    .line 148
    :goto_1
    iget-object v0, v1, Lzd/f;->j:Lkotlin/jvm/functions/Function1;

    .line 149
    .line 150
    invoke-interface {v0, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    iget-object v0, v1, Lzd/f;->m:Lvd/b$a;

    .line 154
    .line 155
    invoke-interface {v0}, Lvd/b$a;->a()V

    .line 156
    .line 157
    .line 158
    iget-object v5, v1, Lzd/f;->n:LGf/O;

    .line 159
    .line 160
    new-instance v8, Lzd/f$b;

    .line 161
    .line 162
    const/4 v0, 0x0

    .line 163
    invoke-direct {v8, v1, v4, v0}, Lzd/f$b;-><init>(Lzd/f;Lcom/facebook/react/ReactHost;LZd/e;)V

    .line 164
    .line 165
    .line 166
    const/4 v9, 0x3

    .line 167
    const/4 v10, 0x0

    .line 168
    const/4 v6, 0x0

    .line 169
    const/4 v7, 0x0

    .line 170
    invoke-static/range {v5 .. v10}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 171
    .line 172
    .line 173
    iget-boolean v0, v1, Lzd/f;->k:Z

    .line 174
    .line 175
    if-eqz v0, :cond_5

    .line 176
    .line 177
    invoke-direct {v1}, Lzd/f;->l()V

    .line 178
    .line 179
    .line 180
    :cond_5
    invoke-interface {v2}, Lzd/j$b;->b()V

    .line 181
    .line 182
    .line 183
    invoke-interface {v2}, Lzd/j$a;->c()V

    .line 184
    .line 185
    .line 186
    sget-object v0, LTd/L;->a:LTd/L;

    .line 187
    .line 188
    return-object v0

    .line 189
    :catch_1
    move-exception v0

    .line 190
    :goto_2
    iget-object v3, v1, Lzd/f;->d:Lxd/g;

    .line 191
    .line 192
    const-string v4, "Error launching new launcher"

    .line 193
    .line 194
    sget-object v5, Lxd/b;->l:Lxd/b;

    .line 195
    .line 196
    invoke-virtual {v3, v4, v0, v5}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V

    .line 197
    .line 198
    .line 199
    iget-object v3, v1, Lzd/f;->m:Lvd/b$a;

    .line 200
    .line 201
    invoke-interface {v3, v0}, Lvd/b$a;->onFailure(Ljava/lang/Exception;)V

    .line 202
    .line 203
    .line 204
    invoke-interface {v2}, Lzd/j$a;->c()V

    .line 205
    .line 206
    .line 207
    sget-object v0, LTd/L;->a:LTd/L;

    .line 208
    .line 209
    return-object v0
.end method
