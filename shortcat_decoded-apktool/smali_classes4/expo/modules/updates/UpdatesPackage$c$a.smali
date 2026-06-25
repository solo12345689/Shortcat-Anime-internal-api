.class final Lexpo/modules/updates/UpdatesPackage$c$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/updates/UpdatesPackage$c;->c(Lcom/facebook/react/ReactActivity;Lcom/facebook/react/ReactHost;)Lsb/h$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lexpo/modules/updates/UpdatesPackage$c;

.field final synthetic c:Landroid/content/Context;

.field final synthetic d:Z

.field final synthetic e:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Lexpo/modules/updates/UpdatesPackage$c;Landroid/content/Context;ZLjava/lang/Runnable;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/updates/UpdatesPackage$c$a;->b:Lexpo/modules/updates/UpdatesPackage$c;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/updates/UpdatesPackage$c$a;->c:Landroid/content/Context;

    .line 4
    .line 5
    iput-boolean p3, p0, Lexpo/modules/updates/UpdatesPackage$c$a;->d:Z

    .line 6
    .line 7
    iput-object p4, p0, Lexpo/modules/updates/UpdatesPackage$c$a;->e:Ljava/lang/Runnable;

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
    new-instance v0, Lexpo/modules/updates/UpdatesPackage$c$a;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/updates/UpdatesPackage$c$a;->b:Lexpo/modules/updates/UpdatesPackage$c;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/updates/UpdatesPackage$c$a;->c:Landroid/content/Context;

    .line 6
    .line 7
    iget-boolean v3, p0, Lexpo/modules/updates/UpdatesPackage$c$a;->d:Z

    .line 8
    .line 9
    iget-object v4, p0, Lexpo/modules/updates/UpdatesPackage$c$a;->e:Ljava/lang/Runnable;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lexpo/modules/updates/UpdatesPackage$c$a;-><init>(Lexpo/modules/updates/UpdatesPackage$c;Landroid/content/Context;ZLjava/lang/Runnable;LZd/e;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/updates/UpdatesPackage$c$a;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lexpo/modules/updates/UpdatesPackage$c$a;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lexpo/modules/updates/UpdatesPackage$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/updates/UpdatesPackage$c$a;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

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
    iget v1, p0, Lexpo/modules/updates/UpdatesPackage$c$a;->a:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lexpo/modules/updates/UpdatesPackage$c$a;->b:Lexpo/modules/updates/UpdatesPackage$c;

    .line 35
    .line 36
    iget-object v1, p0, Lexpo/modules/updates/UpdatesPackage$c$a;->c:Landroid/content/Context;

    .line 37
    .line 38
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-boolean v4, p0, Lexpo/modules/updates/UpdatesPackage$c$a;->d:Z

    .line 42
    .line 43
    iput v3, p0, Lexpo/modules/updates/UpdatesPackage$c$a;->a:I

    .line 44
    .line 45
    invoke-static {p1, v1, v4, p0}, Lexpo/modules/updates/UpdatesPackage$c;->g(Lexpo/modules/updates/UpdatesPackage$c;Landroid/content/Context;ZLZd/e;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-ne p1, v0, :cond_3

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    :goto_0
    iget-object p1, p0, Lexpo/modules/updates/UpdatesPackage$c$a;->b:Lexpo/modules/updates/UpdatesPackage$c;

    .line 53
    .line 54
    iget-object v1, p0, Lexpo/modules/updates/UpdatesPackage$c$a;->e:Ljava/lang/Runnable;

    .line 55
    .line 56
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iput v2, p0, Lexpo/modules/updates/UpdatesPackage$c$a;->a:I

    .line 60
    .line 61
    invoke-static {p1, v1, p0}, Lexpo/modules/updates/UpdatesPackage$c;->f(Lexpo/modules/updates/UpdatesPackage$c;Ljava/lang/Runnable;LZd/e;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-ne p1, v0, :cond_4

    .line 66
    .line 67
    :goto_1
    return-object v0

    .line 68
    :cond_4
    :goto_2
    sget-object p1, LTd/L;->a:LTd/L;

    .line 69
    .line 70
    return-object p1
.end method
