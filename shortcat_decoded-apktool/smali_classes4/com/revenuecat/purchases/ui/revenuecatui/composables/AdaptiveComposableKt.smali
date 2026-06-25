.class public final Lcom/revenuecat/purchases/ui/revenuecatui/composables/AdaptiveComposableKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u001a1\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000c\u00b2\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\u000b\u001a\u00020\t8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "LC/I;",
        "Landroidx/compose/ui/e;",
        "modifier",
        "",
        "Lkotlin/Function0;",
        "LTd/L;",
        "composables",
        "AdaptiveComposable",
        "(LC/I;Landroidx/compose/ui/e;Ljava/util/List;LY/m;II)V",
        "",
        "maxSize",
        "selectedIndex",
        "revenuecatui_defaultsBc8Release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final AdaptiveComposable(LC/I;Landroidx/compose/ui/e;Ljava/util/List;LY/m;II)V
    .locals 40
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LC/I;",
            "Landroidx/compose/ui/e;",
            "Ljava/util/List<",
            "+",
            "Lkotlin/jvm/functions/Function2;",
            ">;",
            "LY/m;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p4

    const/4 v0, 0x0

    .line 1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 2
    const-string v5, "<this>"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "composables"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const v5, -0x3f64b5e2

    move-object/from16 v6, p3

    .line 3
    invoke-interface {v6, v5}, LY/m;->g(I)LY/m;

    move-result-object v6

    const/high16 v7, -0x80000000

    and-int v7, p5, v7

    const/4 v8, 0x2

    if-eqz v7, :cond_0

    or-int/lit8 v7, v4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v4, 0x6

    if-nez v7, :cond_2

    invoke-interface {v6, v1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    move v7, v8

    :goto_0
    or-int/2addr v7, v4

    goto :goto_1

    :cond_2
    move v7, v4

    :goto_1
    and-int/lit8 v9, p5, 0x1

    if-eqz v9, :cond_4

    or-int/lit8 v7, v7, 0x30

    :cond_3
    move-object/from16 v10, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v10, v4, 0x30

    if-nez v10, :cond_3

    move-object/from16 v10, p1

    invoke-interface {v6, v10}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    const/16 v11, 0x20

    goto :goto_2

    :cond_5
    const/16 v11, 0x10

    :goto_2
    or-int/2addr v7, v11

    :goto_3
    and-int/lit8 v11, p5, 0x2

    if-eqz v11, :cond_6

    or-int/lit16 v7, v7, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v11, v4, 0x180

    if-nez v11, :cond_8

    invoke-interface {v6, v3}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    const/16 v11, 0x100

    goto :goto_4

    :cond_7
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v7, v11

    :cond_8
    :goto_5
    and-int/lit16 v11, v7, 0x93

    const/16 v12, 0x92

    if-ne v11, v12, :cond_b

    invoke-interface {v6}, LY/m;->i()Z

    move-result v11

    if-nez v11, :cond_9

    goto :goto_7

    .line 4
    :cond_9
    invoke-interface {v6}, LY/m;->K()V

    :cond_a
    :goto_6
    move-object v2, v10

    goto/16 :goto_e

    :cond_b
    :goto_7
    if-eqz v9, :cond_c

    .line 5
    sget-object v9, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    move-object v10, v9

    :cond_c
    invoke-static {}, LY/w;->L()Z

    move-result v9

    if-eqz v9, :cond_d

    const/4 v9, -0x1

    const-string v11, "com.revenuecat.purchases.ui.revenuecatui.composables.AdaptiveComposable (AdaptiveComposable.kt:24)"

    .line 6
    invoke-static {v5, v7, v9, v11}, LY/w;->U(IIILjava/lang/String;)V

    :cond_d
    const v5, 0x2ab88b92

    invoke-interface {v6, v5}, LY/m;->V(I)V

    .line 7
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v5

    .line 8
    sget-object v7, LY/m;->a:LY/m$a;

    invoke-virtual {v7}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v9

    const/4 v11, 0x0

    if-ne v5, v9, :cond_e

    .line 9
    invoke-static {v2, v11, v8, v11}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    move-result-object v5

    .line 10
    invoke-interface {v6, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 11
    :cond_e
    check-cast v5, LY/C0;

    invoke-interface {v6}, LY/m;->O()V

    const v8, 0x2ab8922b

    invoke-interface {v6, v8}, LY/m;->V(I)V

    .line 12
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v8

    .line 13
    invoke-virtual {v7}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v8, v7, :cond_10

    .line 14
    invoke-static {}, LY/U1;->e()Li0/E;

    move-result-object v8

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v7

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9, v7}, Ljava/util/ArrayList;-><init>(I)V

    move v12, v0

    :goto_8
    if-ge v12, v7, :cond_f

    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v12, v12, 0x1

    goto :goto_8

    :cond_f
    invoke-virtual {v8, v9}, Li0/E;->addAll(Ljava/util/Collection;)Z

    .line 15
    invoke-interface {v6, v8}, LY/m;->u(Ljava/lang/Object;)V

    .line 16
    :cond_10
    check-cast v8, Li0/E;

    invoke-interface {v6}, LY/m;->O()V

    const/4 v7, 0x0

    const/4 v9, 0x1

    .line 17
    invoke-static {v10, v7, v9, v11}, Landroidx/compose/foundation/layout/s;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v12

    const v13, 0x2ab8a9f2

    invoke-interface {v6, v13}, LY/m;->V(I)V

    .line 18
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v13

    .line 19
    sget-object v14, LY/m;->a:LY/m$a;

    invoke-virtual {v14}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v14

    if-ne v13, v14, :cond_11

    .line 20
    new-instance v13, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AdaptiveComposableKt$AdaptiveComposable$1$1;

    invoke-direct {v13, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AdaptiveComposableKt$AdaptiveComposable$1$1;-><init>(LY/C0;)V

    .line 21
    invoke-interface {v6, v13}, LY/m;->u(Ljava/lang/Object;)V

    .line 22
    :cond_11
    check-cast v13, Lkotlin/jvm/functions/Function1;

    invoke-interface {v6}, LY/m;->O()V

    invoke-static {v12, v13}, Landroidx/compose/ui/layout/n;->a(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    move-result-object v12

    .line 23
    sget-object v13, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v13}, Ll0/e$a;->i()Ll0/e$c;

    move-result-object v14

    invoke-interface {v1, v12, v14}, LC/I;->c(Landroidx/compose/ui/e;Ll0/e$c;)Landroidx/compose/ui/e;

    move-result-object v12

    .line 24
    invoke-virtual {v13}, Ll0/e$a;->o()Ll0/e;

    move-result-object v14

    .line 25
    invoke-static {v14, v0}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    move-result-object v14

    .line 26
    invoke-static {v6, v0}, LY/h;->a(LY/m;I)I

    move-result v15

    .line 27
    invoke-interface {v6}, LY/m;->r()LY/I;

    move-result-object v0

    .line 28
    invoke-static {v6, v12}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v12

    .line 29
    sget-object v16, LK0/g;->M:LK0/g$a;

    invoke-virtual/range {v16 .. v16}, LK0/g$a;->a()Lie/a;

    move-result-object v7

    .line 30
    invoke-interface {v6}, LY/m;->j()LY/d;

    move-result-object v17

    if-nez v17, :cond_12

    invoke-static {}, LY/h;->d()V

    .line 31
    :cond_12
    invoke-interface {v6}, LY/m;->I()V

    .line 32
    invoke-interface {v6}, LY/m;->e()Z

    move-result v17

    if-eqz v17, :cond_13

    .line 33
    invoke-interface {v6, v7}, LY/m;->h(Lie/a;)V

    goto :goto_9

    .line 34
    :cond_13
    invoke-interface {v6}, LY/m;->s()V

    .line 35
    :goto_9
    invoke-static {v6}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v7

    .line 36
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    invoke-static {v7, v14, v9}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 37
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    invoke-static {v7, v0, v9}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 38
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    .line 39
    invoke-interface {v7}, LY/m;->e()Z

    move-result v9

    if-nez v9, :cond_14

    invoke-interface {v7}, LY/m;->D()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v9, v14}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_15

    .line 40
    :cond_14
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v7, v9}, LY/m;->u(Ljava/lang/Object;)V

    .line 41
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v7, v9, v0}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 42
    :cond_15
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v7, v12, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 43
    sget-object v0, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 44
    sget-object v17, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    const v38, 0x1fffb

    const/16 v39, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const-wide/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const-wide/16 v33, 0x0

    const-wide/16 v35, 0x0

    const/16 v37, 0x0

    .line 45
    invoke-static/range {v17 .. v39}, Landroidx/compose/ui/graphics/f;->c(Landroidx/compose/ui/e;FFFFFFFFFFJLs0/E1;ZLs0/u1;JJIILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    const/4 v9, 0x0

    const/4 v12, 0x1

    .line 46
    invoke-static {v7, v9, v12, v11}, Landroidx/compose/foundation/layout/s;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    .line 47
    invoke-static {v7, v11, v12, v12, v11}, Landroidx/compose/foundation/layout/s;->D(Landroidx/compose/ui/e;Ll0/e$b;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    .line 48
    invoke-virtual {v13}, Ll0/e$a;->e()Ll0/e;

    move-result-object v9

    invoke-interface {v0, v7, v9}, LC/c;->b(Landroidx/compose/ui/e;Ll0/e;)Landroidx/compose/ui/e;

    move-result-object v7

    .line 49
    invoke-virtual {v13}, Ll0/e$a;->o()Ll0/e;

    move-result-object v9

    const/4 v11, 0x0

    .line 50
    invoke-static {v9, v11}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    move-result-object v9

    .line 51
    invoke-static {v6, v11}, LY/h;->a(LY/m;I)I

    move-result v12

    .line 52
    invoke-interface {v6}, LY/m;->r()LY/I;

    move-result-object v11

    .line 53
    invoke-static {v6, v7}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v7

    .line 54
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->a()Lie/a;

    move-result-object v13

    .line 55
    invoke-interface {v6}, LY/m;->j()LY/d;

    move-result-object v14

    if-nez v14, :cond_16

    invoke-static {}, LY/h;->d()V

    .line 56
    :cond_16
    invoke-interface {v6}, LY/m;->I()V

    .line 57
    invoke-interface {v6}, LY/m;->e()Z

    move-result v14

    if-eqz v14, :cond_17

    .line 58
    invoke-interface {v6, v13}, LY/m;->h(Lie/a;)V

    goto :goto_a

    .line 59
    :cond_17
    invoke-interface {v6}, LY/m;->s()V

    .line 60
    :goto_a
    invoke-static {v6}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v13

    .line 61
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v14

    invoke-static {v13, v9, v14}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 62
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    invoke-static {v13, v11, v9}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 63
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    .line 64
    invoke-interface {v13}, LY/m;->e()Z

    move-result v11

    if-nez v11, :cond_18

    invoke-interface {v13}, LY/m;->D()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v11, v14}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_19

    .line 65
    :cond_18
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v13, v11}, LY/m;->u(Ljava/lang/Object;)V

    .line 66
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v13, v11, v9}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 67
    :cond_19
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    invoke-static {v13, v7, v9}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    const v7, 0x720ae992

    .line 68
    invoke-interface {v6, v7}, LY/m;->V(I)V

    .line 69
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    const/4 v9, 0x0

    :goto_b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_21

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    add-int/lit8 v12, v9, 0x1

    if-gez v9, :cond_1a

    invoke-static {}, LUd/u;->w()V

    :cond_1a
    check-cast v11, Lkotlin/jvm/functions/Function2;

    .line 70
    sget-object v13, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    const v14, -0x7473d4f8

    invoke-interface {v6, v14}, LY/m;->V(I)V

    invoke-interface {v6, v9}, LY/m;->c(I)Z

    move-result v14

    .line 71
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v15

    if-nez v14, :cond_1b

    .line 72
    sget-object v14, LY/m;->a:LY/m$a;

    invoke-virtual {v14}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v14

    if-ne v15, v14, :cond_1c

    .line 73
    :cond_1b
    new-instance v15, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AdaptiveComposableKt$AdaptiveComposable$2$1$1$1$1;

    invoke-direct {v15, v8, v9}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AdaptiveComposableKt$AdaptiveComposable$2$1$1$1$1;-><init>(Li0/E;I)V

    .line 74
    invoke-interface {v6, v15}, LY/m;->u(Ljava/lang/Object;)V

    .line 75
    :cond_1c
    check-cast v15, Lie/o;

    invoke-interface {v6}, LY/m;->O()V

    invoke-static {v13, v15}, Landroidx/compose/ui/layout/i;->a(Landroidx/compose/ui/e;Lie/o;)Landroidx/compose/ui/e;

    move-result-object v9

    .line 76
    sget-object v13, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v13}, Ll0/e$a;->o()Ll0/e;

    move-result-object v13

    const/4 v14, 0x0

    .line 77
    invoke-static {v13, v14}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    move-result-object v13

    .line 78
    invoke-static {v6, v14}, LY/h;->a(LY/m;I)I

    move-result v15

    .line 79
    invoke-interface {v6}, LY/m;->r()LY/I;

    move-result-object v14

    .line 80
    invoke-static {v6, v9}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v9

    .line 81
    sget-object v16, LK0/g;->M:LK0/g$a;

    invoke-virtual/range {v16 .. v16}, LK0/g$a;->a()Lie/a;

    move-result-object v1

    .line 82
    invoke-interface {v6}, LY/m;->j()LY/d;

    move-result-object v17

    if-nez v17, :cond_1d

    invoke-static {}, LY/h;->d()V

    .line 83
    :cond_1d
    invoke-interface {v6}, LY/m;->I()V

    .line 84
    invoke-interface {v6}, LY/m;->e()Z

    move-result v17

    if-eqz v17, :cond_1e

    .line 85
    invoke-interface {v6, v1}, LY/m;->h(Lie/a;)V

    goto :goto_c

    .line 86
    :cond_1e
    invoke-interface {v6}, LY/m;->s()V

    .line 87
    :goto_c
    invoke-static {v6}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v1

    .line 88
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v1, v13, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 89
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v1, v14, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 90
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    .line 91
    invoke-interface {v1}, LY/m;->e()Z

    move-result v13

    if-nez v13, :cond_1f

    invoke-interface {v1}, LY/m;->D()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_20

    .line 92
    :cond_1f
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v1, v13}, LY/m;->u(Ljava/lang/Object;)V

    .line 93
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v1, v13, v4}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 94
    :cond_20
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v1, v9, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 95
    sget-object v1, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 96
    invoke-interface {v11, v6, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    invoke-interface {v6}, LY/m;->x()V

    move-object/from16 v1, p0

    move/from16 v4, p4

    move v9, v12

    goto/16 :goto_b

    .line 98
    :cond_21
    invoke-interface {v6}, LY/m;->O()V

    .line 99
    invoke-interface {v6}, LY/m;->x()V

    const v1, -0x38495b4b

    .line 100
    invoke-interface {v6, v1}, LY/m;->V(I)V

    .line 101
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v1

    .line 102
    sget-object v4, LY/m;->a:LY/m$a;

    invoke-virtual {v4}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v1, v4, :cond_22

    .line 103
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AdaptiveComposableKt$AdaptiveComposable$2$selectedIndex$2$1;

    invoke-direct {v1, v8, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AdaptiveComposableKt$AdaptiveComposable$2$selectedIndex$2$1;-><init>(Li0/E;LY/C0;)V

    invoke-static {v1}, LY/U1;->d(Lie/a;)LY/h2;

    move-result-object v1

    .line 104
    invoke-interface {v6, v1}, LY/m;->u(Ljava/lang/Object;)V

    .line 105
    :cond_22
    check-cast v1, LY/h2;

    invoke-interface {v6}, LY/m;->O()V

    .line 106
    sget-object v4, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    sget-object v5, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v5}, Ll0/e$a;->e()Ll0/e;

    move-result-object v7

    invoke-interface {v0, v4, v7}, LC/c;->b(Landroidx/compose/ui/e;Ll0/e;)Landroidx/compose/ui/e;

    move-result-object v0

    .line 107
    invoke-virtual {v5}, Ll0/e$a;->o()Ll0/e;

    move-result-object v4

    const/4 v11, 0x0

    .line 108
    invoke-static {v4, v11}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    move-result-object v4

    .line 109
    invoke-static {v6, v11}, LY/h;->a(LY/m;I)I

    move-result v5

    .line 110
    invoke-interface {v6}, LY/m;->r()LY/I;

    move-result-object v7

    .line 111
    invoke-static {v6, v0}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    .line 112
    sget-object v8, LK0/g;->M:LK0/g$a;

    invoke-virtual {v8}, LK0/g$a;->a()Lie/a;

    move-result-object v9

    .line 113
    invoke-interface {v6}, LY/m;->j()LY/d;

    move-result-object v11

    if-nez v11, :cond_23

    invoke-static {}, LY/h;->d()V

    .line 114
    :cond_23
    invoke-interface {v6}, LY/m;->I()V

    .line 115
    invoke-interface {v6}, LY/m;->e()Z

    move-result v11

    if-eqz v11, :cond_24

    .line 116
    invoke-interface {v6, v9}, LY/m;->h(Lie/a;)V

    goto :goto_d

    .line 117
    :cond_24
    invoke-interface {v6}, LY/m;->s()V

    .line 118
    :goto_d
    invoke-static {v6}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v9

    .line 119
    invoke-virtual {v8}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v11

    invoke-static {v9, v4, v11}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 120
    invoke-virtual {v8}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v9, v7, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 121
    invoke-virtual {v8}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    .line 122
    invoke-interface {v9}, LY/m;->e()Z

    move-result v7

    if-nez v7, :cond_25

    invoke-interface {v9}, LY/m;->D()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v7, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_26

    .line 123
    :cond_25
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v9, v7}, LY/m;->u(Ljava/lang/Object;)V

    .line 124
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v9, v5, v4}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 125
    :cond_26
    invoke-virtual {v8}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v9, v0, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 126
    sget-object v0, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 127
    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AdaptiveComposableKt;->AdaptiveComposable$lambda$14$lambda$12(LY/h2;)I

    move-result v0

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v0, v6, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    invoke-interface {v6}, LY/m;->x()V

    .line 129
    invoke-interface {v6}, LY/m;->x()V

    .line 130
    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LY/w;->T()V

    goto/16 :goto_6

    .line 131
    :goto_e
    invoke-interface {v6}, LY/m;->k()LY/B1;

    move-result-object v6

    if-eqz v6, :cond_27

    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AdaptiveComposableKt$AdaptiveComposable$3;

    move-object/from16 v1, p0

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AdaptiveComposableKt$AdaptiveComposable$3;-><init>(LC/I;Landroidx/compose/ui/e;Ljava/util/List;II)V

    invoke-interface {v6, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    :cond_27
    return-void
.end method

.method private static final AdaptiveComposable$lambda$1(LY/C0;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/C0;",
            ")I"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static final AdaptiveComposable$lambda$14$lambda$12(LY/h2;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/h2;",
            ")I"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static final AdaptiveComposable$lambda$2(LY/C0;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/C0;",
            "I)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final synthetic access$AdaptiveComposable$lambda$1(LY/C0;)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AdaptiveComposableKt;->AdaptiveComposable$lambda$1(LY/C0;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$AdaptiveComposable$lambda$2(LY/C0;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AdaptiveComposableKt;->AdaptiveComposable$lambda$2(LY/C0;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
