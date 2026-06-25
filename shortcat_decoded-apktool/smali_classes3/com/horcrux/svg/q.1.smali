.class abstract Lcom/horcrux/svg/q;
.super Lcom/horcrux/svg/e;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private a:Ljava/lang/String;

.field public final b:Lcom/horcrux/svg/FilterRegion;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/horcrux/svg/e;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lcom/horcrux/svg/FilterRegion;

    .line 5
    .line 6
    invoke-direct {p1}, Lcom/horcrux/svg/FilterRegion;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/horcrux/svg/q;->b:Lcom/horcrux/svg/FilterRegion;

    .line 10
    .line 11
    return-void
.end method

.method protected static D(Ljava/util/HashMap;Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/graphics/Bitmap;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-eqz p0, :cond_1

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_1
    return-object p1
.end method


# virtual methods
.method public abstract B(Ljava/util/HashMap;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
.end method

.method public C()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/q;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public E(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/q;->b:Lcom/horcrux/svg/FilterRegion;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/horcrux/svg/FilterRegion;->setHeight(Lcom/facebook/react/bridge/Dynamic;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public F(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/horcrux/svg/q;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public G(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/q;->b:Lcom/horcrux/svg/FilterRegion;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/horcrux/svg/FilterRegion;->setWidth(Lcom/facebook/react/bridge/Dynamic;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public H(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/q;->b:Lcom/horcrux/svg/FilterRegion;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/horcrux/svg/FilterRegion;->setX(Lcom/facebook/react/bridge/Dynamic;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public I(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/q;->b:Lcom/horcrux/svg/FilterRegion;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/horcrux/svg/FilterRegion;->setY(Lcom/facebook/react/bridge/Dynamic;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method saveDefinition()V
    .locals 0

    .line 1
    return-void
.end method
