.class public final Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Function;,
        Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Variable;,
        Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c0\u0002\u0018\u00002\u00020\u0001:\u0002VWB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J3\u0010\u0008\u001a\u00020\u0004*\u00020\u00042\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0004\u0012\u00020\u00040\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u00bb\u0001\u0010%\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00062\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u000c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\"0\u000c2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\"0\u000cH\u0002\u00a2\u0006\u0004\u0008%\u0010&J\u0019\u0010\'\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010\n\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008*\u0010+JU\u0010/\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\"0\u000c2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\"0\u000c2\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u00020-0\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\u0008/\u00100J-\u00103\u001a\u0004\u0018\u0001022\u0006\u0010\n\u001a\u00020\u00042\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000cH\u0002\u00a2\u0006\u0004\u00083\u00104J-\u00107\u001a\u0004\u0018\u00010-2\u0006\u00105\u001a\u00020\u00042\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000cH\u0002\u00a2\u0006\u0004\u00087\u00108J#\u0010:\u001a\u00020)*\u0002092\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008:\u0010;J#\u0010>\u001a\u00020)*\u0002092\u0006\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008>\u0010?J\u001b\u0010@\u001a\u00020)*\u0002092\u0006\u0010\n\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008@\u0010AJ#\u0010B\u001a\u00020)*\u0002092\u0006\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008B\u0010?J\u001b\u0010C\u001a\u00020)*\u0002092\u0006\u00105\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008C\u0010AJ{\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u0002022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u000c2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010DJ#\u0010G\u001a\u00020\u0004*\u00020\u00042\u0006\u0010E\u001a\u00020-2\u0006\u0010F\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\u0008G\u0010HJ)\u0010I\u001a\u0004\u0018\u00010\u0004*\u00020\u00132\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u000cH\u0002\u00a2\u0006\u0004\u0008I\u0010JJ\u00c1\u0001\u0010L\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u00042\u0014\u0008\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u000c2\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u001c2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0008\u0008\u0002\u0010!\u001a\u00020 2\u0014\u0008\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\"0\u000c2\u0014\u0008\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\"0\u000c\u00a2\u0006\u0004\u0008L\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008O\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008R\u0010SR\u001a\u0010T\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008T\u0010U\u00a8\u0006X"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;",
        "",
        "<init>",
        "()V",
        "",
        "Lkotlin/Function2;",
        "",
        "getValue",
        "replaceVariablesWithValues",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;",
        "variableIdentifier",
        "functionIdentifiers",
        "",
        "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;",
        "localizedVariableKeys",
        "Lcom/revenuecat/purchases/UiConfig$VariableConfig;",
        "variableConfig",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;",
        "variableDataProvider",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;",
        "packageContext",
        "Lcom/revenuecat/purchases/Package;",
        "rcPackage",
        "Lcom/revenuecat/purchases/models/SubscriptionOption;",
        "subscriptionOption",
        "Ljava/util/Locale;",
        "currencyLocale",
        "dateLocale",
        "Ljava/util/Date;",
        "date",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;",
        "countdownTime",
        "Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;",
        "countFrom",
        "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;",
        "customVariables",
        "defaultCustomVariables",
        "getVariableValue",
        "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lcom/revenuecat/purchases/UiConfig$VariableConfig;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/models/SubscriptionOption;Ljava/util/Locale;Ljava/util/Locale;Ljava/util/Date;Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;Ljava/util/Map;Ljava/util/Map;)Ljava/lang/String;",
        "extractCustomVariableKey",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "LTd/L;",
        "checkForMalformedCustomVariable",
        "(Ljava/lang/String;)V",
        "key",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Function;",
        "functions",
        "resolveCustomVariable",
        "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/Locale;)Ljava/lang/String;",
        "variableCompatibilityMap",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Variable;",
        "findVariable",
        "(Ljava/lang/String;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Variable;",
        "functionIdentifier",
        "functionCompatibilityMap",
        "findFunction",
        "(Ljava/lang/String;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Function;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;",
        "failedToGetValue",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;Ljava/lang/String;Lcom/revenuecat/purchases/Package;)V",
        "original",
        "fallback",
        "usingFallbackVariable",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;Ljava/lang/String;Ljava/lang/String;)V",
        "unsupportedVariableWithoutFallback",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;Ljava/lang/String;)V",
        "usingFallbackFunction",
        "unsupportedFunctionWithoutFallback",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Variable;Ljava/util/Map;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/models/SubscriptionOption;Ljava/util/Locale;Ljava/util/Locale;Ljava/util/Date;Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;)Ljava/lang/String;",
        "function",
        "locale",
        "processFunction",
        "(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Function;Ljava/util/Locale;)Ljava/lang/String;",
        "relativeDiscount",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Ljava/util/Map;)Ljava/lang/String;",
        "template",
        "processVariables",
        "(Ljava/lang/String;Ljava/util/Map;Lcom/revenuecat/purchases/UiConfig$VariableConfig;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/models/SubscriptionOption;Ljava/util/Locale;Ljava/util/Locale;Ljava/util/Date;Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;Ljava/util/Map;Ljava/util/Map;)Ljava/lang/String;",
        "",
        "PERCENT_SCALE",
        "F",
        "LDf/p;",
        "regex",
        "LDf/p;",
        "customVariablePrefixes",
        "Ljava/util/List;",
        "Function",
        "Variable",
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

.field public static final INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;

.field private static final PERCENT_SCALE:F = 100.0f

.field private static final customVariablePrefixes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final regex:LDf/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;

    .line 7
    .line 8
    new-instance v0, LDf/p;

    .line 9
    .line 10
    const-string v1, "\\{\\{\\s*(.*?)\\s*\\}\\}"

    .line 11
    .line 12
    invoke-direct {v0, v1}, LDf/p;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->regex:LDf/p;

    .line 16
    .line 17
    const-string v0, "custom."

    .line 18
    .line 19
    const-string v1, "$custom."

    .line 20
    .line 21
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->customVariablePrefixes:Ljava/util/List;

    .line 30
    .line 31
    const/16 v0, 0x8

    .line 32
    .line 33
    sput v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->$stable:I

    .line 34
    .line 35
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getVariableValue(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lcom/revenuecat/purchases/UiConfig$VariableConfig;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/models/SubscriptionOption;Ljava/util/Locale;Ljava/util/Locale;Ljava/util/Date;Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;Ljava/util/Map;Ljava/util/Map;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p15}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->getVariableValue(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lcom/revenuecat/purchases/UiConfig$VariableConfig;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/models/SubscriptionOption;Ljava/util/Locale;Ljava/util/Locale;Ljava/util/Date;Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;Ljava/util/Map;Ljava/util/Map;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final checkForMalformedCustomVariable(Ljava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, "custom"

    .line 2
    .line 3
    const-string v1, "$custom"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    new-instance v2, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const/16 v1, 0x20

    .line 44
    .line 45
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    const/4 v2, 0x2

    .line 53
    const/4 v3, 0x0

    .line 54
    const/4 v4, 0x0

    .line 55
    invoke-static {p1, v1, v4, v2, v3}, LDf/r;->Q(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_0

    .line 60
    .line 61
    :cond_1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 62
    .line 63
    new-instance v1, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v2, "Variable \'"

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string p1, "\' looks like it might be intended as a custom variable. Use \'custom.<variable_name>\' or \'$custom.<variable_name>\' syntax instead."

    .line 77
    .line 78
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->w(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :cond_2
    return-void
.end method

.method private final extractCustomVariableKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->customVariablePrefixes:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/lang/String;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x2

    .line 22
    invoke-static {p1, v1, v3, v4, v2}, LDf/r;->Q(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    invoke-static {p1, v1}, LDf/r;->C0(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 39
    .line 40
    new-instance v1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    const-string v3, "Custom variable \'"

    .line 46
    .line 47
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p1, "\' appears to be malformed. Expected format: \'custom.<variable_name>\' or \'$custom.<variable_name>\'."

    .line 54
    .line 55
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->w(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v2

    .line 66
    :cond_1
    return-object v0

    .line 67
    :cond_2
    invoke-direct {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->checkForMalformedCustomVariable(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-object v2
.end method

.method private final failedToGetValue(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;Ljava/lang/String;Lcom/revenuecat/purchases/Package;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Could not process value for variable \'"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p2, "\' for package \'"

    .line 15
    .line 16
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p3}, Lcom/revenuecat/purchases/Package;->getIdentifier()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string p2, "\'. Please check that the product for that package matches the requirements for that variable. Defaulting to empty string."

    .line 27
    .line 28
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->w(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method private final findFunction(Ljava/lang/String;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Function;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Function;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Function;->Companion:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Function$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Function$Companion;->valueOfIdentifier(Ljava/lang/String;)Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Function;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/lang/String;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-direct {p0, v0, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->findFunction(Ljava/lang/String;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Function;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;

    .line 26
    .line 27
    sget-object v2, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 28
    .line 29
    invoke-direct {v1, v2, p1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->usingFallbackFunction(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object p2

    .line 33
    :cond_1
    return-object v1

    .line 34
    :cond_2
    sget-object p2, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 35
    .line 36
    invoke-direct {p0, p2, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->unsupportedFunctionWithoutFallback(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-object v1
.end method

.method private final findVariable(Ljava/lang/String;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Variable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Variable;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Variable;->Companion:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Variable$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Variable$Companion;->valueOfIdentifier(Ljava/lang/String;)Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Variable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/lang/String;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-direct {p0, v0, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->findVariable(Ljava/lang/String;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Variable;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;

    .line 26
    .line 27
    sget-object v2, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 28
    .line 29
    invoke-direct {v1, v2, p1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->usingFallbackVariable(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object p2

    .line 33
    :cond_1
    return-object v1

    .line 34
    :cond_2
    sget-object p2, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 35
    .line 36
    invoke-direct {p0, p2, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->unsupportedVariableWithoutFallback(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-object v1
.end method

.method private final getValue(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Variable;Ljava/util/Map;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/models/SubscriptionOption;Ljava/util/Locale;Ljava/util/Locale;Ljava/util/Date;Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;)Ljava/lang/String;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Variable;",
            "Ljava/util/Map<",
            "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;",
            "Lcom/revenuecat/purchases/Package;",
            "Lcom/revenuecat/purchases/models/SubscriptionOption;",
            "Ljava/util/Locale;",
            "Ljava/util/Locale;",
            "Ljava/util/Date;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;",
            "Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    move-object/from16 v3, p5

    .line 8
    .line 9
    move-object/from16 v4, p6

    .line 10
    .line 11
    move-object/from16 v5, p7

    .line 12
    .line 13
    move-object/from16 v6, p8

    .line 14
    .line 15
    sget-object v7, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$WhenMappings;->$EnumSwitchMapping$1:[I

    .line 16
    .line 17
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    .line 18
    .line 19
    .line 20
    move-result v8

    .line 21
    aget v7, v7, v8

    .line 22
    .line 23
    const/16 v8, 0x2f

    .line 24
    .line 25
    const-string v9, "%02d"

    .line 26
    .line 27
    const-string v10, "%d"

    .line 28
    .line 29
    const/4 v11, 0x3

    .line 30
    const/4 v12, 0x2

    .line 31
    const-string v13, ""

    .line 32
    .line 33
    const-string v14, "format(...)"

    .line 34
    .line 35
    const/4 v15, 0x1

    .line 36
    const/16 v16, 0x0

    .line 37
    .line 38
    const/16 v17, 0x0

    .line 39
    .line 40
    packed-switch v7, :pswitch_data_0

    .line 41
    .line 42
    .line 43
    new-instance v0, LTd/r;

    .line 44
    .line 45
    invoke-direct {v0}, LTd/r;-><init>()V

    .line 46
    .line 47
    .line 48
    throw v0

    .line 49
    :pswitch_0
    if-eqz p10, :cond_0

    .line 50
    .line 51
    invoke-virtual/range {p10 .. p10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;->getSeconds()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    sget-object v1, Lkotlin/jvm/internal/U;->a:Lkotlin/jvm/internal/U;

    .line 56
    .line 57
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v0, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-static {v6, v10, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {v0, v14}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    return-object v0

    .line 77
    :cond_0
    return-object v13

    .line 78
    :pswitch_1
    if-eqz p10, :cond_1

    .line 79
    .line 80
    invoke-virtual/range {p10 .. p10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;->getSeconds()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    sget-object v1, Lkotlin/jvm/internal/U;->a:Lkotlin/jvm/internal/U;

    .line 85
    .line 86
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {v0, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {v6, v9, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {v0, v14}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    return-object v0

    .line 106
    :cond_1
    return-object v13

    .line 107
    :pswitch_2
    if-eqz p10, :cond_4

    .line 108
    .line 109
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 110
    .line 111
    invoke-virtual/range {p11 .. p11}, Ljava/lang/Enum;->ordinal()I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    aget v0, v0, v1

    .line 116
    .line 117
    if-eq v0, v15, :cond_3

    .line 118
    .line 119
    if-eq v0, v12, :cond_3

    .line 120
    .line 121
    if-ne v0, v11, :cond_2

    .line 122
    .line 123
    invoke-virtual/range {p10 .. p10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;->getTotalMinutes()I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    goto :goto_0

    .line 128
    :cond_2
    new-instance v0, LTd/r;

    .line 129
    .line 130
    invoke-direct {v0}, LTd/r;-><init>()V

    .line 131
    .line 132
    .line 133
    throw v0

    .line 134
    :cond_3
    invoke-virtual/range {p10 .. p10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;->getMinutes()I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    :goto_0
    sget-object v1, Lkotlin/jvm/internal/U;->a:Lkotlin/jvm/internal/U;

    .line 139
    .line 140
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-static {v0, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-static {v6, v10, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-static {v0, v14}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    return-object v0

    .line 160
    :cond_4
    return-object v13

    .line 161
    :pswitch_3
    if-eqz p10, :cond_7

    .line 162
    .line 163
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 164
    .line 165
    invoke-virtual/range {p11 .. p11}, Ljava/lang/Enum;->ordinal()I

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    aget v0, v0, v1

    .line 170
    .line 171
    if-eq v0, v15, :cond_6

    .line 172
    .line 173
    if-eq v0, v12, :cond_6

    .line 174
    .line 175
    if-ne v0, v11, :cond_5

    .line 176
    .line 177
    invoke-virtual/range {p10 .. p10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;->getTotalMinutes()I

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    goto :goto_1

    .line 182
    :cond_5
    new-instance v0, LTd/r;

    .line 183
    .line 184
    invoke-direct {v0}, LTd/r;-><init>()V

    .line 185
    .line 186
    .line 187
    throw v0

    .line 188
    :cond_6
    invoke-virtual/range {p10 .. p10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;->getMinutes()I

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    :goto_1
    sget-object v1, Lkotlin/jvm/internal/U;->a:Lkotlin/jvm/internal/U;

    .line 193
    .line 194
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-static {v0, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-static {v6, v9, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-static {v0, v14}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    return-object v0

    .line 214
    :cond_7
    return-object v13

    .line 215
    :pswitch_4
    if-eqz p10, :cond_b

    .line 216
    .line 217
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 218
    .line 219
    invoke-virtual/range {p11 .. p11}, Ljava/lang/Enum;->ordinal()I

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    aget v0, v0, v1

    .line 224
    .line 225
    if-eq v0, v15, :cond_a

    .line 226
    .line 227
    if-eq v0, v12, :cond_9

    .line 228
    .line 229
    if-ne v0, v11, :cond_8

    .line 230
    .line 231
    goto :goto_2

    .line 232
    :cond_8
    new-instance v0, LTd/r;

    .line 233
    .line 234
    invoke-direct {v0}, LTd/r;-><init>()V

    .line 235
    .line 236
    .line 237
    throw v0

    .line 238
    :cond_9
    invoke-virtual/range {p10 .. p10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;->getTotalHours()I

    .line 239
    .line 240
    .line 241
    move-result v16

    .line 242
    goto :goto_2

    .line 243
    :cond_a
    invoke-virtual/range {p10 .. p10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;->getHours()I

    .line 244
    .line 245
    .line 246
    move-result v16

    .line 247
    :goto_2
    sget-object v0, Lkotlin/jvm/internal/U;->a:Lkotlin/jvm/internal/U;

    .line 248
    .line 249
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-static {v0, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-static {v6, v10, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-static {v0, v14}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    return-object v0

    .line 269
    :cond_b
    return-object v13

    .line 270
    :pswitch_5
    if-eqz p10, :cond_f

    .line 271
    .line 272
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 273
    .line 274
    invoke-virtual/range {p11 .. p11}, Ljava/lang/Enum;->ordinal()I

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    aget v0, v0, v1

    .line 279
    .line 280
    if-eq v0, v15, :cond_e

    .line 281
    .line 282
    if-eq v0, v12, :cond_d

    .line 283
    .line 284
    if-ne v0, v11, :cond_c

    .line 285
    .line 286
    goto :goto_3

    .line 287
    :cond_c
    new-instance v0, LTd/r;

    .line 288
    .line 289
    invoke-direct {v0}, LTd/r;-><init>()V

    .line 290
    .line 291
    .line 292
    throw v0

    .line 293
    :cond_d
    invoke-virtual/range {p10 .. p10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;->getTotalHours()I

    .line 294
    .line 295
    .line 296
    move-result v16

    .line 297
    goto :goto_3

    .line 298
    :cond_e
    invoke-virtual/range {p10 .. p10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;->getHours()I

    .line 299
    .line 300
    .line 301
    move-result v16

    .line 302
    :goto_3
    sget-object v0, Lkotlin/jvm/internal/U;->a:Lkotlin/jvm/internal/U;

    .line 303
    .line 304
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    invoke-static {v0, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    invoke-static {v6, v9, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    invoke-static {v0, v14}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    return-object v0

    .line 324
    :cond_f
    return-object v13

    .line 325
    :pswitch_6
    if-eqz p10, :cond_13

    .line 326
    .line 327
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 328
    .line 329
    invoke-virtual/range {p11 .. p11}, Ljava/lang/Enum;->ordinal()I

    .line 330
    .line 331
    .line 332
    move-result v1

    .line 333
    aget v0, v0, v1

    .line 334
    .line 335
    if-eq v0, v15, :cond_11

    .line 336
    .line 337
    if-eq v0, v12, :cond_12

    .line 338
    .line 339
    if-ne v0, v11, :cond_10

    .line 340
    .line 341
    goto :goto_4

    .line 342
    :cond_10
    new-instance v0, LTd/r;

    .line 343
    .line 344
    invoke-direct {v0}, LTd/r;-><init>()V

    .line 345
    .line 346
    .line 347
    throw v0

    .line 348
    :cond_11
    invoke-virtual/range {p10 .. p10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;->getDays()I

    .line 349
    .line 350
    .line 351
    move-result v16

    .line 352
    :cond_12
    :goto_4
    sget-object v0, Lkotlin/jvm/internal/U;->a:Lkotlin/jvm/internal/U;

    .line 353
    .line 354
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-static {v0, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    invoke-static {v6, v10, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    invoke-static {v0, v14}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    return-object v0

    .line 374
    :cond_13
    return-object v13

    .line 375
    :pswitch_7
    if-eqz p10, :cond_17

    .line 376
    .line 377
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 378
    .line 379
    invoke-virtual/range {p11 .. p11}, Ljava/lang/Enum;->ordinal()I

    .line 380
    .line 381
    .line 382
    move-result v1

    .line 383
    aget v0, v0, v1

    .line 384
    .line 385
    if-eq v0, v15, :cond_15

    .line 386
    .line 387
    if-eq v0, v12, :cond_16

    .line 388
    .line 389
    if-ne v0, v11, :cond_14

    .line 390
    .line 391
    goto :goto_5

    .line 392
    :cond_14
    new-instance v0, LTd/r;

    .line 393
    .line 394
    invoke-direct {v0}, LTd/r;-><init>()V

    .line 395
    .line 396
    .line 397
    throw v0

    .line 398
    :cond_15
    invoke-virtual/range {p10 .. p10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;->getDays()I

    .line 399
    .line 400
    .line 401
    move-result v16

    .line 402
    :cond_16
    :goto_5
    sget-object v0, Lkotlin/jvm/internal/U;->a:Lkotlin/jvm/internal/U;

    .line 403
    .line 404
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    invoke-static {v0, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    invoke-static {v6, v9, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    invoke-static {v0, v14}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    return-object v0

    .line 424
    :cond_17
    return-object v13

    .line 425
    :pswitch_8
    if-eqz v3, :cond_18

    .line 426
    .line 427
    invoke-virtual {v3}, Lcom/revenuecat/purchases/Package;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    if-eqz v0, :cond_18

    .line 432
    .line 433
    invoke-interface {v0}, Lcom/revenuecat/purchases/models/StoreProduct;->getName()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    return-object v0

    .line 438
    :cond_18
    return-object v17

    .line 439
    :pswitch_9
    if-eqz v2, :cond_19

    .line 440
    .line 441
    move-object/from16 v7, p0

    .line 442
    .line 443
    invoke-direct {v7, v2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->relativeDiscount(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Ljava/util/Map;)Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    return-object v0

    .line 448
    :cond_19
    move-object/from16 v7, p0

    .line 449
    .line 450
    return-object v17

    .line 451
    :pswitch_a
    move-object/from16 v7, p0

    .line 452
    .line 453
    invoke-static {v4, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->secondaryDiscountPhase(Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/Package;)Lcom/revenuecat/purchases/models/PricingPhase;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$getValue$21;

    .line 458
    .line 459
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$getValue$21;-><init>(Ljava/util/Map;)V

    .line 460
    .line 461
    .line 462
    new-instance v4, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$getValue$22;

    .line 463
    .line 464
    invoke-direct {v4, v3, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$getValue$22;-><init>(Lcom/revenuecat/purchases/Package;Ljava/util/Map;)V

    .line 465
    .line 466
    .line 467
    invoke-static {v1, v2, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->resolveOfferPeriod(Lcom/revenuecat/purchases/models/PricingPhase;Lkotlin/jvm/functions/Function1;Lie/a;)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    return-object v0

    .line 472
    :pswitch_b
    move-object/from16 v7, p0

    .line 473
    .line 474
    invoke-static {v4, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->secondaryDiscountPhase(Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/Package;)Lcom/revenuecat/purchases/models/PricingPhase;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$getValue$19;

    .line 479
    .line 480
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$getValue$19;-><init>(Ljava/util/Map;)V

    .line 481
    .line 482
    .line 483
    new-instance v4, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$getValue$20;

    .line 484
    .line 485
    invoke-direct {v4, v3, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$getValue$20;-><init>(Lcom/revenuecat/purchases/Package;Ljava/util/Map;)V

    .line 486
    .line 487
    .line 488
    invoke-static {v1, v2, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->resolveOfferPeriod(Lcom/revenuecat/purchases/models/PricingPhase;Lkotlin/jvm/functions/Function1;Lie/a;)Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    return-object v0

    .line 493
    :pswitch_c
    move-object/from16 v7, p0

    .line 494
    .line 495
    invoke-static {v4, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->secondaryDiscountPhase(Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/Package;)Lcom/revenuecat/purchases/models/PricingPhase;

    .line 496
    .line 497
    .line 498
    move-result-object v4

    .line 499
    new-instance v6, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$getValue$18;

    .line 500
    .line 501
    invoke-direct {v6, v3, v2, v1, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$getValue$18;-><init>(Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Ljava/util/Locale;)V

    .line 502
    .line 503
    .line 504
    invoke-static {v4, v5, v0, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->resolveOfferPrice(Lcom/revenuecat/purchases/models/PricingPhase;Ljava/util/Locale;Ljava/util/Map;Lie/a;)Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    return-object v0

    .line 509
    :pswitch_d
    move-object/from16 v7, p0

    .line 510
    .line 511
    invoke-static {v4, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->primaryDiscountPhase(Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/Package;)Lcom/revenuecat/purchases/models/PricingPhase;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    if-eqz v0, :cond_1a

    .line 516
    .line 517
    move-object/from16 v1, p9

    .line 518
    .line 519
    invoke-static {v0, v6, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->productOfferEndDate(Lcom/revenuecat/purchases/models/PricingPhase;Ljava/util/Locale;Ljava/util/Date;)Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    return-object v0

    .line 524
    :cond_1a
    return-object v17

    .line 525
    :pswitch_e
    move-object/from16 v7, p0

    .line 526
    .line 527
    invoke-static {v4, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->primaryDiscountPhase(Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/Package;)Lcom/revenuecat/purchases/models/PricingPhase;

    .line 528
    .line 529
    .line 530
    move-result-object v1

    .line 531
    if-eqz v1, :cond_1c

    .line 532
    .line 533
    invoke-static {v1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->productOfferPeriodWithUnit(Lcom/revenuecat/purchases/models/PricingPhase;Ljava/util/Map;)Ljava/lang/String;

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    if-nez v1, :cond_1b

    .line 538
    .line 539
    goto :goto_6

    .line 540
    :cond_1b
    return-object v1

    .line 541
    :cond_1c
    :goto_6
    if-eqz v3, :cond_1d

    .line 542
    .line 543
    invoke-static {v3, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->productPeriodWithUnit(Lcom/revenuecat/purchases/Package;Ljava/util/Map;)Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    return-object v0

    .line 548
    :cond_1d
    return-object v17

    .line 549
    :pswitch_f
    move-object/from16 v7, p0

    .line 550
    .line 551
    invoke-static {v4, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->primaryDiscountPhase(Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/Package;)Lcom/revenuecat/purchases/models/PricingPhase;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    if-eqz v0, :cond_1f

    .line 556
    .line 557
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->getProductOfferPeriodInYears(Lcom/revenuecat/purchases/models/PricingPhase;)Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    if-nez v0, :cond_1e

    .line 562
    .line 563
    goto :goto_7

    .line 564
    :cond_1e
    return-object v0

    .line 565
    :cond_1f
    :goto_7
    if-eqz v3, :cond_20

    .line 566
    .line 567
    invoke-virtual {v3}, Lcom/revenuecat/purchases/Package;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    if-eqz v0, :cond_20

    .line 572
    .line 573
    invoke-interface {v0}, Lcom/revenuecat/purchases/models/StoreProduct;->getPeriod()Lcom/revenuecat/purchases/models/Period;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    if-eqz v0, :cond_20

    .line 578
    .line 579
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PeriodExtensionsKt;->getRoundedValueInYears(Lcom/revenuecat/purchases/models/Period;)Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    return-object v0

    .line 584
    :cond_20
    return-object v17

    .line 585
    :pswitch_10
    move-object/from16 v7, p0

    .line 586
    .line 587
    invoke-static {v4, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->primaryDiscountPhase(Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/Package;)Lcom/revenuecat/purchases/models/PricingPhase;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    if-eqz v0, :cond_22

    .line 592
    .line 593
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->getProductOfferPeriodInMonths(Lcom/revenuecat/purchases/models/PricingPhase;)Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    if-nez v0, :cond_21

    .line 598
    .line 599
    goto :goto_8

    .line 600
    :cond_21
    return-object v0

    .line 601
    :cond_22
    :goto_8
    if-eqz v3, :cond_23

    .line 602
    .line 603
    invoke-virtual {v3}, Lcom/revenuecat/purchases/Package;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    if-eqz v0, :cond_23

    .line 608
    .line 609
    invoke-interface {v0}, Lcom/revenuecat/purchases/models/StoreProduct;->getPeriod()Lcom/revenuecat/purchases/models/Period;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    if-eqz v0, :cond_23

    .line 614
    .line 615
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PeriodExtensionsKt;->getRoundedValueInMonths(Lcom/revenuecat/purchases/models/Period;)Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    return-object v0

    .line 620
    :cond_23
    return-object v17

    .line 621
    :pswitch_11
    move-object/from16 v7, p0

    .line 622
    .line 623
    invoke-static {v4, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->primaryDiscountPhase(Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/Package;)Lcom/revenuecat/purchases/models/PricingPhase;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    if-eqz v0, :cond_25

    .line 628
    .line 629
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->getProductOfferPeriodInWeeks(Lcom/revenuecat/purchases/models/PricingPhase;)Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    if-nez v0, :cond_24

    .line 634
    .line 635
    goto :goto_9

    .line 636
    :cond_24
    return-object v0

    .line 637
    :cond_25
    :goto_9
    if-eqz v3, :cond_26

    .line 638
    .line 639
    invoke-virtual {v3}, Lcom/revenuecat/purchases/Package;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    if-eqz v0, :cond_26

    .line 644
    .line 645
    invoke-interface {v0}, Lcom/revenuecat/purchases/models/StoreProduct;->getPeriod()Lcom/revenuecat/purchases/models/Period;

    .line 646
    .line 647
    .line 648
    move-result-object v0

    .line 649
    if-eqz v0, :cond_26

    .line 650
    .line 651
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PeriodExtensionsKt;->getRoundedValueInWeeks(Lcom/revenuecat/purchases/models/Period;)Ljava/lang/String;

    .line 652
    .line 653
    .line 654
    move-result-object v0

    .line 655
    return-object v0

    .line 656
    :cond_26
    return-object v17

    .line 657
    :pswitch_12
    move-object/from16 v7, p0

    .line 658
    .line 659
    invoke-static {v4, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->primaryDiscountPhase(Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/Package;)Lcom/revenuecat/purchases/models/PricingPhase;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    if-eqz v0, :cond_28

    .line 664
    .line 665
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->getProductOfferPeriodInDays(Lcom/revenuecat/purchases/models/PricingPhase;)Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v0

    .line 669
    if-nez v0, :cond_27

    .line 670
    .line 671
    goto :goto_a

    .line 672
    :cond_27
    return-object v0

    .line 673
    :cond_28
    :goto_a
    if-eqz v3, :cond_29

    .line 674
    .line 675
    invoke-virtual {v3}, Lcom/revenuecat/purchases/Package;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    if-eqz v0, :cond_29

    .line 680
    .line 681
    invoke-interface {v0}, Lcom/revenuecat/purchases/models/StoreProduct;->getPeriod()Lcom/revenuecat/purchases/models/Period;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    if-eqz v0, :cond_29

    .line 686
    .line 687
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PeriodExtensionsKt;->getRoundedValueInDays(Lcom/revenuecat/purchases/models/Period;)Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    return-object v0

    .line 692
    :cond_29
    return-object v17

    .line 693
    :pswitch_13
    move-object/from16 v7, p0

    .line 694
    .line 695
    invoke-static {v4, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->primaryDiscountPhase(Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/Package;)Lcom/revenuecat/purchases/models/PricingPhase;

    .line 696
    .line 697
    .line 698
    move-result-object v1

    .line 699
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$getValue$16;

    .line 700
    .line 701
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$getValue$16;-><init>(Ljava/util/Map;)V

    .line 702
    .line 703
    .line 704
    new-instance v4, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$getValue$17;

    .line 705
    .line 706
    invoke-direct {v4, v3, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$getValue$17;-><init>(Lcom/revenuecat/purchases/Package;Ljava/util/Map;)V

    .line 707
    .line 708
    .line 709
    invoke-static {v1, v2, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->resolveOfferPeriod(Lcom/revenuecat/purchases/models/PricingPhase;Lkotlin/jvm/functions/Function1;Lie/a;)Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v0

    .line 713
    return-object v0

    .line 714
    :pswitch_14
    move-object/from16 v7, p0

    .line 715
    .line 716
    invoke-static {v4, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->primaryDiscountPhase(Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/Package;)Lcom/revenuecat/purchases/models/PricingPhase;

    .line 717
    .line 718
    .line 719
    move-result-object v1

    .line 720
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$getValue$14;

    .line 721
    .line 722
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$getValue$14;-><init>(Ljava/util/Map;)V

    .line 723
    .line 724
    .line 725
    new-instance v4, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$getValue$15;

    .line 726
    .line 727
    invoke-direct {v4, v3, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$getValue$15;-><init>(Lcom/revenuecat/purchases/Package;Ljava/util/Map;)V

    .line 728
    .line 729
    .line 730
    invoke-static {v1, v2, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->resolveOfferPeriod(Lcom/revenuecat/purchases/models/PricingPhase;Lkotlin/jvm/functions/Function1;Lie/a;)Ljava/lang/String;

    .line 731
    .line 732
    .line 733
    move-result-object v0

    .line 734
    return-object v0

    .line 735
    :pswitch_15
    move-object/from16 v7, p0

    .line 736
    .line 737
    invoke-static {v4, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->primaryDiscountPhase(Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/Package;)Lcom/revenuecat/purchases/models/PricingPhase;

    .line 738
    .line 739
    .line 740
    move-result-object v4

    .line 741
    if-eqz v4, :cond_2a

    .line 742
    .line 743
    invoke-static {v4, v5, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->productOfferPricePerYear(Lcom/revenuecat/purchases/models/PricingPhase;Ljava/util/Locale;Ljava/util/Map;)Ljava/lang/String;

    .line 744
    .line 745
    .line 746
    move-result-object v0

    .line 747
    if-eqz v0, :cond_2a

    .line 748
    .line 749
    return-object v0

    .line 750
    :cond_2a
    if-eqz v3, :cond_2c

    .line 751
    .line 752
    if-eqz v2, :cond_2b

    .line 753
    .line 754
    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;->getShowZeroDecimalPlacePrices()Z

    .line 755
    .line 756
    .line 757
    move-result v16

    .line 758
    :cond_2b
    move/from16 v0, v16

    .line 759
    .line 760
    if-eqz v1, :cond_2c

    .line 761
    .line 762
    invoke-virtual {v1, v3, v5, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->localizedPricePerYear(Lcom/revenuecat/purchases/Package;Ljava/util/Locale;Z)Ljava/lang/String;

    .line 763
    .line 764
    .line 765
    move-result-object v0

    .line 766
    return-object v0

    .line 767
    :cond_2c
    return-object v17

    .line 768
    :pswitch_16
    move-object/from16 v7, p0

    .line 769
    .line 770
    invoke-static {v4, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->primaryDiscountPhase(Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/Package;)Lcom/revenuecat/purchases/models/PricingPhase;

    .line 771
    .line 772
    .line 773
    move-result-object v4

    .line 774
    if-eqz v4, :cond_2d

    .line 775
    .line 776
    invoke-static {v4, v5, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->productOfferPricePerMonth(Lcom/revenuecat/purchases/models/PricingPhase;Ljava/util/Locale;Ljava/util/Map;)Ljava/lang/String;

    .line 777
    .line 778
    .line 779
    move-result-object v0

    .line 780
    if-eqz v0, :cond_2d

    .line 781
    .line 782
    return-object v0

    .line 783
    :cond_2d
    if-eqz v3, :cond_2f

    .line 784
    .line 785
    if-eqz v2, :cond_2e

    .line 786
    .line 787
    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;->getShowZeroDecimalPlacePrices()Z

    .line 788
    .line 789
    .line 790
    move-result v16

    .line 791
    :cond_2e
    move/from16 v0, v16

    .line 792
    .line 793
    if-eqz v1, :cond_2f

    .line 794
    .line 795
    invoke-virtual {v1, v3, v5, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->localizedPricePerMonth(Lcom/revenuecat/purchases/Package;Ljava/util/Locale;Z)Ljava/lang/String;

    .line 796
    .line 797
    .line 798
    move-result-object v0

    .line 799
    return-object v0

    .line 800
    :cond_2f
    return-object v17

    .line 801
    :pswitch_17
    move-object/from16 v7, p0

    .line 802
    .line 803
    invoke-static {v4, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->primaryDiscountPhase(Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/Package;)Lcom/revenuecat/purchases/models/PricingPhase;

    .line 804
    .line 805
    .line 806
    move-result-object v4

    .line 807
    if-eqz v4, :cond_30

    .line 808
    .line 809
    invoke-static {v4, v5, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->productOfferPricePerWeek(Lcom/revenuecat/purchases/models/PricingPhase;Ljava/util/Locale;Ljava/util/Map;)Ljava/lang/String;

    .line 810
    .line 811
    .line 812
    move-result-object v0

    .line 813
    if-eqz v0, :cond_30

    .line 814
    .line 815
    return-object v0

    .line 816
    :cond_30
    if-eqz v3, :cond_32

    .line 817
    .line 818
    if-eqz v2, :cond_31

    .line 819
    .line 820
    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;->getShowZeroDecimalPlacePrices()Z

    .line 821
    .line 822
    .line 823
    move-result v16

    .line 824
    :cond_31
    move/from16 v0, v16

    .line 825
    .line 826
    if-eqz v1, :cond_32

    .line 827
    .line 828
    invoke-virtual {v1, v3, v5, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->localizedPricePerWeek(Lcom/revenuecat/purchases/Package;Ljava/util/Locale;Z)Ljava/lang/String;

    .line 829
    .line 830
    .line 831
    move-result-object v0

    .line 832
    return-object v0

    .line 833
    :cond_32
    return-object v17

    .line 834
    :pswitch_18
    move-object/from16 v7, p0

    .line 835
    .line 836
    invoke-static {v4, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->primaryDiscountPhase(Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/Package;)Lcom/revenuecat/purchases/models/PricingPhase;

    .line 837
    .line 838
    .line 839
    move-result-object v4

    .line 840
    if-eqz v4, :cond_33

    .line 841
    .line 842
    invoke-static {v4, v5, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->productOfferPricePerDay(Lcom/revenuecat/purchases/models/PricingPhase;Ljava/util/Locale;Ljava/util/Map;)Ljava/lang/String;

    .line 843
    .line 844
    .line 845
    move-result-object v0

    .line 846
    if-eqz v0, :cond_33

    .line 847
    .line 848
    return-object v0

    .line 849
    :cond_33
    if-eqz v3, :cond_35

    .line 850
    .line 851
    if-eqz v2, :cond_34

    .line 852
    .line 853
    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;->getShowZeroDecimalPlacePrices()Z

    .line 854
    .line 855
    .line 856
    move-result v16

    .line 857
    :cond_34
    move/from16 v0, v16

    .line 858
    .line 859
    if-eqz v1, :cond_35

    .line 860
    .line 861
    invoke-virtual {v1, v3, v5, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->localizedPricePerDay(Lcom/revenuecat/purchases/Package;Ljava/util/Locale;Z)Ljava/lang/String;

    .line 862
    .line 863
    .line 864
    move-result-object v0

    .line 865
    return-object v0

    .line 866
    :cond_35
    return-object v17

    .line 867
    :pswitch_19
    move-object/from16 v7, p0

    .line 868
    .line 869
    invoke-static {v4, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->primaryDiscountPhase(Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/Package;)Lcom/revenuecat/purchases/models/PricingPhase;

    .line 870
    .line 871
    .line 872
    move-result-object v4

    .line 873
    new-instance v6, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$getValue$9;

    .line 874
    .line 875
    invoke-direct {v6, v3, v2, v1, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$getValue$9;-><init>(Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Ljava/util/Locale;)V

    .line 876
    .line 877
    .line 878
    invoke-static {v4, v5, v0, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PricingPhaseExtensionsKt;->resolveOfferPrice(Lcom/revenuecat/purchases/models/PricingPhase;Ljava/util/Locale;Ljava/util/Map;Lie/a;)Ljava/lang/String;

    .line 879
    .line 880
    .line 881
    move-result-object v0

    .line 882
    return-object v0

    .line 883
    :pswitch_1a
    move-object/from16 v7, p0

    .line 884
    .line 885
    if-eqz v3, :cond_36

    .line 886
    .line 887
    invoke-static {v3, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->productPeriodWithUnit(Lcom/revenuecat/purchases/Package;Ljava/util/Map;)Ljava/lang/String;

    .line 888
    .line 889
    .line 890
    move-result-object v0

    .line 891
    return-object v0

    .line 892
    :cond_36
    return-object v17

    .line 893
    :pswitch_1b
    move-object/from16 v7, p0

    .line 894
    .line 895
    if-eqz v3, :cond_37

    .line 896
    .line 897
    invoke-virtual {v3}, Lcom/revenuecat/purchases/Package;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    .line 898
    .line 899
    .line 900
    move-result-object v0

    .line 901
    if-eqz v0, :cond_37

    .line 902
    .line 903
    invoke-interface {v0}, Lcom/revenuecat/purchases/models/StoreProduct;->getPeriod()Lcom/revenuecat/purchases/models/Period;

    .line 904
    .line 905
    .line 906
    move-result-object v0

    .line 907
    if-eqz v0, :cond_37

    .line 908
    .line 909
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PeriodExtensionsKt;->getRoundedValueInYears(Lcom/revenuecat/purchases/models/Period;)Ljava/lang/String;

    .line 910
    .line 911
    .line 912
    move-result-object v0

    .line 913
    return-object v0

    .line 914
    :cond_37
    return-object v17

    .line 915
    :pswitch_1c
    move-object/from16 v7, p0

    .line 916
    .line 917
    if-eqz v3, :cond_38

    .line 918
    .line 919
    invoke-virtual {v3}, Lcom/revenuecat/purchases/Package;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    .line 920
    .line 921
    .line 922
    move-result-object v0

    .line 923
    if-eqz v0, :cond_38

    .line 924
    .line 925
    invoke-interface {v0}, Lcom/revenuecat/purchases/models/StoreProduct;->getPeriod()Lcom/revenuecat/purchases/models/Period;

    .line 926
    .line 927
    .line 928
    move-result-object v0

    .line 929
    if-eqz v0, :cond_38

    .line 930
    .line 931
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PeriodExtensionsKt;->getRoundedValueInMonths(Lcom/revenuecat/purchases/models/Period;)Ljava/lang/String;

    .line 932
    .line 933
    .line 934
    move-result-object v0

    .line 935
    return-object v0

    .line 936
    :cond_38
    return-object v17

    .line 937
    :pswitch_1d
    move-object/from16 v7, p0

    .line 938
    .line 939
    if-eqz v3, :cond_39

    .line 940
    .line 941
    invoke-virtual {v3}, Lcom/revenuecat/purchases/Package;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    .line 942
    .line 943
    .line 944
    move-result-object v0

    .line 945
    if-eqz v0, :cond_39

    .line 946
    .line 947
    invoke-interface {v0}, Lcom/revenuecat/purchases/models/StoreProduct;->getPeriod()Lcom/revenuecat/purchases/models/Period;

    .line 948
    .line 949
    .line 950
    move-result-object v0

    .line 951
    if-eqz v0, :cond_39

    .line 952
    .line 953
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PeriodExtensionsKt;->getRoundedValueInWeeks(Lcom/revenuecat/purchases/models/Period;)Ljava/lang/String;

    .line 954
    .line 955
    .line 956
    move-result-object v0

    .line 957
    return-object v0

    .line 958
    :cond_39
    return-object v17

    .line 959
    :pswitch_1e
    move-object/from16 v7, p0

    .line 960
    .line 961
    if-eqz v3, :cond_3a

    .line 962
    .line 963
    invoke-virtual {v3}, Lcom/revenuecat/purchases/Package;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    .line 964
    .line 965
    .line 966
    move-result-object v0

    .line 967
    if-eqz v0, :cond_3a

    .line 968
    .line 969
    invoke-interface {v0}, Lcom/revenuecat/purchases/models/StoreProduct;->getPeriod()Lcom/revenuecat/purchases/models/Period;

    .line 970
    .line 971
    .line 972
    move-result-object v0

    .line 973
    if-eqz v0, :cond_3a

    .line 974
    .line 975
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PeriodExtensionsKt;->getRoundedValueInDays(Lcom/revenuecat/purchases/models/Period;)Ljava/lang/String;

    .line 976
    .line 977
    .line 978
    move-result-object v0

    .line 979
    return-object v0

    .line 980
    :cond_3a
    return-object v17

    .line 981
    :pswitch_1f
    move-object/from16 v7, p0

    .line 982
    .line 983
    if-eqz v3, :cond_3b

    .line 984
    .line 985
    invoke-static {v3, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->productPeriodAbbreviated(Lcom/revenuecat/purchases/Package;Ljava/util/Map;)Ljava/lang/String;

    .line 986
    .line 987
    .line 988
    move-result-object v0

    .line 989
    return-object v0

    .line 990
    :cond_3b
    return-object v17

    .line 991
    :pswitch_20
    move-object/from16 v7, p0

    .line 992
    .line 993
    if-eqz v3, :cond_3c

    .line 994
    .line 995
    invoke-static {v3, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->productPeriod(Lcom/revenuecat/purchases/Package;Ljava/util/Map;)Ljava/lang/String;

    .line 996
    .line 997
    .line 998
    move-result-object v0

    .line 999
    return-object v0

    .line 1000
    :cond_3c
    return-object v17

    .line 1001
    :pswitch_21
    move-object/from16 v7, p0

    .line 1002
    .line 1003
    if-eqz v3, :cond_40

    .line 1004
    .line 1005
    if-eqz v2, :cond_3d

    .line 1006
    .line 1007
    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;->getShowZeroDecimalPlacePrices()Z

    .line 1008
    .line 1009
    .line 1010
    move-result v16

    .line 1011
    :cond_3d
    move/from16 v0, v16

    .line 1012
    .line 1013
    invoke-static {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->isLifetime(Lcom/revenuecat/purchases/Package;)Z

    .line 1014
    .line 1015
    .line 1016
    move-result v2

    .line 1017
    if-eqz v2, :cond_3f

    .line 1018
    .line 1019
    if-eqz v1, :cond_3e

    .line 1020
    .line 1021
    invoke-virtual {v1, v3, v5, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->localizedPrice(Lcom/revenuecat/purchases/Package;Ljava/util/Locale;Z)Ljava/lang/String;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v0

    .line 1025
    return-object v0

    .line 1026
    :cond_3e
    return-object v17

    .line 1027
    :cond_3f
    if-eqz v1, :cond_40

    .line 1028
    .line 1029
    invoke-virtual {v1, v3, v5, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->localizedPricePerYear(Lcom/revenuecat/purchases/Package;Ljava/util/Locale;Z)Ljava/lang/String;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v0

    .line 1033
    return-object v0

    .line 1034
    :cond_40
    return-object v17

    .line 1035
    :pswitch_22
    move-object/from16 v7, p0

    .line 1036
    .line 1037
    if-eqz v3, :cond_44

    .line 1038
    .line 1039
    if-eqz v2, :cond_41

    .line 1040
    .line 1041
    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;->getShowZeroDecimalPlacePrices()Z

    .line 1042
    .line 1043
    .line 1044
    move-result v16

    .line 1045
    :cond_41
    move/from16 v0, v16

    .line 1046
    .line 1047
    invoke-static {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->isLifetime(Lcom/revenuecat/purchases/Package;)Z

    .line 1048
    .line 1049
    .line 1050
    move-result v2

    .line 1051
    if-eqz v2, :cond_43

    .line 1052
    .line 1053
    if-eqz v1, :cond_42

    .line 1054
    .line 1055
    invoke-virtual {v1, v3, v5, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->localizedPrice(Lcom/revenuecat/purchases/Package;Ljava/util/Locale;Z)Ljava/lang/String;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v0

    .line 1059
    return-object v0

    .line 1060
    :cond_42
    return-object v17

    .line 1061
    :cond_43
    if-eqz v1, :cond_44

    .line 1062
    .line 1063
    invoke-virtual {v1, v3, v5, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->localizedPricePerMonth(Lcom/revenuecat/purchases/Package;Ljava/util/Locale;Z)Ljava/lang/String;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v0

    .line 1067
    return-object v0

    .line 1068
    :cond_44
    return-object v17

    .line 1069
    :pswitch_23
    move-object/from16 v7, p0

    .line 1070
    .line 1071
    if-eqz v3, :cond_48

    .line 1072
    .line 1073
    if-eqz v2, :cond_45

    .line 1074
    .line 1075
    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;->getShowZeroDecimalPlacePrices()Z

    .line 1076
    .line 1077
    .line 1078
    move-result v16

    .line 1079
    :cond_45
    move/from16 v0, v16

    .line 1080
    .line 1081
    invoke-static {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->isLifetime(Lcom/revenuecat/purchases/Package;)Z

    .line 1082
    .line 1083
    .line 1084
    move-result v2

    .line 1085
    if-eqz v2, :cond_47

    .line 1086
    .line 1087
    if-eqz v1, :cond_46

    .line 1088
    .line 1089
    invoke-virtual {v1, v3, v5, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->localizedPrice(Lcom/revenuecat/purchases/Package;Ljava/util/Locale;Z)Ljava/lang/String;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v0

    .line 1093
    return-object v0

    .line 1094
    :cond_46
    return-object v17

    .line 1095
    :cond_47
    if-eqz v1, :cond_48

    .line 1096
    .line 1097
    invoke-virtual {v1, v3, v5, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->localizedPricePerWeek(Lcom/revenuecat/purchases/Package;Ljava/util/Locale;Z)Ljava/lang/String;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v0

    .line 1101
    return-object v0

    .line 1102
    :cond_48
    return-object v17

    .line 1103
    :pswitch_24
    move-object/from16 v7, p0

    .line 1104
    .line 1105
    if-eqz v3, :cond_4c

    .line 1106
    .line 1107
    if-eqz v2, :cond_49

    .line 1108
    .line 1109
    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;->getShowZeroDecimalPlacePrices()Z

    .line 1110
    .line 1111
    .line 1112
    move-result v16

    .line 1113
    :cond_49
    move/from16 v0, v16

    .line 1114
    .line 1115
    invoke-static {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->isLifetime(Lcom/revenuecat/purchases/Package;)Z

    .line 1116
    .line 1117
    .line 1118
    move-result v2

    .line 1119
    if-eqz v2, :cond_4b

    .line 1120
    .line 1121
    if-eqz v1, :cond_4a

    .line 1122
    .line 1123
    invoke-virtual {v1, v3, v5, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->localizedPrice(Lcom/revenuecat/purchases/Package;Ljava/util/Locale;Z)Ljava/lang/String;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v0

    .line 1127
    return-object v0

    .line 1128
    :cond_4a
    return-object v17

    .line 1129
    :cond_4b
    if-eqz v1, :cond_4c

    .line 1130
    .line 1131
    invoke-virtual {v1, v3, v5, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->localizedPricePerDay(Lcom/revenuecat/purchases/Package;Ljava/util/Locale;Z)Ljava/lang/String;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v0

    .line 1135
    return-object v0

    .line 1136
    :cond_4c
    return-object v17

    .line 1137
    :pswitch_25
    move-object/from16 v7, p0

    .line 1138
    .line 1139
    if-eqz v3, :cond_4f

    .line 1140
    .line 1141
    if-eqz v1, :cond_4f

    .line 1142
    .line 1143
    if-eqz v2, :cond_4d

    .line 1144
    .line 1145
    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;->getShowZeroDecimalPlacePrices()Z

    .line 1146
    .line 1147
    .line 1148
    move-result v16

    .line 1149
    :cond_4d
    move/from16 v2, v16

    .line 1150
    .line 1151
    invoke-virtual {v1, v3, v5, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->localizedPrice(Lcom/revenuecat/purchases/Package;Ljava/util/Locale;Z)Ljava/lang/String;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v1

    .line 1155
    if-eqz v1, :cond_4f

    .line 1156
    .line 1157
    invoke-static {v3, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->productPeriodAbbreviated(Lcom/revenuecat/purchases/Package;Ljava/util/Map;)Ljava/lang/String;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v0

    .line 1161
    invoke-static {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->isLifetime(Lcom/revenuecat/purchases/Package;)Z

    .line 1162
    .line 1163
    .line 1164
    move-result v2

    .line 1165
    if-eqz v2, :cond_4e

    .line 1166
    .line 1167
    return-object v1

    .line 1168
    :cond_4e
    if-eqz v0, :cond_4f

    .line 1169
    .line 1170
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1171
    .line 1172
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1173
    .line 1174
    .line 1175
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1176
    .line 1177
    .line 1178
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1179
    .line 1180
    .line 1181
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1182
    .line 1183
    .line 1184
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v0

    .line 1188
    return-object v0

    .line 1189
    :cond_4f
    return-object v17

    .line 1190
    :pswitch_26
    move-object/from16 v7, p0

    .line 1191
    .line 1192
    if-eqz v3, :cond_52

    .line 1193
    .line 1194
    if-eqz v1, :cond_52

    .line 1195
    .line 1196
    if-eqz v2, :cond_50

    .line 1197
    .line 1198
    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;->getShowZeroDecimalPlacePrices()Z

    .line 1199
    .line 1200
    .line 1201
    move-result v16

    .line 1202
    :cond_50
    move/from16 v2, v16

    .line 1203
    .line 1204
    invoke-virtual {v1, v3, v5, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->localizedPrice(Lcom/revenuecat/purchases/Package;Ljava/util/Locale;Z)Ljava/lang/String;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v1

    .line 1208
    if-eqz v1, :cond_52

    .line 1209
    .line 1210
    invoke-static {v3, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->productPeriod(Lcom/revenuecat/purchases/Package;Ljava/util/Map;)Ljava/lang/String;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v0

    .line 1214
    invoke-static {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->isLifetime(Lcom/revenuecat/purchases/Package;)Z

    .line 1215
    .line 1216
    .line 1217
    move-result v2

    .line 1218
    if-eqz v2, :cond_51

    .line 1219
    .line 1220
    return-object v1

    .line 1221
    :cond_51
    if-eqz v0, :cond_52

    .line 1222
    .line 1223
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1224
    .line 1225
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1226
    .line 1227
    .line 1228
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1229
    .line 1230
    .line 1231
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1232
    .line 1233
    .line 1234
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1235
    .line 1236
    .line 1237
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v0

    .line 1241
    return-object v0

    .line 1242
    :cond_52
    return-object v17

    .line 1243
    :pswitch_27
    move-object/from16 v7, p0

    .line 1244
    .line 1245
    if-eqz v3, :cond_54

    .line 1246
    .line 1247
    if-eqz v1, :cond_54

    .line 1248
    .line 1249
    if-eqz v2, :cond_53

    .line 1250
    .line 1251
    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;->getShowZeroDecimalPlacePrices()Z

    .line 1252
    .line 1253
    .line 1254
    move-result v16

    .line 1255
    :cond_53
    move/from16 v0, v16

    .line 1256
    .line 1257
    invoke-virtual {v1, v3, v5, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->localizedPrice(Lcom/revenuecat/purchases/Package;Ljava/util/Locale;Z)Ljava/lang/String;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v0

    .line 1261
    return-object v0

    .line 1262
    :cond_54
    return-object v17

    .line 1263
    :pswitch_28
    move-object/from16 v7, p0

    .line 1264
    .line 1265
    if-eqz v3, :cond_55

    .line 1266
    .line 1267
    invoke-static {v3, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->productPeriodly(Lcom/revenuecat/purchases/Package;Ljava/util/Map;)Ljava/lang/String;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v0

    .line 1271
    return-object v0

    .line 1272
    :cond_55
    return-object v17

    .line 1273
    :pswitch_29
    move-object/from16 v7, p0

    .line 1274
    .line 1275
    if-eqz v3, :cond_56

    .line 1276
    .line 1277
    invoke-virtual {v3}, Lcom/revenuecat/purchases/Package;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    .line 1278
    .line 1279
    .line 1280
    move-result-object v0

    .line 1281
    invoke-interface {v0}, Lcom/revenuecat/purchases/models/StoreProduct;->getPrice()Lcom/revenuecat/purchases/models/Price;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v0

    .line 1285
    invoke-virtual {v0}, Lcom/revenuecat/purchases/models/Price;->getCurrencyCode()Ljava/lang/String;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v0

    .line 1289
    invoke-static {v0}, Ljava/util/Currency;->getInstance(Ljava/lang/String;)Ljava/util/Currency;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v0

    .line 1293
    invoke-virtual {v0, v5}, Ljava/util/Currency;->getSymbol(Ljava/util/Locale;)Ljava/lang/String;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v0

    .line 1297
    return-object v0

    .line 1298
    :cond_56
    return-object v17

    .line 1299
    :pswitch_2a
    move-object/from16 v7, p0

    .line 1300
    .line 1301
    if-eqz v3, :cond_57

    .line 1302
    .line 1303
    invoke-virtual {v3}, Lcom/revenuecat/purchases/Package;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v0

    .line 1307
    if-eqz v0, :cond_57

    .line 1308
    .line 1309
    invoke-interface {v0}, Lcom/revenuecat/purchases/models/StoreProduct;->getPrice()Lcom/revenuecat/purchases/models/Price;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v0

    .line 1313
    if-eqz v0, :cond_57

    .line 1314
    .line 1315
    invoke-virtual {v0}, Lcom/revenuecat/purchases/models/Price;->getCurrencyCode()Ljava/lang/String;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v0

    .line 1319
    return-object v0

    .line 1320
    :cond_57
    return-object v17

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final getVariableValue(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lcom/revenuecat/purchases/UiConfig$VariableConfig;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/models/SubscriptionOption;Ljava/util/Locale;Ljava/util/Locale;Ljava/util/Date;Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;Ljava/util/Map;Ljava/util/Map;)Ljava/lang/String;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
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
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    new-instance v5, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Ljava/lang/String;

    .line 23
    .line 24
    sget-object v3, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;

    .line 25
    .line 26
    invoke-virtual/range {p4 .. p4}, Lcom/revenuecat/purchases/UiConfig$VariableConfig;->getFunctionCompatibilityMap()Ljava/util/Map;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-direct {v3, v2, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->findFunction(Ljava/lang/String;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Function;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    invoke-interface {v5, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-direct/range {p0 .. p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->extractCustomVariableKey(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    move-object v1, p0

    .line 47
    move-object/from16 v6, p9

    .line 48
    .line 49
    move-object/from16 v3, p14

    .line 50
    .line 51
    move-object/from16 v4, p15

    .line 52
    .line 53
    invoke-direct/range {v1 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->resolveCustomVariable(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/Locale;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    return-object v0

    .line 58
    :cond_2
    move-object v13, v5

    .line 59
    invoke-virtual/range {p4 .. p4}, Lcom/revenuecat/purchases/UiConfig$VariableConfig;->getVariableCompatibilityMap()Ljava/util/Map;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-direct {p0, v0, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->findVariable(Ljava/lang/String;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Variable;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    const-string v14, ""

    .line 68
    .line 69
    if-nez v2, :cond_3

    .line 70
    .line 71
    return-object v14

    .line 72
    :cond_3
    move-object v1, p0

    .line 73
    move-object/from16 v3, p3

    .line 74
    .line 75
    move-object/from16 v4, p5

    .line 76
    .line 77
    move-object/from16 v5, p6

    .line 78
    .line 79
    move-object/from16 v6, p7

    .line 80
    .line 81
    move-object/from16 v7, p8

    .line 82
    .line 83
    move-object/from16 v8, p9

    .line 84
    .line 85
    move-object/from16 v9, p10

    .line 86
    .line 87
    move-object/from16 v10, p11

    .line 88
    .line 89
    move-object/from16 v11, p12

    .line 90
    .line 91
    move-object/from16 v12, p13

    .line 92
    .line 93
    invoke-direct/range {v1 .. v12}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->getValue(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Variable;Ljava/util/Map;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/models/SubscriptionOption;Ljava/util/Locale;Ljava/util/Locale;Ljava/util/Date;Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    if-eqz v2, :cond_4

    .line 98
    .line 99
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-eqz v4, :cond_5

    .line 108
    .line 109
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    check-cast v4, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Function;

    .line 114
    .line 115
    sget-object v5, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;

    .line 116
    .line 117
    move-object/from16 v8, p9

    .line 118
    .line 119
    invoke-direct {v5, v2, v4, v8}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->processFunction(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Function;Ljava/util/Locale;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    goto :goto_1

    .line 124
    :cond_4
    const/4 v2, 0x0

    .line 125
    :cond_5
    if-eqz v2, :cond_6

    .line 126
    .line 127
    return-object v2

    .line 128
    :cond_6
    if-eqz v6, :cond_7

    .line 129
    .line 130
    sget-object v2, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 131
    .line 132
    invoke-direct {p0, v2, v0, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->failedToGetValue(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;Ljava/lang/String;Lcom/revenuecat/purchases/Package;)V

    .line 133
    .line 134
    .line 135
    :cond_7
    return-object v14
.end method

.method private final processFunction(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Function;Ljava/util/Locale;)Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$WhenMappings;->$EnumSwitchMapping$2:[I

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    aget p2, v0, p2

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p2, v0, :cond_4

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq p2, v1, :cond_3

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-ne p2, v1, :cond_2

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-lez p2, :cond_1

    .line 23
    .line 24
    new-instance p2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-static {v1}, Ljava/lang/Character;->isLowerCase(C)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    invoke-static {v1, p3}, LDf/a;->d(CLjava/util/Locale;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-static {v1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    :goto_0
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const-string p3, "substring(...)"

    .line 57
    .line 58
    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    :cond_1
    return-object p1

    .line 69
    :cond_2
    new-instance p1, LTd/r;

    .line 70
    .line 71
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 72
    .line 73
    .line 74
    throw p1

    .line 75
    :cond_3
    sget-object p2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 76
    .line 77
    invoke-virtual {p1, p2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    const-string p2, "toUpperCase(...)"

    .line 82
    .line 83
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-object p1

    .line 87
    :cond_4
    sget-object p2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 88
    .line 89
    invoke-virtual {p1, p2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    const-string p2, "toLowerCase(...)"

    .line 94
    .line 95
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    return-object p1
.end method

.method public static synthetic processVariables$default(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;Ljava/lang/String;Ljava/util/Map;Lcom/revenuecat/purchases/UiConfig$VariableConfig;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/models/SubscriptionOption;Ljava/util/Locale;Ljava/util/Locale;Ljava/util/Date;Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/String;
    .locals 17

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    .line 1
    invoke-static {}, LUd/S;->i()Ljava/util/Map;

    move-result-object v1

    move-object v4, v1

    goto :goto_0

    :cond_0
    move-object/from16 v4, p2

    :goto_0
    and-int/lit8 v1, v0, 0x8

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v6, v2

    goto :goto_1

    :cond_1
    move-object/from16 v6, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    move-object v7, v2

    goto :goto_2

    :cond_2
    move-object/from16 v7, p5

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    move-object v8, v2

    goto :goto_3

    :cond_3
    move-object/from16 v8, p6

    :goto_3
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_4

    move-object v9, v2

    goto :goto_4

    :cond_4
    move-object/from16 v9, p7

    :goto_4
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_5

    .line 2
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    const-string v3, "getDefault()"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v10, v1

    goto :goto_5

    :cond_5
    move-object/from16 v10, p8

    :goto_5
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_6

    .line 3
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    move-object v12, v1

    goto :goto_6

    :cond_6
    move-object/from16 v12, p10

    :goto_6
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_7

    move-object v13, v2

    goto :goto_7

    :cond_7
    move-object/from16 v13, p11

    :goto_7
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_8

    .line 4
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;->DAYS:Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;

    move-object v14, v1

    goto :goto_8

    :cond_8
    move-object/from16 v14, p12

    :goto_8
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_9

    .line 5
    invoke-static {}, LUd/S;->i()Ljava/util/Map;

    move-result-object v1

    move-object v15, v1

    goto :goto_9

    :cond_9
    move-object/from16 v15, p13

    :goto_9
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_a

    .line 6
    invoke-static {}, LUd/S;->i()Ljava/util/Map;

    move-result-object v0

    move-object/from16 v16, v0

    :goto_a
    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v5, p3

    move-object/from16 v11, p9

    goto :goto_b

    :cond_a
    move-object/from16 v16, p14

    goto :goto_a

    .line 7
    :goto_b
    invoke-virtual/range {v2 .. v16}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->processVariables(Ljava/lang/String;Ljava/util/Map;Lcom/revenuecat/purchases/UiConfig$VariableConfig;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/models/SubscriptionOption;Ljava/util/Locale;Ljava/util/Locale;Ljava/util/Date;Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;Ljava/util/Map;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final relativeDiscount(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Ljava/util/Map;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;",
            "Ljava/util/Map<",
            "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;->getDiscountRelativeToMostExpensivePerMonth()Ljava/lang/Double;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    const/high16 p1, 0x42c80000    # 100.0f

    .line 13
    .line 14
    float-to-double v3, p1

    .line 15
    mul-double/2addr v1, v3

    .line 16
    invoke-static {v1, v2}, Lke/a;->c(D)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->PERCENT:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 21
    .line 22
    invoke-static {p2, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->getStringOrLogError(Ljava/util/Map;Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const/4 v0, 0x1

    .line 37
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string p2, "format(...)"

    .line 46
    .line 47
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :cond_0
    return-object v0
.end method

.method private final replaceVariablesWithValues(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->regex:LDf/p;

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    invoke-static {v1, p1, v4, v2, v3}, LDf/p;->e(LDf/p;Ljava/lang/CharSequence;IILjava/lang/Object;)LCf/i;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v1}, LCf/i;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    move v2, v4

    .line 20
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_2

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, LDf/l;

    .line 31
    .line 32
    invoke-interface {v3}, LDf/l;->c()Loe/f;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {v5}, Loe/d;->f()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    invoke-virtual {v0, p1, v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-interface {v3}, LDf/l;->a()LDf/l$b;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2}, LDf/l$b;->a()LDf/l;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-interface {v2}, LDf/l;->b()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    const/4 v5, 0x1

    .line 56
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    move-object v6, v2

    .line 61
    check-cast v6, Ljava/lang/String;

    .line 62
    .line 63
    const-string v2, "|"

    .line 64
    .line 65
    filled-new-array {v2}, [Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    const/4 v10, 0x6

    .line 70
    const/4 v11, 0x0

    .line 71
    const/4 v8, 0x0

    .line 72
    const/4 v9, 0x0

    .line 73
    invoke-static/range {v6 .. v11}, LDf/r;->N0(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    new-instance v6, Ljava/util/ArrayList;

    .line 78
    .line 79
    const/16 v7, 0xa

    .line 80
    .line 81
    invoke-static {v2, v7}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 86
    .line 87
    .line 88
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    if-eqz v7, :cond_0

    .line 97
    .line 98
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    check-cast v7, Ljava/lang/String;

    .line 103
    .line 104
    invoke-static {v7}, LDf/r;->k1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_0
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    check-cast v2, Ljava/lang/String;

    .line 121
    .line 122
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    if-le v7, v5, :cond_1

    .line 127
    .line 128
    invoke-static {v6, v5}, LUd/u;->g0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    goto :goto_2

    .line 133
    :cond_1
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    :goto_2
    invoke-interface {p2, v2, v6}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    check-cast v2, Ljava/lang/String;

    .line 142
    .line 143
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-interface {v3}, LDf/l;->c()Loe/f;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-virtual {v2}, Loe/d;->i()I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    add-int/2addr v2, v5

    .line 155
    goto/16 :goto_0

    .line 156
    .line 157
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 158
    .line 159
    .line 160
    move-result p2

    .line 161
    invoke-virtual {v0, p1, v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    const-string p2, "toString(...)"

    .line 169
    .line 170
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    return-object p1
.end method

.method private final resolveCustomVariable(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/Locale;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Function;",
            ">;",
            "Ljava/util/Locale;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    check-cast p2, Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    check-cast p2, Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;

    .line 14
    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    sget-object p2, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 18
    .line 19
    new-instance p3, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string p4, "Custom variable \'"

    .line 25
    .line 26
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p1, "\' was not provided and has no default value. Defaulting to empty string."

    .line 33
    .line 34
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p2, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->w(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const-string p1, ""

    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_0
    invoke-virtual {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;->getStringValue()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result p3

    .line 59
    if-eqz p3, :cond_1

    .line 60
    .line 61
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    check-cast p3, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Function;

    .line 66
    .line 67
    sget-object p4, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;

    .line 68
    .line 69
    invoke-direct {p4, p1, p3, p5}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->processFunction(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Function;Ljava/util/Locale;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    goto :goto_0

    .line 74
    :cond_1
    return-object p1
.end method

.method private final unsupportedFunctionWithoutFallback(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Paywall function \'"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p2, "\' is not supported and no backwards compatible replacement found."

    .line 15
    .line 16
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->e(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private final unsupportedVariableWithoutFallback(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Paywall variable \'"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p2, "\' is not supported and no backwards compatible replacement found."

    .line 15
    .line 16
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->e(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private final usingFallbackFunction(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Paywall function \'"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p2, "\' is not supported. Using backward compatible \'"

    .line 15
    .line 16
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string p2, "\' instead."

    .line 23
    .line 24
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->w(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method private final usingFallbackVariable(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Paywall variable \'"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p2, "\' is not supported. Using backwards compatible \'"

    .line 15
    .line 16
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string p2, "\' instead."

    .line 23
    .line 24
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->w(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final processVariables(Ljava/lang/String;Ljava/util/Map;Lcom/revenuecat/purchases/UiConfig$VariableConfig;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/models/SubscriptionOption;Ljava/util/Locale;Ljava/util/Locale;Ljava/util/Date;Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;Ljava/util/Map;Ljava/util/Map;)Ljava/lang/String;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
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
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "template"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "localizedVariableKeys"

    .line 9
    .line 10
    move-object/from16 v3, p2

    .line 11
    .line 12
    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "variableConfig"

    .line 16
    .line 17
    move-object/from16 v4, p3

    .line 18
    .line 19
    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v1, "currencyLocale"

    .line 23
    .line 24
    move-object/from16 v9, p8

    .line 25
    .line 26
    invoke-static {v9, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v1, "dateLocale"

    .line 30
    .line 31
    move-object/from16 v10, p9

    .line 32
    .line 33
    invoke-static {v10, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v1, "date"

    .line 37
    .line 38
    move-object/from16 v11, p10

    .line 39
    .line 40
    invoke-static {v11, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const-string v1, "countFrom"

    .line 44
    .line 45
    move-object/from16 v13, p12

    .line 46
    .line 47
    invoke-static {v13, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string v1, "customVariables"

    .line 51
    .line 52
    move-object/from16 v14, p13

    .line 53
    .line 54
    invoke-static {v14, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string v1, "defaultCustomVariables"

    .line 58
    .line 59
    move-object/from16 v15, p14

    .line 60
    .line 61
    invoke-static {v15, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$processVariables$1;

    .line 65
    .line 66
    move-object/from16 v5, p4

    .line 67
    .line 68
    move-object/from16 v6, p5

    .line 69
    .line 70
    move-object/from16 v7, p6

    .line 71
    .line 72
    move-object/from16 v8, p7

    .line 73
    .line 74
    move-object/from16 v12, p11

    .line 75
    .line 76
    invoke-direct/range {v2 .. v15}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$processVariables$1;-><init>(Ljava/util/Map;Lcom/revenuecat/purchases/UiConfig$VariableConfig;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/models/SubscriptionOption;Ljava/util/Locale;Ljava/util/Locale;Ljava/util/Date;Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;Ljava/util/Map;Ljava/util/Map;)V

    .line 77
    .line 78
    .line 79
    move-object/from16 v1, p0

    .line 80
    .line 81
    invoke-direct {v1, v0, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2;->replaceVariablesWithValues(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    return-object v0
.end method
