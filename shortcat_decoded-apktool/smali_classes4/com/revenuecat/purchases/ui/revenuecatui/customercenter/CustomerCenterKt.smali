.class public final Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a1\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Landroidx/compose/ui/e;",
        "modifier",
        "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterOptions;",
        "options",
        "Lkotlin/Function0;",
        "LTd/L;",
        "onDismiss",
        "CustomerCenter",
        "(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterOptions;Lie/a;LY/m;II)V",
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
.method public static final CustomerCenter(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterOptions;Lie/a;LY/m;II)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/e;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterOptions;",
            "Lie/a;",
            "LY/m;",
            "II)V"
        }
    .end annotation

    .line 1
    const-string v0, "onDismiss"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, -0x6a4ea5ce

    .line 7
    .line 8
    .line 9
    invoke-interface {p3, v0}, LY/m;->g(I)LY/m;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    and-int/lit8 v1, p5, 0x1

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    or-int/lit8 v2, p4, 0x6

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    and-int/lit8 v2, p4, 0x6

    .line 21
    .line 22
    if-nez v2, :cond_2

    .line 23
    .line 24
    invoke-interface {p3, p0}, LY/m;->U(Ljava/lang/Object;)Z

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
    or-int/2addr v2, p4

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    move v2, p4

    .line 36
    :goto_1
    and-int/lit8 v3, p4, 0x30

    .line 37
    .line 38
    if-nez v3, :cond_4

    .line 39
    .line 40
    and-int/lit8 v3, p5, 0x2

    .line 41
    .line 42
    if-nez v3, :cond_3

    .line 43
    .line 44
    invoke-interface {p3, p1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_3

    .line 49
    .line 50
    const/16 v3, 0x20

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_3
    const/16 v3, 0x10

    .line 54
    .line 55
    :goto_2
    or-int/2addr v2, v3

    .line 56
    :cond_4
    and-int/lit8 v3, p5, 0x4

    .line 57
    .line 58
    if-eqz v3, :cond_5

    .line 59
    .line 60
    or-int/lit16 v2, v2, 0x180

    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_5
    and-int/lit16 v3, p4, 0x180

    .line 64
    .line 65
    if-nez v3, :cond_7

    .line 66
    .line 67
    invoke-interface {p3, p2}, LY/m;->F(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_6

    .line 72
    .line 73
    const/16 v3, 0x100

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_6
    const/16 v3, 0x80

    .line 77
    .line 78
    :goto_3
    or-int/2addr v2, v3

    .line 79
    :cond_7
    :goto_4
    and-int/lit16 v3, v2, 0x93

    .line 80
    .line 81
    const/16 v4, 0x92

    .line 82
    .line 83
    if-ne v3, v4, :cond_a

    .line 84
    .line 85
    invoke-interface {p3}, LY/m;->i()Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-nez v3, :cond_8

    .line 90
    .line 91
    goto :goto_6

    .line 92
    :cond_8
    invoke-interface {p3}, LY/m;->K()V

    .line 93
    .line 94
    .line 95
    :cond_9
    :goto_5
    move-object v2, p0

    .line 96
    move-object v3, p1

    .line 97
    goto/16 :goto_a

    .line 98
    .line 99
    :cond_a
    :goto_6
    invoke-interface {p3}, LY/m;->G()V

    .line 100
    .line 101
    .line 102
    and-int/lit8 v3, p4, 0x1

    .line 103
    .line 104
    if-eqz v3, :cond_c

    .line 105
    .line 106
    invoke-interface {p3}, LY/m;->N()Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-eqz v3, :cond_b

    .line 111
    .line 112
    goto :goto_8

    .line 113
    :cond_b
    invoke-interface {p3}, LY/m;->K()V

    .line 114
    .line 115
    .line 116
    and-int/lit8 v1, p5, 0x2

    .line 117
    .line 118
    if-eqz v1, :cond_e

    .line 119
    .line 120
    :goto_7
    and-int/lit8 v2, v2, -0x71

    .line 121
    .line 122
    goto :goto_9

    .line 123
    :cond_c
    :goto_8
    if-eqz v1, :cond_d

    .line 124
    .line 125
    sget-object p0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 126
    .line 127
    :cond_d
    and-int/lit8 v1, p5, 0x2

    .line 128
    .line 129
    if-eqz v1, :cond_e

    .line 130
    .line 131
    new-instance p1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterOptions$Builder;

    .line 132
    .line 133
    invoke-direct {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterOptions$Builder;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterOptions$Builder;->build()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterOptions;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    goto :goto_7

    .line 141
    :cond_e
    :goto_9
    invoke-interface {p3}, LY/m;->y()V

    .line 142
    .line 143
    .line 144
    invoke-static {}, LY/w;->L()Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eqz v1, :cond_f

    .line 149
    .line 150
    const/4 v1, -0x1

    .line 151
    const-string v3, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenter (CustomerCenter.kt:27)"

    .line 152
    .line 153
    invoke-static {v0, v2, v1, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 154
    .line 155
    .line 156
    :cond_f
    invoke-static {}, LU/s;->a()LY/b1;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    sget-object v1, LU/D;->a:LU/D;

    .line 161
    .line 162
    sget v2, LU/D;->b:I

    .line 163
    .line 164
    invoke-virtual {v1, p3, v2}, LU/D;->a(LY/m;I)LU/l;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-virtual {v1}, LU/l;->p()J

    .line 169
    .line 170
    .line 171
    move-result-wide v1

    .line 172
    invoke-static {v1, v2}, Ls0/r0;->m(J)Ls0/r0;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-virtual {v0, v1}, LY/b1;->d(Ljava/lang/Object;)LY/c1;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterKt$CustomerCenter$1;

    .line 181
    .line 182
    invoke-direct {v1, p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterKt$CustomerCenter$1;-><init>(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterOptions;Lie/a;)V

    .line 183
    .line 184
    .line 185
    const/16 v2, 0x36

    .line 186
    .line 187
    const v3, -0x285a210e

    .line 188
    .line 189
    .line 190
    const/4 v4, 0x1

    .line 191
    invoke-static {v3, v4, v1, p3, v2}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    sget v2, LY/c1;->i:I

    .line 196
    .line 197
    or-int/lit8 v2, v2, 0x30

    .line 198
    .line 199
    invoke-static {v0, v1, p3, v2}, LY/H;->c(LY/c1;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 200
    .line 201
    .line 202
    invoke-static {}, LY/w;->L()Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-eqz v0, :cond_9

    .line 207
    .line 208
    invoke-static {}, LY/w;->T()V

    .line 209
    .line 210
    .line 211
    goto :goto_5

    .line 212
    :goto_a
    invoke-interface {p3}, LY/m;->k()LY/B1;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    if-eqz p0, :cond_10

    .line 217
    .line 218
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterKt$CustomerCenter$2;

    .line 219
    .line 220
    move-object v4, p2

    .line 221
    move v5, p4

    .line 222
    move v6, p5

    .line 223
    invoke-direct/range {v1 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterKt$CustomerCenter$2;-><init>(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterOptions;Lie/a;II)V

    .line 224
    .line 225
    .line 226
    invoke-interface {p0, v1}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 227
    .line 228
    .line 229
    :cond_10
    return-void
.end method
