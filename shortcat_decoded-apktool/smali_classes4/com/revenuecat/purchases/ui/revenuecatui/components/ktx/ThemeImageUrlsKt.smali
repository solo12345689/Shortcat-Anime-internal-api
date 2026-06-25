.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/ThemeImageUrlsKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008AX\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;",
        "Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;",
        "getUrlsForCurrentTheme",
        "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;LY/m;I)Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;",
        "urlsForCurrentTheme",
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
.method public static final getUrlsForCurrentTheme(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;LY/m;I)Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LY/w;->L()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, -0x1

    .line 13
    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.components.ktx.<get-urlsForCurrentTheme> (ThemeImageUrls.kt:12)"

    .line 14
    .line 15
    const v2, 0x93c79f0

    .line 16
    .line 17
    .line 18
    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 p2, 0x0

    .line 22
    invoke-static {p1, p2}, Lx/m;->a(LY/m;I)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;->getDark()Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-nez p1, :cond_2

    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;->getLight()Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    :cond_2
    invoke-static {}, LY/w;->L()Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_3

    .line 43
    .line 44
    invoke-static {}, LY/w;->T()V

    .line 45
    .line 46
    .line 47
    :cond_3
    return-object p1
.end method
