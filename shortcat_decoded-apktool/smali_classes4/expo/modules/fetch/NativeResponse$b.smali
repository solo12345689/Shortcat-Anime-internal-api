.class final Lexpo/modules/fetch/NativeResponse$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/fetch/NativeResponse;->h(Ldg/e;Ldg/E;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Ldg/E;

.field final synthetic c:Lexpo/modules/fetch/NativeResponse;


# direct methods
.method constructor <init>(Ldg/E;Lexpo/modules/fetch/NativeResponse;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/fetch/NativeResponse$b;->b:Ldg/E;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/fetch/NativeResponse$b;->c:Lexpo/modules/fetch/NativeResponse;

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
    new-instance p1, Lexpo/modules/fetch/NativeResponse$b;

    .line 2
    .line 3
    iget-object v0, p0, Lexpo/modules/fetch/NativeResponse$b;->b:Ldg/E;

    .line 4
    .line 5
    iget-object v1, p0, Lexpo/modules/fetch/NativeResponse$b;->c:Lexpo/modules/fetch/NativeResponse;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lexpo/modules/fetch/NativeResponse$b;-><init>(Ldg/E;Lexpo/modules/fetch/NativeResponse;LZd/e;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/fetch/NativeResponse$b;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lexpo/modules/fetch/NativeResponse$b;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lexpo/modules/fetch/NativeResponse$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/fetch/NativeResponse$b;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

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
    iget v0, p0, Lexpo/modules/fetch/NativeResponse$b;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_3

    .line 7
    .line 8
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lexpo/modules/fetch/NativeResponse$b;->b:Ldg/E;

    .line 12
    .line 13
    invoke-virtual {p1}, Ldg/E;->j()Ldg/F;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    invoke-virtual {p1}, Ldg/F;->k()Ltg/j;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Lexpo/modules/fetch/NativeResponse$b;->c:Lexpo/modules/fetch/NativeResponse;

    .line 27
    .line 28
    invoke-static {v0, p1}, Lexpo/modules/fetch/NativeResponse;->h0(Lexpo/modules/fetch/NativeResponse;Ltg/j;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lexpo/modules/fetch/NativeResponse$b;->b:Ldg/E;

    .line 32
    .line 33
    invoke-virtual {p1}, Ldg/E;->close()V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lexpo/modules/fetch/NativeResponse$b;->c:Lexpo/modules/fetch/NativeResponse;

    .line 37
    .line 38
    invoke-static {p1}, Lexpo/modules/fetch/NativeResponse;->S(Lexpo/modules/fetch/NativeResponse;)LBb/p;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    sget-object v0, LBb/p;->f:LBb/p;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    if-ne p1, v0, :cond_1

    .line 46
    .line 47
    iget-object p1, p0, Lexpo/modules/fetch/NativeResponse$b;->c:Lexpo/modules/fetch/NativeResponse;

    .line 48
    .line 49
    const-string v0, "didComplete"

    .line 50
    .line 51
    new-array v2, v1, [Ljava/lang/Object;

    .line 52
    .line 53
    invoke-virtual {p1, v0, v2}, Lexpo/modules/kotlin/sharedobjects/SharedObject;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    iget-object p1, p0, Lexpo/modules/fetch/NativeResponse$b;->c:Lexpo/modules/fetch/NativeResponse;

    .line 57
    .line 58
    sget-object v0, LBb/p;->e:LBb/p;

    .line 59
    .line 60
    invoke-static {p1, v0}, Lexpo/modules/fetch/NativeResponse;->k0(Lexpo/modules/fetch/NativeResponse;LBb/p;)V

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, Lexpo/modules/fetch/NativeResponse$b;->c:Lexpo/modules/fetch/NativeResponse;

    .line 64
    .line 65
    const-string v0, "readyForJSFinalization"

    .line 66
    .line 67
    new-array v1, v1, [Ljava/lang/Object;

    .line 68
    .line 69
    invoke-virtual {p1, v0, v1}, Lexpo/modules/kotlin/sharedobjects/SharedObject;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    sget-object p1, LTd/L;->a:LTd/L;

    .line 73
    .line 74
    return-object p1

    .line 75
    :cond_2
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 76
    .line 77
    return-object p1

    .line 78
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 79
    .line 80
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 81
    .line 82
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw p1
.end method
