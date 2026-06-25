.class public final LP/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private a:Ljava/lang/String;

.field private b:LU0/Y0;

.field private c:LY0/u$b;

.field private d:I

.field private e:Z

.field private f:I

.field private g:I

.field private h:J

.field private i:Li1/d;

.field private j:LU0/v;

.field private k:Z

.field private l:J

.field private m:LP/c;

.field private n:LU0/y;

.field private o:Li1/t;

.field private p:J

.field private q:I

.field private r:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;LU0/Y0;LY0/u$b;IZII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LP/f;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, LP/f;->b:LU0/Y0;

    .line 5
    iput-object p3, p0, LP/f;->c:LY0/u$b;

    .line 6
    iput p4, p0, LP/f;->d:I

    .line 7
    iput-boolean p5, p0, LP/f;->e:Z

    .line 8
    iput p6, p0, LP/f;->f:I

    .line 9
    iput p7, p0, LP/f;->g:I

    .line 10
    sget-object p1, LP/a;->a:LP/a$a;

    invoke-virtual {p1}, LP/a$a;->a()J

    move-result-wide p1

    iput-wide p1, p0, LP/f;->h:J

    const/4 p1, 0x0

    .line 11
    invoke-static {p1, p1}, Li1/s;->a(II)J

    move-result-wide p2

    iput-wide p2, p0, LP/f;->l:J

    .line 12
    sget-object p2, Li1/b;->b:Li1/b$a;

    invoke-virtual {p2, p1, p1}, Li1/b$a;->c(II)J

    move-result-wide p1

    iput-wide p1, p0, LP/f;->p:J

    const/4 p1, -0x1

    .line 13
    iput p1, p0, LP/f;->q:I

    .line 14
    iput p1, p0, LP/f;->r:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;LU0/Y0;LY0/u$b;IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, LP/f;-><init>(Ljava/lang/String;LU0/Y0;LY0/u$b;IZII)V

    return-void
.end method

.method private final g(JLi1/t;)LU0/v;
    .locals 3

    .line 1
    invoke-direct {p0, p3}, LP/f;->n(Li1/t;)LU0/y;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    iget-boolean v0, p0, LP/f;->e:Z

    .line 6
    .line 7
    iget v1, p0, LP/f;->d:I

    .line 8
    .line 9
    invoke-interface {p3}, LU0/y;->d()F

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {p1, p2, v0, v1, v2}, LP/b;->a(JZIF)J

    .line 14
    .line 15
    .line 16
    move-result-wide p1

    .line 17
    iget-boolean v0, p0, LP/f;->e:Z

    .line 18
    .line 19
    iget v1, p0, LP/f;->d:I

    .line 20
    .line 21
    iget v2, p0, LP/f;->f:I

    .line 22
    .line 23
    invoke-static {v0, v1, v2}, LP/b;->b(ZII)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget v1, p0, LP/f;->d:I

    .line 28
    .line 29
    sget-object v2, Lg1/v;->a:Lg1/v$a;

    .line 30
    .line 31
    invoke-virtual {v2}, Lg1/v$a;->b()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-static {v1, v2}, Lg1/v;->g(II)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-static {p3, p1, p2, v0, v1}, LU0/A;->c(LU0/y;JIZ)LU0/v;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1
.end method

.method private final i()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LP/f;->j:LU0/v;

    .line 3
    .line 4
    iput-object v0, p0, LP/f;->n:LU0/y;

    .line 5
    .line 6
    iput-object v0, p0, LP/f;->o:Li1/t;

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    iput v0, p0, LP/f;->q:I

    .line 10
    .line 11
    iput v0, p0, LP/f;->r:I

    .line 12
    .line 13
    sget-object v0, Li1/b;->b:Li1/b$a;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, v1, v1}, Li1/b$a;->c(II)J

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    iput-wide v2, p0, LP/f;->p:J

    .line 21
    .line 22
    invoke-static {v1, v1}, Li1/s;->a(II)J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    iput-wide v2, p0, LP/f;->l:J

    .line 27
    .line 28
    iput-boolean v1, p0, LP/f;->k:Z

    .line 29
    .line 30
    return-void
.end method

.method private final l(JLi1/t;)Z
    .locals 5

    .line 1
    iget-object v0, p0, LP/f;->j:LU0/v;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v2, p0, LP/f;->n:LU0/y;

    .line 8
    .line 9
    if-nez v2, :cond_1

    .line 10
    .line 11
    return v1

    .line 12
    :cond_1
    invoke-interface {v2}, LU0/y;->a()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    return v1

    .line 19
    :cond_2
    iget-object v2, p0, LP/f;->o:Li1/t;

    .line 20
    .line 21
    if-eq p3, v2, :cond_3

    .line 22
    .line 23
    return v1

    .line 24
    :cond_3
    iget-wide v2, p0, LP/f;->p:J

    .line 25
    .line 26
    invoke-static {p1, p2, v2, v3}, Li1/b;->f(JJ)Z

    .line 27
    .line 28
    .line 29
    move-result p3

    .line 30
    const/4 v2, 0x0

    .line 31
    if-eqz p3, :cond_4

    .line 32
    .line 33
    return v2

    .line 34
    :cond_4
    invoke-static {p1, p2}, Li1/b;->l(J)I

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    iget-wide v3, p0, LP/f;->p:J

    .line 39
    .line 40
    invoke-static {v3, v4}, Li1/b;->l(J)I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eq p3, v3, :cond_5

    .line 45
    .line 46
    return v1

    .line 47
    :cond_5
    invoke-static {p1, p2}, Li1/b;->k(J)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    int-to-float p1, p1

    .line 52
    invoke-interface {v0}, LU0/v;->getHeight()F

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    cmpg-float p1, p1, p2

    .line 57
    .line 58
    if-ltz p1, :cond_7

    .line 59
    .line 60
    invoke-interface {v0}, LU0/v;->r()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_6

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_6
    return v2

    .line 68
    :cond_7
    :goto_0
    return v1
.end method

.method private final n(Li1/t;)LU0/y;
    .locals 10

    .line 1
    iget-object v0, p0, LP/f;->n:LU0/y;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, LP/f;->o:Li1/t;

    .line 6
    .line 7
    if-ne p1, v1, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, LU0/y;->a()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    :cond_0
    iput-object p1, p0, LP/f;->o:Li1/t;

    .line 16
    .line 17
    iget-object v2, p0, LP/f;->a:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v0, p0, LP/f;->b:LU0/Y0;

    .line 20
    .line 21
    invoke-static {v0, p1}, LU0/Z0;->d(LU0/Y0;Li1/t;)LU0/Y0;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-object v6, p0, LP/f;->i:Li1/d;

    .line 26
    .line 27
    invoke-static {v6}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object v7, p0, LP/f;->c:LY0/u$b;

    .line 31
    .line 32
    const/16 v8, 0xc

    .line 33
    .line 34
    const/4 v9, 0x0

    .line 35
    const/4 v4, 0x0

    .line 36
    const/4 v5, 0x0

    .line 37
    invoke-static/range {v2 .. v9}, LU0/z;->c(Ljava/lang/String;LU0/Y0;Ljava/util/List;Ljava/util/List;Li1/d;LY0/u$b;ILjava/lang/Object;)LU0/y;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :cond_1
    iput-object v0, p0, LP/f;->n:LU0/y;

    .line 42
    .line 43
    return-object v0
.end method


# virtual methods
.method public final a()Li1/d;
    .locals 1

    .line 1
    iget-object v0, p0, LP/f;->i:Li1/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LP/f;->k:Z

    .line 2
    .line 3
    return v0
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-wide v0, p0, LP/f;->l:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final d()LTd/L;
    .locals 1

    .line 1
    iget-object v0, p0, LP/f;->n:LU0/y;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, LU0/y;->a()Z

    .line 6
    .line 7
    .line 8
    :cond_0
    sget-object v0, LTd/L;->a:LTd/L;

    .line 9
    .line 10
    return-object v0
.end method

.method public final e()LU0/v;
    .locals 1

    .line 1
    iget-object v0, p0, LP/f;->j:LU0/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f(ILi1/t;)I
    .locals 3

    .line 1
    iget v0, p0, LP/f;->q:I

    .line 2
    .line 3
    iget v1, p0, LP/f;->r:I

    .line 4
    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    const/4 v2, -0x1

    .line 8
    if-eq v0, v2, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const v0, 0x7fffffff

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-static {v1, p1, v1, v0}, Li1/c;->a(IIII)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    invoke-direct {p0, v0, v1, p2}, LP/f;->g(JLi1/t;)LU0/v;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-interface {p2}, LU0/v;->getHeight()F

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    invoke-static {p2}, LK/I;->a(F)I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    iput p1, p0, LP/f;->q:I

    .line 32
    .line 33
    iput p2, p0, LP/f;->r:I

    .line 34
    .line 35
    return p2
.end method

.method public final h(JLi1/t;)Z
    .locals 8

    .line 1
    iget v0, p0, LP/f;->g:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-le v0, v1, :cond_0

    .line 5
    .line 6
    sget-object v2, LP/c;->h:LP/c$a;

    .line 7
    .line 8
    iget-object v3, p0, LP/f;->m:LP/c;

    .line 9
    .line 10
    iget-object v5, p0, LP/f;->b:LU0/Y0;

    .line 11
    .line 12
    iget-object v6, p0, LP/f;->i:Li1/d;

    .line 13
    .line 14
    invoke-static {v6}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v7, p0, LP/f;->c:LY0/u$b;

    .line 18
    .line 19
    move-object v4, p3

    .line 20
    invoke-virtual/range {v2 .. v7}, LP/c$a;->a(LP/c;Li1/t;LU0/Y0;Li1/d;LY0/u$b;)LP/c;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    iput-object p3, p0, LP/f;->m:LP/c;

    .line 25
    .line 26
    iget v0, p0, LP/f;->g:I

    .line 27
    .line 28
    invoke-virtual {p3, p1, p2, v0}, LP/c;->c(JI)J

    .line 29
    .line 30
    .line 31
    move-result-wide p1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v4, p3

    .line 34
    :goto_0
    invoke-direct {p0, p1, p2, v4}, LP/f;->l(JLi1/t;)Z

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    const/4 v0, 0x0

    .line 39
    if-nez p3, :cond_4

    .line 40
    .line 41
    iget-wide v2, p0, LP/f;->p:J

    .line 42
    .line 43
    invoke-static {p1, p2, v2, v3}, Li1/b;->f(JJ)Z

    .line 44
    .line 45
    .line 46
    move-result p3

    .line 47
    if-nez p3, :cond_3

    .line 48
    .line 49
    iget-object p3, p0, LP/f;->j:LU0/v;

    .line 50
    .line 51
    invoke-static {p3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {p3}, LU0/v;->d()F

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    invoke-interface {p3}, LU0/v;->getWidth()F

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-static {v2}, LK/I;->a(F)I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-interface {p3}, LU0/v;->getHeight()F

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    invoke-static {v3}, LK/I;->a(F)I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    invoke-static {v2, v3}, Li1/s;->a(II)J

    .line 79
    .line 80
    .line 81
    move-result-wide v2

    .line 82
    invoke-static {p1, p2, v2, v3}, Li1/c;->d(JJ)J

    .line 83
    .line 84
    .line 85
    move-result-wide v2

    .line 86
    iput-wide v2, p0, LP/f;->l:J

    .line 87
    .line 88
    iget v4, p0, LP/f;->d:I

    .line 89
    .line 90
    sget-object v5, Lg1/v;->a:Lg1/v$a;

    .line 91
    .line 92
    invoke-virtual {v5}, Lg1/v$a;->e()I

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    invoke-static {v4, v5}, Lg1/v;->g(II)Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-nez v4, :cond_1

    .line 101
    .line 102
    invoke-static {v2, v3}, Li1/r;->g(J)I

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    int-to-float v4, v4

    .line 107
    invoke-interface {p3}, LU0/v;->getWidth()F

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    cmpg-float v4, v4, v5

    .line 112
    .line 113
    if-ltz v4, :cond_2

    .line 114
    .line 115
    invoke-static {v2, v3}, Li1/r;->f(J)I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    int-to-float v2, v2

    .line 120
    invoke-interface {p3}, LU0/v;->getHeight()F

    .line 121
    .line 122
    .line 123
    move-result p3

    .line 124
    cmpg-float p3, v2, p3

    .line 125
    .line 126
    if-gez p3, :cond_1

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_1
    move v1, v0

    .line 130
    :cond_2
    :goto_1
    iput-boolean v1, p0, LP/f;->k:Z

    .line 131
    .line 132
    iput-wide p1, p0, LP/f;->p:J

    .line 133
    .line 134
    :cond_3
    return v0

    .line 135
    :cond_4
    invoke-direct {p0, p1, p2, v4}, LP/f;->g(JLi1/t;)LU0/v;

    .line 136
    .line 137
    .line 138
    move-result-object p3

    .line 139
    iput-wide p1, p0, LP/f;->p:J

    .line 140
    .line 141
    invoke-interface {p3}, LU0/v;->getWidth()F

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    invoke-static {v2}, LK/I;->a(F)I

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    invoke-interface {p3}, LU0/v;->getHeight()F

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    invoke-static {v3}, LK/I;->a(F)I

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    invoke-static {v2, v3}, Li1/s;->a(II)J

    .line 158
    .line 159
    .line 160
    move-result-wide v2

    .line 161
    invoke-static {p1, p2, v2, v3}, Li1/c;->d(JJ)J

    .line 162
    .line 163
    .line 164
    move-result-wide p1

    .line 165
    iput-wide p1, p0, LP/f;->l:J

    .line 166
    .line 167
    iget v2, p0, LP/f;->d:I

    .line 168
    .line 169
    sget-object v3, Lg1/v;->a:Lg1/v$a;

    .line 170
    .line 171
    invoke-virtual {v3}, Lg1/v$a;->e()I

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    invoke-static {v2, v3}, Lg1/v;->g(II)Z

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    if-nez v2, :cond_6

    .line 180
    .line 181
    invoke-static {p1, p2}, Li1/r;->g(J)I

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    int-to-float v2, v2

    .line 186
    invoke-interface {p3}, LU0/v;->getWidth()F

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    cmpg-float v2, v2, v3

    .line 191
    .line 192
    if-ltz v2, :cond_5

    .line 193
    .line 194
    invoke-static {p1, p2}, Li1/r;->f(J)I

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    int-to-float p1, p1

    .line 199
    invoke-interface {p3}, LU0/v;->getHeight()F

    .line 200
    .line 201
    .line 202
    move-result p2

    .line 203
    cmpg-float p1, p1, p2

    .line 204
    .line 205
    if-gez p1, :cond_6

    .line 206
    .line 207
    :cond_5
    move v0, v1

    .line 208
    :cond_6
    iput-boolean v0, p0, LP/f;->k:Z

    .line 209
    .line 210
    iput-object p3, p0, LP/f;->j:LU0/v;

    .line 211
    .line 212
    return v1
.end method

.method public final j(Li1/t;)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LP/f;->n(Li1/t;)LU0/y;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, LU0/y;->d()F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {p1}, LK/I;->a(F)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final k(Li1/t;)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LP/f;->n(Li1/t;)LU0/y;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, LU0/y;->f()F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {p1}, LK/I;->a(F)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final m(Li1/d;)V
    .locals 5

    .line 1
    iget-object v0, p0, LP/f;->i:Li1/d;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, LP/a;->d(Li1/d;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object v1, LP/a;->a:LP/a$a;

    .line 11
    .line 12
    invoke-virtual {v1}, LP/a$a;->a()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    :goto_0
    if-nez v0, :cond_1

    .line 17
    .line 18
    iput-object p1, p0, LP/f;->i:Li1/d;

    .line 19
    .line 20
    iput-wide v1, p0, LP/f;->h:J

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    if-eqz p1, :cond_3

    .line 24
    .line 25
    iget-wide v3, p0, LP/f;->h:J

    .line 26
    .line 27
    invoke-static {v3, v4, v1, v2}, LP/a;->e(JJ)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    return-void

    .line 35
    :cond_3
    :goto_1
    iput-object p1, p0, LP/f;->i:Li1/d;

    .line 36
    .line 37
    iput-wide v1, p0, LP/f;->h:J

    .line 38
    .line 39
    invoke-direct {p0}, LP/f;->i()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final o(LU0/Y0;)LU0/T0;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v9, v0, LP/f;->o:Li1/t;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v9, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    iget-object v6, v0, LP/f;->i:Li1/d;

    .line 10
    .line 11
    if-nez v6, :cond_1

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_1
    new-instance v2, LU0/e;

    .line 15
    .line 16
    iget-object v11, v0, LP/f;->a:Ljava/lang/String;

    .line 17
    .line 18
    const/4 v14, 0x6

    .line 19
    const/4 v15, 0x0

    .line 20
    const/4 v12, 0x0

    .line 21
    const/4 v13, 0x0

    .line 22
    move-object v10, v2

    .line 23
    invoke-direct/range {v10 .. v15}, LU0/e;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 24
    .line 25
    .line 26
    iget-object v3, v0, LP/f;->j:LU0/v;

    .line 27
    .line 28
    if-nez v3, :cond_2

    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_2
    iget-object v3, v0, LP/f;->n:LU0/y;

    .line 32
    .line 33
    if-nez v3, :cond_3

    .line 34
    .line 35
    return-object v1

    .line 36
    :cond_3
    iget-wide v10, v0, LP/f;->p:J

    .line 37
    .line 38
    const/16 v16, 0xa

    .line 39
    .line 40
    const/16 v17, 0x0

    .line 41
    .line 42
    const/4 v12, 0x0

    .line 43
    const/4 v13, 0x0

    .line 44
    const/4 v14, 0x0

    .line 45
    const/4 v15, 0x0

    .line 46
    invoke-static/range {v10 .. v17}, Li1/b;->d(JIIIIILjava/lang/Object;)J

    .line 47
    .line 48
    .line 49
    move-result-wide v20

    .line 50
    new-instance v14, LU0/T0;

    .line 51
    .line 52
    new-instance v1, LU0/S0;

    .line 53
    .line 54
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    iget v5, v0, LP/f;->f:I

    .line 59
    .line 60
    move-object v8, v6

    .line 61
    iget-boolean v6, v0, LP/f;->e:Z

    .line 62
    .line 63
    iget v7, v0, LP/f;->d:I

    .line 64
    .line 65
    iget-object v10, v0, LP/f;->c:LY0/u$b;

    .line 66
    .line 67
    const/4 v13, 0x0

    .line 68
    move-object/from16 v3, p1

    .line 69
    .line 70
    move-wide/from16 v11, v20

    .line 71
    .line 72
    invoke-direct/range {v1 .. v13}, LU0/S0;-><init>(LU0/e;LU0/Y0;Ljava/util/List;IZILi1/d;Li1/t;LY0/u$b;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 73
    .line 74
    .line 75
    new-instance v18, LU0/n;

    .line 76
    .line 77
    new-instance v19, LU0/q;

    .line 78
    .line 79
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    iget-object v7, v0, LP/f;->c:LY0/u$b;

    .line 84
    .line 85
    move-object/from16 v4, p1

    .line 86
    .line 87
    move-object v3, v2

    .line 88
    move-object v6, v8

    .line 89
    move-object/from16 v2, v19

    .line 90
    .line 91
    invoke-direct/range {v2 .. v7}, LU0/q;-><init>(LU0/e;LU0/Y0;Ljava/util/List;Li1/d;LY0/u$b;)V

    .line 92
    .line 93
    .line 94
    iget v3, v0, LP/f;->f:I

    .line 95
    .line 96
    iget v4, v0, LP/f;->d:I

    .line 97
    .line 98
    sget-object v5, Lg1/v;->a:Lg1/v$a;

    .line 99
    .line 100
    invoke-virtual {v5}, Lg1/v$a;->b()I

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    invoke-static {v4, v5}, Lg1/v;->g(II)Z

    .line 105
    .line 106
    .line 107
    move-result v23

    .line 108
    const/16 v24, 0x0

    .line 109
    .line 110
    move/from16 v22, v3

    .line 111
    .line 112
    invoke-direct/range {v18 .. v24}, LU0/n;-><init>(LU0/q;JIZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 113
    .line 114
    .line 115
    move-object v10, v14

    .line 116
    iget-wide v13, v0, LP/f;->l:J

    .line 117
    .line 118
    const/4 v15, 0x0

    .line 119
    move-object v11, v1

    .line 120
    move-object/from16 v12, v18

    .line 121
    .line 122
    invoke-direct/range {v10 .. v15}, LU0/T0;-><init>(LU0/S0;LU0/n;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 123
    .line 124
    .line 125
    return-object v10
.end method

.method public final p(Ljava/lang/String;LU0/Y0;LY0/u$b;IZII)V
    .locals 0

    .line 1
    iput-object p1, p0, LP/f;->a:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, LP/f;->b:LU0/Y0;

    .line 4
    .line 5
    iput-object p3, p0, LP/f;->c:LY0/u$b;

    .line 6
    .line 7
    iput p4, p0, LP/f;->d:I

    .line 8
    .line 9
    iput-boolean p5, p0, LP/f;->e:Z

    .line 10
    .line 11
    iput p6, p0, LP/f;->f:I

    .line 12
    .line 13
    iput p7, p0, LP/f;->g:I

    .line 14
    .line 15
    invoke-direct {p0}, LP/f;->i()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "ParagraphLayoutCache(paragraph="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LP/f;->j:LU0/v;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const-string v1, "<paragraph>"

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string v1, "null"

    .line 19
    .line 20
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", lastDensity="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-wide v1, p0, LP/f;->h:J

    .line 29
    .line 30
    invoke-static {v1, v2}, LP/a;->h(J)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const/16 v1, 0x29

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0
.end method
