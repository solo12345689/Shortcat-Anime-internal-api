.class public final Lbf/g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:Lbf/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lbf/g;

    .line 2
    .line 3
    invoke-direct {v0}, Lbf/g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lbf/g;->a:Lbf/g;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic a(Lye/m;Lye/m;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lbf/g;->p(Lye/m;Lye/m;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method static synthetic b(Lye/m;Lye/m;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lbf/g;->g(Lye/m;Lye/m;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method static synthetic c(ZLye/a;Lye/a;Lqf/v0;Lqf/v0;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lbf/g;->h(ZLye/a;Lye/a;Lqf/v0;Lqf/v0;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method static synthetic d(Lye/a;Lye/a;Lye/m;Lye/m;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lbf/g;->i(Lye/a;Lye/a;Lye/m;Lye/m;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic f(Lbf/g;Lye/a;Lye/a;ZZZLrf/g;ILjava/lang/Object;)Z
    .locals 7

    .line 1
    and-int/lit8 p8, p7, 0x8

    .line 2
    .line 3
    if-eqz p8, :cond_0

    .line 4
    .line 5
    const/4 p4, 0x1

    .line 6
    :cond_0
    move v4, p4

    .line 7
    and-int/lit8 p4, p7, 0x10

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    const/4 p5, 0x0

    .line 12
    :cond_1
    move-object v0, p0

    .line 13
    move-object v1, p1

    .line 14
    move-object v2, p2

    .line 15
    move v3, p3

    .line 16
    move v5, p5

    .line 17
    move-object v6, p6

    .line 18
    invoke-virtual/range {v0 .. v6}, Lbf/g;->e(Lye/a;Lye/a;ZZZLrf/g;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0
.end method

.method private static final g(Lye/m;Lye/m;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method private static final h(ZLye/a;Lye/a;Lqf/v0;Lqf/v0;)Z
    .locals 2

    .line 1
    const-string v0, "c1"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "c2"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p3, p4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    invoke-interface {p3}, Lqf/v0;->p()Lye/h;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    invoke-interface {p4}, Lqf/v0;->p()Lye/h;

    .line 24
    .line 25
    .line 26
    move-result-object p4

    .line 27
    instance-of v0, p3, Lye/m0;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    instance-of v0, p4, Lye/m0;

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    sget-object v0, Lbf/g;->a:Lbf/g;

    .line 37
    .line 38
    check-cast p3, Lye/m0;

    .line 39
    .line 40
    check-cast p4, Lye/m0;

    .line 41
    .line 42
    new-instance v1, Lbf/f;

    .line 43
    .line 44
    invoke-direct {v1, p1, p2}, Lbf/f;-><init>(Lye/a;Lye/a;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p3, p4, p0, v1}, Lbf/g;->n(Lye/m0;Lye/m0;ZLkotlin/jvm/functions/Function2;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    return p0

    .line 52
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 53
    return p0
.end method

.method private static final i(Lye/a;Lye/a;Lye/m;Lye/m;)Z
    .locals 0

    .line 1
    invoke-static {p2, p0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method private final j(Lye/e;Lye/e;)Z
    .locals 0

    .line 1
    invoke-interface {p1}, Lye/h;->l()Lqf/v0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p2}, Lye/h;->l()Lqf/v0;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public static synthetic l(Lbf/g;Lye/m;Lye/m;ZZILjava/lang/Object;)Z
    .locals 0

    .line 1
    and-int/lit8 p5, p5, 0x8

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p4, 0x1

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lbf/g;->k(Lye/m;Lye/m;ZZ)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public static synthetic o(Lbf/g;Lye/m0;Lye/m0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)Z
    .locals 0

    .line 1
    and-int/lit8 p5, p5, 0x8

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p4, Lbf/c;->a:Lbf/c;

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lbf/g;->n(Lye/m0;Lye/m0;ZLkotlin/jvm/functions/Function2;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static final p(Lye/m;Lye/m;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method private final q(Lye/m;Lye/m;Lkotlin/jvm/functions/Function2;Z)Z
    .locals 7

    .line 1
    invoke-interface {p1}, Lye/m;->b()Lye/m;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    invoke-interface {p2}, Lye/m;->b()Lye/m;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    instance-of p1, v1, Lye/b;

    .line 10
    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    instance-of p1, v2, Lye/b;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 v5, 0x8

    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    move-object v0, p0

    .line 23
    move v3, p4

    .line 24
    invoke-static/range {v0 .. v6}, Lbf/g;->l(Lbf/g;Lye/m;Lye/m;ZZILjava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    return p1

    .line 29
    :cond_1
    :goto_0
    invoke-interface {p3, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    return p1
.end method

.method private final r(Lye/a;)Lye/h0;
    .locals 3

    .line 1
    :goto_0
    instance-of v0, p1, Lye/b;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lye/b;

    .line 7
    .line 8
    invoke-interface {v0}, Lye/b;->h()Lye/b$a;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sget-object v2, Lye/b$a;->b:Lye/b$a;

    .line 13
    .line 14
    if-eq v1, v2, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    invoke-interface {v0}, Lye/b;->e()Ljava/util/Collection;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "getOverriddenDescriptors(...)"

    .line 22
    .line 23
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    check-cast p1, Ljava/lang/Iterable;

    .line 27
    .line 28
    invoke-static {p1}, LUd/u;->N0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Lye/b;

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 p1, 0x0

    .line 38
    return-object p1

    .line 39
    :cond_2
    :goto_1
    invoke-interface {p1}, Lye/p;->k()Lye/h0;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1
.end method


# virtual methods
.method public final e(Lye/a;Lye/a;ZZZLrf/g;)Z
    .locals 3

    .line 1
    const-string v0, "a"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "b"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "kotlinTypeRefiner"

    .line 12
    .line 13
    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x1

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    return v1

    .line 24
    :cond_0
    invoke-interface {p1}, Lye/J;->getName()LXe/f;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {p2}, Lye/J;->getName()LXe/f;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    const/4 v2, 0x0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    return v2

    .line 40
    :cond_1
    if-eqz p4, :cond_2

    .line 41
    .line 42
    instance-of p4, p1, Lye/D;

    .line 43
    .line 44
    if-eqz p4, :cond_2

    .line 45
    .line 46
    instance-of p4, p2, Lye/D;

    .line 47
    .line 48
    if-eqz p4, :cond_2

    .line 49
    .line 50
    move-object p4, p1

    .line 51
    check-cast p4, Lye/D;

    .line 52
    .line 53
    invoke-interface {p4}, Lye/D;->m0()Z

    .line 54
    .line 55
    .line 56
    move-result p4

    .line 57
    move-object v0, p2

    .line 58
    check-cast v0, Lye/D;

    .line 59
    .line 60
    invoke-interface {v0}, Lye/D;->m0()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eq p4, v0, :cond_2

    .line 65
    .line 66
    return v2

    .line 67
    :cond_2
    invoke-interface {p1}, Lye/n;->b()Lye/m;

    .line 68
    .line 69
    .line 70
    move-result-object p4

    .line 71
    invoke-interface {p2}, Lye/n;->b()Lye/m;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result p4

    .line 79
    if-eqz p4, :cond_4

    .line 80
    .line 81
    if-nez p3, :cond_3

    .line 82
    .line 83
    return v2

    .line 84
    :cond_3
    invoke-direct {p0, p1}, Lbf/g;->r(Lye/a;)Lye/h0;

    .line 85
    .line 86
    .line 87
    move-result-object p4

    .line 88
    invoke-direct {p0, p2}, Lbf/g;->r(Lye/a;)Lye/h0;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result p4

    .line 96
    if-nez p4, :cond_4

    .line 97
    .line 98
    return v2

    .line 99
    :cond_4
    invoke-static {p1}, Lbf/i;->E(Lye/m;)Z

    .line 100
    .line 101
    .line 102
    move-result p4

    .line 103
    if-nez p4, :cond_7

    .line 104
    .line 105
    invoke-static {p2}, Lbf/i;->E(Lye/m;)Z

    .line 106
    .line 107
    .line 108
    move-result p4

    .line 109
    if-eqz p4, :cond_5

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_5
    sget-object p4, Lbf/d;->a:Lbf/d;

    .line 113
    .line 114
    invoke-direct {p0, p1, p2, p4, p3}, Lbf/g;->q(Lye/m;Lye/m;Lkotlin/jvm/functions/Function2;Z)Z

    .line 115
    .line 116
    .line 117
    move-result p4

    .line 118
    if-nez p4, :cond_6

    .line 119
    .line 120
    return v2

    .line 121
    :cond_6
    new-instance p4, Lbf/e;

    .line 122
    .line 123
    invoke-direct {p4, p3, p1, p2}, Lbf/e;-><init>(ZLye/a;Lye/a;)V

    .line 124
    .line 125
    .line 126
    invoke-static {p6, p4}, Lbf/o;->i(Lrf/g;Lrf/e$a;)Lbf/o;

    .line 127
    .line 128
    .line 129
    move-result-object p3

    .line 130
    const-string p4, "create(...)"

    .line 131
    .line 132
    invoke-static {p3, p4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    xor-int/lit8 p4, p5, 0x1

    .line 136
    .line 137
    const/4 p6, 0x0

    .line 138
    invoke-virtual {p3, p1, p2, p6, p4}, Lbf/o;->E(Lye/a;Lye/a;Lye/e;Z)Lbf/o$i;

    .line 139
    .line 140
    .line 141
    move-result-object p4

    .line 142
    invoke-virtual {p4}, Lbf/o$i;->c()Lbf/o$i$a;

    .line 143
    .line 144
    .line 145
    move-result-object p4

    .line 146
    sget-object v0, Lbf/o$i$a;->a:Lbf/o$i$a;

    .line 147
    .line 148
    if-ne p4, v0, :cond_7

    .line 149
    .line 150
    xor-int/lit8 p4, p5, 0x1

    .line 151
    .line 152
    invoke-virtual {p3, p2, p1, p6, p4}, Lbf/o;->E(Lye/a;Lye/a;Lye/e;Z)Lbf/o$i;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-virtual {p1}, Lbf/o$i;->c()Lbf/o$i$a;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    if-ne p1, v0, :cond_7

    .line 161
    .line 162
    return v1

    .line 163
    :cond_7
    :goto_0
    return v2
.end method

.method public final k(Lye/m;Lye/m;ZZ)Z
    .locals 9

    .line 1
    instance-of v0, p1, Lye/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    instance-of v0, p2, Lye/e;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p1, Lye/e;

    .line 10
    .line 11
    check-cast p2, Lye/e;

    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Lbf/g;->j(Lye/e;Lye/e;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :cond_0
    instance-of v0, p1, Lye/m0;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    instance-of v0, p2, Lye/m0;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    move-object v2, p1

    .line 27
    check-cast v2, Lye/m0;

    .line 28
    .line 29
    move-object v3, p2

    .line 30
    check-cast v3, Lye/m0;

    .line 31
    .line 32
    const/16 v6, 0x8

    .line 33
    .line 34
    const/4 v7, 0x0

    .line 35
    const/4 v5, 0x0

    .line 36
    move-object v1, p0

    .line 37
    move v4, p3

    .line 38
    invoke-static/range {v1 .. v7}, Lbf/g;->o(Lbf/g;Lye/m0;Lye/m0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    return p1

    .line 43
    :cond_1
    move v3, p3

    .line 44
    instance-of p3, p1, Lye/a;

    .line 45
    .line 46
    if-eqz p3, :cond_2

    .line 47
    .line 48
    instance-of p3, p2, Lye/a;

    .line 49
    .line 50
    if-eqz p3, :cond_2

    .line 51
    .line 52
    move-object v1, p1

    .line 53
    check-cast v1, Lye/a;

    .line 54
    .line 55
    move-object v2, p2

    .line 56
    check-cast v2, Lye/a;

    .line 57
    .line 58
    sget-object v6, Lrf/g$a;->a:Lrf/g$a;

    .line 59
    .line 60
    const/16 v7, 0x10

    .line 61
    .line 62
    const/4 v8, 0x0

    .line 63
    const/4 v5, 0x0

    .line 64
    move-object v0, p0

    .line 65
    move v4, p4

    .line 66
    invoke-static/range {v0 .. v8}, Lbf/g;->f(Lbf/g;Lye/a;Lye/a;ZZZLrf/g;ILjava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    return p1

    .line 71
    :cond_2
    instance-of p3, p1, Lye/N;

    .line 72
    .line 73
    if-eqz p3, :cond_3

    .line 74
    .line 75
    instance-of p3, p2, Lye/N;

    .line 76
    .line 77
    if-eqz p3, :cond_3

    .line 78
    .line 79
    check-cast p1, Lye/N;

    .line 80
    .line 81
    invoke-interface {p1}, Lye/N;->f()LXe/c;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    check-cast p2, Lye/N;

    .line 86
    .line 87
    invoke-interface {p2}, Lye/N;->f()LXe/c;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    return p1

    .line 96
    :cond_3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    return p1
.end method

.method public final m(Lye/m0;Lye/m0;Z)Z
    .locals 8

    .line 1
    const-string v0, "a"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "b"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/16 v6, 0x8

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    move-object v1, p0

    .line 16
    move-object v2, p1

    .line 17
    move-object v3, p2

    .line 18
    move v4, p3

    .line 19
    invoke-static/range {v1 .. v7}, Lbf/g;->o(Lbf/g;Lye/m0;Lye/m0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1
.end method

.method public final n(Lye/m0;Lye/m0;ZLkotlin/jvm/functions/Function2;)Z
    .locals 3

    .line 1
    const-string v0, "a"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "b"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "equivalentCallables"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x1

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    return v1

    .line 24
    :cond_0
    invoke-interface {p1}, Lye/n;->b()Lye/m;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {p2}, Lye/n;->b()Lye/m;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    const/4 v2, 0x0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    return v2

    .line 40
    :cond_1
    invoke-direct {p0, p1, p2, p4, p3}, Lbf/g;->q(Lye/m;Lye/m;Lkotlin/jvm/functions/Function2;Z)Z

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    if-nez p3, :cond_2

    .line 45
    .line 46
    return v2

    .line 47
    :cond_2
    invoke-interface {p1}, Lye/m0;->getIndex()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-interface {p2}, Lye/m0;->getIndex()I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    if-ne p1, p2, :cond_3

    .line 56
    .line 57
    return v1

    .line 58
    :cond_3
    return v2
.end method
