.class public abstract LK0/e0;
.super LK0/T;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LI0/A;
.implements LI0/p;
.implements LK0/q0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK0/e0$e;,
        LK0/e0$f;
    }
.end annotation


# static fields
.field public static final n0:LK0/e0$e;

.field private static final o0:Lkotlin/jvm/functions/Function1;

.field private static final p0:Lkotlin/jvm/functions/Function1;

.field private static final q0:Landroidx/compose/ui/graphics/h;

.field private static final r0:LK0/C;

.field private static final s0:[F

.field private static final t0:LK0/e0$f;

.field private static final u0:LK0/e0$f;


# instance fields
.field private A:F

.field private B:LI0/C;

.field private C:Lt/K;

.field private D:J

.field private E:F

.field private F:Lr0/d;

.field private G:LK0/C;

.field private H:Lv0/c;

.field private I:Ls0/j0;

.field private X:Lkotlin/jvm/functions/Function2;

.field private final Y:Lie/a;

.field private Z:Z

.field private l0:LK0/o0;

.field private m0:Lv0/c;

.field private final q:LK0/J;

.field private r:Z

.field private s:Z

.field private t:LK0/e0;

.field private u:LK0/e0;

.field private v:Z

.field private w:Z

.field private x:Lkotlin/jvm/functions/Function1;

.field private y:Li1/d;

.field private z:Li1/t;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LK0/e0$e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LK0/e0$e;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LK0/e0;->n0:LK0/e0$e;

    .line 8
    .line 9
    sget-object v0, LK0/e0$d;->a:LK0/e0$d;

    .line 10
    .line 11
    sput-object v0, LK0/e0;->o0:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    sget-object v0, LK0/e0$c;->a:LK0/e0$c;

    .line 14
    .line 15
    sput-object v0, LK0/e0;->p0:Lkotlin/jvm/functions/Function1;

    .line 16
    .line 17
    new-instance v0, Landroidx/compose/ui/graphics/h;

    .line 18
    .line 19
    invoke-direct {v0}, Landroidx/compose/ui/graphics/h;-><init>()V

    .line 20
    .line 21
    .line 22
    sput-object v0, LK0/e0;->q0:Landroidx/compose/ui/graphics/h;

    .line 23
    .line 24
    new-instance v0, LK0/C;

    .line 25
    .line 26
    invoke-direct {v0}, LK0/C;-><init>()V

    .line 27
    .line 28
    .line 29
    sput-object v0, LK0/e0;->r0:LK0/C;

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    invoke-static {v1, v0, v1}, Ls0/g1;->c([FILkotlin/jvm/internal/DefaultConstructorMarker;)[F

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sput-object v0, LK0/e0;->s0:[F

    .line 37
    .line 38
    new-instance v0, LK0/e0$a;

    .line 39
    .line 40
    invoke-direct {v0}, LK0/e0$a;-><init>()V

    .line 41
    .line 42
    .line 43
    sput-object v0, LK0/e0;->t0:LK0/e0$f;

    .line 44
    .line 45
    new-instance v0, LK0/e0$b;

    .line 46
    .line 47
    invoke-direct {v0}, LK0/e0$b;-><init>()V

    .line 48
    .line 49
    .line 50
    sput-object v0, LK0/e0;->u0:LK0/e0$f;

    .line 51
    .line 52
    return-void
.end method

.method public constructor <init>(LK0/J;)V
    .locals 2

    .line 1
    invoke-direct {p0}, LK0/T;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LK0/e0;->q:LK0/J;

    .line 5
    .line 6
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, LK0/J;->R()Li1/d;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, LK0/e0;->y:Li1/d;

    .line 15
    .line 16
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, LK0/J;->getLayoutDirection()Li1/t;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, LK0/e0;->z:Li1/t;

    .line 25
    .line 26
    const p1, 0x3f4ccccd    # 0.8f

    .line 27
    .line 28
    .line 29
    iput p1, p0, LK0/e0;->A:F

    .line 30
    .line 31
    sget-object p1, Li1/n;->b:Li1/n$a;

    .line 32
    .line 33
    invoke-virtual {p1}, Li1/n$a;->b()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    iput-wide v0, p0, LK0/e0;->D:J

    .line 38
    .line 39
    new-instance p1, LK0/e0$i;

    .line 40
    .line 41
    invoke-direct {p1, p0}, LK0/e0$i;-><init>(LK0/e0;)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, LK0/e0;->Y:Lie/a;

    .line 45
    .line 46
    return-void
.end method

.method public static synthetic A2(LK0/e0;JZILjava/lang/Object;)J
    .locals 0

    .line 1
    if-nez p5, :cond_1

    .line 2
    .line 3
    and-int/lit8 p4, p4, 0x2

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    const/4 p3, 0x1

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LK0/e0;->z2(JZ)J

    .line 9
    .line 10
    .line 11
    move-result-wide p0

    .line 12
    return-wide p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method

.method private final B2(Lr0/d;Z)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LK0/e0;->P1()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Li1/n;->k(J)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1}, Lr0/d;->b()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    int-to-float v0, v0

    .line 14
    sub-float/2addr v1, v0

    .line 15
    invoke-virtual {p1, v1}, Lr0/d;->i(F)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lr0/d;->c()F

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    sub-float/2addr v1, v0

    .line 23
    invoke-virtual {p1, v1}, Lr0/d;->j(F)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, LK0/e0;->P1()J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    invoke-static {v0, v1}, Li1/n;->l(J)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {p1}, Lr0/d;->d()F

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    int-to-float v0, v0

    .line 39
    sub-float/2addr v1, v0

    .line 40
    invoke-virtual {p1, v1}, Lr0/d;->k(F)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lr0/d;->a()F

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    sub-float/2addr v1, v0

    .line 48
    invoke-virtual {p1, v1}, Lr0/d;->h(F)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, LK0/e0;->l0:LK0/o0;

    .line 52
    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    invoke-interface {v0, p1, v1}, LK0/o0;->f(Lr0/d;Z)V

    .line 57
    .line 58
    .line 59
    iget-boolean v0, p0, LK0/e0;->w:Z

    .line 60
    .line 61
    if-eqz v0, :cond_0

    .line 62
    .line 63
    if-eqz p2, :cond_0

    .line 64
    .line 65
    invoke-virtual {p0}, LK0/e0;->a()J

    .line 66
    .line 67
    .line 68
    move-result-wide v0

    .line 69
    const/16 p2, 0x20

    .line 70
    .line 71
    shr-long/2addr v0, p2

    .line 72
    long-to-int p2, v0

    .line 73
    int-to-float p2, p2

    .line 74
    invoke-virtual {p0}, LK0/e0;->a()J

    .line 75
    .line 76
    .line 77
    move-result-wide v0

    .line 78
    const-wide v2, 0xffffffffL

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    and-long/2addr v0, v2

    .line 84
    long-to-int v0, v0

    .line 85
    int-to-float v0, v0

    .line 86
    const/4 v1, 0x0

    .line 87
    invoke-virtual {p1, v1, v1, p2, v0}, Lr0/d;->e(FFFF)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Lr0/d;->f()Z

    .line 91
    .line 92
    .line 93
    :cond_0
    return-void
.end method

.method public static synthetic B3(LK0/e0;JZILjava/lang/Object;)J
    .locals 0

    .line 1
    if-nez p5, :cond_1

    .line 2
    .line 3
    and-int/lit8 p4, p4, 0x2

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    const/4 p3, 0x1

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LK0/e0;->A3(JZ)J

    .line 9
    .line 10
    .line 11
    move-result-wide p0

    .line 12
    return-wide p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method

.method private final D2()Lkotlin/jvm/functions/Function2;
    .locals 2

    .line 1
    iget-object v0, p0, LK0/e0;->X:Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LK0/e0$h;

    .line 6
    .line 7
    invoke-direct {v0, p0}, LK0/e0$h;-><init>(LK0/e0;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, LK0/e0$g;

    .line 11
    .line 12
    invoke-direct {v1, p0, v0}, LK0/e0$g;-><init>(LK0/e0;Lie/a;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, LK0/e0;->X:Lkotlin/jvm/functions/Function2;

    .line 16
    .line 17
    return-object v1

    .line 18
    :cond_0
    return-object v0
.end method

.method private final D3(LK0/e0;[F)V
    .locals 6

    .line 1
    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, LK0/e0;->u:LK0/e0;

    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p1, p2}, LK0/e0;->D3(LK0/e0;[F)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, LK0/e0;->P1()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    sget-object p1, Li1/n;->b:Li1/n$a;

    .line 20
    .line 21
    invoke-virtual {p1}, Li1/n$a;->b()J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    invoke-static {v0, v1, v2, v3}, Li1/n;->j(JJ)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    sget-object v0, LK0/e0;->s0:[F

    .line 32
    .line 33
    invoke-static {v0}, Ls0/g1;->h([F)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, LK0/e0;->P1()J

    .line 37
    .line 38
    .line 39
    move-result-wide v1

    .line 40
    invoke-static {v1, v2}, Li1/n;->k(J)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    int-to-float p1, p1

    .line 45
    neg-float v1, p1

    .line 46
    invoke-virtual {p0}, LK0/e0;->P1()J

    .line 47
    .line 48
    .line 49
    move-result-wide v2

    .line 50
    invoke-static {v2, v3}, Li1/n;->l(J)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    int-to-float p1, p1

    .line 55
    neg-float v2, p1

    .line 56
    const/4 v4, 0x4

    .line 57
    const/4 v5, 0x0

    .line 58
    const/4 v3, 0x0

    .line 59
    invoke-static/range {v0 .. v5}, Ls0/g1;->o([FFFFILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-static {p2, v0}, Ls0/g1;->l([F[F)V

    .line 63
    .line 64
    .line 65
    :cond_0
    iget-object p1, p0, LK0/e0;->l0:LK0/o0;

    .line 66
    .line 67
    if-eqz p1, :cond_1

    .line 68
    .line 69
    invoke-interface {p1, p2}, LK0/o0;->j([F)V

    .line 70
    .line 71
    .line 72
    :cond_1
    return-void
.end method

.method private final E3(LK0/e0;[F)V
    .locals 10

    .line 1
    move-object v0, p0

    .line 2
    :goto_0
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-nez v1, :cond_2

    .line 7
    .line 8
    iget-object v1, v0, LK0/e0;->l0:LK0/o0;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-interface {v1, p2}, LK0/o0;->a([F)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, LK0/e0;->P1()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    sget-object v3, Li1/n;->b:Li1/n$a;

    .line 20
    .line 21
    invoke-virtual {v3}, Li1/n$a;->b()J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    invoke-static {v1, v2, v3, v4}, Li1/n;->j(JJ)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    sget-object v4, LK0/e0;->s0:[F

    .line 32
    .line 33
    invoke-static {v4}, Ls0/g1;->h([F)V

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v2}, Li1/n;->k(J)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    int-to-float v5, v3

    .line 41
    invoke-static {v1, v2}, Li1/n;->l(J)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    int-to-float v6, v1

    .line 46
    const/4 v8, 0x4

    .line 47
    const/4 v9, 0x0

    .line 48
    const/4 v7, 0x0

    .line 49
    invoke-static/range {v4 .. v9}, Ls0/g1;->o([FFFFILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-static {p2, v4}, Ls0/g1;->l([F[F)V

    .line 53
    .line 54
    .line 55
    :cond_1
    iget-object v0, v0, LK0/e0;->u:LK0/e0;

    .line 56
    .line 57
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    return-void
.end method

.method public static synthetic G3(LK0/e0;Lkotlin/jvm/functions/Function1;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x2

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, LK0/e0;->F3(Lkotlin/jvm/functions/Function1;Z)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    const-string p1, "Super calls with default arguments not supported in this target, function: updateLayerBlock"

    .line 15
    .line 16
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method

.method private final H3(Z)Z
    .locals 6

    .line 1
    iget-object v0, p0, LK0/e0;->m0:Lv0/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v0, p0, LK0/e0;->l0:LK0/o0;

    .line 8
    .line 9
    if-eqz v0, :cond_5

    .line 10
    .line 11
    iget-object v1, p0, LK0/e0;->x:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    if-eqz v1, :cond_4

    .line 14
    .line 15
    sget-object v2, LK0/e0;->q0:Landroidx/compose/ui/graphics/h;

    .line 16
    .line 17
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/h;->Z()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v3}, LK0/J;->R()Li1/d;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v2, v3}, Landroidx/compose/ui/graphics/h;->c0(Li1/d;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v3}, LK0/J;->getLayoutDirection()Li1/t;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v2, v3}, Landroidx/compose/ui/graphics/h;->f0(Li1/t;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, LK0/e0;->a()J

    .line 43
    .line 44
    .line 45
    move-result-wide v3

    .line 46
    invoke-static {v3, v4}, Li1/s;->d(J)J

    .line 47
    .line 48
    .line 49
    move-result-wide v3

    .line 50
    invoke-virtual {v2, v3, v4}, Landroidx/compose/ui/graphics/h;->h0(J)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p0}, LK0/e0;->M2()LK0/r0;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    sget-object v4, LK0/e0;->o0:Lkotlin/jvm/functions/Function1;

    .line 58
    .line 59
    new-instance v5, LK0/e0$l;

    .line 60
    .line 61
    invoke-direct {v5, v1}, LK0/e0$l;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, p0, v4, v5}, LK0/r0;->i(LK0/q0;Lkotlin/jvm/functions/Function1;Lie/a;)V

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, LK0/e0;->G:LK0/C;

    .line 68
    .line 69
    if-nez v1, :cond_1

    .line 70
    .line 71
    new-instance v1, LK0/C;

    .line 72
    .line 73
    invoke-direct {v1}, LK0/C;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object v1, p0, LK0/e0;->G:LK0/C;

    .line 77
    .line 78
    :cond_1
    sget-object v3, LK0/e0;->r0:LK0/C;

    .line 79
    .line 80
    invoke-virtual {v3, v1}, LK0/C;->a(LK0/C;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v2}, LK0/C;->b(Landroidx/compose/ui/graphics/g;)V

    .line 84
    .line 85
    .line 86
    invoke-interface {v0, v2}, LK0/o0;->h(Landroidx/compose/ui/graphics/h;)V

    .line 87
    .line 88
    .line 89
    iget-boolean v0, p0, LK0/e0;->w:Z

    .line 90
    .line 91
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/h;->q()Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    iput-boolean v4, p0, LK0/e0;->w:Z

    .line 96
    .line 97
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/h;->b()F

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    iput v2, p0, LK0/e0;->A:F

    .line 102
    .line 103
    invoke-virtual {v3, v1}, LK0/C;->c(LK0/C;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    xor-int/lit8 v2, v1, 0x1

    .line 108
    .line 109
    if-eqz p1, :cond_3

    .line 110
    .line 111
    if-eqz v1, :cond_2

    .line 112
    .line 113
    iget-boolean p1, p0, LK0/e0;->w:Z

    .line 114
    .line 115
    if-eq v0, p1, :cond_3

    .line 116
    .line 117
    :cond_2
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {p1}, LK0/J;->z0()LK0/p0;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    if-eqz p1, :cond_3

    .line 126
    .line 127
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-interface {p1, v0}, LK0/p0;->t(LK0/J;)V

    .line 132
    .line 133
    .line 134
    :cond_3
    return v2

    .line 135
    :cond_4
    const-string p1, "updateLayerParameters requires a non-null layerBlock"

    .line 136
    .line 137
    invoke-static {p1}, LH0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    .line 138
    .line 139
    .line 140
    new-instance p1, LTd/k;

    .line 141
    .line 142
    invoke-direct {p1}, LTd/k;-><init>()V

    .line 143
    .line 144
    .line 145
    throw p1

    .line 146
    :cond_5
    iget-object p1, p0, LK0/e0;->x:Lkotlin/jvm/functions/Function1;

    .line 147
    .line 148
    if-nez p1, :cond_6

    .line 149
    .line 150
    const/4 p1, 0x1

    .line 151
    goto :goto_0

    .line 152
    :cond_6
    move p1, v1

    .line 153
    :goto_0
    if-nez p1, :cond_7

    .line 154
    .line 155
    const-string p1, "null layer with a non-null layerBlock"

    .line 156
    .line 157
    invoke-static {p1}, LH0/a;->b(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    :cond_7
    return v1
.end method

.method static synthetic I3(LK0/e0;ZILjava/lang/Object;)Z
    .locals 0

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    const/4 p3, 0x1

    .line 4
    and-int/2addr p2, p3

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    move p1, p3

    .line 8
    :cond_0
    invoke-direct {p0, p1}, LK0/e0;->H3(Z)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: updateLayerParameters"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method

.method private final M2()LK0/r0;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LK0/N;->b(LK0/J;)LK0/p0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, LK0/p0;->getSnapshotObserver()LK0/r0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method private final R2(I)Z
    .locals 2

    .line 1
    invoke-static {p1}, LK0/h0;->i(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0, v0}, LK0/e0;->T2(Z)Landroidx/compose/ui/e$c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v0, p1}, LK0/k;->f(LK0/j;I)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/4 v0, 0x1

    .line 17
    if-ne p1, v0, :cond_0

    .line 18
    .line 19
    return v0

    .line 20
    :cond_0
    return v1
.end method

.method private final T2(Z)Landroidx/compose/ui/e$c;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK0/J;->w0()LK0/e0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-ne v0, p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, LK0/J;->t0()LK0/c0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    iget-object p1, p0, LK0/e0;->u:LK0/e0;

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1}, LK0/e0;->N2()Landroidx/compose/ui/e$c;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    :cond_1
    return-object v0

    .line 43
    :cond_2
    iget-object p1, p0, LK0/e0;->u:LK0/e0;

    .line 44
    .line 45
    if-eqz p1, :cond_3

    .line 46
    .line 47
    invoke-virtual {p1}, LK0/e0;->N2()Landroidx/compose/ui/e$c;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1

    .line 52
    :cond_3
    return-object v0
.end method

.method private final U2(Landroidx/compose/ui/e$c;LK0/e0$f;JLK0/w;IZ)V
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p2

    .line 5
    move-wide v2, p3

    .line 6
    move-object v4, p5

    .line 7
    move v5, p6

    .line 8
    move v6, p7

    .line 9
    invoke-virtual/range {v0 .. v6}, LK0/e0;->X2(LK0/e0$f;JLK0/w;IZ)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    move-object v1, p2

    .line 14
    move-wide v2, p3

    .line 15
    move-object v4, p5

    .line 16
    move v5, p6

    .line 17
    move v6, p7

    .line 18
    invoke-static {v4}, LK0/w;->e(LK0/w;)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-static {v4}, LK0/w;->e(LK0/w;)I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    add-int/lit8 p3, p3, 0x1

    .line 27
    .line 28
    invoke-virtual {v4}, LK0/w;->size()I

    .line 29
    .line 30
    .line 31
    move-result p4

    .line 32
    invoke-static {v4, p3, p4}, LK0/w;->i(LK0/w;II)V

    .line 33
    .line 34
    .line 35
    invoke-static {v4}, LK0/w;->e(LK0/w;)I

    .line 36
    .line 37
    .line 38
    move-result p3

    .line 39
    add-int/lit8 p3, p3, 0x1

    .line 40
    .line 41
    invoke-static {v4, p3}, LK0/w;->l(LK0/w;I)V

    .line 42
    .line 43
    .line 44
    invoke-static {v4}, LK0/w;->f(LK0/w;)Lt/L;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    invoke-virtual {p3, p1}, Lt/L;->k(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    invoke-static {v4}, LK0/w;->d(LK0/w;)Lt/H;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    const/high16 p4, -0x40800000    # -1.0f

    .line 56
    .line 57
    const/4 p5, 0x0

    .line 58
    invoke-static {p4, v6, p5}, LK0/x;->c(FZZ)J

    .line 59
    .line 60
    .line 61
    move-result-wide p4

    .line 62
    invoke-virtual {p3, p4, p5}, Lt/H;->d(J)Z

    .line 63
    .line 64
    .line 65
    invoke-interface {v1}, LK0/e0$f;->a()I

    .line 66
    .line 67
    .line 68
    move-result p3

    .line 69
    const/4 p4, 0x2

    .line 70
    invoke-static {p4}, LK0/g0;->a(I)I

    .line 71
    .line 72
    .line 73
    move-result p4

    .line 74
    invoke-static {p1, p3, p4}, LK0/f0;->b(LK0/j;II)Landroidx/compose/ui/e$c;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    move-object v0, p0

    .line 79
    move v7, v6

    .line 80
    move v6, v5

    .line 81
    move-object v5, v4

    .line 82
    move-wide v3, v2

    .line 83
    move-object v2, v1

    .line 84
    move-object v1, p1

    .line 85
    invoke-direct/range {v0 .. v7}, LK0/e0;->U2(Landroidx/compose/ui/e$c;LK0/e0$f;JLK0/w;IZ)V

    .line 86
    .line 87
    .line 88
    move-object v4, v5

    .line 89
    invoke-static {v4, p2}, LK0/w;->l(LK0/w;I)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method private final V2(Landroidx/compose/ui/e$c;LK0/e0$f;JLK0/w;IZF)V
    .locals 11

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p2

    .line 5
    move-wide v2, p3

    .line 6
    move-object/from16 v4, p5

    .line 7
    .line 8
    move/from16 v5, p6

    .line 9
    .line 10
    move/from16 v6, p7

    .line 11
    .line 12
    invoke-virtual/range {v0 .. v6}, LK0/e0;->X2(LK0/e0$f;JLK0/w;IZ)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    move-object/from16 v4, p5

    .line 17
    .line 18
    invoke-static {v4}, LK0/w;->e(LK0/w;)I

    .line 19
    .line 20
    .line 21
    move-result v10

    .line 22
    invoke-static {v4}, LK0/w;->e(LK0/w;)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    invoke-virtual {v4}, LK0/w;->size()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-static {v4, v0, v1}, LK0/w;->i(LK0/w;II)V

    .line 33
    .line 34
    .line 35
    invoke-static {v4}, LK0/w;->e(LK0/w;)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    add-int/lit8 v0, v0, 0x1

    .line 40
    .line 41
    invoke-static {v4, v0}, LK0/w;->l(LK0/w;I)V

    .line 42
    .line 43
    .line 44
    invoke-static {v4}, LK0/w;->f(LK0/w;)Lt/L;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0, p1}, Lt/L;->k(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    invoke-static {v4}, LK0/w;->d(LK0/w;)Lt/H;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const/4 v1, 0x0

    .line 56
    move/from16 v7, p7

    .line 57
    .line 58
    move/from16 v8, p8

    .line 59
    .line 60
    invoke-static {v8, v7, v1}, LK0/x;->c(FZZ)J

    .line 61
    .line 62
    .line 63
    move-result-wide v1

    .line 64
    invoke-virtual {v0, v1, v2}, Lt/H;->d(J)Z

    .line 65
    .line 66
    .line 67
    invoke-interface {p2}, LK0/e0$f;->a()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    const/4 v1, 0x2

    .line 72
    invoke-static {v1}, LK0/g0;->a(I)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    invoke-static {p1, v0, v1}, LK0/f0;->b(LK0/j;II)Landroidx/compose/ui/e$c;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    const/4 v9, 0x1

    .line 81
    move-object v0, p0

    .line 82
    move-object v2, p2

    .line 83
    move/from16 v6, p6

    .line 84
    .line 85
    move-object v5, v4

    .line 86
    move-wide v3, p3

    .line 87
    invoke-direct/range {v0 .. v9}, LK0/e0;->l3(Landroidx/compose/ui/e$c;LK0/e0$f;JLK0/w;IZFZ)V

    .line 88
    .line 89
    .line 90
    move-object v4, v5

    .line 91
    invoke-static {v4, v10}, LK0/w;->l(LK0/w;I)V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method private final Z2(Landroidx/compose/ui/e$c;JI)Z
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    sget-object v1, LE0/Q;->a:LE0/Q$a;

    .line 6
    .line 7
    invoke-virtual {v1}, LE0/Q$a;->c()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-static {p4, v2}, LE0/Q;->g(II)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {v1}, LE0/Q$a;->a()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {p4, v1}, LE0/Q;->g(II)Z

    .line 22
    .line 23
    .line 24
    move-result p4

    .line 25
    if-nez p4, :cond_1

    .line 26
    .line 27
    return v0

    .line 28
    :cond_1
    const/16 p4, 0x10

    .line 29
    .line 30
    invoke-static {p4}, LK0/g0;->a(I)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v2, 0x0

    .line 35
    move-object v3, v2

    .line 36
    :goto_0
    if-eqz p1, :cond_a

    .line 37
    .line 38
    instance-of v4, p1, LK0/v0;

    .line 39
    .line 40
    const/4 v5, 0x1

    .line 41
    if-eqz v4, :cond_3

    .line 42
    .line 43
    check-cast p1, LK0/v0;

    .line 44
    .line 45
    invoke-interface {p1}, LK0/v0;->G0()J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    const/16 p1, 0x20

    .line 50
    .line 51
    shr-long v3, p2, p1

    .line 52
    .line 53
    long-to-int p1, v3

    .line 54
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 55
    .line 56
    .line 57
    move-result p4

    .line 58
    invoke-virtual {p0}, LK0/e0;->getLayoutDirection()Li1/t;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-static {v1, v2, v3}, LK0/F0;->b(JLi1/t;)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    neg-int v3, v3

    .line 67
    int-to-float v3, v3

    .line 68
    cmpl-float p4, p4, v3

    .line 69
    .line 70
    if-ltz p4, :cond_2

    .line 71
    .line 72
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    invoke-virtual {p0}, Landroidx/compose/ui/layout/s;->S0()I

    .line 77
    .line 78
    .line 79
    move-result p4

    .line 80
    invoke-virtual {p0}, LK0/e0;->getLayoutDirection()Li1/t;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-static {v1, v2, v3}, LK0/F0;->c(JLi1/t;)I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    add-int/2addr p4, v3

    .line 89
    int-to-float p4, p4

    .line 90
    cmpg-float p1, p1, p4

    .line 91
    .line 92
    if-gez p1, :cond_2

    .line 93
    .line 94
    const-wide v3, 0xffffffffL

    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    and-long p1, p2, v3

    .line 100
    .line 101
    long-to-int p1, p1

    .line 102
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    invoke-static {v1, v2}, LK0/F0;->h(J)I

    .line 107
    .line 108
    .line 109
    move-result p3

    .line 110
    neg-int p3, p3

    .line 111
    int-to-float p3, p3

    .line 112
    cmpl-float p2, p2, p3

    .line 113
    .line 114
    if-ltz p2, :cond_2

    .line 115
    .line 116
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    invoke-virtual {p0}, Landroidx/compose/ui/layout/s;->Q0()I

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    invoke-static {v1, v2}, LK0/F0;->e(J)I

    .line 125
    .line 126
    .line 127
    move-result p3

    .line 128
    add-int/2addr p2, p3

    .line 129
    int-to-float p2, p2

    .line 130
    cmpg-float p1, p1, p2

    .line 131
    .line 132
    if-gez p1, :cond_2

    .line 133
    .line 134
    return v5

    .line 135
    :cond_2
    return v0

    .line 136
    :cond_3
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    and-int/2addr v4, v1

    .line 141
    if-eqz v4, :cond_9

    .line 142
    .line 143
    instance-of v4, p1, LK0/m;

    .line 144
    .line 145
    if-eqz v4, :cond_9

    .line 146
    .line 147
    move-object v4, p1

    .line 148
    check-cast v4, LK0/m;

    .line 149
    .line 150
    invoke-virtual {v4}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    move v6, v0

    .line 155
    :goto_1
    if-eqz v4, :cond_8

    .line 156
    .line 157
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 158
    .line 159
    .line 160
    move-result v7

    .line 161
    and-int/2addr v7, v1

    .line 162
    if-eqz v7, :cond_7

    .line 163
    .line 164
    add-int/lit8 v6, v6, 0x1

    .line 165
    .line 166
    if-ne v6, v5, :cond_4

    .line 167
    .line 168
    move-object p1, v4

    .line 169
    goto :goto_2

    .line 170
    :cond_4
    if-nez v3, :cond_5

    .line 171
    .line 172
    new-instance v3, La0/c;

    .line 173
    .line 174
    new-array v7, p4, [Landroidx/compose/ui/e$c;

    .line 175
    .line 176
    invoke-direct {v3, v7, v0}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 177
    .line 178
    .line 179
    :cond_5
    if-eqz p1, :cond_6

    .line 180
    .line 181
    invoke-virtual {v3, p1}, La0/c;->c(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-object p1, v2

    .line 185
    :cond_6
    invoke-virtual {v3, v4}, La0/c;->c(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    :cond_7
    :goto_2
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    goto :goto_1

    .line 193
    :cond_8
    if-ne v6, v5, :cond_9

    .line 194
    .line 195
    goto/16 :goto_0

    .line 196
    .line 197
    :cond_9
    invoke-static {v3}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    goto/16 :goto_0

    .line 202
    .line 203
    :cond_a
    return v0
.end method

.method public static final synthetic c2(LK0/e0;Ls0/j0;Lv0/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LK0/e0;->w2(Ls0/j0;Lv0/c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final c3(J)J
    .locals 5

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p1, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    cmpg-float v3, v1, v2

    .line 12
    .line 13
    if-gez v3, :cond_0

    .line 14
    .line 15
    neg-float v1, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/layout/s;->S0()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    int-to-float v3, v3

    .line 22
    sub-float/2addr v1, v3

    .line 23
    :goto_0
    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const-wide v3, 0xffffffffL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    and-long/2addr p1, v3

    .line 33
    long-to-int p1, p1

    .line 34
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    cmpg-float p2, p1, v2

    .line 39
    .line 40
    if-gez p2, :cond_1

    .line 41
    .line 42
    neg-float p1, p1

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/ui/layout/s;->Q0()I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    int-to-float p2, p2

    .line 49
    sub-float/2addr p1, p2

    .line 50
    :goto_1
    invoke-static {v2, p1}, Ljava/lang/Math;->max(FF)F

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    int-to-long v1, p2

    .line 59
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    int-to-long p1, p1

    .line 64
    shl-long v0, v1, v0

    .line 65
    .line 66
    and-long/2addr p1, v3

    .line 67
    or-long/2addr p1, v0

    .line 68
    invoke-static {p1, p2}, Lr0/f;->e(J)J

    .line 69
    .line 70
    .line 71
    move-result-wide p1

    .line 72
    return-wide p1
.end method

.method public static final synthetic d2(LK0/e0;)Ls0/j0;
    .locals 0

    .line 1
    iget-object p0, p0, LK0/e0;->I:Ls0/j0;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic e2(LK0/e0;)Lv0/c;
    .locals 0

    .line 1
    iget-object p0, p0, LK0/e0;->H:Lv0/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f2()Landroidx/compose/ui/graphics/h;
    .locals 1

    .line 1
    sget-object v0, LK0/e0;->q0:Landroidx/compose/ui/graphics/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic g2()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    sget-object v0, LK0/e0;->p0:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic h2()LK0/e0$f;
    .locals 1

    .line 1
    sget-object v0, LK0/e0;->t0:LK0/e0$f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic i2()LK0/e0$f;
    .locals 1

    .line 1
    sget-object v0, LK0/e0;->u0:LK0/e0$f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic j2(LK0/e0;)LK0/r0;
    .locals 0

    .line 1
    invoke-direct {p0}, LK0/e0;->M2()LK0/r0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic k2(LK0/e0;Z)Landroidx/compose/ui/e$c;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LK0/e0;->T2(Z)Landroidx/compose/ui/e$c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic l2(LK0/e0;Landroidx/compose/ui/e$c;LK0/e0$f;JLK0/w;IZFZ)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p9}, LK0/e0;->l3(Landroidx/compose/ui/e$c;LK0/e0$f;JLK0/w;IZFZ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final l3(Landroidx/compose/ui/e$c;LK0/e0$f;JLK0/w;IZFZ)V
    .locals 11

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p2

    .line 5
    move-wide v2, p3

    .line 6
    move-object/from16 v4, p5

    .line 7
    .line 8
    move/from16 v5, p6

    .line 9
    .line 10
    move/from16 v6, p7

    .line 11
    .line 12
    invoke-virtual/range {v0 .. v6}, LK0/e0;->X2(LK0/e0$f;JLK0/w;IZ)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    move/from16 v7, p6

    .line 17
    .line 18
    invoke-direct {p0, p1, p3, p4, v7}, LK0/e0;->Z2(Landroidx/compose/ui/e$c;JI)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    new-instance v0, LK0/e0$j;

    .line 25
    .line 26
    move-object v1, p0

    .line 27
    move-object v2, p1

    .line 28
    move-object v3, p2

    .line 29
    move-wide v4, p3

    .line 30
    move-object/from16 v6, p5

    .line 31
    .line 32
    move/from16 v8, p7

    .line 33
    .line 34
    move/from16 v9, p8

    .line 35
    .line 36
    move/from16 v10, p9

    .line 37
    .line 38
    invoke-direct/range {v0 .. v10}, LK0/e0$j;-><init>(LK0/e0;Landroidx/compose/ui/e$c;LK0/e0$f;JLK0/w;IZFZ)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v6, p1, v8, v0}, LK0/w;->v(Landroidx/compose/ui/e$c;ZLie/a;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    move-object/from16 v6, p5

    .line 46
    .line 47
    move/from16 v8, p7

    .line 48
    .line 49
    if-eqz p9, :cond_2

    .line 50
    .line 51
    invoke-direct/range {p0 .. p8}, LK0/e0;->V2(Landroidx/compose/ui/e$c;LK0/e0$f;JLK0/w;IZF)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    invoke-direct/range {p0 .. p8}, LK0/e0;->y3(Landroidx/compose/ui/e$c;LK0/e0$f;JLK0/w;IZF)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public static final synthetic m2(LK0/e0;Ls0/j0;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK0/e0;->I:Ls0/j0;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic n2(LK0/e0;Lv0/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK0/e0;->H:Lv0/c;

    .line 2
    .line 3
    return-void
.end method

.method private final n3(JFLkotlin/jvm/functions/Function1;Lv0/c;)V
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x0

    .line 5
    if-eqz p5, :cond_3

    .line 6
    .line 7
    if-nez p4, :cond_0

    .line 8
    .line 9
    move p4, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move p4, v2

    .line 12
    :goto_0
    if-nez p4, :cond_1

    .line 13
    .line 14
    const-string p4, "both ways to create layers shouldn\'t be used together"

    .line 15
    .line 16
    invoke-static {p4}, LH0/a;->a(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    iget-object p4, p0, LK0/e0;->m0:Lv0/c;

    .line 20
    .line 21
    if-eq p4, p5, :cond_2

    .line 22
    .line 23
    iput-object v3, p0, LK0/e0;->m0:Lv0/c;

    .line 24
    .line 25
    invoke-static {p0, v3, v2, v0, v3}, LK0/e0;->G3(LK0/e0;Lkotlin/jvm/functions/Function1;ZILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iput-object p5, p0, LK0/e0;->m0:Lv0/c;

    .line 29
    .line 30
    :cond_2
    iget-object p4, p0, LK0/e0;->l0:LK0/o0;

    .line 31
    .line 32
    if-nez p4, :cond_5

    .line 33
    .line 34
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 35
    .line 36
    .line 37
    move-result-object p4

    .line 38
    invoke-static {p4}, LK0/N;->b(LK0/J;)LK0/p0;

    .line 39
    .line 40
    .line 41
    move-result-object p4

    .line 42
    invoke-direct {p0}, LK0/e0;->D2()Lkotlin/jvm/functions/Function2;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v3, p0, LK0/e0;->Y:Lie/a;

    .line 47
    .line 48
    invoke-interface {p4, v0, v3, p5}, LK0/p0;->p(Lkotlin/jvm/functions/Function2;Lie/a;Lv0/c;)LK0/o0;

    .line 49
    .line 50
    .line 51
    move-result-object p4

    .line 52
    invoke-virtual {p0}, Landroidx/compose/ui/layout/s;->R0()J

    .line 53
    .line 54
    .line 55
    move-result-wide v3

    .line 56
    invoke-interface {p4, v3, v4}, LK0/o0;->e(J)V

    .line 57
    .line 58
    .line 59
    invoke-interface {p4, p1, p2}, LK0/o0;->k(J)V

    .line 60
    .line 61
    .line 62
    iput-object p4, p0, LK0/e0;->l0:LK0/o0;

    .line 63
    .line 64
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 65
    .line 66
    .line 67
    move-result-object p4

    .line 68
    invoke-virtual {p4, v1}, LK0/J;->P1(Z)V

    .line 69
    .line 70
    .line 71
    iget-object p4, p0, LK0/e0;->Y:Lie/a;

    .line 72
    .line 73
    invoke-interface {p4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    iget-object p5, p0, LK0/e0;->m0:Lv0/c;

    .line 78
    .line 79
    if-eqz p5, :cond_4

    .line 80
    .line 81
    iput-object v3, p0, LK0/e0;->m0:Lv0/c;

    .line 82
    .line 83
    invoke-static {p0, v3, v2, v0, v3}, LK0/e0;->G3(LK0/e0;Lkotlin/jvm/functions/Function1;ZILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    :cond_4
    invoke-static {p0, p4, v2, v0, v3}, LK0/e0;->G3(LK0/e0;Lkotlin/jvm/functions/Function1;ZILjava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    :cond_5
    :goto_1
    invoke-virtual {p0}, LK0/e0;->P1()J

    .line 90
    .line 91
    .line 92
    move-result-wide p4

    .line 93
    invoke-static {p4, p5, p1, p2}, Li1/n;->j(JJ)Z

    .line 94
    .line 95
    .line 96
    move-result p4

    .line 97
    if-nez p4, :cond_9

    .line 98
    .line 99
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 100
    .line 101
    .line 102
    move-result-object p4

    .line 103
    invoke-static {p4}, LK0/N;->b(LK0/J;)LK0/p0;

    .line 104
    .line 105
    .line 106
    move-result-object p4

    .line 107
    sget-object p5, Ll0/i;->a:Ll0/i$a;

    .line 108
    .line 109
    invoke-virtual {p5}, Ll0/i$a;->a()F

    .line 110
    .line 111
    .line 112
    move-result p5

    .line 113
    invoke-interface {p4, p5}, LK0/p0;->C(F)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, p1, p2}, LK0/e0;->u3(J)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 120
    .line 121
    .line 122
    move-result-object p4

    .line 123
    invoke-virtual {p4}, LK0/J;->d0()LK0/O;

    .line 124
    .line 125
    .line 126
    move-result-object p4

    .line 127
    invoke-virtual {p4}, LK0/O;->v()LK0/X;

    .line 128
    .line 129
    .line 130
    move-result-object p4

    .line 131
    invoke-virtual {p4}, LK0/X;->d2()V

    .line 132
    .line 133
    .line 134
    iget-object p4, p0, LK0/e0;->l0:LK0/o0;

    .line 135
    .line 136
    if-eqz p4, :cond_6

    .line 137
    .line 138
    invoke-interface {p4, p1, p2}, LK0/o0;->k(J)V

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_6
    iget-object p1, p0, LK0/e0;->u:LK0/e0;

    .line 143
    .line 144
    if-eqz p1, :cond_7

    .line 145
    .line 146
    invoke-virtual {p1}, LK0/e0;->Y2()V

    .line 147
    .line 148
    .line 149
    :cond_7
    :goto_2
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-virtual {p1}, LK0/J;->I0()La0/c;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    iget-object p2, p1, La0/c;->a:[Ljava/lang/Object;

    .line 158
    .line 159
    invoke-virtual {p1}, La0/c;->p()I

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    :goto_3
    if-ge v2, p1, :cond_8

    .line 164
    .line 165
    aget-object p4, p2, v2

    .line 166
    .line 167
    check-cast p4, LK0/J;

    .line 168
    .line 169
    invoke-virtual {p4}, LK0/J;->S0()V

    .line 170
    .line 171
    .line 172
    add-int/lit8 v2, v2, 0x1

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_8
    invoke-virtual {p0, p0}, LK0/T;->R1(LK0/e0;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-virtual {p1}, LK0/J;->z0()LK0/p0;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    if-eqz p1, :cond_9

    .line 187
    .line 188
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 189
    .line 190
    .line 191
    move-result-object p2

    .line 192
    invoke-interface {p1, p2}, LK0/p0;->t(LK0/J;)V

    .line 193
    .line 194
    .line 195
    :cond_9
    iput p3, p0, LK0/e0;->E:F

    .line 196
    .line 197
    invoke-virtual {p0}, LK0/T;->U1()Z

    .line 198
    .line 199
    .line 200
    move-result p1

    .line 201
    if-nez p1, :cond_a

    .line 202
    .line 203
    invoke-virtual {p0}, LK0/e0;->M1()LI0/C;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-virtual {p0, p1}, LK0/T;->G1(LI0/C;)V

    .line 208
    .line 209
    .line 210
    :cond_a
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    invoke-virtual {p1}, LK0/J;->w0()LK0/e0;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    if-ne p0, p1, :cond_b

    .line 219
    .line 220
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    invoke-static {p1}, LK0/N;->b(LK0/J;)LK0/p0;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    invoke-interface {p1}, LK0/p0;->getRectManager()LS0/b;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 233
    .line 234
    .line 235
    move-result-object p2

    .line 236
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 237
    .line 238
    .line 239
    move-result-object p3

    .line 240
    invoke-virtual {p3}, LK0/J;->l0()LK0/X;

    .line 241
    .line 242
    .line 243
    move-result-object p3

    .line 244
    invoke-virtual {p3}, LK0/X;->T1()Z

    .line 245
    .line 246
    .line 247
    move-result p3

    .line 248
    xor-int/2addr p3, v1

    .line 249
    invoke-virtual {p1, p2, p3}, LS0/b;->k(LK0/J;Z)V

    .line 250
    .line 251
    .line 252
    :cond_b
    return-void
.end method

.method public static final synthetic o2(LK0/e0;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LK0/e0;->Z:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic p2(LK0/e0;J)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/layout/s;->i1(J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final q2(LK0/e0;Lr0/d;Z)V
    .locals 1

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, LK0/e0;->u:LK0/e0;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-direct {v0, p1, p2, p3}, LK0/e0;->q2(LK0/e0;Lr0/d;Z)V

    .line 9
    .line 10
    .line 11
    :cond_1
    invoke-direct {p0, p2, p3}, LK0/e0;->B2(Lr0/d;Z)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static synthetic q3(LK0/e0;Lr0/d;ZZILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p5, :cond_1

    .line 2
    .line 3
    and-int/lit8 p4, p4, 0x4

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    const/4 p3, 0x0

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LK0/e0;->p3(Lr0/d;ZZ)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    const-string p1, "Super calls with default arguments not supported in this target, function: rectInParent"

    .line 15
    .line 16
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method

.method private final r2(LK0/e0;JZ)J
    .locals 2

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    return-wide p2

    .line 4
    :cond_0
    iget-object v0, p0, LK0/e0;->u:LK0/e0;

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    invoke-direct {v0, p1, p2, p3, p4}, LK0/e0;->r2(LK0/e0;JZ)J

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    invoke-virtual {p0, p1, p2, p4}, LK0/e0;->z2(JZ)J

    .line 20
    .line 21
    .line 22
    move-result-wide p1

    .line 23
    return-wide p1

    .line 24
    :cond_2
    :goto_0
    invoke-virtual {p0, p2, p3, p4}, LK0/e0;->z2(JZ)J

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    return-wide p1
.end method

.method private final w2(Ls0/j0;Lv0/c;)V
    .locals 8

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    invoke-virtual {p0, v0}, LK0/e0;->S2(I)Landroidx/compose/ui/e$c;

    .line 7
    .line 8
    .line 9
    move-result-object v6

    .line 10
    if-nez v6, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, LK0/e0;->m3(Ls0/j0;Lv0/c;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, LK0/J;->k0()LK0/L;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {p0}, LK0/e0;->a()J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    invoke-static {v2, v3}, Li1/s;->d(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v3

    .line 32
    move-object v5, p0

    .line 33
    move-object v2, p1

    .line 34
    move-object v7, p2

    .line 35
    invoke-virtual/range {v1 .. v7}, LK0/L;->b(Ls0/j0;JLK0/e0;Landroidx/compose/ui/e$c;Lv0/c;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method private final y3(Landroidx/compose/ui/e$c;LK0/e0$f;JLK0/w;IZF)V
    .locals 10

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p2

    .line 5
    move-wide v2, p3

    .line 6
    move-object v4, p5

    .line 7
    move/from16 v5, p6

    .line 8
    .line 9
    move/from16 v6, p7

    .line 10
    .line 11
    invoke-virtual/range {v0 .. v6}, LK0/e0;->X2(LK0/e0$f;JLK0/w;IZ)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-interface {p2, p1}, LK0/e0$f;->b(Landroidx/compose/ui/e$c;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    new-instance v0, LK0/e0$k;

    .line 22
    .line 23
    move-object v1, p0

    .line 24
    move-object v2, p1

    .line 25
    move-object v3, p2

    .line 26
    move-wide v4, p3

    .line 27
    move-object v6, p5

    .line 28
    move/from16 v7, p6

    .line 29
    .line 30
    move/from16 v8, p7

    .line 31
    .line 32
    move/from16 v9, p8

    .line 33
    .line 34
    invoke-direct/range {v0 .. v9}, LK0/e0$k;-><init>(LK0/e0;Landroidx/compose/ui/e$c;LK0/e0$f;JLK0/w;IZF)V

    .line 35
    .line 36
    .line 37
    move v7, v8

    .line 38
    move v8, v9

    .line 39
    invoke-virtual {p5, p1, v8, v7, v0}, LK0/w;->D(Landroidx/compose/ui/e$c;FZLie/a;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    move/from16 v7, p7

    .line 44
    .line 45
    move/from16 v8, p8

    .line 46
    .line 47
    invoke-interface {p2}, LK0/e0$f;->a()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const/4 v1, 0x2

    .line 52
    invoke-static {v1}, LK0/g0;->a(I)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    invoke-static {p1, v0, v1}, LK0/f0;->b(LK0/j;II)Landroidx/compose/ui/e$c;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    const/4 v9, 0x0

    .line 61
    move-object v0, p0

    .line 62
    move-object v2, p2

    .line 63
    move-wide v3, p3

    .line 64
    move-object v5, p5

    .line 65
    move/from16 v6, p6

    .line 66
    .line 67
    invoke-direct/range {v0 .. v9}, LK0/e0;->l3(Landroidx/compose/ui/e$c;LK0/e0$f;JLK0/w;IZFZ)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method private final z3(LI0/p;)LK0/e0;
    .locals 1

    .line 1
    instance-of v0, p1, LI0/y;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LI0/y;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-eqz v0, :cond_2

    .line 11
    .line 12
    invoke-virtual {v0}, LI0/y;->c()LK0/e0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    return-object v0

    .line 20
    :cond_2
    :goto_1
    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator"

    .line 21
    .line 22
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    check-cast p1, LK0/e0;

    .line 26
    .line 27
    return-object p1
.end method


# virtual methods
.method public A3(JZ)J
    .locals 2

    .line 1
    iget-object v0, p0, LK0/e0;->l0:LK0/o0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-interface {v0, p1, p2, v1}, LK0/o0;->d(JZ)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    :cond_0
    if-nez p3, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, LK0/T;->T1()Z

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    if-eqz p3, :cond_1

    .line 17
    .line 18
    return-wide p1

    .line 19
    :cond_1
    invoke-virtual {p0}, LK0/e0;->P1()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    invoke-static {p1, p2, v0, v1}, Li1/o;->c(JJ)J

    .line 24
    .line 25
    .line 26
    move-result-wide p1

    .line 27
    return-wide p1
.end method

.method public B(J)J
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/e0;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 8
    .line 9
    invoke-static {v0}, LH0/a;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0, p1, p2}, LK0/e0;->E0(J)J

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, LK0/N;->b(LK0/J;)LK0/p0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v0, p1, p2}, LE0/S;->B(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    return-wide p1
.end method

.method public C2()LK0/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK0/J;->d0()LK0/O;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, LK0/O;->b()LK0/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public final C3()Lr0/h;
    .locals 7

    .line 1
    invoke-virtual {p0}, LK0/e0;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lr0/h;->e:Lr0/h$a;

    .line 8
    .line 9
    invoke-virtual {v0}, Lr0/h$a;->a()Lr0/h;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-static {p0}, LI0/q;->d(LI0/p;)LI0/p;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0}, LK0/e0;->L2()Lr0/d;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {p0}, LK0/e0;->J2()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    invoke-virtual {p0, v2, v3}, LK0/e0;->s2(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    const/16 v4, 0x20

    .line 31
    .line 32
    shr-long v4, v2, v4

    .line 33
    .line 34
    long-to-int v4, v4

    .line 35
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    neg-float v5, v5

    .line 40
    invoke-virtual {v1, v5}, Lr0/d;->i(F)V

    .line 41
    .line 42
    .line 43
    const-wide v5, 0xffffffffL

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    and-long/2addr v2, v5

    .line 49
    long-to-int v2, v2

    .line 50
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    neg-float v3, v3

    .line 55
    invoke-virtual {v1, v3}, Lr0/d;->k(F)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Landroidx/compose/ui/layout/s;->S0()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    int-to-float v3, v3

    .line 63
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    add-float/2addr v3, v4

    .line 68
    invoke-virtual {v1, v3}, Lr0/d;->j(F)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Landroidx/compose/ui/layout/s;->Q0()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    int-to-float v3, v3

    .line 76
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    add-float/2addr v3, v2

    .line 81
    invoke-virtual {v1, v3}, Lr0/d;->h(F)V

    .line 82
    .line 83
    .line 84
    move-object v2, p0

    .line 85
    :goto_0
    if-eq v2, v0, :cond_2

    .line 86
    .line 87
    const/4 v3, 0x0

    .line 88
    const/4 v4, 0x1

    .line 89
    invoke-virtual {v2, v1, v3, v4}, LK0/e0;->p3(Lr0/d;ZZ)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Lr0/d;->f()Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-eqz v3, :cond_1

    .line 97
    .line 98
    sget-object v0, Lr0/h;->e:Lr0/h$a;

    .line 99
    .line 100
    invoke-virtual {v0}, Lr0/h$a;->a()Lr0/h;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    return-object v0

    .line 105
    :cond_1
    iget-object v2, v2, LK0/e0;->u:LK0/e0;

    .line 106
    .line 107
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_2
    invoke-static {v1}, Lr0/e;->a(Lr0/d;)Lr0/h;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    return-object v0
.end method

.method public E0(J)J
    .locals 7

    .line 1
    invoke-virtual {p0}, LK0/e0;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 8
    .line 9
    invoke-static {v0}, LH0/a;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, LK0/e0;->d3()V

    .line 13
    .line 14
    .line 15
    move-object v1, p0

    .line 16
    move-wide v2, p1

    .line 17
    :goto_0
    if-eqz v1, :cond_1

    .line 18
    .line 19
    const/4 v5, 0x2

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-static/range {v1 .. v6}, LK0/e0;->B3(LK0/e0;JZILjava/lang/Object;)J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    iget-object v1, v1, LK0/e0;->u:LK0/e0;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    return-wide v2
.end method

.method public final E2()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LK0/e0;->s:Z

    .line 2
    .line 3
    return v0
.end method

.method public final F2()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LK0/e0;->Z:Z

    .line 2
    .line 3
    return v0
.end method

.method public final F3(Lkotlin/jvm/functions/Function1;Z)V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    iget-object v2, p0, LK0/e0;->m0:Lv0/c;

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v2, v0

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    :goto_0
    move v2, v1

    .line 13
    :goto_1
    if-nez v2, :cond_2

    .line 14
    .line 15
    const-string v2, "layerBlock can\'t be provided when explicitLayer is provided"

    .line 16
    .line 17
    invoke-static {v2}, LH0/a;->a(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_2
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-nez p2, :cond_4

    .line 25
    .line 26
    iget-object p2, p0, LK0/e0;->x:Lkotlin/jvm/functions/Function1;

    .line 27
    .line 28
    if-ne p2, p1, :cond_4

    .line 29
    .line 30
    iget-object p2, p0, LK0/e0;->y:Li1/d;

    .line 31
    .line 32
    invoke-virtual {v2}, LK0/J;->R()Li1/d;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-static {p2, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_4

    .line 41
    .line 42
    iget-object p2, p0, LK0/e0;->z:Li1/t;

    .line 43
    .line 44
    invoke-virtual {v2}, LK0/J;->getLayoutDirection()Li1/t;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    if-eq p2, v3, :cond_3

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_3
    move p2, v0

    .line 52
    goto :goto_3

    .line 53
    :cond_4
    :goto_2
    move p2, v1

    .line 54
    :goto_3
    invoke-virtual {v2}, LK0/J;->R()Li1/d;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    iput-object v3, p0, LK0/e0;->y:Li1/d;

    .line 59
    .line 60
    invoke-virtual {v2}, LK0/J;->getLayoutDirection()Li1/t;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    iput-object v3, p0, LK0/e0;->z:Li1/t;

    .line 65
    .line 66
    invoke-virtual {v2}, LK0/J;->b()Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    const/4 v4, 0x0

    .line 71
    if-eqz v3, :cond_7

    .line 72
    .line 73
    if-eqz p1, :cond_7

    .line 74
    .line 75
    iput-object p1, p0, LK0/e0;->x:Lkotlin/jvm/functions/Function1;

    .line 76
    .line 77
    iget-object p1, p0, LK0/e0;->l0:LK0/o0;

    .line 78
    .line 79
    if-nez p1, :cond_5

    .line 80
    .line 81
    invoke-static {v2}, LK0/N;->b(LK0/J;)LK0/p0;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-direct {p0}, LK0/e0;->D2()Lkotlin/jvm/functions/Function2;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    iget-object v7, p0, LK0/e0;->Y:Lie/a;

    .line 90
    .line 91
    const/4 v9, 0x4

    .line 92
    const/4 v10, 0x0

    .line 93
    const/4 v8, 0x0

    .line 94
    invoke-static/range {v5 .. v10}, LK0/p0;->h(LK0/p0;Lkotlin/jvm/functions/Function2;Lie/a;Lv0/c;ILjava/lang/Object;)LK0/o0;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p0}, Landroidx/compose/ui/layout/s;->R0()J

    .line 99
    .line 100
    .line 101
    move-result-wide v5

    .line 102
    invoke-interface {p1, v5, v6}, LK0/o0;->e(J)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, LK0/e0;->P1()J

    .line 106
    .line 107
    .line 108
    move-result-wide v5

    .line 109
    invoke-interface {p1, v5, v6}, LK0/o0;->k(J)V

    .line 110
    .line 111
    .line 112
    iput-object p1, p0, LK0/e0;->l0:LK0/o0;

    .line 113
    .line 114
    invoke-static {p0, v0, v1, v4}, LK0/e0;->I3(LK0/e0;ZILjava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v1}, LK0/J;->P1(Z)V

    .line 118
    .line 119
    .line 120
    iget-object p1, p0, LK0/e0;->Y:Lie/a;

    .line 121
    .line 122
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_5
    if-eqz p2, :cond_6

    .line 127
    .line 128
    invoke-static {p0, v0, v1, v4}, LK0/e0;->I3(LK0/e0;ZILjava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-eqz p1, :cond_6

    .line 133
    .line 134
    invoke-static {v2}, LK0/N;->b(LK0/J;)LK0/p0;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-interface {p1}, LK0/p0;->getRectManager()LS0/b;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p1, v2}, LS0/b;->j(LK0/J;)V

    .line 143
    .line 144
    .line 145
    :cond_6
    return-void

    .line 146
    :cond_7
    iput-object v4, p0, LK0/e0;->x:Lkotlin/jvm/functions/Function1;

    .line 147
    .line 148
    iget-object p1, p0, LK0/e0;->l0:LK0/o0;

    .line 149
    .line 150
    if-eqz p1, :cond_8

    .line 151
    .line 152
    invoke-interface {p1}, LK0/o0;->destroy()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2, v1}, LK0/J;->P1(Z)V

    .line 156
    .line 157
    .line 158
    iget-object p1, p0, LK0/e0;->Y:Lie/a;

    .line 159
    .line 160
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0}, LK0/e0;->b()Z

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    if-eqz p1, :cond_8

    .line 168
    .line 169
    invoke-virtual {v2}, LK0/J;->p()Z

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    if-eqz p1, :cond_8

    .line 174
    .line 175
    invoke-virtual {v2}, LK0/J;->z0()LK0/p0;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    if-eqz p1, :cond_8

    .line 180
    .line 181
    invoke-interface {p1, v2}, LK0/p0;->t(LK0/J;)V

    .line 182
    .line 183
    .line 184
    :cond_8
    iput-object v4, p0, LK0/e0;->l0:LK0/o0;

    .line 185
    .line 186
    iput-boolean v0, p0, LK0/e0;->Z:Z

    .line 187
    .line 188
    return-void
.end method

.method public final G2()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/layout/s;->T0()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public final H2()LK0/o0;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/e0;->l0:LK0/o0;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract I2()LK0/U;
.end method

.method public J0()Z
    .locals 1

    .line 1
    iget-object v0, p0, LK0/e0;->l0:LK0/o0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, LK0/e0;->v:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, LK0/J;->b()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    return v0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    return v0
.end method

.method public J1()LK0/T;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/e0;->t:LK0/e0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final J2()J
    .locals 3

    .line 1
    iget-object v0, p0, LK0/e0;->y:Li1/d;

    .line 2
    .line 3
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, LK0/J;->E0()Landroidx/compose/ui/platform/A1;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v1}, Landroidx/compose/ui/platform/A1;->e()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    invoke-interface {v0, v1, v2}, Li1/d;->w1(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    return-wide v0
.end method

.method protected final J3(J)Z
    .locals 4

    .line 1
    const-wide v0, 0x7f8000007f800000L    # 1.404448428688076E306

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    and-long v2, p1, v0

    .line 7
    .line 8
    xor-long/2addr v0, v2

    .line 9
    const-wide v2, 0x100000001L

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    sub-long/2addr v0, v2

    .line 15
    const-wide v2, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    and-long/2addr v0, v2

    .line 21
    const-wide/16 v2, 0x0

    .line 22
    .line 23
    cmp-long v0, v0, v2

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    iget-object v0, p0, LK0/e0;->l0:LK0/o0;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-boolean v2, p0, LK0/e0;->w:Z

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-interface {v0, p1, p2}, LK0/o0;->g(J)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    return v1

    .line 44
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 45
    return p1

    .line 46
    :cond_2
    return v1
.end method

.method public K1()Z
    .locals 1

    .line 1
    iget-object v0, p0, LK0/e0;->B:LI0/C;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final K2()LI0/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/e0;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 8
    .line 9
    invoke-static {v0}, LH0/a;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, LK0/e0;->d3()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, LK0/e0;->u:LK0/e0;

    .line 16
    .line 17
    return-object v0
.end method

.method public L1()LK0/J;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/e0;->q:LK0/J;

    .line 2
    .line 3
    return-object v0
.end method

.method protected final L2()Lr0/d;
    .locals 2

    .line 1
    iget-object v0, p0, LK0/e0;->F:Lr0/d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lr0/d;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, v1, v1, v1, v1}, Lr0/d;-><init>(FFFF)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LK0/e0;->F:Lr0/d;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public M1()LI0/C;
    .locals 2

    .line 1
    iget-object v0, p0, LK0/e0;->B:LI0/C;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "Asking for measurement result of unmeasured layout modifier"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public N1()LK0/T;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/e0;->u:LK0/e0;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract N2()Landroidx/compose/ui/e$c;
.end method

.method public final O2()LK0/e0;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/e0;->t:LK0/e0;

    .line 2
    .line 3
    return-object v0
.end method

.method public P1()J
    .locals 2

    .line 1
    iget-wide v0, p0, LK0/e0;->D:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final P2()LK0/e0;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/e0;->u:LK0/e0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final Q2()F
    .locals 1

    .line 1
    iget v0, p0, LK0/e0;->E:F

    .line 2
    .line 3
    return v0
.end method

.method public final S2(I)Landroidx/compose/ui/e$c;
    .locals 3

    .line 1
    invoke-static {p1}, LK0/h0;->i(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, LK0/e0;->N2()Landroidx/compose/ui/e$c;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_1
    :goto_0
    invoke-static {p0, v0}, LK0/e0;->k2(LK0/e0;Z)Landroidx/compose/ui/e$c;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :goto_1
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    and-int/2addr v2, p1

    .line 30
    if-eqz v2, :cond_3

    .line 31
    .line 32
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    and-int/2addr v2, p1

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_2
    if-eq v0, v1, :cond_3

    .line 41
    .line 42
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    goto :goto_1

    .line 47
    :cond_3
    :goto_2
    const/4 p1, 0x0

    .line 48
    return-object p1
.end method

.method public U(J)J
    .locals 3

    .line 1
    invoke-virtual {p0}, LK0/e0;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 8
    .line 9
    invoke-static {v0}, LH0/a;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-static {p0}, LI0/q;->d(LI0/p;)LI0/p;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v1}, LK0/N;->b(LK0/J;)LK0/p0;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v1, p1, p2}, LK0/p0;->u(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    invoke-static {v0}, LI0/q;->e(LI0/p;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    invoke-static {p1, p2, v1, v2}, Lr0/f;->p(JJ)J

    .line 33
    .line 34
    .line 35
    move-result-wide p1

    .line 36
    invoke-virtual {p0, v0, p1, p2}, LK0/e0;->y0(LI0/p;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide p1

    .line 40
    return-wide p1
.end method

.method public final W2(LK0/e0$f;JLK0/w;IZ)V
    .locals 13

    .line 1
    move-wide v3, p2

    .line 2
    move-object/from16 v5, p4

    .line 3
    .line 4
    move/from16 v6, p5

    .line 5
    .line 6
    invoke-interface {p1}, LK0/e0$f;->a()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p0, v0}, LK0/e0;->S2(I)Landroidx/compose/ui/e$c;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {p0, v3, v4}, LK0/e0;->J3(J)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v8, 0x0

    .line 19
    const/high16 v9, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 20
    .line 21
    const v10, 0x7fffffff

    .line 22
    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    sget-object v0, LE0/Q;->a:LE0/Q$a;

    .line 27
    .line 28
    invoke-virtual {v0}, LE0/Q$a;->d()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-static {v6, v0}, LE0/Q;->g(II)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    invoke-virtual {p0}, LK0/e0;->J2()J

    .line 39
    .line 40
    .line 41
    move-result-wide v11

    .line 42
    invoke-virtual {p0, v3, v4, v11, v12}, LK0/e0;->t2(JJ)F

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    and-int/2addr v2, v10

    .line 51
    if-ge v2, v9, :cond_0

    .line 52
    .line 53
    invoke-virtual {v5, v0, v8}, LK0/w;->y(FZ)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_0

    .line 58
    .line 59
    const/4 v7, 0x0

    .line 60
    move-object v2, p1

    .line 61
    move v8, v0

    .line 62
    move-object v0, p0

    .line 63
    invoke-direct/range {v0 .. v8}, LK0/e0;->V2(Landroidx/compose/ui/e$c;LK0/e0$f;JLK0/w;IZF)V

    .line 64
    .line 65
    .line 66
    :cond_0
    return-void

    .line 67
    :cond_1
    if-nez v1, :cond_2

    .line 68
    .line 69
    invoke-virtual/range {p0 .. p6}, LK0/e0;->X2(LK0/e0$f;JLK0/w;IZ)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_2
    invoke-virtual {p0, v3, v4}, LK0/e0;->a3(J)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_3

    .line 78
    .line 79
    move-object v0, p0

    .line 80
    move-object v2, p1

    .line 81
    move-object/from16 v5, p4

    .line 82
    .line 83
    move/from16 v6, p5

    .line 84
    .line 85
    move/from16 v7, p6

    .line 86
    .line 87
    invoke-direct/range {v0 .. v7}, LK0/e0;->U2(Landroidx/compose/ui/e$c;LK0/e0$f;JLK0/w;IZ)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_3
    move-object/from16 v5, p4

    .line 92
    .line 93
    move/from16 v6, p5

    .line 94
    .line 95
    sget-object v2, LE0/Q;->a:LE0/Q$a;

    .line 96
    .line 97
    invoke-virtual {v2}, LE0/Q$a;->d()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    invoke-static {v6, v2}, LE0/Q;->g(II)Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-nez v2, :cond_4

    .line 106
    .line 107
    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_4
    invoke-virtual {p0}, LK0/e0;->J2()J

    .line 111
    .line 112
    .line 113
    move-result-wide v11

    .line 114
    invoke-virtual {p0, v3, v4, v11, v12}, LK0/e0;->t2(JJ)F

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    :goto_0
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    and-int/2addr v7, v10

    .line 123
    if-ge v7, v9, :cond_6

    .line 124
    .line 125
    move/from16 v7, p6

    .line 126
    .line 127
    invoke-virtual {v5, v2, v7}, LK0/w;->y(FZ)Z

    .line 128
    .line 129
    .line 130
    move-result v9

    .line 131
    if-eqz v9, :cond_5

    .line 132
    .line 133
    const/4 v8, 0x1

    .line 134
    :cond_5
    :goto_1
    move-object v0, p0

    .line 135
    move v9, v8

    .line 136
    move v8, v2

    .line 137
    move-object v2, p1

    .line 138
    goto :goto_2

    .line 139
    :cond_6
    move/from16 v7, p6

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :goto_2
    invoke-direct/range {v0 .. v9}, LK0/e0;->l3(Landroidx/compose/ui/e$c;LK0/e0$f;JLK0/w;IZFZ)V

    .line 143
    .line 144
    .line 145
    return-void
.end method

.method public X2(LK0/e0$f;JLK0/w;IZ)V
    .locals 7

    .line 1
    iget-object v0, p0, LK0/e0;->t:LK0/e0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v4, 0x2

    .line 6
    const/4 v5, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    move-wide v1, p2

    .line 9
    invoke-static/range {v0 .. v5}, LK0/e0;->A2(LK0/e0;JZILjava/lang/Object;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    move-object v1, p1

    .line 14
    move-object v4, p4

    .line 15
    move v5, p5

    .line 16
    move v6, p6

    .line 17
    invoke-virtual/range {v0 .. v6}, LK0/e0;->W2(LK0/e0$f;JLK0/w;IZ)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method protected Y0(JFLkotlin/jvm/functions/Function1;)V
    .locals 6

    .line 1
    iget-boolean v1, p0, LK0/e0;->r:Z

    .line 2
    .line 3
    if-eqz v1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LK0/e0;->I2()LK0/U;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, LK0/U;->P1()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    const/4 v5, 0x0

    .line 17
    move-object v0, p0

    .line 18
    move v3, p3

    .line 19
    move-object v4, p4

    .line 20
    invoke-direct/range {v0 .. v5}, LK0/e0;->n3(JFLkotlin/jvm/functions/Function1;Lv0/c;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const/4 v5, 0x0

    .line 25
    move-object v0, p0

    .line 26
    move-wide v1, p1

    .line 27
    move v3, p3

    .line 28
    move-object v4, p4

    .line 29
    invoke-direct/range {v0 .. v5}, LK0/e0;->n3(JFLkotlin/jvm/functions/Function1;Lv0/c;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public Y1()V
    .locals 4

    .line 1
    iget-object v0, p0, LK0/e0;->m0:Lv0/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LK0/e0;->P1()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    iget v3, p0, LK0/e0;->E:F

    .line 10
    .line 11
    invoke-virtual {p0, v1, v2, v3, v0}, LK0/e0;->a1(JFLv0/c;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p0}, LK0/e0;->P1()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    iget v2, p0, LK0/e0;->E:F

    .line 20
    .line 21
    iget-object v3, p0, LK0/e0;->x:Lkotlin/jvm/functions/Function1;

    .line 22
    .line 23
    invoke-virtual {p0, v0, v1, v2, v3}, LK0/e0;->Y0(JFLkotlin/jvm/functions/Function1;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public Y2()V
    .locals 1

    .line 1
    iget-object v0, p0, LK0/e0;->l0:LK0/o0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, LK0/o0;->invalidate()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, LK0/e0;->u:LK0/e0;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, LK0/e0;->Y2()V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final a()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/layout/s;->R0()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method protected a1(JFLv0/c;)V
    .locals 11

    .line 1
    iget-boolean v0, p0, LK0/e0;->r:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LK0/e0;->I2()LK0/U;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, LK0/U;->P1()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    const/4 v4, 0x0

    .line 17
    move-object v0, p0

    .line 18
    move v3, p3

    .line 19
    move-object v5, p4

    .line 20
    invoke-direct/range {v0 .. v5}, LK0/e0;->n3(JFLkotlin/jvm/functions/Function1;Lv0/c;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    move v3, p3

    .line 25
    move-object v5, p4

    .line 26
    const/4 v9, 0x0

    .line 27
    move-wide v6, p1

    .line 28
    move v8, v3

    .line 29
    move-object v10, v5

    .line 30
    move-object v5, p0

    .line 31
    invoke-direct/range {v5 .. v10}, LK0/e0;->n3(JFLkotlin/jvm/functions/Function1;Lv0/c;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method protected final a3(J)Z
    .locals 3

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v0, p1, v0

    .line 4
    .line 5
    long-to-int v0, v0

    .line 6
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const-wide v1, 0xffffffffL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    and-long/2addr p1, v1

    .line 16
    long-to-int p1, p1

    .line 17
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    const/4 p2, 0x0

    .line 22
    cmpl-float v1, v0, p2

    .line 23
    .line 24
    if-ltz v1, :cond_0

    .line 25
    .line 26
    cmpl-float p2, p1, p2

    .line 27
    .line 28
    if-ltz p2, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/compose/ui/layout/s;->S0()I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    int-to-float p2, p2

    .line 35
    cmpg-float p2, v0, p2

    .line 36
    .line 37
    if-gez p2, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/compose/ui/layout/s;->Q0()I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    int-to-float p2, p2

    .line 44
    cmpg-float p1, p1, p2

    .line 45
    .line 46
    if-gez p1, :cond_0

    .line 47
    .line 48
    const/4 p1, 0x1

    .line 49
    return p1

    .line 50
    :cond_0
    const/4 p1, 0x0

    .line 51
    return p1
.end method

.method public b()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/e0;->N2()Landroidx/compose/ui/e$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final b3()Z
    .locals 2

    .line 1
    iget-object v0, p0, LK0/e0;->l0:LK0/o0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, LK0/e0;->A:F

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    cmpg-float v0, v0, v1

    .line 9
    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    return v0

    .line 14
    :cond_0
    iget-object v0, p0, LK0/e0;->u:LK0/e0;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, LK0/e0;->b3()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method public c0(J)J
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, LK0/e0;->E0(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, LK0/N;->b(LK0/J;)LK0/p0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0, p1, p2}, LK0/p0;->f(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide p1

    .line 17
    return-wide p1
.end method

.method public final d3()V
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK0/J;->d0()LK0/O;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, LK0/O;->H()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public e3()V
    .locals 1

    .line 1
    iget-object v0, p0, LK0/e0;->l0:LK0/o0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, LK0/o0;->invalidate()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final f3()V
    .locals 0

    .line 1
    invoke-virtual {p0}, LK0/e0;->r3()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method protected g3(II)V
    .locals 9

    .line 1
    iget-object v0, p0, LK0/e0;->l0:LK0/o0;

    .line 2
    .line 3
    const-wide v1, 0xffffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const/16 v3, 0x20

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    int-to-long v4, p1

    .line 13
    shl-long/2addr v4, v3

    .line 14
    int-to-long v6, p2

    .line 15
    and-long/2addr v6, v1

    .line 16
    or-long/2addr v4, v6

    .line 17
    invoke-static {v4, v5}, Li1/r;->c(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v4

    .line 21
    invoke-interface {v0, v4, v5}, LK0/o0;->e(J)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, LK0/J;->p()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-object v0, p0, LK0/e0;->u:LK0/e0;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {v0}, LK0/e0;->Y2()V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    int-to-long v4, p1

    .line 43
    shl-long v3, v4, v3

    .line 44
    .line 45
    int-to-long p1, p2

    .line 46
    and-long/2addr p1, v1

    .line 47
    or-long/2addr p1, v3

    .line 48
    invoke-static {p1, p2}, Li1/r;->c(J)J

    .line 49
    .line 50
    .line 51
    move-result-wide p1

    .line 52
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/layout/s;->b1(J)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, LK0/e0;->x:Lkotlin/jvm/functions/Function1;

    .line 56
    .line 57
    const/4 p2, 0x0

    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    invoke-direct {p0, p2}, LK0/e0;->H3(Z)Z

    .line 61
    .line 62
    .line 63
    :cond_2
    const/4 p1, 0x4

    .line 64
    invoke-static {p1}, LK0/g0;->a(I)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    invoke-static {p1}, LK0/h0;->i(I)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-virtual {p0}, LK0/e0;->N2()Landroidx/compose/ui/e$c;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    if-nez v1, :cond_4

    .line 84
    .line 85
    goto/16 :goto_7

    .line 86
    .line 87
    :cond_4
    :goto_1
    invoke-static {p0, v0}, LK0/e0;->k2(LK0/e0;Z)Landroidx/compose/ui/e$c;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    :goto_2
    if-eqz v0, :cond_d

    .line 92
    .line 93
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    and-int/2addr v2, p1

    .line 98
    if-eqz v2, :cond_d

    .line 99
    .line 100
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    and-int/2addr v2, p1

    .line 105
    if-eqz v2, :cond_c

    .line 106
    .line 107
    const/4 v2, 0x0

    .line 108
    move-object v3, v0

    .line 109
    move-object v4, v2

    .line 110
    :goto_3
    if-eqz v3, :cond_c

    .line 111
    .line 112
    instance-of v5, v3, LK0/t;

    .line 113
    .line 114
    if-eqz v5, :cond_5

    .line 115
    .line 116
    check-cast v3, LK0/t;

    .line 117
    .line 118
    invoke-interface {v3}, LK0/t;->onMeasureResultChanged()V

    .line 119
    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_5
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    and-int/2addr v5, p1

    .line 127
    if-eqz v5, :cond_b

    .line 128
    .line 129
    instance-of v5, v3, LK0/m;

    .line 130
    .line 131
    if-eqz v5, :cond_b

    .line 132
    .line 133
    move-object v5, v3

    .line 134
    check-cast v5, LK0/m;

    .line 135
    .line 136
    invoke-virtual {v5}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    move v6, p2

    .line 141
    :goto_4
    const/4 v7, 0x1

    .line 142
    if-eqz v5, :cond_a

    .line 143
    .line 144
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 145
    .line 146
    .line 147
    move-result v8

    .line 148
    and-int/2addr v8, p1

    .line 149
    if-eqz v8, :cond_9

    .line 150
    .line 151
    add-int/lit8 v6, v6, 0x1

    .line 152
    .line 153
    if-ne v6, v7, :cond_6

    .line 154
    .line 155
    move-object v3, v5

    .line 156
    goto :goto_5

    .line 157
    :cond_6
    if-nez v4, :cond_7

    .line 158
    .line 159
    new-instance v4, La0/c;

    .line 160
    .line 161
    const/16 v7, 0x10

    .line 162
    .line 163
    new-array v7, v7, [Landroidx/compose/ui/e$c;

    .line 164
    .line 165
    invoke-direct {v4, v7, p2}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 166
    .line 167
    .line 168
    :cond_7
    if-eqz v3, :cond_8

    .line 169
    .line 170
    invoke-virtual {v4, v3}, La0/c;->c(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-object v3, v2

    .line 174
    :cond_8
    invoke-virtual {v4, v5}, La0/c;->c(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    :cond_9
    :goto_5
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    goto :goto_4

    .line 182
    :cond_a
    if-ne v6, v7, :cond_b

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_b
    :goto_6
    invoke-static {v4}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    goto :goto_3

    .line 190
    :cond_c
    if-eq v0, v1, :cond_d

    .line 191
    .line 192
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    goto :goto_2

    .line 197
    :cond_d
    :goto_7
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-virtual {p1}, LK0/J;->z0()LK0/p0;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    if-eqz p1, :cond_e

    .line 206
    .line 207
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    invoke-interface {p1, p2}, LK0/p0;->t(LK0/J;)V

    .line 212
    .line 213
    .line 214
    :cond_e
    return-void
.end method

.method public getDensity()F
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK0/J;->R()Li1/d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Li1/d;->getDensity()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public getLayoutDirection()Li1/t;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK0/J;->getLayoutDirection()Li1/t;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public h0(LI0/p;JZ)J
    .locals 2

    .line 1
    instance-of v0, p1, LI0/y;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, LI0/y;

    .line 6
    .line 7
    invoke-virtual {p1}, LI0/y;->c()LK0/e0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, LK0/e0;->d3()V

    .line 12
    .line 13
    .line 14
    const-wide v0, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    xor-long/2addr p2, v0

    .line 20
    invoke-static {p2, p3}, Lr0/f;->e(J)J

    .line 21
    .line 22
    .line 23
    move-result-wide p2

    .line 24
    invoke-virtual {p1, p0, p2, p3, p4}, LI0/y;->h0(LI0/p;JZ)J

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    xor-long/2addr p1, v0

    .line 29
    invoke-static {p1, p2}, Lr0/f;->e(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide p1

    .line 33
    return-wide p1

    .line 34
    :cond_0
    invoke-direct {p0, p1}, LK0/e0;->z3(LI0/p;)LK0/e0;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, LK0/e0;->d3()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p1}, LK0/e0;->y2(LK0/e0;)LK0/e0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    :goto_0
    if-eq p1, v0, :cond_1

    .line 46
    .line 47
    invoke-virtual {p1, p2, p3, p4}, LK0/e0;->A3(JZ)J

    .line 48
    .line 49
    .line 50
    move-result-wide p2

    .line 51
    iget-object p1, p1, LK0/e0;->u:LK0/e0;

    .line 52
    .line 53
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-direct {p0, v0, p2, p3, p4}, LK0/e0;->r2(LK0/e0;JZ)J

    .line 58
    .line 59
    .line 60
    move-result-wide p1

    .line 61
    return-wide p1
.end method

.method public final h3()V
    .locals 15

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {p0, v1}, LK0/e0;->R2(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_c

    .line 12
    .line 13
    sget-object v1, Li0/l;->e:Li0/l$a;

    .line 14
    .line 15
    invoke-virtual {v1}, Li0/l$a;->d()Li0/l;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {v2}, Li0/l;->g()Lkotlin/jvm/functions/Function1;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v4, v3

    .line 28
    :goto_0
    invoke-virtual {v1, v2}, Li0/l$a;->e(Li0/l;)Li0/l;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    :try_start_0
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-static {v0}, LK0/h0;->i(I)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-eqz v6, :cond_1

    .line 41
    .line 42
    invoke-virtual {p0}, LK0/e0;->N2()Landroidx/compose/ui/e$c;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    goto :goto_1

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    goto/16 :goto_8

    .line 49
    .line 50
    :cond_1
    invoke-virtual {p0}, LK0/e0;->N2()Landroidx/compose/ui/e$c;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    if-nez v7, :cond_2

    .line 59
    .line 60
    goto/16 :goto_7

    .line 61
    .line 62
    :cond_2
    :goto_1
    invoke-static {p0, v6}, LK0/e0;->k2(LK0/e0;Z)Landroidx/compose/ui/e$c;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    :goto_2
    if-eqz v6, :cond_b

    .line 67
    .line 68
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    and-int/2addr v8, v0

    .line 73
    if-eqz v8, :cond_b

    .line 74
    .line 75
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    and-int/2addr v8, v0

    .line 80
    if-eqz v8, :cond_a

    .line 81
    .line 82
    move-object v9, v3

    .line 83
    move-object v8, v6

    .line 84
    :goto_3
    if-eqz v8, :cond_a

    .line 85
    .line 86
    instance-of v10, v8, LK0/D;

    .line 87
    .line 88
    if-eqz v10, :cond_3

    .line 89
    .line 90
    check-cast v8, LK0/D;

    .line 91
    .line 92
    invoke-virtual {p0}, Landroidx/compose/ui/layout/s;->R0()J

    .line 93
    .line 94
    .line 95
    move-result-wide v10

    .line 96
    invoke-interface {v8, v10, v11}, LK0/D;->I(J)V

    .line 97
    .line 98
    .line 99
    goto :goto_6

    .line 100
    :cond_3
    invoke-virtual {v8}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 101
    .line 102
    .line 103
    move-result v10

    .line 104
    and-int/2addr v10, v0

    .line 105
    if-eqz v10, :cond_9

    .line 106
    .line 107
    instance-of v10, v8, LK0/m;

    .line 108
    .line 109
    if-eqz v10, :cond_9

    .line 110
    .line 111
    move-object v10, v8

    .line 112
    check-cast v10, LK0/m;

    .line 113
    .line 114
    invoke-virtual {v10}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    const/4 v11, 0x0

    .line 119
    move v12, v11

    .line 120
    :goto_4
    const/4 v13, 0x1

    .line 121
    if-eqz v10, :cond_8

    .line 122
    .line 123
    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 124
    .line 125
    .line 126
    move-result v14

    .line 127
    and-int/2addr v14, v0

    .line 128
    if-eqz v14, :cond_7

    .line 129
    .line 130
    add-int/lit8 v12, v12, 0x1

    .line 131
    .line 132
    if-ne v12, v13, :cond_4

    .line 133
    .line 134
    move-object v8, v10

    .line 135
    goto :goto_5

    .line 136
    :cond_4
    if-nez v9, :cond_5

    .line 137
    .line 138
    new-instance v9, La0/c;

    .line 139
    .line 140
    const/16 v13, 0x10

    .line 141
    .line 142
    new-array v13, v13, [Landroidx/compose/ui/e$c;

    .line 143
    .line 144
    invoke-direct {v9, v13, v11}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 145
    .line 146
    .line 147
    :cond_5
    if-eqz v8, :cond_6

    .line 148
    .line 149
    invoke-virtual {v9, v8}, La0/c;->c(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-object v8, v3

    .line 153
    :cond_6
    invoke-virtual {v9, v10}, La0/c;->c(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    :cond_7
    :goto_5
    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 157
    .line 158
    .line 159
    move-result-object v10

    .line 160
    goto :goto_4

    .line 161
    :cond_8
    if-ne v12, v13, :cond_9

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_9
    :goto_6
    invoke-static {v9}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    goto :goto_3

    .line 169
    :cond_a
    if-eq v6, v7, :cond_b

    .line 170
    .line 171
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    goto :goto_2

    .line 176
    :cond_b
    :goto_7
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 177
    .line 178
    invoke-virtual {v1, v2, v5, v4}, Li0/l$a;->l(Li0/l;Li0/l;Lkotlin/jvm/functions/Function1;)V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :goto_8
    invoke-virtual {v1, v2, v5, v4}, Li0/l$a;->l(Li0/l;Li0/l;Lkotlin/jvm/functions/Function1;)V

    .line 183
    .line 184
    .line 185
    throw v0

    .line 186
    :cond_c
    return-void
.end method

.method public final i3()V
    .locals 11

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, LK0/h0;->i(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p0}, LK0/e0;->N2()Landroidx/compose/ui/e$c;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    goto/16 :goto_6

    .line 25
    .line 26
    :cond_1
    :goto_0
    invoke-static {p0, v1}, LK0/e0;->k2(LK0/e0;Z)Landroidx/compose/ui/e$c;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    :goto_1
    if-eqz v1, :cond_a

    .line 31
    .line 32
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    and-int/2addr v3, v0

    .line 37
    if-eqz v3, :cond_a

    .line 38
    .line 39
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    and-int/2addr v3, v0

    .line 44
    if-eqz v3, :cond_9

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    move-object v4, v1

    .line 48
    move-object v5, v3

    .line 49
    :goto_2
    if-eqz v4, :cond_9

    .line 50
    .line 51
    instance-of v6, v4, LK0/D;

    .line 52
    .line 53
    if-eqz v6, :cond_2

    .line 54
    .line 55
    check-cast v4, LK0/D;

    .line 56
    .line 57
    invoke-interface {v4, p0}, LK0/D;->L(LI0/p;)V

    .line 58
    .line 59
    .line 60
    goto :goto_5

    .line 61
    :cond_2
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    and-int/2addr v6, v0

    .line 66
    if-eqz v6, :cond_8

    .line 67
    .line 68
    instance-of v6, v4, LK0/m;

    .line 69
    .line 70
    if-eqz v6, :cond_8

    .line 71
    .line 72
    move-object v6, v4

    .line 73
    check-cast v6, LK0/m;

    .line 74
    .line 75
    invoke-virtual {v6}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    const/4 v7, 0x0

    .line 80
    move v8, v7

    .line 81
    :goto_3
    const/4 v9, 0x1

    .line 82
    if-eqz v6, :cond_7

    .line 83
    .line 84
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 85
    .line 86
    .line 87
    move-result v10

    .line 88
    and-int/2addr v10, v0

    .line 89
    if-eqz v10, :cond_6

    .line 90
    .line 91
    add-int/lit8 v8, v8, 0x1

    .line 92
    .line 93
    if-ne v8, v9, :cond_3

    .line 94
    .line 95
    move-object v4, v6

    .line 96
    goto :goto_4

    .line 97
    :cond_3
    if-nez v5, :cond_4

    .line 98
    .line 99
    new-instance v5, La0/c;

    .line 100
    .line 101
    const/16 v9, 0x10

    .line 102
    .line 103
    new-array v9, v9, [Landroidx/compose/ui/e$c;

    .line 104
    .line 105
    invoke-direct {v5, v9, v7}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 106
    .line 107
    .line 108
    :cond_4
    if-eqz v4, :cond_5

    .line 109
    .line 110
    invoke-virtual {v5, v4}, La0/c;->c(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-object v4, v3

    .line 114
    :cond_5
    invoke-virtual {v5, v6}, La0/c;->c(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    :cond_6
    :goto_4
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    goto :goto_3

    .line 122
    :cond_7
    if-ne v8, v9, :cond_8

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_8
    :goto_5
    invoke-static {v5}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    goto :goto_2

    .line 130
    :cond_9
    if-eq v1, v2, :cond_a

    .line 131
    .line 132
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    goto :goto_1

    .line 137
    :cond_a
    :goto_6
    return-void
.end method

.method public j()Ljava/lang/Object;
    .locals 12

    .line 1
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK0/J;->t0()LK0/c0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/16 v1, 0x40

    .line 10
    .line 11
    invoke-static {v1}, LK0/g0;->a(I)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {v0, v2}, LK0/c0;->q(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v0, :cond_9

    .line 21
    .line 22
    invoke-virtual {p0}, LK0/e0;->N2()Landroidx/compose/ui/e$c;

    .line 23
    .line 24
    .line 25
    new-instance v0, Lkotlin/jvm/internal/N;

    .line 26
    .line 27
    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v3}, LK0/J;->t0()LK0/c0;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3}, LK0/c0;->p()Landroidx/compose/ui/e$c;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    :goto_0
    if-eqz v3, :cond_8

    .line 43
    .line 44
    invoke-static {v1}, LK0/g0;->a(I)I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    and-int/2addr v4, v5

    .line 53
    if-eqz v4, :cond_7

    .line 54
    .line 55
    invoke-static {v1}, LK0/g0;->a(I)I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    move-object v6, v2

    .line 60
    move-object v5, v3

    .line 61
    :goto_1
    if-eqz v5, :cond_7

    .line 62
    .line 63
    instance-of v7, v5, LK0/s0;

    .line 64
    .line 65
    if-eqz v7, :cond_0

    .line 66
    .line 67
    check-cast v5, LK0/s0;

    .line 68
    .line 69
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    invoke-virtual {v7}, LK0/J;->R()Li1/d;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    iget-object v8, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 78
    .line 79
    invoke-interface {v5, v7, v8}, LK0/s0;->b(Li1/d;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    iput-object v5, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_0
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    and-int/2addr v7, v4

    .line 91
    if-eqz v7, :cond_6

    .line 92
    .line 93
    instance-of v7, v5, LK0/m;

    .line 94
    .line 95
    if-eqz v7, :cond_6

    .line 96
    .line 97
    move-object v7, v5

    .line 98
    check-cast v7, LK0/m;

    .line 99
    .line 100
    invoke-virtual {v7}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    const/4 v8, 0x0

    .line 105
    move v9, v8

    .line 106
    :goto_2
    const/4 v10, 0x1

    .line 107
    if-eqz v7, :cond_5

    .line 108
    .line 109
    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 110
    .line 111
    .line 112
    move-result v11

    .line 113
    and-int/2addr v11, v4

    .line 114
    if-eqz v11, :cond_4

    .line 115
    .line 116
    add-int/lit8 v9, v9, 0x1

    .line 117
    .line 118
    if-ne v9, v10, :cond_1

    .line 119
    .line 120
    move-object v5, v7

    .line 121
    goto :goto_3

    .line 122
    :cond_1
    if-nez v6, :cond_2

    .line 123
    .line 124
    new-instance v6, La0/c;

    .line 125
    .line 126
    const/16 v10, 0x10

    .line 127
    .line 128
    new-array v10, v10, [Landroidx/compose/ui/e$c;

    .line 129
    .line 130
    invoke-direct {v6, v10, v8}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 131
    .line 132
    .line 133
    :cond_2
    if-eqz v5, :cond_3

    .line 134
    .line 135
    invoke-virtual {v6, v5}, La0/c;->c(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-object v5, v2

    .line 139
    :cond_3
    invoke-virtual {v6, v7}, La0/c;->c(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    :cond_4
    :goto_3
    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    goto :goto_2

    .line 147
    :cond_5
    if-ne v9, v10, :cond_6

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_6
    :goto_4
    invoke-static {v6}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    goto :goto_1

    .line 155
    :cond_7
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    goto :goto_0

    .line 160
    :cond_8
    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 161
    .line 162
    return-object v0

    .line 163
    :cond_9
    return-object v2
.end method

.method public j0([F)V
    .locals 6

    .line 1
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LK0/N;->b(LK0/J;)LK0/p0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p0}, LI0/q;->d(LI0/p;)LI0/p;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {p0, v1}, LK0/e0;->z3(LI0/p;)LK0/e0;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {p0, v1, p1}, LK0/e0;->E3(LK0/e0;[F)V

    .line 18
    .line 19
    .line 20
    instance-of v2, v0, LE0/h;

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    check-cast v0, LE0/h;

    .line 25
    .line 26
    invoke-interface {v0, p1}, LE0/h;->m([F)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    invoke-static {v1}, LI0/q;->g(LI0/p;)J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    const-wide v2, 0x7fffffff7fffffffL

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    and-long/2addr v2, v0

    .line 40
    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    cmp-long v2, v2, v4

    .line 46
    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    const/16 v2, 0x20

    .line 50
    .line 51
    shr-long v2, v0, v2

    .line 52
    .line 53
    long-to-int v2, v2

    .line 54
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    const-wide v3, 0xffffffffL

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    and-long/2addr v0, v3

    .line 64
    long-to-int v0, v0

    .line 65
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    const/4 v1, 0x0

    .line 70
    invoke-static {p1, v2, v0, v1}, Ls0/g1;->n([FFFF)V

    .line 71
    .line 72
    .line 73
    :cond_1
    return-void
.end method

.method public j1()F
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK0/J;->R()Li1/d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Li1/l;->j1()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final j3()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LK0/e0;->v:Z

    .line 3
    .line 4
    iget-object v0, p0, LK0/e0;->Y:Lie/a;

    .line 5
    .line 6
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, LK0/e0;->r3()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final k3()V
    .locals 11

    .line 1
    const/high16 v0, 0x100000

    .line 2
    .line 3
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {p0, v1}, LK0/e0;->R2(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_9

    .line 12
    .line 13
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {v0}, LK0/h0;->i(I)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {p0}, LK0/e0;->N2()Landroidx/compose/ui/e$c;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    goto/16 :goto_5

    .line 35
    .line 36
    :cond_1
    :goto_0
    invoke-static {p0, v1}, LK0/e0;->k2(LK0/e0;Z)Landroidx/compose/ui/e$c;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :goto_1
    if-eqz v1, :cond_9

    .line 41
    .line 42
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    and-int/2addr v3, v0

    .line 47
    if-eqz v3, :cond_9

    .line 48
    .line 49
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    and-int/2addr v3, v0

    .line 54
    if-eqz v3, :cond_8

    .line 55
    .line 56
    const/4 v3, 0x0

    .line 57
    move-object v4, v1

    .line 58
    move-object v5, v3

    .line 59
    :goto_2
    if-eqz v4, :cond_8

    .line 60
    .line 61
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    and-int/2addr v6, v0

    .line 66
    if-eqz v6, :cond_7

    .line 67
    .line 68
    instance-of v6, v4, LK0/m;

    .line 69
    .line 70
    if-eqz v6, :cond_7

    .line 71
    .line 72
    move-object v6, v4

    .line 73
    check-cast v6, LK0/m;

    .line 74
    .line 75
    invoke-virtual {v6}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    const/4 v7, 0x0

    .line 80
    move v8, v7

    .line 81
    :goto_3
    const/4 v9, 0x1

    .line 82
    if-eqz v6, :cond_6

    .line 83
    .line 84
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 85
    .line 86
    .line 87
    move-result v10

    .line 88
    and-int/2addr v10, v0

    .line 89
    if-eqz v10, :cond_5

    .line 90
    .line 91
    add-int/lit8 v8, v8, 0x1

    .line 92
    .line 93
    if-ne v8, v9, :cond_2

    .line 94
    .line 95
    move-object v4, v6

    .line 96
    goto :goto_4

    .line 97
    :cond_2
    if-nez v5, :cond_3

    .line 98
    .line 99
    new-instance v5, La0/c;

    .line 100
    .line 101
    const/16 v9, 0x10

    .line 102
    .line 103
    new-array v9, v9, [Landroidx/compose/ui/e$c;

    .line 104
    .line 105
    invoke-direct {v5, v9, v7}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 106
    .line 107
    .line 108
    :cond_3
    if-eqz v4, :cond_4

    .line 109
    .line 110
    invoke-virtual {v5, v4}, La0/c;->c(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-object v4, v3

    .line 114
    :cond_4
    invoke-virtual {v5, v6}, La0/c;->c(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    :cond_5
    :goto_4
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    goto :goto_3

    .line 122
    :cond_6
    if-ne v8, v9, :cond_7

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_7
    invoke-static {v5}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    goto :goto_2

    .line 130
    :cond_8
    if-eq v1, v2, :cond_9

    .line 131
    .line 132
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    goto :goto_1

    .line 137
    :cond_9
    :goto_5
    return-void
.end method

.method public abstract m3(Ls0/j0;Lv0/c;)V
.end method

.method public o0(LI0/p;[F)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, LK0/e0;->z3(LI0/p;)LK0/e0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, LK0/e0;->d3()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, LK0/e0;->y2(LK0/e0;)LK0/e0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {p2}, Ls0/g1;->h([F)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p1, v0, p2}, LK0/e0;->E3(LK0/e0;[F)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, v0, p2}, LK0/e0;->D3(LK0/e0;[F)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final o3(JFLkotlin/jvm/functions/Function1;Lv0/c;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/layout/s;->O0()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {p1, p2, v0, v1}, Li1/n;->o(JJ)J

    .line 6
    .line 7
    .line 8
    move-result-wide v3

    .line 9
    move-object v2, p0

    .line 10
    move v5, p3

    .line 11
    move-object v6, p4

    .line 12
    move-object v7, p5

    .line 13
    invoke-direct/range {v2 .. v7}, LK0/e0;->n3(JFLkotlin/jvm/functions/Function1;Lv0/c;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final p3(Lr0/d;ZZ)V
    .locals 8

    .line 1
    iget-object v0, p0, LK0/e0;->l0:LK0/o0;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-boolean v1, p0, LK0/e0;->w:Z

    .line 6
    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    const-wide v1, 0xffffffffL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const/16 v3, 0x20

    .line 15
    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, LK0/e0;->J2()J

    .line 19
    .line 20
    .line 21
    move-result-wide p2

    .line 22
    shr-long v4, p2, v3

    .line 23
    .line 24
    long-to-int v4, v4

    .line 25
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    const/high16 v5, 0x40000000    # 2.0f

    .line 30
    .line 31
    div-float/2addr v4, v5

    .line 32
    and-long/2addr p2, v1

    .line 33
    long-to-int p2, p2

    .line 34
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    div-float/2addr p2, v5

    .line 39
    neg-float p3, v4

    .line 40
    neg-float v5, p2

    .line 41
    invoke-virtual {p0}, LK0/e0;->a()J

    .line 42
    .line 43
    .line 44
    move-result-wide v6

    .line 45
    shr-long/2addr v6, v3

    .line 46
    long-to-int v3, v6

    .line 47
    int-to-float v3, v3

    .line 48
    add-float/2addr v3, v4

    .line 49
    invoke-virtual {p0}, LK0/e0;->a()J

    .line 50
    .line 51
    .line 52
    move-result-wide v6

    .line 53
    and-long/2addr v1, v6

    .line 54
    long-to-int v1, v1

    .line 55
    int-to-float v1, v1

    .line 56
    add-float/2addr v1, p2

    .line 57
    invoke-virtual {p1, p3, v5, v3, v1}, Lr0/d;->e(FFFF)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    if-eqz p2, :cond_1

    .line 62
    .line 63
    invoke-virtual {p0}, LK0/e0;->a()J

    .line 64
    .line 65
    .line 66
    move-result-wide p2

    .line 67
    shr-long/2addr p2, v3

    .line 68
    long-to-int p2, p2

    .line 69
    int-to-float p2, p2

    .line 70
    invoke-virtual {p0}, LK0/e0;->a()J

    .line 71
    .line 72
    .line 73
    move-result-wide v3

    .line 74
    and-long/2addr v1, v3

    .line 75
    long-to-int p3, v1

    .line 76
    int-to-float p3, p3

    .line 77
    const/4 v1, 0x0

    .line 78
    invoke-virtual {p1, v1, v1, p2, p3}, Lr0/d;->e(FFFF)V

    .line 79
    .line 80
    .line 81
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lr0/d;->f()Z

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    if-eqz p2, :cond_2

    .line 86
    .line 87
    return-void

    .line 88
    :cond_2
    const/4 p2, 0x0

    .line 89
    invoke-interface {v0, p1, p2}, LK0/o0;->f(Lr0/d;Z)V

    .line 90
    .line 91
    .line 92
    :cond_3
    invoke-virtual {p0}, LK0/e0;->P1()J

    .line 93
    .line 94
    .line 95
    move-result-wide p2

    .line 96
    invoke-static {p2, p3}, Li1/n;->k(J)I

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    invoke-virtual {p1}, Lr0/d;->b()F

    .line 101
    .line 102
    .line 103
    move-result p3

    .line 104
    int-to-float p2, p2

    .line 105
    add-float/2addr p3, p2

    .line 106
    invoke-virtual {p1, p3}, Lr0/d;->i(F)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1}, Lr0/d;->c()F

    .line 110
    .line 111
    .line 112
    move-result p3

    .line 113
    add-float/2addr p3, p2

    .line 114
    invoke-virtual {p1, p3}, Lr0/d;->j(F)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, LK0/e0;->P1()J

    .line 118
    .line 119
    .line 120
    move-result-wide p2

    .line 121
    invoke-static {p2, p3}, Li1/n;->l(J)I

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    invoke-virtual {p1}, Lr0/d;->d()F

    .line 126
    .line 127
    .line 128
    move-result p3

    .line 129
    int-to-float p2, p2

    .line 130
    add-float/2addr p3, p2

    .line 131
    invoke-virtual {p1, p3}, Lr0/d;->k(F)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Lr0/d;->a()F

    .line 135
    .line 136
    .line 137
    move-result p3

    .line 138
    add-float/2addr p3, p2

    .line 139
    invoke-virtual {p1, p3}, Lr0/d;->h(F)V

    .line 140
    .line 141
    .line 142
    return-void
.end method

.method public q(J)J
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/e0;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 8
    .line 9
    invoke-static {v0}, LH0/a;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, LK0/N;->b(LK0/J;)LK0/p0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0, p1, p2}, LE0/S;->q(J)J

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    invoke-static {p0}, LI0/q;->d(LI0/p;)LI0/p;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p0, v0, p1, p2}, LK0/e0;->y0(LI0/p;J)J

    .line 29
    .line 30
    .line 31
    move-result-wide p1

    .line 32
    return-wide p1
.end method

.method public final r3()V
    .locals 4

    .line 1
    iget-object v0, p0, LK0/e0;->l0:LK0/o0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, LK0/e0;->m0:Lv0/c;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iput-object v1, p0, LK0/e0;->m0:Lv0/c;

    .line 11
    .line 12
    :cond_0
    const/4 v0, 0x2

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {p0, v1, v2, v0, v1}, LK0/e0;->G3(LK0/e0;Lkotlin/jvm/functions/Function1;ZILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v3, 0x1

    .line 22
    invoke-static {v0, v2, v3, v1}, LK0/J;->G1(LK0/J;ZILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method protected final s2(J)J
    .locals 6

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p1, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {p0}, Landroidx/compose/ui/layout/s;->S0()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    int-to-float v2, v2

    .line 15
    sub-float/2addr v1, v2

    .line 16
    const-wide v2, 0xffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    and-long/2addr p1, v2

    .line 22
    long-to-int p1, p1

    .line 23
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-virtual {p0}, Landroidx/compose/ui/layout/s;->Q0()I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    int-to-float p2, p2

    .line 32
    sub-float/2addr p1, p2

    .line 33
    const/high16 p2, 0x40000000    # 2.0f

    .line 34
    .line 35
    div-float/2addr v1, p2

    .line 36
    const/4 v4, 0x0

    .line 37
    invoke-static {v4, v1}, Ljava/lang/Math;->max(FF)F

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    div-float/2addr p1, p2

    .line 42
    invoke-static {v4, p1}, Ljava/lang/Math;->max(FF)F

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    int-to-long v4, p2

    .line 51
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    int-to-long p1, p1

    .line 56
    shl-long v0, v4, v0

    .line 57
    .line 58
    and-long/2addr p1, v2

    .line 59
    or-long/2addr p1, v0

    .line 60
    invoke-static {p1, p2}, Lr0/l;->d(J)J

    .line 61
    .line 62
    .line 63
    move-result-wide p1

    .line 64
    return-wide p1
.end method

.method public final s3(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LK0/e0;->r:Z

    .line 2
    .line 3
    return-void
.end method

.method protected final t2(JJ)F
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/layout/s;->S0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    const/16 v1, 0x20

    .line 7
    .line 8
    shr-long v2, p3, v1

    .line 9
    .line 10
    long-to-int v2, v2

    .line 11
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    cmpl-float v0, v0, v2

    .line 16
    .line 17
    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 18
    .line 19
    const-wide v3, 0xffffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    if-ltz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/compose/ui/layout/s;->Q0()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    int-to-float v0, v0

    .line 31
    and-long v5, p3, v3

    .line 32
    .line 33
    long-to-int v5, v5

    .line 34
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    cmpl-float v0, v0, v5

    .line 39
    .line 40
    if-ltz v0, :cond_0

    .line 41
    .line 42
    return v2

    .line 43
    :cond_0
    invoke-virtual {p0, p3, p4}, LK0/e0;->s2(J)J

    .line 44
    .line 45
    .line 46
    move-result-wide p3

    .line 47
    shr-long v5, p3, v1

    .line 48
    .line 49
    long-to-int v0, v5

    .line 50
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    and-long/2addr p3, v3

    .line 55
    long-to-int p3, p3

    .line 56
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    invoke-direct {p0, p1, p2}, LK0/e0;->c3(J)J

    .line 61
    .line 62
    .line 63
    move-result-wide p1

    .line 64
    const/4 p4, 0x0

    .line 65
    cmpl-float v5, v0, p4

    .line 66
    .line 67
    if-gtz v5, :cond_1

    .line 68
    .line 69
    cmpl-float p4, p3, p4

    .line 70
    .line 71
    if-lez p4, :cond_2

    .line 72
    .line 73
    :cond_1
    shr-long v5, p1, v1

    .line 74
    .line 75
    long-to-int p4, v5

    .line 76
    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 77
    .line 78
    .line 79
    move-result p4

    .line 80
    cmpg-float p4, p4, v0

    .line 81
    .line 82
    if-gtz p4, :cond_2

    .line 83
    .line 84
    and-long v0, p1, v3

    .line 85
    .line 86
    long-to-int p4, v0

    .line 87
    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 88
    .line 89
    .line 90
    move-result p4

    .line 91
    cmpg-float p3, p4, p3

    .line 92
    .line 93
    if-gtz p3, :cond_2

    .line 94
    .line 95
    invoke-static {p1, p2}, Lr0/f;->l(J)F

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    return p1

    .line 100
    :cond_2
    return v2
.end method

.method public t3(LI0/C;)V
    .locals 3

    .line 1
    iget-object v0, p0, LK0/e0;->B:LI0/C;

    .line 2
    .line 3
    if-eq p1, v0, :cond_5

    .line 4
    .line 5
    iput-object p1, p0, LK0/e0;->B:LI0/C;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {p1}, LI0/C;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-interface {v0}, LI0/C;->getWidth()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    invoke-interface {p1}, LI0/C;->getHeight()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-interface {v0}, LI0/C;->getHeight()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eq v1, v0, :cond_1

    .line 28
    .line 29
    :cond_0
    invoke-interface {p1}, LI0/C;->getWidth()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-interface {p1}, LI0/C;->getHeight()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {p0, v0, v1}, LK0/e0;->g3(II)V

    .line 38
    .line 39
    .line 40
    :cond_1
    iget-object v0, p0, LK0/e0;->C:Lt/K;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Lt/T;->h()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    :cond_2
    invoke-interface {p1}, LI0/C;->z()Ljava/util/Map;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_5

    .line 62
    .line 63
    :cond_3
    iget-object v0, p0, LK0/e0;->C:Lt/K;

    .line 64
    .line 65
    invoke-interface {p1}, LI0/C;->z()Ljava/util/Map;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-static {v0, v1}, LK0/f0;->a(Lt/K;Ljava/util/Map;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_5

    .line 74
    .line 75
    invoke-virtual {p0}, LK0/e0;->C2()LK0/b;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-interface {v0}, LK0/b;->z()LK0/a;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, LK0/a;->m()V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, LK0/e0;->C:Lt/K;

    .line 87
    .line 88
    if-nez v0, :cond_4

    .line 89
    .line 90
    invoke-static {}, Lt/U;->b()Lt/K;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iput-object v0, p0, LK0/e0;->C:Lt/K;

    .line 95
    .line 96
    :cond_4
    invoke-virtual {v0}, Lt/K;->j()V

    .line 97
    .line 98
    .line 99
    invoke-interface {p1}, LI0/C;->z()Ljava/util/Map;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-eqz v1, :cond_5

    .line 116
    .line 117
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    check-cast v1, Ljava/util/Map$Entry;

    .line 122
    .line 123
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    check-cast v1, Ljava/lang/Number;

    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    invoke-virtual {v0, v2, v1}, Lt/K;->u(Ljava/lang/Object;I)V

    .line 138
    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_5
    return-void
.end method

.method public final u2(Ls0/j0;Lv0/c;)V
    .locals 3

    .line 1
    iget-object v0, p0, LK0/e0;->l0:LK0/o0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, LK0/o0;->i(Ls0/j0;Lv0/c;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p0}, LK0/e0;->P1()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-static {v0, v1}, Li1/n;->k(J)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    int-to-float v0, v0

    .line 18
    invoke-virtual {p0}, LK0/e0;->P1()J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    invoke-static {v1, v2}, Li1/n;->l(J)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    int-to-float v1, v1

    .line 27
    invoke-interface {p1, v0, v1}, Ls0/j0;->d(FF)V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0, p1, p2}, LK0/e0;->w2(Ls0/j0;Lv0/c;)V

    .line 31
    .line 32
    .line 33
    neg-float p2, v0

    .line 34
    neg-float v0, v1

    .line 35
    invoke-interface {p1, p2, v0}, Ls0/j0;->d(FF)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method protected u3(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, LK0/e0;->D:J

    .line 2
    .line 3
    return-void
.end method

.method protected final v2(Ls0/j0;Ls0/k1;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/layout/s;->R0()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    shr-long/2addr v0, v2

    .line 8
    long-to-int v0, v0

    .line 9
    int-to-float v0, v0

    .line 10
    const/high16 v1, 0x3f000000    # 0.5f

    .line 11
    .line 12
    sub-float v5, v0, v1

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/compose/ui/layout/s;->R0()J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    const-wide v6, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr v2, v6

    .line 24
    long-to-int v0, v2

    .line 25
    int-to-float v0, v0

    .line 26
    sub-float v6, v0, v1

    .line 27
    .line 28
    const/high16 v3, 0x3f000000    # 0.5f

    .line 29
    .line 30
    const/high16 v4, 0x3f000000    # 0.5f

    .line 31
    .line 32
    move-object v2, p1

    .line 33
    move-object v7, p2

    .line 34
    invoke-interface/range {v2 .. v7}, Ls0/j0;->w(FFFFLs0/k1;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final v3(LK0/e0;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK0/e0;->t:LK0/e0;

    .line 2
    .line 3
    return-void
.end method

.method public w0(LI0/p;Z)Lr0/h;
    .locals 8

    .line 1
    invoke-virtual {p0}, LK0/e0;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 8
    .line 9
    invoke-static {v0}, LH0/a;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-interface {p1}, LI0/p;->b()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v1, "LayoutCoordinates "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, " is not attached!"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, LH0/a;->b(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-direct {p0, p1}, LK0/e0;->z3(LI0/p;)LK0/e0;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, LK0/e0;->d3()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0}, LK0/e0;->y2(LK0/e0;)LK0/e0;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {p0}, LK0/e0;->L2()Lr0/d;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    const/4 v2, 0x0

    .line 59
    invoke-virtual {v3, v2}, Lr0/d;->i(F)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, v2}, Lr0/d;->k(F)V

    .line 63
    .line 64
    .line 65
    invoke-interface {p1}, LI0/p;->a()J

    .line 66
    .line 67
    .line 68
    move-result-wide v4

    .line 69
    const/16 v2, 0x20

    .line 70
    .line 71
    shr-long/2addr v4, v2

    .line 72
    long-to-int v2, v4

    .line 73
    int-to-float v2, v2

    .line 74
    invoke-virtual {v3, v2}, Lr0/d;->j(F)V

    .line 75
    .line 76
    .line 77
    invoke-interface {p1}, LI0/p;->a()J

    .line 78
    .line 79
    .line 80
    move-result-wide v4

    .line 81
    const-wide v6, 0xffffffffL

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    and-long/2addr v4, v6

    .line 87
    long-to-int p1, v4

    .line 88
    int-to-float p1, p1

    .line 89
    invoke-virtual {v3, p1}, Lr0/d;->h(F)V

    .line 90
    .line 91
    .line 92
    move-object v2, v0

    .line 93
    :goto_0
    if-eq v2, v1, :cond_3

    .line 94
    .line 95
    const/4 v6, 0x4

    .line 96
    const/4 v7, 0x0

    .line 97
    const/4 v5, 0x0

    .line 98
    move v4, p2

    .line 99
    invoke-static/range {v2 .. v7}, LK0/e0;->q3(LK0/e0;Lr0/d;ZZILjava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3}, Lr0/d;->f()Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-eqz p1, :cond_2

    .line 107
    .line 108
    sget-object p1, Lr0/h;->e:Lr0/h$a;

    .line 109
    .line 110
    invoke-virtual {p1}, Lr0/h$a;->a()Lr0/h;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    return-object p1

    .line 115
    :cond_2
    iget-object v2, v2, LK0/e0;->u:LK0/e0;

    .line 116
    .line 117
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    move p2, v4

    .line 121
    goto :goto_0

    .line 122
    :cond_3
    move v4, p2

    .line 123
    invoke-direct {p0, v1, v3, v4}, LK0/e0;->q2(LK0/e0;Lr0/d;Z)V

    .line 124
    .line 125
    .line 126
    invoke-static {v3}, Lr0/e;->a(Lr0/d;)Lr0/h;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    return-object p1
.end method

.method public final w3(LK0/e0;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK0/e0;->u:LK0/e0;

    .line 2
    .line 3
    return-void
.end method

.method public x()LI0/p;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final x0()LI0/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/e0;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 8
    .line 9
    invoke-static {v0}, LH0/a;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, LK0/e0;->d3()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, LK0/J;->w0()LK0/e0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v0, v0, LK0/e0;->u:LK0/e0;

    .line 24
    .line 25
    return-object v0
.end method

.method public abstract x2()V
.end method

.method public final x3()Z
    .locals 11

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, LK0/h0;->i(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-direct {p0, v1}, LK0/e0;->T2(Z)Landroidx/compose/ui/e$c;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    return v2

    .line 19
    :cond_0
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_a

    .line 24
    .line 25
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-interface {v1}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-nez v4, :cond_1

    .line 38
    .line 39
    const-string v4, "visitLocalDescendants called on an unattached node"

    .line 40
    .line 41
    invoke-static {v4}, LH0/a;->b(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-interface {v1}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    and-int/2addr v4, v3

    .line 53
    if-eqz v4, :cond_a

    .line 54
    .line 55
    :goto_0
    if-eqz v1, :cond_a

    .line 56
    .line 57
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    and-int/2addr v4, v3

    .line 62
    if-eqz v4, :cond_9

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    move-object v5, v1

    .line 66
    move-object v6, v4

    .line 67
    :goto_1
    if-eqz v5, :cond_9

    .line 68
    .line 69
    instance-of v7, v5, LK0/v0;

    .line 70
    .line 71
    const/4 v8, 0x1

    .line 72
    if-eqz v7, :cond_2

    .line 73
    .line 74
    check-cast v5, LK0/v0;

    .line 75
    .line 76
    invoke-interface {v5}, LK0/v0;->u1()Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-eqz v5, :cond_8

    .line 81
    .line 82
    return v8

    .line 83
    :cond_2
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    and-int/2addr v7, v3

    .line 88
    if-eqz v7, :cond_8

    .line 89
    .line 90
    instance-of v7, v5, LK0/m;

    .line 91
    .line 92
    if-eqz v7, :cond_8

    .line 93
    .line 94
    move-object v7, v5

    .line 95
    check-cast v7, LK0/m;

    .line 96
    .line 97
    invoke-virtual {v7}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    move v9, v2

    .line 102
    :goto_2
    if-eqz v7, :cond_7

    .line 103
    .line 104
    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 105
    .line 106
    .line 107
    move-result v10

    .line 108
    and-int/2addr v10, v3

    .line 109
    if-eqz v10, :cond_6

    .line 110
    .line 111
    add-int/lit8 v9, v9, 0x1

    .line 112
    .line 113
    if-ne v9, v8, :cond_3

    .line 114
    .line 115
    move-object v5, v7

    .line 116
    goto :goto_3

    .line 117
    :cond_3
    if-nez v6, :cond_4

    .line 118
    .line 119
    new-instance v6, La0/c;

    .line 120
    .line 121
    new-array v10, v0, [Landroidx/compose/ui/e$c;

    .line 122
    .line 123
    invoke-direct {v6, v10, v2}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 124
    .line 125
    .line 126
    :cond_4
    if-eqz v5, :cond_5

    .line 127
    .line 128
    invoke-virtual {v6, v5}, La0/c;->c(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-object v5, v4

    .line 132
    :cond_5
    invoke-virtual {v6, v7}, La0/c;->c(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    :cond_6
    :goto_3
    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    goto :goto_2

    .line 140
    :cond_7
    if-ne v9, v8, :cond_8

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_8
    invoke-static {v6}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    goto :goto_1

    .line 148
    :cond_9
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    goto :goto_0

    .line 153
    :cond_a
    return v2
.end method

.method public y0(LI0/p;J)J
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, p2, p3, v0}, LK0/e0;->h0(LI0/p;JZ)J

    .line 3
    .line 4
    .line 5
    move-result-wide p1

    .line 6
    return-wide p1
.end method

.method public final y2(LK0/e0;)LK0/e0;
    .locals 4

    .line 1
    invoke-virtual {p1}, LK0/e0;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-ne v0, v1, :cond_2

    .line 10
    .line 11
    invoke-virtual {p1}, LK0/e0;->N2()Landroidx/compose/ui/e$c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0}, LK0/e0;->N2()Landroidx/compose/ui/e$c;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x2

    .line 20
    invoke-static {v2}, LK0/g0;->a(I)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-interface {v1}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-nez v3, :cond_0

    .line 33
    .line 34
    const-string v3, "visitLocalAncestors called on an unattached node"

    .line 35
    .line 36
    invoke-static {v3}, LH0/a;->b(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-interface {v1}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    :goto_0
    if-eqz v1, :cond_7

    .line 48
    .line 49
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    and-int/2addr v3, v2

    .line 54
    if-eqz v3, :cond_1

    .line 55
    .line 56
    if-ne v1, v0, :cond_1

    .line 57
    .line 58
    goto :goto_4

    .line 59
    :cond_1
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    goto :goto_0

    .line 64
    :cond_2
    :goto_1
    invoke-virtual {v0}, LK0/J;->S()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    invoke-virtual {v1}, LK0/J;->S()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-le v2, v3, :cond_3

    .line 73
    .line 74
    invoke-virtual {v0}, LK0/J;->A0()LK0/J;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    :goto_2
    invoke-virtual {v1}, LK0/J;->S()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    invoke-virtual {v0}, LK0/J;->S()I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-le v2, v3, :cond_4

    .line 91
    .line 92
    invoke-virtual {v1}, LK0/J;->A0()LK0/J;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_4
    :goto_3
    if-eq v0, v1, :cond_6

    .line 101
    .line 102
    invoke-virtual {v0}, LK0/J;->A0()LK0/J;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v1}, LK0/J;->A0()LK0/J;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    if-eqz v0, :cond_5

    .line 111
    .line 112
    if-eqz v1, :cond_5

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 116
    .line 117
    const-string v0, "layouts are not part of the same hierarchy"

    .line 118
    .line 119
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw p1

    .line 123
    :cond_6
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    if-ne v1, v2, :cond_8

    .line 128
    .line 129
    :cond_7
    return-object p0

    .line 130
    :cond_8
    invoke-virtual {p1}, LK0/e0;->L1()LK0/J;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    if-ne v0, v1, :cond_9

    .line 135
    .line 136
    :goto_4
    return-object p1

    .line 137
    :cond_9
    invoke-virtual {v0}, LK0/J;->X()LK0/e0;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    return-object p1
.end method

.method public z2(JZ)J
    .locals 2

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, LK0/T;->T1()Z

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, LK0/e0;->P1()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    invoke-static {p1, p2, v0, v1}, Li1/o;->b(JJ)J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    :goto_0
    iget-object p3, p0, LK0/e0;->l0:LK0/o0;

    .line 19
    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    invoke-interface {p3, p1, p2, v0}, LK0/o0;->d(JZ)J

    .line 24
    .line 25
    .line 26
    move-result-wide p1

    .line 27
    :cond_1
    return-wide p1
.end method
