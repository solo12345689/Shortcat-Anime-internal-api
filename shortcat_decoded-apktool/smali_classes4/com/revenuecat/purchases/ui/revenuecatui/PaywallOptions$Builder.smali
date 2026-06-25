.class public final Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008,\u0008\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0019\u0010\u000f\u001a\u00020\u00002\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0019\u0010\u0014\u001a\u00020\u00002\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00002\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00002\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00002\u0008\u0010\"\u001a\u0004\u0018\u00010!\u00a2\u0006\u0004\u0008#\u0010$J\u0017\u0010)\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%H\u0000\u00a2\u0006\u0004\u0008\'\u0010(J/\u0010/\u001a\u00020\u00002\u001e\u0010,\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0004\u0012\u00020\u0003\u0018\u00010*H\u0000\u00a2\u0006\u0004\u0008-\u0010.J!\u00104\u001a\u00020\u00002\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020200\u00a2\u0006\u0004\u00084\u00105J\r\u00107\u001a\u000206\u00a2\u0006\u0004\u00087\u00108R \u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00109\u001a\u0004\u0008:\u0010;R\"\u0010\u0011\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010<\u001a\u0004\u0008=\u0010>\"\u0004\u0008\u0012\u0010?R\"\u0010\u0016\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010@\u001a\u0004\u0008A\u0010B\"\u0004\u0008C\u0010DR$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010E\u001a\u0004\u0008F\u0010G\"\u0004\u0008H\u0010IR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001e\u0010J\u001a\u0004\u0008K\u0010L\"\u0004\u0008M\u0010NR$\u0010\"\u001a\u0004\u0018\u00010!8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\"\u0010O\u001a\u0004\u0008P\u0010Q\"\u0004\u0008R\u0010SR\"\u0010&\u001a\u00020%8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008&\u0010T\u001a\u0004\u0008U\u0010V\"\u0004\u0008\'\u0010WR:\u0010,\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0004\u0012\u00020\u0003\u0018\u00010*8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008,\u0010X\u001a\u0004\u0008Y\u0010Z\"\u0004\u0008-\u0010[R.\u0010\\\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000202008\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\\\u0010]\u001a\u0004\u0008^\u0010_\"\u0004\u0008`\u0010a\u00a8\u0006b"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;",
        "",
        "Lkotlin/Function0;",
        "LTd/L;",
        "dismissRequest",
        "<init>",
        "(Lie/a;)V",
        "Lcom/revenuecat/purchases/Offering;",
        "offering",
        "setOffering",
        "(Lcom/revenuecat/purchases/Offering;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;",
        "idAndPresentedOfferingContext",
        "setOfferingIdAndPresentedOfferingContext$revenuecatui_defaultsBc8Release",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;",
        "setOfferingIdAndPresentedOfferingContext",
        "Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;",
        "offeringSelection",
        "setOfferingSelection$revenuecatui_defaultsBc8Release",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;",
        "setOfferingSelection",
        "",
        "shouldDisplayDismissButton",
        "setShouldDisplayDismissButton",
        "(Z)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;",
        "fontProvider",
        "setFontProvider",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;",
        "listener",
        "setListener",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;",
        "purchaseLogic",
        "setPurchaseLogic",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;",
        "mode",
        "setMode$revenuecatui_defaultsBc8Release",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;",
        "setMode",
        "Lkotlin/Function2;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;",
        "dismissRequestWithExitOffering",
        "setDismissRequestWithExitOffering$revenuecatui_defaultsBc8Release",
        "(Lkotlin/jvm/functions/Function2;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;",
        "setDismissRequestWithExitOffering",
        "",
        "",
        "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;",
        "variables",
        "setCustomVariables",
        "(Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;",
        "build",
        "()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;",
        "Lie/a;",
        "getDismissRequest$revenuecatui_defaultsBc8Release",
        "()Lie/a;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;",
        "getOfferingSelection$revenuecatui_defaultsBc8Release",
        "()Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;)V",
        "Z",
        "getShouldDisplayDismissButton$revenuecatui_defaultsBc8Release",
        "()Z",
        "setShouldDisplayDismissButton$revenuecatui_defaultsBc8Release",
        "(Z)V",
        "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;",
        "getFontProvider$revenuecatui_defaultsBc8Release",
        "()Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;",
        "setFontProvider$revenuecatui_defaultsBc8Release",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)V",
        "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;",
        "getListener$revenuecatui_defaultsBc8Release",
        "()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;",
        "setListener$revenuecatui_defaultsBc8Release",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;)V",
        "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;",
        "getPurchaseLogic$revenuecatui_defaultsBc8Release",
        "()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;",
        "setPurchaseLogic$revenuecatui_defaultsBc8Release",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;)V",
        "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;",
        "getMode$revenuecatui_defaultsBc8Release",
        "()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;)V",
        "Lkotlin/jvm/functions/Function2;",
        "getDismissRequestWithExitOffering$revenuecatui_defaultsBc8Release",
        "()Lkotlin/jvm/functions/Function2;",
        "(Lkotlin/jvm/functions/Function2;)V",
        "customVariables",
        "Ljava/util/Map;",
        "getCustomVariables$revenuecatui_defaultsBc8Release",
        "()Ljava/util/Map;",
        "setCustomVariables$revenuecatui_defaultsBc8Release",
        "(Ljava/util/Map;)V",
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
.field public static final $stable:I = 0x8


# instance fields
.field private customVariables:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;",
            ">;"
        }
    .end annotation
.end field

.field private final dismissRequest:Lie/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lie/a;"
        }
    .end annotation
.end field

.field private dismissRequestWithExitOffering:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2;"
        }
    .end annotation
.end field

.field private fontProvider:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;

.field private listener:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;

.field private mode:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;

.field private offeringSelection:Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;

.field private purchaseLogic:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;

.field private shouldDisplayDismissButton:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lie/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lie/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "dismissRequest"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->dismissRequest:Lie/a;

    .line 10
    .line 11
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$None;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$None;

    .line 12
    .line 13
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->offeringSelection:Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;

    .line 14
    .line 15
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;->Companion:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode$Companion;

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode$Companion;->getDefault()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->mode:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;

    .line 22
    .line 23
    invoke-static {}, LUd/S;->i()Ljava/util/Map;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->customVariables:Ljava/util/Map;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final build()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;
    .locals 1

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final getCustomVariables$revenuecatui_defaultsBc8Release()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->customVariables:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDismissRequest$revenuecatui_defaultsBc8Release()Lie/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lie/a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->dismissRequest:Lie/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDismissRequestWithExitOffering$revenuecatui_defaultsBc8Release()Lkotlin/jvm/functions/Function2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function2;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->dismissRequestWithExitOffering:Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFontProvider$revenuecatui_defaultsBc8Release()Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->fontProvider:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getListener$revenuecatui_defaultsBc8Release()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->listener:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMode$revenuecatui_defaultsBc8Release()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->mode:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOfferingSelection$revenuecatui_defaultsBc8Release()Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->offeringSelection:Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPurchaseLogic$revenuecatui_defaultsBc8Release()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->purchaseLogic:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getShouldDisplayDismissButton$revenuecatui_defaultsBc8Release()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->shouldDisplayDismissButton:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setCustomVariables(Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;",
            ">;)",
            "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;"
        }
    .end annotation

    .line 1
    const-string v0, "variables"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableKeyValidator;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableKeyValidator;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableKeyValidator;->validateAndFilter(Ljava/util/Map;)Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->customVariables:Ljava/util/Map;

    .line 13
    .line 14
    return-object p0
.end method

.method public final setCustomVariables$revenuecatui_defaultsBc8Release(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->customVariables:Ljava/util/Map;

    .line 7
    .line 8
    return-void
.end method

.method public final setDismissRequestWithExitOffering$revenuecatui_defaultsBc8Release(Lkotlin/jvm/functions/Function2;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2;",
            ")",
            "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;"
        }
    .end annotation

    .line 2
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->dismissRequestWithExitOffering:Lkotlin/jvm/functions/Function2;

    return-object p0
.end method

.method public final setDismissRequestWithExitOffering$revenuecatui_defaultsBc8Release(Lkotlin/jvm/functions/Function2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->dismissRequestWithExitOffering:Lkotlin/jvm/functions/Function2;

    return-void
.end method

.method public final setFontProvider(Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->fontProvider:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setFontProvider$revenuecatui_defaultsBc8Release(Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->fontProvider:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;

    .line 2
    .line 3
    return-void
.end method

.method public final setListener(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->listener:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setListener$revenuecatui_defaultsBc8Release(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->listener:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;

    .line 2
    .line 3
    return-void
.end method

.method public final setMode$revenuecatui_defaultsBc8Release(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;
    .locals 1

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->mode:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;

    return-object p0
.end method

.method public final setMode$revenuecatui_defaultsBc8Release(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->mode:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;

    return-void
.end method

.method public final setOffering(Lcom/revenuecat/purchases/Offering;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$OfferingType;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$OfferingType;-><init>(Lcom/revenuecat/purchases/Offering;)V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$None;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$None;

    .line 10
    .line 11
    :goto_0
    iput-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->offeringSelection:Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;

    .line 12
    .line 13
    return-object p0
.end method

.method public final setOfferingIdAndPresentedOfferingContext$revenuecatui_defaultsBc8Release(Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$None;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$None;

    .line 5
    .line 6
    :goto_0
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->offeringSelection:Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;

    .line 7
    .line 8
    return-object p0
.end method

.method public final setOfferingSelection$revenuecatui_defaultsBc8Release(Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;
    .locals 0

    if-nez p1, :cond_0

    .line 2
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$None;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$None;

    :cond_0
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->offeringSelection:Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;

    return-object p0
.end method

.method public final setOfferingSelection$revenuecatui_defaultsBc8Release(Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->offeringSelection:Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;

    return-void
.end method

.method public final setPurchaseLogic(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->purchaseLogic:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setPurchaseLogic$revenuecatui_defaultsBc8Release(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->purchaseLogic:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;

    .line 2
    .line 3
    return-void
.end method

.method public final setShouldDisplayDismissButton(Z)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->shouldDisplayDismissButton:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final setShouldDisplayDismissButton$revenuecatui_defaultsBc8Release(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->shouldDisplayDismissButton:Z

    .line 2
    .line 3
    return-void
.end method
