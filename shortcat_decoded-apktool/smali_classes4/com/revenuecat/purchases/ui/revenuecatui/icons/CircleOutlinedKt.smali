.class public final Lcom/revenuecat/purchases/ui/revenuecatui/icons/CircleOutlinedKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u0018\u0010\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0001\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Lx0/d;",
        "_circleOutlined",
        "Lx0/d;",
        "getCircleOutlined",
        "()Lx0/d;",
        "CircleOutlined",
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
.field private static _circleOutlined:Lx0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final getCircleOutlined()Lx0/d;
    .locals 19

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/icons/CircleOutlinedKt;->_circleOutlined:Lx0/d;

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
    const/high16 v0, 0x41c00000    # 24.0f

    .line 12
    .line 13
    invoke-static {v0}, Li1/h;->n(F)F

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-static {v0}, Li1/h;->n(F)F

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    const/16 v11, 0x60

    .line 22
    .line 23
    const/4 v12, 0x0

    .line 24
    const-string v2, "Outlined.Circle"

    .line 25
    .line 26
    const/high16 v5, 0x41c00000    # 24.0f

    .line 27
    .line 28
    const/high16 v6, 0x41c00000    # 24.0f

    .line 29
    .line 30
    const-wide/16 v7, 0x0

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

    .line 34
    invoke-direct/range {v1 .. v12}, Lx0/d$a;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 35
    .line 36
    .line 37
    invoke-static {}, Lx0/o;->a()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    new-instance v5, Ls0/F1;

    .line 42
    .line 43
    sget-object v0, Ls0/r0;->b:Ls0/r0$a;

    .line 44
    .line 45
    invoke-virtual {v0}, Ls0/r0$a;->a()J

    .line 46
    .line 47
    .line 48
    move-result-wide v6

    .line 49
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Ls0/F1;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Ls0/G1;->a:Ls0/G1$a;

    .line 54
    .line 55
    invoke-virtual {v0}, Ls0/G1$a;->a()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v0, Ls0/H1;->a:Ls0/H1$a;

    .line 60
    .line 61
    invoke-virtual {v0}, Ls0/H1$a;->a()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v12, Lx0/f;

    .line 66
    .line 67
    invoke-direct {v12}, Lx0/f;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v0, 0x40000000    # 2.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Lx0/f;->i(FF)Lx0/f;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v18, 0x41400000    # 12.0f

    .line 80
    .line 81
    const v13, 0x40cf5c29    # 6.48f

    .line 82
    .line 83
    .line 84
    const/high16 v14, 0x40000000    # 2.0f

    .line 85
    .line 86
    const/high16 v15, 0x40000000    # 2.0f

    .line 87
    .line 88
    const v16, 0x40cf5c29    # 6.48f

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {v12 .. v18}, Lx0/f;->b(FFFFFF)Lx0/f;

    .line 92
    .line 93
    .line 94
    const/high16 v17, 0x41400000    # 12.0f

    .line 95
    .line 96
    const/high16 v18, 0x41b00000    # 22.0f

    .line 97
    .line 98
    const/high16 v13, 0x40000000    # 2.0f

    .line 99
    .line 100
    const v14, 0x418c28f6    # 17.52f

    .line 101
    .line 102
    .line 103
    const v15, 0x40cf5c29    # 6.48f

    .line 104
    .line 105
    .line 106
    const/high16 v16, 0x41b00000    # 22.0f

    .line 107
    .line 108
    invoke-virtual/range {v12 .. v18}, Lx0/f;->b(FFFFFF)Lx0/f;

    .line 109
    .line 110
    .line 111
    const/high16 v17, 0x41b00000    # 22.0f

    .line 112
    .line 113
    const/high16 v18, 0x41400000    # 12.0f

    .line 114
    .line 115
    const v13, 0x418c28f6    # 17.52f

    .line 116
    .line 117
    .line 118
    const/high16 v14, 0x41b00000    # 22.0f

    .line 119
    .line 120
    const/high16 v15, 0x41b00000    # 22.0f

    .line 121
    .line 122
    const v16, 0x418c28f6    # 17.52f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v12 .. v18}, Lx0/f;->b(FFFFFF)Lx0/f;

    .line 126
    .line 127
    .line 128
    const/high16 v17, 0x41400000    # 12.0f

    .line 129
    .line 130
    const/high16 v18, 0x40000000    # 2.0f

    .line 131
    .line 132
    const/high16 v13, 0x41b00000    # 22.0f

    .line 133
    .line 134
    const v14, 0x40cf5c29    # 6.48f

    .line 135
    .line 136
    .line 137
    const v15, 0x418c28f6    # 17.52f

    .line 138
    .line 139
    .line 140
    const/high16 v16, 0x40000000    # 2.0f

    .line 141
    .line 142
    invoke-virtual/range {v12 .. v18}, Lx0/f;->b(FFFFFF)Lx0/f;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v12}, Lx0/f;->a()Lx0/f;

    .line 146
    .line 147
    .line 148
    const/high16 v0, 0x41a00000    # 20.0f

    .line 149
    .line 150
    invoke-virtual {v12, v2, v0}, Lx0/f;->i(FF)Lx0/f;

    .line 151
    .line 152
    .line 153
    const/high16 v17, 0x40800000    # 4.0f

    .line 154
    .line 155
    const/high16 v18, 0x41400000    # 12.0f

    .line 156
    .line 157
    const v13, 0x40f28f5c    # 7.58f

    .line 158
    .line 159
    .line 160
    const/high16 v14, 0x41a00000    # 20.0f

    .line 161
    .line 162
    const/high16 v15, 0x40800000    # 4.0f

    .line 163
    .line 164
    const v16, 0x41835c29    # 16.42f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v12 .. v18}, Lx0/f;->b(FFFFFF)Lx0/f;

    .line 168
    .line 169
    .line 170
    const/high16 v17, 0x41400000    # 12.0f

    .line 171
    .line 172
    const/high16 v18, 0x40800000    # 4.0f

    .line 173
    .line 174
    const/high16 v13, 0x40800000    # 4.0f

    .line 175
    .line 176
    const v14, 0x40f28f5c    # 7.58f

    .line 177
    .line 178
    .line 179
    const v15, 0x40f28f5c    # 7.58f

    .line 180
    .line 181
    .line 182
    const/high16 v16, 0x40800000    # 4.0f

    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Lx0/f;->b(FFFFFF)Lx0/f;

    .line 185
    .line 186
    .line 187
    const/high16 v17, 0x41a00000    # 20.0f

    .line 188
    .line 189
    const/high16 v18, 0x41400000    # 12.0f

    .line 190
    .line 191
    const v13, 0x41835c29    # 16.42f

    .line 192
    .line 193
    .line 194
    const/high16 v14, 0x40800000    # 4.0f

    .line 195
    .line 196
    const/high16 v15, 0x41a00000    # 20.0f

    .line 197
    .line 198
    const v16, 0x40f28f5c    # 7.58f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Lx0/f;->b(FFFFFF)Lx0/f;

    .line 202
    .line 203
    .line 204
    const/high16 v17, 0x41400000    # 12.0f

    .line 205
    .line 206
    const/high16 v18, 0x41a00000    # 20.0f

    .line 207
    .line 208
    const/high16 v13, 0x41a00000    # 20.0f

    .line 209
    .line 210
    const v14, 0x41835c29    # 16.42f

    .line 211
    .line 212
    .line 213
    const v15, 0x41835c29    # 16.42f

    .line 214
    .line 215
    .line 216
    const/high16 v16, 0x41a00000    # 20.0f

    .line 217
    .line 218
    invoke-virtual/range {v12 .. v18}, Lx0/f;->b(FFFFFF)Lx0/f;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v12}, Lx0/f;->a()Lx0/f;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v12}, Lx0/f;->d()Ljava/util/List;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    const/16 v16, 0x3800

    .line 229
    .line 230
    const/16 v17, 0x0

    .line 231
    .line 232
    const-string v4, ""

    .line 233
    .line 234
    const/high16 v6, 0x3f800000    # 1.0f

    .line 235
    .line 236
    const/4 v7, 0x0

    .line 237
    const/high16 v8, 0x3f800000    # 1.0f

    .line 238
    .line 239
    const/high16 v9, 0x3f800000    # 1.0f

    .line 240
    .line 241
    const/high16 v12, 0x3f800000    # 1.0f

    .line 242
    .line 243
    const/4 v13, 0x0

    .line 244
    const/4 v14, 0x0

    .line 245
    const/4 v15, 0x0

    .line 246
    invoke-static/range {v1 .. v17}, Lx0/d$a;->d(Lx0/d$a;Ljava/util/List;ILjava/lang/String;Ls0/h0;FLs0/h0;FFIIFFFFILjava/lang/Object;)Lx0/d$a;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-virtual {v0}, Lx0/d$a;->f()Lx0/d;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/icons/CircleOutlinedKt;->_circleOutlined:Lx0/d;

    .line 255
    .line 256
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    return-object v0
.end method
