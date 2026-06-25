.class public interface abstract Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallValidationResult;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallValidationResult$Components;,
        Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallValidationResult$Legacy;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008p\u0018\u00002\u00020\u0001:\u0002\u0007\u0008R\u001a\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0001\u0002\t\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallValidationResult;",
        "",
        "errors",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;",
        "getErrors",
        "()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;",
        "Components",
        "Legacy",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallValidationResult$Components;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallValidationResult$Legacy;",
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


# virtual methods
.method public abstract getErrors()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList<",
            "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;",
            ">;"
        }
    .end annotation
.end method
