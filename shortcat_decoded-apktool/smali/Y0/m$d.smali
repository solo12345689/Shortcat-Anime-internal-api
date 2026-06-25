.class final LY0/m$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY0/m;->p(LY0/t;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LY0/m;

.field final synthetic c:LY0/t;


# direct methods
.method constructor <init>(LY0/m;LY0/t;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY0/m$d;->b:LY0/m;

    .line 2
    .line 3
    iput-object p2, p0, LY0/m$d;->c:LY0/t;

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
    new-instance p1, LY0/m$d;

    .line 2
    .line 3
    iget-object v0, p0, LY0/m$d;->b:LY0/m;

    .line 4
    .line 5
    iget-object v1, p0, LY0/m$d;->c:LY0/t;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, LY0/m$d;-><init>(LY0/m;LY0/t;LZd/e;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LY0/m$d;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, LY0/m$d;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, LY0/m$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, LY0/m$d;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, LY0/m$d;->a:I

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
    return-object p1

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
    iget-object p1, p0, LY0/m$d;->b:LY0/m;

    .line 28
    .line 29
    invoke-static {p1}, LY0/m;->i(LY0/m;)LY0/U;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v1, p0, LY0/m$d;->c:LY0/t;

    .line 34
    .line 35
    iput v2, p0, LY0/m$d;->a:I

    .line 36
    .line 37
    invoke-interface {p1, v1, p0}, LY0/U;->c(LY0/t;LZd/e;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-ne p1, v0, :cond_2

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_2
    return-object p1
.end method
