.class public final LD0/c;
.super Landroidx/compose/ui/e$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK0/I0;
.implements LD0/a;


# instance fields
.field private a:LD0/a;

.field private b:LD0/b;

.field private c:LD0/c;

.field private final d:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LD0/a;LD0/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LD0/c;->a:LD0/a;

    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    new-instance p2, LD0/b;

    .line 9
    .line 10
    invoke-direct {p2}, LD0/b;-><init>()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object p2, p0, LD0/c;->b:LD0/b;

    .line 14
    .line 15
    const-string p1, "androidx.compose.ui.input.nestedscroll.NestedScrollNode"

    .line 16
    .line 17
    iput-object p1, p0, LD0/c;->d:Ljava/lang/Object;

    .line 18
    .line 19
    return-void
.end method

.method public static final synthetic E1(LD0/c;)LGf/O;
    .locals 0

    .line 1
    invoke-direct {p0}, LD0/c;->F1()LGf/O;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final F1()LGf/O;
    .locals 4

    .line 1
    sget-boolean v0, Ll0/h;->m:Z

    .line 2
    .line 3
    const-string v1, "in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first."

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    invoke-virtual {p0}, LD0/c;->H1()LD0/c;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-direct {v0}, LD0/c;->F1()LGf/O;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-static {v0}, LGf/P;->g(LGf/O;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x1

    .line 26
    if-ne v2, v3, :cond_1

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_1
    iget-object v0, p0, LD0/c;->b:LD0/b;

    .line 30
    .line 31
    invoke-virtual {v0}, LD0/b;->h()LGf/O;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v0

    .line 44
    :cond_3
    invoke-virtual {p0}, LD0/c;->H1()LD0/c;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v0, :cond_5

    .line 49
    .line 50
    invoke-direct {v0}, LD0/c;->F1()LGf/O;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-nez v0, :cond_4

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_4
    return-object v0

    .line 58
    :cond_5
    :goto_1
    iget-object v0, p0, LD0/c;->b:LD0/b;

    .line 59
    .line 60
    invoke-virtual {v0}, LD0/b;->h()LGf/O;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-eqz v0, :cond_6

    .line 65
    .line 66
    return-object v0

    .line 67
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 68
    .line 69
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v0
.end method

.method private final G1()LD0/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, LD0/c;->H1()LD0/c;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method private final I1()V
    .locals 2

    .line 1
    iget-object v0, p0, LD0/c;->b:LD0/b;

    .line 2
    .line 3
    invoke-virtual {v0}, LD0/b;->f()LD0/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-ne v0, p0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LD0/c;->b:LD0/b;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, LD0/b;->k(LD0/c;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method private final J1(LD0/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LD0/c;->I1()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    new-instance p1, LD0/b;

    .line 7
    .line 8
    invoke-direct {p1}, LD0/b;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, LD0/c;->b:LD0/b;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, LD0/c;->b:LD0/b;

    .line 15
    .line 16
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    iput-object p1, p0, LD0/c;->b:LD0/b;

    .line 23
    .line 24
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    invoke-direct {p0}, LD0/c;->K1()V

    .line 31
    .line 32
    .line 33
    :cond_2
    return-void
.end method

.method private final K1()V
    .locals 2

    .line 1
    iget-object v0, p0, LD0/c;->b:LD0/b;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, LD0/b;->k(LD0/c;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LD0/c;->b:LD0/b;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, LD0/b;->j(LD0/c;)V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, LD0/c;->c:LD0/c;

    .line 13
    .line 14
    iget-object v0, p0, LD0/c;->b:LD0/b;

    .line 15
    .line 16
    new-instance v1, LD0/c$c;

    .line 17
    .line 18
    invoke-direct {v1, p0}, LD0/c$c;-><init>(LD0/c;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, LD0/b;->i(Lie/a;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, LD0/c;->b:LD0/b;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getCoroutineScope()LGf/O;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, LD0/b;->l(LGf/O;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public B()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LD0/c;->d:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final H1()LD0/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, LK0/J0;->b(LK0/I0;)LK0/I0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, LD0/c;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return-object v0
.end method

.method public L0(JJLZd/e;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p5, LD0/c$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, LD0/c$a;

    .line 7
    .line 8
    iget v1, v0, LD0/c$a;->e:I

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
    iput v1, v0, LD0/c$a;->e:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, LD0/c$a;

    .line 22
    .line 23
    invoke-direct {v0, p0, p5}, LD0/c$a;-><init>(LD0/c;LZd/e;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p5, v6, LD0/c$a;->c:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, v6, LD0/c$a;->e:I

    .line 34
    .line 35
    const/4 v7, 0x2

    .line 36
    const/4 v2, 0x1

    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    if-eq v1, v2, :cond_2

    .line 40
    .line 41
    if-ne v1, v7, :cond_1

    .line 42
    .line 43
    iget-wide p1, v6, LD0/c$a;->a:J

    .line 44
    .line 45
    invoke-static {p5}, LTd/v;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_6

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
    iget-wide p3, v6, LD0/c$a;->b:J

    .line 58
    .line 59
    iget-wide p1, v6, LD0/c$a;->a:J

    .line 60
    .line 61
    invoke-static {p5}, LTd/v;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    invoke-static {p5}, LTd/v;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, LD0/c;->a:LD0/a;

    .line 69
    .line 70
    iput-wide p1, v6, LD0/c$a;->a:J

    .line 71
    .line 72
    iput-wide p3, v6, LD0/c$a;->b:J

    .line 73
    .line 74
    iput v2, v6, LD0/c$a;->e:I

    .line 75
    .line 76
    move-wide v2, p1

    .line 77
    move-wide v4, p3

    .line 78
    invoke-interface/range {v1 .. v6}, LD0/a;->L0(JJLZd/e;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p5

    .line 82
    if-ne p5, v0, :cond_4

    .line 83
    .line 84
    goto :goto_5

    .line 85
    :cond_4
    move-wide p1, v2

    .line 86
    move-wide p3, v4

    .line 87
    :goto_2
    check-cast p5, Li1/y;

    .line 88
    .line 89
    invoke-virtual {p5}, Li1/y;->o()J

    .line 90
    .line 91
    .line 92
    move-result-wide v8

    .line 93
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 94
    .line 95
    .line 96
    move-result p5

    .line 97
    if-eqz p5, :cond_5

    .line 98
    .line 99
    invoke-direct {p0}, LD0/c;->G1()LD0/a;

    .line 100
    .line 101
    .line 102
    move-result-object p5

    .line 103
    :goto_3
    move-object v1, p5

    .line 104
    goto :goto_4

    .line 105
    :cond_5
    iget-object p5, p0, LD0/c;->c:LD0/c;

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :goto_4
    if-eqz v1, :cond_7

    .line 109
    .line 110
    invoke-static {p1, p2, v8, v9}, Li1/y;->l(JJ)J

    .line 111
    .line 112
    .line 113
    move-result-wide v2

    .line 114
    invoke-static {p3, p4, v8, v9}, Li1/y;->k(JJ)J

    .line 115
    .line 116
    .line 117
    move-result-wide v4

    .line 118
    iput-wide v8, v6, LD0/c$a;->a:J

    .line 119
    .line 120
    iput v7, v6, LD0/c$a;->e:I

    .line 121
    .line 122
    invoke-interface/range {v1 .. v6}, LD0/a;->L0(JJLZd/e;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p5

    .line 126
    if-ne p5, v0, :cond_6

    .line 127
    .line 128
    :goto_5
    return-object v0

    .line 129
    :cond_6
    move-wide p1, v8

    .line 130
    :goto_6
    check-cast p5, Li1/y;

    .line 131
    .line 132
    invoke-virtual {p5}, Li1/y;->o()J

    .line 133
    .line 134
    .line 135
    move-result-wide p3

    .line 136
    move-wide v8, p1

    .line 137
    goto :goto_7

    .line 138
    :cond_7
    sget-object p1, Li1/y;->b:Li1/y$a;

    .line 139
    .line 140
    invoke-virtual {p1}, Li1/y$a;->a()J

    .line 141
    .line 142
    .line 143
    move-result-wide p3

    .line 144
    :goto_7
    invoke-static {v8, v9, p3, p4}, Li1/y;->l(JJ)J

    .line 145
    .line 146
    .line 147
    move-result-wide p1

    .line 148
    invoke-static {p1, p2}, Li1/y;->b(J)Li1/y;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    return-object p1
.end method

.method public final L1(LD0/a;LD0/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LD0/c;->a:LD0/a;

    .line 2
    .line 3
    invoke-direct {p0, p2}, LD0/c;->J1(LD0/b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public R0(JLZd/e;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p3, LD0/c$b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, LD0/c$b;

    .line 7
    .line 8
    iget v1, v0, LD0/c$b;->d:I

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
    iput v1, v0, LD0/c$b;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LD0/c$b;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, LD0/c$b;-><init>(LD0/c;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, LD0/c$b;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LD0/c$b;->d:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    iget-wide p1, v0, LD0/c$b;->a:J

    .line 42
    .line 43
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_5

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
    iget-wide p1, v0, LD0/c$b;->a:J

    .line 56
    .line 57
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-direct {p0}, LD0/c;->G1()LD0/a;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    if-eqz p3, :cond_5

    .line 69
    .line 70
    iput-wide p1, v0, LD0/c$b;->a:J

    .line 71
    .line 72
    iput v4, v0, LD0/c$b;->d:I

    .line 73
    .line 74
    invoke-interface {p3, p1, p2, v0}, LD0/a;->R0(JLZd/e;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p3

    .line 78
    if-ne p3, v1, :cond_4

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_4
    :goto_1
    check-cast p3, Li1/y;

    .line 82
    .line 83
    invoke-virtual {p3}, Li1/y;->o()J

    .line 84
    .line 85
    .line 86
    move-result-wide v4

    .line 87
    :goto_2
    move-wide v6, v4

    .line 88
    move-wide v4, p1

    .line 89
    move-wide p1, v6

    .line 90
    goto :goto_3

    .line 91
    :cond_5
    sget-object p3, Li1/y;->b:Li1/y$a;

    .line 92
    .line 93
    invoke-virtual {p3}, Li1/y$a;->a()J

    .line 94
    .line 95
    .line 96
    move-result-wide v4

    .line 97
    goto :goto_2

    .line 98
    :goto_3
    iget-object p3, p0, LD0/c;->a:LD0/a;

    .line 99
    .line 100
    invoke-static {v4, v5, p1, p2}, Li1/y;->k(JJ)J

    .line 101
    .line 102
    .line 103
    move-result-wide v4

    .line 104
    iput-wide p1, v0, LD0/c$b;->a:J

    .line 105
    .line 106
    iput v3, v0, LD0/c$b;->d:I

    .line 107
    .line 108
    invoke-interface {p3, v4, v5, v0}, LD0/a;->R0(JLZd/e;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p3

    .line 112
    if-ne p3, v1, :cond_6

    .line 113
    .line 114
    :goto_4
    return-object v1

    .line 115
    :cond_6
    :goto_5
    check-cast p3, Li1/y;

    .line 116
    .line 117
    invoke-virtual {p3}, Li1/y;->o()J

    .line 118
    .line 119
    .line 120
    move-result-wide v0

    .line 121
    invoke-static {p1, p2, v0, v1}, Li1/y;->l(JJ)J

    .line 122
    .line 123
    .line 124
    move-result-wide p1

    .line 125
    invoke-static {p1, p2}, Li1/y;->b(J)Li1/y;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    return-object p1
.end method

.method public i1(JI)J
    .locals 3

    .line 1
    invoke-direct {p0}, LD0/c;->G1()LD0/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1, p2, p3}, LD0/a;->i1(JI)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v0, Lr0/f;->b:Lr0/f$a;

    .line 13
    .line 14
    invoke-virtual {v0}, Lr0/f$a;->c()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    :goto_0
    iget-object v2, p0, LD0/c;->a:LD0/a;

    .line 19
    .line 20
    invoke-static {p1, p2, v0, v1}, Lr0/f;->p(JJ)J

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    invoke-interface {v2, p1, p2, p3}, LD0/a;->i1(JI)J

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    invoke-static {v0, v1, p1, p2}, Lr0/f;->q(JJ)J

    .line 29
    .line 30
    .line 31
    move-result-wide p1

    .line 32
    return-wide p1
.end method

.method public onAttach()V
    .locals 0

    .line 1
    invoke-direct {p0}, LD0/c;->K1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onDetach()V
    .locals 2

    .line 1
    invoke-static {p0}, LD0/d;->a(LK0/I0;)LK0/I0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LD0/c;

    .line 6
    .line 7
    iput-object v0, p0, LD0/c;->c:LD0/c;

    .line 8
    .line 9
    iget-object v1, p0, LD0/c;->b:LD0/b;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, LD0/b;->j(LD0/c;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, LD0/c;->I1()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public y0(JJI)J
    .locals 6

    .line 1
    iget-object v0, p0, LD0/c;->a:LD0/a;

    .line 2
    .line 3
    move-wide v1, p1

    .line 4
    move-wide v3, p3

    .line 5
    move v5, p5

    .line 6
    invoke-interface/range {v0 .. v5}, LD0/a;->y0(JJI)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    invoke-direct {p0}, LD0/c;->G1()LD0/a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-static {v1, v2, p1, p2}, Lr0/f;->q(JJ)J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    invoke-static {v3, v4, p1, p2}, Lr0/f;->p(JJ)J

    .line 21
    .line 22
    .line 23
    move-result-wide v3

    .line 24
    invoke-interface/range {v0 .. v5}, LD0/a;->y0(JJI)J

    .line 25
    .line 26
    .line 27
    move-result-wide p3

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    sget-object p3, Lr0/f;->b:Lr0/f$a;

    .line 30
    .line 31
    invoke-virtual {p3}, Lr0/f$a;->c()J

    .line 32
    .line 33
    .line 34
    move-result-wide p3

    .line 35
    :goto_0
    invoke-static {p1, p2, p3, p4}, Lr0/f;->q(JJ)J

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    return-wide p1
.end method
