.class final Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$1$5;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt;->SimpleBottomSheetScaffold(Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LY/m;II)V
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
.field final synthetic $sheetState:Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$1$5;->$sheetState:Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
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

    invoke-virtual {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$1$5;->invoke(Lv/e;LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Lv/e;LY/m;I)V
    .locals 2

    const-string v0, "$this$AnimatedVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.revenuecat.purchases.ui.revenuecatui.composables.SimpleBottomSheetScaffold.<anonymous>.<anonymous> (SimpleBottomSheetScaffold.kt:61)"

    const v1, 0x5e12db0c

    .line 2
    invoke-static {v1, p3, p1, v0}, LY/w;->U(IIILjava/lang/String;)V

    :cond_0
    const p1, 0x1bbfa33a

    invoke-interface {p2, p1}, LY/m;->V(I)V

    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$1$5;->$sheetState:Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;

    invoke-interface {p2, p1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result p1

    iget-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$1$5;->$sheetState:Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;

    .line 3
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_1

    .line 4
    sget-object p1, LY/m;->a:LY/m$a;

    invoke-virtual {p1}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne v0, p1, :cond_2

    .line 5
    :cond_1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$1$5$1$1;

    invoke-direct {v0, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$1$5$1$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;)V

    .line 6
    invoke-interface {p2, v0}, LY/m;->u(Ljava/lang/Object;)V

    .line 7
    :cond_2
    check-cast v0, Lie/a;

    invoke-interface {p2}, LY/m;->O()V

    const/4 p1, 0x1

    const/4 p3, 0x0

    invoke-static {p3, v0, p2, p3, p1}, Le/a;->a(ZLie/a;LY/m;II)V

    .line 8
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$1$5;->$sheetState:Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;

    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;->getContent()Lkotlin/jvm/functions/Function2;

    move-result-object p1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LY/w;->T()V

    :cond_3
    return-void
.end method
