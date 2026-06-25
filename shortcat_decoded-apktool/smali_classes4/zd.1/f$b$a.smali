.class final Lzd/f$b$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzd/f$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lzd/f;

.field final synthetic c:Lcom/facebook/react/ReactHost;


# direct methods
.method constructor <init>(Lzd/f;Lcom/facebook/react/ReactHost;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzd/f$b$a;->b:Lzd/f;

    .line 2
    .line 3
    iput-object p2, p0, Lzd/f$b$a;->c:Lcom/facebook/react/ReactHost;

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
    new-instance p1, Lzd/f$b$a;

    .line 2
    .line 3
    iget-object v0, p0, Lzd/f$b$a;->b:Lzd/f;

    .line 4
    .line 5
    iget-object v1, p0, Lzd/f$b$a;->c:Lcom/facebook/react/ReactHost;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lzd/f$b$a;-><init>(Lzd/f;Lcom/facebook/react/ReactHost;LZd/e;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lzd/f$b$a;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lzd/f$b$a;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lzd/f$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lzd/f$b$a;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lzd/f$b$a;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_3

    .line 7
    .line 8
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lzd/f$b$a;->b:Lzd/f;

    .line 12
    .line 13
    invoke-static {p1}, Lzd/f;->f(Lzd/f;)LAd/d;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 v0, 0x0

    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    iget-object v1, p0, Lzd/f$b$a;->b:Lzd/f;

    .line 21
    .line 22
    invoke-static {v1}, Lzd/f;->j(Lzd/f;)Ljava/lang/ref/WeakReference;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Landroid/app/Activity;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v1, v0

    .line 36
    :goto_0
    invoke-virtual {p1, v1}, LAd/d;->i(Landroid/app/Activity;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    iget-object p1, p0, Lzd/f$b$a;->c:Lcom/facebook/react/ReactHost;

    .line 40
    .line 41
    iget-object v1, p0, Lzd/f$b$a;->b:Lzd/f;

    .line 42
    .line 43
    invoke-static {v1}, Lzd/f;->j(Lzd/f;)Ljava/lang/ref/WeakReference;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Landroid/app/Activity;

    .line 54
    .line 55
    :cond_2
    const-string v1, "Restart from RelaunchProcedure"

    .line 56
    .line 57
    invoke-static {p1, v0, v1}, Lzd/g;->b(Lcom/facebook/react/ReactHost;Landroid/app/Activity;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    sget-object p1, LTd/L;->a:LTd/L;

    .line 61
    .line 62
    return-object p1

    .line 63
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 64
    .line 65
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 66
    .line 67
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p1
.end method
