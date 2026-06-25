.class public final Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgsKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "DEFAULT_DISPLAY_DISMISS_BUTTON",
        "",
        "defaultEdgeToEdge",
        "getDefaultEdgeToEdge",
        "()Z",
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
.field public static final DEFAULT_DISPLAY_DISMISS_BUTTON:Z = true

.field private static final defaultEdgeToEdge:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x23

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    sput-boolean v0, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgsKt;->defaultEdgeToEdge:Z

    .line 11
    .line 12
    return-void
.end method

.method public static final getDefaultEdgeToEdge()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgsKt;->defaultEdgeToEdge:Z

    .line 2
    .line 3
    return v0
.end method
