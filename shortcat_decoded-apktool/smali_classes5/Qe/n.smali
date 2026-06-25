.class public final LQe/n;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQe/n$a;
    }
.end annotation


# static fields
.field public static final b:LQe/n$a;

.field private static final c:Ljava/util/Set;

.field private static final d:Ljava/util/Set;

.field private static final e:LUe/c;

.field private static final f:LUe/c;

.field private static final g:LUe/c;


# instance fields
.field public a:Lmf/n;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LQe/n$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LQe/n$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LQe/n;->b:LQe/n$a;

    .line 8
    .line 9
    sget-object v0, LRe/a$a;->e:LRe/a$a;

    .line 10
    .line 11
    invoke-static {v0}, LUd/a0;->c(Ljava/lang/Object;)Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, LQe/n;->c:Ljava/util/Set;

    .line 16
    .line 17
    sget-object v0, LRe/a$a;->f:LRe/a$a;

    .line 18
    .line 19
    sget-object v1, LRe/a$a;->i:LRe/a$a;

    .line 20
    .line 21
    filled-new-array {v0, v1}, [LRe/a$a;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, LUd/a0;->h([Ljava/lang/Object;)Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, LQe/n;->d:Ljava/util/Set;

    .line 30
    .line 31
    new-instance v0, LUe/c;

    .line 32
    .line 33
    const/4 v1, 0x2

    .line 34
    const/4 v2, 0x1

    .line 35
    filled-new-array {v2, v2, v1}, [I

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-direct {v0, v1}, LUe/c;-><init>([I)V

    .line 40
    .line 41
    .line 42
    sput-object v0, LQe/n;->e:LUe/c;

    .line 43
    .line 44
    new-instance v0, LUe/c;

    .line 45
    .line 46
    const/16 v1, 0xb

    .line 47
    .line 48
    filled-new-array {v2, v2, v1}, [I

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-direct {v0, v1}, LUe/c;-><init>([I)V

    .line 53
    .line 54
    .line 55
    sput-object v0, LQe/n;->f:LUe/c;

    .line 56
    .line 57
    new-instance v0, LUe/c;

    .line 58
    .line 59
    const/16 v1, 0xd

    .line 60
    .line 61
    filled-new-array {v2, v2, v1}, [I

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-direct {v0, v1}, LUe/c;-><init>([I)V

    .line 66
    .line 67
    .line 68
    sput-object v0, LQe/n;->g:LUe/c;

    .line 69
    .line 70
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic a()LUe/c;
    .locals 1

    .line 1
    sget-object v0, LQe/n;->g:LUe/c;

    .line 2
    .line 3
    return-object v0
.end method

.method static synthetic b()Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-static {}, LQe/n;->d()Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static final d()Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final e(LQe/x;)Lof/r;
    .locals 1

    .line 1
    invoke-virtual {p0}, LQe/n;->f()Lmf/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lmf/n;->g()Lmf/o;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Lmf/o;->e()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    sget-object p1, Lof/r;->a:Lof/r;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    invoke-interface {p1}, LQe/x;->d()LRe/a;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, LRe/a;->j()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    sget-object p1, Lof/r;->b:Lof/r;

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_1
    sget-object p1, Lof/r;->a:Lof/r;

    .line 32
    .line 33
    return-object p1
.end method

.method private final g(LQe/x;)Lmf/y;
    .locals 8

    .line 1
    invoke-direct {p0}, LQe/n;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-interface {p1}, LQe/x;->d()LRe/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, LRe/a;->d()LUe/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-direct {p0}, LQe/n;->h()LUe/c;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, LUe/c;->h(LUe/c;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v1, Lmf/y;

    .line 27
    .line 28
    invoke-interface {p1}, LQe/x;->d()LRe/a;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, LRe/a;->d()LUe/c;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    sget-object v3, LUe/c;->i:LUe/c;

    .line 37
    .line 38
    invoke-direct {p0}, LQe/n;->h()LUe/c;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-direct {p0}, LQe/n;->h()LUe/c;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-interface {p1}, LQe/x;->d()LRe/a;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-virtual {v5}, LRe/a;->d()LUe/c;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual {v5}, LUe/c;->j()Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    invoke-virtual {v0, v5}, LUe/c;->k(Z)LUe/c;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-interface {p1}, LQe/x;->a()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    invoke-interface {p1}, LQe/x;->g()LXe/b;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    invoke-direct/range {v1 .. v7}, Lmf/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;LXe/b;)V

    .line 71
    .line 72
    .line 73
    return-object v1

    .line 74
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 75
    return-object p1
.end method

.method private final h()LUe/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, LQe/n;->f()Lmf/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lmf/n;->g()Lmf/o;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Lmf/o;->d()LUe/c;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method private final i()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LQe/n;->f()Lmf/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lmf/n;->g()Lmf/o;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Lmf/o;->f()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method private final j(LQe/x;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LQe/n;->f()Lmf/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lmf/n;->g()Lmf/o;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Lmf/o;->b()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p1}, LQe/x;->d()LRe/a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, LRe/a;->i()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-interface {p1}, LQe/x;->d()LRe/a;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, LRe/a;->d()LUe/c;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    sget-object v0, LQe/n;->f:LUe/c;

    .line 34
    .line 35
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    return p1

    .line 43
    :cond_0
    const/4 p1, 0x0

    .line 44
    return p1
.end method

.method private final k(LQe/x;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, LQe/n;->f()Lmf/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lmf/n;->g()Lmf/o;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Lmf/o;->g()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p1}, LQe/x;->d()LRe/a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, LRe/a;->i()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-interface {p1}, LQe/x;->d()LRe/a;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, LRe/a;->d()LUe/c;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sget-object v1, LQe/n;->e:LUe/c;

    .line 34
    .line 35
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    :cond_0
    invoke-direct {p0, p1}, LQe/n;->j(LQe/x;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    :cond_1
    const/4 p1, 0x1

    .line 48
    return p1

    .line 49
    :cond_2
    const/4 p1, 0x0

    .line 50
    return p1
.end method

.method private final m(LQe/x;Ljava/util/Set;)[Ljava/lang/String;
    .locals 2

    .line 1
    invoke-interface {p1}, LQe/x;->d()LRe/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, LRe/a;->a()[Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, LRe/a;->b()[Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, LRe/a;->c()LRe/a$a;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_1
    return-object v1
.end method


# virtual methods
.method public final c(Lye/N;LQe/x;)Ljf/k;
    .locals 11

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "kotlinClass"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, LQe/n;->d:Ljava/util/Set;

    .line 12
    .line 13
    invoke-direct {p0, p2, v0}, LQe/n;->m(LQe/x;Ljava/util/Set;)[Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    return-object v1

    .line 21
    :cond_0
    invoke-interface {p2}, LQe/x;->d()LRe/a;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, LRe/a;->g()[Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_1
    :try_start_0
    invoke-static {v0, v2}, LWe/h;->m([Ljava/lang/String;[Ljava/lang/String;)Lkotlin/Pair;

    .line 33
    .line 34
    .line 35
    move-result-object v0
    :try_end_0
    .catch LZe/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    goto :goto_1

    .line 37
    :catchall_0
    move-exception v0

    .line 38
    goto :goto_0

    .line 39
    :catch_0
    move-exception v0

    .line 40
    :try_start_1
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    new-instance v3, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    const-string v4, "Could not read data from "

    .line 48
    .line 49
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-interface {p2}, LQe/x;->a()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    :goto_0
    invoke-direct {p0}, LQe/n;->i()Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-nez v2, :cond_3

    .line 72
    .line 73
    invoke-interface {p2}, LQe/x;->d()LRe/a;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v2}, LRe/a;->d()LUe/c;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-direct {p0}, LQe/n;->h()LUe/c;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v2, v3}, LUe/c;->h(LUe/c;)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-nez v2, :cond_3

    .line 90
    .line 91
    move-object v0, v1

    .line 92
    :goto_1
    if-nez v0, :cond_2

    .line 93
    .line 94
    return-object v1

    .line 95
    :cond_2
    invoke-virtual {v0}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    move-object v5, v1

    .line 100
    check-cast v5, LWe/e;

    .line 101
    .line 102
    invoke-virtual {v0}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    move-object v4, v0

    .line 107
    check-cast v4, LSe/m;

    .line 108
    .line 109
    new-instance v2, LQe/r;

    .line 110
    .line 111
    invoke-direct {p0, p2}, LQe/n;->g(LQe/x;)Lmf/y;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    invoke-direct {p0, p2}, LQe/n;->k(LQe/x;)Z

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    invoke-direct {p0, p2}, LQe/n;->e(LQe/x;)Lof/r;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    move-object v3, p2

    .line 124
    invoke-direct/range {v2 .. v8}, LQe/r;-><init>(LQe/x;LSe/m;LUe/d;Lmf/y;ZLof/r;)V

    .line 125
    .line 126
    .line 127
    new-instance p2, Lof/M;

    .line 128
    .line 129
    invoke-interface {v3}, LQe/x;->d()LRe/a;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v0}, LRe/a;->d()LUe/c;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    invoke-virtual {p0}, LQe/n;->f()Lmf/n;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    new-instance v0, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 144
    .line 145
    .line 146
    const-string v1, "scope for "

    .line 147
    .line 148
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string v1, " in "

    .line 155
    .line 156
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v9

    .line 166
    sget-object v10, LQe/m;->a:LQe/m;

    .line 167
    .line 168
    move-object v3, p1

    .line 169
    move-object v7, v2

    .line 170
    move-object v2, p2

    .line 171
    invoke-direct/range {v2 .. v10}, Lof/M;-><init>(Lye/N;LSe/m;LUe/d;LUe/a;Lof/s;Lmf/n;Ljava/lang/String;Lie/a;)V

    .line 172
    .line 173
    .line 174
    return-object v2

    .line 175
    :cond_3
    throw v0
.end method

.method public final f()Lmf/n;
    .locals 1

    .line 1
    iget-object v0, p0, LQe/n;->a:Lmf/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "components"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final l(LQe/x;)Lmf/i;
    .locals 6

    .line 1
    const-string v0, "kotlinClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LQe/n;->c:Ljava/util/Set;

    .line 7
    .line 8
    invoke-direct {p0, p1, v0}, LQe/n;->m(LQe/x;Ljava/util/Set;)[Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_0
    invoke-interface {p1}, LQe/x;->d()LRe/a;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, LRe/a;->g()[Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    return-object v1

    .line 27
    :cond_1
    :try_start_0
    invoke-static {v0, v2}, LWe/h;->i([Ljava/lang/String;[Ljava/lang/String;)Lkotlin/Pair;

    .line 28
    .line 29
    .line 30
    move-result-object v0
    :try_end_0
    .catch LZe/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    goto :goto_1

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    goto :goto_0

    .line 34
    :catch_0
    move-exception v0

    .line 35
    :try_start_1
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 36
    .line 37
    new-instance v3, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v4, "Could not read data from "

    .line 43
    .line 44
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-interface {p1}, LQe/x;->a()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    :goto_0
    invoke-direct {p0}, LQe/n;->i()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-nez v2, :cond_3

    .line 67
    .line 68
    invoke-interface {p1}, LQe/x;->d()LRe/a;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v2}, LRe/a;->d()LUe/c;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-direct {p0}, LQe/n;->h()LUe/c;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {v2, v3}, LUe/c;->h(LUe/c;)Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-nez v2, :cond_3

    .line 85
    .line 86
    move-object v0, v1

    .line 87
    :goto_1
    if-nez v0, :cond_2

    .line 88
    .line 89
    return-object v1

    .line 90
    :cond_2
    invoke-virtual {v0}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    check-cast v1, LWe/e;

    .line 95
    .line 96
    invoke-virtual {v0}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, LSe/c;

    .line 101
    .line 102
    new-instance v2, LQe/z;

    .line 103
    .line 104
    invoke-direct {p0, p1}, LQe/n;->g(LQe/x;)Lmf/y;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-direct {p0, p1}, LQe/n;->k(LQe/x;)Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    invoke-direct {p0, p1}, LQe/n;->e(LQe/x;)Lof/r;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-direct {v2, p1, v3, v4, v5}, LQe/z;-><init>(LQe/x;Lmf/y;ZLof/r;)V

    .line 117
    .line 118
    .line 119
    new-instance v3, Lmf/i;

    .line 120
    .line 121
    invoke-interface {p1}, LQe/x;->d()LRe/a;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-virtual {p1}, LRe/a;->d()LUe/c;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-direct {v3, v1, v0, p1, v2}, Lmf/i;-><init>(LUe/d;LSe/c;LUe/a;Lye/h0;)V

    .line 130
    .line 131
    .line 132
    return-object v3

    .line 133
    :cond_3
    throw v0
.end method

.method public final n(LQe/x;)Lye/e;
    .locals 2

    .line 1
    const-string v0, "kotlinClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, LQe/n;->l(LQe/x;)Lmf/i;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-virtual {p0}, LQe/n;->f()Lmf/n;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Lmf/n;->f()Lmf/l;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-interface {p1}, LQe/x;->g()LXe/b;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {v1, p1, v0}, Lmf/l;->e(LXe/b;Lmf/i;)Lye/e;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1
.end method

.method public final o(LQe/k;)V
    .locals 1

    .line 1
    const-string v0, "components"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, LQe/k;->a()Lmf/n;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0, p1}, LQe/n;->p(Lmf/n;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final p(Lmf/n;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LQe/n;->a:Lmf/n;

    .line 7
    .line 8
    return-void
.end method
