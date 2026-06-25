.class public final LWb/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LWb/c;
.implements LVb/a;


# instance fields
.field private final a:LWb/i;

.field private final b:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final c:LVb/d;


# direct methods
.method public constructor <init>(Lic/b;)V
    .locals 6

    .line 1
    const-string v0, "currentActivityProvider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, LWb/i;

    .line 10
    .line 11
    invoke-direct {v0, p1}, LWb/i;-><init>(Lic/b;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, LWb/a;->a:LWb/i;

    .line 15
    .line 16
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, LWb/a;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 22
    .line 23
    new-instance p1, LVb/d;

    .line 24
    .line 25
    invoke-direct {p1}, LVb/d;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, LWb/a;->c:LVb/d;

    .line 29
    .line 30
    sget-object v0, LGf/v0;->a:LGf/v0;

    .line 31
    .line 32
    new-instance v3, LWb/a$a;

    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    invoke-direct {v3, p0, p1}, LWb/a$a;-><init>(LWb/a;LZd/e;)V

    .line 36
    .line 37
    .line 38
    const/4 v4, 0x3

    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v1, 0x0

    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-static/range {v0 .. v5}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public static final synthetic d(LWb/a;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 1
    iget-object p0, p0, LWb/a;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic e(LWb/a;)LWb/i;
    .locals 0

    .line 1
    iget-object p0, p0, LWb/a;->a:LWb/i;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a(LVb/e;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LWb/a;->c:LVb/d;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LVb/d;->a(LVb/e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public b(LVb/e;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LWb/a;->c:LVb/d;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LVb/d;->b(LVb/e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public c(LWb/d;LWb/e;LZd/e;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v1, LGf/p;

    .line 2
    .line 3
    invoke-static {p3}, Lae/b;->c(LZd/e;)LZd/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, v0, v2}, LGf/p;-><init>(LZd/e;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, LGf/p;->C()V

    .line 12
    .line 13
    .line 14
    new-instance v0, LWb/a$b;

    .line 15
    .line 16
    move-object v3, p0

    .line 17
    move-object v2, p0

    .line 18
    move-object v4, p1

    .line 19
    move-object v5, p2

    .line 20
    invoke-direct/range {v0 .. v5}, LWb/a$b;-><init>(LGf/n;LVb/a;LWb/a;LWb/d;LWb/e;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p0, v0}, LVb/a;->a(LVb/e;)V

    .line 24
    .line 25
    .line 26
    new-instance p1, LWb/a$c;

    .line 27
    .line 28
    invoke-direct {p1, p0, v0}, LWb/a$c;-><init>(LVb/a;LWb/a$b;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v1, p1}, LGf/n;->p(Lkotlin/jvm/functions/Function1;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, LGf/p;->v()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    if-ne p1, p2, :cond_0

    .line 43
    .line 44
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-object p1
.end method

.method public final f(IILandroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object v0, p0, LWb/a;->a:LWb/i;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, LWb/i;->g(IILandroid/content/Intent;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final g(Landroidx/appcompat/app/c;)V
    .locals 1

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LWb/a;->a:LWb/i;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LWb/i;->m(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final h(Landroidx/appcompat/app/c;)V
    .locals 1

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LWb/a;->c:LVb/d;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LVb/d;->f(Landroidx/appcompat/app/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
