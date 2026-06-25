.class public Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/PurchasesConfiguration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u00002\u0008\u0010\n\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eJ\u0008\u0010H\u001a\u00020IH\u0016J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000eJ\u000e\u0010J\u001a\u00020\u00002\u0006\u0010C\u001a\u00020BJ\u0010\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001fH\u0007J\u0010\u0010K\u001a\u00020\u00002\u0006\u0010L\u001a\u00020\u000eH\u0007J\u0010\u0010M\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u000eH\u0007J\u000e\u0010\'\u001a\u00020\u00002\u0006\u0010\'\u001a\u00020\u000eJ\u0010\u0010*\u001a\u00020\u00002\u0008\u0010N\u001a\u0004\u0018\u00010\u0005J\u000e\u0010.\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-J\u000e\u00104\u001a\u00020\u00002\u0006\u00104\u001a\u000203J\u000e\u00109\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u000eJ\u000e\u0010=\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R*\u0010\n\u001a\u0004\u0018\u00010\u00052\u0008\u0010\t\u001a\u0004\u0018\u00010\u00058@@@X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u0008\"\u0004\u0008\u000c\u0010\rR&\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e8@@@X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R&\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00168@@@X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR&\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e8@@@X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001d\u0010\u0011\"\u0004\u0008\u001e\u0010\u0013R,\u0010 \u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\u001f8@@@X\u0080\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$\"\u0004\u0008%\u0010&R&\u0010\'\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e8@@@X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008(\u0010\u0011\"\u0004\u0008)\u0010\u0013R*\u0010*\u001a\u0004\u0018\u00010\u00052\u0008\u0010\t\u001a\u0004\u0018\u00010\u00058@@@X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008+\u0010\u0008\"\u0004\u0008,\u0010\rR&\u0010.\u001a\u00020-2\u0006\u0010\t\u001a\u00020-8@@@X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008/\u00100\"\u0004\u00081\u00102R*\u00104\u001a\u0004\u0018\u0001032\u0008\u0010\t\u001a\u0004\u0018\u0001038@@@X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00085\u00106\"\u0004\u00087\u00108R&\u00109\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e8@@@X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008:\u0010\u0011\"\u0004\u0008;\u0010\u0013R&\u0010=\u001a\u00020<2\u0006\u0010\t\u001a\u00020<8@@@X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008>\u0010?\"\u0004\u0008@\u0010AR&\u0010C\u001a\u00020B2\u0006\u0010\t\u001a\u00020B8@@@X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008D\u0010E\"\u0004\u0008F\u0010G\u00a8\u0006O"
    }
    d2 = {
        "Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;",
        "",
        "context",
        "Landroid/content/Context;",
        "apiKey",
        "",
        "(Landroid/content/Context;Ljava/lang/String;)V",
        "getApiKey$purchases_defaultsBc8Release",
        "()Ljava/lang/String;",
        "<set-?>",
        "appUserID",
        "getAppUserID$purchases_defaultsBc8Release",
        "setAppUserID$purchases_defaultsBc8Release",
        "(Ljava/lang/String;)V",
        "",
        "automaticDeviceIdentifierCollectionEnabled",
        "getAutomaticDeviceIdentifierCollectionEnabled$purchases_defaultsBc8Release",
        "()Z",
        "setAutomaticDeviceIdentifierCollectionEnabled$purchases_defaultsBc8Release",
        "(Z)V",
        "getContext$purchases_defaultsBc8Release",
        "()Landroid/content/Context;",
        "Lcom/revenuecat/purchases/DangerousSettings;",
        "dangerousSettings",
        "getDangerousSettings$purchases_defaultsBc8Release",
        "()Lcom/revenuecat/purchases/DangerousSettings;",
        "setDangerousSettings$purchases_defaultsBc8Release",
        "(Lcom/revenuecat/purchases/DangerousSettings;)V",
        "diagnosticsEnabled",
        "getDiagnosticsEnabled$purchases_defaultsBc8Release",
        "setDiagnosticsEnabled$purchases_defaultsBc8Release",
        "Lcom/revenuecat/purchases/galaxy/GalaxyBillingMode;",
        "galaxyBillingMode",
        "getGalaxyBillingMode$purchases_defaultsBc8Release$annotations",
        "()V",
        "getGalaxyBillingMode$purchases_defaultsBc8Release",
        "()Lcom/revenuecat/purchases/galaxy/GalaxyBillingMode;",
        "setGalaxyBillingMode$purchases_defaultsBc8Release",
        "(Lcom/revenuecat/purchases/galaxy/GalaxyBillingMode;)V",
        "pendingTransactionsForPrepaidPlansEnabled",
        "getPendingTransactionsForPrepaidPlansEnabled$purchases_defaultsBc8Release",
        "setPendingTransactionsForPrepaidPlansEnabled$purchases_defaultsBc8Release",
        "preferredUILocaleOverride",
        "getPreferredUILocaleOverride$purchases_defaultsBc8Release",
        "setPreferredUILocaleOverride$purchases_defaultsBc8Release",
        "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;",
        "purchasesAreCompletedBy",
        "getPurchasesAreCompletedBy$purchases_defaultsBc8Release",
        "()Lcom/revenuecat/purchases/PurchasesAreCompletedBy;",
        "setPurchasesAreCompletedBy$purchases_defaultsBc8Release",
        "(Lcom/revenuecat/purchases/PurchasesAreCompletedBy;)V",
        "Ljava/util/concurrent/ExecutorService;",
        "service",
        "getService$purchases_defaultsBc8Release",
        "()Ljava/util/concurrent/ExecutorService;",
        "setService$purchases_defaultsBc8Release",
        "(Ljava/util/concurrent/ExecutorService;)V",
        "showInAppMessagesAutomatically",
        "getShowInAppMessagesAutomatically$purchases_defaultsBc8Release",
        "setShowInAppMessagesAutomatically$purchases_defaultsBc8Release",
        "Lcom/revenuecat/purchases/Store;",
        "store",
        "getStore$purchases_defaultsBc8Release",
        "()Lcom/revenuecat/purchases/Store;",
        "setStore$purchases_defaultsBc8Release",
        "(Lcom/revenuecat/purchases/Store;)V",
        "Lcom/revenuecat/purchases/EntitlementVerificationMode;",
        "verificationMode",
        "getVerificationMode$purchases_defaultsBc8Release",
        "()Lcom/revenuecat/purchases/EntitlementVerificationMode;",
        "setVerificationMode$purchases_defaultsBc8Release",
        "(Lcom/revenuecat/purchases/EntitlementVerificationMode;)V",
        "build",
        "Lcom/revenuecat/purchases/PurchasesConfiguration;",
        "entitlementVerificationMode",
        "informationalVerificationModeAndDiagnosticsEnabled",
        "enabled",
        "observerMode",
        "localeString",
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
.field private final apiKey:Ljava/lang/String;

.field private appUserID:Ljava/lang/String;

.field private automaticDeviceIdentifierCollectionEnabled:Z

.field private final context:Landroid/content/Context;

.field private dangerousSettings:Lcom/revenuecat/purchases/DangerousSettings;

.field private diagnosticsEnabled:Z

.field private galaxyBillingMode:Lcom/revenuecat/purchases/galaxy/GalaxyBillingMode;

.field private pendingTransactionsForPrepaidPlansEnabled:Z

.field private preferredUILocaleOverride:Ljava/lang/String;

.field private purchasesAreCompletedBy:Lcom/revenuecat/purchases/PurchasesAreCompletedBy;

.field private service:Ljava/util/concurrent/ExecutorService;

.field private showInAppMessagesAutomatically:Z

.field private store:Lcom/revenuecat/purchases/Store;

.field private verificationMode:Lcom/revenuecat/purchases/EntitlementVerificationMode;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "apiKey"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->context:Landroid/content/Context;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->apiKey:Ljava/lang/String;

    .line 17
    .line 18
    sget-object p1, Lcom/revenuecat/purchases/PurchasesAreCompletedBy;->REVENUECAT:Lcom/revenuecat/purchases/PurchasesAreCompletedBy;

    .line 19
    .line 20
    iput-object p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->purchasesAreCompletedBy:Lcom/revenuecat/purchases/PurchasesAreCompletedBy;

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->showInAppMessagesAutomatically:Z

    .line 24
    .line 25
    sget-object p2, Lcom/revenuecat/purchases/Store;->PLAY_STORE:Lcom/revenuecat/purchases/Store;

    .line 26
    .line 27
    iput-object p2, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->store:Lcom/revenuecat/purchases/Store;

    .line 28
    .line 29
    sget-object p2, Lcom/revenuecat/purchases/EntitlementVerificationMode;->Companion:Lcom/revenuecat/purchases/EntitlementVerificationMode$Companion;

    .line 30
    .line 31
    invoke-virtual {p2}, Lcom/revenuecat/purchases/EntitlementVerificationMode$Companion;->getDefault()Lcom/revenuecat/purchases/EntitlementVerificationMode;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    iput-object p2, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->verificationMode:Lcom/revenuecat/purchases/EntitlementVerificationMode;

    .line 36
    .line 37
    new-instance p2, Lcom/revenuecat/purchases/DangerousSettings;

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-direct {p2, v0, p1, v1}, Lcom/revenuecat/purchases/DangerousSettings;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 42
    .line 43
    .line 44
    iput-object p2, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->dangerousSettings:Lcom/revenuecat/purchases/DangerousSettings;

    .line 45
    .line 46
    iput-boolean p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->automaticDeviceIdentifierCollectionEnabled:Z

    .line 47
    .line 48
    sget-object p1, Lcom/revenuecat/purchases/galaxy/GalaxyBillingMode;->PRODUCTION:Lcom/revenuecat/purchases/galaxy/GalaxyBillingMode;

    .line 49
    .line 50
    iput-object p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->galaxyBillingMode:Lcom/revenuecat/purchases/galaxy/GalaxyBillingMode;

    .line 51
    .line 52
    return-void
.end method

.method public static synthetic getGalaxyBillingMode$purchases_defaultsBc8Release$annotations()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final appUserID(Ljava/lang/String;)Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->appUserID:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final automaticDeviceIdentifierCollectionEnabled(Z)Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->automaticDeviceIdentifierCollectionEnabled:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public build()Lcom/revenuecat/purchases/PurchasesConfiguration;
    .locals 1

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/PurchasesConfiguration;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/revenuecat/purchases/PurchasesConfiguration;-><init>(Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final dangerousSettings(Lcom/revenuecat/purchases/DangerousSettings;)Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;
    .locals 1

    .line 1
    const-string v0, "dangerousSettings"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->dangerousSettings:Lcom/revenuecat/purchases/DangerousSettings;

    .line 7
    .line 8
    return-object p0
.end method

.method public final diagnosticsEnabled(Z)Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->diagnosticsEnabled:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final entitlementVerificationMode(Lcom/revenuecat/purchases/EntitlementVerificationMode;)Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;
    .locals 1

    .line 1
    const-string v0, "verificationMode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->verificationMode:Lcom/revenuecat/purchases/EntitlementVerificationMode;

    .line 7
    .line 8
    return-object p0
.end method

.method public final galaxyBillingMode(Lcom/revenuecat/purchases/galaxy/GalaxyBillingMode;)Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;
    .locals 1

    .line 1
    const-string v0, "galaxyBillingMode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->galaxyBillingMode:Lcom/revenuecat/purchases/galaxy/GalaxyBillingMode;

    .line 7
    .line 8
    return-object p0
.end method

.method public final synthetic getApiKey$purchases_defaultsBc8Release()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->apiKey:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getAppUserID$purchases_defaultsBc8Release()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->appUserID:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getAutomaticDeviceIdentifierCollectionEnabled$purchases_defaultsBc8Release()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->automaticDeviceIdentifierCollectionEnabled:Z

    .line 2
    .line 3
    return v0
.end method

.method public final synthetic getContext$purchases_defaultsBc8Release()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->context:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getDangerousSettings$purchases_defaultsBc8Release()Lcom/revenuecat/purchases/DangerousSettings;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->dangerousSettings:Lcom/revenuecat/purchases/DangerousSettings;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getDiagnosticsEnabled$purchases_defaultsBc8Release()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->diagnosticsEnabled:Z

    .line 2
    .line 3
    return v0
.end method

.method public final synthetic getGalaxyBillingMode$purchases_defaultsBc8Release()Lcom/revenuecat/purchases/galaxy/GalaxyBillingMode;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->galaxyBillingMode:Lcom/revenuecat/purchases/galaxy/GalaxyBillingMode;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getPendingTransactionsForPrepaidPlansEnabled$purchases_defaultsBc8Release()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->pendingTransactionsForPrepaidPlansEnabled:Z

    .line 2
    .line 3
    return v0
.end method

.method public final synthetic getPreferredUILocaleOverride$purchases_defaultsBc8Release()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->preferredUILocaleOverride:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getPurchasesAreCompletedBy$purchases_defaultsBc8Release()Lcom/revenuecat/purchases/PurchasesAreCompletedBy;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->purchasesAreCompletedBy:Lcom/revenuecat/purchases/PurchasesAreCompletedBy;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getService$purchases_defaultsBc8Release()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->service:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getShowInAppMessagesAutomatically$purchases_defaultsBc8Release()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->showInAppMessagesAutomatically:Z

    .line 2
    .line 3
    return v0
.end method

.method public final synthetic getStore$purchases_defaultsBc8Release()Lcom/revenuecat/purchases/Store;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->store:Lcom/revenuecat/purchases/Store;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getVerificationMode$purchases_defaultsBc8Release()Lcom/revenuecat/purchases/EntitlementVerificationMode;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->verificationMode:Lcom/revenuecat/purchases/EntitlementVerificationMode;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic informationalVerificationModeAndDiagnosticsEnabled(Z)Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;
    .locals 0
    .annotation runtime LTd/e;
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lcom/revenuecat/purchases/EntitlementVerificationMode;->INFORMATIONAL:Lcom/revenuecat/purchases/EntitlementVerificationMode;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->verificationMode:Lcom/revenuecat/purchases/EntitlementVerificationMode;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->diagnosticsEnabled:Z

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    sget-object p1, Lcom/revenuecat/purchases/EntitlementVerificationMode;->DISABLED:Lcom/revenuecat/purchases/EntitlementVerificationMode;

    .line 12
    .line 13
    iput-object p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->verificationMode:Lcom/revenuecat/purchases/EntitlementVerificationMode;

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput-boolean p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->diagnosticsEnabled:Z

    .line 17
    .line 18
    return-object p0
.end method

.method public final observerMode(Z)Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;
    .locals 0
    .annotation runtime LTd/e;
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lcom/revenuecat/purchases/PurchasesAreCompletedBy;->MY_APP:Lcom/revenuecat/purchases/PurchasesAreCompletedBy;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object p1, Lcom/revenuecat/purchases/PurchasesAreCompletedBy;->REVENUECAT:Lcom/revenuecat/purchases/PurchasesAreCompletedBy;

    .line 7
    .line 8
    :goto_0
    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->purchasesAreCompletedBy(Lcom/revenuecat/purchases/PurchasesAreCompletedBy;)Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final pendingTransactionsForPrepaidPlansEnabled(Z)Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->pendingTransactionsForPrepaidPlansEnabled:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final preferredUILocaleOverride(Ljava/lang/String;)Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->preferredUILocaleOverride:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final purchasesAreCompletedBy(Lcom/revenuecat/purchases/PurchasesAreCompletedBy;)Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;
    .locals 1

    .line 1
    const-string v0, "purchasesAreCompletedBy"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->purchasesAreCompletedBy:Lcom/revenuecat/purchases/PurchasesAreCompletedBy;

    .line 7
    .line 8
    return-object p0
.end method

.method public final service(Ljava/util/concurrent/ExecutorService;)Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;
    .locals 1

    .line 1
    const-string v0, "service"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->service:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    return-object p0
.end method

.method public final synthetic setAppUserID$purchases_defaultsBc8Release(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->appUserID:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final synthetic setAutomaticDeviceIdentifierCollectionEnabled$purchases_defaultsBc8Release(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->automaticDeviceIdentifierCollectionEnabled:Z

    .line 2
    .line 3
    return-void
.end method

.method public final synthetic setDangerousSettings$purchases_defaultsBc8Release(Lcom/revenuecat/purchases/DangerousSettings;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->dangerousSettings:Lcom/revenuecat/purchases/DangerousSettings;

    .line 7
    .line 8
    return-void
.end method

.method public final synthetic setDiagnosticsEnabled$purchases_defaultsBc8Release(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->diagnosticsEnabled:Z

    .line 2
    .line 3
    return-void
.end method

.method public final synthetic setGalaxyBillingMode$purchases_defaultsBc8Release(Lcom/revenuecat/purchases/galaxy/GalaxyBillingMode;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->galaxyBillingMode:Lcom/revenuecat/purchases/galaxy/GalaxyBillingMode;

    .line 7
    .line 8
    return-void
.end method

.method public final synthetic setPendingTransactionsForPrepaidPlansEnabled$purchases_defaultsBc8Release(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->pendingTransactionsForPrepaidPlansEnabled:Z

    .line 2
    .line 3
    return-void
.end method

.method public final synthetic setPreferredUILocaleOverride$purchases_defaultsBc8Release(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->preferredUILocaleOverride:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final synthetic setPurchasesAreCompletedBy$purchases_defaultsBc8Release(Lcom/revenuecat/purchases/PurchasesAreCompletedBy;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->purchasesAreCompletedBy:Lcom/revenuecat/purchases/PurchasesAreCompletedBy;

    .line 7
    .line 8
    return-void
.end method

.method public final synthetic setService$purchases_defaultsBc8Release(Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->service:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    return-void
.end method

.method public final synthetic setShowInAppMessagesAutomatically$purchases_defaultsBc8Release(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->showInAppMessagesAutomatically:Z

    .line 2
    .line 3
    return-void
.end method

.method public final synthetic setStore$purchases_defaultsBc8Release(Lcom/revenuecat/purchases/Store;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->store:Lcom/revenuecat/purchases/Store;

    .line 7
    .line 8
    return-void
.end method

.method public final synthetic setVerificationMode$purchases_defaultsBc8Release(Lcom/revenuecat/purchases/EntitlementVerificationMode;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->verificationMode:Lcom/revenuecat/purchases/EntitlementVerificationMode;

    .line 7
    .line 8
    return-void
.end method

.method public final showInAppMessagesAutomatically(Z)Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->showInAppMessagesAutomatically:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final store(Lcom/revenuecat/purchases/Store;)Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;
    .locals 1

    .line 1
    const-string v0, "store"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;->store:Lcom/revenuecat/purchases/Store;

    .line 7
    .line 8
    return-object p0
.end method
