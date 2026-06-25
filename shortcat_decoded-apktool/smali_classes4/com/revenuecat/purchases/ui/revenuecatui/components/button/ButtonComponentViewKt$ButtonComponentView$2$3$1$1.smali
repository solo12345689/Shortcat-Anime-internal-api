.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2$3$1$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2$3$1;->measure-3p2s80s(Landroidx/compose/ui/layout/l;Ljava/util/List;J)LI0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Landroidx/compose/ui/layout/s$a;",
        "LTd/L;",
        "invoke",
        "(Landroidx/compose/ui/layout/s$a;)V",
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
.field final synthetic $marginStartPx:F

.field final synthetic $marginTopPx:F

.field final synthetic $progress:Landroidx/compose/ui/layout/s;

.field final synthetic $stack:Landroidx/compose/ui/layout/s;

.field final synthetic $stackHeightMinusMargin:F

.field final synthetic $stackWidthMinusMargin:F


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/s;FFFF)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2$3$1$1;->$stack:Landroidx/compose/ui/layout/s;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2$3$1$1;->$progress:Landroidx/compose/ui/layout/s;

    .line 4
    .line 5
    iput p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2$3$1$1;->$marginStartPx:F

    .line 6
    .line 7
    iput p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2$3$1$1;->$stackWidthMinusMargin:F

    .line 8
    .line 9
    iput p5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2$3$1$1;->$marginTopPx:F

    .line 10
    .line 11
    iput p6, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2$3$1$1;->$stackHeightMinusMargin:F

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/layout/s$a;

    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2$3$1$1;->invoke(Landroidx/compose/ui/layout/s$a;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/s$a;)V
    .locals 8

    const-string v0, "$this$layout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2$3$1$1;->$stack:Landroidx/compose/ui/layout/s;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/s$a;->W(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;IIFILjava/lang/Object;)V

    .line 3
    iget-object v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2$3$1$1;->$progress:Landroidx/compose/ui/layout/s;

    .line 4
    iget v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2$3$1$1;->$marginStartPx:F

    float-to-int v0, v0

    iget v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2$3$1$1;->$stackWidthMinusMargin:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v1, v3

    invoke-virtual {v2}, Landroidx/compose/ui/layout/s;->W0()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v4, v3

    sub-float/2addr v1, v4

    invoke-static {v1}, Lke/a;->d(F)I

    move-result v1

    add-int/2addr v0, v1

    .line 5
    iget v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2$3$1$1;->$marginTopPx:F

    float-to-int v1, v1

    iget v4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2$3$1$1;->$stackHeightMinusMargin:F

    div-float/2addr v4, v3

    iget-object v5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentViewKt$ButtonComponentView$2$3$1$1;->$progress:Landroidx/compose/ui/layout/s;

    invoke-virtual {v5}, Landroidx/compose/ui/layout/s;->P0()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v5, v3

    sub-float/2addr v4, v5

    invoke-static {v4}, Lke/a;->d(F)I

    move-result v3

    add-int v4, v1, v3

    const/4 v5, 0x0

    move-object v1, p1

    move v3, v0

    .line 6
    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/s$a;->W(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;IIFILjava/lang/Object;)V

    return-void
.end method
