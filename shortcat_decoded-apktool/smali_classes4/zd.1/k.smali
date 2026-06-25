.class public final Lzd/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzd/k$b;
    }
.end annotation


# instance fields
.field private final a:Lxd/a;

.field private final b:Lzd/j$b;

.field private final c:LGf/O;

.field private final d:LIf/g;

.field private final e:LPf/a;

.field private final f:LGf/C0;


# direct methods
.method public constructor <init>(Lxd/a;Lzd/j$b;LGf/O;)V
    .locals 7

    .line 1
    const-string v0, "updatesLogger"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "stateMachineProcedureContext"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "scope"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lzd/k;->a:Lxd/a;

    .line 20
    .line 21
    iput-object p2, p0, Lzd/k;->b:Lzd/j$b;

    .line 22
    .line 23
    iput-object p3, p0, Lzd/k;->c:LGf/O;

    .line 24
    .line 25
    const/4 p1, 0x6

    .line 26
    const p2, 0x7fffffff

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-static {p2, v0, v0, p1, v0}, LIf/j;->b(ILIf/a;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LIf/g;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Lzd/k;->d:LIf/g;

    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    const/4 p2, 0x1

    .line 38
    invoke-static {p1, p2, v0}, LPf/g;->b(ZILjava/lang/Object;)LPf/a;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, Lzd/k;->e:LPf/a;

    .line 43
    .line 44
    new-instance v4, Lzd/k$a;

    .line 45
    .line 46
    invoke-direct {v4, p0, v0}, Lzd/k$a;-><init>(Lzd/k;LZd/e;)V

    .line 47
    .line 48
    .line 49
    const/4 v5, 0x3

    .line 50
    const/4 v6, 0x0

    .line 51
    const/4 v2, 0x0

    .line 52
    const/4 v3, 0x0

    .line 53
    move-object v1, p3

    .line 54
    invoke-static/range {v1 .. v6}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Lzd/k;->f:LGf/C0;

    .line 59
    .line 60
    return-void
.end method

.method public static final synthetic a(Lzd/k;Lzd/k$b;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lzd/k;->e(Lzd/k$b;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic b(Lzd/k;)LPf/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lzd/k;->e:LPf/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic c(Lzd/k;)LIf/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lzd/k;->d:LIf/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(Lzd/k;)Lzd/j$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lzd/k;->b:Lzd/j$b;

    .line 2
    .line 3
    return-object p0
.end method

.method private final e(Lzd/k$b;LZd/e;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lzd/k$c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lzd/k$c;

    .line 7
    .line 8
    iget v1, v0, Lzd/k$c;->d:I

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
    iput v1, v0, Lzd/k$c;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lzd/k$c;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lzd/k$c;-><init>(Lzd/k;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lzd/k$c;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lzd/k$c;->d:I

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
    invoke-static {p2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    iget-object p1, v0, Lzd/k$c;->a:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Lzd/k$b;

    .line 56
    .line 57
    invoke-static {p2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    invoke-static {p2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object p2, p0, Lzd/k;->a:Lxd/a;

    .line 65
    .line 66
    invoke-virtual {p1}, Lzd/k$b;->b()Lzd/j;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v2}, Lzd/j;->a()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-interface {p2, v2}, Lxd/a;->a(Ljava/lang/String;)Lub/e;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-virtual {p1}, Lzd/k$b;->b()Lzd/j;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    new-instance v5, Lzd/k$d;

    .line 83
    .line 84
    invoke-direct {v5, p2, p1, p0}, Lzd/k$d;-><init>(Lub/e;Lzd/k$b;Lzd/k;)V

    .line 85
    .line 86
    .line 87
    iput-object p1, v0, Lzd/k$c;->a:Ljava/lang/Object;

    .line 88
    .line 89
    iput v4, v0, Lzd/k$c;->d:I

    .line 90
    .line 91
    invoke-virtual {v2, v5, v0}, Lzd/j;->b(Lzd/j$a;LZd/e;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    if-ne p2, v1, :cond_4

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_4
    :goto_1
    invoke-virtual {p1}, Lzd/k$b;->a()LGf/x;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    const/4 p2, 0x0

    .line 103
    iput-object p2, v0, Lzd/k$c;->a:Ljava/lang/Object;

    .line 104
    .line 105
    iput v3, v0, Lzd/k$c;->d:I

    .line 106
    .line 107
    invoke-interface {p1, v0}, LGf/W;->M0(LZd/e;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    if-ne p1, v1, :cond_5

    .line 112
    .line 113
    :goto_2
    return-object v1

    .line 114
    :cond_5
    :goto_3
    sget-object p1, LTd/L;->a:LTd/L;

    .line 115
    .line 116
    return-object p1
.end method


# virtual methods
.method public final f(Lzd/j;)V
    .locals 7

    .line 1
    const-string v0, "stateMachineProcedure"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lzd/k;->c:LGf/O;

    .line 7
    .line 8
    new-instance v4, Lzd/k$e;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-direct {v4, p0, p1, v0}, Lzd/k$e;-><init>(Lzd/k;Lzd/j;LZd/e;)V

    .line 12
    .line 13
    .line 14
    const/4 v5, 0x3

    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-static/range {v1 .. v6}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 19
    .line 20
    .line 21
    return-void
.end method
