.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentViewKt$Indicator$progress$2$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentViewKt;->Indicator(LG/C;IILcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$PageControlStyles;LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lie/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke",
        "()Ljava/lang/Float;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $pageCount:I

.field final synthetic $pageIndex:I

.field final synthetic $pagerState:LG/C;


# direct methods
.method constructor <init>(LG/C;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentViewKt$Indicator$progress$2$1;->$pagerState:LG/C;

    .line 2
    .line 3
    iput p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentViewKt$Indicator$progress$2$1;->$pageCount:I

    .line 4
    .line 5
    iput p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentViewKt$Indicator$progress$2$1;->$pageIndex:I

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Float;
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentViewKt$Indicator$progress$2$1;->$pagerState:LG/C;

    invoke-virtual {v0}, LG/C;->v()I

    move-result v0

    iget v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentViewKt$Indicator$progress$2$1;->$pageCount:I

    rem-int/2addr v0, v1

    .line 3
    iget v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentViewKt$Indicator$progress$2$1;->$pageIndex:I

    const/4 v2, 0x0

    if-ne v1, v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentViewKt$Indicator$progress$2$1;->$pagerState:LG/C;

    invoke-virtual {v0}, LG/C;->w()F

    move-result v0

    cmpl-float v0, v0, v2

    const/high16 v1, 0x3f800000    # 1.0f

    if-ltz v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentViewKt$Indicator$progress$2$1;->$pagerState:LG/C;

    invoke-virtual {v0}, LG/C;->w()F

    move-result v0

    sub-float v2, v1, v0

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentViewKt$Indicator$progress$2$1;->$pagerState:LG/C;

    invoke-virtual {v0}, LG/C;->w()F

    move-result v0

    add-float v2, v0, v1

    goto :goto_0

    :cond_1
    add-int/lit8 v3, v0, 0x1

    if-ne v1, v3, :cond_2

    .line 7
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentViewKt$Indicator$progress$2$1;->$pagerState:LG/C;

    invoke-virtual {v1}, LG/C;->w()F

    move-result v1

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_2

    .line 8
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentViewKt$Indicator$progress$2$1;->$pagerState:LG/C;

    invoke-virtual {v0}, LG/C;->w()F

    move-result v2

    goto :goto_0

    .line 9
    :cond_2
    iget v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentViewKt$Indicator$progress$2$1;->$pageIndex:I

    add-int/lit8 v0, v0, -0x1

    if-ne v1, v0, :cond_3

    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentViewKt$Indicator$progress$2$1;->$pagerState:LG/C;

    invoke-virtual {v0}, LG/C;->w()F

    move-result v0

    cmpg-float v0, v0, v2

    if-gez v0, :cond_3

    .line 10
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentViewKt$Indicator$progress$2$1;->$pagerState:LG/C;

    invoke-virtual {v0}, LG/C;->w()F

    move-result v0

    neg-float v2, v0

    .line 11
    :cond_3
    :goto_0
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentViewKt$Indicator$progress$2$1;->invoke()Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method
