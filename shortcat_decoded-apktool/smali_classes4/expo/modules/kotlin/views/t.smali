.class public final Lexpo/modules/kotlin/views/t;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private a:LUb/r;

.field private final b:Lexpo/modules/kotlin/views/r;

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(LUb/r;Lexpo/modules/kotlin/views/r;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "moduleHolder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "definition"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lexpo/modules/kotlin/views/t;->a:LUb/r;

    .line 15
    .line 16
    iput-object p2, p0, Lexpo/modules/kotlin/views/t;->b:Lexpo/modules/kotlin/views/r;

    .line 17
    .line 18
    iput-object p3, p0, Lexpo/modules/kotlin/views/t;->c:Ljava/lang/String;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Landroid/view/View;
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/kotlin/views/t;->b:Lexpo/modules/kotlin/views/r;

    .line 7
    .line 8
    iget-object v1, p0, Lexpo/modules/kotlin/views/t;->a:LUb/r;

    .line 9
    .line 10
    invoke-virtual {v1}, LUb/r;->g()Lgc/c;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Lgc/c;->i()LUb/d;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, p1, v1}, Lexpo/modules/kotlin/views/r;->a(Landroid/content/Context;LUb/d;)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method

.method public final b()Ljava/util/Map;
    .locals 7

    .line 1
    invoke-static {}, LUd/S;->c()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lexpo/modules/kotlin/views/t;->b:Lexpo/modules/kotlin/views/r;

    .line 6
    .line 7
    invoke-virtual {v1}, Lexpo/modules/kotlin/views/r;->c()Lexpo/modules/kotlin/views/b;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Lexpo/modules/kotlin/views/b;->a()[Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    array-length v2, v1

    .line 20
    const/4 v3, 0x0

    .line 21
    :goto_0
    if-ge v3, v2, :cond_0

    .line 22
    .line 23
    aget-object v4, v1, v3

    .line 24
    .line 25
    invoke-static {v4}, Lbc/i;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    const-string v6, "registrationName"

    .line 30
    .line 31
    invoke-static {v6, v4}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-static {v4}, LUd/S;->f(Lkotlin/Pair;)Ljava/util/Map;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    add-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-static {v0}, LUd/S;->b(Ljava/util/Map;)Ljava/util/Map;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0
.end method

.method public final c()LUb/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/views/t;->a:LUb/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/views/t;->c:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lexpo/modules/kotlin/views/t;->a:LUb/r;

    .line 6
    .line 7
    invoke-virtual {v0}, LUb/r;->h()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lexpo/modules/kotlin/views/t;->b:Lexpo/modules/kotlin/views/r;

    .line 12
    .line 13
    invoke-virtual {v1}, Lexpo/modules/kotlin/views/r;->d()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v0, "_"

    .line 26
    .line 27
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :cond_0
    return-object v0
.end method

.method public final e()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/views/t;->b:Lexpo/modules/kotlin/views/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/kotlin/views/r;->g()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final f()Lexpo/modules/kotlin/views/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/views/t;->b:Lexpo/modules/kotlin/views/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/kotlin/views/r;->i()Lexpo/modules/kotlin/views/q;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    return-object v0
.end method

.method public final g(Landroid/view/View;)V
    .locals 4

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Lexpo/modules/kotlin/views/t;->b:Lexpo/modules/kotlin/views/r;

    .line 7
    .line 8
    invoke-virtual {v0}, Lexpo/modules/kotlin/views/r;->e()Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    invoke-static {p1}, Lexpo/modules/kotlin/views/f;->a(Landroid/view/View;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    :cond_0
    return-void

    .line 26
    :cond_1
    instance-of v1, v0, Lexpo/modules/kotlin/exception/CodedException;

    .line 27
    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    check-cast v0, Lexpo/modules/kotlin/exception/CodedException;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    instance-of v1, v0, Lrb/a;

    .line 34
    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    new-instance v1, Lexpo/modules/kotlin/exception/CodedException;

    .line 38
    .line 39
    check-cast v0, Lrb/a;

    .line 40
    .line 41
    invoke-virtual {v0}, Lrb/a;->a()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const-string v3, "getCode(...)"

    .line 46
    .line 47
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-direct {v1, v2, v3, v0}, Lexpo/modules/kotlin/exception/CodedException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    :goto_0
    move-object v0, v1

    .line 62
    goto :goto_1

    .line 63
    :cond_3
    new-instance v1, Lexpo/modules/kotlin/exception/UnexpectedException;

    .line 64
    .line 65
    invoke-direct {v1, v0}, Lexpo/modules/kotlin/exception/UnexpectedException;-><init>(Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :goto_1
    invoke-static {}, LUb/f;->a()Lub/d;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    new-instance v2, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    .line 77
    .line 78
    const-string v3, "\u274c \'"

    .line 79
    .line 80
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v3, "\' wasn\'t able to destroy itself"

    .line 87
    .line 88
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v1, v2, v0}, Lub/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    iget-object v1, p0, Lexpo/modules/kotlin/views/t;->b:Lexpo/modules/kotlin/views/r;

    .line 99
    .line 100
    invoke-virtual {v1, p1, v0}, Lexpo/modules/kotlin/views/r;->l(Landroid/view/View;Lexpo/modules/kotlin/exception/CodedException;)V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public final h(Landroid/view/View;)V
    .locals 5

    .line 1
    const-string v0, "getCode(...)"

    .line 2
    .line 3
    const-string v1, "view"

    .line 4
    .line 5
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lexpo/modules/kotlin/views/t;->b:Lexpo/modules/kotlin/views/r;

    .line 9
    .line 10
    invoke-virtual {v1}, Lexpo/modules/kotlin/views/r;->f()Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-eqz v1, :cond_5

    .line 15
    .line 16
    :try_start_0
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    goto/16 :goto_3

    .line 22
    .line 23
    :catchall_0
    move-exception v1

    .line 24
    :try_start_1
    instance-of v2, v1, Lexpo/modules/kotlin/exception/CodedException;

    .line 25
    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    instance-of v2, v1, Lrb/a;

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    new-instance v2, Lexpo/modules/kotlin/exception/CodedException;

    .line 33
    .line 34
    move-object v3, v1

    .line 35
    check-cast v3, Lrb/a;

    .line 36
    .line 37
    invoke-virtual {v3}, Lrb/a;->a()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    move-object v4, v1

    .line 45
    check-cast v4, Lrb/a;

    .line 46
    .line 47
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v1, Lrb/a;

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-direct {v2, v3, v4, v1}, Lexpo/modules/kotlin/exception/CodedException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_1
    move-exception v1

    .line 62
    goto :goto_1

    .line 63
    :cond_0
    new-instance v2, Lexpo/modules/kotlin/exception/UnexpectedException;

    .line 64
    .line 65
    invoke-direct {v2, v1}, Lexpo/modules/kotlin/exception/UnexpectedException;-><init>(Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    move-object v2, v1

    .line 70
    check-cast v2, Lexpo/modules/kotlin/exception/CodedException;

    .line 71
    .line 72
    :goto_0
    new-instance v1, Lcc/t;

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-static {v3}, Lhe/a;->e(Ljava/lang/Class;)Lpe/d;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-direct {v1, v3, v2}, Lcc/t;-><init>(Lpe/d;Lexpo/modules/kotlin/exception/CodedException;)V

    .line 83
    .line 84
    .line 85
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 86
    :goto_1
    invoke-static {p1}, Lexpo/modules/kotlin/views/f;->a(Landroid/view/View;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-eqz v2, :cond_2

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_2
    instance-of v2, v1, Lexpo/modules/kotlin/exception/CodedException;

    .line 94
    .line 95
    if-eqz v2, :cond_3

    .line 96
    .line 97
    check-cast v1, Lexpo/modules/kotlin/exception/CodedException;

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_3
    instance-of v2, v1, Lrb/a;

    .line 101
    .line 102
    if-eqz v2, :cond_4

    .line 103
    .line 104
    new-instance v2, Lexpo/modules/kotlin/exception/CodedException;

    .line 105
    .line 106
    check-cast v1, Lrb/a;

    .line 107
    .line 108
    invoke-virtual {v1}, Lrb/a;->a()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-direct {v2, v3, v0, v1}, Lexpo/modules/kotlin/exception/CodedException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    move-object v1, v2

    .line 127
    goto :goto_2

    .line 128
    :cond_4
    new-instance v0, Lexpo/modules/kotlin/exception/UnexpectedException;

    .line 129
    .line 130
    invoke-direct {v0, v1}, Lexpo/modules/kotlin/exception/UnexpectedException;-><init>(Ljava/lang/Throwable;)V

    .line 131
    .line 132
    .line 133
    move-object v1, v0

    .line 134
    :goto_2
    invoke-static {}, LUb/f;->a()Lub/d;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    new-instance v3, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 149
    .line 150
    .line 151
    const-string v4, "\u274c Error occurred when invoking \'onViewDidUpdateProps\' on \'"

    .line 152
    .line 153
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    const-string v2, "\'"

    .line 160
    .line 161
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-virtual {v0, v2, v1}, Lub/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 169
    .line 170
    .line 171
    iget-object v0, p0, Lexpo/modules/kotlin/views/t;->b:Lexpo/modules/kotlin/views/r;

    .line 172
    .line 173
    invoke-virtual {v0, p1, v1}, Lexpo/modules/kotlin/views/r;->l(Landroid/view/View;Lexpo/modules/kotlin/exception/CodedException;)V

    .line 174
    .line 175
    .line 176
    :cond_5
    :goto_3
    return-void
.end method

.method public final i(LUb/r;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lexpo/modules/kotlin/views/t;->a:LUb/r;

    .line 7
    .line 8
    return-void
.end method

.method public final j(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)Ljava/util/List;
    .locals 9

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "propsMap"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lexpo/modules/kotlin/views/t;->e()Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {p2}, Lcom/facebook/react/bridge/ReadableMap;->keySetIterator()Lcom/facebook/react/bridge/ReadableMapKeySetIterator;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    :cond_0
    :goto_0
    invoke-interface {v2}, Lcom/facebook/react/bridge/ReadableMapKeySetIterator;->hasNextKey()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_4

    .line 29
    .line 30
    invoke-interface {v2}, Lcom/facebook/react/bridge/ReadableMapKeySetIterator;->nextKey()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    check-cast v4, Lexpo/modules/kotlin/views/a;

    .line 39
    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    :try_start_0
    invoke-interface {p2, v3}, Lcom/facebook/react/bridge/ReadableMap;->getDynamic(Ljava/lang/String;)Lcom/facebook/react/bridge/Dynamic;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    iget-object v6, p0, Lexpo/modules/kotlin/views/t;->a:LUb/r;

    .line 47
    .line 48
    invoke-virtual {v6}, LUb/r;->g()Lgc/c;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-virtual {v6}, Lgc/c;->i()LUb/d;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    invoke-virtual {v4, v5, p1, v6}, Lexpo/modules/kotlin/views/a;->c(Lcom/facebook/react/bridge/Dynamic;Landroid/view/View;LUb/d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    :goto_1
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception v4

    .line 64
    :try_start_1
    invoke-static {p1}, Lexpo/modules/kotlin/views/f;->a(Landroid/view/View;)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    instance-of v5, v4, Lexpo/modules/kotlin/exception/CodedException;

    .line 72
    .line 73
    if-eqz v5, :cond_2

    .line 74
    .line 75
    check-cast v4, Lexpo/modules/kotlin/exception/CodedException;

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :catchall_1
    move-exception p1

    .line 79
    goto :goto_4

    .line 80
    :cond_2
    instance-of v5, v4, Lrb/a;

    .line 81
    .line 82
    if-eqz v5, :cond_3

    .line 83
    .line 84
    new-instance v5, Lexpo/modules/kotlin/exception/CodedException;

    .line 85
    .line 86
    move-object v6, v4

    .line 87
    check-cast v6, Lrb/a;

    .line 88
    .line 89
    invoke-virtual {v6}, Lrb/a;->a()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    const-string v7, "getCode(...)"

    .line 94
    .line 95
    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    move-object v7, v4

    .line 99
    check-cast v7, Lrb/a;

    .line 100
    .line 101
    invoke-virtual {v7}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    check-cast v4, Lrb/a;

    .line 106
    .line 107
    invoke-virtual {v4}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    invoke-direct {v5, v6, v7, v4}, Lexpo/modules/kotlin/exception/CodedException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    :goto_2
    move-object v4, v5

    .line 115
    goto :goto_3

    .line 116
    :cond_3
    new-instance v5, Lexpo/modules/kotlin/exception/UnexpectedException;

    .line 117
    .line 118
    invoke-direct {v5, v4}, Lexpo/modules/kotlin/exception/UnexpectedException;-><init>(Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :goto_3
    invoke-static {}, LUb/f;->a()Lub/d;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    invoke-virtual {p0}, Lexpo/modules/kotlin/views/t;->d()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    new-instance v7, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 133
    .line 134
    .line 135
    const-string v8, "\u274c Cannot set the \'"

    .line 136
    .line 137
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v6, "\' prop on the \'"

    .line 144
    .line 145
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    const-string v6, "\'"

    .line 152
    .line 153
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    invoke-virtual {v5, v6, v4}, Lub/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 161
    .line 162
    .line 163
    iget-object v5, p0, Lexpo/modules/kotlin/views/t;->b:Lexpo/modules/kotlin/views/r;

    .line 164
    .line 165
    invoke-virtual {v5, p1, v4}, Lexpo/modules/kotlin/views/r;->l(Landroid/view/View;Lexpo/modules/kotlin/exception/CodedException;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 166
    .line 167
    .line 168
    goto :goto_1

    .line 169
    :goto_4
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    throw p1

    .line 173
    :cond_4
    return-object v1
.end method
