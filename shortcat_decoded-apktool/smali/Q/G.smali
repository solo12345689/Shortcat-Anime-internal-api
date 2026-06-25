.class public abstract LQ/G;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ/G$d;
    }
.end annotation


# direct methods
.method public static final a(ZLg1/i;LQ/F;LY/m;I)V
    .locals 11

    .line 1
    const v0, -0x50245748

    .line 2
    .line 3
    .line 4
    invoke-interface {p3, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object v8

    .line 8
    and-int/lit8 p3, p4, 0x6

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    if-nez p3, :cond_1

    .line 12
    .line 13
    invoke-interface {v8, p0}, LY/m;->a(Z)Z

    .line 14
    .line 15
    .line 16
    move-result p3

    .line 17
    if-eqz p3, :cond_0

    .line 18
    .line 19
    move p3, v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p3, 0x2

    .line 22
    :goto_0
    or-int/2addr p3, p4

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move p3, p4

    .line 25
    :goto_1
    and-int/lit8 v2, p4, 0x30

    .line 26
    .line 27
    if-nez v2, :cond_3

    .line 28
    .line 29
    invoke-interface {v8, p1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    const/16 v2, 0x20

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    const/16 v2, 0x10

    .line 39
    .line 40
    :goto_2
    or-int/2addr p3, v2

    .line 41
    :cond_3
    and-int/lit16 v2, p4, 0x180

    .line 42
    .line 43
    if-nez v2, :cond_5

    .line 44
    .line 45
    invoke-interface {v8, p2}, LY/m;->F(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_4

    .line 50
    .line 51
    const/16 v2, 0x100

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_4
    const/16 v2, 0x80

    .line 55
    .line 56
    :goto_3
    or-int/2addr p3, v2

    .line 57
    :cond_5
    and-int/lit16 v2, p3, 0x93

    .line 58
    .line 59
    const/16 v3, 0x92

    .line 60
    .line 61
    if-ne v2, v3, :cond_7

    .line 62
    .line 63
    invoke-interface {v8}, LY/m;->i()Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-nez v2, :cond_6

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_6
    invoke-interface {v8}, LY/m;->K()V

    .line 71
    .line 72
    .line 73
    move v2, p0

    .line 74
    move-object v3, p1

    .line 75
    goto/16 :goto_6

    .line 76
    .line 77
    :cond_7
    :goto_4
    invoke-static {}, LY/w;->L()Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_8

    .line 82
    .line 83
    const/4 v2, -0x1

    .line 84
    const-string v3, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:1000)"

    .line 85
    .line 86
    invoke-static {v0, p3, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :cond_8
    and-int/lit8 v0, p3, 0xe

    .line 90
    .line 91
    const/4 v2, 0x0

    .line 92
    const/4 v3, 0x1

    .line 93
    if-ne v0, v1, :cond_9

    .line 94
    .line 95
    move v4, v3

    .line 96
    goto :goto_5

    .line 97
    :cond_9
    move v4, v2

    .line 98
    :goto_5
    invoke-interface {v8, p2}, LY/m;->U(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    or-int/2addr v4, v5

    .line 103
    invoke-interface {v8}, LY/m;->D()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    if-nez v4, :cond_a

    .line 108
    .line 109
    sget-object v4, LY/m;->a:LY/m$a;

    .line 110
    .line 111
    invoke-virtual {v4}, LY/m$a;->a()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    if-ne v5, v4, :cond_b

    .line 116
    .line 117
    :cond_a
    invoke-virtual {p2, p0}, LQ/F;->Q(Z)LK/J;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    invoke-interface {v8, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    :cond_b
    check-cast v5, LK/J;

    .line 125
    .line 126
    invoke-interface {v8, p2}, LY/m;->F(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-ne v0, v1, :cond_c

    .line 131
    .line 132
    move v2, v3

    .line 133
    :cond_c
    or-int v0, v4, v2

    .line 134
    .line 135
    invoke-interface {v8}, LY/m;->D()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    if-nez v0, :cond_d

    .line 140
    .line 141
    sget-object v0, LY/m;->a:LY/m$a;

    .line 142
    .line 143
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    if-ne v1, v0, :cond_e

    .line 148
    .line 149
    :cond_d
    new-instance v1, LQ/G$a;

    .line 150
    .line 151
    invoke-direct {v1, p2, p0}, LQ/G$a;-><init>(LQ/F;Z)V

    .line 152
    .line 153
    .line 154
    invoke-interface {v8, v1}, LY/m;->u(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    :cond_e
    check-cast v1, LQ/i;

    .line 158
    .line 159
    invoke-virtual {p2}, LQ/F;->O()La1/U;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {v0}, La1/U;->k()J

    .line 164
    .line 165
    .line 166
    move-result-wide v2

    .line 167
    invoke-static {v2, v3}, LU0/W0;->m(J)Z

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 172
    .line 173
    invoke-interface {v8, v5}, LY/m;->F(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    invoke-interface {v8}, LY/m;->D()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    if-nez v2, :cond_f

    .line 182
    .line 183
    sget-object v2, LY/m;->a:LY/m$a;

    .line 184
    .line 185
    invoke-virtual {v2}, LY/m$a;->a()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    if-ne v3, v2, :cond_10

    .line 190
    .line 191
    :cond_f
    new-instance v3, LQ/G$b;

    .line 192
    .line 193
    const/4 v2, 0x0

    .line 194
    invoke-direct {v3, v5, v2}, LQ/G$b;-><init>(LK/J;LZd/e;)V

    .line 195
    .line 196
    .line 197
    invoke-interface {v8, v3}, LY/m;->u(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    :cond_10
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 201
    .line 202
    invoke-static {v0, v5, v3}, LE0/V;->d(Landroidx/compose/ui/e;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/e;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    shl-int/lit8 p3, p3, 0x3

    .line 207
    .line 208
    and-int/lit16 v9, p3, 0x3f0

    .line 209
    .line 210
    const/16 v10, 0x10

    .line 211
    .line 212
    const-wide/16 v5, 0x0

    .line 213
    .line 214
    move v2, p0

    .line 215
    move-object v3, p1

    .line 216
    invoke-static/range {v1 .. v10}, LQ/a;->b(LQ/i;ZLg1/i;ZJLandroidx/compose/ui/e;LY/m;II)V

    .line 217
    .line 218
    .line 219
    invoke-static {}, LY/w;->L()Z

    .line 220
    .line 221
    .line 222
    move-result p0

    .line 223
    if-eqz p0, :cond_11

    .line 224
    .line 225
    invoke-static {}, LY/w;->T()V

    .line 226
    .line 227
    .line 228
    :cond_11
    :goto_6
    invoke-interface {v8}, LY/m;->k()LY/B1;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    if-eqz p0, :cond_12

    .line 233
    .line 234
    new-instance p1, LQ/G$c;

    .line 235
    .line 236
    invoke-direct {p1, v2, v3, p2, p4}, LQ/G$c;-><init>(ZLg1/i;LQ/F;I)V

    .line 237
    .line 238
    .line 239
    invoke-interface {p0, p1}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 240
    .line 241
    .line 242
    :cond_12
    return-void
.end method

.method public static final b(LQ/F;J)J
    .locals 7

    .line 1
    invoke-virtual {p0}, LQ/F;->A()Lr0/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_b

    .line 6
    .line 7
    invoke-virtual {v0}, Lr0/f;->u()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-virtual {p0}, LQ/F;->N()LU0/e;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_a

    .line 16
    .line 17
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    goto/16 :goto_4

    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0}, LQ/F;->C()LK/l;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const/4 v3, -0x1

    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    move v2, v3

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    sget-object v4, LQ/G$d;->a:[I

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    aget v2, v4, v2

    .line 41
    .line 42
    :goto_0
    if-eq v2, v3, :cond_9

    .line 43
    .line 44
    const/4 v3, 0x1

    .line 45
    const/4 v4, 0x2

    .line 46
    if-eq v2, v3, :cond_3

    .line 47
    .line 48
    if-eq v2, v4, :cond_3

    .line 49
    .line 50
    const/4 v3, 0x3

    .line 51
    if-ne v2, v3, :cond_2

    .line 52
    .line 53
    invoke-virtual {p0}, LQ/F;->O()La1/U;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v2}, La1/U;->k()J

    .line 58
    .line 59
    .line 60
    move-result-wide v2

    .line 61
    invoke-static {v2, v3}, LU0/W0;->i(J)I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    new-instance p0, LTd/r;

    .line 67
    .line 68
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 69
    .line 70
    .line 71
    throw p0

    .line 72
    :cond_3
    invoke-virtual {p0}, LQ/F;->O()La1/U;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v2}, La1/U;->k()J

    .line 77
    .line 78
    .line 79
    move-result-wide v2

    .line 80
    invoke-static {v2, v3}, LU0/W0;->n(J)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    :goto_1
    invoke-virtual {p0}, LQ/F;->L()LK/y;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    if-eqz v3, :cond_8

    .line 89
    .line 90
    invoke-virtual {v3}, LK/y;->j()LK/Z;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    if-nez v3, :cond_4

    .line 95
    .line 96
    goto/16 :goto_3

    .line 97
    .line 98
    :cond_4
    invoke-virtual {p0}, LQ/F;->L()LK/y;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    if-eqz v5, :cond_7

    .line 103
    .line 104
    invoke-virtual {v5}, LK/y;->v()LK/H;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    if-eqz v5, :cond_7

    .line 109
    .line 110
    invoke-virtual {v5}, LK/H;->k()LU0/e;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    if-nez v5, :cond_5

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_5
    invoke-virtual {p0}, LQ/F;->J()La1/J;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-interface {p0, v2}, La1/J;->b(I)I

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    const/4 v2, 0x0

    .line 126
    invoke-virtual {v5}, LU0/e;->length()I

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    invoke-static {p0, v2, v5}, Loe/j;->m(III)I

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    invoke-virtual {v3, v0, v1}, LK/Z;->j(J)J

    .line 135
    .line 136
    .line 137
    move-result-wide v0

    .line 138
    invoke-static {v0, v1}, Lr0/f;->m(J)F

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    invoke-virtual {v3}, LK/Z;->f()LU0/T0;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-virtual {v1, p0}, LU0/T0;->q(I)I

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    invoke-virtual {v1, p0}, LU0/T0;->s(I)F

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    invoke-virtual {v1, p0}, LU0/T0;->t(I)F

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    invoke-static {v0, v5, v2}, Loe/j;->l(FFF)F

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    sget-object v3, Li1/r;->b:Li1/r$a;

    .line 171
    .line 172
    invoke-virtual {v3}, Li1/r$a;->a()J

    .line 173
    .line 174
    .line 175
    move-result-wide v5

    .line 176
    invoke-static {p1, p2, v5, v6}, Li1/r;->e(JJ)Z

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    if-nez v3, :cond_6

    .line 181
    .line 182
    sub-float/2addr v0, v2

    .line 183
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    invoke-static {p1, p2}, Li1/r;->g(J)I

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    div-int/2addr p1, v4

    .line 192
    int-to-float p1, p1

    .line 193
    cmpl-float p1, v0, p1

    .line 194
    .line 195
    if-lez p1, :cond_6

    .line 196
    .line 197
    sget-object p0, Lr0/f;->b:Lr0/f$a;

    .line 198
    .line 199
    invoke-virtual {p0}, Lr0/f$a;->b()J

    .line 200
    .line 201
    .line 202
    move-result-wide p0

    .line 203
    return-wide p0

    .line 204
    :cond_6
    invoke-virtual {v1, p0}, LU0/T0;->v(I)F

    .line 205
    .line 206
    .line 207
    move-result p1

    .line 208
    invoke-virtual {v1, p0}, LU0/T0;->m(I)F

    .line 209
    .line 210
    .line 211
    move-result p0

    .line 212
    sub-float/2addr p0, p1

    .line 213
    int-to-float p2, v4

    .line 214
    div-float/2addr p0, p2

    .line 215
    add-float/2addr p0, p1

    .line 216
    invoke-static {v2, p0}, Lr0/g;->a(FF)J

    .line 217
    .line 218
    .line 219
    move-result-wide p0

    .line 220
    return-wide p0

    .line 221
    :cond_7
    :goto_2
    sget-object p0, Lr0/f;->b:Lr0/f$a;

    .line 222
    .line 223
    invoke-virtual {p0}, Lr0/f$a;->b()J

    .line 224
    .line 225
    .line 226
    move-result-wide p0

    .line 227
    return-wide p0

    .line 228
    :cond_8
    :goto_3
    sget-object p0, Lr0/f;->b:Lr0/f$a;

    .line 229
    .line 230
    invoke-virtual {p0}, Lr0/f$a;->b()J

    .line 231
    .line 232
    .line 233
    move-result-wide p0

    .line 234
    return-wide p0

    .line 235
    :cond_9
    sget-object p0, Lr0/f;->b:Lr0/f$a;

    .line 236
    .line 237
    invoke-virtual {p0}, Lr0/f$a;->b()J

    .line 238
    .line 239
    .line 240
    move-result-wide p0

    .line 241
    return-wide p0

    .line 242
    :cond_a
    :goto_4
    sget-object p0, Lr0/f;->b:Lr0/f$a;

    .line 243
    .line 244
    invoke-virtual {p0}, Lr0/f$a;->b()J

    .line 245
    .line 246
    .line 247
    move-result-wide p0

    .line 248
    return-wide p0

    .line 249
    :cond_b
    sget-object p0, Lr0/f;->b:Lr0/f$a;

    .line 250
    .line 251
    invoke-virtual {p0}, Lr0/f$a;->b()J

    .line 252
    .line 253
    .line 254
    move-result-wide p0

    .line 255
    return-wide p0
.end method

.method public static final c(LQ/F;Z)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LQ/F;->L()LK/y;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, LK/y;->i()LI0/p;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {v0}, LQ/z;->b(LI0/p;)Lr0/h;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, p1}, LQ/F;->G(Z)J

    .line 20
    .line 21
    .line 22
    move-result-wide p0

    .line 23
    invoke-static {v0, p0, p1}, LQ/z;->a(Lr0/h;J)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    :cond_0
    const/4 p0, 0x0

    .line 29
    return p0
.end method
