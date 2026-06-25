.class final LT1/k$s;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT1/k;->B(Lkotlin/jvm/functions/Function2;LZd/i;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:I

.field final synthetic c:LT1/k;

.field final synthetic d:LZd/i;

.field final synthetic e:Lkotlin/jvm/functions/Function2;


# direct methods
.method constructor <init>(LT1/k;LZd/i;Lkotlin/jvm/functions/Function2;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LT1/k$s;->c:LT1/k;

    .line 2
    .line 3
    iput-object p2, p0, LT1/k$s;->d:LZd/i;

    .line 4
    .line 5
    iput-object p3, p0, LT1/k$s;->e:Lkotlin/jvm/functions/Function2;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(LZd/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, LT1/k$s;->create(LZd/e;)LZd/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LT1/k$s;

    .line 6
    .line 7
    sget-object v0, LTd/L;->a:LTd/L;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, LT1/k$s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final create(LZd/e;)LZd/e;
    .locals 4

    .line 1
    new-instance v0, LT1/k$s;

    .line 2
    .line 3
    iget-object v1, p0, LT1/k$s;->c:LT1/k;

    .line 4
    .line 5
    iget-object v2, p0, LT1/k$s;->d:LZd/i;

    .line 6
    .line 7
    iget-object v3, p0, LT1/k$s;->e:Lkotlin/jvm/functions/Function2;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p1}, LT1/k$s;-><init>(LT1/k;LZd/i;Lkotlin/jvm/functions/Function2;LZd/e;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LZd/e;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LT1/k$s;->a(LZd/e;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, LT1/k$s;->b:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    if-eq v1, v4, :cond_2

    .line 13
    .line 14
    if-eq v1, v3, :cond_1

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, LT1/k$s;->a:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    iget-object v1, p0, LT1/k$s;->a:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, LT1/f;

    .line 35
    .line 36
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, LT1/k$s;->c:LT1/k;

    .line 48
    .line 49
    iput v4, p0, LT1/k$s;->b:I

    .line 50
    .line 51
    invoke-static {p1, v4, p0}, LT1/k;->o(LT1/k;ZLZd/e;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-ne p1, v0, :cond_4

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_4
    :goto_0
    move-object v1, p1

    .line 59
    check-cast v1, LT1/f;

    .line 60
    .line 61
    iget-object p1, p0, LT1/k$s;->d:LZd/i;

    .line 62
    .line 63
    new-instance v5, LT1/k$s$a;

    .line 64
    .line 65
    iget-object v6, p0, LT1/k$s;->e:Lkotlin/jvm/functions/Function2;

    .line 66
    .line 67
    const/4 v7, 0x0

    .line 68
    invoke-direct {v5, v6, v1, v7}, LT1/k$s$a;-><init>(Lkotlin/jvm/functions/Function2;LT1/f;LZd/e;)V

    .line 69
    .line 70
    .line 71
    iput-object v1, p0, LT1/k$s;->a:Ljava/lang/Object;

    .line 72
    .line 73
    iput v3, p0, LT1/k$s;->b:I

    .line 74
    .line 75
    invoke-static {p1, v5, p0}, LGf/i;->g(LZd/i;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-ne p1, v0, :cond_5

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_5
    :goto_1
    invoke-virtual {v1}, LT1/f;->b()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, LT1/f;->c()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_6

    .line 94
    .line 95
    iget-object v1, p0, LT1/k$s;->c:LT1/k;

    .line 96
    .line 97
    iput-object p1, p0, LT1/k$s;->a:Ljava/lang/Object;

    .line 98
    .line 99
    iput v2, p0, LT1/k$s;->b:I

    .line 100
    .line 101
    invoke-virtual {v1, p1, v4, p0}, LT1/k;->C(Ljava/lang/Object;ZLZd/e;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    if-ne v1, v0, :cond_6

    .line 106
    .line 107
    :goto_2
    return-object v0

    .line 108
    :cond_6
    return-object p1
.end method
