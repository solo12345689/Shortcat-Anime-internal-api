.class final Lcom/facebook/react/runtime/ReactHostImpl$f;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/runtime/ReactHostImpl;->setBundleSource(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lcom/facebook/react/runtime/ReactHostImpl;

.field final synthetic c:Lkotlin/jvm/functions/Function1;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/facebook/react/runtime/ReactHostImpl;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl$f;->b:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/runtime/ReactHostImpl$f;->c:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/facebook/react/runtime/ReactHostImpl$f;->d:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/facebook/react/runtime/ReactHostImpl$f;->e:Ljava/lang/String;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 6

    .line 1
    new-instance v0, Lcom/facebook/react/runtime/ReactHostImpl$f;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/runtime/ReactHostImpl$f;->b:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/facebook/react/runtime/ReactHostImpl$f;->c:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/facebook/react/runtime/ReactHostImpl$f;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/facebook/react/runtime/ReactHostImpl$f;->e:Ljava/lang/String;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/runtime/ReactHostImpl$f;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;LZd/e;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/runtime/ReactHostImpl$f;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/runtime/ReactHostImpl$f;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lcom/facebook/react/runtime/ReactHostImpl$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/runtime/ReactHostImpl$f;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/facebook/react/runtime/ReactHostImpl$f;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl$f;->b:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/facebook/react/runtime/ReactHostImpl;->getDevSupportManager()Lc7/f;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string v0, "null cannot be cast to non-null type com.facebook.react.devsupport.DevSupportManagerBase"

    .line 18
    .line 19
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    check-cast p1, Lcom/facebook/react/devsupport/Y;

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/facebook/react/devsupport/Y;->u0()Lcom/facebook/react/devsupport/v;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Lcom/facebook/react/devsupport/v;->j()V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl$f;->b:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/facebook/react/runtime/ReactHostImpl;->getDevSupportManager()Lc7/f;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Lcom/facebook/react/devsupport/Y;

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/facebook/react/devsupport/Y;->D()Lr7/a;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-interface {p1}, Lr7/a;->j()Lx7/f;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl$f;->c:Lkotlin/jvm/functions/Function1;

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Lx7/f;->g(Lkotlin/jvm/functions/Function1;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl$f;->d:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Lx7/f;->f(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl$f;->b:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/facebook/react/runtime/ReactHostImpl;->getDevSupportManager()Lc7/f;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Lcom/facebook/react/devsupport/Y;

    .line 64
    .line 65
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl$f;->e:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Lcom/facebook/react/devsupport/Y;->P0(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl$f;->b:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 71
    .line 72
    const-string v0, "Changed bundle source"

    .line 73
    .line 74
    invoke-virtual {p1, v0}, Lcom/facebook/react/runtime/ReactHostImpl;->reload(Ljava/lang/String;)Le7/a;

    .line 75
    .line 76
    .line 77
    sget-object p1, LTd/L;->a:LTd/L;

    .line 78
    .line 79
    return-object p1

    .line 80
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 81
    .line 82
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 83
    .line 84
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw p1
.end method
