.class public final Lcom/revenuecat/purchases/ui/revenuecatui/icons/UniversalCurrencyAltKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u0018\u0010\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0001\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Lx0/d;",
        "_Universal_currency_alt",
        "Lx0/d;",
        "getUniversalCurrencyAlt",
        "()Lx0/d;",
        "UniversalCurrencyAlt",
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


# static fields
.field private static _Universal_currency_alt:Lx0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final getUniversalCurrencyAlt()Lx0/d;
    .locals 18

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/icons/UniversalCurrencyAltKt;->_Universal_currency_alt:Lx0/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    new-instance v1, Lx0/d$a;

    .line 10
    .line 11
    const/16 v0, 0x18

    .line 12
    .line 13
    int-to-float v0, v0

    .line 14
    invoke-static {v0}, Li1/h;->n(F)F

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    invoke-static {v0}, Li1/h;->n(F)F

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/16 v11, 0xe0

    .line 23
    .line 24
    const/4 v12, 0x0

    .line 25
    const-string v2, "UniversalCurrencyAlt"

    .line 26
    .line 27
    const/high16 v5, 0x44700000    # 960.0f

    .line 28
    .line 29
    const/high16 v6, 0x44700000    # 960.0f

    .line 30
    .line 31
    const-wide/16 v7, 0x0

    .line 32
    .line 33
    const/4 v9, 0x0

    .line 34
    const/4 v10, 0x0

    .line 35
    invoke-direct/range {v1 .. v12}, Lx0/d$a;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 36
    .line 37
    .line 38
    new-instance v5, Ls0/F1;

    .line 39
    .line 40
    sget-object v0, Ls0/r0;->b:Ls0/r0$a;

    .line 41
    .line 42
    invoke-virtual {v0}, Ls0/r0$a;->a()J

    .line 43
    .line 44
    .line 45
    move-result-wide v2

    .line 46
    const/4 v0, 0x0

    .line 47
    invoke-direct {v5, v2, v3, v0}, Ls0/F1;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 48
    .line 49
    .line 50
    sget-object v0, Ls0/G1;->a:Ls0/G1$a;

    .line 51
    .line 52
    invoke-virtual {v0}, Ls0/G1$a;->a()I

    .line 53
    .line 54
    .line 55
    move-result v10

    .line 56
    sget-object v0, Ls0/H1;->a:Ls0/H1$a;

    .line 57
    .line 58
    invoke-virtual {v0}, Ls0/H1$a;->b()I

    .line 59
    .line 60
    .line 61
    move-result v11

    .line 62
    sget-object v0, Ls0/o1;->a:Ls0/o1$a;

    .line 63
    .line 64
    invoke-virtual {v0}, Ls0/o1$a;->b()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    new-instance v0, Lx0/f;

    .line 69
    .line 70
    invoke-direct {v0}, Lx0/f;-><init>()V

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x44160000    # 600.0f

    .line 74
    .line 75
    const/high16 v4, 0x44200000    # 640.0f

    .line 76
    .line 77
    invoke-virtual {v0, v2, v4}, Lx0/f;->i(FF)Lx0/f;

    .line 78
    .line 79
    .line 80
    const/high16 v6, 0x43200000    # 160.0f

    .line 81
    .line 82
    invoke-virtual {v0, v6}, Lx0/f;->f(F)Lx0/f;

    .line 83
    .line 84
    .line 85
    const/high16 v7, -0x3ce00000    # -160.0f

    .line 86
    .line 87
    invoke-virtual {v0, v7}, Lx0/f;->p(F)Lx0/f;

    .line 88
    .line 89
    .line 90
    const/high16 v7, -0x3d900000    # -60.0f

    .line 91
    .line 92
    invoke-virtual {v0, v7}, Lx0/f;->f(F)Lx0/f;

    .line 93
    .line 94
    .line 95
    const/high16 v8, 0x42c80000    # 100.0f

    .line 96
    .line 97
    invoke-virtual {v0, v8}, Lx0/f;->p(F)Lx0/f;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v2}, Lx0/f;->e(F)Lx0/f;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Lx0/f;->a()Lx0/f;

    .line 104
    .line 105
    .line 106
    const/high16 v2, -0x3d100000    # -120.0f

    .line 107
    .line 108
    const/high16 v9, -0x3de00000    # -40.0f

    .line 109
    .line 110
    invoke-virtual {v0, v2, v9}, Lx0/f;->j(FF)Lx0/f;

    .line 111
    .line 112
    .line 113
    const/high16 v2, 0x42480000    # 50.0f

    .line 114
    .line 115
    const/4 v9, 0x0

    .line 116
    const/high16 v12, 0x42aa0000    # 85.0f

    .line 117
    .line 118
    const/high16 v13, -0x3df40000    # -35.0f

    .line 119
    .line 120
    invoke-virtual {v0, v2, v9, v12, v13}, Lx0/f;->k(FFFF)Lx0/f;

    .line 121
    .line 122
    .line 123
    const/high16 v2, 0x420c0000    # 35.0f

    .line 124
    .line 125
    const/high16 v14, -0x3d560000    # -85.0f

    .line 126
    .line 127
    invoke-virtual {v0, v2, v14}, Lx0/f;->o(FF)Lx0/f;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v13, v14}, Lx0/f;->o(FF)Lx0/f;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v14, v13}, Lx0/f;->o(FF)Lx0/f;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v14, v2}, Lx0/f;->o(FF)Lx0/f;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v13, v12}, Lx0/f;->o(FF)Lx0/f;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v2, v12}, Lx0/f;->o(FF)Lx0/f;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v12, v2}, Lx0/f;->o(FF)Lx0/f;

    .line 146
    .line 147
    .line 148
    const/high16 v2, 0x43f00000    # 480.0f

    .line 149
    .line 150
    const/high16 v12, 0x43480000    # 200.0f

    .line 151
    .line 152
    invoke-virtual {v0, v12, v2}, Lx0/f;->i(FF)Lx0/f;

    .line 153
    .line 154
    .line 155
    const/high16 v2, 0x42700000    # 60.0f

    .line 156
    .line 157
    invoke-virtual {v0, v2}, Lx0/f;->f(F)Lx0/f;

    .line 158
    .line 159
    .line 160
    const/high16 v2, -0x3d380000    # -100.0f

    .line 161
    .line 162
    invoke-virtual {v0, v2}, Lx0/f;->p(F)Lx0/f;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v8}, Lx0/f;->f(F)Lx0/f;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, v7}, Lx0/f;->p(F)Lx0/f;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v12}, Lx0/f;->e(F)Lx0/f;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0}, Lx0/f;->a()Lx0/f;

    .line 175
    .line 176
    .line 177
    const/high16 v2, 0x443e0000    # 760.0f

    .line 178
    .line 179
    const/high16 v7, 0x42a00000    # 80.0f

    .line 180
    .line 181
    invoke-virtual {v0, v7, v2}, Lx0/f;->i(FF)Lx0/f;

    .line 182
    .line 183
    .line 184
    const/high16 v2, -0x3bf40000    # -560.0f

    .line 185
    .line 186
    invoke-virtual {v0, v2}, Lx0/f;->p(F)Lx0/f;

    .line 187
    .line 188
    .line 189
    const/high16 v2, 0x44480000    # 800.0f

    .line 190
    .line 191
    invoke-virtual {v0, v2}, Lx0/f;->f(F)Lx0/f;

    .line 192
    .line 193
    .line 194
    const/high16 v2, 0x440c0000    # 560.0f

    .line 195
    .line 196
    invoke-virtual {v0, v2}, Lx0/f;->p(F)Lx0/f;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0}, Lx0/f;->a()Lx0/f;

    .line 200
    .line 201
    .line 202
    const/high16 v2, -0x3d600000    # -80.0f

    .line 203
    .line 204
    invoke-virtual {v0, v7, v2}, Lx0/f;->j(FF)Lx0/f;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0, v4}, Lx0/f;->f(F)Lx0/f;

    .line 208
    .line 209
    .line 210
    const/high16 v2, -0x3c380000    # -400.0f

    .line 211
    .line 212
    invoke-virtual {v0, v2}, Lx0/f;->p(F)Lx0/f;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, v6}, Lx0/f;->e(F)Lx0/f;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0}, Lx0/f;->a()Lx0/f;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0, v9, v9}, Lx0/f;->j(FF)Lx0/f;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0, v2}, Lx0/f;->p(F)Lx0/f;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0}, Lx0/f;->a()Lx0/f;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0}, Lx0/f;->d()Ljava/util/List;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    const/16 v16, 0x3800

    .line 235
    .line 236
    const/16 v17, 0x0

    .line 237
    .line 238
    const-string v4, ""

    .line 239
    .line 240
    const/high16 v6, 0x3f800000    # 1.0f

    .line 241
    .line 242
    const/4 v7, 0x0

    .line 243
    const/high16 v8, 0x3f800000    # 1.0f

    .line 244
    .line 245
    const/high16 v9, 0x3f800000    # 1.0f

    .line 246
    .line 247
    const/high16 v12, 0x3f800000    # 1.0f

    .line 248
    .line 249
    const/4 v13, 0x0

    .line 250
    const/4 v14, 0x0

    .line 251
    const/4 v15, 0x0

    .line 252
    invoke-static/range {v1 .. v17}, Lx0/d$a;->d(Lx0/d$a;Ljava/util/List;ILjava/lang/String;Ls0/h0;FLs0/h0;FFIIFFFFILjava/lang/Object;)Lx0/d$a;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v1}, Lx0/d$a;->f()Lx0/d;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/icons/UniversalCurrencyAltKt;->_Universal_currency_alt:Lx0/d;

    .line 260
    .line 261
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    return-object v0
.end method
