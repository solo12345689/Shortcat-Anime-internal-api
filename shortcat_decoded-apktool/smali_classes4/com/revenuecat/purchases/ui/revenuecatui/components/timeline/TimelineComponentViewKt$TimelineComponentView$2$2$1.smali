.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$2$1;
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

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$2$1$WhenMappings;
    }
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
.field final synthetic $biggestIconWidth$delegate:LY/h2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY/h2;"
        }
    .end annotation
.end field

.field final synthetic $currentPreviousItem:Ll1/i$b;

.field final synthetic $descriptionRef:Ll1/f;

.field final synthetic $timelineState:Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;

.field final synthetic $titleRef:Ll1/f;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;Ll1/i$b;Ll1/f;Ll1/f;LY/h2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;",
            "Ll1/i$b;",
            "Ll1/f;",
            "Ll1/f;",
            "LY/h2;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$2$1;->$timelineState:Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$2$1;->$currentPreviousItem:Ll1/i$b;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$2$1;->$titleRef:Ll1/f;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$2$1;->$descriptionRef:Ll1/f;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$2$1;->$biggestIconWidth$delegate:LY/h2;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ll1/e;

    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$2$1;->invoke(Ll1/e;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Ll1/e;)V
    .locals 14

    const-string v0, "$this$constrainAs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$2$1;->$timelineState:Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;

    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;->getIconAlignment()Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;

    move-result-object v0

    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$2$1$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p1}, Ll1/e;->h()Ll1/v;

    move-result-object v2

    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$2$1;->$titleRef:Ll1/f;

    invoke-virtual {v0}, Ll1/f;->e()Ll1/i$b;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Ll1/v;->a(Ll1/v;Ll1/i$b;FFILjava/lang/Object;)V

    .line 4
    invoke-virtual {p1}, Ll1/e;->c()Ll1/v;

    move-result-object v8

    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$2$1;->$descriptionRef:Ll1/f;

    invoke-virtual {v0}, Ll1/f;->b()Ll1/i$b;

    move-result-object v9

    const/4 v12, 0x6

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Ll1/v;->a(Ll1/v;Ll1/i$b;FFILjava/lang/Object;)V

    .line 5
    invoke-virtual {p1}, Ll1/e;->g()Ll1/E;

    move-result-object v0

    invoke-virtual {p1}, Ll1/e;->f()Ll1/f;

    move-result-object v1

    invoke-virtual {v1}, Ll1/f;->d()Ll1/i$c;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Ll1/E;->a(Ll1/E;Ll1/i$c;FFILjava/lang/Object;)V

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {p1}, Ll1/e;->h()Ll1/v;

    move-result-object v6

    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$2$1;->$currentPreviousItem:Ll1/i$b;

    if-nez v0, :cond_2

    invoke-virtual {p1}, Ll1/e;->f()Ll1/f;

    move-result-object v0

    invoke-virtual {v0}, Ll1/f;->e()Ll1/i$b;

    move-result-object v0

    :cond_2
    move-object v7, v0

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Ll1/v;->a(Ll1/v;Ll1/i$b;FFILjava/lang/Object;)V

    .line 7
    invoke-virtual {p1}, Ll1/e;->g()Ll1/E;

    move-result-object v0

    invoke-virtual {p1}, Ll1/e;->f()Ll1/f;

    move-result-object v1

    invoke-virtual {v1}, Ll1/f;->d()Ll1/i$c;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Ll1/E;->a(Ll1/E;Ll1/i$c;FFILjava/lang/Object;)V

    .line 8
    :goto_0
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt$TimelineComponentView$2$2$1;->$biggestIconWidth$delegate:LY/h2;

    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentViewKt;->access$TimelineComponentView$lambda$13$lambda$1(LY/h2;)Li1/h;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Li1/h;->t()F

    move-result v0

    sget-object v1, Ll1/s;->a:Ll1/s$b;

    invoke-virtual {v1, v0}, Ll1/s$b;->d(F)Ll1/s;

    move-result-object v0

    if-nez v0, :cond_4

    :cond_3
    sget-object v0, Ll1/s;->a:Ll1/s$b;

    invoke-virtual {v0}, Ll1/s$b;->c()Ll1/s;

    move-result-object v0

    :cond_4
    invoke-virtual {p1, v0}, Ll1/e;->m(Ll1/s;)V

    return-void
.end method
