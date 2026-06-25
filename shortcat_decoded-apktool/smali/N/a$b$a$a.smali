.class final LN/a$b$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/a$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LN/a;

.field final synthetic c:LN/l0;


# direct methods
.method constructor <init>(LN/a;LN/l0;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN/a$b$a$a;->b:LN/a;

    .line 2
    .line 3
    iput-object p2, p0, LN/a$b$a$a;->c:LN/l0;

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
    .locals 2

    .line 1
    new-instance p1, LN/a$b$a$a;

    .line 2
    .line 3
    iget-object v0, p0, LN/a$b$a$a;->b:LN/a;

    .line 4
    .line 5
    iget-object v1, p0, LN/a$b$a$a;->c:LN/l0;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, LN/a$b$a$a;-><init>(LN/a;LN/l0;LZd/e;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LN/a$b$a$a;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, LN/a$b$a$a;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, LN/a$b$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, LN/a$b$a$a;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, LN/a$b$a$a;->a:I

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
    if-eq v1, v2, :cond_0

    .line 14
    .line 15
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1

    .line 23
    :cond_0
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget-object p1, LN/a$b$a$a$a;->a:LN/a$b$a$a$a;

    .line 35
    .line 36
    iput v3, p0, LN/a$b$a$a;->a:I

    .line 37
    .line 38
    invoke-static {p1, p0}, LY/v0;->b(Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-ne p1, v0, :cond_3

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    :goto_0
    iget-object p1, p0, LN/a$b$a$a;->b:LN/a;

    .line 46
    .line 47
    invoke-static {p1}, LN/a;->m(LN/a;)LJf/t;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-eqz p1, :cond_5

    .line 52
    .line 53
    new-instance v1, LN/a$b$a$a$b;

    .line 54
    .line 55
    iget-object v3, p0, LN/a$b$a$a;->c:LN/l0;

    .line 56
    .line 57
    invoke-direct {v1, v3}, LN/a$b$a$a$b;-><init>(LN/l0;)V

    .line 58
    .line 59
    .line 60
    iput v2, p0, LN/a$b$a$a;->a:I

    .line 61
    .line 62
    invoke-interface {p1, v1, p0}, LJf/y;->collect(LJf/f;LZd/e;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-ne p1, v0, :cond_4

    .line 67
    .line 68
    :goto_1
    return-object v0

    .line 69
    :cond_4
    :goto_2
    new-instance p1, LTd/k;

    .line 70
    .line 71
    invoke-direct {p1}, LTd/k;-><init>()V

    .line 72
    .line 73
    .line 74
    throw p1

    .line 75
    :cond_5
    sget-object p1, LTd/L;->a:LTd/L;

    .line 76
    .line 77
    return-object p1
.end method
