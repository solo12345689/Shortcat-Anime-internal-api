.class final LB/i$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB/i;->a(LB/k;LY/m;I)LY/h2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LB/k;

.field final synthetic c:LY/C0;


# direct methods
.method constructor <init>(LB/k;LY/C0;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LB/i$a;->b:LB/k;

    .line 2
    .line 3
    iput-object p2, p0, LB/i$a;->c:LY/C0;

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
    new-instance p1, LB/i$a;

    .line 2
    .line 3
    iget-object v0, p0, LB/i$a;->b:LB/k;

    .line 4
    .line 5
    iget-object v1, p0, LB/i$a;->c:LY/C0;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, LB/i$a;-><init>(LB/k;LY/C0;LZd/e;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LB/i$a;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, LB/i$a;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, LB/i$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, LB/i$a;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

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
    iget v1, p0, LB/i$a;->a:I

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
    new-instance p1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, LB/i$a;->b:LB/k;

    .line 33
    .line 34
    invoke-interface {v1}, LB/k;->b()LJf/e;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    new-instance v3, LB/i$a$a;

    .line 39
    .line 40
    iget-object v4, p0, LB/i$a;->c:LY/C0;

    .line 41
    .line 42
    invoke-direct {v3, p1, v4}, LB/i$a$a;-><init>(Ljava/util/List;LY/C0;)V

    .line 43
    .line 44
    .line 45
    iput v2, p0, LB/i$a;->a:I

    .line 46
    .line 47
    invoke-interface {v1, v3, p0}, LJf/e;->collect(LJf/f;LZd/e;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-ne p1, v0, :cond_2

    .line 52
    .line 53
    return-object v0

    .line 54
    :cond_2
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 55
    .line 56
    return-object p1
.end method
