.class public final Lcom/revenuecat/purchases/utils/OfferingVideoPredownloaderKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00020\u0001*\u00020\u0005H\u0002\u00a8\u0006\u0006"
    }
    d2 = {
        "checkedUrls",
        "",
        "Lkotlin/Pair;",
        "Ljava/net/URL;",
        "Lcom/revenuecat/purchases/models/Checksum;",
        "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;",
        "purchases_defaultsBc8Release"
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
.method public static final synthetic access$checkedUrls(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/revenuecat/purchases/utils/OfferingVideoPredownloaderKt;->checkedUrls(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final checkedUrls(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;",
            ")",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/net/URL;",
            "Lcom/revenuecat/purchases/models/Checksum;",
            ">;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;->getLight()Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;->getUrl()Ljava/net/URL;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;->getLight()Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;->getChecksum()Lcom/revenuecat/purchases/models/Checksum;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;->getDark()Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const/4 v2, 0x0

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;->getUrl()Ljava/net/URL;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;->getDark()Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3}, Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;->getChecksum()Lcom/revenuecat/purchases/models/Checksum;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-static {v1, v3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move-object v1, v2

    .line 48
    :goto_0
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;->getLight()Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v3}, Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;->getUrlLowRes()Ljava/net/URL;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    if-eqz v3, :cond_1

    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;->getLight()Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v4}, Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;->getChecksumLowRes()Lcom/revenuecat/purchases/models/Checksum;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-static {v3, v4}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    move-object v3, v2

    .line 72
    :goto_1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;->getDark()Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    if-eqz v4, :cond_2

    .line 77
    .line 78
    invoke-virtual {v4}, Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;->getUrlLowRes()Ljava/net/URL;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    if-eqz v4, :cond_2

    .line 83
    .line 84
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;->getDark()Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;->getChecksumLowRes()Lcom/revenuecat/purchases/models/Checksum;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-static {v4, p0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    :cond_2
    filled-new-array {v0, v1, v3, v2}, [Lkotlin/Pair;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-static {p0}, LUd/u;->r([Ljava/lang/Object;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    return-object p0
.end method
