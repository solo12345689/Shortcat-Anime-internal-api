.class public final Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyleKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a9\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u0005*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\u0006H\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a\'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001e\u001a\u000f\u0010 \u001a\u00020\u001fH\u0003\u00a2\u0006\u0004\u0008 \u0010!\u001a\u000f\u0010\"\u001a\u00020\u001fH\u0003\u00a2\u0006\u0004\u0008\"\u0010!\u001a\u000f\u0010#\u001a\u00020\u001fH\u0003\u00a2\u0006\u0004\u0008#\u0010!\u00a8\u0006$\u00b2\u0006\u000e\u0010\u001b\u001a\u00020\u001a8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lcom/revenuecat/purchases/paywalls/components/common/Background;",
        "",
        "Lcom/revenuecat/purchases/ColorAlias;",
        "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;",
        "aliases",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;",
        "toBackgroundStyles",
        "(Lcom/revenuecat/purchases/paywalls/components/common/Background;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;",
        "background",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;",
        "rememberBackgroundStyle",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;",
        "Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;",
        "imageUrls",
        "LI0/f;",
        "contentScale",
        "Lcoil/compose/AsyncImagePainter;",
        "rememberAsyncImagePainter",
        "(Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;LI0/f;LY/m;I)Lcoil/compose/AsyncImagePainter;",
        "Landroid/content/Context;",
        "context",
        "",
        "url",
        "LG4/b;",
        "cachePolicy",
        "LG4/h;",
        "getImageRequest",
        "(Landroid/content/Context;Ljava/lang/String;LG4/b;)LG4/h;",
        "LTd/L;",
        "Background_Preview_ColorHex",
        "(LY/m;I)V",
        "Background_Preview_ColorGradientLinear",
        "Background_Preview_ColorGradientRadial",
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
.method private static final Background_Preview_ColorGradientLinear(LY/m;I)V
    .locals 8

    .line 1
    const v0, 0x5e9bf085

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-interface {p0}, LY/m;->i()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {p0}, LY/m;->K()V

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    const/4 v1, -0x1

    .line 28
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.components.properties.Background_Preview_ColorGradientLinear (BackgroundStyle.kt:232)"

    .line 29
    .line 30
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 34
    .line 35
    const/16 v1, 0x64

    .line 36
    .line 37
    int-to-float v1, v1

    .line 38
    invoke-static {v1}, Li1/h;->n(F)F

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/s;->m(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    new-instance v1, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Linear;

    .line 47
    .line 48
    new-instance v2, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;

    .line 49
    .line 50
    sget-object v3, Ls0/r0;->b:Ls0/r0$a;

    .line 51
    .line 52
    invoke-virtual {v3}, Ls0/r0$a;->h()J

    .line 53
    .line 54
    .line 55
    move-result-wide v4

    .line 56
    invoke-static {v4, v5}, Ls0/s0;->k(J)I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    const/4 v5, 0x0

    .line 61
    invoke-direct {v2, v4, v5}, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;-><init>(IF)V

    .line 62
    .line 63
    .line 64
    new-instance v4, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;

    .line 65
    .line 66
    invoke-virtual {v3}, Ls0/r0$a;->f()J

    .line 67
    .line 68
    .line 69
    move-result-wide v5

    .line 70
    invoke-static {v5, v6}, Ls0/s0;->k(J)I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    const/high16 v6, 0x42480000    # 50.0f

    .line 75
    .line 76
    invoke-direct {v4, v5, v6}, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;-><init>(IF)V

    .line 77
    .line 78
    .line 79
    new-instance v5, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;

    .line 80
    .line 81
    invoke-virtual {v3}, Ls0/r0$a;->b()J

    .line 82
    .line 83
    .line 84
    move-result-wide v6

    .line 85
    invoke-static {v6, v7}, Ls0/s0;->k(J)I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    const/high16 v6, 0x42c80000    # 100.0f

    .line 90
    .line 91
    invoke-direct {v5, v3, v6}, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;-><init>(IF)V

    .line 92
    .line 93
    .line 94
    filled-new-array {v2, v4, v5}, [Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-static {v2}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    const/high16 v3, 0x42b40000    # 90.0f

    .line 103
    .line 104
    invoke-direct {v1, v3, v2}, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Linear;-><init>(FLjava/util/List;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->toColorStyle(Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Color;->constructor-impl(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Color;->box-impl(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Color;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    const/4 v2, 0x2

    .line 120
    const/4 v3, 0x0

    .line 121
    invoke-static {v0, v1, v3, v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BackgroundKt;->background$default(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;Ls0/E1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    const/4 v1, 0x0

    .line 126
    invoke-static {v0, p0, v1}, Landroidx/compose/foundation/layout/f;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 127
    .line 128
    .line 129
    invoke-static {}, LY/w;->L()Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_3

    .line 134
    .line 135
    invoke-static {}, LY/w;->T()V

    .line 136
    .line 137
    .line 138
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    if-eqz p0, :cond_4

    .line 143
    .line 144
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyleKt$Background_Preview_ColorGradientLinear$1;

    .line 145
    .line 146
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyleKt$Background_Preview_ColorGradientLinear$1;-><init>(I)V

    .line 147
    .line 148
    .line 149
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 150
    .line 151
    .line 152
    :cond_4
    return-void
.end method

.method private static final Background_Preview_ColorGradientRadial(LY/m;I)V
    .locals 8

    .line 1
    const v0, 0x6cb7accb

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-interface {p0}, LY/m;->i()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {p0}, LY/m;->K()V

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    const/4 v1, -0x1

    .line 28
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.components.properties.Background_Preview_ColorGradientRadial (BackgroundStyle.kt:262)"

    .line 29
    .line 30
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 34
    .line 35
    const/16 v1, 0x64

    .line 36
    .line 37
    int-to-float v1, v1

    .line 38
    invoke-static {v1}, Li1/h;->n(F)F

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/s;->m(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    new-instance v1, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Radial;

    .line 47
    .line 48
    new-instance v2, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;

    .line 49
    .line 50
    sget-object v3, Ls0/r0;->b:Ls0/r0$a;

    .line 51
    .line 52
    invoke-virtual {v3}, Ls0/r0$a;->h()J

    .line 53
    .line 54
    .line 55
    move-result-wide v4

    .line 56
    invoke-static {v4, v5}, Ls0/s0;->k(J)I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    const/4 v5, 0x0

    .line 61
    invoke-direct {v2, v4, v5}, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;-><init>(IF)V

    .line 62
    .line 63
    .line 64
    new-instance v4, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;

    .line 65
    .line 66
    invoke-virtual {v3}, Ls0/r0$a;->f()J

    .line 67
    .line 68
    .line 69
    move-result-wide v5

    .line 70
    invoke-static {v5, v6}, Ls0/s0;->k(J)I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    const/high16 v6, 0x42480000    # 50.0f

    .line 75
    .line 76
    invoke-direct {v4, v5, v6}, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;-><init>(IF)V

    .line 77
    .line 78
    .line 79
    new-instance v5, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;

    .line 80
    .line 81
    invoke-virtual {v3}, Ls0/r0$a;->b()J

    .line 82
    .line 83
    .line 84
    move-result-wide v6

    .line 85
    invoke-static {v6, v7}, Ls0/s0;->k(J)I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    const/high16 v6, 0x42c80000    # 100.0f

    .line 90
    .line 91
    invoke-direct {v5, v3, v6}, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;-><init>(IF)V

    .line 92
    .line 93
    .line 94
    filled-new-array {v2, v4, v5}, [Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-static {v2}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-direct {v1, v2}, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Radial;-><init>(Ljava/util/List;)V

    .line 103
    .line 104
    .line 105
    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->toColorStyle(Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Color;->constructor-impl(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Color;->box-impl(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Color;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    const/4 v2, 0x2

    .line 118
    const/4 v3, 0x0

    .line 119
    invoke-static {v0, v1, v3, v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BackgroundKt;->background$default(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;Ls0/E1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    const/4 v1, 0x0

    .line 124
    invoke-static {v0, p0, v1}, Landroidx/compose/foundation/layout/f;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 125
    .line 126
    .line 127
    invoke-static {}, LY/w;->L()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_3

    .line 132
    .line 133
    invoke-static {}, LY/w;->T()V

    .line 134
    .line 135
    .line 136
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    if-eqz p0, :cond_4

    .line 141
    .line 142
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyleKt$Background_Preview_ColorGradientRadial$1;

    .line 143
    .line 144
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyleKt$Background_Preview_ColorGradientRadial$1;-><init>(I)V

    .line 145
    .line 146
    .line 147
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 148
    .line 149
    .line 150
    :cond_4
    return-void
.end method

.method private static final Background_Preview_ColorHex(LY/m;I)V
    .locals 4

    .line 1
    const v0, 0x1f903211

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-interface {p0}, LY/m;->i()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {p0}, LY/m;->K()V

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    const/4 v1, -0x1

    .line 28
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.components.properties.Background_Preview_ColorHex (BackgroundStyle.kt:222)"

    .line 29
    .line 30
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 34
    .line 35
    const/16 v1, 0x64

    .line 36
    .line 37
    int-to-float v1, v1

    .line 38
    invoke-static {v1}, Li1/h;->n(F)F

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/s;->m(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sget-object v1, Ls0/r0;->b:Ls0/r0$a;

    .line 47
    .line 48
    invoke-virtual {v1}, Ls0/r0$a;->h()J

    .line 49
    .line 50
    .line 51
    move-result-wide v1

    .line 52
    invoke-static {v1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->constructor-impl(J)J

    .line 53
    .line 54
    .line 55
    move-result-wide v1

    .line 56
    invoke-static {v1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->box-impl(J)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Color;->constructor-impl(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Color;->box-impl(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Color;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    const/4 v2, 0x2

    .line 69
    const/4 v3, 0x0

    .line 70
    invoke-static {v0, v1, v3, v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BackgroundKt;->background$default(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;Ls0/E1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    const/4 v1, 0x0

    .line 75
    invoke-static {v0, p0, v1}, Landroidx/compose/foundation/layout/f;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 76
    .line 77
    .line 78
    invoke-static {}, LY/w;->L()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    invoke-static {}, LY/w;->T()V

    .line 85
    .line 86
    .line 87
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    if-eqz p0, :cond_4

    .line 92
    .line 93
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyleKt$Background_Preview_ColorHex$1;

    .line 94
    .line 95
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyleKt$Background_Preview_ColorHex$1;-><init>(I)V

    .line 96
    .line 97
    .line 98
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 99
    .line 100
    .line 101
    :cond_4
    return-void
.end method

.method public static final synthetic access$Background_Preview_ColorGradientLinear(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyleKt;->Background_Preview_ColorGradientLinear(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$Background_Preview_ColorGradientRadial(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyleKt;->Background_Preview_ColorGradientRadial(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$Background_Preview_ColorHex(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyleKt;->Background_Preview_ColorHex(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$rememberAsyncImagePainter$lambda$8(LY/C0;LG4/b;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyleKt;->rememberAsyncImagePainter$lambda$8(LY/C0;LG4/b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final getImageRequest(Landroid/content/Context;Ljava/lang/String;LG4/b;)LG4/h;
    .locals 1

    .line 1
    new-instance v0, LG4/h$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LG4/h$a;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, LG4/h$a;->c(Ljava/lang/Object;)LG4/h$a;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0, p2}, LG4/h$a;->e(LG4/b;)LG4/h$a;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0, p2}, LG4/h$a;->f(LG4/b;)LG4/h$a;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, LG4/h$a;->a()LG4/h;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method private static final rememberAsyncImagePainter(Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;LI0/f;LY/m;I)Lcoil/compose/AsyncImagePainter;
    .locals 18

    .line 1
    move-object/from16 v10, p2

    .line 2
    .line 3
    move/from16 v13, p3

    .line 4
    .line 5
    const v0, 0x24d84c70

    .line 6
    .line 7
    .line 8
    invoke-interface {v10, v0}, LY/m;->V(I)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, LY/w;->L()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const/4 v1, -0x1

    .line 18
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.components.properties.rememberAsyncImagePainter (BackgroundStyle.kt:178)"

    .line 19
    .line 20
    invoke-static {v0, v13, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    const v0, 0x2d194ac3

    .line 24
    .line 25
    .line 26
    invoke-interface {v10, v0}, LY/m;->V(I)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v10}, LY/m;->D()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sget-object v14, LY/m;->a:LY/m$a;

    .line 34
    .line 35
    invoke-virtual {v14}, LY/m$a;->a()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const/4 v2, 0x0

    .line 40
    if-ne v0, v1, :cond_1

    .line 41
    .line 42
    sget-object v0, LG4/b;->c:LG4/b;

    .line 43
    .line 44
    const/4 v1, 0x2

    .line 45
    invoke-static {v0, v2, v1, v2}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-interface {v10, v0}, LY/m;->u(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    move-object v15, v0

    .line 53
    check-cast v15, LY/C0;

    .line 54
    .line 55
    invoke-interface {v10}, LY/m;->O()V

    .line 56
    .line 57
    .line 58
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->g()LY/b1;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-interface {v10, v0}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Landroid/content/Context;

    .line 67
    .line 68
    invoke-static {}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ImagePreviewsKt;->getLocalPreviewImageLoader()LY/b1;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-interface {v10, v1}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, Lv4/d;

    .line 77
    .line 78
    const/4 v3, 0x0

    .line 79
    invoke-static {v10, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/HelperFunctionsKt;->isInPreviewMode(LY/m;I)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-eqz v3, :cond_2

    .line 84
    .line 85
    move-object v2, v1

    .line 86
    :cond_2
    const v4, 0x2d1965ff

    .line 87
    .line 88
    .line 89
    invoke-interface {v10, v4}, LY/m;->V(I)V

    .line 90
    .line 91
    .line 92
    if-nez v2, :cond_5

    .line 93
    .line 94
    const v2, 0x2d196bee

    .line 95
    .line 96
    .line 97
    invoke-interface {v10, v2}, LY/m;->V(I)V

    .line 98
    .line 99
    .line 100
    invoke-interface {v10, v0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    invoke-interface {v10}, LY/m;->D()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    if-nez v2, :cond_3

    .line 109
    .line 110
    invoke-virtual {v14}, LY/m$a;->a()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    if-ne v4, v2, :cond_4

    .line 115
    .line 116
    :cond_3
    sget-object v2, Lcom/revenuecat/purchases/Purchases;->Companion:Lcom/revenuecat/purchases/Purchases$Companion;

    .line 117
    .line 118
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    const-string v5, "context.applicationContext"

    .line 123
    .line 124
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-static {v2, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/PurchasesExtensionsKt;->getImageLoaderTyped(Lcom/revenuecat/purchases/Purchases$Companion;Landroid/content/Context;)Lv4/d;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    invoke-interface {v10, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    :cond_4
    move-object v2, v4

    .line 135
    check-cast v2, Lv4/d;

    .line 136
    .line 137
    invoke-interface {v10}, LY/m;->O()V

    .line 138
    .line 139
    .line 140
    :cond_5
    invoke-interface {v10}, LY/m;->O()V

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;->getWebp()Ljava/net/URL;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-static {v15}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyleKt;->rememberAsyncImagePainter$lambda$7(LY/C0;)LG4/b;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    const v6, 0x2d197a72

    .line 152
    .line 153
    .line 154
    invoke-interface {v10, v6}, LY/m;->V(I)V

    .line 155
    .line 156
    .line 157
    invoke-interface {v10, v0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v6

    .line 161
    invoke-interface {v10, v4}, LY/m;->U(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    or-int/2addr v4, v6

    .line 166
    invoke-interface {v10, v5}, LY/m;->U(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    or-int/2addr v4, v5

    .line 171
    invoke-interface {v10}, LY/m;->D()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    if-nez v4, :cond_6

    .line 176
    .line 177
    invoke-virtual {v14}, LY/m$a;->a()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    if-ne v5, v4, :cond_7

    .line 182
    .line 183
    :cond_6
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;->getWebp()Ljava/net/URL;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    invoke-virtual {v4}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    const-string v5, "imageUrls.webp.toString()"

    .line 192
    .line 193
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-static {v15}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyleKt;->rememberAsyncImagePainter$lambda$7(LY/C0;)LG4/b;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    invoke-static {v0, v4, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyleKt;->getImageRequest(Landroid/content/Context;Ljava/lang/String;LG4/b;)LG4/h;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    invoke-interface {v10, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    :cond_7
    move-object v4, v5

    .line 208
    check-cast v4, LG4/h;

    .line 209
    .line 210
    invoke-interface {v10}, LY/m;->O()V

    .line 211
    .line 212
    .line 213
    const v5, 0x2d199b52

    .line 214
    .line 215
    .line 216
    invoke-interface {v10, v5}, LY/m;->V(I)V

    .line 217
    .line 218
    .line 219
    const/high16 v16, 0xe000000

    .line 220
    .line 221
    if-eqz v3, :cond_8

    .line 222
    .line 223
    if-eqz v1, :cond_8

    .line 224
    .line 225
    invoke-static {v2, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ImagePreviewsKt;->getPreviewPlaceholderBlocking(Lv4/d;LG4/h;)Lw0/b;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    move-object v1, v2

    .line 230
    move-object/from16 v17, v4

    .line 231
    .line 232
    :goto_0
    move-object v2, v0

    .line 233
    goto :goto_1

    .line 234
    :cond_8
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;->getWebpLowRes()Ljava/net/URL;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    invoke-virtual {v1}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    const-string v3, "imageUrls.webpLowRes.toString()"

    .line 243
    .line 244
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    invoke-static {v15}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyleKt;->rememberAsyncImagePainter$lambda$7(LY/C0;)LG4/b;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    invoke-static {v0, v1, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyleKt;->getImageRequest(Landroid/content/Context;Ljava/lang/String;LG4/b;)LG4/h;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    shl-int/lit8 v1, v13, 0x15

    .line 256
    .line 257
    and-int v1, v1, v16

    .line 258
    .line 259
    or-int/lit16 v11, v1, 0x6c00

    .line 260
    .line 261
    const/16 v12, 0x2e4

    .line 262
    .line 263
    move-object v1, v2

    .line 264
    const/4 v2, 0x0

    .line 265
    const/4 v3, 0x0

    .line 266
    move-object v5, v4

    .line 267
    const/4 v4, 0x0

    .line 268
    move-object v6, v5

    .line 269
    const/4 v5, 0x0

    .line 270
    move-object v7, v6

    .line 271
    const/4 v6, 0x0

    .line 272
    move-object v8, v7

    .line 273
    const/4 v7, 0x0

    .line 274
    const/4 v9, 0x0

    .line 275
    move-object/from16 v17, v8

    .line 276
    .line 277
    move-object/from16 v8, p1

    .line 278
    .line 279
    invoke-static/range {v0 .. v12}, Lcoil/compose/b;->d(Ljava/lang/Object;Lv4/d;Lw0/b;Lw0/b;Lw0/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LI0/f;ILY/m;II)Lcoil/compose/AsyncImagePainter;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    goto :goto_0

    .line 284
    :goto_1
    invoke-interface {v10}, LY/m;->O()V

    .line 285
    .line 286
    .line 287
    const v0, 0x2d19da68

    .line 288
    .line 289
    .line 290
    invoke-interface {v10, v0}, LY/m;->V(I)V

    .line 291
    .line 292
    .line 293
    invoke-interface {v10}, LY/m;->D()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-virtual {v14}, LY/m$a;->a()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    if-ne v0, v3, :cond_9

    .line 302
    .line 303
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyleKt$rememberAsyncImagePainter$1$1;

    .line 304
    .line 305
    invoke-direct {v0, v15}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyleKt$rememberAsyncImagePainter$1$1;-><init>(LY/C0;)V

    .line 306
    .line 307
    .line 308
    invoke-interface {v10, v0}, LY/m;->u(Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    :cond_9
    move-object v7, v0

    .line 312
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 313
    .line 314
    invoke-interface {v10}, LY/m;->O()V

    .line 315
    .line 316
    .line 317
    shl-int/lit8 v0, v13, 0x15

    .line 318
    .line 319
    and-int v0, v0, v16

    .line 320
    .line 321
    const v3, 0xc06c00

    .line 322
    .line 323
    .line 324
    or-int v11, v0, v3

    .line 325
    .line 326
    const/16 v12, 0x260

    .line 327
    .line 328
    const/4 v3, 0x0

    .line 329
    const/4 v4, 0x0

    .line 330
    const/4 v5, 0x0

    .line 331
    const/4 v6, 0x0

    .line 332
    const/4 v9, 0x0

    .line 333
    move-object/from16 v8, p1

    .line 334
    .line 335
    move-object/from16 v0, v17

    .line 336
    .line 337
    invoke-static/range {v0 .. v12}, Lcoil/compose/b;->d(Ljava/lang/Object;Lv4/d;Lw0/b;Lw0/b;Lw0/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LI0/f;ILY/m;II)Lcoil/compose/AsyncImagePainter;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    invoke-static {}, LY/w;->L()Z

    .line 342
    .line 343
    .line 344
    move-result v1

    .line 345
    if-eqz v1, :cond_a

    .line 346
    .line 347
    invoke-static {}, LY/w;->T()V

    .line 348
    .line 349
    .line 350
    :cond_a
    invoke-interface/range {p2 .. p2}, LY/m;->O()V

    .line 351
    .line 352
    .line 353
    return-object v0
.end method

.method private static final rememberAsyncImagePainter$lambda$7(LY/C0;)LG4/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/C0;",
            ")",
            "LG4/b;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, LG4/b;

    .line 6
    .line 7
    return-object p0
.end method

.method private static final rememberAsyncImagePainter$lambda$8(LY/C0;LG4/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/C0;",
            "LG4/b;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-interface {p0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic rememberBackgroundStyle(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;
    .locals 8

    .line 1
    const-string v0, "background"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, 0x3cbdcbbe

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0}, LY/m;->V(I)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, LY/w;->L()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const/4 v1, -0x1

    .line 19
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.components.properties.rememberBackgroundStyle (BackgroundStyle.kt:143)"

    .line 20
    .line 21
    invoke-static {v0, p2, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    instance-of v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Color;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    const/4 v2, 0x4

    .line 28
    const/4 v3, 0x0

    .line 29
    if-eqz v0, :cond_6

    .line 30
    .line 31
    const v0, -0x5ecbde19

    .line 32
    .line 33
    .line 34
    invoke-interface {p1, v0}, LY/m;->V(I)V

    .line 35
    .line 36
    .line 37
    move-object v0, p0

    .line 38
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Color;

    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Color;->unbox-impl()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0, p1, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->getForCurrentTheme(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const v4, 0x2e7d960a

    .line 49
    .line 50
    .line 51
    invoke-interface {p1, v4}, LY/m;->V(I)V

    .line 52
    .line 53
    .line 54
    and-int/lit8 v4, p2, 0xe

    .line 55
    .line 56
    xor-int/lit8 v4, v4, 0x6

    .line 57
    .line 58
    if-le v4, v2, :cond_1

    .line 59
    .line 60
    invoke-interface {p1, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-nez p0, :cond_3

    .line 65
    .line 66
    :cond_1
    and-int/lit8 p0, p2, 0x6

    .line 67
    .line 68
    if-ne p0, v2, :cond_2

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    move v1, v3

    .line 72
    :cond_3
    :goto_0
    invoke-interface {p1, v0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    or-int/2addr p0, v1

    .line 77
    invoke-interface {p1}, LY/m;->D()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    if-nez p0, :cond_4

    .line 82
    .line 83
    sget-object p0, LY/m;->a:LY/m$a;

    .line 84
    .line 85
    invoke-virtual {p0}, LY/m$a;->a()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    if-ne p2, p0, :cond_5

    .line 90
    .line 91
    :cond_4
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Color;->constructor-impl(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Color;->box-impl(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Color;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    invoke-interface {p1, p2}, LY/m;->u(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :cond_5
    check-cast p2, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Color;

    .line 103
    .line 104
    invoke-virtual {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Color;->unbox-impl()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-interface {p1}, LY/m;->O()V

    .line 109
    .line 110
    .line 111
    invoke-interface {p1}, LY/m;->O()V

    .line 112
    .line 113
    .line 114
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Color;->box-impl(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Color;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    goto/16 :goto_3

    .line 119
    .line 120
    :cond_6
    instance-of v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Image;

    .line 121
    .line 122
    if-eqz v0, :cond_a

    .line 123
    .line 124
    const p2, -0x5ec87541

    .line 125
    .line 126
    .line 127
    invoke-interface {p1, p2}, LY/m;->V(I)V

    .line 128
    .line 129
    .line 130
    check-cast p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Image;

    .line 131
    .line 132
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Image;->getColorOverlay()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    const v0, 0x2e7daef9

    .line 137
    .line 138
    .line 139
    invoke-interface {p1, v0}, LY/m;->V(I)V

    .line 140
    .line 141
    .line 142
    if-nez p2, :cond_7

    .line 143
    .line 144
    const/4 p2, 0x0

    .line 145
    goto :goto_1

    .line 146
    :cond_7
    invoke-static {p2, p1, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->getForCurrentTheme(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    :goto_1
    invoke-interface {p1}, LY/m;->O()V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Image;->getSources()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-static {v0, p1, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/ThemeImageUrlsKt;->getUrlsForCurrentTheme(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;LY/m;I)Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Image;->getContentScale()LI0/f;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-static {v0, v1, p1, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyleKt;->rememberAsyncImagePainter(Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;LI0/f;LY/m;I)Lcoil/compose/AsyncImagePainter;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    const v2, 0x2e7dc60e

    .line 170
    .line 171
    .line 172
    invoke-interface {p1, v2}, LY/m;->V(I)V

    .line 173
    .line 174
    .line 175
    invoke-interface {p1, p2}, LY/m;->U(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    invoke-interface {p1, v0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    or-int/2addr v0, v2

    .line 184
    invoke-interface {p1, v1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    or-int/2addr v0, v2

    .line 189
    invoke-interface {p1}, LY/m;->D()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    if-nez v0, :cond_8

    .line 194
    .line 195
    sget-object v0, LY/m;->a:LY/m$a;

    .line 196
    .line 197
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    if-ne v2, v0, :cond_9

    .line 202
    .line 203
    :cond_8
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Image;

    .line 204
    .line 205
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Image;->getContentScale()LI0/f;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    invoke-direct {v2, v1, p0, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Image;-><init>(Lw0/b;LI0/f;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;)V

    .line 210
    .line 211
    .line 212
    invoke-interface {p1, v2}, LY/m;->u(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    :cond_9
    move-object p0, v2

    .line 216
    check-cast p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Image;

    .line 217
    .line 218
    invoke-interface {p1}, LY/m;->O()V

    .line 219
    .line 220
    .line 221
    invoke-interface {p1}, LY/m;->O()V

    .line 222
    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_a
    instance-of v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Video;

    .line 226
    .line 227
    if-eqz v0, :cond_11

    .line 228
    .line 229
    const v0, -0x5ec04427

    .line 230
    .line 231
    .line 232
    invoke-interface {p1, v0}, LY/m;->V(I)V

    .line 233
    .line 234
    .line 235
    const v0, 0x2e7deef1

    .line 236
    .line 237
    .line 238
    invoke-interface {p1, v0}, LY/m;->V(I)V

    .line 239
    .line 240
    .line 241
    and-int/lit8 v0, p2, 0xe

    .line 242
    .line 243
    xor-int/lit8 v0, v0, 0x6

    .line 244
    .line 245
    if-le v0, v2, :cond_b

    .line 246
    .line 247
    invoke-interface {p1, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    if-nez v0, :cond_d

    .line 252
    .line 253
    :cond_b
    and-int/lit8 p2, p2, 0x6

    .line 254
    .line 255
    if-ne p2, v2, :cond_c

    .line 256
    .line 257
    goto :goto_2

    .line 258
    :cond_c
    move v1, v3

    .line 259
    :cond_d
    :goto_2
    invoke-interface {p1}, LY/m;->D()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object p2

    .line 263
    if-nez v1, :cond_e

    .line 264
    .line 265
    sget-object v0, LY/m;->a:LY/m$a;

    .line 266
    .line 267
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    if-ne p2, v0, :cond_f

    .line 272
    .line 273
    :cond_e
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Video;

    .line 274
    .line 275
    check-cast p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Video;

    .line 276
    .line 277
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Video;->getSources()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Video;->getFallbackImage()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Video;->getLoop()Z

    .line 286
    .line 287
    .line 288
    move-result v4

    .line 289
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Video;->getMuteAudio()Z

    .line 290
    .line 291
    .line 292
    move-result v5

    .line 293
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Video;->getContentScale()LI0/f;

    .line 294
    .line 295
    .line 296
    move-result-object v6

    .line 297
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Video;->getColorOverlay()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 298
    .line 299
    .line 300
    move-result-object v7

    .line 301
    invoke-direct/range {v1 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Video;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;ZZLI0/f;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;)V

    .line 302
    .line 303
    .line 304
    invoke-interface {p1, v1}, LY/m;->u(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    move-object p2, v1

    .line 308
    :cond_f
    move-object p0, p2

    .line 309
    check-cast p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Video;

    .line 310
    .line 311
    invoke-interface {p1}, LY/m;->O()V

    .line 312
    .line 313
    .line 314
    invoke-interface {p1}, LY/m;->O()V

    .line 315
    .line 316
    .line 317
    :goto_3
    invoke-static {}, LY/w;->L()Z

    .line 318
    .line 319
    .line 320
    move-result p2

    .line 321
    if-eqz p2, :cond_10

    .line 322
    .line 323
    invoke-static {}, LY/w;->T()V

    .line 324
    .line 325
    .line 326
    :cond_10
    invoke-interface {p1}, LY/m;->O()V

    .line 327
    .line 328
    .line 329
    return-object p0

    .line 330
    :cond_11
    const p0, 0x2e7aaaca

    .line 331
    .line 332
    .line 333
    invoke-interface {p1, p0}, LY/m;->V(I)V

    .line 334
    .line 335
    .line 336
    invoke-interface {p1}, LY/m;->O()V

    .line 337
    .line 338
    .line 339
    new-instance p0, LTd/r;

    .line 340
    .line 341
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 342
    .line 343
    .line 344
    throw p0
.end method

.method public static final synthetic toBackgroundStyles(Lcom/revenuecat/purchases/paywalls/components/common/Background;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;
    .locals 7

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "aliases"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    instance-of v0, p0, Lcom/revenuecat/purchases/paywalls/components/common/Background$Color;

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    check-cast p0, Lcom/revenuecat/purchases/paywalls/components/common/Background$Color;

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/common/Background$Color;->getValue()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->toColorStyles(Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    instance-of p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 26
    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    check-cast p0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 36
    .line 37
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Color;->constructor-impl(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Color;->box-impl(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Color;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    new-instance p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 46
    .line 47
    invoke-direct {p1, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;-><init>(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :cond_0
    instance-of p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Error;

    .line 52
    .line 53
    if-eqz p1, :cond_1

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_1
    new-instance p0, LTd/r;

    .line 57
    .line 58
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 59
    .line 60
    .line 61
    throw p0

    .line 62
    :cond_2
    instance-of v0, p0, Lcom/revenuecat/purchases/paywalls/components/common/Background$Image;

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    if-eqz v0, :cond_6

    .line 66
    .line 67
    check-cast p0, Lcom/revenuecat/purchases/paywalls/components/common/Background$Image;

    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/common/Background$Image;->getColorOverlay()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    invoke-static {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->toColorStyles(Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    :cond_3
    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResultKt;->orSuccessfullyNull(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    instance-of v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 84
    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 88
    .line 89
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 94
    .line 95
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Image;

    .line 96
    .line 97
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/common/Background$Image;->getValue()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/common/Background$Image;->getFitMode()Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/FitModeKt;->toContentScale(Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;)LI0/f;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-direct {v0, v1, p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Image;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;LI0/f;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;)V

    .line 110
    .line 111
    .line 112
    new-instance p0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 113
    .line 114
    invoke-direct {p0, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;-><init>(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    return-object p0

    .line 118
    :cond_4
    instance-of p0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Error;

    .line 119
    .line 120
    if-eqz p0, :cond_5

    .line 121
    .line 122
    return-object p1

    .line 123
    :cond_5
    new-instance p0, LTd/r;

    .line 124
    .line 125
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 126
    .line 127
    .line 128
    throw p0

    .line 129
    :cond_6
    instance-of v0, p0, Lcom/revenuecat/purchases/paywalls/components/common/Background$Video;

    .line 130
    .line 131
    if-eqz v0, :cond_a

    .line 132
    .line 133
    check-cast p0, Lcom/revenuecat/purchases/paywalls/components/common/Background$Video;

    .line 134
    .line 135
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/common/Background$Video;->getColorOverlay()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    if-eqz v0, :cond_7

    .line 140
    .line 141
    invoke-static {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->toColorStyles(Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    :cond_7
    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResultKt;->orSuccessfullyNull(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    instance-of v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 150
    .line 151
    if-eqz v0, :cond_8

    .line 152
    .line 153
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 154
    .line 155
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;->getValue()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    move-object v6, p1

    .line 160
    check-cast v6, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 161
    .line 162
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Video;

    .line 163
    .line 164
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/common/Background$Video;->getValue()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/common/Background$Video;->getFallbackImage()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/common/Background$Video;->getLoop()Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/common/Background$Video;->getMuteAudio()Z

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/common/Background$Video;->getFitMode()Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/FitModeKt;->toContentScale(Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;)LI0/f;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    invoke-direct/range {v0 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Video;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;ZZLI0/f;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;)V

    .line 189
    .line 190
    .line 191
    new-instance p0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 192
    .line 193
    invoke-direct {p0, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;-><init>(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    return-object p0

    .line 197
    :cond_8
    instance-of p0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Error;

    .line 198
    .line 199
    if-eqz p0, :cond_9

    .line 200
    .line 201
    return-object p1

    .line 202
    :cond_9
    new-instance p0, LTd/r;

    .line 203
    .line 204
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 205
    .line 206
    .line 207
    throw p0

    .line 208
    :cond_a
    instance-of p1, p0, Lcom/revenuecat/purchases/paywalls/components/common/Background$Unknown;

    .line 209
    .line 210
    if-eqz p1, :cond_b

    .line 211
    .line 212
    new-instance p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Error;

    .line 213
    .line 214
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$UnsupportedBackgroundType;

    .line 215
    .line 216
    check-cast p0, Lcom/revenuecat/purchases/paywalls/components/common/Background$Unknown;

    .line 217
    .line 218
    invoke-direct {v0, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$UnsupportedBackgroundType;-><init>(Lcom/revenuecat/purchases/paywalls/components/common/Background$Unknown;)V

    .line 219
    .line 220
    .line 221
    const/4 p0, 0x0

    .line 222
    new-array p0, p0, [Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$UnsupportedBackgroundType;

    .line 223
    .line 224
    invoke-static {v0, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyListKt;->nonEmptyListOf(Ljava/lang/Object;[Ljava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    invoke-direct {p1, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Error;-><init>(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    return-object p1

    .line 232
    :cond_b
    new-instance p0, LTd/r;

    .line 233
    .line 234
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 235
    .line 236
    .line 237
    throw p0
.end method
