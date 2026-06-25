.class public abstract Landroidx/compose/material3/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:LY/b1;

.field private static final b:LY/b1;

.field private static final c:Landroidx/compose/material3/b;

.field private static final d:Landroidx/compose/material3/b;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    sget-object v0, Landroidx/compose/material3/a$b;->a:Landroidx/compose/material3/a$b;

    .line 2
    .line 3
    invoke-static {v0}, LY/H;->j(Lie/a;)LY/b1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroidx/compose/material3/a;->a:LY/b1;

    .line 8
    .line 9
    sget-object v0, Landroidx/compose/material3/a$a;->a:Landroidx/compose/material3/a$a;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-static {v2, v0, v1, v2}, LY/H;->h(LY/T1;Lie/a;ILjava/lang/Object;)LY/b1;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Landroidx/compose/material3/a;->b:LY/b1;

    .line 18
    .line 19
    new-instance v1, Landroidx/compose/material3/b;

    .line 20
    .line 21
    sget-object v0, Li1/h;->b:Li1/h$a;

    .line 22
    .line 23
    invoke-virtual {v0}, Li1/h$a;->c()F

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    sget-object v7, Ls0/r0;->b:Ls0/r0$a;

    .line 28
    .line 29
    invoke-virtual {v7}, Ls0/r0$a;->j()J

    .line 30
    .line 31
    .line 32
    move-result-wide v4

    .line 33
    const/4 v6, 0x0

    .line 34
    const/4 v2, 0x1

    .line 35
    invoke-direct/range {v1 .. v6}, Landroidx/compose/material3/b;-><init>(ZFJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 36
    .line 37
    .line 38
    sput-object v1, Landroidx/compose/material3/a;->c:Landroidx/compose/material3/b;

    .line 39
    .line 40
    new-instance v8, Landroidx/compose/material3/b;

    .line 41
    .line 42
    invoke-virtual {v0}, Li1/h$a;->c()F

    .line 43
    .line 44
    .line 45
    move-result v10

    .line 46
    invoke-virtual {v7}, Ls0/r0$a;->j()J

    .line 47
    .line 48
    .line 49
    move-result-wide v11

    .line 50
    const/4 v13, 0x0

    .line 51
    const/4 v9, 0x0

    .line 52
    invoke-direct/range {v8 .. v13}, Landroidx/compose/material3/b;-><init>(ZFJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 53
    .line 54
    .line 55
    sput-object v8, Landroidx/compose/material3/a;->d:Landroidx/compose/material3/b;

    .line 56
    .line 57
    return-void
.end method

.method public static final a()LY/b1;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/material3/a;->b:LY/b1;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final b(ZFJ)Lx/I;
    .locals 6

    .line 1
    sget-object v0, Li1/h;->b:Li1/h$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Li1/h$a;->c()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {p1, v0}, Li1/h;->q(FF)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    sget-object v0, Ls0/r0;->b:Ls0/r0$a;

    .line 14
    .line 15
    invoke-virtual {v0}, Ls0/r0$a;->j()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    invoke-static {p2, p3, v0, v1}, Ls0/r0;->s(JJ)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    sget-object p0, Landroidx/compose/material3/a;->c:Landroidx/compose/material3/b;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_0
    sget-object p0, Landroidx/compose/material3/a;->d:Landroidx/compose/material3/b;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_1
    new-instance v0, Landroidx/compose/material3/b;

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    move v1, p0

    .line 37
    move v2, p1

    .line 38
    move-wide v3, p2

    .line 39
    invoke-direct/range {v0 .. v5}, Landroidx/compose/material3/b;-><init>(ZFJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 40
    .line 41
    .line 42
    return-object v0
.end method

.method public static synthetic c(ZFJILjava/lang/Object;)Lx/I;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 7
    .line 8
    if-eqz p5, :cond_1

    .line 9
    .line 10
    sget-object p1, Li1/h;->b:Li1/h$a;

    .line 11
    .line 12
    invoke-virtual {p1}, Li1/h$a;->c()F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 17
    .line 18
    if-eqz p4, :cond_2

    .line 19
    .line 20
    sget-object p2, Ls0/r0;->b:Ls0/r0$a;

    .line 21
    .line 22
    invoke-virtual {p2}, Ls0/r0$a;->j()J

    .line 23
    .line 24
    .line 25
    move-result-wide p2

    .line 26
    :cond_2
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/material3/a;->b(ZFJ)Lx/I;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public static final d(ZFJLY/m;II)Lx/G;
    .locals 7

    .line 1
    and-int/lit8 v0, p6, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    :cond_0
    move v0, p0

    .line 7
    and-int/lit8 p0, p6, 0x2

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    sget-object p0, Li1/h;->b:Li1/h$a;

    .line 12
    .line 13
    invoke-virtual {p0}, Li1/h$a;->c()F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    :cond_1
    move v1, p1

    .line 18
    and-int/lit8 p0, p6, 0x4

    .line 19
    .line 20
    if-eqz p0, :cond_2

    .line 21
    .line 22
    sget-object p0, Ls0/r0;->b:Ls0/r0$a;

    .line 23
    .line 24
    invoke-virtual {p0}, Ls0/r0$a;->j()J

    .line 25
    .line 26
    .line 27
    move-result-wide p2

    .line 28
    :cond_2
    move-wide v2, p2

    .line 29
    invoke-static {}, LY/w;->L()Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_3

    .line 34
    .line 35
    const/4 p0, -0x1

    .line 36
    const-string p1, "androidx.compose.material3.rippleOrFallbackImplementation (Ripple.kt:230)"

    .line 37
    .line 38
    const p2, -0x4e6dbd0b

    .line 39
    .line 40
    .line 41
    invoke-static {p2, p5, p0, p1}, LY/w;->U(IIILjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :cond_3
    const p0, -0x4c54e819

    .line 45
    .line 46
    .line 47
    invoke-interface {p4, p0}, LY/m;->V(I)V

    .line 48
    .line 49
    .line 50
    sget-object p0, Landroidx/compose/material3/a;->a:LY/b1;

    .line 51
    .line 52
    invoke-interface {p4, p0}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, Ljava/lang/Boolean;

    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_4

    .line 63
    .line 64
    and-int/lit16 v5, p5, 0x3fe

    .line 65
    .line 66
    const/4 v6, 0x0

    .line 67
    move-object v4, p4

    .line 68
    invoke-static/range {v0 .. v6}, LT/l;->f(ZFJLY/m;II)Lx/G;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    goto :goto_0

    .line 73
    :cond_4
    move-object v4, p4

    .line 74
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/material3/a;->b(ZFJ)Lx/I;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    :goto_0
    invoke-interface {v4}, LY/m;->O()V

    .line 79
    .line 80
    .line 81
    invoke-static {}, LY/w;->L()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_5

    .line 86
    .line 87
    invoke-static {}, LY/w;->T()V

    .line 88
    .line 89
    .line 90
    :cond_5
    return-object p0
.end method
