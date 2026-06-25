.class public final Lcom/revenuecat/purchases/ui/revenuecatui/views/RevenueCatThemeKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lkotlin/Function0;",
        "LTd/L;",
        "content",
        "RevenueCatTheme",
        "(Lkotlin/jvm/functions/Function2;LY/m;I)V",
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
.method public static final RevenueCatTheme(Lkotlin/jvm/functions/Function2;LY/m;I)V
    .locals 83
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2;",
            "LY/m;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v3, p0

    .line 2
    .line 3
    move/from16 v7, p2

    .line 4
    .line 5
    const-string v0, "content"

    .line 6
    .line 7
    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const v0, 0x1ada5f23

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    invoke-interface {v1, v0}, LY/m;->g(I)LY/m;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    and-int/lit8 v1, v7, 0x6

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    invoke-interface {v4, v3}, LY/m;->F(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    const/4 v1, 0x4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v1, v2

    .line 33
    :goto_0
    or-int/2addr v1, v7

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v1, v7

    .line 36
    :goto_1
    and-int/lit8 v5, v1, 0x3

    .line 37
    .line 38
    if-ne v5, v2, :cond_3

    .line 39
    .line 40
    invoke-interface {v4}, LY/m;->i()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-nez v2, :cond_2

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    invoke-interface {v4}, LY/m;->K()V

    .line 48
    .line 49
    .line 50
    goto/16 :goto_4

    .line 51
    .line 52
    :cond_3
    :goto_2
    invoke-static {}, LY/w;->L()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_4

    .line 57
    .line 58
    const/4 v2, -0x1

    .line 59
    const-string v5, "com.revenuecat.purchases.ui.revenuecatui.views.RevenueCatTheme (RevenueCatTheme.kt:9)"

    .line 60
    .line 61
    invoke-static {v0, v1, v2, v5}, LY/w;->U(IIILjava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :cond_4
    const/4 v0, 0x0

    .line 65
    invoke-static {v4, v0}, Lx/m;->a(LY/m;I)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    const/16 v81, 0xf

    .line 70
    .line 71
    const/16 v82, 0x0

    .line 72
    .line 73
    const-wide/16 v8, 0x0

    .line 74
    .line 75
    const-wide/16 v10, 0x0

    .line 76
    .line 77
    const-wide/16 v12, 0x0

    .line 78
    .line 79
    const-wide/16 v14, 0x0

    .line 80
    .line 81
    const-wide/16 v16, 0x0

    .line 82
    .line 83
    const-wide/16 v18, 0x0

    .line 84
    .line 85
    const-wide/16 v20, 0x0

    .line 86
    .line 87
    const-wide/16 v22, 0x0

    .line 88
    .line 89
    const-wide/16 v24, 0x0

    .line 90
    .line 91
    const-wide/16 v26, 0x0

    .line 92
    .line 93
    const-wide/16 v28, 0x0

    .line 94
    .line 95
    const-wide/16 v30, 0x0

    .line 96
    .line 97
    const-wide/16 v32, 0x0

    .line 98
    .line 99
    const-wide/16 v34, 0x0

    .line 100
    .line 101
    const-wide/16 v36, 0x0

    .line 102
    .line 103
    const-wide/16 v38, 0x0

    .line 104
    .line 105
    const-wide/16 v40, 0x0

    .line 106
    .line 107
    const-wide/16 v42, 0x0

    .line 108
    .line 109
    const-wide/16 v44, 0x0

    .line 110
    .line 111
    const-wide/16 v46, 0x0

    .line 112
    .line 113
    const-wide/16 v48, 0x0

    .line 114
    .line 115
    const-wide/16 v50, 0x0

    .line 116
    .line 117
    const-wide/16 v52, 0x0

    .line 118
    .line 119
    const-wide/16 v54, 0x0

    .line 120
    .line 121
    const-wide/16 v56, 0x0

    .line 122
    .line 123
    const-wide/16 v58, 0x0

    .line 124
    .line 125
    const-wide/16 v60, 0x0

    .line 126
    .line 127
    const-wide/16 v62, 0x0

    .line 128
    .line 129
    const-wide/16 v64, 0x0

    .line 130
    .line 131
    const-wide/16 v66, 0x0

    .line 132
    .line 133
    const-wide/16 v68, 0x0

    .line 134
    .line 135
    const-wide/16 v70, 0x0

    .line 136
    .line 137
    const-wide/16 v72, 0x0

    .line 138
    .line 139
    const-wide/16 v74, 0x0

    .line 140
    .line 141
    const-wide/16 v76, 0x0

    .line 142
    .line 143
    const-wide/16 v78, 0x0

    .line 144
    .line 145
    const/16 v80, -0x1

    .line 146
    .line 147
    if-eqz v0, :cond_5

    .line 148
    .line 149
    invoke-static/range {v8 .. v82}, LU/m;->e(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJIILjava/lang/Object;)LU/l;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    goto :goto_3

    .line 154
    :cond_5
    invoke-static/range {v8 .. v82}, LU/m;->j(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJIILjava/lang/Object;)LU/l;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    :goto_3
    shl-int/lit8 v1, v1, 0x9

    .line 159
    .line 160
    and-int/lit16 v5, v1, 0x1c00

    .line 161
    .line 162
    const/4 v6, 0x6

    .line 163
    const/4 v1, 0x0

    .line 164
    const/4 v2, 0x0

    .line 165
    invoke-static/range {v0 .. v6}, LU/E;->a(LU/l;LU/U;LU/o0;Lkotlin/jvm/functions/Function2;LY/m;II)V

    .line 166
    .line 167
    .line 168
    invoke-static {}, LY/w;->L()Z

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-eqz v0, :cond_6

    .line 173
    .line 174
    invoke-static {}, LY/w;->T()V

    .line 175
    .line 176
    .line 177
    :cond_6
    :goto_4
    invoke-interface {v4}, LY/m;->k()LY/B1;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    if-eqz v0, :cond_7

    .line 182
    .line 183
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/views/RevenueCatThemeKt$RevenueCatTheme$1;

    .line 184
    .line 185
    invoke-direct {v1, v3, v7}, Lcom/revenuecat/purchases/ui/revenuecatui/views/RevenueCatThemeKt$RevenueCatTheme$1;-><init>(Lkotlin/jvm/functions/Function2;I)V

    .line 186
    .line 187
    .line 188
    invoke-interface {v0, v1}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 189
    .line 190
    .line 191
    :cond_7
    return-void
.end method
