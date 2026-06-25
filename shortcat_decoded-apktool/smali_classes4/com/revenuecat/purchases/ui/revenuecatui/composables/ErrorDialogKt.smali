.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/composables/ErrorDialogKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u001a%\u0010\u0005\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lkotlin/Function0;",
        "LTd/L;",
        "dismissRequest",
        "",
        "error",
        "ErrorDialog",
        "(Lie/a;Ljava/lang/String;LY/m;I)V",
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
.method public static final synthetic ErrorDialog(Lie/a;Ljava/lang/String;LY/m;I)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "dismissRequest"

    .line 6
    .line 7
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "error"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const v2, 0x34291894

    .line 16
    .line 17
    .line 18
    move-object/from16 v3, p2

    .line 19
    .line 20
    invoke-interface {v3, v2}, LY/m;->g(I)LY/m;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    and-int/lit8 v4, p3, 0x6

    .line 25
    .line 26
    if-nez v4, :cond_1

    .line 27
    .line 28
    invoke-interface {v3, v0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    const/4 v4, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v4, 0x2

    .line 37
    :goto_0
    or-int v4, p3, v4

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move/from16 v4, p3

    .line 41
    .line 42
    :goto_1
    and-int/lit8 v5, p3, 0x30

    .line 43
    .line 44
    if-nez v5, :cond_3

    .line 45
    .line 46
    invoke-interface {v3, v1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_2

    .line 51
    .line 52
    const/16 v5, 0x20

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const/16 v5, 0x10

    .line 56
    .line 57
    :goto_2
    or-int/2addr v4, v5

    .line 58
    :cond_3
    and-int/lit8 v5, v4, 0x13

    .line 59
    .line 60
    const/16 v6, 0x12

    .line 61
    .line 62
    if-ne v5, v6, :cond_5

    .line 63
    .line 64
    invoke-interface {v3}, LY/m;->i()Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-nez v5, :cond_4

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_4
    invoke-interface {v3}, LY/m;->K()V

    .line 72
    .line 73
    .line 74
    move-object/from16 v18, v3

    .line 75
    .line 76
    goto :goto_4

    .line 77
    :cond_5
    :goto_3
    invoke-static {}, LY/w;->L()Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-eqz v5, :cond_6

    .line 82
    .line 83
    const/4 v5, -0x1

    .line 84
    const-string v6, "com.revenuecat.purchases.ui.revenuecatui.composables.ErrorDialog (ErrorDialog.kt:18)"

    .line 85
    .line 86
    invoke-static {v2, v4, v5, v6}, LY/w;->U(IIILjava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :cond_6
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ErrorDialogKt$ErrorDialog$1;

    .line 90
    .line 91
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ErrorDialogKt$ErrorDialog$1;-><init>(Lie/a;)V

    .line 92
    .line 93
    .line 94
    const v5, 0x72f962dc

    .line 95
    .line 96
    .line 97
    const/4 v6, 0x1

    .line 98
    const/16 v7, 0x36

    .line 99
    .line 100
    invoke-static {v5, v6, v2, v3, v7}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    sget-object v5, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ComposableSingletons$ErrorDialogKt;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/ComposableSingletons$ErrorDialogKt;

    .line 105
    .line 106
    invoke-virtual {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ComposableSingletons$ErrorDialogKt;->getLambda-2$revenuecatui_defaultsBc8Release()Lkotlin/jvm/functions/Function2;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    new-instance v8, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ErrorDialogKt$ErrorDialog$2;

    .line 111
    .line 112
    invoke-direct {v8, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ErrorDialogKt$ErrorDialog$2;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    const v9, -0x56dd779f

    .line 116
    .line 117
    .line 118
    invoke-static {v9, v6, v8, v3, v7}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    and-int/lit8 v4, v4, 0xe

    .line 123
    .line 124
    const v7, 0x186030

    .line 125
    .line 126
    .line 127
    or-int v19, v4, v7

    .line 128
    .line 129
    const/16 v20, 0x0

    .line 130
    .line 131
    const/16 v21, 0x3fac

    .line 132
    .line 133
    move-object v1, v2

    .line 134
    const/4 v2, 0x0

    .line 135
    move-object/from16 v18, v3

    .line 136
    .line 137
    const/4 v3, 0x0

    .line 138
    move-object v4, v5

    .line 139
    const/4 v5, 0x0

    .line 140
    const/4 v7, 0x0

    .line 141
    const-wide/16 v8, 0x0

    .line 142
    .line 143
    const-wide/16 v10, 0x0

    .line 144
    .line 145
    const-wide/16 v12, 0x0

    .line 146
    .line 147
    const-wide/16 v14, 0x0

    .line 148
    .line 149
    const/16 v16, 0x0

    .line 150
    .line 151
    const/16 v17, 0x0

    .line 152
    .line 153
    invoke-static/range {v0 .. v21}, LU/c;->a(Lie/a;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Ls0/E1;JJJJFLandroidx/compose/ui/window/k;LY/m;III)V

    .line 154
    .line 155
    .line 156
    invoke-static {}, LY/w;->L()Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-eqz v1, :cond_7

    .line 161
    .line 162
    invoke-static {}, LY/w;->T()V

    .line 163
    .line 164
    .line 165
    :cond_7
    :goto_4
    invoke-interface/range {v18 .. v18}, LY/m;->k()LY/B1;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    if-eqz v1, :cond_8

    .line 170
    .line 171
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ErrorDialogKt$ErrorDialog$3;

    .line 172
    .line 173
    move-object/from16 v3, p1

    .line 174
    .line 175
    move/from16 v4, p3

    .line 176
    .line 177
    invoke-direct {v2, v0, v3, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ErrorDialogKt$ErrorDialog$3;-><init>(Lie/a;Ljava/lang/String;I)V

    .line 178
    .line 179
    .line 180
    invoke-interface {v1, v2}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 181
    .line 182
    .line 183
    :cond_8
    return-void
.end method
