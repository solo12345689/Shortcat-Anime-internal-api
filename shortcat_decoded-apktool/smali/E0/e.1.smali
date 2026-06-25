.class public final LE0/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:LI0/p;

.field private b:Z

.field private c:Z

.field private d:Z

.field private e:Z

.field private final f:Lt/L;

.field private final g:LE0/n;

.field private final h:Lt/I;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LI0/p;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE0/e;->a:LI0/p;

    .line 5
    .line 6
    new-instance p1, Lt/L;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {p1, v2, v0, v1}, Lt/L;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LE0/e;->f:Lt/L;

    .line 15
    .line 16
    new-instance p1, LE0/n;

    .line 17
    .line 18
    invoke-direct {p1}, LE0/n;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, LE0/e;->g:LE0/n;

    .line 22
    .line 23
    new-instance p1, Lt/I;

    .line 24
    .line 25
    const/16 v0, 0xa

    .line 26
    .line 27
    invoke-direct {p1, v0}, Lt/I;-><init>(I)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, LE0/e;->h:Lt/I;

    .line 31
    .line 32
    return-void
.end method

.method public static final synthetic a(LE0/e;Landroidx/compose/ui/e$c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LE0/e;->g(Landroidx/compose/ui/e$c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final f(JLt/L;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE0/e;->g:LE0/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, LE0/n;->h(JLt/L;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final g(Landroidx/compose/ui/e$c;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, LE0/e;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, LE0/e;->e:Z

    .line 7
    .line 8
    iget-object v0, p0, LE0/e;->f:Lt/L;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lt/L;->k(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, LE0/e;->g:LE0/n;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, LE0/n;->i(Landroidx/compose/ui/e$c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final b(JLjava/util/List;Z)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    iget-object v3, v0, LE0/e;->g:LE0/n;

    .line 6
    .line 7
    iget-object v4, v0, LE0/e;->h:Lt/I;

    .line 8
    .line 9
    invoke-virtual {v4}, Lt/I;->g()V

    .line 10
    .line 11
    .line 12
    invoke-interface/range {p3 .. p3}, Ljava/util/Collection;->size()I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    const/4 v6, 0x0

    .line 17
    move v7, v6

    .line 18
    const/4 v8, 0x1

    .line 19
    :goto_0
    if-ge v7, v4, :cond_7

    .line 20
    .line 21
    move-object/from16 v9, p3

    .line 22
    .line 23
    invoke-interface {v9, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v10

    .line 27
    check-cast v10, Landroidx/compose/ui/e$c;

    .line 28
    .line 29
    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 30
    .line 31
    .line 32
    move-result v11

    .line 33
    if-eqz v11, :cond_3

    .line 34
    .line 35
    new-instance v11, LE0/e$a;

    .line 36
    .line 37
    invoke-direct {v11, v0, v10}, LE0/e$a;-><init>(LE0/e;Landroidx/compose/ui/e$c;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v10, v11}, Landroidx/compose/ui/e$c;->setDetachedListener$ui_release(Lie/a;)V

    .line 41
    .line 42
    .line 43
    const/4 v11, 0x0

    .line 44
    if-eqz v8, :cond_5

    .line 45
    .line 46
    invoke-virtual {v3}, LE0/n;->g()La0/c;

    .line 47
    .line 48
    .line 49
    move-result-object v12

    .line 50
    iget-object v13, v12, La0/c;->a:[Ljava/lang/Object;

    .line 51
    .line 52
    invoke-virtual {v12}, La0/c;->p()I

    .line 53
    .line 54
    .line 55
    move-result v12

    .line 56
    move v14, v6

    .line 57
    :goto_1
    if-ge v14, v12, :cond_1

    .line 58
    .line 59
    aget-object v15, v13, v14

    .line 60
    .line 61
    move-object/from16 v16, v15

    .line 62
    .line 63
    check-cast v16, LE0/m;

    .line 64
    .line 65
    invoke-virtual/range {v16 .. v16}, LE0/m;->k()Landroidx/compose/ui/e$c;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-static {v5, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-eqz v5, :cond_0

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_0
    add-int/lit8 v14, v14, 0x1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    move-object v15, v11

    .line 80
    :goto_2
    check-cast v15, LE0/m;

    .line 81
    .line 82
    if-eqz v15, :cond_4

    .line 83
    .line 84
    invoke-virtual {v15}, LE0/m;->n()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v15}, LE0/m;->l()LF0/b;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {v3, v1, v2}, LF0/b;->a(J)Z

    .line 92
    .line 93
    .line 94
    iget-object v3, v0, LE0/e;->h:Lt/I;

    .line 95
    .line 96
    invoke-virtual {v3, v1, v2}, Lt/u;->b(J)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    if-nez v5, :cond_2

    .line 101
    .line 102
    new-instance v5, Lt/L;

    .line 103
    .line 104
    const/4 v10, 0x1

    .line 105
    invoke-direct {v5, v6, v10, v11}, Lt/L;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3, v1, v2, v5}, Lt/I;->o(JLjava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :cond_2
    check-cast v5, Lt/L;

    .line 112
    .line 113
    invoke-virtual {v5, v15}, Lt/L;->k(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-object v3, v15

    .line 117
    :cond_3
    const/4 v13, 0x1

    .line 118
    goto :goto_4

    .line 119
    :cond_4
    move v8, v6

    .line 120
    :cond_5
    new-instance v5, LE0/m;

    .line 121
    .line 122
    invoke-direct {v5, v10}, LE0/m;-><init>(Landroidx/compose/ui/e$c;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v5}, LE0/m;->l()LF0/b;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    invoke-virtual {v10, v1, v2}, LF0/b;->a(J)Z

    .line 130
    .line 131
    .line 132
    iget-object v10, v0, LE0/e;->h:Lt/I;

    .line 133
    .line 134
    invoke-virtual {v10, v1, v2}, Lt/u;->b(J)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v12

    .line 138
    if-nez v12, :cond_6

    .line 139
    .line 140
    new-instance v12, Lt/L;

    .line 141
    .line 142
    const/4 v13, 0x1

    .line 143
    invoke-direct {v12, v6, v13, v11}, Lt/L;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v10, v1, v2, v12}, Lt/I;->o(JLjava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_6
    const/4 v13, 0x1

    .line 151
    :goto_3
    check-cast v12, Lt/L;

    .line 152
    .line 153
    invoke-virtual {v12, v5}, Lt/L;->k(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3}, LE0/n;->g()La0/c;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    invoke-virtual {v3, v5}, La0/c;->c(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-object v3, v5

    .line 164
    :goto_4
    add-int/lit8 v7, v7, 0x1

    .line 165
    .line 166
    goto/16 :goto_0

    .line 167
    .line 168
    :cond_7
    if-eqz p4, :cond_b

    .line 169
    .line 170
    iget-object v1, v0, LE0/e;->h:Lt/I;

    .line 171
    .line 172
    iget-object v2, v1, Lt/u;->b:[J

    .line 173
    .line 174
    iget-object v3, v1, Lt/u;->c:[Ljava/lang/Object;

    .line 175
    .line 176
    iget-object v1, v1, Lt/u;->a:[J

    .line 177
    .line 178
    array-length v4, v1

    .line 179
    add-int/lit8 v4, v4, -0x2

    .line 180
    .line 181
    if-ltz v4, :cond_b

    .line 182
    .line 183
    move v5, v6

    .line 184
    :goto_5
    aget-wide v7, v1, v5

    .line 185
    .line 186
    not-long v9, v7

    .line 187
    const/4 v11, 0x7

    .line 188
    shl-long/2addr v9, v11

    .line 189
    and-long/2addr v9, v7

    .line 190
    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    and-long/2addr v9, v11

    .line 196
    cmp-long v9, v9, v11

    .line 197
    .line 198
    if-eqz v9, :cond_a

    .line 199
    .line 200
    sub-int v9, v5, v4

    .line 201
    .line 202
    not-int v9, v9

    .line 203
    ushr-int/lit8 v9, v9, 0x1f

    .line 204
    .line 205
    const/16 v10, 0x8

    .line 206
    .line 207
    rsub-int/lit8 v9, v9, 0x8

    .line 208
    .line 209
    move v11, v6

    .line 210
    :goto_6
    if-ge v11, v9, :cond_9

    .line 211
    .line 212
    const-wide/16 v12, 0xff

    .line 213
    .line 214
    and-long/2addr v12, v7

    .line 215
    const-wide/16 v14, 0x80

    .line 216
    .line 217
    cmp-long v12, v12, v14

    .line 218
    .line 219
    if-gez v12, :cond_8

    .line 220
    .line 221
    shl-int/lit8 v12, v5, 0x3

    .line 222
    .line 223
    add-int/2addr v12, v11

    .line 224
    aget-wide v13, v2, v12

    .line 225
    .line 226
    aget-object v12, v3, v12

    .line 227
    .line 228
    check-cast v12, Lt/L;

    .line 229
    .line 230
    invoke-direct {v0, v13, v14, v12}, LE0/e;->f(JLt/L;)V

    .line 231
    .line 232
    .line 233
    :cond_8
    shr-long/2addr v7, v10

    .line 234
    add-int/lit8 v11, v11, 0x1

    .line 235
    .line 236
    goto :goto_6

    .line 237
    :cond_9
    if-ne v9, v10, :cond_b

    .line 238
    .line 239
    :cond_a
    if-eq v5, v4, :cond_b

    .line 240
    .line 241
    add-int/lit8 v5, v5, 0x1

    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_b
    return-void
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LE0/e;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, LE0/e;->d:Z

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, LE0/e;->g:LE0/n;

    .line 10
    .line 11
    invoke-virtual {v0}, LE0/n;->c()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final d(LE0/g;Z)Z
    .locals 5

    .line 1
    iget-object v0, p0, LE0/e;->g:LE0/n;

    .line 2
    .line 3
    invoke-virtual {p1}, LE0/g;->b()Lt/x;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, LE0/e;->a:LI0/p;

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2, p1, p2}, LE0/n;->a(Lt/x;LI0/p;LE0/g;Z)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, LE0/e;->b:Z

    .line 19
    .line 20
    iget-object v2, p0, LE0/e;->g:LE0/n;

    .line 21
    .line 22
    invoke-virtual {p1}, LE0/g;->b()Lt/x;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    iget-object v4, p0, LE0/e;->a:LI0/p;

    .line 27
    .line 28
    invoke-virtual {v2, v3, v4, p1, p2}, LE0/n;->f(Lt/x;LI0/p;LE0/g;Z)Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    iget-object v2, p0, LE0/e;->g:LE0/n;

    .line 33
    .line 34
    invoke-virtual {v2, p1}, LE0/n;->e(LE0/g;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-nez p1, :cond_2

    .line 39
    .line 40
    if-eqz p2, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move v0, v1

    .line 44
    :cond_2
    :goto_0
    iput-boolean v1, p0, LE0/e;->b:Z

    .line 45
    .line 46
    iget-boolean p1, p0, LE0/e;->e:Z

    .line 47
    .line 48
    if-eqz p1, :cond_4

    .line 49
    .line 50
    iput-boolean v1, p0, LE0/e;->e:Z

    .line 51
    .line 52
    iget-object p1, p0, LE0/e;->f:Lt/L;

    .line 53
    .line 54
    invoke-virtual {p1}, Lt/V;->d()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    move p2, v1

    .line 59
    :goto_1
    if-ge p2, p1, :cond_3

    .line 60
    .line 61
    iget-object v2, p0, LE0/e;->f:Lt/L;

    .line 62
    .line 63
    invoke-virtual {v2, p2}, Lt/V;->c(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    check-cast v2, Landroidx/compose/ui/e$c;

    .line 68
    .line 69
    invoke-direct {p0, v2}, LE0/e;->g(Landroidx/compose/ui/e$c;)V

    .line 70
    .line 71
    .line 72
    add-int/lit8 p2, p2, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    iget-object p1, p0, LE0/e;->f:Lt/L;

    .line 76
    .line 77
    invoke-virtual {p1}, Lt/L;->n()V

    .line 78
    .line 79
    .line 80
    :cond_4
    iget-boolean p1, p0, LE0/e;->c:Z

    .line 81
    .line 82
    if-eqz p1, :cond_5

    .line 83
    .line 84
    iput-boolean v1, p0, LE0/e;->c:Z

    .line 85
    .line 86
    invoke-virtual {p0}, LE0/e;->e()V

    .line 87
    .line 88
    .line 89
    :cond_5
    iget-boolean p1, p0, LE0/e;->d:Z

    .line 90
    .line 91
    if-eqz p1, :cond_6

    .line 92
    .line 93
    iput-boolean v1, p0, LE0/e;->d:Z

    .line 94
    .line 95
    invoke-virtual {p0}, LE0/e;->c()V

    .line 96
    .line 97
    .line 98
    :cond_6
    return v0
.end method

.method public final e()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LE0/e;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, LE0/e;->c:Z

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, LE0/e;->g:LE0/n;

    .line 10
    .line 11
    invoke-virtual {v0}, LE0/n;->d()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, LE0/e;->c()V

    .line 15
    .line 16
    .line 17
    return-void
.end method
