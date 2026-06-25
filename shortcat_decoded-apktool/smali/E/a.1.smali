.class final LE/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LE/A;


# instance fields
.field private final a:I

.field private b:I

.field private final c:La0/c;

.field private d:Z


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LE/a;->a:I

    .line 5
    .line 6
    const/4 p1, -0x1

    .line 7
    iput p1, p0, LE/a;->b:I

    .line 8
    .line 9
    new-instance p1, La0/c;

    .line 10
    .line 11
    const/16 v0, 0x10

    .line 12
    .line 13
    new-array v0, v0, [Landroidx/compose/foundation/lazy/layout/d$b;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {p1, v0, v1}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, LE/a;->c:La0/c;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public a(LF/I;I)V
    .locals 3

    .line 1
    iget v0, p0, LE/a;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :goto_0
    if-ge v1, v0, :cond_0

    .line 5
    .line 6
    add-int v2, p2, v1

    .line 7
    .line 8
    invoke-interface {p1, v2}, LF/I;->a(I)V

    .line 9
    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-void
.end method

.method public c(LE/z;FLE/s;)V
    .locals 8

    .line 1
    invoke-interface {p3}, LE/s;->i()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_a

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    cmpg-float v0, p2, v0

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x1

    .line 16
    if-gez v0, :cond_0

    .line 17
    .line 18
    move v0, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v0, v1

    .line 21
    :goto_0
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-interface {p3}, LE/s;->i()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-static {v3}, LUd/u;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, LE/k;

    .line 32
    .line 33
    invoke-interface {p3}, LE/s;->a()Lz/q;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    sget-object v5, Lz/q;->a:Lz/q;

    .line 38
    .line 39
    if-ne v4, v5, :cond_1

    .line 40
    .line 41
    invoke-interface {v3}, LE/k;->b()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    invoke-interface {v3}, LE/k;->getColumn()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    :goto_1
    add-int/2addr v3, v2

    .line 51
    invoke-interface {p3}, LE/s;->i()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-static {v4}, LUd/u;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    check-cast v4, LE/k;

    .line 60
    .line 61
    invoke-interface {v4}, LE/k;->getIndex()I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    add-int/2addr v4, v2

    .line 66
    goto :goto_3

    .line 67
    :cond_2
    invoke-interface {p3}, LE/s;->i()Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-static {v3}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    check-cast v3, LE/k;

    .line 76
    .line 77
    invoke-interface {p3}, LE/s;->a()Lz/q;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    sget-object v5, Lz/q;->a:Lz/q;

    .line 82
    .line 83
    if-ne v4, v5, :cond_3

    .line 84
    .line 85
    invoke-interface {v3}, LE/k;->b()I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    goto :goto_2

    .line 90
    :cond_3
    invoke-interface {v3}, LE/k;->getColumn()I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    :goto_2
    add-int/lit8 v3, v3, -0x1

    .line 95
    .line 96
    invoke-interface {p3}, LE/s;->i()Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-static {v4}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    check-cast v4, LE/k;

    .line 105
    .line 106
    invoke-interface {v4}, LE/k;->getIndex()I

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    sub-int/2addr v4, v2

    .line 111
    :goto_3
    if-ltz v4, :cond_a

    .line 112
    .line 113
    invoke-interface {p3}, LE/s;->g()I

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-ge v4, v5, :cond_a

    .line 118
    .line 119
    iget v4, p0, LE/a;->b:I

    .line 120
    .line 121
    if-eq v3, v4, :cond_6

    .line 122
    .line 123
    iget-boolean v4, p0, LE/a;->d:Z

    .line 124
    .line 125
    if-eq v4, v0, :cond_5

    .line 126
    .line 127
    iget-object v4, p0, LE/a;->c:La0/c;

    .line 128
    .line 129
    invoke-virtual {v4}, La0/c;->p()I

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    if-lez v5, :cond_5

    .line 134
    .line 135
    invoke-virtual {v4}, La0/c;->o()[Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    move v6, v1

    .line 140
    :cond_4
    aget-object v7, v4, v6

    .line 141
    .line 142
    check-cast v7, Landroidx/compose/foundation/lazy/layout/d$b;

    .line 143
    .line 144
    invoke-interface {v7}, Landroidx/compose/foundation/lazy/layout/d$b;->cancel()V

    .line 145
    .line 146
    .line 147
    add-int/2addr v6, v2

    .line 148
    if-lt v6, v5, :cond_4

    .line 149
    .line 150
    :cond_5
    iput-boolean v0, p0, LE/a;->d:Z

    .line 151
    .line 152
    iput v3, p0, LE/a;->b:I

    .line 153
    .line 154
    iget-object v4, p0, LE/a;->c:La0/c;

    .line 155
    .line 156
    invoke-virtual {v4}, La0/c;->i()V

    .line 157
    .line 158
    .line 159
    iget-object v4, p0, LE/a;->c:La0/c;

    .line 160
    .line 161
    invoke-interface {p1, v3}, LE/z;->a(I)Ljava/util/List;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-virtual {v4}, La0/c;->p()I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    invoke-virtual {v4, v3, p1}, La0/c;->f(ILjava/util/List;)Z

    .line 170
    .line 171
    .line 172
    :cond_6
    if-eqz v0, :cond_8

    .line 173
    .line 174
    invoke-interface {p3}, LE/s;->i()Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-static {p1}, LUd/u;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    check-cast p1, LE/k;

    .line 183
    .line 184
    invoke-interface {p3}, LE/s;->a()Lz/q;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-static {p1, v0}, LA/e;->b(LE/k;Lz/q;)I

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    invoke-interface {p3}, LE/s;->h()I

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    invoke-interface {p3}, LE/s;->a()Lz/q;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    invoke-static {p1, v4}, LA/e;->a(LE/k;Lz/q;)I

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    add-int/2addr p1, v0

    .line 205
    add-int/2addr p1, v3

    .line 206
    invoke-interface {p3}, LE/s;->d()I

    .line 207
    .line 208
    .line 209
    move-result p3

    .line 210
    sub-int/2addr p1, p3

    .line 211
    int-to-float p1, p1

    .line 212
    neg-float p2, p2

    .line 213
    cmpg-float p1, p1, p2

    .line 214
    .line 215
    if-gez p1, :cond_a

    .line 216
    .line 217
    iget-object p1, p0, LE/a;->c:La0/c;

    .line 218
    .line 219
    invoke-virtual {p1}, La0/c;->p()I

    .line 220
    .line 221
    .line 222
    move-result p2

    .line 223
    if-lez p2, :cond_a

    .line 224
    .line 225
    invoke-virtual {p1}, La0/c;->o()[Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    :cond_7
    aget-object p3, p1, v1

    .line 230
    .line 231
    check-cast p3, Landroidx/compose/foundation/lazy/layout/d$b;

    .line 232
    .line 233
    invoke-interface {p3}, Landroidx/compose/foundation/lazy/layout/d$b;->a()V

    .line 234
    .line 235
    .line 236
    add-int/2addr v1, v2

    .line 237
    if-lt v1, p2, :cond_7

    .line 238
    .line 239
    goto :goto_4

    .line 240
    :cond_8
    invoke-interface {p3}, LE/s;->i()Ljava/util/List;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    invoke-static {p1}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    check-cast p1, LE/k;

    .line 249
    .line 250
    invoke-interface {p3}, LE/s;->f()I

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    invoke-interface {p3}, LE/s;->a()Lz/q;

    .line 255
    .line 256
    .line 257
    move-result-object p3

    .line 258
    invoke-static {p1, p3}, LA/e;->a(LE/k;Lz/q;)I

    .line 259
    .line 260
    .line 261
    move-result p1

    .line 262
    sub-int/2addr v0, p1

    .line 263
    int-to-float p1, v0

    .line 264
    cmpg-float p1, p1, p2

    .line 265
    .line 266
    if-gez p1, :cond_a

    .line 267
    .line 268
    iget-object p1, p0, LE/a;->c:La0/c;

    .line 269
    .line 270
    invoke-virtual {p1}, La0/c;->p()I

    .line 271
    .line 272
    .line 273
    move-result p2

    .line 274
    if-lez p2, :cond_a

    .line 275
    .line 276
    invoke-virtual {p1}, La0/c;->o()[Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    :cond_9
    aget-object p3, p1, v1

    .line 281
    .line 282
    check-cast p3, Landroidx/compose/foundation/lazy/layout/d$b;

    .line 283
    .line 284
    invoke-interface {p3}, Landroidx/compose/foundation/lazy/layout/d$b;->a()V

    .line 285
    .line 286
    .line 287
    add-int/2addr v1, v2

    .line 288
    if-lt v1, p2, :cond_9

    .line 289
    .line 290
    nop

    .line 291
    :cond_a
    :goto_4
    return-void
.end method

.method public d(LE/z;LE/s;)V
    .locals 2

    .line 1
    iget p1, p0, LE/a;->b:I

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    if-eq p1, v0, :cond_5

    .line 5
    .line 6
    invoke-interface {p2}, LE/s;->i()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-nez p1, :cond_5

    .line 15
    .line 16
    iget-boolean p1, p0, LE/a;->d:Z

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    invoke-interface {p2}, LE/s;->i()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, LUd/u;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, LE/k;

    .line 29
    .line 30
    invoke-interface {p2}, LE/s;->a()Lz/q;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    sget-object v1, Lz/q;->a:Lz/q;

    .line 35
    .line 36
    if-ne p2, v1, :cond_0

    .line 37
    .line 38
    invoke-interface {p1}, LE/k;->b()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-interface {p1}, LE/k;->getColumn()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    :goto_0
    add-int/lit8 p1, p1, 0x1

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_1
    invoke-interface {p2}, LE/s;->i()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {p1}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, LE/k;

    .line 59
    .line 60
    invoke-interface {p2}, LE/s;->a()Lz/q;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    sget-object v1, Lz/q;->a:Lz/q;

    .line 65
    .line 66
    if-ne p2, v1, :cond_2

    .line 67
    .line 68
    invoke-interface {p1}, LE/k;->b()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    invoke-interface {p1}, LE/k;->getColumn()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    :goto_1
    add-int/lit8 p1, p1, -0x1

    .line 78
    .line 79
    :goto_2
    iget p2, p0, LE/a;->b:I

    .line 80
    .line 81
    if-eq p2, p1, :cond_5

    .line 82
    .line 83
    iput v0, p0, LE/a;->b:I

    .line 84
    .line 85
    iget-object p1, p0, LE/a;->c:La0/c;

    .line 86
    .line 87
    invoke-virtual {p1}, La0/c;->p()I

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    if-lez p2, :cond_4

    .line 92
    .line 93
    invoke-virtual {p1}, La0/c;->o()[Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    const/4 v0, 0x0

    .line 98
    :cond_3
    aget-object v1, p1, v0

    .line 99
    .line 100
    check-cast v1, Landroidx/compose/foundation/lazy/layout/d$b;

    .line 101
    .line 102
    invoke-interface {v1}, Landroidx/compose/foundation/lazy/layout/d$b;->cancel()V

    .line 103
    .line 104
    .line 105
    add-int/lit8 v0, v0, 0x1

    .line 106
    .line 107
    if-lt v0, p2, :cond_3

    .line 108
    .line 109
    :cond_4
    iget-object p1, p0, LE/a;->c:La0/c;

    .line 110
    .line 111
    invoke-virtual {p1}, La0/c;->i()V

    .line 112
    .line 113
    .line 114
    :cond_5
    return-void
.end method
