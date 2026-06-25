.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/components/pkg/PackageComponentViewKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aM\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u00042\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/PackageComponentStyle;",
        "style",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;",
        "state",
        "Lkotlin/Function2;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;",
        "LZd/e;",
        "LTd/L;",
        "",
        "clickHandler",
        "Landroidx/compose/ui/e;",
        "modifier",
        "PackageComponentView",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/PackageComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LY/m;II)V",
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
.method public static final synthetic PackageComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/PackageComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LY/m;II)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    move/from16 v10, p5

    .line 8
    .line 9
    const-string v3, "style"

    .line 10
    .line 11
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v3, "state"

    .line 15
    .line 16
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v3, "clickHandler"

    .line 20
    .line 21
    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const v3, -0x7e308661

    .line 25
    .line 26
    .line 27
    move-object/from16 v4, p4

    .line 28
    .line 29
    invoke-interface {v4, v3}, LY/m;->g(I)LY/m;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    and-int/lit8 v4, p6, 0x1

    .line 34
    .line 35
    const/4 v5, 0x4

    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    or-int/lit8 v4, v10, 0x6

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    and-int/lit8 v4, v10, 0x6

    .line 42
    .line 43
    if-nez v4, :cond_2

    .line 44
    .line 45
    invoke-interface {v7, v1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_1

    .line 50
    .line 51
    move v4, v5

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    const/4 v4, 0x2

    .line 54
    :goto_0
    or-int/2addr v4, v10

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    move v4, v10

    .line 57
    :goto_1
    and-int/lit8 v6, p6, 0x2

    .line 58
    .line 59
    const/16 v8, 0x20

    .line 60
    .line 61
    if-eqz v6, :cond_3

    .line 62
    .line 63
    or-int/lit8 v4, v4, 0x30

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_3
    and-int/lit8 v6, v10, 0x30

    .line 67
    .line 68
    if-nez v6, :cond_5

    .line 69
    .line 70
    invoke-interface {v7, v2}, LY/m;->U(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    if-eqz v6, :cond_4

    .line 75
    .line 76
    move v6, v8

    .line 77
    goto :goto_2

    .line 78
    :cond_4
    const/16 v6, 0x10

    .line 79
    .line 80
    :goto_2
    or-int/2addr v4, v6

    .line 81
    :cond_5
    :goto_3
    and-int/lit8 v6, p6, 0x4

    .line 82
    .line 83
    if-eqz v6, :cond_6

    .line 84
    .line 85
    or-int/lit16 v4, v4, 0x180

    .line 86
    .line 87
    goto :goto_5

    .line 88
    :cond_6
    and-int/lit16 v6, v10, 0x180

    .line 89
    .line 90
    if-nez v6, :cond_8

    .line 91
    .line 92
    invoke-interface {v7, v0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-eqz v6, :cond_7

    .line 97
    .line 98
    const/16 v6, 0x100

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_7
    const/16 v6, 0x80

    .line 102
    .line 103
    :goto_4
    or-int/2addr v4, v6

    .line 104
    :cond_8
    :goto_5
    and-int/lit8 v6, p6, 0x8

    .line 105
    .line 106
    if-eqz v6, :cond_a

    .line 107
    .line 108
    or-int/lit16 v4, v4, 0xc00

    .line 109
    .line 110
    :cond_9
    move-object/from16 v9, p3

    .line 111
    .line 112
    goto :goto_7

    .line 113
    :cond_a
    and-int/lit16 v9, v10, 0xc00

    .line 114
    .line 115
    if-nez v9, :cond_9

    .line 116
    .line 117
    move-object/from16 v9, p3

    .line 118
    .line 119
    invoke-interface {v7, v9}, LY/m;->U(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v11

    .line 123
    if-eqz v11, :cond_b

    .line 124
    .line 125
    const/16 v11, 0x800

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_b
    const/16 v11, 0x400

    .line 129
    .line 130
    :goto_6
    or-int/2addr v4, v11

    .line 131
    :goto_7
    and-int/lit16 v11, v4, 0x493

    .line 132
    .line 133
    const/16 v12, 0x492

    .line 134
    .line 135
    if-ne v11, v12, :cond_d

    .line 136
    .line 137
    invoke-interface {v7}, LY/m;->i()Z

    .line 138
    .line 139
    .line 140
    move-result v11

    .line 141
    if-nez v11, :cond_c

    .line 142
    .line 143
    goto :goto_8

    .line 144
    :cond_c
    invoke-interface {v7}, LY/m;->K()V

    .line 145
    .line 146
    .line 147
    move-object v4, v9

    .line 148
    goto/16 :goto_c

    .line 149
    .line 150
    :cond_d
    :goto_8
    if-eqz v6, :cond_e

    .line 151
    .line 152
    sget-object v6, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 153
    .line 154
    move-object v11, v6

    .line 155
    goto :goto_9

    .line 156
    :cond_e
    move-object v11, v9

    .line 157
    :goto_9
    invoke-static {}, LY/w;->L()Z

    .line 158
    .line 159
    .line 160
    move-result v6

    .line 161
    if-eqz v6, :cond_f

    .line 162
    .line 163
    const/4 v6, -0x1

    .line 164
    const-string v9, "com.revenuecat.purchases.ui.revenuecatui.components.pkg.PackageComponentView (PackageComponentView.kt:20)"

    .line 165
    .line 166
    invoke-static {v3, v4, v6, v9}, LY/w;->U(IIILjava/lang/String;)V

    .line 167
    .line 168
    .line 169
    :cond_f
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/PackageComponentStyle;->getStackComponentStyle()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    const v6, -0x60697f4f

    .line 174
    .line 175
    .line 176
    invoke-interface {v7, v6}, LY/m;->V(I)V

    .line 177
    .line 178
    .line 179
    and-int/lit8 v6, v4, 0xe

    .line 180
    .line 181
    const/4 v9, 0x0

    .line 182
    const/4 v12, 0x1

    .line 183
    if-ne v6, v5, :cond_10

    .line 184
    .line 185
    move v13, v12

    .line 186
    goto :goto_a

    .line 187
    :cond_10
    move v13, v9

    .line 188
    :goto_a
    invoke-interface {v7, v0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v14

    .line 192
    or-int/2addr v13, v14

    .line 193
    invoke-interface {v7}, LY/m;->D()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v14

    .line 197
    if-nez v13, :cond_11

    .line 198
    .line 199
    sget-object v13, LY/m;->a:LY/m$a;

    .line 200
    .line 201
    invoke-virtual {v13}, LY/m$a;->a()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v13

    .line 205
    if-ne v14, v13, :cond_12

    .line 206
    .line 207
    :cond_11
    new-instance v14, Lcom/revenuecat/purchases/ui/revenuecatui/components/pkg/PackageComponentViewKt$PackageComponentView$1$1;

    .line 208
    .line 209
    const/4 v13, 0x0

    .line 210
    invoke-direct {v14, v1, v0, v13}, Lcom/revenuecat/purchases/ui/revenuecatui/components/pkg/PackageComponentViewKt$PackageComponentView$1$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/PackageComponentStyle;Lkotlin/jvm/functions/Function2;LZd/e;)V

    .line 211
    .line 212
    .line 213
    invoke-interface {v7, v14}, LY/m;->u(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    :cond_12
    check-cast v14, Lkotlin/jvm/functions/Function2;

    .line 217
    .line 218
    invoke-interface {v7}, LY/m;->O()V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/PackageComponentStyle;->isSelectable()Z

    .line 222
    .line 223
    .line 224
    move-result v13

    .line 225
    const v15, -0x60695f17

    .line 226
    .line 227
    .line 228
    invoke-interface {v7, v15}, LY/m;->V(I)V

    .line 229
    .line 230
    .line 231
    and-int/lit8 v4, v4, 0x70

    .line 232
    .line 233
    if-ne v4, v8, :cond_13

    .line 234
    .line 235
    move v8, v12

    .line 236
    goto :goto_b

    .line 237
    :cond_13
    move v8, v9

    .line 238
    :goto_b
    if-ne v6, v5, :cond_14

    .line 239
    .line 240
    move v9, v12

    .line 241
    :cond_14
    or-int v5, v8, v9

    .line 242
    .line 243
    invoke-interface {v7}, LY/m;->D()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v6

    .line 247
    if-nez v5, :cond_15

    .line 248
    .line 249
    sget-object v5, LY/m;->a:LY/m$a;

    .line 250
    .line 251
    invoke-virtual {v5}, LY/m$a;->a()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    if-ne v6, v5, :cond_16

    .line 256
    .line 257
    :cond_15
    new-instance v6, Lcom/revenuecat/purchases/ui/revenuecatui/components/pkg/PackageComponentViewKt$PackageComponentView$2$1;

    .line 258
    .line 259
    invoke-direct {v6, v2, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/pkg/PackageComponentViewKt$PackageComponentView$2$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/PackageComponentStyle;)V

    .line 260
    .line 261
    .line 262
    invoke-interface {v7, v6}, LY/m;->u(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    :cond_16
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 266
    .line 267
    invoke-interface {v7}, LY/m;->O()V

    .line 268
    .line 269
    .line 270
    invoke-static {v11, v13, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/ModifierExtensionsKt;->conditional(Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    .line 271
    .line 272
    .line 273
    move-result-object v5

    .line 274
    const/4 v6, 0x0

    .line 275
    const/16 v9, 0x10

    .line 276
    .line 277
    move-object v8, v3

    .line 278
    move-object v3, v2

    .line 279
    move-object v2, v8

    .line 280
    move v8, v4

    .line 281
    move-object v4, v14

    .line 282
    invoke-static/range {v2 .. v9}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt;->StackComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;FLY/m;II)V

    .line 283
    .line 284
    .line 285
    invoke-static {}, LY/w;->L()Z

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    if-eqz v2, :cond_17

    .line 290
    .line 291
    invoke-static {}, LY/w;->T()V

    .line 292
    .line 293
    .line 294
    :cond_17
    move-object v4, v11

    .line 295
    :goto_c
    invoke-interface {v7}, LY/m;->k()LY/B1;

    .line 296
    .line 297
    .line 298
    move-result-object v7

    .line 299
    if-eqz v7, :cond_18

    .line 300
    .line 301
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/pkg/PackageComponentViewKt$PackageComponentView$3;

    .line 302
    .line 303
    move-object/from16 v2, p1

    .line 304
    .line 305
    move-object/from16 v3, p2

    .line 306
    .line 307
    move/from16 v6, p6

    .line 308
    .line 309
    move v5, v10

    .line 310
    invoke-direct/range {v0 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/pkg/PackageComponentViewKt$PackageComponentView$3;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/PackageComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;II)V

    .line 311
    .line 312
    .line 313
    invoke-interface {v7, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 314
    .line 315
    .line 316
    :cond_18
    return-void
.end method
