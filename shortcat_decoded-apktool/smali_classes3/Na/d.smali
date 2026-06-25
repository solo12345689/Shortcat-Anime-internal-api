.class public final LNa/d;
.super Lcom/facebook/react/uimanager/r;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/r;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic addChildAt(Lcom/facebook/react/uimanager/O;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/uimanager/P;

    invoke-virtual {p0, p1, p2}, LNa/d;->addChildAt(Lcom/facebook/react/uimanager/P;I)V

    return-void
.end method

.method public addChildAt(Lcom/facebook/react/uimanager/P;I)V
    .locals 1

    const-string v0, "child"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1, p2}, Lcom/facebook/react/uimanager/P;->addChildAt(Lcom/facebook/react/uimanager/P;I)V

    .line 3
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/P;->getThemedContext()Lcom/facebook/react/uimanager/b0;

    move-result-object p2

    const-string v0, "getThemedContext(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, LBa/a;->b(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object p2

    .line 4
    iget v0, p2, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Lcom/facebook/react/uimanager/P;->setStyleWidth(F)V

    .line 5
    iget p2, p2, Landroid/graphics/Point;->y:I

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Lcom/facebook/react/uimanager/P;->setStyleHeight(F)V

    return-void
.end method
