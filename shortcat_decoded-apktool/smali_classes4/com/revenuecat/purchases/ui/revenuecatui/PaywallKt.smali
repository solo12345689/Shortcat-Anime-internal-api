.class public final Lcom/revenuecat/purchases/ui/revenuecatui/PaywallKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;",
        "options",
        "LTd/L;",
        "Paywall",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;LY/m;I)V",
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


# direct methods
.method public static final Paywall(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;LY/m;I)V
    .locals 5

    .line 1
    const-string v0, "options"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, 0x168083ff

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0}, LY/m;->g(I)LY/m;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    and-int/lit8 v1, p2, 0x6

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    invoke-interface {p1, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    const/4 v1, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v1, v2

    .line 27
    :goto_0
    or-int/2addr v1, p2

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v1, p2

    .line 30
    :goto_1
    and-int/lit8 v3, v1, 0x3

    .line 31
    .line 32
    if-ne v3, v2, :cond_3

    .line 33
    .line 34
    invoke-interface {p1}, LY/m;->i()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-nez v3, :cond_2

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_2
    invoke-interface {p1}, LY/m;->K()V

    .line 42
    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_3
    :goto_2
    invoke-static {}, LY/w;->L()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_4

    .line 50
    .line 51
    const/4 v3, -0x1

    .line 52
    const-string v4, "com.revenuecat.purchases.ui.revenuecatui.Paywall (Paywall.kt:9)"

    .line 53
    .line 54
    invoke-static {v0, v1, v3, v4}, LY/w;->U(IIILjava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :cond_4
    and-int/lit8 v0, v1, 0xe

    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    invoke-static {p0, v1, p1, v0, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt;->InternalPaywall(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;LY/m;II)V

    .line 61
    .line 62
    .line 63
    invoke-static {}, LY/w;->L()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_5

    .line 68
    .line 69
    invoke-static {}, LY/w;->T()V

    .line 70
    .line 71
    .line 72
    :cond_5
    :goto_3
    invoke-interface {p1}, LY/m;->k()LY/B1;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-eqz p1, :cond_6

    .line 77
    .line 78
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallKt$Paywall$1;

    .line 79
    .line 80
    invoke-direct {v0, p0, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallKt$Paywall$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;I)V

    .line 81
    .line 82
    .line 83
    invoke-interface {p1, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 84
    .line 85
    .line 86
    :cond_6
    return-void
.end method
