.class public abstract Lcf/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final synthetic a(Lqf/B0;Lye/m0;)Lqf/B0;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcf/e;->c(Lqf/B0;Lye/m0;)Lqf/B0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic b(Lqf/B0;)Lqf/S;
    .locals 0

    .line 1
    invoke-static {p0}, Lcf/e;->d(Lqf/B0;)Lqf/S;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final c(Lqf/B0;Lye/m0;)Lqf/B0;
    .locals 3

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    invoke-interface {p0}, Lqf/B0;->b()Lqf/N0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lqf/N0;->e:Lqf/N0;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-interface {p1}, Lye/m0;->m()Lqf/N0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {p0}, Lqf/B0;->b()Lqf/N0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-ne p1, v0, :cond_2

    .line 21
    .line 22
    invoke-interface {p0}, Lqf/B0;->a()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    new-instance p1, Lqf/D0;

    .line 29
    .line 30
    new-instance v0, Lqf/Y;

    .line 31
    .line 32
    sget-object v1, Lpf/f;->e:Lpf/n;

    .line 33
    .line 34
    const-string v2, "NO_LOCKS"

    .line 35
    .line 36
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    new-instance v2, Lcf/d;

    .line 40
    .line 41
    invoke-direct {v2, p0}, Lcf/d;-><init>(Lqf/B0;)V

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, v1, v2}, Lqf/Y;-><init>(Lpf/n;Lie/a;)V

    .line 45
    .line 46
    .line 47
    invoke-direct {p1, v0}, Lqf/D0;-><init>(Lqf/S;)V

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :cond_1
    new-instance p1, Lqf/D0;

    .line 52
    .line 53
    invoke-interface {p0}, Lqf/B0;->getType()Lqf/S;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-direct {p1, p0}, Lqf/D0;-><init>(Lqf/S;)V

    .line 58
    .line 59
    .line 60
    return-object p1

    .line 61
    :cond_2
    new-instance p1, Lqf/D0;

    .line 62
    .line 63
    invoke-static {p0}, Lcf/e;->e(Lqf/B0;)Lqf/S;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-direct {p1, p0}, Lqf/D0;-><init>(Lqf/S;)V

    .line 68
    .line 69
    .line 70
    return-object p1

    .line 71
    :cond_3
    :goto_0
    return-object p0
.end method

.method private static final d(Lqf/B0;)Lqf/S;
    .locals 1

    .line 1
    invoke-interface {p0}, Lqf/B0;->getType()Lqf/S;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "getType(...)"

    .line 6
    .line 7
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public static final e(Lqf/B0;)Lqf/S;
    .locals 8

    .line 1
    const-string v0, "typeProjection"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcf/a;

    .line 7
    .line 8
    const/16 v6, 0xe

    .line 9
    .line 10
    const/4 v7, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    move-object v2, p0

    .line 15
    invoke-direct/range {v1 .. v7}, Lcf/a;-><init>(Lqf/B0;Lcf/b;ZLqf/r0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 16
    .line 17
    .line 18
    return-object v1
.end method

.method public static final f(Lqf/S;)Z
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lqf/S;->N0()Lqf/v0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    instance-of p0, p0, Lcf/b;

    .line 11
    .line 12
    return p0
.end method

.method public static final g(Lqf/E0;Z)Lqf/E0;
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, Lqf/M;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    check-cast p0, Lqf/M;

    .line 11
    .line 12
    invoke-virtual {p0}, Lqf/M;->j()[Lye/m0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0}, Lqf/M;->i()[Lqf/B0;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p0}, Lqf/M;->j()[Lye/m0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {v1, p0}, LUd/n;->n1([Ljava/lang/Object;[Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    new-instance v1, Ljava/util/ArrayList;

    .line 29
    .line 30
    const/16 v2, 0xa

    .line 31
    .line 32
    invoke-static {p0, v2}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_0

    .line 48
    .line 49
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Lkotlin/Pair;

    .line 54
    .line 55
    invoke-virtual {v2}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, Lqf/B0;

    .line 60
    .line 61
    invoke-virtual {v2}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, Lye/m0;

    .line 66
    .line 67
    invoke-static {v3, v2}, Lcf/e;->c(Lqf/B0;Lye/m0;)Lqf/B0;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    const/4 p0, 0x0

    .line 76
    new-array p0, p0, [Lqf/B0;

    .line 77
    .line 78
    invoke-interface {v1, p0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, [Lqf/B0;

    .line 83
    .line 84
    new-instance v1, Lqf/M;

    .line 85
    .line 86
    invoke-direct {v1, v0, p0, p1}, Lqf/M;-><init>([Lye/m0;[Lqf/B0;Z)V

    .line 87
    .line 88
    .line 89
    return-object v1

    .line 90
    :cond_1
    new-instance v0, Lcf/e$a;

    .line 91
    .line 92
    invoke-direct {v0, p0, p1}, Lcf/e$a;-><init>(Lqf/E0;Z)V

    .line 93
    .line 94
    .line 95
    return-object v0
.end method

.method public static synthetic h(Lqf/E0;ZILjava/lang/Object;)Lqf/E0;
    .locals 0

    .line 1
    const/4 p3, 0x1

    .line 2
    and-int/2addr p2, p3

    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    move p1, p3

    .line 6
    :cond_0
    invoke-static {p0, p1}, Lcf/e;->g(Lqf/E0;Z)Lqf/E0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
