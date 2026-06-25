.class public final Lwd/o;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwd/o$a;,
        Lwd/o$b;,
        Lwd/o$c;,
        Lwd/o$d;,
        Lwd/o$e;
    }
.end annotation


# static fields
.field public static final r:Lwd/o$a;

.field private static final s:Ljava/lang/String;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lexpo/modules/updates/d;

.field private final c:Lpd/c;

.field private final d:Ljava/io/File;

.field private final e:Lwd/g;

.field private final f:LBd/h;

.field private final g:Lxd/g;

.field private final h:Lwd/o$b;

.field private final i:LGf/O;

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Z

.field private final o:Landroid/os/HandlerThread;

.field private p:Lvd/b;

.field private q:Lvd/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lwd/o$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lwd/o$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lwd/o;->r:Lwd/o$a;

    .line 8
    .line 9
    const-class v0, Lwd/o;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lwd/o;->s:Ljava/lang/String;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lexpo/modules/updates/d;Lpd/c;Ljava/io/File;Lwd/g;LBd/h;Lxd/g;Lwd/o$b;LGf/O;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "configuration"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "databaseHolder"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "directory"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "fileDownloader"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "selectionPolicy"

    .line 27
    .line 28
    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "logger"

    .line 32
    .line 33
    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "callback"

    .line 37
    .line 38
    invoke-static {p8, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string v0, "scope"

    .line 42
    .line 43
    invoke-static {p9, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Lwd/o;->a:Landroid/content/Context;

    .line 50
    .line 51
    iput-object p2, p0, Lwd/o;->b:Lexpo/modules/updates/d;

    .line 52
    .line 53
    iput-object p3, p0, Lwd/o;->c:Lpd/c;

    .line 54
    .line 55
    iput-object p4, p0, Lwd/o;->d:Ljava/io/File;

    .line 56
    .line 57
    iput-object p5, p0, Lwd/o;->e:Lwd/g;

    .line 58
    .line 59
    iput-object p6, p0, Lwd/o;->f:LBd/h;

    .line 60
    .line 61
    iput-object p7, p0, Lwd/o;->g:Lxd/g;

    .line 62
    .line 63
    iput-object p8, p0, Lwd/o;->h:Lwd/o$b;

    .line 64
    .line 65
    iput-object p9, p0, Lwd/o;->i:LGf/O;

    .line 66
    .line 67
    new-instance p1, Landroid/os/HandlerThread;

    .line 68
    .line 69
    const-string p2, "expo-updates-timer"

    .line 70
    .line 71
    invoke-direct {p1, p2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, Lwd/o;->o:Landroid/os/HandlerThread;

    .line 75
    .line 76
    return-void
.end method

.method public static synthetic a(Lwd/o;Lwd/v;)Lwd/i$e;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lwd/o;->p(Lwd/o;Lwd/v;)Lwd/i$e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Lwd/o;D)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lwd/o;->o(Lwd/o;D)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(Lwd/o;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lwd/o;->t(Lwd/o;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(Lwd/v;)Lwd/i$e;
    .locals 0

    .line 1
    invoke-static {p0}, Lwd/o;->l(Lwd/v;)Lwd/i$e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic e(Lwd/o;)Lwd/o$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lwd/o;->h:Lwd/o$b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(Lwd/o;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lwd/o;->k(LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic g(Lwd/o;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lwd/o;->m(LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic h(Lwd/o;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lwd/o;->n(LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final declared-synchronized i(Ljava/lang/Exception;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lwd/o;->m:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    :try_start_1
    iput-boolean v0, p0, Lwd/o;->m:Z

    .line 10
    .line 11
    iget-object v0, p0, Lwd/o;->p:Lvd/b;

    .line 12
    .line 13
    iput-object v0, p0, Lwd/o;->q:Lvd/b;

    .line 14
    .line 15
    iget-boolean v1, p0, Lwd/o;->k:Z

    .line 16
    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Lvd/b;->d()Lrd/d;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object v0, p0, Lwd/o;->h:Lwd/o$b;

    .line 32
    .line 33
    iget-object v1, p0, Lwd/o;->q:Lvd/b;

    .line 34
    .line 35
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-boolean v2, p0, Lwd/o;->n:Z

    .line 39
    .line 40
    invoke-interface {v0, v1, v2}, Lwd/o$b;->i(Lvd/b;Z)V

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    goto :goto_3

    .line 46
    :cond_2
    :goto_0
    iget-object v0, p0, Lwd/o;->h:Lwd/o$b;

    .line 47
    .line 48
    if-nez p1, :cond_3

    .line 49
    .line 50
    new-instance v1, Ljava/lang/Exception;

    .line 51
    .line 52
    const-string v2, "LoaderTask encountered an unexpected error and could not launch an update."

    .line 53
    .line 54
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    move-object v1, p1

    .line 59
    :goto_1
    invoke-interface {v0, v1}, Lwd/o$b;->onFailure(Ljava/lang/Exception;)V

    .line 60
    .line 61
    .line 62
    :goto_2
    iget-boolean v0, p0, Lwd/o;->l:Z

    .line 63
    .line 64
    if-nez v0, :cond_4

    .line 65
    .line 66
    invoke-direct {p0}, Lwd/o;->u()V

    .line 67
    .line 68
    .line 69
    :cond_4
    if-eqz p1, :cond_5

    .line 70
    .line 71
    iget-object v0, p0, Lwd/o;->g:Lxd/g;

    .line 72
    .line 73
    const-string v1, "Unexpected error encountered while loading this app"

    .line 74
    .line 75
    sget-object v2, Lxd/b;->l:Lxd/b;

    .line 76
    .line 77
    invoke-virtual {v0, v1, p1, v2}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    .line 79
    .line 80
    :cond_5
    monitor-exit p0

    .line 81
    return-void

    .line 82
    :goto_3
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 83
    throw p1
.end method

.method private final k(LZd/e;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    instance-of v2, v0, Lwd/o$f;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lwd/o$f;

    .line 11
    .line 12
    iget v3, v2, Lwd/o$f;->f:I

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
    iput v3, v2, Lwd/o$f;->f:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lwd/o$f;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, Lwd/o$f;-><init>(Lwd/o;LZd/e;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, Lwd/o$f;->d:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lwd/o$f;->f:I

    .line 36
    .line 37
    const/4 v5, 0x5

    .line 38
    const/4 v6, 0x4

    .line 39
    const/4 v7, 0x3

    .line 40
    const/4 v8, 0x2

    .line 41
    const/4 v9, 0x1

    .line 42
    const/4 v10, 0x0

    .line 43
    if-eqz v4, :cond_6

    .line 44
    .line 45
    if-eq v4, v9, :cond_5

    .line 46
    .line 47
    if-eq v4, v8, :cond_4

    .line 48
    .line 49
    if-eq v4, v7, :cond_3

    .line 50
    .line 51
    if-eq v4, v6, :cond_2

    .line 52
    .line 53
    if-ne v4, v5, :cond_1

    .line 54
    .line 55
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto/16 :goto_7

    .line 59
    .line 60
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v0

    .line 68
    :cond_2
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto/16 :goto_5

    .line 72
    .line 73
    :cond_3
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto/16 :goto_4

    .line 77
    .line 78
    :cond_4
    iget-object v4, v2, Lwd/o$f;->b:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v4, Lvd/a;

    .line 81
    .line 82
    iget-object v5, v2, Lwd/o$f;->a:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v5, Lexpo/modules/updates/db/UpdatesDatabase;

    .line 85
    .line 86
    :try_start_0
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    .line 88
    .line 89
    goto/16 :goto_3

    .line 90
    .line 91
    :catch_0
    move-exception v0

    .line 92
    goto/16 :goto_2

    .line 93
    .line 94
    :cond_5
    iget-object v4, v2, Lwd/o$f;->c:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v4, Lrd/d;

    .line 97
    .line 98
    iget-object v5, v2, Lwd/o$f;->b:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v5, Lvd/a;

    .line 101
    .line 102
    iget-object v9, v2, Lwd/o$f;->a:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v9, Lexpo/modules/updates/db/UpdatesDatabase;

    .line 105
    .line 106
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    move-object v15, v9

    .line 110
    goto :goto_1

    .line 111
    :cond_6
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    iget-object v0, v1, Lwd/o;->c:Lpd/c;

    .line 115
    .line 116
    invoke-virtual {v0}, Lpd/c;->c()Lexpo/modules/updates/db/UpdatesDatabase;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    new-instance v11, Lvd/a;

    .line 121
    .line 122
    iget-object v12, v1, Lwd/o;->a:Landroid/content/Context;

    .line 123
    .line 124
    iget-object v13, v1, Lwd/o;->b:Lexpo/modules/updates/d;

    .line 125
    .line 126
    iget-object v14, v1, Lwd/o;->d:Ljava/io/File;

    .line 127
    .line 128
    iget-object v15, v1, Lwd/o;->e:Lwd/g;

    .line 129
    .line 130
    iget-object v4, v1, Lwd/o;->f:LBd/h;

    .line 131
    .line 132
    iget-object v5, v1, Lwd/o;->g:Lxd/g;

    .line 133
    .line 134
    iget-object v6, v1, Lwd/o;->i:LGf/O;

    .line 135
    .line 136
    const/16 v20, 0x80

    .line 137
    .line 138
    const/16 v21, 0x0

    .line 139
    .line 140
    const/16 v19, 0x0

    .line 141
    .line 142
    move-object/from16 v16, v4

    .line 143
    .line 144
    move-object/from16 v17, v5

    .line 145
    .line 146
    move-object/from16 v18, v6

    .line 147
    .line 148
    invoke-direct/range {v11 .. v21}, Lvd/a;-><init>(Landroid/content/Context;Lexpo/modules/updates/d;Ljava/io/File;Lwd/g;LBd/h;Lxd/g;LGf/O;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 149
    .line 150
    .line 151
    iput-object v11, v1, Lwd/o;->p:Lvd/b;

    .line 152
    .line 153
    iget-object v4, v1, Lwd/o;->b:Lexpo/modules/updates/d;

    .line 154
    .line 155
    invoke-virtual {v4}, Lexpo/modules/updates/d;->j()Z

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    if-eqz v4, :cond_c

    .line 160
    .line 161
    sget-object v4, Lyd/a;->a:Lyd/a;

    .line 162
    .line 163
    iget-object v5, v1, Lwd/o;->a:Landroid/content/Context;

    .line 164
    .line 165
    iget-object v6, v1, Lwd/o;->b:Lexpo/modules/updates/d;

    .line 166
    .line 167
    invoke-virtual {v4, v5, v6}, Lyd/a;->b(Landroid/content/Context;Lexpo/modules/updates/d;)Lyd/d;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    invoke-static {v4}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v4}, Lyd/d;->c()Lrd/d;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    iput-object v0, v2, Lwd/o$f;->a:Ljava/lang/Object;

    .line 179
    .line 180
    iput-object v11, v2, Lwd/o$f;->b:Ljava/lang/Object;

    .line 181
    .line 182
    iput-object v4, v2, Lwd/o$f;->c:Ljava/lang/Object;

    .line 183
    .line 184
    iput v9, v2, Lwd/o$f;->f:I

    .line 185
    .line 186
    invoke-virtual {v11, v0, v2}, Lvd/a;->h(Lexpo/modules/updates/db/UpdatesDatabase;LZd/e;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    if-ne v5, v3, :cond_7

    .line 191
    .line 192
    goto/16 :goto_6

    .line 193
    .line 194
    :cond_7
    move-object v15, v0

    .line 195
    move-object v0, v5

    .line 196
    move-object v5, v11

    .line 197
    :goto_1
    check-cast v0, Lrd/d;

    .line 198
    .line 199
    sget-object v6, Lyd/k;->a:Lyd/k;

    .line 200
    .line 201
    iget-object v9, v1, Lwd/o;->b:Lexpo/modules/updates/d;

    .line 202
    .line 203
    invoke-virtual {v6, v15, v9}, Lyd/k;->f(Lexpo/modules/updates/db/UpdatesDatabase;Lexpo/modules/updates/d;)Lorg/json/JSONObject;

    .line 204
    .line 205
    .line 206
    move-result-object v6

    .line 207
    iget-object v9, v1, Lwd/o;->f:LBd/h;

    .line 208
    .line 209
    invoke-virtual {v9, v4, v0, v6}, LBd/h;->c(Lrd/d;Lrd/d;Lorg/json/JSONObject;)Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-eqz v0, :cond_a

    .line 214
    .line 215
    :try_start_1
    new-instance v11, Lwd/a;

    .line 216
    .line 217
    iget-object v12, v1, Lwd/o;->a:Landroid/content/Context;

    .line 218
    .line 219
    iget-object v13, v1, Lwd/o;->b:Lexpo/modules/updates/d;

    .line 220
    .line 221
    iget-object v14, v1, Lwd/o;->g:Lxd/g;

    .line 222
    .line 223
    iget-object v0, v1, Lwd/o;->d:Ljava/io/File;

    .line 224
    .line 225
    move-object/from16 v16, v0

    .line 226
    .line 227
    invoke-direct/range {v11 .. v16}, Lwd/a;-><init>(Landroid/content/Context;Lexpo/modules/updates/d;Lxd/g;Lexpo/modules/updates/db/UpdatesDatabase;Ljava/io/File;)V

    .line 228
    .line 229
    .line 230
    new-instance v0, Lwd/n;

    .line 231
    .line 232
    invoke-direct {v0}, Lwd/n;-><init>()V

    .line 233
    .line 234
    .line 235
    iput-object v15, v2, Lwd/o$f;->a:Ljava/lang/Object;

    .line 236
    .line 237
    iput-object v5, v2, Lwd/o$f;->b:Ljava/lang/Object;

    .line 238
    .line 239
    iput-object v10, v2, Lwd/o$f;->c:Ljava/lang/Object;

    .line 240
    .line 241
    iput v8, v2, Lwd/o$f;->f:I

    .line 242
    .line 243
    invoke-virtual {v11, v0, v2}, Lwd/i;->k(Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 247
    if-ne v0, v3, :cond_8

    .line 248
    .line 249
    goto :goto_6

    .line 250
    :cond_8
    move-object v4, v5

    .line 251
    move-object v5, v15

    .line 252
    goto :goto_3

    .line 253
    :catch_1
    move-exception v0

    .line 254
    move-object v4, v5

    .line 255
    move-object v5, v15

    .line 256
    :goto_2
    iget-object v6, v1, Lwd/o;->g:Lxd/g;

    .line 257
    .line 258
    const-string v8, "Unexpected error copying embedded update"

    .line 259
    .line 260
    sget-object v9, Lxd/b;->l:Lxd/b;

    .line 261
    .line 262
    invoke-virtual {v6, v8, v0, v9}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V

    .line 263
    .line 264
    .line 265
    :goto_3
    iput-object v10, v2, Lwd/o$f;->a:Ljava/lang/Object;

    .line 266
    .line 267
    iput-object v10, v2, Lwd/o$f;->b:Ljava/lang/Object;

    .line 268
    .line 269
    iput-object v10, v2, Lwd/o$f;->c:Ljava/lang/Object;

    .line 270
    .line 271
    iput v7, v2, Lwd/o$f;->f:I

    .line 272
    .line 273
    invoke-virtual {v4, v5, v2}, Lvd/a;->i(Lexpo/modules/updates/db/UpdatesDatabase;LZd/e;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    if-ne v0, v3, :cond_9

    .line 278
    .line 279
    goto :goto_6

    .line 280
    :cond_9
    :goto_4
    sget-object v0, LTd/L;->a:LTd/L;

    .line 281
    .line 282
    return-object v0

    .line 283
    :cond_a
    iput-object v10, v2, Lwd/o$f;->a:Ljava/lang/Object;

    .line 284
    .line 285
    iput-object v10, v2, Lwd/o$f;->b:Ljava/lang/Object;

    .line 286
    .line 287
    iput-object v10, v2, Lwd/o$f;->c:Ljava/lang/Object;

    .line 288
    .line 289
    const/4 v0, 0x4

    .line 290
    iput v0, v2, Lwd/o$f;->f:I

    .line 291
    .line 292
    invoke-virtual {v5, v15, v2}, Lvd/a;->i(Lexpo/modules/updates/db/UpdatesDatabase;LZd/e;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    if-ne v0, v3, :cond_b

    .line 297
    .line 298
    goto :goto_6

    .line 299
    :cond_b
    :goto_5
    sget-object v0, LTd/L;->a:LTd/L;

    .line 300
    .line 301
    return-object v0

    .line 302
    :cond_c
    const/4 v4, 0x5

    .line 303
    iput v4, v2, Lwd/o$f;->f:I

    .line 304
    .line 305
    invoke-virtual {v11, v0, v2}, Lvd/a;->i(Lexpo/modules/updates/db/UpdatesDatabase;LZd/e;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    if-ne v0, v3, :cond_d

    .line 310
    .line 311
    :goto_6
    return-object v3

    .line 312
    :cond_d
    :goto_7
    sget-object v0, LTd/L;->a:LTd/L;

    .line 313
    .line 314
    return-object v0
.end method

.method private static final l(Lwd/v;)Lwd/i$e;
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Lwd/i$e;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-direct {p0, v0}, Lwd/i$e;-><init>(Z)V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method private final m(LZd/e;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lwd/o$g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lwd/o$g;

    .line 7
    .line 8
    iget v1, v0, Lwd/o$g;->c:I

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
    iput v1, v0, Lwd/o$g;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lwd/o$g;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lwd/o$g;-><init>(Lwd/o;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lwd/o$g;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lwd/o$g;->c:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v4, :cond_1

    .line 38
    .line 39
    :try_start_0
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catch_0
    move-exception p1

    .line 44
    goto :goto_2

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :try_start_1
    iput v4, v0, Lwd/o$g;->c:I

    .line 57
    .line 58
    invoke-direct {p0, v0}, Lwd/o;->n(LZd/e;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-ne p1, v1, :cond_3

    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_3
    :goto_1
    monitor-enter p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 66
    :try_start_2
    iput-boolean v4, p0, Lwd/o;->k:Z

    .line 67
    .line 68
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 69
    .line 70
    :try_start_3
    monitor-exit p0

    .line 71
    const/4 p1, 0x0

    .line 72
    invoke-direct {p0, p1}, Lwd/o;->i(Ljava/lang/Exception;)V

    .line 73
    .line 74
    .line 75
    iput-boolean v3, p0, Lwd/o;->j:Z

    .line 76
    .line 77
    invoke-direct {p0}, Lwd/o;->r()V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Lwd/o;->h:Lwd/o$b;

    .line 81
    .line 82
    invoke-interface {p1}, Lwd/o$b;->g()V

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :catchall_0
    move-exception p1

    .line 87
    monitor-exit p0

    .line 88
    throw p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 89
    :goto_2
    invoke-direct {p0, p1}, Lwd/o;->i(Ljava/lang/Exception;)V

    .line 90
    .line 91
    .line 92
    iput-boolean v3, p0, Lwd/o;->j:Z

    .line 93
    .line 94
    invoke-direct {p0}, Lwd/o;->r()V

    .line 95
    .line 96
    .line 97
    iget-object p1, p0, Lwd/o;->h:Lwd/o$b;

    .line 98
    .line 99
    invoke-interface {p1}, Lwd/o$b;->g()V

    .line 100
    .line 101
    .line 102
    :goto_3
    sget-object p1, LTd/L;->a:LTd/L;

    .line 103
    .line 104
    return-object p1
.end method

.method private final n(LZd/e;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    instance-of v2, v0, Lwd/o$h;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lwd/o$h;

    .line 11
    .line 12
    iget v3, v2, Lwd/o$h;->f:I

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
    iput v3, v2, Lwd/o$h;->f:I

    .line 22
    .line 23
    :goto_0
    move-object v12, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lwd/o$h;

    .line 26
    .line 27
    invoke-direct {v2, v1, v0}, Lwd/o$h;-><init>(Lwd/o;LZd/e;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v0, v12, Lwd/o$h;->d:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget v3, v12, Lwd/o$h;->f:I

    .line 38
    .line 39
    const/4 v13, 0x3

    .line 40
    const/4 v14, 0x2

    .line 41
    const/4 v15, 0x1

    .line 42
    const/4 v4, 0x0

    .line 43
    if-eqz v3, :cond_5

    .line 44
    .line 45
    if-eq v3, v15, :cond_3

    .line 46
    .line 47
    if-eq v3, v14, :cond_2

    .line 48
    .line 49
    if-ne v3, v13, :cond_1

    .line 50
    .line 51
    iget-object v2, v12, Lwd/o$h;->c:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, Lvd/a;

    .line 54
    .line 55
    iget-object v3, v12, Lwd/o$h;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v3, Lrd/d;

    .line 58
    .line 59
    iget-object v5, v12, Lwd/o$h;->a:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v5, LGf/C0;

    .line 62
    .line 63
    :try_start_0
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    .line 66
    move-object v14, v4

    .line 67
    goto/16 :goto_8

    .line 68
    .line 69
    :catchall_0
    move-exception v0

    .line 70
    move-object v14, v4

    .line 71
    goto/16 :goto_11

    .line 72
    .line 73
    :catch_0
    move-exception v0

    .line 74
    move-object v14, v4

    .line 75
    goto/16 :goto_c

    .line 76
    .line 77
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 78
    .line 79
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 80
    .line 81
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw v0

    .line 85
    :cond_2
    iget-object v3, v12, Lwd/o$h;->b:Ljava/lang/Object;

    .line 86
    .line 87
    move-object v5, v3

    .line 88
    check-cast v5, LGf/C0;

    .line 89
    .line 90
    iget-object v3, v12, Lwd/o$h;->a:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v3, Lexpo/modules/updates/db/UpdatesDatabase;

    .line 93
    .line 94
    :try_start_1
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    .line 96
    .line 97
    move-object v14, v4

    .line 98
    goto/16 :goto_6

    .line 99
    .line 100
    :catch_1
    move-exception v0

    .line 101
    move-object v14, v4

    .line 102
    goto/16 :goto_f

    .line 103
    .line 104
    :cond_3
    iget-object v3, v12, Lwd/o$h;->b:Ljava/lang/Object;

    .line 105
    .line 106
    move-object v5, v3

    .line 107
    check-cast v5, LGf/C0;

    .line 108
    .line 109
    iget-object v3, v12, Lwd/o$h;->a:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v3, Lexpo/modules/updates/db/UpdatesDatabase;

    .line 112
    .line 113
    :try_start_2
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 114
    .line 115
    .line 116
    :cond_4
    move-object v7, v3

    .line 117
    move-object v3, v5

    .line 118
    goto :goto_4

    .line 119
    :cond_5
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    iget-object v0, v1, Lwd/o;->c:Lpd/c;

    .line 123
    .line 124
    invoke-virtual {v0}, Lpd/c;->c()Lexpo/modules/updates/db/UpdatesDatabase;

    .line 125
    .line 126
    .line 127
    move-result-object v20

    .line 128
    iget-object v0, v1, Lwd/o;->h:Lwd/o$b;

    .line 129
    .line 130
    invoke-interface {v0}, Lwd/o$b;->a()V

    .line 131
    .line 132
    .line 133
    new-instance v16, Lwd/s;

    .line 134
    .line 135
    iget-object v0, v1, Lwd/o;->a:Landroid/content/Context;

    .line 136
    .line 137
    iget-object v3, v1, Lwd/o;->b:Lexpo/modules/updates/d;

    .line 138
    .line 139
    iget-object v5, v1, Lwd/o;->g:Lxd/g;

    .line 140
    .line 141
    iget-object v6, v1, Lwd/o;->e:Lwd/g;

    .line 142
    .line 143
    iget-object v7, v1, Lwd/o;->d:Ljava/io/File;

    .line 144
    .line 145
    iget-object v8, v1, Lwd/o;->p:Lvd/b;

    .line 146
    .line 147
    if-eqz v8, :cond_6

    .line 148
    .line 149
    invoke-interface {v8}, Lvd/b;->d()Lrd/d;

    .line 150
    .line 151
    .line 152
    move-result-object v8

    .line 153
    move-object/from16 v23, v8

    .line 154
    .line 155
    :goto_2
    move-object/from16 v17, v0

    .line 156
    .line 157
    move-object/from16 v18, v3

    .line 158
    .line 159
    move-object/from16 v19, v5

    .line 160
    .line 161
    move-object/from16 v21, v6

    .line 162
    .line 163
    move-object/from16 v22, v7

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_6
    move-object/from16 v23, v4

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :goto_3
    invoke-direct/range {v16 .. v23}, Lwd/s;-><init>(Landroid/content/Context;Lexpo/modules/updates/d;Lxd/g;Lexpo/modules/updates/db/UpdatesDatabase;Lwd/g;Ljava/io/File;Lrd/d;)V

    .line 170
    .line 171
    .line 172
    move-object/from16 v0, v16

    .line 173
    .line 174
    move-object/from16 v3, v20

    .line 175
    .line 176
    new-instance v5, Lwd/l;

    .line 177
    .line 178
    invoke-direct {v5, v1}, Lwd/l;-><init>(Lwd/o;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, v5}, Lwd/i;->q(Lkotlin/jvm/functions/Function1;)V

    .line 182
    .line 183
    .line 184
    iget-object v6, v1, Lwd/o;->i:LGf/O;

    .line 185
    .line 186
    new-instance v9, Lwd/o$i;

    .line 187
    .line 188
    invoke-direct {v9, v0, v1, v4}, Lwd/o$i;-><init>(Lwd/s;Lwd/o;LZd/e;)V

    .line 189
    .line 190
    .line 191
    const/4 v10, 0x3

    .line 192
    const/4 v11, 0x0

    .line 193
    const/4 v7, 0x0

    .line 194
    const/4 v8, 0x0

    .line 195
    invoke-static/range {v6 .. v11}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    :try_start_3
    new-instance v6, Lwd/m;

    .line 200
    .line 201
    invoke-direct {v6, v1}, Lwd/m;-><init>(Lwd/o;)V

    .line 202
    .line 203
    .line 204
    iput-object v3, v12, Lwd/o$h;->a:Ljava/lang/Object;

    .line 205
    .line 206
    iput-object v5, v12, Lwd/o$h;->b:Ljava/lang/Object;

    .line 207
    .line 208
    iput v15, v12, Lwd/o$h;->f:I

    .line 209
    .line 210
    invoke-virtual {v0, v6, v12}, Lwd/i;->k(Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 214
    if-ne v0, v2, :cond_4

    .line 215
    .line 216
    goto/16 :goto_7

    .line 217
    .line 218
    :goto_4
    :try_start_4
    move-object v11, v0

    .line 219
    check-cast v11, Lwd/i$d;

    .line 220
    .line 221
    sget-object v0, Lwd/s;->w:Lwd/s$a;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_c
    .catchall {:try_start_4 .. :try_end_4} :catchall_b

    .line 222
    .line 223
    move-object v5, v4

    .line 224
    :try_start_5
    iget-object v4, v1, Lwd/o;->a:Landroid/content/Context;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_b
    .catchall {:try_start_5 .. :try_end_5} :catchall_a

    .line 225
    .line 226
    move-object v6, v5

    .line 227
    :try_start_6
    iget-object v5, v1, Lwd/o;->b:Lexpo/modules/updates/d;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_a
    .catchall {:try_start_6 .. :try_end_6} :catchall_9

    .line 228
    .line 229
    move-object v8, v6

    .line 230
    :try_start_7
    iget-object v6, v1, Lwd/o;->g:Lxd/g;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_9
    .catchall {:try_start_7 .. :try_end_7} :catchall_8

    .line 231
    .line 232
    move-object v9, v8

    .line 233
    :try_start_8
    iget-object v8, v1, Lwd/o;->f:LBd/h;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 234
    .line 235
    move-object v10, v9

    .line 236
    :try_start_9
    iget-object v9, v1, Lwd/o;->d:Ljava/io/File;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_7
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 237
    .line 238
    :try_start_a
    iget-object v10, v1, Lwd/o;->p:Lvd/b;
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_6
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 239
    .line 240
    if-eqz v10, :cond_7

    .line 241
    .line 242
    :try_start_b
    invoke-interface {v10}, Lvd/b;->d()Lrd/d;

    .line 243
    .line 244
    .line 245
    move-result-object v10
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_2
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 246
    goto :goto_5

    .line 247
    :catchall_1
    move-exception v0

    .line 248
    move-object v5, v3

    .line 249
    const/4 v14, 0x0

    .line 250
    goto/16 :goto_11

    .line 251
    .line 252
    :catch_2
    move-exception v0

    .line 253
    move-object v5, v3

    .line 254
    const/4 v14, 0x0

    .line 255
    goto/16 :goto_f

    .line 256
    .line 257
    :cond_7
    const/4 v10, 0x0

    .line 258
    :goto_5
    :try_start_c
    iput-object v7, v12, Lwd/o$h;->a:Ljava/lang/Object;

    .line 259
    .line 260
    iput-object v3, v12, Lwd/o$h;->b:Ljava/lang/Object;

    .line 261
    .line 262
    iput v14, v12, Lwd/o$h;->f:I
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_6
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 263
    .line 264
    move-object/from16 v16, v3

    .line 265
    .line 266
    const/4 v14, 0x0

    .line 267
    move-object v3, v0

    .line 268
    :try_start_d
    invoke-virtual/range {v3 .. v12}, Lwd/s$a;->e(Landroid/content/Context;Lexpo/modules/updates/d;Lxd/g;Lexpo/modules/updates/db/UpdatesDatabase;LBd/h;Ljava/io/File;Lrd/d;Lwd/i$d;LZd/e;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v0
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_5
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 272
    if-ne v0, v2, :cond_8

    .line 273
    .line 274
    goto :goto_7

    .line 275
    :cond_8
    move-object v3, v7

    .line 276
    move-object/from16 v5, v16

    .line 277
    .line 278
    :goto_6
    :try_start_e
    check-cast v0, Lwd/p;

    .line 279
    .line 280
    invoke-virtual {v0}, Lwd/p;->c()Lrd/d;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    new-instance v16, Lvd/a;

    .line 285
    .line 286
    iget-object v4, v1, Lwd/o;->a:Landroid/content/Context;

    .line 287
    .line 288
    iget-object v6, v1, Lwd/o;->b:Lexpo/modules/updates/d;

    .line 289
    .line 290
    iget-object v7, v1, Lwd/o;->d:Ljava/io/File;

    .line 291
    .line 292
    iget-object v8, v1, Lwd/o;->e:Lwd/g;

    .line 293
    .line 294
    iget-object v9, v1, Lwd/o;->f:LBd/h;

    .line 295
    .line 296
    iget-object v10, v1, Lwd/o;->g:Lxd/g;

    .line 297
    .line 298
    iget-object v11, v1, Lwd/o;->i:LGf/O;

    .line 299
    .line 300
    const/16 v25, 0x80

    .line 301
    .line 302
    const/16 v26, 0x0

    .line 303
    .line 304
    const/16 v24, 0x0

    .line 305
    .line 306
    move-object/from16 v17, v4

    .line 307
    .line 308
    move-object/from16 v18, v6

    .line 309
    .line 310
    move-object/from16 v19, v7

    .line 311
    .line 312
    move-object/from16 v20, v8

    .line 313
    .line 314
    move-object/from16 v21, v9

    .line 315
    .line 316
    move-object/from16 v22, v10

    .line 317
    .line 318
    move-object/from16 v23, v11

    .line 319
    .line 320
    invoke-direct/range {v16 .. v26}, Lvd/a;-><init>(Landroid/content/Context;Lexpo/modules/updates/d;Ljava/io/File;Lwd/g;LBd/h;Lxd/g;LGf/O;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_4
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    .line 321
    .line 322
    .line 323
    move-object/from16 v4, v16

    .line 324
    .line 325
    :try_start_f
    iput-object v5, v12, Lwd/o$h;->a:Ljava/lang/Object;

    .line 326
    .line 327
    iput-object v0, v12, Lwd/o$h;->b:Ljava/lang/Object;

    .line 328
    .line 329
    iput-object v4, v12, Lwd/o$h;->c:Ljava/lang/Object;

    .line 330
    .line 331
    iput v13, v12, Lwd/o$h;->f:I

    .line 332
    .line 333
    invoke-virtual {v4, v3, v12}, Lvd/a;->i(Lexpo/modules/updates/db/UpdatesDatabase;LZd/e;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v3

    .line 337
    if-ne v3, v2, :cond_9

    .line 338
    .line 339
    :goto_7
    return-object v2

    .line 340
    :cond_9
    move-object v3, v0

    .line 341
    move-object v2, v4

    .line 342
    :goto_8
    monitor-enter p0
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_3
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    .line 343
    :try_start_10
    iget-boolean v0, v1, Lwd/o;->m:Z

    .line 344
    .line 345
    if-nez v0, :cond_a

    .line 346
    .line 347
    iput-object v2, v1, Lwd/o;->p:Lvd/b;

    .line 348
    .line 349
    iput-boolean v15, v1, Lwd/o;->n:Z

    .line 350
    .line 351
    goto :goto_9

    .line 352
    :catchall_2
    move-exception v0

    .line 353
    goto :goto_b

    .line 354
    :cond_a
    :goto_9
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    .line 355
    .line 356
    :try_start_11
    monitor-exit p0

    .line 357
    if-nez v3, :cond_b

    .line 358
    .line 359
    iget-object v0, v1, Lwd/o;->h:Lwd/o$b;

    .line 360
    .line 361
    sget-object v2, Lwd/o$e;->b:Lwd/o$e;

    .line 362
    .line 363
    invoke-interface {v0, v2, v14, v14}, Lwd/o$b;->f(Lwd/o$e;Lrd/d;Ljava/lang/Exception;)V

    .line 364
    .line 365
    .line 366
    goto :goto_a

    .line 367
    :catchall_3
    move-exception v0

    .line 368
    goto/16 :goto_11

    .line 369
    .line 370
    :catch_3
    move-exception v0

    .line 371
    goto :goto_c

    .line 372
    :cond_b
    iget-object v0, v1, Lwd/o;->h:Lwd/o$b;

    .line 373
    .line 374
    sget-object v2, Lwd/o$e;->c:Lwd/o$e;

    .line 375
    .line 376
    invoke-interface {v0, v2, v3, v14}, Lwd/o$b;->f(Lwd/o$e;Lrd/d;Ljava/lang/Exception;)V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_3
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    .line 377
    .line 378
    .line 379
    :goto_a
    invoke-static {v5, v14, v15, v14}, LGf/C0$a;->a(LGf/C0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    sget-object v0, LTd/L;->a:LTd/L;

    .line 383
    .line 384
    return-object v0

    .line 385
    :goto_b
    :try_start_12
    monitor-exit p0

    .line 386
    throw v0
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_3
    .catchall {:try_start_12 .. :try_end_12} :catchall_3

    .line 387
    :goto_c
    :try_start_13
    iget-object v2, v1, Lwd/o;->h:Lwd/o$b;

    .line 388
    .line 389
    sget-object v3, Lwd/o$e;->a:Lwd/o$e;

    .line 390
    .line 391
    invoke-interface {v2, v3, v14, v0}, Lwd/o$b;->f(Lwd/o$e;Lrd/d;Ljava/lang/Exception;)V

    .line 392
    .line 393
    .line 394
    iget-object v2, v1, Lwd/o;->g:Lxd/g;

    .line 395
    .line 396
    const-string v3, "Loaded new update but it failed to launch"

    .line 397
    .line 398
    sget-object v4, Lxd/b;->h:Lxd/b;

    .line 399
    .line 400
    invoke-virtual {v2, v3, v0, v4}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V

    .line 401
    .line 402
    .line 403
    throw v0
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_4
    .catchall {:try_start_13 .. :try_end_13} :catchall_3

    .line 404
    :catch_4
    move-exception v0

    .line 405
    goto/16 :goto_f

    .line 406
    .line 407
    :catchall_4
    move-exception v0

    .line 408
    :goto_d
    move-object/from16 v5, v16

    .line 409
    .line 410
    goto/16 :goto_11

    .line 411
    .line 412
    :catch_5
    move-exception v0

    .line 413
    :goto_e
    move-object/from16 v5, v16

    .line 414
    .line 415
    goto/16 :goto_f

    .line 416
    .line 417
    :catchall_5
    move-exception v0

    .line 418
    move-object/from16 v16, v3

    .line 419
    .line 420
    const/4 v14, 0x0

    .line 421
    goto :goto_d

    .line 422
    :catch_6
    move-exception v0

    .line 423
    move-object/from16 v16, v3

    .line 424
    .line 425
    const/4 v14, 0x0

    .line 426
    goto :goto_e

    .line 427
    :catchall_6
    move-exception v0

    .line 428
    move-object/from16 v16, v3

    .line 429
    .line 430
    move-object v14, v10

    .line 431
    goto :goto_d

    .line 432
    :catch_7
    move-exception v0

    .line 433
    move-object/from16 v16, v3

    .line 434
    .line 435
    move-object v14, v10

    .line 436
    goto :goto_e

    .line 437
    :catchall_7
    move-exception v0

    .line 438
    move-object/from16 v16, v3

    .line 439
    .line 440
    move-object v14, v9

    .line 441
    goto :goto_d

    .line 442
    :catch_8
    move-exception v0

    .line 443
    move-object/from16 v16, v3

    .line 444
    .line 445
    move-object v14, v9

    .line 446
    goto :goto_e

    .line 447
    :catchall_8
    move-exception v0

    .line 448
    move-object/from16 v16, v3

    .line 449
    .line 450
    move-object v14, v8

    .line 451
    goto :goto_d

    .line 452
    :catch_9
    move-exception v0

    .line 453
    move-object/from16 v16, v3

    .line 454
    .line 455
    move-object v14, v8

    .line 456
    goto :goto_e

    .line 457
    :catchall_9
    move-exception v0

    .line 458
    move-object/from16 v16, v3

    .line 459
    .line 460
    move-object v14, v6

    .line 461
    goto :goto_d

    .line 462
    :catch_a
    move-exception v0

    .line 463
    move-object/from16 v16, v3

    .line 464
    .line 465
    move-object v14, v6

    .line 466
    goto :goto_e

    .line 467
    :catchall_a
    move-exception v0

    .line 468
    move-object/from16 v16, v3

    .line 469
    .line 470
    move-object v14, v5

    .line 471
    goto :goto_d

    .line 472
    :catch_b
    move-exception v0

    .line 473
    move-object/from16 v16, v3

    .line 474
    .line 475
    move-object v14, v5

    .line 476
    goto :goto_e

    .line 477
    :catchall_b
    move-exception v0

    .line 478
    move-object/from16 v16, v3

    .line 479
    .line 480
    move-object v14, v4

    .line 481
    goto :goto_d

    .line 482
    :catch_c
    move-exception v0

    .line 483
    move-object/from16 v16, v3

    .line 484
    .line 485
    move-object v14, v4

    .line 486
    goto :goto_e

    .line 487
    :goto_f
    :try_start_14
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v2

    .line 491
    if-eqz v2, :cond_c

    .line 492
    .line 493
    const-string v3, "Loaded new update but it failed to launch"

    .line 494
    .line 495
    const/4 v4, 0x0

    .line 496
    const/4 v6, 0x2

    .line 497
    invoke-static {v2, v3, v4, v6, v14}, LDf/r;->W(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    move-result v2

    .line 501
    if-ne v2, v15, :cond_c

    .line 502
    .line 503
    goto :goto_10

    .line 504
    :cond_c
    iget-object v2, v1, Lwd/o;->h:Lwd/o$b;

    .line 505
    .line 506
    sget-object v3, Lwd/o$e;->a:Lwd/o$e;

    .line 507
    .line 508
    invoke-interface {v2, v3, v14, v0}, Lwd/o$b;->f(Lwd/o$e;Lrd/d;Ljava/lang/Exception;)V

    .line 509
    .line 510
    .line 511
    iget-object v2, v1, Lwd/o;->g:Lxd/g;

    .line 512
    .line 513
    const-string v3, "Failed to download remote update"

    .line 514
    .line 515
    sget-object v4, Lxd/b;->h:Lxd/b;

    .line 516
    .line 517
    invoke-virtual {v2, v3, v0, v4}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V

    .line 518
    .line 519
    .line 520
    :goto_10
    throw v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_3

    .line 521
    :goto_11
    invoke-static {v5, v14, v15, v14}, LGf/C0$a;->a(LGf/C0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 522
    .line 523
    .line 524
    throw v0
.end method

.method private static final o(Lwd/o;D)LTd/L;
    .locals 0

    .line 1
    iget-object p0, p0, Lwd/o;->h:Lwd/o$b;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lwd/o$b;->h(D)V

    .line 4
    .line 5
    .line 6
    sget-object p0, LTd/L;->a:LTd/L;

    .line 7
    .line 8
    return-object p0
.end method

.method private static final p(Lwd/o;Lwd/v;)Lwd/i$e;
    .locals 7

    .line 1
    const-string v0, "updateResponse"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lwd/v;->a()Lwd/w$a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lwd/w$a;->a()Lwd/u;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v0, v1

    .line 19
    :goto_0
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x1

    .line 21
    if-eqz v0, :cond_3

    .line 22
    .line 23
    instance-of p1, v0, Lwd/u$c;

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    iput-boolean v3, p0, Lwd/o;->n:Z

    .line 28
    .line 29
    iget-object p0, p0, Lwd/o;->h:Lwd/o$b;

    .line 30
    .line 31
    new-instance p1, Lwd/o$c$b;

    .line 32
    .line 33
    check-cast v0, Lwd/u$c;

    .line 34
    .line 35
    invoke-virtual {v0}, Lwd/u$c;->b()Ljava/util/Date;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-direct {p1, v0}, Lwd/o$c$b;-><init>(Ljava/util/Date;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {p0, p1}, Lwd/o$b;->e(Lwd/o$c;)V

    .line 43
    .line 44
    .line 45
    new-instance p0, Lwd/i$e;

    .line 46
    .line 47
    invoke-direct {p0, v2}, Lwd/i$e;-><init>(Z)V

    .line 48
    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_1
    instance-of p1, v0, Lwd/u$b;

    .line 52
    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    iput-boolean v3, p0, Lwd/o;->n:Z

    .line 56
    .line 57
    iget-object p0, p0, Lwd/o;->h:Lwd/o$b;

    .line 58
    .line 59
    new-instance p1, Lwd/o$c$a;

    .line 60
    .line 61
    sget-object v0, Lwd/o$d;->b:Lwd/o$d;

    .line 62
    .line 63
    invoke-direct {p1, v0}, Lwd/o$c$a;-><init>(Lwd/o$d;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {p0, p1}, Lwd/o$b;->e(Lwd/o$c;)V

    .line 67
    .line 68
    .line 69
    new-instance p0, Lwd/i$e;

    .line 70
    .line 71
    invoke-direct {p0, v2}, Lwd/i$e;-><init>(Z)V

    .line 72
    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_2
    new-instance p0, LTd/r;

    .line 76
    .line 77
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 78
    .line 79
    .line 80
    throw p0

    .line 81
    :cond_3
    invoke-virtual {p1}, Lwd/v;->b()Lwd/w$b;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    invoke-virtual {v0}, Lwd/w$b;->a()Lyd/q;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    goto :goto_1

    .line 92
    :cond_4
    move-object v0, v1

    .line 93
    :goto_1
    if-nez v0, :cond_5

    .line 94
    .line 95
    iput-boolean v3, p0, Lwd/o;->n:Z

    .line 96
    .line 97
    iget-object p0, p0, Lwd/o;->h:Lwd/o$b;

    .line 98
    .line 99
    new-instance p1, Lwd/o$c$a;

    .line 100
    .line 101
    sget-object v0, Lwd/o$d;->b:Lwd/o$d;

    .line 102
    .line 103
    invoke-direct {p1, v0}, Lwd/o$c$a;-><init>(Lwd/o$d;)V

    .line 104
    .line 105
    .line 106
    invoke-interface {p0, p1}, Lwd/o$b;->e(Lwd/o$c;)V

    .line 107
    .line 108
    .line 109
    new-instance p0, Lwd/i$e;

    .line 110
    .line 111
    invoke-direct {p0, v2}, Lwd/i$e;-><init>(Z)V

    .line 112
    .line 113
    .line 114
    return-object p0

    .line 115
    :cond_5
    iget-object v4, p0, Lwd/o;->f:LBd/h;

    .line 116
    .line 117
    invoke-interface {v0}, Lyd/q;->c()Lrd/d;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    iget-object v6, p0, Lwd/o;->p:Lvd/b;

    .line 122
    .line 123
    if-eqz v6, :cond_6

    .line 124
    .line 125
    invoke-interface {v6}, Lvd/b;->d()Lrd/d;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    goto :goto_2

    .line 130
    :cond_6
    move-object v6, v1

    .line 131
    :goto_2
    invoke-virtual {p1}, Lwd/v;->c()Lyd/n;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    if-eqz p1, :cond_7

    .line 136
    .line 137
    invoke-virtual {p1}, Lyd/n;->d()Lorg/json/JSONObject;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    :cond_7
    invoke-virtual {v4, v5, v6, v1}, LBd/h;->c(Lrd/d;Lrd/d;Lorg/json/JSONObject;)Z

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    if-eqz p1, :cond_8

    .line 146
    .line 147
    iput-boolean v2, p0, Lwd/o;->n:Z

    .line 148
    .line 149
    iget-object p1, p0, Lwd/o;->h:Lwd/o$b;

    .line 150
    .line 151
    invoke-interface {p1, v0}, Lwd/o$b;->b(Lyd/q;)V

    .line 152
    .line 153
    .line 154
    iget-object p1, p0, Lwd/o;->h:Lwd/o$b;

    .line 155
    .line 156
    new-instance v1, Lwd/o$c$d;

    .line 157
    .line 158
    invoke-interface {v0}, Lyd/q;->d()LAc/e;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {v0}, LAc/e;->i()Lorg/json/JSONObject;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-direct {v1, v0}, Lwd/o$c$d;-><init>(Lorg/json/JSONObject;)V

    .line 167
    .line 168
    .line 169
    invoke-interface {p1, v1}, Lwd/o$b;->e(Lwd/o$c;)V

    .line 170
    .line 171
    .line 172
    iget-object p0, p0, Lwd/o;->h:Lwd/o$b;

    .line 173
    .line 174
    invoke-interface {p0}, Lwd/o$b;->d()V

    .line 175
    .line 176
    .line 177
    new-instance p0, Lwd/i$e;

    .line 178
    .line 179
    invoke-direct {p0, v3}, Lwd/i$e;-><init>(Z)V

    .line 180
    .line 181
    .line 182
    return-object p0

    .line 183
    :cond_8
    iput-boolean v3, p0, Lwd/o;->n:Z

    .line 184
    .line 185
    iget-object p0, p0, Lwd/o;->h:Lwd/o$b;

    .line 186
    .line 187
    new-instance p1, Lwd/o$c$a;

    .line 188
    .line 189
    sget-object v0, Lwd/o$d;->c:Lwd/o$d;

    .line 190
    .line 191
    invoke-direct {p1, v0}, Lwd/o$c$a;-><init>(Lwd/o$d;)V

    .line 192
    .line 193
    .line 194
    invoke-interface {p0, p1}, Lwd/o$b;->e(Lwd/o$c;)V

    .line 195
    .line 196
    .line 197
    new-instance p0, Lwd/i$e;

    .line 198
    .line 199
    invoke-direct {p0, v2}, Lwd/i$e;-><init>(Z)V

    .line 200
    .line 201
    .line 202
    return-object p0
.end method

.method private final declared-synchronized q()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lwd/o;->k:Z

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-boolean v0, p0, Lwd/o;->l:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    invoke-direct {p0, v0}, Lwd/o;->i(Ljava/lang/Exception;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    monitor-exit p0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    :goto_0
    monitor-exit p0

    .line 20
    return-void

    .line 21
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    throw v0
.end method

.method private final r()V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lwd/o;->q:Lvd/b;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Lvd/b;->d()Lrd/d;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception v0

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v1, p0, Lwd/o;->c:Lpd/c;

    .line 17
    .line 18
    invoke-virtual {v1}, Lpd/c;->c()Lexpo/modules/updates/db/UpdatesDatabase;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v2, p0, Lwd/o;->b:Lexpo/modules/updates/d;

    .line 23
    .line 24
    iget-object v3, p0, Lwd/o;->d:Ljava/io/File;

    .line 25
    .line 26
    iget-object v4, p0, Lwd/o;->f:LBd/h;

    .line 27
    .line 28
    invoke-static {v2, v1, v3, v0, v4}, Lpd/d;->a(Lexpo/modules/updates/d;Lexpo/modules/updates/db/UpdatesDatabase;Ljava/io/File;Lrd/d;LBd/h;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    monitor-exit p0

    .line 34
    return-void

    .line 35
    :goto_1
    monitor-exit p0

    .line 36
    throw v0
.end method

.method private static final t(Lwd/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lwd/o;->v()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final declared-synchronized u()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x1

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lwd/o;->l:Z

    .line 4
    .line 5
    iget-object v0, p0, Lwd/o;->o:Landroid/os/HandlerThread;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/os/HandlerThread;->quitSafely()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    throw v0
.end method

.method private final declared-synchronized v()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lwd/o;->l:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lwd/o;->l:Z

    .line 8
    .line 9
    invoke-direct {p0}, Lwd/o;->q()V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    :goto_0
    invoke-direct {p0}, Lwd/o;->u()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    monitor-exit p0

    .line 19
    return-void

    .line 20
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw v0
.end method


# virtual methods
.method public final j()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lwd/o;->j:Z

    .line 2
    .line 3
    return v0
.end method

.method public final s(LZd/e;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p1, Lwd/o$j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lwd/o$j;

    .line 7
    .line 8
    iget v1, v0, Lwd/o$j;->e:I

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
    iput v1, v0, Lwd/o$j;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lwd/o$j;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lwd/o$j;-><init>(Lwd/o;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lwd/o$j;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lwd/o$j;->e:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x4

    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v7, 0x1

    .line 38
    if-eqz v2, :cond_4

    .line 39
    .line 40
    if-eq v2, v7, :cond_3

    .line 41
    .line 42
    if-eq v2, v6, :cond_2

    .line 43
    .line 44
    if-eq v2, v5, :cond_2

    .line 45
    .line 46
    if-ne v2, v4, :cond_1

    .line 47
    .line 48
    iget-object v0, v0, Lwd/o$j;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Ljava/lang/Exception;

    .line 51
    .line 52
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_5

    .line 56
    .line 57
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :cond_2
    iget-boolean v2, v0, Lwd/o$j;->a:Z

    .line 66
    .line 67
    :try_start_0
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    .line 70
    goto/16 :goto_7

    .line 71
    .line 72
    :catch_0
    move-exception p1

    .line 73
    goto/16 :goto_3

    .line 74
    .line 75
    :cond_3
    iget-boolean v2, v0, Lwd/o$j;->a:Z

    .line 76
    .line 77
    :try_start_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 78
    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    iput-boolean v7, p0, Lwd/o;->j:Z

    .line 85
    .line 86
    sget-object p1, Lexpo/modules/updates/g;->a:Lexpo/modules/updates/g;

    .line 87
    .line 88
    iget-object v2, p0, Lwd/o;->b:Lexpo/modules/updates/d;

    .line 89
    .line 90
    iget-object v8, p0, Lwd/o;->g:Lxd/g;

    .line 91
    .line 92
    iget-object v9, p0, Lwd/o;->a:Landroid/content/Context;

    .line 93
    .line 94
    invoke-virtual {p1, v2, v8, v9}, Lexpo/modules/updates/g;->j(Lexpo/modules/updates/d;Lxd/g;Landroid/content/Context;)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    iget-object p1, p0, Lwd/o;->b:Lexpo/modules/updates/d;

    .line 99
    .line 100
    invoke-virtual {p1}, Lexpo/modules/updates/d;->l()I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-lez p1, :cond_5

    .line 105
    .line 106
    if-eqz v2, :cond_5

    .line 107
    .line 108
    iget-object v8, p0, Lwd/o;->o:Landroid/os/HandlerThread;

    .line 109
    .line 110
    invoke-virtual {v8}, Ljava/lang/Thread;->start()V

    .line 111
    .line 112
    .line 113
    new-instance v8, Landroid/os/Handler;

    .line 114
    .line 115
    iget-object v9, p0, Lwd/o;->o:Landroid/os/HandlerThread;

    .line 116
    .line 117
    invoke-virtual {v9}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    invoke-direct {v8, v9}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 122
    .line 123
    .line 124
    new-instance v9, Lwd/k;

    .line 125
    .line 126
    invoke-direct {v9, p0}, Lwd/k;-><init>(Lwd/o;)V

    .line 127
    .line 128
    .line 129
    int-to-long v10, p1

    .line 130
    invoke-virtual {v8, v9, v10, v11}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_5
    iput-boolean v7, p0, Lwd/o;->l:Z

    .line 139
    .line 140
    :goto_1
    :try_start_2
    iput-boolean v2, v0, Lwd/o$j;->a:Z

    .line 141
    .line 142
    iput v7, v0, Lwd/o$j;->e:I

    .line 143
    .line 144
    invoke-direct {p0, v0}, Lwd/o;->k(LZd/e;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    if-ne p1, v1, :cond_6

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_6
    :goto_2
    iget-object p1, p0, Lwd/o;->p:Lvd/b;

    .line 152
    .line 153
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    invoke-interface {p1}, Lvd/b;->d()Lrd/d;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    if-eqz p1, :cond_7

    .line 161
    .line 162
    iget-object p1, p0, Lwd/o;->h:Lwd/o$b;

    .line 163
    .line 164
    iget-object v8, p0, Lwd/o;->p:Lvd/b;

    .line 165
    .line 166
    invoke-static {v8}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    invoke-interface {v8}, Lvd/b;->d()Lrd/d;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    invoke-static {v8}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    invoke-interface {p1, v8}, Lwd/o$b;->c(Lrd/d;)Z

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    if-nez p1, :cond_7

    .line 181
    .line 182
    invoke-direct {p0}, Lwd/o;->u()V

    .line 183
    .line 184
    .line 185
    const/4 p1, 0x0

    .line 186
    iput-object p1, p0, Lwd/o;->p:Lvd/b;

    .line 187
    .line 188
    iput-boolean v2, v0, Lwd/o$j;->a:Z

    .line 189
    .line 190
    iput v6, v0, Lwd/o$j;->e:I

    .line 191
    .line 192
    invoke-direct {p0, v0}, Lwd/o;->m(LZd/e;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    if-ne p1, v1, :cond_b

    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_7
    monitor-enter p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 200
    :try_start_3
    iput-boolean v7, p0, Lwd/o;->k:Z

    .line 201
    .line 202
    invoke-direct {p0}, Lwd/o;->q()V

    .line 203
    .line 204
    .line 205
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 206
    .line 207
    :try_start_4
    monitor-exit p0

    .line 208
    if-eqz v2, :cond_8

    .line 209
    .line 210
    iput-boolean v2, v0, Lwd/o$j;->a:Z

    .line 211
    .line 212
    iput v5, v0, Lwd/o$j;->e:I

    .line 213
    .line 214
    invoke-direct {p0, v0}, Lwd/o;->m(LZd/e;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    if-ne p1, v1, :cond_b

    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_8
    iput-boolean v3, p0, Lwd/o;->j:Z

    .line 222
    .line 223
    invoke-direct {p0}, Lwd/o;->r()V

    .line 224
    .line 225
    .line 226
    iget-object p1, p0, Lwd/o;->h:Lwd/o$b;

    .line 227
    .line 228
    invoke-interface {p1}, Lwd/o$b;->g()V

    .line 229
    .line 230
    .line 231
    goto :goto_7

    .line 232
    :catchall_0
    move-exception p1

    .line 233
    monitor-exit p0

    .line 234
    throw p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 235
    :goto_3
    if-nez v2, :cond_9

    .line 236
    .line 237
    invoke-direct {p0, p1}, Lwd/o;->i(Ljava/lang/Exception;)V

    .line 238
    .line 239
    .line 240
    iput-boolean v3, p0, Lwd/o;->j:Z

    .line 241
    .line 242
    iget-object v0, p0, Lwd/o;->h:Lwd/o$b;

    .line 243
    .line 244
    invoke-interface {v0}, Lwd/o$b;->g()V

    .line 245
    .line 246
    .line 247
    goto :goto_6

    .line 248
    :cond_9
    iput-object p1, v0, Lwd/o$j;->b:Ljava/lang/Object;

    .line 249
    .line 250
    iput v4, v0, Lwd/o$j;->e:I

    .line 251
    .line 252
    invoke-direct {p0, v0}, Lwd/o;->m(LZd/e;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    if-ne v0, v1, :cond_a

    .line 257
    .line 258
    :goto_4
    return-object v1

    .line 259
    :cond_a
    move-object v0, p1

    .line 260
    :goto_5
    move-object p1, v0

    .line 261
    :goto_6
    iget-object v0, p0, Lwd/o;->g:Lxd/g;

    .line 262
    .line 263
    const-string v1, "Failed to launch embedded or launchable update"

    .line 264
    .line 265
    sget-object v2, Lxd/b;->h:Lxd/b;

    .line 266
    .line 267
    invoke-virtual {v0, v1, p1, v2}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V

    .line 268
    .line 269
    .line 270
    :cond_b
    :goto_7
    sget-object p1, LTd/L;->a:LTd/L;

    .line 271
    .line 272
    return-object p1
.end method
