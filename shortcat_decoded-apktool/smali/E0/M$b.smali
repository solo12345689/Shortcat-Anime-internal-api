.class public final LE0/M$b;
.super LE0/I;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE0/M;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private b:LE0/M$a;

.field private c:LE0/q;

.field final synthetic d:LE0/M;


# direct methods
.method constructor <init>(LE0/M;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE0/M$b;->d:LE0/M;

    .line 2
    .line 3
    invoke-direct {p0}, LE0/I;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object p1, LE0/M$a;->a:LE0/M$a;

    .line 7
    .line 8
    iput-object p1, p0, LE0/M$b;->b:LE0/M$a;

    .line 9
    .line 10
    return-void
.end method

.method public static final synthetic g(LE0/M$b;LE0/M$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE0/M$b;->b:LE0/M$a;

    .line 2
    .line 3
    return-void
.end method

.method private final h(LE0/q;Z)V
    .locals 6

    .line 1
    invoke-virtual {p1}, LE0/q;->c()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    :goto_0
    if-ge v3, v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    check-cast v4, LE0/C;

    .line 18
    .line 19
    invoke-virtual {v4}, LE0/C;->p()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    invoke-direct {p0, p1}, LE0/M$b;->j(LE0/q;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {p0}, LE0/I;->b()LI0/p;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-eqz v1, :cond_5

    .line 37
    .line 38
    sget-object v3, Lr0/f;->b:Lr0/f$a;

    .line 39
    .line 40
    invoke-virtual {v3}, Lr0/f$a;->c()J

    .line 41
    .line 42
    .line 43
    move-result-wide v3

    .line 44
    invoke-interface {v1, v3, v4}, LI0/p;->E0(J)J

    .line 45
    .line 46
    .line 47
    move-result-wide v3

    .line 48
    new-instance v1, LE0/M$b$a;

    .line 49
    .line 50
    iget-object v5, p0, LE0/M$b;->d:LE0/M;

    .line 51
    .line 52
    invoke-direct {v1, p0, v5}, LE0/M$b$a;-><init>(LE0/M$b;LE0/M;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1, v3, v4, v1}, LE0/O;->c(LE0/q;JLkotlin/jvm/functions/Function1;)V

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, LE0/M$b;->b:LE0/M$a;

    .line 59
    .line 60
    sget-object v3, LE0/M$a;->b:LE0/M$a;

    .line 61
    .line 62
    if-ne v1, v3, :cond_4

    .line 63
    .line 64
    sget-boolean v1, Ll0/h;->k:Z

    .line 65
    .line 66
    if-eqz v1, :cond_2

    .line 67
    .line 68
    if-eqz p2, :cond_3

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    :goto_1
    if-ge v2, p2, :cond_3

    .line 75
    .line 76
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, LE0/C;

    .line 81
    .line 82
    invoke-virtual {v1}, LE0/C;->a()V

    .line 83
    .line 84
    .line 85
    add-int/lit8 v2, v2, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    :goto_2
    if-ge v2, p2, :cond_3

    .line 93
    .line 94
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    check-cast v1, LE0/C;

    .line 99
    .line 100
    invoke-virtual {v1}, LE0/C;->a()V

    .line 101
    .line 102
    .line 103
    add-int/lit8 v2, v2, 0x1

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_3
    invoke-virtual {p1}, LE0/q;->d()LE0/g;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    if-eqz p1, :cond_4

    .line 111
    .line 112
    iget-object p2, p0, LE0/M$b;->d:LE0/M;

    .line 113
    .line 114
    invoke-virtual {p2}, LE0/M;->a()Z

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    xor-int/lit8 p2, p2, 0x1

    .line 119
    .line 120
    invoke-virtual {p1, p2}, LE0/g;->e(Z)V

    .line 121
    .line 122
    .line 123
    :cond_4
    return-void

    .line 124
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 125
    .line 126
    const-string p2, "layoutCoordinates not set"

    .line 127
    .line 128
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw p1
.end method

.method private final i()V
    .locals 2

    .line 1
    sget-object v0, LE0/M$a;->a:LE0/M$a;

    .line 2
    .line 3
    iput-object v0, p0, LE0/M$b;->b:LE0/M$a;

    .line 4
    .line 5
    iget-object v0, p0, LE0/M$b;->d:LE0/M;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, LE0/M;->h(Z)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, LE0/M$b;->c:LE0/q;

    .line 13
    .line 14
    return-void
.end method

.method private final j(LE0/q;)V
    .locals 4

    .line 1
    iget-object v0, p0, LE0/M$b;->b:LE0/M$a;

    .line 2
    .line 3
    sget-object v1, LE0/M$a;->b:LE0/M$a;

    .line 4
    .line 5
    if-ne v0, v1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, LE0/I;->b()LI0/p;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sget-object v1, Lr0/f;->b:Lr0/f$a;

    .line 14
    .line 15
    invoke-virtual {v1}, Lr0/f$a;->c()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    invoke-interface {v0, v1, v2}, LI0/p;->E0(J)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    new-instance v2, LE0/M$b$c;

    .line 24
    .line 25
    iget-object v3, p0, LE0/M$b;->d:LE0/M;

    .line 26
    .line 27
    invoke-direct {v2, v3}, LE0/M$b$c;-><init>(LE0/M;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1, v0, v1, v2}, LE0/O;->b(LE0/q;JLkotlin/jvm/functions/Function1;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v0, "layoutCoordinates not set"

    .line 37
    .line 38
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1

    .line 42
    :cond_1
    :goto_0
    sget-object p1, LE0/M$a;->c:LE0/M$a;

    .line 43
    .line 44
    iput-object p1, p0, LE0/M$b;->b:LE0/M$a;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public c()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public d()V
    .locals 4

    .line 1
    iget-object v0, p0, LE0/M$b;->b:LE0/M$a;

    .line 2
    .line 3
    sget-object v1, LE0/M$a;->b:LE0/M$a;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    new-instance v2, LE0/M$b$b;

    .line 12
    .line 13
    iget-object v3, p0, LE0/M$b;->d:LE0/M;

    .line 14
    .line 15
    invoke-direct {v2, v3}, LE0/M$b$b;-><init>(LE0/M;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1, v2}, LE0/O;->a(JLkotlin/jvm/functions/Function1;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, LE0/M$b;->i()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public e(LE0/q;LE0/s;J)V
    .locals 7

    .line 1
    invoke-virtual {p1}, LE0/q;->c()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-interface {p3}, Ljava/util/Collection;->size()I

    .line 6
    .line 7
    .line 8
    move-result p4

    .line 9
    const/4 v0, 0x0

    .line 10
    move v1, v0

    .line 11
    :goto_0
    const/4 v2, 0x1

    .line 12
    if-ge v1, p4, :cond_1

    .line 13
    .line 14
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, LE0/C;

    .line 19
    .line 20
    invoke-static {v3}, LE0/r;->b(LE0/C;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    invoke-static {v3}, LE0/r;->d(LE0/C;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move p4, v0

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move p4, v2

    .line 38
    :goto_1
    if-eqz p4, :cond_4

    .line 39
    .line 40
    invoke-interface {p3}, Ljava/util/Collection;->size()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    move v3, v0

    .line 45
    :goto_2
    if-ge v3, v1, :cond_3

    .line 46
    .line 47
    invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, LE0/C;

    .line 52
    .line 53
    invoke-virtual {v4}, LE0/C;->p()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_2

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    move v1, v2

    .line 64
    goto :goto_4

    .line 65
    :cond_4
    :goto_3
    move v1, v0

    .line 66
    :goto_4
    iget-object v3, p0, LE0/M$b;->d:LE0/M;

    .line 67
    .line 68
    invoke-virtual {v3}, LE0/M;->a()Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-nez v3, :cond_8

    .line 73
    .line 74
    invoke-interface {p3}, Ljava/util/Collection;->size()I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    move v4, v0

    .line 79
    :goto_5
    if-ge v4, v3, :cond_6

    .line 80
    .line 81
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    check-cast v5, LE0/C;

    .line 86
    .line 87
    invoke-static {v5}, LE0/r;->b(LE0/C;)Z

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    if-nez v6, :cond_8

    .line 92
    .line 93
    invoke-static {v5}, LE0/r;->d(LE0/C;)Z

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    if-eqz v5, :cond_5

    .line 98
    .line 99
    goto :goto_6

    .line 100
    :cond_5
    add-int/lit8 v4, v4, 0x1

    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_6
    if-eqz v1, :cond_7

    .line 104
    .line 105
    sget-boolean v1, Ll0/h;->k:Z

    .line 106
    .line 107
    if-eqz v1, :cond_7

    .line 108
    .line 109
    goto :goto_6

    .line 110
    :cond_7
    move v1, v0

    .line 111
    goto :goto_7

    .line 112
    :cond_8
    :goto_6
    move v1, v2

    .line 113
    :goto_7
    iget-object v3, p0, LE0/M$b;->b:LE0/M$a;

    .line 114
    .line 115
    sget-object v4, LE0/M$a;->c:LE0/M$a;

    .line 116
    .line 117
    if-eq v3, v4, :cond_e

    .line 118
    .line 119
    sget-object v3, LE0/s;->a:LE0/s;

    .line 120
    .line 121
    if-ne p2, v3, :cond_b

    .line 122
    .line 123
    if-eqz v1, :cond_b

    .line 124
    .line 125
    iput-object p1, p0, LE0/M$b;->c:LE0/q;

    .line 126
    .line 127
    if-eqz p4, :cond_a

    .line 128
    .line 129
    iget-object v3, p0, LE0/M$b;->d:LE0/M;

    .line 130
    .line 131
    invoke-virtual {v3}, LE0/M;->a()Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-eqz v3, :cond_9

    .line 136
    .line 137
    goto :goto_8

    .line 138
    :cond_9
    move v3, v0

    .line 139
    goto :goto_9

    .line 140
    :cond_a
    :goto_8
    move v3, v2

    .line 141
    :goto_9
    invoke-direct {p0, p1, v3}, LE0/M$b;->h(LE0/q;Z)V

    .line 142
    .line 143
    .line 144
    :cond_b
    sget-object v3, LE0/s;->b:LE0/s;

    .line 145
    .line 146
    if-ne p2, v3, :cond_c

    .line 147
    .line 148
    if-eqz p4, :cond_c

    .line 149
    .line 150
    iget-object v3, p0, LE0/M$b;->c:LE0/q;

    .line 151
    .line 152
    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    if-eqz v3, :cond_c

    .line 157
    .line 158
    iget-object v3, p0, LE0/M$b;->d:LE0/M;

    .line 159
    .line 160
    invoke-virtual {v3}, LE0/M;->a()Z

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    if-eqz v3, :cond_c

    .line 165
    .line 166
    sget-boolean v3, Ll0/h;->k:Z

    .line 167
    .line 168
    if-eqz v3, :cond_c

    .line 169
    .line 170
    invoke-interface {p3}, Ljava/util/Collection;->size()I

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    move v4, v0

    .line 175
    :goto_a
    if-ge v4, v3, :cond_c

    .line 176
    .line 177
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    check-cast v5, LE0/C;

    .line 182
    .line 183
    invoke-virtual {v5}, LE0/C;->a()V

    .line 184
    .line 185
    .line 186
    add-int/lit8 v4, v4, 0x1

    .line 187
    .line 188
    goto :goto_a

    .line 189
    :cond_c
    sget-boolean v3, Ll0/h;->k:Z

    .line 190
    .line 191
    if-eqz v3, :cond_d

    .line 192
    .line 193
    sget-object v3, LE0/s;->c:LE0/s;

    .line 194
    .line 195
    if-ne p2, v3, :cond_e

    .line 196
    .line 197
    if-nez v1, :cond_e

    .line 198
    .line 199
    iget-object v1, p0, LE0/M$b;->c:LE0/q;

    .line 200
    .line 201
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    if-nez v1, :cond_e

    .line 206
    .line 207
    goto :goto_b

    .line 208
    :cond_d
    sget-object v3, LE0/s;->c:LE0/s;

    .line 209
    .line 210
    if-ne p2, v3, :cond_e

    .line 211
    .line 212
    if-nez v1, :cond_e

    .line 213
    .line 214
    :goto_b
    invoke-direct {p0, p1, v2}, LE0/M$b;->h(LE0/q;Z)V

    .line 215
    .line 216
    .line 217
    :cond_e
    sget-object v1, LE0/s;->c:LE0/s;

    .line 218
    .line 219
    if-ne p2, v1, :cond_13

    .line 220
    .line 221
    invoke-interface {p3}, Ljava/util/Collection;->size()I

    .line 222
    .line 223
    .line 224
    move-result p2

    .line 225
    move v1, v0

    .line 226
    :goto_c
    if-ge v1, p2, :cond_10

    .line 227
    .line 228
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    check-cast v2, LE0/C;

    .line 233
    .line 234
    invoke-static {v2}, LE0/r;->d(LE0/C;)Z

    .line 235
    .line 236
    .line 237
    move-result v2

    .line 238
    if-nez v2, :cond_f

    .line 239
    .line 240
    goto :goto_d

    .line 241
    :cond_f
    add-int/lit8 v1, v1, 0x1

    .line 242
    .line 243
    goto :goto_c

    .line 244
    :cond_10
    invoke-direct {p0}, LE0/M$b;->i()V

    .line 245
    .line 246
    .line 247
    :goto_d
    iget-object p2, p0, LE0/M$b;->c:LE0/q;

    .line 248
    .line 249
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result p2

    .line 253
    if-eqz p2, :cond_13

    .line 254
    .line 255
    if-eqz p4, :cond_13

    .line 256
    .line 257
    sget-boolean p2, Ll0/h;->k:Z

    .line 258
    .line 259
    if-eqz p2, :cond_13

    .line 260
    .line 261
    invoke-interface {p3}, Ljava/util/Collection;->size()I

    .line 262
    .line 263
    .line 264
    move-result p2

    .line 265
    move p4, v0

    .line 266
    :goto_e
    if-ge p4, p2, :cond_12

    .line 267
    .line 268
    invoke-interface {p3, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    check-cast v1, LE0/C;

    .line 273
    .line 274
    invoke-virtual {v1}, LE0/C;->p()Z

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    if-eqz v1, :cond_11

    .line 279
    .line 280
    iget-object p2, p0, LE0/M$b;->d:LE0/M;

    .line 281
    .line 282
    invoke-virtual {p2}, LE0/M;->a()Z

    .line 283
    .line 284
    .line 285
    move-result p2

    .line 286
    if-nez p2, :cond_12

    .line 287
    .line 288
    invoke-direct {p0, p1}, LE0/M$b;->j(LE0/q;)V

    .line 289
    .line 290
    .line 291
    return-void

    .line 292
    :cond_11
    add-int/lit8 p4, p4, 0x1

    .line 293
    .line 294
    goto :goto_e

    .line 295
    :cond_12
    invoke-interface {p3}, Ljava/util/Collection;->size()I

    .line 296
    .line 297
    .line 298
    move-result p1

    .line 299
    :goto_f
    if-ge v0, p1, :cond_13

    .line 300
    .line 301
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object p2

    .line 305
    check-cast p2, LE0/C;

    .line 306
    .line 307
    invoke-virtual {p2}, LE0/C;->a()V

    .line 308
    .line 309
    .line 310
    add-int/lit8 v0, v0, 0x1

    .line 311
    .line 312
    goto :goto_f

    .line 313
    :cond_13
    return-void
.end method
