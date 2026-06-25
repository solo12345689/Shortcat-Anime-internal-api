.class public final LG/u;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LG/n;
.implements LI0/C;


# instance fields
.field private final a:Ljava/util/List;

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:Lz/q;

.field private final f:I

.field private final g:I

.field private final h:Z

.field private final i:I

.field private final j:LG/e;

.field private final k:LG/e;

.field private l:F

.field private m:I

.field private n:Z

.field private final o:LA/k;

.field private final p:Z

.field private final q:Ljava/util/List;

.field private final r:Ljava/util/List;

.field private final s:LGf/O;

.field private final synthetic t:LI0/C;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Ljava/util/List;IIILz/q;IIZILG/e;LG/e;FIZLA/k;LI0/C;ZLjava/util/List;Ljava/util/List;LGf/O;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LG/u;->a:Ljava/util/List;

    .line 3
    iput p2, p0, LG/u;->b:I

    .line 4
    iput p3, p0, LG/u;->c:I

    .line 5
    iput p4, p0, LG/u;->d:I

    .line 6
    iput-object p5, p0, LG/u;->e:Lz/q;

    .line 7
    iput p6, p0, LG/u;->f:I

    .line 8
    iput p7, p0, LG/u;->g:I

    .line 9
    iput-boolean p8, p0, LG/u;->h:Z

    .line 10
    iput p9, p0, LG/u;->i:I

    .line 11
    iput-object p10, p0, LG/u;->j:LG/e;

    .line 12
    iput-object p11, p0, LG/u;->k:LG/e;

    .line 13
    iput p12, p0, LG/u;->l:F

    .line 14
    iput p13, p0, LG/u;->m:I

    .line 15
    iput-boolean p14, p0, LG/u;->n:Z

    .line 16
    iput-object p15, p0, LG/u;->o:LA/k;

    move/from16 p1, p17

    .line 17
    iput-boolean p1, p0, LG/u;->p:Z

    move-object/from16 p1, p18

    .line 18
    iput-object p1, p0, LG/u;->q:Ljava/util/List;

    move-object/from16 p1, p19

    .line 19
    iput-object p1, p0, LG/u;->r:Ljava/util/List;

    move-object/from16 p1, p20

    .line 20
    iput-object p1, p0, LG/u;->s:LGf/O;

    move-object/from16 p1, p16

    .line 21
    iput-object p1, p0, LG/u;->t:LI0/C;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;IIILz/q;IIZILG/e;LG/e;FIZLA/k;LI0/C;ZLjava/util/List;Ljava/util/List;LGf/O;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 22

    const/high16 v0, 0x20000

    and-int v0, p21, v0

    if-eqz v0, :cond_0

    .line 22
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    move-result-object v0

    move-object/from16 v19, v0

    goto :goto_0

    :cond_0
    move-object/from16 v19, p18

    :goto_0
    const/high16 v0, 0x40000

    and-int v0, p21, v0

    if-eqz v0, :cond_1

    .line 23
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    move-result-object v0

    move-object/from16 v20, v0

    :goto_1
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move/from16 v18, p17

    move-object/from16 v21, p20

    goto :goto_2

    :cond_1
    move-object/from16 v20, p19

    goto :goto_1

    .line 24
    :goto_2
    invoke-direct/range {v1 .. v21}, LG/u;-><init>(Ljava/util/List;IIILz/q;IIZILG/e;LG/e;FIZLA/k;LI0/C;ZLjava/util/List;Ljava/util/List;LGf/O;)V

    return-void
.end method


# virtual methods
.method public A()V
    .locals 1

    .line 1
    iget-object v0, p0, LG/u;->t:LI0/C;

    .line 2
    .line 3
    invoke-interface {v0}, LI0/C;->A()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public B()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    iget-object v0, p0, LG/u;->t:LI0/C;

    .line 2
    .line 3
    invoke-interface {v0}, LI0/C;->B()Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public a()Lz/q;
    .locals 1

    .line 1
    iget-object v0, p0, LG/u;->e:Lz/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()J
    .locals 2

    .line 1
    invoke-virtual {p0}, LG/u;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, LG/u;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v0, v1}, Li1/s;->a(II)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, LG/u;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, LG/u;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public e()I
    .locals 1

    .line 1
    invoke-virtual {p0}, LG/u;->f()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    neg-int v0, v0

    .line 6
    return v0
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, LG/u;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LG/u;->h:Z

    .line 2
    .line 3
    return v0
.end method

.method public getHeight()I
    .locals 1

    .line 1
    iget-object v0, p0, LG/u;->t:LI0/C;

    .line 2
    .line 3
    invoke-interface {v0}, LI0/C;->getHeight()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getWidth()I
    .locals 1

    .line 1
    iget-object v0, p0, LG/u;->t:LI0/C;

    .line 2
    .line 3
    invoke-interface {v0}, LI0/C;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public h()I
    .locals 1

    .line 1
    iget v0, p0, LG/u;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public i()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LG/u;->a:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public j()I
    .locals 1

    .line 1
    iget v0, p0, LG/u;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public k()I
    .locals 1

    .line 1
    iget v0, p0, LG/u;->i:I

    .line 2
    .line 3
    return v0
.end method

.method public l()LA/k;
    .locals 1

    .line 1
    iget-object v0, p0, LG/u;->o:LA/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Z
    .locals 2

    .line 1
    iget-object v0, p0, LG/u;->j:LG/e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, LG/e;->getIndex()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    if-nez v0, :cond_2

    .line 13
    .line 14
    iget v0, p0, LG/u;->m:I

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    return v1

    .line 20
    :cond_2
    :goto_1
    const/4 v0, 0x1

    .line 21
    return v0
.end method

.method public final n()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LG/u;->n:Z

    .line 2
    .line 3
    return v0
.end method

.method public final o()LG/e;
    .locals 1

    .line 1
    iget-object v0, p0, LG/u;->k:LG/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()F
    .locals 1

    .line 1
    iget v0, p0, LG/u;->l:F

    .line 2
    .line 3
    return v0
.end method

.method public final q()LG/e;
    .locals 1

    .line 1
    iget-object v0, p0, LG/u;->j:LG/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()I
    .locals 1

    .line 1
    iget v0, p0, LG/u;->m:I

    .line 2
    .line 3
    return v0
.end method

.method public final s(I)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, LG/u;->h()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, LG/u;->j()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v0, v1

    .line 10
    iget-boolean v1, p0, LG/u;->p:Z

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-nez v1, :cond_7

    .line 14
    .line 15
    invoke-virtual {p0}, LG/u;->i()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_7

    .line 24
    .line 25
    iget-object v1, p0, LG/u;->j:LG/e;

    .line 26
    .line 27
    if-eqz v1, :cond_7

    .line 28
    .line 29
    iget v1, p0, LG/u;->m:I

    .line 30
    .line 31
    sub-int/2addr v1, p1

    .line 32
    if-ltz v1, :cond_7

    .line 33
    .line 34
    if-ge v1, v0, :cond_7

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    int-to-float v1, p1

    .line 39
    int-to-float v3, v0

    .line 40
    div-float/2addr v1, v3

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v1, 0x0

    .line 43
    :goto_0
    iget v3, p0, LG/u;->l:F

    .line 44
    .line 45
    sub-float/2addr v3, v1

    .line 46
    iget-object v4, p0, LG/u;->k:LG/e;

    .line 47
    .line 48
    if-eqz v4, :cond_7

    .line 49
    .line 50
    const/high16 v4, 0x3f000000    # 0.5f

    .line 51
    .line 52
    cmpl-float v4, v3, v4

    .line 53
    .line 54
    if-gez v4, :cond_7

    .line 55
    .line 56
    const/high16 v4, -0x41000000    # -0.5f

    .line 57
    .line 58
    cmpg-float v3, v3, v4

    .line 59
    .line 60
    if-gtz v3, :cond_1

    .line 61
    .line 62
    goto/16 :goto_5

    .line 63
    .line 64
    :cond_1
    invoke-virtual {p0}, LG/u;->i()Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-static {v3}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    check-cast v3, LG/e;

    .line 73
    .line 74
    invoke-virtual {p0}, LG/u;->i()Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-static {v4}, LUd/u;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    check-cast v4, LG/e;

    .line 83
    .line 84
    if-gez p1, :cond_2

    .line 85
    .line 86
    invoke-virtual {v3}, LG/e;->getOffset()I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    add-int/2addr v3, v0

    .line 91
    invoke-virtual {p0}, LG/u;->f()I

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    sub-int/2addr v3, v5

    .line 96
    invoke-virtual {v4}, LG/e;->getOffset()I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    add-int/2addr v4, v0

    .line 101
    invoke-virtual {p0}, LG/u;->d()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    sub-int/2addr v4, v0

    .line 106
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    neg-int v3, p1

    .line 111
    if-le v0, v3, :cond_7

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_2
    invoke-virtual {p0}, LG/u;->f()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    invoke-virtual {v3}, LG/e;->getOffset()I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    sub-int/2addr v0, v3

    .line 123
    invoke-virtual {p0}, LG/u;->d()I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    invoke-virtual {v4}, LG/e;->getOffset()I

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    sub-int/2addr v3, v4

    .line 132
    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-le v0, p1, :cond_7

    .line 137
    .line 138
    :goto_1
    iget v0, p0, LG/u;->l:F

    .line 139
    .line 140
    sub-float/2addr v0, v1

    .line 141
    iput v0, p0, LG/u;->l:F

    .line 142
    .line 143
    iget v0, p0, LG/u;->m:I

    .line 144
    .line 145
    sub-int/2addr v0, p1

    .line 146
    iput v0, p0, LG/u;->m:I

    .line 147
    .line 148
    invoke-virtual {p0}, LG/u;->i()Ljava/util/List;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    move v3, v2

    .line 157
    :goto_2
    if-ge v3, v1, :cond_3

    .line 158
    .line 159
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    check-cast v4, LG/e;

    .line 164
    .line 165
    invoke-virtual {v4, p1}, LG/e;->a(I)V

    .line 166
    .line 167
    .line 168
    add-int/lit8 v3, v3, 0x1

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_3
    iget-object v0, p0, LG/u;->q:Ljava/util/List;

    .line 172
    .line 173
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    move v3, v2

    .line 178
    :goto_3
    if-ge v3, v1, :cond_4

    .line 179
    .line 180
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    check-cast v4, LG/e;

    .line 185
    .line 186
    invoke-virtual {v4, p1}, LG/e;->a(I)V

    .line 187
    .line 188
    .line 189
    add-int/lit8 v3, v3, 0x1

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_4
    iget-object v0, p0, LG/u;->r:Ljava/util/List;

    .line 193
    .line 194
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    :goto_4
    if-ge v2, v1, :cond_5

    .line 199
    .line 200
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    check-cast v3, LG/e;

    .line 205
    .line 206
    invoke-virtual {v3, p1}, LG/e;->a(I)V

    .line 207
    .line 208
    .line 209
    add-int/lit8 v2, v2, 0x1

    .line 210
    .line 211
    goto :goto_4

    .line 212
    :cond_5
    iget-boolean v0, p0, LG/u;->n:Z

    .line 213
    .line 214
    const/4 v1, 0x1

    .line 215
    if-nez v0, :cond_6

    .line 216
    .line 217
    if-lez p1, :cond_6

    .line 218
    .line 219
    iput-boolean v1, p0, LG/u;->n:Z

    .line 220
    .line 221
    :cond_6
    return v1

    .line 222
    :cond_7
    :goto_5
    return v2
.end method

.method public z()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, LG/u;->t:LI0/C;

    .line 2
    .line 3
    invoke-interface {v0}, LI0/C;->z()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
