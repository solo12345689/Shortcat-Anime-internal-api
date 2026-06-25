.class Lcom/horcrux/svg/RenderableViewManager$TextViewManagerAbstract;
.super Lcom/horcrux/svg/RenderableViewManager$GroupViewManagerAbstract;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/horcrux/svg/RenderableViewManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "TextViewManagerAbstract"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Lcom/horcrux/svg/l0;",
        ">",
        "Lcom/horcrux/svg/RenderableViewManager$GroupViewManagerAbstract<",
        "TK;>;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/horcrux/svg/VirtualViewManager$SVGClass;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/horcrux/svg/RenderableViewManager$GroupViewManagerAbstract;-><init>(Lcom/horcrux/svg/VirtualViewManager$SVGClass;)V

    .line 2
    .line 3
    .line 4
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

.method public setAlignmentBaseline(Lcom/horcrux/svg/l0;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/l0;->X(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setBaselineShift(Lcom/horcrux/svg/l0;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "baselineShift"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Lcom/facebook/react/bridge/Dynamic;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/l0;->S(Lcom/facebook/react/bridge/Dynamic;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setDx(Lcom/horcrux/svg/l0;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "dx"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Lcom/facebook/react/bridge/Dynamic;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/l0;->T(Lcom/facebook/react/bridge/Dynamic;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setDy(Lcom/horcrux/svg/l0;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "dy"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Lcom/facebook/react/bridge/Dynamic;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/l0;->U(Lcom/facebook/react/bridge/Dynamic;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setFont(Lcom/horcrux/svg/B;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "font"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/l0;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$TextViewManagerAbstract;->setFont(Lcom/horcrux/svg/l0;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setFont(Lcom/horcrux/svg/l0;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "font"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Lcom/facebook/react/bridge/Dynamic;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/B;->J(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setInlineSize(Lcom/horcrux/svg/l0;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "inlineSize"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Lcom/facebook/react/bridge/Dynamic;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/l0;->V(Lcom/facebook/react/bridge/Dynamic;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setLengthAdjust(Lcom/horcrux/svg/l0;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "lengthAdjust"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/l0;->W(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setMethod(Lcom/horcrux/svg/l0;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "alignmentBaseline"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/l0;->X(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setRotate(Lcom/horcrux/svg/l0;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "rotate"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Lcom/facebook/react/bridge/Dynamic;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/l0;->a0(Lcom/facebook/react/bridge/Dynamic;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setTextLength(Lcom/horcrux/svg/l0;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "textLength"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Lcom/facebook/react/bridge/Dynamic;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/l0;->b0(Lcom/facebook/react/bridge/Dynamic;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setVerticalAlign(Lcom/horcrux/svg/l0;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "verticalAlign"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Lcom/facebook/react/bridge/Dynamic;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/l0;->c0(Lcom/facebook/react/bridge/Dynamic;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setX(Lcom/horcrux/svg/l0;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "x"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Lcom/facebook/react/bridge/Dynamic;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/l0;->Y(Lcom/facebook/react/bridge/Dynamic;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setY(Lcom/horcrux/svg/l0;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "y"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Lcom/facebook/react/bridge/Dynamic;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/l0;->Z(Lcom/facebook/react/bridge/Dynamic;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
