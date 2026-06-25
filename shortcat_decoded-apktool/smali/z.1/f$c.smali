.class final Lz/f$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/f;->X1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Lz/f;

.field final synthetic d:Lz/E;

.field final synthetic e:Lz/d;


# direct methods
.method constructor <init>(Lz/f;Lz/E;Lz/d;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz/f$c;->c:Lz/f;

    .line 2
    .line 3
    iput-object p2, p0, Lz/f$c;->d:Lz/E;

    .line 4
    .line 5
    iput-object p3, p0, Lz/f$c;->e:Lz/d;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 4

    .line 1
    new-instance v0, Lz/f$c;

    .line 2
    .line 3
    iget-object v1, p0, Lz/f$c;->c:Lz/f;

    .line 4
    .line 5
    iget-object v2, p0, Lz/f$c;->d:Lz/E;

    .line 6
    .line 7
    iget-object v3, p0, Lz/f$c;->e:Lz/d;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p2}, Lz/f$c;-><init>(Lz/f;Lz/E;Lz/d;LZd/e;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lz/f$c;->b:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lz/f$c;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lz/f$c;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lz/f$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lz/f$c;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lz/f$c;->a:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    :try_start_0
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    move-object p1, v0

    .line 20
    goto :goto_2

    .line 21
    :catch_0
    move-exception v0

    .line 22
    move-object p1, v0

    .line 23
    move-object v4, p1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lz/f$c;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, LGf/O;

    .line 39
    .line 40
    invoke-interface {p1}, LGf/O;->getCoroutineContext()LZd/i;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1}, LGf/F0;->k(LZd/i;)LGf/C0;

    .line 45
    .line 46
    .line 47
    move-result-object v9

    .line 48
    :try_start_1
    iget-object p1, p0, Lz/f$c;->c:Lz/f;

    .line 49
    .line 50
    invoke-static {p1, v2}, Lz/f;->M1(Lz/f;Z)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lz/f$c;->c:Lz/f;

    .line 54
    .line 55
    invoke-static {p1}, Lz/f;->I1(Lz/f;)Lz/z;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    sget-object v1, Lx/L;->a:Lx/L;

    .line 60
    .line 61
    new-instance v5, Lz/f$c$a;

    .line 62
    .line 63
    iget-object v6, p0, Lz/f$c;->d:Lz/E;

    .line 64
    .line 65
    iget-object v7, p0, Lz/f$c;->c:Lz/f;

    .line 66
    .line 67
    iget-object v8, p0, Lz/f$c;->e:Lz/d;

    .line 68
    .line 69
    const/4 v10, 0x0

    .line 70
    invoke-direct/range {v5 .. v10}, Lz/f$c$a;-><init>(Lz/E;Lz/f;Lz/d;LGf/C0;LZd/e;)V

    .line 71
    .line 72
    .line 73
    iput v2, p0, Lz/f$c;->a:I

    .line 74
    .line 75
    invoke-virtual {p1, v1, v5, p0}, Lz/z;->v(Lx/L;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-ne p1, v0, :cond_2

    .line 80
    .line 81
    return-object v0

    .line 82
    :cond_2
    :goto_0
    iget-object p1, p0, Lz/f$c;->c:Lz/f;

    .line 83
    .line 84
    invoke-static {p1}, Lz/f;->F1(Lz/f;)Lz/c;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1}, Lz/c;->d()V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    .line 90
    .line 91
    iget-object p1, p0, Lz/f$c;->c:Lz/f;

    .line 92
    .line 93
    invoke-static {p1, v3}, Lz/f;->M1(Lz/f;Z)V

    .line 94
    .line 95
    .line 96
    iget-object p1, p0, Lz/f$c;->c:Lz/f;

    .line 97
    .line 98
    invoke-static {p1}, Lz/f;->F1(Lz/f;)Lz/c;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {p1, v4}, Lz/c;->b(Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    iget-object p1, p0, Lz/f$c;->c:Lz/f;

    .line 106
    .line 107
    invoke-static {p1, v3}, Lz/f;->N1(Lz/f;Z)V

    .line 108
    .line 109
    .line 110
    sget-object p1, LTd/L;->a:LTd/L;

    .line 111
    .line 112
    return-object p1

    .line 113
    :goto_1
    :try_start_2
    throw v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 114
    :goto_2
    iget-object v0, p0, Lz/f$c;->c:Lz/f;

    .line 115
    .line 116
    invoke-static {v0, v3}, Lz/f;->M1(Lz/f;Z)V

    .line 117
    .line 118
    .line 119
    iget-object v0, p0, Lz/f$c;->c:Lz/f;

    .line 120
    .line 121
    invoke-static {v0}, Lz/f;->F1(Lz/f;)Lz/c;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {v0, v4}, Lz/c;->b(Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    iget-object v0, p0, Lz/f$c;->c:Lz/f;

    .line 129
    .line 130
    invoke-static {v0, v3}, Lz/f;->N1(Lz/f;Z)V

    .line 131
    .line 132
    .line 133
    throw p1
.end method
