.class public final LU0/V0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LU0/V0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LU0/V0;

    .line 2
    .line 3
    invoke-direct {v0}, LU0/V0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LU0/V0;->a:LU0/V0;

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
.method public final a(Ls0/j0;LU0/T0;)V
    .locals 13

    .line 1
    invoke-virtual {p2}, LU0/T0;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p2}, LU0/T0;->l()LU0/S0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, LU0/S0;->f()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    sget-object v2, Lg1/v;->a:Lg1/v$a;

    .line 17
    .line 18
    invoke-virtual {v2}, Lg1/v$a;->e()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-static {v0, v2}, Lg1/v;->g(II)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    move v2, v0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v2, v1

    .line 32
    :goto_0
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-virtual {p2}, LU0/T0;->B()J

    .line 35
    .line 36
    .line 37
    move-result-wide v3

    .line 38
    const/16 v0, 0x20

    .line 39
    .line 40
    shr-long/2addr v3, v0

    .line 41
    long-to-int v3, v3

    .line 42
    int-to-float v3, v3

    .line 43
    invoke-virtual {p2}, LU0/T0;->B()J

    .line 44
    .line 45
    .line 46
    move-result-wide v4

    .line 47
    const-wide v6, 0xffffffffL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    and-long/2addr v4, v6

    .line 53
    long-to-int v4, v4

    .line 54
    int-to-float v4, v4

    .line 55
    sget-object v5, Lr0/f;->b:Lr0/f$a;

    .line 56
    .line 57
    invoke-virtual {v5}, Lr0/f$a;->c()J

    .line 58
    .line 59
    .line 60
    move-result-wide v8

    .line 61
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    int-to-long v10, v3

    .line 66
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    int-to-long v3, v3

    .line 71
    shl-long/2addr v10, v0

    .line 72
    and-long/2addr v3, v6

    .line 73
    or-long/2addr v3, v10

    .line 74
    invoke-static {v3, v4}, Lr0/l;->d(J)J

    .line 75
    .line 76
    .line 77
    move-result-wide v3

    .line 78
    invoke-static {v8, v9, v3, v4}, Lr0/i;->b(JJ)Lr0/h;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-interface {p1}, Ls0/j0;->p()V

    .line 83
    .line 84
    .line 85
    const/4 v3, 0x2

    .line 86
    const/4 v4, 0x0

    .line 87
    invoke-static {p1, v0, v1, v3, v4}, Ls0/j0;->n(Ls0/j0;Lr0/h;IILjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_1
    invoke-virtual {p2}, LU0/T0;->l()LU0/S0;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v0}, LU0/S0;->i()LU0/Y0;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, LU0/Y0;->A()LU0/I0;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v0}, LU0/I0;->s()Lg1/k;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    if-nez v1, :cond_2

    .line 107
    .line 108
    sget-object v1, Lg1/k;->b:Lg1/k$a;

    .line 109
    .line 110
    invoke-virtual {v1}, Lg1/k$a;->c()Lg1/k;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    :cond_2
    move-object v8, v1

    .line 115
    invoke-virtual {v0}, LU0/I0;->r()Ls0/C1;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    if-nez v1, :cond_3

    .line 120
    .line 121
    sget-object v1, Ls0/C1;->d:Ls0/C1$a;

    .line 122
    .line 123
    invoke-virtual {v1}, Ls0/C1$a;->a()Ls0/C1;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    :cond_3
    move-object v7, v1

    .line 128
    invoke-virtual {v0}, LU0/I0;->h()Lu0/g;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    if-nez v1, :cond_4

    .line 133
    .line 134
    sget-object v1, Lu0/j;->a:Lu0/j;

    .line 135
    .line 136
    :cond_4
    move-object v9, v1

    .line 137
    :try_start_0
    invoke-virtual {v0}, LU0/I0;->f()Ls0/h0;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    if-eqz v5, :cond_6

    .line 142
    .line 143
    invoke-virtual {v0}, LU0/I0;->t()Lg1/p;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    sget-object v3, Lg1/p$b;->b:Lg1/p$b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 148
    .line 149
    if-eq v1, v3, :cond_5

    .line 150
    .line 151
    :try_start_1
    invoke-virtual {v0}, LU0/I0;->t()Lg1/p;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-interface {v0}, Lg1/p;->a()F

    .line 156
    .line 157
    .line 158
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 159
    :goto_1
    move v6, v0

    .line 160
    goto :goto_2

    .line 161
    :catchall_0
    move-exception v0

    .line 162
    move-object p2, v0

    .line 163
    move-object v4, p1

    .line 164
    goto :goto_7

    .line 165
    :cond_5
    const/high16 v0, 0x3f800000    # 1.0f

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :goto_2
    :try_start_2
    invoke-virtual {p2}, LU0/T0;->w()LU0/n;

    .line 169
    .line 170
    .line 171
    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 172
    const/16 v11, 0x40

    .line 173
    .line 174
    const/4 v12, 0x0

    .line 175
    const/4 v10, 0x0

    .line 176
    move-object v4, p1

    .line 177
    :try_start_3
    invoke-static/range {v3 .. v12}, LU0/n;->K(LU0/n;Ls0/j0;Ls0/h0;FLs0/C1;Lg1/k;Lu0/g;IILjava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    goto :goto_6

    .line 181
    :catchall_1
    move-exception v0

    .line 182
    :goto_3
    move-object p2, v0

    .line 183
    goto :goto_7

    .line 184
    :catchall_2
    move-exception v0

    .line 185
    move-object v4, p1

    .line 186
    goto :goto_3

    .line 187
    :cond_6
    move-object v4, p1

    .line 188
    invoke-virtual {v0}, LU0/I0;->t()Lg1/p;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    sget-object v1, Lg1/p$b;->b:Lg1/p$b;

    .line 193
    .line 194
    if-eq p1, v1, :cond_7

    .line 195
    .line 196
    invoke-virtual {v0}, LU0/I0;->t()Lg1/p;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-interface {p1}, Lg1/p;->b()J

    .line 201
    .line 202
    .line 203
    move-result-wide v0

    .line 204
    :goto_4
    move-wide v5, v0

    .line 205
    goto :goto_5

    .line 206
    :cond_7
    sget-object p1, Ls0/r0;->b:Ls0/r0$a;

    .line 207
    .line 208
    invoke-virtual {p1}, Ls0/r0$a;->a()J

    .line 209
    .line 210
    .line 211
    move-result-wide v0

    .line 212
    goto :goto_4

    .line 213
    :goto_5
    invoke-virtual {p2}, LU0/T0;->w()LU0/n;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    const/16 v11, 0x20

    .line 218
    .line 219
    const/4 v12, 0x0

    .line 220
    const/4 v10, 0x0

    .line 221
    invoke-static/range {v3 .. v12}, LU0/n;->I(LU0/n;Ls0/j0;JLs0/C1;Lg1/k;Lu0/g;IILjava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 222
    .line 223
    .line 224
    :goto_6
    if-eqz v2, :cond_8

    .line 225
    .line 226
    invoke-interface {v4}, Ls0/j0;->k()V

    .line 227
    .line 228
    .line 229
    :cond_8
    return-void

    .line 230
    :goto_7
    if-eqz v2, :cond_9

    .line 231
    .line 232
    invoke-interface {v4}, Ls0/j0;->k()V

    .line 233
    .line 234
    .line 235
    :cond_9
    throw p2
.end method
