.class final Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/ComposableSingletons$RestorePurchasesDialogKt$lambda-2$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/ComposableSingletons$RestorePurchasesDialogKt;
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


# static fields
.field public static final INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/ComposableSingletons$RestorePurchasesDialogKt$lambda-2$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/ComposableSingletons$RestorePurchasesDialogKt$lambda-2$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/ComposableSingletons$RestorePurchasesDialogKt$lambda-2$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/ComposableSingletons$RestorePurchasesDialogKt$lambda-2$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/ComposableSingletons$RestorePurchasesDialogKt$lambda-2$1;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 3
    .line 4
    .line 5
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

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/ComposableSingletons$RestorePurchasesDialogKt$lambda-2$1;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 10

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 2
    invoke-interface {p1}, LY/m;->i()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p1}, LY/m;->K()V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.ComposableSingletons$RestorePurchasesDialogKt.lambda-2.<anonymous> (RestorePurchasesDialog.kt:62)"

    const v2, 0xeb8997c

    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_2
    sget-object p2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, v1}, Landroidx/compose/foundation/layout/s;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p2

    .line 6
    sget-object v0, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v0}, Ll0/e$a;->g()Ll0/e$b;

    move-result-object v0

    .line 7
    sget-object v1, LC/b;->a:LC/b;

    invoke-virtual {v1}, LC/b;->b()LC/b$f;

    move-result-object v1

    const/16 v2, 0x36

    .line 8
    invoke-static {v1, v0, p1, v2}, LC/g;->a(LC/b$m;Ll0/e$b;LY/m;I)LI0/B;

    move-result-object v0

    const/4 v1, 0x0

    .line 9
    invoke-static {p1, v1}, LY/h;->a(LY/m;I)I

    move-result v1

    .line 10
    invoke-interface {p1}, LY/m;->r()LY/I;

    move-result-object v2

    .line 11
    invoke-static {p1, p2}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p2

    .line 12
    sget-object v3, LK0/g;->M:LK0/g$a;

    invoke-virtual {v3}, LK0/g$a;->a()Lie/a;

    move-result-object v4

    .line 13
    invoke-interface {p1}, LY/m;->j()LY/d;

    move-result-object v5

    if-nez v5, :cond_3

    invoke-static {}, LY/h;->d()V

    .line 14
    :cond_3
    invoke-interface {p1}, LY/m;->I()V

    .line 15
    invoke-interface {p1}, LY/m;->e()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 16
    invoke-interface {p1, v4}, LY/m;->h(Lie/a;)V

    goto :goto_1

    .line 17
    :cond_4
    invoke-interface {p1}, LY/m;->s()V

    .line 18
    :goto_1
    invoke-static {p1}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v4

    .line 19
    invoke-virtual {v3}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v4, v0, v5}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 20
    invoke-virtual {v3}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v4, v2, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 21
    invoke-virtual {v3}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    .line 22
    invoke-interface {v4}, LY/m;->e()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-interface {v4}, LY/m;->D()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 23
    :cond_5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v4, v2}, LY/m;->u(Ljava/lang/Object;)V

    .line 24
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v1, v0}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 25
    :cond_6
    invoke-virtual {v3}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v4, p2, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 26
    sget-object p2, LC/j;->a:LC/j;

    const/4 v8, 0x0

    const/16 v9, 0x1f

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    move-object v7, p1

    .line 27
    invoke-static/range {v0 .. v9}, LU/K;->a(Landroidx/compose/ui/e;JFJILY/m;II)V

    .line 28
    invoke-interface {v7}, LY/m;->x()V

    .line 29
    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LY/w;->T()V

    :cond_7
    return-void
.end method
