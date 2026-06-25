.class public final Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a*\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\\\u0010\u0011\u001a\u00020\u00052\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u001b\u00b2\u0006\u000e\u0010\u0013\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0015\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\u0016\u001a\u00020\u00028\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0017\u001a\u00020\u00028\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0018\u001a\u00020\u00028\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0019\u001a\u00020\u00028\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u001a\u001a\u00020\u00148\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$TierInfo;",
        "selectedTier",
        "Ls0/r0;",
        "backgroundSelectedColor",
        "foregroundSelectedColor",
        "LTd/L;",
        "SelectedTierView-1wkBAMs",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$TierInfo;JJLY/m;I)V",
        "SelectedTierView",
        "",
        "tiers",
        "Lkotlin/Function1;",
        "onTierSelected",
        "backgroundColor",
        "foregroundColor",
        "TierSwitcher-UFBoNtE",
        "(Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$TierInfo;Lkotlin/jvm/functions/Function1;JJJJLY/m;I)V",
        "TierSwitcher",
        "",
        "totalWidthPx",
        "Li1/h;",
        "totalHeightRowDp",
        "backgroundColorState",
        "backgroundSelectedColorState",
        "foregroundColorState",
        "foregroundSelectedColorState",
        "indicatorOffset",
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
.method public static final SelectedTierView-1wkBAMs(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$TierInfo;JJLY/m;I)V
    .locals 32

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-wide/from16 v2, p1

    .line 4
    .line 5
    move/from16 v6, p6

    .line 6
    .line 7
    const-string v0, "selectedTier"

    .line 8
    .line 9
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const v0, -0x1c4be024

    .line 13
    .line 14
    .line 15
    move-object/from16 v4, p5

    .line 16
    .line 17
    invoke-interface {v4, v0}, LY/m;->g(I)LY/m;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    and-int/lit8 v5, v6, 0x6

    .line 22
    .line 23
    if-nez v5, :cond_1

    .line 24
    .line 25
    invoke-interface {v4, v1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-eqz v5, :cond_0

    .line 30
    .line 31
    const/4 v5, 0x4

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v5, 0x2

    .line 34
    :goto_0
    or-int/2addr v5, v6

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v5, v6

    .line 37
    :goto_1
    and-int/lit8 v7, v6, 0x30

    .line 38
    .line 39
    if-nez v7, :cond_3

    .line 40
    .line 41
    invoke-interface {v4, v2, v3}, LY/m;->d(J)Z

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    if-eqz v7, :cond_2

    .line 46
    .line 47
    const/16 v7, 0x20

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/16 v7, 0x10

    .line 51
    .line 52
    :goto_2
    or-int/2addr v5, v7

    .line 53
    :cond_3
    and-int/lit16 v7, v6, 0x180

    .line 54
    .line 55
    move-wide/from16 v9, p3

    .line 56
    .line 57
    if-nez v7, :cond_5

    .line 58
    .line 59
    invoke-interface {v4, v9, v10}, LY/m;->d(J)Z

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    if-eqz v7, :cond_4

    .line 64
    .line 65
    const/16 v7, 0x100

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_4
    const/16 v7, 0x80

    .line 69
    .line 70
    :goto_3
    or-int/2addr v5, v7

    .line 71
    :cond_5
    and-int/lit16 v7, v5, 0x93

    .line 72
    .line 73
    const/16 v8, 0x92

    .line 74
    .line 75
    if-ne v7, v8, :cond_7

    .line 76
    .line 77
    invoke-interface {v4}, LY/m;->i()Z

    .line 78
    .line 79
    .line 80
    move-result v7

    .line 81
    if-nez v7, :cond_6

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_6
    invoke-interface {v4}, LY/m;->K()V

    .line 85
    .line 86
    .line 87
    move-object/from16 v28, v4

    .line 88
    .line 89
    goto/16 :goto_6

    .line 90
    .line 91
    :cond_7
    :goto_4
    invoke-static {}, LY/w;->L()Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-eqz v7, :cond_8

    .line 96
    .line 97
    const/4 v7, -0x1

    .line 98
    const-string v8, "com.revenuecat.purchases.ui.revenuecatui.composables.SelectedTierView (TierSwitcher.kt:52)"

    .line 99
    .line 100
    invoke-static {v0, v5, v7, v8}, LY/w;->U(IIILjava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :cond_8
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 104
    .line 105
    const/16 v7, 0x32

    .line 106
    .line 107
    invoke-static {v7}, LJ/i;->a(I)LJ/h;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    invoke-static {v0, v2, v3, v7}, Landroidx/compose/foundation/b;->c(Landroidx/compose/ui/e;JLs0/E1;)Landroidx/compose/ui/e;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    sget-object v7, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;

    .line 116
    .line 117
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;->getTierHorizontalPadding-D9Ej5fM()F

    .line 118
    .line 119
    .line 120
    move-result v8

    .line 121
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;->getTierVerticalPadding-D9Ej5fM()F

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    invoke-static {v0, v8, v7}, Landroidx/compose/foundation/layout/p;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    sget-object v7, Ll0/e;->a:Ll0/e$a;

    .line 130
    .line 131
    invoke-virtual {v7}, Ll0/e$a;->o()Ll0/e;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    const/4 v8, 0x0

    .line 136
    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    invoke-static {v4, v8}, LY/h;->a(LY/m;I)I

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    invoke-interface {v4}, LY/m;->r()LY/I;

    .line 145
    .line 146
    .line 147
    move-result-object v11

    .line 148
    invoke-static {v4, v0}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    sget-object v12, LK0/g;->M:LK0/g$a;

    .line 153
    .line 154
    invoke-virtual {v12}, LK0/g$a;->a()Lie/a;

    .line 155
    .line 156
    .line 157
    move-result-object v13

    .line 158
    invoke-interface {v4}, LY/m;->j()LY/d;

    .line 159
    .line 160
    .line 161
    move-result-object v14

    .line 162
    if-nez v14, :cond_9

    .line 163
    .line 164
    invoke-static {}, LY/h;->d()V

    .line 165
    .line 166
    .line 167
    :cond_9
    invoke-interface {v4}, LY/m;->I()V

    .line 168
    .line 169
    .line 170
    invoke-interface {v4}, LY/m;->e()Z

    .line 171
    .line 172
    .line 173
    move-result v14

    .line 174
    if-eqz v14, :cond_a

    .line 175
    .line 176
    invoke-interface {v4, v13}, LY/m;->h(Lie/a;)V

    .line 177
    .line 178
    .line 179
    goto :goto_5

    .line 180
    :cond_a
    invoke-interface {v4}, LY/m;->s()V

    .line 181
    .line 182
    .line 183
    :goto_5
    invoke-static {v4}, LY/m2;->b(LY/m;)LY/m;

    .line 184
    .line 185
    .line 186
    move-result-object v13

    .line 187
    invoke-virtual {v12}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 188
    .line 189
    .line 190
    move-result-object v14

    .line 191
    invoke-static {v13, v7, v14}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v12}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    invoke-static {v13, v11, v7}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v12}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 202
    .line 203
    .line 204
    move-result-object v7

    .line 205
    invoke-interface {v13}, LY/m;->e()Z

    .line 206
    .line 207
    .line 208
    move-result v11

    .line 209
    if-nez v11, :cond_b

    .line 210
    .line 211
    invoke-interface {v13}, LY/m;->D()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v11

    .line 215
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 216
    .line 217
    .line 218
    move-result-object v14

    .line 219
    invoke-static {v11, v14}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v11

    .line 223
    if-nez v11, :cond_c

    .line 224
    .line 225
    :cond_b
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 226
    .line 227
    .line 228
    move-result-object v11

    .line 229
    invoke-interface {v13, v11}, LY/m;->u(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object v8

    .line 236
    invoke-interface {v13, v8, v7}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 237
    .line 238
    .line 239
    :cond_c
    invoke-virtual {v12}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 240
    .line 241
    .line 242
    move-result-object v7

    .line 243
    invoke-static {v13, v0, v7}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 244
    .line 245
    .line 246
    sget-object v0, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 247
    .line 248
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$TierInfo;->getName()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v7

    .line 252
    sget-object v0, LU/D;->a:LU/D;

    .line 253
    .line 254
    sget v8, LU/D;->b:I

    .line 255
    .line 256
    invoke-virtual {v0, v4, v8}, LU/D;->c(LY/m;I)LU/o0;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-virtual {v0}, LU/o0;->c()LU0/Y0;

    .line 261
    .line 262
    .line 263
    move-result-object v27

    .line 264
    and-int/lit16 v0, v5, 0x380

    .line 265
    .line 266
    const/16 v30, 0x0

    .line 267
    .line 268
    const v31, 0xfffa

    .line 269
    .line 270
    .line 271
    const/4 v8, 0x0

    .line 272
    const-wide/16 v11, 0x0

    .line 273
    .line 274
    const/4 v13, 0x0

    .line 275
    const/4 v14, 0x0

    .line 276
    const/4 v15, 0x0

    .line 277
    const-wide/16 v16, 0x0

    .line 278
    .line 279
    const/16 v18, 0x0

    .line 280
    .line 281
    const/16 v19, 0x0

    .line 282
    .line 283
    const-wide/16 v20, 0x0

    .line 284
    .line 285
    const/16 v22, 0x0

    .line 286
    .line 287
    const/16 v23, 0x0

    .line 288
    .line 289
    const/16 v24, 0x0

    .line 290
    .line 291
    const/16 v25, 0x0

    .line 292
    .line 293
    const/16 v26, 0x0

    .line 294
    .line 295
    move/from16 v29, v0

    .line 296
    .line 297
    move-object/from16 v28, v4

    .line 298
    .line 299
    invoke-static/range {v7 .. v31}, LU/j0;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLY0/H;LY0/L;LY0/u;JLg1/k;Lg1/j;JIZIILkotlin/jvm/functions/Function1;LU0/Y0;LY/m;III)V

    .line 300
    .line 301
    .line 302
    invoke-interface/range {v28 .. v28}, LY/m;->x()V

    .line 303
    .line 304
    .line 305
    invoke-static {}, LY/w;->L()Z

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    if-eqz v0, :cond_d

    .line 310
    .line 311
    invoke-static {}, LY/w;->T()V

    .line 312
    .line 313
    .line 314
    :cond_d
    :goto_6
    invoke-interface/range {v28 .. v28}, LY/m;->k()LY/B1;

    .line 315
    .line 316
    .line 317
    move-result-object v7

    .line 318
    if-eqz v7, :cond_e

    .line 319
    .line 320
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherKt$SelectedTierView$2;

    .line 321
    .line 322
    move-wide/from16 v4, p3

    .line 323
    .line 324
    invoke-direct/range {v0 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherKt$SelectedTierView$2;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$TierInfo;JJI)V

    .line 325
    .line 326
    .line 327
    invoke-interface {v7, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 328
    .line 329
    .line 330
    :cond_e
    return-void
.end method

.method public static final TierSwitcher-UFBoNtE(Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$TierInfo;Lkotlin/jvm/functions/Function1;JJJJLY/m;I)V
    .locals 41
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$TierInfo;",
            ">;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$TierInfo;",
            "Lkotlin/jvm/functions/Function1;",
            "JJJJ",
            "LY/m;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move/from16 v12, p12

    .line 8
    .line 9
    const-string v0, "tiers"

    .line 10
    .line 11
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "selectedTier"

    .line 15
    .line 16
    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v0, "onTierSelected"

    .line 20
    .line 21
    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const v0, 0x3edf4622

    .line 25
    .line 26
    .line 27
    move-object/from16 v4, p11

    .line 28
    .line 29
    invoke-interface {v4, v0}, LY/m;->g(I)LY/m;

    .line 30
    .line 31
    .line 32
    move-result-object v9

    .line 33
    and-int/lit8 v4, v12, 0x6

    .line 34
    .line 35
    if-nez v4, :cond_1

    .line 36
    .line 37
    invoke-interface {v9, v1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_0

    .line 42
    .line 43
    const/4 v4, 0x4

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 v4, 0x2

    .line 46
    :goto_0
    or-int/2addr v4, v12

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move v4, v12

    .line 49
    :goto_1
    and-int/lit8 v5, v12, 0x30

    .line 50
    .line 51
    if-nez v5, :cond_3

    .line 52
    .line 53
    invoke-interface {v9, v2}, LY/m;->U(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_2

    .line 58
    .line 59
    const/16 v5, 0x20

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    const/16 v5, 0x10

    .line 63
    .line 64
    :goto_2
    or-int/2addr v4, v5

    .line 65
    :cond_3
    and-int/lit16 v5, v12, 0x180

    .line 66
    .line 67
    if-nez v5, :cond_5

    .line 68
    .line 69
    invoke-interface {v9, v3}, LY/m;->F(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-eqz v5, :cond_4

    .line 74
    .line 75
    const/16 v5, 0x100

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    const/16 v5, 0x80

    .line 79
    .line 80
    :goto_3
    or-int/2addr v4, v5

    .line 81
    :cond_5
    and-int/lit16 v5, v12, 0xc00

    .line 82
    .line 83
    if-nez v5, :cond_7

    .line 84
    .line 85
    move-wide/from16 v5, p3

    .line 86
    .line 87
    invoke-interface {v9, v5, v6}, LY/m;->d(J)Z

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    if-eqz v7, :cond_6

    .line 92
    .line 93
    const/16 v7, 0x800

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_6
    const/16 v7, 0x400

    .line 97
    .line 98
    :goto_4
    or-int/2addr v4, v7

    .line 99
    goto :goto_5

    .line 100
    :cond_7
    move-wide/from16 v5, p3

    .line 101
    .line 102
    :goto_5
    and-int/lit16 v7, v12, 0x6000

    .line 103
    .line 104
    if-nez v7, :cond_9

    .line 105
    .line 106
    move-wide/from16 v7, p5

    .line 107
    .line 108
    invoke-interface {v9, v7, v8}, LY/m;->d(J)Z

    .line 109
    .line 110
    .line 111
    move-result v10

    .line 112
    if-eqz v10, :cond_8

    .line 113
    .line 114
    const/16 v10, 0x4000

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_8
    const/16 v10, 0x2000

    .line 118
    .line 119
    :goto_6
    or-int/2addr v4, v10

    .line 120
    goto :goto_7

    .line 121
    :cond_9
    move-wide/from16 v7, p5

    .line 122
    .line 123
    :goto_7
    const/high16 v10, 0x30000

    .line 124
    .line 125
    and-int/2addr v10, v12

    .line 126
    if-nez v10, :cond_b

    .line 127
    .line 128
    move-wide/from16 v10, p7

    .line 129
    .line 130
    invoke-interface {v9, v10, v11}, LY/m;->d(J)Z

    .line 131
    .line 132
    .line 133
    move-result v15

    .line 134
    if-eqz v15, :cond_a

    .line 135
    .line 136
    const/high16 v15, 0x20000

    .line 137
    .line 138
    goto :goto_8

    .line 139
    :cond_a
    const/high16 v15, 0x10000

    .line 140
    .line 141
    :goto_8
    or-int/2addr v4, v15

    .line 142
    goto :goto_9

    .line 143
    :cond_b
    move-wide/from16 v10, p7

    .line 144
    .line 145
    :goto_9
    const/high16 v15, 0x180000

    .line 146
    .line 147
    and-int/2addr v15, v12

    .line 148
    if-nez v15, :cond_d

    .line 149
    .line 150
    move-wide/from16 v14, p9

    .line 151
    .line 152
    invoke-interface {v9, v14, v15}, LY/m;->d(J)Z

    .line 153
    .line 154
    .line 155
    move-result v16

    .line 156
    if-eqz v16, :cond_c

    .line 157
    .line 158
    const/high16 v16, 0x100000

    .line 159
    .line 160
    goto :goto_a

    .line 161
    :cond_c
    const/high16 v16, 0x80000

    .line 162
    .line 163
    :goto_a
    or-int v4, v4, v16

    .line 164
    .line 165
    goto :goto_b

    .line 166
    :cond_d
    move-wide/from16 v14, p9

    .line 167
    .line 168
    :goto_b
    const v16, 0x92493

    .line 169
    .line 170
    .line 171
    and-int v13, v4, v16

    .line 172
    .line 173
    const v0, 0x92492

    .line 174
    .line 175
    .line 176
    if-ne v13, v0, :cond_f

    .line 177
    .line 178
    invoke-interface {v9}, LY/m;->i()Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-nez v0, :cond_e

    .line 183
    .line 184
    goto :goto_c

    .line 185
    :cond_e
    invoke-interface {v9}, LY/m;->K()V

    .line 186
    .line 187
    .line 188
    goto/16 :goto_13

    .line 189
    .line 190
    :cond_f
    :goto_c
    invoke-static {}, LY/w;->L()Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-eqz v0, :cond_10

    .line 195
    .line 196
    const/4 v0, -0x1

    .line 197
    const-string v13, "com.revenuecat.purchases.ui.revenuecatui.composables.TierSwitcher (TierSwitcher.kt:82)"

    .line 198
    .line 199
    const v1, 0x3edf4622

    .line 200
    .line 201
    .line 202
    invoke-static {v1, v4, v0, v13}, LY/w;->U(IIILjava/lang/String;)V

    .line 203
    .line 204
    .line 205
    :cond_10
    invoke-interface/range {p0 .. p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    const v1, -0x61ab6dee

    .line 210
    .line 211
    .line 212
    invoke-interface {v9, v1}, LY/m;->V(I)V

    .line 213
    .line 214
    .line 215
    invoke-interface {v9}, LY/m;->D()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    sget-object v13, LY/m;->a:LY/m$a;

    .line 220
    .line 221
    move/from16 v16, v4

    .line 222
    .line 223
    invoke-virtual {v13}, LY/m$a;->a()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    const/4 v8, 0x0

    .line 228
    const/4 v7, 0x0

    .line 229
    if-ne v1, v4, :cond_11

    .line 230
    .line 231
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    const/4 v4, 0x2

    .line 236
    invoke-static {v1, v8, v4, v8}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-interface {v9, v1}, LY/m;->u(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    :cond_11
    check-cast v1, LY/C0;

    .line 244
    .line 245
    invoke-interface {v9}, LY/m;->O()V

    .line 246
    .line 247
    .line 248
    const v4, -0x61ab668a

    .line 249
    .line 250
    .line 251
    invoke-interface {v9, v4}, LY/m;->V(I)V

    .line 252
    .line 253
    .line 254
    invoke-interface {v9}, LY/m;->D()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    invoke-virtual {v13}, LY/m$a;->a()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v7

    .line 262
    if-ne v4, v7, :cond_12

    .line 263
    .line 264
    const/16 v4, 0x28

    .line 265
    .line 266
    int-to-float v4, v4

    .line 267
    invoke-static {v4}, Li1/h;->n(F)F

    .line 268
    .line 269
    .line 270
    move-result v4

    .line 271
    invoke-static {v4}, Li1/h;->h(F)Li1/h;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    const/4 v7, 0x2

    .line 276
    invoke-static {v4, v8, v7, v8}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 277
    .line 278
    .line 279
    move-result-object v4

    .line 280
    invoke-interface {v9, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    :cond_12
    check-cast v4, LY/C0;

    .line 284
    .line 285
    invoke-interface {v9}, LY/m;->O()V

    .line 286
    .line 287
    .line 288
    invoke-static {}, Landroidx/compose/ui/platform/w0;->e()LY/b1;

    .line 289
    .line 290
    .line 291
    move-result-object v7

    .line 292
    invoke-interface {v9, v7}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v7

    .line 296
    check-cast v7, Li1/d;

    .line 297
    .line 298
    sget-object v19, Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;

    .line 299
    .line 300
    invoke-virtual/range {v19 .. v19}, Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;->getDefaultColorAnimation()Lw/i;

    .line 301
    .line 302
    .line 303
    move-result-object v6

    .line 304
    shr-int/lit8 v5, v16, 0x9

    .line 305
    .line 306
    and-int/lit8 v5, v5, 0xe

    .line 307
    .line 308
    or-int/lit16 v5, v5, 0x180

    .line 309
    .line 310
    const/16 v11, 0x8

    .line 311
    .line 312
    move-object v10, v7

    .line 313
    const-string v7, "backgroundColor"

    .line 314
    .line 315
    move-object/from16 v20, v8

    .line 316
    .line 317
    const/4 v8, 0x0

    .line 318
    move-object/from16 v18, v13

    .line 319
    .line 320
    move/from16 v12, v16

    .line 321
    .line 322
    move-object/from16 v14, v20

    .line 323
    .line 324
    move-object/from16 v16, v4

    .line 325
    .line 326
    move-object v13, v10

    .line 327
    move v10, v5

    .line 328
    move-wide/from16 v4, p3

    .line 329
    .line 330
    invoke-static/range {v4 .. v11}, Lv/v;->a(JLw/i;Ljava/lang/String;Lkotlin/jvm/functions/Function1;LY/m;II)LY/h2;

    .line 331
    .line 332
    .line 333
    move-result-object v15

    .line 334
    invoke-virtual/range {v19 .. v19}, Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;->getDefaultColorAnimation()Lw/i;

    .line 335
    .line 336
    .line 337
    move-result-object v6

    .line 338
    shr-int/lit8 v4, v12, 0xc

    .line 339
    .line 340
    and-int/lit8 v4, v4, 0xe

    .line 341
    .line 342
    or-int/lit16 v10, v4, 0x180

    .line 343
    .line 344
    const-string v7, "backgroundSelectedColor"

    .line 345
    .line 346
    move-wide/from16 v4, p5

    .line 347
    .line 348
    invoke-static/range {v4 .. v11}, Lv/v;->a(JLw/i;Ljava/lang/String;Lkotlin/jvm/functions/Function1;LY/m;II)LY/h2;

    .line 349
    .line 350
    .line 351
    move-result-object v20

    .line 352
    invoke-virtual/range {v19 .. v19}, Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;->getDefaultColorAnimation()Lw/i;

    .line 353
    .line 354
    .line 355
    move-result-object v6

    .line 356
    shr-int/lit8 v4, v12, 0xf

    .line 357
    .line 358
    and-int/lit8 v4, v4, 0xe

    .line 359
    .line 360
    or-int/lit16 v10, v4, 0x180

    .line 361
    .line 362
    const-string v7, "foregroundColor"

    .line 363
    .line 364
    move-wide/from16 v4, p7

    .line 365
    .line 366
    invoke-static/range {v4 .. v11}, Lv/v;->a(JLw/i;Ljava/lang/String;Lkotlin/jvm/functions/Function1;LY/m;II)LY/h2;

    .line 367
    .line 368
    .line 369
    move-result-object v38

    .line 370
    invoke-virtual/range {v19 .. v19}, Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;->getDefaultColorAnimation()Lw/i;

    .line 371
    .line 372
    .line 373
    move-result-object v6

    .line 374
    shr-int/lit8 v4, v12, 0x12

    .line 375
    .line 376
    and-int/lit8 v4, v4, 0xe

    .line 377
    .line 378
    or-int/lit16 v10, v4, 0x180

    .line 379
    .line 380
    const-string v7, "foregroundSelectedColor"

    .line 381
    .line 382
    move-wide/from16 v4, p9

    .line 383
    .line 384
    invoke-static/range {v4 .. v11}, Lv/v;->a(JLw/i;Ljava/lang/String;Lkotlin/jvm/functions/Function1;LY/m;II)LY/h2;

    .line 385
    .line 386
    .line 387
    move-result-object v11

    .line 388
    sget-object v4, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 389
    .line 390
    const/16 v19, 0x32

    .line 391
    .line 392
    invoke-static/range {v19 .. v19}, LJ/i;->a(I)LJ/h;

    .line 393
    .line 394
    .line 395
    move-result-object v5

    .line 396
    invoke-static {v4, v5}, Lp0/g;->a(Landroidx/compose/ui/e;Ls0/E1;)Landroidx/compose/ui/e;

    .line 397
    .line 398
    .line 399
    move-result-object v21

    .line 400
    invoke-static {v15}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherKt;->TierSwitcher_UFBoNtE$lambda$7(LY/h2;)J

    .line 401
    .line 402
    .line 403
    move-result-wide v22

    .line 404
    const/16 v25, 0x2

    .line 405
    .line 406
    const/16 v26, 0x0

    .line 407
    .line 408
    const/16 v24, 0x0

    .line 409
    .line 410
    invoke-static/range {v21 .. v26}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLs0/E1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 411
    .line 412
    .line 413
    move-result-object v5

    .line 414
    const/4 v15, 0x0

    .line 415
    const/4 v6, 0x1

    .line 416
    invoke-static {v5, v15, v6, v14}, Landroidx/compose/foundation/layout/s;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 417
    .line 418
    .line 419
    move-result-object v5

    .line 420
    const v7, -0x61aad92b

    .line 421
    .line 422
    .line 423
    invoke-interface {v9, v7}, LY/m;->V(I)V

    .line 424
    .line 425
    .line 426
    invoke-interface {v9}, LY/m;->D()Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v7

    .line 430
    invoke-virtual/range {v18 .. v18}, LY/m$a;->a()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v8

    .line 434
    if-ne v7, v8, :cond_13

    .line 435
    .line 436
    new-instance v7, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherKt$TierSwitcher$1$1;

    .line 437
    .line 438
    invoke-direct {v7, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherKt$TierSwitcher$1$1;-><init>(LY/C0;)V

    .line 439
    .line 440
    .line 441
    invoke-interface {v9, v7}, LY/m;->u(Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    :cond_13
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 445
    .line 446
    invoke-interface {v9}, LY/m;->O()V

    .line 447
    .line 448
    .line 449
    invoke-static {v5, v7}, Landroidx/compose/ui/layout/p;->a(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    .line 450
    .line 451
    .line 452
    move-result-object v5

    .line 453
    sget-object v21, Ll0/e;->a:Ll0/e$a;

    .line 454
    .line 455
    invoke-virtual/range {v21 .. v21}, Ll0/e$a;->o()Ll0/e;

    .line 456
    .line 457
    .line 458
    move-result-object v7

    .line 459
    const/4 v8, 0x0

    .line 460
    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    .line 461
    .line 462
    .line 463
    move-result-object v7

    .line 464
    invoke-static {v9, v8}, LY/h;->a(LY/m;I)I

    .line 465
    .line 466
    .line 467
    move-result v10

    .line 468
    invoke-interface {v9}, LY/m;->r()LY/I;

    .line 469
    .line 470
    .line 471
    move-result-object v8

    .line 472
    invoke-static {v9, v5}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 473
    .line 474
    .line 475
    move-result-object v5

    .line 476
    sget-object v22, LK0/g;->M:LK0/g$a;

    .line 477
    .line 478
    invoke-virtual/range {v22 .. v22}, LK0/g$a;->a()Lie/a;

    .line 479
    .line 480
    .line 481
    move-result-object v6

    .line 482
    invoke-interface {v9}, LY/m;->j()LY/d;

    .line 483
    .line 484
    .line 485
    move-result-object v24

    .line 486
    if-nez v24, :cond_14

    .line 487
    .line 488
    invoke-static {}, LY/h;->d()V

    .line 489
    .line 490
    .line 491
    :cond_14
    invoke-interface {v9}, LY/m;->I()V

    .line 492
    .line 493
    .line 494
    invoke-interface {v9}, LY/m;->e()Z

    .line 495
    .line 496
    .line 497
    move-result v24

    .line 498
    if-eqz v24, :cond_15

    .line 499
    .line 500
    invoke-interface {v9, v6}, LY/m;->h(Lie/a;)V

    .line 501
    .line 502
    .line 503
    goto :goto_d

    .line 504
    :cond_15
    invoke-interface {v9}, LY/m;->s()V

    .line 505
    .line 506
    .line 507
    :goto_d
    invoke-static {v9}, LY/m2;->b(LY/m;)LY/m;

    .line 508
    .line 509
    .line 510
    move-result-object v6

    .line 511
    invoke-virtual/range {v22 .. v22}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 512
    .line 513
    .line 514
    move-result-object v14

    .line 515
    invoke-static {v6, v7, v14}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v22 .. v22}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 519
    .line 520
    .line 521
    move-result-object v7

    .line 522
    invoke-static {v6, v8, v7}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v22 .. v22}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 526
    .line 527
    .line 528
    move-result-object v7

    .line 529
    invoke-interface {v6}, LY/m;->e()Z

    .line 530
    .line 531
    .line 532
    move-result v8

    .line 533
    if-nez v8, :cond_16

    .line 534
    .line 535
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v8

    .line 539
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 540
    .line 541
    .line 542
    move-result-object v14

    .line 543
    invoke-static {v8, v14}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    move-result v8

    .line 547
    if-nez v8, :cond_17

    .line 548
    .line 549
    :cond_16
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 550
    .line 551
    .line 552
    move-result-object v8

    .line 553
    invoke-interface {v6, v8}, LY/m;->u(Ljava/lang/Object;)V

    .line 554
    .line 555
    .line 556
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 557
    .line 558
    .line 559
    move-result-object v8

    .line 560
    invoke-interface {v6, v8, v7}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 561
    .line 562
    .line 563
    :cond_17
    invoke-virtual/range {v22 .. v22}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 564
    .line 565
    .line 566
    move-result-object v7

    .line 567
    invoke-static {v6, v5, v7}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 568
    .line 569
    .line 570
    sget-object v5, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 571
    .line 572
    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherKt;->TierSwitcher_UFBoNtE$lambda$2(LY/C0;)I

    .line 573
    .line 574
    .line 575
    move-result v1

    .line 576
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    .line 577
    .line 578
    .line 579
    move-result v5

    .line 580
    div-int/2addr v1, v5

    .line 581
    invoke-interface {v13, v1}, Li1/d;->A(I)F

    .line 582
    .line 583
    .line 584
    move-result v1

    .line 585
    int-to-float v0, v0

    .line 586
    mul-float/2addr v1, v0

    .line 587
    invoke-static {v1}, Li1/h;->n(F)F

    .line 588
    .line 589
    .line 590
    move-result v0

    .line 591
    move-object v8, v9

    .line 592
    const/16 v9, 0x180

    .line 593
    .line 594
    const/16 v10, 0xa

    .line 595
    .line 596
    const/4 v5, 0x0

    .line 597
    const-string v6, "tier_switcher"

    .line 598
    .line 599
    const/4 v7, 0x0

    .line 600
    move-object v1, v4

    .line 601
    move v4, v0

    .line 602
    move-object v0, v1

    .line 603
    const/4 v1, 0x1

    .line 604
    invoke-static/range {v4 .. v10}, Lw/c;->c(FLw/i;Ljava/lang/String;Lkotlin/jvm/functions/Function1;LY/m;II)LY/h2;

    .line 605
    .line 606
    .line 607
    move-result-object v4

    .line 608
    move-object v9, v8

    .line 609
    invoke-static {v4}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherKt;->TierSwitcher_UFBoNtE$lambda$20$lambda$13(LY/h2;)F

    .line 610
    .line 611
    .line 612
    move-result v4

    .line 613
    const/4 v7, 0x2

    .line 614
    const/4 v14, 0x0

    .line 615
    invoke-static {v0, v4, v15, v7, v14}, Landroidx/compose/foundation/layout/n;->b(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 616
    .line 617
    .line 618
    move-result-object v4

    .line 619
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    .line 620
    .line 621
    .line 622
    move-result v5

    .line 623
    int-to-float v5, v5

    .line 624
    const/high16 v6, 0x3f800000    # 1.0f

    .line 625
    .line 626
    div-float/2addr v6, v5

    .line 627
    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/s;->g(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    .line 628
    .line 629
    .line 630
    move-result-object v4

    .line 631
    invoke-static/range {v16 .. v16}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherKt;->TierSwitcher_UFBoNtE$lambda$5(LY/C0;)F

    .line 632
    .line 633
    .line 634
    move-result v5

    .line 635
    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/s;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    .line 636
    .line 637
    .line 638
    move-result-object v4

    .line 639
    sget-object v5, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;

    .line 640
    .line 641
    invoke-virtual {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;->getSelectedTierPadding-D9Ej5fM()F

    .line 642
    .line 643
    .line 644
    move-result v6

    .line 645
    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/p;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    .line 646
    .line 647
    .line 648
    move-result-object v4

    .line 649
    invoke-static/range {v19 .. v19}, LJ/i;->a(I)LJ/h;

    .line 650
    .line 651
    .line 652
    move-result-object v6

    .line 653
    invoke-static {v4, v6}, Lp0/g;->a(Landroidx/compose/ui/e;Ls0/E1;)Landroidx/compose/ui/e;

    .line 654
    .line 655
    .line 656
    move-result-object v25

    .line 657
    invoke-static/range {v20 .. v20}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherKt;->TierSwitcher_UFBoNtE$lambda$8(LY/h2;)J

    .line 658
    .line 659
    .line 660
    move-result-wide v26

    .line 661
    const/16 v29, 0x2

    .line 662
    .line 663
    const/16 v30, 0x0

    .line 664
    .line 665
    const/16 v28, 0x0

    .line 666
    .line 667
    invoke-static/range {v25 .. v30}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLs0/E1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 668
    .line 669
    .line 670
    move-result-object v4

    .line 671
    const/4 v8, 0x0

    .line 672
    invoke-static {v4, v9, v8}, Landroidx/compose/foundation/layout/f;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 673
    .line 674
    .line 675
    invoke-virtual/range {v21 .. v21}, Ll0/e$a;->i()Ll0/e$c;

    .line 676
    .line 677
    .line 678
    move-result-object v4

    .line 679
    sget-object v6, LC/b;->a:LC/b;

    .line 680
    .line 681
    invoke-virtual {v6}, LC/b;->f()LC/b$f;

    .line 682
    .line 683
    .line 684
    move-result-object v6

    .line 685
    const v7, 0x4501d8f0

    .line 686
    .line 687
    .line 688
    invoke-interface {v9, v7}, LY/m;->V(I)V

    .line 689
    .line 690
    .line 691
    invoke-interface {v9, v13}, LY/m;->U(Ljava/lang/Object;)Z

    .line 692
    .line 693
    .line 694
    move-result v7

    .line 695
    invoke-interface {v9}, LY/m;->D()Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object v8

    .line 699
    if-nez v7, :cond_18

    .line 700
    .line 701
    invoke-virtual/range {v18 .. v18}, LY/m$a;->a()Ljava/lang/Object;

    .line 702
    .line 703
    .line 704
    move-result-object v7

    .line 705
    if-ne v8, v7, :cond_19

    .line 706
    .line 707
    :cond_18
    new-instance v8, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherKt$TierSwitcher$2$1$1;

    .line 708
    .line 709
    move-object/from16 v7, v16

    .line 710
    .line 711
    invoke-direct {v8, v13, v7}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherKt$TierSwitcher$2$1$1;-><init>(Li1/d;LY/C0;)V

    .line 712
    .line 713
    .line 714
    invoke-interface {v9, v8}, LY/m;->u(Ljava/lang/Object;)V

    .line 715
    .line 716
    .line 717
    :cond_19
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 718
    .line 719
    invoke-interface {v9}, LY/m;->O()V

    .line 720
    .line 721
    .line 722
    invoke-static {v0, v8}, Landroidx/compose/ui/layout/p;->a(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    .line 723
    .line 724
    .line 725
    move-result-object v0

    .line 726
    sget-object v7, LC/x;->b:LC/x;

    .line 727
    .line 728
    invoke-static {v0, v7}, Landroidx/compose/foundation/layout/k;->a(Landroidx/compose/ui/e;LC/x;)Landroidx/compose/ui/e;

    .line 729
    .line 730
    .line 731
    move-result-object v0

    .line 732
    invoke-virtual {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;->getMinimumHeight-D9Ej5fM()F

    .line 733
    .line 734
    .line 735
    move-result v5

    .line 736
    const/4 v7, 0x2

    .line 737
    const/4 v14, 0x0

    .line 738
    invoke-static {v0, v5, v15, v7, v14}, Landroidx/compose/foundation/layout/s;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    const/16 v5, 0x36

    .line 743
    .line 744
    invoke-static {v6, v4, v9, v5}, LC/G;->b(LC/b$e;Ll0/e$c;LY/m;I)LI0/B;

    .line 745
    .line 746
    .line 747
    move-result-object v4

    .line 748
    const/4 v8, 0x0

    .line 749
    invoke-static {v9, v8}, LY/h;->a(LY/m;I)I

    .line 750
    .line 751
    .line 752
    move-result v5

    .line 753
    invoke-interface {v9}, LY/m;->r()LY/I;

    .line 754
    .line 755
    .line 756
    move-result-object v6

    .line 757
    invoke-static {v9, v0}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 758
    .line 759
    .line 760
    move-result-object v0

    .line 761
    invoke-virtual/range {v22 .. v22}, LK0/g$a;->a()Lie/a;

    .line 762
    .line 763
    .line 764
    move-result-object v7

    .line 765
    invoke-interface {v9}, LY/m;->j()LY/d;

    .line 766
    .line 767
    .line 768
    move-result-object v8

    .line 769
    if-nez v8, :cond_1a

    .line 770
    .line 771
    invoke-static {}, LY/h;->d()V

    .line 772
    .line 773
    .line 774
    :cond_1a
    invoke-interface {v9}, LY/m;->I()V

    .line 775
    .line 776
    .line 777
    invoke-interface {v9}, LY/m;->e()Z

    .line 778
    .line 779
    .line 780
    move-result v8

    .line 781
    if-eqz v8, :cond_1b

    .line 782
    .line 783
    invoke-interface {v9, v7}, LY/m;->h(Lie/a;)V

    .line 784
    .line 785
    .line 786
    goto :goto_e

    .line 787
    :cond_1b
    invoke-interface {v9}, LY/m;->s()V

    .line 788
    .line 789
    .line 790
    :goto_e
    invoke-static {v9}, LY/m2;->b(LY/m;)LY/m;

    .line 791
    .line 792
    .line 793
    move-result-object v7

    .line 794
    invoke-virtual/range {v22 .. v22}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 795
    .line 796
    .line 797
    move-result-object v8

    .line 798
    invoke-static {v7, v4, v8}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 799
    .line 800
    .line 801
    invoke-virtual/range {v22 .. v22}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 802
    .line 803
    .line 804
    move-result-object v4

    .line 805
    invoke-static {v7, v6, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 806
    .line 807
    .line 808
    invoke-virtual/range {v22 .. v22}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 809
    .line 810
    .line 811
    move-result-object v4

    .line 812
    invoke-interface {v7}, LY/m;->e()Z

    .line 813
    .line 814
    .line 815
    move-result v6

    .line 816
    if-nez v6, :cond_1c

    .line 817
    .line 818
    invoke-interface {v7}, LY/m;->D()Ljava/lang/Object;

    .line 819
    .line 820
    .line 821
    move-result-object v6

    .line 822
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 823
    .line 824
    .line 825
    move-result-object v8

    .line 826
    invoke-static {v6, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 827
    .line 828
    .line 829
    move-result v6

    .line 830
    if-nez v6, :cond_1d

    .line 831
    .line 832
    :cond_1c
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 833
    .line 834
    .line 835
    move-result-object v6

    .line 836
    invoke-interface {v7, v6}, LY/m;->u(Ljava/lang/Object;)V

    .line 837
    .line 838
    .line 839
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 840
    .line 841
    .line 842
    move-result-object v5

    .line 843
    invoke-interface {v7, v5, v4}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 844
    .line 845
    .line 846
    :cond_1d
    invoke-virtual/range {v22 .. v22}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 847
    .line 848
    .line 849
    move-result-object v4

    .line 850
    invoke-static {v7, v0, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 851
    .line 852
    .line 853
    sget-object v16, LC/J;->a:LC/J;

    .line 854
    .line 855
    const v0, 0x28e53882

    .line 856
    .line 857
    .line 858
    invoke-interface {v9, v0}, LY/m;->V(I)V

    .line 859
    .line 860
    .line 861
    invoke-interface/range {p0 .. p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 862
    .line 863
    .line 864
    move-result-object v0

    .line 865
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 866
    .line 867
    .line 868
    move-result v4

    .line 869
    if-eqz v4, :cond_27

    .line 870
    .line 871
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 872
    .line 873
    .line 874
    move-result-object v4

    .line 875
    check-cast v4, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$TierInfo;

    .line 876
    .line 877
    sget-object v5, Ll0/e;->a:Ll0/e$a;

    .line 878
    .line 879
    invoke-virtual {v5}, Ll0/e$a;->e()Ll0/e;

    .line 880
    .line 881
    .line 882
    move-result-object v5

    .line 883
    sget-object v17, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 884
    .line 885
    const/16 v20, 0x2

    .line 886
    .line 887
    const/16 v21, 0x0

    .line 888
    .line 889
    const/high16 v18, 0x3f800000    # 1.0f

    .line 890
    .line 891
    const/16 v19, 0x0

    .line 892
    .line 893
    invoke-static/range {v16 .. v21}, LC/I;->b(LC/I;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 894
    .line 895
    .line 896
    move-result-object v6

    .line 897
    move-object/from16 v7, v16

    .line 898
    .line 899
    move-object/from16 v8, v17

    .line 900
    .line 901
    const/4 v14, 0x0

    .line 902
    invoke-static {v6, v15, v1, v14}, Landroidx/compose/foundation/layout/s;->d(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 903
    .line 904
    .line 905
    move-result-object v16

    .line 906
    const v6, -0x242aa9e8

    .line 907
    .line 908
    .line 909
    invoke-interface {v9, v6}, LY/m;->V(I)V

    .line 910
    .line 911
    .line 912
    invoke-interface {v9}, LY/m;->D()Ljava/lang/Object;

    .line 913
    .line 914
    .line 915
    move-result-object v6

    .line 916
    sget-object v10, LY/m;->a:LY/m$a;

    .line 917
    .line 918
    invoke-virtual {v10}, LY/m$a;->a()Ljava/lang/Object;

    .line 919
    .line 920
    .line 921
    move-result-object v13

    .line 922
    if-ne v6, v13, :cond_1e

    .line 923
    .line 924
    invoke-static {}, LB/l;->a()LB/m;

    .line 925
    .line 926
    .line 927
    move-result-object v6

    .line 928
    invoke-interface {v9, v6}, LY/m;->u(Ljava/lang/Object;)V

    .line 929
    .line 930
    .line 931
    :cond_1e
    move-object/from16 v17, v6

    .line 932
    .line 933
    check-cast v17, LB/m;

    .line 934
    .line 935
    invoke-interface {v9}, LY/m;->O()V

    .line 936
    .line 937
    .line 938
    const v6, -0x242aa163

    .line 939
    .line 940
    .line 941
    invoke-interface {v9, v6}, LY/m;->V(I)V

    .line 942
    .line 943
    .line 944
    and-int/lit16 v6, v12, 0x380

    .line 945
    .line 946
    const/16 v13, 0x100

    .line 947
    .line 948
    if-ne v6, v13, :cond_1f

    .line 949
    .line 950
    move v6, v1

    .line 951
    goto :goto_10

    .line 952
    :cond_1f
    const/4 v6, 0x0

    .line 953
    :goto_10
    invoke-interface {v9, v4}, LY/m;->U(Ljava/lang/Object;)Z

    .line 954
    .line 955
    .line 956
    move-result v18

    .line 957
    or-int v6, v6, v18

    .line 958
    .line 959
    invoke-interface {v9}, LY/m;->D()Ljava/lang/Object;

    .line 960
    .line 961
    .line 962
    move-result-object v1

    .line 963
    if-nez v6, :cond_20

    .line 964
    .line 965
    invoke-virtual {v10}, LY/m$a;->a()Ljava/lang/Object;

    .line 966
    .line 967
    .line 968
    move-result-object v6

    .line 969
    if-ne v1, v6, :cond_21

    .line 970
    .line 971
    :cond_20
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherKt$TierSwitcher$2$2$1$2$1;

    .line 972
    .line 973
    invoke-direct {v1, v3, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherKt$TierSwitcher$2$2$1$2$1;-><init>(Lkotlin/jvm/functions/Function1;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$TierInfo;)V

    .line 974
    .line 975
    .line 976
    invoke-interface {v9, v1}, LY/m;->u(Ljava/lang/Object;)V

    .line 977
    .line 978
    .line 979
    :cond_21
    move-object/from16 v22, v1

    .line 980
    .line 981
    check-cast v22, Lie/a;

    .line 982
    .line 983
    invoke-interface {v9}, LY/m;->O()V

    .line 984
    .line 985
    .line 986
    const/16 v23, 0x1c

    .line 987
    .line 988
    const/16 v24, 0x0

    .line 989
    .line 990
    const/16 v18, 0x0

    .line 991
    .line 992
    const/16 v19, 0x0

    .line 993
    .line 994
    const/16 v20, 0x0

    .line 995
    .line 996
    const/16 v21, 0x0

    .line 997
    .line 998
    invoke-static/range {v16 .. v24}, Landroidx/compose/foundation/d;->b(Landroidx/compose/ui/e;LB/m;Lx/G;ZLjava/lang/String;LR0/h;Lie/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 999
    .line 1000
    .line 1001
    move-result-object v1

    .line 1002
    const/4 v6, 0x0

    .line 1003
    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v5

    .line 1007
    invoke-static {v9, v6}, LY/h;->a(LY/m;I)I

    .line 1008
    .line 1009
    .line 1010
    move-result v10

    .line 1011
    invoke-interface {v9}, LY/m;->r()LY/I;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v6

    .line 1015
    invoke-static {v9, v1}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v1

    .line 1019
    sget-object v16, LK0/g;->M:LK0/g$a;

    .line 1020
    .line 1021
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->a()Lie/a;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v13

    .line 1025
    invoke-interface {v9}, LY/m;->j()LY/d;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v18

    .line 1029
    if-nez v18, :cond_22

    .line 1030
    .line 1031
    invoke-static {}, LY/h;->d()V

    .line 1032
    .line 1033
    .line 1034
    :cond_22
    invoke-interface {v9}, LY/m;->I()V

    .line 1035
    .line 1036
    .line 1037
    invoke-interface {v9}, LY/m;->e()Z

    .line 1038
    .line 1039
    .line 1040
    move-result v18

    .line 1041
    if-eqz v18, :cond_23

    .line 1042
    .line 1043
    invoke-interface {v9, v13}, LY/m;->h(Lie/a;)V

    .line 1044
    .line 1045
    .line 1046
    goto :goto_11

    .line 1047
    :cond_23
    invoke-interface {v9}, LY/m;->s()V

    .line 1048
    .line 1049
    .line 1050
    :goto_11
    invoke-static {v9}, LY/m2;->b(LY/m;)LY/m;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v13

    .line 1054
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v14

    .line 1058
    invoke-static {v13, v5, v14}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1059
    .line 1060
    .line 1061
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v5

    .line 1065
    invoke-static {v13, v6, v5}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v5

    .line 1072
    invoke-interface {v13}, LY/m;->e()Z

    .line 1073
    .line 1074
    .line 1075
    move-result v6

    .line 1076
    if-nez v6, :cond_24

    .line 1077
    .line 1078
    invoke-interface {v13}, LY/m;->D()Ljava/lang/Object;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v6

    .line 1082
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v14

    .line 1086
    invoke-static {v6, v14}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1087
    .line 1088
    .line 1089
    move-result v6

    .line 1090
    if-nez v6, :cond_25

    .line 1091
    .line 1092
    :cond_24
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v6

    .line 1096
    invoke-interface {v13, v6}, LY/m;->u(Ljava/lang/Object;)V

    .line 1097
    .line 1098
    .line 1099
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v6

    .line 1103
    invoke-interface {v13, v6, v5}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1104
    .line 1105
    .line 1106
    :cond_25
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v5

    .line 1110
    invoke-static {v13, v1, v5}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1111
    .line 1112
    .line 1113
    sget-object v1, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 1114
    .line 1115
    invoke-virtual {v4}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$TierInfo;->getName()Ljava/lang/String;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v13

    .line 1119
    sget-object v1, LU/D;->a:LU/D;

    .line 1120
    .line 1121
    sget v5, LU/D;->b:I

    .line 1122
    .line 1123
    invoke-virtual {v1, v9, v5}, LU/D;->c(LY/m;I)LU/o0;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v1

    .line 1127
    invoke-virtual {v1}, LU/o0;->c()LU0/Y0;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v33

    .line 1131
    sget-object v1, Lg1/j;->b:Lg1/j$a;

    .line 1132
    .line 1133
    invoke-virtual {v1}, Lg1/j$a;->a()I

    .line 1134
    .line 1135
    .line 1136
    move-result v1

    .line 1137
    sget-object v5, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;

    .line 1138
    .line 1139
    invoke-virtual {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;->getTierTextPaddingHorizontal-D9Ej5fM()F

    .line 1140
    .line 1141
    .line 1142
    move-result v6

    .line 1143
    invoke-virtual {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;->getTierTextPaddingVertical-D9Ej5fM()F

    .line 1144
    .line 1145
    .line 1146
    move-result v5

    .line 1147
    invoke-static {v8, v6, v5}, Landroidx/compose/foundation/layout/p;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v14

    .line 1151
    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1152
    .line 1153
    .line 1154
    move-result v4

    .line 1155
    if-eqz v4, :cond_26

    .line 1156
    .line 1157
    invoke-static {v11}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherKt;->TierSwitcher_UFBoNtE$lambda$10(LY/h2;)J

    .line 1158
    .line 1159
    .line 1160
    move-result-wide v4

    .line 1161
    goto :goto_12

    .line 1162
    :cond_26
    invoke-static/range {v38 .. v38}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherKt;->TierSwitcher_UFBoNtE$lambda$9(LY/h2;)J

    .line 1163
    .line 1164
    .line 1165
    move-result-wide v4

    .line 1166
    :goto_12
    invoke-static {v1}, Lg1/j;->h(I)Lg1/j;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v25

    .line 1170
    const/16 v36, 0x0

    .line 1171
    .line 1172
    const v37, 0xfdf8

    .line 1173
    .line 1174
    .line 1175
    const/16 v1, 0x100

    .line 1176
    .line 1177
    const-wide/16 v17, 0x0

    .line 1178
    .line 1179
    const/16 v19, 0x0

    .line 1180
    .line 1181
    const/16 v24, 0x0

    .line 1182
    .line 1183
    const/16 v20, 0x0

    .line 1184
    .line 1185
    const/16 v21, 0x0

    .line 1186
    .line 1187
    const-wide/16 v22, 0x0

    .line 1188
    .line 1189
    move-object/from16 v6, v24

    .line 1190
    .line 1191
    const/16 v24, 0x0

    .line 1192
    .line 1193
    const-wide/16 v26, 0x0

    .line 1194
    .line 1195
    const/16 v28, 0x0

    .line 1196
    .line 1197
    const/16 v29, 0x0

    .line 1198
    .line 1199
    const/16 v30, 0x0

    .line 1200
    .line 1201
    const/16 v31, 0x0

    .line 1202
    .line 1203
    const/16 v32, 0x0

    .line 1204
    .line 1205
    const/16 v35, 0x30

    .line 1206
    .line 1207
    move-wide/from16 v39, v4

    .line 1208
    .line 1209
    move v4, v15

    .line 1210
    move-wide/from16 v15, v39

    .line 1211
    .line 1212
    move-object/from16 v34, v9

    .line 1213
    .line 1214
    invoke-static/range {v13 .. v37}, LU/j0;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLY0/H;LY0/L;LY0/u;JLg1/k;Lg1/j;JIZIILkotlin/jvm/functions/Function1;LU0/Y0;LY/m;III)V

    .line 1215
    .line 1216
    .line 1217
    invoke-interface {v9}, LY/m;->x()V

    .line 1218
    .line 1219
    .line 1220
    move v15, v4

    .line 1221
    move-object/from16 v16, v7

    .line 1222
    .line 1223
    const/4 v1, 0x1

    .line 1224
    goto/16 :goto_f

    .line 1225
    .line 1226
    :cond_27
    invoke-interface {v9}, LY/m;->O()V

    .line 1227
    .line 1228
    .line 1229
    invoke-interface {v9}, LY/m;->x()V

    .line 1230
    .line 1231
    .line 1232
    invoke-interface {v9}, LY/m;->x()V

    .line 1233
    .line 1234
    .line 1235
    invoke-static {}, LY/w;->L()Z

    .line 1236
    .line 1237
    .line 1238
    move-result v0

    .line 1239
    if-eqz v0, :cond_28

    .line 1240
    .line 1241
    invoke-static {}, LY/w;->T()V

    .line 1242
    .line 1243
    .line 1244
    :cond_28
    :goto_13
    invoke-interface {v9}, LY/m;->k()LY/B1;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v13

    .line 1248
    if-eqz v13, :cond_29

    .line 1249
    .line 1250
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherKt$TierSwitcher$3;

    .line 1251
    .line 1252
    move-object/from16 v1, p0

    .line 1253
    .line 1254
    move-wide/from16 v4, p3

    .line 1255
    .line 1256
    move-wide/from16 v6, p5

    .line 1257
    .line 1258
    move-wide/from16 v8, p7

    .line 1259
    .line 1260
    move-wide/from16 v10, p9

    .line 1261
    .line 1262
    move/from16 v12, p12

    .line 1263
    .line 1264
    invoke-direct/range {v0 .. v12}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherKt$TierSwitcher$3;-><init>(Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$TierInfo;Lkotlin/jvm/functions/Function1;JJJJI)V

    .line 1265
    .line 1266
    .line 1267
    invoke-interface {v13, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 1268
    .line 1269
    .line 1270
    :cond_29
    return-void
.end method

.method private static final TierSwitcher_UFBoNtE$lambda$10(LY/h2;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/h2;",
            ")J"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ls0/r0;

    .line 6
    .line 7
    invoke-virtual {p0}, Ls0/r0;->A()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
.end method

.method private static final TierSwitcher_UFBoNtE$lambda$2(LY/C0;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/C0;",
            ")I"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static final TierSwitcher_UFBoNtE$lambda$20$lambda$13(LY/h2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/h2;",
            ")F"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Li1/h;

    .line 6
    .line 7
    invoke-virtual {p0}, Li1/h;->t()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static final TierSwitcher_UFBoNtE$lambda$3(LY/C0;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/C0;",
            "I)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private static final TierSwitcher_UFBoNtE$lambda$5(LY/C0;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/C0;",
            ")F"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Li1/h;

    .line 6
    .line 7
    invoke-virtual {p0}, Li1/h;->t()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static final TierSwitcher_UFBoNtE$lambda$6(LY/C0;F)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/C0;",
            "F)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Li1/h;->h(F)Li1/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private static final TierSwitcher_UFBoNtE$lambda$7(LY/h2;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/h2;",
            ")J"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ls0/r0;

    .line 6
    .line 7
    invoke-virtual {p0}, Ls0/r0;->A()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
.end method

.method private static final TierSwitcher_UFBoNtE$lambda$8(LY/h2;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/h2;",
            ")J"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ls0/r0;

    .line 6
    .line 7
    invoke-virtual {p0}, Ls0/r0;->A()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
.end method

.method private static final TierSwitcher_UFBoNtE$lambda$9(LY/h2;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/h2;",
            ")J"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ls0/r0;

    .line 6
    .line 7
    invoke-virtual {p0}, Ls0/r0;->A()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
.end method

.method public static final synthetic access$TierSwitcher_UFBoNtE$lambda$3(LY/C0;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherKt;->TierSwitcher_UFBoNtE$lambda$3(LY/C0;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$TierSwitcher_UFBoNtE$lambda$6(LY/C0;F)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherKt;->TierSwitcher_UFBoNtE$lambda$6(LY/C0;F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
