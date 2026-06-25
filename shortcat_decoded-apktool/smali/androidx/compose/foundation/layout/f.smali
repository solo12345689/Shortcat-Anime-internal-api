.class public abstract Landroidx/compose/foundation/layout/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Ljava/util/HashMap;

.field private static final b:Ljava/util/HashMap;

.field private static final c:LI0/B;

.field private static final d:LI0/B;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Landroidx/compose/foundation/layout/f;->d(Z)Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sput-object v0, Landroidx/compose/foundation/layout/f;->a:Ljava/util/HashMap;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {v0}, Landroidx/compose/foundation/layout/f;->d(Z)Ljava/util/HashMap;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sput-object v1, Landroidx/compose/foundation/layout/f;->b:Ljava/util/HashMap;

    .line 14
    .line 15
    new-instance v1, Landroidx/compose/foundation/layout/g;

    .line 16
    .line 17
    sget-object v2, Ll0/e;->a:Ll0/e$a;

    .line 18
    .line 19
    invoke-virtual {v2}, Ll0/e$a;->o()Ll0/e;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-direct {v1, v2, v0}, Landroidx/compose/foundation/layout/g;-><init>(Ll0/e;Z)V

    .line 24
    .line 25
    .line 26
    sput-object v1, Landroidx/compose/foundation/layout/f;->c:LI0/B;

    .line 27
    .line 28
    sget-object v0, Landroidx/compose/foundation/layout/f$b;->a:Landroidx/compose/foundation/layout/f$b;

    .line 29
    .line 30
    sput-object v0, Landroidx/compose/foundation/layout/f;->d:LI0/B;

    .line 31
    .line 32
    return-void
.end method

.method public static final a(Landroidx/compose/ui/e;LY/m;I)V
    .locals 7

    .line 1
    const v0, -0xc96ce69

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    and-int/lit8 v1, p2, 0x6

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    invoke-interface {p1, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v1, v2

    .line 22
    :goto_0
    or-int/2addr v1, p2

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v1, p2

    .line 25
    :goto_1
    and-int/lit8 v3, v1, 0x3

    .line 26
    .line 27
    if-ne v3, v2, :cond_3

    .line 28
    .line 29
    invoke-interface {p1}, LY/m;->i()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_2

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    invoke-interface {p1}, LY/m;->K()V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_4

    .line 40
    .line 41
    :cond_3
    :goto_2
    invoke-static {}, LY/w;->L()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_4

    .line 46
    .line 47
    const/4 v2, -0x1

    .line 48
    const-string v3, "androidx.compose.foundation.layout.Box (Box.kt:236)"

    .line 49
    .line 50
    invoke-static {v0, v1, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_4
    sget-object v0, Landroidx/compose/foundation/layout/f;->d:LI0/B;

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    invoke-static {p1, v1}, LY/h;->a(LY/m;I)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    invoke-static {p1, p0}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-interface {p1}, LY/m;->r()LY/I;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    sget-object v4, LK0/g;->M:LK0/g$a;

    .line 69
    .line 70
    invoke-virtual {v4}, LK0/g$a;->a()Lie/a;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-interface {p1}, LY/m;->j()LY/d;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    if-nez v6, :cond_5

    .line 79
    .line 80
    invoke-static {}, LY/h;->d()V

    .line 81
    .line 82
    .line 83
    :cond_5
    invoke-interface {p1}, LY/m;->I()V

    .line 84
    .line 85
    .line 86
    invoke-interface {p1}, LY/m;->e()Z

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-eqz v6, :cond_6

    .line 91
    .line 92
    invoke-interface {p1, v5}, LY/m;->h(Lie/a;)V

    .line 93
    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_6
    invoke-interface {p1}, LY/m;->s()V

    .line 97
    .line 98
    .line 99
    :goto_3
    invoke-static {p1}, LY/m2;->b(LY/m;)LY/m;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-virtual {v4}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    invoke-static {v5, v0, v6}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-static {v5, v3, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v4}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-static {v5, v2, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v4}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-interface {v5}, LY/m;->e()Z

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    if-nez v2, :cond_7

    .line 133
    .line 134
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-nez v2, :cond_8

    .line 147
    .line 148
    :cond_7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-interface {v5, v2}, LY/m;->u(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-interface {v5, v1, v0}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 160
    .line 161
    .line 162
    :cond_8
    invoke-interface {p1}, LY/m;->x()V

    .line 163
    .line 164
    .line 165
    invoke-static {}, LY/w;->L()Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eqz v0, :cond_9

    .line 170
    .line 171
    invoke-static {}, LY/w;->T()V

    .line 172
    .line 173
    .line 174
    :cond_9
    :goto_4
    invoke-interface {p1}, LY/m;->k()LY/B1;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    if-eqz p1, :cond_a

    .line 179
    .line 180
    new-instance v0, Landroidx/compose/foundation/layout/f$a;

    .line 181
    .line 182
    invoke-direct {v0, p0, p2}, Landroidx/compose/foundation/layout/f$a;-><init>(Landroidx/compose/ui/e;I)V

    .line 183
    .line 184
    .line 185
    invoke-interface {p1, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 186
    .line 187
    .line 188
    :cond_a
    return-void
.end method

.method public static final synthetic b(LI0/A;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/layout/f;->g(LI0/A;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic c(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;LI0/A;Li1/t;IILl0/e;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Landroidx/compose/foundation/layout/f;->i(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;LI0/A;Li1/t;IILl0/e;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final d(Z)Ljava/util/HashMap;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Ll0/e;->a:Ll0/e$a;

    .line 9
    .line 10
    invoke-virtual {v1}, Ll0/e$a;->o()Ll0/e;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-static {v0, p0, v2}, Landroidx/compose/foundation/layout/f;->e(Ljava/util/HashMap;ZLl0/e;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ll0/e$a;->m()Ll0/e;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {v0, p0, v2}, Landroidx/compose/foundation/layout/f;->e(Ljava/util/HashMap;ZLl0/e;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ll0/e$a;->n()Ll0/e;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-static {v0, p0, v2}, Landroidx/compose/foundation/layout/f;->e(Ljava/util/HashMap;ZLl0/e;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ll0/e$a;->h()Ll0/e;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v0, p0, v2}, Landroidx/compose/foundation/layout/f;->e(Ljava/util/HashMap;ZLl0/e;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ll0/e$a;->e()Ll0/e;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-static {v0, p0, v2}, Landroidx/compose/foundation/layout/f;->e(Ljava/util/HashMap;ZLl0/e;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ll0/e$a;->f()Ll0/e;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-static {v0, p0, v2}, Landroidx/compose/foundation/layout/f;->e(Ljava/util/HashMap;ZLl0/e;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ll0/e$a;->d()Ll0/e;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-static {v0, p0, v2}, Landroidx/compose/foundation/layout/f;->e(Ljava/util/HashMap;ZLl0/e;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ll0/e$a;->b()Ll0/e;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-static {v0, p0, v2}, Landroidx/compose/foundation/layout/f;->e(Ljava/util/HashMap;ZLl0/e;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Ll0/e$a;->c()Ll0/e;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-static {v0, p0, v1}, Landroidx/compose/foundation/layout/f;->e(Ljava/util/HashMap;ZLl0/e;)V

    .line 71
    .line 72
    .line 73
    return-object v0
.end method

.method private static final e(Ljava/util/HashMap;ZLl0/e;)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/foundation/layout/g;

    .line 2
    .line 3
    invoke-direct {v0, p2, p1}, Landroidx/compose/foundation/layout/g;-><init>(Ll0/e;Z)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static final f(LI0/A;)Landroidx/compose/foundation/layout/e;
    .locals 1

    .line 1
    invoke-interface {p0}, LI0/l;->j()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, Landroidx/compose/foundation/layout/e;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, Landroidx/compose/foundation/layout/e;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method private static final g(LI0/A;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/layout/f;->f(LI0/A;)Landroidx/compose/foundation/layout/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/compose/foundation/layout/e;->F1()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public static final h(Ll0/e;Z)LI0/B;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object v0, Landroidx/compose/foundation/layout/f;->a:Ljava/util/HashMap;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object v0, Landroidx/compose/foundation/layout/f;->b:Ljava/util/HashMap;

    .line 7
    .line 8
    :goto_0
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, LI0/B;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    new-instance v0, Landroidx/compose/foundation/layout/g;

    .line 17
    .line 18
    invoke-direct {v0, p0, p1}, Landroidx/compose/foundation/layout/g;-><init>(Ll0/e;Z)V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-object v0
.end method

.method private static final i(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;LI0/A;Li1/t;IILl0/e;)V
    .locals 6

    .line 1
    invoke-static {p2}, Landroidx/compose/foundation/layout/f;->f(LI0/A;)Landroidx/compose/foundation/layout/e;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-eqz p2, :cond_1

    .line 6
    .line 7
    invoke-virtual {p2}, Landroidx/compose/foundation/layout/e;->E1()Ll0/e;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v0, p2

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    move-object v0, p6

    .line 17
    :goto_1
    invoke-virtual {p1}, Landroidx/compose/ui/layout/s;->W0()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    invoke-virtual {p1}, Landroidx/compose/ui/layout/s;->P0()I

    .line 22
    .line 23
    .line 24
    move-result p6

    .line 25
    invoke-static {p2, p6}, Li1/s;->a(II)J

    .line 26
    .line 27
    .line 28
    move-result-wide v1

    .line 29
    invoke-static {p4, p5}, Li1/s;->a(II)J

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    move-object v5, p3

    .line 34
    invoke-interface/range {v0 .. v5}, Ll0/e;->a(JJLi1/t;)J

    .line 35
    .line 36
    .line 37
    move-result-wide p2

    .line 38
    const/4 p5, 0x2

    .line 39
    const/4 p6, 0x0

    .line 40
    const/4 p4, 0x0

    .line 41
    invoke-static/range {p0 .. p6}, Landroidx/compose/ui/layout/s$a;->U(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;JFILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method
