.class public final Lsf/a;
.super LBe/k;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public constructor <init>(LXe/f;)V
    .locals 13

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lsf/l;->a:Lsf/l;

    .line 7
    .line 8
    invoke-virtual {v0}, Lsf/l;->i()Lye/H;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    sget-object v4, Lye/E;->d:Lye/E;

    .line 13
    .line 14
    sget-object v5, Lye/f;->b:Lye/f;

    .line 15
    .line 16
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    sget-object v7, Lye/h0;->a:Lye/h0;

    .line 21
    .line 22
    const/4 v8, 0x0

    .line 23
    sget-object v9, Lpf/f;->e:Lpf/n;

    .line 24
    .line 25
    move-object v1, p0

    .line 26
    move-object v3, p1

    .line 27
    invoke-direct/range {v1 .. v9}, LBe/k;-><init>(Lye/m;LXe/f;Lye/E;Lye/f;Ljava/util/Collection;Lye/h0;ZLpf/n;)V

    .line 28
    .line 29
    .line 30
    sget-object p1, Lze/h;->k0:Lze/h$a;

    .line 31
    .line 32
    invoke-virtual {p1}, Lze/h$a;->b()Lze/h;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const/4 v2, 0x1

    .line 37
    invoke-static {p0, p1, v2, v7}, LBe/i;->n1(Lye/e;Lze/h;ZLye/h0;)LBe/i;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    sget-object v3, Lye/t;->d:Lye/u;

    .line 46
    .line 47
    invoke-virtual {p1, v2, v3}, LBe/i;->q1(Ljava/util/List;Lye/u;)LBe/i;

    .line 48
    .line 49
    .line 50
    const-string v2, "apply(...)"

    .line 51
    .line 52
    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    sget-object v2, Lsf/h;->j:Lsf/h;

    .line 56
    .line 57
    invoke-virtual {p1}, LBe/m;->getName()LXe/f;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v3}, LXe/f;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    const-string v4, ""

    .line 66
    .line 67
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-static {v2, v3}, Lsf/l;->b(Lsf/h;[Ljava/lang/String;)Lsf/g;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    new-instance v4, Lsf/i;

    .line 76
    .line 77
    sget-object v7, Lsf/k;->R0:Lsf/k;

    .line 78
    .line 79
    const/4 v2, 0x0

    .line 80
    new-array v3, v2, [Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v0, v7, v3}, Lsf/l;->e(Lsf/k;[Ljava/lang/String;)Lsf/j;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    new-array v10, v2, [Ljava/lang/String;

    .line 87
    .line 88
    const/16 v11, 0x18

    .line 89
    .line 90
    const/4 v12, 0x0

    .line 91
    const/4 v8, 0x0

    .line 92
    const/4 v9, 0x0

    .line 93
    invoke-direct/range {v4 .. v12}, Lsf/i;-><init>(Lqf/v0;Ljf/k;Lsf/k;Ljava/util/List;Z[Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v4}, LBe/s;->g1(Lqf/S;)V

    .line 97
    .line 98
    .line 99
    invoke-static {p1}, LUd/a0;->c(Ljava/lang/Object;)Ljava/util/Set;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {p0, v6, v0, p1}, LBe/k;->K0(Ljf/k;Ljava/util/Set;Lye/d;)V

    .line 104
    .line 105
    .line 106
    return-void
.end method


# virtual methods
.method public H0(Lqf/G0;)Lye/e;
    .locals 1

    .line 1
    const-string v0, "substitutor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public T(Lqf/E0;Lrf/g;)Ljf/k;
    .locals 1

    .line 1
    const-string v0, "typeSubstitution"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "kotlinTypeRefiner"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object p2, Lsf/h;->j:Lsf/h;

    .line 12
    .line 13
    invoke-virtual {p0}, LBe/a;->getName()LXe/f;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, LXe/f;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    filled-new-array {v0, p1}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p2, p1}, Lsf/l;->b(Lsf/h;[Ljava/lang/String;)Lsf/g;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public bridge synthetic c(Lqf/G0;)Lye/n;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lsf/a;->H0(Lqf/G0;)Lye/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, LBe/a;->getName()LXe/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LXe/f;->b()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "asString(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
