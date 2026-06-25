.class public final Lwe/e$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwe/e;
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
    invoke-direct {p0}, Lwe/e$a;-><init>()V

    return-void
.end method

.method private final b(Lwe/e;ILye/m0;)Lye/t0;
    .locals 13

    .line 1
    invoke-interface/range {p3 .. p3}, Lye/J;->getName()LXe/f;

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
    const-string v1, "T"

    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    const-string v0, "instance"

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-string v1, "E"

    .line 26
    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    const-string v0, "receiver"

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v1, "toLowerCase(...)"

    .line 43
    .line 44
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    new-instance v1, LBe/V;

    .line 48
    .line 49
    sget-object v2, Lze/h;->k0:Lze/h$a;

    .line 50
    .line 51
    invoke-virtual {v2}, Lze/h$a;->b()Lze/h;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-static {v0}, LXe/f;->m(Ljava/lang/String;)LXe/f;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    const-string v0, "identifier(...)"

    .line 60
    .line 61
    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-interface/range {p3 .. p3}, Lye/h;->p()Lqf/d0;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    const-string v0, "getDefaultType(...)"

    .line 69
    .line 70
    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    sget-object v12, Lye/h0;->a:Lye/h0;

    .line 74
    .line 75
    const-string v0, "NO_SOURCE"

    .line 76
    .line 77
    invoke-static {v12, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const/4 v3, 0x0

    .line 81
    const/4 v8, 0x0

    .line 82
    const/4 v9, 0x0

    .line 83
    const/4 v10, 0x0

    .line 84
    const/4 v11, 0x0

    .line 85
    move-object v2, p1

    .line 86
    move v4, p2

    .line 87
    invoke-direct/range {v1 .. v12}, LBe/V;-><init>(Lye/a;Lye/t0;ILze/h;LXe/f;Lqf/S;ZZZLqf/S;Lye/h0;)V

    .line 88
    .line 89
    .line 90
    return-object v1
.end method


# virtual methods
.method public final a(Lwe/b;Z)Lwe/e;
    .locals 10

    .line 1
    const-string v0, "functionClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lwe/b;->q()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lwe/e;

    .line 11
    .line 12
    sget-object v4, Lye/b$a;->a:Lye/b$a;

    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    move-object v2, p1

    .line 17
    move v5, p2

    .line 18
    invoke-direct/range {v1 .. v6}, Lwe/e;-><init>(Lye/m;Lwe/e;Lye/b$a;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, LBe/a;->J0()Lye/c0;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    new-instance p1, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    move-object v6, v2

    .line 53
    check-cast v6, Lye/m0;

    .line 54
    .line 55
    invoke-interface {v6}, Lye/m0;->m()Lqf/N0;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    sget-object v7, Lqf/N0;->f:Lqf/N0;

    .line 60
    .line 61
    if-ne v6, v7, :cond_0

    .line 62
    .line 63
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    invoke-static {p1}, LUd/u;->h1(Ljava/lang/Iterable;)Ljava/lang/Iterable;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    new-instance v6, Ljava/util/ArrayList;

    .line 72
    .line 73
    const/16 p2, 0xa

    .line 74
    .line 75
    invoke-static {p1, p2}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    invoke-direct {v6, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 80
    .line 81
    .line 82
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    if-eqz p2, :cond_1

    .line 91
    .line 92
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    check-cast p2, LUd/L;

    .line 97
    .line 98
    sget-object v2, Lwe/e;->E:Lwe/e$a;

    .line 99
    .line 100
    invoke-virtual {p2}, LUd/L;->c()I

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    invoke-virtual {p2}, LUd/L;->d()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    check-cast p2, Lye/m0;

    .line 109
    .line 110
    invoke-direct {v2, v1, v7, p2}, Lwe/e$a;->b(Lwe/e;ILye/m0;)Lye/t0;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    invoke-interface {v6, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_1
    invoke-static {v0}, LUd/u;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    check-cast p1, Lye/m0;

    .line 123
    .line 124
    invoke-interface {p1}, Lye/h;->p()Lqf/d0;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    sget-object v8, Lye/E;->e:Lye/E;

    .line 129
    .line 130
    sget-object v9, Lye/t;->e:Lye/u;

    .line 131
    .line 132
    const/4 v2, 0x0

    .line 133
    invoke-virtual/range {v1 .. v9}, LBe/O;->n1(Lye/c0;Lye/c0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lqf/S;Lye/E;Lye/u;)LBe/O;

    .line 134
    .line 135
    .line 136
    const/4 p1, 0x1

    .line 137
    invoke-virtual {v1, p1}, LBe/s;->Z0(Z)V

    .line 138
    .line 139
    .line 140
    return-object v1
.end method
