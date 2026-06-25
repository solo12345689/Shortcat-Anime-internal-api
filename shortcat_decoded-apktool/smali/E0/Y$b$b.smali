.class final LE0/Y$b$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE0/Y$b;->K(JLkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:J

.field final synthetic c:LE0/Y$b;


# direct methods
.method constructor <init>(JLE0/Y$b;LZd/e;)V
    .locals 0

    .line 1
    iput-wide p1, p0, LE0/Y$b$b;->b:J

    .line 2
    .line 3
    iput-object p3, p0, LE0/Y$b$b;->c:LE0/Y$b;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 3

    .line 1
    new-instance p1, LE0/Y$b$b;

    .line 2
    .line 3
    iget-wide v0, p0, LE0/Y$b$b;->b:J

    .line 4
    .line 5
    iget-object v2, p0, LE0/Y$b$b;->c:LE0/Y$b;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, v2, p2}, LE0/Y$b$b;-><init>(JLE0/Y$b;LZd/e;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LE0/Y$b$b;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, LE0/Y$b$b;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, LE0/Y$b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, LE0/Y$b$b;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

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
    iget v1, p0, LE0/Y$b$b;->a:I

    .line 6
    .line 7
    const-wide/16 v2, 0x8

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x1

    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    if-eq v1, v5, :cond_1

    .line 14
    .line 15
    if-ne v1, v4, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-wide v6, p0, LE0/Y$b$b;->b:J

    .line 37
    .line 38
    sub-long/2addr v6, v2

    .line 39
    iput v5, p0, LE0/Y$b$b;->a:I

    .line 40
    .line 41
    invoke-static {v6, v7, p0}, LGf/Z;->a(JLZd/e;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-ne p1, v0, :cond_3

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    :goto_0
    iput v4, p0, LE0/Y$b$b;->a:I

    .line 49
    .line 50
    invoke-static {v2, v3, p0}, LGf/Z;->a(JLZd/e;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-ne p1, v0, :cond_4

    .line 55
    .line 56
    :goto_1
    return-object v0

    .line 57
    :cond_4
    :goto_2
    iget-object p1, p0, LE0/Y$b$b;->c:LE0/Y$b;

    .line 58
    .line 59
    invoke-static {p1}, LE0/Y$b;->q(LE0/Y$b;)LGf/n;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-eqz p1, :cond_5

    .line 64
    .line 65
    sget-object v0, LTd/u;->b:LTd/u$a;

    .line 66
    .line 67
    new-instance v0, LE0/t;

    .line 68
    .line 69
    iget-wide v1, p0, LE0/Y$b$b;->b:J

    .line 70
    .line 71
    invoke-direct {v0, v1, v2}, LE0/t;-><init>(J)V

    .line 72
    .line 73
    .line 74
    invoke-static {v0}, LTd/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v0}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-interface {p1, v0}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_5
    sget-object p1, LTd/L;->a:LTd/L;

    .line 86
    .line 87
    return-object p1
.end method
