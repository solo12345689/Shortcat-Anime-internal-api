.class public final Lcom/revenuecat/purchases/models/PeriodKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/models/PeriodKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u0002\u00a8\u0006\u0005"
    }
    d2 = {
        "toPeriod",
        "Lkotlin/Pair;",
        "",
        "Lcom/revenuecat/purchases/models/Period$Unit;",
        "",
        "purchases_defaultsBc8Release"
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
.method public static final synthetic access$toPeriod(Ljava/lang/String;)Lkotlin/Pair;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/revenuecat/purchases/models/PeriodKt;->toPeriod(Ljava/lang/String;)Lkotlin/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final toPeriod(Ljava/lang/String;)Lkotlin/Pair;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Lcom/revenuecat/purchases/models/Period$Unit;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, LDf/p;

    .line 2
    .line 3
    const-string v1, "^P(?!$)(\\d+(?:\\.\\d+)?Y)?(\\d+(?:\\.\\d+)?M)?(\\d+(?:\\.\\d+)?W)?(\\d+(?:\\.\\d+)?D)?$"

    .line 4
    .line 5
    invoke-direct {v0, v1}, LDf/p;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, LDf/p;->g(Ljava/lang/CharSequence;)LDf/l;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_9

    .line 13
    .line 14
    sget-object v0, Lcom/revenuecat/purchases/models/PeriodKt$toPeriod$1$toInt$1;->INSTANCE:Lcom/revenuecat/purchases/models/PeriodKt$toPeriod$1$toInt$1;

    .line 15
    .line 16
    invoke-interface {p0}, LDf/l;->a()LDf/l$b;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, LDf/l$b;->a()LDf/l;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v1}, LDf/l;->b()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/4 v2, 0x1

    .line 29
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p0}, LDf/l$b;->a()LDf/l;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-interface {v3}, LDf/l;->b()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    const/4 v4, 0x2

    .line 44
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {p0}, LDf/l$b;->a()LDf/l;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-interface {v5}, LDf/l;->b()Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    const/4 v6, 0x3

    .line 59
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    check-cast v5, Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {p0}, LDf/l$b;->a()LDf/l;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-interface {p0}, LDf/l;->b()Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    const/4 v7, 0x4

    .line 74
    invoke-interface {p0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    check-cast p0, Ljava/lang/String;

    .line 79
    .line 80
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Ljava/lang/Number;

    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    check-cast v3, Ljava/lang/Number;

    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    invoke-interface {v0, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    check-cast v5, Ljava/lang/Number;

    .line 105
    .line 106
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    invoke-interface {v0, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    check-cast p0, Ljava/lang/Number;

    .line 115
    .line 116
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    if-lez p0, :cond_0

    .line 121
    .line 122
    sget-object v0, Lcom/revenuecat/purchases/models/Period$Unit;->DAY:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_0
    if-lez v5, :cond_1

    .line 126
    .line 127
    sget-object v0, Lcom/revenuecat/purchases/models/Period$Unit;->WEEK:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_1
    if-lez v3, :cond_2

    .line 131
    .line 132
    sget-object v0, Lcom/revenuecat/purchases/models/Period$Unit;->MONTH:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_2
    if-lez v1, :cond_3

    .line 136
    .line 137
    sget-object v0, Lcom/revenuecat/purchases/models/Period$Unit;->YEAR:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_3
    sget-object v0, Lcom/revenuecat/purchases/models/Period$Unit;->UNKNOWN:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 141
    .line 142
    :goto_0
    sget-object v8, Lcom/revenuecat/purchases/models/PeriodKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 143
    .line 144
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 145
    .line 146
    .line 147
    move-result v9

    .line 148
    aget v8, v8, v9

    .line 149
    .line 150
    if-eq v8, v2, :cond_8

    .line 151
    .line 152
    if-eq v8, v4, :cond_7

    .line 153
    .line 154
    if-eq v8, v6, :cond_6

    .line 155
    .line 156
    if-eq v8, v7, :cond_5

    .line 157
    .line 158
    const/4 p0, 0x5

    .line 159
    if-ne v8, p0, :cond_4

    .line 160
    .line 161
    const-wide/16 v1, 0x0

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_4
    new-instance p0, LTd/r;

    .line 165
    .line 166
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 167
    .line 168
    .line 169
    throw p0

    .line 170
    :cond_5
    int-to-double v1, v1

    .line 171
    const-wide v6, 0x4076d00000000000L    # 365.0

    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    mul-double/2addr v1, v6

    .line 177
    int-to-double v3, v3

    .line 178
    const-wide/high16 v6, 0x403e000000000000L    # 30.0

    .line 179
    .line 180
    mul-double/2addr v3, v6

    .line 181
    add-double/2addr v1, v3

    .line 182
    int-to-double v3, v5

    .line 183
    const-wide/high16 v5, 0x401c000000000000L    # 7.0

    .line 184
    .line 185
    mul-double/2addr v3, v5

    .line 186
    add-double/2addr v1, v3

    .line 187
    int-to-double v3, p0

    .line 188
    :goto_1
    add-double/2addr v1, v3

    .line 189
    goto :goto_2

    .line 190
    :cond_6
    int-to-double v1, v1

    .line 191
    const-wide v6, 0x404a124924924925L    # 52.142857142857146

    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    mul-double/2addr v1, v6

    .line 197
    int-to-double v3, v3

    .line 198
    const-wide v6, 0x4011618618618619L    # 4.345238095238096

    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    mul-double/2addr v3, v6

    .line 204
    add-double/2addr v1, v3

    .line 205
    int-to-double v3, v5

    .line 206
    goto :goto_1

    .line 207
    :cond_7
    int-to-double v1, v1

    .line 208
    const-wide/high16 v4, 0x4028000000000000L    # 12.0

    .line 209
    .line 210
    mul-double/2addr v1, v4

    .line 211
    int-to-double v3, v3

    .line 212
    goto :goto_1

    .line 213
    :cond_8
    int-to-double v1, v1

    .line 214
    :goto_2
    new-instance p0, Lkotlin/Pair;

    .line 215
    .line 216
    invoke-static {v1, v2}, Lke/a;->c(D)I

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    invoke-direct {p0, v1, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    return-object p0

    .line 228
    :cond_9
    new-instance p0, Lkotlin/Pair;

    .line 229
    .line 230
    const/4 v0, 0x0

    .line 231
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    sget-object v1, Lcom/revenuecat/purchases/models/Period$Unit;->UNKNOWN:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 236
    .line 237
    invoke-direct {p0, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    return-object p0
.end method
