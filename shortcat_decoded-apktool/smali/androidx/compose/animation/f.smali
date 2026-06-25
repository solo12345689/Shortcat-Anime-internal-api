.class public abstract Landroidx/compose/animation/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Lw/s0;

.field private static final b:Lw/h0;

.field private static final c:Lw/h0;

.field private static final d:Lw/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    sget-object v0, Landroidx/compose/animation/f$a;->a:Landroidx/compose/animation/f$a;

    .line 2
    .line 3
    sget-object v1, Landroidx/compose/animation/f$b;->a:Landroidx/compose/animation/f$b;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lw/u0;->a(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lw/s0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Landroidx/compose/animation/f;->a:Lw/s0;

    .line 10
    .line 11
    const/4 v0, 0x5

    .line 12
    const/4 v1, 0x0

    .line 13
    const/high16 v2, 0x43c80000    # 400.0f

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-static {v1, v2, v3, v0, v3}, Lw/j;->h(FFLjava/lang/Object;ILjava/lang/Object;)Lw/h0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Landroidx/compose/animation/f;->b:Lw/h0;

    .line 21
    .line 22
    sget-object v0, Li1/n;->b:Li1/n$a;

    .line 23
    .line 24
    invoke-static {v0}, Lw/I0;->c(Li1/n$a;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v4

    .line 28
    invoke-static {v4, v5}, Li1/n;->c(J)Li1/n;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v4, 0x1

    .line 33
    invoke-static {v1, v2, v0, v4, v3}, Lw/j;->h(FFLjava/lang/Object;ILjava/lang/Object;)Lw/h0;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, Landroidx/compose/animation/f;->c:Lw/h0;

    .line 38
    .line 39
    sget-object v0, Li1/r;->b:Li1/r$a;

    .line 40
    .line 41
    invoke-static {v0}, Lw/I0;->d(Li1/r$a;)J

    .line 42
    .line 43
    .line 44
    move-result-wide v5

    .line 45
    invoke-static {v5, v6}, Li1/r;->b(J)Li1/r;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v1, v2, v0, v4, v3}, Lw/j;->h(FFLjava/lang/Object;ILjava/lang/Object;)Lw/h0;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, Landroidx/compose/animation/f;->d:Lw/h0;

    .line 54
    .line 55
    return-void
.end method

.method public static final A(Lw/G;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/j;
    .locals 10

    .line 1
    new-instance v0, Landroidx/compose/animation/k;

    .line 2
    .line 3
    new-instance v1, Lv/B;

    .line 4
    .line 5
    new-instance v3, Lv/x;

    .line 6
    .line 7
    invoke-direct {v3, p1, p0}, Lv/x;-><init>(Lkotlin/jvm/functions/Function1;Lw/G;)V

    .line 8
    .line 9
    .line 10
    const/16 v8, 0x3d

    .line 11
    .line 12
    const/4 v9, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x0

    .line 18
    invoke-direct/range {v1 .. v9}, Lv/B;-><init>(Lv/n;Lv/x;Lv/h;Lv/u;ZLjava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1}, Landroidx/compose/animation/k;-><init>(Lv/B;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public static final B(Lw/G;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/j;
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/animation/f$w;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroidx/compose/animation/f$w;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Landroidx/compose/animation/f;->A(Lw/G;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/j;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic C(Lw/G;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/animation/j;
    .locals 3

    .line 1
    and-int/lit8 p3, p2, 0x1

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    sget-object p0, Li1/n;->b:Li1/n$a;

    .line 6
    .line 7
    invoke-static {p0}, Lw/I0;->c(Li1/n$a;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {v0, v1}, Li1/n;->c(J)Li1/n;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/4 p3, 0x0

    .line 16
    const/4 v0, 0x0

    .line 17
    const/high16 v1, 0x43c80000    # 400.0f

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-static {v0, v1, p0, v2, p3}, Lw/j;->h(FFLjava/lang/Object;ILjava/lang/Object;)Lw/h0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :cond_0
    and-int/lit8 p2, p2, 0x2

    .line 25
    .line 26
    if-eqz p2, :cond_1

    .line 27
    .line 28
    sget-object p1, Landroidx/compose/animation/f$v;->a:Landroidx/compose/animation/f$v;

    .line 29
    .line 30
    :cond_1
    invoke-static {p0, p1}, Landroidx/compose/animation/f;->B(Lw/G;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/j;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public static final D(Lw/G;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/j;
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/animation/f$y;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroidx/compose/animation/f$y;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Landroidx/compose/animation/f;->A(Lw/G;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/j;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic E(Lw/G;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/animation/j;
    .locals 3

    .line 1
    and-int/lit8 p3, p2, 0x1

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    sget-object p0, Li1/n;->b:Li1/n$a;

    .line 6
    .line 7
    invoke-static {p0}, Lw/I0;->c(Li1/n$a;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {v0, v1}, Li1/n;->c(J)Li1/n;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/4 p3, 0x0

    .line 16
    const/4 v0, 0x0

    .line 17
    const/high16 v1, 0x43c80000    # 400.0f

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-static {v0, v1, p0, v2, p3}, Lw/j;->h(FFLjava/lang/Object;ILjava/lang/Object;)Lw/h0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :cond_0
    and-int/lit8 p2, p2, 0x2

    .line 25
    .line 26
    if-eqz p2, :cond_1

    .line 27
    .line 28
    sget-object p1, Landroidx/compose/animation/f$x;->a:Landroidx/compose/animation/f$x;

    .line 29
    .line 30
    :cond_1
    invoke-static {p0, p1}, Landroidx/compose/animation/f;->D(Lw/G;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/j;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method private static final F(Ll0/e$c;)Ll0/e;
    .locals 2

    .line 1
    sget-object v0, Ll0/e;->a:Ll0/e$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll0/e$a;->l()Ll0/e$c;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Ll0/e$a;->m()Ll0/e;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    invoke-virtual {v0}, Ll0/e$a;->a()Ll0/e$c;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0}, Ll0/e$a;->b()Ll0/e;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_1
    invoke-virtual {v0}, Ll0/e$a;->e()Ll0/e;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public static final G(Lw/o0;Landroidx/compose/animation/h;LY/m;I)Landroidx/compose/animation/h;
    .locals 3

    .line 1
    invoke-static {}, LY/w;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:910)"

    .line 9
    .line 10
    const v2, 0x149cfa6

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p3, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    and-int/lit8 v0, p3, 0xe

    .line 17
    .line 18
    xor-int/lit8 v0, v0, 0x6

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    if-le v0, v1, :cond_1

    .line 22
    .line 23
    invoke-interface {p2, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    :cond_1
    and-int/lit8 p3, p3, 0x6

    .line 30
    .line 31
    if-ne p3, v1, :cond_3

    .line 32
    .line 33
    :cond_2
    const/4 p3, 0x1

    .line 34
    goto :goto_0

    .line 35
    :cond_3
    const/4 p3, 0x0

    .line 36
    :goto_0
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-nez p3, :cond_4

    .line 41
    .line 42
    sget-object p3, LY/m;->a:LY/m$a;

    .line 43
    .line 44
    invoke-virtual {p3}, LY/m$a;->a()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    if-ne v0, p3, :cond_5

    .line 49
    .line 50
    :cond_4
    const/4 p3, 0x2

    .line 51
    const/4 v0, 0x0

    .line 52
    invoke-static {p1, v0, p3, v0}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-interface {p2, v0}, LY/m;->u(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :cond_5
    check-cast v0, LY/C0;

    .line 60
    .line 61
    invoke-virtual {p0}, Lw/o0;->h()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-virtual {p0}, Lw/o0;->o()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    if-ne p2, p3, :cond_7

    .line 70
    .line 71
    invoke-virtual {p0}, Lw/o0;->h()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    sget-object p3, Lv/l;->b:Lv/l;

    .line 76
    .line 77
    if-ne p2, p3, :cond_7

    .line 78
    .line 79
    invoke-virtual {p0}, Lw/o0;->s()Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-eqz p0, :cond_6

    .line 84
    .line 85
    invoke-static {v0, p1}, Landroidx/compose/animation/f;->I(LY/C0;Landroidx/compose/animation/h;)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_6
    sget-object p0, Landroidx/compose/animation/h;->a:Landroidx/compose/animation/h$a;

    .line 90
    .line 91
    invoke-virtual {p0}, Landroidx/compose/animation/h$a;->a()Landroidx/compose/animation/h;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {v0, p0}, Landroidx/compose/animation/f;->I(LY/C0;Landroidx/compose/animation/h;)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_7
    invoke-virtual {p0}, Lw/o0;->o()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    sget-object p2, Lv/l;->b:Lv/l;

    .line 104
    .line 105
    if-ne p0, p2, :cond_8

    .line 106
    .line 107
    invoke-static {v0}, Landroidx/compose/animation/f;->H(LY/C0;)Landroidx/compose/animation/h;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-virtual {p0, p1}, Landroidx/compose/animation/h;->c(Landroidx/compose/animation/h;)Landroidx/compose/animation/h;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-static {v0, p0}, Landroidx/compose/animation/f;->I(LY/C0;Landroidx/compose/animation/h;)V

    .line 116
    .line 117
    .line 118
    :cond_8
    :goto_1
    invoke-static {v0}, Landroidx/compose/animation/f;->H(LY/C0;)Landroidx/compose/animation/h;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-static {}, LY/w;->L()Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    if-eqz p1, :cond_9

    .line 127
    .line 128
    invoke-static {}, LY/w;->T()V

    .line 129
    .line 130
    .line 131
    :cond_9
    return-object p0
.end method

.method private static final H(LY/C0;)Landroidx/compose/animation/h;
    .locals 0

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/compose/animation/h;

    .line 6
    .line 7
    return-object p0
.end method

.method private static final I(LY/C0;Landroidx/compose/animation/h;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final J(Lw/o0;Landroidx/compose/animation/j;LY/m;I)Landroidx/compose/animation/j;
    .locals 3

    .line 1
    invoke-static {}, LY/w;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:930)"

    .line 9
    .line 10
    const v2, -0x514aece4

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p3, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    and-int/lit8 v0, p3, 0xe

    .line 17
    .line 18
    xor-int/lit8 v0, v0, 0x6

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    if-le v0, v1, :cond_1

    .line 22
    .line 23
    invoke-interface {p2, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    :cond_1
    and-int/lit8 p3, p3, 0x6

    .line 30
    .line 31
    if-ne p3, v1, :cond_3

    .line 32
    .line 33
    :cond_2
    const/4 p3, 0x1

    .line 34
    goto :goto_0

    .line 35
    :cond_3
    const/4 p3, 0x0

    .line 36
    :goto_0
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-nez p3, :cond_4

    .line 41
    .line 42
    sget-object p3, LY/m;->a:LY/m$a;

    .line 43
    .line 44
    invoke-virtual {p3}, LY/m$a;->a()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    if-ne v0, p3, :cond_5

    .line 49
    .line 50
    :cond_4
    const/4 p3, 0x2

    .line 51
    const/4 v0, 0x0

    .line 52
    invoke-static {p1, v0, p3, v0}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-interface {p2, v0}, LY/m;->u(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :cond_5
    check-cast v0, LY/C0;

    .line 60
    .line 61
    invoke-virtual {p0}, Lw/o0;->h()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-virtual {p0}, Lw/o0;->o()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    if-ne p2, p3, :cond_7

    .line 70
    .line 71
    invoke-virtual {p0}, Lw/o0;->h()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    sget-object p3, Lv/l;->b:Lv/l;

    .line 76
    .line 77
    if-ne p2, p3, :cond_7

    .line 78
    .line 79
    invoke-virtual {p0}, Lw/o0;->s()Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-eqz p0, :cond_6

    .line 84
    .line 85
    invoke-static {v0, p1}, Landroidx/compose/animation/f;->L(LY/C0;Landroidx/compose/animation/j;)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_6
    sget-object p0, Landroidx/compose/animation/j;->a:Landroidx/compose/animation/j$a;

    .line 90
    .line 91
    invoke-virtual {p0}, Landroidx/compose/animation/j$a;->a()Landroidx/compose/animation/j;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {v0, p0}, Landroidx/compose/animation/f;->L(LY/C0;Landroidx/compose/animation/j;)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_7
    invoke-virtual {p0}, Lw/o0;->o()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    sget-object p2, Lv/l;->b:Lv/l;

    .line 104
    .line 105
    if-eq p0, p2, :cond_8

    .line 106
    .line 107
    invoke-static {v0}, Landroidx/compose/animation/f;->K(LY/C0;)Landroidx/compose/animation/j;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-virtual {p0, p1}, Landroidx/compose/animation/j;->c(Landroidx/compose/animation/j;)Landroidx/compose/animation/j;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-static {v0, p0}, Landroidx/compose/animation/f;->L(LY/C0;Landroidx/compose/animation/j;)V

    .line 116
    .line 117
    .line 118
    :cond_8
    :goto_1
    invoke-static {v0}, Landroidx/compose/animation/f;->K(LY/C0;)Landroidx/compose/animation/j;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-static {}, LY/w;->L()Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    if-eqz p1, :cond_9

    .line 127
    .line 128
    invoke-static {}, LY/w;->T()V

    .line 129
    .line 130
    .line 131
    :cond_9
    return-object p0
.end method

.method private static final K(LY/C0;)Landroidx/compose/animation/j;
    .locals 0

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/compose/animation/j;

    .line 6
    .line 7
    return-object p0
.end method

.method private static final L(LY/C0;Landroidx/compose/animation/j;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Lw/o0$a;Lw/o0$a;Lw/o0;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lw/o0$a;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Landroidx/compose/animation/f;->f(Lw/o0$a;Lw/o0$a;Lw/o0;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lw/o0$a;)Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic b()Lw/h0;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/animation/f;->b:Lw/h0;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic c()Lw/h0;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/animation/f;->c:Lw/h0;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic d()Lw/h0;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/animation/f;->d:Lw/h0;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final e(Lw/o0;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;LY/m;I)Lv/q;
    .locals 19

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    move-object/from16 v3, p4

    .line 4
    .line 5
    move/from16 v7, p5

    .line 6
    .line 7
    invoke-static {}, LY/w;->L()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    const-string v2, "androidx.compose.animation.createGraphicsLayerBlock (EnterExitTransition.kt:958)"

    .line 15
    .line 16
    const v4, 0x264802d5

    .line 17
    .line 18
    .line 19
    invoke-static {v4, v7, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/animation/h;->b()Lv/B;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Lv/B;->c()Lv/n;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const/4 v8, 0x1

    .line 31
    const/4 v9, 0x0

    .line 32
    if-nez v1, :cond_2

    .line 33
    .line 34
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/animation/j;->b()Lv/B;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Lv/B;->c()Lv/n;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move v1, v9

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    :goto_0
    move v1, v8

    .line 48
    :goto_1
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/animation/h;->b()Lv/B;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v2}, Lv/B;->e()Lv/u;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    if-nez v2, :cond_4

    .line 57
    .line 58
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/animation/j;->b()Lv/B;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v2}, Lv/B;->e()Lv/u;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    if-eqz v2, :cond_3

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    move v10, v9

    .line 70
    goto :goto_3

    .line 71
    :cond_4
    :goto_2
    move v10, v8

    .line 72
    :goto_3
    const/4 v11, 0x0

    .line 73
    if-eqz v1, :cond_6

    .line 74
    .line 75
    const v1, -0x28419f14

    .line 76
    .line 77
    .line 78
    invoke-interface {v3, v1}, LY/m;->V(I)V

    .line 79
    .line 80
    .line 81
    sget-object v1, Lkotlin/jvm/internal/l;->a:Lkotlin/jvm/internal/l;

    .line 82
    .line 83
    invoke-static {v1}, Lw/u0;->f(Lkotlin/jvm/internal/l;)Lw/s0;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-interface {v3}, LY/m;->D()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    sget-object v4, LY/m;->a:LY/m$a;

    .line 92
    .line 93
    invoke-virtual {v4}, LY/m$a;->a()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    if-ne v1, v4, :cond_5

    .line 98
    .line 99
    new-instance v1, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v4, " alpha"

    .line 108
    .line 109
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-interface {v3, v1}, LY/m;->u(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    :cond_5
    check-cast v1, Ljava/lang/String;

    .line 120
    .line 121
    and-int/lit8 v4, v7, 0xe

    .line 122
    .line 123
    or-int/lit16 v5, v4, 0x180

    .line 124
    .line 125
    const/4 v6, 0x0

    .line 126
    move-object v4, v3

    .line 127
    move-object v3, v1

    .line 128
    move-object/from16 v1, p0

    .line 129
    .line 130
    invoke-static/range {v1 .. v6}, Lw/p0;->b(Lw/o0;Lw/s0;Ljava/lang/String;LY/m;II)Lw/o0$a;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    move-object v3, v4

    .line 135
    invoke-interface {v3}, LY/m;->O()V

    .line 136
    .line 137
    .line 138
    move-object v13, v2

    .line 139
    goto :goto_4

    .line 140
    :cond_6
    const v1, -0x283f88d1

    .line 141
    .line 142
    .line 143
    invoke-interface {v3, v1}, LY/m;->V(I)V

    .line 144
    .line 145
    .line 146
    invoke-interface {v3}, LY/m;->O()V

    .line 147
    .line 148
    .line 149
    move-object v13, v11

    .line 150
    :goto_4
    if-eqz v10, :cond_8

    .line 151
    .line 152
    const v1, -0x283ea3b4

    .line 153
    .line 154
    .line 155
    invoke-interface {v3, v1}, LY/m;->V(I)V

    .line 156
    .line 157
    .line 158
    sget-object v1, Lkotlin/jvm/internal/l;->a:Lkotlin/jvm/internal/l;

    .line 159
    .line 160
    invoke-static {v1}, Lw/u0;->f(Lkotlin/jvm/internal/l;)Lw/s0;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-interface {v3}, LY/m;->D()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    sget-object v4, LY/m;->a:LY/m$a;

    .line 169
    .line 170
    invoke-virtual {v4}, LY/m$a;->a()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    if-ne v2, v4, :cond_7

    .line 175
    .line 176
    new-instance v2, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string v0, " scale"

    .line 185
    .line 186
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    invoke-interface {v3, v2}, LY/m;->u(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    :cond_7
    check-cast v2, Ljava/lang/String;

    .line 197
    .line 198
    and-int/lit8 v0, v7, 0xe

    .line 199
    .line 200
    or-int/lit16 v4, v0, 0x180

    .line 201
    .line 202
    const/4 v5, 0x0

    .line 203
    move-object/from16 v0, p0

    .line 204
    .line 205
    invoke-static/range {v0 .. v5}, Lw/p0;->b(Lw/o0;Lw/s0;Ljava/lang/String;LY/m;II)Lw/o0$a;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-interface {v3}, LY/m;->O()V

    .line 210
    .line 211
    .line 212
    move-object v14, v1

    .line 213
    goto :goto_5

    .line 214
    :cond_8
    const v0, -0x283c8d71

    .line 215
    .line 216
    .line 217
    invoke-interface {v3, v0}, LY/m;->V(I)V

    .line 218
    .line 219
    .line 220
    invoke-interface {v3}, LY/m;->O()V

    .line 221
    .line 222
    .line 223
    move-object v14, v11

    .line 224
    :goto_5
    if-eqz v10, :cond_9

    .line 225
    .line 226
    const v0, -0x283b7fa4

    .line 227
    .line 228
    .line 229
    invoke-interface {v3, v0}, LY/m;->V(I)V

    .line 230
    .line 231
    .line 232
    sget-object v1, Landroidx/compose/animation/f;->a:Lw/s0;

    .line 233
    .line 234
    and-int/lit8 v0, v7, 0xe

    .line 235
    .line 236
    or-int/lit16 v4, v0, 0x180

    .line 237
    .line 238
    const/4 v5, 0x0

    .line 239
    const-string v2, "TransformOriginInterruptionHandling"

    .line 240
    .line 241
    move-object/from16 v0, p0

    .line 242
    .line 243
    invoke-static/range {v0 .. v5}, Lw/p0;->b(Lw/o0;Lw/s0;Ljava/lang/String;LY/m;II)Lw/o0$a;

    .line 244
    .line 245
    .line 246
    move-result-object v11

    .line 247
    invoke-interface {v3}, LY/m;->O()V

    .line 248
    .line 249
    .line 250
    goto :goto_6

    .line 251
    :cond_9
    const v0, -0x28392d51

    .line 252
    .line 253
    .line 254
    invoke-interface {v3, v0}, LY/m;->V(I)V

    .line 255
    .line 256
    .line 257
    invoke-interface {v3}, LY/m;->O()V

    .line 258
    .line 259
    .line 260
    :goto_6
    invoke-interface {v3, v13}, LY/m;->F(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    and-int/lit8 v1, v7, 0x70

    .line 265
    .line 266
    xor-int/lit8 v1, v1, 0x30

    .line 267
    .line 268
    const/16 v2, 0x20

    .line 269
    .line 270
    if-le v1, v2, :cond_a

    .line 271
    .line 272
    move-object/from16 v1, p1

    .line 273
    .line 274
    invoke-interface {v3, v1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v4

    .line 278
    if-nez v4, :cond_b

    .line 279
    .line 280
    goto :goto_7

    .line 281
    :cond_a
    move-object/from16 v1, p1

    .line 282
    .line 283
    :goto_7
    and-int/lit8 v4, v7, 0x30

    .line 284
    .line 285
    if-ne v4, v2, :cond_c

    .line 286
    .line 287
    :cond_b
    move v2, v8

    .line 288
    goto :goto_8

    .line 289
    :cond_c
    move v2, v9

    .line 290
    :goto_8
    or-int/2addr v0, v2

    .line 291
    and-int/lit16 v2, v7, 0x380

    .line 292
    .line 293
    xor-int/lit16 v2, v2, 0x180

    .line 294
    .line 295
    const/16 v4, 0x100

    .line 296
    .line 297
    if-le v2, v4, :cond_d

    .line 298
    .line 299
    move-object/from16 v2, p2

    .line 300
    .line 301
    invoke-interface {v3, v2}, LY/m;->U(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v5

    .line 305
    if-nez v5, :cond_e

    .line 306
    .line 307
    goto :goto_9

    .line 308
    :cond_d
    move-object/from16 v2, p2

    .line 309
    .line 310
    :goto_9
    and-int/lit16 v5, v7, 0x180

    .line 311
    .line 312
    if-ne v5, v4, :cond_f

    .line 313
    .line 314
    :cond_e
    move v4, v8

    .line 315
    goto :goto_a

    .line 316
    :cond_f
    move v4, v9

    .line 317
    :goto_a
    or-int/2addr v0, v4

    .line 318
    invoke-interface {v3, v14}, LY/m;->F(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    move-result v4

    .line 322
    or-int/2addr v0, v4

    .line 323
    and-int/lit8 v4, v7, 0xe

    .line 324
    .line 325
    xor-int/lit8 v4, v4, 0x6

    .line 326
    .line 327
    const/4 v5, 0x4

    .line 328
    move-object/from16 v15, p0

    .line 329
    .line 330
    if-le v4, v5, :cond_10

    .line 331
    .line 332
    invoke-interface {v3, v15}, LY/m;->U(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v4

    .line 336
    if-nez v4, :cond_12

    .line 337
    .line 338
    :cond_10
    and-int/lit8 v4, v7, 0x6

    .line 339
    .line 340
    if-ne v4, v5, :cond_11

    .line 341
    .line 342
    goto :goto_b

    .line 343
    :cond_11
    move v8, v9

    .line 344
    :cond_12
    :goto_b
    or-int/2addr v0, v8

    .line 345
    invoke-interface {v3, v11}, LY/m;->F(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v4

    .line 349
    or-int/2addr v0, v4

    .line 350
    invoke-interface {v3}, LY/m;->D()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v4

    .line 354
    if-nez v0, :cond_13

    .line 355
    .line 356
    sget-object v0, LY/m;->a:LY/m$a;

    .line 357
    .line 358
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    if-ne v4, v0, :cond_14

    .line 363
    .line 364
    :cond_13
    new-instance v12, Lv/m;

    .line 365
    .line 366
    move-object/from16 v16, v1

    .line 367
    .line 368
    move-object/from16 v17, v2

    .line 369
    .line 370
    move-object/from16 v18, v11

    .line 371
    .line 372
    invoke-direct/range {v12 .. v18}, Lv/m;-><init>(Lw/o0$a;Lw/o0$a;Lw/o0;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lw/o0$a;)V

    .line 373
    .line 374
    .line 375
    invoke-interface {v3, v12}, LY/m;->u(Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    move-object v4, v12

    .line 379
    :cond_14
    check-cast v4, Lv/q;

    .line 380
    .line 381
    invoke-static {}, LY/w;->L()Z

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    if-eqz v0, :cond_15

    .line 386
    .line 387
    invoke-static {}, LY/w;->T()V

    .line 388
    .line 389
    .line 390
    :cond_15
    return-object v4
.end method

.method private static final f(Lw/o0$a;Lw/o0$a;Lw/o0;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lw/o0$a;)Lkotlin/jvm/functions/Function1;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    new-instance v1, Landroidx/compose/animation/f$c;

    .line 5
    .line 6
    invoke-direct {v1, p3, p4}, Landroidx/compose/animation/f$c;-><init>(Landroidx/compose/animation/h;Landroidx/compose/animation/j;)V

    .line 7
    .line 8
    .line 9
    new-instance v2, Landroidx/compose/animation/f$d;

    .line 10
    .line 11
    invoke-direct {v2, p3, p4}, Landroidx/compose/animation/f$d;-><init>(Landroidx/compose/animation/h;Landroidx/compose/animation/j;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1, v2}, Lw/o0$a;->a(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)LY/h2;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object p0, v0

    .line 20
    :goto_0
    if-eqz p1, :cond_1

    .line 21
    .line 22
    new-instance v1, Landroidx/compose/animation/f$f;

    .line 23
    .line 24
    invoke-direct {v1, p3, p4}, Landroidx/compose/animation/f$f;-><init>(Landroidx/compose/animation/h;Landroidx/compose/animation/j;)V

    .line 25
    .line 26
    .line 27
    new-instance v2, Landroidx/compose/animation/f$g;

    .line 28
    .line 29
    invoke-direct {v2, p3, p4}, Landroidx/compose/animation/f$g;-><init>(Landroidx/compose/animation/h;Landroidx/compose/animation/j;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v1, v2}, Lw/o0$a;->a(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)LY/h2;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move-object p1, v0

    .line 38
    :goto_1
    invoke-virtual {p2}, Lw/o0;->h()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    sget-object v1, Lv/l;->a:Lv/l;

    .line 43
    .line 44
    if-ne p2, v1, :cond_4

    .line 45
    .line 46
    invoke-virtual {p3}, Landroidx/compose/animation/h;->b()Lv/B;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-virtual {p2}, Lv/B;->e()Lv/u;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    if-eqz p2, :cond_2

    .line 55
    .line 56
    :goto_2
    invoke-virtual {p2}, Lv/u;->c()J

    .line 57
    .line 58
    .line 59
    move-result-wide v1

    .line 60
    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/j;->b(J)Landroidx/compose/ui/graphics/j;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    goto :goto_4

    .line 65
    :cond_2
    invoke-virtual {p4}, Landroidx/compose/animation/j;->b()Lv/B;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-virtual {p2}, Lv/B;->e()Lv/u;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    if-eqz p2, :cond_3

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    move-object p2, v0

    .line 77
    goto :goto_4

    .line 78
    :cond_4
    invoke-virtual {p4}, Landroidx/compose/animation/j;->b()Lv/B;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-virtual {p2}, Lv/B;->e()Lv/u;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    if-eqz p2, :cond_5

    .line 87
    .line 88
    :goto_3
    invoke-virtual {p2}, Lv/u;->c()J

    .line 89
    .line 90
    .line 91
    move-result-wide v1

    .line 92
    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/j;->b(J)Landroidx/compose/ui/graphics/j;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    goto :goto_4

    .line 97
    :cond_5
    invoke-virtual {p3}, Landroidx/compose/animation/h;->b()Lv/B;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    invoke-virtual {p2}, Lv/B;->e()Lv/u;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    if-eqz p2, :cond_3

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :goto_4
    if-eqz p5, :cond_6

    .line 109
    .line 110
    sget-object v0, Landroidx/compose/animation/f$h;->a:Landroidx/compose/animation/f$h;

    .line 111
    .line 112
    new-instance v1, Landroidx/compose/animation/f$i;

    .line 113
    .line 114
    invoke-direct {v1, p2, p3, p4}, Landroidx/compose/animation/f$i;-><init>(Landroidx/compose/ui/graphics/j;Landroidx/compose/animation/h;Landroidx/compose/animation/j;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p5, v0, v1}, Lw/o0$a;->a(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)LY/h2;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    :cond_6
    new-instance p2, Landroidx/compose/animation/f$e;

    .line 122
    .line 123
    invoke-direct {p2, p0, p1, v0}, Landroidx/compose/animation/f$e;-><init>(LY/h2;LY/h2;LY/h2;)V

    .line 124
    .line 125
    .line 126
    return-object p2
.end method

.method public static final g(Lw/o0;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lie/a;Ljava/lang/String;LY/m;II)Landroidx/compose/ui/e;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p4

    .line 4
    .line 5
    move-object/from16 v3, p5

    .line 6
    .line 7
    move/from16 v7, p6

    .line 8
    .line 9
    and-int/lit8 v1, p7, 0x4

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    sget-object v1, Landroidx/compose/animation/f$j;->a:Landroidx/compose/animation/f$j;

    .line 14
    .line 15
    move-object v8, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object/from16 v8, p3

    .line 18
    .line 19
    :goto_0
    invoke-static {}, LY/w;->L()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const/4 v1, -0x1

    .line 26
    const-string v2, "androidx.compose.animation.createModifier (EnterExitTransition.kt:869)"

    .line 27
    .line 28
    const v4, 0x1af3d96

    .line 29
    .line 30
    .line 31
    invoke-static {v4, v7, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    and-int/lit8 v9, v7, 0xe

    .line 35
    .line 36
    and-int/lit8 v1, v7, 0x7e

    .line 37
    .line 38
    move-object/from16 v2, p1

    .line 39
    .line 40
    invoke-static {v0, v2, v3, v1}, Landroidx/compose/animation/f;->G(Lw/o0;Landroidx/compose/animation/h;LY/m;I)Landroidx/compose/animation/h;

    .line 41
    .line 42
    .line 43
    move-result-object v10

    .line 44
    shr-int/lit8 v11, v7, 0x3

    .line 45
    .line 46
    and-int/lit8 v1, v11, 0x70

    .line 47
    .line 48
    or-int/2addr v1, v9

    .line 49
    move-object/from16 v2, p2

    .line 50
    .line 51
    invoke-static {v0, v2, v3, v1}, Landroidx/compose/animation/f;->J(Lw/o0;Landroidx/compose/animation/j;LY/m;I)Landroidx/compose/animation/j;

    .line 52
    .line 53
    .line 54
    move-result-object v12

    .line 55
    invoke-virtual {v10}, Landroidx/compose/animation/h;->b()Lv/B;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Lv/B;->f()Lv/x;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const/4 v13, 0x1

    .line 64
    const/4 v14, 0x0

    .line 65
    if-nez v1, :cond_3

    .line 66
    .line 67
    invoke-virtual {v12}, Landroidx/compose/animation/j;->b()Lv/B;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v1}, Lv/B;->f()Lv/x;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    if-eqz v1, :cond_2

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    move v1, v14

    .line 79
    goto :goto_2

    .line 80
    :cond_3
    :goto_1
    move v1, v13

    .line 81
    :goto_2
    invoke-virtual {v10}, Landroidx/compose/animation/h;->b()Lv/B;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v2}, Lv/B;->a()Lv/h;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    if-nez v2, :cond_5

    .line 90
    .line 91
    invoke-virtual {v12}, Landroidx/compose/animation/j;->b()Lv/B;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v2}, Lv/B;->a()Lv/h;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    if-eqz v2, :cond_4

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_4
    move v15, v14

    .line 103
    goto :goto_4

    .line 104
    :cond_5
    :goto_3
    move v15, v13

    .line 105
    :goto_4
    const/16 v16, 0x0

    .line 106
    .line 107
    if-eqz v1, :cond_7

    .line 108
    .line 109
    const v1, -0x30f533db

    .line 110
    .line 111
    .line 112
    invoke-interface {v3, v1}, LY/m;->V(I)V

    .line 113
    .line 114
    .line 115
    sget-object v1, Li1/n;->b:Li1/n$a;

    .line 116
    .line 117
    invoke-static {v1}, Lw/u0;->d(Li1/n$a;)Lw/s0;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-interface {v3}, LY/m;->D()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    sget-object v4, LY/m;->a:LY/m$a;

    .line 126
    .line 127
    invoke-virtual {v4}, LY/m$a;->a()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    if-ne v2, v4, :cond_6

    .line 132
    .line 133
    new-instance v2, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string v4, " slide"

    .line 142
    .line 143
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-interface {v3, v2}, LY/m;->u(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    :cond_6
    check-cast v2, Ljava/lang/String;

    .line 154
    .line 155
    or-int/lit16 v4, v9, 0x180

    .line 156
    .line 157
    const/4 v5, 0x0

    .line 158
    invoke-static/range {v0 .. v5}, Lw/p0;->b(Lw/o0;Lw/s0;Ljava/lang/String;LY/m;II)Lw/o0$a;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-interface {v3}, LY/m;->O()V

    .line 163
    .line 164
    .line 165
    move-object/from16 v17, v1

    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_7
    const v0, -0x30f3b590

    .line 169
    .line 170
    .line 171
    invoke-interface {v3, v0}, LY/m;->V(I)V

    .line 172
    .line 173
    .line 174
    invoke-interface {v3}, LY/m;->O()V

    .line 175
    .line 176
    .line 177
    move-object/from16 v17, v16

    .line 178
    .line 179
    :goto_5
    if-eqz v15, :cond_9

    .line 180
    .line 181
    const v0, -0x30f28d01

    .line 182
    .line 183
    .line 184
    invoke-interface {v3, v0}, LY/m;->V(I)V

    .line 185
    .line 186
    .line 187
    sget-object v0, Li1/r;->b:Li1/r$a;

    .line 188
    .line 189
    invoke-static {v0}, Lw/u0;->e(Li1/r$a;)Lw/s0;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-interface {v3}, LY/m;->D()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    sget-object v2, LY/m;->a:LY/m$a;

    .line 198
    .line 199
    invoke-virtual {v2}, LY/m$a;->a()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    if-ne v0, v2, :cond_8

    .line 204
    .line 205
    new-instance v0, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    const-string v2, " shrink/expand"

    .line 214
    .line 215
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-interface {v3, v0}, LY/m;->u(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    :cond_8
    move-object v2, v0

    .line 226
    check-cast v2, Ljava/lang/String;

    .line 227
    .line 228
    or-int/lit16 v4, v9, 0x180

    .line 229
    .line 230
    const/4 v5, 0x0

    .line 231
    move-object/from16 v0, p0

    .line 232
    .line 233
    invoke-static/range {v0 .. v5}, Lw/p0;->b(Lw/o0;Lw/s0;Ljava/lang/String;LY/m;II)Lw/o0$a;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    invoke-interface {v3}, LY/m;->O()V

    .line 238
    .line 239
    .line 240
    move-object/from16 v18, v1

    .line 241
    .line 242
    goto :goto_6

    .line 243
    :cond_9
    const v0, -0x30f0fa21

    .line 244
    .line 245
    .line 246
    invoke-interface {v3, v0}, LY/m;->V(I)V

    .line 247
    .line 248
    .line 249
    invoke-interface {v3}, LY/m;->O()V

    .line 250
    .line 251
    .line 252
    move-object/from16 v18, v16

    .line 253
    .line 254
    :goto_6
    if-eqz v15, :cond_b

    .line 255
    .line 256
    const v0, -0x30effc12

    .line 257
    .line 258
    .line 259
    invoke-interface {v3, v0}, LY/m;->V(I)V

    .line 260
    .line 261
    .line 262
    sget-object v0, Li1/n;->b:Li1/n$a;

    .line 263
    .line 264
    invoke-static {v0}, Lw/u0;->d(Li1/n$a;)Lw/s0;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-interface {v3}, LY/m;->D()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    sget-object v2, LY/m;->a:LY/m$a;

    .line 273
    .line 274
    invoke-virtual {v2}, LY/m$a;->a()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    if-ne v0, v2, :cond_a

    .line 279
    .line 280
    new-instance v0, Ljava/lang/StringBuilder;

    .line 281
    .line 282
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    const-string v2, " InterruptionHandlingOffset"

    .line 289
    .line 290
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-interface {v3, v0}, LY/m;->u(Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    :cond_a
    move-object v2, v0

    .line 301
    check-cast v2, Ljava/lang/String;

    .line 302
    .line 303
    or-int/lit16 v4, v9, 0x180

    .line 304
    .line 305
    const/4 v5, 0x0

    .line 306
    move-object/from16 v0, p0

    .line 307
    .line 308
    invoke-static/range {v0 .. v5}, Lw/p0;->b(Lw/o0;Lw/s0;Ljava/lang/String;LY/m;II)Lw/o0$a;

    .line 309
    .line 310
    .line 311
    move-result-object v16

    .line 312
    invoke-interface {v3}, LY/m;->O()V

    .line 313
    .line 314
    .line 315
    goto :goto_7

    .line 316
    :cond_b
    const v0, -0x30edb141

    .line 317
    .line 318
    .line 319
    invoke-interface {v3, v0}, LY/m;->V(I)V

    .line 320
    .line 321
    .line 322
    invoke-interface {v3}, LY/m;->O()V

    .line 323
    .line 324
    .line 325
    :goto_7
    invoke-virtual {v10}, Landroidx/compose/animation/h;->b()Lv/B;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-virtual {v0}, Lv/B;->a()Lv/h;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    if-eqz v0, :cond_c

    .line 334
    .line 335
    invoke-virtual {v0}, Lv/h;->c()Z

    .line 336
    .line 337
    .line 338
    move-result v0

    .line 339
    if-nez v0, :cond_c

    .line 340
    .line 341
    goto :goto_8

    .line 342
    :cond_c
    invoke-virtual {v12}, Landroidx/compose/animation/j;->b()Lv/B;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-virtual {v0}, Lv/B;->a()Lv/h;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    if-eqz v0, :cond_d

    .line 351
    .line 352
    invoke-virtual {v0}, Lv/h;->c()Z

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    if-nez v0, :cond_d

    .line 357
    .line 358
    goto :goto_8

    .line 359
    :cond_d
    if-nez v15, :cond_e

    .line 360
    .line 361
    :goto_8
    move v15, v13

    .line 362
    goto :goto_9

    .line 363
    :cond_e
    move v15, v14

    .line 364
    :goto_9
    and-int/lit16 v0, v11, 0x1c00

    .line 365
    .line 366
    or-int v5, v9, v0

    .line 367
    .line 368
    move-object/from16 v0, p0

    .line 369
    .line 370
    move-object v4, v3

    .line 371
    move-object v3, v6

    .line 372
    move-object v1, v10

    .line 373
    move-object v2, v12

    .line 374
    invoke-static/range {v0 .. v5}, Landroidx/compose/animation/f;->e(Lw/o0;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;LY/m;I)Lv/q;

    .line 375
    .line 376
    .line 377
    move-result-object v3

    .line 378
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 379
    .line 380
    invoke-interface {v4, v15}, LY/m;->a(Z)Z

    .line 381
    .line 382
    .line 383
    move-result v5

    .line 384
    and-int/lit16 v6, v7, 0x1c00

    .line 385
    .line 386
    xor-int/lit16 v6, v6, 0xc00

    .line 387
    .line 388
    const/16 v9, 0x800

    .line 389
    .line 390
    if-le v6, v9, :cond_f

    .line 391
    .line 392
    invoke-interface {v4, v8}, LY/m;->U(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v6

    .line 396
    if-nez v6, :cond_11

    .line 397
    .line 398
    :cond_f
    and-int/lit16 v6, v7, 0xc00

    .line 399
    .line 400
    if-ne v6, v9, :cond_10

    .line 401
    .line 402
    goto :goto_a

    .line 403
    :cond_10
    move v13, v14

    .line 404
    :cond_11
    :goto_a
    or-int/2addr v5, v13

    .line 405
    invoke-interface {v4}, LY/m;->D()Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v6

    .line 409
    if-nez v5, :cond_12

    .line 410
    .line 411
    sget-object v5, LY/m;->a:LY/m$a;

    .line 412
    .line 413
    invoke-virtual {v5}, LY/m$a;->a()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v5

    .line 417
    if-ne v6, v5, :cond_13

    .line 418
    .line 419
    :cond_12
    new-instance v6, Landroidx/compose/animation/f$k;

    .line 420
    .line 421
    invoke-direct {v6, v15, v8}, Landroidx/compose/animation/f$k;-><init>(ZLie/a;)V

    .line 422
    .line 423
    .line 424
    invoke-interface {v4, v6}, LY/m;->u(Ljava/lang/Object;)V

    .line 425
    .line 426
    .line 427
    :cond_13
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 428
    .line 429
    invoke-static {v0, v6}, Landroidx/compose/ui/graphics/f;->a(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    .line 430
    .line 431
    .line 432
    move-result-object v9

    .line 433
    new-instance v0, Landroidx/compose/animation/EnterExitTransitionElement;

    .line 434
    .line 435
    move-object v5, v1

    .line 436
    move-object v6, v2

    .line 437
    move-object v7, v8

    .line 438
    move-object/from16 v4, v17

    .line 439
    .line 440
    move-object/from16 v2, v18

    .line 441
    .line 442
    move-object/from16 v1, p0

    .line 443
    .line 444
    move-object v8, v3

    .line 445
    move-object/from16 v3, v16

    .line 446
    .line 447
    invoke-direct/range {v0 .. v8}, Landroidx/compose/animation/EnterExitTransitionElement;-><init>(Lw/o0;Lw/o0$a;Lw/o0$a;Lw/o0$a;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lie/a;Lv/q;)V

    .line 448
    .line 449
    .line 450
    invoke-interface {v9, v0}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    invoke-static {}, LY/w;->L()Z

    .line 455
    .line 456
    .line 457
    move-result v1

    .line 458
    if-eqz v1, :cond_14

    .line 459
    .line 460
    invoke-static {}, LY/w;->T()V

    .line 461
    .line 462
    .line 463
    :cond_14
    return-object v0
.end method

.method public static final h(Lw/G;Ll0/e;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/h;
    .locals 10

    .line 1
    new-instance v0, Landroidx/compose/animation/i;

    .line 2
    .line 3
    new-instance v1, Lv/B;

    .line 4
    .line 5
    new-instance v4, Lv/h;

    .line 6
    .line 7
    invoke-direct {v4, p1, p3, p0, p2}, Lv/h;-><init>(Ll0/e;Lkotlin/jvm/functions/Function1;Lw/G;Z)V

    .line 8
    .line 9
    .line 10
    const/16 v8, 0x3b

    .line 11
    .line 12
    const/4 v9, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x0

    .line 18
    invoke-direct/range {v1 .. v9}, Lv/B;-><init>(Lv/n;Lv/x;Lv/h;Lv/u;ZLjava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1}, Landroidx/compose/animation/i;-><init>(Lv/B;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public static synthetic i(Lw/G;Ll0/e;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/animation/h;
    .locals 3

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    sget-object p0, Li1/r;->b:Li1/r$a;

    .line 7
    .line 8
    invoke-static {p0}, Lw/I0;->d(Li1/r$a;)J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    invoke-static {v1, v2}, Li1/r;->b(J)Li1/r;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 p5, 0x0

    .line 17
    const/4 v1, 0x0

    .line 18
    const/high16 v2, 0x43c80000    # 400.0f

    .line 19
    .line 20
    invoke-static {v1, v2, p0, v0, p5}, Lw/j;->h(FFLjava/lang/Object;ILjava/lang/Object;)Lw/h0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 25
    .line 26
    if-eqz p5, :cond_1

    .line 27
    .line 28
    sget-object p1, Ll0/e;->a:Ll0/e$a;

    .line 29
    .line 30
    invoke-virtual {p1}, Ll0/e$a;->c()Ll0/e;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :cond_1
    and-int/lit8 p5, p4, 0x4

    .line 35
    .line 36
    if-eqz p5, :cond_2

    .line 37
    .line 38
    move p2, v0

    .line 39
    :cond_2
    and-int/lit8 p4, p4, 0x8

    .line 40
    .line 41
    if-eqz p4, :cond_3

    .line 42
    .line 43
    sget-object p3, Landroidx/compose/animation/f$l;->a:Landroidx/compose/animation/f$l;

    .line 44
    .line 45
    :cond_3
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/animation/f;->h(Lw/G;Ll0/e;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/h;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method

.method public static final j(Lw/G;Ll0/e$c;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/h;
    .locals 1

    .line 1
    invoke-static {p1}, Landroidx/compose/animation/f;->F(Ll0/e$c;)Ll0/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Landroidx/compose/animation/f$n;

    .line 6
    .line 7
    invoke-direct {v0, p3}, Landroidx/compose/animation/f$n;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0, p1, p2, v0}, Landroidx/compose/animation/f;->h(Lw/G;Ll0/e;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/h;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static synthetic k(Lw/G;Ll0/e$c;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/animation/h;
    .locals 3

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    sget-object p0, Li1/r;->b:Li1/r$a;

    .line 7
    .line 8
    invoke-static {p0}, Lw/I0;->d(Li1/r$a;)J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    invoke-static {v1, v2}, Li1/r;->b(J)Li1/r;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 p5, 0x0

    .line 17
    const/4 v1, 0x0

    .line 18
    const/high16 v2, 0x43c80000    # 400.0f

    .line 19
    .line 20
    invoke-static {v1, v2, p0, v0, p5}, Lw/j;->h(FFLjava/lang/Object;ILjava/lang/Object;)Lw/h0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 25
    .line 26
    if-eqz p5, :cond_1

    .line 27
    .line 28
    sget-object p1, Ll0/e;->a:Ll0/e$a;

    .line 29
    .line 30
    invoke-virtual {p1}, Ll0/e$a;->a()Ll0/e$c;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :cond_1
    and-int/lit8 p5, p4, 0x4

    .line 35
    .line 36
    if-eqz p5, :cond_2

    .line 37
    .line 38
    move p2, v0

    .line 39
    :cond_2
    and-int/lit8 p4, p4, 0x8

    .line 40
    .line 41
    if-eqz p4, :cond_3

    .line 42
    .line 43
    sget-object p3, Landroidx/compose/animation/f$m;->a:Landroidx/compose/animation/f$m;

    .line 44
    .line 45
    :cond_3
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/animation/f;->j(Lw/G;Ll0/e$c;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/h;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method

.method public static final l(Lw/G;F)Landroidx/compose/animation/h;
    .locals 10

    .line 1
    new-instance v0, Landroidx/compose/animation/i;

    .line 2
    .line 3
    new-instance v1, Lv/B;

    .line 4
    .line 5
    new-instance v2, Lv/n;

    .line 6
    .line 7
    invoke-direct {v2, p1, p0}, Lv/n;-><init>(FLw/G;)V

    .line 8
    .line 9
    .line 10
    const/16 v8, 0x3e

    .line 11
    .line 12
    const/4 v9, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x0

    .line 18
    invoke-direct/range {v1 .. v9}, Lv/B;-><init>(Lv/n;Lv/x;Lv/h;Lv/u;ZLjava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1}, Landroidx/compose/animation/i;-><init>(Lv/B;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public static synthetic m(Lw/G;FILjava/lang/Object;)Landroidx/compose/animation/h;
    .locals 2

    .line 1
    and-int/lit8 p3, p2, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    const/high16 p0, 0x43c80000    # 400.0f

    .line 7
    .line 8
    const/4 p3, 0x5

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {v0, p0, v1, p3, v1}, Lw/j;->h(FFLjava/lang/Object;ILjava/lang/Object;)Lw/h0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_0
    and-int/lit8 p2, p2, 0x2

    .line 15
    .line 16
    if-eqz p2, :cond_1

    .line 17
    .line 18
    move p1, v0

    .line 19
    :cond_1
    invoke-static {p0, p1}, Landroidx/compose/animation/f;->l(Lw/G;F)Landroidx/compose/animation/h;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public static final n(Lw/G;F)Landroidx/compose/animation/j;
    .locals 10

    .line 1
    new-instance v0, Landroidx/compose/animation/k;

    .line 2
    .line 3
    new-instance v1, Lv/B;

    .line 4
    .line 5
    new-instance v2, Lv/n;

    .line 6
    .line 7
    invoke-direct {v2, p1, p0}, Lv/n;-><init>(FLw/G;)V

    .line 8
    .line 9
    .line 10
    const/16 v8, 0x3e

    .line 11
    .line 12
    const/4 v9, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x0

    .line 18
    invoke-direct/range {v1 .. v9}, Lv/B;-><init>(Lv/n;Lv/x;Lv/h;Lv/u;ZLjava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1}, Landroidx/compose/animation/k;-><init>(Lv/B;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public static synthetic o(Lw/G;FILjava/lang/Object;)Landroidx/compose/animation/j;
    .locals 2

    .line 1
    and-int/lit8 p3, p2, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    const/high16 p0, 0x43c80000    # 400.0f

    .line 7
    .line 8
    const/4 p3, 0x5

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {v0, p0, v1, p3, v1}, Lw/j;->h(FFLjava/lang/Object;ILjava/lang/Object;)Lw/h0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_0
    and-int/lit8 p2, p2, 0x2

    .line 15
    .line 16
    if-eqz p2, :cond_1

    .line 17
    .line 18
    move p1, v0

    .line 19
    :cond_1
    invoke-static {p0, p1}, Landroidx/compose/animation/f;->n(Lw/G;F)Landroidx/compose/animation/j;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public static final p(Lw/G;FJ)Landroidx/compose/animation/h;
    .locals 10

    .line 1
    new-instance v0, Landroidx/compose/animation/i;

    .line 2
    .line 3
    new-instance v1, Lv/B;

    .line 4
    .line 5
    new-instance v2, Lv/u;

    .line 6
    .line 7
    const/4 v7, 0x0

    .line 8
    move-object v6, p0

    .line 9
    move v3, p1

    .line 10
    move-wide v4, p2

    .line 11
    invoke-direct/range {v2 .. v7}, Lv/u;-><init>(FJLw/G;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    .line 13
    .line 14
    const/16 v8, 0x37

    .line 15
    .line 16
    const/4 v9, 0x0

    .line 17
    move-object v5, v2

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v6, 0x0

    .line 22
    invoke-direct/range {v1 .. v9}, Lv/B;-><init>(Lv/n;Lv/x;Lv/h;Lv/u;ZLjava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v1}, Landroidx/compose/animation/i;-><init>(Lv/B;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public static synthetic q(Lw/G;FJILjava/lang/Object;)Landroidx/compose/animation/h;
    .locals 2

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    const/high16 p0, 0x43c80000    # 400.0f

    .line 7
    .line 8
    const/4 p5, 0x5

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {v0, p0, v1, p5, v1}, Lw/j;->h(FFLjava/lang/Object;ILjava/lang/Object;)Lw/h0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 15
    .line 16
    if-eqz p5, :cond_1

    .line 17
    .line 18
    move p1, v0

    .line 19
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 20
    .line 21
    if-eqz p4, :cond_2

    .line 22
    .line 23
    sget-object p2, Landroidx/compose/ui/graphics/j;->b:Landroidx/compose/ui/graphics/j$a;

    .line 24
    .line 25
    invoke-virtual {p2}, Landroidx/compose/ui/graphics/j$a;->a()J

    .line 26
    .line 27
    .line 28
    move-result-wide p2

    .line 29
    :cond_2
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/animation/f;->p(Lw/G;FJ)Landroidx/compose/animation/h;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public static final r(Lw/G;Ll0/e;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/j;
    .locals 10

    .line 1
    new-instance v0, Landroidx/compose/animation/k;

    .line 2
    .line 3
    new-instance v1, Lv/B;

    .line 4
    .line 5
    new-instance v4, Lv/h;

    .line 6
    .line 7
    invoke-direct {v4, p1, p3, p0, p2}, Lv/h;-><init>(Ll0/e;Lkotlin/jvm/functions/Function1;Lw/G;Z)V

    .line 8
    .line 9
    .line 10
    const/16 v8, 0x3b

    .line 11
    .line 12
    const/4 v9, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x0

    .line 18
    invoke-direct/range {v1 .. v9}, Lv/B;-><init>(Lv/n;Lv/x;Lv/h;Lv/u;ZLjava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1}, Landroidx/compose/animation/k;-><init>(Lv/B;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public static synthetic s(Lw/G;Ll0/e;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/animation/j;
    .locals 3

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    sget-object p0, Li1/r;->b:Li1/r$a;

    .line 7
    .line 8
    invoke-static {p0}, Lw/I0;->d(Li1/r$a;)J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    invoke-static {v1, v2}, Li1/r;->b(J)Li1/r;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 p5, 0x0

    .line 17
    const/4 v1, 0x0

    .line 18
    const/high16 v2, 0x43c80000    # 400.0f

    .line 19
    .line 20
    invoke-static {v1, v2, p0, v0, p5}, Lw/j;->h(FFLjava/lang/Object;ILjava/lang/Object;)Lw/h0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 25
    .line 26
    if-eqz p5, :cond_1

    .line 27
    .line 28
    sget-object p1, Ll0/e;->a:Ll0/e$a;

    .line 29
    .line 30
    invoke-virtual {p1}, Ll0/e$a;->c()Ll0/e;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :cond_1
    and-int/lit8 p5, p4, 0x4

    .line 35
    .line 36
    if-eqz p5, :cond_2

    .line 37
    .line 38
    move p2, v0

    .line 39
    :cond_2
    and-int/lit8 p4, p4, 0x8

    .line 40
    .line 41
    if-eqz p4, :cond_3

    .line 42
    .line 43
    sget-object p3, Landroidx/compose/animation/f$o;->a:Landroidx/compose/animation/f$o;

    .line 44
    .line 45
    :cond_3
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/animation/f;->r(Lw/G;Ll0/e;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/j;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method

.method public static final t(Lw/G;Ll0/e$c;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/j;
    .locals 1

    .line 1
    invoke-static {p1}, Landroidx/compose/animation/f;->F(Ll0/e$c;)Ll0/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Landroidx/compose/animation/f$q;

    .line 6
    .line 7
    invoke-direct {v0, p3}, Landroidx/compose/animation/f$q;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0, p1, p2, v0}, Landroidx/compose/animation/f;->r(Lw/G;Ll0/e;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/j;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static synthetic u(Lw/G;Ll0/e$c;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/animation/j;
    .locals 3

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    sget-object p0, Li1/r;->b:Li1/r$a;

    .line 7
    .line 8
    invoke-static {p0}, Lw/I0;->d(Li1/r$a;)J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    invoke-static {v1, v2}, Li1/r;->b(J)Li1/r;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 p5, 0x0

    .line 17
    const/4 v1, 0x0

    .line 18
    const/high16 v2, 0x43c80000    # 400.0f

    .line 19
    .line 20
    invoke-static {v1, v2, p0, v0, p5}, Lw/j;->h(FFLjava/lang/Object;ILjava/lang/Object;)Lw/h0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 25
    .line 26
    if-eqz p5, :cond_1

    .line 27
    .line 28
    sget-object p1, Ll0/e;->a:Ll0/e$a;

    .line 29
    .line 30
    invoke-virtual {p1}, Ll0/e$a;->a()Ll0/e$c;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :cond_1
    and-int/lit8 p5, p4, 0x4

    .line 35
    .line 36
    if-eqz p5, :cond_2

    .line 37
    .line 38
    move p2, v0

    .line 39
    :cond_2
    and-int/lit8 p4, p4, 0x8

    .line 40
    .line 41
    if-eqz p4, :cond_3

    .line 42
    .line 43
    sget-object p3, Landroidx/compose/animation/f$p;->a:Landroidx/compose/animation/f$p;

    .line 44
    .line 45
    :cond_3
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/animation/f;->t(Lw/G;Ll0/e$c;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/j;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method

.method public static final v(Lw/G;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/h;
    .locals 10

    .line 1
    new-instance v0, Landroidx/compose/animation/i;

    .line 2
    .line 3
    new-instance v1, Lv/B;

    .line 4
    .line 5
    new-instance v3, Lv/x;

    .line 6
    .line 7
    invoke-direct {v3, p1, p0}, Lv/x;-><init>(Lkotlin/jvm/functions/Function1;Lw/G;)V

    .line 8
    .line 9
    .line 10
    const/16 v8, 0x3d

    .line 11
    .line 12
    const/4 v9, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x0

    .line 18
    invoke-direct/range {v1 .. v9}, Lv/B;-><init>(Lv/n;Lv/x;Lv/h;Lv/u;ZLjava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1}, Landroidx/compose/animation/i;-><init>(Lv/B;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public static final w(Lw/G;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/h;
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/animation/f$s;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroidx/compose/animation/f$s;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Landroidx/compose/animation/f;->v(Lw/G;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/h;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic x(Lw/G;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/animation/h;
    .locals 3

    .line 1
    and-int/lit8 p3, p2, 0x1

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    sget-object p0, Li1/n;->b:Li1/n$a;

    .line 6
    .line 7
    invoke-static {p0}, Lw/I0;->c(Li1/n$a;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {v0, v1}, Li1/n;->c(J)Li1/n;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/4 p3, 0x0

    .line 16
    const/4 v0, 0x0

    .line 17
    const/high16 v1, 0x43c80000    # 400.0f

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-static {v0, v1, p0, v2, p3}, Lw/j;->h(FFLjava/lang/Object;ILjava/lang/Object;)Lw/h0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :cond_0
    and-int/lit8 p2, p2, 0x2

    .line 25
    .line 26
    if-eqz p2, :cond_1

    .line 27
    .line 28
    sget-object p1, Landroidx/compose/animation/f$r;->a:Landroidx/compose/animation/f$r;

    .line 29
    .line 30
    :cond_1
    invoke-static {p0, p1}, Landroidx/compose/animation/f;->w(Lw/G;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/h;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public static final y(Lw/G;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/h;
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/animation/f$u;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroidx/compose/animation/f$u;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Landroidx/compose/animation/f;->v(Lw/G;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/h;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic z(Lw/G;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/animation/h;
    .locals 3

    .line 1
    and-int/lit8 p3, p2, 0x1

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    sget-object p0, Li1/n;->b:Li1/n$a;

    .line 6
    .line 7
    invoke-static {p0}, Lw/I0;->c(Li1/n$a;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {v0, v1}, Li1/n;->c(J)Li1/n;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/4 p3, 0x0

    .line 16
    const/4 v0, 0x0

    .line 17
    const/high16 v1, 0x43c80000    # 400.0f

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-static {v0, v1, p0, v2, p3}, Lw/j;->h(FFLjava/lang/Object;ILjava/lang/Object;)Lw/h0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :cond_0
    and-int/lit8 p2, p2, 0x2

    .line 25
    .line 26
    if-eqz p2, :cond_1

    .line 27
    .line 28
    sget-object p1, Landroidx/compose/animation/f$t;->a:Landroidx/compose/animation/f$t;

    .line 29
    .line 30
    :cond_1
    invoke-static {p0, p1}, Landroidx/compose/animation/f;->y(Lw/G;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/h;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method
