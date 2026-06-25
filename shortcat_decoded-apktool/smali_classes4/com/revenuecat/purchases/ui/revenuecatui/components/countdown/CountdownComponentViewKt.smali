.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentViewKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001aM\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u00042\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CountdownComponentStyle;",
        "style",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;",
        "state",
        "Lkotlin/Function2;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;",
        "LZd/e;",
        "LTd/L;",
        "",
        "onClick",
        "Landroidx/compose/ui/e;",
        "modifier",
        "CountdownComponentView",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CountdownComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LY/m;II)V",
        "CountdownComponentView_Preview_Running",
        "(LY/m;I)V",
        "CountdownComponentView_Preview_TimesUp",
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
.method public static final CountdownComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CountdownComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LY/m;II)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CountdownComponentStyle;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;",
            "Lkotlin/jvm/functions/Function2;",
            "Landroidx/compose/ui/e;",
            "LY/m;",
            "II)V"
        }
    .end annotation

    .line 1
    const-string v0, "style"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "state"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onClick"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const v0, -0x6ce8b99b

    .line 17
    .line 18
    .line 19
    invoke-interface {p4, v0}, LY/m;->g(I)LY/m;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    and-int/lit8 p4, p6, 0x1

    .line 24
    .line 25
    if-eqz p4, :cond_0

    .line 26
    .line 27
    or-int/lit8 p4, p5, 0x6

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    and-int/lit8 p4, p5, 0x6

    .line 31
    .line 32
    if-nez p4, :cond_2

    .line 33
    .line 34
    invoke-interface {v6, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p4

    .line 38
    if-eqz p4, :cond_1

    .line 39
    .line 40
    const/4 p4, 0x4

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/4 p4, 0x2

    .line 43
    :goto_0
    or-int/2addr p4, p5

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    move p4, p5

    .line 46
    :goto_1
    and-int/lit8 v1, p6, 0x2

    .line 47
    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    or-int/lit8 p4, p4, 0x30

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_3
    and-int/lit8 v1, p5, 0x30

    .line 54
    .line 55
    if-nez v1, :cond_5

    .line 56
    .line 57
    invoke-interface {v6, p1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    const/16 v1, 0x20

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_4
    const/16 v1, 0x10

    .line 67
    .line 68
    :goto_2
    or-int/2addr p4, v1

    .line 69
    :cond_5
    :goto_3
    and-int/lit8 v1, p6, 0x4

    .line 70
    .line 71
    if-eqz v1, :cond_6

    .line 72
    .line 73
    or-int/lit16 p4, p4, 0x180

    .line 74
    .line 75
    goto :goto_5

    .line 76
    :cond_6
    and-int/lit16 v1, p5, 0x180

    .line 77
    .line 78
    if-nez v1, :cond_8

    .line 79
    .line 80
    invoke-interface {v6, p2}, LY/m;->F(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_7

    .line 85
    .line 86
    const/16 v1, 0x100

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_7
    const/16 v1, 0x80

    .line 90
    .line 91
    :goto_4
    or-int/2addr p4, v1

    .line 92
    :cond_8
    :goto_5
    and-int/lit8 v1, p6, 0x8

    .line 93
    .line 94
    if-eqz v1, :cond_9

    .line 95
    .line 96
    or-int/lit16 p4, p4, 0xc00

    .line 97
    .line 98
    goto :goto_7

    .line 99
    :cond_9
    and-int/lit16 v2, p5, 0xc00

    .line 100
    .line 101
    if-nez v2, :cond_b

    .line 102
    .line 103
    invoke-interface {v6, p3}, LY/m;->U(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_a

    .line 108
    .line 109
    const/16 v2, 0x800

    .line 110
    .line 111
    goto :goto_6

    .line 112
    :cond_a
    const/16 v2, 0x400

    .line 113
    .line 114
    :goto_6
    or-int/2addr p4, v2

    .line 115
    :cond_b
    :goto_7
    and-int/lit16 v2, p4, 0x493

    .line 116
    .line 117
    const/16 v3, 0x492

    .line 118
    .line 119
    if-ne v2, v3, :cond_d

    .line 120
    .line 121
    invoke-interface {v6}, LY/m;->i()Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-nez v2, :cond_c

    .line 126
    .line 127
    goto :goto_8

    .line 128
    :cond_c
    invoke-interface {v6}, LY/m;->K()V

    .line 129
    .line 130
    .line 131
    move-object p4, p3

    .line 132
    move-object p3, p2

    .line 133
    move-object p2, p1

    .line 134
    goto :goto_b

    .line 135
    :cond_d
    :goto_8
    if-eqz v1, :cond_e

    .line 136
    .line 137
    sget-object p3, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 138
    .line 139
    :cond_e
    move-object v4, p3

    .line 140
    invoke-static {}, LY/w;->L()Z

    .line 141
    .line 142
    .line 143
    move-result p3

    .line 144
    if-eqz p3, :cond_f

    .line 145
    .line 146
    const/4 p3, -0x1

    .line 147
    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentView (CountdownComponentView.kt:26)"

    .line 148
    .line 149
    invoke-static {v0, p4, p3, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 150
    .line 151
    .line 152
    :cond_f
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CountdownComponentStyle;->getDate()Ljava/util/Date;

    .line 153
    .line 154
    .line 155
    move-result-object p3

    .line 156
    const/4 v0, 0x0

    .line 157
    invoke-static {p3, v6, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt;->rememberCountdownState(Ljava/util/Date;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownState;

    .line 158
    .line 159
    .line 160
    move-result-object p3

    .line 161
    invoke-virtual {p3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownState;->getHasEnded()Z

    .line 162
    .line 163
    .line 164
    move-result p3

    .line 165
    if-eqz p3, :cond_10

    .line 166
    .line 167
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CountdownComponentStyle;->getEndStackComponentStyle()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;

    .line 168
    .line 169
    .line 170
    move-result-object p3

    .line 171
    if-eqz p3, :cond_10

    .line 172
    .line 173
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CountdownComponentStyle;->getEndStackComponentStyle()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;

    .line 174
    .line 175
    .line 176
    move-result-object p3

    .line 177
    :goto_9
    move-object v1, p3

    .line 178
    goto :goto_a

    .line 179
    :cond_10
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CountdownComponentStyle;->getCountdownStackComponentStyle()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;

    .line 180
    .line 181
    .line 182
    move-result-object p3

    .line 183
    goto :goto_9

    .line 184
    :goto_a
    and-int/lit16 v7, p4, 0x1ff0

    .line 185
    .line 186
    const/16 v8, 0x10

    .line 187
    .line 188
    const/4 v5, 0x0

    .line 189
    move-object v2, p1

    .line 190
    move-object v3, p2

    .line 191
    invoke-static/range {v1 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt;->StackComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;FLY/m;II)V

    .line 192
    .line 193
    .line 194
    move-object p2, v2

    .line 195
    move-object p3, v3

    .line 196
    invoke-static {}, LY/w;->L()Z

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    if-eqz p1, :cond_11

    .line 201
    .line 202
    invoke-static {}, LY/w;->T()V

    .line 203
    .line 204
    .line 205
    :cond_11
    move-object p4, v4

    .line 206
    :goto_b
    invoke-interface {v6}, LY/m;->k()LY/B1;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    if-eqz v0, :cond_12

    .line 211
    .line 212
    move-object p1, p0

    .line 213
    new-instance p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentViewKt$CountdownComponentView$1;

    .line 214
    .line 215
    invoke-direct/range {p0 .. p6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentViewKt$CountdownComponentView$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CountdownComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;II)V

    .line 216
    .line 217
    .line 218
    invoke-interface {v0, p0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 219
    .line 220
    .line 221
    :cond_12
    return-void
.end method

.method private static final CountdownComponentView_Preview_Running(LY/m;I)V
    .locals 25

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    const v1, 0x398056e5

    .line 4
    .line 5
    .line 6
    move-object/from16 v2, p0

    .line 7
    .line 8
    invoke-interface {v2, v1}, LY/m;->g(I)LY/m;

    .line 9
    .line 10
    .line 11
    move-result-object v6

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-interface {v6}, LY/m;->i()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-interface {v6}, LY/m;->K()V

    .line 22
    .line 23
    .line 24
    goto/16 :goto_1

    .line 25
    .line 26
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    const/4 v2, -0x1

    .line 33
    const-string v3, "com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentView_Preview_Running (CountdownComponentView.kt:45)"

    .line 34
    .line 35
    invoke-static {v1, v0, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    new-instance v8, Ljava/util/Date;

    .line 39
    .line 40
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 41
    .line 42
    .line 43
    move-result-wide v1

    .line 44
    const v3, 0xa4cb800

    .line 45
    .line 46
    .line 47
    int-to-long v3, v3

    .line 48
    add-long/2addr v1, v3

    .line 49
    invoke-direct {v8, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 50
    .line 51
    .line 52
    move-object/from16 v20, v8

    .line 53
    .line 54
    new-instance v8, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 55
    .line 56
    sget-object v1, Ls0/r0;->b:Ls0/r0$a;

    .line 57
    .line 58
    invoke-virtual {v1}, Ls0/r0$a;->a()J

    .line 59
    .line 60
    .line 61
    move-result-wide v1

    .line 62
    invoke-static {v1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->constructor-impl(J)J

    .line 63
    .line 64
    .line 65
    move-result-wide v1

    .line 66
    invoke-static {v1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->box-impl(J)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    const/4 v2, 0x2

    .line 71
    const/4 v3, 0x0

    .line 72
    invoke-direct {v8, v1, v3, v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 73
    .line 74
    .line 75
    const v23, 0xdff8

    .line 76
    .line 77
    .line 78
    const/16 v24, 0x0

    .line 79
    .line 80
    const-string v7, "{{ count_days_without_zero }}d {{ count_hours_without_zero }}h {{ count_minutes_without_zero }}m {{ count_seconds_without_zero }}s"

    .line 81
    .line 82
    const/16 v9, 0x18

    .line 83
    .line 84
    const/4 v10, 0x0

    .line 85
    const/4 v11, 0x0

    .line 86
    const/4 v12, 0x0

    .line 87
    const/4 v13, 0x0

    .line 88
    const/4 v14, 0x0

    .line 89
    const/4 v15, 0x0

    .line 90
    const/16 v16, 0x0

    .line 91
    .line 92
    const/16 v17, 0x0

    .line 93
    .line 94
    const/16 v18, 0x0

    .line 95
    .line 96
    const/16 v19, 0x0

    .line 97
    .line 98
    const/16 v21, 0x0

    .line 99
    .line 100
    const/16 v22, 0x0

    .line 101
    .line 102
    invoke-static/range {v7 .. v24}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PreviewHelpersKt;->previewTextComponentStyle$default(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;ILcom/revenuecat/purchases/paywalls/components/properties/FontWeight;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/FontSpec;Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;ZLcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Ljava/lang/Integer;Ljava/util/Date;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;Ljava/util/List;ILjava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CountdownComponentStyle;

    .line 107
    .line 108
    sget-object v4, Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;->DAYS:Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;

    .line 109
    .line 110
    invoke-static {v1}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    const/16 v22, 0x5ffe

    .line 115
    .line 116
    const/16 v23, 0x0

    .line 117
    .line 118
    const/4 v8, 0x0

    .line 119
    const/4 v9, 0x0

    .line 120
    const/4 v11, 0x0

    .line 121
    const/4 v15, 0x0

    .line 122
    invoke-static/range {v7 .. v23}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PreviewHelpersKt;->previewStackComponentStyle-7SJ-wSw$default(Ljava/util/List;Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;ZLcom/revenuecat/purchases/paywalls/components/properties/Size;FLcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;LC/A;LC/A;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/BadgeStyle;Lz/q;Ljava/util/Date;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;ILjava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;

    .line 123
    .line 124
    .line 125
    move-result-object v10

    .line 126
    const/4 v11, 0x0

    .line 127
    move-object v7, v2

    .line 128
    move-object v9, v4

    .line 129
    move-object/from16 v8, v20

    .line 130
    .line 131
    invoke-direct/range {v7 .. v12}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CountdownComponentStyle;-><init>(Ljava/util/Date;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;)V

    .line 132
    .line 133
    .line 134
    const/4 v1, 0x0

    .line 135
    const/4 v4, 0x1

    .line 136
    invoke-static {v3, v6, v1, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PreviewHelpersKt;->previewEmptyState(Ljava/lang/Integer;LY/m;II)Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    new-instance v4, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentViewKt$CountdownComponentView_Preview_Running$1;

    .line 141
    .line 142
    invoke-direct {v4, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentViewKt$CountdownComponentView_Preview_Running$1;-><init>(LZd/e;)V

    .line 143
    .line 144
    .line 145
    const/16 v7, 0x180

    .line 146
    .line 147
    const/16 v8, 0x8

    .line 148
    .line 149
    const/4 v5, 0x0

    .line 150
    move-object v3, v1

    .line 151
    invoke-static/range {v2 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentViewKt;->CountdownComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CountdownComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LY/m;II)V

    .line 152
    .line 153
    .line 154
    invoke-static {}, LY/w;->L()Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-eqz v1, :cond_3

    .line 159
    .line 160
    invoke-static {}, LY/w;->T()V

    .line 161
    .line 162
    .line 163
    :cond_3
    :goto_1
    invoke-interface {v6}, LY/m;->k()LY/B1;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    if-eqz v1, :cond_4

    .line 168
    .line 169
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentViewKt$CountdownComponentView_Preview_Running$2;

    .line 170
    .line 171
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentViewKt$CountdownComponentView_Preview_Running$2;-><init>(I)V

    .line 172
    .line 173
    .line 174
    invoke-interface {v1, v2}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 175
    .line 176
    .line 177
    :cond_4
    return-void
.end method

.method private static final CountdownComponentView_Preview_TimesUp(LY/m;I)V
    .locals 39

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    const v1, -0x762c921d

    .line 4
    .line 5
    .line 6
    move-object/from16 v2, p0

    .line 7
    .line 8
    invoke-interface {v2, v1}, LY/m;->g(I)LY/m;

    .line 9
    .line 10
    .line 11
    move-result-object v6

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-interface {v6}, LY/m;->i()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-interface {v6}, LY/m;->K()V

    .line 22
    .line 23
    .line 24
    goto/16 :goto_1

    .line 25
    .line 26
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    const/4 v2, -0x1

    .line 33
    const-string v3, "com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentView_Preview_TimesUp (CountdownComponentView.kt:73)"

    .line 34
    .line 35
    invoke-static {v1, v0, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    new-instance v8, Ljava/util/Date;

    .line 39
    .line 40
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 41
    .line 42
    .line 43
    move-result-wide v1

    .line 44
    const v3, 0xa4cb800

    .line 45
    .line 46
    .line 47
    int-to-long v3, v3

    .line 48
    sub-long/2addr v1, v3

    .line 49
    invoke-direct {v8, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 50
    .line 51
    .line 52
    move-object/from16 v20, v8

    .line 53
    .line 54
    new-instance v8, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 55
    .line 56
    sget-object v1, Ls0/r0;->b:Ls0/r0$a;

    .line 57
    .line 58
    invoke-virtual {v1}, Ls0/r0$a;->a()J

    .line 59
    .line 60
    .line 61
    move-result-wide v2

    .line 62
    invoke-static {v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->constructor-impl(J)J

    .line 63
    .line 64
    .line 65
    move-result-wide v2

    .line 66
    invoke-static {v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->box-impl(J)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    const/4 v3, 0x2

    .line 71
    const/4 v4, 0x0

    .line 72
    invoke-direct {v8, v2, v4, v3, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 73
    .line 74
    .line 75
    const v23, 0xdff8

    .line 76
    .line 77
    .line 78
    const/16 v24, 0x0

    .line 79
    .line 80
    const/16 v9, 0x18

    .line 81
    .line 82
    const/4 v10, 0x0

    .line 83
    const/4 v11, 0x0

    .line 84
    const/4 v12, 0x0

    .line 85
    const/4 v13, 0x0

    .line 86
    const/4 v14, 0x0

    .line 87
    const/4 v15, 0x0

    .line 88
    const/16 v16, 0x0

    .line 89
    .line 90
    const/16 v17, 0x0

    .line 91
    .line 92
    const/16 v18, 0x0

    .line 93
    .line 94
    const/16 v19, 0x0

    .line 95
    .line 96
    const/16 v21, 0x0

    .line 97
    .line 98
    const/16 v22, 0x0

    .line 99
    .line 100
    const-string v7, "{{ count_days_without_zero }}d {{ count_hours_without_zero }}h {{ count_minutes_without_zero }}m {{ count_seconds_without_zero }}s"

    .line 101
    .line 102
    invoke-static/range {v7 .. v24}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PreviewHelpersKt;->previewTextComponentStyle$default(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;ILcom/revenuecat/purchases/paywalls/components/properties/FontWeight;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/FontSpec;Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;ZLcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Ljava/lang/Integer;Ljava/util/Date;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;Ljava/util/List;ILjava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 107
    .line 108
    invoke-virtual {v1}, Ls0/r0$a;->a()J

    .line 109
    .line 110
    .line 111
    move-result-wide v4

    .line 112
    invoke-static {v4, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->constructor-impl(J)J

    .line 113
    .line 114
    .line 115
    move-result-wide v4

    .line 116
    invoke-static {v4, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->box-impl(J)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    const/4 v4, 0x2

    .line 121
    const/4 v5, 0x0

    .line 122
    invoke-direct {v3, v1, v5, v4, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 123
    .line 124
    .line 125
    const v37, 0xfff8

    .line 126
    .line 127
    .line 128
    const/16 v38, 0x0

    .line 129
    .line 130
    const/16 v23, 0x18

    .line 131
    .line 132
    const/16 v25, 0x0

    .line 133
    .line 134
    const/16 v26, 0x0

    .line 135
    .line 136
    const/16 v27, 0x0

    .line 137
    .line 138
    const/16 v28, 0x0

    .line 139
    .line 140
    const/16 v29, 0x0

    .line 141
    .line 142
    const/16 v30, 0x0

    .line 143
    .line 144
    const/16 v31, 0x0

    .line 145
    .line 146
    const/16 v32, 0x0

    .line 147
    .line 148
    const/16 v33, 0x0

    .line 149
    .line 150
    const/16 v34, 0x0

    .line 151
    .line 152
    const/16 v35, 0x0

    .line 153
    .line 154
    const/16 v36, 0x0

    .line 155
    .line 156
    const-string v21, "Offer expired!"

    .line 157
    .line 158
    move-object/from16 v22, v3

    .line 159
    .line 160
    invoke-static/range {v21 .. v38}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PreviewHelpersKt;->previewTextComponentStyle$default(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;ILcom/revenuecat/purchases/paywalls/components/properties/FontWeight;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/FontSpec;Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;ZLcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Ljava/lang/Integer;Ljava/util/Date;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;Ljava/util/List;ILjava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CountdownComponentStyle;

    .line 165
    .line 166
    sget-object v4, Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;->DAYS:Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;

    .line 167
    .line 168
    invoke-static {v2}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    const/16 v22, 0x5ffe

    .line 173
    .line 174
    const/16 v23, 0x0

    .line 175
    .line 176
    const/4 v8, 0x0

    .line 177
    const/4 v9, 0x0

    .line 178
    const/4 v11, 0x0

    .line 179
    const/4 v15, 0x0

    .line 180
    const/16 v21, 0x0

    .line 181
    .line 182
    invoke-static/range {v7 .. v23}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PreviewHelpersKt;->previewStackComponentStyle-7SJ-wSw$default(Ljava/util/List;Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;ZLcom/revenuecat/purchases/paywalls/components/properties/Size;FLcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;LC/A;LC/A;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/BadgeStyle;Lz/q;Ljava/util/Date;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;ILjava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;

    .line 183
    .line 184
    .line 185
    move-result-object v10

    .line 186
    invoke-static {v1}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object v21

    .line 190
    const/16 v36, 0x7ffe

    .line 191
    .line 192
    const/16 v37, 0x0

    .line 193
    .line 194
    const/16 v22, 0x0

    .line 195
    .line 196
    const/16 v23, 0x0

    .line 197
    .line 198
    const/16 v25, 0x0

    .line 199
    .line 200
    const/16 v29, 0x0

    .line 201
    .line 202
    invoke-static/range {v21 .. v37}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PreviewHelpersKt;->previewStackComponentStyle-7SJ-wSw$default(Ljava/util/List;Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;ZLcom/revenuecat/purchases/paywalls/components/properties/Size;FLcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;LC/A;LC/A;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/BadgeStyle;Lz/q;Ljava/util/Date;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;ILjava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;

    .line 203
    .line 204
    .line 205
    move-result-object v11

    .line 206
    move-object v7, v3

    .line 207
    move-object v9, v4

    .line 208
    move-object/from16 v8, v20

    .line 209
    .line 210
    invoke-direct/range {v7 .. v12}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CountdownComponentStyle;-><init>(Ljava/util/Date;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;)V

    .line 211
    .line 212
    .line 213
    move-object v2, v7

    .line 214
    const/4 v1, 0x0

    .line 215
    const/4 v3, 0x1

    .line 216
    const/4 v4, 0x0

    .line 217
    invoke-static {v4, v6, v1, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PreviewHelpersKt;->previewEmptyState(Ljava/lang/Integer;LY/m;II)Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    new-instance v4, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentViewKt$CountdownComponentView_Preview_TimesUp$1;

    .line 222
    .line 223
    const/4 v1, 0x0

    .line 224
    invoke-direct {v4, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentViewKt$CountdownComponentView_Preview_TimesUp$1;-><init>(LZd/e;)V

    .line 225
    .line 226
    .line 227
    const/16 v7, 0x180

    .line 228
    .line 229
    const/16 v8, 0x8

    .line 230
    .line 231
    invoke-static/range {v2 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentViewKt;->CountdownComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CountdownComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LY/m;II)V

    .line 232
    .line 233
    .line 234
    invoke-static {}, LY/w;->L()Z

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    if-eqz v1, :cond_3

    .line 239
    .line 240
    invoke-static {}, LY/w;->T()V

    .line 241
    .line 242
    .line 243
    :cond_3
    :goto_1
    invoke-interface {v6}, LY/m;->k()LY/B1;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    if-eqz v1, :cond_4

    .line 248
    .line 249
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentViewKt$CountdownComponentView_Preview_TimesUp$2;

    .line 250
    .line 251
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentViewKt$CountdownComponentView_Preview_TimesUp$2;-><init>(I)V

    .line 252
    .line 253
    .line 254
    invoke-interface {v1, v2}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 255
    .line 256
    .line 257
    :cond_4
    return-void
.end method

.method public static final synthetic access$CountdownComponentView_Preview_Running(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentViewKt;->CountdownComponentView_Preview_Running(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$CountdownComponentView_Preview_TimesUp(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentViewKt;->CountdownComponentView_Preview_TimesUp(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
