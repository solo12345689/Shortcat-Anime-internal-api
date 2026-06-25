.class public final LT/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private a:Lr0/f;

.field private final b:F

.field private final c:Z

.field private d:Ljava/lang/Float;

.field private e:Lr0/f;

.field private final f:Lw/a;

.field private final g:Lw/a;

.field private final h:Lw/a;

.field private final i:LGf/x;

.field private final j:LY/C0;

.field private final k:LY/C0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method private constructor <init>(Lr0/f;FZ)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LT/e;->a:Lr0/f;

    .line 4
    iput p2, p0, LT/e;->b:F

    .line 5
    iput-boolean p3, p0, LT/e;->c:Z

    const/4 p1, 0x0

    const/4 p2, 0x2

    const/4 p3, 0x0

    .line 6
    invoke-static {p1, p1, p2, p3}, Lw/b;->b(FFILjava/lang/Object;)Lw/a;

    move-result-object v0

    iput-object v0, p0, LT/e;->f:Lw/a;

    .line 7
    invoke-static {p1, p1, p2, p3}, Lw/b;->b(FFILjava/lang/Object;)Lw/a;

    move-result-object v0

    iput-object v0, p0, LT/e;->g:Lw/a;

    .line 8
    invoke-static {p1, p1, p2, p3}, Lw/b;->b(FFILjava/lang/Object;)Lw/a;

    move-result-object p1

    iput-object p1, p0, LT/e;->h:Lw/a;

    .line 9
    invoke-static {p3}, LGf/z;->a(LGf/C0;)LGf/x;

    move-result-object p1

    iput-object p1, p0, LT/e;->i:LGf/x;

    .line 10
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, p3, p2, p3}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    move-result-object v0

    iput-object v0, p0, LT/e;->j:LY/C0;

    .line 11
    invoke-static {p1, p3, p2, p3}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    move-result-object p1

    iput-object p1, p0, LT/e;->k:LY/C0;

    return-void
.end method

.method public synthetic constructor <init>(Lr0/f;FZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LT/e;-><init>(Lr0/f;FZ)V

    return-void
.end method

.method public static final synthetic a(LT/e;)Lw/a;
    .locals 0

    .line 1
    iget-object p0, p0, LT/e;->f:Lw/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(LT/e;)Lw/a;
    .locals 0

    .line 1
    iget-object p0, p0, LT/e;->h:Lw/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic c(LT/e;)Lw/a;
    .locals 0

    .line 1
    iget-object p0, p0, LT/e;->g:Lw/a;

    .line 2
    .line 3
    return-object p0
.end method

.method private final f(LZd/e;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, LT/e$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LT/e$b;-><init>(LT/e;LZd/e;)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p1}, LGf/P;->e(Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-ne p1, v0, :cond_0

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 19
    .line 20
    return-object p1
.end method

.method private final g(LZd/e;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, LT/e$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LT/e$c;-><init>(LT/e;LZd/e;)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p1}, LGf/P;->e(Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-ne p1, v0, :cond_0

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 19
    .line 20
    return-object p1
.end method

.method private final i()Z
    .locals 1

    .line 1
    iget-object v0, p0, LT/e;->k:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method private final j()Z
    .locals 1

    .line 1
    iget-object v0, p0, LT/e;->j:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method private final k(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LT/e;->k:LY/C0;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final l(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LT/e;->j:LY/C0;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final d(LZd/e;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, LT/e$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LT/e$a;

    .line 7
    .line 8
    iget v1, v0, LT/e$a;->d:I

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
    iput v1, v0, LT/e$a;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LT/e$a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, LT/e$a;-><init>(LT/e;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, LT/e$a;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LT/e$a;->d:I

    .line 32
    .line 33
    const/4 v3, 0x3

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    if-eq v2, v5, :cond_3

    .line 39
    .line 40
    if-eq v2, v4, :cond_2

    .line 41
    .line 42
    if-ne v2, v3, :cond_1

    .line 43
    .line 44
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_4

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    iget-object v2, v0, LT/e$a;->a:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v2, LT/e;

    .line 59
    .line 60
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    iget-object v2, v0, LT/e$a;->a:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v2, LT/e;

    .line 67
    .line 68
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_4
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iput-object p0, v0, LT/e$a;->a:Ljava/lang/Object;

    .line 76
    .line 77
    iput v5, v0, LT/e$a;->d:I

    .line 78
    .line 79
    invoke-direct {p0, v0}, LT/e;->f(LZd/e;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    if-ne p1, v1, :cond_5

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_5
    move-object v2, p0

    .line 87
    :goto_1
    invoke-direct {v2, v5}, LT/e;->l(Z)V

    .line 88
    .line 89
    .line 90
    iget-object p1, v2, LT/e;->i:LGf/x;

    .line 91
    .line 92
    iput-object v2, v0, LT/e$a;->a:Ljava/lang/Object;

    .line 93
    .line 94
    iput v4, v0, LT/e$a;->d:I

    .line 95
    .line 96
    invoke-interface {p1, v0}, LGf/W;->M0(LZd/e;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    if-ne p1, v1, :cond_6

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_6
    :goto_2
    const/4 p1, 0x0

    .line 104
    iput-object p1, v0, LT/e$a;->a:Ljava/lang/Object;

    .line 105
    .line 106
    iput v3, v0, LT/e$a;->d:I

    .line 107
    .line 108
    invoke-direct {v2, v0}, LT/e;->g(LZd/e;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    if-ne p1, v1, :cond_7

    .line 113
    .line 114
    :goto_3
    return-object v1

    .line 115
    :cond_7
    :goto_4
    sget-object p1, LTd/L;->a:LTd/L;

    .line 116
    .line 117
    return-object p1
.end method

.method public final e(Lu0/f;J)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LT/e;->d:Ljava/lang/Float;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-interface/range {p1 .. p1}, Lu0/f;->f()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    invoke-static {v1, v2}, LT/f;->b(J)F

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iput-object v1, v0, LT/e;->d:Ljava/lang/Float;

    .line 20
    .line 21
    :cond_0
    iget-object v1, v0, LT/e;->a:Lr0/f;

    .line 22
    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    invoke-interface/range {p1 .. p1}, Lu0/f;->t1()J

    .line 26
    .line 27
    .line 28
    move-result-wide v1

    .line 29
    invoke-static {v1, v2}, Lr0/f;->d(J)Lr0/f;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iput-object v1, v0, LT/e;->a:Lr0/f;

    .line 34
    .line 35
    :cond_1
    iget-object v1, v0, LT/e;->e:Lr0/f;

    .line 36
    .line 37
    if-nez v1, :cond_2

    .line 38
    .line 39
    invoke-interface/range {p1 .. p1}, Lu0/f;->f()J

    .line 40
    .line 41
    .line 42
    move-result-wide v1

    .line 43
    invoke-static {v1, v2}, Lr0/l;->i(J)F

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    const/high16 v2, 0x40000000    # 2.0f

    .line 48
    .line 49
    div-float/2addr v1, v2

    .line 50
    invoke-interface/range {p1 .. p1}, Lu0/f;->f()J

    .line 51
    .line 52
    .line 53
    move-result-wide v3

    .line 54
    invoke-static {v3, v4}, Lr0/l;->g(J)F

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    div-float/2addr v3, v2

    .line 59
    invoke-static {v1, v3}, Lr0/g;->a(FF)J

    .line 60
    .line 61
    .line 62
    move-result-wide v1

    .line 63
    invoke-static {v1, v2}, Lr0/f;->d(J)Lr0/f;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iput-object v1, v0, LT/e;->e:Lr0/f;

    .line 68
    .line 69
    :cond_2
    invoke-direct {v0}, LT/e;->i()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_3

    .line 74
    .line 75
    invoke-direct {v0}, LT/e;->j()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-nez v1, :cond_3

    .line 80
    .line 81
    const/high16 v1, 0x3f800000    # 1.0f

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    iget-object v1, v0, LT/e;->f:Lw/a;

    .line 85
    .line 86
    invoke-virtual {v1}, Lw/a;->m()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    check-cast v1, Ljava/lang/Number;

    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    :goto_0
    iget-object v2, v0, LT/e;->d:Ljava/lang/Float;

    .line 97
    .line 98
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    iget v3, v0, LT/e;->b:F

    .line 106
    .line 107
    iget-object v4, v0, LT/e;->g:Lw/a;

    .line 108
    .line 109
    invoke-virtual {v4}, Lw/a;->m()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    check-cast v4, Ljava/lang/Number;

    .line 114
    .line 115
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    invoke-static {v2, v3, v4}, Lk1/b;->b(FFF)F

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    iget-object v2, v0, LT/e;->a:Lr0/f;

    .line 124
    .line 125
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2}, Lr0/f;->u()J

    .line 129
    .line 130
    .line 131
    move-result-wide v2

    .line 132
    invoke-static {v2, v3}, Lr0/f;->m(J)F

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    iget-object v3, v0, LT/e;->e:Lr0/f;

    .line 137
    .line 138
    invoke-static {v3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v3}, Lr0/f;->u()J

    .line 142
    .line 143
    .line 144
    move-result-wide v3

    .line 145
    invoke-static {v3, v4}, Lr0/f;->m(J)F

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    iget-object v4, v0, LT/e;->h:Lw/a;

    .line 150
    .line 151
    invoke-virtual {v4}, Lw/a;->m()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    check-cast v4, Ljava/lang/Number;

    .line 156
    .line 157
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 158
    .line 159
    .line 160
    move-result v4

    .line 161
    invoke-static {v2, v3, v4}, Lk1/b;->b(FFF)F

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    iget-object v3, v0, LT/e;->a:Lr0/f;

    .line 166
    .line 167
    invoke-static {v3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v3}, Lr0/f;->u()J

    .line 171
    .line 172
    .line 173
    move-result-wide v3

    .line 174
    invoke-static {v3, v4}, Lr0/f;->n(J)F

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    iget-object v4, v0, LT/e;->e:Lr0/f;

    .line 179
    .line 180
    invoke-static {v4}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v4}, Lr0/f;->u()J

    .line 184
    .line 185
    .line 186
    move-result-wide v4

    .line 187
    invoke-static {v4, v5}, Lr0/f;->n(J)F

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    iget-object v5, v0, LT/e;->h:Lw/a;

    .line 192
    .line 193
    invoke-virtual {v5}, Lw/a;->m()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    check-cast v5, Ljava/lang/Number;

    .line 198
    .line 199
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    invoke-static {v3, v4, v5}, Lk1/b;->b(FFF)F

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    invoke-static {v2, v3}, Lr0/g;->a(FF)J

    .line 208
    .line 209
    .line 210
    move-result-wide v9

    .line 211
    invoke-static/range {p2 .. p3}, Ls0/r0;->t(J)F

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    mul-float v13, v2, v1

    .line 216
    .line 217
    const/16 v17, 0xe

    .line 218
    .line 219
    const/16 v18, 0x0

    .line 220
    .line 221
    const/4 v14, 0x0

    .line 222
    const/4 v15, 0x0

    .line 223
    const/16 v16, 0x0

    .line 224
    .line 225
    move-wide/from16 v11, p2

    .line 226
    .line 227
    invoke-static/range {v11 .. v18}, Ls0/r0;->q(JFFFFILjava/lang/Object;)J

    .line 228
    .line 229
    .line 230
    move-result-wide v6

    .line 231
    iget-boolean v1, v0, LT/e;->c:Z

    .line 232
    .line 233
    if-eqz v1, :cond_4

    .line 234
    .line 235
    invoke-interface/range {p1 .. p1}, Lu0/f;->f()J

    .line 236
    .line 237
    .line 238
    move-result-wide v1

    .line 239
    invoke-static {v1, v2}, Lr0/l;->i(J)F

    .line 240
    .line 241
    .line 242
    move-result v14

    .line 243
    invoke-interface/range {p1 .. p1}, Lu0/f;->f()J

    .line 244
    .line 245
    .line 246
    move-result-wide v1

    .line 247
    invoke-static {v1, v2}, Lr0/l;->g(J)F

    .line 248
    .line 249
    .line 250
    move-result v15

    .line 251
    sget-object v1, Ls0/q0;->a:Ls0/q0$a;

    .line 252
    .line 253
    invoke-virtual {v1}, Ls0/q0$a;->b()I

    .line 254
    .line 255
    .line 256
    move-result v16

    .line 257
    invoke-interface/range {p1 .. p1}, Lu0/f;->n1()Lu0/d;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    invoke-interface {v1}, Lu0/d;->f()J

    .line 262
    .line 263
    .line 264
    move-result-wide v2

    .line 265
    invoke-interface {v1}, Lu0/d;->b()Ls0/j0;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    invoke-interface {v4}, Ls0/j0;->p()V

    .line 270
    .line 271
    .line 272
    invoke-interface {v1}, Lu0/d;->a()Lu0/h;

    .line 273
    .line 274
    .line 275
    move-result-object v11

    .line 276
    const/4 v12, 0x0

    .line 277
    const/4 v13, 0x0

    .line 278
    invoke-interface/range {v11 .. v16}, Lu0/h;->c(FFFFI)V

    .line 279
    .line 280
    .line 281
    const/16 v15, 0x78

    .line 282
    .line 283
    const/16 v16, 0x0

    .line 284
    .line 285
    const/4 v11, 0x0

    .line 286
    const/4 v12, 0x0

    .line 287
    const/4 v13, 0x0

    .line 288
    const/4 v14, 0x0

    .line 289
    move-object/from16 v5, p1

    .line 290
    .line 291
    invoke-static/range {v5 .. v16}, Lu0/f;->e0(Lu0/f;JFJFLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    invoke-interface {v1}, Lu0/d;->b()Ls0/j0;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    invoke-interface {v4}, Ls0/j0;->k()V

    .line 299
    .line 300
    .line 301
    invoke-interface {v1, v2, v3}, Lu0/d;->e(J)V

    .line 302
    .line 303
    .line 304
    return-void

    .line 305
    :cond_4
    const/16 v15, 0x78

    .line 306
    .line 307
    const/16 v16, 0x0

    .line 308
    .line 309
    const/4 v11, 0x0

    .line 310
    const/4 v12, 0x0

    .line 311
    const/4 v13, 0x0

    .line 312
    const/4 v14, 0x0

    .line 313
    move-object/from16 v5, p1

    .line 314
    .line 315
    invoke-static/range {v5 .. v16}, Lu0/f;->e0(Lu0/f;JFJFLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    return-void
.end method

.method public final h()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, LT/e;->k(Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, LT/e;->i:LGf/x;

    .line 6
    .line 7
    sget-object v1, LTd/L;->a:LTd/L;

    .line 8
    .line 9
    invoke-interface {v0, v1}, LGf/x;->O(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method
