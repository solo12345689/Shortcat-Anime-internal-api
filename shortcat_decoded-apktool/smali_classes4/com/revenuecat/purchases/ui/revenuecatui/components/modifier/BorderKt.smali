.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u001a%\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u0001\u00a2\u0006\u0004\u0008\u0002\u0010\u0005\u001a.\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u0004\u001a\u00020\u0003H\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u000f\u0010\r\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u000e\u001a\u000f\u0010\u0010\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u000e\u001a\u000f\u0010\u0011\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u000e\u001a\u000f\u0010\u0012\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u000e\u001a\u000f\u0010\u0013\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u000e\u001a\u000f\u0010\u0014\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u000e\u001a\u0017\u0010\u0015\u001a\u00020\u000c2\u0006\u0010\u0004\u001a\u00020\u0003H\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a\u0017\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\u0004\u001a\u00020\u0003H\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0016\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u0018"
    }
    d2 = {
        "Landroidx/compose/ui/e;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;",
        "border",
        "Ls0/E1;",
        "shape",
        "(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;Ls0/E1;)Landroidx/compose/ui/e;",
        "Li1/h;",
        "width",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;",
        "colorStyle",
        "border-ziNgDLE",
        "(Landroidx/compose/ui/e;FLcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Ls0/E1;)Landroidx/compose/ui/e;",
        "LTd/L;",
        "Border_Preview_Solid",
        "(LY/m;I)V",
        "Border_Preview_SolidThin",
        "Border_Preview_SolidCircle",
        "Border_Preview_LinearGradientSquare",
        "Border_Preview_LinearGradientCircle",
        "Border_Preview_RadialGradientSquare",
        "Border_Preview_RadialGradientCircle",
        "Border_Preview_LinearGradient",
        "(Ls0/E1;LY/m;I)V",
        "Border_Preview_RadialGradient",
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
.method private static final Border_Preview_LinearGradient(Ls0/E1;LY/m;I)V
    .locals 13

    .line 1
    const v0, -0x485802aa

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    and-int/lit8 v1, p2, 0x6

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    invoke-interface {p1, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v1, v2

    .line 22
    :goto_0
    or-int/2addr v1, p2

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v1, p2

    .line 25
    :goto_1
    and-int/lit8 v3, v1, 0x3

    .line 26
    .line 27
    if-ne v3, v2, :cond_3

    .line 28
    .line 29
    invoke-interface {p1}, LY/m;->i()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_2

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    invoke-interface {p1}, LY/m;->K()V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_3

    .line 40
    .line 41
    :cond_3
    :goto_2
    invoke-static {}, LY/w;->L()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_4

    .line 46
    .line 47
    const/4 v2, -0x1

    .line 48
    const-string v3, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Border_Preview_LinearGradient (Border.kt:117)"

    .line 49
    .line 50
    invoke-static {v0, v1, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_4
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 54
    .line 55
    const/16 v1, 0x64

    .line 56
    .line 57
    int-to-float v1, v1

    .line 58
    invoke-static {v1}, Li1/h;->n(F)F

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/s;->m(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    sget-object v0, Ls0/r0;->b:Ls0/r0$a;

    .line 67
    .line 68
    invoke-virtual {v0}, Ls0/r0$a;->h()J

    .line 69
    .line 70
    .line 71
    move-result-wide v3

    .line 72
    const/4 v6, 0x2

    .line 73
    const/4 v7, 0x0

    .line 74
    const/4 v5, 0x0

    .line 75
    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLs0/E1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;

    .line 80
    .line 81
    const/16 v3, 0xa

    .line 82
    .line 83
    int-to-float v3, v3

    .line 84
    invoke-static {v3}, Li1/h;->n(F)F

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    new-instance v4, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Linear;

    .line 89
    .line 90
    new-instance v5, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;

    .line 91
    .line 92
    invoke-virtual {v0}, Ls0/r0$a;->c()J

    .line 93
    .line 94
    .line 95
    move-result-wide v6

    .line 96
    invoke-static {v6, v7}, Ls0/s0;->k(J)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    const/high16 v6, 0x41200000    # 10.0f

    .line 101
    .line 102
    invoke-direct {v5, v0, v6}, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;-><init>(IF)V

    .line 103
    .line 104
    .line 105
    new-instance v0, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;

    .line 106
    .line 107
    const/16 v10, 0x8

    .line 108
    .line 109
    const/4 v11, 0x0

    .line 110
    const/4 v6, 0x0

    .line 111
    const/16 v7, 0x66

    .line 112
    .line 113
    const/16 v8, 0xff

    .line 114
    .line 115
    const/4 v9, 0x0

    .line 116
    invoke-static/range {v6 .. v11}, Ls0/s0;->f(IIIIILjava/lang/Object;)J

    .line 117
    .line 118
    .line 119
    move-result-wide v6

    .line 120
    invoke-static {v6, v7}, Ls0/s0;->k(J)I

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    const/high16 v7, 0x41f00000    # 30.0f

    .line 125
    .line 126
    invoke-direct {v0, v6, v7}, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;-><init>(IF)V

    .line 127
    .line 128
    .line 129
    new-instance v6, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;

    .line 130
    .line 131
    const/16 v11, 0x8

    .line 132
    .line 133
    const/4 v12, 0x0

    .line 134
    const/16 v7, 0xa0

    .line 135
    .line 136
    const/4 v8, 0x0

    .line 137
    const/16 v9, 0xa0

    .line 138
    .line 139
    const/4 v10, 0x0

    .line 140
    invoke-static/range {v7 .. v12}, Ls0/s0;->f(IIIIILjava/lang/Object;)J

    .line 141
    .line 142
    .line 143
    move-result-wide v7

    .line 144
    invoke-static {v7, v8}, Ls0/s0;->k(J)I

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    const/high16 v8, 0x42a00000    # 80.0f

    .line 149
    .line 150
    invoke-direct {v6, v7, v8}, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;-><init>(IF)V

    .line 151
    .line 152
    .line 153
    filled-new-array {v5, v0, v6}, [Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-static {v0}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    const/high16 v5, 0x43070000    # 135.0f

    .line 162
    .line 163
    invoke-direct {v4, v5, v0}, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Linear;-><init>(FLjava/util/List;)V

    .line 164
    .line 165
    .line 166
    invoke-static {v4}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->toColorStyle(Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    const/4 v4, 0x0

    .line 171
    invoke-direct {v2, v3, v0, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;-><init>(FLcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 172
    .line 173
    .line 174
    invoke-static {v1, v2, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt;->border(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;Ls0/E1;)Landroidx/compose/ui/e;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    const/4 v1, 0x0

    .line 179
    invoke-static {v0, p1, v1}, Landroidx/compose/foundation/layout/f;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 180
    .line 181
    .line 182
    invoke-static {}, LY/w;->L()Z

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    if-eqz v0, :cond_5

    .line 187
    .line 188
    invoke-static {}, LY/w;->T()V

    .line 189
    .line 190
    .line 191
    :cond_5
    :goto_3
    invoke-interface {p1}, LY/m;->k()LY/B1;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    if-eqz p1, :cond_6

    .line 196
    .line 197
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt$Border_Preview_LinearGradient$1;

    .line 198
    .line 199
    invoke-direct {v0, p0, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt$Border_Preview_LinearGradient$1;-><init>(Ls0/E1;I)V

    .line 200
    .line 201
    .line 202
    invoke-interface {p1, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 203
    .line 204
    .line 205
    :cond_6
    return-void
.end method

.method private static final Border_Preview_LinearGradientCircle(LY/m;I)V
    .locals 3

    .line 1
    const v0, -0x340d35e7    # -3.1822898E7f

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
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Border_Preview_LinearGradientCircle (Border.kt:99)"

    .line 29
    .line 30
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    invoke-static {}, LJ/i;->g()LJ/h;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-static {v0, p0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt;->Border_Preview_LinearGradient(Ls0/E1;LY/m;I)V

    .line 39
    .line 40
    .line 41
    invoke-static {}, LY/w;->L()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    invoke-static {}, LY/w;->T()V

    .line 48
    .line 49
    .line 50
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-eqz p0, :cond_4

    .line 55
    .line 56
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt$Border_Preview_LinearGradientCircle$1;

    .line 57
    .line 58
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt$Border_Preview_LinearGradientCircle$1;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 62
    .line 63
    .line 64
    :cond_4
    return-void
.end method

.method private static final Border_Preview_LinearGradientSquare(LY/m;I)V
    .locals 3

    .line 1
    const v0, 0x139596a6

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
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Border_Preview_LinearGradientSquare (Border.kt:93)"

    .line 29
    .line 30
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    invoke-static {}, Ls0/t1;->a()Ls0/E1;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const/4 v1, 0x6

    .line 38
    invoke-static {v0, p0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt;->Border_Preview_LinearGradient(Ls0/E1;LY/m;I)V

    .line 39
    .line 40
    .line 41
    invoke-static {}, LY/w;->L()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    invoke-static {}, LY/w;->T()V

    .line 48
    .line 49
    .line 50
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-eqz p0, :cond_4

    .line 55
    .line 56
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt$Border_Preview_LinearGradientSquare$1;

    .line 57
    .line 58
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt$Border_Preview_LinearGradientSquare$1;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 62
    .line 63
    .line 64
    :cond_4
    return-void
.end method

.method private static final Border_Preview_RadialGradient(Ls0/E1;LY/m;I)V
    .locals 13

    .line 1
    const v0, -0x523a3fe4

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    and-int/lit8 v1, p2, 0x6

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    invoke-interface {p1, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v1, v2

    .line 22
    :goto_0
    or-int/2addr v1, p2

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v1, p2

    .line 25
    :goto_1
    and-int/lit8 v3, v1, 0x3

    .line 26
    .line 27
    if-ne v3, v2, :cond_3

    .line 28
    .line 29
    invoke-interface {p1}, LY/m;->i()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_2

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    invoke-interface {p1}, LY/m;->K()V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_3

    .line 40
    .line 41
    :cond_3
    :goto_2
    invoke-static {}, LY/w;->L()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_4

    .line 46
    .line 47
    const/4 v2, -0x1

    .line 48
    const-string v3, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Border_Preview_RadialGradient (Border.kt:150)"

    .line 49
    .line 50
    invoke-static {v0, v1, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_4
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 54
    .line 55
    const/16 v1, 0x64

    .line 56
    .line 57
    int-to-float v1, v1

    .line 58
    invoke-static {v1}, Li1/h;->n(F)F

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/s;->m(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    sget-object v0, Ls0/r0;->b:Ls0/r0$a;

    .line 67
    .line 68
    invoke-virtual {v0}, Ls0/r0$a;->h()J

    .line 69
    .line 70
    .line 71
    move-result-wide v3

    .line 72
    const/4 v6, 0x2

    .line 73
    const/4 v7, 0x0

    .line 74
    const/4 v5, 0x0

    .line 75
    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLs0/E1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;

    .line 80
    .line 81
    const/16 v3, 0xa

    .line 82
    .line 83
    int-to-float v3, v3

    .line 84
    invoke-static {v3}, Li1/h;->n(F)F

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    new-instance v4, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Radial;

    .line 89
    .line 90
    new-instance v5, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;

    .line 91
    .line 92
    invoke-virtual {v0}, Ls0/r0$a;->c()J

    .line 93
    .line 94
    .line 95
    move-result-wide v6

    .line 96
    invoke-static {v6, v7}, Ls0/s0;->k(J)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    const/high16 v6, 0x42a00000    # 80.0f

    .line 101
    .line 102
    invoke-direct {v5, v0, v6}, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;-><init>(IF)V

    .line 103
    .line 104
    .line 105
    new-instance v0, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;

    .line 106
    .line 107
    const/16 v10, 0x8

    .line 108
    .line 109
    const/4 v11, 0x0

    .line 110
    const/4 v6, 0x0

    .line 111
    const/16 v7, 0x66

    .line 112
    .line 113
    const/16 v8, 0xff

    .line 114
    .line 115
    const/4 v9, 0x0

    .line 116
    invoke-static/range {v6 .. v11}, Ls0/s0;->f(IIIIILjava/lang/Object;)J

    .line 117
    .line 118
    .line 119
    move-result-wide v6

    .line 120
    invoke-static {v6, v7}, Ls0/s0;->k(J)I

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    const/high16 v7, 0x42b40000    # 90.0f

    .line 125
    .line 126
    invoke-direct {v0, v6, v7}, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;-><init>(IF)V

    .line 127
    .line 128
    .line 129
    new-instance v6, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;

    .line 130
    .line 131
    const/16 v11, 0x8

    .line 132
    .line 133
    const/4 v12, 0x0

    .line 134
    const/16 v7, 0xa0

    .line 135
    .line 136
    const/4 v8, 0x0

    .line 137
    const/16 v9, 0xa0

    .line 138
    .line 139
    const/4 v10, 0x0

    .line 140
    invoke-static/range {v7 .. v12}, Ls0/s0;->f(IIIIILjava/lang/Object;)J

    .line 141
    .line 142
    .line 143
    move-result-wide v7

    .line 144
    invoke-static {v7, v8}, Ls0/s0;->k(J)I

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    const/high16 v8, 0x42c00000    # 96.0f

    .line 149
    .line 150
    invoke-direct {v6, v7, v8}, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;-><init>(IF)V

    .line 151
    .line 152
    .line 153
    filled-new-array {v5, v0, v6}, [Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-static {v0}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-direct {v4, v0}, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Radial;-><init>(Ljava/util/List;)V

    .line 162
    .line 163
    .line 164
    invoke-static {v4}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->toColorStyle(Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    const/4 v4, 0x0

    .line 169
    invoke-direct {v2, v3, v0, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;-><init>(FLcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 170
    .line 171
    .line 172
    invoke-static {v1, v2, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt;->border(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;Ls0/E1;)Landroidx/compose/ui/e;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    const/4 v1, 0x0

    .line 177
    invoke-static {v0, p1, v1}, Landroidx/compose/foundation/layout/f;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 178
    .line 179
    .line 180
    invoke-static {}, LY/w;->L()Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-eqz v0, :cond_5

    .line 185
    .line 186
    invoke-static {}, LY/w;->T()V

    .line 187
    .line 188
    .line 189
    :cond_5
    :goto_3
    invoke-interface {p1}, LY/m;->k()LY/B1;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    if-eqz p1, :cond_6

    .line 194
    .line 195
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt$Border_Preview_RadialGradient$1;

    .line 196
    .line 197
    invoke-direct {v0, p0, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt$Border_Preview_RadialGradient$1;-><init>(Ls0/E1;I)V

    .line 198
    .line 199
    .line 200
    invoke-interface {p1, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 201
    .line 202
    .line 203
    :cond_6
    return-void
.end method

.method private static final Border_Preview_RadialGradientCircle(LY/m;I)V
    .locals 3

    .line 1
    const v0, -0x66729fed

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
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Border_Preview_RadialGradientCircle (Border.kt:111)"

    .line 29
    .line 30
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    invoke-static {}, LJ/i;->g()LJ/h;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-static {v0, p0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt;->Border_Preview_RadialGradient(Ls0/E1;LY/m;I)V

    .line 39
    .line 40
    .line 41
    invoke-static {}, LY/w;->L()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    invoke-static {}, LY/w;->T()V

    .line 48
    .line 49
    .line 50
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-eqz p0, :cond_4

    .line 55
    .line 56
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt$Border_Preview_RadialGradientCircle$1;

    .line 57
    .line 58
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt$Border_Preview_RadialGradientCircle$1;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 62
    .line 63
    .line 64
    :cond_4
    return-void
.end method

.method private static final Border_Preview_RadialGradientSquare(LY/m;I)V
    .locals 3

    .line 1
    const v0, -0x1ecfd360

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
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Border_Preview_RadialGradientSquare (Border.kt:105)"

    .line 29
    .line 30
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    invoke-static {}, Ls0/t1;->a()Ls0/E1;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const/4 v1, 0x6

    .line 38
    invoke-static {v0, p0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt;->Border_Preview_RadialGradient(Ls0/E1;LY/m;I)V

    .line 39
    .line 40
    .line 41
    invoke-static {}, LY/w;->L()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    invoke-static {}, LY/w;->T()V

    .line 48
    .line 49
    .line 50
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-eqz p0, :cond_4

    .line 55
    .line 56
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt$Border_Preview_RadialGradientSquare$1;

    .line 57
    .line 58
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt$Border_Preview_RadialGradientSquare$1;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 62
    .line 63
    .line 64
    :cond_4
    return-void
.end method

.method private static final Border_Preview_Solid(LY/m;I)V
    .locals 8

    .line 1
    const v0, -0x45cc5119

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
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Border_Preview_Solid (Border.kt:42)"

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
    move-result-object v2

    .line 46
    sget-object v0, Ls0/r0;->b:Ls0/r0$a;

    .line 47
    .line 48
    invoke-virtual {v0}, Ls0/r0$a;->h()J

    .line 49
    .line 50
    .line 51
    move-result-wide v3

    .line 52
    const/4 v6, 0x2

    .line 53
    const/4 v7, 0x0

    .line 54
    const/4 v5, 0x0

    .line 55
    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLs0/E1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;

    .line 60
    .line 61
    const/16 v3, 0xa

    .line 62
    .line 63
    int-to-float v3, v3

    .line 64
    invoke-static {v3}, Li1/h;->n(F)F

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    invoke-virtual {v0}, Ls0/r0$a;->b()J

    .line 69
    .line 70
    .line 71
    move-result-wide v4

    .line 72
    invoke-static {v4, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->constructor-impl(J)J

    .line 73
    .line 74
    .line 75
    move-result-wide v4

    .line 76
    invoke-static {v4, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->box-impl(J)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const/4 v4, 0x0

    .line 81
    invoke-direct {v2, v3, v0, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;-><init>(FLcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 82
    .line 83
    .line 84
    const/4 v0, 0x2

    .line 85
    invoke-static {v1, v2, v4, v0, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt;->border$default(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;Ls0/E1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const/4 v1, 0x6

    .line 90
    invoke-static {v0, p0, v1}, Landroidx/compose/foundation/layout/f;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 91
    .line 92
    .line 93
    invoke-static {}, LY/w;->L()Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_3

    .line 98
    .line 99
    invoke-static {}, LY/w;->T()V

    .line 100
    .line 101
    .line 102
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    if-eqz p0, :cond_4

    .line 107
    .line 108
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt$Border_Preview_Solid$1;

    .line 109
    .line 110
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt$Border_Preview_Solid$1;-><init>(I)V

    .line 111
    .line 112
    .line 113
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 114
    .line 115
    .line 116
    :cond_4
    return-void
.end method

.method private static final Border_Preview_SolidCircle(LY/m;I)V
    .locals 8

    .line 1
    const v0, 0x7cd4ec97

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
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Border_Preview_SolidCircle (Border.kt:76)"

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
    move-result-object v2

    .line 46
    sget-object v0, Ls0/r0;->b:Ls0/r0$a;

    .line 47
    .line 48
    invoke-virtual {v0}, Ls0/r0$a;->h()J

    .line 49
    .line 50
    .line 51
    move-result-wide v3

    .line 52
    const/4 v6, 0x2

    .line 53
    const/4 v7, 0x0

    .line 54
    const/4 v5, 0x0

    .line 55
    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLs0/E1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;

    .line 60
    .line 61
    const/16 v3, 0xa

    .line 62
    .line 63
    int-to-float v3, v3

    .line 64
    invoke-static {v3}, Li1/h;->n(F)F

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    invoke-virtual {v0}, Ls0/r0$a;->b()J

    .line 69
    .line 70
    .line 71
    move-result-wide v4

    .line 72
    invoke-static {v4, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->constructor-impl(J)J

    .line 73
    .line 74
    .line 75
    move-result-wide v4

    .line 76
    invoke-static {v4, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->box-impl(J)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const/4 v4, 0x0

    .line 81
    invoke-direct {v2, v3, v0, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;-><init>(FLcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 82
    .line 83
    .line 84
    invoke-static {}, LJ/i;->g()LJ/h;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-static {v1, v2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt;->border(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;Ls0/E1;)Landroidx/compose/ui/e;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    const/4 v1, 0x0

    .line 93
    invoke-static {v0, p0, v1}, Landroidx/compose/foundation/layout/f;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 94
    .line 95
    .line 96
    invoke-static {}, LY/w;->L()Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_3

    .line 101
    .line 102
    invoke-static {}, LY/w;->T()V

    .line 103
    .line 104
    .line 105
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    if-eqz p0, :cond_4

    .line 110
    .line 111
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt$Border_Preview_SolidCircle$1;

    .line 112
    .line 113
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt$Border_Preview_SolidCircle$1;-><init>(I)V

    .line 114
    .line 115
    .line 116
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 117
    .line 118
    .line 119
    :cond_4
    return-void
.end method

.method private static final Border_Preview_SolidThin(LY/m;I)V
    .locals 8

    .line 1
    const v0, 0x1c1b6960

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
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Border_Preview_SolidThin (Border.kt:59)"

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
    move-result-object v2

    .line 46
    sget-object v0, Ls0/r0;->b:Ls0/r0$a;

    .line 47
    .line 48
    invoke-virtual {v0}, Ls0/r0$a;->h()J

    .line 49
    .line 50
    .line 51
    move-result-wide v3

    .line 52
    const/4 v6, 0x2

    .line 53
    const/4 v7, 0x0

    .line 54
    const/4 v5, 0x0

    .line 55
    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLs0/E1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;

    .line 60
    .line 61
    const/4 v3, 0x2

    .line 62
    int-to-float v4, v3

    .line 63
    invoke-static {v4}, Li1/h;->n(F)F

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    invoke-virtual {v0}, Ls0/r0$a;->b()J

    .line 68
    .line 69
    .line 70
    move-result-wide v5

    .line 71
    invoke-static {v5, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->constructor-impl(J)J

    .line 72
    .line 73
    .line 74
    move-result-wide v5

    .line 75
    invoke-static {v5, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->box-impl(J)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    const/4 v5, 0x0

    .line 80
    invoke-direct {v2, v4, v0, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;-><init>(FLcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v1, v2, v5, v3, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt;->border$default(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;Ls0/E1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    const/4 v1, 0x6

    .line 88
    invoke-static {v0, p0, v1}, Landroidx/compose/foundation/layout/f;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 89
    .line 90
    .line 91
    invoke-static {}, LY/w;->L()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_3

    .line 96
    .line 97
    invoke-static {}, LY/w;->T()V

    .line 98
    .line 99
    .line 100
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    if-eqz p0, :cond_4

    .line 105
    .line 106
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt$Border_Preview_SolidThin$1;

    .line 107
    .line 108
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt$Border_Preview_SolidThin$1;-><init>(I)V

    .line 109
    .line 110
    .line 111
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 112
    .line 113
    .line 114
    :cond_4
    return-void
.end method

.method public static final synthetic access$Border_Preview_LinearGradient(Ls0/E1;LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt;->Border_Preview_LinearGradient(Ls0/E1;LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$Border_Preview_LinearGradientCircle(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt;->Border_Preview_LinearGradientCircle(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$Border_Preview_LinearGradientSquare(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt;->Border_Preview_LinearGradientSquare(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$Border_Preview_RadialGradient(Ls0/E1;LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt;->Border_Preview_RadialGradient(Ls0/E1;LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$Border_Preview_RadialGradientCircle(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt;->Border_Preview_RadialGradientCircle(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$Border_Preview_RadialGradientSquare(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt;->Border_Preview_RadialGradientSquare(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$Border_Preview_Solid(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt;->Border_Preview_Solid(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$Border_Preview_SolidCircle(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt;->Border_Preview_SolidCircle(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$Border_Preview_SolidThin(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt;->Border_Preview_SolidThin(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic border(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;Ls0/E1;)Landroidx/compose/ui/e;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "border"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "shape"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;->getWidth-D9Ej5fM()F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;->getColor()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p0, v0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt;->border-ziNgDLE(Landroidx/compose/ui/e;FLcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Ls0/E1;)Landroidx/compose/ui/e;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public static synthetic border$default(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;Ls0/E1;ILjava/lang/Object;)Landroidx/compose/ui/e;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    invoke-static {}, Ls0/t1;->a()Ls0/E1;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    :cond_0
    invoke-static {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BorderKt;->border(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;Ls0/E1;)Landroidx/compose/ui/e;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static final synthetic border-ziNgDLE(Landroidx/compose/ui/e;FLcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Ls0/E1;)Landroidx/compose/ui/e;
    .locals 2

    .line 1
    const-string v0, "$this$border"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "colorStyle"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "shape"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    instance-of v0, p2, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    check-cast p2, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;

    .line 21
    .line 22
    invoke-virtual {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->unbox-impl()J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    invoke-static {p0, p1, v0, v1, p3}, Lx/e;->f(Landroidx/compose/ui/e;FJLs0/E1;)Landroidx/compose/ui/e;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_0
    instance-of v0, p2, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Gradient;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    check-cast p2, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Gradient;

    .line 36
    .line 37
    invoke-virtual {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Gradient;->unbox-impl()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/GradientBrush;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-static {p0, p1, p2, p3}, Lx/e;->h(Landroidx/compose/ui/e;FLs0/h0;Ls0/E1;)Landroidx/compose/ui/e;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :cond_1
    new-instance p0, LTd/r;

    .line 47
    .line 48
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 49
    .line 50
    .line 51
    throw p0
.end method
