.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/image/MaskShapeProvider;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lh1/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lh1/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004R \u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/image/MaskShapeProvider;",
        "Lh1/a;",
        "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;",
        "<init>",
        "()V",
        "LCf/i;",
        "values",
        "LCf/i;",
        "getValues",
        "()LCf/i;",
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
.field private final values:LCf/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LCf/i;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape$Rectangle;

    .line 5
    .line 6
    new-instance v1, Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;

    .line 7
    .line 8
    const-wide/high16 v6, 0x4034000000000000L    # 20.0

    .line 9
    .line 10
    const-wide/high16 v8, 0x4044000000000000L    # 40.0

    .line 11
    .line 12
    const-wide/high16 v2, 0x403e000000000000L    # 30.0

    .line 13
    .line 14
    const-wide/high16 v4, 0x4049000000000000L    # 50.0

    .line 15
    .line 16
    invoke-direct/range {v1 .. v9}, Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;-><init>(DDDD)V

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape$Rectangle;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x4

    .line 23
    new-array v1, v1, [Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    aput-object v0, v1, v2

    .line 27
    .line 28
    sget-object v0, Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape$Concave;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape$Concave;

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    aput-object v0, v1, v2

    .line 32
    .line 33
    sget-object v0, Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape$Convex;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape$Convex;

    .line 34
    .line 35
    const/4 v2, 0x2

    .line 36
    aput-object v0, v1, v2

    .line 37
    .line 38
    sget-object v0, Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape$Circle;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape$Circle;

    .line 39
    .line 40
    const/4 v2, 0x3

    .line 41
    aput-object v0, v1, v2

    .line 42
    .line 43
    invoke-static {v1}, LCf/l;->s([Ljava/lang/Object;)LCf/i;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/MaskShapeProvider;->values:LCf/i;

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public bridge synthetic getCount()I
    .locals 1

    .line 1
    invoke-super {p0}, Lh1/a;->getCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public getValues()LCf/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LCf/i;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/MaskShapeProvider;->values:LCf/i;

    .line 2
    .line 3
    return-object v0
.end method
