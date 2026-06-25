.class Lcom/horcrux/svg/RenderableViewManager$FeOffsetManager;
.super Lcom/horcrux/svg/RenderableViewManager$FilterPrimitiveManager;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK7/r0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/horcrux/svg/RenderableViewManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "FeOffsetManager"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/horcrux/svg/RenderableViewManager$FilterPrimitiveManager<",
        "Lcom/horcrux/svg/p;",
        ">;",
        "LK7/r0;"
    }
.end annotation


# static fields
.field public static final REACT_CLASS:Ljava/lang/String; = "RNSVGFeOffset"


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/horcrux/svg/VirtualViewManager$SVGClass;->RNSVGFeOffset:Lcom/horcrux/svg/VirtualViewManager$SVGClass;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/horcrux/svg/RenderableViewManager$FilterPrimitiveManager;-><init>(Lcom/horcrux/svg/VirtualViewManager$SVGClass;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LK7/q0;

    .line 7
    .line 8
    invoke-direct {v0, p0}, LK7/q0;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

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

.method public bridge synthetic setDx(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "dx"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/p;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FeOffsetManager;->setDx(Lcom/horcrux/svg/p;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setDx(Lcom/horcrux/svg/p;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "dx"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/p;->J(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public bridge synthetic setDy(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "dy"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/p;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FeOffsetManager;->setDy(Lcom/horcrux/svg/p;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setDy(Lcom/horcrux/svg/p;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "dy"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/p;->K(Lcom/facebook/react/bridge/Dynamic;)V

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
    check-cast p1, Lcom/horcrux/svg/p;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FeOffsetManager;->setIn1(Lcom/horcrux/svg/p;Ljava/lang/String;)V

    return-void
.end method

.method public setIn1(Lcom/horcrux/svg/p;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "in1"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/p;->L(Ljava/lang/String;)V

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
