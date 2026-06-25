.class public final Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a,\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconName;",
        "icon",
        "Landroidx/compose/ui/e;",
        "modifier",
        "Ls0/r0;",
        "tintColor",
        "LTd/L;",
        "PaywallIcon-FNF3uiM",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconName;Landroidx/compose/ui/e;JLY/m;II)V",
        "PaywallIcon",
        "PaywallIconPreview",
        "(LY/m;I)V",
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
.method public static final PaywallIcon-FNF3uiM(Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconName;Landroidx/compose/ui/e;JLY/m;II)V
    .locals 14

    .line 1
    move/from16 v5, p5

    .line 2
    .line 3
    const-string v0, "icon"

    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const v0, 0x1012b31d

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p4

    .line 12
    .line 13
    invoke-interface {v1, v0}, LY/m;->g(I)LY/m;

    .line 14
    .line 15
    .line 16
    move-result-object v11

    .line 17
    and-int/lit8 v1, p6, 0x1

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    or-int/lit8 v1, v5, 0x6

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    and-int/lit8 v1, v5, 0x6

    .line 26
    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    invoke-interface {v11, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move v1, v2

    .line 38
    :goto_0
    or-int/2addr v1, v5

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move v1, v5

    .line 41
    :goto_1
    and-int/lit8 v3, p6, 0x2

    .line 42
    .line 43
    if-eqz v3, :cond_3

    .line 44
    .line 45
    or-int/lit8 v1, v1, 0x30

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_3
    and-int/lit8 v4, v5, 0x30

    .line 49
    .line 50
    if-nez v4, :cond_5

    .line 51
    .line 52
    invoke-interface {v11, p1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_4

    .line 57
    .line 58
    const/16 v4, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    const/16 v4, 0x10

    .line 62
    .line 63
    :goto_2
    or-int/2addr v1, v4

    .line 64
    :cond_5
    :goto_3
    and-int/lit8 v4, p6, 0x4

    .line 65
    .line 66
    if-eqz v4, :cond_6

    .line 67
    .line 68
    or-int/lit16 v1, v1, 0x180

    .line 69
    .line 70
    move-wide/from16 v9, p2

    .line 71
    .line 72
    goto :goto_5

    .line 73
    :cond_6
    and-int/lit16 v4, v5, 0x180

    .line 74
    .line 75
    move-wide/from16 v9, p2

    .line 76
    .line 77
    if-nez v4, :cond_8

    .line 78
    .line 79
    invoke-interface {v11, v9, v10}, LY/m;->d(J)Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-eqz v4, :cond_7

    .line 84
    .line 85
    const/16 v4, 0x100

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_7
    const/16 v4, 0x80

    .line 89
    .line 90
    :goto_4
    or-int/2addr v1, v4

    .line 91
    :cond_8
    :goto_5
    and-int/lit16 v4, v1, 0x93

    .line 92
    .line 93
    const/16 v6, 0x92

    .line 94
    .line 95
    if-ne v4, v6, :cond_b

    .line 96
    .line 97
    invoke-interface {v11}, LY/m;->i()Z

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    if-nez v4, :cond_9

    .line 102
    .line 103
    goto :goto_7

    .line 104
    :cond_9
    invoke-interface {v11}, LY/m;->K()V

    .line 105
    .line 106
    .line 107
    :cond_a
    :goto_6
    move-object v2, p1

    .line 108
    goto :goto_8

    .line 109
    :cond_b
    :goto_7
    if-eqz v3, :cond_c

    .line 110
    .line 111
    sget-object p1, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 112
    .line 113
    :cond_c
    invoke-static {}, LY/w;->L()Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-eqz v3, :cond_d

    .line 118
    .line 119
    const/4 v3, -0x1

    .line 120
    const-string v4, "com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIcon (PaywallIcon.kt:23)"

    .line 121
    .line 122
    invoke-static {v0, v1, v3, v4}, LY/w;->U(IIILjava/lang/String;)V

    .line 123
    .line 124
    .line 125
    :cond_d
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 126
    .line 127
    const/high16 v3, 0x3f800000    # 1.0f

    .line 128
    .line 129
    const/4 v4, 0x0

    .line 130
    const/4 v6, 0x0

    .line 131
    invoke-static {v0, v3, v4, v2, v6}, Landroidx/compose/foundation/layout/c;->b(Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    const/4 v2, 0x0

    .line 136
    const/4 v3, 0x1

    .line 137
    invoke-static {v0, v2, v3, v6}, Landroidx/compose/foundation/layout/s;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-interface {v0, p1}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconName;->drawable$revenuecatui_defaultsBc8Release()I

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    invoke-static {v0, v11, v4}, LP0/c;->c(ILY/m;I)Lw0/b;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    shl-int/lit8 v0, v1, 0x3

    .line 154
    .line 155
    and-int/lit16 v0, v0, 0x1c00

    .line 156
    .line 157
    or-int/lit8 v12, v0, 0x30

    .line 158
    .line 159
    const/4 v13, 0x0

    .line 160
    const/4 v7, 0x0

    .line 161
    invoke-static/range {v6 .. v13}, LU/B;->a(Lw0/b;Ljava/lang/String;Landroidx/compose/ui/e;JLY/m;II)V

    .line 162
    .line 163
    .line 164
    invoke-static {}, LY/w;->L()Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eqz v0, :cond_a

    .line 169
    .line 170
    invoke-static {}, LY/w;->T()V

    .line 171
    .line 172
    .line 173
    goto :goto_6

    .line 174
    :goto_8
    invoke-interface {v11}, LY/m;->k()LY/B1;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    if-eqz p1, :cond_e

    .line 179
    .line 180
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt$PaywallIcon$1;

    .line 181
    .line 182
    move-object v1, p0

    .line 183
    move-wide/from16 v3, p2

    .line 184
    .line 185
    move/from16 v6, p6

    .line 186
    .line 187
    invoke-direct/range {v0 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt$PaywallIcon$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconName;Landroidx/compose/ui/e;JII)V

    .line 188
    .line 189
    .line 190
    invoke-interface {p1, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 191
    .line 192
    .line 193
    :cond_e
    return-void
.end method

.method public static final PaywallIconPreview(LY/m;I)V
    .locals 14

    .line 1
    const v0, 0x50d3bd2b

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object v11

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-interface {v11}, LY/m;->i()Z

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
    invoke-interface {v11}, LY/m;->K()V

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
    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconPreview (PaywallIcon.kt:150)"

    .line 29
    .line 30
    invoke-static {v0, p1, p0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    invoke-static {}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconName;->values()[Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconName;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    new-instance v1, LE/b$a;

    .line 38
    .line 39
    const/16 v0, 0x28

    .line 40
    .line 41
    int-to-float v0, v0

    .line 42
    invoke-static {v0}, Li1/h;->n(F)F

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    const/4 v2, 0x0

    .line 47
    invoke-direct {v1, v0, v2}, LE/b$a;-><init>(FLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 48
    .line 49
    .line 50
    const v0, 0x367b2369

    .line 51
    .line 52
    .line 53
    invoke-interface {v11, v0}, LY/m;->V(I)V

    .line 54
    .line 55
    .line 56
    invoke-interface {v11, p0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-interface {v11}, LY/m;->D()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    if-nez v0, :cond_3

    .line 65
    .line 66
    sget-object v0, LY/m;->a:LY/m$a;

    .line 67
    .line 68
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-ne v2, v0, :cond_4

    .line 73
    .line 74
    :cond_3
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt$PaywallIconPreview$1$1;

    .line 75
    .line 76
    invoke-direct {v2, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt$PaywallIconPreview$1$1;-><init>([Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconName;)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v11, v2}, LY/m;->u(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :cond_4
    move-object v10, v2

    .line 83
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 84
    .line 85
    invoke-interface {v11}, LY/m;->O()V

    .line 86
    .line 87
    .line 88
    const/4 v12, 0x0

    .line 89
    const/16 v13, 0x1fe

    .line 90
    .line 91
    const/4 v2, 0x0

    .line 92
    const/4 v3, 0x0

    .line 93
    const/4 v4, 0x0

    .line 94
    const/4 v5, 0x0

    .line 95
    const/4 v6, 0x0

    .line 96
    const/4 v7, 0x0

    .line 97
    const/4 v8, 0x0

    .line 98
    const/4 v9, 0x0

    .line 99
    invoke-static/range {v1 .. v13}, LE/h;->a(LE/b;Landroidx/compose/ui/e;LE/I;LC/A;ZLC/b$m;LC/b$e;Lz/n;ZLkotlin/jvm/functions/Function1;LY/m;II)V

    .line 100
    .line 101
    .line 102
    invoke-static {}, LY/w;->L()Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    if-eqz p0, :cond_5

    .line 107
    .line 108
    invoke-static {}, LY/w;->T()V

    .line 109
    .line 110
    .line 111
    :cond_5
    :goto_1
    invoke-interface {v11}, LY/m;->k()LY/B1;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    if-eqz p0, :cond_6

    .line 116
    .line 117
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt$PaywallIconPreview$2;

    .line 118
    .line 119
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt$PaywallIconPreview$2;-><init>(I)V

    .line 120
    .line 121
    .line 122
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 123
    .line 124
    .line 125
    :cond_6
    return-void
.end method
