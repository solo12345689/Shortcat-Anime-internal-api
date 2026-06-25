.class Lcom/horcrux/svg/Z;
.super Lcom/horcrux/svg/l0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private q:Ljava/lang/String;

.field private r:Lcom/horcrux/svg/j0;

.field private s:Lcom/horcrux/svg/i0;

.field private t:Lcom/horcrux/svg/SVGLength;

.field private u:Lcom/horcrux/svg/h0;

.field private v:Lcom/horcrux/svg/k0;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/horcrux/svg/l0;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lcom/horcrux/svg/h0;->a:Lcom/horcrux/svg/h0;

    .line 5
    .line 6
    iput-object p1, p0, Lcom/horcrux/svg/Z;->u:Lcom/horcrux/svg/h0;

    .line 7
    .line 8
    sget-object p1, Lcom/horcrux/svg/k0;->b:Lcom/horcrux/svg/k0;

    .line 9
    .line 10
    iput-object p1, p0, Lcom/horcrux/svg/Z;->v:Lcom/horcrux/svg/k0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method G()V
    .locals 0

    .line 1
    return-void
.end method

.method H()V
    .locals 0

    .line 1
    return-void
.end method

.method public X(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/h0;->valueOf(Ljava/lang/String;)Lcom/horcrux/svg/h0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/Z;->u:Lcom/horcrux/svg/h0;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/l0;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method d0()Lcom/horcrux/svg/i0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/Z;->s:Lcom/horcrux/svg/i0;

    .line 2
    .line 3
    return-object v0
.end method

.method draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/horcrux/svg/B;->B(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method e0()Lcom/horcrux/svg/j0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/Z;->r:Lcom/horcrux/svg/j0;

    .line 2
    .line 3
    return-object v0
.end method

.method f0()Lcom/horcrux/svg/SVGLength;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/Z;->t:Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    return-object v0
.end method

.method g0(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->getSvgView()Lcom/horcrux/svg/SvgView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/horcrux/svg/Z;->q:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/horcrux/svg/SvgView;->getDefinedTemplate(Ljava/lang/String;)Lcom/horcrux/svg/VirtualView;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v1, v0, Lcom/horcrux/svg/RenderableView;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    return-object p1

    .line 17
    :cond_0
    check-cast v0, Lcom/horcrux/svg/RenderableView;

    .line 18
    .line 19
    invoke-virtual {v0, p1, p2}, Lcom/horcrux/svg/RenderableView;->getPath(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method

.method getPath(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/l0;->O(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public h0(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/horcrux/svg/Z;->q:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/horcrux/svg/l0;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public i0(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/i0;->valueOf(Ljava/lang/String;)Lcom/horcrux/svg/i0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/Z;->s:Lcom/horcrux/svg/i0;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/l0;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public j0(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/j0;->valueOf(Ljava/lang/String;)Lcom/horcrux/svg/j0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/Z;->r:Lcom/horcrux/svg/j0;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/l0;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public k0(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/k0;->valueOf(Ljava/lang/String;)Lcom/horcrux/svg/k0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/Z;->v:Lcom/horcrux/svg/k0;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/l0;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public l0(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/Z;->t:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/l0;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method
