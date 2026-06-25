.class final Landroidx/compose/ui/platform/J1$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/J1;->a(Landroid/view/View;)LY/o1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LY/o1;

.field final synthetic c:Landroid/view/View;


# direct methods
.method constructor <init>(LY/o1;Landroid/view/View;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/J1$b;->b:LY/o1;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/platform/J1$b;->c:Landroid/view/View;

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
    new-instance p1, Landroidx/compose/ui/platform/J1$b;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/ui/platform/J1$b;->b:LY/o1;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/compose/ui/platform/J1$b;->c:Landroid/view/View;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Landroidx/compose/ui/platform/J1$b;-><init>(LY/o1;Landroid/view/View;LZd/e;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/J1$b;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/platform/J1$b;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Landroidx/compose/ui/platform/J1$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/J1$b;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

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
    iget v1, p0, Landroidx/compose/ui/platform/J1$b;->a:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v3, :cond_0

    .line 12
    .line 13
    :try_start_0
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    goto :goto_1

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
    :try_start_1
    iget-object p1, p0, Landroidx/compose/ui/platform/J1$b;->b:LY/o1;

    .line 31
    .line 32
    iput v3, p0, Landroidx/compose/ui/platform/J1$b;->a:I

    .line 33
    .line 34
    invoke-virtual {p1, p0}, LY/o1;->t0(LZd/e;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    if-ne p1, v0, :cond_2

    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_2
    :goto_0
    iget-object p1, p0, Landroidx/compose/ui/platform/J1$b;->c:Landroid/view/View;

    .line 42
    .line 43
    invoke-static {p1}, Landroidx/compose/ui/platform/K1;->f(Landroid/view/View;)LY/y;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iget-object v0, p0, Landroidx/compose/ui/platform/J1$b;->b:LY/o1;

    .line 48
    .line 49
    if-ne p1, v0, :cond_3

    .line 50
    .line 51
    iget-object p1, p0, Landroidx/compose/ui/platform/J1$b;->c:Landroid/view/View;

    .line 52
    .line 53
    invoke-static {p1, v2}, Landroidx/compose/ui/platform/K1;->i(Landroid/view/View;LY/y;)V

    .line 54
    .line 55
    .line 56
    :cond_3
    sget-object p1, LTd/L;->a:LTd/L;

    .line 57
    .line 58
    return-object p1

    .line 59
    :goto_1
    iget-object v0, p0, Landroidx/compose/ui/platform/J1$b;->c:Landroid/view/View;

    .line 60
    .line 61
    invoke-static {v0}, Landroidx/compose/ui/platform/K1;->f(Landroid/view/View;)LY/y;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-object v1, p0, Landroidx/compose/ui/platform/J1$b;->b:LY/o1;

    .line 66
    .line 67
    if-ne v0, v1, :cond_4

    .line 68
    .line 69
    iget-object v0, p0, Landroidx/compose/ui/platform/J1$b;->c:Landroid/view/View;

    .line 70
    .line 71
    invoke-static {v0, v2}, Landroidx/compose/ui/platform/K1;->i(Landroid/view/View;LY/y;)V

    .line 72
    .line 73
    .line 74
    :cond_4
    throw p1
.end method
