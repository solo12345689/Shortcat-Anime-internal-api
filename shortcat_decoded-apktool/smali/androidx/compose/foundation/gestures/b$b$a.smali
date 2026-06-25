.class final Landroidx/compose/foundation/gestures/b$b$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Landroidx/compose/foundation/gestures/b;

.field final synthetic d:LE0/L;

.field final synthetic e:Lie/o;

.field final synthetic f:Lkotlin/jvm/functions/Function1;

.field final synthetic g:Lie/a;

.field final synthetic h:Lie/a;

.field final synthetic i:Lkotlin/jvm/functions/Function2;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/gestures/b;LE0/L;Lie/o;Lkotlin/jvm/functions/Function1;Lie/a;Lie/a;Lkotlin/jvm/functions/Function2;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/b$b$a;->c:Landroidx/compose/foundation/gestures/b;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/gestures/b$b$a;->d:LE0/L;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/gestures/b$b$a;->e:Lie/o;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/foundation/gestures/b$b$a;->f:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    iput-object p5, p0, Landroidx/compose/foundation/gestures/b$b$a;->g:Lie/a;

    .line 10
    .line 11
    iput-object p6, p0, Landroidx/compose/foundation/gestures/b$b$a;->h:Lie/a;

    .line 12
    .line 13
    iput-object p7, p0, Landroidx/compose/foundation/gestures/b$b$a;->i:Lkotlin/jvm/functions/Function2;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 9

    .line 1
    new-instance v0, Landroidx/compose/foundation/gestures/b$b$a;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$b$a;->c:Landroidx/compose/foundation/gestures/b;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/foundation/gestures/b$b$a;->d:LE0/L;

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/compose/foundation/gestures/b$b$a;->e:Lie/o;

    .line 8
    .line 9
    iget-object v4, p0, Landroidx/compose/foundation/gestures/b$b$a;->f:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    iget-object v5, p0, Landroidx/compose/foundation/gestures/b$b$a;->g:Lie/a;

    .line 12
    .line 13
    iget-object v6, p0, Landroidx/compose/foundation/gestures/b$b$a;->h:Lie/a;

    .line 14
    .line 15
    iget-object v7, p0, Landroidx/compose/foundation/gestures/b$b$a;->i:Lkotlin/jvm/functions/Function2;

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, Landroidx/compose/foundation/gestures/b$b$a;-><init>(Landroidx/compose/foundation/gestures/b;LE0/L;Lie/o;Lkotlin/jvm/functions/Function1;Lie/a;Lie/a;Lkotlin/jvm/functions/Function2;LZd/e;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, Landroidx/compose/foundation/gestures/b$b$a;->b:Ljava/lang/Object;

    .line 22
    .line 23
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/b$b$a;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/b$b$a;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/b$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/b$b$a;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

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
    iget v1, p0, Landroidx/compose/foundation/gestures/b$b$a;->a:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/compose/foundation/gestures/b$b$a;->b:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v1, v0

    .line 15
    check-cast v1, LGf/O;

    .line 16
    .line 17
    :try_start_0
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    move-object v10, p0

    .line 21
    goto :goto_2

    .line 22
    :catch_0
    move-exception v0

    .line 23
    move-object p1, v0

    .line 24
    move-object v10, p0

    .line 25
    goto :goto_1

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
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Landroidx/compose/foundation/gestures/b$b$a;->b:Ljava/lang/Object;

    .line 38
    .line 39
    move-object v1, p1

    .line 40
    check-cast v1, LGf/O;

    .line 41
    .line 42
    :try_start_1
    iget-object p1, p0, Landroidx/compose/foundation/gestures/b$b$a;->c:Landroidx/compose/foundation/gestures/b;

    .line 43
    .line 44
    invoke-static {p1}, Landroidx/compose/foundation/gestures/b;->L1(Landroidx/compose/foundation/gestures/b;)Lz/q;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    iget-object v3, p0, Landroidx/compose/foundation/gestures/b$b$a;->d:LE0/L;

    .line 49
    .line 50
    iget-object v4, p0, Landroidx/compose/foundation/gestures/b$b$a;->e:Lie/o;

    .line 51
    .line 52
    iget-object v5, p0, Landroidx/compose/foundation/gestures/b$b$a;->f:Lkotlin/jvm/functions/Function1;

    .line 53
    .line 54
    iget-object v6, p0, Landroidx/compose/foundation/gestures/b$b$a;->g:Lie/a;

    .line 55
    .line 56
    iget-object v7, p0, Landroidx/compose/foundation/gestures/b$b$a;->h:Lie/a;

    .line 57
    .line 58
    iget-object v9, p0, Landroidx/compose/foundation/gestures/b$b$a;->i:Lkotlin/jvm/functions/Function2;

    .line 59
    .line 60
    iput-object v1, p0, Landroidx/compose/foundation/gestures/b$b$a;->b:Ljava/lang/Object;

    .line 61
    .line 62
    iput v2, p0, Landroidx/compose/foundation/gestures/b$b$a;->a:I
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_2

    .line 63
    .line 64
    move-object v10, p0

    .line 65
    :try_start_2
    invoke-static/range {v3 .. v10}, Lz/j;->d(LE0/L;Lie/o;Lkotlin/jvm/functions/Function1;Lie/a;Lie/a;Lz/q;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1

    .line 69
    if-ne p1, v0, :cond_3

    .line 70
    .line 71
    return-object v0

    .line 72
    :catch_1
    move-exception v0

    .line 73
    :goto_0
    move-object p1, v0

    .line 74
    goto :goto_1

    .line 75
    :catch_2
    move-exception v0

    .line 76
    move-object v10, p0

    .line 77
    goto :goto_0

    .line 78
    :goto_1
    iget-object v0, v10, Landroidx/compose/foundation/gestures/b$b$a;->c:Landroidx/compose/foundation/gestures/b;

    .line 79
    .line 80
    invoke-static {v0}, Landroidx/compose/foundation/gestures/b;->K1(Landroidx/compose/foundation/gestures/b;)LIf/g;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    if-eqz v0, :cond_2

    .line 85
    .line 86
    sget-object v2, Landroidx/compose/foundation/gestures/a$a;->a:Landroidx/compose/foundation/gestures/a$a;

    .line 87
    .line 88
    invoke-interface {v0, v2}, LIf/w;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-static {v0}, LIf/k;->b(Ljava/lang/Object;)LIf/k;

    .line 93
    .line 94
    .line 95
    :cond_2
    invoke-static {v1}, LGf/P;->g(LGf/O;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_4

    .line 100
    .line 101
    :cond_3
    :goto_2
    sget-object p1, LTd/L;->a:LTd/L;

    .line 102
    .line 103
    return-object p1

    .line 104
    :cond_4
    throw p1
.end method
