.class final Lpd/c$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpd/c;-><init>(Lexpo/modules/updates/db/UpdatesDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:I

.field final synthetic d:Lpd/c;


# direct methods
.method constructor <init>(Lpd/c;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lpd/c$b;->d:Lpd/c;

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
    .locals 1

    .line 1
    new-instance p1, Lpd/c$b;

    .line 2
    .line 3
    iget-object v0, p0, Lpd/c$b;->d:Lpd/c;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lpd/c$b;-><init>(Lpd/c;LZd/e;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lpd/c$b;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lpd/c$b;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lpd/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lpd/c$b;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lpd/c$b;->c:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lpd/c$b;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lpd/c;

    .line 16
    .line 17
    iget-object v1, p0, Lpd/c$b;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, LPf/a;

    .line 20
    .line 21
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lpd/c$b;->d:Lpd/c;

    .line 37
    .line 38
    invoke-static {p1}, Lpd/c;->b(Lpd/c;)LPf/a;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iget-object p1, p0, Lpd/c$b;->d:Lpd/c;

    .line 43
    .line 44
    iput-object v1, p0, Lpd/c$b;->a:Ljava/lang/Object;

    .line 45
    .line 46
    iput-object p1, p0, Lpd/c$b;->b:Ljava/lang/Object;

    .line 47
    .line 48
    iput v2, p0, Lpd/c$b;->c:I

    .line 49
    .line 50
    invoke-interface {v1, v3, p0}, LPf/a;->c(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    if-ne v2, v0, :cond_2

    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_2
    move-object v0, p1

    .line 58
    :goto_0
    :try_start_0
    invoke-static {v0}, Lpd/c;->a(Lpd/c;)Lexpo/modules/updates/db/UpdatesDatabase;

    .line 59
    .line 60
    .line 61
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    invoke-interface {v1, v3}, LPf/a;->e(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return-object p1

    .line 66
    :catchall_0
    move-exception p1

    .line 67
    invoke-interface {v1, v3}, LPf/a;->e(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    throw p1
.end method
