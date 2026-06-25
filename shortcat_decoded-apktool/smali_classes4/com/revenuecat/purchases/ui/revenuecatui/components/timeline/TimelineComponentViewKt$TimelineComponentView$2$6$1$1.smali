.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$6$1$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt;->TimelineComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;LY/m;II)V
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
        "Ll1/e;",
        "LTd/L;",
        "invoke",
        "(Ll1/e;)V",
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
.field final synthetic $currentIconRef:Ll1/f;

.field final synthetic $isLastItem:Z

.field final synthetic $item:Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState$ItemState;

.field final synthetic $nextIconRef:Ll1/f;

.field final synthetic $nextItemIconHalfSize:F

.field final synthetic $offsets:Lkotlin/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Pair<",
            "Li1/h;",
            "Li1/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/Pair;Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState$ItemState;Ll1/f;ZLl1/f;F)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Li1/h;",
            "Li1/h;",
            ">;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState$ItemState;",
            "Ll1/f;",
            "Z",
            "Ll1/f;",
            "F)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$6$1$1;->$offsets:Lkotlin/Pair;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$6$1$1;->$item:Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState$ItemState;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$6$1$1;->$currentIconRef:Ll1/f;

    .line 6
    .line 7
    iput-boolean p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$6$1$1;->$isLastItem:Z

    .line 8
    .line 9
    iput-object p5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$6$1$1;->$nextIconRef:Ll1/f;

    .line 10
    .line 11
    iput p6, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$6$1$1;->$nextItemIconHalfSize:F

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
    check-cast p1, Ll1/e;

    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$6$1$1;->invoke(Ll1/e;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Ll1/e;)V
    .locals 14

    const-string v0, "$this$constrainAs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Ll1/e;->g()Ll1/E;

    move-result-object v1

    invoke-virtual {p1}, Ll1/e;->f()Ll1/f;

    move-result-object v0

    invoke-virtual {v0}, Ll1/f;->d()Ll1/i$c;

    move-result-object v2

    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$6$1$1;->$offsets:Lkotlin/Pair;

    invoke-virtual {v0}, Lkotlin/Pair;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li1/h;

    invoke-virtual {v0}, Li1/h;->t()F

    move-result v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ll1/E;->a(Ll1/E;Ll1/i$c;FFILjava/lang/Object;)V

    .line 3
    sget-object v0, Ll1/s;->a:Ll1/s$b;

    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$6$1$1;->$item:Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState$ItemState;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState$ItemState;->getConnector()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;->getWidth()I

    move-result v1

    :goto_0
    int-to-float v1, v1

    .line 4
    invoke-static {v1}, Li1/h;->n(F)F

    move-result v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    .line 5
    :goto_1
    invoke-virtual {v0, v1}, Ll1/s$b;->d(F)Ll1/s;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll1/e;->m(Ll1/s;)V

    .line 6
    invoke-virtual {p1}, Ll1/e;->h()Ll1/v;

    move-result-object v2

    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$6$1$1;->$currentIconRef:Ll1/f;

    invoke-virtual {v1}, Ll1/f;->e()Ll1/i$b;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Ll1/v;->a(Ll1/v;Ll1/i$b;FFILjava/lang/Object;)V

    .line 7
    iget-boolean v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$6$1$1;->$isLastItem:Z

    if-eqz v1, :cond_1

    .line 8
    invoke-virtual {p1}, Ll1/e;->c()Ll1/v;

    move-result-object v2

    invoke-virtual {p1}, Ll1/e;->f()Ll1/f;

    move-result-object v1

    invoke-virtual {v1}, Ll1/f;->b()Ll1/i$b;

    move-result-object v3

    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$6$1$1;->$offsets:Lkotlin/Pair;

    invoke-virtual {v1}, Lkotlin/Pair;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li1/h;

    invoke-virtual {v1}, Li1/h;->t()F

    move-result v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Ll1/v;->a(Ll1/v;Ll1/i$b;FFILjava/lang/Object;)V

    goto :goto_2

    .line 9
    :cond_1
    invoke-virtual {p1}, Ll1/e;->c()Ll1/v;

    move-result-object v8

    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$6$1$1;->$nextIconRef:Ll1/f;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ll1/f;->b()Ll1/i$b;

    move-result-object v9

    iget v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$6$1$1;->$nextItemIconHalfSize:F

    iget-object v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$6$1$1;->$offsets:Lkotlin/Pair;

    invoke-virtual {v2}, Lkotlin/Pair;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li1/h;

    invoke-virtual {v2}, Li1/h;->t()F

    move-result v2

    add-float/2addr v1, v2

    .line 10
    invoke-static {v1}, Li1/h;->n(F)F

    move-result v10

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v11, 0x0

    .line 11
    invoke-static/range {v8 .. v13}, Ll1/v;->a(Ll1/v;Ll1/i$b;FFILjava/lang/Object;)V

    .line 12
    :goto_2
    invoke-virtual {v0}, Ll1/s$b;->a()Ll1/s$a;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll1/e;->k(Ll1/s;)V

    return-void
.end method
