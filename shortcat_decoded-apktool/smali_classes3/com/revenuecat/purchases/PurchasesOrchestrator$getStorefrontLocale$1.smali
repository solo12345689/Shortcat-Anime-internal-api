.class public final Lcom/revenuecat/purchases/PurchasesOrchestrator$getStorefrontLocale$1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/revenuecat/purchases/interfaces/GetStorefrontCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/PurchasesOrchestrator;->getStorefrontLocale(Lcom/revenuecat/purchases/interfaces/GetStorefrontLocaleCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "com/revenuecat/purchases/PurchasesOrchestrator$getStorefrontLocale$1",
        "Lcom/revenuecat/purchases/interfaces/GetStorefrontCallback;",
        "",
        "storefrontCountryCode",
        "LTd/L;",
        "onReceived",
        "(Ljava/lang/String;)V",
        "Lcom/revenuecat/purchases/PurchasesError;",
        "error",
        "onError",
        "(Lcom/revenuecat/purchases/PurchasesError;)V",
        "purchases_defaultsBc8Release"
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
.field final synthetic $callback:Lcom/revenuecat/purchases/interfaces/GetStorefrontLocaleCallback;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/interfaces/GetStorefrontLocaleCallback;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/PurchasesOrchestrator$getStorefrontLocale$1;->$callback:Lcom/revenuecat/purchases/interfaces/GetStorefrontLocaleCallback;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onError(Lcom/revenuecat/purchases/PurchasesError;)V
    .locals 1

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/revenuecat/purchases/PurchasesOrchestrator$getStorefrontLocale$1;->$callback:Lcom/revenuecat/purchases/interfaces/GetStorefrontLocaleCallback;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lcom/revenuecat/purchases/interfaces/GetStorefrontLocaleCallback;->onError(Lcom/revenuecat/purchases/PurchasesError;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onReceived(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "storefrontCountryCode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/revenuecat/purchases/PurchasesOrchestrator$getStorefrontLocale$1;->$callback:Lcom/revenuecat/purchases/interfaces/GetStorefrontLocaleCallback;

    .line 7
    .line 8
    new-instance v1, Ljava/util/Locale$Builder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/util/Locale$Builder;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/util/Locale$Builder;->setRegion(Ljava/lang/String;)Ljava/util/Locale$Builder;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Ljava/util/Locale$Builder;->build()Ljava/util/Locale;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v1, "Builder().setRegion(storefrontCountryCode).build()"

    .line 22
    .line 23
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, p1}, Lcom/revenuecat/purchases/interfaces/GetStorefrontLocaleCallback;->onReceived(Ljava/util/Locale;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
