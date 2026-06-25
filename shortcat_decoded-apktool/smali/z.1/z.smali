.class public final Lz/z;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private a:Lz/x;

.field private b:Lx/T;

.field private c:Lz/n;

.field private d:Lz/q;

.field private e:Z

.field private f:LD0/b;

.field private g:I

.field private h:Lz/u;

.field private final i:Lz/z$c;

.field private final j:Lkotlin/jvm/functions/Function1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lz/x;Lx/T;Lz/n;Lz/q;ZLD0/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz/z;->a:Lz/x;

    .line 5
    .line 6
    iput-object p2, p0, Lz/z;->b:Lx/T;

    .line 7
    .line 8
    iput-object p3, p0, Lz/z;->c:Lz/n;

    .line 9
    .line 10
    iput-object p4, p0, Lz/z;->d:Lz/q;

    .line 11
    .line 12
    iput-boolean p5, p0, Lz/z;->e:Z

    .line 13
    .line 14
    iput-object p6, p0, Lz/z;->f:LD0/b;

    .line 15
    .line 16
    sget-object p1, LD0/e;->a:LD0/e$a;

    .line 17
    .line 18
    invoke-virtual {p1}, LD0/e$a;->b()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iput p1, p0, Lz/z;->g:I

    .line 23
    .line 24
    invoke-static {}, Landroidx/compose/foundation/gestures/d;->b()Lz/u;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lz/z;->h:Lz/u;

    .line 29
    .line 30
    new-instance p1, Lz/z$c;

    .line 31
    .line 32
    invoke-direct {p1, p0}, Lz/z$c;-><init>(Lz/z;)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lz/z;->i:Lz/z$c;

    .line 36
    .line 37
    new-instance p1, Lz/z$e;

    .line 38
    .line 39
    invoke-direct {p1, p0}, Lz/z$e;-><init>(Lz/z;)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lz/z;->j:Lkotlin/jvm/functions/Function1;

    .line 43
    .line 44
    return-void
.end method

.method private final D(JF)J
    .locals 8

    .line 1
    iget-object v0, p0, Lz/z;->d:Lz/q;

    .line 2
    .line 3
    sget-object v1, Lz/q;->b:Lz/q;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v6, 0x2

    .line 8
    const/4 v7, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    move-wide v2, p1

    .line 11
    move v4, p3

    .line 12
    invoke-static/range {v2 .. v7}, Li1/y;->e(JFFILjava/lang/Object;)J

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    return-wide p1

    .line 17
    :cond_0
    move-wide v0, p1

    .line 18
    move v3, p3

    .line 19
    const/4 v4, 0x1

    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-static/range {v0 .. v5}, Li1/y;->e(JFFILjava/lang/Object;)J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    return-wide p1
.end method

.method public static final synthetic a(Lz/z;)Lz/n;
    .locals 0

    .line 1
    iget-object p0, p0, Lz/z;->c:Lz/n;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(Lz/z;)I
    .locals 0

    .line 1
    iget p0, p0, Lz/z;->g:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic c(Lz/z;)LD0/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lz/z;->f:LD0/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(Lz/z;)Lz/z$c;
    .locals 0

    .line 1
    iget-object p0, p0, Lz/z;->i:Lz/z$c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic e(Lz/z;)Lz/u;
    .locals 0

    .line 1
    iget-object p0, p0, Lz/z;->h:Lz/u;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(Lz/z;)Lx/T;
    .locals 0

    .line 1
    iget-object p0, p0, Lz/z;->b:Lx/T;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g(Lz/z;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 1
    iget-object p0, p0, Lz/z;->j:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic h(Lz/z;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lz/z;->o()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic i(Lz/z;Lz/u;JI)J
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lz/z;->s(Lz/u;JI)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static final synthetic j(Lz/z;I)V
    .locals 0

    .line 1
    iput p1, p0, Lz/z;->g:I

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic k(Lz/z;Lz/u;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz/z;->h:Lz/u;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic l(Lz/z;J)F
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lz/z;->z(J)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic m(Lz/z;JF)J
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lz/z;->D(JF)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method private final o()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lz/z;->a:Lz/x;

    .line 2
    .line 3
    invoke-interface {v0}, Lz/x;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lz/z;->a:Lz/x;

    .line 10
    .line 11
    invoke-interface {v0}, Lz/x;->c()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return v0

    .line 20
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 21
    return v0
.end method

.method private final s(Lz/u;JI)J
    .locals 10

    .line 1
    iget-object v0, p0, Lz/z;->f:LD0/b;

    .line 2
    .line 3
    invoke-virtual {v0, p2, p3, p4}, LD0/b;->d(JI)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-static {p2, p3, v0, v1}, Lr0/f;->p(JJ)J

    .line 8
    .line 9
    .line 10
    move-result-wide p2

    .line 11
    invoke-virtual {p0, p2, p3}, Lz/z;->x(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    invoke-virtual {p0, v2, v3}, Lz/z;->u(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    invoke-virtual {p0, v2, v3}, Lz/z;->A(J)F

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-interface {p1, v2}, Lz/u;->a(F)F

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-virtual {p0, p1}, Lz/z;->B(F)J

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    invoke-virtual {p0, v2, v3}, Lz/z;->u(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v5

    .line 35
    invoke-static {p2, p3, v5, v6}, Lr0/f;->p(JJ)J

    .line 36
    .line 37
    .line 38
    move-result-wide v7

    .line 39
    iget-object v4, p0, Lz/z;->f:LD0/b;

    .line 40
    .line 41
    move v9, p4

    .line 42
    invoke-virtual/range {v4 .. v9}, LD0/b;->b(JJI)J

    .line 43
    .line 44
    .line 45
    move-result-wide p1

    .line 46
    invoke-static {v0, v1, v5, v6}, Lr0/f;->q(JJ)J

    .line 47
    .line 48
    .line 49
    move-result-wide p3

    .line 50
    invoke-static {p3, p4, p1, p2}, Lr0/f;->q(JJ)J

    .line 51
    .line 52
    .line 53
    move-result-wide p1

    .line 54
    return-wide p1
.end method

.method private final y(J)J
    .locals 8

    .line 1
    iget-object v0, p0, Lz/z;->d:Lz/q;

    .line 2
    .line 3
    sget-object v1, Lz/q;->b:Lz/q;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v6, 0x1

    .line 8
    const/4 v7, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    move-wide v2, p1

    .line 12
    invoke-static/range {v2 .. v7}, Li1/y;->e(JFFILjava/lang/Object;)J

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    return-wide p1

    .line 17
    :cond_0
    move-wide v0, p1

    .line 18
    const/4 v4, 0x2

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-static/range {v0 .. v5}, Li1/y;->e(JFFILjava/lang/Object;)J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    return-wide p1
.end method

.method private final z(J)F
    .locals 2

    .line 1
    iget-object v0, p0, Lz/z;->d:Lz/q;

    .line 2
    .line 3
    sget-object v1, Lz/q;->b:Lz/q;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p1, p2}, Li1/y;->h(J)F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    invoke-static {p1, p2}, Li1/y;->i(J)F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
.end method


# virtual methods
.method public final A(J)F
    .locals 2

    .line 1
    iget-object v0, p0, Lz/z;->d:Lz/q;

    .line 2
    .line 3
    sget-object v1, Lz/q;->b:Lz/q;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p1, p2}, Lr0/f;->m(J)F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    invoke-static {p1, p2}, Lr0/f;->n(J)F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
.end method

.method public final B(F)J
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p1, v0

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    sget-object p1, Lr0/f;->b:Lr0/f$a;

    .line 7
    .line 8
    invoke-virtual {p1}, Lr0/f$a;->c()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0

    .line 13
    :cond_0
    iget-object v1, p0, Lz/z;->d:Lz/q;

    .line 14
    .line 15
    sget-object v2, Lz/q;->b:Lz/q;

    .line 16
    .line 17
    if-ne v1, v2, :cond_1

    .line 18
    .line 19
    invoke-static {p1, v0}, Lr0/g;->a(FF)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    return-wide v0

    .line 24
    :cond_1
    invoke-static {v0, p1}, Lr0/g;->a(FF)J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    return-wide v0
.end method

.method public final C(Lz/x;Lz/q;Lx/T;ZLz/n;LD0/b;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lz/z;->a:Lz/x;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iput-object p1, p0, Lz/z;->a:Lz/x;

    .line 11
    .line 12
    move p1, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    iput-object p3, p0, Lz/z;->b:Lx/T;

    .line 16
    .line 17
    iget-object p3, p0, Lz/z;->d:Lz/q;

    .line 18
    .line 19
    if-eq p3, p2, :cond_1

    .line 20
    .line 21
    iput-object p2, p0, Lz/z;->d:Lz/q;

    .line 22
    .line 23
    move p1, v1

    .line 24
    :cond_1
    iget-boolean p2, p0, Lz/z;->e:Z

    .line 25
    .line 26
    if-eq p2, p4, :cond_2

    .line 27
    .line 28
    iput-boolean p4, p0, Lz/z;->e:Z

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    move v1, p1

    .line 32
    :goto_1
    iput-object p5, p0, Lz/z;->c:Lz/n;

    .line 33
    .line 34
    iput-object p6, p0, Lz/z;->f:LD0/b;

    .line 35
    .line 36
    return v1
.end method

.method public final n(JLZd/e;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, Lz/z$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lz/z$a;

    .line 7
    .line 8
    iget v1, v0, Lz/z$a;->d:I

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
    iput v1, v0, Lz/z$a;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lz/z$a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lz/z$a;-><init>(Lz/z;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lz/z$a;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lz/z$a;->d:I

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
    iget-object p1, v0, Lz/z$a;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Lkotlin/jvm/internal/M;

    .line 41
    .line 42
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    move-object v5, p0

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_2
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    new-instance v6, Lkotlin/jvm/internal/M;

    .line 59
    .line 60
    invoke-direct {v6}, Lkotlin/jvm/internal/M;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-wide p1, v6, Lkotlin/jvm/internal/M;->a:J

    .line 64
    .line 65
    sget-object p3, Lx/L;->a:Lx/L;

    .line 66
    .line 67
    new-instance v4, Lz/z$b;

    .line 68
    .line 69
    const/4 v9, 0x0

    .line 70
    move-object v5, p0

    .line 71
    move-wide v7, p1

    .line 72
    invoke-direct/range {v4 .. v9}, Lz/z$b;-><init>(Lz/z;Lkotlin/jvm/internal/M;JLZd/e;)V

    .line 73
    .line 74
    .line 75
    iput-object v6, v0, Lz/z$a;->a:Ljava/lang/Object;

    .line 76
    .line 77
    iput v3, v0, Lz/z$a;->d:I

    .line 78
    .line 79
    invoke-virtual {p0, p3, v4, v0}, Lz/z;->v(Lx/L;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    if-ne p1, v1, :cond_3

    .line 84
    .line 85
    return-object v1

    .line 86
    :cond_3
    move-object p1, v6

    .line 87
    :goto_1
    iget-wide p1, p1, Lkotlin/jvm/internal/M;->a:J

    .line 88
    .line 89
    invoke-static {p1, p2}, Li1/y;->b(J)Li1/y;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    return-object p1
.end method

.method public final p()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lz/z;->d:Lz/q;

    .line 2
    .line 3
    sget-object v1, Lz/q;->a:Lz/q;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public final q(JLZd/e;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-direct {p0, p1, p2}, Lz/z;->y(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    new-instance v0, Lz/z$d;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, Lz/z$d;-><init>(Lz/z;LZd/e;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lz/z;->b:Lx/T;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-direct {p0}, Lz/z;->o()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-interface {v1, p1, p2, v0, p3}, Lx/T;->d(JLkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    if-ne p1, p2, :cond_0

    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_1
    invoke-static {p1, p2}, Li1/y;->b(J)Li1/y;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-interface {v0, p1, p3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    if-ne p1, p2, :cond_2

    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_2
    sget-object p1, LTd/L;->a:LTd/L;

    .line 51
    .line 52
    return-object p1
.end method

.method public final r(J)J
    .locals 1

    .line 1
    iget-object v0, p0, Lz/z;->a:Lz/x;

    .line 2
    .line 3
    invoke-interface {v0}, Lz/x;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p1, Lr0/f;->b:Lr0/f$a;

    .line 10
    .line 11
    invoke-virtual {p1}, Lr0/f$a;->c()J

    .line 12
    .line 13
    .line 14
    move-result-wide p1

    .line 15
    return-wide p1

    .line 16
    :cond_0
    iget-object v0, p0, Lz/z;->a:Lz/x;

    .line 17
    .line 18
    invoke-virtual {p0, p1, p2}, Lz/z;->A(J)F

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-virtual {p0, p1}, Lz/z;->t(F)F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-interface {v0, p1}, Lz/x;->f(F)F

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-virtual {p0, p1}, Lz/z;->t(F)F

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-virtual {p0, p1}, Lz/z;->B(F)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    return-wide p1
.end method

.method public final t(F)F
    .locals 1

    .line 1
    iget-boolean v0, p0, Lz/z;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    int-to-float v0, v0

    .line 7
    mul-float/2addr p1, v0

    .line 8
    :cond_0
    return p1
.end method

.method public final u(J)J
    .locals 1

    .line 1
    iget-boolean v0, p0, Lz/z;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/high16 v0, -0x40800000    # -1.0f

    .line 6
    .line 7
    invoke-static {p1, p2, v0}, Lr0/f;->r(JF)J

    .line 8
    .line 9
    .line 10
    move-result-wide p1

    .line 11
    :cond_0
    return-wide p1
.end method

.method public final v(Lx/L;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lz/z;->a:Lz/x;

    .line 2
    .line 3
    new-instance v1, Lz/z$f;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, p2, v2}, Lz/z$f;-><init>(Lz/z;Lkotlin/jvm/functions/Function2;LZd/e;)V

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, p1, v1, p3}, Lz/x;->b(Lx/L;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    if-ne p1, p2, :cond_0

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 21
    .line 22
    return-object p1
.end method

.method public final w()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lz/z;->a:Lz/x;

    .line 2
    .line 3
    invoke-interface {v0}, Lz/x;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Lz/z;->b:Lx/T;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Lx/T;->a()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v0, v1

    .line 20
    :goto_0
    if-eqz v0, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    return v1

    .line 24
    :cond_2
    :goto_1
    const/4 v0, 0x1

    .line 25
    return v0
.end method

.method public final x(J)J
    .locals 8

    .line 1
    iget-object v0, p0, Lz/z;->d:Lz/q;

    .line 2
    .line 3
    sget-object v1, Lz/q;->b:Lz/q;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v6, 0x1

    .line 8
    const/4 v7, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    move-wide v2, p1

    .line 12
    invoke-static/range {v2 .. v7}, Lr0/f;->g(JFFILjava/lang/Object;)J

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    return-wide p1

    .line 17
    :cond_0
    move-wide v0, p1

    .line 18
    const/4 v4, 0x2

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-static/range {v0 .. v5}, Lr0/f;->g(JFFILjava/lang/Object;)J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    return-wide p1
.end method
