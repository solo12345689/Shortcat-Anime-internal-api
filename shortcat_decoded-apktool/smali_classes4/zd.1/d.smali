.class public final Lzd/d;
.super Lzd/j;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lexpo/modules/updates/d;

.field private final c:Lxd/g;

.field private final d:Lpd/c;

.field private final e:Ljava/io/File;

.field private final f:Lwd/g;

.field private final g:LBd/h;

.field private final h:Lrd/d;

.field private final i:Lkotlin/jvm/functions/Function1;

.field private final j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lexpo/modules/updates/d;Lxd/g;Lpd/c;Ljava/io/File;Lwd/g;LBd/h;Lrd/d;Lkotlin/jvm/functions/Function1;)V
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
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "logger"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "databaseHolder"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "updatesDirectory"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "fileDownloader"

    .line 27
    .line 28
    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "selectionPolicy"

    .line 32
    .line 33
    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "callback"

    .line 37
    .line 38
    invoke-static {p9, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0}, Lzd/j;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lzd/d;->a:Landroid/content/Context;

    .line 45
    .line 46
    iput-object p2, p0, Lzd/d;->b:Lexpo/modules/updates/d;

    .line 47
    .line 48
    iput-object p3, p0, Lzd/d;->c:Lxd/g;

    .line 49
    .line 50
    iput-object p4, p0, Lzd/d;->d:Lpd/c;

    .line 51
    .line 52
    iput-object p5, p0, Lzd/d;->e:Ljava/io/File;

    .line 53
    .line 54
    iput-object p6, p0, Lzd/d;->f:Lwd/g;

    .line 55
    .line 56
    iput-object p7, p0, Lzd/d;->g:LBd/h;

    .line 57
    .line 58
    iput-object p8, p0, Lzd/d;->h:Lrd/d;

    .line 59
    .line 60
    iput-object p9, p0, Lzd/d;->i:Lkotlin/jvm/functions/Function1;

    .line 61
    .line 62
    const-string p1, "timer-fetch-update"

    .line 63
    .line 64
    iput-object p1, p0, Lzd/d;->j:Ljava/lang/String;

    .line 65
    .line 66
    return-void
.end method

.method public static synthetic c(Lzd/d;Lwd/v;)Lwd/i$e;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lzd/d;->j(Lzd/d;Lwd/v;)Lwd/i$e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic d(Lzd/j$a;D)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lzd/d;->i(Lzd/j$a;D)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic e(Lzd/d;Lwd/i$d;Lzd/j$a;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lzd/d;->g(Lwd/i$d;Lzd/j$a;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic f(Lzd/d;Lexpo/modules/updates/db/UpdatesDatabase;Lzd/j$a;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lzd/d;->h(Lexpo/modules/updates/db/UpdatesDatabase;Lzd/j$a;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final g(Lwd/i$d;Lzd/j$a;LZd/e;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p3, Lzd/d$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lzd/d$a;

    .line 7
    .line 8
    iget v1, v0, Lzd/d$a;->d:I

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
    iput v1, v0, Lzd/d$a;->d:I

    .line 18
    .line 19
    :goto_0
    move-object v10, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lzd/d$a;

    .line 22
    .line 23
    invoke-direct {v0, p0, p3}, Lzd/d$a;-><init>(Lzd/d;LZd/e;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p3, v10, Lzd/d$a;->b:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, v10, Lzd/d$a;->d:I

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    if-ne v1, v2, :cond_1

    .line 39
    .line 40
    iget-object p1, v10, Lzd/d$a;->a:Ljava/lang/Object;

    .line 41
    .line 42
    move-object p2, p1

    .line 43
    check-cast p2, Lzd/j$a;

    .line 44
    .line 45
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_2
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    sget-object v1, Lwd/s;->w:Lwd/s$a;

    .line 61
    .line 62
    move p3, v2

    .line 63
    iget-object v2, p0, Lzd/d;->a:Landroid/content/Context;

    .line 64
    .line 65
    iget-object v3, p0, Lzd/d;->b:Lexpo/modules/updates/d;

    .line 66
    .line 67
    iget-object v4, p0, Lzd/d;->c:Lxd/g;

    .line 68
    .line 69
    iget-object v5, p0, Lzd/d;->d:Lpd/c;

    .line 70
    .line 71
    invoke-virtual {v5}, Lpd/c;->c()Lexpo/modules/updates/db/UpdatesDatabase;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    iget-object v6, p0, Lzd/d;->g:LBd/h;

    .line 76
    .line 77
    iget-object v7, p0, Lzd/d;->e:Ljava/io/File;

    .line 78
    .line 79
    iget-object v8, p0, Lzd/d;->h:Lrd/d;

    .line 80
    .line 81
    iput-object p2, v10, Lzd/d$a;->a:Ljava/lang/Object;

    .line 82
    .line 83
    iput p3, v10, Lzd/d$a;->d:I

    .line 84
    .line 85
    move-object v9, p1

    .line 86
    invoke-virtual/range {v1 .. v10}, Lwd/s$a;->e(Landroid/content/Context;Lexpo/modules/updates/d;Lxd/g;Lexpo/modules/updates/db/UpdatesDatabase;LBd/h;Ljava/io/File;Lrd/d;Lwd/i$d;LZd/e;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p3

    .line 90
    if-ne p3, v0, :cond_3

    .line 91
    .line 92
    return-object v0

    .line 93
    :cond_3
    :goto_2
    check-cast p3, Lwd/p;

    .line 94
    .line 95
    invoke-virtual {p3}, Lwd/p;->a()Lrd/d;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p3}, Lwd/p;->b()Z

    .line 100
    .line 101
    .line 102
    move-result p3

    .line 103
    if-eqz p3, :cond_4

    .line 104
    .line 105
    new-instance p1, LCd/e$h;

    .line 106
    .line 107
    invoke-direct {p1}, LCd/e$h;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-interface {p2, p1}, Lzd/j$b;->a(LCd/e;)V

    .line 111
    .line 112
    .line 113
    iget-object p1, p0, Lzd/d;->i:Lkotlin/jvm/functions/Function1;

    .line 114
    .line 115
    new-instance p2, Lexpo/modules/updates/c$b$c;

    .line 116
    .line 117
    invoke-direct {p2}, Lexpo/modules/updates/c$b$c;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_4
    if-nez p1, :cond_5

    .line 125
    .line 126
    new-instance p1, LCd/e$g;

    .line 127
    .line 128
    invoke-direct {p1}, LCd/e$g;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-interface {p2, p1}, Lzd/j$b;->a(LCd/e;)V

    .line 132
    .line 133
    .line 134
    iget-object p1, p0, Lzd/d;->i:Lkotlin/jvm/functions/Function1;

    .line 135
    .line 136
    new-instance p2, Lexpo/modules/updates/c$b$b;

    .line 137
    .line 138
    invoke-direct {p2}, Lexpo/modules/updates/c$b$b;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_5
    new-instance p3, LCd/e$i;

    .line 146
    .line 147
    invoke-virtual {p1}, Lrd/d;->i()Lorg/json/JSONObject;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-direct {p3, v0}, LCd/e$i;-><init>(Lorg/json/JSONObject;)V

    .line 152
    .line 153
    .line 154
    invoke-interface {p2, p3}, Lzd/j$b;->a(LCd/e;)V

    .line 155
    .line 156
    .line 157
    iget-object p2, p0, Lzd/d;->i:Lkotlin/jvm/functions/Function1;

    .line 158
    .line 159
    new-instance p3, Lexpo/modules/updates/c$b$e;

    .line 160
    .line 161
    invoke-direct {p3, p1}, Lexpo/modules/updates/c$b$e;-><init>(Lrd/d;)V

    .line 162
    .line 163
    .line 164
    invoke-interface {p2, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    :goto_3
    sget-object p1, LTd/L;->a:LTd/L;

    .line 168
    .line 169
    return-object p1
.end method

.method private final h(Lexpo/modules/updates/db/UpdatesDatabase;Lzd/j$a;LZd/e;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p3, Lzd/d$c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lzd/d$c;

    .line 7
    .line 8
    iget v1, v0, Lzd/d$c;->c:I

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
    iput v1, v0, Lzd/d$c;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lzd/d$c;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lzd/d$c;-><init>(Lzd/d;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lzd/d$c;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lzd/d$c;->c:I

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
    :try_start_0
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catch_0
    move-exception v0

    .line 43
    move-object p1, v0

    .line 44
    goto :goto_2

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    new-instance v4, Lwd/s;

    .line 57
    .line 58
    iget-object v5, p0, Lzd/d;->a:Landroid/content/Context;

    .line 59
    .line 60
    iget-object v6, p0, Lzd/d;->b:Lexpo/modules/updates/d;

    .line 61
    .line 62
    iget-object v7, p0, Lzd/d;->c:Lxd/g;

    .line 63
    .line 64
    iget-object v9, p0, Lzd/d;->f:Lwd/g;

    .line 65
    .line 66
    iget-object v10, p0, Lzd/d;->e:Ljava/io/File;

    .line 67
    .line 68
    iget-object v11, p0, Lzd/d;->h:Lrd/d;

    .line 69
    .line 70
    move-object v8, p1

    .line 71
    invoke-direct/range {v4 .. v11}, Lwd/s;-><init>(Landroid/content/Context;Lexpo/modules/updates/d;Lxd/g;Lexpo/modules/updates/db/UpdatesDatabase;Lwd/g;Ljava/io/File;Lrd/d;)V

    .line 72
    .line 73
    .line 74
    new-instance p1, Lzd/b;

    .line 75
    .line 76
    invoke-direct {p1, p2}, Lzd/b;-><init>(Lzd/j$a;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4, p1}, Lwd/i;->q(Lkotlin/jvm/functions/Function1;)V

    .line 80
    .line 81
    .line 82
    :try_start_1
    new-instance p1, Lzd/c;

    .line 83
    .line 84
    invoke-direct {p1, p0}, Lzd/c;-><init>(Lzd/d;)V

    .line 85
    .line 86
    .line 87
    iput v3, v0, Lzd/d$c;->c:I

    .line 88
    .line 89
    invoke-virtual {v4, p1, v0}, Lwd/i;->k(Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p3

    .line 93
    if-ne p3, v1, :cond_3

    .line 94
    .line 95
    return-object v1

    .line 96
    :cond_3
    :goto_1
    check-cast p3, Lwd/i$d;
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 97
    .line 98
    return-object p3

    .line 99
    :goto_2
    iget-object p2, p0, Lzd/d;->c:Lxd/g;

    .line 100
    .line 101
    const-string p3, "Remote loader cancelled during fetch update procedure"

    .line 102
    .line 103
    const/4 v0, 0x2

    .line 104
    const/4 v1, 0x0

    .line 105
    invoke-static {p2, p3, v1, v0, v1}, Lxd/g;->k(Lxd/g;Ljava/lang/String;Lxd/b;ILjava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    throw p1
.end method

.method private static final i(Lzd/j$a;D)LTd/L;
    .locals 1

    .line 1
    new-instance v0, LCd/e$k;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, LCd/e$k;-><init>(D)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Lzd/j$b;->a(LCd/e;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, LTd/L;->a:LTd/L;

    .line 10
    .line 11
    return-object p0
.end method

.method private static final j(Lzd/d;Lwd/v;)Lwd/i$e;
    .locals 4

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
    if-eqz v0, :cond_3

    .line 21
    .line 22
    new-instance p0, Lwd/i$e;

    .line 23
    .line 24
    instance-of p1, v0, Lwd/u$c;

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    instance-of p1, v0, Lwd/u$b;

    .line 30
    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    :goto_1
    invoke-direct {p0, v2}, Lwd/i$e;-><init>(Z)V

    .line 34
    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_2
    new-instance p0, LTd/r;

    .line 38
    .line 39
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 40
    .line 41
    .line 42
    throw p0

    .line 43
    :cond_3
    invoke-virtual {p1}, Lwd/v;->b()Lwd/w$b;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-eqz v0, :cond_6

    .line 48
    .line 49
    invoke-virtual {v0}, Lwd/w$b;->a()Lyd/q;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-nez v0, :cond_4

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_4
    new-instance v2, Lwd/i$e;

    .line 57
    .line 58
    iget-object v3, p0, Lzd/d;->g:LBd/h;

    .line 59
    .line 60
    invoke-interface {v0}, Lyd/q;->c()Lrd/d;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object p0, p0, Lzd/d;->h:Lrd/d;

    .line 65
    .line 66
    invoke-virtual {p1}, Lwd/v;->c()Lyd/n;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-eqz p1, :cond_5

    .line 71
    .line 72
    invoke-virtual {p1}, Lyd/n;->d()Lorg/json/JSONObject;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    :cond_5
    invoke-virtual {v3, v0, p0, v1}, LBd/h;->c(Lrd/d;Lrd/d;Lorg/json/JSONObject;)Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    invoke-direct {v2, p0}, Lwd/i$e;-><init>(Z)V

    .line 81
    .line 82
    .line 83
    return-object v2

    .line 84
    :cond_6
    :goto_2
    new-instance p0, Lwd/i$e;

    .line 85
    .line 86
    invoke-direct {p0, v2}, Lwd/i$e;-><init>(Z)V

    .line 87
    .line 88
    .line 89
    return-object p0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lzd/d;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public b(Lzd/j$a;LZd/e;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lzd/d$b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lzd/d$b;

    .line 7
    .line 8
    iget v1, v0, Lzd/d$b;->d:I

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
    iput v1, v0, Lzd/d$b;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lzd/d$b;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lzd/d$b;-><init>(Lzd/d;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lzd/d$b;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lzd/d$b;->d:I

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
    iget-object p1, v0, Lzd/d$b;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lzd/j$a;

    .line 44
    .line 45
    :try_start_0
    invoke-static {p2}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    goto :goto_3

    .line 49
    :catchall_0
    move-exception v0

    .line 50
    move-object p2, v0

    .line 51
    goto/16 :goto_6

    .line 52
    .line 53
    :catch_0
    move-exception v0

    .line 54
    move-object p2, v0

    .line 55
    move-object v2, p2

    .line 56
    goto :goto_4

    .line 57
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :cond_2
    iget-object p1, v0, Lzd/d$b;->a:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p1, Lzd/j$a;

    .line 68
    .line 69
    :try_start_1
    invoke-static {p2}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_3
    invoke-static {p2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    new-instance p2, LCd/e$f;

    .line 77
    .line 78
    invoke-direct {p2}, LCd/e$f;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-interface {p1, p2}, Lzd/j$b;->a(LCd/e;)V

    .line 82
    .line 83
    .line 84
    iget-object p2, p0, Lzd/d;->d:Lpd/c;

    .line 85
    .line 86
    invoke-virtual {p2}, Lpd/c;->c()Lexpo/modules/updates/db/UpdatesDatabase;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    :try_start_2
    iput-object p1, v0, Lzd/d$b;->a:Ljava/lang/Object;

    .line 91
    .line 92
    iput v4, v0, Lzd/d$b;->d:I

    .line 93
    .line 94
    invoke-direct {p0, p2, p1, v0}, Lzd/d;->h(Lexpo/modules/updates/db/UpdatesDatabase;Lzd/j$a;LZd/e;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    if-ne p2, v1, :cond_4

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_4
    :goto_1
    check-cast p2, Lwd/i$d;

    .line 102
    .line 103
    iput-object p1, v0, Lzd/d$b;->a:Ljava/lang/Object;

    .line 104
    .line 105
    iput v3, v0, Lzd/d$b;->d:I

    .line 106
    .line 107
    invoke-direct {p0, p2, p1, v0}, Lzd/d;->g(Lwd/i$d;Lzd/j$a;LZd/e;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 111
    if-ne p2, v1, :cond_5

    .line 112
    .line 113
    :goto_2
    return-object v1

    .line 114
    :cond_5
    :goto_3
    invoke-interface {p1}, Lzd/j$a;->c()V

    .line 115
    .line 116
    .line 117
    goto :goto_5

    .line 118
    :goto_4
    :try_start_3
    iget-object v0, p0, Lzd/d;->c:Lxd/g;

    .line 119
    .line 120
    const-string v1, "Failed to download new update"

    .line 121
    .line 122
    const/4 v4, 0x4

    .line 123
    const/4 v5, 0x0

    .line 124
    const/4 v3, 0x0

    .line 125
    invoke-static/range {v0 .. v5}, Lxd/g;->h(Lxd/g;Ljava/lang/String;Ljava/lang/Exception;Lxd/b;ILjava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    new-instance p2, LCd/e$j;

    .line 129
    .line 130
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    new-instance v1, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 137
    .line 138
    .line 139
    const-string v3, "Failed to download new update: "

    .line 140
    .line 141
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-direct {p2, v0}, LCd/e$j;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-interface {p1, p2}, Lzd/j$b;->a(LCd/e;)V

    .line 155
    .line 156
    .line 157
    iget-object p2, p0, Lzd/d;->i:Lkotlin/jvm/functions/Function1;

    .line 158
    .line 159
    new-instance v0, Lexpo/modules/updates/c$b$a;

    .line 160
    .line 161
    invoke-direct {v0, v2}, Lexpo/modules/updates/c$b$a;-><init>(Ljava/lang/Exception;)V

    .line 162
    .line 163
    .line 164
    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 165
    .line 166
    .line 167
    goto :goto_3

    .line 168
    :goto_5
    sget-object p1, LTd/L;->a:LTd/L;

    .line 169
    .line 170
    return-object p1

    .line 171
    :goto_6
    invoke-interface {p1}, Lzd/j$a;->c()V

    .line 172
    .line 173
    .line 174
    throw p2
.end method
