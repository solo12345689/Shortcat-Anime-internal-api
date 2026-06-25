.class Lcom/horcrux/svg/RenderableViewManager$FeCompositeManager;
.super Lcom/horcrux/svg/RenderableViewManager$FilterPrimitiveManager;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK7/j0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/horcrux/svg/RenderableViewManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "FeCompositeManager"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/horcrux/svg/RenderableViewManager$FilterPrimitiveManager<",
        "Lcom/horcrux/svg/l;",
        ">;",
        "LK7/j0;"
    }
.end annotation


# static fields
.field public static final REACT_CLASS:Ljava/lang/String; = "RNSVGFeComposite"


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/horcrux/svg/VirtualViewManager$SVGClass;->RNSVGFeComposite:Lcom/horcrux/svg/VirtualViewManager$SVGClass;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/horcrux/svg/RenderableViewManager$FilterPrimitiveManager;-><init>(Lcom/horcrux/svg/VirtualViewManager$SVGClass;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LK7/i0;

    .line 7
    .line 8
    invoke-direct {v0, p0}, LK7/i0;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/horcrux/svg/VirtualViewManager;->mDelegate:Lcom/facebook/react/uimanager/q0;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic removeAllViews(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/m;->removeAllViews(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setHeight(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "height"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/q;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FilterPrimitiveManager;->setHeight(Lcom/horcrux/svg/q;Lcom/facebook/react/bridge/Dynamic;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setIn1(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "in1"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/l;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FeCompositeManager;->setIn1(Lcom/horcrux/svg/l;Ljava/lang/String;)V

    return-void
.end method

.method public setIn1(Lcom/horcrux/svg/l;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "in1"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/l;->J(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setIn2(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "in2"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/l;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FeCompositeManager;->setIn2(Lcom/horcrux/svg/l;Ljava/lang/String;)V

    return-void
.end method

.method public setIn2(Lcom/horcrux/svg/l;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "in2"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/l;->K(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setK1(Landroid/view/View;F)V
    .locals 0
    .annotation runtime LB7/a;
        name = "k1"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/l;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FeCompositeManager;->setK1(Lcom/horcrux/svg/l;F)V

    return-void
.end method

.method public setK1(Lcom/horcrux/svg/l;F)V
    .locals 0
    .annotation runtime LB7/a;
        name = "k1"
    .end annotation

    .line 2
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/l;->L(Ljava/lang/Float;)V

    return-void
.end method

.method public bridge synthetic setK2(Landroid/view/View;F)V
    .locals 0
    .annotation runtime LB7/a;
        name = "k2"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/l;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FeCompositeManager;->setK2(Lcom/horcrux/svg/l;F)V

    return-void
.end method

.method public setK2(Lcom/horcrux/svg/l;F)V
    .locals 0
    .annotation runtime LB7/a;
        name = "k2"
    .end annotation

    .line 2
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/l;->M(Ljava/lang/Float;)V

    return-void
.end method

.method public bridge synthetic setK3(Landroid/view/View;F)V
    .locals 0
    .annotation runtime LB7/a;
        name = "k3"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/l;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FeCompositeManager;->setK3(Lcom/horcrux/svg/l;F)V

    return-void
.end method

.method public setK3(Lcom/horcrux/svg/l;F)V
    .locals 0
    .annotation runtime LB7/a;
        name = "k3"
    .end annotation

    .line 2
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/l;->N(Ljava/lang/Float;)V

    return-void
.end method

.method public bridge synthetic setK4(Landroid/view/View;F)V
    .locals 0
    .annotation runtime LB7/a;
        name = "k4"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/l;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FeCompositeManager;->setK4(Lcom/horcrux/svg/l;F)V

    return-void
.end method

.method public setK4(Lcom/horcrux/svg/l;F)V
    .locals 0
    .annotation runtime LB7/a;
        name = "k4"
    .end annotation

    .line 2
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/l;->O(Ljava/lang/Float;)V

    return-void
.end method

.method public bridge synthetic setOperator1(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "operator1"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/l;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FeCompositeManager;->setOperator1(Lcom/horcrux/svg/l;Ljava/lang/String;)V

    return-void
.end method

.method public setOperator1(Lcom/horcrux/svg/l;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "operator1"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/l;->P(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setResult(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "result"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/q;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FilterPrimitiveManager;->setResult(Lcom/horcrux/svg/q;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setWidth(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "width"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/q;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FilterPrimitiveManager;->setWidth(Lcom/horcrux/svg/q;Lcom/facebook/react/bridge/Dynamic;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setX(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "x"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/q;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FilterPrimitiveManager;->setX(Lcom/horcrux/svg/q;Lcom/facebook/react/bridge/Dynamic;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setY(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "y"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/q;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FilterPrimitiveManager;->setY(Lcom/horcrux/svg/q;Lcom/facebook/react/bridge/Dynamic;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
