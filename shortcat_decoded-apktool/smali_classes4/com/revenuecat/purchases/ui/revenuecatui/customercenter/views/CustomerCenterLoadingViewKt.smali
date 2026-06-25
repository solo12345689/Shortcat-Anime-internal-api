.class public final Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/CustomerCenterLoadingViewKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\"\u0010\t\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\"\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\n\u0010\u0008\u001a\"\u0010\r\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\u0008\u001a\u000f\u0010\u000e\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u0002\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u000f"
    }
    d2 = {
        "LTd/L;",
        "CustomerCenterLoadingView",
        "(LY/m;I)V",
        "Ls0/r0;",
        "placeholderColor",
        "Lcom/revenuecat/purchases/ui/revenuecatui/composables/Fade;",
        "fadeHighlight",
        "LoadingCardPlaceholder-Iv8Zu3U",
        "(JLcom/revenuecat/purchases/ui/revenuecatui/composables/Fade;LY/m;I)V",
        "LoadingCardPlaceholder",
        "LoadingCardTitleRow-Iv8Zu3U",
        "LoadingCardTitleRow",
        "LoadingButtonsPlaceholder-Iv8Zu3U",
        "LoadingButtonsPlaceholder",
        "CustomerCenterLoadingViewPreview",
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
.method public static final CustomerCenterLoadingView(LY/m;I)V
    .locals 12

    .line 1
    const v0, 0x71d2051c

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
    goto/16 :goto_2

    .line 21
    .line 22
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    const/4 v1, -0x1

    .line 29
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CustomerCenterLoadingView (CustomerCenterLoadingView.kt:45)"

    .line 30
    .line 31
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_2
    sget-object v0, LU/D;->a:LU/D;

    .line 35
    .line 36
    sget v1, LU/D;->b:I

    .line 37
    .line 38
    invoke-virtual {v0, p0, v1}, LU/D;->a(LY/m;I)LU/l;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, LU/l;->w()J

    .line 43
    .line 44
    .line 45
    move-result-wide v1

    .line 46
    const/16 v7, 0xe

    .line 47
    .line 48
    const/4 v8, 0x0

    .line 49
    const v3, 0x3e19999a    # 0.15f

    .line 50
    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    const/4 v5, 0x0

    .line 54
    const/4 v6, 0x0

    .line 55
    invoke-static/range {v1 .. v8}, Ls0/r0;->q(JFFFFILjava/lang/Object;)J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/composables/Fade;

    .line 60
    .line 61
    sget-object v3, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderDefaults;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderDefaults;

    .line 62
    .line 63
    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderDefaults;->getFadeAnimationSpec()Lw/M;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    const/4 v4, 0x0

    .line 68
    invoke-direct {v2, v0, v1, v3, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/Fade;-><init>(JLw/M;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 69
    .line 70
    .line 71
    sget-object v3, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 72
    .line 73
    const/4 v5, 0x1

    .line 74
    invoke-static {v3, v6, v5, v4}, Landroidx/compose/foundation/layout/s;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    sget-object v7, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Layout;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Layout;

    .line 79
    .line 80
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Layout;->getHORIZONTAL_PADDING-D9Ej5fM()F

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    const/4 v9, 0x2

    .line 85
    invoke-static {v5, v8, v6, v9, v4}, Landroidx/compose/foundation/layout/p;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    sget-object v5, Ll0/e;->a:Ll0/e$a;

    .line 90
    .line 91
    invoke-virtual {v5}, Ll0/e$a;->k()Ll0/e$b;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    sget-object v6, LC/b;->a:LC/b;

    .line 96
    .line 97
    invoke-virtual {v6}, LC/b;->h()LC/b$m;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    const/16 v8, 0x30

    .line 102
    .line 103
    invoke-static {v6, v5, p0, v8}, LC/g;->a(LC/b$m;Ll0/e$b;LY/m;I)LI0/B;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    const/4 v6, 0x0

    .line 108
    invoke-static {p0, v6}, LY/h;->a(LY/m;I)I

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    invoke-interface {p0}, LY/m;->r()LY/I;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    invoke-static {p0, v4}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    sget-object v9, LK0/g;->M:LK0/g$a;

    .line 121
    .line 122
    invoke-virtual {v9}, LK0/g$a;->a()Lie/a;

    .line 123
    .line 124
    .line 125
    move-result-object v10

    .line 126
    invoke-interface {p0}, LY/m;->j()LY/d;

    .line 127
    .line 128
    .line 129
    move-result-object v11

    .line 130
    if-nez v11, :cond_3

    .line 131
    .line 132
    invoke-static {}, LY/h;->d()V

    .line 133
    .line 134
    .line 135
    :cond_3
    invoke-interface {p0}, LY/m;->I()V

    .line 136
    .line 137
    .line 138
    invoke-interface {p0}, LY/m;->e()Z

    .line 139
    .line 140
    .line 141
    move-result v11

    .line 142
    if-eqz v11, :cond_4

    .line 143
    .line 144
    invoke-interface {p0, v10}, LY/m;->h(Lie/a;)V

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_4
    invoke-interface {p0}, LY/m;->s()V

    .line 149
    .line 150
    .line 151
    :goto_1
    invoke-static {p0}, LY/m2;->b(LY/m;)LY/m;

    .line 152
    .line 153
    .line 154
    move-result-object v10

    .line 155
    invoke-virtual {v9}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 156
    .line 157
    .line 158
    move-result-object v11

    .line 159
    invoke-static {v10, v5, v11}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v9}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    invoke-static {v10, v8, v5}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v9}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    invoke-interface {v10}, LY/m;->e()Z

    .line 174
    .line 175
    .line 176
    move-result v8

    .line 177
    if-nez v8, :cond_5

    .line 178
    .line 179
    invoke-interface {v10}, LY/m;->D()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v8

    .line 183
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object v11

    .line 187
    invoke-static {v8, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v8

    .line 191
    if-nez v8, :cond_6

    .line 192
    .line 193
    :cond_5
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    invoke-interface {v10, v8}, LY/m;->u(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    invoke-interface {v10, v6, v5}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 205
    .line 206
    .line 207
    :cond_6
    invoke-virtual {v9}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    invoke-static {v10, v4, v5}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 212
    .line 213
    .line 214
    sget-object v4, LC/j;->a:LC/j;

    .line 215
    .line 216
    sget v4, Lw/M;->d:I

    .line 217
    .line 218
    shl-int/lit8 v5, v4, 0x3

    .line 219
    .line 220
    invoke-static {v0, v1, v2, p0, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/CustomerCenterLoadingViewKt;->LoadingCardPlaceholder-Iv8Zu3U(JLcom/revenuecat/purchases/ui/revenuecatui/composables/Fade;LY/m;I)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Layout;->getBUTTONS_TOP_PADDING-D9Ej5fM()F

    .line 224
    .line 225
    .line 226
    move-result v5

    .line 227
    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/s;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    const/4 v5, 0x6

    .line 232
    invoke-static {v3, p0, v5}, LC/K;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 233
    .line 234
    .line 235
    shl-int/lit8 v3, v4, 0x3

    .line 236
    .line 237
    invoke-static {v0, v1, v2, p0, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/CustomerCenterLoadingViewKt;->LoadingButtonsPlaceholder-Iv8Zu3U(JLcom/revenuecat/purchases/ui/revenuecatui/composables/Fade;LY/m;I)V

    .line 238
    .line 239
    .line 240
    invoke-interface {p0}, LY/m;->x()V

    .line 241
    .line 242
    .line 243
    invoke-static {}, LY/w;->L()Z

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-eqz v0, :cond_7

    .line 248
    .line 249
    invoke-static {}, LY/w;->T()V

    .line 250
    .line 251
    .line 252
    :cond_7
    :goto_2
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    if-eqz p0, :cond_8

    .line 257
    .line 258
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/CustomerCenterLoadingViewKt$CustomerCenterLoadingView$2;

    .line 259
    .line 260
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/CustomerCenterLoadingViewKt$CustomerCenterLoadingView$2;-><init>(I)V

    .line 261
    .line 262
    .line 263
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 264
    .line 265
    .line 266
    :cond_8
    return-void
.end method

.method public static final CustomerCenterLoadingViewPreview(LY/m;I)V
    .locals 3

    .line 1
    const v0, 0x44385844

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
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CustomerCenterLoadingViewPreview (CustomerCenterLoadingView.kt:162)"

    .line 29
    .line 30
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ComposableSingletons$CustomerCenterLoadingViewKt;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ComposableSingletons$CustomerCenterLoadingViewKt;

    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ComposableSingletons$CustomerCenterLoadingViewKt;->getLambda-1$revenuecatui_defaultsBc8Release()Lkotlin/jvm/functions/Function2;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/4 v1, 0x6

    .line 40
    invoke-static {v0, p0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/theme/CustomerCenterPreviewThemeKt;->CustomerCenterPreviewTheme(Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 41
    .line 42
    .line 43
    invoke-static {}, LY/w;->L()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    invoke-static {}, LY/w;->T()V

    .line 50
    .line 51
    .line 52
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    if-eqz p0, :cond_4

    .line 57
    .line 58
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/CustomerCenterLoadingViewKt$CustomerCenterLoadingViewPreview$1;

    .line 59
    .line 60
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/CustomerCenterLoadingViewKt$CustomerCenterLoadingViewPreview$1;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 64
    .line 65
    .line 66
    :cond_4
    return-void
.end method

.method private static final LoadingButtonsPlaceholder-Iv8Zu3U(JLcom/revenuecat/purchases/ui/revenuecatui/composables/Fade;LY/m;I)V
    .locals 16

    .line 1
    move-wide/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v5, p2

    .line 4
    .line 5
    move/from16 v11, p4

    .line 6
    .line 7
    const v0, -0x5619b749

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p3

    .line 11
    .line 12
    invoke-interface {v1, v0}, LY/m;->g(I)LY/m;

    .line 13
    .line 14
    .line 15
    move-result-object v8

    .line 16
    and-int/lit8 v1, v11, 0x6

    .line 17
    .line 18
    const/4 v12, 0x2

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    invoke-interface {v8, v2, v3}, LY/m;->d(J)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    const/4 v1, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v1, v12

    .line 30
    :goto_0
    or-int/2addr v1, v11

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v1, v11

    .line 33
    :goto_1
    and-int/lit8 v4, v11, 0x30

    .line 34
    .line 35
    if-nez v4, :cond_4

    .line 36
    .line 37
    and-int/lit8 v4, v11, 0x40

    .line 38
    .line 39
    if-nez v4, :cond_2

    .line 40
    .line 41
    invoke-interface {v8, v5}, LY/m;->U(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    invoke-interface {v8, v5}, LY/m;->F(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    :goto_2
    if-eqz v4, :cond_3

    .line 51
    .line 52
    const/16 v4, 0x20

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_3
    const/16 v4, 0x10

    .line 56
    .line 57
    :goto_3
    or-int/2addr v1, v4

    .line 58
    :cond_4
    move v13, v1

    .line 59
    and-int/lit8 v1, v13, 0x13

    .line 60
    .line 61
    const/16 v4, 0x12

    .line 62
    .line 63
    if-ne v1, v4, :cond_6

    .line 64
    .line 65
    invoke-interface {v8}, LY/m;->i()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-nez v1, :cond_5

    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_5
    invoke-interface {v8}, LY/m;->K()V

    .line 73
    .line 74
    .line 75
    goto/16 :goto_7

    .line 76
    .line 77
    :cond_6
    :goto_4
    invoke-static {}, LY/w;->L()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_7

    .line 82
    .line 83
    const/4 v1, -0x1

    .line 84
    const-string v4, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.LoadingButtonsPlaceholder (CustomerCenterLoadingView.kt:137)"

    .line 85
    .line 86
    invoke-static {v0, v13, v1, v4}, LY/w;->U(IIILjava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :cond_7
    sget-object v0, LC/b;->a:LC/b;

    .line 90
    .line 91
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Layout;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Layout;

    .line 92
    .line 93
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Layout;->getBUTTONS_SPACING-D9Ej5fM()F

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    invoke-virtual {v0, v1}, LC/b;->o(F)LC/b$f;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    sget-object v1, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 102
    .line 103
    sget-object v4, Ll0/e;->a:Ll0/e$a;

    .line 104
    .line 105
    invoke-virtual {v4}, Ll0/e$a;->k()Ll0/e$b;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    const/4 v6, 0x6

    .line 110
    invoke-static {v0, v4, v8, v6}, LC/g;->a(LC/b$m;Ll0/e$b;LY/m;I)LI0/B;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    const/4 v14, 0x0

    .line 115
    invoke-static {v8, v14}, LY/h;->a(LY/m;I)I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    invoke-interface {v8}, LY/m;->r()LY/I;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    invoke-static {v8, v1}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    sget-object v7, LK0/g;->M:LK0/g$a;

    .line 128
    .line 129
    invoke-virtual {v7}, LK0/g$a;->a()Lie/a;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    invoke-interface {v8}, LY/m;->j()LY/d;

    .line 134
    .line 135
    .line 136
    move-result-object v10

    .line 137
    if-nez v10, :cond_8

    .line 138
    .line 139
    invoke-static {}, LY/h;->d()V

    .line 140
    .line 141
    .line 142
    :cond_8
    invoke-interface {v8}, LY/m;->I()V

    .line 143
    .line 144
    .line 145
    invoke-interface {v8}, LY/m;->e()Z

    .line 146
    .line 147
    .line 148
    move-result v10

    .line 149
    if-eqz v10, :cond_9

    .line 150
    .line 151
    invoke-interface {v8, v9}, LY/m;->h(Lie/a;)V

    .line 152
    .line 153
    .line 154
    goto :goto_5

    .line 155
    :cond_9
    invoke-interface {v8}, LY/m;->s()V

    .line 156
    .line 157
    .line 158
    :goto_5
    invoke-static {v8}, LY/m2;->b(LY/m;)LY/m;

    .line 159
    .line 160
    .line 161
    move-result-object v9

    .line 162
    invoke-virtual {v7}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 163
    .line 164
    .line 165
    move-result-object v10

    .line 166
    invoke-static {v9, v0, v10}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v7}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-static {v9, v6, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v7}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-interface {v9}, LY/m;->e()Z

    .line 181
    .line 182
    .line 183
    move-result v6

    .line 184
    if-nez v6, :cond_a

    .line 185
    .line 186
    invoke-interface {v9}, LY/m;->D()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v6

    .line 190
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 191
    .line 192
    .line 193
    move-result-object v10

    .line 194
    invoke-static {v6, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    if-nez v6, :cond_b

    .line 199
    .line 200
    :cond_a
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    invoke-interface {v9, v6}, LY/m;->u(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    invoke-interface {v9, v4, v0}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 212
    .line 213
    .line 214
    :cond_b
    invoke-virtual {v7}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-static {v9, v1, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 219
    .line 220
    .line 221
    sget-object v0, LC/j;->a:LC/j;

    .line 222
    .line 223
    const v0, -0x5618e2cc

    .line 224
    .line 225
    .line 226
    invoke-interface {v8, v0}, LY/m;->V(I)V

    .line 227
    .line 228
    .line 229
    move v15, v14

    .line 230
    :goto_6
    if-ge v15, v12, :cond_c

    .line 231
    .line 232
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 233
    .line 234
    const/4 v1, 0x0

    .line 235
    const/4 v4, 0x1

    .line 236
    const/4 v6, 0x0

    .line 237
    invoke-static {v0, v1, v4, v6}, Landroidx/compose/foundation/layout/s;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    sget-object v7, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/LoadingViewConstants;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/LoadingViewConstants;

    .line 242
    .line 243
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/LoadingViewConstants;->getBUTTON_HEIGHT-D9Ej5fM()F

    .line 244
    .line 245
    .line 246
    move-result v9

    .line 247
    invoke-static {v0, v1, v9, v4, v6}, Landroidx/compose/foundation/layout/s;->b(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/LoadingViewConstants;->getBUTTON_SHAPE()LJ/h;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    shl-int/lit8 v1, v13, 0x6

    .line 256
    .line 257
    and-int/lit16 v1, v1, 0x380

    .line 258
    .line 259
    or-int/lit16 v1, v1, 0xc36

    .line 260
    .line 261
    sget v6, Lw/M;->d:I

    .line 262
    .line 263
    shl-int/lit8 v6, v6, 0xc

    .line 264
    .line 265
    or-int/2addr v1, v6

    .line 266
    shl-int/lit8 v6, v13, 0x9

    .line 267
    .line 268
    const v7, 0xe000

    .line 269
    .line 270
    .line 271
    and-int/2addr v6, v7

    .line 272
    or-int v9, v1, v6

    .line 273
    .line 274
    const/16 v10, 0x30

    .line 275
    .line 276
    const/4 v1, 0x1

    .line 277
    const/4 v6, 0x0

    .line 278
    const/4 v7, 0x0

    .line 279
    invoke-static/range {v0 .. v10}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderKt;->placeholder-TgFrcIs(Landroidx/compose/ui/e;ZJLs0/E1;Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderHighlight;Lie/a;Lie/a;LY/m;II)Landroidx/compose/ui/e;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-static {v0, v8, v14}, Landroidx/compose/foundation/layout/f;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 284
    .line 285
    .line 286
    add-int/lit8 v15, v15, 0x1

    .line 287
    .line 288
    goto :goto_6

    .line 289
    :cond_c
    invoke-interface {v8}, LY/m;->O()V

    .line 290
    .line 291
    .line 292
    invoke-interface {v8}, LY/m;->x()V

    .line 293
    .line 294
    .line 295
    invoke-static {}, LY/w;->L()Z

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    if-eqz v0, :cond_d

    .line 300
    .line 301
    invoke-static {}, LY/w;->T()V

    .line 302
    .line 303
    .line 304
    :cond_d
    :goto_7
    invoke-interface {v8}, LY/m;->k()LY/B1;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    if-eqz v0, :cond_e

    .line 309
    .line 310
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/CustomerCenterLoadingViewKt$LoadingButtonsPlaceholder$2;

    .line 311
    .line 312
    invoke-direct {v1, v2, v3, v5, v11}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/CustomerCenterLoadingViewKt$LoadingButtonsPlaceholder$2;-><init>(JLcom/revenuecat/purchases/ui/revenuecatui/composables/Fade;I)V

    .line 313
    .line 314
    .line 315
    invoke-interface {v0, v1}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 316
    .line 317
    .line 318
    :cond_e
    return-void
.end method

.method private static final LoadingCardPlaceholder-Iv8Zu3U(JLcom/revenuecat/purchases/ui/revenuecatui/composables/Fade;LY/m;I)V
    .locals 18

    .line 1
    move-wide/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    move/from16 v3, p4

    .line 6
    .line 7
    const v4, 0x6b32ed2c

    .line 8
    .line 9
    .line 10
    move-object/from16 v5, p3

    .line 11
    .line 12
    invoke-interface {v5, v4}, LY/m;->g(I)LY/m;

    .line 13
    .line 14
    .line 15
    move-result-object v15

    .line 16
    and-int/lit8 v5, v3, 0x6

    .line 17
    .line 18
    const/4 v6, 0x2

    .line 19
    if-nez v5, :cond_1

    .line 20
    .line 21
    invoke-interface {v15, v0, v1}, LY/m;->d(J)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-eqz v5, :cond_0

    .line 26
    .line 27
    const/4 v5, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v5, v6

    .line 30
    :goto_0
    or-int/2addr v5, v3

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v5, v3

    .line 33
    :goto_1
    and-int/lit8 v7, v3, 0x30

    .line 34
    .line 35
    if-nez v7, :cond_4

    .line 36
    .line 37
    and-int/lit8 v7, v3, 0x40

    .line 38
    .line 39
    if-nez v7, :cond_2

    .line 40
    .line 41
    invoke-interface {v15, v2}, LY/m;->U(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    invoke-interface {v15, v2}, LY/m;->F(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    :goto_2
    if-eqz v7, :cond_3

    .line 51
    .line 52
    const/16 v7, 0x20

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_3
    const/16 v7, 0x10

    .line 56
    .line 57
    :goto_3
    or-int/2addr v5, v7

    .line 58
    :cond_4
    and-int/lit8 v7, v5, 0x13

    .line 59
    .line 60
    const/16 v8, 0x12

    .line 61
    .line 62
    if-ne v7, v8, :cond_6

    .line 63
    .line 64
    invoke-interface {v15}, LY/m;->i()Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-nez v7, :cond_5

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_5
    invoke-interface {v15}, LY/m;->K()V

    .line 72
    .line 73
    .line 74
    goto :goto_5

    .line 75
    :cond_6
    :goto_4
    invoke-static {}, LY/w;->L()Z

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    if-eqz v7, :cond_7

    .line 80
    .line 81
    const/4 v7, -0x1

    .line 82
    const-string v8, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.LoadingCardPlaceholder (CustomerCenterLoadingView.kt:65)"

    .line 83
    .line 84
    invoke-static {v4, v5, v7, v8}, LY/w;->U(IIILjava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_7
    sget-object v4, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 88
    .line 89
    const/4 v5, 0x0

    .line 90
    const/4 v7, 0x0

    .line 91
    const/4 v8, 0x1

    .line 92
    invoke-static {v4, v5, v8, v7}, Landroidx/compose/foundation/layout/s;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    sget-object v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;

    .line 97
    .line 98
    invoke-virtual {v4}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getROUNDED_CORNER_SIZE-D9Ej5fM()F

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    invoke-static {v4}, LJ/i;->d(F)LJ/h;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    sget-object v7, LU/D;->a:LU/D;

    .line 107
    .line 108
    sget v9, LU/D;->b:I

    .line 109
    .line 110
    invoke-virtual {v7, v15, v9}, LU/D;->a(LY/m;I)LU/l;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    int-to-float v6, v6

    .line 115
    invoke-static {v6}, Li1/h;->n(F)F

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    invoke-static {v7, v6}, LU/m;->k(LU/l;F)J

    .line 120
    .line 121
    .line 122
    move-result-wide v6

    .line 123
    new-instance v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/CustomerCenterLoadingViewKt$LoadingCardPlaceholder$1;

    .line 124
    .line 125
    invoke-direct {v9, v0, v1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/CustomerCenterLoadingViewKt$LoadingCardPlaceholder$1;-><init>(JLcom/revenuecat/purchases/ui/revenuecatui/composables/Fade;)V

    .line 126
    .line 127
    .line 128
    const/16 v10, 0x36

    .line 129
    .line 130
    const v11, 0x47cd1ef1

    .line 131
    .line 132
    .line 133
    invoke-static {v11, v8, v9, v15, v10}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 134
    .line 135
    .line 136
    move-result-object v14

    .line 137
    const v16, 0xc00006

    .line 138
    .line 139
    .line 140
    const/16 v17, 0x78

    .line 141
    .line 142
    const-wide/16 v9, 0x0

    .line 143
    .line 144
    const/4 v11, 0x0

    .line 145
    const/4 v12, 0x0

    .line 146
    const/4 v13, 0x0

    .line 147
    move-wide v7, v6

    .line 148
    move-object v6, v4

    .line 149
    invoke-static/range {v5 .. v17}, LU/e0;->a(Landroidx/compose/ui/e;Ls0/E1;JJFFLx/g;Lkotlin/jvm/functions/Function2;LY/m;II)V

    .line 150
    .line 151
    .line 152
    invoke-static {}, LY/w;->L()Z

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    if-eqz v4, :cond_8

    .line 157
    .line 158
    invoke-static {}, LY/w;->T()V

    .line 159
    .line 160
    .line 161
    :cond_8
    :goto_5
    invoke-interface {v15}, LY/m;->k()LY/B1;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    if-eqz v4, :cond_9

    .line 166
    .line 167
    new-instance v5, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/CustomerCenterLoadingViewKt$LoadingCardPlaceholder$2;

    .line 168
    .line 169
    invoke-direct {v5, v0, v1, v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/CustomerCenterLoadingViewKt$LoadingCardPlaceholder$2;-><init>(JLcom/revenuecat/purchases/ui/revenuecatui/composables/Fade;I)V

    .line 170
    .line 171
    .line 172
    invoke-interface {v4, v5}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 173
    .line 174
    .line 175
    :cond_9
    return-void
.end method

.method private static final LoadingCardTitleRow-Iv8Zu3U(JLcom/revenuecat/purchases/ui/revenuecatui/composables/Fade;LY/m;I)V
    .locals 20

    .line 1
    move-wide/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v5, p2

    .line 4
    .line 5
    move/from16 v11, p4

    .line 6
    .line 7
    const v0, -0x467c7069

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p3

    .line 11
    .line 12
    invoke-interface {v1, v0}, LY/m;->g(I)LY/m;

    .line 13
    .line 14
    .line 15
    move-result-object v8

    .line 16
    and-int/lit8 v1, v11, 0x6

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    invoke-interface {v8, v2, v3}, LY/m;->d(J)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    const/4 v1, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v1, 0x2

    .line 29
    :goto_0
    or-int/2addr v1, v11

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v1, v11

    .line 32
    :goto_1
    and-int/lit8 v4, v11, 0x30

    .line 33
    .line 34
    if-nez v4, :cond_4

    .line 35
    .line 36
    and-int/lit8 v4, v11, 0x40

    .line 37
    .line 38
    if-nez v4, :cond_2

    .line 39
    .line 40
    invoke-interface {v8, v5}, LY/m;->U(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    goto :goto_2

    .line 45
    :cond_2
    invoke-interface {v8, v5}, LY/m;->F(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    :goto_2
    if-eqz v4, :cond_3

    .line 50
    .line 51
    const/16 v4, 0x20

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_3
    const/16 v4, 0x10

    .line 55
    .line 56
    :goto_3
    or-int/2addr v1, v4

    .line 57
    :cond_4
    and-int/lit8 v4, v1, 0x13

    .line 58
    .line 59
    const/16 v6, 0x12

    .line 60
    .line 61
    if-ne v4, v6, :cond_6

    .line 62
    .line 63
    invoke-interface {v8}, LY/m;->i()Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-nez v4, :cond_5

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_5
    invoke-interface {v8}, LY/m;->K()V

    .line 71
    .line 72
    .line 73
    goto/16 :goto_6

    .line 74
    .line 75
    :cond_6
    :goto_4
    invoke-static {}, LY/w;->L()Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-eqz v4, :cond_7

    .line 80
    .line 81
    const/4 v4, -0x1

    .line 82
    const-string v6, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.LoadingCardTitleRow (CustomerCenterLoadingView.kt:103)"

    .line 83
    .line 84
    invoke-static {v0, v1, v4, v6}, LY/w;->U(IIILjava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_7
    sget-object v0, LC/b;->a:LC/b;

    .line 88
    .line 89
    invoke-virtual {v0}, LC/b;->e()LC/b$f;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    sget-object v4, Ll0/e;->a:Ll0/e$a;

    .line 94
    .line 95
    invoke-virtual {v4}, Ll0/e$a;->l()Ll0/e$c;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    sget-object v12, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 100
    .line 101
    const/4 v6, 0x1

    .line 102
    const/4 v7, 0x0

    .line 103
    const/4 v9, 0x0

    .line 104
    invoke-static {v12, v9, v6, v7}, Landroidx/compose/foundation/layout/s;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 105
    .line 106
    .line 107
    move-result-object v13

    .line 108
    sget-object v6, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;

    .line 109
    .line 110
    invoke-virtual {v6}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Card;->getTITLE_ROW_BOTTOM_PADDING-D9Ej5fM()F

    .line 111
    .line 112
    .line 113
    move-result v17

    .line 114
    const/16 v18, 0x7

    .line 115
    .line 116
    const/16 v19, 0x0

    .line 117
    .line 118
    const/4 v14, 0x0

    .line 119
    const/4 v15, 0x0

    .line 120
    const/16 v16, 0x0

    .line 121
    .line 122
    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/layout/p;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    const/16 v7, 0x36

    .line 127
    .line 128
    invoke-static {v0, v4, v8, v7}, LC/G;->b(LC/b$e;Ll0/e$c;LY/m;I)LI0/B;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    const/4 v13, 0x0

    .line 133
    invoke-static {v8, v13}, LY/h;->a(LY/m;I)I

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    invoke-interface {v8}, LY/m;->r()LY/I;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    invoke-static {v8, v6}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    sget-object v9, LK0/g;->M:LK0/g$a;

    .line 146
    .line 147
    invoke-virtual {v9}, LK0/g$a;->a()Lie/a;

    .line 148
    .line 149
    .line 150
    move-result-object v10

    .line 151
    invoke-interface {v8}, LY/m;->j()LY/d;

    .line 152
    .line 153
    .line 154
    move-result-object v14

    .line 155
    if-nez v14, :cond_8

    .line 156
    .line 157
    invoke-static {}, LY/h;->d()V

    .line 158
    .line 159
    .line 160
    :cond_8
    invoke-interface {v8}, LY/m;->I()V

    .line 161
    .line 162
    .line 163
    invoke-interface {v8}, LY/m;->e()Z

    .line 164
    .line 165
    .line 166
    move-result v14

    .line 167
    if-eqz v14, :cond_9

    .line 168
    .line 169
    invoke-interface {v8, v10}, LY/m;->h(Lie/a;)V

    .line 170
    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_9
    invoke-interface {v8}, LY/m;->s()V

    .line 174
    .line 175
    .line 176
    :goto_5
    invoke-static {v8}, LY/m2;->b(LY/m;)LY/m;

    .line 177
    .line 178
    .line 179
    move-result-object v10

    .line 180
    invoke-virtual {v9}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 181
    .line 182
    .line 183
    move-result-object v14

    .line 184
    invoke-static {v10, v0, v14}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v9}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-static {v10, v7, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v9}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-interface {v10}, LY/m;->e()Z

    .line 199
    .line 200
    .line 201
    move-result v7

    .line 202
    if-nez v7, :cond_a

    .line 203
    .line 204
    invoke-interface {v10}, LY/m;->D()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v7

    .line 208
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object v14

    .line 212
    invoke-static {v7, v14}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v7

    .line 216
    if-nez v7, :cond_b

    .line 217
    .line 218
    :cond_a
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 219
    .line 220
    .line 221
    move-result-object v7

    .line 222
    invoke-interface {v10, v7}, LY/m;->u(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    invoke-interface {v10, v4, v0}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 230
    .line 231
    .line 232
    :cond_b
    invoke-virtual {v9}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-static {v10, v6, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 237
    .line 238
    .line 239
    sget-object v0, LC/J;->a:LC/J;

    .line 240
    .line 241
    sget-object v14, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/LoadingViewConstants;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/LoadingViewConstants;

    .line 242
    .line 243
    invoke-virtual {v14}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/LoadingViewConstants;->getTITLE_WIDTH-D9Ej5fM()F

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    invoke-static {v12, v0}, Landroidx/compose/foundation/layout/s;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-virtual {v14}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/LoadingViewConstants;->getTITLE_HEIGHT-D9Ej5fM()F

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/s;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-virtual {v14}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/LoadingViewConstants;->getPLACEHOLDER_SHAPE()LJ/h;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    shl-int/lit8 v6, v1, 0x6

    .line 264
    .line 265
    and-int/lit16 v6, v6, 0x380

    .line 266
    .line 267
    or-int/lit16 v15, v6, 0xc36

    .line 268
    .line 269
    sget v16, Lw/M;->d:I

    .line 270
    .line 271
    shl-int/lit8 v6, v16, 0xc

    .line 272
    .line 273
    or-int/2addr v6, v15

    .line 274
    shl-int/lit8 v1, v1, 0x9

    .line 275
    .line 276
    const v7, 0xe000

    .line 277
    .line 278
    .line 279
    and-int v17, v1, v7

    .line 280
    .line 281
    or-int v9, v6, v17

    .line 282
    .line 283
    const/16 v10, 0x30

    .line 284
    .line 285
    const/4 v1, 0x1

    .line 286
    const/4 v6, 0x0

    .line 287
    const/4 v7, 0x0

    .line 288
    invoke-static/range {v0 .. v10}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderKt;->placeholder-TgFrcIs(Landroidx/compose/ui/e;ZJLs0/E1;Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderHighlight;Lie/a;Lie/a;LY/m;II)Landroidx/compose/ui/e;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    invoke-static {v0, v8, v13}, Landroidx/compose/foundation/layout/f;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v14}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/LoadingViewConstants;->getBADGE_WIDTH-D9Ej5fM()F

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    invoke-static {v12, v0}, Landroidx/compose/foundation/layout/s;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-virtual {v14}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/LoadingViewConstants;->getBADGE_HEIGHT-D9Ej5fM()F

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/s;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    invoke-virtual {v14}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/LoadingViewConstants;->getBADGE_SHAPE()LJ/h;

    .line 312
    .line 313
    .line 314
    move-result-object v4

    .line 315
    shl-int/lit8 v1, v16, 0xc

    .line 316
    .line 317
    or-int/2addr v1, v15

    .line 318
    or-int v9, v1, v17

    .line 319
    .line 320
    const/4 v1, 0x1

    .line 321
    move-wide/from16 v2, p0

    .line 322
    .line 323
    move-object/from16 v5, p2

    .line 324
    .line 325
    invoke-static/range {v0 .. v10}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderKt;->placeholder-TgFrcIs(Landroidx/compose/ui/e;ZJLs0/E1;Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderHighlight;Lie/a;Lie/a;LY/m;II)Landroidx/compose/ui/e;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-static {v0, v8, v13}, Landroidx/compose/foundation/layout/f;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 330
    .line 331
    .line 332
    invoke-interface {v8}, LY/m;->x()V

    .line 333
    .line 334
    .line 335
    invoke-static {}, LY/w;->L()Z

    .line 336
    .line 337
    .line 338
    move-result v0

    .line 339
    if-eqz v0, :cond_c

    .line 340
    .line 341
    invoke-static {}, LY/w;->T()V

    .line 342
    .line 343
    .line 344
    :cond_c
    :goto_6
    invoke-interface {v8}, LY/m;->k()LY/B1;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    if-eqz v0, :cond_d

    .line 349
    .line 350
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/CustomerCenterLoadingViewKt$LoadingCardTitleRow$2;

    .line 351
    .line 352
    invoke-direct {v1, v2, v3, v5, v11}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/CustomerCenterLoadingViewKt$LoadingCardTitleRow$2;-><init>(JLcom/revenuecat/purchases/ui/revenuecatui/composables/Fade;I)V

    .line 353
    .line 354
    .line 355
    invoke-interface {v0, v1}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 356
    .line 357
    .line 358
    :cond_d
    return-void
.end method

.method public static final synthetic access$LoadingButtonsPlaceholder-Iv8Zu3U(JLcom/revenuecat/purchases/ui/revenuecatui/composables/Fade;LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/CustomerCenterLoadingViewKt;->LoadingButtonsPlaceholder-Iv8Zu3U(JLcom/revenuecat/purchases/ui/revenuecatui/composables/Fade;LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$LoadingCardPlaceholder-Iv8Zu3U(JLcom/revenuecat/purchases/ui/revenuecatui/composables/Fade;LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/CustomerCenterLoadingViewKt;->LoadingCardPlaceholder-Iv8Zu3U(JLcom/revenuecat/purchases/ui/revenuecatui/composables/Fade;LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$LoadingCardTitleRow-Iv8Zu3U(JLcom/revenuecat/purchases/ui/revenuecatui/composables/Fade;LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/CustomerCenterLoadingViewKt;->LoadingCardTitleRow-Iv8Zu3U(JLcom/revenuecat/purchases/ui/revenuecatui/composables/Fade;LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
