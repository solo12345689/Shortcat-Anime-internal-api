.class public final Landroidx/fragment/app/f;
.super Landroidx/fragment/app/c0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/fragment/app/f$a;,
        Landroidx/fragment/app/f$b;,
        Landroidx/fragment/app/f$c;,
        Landroidx/fragment/app/f$d;,
        Landroidx/fragment/app/f$e;,
        Landroidx/fragment/app/f$f;,
        Landroidx/fragment/app/f$g;,
        Landroidx/fragment/app/f$h;
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroidx/fragment/app/c0;-><init>(Landroid/view/ViewGroup;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic E(Landroidx/fragment/app/f;Landroidx/fragment/app/c0$d;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/fragment/app/f;->G(Landroidx/fragment/app/f;Landroidx/fragment/app/c0$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final F(Ljava/util/List;)V
    .locals 10

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Landroidx/fragment/app/f$b;

    .line 26
    .line 27
    invoke-virtual {v3}, Landroidx/fragment/app/f$f;->a()Landroidx/fragment/app/c0$d;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3}, Landroidx/fragment/app/c0$d;->f()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-static {v1, v3}, LUd/u;->D(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const/4 v2, 0x0

    .line 48
    move v3, v2

    .line 49
    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    const-string v5, "FragmentManager"

    .line 54
    .line 55
    const/4 v6, 0x2

    .line 56
    if-eqz v4, :cond_6

    .line 57
    .line 58
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    check-cast v4, Landroidx/fragment/app/f$b;

    .line 63
    .line 64
    invoke-virtual {p0}, Landroidx/fragment/app/c0;->t()Landroid/view/ViewGroup;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    invoke-virtual {v4}, Landroidx/fragment/app/f$f;->a()Landroidx/fragment/app/c0$d;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    const-string v9, "context"

    .line 77
    .line 78
    invoke-static {v7, v9}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4, v7}, Landroidx/fragment/app/f$b;->c(Landroid/content/Context;)Landroidx/fragment/app/w$a;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    if-nez v7, :cond_2

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    iget-object v7, v7, Landroidx/fragment/app/w$a;->b:Landroid/animation/AnimatorSet;

    .line 89
    .line 90
    if-nez v7, :cond_3

    .line 91
    .line 92
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    invoke-virtual {v8}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    invoke-virtual {v8}, Landroidx/fragment/app/c0$d;->f()Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 105
    .line 106
    .line 107
    move-result v9

    .line 108
    if-nez v9, :cond_4

    .line 109
    .line 110
    invoke-static {v6}, Landroidx/fragment/app/K;->Q0(I)Z

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    if-eqz v4, :cond_1

    .line 115
    .line 116
    new-instance v4, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    const-string v6, "Ignoring Animator set on "

    .line 122
    .line 123
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    const-string v6, " as this Fragment was involved in a Transition."

    .line 130
    .line 131
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    invoke-static {v5, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_4
    invoke-virtual {v8}, Landroidx/fragment/app/c0$d;->g()Landroidx/fragment/app/c0$d$b;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    sget-object v5, Landroidx/fragment/app/c0$d$b;->d:Landroidx/fragment/app/c0$d$b;

    .line 147
    .line 148
    if-ne v3, v5, :cond_5

    .line 149
    .line 150
    invoke-virtual {v8, v2}, Landroidx/fragment/app/c0$d;->q(Z)V

    .line 151
    .line 152
    .line 153
    :cond_5
    new-instance v3, Landroidx/fragment/app/f$c;

    .line 154
    .line 155
    invoke-direct {v3, v4}, Landroidx/fragment/app/f$c;-><init>(Landroidx/fragment/app/f$b;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v8, v3}, Landroidx/fragment/app/c0$d;->b(Landroidx/fragment/app/c0$b;)V

    .line 159
    .line 160
    .line 161
    const/4 v3, 0x1

    .line 162
    goto :goto_1

    .line 163
    :cond_6
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    :cond_7
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-eqz v0, :cond_a

    .line 172
    .line 173
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    check-cast v0, Landroidx/fragment/app/f$b;

    .line 178
    .line 179
    invoke-virtual {v0}, Landroidx/fragment/app/f$f;->a()Landroidx/fragment/app/c0$d;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-virtual {v2}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    const-string v7, "Ignoring Animation set on "

    .line 188
    .line 189
    if-nez v1, :cond_8

    .line 190
    .line 191
    invoke-static {v6}, Landroidx/fragment/app/K;->Q0(I)Z

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-eqz v0, :cond_7

    .line 196
    .line 197
    new-instance v0, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    const-string v2, " as Animations cannot run alongside Transitions."

    .line 209
    .line 210
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-static {v5, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 218
    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_8
    if-eqz v3, :cond_9

    .line 222
    .line 223
    invoke-static {v6}, Landroidx/fragment/app/K;->Q0(I)Z

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    if-eqz v0, :cond_7

    .line 228
    .line 229
    new-instance v0, Ljava/lang/StringBuilder;

    .line 230
    .line 231
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    const-string v2, " as Animations cannot run alongside Animators."

    .line 241
    .line 242
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-static {v5, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 250
    .line 251
    .line 252
    goto :goto_2

    .line 253
    :cond_9
    new-instance v4, Landroidx/fragment/app/f$a;

    .line 254
    .line 255
    invoke-direct {v4, v0}, Landroidx/fragment/app/f$a;-><init>(Landroidx/fragment/app/f$b;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, v4}, Landroidx/fragment/app/c0$d;->b(Landroidx/fragment/app/c0$b;)V

    .line 259
    .line 260
    .line 261
    goto :goto_2

    .line 262
    :cond_a
    return-void
.end method

.method private static final G(Landroidx/fragment/app/f;Landroidx/fragment/app/c0$d;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$operation"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroidx/fragment/app/c0;->c(Landroidx/fragment/app/c0$d;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private final H(Ljava/util/List;ZLandroidx/fragment/app/c0$d;Landroidx/fragment/app/c0$d;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v3, p3

    .line 4
    .line 5
    move-object/from16 v4, p4

    .line 6
    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    if-eqz v5, :cond_1

    .line 21
    .line 22
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    move-object v6, v5

    .line 27
    check-cast v6, Landroidx/fragment/app/f$h;

    .line 28
    .line 29
    invoke-virtual {v6}, Landroidx/fragment/app/f$f;->b()Z

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-nez v6, :cond_0

    .line 34
    .line 35
    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eqz v5, :cond_3

    .line 53
    .line 54
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    move-object v6, v5

    .line 59
    check-cast v6, Landroidx/fragment/app/f$h;

    .line 60
    .line 61
    invoke-virtual {v6}, Landroidx/fragment/app/f$h;->c()Landroidx/fragment/app/X;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    if-eqz v6, :cond_2

    .line 66
    .line 67
    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    const/4 v6, 0x0

    .line 76
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    if-eqz v7, :cond_6

    .line 81
    .line 82
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    check-cast v7, Landroidx/fragment/app/f$h;

    .line 87
    .line 88
    invoke-virtual {v7}, Landroidx/fragment/app/f$h;->c()Landroidx/fragment/app/X;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    if-eqz v6, :cond_5

    .line 93
    .line 94
    if-ne v8, v6, :cond_4

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    const-string v2, "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "

    .line 103
    .line 104
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v7}, Landroidx/fragment/app/f$f;->a()Landroidx/fragment/app/c0$d;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {v2}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string v2, " returned Transition "

    .line 119
    .line 120
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v7}, Landroidx/fragment/app/f$h;->f()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string v2, " which uses a different Transition type than other Fragments."

    .line 131
    .line 132
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 140
    .line 141
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw v2

    .line 149
    :cond_5
    :goto_3
    move-object v6, v8

    .line 150
    goto :goto_2

    .line 151
    :cond_6
    if-nez v6, :cond_7

    .line 152
    .line 153
    goto/16 :goto_e

    .line 154
    .line 155
    :cond_7
    new-instance v7, Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 158
    .line 159
    .line 160
    new-instance v8, Ljava/util/ArrayList;

    .line 161
    .line 162
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 163
    .line 164
    .line 165
    new-instance v9, Lt/a;

    .line 166
    .line 167
    invoke-direct {v9}, Lt/a;-><init>()V

    .line 168
    .line 169
    .line 170
    new-instance v1, Ljava/util/ArrayList;

    .line 171
    .line 172
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 173
    .line 174
    .line 175
    new-instance v10, Ljava/util/ArrayList;

    .line 176
    .line 177
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 178
    .line 179
    .line 180
    new-instance v12, Lt/a;

    .line 181
    .line 182
    invoke-direct {v12}, Lt/a;-><init>()V

    .line 183
    .line 184
    .line 185
    new-instance v13, Lt/a;

    .line 186
    .line 187
    invoke-direct {v13}, Lt/a;-><init>()V

    .line 188
    .line 189
    .line 190
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 191
    .line 192
    .line 193
    move-result-object v11

    .line 194
    move-object v14, v10

    .line 195
    move-object v10, v1

    .line 196
    move-object v1, v11

    .line 197
    move-object v11, v14

    .line 198
    :goto_4
    const/4 v14, 0x0

    .line 199
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 200
    .line 201
    .line 202
    move-result v15

    .line 203
    if-eqz v15, :cond_10

    .line 204
    .line 205
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v15

    .line 209
    check-cast v15, Landroidx/fragment/app/f$h;

    .line 210
    .line 211
    invoke-virtual {v15}, Landroidx/fragment/app/f$h;->g()Z

    .line 212
    .line 213
    .line 214
    move-result v16

    .line 215
    if-eqz v16, :cond_f

    .line 216
    .line 217
    if-eqz v3, :cond_f

    .line 218
    .line 219
    if-eqz v4, :cond_f

    .line 220
    .line 221
    invoke-virtual {v15}, Landroidx/fragment/app/f$h;->e()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v10

    .line 225
    invoke-virtual {v6, v10}, Landroidx/fragment/app/X;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v10

    .line 229
    invoke-virtual {v6, v10}, Landroidx/fragment/app/X;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v14

    .line 233
    invoke-virtual {v4}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    .line 234
    .line 235
    .line 236
    move-result-object v10

    .line 237
    invoke-virtual {v10}, Landroidx/fragment/app/q;->getSharedElementSourceNames()Ljava/util/ArrayList;

    .line 238
    .line 239
    .line 240
    move-result-object v11

    .line 241
    const-string v10, "lastIn.fragment.sharedElementSourceNames"

    .line 242
    .line 243
    invoke-static {v11, v10}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v3}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    .line 247
    .line 248
    .line 249
    move-result-object v10

    .line 250
    invoke-virtual {v10}, Landroidx/fragment/app/q;->getSharedElementSourceNames()Ljava/util/ArrayList;

    .line 251
    .line 252
    .line 253
    move-result-object v10

    .line 254
    const-string v15, "firstOut.fragment.sharedElementSourceNames"

    .line 255
    .line 256
    invoke-static {v10, v15}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v3}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    .line 260
    .line 261
    .line 262
    move-result-object v15

    .line 263
    invoke-virtual {v15}, Landroidx/fragment/app/q;->getSharedElementTargetNames()Ljava/util/ArrayList;

    .line 264
    .line 265
    .line 266
    move-result-object v15

    .line 267
    const-string v5, "firstOut.fragment.sharedElementTargetNames"

    .line 268
    .line 269
    invoke-static {v15, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 273
    .line 274
    .line 275
    move-result v5

    .line 276
    const/16 v16, 0x0

    .line 277
    .line 278
    move-object/from16 v17, v1

    .line 279
    .line 280
    move/from16 v1, v16

    .line 281
    .line 282
    :goto_6
    if-ge v1, v5, :cond_9

    .line 283
    .line 284
    move-object/from16 v18, v2

    .line 285
    .line 286
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    move/from16 v19, v5

    .line 295
    .line 296
    const/4 v5, -0x1

    .line 297
    if-eq v2, v5, :cond_8

    .line 298
    .line 299
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v5

    .line 303
    invoke-virtual {v11, v2, v5}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    :cond_8
    add-int/lit8 v1, v1, 0x1

    .line 307
    .line 308
    move-object/from16 v2, v18

    .line 309
    .line 310
    move/from16 v5, v19

    .line 311
    .line 312
    goto :goto_6

    .line 313
    :cond_9
    move-object/from16 v18, v2

    .line 314
    .line 315
    invoke-virtual {v4}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    invoke-virtual {v1}, Landroidx/fragment/app/q;->getSharedElementTargetNames()Ljava/util/ArrayList;

    .line 320
    .line 321
    .line 322
    move-result-object v10

    .line 323
    const-string v1, "lastIn.fragment.sharedElementTargetNames"

    .line 324
    .line 325
    invoke-static {v10, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    if-nez p2, :cond_a

    .line 329
    .line 330
    invoke-virtual {v3}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    invoke-virtual {v1}, Landroidx/fragment/app/q;->getExitTransitionCallback()Landroidx/core/app/x;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v4}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    invoke-virtual {v1}, Landroidx/fragment/app/q;->getEnterTransitionCallback()Landroidx/core/app/x;

    .line 342
    .line 343
    .line 344
    const/4 v1, 0x0

    .line 345
    invoke-static {v1, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    goto :goto_7

    .line 350
    :cond_a
    const/4 v1, 0x0

    .line 351
    invoke-virtual {v3}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    invoke-virtual {v2}, Landroidx/fragment/app/q;->getEnterTransitionCallback()Landroidx/core/app/x;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v4}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    invoke-virtual {v2}, Landroidx/fragment/app/q;->getExitTransitionCallback()Landroidx/core/app/x;

    .line 363
    .line 364
    .line 365
    invoke-static {v1, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    :goto_7
    invoke-virtual {v2}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v5

    .line 373
    invoke-static {v5}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v2}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    invoke-static {v2}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 384
    .line 385
    .line 386
    move-result v2

    .line 387
    move/from16 v5, v16

    .line 388
    .line 389
    :goto_8
    if-ge v5, v2, :cond_b

    .line 390
    .line 391
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v15

    .line 395
    const-string v1, "exitingNames[i]"

    .line 396
    .line 397
    invoke-static {v15, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    check-cast v15, Ljava/lang/String;

    .line 401
    .line 402
    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    move/from16 v16, v2

    .line 407
    .line 408
    const-string v2, "enteringNames[i]"

    .line 409
    .line 410
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    check-cast v1, Ljava/lang/String;

    .line 414
    .line 415
    invoke-interface {v9, v15, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    add-int/lit8 v5, v5, 0x1

    .line 419
    .line 420
    move/from16 v2, v16

    .line 421
    .line 422
    const/4 v1, 0x0

    .line 423
    goto :goto_8

    .line 424
    :cond_b
    const/4 v1, 0x2

    .line 425
    invoke-static {v1}, Landroidx/fragment/app/K;->Q0(I)Z

    .line 426
    .line 427
    .line 428
    move-result v1

    .line 429
    const-string v2, "FragmentManager"

    .line 430
    .line 431
    if-eqz v1, :cond_d

    .line 432
    .line 433
    const-string v1, ">>> entering view names <<<"

    .line 434
    .line 435
    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 436
    .line 437
    .line 438
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 443
    .line 444
    .line 445
    move-result v5

    .line 446
    const-string v15, "Name: "

    .line 447
    .line 448
    if-eqz v5, :cond_c

    .line 449
    .line 450
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v5

    .line 454
    check-cast v5, Ljava/lang/String;

    .line 455
    .line 456
    move-object/from16 v16, v1

    .line 457
    .line 458
    new-instance v1, Ljava/lang/StringBuilder;

    .line 459
    .line 460
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v1

    .line 473
    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 474
    .line 475
    .line 476
    move-object/from16 v1, v16

    .line 477
    .line 478
    goto :goto_9

    .line 479
    :cond_c
    const-string v1, ">>> exiting view names <<<"

    .line 480
    .line 481
    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 482
    .line 483
    .line 484
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 489
    .line 490
    .line 491
    move-result v5

    .line 492
    if-eqz v5, :cond_d

    .line 493
    .line 494
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v5

    .line 498
    check-cast v5, Ljava/lang/String;

    .line 499
    .line 500
    move-object/from16 v16, v1

    .line 501
    .line 502
    new-instance v1, Ljava/lang/StringBuilder;

    .line 503
    .line 504
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 505
    .line 506
    .line 507
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 511
    .line 512
    .line 513
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 518
    .line 519
    .line 520
    move-object/from16 v1, v16

    .line 521
    .line 522
    goto :goto_a

    .line 523
    :cond_d
    invoke-virtual {v3}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    .line 524
    .line 525
    .line 526
    move-result-object v1

    .line 527
    iget-object v1, v1, Landroidx/fragment/app/q;->mView:Landroid/view/View;

    .line 528
    .line 529
    const-string v5, "firstOut.fragment.mView"

    .line 530
    .line 531
    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    invoke-direct {v0, v12, v1}, Landroidx/fragment/app/f;->I(Ljava/util/Map;Landroid/view/View;)V

    .line 535
    .line 536
    .line 537
    invoke-virtual {v12, v11}, Lt/a;->o(Ljava/util/Collection;)Z

    .line 538
    .line 539
    .line 540
    invoke-virtual {v12}, Lt/a;->keySet()Ljava/util/Set;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    check-cast v1, Ljava/util/Collection;

    .line 545
    .line 546
    invoke-virtual {v9, v1}, Lt/a;->o(Ljava/util/Collection;)Z

    .line 547
    .line 548
    .line 549
    invoke-virtual {v4}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    .line 550
    .line 551
    .line 552
    move-result-object v1

    .line 553
    iget-object v1, v1, Landroidx/fragment/app/q;->mView:Landroid/view/View;

    .line 554
    .line 555
    const-string v5, "lastIn.fragment.mView"

    .line 556
    .line 557
    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 558
    .line 559
    .line 560
    invoke-direct {v0, v13, v1}, Landroidx/fragment/app/f;->I(Ljava/util/Map;Landroid/view/View;)V

    .line 561
    .line 562
    .line 563
    invoke-virtual {v13, v10}, Lt/a;->o(Ljava/util/Collection;)Z

    .line 564
    .line 565
    .line 566
    invoke-virtual {v9}, Lt/a;->values()Ljava/util/Collection;

    .line 567
    .line 568
    .line 569
    move-result-object v1

    .line 570
    invoke-virtual {v13, v1}, Lt/a;->o(Ljava/util/Collection;)Z

    .line 571
    .line 572
    .line 573
    invoke-static {v9, v13}, Landroidx/fragment/app/V;->c(Lt/a;Lt/a;)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v9}, Lt/a;->keySet()Ljava/util/Set;

    .line 577
    .line 578
    .line 579
    move-result-object v1

    .line 580
    const-string v5, "sharedElementNameMapping.keys"

    .line 581
    .line 582
    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 583
    .line 584
    .line 585
    check-cast v1, Ljava/util/Collection;

    .line 586
    .line 587
    invoke-direct {v0, v12, v1}, Landroidx/fragment/app/f;->J(Lt/a;Ljava/util/Collection;)V

    .line 588
    .line 589
    .line 590
    invoke-virtual {v9}, Lt/a;->values()Ljava/util/Collection;

    .line 591
    .line 592
    .line 593
    move-result-object v1

    .line 594
    const-string v5, "sharedElementNameMapping.values"

    .line 595
    .line 596
    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 597
    .line 598
    .line 599
    invoke-direct {v0, v13, v1}, Landroidx/fragment/app/f;->J(Lt/a;Ljava/util/Collection;)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {v9}, Lt/i0;->isEmpty()Z

    .line 603
    .line 604
    .line 605
    move-result v1

    .line 606
    if-eqz v1, :cond_e

    .line 607
    .line 608
    new-instance v1, Ljava/lang/StringBuilder;

    .line 609
    .line 610
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 611
    .line 612
    .line 613
    const-string v5, "Ignoring shared elements transition "

    .line 614
    .line 615
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 616
    .line 617
    .line 618
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 619
    .line 620
    .line 621
    const-string v5, " between "

    .line 622
    .line 623
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 624
    .line 625
    .line 626
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 627
    .line 628
    .line 629
    const-string v5, " and "

    .line 630
    .line 631
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 632
    .line 633
    .line 634
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 635
    .line 636
    .line 637
    const-string v5, " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element."

    .line 638
    .line 639
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 640
    .line 641
    .line 642
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v1

    .line 646
    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 647
    .line 648
    .line 649
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    .line 650
    .line 651
    .line 652
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 653
    .line 654
    .line 655
    move-object/from16 v1, v17

    .line 656
    .line 657
    move-object/from16 v2, v18

    .line 658
    .line 659
    goto/16 :goto_4

    .line 660
    .line 661
    :cond_e
    :goto_b
    move-object/from16 v1, v17

    .line 662
    .line 663
    move-object/from16 v2, v18

    .line 664
    .line 665
    goto/16 :goto_5

    .line 666
    .line 667
    :cond_f
    move-object/from16 v17, v1

    .line 668
    .line 669
    move-object/from16 v18, v2

    .line 670
    .line 671
    goto :goto_b

    .line 672
    :cond_10
    move-object/from16 v18, v2

    .line 673
    .line 674
    if-nez v14, :cond_13

    .line 675
    .line 676
    invoke-interface/range {v18 .. v18}, Ljava/util/Collection;->isEmpty()Z

    .line 677
    .line 678
    .line 679
    move-result v1

    .line 680
    if-eqz v1, :cond_11

    .line 681
    .line 682
    return-void

    .line 683
    :cond_11
    invoke-interface/range {v18 .. v18}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 684
    .line 685
    .line 686
    move-result-object v1

    .line 687
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 688
    .line 689
    .line 690
    move-result v2

    .line 691
    if-eqz v2, :cond_12

    .line 692
    .line 693
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    move-result-object v2

    .line 697
    check-cast v2, Landroidx/fragment/app/f$h;

    .line 698
    .line 699
    invoke-virtual {v2}, Landroidx/fragment/app/f$h;->f()Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    move-result-object v2

    .line 703
    if-nez v2, :cond_13

    .line 704
    .line 705
    goto :goto_c

    .line 706
    :cond_12
    return-void

    .line 707
    :cond_13
    new-instance v1, Landroidx/fragment/app/f$g;

    .line 708
    .line 709
    move-object v5, v6

    .line 710
    move-object v6, v14

    .line 711
    move-object/from16 v2, v18

    .line 712
    .line 713
    move/from16 v14, p2

    .line 714
    .line 715
    invoke-direct/range {v1 .. v14}, Landroidx/fragment/app/f$g;-><init>(Ljava/util/List;Landroidx/fragment/app/c0$d;Landroidx/fragment/app/c0$d;Landroidx/fragment/app/X;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;Lt/a;Ljava/util/ArrayList;Ljava/util/ArrayList;Lt/a;Lt/a;Z)V

    .line 716
    .line 717
    .line 718
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 719
    .line 720
    .line 721
    move-result-object v2

    .line 722
    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 723
    .line 724
    .line 725
    move-result v3

    .line 726
    if-eqz v3, :cond_14

    .line 727
    .line 728
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    move-result-object v3

    .line 732
    check-cast v3, Landroidx/fragment/app/f$h;

    .line 733
    .line 734
    invoke-virtual {v3}, Landroidx/fragment/app/f$f;->a()Landroidx/fragment/app/c0$d;

    .line 735
    .line 736
    .line 737
    move-result-object v3

    .line 738
    invoke-virtual {v3, v1}, Landroidx/fragment/app/c0$d;->b(Landroidx/fragment/app/c0$b;)V

    .line 739
    .line 740
    .line 741
    goto :goto_d

    .line 742
    :cond_14
    :goto_e
    return-void
.end method

.method private final I(Ljava/util/Map;Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-static {p2}, Landroidx/core/view/a0;->H(Landroid/view/View;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    :cond_0
    instance-of v0, p2, Landroid/view/ViewGroup;

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    check-cast p2, Landroid/view/ViewGroup;

    .line 15
    .line 16
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    :goto_0
    if-ge v1, v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-nez v3, :cond_1

    .line 32
    .line 33
    const-string v3, "child"

    .line 34
    .line 35
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, p1, v2}, Landroidx/fragment/app/f;->I(Ljava/util/Map;Landroid/view/View;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    return-void
.end method

.method private final J(Lt/a;Ljava/util/Collection;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lt/a;->entrySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "entries"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Iterable;

    .line 11
    .line 12
    new-instance v0, Landroidx/fragment/app/f$i;

    .line 13
    .line 14
    invoke-direct {v0, p2}, Landroidx/fragment/app/f$i;-><init>(Ljava/util/Collection;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v0}, LUd/u;->O(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Z

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private final K(Ljava/util/List;)V
    .locals 4

    .line 1
    invoke-static {p1}, LUd/u;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroidx/fragment/app/c0$d;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Landroidx/fragment/app/c0$d;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iget-object v2, v2, Landroidx/fragment/app/q;->mAnimationInfo:Landroidx/fragment/app/q$k;

    .line 32
    .line 33
    iget-object v3, v0, Landroidx/fragment/app/q;->mAnimationInfo:Landroidx/fragment/app/q$k;

    .line 34
    .line 35
    iget v3, v3, Landroidx/fragment/app/q$k;->c:I

    .line 36
    .line 37
    iput v3, v2, Landroidx/fragment/app/q$k;->c:I

    .line 38
    .line 39
    invoke-virtual {v1}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iget-object v2, v2, Landroidx/fragment/app/q;->mAnimationInfo:Landroidx/fragment/app/q$k;

    .line 44
    .line 45
    iget-object v3, v0, Landroidx/fragment/app/q;->mAnimationInfo:Landroidx/fragment/app/q$k;

    .line 46
    .line 47
    iget v3, v3, Landroidx/fragment/app/q$k;->d:I

    .line 48
    .line 49
    iput v3, v2, Landroidx/fragment/app/q$k;->d:I

    .line 50
    .line 51
    invoke-virtual {v1}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    iget-object v2, v2, Landroidx/fragment/app/q;->mAnimationInfo:Landroidx/fragment/app/q$k;

    .line 56
    .line 57
    iget-object v3, v0, Landroidx/fragment/app/q;->mAnimationInfo:Landroidx/fragment/app/q$k;

    .line 58
    .line 59
    iget v3, v3, Landroidx/fragment/app/q$k;->e:I

    .line 60
    .line 61
    iput v3, v2, Landroidx/fragment/app/q$k;->e:I

    .line 62
    .line 63
    invoke-virtual {v1}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget-object v1, v1, Landroidx/fragment/app/q;->mAnimationInfo:Landroidx/fragment/app/q$k;

    .line 68
    .line 69
    iget-object v2, v0, Landroidx/fragment/app/q;->mAnimationInfo:Landroidx/fragment/app/q$k;

    .line 70
    .line 71
    iget v2, v2, Landroidx/fragment/app/q$k;->f:I

    .line 72
    .line 73
    iput v2, v1, Landroidx/fragment/app/q$k;->f:I

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    return-void
.end method


# virtual methods
.method public d(Ljava/util/List;Z)V
    .locals 10

    .line 1
    const-string v0, "operations"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    invoke-static {v0}, Landroidx/fragment/app/K;->Q0(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const-string v2, "FragmentManager"

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const-string v1, "Collecting Effects"

    .line 16
    .line 17
    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    const/4 v4, 0x0

    .line 29
    const-string v5, "operation.fragment.mView"

    .line 30
    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    move-object v6, v3

    .line 38
    check-cast v6, Landroidx/fragment/app/c0$d;

    .line 39
    .line 40
    sget-object v7, Landroidx/fragment/app/c0$d$b;->a:Landroidx/fragment/app/c0$d$b$a;

    .line 41
    .line 42
    invoke-virtual {v6}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    iget-object v8, v8, Landroidx/fragment/app/q;->mView:Landroid/view/View;

    .line 47
    .line 48
    invoke-static {v8, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v7, v8}, Landroidx/fragment/app/c0$d$b$a;->a(Landroid/view/View;)Landroidx/fragment/app/c0$d$b;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    sget-object v8, Landroidx/fragment/app/c0$d$b;->c:Landroidx/fragment/app/c0$d$b;

    .line 56
    .line 57
    if-ne v7, v8, :cond_1

    .line 58
    .line 59
    invoke-virtual {v6}, Landroidx/fragment/app/c0$d;->g()Landroidx/fragment/app/c0$d$b;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    if-eq v6, v8, :cond_1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    move-object v3, v4

    .line 67
    :goto_0
    check-cast v3, Landroidx/fragment/app/c0$d;

    .line 68
    .line 69
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    invoke-interface {p1, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    :cond_3
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-eqz v6, :cond_4

    .line 82
    .line 83
    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    move-object v7, v6

    .line 88
    check-cast v7, Landroidx/fragment/app/c0$d;

    .line 89
    .line 90
    sget-object v8, Landroidx/fragment/app/c0$d$b;->a:Landroidx/fragment/app/c0$d$b$a;

    .line 91
    .line 92
    invoke-virtual {v7}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    iget-object v9, v9, Landroidx/fragment/app/q;->mView:Landroid/view/View;

    .line 97
    .line 98
    invoke-static {v9, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v8, v9}, Landroidx/fragment/app/c0$d$b$a;->a(Landroid/view/View;)Landroidx/fragment/app/c0$d$b;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    sget-object v9, Landroidx/fragment/app/c0$d$b;->c:Landroidx/fragment/app/c0$d$b;

    .line 106
    .line 107
    if-eq v8, v9, :cond_3

    .line 108
    .line 109
    invoke-virtual {v7}, Landroidx/fragment/app/c0$d;->g()Landroidx/fragment/app/c0$d$b;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    if-ne v7, v9, :cond_3

    .line 114
    .line 115
    move-object v4, v6

    .line 116
    :cond_4
    check-cast v4, Landroidx/fragment/app/c0$d;

    .line 117
    .line 118
    invoke-static {v0}, Landroidx/fragment/app/K;->Q0(I)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_5

    .line 123
    .line 124
    new-instance v0, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 127
    .line 128
    .line 129
    const-string v1, "Executing operations from "

    .line 130
    .line 131
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string v1, " to "

    .line 138
    .line 139
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 155
    .line 156
    .line 157
    new-instance v1, Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 160
    .line 161
    .line 162
    invoke-direct {p0, p1}, Landroidx/fragment/app/f;->K(Ljava/util/List;)V

    .line 163
    .line 164
    .line 165
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    if-eqz v2, :cond_8

    .line 174
    .line 175
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    check-cast v2, Landroidx/fragment/app/c0$d;

    .line 180
    .line 181
    new-instance v5, Landroidx/fragment/app/f$b;

    .line 182
    .line 183
    invoke-direct {v5, v2, p2}, Landroidx/fragment/app/f$b;-><init>(Landroidx/fragment/app/c0$d;Z)V

    .line 184
    .line 185
    .line 186
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    new-instance v5, Landroidx/fragment/app/f$h;

    .line 190
    .line 191
    const/4 v6, 0x0

    .line 192
    const/4 v7, 0x1

    .line 193
    if-eqz p2, :cond_6

    .line 194
    .line 195
    if-ne v2, v3, :cond_7

    .line 196
    .line 197
    :goto_2
    move v6, v7

    .line 198
    goto :goto_3

    .line 199
    :cond_6
    if-ne v2, v4, :cond_7

    .line 200
    .line 201
    goto :goto_2

    .line 202
    :cond_7
    :goto_3
    invoke-direct {v5, v2, p2, v6}, Landroidx/fragment/app/f$h;-><init>(Landroidx/fragment/app/c0$d;ZZ)V

    .line 203
    .line 204
    .line 205
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    new-instance v5, Landroidx/fragment/app/d;

    .line 209
    .line 210
    invoke-direct {v5, p0, v2}, Landroidx/fragment/app/d;-><init>(Landroidx/fragment/app/f;Landroidx/fragment/app/c0$d;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2, v5}, Landroidx/fragment/app/c0$d;->a(Ljava/lang/Runnable;)V

    .line 214
    .line 215
    .line 216
    goto :goto_1

    .line 217
    :cond_8
    invoke-direct {p0, v1, p2, v3, v4}, Landroidx/fragment/app/f;->H(Ljava/util/List;ZLandroidx/fragment/app/c0$d;Landroidx/fragment/app/c0$d;)V

    .line 218
    .line 219
    .line 220
    invoke-direct {p0, v0}, Landroidx/fragment/app/f;->F(Ljava/util/List;)V

    .line 221
    .line 222
    .line 223
    return-void
.end method
