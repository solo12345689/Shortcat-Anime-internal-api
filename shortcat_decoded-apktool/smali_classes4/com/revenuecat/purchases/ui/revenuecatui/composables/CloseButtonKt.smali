.class public final Lcom/revenuecat/purchases/ui/revenuecatui/composables/CloseButtonKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a>\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u000c"
    }
    d2 = {
        "LC/c;",
        "",
        "shouldDisplayDismissButton",
        "Ls0/r0;",
        "color",
        "actionInProgress",
        "Lkotlin/Function0;",
        "LTd/L;",
        "onClick",
        "CloseButton-drOMvmE",
        "(LC/c;ZLs0/r0;ZLie/a;LY/m;I)V",
        "CloseButton",
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
.method public static final CloseButton-drOMvmE(LC/c;ZLs0/r0;ZLie/a;LY/m;I)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LC/c;",
            "Z",
            "Ls0/r0;",
            "Z",
            "Lie/a;",
            "LY/m;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move/from16 v4, p3

    .line 8
    .line 9
    move-object/from16 v5, p4

    .line 10
    .line 11
    move/from16 v0, p6

    .line 12
    .line 13
    const-string v6, "$this$CloseButton"

    .line 14
    .line 15
    invoke-static {v1, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v6, "onClick"

    .line 19
    .line 20
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const v6, -0x17a6357f

    .line 24
    .line 25
    .line 26
    move-object/from16 v7, p5

    .line 27
    .line 28
    invoke-interface {v7, v6}, LY/m;->g(I)LY/m;

    .line 29
    .line 30
    .line 31
    move-result-object v11

    .line 32
    and-int/lit8 v7, v0, 0x6

    .line 33
    .line 34
    if-nez v7, :cond_1

    .line 35
    .line 36
    invoke-interface {v11, v1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    if-eqz v7, :cond_0

    .line 41
    .line 42
    const/4 v7, 0x4

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 v7, 0x2

    .line 45
    :goto_0
    or-int/2addr v7, v0

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move v7, v0

    .line 48
    :goto_1
    and-int/lit8 v8, v0, 0x30

    .line 49
    .line 50
    if-nez v8, :cond_3

    .line 51
    .line 52
    invoke-interface {v11, v2}, LY/m;->a(Z)Z

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    if-eqz v8, :cond_2

    .line 57
    .line 58
    const/16 v8, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    const/16 v8, 0x10

    .line 62
    .line 63
    :goto_2
    or-int/2addr v7, v8

    .line 64
    :cond_3
    and-int/lit16 v8, v0, 0x180

    .line 65
    .line 66
    if-nez v8, :cond_5

    .line 67
    .line 68
    invoke-interface {v11, v3}, LY/m;->U(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    if-eqz v8, :cond_4

    .line 73
    .line 74
    const/16 v8, 0x100

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_4
    const/16 v8, 0x80

    .line 78
    .line 79
    :goto_3
    or-int/2addr v7, v8

    .line 80
    :cond_5
    and-int/lit16 v8, v0, 0xc00

    .line 81
    .line 82
    if-nez v8, :cond_7

    .line 83
    .line 84
    invoke-interface {v11, v4}, LY/m;->a(Z)Z

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    if-eqz v8, :cond_6

    .line 89
    .line 90
    const/16 v8, 0x800

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_6
    const/16 v8, 0x400

    .line 94
    .line 95
    :goto_4
    or-int/2addr v7, v8

    .line 96
    :cond_7
    and-int/lit16 v8, v0, 0x6000

    .line 97
    .line 98
    if-nez v8, :cond_9

    .line 99
    .line 100
    invoke-interface {v11, v5}, LY/m;->F(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    if-eqz v8, :cond_8

    .line 105
    .line 106
    const/16 v8, 0x4000

    .line 107
    .line 108
    goto :goto_5

    .line 109
    :cond_8
    const/16 v8, 0x2000

    .line 110
    .line 111
    :goto_5
    or-int/2addr v7, v8

    .line 112
    :cond_9
    and-int/lit16 v8, v7, 0x2493

    .line 113
    .line 114
    const/16 v9, 0x2492

    .line 115
    .line 116
    if-ne v8, v9, :cond_b

    .line 117
    .line 118
    invoke-interface {v11}, LY/m;->i()Z

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    if-nez v8, :cond_a

    .line 123
    .line 124
    goto :goto_6

    .line 125
    :cond_a
    invoke-interface {v11}, LY/m;->K()V

    .line 126
    .line 127
    .line 128
    goto/16 :goto_8

    .line 129
    .line 130
    :cond_b
    :goto_6
    invoke-static {}, LY/w;->L()Z

    .line 131
    .line 132
    .line 133
    move-result v8

    .line 134
    if-eqz v8, :cond_c

    .line 135
    .line 136
    const/4 v8, -0x1

    .line 137
    const-string v9, "com.revenuecat.purchases.ui.revenuecatui.composables.CloseButton (CloseButton.kt:20)"

    .line 138
    .line 139
    invoke-static {v6, v7, v8, v9}, LY/w;->U(IIILjava/lang/String;)V

    .line 140
    .line 141
    .line 142
    :cond_c
    if-eqz v2, :cond_11

    .line 143
    .line 144
    sget-object v6, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 145
    .line 146
    sget-object v8, Ll0/e;->a:Ll0/e$a;

    .line 147
    .line 148
    invoke-virtual {v8}, Ll0/e$a;->o()Ll0/e;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    invoke-interface {v1, v6, v9}, LC/c;->b(Landroidx/compose/ui/e;Ll0/e;)Landroidx/compose/ui/e;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    sget-object v9, LC/b;->a:LC/b;

    .line 157
    .line 158
    invoke-virtual {v9}, LC/b;->h()LC/b$m;

    .line 159
    .line 160
    .line 161
    move-result-object v9

    .line 162
    invoke-virtual {v8}, Ll0/e$a;->k()Ll0/e$b;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    const/4 v10, 0x0

    .line 167
    invoke-static {v9, v8, v11, v10}, LC/g;->a(LC/b$m;Ll0/e$b;LY/m;I)LI0/B;

    .line 168
    .line 169
    .line 170
    move-result-object v8

    .line 171
    invoke-static {v11, v10}, LY/h;->a(LY/m;I)I

    .line 172
    .line 173
    .line 174
    move-result v9

    .line 175
    invoke-interface {v11}, LY/m;->r()LY/I;

    .line 176
    .line 177
    .line 178
    move-result-object v12

    .line 179
    invoke-static {v11, v6}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    sget-object v13, LK0/g;->M:LK0/g$a;

    .line 184
    .line 185
    invoke-virtual {v13}, LK0/g$a;->a()Lie/a;

    .line 186
    .line 187
    .line 188
    move-result-object v14

    .line 189
    invoke-interface {v11}, LY/m;->j()LY/d;

    .line 190
    .line 191
    .line 192
    move-result-object v15

    .line 193
    if-nez v15, :cond_d

    .line 194
    .line 195
    invoke-static {}, LY/h;->d()V

    .line 196
    .line 197
    .line 198
    :cond_d
    invoke-interface {v11}, LY/m;->I()V

    .line 199
    .line 200
    .line 201
    invoke-interface {v11}, LY/m;->e()Z

    .line 202
    .line 203
    .line 204
    move-result v15

    .line 205
    if-eqz v15, :cond_e

    .line 206
    .line 207
    invoke-interface {v11, v14}, LY/m;->h(Lie/a;)V

    .line 208
    .line 209
    .line 210
    goto :goto_7

    .line 211
    :cond_e
    invoke-interface {v11}, LY/m;->s()V

    .line 212
    .line 213
    .line 214
    :goto_7
    invoke-static {v11}, LY/m2;->b(LY/m;)LY/m;

    .line 215
    .line 216
    .line 217
    move-result-object v14

    .line 218
    invoke-virtual {v13}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 219
    .line 220
    .line 221
    move-result-object v15

    .line 222
    invoke-static {v14, v8, v15}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v13}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 226
    .line 227
    .line 228
    move-result-object v8

    .line 229
    invoke-static {v14, v12, v8}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v13}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 233
    .line 234
    .line 235
    move-result-object v8

    .line 236
    invoke-interface {v14}, LY/m;->e()Z

    .line 237
    .line 238
    .line 239
    move-result v12

    .line 240
    if-nez v12, :cond_f

    .line 241
    .line 242
    invoke-interface {v14}, LY/m;->D()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v12

    .line 246
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 247
    .line 248
    .line 249
    move-result-object v15

    .line 250
    invoke-static {v12, v15}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v12

    .line 254
    if-nez v12, :cond_10

    .line 255
    .line 256
    :cond_f
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 257
    .line 258
    .line 259
    move-result-object v12

    .line 260
    invoke-interface {v14, v12}, LY/m;->u(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 264
    .line 265
    .line 266
    move-result-object v9

    .line 267
    invoke-interface {v14, v9, v8}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 268
    .line 269
    .line 270
    :cond_10
    invoke-virtual {v13}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 271
    .line 272
    .line 273
    move-result-object v8

    .line 274
    invoke-static {v14, v6, v8}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 275
    .line 276
    .line 277
    sget-object v6, LC/j;->a:LC/j;

    .line 278
    .line 279
    invoke-static {v11, v10}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/InsetSpacersKt;->StatusBarSpacer(LY/m;I)V

    .line 280
    .line 281
    .line 282
    move v6, v7

    .line 283
    xor-int/lit8 v7, v4, 0x1

    .line 284
    .line 285
    new-instance v8, Lcom/revenuecat/purchases/ui/revenuecatui/composables/CloseButtonKt$CloseButton$1$1;

    .line 286
    .line 287
    invoke-direct {v8, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/CloseButtonKt$CloseButton$1$1;-><init>(Ls0/r0;)V

    .line 288
    .line 289
    .line 290
    const/16 v9, 0x36

    .line 291
    .line 292
    const v10, 0xa2962d3

    .line 293
    .line 294
    .line 295
    const/4 v12, 0x1

    .line 296
    invoke-static {v10, v12, v8, v11, v9}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 297
    .line 298
    .line 299
    move-result-object v10

    .line 300
    shr-int/lit8 v6, v6, 0xc

    .line 301
    .line 302
    and-int/lit8 v6, v6, 0xe

    .line 303
    .line 304
    const/high16 v8, 0x30000

    .line 305
    .line 306
    or-int v12, v6, v8

    .line 307
    .line 308
    const/16 v13, 0x1a

    .line 309
    .line 310
    const/4 v6, 0x0

    .line 311
    const/4 v8, 0x0

    .line 312
    const/4 v9, 0x0

    .line 313
    invoke-static/range {v5 .. v13}, LU/A;->a(Lie/a;Landroidx/compose/ui/e;ZLU/y;LB/m;Lkotlin/jvm/functions/Function2;LY/m;II)V

    .line 314
    .line 315
    .line 316
    invoke-interface {v11}, LY/m;->x()V

    .line 317
    .line 318
    .line 319
    :cond_11
    invoke-static {}, LY/w;->L()Z

    .line 320
    .line 321
    .line 322
    move-result v5

    .line 323
    if-eqz v5, :cond_12

    .line 324
    .line 325
    invoke-static {}, LY/w;->T()V

    .line 326
    .line 327
    .line 328
    :cond_12
    :goto_8
    invoke-interface {v11}, LY/m;->k()LY/B1;

    .line 329
    .line 330
    .line 331
    move-result-object v7

    .line 332
    if-eqz v7, :cond_13

    .line 333
    .line 334
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/CloseButtonKt$CloseButton$2;

    .line 335
    .line 336
    move-object/from16 v5, p4

    .line 337
    .line 338
    move/from16 v6, p6

    .line 339
    .line 340
    invoke-direct/range {v0 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/CloseButtonKt$CloseButton$2;-><init>(LC/c;ZLs0/r0;ZLie/a;I)V

    .line 341
    .line 342
    .line 343
    invoke-interface {v7, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 344
    .line 345
    .line 346
    :cond_13
    return-void
.end method
