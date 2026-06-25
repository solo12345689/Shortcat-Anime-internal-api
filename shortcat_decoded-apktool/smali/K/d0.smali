.class final LK/d0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LI0/B;


# instance fields
.field private final a:Lie/a;

.field private final b:Lie/a;


# direct methods
.method public constructor <init>(Lie/a;Lie/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LK/d0;->a:Lie/a;

    .line 5
    .line 6
    iput-object p2, p0, LK/d0;->b:Lie/a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public measure-3p2s80s(Landroidx/compose/ui/layout/l;Ljava/util/List;J)LI0/C;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    new-instance v2, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/4 v4, 0x0

    .line 19
    move v5, v4

    .line 20
    :goto_0
    if-ge v5, v3, :cond_1

    .line 21
    .line 22
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    move-object v7, v6

    .line 27
    check-cast v7, LI0/A;

    .line 28
    .line 29
    invoke-interface {v7}, LI0/l;->j()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    instance-of v7, v7, LK/h0;

    .line 34
    .line 35
    if-nez v7, :cond_0

    .line 36
    .line 37
    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    iget-object v3, v0, LK/d0;->b:Lie/a;

    .line 44
    .line 45
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, Ljava/util/List;

    .line 50
    .line 51
    const/4 v5, 0x0

    .line 52
    if-eqz v3, :cond_5

    .line 53
    .line 54
    new-instance v6, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    move v8, v4

    .line 68
    :goto_1
    if-ge v8, v7, :cond_4

    .line 69
    .line 70
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    check-cast v9, Lr0/h;

    .line 75
    .line 76
    if-eqz v9, :cond_2

    .line 77
    .line 78
    new-instance v10, Lkotlin/Pair;

    .line 79
    .line 80
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v11

    .line 84
    check-cast v11, LI0/A;

    .line 85
    .line 86
    invoke-virtual {v9}, Lr0/h;->n()F

    .line 87
    .line 88
    .line 89
    move-result v12

    .line 90
    float-to-double v12, v12

    .line 91
    invoke-static {v12, v13}, Ljava/lang/Math;->floor(D)D

    .line 92
    .line 93
    .line 94
    move-result-wide v12

    .line 95
    double-to-float v12, v12

    .line 96
    float-to-int v14, v12

    .line 97
    invoke-virtual {v9}, Lr0/h;->h()F

    .line 98
    .line 99
    .line 100
    move-result v12

    .line 101
    float-to-double v12, v12

    .line 102
    invoke-static {v12, v13}, Ljava/lang/Math;->floor(D)D

    .line 103
    .line 104
    .line 105
    move-result-wide v12

    .line 106
    double-to-float v12, v12

    .line 107
    float-to-int v12, v12

    .line 108
    const/16 v17, 0x5

    .line 109
    .line 110
    const/16 v18, 0x0

    .line 111
    .line 112
    const/4 v13, 0x0

    .line 113
    const/4 v15, 0x0

    .line 114
    move/from16 v16, v12

    .line 115
    .line 116
    invoke-static/range {v13 .. v18}, Li1/c;->b(IIIIILjava/lang/Object;)J

    .line 117
    .line 118
    .line 119
    move-result-wide v12

    .line 120
    invoke-interface {v11, v12, v13}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 121
    .line 122
    .line 123
    move-result-object v11

    .line 124
    invoke-virtual {v9}, Lr0/h;->i()F

    .line 125
    .line 126
    .line 127
    move-result v12

    .line 128
    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    .line 129
    .line 130
    .line 131
    move-result v12

    .line 132
    invoke-virtual {v9}, Lr0/h;->l()F

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    .line 137
    .line 138
    .line 139
    move-result v9

    .line 140
    invoke-static {v12, v9}, Li1/o;->a(II)J

    .line 141
    .line 142
    .line 143
    move-result-wide v12

    .line 144
    invoke-static {v12, v13}, Li1/n;->c(J)Li1/n;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    invoke-direct {v10, v11, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_2
    move-object v10, v5

    .line 153
    :goto_2
    if-eqz v10, :cond_3

    .line 154
    .line 155
    invoke-interface {v6, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    :cond_3
    add-int/lit8 v8, v8, 0x1

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_4
    move-object v5, v6

    .line 162
    :cond_5
    new-instance v2, Ljava/util/ArrayList;

    .line 163
    .line 164
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 169
    .line 170
    .line 171
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    :goto_3
    if-ge v4, v3, :cond_7

    .line 176
    .line 177
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    move-object v7, v6

    .line 182
    check-cast v7, LI0/A;

    .line 183
    .line 184
    invoke-interface {v7}, LI0/l;->j()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    instance-of v7, v7, LK/h0;

    .line 189
    .line 190
    if-eqz v7, :cond_6

    .line 191
    .line 192
    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_7
    iget-object v1, v0, LK/d0;->a:Lie/a;

    .line 199
    .line 200
    invoke-static {v2, v1}, LK/d;->h(Ljava/util/List;Lie/a;)Ljava/util/List;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-static/range {p3 .. p4}, Li1/b;->l(J)I

    .line 205
    .line 206
    .line 207
    move-result v7

    .line 208
    invoke-static/range {p3 .. p4}, Li1/b;->k(J)I

    .line 209
    .line 210
    .line 211
    move-result v8

    .line 212
    new-instance v10, LK/d0$a;

    .line 213
    .line 214
    invoke-direct {v10, v5, v1}, LK/d0$a;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 215
    .line 216
    .line 217
    const/4 v11, 0x4

    .line 218
    const/4 v12, 0x0

    .line 219
    const/4 v9, 0x0

    .line 220
    move-object/from16 v6, p1

    .line 221
    .line 222
    invoke-static/range {v6 .. v12}, Landroidx/compose/ui/layout/l;->u0(Landroidx/compose/ui/layout/l;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LI0/C;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    return-object v1
.end method
