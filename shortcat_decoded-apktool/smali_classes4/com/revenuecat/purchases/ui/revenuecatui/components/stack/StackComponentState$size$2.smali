.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState$size$2;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;-><init>(Lb4/c;Li1/t;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;Lie/a;Lie/a;Lie/a;Lie/a;)V
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
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lcom/revenuecat/purchases/paywalls/components/properties/Size;",
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
.field final synthetic this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState$size$2;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

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
.method public final invoke()Lcom/revenuecat/purchases/paywalls/components/properties/Size;
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState$size$2;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;->access$getPresentedPartial(Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;)Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedStackPartial;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedStackPartial;->getPartial()Lcom/revenuecat/purchases/paywalls/components/PartialStackComponent;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/components/PartialStackComponent;->getSize()Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState$size$2;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;->access$getStyle$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;

    move-result-object v1

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;->getSize()Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    move-result-object v1

    :cond_1
    iget-object v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState$size$2;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;->getMargin()LC/A;

    move-result-object v2

    iget-object v3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState$size$2;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

    invoke-static {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;->access$getLayoutDirection(Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;)Li1/t;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;->access$adjustForMargin(Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;Lcom/revenuecat/purchases/paywalls/components/properties/Size;LC/A;Li1/t;)Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState$size$2;->invoke()Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    move-result-object v0

    return-object v0
.end method
