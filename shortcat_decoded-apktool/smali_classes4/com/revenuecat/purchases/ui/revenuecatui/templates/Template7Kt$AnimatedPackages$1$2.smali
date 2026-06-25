.class final Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template7Kt$AnimatedPackages$1$2;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template7Kt;->AnimatedPackages(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;ZLjava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;LY/m;II)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lv/e;",
        "LTd/L;",
        "invoke",
        "(Lv/e;LY/m;I)V",
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
.field final synthetic $colors:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;

.field final synthetic $packages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;

.field final synthetic $viewModel:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;


# direct methods
.method constructor <init>(Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;",
            ">;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template7Kt$AnimatedPackages$1$2;->$packages:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template7Kt$AnimatedPackages$1$2;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template7Kt$AnimatedPackages$1$2;->$viewModel:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template7Kt$AnimatedPackages$1$2;->$colors:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;

    .line 8
    .line 9
    const/4 p1, 0x3

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lv/e;

    check-cast p2, LY/m;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template7Kt$AnimatedPackages$1$2;->invoke(Lv/e;LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Lv/e;LY/m;I)V
    .locals 9

    const-string v0, "$this$AnimatedVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.revenuecat.purchases.ui.revenuecatui.templates.AnimatedPackages.<anonymous>.<anonymous> (Template7.kt:475)"

    const v1, 0x1bfe23f3

    .line 2
    invoke-static {v1, p3, p1, v0}, LY/w;->U(IIILjava/lang/String;)V

    .line 3
    :cond_0
    sget-object p1, LC/b;->a:LC/b;

    .line 4
    sget-object p3, Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;

    invoke-virtual {p3}, Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;->getDefaultVerticalSpacing-D9Ej5fM()F

    move-result p3

    .line 5
    sget-object v0, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v0}, Ll0/e$a;->i()Ll0/e$c;

    move-result-object v1

    .line 6
    invoke-virtual {p1, p3, v1}, LC/b;->q(FLl0/e$c;)LC/b$m;

    move-result-object p1

    .line 7
    iget-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template7Kt$AnimatedPackages$1$2;->$packages:Ljava/util/List;

    iget-object v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template7Kt$AnimatedPackages$1$2;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;

    iget-object v4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template7Kt$AnimatedPackages$1$2;->$viewModel:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;

    iget-object v5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template7Kt$AnimatedPackages$1$2;->$colors:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;

    .line 8
    sget-object v1, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 9
    invoke-virtual {v0}, Ll0/e$a;->k()Ll0/e$b;

    move-result-object v0

    const/4 v3, 0x0

    .line 10
    invoke-static {p1, v0, p2, v3}, LC/g;->a(LC/b$m;Ll0/e$b;LY/m;I)LI0/B;

    move-result-object p1

    .line 11
    invoke-static {p2, v3}, LY/h;->a(LY/m;I)I

    move-result v0

    .line 12
    invoke-interface {p2}, LY/m;->r()LY/I;

    move-result-object v3

    .line 13
    invoke-static {p2, v1}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    .line 14
    sget-object v6, LK0/g;->M:LK0/g$a;

    invoke-virtual {v6}, LK0/g$a;->a()Lie/a;

    move-result-object v7

    .line 15
    invoke-interface {p2}, LY/m;->j()LY/d;

    move-result-object v8

    if-nez v8, :cond_1

    invoke-static {}, LY/h;->d()V

    .line 16
    :cond_1
    invoke-interface {p2}, LY/m;->I()V

    .line 17
    invoke-interface {p2}, LY/m;->e()Z

    move-result v8

    if-eqz v8, :cond_2

    .line 18
    invoke-interface {p2, v7}, LY/m;->h(Lie/a;)V

    goto :goto_0

    .line 19
    :cond_2
    invoke-interface {p2}, LY/m;->s()V

    .line 20
    :goto_0
    invoke-static {p2}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v7

    .line 21
    invoke-virtual {v6}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v7, p1, v8}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 22
    invoke-virtual {v6}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object p1

    invoke-static {v7, v3, p1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 23
    invoke-virtual {v6}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object p1

    .line 24
    invoke-interface {v7}, LY/m;->e()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-interface {v7}, LY/m;->D()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v3, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    .line 25
    :cond_3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v7, v3}, LY/m;->u(Ljava/lang/Object;)V

    .line 26
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0, p1}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 27
    :cond_4
    invoke-virtual {v6}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object p1

    invoke-static {v7, v1, p1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 28
    sget-object v1, LC/j;->a:LC/j;

    const p1, 0x58b64c44

    .line 29
    invoke-interface {p2, p1}, LY/m;->V(I)V

    .line 30
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    move-object v3, p3

    check-cast v3, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;

    const/4 v7, 0x6

    move-object v6, p2

    .line 31
    invoke-static/range {v1 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template7Kt;->access$SelectPackageButton(LC/i;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;LY/m;I)V

    goto :goto_1

    :cond_5
    move-object v6, p2

    .line 32
    invoke-interface {v6}, LY/m;->O()V

    .line 33
    invoke-interface {v6}, LY/m;->x()V

    .line 34
    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LY/w;->T()V

    :cond_6
    return-void
.end method
