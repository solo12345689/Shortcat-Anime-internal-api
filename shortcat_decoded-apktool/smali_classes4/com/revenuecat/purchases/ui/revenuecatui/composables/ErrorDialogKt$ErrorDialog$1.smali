.class final Lcom/revenuecat/purchases/ui/revenuecatui/composables/ErrorDialogKt$ErrorDialog$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/composables/ErrorDialogKt;->ErrorDialog(Lie/a;Ljava/lang/String;LY/m;I)V
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
.field final synthetic $dismissRequest:Lie/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lie/a;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lie/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lie/a;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ErrorDialogKt$ErrorDialog$1;->$dismissRequest:Lie/a;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
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

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ErrorDialogKt$ErrorDialog$1;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 14

    move/from16 v0, p2

    and-int/lit8 v1, v0, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    .line 2
    invoke-interface {p1}, LY/m;->i()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p1}, LY/m;->K()V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.composables.ErrorDialog.<anonymous> (ErrorDialog.kt:22)"

    const v3, 0x72f962dc

    invoke-static {v3, v0, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_2
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ErrorDialogKt$ErrorDialog$1;->$dismissRequest:Lie/a;

    sget-object v2, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ComposableSingletons$ErrorDialogKt;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/ComposableSingletons$ErrorDialogKt;

    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ComposableSingletons$ErrorDialogKt;->getLambda-1$revenuecatui_defaultsBc8Release()Lie/o;

    move-result-object v10

    const/high16 v12, 0x30000000

    const/16 v13, 0x1fe

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v11, p1

    .line 6
    invoke-static/range {v1 .. v13}, LU/k;->c(Lie/a;Landroidx/compose/ui/e;ZLs0/E1;LU/h;LU/j;Lx/g;LC/A;LB/m;Lie/o;LY/m;II)V

    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LY/w;->T()V

    :cond_3
    return-void
.end method
