.class public final Lcom/revenuecat/purchases/ui/revenuecatui/icons/CheckCircleKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u0018\u0010\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0001\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Lx0/d;",
        "_checkCircle",
        "Lx0/d;",
        "getCheckCircle",
        "()Lx0/d;",
        "CheckCircle",
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
.field private static _checkCircle:Lx0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final getCheckCircle()Lx0/d;
    .locals 19

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/icons/CheckCircleKt;->_checkCircle:Lx0/d;

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
    const-string v2, "Filled.CheckCircle"

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
    const/high16 v0, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v2, 0x40000000    # 2.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Lx0/f;->i(FF)Lx0/f;

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
    const v4, 0x408f5c29    # 4.48f

    .line 95
    .line 96
    .line 97
    const/high16 v6, 0x41200000    # 10.0f

    .line 98
    .line 99
    invoke-virtual {v12, v4, v6, v6, v6}, Lx0/f;->m(FFFF)Lx0/f;

    .line 100
    .line 101
    .line 102
    const v4, -0x3f70a3d7    # -4.48f

    .line 103
    .line 104
    .line 105
    const/high16 v7, -0x3ee00000    # -10.0f

    .line 106
    .line 107
    invoke-virtual {v12, v6, v4, v6, v7}, Lx0/f;->m(FFFF)Lx0/f;

    .line 108
    .line 109
    .line 110
    const v4, 0x418c28f6    # 17.52f

    .line 111
    .line 112
    .line 113
    invoke-virtual {v12, v4, v2, v0, v2}, Lx0/f;->l(FFFF)Lx0/f;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v12}, Lx0/f;->a()Lx0/f;

    .line 117
    .line 118
    .line 119
    const/high16 v0, 0x41880000    # 17.0f

    .line 120
    .line 121
    invoke-virtual {v12, v6, v0}, Lx0/f;->i(FF)Lx0/f;

    .line 122
    .line 123
    .line 124
    const/high16 v0, -0x3f600000    # -5.0f

    .line 125
    .line 126
    invoke-virtual {v12, v0, v0}, Lx0/f;->h(FF)Lx0/f;

    .line 127
    .line 128
    .line 129
    const v0, 0x3fb47ae1    # 1.41f

    .line 130
    .line 131
    .line 132
    const v2, -0x404b851f    # -1.41f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12, v0, v2}, Lx0/f;->h(FF)Lx0/f;

    .line 136
    .line 137
    .line 138
    const v0, 0x4065c28f    # 3.59f

    .line 139
    .line 140
    .line 141
    const v2, 0x40651eb8    # 3.58f

    .line 142
    .line 143
    .line 144
    invoke-virtual {v12, v0, v2}, Lx0/f;->h(FF)Lx0/f;

    .line 145
    .line 146
    .line 147
    const v0, 0x418cb852    # 17.59f

    .line 148
    .line 149
    .line 150
    const v2, 0x40d2e148    # 6.59f

    .line 151
    .line 152
    .line 153
    invoke-virtual {v12, v0, v2}, Lx0/f;->g(FF)Lx0/f;

    .line 154
    .line 155
    .line 156
    const/high16 v0, 0x41980000    # 19.0f

    .line 157
    .line 158
    const/high16 v2, 0x41000000    # 8.0f

    .line 159
    .line 160
    invoke-virtual {v12, v0, v2}, Lx0/f;->g(FF)Lx0/f;

    .line 161
    .line 162
    .line 163
    const/high16 v0, -0x3ef00000    # -9.0f

    .line 164
    .line 165
    const/high16 v2, 0x41100000    # 9.0f

    .line 166
    .line 167
    invoke-virtual {v12, v0, v2}, Lx0/f;->h(FF)Lx0/f;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v12}, Lx0/f;->a()Lx0/f;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v12}, Lx0/f;->d()Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    const/16 v16, 0x3800

    .line 178
    .line 179
    const/16 v17, 0x0

    .line 180
    .line 181
    const-string v4, ""

    .line 182
    .line 183
    const/high16 v6, 0x3f800000    # 1.0f

    .line 184
    .line 185
    const/4 v7, 0x0

    .line 186
    const/high16 v8, 0x3f800000    # 1.0f

    .line 187
    .line 188
    const/high16 v9, 0x3f800000    # 1.0f

    .line 189
    .line 190
    const/high16 v12, 0x3f800000    # 1.0f

    .line 191
    .line 192
    const/4 v13, 0x0

    .line 193
    const/4 v14, 0x0

    .line 194
    const/4 v15, 0x0

    .line 195
    invoke-static/range {v1 .. v17}, Lx0/d$a;->d(Lx0/d$a;Ljava/util/List;ILjava/lang/String;Ls0/h0;FLs0/h0;FFIIFFFFILjava/lang/Object;)Lx0/d$a;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-virtual {v0}, Lx0/d$a;->f()Lx0/d;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/icons/CheckCircleKt;->_checkCircle:Lx0/d;

    .line 204
    .line 205
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    return-object v0
.end method
