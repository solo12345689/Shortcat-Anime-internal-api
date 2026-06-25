.class public abstract LK/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:F

.field private static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x19

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    invoke-static {v0}, Li1/h;->n(F)F

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sput v0, LK/a;->a:F

    .line 9
    .line 10
    const/high16 v1, 0x40000000    # 2.0f

    .line 11
    .line 12
    mul-float/2addr v0, v1

    .line 13
    invoke-static {v0}, Li1/h;->n(F)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const v1, 0x401a827a

    .line 18
    .line 19
    .line 20
    div-float/2addr v0, v1

    .line 21
    invoke-static {v0}, Li1/h;->n(F)F

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    sput v0, LK/a;->b:F

    .line 26
    .line 27
    return-void
.end method

.method public static final a(LQ/i;Landroidx/compose/ui/e;JLY/m;II)V
    .locals 8

    .line 1
    const v0, 0x69deb1cb

    .line 2
    .line 3
    .line 4
    invoke-interface {p4, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p4

    .line 8
    and-int/lit8 v1, p6, 0x1

    .line 9
    .line 10
    const/4 v2, 0x4

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    or-int/lit8 v1, p5, 0x6

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    and-int/lit8 v1, p5, 0x6

    .line 17
    .line 18
    if-nez v1, :cond_3

    .line 19
    .line 20
    and-int/lit8 v1, p5, 0x8

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    invoke-interface {p4, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-interface {p4, p0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    :goto_0
    if-eqz v1, :cond_2

    .line 34
    .line 35
    move v1, v2

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    const/4 v1, 0x2

    .line 38
    :goto_1
    or-int/2addr v1, p5

    .line 39
    goto :goto_2

    .line 40
    :cond_3
    move v1, p5

    .line 41
    :goto_2
    and-int/lit8 v3, p6, 0x2

    .line 42
    .line 43
    if-eqz v3, :cond_4

    .line 44
    .line 45
    or-int/lit8 v1, v1, 0x30

    .line 46
    .line 47
    goto :goto_4

    .line 48
    :cond_4
    and-int/lit8 v3, p5, 0x30

    .line 49
    .line 50
    if-nez v3, :cond_6

    .line 51
    .line 52
    invoke-interface {p4, p1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_5

    .line 57
    .line 58
    const/16 v3, 0x20

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_5
    const/16 v3, 0x10

    .line 62
    .line 63
    :goto_3
    or-int/2addr v1, v3

    .line 64
    :cond_6
    :goto_4
    and-int/lit16 v3, p5, 0x180

    .line 65
    .line 66
    if-nez v3, :cond_8

    .line 67
    .line 68
    and-int/lit8 v3, p6, 0x4

    .line 69
    .line 70
    if-nez v3, :cond_7

    .line 71
    .line 72
    invoke-interface {p4, p2, p3}, LY/m;->d(J)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_7

    .line 77
    .line 78
    const/16 v3, 0x100

    .line 79
    .line 80
    goto :goto_5

    .line 81
    :cond_7
    const/16 v3, 0x80

    .line 82
    .line 83
    :goto_5
    or-int/2addr v1, v3

    .line 84
    :cond_8
    and-int/lit16 v3, v1, 0x93

    .line 85
    .line 86
    const/16 v4, 0x92

    .line 87
    .line 88
    if-ne v3, v4, :cond_b

    .line 89
    .line 90
    invoke-interface {p4}, LY/m;->i()Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-nez v3, :cond_9

    .line 95
    .line 96
    goto :goto_7

    .line 97
    :cond_9
    invoke-interface {p4}, LY/m;->K()V

    .line 98
    .line 99
    .line 100
    :cond_a
    :goto_6
    move-wide v4, p2

    .line 101
    goto/16 :goto_d

    .line 102
    .line 103
    :cond_b
    :goto_7
    invoke-interface {p4}, LY/m;->G()V

    .line 104
    .line 105
    .line 106
    and-int/lit8 v3, p5, 0x1

    .line 107
    .line 108
    if-eqz v3, :cond_d

    .line 109
    .line 110
    invoke-interface {p4}, LY/m;->N()Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-eqz v3, :cond_c

    .line 115
    .line 116
    goto :goto_9

    .line 117
    :cond_c
    invoke-interface {p4}, LY/m;->K()V

    .line 118
    .line 119
    .line 120
    and-int/lit8 v3, p6, 0x4

    .line 121
    .line 122
    if-eqz v3, :cond_e

    .line 123
    .line 124
    :goto_8
    and-int/lit16 v1, v1, -0x381

    .line 125
    .line 126
    goto :goto_a

    .line 127
    :cond_d
    :goto_9
    and-int/lit8 v3, p6, 0x4

    .line 128
    .line 129
    if-eqz v3, :cond_e

    .line 130
    .line 131
    sget-object p2, Li1/k;->b:Li1/k$a;

    .line 132
    .line 133
    invoke-virtual {p2}, Li1/k$a;->a()J

    .line 134
    .line 135
    .line 136
    move-result-wide p2

    .line 137
    goto :goto_8

    .line 138
    :cond_e
    :goto_a
    invoke-interface {p4}, LY/m;->y()V

    .line 139
    .line 140
    .line 141
    invoke-static {}, LY/w;->L()Z

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    if-eqz v3, :cond_f

    .line 146
    .line 147
    const/4 v3, -0x1

    .line 148
    const-string v4, "androidx.compose.foundation.text.CursorHandle (AndroidCursorHandle.android.kt:51)"

    .line 149
    .line 150
    invoke-static {v0, v1, v3, v4}, LY/w;->U(IIILjava/lang/String;)V

    .line 151
    .line 152
    .line 153
    :cond_f
    and-int/lit8 v0, v1, 0xe

    .line 154
    .line 155
    const/4 v3, 0x0

    .line 156
    const/4 v4, 0x1

    .line 157
    if-eq v0, v2, :cond_11

    .line 158
    .line 159
    and-int/lit8 v1, v1, 0x8

    .line 160
    .line 161
    if-eqz v1, :cond_10

    .line 162
    .line 163
    invoke-interface {p4, p0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-eqz v1, :cond_10

    .line 168
    .line 169
    goto :goto_b

    .line 170
    :cond_10
    move v1, v3

    .line 171
    goto :goto_c

    .line 172
    :cond_11
    :goto_b
    move v1, v4

    .line 173
    :goto_c
    invoke-interface {p4}, LY/m;->D()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    if-nez v1, :cond_12

    .line 178
    .line 179
    sget-object v1, LY/m;->a:LY/m$a;

    .line 180
    .line 181
    invoke-virtual {v1}, LY/m$a;->a()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    if-ne v2, v1, :cond_13

    .line 186
    .line 187
    :cond_12
    new-instance v2, LK/a$c;

    .line 188
    .line 189
    invoke-direct {v2, p0}, LK/a$c;-><init>(LQ/i;)V

    .line 190
    .line 191
    .line 192
    invoke-interface {p4, v2}, LY/m;->u(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    :cond_13
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 196
    .line 197
    const/4 v1, 0x0

    .line 198
    invoke-static {p1, v3, v2, v4, v1}, LR0/r;->f(Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    sget-object v2, Ll0/e;->a:Ll0/e$a;

    .line 203
    .line 204
    invoke-virtual {v2}, Ll0/e$a;->m()Ll0/e;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    new-instance v3, LK/a$a;

    .line 209
    .line 210
    invoke-direct {v3, p2, p3, v1}, LK/a$a;-><init>(JLandroidx/compose/ui/e;)V

    .line 211
    .line 212
    .line 213
    const/16 v1, 0x36

    .line 214
    .line 215
    const v5, -0x628ed1fe

    .line 216
    .line 217
    .line 218
    invoke-static {v5, v4, v3, p4, v1}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    or-int/lit16 v0, v0, 0x1b0

    .line 223
    .line 224
    invoke-static {p0, v2, v1, p4, v0}, LQ/a;->a(LQ/i;Ll0/e;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 225
    .line 226
    .line 227
    invoke-static {}, LY/w;->L()Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-eqz v0, :cond_a

    .line 232
    .line 233
    invoke-static {}, LY/w;->T()V

    .line 234
    .line 235
    .line 236
    goto/16 :goto_6

    .line 237
    .line 238
    :goto_d
    invoke-interface {p4}, LY/m;->k()LY/B1;

    .line 239
    .line 240
    .line 241
    move-result-object p2

    .line 242
    if-eqz p2, :cond_14

    .line 243
    .line 244
    new-instance v1, LK/a$b;

    .line 245
    .line 246
    move-object v2, p0

    .line 247
    move-object v3, p1

    .line 248
    move v6, p5

    .line 249
    move v7, p6

    .line 250
    invoke-direct/range {v1 .. v7}, LK/a$b;-><init>(LQ/i;Landroidx/compose/ui/e;JII)V

    .line 251
    .line 252
    .line 253
    invoke-interface {p2, v1}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 254
    .line 255
    .line 256
    :cond_14
    return-void
.end method

.method private static final b(Landroidx/compose/ui/e;LY/m;II)V
    .locals 5

    .line 1
    const v0, 0x29616e63

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    and-int/lit8 v1, p3, 0x1

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    or-int/lit8 v3, p2, 0x6

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    and-int/lit8 v3, p2, 0x6

    .line 17
    .line 18
    if-nez v3, :cond_2

    .line 19
    .line 20
    invoke-interface {p1, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    const/4 v3, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move v3, v2

    .line 29
    :goto_0
    or-int/2addr v3, p2

    .line 30
    goto :goto_1

    .line 31
    :cond_2
    move v3, p2

    .line 32
    :goto_1
    and-int/lit8 v4, v3, 0x3

    .line 33
    .line 34
    if-ne v4, v2, :cond_4

    .line 35
    .line 36
    invoke-interface {p1}, LY/m;->i()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-nez v2, :cond_3

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_3
    invoke-interface {p1}, LY/m;->K()V

    .line 44
    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_4
    :goto_2
    if-eqz v1, :cond_5

    .line 48
    .line 49
    sget-object p0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 50
    .line 51
    :cond_5
    invoke-static {}, LY/w;->L()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_6

    .line 56
    .line 57
    const/4 v1, -0x1

    .line 58
    const-string v2, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:82)"

    .line 59
    .line 60
    invoke-static {v0, v3, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :cond_6
    sget v0, LK/a;->b:F

    .line 64
    .line 65
    sget v1, LK/a;->a:F

    .line 66
    .line 67
    invoke-static {p0, v0, v1}, Landroidx/compose/foundation/layout/s;->s(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v0}, LK/a;->d(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const/4 v1, 0x0

    .line 76
    invoke-static {v0, p1, v1}, LC/K;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 77
    .line 78
    .line 79
    invoke-static {}, LY/w;->L()Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_7

    .line 84
    .line 85
    invoke-static {}, LY/w;->T()V

    .line 86
    .line 87
    .line 88
    :cond_7
    :goto_3
    invoke-interface {p1}, LY/m;->k()LY/B1;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    if-eqz p1, :cond_8

    .line 93
    .line 94
    new-instance v0, LK/a$d;

    .line 95
    .line 96
    invoke-direct {v0, p0, p2, p3}, LK/a$d;-><init>(Landroidx/compose/ui/e;II)V

    .line 97
    .line 98
    .line 99
    invoke-interface {p1, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 100
    .line 101
    .line 102
    :cond_8
    return-void
.end method

.method public static final synthetic c(Landroidx/compose/ui/e;LY/m;II)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LK/a;->b(Landroidx/compose/ui/e;LY/m;II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final d(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;
    .locals 3

    .line 1
    sget-object v0, LK/a$e;->a:LK/a$e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {p0, v2, v0, v1, v2}, Landroidx/compose/ui/c;->c(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Lie/o;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
