.class final LJ3/a$a;
.super LJ3/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final b:Landroidx/privacysandbox/ads/adservices/measurement/b;


# direct methods
.method public constructor <init>(Landroidx/privacysandbox/ads/adservices/measurement/b;)V
    .locals 1

    .line 1
    const-string v0, "mMeasurementManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, LJ3/a;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LJ3/a$a;->b:Landroidx/privacysandbox/ads/adservices/measurement/b;

    .line 10
    .line 11
    return-void
.end method

.method public static final synthetic d(LJ3/a$a;)Landroidx/privacysandbox/ads/adservices/measurement/b;
    .locals 0

    .line 1
    iget-object p0, p0, LJ3/a$a;->b:Landroidx/privacysandbox/ads/adservices/measurement/b;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public b()Lcom/google/common/util/concurrent/p;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/p;"
        }
    .end annotation

    .line 1
    invoke-static {}, LGf/f0;->a()LGf/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LGf/P;->a(LZd/i;)LGf/O;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v4, LJ3/a$a$b;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {v4, p0, v0}, LJ3/a$a$b;-><init>(LJ3/a$a;LZd/e;)V

    .line 13
    .line 14
    .line 15
    const/4 v5, 0x3

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-static/range {v1 .. v6}, LGf/i;->b(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/W;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-static {v1, v0, v2, v0}, LI3/b;->c(LGf/W;Ljava/lang/Object;ILjava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0
.end method

.method public c(Landroid/net/Uri;)Lcom/google/common/util/concurrent/p;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "Lcom/google/common/util/concurrent/p;"
        }
    .end annotation

    .line 1
    const-string v0, "trigger"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LGf/f0;->a()LGf/K;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, LGf/P;->a(LZd/i;)LGf/O;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v4, LJ3/a$a$e;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {v4, p0, p1, v0}, LJ3/a$a$e;-><init>(LJ3/a$a;Landroid/net/Uri;LZd/e;)V

    .line 18
    .line 19
    .line 20
    const/4 v5, 0x3

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-static/range {v1 .. v6}, LGf/i;->b(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/W;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-static {p1, v0, v1, v0}, LI3/b;->c(LGf/W;Ljava/lang/Object;ILjava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public e(Landroidx/privacysandbox/ads/adservices/measurement/a;)Lcom/google/common/util/concurrent/p;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/privacysandbox/ads/adservices/measurement/a;",
            ")",
            "Lcom/google/common/util/concurrent/p;"
        }
    .end annotation

    .line 1
    const-string v0, "deletionRequest"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LGf/f0;->a()LGf/K;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, LGf/P;->a(LZd/i;)LGf/O;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v4, LJ3/a$a$a;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {v4, p0, p1, v0}, LJ3/a$a$a;-><init>(LJ3/a$a;Landroidx/privacysandbox/ads/adservices/measurement/a;LZd/e;)V

    .line 18
    .line 19
    .line 20
    const/4 v5, 0x3

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-static/range {v1 .. v6}, LGf/i;->b(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/W;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-static {p1, v0, v1, v0}, LI3/b;->c(LGf/W;Ljava/lang/Object;ILjava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public f(Landroid/net/Uri;Landroid/view/InputEvent;)Lcom/google/common/util/concurrent/p;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Landroid/view/InputEvent;",
            ")",
            "Lcom/google/common/util/concurrent/p;"
        }
    .end annotation

    .line 1
    const-string v0, "attributionSource"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LGf/f0;->a()LGf/K;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, LGf/P;->a(LZd/i;)LGf/O;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v4, LJ3/a$a$c;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {v4, p0, p1, p2, v0}, LJ3/a$a$c;-><init>(LJ3/a$a;Landroid/net/Uri;Landroid/view/InputEvent;LZd/e;)V

    .line 18
    .line 19
    .line 20
    const/4 v5, 0x3

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-static/range {v1 .. v6}, LGf/i;->b(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/W;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 p2, 0x1

    .line 29
    invoke-static {p1, v0, p2, v0}, LI3/b;->c(LGf/W;Ljava/lang/Object;ILjava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public g(Landroidx/privacysandbox/ads/adservices/measurement/m;)Lcom/google/common/util/concurrent/p;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/privacysandbox/ads/adservices/measurement/m;",
            ")",
            "Lcom/google/common/util/concurrent/p;"
        }
    .end annotation

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LGf/f0;->a()LGf/K;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, LGf/P;->a(LZd/i;)LGf/O;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v4, LJ3/a$a$d;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {v4, p0, p1, v0}, LJ3/a$a$d;-><init>(LJ3/a$a;Landroidx/privacysandbox/ads/adservices/measurement/m;LZd/e;)V

    .line 18
    .line 19
    .line 20
    const/4 v5, 0x3

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-static/range {v1 .. v6}, LGf/i;->b(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/W;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-static {p1, v0, v1, v0}, LI3/b;->c(LGf/W;Ljava/lang/Object;ILjava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public h(Landroidx/privacysandbox/ads/adservices/measurement/n;)Lcom/google/common/util/concurrent/p;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/privacysandbox/ads/adservices/measurement/n;",
            ")",
            "Lcom/google/common/util/concurrent/p;"
        }
    .end annotation

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LGf/f0;->a()LGf/K;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, LGf/P;->a(LZd/i;)LGf/O;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v4, LJ3/a$a$f;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {v4, p0, p1, v0}, LJ3/a$a$f;-><init>(LJ3/a$a;Landroidx/privacysandbox/ads/adservices/measurement/n;LZd/e;)V

    .line 18
    .line 19
    .line 20
    const/4 v5, 0x3

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-static/range {v1 .. v6}, LGf/i;->b(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/W;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-static {p1, v0, v1, v0}, LI3/b;->c(LGf/W;Ljava/lang/Object;ILjava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public i(Landroidx/privacysandbox/ads/adservices/measurement/o;)Lcom/google/common/util/concurrent/p;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/privacysandbox/ads/adservices/measurement/o;",
            ")",
            "Lcom/google/common/util/concurrent/p;"
        }
    .end annotation

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LGf/f0;->a()LGf/K;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, LGf/P;->a(LZd/i;)LGf/O;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v4, LJ3/a$a$g;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {v4, p0, p1, v0}, LJ3/a$a$g;-><init>(LJ3/a$a;Landroidx/privacysandbox/ads/adservices/measurement/o;LZd/e;)V

    .line 18
    .line 19
    .line 20
    const/4 v5, 0x3

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-static/range {v1 .. v6}, LGf/i;->b(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/W;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-static {p1, v0, v1, v0}, LI3/b;->c(LGf/W;Ljava/lang/Object;ILjava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method
