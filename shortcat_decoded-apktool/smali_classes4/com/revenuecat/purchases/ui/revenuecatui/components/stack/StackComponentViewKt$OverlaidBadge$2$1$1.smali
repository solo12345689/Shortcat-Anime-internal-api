.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$OverlaidBadge$2$1$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$OverlaidBadge$2$1;->invoke-3p2s80s(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;
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
.field final synthetic $alignment:Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;

.field final synthetic $mainStackBorderWidthPx:Ljava/lang/Float;

.field final synthetic $placeable:Landroidx/compose/ui/layout/s;


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/s;Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;Ljava/lang/Float;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$OverlaidBadge$2$1$1;->$placeable:Landroidx/compose/ui/layout/s;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$OverlaidBadge$2$1$1;->$alignment:Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$OverlaidBadge$2$1$1;->$mainStackBorderWidthPx:Ljava/lang/Float;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/layout/s$a;

    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$OverlaidBadge$2$1$1;->invoke(Landroidx/compose/ui/layout/s$a;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/s$a;)V
    .locals 8

    const-string v0, "$this$layout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$OverlaidBadge$2$1$1;->$placeable:Landroidx/compose/ui/layout/s;

    .line 3
    invoke-virtual {v2}, Landroidx/compose/ui/layout/s;->P0()I

    move-result v0

    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$OverlaidBadge$2$1$1;->$alignment:Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;

    iget-object v3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt$OverlaidBadge$2$1$1;->$mainStackBorderWidthPx:Ljava/lang/Float;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-static {v0, v1, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt;->access$getOverlaidBadgeOffsetY(ILcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;F)I

    move-result v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    .line 4
    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/s$a;->W(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;IIFILjava/lang/Object;)V

    return-void
.end method
