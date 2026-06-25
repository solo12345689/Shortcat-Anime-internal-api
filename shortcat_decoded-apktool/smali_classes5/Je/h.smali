.class public abstract LJe/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Ljava/util/Collection;Ljava/util/Collection;Lye/a;)Ljava/util/List;
    .locals 14

    .line 1
    const-string v1, "newValueParameterTypes"

    .line 2
    .line 3
    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "oldValueParameters"

    .line 7
    .line 8
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v1, "newOwner"

    .line 12
    .line 13
    move-object/from16 v3, p2

    .line 14
    .line 15
    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 22
    .line 23
    .line 24
    check-cast p0, Ljava/lang/Iterable;

    .line 25
    .line 26
    move-object v0, p1

    .line 27
    check-cast v0, Ljava/lang/Iterable;

    .line 28
    .line 29
    invoke-static {p0, v0}, LUd/u;->j1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    new-instance v0, Ljava/util/ArrayList;

    .line 34
    .line 35
    const/16 v1, 0xa

    .line 36
    .line 37
    invoke-static {p0, v1}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Lkotlin/Pair;

    .line 59
    .line 60
    invoke-virtual {v1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    move-object v8, v2

    .line 65
    check-cast v8, Lqf/S;

    .line 66
    .line 67
    invoke-virtual {v1}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Lye/t0;

    .line 72
    .line 73
    new-instance v2, LBe/V;

    .line 74
    .line 75
    invoke-interface {v1}, Lye/t0;->getIndex()I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    invoke-interface {v1}, Lze/a;->getAnnotations()Lze/h;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    invoke-interface {v1}, Lye/J;->getName()LXe/f;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    const-string v4, "getName(...)"

    .line 88
    .line 89
    invoke-static {v7, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-interface {v1}, Lye/t0;->B0()Z

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    invoke-interface {v1}, Lye/t0;->s0()Z

    .line 97
    .line 98
    .line 99
    move-result v10

    .line 100
    invoke-interface {v1}, Lye/t0;->r0()Z

    .line 101
    .line 102
    .line 103
    move-result v11

    .line 104
    invoke-interface {v1}, Lye/t0;->v0()Lqf/S;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    if-eqz v4, :cond_0

    .line 109
    .line 110
    invoke-static {v3}, Lff/e;->s(Lye/m;)Lye/H;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-interface {v4}, Lye/H;->n()Lve/i;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    invoke-virtual {v4, v8}, Lve/i;->k(Lqf/S;)Lqf/S;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    :goto_1
    move-object v12, v4

    .line 123
    goto :goto_2

    .line 124
    :cond_0
    const/4 v4, 0x0

    .line 125
    goto :goto_1

    .line 126
    :goto_2
    invoke-interface {v1}, Lye/p;->k()Lye/h0;

    .line 127
    .line 128
    .line 129
    move-result-object v13

    .line 130
    const-string v1, "getSource(...)"

    .line 131
    .line 132
    invoke-static {v13, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    const/4 v4, 0x0

    .line 136
    invoke-direct/range {v2 .. v13}, LBe/V;-><init>(Lye/a;Lye/t0;ILze/h;LXe/f;Lqf/S;ZZZLqf/S;Lye/h0;)V

    .line 137
    .line 138
    .line 139
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-object/from16 v3, p2

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_1
    return-object v0
.end method

.method public static final b(Lye/e;)LLe/a0;
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lff/e;->x(Lye/e;)Lye/e;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v0, 0x0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-interface {p0}, Lye/e;->o0()Ljf/k;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    instance-of v2, v1, LLe/a0;

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    move-object v0, v1

    .line 23
    check-cast v0, LLe/a0;

    .line 24
    .line 25
    :cond_1
    if-nez v0, :cond_2

    .line 26
    .line 27
    invoke-static {p0}, LJe/h;->b(Lye/e;)LLe/a0;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_2
    return-object v0
.end method
