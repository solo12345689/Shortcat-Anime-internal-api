.class final Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/NoActiveUserManagementViewKt$ContentUnavailableView$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/NoActiveUserManagementViewKt;->ContentUnavailableView(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/e;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lkotlin/jvm/functions/Function2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LTd/L;",
        "invoke",
        "(LY/m;I)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $description:Ljava/lang/String;

.field final synthetic $title:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/NoActiveUserManagementViewKt$ContentUnavailableView$1;->$title:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/NoActiveUserManagementViewKt$ContentUnavailableView$1;->$description:Ljava/lang/String;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/NoActiveUserManagementViewKt$ContentUnavailableView$1;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 2
    invoke-interface {v6}, LY/m;->i()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {v6}, LY/m;->K()V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.ContentUnavailableView.<anonymous> (NoActiveUserManagementView.kt:118)"

    const v4, -0x2ffddf4e    # -8.7327232E9f

    invoke-static {v4, v1, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_2
    sget-object v9, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 6
    invoke-static {v9, v3, v1, v2}, Landroidx/compose/foundation/layout/s;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    .line 7
    sget-object v26, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterUIConstants;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterUIConstants;

    invoke-virtual/range {v26 .. v26}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterUIConstants;->getContentUnavailableViewPaddingVertical-D9Ej5fM()F

    move-result v2

    .line 8
    invoke-virtual/range {v26 .. v26}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterUIConstants;->getContentUnavailableViewPaddingHorizontal-D9Ej5fM()F

    move-result v3

    .line 9
    invoke-static {v1, v3, v2}, Landroidx/compose/foundation/layout/p;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    .line 10
    sget-object v2, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v2}, Ll0/e$a;->g()Ll0/e$b;

    move-result-object v2

    .line 11
    iget-object v12, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/NoActiveUserManagementViewKt$ContentUnavailableView$1;->$title:Ljava/lang/String;

    iget-object v13, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/NoActiveUserManagementViewKt$ContentUnavailableView$1;->$description:Ljava/lang/String;

    .line 12
    sget-object v3, LC/b;->a:LC/b;

    invoke-virtual {v3}, LC/b;->h()LC/b$m;

    move-result-object v3

    const/16 v4, 0x30

    .line 13
    invoke-static {v3, v2, v6, v4}, LC/g;->a(LC/b$m;Ll0/e$b;LY/m;I)LI0/B;

    move-result-object v2

    const/4 v3, 0x0

    .line 14
    invoke-static {v6, v3}, LY/h;->a(LY/m;I)I

    move-result v3

    .line 15
    invoke-interface {v6}, LY/m;->r()LY/I;

    move-result-object v4

    .line 16
    invoke-static {v6, v1}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    .line 17
    sget-object v5, LK0/g;->M:LK0/g$a;

    invoke-virtual {v5}, LK0/g$a;->a()Lie/a;

    move-result-object v7

    .line 18
    invoke-interface {v6}, LY/m;->j()LY/d;

    move-result-object v8

    if-nez v8, :cond_3

    invoke-static {}, LY/h;->d()V

    .line 19
    :cond_3
    invoke-interface {v6}, LY/m;->I()V

    .line 20
    invoke-interface {v6}, LY/m;->e()Z

    move-result v8

    if-eqz v8, :cond_4

    .line 21
    invoke-interface {v6, v7}, LY/m;->h(Lie/a;)V

    goto :goto_1

    .line 22
    :cond_4
    invoke-interface {v6}, LY/m;->s()V

    .line 23
    :goto_1
    invoke-static {v6}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v7

    .line 24
    invoke-virtual {v5}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v7, v2, v8}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 25
    invoke-virtual {v5}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v7, v4, v2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 26
    invoke-virtual {v5}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    .line 27
    invoke-interface {v7}, LY/m;->e()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-interface {v7}, LY/m;->D()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v4, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    .line 28
    :cond_5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v7, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 29
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v7, v3, v2}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 30
    :cond_6
    invoke-virtual {v5}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v7, v1, v2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 31
    sget-object v1, LC/j;->a:LC/j;

    .line 32
    invoke-static {}, Lcom/revenuecat/purchases/ui/revenuecatui/icons/InfoKt;->getInfo()Lx0/d;

    move-result-object v1

    .line 33
    sget-object v14, LU/D;->a:LU/D;

    sget v15, LU/D;->b:I

    invoke-virtual {v14, v6, v15}, LU/D;->a(LY/m;I)LU/l;

    move-result-object v2

    invoke-virtual {v2}, LU/l;->w()J

    move-result-wide v4

    .line 34
    invoke-virtual/range {v26 .. v26}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterUIConstants;->getContentUnavailableIconSize-D9Ej5fM()F

    move-result v2

    invoke-static {v9, v2}, Landroidx/compose/foundation/layout/s;->r(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v3

    const/16 v7, 0x1b0

    const/4 v8, 0x0

    const/4 v2, 0x0

    .line 35
    invoke-static/range {v1 .. v8}, LU/B;->b(Lx0/d;Ljava/lang/String;Landroidx/compose/ui/e;JLY/m;II)V

    move-object v1, v6

    .line 36
    invoke-virtual {v14, v1, v15}, LU/D;->c(LY/m;I)LU/o0;

    move-result-object v2

    invoke-virtual {v2}, LU/o0;->o()LU0/Y0;

    move-result-object v21

    .line 37
    invoke-virtual {v14, v1, v15}, LU/D;->a(LY/m;I)LU/l;

    move-result-object v2

    invoke-virtual {v2}, LU/l;->w()J

    move-result-wide v3

    .line 38
    invoke-virtual/range {v26 .. v26}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterUIConstants;->getContentUnavailableViewPaddingText-D9Ej5fM()F

    move-result v7

    const/16 v10, 0xd

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v5, v9

    const/4 v9, 0x0

    invoke-static/range {v5 .. v11}, Landroidx/compose/foundation/layout/p;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    move-object/from16 v27, v5

    const/16 v24, 0x0

    const v25, 0xfff8

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    move-object v1, v12

    const/4 v12, 0x0

    move-object/from16 v16, v13

    const/4 v13, 0x0

    move-object/from16 v17, v14

    move/from16 v18, v15

    const-wide/16 v14, 0x0

    move-object/from16 v19, v16

    const/16 v16, 0x0

    move-object/from16 v20, v17

    const/16 v17, 0x0

    move/from16 v22, v18

    const/16 v18, 0x0

    move-object/from16 v23, v19

    const/16 v19, 0x0

    move-object/from16 v28, v20

    const/16 v20, 0x0

    move-object/from16 v29, v23

    const/16 v23, 0x30

    move/from16 v30, v22

    move-object/from16 v0, v28

    move-object/from16 v22, p1

    .line 39
    invoke-static/range {v1 .. v25}, LU/j0;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLY0/H;LY0/L;LY0/u;JLg1/k;Lg1/j;JIZIILkotlin/jvm/functions/Function1;LU0/Y0;LY/m;III)V

    move-object/from16 v1, v22

    const v2, -0x3cb9298c

    invoke-interface {v1, v2}, LY/m;->V(I)V

    if-nez v29, :cond_7

    goto :goto_2

    :cond_7
    move/from16 v2, v30

    .line 40
    invoke-virtual {v0, v1, v2}, LU/D;->c(LY/m;I)LU/o0;

    move-result-object v3

    invoke-virtual {v3}, LU/o0;->c()LU0/Y0;

    move-result-object v21

    .line 41
    invoke-virtual {v0, v1, v2}, LU/D;->a(LY/m;I)LU/l;

    move-result-object v0

    invoke-virtual {v0}, LU/l;->w()J

    move-result-wide v3

    .line 42
    sget-object v0, Lg1/j;->b:Lg1/j$a;

    invoke-virtual {v0}, Lg1/j$a;->a()I

    move-result v0

    .line 43
    invoke-virtual/range {v26 .. v26}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterUIConstants;->getContentUnavailableViewPaddingText-D9Ej5fM()F

    move-result v7

    const/16 v10, 0xd

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v5, v27

    invoke-static/range {v5 .. v11}, Landroidx/compose/foundation/layout/p;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    .line 44
    invoke-static {v0}, Lg1/j;->h(I)Lg1/j;

    move-result-object v13

    const/16 v24, 0x0

    const v25, 0xfdf8

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x30

    move-object/from16 v22, v1

    move-object/from16 v1, v29

    .line 45
    invoke-static/range {v1 .. v25}, LU/j0;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLY0/H;LY0/L;LY0/u;JLg1/k;Lg1/j;JIZIILkotlin/jvm/functions/Function1;LU0/Y0;LY/m;III)V

    .line 46
    :goto_2
    invoke-interface/range {p1 .. p1}, LY/m;->O()V

    .line 47
    invoke-interface/range {p1 .. p1}, LY/m;->x()V

    .line 48
    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, LY/w;->T()V

    :cond_8
    return-void
.end method
