.class public final Lcom/revenuecat/purchases/ui/revenuecatui/composables/AppIconKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Landroidx/compose/ui/e;",
        "modifier",
        "LTd/L;",
        "AppIcon",
        "(Landroidx/compose/ui/e;LY/m;II)V",
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
.method public static final AppIcon(Landroidx/compose/ui/e;LY/m;II)V
    .locals 18

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    const v2, -0x39433aae

    .line 6
    .line 7
    .line 8
    move-object/from16 v3, p1

    .line 9
    .line 10
    invoke-interface {v3, v2}, LY/m;->g(I)LY/m;

    .line 11
    .line 12
    .line 13
    move-result-object v11

    .line 14
    and-int/lit8 v3, v1, 0x1

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    or-int/lit8 v5, v0, 0x6

    .line 20
    .line 21
    move v6, v5

    .line 22
    move-object/from16 v5, p0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    and-int/lit8 v5, v0, 0x6

    .line 26
    .line 27
    if-nez v5, :cond_2

    .line 28
    .line 29
    move-object/from16 v5, p0

    .line 30
    .line 31
    invoke-interface {v11, v5}, LY/m;->U(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    if-eqz v6, :cond_1

    .line 36
    .line 37
    const/4 v6, 0x4

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move v6, v4

    .line 40
    :goto_0
    or-int/2addr v6, v0

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move-object/from16 v5, p0

    .line 43
    .line 44
    move v6, v0

    .line 45
    :goto_1
    and-int/lit8 v7, v6, 0x3

    .line 46
    .line 47
    if-ne v7, v4, :cond_4

    .line 48
    .line 49
    invoke-interface {v11}, LY/m;->i()Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-nez v4, :cond_3

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    invoke-interface {v11}, LY/m;->K()V

    .line 57
    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_4
    :goto_2
    if-eqz v3, :cond_5

    .line 61
    .line 62
    sget-object v3, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 63
    .line 64
    move-object v5, v3

    .line 65
    :cond_5
    invoke-static {}, LY/w;->L()Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_6

    .line 70
    .line 71
    const/4 v3, -0x1

    .line 72
    const-string v4, "com.revenuecat.purchases.ui.revenuecatui.composables.AppIcon (AppIcon.kt:14)"

    .line 73
    .line 74
    invoke-static {v2, v6, v3, v4}, LY/w;->U(IIILjava/lang/String;)V

    .line 75
    .line 76
    .line 77
    :cond_6
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->g()LY/b1;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-interface {v11, v2}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    check-cast v2, Landroid/content/Context;

    .line 86
    .line 87
    const v3, 0x31894aa6

    .line 88
    .line 89
    .line 90
    invoke-interface {v11, v3}, LY/m;->V(I)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v11}, LY/m;->D()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    sget-object v4, LY/m;->a:LY/m$a;

    .line 98
    .line 99
    invoke-virtual {v4}, LY/m$a;->a()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    if-ne v3, v4, :cond_7

    .line 104
    .line 105
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-virtual {v2, v3}, Landroid/content/pm/PackageItemInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-interface {v11, v3}, LY/m;->u(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :cond_7
    move-object v12, v3

    .line 121
    check-cast v12, Landroid/graphics/drawable/Drawable;

    .line 122
    .line 123
    invoke-interface {v11}, LY/m;->O()V

    .line 124
    .line 125
    .line 126
    const-string v2, "appIconResId"

    .line 127
    .line 128
    invoke-static {v12, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    sget-object v15, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 132
    .line 133
    const/16 v16, 0x3

    .line 134
    .line 135
    const/16 v17, 0x0

    .line 136
    .line 137
    const/4 v13, 0x0

    .line 138
    const/4 v14, 0x0

    .line 139
    invoke-static/range {v12 .. v17}, LB1/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-static {v2}, Ls0/O;->c(Landroid/graphics/Bitmap;)Ls0/b1;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    sget-object v2, LI0/f;->a:LI0/f$a;

    .line 148
    .line 149
    invoke-virtual {v2}, LI0/f$a;->a()LI0/f;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    shl-int/lit8 v2, v6, 0x6

    .line 154
    .line 155
    and-int/lit16 v2, v2, 0x380

    .line 156
    .line 157
    or-int/lit16 v12, v2, 0x6030

    .line 158
    .line 159
    const/16 v13, 0xe8

    .line 160
    .line 161
    const/4 v4, 0x0

    .line 162
    const/4 v6, 0x0

    .line 163
    const/4 v8, 0x0

    .line 164
    const/4 v9, 0x0

    .line 165
    const/4 v10, 0x0

    .line 166
    invoke-static/range {v3 .. v13}, Lx/F;->b(Ls0/b1;Ljava/lang/String;Landroidx/compose/ui/e;Ll0/e;LI0/f;FLandroidx/compose/ui/graphics/d;ILY/m;II)V

    .line 167
    .line 168
    .line 169
    invoke-static {}, LY/w;->L()Z

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    if-eqz v2, :cond_8

    .line 174
    .line 175
    invoke-static {}, LY/w;->T()V

    .line 176
    .line 177
    .line 178
    :cond_8
    :goto_3
    invoke-interface {v11}, LY/m;->k()LY/B1;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    if-eqz v2, :cond_9

    .line 183
    .line 184
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AppIconKt$AppIcon$1;

    .line 185
    .line 186
    invoke-direct {v3, v5, v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AppIconKt$AppIcon$1;-><init>(Landroidx/compose/ui/e;II)V

    .line 187
    .line 188
    .line 189
    invoke-interface {v2, v3}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 190
    .line 191
    .line 192
    :cond_9
    return-void
.end method
