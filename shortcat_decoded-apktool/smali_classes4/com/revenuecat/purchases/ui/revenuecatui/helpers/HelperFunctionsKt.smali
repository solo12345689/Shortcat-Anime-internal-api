.class public final Lcom/revenuecat/purchases/ui/revenuecatui/helpers/HelperFunctionsKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a$\u0010\t\u001a\u00020\u00002\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00000\u0006H\u0080@\u00a2\u0006\u0004\u0008\t\u0010\n\u001a7\u0010\t\u001a\u00020\u000b2\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00000\u00062\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\u0006H\u0000\u00a2\u0006\u0004\u0008\t\u0010\r\u001a#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00000\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\"\"\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "",
        "isInPreviewMode",
        "(LY/m;I)Z",
        "",
        "windowAspectRatio",
        "(LY/m;I)F",
        "Lkotlin/Function1;",
        "Lcom/revenuecat/purchases/CustomerInfo;",
        "shouldDisplayBlock",
        "shouldDisplayPaywall",
        "(Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;",
        "LTd/L;",
        "result",
        "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V",
        "",
        "entitlement",
        "shouldDisplayBlockForEntitlementIdentifier",
        "(Ljava/lang/String;)Lkotlin/jvm/functions/Function1;",
        "LY/b1;",
        "Landroid/app/Activity;",
        "LocalActivity",
        "LY/b1;",
        "getLocalActivity",
        "()LY/b1;",
        "revenuecatui_defaultsBc8Release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final LocalActivity:LY/b1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY/b1;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/HelperFunctionsKt$LocalActivity$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/HelperFunctionsKt$LocalActivity$1;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {v2, v0, v1, v2}, LY/H;->h(LY/T1;Lie/a;ILjava/lang/Object;)LY/b1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/HelperFunctionsKt;->LocalActivity:LY/b1;

    .line 10
    .line 11
    return-void
.end method

.method public static final getLocalActivity()LY/b1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LY/b1;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/HelperFunctionsKt;->LocalActivity:LY/b1;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final isInPreviewMode(LY/m;I)Z
    .locals 3

    .line 1
    invoke-static {}, LY/w;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.helpers.isInPreviewMode (HelperFunctions.kt:24)"

    .line 9
    .line 10
    const v2, 0x2e2e65ff

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p1, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/U0;->a()LY/b1;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-interface {p0, p1}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-static {}, LY/w;->L()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    invoke-static {}, LY/w;->T()V

    .line 37
    .line 38
    .line 39
    :cond_1
    return p0
.end method

.method public static final shouldDisplayBlockForEntitlementIdentifier(Ljava/lang/String;)Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    .line 1
    const-string v0, "entitlement"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/HelperFunctionsKt$shouldDisplayBlockForEntitlementIdentifier$1;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/HelperFunctionsKt$shouldDisplayBlockForEntitlementIdentifier$1;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static final shouldDisplayPaywall(Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, LZd/k;

    invoke-static {p1}, Lae/b;->c(LZd/e;)LZd/e;

    move-result-object v1

    invoke-direct {v0, v1}, LZd/k;-><init>(LZd/e;)V

    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/HelperFunctionsKt$shouldDisplayPaywall$2$1;

    invoke-direct {v1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/HelperFunctionsKt$shouldDisplayPaywall$2$1;-><init>(Ljava/lang/Object;)V

    invoke-static {p0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/HelperFunctionsKt;->shouldDisplayPaywall(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, LZd/k;->a()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    :cond_0
    return-object p0
.end method

.method public static final shouldDisplayPaywall(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "shouldDisplayBlock"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/revenuecat/purchases/Purchases;->Companion:Lcom/revenuecat/purchases/Purchases$Companion;

    invoke-virtual {v0}, Lcom/revenuecat/purchases/Purchases$Companion;->getSharedInstance()Lcom/revenuecat/purchases/Purchases;

    move-result-object v0

    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/HelperFunctionsKt$shouldDisplayPaywall$3;

    invoke-direct {v1, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/HelperFunctionsKt$shouldDisplayPaywall$3;-><init>(Lkotlin/jvm/functions/Function1;)V

    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/HelperFunctionsKt$shouldDisplayPaywall$4;

    invoke-direct {v2, p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/HelperFunctionsKt$shouldDisplayPaywall$4;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-static {v0, v1, v2}, Lcom/revenuecat/purchases/ListenerConversionsKt;->getCustomerInfoWith(Lcom/revenuecat/purchases/Purchases;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final windowAspectRatio(LY/m;I)F
    .locals 3

    .line 1
    invoke-static {}, LY/w;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.helpers.windowAspectRatio (HelperFunctions.kt:28)"

    .line 9
    .line 10
    const v2, 0x73e4f072

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p1, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f()LY/b1;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-interface {p0, p1}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Landroid/content/res/Configuration;

    .line 25
    .line 26
    iget p1, p0, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 27
    .line 28
    int-to-float p1, p1

    .line 29
    iget p0, p0, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 30
    .line 31
    int-to-float p0, p0

    .line 32
    div-float/2addr p1, p0

    .line 33
    invoke-static {}, LY/w;->L()Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    invoke-static {}, LY/w;->T()V

    .line 40
    .line 41
    .line 42
    :cond_1
    return p1
.end method
