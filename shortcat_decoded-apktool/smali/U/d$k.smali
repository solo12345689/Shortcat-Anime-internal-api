.class final LU/d$k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LI0/B;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/d;->f(Landroidx/compose/ui/e;LU/S;JJJLkotlin/jvm/functions/Function2;LU0/Y0;FLC/b$m;LC/b$e;IZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LU/S;

.field final synthetic b:LC/b$e;

.field final synthetic c:LC/b$m;

.field final synthetic d:I


# direct methods
.method constructor <init>(LU/S;LC/b$e;LC/b$m;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/d$k;->a:LU/S;

    .line 2
    .line 3
    iput-object p2, p0, LU/d$k;->b:LC/b$e;

    .line 4
    .line 5
    iput-object p3, p0, LU/d$k;->c:LC/b$m;

    .line 6
    .line 7
    iput p4, p0, LU/d$k;->d:I

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final measure-3p2s80s(Landroidx/compose/ui/layout/l;Ljava/util/List;J)LI0/C;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    move v4, v3

    .line 11
    :goto_0
    const-string v5, "Collection contains no element matching the predicate."

    .line 12
    .line 13
    if-ge v4, v2, :cond_9

    .line 14
    .line 15
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    check-cast v6, LI0/A;

    .line 20
    .line 21
    invoke-static {v6}, Landroidx/compose/ui/layout/h;->a(LI0/A;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    const-string v8, "navigationIcon"

    .line 26
    .line 27
    invoke-static {v7, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    if-eqz v7, :cond_8

    .line 32
    .line 33
    const/16 v14, 0xe

    .line 34
    .line 35
    const/4 v15, 0x0

    .line 36
    const/4 v10, 0x0

    .line 37
    const/4 v11, 0x0

    .line 38
    const/4 v12, 0x0

    .line 39
    const/4 v13, 0x0

    .line 40
    move-wide/from16 v8, p3

    .line 41
    .line 42
    invoke-static/range {v8 .. v15}, Li1/b;->d(JIIIIILjava/lang/Object;)J

    .line 43
    .line 44
    .line 45
    move-result-wide v10

    .line 46
    invoke-interface {v6, v10, v11}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    move v6, v3

    .line 55
    :goto_1
    if-ge v6, v4, :cond_7

    .line 56
    .line 57
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    check-cast v7, LI0/A;

    .line 62
    .line 63
    invoke-static {v7}, Landroidx/compose/ui/layout/h;->a(LI0/A;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    const-string v9, "actionIcons"

    .line 68
    .line 69
    invoke-static {v8, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    if-eqz v8, :cond_6

    .line 74
    .line 75
    const/16 v18, 0xe

    .line 76
    .line 77
    const/16 v19, 0x0

    .line 78
    .line 79
    const/4 v14, 0x0

    .line 80
    const/4 v15, 0x0

    .line 81
    const/16 v16, 0x0

    .line 82
    .line 83
    const/16 v17, 0x0

    .line 84
    .line 85
    move-wide/from16 v12, p3

    .line 86
    .line 87
    invoke-static/range {v12 .. v19}, Li1/b;->d(JIIIIILjava/lang/Object;)J

    .line 88
    .line 89
    .line 90
    move-result-wide v8

    .line 91
    invoke-interface {v7, v8, v9}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-static/range {p3 .. p4}, Li1/b;->l(J)I

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    const v7, 0x7fffffff

    .line 100
    .line 101
    .line 102
    if-ne v6, v7, :cond_0

    .line 103
    .line 104
    invoke-static/range {p3 .. p4}, Li1/b;->l(J)I

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    :goto_2
    move v15, v6

    .line 109
    goto :goto_3

    .line 110
    :cond_0
    invoke-static/range {p3 .. p4}, Li1/b;->l(J)I

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    invoke-virtual {v2}, Landroidx/compose/ui/layout/s;->W0()I

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    sub-int/2addr v6, v8

    .line 119
    invoke-virtual {v4}, Landroidx/compose/ui/layout/s;->W0()I

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    sub-int/2addr v6, v8

    .line 124
    invoke-static {v6, v3}, Loe/j;->e(II)I

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    goto :goto_2

    .line 129
    :goto_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    move v8, v3

    .line 134
    :goto_4
    if-ge v8, v6, :cond_5

    .line 135
    .line 136
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v9

    .line 140
    check-cast v9, LI0/A;

    .line 141
    .line 142
    invoke-static {v9}, Landroidx/compose/ui/layout/h;->a(LI0/A;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v10

    .line 146
    const-string v11, "title"

    .line 147
    .line 148
    invoke-static {v10, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    if-eqz v10, :cond_4

    .line 153
    .line 154
    const/16 v18, 0xc

    .line 155
    .line 156
    const/16 v19, 0x0

    .line 157
    .line 158
    const/4 v14, 0x0

    .line 159
    const/16 v16, 0x0

    .line 160
    .line 161
    const/16 v17, 0x0

    .line 162
    .line 163
    move-wide/from16 v12, p3

    .line 164
    .line 165
    invoke-static/range {v12 .. v19}, Li1/b;->d(JIIIIILjava/lang/Object;)J

    .line 166
    .line 167
    .line 168
    move-result-wide v5

    .line 169
    invoke-interface {v9, v5, v6}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 170
    .line 171
    .line 172
    move-result-object v15

    .line 173
    invoke-static {}, LI0/b;->b()LI0/k;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-interface {v15, v1}, LI0/D;->N(LI0/a;)I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    const/high16 v5, -0x80000000

    .line 182
    .line 183
    if-eq v1, v5, :cond_1

    .line 184
    .line 185
    invoke-static {}, LI0/b;->b()LI0/k;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-interface {v15, v1}, LI0/D;->N(LI0/a;)I

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    move/from16 v23, v1

    .line 194
    .line 195
    goto :goto_5

    .line 196
    :cond_1
    move/from16 v23, v3

    .line 197
    .line 198
    :goto_5
    iget-object v1, v0, LU/d$k;->a:LU/S;

    .line 199
    .line 200
    invoke-interface {v1}, LU/S;->a()F

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 205
    .line 206
    .line 207
    move-result v5

    .line 208
    if-eqz v5, :cond_2

    .line 209
    .line 210
    goto :goto_6

    .line 211
    :cond_2
    invoke-static {v1}, Lke/a;->d(F)I

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    :goto_6
    invoke-static/range {p3 .. p4}, Li1/b;->k(J)I

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    if-ne v1, v7, :cond_3

    .line 220
    .line 221
    invoke-static/range {p3 .. p4}, Li1/b;->k(J)I

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    :goto_7
    move v14, v1

    .line 226
    goto :goto_8

    .line 227
    :cond_3
    invoke-static/range {p3 .. p4}, Li1/b;->k(J)I

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    add-int/2addr v1, v3

    .line 232
    goto :goto_7

    .line 233
    :goto_8
    invoke-static/range {p3 .. p4}, Li1/b;->l(J)I

    .line 234
    .line 235
    .line 236
    move-result v6

    .line 237
    new-instance v12, LU/d$k$a;

    .line 238
    .line 239
    iget-object v1, v0, LU/d$k;->b:LC/b$e;

    .line 240
    .line 241
    iget-object v3, v0, LU/d$k;->c:LC/b$m;

    .line 242
    .line 243
    iget v5, v0, LU/d$k;->d:I

    .line 244
    .line 245
    move-object/from16 v20, p1

    .line 246
    .line 247
    move-wide/from16 v17, p3

    .line 248
    .line 249
    move-object/from16 v16, v1

    .line 250
    .line 251
    move-object v13, v2

    .line 252
    move-object/from16 v21, v3

    .line 253
    .line 254
    move-object/from16 v19, v4

    .line 255
    .line 256
    move/from16 v22, v5

    .line 257
    .line 258
    invoke-direct/range {v12 .. v23}, LU/d$k$a;-><init>(Landroidx/compose/ui/layout/s;ILandroidx/compose/ui/layout/s;LC/b$e;JLandroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/l;LC/b$m;II)V

    .line 259
    .line 260
    .line 261
    const/4 v10, 0x4

    .line 262
    const/4 v11, 0x0

    .line 263
    const/4 v8, 0x0

    .line 264
    move-object/from16 v5, p1

    .line 265
    .line 266
    move-object v9, v12

    .line 267
    move v7, v14

    .line 268
    invoke-static/range {v5 .. v11}, Landroidx/compose/ui/layout/l;->u0(Landroidx/compose/ui/layout/l;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LI0/C;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    return-object v1

    .line 273
    :cond_4
    move-object v13, v2

    .line 274
    move-object/from16 v19, v4

    .line 275
    .line 276
    add-int/lit8 v8, v8, 0x1

    .line 277
    .line 278
    goto/16 :goto_4

    .line 279
    .line 280
    :cond_5
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 281
    .line 282
    invoke-direct {v1, v5}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    throw v1

    .line 286
    :cond_6
    move-object v13, v2

    .line 287
    add-int/lit8 v6, v6, 0x1

    .line 288
    .line 289
    goto/16 :goto_1

    .line 290
    .line 291
    :cond_7
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 292
    .line 293
    invoke-direct {v1, v5}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    throw v1

    .line 297
    :cond_8
    add-int/lit8 v4, v4, 0x1

    .line 298
    .line 299
    goto/16 :goto_0

    .line 300
    .line 301
    :cond_9
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 302
    .line 303
    invoke-direct {v1, v5}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    throw v1
.end method
