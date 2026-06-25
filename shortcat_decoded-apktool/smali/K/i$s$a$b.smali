.class final LK/i$s$a$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/i$s$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LE0/L;

.field final synthetic c:LQ/F;


# direct methods
.method constructor <init>(LE0/L;LQ/F;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/i$s$a$b;->b:LE0/L;

    .line 2
    .line 3
    iput-object p2, p0, LK/i$s$a$b;->c:LQ/F;

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
    new-instance p1, LK/i$s$a$b;

    .line 2
    .line 3
    iget-object v0, p0, LK/i$s$a$b;->b:LE0/L;

    .line 4
    .line 5
    iget-object v1, p0, LK/i$s$a$b;->c:LQ/F;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, LK/i$s$a$b;-><init>(LE0/L;LQ/F;LZd/e;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LK/i$s$a$b;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, LK/i$s$a$b;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, LK/i$s$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, LK/i$s$a$b;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, LK/i$s$a$b;->a:I

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
    iget-object v1, p0, LK/i$s$a$b;->b:LE0/L;

    .line 28
    .line 29
    new-instance v5, LK/i$s$a$b$a;

    .line 30
    .line 31
    iget-object p1, p0, LK/i$s$a$b;->c:LQ/F;

    .line 32
    .line 33
    invoke-direct {v5, p1}, LK/i$s$a$b$a;-><init>(LQ/F;)V

    .line 34
    .line 35
    .line 36
    iput v2, p0, LK/i$s$a$b;->a:I

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    const/4 v3, 0x0

    .line 40
    const/4 v4, 0x0

    .line 41
    const/4 v7, 0x7

    .line 42
    const/4 v8, 0x0

    .line 43
    move-object v6, p0

    .line 44
    invoke-static/range {v1 .. v8}, Lz/A;->j(LE0/L;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lie/o;Lkotlin/jvm/functions/Function1;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-ne p1, v0, :cond_2

    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_2
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 52
    .line 53
    return-object p1
.end method
