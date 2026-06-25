.class public abstract LA/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x190

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    invoke-static {v0}, Li1/h;->n(F)F

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sput v0, LA/i;->a:F

    .line 9
    .line 10
    return-void
.end method

.method public static final synthetic a(Lz/u;FLw/k;Lw/z;Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, LA/i;->f(Lz/u;FLw/k;Lw/z;Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic b(Lw/h;Lz/u;Lkotlin/jvm/functions/Function1;F)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LA/i;->g(Lw/h;Lz/u;Lkotlin/jvm/functions/Function1;F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic c(Lz/u;FFLw/k;Lw/i;Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, LA/i;->h(Lz/u;FFLw/k;Lw/i;Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic d(Lz/u;FFLA/b;Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, LA/i;->i(Lz/u;FFLA/b;Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic e(FF)F
    .locals 0

    .line 1
    invoke-static {p0, p1}, LA/i;->j(FF)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final f(Lz/u;FLw/k;Lw/z;Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p5, LA/i$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, LA/i$a;

    .line 7
    .line 8
    iget v1, v0, LA/i$a;->e:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LA/i$a;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LA/i$a;

    .line 21
    .line 22
    invoke-direct {v0, p5}, LA/i$a;-><init>(LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, LA/i$a;->d:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LA/i$a;->e:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget p1, v0, LA/i$a;->a:F

    .line 39
    .line 40
    iget-object p0, v0, LA/i$a;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Lkotlin/jvm/internal/K;

    .line 43
    .line 44
    iget-object p2, v0, LA/i$a;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p2, Lw/k;

    .line 47
    .line 48
    invoke-static {p5}, LTd/v;->b(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p0

    .line 60
    :cond_2
    invoke-static {p5}, LTd/v;->b(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    new-instance p5, Lkotlin/jvm/internal/K;

    .line 64
    .line 65
    invoke-direct {p5}, Lkotlin/jvm/internal/K;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, Lw/k;->p()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, Ljava/lang/Number;

    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    const/4 v4, 0x0

    .line 79
    cmpg-float v2, v2, v4

    .line 80
    .line 81
    if-nez v2, :cond_3

    .line 82
    .line 83
    move v2, v3

    .line 84
    goto :goto_1

    .line 85
    :cond_3
    const/4 v2, 0x0

    .line 86
    :goto_1
    xor-int/2addr v2, v3

    .line 87
    new-instance v4, LA/i$b;

    .line 88
    .line 89
    invoke-direct {v4, p1, p5, p0, p4}, LA/i$b;-><init>(FLkotlin/jvm/internal/K;Lz/u;Lkotlin/jvm/functions/Function1;)V

    .line 90
    .line 91
    .line 92
    iput-object p2, v0, LA/i$a;->b:Ljava/lang/Object;

    .line 93
    .line 94
    iput-object p5, v0, LA/i$a;->c:Ljava/lang/Object;

    .line 95
    .line 96
    iput p1, v0, LA/i$a;->a:F

    .line 97
    .line 98
    iput v3, v0, LA/i$a;->e:I

    .line 99
    .line 100
    invoke-static {p2, p3, v2, v4, v0}, Lw/m0;->g(Lw/k;Lw/z;ZLkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    if-ne p0, v1, :cond_4

    .line 105
    .line 106
    return-object v1

    .line 107
    :cond_4
    move-object p0, p5

    .line 108
    :goto_2
    new-instance p3, LA/a;

    .line 109
    .line 110
    iget p0, p0, Lkotlin/jvm/internal/K;->a:F

    .line 111
    .line 112
    sub-float/2addr p1, p0

    .line 113
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-direct {p3, p0, p2}, LA/a;-><init>(Ljava/lang/Object;Lw/k;)V

    .line 118
    .line 119
    .line 120
    return-object p3
.end method

.method private static final g(Lw/h;Lz/u;Lkotlin/jvm/functions/Function1;F)V
    .locals 1

    .line 1
    invoke-interface {p1, p3}, Lz/u;->a(F)F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    sub-float/2addr p3, p1

    .line 13
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/high16 p2, 0x3f000000    # 0.5f

    .line 18
    .line 19
    cmpl-float p1, p1, p2

    .line 20
    .line 21
    if-lez p1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lw/h;->a()V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method private static final h(Lz/u;FFLw/k;Lw/i;Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p6

    .line 2
    .line 3
    instance-of v1, v0, LA/i$c;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, LA/i$c;

    .line 9
    .line 10
    iget v2, v1, LA/i$c;->f:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, LA/i$c;->f:I

    .line 20
    .line 21
    :goto_0
    move-object v7, v1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v1, LA/i$c;

    .line 24
    .line 25
    invoke-direct {v1, v0}, LA/i$c;-><init>(LZd/e;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iget-object v0, v7, LA/i$c;->e:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iget v2, v7, LA/i$c;->f:I

    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    iget v1, v7, LA/i$c;->b:F

    .line 43
    .line 44
    iget v2, v7, LA/i$c;->a:F

    .line 45
    .line 46
    iget-object v3, v7, LA/i$c;->d:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v3, Lkotlin/jvm/internal/K;

    .line 49
    .line 50
    iget-object v4, v7, LA/i$c;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v4, Lw/k;

    .line 53
    .line 54
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    move v9, v2

    .line 58
    move-object v10, v4

    .line 59
    goto :goto_3

    .line 60
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v0

    .line 68
    :cond_2
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    new-instance v0, Lkotlin/jvm/internal/K;

    .line 72
    .line 73
    invoke-direct {v0}, Lkotlin/jvm/internal/K;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual/range {p3 .. p3}, Lw/k;->p()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    check-cast v2, Ljava/lang/Number;

    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual/range {p3 .. p3}, Lw/k;->p()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    check-cast v4, Ljava/lang/Number;

    .line 95
    .line 96
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    const/4 v5, 0x0

    .line 101
    cmpg-float v4, v4, v5

    .line 102
    .line 103
    if-nez v4, :cond_3

    .line 104
    .line 105
    move v4, v3

    .line 106
    goto :goto_2

    .line 107
    :cond_3
    const/4 v4, 0x0

    .line 108
    :goto_2
    xor-int/lit8 v5, v4, 0x1

    .line 109
    .line 110
    new-instance v6, LA/i$d;

    .line 111
    .line 112
    move-object/from16 v4, p0

    .line 113
    .line 114
    move/from16 v9, p2

    .line 115
    .line 116
    move-object/from16 v10, p5

    .line 117
    .line 118
    invoke-direct {v6, v9, v0, v4, v10}, LA/i$d;-><init>(FLkotlin/jvm/internal/K;Lz/u;Lkotlin/jvm/functions/Function1;)V

    .line 119
    .line 120
    .line 121
    move-object/from16 v4, p3

    .line 122
    .line 123
    iput-object v4, v7, LA/i$c;->c:Ljava/lang/Object;

    .line 124
    .line 125
    iput-object v0, v7, LA/i$c;->d:Ljava/lang/Object;

    .line 126
    .line 127
    move/from16 v9, p1

    .line 128
    .line 129
    iput v9, v7, LA/i$c;->a:F

    .line 130
    .line 131
    iput v8, v7, LA/i$c;->b:F

    .line 132
    .line 133
    iput v3, v7, LA/i$c;->f:I

    .line 134
    .line 135
    move-object v3, v2

    .line 136
    move-object v2, v4

    .line 137
    move-object/from16 v4, p4

    .line 138
    .line 139
    invoke-static/range {v2 .. v7}, Lw/m0;->i(Lw/k;Ljava/lang/Object;Lw/i;ZLkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    if-ne v3, v1, :cond_4

    .line 144
    .line 145
    return-object v1

    .line 146
    :cond_4
    move-object/from16 v10, p3

    .line 147
    .line 148
    move-object v3, v0

    .line 149
    move v1, v8

    .line 150
    :goto_3
    invoke-virtual {v10}, Lw/k;->p()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    check-cast v0, Ljava/lang/Number;

    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    invoke-static {v0, v1}, LA/i;->j(FF)F

    .line 161
    .line 162
    .line 163
    move-result v12

    .line 164
    new-instance v0, LA/a;

    .line 165
    .line 166
    iget v1, v3, Lkotlin/jvm/internal/K;->a:F

    .line 167
    .line 168
    sub-float/2addr v9, v1

    .line 169
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    const/16 v18, 0x1d

    .line 174
    .line 175
    const/16 v19, 0x0

    .line 176
    .line 177
    const/4 v11, 0x0

    .line 178
    const-wide/16 v13, 0x0

    .line 179
    .line 180
    const-wide/16 v15, 0x0

    .line 181
    .line 182
    const/16 v17, 0x0

    .line 183
    .line 184
    invoke-static/range {v10 .. v19}, Lw/l;->g(Lw/k;FFJJZILjava/lang/Object;)Lw/k;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-direct {v0, v1, v2}, LA/a;-><init>(Ljava/lang/Object;Lw/k;)V

    .line 189
    .line 190
    .line 191
    return-object v0
.end method

.method private static final i(Lz/u;FFLA/b;Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    move-object v0, p1

    .line 10
    move-object p1, p0

    .line 11
    move-object p0, p3

    .line 12
    move-object p3, p2

    .line 13
    move-object p2, v0

    .line 14
    invoke-interface/range {p0 .. p5}, LA/b;->a(Lz/u;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method private static final j(FF)F
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p1, v0

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    cmpl-float v0, p1, v0

    .line 8
    .line 9
    if-lez v0, :cond_1

    .line 10
    .line 11
    invoke-static {p0, p1}, Loe/j;->h(FF)F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_1
    invoke-static {p0, p1}, Loe/j;->d(FF)F

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method public static final k()F
    .locals 1

    .line 1
    sget v0, LA/i;->a:F

    .line 2
    .line 3
    return v0
.end method

.method public static final l(LA/j;Lw/z;Lw/i;)Lz/B;
    .locals 1

    .line 1
    new-instance v0, LA/h;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, LA/h;-><init>(LA/j;Lw/z;Lw/i;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
