.class final Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$processVariables$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->processVariables(Ljava/lang/String;Ljava/util/Map;Lcom/revenuecat/purchases/UiConfig$VariableConfig;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/models/SubscriptionOption;Ljava/util/Locale;Ljava/util/Locale;Ljava/util/Date;Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;Ljava/util/Map;Ljava/util/Map;)Ljava/lang/String;
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
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0004H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "variable",
        "functions",
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
.field final synthetic $countFrom:Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;

.field final synthetic $countdownTime:Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;

.field final synthetic $currencyLocale:Ljava/util/Locale;

.field final synthetic $customVariables:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $date:Ljava/util/Date;

.field final synthetic $dateLocale:Ljava/util/Locale;

.field final synthetic $defaultCustomVariables:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $localizedVariableKeys:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $packageContext:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;

.field final synthetic $rcPackage:Lcom/revenuecat/purchases/Package;

.field final synthetic $subscriptionOption:Lcom/revenuecat/purchases/models/SubscriptionOption;

.field final synthetic $variableConfig:Lcom/revenuecat/purchases/UiConfig$VariableConfig;

.field final synthetic $variableDataProvider:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;


# direct methods
.method constructor <init>(Ljava/util/Map;Lcom/revenuecat/purchases/UiConfig$VariableConfig;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/models/SubscriptionOption;Ljava/util/Locale;Ljava/util/Locale;Ljava/util/Date;Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;Ljava/util/Map;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/revenuecat/purchases/UiConfig$VariableConfig;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;",
            "Lcom/revenuecat/purchases/Package;",
            "Lcom/revenuecat/purchases/models/SubscriptionOption;",
            "Ljava/util/Locale;",
            "Ljava/util/Locale;",
            "Ljava/util/Date;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;",
            "Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$processVariables$1;->$localizedVariableKeys:Ljava/util/Map;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$processVariables$1;->$variableConfig:Lcom/revenuecat/purchases/UiConfig$VariableConfig;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$processVariables$1;->$variableDataProvider:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$processVariables$1;->$packageContext:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$processVariables$1;->$rcPackage:Lcom/revenuecat/purchases/Package;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$processVariables$1;->$subscriptionOption:Lcom/revenuecat/purchases/models/SubscriptionOption;

    .line 12
    .line 13
    iput-object p7, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$processVariables$1;->$currencyLocale:Ljava/util/Locale;

    .line 14
    .line 15
    iput-object p8, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$processVariables$1;->$dateLocale:Ljava/util/Locale;

    .line 16
    .line 17
    iput-object p9, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$processVariables$1;->$date:Ljava/util/Date;

    .line 18
    .line 19
    iput-object p10, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$processVariables$1;->$countdownTime:Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;

    .line 20
    .line 21
    iput-object p11, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$processVariables$1;->$countFrom:Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;

    .line 22
    .line 23
    iput-object p12, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$processVariables$1;->$customVariables:Ljava/util/Map;

    .line 24
    .line 25
    iput-object p13, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$processVariables$1;->$defaultCustomVariables:Ljava/util/Map;

    .line 26
    .line 27
    const/4 p1, 0x2

    .line 28
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 29
    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$processVariables$1;->invoke(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "variable"

    move-object/from16 v3, p1

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "functions"

    move-object/from16 v4, p2

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v2, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;

    .line 3
    iget-object v5, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$processVariables$1;->$localizedVariableKeys:Ljava/util/Map;

    .line 4
    iget-object v6, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$processVariables$1;->$variableConfig:Lcom/revenuecat/purchases/UiConfig$VariableConfig;

    .line 5
    iget-object v7, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$processVariables$1;->$variableDataProvider:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;

    .line 6
    iget-object v8, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$processVariables$1;->$packageContext:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;

    .line 7
    iget-object v9, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$processVariables$1;->$rcPackage:Lcom/revenuecat/purchases/Package;

    .line 8
    iget-object v10, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$processVariables$1;->$subscriptionOption:Lcom/revenuecat/purchases/models/SubscriptionOption;

    .line 9
    iget-object v11, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$processVariables$1;->$currencyLocale:Ljava/util/Locale;

    .line 10
    iget-object v12, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$processVariables$1;->$dateLocale:Ljava/util/Locale;

    .line 11
    iget-object v13, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$processVariables$1;->$date:Ljava/util/Date;

    .line 12
    iget-object v14, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$processVariables$1;->$countdownTime:Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;

    .line 13
    iget-object v15, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$processVariables$1;->$countFrom:Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;

    .line 14
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$processVariables$1;->$customVariables:Ljava/util/Map;

    move-object/from16 v16, v1

    .line 15
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$processVariables$1;->$defaultCustomVariables:Ljava/util/Map;

    move-object/from16 v17, v1

    .line 16
    invoke-static/range {v2 .. v17}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->access$getVariableValue(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lcom/revenuecat/purchases/UiConfig$VariableConfig;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/models/SubscriptionOption;Ljava/util/Locale;Ljava/util/Locale;Ljava/util/Date;Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;Ljava/util/Map;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method
