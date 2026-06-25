.class final LN/o$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/o$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LGf/C0;

.field final synthetic c:LN/o;


# direct methods
.method constructor <init>(LGf/C0;LN/o;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN/o$a$a;->b:LGf/C0;

    .line 2
    .line 3
    iput-object p2, p0, LN/o$a$a;->c:LN/o;

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
    new-instance p1, LN/o$a$a;

    .line 2
    .line 3
    iget-object v0, p0, LN/o$a$a;->b:LGf/C0;

    .line 4
    .line 5
    iget-object v1, p0, LN/o$a$a;->c:LN/o;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, LN/o$a$a;-><init>(LGf/C0;LN/o;LZd/e;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LN/o$a$a;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, LN/o$a$a;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, LN/o$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, LN/o$a$a;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

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
    iget v1, p0, LN/o$a$a;->a:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const-wide/16 v3, 0x1f4

    .line 9
    .line 10
    const/4 v5, 0x3

    .line 11
    const/4 v6, 0x2

    .line 12
    const/4 v7, 0x1

    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    if-eq v1, v7, :cond_2

    .line 16
    .line 17
    if-eq v1, v6, :cond_1

    .line 18
    .line 19
    if-ne v1, v5, :cond_0

    .line 20
    .line 21
    :try_start_0
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    goto :goto_3

    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_1
    :try_start_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, LN/o$a$a;->b:LGf/C0;

    .line 47
    .line 48
    if-eqz p1, :cond_4

    .line 49
    .line 50
    iput v7, p0, LN/o$a$a;->a:I

    .line 51
    .line 52
    invoke-static {p1, p0}, LGf/F0;->g(LGf/C0;LZd/e;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-ne p1, v0, :cond_4

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_4
    :goto_0
    :try_start_2
    iget-object p1, p0, LN/o$a$a;->c:LN/o;

    .line 60
    .line 61
    const/high16 v1, 0x3f800000    # 1.0f

    .line 62
    .line 63
    invoke-static {p1, v1}, LN/o;->b(LN/o;F)V

    .line 64
    .line 65
    .line 66
    iput v6, p0, LN/o$a$a;->a:I

    .line 67
    .line 68
    invoke-static {v3, v4, p0}, LGf/Z;->a(JLZd/e;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-ne p1, v0, :cond_5

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_5
    :goto_1
    iget-object p1, p0, LN/o$a$a;->c:LN/o;

    .line 76
    .line 77
    invoke-static {p1, v2}, LN/o;->b(LN/o;F)V

    .line 78
    .line 79
    .line 80
    iput v5, p0, LN/o$a$a;->a:I

    .line 81
    .line 82
    invoke-static {v3, v4, p0}, LGf/Z;->a(JLZd/e;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 86
    if-ne p1, v0, :cond_4

    .line 87
    .line 88
    :goto_2
    return-object v0

    .line 89
    :goto_3
    iget-object v0, p0, LN/o$a$a;->c:LN/o;

    .line 90
    .line 91
    invoke-static {v0, v2}, LN/o;->b(LN/o;F)V

    .line 92
    .line 93
    .line 94
    throw p1
.end method
