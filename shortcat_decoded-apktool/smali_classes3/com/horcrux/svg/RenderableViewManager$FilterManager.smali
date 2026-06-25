.class Lcom/horcrux/svg/RenderableViewManager$FilterManager;
.super Lcom/horcrux/svg/VirtualViewManager;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK7/t0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/horcrux/svg/RenderableViewManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "FilterManager"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/horcrux/svg/VirtualViewManager<",
        "Lcom/horcrux/svg/w;",
        ">;",
        "LK7/t0;"
    }
.end annotation


# static fields
.field public static final REACT_CLASS:Ljava/lang/String; = "RNSVGFilter"


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/horcrux/svg/VirtualViewManager$SVGClass;->RNSVGFilter:Lcom/horcrux/svg/VirtualViewManager$SVGClass;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/horcrux/svg/VirtualViewManager;-><init>(Lcom/horcrux/svg/VirtualViewManager$SVGClass;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LK7/s0;

    .line 7
    .line 8
    invoke-direct {v0, p0}, LK7/s0;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

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

.method public bridge synthetic setFilterUnits(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "filterUnits"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/w;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FilterManager;->setFilterUnits(Lcom/horcrux/svg/w;Ljava/lang/String;)V

    return-void
.end method

.method public setFilterUnits(Lcom/horcrux/svg/w;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "filterUnits"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/w;->C(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setHeight(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "height"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/w;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FilterManager;->setHeight(Lcom/horcrux/svg/w;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setHeight(Lcom/horcrux/svg/w;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "height"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/w;->D(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public bridge synthetic setName(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "name"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/VirtualView;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/VirtualViewManager;->setName(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setPrimitiveUnits(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "primitiveUnits"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/w;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FilterManager;->setPrimitiveUnits(Lcom/horcrux/svg/w;Ljava/lang/String;)V

    return-void
.end method

.method public setPrimitiveUnits(Lcom/horcrux/svg/w;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "primitiveUnits"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/w;->E(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setWidth(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "width"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/w;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FilterManager;->setWidth(Lcom/horcrux/svg/w;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setWidth(Lcom/horcrux/svg/w;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "width"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/w;->F(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public bridge synthetic setX(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "x"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/w;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FilterManager;->setX(Lcom/horcrux/svg/w;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setX(Lcom/horcrux/svg/w;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "x"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/w;->G(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public bridge synthetic setY(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "y"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/w;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FilterManager;->setY(Lcom/horcrux/svg/w;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setY(Lcom/horcrux/svg/w;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "y"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/w;->H(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method
