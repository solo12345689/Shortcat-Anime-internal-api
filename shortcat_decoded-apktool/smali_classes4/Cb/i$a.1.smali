.class final LCb/i$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCb/i;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Lkotlin/jvm/internal/N;

.field final synthetic d:LCb/i;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/N;LCb/i;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LCb/i$a;->c:Lkotlin/jvm/internal/N;

    .line 2
    .line 3
    iput-object p2, p0, LCb/i$a;->d:LCb/i;

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
.method public final a(LWb/c;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LCb/i$a;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LCb/i$a;

    .line 6
    .line 7
    sget-object p2, LTd/L;->a:LTd/L;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, LCb/i$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 3

    .line 1
    new-instance v0, LCb/i$a;

    .line 2
    .line 3
    iget-object v1, p0, LCb/i$a;->c:Lkotlin/jvm/internal/N;

    .line 4
    .line 5
    iget-object v2, p0, LCb/i$a;->d:LCb/i;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, LCb/i$a;-><init>(Lkotlin/jvm/internal/N;LCb/i;LZd/e;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, LCb/i$a;->b:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LWb/c;

    .line 2
    .line 3
    check-cast p2, LZd/e;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LCb/i$a;->a(LWb/c;LZd/e;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
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
    iget v1, p0, LCb/i$a;->a:I

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
    iget-object v0, p0, LCb/i$a;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lkotlin/jvm/internal/N;

    .line 15
    .line 16
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, LCb/i$a;->b:Ljava/lang/Object;

    .line 32
    .line 33
    move-object v3, p1

    .line 34
    check-cast v3, LWb/c;

    .line 35
    .line 36
    iget-object p1, p0, LCb/i$a;->c:Lkotlin/jvm/internal/N;

    .line 37
    .line 38
    new-instance v4, LCb/d;

    .line 39
    .line 40
    iget-object v1, p0, LCb/i$a;->d:LCb/i;

    .line 41
    .line 42
    invoke-direct {v4, v1}, LCb/d;-><init>(Lic/a;)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, LCb/i$a;->b:Ljava/lang/Object;

    .line 46
    .line 47
    iput v2, p0, LCb/i$a;->a:I

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    const/4 v7, 0x2

    .line 51
    const/4 v8, 0x0

    .line 52
    move-object v6, p0

    .line 53
    invoke-static/range {v3 .. v8}, LWb/c$a;->b(LWb/c;LWb/d;LWb/e;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    if-ne v1, v0, :cond_2

    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_2
    move-object v0, p1

    .line 61
    move-object p1, v1

    .line 62
    :goto_0
    iput-object p1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 63
    .line 64
    sget-object p1, LTd/L;->a:LTd/L;

    .line 65
    .line 66
    return-object p1
.end method
