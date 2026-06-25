.class final Lzd/k$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzd/k;-><init>(Lxd/a;Lzd/j$b;LGf/O;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:I

.field final synthetic c:Lzd/k;


# direct methods
.method constructor <init>(Lzd/k;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzd/k$a;->c:Lzd/k;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 1

    .line 1
    new-instance p1, Lzd/k$a;

    .line 2
    .line 3
    iget-object v0, p0, Lzd/k$a;->c:Lzd/k;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lzd/k$a;-><init>(Lzd/k;LZd/e;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lzd/k$a;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lzd/k$a;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lzd/k$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lzd/k$a;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lzd/k$a;->b:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_3

    .line 10
    .line 11
    if-eq v1, v3, :cond_2

    .line 12
    .line 13
    if-ne v1, v2, :cond_1

    .line 14
    .line 15
    iget-object v1, p0, Lzd/k$a;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, LIf/i;

    .line 18
    .line 19
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    move-object p1, v1

    .line 23
    goto :goto_0

    .line 24
    :cond_1
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
    :cond_2
    iget-object v1, p0, Lzd/k$a;->a:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, LIf/i;

    .line 35
    .line 36
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_3
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lzd/k$a;->c:Lzd/k;

    .line 44
    .line 45
    invoke-static {p1}, Lzd/k;->c(Lzd/k;)LIf/g;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-interface {p1}, LIf/v;->iterator()LIf/i;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    :goto_0
    iput-object p1, p0, Lzd/k$a;->a:Ljava/lang/Object;

    .line 54
    .line 55
    iput v3, p0, Lzd/k$a;->b:I

    .line 56
    .line 57
    invoke-interface {p1, p0}, LIf/i;->a(LZd/e;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    if-ne v1, v0, :cond_4

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_4
    move-object v5, v1

    .line 65
    move-object v1, p1

    .line 66
    move-object p1, v5

    .line 67
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_5

    .line 74
    .line 75
    invoke-interface {v1}, LIf/i;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Lzd/k$b;

    .line 80
    .line 81
    iget-object v4, p0, Lzd/k$a;->c:Lzd/k;

    .line 82
    .line 83
    iput-object v1, p0, Lzd/k$a;->a:Ljava/lang/Object;

    .line 84
    .line 85
    iput v2, p0, Lzd/k$a;->b:I

    .line 86
    .line 87
    invoke-static {v4, p1, p0}, Lzd/k;->a(Lzd/k;Lzd/k$b;LZd/e;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-ne p1, v0, :cond_0

    .line 92
    .line 93
    :goto_2
    return-object v0

    .line 94
    :cond_5
    sget-object p1, LTd/L;->a:LTd/L;

    .line 95
    .line 96
    return-object p1
.end method
