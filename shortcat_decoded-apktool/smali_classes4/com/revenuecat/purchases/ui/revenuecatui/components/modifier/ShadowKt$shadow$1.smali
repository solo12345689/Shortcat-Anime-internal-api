.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/ShadowKt$shadow$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/ShadowKt;->shadow(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyle;Ls0/E1;)Landroidx/compose/ui/e;
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
        "Lu0/f;",
        "LTd/L;",
        "invoke",
        "(Lu0/f;)V",
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
.field final synthetic $shadow:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyle;

.field final synthetic $shape:Ls0/E1;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyle;Ls0/E1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/ShadowKt$shadow$1;->$shadow:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyle;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/ShadowKt$shadow$1;->$shape:Ls0/E1;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lu0/f;

    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/ShadowKt$shadow$1;->invoke(Lu0/f;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Lu0/f;)V
    .locals 10

    const-string v0, "$this$drawBehind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/ShadowKt$shadow$1;->$shadow:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyle;

    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyle;->getX-D9Ej5fM()F

    move-result v0

    invoke-interface {p1, v0}, Li1/d;->l1(F)F

    move-result v0

    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/ShadowKt$shadow$1;->$shadow:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyle;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyle;->getY-D9Ej5fM()F

    move-result v1

    invoke-interface {p1, v1}, Li1/d;->l1(F)F

    move-result v1

    invoke-static {v0, v1}, Lr0/g;->a(FF)J

    move-result-wide v0

    .line 3
    iget-object v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/ShadowKt$shadow$1;->$shape:Ls0/E1;

    invoke-interface {p1}, Lu0/f;->f()J

    move-result-wide v3

    invoke-interface {p1}, Lu0/f;->getLayoutDirection()Li1/t;

    move-result-object v5

    invoke-static {v0, v1}, Lr0/f;->d(J)Lr0/f;

    move-result-object v7

    move-object v6, p1

    invoke-static/range {v2 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/ShadowKt;->access$toPath-Xbl9iGQ(Ls0/E1;JLi1/t;Li1/d;Lr0/f;)Ls0/m1;

    move-result-object p1

    move-object v4, v6

    .line 4
    invoke-static {}, Ls0/Q;->a()Ls0/k1;

    move-result-object v8

    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/ShadowKt$shadow$1;->$shadow:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyle;

    .line 5
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyle;->getColor()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;

    move-result-object v1

    .line 6
    instance-of v2, v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyle;->getColor()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;

    move-result-object v1

    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->unbox-impl()J

    move-result-wide v1

    invoke-interface {v8, v1, v2}, Ls0/k1;->p(J)V

    goto :goto_0

    .line 7
    :cond_0
    instance-of v1, v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Gradient;

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyle;->getColor()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;

    move-result-object v1

    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Gradient;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Gradient;->unbox-impl()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/GradientBrush;

    move-result-object v1

    invoke-interface {v4}, Lu0/f;->f()J

    move-result-wide v2

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual {v1, v2, v3, v8, v5}, Ls0/A1;->applyTo-Pq9zytI(JLs0/k1;F)V

    .line 8
    :cond_1
    :goto_0
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyle;->getRadius-D9Ej5fM()F

    move-result v1

    const/4 v2, 0x0

    int-to-float v2, v2

    .line 9
    invoke-static {v2}, Li1/h;->n(F)F

    move-result v2

    .line 10
    invoke-static {v1, v2}, Li1/h;->q(FF)Z

    move-result v1

    if-nez v1, :cond_2

    .line 11
    invoke-interface {v8}, Ls0/k1;->u()Landroid/graphics/Paint;

    move-result-object v1

    new-instance v2, Landroid/graphics/BlurMaskFilter;

    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyle;->getRadius-D9Ej5fM()F

    move-result v0

    invoke-interface {v4, v0}, Li1/d;->l1(F)F

    move-result v0

    sget-object v3, Landroid/graphics/BlurMaskFilter$Blur;->NORMAL:Landroid/graphics/BlurMaskFilter$Blur;

    invoke-direct {v2, v0, v3}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    .line 12
    :cond_2
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/ShadowKt$shadow$1;->$shape:Ls0/E1;

    .line 13
    invoke-interface {v4}, Lu0/f;->n1()Lu0/d;

    move-result-object v1

    invoke-interface {v1}, Lu0/d;->b()Ls0/j0;

    move-result-object v9

    .line 14
    invoke-interface {v9}, Ls0/j0;->p()V

    .line 15
    invoke-interface {v4}, Lu0/f;->f()J

    move-result-wide v1

    invoke-interface {v4}, Lu0/f;->getLayoutDirection()Li1/t;

    move-result-object v3

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/ShadowKt;->toPath-Xbl9iGQ$default(Ls0/E1;JLi1/t;Li1/d;Lr0/f;ILjava/lang/Object;)Ls0/m1;

    move-result-object v0

    sget-object v1, Ls0/q0;->a:Ls0/q0$a;

    invoke-virtual {v1}, Ls0/q0$a;->a()I

    move-result v1

    invoke-interface {v9, v0, v1}, Ls0/j0;->b(Ls0/m1;I)V

    .line 16
    invoke-interface {v9, p1, v8}, Ls0/j0;->t(Ls0/m1;Ls0/k1;)V

    .line 17
    invoke-interface {v9}, Ls0/j0;->k()V

    return-void
.end method
