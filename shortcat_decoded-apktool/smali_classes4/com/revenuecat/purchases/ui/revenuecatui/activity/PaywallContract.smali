.class public final Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallContract;
.super Lh/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lh/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallContract;",
        "Lh/a;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "args",
        "Landroid/content/Intent;",
        "createIntent",
        "(Landroid/content/Context;Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;)Landroid/content/Intent;",
        "",
        "resultCode",
        "intent",
        "parseResult",
        "(ILandroid/content/Intent;)Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;",
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


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lh/a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public createIntent(Landroid/content/Context;Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;)Landroid/content/Intent;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 3
    const-string p1, "paywall_args"

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    return-object v0
.end method

.method public bridge synthetic createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 0

    .line 1
    check-cast p2, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallContract;->createIntent(Landroid/content/Context;Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public parseResult(ILandroid/content/Intent;)Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;
    .locals 2

    const/4 v0, -0x1

    if-ne p1, v0, :cond_4

    if-nez p2, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    const-string v1, "paywall_result"

    if-lt p1, v0, :cond_1

    .line 3
    const-class p1, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;

    invoke-static {p2, v1, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/a;->a(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    instance-of p2, p1, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;

    if-eqz p2, :cond_2

    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_3

    .line 5
    new-instance p1, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult$Error;

    .line 6
    new-instance p2, Lcom/revenuecat/purchases/PurchasesError;

    sget-object v0, Lcom/revenuecat/purchases/PurchasesErrorCode;->UnknownError:Lcom/revenuecat/purchases/PurchasesErrorCode;

    const-string v1, "PaywallActivity returned null result"

    invoke-direct {p2, v0, v1}, Lcom/revenuecat/purchases/PurchasesError;-><init>(Lcom/revenuecat/purchases/PurchasesErrorCode;Ljava/lang/String;)V

    .line 7
    invoke-direct {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult$Error;-><init>(Lcom/revenuecat/purchases/PurchasesError;)V

    :cond_3
    return-object p1

    .line 8
    :cond_4
    :goto_1
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult$Cancelled;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult$Cancelled;

    return-object p1
.end method

.method public bridge synthetic parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallContract;->parseResult(ILandroid/content/Intent;)Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;

    move-result-object p1

    return-object p1
.end method
