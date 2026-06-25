.class final Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityStateView$2;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt;->IntroEligibilityStateView-QETHhvg(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;JLU0/Y0;LY0/L;Lg1/j;ZLandroidx/compose/ui/e;LY/m;II)V
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

.field final synthetic $allowLinks:Z

.field final synthetic $color:J

.field final synthetic $eligibility:Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;

.field final synthetic $fontWeight:LY0/L;

.field final synthetic $modifier:Landroidx/compose/ui/e;

.field final synthetic $style:LU0/Y0;

.field final synthetic $textAlign:Lg1/j;

.field final synthetic $textWithIntroOffer:Ljava/lang/String;

.field final synthetic $textWithMultipleIntroOffers:Ljava/lang/String;

.field final synthetic $textWithNoIntroOffer:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;JLU0/Y0;LY0/L;Lg1/j;ZLandroidx/compose/ui/e;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityStateView$2;->$textWithNoIntroOffer:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityStateView$2;->$textWithIntroOffer:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityStateView$2;->$textWithMultipleIntroOffers:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityStateView$2;->$eligibility:Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;

    .line 8
    .line 9
    iput-wide p5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityStateView$2;->$color:J

    .line 10
    .line 11
    iput-object p7, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityStateView$2;->$style:LU0/Y0;

    .line 12
    .line 13
    iput-object p8, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityStateView$2;->$fontWeight:LY0/L;

    .line 14
    .line 15
    iput-object p9, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityStateView$2;->$textAlign:Lg1/j;

    .line 16
    .line 17
    iput-boolean p10, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityStateView$2;->$allowLinks:Z

    .line 18
    .line 19
    iput-object p11, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityStateView$2;->$modifier:Landroidx/compose/ui/e;

    .line 20
    .line 21
    iput p12, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityStateView$2;->$$changed:I

    .line 22
    .line 23
    iput p13, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityStateView$2;->$$default:I

    .line 24
    .line 25
    const/4 p1, 0x2

    .line 26
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 27
    .line 28
    .line 29
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

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityStateView$2;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 14

    .line 2
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityStateView$2;->$textWithNoIntroOffer:Ljava/lang/String;

    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityStateView$2;->$textWithIntroOffer:Ljava/lang/String;

    iget-object v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityStateView$2;->$textWithMultipleIntroOffers:Ljava/lang/String;

    iget-object v3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityStateView$2;->$eligibility:Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;

    iget-wide v4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityStateView$2;->$color:J

    iget-object v6, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityStateView$2;->$style:LU0/Y0;

    iget-object v7, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityStateView$2;->$fontWeight:LY0/L;

    iget-object v8, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityStateView$2;->$textAlign:Lg1/j;

    iget-boolean v9, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityStateView$2;->$allowLinks:Z

    iget-object v10, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityStateView$2;->$modifier:Landroidx/compose/ui/e;

    iget v11, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityStateView$2;->$$changed:I

    or-int/lit8 v11, v11, 0x1

    invoke-static {v11}, LY/g1;->a(I)I

    move-result v12

    iget v13, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityStateView$2;->$$default:I

    move-object v11, p1

    invoke-static/range {v0 .. v13}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt;->IntroEligibilityStateView-QETHhvg(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;JLU0/Y0;LY0/L;Lg1/j;ZLandroidx/compose/ui/e;LY/m;II)V

    return-void
.end method
