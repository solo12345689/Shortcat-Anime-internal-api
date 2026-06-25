.class final Landroidx/compose/material/ripple/RippleNode$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/ripple/RippleNode;->onAttach()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Landroidx/compose/material/ripple/RippleNode;


# direct methods
.method constructor <init>(Landroidx/compose/material/ripple/RippleNode;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/material/ripple/RippleNode$a;->c:Landroidx/compose/material/ripple/RippleNode;

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
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/material/ripple/RippleNode$a;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/material/ripple/RippleNode$a;->c:Landroidx/compose/material/ripple/RippleNode;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Landroidx/compose/material/ripple/RippleNode$a;-><init>(Landroidx/compose/material/ripple/RippleNode;LZd/e;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Landroidx/compose/material/ripple/RippleNode$a;->b:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/material/ripple/RippleNode$a;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/material/ripple/RippleNode$a;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Landroidx/compose/material/ripple/RippleNode$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material/ripple/RippleNode$a;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

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
    iget v1, p0, Landroidx/compose/material/ripple/RippleNode$a;->a:I

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
    iget-object p1, p0, Landroidx/compose/material/ripple/RippleNode$a;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, LGf/O;

    .line 30
    .line 31
    iget-object v1, p0, Landroidx/compose/material/ripple/RippleNode$a;->c:Landroidx/compose/material/ripple/RippleNode;

    .line 32
    .line 33
    invoke-static {v1}, Landroidx/compose/material/ripple/RippleNode;->F1(Landroidx/compose/material/ripple/RippleNode;)LB/k;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v1}, LB/k;->b()LJf/e;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    new-instance v3, Landroidx/compose/material/ripple/RippleNode$a$a;

    .line 42
    .line 43
    iget-object v4, p0, Landroidx/compose/material/ripple/RippleNode$a;->c:Landroidx/compose/material/ripple/RippleNode;

    .line 44
    .line 45
    invoke-direct {v3, v4, p1}, Landroidx/compose/material/ripple/RippleNode$a$a;-><init>(Landroidx/compose/material/ripple/RippleNode;LGf/O;)V

    .line 46
    .line 47
    .line 48
    iput v2, p0, Landroidx/compose/material/ripple/RippleNode$a;->a:I

    .line 49
    .line 50
    invoke-interface {v1, v3, p0}, LJf/e;->collect(LJf/f;LZd/e;)Ljava/lang/Object;

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
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 58
    .line 59
    return-object p1
.end method
