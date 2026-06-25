.class public final LY/P0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY/t0;


# instance fields
.field private final a:LY/t0;

.field private final b:LY/o0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LY/t0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY/P0;->a:LY/t0;

    .line 5
    .line 6
    new-instance p1, LY/o0;

    .line 7
    .line 8
    invoke-direct {p1}, LY/o0;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, LY/P0;->b:LY/o0;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public A1(Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, LY/P0$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LY/P0$a;

    .line 7
    .line 8
    iget v1, v0, LY/P0$a;->d:I

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
    iput v1, v0, LY/P0$a;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LY/P0$a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LY/P0$a;-><init>(LY/P0;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LY/P0$a;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LY/P0$a;->d:I

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
    return-object p2

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
    iget-object p1, v0, LY/P0$a;->a:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Lkotlin/jvm/functions/Function1;

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
    iget-object p2, p0, LY/P0;->b:LY/o0;

    .line 65
    .line 66
    iput-object p1, v0, LY/P0$a;->a:Ljava/lang/Object;

    .line 67
    .line 68
    iput v4, v0, LY/P0$a;->d:I

    .line 69
    .line 70
    invoke-virtual {p2, v0}, LY/o0;->c(LZd/e;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    if-ne p2, v1, :cond_4

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    :goto_1
    iget-object p2, p0, LY/P0;->a:LY/t0;

    .line 78
    .line 79
    const/4 v2, 0x0

    .line 80
    iput-object v2, v0, LY/P0$a;->a:Ljava/lang/Object;

    .line 81
    .line 82
    iput v3, v0, LY/P0$a;->d:I

    .line 83
    .line 84
    invoke-interface {p2, p1, v0}, LY/t0;->A1(Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-ne p1, v1, :cond_5

    .line 89
    .line 90
    :goto_2
    return-object v1

    .line 91
    :cond_5
    return-object p1
.end method

.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, LY/P0;->b:LY/o0;

    .line 2
    .line 3
    invoke-virtual {v0}, LY/o0;->d()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public a1(LZd/i$c;)LZd/i;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LY/t0$a;->c(LY/t0;LZd/i$c;)LZd/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-object v0, p0, LY/P0;->b:LY/o0;

    .line 2
    .line 3
    invoke-virtual {v0}, LY/o0;->f()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public l(LZd/i$c;)LZd/i$b;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LY/t0$a;->b(LY/t0;LZd/i$c;)LZd/i$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public w(LZd/i;)LZd/i;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LY/t0$a;->d(LY/t0;LZd/i;)LZd/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public y1(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LY/t0$a;->a(LY/t0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
