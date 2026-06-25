.class final LE0/Y$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LE0/b;
.implements Li1/d;
.implements LZd/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE0/Y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final synthetic a:LE0/Y;

.field private final b:LZd/e;

.field private c:LGf/n;

.field private d:LE0/s;

.field private final e:LZd/i;

.field final synthetic f:LE0/Y;


# direct methods
.method public constructor <init>(LE0/Y;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE0/Y$b;->f:LE0/Y;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LE0/Y$b;->a:LE0/Y;

    .line 7
    .line 8
    iput-object p2, p0, LE0/Y$b;->b:LZd/e;

    .line 9
    .line 10
    sget-object p1, LE0/s;->b:LE0/s;

    .line 11
    .line 12
    iput-object p1, p0, LE0/Y$b;->d:LE0/s;

    .line 13
    .line 14
    sget-object p1, LZd/j;->a:LZd/j;

    .line 15
    .line 16
    iput-object p1, p0, LE0/Y$b;->e:LZd/i;

    .line 17
    .line 18
    return-void
.end method

.method public static final synthetic S(LE0/Y$b;LGf/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE0/Y$b;->c:LGf/n;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic q(LE0/Y$b;)LGf/n;
    .locals 0

    .line 1
    iget-object p0, p0, LE0/Y$b;->c:LGf/n;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic z(LE0/Y$b;LE0/s;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE0/Y$b;->d:LE0/s;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public A(I)F
    .locals 1

    .line 1
    iget-object v0, p0, LE0/Y$b;->a:LE0/Y;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Li1/d;->A(I)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public F0()LE0/q;
    .locals 1

    .line 1
    iget-object v0, p0, LE0/Y$b;->f:LE0/Y;

    .line 2
    .line 3
    invoke-static {v0}, LE0/Y;->F1(LE0/Y;)LE0/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public K(JLkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p4, LE0/Y$b$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, LE0/Y$b$a;

    .line 7
    .line 8
    iget v1, v0, LE0/Y$b$a;->d:I

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
    iput v1, v0, LE0/Y$b$a;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LE0/Y$b$a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, LE0/Y$b$a;-><init>(LE0/Y$b;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, LE0/Y$b$a;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LE0/Y$b$a;->d:I

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
    iget-object p1, v0, LE0/Y$b$a;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, LGf/C0;

    .line 41
    .line 42
    :try_start_0
    invoke-static {p4}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    move-object p2, v0

    .line 48
    goto :goto_2

    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_2
    invoke-static {p4}, LTd/v;->b(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    const-wide/16 v4, 0x0

    .line 61
    .line 62
    cmp-long p4, p1, v4

    .line 63
    .line 64
    if-gtz p4, :cond_3

    .line 65
    .line 66
    iget-object p4, p0, LE0/Y$b;->c:LGf/n;

    .line 67
    .line 68
    if-eqz p4, :cond_3

    .line 69
    .line 70
    sget-object v2, LTd/u;->b:LTd/u$a;

    .line 71
    .line 72
    new-instance v2, LE0/t;

    .line 73
    .line 74
    invoke-direct {v2, p1, p2}, LE0/t;-><init>(J)V

    .line 75
    .line 76
    .line 77
    invoke-static {v2}, LTd/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-static {v2}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-interface {p4, v2}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :cond_3
    iget-object p4, p0, LE0/Y$b;->f:LE0/Y;

    .line 89
    .line 90
    invoke-virtual {p4}, Landroidx/compose/ui/e$c;->getCoroutineScope()LGf/O;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    new-instance v7, LE0/Y$b$b;

    .line 95
    .line 96
    const/4 p4, 0x0

    .line 97
    invoke-direct {v7, p1, p2, p0, p4}, LE0/Y$b$b;-><init>(JLE0/Y$b;LZd/e;)V

    .line 98
    .line 99
    .line 100
    const/4 v8, 0x3

    .line 101
    const/4 v9, 0x0

    .line 102
    const/4 v5, 0x0

    .line 103
    const/4 v6, 0x0

    .line 104
    invoke-static/range {v4 .. v9}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    :try_start_1
    iput-object p1, v0, LE0/Y$b$a;->a:Ljava/lang/Object;

    .line 109
    .line 110
    iput v3, v0, LE0/Y$b$a;->d:I

    .line 111
    .line 112
    invoke-interface {p3, p0, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 116
    if-ne p4, v1, :cond_4

    .line 117
    .line 118
    return-object v1

    .line 119
    :cond_4
    :goto_1
    sget-object p2, LE0/c;->a:LE0/c;

    .line 120
    .line 121
    invoke-interface {p1, p2}, LGf/C0;->k(Ljava/util/concurrent/CancellationException;)V

    .line 122
    .line 123
    .line 124
    return-object p4

    .line 125
    :goto_2
    sget-object p3, LE0/c;->a:LE0/c;

    .line 126
    .line 127
    invoke-interface {p1, p3}, LGf/C0;->k(Ljava/util/concurrent/CancellationException;)V

    .line 128
    .line 129
    .line 130
    throw p2
.end method

.method public O(F)J
    .locals 2

    .line 1
    iget-object v0, p0, LE0/Y$b;->a:LE0/Y;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Li1/l;->O(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public Q(J)J
    .locals 1

    .line 1
    iget-object v0, p0, LE0/Y$b;->a:LE0/Y;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Li1/d;->Q(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method

.method public T(J)F
    .locals 1

    .line 1
    iget-object v0, p0, LE0/Y$b;->a:LE0/Y;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Li1/l;->T(J)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final W(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE0/Y$b;->c:LGf/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, LGf/n;->L(Ljava/lang/Throwable;)Z

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, LE0/Y$b;->c:LGf/n;

    .line 10
    .line 11
    return-void
.end method

.method public final Y(LE0/q;LE0/s;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE0/Y$b;->d:LE0/s;

    .line 2
    .line 3
    if-ne p2, v0, :cond_0

    .line 4
    .line 5
    iget-object p2, p0, LE0/Y$b;->c:LGf/n;

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, LE0/Y$b;->c:LGf/n;

    .line 11
    .line 12
    invoke-static {p1}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {p2, p1}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public a()J
    .locals 2

    .line 1
    iget-object v0, p0, LE0/Y$b;->f:LE0/Y;

    .line 2
    .line 3
    invoke-static {v0}, LE0/Y;->E1(LE0/Y;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public d0(F)J
    .locals 2

    .line 1
    iget-object v0, p0, LE0/Y$b;->a:LE0/Y;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Li1/d;->d0(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public d1(JLkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p4, LE0/Y$b$c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, LE0/Y$b$c;

    .line 7
    .line 8
    iget v1, v0, LE0/Y$b$c;->c:I

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
    iput v1, v0, LE0/Y$b$c;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LE0/Y$b$c;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, LE0/Y$b$c;-><init>(LE0/Y$b;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, LE0/Y$b$c;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LE0/Y$b$c;->c:I

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
    :try_start_0
    invoke-static {p4}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch LE0/t; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    return-object p4

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p4}, LTd/v;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :try_start_1
    iput v3, v0, LE0/Y$b$c;->c:I

    .line 54
    .line 55
    invoke-virtual {p0, p1, p2, p3, v0}, LE0/Y$b;->K(JLkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1
    :try_end_1
    .catch LE0/t; {:try_start_1 .. :try_end_1} :catch_0

    .line 59
    if-ne p1, v1, :cond_3

    .line 60
    .line 61
    return-object v1

    .line 62
    :cond_3
    return-object p1

    .line 63
    :catch_0
    const/4 p1, 0x0

    .line 64
    return-object p1
.end method

.method public e1(F)F
    .locals 1

    .line 1
    iget-object v0, p0, LE0/Y$b;->a:LE0/Y;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Li1/d;->e1(F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public getContext()LZd/i;
    .locals 1

    .line 1
    iget-object v0, p0, LE0/Y$b;->e:LZd/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDensity()F
    .locals 1

    .line 1
    iget-object v0, p0, LE0/Y$b;->a:LE0/Y;

    .line 2
    .line 3
    invoke-virtual {v0}, LE0/Y;->getDensity()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getViewConfiguration()Landroidx/compose/ui/platform/A1;
    .locals 1

    .line 1
    iget-object v0, p0, LE0/Y$b;->f:LE0/Y;

    .line 2
    .line 3
    invoke-virtual {v0}, LE0/Y;->getViewConfiguration()Landroidx/compose/ui/platform/A1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public j1()F
    .locals 1

    .line 1
    iget-object v0, p0, LE0/Y$b;->a:LE0/Y;

    .line 2
    .line 3
    invoke-virtual {v0}, LE0/Y;->j1()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public l1(F)F
    .locals 1

    .line 1
    iget-object v0, p0, LE0/Y$b;->a:LE0/Y;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Li1/d;->l1(F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public n0()J
    .locals 2

    .line 1
    iget-object v0, p0, LE0/Y$b;->f:LE0/Y;

    .line 2
    .line 3
    invoke-virtual {v0}, LE0/Y;->n0()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public p0(LE0/s;LZd/e;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, LGf/p;

    .line 2
    .line 3
    invoke-static {p2}, Lae/b;->c(LZd/e;)LZd/e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v0, v1, v2}, LGf/p;-><init>(LZd/e;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LGf/p;->C()V

    .line 12
    .line 13
    .line 14
    invoke-static {p0, p1}, LE0/Y$b;->z(LE0/Y$b;LE0/s;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0, v0}, LE0/Y$b;->S(LE0/Y$b;LGf/n;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, LGf/p;->v()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-ne p1, v0, :cond_0

    .line 29
    .line 30
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-object p1
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE0/Y$b;->f:LE0/Y;

    .line 2
    .line 3
    invoke-static {v0}, LE0/Y;->H1(LE0/Y;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LE0/Y$b;->f:LE0/Y;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    invoke-static {v1}, LE0/Y;->G1(LE0/Y;)La0/c;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1, p0}, La0/c;->w(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    sget-object v1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    monitor-exit v0

    .line 20
    iget-object v0, p0, LE0/Y$b;->b:LZd/e;

    .line 21
    .line 22
    invoke-interface {v0, p1}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    monitor-exit v0

    .line 28
    throw p1
.end method

.method public s0(F)I
    .locals 1

    .line 1
    iget-object v0, p0, LE0/Y$b;->a:LE0/Y;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Li1/d;->s0(F)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public w1(J)J
    .locals 1

    .line 1
    iget-object v0, p0, LE0/Y$b;->a:LE0/Y;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Li1/d;->w1(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method

.method public z0(J)F
    .locals 1

    .line 1
    iget-object v0, p0, LE0/Y$b;->a:LE0/Y;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Li1/d;->z0(J)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
