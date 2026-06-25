.class public final Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007R\u0014\u0010\u0008\u001a\u00020\tX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u0012X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;",
        "thumbColorOn",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;",
        "thumbColorOff",
        "trackColorOn",
        "trackColorOff",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;)V",
        "size",
        "Lcom/revenuecat/purchases/paywalls/components/properties/Size;",
        "getSize",
        "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;",
        "getThumbColorOff",
        "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;",
        "getThumbColorOn",
        "getTrackColorOff",
        "getTrackColorOn",
        "visible",
        "",
        "getVisible",
        "()Z",
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


# static fields
.field public static final $stable:I


# instance fields
.field private final size:Lcom/revenuecat/purchases/paywalls/components/properties/Size;

.field private final thumbColorOff:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

.field private final thumbColorOn:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

.field private final trackColorOff:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

.field private final trackColorOn:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

.field private final visible:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;)V
    .locals 1

    .line 1
    const-string v0, "thumbColorOn"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "thumbColorOff"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "trackColorOn"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "trackColorOff"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;->thumbColorOn:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 25
    .line 26
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;->thumbColorOff:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 27
    .line 28
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;->trackColorOn:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 29
    .line 30
    iput-object p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;->trackColorOff:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 31
    .line 32
    const/4 p1, 0x1

    .line 33
    iput-boolean p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;->visible:Z

    .line 34
    .line 35
    new-instance p1, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 36
    .line 37
    sget-object p2, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;

    .line 38
    .line 39
    invoke-direct {p1, p2, p2}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;->size:Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public getSize()Lcom/revenuecat/purchases/paywalls/components/properties/Size;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;->size:Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getThumbColorOff()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;->thumbColorOff:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getThumbColorOn()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;->thumbColorOn:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getTrackColorOff()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;->trackColorOff:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getTrackColorOn()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;->trackColorOn:Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 2
    .line 3
    return-object v0
.end method

.method public getVisible()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;->visible:Z

    .line 2
    .line 3
    return v0
.end method
