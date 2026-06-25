.class final Landroidx/compose/ui/platform/L0$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/L0;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:I

.field final synthetic d:LIf/g;


# direct methods
.method constructor <init>(LIf/g;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/L0$a;->d:LIf/g;

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
    new-instance p1, Landroidx/compose/ui/platform/L0$a;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/ui/platform/L0$a;->d:LIf/g;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Landroidx/compose/ui/platform/L0$a;-><init>(LIf/g;LZd/e;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/L0$a;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/platform/L0$a;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Landroidx/compose/ui/platform/L0$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/L0$a;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/compose/ui/platform/L0$a;->c:I

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
    iget-object v1, p0, Landroidx/compose/ui/platform/L0$a;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, LIf/i;

    .line 15
    .line 16
    iget-object v3, p0, Landroidx/compose/ui/platform/L0$a;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, LIf/v;

    .line 19
    .line 20
    :try_start_0
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_2

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
    iget-object v3, p0, Landroidx/compose/ui/platform/L0$a;->d:LIf/g;

    .line 38
    .line 39
    :try_start_1
    invoke-interface {v3}, LIf/v;->iterator()LIf/i;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    move-object v1, p1

    .line 44
    :goto_0
    iput-object v3, p0, Landroidx/compose/ui/platform/L0$a;->a:Ljava/lang/Object;

    .line 45
    .line 46
    iput-object v1, p0, Landroidx/compose/ui/platform/L0$a;->b:Ljava/lang/Object;

    .line 47
    .line 48
    iput v2, p0, Landroidx/compose/ui/platform/L0$a;->c:I

    .line 49
    .line 50
    invoke-interface {v1, p0}, LIf/i;->a(LZd/e;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-ne p1, v0, :cond_2

    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_2
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_3

    .line 64
    .line 65
    invoke-interface {v1}, LIf/i;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, LTd/L;

    .line 70
    .line 71
    invoke-static {}, Landroidx/compose/ui/platform/L0;->a()Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    const/4 v4, 0x0

    .line 76
    invoke-virtual {p1, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 77
    .line 78
    .line 79
    sget-object p1, Li0/l;->e:Li0/l$a;

    .line 80
    .line 81
    invoke-virtual {p1}, Li0/l$a;->m()V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_3
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    .line 87
    const/4 p1, 0x0

    .line 88
    invoke-static {v3, p1}, LIf/n;->a(LIf/v;Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    sget-object p1, LTd/L;->a:LTd/L;

    .line 92
    .line 93
    return-object p1

    .line 94
    :goto_2
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 95
    :catchall_1
    move-exception v0

    .line 96
    invoke-static {v3, p1}, LIf/n;->a(LIf/v;Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    throw v0
.end method
