.class final Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallViewKt$DefaultPaywallView$2$2;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallViewKt;->DefaultPaywallView(Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;Lkotlin/jvm/functions/Function1;Lie/a;Lie/a;Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewOverrides;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lie/o;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LC/A;",
        "paddingValues",
        "LTd/L;",
        "invoke",
        "(LC/A;LY/m;I)V",
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
.field final synthetic $appIconBitmap$delegate:LY/C0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY/C0;"
        }
    .end annotation
.end field

.field final synthetic $appName:Ljava/lang/String;

.field final synthetic $foregroundOnAccentColor:J

.field final synthetic $mainColor:J

.field final synthetic $onSelectPackage:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic $packages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $selectedPackage:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;

.field final synthetic $shouldShowWarning:Z

.field final synthetic $warningToShow:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;


# direct methods
.method constructor <init>(Ljava/util/List;JJLcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;Lkotlin/jvm/functions/Function1;ZLcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;Ljava/lang/String;LY/C0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;",
            ">;JJ",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;",
            "Lkotlin/jvm/functions/Function1;",
            "Z",
            "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;",
            "Ljava/lang/String;",
            "LY/C0;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallViewKt$DefaultPaywallView$2$2;->$packages:Ljava/util/List;

    .line 2
    .line 3
    iput-wide p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallViewKt$DefaultPaywallView$2$2;->$mainColor:J

    .line 4
    .line 5
    iput-wide p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallViewKt$DefaultPaywallView$2$2;->$foregroundOnAccentColor:J

    .line 6
    .line 7
    iput-object p6, p0, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallViewKt$DefaultPaywallView$2$2;->$selectedPackage:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;

    .line 8
    .line 9
    iput-object p7, p0, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallViewKt$DefaultPaywallView$2$2;->$onSelectPackage:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    iput-boolean p8, p0, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallViewKt$DefaultPaywallView$2$2;->$shouldShowWarning:Z

    .line 12
    .line 13
    iput-object p9, p0, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallViewKt$DefaultPaywallView$2$2;->$warningToShow:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;

    .line 14
    .line 15
    iput-object p10, p0, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallViewKt$DefaultPaywallView$2$2;->$appName:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p11, p0, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallViewKt$DefaultPaywallView$2$2;->$appIconBitmap$delegate:LY/C0;

    .line 18
    .line 19
    const/4 p1, 0x3

    .line 20
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LC/A;

    check-cast p2, LY/m;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallViewKt$DefaultPaywallView$2$2;->invoke(LC/A;LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LC/A;LY/m;I)V
    .locals 44

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v6, p2

    const-string v2, "paddingValues"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_1

    invoke-interface {v6, v1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p3

    :goto_1
    and-int/lit8 v3, v2, 0x13

    const/16 v4, 0x12

    if-ne v3, v4, :cond_3

    .line 2
    invoke-interface {v6}, LY/m;->i()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    .line 3
    :cond_2
    invoke-interface {v6}, LY/m;->K()V

    return-void

    .line 4
    :cond_3
    :goto_2
    invoke-static {}, LY/w;->L()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string v4, "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallView.<anonymous>.<anonymous> (DefaultPaywallView.kt:164)"

    const v5, -0x115fe463

    invoke-static {v5, v2, v3, v4}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_4
    sget-object v2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Landroidx/compose/foundation/layout/s;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    .line 6
    sget-object v27, Ll0/e;->a:Ll0/e$a;

    invoke-virtual/range {v27 .. v27}, Ll0/e$a;->m()Ll0/e;

    move-result-object v8

    .line 7
    iget-object v9, v0, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallViewKt$DefaultPaywallView$2$2;->$packages:Ljava/util/List;

    iget-wide v10, v0, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallViewKt$DefaultPaywallView$2$2;->$mainColor:J

    iget-wide v12, v0, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallViewKt$DefaultPaywallView$2$2;->$foregroundOnAccentColor:J

    iget-object v14, v0, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallViewKt$DefaultPaywallView$2$2;->$selectedPackage:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;

    iget-object v15, v0, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallViewKt$DefaultPaywallView$2$2;->$onSelectPackage:Lkotlin/jvm/functions/Function1;

    iget-boolean v3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallViewKt$DefaultPaywallView$2$2;->$shouldShowWarning:Z

    move-wide/from16 v16, v10

    iget-object v10, v0, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallViewKt$DefaultPaywallView$2$2;->$warningToShow:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;

    iget-object v11, v0, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallViewKt$DefaultPaywallView$2$2;->$appName:Ljava/lang/String;

    move-object/from16 v18, v10

    iget-object v10, v0, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallViewKt$DefaultPaywallView$2$2;->$appIconBitmap$delegate:LY/C0;

    move-object/from16 v19, v10

    const/4 v10, 0x0

    .line 8
    invoke-static {v8, v10}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    move-result-object v8

    .line 9
    invoke-static {v6, v10}, LY/h;->a(LY/m;I)I

    move-result v20

    .line 10
    invoke-interface {v6}, LY/m;->r()LY/I;

    move-result-object v10

    .line 11
    invoke-static {v6, v7}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v7

    .line 12
    sget-object v22, LK0/g;->M:LK0/g$a;

    invoke-virtual/range {v22 .. v22}, LK0/g$a;->a()Lie/a;

    move-result-object v4

    .line 13
    invoke-interface {v6}, LY/m;->j()LY/d;

    move-result-object v24

    if-nez v24, :cond_5

    invoke-static {}, LY/h;->d()V

    .line 14
    :cond_5
    invoke-interface {v6}, LY/m;->I()V

    .line 15
    invoke-interface {v6}, LY/m;->e()Z

    move-result v24

    if-eqz v24, :cond_6

    .line 16
    invoke-interface {v6, v4}, LY/m;->h(Lie/a;)V

    goto :goto_3

    .line 17
    :cond_6
    invoke-interface {v6}, LY/m;->s()V

    .line 18
    :goto_3
    invoke-static {v6}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v4

    .line 19
    invoke-virtual/range {v22 .. v22}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v4, v8, v5}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 20
    invoke-virtual/range {v22 .. v22}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v4, v10, v5}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 21
    invoke-virtual/range {v22 .. v22}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    .line 22
    invoke-interface {v4}, LY/m;->e()Z

    move-result v8

    if-nez v8, :cond_7

    invoke-interface {v4}, LY/m;->D()Ljava/lang/Object;

    move-result-object v8

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    .line 23
    :cond_7
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v4, v8}, LY/m;->u(Ljava/lang/Object;)V

    .line 24
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v4, v8, v5}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 25
    :cond_8
    invoke-virtual/range {v22 .. v22}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v4, v7, v5}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 26
    sget-object v4, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v7, 0x0

    .line 27
    invoke-static {v2, v7, v5, v4}, Landroidx/compose/foundation/layout/s;->d(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v8

    .line 28
    sget-object v10, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/ReadableContentWidth;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/ReadableContentWidth;

    invoke-virtual {v10}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/ReadableContentWidth;->getDp-D9Ej5fM()F

    move-result v10

    invoke-static {v8, v7, v10, v5, v4}, Landroidx/compose/foundation/layout/s;->x(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v8

    .line 29
    sget-object v4, LC/b;->a:LC/b;

    invoke-virtual {v4}, LC/b;->h()LC/b$m;

    move-result-object v5

    .line 30
    invoke-virtual/range {v27 .. v27}, Ll0/e$a;->k()Ll0/e$b;

    move-result-object v7

    const/4 v10, 0x0

    .line 31
    invoke-static {v5, v7, v6, v10}, LC/g;->a(LC/b$m;Ll0/e$b;LY/m;I)LI0/B;

    move-result-object v5

    .line 32
    invoke-static {v6, v10}, LY/h;->a(LY/m;I)I

    move-result v7

    .line 33
    invoke-interface {v6}, LY/m;->r()LY/I;

    move-result-object v10

    .line 34
    invoke-static {v6, v8}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v8

    .line 35
    invoke-virtual/range {v22 .. v22}, LK0/g$a;->a()Lie/a;

    move-result-object v0

    .line 36
    invoke-interface {v6}, LY/m;->j()LY/d;

    move-result-object v20

    if-nez v20, :cond_9

    invoke-static {}, LY/h;->d()V

    .line 37
    :cond_9
    invoke-interface {v6}, LY/m;->I()V

    .line 38
    invoke-interface {v6}, LY/m;->e()Z

    move-result v20

    if-eqz v20, :cond_a

    .line 39
    invoke-interface {v6, v0}, LY/m;->h(Lie/a;)V

    goto :goto_4

    .line 40
    :cond_a
    invoke-interface {v6}, LY/m;->s()V

    .line 41
    :goto_4
    invoke-static {v6}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v0

    .line 42
    invoke-virtual/range {v22 .. v22}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v0, v5, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 43
    invoke-virtual/range {v22 .. v22}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v0, v10, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 44
    invoke-virtual/range {v22 .. v22}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    .line 45
    invoke-interface {v0}, LY/m;->e()Z

    move-result v5

    if-nez v5, :cond_b

    invoke-interface {v0}, LY/m;->D()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v5, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_c

    .line 46
    :cond_b
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v0, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 47
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v0, v5, v1}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 48
    :cond_c
    invoke-virtual/range {v22 .. v22}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v0, v8, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 49
    sget-object v0, LC/j;->a:LC/j;

    const/4 v1, 0x0

    const/4 v5, 0x1

    const/4 v7, 0x0

    .line 50
    invoke-static {v2, v7, v5, v1}, Landroidx/compose/foundation/layout/s;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v8

    .line 51
    invoke-virtual/range {v27 .. v27}, Ll0/e$a;->g()Ll0/e$b;

    move-result-object v1

    const/16 v5, 0x18

    int-to-float v5, v5

    .line 52
    invoke-static {v5}, Li1/h;->n(F)F

    move-result v5

    .line 53
    invoke-virtual {v4, v5}, LC/b;->o(F)LC/b$f;

    move-result-object v5

    const/16 v7, 0x36

    .line 54
    invoke-static {v5, v1, v6, v7}, LC/g;->a(LC/b$m;Ll0/e$b;LY/m;I)LI0/B;

    move-result-object v1

    const/4 v10, 0x0

    .line 55
    invoke-static {v6, v10}, LY/h;->a(LY/m;I)I

    move-result v5

    .line 56
    invoke-interface {v6}, LY/m;->r()LY/I;

    move-result-object v7

    .line 57
    invoke-static {v6, v8}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v8

    .line 58
    invoke-virtual/range {v22 .. v22}, LK0/g$a;->a()Lie/a;

    move-result-object v10

    .line 59
    invoke-interface {v6}, LY/m;->j()LY/d;

    move-result-object v20

    if-nez v20, :cond_d

    invoke-static {}, LY/h;->d()V

    .line 60
    :cond_d
    invoke-interface {v6}, LY/m;->I()V

    .line 61
    invoke-interface {v6}, LY/m;->e()Z

    move-result v20

    if-eqz v20, :cond_e

    .line 62
    invoke-interface {v6, v10}, LY/m;->h(Lie/a;)V

    goto :goto_5

    .line 63
    :cond_e
    invoke-interface {v6}, LY/m;->s()V

    .line 64
    :goto_5
    invoke-static {v6}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v10

    move-object/from16 v28, v0

    .line 65
    invoke-virtual/range {v22 .. v22}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v10, v1, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 66
    invoke-virtual/range {v22 .. v22}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v10, v7, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 67
    invoke-virtual/range {v22 .. v22}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    .line 68
    invoke-interface {v10}, LY/m;->e()Z

    move-result v1

    if-nez v1, :cond_f

    invoke-interface {v10}, LY/m;->D()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v1, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    .line 69
    :cond_f
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v10, v1}, LY/m;->u(Ljava/lang/Object;)V

    .line 70
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v10, v1, v0}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 71
    :cond_10
    invoke-virtual/range {v22 .. v22}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v10, v8, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 72
    invoke-interface/range {p1 .. p1}, LC/A;->d()F

    move-result v0

    const/16 v1, 0x20

    int-to-float v1, v1

    .line 73
    invoke-static {v1}, Li1/h;->n(F)F

    move-result v1

    add-float/2addr v0, v1

    .line 74
    invoke-static {v0}, Li1/h;->n(F)F

    move-result v0

    .line 75
    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/s;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    const/4 v10, 0x0

    invoke-static {v0, v6, v10}, LC/K;->a(Landroidx/compose/ui/e;LY/m;I)V

    const v0, 0x46361f65

    invoke-interface {v6, v0}, LY/m;->V(I)V

    if-eqz v3, :cond_11

    .line 76
    sget-object v0, LU/D;->a:LU/D;

    sget v1, LU/D;->b:I

    invoke-virtual {v0, v6, v1}, LU/D;->c(LY/m;I)LU/o0;

    move-result-object v3

    invoke-virtual {v3}, LU/o0;->o()LU0/Y0;

    move-result-object v22

    .line 77
    invoke-virtual {v0, v6, v1}, LU/D;->a(LY/m;I)LU/l;

    move-result-object v0

    invoke-virtual {v0}, LU/l;->w()J

    move-result-wide v0

    .line 78
    sget-object v3, LY0/L;->b:LY0/L$a;

    invoke-virtual {v3}, LY0/L$a;->b()LY0/L;

    move-result-object v3

    .line 79
    sget-object v5, Lg1/j;->b:Lg1/j$a;

    invoke-virtual {v5}, Lg1/j$a;->a()I

    move-result v5

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v10, 0x0

    .line 80
    invoke-static {v2, v10, v8, v7}, Landroidx/compose/foundation/layout/s;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    .line 81
    invoke-static {v5}, Lg1/j;->h(I)Lg1/j;

    move-result-object v5

    const/16 v25, 0x0

    const v26, 0xfdd8

    move-object v8, v2

    .line 82
    const-string v2, "RevenueCat Paywalls"

    move-object v10, v9

    move-object v9, v3

    move-object v3, v7

    const-wide/16 v6, 0x0

    move-object/from16 v20, v8

    const/4 v8, 0x0

    move-object/from16 v23, v10

    const/4 v10, 0x0

    move-wide/from16 v29, v12

    move-object v13, v11

    const-wide/16 v11, 0x0

    move-object/from16 v24, v13

    const/4 v13, 0x0

    move-wide/from16 v31, v16

    move-object/from16 v17, v15

    const-wide/16 v15, 0x0

    move-object/from16 v33, v17

    const/16 v17, 0x0

    move-object/from16 v34, v18

    const/16 v18, 0x0

    move-object/from16 v35, v19

    const/16 v19, 0x0

    move-object/from16 v36, v20

    const/16 v20, 0x0

    const/16 v37, 0x0

    const/16 v21, 0x0

    move-object/from16 v38, v24

    const v24, 0x30036

    move-wide/from16 v39, v29

    move-object/from16 v41, v33

    move-object/from16 v29, v14

    move-object/from16 v30, v23

    move-object/from16 v23, p2

    move-object v14, v5

    move-wide/from16 v42, v0

    move-object v1, v4

    move-wide/from16 v4, v42

    move/from16 v0, v37

    invoke-static/range {v2 .. v26}, LU/j0;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLY0/H;LY0/L;LY0/u;JLg1/k;Lg1/j;JIZIILkotlin/jvm/functions/Function1;LU0/Y0;LY/m;III)V

    move-object/from16 v6, v23

    goto :goto_6

    :cond_11
    move-object/from16 v36, v2

    move-object v1, v4

    move-object/from16 v30, v9

    move v0, v10

    move-object/from16 v38, v11

    move-wide/from16 v39, v12

    move-object/from16 v29, v14

    move-object/from16 v41, v15

    move-wide/from16 v31, v16

    move-object/from16 v34, v18

    move-object/from16 v35, v19

    :goto_6
    invoke-interface {v6}, LY/m;->O()V

    if-eqz v34, :cond_12

    const v2, -0x7f677a2c

    .line 83
    invoke-interface {v6, v2}, LY/m;->V(I)V

    .line 84
    invoke-static {}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallViewKt;->access$getRevenueCatBrandRed$p()J

    move-result-wide v3

    const/16 v7, 0x30

    const/4 v8, 0x4

    const/4 v5, 0x0

    move-object/from16 v2, v34

    invoke-static/range {v2 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallWarningKt;->DefaultPaywallWarning-3IgeMak(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;JLandroidx/compose/ui/e;LY/m;II)V

    .line 85
    invoke-interface {v6}, LY/m;->O()V

    move-object v2, v6

    move-wide/from16 v4, v31

    goto :goto_7

    :cond_12
    const v2, -0x7f65408c

    .line 86
    invoke-interface {v6, v2}, LY/m;->V(I)V

    .line 87
    invoke-static/range {v35 .. v35}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallViewKt;->access$DefaultPaywallView$lambda$3(LY/C0;)Landroid/graphics/Bitmap;

    move-result-object v2

    const/4 v8, 0x0

    const/16 v9, 0x8

    const/4 v6, 0x0

    move-object/from16 v7, p2

    move-wide/from16 v4, v31

    move-object/from16 v3, v38

    .line 88
    invoke-static/range {v2 .. v9}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallViewKt;->access$AppIconSection-cf5BqRc(Landroid/graphics/Bitmap;Ljava/lang/String;JLandroidx/compose/ui/e;LY/m;II)V

    move-object v2, v7

    .line 89
    invoke-interface {v2}, LY/m;->O()V

    .line 90
    :goto_7
    invoke-interface {v2}, LY/m;->x()V

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v9, 0x0

    move-object/from16 v6, v28

    move-object/from16 v7, v36

    .line 91
    invoke-static/range {v6 .. v11}, LC/i;->c(LC/i;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {v3, v2, v0}, LC/K;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 92
    invoke-static/range {v36 .. v36}, LI/a;->a(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v6

    .line 93
    invoke-interface/range {p1 .. p1}, LC/A;->c()F

    move-result v10

    const/4 v11, 0x7

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v12}, Landroidx/compose/foundation/layout/p;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    const/16 v3, 0x10

    int-to-float v3, v3

    .line 94
    invoke-static {v3}, Li1/h;->n(F)F

    move-result v3

    .line 95
    invoke-static {v3}, Landroidx/compose/foundation/layout/p;->a(F)LC/A;

    move-result-object v3

    .line 96
    invoke-virtual/range {v27 .. v27}, Ll0/e$a;->g()Ll0/e$b;

    move-result-object v6

    const/16 v7, 0x8

    int-to-float v7, v7

    .line 97
    invoke-static {v7}, Li1/h;->n(F)F

    move-result v7

    .line 98
    invoke-virtual {v1, v7}, LC/b;->o(F)LC/b$f;

    move-result-object v1

    const v7, 0x7370a6f4

    .line 99
    invoke-interface {v2, v7}, LY/m;->V(I)V

    move-object/from16 v10, v30

    invoke-interface {v2, v10}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v7

    invoke-interface {v2, v4, v5}, LY/m;->d(J)Z

    move-result v8

    or-int/2addr v7, v8

    move-wide/from16 v13, v39

    invoke-interface {v2, v13, v14}, LY/m;->d(J)Z

    move-result v8

    or-int/2addr v7, v8

    move-object/from16 v15, v29

    invoke-interface {v2, v15}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    move-object/from16 v8, v41

    invoke-interface {v2, v8}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v7, v9

    .line 100
    invoke-interface {v2}, LY/m;->D()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_13

    .line 101
    sget-object v7, LY/m;->a:LY/m$a;

    invoke-virtual {v7}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v9, v7, :cond_14

    .line 102
    :cond_13
    new-instance v9, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallViewKt$DefaultPaywallView$2$2$1$1$2$1;

    move-wide v11, v4

    move-object/from16 v16, v8

    invoke-direct/range {v9 .. v16}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallViewKt$DefaultPaywallView$2$2$1$1$2$1;-><init>(Ljava/util/List;JJLcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;Lkotlin/jvm/functions/Function1;)V

    .line 103
    invoke-interface {v2, v9}, LY/m;->u(Ljava/lang/Object;)V

    .line 104
    :cond_14
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-interface {v2}, LY/m;->O()V

    const v11, 0x36180

    const/16 v12, 0xca

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v10, p2

    move-object v5, v1

    move-object v1, v0

    .line 105
    invoke-static/range {v1 .. v12}, LD/b;->a(Landroidx/compose/ui/e;LD/B;LC/A;ZLC/b$m;Ll0/e$b;Lz/n;ZLkotlin/jvm/functions/Function1;LY/m;II)V

    .line 106
    invoke-interface/range {p2 .. p2}, LY/m;->x()V

    .line 107
    invoke-interface/range {p2 .. p2}, LY/m;->x()V

    .line 108
    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-static {}, LY/w;->T()V

    :cond_15
    return-void
.end method
