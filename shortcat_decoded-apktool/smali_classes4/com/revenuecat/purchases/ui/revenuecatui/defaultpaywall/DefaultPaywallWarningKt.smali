.class public final Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallWarningKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a,\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;",
        "warning",
        "Ls0/r0;",
        "warningColor",
        "Landroidx/compose/ui/e;",
        "modifier",
        "LTd/L;",
        "DefaultPaywallWarning-3IgeMak",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;JLandroidx/compose/ui/e;LY/m;II)V",
        "DefaultPaywallWarning",
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
.method public static final DefaultPaywallWarning-3IgeMak(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;JLandroidx/compose/ui/e;LY/m;II)V
    .locals 8

    .line 1
    const-string v0, "warning"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, -0x70dc81f2

    .line 7
    .line 8
    .line 9
    invoke-interface {p4, v0}, LY/m;->g(I)LY/m;

    .line 10
    .line 11
    .line 12
    move-result-object p4

    .line 13
    and-int/lit8 v1, p5, 0x1

    .line 14
    .line 15
    if-nez v1, :cond_2

    .line 16
    .line 17
    invoke-interface {p4}, LY/m;->i()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    invoke-interface {p4}, LY/m;->K()V

    .line 25
    .line 26
    .line 27
    :cond_1
    :goto_0
    move-object v5, p3

    .line 28
    goto :goto_2

    .line 29
    :cond_2
    :goto_1
    and-int/lit8 v1, p6, 0x4

    .line 30
    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    sget-object p3, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 34
    .line 35
    :cond_3
    invoke-static {}, LY/w;->L()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_4

    .line 40
    .line 41
    const/4 v1, -0x1

    .line 42
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallWarning (DefaultPaywallWarning.kt:13)"

    .line 43
    .line 44
    invoke-static {v0, p5, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_4
    invoke-static {}, LY/w;->L()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    invoke-static {}, LY/w;->T()V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :goto_2
    invoke-interface {p4}, LY/m;->k()LY/B1;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    if-eqz p3, :cond_5

    .line 62
    .line 63
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallWarningKt$DefaultPaywallWarning$1;

    .line 64
    .line 65
    move-object v2, p0

    .line 66
    move-wide v3, p1

    .line 67
    move v6, p5

    .line 68
    move v7, p6

    .line 69
    invoke-direct/range {v1 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallWarningKt$DefaultPaywallWarning$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;JLandroidx/compose/ui/e;II)V

    .line 70
    .line 71
    .line 72
    invoke-interface {p3, v1}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 73
    .line 74
    .line 75
    :cond_5
    return-void
.end method
