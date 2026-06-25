.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState$aspectRatio$2;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState;-><init>(Lb4/c;Li1/d;ZLi1/t;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;Lie/a;Lie/a;Lie/a;Lie/a;Lie/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lie/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/AspectRatio;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState$aspectRatio$2;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invoke()Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/AspectRatio;
    .locals 7

    .line 2
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState$aspectRatio$2;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState;

    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState;->getSize()Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    move-result-object v0

    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState$aspectRatio$2;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState;

    .line 3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;->getHeight()Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;

    move-result-object v2

    .line 4
    instance-of v3, v2, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_3

    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;->getWidth()Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;

    move-result-object v0

    .line 5
    instance-of v2, v0, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;

    if-eqz v2, :cond_0

    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/AspectRatio;

    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState;->access$getVideoAspectRatio(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState;)F

    move-result v1

    invoke-direct {v0, v1, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/AspectRatio;-><init>(FZ)V

    return-object v0

    .line 6
    :cond_0
    instance-of v2, v0, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;

    if-eqz v2, :cond_1

    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/AspectRatio;

    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState;->access$getVideoAspectRatio(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState;)F

    move-result v1

    invoke-direct {v0, v1, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/AspectRatio;-><init>(FZ)V

    return-object v0

    .line 7
    :cond_1
    instance-of v0, v0, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    if-eqz v0, :cond_2

    return-object v5

    :cond_2
    new-instance v0, LTd/r;

    invoke-direct {v0}, LTd/r;-><init>()V

    throw v0

    .line 8
    :cond_3
    instance-of v3, v2, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;

    if-eqz v3, :cond_7

    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;->getWidth()Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;

    move-result-object v0

    .line 9
    instance-of v2, v0, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;

    if-eqz v2, :cond_4

    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/AspectRatio;

    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState;->access$getVideoAspectRatio(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState;)F

    move-result v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/AspectRatio;-><init>(FZ)V

    return-object v0

    .line 10
    :cond_4
    instance-of v1, v0, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;

    if-eqz v1, :cond_5

    return-object v5

    .line 11
    :cond_5
    instance-of v0, v0, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    if-eqz v0, :cond_6

    return-object v5

    :cond_6
    new-instance v0, LTd/r;

    invoke-direct {v0}, LTd/r;-><init>()V

    throw v0

    .line 12
    :cond_7
    instance-of v1, v2, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    if-eqz v1, :cond_b

    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;->getWidth()Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;

    move-result-object v0

    .line 13
    instance-of v1, v0, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;

    if-eqz v1, :cond_8

    return-object v5

    .line 14
    :cond_8
    instance-of v1, v0, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;

    if-eqz v1, :cond_9

    return-object v5

    .line 15
    :cond_9
    instance-of v1, v0, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    if-eqz v1, :cond_a

    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/AspectRatio;

    .line 16
    check-cast v0, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;->getValue-pVg5ArA()I

    move-result v0

    invoke-static {v0}, LTd/N;->c(I)D

    move-result-wide v5

    double-to-float v0, v5

    check-cast v2, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    invoke-virtual {v2}, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;->getValue-pVg5ArA()I

    move-result v2

    invoke-static {v2}, LTd/N;->c(I)D

    move-result-wide v2

    double-to-float v2, v2

    div-float/2addr v0, v2

    .line 17
    invoke-direct {v1, v0, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/AspectRatio;-><init>(FZ)V

    return-object v1

    :cond_a
    new-instance v0, LTd/r;

    invoke-direct {v0}, LTd/r;-><init>()V

    throw v0

    :cond_b
    new-instance v0, LTd/r;

    invoke-direct {v0}, LTd/r;-><init>()V

    throw v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState$aspectRatio$2;->invoke()Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/AspectRatio;

    move-result-object v0

    return-object v0
.end method
