.class Lcom/horcrux/svg/RenderableViewManager$LinearGradientManager;
.super Lcom/horcrux/svg/VirtualViewManager;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK7/D0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/horcrux/svg/RenderableViewManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "LinearGradientManager"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/horcrux/svg/VirtualViewManager<",
        "Lcom/horcrux/svg/E;",
        ">;",
        "LK7/D0;"
    }
.end annotation


# static fields
.field public static final REACT_CLASS:Ljava/lang/String; = "RNSVGLinearGradient"


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/horcrux/svg/VirtualViewManager$SVGClass;->RNSVGLinearGradient:Lcom/horcrux/svg/VirtualViewManager$SVGClass;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/horcrux/svg/VirtualViewManager;-><init>(Lcom/horcrux/svg/VirtualViewManager$SVGClass;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LK7/C0;

    .line 7
    .line 8
    invoke-direct {v0, p0}, LK7/C0;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

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

.method public bridge synthetic setClipPath(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "clipPath"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/VirtualView;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/VirtualViewManager;->setClipPath(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setClipRule(Landroid/view/View;I)V
    .locals 0
    .annotation runtime LB7/a;
        name = "clipRule"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/VirtualView;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/VirtualViewManager;->setClipRule(Lcom/horcrux/svg/VirtualView;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setDisplay(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "display"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/VirtualView;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/VirtualViewManager;->setDisplay(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setGradient(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "gradient"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/E;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$LinearGradientManager;->setGradient(Lcom/horcrux/svg/E;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public setGradient(Lcom/horcrux/svg/E;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "gradient"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/E;->B(Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public bridge synthetic setGradientTransform(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "gradientTransform"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/E;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$LinearGradientManager;->setGradientTransform(Lcom/horcrux/svg/E;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public setGradientTransform(Lcom/horcrux/svg/E;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "gradientTransform"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/E;->C(Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public bridge synthetic setGradientUnits(Landroid/view/View;I)V
    .locals 0
    .annotation runtime LB7/a;
        name = "gradientUnits"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/E;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$LinearGradientManager;->setGradientUnits(Lcom/horcrux/svg/E;I)V

    return-void
.end method

.method public setGradientUnits(Lcom/horcrux/svg/E;I)V
    .locals 0
    .annotation runtime LB7/a;
        name = "gradientUnits"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/E;->D(I)V

    return-void
.end method

.method public bridge synthetic setMarkerEnd(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "markerEnd"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/VirtualView;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/VirtualViewManager;->setMarkerEnd(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setMarkerMid(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "markerMid"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/VirtualView;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/VirtualViewManager;->setMarkerMid(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setMarkerStart(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "markerStart"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/VirtualView;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/VirtualViewManager;->setMarkerStart(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setMask(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "mask"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/VirtualView;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/VirtualViewManager;->setMask(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setMatrix(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/horcrux/svg/VirtualView;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/VirtualViewManager;->setMatrix(Lcom/horcrux/svg/VirtualView;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 4
    .line 5
    .line 6
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

.method public bridge synthetic setOpacity(Landroid/view/View;F)V
    .locals 0
    .annotation runtime LB7/a;
        defaultFloat = 1.0f
        name = "opacity"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/VirtualView;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/VirtualViewManager;->setOpacity(Lcom/horcrux/svg/VirtualView;F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setPointerEvents(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "pointerEvents"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/VirtualView;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/VirtualViewManager;->setPointerEvents(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setResponsible(Landroid/view/View;Z)V
    .locals 0
    .annotation runtime LB7/a;
        name = "responsible"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/VirtualView;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/VirtualViewManager;->setResponsible(Lcom/horcrux/svg/VirtualView;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setX1(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "x1"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/E;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$LinearGradientManager;->setX1(Lcom/horcrux/svg/E;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setX1(Lcom/horcrux/svg/E;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "x1"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/E;->E(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public bridge synthetic setX2(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "x2"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/E;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$LinearGradientManager;->setX2(Lcom/horcrux/svg/E;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setX2(Lcom/horcrux/svg/E;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "x2"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/E;->F(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public bridge synthetic setY1(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "y1"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/E;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$LinearGradientManager;->setY1(Lcom/horcrux/svg/E;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setY1(Lcom/horcrux/svg/E;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "y1"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/E;->G(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public bridge synthetic setY2(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "y2"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/E;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$LinearGradientManager;->setY2(Lcom/horcrux/svg/E;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setY2(Lcom/horcrux/svg/E;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "y2"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/E;->H(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method
