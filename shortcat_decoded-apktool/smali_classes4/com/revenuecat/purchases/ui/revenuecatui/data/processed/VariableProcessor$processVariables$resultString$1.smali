.class final Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$processVariables$resultString$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor;->processVariables(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Ljava/lang/String;Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "variable",
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
.field final synthetic $context:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;

.field final synthetic $locale:Ljava/util/Locale;

.field final synthetic $rcPackage:Lcom/revenuecat/purchases/Package;

.field final synthetic $variableDataProvider:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$processVariables$resultString$1;->$variableDataProvider:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$processVariables$resultString$1;->$context:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$processVariables$resultString$1;->$rcPackage:Lcom/revenuecat/purchases/Package;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$processVariables$resultString$1;->$locale:Ljava/util/Locale;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$processVariables$resultString$1;->invoke(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    const-string v0, "variable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor;

    iget-object v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$processVariables$resultString$1;->$variableDataProvider:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;

    iget-object v3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$processVariables$resultString$1;->$context:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;

    iget-object v5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$processVariables$resultString$1;->$rcPackage:Lcom/revenuecat/purchases/Package;

    iget-object v6, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$processVariables$resultString$1;->$locale:Ljava/util/Locale;

    move-object v4, p1

    invoke-static/range {v1 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor;->access$variableValue(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Ljava/lang/String;Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
