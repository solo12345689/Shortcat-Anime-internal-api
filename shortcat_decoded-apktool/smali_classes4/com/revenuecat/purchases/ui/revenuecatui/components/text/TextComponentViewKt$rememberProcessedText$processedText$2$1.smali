.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentViewKt$rememberProcessedText$processedText$2$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentViewKt;->rememberProcessedText(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;LY/m;I)Ljava/lang/String;
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
        "\u0000\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
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
.field final synthetic $state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

.field final synthetic $textState:Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentViewKt$rememberProcessedText$processedText$2$1;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentViewKt$rememberProcessedText$processedText$2$1;->$textState:Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentViewKt$rememberProcessedText$processedText$2$1;->invoke()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    .line 2
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentViewKt$rememberProcessedText$processedText$2$1;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;->getLocale()Lc1/d;

    move-result-object v1

    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/LocalizationKt;->toJavaLocale(Lc1/d;)Ljava/util/Locale;

    move-result-object v11

    .line 3
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentViewKt$rememberProcessedText$processedText$2$1;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;->getCurrencyLocale()Lc1/d;

    move-result-object v1

    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/LocalizationKt;->toJavaLocale(Lc1/d;)Ljava/util/Locale;

    move-result-object v10

    .line 4
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentViewKt$rememberProcessedText$processedText$2$1;->$textState:Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;->getApplicablePackage()Lcom/revenuecat/purchases/Package;

    move-result-object v8

    const/4 v1, 0x0

    if-eqz v8, :cond_1

    .line 5
    iget-object v2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentViewKt$rememberProcessedText$processedText$2$1;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    .line 6
    invoke-virtual {v8}, Lcom/revenuecat/purchases/Package;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v3, v1, v4, v1}, Lcom/revenuecat/purchases/models/StoreProduct;->pricePerMonth$default(Lcom/revenuecat/purchases/models/StoreProduct;Ljava/util/Locale;ILjava/lang/Object;)Lcom/revenuecat/purchases/models/Price;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/revenuecat/purchases/models/Price;->getAmountMicros()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 7
    :cond_0
    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;->getMostExpensivePricePerMonthMicros()Ljava/lang/Long;

    move-result-object v3

    .line 8
    invoke-static {v1, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentViewKt;->access$discountPercentage(Ljava/lang/Long;Ljava/lang/Long;)Ljava/lang/Double;

    move-result-object v1

    .line 9
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;

    .line 10
    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;->getShowPricesWithDecimals()Z

    move-result v2

    xor-int/2addr v2, v4

    .line 11
    invoke-direct {v3, v1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;-><init>(Ljava/lang/Double;Z)V

    move-object v7, v3

    goto :goto_0

    :cond_1
    move-object v7, v1

    .line 12
    :goto_0
    sget-object v2, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;

    .line 13
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentViewKt$rememberProcessedText$processedText$2$1;->$textState:Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;->getText()Ljava/lang/String;

    move-result-object v3

    .line 14
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentViewKt$rememberProcessedText$processedText$2$1;->$textState:Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;->getLocalizedVariableKeys()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;

    move-result-object v4

    .line 15
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentViewKt$rememberProcessedText$processedText$2$1;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;->getVariableConfig()Lcom/revenuecat/purchases/UiConfig$VariableConfig;

    move-result-object v5

    .line 16
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentViewKt$rememberProcessedText$processedText$2$1;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;->getVariableDataProvider()Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;

    move-result-object v6

    .line 17
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentViewKt$rememberProcessedText$processedText$2$1;->$textState:Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;->getSubscriptionOption()Lcom/revenuecat/purchases/models/SubscriptionOption;

    move-result-object v9

    .line 18
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentViewKt$rememberProcessedText$processedText$2$1;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;->getCurrentDate()Ljava/util/Date;

    move-result-object v12

    .line 19
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentViewKt$rememberProcessedText$processedText$2$1;->$textState:Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;->getCountdownTime()Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;

    move-result-object v13

    .line 20
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentViewKt$rememberProcessedText$processedText$2$1;->$textState:Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;->getCountFrom()Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;

    move-result-object v14

    .line 21
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentViewKt$rememberProcessedText$processedText$2$1;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;->getCustomVariables()Ljava/util/Map;

    move-result-object v15

    .line 22
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentViewKt$rememberProcessedText$processedText$2$1;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;->getDefaultCustomVariables()Ljava/util/Map;

    move-result-object v16

    .line 23
    invoke-virtual/range {v2 .. v16}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->processVariables(Ljava/lang/String;Ljava/util/Map;Lcom/revenuecat/purchases/UiConfig$VariableConfig;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/models/SubscriptionOption;Ljava/util/Locale;Ljava/util/Locale;Ljava/util/Date;Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;Ljava/util/Map;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method
