.class final Lwd/i$h;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwd/i;->f(Lyd/q;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lwd/i;

.field final synthetic c:Lkotlin/jvm/internal/N;

.field final synthetic d:Lyd/q;

.field final synthetic e:Lyd/q;


# direct methods
.method constructor <init>(Lwd/i;Lkotlin/jvm/internal/N;Lyd/q;Lyd/q;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwd/i$h;->b:Lwd/i;

    .line 2
    .line 3
    iput-object p2, p0, Lwd/i$h;->c:Lkotlin/jvm/internal/N;

    .line 4
    .line 5
    iput-object p3, p0, Lwd/i$h;->d:Lyd/q;

    .line 6
    .line 7
    iput-object p4, p0, Lwd/i$h;->e:Lyd/q;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 6

    .line 1
    new-instance v0, Lwd/i$h;

    .line 2
    .line 3
    iget-object v1, p0, Lwd/i$h;->b:Lwd/i;

    .line 4
    .line 5
    iget-object v2, p0, Lwd/i$h;->c:Lkotlin/jvm/internal/N;

    .line 6
    .line 7
    iget-object v3, p0, Lwd/i$h;->d:Lyd/q;

    .line 8
    .line 9
    iget-object v4, p0, Lwd/i$h;->e:Lyd/q;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lwd/i$h;-><init>(Lwd/i;Lkotlin/jvm/internal/N;Lyd/q;Lyd/q;LZd/e;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lwd/i$h;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lwd/i$h;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lwd/i$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lwd/i$h;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

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
    iget v1, p0, Lwd/i$h;->a:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    move-object v9, p0

    .line 31
    goto :goto_2

    .line 32
    :cond_2
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    move p1, v3

    .line 36
    iget-object v3, p0, Lwd/i$h;->b:Lwd/i;

    .line 37
    .line 38
    iget-object v1, p0, Lwd/i$h;->c:Lkotlin/jvm/internal/N;

    .line 39
    .line 40
    iget-object v1, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 41
    .line 42
    move-object v4, v1

    .line 43
    check-cast v4, Lrd/a;

    .line 44
    .line 45
    invoke-static {v3}, Lwd/i;->c(Lwd/i;)Ljava/io/File;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    iget-object v1, p0, Lwd/i$h;->b:Lwd/i;

    .line 50
    .line 51
    invoke-static {v1}, Lwd/i;->b(Lwd/i;)Lexpo/modules/updates/d;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    iget-object v1, p0, Lwd/i$h;->d:Lyd/q;

    .line 56
    .line 57
    invoke-interface {v1}, Lyd/q;->c()Lrd/d;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    iget-object v1, p0, Lwd/i$h;->e:Lyd/q;

    .line 62
    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    invoke-interface {v1}, Lyd/q;->c()Lrd/d;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    :goto_0
    move-object v8, v1

    .line 70
    goto :goto_1

    .line 71
    :cond_3
    const/4 v1, 0x0

    .line 72
    goto :goto_0

    .line 73
    :goto_1
    iput p1, p0, Lwd/i$h;->a:I

    .line 74
    .line 75
    move-object v9, p0

    .line 76
    invoke-virtual/range {v3 .. v9}, Lwd/i;->l(Lrd/a;Ljava/io/File;Lexpo/modules/updates/d;Lrd/d;Lrd/d;LZd/e;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-ne p1, v0, :cond_4

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_4
    :goto_2
    check-cast p1, Lwd/g$a;

    .line 84
    .line 85
    iget-object v1, v9, Lwd/i$h;->b:Lwd/i;

    .line 86
    .line 87
    invoke-virtual {p1}, Lwd/g$a;->a()Lrd/a;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {p1}, Lwd/g$a;->b()Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-eqz p1, :cond_5

    .line 96
    .line 97
    sget-object p1, Lwd/i$b;->a:Lwd/i$b;

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_5
    sget-object p1, Lwd/i$b;->b:Lwd/i$b;

    .line 101
    .line 102
    :goto_3
    iput v2, v9, Lwd/i$h;->a:I

    .line 103
    .line 104
    invoke-static {v1, v3, p1, p0}, Lwd/i;->d(Lwd/i;Lrd/a;Lwd/i$b;LZd/e;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    if-ne p1, v0, :cond_6

    .line 109
    .line 110
    :goto_4
    return-object v0

    .line 111
    :cond_6
    return-object p1
.end method
