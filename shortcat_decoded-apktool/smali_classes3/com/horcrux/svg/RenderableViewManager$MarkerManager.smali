.class Lcom/horcrux/svg/RenderableViewManager$MarkerManager;
.super Lcom/horcrux/svg/RenderableViewManager$GroupViewManagerAbstract;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK7/F0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/horcrux/svg/RenderableViewManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MarkerManager"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/horcrux/svg/RenderableViewManager$GroupViewManagerAbstract<",
        "Lcom/horcrux/svg/F;",
        ">;",
        "LK7/F0;"
    }
.end annotation


# static fields
.field public static final REACT_CLASS:Ljava/lang/String; = "RNSVGMarker"


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/horcrux/svg/VirtualViewManager$SVGClass;->RNSVGMarker:Lcom/horcrux/svg/VirtualViewManager$SVGClass;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/horcrux/svg/RenderableViewManager$GroupViewManagerAbstract;-><init>(Lcom/horcrux/svg/VirtualViewManager$SVGClass;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LK7/E0;

    .line 7
    .line 8
    invoke-direct {v0, p0}, LK7/E0;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

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

.method public bridge synthetic setAlign(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "align"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/F;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$MarkerManager;->setAlign(Lcom/horcrux/svg/F;Ljava/lang/String;)V

    return-void
.end method

.method public setAlign(Lcom/horcrux/svg/F;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "align"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/F;->setAlign(Ljava/lang/String;)V

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

.method public bridge synthetic setColor(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0
    .annotation runtime LB7/a;
        customType = "Color"
        name = "color"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/RenderableView;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager;->setColor(Lcom/horcrux/svg/RenderableView;Ljava/lang/Integer;)V

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

.method public bridge synthetic setFill(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "fill"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/RenderableView;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager;->setFill(Lcom/horcrux/svg/RenderableView;Lcom/facebook/react/bridge/Dynamic;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setFillOpacity(Landroid/view/View;F)V
    .locals 0
    .annotation runtime LB7/a;
        defaultFloat = 1.0f
        name = "fillOpacity"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/RenderableView;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager;->setFillOpacity(Lcom/horcrux/svg/RenderableView;F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setFillRule(Landroid/view/View;I)V
    .locals 0
    .annotation runtime LB7/a;
        defaultInt = 0x1
        name = "fillRule"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/RenderableView;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager;->setFillRule(Lcom/horcrux/svg/RenderableView;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setFilter(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "filter"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/RenderableView;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager;->setFilter(Lcom/horcrux/svg/RenderableView;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setFont(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "font"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/B;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$GroupViewManagerAbstract;->setFont(Lcom/horcrux/svg/B;Lcom/facebook/react/bridge/Dynamic;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setFontSize(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "fontSize"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/B;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$GroupViewManagerAbstract;->setFontSize(Lcom/horcrux/svg/B;Lcom/facebook/react/bridge/Dynamic;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setFontWeight(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "fontWeight"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/B;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$GroupViewManagerAbstract;->setFontWeight(Lcom/horcrux/svg/B;Lcom/facebook/react/bridge/Dynamic;)V

    .line 4
    .line 5
    .line 6
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

.method public bridge synthetic setMarkerHeight(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "markerHeight"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/F;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$MarkerManager;->setMarkerHeight(Lcom/horcrux/svg/F;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setMarkerHeight(Lcom/horcrux/svg/F;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "markerHeight"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/F;->N(Lcom/facebook/react/bridge/Dynamic;)V

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

.method public bridge synthetic setMarkerUnits(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "markerUnits"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/F;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$MarkerManager;->setMarkerUnits(Lcom/horcrux/svg/F;Ljava/lang/String;)V

    return-void
.end method

.method public setMarkerUnits(Lcom/horcrux/svg/F;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "markerUnits"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/F;->O(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setMarkerWidth(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "markerWidth"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/F;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$MarkerManager;->setMarkerWidth(Lcom/horcrux/svg/F;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setMarkerWidth(Lcom/horcrux/svg/F;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "markerWidth"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/F;->P(Lcom/facebook/react/bridge/Dynamic;)V

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

.method public bridge synthetic setMeetOrSlice(Landroid/view/View;I)V
    .locals 0
    .annotation runtime LB7/a;
        name = "meetOrSlice"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/F;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$MarkerManager;->setMeetOrSlice(Lcom/horcrux/svg/F;I)V

    return-void
.end method

.method public setMeetOrSlice(Lcom/horcrux/svg/F;I)V
    .locals 0
    .annotation runtime LB7/a;
        name = "meetOrSlice"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/F;->setMeetOrSlice(I)V

    return-void
.end method

.method public bridge synthetic setMinX(Landroid/view/View;F)V
    .locals 0
    .annotation runtime LB7/a;
        name = "minX"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/F;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$MarkerManager;->setMinX(Lcom/horcrux/svg/F;F)V

    return-void
.end method

.method public setMinX(Lcom/horcrux/svg/F;F)V
    .locals 0
    .annotation runtime LB7/a;
        name = "minX"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/F;->setMinX(F)V

    return-void
.end method

.method public bridge synthetic setMinY(Landroid/view/View;F)V
    .locals 0
    .annotation runtime LB7/a;
        name = "minY"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/F;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$MarkerManager;->setMinY(Lcom/horcrux/svg/F;F)V

    return-void
.end method

.method public setMinY(Lcom/horcrux/svg/F;F)V
    .locals 0
    .annotation runtime LB7/a;
        name = "minY"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/F;->setMinY(F)V

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

.method public bridge synthetic setOrient(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "orient"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/F;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$MarkerManager;->setOrient(Lcom/horcrux/svg/F;Ljava/lang/String;)V

    return-void
.end method

.method public setOrient(Lcom/horcrux/svg/F;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "orient"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/F;->Q(Ljava/lang/String;)V

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

.method public bridge synthetic setPropList(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "propList"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/RenderableView;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager;->setPropList(Lcom/horcrux/svg/RenderableView;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setRefX(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "refX"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/F;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$MarkerManager;->setRefX(Lcom/horcrux/svg/F;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setRefX(Lcom/horcrux/svg/F;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "refX"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/F;->R(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public bridge synthetic setRefY(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "refY"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/F;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$MarkerManager;->setRefY(Lcom/horcrux/svg/F;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setRefY(Lcom/horcrux/svg/F;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "refY"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/F;->S(Lcom/facebook/react/bridge/Dynamic;)V

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

.method public bridge synthetic setStroke(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "stroke"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/RenderableView;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager;->setStroke(Lcom/horcrux/svg/RenderableView;Lcom/facebook/react/bridge/Dynamic;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setStrokeDasharray(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "strokeDasharray"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/RenderableView;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager;->setStrokeDasharray(Lcom/horcrux/svg/RenderableView;Lcom/facebook/react/bridge/Dynamic;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setStrokeDashoffset(Landroid/view/View;F)V
    .locals 0
    .annotation runtime LB7/a;
        name = "strokeDashoffset"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/RenderableView;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager;->setStrokeDashoffset(Lcom/horcrux/svg/RenderableView;F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setStrokeLinecap(Landroid/view/View;I)V
    .locals 0
    .annotation runtime LB7/a;
        defaultInt = 0x1
        name = "strokeLinecap"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/RenderableView;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager;->setStrokeLinecap(Lcom/horcrux/svg/RenderableView;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setStrokeLinejoin(Landroid/view/View;I)V
    .locals 0
    .annotation runtime LB7/a;
        defaultInt = 0x1
        name = "strokeLinejoin"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/RenderableView;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager;->setStrokeLinejoin(Lcom/horcrux/svg/RenderableView;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setStrokeMiterlimit(Landroid/view/View;F)V
    .locals 0
    .annotation runtime LB7/a;
        defaultFloat = 4.0f
        name = "strokeMiterlimit"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/RenderableView;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager;->setStrokeMiterlimit(Lcom/horcrux/svg/RenderableView;F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setStrokeOpacity(Landroid/view/View;F)V
    .locals 0
    .annotation runtime LB7/a;
        defaultFloat = 1.0f
        name = "strokeOpacity"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/RenderableView;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager;->setStrokeOpacity(Lcom/horcrux/svg/RenderableView;F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setStrokeWidth(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "strokeWidth"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/RenderableView;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager;->setStrokeWidth(Lcom/horcrux/svg/RenderableView;Lcom/facebook/react/bridge/Dynamic;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setVbHeight(Landroid/view/View;F)V
    .locals 0
    .annotation runtime LB7/a;
        name = "vbHeight"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/F;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$MarkerManager;->setVbHeight(Lcom/horcrux/svg/F;F)V

    return-void
.end method

.method public setVbHeight(Lcom/horcrux/svg/F;F)V
    .locals 0
    .annotation runtime LB7/a;
        name = "vbHeight"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/F;->setVbHeight(F)V

    return-void
.end method

.method public bridge synthetic setVbWidth(Landroid/view/View;F)V
    .locals 0
    .annotation runtime LB7/a;
        name = "vbWidth"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/F;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$MarkerManager;->setVbWidth(Lcom/horcrux/svg/F;F)V

    return-void
.end method

.method public setVbWidth(Lcom/horcrux/svg/F;F)V
    .locals 0
    .annotation runtime LB7/a;
        name = "vbWidth"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/F;->setVbWidth(F)V

    return-void
.end method

.method public bridge synthetic setVectorEffect(Landroid/view/View;I)V
    .locals 0
    .annotation runtime LB7/a;
        name = "vectorEffect"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/RenderableView;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager;->setVectorEffect(Lcom/horcrux/svg/RenderableView;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
