.class final LL4/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ldg/f;
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field private final a:Ldg/e;

.field private final b:LGf/n;


# direct methods
.method public constructor <init>(Ldg/e;LGf/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LL4/k;->a:Ldg/e;

    .line 5
    .line 6
    iput-object p2, p0, LL4/k;->b:LGf/n;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    :try_start_0
    iget-object p1, p0, LL4/k;->a:Ldg/e;

    .line 2
    .line 3
    invoke-interface {p1}, Ldg/e;->cancel()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    :catchall_0
    return-void
.end method

.method public h(Ldg/e;Ldg/E;)V
    .locals 0

    .line 1
    iget-object p1, p0, LL4/k;->b:LGf/n;

    .line 2
    .line 3
    invoke-static {p2}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-interface {p1, p2}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LL4/k;->a(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LTd/L;->a:LTd/L;

    .line 7
    .line 8
    return-object p1
.end method

.method public j(Ldg/e;Ljava/io/IOException;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Ldg/e;->u1()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LL4/k;->b:LGf/n;

    .line 8
    .line 9
    sget-object v0, LTd/u;->b:LTd/u$a;

    .line 10
    .line 11
    invoke-static {p2}, LTd/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-static {p2}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-interface {p1, p2}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method
