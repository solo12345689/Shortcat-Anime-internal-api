.class public final Lcom/revenuecat/purchases/ui/revenuecatui/composables/ConsistentPackageContentViewKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a9\u0010\u0006\u001a\u00020\u00042\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00082\u0006\u0010\n\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;",
        "state",
        "Lkotlin/Function1;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;",
        "LTd/L;",
        "creator",
        "ConsistentPackageContentView",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lie/o;LY/m;I)V",
        "",
        "packages",
        "selected",
        "(Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;Lie/o;LY/m;I)V",
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
.method public static final ConsistentPackageContentView(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lie/o;LY/m;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;",
            "Lie/o;",
            "LY/m;",
            "I)V"
        }
    .end annotation

    const-string v0, "state"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "creator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x1dc7817b

    .line 1
    invoke-interface {p2, v0}, LY/m;->g(I)LY/m;

    move-result-object p2

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-interface {p2, p0}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_3

    invoke-interface {p2, p1}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_5

    invoke-interface {p2}, LY/m;->i()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    .line 2
    :cond_4
    invoke-interface {p2}, LY/m;->K()V

    goto :goto_4

    .line 3
    :cond_5
    :goto_3
    invoke-static {}, LY/w;->L()Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, -0x1

    const-string v3, "com.revenuecat.purchases.ui.revenuecatui.composables.ConsistentPackageContentView (ConsistentPackageContentView.kt:14)"

    invoke-static {v0, v1, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 4
    :cond_6
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;->getTemplateConfiguration()Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration;->getPackages()Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageConfiguration;->getAll()Ljava/util/List;

    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;->getSelectedPackage()LY/C0;

    move-result-object v2

    invoke-interface {v2}, LY/C0;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;

    shl-int/lit8 v1, v1, 0x3

    and-int/lit16 v1, v1, 0x380

    .line 6
    invoke-static {v0, v2, p1, p2, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ConsistentPackageContentViewKt;->ConsistentPackageContentView(Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;Lie/o;LY/m;I)V

    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LY/w;->T()V

    .line 7
    :cond_7
    :goto_4
    invoke-interface {p2}, LY/m;->k()LY/B1;

    move-result-object p2

    if-eqz p2, :cond_8

    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ConsistentPackageContentViewKt$ConsistentPackageContentView$1;

    invoke-direct {v0, p0, p1, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ConsistentPackageContentViewKt$ConsistentPackageContentView$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lie/o;I)V

    invoke-interface {p2, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    :cond_8
    return-void
.end method

.method public static final ConsistentPackageContentView(Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;Lie/o;LY/m;I)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;",
            ">;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;",
            "Lie/o;",
            "LY/m;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p4

    const-string v4, "packages"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "selected"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "creator"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, -0x71355878

    move-object/from16 v5, p3

    .line 8
    invoke-interface {v5, v4}, LY/m;->g(I)LY/m;

    move-result-object v5

    and-int/lit8 v6, v3, 0x6

    if-nez v6, :cond_1

    invoke-interface {v5, v0}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v3

    goto :goto_1

    :cond_1
    move v6, v3

    :goto_1
    and-int/lit8 v7, v3, 0x30

    if-nez v7, :cond_3

    invoke-interface {v5, v1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_3
    and-int/lit16 v7, v3, 0x180

    if-nez v7, :cond_5

    invoke-interface {v5, v2}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v6, v7

    :cond_5
    and-int/lit16 v7, v6, 0x93

    const/16 v8, 0x92

    if-ne v7, v8, :cond_7

    invoke-interface {v5}, LY/m;->i()Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_4

    .line 9
    :cond_6
    invoke-interface {v5}, LY/m;->K()V

    goto/16 :goto_9

    .line 10
    :cond_7
    :goto_4
    invoke-static {}, LY/w;->L()Z

    move-result v7

    if-eqz v7, :cond_8

    const/4 v7, -0x1

    const-string v8, "com.revenuecat.purchases.ui.revenuecatui.composables.ConsistentPackageContentView (ConsistentPackageContentView.kt:31)"

    invoke-static {v4, v6, v7, v8}, LY/w;->U(IIILjava/lang/String;)V

    .line 11
    :cond_8
    sget-object v4, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 12
    sget-object v7, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v7}, Ll0/e$a;->o()Ll0/e;

    move-result-object v7

    const/4 v8, 0x0

    .line 13
    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    move-result-object v7

    .line 14
    invoke-static {v5, v8}, LY/h;->a(LY/m;I)I

    move-result v9

    .line 15
    invoke-interface {v5}, LY/m;->r()LY/I;

    move-result-object v10

    .line 16
    invoke-static {v5, v4}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v4

    .line 17
    sget-object v11, LK0/g;->M:LK0/g$a;

    invoke-virtual {v11}, LK0/g$a;->a()Lie/a;

    move-result-object v12

    .line 18
    invoke-interface {v5}, LY/m;->j()LY/d;

    move-result-object v13

    if-nez v13, :cond_9

    invoke-static {}, LY/h;->d()V

    .line 19
    :cond_9
    invoke-interface {v5}, LY/m;->I()V

    .line 20
    invoke-interface {v5}, LY/m;->e()Z

    move-result v13

    if-eqz v13, :cond_a

    .line 21
    invoke-interface {v5, v12}, LY/m;->h(Lie/a;)V

    goto :goto_5

    .line 22
    :cond_a
    invoke-interface {v5}, LY/m;->s()V

    .line 23
    :goto_5
    invoke-static {v5}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v12

    .line 24
    invoke-virtual {v11}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v13

    invoke-static {v12, v7, v13}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 25
    invoke-virtual {v11}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v12, v10, v7}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 26
    invoke-virtual {v11}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    .line 27
    invoke-interface {v12}, LY/m;->e()Z

    move-result v10

    if-nez v10, :cond_b

    invoke-interface {v12}, LY/m;->D()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v10, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_c

    .line 28
    :cond_b
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v12, v10}, LY/m;->u(Ljava/lang/Object;)V

    .line 29
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v12, v9, v7}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 30
    :cond_c
    invoke-virtual {v11}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v12, v4, v7}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 31
    sget-object v4, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    const v7, 0x1fc814e1

    .line 32
    invoke-interface {v5, v7}, LY/m;->V(I)V

    .line 33
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_11

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;

    .line 34
    sget-object v10, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    const/4 v11, 0x0

    .line 35
    invoke-static {v10, v11}, Lp0/a;->a(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v10

    .line 36
    sget-object v11, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v11}, Ll0/e$a;->e()Ll0/e;

    move-result-object v12

    invoke-interface {v4, v10, v12}, LC/c;->b(Landroidx/compose/ui/e;Ll0/e;)Landroidx/compose/ui/e;

    move-result-object v10

    .line 37
    invoke-virtual {v11}, Ll0/e$a;->o()Ll0/e;

    move-result-object v11

    .line 38
    invoke-static {v11, v8}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    move-result-object v11

    .line 39
    invoke-static {v5, v8}, LY/h;->a(LY/m;I)I

    move-result v12

    .line 40
    invoke-interface {v5}, LY/m;->r()LY/I;

    move-result-object v13

    .line 41
    invoke-static {v5, v10}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v10

    .line 42
    sget-object v14, LK0/g;->M:LK0/g$a;

    invoke-virtual {v14}, LK0/g$a;->a()Lie/a;

    move-result-object v15

    .line 43
    invoke-interface {v5}, LY/m;->j()LY/d;

    move-result-object v16

    if-nez v16, :cond_d

    invoke-static {}, LY/h;->d()V

    .line 44
    :cond_d
    invoke-interface {v5}, LY/m;->I()V

    .line 45
    invoke-interface {v5}, LY/m;->e()Z

    move-result v16

    if-eqz v16, :cond_e

    .line 46
    invoke-interface {v5, v15}, LY/m;->h(Lie/a;)V

    goto :goto_7

    .line 47
    :cond_e
    invoke-interface {v5}, LY/m;->s()V

    .line 48
    :goto_7
    invoke-static {v5}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v15

    .line 49
    invoke-virtual {v14}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v15, v11, v8}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 50
    invoke-virtual {v14}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v15, v13, v8}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 51
    invoke-virtual {v14}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    .line 52
    invoke-interface {v15}, LY/m;->e()Z

    move-result v11

    if-nez v11, :cond_f

    invoke-interface {v15}, LY/m;->D()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v11, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_10

    .line 53
    :cond_f
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v15, v11}, LY/m;->u(Ljava/lang/Object;)V

    .line 54
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v15, v11, v8}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 55
    :cond_10
    invoke-virtual {v14}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v15, v10, v8}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 56
    sget-object v8, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    shr-int/lit8 v8, v6, 0x3

    and-int/lit8 v8, v8, 0x70

    .line 57
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v2, v9, v5, v8}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    invoke-interface {v5}, LY/m;->x()V

    const/4 v8, 0x0

    goto/16 :goto_6

    .line 59
    :cond_11
    invoke-interface {v5}, LY/m;->O()V

    .line 60
    sget-object v7, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 61
    sget-object v8, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v8}, Ll0/e$a;->e()Ll0/e;

    move-result-object v9

    invoke-interface {v4, v7, v9}, LC/c;->b(Landroidx/compose/ui/e;Ll0/e;)Landroidx/compose/ui/e;

    move-result-object v4

    .line 62
    invoke-virtual {v8}, Ll0/e$a;->o()Ll0/e;

    move-result-object v7

    const/4 v8, 0x0

    .line 63
    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    move-result-object v7

    .line 64
    invoke-static {v5, v8}, LY/h;->a(LY/m;I)I

    move-result v8

    .line 65
    invoke-interface {v5}, LY/m;->r()LY/I;

    move-result-object v9

    .line 66
    invoke-static {v5, v4}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v4

    .line 67
    sget-object v10, LK0/g;->M:LK0/g$a;

    invoke-virtual {v10}, LK0/g$a;->a()Lie/a;

    move-result-object v11

    .line 68
    invoke-interface {v5}, LY/m;->j()LY/d;

    move-result-object v12

    if-nez v12, :cond_12

    invoke-static {}, LY/h;->d()V

    .line 69
    :cond_12
    invoke-interface {v5}, LY/m;->I()V

    .line 70
    invoke-interface {v5}, LY/m;->e()Z

    move-result v12

    if-eqz v12, :cond_13

    .line 71
    invoke-interface {v5, v11}, LY/m;->h(Lie/a;)V

    goto :goto_8

    .line 72
    :cond_13
    invoke-interface {v5}, LY/m;->s()V

    .line 73
    :goto_8
    invoke-static {v5}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v11

    .line 74
    invoke-virtual {v10}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v12

    invoke-static {v11, v7, v12}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 75
    invoke-virtual {v10}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v11, v9, v7}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 76
    invoke-virtual {v10}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    .line 77
    invoke-interface {v11}, LY/m;->e()Z

    move-result v9

    if-nez v9, :cond_14

    invoke-interface {v11}, LY/m;->D()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_15

    .line 78
    :cond_14
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v11, v9}, LY/m;->u(Ljava/lang/Object;)V

    .line 79
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v11, v8, v7}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 80
    :cond_15
    invoke-virtual {v10}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v11, v4, v7}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 81
    sget-object v4, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    shr-int/lit8 v4, v6, 0x3

    and-int/lit8 v4, v4, 0x7e

    .line 82
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v1, v5, v4}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    invoke-interface {v5}, LY/m;->x()V

    .line 84
    invoke-interface {v5}, LY/m;->x()V

    .line 85
    invoke-static {}, LY/w;->L()Z

    move-result v4

    if-eqz v4, :cond_16

    invoke-static {}, LY/w;->T()V

    .line 86
    :cond_16
    :goto_9
    invoke-interface {v5}, LY/m;->k()LY/B1;

    move-result-object v4

    if-eqz v4, :cond_17

    new-instance v5, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ConsistentPackageContentViewKt$ConsistentPackageContentView$3;

    invoke-direct {v5, v0, v1, v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ConsistentPackageContentViewKt$ConsistentPackageContentView$3;-><init>(Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;Lie/o;I)V

    invoke-interface {v4, v5}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    :cond_17
    return-void
.end method
