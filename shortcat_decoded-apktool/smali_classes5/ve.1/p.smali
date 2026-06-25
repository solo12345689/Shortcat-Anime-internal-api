.class public abstract Lve/p;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:LBe/G;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, LBe/G;

    .line 2
    .line 3
    new-instance v1, LBe/p;

    .line 4
    .line 5
    sget-object v2, Lsf/l;->a:Lsf/l;

    .line 6
    .line 7
    invoke-virtual {v2}, Lsf/l;->i()Lye/H;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    sget-object v3, Lve/o;->s:LXe/c;

    .line 12
    .line 13
    invoke-direct {v1, v2, v3}, LBe/p;-><init>(Lye/H;LXe/c;)V

    .line 14
    .line 15
    .line 16
    sget-object v2, Lye/f;->c:Lye/f;

    .line 17
    .line 18
    sget-object v3, Lve/o;->v:LXe/c;

    .line 19
    .line 20
    invoke-virtual {v3}, LXe/c;->f()LXe/f;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    sget-object v6, Lye/h0;->a:Lye/h0;

    .line 25
    .line 26
    sget-object v7, Lpf/f;->e:Lpf/n;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    invoke-direct/range {v0 .. v7}, LBe/G;-><init>(Lye/m;Lye/f;ZZLXe/f;Lye/h0;Lpf/n;)V

    .line 31
    .line 32
    .line 33
    move-object v6, v7

    .line 34
    sget-object v1, Lye/E;->e:Lye/E;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, LBe/G;->M0(Lye/E;)V

    .line 37
    .line 38
    .line 39
    sget-object v1, Lye/t;->e:Lye/u;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, LBe/G;->O0(Lye/u;)V

    .line 42
    .line 43
    .line 44
    sget-object v1, Lze/h;->k0:Lze/h$a;

    .line 45
    .line 46
    invoke-virtual {v1}, Lze/h$a;->b()Lze/h;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    sget-object v3, Lqf/N0;->f:Lqf/N0;

    .line 51
    .line 52
    const-string v2, "T"

    .line 53
    .line 54
    invoke-static {v2}, LXe/f;->m(Ljava/lang/String;)LXe/f;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    const/4 v5, 0x0

    .line 59
    const/4 v2, 0x0

    .line 60
    invoke-static/range {v0 .. v6}, LBe/U;->R0(Lye/m;Lze/h;ZLqf/N0;LXe/f;ILpf/n;)Lye/m0;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-static {v1}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v0, v1}, LBe/G;->N0(Ljava/util/List;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, LBe/G;->K0()V

    .line 72
    .line 73
    .line 74
    sput-object v0, Lve/p;->a:LBe/G;

    .line 75
    .line 76
    return-void
.end method

.method public static final a(Lqf/S;)Lqf/d0;
    .locals 13

    .line 1
    const-string v0, "suspendFunType"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lve/h;->r(Lqf/S;)Z

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Lvf/d;->n(Lqf/S;)Lve/i;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, Lqf/S;->getAnnotations()Lze/h;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {p0}, Lve/h;->k(Lqf/S;)Lqf/S;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-static {p0}, Lve/h;->e(Lqf/S;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-static {p0}, Lve/h;->m(Lqf/S;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    new-instance v5, Ljava/util/ArrayList;

    .line 30
    .line 31
    const/16 v6, 0xa

    .line 32
    .line 33
    invoke-static {v0, v6}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_0

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    check-cast v6, Lqf/B0;

    .line 55
    .line 56
    invoke-interface {v6}, Lqf/B0;->getType()Lqf/S;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    sget-object v0, Lqf/r0;->b:Lqf/r0$a;

    .line 65
    .line 66
    invoke-virtual {v0}, Lqf/r0$a;->k()Lqf/r0;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    sget-object v0, Lve/p;->a:LBe/G;

    .line 71
    .line 72
    invoke-virtual {v0}, LBe/G;->l()Lqf/v0;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    const-string v0, "getTypeConstructor(...)"

    .line 77
    .line 78
    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-static {p0}, Lve/h;->l(Lqf/S;)Lqf/S;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v0}, Lvf/d;->d(Lqf/S;)Lqf/B0;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {v0}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    const/16 v11, 0x10

    .line 94
    .line 95
    const/4 v12, 0x0

    .line 96
    const/4 v9, 0x0

    .line 97
    const/4 v10, 0x0

    .line 98
    invoke-static/range {v6 .. v12}, Lqf/V;->k(Lqf/r0;Lqf/v0;Ljava/util/List;ZLrf/g;ILjava/lang/Object;)Lqf/d0;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {v5, v0}, LUd/u;->J0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    invoke-static {p0}, Lvf/d;->n(Lqf/S;)Lve/i;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0}, Lve/i;->J()Lqf/d0;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    const-string v0, "getNullableAnyType(...)"

    .line 115
    .line 116
    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    const/16 v9, 0x80

    .line 120
    .line 121
    const/4 v6, 0x0

    .line 122
    const/4 v8, 0x0

    .line 123
    invoke-static/range {v1 .. v10}, Lve/h;->c(Lve/i;Lze/h;Lqf/S;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lqf/S;ZILjava/lang/Object;)Lqf/d0;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {p0}, Lqf/S;->O0()Z

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    invoke-virtual {v0, p0}, Lqf/d0;->U0(Z)Lqf/d0;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    return-object p0
.end method
