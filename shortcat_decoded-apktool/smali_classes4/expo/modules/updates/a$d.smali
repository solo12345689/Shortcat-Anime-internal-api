.class final Lexpo/modules/updates/a$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/updates/a;->A()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:I

.field final synthetic d:Lexpo/modules/updates/a;


# direct methods
.method constructor <init>(Lexpo/modules/updates/a;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/updates/a$d;->d:Lexpo/modules/updates/a;

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
    new-instance p1, Lexpo/modules/updates/a$d;

    .line 2
    .line 3
    iget-object v0, p0, Lexpo/modules/updates/a$d;->d:Lexpo/modules/updates/a;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lexpo/modules/updates/a$d;-><init>(Lexpo/modules/updates/a;LZd/e;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/updates/a$d;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lexpo/modules/updates/a$d;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lexpo/modules/updates/a$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/updates/a$d;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

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
    iget v1, p0, Lexpo/modules/updates/a$d;->c:I

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
    iget-object v0, p0, Lexpo/modules/updates/a$d;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lexpo/modules/updates/a;

    .line 16
    .line 17
    iget-object v1, p0, Lexpo/modules/updates/a$d;->a:Ljava/lang/Object;

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
    iget-object p1, p0, Lexpo/modules/updates/a$d;->d:Lexpo/modules/updates/a;

    .line 37
    .line 38
    invoke-static {p1}, Lexpo/modules/updates/a;->w(Lexpo/modules/updates/a;)LPf/a;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iget-object p1, p0, Lexpo/modules/updates/a$d;->d:Lexpo/modules/updates/a;

    .line 43
    .line 44
    iput-object v1, p0, Lexpo/modules/updates/a$d;->a:Ljava/lang/Object;

    .line 45
    .line 46
    iput-object p1, p0, Lexpo/modules/updates/a$d;->b:Ljava/lang/Object;

    .line 47
    .line 48
    iput v2, p0, Lexpo/modules/updates/a$d;->c:I

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
    invoke-static {v0}, Lexpo/modules/updates/a;->v(Lexpo/modules/updates/a;)LGf/x;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-interface {p1}, LGf/C0;->j()Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-nez p1, :cond_4

    .line 67
    .line 68
    invoke-static {v0}, Lexpo/modules/updates/a;->u(Lexpo/modules/updates/a;)Lvd/b;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-eqz p1, :cond_3

    .line 73
    .line 74
    invoke-static {v0}, Lexpo/modules/updates/a;->v(Lexpo/modules/updates/a;)LGf/x;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    sget-object v0, LTd/L;->a:LTd/L;

    .line 79
    .line 80
    invoke-interface {p1, v0}, LGf/x;->O(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :catchall_0
    move-exception p1

    .line 85
    goto :goto_2

    .line 86
    :cond_3
    new-instance p1, Ljava/lang/AssertionError;

    .line 87
    .line 88
    const-string v0, "UpdatesController.notifyController was called with a null launcher, which is an error. This method should only be called when an update is ready to launch."

    .line 89
    .line 90
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    throw p1

    .line 94
    :cond_4
    :goto_1
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    .line 96
    invoke-interface {v1, v3}, LPf/a;->e(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    sget-object p1, LTd/L;->a:LTd/L;

    .line 100
    .line 101
    return-object p1

    .line 102
    :goto_2
    invoke-interface {v1, v3}, LPf/a;->e(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    throw p1
.end method
