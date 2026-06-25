.class public final Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u001b\u0010\u0008\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a!\u0010\u000e\u001a\u00020\u00042\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a%\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000c2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0010H\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0015\u001a\u000f\u0010\u0017\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0015\u001a\u000f\u0010\u0018\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0015\u001a\u000f\u0010\u0019\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0015\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;",
        "state",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;",
        "viewModel",
        "LTd/L;",
        "Template1",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;LY/m;I)V",
        "LC/i;",
        "Template1MainContent",
        "(LC/i;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;LY/m;I)V",
        "Landroid/net/Uri;",
        "uri",
        "",
        "landscapeLayout",
        "HeaderImage",
        "(Landroid/net/Uri;ZLY/m;I)V",
        "Lkotlin/Function0;",
        "content",
        "CircleMask",
        "(ZLkotlin/jvm/functions/Function2;LY/m;I)V",
        "Template1PaywallPreview",
        "(LY/m;I)V",
        "Template1NoFooterPaywallPreview",
        "Template1FooterPaywallPreview",
        "Template1CondensedFooterPaywallPreview",
        "CircleMaskPreview",
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
.method private static final CircleMask(ZLkotlin/jvm/functions/Function2;LY/m;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function2;",
            "LY/m;",
            "I)V"
        }
    .end annotation

    .line 1
    const v0, -0x4a346b35

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    and-int/lit8 v1, p3, 0x6

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-interface {p2, p0}, LY/m;->a(Z)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v1, 0x2

    .line 21
    :goto_0
    or-int/2addr v1, p3

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v1, p3

    .line 24
    :goto_1
    and-int/lit8 v2, p3, 0x30

    .line 25
    .line 26
    if-nez v2, :cond_3

    .line 27
    .line 28
    invoke-interface {p2, p1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    const/16 v2, 0x20

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    const/16 v2, 0x10

    .line 38
    .line 39
    :goto_2
    or-int/2addr v1, v2

    .line 40
    :cond_3
    and-int/lit8 v2, v1, 0x13

    .line 41
    .line 42
    const/16 v3, 0x12

    .line 43
    .line 44
    if-ne v2, v3, :cond_5

    .line 45
    .line 46
    invoke-interface {p2}, LY/m;->i()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_4

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    invoke-interface {p2}, LY/m;->K()V

    .line 54
    .line 55
    .line 56
    goto/16 :goto_6

    .line 57
    .line 58
    :cond_5
    :goto_3
    invoke-static {}, LY/w;->L()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_6

    .line 63
    .line 64
    const/4 v2, -0x1

    .line 65
    const-string v3, "com.revenuecat.purchases.ui.revenuecatui.templates.CircleMask (Template1.kt:159)"

    .line 66
    .line 67
    invoke-static {v0, v1, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_6
    if-eqz p0, :cond_7

    .line 71
    .line 72
    const/high16 v0, 0x41000000    # 8.0f

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_7
    const/high16 v0, 0x40400000    # 3.0f

    .line 76
    .line 77
    :goto_4
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$CircleMask$clipShape$1;

    .line 78
    .line 79
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$CircleMask$clipShape$1;-><init>(F)V

    .line 80
    .line 81
    .line 82
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 83
    .line 84
    invoke-static {v0, v2}, Lp0/g;->a(Landroidx/compose/ui/e;Ls0/E1;)Landroidx/compose/ui/e;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    sget-object v2, Ll0/e;->a:Ll0/e$a;

    .line 89
    .line 90
    invoke-virtual {v2}, Ll0/e$a;->o()Ll0/e;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    const/4 v3, 0x0

    .line 95
    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-static {p2, v3}, LY/h;->a(LY/m;I)I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    invoke-interface {p2}, LY/m;->r()LY/I;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-static {p2, v0}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    sget-object v5, LK0/g;->M:LK0/g$a;

    .line 112
    .line 113
    invoke-virtual {v5}, LK0/g$a;->a()Lie/a;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    invoke-interface {p2}, LY/m;->j()LY/d;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    if-nez v7, :cond_8

    .line 122
    .line 123
    invoke-static {}, LY/h;->d()V

    .line 124
    .line 125
    .line 126
    :cond_8
    invoke-interface {p2}, LY/m;->I()V

    .line 127
    .line 128
    .line 129
    invoke-interface {p2}, LY/m;->e()Z

    .line 130
    .line 131
    .line 132
    move-result v7

    .line 133
    if-eqz v7, :cond_9

    .line 134
    .line 135
    invoke-interface {p2, v6}, LY/m;->h(Lie/a;)V

    .line 136
    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_9
    invoke-interface {p2}, LY/m;->s()V

    .line 140
    .line 141
    .line 142
    :goto_5
    invoke-static {p2}, LY/m2;->b(LY/m;)LY/m;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    invoke-virtual {v5}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    invoke-static {v6, v2, v7}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v5}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-static {v6, v4, v2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v5}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-interface {v6}, LY/m;->e()Z

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    if-nez v4, :cond_a

    .line 169
    .line 170
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    if-nez v4, :cond_b

    .line 183
    .line 184
    :cond_a
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    invoke-interface {v6, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    invoke-interface {v6, v3, v2}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 196
    .line 197
    .line 198
    :cond_b
    invoke-virtual {v5}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    invoke-static {v6, v0, v2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 203
    .line 204
    .line 205
    sget-object v0, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 206
    .line 207
    shr-int/lit8 v0, v1, 0x3

    .line 208
    .line 209
    and-int/lit8 v0, v0, 0xe

    .line 210
    .line 211
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-interface {p1, p2, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    invoke-interface {p2}, LY/m;->x()V

    .line 219
    .line 220
    .line 221
    invoke-static {}, LY/w;->L()Z

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    if-eqz v0, :cond_c

    .line 226
    .line 227
    invoke-static {}, LY/w;->T()V

    .line 228
    .line 229
    .line 230
    :cond_c
    :goto_6
    invoke-interface {p2}, LY/m;->k()LY/B1;

    .line 231
    .line 232
    .line 233
    move-result-object p2

    .line 234
    if-eqz p2, :cond_d

    .line 235
    .line 236
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$CircleMask$2;

    .line 237
    .line 238
    invoke-direct {v0, p0, p1, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$CircleMask$2;-><init>(ZLkotlin/jvm/functions/Function2;I)V

    .line 239
    .line 240
    .line 241
    invoke-interface {p2, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 242
    .line 243
    .line 244
    :cond_d
    return-void
.end method

.method private static final CircleMask$circleOffsetX(FJ)F
    .locals 1

    .line 1
    invoke-static {p1, p2}, Lr0/l;->i(J)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-float/2addr v0, p0

    .line 6
    invoke-static {p1, p2}, Lr0/l;->i(J)F

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    sub-float/2addr v0, p0

    .line 11
    const/high16 p0, 0x40000000    # 2.0f

    .line 12
    .line 13
    div-float/2addr v0, p0

    .line 14
    const/high16 p0, -0x40800000    # -1.0f

    .line 15
    .line 16
    mul-float/2addr v0, p0

    .line 17
    return v0
.end method

.method private static final CircleMask$circleOffsetY(FJ)F
    .locals 1

    .line 1
    invoke-static {p1, p2}, Lr0/l;->g(J)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-float/2addr v0, p0

    .line 6
    invoke-static {p1, p2}, Lr0/l;->g(J)F

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    sub-float/2addr v0, p0

    .line 11
    const/high16 p0, -0x40800000    # -1.0f

    .line 12
    .line 13
    mul-float/2addr v0, p0

    .line 14
    return v0
.end method

.method private static final CircleMaskPreview(LY/m;I)V
    .locals 9

    .line 1
    const v0, -0x18b7e7a1

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
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.templates.CircleMaskPreview (Template1.kt:250)"

    .line 30
    .line 31
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_2
    sget-object v3, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 35
    .line 36
    sget-object v0, Ll0/e;->a:Ll0/e$a;

    .line 37
    .line 38
    invoke-virtual {v0}, Ll0/e$a;->o()Ll0/e;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const/4 v1, 0x0

    .line 43
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {p0, v1}, LY/h;->a(LY/m;I)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    invoke-interface {p0}, LY/m;->r()LY/I;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-static {p0, v3}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    sget-object v6, LK0/g;->M:LK0/g$a;

    .line 60
    .line 61
    invoke-virtual {v6}, LK0/g$a;->a()Lie/a;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-interface {p0}, LY/m;->j()LY/d;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    if-nez v8, :cond_3

    .line 70
    .line 71
    invoke-static {}, LY/h;->d()V

    .line 72
    .line 73
    .line 74
    :cond_3
    invoke-interface {p0}, LY/m;->I()V

    .line 75
    .line 76
    .line 77
    invoke-interface {p0}, LY/m;->e()Z

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    if-eqz v8, :cond_4

    .line 82
    .line 83
    invoke-interface {p0, v7}, LY/m;->h(Lie/a;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    invoke-interface {p0}, LY/m;->s()V

    .line 88
    .line 89
    .line 90
    :goto_1
    invoke-static {p0}, LY/m2;->b(LY/m;)LY/m;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    invoke-virtual {v6}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    invoke-static {v7, v0, v8}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v6}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-static {v7, v4, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v6}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-interface {v7}, LY/m;->e()Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-nez v4, :cond_5

    .line 117
    .line 118
    invoke-interface {v7}, LY/m;->D()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    invoke-static {v4, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-nez v4, :cond_6

    .line 131
    .line 132
    :cond_5
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    invoke-interface {v7, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-interface {v7, v2, v0}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 144
    .line 145
    .line 146
    :cond_6
    invoke-virtual {v6}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-static {v7, v5, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 151
    .line 152
    .line 153
    sget-object v0, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 154
    .line 155
    sget-object v0, Ls0/r0;->b:Ls0/r0$a;

    .line 156
    .line 157
    invoke-virtual {v0}, Ls0/r0$a;->h()J

    .line 158
    .line 159
    .line 160
    move-result-wide v4

    .line 161
    const/4 v7, 0x2

    .line 162
    const/4 v8, 0x0

    .line 163
    const/4 v6, 0x0

    .line 164
    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLs0/E1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    const/4 v2, 0x1

    .line 169
    const/4 v3, 0x0

    .line 170
    const/4 v4, 0x0

    .line 171
    invoke-static {v0, v4, v2, v3}, Landroidx/compose/foundation/layout/s;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    const/4 v2, 0x6

    .line 176
    invoke-static {v0, p0, v2}, Landroidx/compose/foundation/layout/f;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 177
    .line 178
    .line 179
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/ComposableSingletons$Template1Kt;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/templates/ComposableSingletons$Template1Kt;

    .line 180
    .line 181
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/ComposableSingletons$Template1Kt;->getLambda-1$revenuecatui_defaultsBc8Release()Lkotlin/jvm/functions/Function2;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    const/16 v2, 0x36

    .line 186
    .line 187
    invoke-static {v1, v0, p0, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt;->CircleMask(ZLkotlin/jvm/functions/Function2;LY/m;I)V

    .line 188
    .line 189
    .line 190
    invoke-interface {p0}, LY/m;->x()V

    .line 191
    .line 192
    .line 193
    invoke-static {}, LY/w;->L()Z

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    if-eqz v0, :cond_7

    .line 198
    .line 199
    invoke-static {}, LY/w;->T()V

    .line 200
    .line 201
    .line 202
    :cond_7
    :goto_2
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    if-eqz p0, :cond_8

    .line 207
    .line 208
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$CircleMaskPreview$2;

    .line 209
    .line 210
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$CircleMaskPreview$2;-><init>(I)V

    .line 211
    .line 212
    .line 213
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 214
    .line 215
    .line 216
    :cond_8
    return-void
.end method

.method private static final HeaderImage(Landroid/net/Uri;ZLY/m;I)V
    .locals 5

    .line 1
    const v0, 0x79053f35

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    and-int/lit8 v1, p3, 0x6

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-interface {p2, p0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v1, 0x2

    .line 21
    :goto_0
    or-int/2addr v1, p3

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v1, p3

    .line 24
    :goto_1
    and-int/lit8 v2, p3, 0x30

    .line 25
    .line 26
    if-nez v2, :cond_3

    .line 27
    .line 28
    invoke-interface {p2, p1}, LY/m;->a(Z)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    const/16 v2, 0x20

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    const/16 v2, 0x10

    .line 38
    .line 39
    :goto_2
    or-int/2addr v1, v2

    .line 40
    :cond_3
    and-int/lit8 v2, v1, 0x13

    .line 41
    .line 42
    const/16 v3, 0x12

    .line 43
    .line 44
    if-ne v2, v3, :cond_5

    .line 45
    .line 46
    invoke-interface {p2}, LY/m;->i()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_4

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    invoke-interface {p2}, LY/m;->K()V

    .line 54
    .line 55
    .line 56
    goto :goto_5

    .line 57
    :cond_5
    :goto_3
    invoke-static {}, LY/w;->L()Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_6

    .line 62
    .line 63
    const/4 v2, -0x1

    .line 64
    const-string v3, "com.revenuecat.purchases.ui.revenuecatui.templates.HeaderImage (Template1.kt:139)"

    .line 65
    .line 66
    invoke-static {v0, v1, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :cond_6
    if-nez p0, :cond_7

    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_7
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$HeaderImage$1$1;

    .line 73
    .line 74
    invoke-direct {v0, p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$HeaderImage$1$1;-><init>(Landroid/net/Uri;Z)V

    .line 75
    .line 76
    .line 77
    const/16 v2, 0x36

    .line 78
    .line 79
    const v3, 0x43a2dae6

    .line 80
    .line 81
    .line 82
    const/4 v4, 0x1

    .line 83
    invoke-static {v3, v4, v0, p2, v2}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    shr-int/lit8 v1, v1, 0x3

    .line 88
    .line 89
    and-int/lit8 v1, v1, 0xe

    .line 90
    .line 91
    or-int/lit8 v1, v1, 0x30

    .line 92
    .line 93
    invoke-static {p1, v0, p2, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt;->CircleMask(ZLkotlin/jvm/functions/Function2;LY/m;I)V

    .line 94
    .line 95
    .line 96
    :goto_4
    invoke-static {}, LY/w;->L()Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_8

    .line 101
    .line 102
    invoke-static {}, LY/w;->T()V

    .line 103
    .line 104
    .line 105
    :cond_8
    :goto_5
    invoke-interface {p2}, LY/m;->k()LY/B1;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    if-eqz p2, :cond_9

    .line 110
    .line 111
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$HeaderImage$2;

    .line 112
    .line 113
    invoke-direct {v0, p0, p1, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$HeaderImage$2;-><init>(Landroid/net/Uri;ZI)V

    .line 114
    .line 115
    .line 116
    invoke-interface {p2, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 117
    .line 118
    .line 119
    :cond_9
    return-void
.end method

.method public static final Template1(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;LY/m;I)V
    .locals 9

    .line 1
    const-string v0, "state"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "viewModel"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const v0, 0x595fb36b

    .line 12
    .line 13
    .line 14
    invoke-interface {p2, v0}, LY/m;->g(I)LY/m;

    .line 15
    .line 16
    .line 17
    move-result-object v6

    .line 18
    and-int/lit8 p2, p3, 0x6

    .line 19
    .line 20
    if-nez p2, :cond_1

    .line 21
    .line 22
    invoke-interface {v6, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    const/4 p2, 0x4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p2, 0x2

    .line 31
    :goto_0
    or-int/2addr p2, p3

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move p2, p3

    .line 34
    :goto_1
    and-int/lit8 v1, p3, 0x30

    .line 35
    .line 36
    if-nez v1, :cond_3

    .line 37
    .line 38
    invoke-interface {v6, p1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    const/16 v1, 0x20

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v1, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr p2, v1

    .line 50
    :cond_3
    and-int/lit8 v1, p2, 0x13

    .line 51
    .line 52
    const/16 v2, 0x12

    .line 53
    .line 54
    if-ne v1, v2, :cond_5

    .line 55
    .line 56
    invoke-interface {v6}, LY/m;->i()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_4

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_4
    invoke-interface {v6}, LY/m;->K()V

    .line 64
    .line 65
    .line 66
    move-object v2, p1

    .line 67
    goto/16 :goto_5

    .line 68
    .line 69
    :cond_5
    :goto_3
    invoke-static {}, LY/w;->L()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_6

    .line 74
    .line 75
    const/4 v1, -0x1

    .line 76
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.templates.Template1 (Template1.kt:60)"

    .line 77
    .line 78
    invoke-static {v0, p2, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_6
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 82
    .line 83
    const/4 v1, 0x1

    .line 84
    const/4 v2, 0x0

    .line 85
    const/4 v3, 0x0

    .line 86
    invoke-static {v0, v3, v1, v2}, Landroidx/compose/foundation/layout/s;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    sget-object v1, Ll0/e;->a:Ll0/e$a;

    .line 91
    .line 92
    invoke-virtual {v1}, Ll0/e$a;->g()Ll0/e$b;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    sget-object v2, LC/b;->a:LC/b;

    .line 97
    .line 98
    invoke-virtual {v2}, LC/b;->h()LC/b$m;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    const/16 v3, 0x30

    .line 103
    .line 104
    invoke-static {v2, v1, v6, v3}, LC/g;->a(LC/b$m;Ll0/e$b;LY/m;I)LI0/B;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    const/4 v2, 0x0

    .line 109
    invoke-static {v6, v2}, LY/h;->a(LY/m;I)I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    invoke-interface {v6}, LY/m;->r()LY/I;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-static {v6, v0}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    sget-object v4, LK0/g;->M:LK0/g$a;

    .line 122
    .line 123
    invoke-virtual {v4}, LK0/g$a;->a()Lie/a;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    invoke-interface {v6}, LY/m;->j()LY/d;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    if-nez v7, :cond_7

    .line 132
    .line 133
    invoke-static {}, LY/h;->d()V

    .line 134
    .line 135
    .line 136
    :cond_7
    invoke-interface {v6}, LY/m;->I()V

    .line 137
    .line 138
    .line 139
    invoke-interface {v6}, LY/m;->e()Z

    .line 140
    .line 141
    .line 142
    move-result v7

    .line 143
    if-eqz v7, :cond_8

    .line 144
    .line 145
    invoke-interface {v6, v5}, LY/m;->h(Lie/a;)V

    .line 146
    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_8
    invoke-interface {v6}, LY/m;->s()V

    .line 150
    .line 151
    .line 152
    :goto_4
    invoke-static {v6}, LY/m2;->b(LY/m;)LY/m;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    invoke-virtual {v4}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    invoke-static {v5, v1, v7}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v4}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-static {v5, v3, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v4}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-interface {v5}, LY/m;->e()Z

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    if-nez v3, :cond_9

    .line 179
    .line 180
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    invoke-static {v3, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    if-nez v3, :cond_a

    .line 193
    .line 194
    :cond_9
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    invoke-interface {v5, v3}, LY/m;->u(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    invoke-interface {v5, v2, v1}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 206
    .line 207
    .line 208
    :cond_a
    invoke-virtual {v4}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    invoke-static {v5, v0, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 213
    .line 214
    .line 215
    sget-object v0, LC/j;->a:LC/j;

    .line 216
    .line 217
    shl-int/lit8 v1, p2, 0x3

    .line 218
    .line 219
    and-int/lit8 v1, v1, 0x70

    .line 220
    .line 221
    const/4 v2, 0x6

    .line 222
    or-int/2addr v1, v2

    .line 223
    invoke-static {v0, p0, v6, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt;->Template1MainContent(LC/i;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;LY/m;I)V

    .line 224
    .line 225
    .line 226
    and-int/lit8 v0, p2, 0x70

    .line 227
    .line 228
    and-int/lit8 v7, p2, 0x7e

    .line 229
    .line 230
    const/16 v8, 0x1c

    .line 231
    .line 232
    const/4 v3, 0x0

    .line 233
    const/4 v4, 0x0

    .line 234
    const/4 v5, 0x0

    .line 235
    move-object v1, p0

    .line 236
    move-object v2, p1

    .line 237
    invoke-static/range {v1 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PurchaseButtonKt;->PurchaseButton-hGBTI10(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;Landroidx/compose/ui/e;FLcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;LY/m;II)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;->getTemplateConfiguration()Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    const/4 v4, 0x0

    .line 245
    move v7, v0

    .line 246
    invoke-static/range {v1 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/FooterKt;->Footer(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;Lie/a;LY/m;II)V

    .line 247
    .line 248
    .line 249
    invoke-interface {v6}, LY/m;->x()V

    .line 250
    .line 251
    .line 252
    invoke-static {}, LY/w;->L()Z

    .line 253
    .line 254
    .line 255
    move-result p1

    .line 256
    if-eqz p1, :cond_b

    .line 257
    .line 258
    invoke-static {}, LY/w;->T()V

    .line 259
    .line 260
    .line 261
    :cond_b
    :goto_5
    invoke-interface {v6}, LY/m;->k()LY/B1;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    if-eqz p1, :cond_c

    .line 266
    .line 267
    new-instance p2, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$Template1$2;

    .line 268
    .line 269
    invoke-direct {p2, p0, v2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$Template1$2;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;I)V

    .line 270
    .line 271
    .line 272
    invoke-interface {p1, p2}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 273
    .line 274
    .line 275
    :cond_c
    return-void
.end method

.method private static final Template1CondensedFooterPaywallPreview(LY/m;I)V
    .locals 9

    .line 1
    const v0, -0x1f6ff012

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
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.templates.Template1CondensedFooterPaywallPreview (Template1.kt:241)"

    .line 29
    .line 30
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;

    .line 34
    .line 35
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$Template1CondensedFooterPaywallPreview$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$Template1CondensedFooterPaywallPreview$1;

    .line 36
    .line 37
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;-><init>(Lie/a;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->build()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/MockViewModel;

    .line 45
    .line 46
    sget-object v2, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;->FOOTER_CONDENSED:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;

    .line 47
    .line 48
    sget-object v3, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;

    .line 49
    .line 50
    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;->getTemplate1Offering()Lcom/revenuecat/purchases/Offering;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    const/16 v7, 0x1c

    .line 55
    .line 56
    const/4 v8, 0x0

    .line 57
    const/4 v4, 0x0

    .line 58
    const/4 v5, 0x0

    .line 59
    const/4 v6, 0x0

    .line 60
    invoke-direct/range {v1 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/MockViewModel;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 61
    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    invoke-static {v0, v1, p0, v2, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt;->InternalPaywall(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;LY/m;II)V

    .line 65
    .line 66
    .line 67
    invoke-static {}, LY/w;->L()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_3

    .line 72
    .line 73
    invoke-static {}, LY/w;->T()V

    .line 74
    .line 75
    .line 76
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    if-eqz p0, :cond_4

    .line 81
    .line 82
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$Template1CondensedFooterPaywallPreview$2;

    .line 83
    .line 84
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$Template1CondensedFooterPaywallPreview$2;-><init>(I)V

    .line 85
    .line 86
    .line 87
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 88
    .line 89
    .line 90
    :cond_4
    return-void
.end method

.method private static final Template1FooterPaywallPreview(LY/m;I)V
    .locals 9

    .line 1
    const v0, 0x60e33b23

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
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.templates.Template1FooterPaywallPreview (Template1.kt:232)"

    .line 29
    .line 30
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;

    .line 34
    .line 35
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$Template1FooterPaywallPreview$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$Template1FooterPaywallPreview$1;

    .line 36
    .line 37
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;-><init>(Lie/a;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->build()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/MockViewModel;

    .line 45
    .line 46
    sget-object v2, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;->FOOTER:Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;

    .line 47
    .line 48
    sget-object v3, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;

    .line 49
    .line 50
    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;->getTemplate1Offering()Lcom/revenuecat/purchases/Offering;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    const/16 v7, 0x1c

    .line 55
    .line 56
    const/4 v8, 0x0

    .line 57
    const/4 v4, 0x0

    .line 58
    const/4 v5, 0x0

    .line 59
    const/4 v6, 0x0

    .line 60
    invoke-direct/range {v1 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/MockViewModel;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 61
    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    invoke-static {v0, v1, p0, v2, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt;->InternalPaywall(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;LY/m;II)V

    .line 65
    .line 66
    .line 67
    invoke-static {}, LY/w;->L()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_3

    .line 72
    .line 73
    invoke-static {}, LY/w;->T()V

    .line 74
    .line 75
    .line 76
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    if-eqz p0, :cond_4

    .line 81
    .line 82
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$Template1FooterPaywallPreview$2;

    .line 83
    .line 84
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$Template1FooterPaywallPreview$2;-><init>(I)V

    .line 85
    .line 86
    .line 87
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 88
    .line 89
    .line 90
    :cond_4
    return-void
.end method

.method private static final Template1MainContent(LC/i;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;LY/m;I)V
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    const v1, -0x537c8b21

    .line 6
    .line 7
    .line 8
    move-object/from16 v2, p2

    .line 9
    .line 10
    invoke-interface {v2, v1}, LY/m;->g(I)LY/m;

    .line 11
    .line 12
    .line 13
    move-result-object v8

    .line 14
    and-int/lit8 v2, p3, 0x6

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v8, v0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    const/4 v2, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v2, 0x2

    .line 27
    :goto_0
    or-int v2, p3, v2

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move/from16 v2, p3

    .line 31
    .line 32
    :goto_1
    and-int/lit8 v3, p3, 0x30

    .line 33
    .line 34
    if-nez v3, :cond_3

    .line 35
    .line 36
    invoke-interface {v8, v6}, LY/m;->U(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    const/16 v3, 0x20

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const/16 v3, 0x10

    .line 46
    .line 47
    :goto_2
    or-int/2addr v2, v3

    .line 48
    :cond_3
    and-int/lit8 v3, v2, 0x13

    .line 49
    .line 50
    const/16 v4, 0x12

    .line 51
    .line 52
    if-ne v3, v4, :cond_5

    .line 53
    .line 54
    invoke-interface {v8}, LY/m;->i()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-nez v3, :cond_4

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_4
    invoke-interface {v8}, LY/m;->K()V

    .line 62
    .line 63
    .line 64
    move-object v9, v0

    .line 65
    goto/16 :goto_7

    .line 66
    .line 67
    :cond_5
    :goto_3
    invoke-static {}, LY/w;->L()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_6

    .line 72
    .line 73
    const/4 v3, -0x1

    .line 74
    const-string v4, "com.revenuecat.purchases.ui.revenuecatui.templates.Template1MainContent (Template1.kt:74)"

    .line 75
    .line 76
    invoke-static {v1, v2, v3, v4}, LY/w;->U(IIILjava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :cond_6
    invoke-static {v6}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallStateKt;->getSelectedLocalization(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;)Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration;

    .line 80
    .line 81
    .line 82
    move-result-object v26

    .line 83
    shr-int/lit8 v1, v2, 0x3

    .line 84
    .line 85
    and-int/lit8 v10, v1, 0xe

    .line 86
    .line 87
    invoke-static {v6, v8, v10}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallStateKt;->getCurrentColors(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;

    .line 88
    .line 89
    .line 90
    move-result-object v27

    .line 91
    invoke-static {v6}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallStateKt;->isInFullScreenMode(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    const/4 v11, 0x0

    .line 96
    const/4 v12, 0x0

    .line 97
    if-eqz v1, :cond_10

    .line 98
    .line 99
    const v1, 0x3626d41e

    .line 100
    .line 101
    .line 102
    invoke-interface {v8, v1}, LY/m;->V(I)V

    .line 103
    .line 104
    .line 105
    invoke-static {v6, v8, v10}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/WindowHelperKt;->shouldUseLandscapeLayout(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;LY/m;I)Z

    .line 106
    .line 107
    .line 108
    move-result v13

    .line 109
    sget-object v14, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 110
    .line 111
    const/4 v15, 0x0

    .line 112
    const/4 v1, 0x1

    .line 113
    invoke-static {v14, v15, v1, v11}, Landroidx/compose/foundation/layout/s;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 114
    .line 115
    .line 116
    move-result-object v16

    .line 117
    invoke-static {v12, v8, v12, v1}, Landroidx/compose/foundation/m;->c(ILY/m;II)Landroidx/compose/foundation/o;

    .line 118
    .line 119
    .line 120
    move-result-object v17

    .line 121
    const/16 v21, 0xe

    .line 122
    .line 123
    const/16 v22, 0x0

    .line 124
    .line 125
    const/16 v18, 0x0

    .line 126
    .line 127
    const/16 v19, 0x0

    .line 128
    .line 129
    const/16 v20, 0x0

    .line 130
    .line 131
    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/m;->f(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;ZLz/n;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-static {v2, v15, v1, v11}, Landroidx/compose/foundation/layout/s;->d(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    const/4 v4, 0x2

    .line 140
    const/4 v5, 0x0

    .line 141
    const/high16 v2, 0x3f800000    # 1.0f

    .line 142
    .line 143
    const/4 v3, 0x0

    .line 144
    invoke-static/range {v0 .. v5}, LC/i;->c(LC/i;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    sget-object v28, Ll0/e;->a:Ll0/e$a;

    .line 149
    .line 150
    invoke-virtual/range {v28 .. v28}, Ll0/e$a;->g()Ll0/e$b;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    sget-object v2, LC/b;->a:LC/b;

    .line 155
    .line 156
    invoke-virtual {v2}, LC/b;->b()LC/b$f;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    const/16 v3, 0x36

    .line 161
    .line 162
    invoke-static {v2, v0, v8, v3}, LC/g;->a(LC/b$m;Ll0/e$b;LY/m;I)LI0/B;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-static {v8, v12}, LY/h;->a(LY/m;I)I

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    invoke-interface {v8}, LY/m;->r()LY/I;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-static {v8, v1}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    sget-object v29, LK0/g;->M:LK0/g$a;

    .line 179
    .line 180
    invoke-virtual/range {v29 .. v29}, LK0/g$a;->a()Lie/a;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    invoke-interface {v8}, LY/m;->j()LY/d;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    if-nez v5, :cond_7

    .line 189
    .line 190
    invoke-static {}, LY/h;->d()V

    .line 191
    .line 192
    .line 193
    :cond_7
    invoke-interface {v8}, LY/m;->I()V

    .line 194
    .line 195
    .line 196
    invoke-interface {v8}, LY/m;->e()Z

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    if-eqz v5, :cond_8

    .line 201
    .line 202
    invoke-interface {v8, v4}, LY/m;->h(Lie/a;)V

    .line 203
    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_8
    invoke-interface {v8}, LY/m;->s()V

    .line 207
    .line 208
    .line 209
    :goto_4
    invoke-static {v8}, LY/m2;->b(LY/m;)LY/m;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    invoke-virtual/range {v29 .. v29}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    invoke-static {v4, v0, v5}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v29 .. v29}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-static {v4, v3, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v29 .. v29}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-interface {v4}, LY/m;->e()Z

    .line 232
    .line 233
    .line 234
    move-result v3

    .line 235
    if-nez v3, :cond_9

    .line 236
    .line 237
    invoke-interface {v4}, LY/m;->D()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 242
    .line 243
    .line 244
    move-result-object v5

    .line 245
    invoke-static {v3, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    if-nez v3, :cond_a

    .line 250
    .line 251
    :cond_9
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    invoke-interface {v4, v3}, LY/m;->u(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    invoke-interface {v4, v2, v0}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 263
    .line 264
    .line 265
    :cond_a
    invoke-virtual/range {v29 .. v29}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    invoke-static {v4, v1, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 270
    .line 271
    .line 272
    sget-object v0, LC/j;->a:LC/j;

    .line 273
    .line 274
    invoke-virtual {v6}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;->getTemplateConfiguration()Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration;->getImages()Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Images;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Images;->getHeaderUri()Landroid/net/Uri;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-static {v1, v13, v8, v12}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt;->HeaderImage(Landroid/net/Uri;ZLY/m;I)V

    .line 287
    .line 288
    .line 289
    const/4 v4, 0x2

    .line 290
    const/4 v5, 0x0

    .line 291
    const/high16 v2, 0x3f800000    # 1.0f

    .line 292
    .line 293
    const/4 v3, 0x0

    .line 294
    move-object v1, v14

    .line 295
    invoke-static/range {v0 .. v5}, LC/i;->c(LC/i;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    invoke-static {v2, v8, v12}, LC/K;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v26 .. v26}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration;->getTitle()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    sget-object v3, LU/D;->a:LU/D;

    .line 307
    .line 308
    sget v4, LU/D;->b:I

    .line 309
    .line 310
    invoke-virtual {v3, v8, v4}, LU/D;->c(LY/m;I)LU/o0;

    .line 311
    .line 312
    .line 313
    move-result-object v5

    .line 314
    invoke-virtual {v5}, LU/o0;->g()LU0/Y0;

    .line 315
    .line 316
    .line 317
    move-result-object v5

    .line 318
    sget-object v30, LY0/L;->b:LY0/L$a;

    .line 319
    .line 320
    move v13, v15

    .line 321
    invoke-virtual/range {v30 .. v30}, LY0/L$a;->a()LY0/L;

    .line 322
    .line 323
    .line 324
    move-result-object v15

    .line 325
    sget-object v31, Lg1/j;->b:Lg1/j$a;

    .line 326
    .line 327
    invoke-virtual/range {v31 .. v31}, Lg1/j$a;->a()I

    .line 328
    .line 329
    .line 330
    move-result v14

    .line 331
    move/from16 v16, v10

    .line 332
    .line 333
    move-object/from16 v17, v11

    .line 334
    .line 335
    invoke-virtual/range {v27 .. v27}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;->getText1-0d7_KjU()J

    .line 336
    .line 337
    .line 338
    move-result-wide v10

    .line 339
    sget-object v32, Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;

    .line 340
    .line 341
    invoke-virtual/range {v32 .. v32}, Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;->getDefaultHorizontalPadding-D9Ej5fM()F

    .line 342
    .line 343
    .line 344
    move-result v9

    .line 345
    invoke-virtual/range {v32 .. v32}, Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;->getDefaultVerticalSpacing-D9Ej5fM()F

    .line 346
    .line 347
    .line 348
    move-result v12

    .line 349
    invoke-static {v1, v9, v12}, Landroidx/compose/foundation/layout/p;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    .line 350
    .line 351
    .line 352
    move-result-object v9

    .line 353
    invoke-static {v14}, Lg1/j;->h(I)Lg1/j;

    .line 354
    .line 355
    .line 356
    move-result-object v12

    .line 357
    const/16 v24, 0x36

    .line 358
    .line 359
    const/16 v25, 0x2d0

    .line 360
    .line 361
    move/from16 v19, v13

    .line 362
    .line 363
    const-wide/16 v13, 0x0

    .line 364
    .line 365
    move/from16 v20, v16

    .line 366
    .line 367
    const/16 v16, 0x0

    .line 368
    .line 369
    move-object/from16 v21, v17

    .line 370
    .line 371
    const/16 v17, 0x0

    .line 372
    .line 373
    move/from16 v22, v19

    .line 374
    .line 375
    const/16 v19, 0x0

    .line 376
    .line 377
    move/from16 v23, v20

    .line 378
    .line 379
    const/16 v20, 0x1

    .line 380
    .line 381
    move-object/from16 v33, v21

    .line 382
    .line 383
    const/16 v21, 0x0

    .line 384
    .line 385
    move/from16 v34, v23

    .line 386
    .line 387
    const/high16 v23, 0x30000

    .line 388
    .line 389
    move-object v7, v8

    .line 390
    move-object v8, v2

    .line 391
    move/from16 v2, v22

    .line 392
    .line 393
    move-object/from16 v22, v7

    .line 394
    .line 395
    move-object/from16 v18, v12

    .line 396
    .line 397
    move-object/from16 v7, v33

    .line 398
    .line 399
    move-object v12, v5

    .line 400
    const/4 v5, 0x2

    .line 401
    invoke-static/range {v8 .. v25}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt;->Markdown-DkhmgE0(Ljava/lang/String;Landroidx/compose/ui/e;JLU0/Y0;JLY0/L;LY0/u;Ll0/e$b;Lg1/j;ZZZLY/m;III)V

    .line 402
    .line 403
    .line 404
    move-object/from16 v8, v22

    .line 405
    .line 406
    invoke-virtual/range {v32 .. v32}, Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;->getDefaultHorizontalPadding-D9Ej5fM()F

    .line 407
    .line 408
    .line 409
    move-result v9

    .line 410
    invoke-static {v1, v9, v2, v5, v7}, Landroidx/compose/foundation/layout/p;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    invoke-virtual/range {v28 .. v28}, Ll0/e$a;->o()Ll0/e;

    .line 415
    .line 416
    .line 417
    move-result-object v9

    .line 418
    const/4 v10, 0x0

    .line 419
    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    .line 420
    .line 421
    .line 422
    move-result-object v9

    .line 423
    invoke-static {v8, v10}, LY/h;->a(LY/m;I)I

    .line 424
    .line 425
    .line 426
    move-result v11

    .line 427
    invoke-interface {v8}, LY/m;->r()LY/I;

    .line 428
    .line 429
    .line 430
    move-result-object v12

    .line 431
    invoke-static {v8, v2}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 432
    .line 433
    .line 434
    move-result-object v2

    .line 435
    invoke-virtual/range {v29 .. v29}, LK0/g$a;->a()Lie/a;

    .line 436
    .line 437
    .line 438
    move-result-object v13

    .line 439
    invoke-interface {v8}, LY/m;->j()LY/d;

    .line 440
    .line 441
    .line 442
    move-result-object v14

    .line 443
    if-nez v14, :cond_b

    .line 444
    .line 445
    invoke-static {}, LY/h;->d()V

    .line 446
    .line 447
    .line 448
    :cond_b
    invoke-interface {v8}, LY/m;->I()V

    .line 449
    .line 450
    .line 451
    invoke-interface {v8}, LY/m;->e()Z

    .line 452
    .line 453
    .line 454
    move-result v14

    .line 455
    if-eqz v14, :cond_c

    .line 456
    .line 457
    invoke-interface {v8, v13}, LY/m;->h(Lie/a;)V

    .line 458
    .line 459
    .line 460
    goto :goto_5

    .line 461
    :cond_c
    invoke-interface {v8}, LY/m;->s()V

    .line 462
    .line 463
    .line 464
    :goto_5
    invoke-static {v8}, LY/m2;->b(LY/m;)LY/m;

    .line 465
    .line 466
    .line 467
    move-result-object v13

    .line 468
    invoke-virtual/range {v29 .. v29}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 469
    .line 470
    .line 471
    move-result-object v14

    .line 472
    invoke-static {v13, v9, v14}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 473
    .line 474
    .line 475
    invoke-virtual/range {v29 .. v29}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 476
    .line 477
    .line 478
    move-result-object v9

    .line 479
    invoke-static {v13, v12, v9}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v29 .. v29}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 483
    .line 484
    .line 485
    move-result-object v9

    .line 486
    invoke-interface {v13}, LY/m;->e()Z

    .line 487
    .line 488
    .line 489
    move-result v12

    .line 490
    if-nez v12, :cond_d

    .line 491
    .line 492
    invoke-interface {v13}, LY/m;->D()Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v12

    .line 496
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 497
    .line 498
    .line 499
    move-result-object v14

    .line 500
    invoke-static {v12, v14}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 501
    .line 502
    .line 503
    move-result v12

    .line 504
    if-nez v12, :cond_e

    .line 505
    .line 506
    :cond_d
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 507
    .line 508
    .line 509
    move-result-object v12

    .line 510
    invoke-interface {v13, v12}, LY/m;->u(Ljava/lang/Object;)V

    .line 511
    .line 512
    .line 513
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 514
    .line 515
    .line 516
    move-result-object v11

    .line 517
    invoke-interface {v13, v11, v9}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 518
    .line 519
    .line 520
    :cond_e
    invoke-virtual/range {v29 .. v29}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 521
    .line 522
    .line 523
    move-result-object v9

    .line 524
    invoke-static {v13, v2, v9}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 525
    .line 526
    .line 527
    sget-object v2, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 528
    .line 529
    invoke-virtual/range {v26 .. v26}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration;->getSubtitle()Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v2

    .line 533
    if-nez v2, :cond_f

    .line 534
    .line 535
    const-string v2, ""

    .line 536
    .line 537
    :cond_f
    invoke-virtual {v3, v8, v4}, LU/D;->c(LY/m;I)LU/o0;

    .line 538
    .line 539
    .line 540
    move-result-object v3

    .line 541
    invoke-virtual {v3}, LU/o0;->b()LU0/Y0;

    .line 542
    .line 543
    .line 544
    move-result-object v12

    .line 545
    invoke-virtual/range {v30 .. v30}, LY0/L$a;->g()LY0/L;

    .line 546
    .line 547
    .line 548
    move-result-object v15

    .line 549
    invoke-virtual/range {v31 .. v31}, Lg1/j$a;->a()I

    .line 550
    .line 551
    .line 552
    move-result v3

    .line 553
    invoke-virtual/range {v32 .. v32}, Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;->getDefaultHorizontalPadding-D9Ej5fM()F

    .line 554
    .line 555
    .line 556
    move-result v4

    .line 557
    invoke-virtual/range {v32 .. v32}, Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;->getDefaultVerticalSpacing-D9Ej5fM()F

    .line 558
    .line 559
    .line 560
    move-result v9

    .line 561
    invoke-static {v1, v4, v9}, Landroidx/compose/foundation/layout/p;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    .line 562
    .line 563
    .line 564
    move-result-object v9

    .line 565
    invoke-virtual/range {v27 .. v27}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;->getText1-0d7_KjU()J

    .line 566
    .line 567
    .line 568
    move-result-wide v13

    .line 569
    invoke-static {v3}, Lg1/j;->h(I)Lg1/j;

    .line 570
    .line 571
    .line 572
    move-result-object v18

    .line 573
    const/16 v24, 0x36

    .line 574
    .line 575
    const/16 v25, 0x2d0

    .line 576
    .line 577
    move/from16 v35, v10

    .line 578
    .line 579
    move-wide v10, v13

    .line 580
    const-wide/16 v13, 0x0

    .line 581
    .line 582
    const/16 v16, 0x0

    .line 583
    .line 584
    const/16 v17, 0x0

    .line 585
    .line 586
    const/16 v19, 0x0

    .line 587
    .line 588
    const/16 v20, 0x1

    .line 589
    .line 590
    const/16 v21, 0x0

    .line 591
    .line 592
    const/high16 v23, 0x30000

    .line 593
    .line 594
    move-object/from16 v22, v8

    .line 595
    .line 596
    move-object v8, v2

    .line 597
    invoke-static/range {v8 .. v25}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt;->Markdown-DkhmgE0(Ljava/lang/String;Landroidx/compose/ui/e;JLU0/Y0;JLY0/L;LY0/u;Ll0/e$b;Lg1/j;ZZZLY/m;III)V

    .line 598
    .line 599
    .line 600
    move-object/from16 v8, v22

    .line 601
    .line 602
    invoke-interface {v8}, LY/m;->x()V

    .line 603
    .line 604
    .line 605
    const/4 v4, 0x2

    .line 606
    move v2, v5

    .line 607
    const/4 v5, 0x0

    .line 608
    move v3, v2

    .line 609
    const/high16 v2, 0x40000000    # 2.0f

    .line 610
    .line 611
    move v9, v3

    .line 612
    const/4 v3, 0x0

    .line 613
    move v11, v9

    .line 614
    move/from16 v10, v34

    .line 615
    .line 616
    move/from16 v12, v35

    .line 617
    .line 618
    move-object/from16 v9, p0

    .line 619
    .line 620
    invoke-static/range {v0 .. v5}, LC/i;->c(LC/i;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    invoke-static {v0, v8, v12}, LC/K;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 625
    .line 626
    .line 627
    invoke-interface {v8}, LY/m;->x()V

    .line 628
    .line 629
    .line 630
    invoke-interface {v8}, LY/m;->O()V

    .line 631
    .line 632
    .line 633
    goto :goto_6

    .line 634
    :cond_10
    move-object v9, v0

    .line 635
    move-object v7, v11

    .line 636
    const/4 v11, 0x2

    .line 637
    const v0, 0x3644f266

    .line 638
    .line 639
    .line 640
    invoke-interface {v8, v0}, LY/m;->V(I)V

    .line 641
    .line 642
    .line 643
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 644
    .line 645
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;

    .line 646
    .line 647
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;->getDefaultVerticalSpacing-D9Ej5fM()F

    .line 648
    .line 649
    .line 650
    move-result v1

    .line 651
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/s;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    .line 652
    .line 653
    .line 654
    move-result-object v0

    .line 655
    invoke-static {v0, v8, v12}, LC/K;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 656
    .line 657
    .line 658
    invoke-interface {v8}, LY/m;->O()V

    .line 659
    .line 660
    .line 661
    :goto_6
    invoke-static {v6, v7, v8, v10, v11}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferDetailsKt;->OfferDetails(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;LY/m;II)V

    .line 662
    .line 663
    .line 664
    invoke-static {}, LY/w;->L()Z

    .line 665
    .line 666
    .line 667
    move-result v0

    .line 668
    if-eqz v0, :cond_11

    .line 669
    .line 670
    invoke-static {}, LY/w;->T()V

    .line 671
    .line 672
    .line 673
    :cond_11
    :goto_7
    invoke-interface {v8}, LY/m;->k()LY/B1;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    if-eqz v0, :cond_12

    .line 678
    .line 679
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$Template1MainContent$2;

    .line 680
    .line 681
    move/from16 v7, p3

    .line 682
    .line 683
    invoke-direct {v1, v9, v6, v7}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$Template1MainContent$2;-><init>(LC/i;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;I)V

    .line 684
    .line 685
    .line 686
    invoke-interface {v0, v1}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 687
    .line 688
    .line 689
    :cond_12
    return-void
.end method

.method private static final Template1NoFooterPaywallPreview(LY/m;I)V
    .locals 9

    .line 1
    const v0, 0x15a82be2

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
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.templates.Template1NoFooterPaywallPreview (Template1.kt:223)"

    .line 29
    .line 30
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;

    .line 34
    .line 35
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$Template1NoFooterPaywallPreview$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$Template1NoFooterPaywallPreview$1;

    .line 36
    .line 37
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;-><init>(Lie/a;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->build()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/MockViewModel;

    .line 45
    .line 46
    sget-object v2, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;

    .line 47
    .line 48
    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;->getTemplate1OfferingNoFooter()Lcom/revenuecat/purchases/Offering;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    const/16 v7, 0x1d

    .line 53
    .line 54
    const/4 v8, 0x0

    .line 55
    const/4 v2, 0x0

    .line 56
    const/4 v4, 0x0

    .line 57
    const/4 v5, 0x0

    .line 58
    const/4 v6, 0x0

    .line 59
    invoke-direct/range {v1 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/MockViewModel;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 60
    .line 61
    .line 62
    const/4 v2, 0x0

    .line 63
    invoke-static {v0, v1, p0, v2, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt;->InternalPaywall(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;LY/m;II)V

    .line 64
    .line 65
    .line 66
    invoke-static {}, LY/w;->L()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    invoke-static {}, LY/w;->T()V

    .line 73
    .line 74
    .line 75
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    if-eqz p0, :cond_4

    .line 80
    .line 81
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$Template1NoFooterPaywallPreview$2;

    .line 82
    .line 83
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$Template1NoFooterPaywallPreview$2;-><init>(I)V

    .line 84
    .line 85
    .line 86
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 87
    .line 88
    .line 89
    :cond_4
    return-void
.end method

.method private static final Template1PaywallPreview(LY/m;I)V
    .locals 9

    .line 1
    const v0, 0x32e8943e

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
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.templates.Template1PaywallPreview (Template1.kt:214)"

    .line 29
    .line 30
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;

    .line 34
    .line 35
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$Template1PaywallPreview$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$Template1PaywallPreview$1;

    .line 36
    .line 37
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;-><init>(Lie/a;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;->build()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/MockViewModel;

    .line 45
    .line 46
    sget-object v2, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;

    .line 47
    .line 48
    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;->getTemplate1Offering()Lcom/revenuecat/purchases/Offering;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    const/16 v7, 0x1d

    .line 53
    .line 54
    const/4 v8, 0x0

    .line 55
    const/4 v2, 0x0

    .line 56
    const/4 v4, 0x0

    .line 57
    const/4 v5, 0x0

    .line 58
    const/4 v6, 0x0

    .line 59
    invoke-direct/range {v1 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/MockViewModel;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 60
    .line 61
    .line 62
    const/4 v2, 0x0

    .line 63
    invoke-static {v0, v1, p0, v2, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt;->InternalPaywall(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;LY/m;II)V

    .line 64
    .line 65
    .line 66
    invoke-static {}, LY/w;->L()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    invoke-static {}, LY/w;->T()V

    .line 73
    .line 74
    .line 75
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    if-eqz p0, :cond_4

    .line 80
    .line 81
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$Template1PaywallPreview$2;

    .line 82
    .line 83
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$Template1PaywallPreview$2;-><init>(I)V

    .line 84
    .line 85
    .line 86
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 87
    .line 88
    .line 89
    :cond_4
    return-void
.end method

.method public static final synthetic access$CircleMask(ZLkotlin/jvm/functions/Function2;LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt;->CircleMask(ZLkotlin/jvm/functions/Function2;LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$CircleMask$circleOffsetX(FJ)F
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt;->CircleMask$circleOffsetX(FJ)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$CircleMask$circleOffsetY(FJ)F
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt;->CircleMask$circleOffsetY(FJ)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$CircleMaskPreview(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt;->CircleMaskPreview(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$HeaderImage(Landroid/net/Uri;ZLY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt;->HeaderImage(Landroid/net/Uri;ZLY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$Template1CondensedFooterPaywallPreview(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt;->Template1CondensedFooterPaywallPreview(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$Template1FooterPaywallPreview(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt;->Template1FooterPaywallPreview(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$Template1MainContent(LC/i;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt;->Template1MainContent(LC/i;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$Template1NoFooterPaywallPreview(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt;->Template1NoFooterPaywallPreview(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$Template1PaywallPreview(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt;->Template1PaywallPreview(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
