.class public final Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a\'\u0010\u0005\u001a\u00020\u00032\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0013\u0010\u0008\u001a\u00020\u0007*\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a!\u0010\n\u001a\u00020\u0003*\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0003\u00a2\u0006\u0004\u0008\n\u0010\u0006\u001a\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u0015\u0010\u0010\u001a\u00020\u000f*\u0004\u0018\u00010\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u0013\u0010\u0012\u001a\u00020\u000f*\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0011\u00a8\u0006\u0015\u00b2\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;",
        "transition",
        "Lkotlin/Function0;",
        "LTd/L;",
        "content",
        "TransitionView",
        "(Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;Lkotlin/jvm/functions/Function2;LY/m;I)V",
        "Landroidx/compose/ui/e;",
        "hidden",
        "(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;",
        "AnimatedVisibility",
        "Landroidx/compose/animation/h;",
        "enterTransition",
        "(Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;)Landroidx/compose/animation/h;",
        "Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;",
        "Lw/D;",
        "easing",
        "(Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;)Lw/D;",
        "getEasing",
        "",
        "shouldShow",
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
.method private static final AnimatedVisibility(Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;Lkotlin/jvm/functions/Function2;LY/m;I)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;",
            "Lkotlin/jvm/functions/Function2;",
            "LY/m;",
            "I)V"
        }
    .end annotation

    .line 1
    const v0, 0x175bad19

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object v7

    .line 8
    and-int/lit8 p2, p3, 0x6

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-nez p2, :cond_1

    .line 12
    .line 13
    invoke-interface {v7, p0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    const/4 p2, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move p2, v1

    .line 22
    :goto_0
    or-int/2addr p2, p3

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move p2, p3

    .line 25
    :goto_1
    and-int/lit8 v2, p3, 0x30

    .line 26
    .line 27
    if-nez v2, :cond_3

    .line 28
    .line 29
    invoke-interface {v7, p1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    const/16 v2, 0x20

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    const/16 v2, 0x10

    .line 39
    .line 40
    :goto_2
    or-int/2addr p2, v2

    .line 41
    :cond_3
    and-int/lit8 v2, p2, 0x13

    .line 42
    .line 43
    const/16 v3, 0x12

    .line 44
    .line 45
    if-ne v2, v3, :cond_5

    .line 46
    .line 47
    invoke-interface {v7}, LY/m;->i()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-nez v2, :cond_4

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_4
    invoke-interface {v7}, LY/m;->K()V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_4

    .line 58
    .line 59
    :cond_5
    :goto_3
    invoke-static {}, LY/w;->L()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_6

    .line 64
    .line 65
    const/4 v2, -0x1

    .line 66
    const-string v3, "com.revenuecat.purchases.ui.revenuecatui.components.AnimatedVisibility (TransitionView.kt:57)"

    .line 67
    .line 68
    invoke-static {v0, p2, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :cond_6
    const v0, 0x573aa58c

    .line 72
    .line 73
    .line 74
    invoke-interface {v7, v0}, LY/m;->V(I)V

    .line 75
    .line 76
    .line 77
    invoke-interface {v7, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    invoke-interface {v7}, LY/m;->D()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    const/4 v3, 0x0

    .line 86
    if-nez v0, :cond_7

    .line 87
    .line 88
    sget-object v0, LY/m;->a:LY/m$a;

    .line 89
    .line 90
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    if-ne v2, v0, :cond_8

    .line 95
    .line 96
    :cond_7
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 97
    .line 98
    invoke-static {v0, v3, v1, v3}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-interface {v7, v2}, LY/m;->u(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    :cond_8
    check-cast v2, LY/C0;

    .line 106
    .line 107
    invoke-interface {v7}, LY/m;->O()V

    .line 108
    .line 109
    .line 110
    const v0, 0x573aadc5

    .line 111
    .line 112
    .line 113
    invoke-interface {v7, v0}, LY/m;->V(I)V

    .line 114
    .line 115
    .line 116
    invoke-interface {v7, v2}, LY/m;->U(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    invoke-interface {v7}, LY/m;->D()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    if-nez v0, :cond_9

    .line 125
    .line 126
    sget-object v0, LY/m;->a:LY/m$a;

    .line 127
    .line 128
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    if-ne v1, v0, :cond_a

    .line 133
    .line 134
    :cond_9
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt$AnimatedVisibility$1$1;

    .line 135
    .line 136
    invoke-direct {v1, v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt$AnimatedVisibility$1$1;-><init>(LY/C0;LZd/e;)V

    .line 137
    .line 138
    .line 139
    invoke-interface {v7, v1}, LY/m;->u(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :cond_a
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 143
    .line 144
    invoke-interface {v7}, LY/m;->O()V

    .line 145
    .line 146
    .line 147
    and-int/lit8 p2, p2, 0xe

    .line 148
    .line 149
    invoke-static {p0, v1, v7, p2}, LY/b0;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 150
    .line 151
    .line 152
    invoke-static {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt;->AnimatedVisibility$lambda$3(LY/C0;)Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt;->enterTransition(Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;)Landroidx/compose/animation/h;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    new-instance p2, Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt$AnimatedVisibility$2;

    .line 161
    .line 162
    invoke-direct {p2, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt$AnimatedVisibility$2;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 163
    .line 164
    .line 165
    const/16 v0, 0x36

    .line 166
    .line 167
    const v2, 0x700bcf41

    .line 168
    .line 169
    .line 170
    const/4 v4, 0x1

    .line 171
    invoke-static {v2, v4, p2, v7, v0}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    const/high16 v8, 0x30000

    .line 176
    .line 177
    const/16 v9, 0x1a

    .line 178
    .line 179
    const/4 v2, 0x0

    .line 180
    const/4 v4, 0x0

    .line 181
    const/4 v5, 0x0

    .line 182
    invoke-static/range {v1 .. v9}, Lv/d;->e(ZLandroidx/compose/ui/e;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;Lie/o;LY/m;II)V

    .line 183
    .line 184
    .line 185
    invoke-static {}, LY/w;->L()Z

    .line 186
    .line 187
    .line 188
    move-result p2

    .line 189
    if-eqz p2, :cond_b

    .line 190
    .line 191
    invoke-static {}, LY/w;->T()V

    .line 192
    .line 193
    .line 194
    :cond_b
    :goto_4
    invoke-interface {v7}, LY/m;->k()LY/B1;

    .line 195
    .line 196
    .line 197
    move-result-object p2

    .line 198
    if-eqz p2, :cond_c

    .line 199
    .line 200
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt$AnimatedVisibility$3;

    .line 201
    .line 202
    invoke-direct {v0, p0, p1, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt$AnimatedVisibility$3;-><init>(Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;Lkotlin/jvm/functions/Function2;I)V

    .line 203
    .line 204
    .line 205
    invoke-interface {p2, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 206
    .line 207
    .line 208
    :cond_c
    return-void
.end method

.method private static final AnimatedVisibility$lambda$3(LY/C0;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/C0;",
            ")Z"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static final AnimatedVisibility$lambda$4(LY/C0;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/C0;",
            "Z)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

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

.method public static final TransitionView(Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;Lkotlin/jvm/functions/Function2;LY/m;I)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;",
            "Lkotlin/jvm/functions/Function2;",
            "LY/m;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    const-string v3, "content"

    .line 8
    .line 9
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const v3, 0x687e51f2

    .line 13
    .line 14
    .line 15
    move-object/from16 v4, p2

    .line 16
    .line 17
    invoke-interface {v4, v3}, LY/m;->g(I)LY/m;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    and-int/lit8 v5, v2, 0x6

    .line 22
    .line 23
    if-nez v5, :cond_1

    .line 24
    .line 25
    invoke-interface {v4, v0}, LY/m;->F(Ljava/lang/Object;)Z

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
    or-int/2addr v5, v2

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v5, v2

    .line 37
    :goto_1
    and-int/lit8 v6, v2, 0x30

    .line 38
    .line 39
    if-nez v6, :cond_3

    .line 40
    .line 41
    invoke-interface {v4, v1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-eqz v6, :cond_2

    .line 46
    .line 47
    const/16 v6, 0x20

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/16 v6, 0x10

    .line 51
    .line 52
    :goto_2
    or-int/2addr v5, v6

    .line 53
    :cond_3
    and-int/lit8 v6, v5, 0x13

    .line 54
    .line 55
    const/16 v7, 0x12

    .line 56
    .line 57
    if-ne v6, v7, :cond_5

    .line 58
    .line 59
    invoke-interface {v4}, LY/m;->i()Z

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    if-nez v6, :cond_4

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_4
    invoke-interface {v4}, LY/m;->K()V

    .line 67
    .line 68
    .line 69
    goto/16 :goto_8

    .line 70
    .line 71
    :cond_5
    :goto_3
    invoke-static {}, LY/w;->L()Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-eqz v6, :cond_6

    .line 76
    .line 77
    const/4 v6, -0x1

    .line 78
    const-string v7, "com.revenuecat.purchases.ui.revenuecatui.components.TransitionView (TransitionView.kt:29)"

    .line 79
    .line 80
    invoke-static {v3, v5, v6, v7}, LY/w;->U(IIILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_6
    if-nez v0, :cond_7

    .line 84
    .line 85
    const v3, 0x57d82c40

    .line 86
    .line 87
    .line 88
    invoke-interface {v4, v3}, LY/m;->V(I)V

    .line 89
    .line 90
    .line 91
    shr-int/lit8 v3, v5, 0x3

    .line 92
    .line 93
    and-int/lit8 v3, v3, 0xe

    .line 94
    .line 95
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-interface {v1, v4, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    invoke-interface {v4}, LY/m;->O()V

    .line 103
    .line 104
    .line 105
    goto/16 :goto_7

    .line 106
    .line 107
    :cond_7
    const v3, 0x57d8cf3e

    .line 108
    .line 109
    .line 110
    invoke-interface {v4, v3}, LY/m;->V(I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;->getDisplacementStrategy()Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$DisplacementStrategy;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    sget-object v6, Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$DisplacementStrategy;->GREEDY:Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$DisplacementStrategy;

    .line 118
    .line 119
    const/4 v8, 0x1

    .line 120
    if-ne v3, v6, :cond_10

    .line 121
    .line 122
    const v3, 0x57da2e0d

    .line 123
    .line 124
    .line 125
    invoke-interface {v4, v3}, LY/m;->V(I)V

    .line 126
    .line 127
    .line 128
    sget-object v3, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 129
    .line 130
    sget-object v6, Ll0/e;->a:Ll0/e$a;

    .line 131
    .line 132
    invoke-virtual {v6}, Ll0/e$a;->o()Ll0/e;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    const/4 v10, 0x0

    .line 137
    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    .line 138
    .line 139
    .line 140
    move-result-object v9

    .line 141
    invoke-static {v4, v10}, LY/h;->a(LY/m;I)I

    .line 142
    .line 143
    .line 144
    move-result v11

    .line 145
    invoke-interface {v4}, LY/m;->r()LY/I;

    .line 146
    .line 147
    .line 148
    move-result-object v12

    .line 149
    invoke-static {v4, v3}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 150
    .line 151
    .line 152
    move-result-object v13

    .line 153
    sget-object v14, LK0/g;->M:LK0/g$a;

    .line 154
    .line 155
    invoke-virtual {v14}, LK0/g$a;->a()Lie/a;

    .line 156
    .line 157
    .line 158
    move-result-object v15

    .line 159
    invoke-interface {v4}, LY/m;->j()LY/d;

    .line 160
    .line 161
    .line 162
    move-result-object v16

    .line 163
    if-nez v16, :cond_8

    .line 164
    .line 165
    invoke-static {}, LY/h;->d()V

    .line 166
    .line 167
    .line 168
    :cond_8
    invoke-interface {v4}, LY/m;->I()V

    .line 169
    .line 170
    .line 171
    invoke-interface {v4}, LY/m;->e()Z

    .line 172
    .line 173
    .line 174
    move-result v16

    .line 175
    if-eqz v16, :cond_9

    .line 176
    .line 177
    invoke-interface {v4, v15}, LY/m;->h(Lie/a;)V

    .line 178
    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_9
    invoke-interface {v4}, LY/m;->s()V

    .line 182
    .line 183
    .line 184
    :goto_4
    invoke-static {v4}, LY/m2;->b(LY/m;)LY/m;

    .line 185
    .line 186
    .line 187
    move-result-object v15

    .line 188
    invoke-virtual {v14}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 189
    .line 190
    .line 191
    move-result-object v7

    .line 192
    invoke-static {v15, v9, v7}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v14}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    invoke-static {v15, v12, v7}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v14}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    invoke-interface {v15}, LY/m;->e()Z

    .line 207
    .line 208
    .line 209
    move-result v9

    .line 210
    if-nez v9, :cond_a

    .line 211
    .line 212
    invoke-interface {v15}, LY/m;->D()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v9

    .line 216
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object v12

    .line 220
    invoke-static {v9, v12}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v9

    .line 224
    if-nez v9, :cond_b

    .line 225
    .line 226
    :cond_a
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 227
    .line 228
    .line 229
    move-result-object v9

    .line 230
    invoke-interface {v15, v9}, LY/m;->u(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 234
    .line 235
    .line 236
    move-result-object v9

    .line 237
    invoke-interface {v15, v9, v7}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 238
    .line 239
    .line 240
    :cond_b
    invoke-virtual {v14}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    invoke-static {v15, v13, v7}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 245
    .line 246
    .line 247
    sget-object v7, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 248
    .line 249
    invoke-static {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt;->hidden(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    invoke-virtual {v6}, Ll0/e$a;->o()Ll0/e;

    .line 254
    .line 255
    .line 256
    move-result-object v6

    .line 257
    invoke-static {v6, v10}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    .line 258
    .line 259
    .line 260
    move-result-object v6

    .line 261
    invoke-static {v4, v10}, LY/h;->a(LY/m;I)I

    .line 262
    .line 263
    .line 264
    move-result v7

    .line 265
    invoke-interface {v4}, LY/m;->r()LY/I;

    .line 266
    .line 267
    .line 268
    move-result-object v9

    .line 269
    invoke-static {v4, v3}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    invoke-virtual {v14}, LK0/g$a;->a()Lie/a;

    .line 274
    .line 275
    .line 276
    move-result-object v10

    .line 277
    invoke-interface {v4}, LY/m;->j()LY/d;

    .line 278
    .line 279
    .line 280
    move-result-object v11

    .line 281
    if-nez v11, :cond_c

    .line 282
    .line 283
    invoke-static {}, LY/h;->d()V

    .line 284
    .line 285
    .line 286
    :cond_c
    invoke-interface {v4}, LY/m;->I()V

    .line 287
    .line 288
    .line 289
    invoke-interface {v4}, LY/m;->e()Z

    .line 290
    .line 291
    .line 292
    move-result v11

    .line 293
    if-eqz v11, :cond_d

    .line 294
    .line 295
    invoke-interface {v4, v10}, LY/m;->h(Lie/a;)V

    .line 296
    .line 297
    .line 298
    goto :goto_5

    .line 299
    :cond_d
    invoke-interface {v4}, LY/m;->s()V

    .line 300
    .line 301
    .line 302
    :goto_5
    invoke-static {v4}, LY/m2;->b(LY/m;)LY/m;

    .line 303
    .line 304
    .line 305
    move-result-object v10

    .line 306
    invoke-virtual {v14}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 307
    .line 308
    .line 309
    move-result-object v11

    .line 310
    invoke-static {v10, v6, v11}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v14}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 314
    .line 315
    .line 316
    move-result-object v6

    .line 317
    invoke-static {v10, v9, v6}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v14}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 321
    .line 322
    .line 323
    move-result-object v6

    .line 324
    invoke-interface {v10}, LY/m;->e()Z

    .line 325
    .line 326
    .line 327
    move-result v9

    .line 328
    if-nez v9, :cond_e

    .line 329
    .line 330
    invoke-interface {v10}, LY/m;->D()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v9

    .line 334
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 335
    .line 336
    .line 337
    move-result-object v11

    .line 338
    invoke-static {v9, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result v9

    .line 342
    if-nez v9, :cond_f

    .line 343
    .line 344
    :cond_e
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 345
    .line 346
    .line 347
    move-result-object v9

    .line 348
    invoke-interface {v10, v9}, LY/m;->u(Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 352
    .line 353
    .line 354
    move-result-object v7

    .line 355
    invoke-interface {v10, v7, v6}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 356
    .line 357
    .line 358
    :cond_f
    invoke-virtual {v14}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 359
    .line 360
    .line 361
    move-result-object v6

    .line 362
    invoke-static {v10, v3, v6}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 363
    .line 364
    .line 365
    shr-int/lit8 v3, v5, 0x3

    .line 366
    .line 367
    and-int/lit8 v3, v3, 0xe

    .line 368
    .line 369
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 370
    .line 371
    .line 372
    move-result-object v3

    .line 373
    invoke-interface {v1, v4, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    invoke-interface {v4}, LY/m;->x()V

    .line 377
    .line 378
    .line 379
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt$TransitionView$1$2;

    .line 380
    .line 381
    invoke-direct {v3, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt$TransitionView$1$2;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 382
    .line 383
    .line 384
    const v6, 0x42c578ab

    .line 385
    .line 386
    .line 387
    const/16 v7, 0x36

    .line 388
    .line 389
    invoke-static {v6, v8, v3, v4, v7}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 390
    .line 391
    .line 392
    move-result-object v3

    .line 393
    and-int/lit8 v5, v5, 0xe

    .line 394
    .line 395
    or-int/lit8 v5, v5, 0x30

    .line 396
    .line 397
    invoke-static {v0, v3, v4, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt;->AnimatedVisibility(Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 398
    .line 399
    .line 400
    invoke-interface {v4}, LY/m;->x()V

    .line 401
    .line 402
    .line 403
    invoke-interface {v4}, LY/m;->O()V

    .line 404
    .line 405
    .line 406
    goto :goto_6

    .line 407
    :cond_10
    const v3, 0x57dd4b36

    .line 408
    .line 409
    .line 410
    invoke-interface {v4, v3}, LY/m;->V(I)V

    .line 411
    .line 412
    .line 413
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt$TransitionView$2;

    .line 414
    .line 415
    invoke-direct {v3, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt$TransitionView$2;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 416
    .line 417
    .line 418
    const v6, 0x2f88a8c8

    .line 419
    .line 420
    .line 421
    const/16 v7, 0x36

    .line 422
    .line 423
    invoke-static {v6, v8, v3, v4, v7}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 424
    .line 425
    .line 426
    move-result-object v3

    .line 427
    and-int/lit8 v5, v5, 0xe

    .line 428
    .line 429
    or-int/lit8 v5, v5, 0x30

    .line 430
    .line 431
    invoke-static {v0, v3, v4, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt;->AnimatedVisibility(Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 432
    .line 433
    .line 434
    invoke-interface {v4}, LY/m;->O()V

    .line 435
    .line 436
    .line 437
    :goto_6
    invoke-interface {v4}, LY/m;->O()V

    .line 438
    .line 439
    .line 440
    :goto_7
    invoke-static {}, LY/w;->L()Z

    .line 441
    .line 442
    .line 443
    move-result v3

    .line 444
    if-eqz v3, :cond_11

    .line 445
    .line 446
    invoke-static {}, LY/w;->T()V

    .line 447
    .line 448
    .line 449
    :cond_11
    :goto_8
    invoke-interface {v4}, LY/m;->k()LY/B1;

    .line 450
    .line 451
    .line 452
    move-result-object v3

    .line 453
    if-eqz v3, :cond_12

    .line 454
    .line 455
    new-instance v4, Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt$TransitionView$3;

    .line 456
    .line 457
    invoke-direct {v4, v0, v1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt$TransitionView$3;-><init>(Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;Lkotlin/jvm/functions/Function2;I)V

    .line 458
    .line 459
    .line 460
    invoke-interface {v3, v4}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 461
    .line 462
    .line 463
    :cond_12
    return-void
.end method

.method public static final synthetic access$AnimatedVisibility(Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;Lkotlin/jvm/functions/Function2;LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt;->AnimatedVisibility(Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$AnimatedVisibility$lambda$4(LY/C0;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt;->AnimatedVisibility$lambda$4(LY/C0;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final easing(Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;)Lw/D;
    .locals 0

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt;->getEasing(Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;)Lw/D;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    return-object p0

    .line 11
    :cond_1
    :goto_0
    invoke-static {}, Lw/F;->f()Lw/D;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method private static final enterTransition(Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;)Landroidx/compose/animation/h;
    .locals 13

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;->getType()Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$TransitionType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x2

    .line 17
    const/4 v5, 0x0

    .line 18
    const/16 v6, 0x12c

    .line 19
    .line 20
    if-eq v0, v1, :cond_b

    .line 21
    .line 22
    if-eq v0, v4, :cond_6

    .line 23
    .line 24
    const/4 v1, 0x3

    .line 25
    if-eq v0, v1, :cond_3

    .line 26
    .line 27
    const/4 v1, 0x4

    .line 28
    if-ne v0, v1, :cond_2

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;->getAnimation()Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;->getMsDuration()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    :cond_0
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;->getAnimation()Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;->getMsDelay()I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    :cond_1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;->getAnimation()Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt;->easing(Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;)Lw/D;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {v6, v5, p0}, Lw/j;->i(IILw/D;)Lw/r0;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt$enterTransition$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt$enterTransition$1;

    .line 63
    .line 64
    invoke-static {p0, v0}, Landroidx/compose/animation/f;->v(Lw/G;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/h;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :cond_2
    new-instance p0, LTd/r;

    .line 70
    .line 71
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 72
    .line 73
    .line 74
    throw p0

    .line 75
    :cond_3
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;->getAnimation()Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    if-eqz v0, :cond_4

    .line 80
    .line 81
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;->getMsDuration()I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    :cond_4
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;->getAnimation()Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    if-eqz v0, :cond_5

    .line 90
    .line 91
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;->getMsDelay()I

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    :cond_5
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;->getAnimation()Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt;->easing(Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;)Lw/D;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-static {v6, v5, p0}, Lw/j;->i(IILw/D;)Lw/r0;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    const/4 v11, 0x6

    .line 108
    const/4 v12, 0x0

    .line 109
    const/4 v8, 0x0

    .line 110
    const-wide/16 v9, 0x0

    .line 111
    .line 112
    invoke-static/range {v7 .. v12}, Landroidx/compose/animation/f;->q(Lw/G;FJILjava/lang/Object;)Landroidx/compose/animation/h;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    return-object p0

    .line 117
    :cond_6
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;->getAnimation()Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    if-eqz v0, :cond_7

    .line 122
    .line 123
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;->getMsDuration()I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    goto :goto_0

    .line 128
    :cond_7
    move v0, v6

    .line 129
    :goto_0
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;->getAnimation()Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    if-eqz v1, :cond_8

    .line 134
    .line 135
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;->getMsDelay()I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    goto :goto_1

    .line 140
    :cond_8
    move v1, v5

    .line 141
    :goto_1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;->getAnimation()Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    invoke-static {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt;->easing(Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;)Lw/D;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    invoke-static {v0, v1, v7}, Lw/j;->i(IILw/D;)Lw/r0;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-static {v0, v3, v4, v2}, Landroidx/compose/animation/f;->m(Lw/G;FILjava/lang/Object;)Landroidx/compose/animation/h;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;->getAnimation()Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    if-eqz v1, :cond_9

    .line 162
    .line 163
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;->getMsDuration()I

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    :cond_9
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;->getAnimation()Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    if-eqz v1, :cond_a

    .line 172
    .line 173
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;->getMsDelay()I

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    :cond_a
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;->getAnimation()Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt;->easing(Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;)Lw/D;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    invoke-static {v6, v5, p0}, Lw/j;->i(IILw/D;)Lw/r0;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    const/4 v11, 0x6

    .line 190
    const/4 v12, 0x0

    .line 191
    const/4 v8, 0x0

    .line 192
    const-wide/16 v9, 0x0

    .line 193
    .line 194
    invoke-static/range {v7 .. v12}, Landroidx/compose/animation/f;->q(Lw/G;FJILjava/lang/Object;)Landroidx/compose/animation/h;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    invoke-virtual {v0, p0}, Landroidx/compose/animation/h;->c(Landroidx/compose/animation/h;)Landroidx/compose/animation/h;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    return-object p0

    .line 203
    :cond_b
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;->getAnimation()Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    if-eqz v0, :cond_c

    .line 208
    .line 209
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;->getMsDuration()I

    .line 210
    .line 211
    .line 212
    move-result v6

    .line 213
    :cond_c
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;->getAnimation()Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    if-eqz v0, :cond_d

    .line 218
    .line 219
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;->getMsDelay()I

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    :cond_d
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;->getAnimation()Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt;->easing(Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;)Lw/D;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    invoke-static {v6, v5, p0}, Lw/j;->i(IILw/D;)Lw/r0;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    invoke-static {p0, v3, v4, v2}, Landroidx/compose/animation/f;->m(Lw/G;FILjava/lang/Object;)Landroidx/compose/animation/h;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    return-object p0
.end method

.method private static final getEasing(Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;)Lw/D;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;->getType()Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation$AnimationType;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt$WhenMappings;->$EnumSwitchMapping$1:[I

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    aget p0, v0, p0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    if-eq p0, v0, :cond_3

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    if-eq p0, v0, :cond_2

    .line 18
    .line 19
    const/4 v0, 0x3

    .line 20
    if-eq p0, v0, :cond_1

    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    if-ne p0, v0, :cond_0

    .line 24
    .line 25
    invoke-static {}, Lw/F;->e()Lw/D;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_0
    new-instance p0, LTd/r;

    .line 31
    .line 32
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 33
    .line 34
    .line 35
    throw p0

    .line 36
    :cond_1
    invoke-static {}, Lw/F;->f()Lw/D;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_2
    invoke-static {}, Lw/F;->c()Lw/D;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :cond_3
    invoke-static {}, Lw/F;->d()Lw/D;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method private static final hidden(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt$hidden$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/components/TransitionViewKt$hidden$1;

    .line 2
    .line 3
    invoke-static {p0, v0}, Landroidx/compose/ui/layout/i;->a(Landroidx/compose/ui/e;Lie/o;)Landroidx/compose/ui/e;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
