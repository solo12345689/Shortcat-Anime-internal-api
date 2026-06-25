.class final LY/W1$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY/W1;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LY/m;I)LY/h2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Lkotlin/jvm/functions/Function2;

.field final synthetic d:LY/C0;


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function2;LY/C0;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY/W1$a;->c:Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    iput-object p2, p0, LY/W1$a;->d:LY/C0;

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
    .locals 3

    .line 1
    new-instance v0, LY/W1$a;

    .line 2
    .line 3
    iget-object v1, p0, LY/W1$a;->c:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    iget-object v2, p0, LY/W1$a;->d:LY/C0;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, LY/W1$a;-><init>(Lkotlin/jvm/functions/Function2;LY/C0;LZd/e;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, LY/W1$a;->b:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LY/W1$a;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, LY/W1$a;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, LY/W1$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, LY/W1$a;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

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
    iget v1, p0, LY/W1$a;->a:I

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
    iget-object p1, p0, LY/W1$a;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, LGf/O;

    .line 30
    .line 31
    iget-object v1, p0, LY/W1$a;->c:Lkotlin/jvm/functions/Function2;

    .line 32
    .line 33
    new-instance v3, LY/a1;

    .line 34
    .line 35
    iget-object v4, p0, LY/W1$a;->d:LY/C0;

    .line 36
    .line 37
    invoke-interface {p1}, LGf/O;->getCoroutineContext()LZd/i;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-direct {v3, v4, p1}, LY/a1;-><init>(LY/C0;LZd/i;)V

    .line 42
    .line 43
    .line 44
    iput v2, p0, LY/W1$a;->a:I

    .line 45
    .line 46
    invoke-interface {v1, v3, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-ne p1, v0, :cond_2

    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_2
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 54
    .line 55
    return-object p1
.end method
