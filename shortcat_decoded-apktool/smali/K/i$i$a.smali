.class final LK/i$i$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/i$i;->invoke(Lq0/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LH/b;

.field final synthetic c:La1/U;

.field final synthetic d:LK/y;

.field final synthetic e:LK/Z;

.field final synthetic f:La1/J;


# direct methods
.method constructor <init>(LH/b;La1/U;LK/y;LK/Z;La1/J;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/i$i$a;->b:LH/b;

    .line 2
    .line 3
    iput-object p2, p0, LK/i$i$a;->c:La1/U;

    .line 4
    .line 5
    iput-object p3, p0, LK/i$i$a;->d:LK/y;

    .line 6
    .line 7
    iput-object p4, p0, LK/i$i$a;->e:LK/Z;

    .line 8
    .line 9
    iput-object p5, p0, LK/i$i$a;->f:La1/J;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 7

    .line 1
    new-instance v0, LK/i$i$a;

    .line 2
    .line 3
    iget-object v1, p0, LK/i$i$a;->b:LH/b;

    .line 4
    .line 5
    iget-object v2, p0, LK/i$i$a;->c:La1/U;

    .line 6
    .line 7
    iget-object v3, p0, LK/i$i$a;->d:LK/y;

    .line 8
    .line 9
    iget-object v4, p0, LK/i$i$a;->e:LK/Z;

    .line 10
    .line 11
    iget-object v5, p0, LK/i$i$a;->f:La1/J;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, LK/i$i$a;-><init>(LH/b;La1/U;LK/y;LK/Z;La1/J;LZd/e;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LK/i$i$a;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, LK/i$i$a;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, LK/i$i$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, LK/i$i$a;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

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
    iget v1, p0, LK/i$i$a;->a:I

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
    iget-object v1, p0, LK/i$i$a;->b:LH/b;

    .line 28
    .line 29
    move p1, v2

    .line 30
    iget-object v2, p0, LK/i$i$a;->c:La1/U;

    .line 31
    .line 32
    iget-object v3, p0, LK/i$i$a;->d:LK/y;

    .line 33
    .line 34
    invoke-virtual {v3}, LK/y;->v()LK/H;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    iget-object v4, p0, LK/i$i$a;->e:LK/Z;

    .line 39
    .line 40
    invoke-virtual {v4}, LK/Z;->f()LU0/T0;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    iget-object v5, p0, LK/i$i$a;->f:La1/J;

    .line 45
    .line 46
    iput p1, p0, LK/i$i$a;->a:I

    .line 47
    .line 48
    move-object v6, p0

    .line 49
    invoke-static/range {v1 .. v6}, LK/i;->m(LH/b;La1/U;LK/H;LU0/T0;La1/J;LZd/e;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-ne p1, v0, :cond_2

    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_2
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 57
    .line 58
    return-object p1
.end method
