.class public final Lcom/revenuecat/purchases/ui/revenuecatui/helpers/WindowHelperKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u000f\u0010\u0007\u001a\u00020\u0006H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u0013\u0010\n\u001a\u00020\u0006*\u00020\tH\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000e\u001a\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u0003H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u0010\u001a\u000f\u0010\u0012\u001a\u00020\u0011H\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a\u001b\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0014H\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lb4/c;",
        "computeWindowWidthSizeClass",
        "(LY/m;I)Lb4/c;",
        "Lb4/a;",
        "computeWindowHeightSizeClass",
        "(LY/m;I)Lb4/a;",
        "",
        "hasCompactDimension",
        "(LY/m;I)Z",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;",
        "shouldUseLandscapeLayout",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;LY/m;I)Z",
        "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;",
        "mode",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;LY/m;I)Z",
        "sizeClass",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;Lb4/a;)Z",
        "Lb4/b;",
        "windowSizeClass",
        "(LY/m;I)Lb4/b;",
        "Lkotlin/Pair;",
        "",
        "getScreenSize",
        "(LY/m;I)Lkotlin/Pair;",
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
.method public static final computeWindowHeightSizeClass(LY/m;I)Lb4/a;
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
    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.helpers.computeWindowHeightSizeClass (WindowHelper.kt:22)"

    .line 9
    .line 10
    const v2, -0x7608736d

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p1, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/WindowHelperKt;->windowSizeClass(LY/m;I)Lb4/b;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Lb4/b;->a()Lb4/a;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {}, LY/w;->L()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-static {}, LY/w;->T()V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-object p0
.end method

.method public static final computeWindowWidthSizeClass(LY/m;I)Lb4/c;
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
    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.helpers.computeWindowWidthSizeClass (WindowHelper.kt:16)"

    .line 9
    .line 10
    const v2, 0xa5665f7

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p1, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/WindowHelperKt;->windowSizeClass(LY/m;I)Lb4/b;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Lb4/b;->b()Lb4/c;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {}, LY/w;->L()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-static {}, LY/w;->T()V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-object p0
.end method

.method private static final getScreenSize(LY/m;I)Lkotlin/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/m;",
            "I)",
            "Lkotlin/Pair<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

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
    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.helpers.getScreenSize (WindowHelper.kt:59)"

    .line 9
    .line 10
    const v2, 0x1760b2fb

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p1, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/HelperFunctionsKt;->getLocalActivity()LY/b1;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-interface {p0, p1}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Landroid/app/Activity;

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-static {p0, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/HelperFunctionsKt;->isInPreviewMode(LY/m;I)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    if-nez p1, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 45
    .line 46
    sget-object v0, Lc4/l;->a:Lc4/l$a;

    .line 47
    .line 48
    invoke-virtual {v0}, Lc4/l$a;->a()Lc4/l;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {v0, p1}, Lc4/l;->b(Landroid/app/Activity;)Lc4/k;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    new-instance v0, Lkotlin/Pair;

    .line 57
    .line 58
    invoke-virtual {p1}, Lc4/k;->a()Landroid/graphics/Rect;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    int-to-float v1, v1

    .line 67
    div-float/2addr v1, p0

    .line 68
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {p1}, Lc4/k;->a()Landroid/graphics/Rect;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    int-to-float p1, p1

    .line 81
    div-float/2addr p1, p0

    .line 82
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-direct {v0, v1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    :goto_0
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f()LY/b1;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-interface {p0, p1}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    check-cast p0, Landroid/content/res/Configuration;

    .line 99
    .line 100
    iget p1, p0, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 101
    .line 102
    int-to-float p1, p1

    .line 103
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    iget p0, p0, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 108
    .line 109
    int-to-float p0, p0

    .line 110
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-static {p1, p0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    :goto_1
    invoke-static {}, LY/w;->L()Z

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    if-eqz p0, :cond_3

    .line 123
    .line 124
    invoke-static {}, LY/w;->T()V

    .line 125
    .line 126
    .line 127
    :cond_3
    return-object v0
.end method

.method public static final hasCompactDimension(LY/m;I)Z
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
    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.helpers.hasCompactDimension (WindowHelper.kt:28)"

    .line 9
    .line 10
    const v2, 0x27d02463

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p1, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/WindowHelperKt;->computeWindowHeightSizeClass(LY/m;I)Lb4/a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, Lb4/a;->c:Lb4/a;

    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/WindowHelperKt;->computeWindowWidthSizeClass(LY/m;I)Lb4/c;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    sget-object v0, Lb4/c;->c:Lb4/c;

    .line 34
    .line 35
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_2

    .line 40
    .line 41
    :cond_1
    const/4 p1, 0x1

    .line 42
    :cond_2
    invoke-static {}, LY/w;->L()Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_3

    .line 47
    .line 48
    invoke-static {}, LY/w;->T()V

    .line 49
    .line 50
    .line 51
    :cond_3
    return p1
.end method

.method private static final shouldUseLandscapeLayout(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;LY/m;I)Z
    .locals 3

    .line 3
    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.helpers.shouldUseLandscapeLayout (WindowHelper.kt:41)"

    const v2, -0x537a512a

    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    :cond_0
    const/4 p2, 0x0

    .line 4
    invoke-static {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/WindowHelperKt;->computeWindowHeightSizeClass(LY/m;I)Lb4/a;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/WindowHelperKt;->shouldUseLandscapeLayout(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;Lb4/a;)Z

    move-result p0

    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LY/w;->T()V

    :cond_1
    return p0
.end method

.method public static final shouldUseLandscapeLayout(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;Lb4/a;)Z
    .locals 1

    const-string v0, "mode"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sizeClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallModeKt;->isFullScreen(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lb4/a;->c:Lb4/a;

    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final shouldUseLandscapeLayout(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;LY/m;I)Z
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.helpers.shouldUseLandscapeLayout (WindowHelper.kt:35)"

    const v2, 0x1830084a

    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;->getTemplateConfiguration()Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration;

    move-result-object p0

    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration;->getMode()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;

    move-result-object p0

    const/4 p2, 0x0

    invoke-static {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/WindowHelperKt;->shouldUseLandscapeLayout(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;LY/m;I)Z

    move-result p0

    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LY/w;->T()V

    :cond_1
    return p0
.end method

.method private static final windowSizeClass(LY/m;I)Lb4/b;
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
    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.helpers.windowSizeClass (WindowHelper.kt:52)"

    .line 9
    .line 10
    const v2, 0x6681c678

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p1, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/WindowHelperKt;->getScreenSize(LY/m;I)Lkotlin/Pair;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Ljava/lang/Number;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-virtual {p0}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    sget-object v0, Lb4/b;->c:Lb4/b$a;

    .line 42
    .line 43
    invoke-virtual {v0, p1, p0}, Lb4/b$a;->a(FF)Lb4/b;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {}, LY/w;->L()Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    invoke-static {}, LY/w;->T()V

    .line 54
    .line 55
    .line 56
    :cond_1
    return-object p0
.end method
