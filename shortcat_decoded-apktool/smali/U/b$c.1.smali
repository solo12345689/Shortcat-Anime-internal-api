.class final LU/b$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LI0/B;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/b;->b(FFLkotlin/jvm/functions/Function2;LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:F


# direct methods
.method constructor <init>(FF)V
    .locals 0

    .line 1
    iput p1, p0, LU/b$c;->a:F

    .line 2
    .line 3
    iput p2, p0, LU/b$c;->b:F

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private static final a(Ljava/util/List;Lkotlin/jvm/internal/L;Landroidx/compose/ui/layout/l;FJLandroidx/compose/ui/layout/s;)Z
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_1

    .line 6
    .line 7
    iget p0, p1, Lkotlin/jvm/internal/L;->a:I

    .line 8
    .line 9
    invoke-interface {p2, p3}, Li1/d;->s0(F)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    add-int/2addr p0, p1

    .line 14
    invoke-virtual {p6}, Landroidx/compose/ui/layout/s;->W0()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    add-int/2addr p0, p1

    .line 19
    invoke-static {p4, p5}, Li1/b;->l(J)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-gt p0, p1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return p0

    .line 28
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 29
    return p0
.end method

.method private static final b(Ljava/util/List;Lkotlin/jvm/internal/L;Landroidx/compose/ui/layout/l;FLjava/util/List;Ljava/util/List;Lkotlin/jvm/internal/L;Ljava/util/List;Lkotlin/jvm/internal/L;Lkotlin/jvm/internal/L;)V
    .locals 1

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget v0, p1, Lkotlin/jvm/internal/L;->a:I

    .line 8
    .line 9
    invoke-interface {p2, p3}, Li1/d;->s0(F)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    add-int/2addr v0, p2

    .line 14
    iput v0, p1, Lkotlin/jvm/internal/L;->a:I

    .line 15
    .line 16
    :cond_0
    invoke-static {p4}, LUd/u;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    const/4 p3, 0x0

    .line 21
    invoke-interface {p0, p3, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget p0, p6, Lkotlin/jvm/internal/L;->a:I

    .line 25
    .line 26
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-interface {p5, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    iget p0, p1, Lkotlin/jvm/internal/L;->a:I

    .line 34
    .line 35
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-interface {p7, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    iget p0, p1, Lkotlin/jvm/internal/L;->a:I

    .line 43
    .line 44
    iget p2, p6, Lkotlin/jvm/internal/L;->a:I

    .line 45
    .line 46
    add-int/2addr p0, p2

    .line 47
    iput p0, p1, Lkotlin/jvm/internal/L;->a:I

    .line 48
    .line 49
    iget p0, p8, Lkotlin/jvm/internal/L;->a:I

    .line 50
    .line 51
    iget p1, p9, Lkotlin/jvm/internal/L;->a:I

    .line 52
    .line 53
    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    iput p0, p8, Lkotlin/jvm/internal/L;->a:I

    .line 58
    .line 59
    invoke-interface {p4}, Ljava/util/List;->clear()V

    .line 60
    .line 61
    .line 62
    iput p3, p9, Lkotlin/jvm/internal/L;->a:I

    .line 63
    .line 64
    iput p3, p6, Lkotlin/jvm/internal/L;->a:I

    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public final measure-3p2s80s(Landroidx/compose/ui/layout/l;Ljava/util/List;J)LI0/C;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v6, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v8, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance v9, Lkotlin/jvm/internal/L;

    .line 19
    .line 20
    invoke-direct {v9}, Lkotlin/jvm/internal/L;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance v2, Lkotlin/jvm/internal/L;

    .line 24
    .line 25
    invoke-direct {v2}, Lkotlin/jvm/internal/L;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance v5, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance v10, Lkotlin/jvm/internal/L;

    .line 34
    .line 35
    invoke-direct {v10}, Lkotlin/jvm/internal/L;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance v7, Lkotlin/jvm/internal/L;

    .line 39
    .line 40
    invoke-direct {v7}, Lkotlin/jvm/internal/L;-><init>()V

    .line 41
    .line 42
    .line 43
    iget v13, v0, LU/b$c;->a:F

    .line 44
    .line 45
    iget v4, v0, LU/b$c;->b:F

    .line 46
    .line 47
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    const/4 v11, 0x0

    .line 52
    :goto_0
    if-ge v11, v3, :cond_2

    .line 53
    .line 54
    move-object/from16 v12, p2

    .line 55
    .line 56
    invoke-interface {v12, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v14

    .line 60
    check-cast v14, LI0/A;

    .line 61
    .line 62
    move-object/from16 v17, v1

    .line 63
    .line 64
    move-object/from16 v18, v2

    .line 65
    .line 66
    move-wide/from16 v1, p3

    .line 67
    .line 68
    invoke-interface {v14, v1, v2}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 69
    .line 70
    .line 71
    move-result-object v16

    .line 72
    move-object/from16 v12, p1

    .line 73
    .line 74
    move-wide v14, v1

    .line 75
    move/from16 v19, v11

    .line 76
    .line 77
    move-object v11, v10

    .line 78
    move-object v10, v5

    .line 79
    invoke-static/range {v10 .. v16}, LU/b$c;->a(Ljava/util/List;Lkotlin/jvm/internal/L;Landroidx/compose/ui/layout/l;FJLandroidx/compose/ui/layout/s;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    move-object v10, v11

    .line 84
    move-object/from16 v11, v16

    .line 85
    .line 86
    move v12, v3

    .line 87
    if-nez v1, :cond_0

    .line 88
    .line 89
    move-object/from16 v1, v17

    .line 90
    .line 91
    move-object/from16 v2, v18

    .line 92
    .line 93
    move-object/from16 v3, p1

    .line 94
    .line 95
    invoke-static/range {v1 .. v10}, LU/b$c;->b(Ljava/util/List;Lkotlin/jvm/internal/L;Landroidx/compose/ui/layout/l;FLjava/util/List;Ljava/util/List;Lkotlin/jvm/internal/L;Ljava/util/List;Lkotlin/jvm/internal/L;Lkotlin/jvm/internal/L;)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_0
    move-object/from16 v1, v17

    .line 100
    .line 101
    move-object/from16 v2, v18

    .line 102
    .line 103
    :goto_1
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-nez v3, :cond_1

    .line 108
    .line 109
    iget v3, v10, Lkotlin/jvm/internal/L;->a:I

    .line 110
    .line 111
    move-object/from16 v14, p1

    .line 112
    .line 113
    invoke-interface {v14, v13}, Li1/d;->s0(F)I

    .line 114
    .line 115
    .line 116
    move-result v15

    .line 117
    add-int/2addr v3, v15

    .line 118
    iput v3, v10, Lkotlin/jvm/internal/L;->a:I

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_1
    move-object/from16 v14, p1

    .line 122
    .line 123
    :goto_2
    invoke-interface {v5, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    iget v3, v10, Lkotlin/jvm/internal/L;->a:I

    .line 127
    .line 128
    invoke-virtual {v11}, Landroidx/compose/ui/layout/s;->W0()I

    .line 129
    .line 130
    .line 131
    move-result v15

    .line 132
    add-int/2addr v3, v15

    .line 133
    iput v3, v10, Lkotlin/jvm/internal/L;->a:I

    .line 134
    .line 135
    iget v3, v7, Lkotlin/jvm/internal/L;->a:I

    .line 136
    .line 137
    invoke-virtual {v11}, Landroidx/compose/ui/layout/s;->P0()I

    .line 138
    .line 139
    .line 140
    move-result v11

    .line 141
    invoke-static {v3, v11}, Ljava/lang/Math;->max(II)I

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    iput v3, v7, Lkotlin/jvm/internal/L;->a:I

    .line 146
    .line 147
    add-int/lit8 v11, v19, 0x1

    .line 148
    .line 149
    move v3, v12

    .line 150
    goto :goto_0

    .line 151
    :cond_2
    move-object/from16 v14, p1

    .line 152
    .line 153
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    if-nez v3, :cond_3

    .line 158
    .line 159
    iget v4, v0, LU/b$c;->b:F

    .line 160
    .line 161
    move-object v3, v14

    .line 162
    invoke-static/range {v1 .. v10}, LU/b$c;->b(Ljava/util/List;Lkotlin/jvm/internal/L;Landroidx/compose/ui/layout/l;FLjava/util/List;Ljava/util/List;Lkotlin/jvm/internal/L;Ljava/util/List;Lkotlin/jvm/internal/L;Lkotlin/jvm/internal/L;)V

    .line 163
    .line 164
    .line 165
    :cond_3
    iget v3, v9, Lkotlin/jvm/internal/L;->a:I

    .line 166
    .line 167
    invoke-static/range {p3 .. p4}, Li1/b;->n(J)I

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    iget v2, v2, Lkotlin/jvm/internal/L;->a:I

    .line 176
    .line 177
    invoke-static/range {p3 .. p4}, Li1/b;->m(J)I

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 182
    .line 183
    .line 184
    move-result v22

    .line 185
    new-instance v24, LU/b$c$a;

    .line 186
    .line 187
    iget v4, v0, LU/b$c;->a:F

    .line 188
    .line 189
    move-object/from16 v3, p1

    .line 190
    .line 191
    move-object v2, v1

    .line 192
    move-object v6, v8

    .line 193
    move-object/from16 v1, v24

    .line 194
    .line 195
    invoke-direct/range {v1 .. v6}, LU/b$c$a;-><init>(Ljava/util/List;Landroidx/compose/ui/layout/l;FILjava/util/List;)V

    .line 196
    .line 197
    .line 198
    const/16 v25, 0x4

    .line 199
    .line 200
    const/16 v26, 0x0

    .line 201
    .line 202
    const/16 v23, 0x0

    .line 203
    .line 204
    move-object/from16 v20, p1

    .line 205
    .line 206
    move/from16 v21, v5

    .line 207
    .line 208
    invoke-static/range {v20 .. v26}, Landroidx/compose/ui/layout/l;->u0(Landroidx/compose/ui/layout/l;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LI0/C;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    return-object v1
.end method
