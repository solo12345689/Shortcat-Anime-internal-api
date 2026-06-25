.class final Lz/A$f$a$j;
.super Lkotlin/coroutines/jvm/internal/k;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/A$f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:LGf/O;

.field final synthetic d:Lkotlin/jvm/functions/Function1;

.field final synthetic e:Lkotlin/jvm/functions/Function1;

.field final synthetic f:Lkotlin/jvm/internal/N;

.field final synthetic g:Lz/s;


# direct methods
.method constructor <init>(LGf/O;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/N;Lz/s;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz/A$f$a$j;->c:LGf/O;

    .line 2
    .line 3
    iput-object p2, p0, Lz/A$f$a$j;->d:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    iput-object p3, p0, Lz/A$f$a$j;->e:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    iput-object p4, p0, Lz/A$f$a$j;->f:Lkotlin/jvm/internal/N;

    .line 8
    .line 9
    iput-object p5, p0, Lz/A$f$a$j;->g:Lz/s;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILZd/e;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 7

    .line 1
    new-instance v0, Lz/A$f$a$j;

    .line 2
    .line 3
    iget-object v1, p0, Lz/A$f$a$j;->c:LGf/O;

    .line 4
    .line 5
    iget-object v2, p0, Lz/A$f$a$j;->d:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    iget-object v3, p0, Lz/A$f$a$j;->e:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    iget-object v4, p0, Lz/A$f$a$j;->f:Lkotlin/jvm/internal/N;

    .line 10
    .line 11
    iget-object v5, p0, Lz/A$f$a$j;->g:Lz/s;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lz/A$f$a$j;-><init>(LGf/O;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/N;Lz/s;LZd/e;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, Lz/A$f$a$j;->b:Ljava/lang/Object;

    .line 18
    .line 19
    return-object v0
.end method

.method public final invoke(LE0/b;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lz/A$f$a$j;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lz/A$f$a$j;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lz/A$f$a$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LE0/b;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lz/A$f$a$j;->invoke(LE0/b;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lz/A$f$a$j;->a:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lz/A$f$a$j;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, LE0/b;

    .line 31
    .line 32
    iput v2, p0, Lz/A$f$a$j;->a:I

    .line 33
    .line 34
    invoke-static {p1, v3, p0, v2, v3}, Lz/A;->l(LE0/b;LE0/s;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    if-ne p1, v0, :cond_2

    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_2
    :goto_0
    check-cast p1, LE0/C;

    .line 42
    .line 43
    if-eqz p1, :cond_3

    .line 44
    .line 45
    invoke-virtual {p1}, LE0/C;->a()V

    .line 46
    .line 47
    .line 48
    iget-object v4, p0, Lz/A$f$a$j;->c:LGf/O;

    .line 49
    .line 50
    new-instance v7, Lz/A$f$a$j$a;

    .line 51
    .line 52
    iget-object v0, p0, Lz/A$f$a$j;->g:Lz/s;

    .line 53
    .line 54
    invoke-direct {v7, v0, v3}, Lz/A$f$a$j$a;-><init>(Lz/s;LZd/e;)V

    .line 55
    .line 56
    .line 57
    const/4 v8, 0x3

    .line 58
    const/4 v9, 0x0

    .line 59
    const/4 v5, 0x0

    .line 60
    const/4 v6, 0x0

    .line 61
    invoke-static/range {v4 .. v9}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lz/A$f$a$j;->d:Lkotlin/jvm/functions/Function1;

    .line 65
    .line 66
    invoke-virtual {p1}, LE0/C;->h()J

    .line 67
    .line 68
    .line 69
    move-result-wide v1

    .line 70
    invoke-static {v1, v2}, Lr0/f;->d(J)Lr0/f;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    sget-object p1, LTd/L;->a:LTd/L;

    .line 78
    .line 79
    return-object p1

    .line 80
    :cond_3
    iget-object v4, p0, Lz/A$f$a$j;->c:LGf/O;

    .line 81
    .line 82
    new-instance v7, Lz/A$f$a$j$b;

    .line 83
    .line 84
    iget-object p1, p0, Lz/A$f$a$j;->g:Lz/s;

    .line 85
    .line 86
    invoke-direct {v7, p1, v3}, Lz/A$f$a$j$b;-><init>(Lz/s;LZd/e;)V

    .line 87
    .line 88
    .line 89
    const/4 v8, 0x3

    .line 90
    const/4 v9, 0x0

    .line 91
    const/4 v5, 0x0

    .line 92
    const/4 v6, 0x0

    .line 93
    invoke-static/range {v4 .. v9}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 94
    .line 95
    .line 96
    iget-object p1, p0, Lz/A$f$a$j;->e:Lkotlin/jvm/functions/Function1;

    .line 97
    .line 98
    if-eqz p1, :cond_4

    .line 99
    .line 100
    iget-object v0, p0, Lz/A$f$a$j;->f:Lkotlin/jvm/internal/N;

    .line 101
    .line 102
    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, LE0/C;

    .line 105
    .line 106
    invoke-virtual {v0}, LE0/C;->h()J

    .line 107
    .line 108
    .line 109
    move-result-wide v0

    .line 110
    invoke-static {v0, v1}, Lr0/f;->d(J)Lr0/f;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    sget-object p1, LTd/L;->a:LTd/L;

    .line 118
    .line 119
    return-object p1

    .line 120
    :cond_4
    return-object v3
.end method
