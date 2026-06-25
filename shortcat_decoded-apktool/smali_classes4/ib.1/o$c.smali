.class final Lib/o$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lib/o;->D(LGf/Q;Lkotlin/jvm/functions/Function2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:I

.field private synthetic d:Ljava/lang/Object;

.field final synthetic e:Lib/o;

.field final synthetic f:Lkotlin/jvm/functions/Function2;


# direct methods
.method constructor <init>(Lib/o;Lkotlin/jvm/functions/Function2;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lib/o$c;->e:Lib/o;

    .line 2
    .line 3
    iput-object p2, p0, Lib/o$c;->f:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 3

    .line 1
    new-instance v0, Lib/o$c;

    .line 2
    .line 3
    iget-object v1, p0, Lib/o$c;->e:Lib/o;

    .line 4
    .line 5
    iget-object v2, p0, Lib/o$c;->f:Lkotlin/jvm/functions/Function2;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lib/o$c;-><init>(Lib/o;Lkotlin/jvm/functions/Function2;LZd/e;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lib/o$c;->d:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lib/o$c;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lib/o$c;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lib/o$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lib/o$c;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lib/o$c;->c:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v3, :cond_1

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lib/o$c;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, LPf/a;

    .line 19
    .line 20
    :try_start_0
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    goto :goto_2

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_3

    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :cond_1
    iget-object v1, p0, Lib/o$c;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 37
    .line 38
    iget-object v3, p0, Lib/o$c;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v3, LPf/a;

    .line 41
    .line 42
    iget-object v5, p0, Lib/o$c;->d:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v5, LGf/O;

    .line 45
    .line 46
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    move-object p1, v3

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lib/o$c;->d:Ljava/lang/Object;

    .line 55
    .line 56
    move-object v5, p1

    .line 57
    check-cast v5, LGf/O;

    .line 58
    .line 59
    iget-object p1, p0, Lib/o$c;->e:Lib/o;

    .line 60
    .line 61
    invoke-static {p1}, Lib/o;->p(Lib/o;)LPf/a;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iget-object v1, p0, Lib/o$c;->f:Lkotlin/jvm/functions/Function2;

    .line 66
    .line 67
    iput-object v5, p0, Lib/o$c;->d:Ljava/lang/Object;

    .line 68
    .line 69
    iput-object p1, p0, Lib/o$c;->a:Ljava/lang/Object;

    .line 70
    .line 71
    iput-object v1, p0, Lib/o$c;->b:Ljava/lang/Object;

    .line 72
    .line 73
    iput v3, p0, Lib/o$c;->c:I

    .line 74
    .line 75
    invoke-interface {p1, v4, p0}, LPf/a;->c(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    if-ne v3, v0, :cond_3

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    :goto_0
    :try_start_1
    iput-object p1, p0, Lib/o$c;->d:Ljava/lang/Object;

    .line 83
    .line 84
    iput-object v4, p0, Lib/o$c;->a:Ljava/lang/Object;

    .line 85
    .line 86
    iput-object v4, p0, Lib/o$c;->b:Ljava/lang/Object;

    .line 87
    .line 88
    iput v2, p0, Lib/o$c;->c:I

    .line 89
    .line 90
    invoke-interface {v1, v5, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 94
    if-ne v1, v0, :cond_4

    .line 95
    .line 96
    :goto_1
    return-object v0

    .line 97
    :cond_4
    move-object v0, p1

    .line 98
    :goto_2
    :try_start_2
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 99
    .line 100
    invoke-interface {v0, v4}, LPf/a;->e(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    sget-object p1, LTd/L;->a:LTd/L;

    .line 104
    .line 105
    return-object p1

    .line 106
    :catchall_1
    move-exception v0

    .line 107
    move-object v6, v0

    .line 108
    move-object v0, p1

    .line 109
    move-object p1, v6

    .line 110
    :goto_3
    invoke-interface {v0, v4}, LPf/a;->e(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    throw p1
.end method
