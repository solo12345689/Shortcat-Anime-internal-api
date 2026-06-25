.class final Landroidx/compose/ui/platform/P$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/P;->b(Landroidx/compose/ui/platform/g1;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:I

.field synthetic c:Ljava/lang/Object;

.field final synthetic d:Landroidx/compose/ui/platform/P;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/P;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/P$c;->d:Landroidx/compose/ui/platform/P;

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
.method public final a(Landroidx/compose/ui/platform/R0;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/P$c;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroidx/compose/ui/platform/P$c;

    .line 6
    .line 7
    sget-object p2, LTd/L;->a:LTd/L;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Landroidx/compose/ui/platform/P$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/ui/platform/P$c;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/ui/platform/P$c;->d:Landroidx/compose/ui/platform/P;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Landroidx/compose/ui/platform/P$c;-><init>(Landroidx/compose/ui/platform/P;LZd/e;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Landroidx/compose/ui/platform/P$c;->c:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/platform/R0;

    .line 2
    .line 3
    check-cast p2, LZd/e;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/P$c;->a(Landroidx/compose/ui/platform/R0;LZd/e;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
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
    iget v1, p0, Landroidx/compose/ui/platform/P$c;->b:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-eq v1, v2, :cond_0

    .line 11
    .line 12
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/P$c;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Landroidx/compose/ui/platform/P;

    .line 23
    .line 24
    iget-object v0, p0, Landroidx/compose/ui/platform/P$c;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Landroidx/compose/ui/platform/R0;

    .line 27
    .line 28
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Landroidx/compose/ui/platform/P$c;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Landroidx/compose/ui/platform/R0;

    .line 38
    .line 39
    iget-object v1, p0, Landroidx/compose/ui/platform/P$c;->d:Landroidx/compose/ui/platform/P;

    .line 40
    .line 41
    iput-object p1, p0, Landroidx/compose/ui/platform/P$c;->c:Ljava/lang/Object;

    .line 42
    .line 43
    iput-object v1, p0, Landroidx/compose/ui/platform/P$c;->a:Ljava/lang/Object;

    .line 44
    .line 45
    iput v2, p0, Landroidx/compose/ui/platform/P$c;->b:I

    .line 46
    .line 47
    new-instance v3, LGf/p;

    .line 48
    .line 49
    invoke-static {p0}, Lae/b;->c(LZd/e;)LZd/e;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-direct {v3, v4, v2}, LGf/p;-><init>(LZd/e;I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3}, LGf/p;->C()V

    .line 57
    .line 58
    .line 59
    invoke-static {v1}, Landroidx/compose/ui/platform/P;->d(Landroidx/compose/ui/platform/P;)La1/W;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v2}, La1/W;->e()V

    .line 64
    .line 65
    .line 66
    new-instance v2, Landroidx/compose/ui/platform/P$c$a;

    .line 67
    .line 68
    invoke-direct {v2, p1, v1}, Landroidx/compose/ui/platform/P$c$a;-><init>(Landroidx/compose/ui/platform/R0;Landroidx/compose/ui/platform/P;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {v3, v2}, LGf/n;->p(Lkotlin/jvm/functions/Function1;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3}, LGf/p;->v()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    if-ne p1, v1, :cond_2

    .line 83
    .line 84
    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 85
    .line 86
    .line 87
    :cond_2
    if-ne p1, v0, :cond_3

    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_3
    :goto_0
    new-instance p1, LTd/k;

    .line 91
    .line 92
    invoke-direct {p1}, LTd/k;-><init>()V

    .line 93
    .line 94
    .line 95
    throw p1
.end method
