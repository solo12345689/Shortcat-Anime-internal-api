.class public abstract Landroidx/compose/foundation/gestures/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Lkotlin/jvm/functions/Function1;

.field private static final b:Lz/u;

.field private static final c:Ll0/k;

.field private static final d:Landroidx/compose/foundation/gestures/d$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/foundation/gestures/d$a;->a:Landroidx/compose/foundation/gestures/d$a;

    .line 2
    .line 3
    sput-object v0, Landroidx/compose/foundation/gestures/d;->a:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    new-instance v0, Landroidx/compose/foundation/gestures/d$c;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/compose/foundation/gestures/d$c;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Landroidx/compose/foundation/gestures/d;->b:Lz/u;

    .line 11
    .line 12
    new-instance v0, Landroidx/compose/foundation/gestures/d$b;

    .line 13
    .line 14
    invoke-direct {v0}, Landroidx/compose/foundation/gestures/d$b;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Landroidx/compose/foundation/gestures/d;->c:Ll0/k;

    .line 18
    .line 19
    new-instance v0, Landroidx/compose/foundation/gestures/d$d;

    .line 20
    .line 21
    invoke-direct {v0}, Landroidx/compose/foundation/gestures/d$d;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v0, Landroidx/compose/foundation/gestures/d;->d:Landroidx/compose/foundation/gestures/d$d;

    .line 25
    .line 26
    return-void
.end method

.method public static final synthetic a()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/foundation/gestures/d;->a:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic b()Lz/u;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/foundation/gestures/d;->b:Lz/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic c()Landroidx/compose/foundation/gestures/d$d;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/foundation/gestures/d;->d:Landroidx/compose/foundation/gestures/d$d;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic d(Lz/z;JLZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/gestures/d;->j(Lz/z;JLZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final e()Ll0/k;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/foundation/gestures/d;->c:Ll0/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final f(Landroidx/compose/ui/e;Lz/x;Lz/q;Lx/T;ZZLz/n;LB/m;Lz/d;)Landroidx/compose/ui/e;
    .locals 9

    .line 1
    new-instance v0, Landroidx/compose/foundation/gestures/ScrollableElement;

    .line 2
    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move v4, p4

    .line 7
    move v5, p5

    .line 8
    move-object v6, p6

    .line 9
    move-object/from16 v7, p7

    .line 10
    .line 11
    move-object/from16 v8, p8

    .line 12
    .line 13
    invoke-direct/range {v0 .. v8}, Landroidx/compose/foundation/gestures/ScrollableElement;-><init>(Lz/x;Lz/q;Lx/T;ZZLz/n;LB/m;Lz/d;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, v0}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static final g(Landroidx/compose/ui/e;Lz/x;Lz/q;ZZLz/n;LB/m;)Landroidx/compose/ui/e;
    .locals 11

    .line 1
    const/16 v9, 0x80

    .line 2
    .line 3
    const/4 v10, 0x0

    .line 4
    const/4 v3, 0x0

    .line 5
    const/4 v8, 0x0

    .line 6
    move-object v0, p0

    .line 7
    move-object v1, p1

    .line 8
    move-object v2, p2

    .line 9
    move v4, p3

    .line 10
    move v5, p4

    .line 11
    move-object/from16 v6, p5

    .line 12
    .line 13
    move-object/from16 v7, p6

    .line 14
    .line 15
    invoke-static/range {v0 .. v10}, Landroidx/compose/foundation/gestures/d;->h(Landroidx/compose/ui/e;Lz/x;Lz/q;Lx/T;ZZLz/n;LB/m;Lz/d;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public static synthetic h(Landroidx/compose/ui/e;Lz/x;Lz/q;Lx/T;ZZLz/n;LB/m;Lz/d;ILjava/lang/Object;)Landroidx/compose/ui/e;
    .locals 9

    .line 1
    move/from16 v0, p9

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x8

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const/4 p4, 0x1

    .line 8
    :cond_0
    move v4, p4

    .line 9
    and-int/lit8 p4, v0, 0x10

    .line 10
    .line 11
    if-eqz p4, :cond_1

    .line 12
    .line 13
    const/4 p4, 0x0

    .line 14
    move v5, p4

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    move v5, p5

    .line 17
    :goto_0
    and-int/lit8 p4, v0, 0x20

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    if-eqz p4, :cond_2

    .line 21
    .line 22
    move-object v6, v1

    .line 23
    goto :goto_1

    .line 24
    :cond_2
    move-object v6, p6

    .line 25
    :goto_1
    and-int/lit8 p4, v0, 0x40

    .line 26
    .line 27
    if-eqz p4, :cond_3

    .line 28
    .line 29
    move-object v7, v1

    .line 30
    goto :goto_2

    .line 31
    :cond_3
    move-object/from16 v7, p7

    .line 32
    .line 33
    :goto_2
    and-int/lit16 p4, v0, 0x80

    .line 34
    .line 35
    if-eqz p4, :cond_4

    .line 36
    .line 37
    move-object v8, v1

    .line 38
    move-object v0, p0

    .line 39
    move-object v2, p2

    .line 40
    move-object v3, p3

    .line 41
    move-object v1, p1

    .line 42
    goto :goto_3

    .line 43
    :cond_4
    move-object/from16 v8, p8

    .line 44
    .line 45
    move-object v0, p0

    .line 46
    move-object v1, p1

    .line 47
    move-object v2, p2

    .line 48
    move-object v3, p3

    .line 49
    :goto_3
    invoke-static/range {v0 .. v8}, Landroidx/compose/foundation/gestures/d;->f(Landroidx/compose/ui/e;Lz/x;Lz/q;Lx/T;ZZLz/n;LB/m;Lz/d;)Landroidx/compose/ui/e;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method

.method public static synthetic i(Landroidx/compose/ui/e;Lz/x;Lz/q;ZZLz/n;LB/m;ILjava/lang/Object;)Landroidx/compose/ui/e;
    .locals 7

    .line 1
    and-int/lit8 p8, p7, 0x4

    .line 2
    .line 3
    if-eqz p8, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x1

    .line 6
    :cond_0
    move v3, p3

    .line 7
    and-int/lit8 p3, p7, 0x8

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    const/4 p4, 0x0

    .line 12
    :cond_1
    move v4, p4

    .line 13
    and-int/lit8 p3, p7, 0x10

    .line 14
    .line 15
    const/4 p4, 0x0

    .line 16
    if-eqz p3, :cond_2

    .line 17
    .line 18
    move-object v5, p4

    .line 19
    goto :goto_0

    .line 20
    :cond_2
    move-object v5, p5

    .line 21
    :goto_0
    and-int/lit8 p3, p7, 0x20

    .line 22
    .line 23
    if-eqz p3, :cond_3

    .line 24
    .line 25
    move-object v6, p4

    .line 26
    :goto_1
    move-object v0, p0

    .line 27
    move-object v1, p1

    .line 28
    move-object v2, p2

    .line 29
    goto :goto_2

    .line 30
    :cond_3
    move-object v6, p6

    .line 31
    goto :goto_1

    .line 32
    :goto_2
    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/gestures/d;->g(Landroidx/compose/ui/e;Lz/x;Lz/q;ZZLz/n;LB/m;)Landroidx/compose/ui/e;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method private static final j(Lz/z;JLZd/e;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, Landroidx/compose/foundation/gestures/d$e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Landroidx/compose/foundation/gestures/d$e;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/foundation/gestures/d$e;->d:I

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
    iput v1, v0, Landroidx/compose/foundation/gestures/d$e;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/foundation/gestures/d$e;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Landroidx/compose/foundation/gestures/d$e;-><init>(LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Landroidx/compose/foundation/gestures/d$e;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/compose/foundation/gestures/d$e;->d:I

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
    iget-object p0, v0, Landroidx/compose/foundation/gestures/d$e;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Lkotlin/jvm/internal/K;

    .line 41
    .line 42
    iget-object p1, v0, Landroidx/compose/foundation/gestures/d$e;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Lz/z;

    .line 45
    .line 46
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    move-object v8, p0

    .line 50
    move-object p0, p1

    .line 51
    goto :goto_1

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
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    new-instance v8, Lkotlin/jvm/internal/K;

    .line 64
    .line 65
    invoke-direct {v8}, Lkotlin/jvm/internal/K;-><init>()V

    .line 66
    .line 67
    .line 68
    sget-object p3, Lx/L;->a:Lx/L;

    .line 69
    .line 70
    new-instance v4, Landroidx/compose/foundation/gestures/d$f;

    .line 71
    .line 72
    const/4 v9, 0x0

    .line 73
    move-object v5, p0

    .line 74
    move-wide v6, p1

    .line 75
    invoke-direct/range {v4 .. v9}, Landroidx/compose/foundation/gestures/d$f;-><init>(Lz/z;JLkotlin/jvm/internal/K;LZd/e;)V

    .line 76
    .line 77
    .line 78
    iput-object v5, v0, Landroidx/compose/foundation/gestures/d$e;->a:Ljava/lang/Object;

    .line 79
    .line 80
    iput-object v8, v0, Landroidx/compose/foundation/gestures/d$e;->b:Ljava/lang/Object;

    .line 81
    .line 82
    iput v3, v0, Landroidx/compose/foundation/gestures/d$e;->d:I

    .line 83
    .line 84
    invoke-virtual {v5, p3, v4, v0}, Lz/z;->v(Lx/L;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    if-ne p0, v1, :cond_3

    .line 89
    .line 90
    return-object v1

    .line 91
    :cond_3
    move-object p0, v5

    .line 92
    :goto_1
    iget p1, v8, Lkotlin/jvm/internal/K;->a:F

    .line 93
    .line 94
    invoke-virtual {p0, p1}, Lz/z;->B(F)J

    .line 95
    .line 96
    .line 97
    move-result-wide p0

    .line 98
    invoke-static {p0, p1}, Lr0/f;->d(J)Lr0/f;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0
.end method
