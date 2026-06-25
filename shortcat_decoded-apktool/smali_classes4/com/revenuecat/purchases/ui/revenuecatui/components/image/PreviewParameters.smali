.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0002\u0018\u00002\u00020\u0001B+\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nR\u001d\u0010\u0003\u001a\u00020\u00028\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u001d\u0010\u0004\u001a\u00020\u00028\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u000b\u001a\u0004\u0008\u000e\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;",
        "",
        "LTd/D;",
        "imageWidth",
        "imageHeight",
        "Lcom/revenuecat/purchases/paywalls/components/properties/Size;",
        "viewSize",
        "Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;",
        "fitMode",
        "<init>",
        "(IILcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "I",
        "getImageWidth-pVg5ArA",
        "()I",
        "getImageHeight-pVg5ArA",
        "Lcom/revenuecat/purchases/paywalls/components/properties/Size;",
        "getViewSize",
        "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;",
        "Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;",
        "getFitMode",
        "()Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;",
        "revenuecatui_defaultsBc8Release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final fitMode:Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;

.field private final imageHeight:I

.field private final imageWidth:I

.field private final viewSize:Lcom/revenuecat/purchases/paywalls/components/properties/Size;


# direct methods
.method private constructor <init>(IILcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;)V
    .locals 1

    const-string v0, "viewSize"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fitMode"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;->imageWidth:I

    .line 4
    iput p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;->imageHeight:I

    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;->viewSize:Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 6
    iput-object p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;->fitMode:Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;

    return-void
.end method

.method public synthetic constructor <init>(IILcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;-><init>(IILcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;)V

    return-void
.end method


# virtual methods
.method public final getFitMode()Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;->fitMode:Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getImageHeight-pVg5ArA()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;->imageHeight:I

    .line 2
    .line 3
    return v0
.end method

.method public final getImageWidth-pVg5ArA()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;->imageWidth:I

    .line 2
    .line 3
    return v0
.end method

.method public final getViewSize()Lcom/revenuecat/purchases/paywalls/components/properties/Size;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;->viewSize:Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 2
    .line 3
    return-object v0
.end method
