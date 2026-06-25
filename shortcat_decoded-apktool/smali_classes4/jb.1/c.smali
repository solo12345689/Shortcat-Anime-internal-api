.class public Ljb/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lsb/d;
.implements LRb/a;
.implements Lsb/f;


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Lsb/a;

.field private c:Z

.field private d:LRb/c;

.field private e:[Ljava/lang/String;

.field private final f:Ljava/util/Queue;

.field private g:LRb/c;

.field private h:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ljb/c;->a:Landroid/content/Context;

    .line 10
    .line 11
    new-instance p1, Ljava/util/LinkedList;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Ljb/c;->f:Ljava/util/Queue;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic e(Ljb/c;LRb/c;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ljb/c;->j(Ljb/c;LRb/c;Ljava/util/Map;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Ljb/c;I[Ljava/lang/String;[I)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Ljb/c;->n(Ljb/c;I[Ljava/lang/String;[I)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final h([Ljava/lang/String;)V
    .locals 5

    .line 1
    iget-object v0, p0, Ljb/c;->h:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "mAskedPermissionsCache"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    array-length v1, p1

    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_0
    if-ge v2, v1, :cond_1

    .line 18
    .line 19
    aget-object v3, p1, v2

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 23
    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method private static final j(Ljb/c;LRb/c;Ljava/util/Map;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljb/c;->t()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, -0x1

    .line 10
    :goto_0
    invoke-static {p2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    const-string v1, "android.permission.WRITE_SETTINGS"

    .line 14
    .line 15
    invoke-direct {p0, v1, v0}, Ljb/c;->s(Ljava/lang/String;I)LRb/b;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {p2, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    invoke-interface {p1, p2}, LRb/c;->a(Ljava/util/Map;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method private final k()V
    .locals 4

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "android.settings.action.MANAGE_WRITE_SETTINGS"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ljb/c;->a:Landroid/content/Context;

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v2, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v3, "package:"

    .line 20
    .line 21
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 36
    .line 37
    .line 38
    const/high16 v1, 0x10000000

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 41
    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    iput-boolean v1, p0, Ljb/c;->c:Z

    .line 45
    .line 46
    iget-object v1, p0, Ljb/c;->a:Landroid/content/Context;

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method private final l(Ljava/lang/String;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Ljb/c;->b:Lsb/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Lsb/a;->a()Landroid/app/Activity;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v0, p1}, Landroidx/core/app/b;->u(Landroid/app/Activity;Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/4 v0, 0x1

    .line 17
    if-ne p1, v0, :cond_0

    .line 18
    .line 19
    return v0

    .line 20
    :cond_0
    return v1
.end method

.method private final m()Lq7/g;
    .locals 1

    .line 1
    new-instance v0, Ljb/a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljb/a;-><init>(Ljb/c;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final n(Ljb/c;I[Ljava/lang/String;[I)Z
    .locals 5

    .line 1
    const-string v0, "receivePermissions"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "grantResults"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    const/16 v1, 0xd

    .line 13
    .line 14
    if-ne p1, v1, :cond_8

    .line 15
    .line 16
    monitor-enter p0

    .line 17
    :try_start_0
    iget-object p1, p0, Ljb/c;->g:LRb/c;

    .line 18
    .line 19
    if-eqz p1, :cond_7

    .line 20
    .line 21
    invoke-direct {p0, p2, p3}, Ljb/c;->v([Ljava/lang/String;[I)Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-interface {p1, p2}, LRb/c;->a(Ljava/util/Map;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    iput-object p1, p0, Ljb/c;->g:LRb/c;

    .line 30
    .line 31
    iget-object p2, p0, Ljb/c;->f:Ljava/util/Queue;

    .line 32
    .line 33
    invoke-interface {p2}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    check-cast p2, Lkotlin/Pair;

    .line 38
    .line 39
    if-eqz p2, :cond_6

    .line 40
    .line 41
    iget-object p3, p0, Ljb/c;->b:Lsb/a;

    .line 42
    .line 43
    if-eqz p3, :cond_0

    .line 44
    .line 45
    invoke-interface {p3}, Lsb/a;->a()Landroid/app/Activity;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto/16 :goto_5

    .line 52
    .line 53
    :cond_0
    move-object p3, p1

    .line 54
    :goto_0
    instance-of v2, p3, Lq7/f;

    .line 55
    .line 56
    if-eqz v2, :cond_1

    .line 57
    .line 58
    move-object p1, p3

    .line 59
    check-cast p1, Lq7/f;

    .line 60
    .line 61
    :cond_1
    if-nez p1, :cond_5

    .line 62
    .line 63
    invoke-virtual {p2}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, LRb/c;

    .line 68
    .line 69
    invoke-virtual {p2}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    check-cast p3, [Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {p2}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    check-cast p2, [Ljava/lang/Object;

    .line 80
    .line 81
    array-length p2, p2

    .line 82
    new-array v1, p2, [I

    .line 83
    .line 84
    move v2, v0

    .line 85
    :goto_1
    const/4 v3, -0x1

    .line 86
    if-ge v2, p2, :cond_2

    .line 87
    .line 88
    aput v3, v1, v2

    .line 89
    .line 90
    add-int/lit8 v2, v2, 0x1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_2
    invoke-direct {p0, p3, v1}, Ljb/c;->v([Ljava/lang/String;[I)Ljava/util/Map;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-interface {p1, p2}, LRb/c;->a(Ljava/util/Map;)V

    .line 98
    .line 99
    .line 100
    iget-object p1, p0, Ljb/c;->f:Ljava/util/Queue;

    .line 101
    .line 102
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    if-eqz p2, :cond_4

    .line 111
    .line 112
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    check-cast p2, Lkotlin/Pair;

    .line 117
    .line 118
    invoke-virtual {p2}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p3

    .line 122
    check-cast p3, LRb/c;

    .line 123
    .line 124
    invoke-virtual {p2}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    check-cast v1, [Ljava/lang/String;

    .line 129
    .line 130
    invoke-virtual {p2}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    check-cast p2, [Ljava/lang/Object;

    .line 135
    .line 136
    array-length p2, p2

    .line 137
    new-array v2, p2, [I

    .line 138
    .line 139
    move v4, v0

    .line 140
    :goto_3
    if-ge v4, p2, :cond_3

    .line 141
    .line 142
    aput v3, v2, v4

    .line 143
    .line 144
    add-int/lit8 v4, v4, 0x1

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_3
    invoke-direct {p0, v1, v2}, Ljb/c;->v([Ljava/lang/String;[I)Ljava/util/Map;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    invoke-interface {p3, p2}, LRb/c;->a(Ljava/util/Map;)V

    .line 152
    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_4
    iget-object p1, p0, Ljb/c;->f:Ljava/util/Queue;

    .line 156
    .line 157
    invoke-interface {p1}, Ljava/util/Collection;->clear()V

    .line 158
    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_5
    invoke-virtual {p2}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p3

    .line 165
    check-cast p3, LRb/c;

    .line 166
    .line 167
    iput-object p3, p0, Ljb/c;->g:LRb/c;

    .line 168
    .line 169
    invoke-virtual {p2}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    check-cast p2, [Ljava/lang/String;

    .line 174
    .line 175
    invoke-direct {p0}, Ljb/c;->m()Lq7/g;

    .line 176
    .line 177
    .line 178
    move-result-object p3

    .line 179
    invoke-interface {p1, p2, v1, p3}, Lq7/f;->c([Ljava/lang/String;ILq7/g;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 180
    .line 181
    .line 182
    monitor-exit p0

    .line 183
    return v0

    .line 184
    :cond_6
    :goto_4
    monitor-exit p0

    .line 185
    const/4 p0, 0x1

    .line 186
    return p0

    .line 187
    :cond_7
    :try_start_1
    const-string p1, "Required value was null."

    .line 188
    .line 189
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 190
    .line 191
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 195
    :goto_5
    monitor-exit p0

    .line 196
    throw p1

    .line 197
    :cond_8
    return v0
.end method

.method private final p(Ljava/lang/String;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Ljb/c;->h:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "mAskedPermissionsCache"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
.end method

.method private final q(Ljava/lang/String;)I
    .locals 2

    .line 1
    iget-object v0, p0, Ljb/c;->b:Lsb/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lsb/a;->a()Landroid/app/Activity;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    instance-of v1, v0, Lq7/f;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-static {v0, p1}, Ly1/b;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_0
    invoke-virtual {p0, p1}, Ljb/c;->r(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1
.end method

.method private final s(Ljava/lang/String;I)LRb/b;
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    sget-object p2, LRb/d;->b:LRb/d;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-direct {p0, p1}, Ljb/c;->p(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    sget-object p2, LRb/d;->d:LRb/d;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    sget-object p2, LRb/d;->c:LRb/d;

    .line 16
    .line 17
    :goto_0
    new-instance v0, LRb/b;

    .line 18
    .line 19
    sget-object v1, LRb/d;->d:LRb/d;

    .line 20
    .line 21
    if-ne p2, v1, :cond_2

    .line 22
    .line 23
    invoke-direct {p0, p1}, Ljb/c;->l(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    goto :goto_1

    .line 28
    :cond_2
    const/4 p1, 0x1

    .line 29
    :goto_1
    invoke-direct {v0, p2, p1}, LRb/b;-><init>(LRb/d;Z)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method

.method private final t()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ljb/c;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Landroid/provider/Settings$System;->canWrite(Landroid/content/Context;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method private final u(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "android.permission.WRITE_SETTINGS"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Ljb/c;->t()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1

    .line 14
    :cond_0
    invoke-direct {p0, p1}, Ljb/c;->q(Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    return p1

    .line 22
    :cond_1
    const/4 p1, 0x0

    .line 23
    return p1
.end method

.method private final v([Ljava/lang/String;[I)Ljava/util/Map;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p2, p1}, LUd/n;->l1([I[Ljava/lang/Object;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    check-cast p2, Lkotlin/Pair;

    .line 25
    .line 26
    invoke-virtual {p2}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Ljava/lang/Number;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-virtual {p2}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    check-cast p2, Ljava/lang/String;

    .line 41
    .line 42
    invoke-direct {p0, p2, v1}, Ljb/c;->s(Ljava/lang/String;I)LRb/b;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-interface {v0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    return-object v0
.end method


# virtual methods
.method public varargs a(LRb/c;[Ljava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, "responseListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "permissions"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    array-length v1, p2

    .line 14
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    array-length v1, p2

    .line 18
    const/4 v2, 0x0

    .line 19
    move v3, v2

    .line 20
    :goto_0
    if-ge v3, v1, :cond_1

    .line 21
    .line 22
    aget-object v4, p2, v3

    .line 23
    .line 24
    invoke-direct {p0, v4}, Ljb/c;->u(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    move v4, v2

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    const/4 v4, -0x1

    .line 33
    :goto_1
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-static {v0}, LUd/u;->a1(Ljava/util/Collection;)[I

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-direct {p0, p2, v0}, Ljb/c;->v([Ljava/lang/String;[I)Ljava/util/Map;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-interface {p1, p2}, LRb/c;->a(Ljava/util/Map;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public varargs b(LRb/c;[Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "responseListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "permissions"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    array-length v0, p2

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface {p1, p2}, LRb/c;->a(Ljava/util/Map;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-string v0, "android.permission.WRITE_SETTINGS"

    .line 24
    .line 25
    invoke-static {p2, v0}, LUd/n;->R([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_4

    .line 30
    .line 31
    invoke-static {p2}, LUd/n;->e1([Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-interface {p2, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    new-array v1, v1, [Ljava/lang/String;

    .line 40
    .line 41
    invoke-interface {p2, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    check-cast p2, [Ljava/lang/String;

    .line 46
    .line 47
    new-instance v1, Ljb/b;

    .line 48
    .line 49
    invoke-direct {v1, p0, p1}, Ljb/b;-><init>(Ljb/c;LRb/c;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {p0}, Ljb/c;->t()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-nez p1, :cond_2

    .line 57
    .line 58
    iget-object p1, p0, Ljb/c;->d:LRb/c;

    .line 59
    .line 60
    if-nez p1, :cond_1

    .line 61
    .line 62
    iput-object v1, p0, Ljb/c;->d:LRb/c;

    .line 63
    .line 64
    iput-object p2, p0, Ljb/c;->e:[Ljava/lang/String;

    .line 65
    .line 66
    filled-new-array {v0}, [Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-direct {p0, p1}, Ljb/c;->h([Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p0}, Ljb/c;->k()V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 78
    .line 79
    const-string p2, "Another permissions request is in progress. Await the old request and then try again."

    .line 80
    .line 81
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p1

    .line 85
    :cond_2
    array-length p1, p2

    .line 86
    if-nez p1, :cond_3

    .line 87
    .line 88
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 89
    .line 90
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-interface {v1, p1}, LRb/c;->a(Ljava/util/Map;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_3
    invoke-virtual {p0, p2, v1}, Ljb/c;->i([Ljava/lang/String;LRb/c;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_4
    invoke-virtual {p0, p2, p1}, Ljb/c;->i([Ljava/lang/String;LRb/c;)V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public c()Ljava/util/List;
    .locals 1

    .line 1
    const-class v0, LRb/a;

    .line 2
    .line 3
    invoke-static {v0}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public f(Lpb/b;)V
    .locals 2

    .line 1
    const-string v0, "moduleRegistry"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-class v0, Lsb/a;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lpb/b;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lsb/a;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iput-object v0, p0, Ljb/c;->b:Lsb/a;

    .line 17
    .line 18
    const-class v0, Ltb/b;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lpb/b;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Ltb/b;

    .line 25
    .line 26
    invoke-interface {p1, p0}, Ltb/b;->b(Lsb/f;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Ljb/c;->a:Landroid/content/Context;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string v0, "expo.modules.permissions.asked"

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, Ljb/c;->h:Landroid/content/SharedPreferences;

    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v0, "Couldn\'t find implementation for ActivityProvider."

    .line 48
    .line 49
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1
.end method

.method protected i([Ljava/lang/String;LRb/c;)V
    .locals 1

    .line 1
    const-string v0, "permissions"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "listener"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    array-length v0, p1

    .line 12
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, [Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p0, p1, p2}, Ljb/c;->o([Ljava/lang/String;LRb/c;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method protected final o([Ljava/lang/String;LRb/c;)V
    .locals 4

    .line 1
    const-string v0, "permissions"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "listener"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, Ljb/c;->h([Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Ljb/c;->b:Lsb/a;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Lsb/a;->a()Landroid/app/Activity;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    :goto_0
    instance-of v1, v0, Lq7/f;

    .line 25
    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    monitor-enter p0

    .line 29
    :try_start_0
    iget-object v1, p0, Ljb/c;->g:LRb/c;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    iget-object v0, p0, Ljb/c;->f:Ljava/util/Queue;

    .line 34
    .line 35
    invoke-static {p1, p2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_2

    .line 45
    :cond_1
    iput-object p2, p0, Ljb/c;->g:LRb/c;

    .line 46
    .line 47
    check-cast v0, Lq7/f;

    .line 48
    .line 49
    invoke-direct {p0}, Ljb/c;->m()Lq7/g;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    const/16 v1, 0xd

    .line 54
    .line 55
    invoke-interface {v0, p1, v1, p2}, Lq7/f;->c([Ljava/lang/String;ILq7/g;)V

    .line 56
    .line 57
    .line 58
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    :goto_1
    monitor-exit p0

    .line 61
    return-void

    .line 62
    :goto_2
    monitor-exit p0

    .line 63
    throw p1

    .line 64
    :cond_2
    array-length v0, p1

    .line 65
    new-array v1, v0, [I

    .line 66
    .line 67
    const/4 v2, 0x0

    .line 68
    :goto_3
    if-ge v2, v0, :cond_3

    .line 69
    .line 70
    const/4 v3, -0x1

    .line 71
    aput v3, v1, v2

    .line 72
    .line 73
    add-int/lit8 v2, v2, 0x1

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_3
    invoke-direct {p0, p1, v1}, Ljb/c;->v([Ljava/lang/String;[I)Ljava/util/Map;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-interface {p2, p1}, LRb/c;->a(Ljava/util/Map;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public onHostDestroy()V
    .locals 0

    .line 1
    return-void
.end method

.method public onHostPause()V
    .locals 0

    .line 1
    return-void
.end method

.method public onHostResume()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Ljb/c;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Ljb/c;->c:Z

    .line 8
    .line 9
    iget-object v1, p0, Ljb/c;->d:LRb/c;

    .line 10
    .line 11
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Ljb/c;->e:[Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    iput-object v3, p0, Ljb/c;->d:LRb/c;

    .line 21
    .line 22
    iput-object v3, p0, Ljb/c;->e:[Ljava/lang/String;

    .line 23
    .line 24
    array-length v3, v2

    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    :cond_1
    if-nez v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {p0, v2, v1}, Ljb/c;->i([Ljava/lang/String;LRb/c;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_2
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-interface {v1, v0}, LRb/c;->a(Ljava/util/Map;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method protected r(Ljava/lang/String;)I
    .locals 1

    .line 1
    const-string v0, "permission"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ljb/c;->a:Landroid/content/Context;

    .line 7
    .line 8
    invoke-static {v0, p1}, Ly1/b;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method
