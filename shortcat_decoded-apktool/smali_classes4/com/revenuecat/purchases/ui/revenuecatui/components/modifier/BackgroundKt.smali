.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BackgroundKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Landroidx/compose/ui/e;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;",
        "color",
        "Ls0/E1;",
        "shape",
        "background",
        "(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Ls0/E1;)Landroidx/compose/ui/e;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;",
        "(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;Ls0/E1;)Landroidx/compose/ui/e;",
        "revenuecatui_defaultsBc8Release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic background(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;Ls0/E1;)Landroidx/compose/ui/e;
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "background"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shape"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    instance-of v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Color;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Color;

    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Color;->unbox-impl()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;

    move-result-object p1

    invoke-static {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BackgroundKt;->background(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Ls0/E1;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0

    .line 4
    :cond_0
    instance-of v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Image;

    if-eqz v0, :cond_1

    .line 5
    invoke-static {p0, p2}, Lp0/g;->a(Landroidx/compose/ui/e;Ls0/E1;)Landroidx/compose/ui/e;

    move-result-object v1

    .line 6
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Image;

    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Image;->getPainter()Lw0/b;

    move-result-object v2

    .line 7
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Image;->getContentScale()LI0/f;

    move-result-object v5

    .line 8
    sget-object p0, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {p0}, Ll0/e$a;->m()Ll0/e;

    move-result-object v4

    const/16 v8, 0x32

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 9
    invoke-static/range {v1 .. v9}, Landroidx/compose/ui/draw/d;->b(Landroidx/compose/ui/e;Lw0/b;ZLl0/e;LI0/f;FLandroidx/compose/ui/graphics/d;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0

    .line 10
    :cond_1
    instance-of p1, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Video;

    if-eqz p1, :cond_2

    return-object p0

    .line 11
    :cond_2
    new-instance p0, LTd/r;

    invoke-direct {p0}, LTd/r;-><init>()V

    throw p0
.end method

.method public static final synthetic background(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Ls0/E1;)Landroidx/compose/ui/e;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "color"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shape"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    instance-of v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;

    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->unbox-impl()J

    move-result-wide v0

    invoke-static {p0, v0, v1, p2}, Landroidx/compose/foundation/b;->c(Landroidx/compose/ui/e;JLs0/E1;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0

    .line 2
    :cond_0
    instance-of v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Gradient;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Gradient;

    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Gradient;->unbox-impl()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/GradientBrush;

    move-result-object p1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p0, p1, p2, v0}, Landroidx/compose/foundation/b;->a(Landroidx/compose/ui/e;Ls0/h0;Ls0/E1;F)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, LTd/r;

    invoke-direct {p0}, LTd/r;-><init>()V

    throw p0
.end method

.method public static synthetic background$default(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;Ls0/E1;ILjava/lang/Object;)Landroidx/compose/ui/e;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 3
    invoke-static {}, Ls0/t1;->a()Ls0/E1;

    move-result-object p2

    .line 4
    :cond_0
    invoke-static {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BackgroundKt;->background(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;Ls0/E1;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic background$default(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Ls0/E1;ILjava/lang/Object;)Landroidx/compose/ui/e;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 1
    invoke-static {}, Ls0/t1;->a()Ls0/E1;

    move-result-object p2

    .line 2
    :cond_0
    invoke-static {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BackgroundKt;->background(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Ls0/E1;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method
