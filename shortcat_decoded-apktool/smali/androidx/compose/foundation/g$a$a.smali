.class final Landroidx/compose/foundation/g$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/g$a;->onAttach()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Landroidx/compose/foundation/g$a;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/g$a;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/g$a$a;->b:Landroidx/compose/foundation/g$a;

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
    new-instance p1, Landroidx/compose/foundation/g$a$a;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/foundation/g$a$a;->b:Landroidx/compose/foundation/g$a;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Landroidx/compose/foundation/g$a$a;-><init>(Landroidx/compose/foundation/g$a;LZd/e;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/g$a$a;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/g$a$a;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/g$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/g$a$a;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/compose/foundation/g$a$a;->a:I

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
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance p1, Lkotlin/jvm/internal/L;

    .line 28
    .line 29
    invoke-direct {p1}, Lkotlin/jvm/internal/L;-><init>()V

    .line 30
    .line 31
    .line 32
    new-instance v1, Lkotlin/jvm/internal/L;

    .line 33
    .line 34
    invoke-direct {v1}, Lkotlin/jvm/internal/L;-><init>()V

    .line 35
    .line 36
    .line 37
    new-instance v3, Lkotlin/jvm/internal/L;

    .line 38
    .line 39
    invoke-direct {v3}, Lkotlin/jvm/internal/L;-><init>()V

    .line 40
    .line 41
    .line 42
    iget-object v4, p0, Landroidx/compose/foundation/g$a$a;->b:Landroidx/compose/foundation/g$a;

    .line 43
    .line 44
    invoke-static {v4}, Landroidx/compose/foundation/g$a;->E1(Landroidx/compose/foundation/g$a;)LB/k;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-interface {v4}, LB/k;->b()LJf/e;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    new-instance v5, Landroidx/compose/foundation/g$a$a$a;

    .line 53
    .line 54
    iget-object v6, p0, Landroidx/compose/foundation/g$a$a;->b:Landroidx/compose/foundation/g$a;

    .line 55
    .line 56
    invoke-direct {v5, p1, v1, v3, v6}, Landroidx/compose/foundation/g$a$a$a;-><init>(Lkotlin/jvm/internal/L;Lkotlin/jvm/internal/L;Lkotlin/jvm/internal/L;Landroidx/compose/foundation/g$a;)V

    .line 57
    .line 58
    .line 59
    iput v2, p0, Landroidx/compose/foundation/g$a$a;->a:I

    .line 60
    .line 61
    invoke-interface {v4, v5, p0}, LJf/e;->collect(LJf/f;LZd/e;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-ne p1, v0, :cond_2

    .line 66
    .line 67
    return-object v0

    .line 68
    :cond_2
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 69
    .line 70
    return-object p1
.end method
