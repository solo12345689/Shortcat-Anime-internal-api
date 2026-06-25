.class public final Lcom/revenuecat/purchases/react/ui/RNPaywallsModule;
.super Lcom/facebook/react/bridge/ReactContextBaseJavaModule;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/react/ui/RNPaywallsModule$Companion;,
        Lcom/revenuecat/purchases/react/ui/RNPaywallsModule$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 -2\u00020\u0001:\u0001-B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005JS\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\r\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015JI\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0017JO\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ)\u0010 \u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u0007\u00a2\u0006\u0004\u0008 \u0010!J\u0019\u0010#\u001a\u00020\u00112\u0008\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0007\u00a2\u0006\u0004\u0008#\u0010$J\u0019\u0010\'\u001a\u00020\u00112\u0008\u0010&\u001a\u0004\u0018\u00010%H\u0007\u00a2\u0006\u0004\u0008\'\u0010(R\u0016\u0010,\u001a\u0004\u0018\u00010)8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010+\u00a8\u0006."
    }
    d2 = {
        "Lcom/revenuecat/purchases/react/ui/RNPaywallsModule;",
        "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "reactContext",
        "<init>",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;)V",
        "",
        "requiredEntitlementIdentifier",
        "offeringIdentifier",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "presentedOfferingContext",
        "",
        "displayCloseButton",
        "fontFamilyName",
        "customVariables",
        "Lcom/facebook/react/bridge/Promise;",
        "promise",
        "LTd/L;",
        "presentPaywall",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/Boolean;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V",
        "getName",
        "()Ljava/lang/String;",
        "fontFamily",
        "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/Boolean;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V",
        "presentPaywallIfNeeded",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;ZLjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V",
        "requestId",
        "shouldProceed",
        "resumePurchasePackageInitiated",
        "(Ljava/lang/String;Z)V",
        "result",
        "errorMessage",
        "resolvePurchaseLogicResult",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "eventName",
        "addListener",
        "(Ljava/lang/String;)V",
        "",
        "count",
        "removeListeners",
        "(Ljava/lang/Integer;)V",
        "Landroidx/fragment/app/v;",
        "getCurrentFragmentActivity",
        "()Landroidx/fragment/app/v;",
        "currentFragmentActivity",
        "Companion",
        "react-native-purchases-ui_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/revenuecat/purchases/react/ui/RNPaywallsModule$Companion;

.field public static final NAME:Ljava/lang/String; = "RNPaywalls"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/react/ui/RNPaywallsModule$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/react/ui/RNPaywallsModule$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/revenuecat/purchases/react/ui/RNPaywallsModule;->Companion:Lcom/revenuecat/purchases/react/ui/RNPaywallsModule$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic a(Landroidx/fragment/app/v;Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource;Ljava/lang/String;Ljava/lang/Boolean;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;Ljava/util/Map;Lcom/facebook/react/bridge/Promise;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/revenuecat/purchases/react/ui/RNPaywallsModule;->presentPaywall$lambda$5(Landroidx/fragment/app/v;Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource;Ljava/lang/String;Ljava/lang/Boolean;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;Ljava/util/Map;Lcom/facebook/react/bridge/Promise;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final getCurrentFragmentActivity()Landroidx/fragment/app/v;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Landroidx/fragment/app/v;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Landroidx/fragment/app/v;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const-string v0, "RNPaywalls"

    .line 17
    .line 18
    const-string v1, "RevenueCat paywalls require applications to use a FragmentActivity"

    .line 19
    .line 20
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    return-object v0
.end method

.method private final presentPaywall(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/Boolean;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 8

    .line 2
    invoke-direct {p0}, Lcom/revenuecat/purchases/react/ui/RNPaywallsModule;->getCurrentFragmentActivity()Landroidx/fragment/app/v;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    if-eqz p5, :cond_1

    .line 3
    sget-object v2, Lcom/revenuecat/purchases/react/ui/FontAssetManager;->INSTANCE:Lcom/revenuecat/purchases/react/ui/FontAssetManager;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v3

    const-string v4, "getAssets(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p5, v3}, Lcom/revenuecat/purchases/react/ui/FontAssetManager;->getPaywallFontFamily(Ljava/lang/String;Landroid/content/res/AssetManager;)Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;

    move-result-object p5

    move-object v5, p5

    goto :goto_0

    :cond_1
    move-object v5, v0

    :goto_0
    if-eqz p2, :cond_3

    .line 4
    sget-object p5, Lcom/revenuecat/purchases/react/ui/RNPurchasesConverters;->INSTANCE:Lcom/revenuecat/purchases/react/ui/RNPurchasesConverters;

    if-eqz p3, :cond_2

    invoke-interface {p3}, Lcom/facebook/react/bridge/ReadableMap;->toHashMap()Ljava/util/HashMap;

    move-result-object p3

    goto :goto_1

    :cond_2
    move-object p3, v0

    :goto_1
    invoke-virtual {p5, p2, p3}, Lcom/revenuecat/purchases/react/ui/RNPurchasesConverters;->presentedOfferingContext(Ljava/lang/String;Ljava/util/Map;)Lcom/revenuecat/purchases/PresentedOfferingContext;

    move-result-object p3

    .line 5
    new-instance p5, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource$OfferingIdentifierWithPresentedOfferingContext;

    invoke-direct {p5, p2, p3}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource$OfferingIdentifierWithPresentedOfferingContext;-><init>(Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;)V

    :goto_2
    move-object v2, p5

    goto :goto_3

    .line 6
    :cond_3
    sget-object p5, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource$DefaultOffering;->INSTANCE:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource$DefaultOffering;

    goto :goto_2

    :goto_3
    if-eqz p6, :cond_9

    .line 7
    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 8
    invoke-interface {p6}, Lcom/facebook/react/bridge/ReadableMap;->keySetIterator()Lcom/facebook/react/bridge/ReadableMapKeySetIterator;

    move-result-object p3

    .line 9
    :cond_4
    :goto_4
    invoke-interface {p3}, Lcom/facebook/react/bridge/ReadableMapKeySetIterator;->hasNextKey()Z

    move-result p5

    if-eqz p5, :cond_8

    .line 10
    invoke-interface {p3}, Lcom/facebook/react/bridge/ReadableMapKeySetIterator;->nextKey()Ljava/lang/String;

    move-result-object p5

    .line 11
    invoke-interface {p6, p5}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v3

    sget-object v4, Lcom/revenuecat/purchases/react/ui/RNPaywallsModule$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_7

    const/4 v4, 0x2

    if-eq v3, v4, :cond_6

    const/4 v4, 0x3

    if-eq v3, v4, :cond_5

    goto :goto_4

    .line 12
    :cond_5
    invoke-interface {p6, p5}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-interface {p2, p5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 13
    :cond_6
    invoke-interface {p6, p5}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-interface {p2, p5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 14
    :cond_7
    invoke-interface {p6, p5}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-interface {p2, p5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 15
    :cond_8
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_9

    move-object v0, p2

    :cond_9
    move-object v6, v0

    .line 16
    new-instance v0, Lcom/revenuecat/purchases/react/ui/i;

    move-object v3, p1

    move-object v4, p4

    move-object v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/revenuecat/purchases/react/ui/i;-><init>(Landroidx/fragment/app/v;Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource;Ljava/lang/String;Ljava/lang/Boolean;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;Ljava/util/Map;Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final presentPaywall$lambda$5(Landroidx/fragment/app/v;Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource;Ljava/lang/String;Ljava/lang/Boolean;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;Ljava/util/Map;Lcom/facebook/react/bridge/Promise;)V
    .locals 11

    .line 1
    new-instance v1, Lcom/revenuecat/purchases/react/ui/RNPaywallsModule$presentPaywall$1$1;

    .line 2
    .line 3
    move-object/from16 v0, p6

    .line 4
    .line 5
    invoke-direct {v1, v0}, Lcom/revenuecat/purchases/react/ui/RNPaywallsModule$presentPaywall$1$1;-><init>(Lcom/facebook/react/bridge/Promise;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;

    .line 9
    .line 10
    const/16 v9, 0xc0

    .line 11
    .line 12
    const/4 v10, 0x0

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    move-object v2, p1

    .line 16
    move-object v3, p2

    .line 17
    move-object v4, p3

    .line 18
    move-object v5, p4

    .line 19
    move-object/from16 v6, p5

    .line 20
    .line 21
    invoke-direct/range {v0 .. v10}, Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;-><init>(Lcom/revenuecat/purchases/hybridcommon/ui/PaywallResultListener;Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource;Ljava/lang/String;Ljava/lang/Boolean;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;Ljava/util/Map;Lcom/revenuecat/purchases/hybridcommon/ui/PaywallListenerWrapper;Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p0, v0}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallHelpersKt;->presentPaywallFromFragment(Landroidx/fragment/app/v;Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final addListener(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "RNPaywalls"

    .line 2
    .line 3
    return-object v0
.end method

.method public final presentPaywall(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/Boolean;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 9
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "promise"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    move-object v8, p6

    .line 1
    invoke-direct/range {v1 .. v8}, Lcom/revenuecat/purchases/react/ui/RNPaywallsModule;->presentPaywall(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/Boolean;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V

    return-void
.end method

.method public final presentPaywallIfNeeded(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;ZLjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 9
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const-string v0, "requiredEntitlementIdentifier"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "promise"

    .line 7
    .line 8
    move-object/from16 v8, p7

    .line 9
    .line 10
    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    move-object v1, p0

    .line 18
    move-object v2, p1

    .line 19
    move-object v3, p2

    .line 20
    move-object v4, p3

    .line 21
    move-object v6, p5

    .line 22
    move-object v7, p6

    .line 23
    invoke-direct/range {v1 .. v8}, Lcom/revenuecat/purchases/react/ui/RNPaywallsModule;->presentPaywall(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/Boolean;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final removeListeners(Ljava/lang/Integer;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    return-void
.end method

.method public final resolvePurchaseLogicResult(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const-string v0, "requestId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "result"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;->Companion:Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$Companion;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2, p3}, Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$Companion;->resolveResult(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final resumePurchasePackageInitiated(Ljava/lang/String;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const-string v0, "requestId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallListenerWrapper;->Companion:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallListenerWrapper$Companion;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallListenerWrapper$Companion;->resumePurchasePackageInitiated(Ljava/lang/String;Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
