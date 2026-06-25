.class public abstract Landroidx/compose/ui/focus/r;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/focus/r$a;
    }
.end annotation


# direct methods
.method public static final a(Landroidx/compose/ui/focus/FocusTargetNode;ILi1/t;)Landroidx/compose/ui/focus/k;
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->J1()Landroidx/compose/ui/focus/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroidx/compose/ui/focus/d$a;->e()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-static {p1, v2}, Landroidx/compose/ui/focus/d;->l(II)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Landroidx/compose/ui/focus/i;->l()Landroidx/compose/ui/focus/k;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    invoke-virtual {v1}, Landroidx/compose/ui/focus/d$a;->f()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-static {p1, v2}, Landroidx/compose/ui/focus/d;->l(II)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-interface {v0}, Landroidx/compose/ui/focus/i;->j()Landroidx/compose/ui/focus/k;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_1
    invoke-virtual {v1}, Landroidx/compose/ui/focus/d$a;->h()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-static {p1, v2}, Landroidx/compose/ui/focus/d;->l(II)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    invoke-interface {v0}, Landroidx/compose/ui/focus/i;->d()Landroidx/compose/ui/focus/k;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :cond_2
    invoke-virtual {v1}, Landroidx/compose/ui/focus/d$a;->a()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    invoke-static {p1, v2}, Landroidx/compose/ui/focus/d;->l(II)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_3

    .line 61
    .line 62
    invoke-interface {v0}, Landroidx/compose/ui/focus/i;->f()Landroidx/compose/ui/focus/k;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :cond_3
    invoke-virtual {v1}, Landroidx/compose/ui/focus/d$a;->d()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    invoke-static {p1, v2}, Landroidx/compose/ui/focus/d;->l(II)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    const/4 v3, 0x2

    .line 76
    const/4 v4, 0x1

    .line 77
    const/4 v5, 0x0

    .line 78
    if-eqz v2, :cond_8

    .line 79
    .line 80
    sget-object p0, Landroidx/compose/ui/focus/r$a;->a:[I

    .line 81
    .line 82
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    aget p0, p0, p1

    .line 87
    .line 88
    if-eq p0, v4, :cond_5

    .line 89
    .line 90
    if-ne p0, v3, :cond_4

    .line 91
    .line 92
    invoke-interface {v0}, Landroidx/compose/ui/focus/i;->e()Landroidx/compose/ui/focus/k;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    goto :goto_0

    .line 97
    :cond_4
    new-instance p0, LTd/r;

    .line 98
    .line 99
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 100
    .line 101
    .line 102
    throw p0

    .line 103
    :cond_5
    invoke-interface {v0}, Landroidx/compose/ui/focus/i;->b()Landroidx/compose/ui/focus/k;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    :goto_0
    sget-object p1, Landroidx/compose/ui/focus/k;->b:Landroidx/compose/ui/focus/k$a;

    .line 108
    .line 109
    invoke-virtual {p1}, Landroidx/compose/ui/focus/k$a;->b()Landroidx/compose/ui/focus/k;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    if-ne p0, p1, :cond_6

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_6
    move-object v5, p0

    .line 117
    :goto_1
    if-nez v5, :cond_7

    .line 118
    .line 119
    invoke-interface {v0}, Landroidx/compose/ui/focus/i;->a()Landroidx/compose/ui/focus/k;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    return-object p0

    .line 124
    :cond_7
    return-object v5

    .line 125
    :cond_8
    invoke-virtual {v1}, Landroidx/compose/ui/focus/d$a;->g()I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    invoke-static {p1, v2}, Landroidx/compose/ui/focus/d;->l(II)Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-eqz v2, :cond_d

    .line 134
    .line 135
    sget-object p0, Landroidx/compose/ui/focus/r$a;->a:[I

    .line 136
    .line 137
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    aget p0, p0, p1

    .line 142
    .line 143
    if-eq p0, v4, :cond_a

    .line 144
    .line 145
    if-ne p0, v3, :cond_9

    .line 146
    .line 147
    invoke-interface {v0}, Landroidx/compose/ui/focus/i;->b()Landroidx/compose/ui/focus/k;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    goto :goto_2

    .line 152
    :cond_9
    new-instance p0, LTd/r;

    .line 153
    .line 154
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 155
    .line 156
    .line 157
    throw p0

    .line 158
    :cond_a
    invoke-interface {v0}, Landroidx/compose/ui/focus/i;->e()Landroidx/compose/ui/focus/k;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    :goto_2
    sget-object p1, Landroidx/compose/ui/focus/k;->b:Landroidx/compose/ui/focus/k$a;

    .line 163
    .line 164
    invoke-virtual {p1}, Landroidx/compose/ui/focus/k$a;->b()Landroidx/compose/ui/focus/k;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    if-ne p0, p1, :cond_b

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_b
    move-object v5, p0

    .line 172
    :goto_3
    if-nez v5, :cond_c

    .line 173
    .line 174
    invoke-interface {v0}, Landroidx/compose/ui/focus/i;->c()Landroidx/compose/ui/focus/k;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    return-object p0

    .line 179
    :cond_c
    return-object v5

    .line 180
    :cond_d
    invoke-virtual {v1}, Landroidx/compose/ui/focus/d$a;->b()I

    .line 181
    .line 182
    .line 183
    move-result p2

    .line 184
    invoke-static {p1, p2}, Landroidx/compose/ui/focus/d;->l(II)Z

    .line 185
    .line 186
    .line 187
    move-result p2

    .line 188
    if-nez p2, :cond_f

    .line 189
    .line 190
    invoke-virtual {v1}, Landroidx/compose/ui/focus/d$a;->c()I

    .line 191
    .line 192
    .line 193
    move-result p2

    .line 194
    invoke-static {p1, p2}, Landroidx/compose/ui/focus/d;->l(II)Z

    .line 195
    .line 196
    .line 197
    move-result p2

    .line 198
    if-eqz p2, :cond_e

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 202
    .line 203
    const-string p1, "invalid FocusDirection"

    .line 204
    .line 205
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw p0

    .line 209
    :cond_f
    :goto_4
    new-instance p2, Lq0/a;

    .line 210
    .line 211
    invoke-direct {p2, p1, v5}, Lq0/a;-><init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 212
    .line 213
    .line 214
    invoke-static {p0}, LK0/k;->o(LK0/j;)LK0/p0;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    invoke-interface {p0}, LK0/p0;->getFocusOwner()Lq0/j;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    invoke-interface {p0}, Lq0/j;->j()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-virtual {v1}, Landroidx/compose/ui/focus/d$a;->b()I

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    invoke-static {p1, v1}, Landroidx/compose/ui/focus/d;->l(II)Z

    .line 231
    .line 232
    .line 233
    move-result p1

    .line 234
    if-eqz p1, :cond_10

    .line 235
    .line 236
    invoke-interface {v0}, Landroidx/compose/ui/focus/i;->k()Lkotlin/jvm/functions/Function1;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_10
    invoke-interface {v0}, Landroidx/compose/ui/focus/i;->m()Lkotlin/jvm/functions/Function1;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    :goto_5
    invoke-virtual {p2}, Lq0/a;->c()Z

    .line 252
    .line 253
    .line 254
    move-result p1

    .line 255
    if-eqz p1, :cond_11

    .line 256
    .line 257
    sget-object p0, Landroidx/compose/ui/focus/k;->b:Landroidx/compose/ui/focus/k$a;

    .line 258
    .line 259
    invoke-virtual {p0}, Landroidx/compose/ui/focus/k$a;->a()Landroidx/compose/ui/focus/k;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    return-object p0

    .line 264
    :cond_11
    invoke-interface {p0}, Lq0/j;->j()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    if-eq v2, p0, :cond_12

    .line 269
    .line 270
    sget-object p0, Landroidx/compose/ui/focus/k;->b:Landroidx/compose/ui/focus/k$a;

    .line 271
    .line 272
    invoke-virtual {p0}, Landroidx/compose/ui/focus/k$a;->c()Landroidx/compose/ui/focus/k;

    .line 273
    .line 274
    .line 275
    move-result-object p0

    .line 276
    return-object p0

    .line 277
    :cond_12
    sget-object p0, Landroidx/compose/ui/focus/k;->b:Landroidx/compose/ui/focus/k$a;

    .line 278
    .line 279
    invoke-virtual {p0}, Landroidx/compose/ui/focus/k$a;->b()Landroidx/compose/ui/focus/k;

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;
    .locals 1

    .line 1
    invoke-static {p0}, LK0/k;->o(LK0/j;)LK0/p0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, LK0/p0;->getFocusOwner()Lq0/j;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0}, Lq0/j;->j()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method private static final c(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;
    .locals 10

    .line 1
    const/16 v0, 0x400

    .line 2
    .line 3
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    const-string v1, "visitAncestors called on an unattached node"

    .line 18
    .line 19
    invoke-static {v1}, LH0/a;->b(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {p0}, LK0/k;->n(LK0/j;)LK0/J;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    :goto_0
    const/4 v2, 0x0

    .line 35
    if-eqz p0, :cond_b

    .line 36
    .line 37
    invoke-virtual {p0}, LK0/J;->t0()LK0/c0;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    and-int/2addr v3, v0

    .line 50
    if-eqz v3, :cond_9

    .line 51
    .line 52
    :goto_1
    if-eqz v1, :cond_9

    .line 53
    .line 54
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    and-int/2addr v3, v0

    .line 59
    if-eqz v3, :cond_8

    .line 60
    .line 61
    move-object v3, v1

    .line 62
    move-object v4, v2

    .line 63
    :goto_2
    if-eqz v3, :cond_8

    .line 64
    .line 65
    instance-of v5, v3, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 66
    .line 67
    if-eqz v5, :cond_1

    .line 68
    .line 69
    check-cast v3, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 70
    .line 71
    invoke-virtual {v3}, Landroidx/compose/ui/focus/FocusTargetNode;->J1()Landroidx/compose/ui/focus/i;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-interface {v5}, Landroidx/compose/ui/focus/i;->i()Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-eqz v5, :cond_7

    .line 80
    .line 81
    return-object v3

    .line 82
    :cond_1
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    and-int/2addr v5, v0

    .line 87
    if-eqz v5, :cond_7

    .line 88
    .line 89
    instance-of v5, v3, LK0/m;

    .line 90
    .line 91
    if-eqz v5, :cond_7

    .line 92
    .line 93
    move-object v5, v3

    .line 94
    check-cast v5, LK0/m;

    .line 95
    .line 96
    invoke-virtual {v5}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    const/4 v6, 0x0

    .line 101
    move v7, v6

    .line 102
    :goto_3
    const/4 v8, 0x1

    .line 103
    if-eqz v5, :cond_6

    .line 104
    .line 105
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 106
    .line 107
    .line 108
    move-result v9

    .line 109
    and-int/2addr v9, v0

    .line 110
    if-eqz v9, :cond_5

    .line 111
    .line 112
    add-int/lit8 v7, v7, 0x1

    .line 113
    .line 114
    if-ne v7, v8, :cond_2

    .line 115
    .line 116
    move-object v3, v5

    .line 117
    goto :goto_4

    .line 118
    :cond_2
    if-nez v4, :cond_3

    .line 119
    .line 120
    new-instance v4, La0/c;

    .line 121
    .line 122
    const/16 v8, 0x10

    .line 123
    .line 124
    new-array v8, v8, [Landroidx/compose/ui/e$c;

    .line 125
    .line 126
    invoke-direct {v4, v8, v6}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 127
    .line 128
    .line 129
    :cond_3
    if-eqz v3, :cond_4

    .line 130
    .line 131
    invoke-virtual {v4, v3}, La0/c;->c(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-object v3, v2

    .line 135
    :cond_4
    invoke-virtual {v4, v5}, La0/c;->c(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    :cond_5
    :goto_4
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    goto :goto_3

    .line 143
    :cond_6
    if-ne v7, v8, :cond_7

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_7
    invoke-static {v4}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    goto :goto_2

    .line 151
    :cond_8
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    goto :goto_1

    .line 156
    :cond_9
    invoke-virtual {p0}, LK0/J;->A0()LK0/J;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    if-eqz p0, :cond_a

    .line 161
    .line 162
    invoke-virtual {p0}, LK0/J;->t0()LK0/c0;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    if-eqz v1, :cond_a

    .line 167
    .line 168
    invoke-virtual {v1}, LK0/c0;->p()Landroidx/compose/ui/e$c;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    goto/16 :goto_0

    .line 173
    .line 174
    :cond_a
    move-object v1, v2

    .line 175
    goto/16 :goto_0

    .line 176
    .line 177
    :cond_b
    return-object v2
.end method

.method public static final d(Landroidx/compose/ui/focus/FocusTargetNode;)Lr0/h;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getCoordinator$ui_release()LK0/e0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    invoke-static {p0}, LI0/q;->d(LI0/p;)LI0/p;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-interface {v0, p0, v1}, LI0/p;->w0(LI0/p;Z)Lr0/h;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-object p0

    .line 20
    :cond_1
    :goto_0
    sget-object p0, Lr0/h;->e:Lr0/h$a;

    .line 21
    .line 22
    invoke-virtual {p0}, Lr0/h$a;->a()Lr0/h;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/focus/FocusTargetNode;ILi1/t;Lr0/h;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;
    .locals 3

    .line 1
    sget-object v0, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/focus/d$a;->e()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {p1, v1}, Landroidx/compose/ui/focus/d;->l(II)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_b

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/ui/focus/d$a;->f()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {p1, v1}, Landroidx/compose/ui/focus/d;->l(II)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto/16 :goto_4

    .line 24
    .line 25
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/focus/d$a;->d()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-static {p1, v1}, Landroidx/compose/ui/focus/d;->l(II)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_a

    .line 34
    .line 35
    invoke-virtual {v0}, Landroidx/compose/ui/focus/d$a;->g()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-static {p1, v1}, Landroidx/compose/ui/focus/d;->l(II)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_a

    .line 44
    .line 45
    invoke-virtual {v0}, Landroidx/compose/ui/focus/d$a;->h()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-static {p1, v1}, Landroidx/compose/ui/focus/d;->l(II)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-nez v1, :cond_a

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/focus/d$a;->a()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    invoke-static {p1, v1}, Landroidx/compose/ui/focus/d;->l(II)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_1

    .line 64
    .line 65
    goto/16 :goto_3

    .line 66
    .line 67
    :cond_1
    invoke-virtual {v0}, Landroidx/compose/ui/focus/d$a;->b()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    invoke-static {p1, v1}, Landroidx/compose/ui/focus/d;->l(II)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    const/4 v2, 0x0

    .line 76
    if-eqz v1, :cond_5

    .line 77
    .line 78
    sget-object p1, Landroidx/compose/ui/focus/r$a;->a:[I

    .line 79
    .line 80
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    aget p1, p1, p2

    .line 85
    .line 86
    const/4 p2, 0x1

    .line 87
    if-eq p1, p2, :cond_3

    .line 88
    .line 89
    const/4 p2, 0x2

    .line 90
    if-ne p1, p2, :cond_2

    .line 91
    .line 92
    invoke-virtual {v0}, Landroidx/compose/ui/focus/d$a;->d()I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    goto :goto_0

    .line 97
    :cond_2
    new-instance p0, LTd/r;

    .line 98
    .line 99
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 100
    .line 101
    .line 102
    throw p0

    .line 103
    :cond_3
    invoke-virtual {v0}, Landroidx/compose/ui/focus/d$a;->g()I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    :goto_0
    invoke-static {p0}, Landroidx/compose/ui/focus/r;->b(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    if-eqz p0, :cond_4

    .line 112
    .line 113
    invoke-static {p0, p1, p3, p4}, Landroidx/compose/ui/focus/w;->t(Landroidx/compose/ui/focus/FocusTargetNode;ILr0/h;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0

    .line 118
    :cond_4
    return-object v2

    .line 119
    :cond_5
    invoke-virtual {v0}, Landroidx/compose/ui/focus/d$a;->c()I

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    invoke-static {p1, p2}, Landroidx/compose/ui/focus/d;->l(II)Z

    .line 124
    .line 125
    .line 126
    move-result p2

    .line 127
    if-eqz p2, :cond_9

    .line 128
    .line 129
    invoke-static {p0}, Landroidx/compose/ui/focus/r;->b(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    if-eqz p1, :cond_6

    .line 134
    .line 135
    invoke-static {p1}, Landroidx/compose/ui/focus/r;->c(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    :cond_6
    if-eqz v2, :cond_8

    .line 140
    .line 141
    invoke-static {v2, p0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result p0

    .line 145
    if-eqz p0, :cond_7

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_7
    invoke-interface {p4, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    check-cast p0, Ljava/lang/Boolean;

    .line 153
    .line 154
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    goto :goto_2

    .line 159
    :cond_8
    :goto_1
    const/4 p0, 0x0

    .line 160
    :goto_2
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    return-object p0

    .line 165
    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 166
    .line 167
    new-instance p2, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 170
    .line 171
    .line 172
    const-string p3, "Focus search invoked with invalid FocusDirection "

    .line 173
    .line 174
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-static {p1}, Landroidx/compose/ui/focus/d;->n(I)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    throw p0

    .line 196
    :cond_a
    :goto_3
    invoke-static {p0, p1, p3, p4}, Landroidx/compose/ui/focus/w;->t(Landroidx/compose/ui/focus/FocusTargetNode;ILr0/h;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    return-object p0

    .line 201
    :cond_b
    :goto_4
    invoke-static {p0, p1, p4}, Landroidx/compose/ui/focus/v;->f(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z

    .line 202
    .line 203
    .line 204
    move-result p0

    .line 205
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getNode()Landroidx/compose/ui/e$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_0
    const/16 v0, 0x400

    .line 14
    .line 15
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    const-string v2, "visitChildren called on an unattached node"

    .line 30
    .line 31
    invoke-static {v2}, LH0/a;->b(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    new-instance v2, La0/c;

    .line 35
    .line 36
    const/16 v3, 0x10

    .line 37
    .line 38
    new-array v4, v3, [Landroidx/compose/ui/e$c;

    .line 39
    .line 40
    const/4 v5, 0x0

    .line 41
    invoke-direct {v2, v4, v5}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    if-nez v4, :cond_2

    .line 53
    .line 54
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {v2, p0, v5}, LK0/k;->a(La0/c;Landroidx/compose/ui/e$c;Z)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    invoke-virtual {v2, v4}, La0/c;->c(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    :cond_3
    :goto_0
    invoke-virtual {v2}, La0/c;->p()I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-eqz p0, :cond_f

    .line 70
    .line 71
    invoke-virtual {v2}, La0/c;->p()I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    const/4 v4, 0x1

    .line 76
    sub-int/2addr p0, v4

    .line 77
    invoke-virtual {v2, p0}, La0/c;->y(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    check-cast p0, Landroidx/compose/ui/e$c;

    .line 82
    .line 83
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    and-int/2addr v6, v0

    .line 88
    if-nez v6, :cond_4

    .line 89
    .line 90
    invoke-static {v2, p0, v5}, LK0/k;->a(La0/c;Landroidx/compose/ui/e$c;Z)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_4
    :goto_1
    if-eqz p0, :cond_3

    .line 95
    .line 96
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    and-int/2addr v6, v0

    .line 101
    if-eqz v6, :cond_e

    .line 102
    .line 103
    move-object v6, v1

    .line 104
    :goto_2
    if-eqz p0, :cond_3

    .line 105
    .line 106
    instance-of v7, p0, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 107
    .line 108
    if-eqz v7, :cond_7

    .line 109
    .line 110
    check-cast p0, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 111
    .line 112
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getNode()Landroidx/compose/ui/e$c;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-eqz v7, :cond_d

    .line 121
    .line 122
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->L1()Lq0/o;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    sget-object v8, Landroidx/compose/ui/focus/r$a;->b:[I

    .line 127
    .line 128
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    aget v7, v8, v7

    .line 133
    .line 134
    if-eq v7, v4, :cond_6

    .line 135
    .line 136
    const/4 v8, 0x2

    .line 137
    if-eq v7, v8, :cond_6

    .line 138
    .line 139
    const/4 v8, 0x3

    .line 140
    if-eq v7, v8, :cond_6

    .line 141
    .line 142
    const/4 p0, 0x4

    .line 143
    if-ne v7, p0, :cond_5

    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_5
    new-instance p0, LTd/r;

    .line 147
    .line 148
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 149
    .line 150
    .line 151
    throw p0

    .line 152
    :cond_6
    return-object p0

    .line 153
    :cond_7
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 154
    .line 155
    .line 156
    move-result v7

    .line 157
    and-int/2addr v7, v0

    .line 158
    if-eqz v7, :cond_d

    .line 159
    .line 160
    instance-of v7, p0, LK0/m;

    .line 161
    .line 162
    if-eqz v7, :cond_d

    .line 163
    .line 164
    move-object v7, p0

    .line 165
    check-cast v7, LK0/m;

    .line 166
    .line 167
    invoke-virtual {v7}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    move v8, v5

    .line 172
    :goto_3
    if-eqz v7, :cond_c

    .line 173
    .line 174
    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 175
    .line 176
    .line 177
    move-result v9

    .line 178
    and-int/2addr v9, v0

    .line 179
    if-eqz v9, :cond_b

    .line 180
    .line 181
    add-int/lit8 v8, v8, 0x1

    .line 182
    .line 183
    if-ne v8, v4, :cond_8

    .line 184
    .line 185
    move-object p0, v7

    .line 186
    goto :goto_4

    .line 187
    :cond_8
    if-nez v6, :cond_9

    .line 188
    .line 189
    new-instance v6, La0/c;

    .line 190
    .line 191
    new-array v9, v3, [Landroidx/compose/ui/e$c;

    .line 192
    .line 193
    invoke-direct {v6, v9, v5}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 194
    .line 195
    .line 196
    :cond_9
    if-eqz p0, :cond_a

    .line 197
    .line 198
    invoke-virtual {v6, p0}, La0/c;->c(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-object p0, v1

    .line 202
    :cond_a
    invoke-virtual {v6, v7}, La0/c;->c(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    :cond_b
    :goto_4
    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 206
    .line 207
    .line 208
    move-result-object v7

    .line 209
    goto :goto_3

    .line 210
    :cond_c
    if-ne v8, v4, :cond_d

    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_d
    :goto_5
    invoke-static {v6}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    goto :goto_2

    .line 218
    :cond_e
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    goto/16 :goto_1

    .line 223
    .line 224
    :cond_f
    return-object v1
.end method

.method public static final g(Landroidx/compose/ui/focus/FocusTargetNode;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getCoordinator$ui_release()LK0/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, LK0/e0;->L1()LK0/J;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, LK0/J;->p()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x1

    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getCoordinator$ui_release()LK0/e0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, LK0/J;->b()Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-ne p0, v1, :cond_0

    .line 37
    .line 38
    return v1

    .line 39
    :cond_0
    const/4 p0, 0x0

    .line 40
    return p0
.end method
