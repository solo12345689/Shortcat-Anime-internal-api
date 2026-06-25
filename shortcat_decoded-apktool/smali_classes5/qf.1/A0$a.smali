.class public final Lqf/A0$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqf/A0;
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
    invoke-direct {p0}, Lqf/A0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lqf/S;Lqf/G0;Ljava/util/Set;Z)Lqf/S;
    .locals 16

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    const-string v2, "<this>"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "substitutor"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {v3}, Lqf/S;->Q0()Lqf/M0;

    move-result-object v2

    .line 2
    instance-of v4, v2, Lqf/I;

    const/4 v5, 0x2

    const-string v6, "getType(...)"

    const/16 v9, 0xa

    const-string v10, "getParameters(...)"

    const/4 v11, 0x0

    if-eqz v4, :cond_e

    .line 3
    move-object v4, v2

    check-cast v4, Lqf/I;

    invoke-virtual {v4}, Lqf/I;->V0()Lqf/d0;

    move-result-object v12

    .line 4
    invoke-virtual {v12}, Lqf/S;->N0()Lqf/v0;

    move-result-object v13

    invoke-interface {v13}, Lqf/v0;->getParameters()Ljava/util/List;

    move-result-object v13

    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v13

    if-nez v13, :cond_6

    invoke-virtual {v12}, Lqf/S;->N0()Lqf/v0;

    move-result-object v13

    invoke-interface {v13}, Lqf/v0;->p()Lye/h;

    move-result-object v13

    if-nez v13, :cond_0

    goto/16 :goto_3

    .line 5
    :cond_0
    invoke-virtual {v12}, Lqf/S;->N0()Lqf/v0;

    move-result-object v13

    invoke-interface {v13}, Lqf/v0;->getParameters()Ljava/util/List;

    move-result-object v13

    invoke-static {v13, v10}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    new-instance v14, Ljava/util/ArrayList;

    invoke-static {v13, v9}, LUd/u;->x(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 7
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_5

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .line 8
    check-cast v15, Lye/m0;

    .line 9
    invoke-virtual {v3}, Lqf/S;->L0()Ljava/util/List;

    move-result-object v7

    invoke-interface {v15}, Lye/m0;->getIndex()I

    move-result v8

    invoke-static {v7, v8}, LUd/u;->p0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lqf/B0;

    if-eqz p4, :cond_1

    if-eqz v7, :cond_1

    .line 10
    invoke-interface {v7}, Lqf/B0;->getType()Lqf/S;

    move-result-object v8

    if-eqz v8, :cond_1

    invoke-static {v8}, Lvf/d;->i(Lqf/S;)Z

    move-result v8

    if-nez v8, :cond_1

    goto :goto_2

    :cond_1
    if-eqz v1, :cond_2

    .line 11
    invoke-interface {v1, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const/4 v8, 0x1

    goto :goto_1

    :cond_2
    const/4 v8, 0x0

    :goto_1
    if-eqz v7, :cond_3

    if-nez v8, :cond_3

    .line 12
    invoke-virtual {v0}, Lqf/G0;->j()Lqf/E0;

    move-result-object v8

    invoke-interface {v7}, Lqf/B0;->getType()Lqf/S;

    move-result-object v9

    invoke-static {v9, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8, v9}, Lqf/E0;->e(Lqf/S;)Lqf/B0;

    move-result-object v8

    if-nez v8, :cond_4

    .line 13
    :cond_3
    new-instance v7, Lqf/k0;

    invoke-direct {v7, v15}, Lqf/k0;-><init>(Lye/m0;)V

    .line 14
    :cond_4
    :goto_2
    invoke-interface {v14, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/16 v9, 0xa

    goto :goto_0

    .line 15
    :cond_5
    invoke-static {v12, v14, v11, v5, v11}, Lqf/F0;->f(Lqf/d0;Ljava/util/List;Lqf/r0;ILjava/lang/Object;)Lqf/d0;

    move-result-object v12

    .line 16
    :cond_6
    :goto_3
    invoke-virtual {v4}, Lqf/I;->W0()Lqf/d0;

    move-result-object v4

    .line 17
    invoke-virtual {v4}, Lqf/S;->N0()Lqf/v0;

    move-result-object v7

    invoke-interface {v7}, Lqf/v0;->getParameters()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_d

    invoke-virtual {v4}, Lqf/S;->N0()Lqf/v0;

    move-result-object v7

    invoke-interface {v7}, Lqf/v0;->p()Lye/h;

    move-result-object v7

    if-nez v7, :cond_7

    goto/16 :goto_7

    .line 18
    :cond_7
    invoke-virtual {v4}, Lqf/S;->N0()Lqf/v0;

    move-result-object v7

    invoke-interface {v7}, Lqf/v0;->getParameters()Ljava/util/List;

    move-result-object v7

    invoke-static {v7, v10}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v7, v9}, LUd/u;->x(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_c

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 21
    check-cast v9, Lye/m0;

    .line 22
    invoke-virtual {v3}, Lqf/S;->L0()Ljava/util/List;

    move-result-object v10

    invoke-interface {v9}, Lye/m0;->getIndex()I

    move-result v13

    invoke-static {v10, v13}, LUd/u;->p0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lqf/B0;

    if-eqz p4, :cond_8

    if-eqz v10, :cond_8

    .line 23
    invoke-interface {v10}, Lqf/B0;->getType()Lqf/S;

    move-result-object v13

    if-eqz v13, :cond_8

    invoke-static {v13}, Lvf/d;->i(Lqf/S;)Z

    move-result v13

    if-nez v13, :cond_8

    goto :goto_6

    :cond_8
    if-eqz v1, :cond_9

    .line 24
    invoke-interface {v1, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_9

    const/4 v13, 0x1

    goto :goto_5

    :cond_9
    const/4 v13, 0x0

    :goto_5
    if-eqz v10, :cond_a

    if-nez v13, :cond_a

    .line 25
    invoke-virtual {v0}, Lqf/G0;->j()Lqf/E0;

    move-result-object v13

    invoke-interface {v10}, Lqf/B0;->getType()Lqf/S;

    move-result-object v14

    invoke-static {v14, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v13, v14}, Lqf/E0;->e(Lqf/S;)Lqf/B0;

    move-result-object v13

    if-nez v13, :cond_b

    .line 26
    :cond_a
    new-instance v10, Lqf/k0;

    invoke-direct {v10, v9}, Lqf/k0;-><init>(Lye/m0;)V

    .line 27
    :cond_b
    :goto_6
    invoke-interface {v8, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 28
    :cond_c
    invoke-static {v4, v8, v11, v5, v11}, Lqf/F0;->f(Lqf/d0;Ljava/util/List;Lqf/r0;ILjava/lang/Object;)Lqf/d0;

    move-result-object v4

    .line 29
    :cond_d
    :goto_7
    invoke-static {v12, v4}, Lqf/V;->e(Lqf/d0;Lqf/d0;)Lqf/M0;

    move-result-object v1

    goto/16 :goto_c

    .line 30
    :cond_e
    instance-of v4, v2, Lqf/d0;

    if-eqz v4, :cond_16

    move-object v4, v2

    check-cast v4, Lqf/d0;

    .line 31
    invoke-virtual {v4}, Lqf/S;->N0()Lqf/v0;

    move-result-object v7

    invoke-interface {v7}, Lqf/v0;->getParameters()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_15

    invoke-virtual {v4}, Lqf/S;->N0()Lqf/v0;

    move-result-object v7

    invoke-interface {v7}, Lqf/v0;->p()Lye/h;

    move-result-object v7

    if-nez v7, :cond_f

    goto/16 :goto_b

    .line 32
    :cond_f
    invoke-virtual {v4}, Lqf/S;->N0()Lqf/v0;

    move-result-object v7

    invoke-interface {v7}, Lqf/v0;->getParameters()Ljava/util/List;

    move-result-object v7

    invoke-static {v7, v10}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v7, v9}, LUd/u;->x(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 34
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_14

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 35
    check-cast v9, Lye/m0;

    .line 36
    invoke-virtual {v3}, Lqf/S;->L0()Ljava/util/List;

    move-result-object v10

    invoke-interface {v9}, Lye/m0;->getIndex()I

    move-result v12

    invoke-static {v10, v12}, LUd/u;->p0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lqf/B0;

    if-eqz p4, :cond_10

    if-eqz v10, :cond_10

    .line 37
    invoke-interface {v10}, Lqf/B0;->getType()Lqf/S;

    move-result-object v12

    if-eqz v12, :cond_10

    invoke-static {v12}, Lvf/d;->i(Lqf/S;)Z

    move-result v12

    if-nez v12, :cond_10

    goto :goto_a

    :cond_10
    if-eqz v1, :cond_11

    .line 38
    invoke-interface {v1, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_11

    const/4 v12, 0x1

    goto :goto_9

    :cond_11
    const/4 v12, 0x0

    :goto_9
    if-eqz v10, :cond_12

    if-nez v12, :cond_12

    .line 39
    invoke-virtual {v0}, Lqf/G0;->j()Lqf/E0;

    move-result-object v12

    invoke-interface {v10}, Lqf/B0;->getType()Lqf/S;

    move-result-object v13

    invoke-static {v13, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v12, v13}, Lqf/E0;->e(Lqf/S;)Lqf/B0;

    move-result-object v12

    if-nez v12, :cond_13

    .line 40
    :cond_12
    new-instance v10, Lqf/k0;

    invoke-direct {v10, v9}, Lqf/k0;-><init>(Lye/m0;)V

    .line 41
    :cond_13
    :goto_a
    invoke-interface {v8, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 42
    :cond_14
    invoke-static {v4, v8, v11, v5, v11}, Lqf/F0;->f(Lqf/d0;Ljava/util/List;Lqf/r0;ILjava/lang/Object;)Lqf/d0;

    move-result-object v1

    goto :goto_c

    :cond_15
    :goto_b
    move-object v1, v4

    .line 43
    :goto_c
    invoke-static {v1, v2}, Lqf/L0;->b(Lqf/M0;Lqf/S;)Lqf/M0;

    move-result-object v1

    .line 44
    sget-object v2, Lqf/N0;->g:Lqf/N0;

    invoke-virtual {v0, v1, v2}, Lqf/G0;->n(Lqf/S;Lqf/N0;)Lqf/S;

    move-result-object v0

    const-string v1, "safeSubstitute(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    .line 45
    :cond_16
    new-instance v0, LTd/r;

    invoke-direct {v0}, LTd/r;-><init>()V

    throw v0
.end method
