.class public final Lcom/revenuecat/purchases/ui/revenuecatui/composables/DisableTouchesComposableKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\'\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "",
        "shouldDisable",
        "Lkotlin/Function0;",
        "LTd/L;",
        "content",
        "DisableTouchesComposable",
        "(ZLkotlin/jvm/functions/Function2;LY/m;II)V",
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
.method public static final DisableTouchesComposable(ZLkotlin/jvm/functions/Function2;LY/m;II)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function2;",
            "LY/m;",
            "II)V"
        }
    .end annotation

    .line 1
    const-string v0, "content"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, 0x4d470537    # 2.08687984E8f

    .line 7
    .line 8
    .line 9
    invoke-interface {p2, v0}, LY/m;->g(I)LY/m;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    and-int/lit8 v1, p4, 0x1

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    or-int/lit8 v2, p3, 0x6

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    and-int/lit8 v2, p3, 0x6

    .line 21
    .line 22
    if-nez v2, :cond_2

    .line 23
    .line 24
    invoke-interface {p2, p0}, LY/m;->a(Z)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    const/4 v2, 0x4

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v2, 0x2

    .line 33
    :goto_0
    or-int/2addr v2, p3

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    move v2, p3

    .line 36
    :goto_1
    and-int/lit8 v3, p4, 0x2

    .line 37
    .line 38
    if-eqz v3, :cond_3

    .line 39
    .line 40
    or-int/lit8 v2, v2, 0x30

    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_3
    and-int/lit8 v3, p3, 0x30

    .line 44
    .line 45
    if-nez v3, :cond_5

    .line 46
    .line 47
    invoke-interface {p2, p1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_4

    .line 52
    .line 53
    const/16 v3, 0x20

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_4
    const/16 v3, 0x10

    .line 57
    .line 58
    :goto_2
    or-int/2addr v2, v3

    .line 59
    :cond_5
    :goto_3
    and-int/lit8 v3, v2, 0x13

    .line 60
    .line 61
    const/16 v4, 0x12

    .line 62
    .line 63
    if-ne v3, v4, :cond_7

    .line 64
    .line 65
    invoke-interface {p2}, LY/m;->i()Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-nez v3, :cond_6

    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_6
    invoke-interface {p2}, LY/m;->K()V

    .line 73
    .line 74
    .line 75
    goto/16 :goto_6

    .line 76
    .line 77
    :cond_7
    :goto_4
    if-eqz v1, :cond_8

    .line 78
    .line 79
    const/4 p0, 0x1

    .line 80
    :cond_8
    invoke-static {}, LY/w;->L()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_9

    .line 85
    .line 86
    const/4 v1, -0x1

    .line 87
    const-string v3, "com.revenuecat.purchases.ui.revenuecatui.composables.DisableTouchesComposable (DisableTouchesComposable.kt:11)"

    .line 88
    .line 89
    invoke-static {v0, v2, v1, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 90
    .line 91
    .line 92
    :cond_9
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 93
    .line 94
    sget-object v1, Ll0/e;->a:Ll0/e$a;

    .line 95
    .line 96
    invoke-virtual {v1}, Ll0/e$a;->o()Ll0/e;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    const/4 v3, 0x0

    .line 101
    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-static {p2, v3}, LY/h;->a(LY/m;I)I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    invoke-interface {p2}, LY/m;->r()LY/I;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-static {p2, v0}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    sget-object v7, LK0/g;->M:LK0/g$a;

    .line 118
    .line 119
    invoke-virtual {v7}, LK0/g$a;->a()Lie/a;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    invoke-interface {p2}, LY/m;->j()LY/d;

    .line 124
    .line 125
    .line 126
    move-result-object v9

    .line 127
    if-nez v9, :cond_a

    .line 128
    .line 129
    invoke-static {}, LY/h;->d()V

    .line 130
    .line 131
    .line 132
    :cond_a
    invoke-interface {p2}, LY/m;->I()V

    .line 133
    .line 134
    .line 135
    invoke-interface {p2}, LY/m;->e()Z

    .line 136
    .line 137
    .line 138
    move-result v9

    .line 139
    if-eqz v9, :cond_b

    .line 140
    .line 141
    invoke-interface {p2, v8}, LY/m;->h(Lie/a;)V

    .line 142
    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_b
    invoke-interface {p2}, LY/m;->s()V

    .line 146
    .line 147
    .line 148
    :goto_5
    invoke-static {p2}, LY/m2;->b(LY/m;)LY/m;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    invoke-virtual {v7}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    invoke-static {v8, v1, v9}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v7}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-static {v8, v5, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v7}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-interface {v8}, LY/m;->e()Z

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    if-nez v5, :cond_c

    .line 175
    .line 176
    invoke-interface {v8}, LY/m;->D()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 181
    .line 182
    .line 183
    move-result-object v9

    .line 184
    invoke-static {v5, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v5

    .line 188
    if-nez v5, :cond_d

    .line 189
    .line 190
    :cond_c
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 191
    .line 192
    .line 193
    move-result-object v5

    .line 194
    invoke-interface {v8, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    invoke-interface {v8, v4, v1}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 202
    .line 203
    .line 204
    :cond_d
    invoke-virtual {v7}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-static {v8, v6, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 209
    .line 210
    .line 211
    sget-object v1, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 212
    .line 213
    shr-int/lit8 v2, v2, 0x3

    .line 214
    .line 215
    and-int/lit8 v2, v2, 0xe

    .line 216
    .line 217
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    invoke-interface {p1, p2, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    const v2, 0x34a181b2

    .line 225
    .line 226
    .line 227
    invoke-interface {p2, v2}, LY/m;->V(I)V

    .line 228
    .line 229
    .line 230
    if-eqz p0, :cond_e

    .line 231
    .line 232
    invoke-interface {v1, v0}, LC/c;->c(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    sget-object v1, LTd/L;->a:LTd/L;

    .line 237
    .line 238
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/composables/DisableTouchesComposableKt$DisableTouchesComposable$1$1;

    .line 239
    .line 240
    const/4 v4, 0x0

    .line 241
    invoke-direct {v2, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/DisableTouchesComposableKt$DisableTouchesComposable$1$1;-><init>(LZd/e;)V

    .line 242
    .line 243
    .line 244
    invoke-static {v0, v1, v2}, LE0/V;->d(Landroidx/compose/ui/e;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/e;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-static {v0, p2, v3}, Landroidx/compose/foundation/layout/f;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 249
    .line 250
    .line 251
    :cond_e
    invoke-interface {p2}, LY/m;->O()V

    .line 252
    .line 253
    .line 254
    invoke-interface {p2}, LY/m;->x()V

    .line 255
    .line 256
    .line 257
    invoke-static {}, LY/w;->L()Z

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-eqz v0, :cond_f

    .line 262
    .line 263
    invoke-static {}, LY/w;->T()V

    .line 264
    .line 265
    .line 266
    :cond_f
    :goto_6
    invoke-interface {p2}, LY/m;->k()LY/B1;

    .line 267
    .line 268
    .line 269
    move-result-object p2

    .line 270
    if-eqz p2, :cond_10

    .line 271
    .line 272
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/DisableTouchesComposableKt$DisableTouchesComposable$2;

    .line 273
    .line 274
    invoke-direct {v0, p0, p1, p3, p4}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/DisableTouchesComposableKt$DisableTouchesComposable$2;-><init>(ZLkotlin/jvm/functions/Function2;II)V

    .line 275
    .line 276
    .line 277
    invoke-interface {p2, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 278
    .line 279
    .line 280
    :cond_10
    return-void
.end method
