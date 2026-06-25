.class public final LG/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LG/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LG/k;

    .line 2
    .line 3
    invoke-direct {v0}, LG/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LG/k;->a:LG/k;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(LG/C;LG/A;Lw/z;Lw/i;FLY/m;II)Lz/B;
    .locals 6

    .line 1
    and-int/lit8 v0, p8, 0x2

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget-object p2, LG/A;->a:LG/A$a;

    .line 7
    .line 8
    invoke-virtual {p2, v1}, LG/A$a;->a(I)LG/A;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    :cond_0
    and-int/lit8 v0, p8, 0x4

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-static {p6, v2}, Lv/A;->b(LY/m;I)Lw/z;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    :cond_1
    and-int/lit8 v0, p8, 0x8

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    sget-object p4, Lkotlin/jvm/internal/r;->a:Lkotlin/jvm/internal/r;

    .line 27
    .line 28
    invoke-static {p4}, Lw/I0;->b(Lkotlin/jvm/internal/r;)I

    .line 29
    .line 30
    .line 31
    move-result p4

    .line 32
    int-to-float p4, p4

    .line 33
    invoke-static {p4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 34
    .line 35
    .line 36
    move-result-object p4

    .line 37
    const/4 v0, 0x0

    .line 38
    const/high16 v4, 0x43c80000    # 400.0f

    .line 39
    .line 40
    invoke-static {v3, v4, p4, v1, v0}, Lw/j;->h(FFLjava/lang/Object;ILjava/lang/Object;)Lw/h0;

    .line 41
    .line 42
    .line 43
    move-result-object p4

    .line 44
    :cond_2
    and-int/lit8 p8, p8, 0x10

    .line 45
    .line 46
    if-eqz p8, :cond_3

    .line 47
    .line 48
    const/high16 p5, 0x3f000000    # 0.5f

    .line 49
    .line 50
    :cond_3
    invoke-static {}, LY/w;->L()Z

    .line 51
    .line 52
    .line 53
    move-result p8

    .line 54
    if-eqz p8, :cond_4

    .line 55
    .line 56
    const/4 p8, -0x1

    .line 57
    const-string v0, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:301)"

    .line 58
    .line 59
    const v4, 0x5cf8305d

    .line 60
    .line 61
    .line 62
    invoke-static {v4, p7, p8, v0}, LY/w;->U(IIILjava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :cond_4
    cmpg-float p8, v3, p5

    .line 66
    .line 67
    if-gtz p8, :cond_e

    .line 68
    .line 69
    const/high16 p8, 0x3f800000    # 1.0f

    .line 70
    .line 71
    cmpg-float p8, p5, p8

    .line 72
    .line 73
    if-gtz p8, :cond_e

    .line 74
    .line 75
    invoke-static {}, Landroidx/compose/ui/platform/w0;->e()LY/b1;

    .line 76
    .line 77
    .line 78
    move-result-object p8

    .line 79
    invoke-interface {p6, p8}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p8

    .line 83
    check-cast p8, Li1/d;

    .line 84
    .line 85
    invoke-static {}, Landroidx/compose/ui/platform/w0;->k()LY/b1;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-interface {p6, v0}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, Li1/t;

    .line 94
    .line 95
    and-int/lit8 v3, p7, 0xe

    .line 96
    .line 97
    xor-int/lit8 v3, v3, 0x6

    .line 98
    .line 99
    const/4 v4, 0x4

    .line 100
    if-le v3, v4, :cond_5

    .line 101
    .line 102
    invoke-interface {p6, p1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-nez v3, :cond_6

    .line 107
    .line 108
    :cond_5
    and-int/lit8 v3, p7, 0x6

    .line 109
    .line 110
    if-ne v3, v4, :cond_7

    .line 111
    .line 112
    :cond_6
    move v3, v1

    .line 113
    goto :goto_0

    .line 114
    :cond_7
    move v3, v2

    .line 115
    :goto_0
    invoke-interface {p6, p3}, LY/m;->U(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    or-int/2addr v3, v4

    .line 120
    invoke-interface {p6, p4}, LY/m;->U(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    or-int/2addr v3, v4

    .line 125
    and-int/lit8 v4, p7, 0x70

    .line 126
    .line 127
    xor-int/lit8 v4, v4, 0x30

    .line 128
    .line 129
    const/16 v5, 0x20

    .line 130
    .line 131
    if-le v4, v5, :cond_8

    .line 132
    .line 133
    invoke-interface {p6, p2}, LY/m;->U(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-nez v4, :cond_a

    .line 138
    .line 139
    :cond_8
    and-int/lit8 p7, p7, 0x30

    .line 140
    .line 141
    if-ne p7, v5, :cond_9

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_9
    move v1, v2

    .line 145
    :cond_a
    :goto_1
    or-int p7, v3, v1

    .line 146
    .line 147
    invoke-interface {p6, p8}, LY/m;->U(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result p8

    .line 151
    or-int/2addr p7, p8

    .line 152
    invoke-interface {p6, v0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result p8

    .line 156
    or-int/2addr p7, p8

    .line 157
    invoke-interface {p6}, LY/m;->D()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p8

    .line 161
    if-nez p7, :cond_b

    .line 162
    .line 163
    sget-object p7, LY/m;->a:LY/m$a;

    .line 164
    .line 165
    invoke-virtual {p7}, LY/m$a;->a()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p7

    .line 169
    if-ne p8, p7, :cond_c

    .line 170
    .line 171
    :cond_b
    new-instance p7, LG/k$a;

    .line 172
    .line 173
    invoke-direct {p7, p1, v0, p5}, LG/k$a;-><init>(LG/C;Li1/t;F)V

    .line 174
    .line 175
    .line 176
    invoke-static {p1, p2, p7}, LA/g;->a(LG/C;LG/A;Lie/o;)LA/j;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-static {p1, p3, p4}, LA/i;->l(LA/j;Lw/z;Lw/i;)Lz/B;

    .line 181
    .line 182
    .line 183
    move-result-object p8

    .line 184
    invoke-interface {p6, p8}, LY/m;->u(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    :cond_c
    check-cast p8, Lz/B;

    .line 188
    .line 189
    invoke-static {}, LY/w;->L()Z

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    if-eqz p1, :cond_d

    .line 194
    .line 195
    invoke-static {}, LY/w;->T()V

    .line 196
    .line 197
    .line 198
    :cond_d
    return-object p8

    .line 199
    :cond_e
    new-instance p1, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 202
    .line 203
    .line 204
    const-string p2, "snapPositionalThreshold should be a number between 0 and 1. You\'ve specified "

    .line 205
    .line 206
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 217
    .line 218
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    throw p2
.end method

.method public final b(LG/C;Lz/q;LY/m;I)LD0/a;
    .locals 5

    .line 1
    invoke-static {}, LY/w;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.compose.foundation.pager.PagerDefaults.pageNestedScrollConnection (Pager.kt:350)"

    .line 9
    .line 10
    const v2, 0x344edb10

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p4, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    and-int/lit8 v0, p4, 0xe

    .line 17
    .line 18
    xor-int/lit8 v0, v0, 0x6

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x1

    .line 22
    const/4 v3, 0x4

    .line 23
    if-le v0, v3, :cond_1

    .line 24
    .line 25
    invoke-interface {p3, p1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    :cond_1
    and-int/lit8 v0, p4, 0x6

    .line 32
    .line 33
    if-ne v0, v3, :cond_3

    .line 34
    .line 35
    :cond_2
    move v0, v2

    .line 36
    goto :goto_0

    .line 37
    :cond_3
    move v0, v1

    .line 38
    :goto_0
    and-int/lit8 v3, p4, 0x70

    .line 39
    .line 40
    xor-int/lit8 v3, v3, 0x30

    .line 41
    .line 42
    const/16 v4, 0x20

    .line 43
    .line 44
    if-le v3, v4, :cond_4

    .line 45
    .line 46
    invoke-interface {p3, p2}, LY/m;->U(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-nez v3, :cond_5

    .line 51
    .line 52
    :cond_4
    and-int/lit8 p4, p4, 0x30

    .line 53
    .line 54
    if-ne p4, v4, :cond_6

    .line 55
    .line 56
    :cond_5
    move v1, v2

    .line 57
    :cond_6
    or-int p4, v0, v1

    .line 58
    .line 59
    invoke-interface {p3}, LY/m;->D()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-nez p4, :cond_7

    .line 64
    .line 65
    sget-object p4, LY/m;->a:LY/m$a;

    .line 66
    .line 67
    invoke-virtual {p4}, LY/m$a;->a()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p4

    .line 71
    if-ne v0, p4, :cond_8

    .line 72
    .line 73
    :cond_7
    new-instance v0, LG/a;

    .line 74
    .line 75
    invoke-direct {v0, p1, p2}, LG/a;-><init>(LG/C;Lz/q;)V

    .line 76
    .line 77
    .line 78
    invoke-interface {p3, v0}, LY/m;->u(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :cond_8
    check-cast v0, LG/a;

    .line 82
    .line 83
    invoke-static {}, LY/w;->L()Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_9

    .line 88
    .line 89
    invoke-static {}, LY/w;->T()V

    .line 90
    .line 91
    .line 92
    :cond_9
    return-object v0
.end method
