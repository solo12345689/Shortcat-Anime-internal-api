.class public final Ld1/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LU0/y;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LU0/Y0;

.field private final c:Ljava/util/List;

.field private final d:Ljava/util/List;

.field private final e:LY0/u$b;

.field private final f:Li1/d;

.field private final g:Ld1/i;

.field private final h:Ljava/lang/CharSequence;

.field private final i:LV0/O;

.field private j:Ld1/v;

.field private final k:Z

.field private final l:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LU0/Y0;Ljava/util/List;Ljava/util/List;LY0/u$b;Li1/d;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld1/e;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Ld1/e;->b:LU0/Y0;

    .line 7
    .line 8
    iput-object p3, p0, Ld1/e;->c:Ljava/util/List;

    .line 9
    .line 10
    iput-object p4, p0, Ld1/e;->d:Ljava/util/List;

    .line 11
    .line 12
    iput-object p5, p0, Ld1/e;->e:LY0/u$b;

    .line 13
    .line 14
    iput-object p6, p0, Ld1/e;->f:Li1/d;

    .line 15
    .line 16
    new-instance p1, Ld1/i;

    .line 17
    .line 18
    invoke-interface {p6}, Li1/d;->getDensity()F

    .line 19
    .line 20
    .line 21
    move-result p4

    .line 22
    const/4 p5, 0x1

    .line 23
    invoke-direct {p1, p5, p4}, Ld1/i;-><init>(IF)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Ld1/e;->g:Ld1/i;

    .line 27
    .line 28
    invoke-static {p2}, Ld1/f;->b(LU0/Y0;)Z

    .line 29
    .line 30
    .line 31
    move-result p4

    .line 32
    const/4 v0, 0x0

    .line 33
    if-nez p4, :cond_0

    .line 34
    .line 35
    move p4, v0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    sget-object p4, Ld1/q;->a:Ld1/q;

    .line 38
    .line 39
    invoke-virtual {p4}, Ld1/q;->a()LY/h2;

    .line 40
    .line 41
    .line 42
    move-result-object p4

    .line 43
    invoke-interface {p4}, LY/h2;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p4

    .line 47
    check-cast p4, Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result p4

    .line 53
    :goto_0
    iput-boolean p4, p0, Ld1/e;->k:Z

    .line 54
    .line 55
    invoke-virtual {p2}, LU0/Y0;->D()I

    .line 56
    .line 57
    .line 58
    move-result p4

    .line 59
    invoke-virtual {p2}, LU0/Y0;->w()Lc1/e;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-static {p4, v1}, Ld1/f;->d(ILc1/e;)I

    .line 64
    .line 65
    .line 66
    move-result p4

    .line 67
    iput p4, p0, Ld1/e;->l:I

    .line 68
    .line 69
    new-instance v7, Ld1/d;

    .line 70
    .line 71
    invoke-direct {v7, p0}, Ld1/d;-><init>(Ld1/e;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2}, LU0/Y0;->G()Lg1/u;

    .line 75
    .line 76
    .line 77
    move-result-object p4

    .line 78
    invoke-static {p1, p4}, Le1/e;->e(Ld1/i;Lg1/u;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2}, LU0/Y0;->O()LU0/I0;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    invoke-interface {p3}, Ljava/util/Collection;->size()I

    .line 86
    .line 87
    .line 88
    move-result p4

    .line 89
    move v1, v0

    .line 90
    :goto_1
    if-ge v1, p4, :cond_2

    .line 91
    .line 92
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    move-object v3, v2

    .line 97
    check-cast v3, LU0/e$d;

    .line 98
    .line 99
    invoke-virtual {v3}, LU0/e$d;->g()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    instance-of v3, v3, LU0/I0;

    .line 104
    .line 105
    if-eqz v3, :cond_1

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_2
    const/4 v2, 0x0

    .line 112
    :goto_2
    if-eqz v2, :cond_3

    .line 113
    .line 114
    move p3, p5

    .line 115
    goto :goto_3

    .line 116
    :cond_3
    move p3, v0

    .line 117
    :goto_3
    invoke-static {p1, p2, v7, p6, p3}, Le1/e;->a(Ld1/i;LU0/I0;Lie/p;Li1/d;Z)LU0/I0;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    if-eqz p1, :cond_6

    .line 122
    .line 123
    iget-object p2, p0, Ld1/e;->c:Ljava/util/List;

    .line 124
    .line 125
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    add-int/2addr p2, p5

    .line 130
    new-instance p3, Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-direct {p3, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 133
    .line 134
    .line 135
    move p4, v0

    .line 136
    :goto_4
    if-ge p4, p2, :cond_5

    .line 137
    .line 138
    if-nez p4, :cond_4

    .line 139
    .line 140
    new-instance p5, LU0/e$d;

    .line 141
    .line 142
    iget-object p6, p0, Ld1/e;->a:Ljava/lang/String;

    .line 143
    .line 144
    invoke-virtual {p6}, Ljava/lang/String;->length()I

    .line 145
    .line 146
    .line 147
    move-result p6

    .line 148
    invoke-direct {p5, p1, v0, p6}, LU0/e$d;-><init>(Ljava/lang/Object;II)V

    .line 149
    .line 150
    .line 151
    goto :goto_5

    .line 152
    :cond_4
    iget-object p5, p0, Ld1/e;->c:Ljava/util/List;

    .line 153
    .line 154
    add-int/lit8 p6, p4, -0x1

    .line 155
    .line 156
    invoke-interface {p5, p6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p5

    .line 160
    check-cast p5, LU0/e$d;

    .line 161
    .line 162
    :goto_5
    invoke-virtual {p3, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    add-int/lit8 p4, p4, 0x1

    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_5
    :goto_6
    move-object v4, p3

    .line 169
    goto :goto_7

    .line 170
    :cond_6
    iget-object p3, p0, Ld1/e;->c:Ljava/util/List;

    .line 171
    .line 172
    goto :goto_6

    .line 173
    :goto_7
    iget-object v1, p0, Ld1/e;->a:Ljava/lang/String;

    .line 174
    .line 175
    iget-object p1, p0, Ld1/e;->g:Ld1/i;

    .line 176
    .line 177
    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    iget-object v3, p0, Ld1/e;->b:LU0/Y0;

    .line 182
    .line 183
    iget-object v5, p0, Ld1/e;->d:Ljava/util/List;

    .line 184
    .line 185
    iget-object v6, p0, Ld1/e;->f:Li1/d;

    .line 186
    .line 187
    iget-boolean v8, p0, Ld1/e;->k:Z

    .line 188
    .line 189
    invoke-static/range {v1 .. v8}, Ld1/c;->a(Ljava/lang/String;FLU0/Y0;Ljava/util/List;Ljava/util/List;Li1/d;Lie/p;Z)Ljava/lang/CharSequence;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    iput-object p1, p0, Ld1/e;->h:Ljava/lang/CharSequence;

    .line 194
    .line 195
    new-instance p2, LV0/O;

    .line 196
    .line 197
    iget-object p3, p0, Ld1/e;->g:Ld1/i;

    .line 198
    .line 199
    iget p4, p0, Ld1/e;->l:I

    .line 200
    .line 201
    invoke-direct {p2, p1, p3, p4}, LV0/O;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V

    .line 202
    .line 203
    .line 204
    iput-object p2, p0, Ld1/e;->i:LV0/O;

    .line 205
    .line 206
    return-void
.end method

.method public static synthetic b(Ld1/e;LY0/u;LY0/L;LY0/H;LY0/I;)Landroid/graphics/Typeface;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Ld1/e;->c(Ld1/e;LY0/u;LY0/L;LY0/H;LY0/I;)Landroid/graphics/Typeface;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final c(Ld1/e;LY0/u;LY0/L;LY0/H;LY0/I;)Landroid/graphics/Typeface;
    .locals 1

    .line 1
    iget-object v0, p0, Ld1/e;->e:LY0/u$b;

    .line 2
    .line 3
    invoke-virtual {p3}, LY0/H;->i()I

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    invoke-virtual {p4}, LY0/I;->m()I

    .line 8
    .line 9
    .line 10
    move-result p4

    .line 11
    invoke-interface {v0, p1, p2, p3, p4}, LY0/u$b;->b(LY0/u;LY0/L;II)LY/h2;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    instance-of p2, p1, LY0/t0$b;

    .line 16
    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    new-instance p2, Ld1/v;

    .line 20
    .line 21
    iget-object p3, p0, Ld1/e;->j:Ld1/v;

    .line 22
    .line 23
    invoke-direct {p2, p1, p3}, Ld1/v;-><init>(LY/h2;Ld1/v;)V

    .line 24
    .line 25
    .line 26
    iput-object p2, p0, Ld1/e;->j:Ld1/v;

    .line 27
    .line 28
    invoke-virtual {p2}, Ld1/v;->a()Landroid/graphics/Typeface;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_0
    check-cast p1, LY0/t0$b;

    .line 34
    .line 35
    invoke-virtual {p1}, LY0/t0$b;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const-string p1, "null cannot be cast to non-null type android.graphics.Typeface"

    .line 40
    .line 41
    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    check-cast p0, Landroid/graphics/Typeface;

    .line 45
    .line 46
    return-object p0
.end method


# virtual methods
.method public a()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ld1/e;->j:Ld1/v;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Ld1/v;->b()Z

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
    iget-boolean v0, p0, Ld1/e;->k:Z

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Ld1/e;->b:LU0/Y0;

    .line 19
    .line 20
    invoke-static {v0}, Ld1/f;->b(LU0/Y0;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    sget-object v0, Ld1/q;->a:Ld1/q;

    .line 27
    .line 28
    invoke-virtual {v0}, Ld1/q;->a()LY/h2;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    return v1

    .line 46
    :cond_2
    :goto_1
    const/4 v0, 0x1

    .line 47
    return v0
.end method

.method public d()F
    .locals 1

    .line 1
    iget-object v0, p0, Ld1/e;->i:LV0/O;

    .line 2
    .line 3
    invoke-virtual {v0}, LV0/O;->i()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final e()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Ld1/e;->h:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()F
    .locals 1

    .line 1
    iget-object v0, p0, Ld1/e;->i:LV0/O;

    .line 2
    .line 3
    invoke-virtual {v0}, LV0/O;->j()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final g()LV0/O;
    .locals 1

    .line 1
    iget-object v0, p0, Ld1/e;->i:LV0/O;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()LU0/Y0;
    .locals 1

    .line 1
    iget-object v0, p0, Ld1/e;->b:LU0/Y0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()I
    .locals 1

    .line 1
    iget v0, p0, Ld1/e;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public final j()Ld1/i;
    .locals 1

    .line 1
    iget-object v0, p0, Ld1/e;->g:Ld1/i;

    .line 2
    .line 3
    return-object v0
.end method
