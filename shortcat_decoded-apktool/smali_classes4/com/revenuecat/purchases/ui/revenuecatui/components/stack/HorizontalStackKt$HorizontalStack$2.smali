.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt$HorizontalStack$2;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt;->HorizontalStack-TN_CM5M(Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;FLandroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lkotlin/jvm/functions/Function2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $$changed:I

.field final synthetic $$default:I

.field final synthetic $content:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic $dimension:Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;

.field final synthetic $modifier:Landroidx/compose/ui/e;

.field final synthetic $size:Lcom/revenuecat/purchases/paywalls/components/properties/Size;

.field final synthetic $spacing:F


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;FLandroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/paywalls/components/properties/Size;",
            "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;",
            "F",
            "Landroidx/compose/ui/e;",
            "Lkotlin/jvm/functions/Function1;",
            "II)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt$HorizontalStack$2;->$size:Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt$HorizontalStack$2;->$dimension:Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;

    .line 4
    .line 5
    iput p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt$HorizontalStack$2;->$spacing:F

    .line 6
    .line 7
    iput-object p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt$HorizontalStack$2;->$modifier:Landroidx/compose/ui/e;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt$HorizontalStack$2;->$content:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    iput p6, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt$HorizontalStack$2;->$$changed:I

    .line 12
    .line 13
    iput p7, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt$HorizontalStack$2;->$$default:I

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt$HorizontalStack$2;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 8

    .line 2
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt$HorizontalStack$2;->$size:Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt$HorizontalStack$2;->$dimension:Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;

    iget v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt$HorizontalStack$2;->$spacing:F

    iget-object v3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt$HorizontalStack$2;->$modifier:Landroidx/compose/ui/e;

    iget-object v4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt$HorizontalStack$2;->$content:Lkotlin/jvm/functions/Function1;

    iget p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt$HorizontalStack$2;->$$changed:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LY/g1;->a(I)I

    move-result v6

    iget v7, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt$HorizontalStack$2;->$$default:I

    move-object v5, p1

    invoke-static/range {v0 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt;->HorizontalStack-TN_CM5M(Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;FLandroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LY/m;II)V

    return-void
.end method
