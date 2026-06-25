.class public final Lwd/s$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwd/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lwd/s$a;-><init>()V

    return-void
.end method

.method public static synthetic a(Lwd/v;)Lwd/i$e;
    .locals 0

    .line 1
    invoke-static {p0}, Lwd/s$a;->d(Lwd/v;)Lwd/i$e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic b(Lwd/s$a;Landroid/content/Context;Lexpo/modules/updates/d;Lxd/g;Lexpo/modules/updates/db/UpdatesDatabase;LBd/h;Ljava/io/File;Lrd/d;Lwd/u$c;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p9}, Lwd/s$a;->c(Landroid/content/Context;Lexpo/modules/updates/d;Lxd/g;Lexpo/modules/updates/db/UpdatesDatabase;LBd/h;Ljava/io/File;Lrd/d;Lwd/u$c;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final c(Landroid/content/Context;Lexpo/modules/updates/d;Lxd/g;Lexpo/modules/updates/db/UpdatesDatabase;LBd/h;Ljava/io/File;Lrd/d;Lwd/u$c;LZd/e;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-object/from16 v6, p8

    .line 2
    .line 3
    move-object/from16 v0, p9

    .line 4
    .line 5
    instance-of v1, v0, Lwd/s$a$a;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, Lwd/s$a$a;

    .line 11
    .line 12
    iget v2, v1, Lwd/s$a$a;->f:I

    .line 13
    .line 14
    const/high16 v3, -0x80000000

    .line 15
    .line 16
    and-int v5, v2, v3

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v3

    .line 21
    iput v2, v1, Lwd/s$a$a;->f:I

    .line 22
    .line 23
    :goto_0
    move-object v7, v1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v1, Lwd/s$a$a;

    .line 26
    .line 27
    invoke-direct {v1, p0, v0}, Lwd/s$a$a;-><init>(Lwd/s$a;LZd/e;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v0, v7, Lwd/s$a$a;->d:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    iget v1, v7, Lwd/s$a$a;->f:I

    .line 38
    .line 39
    const/4 v9, 0x0

    .line 40
    const/4 v10, 0x1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    if-ne v1, v10, :cond_1

    .line 44
    .line 45
    iget-object p1, v7, Lwd/s$a$a;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Lwd/u$c;

    .line 48
    .line 49
    iget-object p2, v7, Lwd/s$a$a;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p2, Lexpo/modules/updates/db/UpdatesDatabase;

    .line 52
    .line 53
    iget-object v1, v7, Lwd/s$a$a;->a:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Lxd/g;

    .line 56
    .line 57
    :try_start_0
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    .line 60
    move-object v6, p1

    .line 61
    goto :goto_2

    .line 62
    :catch_0
    move-exception v0

    .line 63
    move-object p1, v0

    .line 64
    move-object v3, v1

    .line 65
    goto/16 :goto_3

    .line 66
    .line 67
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 68
    .line 69
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 70
    .line 71
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p1

    .line 75
    :cond_2
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2}, Lexpo/modules/updates/d;->j()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-nez v0, :cond_3

    .line 83
    .line 84
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    return-object p1

    .line 89
    :cond_3
    sget-object v0, Lyd/a;->a:Lyd/a;

    .line 90
    .line 91
    invoke-virtual {v0, p1, p2}, Lyd/a;->b(Landroid/content/Context;Lexpo/modules/updates/d;)Lyd/d;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Lyd/d;->c()Lrd/d;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    sget-object v1, Lyd/k;->a:Lyd/k;

    .line 103
    .line 104
    invoke-virtual {v1, p4, p2}, Lyd/k;->f(Lexpo/modules/updates/db/UpdatesDatabase;Lexpo/modules/updates/d;)Lorg/json/JSONObject;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    move-object/from16 v2, p5

    .line 109
    .line 110
    move-object/from16 v3, p7

    .line 111
    .line 112
    invoke-virtual {v2, v6, v0, v3, v1}, LBd/h;->d(Lwd/u$c;Lrd/d;Lrd/d;Lorg/json/JSONObject;)Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-nez v1, :cond_4

    .line 117
    .line 118
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    return-object p1

    .line 123
    :cond_4
    invoke-virtual {v6}, Lwd/u$c;->b()Ljava/util/Date;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {v0, v1}, Lrd/d;->p(Ljava/util/Date;)V

    .line 128
    .line 129
    .line 130
    :try_start_1
    new-instance v0, Lwd/a;

    .line 131
    .line 132
    move-object v1, p1

    .line 133
    move-object v2, p2

    .line 134
    move-object v3, p3

    .line 135
    move-object v4, p4

    .line 136
    move-object/from16 v5, p6

    .line 137
    .line 138
    invoke-direct/range {v0 .. v5}, Lwd/a;-><init>(Landroid/content/Context;Lexpo/modules/updates/d;Lxd/g;Lexpo/modules/updates/db/UpdatesDatabase;Ljava/io/File;)V

    .line 139
    .line 140
    .line 141
    new-instance p1, Lwd/r;

    .line 142
    .line 143
    invoke-direct {p1}, Lwd/r;-><init>()V

    .line 144
    .line 145
    .line 146
    iput-object p3, v7, Lwd/s$a$a;->a:Ljava/lang/Object;

    .line 147
    .line 148
    iput-object p4, v7, Lwd/s$a$a;->b:Ljava/lang/Object;

    .line 149
    .line 150
    iput-object v6, v7, Lwd/s$a$a;->c:Ljava/lang/Object;

    .line 151
    .line 152
    iput v10, v7, Lwd/s$a$a;->f:I

    .line 153
    .line 154
    invoke-virtual {v0, p1, v7}, Lwd/i;->k(Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 158
    if-ne v0, v8, :cond_5

    .line 159
    .line 160
    return-object v8

    .line 161
    :cond_5
    move-object v1, p3

    .line 162
    move-object p2, p4

    .line 163
    :goto_2
    :try_start_2
    check-cast v0, Lwd/i$d;

    .line 164
    .line 165
    invoke-virtual {v0}, Lwd/i$d;->b()Lrd/d;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-virtual {p2}, Lexpo/modules/updates/db/UpdatesDatabase;->Q()Lqd/e;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v6}, Lwd/u$c;->b()Ljava/util/Date;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-virtual {p2, p1, v0}, Lqd/e;->v(Lrd/d;Ljava/util/Date;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 181
    .line 182
    .line 183
    move v9, v10

    .line 184
    goto :goto_4

    .line 185
    :catch_1
    move-exception v0

    .line 186
    move-object p1, v0

    .line 187
    move-object v3, p3

    .line 188
    :goto_3
    const-string p2, "Embedded update erroneously null when applying roll back to embedded directive"

    .line 189
    .line 190
    sget-object v0, Lxd/b;->h:Lxd/b;

    .line 191
    .line 192
    invoke-virtual {v3, p2, p1, v0}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V

    .line 193
    .line 194
    .line 195
    :goto_4
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    return-object p1
.end method

.method private static final d(Lwd/v;)Lwd/i$e;
    .locals 1

    .line 1
    const-string v0, "it"

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


# virtual methods
.method public final e(Landroid/content/Context;Lexpo/modules/updates/d;Lxd/g;Lexpo/modules/updates/db/UpdatesDatabase;LBd/h;Ljava/io/File;Lrd/d;Lwd/i$d;LZd/e;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object/from16 v0, p9

    .line 2
    .line 3
    instance-of v1, v0, Lwd/s$a$b;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lwd/s$a$b;

    .line 9
    .line 10
    iget v2, v1, Lwd/s$a$b;->c:I

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
    iput v2, v1, Lwd/s$a$b;->c:I

    .line 20
    .line 21
    :goto_0
    move-object v11, v1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v1, Lwd/s$a$b;

    .line 24
    .line 25
    invoke-direct {v1, p0, v0}, Lwd/s$a$b;-><init>(Lwd/s$a;LZd/e;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iget-object v0, v11, Lwd/s$a$b;->a:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iget v2, v11, Lwd/s$a$b;->c:I

    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_2

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
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual/range {p8 .. p8}, Lwd/i$d;->b()Lrd/d;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual/range {p8 .. p8}, Lwd/i$d;->a()Lwd/u;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    if-eqz v2, :cond_4

    .line 66
    .line 67
    instance-of v4, v2, Lwd/u$c;

    .line 68
    .line 69
    if-eqz v4, :cond_4

    .line 70
    .line 71
    move-object v10, v2

    .line 72
    check-cast v10, Lwd/u$c;

    .line 73
    .line 74
    iput v3, v11, Lwd/s$a$b;->c:I

    .line 75
    .line 76
    move-object v2, p0

    .line 77
    move-object v3, p1

    .line 78
    move-object v4, p2

    .line 79
    move-object v5, p3

    .line 80
    move-object/from16 v6, p4

    .line 81
    .line 82
    move-object/from16 v7, p5

    .line 83
    .line 84
    move-object/from16 v8, p6

    .line 85
    .line 86
    move-object/from16 v9, p7

    .line 87
    .line 88
    invoke-direct/range {v2 .. v11}, Lwd/s$a;->c(Landroid/content/Context;Lexpo/modules/updates/d;Lxd/g;Lexpo/modules/updates/db/UpdatesDatabase;LBd/h;Ljava/io/File;Lrd/d;Lwd/u$c;LZd/e;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    if-ne v0, v1, :cond_3

    .line 93
    .line 94
    return-object v1

    .line 95
    :cond_3
    :goto_2
    check-cast v0, Ljava/lang/Boolean;

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    new-instance p2, Lwd/p;

    .line 102
    .line 103
    const/4 p3, 0x0

    .line 104
    invoke-direct {p2, p3, p1}, Lwd/p;-><init>(Lrd/d;Z)V

    .line 105
    .line 106
    .line 107
    return-object p2

    .line 108
    :cond_4
    new-instance p1, Lwd/p;

    .line 109
    .line 110
    const/4 p2, 0x0

    .line 111
    invoke-direct {p1, v0, p2}, Lwd/p;-><init>(Lrd/d;Z)V

    .line 112
    .line 113
    .line 114
    return-object p1
.end method
