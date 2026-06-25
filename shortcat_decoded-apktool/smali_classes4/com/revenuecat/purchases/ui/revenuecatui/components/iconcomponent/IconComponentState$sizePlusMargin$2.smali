.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState$sizePlusMargin$2;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;-><init>(Lb4/c;Li1/t;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;Lie/a;Lie/a;Lie/a;Lie/a;)V
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
.field final synthetic this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState$sizePlusMargin$2;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;

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
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState$sizePlusMargin$2;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;

    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;->getSize()Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    move-result-object v0

    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState$sizePlusMargin$2;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;->getMargin()LC/A;

    move-result-object v1

    iget-object v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState$sizePlusMargin$2;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;

    invoke-static {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;->access$getLayoutDirection(Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;)Li1/t;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/SizeKt;->addMargin(Lcom/revenuecat/purchases/paywalls/components/properties/Size;LC/A;Li1/t;)Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState$sizePlusMargin$2;->invoke()Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    move-result-object v0

    return-object v0
.end method
