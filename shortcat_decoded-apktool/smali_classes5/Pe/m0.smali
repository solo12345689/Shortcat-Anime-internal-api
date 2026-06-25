.class public final LPe/m0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:LPe/g;


# direct methods
.method public constructor <init>(LPe/g;)V
    .locals 1

    .line 1
    const-string v0, "typeEnhancement"

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
    iput-object p1, p0, LPe/m0;->a:LPe/g;

    .line 10
    .line 11
    return-void
.end method

.method static synthetic a(Lye/b;)Lqf/S;
    .locals 0

    .line 1
    invoke-static {p0}, LPe/m0;->n(Lye/b;)Lqf/S;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic b(Lye/t0;Lye/b;)Lqf/S;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LPe/m0;->o(Lye/t0;Lye/b;)Lqf/S;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic c(Lye/b;)Lqf/S;
    .locals 0

    .line 1
    invoke-static {p0}, LPe/m0;->m(Lye/b;)Lqf/S;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic d(Lqf/M0;)Z
    .locals 0

    .line 1
    invoke-static {p0}, LPe/m0;->s(Lqf/M0;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method static synthetic e(Lqf/M0;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    invoke-static {p0}, LPe/m0;->g(Lqf/M0;)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final f(Lqf/S;)Z
    .locals 1

    .line 1
    sget-object v0, LPe/l0;->a:LPe/l0;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lqf/J0;->c(Lqf/S;Lkotlin/jvm/functions/Function1;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method private static final g(Lqf/M0;)Ljava/lang/Boolean;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lqf/S;->N0()Lqf/v0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lqf/v0;->p()Lye/h;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-interface {p0}, Lye/J;->getName()LXe/f;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget-object v1, Lxe/c;->a:Lxe/c;

    .line 19
    .line 20
    invoke-virtual {v1}, Lxe/c;->h()LXe/c;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2}, LXe/c;->f()LXe/f;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-static {p0}, Lff/e;->k(Lye/m;)LXe/c;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {v1}, Lxe/c;->h()LXe/c;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_1

    .line 47
    .line 48
    const/4 p0, 0x1

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const/4 p0, 0x0

    .line 51
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method

.method private final h(LPe/o0;Lqf/S;Ljava/util/List;LPe/r0;Z)Lqf/S;
    .locals 1

    .line 1
    iget-object v0, p0, LPe/m0;->a:LPe/g;

    .line 2
    .line 3
    invoke-virtual {p1, p2, p3, p4, p5}, LPe/d;->d(Luf/i;Ljava/lang/Iterable;LPe/r0;Z)Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    invoke-virtual {p1}, LPe/o0;->z()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {v0, p2, p3, p1}, LPe/g;->a(Lqf/S;Lkotlin/jvm/functions/Function1;Z)Lqf/S;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method private final i(Lye/b;Lze/a;ZLKe/k;LHe/c;LPe/r0;ZLkotlin/jvm/functions/Function1;)Lqf/S;
    .locals 9

    .line 1
    move-object/from16 v0, p8

    .line 2
    .line 3
    new-instance v1, LPe/o0;

    .line 4
    .line 5
    const/16 v7, 0x10

    .line 6
    .line 7
    const/4 v8, 0x0

    .line 8
    const/4 v6, 0x0

    .line 9
    move-object v2, p2

    .line 10
    move v3, p3

    .line 11
    move-object v4, p4

    .line 12
    move-object v5, p5

    .line 13
    invoke-direct/range {v1 .. v8}, LPe/o0;-><init>(Lze/a;ZLKe/k;LHe/c;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    move-object v3, p2

    .line 21
    check-cast v3, Lqf/S;

    .line 22
    .line 23
    invoke-interface {p1}, Lye/b;->e()Ljava/util/Collection;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string p2, "getOverriddenDescriptors(...)"

    .line 28
    .line 29
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    check-cast p1, Ljava/lang/Iterable;

    .line 33
    .line 34
    new-instance v4, Ljava/util/ArrayList;

    .line 35
    .line 36
    const/16 p2, 0xa

    .line 37
    .line 38
    invoke-static {p1, p2}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    invoke-direct {v4, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    if-eqz p2, :cond_0

    .line 54
    .line 55
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    check-cast p2, Lye/b;

    .line 60
    .line 61
    invoke-static {p2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {v0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    check-cast p2, Lqf/S;

    .line 69
    .line 70
    invoke-interface {v4, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    move-object v5, p6

    .line 75
    move/from16 v6, p7

    .line 76
    .line 77
    move-object v2, v1

    .line 78
    move-object v1, p0

    .line 79
    invoke-direct/range {v1 .. v6}, LPe/m0;->h(LPe/o0;Lqf/S;Ljava/util/List;LPe/r0;Z)Lqf/S;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    return-object p1
.end method

.method static synthetic j(LPe/m0;LPe/o0;Lqf/S;Ljava/util/List;LPe/r0;ZILjava/lang/Object;)Lqf/S;
    .locals 6

    .line 1
    and-int/lit8 p7, p6, 0x4

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    const/4 p4, 0x0

    .line 6
    :cond_0
    move-object v4, p4

    .line 7
    and-int/lit8 p4, p6, 0x8

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
    move-object v3, p3

    .line 16
    move v5, p5

    .line 17
    invoke-direct/range {v0 .. v5}, LPe/m0;->h(LPe/o0;Lqf/S;Ljava/util/List;LPe/r0;Z)Lqf/S;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method static synthetic k(LPe/m0;Lye/b;Lze/a;ZLKe/k;LHe/c;LPe/r0;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lqf/S;
    .locals 10

    .line 1
    and-int/lit8 v0, p9, 0x20

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    move v8, v0

    .line 7
    :goto_0
    move-object v1, p0

    .line 8
    move-object v2, p1

    .line 9
    move-object v3, p2

    .line 10
    move v4, p3

    .line 11
    move-object v5, p4

    .line 12
    move-object v6, p5

    .line 13
    move-object/from16 v7, p6

    .line 14
    .line 15
    move-object/from16 v9, p8

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    move/from16 v8, p7

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :goto_1
    invoke-direct/range {v1 .. v9}, LPe/m0;->i(Lye/b;Lze/a;ZLKe/k;LHe/c;LPe/r0;ZLkotlin/jvm/functions/Function1;)Lqf/S;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method private final l(Lye/b;LKe/k;)Lye/b;
    .locals 17

    move-object/from16 v1, p1

    .line 1
    instance-of v0, v1, LJe/a;

    if-nez v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    invoke-interface {v1}, Lye/b;->h()Lye/b$a;

    move-result-object v0

    sget-object v2, Lye/b$a;->b:Lye/b$a;

    const/4 v11, 0x1

    if-ne v0, v2, :cond_1

    invoke-interface {v1}, Lye/b;->a()Lye/b;

    move-result-object v0

    invoke-interface {v0}, Lye/b;->e()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    if-ne v0, v11, :cond_1

    move-object/from16 v0, p0

    goto/16 :goto_17

    .line 3
    :cond_1
    invoke-direct/range {p0 .. p2}, LPe/m0;->u(Lye/b;LKe/k;)Lze/h;

    move-result-object v0

    move-object/from16 v7, p2

    invoke-static {v7, v0}, LKe/c;->k(LKe/k;Lze/h;)LKe/k;

    move-result-object v3

    .line 4
    instance-of v0, v1, LJe/f;

    if-eqz v0, :cond_2

    move-object v0, v1

    check-cast v0, LBe/K;

    invoke-virtual {v0}, LBe/K;->R0()LBe/L;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, LBe/J;->F()Z

    move-result v2

    if-nez v2, :cond_2

    .line 5
    invoke-virtual {v0}, LBe/K;->R0()LBe/L;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    move-object v8, v0

    goto :goto_0

    :cond_2
    move-object v8, v1

    .line 6
    :goto_0
    invoke-interface {v1}, Lye/a;->O()Lye/c0;

    move-result-object v0

    const/4 v12, 0x0

    if-eqz v0, :cond_5

    .line 7
    instance-of v0, v8, Lye/z;

    if-eqz v0, :cond_3

    move-object v0, v8

    check-cast v0, Lye/z;

    goto :goto_1

    :cond_3
    move-object v0, v12

    :goto_1
    if-eqz v0, :cond_4

    .line 8
    sget-object v2, LJe/e;->G:Lye/a$a;

    invoke-interface {v0, v2}, Lye/a;->n0(Lye/a$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lye/t0;

    move-object v2, v0

    goto :goto_2

    :cond_4
    move-object v2, v12

    :goto_2
    const/4 v5, 0x0

    .line 9
    sget-object v6, LPe/h0;->a:LPe/h0;

    const/4 v4, 0x0

    move-object/from16 v0, p0

    .line 10
    invoke-direct/range {v0 .. v6}, LPe/m0;->t(Lye/b;Lye/t0;LKe/k;LPe/r0;ZLkotlin/jvm/functions/Function1;)Lqf/S;

    move-result-object v2

    move-object v13, v2

    goto :goto_3

    :cond_5
    move-object v13, v12

    .line 11
    :goto_3
    instance-of v0, v1, LJe/e;

    if-eqz v0, :cond_6

    move-object v0, v1

    check-cast v0, LJe/e;

    goto :goto_4

    :cond_6
    move-object v0, v12

    :goto_4
    const/4 v14, 0x0

    if-eqz v0, :cond_b

    .line 12
    sget-object v2, LQe/F;->a:LQe/F;

    invoke-virtual {v0}, LBe/n;->b()Lye/m;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lye/e;

    const/4 v5, 0x3

    invoke-static {v0, v14, v14, v5, v12}, LQe/C;->c(Lye/z;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v4, v0}, LQe/B;->a(LQe/F;Lye/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 13
    invoke-static {}, LPe/f0;->K0()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LPe/g0;

    if-eqz v0, :cond_a

    .line 14
    invoke-virtual {v0}, LPe/g0;->a()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-virtual {v0}, LPe/g0;->a()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_7

    const-string v4, "2."

    const/4 v5, 0x2

    invoke-static {v2, v4, v14, v5, v12}, LDf/r;->Q(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v2

    if-ne v2, v11, :cond_7

    goto :goto_5

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 15
    :cond_8
    :goto_5
    invoke-virtual {v0}, LPe/g0;->a()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_9

    goto :goto_6

    :cond_9
    invoke-virtual {v0}, LPe/g0;->d()LPe/g0;

    move-result-object v0

    goto :goto_6

    :cond_a
    move-object v0, v12

    :goto_6
    move-object v9, v0

    goto :goto_7

    :cond_b
    move-object v9, v12

    :goto_7
    if-eqz v9, :cond_c

    .line 16
    invoke-virtual {v9}, LPe/g0;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 17
    move-object v0, v1

    check-cast v0, LJe/e;

    .line 18
    invoke-virtual {v0}, LBe/s;->j()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 19
    :cond_c
    invoke-virtual {v7}, LKe/k;->a()LKe/d;

    move-result-object v0

    invoke-virtual {v0}, LKe/d;->i()LHe/D;

    move-result-object v0

    invoke-static {v0}, LHe/V;->c(LHe/D;)Z

    move-result v0

    if-nez v0, :cond_d

    .line 20
    invoke-virtual {v3}, LKe/k;->a()LKe/d;

    move-result-object v0

    invoke-virtual {v0}, LKe/d;->q()LKe/e;

    move-result-object v0

    invoke-interface {v0}, LKe/e;->b()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 21
    :cond_d
    invoke-static {v1}, LHe/V;->b(Lye/b;)Z

    move-result v0

    if-eqz v0, :cond_e

    move v5, v11

    goto :goto_8

    :cond_e
    move v5, v14

    .line 22
    :goto_8
    invoke-interface {v8}, Lye/a;->j()Ljava/util/List;

    move-result-object v0

    const-string v15, "getValueParameters(...)"

    invoke-static {v0, v15}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    new-instance v7, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v0, v10}, LUd/u;->x(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v7, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_9
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 25
    move-object v2, v0

    check-cast v2, Lye/t0;

    if-eqz v9, :cond_f

    .line 26
    invoke-virtual {v9}, LPe/g0;->b()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-interface {v2}, Lye/t0;->getIndex()I

    move-result v4

    invoke-static {v0, v4}, LUd/u;->p0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LPe/r0;

    move-object v4, v0

    goto :goto_a

    :cond_f
    move-object v4, v12

    .line 27
    :goto_a
    new-instance v6, LPe/i0;

    invoke-direct {v6, v2}, LPe/i0;-><init>(Lye/t0;)V

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v6}, LPe/m0;->t(Lye/b;Lye/t0;LKe/k;LPe/r0;ZLkotlin/jvm/functions/Function1;)Lqf/S;

    move-result-object v2

    .line 28
    invoke-interface {v7, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_9

    .line 29
    :cond_10
    instance-of v0, v1, Lye/Z;

    if-eqz v0, :cond_11

    move-object v0, v1

    check-cast v0, Lye/Z;

    goto :goto_b

    :cond_11
    move-object v0, v12

    :goto_b
    if-eqz v0, :cond_12

    invoke-static {v0}, LLe/d;->a(Lye/Z;)Z

    move-result v0

    if-ne v0, v11, :cond_12

    .line 30
    sget-object v0, LHe/c;->d:LHe/c;

    :goto_c
    move-object v5, v0

    goto :goto_d

    .line 31
    :cond_12
    sget-object v0, LHe/c;->b:LHe/c;

    goto :goto_c

    :goto_d
    if-eqz v9, :cond_13

    .line 32
    invoke-virtual {v9}, LPe/g0;->c()LPe/r0;

    move-result-object v0

    move-object v6, v0

    :goto_e
    move-object v2, v8

    goto :goto_f

    :cond_13
    move-object v6, v12

    goto :goto_e

    .line 33
    :goto_f
    sget-object v8, LPe/j0;->a:LPe/j0;

    const/16 v9, 0x20

    move v0, v10

    const/4 v10, 0x0

    move-object v4, v3

    const/4 v3, 0x1

    move-object/from16 v16, v7

    const/4 v7, 0x0

    move v11, v0

    move-object/from16 p2, v16

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v10}, LPe/m0;->k(LPe/m0;Lye/b;Lze/a;ZLKe/k;LHe/c;LPe/r0;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lqf/S;

    move-result-object v2

    .line 34
    invoke-interface {v1}, Lye/a;->getReturnType()Lqf/S;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    invoke-direct {v0, v3}, LPe/m0;->f(Lqf/S;)Z

    move-result v3

    const-string v4, "getType(...)"

    if-nez v3, :cond_19

    .line 35
    invoke-interface {v1}, Lye/a;->O()Lye/c0;

    move-result-object v3

    if-eqz v3, :cond_14

    invoke-interface {v3}, Lye/s0;->getType()Lqf/S;

    move-result-object v3

    if-eqz v3, :cond_14

    invoke-direct {v0, v3}, LPe/m0;->f(Lqf/S;)Z

    move-result v3

    goto :goto_10

    :cond_14
    move v3, v14

    :goto_10
    if-nez v3, :cond_19

    .line 36
    invoke-interface {v1}, Lye/a;->j()Ljava/util/List;

    move-result-object v3

    .line 37
    invoke-static {v3, v15}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v3, :cond_16

    .line 38
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_16

    :cond_15
    move v3, v14

    goto :goto_11

    .line 39
    :cond_16
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_17
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_15

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lye/t0;

    .line 40
    invoke-interface {v5}, Lye/s0;->getType()Lqf/S;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v5}, LPe/m0;->f(Lqf/S;)Z

    move-result v5

    if-eqz v5, :cond_17

    const/4 v3, 0x1

    :goto_11
    if-eqz v3, :cond_18

    goto :goto_12

    :cond_18
    move v3, v14

    goto :goto_13

    :cond_19
    :goto_12
    const/4 v3, 0x1

    :goto_13
    if-eqz v3, :cond_1a

    .line 41
    invoke-static {}, Lef/d;->a()Lye/a$a;

    move-result-object v3

    new-instance v5, LHe/n;

    invoke-direct {v5, v1}, LHe/n;-><init>(Lye/m;)V

    invoke-static {v3, v5}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    goto :goto_14

    :cond_1a
    move-object v3, v12

    :goto_14
    if-nez v13, :cond_20

    if-nez v2, :cond_20

    .line 42
    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_1c

    :cond_1b
    move/from16 v16, v14

    goto :goto_16

    .line 43
    :cond_1c
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lqf/S;

    if-eqz v6, :cond_1e

    const/4 v6, 0x1

    goto :goto_15

    :cond_1e
    move v6, v14

    :goto_15
    if-eqz v6, :cond_1d

    const/16 v16, 0x1

    :goto_16
    if-nez v16, :cond_20

    if-eqz v3, :cond_1f

    goto :goto_18

    :cond_1f
    :goto_17
    return-object v1

    .line 44
    :cond_20
    :goto_18
    move-object v5, v1

    check-cast v5, LJe/a;

    if-nez v13, :cond_21

    .line 45
    invoke-interface {v1}, Lye/a;->O()Lye/c0;

    move-result-object v6

    if-eqz v6, :cond_22

    invoke-interface {v6}, Lye/s0;->getType()Lqf/S;

    move-result-object v12

    goto :goto_19

    :cond_21
    move-object v12, v13

    .line 46
    :cond_22
    :goto_19
    new-instance v6, Ljava/util/ArrayList;

    move-object/from16 v7, p2

    invoke-static {v7, v11}, LUd/u;->x(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 47
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_25

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v9, v14, 0x1

    if-gez v14, :cond_23

    .line 48
    invoke-static {}, LUd/u;->w()V

    :cond_23
    check-cast v8, Lqf/S;

    if-nez v8, :cond_24

    .line 49
    invoke-interface {v1}, Lye/a;->j()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lye/t0;

    invoke-interface {v8}, Lye/s0;->getType()Lqf/S;

    move-result-object v8

    .line 50
    invoke-static {v8, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    :cond_24
    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v14, v9

    goto :goto_1a

    :cond_25
    if-nez v2, :cond_26

    .line 52
    invoke-interface {v1}, Lye/a;->getReturnType()Lqf/S;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 53
    :cond_26
    invoke-interface {v5, v12, v6, v2, v3}, LJe/a;->x(Lqf/S;Ljava/util/List;Lqf/S;Lkotlin/Pair;)LJe/a;

    move-result-object v1

    .line 54
    const-string v2, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1
.end method

.method private static final m(Lye/b;)Lqf/S;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Lye/a;->getReturnType()Lqf/S;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method private static final n(Lye/b;)Lqf/S;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Lye/a;->O()Lye/c0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p0}, Lye/s0;->getType()Lqf/S;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v0, "getType(...)"

    .line 18
    .line 19
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method private static final o(Lye/t0;Lye/b;)Lqf/S;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lye/a;->j()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p0}, Lye/t0;->getIndex()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Lye/t0;

    .line 19
    .line 20
    invoke-interface {p0}, Lye/s0;->getType()Lqf/S;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const-string p1, "getType(...)"

    .line 25
    .line 26
    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object p0
.end method

.method private static final s(Lqf/M0;)Z
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of p0, p0, Lqf/c0;

    .line 7
    .line 8
    return p0
.end method

.method private final t(Lye/b;Lye/t0;LKe/k;LPe/r0;ZLkotlin/jvm/functions/Function1;)Lqf/S;
    .locals 10

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    invoke-interface {p2}, Lze/a;->getAnnotations()Lze/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p3, v0}, LKe/c;->k(LKe/k;Lze/h;)LKe/k;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v5, v0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    move-object v5, p3

    .line 17
    :goto_1
    sget-object v6, LHe/c;->c:LHe/c;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    move-object v1, p0

    .line 21
    move-object v2, p1

    .line 22
    move-object v3, p2

    .line 23
    move-object v7, p4

    .line 24
    move v8, p5

    .line 25
    move-object/from16 v9, p6

    .line 26
    .line 27
    invoke-direct/range {v1 .. v9}, LPe/m0;->i(Lye/b;Lze/a;ZLKe/k;LHe/c;LPe/r0;ZLkotlin/jvm/functions/Function1;)Lqf/S;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
.end method

.method private final u(Lye/b;LKe/k;)Lze/h;
    .locals 5

    .line 1
    invoke-static {p1}, Lye/s;->a(Lye/m;)Lye/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, Lze/a;->getAnnotations()Lze/h;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    instance-of v1, v0, LLe/n;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    check-cast v0, LLe/n;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move-object v0, v2

    .line 21
    :goto_0
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {v0}, LLe/n;->T0()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    :cond_2
    if-eqz v2, :cond_5

    .line 28
    .line 29
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    .line 37
    .line 38
    const/16 v1, 0xa

    .line 39
    .line 40
    invoke-static {v2, v1}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_4

    .line 56
    .line 57
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, LOe/a;

    .line 62
    .line 63
    new-instance v3, LLe/j;

    .line 64
    .line 65
    const/4 v4, 0x1

    .line 66
    invoke-direct {v3, p2, v2, v4}, LLe/j;-><init>(LKe/k;LOe/a;Z)V

    .line 67
    .line 68
    .line 69
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    sget-object p2, Lze/h;->k0:Lze/h$a;

    .line 74
    .line 75
    invoke-interface {p1}, Lze/a;->getAnnotations()Lze/h;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {p1, v0}, LUd/u;->G0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p2, p1}, Lze/h$a;->a(Ljava/util/List;)Lze/h;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    return-object p1

    .line 88
    :cond_5
    :goto_2
    invoke-interface {p1}, Lze/a;->getAnnotations()Lze/h;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    return-object p1
.end method


# virtual methods
.method public final p(LKe/k;Ljava/util/Collection;)Ljava/util/Collection;
    .locals 2

    .line 1
    const-string v0, "c"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "platformSignatures"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    check-cast p2, Ljava/lang/Iterable;

    .line 12
    .line 13
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/16 v1, 0xa

    .line 16
    .line 17
    invoke-static {p2, v1}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lye/b;

    .line 39
    .line 40
    invoke-direct {p0, v1, p1}, LPe/m0;->l(Lye/b;LKe/k;)Lye/b;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    return-object v0
.end method

.method public final q(Lqf/S;LKe/k;)Lqf/S;
    .locals 9

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, LPe/o0;

    .line 12
    .line 13
    sget-object v5, LHe/c;->e:LHe/c;

    .line 14
    .line 15
    const/4 v6, 0x1

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    move-object v4, p2

    .line 19
    invoke-direct/range {v1 .. v6}, LPe/o0;-><init>(Lze/a;ZLKe/k;LHe/c;Z)V

    .line 20
    .line 21
    .line 22
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    const/16 v7, 0xc

    .line 27
    .line 28
    const/4 v8, 0x0

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x0

    .line 31
    move-object v3, p1

    .line 32
    move-object v2, v1

    .line 33
    move-object v1, p0

    .line 34
    invoke-static/range {v1 .. v8}, LPe/m0;->j(LPe/m0;LPe/o0;Lqf/S;Ljava/util/List;LPe/r0;ZILjava/lang/Object;)Lqf/S;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    if-nez p1, :cond_0

    .line 39
    .line 40
    return-object v3

    .line 41
    :cond_0
    return-object p1
.end method

.method public final r(Lye/m0;Ljava/util/List;LKe/k;)Ljava/util/List;
    .locals 11

    .line 1
    const-string v1, "typeParameter"

    .line 2
    .line 3
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "bounds"

    .line 7
    .line 8
    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v1, "context"

    .line 12
    .line 13
    invoke-static {p3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    const/16 v2, 0xa

    .line 19
    .line 20
    invoke-static {p2, v2}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    move-object v10, v2

    .line 42
    check-cast v10, Lqf/S;

    .line 43
    .line 44
    sget-object v2, LPe/k0;->a:LPe/k0;

    .line 45
    .line 46
    invoke-static {v10, v2}, Lvf/d;->e(Lqf/S;Lkotlin/jvm/functions/Function1;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    move-object v5, v10

    .line 53
    goto :goto_1

    .line 54
    :cond_0
    new-instance v2, LPe/o0;

    .line 55
    .line 56
    sget-object v6, LHe/c;->f:LHe/c;

    .line 57
    .line 58
    const/16 v8, 0x10

    .line 59
    .line 60
    const/4 v9, 0x0

    .line 61
    const/4 v4, 0x0

    .line 62
    const/4 v7, 0x0

    .line 63
    move-object v3, p1

    .line 64
    move-object v5, p3

    .line 65
    invoke-direct/range {v2 .. v9}, LPe/o0;-><init>(Lze/a;ZLKe/k;LHe/c;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 66
    .line 67
    .line 68
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    const/16 v9, 0xc

    .line 73
    .line 74
    move-object v5, v10

    .line 75
    const/4 v10, 0x0

    .line 76
    const/4 v7, 0x0

    .line 77
    const/4 v8, 0x0

    .line 78
    move-object v3, p0

    .line 79
    move-object v4, v2

    .line 80
    invoke-static/range {v3 .. v10}, LPe/m0;->j(LPe/m0;LPe/o0;Lqf/S;Ljava/util/List;LPe/r0;ZILjava/lang/Object;)Lqf/S;

    .line 81
    .line 82
    .line 83
    move-result-object v10

    .line 84
    if-nez v10, :cond_1

    .line 85
    .line 86
    :goto_1
    move-object v10, v5

    .line 87
    :cond_1
    invoke-interface {v1, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_2
    return-object v1
.end method
