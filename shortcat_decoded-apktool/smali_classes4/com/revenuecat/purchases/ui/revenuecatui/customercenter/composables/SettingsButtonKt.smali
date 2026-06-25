.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u001aA\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a*\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a\u000f\u0010\u0014\u001a\u00020\u0003H\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u0003H\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0015\u001a\u000f\u0010\u0017\u001a\u00020\u0003H\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0015\u001a\u000f\u0010\u0018\u001a\u00020\u0003H\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0015\u001a\u000f\u0010\u0019\u001a\u00020\u0003H\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0015\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u001a"
    }
    d2 = {
        "",
        "title",
        "Lkotlin/Function0;",
        "LTd/L;",
        "onClick",
        "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;",
        "config",
        "Landroidx/compose/ui/e;",
        "modifier",
        "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonStyle;",
        "style",
        "SettingsButton",
        "(Ljava/lang/String;Lie/a;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonStyle;LY/m;II)V",
        "",
        "loading",
        "Ls0/r0;",
        "loadingColor",
        "ButtonContent-XO-JAsU",
        "(Ljava/lang/String;ZJLY/m;I)V",
        "ButtonContent",
        "SettingsButton_Preview",
        "(LY/m;I)V",
        "SettingsButtonOutlined_Preview",
        "SettingsButtonLoading_Preview",
        "SettingsButtonOutlinedLoading_Preview",
        "SettingsButtonDisabled_Preview",
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
.method private static final ButtonContent-XO-JAsU(Ljava/lang/String;ZJLY/m;I)V
    .locals 46

    .line 1
    move/from16 v2, p1

    .line 2
    .line 3
    move/from16 v5, p5

    .line 4
    .line 5
    const v0, 0x1cd51422

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p4

    .line 9
    .line 10
    invoke-interface {v1, v0}, LY/m;->g(I)LY/m;

    .line 11
    .line 12
    .line 13
    move-result-object v13

    .line 14
    and-int/lit8 v1, v5, 0x6

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    move-object/from16 v1, p0

    .line 20
    .line 21
    invoke-interface {v13, v1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    const/4 v4, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v4, v3

    .line 30
    :goto_0
    or-int/2addr v4, v5

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move-object/from16 v1, p0

    .line 33
    .line 34
    move v4, v5

    .line 35
    :goto_1
    and-int/lit8 v6, v5, 0x30

    .line 36
    .line 37
    if-nez v6, :cond_3

    .line 38
    .line 39
    invoke-interface {v13, v2}, LY/m;->a(Z)Z

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-eqz v6, :cond_2

    .line 44
    .line 45
    const/16 v6, 0x20

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v6, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr v4, v6

    .line 51
    :cond_3
    and-int/lit16 v6, v5, 0x180

    .line 52
    .line 53
    move-wide/from16 v7, p2

    .line 54
    .line 55
    if-nez v6, :cond_5

    .line 56
    .line 57
    invoke-interface {v13, v7, v8}, LY/m;->d(J)Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-eqz v6, :cond_4

    .line 62
    .line 63
    const/16 v6, 0x100

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_4
    const/16 v6, 0x80

    .line 67
    .line 68
    :goto_3
    or-int/2addr v4, v6

    .line 69
    :cond_5
    and-int/lit16 v6, v4, 0x93

    .line 70
    .line 71
    const/16 v9, 0x92

    .line 72
    .line 73
    if-ne v6, v9, :cond_7

    .line 74
    .line 75
    invoke-interface {v13}, LY/m;->i()Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-nez v6, :cond_6

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_6
    invoke-interface {v13}, LY/m;->K()V

    .line 83
    .line 84
    .line 85
    move-object/from16 v27, v13

    .line 86
    .line 87
    goto/16 :goto_6

    .line 88
    .line 89
    :cond_7
    :goto_4
    invoke-static {}, LY/w;->L()Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-eqz v6, :cond_8

    .line 94
    .line 95
    const/4 v6, -0x1

    .line 96
    const-string v9, "com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.ButtonContent (SettingsButton.kt:85)"

    .line 97
    .line 98
    invoke-static {v0, v4, v6, v9}, LY/w;->U(IIILjava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :cond_8
    if-eqz v2, :cond_9

    .line 102
    .line 103
    const v0, -0x385aaeae

    .line 104
    .line 105
    .line 106
    invoke-interface {v13, v0}, LY/m;->V(I)V

    .line 107
    .line 108
    .line 109
    int-to-float v0, v3

    .line 110
    invoke-static {v0}, Li1/h;->n(F)F

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 115
    .line 116
    const/16 v3, 0x14

    .line 117
    .line 118
    int-to-float v3, v3

    .line 119
    invoke-static {v3}, Li1/h;->n(F)F

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/s;->r(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    shr-int/lit8 v0, v4, 0x3

    .line 128
    .line 129
    and-int/lit8 v0, v0, 0x70

    .line 130
    .line 131
    or-int/lit16 v14, v0, 0x186

    .line 132
    .line 133
    const/16 v15, 0x18

    .line 134
    .line 135
    const-wide/16 v10, 0x0

    .line 136
    .line 137
    const/4 v12, 0x0

    .line 138
    invoke-static/range {v6 .. v15}, LU/K;->a(Landroidx/compose/ui/e;JFJILY/m;II)V

    .line 139
    .line 140
    .line 141
    invoke-interface {v13}, LY/m;->O()V

    .line 142
    .line 143
    .line 144
    move-object/from16 v27, v13

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_9
    const v0, -0x38581da0    # -85956.75f

    .line 148
    .line 149
    .line 150
    invoke-interface {v13, v0}, LY/m;->V(I)V

    .line 151
    .line 152
    .line 153
    sget-object v0, LU/D;->a:LU/D;

    .line 154
    .line 155
    sget v3, LU/D;->b:I

    .line 156
    .line 157
    invoke-virtual {v0, v13, v3}, LU/D;->c(LY/m;I)LU/o0;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {v0}, LU/o0;->b()LU0/Y0;

    .line 162
    .line 163
    .line 164
    move-result-object v14

    .line 165
    sget-object v0, LY0/L;->b:LY0/L$a;

    .line 166
    .line 167
    invoke-virtual {v0}, LY0/L$a;->f()LY0/L;

    .line 168
    .line 169
    .line 170
    move-result-object v19

    .line 171
    const v44, 0xfffffb

    .line 172
    .line 173
    .line 174
    const/16 v45, 0x0

    .line 175
    .line 176
    const-wide/16 v15, 0x0

    .line 177
    .line 178
    const-wide/16 v17, 0x0

    .line 179
    .line 180
    const/16 v20, 0x0

    .line 181
    .line 182
    const/16 v21, 0x0

    .line 183
    .line 184
    const/16 v22, 0x0

    .line 185
    .line 186
    const/16 v23, 0x0

    .line 187
    .line 188
    const-wide/16 v24, 0x0

    .line 189
    .line 190
    const/16 v26, 0x0

    .line 191
    .line 192
    const/16 v27, 0x0

    .line 193
    .line 194
    const/16 v28, 0x0

    .line 195
    .line 196
    const-wide/16 v29, 0x0

    .line 197
    .line 198
    const/16 v31, 0x0

    .line 199
    .line 200
    const/16 v32, 0x0

    .line 201
    .line 202
    const/16 v33, 0x0

    .line 203
    .line 204
    const/16 v34, 0x0

    .line 205
    .line 206
    const/16 v35, 0x0

    .line 207
    .line 208
    const-wide/16 v36, 0x0

    .line 209
    .line 210
    const/16 v38, 0x0

    .line 211
    .line 212
    const/16 v39, 0x0

    .line 213
    .line 214
    const/16 v40, 0x0

    .line 215
    .line 216
    const/16 v41, 0x0

    .line 217
    .line 218
    const/16 v42, 0x0

    .line 219
    .line 220
    const/16 v43, 0x0

    .line 221
    .line 222
    invoke-static/range {v14 .. v45}, LU0/Y0;->e(LU0/Y0;JJLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;Lu0/g;IIJLg1/s;LU0/G;Lg1/h;IILg1/u;ILjava/lang/Object;)LU0/Y0;

    .line 223
    .line 224
    .line 225
    move-result-object v26

    .line 226
    and-int/lit8 v28, v4, 0xe

    .line 227
    .line 228
    const/16 v29, 0x0

    .line 229
    .line 230
    const v30, 0xfffe

    .line 231
    .line 232
    .line 233
    const/4 v7, 0x0

    .line 234
    const-wide/16 v8, 0x0

    .line 235
    .line 236
    const-wide/16 v10, 0x0

    .line 237
    .line 238
    const/4 v12, 0x0

    .line 239
    move-object/from16 v27, v13

    .line 240
    .line 241
    const/4 v13, 0x0

    .line 242
    const/4 v14, 0x0

    .line 243
    const/16 v17, 0x0

    .line 244
    .line 245
    const/16 v18, 0x0

    .line 246
    .line 247
    const-wide/16 v19, 0x0

    .line 248
    .line 249
    const/16 v21, 0x0

    .line 250
    .line 251
    const/16 v22, 0x0

    .line 252
    .line 253
    const/16 v23, 0x0

    .line 254
    .line 255
    const/16 v24, 0x0

    .line 256
    .line 257
    const/16 v25, 0x0

    .line 258
    .line 259
    move-object v6, v1

    .line 260
    invoke-static/range {v6 .. v30}, LU/j0;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLY0/H;LY0/L;LY0/u;JLg1/k;Lg1/j;JIZIILkotlin/jvm/functions/Function1;LU0/Y0;LY/m;III)V

    .line 261
    .line 262
    .line 263
    invoke-interface/range {v27 .. v27}, LY/m;->O()V

    .line 264
    .line 265
    .line 266
    :goto_5
    invoke-static {}, LY/w;->L()Z

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    if-eqz v0, :cond_a

    .line 271
    .line 272
    invoke-static {}, LY/w;->T()V

    .line 273
    .line 274
    .line 275
    :cond_a
    :goto_6
    invoke-interface/range {v27 .. v27}, LY/m;->k()LY/B1;

    .line 276
    .line 277
    .line 278
    move-result-object v6

    .line 279
    if-eqz v6, :cond_b

    .line 280
    .line 281
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt$ButtonContent$1;

    .line 282
    .line 283
    move-object/from16 v1, p0

    .line 284
    .line 285
    move-wide/from16 v3, p2

    .line 286
    .line 287
    invoke-direct/range {v0 .. v5}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt$ButtonContent$1;-><init>(Ljava/lang/String;ZJI)V

    .line 288
    .line 289
    .line 290
    invoke-interface {v6, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 291
    .line 292
    .line 293
    :cond_b
    return-void
.end method

.method public static final synthetic SettingsButton(Ljava/lang/String;Lie/a;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonStyle;LY/m;II)V
    .locals 30

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
    move/from16 v15, p6

    .line 8
    .line 9
    const-string v3, "title"

    .line 10
    .line 11
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v3, "onClick"

    .line 15
    .line 16
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v3, "config"

    .line 20
    .line 21
    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const v3, 0x6cd698a1

    .line 25
    .line 26
    .line 27
    move-object/from16 v4, p5

    .line 28
    .line 29
    invoke-interface {v4, v3}, LY/m;->g(I)LY/m;

    .line 30
    .line 31
    .line 32
    move-result-object v12

    .line 33
    and-int/lit8 v4, p7, 0x1

    .line 34
    .line 35
    const/4 v5, 0x2

    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    or-int/lit8 v4, v15, 0x6

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    and-int/lit8 v4, v15, 0x6

    .line 42
    .line 43
    if-nez v4, :cond_2

    .line 44
    .line 45
    invoke-interface {v12, v1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_1

    .line 50
    .line 51
    const/4 v4, 0x4

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    move v4, v5

    .line 54
    :goto_0
    or-int/2addr v4, v15

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    move v4, v15

    .line 57
    :goto_1
    and-int/lit8 v6, p7, 0x2

    .line 58
    .line 59
    if-eqz v6, :cond_3

    .line 60
    .line 61
    or-int/lit8 v4, v4, 0x30

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_3
    and-int/lit8 v6, v15, 0x30

    .line 65
    .line 66
    if-nez v6, :cond_5

    .line 67
    .line 68
    invoke-interface {v12, v2}, LY/m;->F(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    if-eqz v6, :cond_4

    .line 73
    .line 74
    const/16 v6, 0x20

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    const/16 v6, 0x10

    .line 78
    .line 79
    :goto_2
    or-int/2addr v4, v6

    .line 80
    :cond_5
    :goto_3
    and-int/lit8 v6, p7, 0x4

    .line 81
    .line 82
    if-eqz v6, :cond_6

    .line 83
    .line 84
    or-int/lit16 v4, v4, 0x180

    .line 85
    .line 86
    goto :goto_5

    .line 87
    :cond_6
    and-int/lit16 v6, v15, 0x180

    .line 88
    .line 89
    if-nez v6, :cond_8

    .line 90
    .line 91
    invoke-interface {v12, v0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    if-eqz v6, :cond_7

    .line 96
    .line 97
    const/16 v6, 0x100

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_7
    const/16 v6, 0x80

    .line 101
    .line 102
    :goto_4
    or-int/2addr v4, v6

    .line 103
    :cond_8
    :goto_5
    and-int/lit8 v6, p7, 0x8

    .line 104
    .line 105
    if-eqz v6, :cond_a

    .line 106
    .line 107
    or-int/lit16 v4, v4, 0xc00

    .line 108
    .line 109
    :cond_9
    move-object/from16 v7, p3

    .line 110
    .line 111
    goto :goto_7

    .line 112
    :cond_a
    and-int/lit16 v7, v15, 0xc00

    .line 113
    .line 114
    if-nez v7, :cond_9

    .line 115
    .line 116
    move-object/from16 v7, p3

    .line 117
    .line 118
    invoke-interface {v12, v7}, LY/m;->U(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    if-eqz v8, :cond_b

    .line 123
    .line 124
    const/16 v8, 0x800

    .line 125
    .line 126
    goto :goto_6

    .line 127
    :cond_b
    const/16 v8, 0x400

    .line 128
    .line 129
    :goto_6
    or-int/2addr v4, v8

    .line 130
    :goto_7
    and-int/lit8 v8, p7, 0x10

    .line 131
    .line 132
    if-eqz v8, :cond_d

    .line 133
    .line 134
    or-int/lit16 v4, v4, 0x6000

    .line 135
    .line 136
    :cond_c
    move-object/from16 v9, p4

    .line 137
    .line 138
    goto :goto_9

    .line 139
    :cond_d
    and-int/lit16 v9, v15, 0x6000

    .line 140
    .line 141
    if-nez v9, :cond_c

    .line 142
    .line 143
    move-object/from16 v9, p4

    .line 144
    .line 145
    invoke-interface {v12, v9}, LY/m;->U(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v10

    .line 149
    if-eqz v10, :cond_e

    .line 150
    .line 151
    const/16 v10, 0x4000

    .line 152
    .line 153
    goto :goto_8

    .line 154
    :cond_e
    const/16 v10, 0x2000

    .line 155
    .line 156
    :goto_8
    or-int/2addr v4, v10

    .line 157
    :goto_9
    and-int/lit16 v10, v4, 0x2493

    .line 158
    .line 159
    const/16 v11, 0x2492

    .line 160
    .line 161
    if-ne v10, v11, :cond_10

    .line 162
    .line 163
    invoke-interface {v12}, LY/m;->i()Z

    .line 164
    .line 165
    .line 166
    move-result v10

    .line 167
    if-nez v10, :cond_f

    .line 168
    .line 169
    goto :goto_a

    .line 170
    :cond_f
    invoke-interface {v12}, LY/m;->K()V

    .line 171
    .line 172
    .line 173
    move-object v4, v7

    .line 174
    move-object v5, v9

    .line 175
    goto/16 :goto_e

    .line 176
    .line 177
    :cond_10
    :goto_a
    if-eqz v6, :cond_11

    .line 178
    .line 179
    sget-object v6, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 180
    .line 181
    goto :goto_b

    .line 182
    :cond_11
    move-object v6, v7

    .line 183
    :goto_b
    if-eqz v8, :cond_12

    .line 184
    .line 185
    sget-object v7, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonStyle;->FILLED:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonStyle;

    .line 186
    .line 187
    move-object/from16 v28, v7

    .line 188
    .line 189
    goto :goto_c

    .line 190
    :cond_12
    move-object/from16 v28, v9

    .line 191
    .line 192
    :goto_c
    invoke-static {}, LY/w;->L()Z

    .line 193
    .line 194
    .line 195
    move-result v7

    .line 196
    if-eqz v7, :cond_13

    .line 197
    .line 198
    const/4 v7, -0x1

    .line 199
    const-string v8, "com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButton (SettingsButton.kt:33)"

    .line 200
    .line 201
    invoke-static {v3, v4, v7, v8}, LY/w;->U(IIILjava/lang/String;)V

    .line 202
    .line 203
    .line 204
    :cond_13
    const/16 v3, 0x18

    .line 205
    .line 206
    int-to-float v3, v3

    .line 207
    invoke-static {v3}, Li1/h;->n(F)F

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    invoke-static {v3}, LJ/i;->d(F)LJ/h;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    const/4 v7, 0x0

    .line 216
    const/4 v8, 0x1

    .line 217
    const/4 v9, 0x0

    .line 218
    invoke-static {v6, v7, v8, v9}, Landroidx/compose/foundation/layout/s;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 219
    .line 220
    .line 221
    move-result-object v10

    .line 222
    const/16 v11, 0x30

    .line 223
    .line 224
    int-to-float v11, v11

    .line 225
    invoke-static {v11}, Li1/h;->n(F)F

    .line 226
    .line 227
    .line 228
    move-result v11

    .line 229
    invoke-static {v10, v7, v11, v8, v9}, Landroidx/compose/foundation/layout/s;->b(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    sget-object v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 234
    .line 235
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Enum;->ordinal()I

    .line 236
    .line 237
    .line 238
    move-result v10

    .line 239
    aget v9, v9, v10

    .line 240
    .line 241
    const/16 v11, 0x36

    .line 242
    .line 243
    if-eq v9, v8, :cond_15

    .line 244
    .line 245
    if-eq v9, v5, :cond_14

    .line 246
    .line 247
    const v3, -0x5c02338d

    .line 248
    .line 249
    .line 250
    invoke-interface {v12, v3}, LY/m;->V(I)V

    .line 251
    .line 252
    .line 253
    invoke-interface {v12}, LY/m;->O()V

    .line 254
    .line 255
    .line 256
    move-object/from16 v29, v6

    .line 257
    .line 258
    goto/16 :goto_d

    .line 259
    .line 260
    :cond_14
    const v5, -0x5c0bc012

    .line 261
    .line 262
    .line 263
    invoke-interface {v12, v5}, LY/m;->V(I)V

    .line 264
    .line 265
    .line 266
    sget-object v16, LU/i;->a:LU/i;

    .line 267
    .line 268
    sget-object v5, LU/D;->a:LU/D;

    .line 269
    .line 270
    sget v9, LU/D;->b:I

    .line 271
    .line 272
    invoke-virtual {v5, v12, v9}, LU/D;->a(LY/m;I)LU/l;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    invoke-virtual {v5}, LU/l;->C()J

    .line 277
    .line 278
    .line 279
    move-result-wide v19

    .line 280
    sget v5, LU/i;->o:I

    .line 281
    .line 282
    shl-int/lit8 v26, v5, 0xc

    .line 283
    .line 284
    const/16 v27, 0xd

    .line 285
    .line 286
    const-wide/16 v17, 0x0

    .line 287
    .line 288
    const-wide/16 v21, 0x0

    .line 289
    .line 290
    const-wide/16 v23, 0x0

    .line 291
    .line 292
    move-object/from16 v25, v12

    .line 293
    .line 294
    invoke-virtual/range {v16 .. v27}, LU/i;->p(JJJJLY/m;II)LU/h;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    invoke-virtual/range {v16 .. v16}, LU/i;->l()LC/A;

    .line 299
    .line 300
    .line 301
    move-result-object v9

    .line 302
    move v13, v4

    .line 303
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;->getEnabled()Z

    .line 304
    .line 305
    .line 306
    move-result v4

    .line 307
    new-instance v14, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt$SettingsButton$2;

    .line 308
    .line 309
    invoke-direct {v14, v1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt$SettingsButton$2;-><init>(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;)V

    .line 310
    .line 311
    .line 312
    const/high16 p3, 0x30000000

    .line 313
    .line 314
    const v10, 0x17acba74

    .line 315
    .line 316
    .line 317
    invoke-static {v10, v8, v14, v12, v11}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 318
    .line 319
    .line 320
    move-result-object v11

    .line 321
    shr-int/lit8 v8, v13, 0x3

    .line 322
    .line 323
    and-int/lit8 v8, v8, 0xe

    .line 324
    .line 325
    or-int v13, v8, p3

    .line 326
    .line 327
    const/16 v14, 0x160

    .line 328
    .line 329
    move-object v8, v6

    .line 330
    move-object v6, v5

    .line 331
    move-object v5, v3

    .line 332
    move-object v3, v7

    .line 333
    const/4 v7, 0x0

    .line 334
    move-object v10, v8

    .line 335
    const/4 v8, 0x0

    .line 336
    move-object/from16 v16, v10

    .line 337
    .line 338
    const/4 v10, 0x0

    .line 339
    move-object/from16 v29, v16

    .line 340
    .line 341
    invoke-static/range {v2 .. v14}, LU/k;->b(Lie/a;Landroidx/compose/ui/e;ZLs0/E1;LU/h;LU/j;Lx/g;LC/A;LB/m;Lie/o;LY/m;II)V

    .line 342
    .line 343
    .line 344
    invoke-interface {v12}, LY/m;->O()V

    .line 345
    .line 346
    .line 347
    goto :goto_d

    .line 348
    :cond_15
    move-object v5, v3

    .line 349
    move v13, v4

    .line 350
    move-object/from16 v29, v6

    .line 351
    .line 352
    move-object v3, v7

    .line 353
    const/high16 p3, 0x30000000

    .line 354
    .line 355
    const v2, -0x5c17038e

    .line 356
    .line 357
    .line 358
    invoke-interface {v12, v2}, LY/m;->V(I)V

    .line 359
    .line 360
    .line 361
    sget-object v16, LU/i;->a:LU/i;

    .line 362
    .line 363
    sget-object v2, LU/D;->a:LU/D;

    .line 364
    .line 365
    sget v4, LU/D;->b:I

    .line 366
    .line 367
    invoke-virtual {v2, v12, v4}, LU/D;->a(LY/m;I)LU/l;

    .line 368
    .line 369
    .line 370
    move-result-object v6

    .line 371
    invoke-virtual {v6}, LU/l;->C()J

    .line 372
    .line 373
    .line 374
    move-result-wide v17

    .line 375
    invoke-virtual {v2, v12, v4}, LU/D;->a(LY/m;I)LU/l;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    invoke-virtual {v2}, LU/l;->s()J

    .line 380
    .line 381
    .line 382
    move-result-wide v19

    .line 383
    sget v2, LU/i;->o:I

    .line 384
    .line 385
    shl-int/lit8 v26, v2, 0xc

    .line 386
    .line 387
    const/16 v27, 0xc

    .line 388
    .line 389
    const-wide/16 v21, 0x0

    .line 390
    .line 391
    const-wide/16 v23, 0x0

    .line 392
    .line 393
    move-object/from16 v25, v12

    .line 394
    .line 395
    invoke-virtual/range {v16 .. v27}, LU/i;->b(JJJJLY/m;II)LU/h;

    .line 396
    .line 397
    .line 398
    move-result-object v6

    .line 399
    invoke-virtual/range {v16 .. v16}, LU/i;->l()LC/A;

    .line 400
    .line 401
    .line 402
    move-result-object v9

    .line 403
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;->getEnabled()Z

    .line 404
    .line 405
    .line 406
    move-result v4

    .line 407
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt$SettingsButton$1;

    .line 408
    .line 409
    invoke-direct {v2, v1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt$SettingsButton$1;-><init>(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;)V

    .line 410
    .line 411
    .line 412
    const v7, 0x55757c09

    .line 413
    .line 414
    .line 415
    invoke-static {v7, v8, v2, v12, v11}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 416
    .line 417
    .line 418
    move-result-object v11

    .line 419
    shr-int/lit8 v2, v13, 0x3

    .line 420
    .line 421
    and-int/lit8 v2, v2, 0xe

    .line 422
    .line 423
    or-int v13, v2, p3

    .line 424
    .line 425
    const/16 v14, 0x160

    .line 426
    .line 427
    const/4 v7, 0x0

    .line 428
    const/4 v8, 0x0

    .line 429
    const/4 v10, 0x0

    .line 430
    move-object/from16 v2, p1

    .line 431
    .line 432
    invoke-static/range {v2 .. v14}, LU/k;->a(Lie/a;Landroidx/compose/ui/e;ZLs0/E1;LU/h;LU/j;Lx/g;LC/A;LB/m;Lie/o;LY/m;II)V

    .line 433
    .line 434
    .line 435
    invoke-interface {v12}, LY/m;->O()V

    .line 436
    .line 437
    .line 438
    :goto_d
    invoke-static {}, LY/w;->L()Z

    .line 439
    .line 440
    .line 441
    move-result v2

    .line 442
    if-eqz v2, :cond_16

    .line 443
    .line 444
    invoke-static {}, LY/w;->T()V

    .line 445
    .line 446
    .line 447
    :cond_16
    move-object/from16 v5, v28

    .line 448
    .line 449
    move-object/from16 v4, v29

    .line 450
    .line 451
    :goto_e
    invoke-interface {v12}, LY/m;->k()LY/B1;

    .line 452
    .line 453
    .line 454
    move-result-object v8

    .line 455
    if-eqz v8, :cond_17

    .line 456
    .line 457
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt$SettingsButton$3;

    .line 458
    .line 459
    move-object/from16 v2, p1

    .line 460
    .line 461
    move-object/from16 v3, p2

    .line 462
    .line 463
    move/from16 v7, p7

    .line 464
    .line 465
    move v6, v15

    .line 466
    invoke-direct/range {v0 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt$SettingsButton$3;-><init>(Ljava/lang/String;Lie/a;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonStyle;II)V

    .line 467
    .line 468
    .line 469
    invoke-interface {v8, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 470
    .line 471
    .line 472
    :cond_17
    return-void
.end method

.method private static final SettingsButtonDisabled_Preview(LY/m;I)V
    .locals 9

    .line 1
    const v0, -0x4aefe6d1

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object v6

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-interface {v6}, LY/m;->i()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {v6}, LY/m;->K()V

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
    move-result p0

    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    const/4 p0, -0x1

    .line 28
    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonDisabled_Preview (SettingsButton.kt:147)"

    .line 29
    .line 30
    invoke-static {v0, p1, p0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    sget-object v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt$SettingsButtonDisabled_Preview$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt$SettingsButtonDisabled_Preview$1;

    .line 34
    .line 35
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;

    .line 36
    .line 37
    const/4 p0, 0x2

    .line 38
    const/4 v0, 0x0

    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-direct {v3, v1, v1, p0, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 41
    .line 42
    .line 43
    const/16 v7, 0x36

    .line 44
    .line 45
    const/16 v8, 0x18

    .line 46
    .line 47
    const-string v1, "Restore purchases"

    .line 48
    .line 49
    const/4 v4, 0x0

    .line 50
    const/4 v5, 0x0

    .line 51
    invoke-static/range {v1 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt;->SettingsButton(Ljava/lang/String;Lie/a;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonStyle;LY/m;II)V

    .line 52
    .line 53
    .line 54
    invoke-static {}, LY/w;->L()Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-eqz p0, :cond_3

    .line 59
    .line 60
    invoke-static {}, LY/w;->T()V

    .line 61
    .line 62
    .line 63
    :cond_3
    :goto_1
    invoke-interface {v6}, LY/m;->k()LY/B1;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    if-eqz p0, :cond_4

    .line 68
    .line 69
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt$SettingsButtonDisabled_Preview$2;

    .line 70
    .line 71
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt$SettingsButtonDisabled_Preview$2;-><init>(I)V

    .line 72
    .line 73
    .line 74
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 75
    .line 76
    .line 77
    :cond_4
    return-void
.end method

.method private static final SettingsButtonLoading_Preview(LY/m;I)V
    .locals 9

    .line 1
    const v0, -0x64e685eb

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object v6

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-interface {v6}, LY/m;->i()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {v6}, LY/m;->K()V

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
    move-result p0

    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    const/4 p0, -0x1

    .line 28
    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonLoading_Preview (SettingsButton.kt:126)"

    .line 29
    .line 30
    invoke-static {v0, p1, p0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    sget-object v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt$SettingsButtonLoading_Preview$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt$SettingsButtonLoading_Preview$1;

    .line 34
    .line 35
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;

    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    const/4 v0, 0x0

    .line 39
    const/4 v1, 0x1

    .line 40
    invoke-direct {v3, p0, v1, v1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 41
    .line 42
    .line 43
    const/16 v7, 0x36

    .line 44
    .line 45
    const/16 v8, 0x18

    .line 46
    .line 47
    const-string v1, "Restore purchases"

    .line 48
    .line 49
    const/4 v4, 0x0

    .line 50
    const/4 v5, 0x0

    .line 51
    invoke-static/range {v1 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt;->SettingsButton(Ljava/lang/String;Lie/a;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonStyle;LY/m;II)V

    .line 52
    .line 53
    .line 54
    invoke-static {}, LY/w;->L()Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-eqz p0, :cond_3

    .line 59
    .line 60
    invoke-static {}, LY/w;->T()V

    .line 61
    .line 62
    .line 63
    :cond_3
    :goto_1
    invoke-interface {v6}, LY/m;->k()LY/B1;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    if-eqz p0, :cond_4

    .line 68
    .line 69
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt$SettingsButtonLoading_Preview$2;

    .line 70
    .line 71
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt$SettingsButtonLoading_Preview$2;-><init>(I)V

    .line 72
    .line 73
    .line 74
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 75
    .line 76
    .line 77
    :cond_4
    return-void
.end method

.method private static final SettingsButtonOutlinedLoading_Preview(LY/m;I)V
    .locals 9

    .line 1
    const v0, -0x36c8a169

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object v6

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-interface {v6}, LY/m;->i()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {v6}, LY/m;->K()V

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
    move-result p0

    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    const/4 p0, -0x1

    .line 28
    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonOutlinedLoading_Preview (SettingsButton.kt:136)"

    .line 29
    .line 30
    invoke-static {v0, p1, p0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    sget-object v5, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonStyle;->OUTLINED:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonStyle;

    .line 34
    .line 35
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;

    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    const/4 v0, 0x0

    .line 39
    const/4 v1, 0x1

    .line 40
    invoke-direct {v3, p0, v1, v1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 41
    .line 42
    .line 43
    sget-object v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt$SettingsButtonOutlinedLoading_Preview$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt$SettingsButtonOutlinedLoading_Preview$1;

    .line 44
    .line 45
    const/16 v7, 0x6036

    .line 46
    .line 47
    const/16 v8, 0x8

    .line 48
    .line 49
    const-string v1, "Restore purchases"

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-static/range {v1 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt;->SettingsButton(Ljava/lang/String;Lie/a;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonStyle;LY/m;II)V

    .line 53
    .line 54
    .line 55
    invoke-static {}, LY/w;->L()Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-eqz p0, :cond_3

    .line 60
    .line 61
    invoke-static {}, LY/w;->T()V

    .line 62
    .line 63
    .line 64
    :cond_3
    :goto_1
    invoke-interface {v6}, LY/m;->k()LY/B1;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    if-eqz p0, :cond_4

    .line 69
    .line 70
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt$SettingsButtonOutlinedLoading_Preview$2;

    .line 71
    .line 72
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt$SettingsButtonOutlinedLoading_Preview$2;-><init>(I)V

    .line 73
    .line 74
    .line 75
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 76
    .line 77
    .line 78
    :cond_4
    return-void
.end method

.method private static final SettingsButtonOutlined_Preview(LY/m;I)V
    .locals 9

    .line 1
    const v0, 0x57bee109

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object v6

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-interface {v6}, LY/m;->i()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {v6}, LY/m;->K()V

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
    move-result p0

    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    const/4 p0, -0x1

    .line 28
    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonOutlined_Preview (SettingsButton.kt:115)"

    .line 29
    .line 30
    invoke-static {v0, p1, p0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    sget-object v5, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonStyle;->OUTLINED:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonStyle;

    .line 34
    .line 35
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;

    .line 36
    .line 37
    const/4 p0, 0x3

    .line 38
    const/4 v0, 0x0

    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-direct {v3, v1, v1, p0, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 41
    .line 42
    .line 43
    sget-object v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt$SettingsButtonOutlined_Preview$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt$SettingsButtonOutlined_Preview$1;

    .line 44
    .line 45
    const/16 v7, 0x6036

    .line 46
    .line 47
    const/16 v8, 0x8

    .line 48
    .line 49
    const-string v1, "Restore purchases"

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-static/range {v1 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt;->SettingsButton(Ljava/lang/String;Lie/a;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonStyle;LY/m;II)V

    .line 53
    .line 54
    .line 55
    invoke-static {}, LY/w;->L()Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-eqz p0, :cond_3

    .line 60
    .line 61
    invoke-static {}, LY/w;->T()V

    .line 62
    .line 63
    .line 64
    :cond_3
    :goto_1
    invoke-interface {v6}, LY/m;->k()LY/B1;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    if-eqz p0, :cond_4

    .line 69
    .line 70
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt$SettingsButtonOutlined_Preview$2;

    .line 71
    .line 72
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt$SettingsButtonOutlined_Preview$2;-><init>(I)V

    .line 73
    .line 74
    .line 75
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 76
    .line 77
    .line 78
    :cond_4
    return-void
.end method

.method private static final SettingsButton_Preview(LY/m;I)V
    .locals 9

    .line 1
    const v0, -0x2c6e68b5

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object v6

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-interface {v6}, LY/m;->i()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {v6}, LY/m;->K()V

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
    move-result p0

    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    const/4 p0, -0x1

    .line 28
    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButton_Preview (SettingsButton.kt:104)"

    .line 29
    .line 30
    invoke-static {v0, p1, p0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    sget-object v5, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonStyle;->FILLED:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonStyle;

    .line 34
    .line 35
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;

    .line 36
    .line 37
    const/4 p0, 0x3

    .line 38
    const/4 v0, 0x0

    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-direct {v3, v1, v1, p0, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 41
    .line 42
    .line 43
    sget-object v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt$SettingsButton_Preview$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt$SettingsButton_Preview$1;

    .line 44
    .line 45
    const/16 v7, 0x6036

    .line 46
    .line 47
    const/16 v8, 0x8

    .line 48
    .line 49
    const-string v1, "Cancel subscription"

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-static/range {v1 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt;->SettingsButton(Ljava/lang/String;Lie/a;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonStyle;LY/m;II)V

    .line 53
    .line 54
    .line 55
    invoke-static {}, LY/w;->L()Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-eqz p0, :cond_3

    .line 60
    .line 61
    invoke-static {}, LY/w;->T()V

    .line 62
    .line 63
    .line 64
    :cond_3
    :goto_1
    invoke-interface {v6}, LY/m;->k()LY/B1;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    if-eqz p0, :cond_4

    .line 69
    .line 70
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt$SettingsButton_Preview$2;

    .line 71
    .line 72
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt$SettingsButton_Preview$2;-><init>(I)V

    .line 73
    .line 74
    .line 75
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 76
    .line 77
    .line 78
    :cond_4
    return-void
.end method

.method public static final synthetic access$ButtonContent-XO-JAsU(Ljava/lang/String;ZJLY/m;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt;->ButtonContent-XO-JAsU(Ljava/lang/String;ZJLY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$SettingsButtonDisabled_Preview(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt;->SettingsButtonDisabled_Preview(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$SettingsButtonLoading_Preview(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt;->SettingsButtonLoading_Preview(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$SettingsButtonOutlinedLoading_Preview(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt;->SettingsButtonOutlinedLoading_Preview(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$SettingsButtonOutlined_Preview(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt;->SettingsButtonOutlined_Preview(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$SettingsButton_Preview(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt;->SettingsButton_Preview(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
