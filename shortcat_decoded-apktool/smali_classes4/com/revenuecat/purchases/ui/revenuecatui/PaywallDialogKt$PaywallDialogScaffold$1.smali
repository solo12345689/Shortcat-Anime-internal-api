.class final Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogScaffold$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt;->PaywallDialogScaffold(Lie/a;Lkotlin/jvm/functions/Function2;LY/m;I)V
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
.field final synthetic $content:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2;"
        }
    .end annotation
.end field

.field final synthetic $dialogBottomPadding:F


# direct methods
.method constructor <init>(FLkotlin/jvm/functions/Function2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Lkotlin/jvm/functions/Function2;",
            ")V"
        }
    .end annotation

    .line 1
    iput p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogScaffold$1;->$dialogBottomPadding:F

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogScaffold$1;->$content:Lkotlin/jvm/functions/Function2;

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

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogScaffold$1;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v13, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 2
    invoke-interface {v13}, LY/m;->i()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {v13}, LY/m;->K()V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.revenuecat.purchases.ui.revenuecatui.PaywallDialogScaffold.<anonymous> (PaywallDialog.kt:166)"

    const v4, 0x1ec15bbc

    invoke-static {v4, v1, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_2
    sget-object v1, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    .line 6
    invoke-static {v1, v2, v4, v3}, Landroidx/compose/foundation/layout/s;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v2, 0x0

    .line 7
    invoke-static {v13, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt;->access$getDialogMaxHeightPercentage(LY/m;I)F

    move-result v2

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/s;->c(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    .line 8
    sget-object v2, Ls0/r0;->b:Ls0/r0$a;

    invoke-virtual {v2}, Ls0/r0$a;->a()J

    move-result-wide v5

    const/16 v11, 0xe

    const/4 v12, 0x0

    const v7, 0x3ecccccd    # 0.4f

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v5 .. v12}, Ls0/r0;->q(JFFFFILjava/lang/Object;)J

    move-result-wide v7

    .line 9
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogScaffold$1$1;

    iget v3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogScaffold$1;->$dialogBottomPadding:F

    iget-object v5, v0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogScaffold$1;->$content:Lkotlin/jvm/functions/Function2;

    invoke-direct {v2, v3, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogKt$PaywallDialogScaffold$1$1;-><init>(FLkotlin/jvm/functions/Function2;)V

    const/16 v3, 0x36

    const v5, 0x2f1cb2cb

    invoke-static {v5, v4, v2, v13, v3}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    move-result-object v12

    const/high16 v14, 0x30180000

    const/16 v15, 0x1be

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    .line 10
    invoke-static/range {v1 .. v15}, LU/P;->a(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;IJJLC/P;Lie/o;LY/m;II)V

    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LY/w;->T()V

    :cond_3
    return-void
.end method
